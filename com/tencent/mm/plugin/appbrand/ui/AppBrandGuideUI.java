package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.p.j;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;
import com.tencent.mm.plugin.appbrand.ui.banner.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;

@com.tencent.mm.ui.base.a(7)
public final class AppBrandGuideUI
  extends MMActivity
  implements e
{
  public AppBrandGuideUI()
  {
    GMTrace.i(17663187222528L, 131601);
    GMTrace.o(17663187222528L, 131601);
  }
  
  public final void X(String paramString, int paramInt)
  {
    GMTrace.i(17663858311168L, 131606);
    finish();
    GMTrace.o(17663858311168L, 131606);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(17663321440256L, 131602);
    GMTrace.o(17663321440256L, 131602);
    return -1;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17663455657984L, 131603);
    setTheme(p.j.izf);
    super.onCreate(paramBundle);
    ad.a(getWindow());
    AppBrandStickyBannerLogic.b.d(this);
    paramBundle = new i.a(this);
    paramBundle.Bg(p.i.duy);
    ImageView localImageView = new ImageView(this);
    localImageView.setImageResource(p.e.isA);
    TextView localTextView = new TextView(this);
    localTextView.setText(p.i.ixk);
    localTextView.setTextSize(2, 14.0F);
    localTextView.setTextColor(Color.argb(Math.round(137.70001F), 0, 0, 0));
    localTextView.setLineSpacing(0.0F, 1.2F);
    LinearLayout localLinearLayout = new LinearLayout(this);
    localLinearLayout.setOrientation(1);
    localLinearLayout.addView(localImageView, new LinearLayout.LayoutParams(-1, -2));
    localLinearLayout.addView(localTextView, new LinearLayout.LayoutParams(-1, -2));
    ((ViewGroup.MarginLayoutParams)localTextView.getLayoutParams()).topMargin = com.tencent.mm.bq.a.fromDPToPix(this, 16);
    paramBundle.df(localLinearLayout);
    paramBundle.a(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(17661173956608L, 131586);
        AppBrandGuideUI.this.finish();
        GMTrace.o(17661173956608L, 131586);
      }
    });
    paramBundle.Bk(p.i.bvo);
    paramBundle.b(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(17663053004800L, 131600);
        AppBrandGuideUI.this.finish();
        GMTrace.o(17663053004800L, 131600);
      }
    });
    paramBundle.Bj(p.i.ixj);
    paramBundle.a(false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(17662650351616L, 131597);
        AppBrandGuideUI.this.startActivity(new Intent(AppBrandGuideUI.this, AppBrandLauncherUI.class));
        AppBrandGuideUI.this.finish();
        GMTrace.o(17662650351616L, 131597);
      }
    });
    paramBundle.lm(false);
    paramBundle.ln(true);
    paramBundle.ZT().show();
    GMTrace.o(17663455657984L, 131603);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(17663724093440L, 131605);
    super.onDestroy();
    AppBrandStickyBannerLogic.b.c(this);
    GMTrace.o(17663724093440L, 131605);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(17663589875712L, 131604);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1))
    {
      finish();
      GMTrace.o(17663589875712L, 131604);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(17663589875712L, 131604);
    return bool;
  }
  
  public static final class a
    implements Application.ActivityLifecycleCallbacks, e
  {
    public boolean jqq;
    
    public a()
    {
      GMTrace.i(17659563343872L, 131574);
      this.jqq = false;
      GMTrace.o(17659563343872L, 131574);
    }
    
    public static Application ZW()
    {
      GMTrace.i(17659697561600L, 131575);
      Application localApplication = (Application)ab.getContext().getApplicationContext();
      GMTrace.o(17659697561600L, 131575);
      return localApplication;
    }
    
    public final void X(String paramString, int paramInt)
    {
      GMTrace.i(17660771303424L, 131583);
      this.jqq = false;
      GMTrace.o(17660771303424L, 131583);
    }
    
    public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      GMTrace.i(17659831779328L, 131576);
      if ((paramActivity instanceof AppBrandGuideUI)) {
        this.jqq = false;
      }
      GMTrace.o(17659831779328L, 131576);
    }
    
    public final void onActivityDestroyed(Activity paramActivity)
    {
      GMTrace.i(17660637085696L, 131582);
      GMTrace.o(17660637085696L, 131582);
    }
    
    public final void onActivityPaused(Activity paramActivity)
    {
      GMTrace.i(17660234432512L, 131579);
      GMTrace.o(17660234432512L, 131579);
    }
    
    public final void onActivityResumed(Activity paramActivity)
    {
      GMTrace.i(17660100214784L, 131578);
      if (((paramActivity instanceof AppBrandGuideUI)) || ((paramActivity instanceof AppBrandLauncherUI))) {
        this.jqq = false;
      }
      ActivityManager.RunningTaskInfo localRunningTaskInfo;
      int i;
      if ((h.xx().wM()) && (this.jqq))
      {
        localRunningTaskInfo = bg.ab(paramActivity, paramActivity.getTaskId());
        if ((localRunningTaskInfo != null) && (localRunningTaskInfo.baseActivity != null)) {
          break label104;
        }
        i = 0;
      }
      for (;;)
      {
        if (i != 0)
        {
          this.jqq = false;
          paramActivity.startActivity(new Intent(paramActivity, AppBrandGuideUI.class).putExtra("extra_enter_scene", 11));
        }
        GMTrace.o(17660100214784L, 131578);
        return;
        label104:
        if ((!localRunningTaskInfo.baseActivity.getClassName().endsWith(".LauncherUI")) && (localRunningTaskInfo.baseActivity.getClassName().contains(".AppBrandUI"))) {
          i = 0;
        } else {
          i = 1;
        }
      }
    }
    
    public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
    {
      GMTrace.i(17660502867968L, 131581);
      GMTrace.o(17660502867968L, 131581);
    }
    
    public final void onActivityStarted(Activity paramActivity)
    {
      GMTrace.i(17659965997056L, 131577);
      GMTrace.o(17659965997056L, 131577);
    }
    
    public final void onActivityStopped(Activity paramActivity)
    {
      GMTrace.i(17660368650240L, 131580);
      GMTrace.o(17660368650240L, 131580);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */