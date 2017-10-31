package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.menu.l;
import com.tencent.mm.plugin.appbrand.menu.m.a;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.widget.e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class k
{
  public String iqL;
  public AppBrandPageView jeC;
  public e jki;
  public List<com.tencent.mm.plugin.appbrand.menu.k> jkj;
  
  k(Context paramContext, String paramString, AppBrandPageView paramAppBrandPageView, List<com.tencent.mm.plugin.appbrand.menu.k> paramList)
  {
    GMTrace.i(15460540088320L, 115190);
    this.iqL = paramString;
    this.jeC = paramAppBrandPageView;
    this.jkj = paramList;
    this.jki = new e(paramContext, e.wSP, false);
    this.jki.qQS = new o.c()
    {
      public final void a(com.tencent.mm.ui.base.m paramAnonymousm)
      {
        GMTrace.i(14326266068992L, 106739);
        Iterator localIterator = k.this.jkj.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (com.tencent.mm.plugin.appbrand.menu.k)localIterator.next();
          if ((localObject != null) && (!((com.tencent.mm.plugin.appbrand.menu.k)localObject).jih))
          {
            Context localContext = k.this.jeC.mContext;
            AppBrandPageView localAppBrandPageView = k.this.jeC;
            String str = k.this.iqL;
            if (localObject != null)
            {
              localObject = (a)m.a.jiw.jiv.get(Integer.valueOf(((com.tencent.mm.plugin.appbrand.menu.k)localObject).id));
              if (localObject != null) {
                ((a)localObject).a(localContext, localAppBrandPageView, paramAnonymousm, str);
              }
            }
          }
        }
        GMTrace.o(14326266068992L, 106739);
      }
    };
    this.jki.qQT = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(14325997633536L, 106737);
        paramAnonymousInt = l.iW(paramAnonymousMenuItem.getItemId());
        if (paramAnonymousInt == 0)
        {
          GMTrace.o(14325997633536L, 106737);
          return;
        }
        paramAnonymousMenuItem = com.tencent.mm.plugin.appbrand.menu.m.d(k.this.jkj, paramAnonymousInt - 1);
        Context localContext = k.this.jeC.mContext;
        AppBrandPageView localAppBrandPageView = k.this.jeC;
        String str = k.this.iqL;
        if (paramAnonymousMenuItem == null) {
          paramAnonymousInt = 0;
        }
        for (;;)
        {
          if (paramAnonymousInt != 0) {
            k.this.jki.bCW();
          }
          GMTrace.o(14325997633536L, 106737);
          return;
          a locala = (a)m.a.jiw.jiv.get(Integer.valueOf(paramAnonymousMenuItem.id));
          if (locala == null)
          {
            paramAnonymousInt = 0;
          }
          else
          {
            locala.a(localContext, localAppBrandPageView, str, paramAnonymousMenuItem);
            paramAnonymousInt = 1;
          }
        }
      }
    };
    this.jki.sxT = this.jeC.jlg;
    this.jki.bCV();
    GMTrace.o(15460540088320L, 115190);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */