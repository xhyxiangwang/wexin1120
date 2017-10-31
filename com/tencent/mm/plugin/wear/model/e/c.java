package com.tencent.mm.plugin.wear.model.e;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.protocal.c.bpq;
import com.tencent.mm.protocal.c.bpw;
import com.tencent.mm.protocal.c.bpx;
import com.tencent.mm.protocal.c.bqt;
import com.tencent.mm.protocal.c.bqu;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends a
{
  public c()
  {
    GMTrace.i(9203175391232L, 68569);
    GMTrace.o(9203175391232L, 68569);
  }
  
  public final List<Integer> bzC()
  {
    GMTrace.i(9203309608960L, 68570);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11008));
    localArrayList.add(Integer.valueOf(11009));
    GMTrace.o(9203309608960L, 68570);
    return localArrayList;
  }
  
  protected final byte[] l(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 5;
    GMTrace.i(9203443826688L, 68571);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    bpq localbpq;
    if (paramInt == 11008)
    {
      com.tencent.mm.plugin.wear.model.c.a.wQ(6);
      localObject1 = new bqt();
      for (;;)
      {
        try
        {
          ((bqt)localObject1).aC(paramArrayOfByte);
          paramArrayOfByte = new LinkedList();
          paramArrayOfByte.addAll(s.cdJ());
          paramArrayOfByte.addAll(s.cdK());
          ap.AS();
          paramArrayOfByte = com.tencent.mm.x.c.yQ().k(paramArrayOfByte, ((bqt)localObject1).tBI);
          if (((bqt)localObject1).tBI == 0)
          {
            paramInt = i;
            localObject2 = new bqu();
            ((bqu)localObject2).tBI = ((bqt)localObject1).tBI;
            if ((paramArrayOfByte != null) && (paramArrayOfByte.moveToNext()))
            {
              localObject3 = paramArrayOfByte.getString(paramArrayOfByte.getColumnIndex("username"));
              ap.AS();
              localObject3 = com.tencent.mm.x.c.yL().SL((String)localObject3);
              ((bqu)localObject2).tBI += 1;
              if ((((x)localObject3).bPH()) || (((x)localObject3).vf())) {
                continue;
              }
              localbpq = new bpq();
              localbpq.jYc = n.c((x)localObject3);
              localbpq.jWW = ((af)localObject3).field_username;
              ((bqu)localObject2).tVi.add(localbpq);
              if (((bqu)localObject2).tVi.size() < paramInt) {
                continue;
              }
              ((bqu)localObject2).uFC = paramArrayOfByte.moveToNext();
            }
            w.d("MicroMsg.Wear.HttpContactServer", "request offset: %d | return offset: %d | return size: %d", new Object[] { Integer.valueOf(((bqt)localObject1).tBI), Integer.valueOf(((bqu)localObject2).tBI), Integer.valueOf(((bqu)localObject2).tVi.size()) });
            if (paramArrayOfByte != null) {
              paramArrayOfByte.close();
            }
          }
          paramInt = 20;
        }
        catch (IOException paramArrayOfByte)
        {
          try
          {
            paramArrayOfByte = ((bqu)localObject2).toByteArray();
            GMTrace.o(9203443826688L, 68571);
            return paramArrayOfByte;
          }
          catch (IOException paramArrayOfByte)
          {
            GMTrace.o(9203443826688L, 68571);
            return null;
          }
          paramArrayOfByte = paramArrayOfByte;
          w.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
          GMTrace.o(9203443826688L, 68571);
          return null;
        }
      }
    }
    if (paramInt == 11009)
    {
      com.tencent.mm.plugin.wear.model.c.a.wQ(7);
      localObject1 = new bpw();
      do
      {
        try
        {
          ((bpw)localObject1).aC(paramArrayOfByte);
          paramArrayOfByte = new bpx();
          ap.AS();
          localObject2 = com.tencent.mm.x.c.yL().cl(null);
          paramInt = ((bpw)localObject1).tBI;
          for (;;)
          {
            if ((localObject2 == null) || (!((Cursor)localObject2).moveToNext())) {
              break label552;
            }
            if (paramInt <= 0) {
              break;
            }
            paramInt -= 1;
          }
          localObject3 = ((Cursor)localObject2).getString(0);
        }
        catch (IOException paramArrayOfByte)
        {
          w.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
          GMTrace.o(9203443826688L, 68571);
          return null;
        }
        ap.AS();
        localObject3 = com.tencent.mm.x.c.yL().SL((String)localObject3);
        localbpq = new bpq();
        localbpq.jYc = n.c((x)localObject3);
        localbpq.jWW = ((af)localObject3).field_username;
        paramArrayOfByte.tVi.add(localbpq);
      } while (paramArrayOfByte.tVi.size() < 5);
      paramArrayOfByte.uFC = ((Cursor)localObject2).moveToNext();
      label552:
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      paramArrayOfByte.tBI = (((bpw)localObject1).tBI + paramArrayOfByte.tVi.size());
      try
      {
        paramArrayOfByte = paramArrayOfByte.toByteArray();
        GMTrace.o(9203443826688L, 68571);
        return paramArrayOfByte;
      }
      catch (IOException paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.Wear.HttpContactServer", paramArrayOfByte, "", new Object[0]);
        GMTrace.o(9203443826688L, 68571);
        return null;
      }
    }
    GMTrace.o(9203443826688L, 68571);
    return null;
  }
  
  protected final boolean wR(int paramInt)
  {
    GMTrace.i(9203712262144L, 68573);
    if (paramInt == 11008)
    {
      GMTrace.o(9203712262144L, 68573);
      return true;
    }
    if (paramInt == 11009)
    {
      GMTrace.o(9203712262144L, 68573);
      return true;
    }
    boolean bool = super.wR(paramInt);
    GMTrace.o(9203712262144L, 68573);
    return bool;
  }
  
  protected final boolean wS(int paramInt)
  {
    GMTrace.i(9203578044416L, 68572);
    if (paramInt == 11008)
    {
      GMTrace.o(9203578044416L, 68572);
      return true;
    }
    if (paramInt == 11009)
    {
      GMTrace.o(9203578044416L, 68572);
      return true;
    }
    boolean bool = super.wS(paramInt);
    GMTrace.o(9203578044416L, 68572);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */