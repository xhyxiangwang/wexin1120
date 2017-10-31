package com.tencent.mm.plugin.appbrand.f;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.a.b
{
  public k gLW;
  public c iOd;
  private j.a iOe;
  
  public b()
  {
    GMTrace.i(16544214024192L, 123264);
    this.iOe = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(16546764161024L, 123283);
        w.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp storage change: event=%s | eventData=%s", new Object[] { paramAnonymousString, paramAnonymousl });
        switch (paramAnonymousl.uQU)
        {
        }
        for (;;)
        {
          GMTrace.o(16546764161024L, 123283);
          return;
          if ("batch".equals(paramAnonymousString))
          {
            if ((paramAnonymousl.obj != null) && ((paramAnonymousl.obj instanceof List)))
            {
              paramAnonymousString = ((List)paramAnonymousl.obj).iterator();
              while (paramAnonymousString.hasNext())
              {
                paramAnonymousl = (String)paramAnonymousString.next();
                b.this.gLW.a(65616, new b.b(b.this, paramAnonymousl));
              }
              GMTrace.o(16546764161024L, 123283);
            }
          }
          else
          {
            b.this.gLW.a(65616, new b.b(b.this, paramAnonymousl.obj.toString()));
            GMTrace.o(16546764161024L, 123283);
            return;
            if ("batch".equals(paramAnonymousString))
            {
              if ((paramAnonymousl.obj != null) && ((paramAnonymousl.obj instanceof List)))
              {
                paramAnonymousString = ((List)paramAnonymousl.obj).iterator();
                while (paramAnonymousString.hasNext())
                {
                  paramAnonymousl = (String)paramAnonymousString.next();
                  b.this.gLW.a(65616, new b.a(b.this, paramAnonymousl));
                }
                GMTrace.o(16546764161024L, 123283);
              }
            }
            else {
              b.this.gLW.a(65616, new b.a(b.this, paramAnonymousl.obj.toString()));
            }
          }
        }
      }
    };
    GMTrace.o(16544214024192L, 123264);
  }
  
  public final a a(f paramf)
  {
    GMTrace.i(18200192352256L, 135602);
    paramf = new c(paramf);
    paramf = this.gLW.a(-65536, paramf);
    GMTrace.o(18200192352256L, 135602);
    return paramf;
  }
  
  public final String getName()
  {
    GMTrace.i(16544750895104L, 123268);
    GMTrace.o(16544750895104L, 123268);
    return "FTS5SearchWeAppLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(16544482459648L, 123266);
    if (!((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Fail!");
      GMTrace.o(16544482459648L, 123266);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Success!");
    this.iOd = ((c)((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSIndexStorage(512));
    this.gLW = ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSTaskDaemon();
    this.gLW.a(65616, new d());
    i.onCreate();
    i.d(this.iOe);
    GMTrace.o(16544482459648L, 123266);
    return true;
  }
  
  protected final boolean vy()
  {
    GMTrace.i(16544616677376L, 123267);
    i.onDestroy();
    i.e(this.iOe);
    this.iOd = null;
    this.gLW = null;
    GMTrace.o(16544616677376L, 123267);
    return true;
  }
  
  final class a
    extends a
  {
    private String id;
    
    public a(String paramString)
    {
      GMTrace.i(16544885112832L, 123269);
      this.id = paramString;
      GMTrace.o(16544885112832L, 123269);
    }
    
    public final boolean execute()
    {
      GMTrace.i(16545019330560L, 123270);
      w.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "delete we app info id=%s", new Object[] { this.id });
      b.this.iOd.a(com.tencent.mm.plugin.fts.a.c.mjC, this.id);
      GMTrace.o(16545019330560L, 123270);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(16545153548288L, 123271);
      String str = String.format("DeleteWeApp [%s]", new Object[] { this.id });
      GMTrace.o(16545153548288L, 123271);
      return str;
    }
  }
  
  final class b
    extends a
  {
    private String id;
    private String name;
    
    public b(String paramString)
    {
      GMTrace.i(16546227290112L, 123279);
      this.id = paramString;
      GMTrace.o(16546227290112L, 123279);
    }
    
    public final boolean execute()
    {
      GMTrace.i(16546361507840L, 123280);
      b.this.iOd.beginTransaction();
      b.this.iOd.a(com.tencent.mm.plugin.fts.a.c.mjC, this.id);
      com.tencent.mm.plugin.appbrand.c.e locale = i.pK(this.id);
      if (locale != null)
      {
        long l = System.currentTimeMillis();
        String str = bg.mY(locale.gKm);
        int i = str.hashCode();
        b.this.iOd.a(393216, 1, i, str, l, locale.appName);
        b.this.iOd.a(393216, 2, i, str, l, com.tencent.mm.platformtools.c.mO(locale.appName));
        b.this.iOd.a(393216, 3, i, str, l, com.tencent.mm.platformtools.c.mP(locale.appName));
        this.name = locale.appName;
        w.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "inserted we app info id = %s", new Object[] { str });
      }
      b.this.iOd.commit();
      GMTrace.o(16546361507840L, 123280);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(16546495725568L, 123281);
      if (this.name == null) {}
      for (String str = "(skipped)";; str = this.name)
      {
        str = String.format("InsertWeApp [%s, %s]", new Object[] { str, this.id });
        GMTrace.o(16546495725568L, 123281);
        return str;
      }
    }
  }
  
  final class c
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    c(f paramf)
    {
      super();
      GMTrace.i(18199655481344L, 135598);
      GMTrace.o(18199655481344L, 135598);
    }
    
    protected final List<com.tencent.mm.plugin.fts.a.a.i> a(String[] paramArrayOfString, f paramf)
    {
      GMTrace.i(18199789699072L, 135599);
      ArrayList localArrayList = new ArrayList();
      HashSet localHashSet = new HashSet();
      paramArrayOfString = b.this.iOd.a(paramArrayOfString, com.tencent.mm.plugin.fts.a.c.mjC, false);
      try
      {
        while (paramArrayOfString.moveToNext())
        {
          j localj = new j();
          localj.e(paramArrayOfString);
          if ((!localHashSet.contains(Long.valueOf(localj.mkG))) && (!paramf.mky.contains(localj.mkj)))
          {
            localj.aBl();
            localArrayList.add(localj);
            localHashSet.add(Long.valueOf(localj.mkG));
          }
        }
        if (paramArrayOfString == null) {
          break label154;
        }
      }
      catch (Throwable paramf)
      {
        throw paramf;
      }
      finally
      {
        if (paramArrayOfString != null) {
          paramArrayOfString.close();
        }
      }
      paramArrayOfString.close();
      label154:
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      if (paramf.mkz != null) {
        Collections.sort(localArrayList, paramf.mkz);
      }
      GMTrace.o(18199789699072L, 135599);
      return localArrayList;
    }
    
    public final int getId()
    {
      GMTrace.i(18200058134528L, 135601);
      GMTrace.o(18200058134528L, 135601);
      return 21;
    }
    
    public final String getName()
    {
      GMTrace.i(18199923916800L, 135600);
      GMTrace.o(18199923916800L, 135600);
      return "SearchWeAppTask";
    }
  }
  
  final class d
    extends a
  {
    d()
    {
      GMTrace.i(16545824636928L, 123276);
      GMTrace.o(16545824636928L, 123276);
    }
    
    public final boolean execute()
    {
      GMTrace.i(16545958854656L, 123277);
      List localList = i.Vo();
      if (localList.isEmpty())
      {
        w.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp recent usage list is nil.");
        GMTrace.o(16545958854656L, 123277);
        return true;
      }
      b.this.iOd.beginTransaction();
      b.this.iOd.h(com.tencent.mm.plugin.fts.a.c.mjC);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.c.e locale = (com.tencent.mm.plugin.appbrand.c.e)localIterator.next();
        String str = bg.mY(locale.gKm);
        int i = str.hashCode();
        long l = System.currentTimeMillis();
        b.this.iOd.a(393216, 1, i, str, l, locale.appName);
        b.this.iOd.a(393216, 2, i, str, l, com.tencent.mm.platformtools.c.mO(locale.appName));
        b.this.iOd.a(393216, 3, i, str, l, com.tencent.mm.platformtools.c.mP(locale.appName));
      }
      b.this.iOd.commit();
      w.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "UpdateWeAppIndexTask %d", new Object[] { Integer.valueOf(localList.size()) });
      GMTrace.o(16545958854656L, 123277);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(16546093072384L, 123278);
      GMTrace.o(16546093072384L, 123278);
      return "UpdateWeAppIndexTask";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */