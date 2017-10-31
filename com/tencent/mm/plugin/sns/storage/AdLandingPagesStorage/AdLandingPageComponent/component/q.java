package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class q
  extends k
{
  public q(Context paramContext, i parami, ViewGroup paramViewGroup)
  {
    super(paramContext, parami, paramViewGroup);
    GMTrace.i(8275328237568L, 61656);
    GMTrace.o(8275328237568L, 61656);
  }
  
  protected final void d(Button paramButton)
  {
    GMTrace.i(8275462455296L, 61657);
    final i locali = biZ();
    if (g.n(this.context, locali.qmT))
    {
      paramButton.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8263785512960L, 61570);
          q.this.biY();
          f localf = g.aM(locali.qmT, true);
          if ((localf == null) || (TextUtils.isEmpty(localf.field_packageName)) || (!q.this.r(paramAnonymousView.getContext(), localf.field_packageName, g.a(paramAnonymousView.getContext(), localf, null)))) {
            q.this.bja();
          }
          GMTrace.o(8263785512960L, 61570);
        }
      });
      GMTrace.o(8275462455296L, 61657);
      return;
    }
    super.d(paramButton);
    GMTrace.o(8275462455296L, 61657);
  }
  
  public final boolean r(Context paramContext, final String paramString1, final String paramString2)
  {
    GMTrace.i(8275596673024L, 61658);
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1)))
    {
      GMTrace.o(8275596673024L, 61658);
      return false;
    }
    try
    {
      final Intent localIntent = paramContext.getPackageManager().getLaunchIntentForPackage(paramString1);
      if (localIntent != null)
      {
        paramString1 = paramContext;
        if (!(paramContext instanceof Activity)) {
          paramString1 = this.context;
        }
        a.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18580431175680L, 138435);
            g.a(paramString1, localIntent, paramString2);
            GMTrace.o(18580431175680L, 138435);
          }
        });
        GMTrace.o(8275596673024L, 61658);
        return true;
      }
    }
    catch (Exception paramContext)
    {
      w.e("AdLandingPageOpenAppBtnComp", bg.f(paramContext));
      GMTrace.o(8275596673024L, 61658);
    }
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */