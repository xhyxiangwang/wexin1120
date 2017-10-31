package com.tencent.mm.plugin.appbrand;

import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
{
  MMActivity iqJ;
  public FrameLayout iqS;
  public LinkedList<f> irx;
  public HashMap<String, f> iry;
  AppBrandRemoteTaskController.c irz;
  
  public g(MMActivity paramMMActivity, AppBrandRemoteTaskController.c paramc)
  {
    GMTrace.i(17399852040192L, 129639);
    this.iqJ = paramMMActivity;
    this.irx = new LinkedList();
    this.iry = new HashMap();
    this.iqS = new FrameLayout(paramMMActivity);
    this.iqS.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.irz = paramc;
    GMTrace.o(17399852040192L, 129639);
  }
  
  private void RM()
  {
    GMTrace.i(18837323907072L, 140349);
    Iterator localIterator = this.irx.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      this.iqS.removeView(localf.iqS);
      this.iry.put(localf.iqL, localf);
      localf.irc.iCL.hN(12);
    }
    this.irx.clear();
    GMTrace.o(18837323907072L, 140349);
  }
  
  public final void D(boolean paramBoolean)
  {
    GMTrace.i(17399986257920L, 129640);
    if (paramBoolean)
    {
      this.iqJ.finish();
      GMTrace.o(17399986257920L, 129640);
      return;
    }
    this.iqJ.moveTaskToBack(true);
    if (this.irx.size() > 1)
    {
      RL().onPause();
      RM();
    }
    GMTrace.o(17399986257920L, 129640);
  }
  
  public final f RL()
  {
    GMTrace.i(15407389868032L, 114794);
    f localf = (f)this.irx.peek();
    GMTrace.o(15407389868032L, 114794);
    return localf;
  }
  
  public final void a(final f paramf)
  {
    GMTrace.i(15407658303488L, 114796);
    this.iqJ.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17759421333504L, 132318);
        g localg = g.this;
        f localf = paramf;
        if (localf != null)
        {
          localf.cleanup();
          localg.iqS.removeView(localf.iqS);
          localg.iry.remove(localf.iqL);
          localg.irx.remove(localf);
        }
        GMTrace.o(17759421333504L, 132318);
      }
    });
    GMTrace.o(15407658303488L, 114796);
  }
  
  public final void a(final f paramf, final AppBrandInitConfig paramAppBrandInitConfig, final AppBrandStatObject paramAppBrandStatObject)
  {
    GMTrace.i(15407255650304L, 114793);
    if ((paramAppBrandInitConfig == null) || (paramAppBrandStatObject == null))
    {
      GMTrace.o(15407255650304L, 114793);
      return;
    }
    if (paramf == null) {
      RM();
    }
    if (nL(paramAppBrandInitConfig.appId) == null)
    {
      this.iqJ.runOnUiThread(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15569659101184L, 116003);
          g localg = g.this;
          f localf1 = paramf;
          AppBrandInitConfig localAppBrandInitConfig = paramAppBrandInitConfig;
          AppBrandStatObject localAppBrandStatObject = paramAppBrandStatObject;
          if (localf1 != null)
          {
            localf1.irh = true;
            localf1.onPause();
          }
          f localf2 = new f(localg.iqJ, localg);
          localf2.a(localAppBrandInitConfig, localAppBrandStatObject);
          localf2.iqM = localf1;
          localf2.Rx();
          localg.irx.push(localf2);
          localg.iqS.addView(localf2.iqS);
          if (localf1 != null)
          {
            localf1.i(null);
            localf2.RI();
          }
          GMTrace.o(15569659101184L, 116003);
        }
      });
      GMTrace.o(15407255650304L, 114793);
      return;
    }
    this.iqJ.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        boolean bool2 = false;
        GMTrace.i(15504563503104L, 115518);
        g localg = g.this;
        f localf1 = paramf;
        AppBrandInitConfig localAppBrandInitConfig = paramAppBrandInitConfig;
        AppBrandStatObject localAppBrandStatObject = paramAppBrandStatObject;
        f localf2 = localg.nL(localAppBrandInitConfig.appId);
        int i = localg.irx.indexOf(localf2) - 1;
        if (i >= 0)
        {
          Object localObject = new LinkedList();
          while ((i >= 0) && (((f)localg.irx.get(i)).RC()))
          {
            ((LinkedList)localObject).add(localg.irx.get(i));
            i -= 1;
          }
          localObject = ((LinkedList)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            f localf3 = (f)((Iterator)localObject).next();
            if (localf3 != localf1) {
              localg.a(localf3);
            }
          }
        }
        if (!localg.irx.contains(localf2))
        {
          localg.irx.push(localf2);
          localg.iqS.addView(localf2.iqS);
          localg.iry.remove(localf2.iqL);
        }
        localg.irx.remove(localf2);
        localg.irx.push(localf2);
        localg.iqS.removeView(localf2.iqS);
        localg.iqS.addView(localf2.iqS);
        localf2.iqM = localf1;
        boolean bool1;
        if (localf2.gTa)
        {
          if ((localAppBrandInitConfig == null) || (localAppBrandInitConfig.iCo == localf2.iqN.iCo)) {
            break label393;
          }
          bool1 = true;
          localf2.ire = bool1;
          bool1 = bool2;
          if (localAppBrandInitConfig != null)
          {
            if (localAppBrandStatObject != null) {
              break label398;
            }
            bool1 = bool2;
          }
        }
        for (;;)
        {
          localf2.irf = bool1;
          localf2.iqN = localAppBrandInitConfig;
          localf2.a(localAppBrandStatObject, localAppBrandInitConfig.iIy);
          if (localf1 != null)
          {
            localf1.irh = true;
            localf1.onPause();
            localf1.i(new g.3(localg, localf1));
            localf2.RI();
            localf2.onResume();
          }
          GMTrace.o(15504563503104L, 115518);
          return;
          label393:
          bool1 = false;
          break;
          label398:
          bool1 = bool2;
          if (localAppBrandStatObject.scene != 1022) {
            if ((bg.mZ(localAppBrandInitConfig.iIy)) && (bg.mZ(localAppBrandInitConfig.hju)) && (bg.mZ(localf2.iqN.iIy)))
            {
              bool1 = bool2;
              if (bg.mZ(localf2.iqN.hju)) {}
            }
            else
            {
              bool1 = true;
            }
          }
        }
      }
    });
    GMTrace.o(15407255650304L, 114793);
  }
  
  final f nL(String paramString)
  {
    GMTrace.i(17400120475648L, 129641);
    Iterator localIterator = this.irx.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      if (localf.iqL.equals(paramString))
      {
        GMTrace.o(17400120475648L, 129641);
        return localf;
      }
    }
    paramString = (f)this.iry.get(paramString);
    GMTrace.o(17400120475648L, 129641);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */