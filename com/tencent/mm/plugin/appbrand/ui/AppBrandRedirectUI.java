package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.b;
import com.tencent.mm.ao.b.a;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.p;

public class AppBrandRedirectUI
  extends MMActivity
{
  private int fromScene;
  private boolean jrE;
  private int result;
  
  public AppBrandRedirectUI()
  {
    GMTrace.i(15506576769024L, 115533);
    this.fromScene = -1;
    this.result = 0;
    this.jrE = false;
    GMTrace.o(15506576769024L, 115533);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15506710986752L, 115534);
    int i = p.g.ivr;
    GMTrace.o(15506710986752L, 115534);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15506845204480L, 115535);
    super.onCreate(paramBundle);
    w.i("AppBrandRedirectUI", "onCreate");
    setResult(0);
    this.fromScene = getIntent().getIntExtra("key_from_scene", -1);
    if (this.fromScene == 0)
    {
      getIntent().putExtra("WizardRootClass", getClass().getName());
      w.i("AppBrandRedirectUI", "start to bind phone number");
      paramBundle = new Intent();
      paramBundle.setClassName(this, "com.tencent.mm.ui.bindmobile.BindMContactUI");
      paramBundle.putExtra("is_bind_for_safe_device", false);
      paramBundle.putExtra("bind_scene", 5);
      Object localObject = ((TelephonyManager)this.vov.voR.getSystemService("phone")).getSimCountryIso();
      if (!bg.mZ((String)localObject))
      {
        localObject = b.h(this, (String)localObject, this.vov.voR.getString(p.i.bzo));
        if (localObject != null)
        {
          paramBundle.putExtra("country_name", ((b.a)localObject).hDL);
          paramBundle.putExtra("couttry_code", ((b.a)localObject).hDK);
        }
      }
      MMWizardActivity.A(this, paramBundle);
      GMTrace.o(15506845204480L, 115535);
      return;
    }
    w.e("AppBrandRedirectUI", "from scene is illegal, finish activity");
    finish();
    GMTrace.o(15506845204480L, 115535);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(15507113639936L, 115537);
    if (paramInt == 4)
    {
      w.e("AppBrandRedirectUI", "onKeyDown KEYCODE_BACK, result cancel, finishUI");
      setResult(0);
      finish();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(15507113639936L, 115537);
    return bool;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(15507247857664L, 115538);
    w.i("AppBrandRedirectUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    if (paramIntent != null)
    {
      this.result = paramIntent.getIntExtra("wizard_activity_result_code", 0);
      setResult(this.result);
      w.i("AppBrandRedirectUI", "result:%d, finish activity", new Object[] { Integer.valueOf(this.result) });
    }
    for (;;)
    {
      finish();
      GMTrace.o(15507247857664L, 115538);
      return;
      w.i("AppBrandRedirectUI", "intent is null");
      setResult(0);
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(15506979422208L, 115536);
    super.onResume();
    w.i("AppBrandRedirectUI", "onResume");
    if (!this.jrE)
    {
      this.jrE = true;
      GMTrace.o(15506979422208L, 115536);
      return;
    }
    w.i("AppBrandRedirectUI", "onResume, RESULT_CANCELED  finish activity");
    setResult(0);
    finish();
    GMTrace.o(15506979422208L, 115536);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */