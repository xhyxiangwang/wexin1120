package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.protocal.c.bqn;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.o;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class k
  extends a
{
  public k()
  {
    GMTrace.i(9205322874880L, 68585);
    GMTrace.o(9205322874880L, 68585);
  }
  
  public final List<Integer> bzC()
  {
    GMTrace.i(9205457092608L, 68586);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11011));
    localArrayList.add(Integer.valueOf(11010));
    GMTrace.o(9205457092608L, 68586);
    return localArrayList;
  }
  
  protected final byte[] l(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(9205591310336L, 68587);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(9205591310336L, 68587);
      return null;
      Object localObject = new bqn();
      try
      {
        ((bqn)localObject).aC(paramArrayOfByte);
        com.tencent.mm.plugin.wear.model.a.bzo().shj.cg(((bqn)localObject).uFL, ((bqn)localObject).uFX);
        GMTrace.o(9205591310336L, 68587);
        return null;
        try
        {
          paramArrayOfByte = new String(paramArrayOfByte, "utf8");
          ap.AS();
          localObject = c.yL().SL(paramArrayOfByte);
          if (o.dW(paramArrayOfByte))
          {
            ap.AS();
            localObject = c.yL().SL(paramArrayOfByte);
            ((x)localObject).ds(0);
            ap.AS();
            c.yL().a(paramArrayOfByte, (x)localObject);
            ap.AS();
            c.yK().b(new com.tencent.mm.au.k(paramArrayOfByte, 0));
            com.tencent.mm.plugin.wear.model.c.a.dB(4, 0);
          }
        }
        catch (UnsupportedEncodingException paramArrayOfByte)
        {
          for (;;)
          {
            paramArrayOfByte = "";
            continue;
            o.n((x)localObject);
          }
        }
      }
      catch (IOException paramArrayOfByte)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */