package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;

@a(7)
public class AppBrandProcessProxyUI
  extends MMActivity
  implements b
{
  private AppBrandProxyUIProcessTask iOC;
  private AppBrandProxyUIProcessTask.ProcessRequest iOD;
  private boolean iOE;
  private volatile boolean iOF;
  private i iOG;
  private a iOH;
  
  public AppBrandProcessProxyUI()
  {
    GMTrace.i(10290204770304L, 76668);
    this.iOE = false;
    this.iOF = false;
    GMTrace.o(10290204770304L, 76668);
  }
  
  static <_Req extends AppBrandProxyUIProcessTask.ProcessRequest, _Result extends AppBrandProxyUIProcessTask.ProcessResult> void a(Context paramContext, Class<? extends AppBrandProcessProxyUI> paramClass, _Req param_Req, final AppBrandProxyUIProcessTask.b<_Result> paramb)
  {
    GMTrace.i(10290338988032L, 76669);
    if (paramContext == null) {
      paramContext = ab.getContext();
    }
    for (;;)
    {
      String str = param_Req.Vz().getName();
      Object localObject;
      if (paramClass == null)
      {
        localObject = AppBrandProcessProxyUI.class;
        localObject = new Intent(paramContext, (Class)localObject).putExtra("key_model_class_name", str);
        if (paramb != null) {
          break label141;
        }
        paramb = null;
        label58:
        paramb = ((Intent)localObject).putExtra("key_result_receiver", paramb).putExtra("appbrand_report_key_target_activity", param_Req.Vy()).putExtra("key_running_mode", 1);
        paramb.putExtra("key_request_parcel", param_Req);
        if ((paramContext instanceof Activity)) {
          break label159;
        }
        paramb.addFlags(268435456);
      }
      for (;;)
      {
        if ((AppBrandProcessProxyUI.class == paramClass) || (!(paramContext instanceof Activity))) {
          break label179;
        }
        ((Activity)paramContext).startActivityForResult(paramb, 0);
        GMTrace.o(10290338988032L, 76669);
        return;
        localObject = paramClass;
        break;
        label141:
        paramb = new ResultReceiver(ae.fetchFreeHandler(Looper.getMainLooper()))
        {
          protected final void onReceiveResult(int paramAnonymousInt, Bundle paramAnonymousBundle)
          {
            GMTrace.i(10279333134336L, 76587);
            if (paramAnonymousBundle == null)
            {
              paramb.c(null);
              GMTrace.o(10279333134336L, 76587);
              return;
            }
            paramAnonymousBundle.setClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
            paramAnonymousBundle = (AppBrandProxyUIProcessTask.ProcessResult)paramAnonymousBundle.getParcelable("key_result_parcel");
            paramb.c(paramAnonymousBundle);
            GMTrace.o(10279333134336L, 76587);
          }
        };
        break label58;
        label159:
        paramb.putExtra("key_need_light_status", g.c(((Activity)paramContext).getWindow()));
      }
      label179:
      paramContext.startActivity(paramb);
      GMTrace.o(10290338988032L, 76669);
      return;
    }
  }
  
  static void a(Context paramContext, Class<? extends AppBrandProcessProxyUI> paramClass, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, DialogInterface.OnClickListener paramOnClickListener3)
  {
    GMTrace.i(10290473205760L, 76670);
    paramOnClickListener1 = paramContext;
    if (paramContext == null) {
      paramOnClickListener1 = ab.getContext();
    }
    paramContext = new Intent(paramOnClickListener1, paramClass).putExtra("key_running_mode", 2).putExtra("key_result_receiver", new ResultReceiver(ae.fetchFreeHandler(Looper.getMainLooper()))
    {
      protected final void onReceiveResult(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(10279601569792L, 76589);
        if ((-1 == paramAnonymousInt) && (this.iOJ != null)) {
          this.iOJ.onClick(null, paramAnonymousInt);
        }
        if ((-2 == paramAnonymousInt) && (this.iOK != null)) {
          this.iOK.onClick(null, paramAnonymousInt);
        }
        if ((-3 == paramAnonymousInt) && (this.iOL != null)) {
          this.iOL.onClick(null, paramAnonymousInt);
        }
        GMTrace.o(10279601569792L, 76589);
      }
    }).putExtra("key_alert_message", paramString1).putExtra("key_alert_title", paramString2).putExtra("key_alert_confirm", paramString3).putExtra("key_alert_deny", paramString4);
    if (!(paramOnClickListener1 instanceof Activity)) {
      paramContext.addFlags(268435456);
    }
    paramOnClickListener1.startActivity(paramContext);
    GMTrace.o(10290473205760L, 76670);
  }
  
  private static String aX(String paramString1, String paramString2)
  {
    GMTrace.i(10291010076672L, 76674);
    if (bg.mZ(paramString1))
    {
      GMTrace.o(10291010076672L, 76674);
      return paramString2;
    }
    GMTrace.o(10291010076672L, 76674);
    return paramString1;
  }
  
  protected final void Vt()
  {
    GMTrace.i(10290741641216L, 76672);
    super.Vt();
    aq(1);
    GMTrace.o(10290741641216L, 76672);
  }
  
  public final MMActivity Vu()
  {
    GMTrace.i(10291681165312L, 76679);
    GMTrace.o(10291681165312L, 76679);
    return this;
  }
  
  public final boolean Vv()
  {
    GMTrace.i(10291949600768L, 76681);
    if ((this.vox) || (isFinishing()) || (this.iOF))
    {
      GMTrace.o(10291949600768L, 76681);
      return true;
    }
    GMTrace.o(10291949600768L, 76681);
    return false;
  }
  
  public final void a(final AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    GMTrace.i(10291815383040L, 76680);
    this.iOF = true;
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10281749053440L, 76605);
        AppBrandProcessProxyUI.this.b(paramProcessResult);
        AppBrandProcessProxyUI.this.finish();
        GMTrace.o(10281749053440L, 76605);
      }
    });
    GMTrace.o(10291815383040L, 76680);
  }
  
  public final void b(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    GMTrace.i(10292083818496L, 76682);
    ResultReceiver localResultReceiver = (ResultReceiver)getIntent().getParcelableExtra("key_result_receiver");
    if ((localResultReceiver != null) && (paramProcessResult != null))
    {
      Bundle localBundle = new Bundle(2);
      localBundle.putParcelable("key_result_parcel", paramProcessResult);
      localResultReceiver.send(0, localBundle);
    }
    GMTrace.o(10292083818496L, 76682);
  }
  
  public void finish()
  {
    GMTrace.i(10291546947584L, 76678);
    super.finish();
    overridePendingTransition(0, 0);
    if (this.iOC != null) {
      this.iOC.Vw();
    }
    GMTrace.o(10291546947584L, 76678);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(10290607423488L, 76671);
    GMTrace.o(10290607423488L, 76671);
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10291412729856L, 76677);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.d("MicroMsg.AppBrandProcessProxyUI", "onActivityResult, requestCode = %d, resultCode = %d, request = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this.iOD.getClass().getName() });
    this.iOE = false;
    GMTrace.o(10291412729856L, 76677);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(10290875858944L, 76673);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    g.a(getWindow());
    g.a(getWindow(), getIntent().getBooleanExtra("key_need_light_status", false));
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    if (getIntent() == null)
    {
      finish();
      GMTrace.o(10290875858944L, 76673);
      return;
    }
    switch (getIntent().getIntExtra("key_running_mode", 0))
    {
    default: 
      finish();
      GMTrace.o(10290875858944L, 76673);
      return;
    case 1: 
      label120:
      getIntent().setExtrasClassLoader(AppBrandProcessProxyUI.class.getClassLoader());
      paramBundle = getIntent().getStringExtra("key_model_class_name");
      w.i("MicroMsg.AppBrandProcessProxyUI", "onCreate, modelClass = %s", new Object[] { paramBundle });
      if (bg.mZ(paramBundle)) {}
      for (;;)
      {
        if (i != 0) {
          break label120;
        }
        break;
        this.iOC = AppBrandProxyUIProcessTask.a.pN(paramBundle);
        if (this.iOC == null)
        {
          w.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown model class = %s", new Object[] { paramBundle });
        }
        else
        {
          if (getIntent().getBooleanExtra("key_request_need_params", true))
          {
            this.iOD = ((AppBrandProxyUIProcessTask.ProcessRequest)getIntent().getParcelableExtra("key_request_parcel"));
            if (this.iOD == null) {
              w.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown request class = %s", new Object[] { paramBundle });
            }
          }
          else
          {
            this.iOD = null;
            continue;
          }
          this.iOC.iOQ = this;
          this.iOC.a(this.iOD);
          i = 1;
        }
      }
    }
    paramBundle = aX(getIntent().getStringExtra("key_alert_title"), "");
    String str1 = aX(getIntent().getStringExtra("key_alert_message"), getString(p.i.dxm));
    String str2 = aX(getIntent().getStringExtra("key_alert_confirm"), "");
    final String str3 = aX(getIntent().getStringExtra("key_alert_deny"), "");
    this.iOH = new a();
    this.iOG = h.a(this, str1, paramBundle, str2, str3, false, this.iOH, this.iOH);
    this.iOG.setOnDismissListener(this.iOH);
    this.iOG.setOnKeyListener(new DialogInterface.OnKeyListener()
    {
      public final boolean onKey(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(10285372932096L, 76632);
        if ((paramAnonymousInt == 4) && (paramAnonymousKeyEvent.getAction() == 1))
        {
          if (!bg.mZ(str3))
          {
            AppBrandProcessProxyUI.b(AppBrandProcessProxyUI.this).onClick(AppBrandProcessProxyUI.a(AppBrandProcessProxyUI.this), -3);
            paramAnonymousDialogInterface.dismiss();
          }
          AppBrandProcessProxyUI.this.a(null);
        }
        GMTrace.o(10285372932096L, 76632);
        return false;
      }
    });
    GMTrace.o(10290875858944L, 76673);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10291278512128L, 76676);
    super.onDestroy();
    if ((this.iOG != null) && (this.iOG.isShowing()))
    {
      this.iOG.dismiss();
      this.iOG = null;
      this.iOH = null;
    }
    GMTrace.o(10291278512128L, 76676);
  }
  
  protected void onResume()
  {
    GMTrace.i(10291144294400L, 76675);
    super.onResume();
    if (getIntent().getIntExtra("key_running_mode", 0) == 2)
    {
      w.d("MicroMsg.AppBrandProcessProxyUI", "onResume, RUNNING_MODE_SHOW_ALERT");
      GMTrace.o(10291144294400L, 76675);
      return;
    }
    boolean bool = Vv();
    w.d("MicroMsg.AppBrandProcessProxyUI", "onResume, mFinishOnNextResume = %b, finishing = %b, request = %s", new Object[] { Boolean.valueOf(this.iOE), Boolean.valueOf(bool), this.iOD.getClass().getName() });
    if ((this.iOE) && (this.iOD.Vx()) && (!bool)) {
      a(null);
    }
    this.iOE = true;
    GMTrace.o(10291144294400L, 76675);
  }
  
  private final class a
    implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener
  {
    private boolean iOP;
    
    public a()
    {
      GMTrace.i(10286446673920L, 76640);
      this.iOP = false;
      GMTrace.o(10286446673920L, 76640);
    }
    
    private void ix(int paramInt)
    {
      GMTrace.i(10286849327104L, 76643);
      if (this.iOP)
      {
        GMTrace.o(10286849327104L, 76643);
        return;
      }
      this.iOP = true;
      ResultReceiver localResultReceiver = (ResultReceiver)AppBrandProcessProxyUI.this.getIntent().getParcelableExtra("key_result_receiver");
      if (localResultReceiver != null) {
        localResultReceiver.send(paramInt, null);
      }
      GMTrace.o(10286849327104L, 76643);
    }
    
    public final void onClick(DialogInterface paramDialogInterface, int paramInt)
    {
      GMTrace.i(10286580891648L, 76641);
      ix(paramInt);
      GMTrace.o(10286580891648L, 76641);
    }
    
    public final void onDismiss(DialogInterface paramDialogInterface)
    {
      GMTrace.i(10286715109376L, 76642);
      ix(-2);
      AppBrandProcessProxyUI.this.a(null);
      GMTrace.o(10286715109376L, 76642);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */