package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public abstract class a
{
  public a()
  {
    GMTrace.i(9205993963520L, 68590);
    GMTrace.o(9205993963520L, 68590);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, final byte[] paramArrayOfByte)
  {
    GMTrace.i(9206262398976L, 68592);
    Object localObject = paramArrayOfByte;
    if (wS(paramInt3))
    {
      localObject = paramArrayOfByte;
      if (paramArrayOfByte != null)
      {
        paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.bzo().shh.aR(paramArrayOfByte);
        localObject = paramArrayOfByte;
        if (paramArrayOfByte == null)
        {
          w.e("MicroMsg.Wear.BaseHttpServer", "request data decrypt error");
          GMTrace.o(9206262398976L, 68592);
          return;
        }
      }
    }
    localObject = l(paramInt3, (byte[])localObject);
    if (!bzD())
    {
      GMTrace.o(9206262398976L, 68592);
      return;
    }
    paramArrayOfByte = (byte[])localObject;
    if (wR(paramInt3)) {
      paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.bzo().shh.aS((byte[])localObject);
    }
    localObject = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream((OutputStream)localObject);
    for (;;)
    {
      try
      {
        localDataOutputStream.writeInt(paramInt1);
        localDataOutputStream.writeInt(paramInt2);
        localDataOutputStream.writeInt(paramInt3);
        if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
        {
          localDataOutputStream.writeInt(paramArrayOfByte.length);
          localDataOutputStream.write(paramArrayOfByte);
          paramArrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
          w.i("MicroMsg.Wear.BaseHttpServer", "send data funId=%d length=%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramArrayOfByte.length) });
          if (wT(paramInt3)) {
            break;
          }
          com.tencent.mm.plugin.wear.model.a.bzo().shh.aQ(paramArrayOfByte);
          GMTrace.o(9206262398976L, 68592);
          return;
        }
      }
      catch (IOException paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.Wear.BaseHttpServer", paramArrayOfByte, "gen response data error connectType=%d, sessionId=%d, funId=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
        GMTrace.o(9206262398976L, 68592);
        return;
      }
      localDataOutputStream.writeInt(0);
    }
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9205859745792L, 68589);
        com.tencent.mm.plugin.wear.model.a.bzo().shh.aQ(paramArrayOfByte);
        GMTrace.o(9205859745792L, 68589);
      }
    }, "WearSendResponseTask");
    GMTrace.o(9206262398976L, 68592);
  }
  
  public abstract List<Integer> bzC();
  
  public boolean bzD()
  {
    GMTrace.i(18826586488832L, 140269);
    GMTrace.o(18826586488832L, 140269);
    return true;
  }
  
  protected abstract byte[] l(int paramInt, byte[] paramArrayOfByte);
  
  protected boolean wR(int paramInt)
  {
    GMTrace.i(9206530834432L, 68594);
    GMTrace.o(9206530834432L, 68594);
    return false;
  }
  
  protected boolean wS(int paramInt)
  {
    GMTrace.i(9206665052160L, 68595);
    GMTrace.o(9206665052160L, 68595);
    return false;
  }
  
  public boolean wT(int paramInt)
  {
    GMTrace.i(9206799269888L, 68596);
    GMTrace.o(9206799269888L, 68596);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */