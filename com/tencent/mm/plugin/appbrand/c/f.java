package com.tencent.mm.plugin.appbrand.c;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.protocal.c.bjd;
import com.tencent.mm.protocal.c.bsc;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class f
  extends j
{
  public static final String[] iAV;
  public final g iCj;
  public final c iEL;
  public volatile int iEM;
  
  static
  {
    GMTrace.i(10020292919296L, 74657);
    iAV = new String[] { i.a(a.iBQ, "AppBrandStarApp") };
    GMTrace.o(10020292919296L, 74657);
  }
  
  public f(g paramg)
  {
    GMTrace.i(10019487612928L, 74651);
    this.iEM = 10;
    this.iCj = paramg;
    this.iEL = new c(paramg);
    GMTrace.o(10019487612928L, 74651);
  }
  
  public final boolean Z(String paramString, int paramInt)
  {
    Object localObject = null;
    GMTrace.i(10019756048384L, 74653);
    if (bg.mZ(paramString)) {}
    for (paramString = (String)localObject; paramString == null; paramString = this.iCj.query("AppBrandStarApp", null, String.format(Locale.US, "%s=? and %s=?", new Object[] { "username", "versionType" }), new String[] { paramString, String.valueOf(paramInt) }, null, null, null))
    {
      GMTrace.o(10019756048384L, 74653);
      return false;
    }
    boolean bool = paramString.moveToFirst();
    paramString.close();
    GMTrace.o(10019756048384L, 74653);
    return bool;
  }
  
  public final void c(j.a parama)
  {
    GMTrace.i(18848061325312L, 140429);
    a(parama, d.xC().nTP.getLooper());
    GMTrace.o(18848061325312L, 140429);
  }
  
  public final boolean h(final String paramString, final int paramInt, boolean paramBoolean)
  {
    GMTrace.i(10019890266112L, 74654);
    if (bg.mZ(paramString))
    {
      GMTrace.o(10019890266112L, 74654);
      return false;
    }
    final a locala = new a();
    locala.field_username = paramString;
    locala.field_versionType = paramInt;
    boolean bool = false;
    if (this.iEL.b(locala, new String[] { "versionType", "username" }))
    {
      this.iEL.b(locala, false, a.iAT);
      if (!Z(paramString, paramInt)) {
        a("single", 5, locala);
      }
    }
    else
    {
      bool = true;
    }
    if ((bool) && (paramBoolean))
    {
      m localm = new m(1003, false, paramInt, 1, 2, paramString, 1, null);
      localm.iFj = new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(10023514144768L, 74681);
          if (((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (((bjd)paramAnonymousb.hlV.hmc).tHK.lpk != 0)) && (f.this.iCj.isOpen()))
          {
            f.this.iEL.a(locala, false);
            if (f.this.Z(paramString, paramInt)) {
              f.this.a("single", 2, locala);
            }
          }
          GMTrace.o(10023514144768L, 74681);
          return 0;
        }
      };
      localm.Dy();
    }
    GMTrace.o(10019890266112L, 74654);
    return bool;
  }
  
  public final b<ArrayList> hS(int paramInt)
  {
    Object localObject1 = null;
    GMTrace.i(16371207372800L, 121975);
    int i = paramInt;
    if (paramInt == 0) {
      i = b.iER;
    }
    Object localObject2 = this.iCj;
    Object localObject3 = String.format(Locale.US, "%s desc limit %d offset 0", new Object[] { "updateTime", Integer.valueOf(this.iEM) });
    localObject2 = ((g)localObject2).query("AppBrandStarApp", new String[] { "username", "versionType" }, null, null, null, null, (String)localObject3);
    if (localObject2 == null)
    {
      GMTrace.o(16371207372800L, 121975);
      return null;
    }
    if (b.iES == i) {
      if (((Cursor)localObject2).moveToLast())
      {
        localObject3 = new LinkedList();
        localObject1 = new a();
        label133:
        do
        {
          ((a)localObject1).b((Cursor)localObject2);
          ((List)localObject3).add(p.a(String.format(Locale.US, "$%s$%d@starapp", new Object[] { ((a)localObject1).field_username, Integer.valueOf(((a)localObject1).field_versionType) }), ((a)localObject1).field_username, ((a)localObject1).field_versionType, -1L));
          if (b.iES != i) {
            break;
          }
        } while (((Cursor)localObject2).moveToPrevious());
      }
    }
    for (;;)
    {
      localObject1 = new ArrayList(((List)localObject3).size());
      ((ArrayList)localObject1).addAll((Collection)localObject3);
      do
      {
        ((Cursor)localObject2).close();
        GMTrace.o(16371207372800L, 121975);
        return (b<ArrayList>)localObject1;
      } while (!((Cursor)localObject2).moveToFirst());
      break;
      if (((Cursor)localObject2).moveToNext()) {
        break label133;
      }
    }
  }
  
  public static final class a
    extends com.tencent.mm.g.b.k
  {
    static final String[] iAT;
    static final c.a iBQ;
    
    static
    {
      int i = 0;
      GMTrace.i(10017071693824L, 74633);
      iAT = new String[] { "username", "versionType" };
      Object localObject1 = new c.a();
      ((c.a)localObject1).hRR = new Field[3];
      ((c.a)localObject1).columns = new String[4];
      Object localObject2 = new StringBuilder();
      ((c.a)localObject1).columns[0] = "username";
      ((c.a)localObject1).uQH.put("username", "TEXT");
      ((StringBuilder)localObject2).append(" username TEXT");
      ((StringBuilder)localObject2).append(", ");
      ((c.a)localObject1).columns[1] = "versionType";
      ((c.a)localObject1).uQH.put("versionType", "INTEGER");
      ((StringBuilder)localObject2).append(" versionType INTEGER");
      ((StringBuilder)localObject2).append(", ");
      ((c.a)localObject1).columns[2] = "updateTime";
      ((c.a)localObject1).uQH.put("updateTime", "LONG");
      ((StringBuilder)localObject2).append(" updateTime LONG");
      ((c.a)localObject1).columns[3] = "rowid";
      ((c.a)localObject1).uQI = ((StringBuilder)localObject2).toString();
      iBQ = (c.a)localObject1;
      localObject1 = " PRIMARY KEY ( ";
      localObject2 = iAT;
      int j = localObject2.length;
      while (i < j)
      {
        localObject3 = localObject2[i];
        localObject1 = (String)localObject1 + ", " + (String)localObject3;
        i += 1;
      }
      localObject1 = ((String)localObject1).replaceFirst(",", "");
      localObject1 = (String)localObject1 + " )";
      localObject2 = new StringBuilder();
      Object localObject3 = iBQ;
      ((c.a)localObject3).uQI = (((c.a)localObject3).uQI + "," + (String)localObject1);
      GMTrace.o(10017071693824L, 74633);
    }
    
    public a()
    {
      GMTrace.i(10016803258368L, 74631);
      GMTrace.o(10016803258368L, 74631);
    }
    
    protected final c.a uC()
    {
      GMTrace.i(10016937476096L, 74632);
      c.a locala = iBQ;
      GMTrace.o(10016937476096L, 74632);
      return locala;
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(16370536284160L, 121970);
      iER = 1;
      iES = 2;
      iET = new int[] { iER, iES };
      GMTrace.o(16370536284160L, 121970);
    }
  }
  
  private static final class c
    extends i<f.a>
  {
    c(g paramg)
    {
      super(f.a.iBQ, "AppBrandStarApp", f.a.fSf);
      GMTrace.i(10023245709312L, 74679);
      GMTrace.o(10023245709312L, 74679);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */