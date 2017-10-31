package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AppBrandMainProcessService
  extends Service
{
  private static Messenger iOA;
  private static c iOu;
  private static ServiceConnection iOv;
  private static final LinkedList<Parcel> iOw;
  private static Set<a> iOx;
  private static Map<String, WeakReference<MainProcessTask>> iOy;
  private static Handler iOz;
  private final Messenger iOs;
  private final c.a iOt;
  private final Handler mHandler;
  
  static
  {
    GMTrace.i(10274098642944L, 76548);
    iOw = new LinkedList();
    iOx = new HashSet();
    iOy = new ConcurrentHashMap();
    iOz = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(10288191504384L, 76653);
        paramAnonymousMessage = AppBrandMainProcessService.b(paramAnonymousMessage.getData(), false);
        MainProcessTask localMainProcessTask = AppBrandMainProcessService.pM(paramAnonymousMessage.iPd);
        if (localMainProcessTask == null)
        {
          w.e("MicroMsg.AppBrandMainProcessService", "receive client msg, get null task by id %s", new Object[] { paramAnonymousMessage.iPd });
          GMTrace.o(10288191504384L, 76653);
          return;
        }
        AppBrandMainProcessService.b(paramAnonymousMessage, localMainProcessTask);
        localMainProcessTask.VB();
        GMTrace.o(10288191504384L, 76653);
      }
    };
    iOA = new Messenger(iOz);
    GMTrace.o(10274098642944L, 76548);
  }
  
  public AppBrandMainProcessService()
  {
    GMTrace.i(10271280070656L, 76527);
    this.mHandler = new Handler(d.xC().nTP.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(10280541093888L, 76596);
        AppBrandMainProcessService.b(paramAnonymousMessage.getData(), true).RS();
        GMTrace.o(10280541093888L, 76596);
      }
    };
    this.iOs = new Messenger(this.mHandler);
    this.iOt = new c.a()
    {
      public final void u(Bundle paramAnonymousBundle)
      {
        GMTrace.i(10274367078400L, 76550);
        Message localMessage = Message.obtain();
        localMessage.setData(paramAnonymousBundle);
        AppBrandMainProcessService.a(AppBrandMainProcessService.this).send(localMessage);
        GMTrace.o(10274367078400L, 76550);
      }
      
      public final void v(Bundle paramAnonymousBundle)
      {
        GMTrace.i(10274501296128L, 76551);
        AppBrandMainProcessService.b(paramAnonymousBundle, false).RS();
        GMTrace.o(10274501296128L, 76551);
      }
    };
    GMTrace.o(10271280070656L, 76527);
  }
  
  public static void Vp()
  {
    GMTrace.i(10272085377024L, 76533);
    if (iOv == null) {
      iOv = new ServiceConnection()
      {
        public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
        {
          GMTrace.i(10282017488896L, 76607);
          AppBrandMainProcessService.a(c.a.G(paramAnonymousIBinder));
          AppBrandMainProcessService.Vq();
          AppBrandMainProcessService.Vr();
          w.i("MicroMsg.AppBrandMainProcessService", "onServiceConnected(%s)", new Object[] { ab.vR() });
          GMTrace.o(10282017488896L, 76607);
        }
        
        public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
        {
          GMTrace.i(10282151706624L, 76608);
          AppBrandMainProcessService.a(null);
          AppBrandMainProcessService.Vs();
          AppBrandMainProcessService.Vp();
          w.i("MicroMsg.AppBrandMainProcessService", "onServiceDisconnected(%s)", new Object[] { ab.vR() });
          GMTrace.o(10282151706624L, 76608);
        }
      };
    }
    w.i("MicroMsg.AppBrandMainProcessService", "tryBindService");
    Context localContext = ab.getContext();
    localContext.bindService(new Intent(localContext, AppBrandMainProcessService.class), iOv, 1);
    GMTrace.o(10272085377024L, 76533);
  }
  
  static Bundle a(MainProcessTask paramMainProcessTask, boolean paramBoolean)
  {
    GMTrace.i(10272622247936L, 76537);
    Bundle localBundle = new Bundle(3);
    localBundle.putParcelable("task_object", paramMainProcessTask);
    if (paramBoolean) {
      localBundle.putParcelable("task_client", iOA);
    }
    localBundle.putString("task_id", paramMainProcessTask.iPd);
    GMTrace.o(10272622247936L, 76537);
    return localBundle;
  }
  
  private static MainProcessTask a(Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(10272756465664L, 76538);
    paramBundle.setClassLoader(MainProcessTask.class.getClassLoader());
    MainProcessTask localMainProcessTask = (MainProcessTask)paramBundle.getParcelable("task_object");
    if (paramBoolean) {
      localMainProcessTask.iPc = ((Messenger)paramBundle.getParcelable("task_client"));
    }
    localMainProcessTask.iPd = paramBundle.getString("task_id");
    GMTrace.o(10272756465664L, 76538);
    return localMainProcessTask;
  }
  
  public static void a(a parama)
  {
    GMTrace.i(10272219594752L, 76534);
    iOx.add(parama);
    GMTrace.o(10272219594752L, 76534);
  }
  
  public static void a(MainProcessTask paramMainProcessTask)
  {
    GMTrace.i(10271548506112L, 76529);
    iOy.put(paramMainProcessTask.iPd, new WeakReference(paramMainProcessTask));
    t(a(paramMainProcessTask, true));
    GMTrace.o(10271548506112L, 76529);
  }
  
  private static void a(MainProcessTask paramMainProcessTask1, MainProcessTask paramMainProcessTask2)
  {
    GMTrace.i(10272488030208L, 76536);
    Parcel localParcel = Parcel.obtain();
    paramMainProcessTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramMainProcessTask2.f(localParcel);
    localParcel.recycle();
    GMTrace.o(10272488030208L, 76536);
  }
  
  public static void b(a parama)
  {
    GMTrace.i(10272353812480L, 76535);
    iOx.remove(parama);
    GMTrace.o(10272353812480L, 76535);
  }
  
  public static boolean b(MainProcessTask paramMainProcessTask)
  {
    GMTrace.i(10271682723840L, 76530);
    Bundle localBundle = a(paramMainProcessTask, false);
    if (s(localBundle))
    {
      a(a(localBundle, false), paramMainProcessTask);
      paramMainProcessTask.VB();
      GMTrace.o(10271682723840L, 76530);
      return true;
    }
    GMTrace.o(10271682723840L, 76530);
    return false;
  }
  
  private static boolean s(Bundle paramBundle)
  {
    GMTrace.i(10271816941568L, 76531);
    boolean bool = true;
    try
    {
      iOu.v(paramBundle);
      GMTrace.o(10271816941568L, 76531);
      return bool;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        bool = false;
        w.e("MicroMsg.AppBrandMainProcessService", paramBundle.getMessage());
      }
    }
  }
  
  private static void t(Bundle paramBundle)
  {
    GMTrace.i(10271951159296L, 76532);
    if (iOu == null)
    {
      Vp();
      synchronized (iOw)
      {
        LinkedList localLinkedList2 = iOw;
        Parcel localParcel = Parcel.obtain();
        paramBundle.writeToParcel(localParcel, 0);
        localLinkedList2.add(localParcel);
        GMTrace.o(10271951159296L, 76532);
        return;
      }
    }
    try
    {
      iOu.u(paramBundle);
      GMTrace.o(10271951159296L, 76532);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.AppBrandMainProcessService", paramBundle.getMessage());
      GMTrace.o(10271951159296L, 76532);
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(10271414288384L, 76528);
    paramIntent = this.iOt;
    GMTrace.o(10271414288384L, 76528);
    return paramIntent;
  }
  
  public static class a
  {
    public a()
    {
      GMTrace.i(10270877417472L, 76524);
      GMTrace.o(10270877417472L, 76524);
    }
    
    public void RJ()
    {
      GMTrace.i(10271145852928L, 76526);
      GMTrace.o(10271145852928L, 76526);
    }
    
    public void onServiceConnected()
    {
      GMTrace.i(10271011635200L, 76525);
      GMTrace.o(10271011635200L, 76525);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ipc/AppBrandMainProcessService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */