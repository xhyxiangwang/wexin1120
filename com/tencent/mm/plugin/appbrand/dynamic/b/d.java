package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.plugin.appbrand.appcache.c.a;
import com.tencent.mm.plugin.appbrand.appcache.g.a;
import com.tencent.mm.plugin.appbrand.appcache.g.b;
import com.tencent.mm.plugin.appbrand.appcache.p;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.appcache.x;
import com.tencent.mm.pluginsdk.j.a.d.l;
import java.util.ArrayList;

public final class d
  implements g.b
{
  public d()
  {
    GMTrace.i(19915092262912L, 148379);
    GMTrace.o(19915092262912L, 148379);
  }
  
  public final g.a a(p paramp)
  {
    GMTrace.i(19915226480640L, 148380);
    if (x.class == paramp.getClass())
    {
      paramp = new a(paramp);
      GMTrace.o(19915226480640L, 148380);
      return paramp;
    }
    GMTrace.o(19915226480640L, 148380);
    return null;
  }
  
  private static final class a
    implements g.a
  {
    private final p iAH;
    private ArrayList<IDKey> iAJ;
    private long iAK;
    private long iAL;
    private int iKW;
    
    public a(p paramp)
    {
      GMTrace.i(19912676343808L, 148361);
      this.iAK = 0L;
      this.iAL = 0L;
      this.iAH = paramp;
      GMTrace.o(19912676343808L, 148361);
    }
    
    private void Su()
    {
      GMTrace.i(19912944779264L, 148363);
      try
      {
        com.tencent.mm.plugin.report.d.oZR.b(this.iAJ, false);
        this.iAJ.clear();
        GMTrace.o(19912944779264L, 148363);
        return;
      }
      catch (Exception localException)
      {
        GMTrace.o(19912944779264L, 148363);
      }
    }
    
    private void ie(int paramInt)
    {
      GMTrace.i(19912810561536L, 148362);
      if (this.iAJ == null) {
        this.iAJ = new ArrayList();
      }
      this.iAJ.add(new IDKey(640, paramInt, 1));
      GMTrace.o(19912810561536L, 148362);
    }
    
    public final void Sp()
    {
      GMTrace.i(19913078996992L, 148364);
      int i;
      if (c.a.hK(this.iAH.fBH)) {
        if (((a)h.h(a.class)).RT() == null)
        {
          i = 1;
          if (i <= 1) {
            break label141;
          }
          i = a.iKY;
          label48:
          this.iKW = i;
          label53:
          switch (d.1.iKV[(this.iKW - 1)])
          {
          default: 
            i = 0;
          }
        }
      }
      for (;;)
      {
        ie(i);
        this.iAK = SystemClock.elapsedRealtime();
        GMTrace.o(19913078996992L, 148364);
        return;
        i = ((a)h.h(a.class)).RT().U(this.iAH.appId, this.iAH.fBH);
        break;
        label141:
        i = a.iKX;
        break label48;
        this.iKW = a.iKX;
        break label53;
        i = 1;
        continue;
        i = 10;
      }
    }
    
    public final void Sq()
    {
      GMTrace.i(19913213214720L, 148365);
      ie(31);
      GMTrace.o(19913213214720L, 148365);
    }
    
    public final void Sr()
    {
      GMTrace.i(19913481650176L, 148367);
      GMTrace.o(19913481650176L, 148367);
    }
    
    public final void Ss()
    {
      GMTrace.i(19913750085632L, 148369);
      GMTrace.o(19913750085632L, 148369);
    }
    
    public final void St()
    {
      GMTrace.i(19913884303360L, 148370);
      this.iAL = SystemClock.elapsedRealtime();
      switch (d.1.iKV[(this.iKW - 1)])
      {
      }
      for (;;)
      {
        GMTrace.o(19913884303360L, 148370);
        return;
        ie(5);
        GMTrace.o(19913884303360L, 148370);
        return;
        ie(14);
      }
    }
    
    public final void a(l paraml)
    {
      int k = 1;
      int j = 2;
      GMTrace.i(19913347432448L, 148366);
      long l = SystemClock.elapsedRealtime() - this.iAK;
      if (l <= 1000L)
      {
        i = 0;
        label34:
        com.tencent.mm.plugin.report.d.oZR.a(665L, i, 1L, false);
        if ((paraml == null) || (paraml.status != 2)) {
          break label170;
        }
      }
      label170:
      for (int i = k;; i = 0) {
        switch (d.1.iKV[(this.iKW - 1)])
        {
        default: 
          Su();
          GMTrace.o(19913347432448L, 148366);
          return;
          if (l <= 2000L)
          {
            i = 1;
            break label34;
          }
          if (l <= 3000L)
          {
            i = 2;
            break label34;
          }
          if (l <= 4000L)
          {
            i = 3;
            break label34;
          }
          if (l <= 5000L)
          {
            i = 4;
            break label34;
          }
          i = 5;
          break label34;
        }
      }
      if (i != 0) {}
      for (i = j;; i = 3)
      {
        ie(i);
        break;
      }
      if (i != 0) {}
      for (i = 11;; i = 12)
      {
        ie(i);
        break;
      }
    }
    
    public final void bT(boolean paramBoolean)
    {
      GMTrace.i(19914018521088L, 148371);
      SystemClock.elapsedRealtime();
      int i;
      switch (d.1.iKV[(this.iKW - 1)])
      {
      default: 
        i = 0;
      }
      for (;;)
      {
        ie(i);
        Su();
        GMTrace.o(19914018521088L, 148371);
        return;
        if (paramBoolean)
        {
          i = 6;
        }
        else
        {
          i = 7;
          continue;
          if (paramBoolean) {
            i = 15;
          } else {
            i = 16;
          }
        }
      }
    }
    
    public final void hL(int paramInt)
    {
      GMTrace.i(19913615867904L, 148368);
      GMTrace.o(19913615867904L, 148368);
    }
    
    private static enum a
    {
      static
      {
        GMTrace.i(19911871037440L, 148355);
        iKX = 1;
        iKY = 2;
        iKZ = new int[] { iKX, iKY };
        GMTrace.o(19911871037440L, 148355);
      }
      
      public static int[] UE()
      {
        GMTrace.i(19911736819712L, 148354);
        int[] arrayOfInt = (int[])iKZ.clone();
        GMTrace.o(19911736819712L, 148354);
        return arrayOfInt;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */