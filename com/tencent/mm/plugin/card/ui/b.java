package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.b.q;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.ui.view.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class b
  implements Application.ActivityLifecycleCallbacks
{
  private int ktJ;
  
  public b()
  {
    GMTrace.i(18897721884672L, 140799);
    this.ktJ = 0;
    GMTrace.o(18897721884672L, 140799);
  }
  
  public static Application ZW()
  {
    GMTrace.i(18897856102400L, 140800);
    Application localApplication = (Application)ab.getContext().getApplicationContext();
    GMTrace.o(18897856102400L, 140800);
    return localApplication;
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(18897990320128L, 140801);
    GMTrace.o(18897990320128L, 140801);
  }
  
  public final void onActivityDestroyed(Activity paramActivity)
  {
    GMTrace.i(18898795626496L, 140807);
    GMTrace.o(18898795626496L, 140807);
  }
  
  public final void onActivityPaused(Activity paramActivity)
  {
    GMTrace.i(18898392973312L, 140804);
    GMTrace.o(18898392973312L, 140804);
  }
  
  public final void onActivityResumed(Activity paramActivity)
  {
    GMTrace.i(18898258755584L, 140803);
    GMTrace.o(18898258755584L, 140803);
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(18898661408768L, 140806);
    GMTrace.o(18898661408768L, 140806);
  }
  
  public final void onActivityStarted(Activity paramActivity)
  {
    GMTrace.i(18898124537856L, 140802);
    if (this.ktJ < 0)
    {
      if ((paramActivity == null) || (!(paramActivity instanceof CardDetailUI))) {
        break label96;
      }
      paramActivity = (CardDetailUI)paramActivity;
      if (paramActivity.ktS != null)
      {
        com.tencent.mm.plugin.card.ui.view.g localg = paramActivity.ktS.kuo;
        if ((localg != null) && ((localg instanceof m)))
        {
          w.i("MicroMsg.CardAcitivityLifecycleListener", "CardAcitivityLifecycleListener on activity from background to foreground！is showing CardDetailUI,updateCodeView!");
          paramActivity.ktS.kuo.d(c.kAG);
        }
      }
    }
    for (;;)
    {
      this.ktJ += 1;
      GMTrace.o(18898124537856L, 140802);
      return;
      label96:
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18881481539584L, 140678);
          w.i("MicroMsg.CardAcitivityLifecycleListener", "CardAcitivityLifecycleListener on activity from background to foreground！doUpdateOfflineDynamicCard!");
          al.ajS().a(q.kAX);
          GMTrace.o(18881481539584L, 140678);
        }
      });
    }
  }
  
  public final void onActivityStopped(Activity paramActivity)
  {
    GMTrace.i(18898527191040L, 140805);
    this.ktJ -= 1;
    GMTrace.o(18898527191040L, 140805);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */