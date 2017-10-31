package com.tencent.mm.plugin.walletlock.gesture.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class g
{
  public long sfu;
  public long sfv;
  
  public g()
  {
    GMTrace.i(20241643995136L, 150812);
    this.sfu = -1L;
    this.sfv = 0L;
    GMTrace.o(20241643995136L, 150812);
  }
  
  public final g aP(byte[] paramArrayOfByte)
  {
    GMTrace.i(20241912430592L, 150814);
    paramArrayOfByte = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    try
    {
      this.sfu = paramArrayOfByte.readLong();
      this.sfv = paramArrayOfByte.readLong();
      paramArrayOfByte.close();
      GMTrace.o(20241912430592L, 150814);
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TimeInfo", paramArrayOfByte, "", new Object[0]);
      }
    }
  }
  
  public final byte[] toByteArray()
  {
    GMTrace.i(20241778212864L, 150813);
    Object localObject = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream((OutputStream)localObject);
    try
    {
      localDataOutputStream.writeLong(this.sfu);
      localDataOutputStream.writeLong(this.sfv);
      localDataOutputStream.close();
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      GMTrace.o(20241778212864L, 150813);
      return (byte[])localObject;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TimeInfo", localIOException, "", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */