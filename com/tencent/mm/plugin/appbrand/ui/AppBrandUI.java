package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.a.a;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.b.e;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.a;
import com.tencent.mm.plugin.appbrand.page.j;
import com.tencent.mm.plugin.appbrand.page.l;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.a;
import com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.c;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.q;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

@com.tencent.mm.ui.base.a(1)
public class AppBrandUI
  extends MMActivity
  implements a.a
{
  private static HashSet<MMActivity> jsD;
  private g iqK;
  private AppBrandRemoteTaskController.c irz;
  private f jsB;
  private com.tencent.mm.plugin.appbrand.b.d jsC;
  private i jsE;
  
  static
  {
    GMTrace.i(17662784569344L, 131598);
    jsD = new HashSet();
    GMTrace.o(17662784569344L, 131598);
  }
  
  public AppBrandUI()
  {
    GMTrace.i(10482270339072L, 78099);
    this.irz = new AppBrandRemoteTaskController.c()
    {
      public final void a(AppBrandRemoteTaskController paramAnonymousAppBrandRemoteTaskController)
      {
        GMTrace.i(18836115947520L, 140340);
        AppBrandUI.a(AppBrandUI.this, paramAnonymousAppBrandRemoteTaskController);
        GMTrace.o(18836115947520L, 140340);
      }
      
      public final void finish()
      {
        GMTrace.i(18835981729792L, 140339);
        AppBrandUI.this.vov.voR.finish();
        GMTrace.o(18835981729792L, 140339);
      }
    };
    this.jsE = null;
    GMTrace.o(10482270339072L, 78099);
  }
  
  private void u(Intent paramIntent)
  {
    GMTrace.i(15505234591744L, 115523);
    Object localObject1 = paramIntent.getExtras();
    if (localObject1 == null)
    {
      finish();
      GMTrace.o(15505234591744L, 115523);
      return;
    }
    for (;;)
    {
      try
      {
        ((Bundle)localObject1).setClassLoader(AppBrandInitConfig.class.getClassLoader());
        paramIntent = (AppBrandInitConfig)((Bundle)localObject1).getParcelable("key_appbrand_init_config");
      }
      catch (Exception localException1)
      {
        try
        {
          localObject1 = (AppBrandStatObject)((Bundle)localObject1).getParcelable("key_appbrand_stat_object");
          this.iqK.a(null, paramIntent, (AppBrandStatObject)localObject1);
          a((AppBrandStatObject)localObject1);
          GMTrace.o(15505234591744L, 115523);
          return;
        }
        catch (Exception localException2)
        {
          Object localObject2;
          for (;;) {}
        }
        localException1 = localException1;
        paramIntent = null;
      }
      tmp94_91[0] = localException1;
      w.e("MicroMsg.AppBrandUI", "getParcelable: %s", tmp94_91);
      localObject2 = null;
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(10484015169536L, 78112);
    GMTrace.o(10484015169536L, 78112);
    return 1;
  }
  
  protected final void Vt()
  {
    GMTrace.i(10483880951808L, 78111);
    super.Vt();
    getWindow().requestFeature(10);
    getWindow().getDecorView().setFitsSystemWindows(true);
    aq(10);
    aq(1);
    m.b(this);
    GMTrace.o(10483880951808L, 78111);
  }
  
  protected boolean ZX()
  {
    GMTrace.i(18836518600704L, 140343);
    if (!jsD.isEmpty())
    {
      w.i("MicroMsg.AppBrandUI", "Activity running");
      GMTrace.o(18836518600704L, 140343);
      return false;
    }
    ProcessRestartTask localProcessRestartTask = new ProcessRestartTask();
    localProcessRestartTask.gPI = ab.vR();
    localProcessRestartTask.jpy = getClass().getName();
    AppBrandMainProcessService.b(localProcessRestartTask);
    try
    {
      KVCommCrossProcessReceiver.bag();
      com.tencent.mm.bu.a.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18965233401856L, 141302);
          w.i("MicroMsg.AppBrandUI", "tryRestartProcess, %s", new Object[] { q.Aw().toString() });
          System.exit(0);
          GMTrace.o(18965233401856L, 141302);
        }
      });
      GMTrace.o(18836518600704L, 140343);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AppBrandUI", localException, "sendKV", new Object[0]);
      }
    }
  }
  
  protected void a(AppBrandStatObject paramAppBrandStatObject)
  {
    int j = 0;
    GMTrace.i(19702759817216L, 146797);
    if (paramAppBrandStatObject == null) {}
    for (int i = 0;; i = paramAppBrandStatObject.scene)
    {
      if (i == 1023) {
        j = 1;
      }
      if (j == 0) {
        break;
      }
      com.tencent.mm.plugin.appbrand.o.d.bU(this.vov.voR);
      GMTrace.o(19702759817216L, 146797);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.bW(this.vov.voR);
    GMTrace.o(19702759817216L, 146797);
  }
  
  protected void aai()
  {
    GMTrace.i(19702894034944L, 146798);
    com.tencent.mm.plugin.appbrand.o.d.bV(this.vov.voR);
    GMTrace.o(19702894034944L, 146798);
  }
  
  public final boolean aaq()
  {
    GMTrace.i(10484149387264L, 78113);
    GMTrace.o(10484149387264L, 78113);
    return true;
  }
  
  public void finish()
  {
    GMTrace.i(10485357346816L, 78122);
    if ((isFinishing()) || (this.vox))
    {
      GMTrace.o(10485357346816L, 78122);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      finishAndRemoveTask();
    }
    for (;;)
    {
      aai();
      com.tencent.mm.plugin.appbrand.report.a.ZE();
      GMTrace.o(10485357346816L, 78122);
      return;
      super.finish();
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10484283604992L, 78114);
    GMTrace.o(10484283604992L, 78114);
    return -1;
  }
  
  public boolean moveTaskToBack(boolean paramBoolean)
  {
    GMTrace.i(10483478298624L, 78108);
    try
    {
      paramBoolean = super.moveTaskToBack(paramBoolean);
      aai();
      GMTrace.o(10483478298624L, 78108);
      return paramBoolean;
    }
    catch (NullPointerException localNullPointerException)
    {
      jsD.remove(this);
      if (!ZX()) {
        finish();
      }
      GMTrace.o(10483478298624L, 78108);
    }
    return true;
  }
  
  public void onBackPressed()
  {
    int k = 0;
    int j = 0;
    GMTrace.i(10483746734080L, 78110);
    Object localObject1 = this.iqK.RL();
    if (localObject1 != null) {
      if (((com.tencent.mm.plugin.appbrand.f)localObject1).iqT == null)
      {
        Object localObject2;
        Object localObject3;
        if (((com.tencent.mm.plugin.appbrand.f)localObject1).iqV != null)
        {
          localObject2 = ((com.tencent.mm.plugin.appbrand.f)localObject1).iqV;
          localObject3 = (com.tencent.mm.plugin.appbrand.widget.c.a)((com.tencent.mm.plugin.appbrand.widget.c.b)localObject2).jAx.peekLast();
          if (localObject3 == null)
          {
            ((com.tencent.mm.plugin.appbrand.widget.c.b)localObject2).setVisibility(8);
            i = 0;
            if (i != 0) {
              break label242;
            }
          }
        }
        else
        {
          if (((com.tencent.mm.plugin.appbrand.f)localObject1).iqR == null) {
            break label242;
          }
          localObject1 = ((com.tencent.mm.plugin.appbrand.f)localObject1).iqR;
          localObject2 = ((l)localObject1).YZ().YO();
          localObject3 = ((AppBrandPageView)localObject2).jlc;
          if (((s)localObject3).jma != null) {
            break label165;
          }
          i = 0;
          label123:
          if (i == 0) {
            break label175;
          }
          j = 1;
        }
        label165:
        label175:
        do
        {
          do
          {
            if (j == 0) {
              ((l)localObject1).YY();
            }
            GMTrace.o(10483746734080L, 78110);
            return;
            ((com.tencent.mm.plugin.appbrand.widget.c.a)localObject3).onCancel();
            ((com.tencent.mm.plugin.appbrand.widget.c.b)localObject2).b((com.tencent.mm.plugin.appbrand.widget.c.a)localObject3);
            i = 1;
            break;
            ((s)localObject3).Zq();
            i = 1;
            break label123;
          } while (((AppBrandPageView)localObject2).jkX.size() == 0);
          localObject2 = ((AppBrandPageView)localObject2).jkX.iterator();
          i = k;
          j = i;
        } while (!((Iterator)localObject2).hasNext());
        if (!((AppBrandPageView.a)((Iterator)localObject2).next()).XO()) {
          break label252;
        }
        int i = 1;
      }
    }
    label242:
    label252:
    for (;;)
    {
      break;
      ((com.tencent.mm.plugin.appbrand.f)localObject1).finish();
      GMTrace.o(10483746734080L, 78110);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10482404556800L, 78100);
    super.onCreate(paramBundle);
    paramBundle = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "pref_appbrand_process", 4);
    Object localObject = ab.vR() + ":start_time";
    SharedPreferences.Editor localEditor = paramBundle.edit();
    if (paramBundle.contains((String)localObject))
    {
      localEditor.remove((String)localObject);
      com.tencent.mm.plugin.report.d.oZR.a(365L, 2L, 1L, false);
    }
    com.tencent.mm.plugin.report.d.oZR.a(365L, 4L, 1L, false);
    localEditor.putLong((String)localObject, System.currentTimeMillis());
    localEditor.commit();
    w.v("MicroMsg.AppBrandReporter", "onProcessStart");
    KVCommCrossProcessReceiver.bac();
    paramBundle = new FrameLayout(this.vov.voR);
    paramBundle.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    setContentView(paramBundle);
    m.a(this, paramBundle);
    this.iqK = new g(this, this.irz);
    paramBundle.addView(this.iqK.iqS);
    this.jsB = new f(this, this.iqK);
    paramBundle = this.jsB;
    localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_OFF");
    try
    {
      ab.getContext().registerReceiver(paramBundle.iDf, (IntentFilter)localObject);
      this.jsC = new com.tencent.mm.plugin.appbrand.b.d(this)
      {
        protected final void SU()
        {
          GMTrace.i(18836384382976L, 140342);
          com.tencent.mm.plugin.appbrand.f localf = AppBrandUI.a(AppBrandUI.this).RL();
          if (localf == null)
          {
            GMTrace.o(18836384382976L, 140342);
            return;
          }
          com.tencent.mm.plugin.appbrand.d.a(localf.iqL, d.c.iqE);
          GMTrace.o(18836384382976L, 140342);
        }
      };
      paramBundle = this.jsC;
      localObject = new IntentFilter();
      ((IntentFilter)localObject).addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
    }
    catch (Exception paramBundle)
    {
      try
      {
        ab.getContext().registerReceiver(paramBundle.sZ, (IntentFilter)localObject);
        jsD.add(this);
        u(getIntent());
        GMTrace.o(10482404556800L, 78100);
        return;
        paramBundle = paramBundle;
        w.e("MicroMsg.BaseAppBrandUIScreenOffReceiver", "register screen off receiver e = " + paramBundle);
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          w.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "register screen off receiver e = " + paramBundle);
        }
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(10483612516352L, 78109);
    super.onDestroy();
    Object localObject1 = this.iqK;
    Object localObject2 = new LinkedList();
    ((LinkedList)localObject2).addAll(((g)localObject1).irx);
    ((LinkedList)localObject2).addAll(((g)localObject1).iry.values());
    localObject2 = ((LinkedList)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((g)localObject1).a((com.tencent.mm.plugin.appbrand.f)((Iterator)localObject2).next());
    }
    w.i("MicroMsg.AppBrandRuntimeContainer", "cleanup");
    jsD.remove(this);
    if (this.jsC != null) {
      localObject1 = this.jsC;
    }
    try
    {
      ab.getContext().unregisterReceiver(((com.tencent.mm.plugin.appbrand.b.d)localObject1).sZ);
      if (this.jsB != null) {
        localObject1 = this.jsB;
      }
    }
    catch (Exception localException1)
    {
      try
      {
        ab.getContext().unregisterReceiver(((e)localObject1).iDf);
        ZX();
        GMTrace.o(10483612516352L, 78109);
        return;
        localException1 = localException1;
        w.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "unregister screen off receiver e = " + localException1);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.e("MicroMsg.BaseAppBrandUIScreenOffReceiver", "unregister screen off receiver e = " + localException2);
        }
      }
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(10482538774528L, 78101);
    u(paramIntent);
    GMTrace.o(10482538774528L, 78101);
  }
  
  public void onPause()
  {
    GMTrace.i(10482941427712L, 78104);
    super.onPause();
    w.i("MicroMsg.AppBrandUI", "onPause");
    com.tencent.mm.plugin.appbrand.f localf = this.iqK.RL();
    if (localf != null) {
      localf.onPause();
    }
    try
    {
      com.tencent.mm.modelstat.d.a(4, "AppBrandUI_" + this.iqK.RL().iqL, hashCode());
      GMTrace.o(10482941427712L, 78104);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.AppBrandUI", localThrowable, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
      GMTrace.o(10482941427712L, 78104);
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(10484686258176L, 78117);
    com.tencent.mm.plugin.appbrand.f localf = this.iqK.RL();
    if (localf != null) {
      com.tencent.mm.plugin.appbrand.a.a(localf.iqL, paramInt, paramArrayOfString, paramArrayOfInt);
    }
    GMTrace.o(10484686258176L, 78117);
  }
  
  public void onResume()
  {
    GMTrace.i(10482807209984L, 78103);
    super.onResume();
    w.i("MicroMsg.AppBrandUI", "onResume");
    com.tencent.mm.plugin.appbrand.f localf = this.iqK.RL();
    if (localf != null) {
      localf.onResume();
    }
    try
    {
      com.tencent.mm.modelstat.d.a(3, "AppBrandUI_" + this.iqK.RL().iqL, hashCode());
      GMTrace.o(10482807209984L, 78103);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace("MicroMsg.AppBrandUI", localThrowable, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
      GMTrace.o(10482807209984L, 78103);
    }
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(10482672992256L, 78102);
    int i;
    if ((paramIntent != null) && ((paramIntent.getFlags() & 0x10000000) > 0)) {
      i = 1;
    }
    for (;;)
    {
      if ((i == 0) && (this.iqK.RL() != null))
      {
        this.iqK.RL().irg = true;
        String str = this.iqK.RL().iqL;
        if (d.c.iqC == com.tencent.mm.plugin.appbrand.d.nJ(str)) {
          com.tencent.mm.plugin.appbrand.d.a(str, d.c.iqF);
        }
      }
      try
      {
        this.iqK.RL().iqR.jkq.jkK = paramIntent;
        super.startActivityForResult(paramIntent, paramInt, paramBundle);
        GMTrace.o(10482672992256L, 78102);
        return;
        i = 0;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  private static class ProcessRestartTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<ProcessRestartTask> CREATOR;
    public String gPI;
    public String jpy;
    
    static
    {
      GMTrace.i(17662247698432L, 131594);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17662247698432L, 131594);
    }
    
    public ProcessRestartTask()
    {
      GMTrace.i(17661710827520L, 131590);
      GMTrace.o(17661710827520L, 131590);
    }
    
    public final void RS()
    {
      GMTrace.i(17661845045248L, 131591);
      com.tencent.mm.modelappbrand.b.gZ(this.gPI);
      com.tencent.mm.plugin.appbrand.task.b.rP(this.jpy);
      GMTrace.o(17661845045248L, 131591);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17662113480704L, 131593);
      this.gPI = paramParcel.readString();
      this.jpy = paramParcel.readString();
      GMTrace.o(17662113480704L, 131593);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17661979262976L, 131592);
      paramParcel.writeString(this.gPI);
      paramParcel.writeString(this.jpy);
      GMTrace.o(17661979262976L, 131592);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */