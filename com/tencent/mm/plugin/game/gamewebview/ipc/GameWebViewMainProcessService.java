package com.tencent.mm.plugin.game.gamewebview.ipc;

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
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.game.gamewebview.model.e;
import com.tencent.mm.plugin.webview.model.ac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GameWebViewMainProcessService
  extends Service
{
  private static Messenger iOA;
  private static ServiceConnection iOv;
  private static final LinkedList<Parcel> iOw;
  private static Set<Object> iOx;
  private static Map<String, WeakReference<GWMainProcessTask>> iOy;
  private static Handler iOz;
  private static b mtW;
  private final Messenger iOs;
  private final Handler mHandler;
  private com.tencent.mm.plugin.game.gamewebview.model.d mtT;
  private e mtU;
  private final b.a mtV;
  
  static
  {
    GMTrace.i(16958678368256L, 126352);
    iOw = new LinkedList();
    iOx = new HashSet();
    iOy = new ConcurrentHashMap();
    iOz = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16954114965504L, 126318);
        paramAnonymousMessage = GameWebViewMainProcessService.d(paramAnonymousMessage.getData(), false);
        GWMainProcessTask localGWMainProcessTask = GameWebViewMainProcessService.yJ(paramAnonymousMessage.iPd);
        if (localGWMainProcessTask == null)
        {
          w.e("MicroMsg.GameWebViewMainProcessService", "receive client msg, get null task by id %s", new Object[] { paramAnonymousMessage.iPd });
          GMTrace.o(16954114965504L, 126318);
          return;
        }
        GameWebViewMainProcessService.b(paramAnonymousMessage, localGWMainProcessTask);
        localGWMainProcessTask.VB();
        GMTrace.o(16954114965504L, 126318);
      }
    };
    iOA = new Messenger(iOz);
    GMTrace.o(16958678368256L, 126352);
  }
  
  public GameWebViewMainProcessService()
  {
    GMTrace.i(16955859795968L, 126331);
    this.mHandler = new Handler(com.tencent.mm.plugin.game.gamewebview.a.d.xC().nTP.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(16951162175488L, 126296);
        GameWebViewMainProcessService.d(paramAnonymousMessage.getData(), true).RS();
        GMTrace.o(16951162175488L, 126296);
      }
    };
    this.iOs = new Messenger(this.mHandler);
    this.mtV = new b.a()
    {
      public final void u(Bundle paramAnonymousBundle)
      {
        GMTrace.i(16948075167744L, 126273);
        Message localMessage = Message.obtain();
        localMessage.setData(paramAnonymousBundle);
        GameWebViewMainProcessService.a(GameWebViewMainProcessService.this).send(localMessage);
        GMTrace.o(16948075167744L, 126273);
      }
      
      public final void v(Bundle paramAnonymousBundle)
      {
        GMTrace.i(16948209385472L, 126274);
        GameWebViewMainProcessService.d(paramAnonymousBundle, false).RS();
        GMTrace.o(16948209385472L, 126274);
      }
    };
    GMTrace.o(16955859795968L, 126331);
  }
  
  private static void Vp()
  {
    GMTrace.i(16956933537792L, 126339);
    if (iOv == null) {
      iOv = new ServiceConnection()
      {
        public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
        {
          GMTrace.i(16946330337280L, 126260);
          GameWebViewMainProcessService.a(b.a.R(paramAnonymousIBinder));
          GameWebViewMainProcessService.Vq();
          GameWebViewMainProcessService.Vr();
          w.i("MicroMsg.GameWebViewMainProcessService", "onServiceConnected(%s)", new Object[] { ab.vR() });
          GMTrace.o(16946330337280L, 126260);
        }
        
        public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
        {
          GMTrace.i(16946464555008L, 126261);
          GameWebViewMainProcessService.a(null);
          GameWebViewMainProcessService.Vs();
          GameWebViewMainProcessService.aCL();
          w.i("MicroMsg.GameWebViewMainProcessService", "onServiceDisconnected(%s)", new Object[] { ab.vR() });
          GMTrace.o(16946464555008L, 126261);
        }
      };
    }
    w.i("MicroMsg.GameWebViewMainProcessService", "tryBindService");
    Context localContext = ab.getContext();
    localContext.bindService(new Intent(localContext, GameWebViewMainProcessService.class), iOv, 1);
    GMTrace.o(16956933537792L, 126339);
  }
  
  static Bundle a(GWMainProcessTask paramGWMainProcessTask, boolean paramBoolean)
  {
    GMTrace.i(16957201973248L, 126341);
    Bundle localBundle = new Bundle(3);
    localBundle.putParcelable("task_object", paramGWMainProcessTask);
    if (paramBoolean) {
      localBundle.putParcelable("task_client", iOA);
    }
    localBundle.putString("task_id", paramGWMainProcessTask.iPd);
    GMTrace.o(16957201973248L, 126341);
    return localBundle;
  }
  
  public static void a(GWMainProcessTask paramGWMainProcessTask)
  {
    GMTrace.i(16956396666880L, 126335);
    iOy.put(paramGWMainProcessTask.iPd, new WeakReference(paramGWMainProcessTask));
    t(a(paramGWMainProcessTask, true));
    GMTrace.o(16956396666880L, 126335);
  }
  
  private static void a(GWMainProcessTask paramGWMainProcessTask1, GWMainProcessTask paramGWMainProcessTask2)
  {
    GMTrace.i(16957067755520L, 126340);
    Parcel localParcel = Parcel.obtain();
    paramGWMainProcessTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramGWMainProcessTask2.f(localParcel);
    localParcel.recycle();
    GMTrace.o(16957067755520L, 126340);
  }
  
  public static boolean b(GWMainProcessTask paramGWMainProcessTask)
  {
    GMTrace.i(16956530884608L, 126336);
    Bundle localBundle = a(paramGWMainProcessTask, false);
    if (s(localBundle))
    {
      a(c(localBundle, false), paramGWMainProcessTask);
      paramGWMainProcessTask.VB();
      GMTrace.o(16956530884608L, 126336);
      return true;
    }
    GMTrace.o(16956530884608L, 126336);
    return false;
  }
  
  private static GWMainProcessTask c(Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(16957336190976L, 126342);
    paramBundle.setClassLoader(GWMainProcessTask.class.getClassLoader());
    GWMainProcessTask localGWMainProcessTask = (GWMainProcessTask)paramBundle.getParcelable("task_object");
    if (paramBoolean) {
      localGWMainProcessTask.iPc = ((Messenger)paramBundle.getParcelable("task_client"));
    }
    localGWMainProcessTask.iPd = paramBundle.getString("task_id");
    GMTrace.o(16957336190976L, 126342);
    return localGWMainProcessTask;
  }
  
  private static boolean s(Bundle paramBundle)
  {
    GMTrace.i(16956665102336L, 126337);
    boolean bool = true;
    try
    {
      mtW.v(paramBundle);
      GMTrace.o(16956665102336L, 126337);
      return bool;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        bool = false;
        w.e("MicroMsg.GameWebViewMainProcessService", paramBundle.getMessage());
      }
    }
  }
  
  private static void t(Bundle paramBundle)
  {
    GMTrace.i(16956799320064L, 126338);
    if (mtW == null)
    {
      Vp();
      synchronized (iOw)
      {
        LinkedList localLinkedList2 = iOw;
        Parcel localParcel = Parcel.obtain();
        paramBundle.writeToParcel(localParcel, 0);
        localLinkedList2.add(localParcel);
        GMTrace.o(16956799320064L, 126338);
        return;
      }
    }
    try
    {
      mtW.u(paramBundle);
      GMTrace.o(16956799320064L, 126338);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.GameWebViewMainProcessService", paramBundle.getMessage());
      GMTrace.o(16956799320064L, 126338);
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(16956262449152L, 126334);
    paramIntent = this.mtV;
    GMTrace.o(16956262449152L, 126334);
    return paramIntent;
  }
  
  public void onCreate()
  {
    GMTrace.i(16955994013696L, 126332);
    w.i("MicroMsg.GameWebViewMainProcessService", "onCreate");
    super.onCreate();
    if (h.xx().wM())
    {
      this.mtT = new com.tencent.mm.plugin.game.gamewebview.model.d();
      com.tencent.mm.plugin.webview.modeltools.f.bAJ().a(this.mtT);
    }
    this.mtU = new e();
    com.tencent.mm.plugin.downloader.model.f.aoQ();
    c.a(this.mtU);
    GMTrace.o(16955994013696L, 126332);
  }
  
  public void onDestroy()
  {
    GMTrace.i(16956128231424L, 126333);
    w.i("MicroMsg.GameWebViewMainProcessService", "onDestroy");
    super.onDestroy();
    com.tencent.mm.plugin.downloader.model.f.aoQ();
    c.b(this.mtU);
    if (ap.AV()) {
      com.tencent.mm.plugin.webview.modeltools.f.bAJ().b(this.mtT);
    }
    GMTrace.o(16956128231424L, 126333);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/GameWebViewMainProcessService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */