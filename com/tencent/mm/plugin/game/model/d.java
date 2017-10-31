package com.tencent.mm.plugin.game.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private static BroadcastReceiver mzv;
  private static boolean mzw;
  public static int mzx;
  private static ae mzy;
  
  static
  {
    GMTrace.i(12598883909632L, 93869);
    mzv = null;
    mzw = false;
    mzx = -1;
    mzy = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12609487110144L, 93948);
        d.a locala = (d.a)paramAnonymousMessage.obj;
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(12609487110144L, 93948);
          return;
          int i = am.getNetType(ab.getContext());
          if ((locala != null) && (i == 0))
          {
            boolean bool = com.tencent.mm.plugin.downloader.model.f.aoQ().bf(locala.fti);
            if (!bool)
            {
              com.tencent.mm.plugin.downloader.model.f.aoQ().bc(locala.fti);
              if (locala.mzz != null) {
                d.b(locala.mzz);
              }
            }
            w.i("MicroMsg.GameAutoDownloader", "resumeTask, ret = " + bool);
            GMTrace.o(12609487110144L, 93948);
            return;
            if (locala != null) {
              com.tencent.mm.plugin.downloader.model.f.aoQ().bc(locala.fti);
            }
          }
        }
      }
    };
    GMTrace.o(12598883909632L, 93869);
  }
  
  public static void N(LinkedList<q> paramLinkedList)
  {
    GMTrace.i(16083981434880L, 119835);
    Object localObject = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      q localq = (q)localIterator.next();
      if (localq.field_expireTime <= System.currentTimeMillis() / 1000L)
      {
        w.i("MicroMsg.GameAutoDownloader", "expireTime expireTime = %d, currentTime = %d, appid = %s", new Object[] { Long.valueOf(localq.field_expireTime), Long.valueOf(System.currentTimeMillis() / 1000L), localq.field_appId });
        FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(localq.field_appId);
        if (localFileDownloadTaskInfo == null)
        {
          GMTrace.o(16083981434880L, 119835);
          return;
        }
        w.i("MicroMsg.GameAutoDownloader", "downloadId = %d, status = %d", new Object[] { Long.valueOf(localFileDownloadTaskInfo.id), Integer.valueOf(localFileDownloadTaskInfo.status) });
        if (localFileDownloadTaskInfo.id > 0L)
        {
          Message localMessage = new Message();
          localMessage.what = 2;
          a locala = new a();
          locala.fti = localFileDownloadTaskInfo.id;
          locala.mzz = localq;
          localMessage.obj = locala;
          mzy.sendMessageDelayed(localMessage, 2000L);
        }
        SubCoreGameCenter.aFe().a(localq, new String[0]);
        ((LinkedList)localObject).add(localq);
      }
    }
    if (!bg.bX((List)localObject))
    {
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramLinkedList.remove((q)((Iterator)localObject).next());
      }
    }
    GMTrace.o(16083981434880L, 119835);
  }
  
  public static void a(q paramq)
  {
    GMTrace.i(12597675950080L, 93860);
    paramq.aEq();
    if (paramq.mAB == 0) {}
    for (int i = 0; i == 0; i = 1)
    {
      FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramq.field_appId);
      w.i("MicroMsg.GameAutoDownloader", "downloadId = %d, status = %d", new Object[] { Long.valueOf(localFileDownloadTaskInfo.id), Integer.valueOf(localFileDownloadTaskInfo.status) });
      if (localFileDownloadTaskInfo.id > 0L) {
        com.tencent.mm.plugin.downloader.model.f.aoQ().bc(localFileDownloadTaskInfo.id);
      }
      SubCoreGameCenter.aFe().a(paramq, new String[0]);
      GMTrace.o(12597675950080L, 93860);
      return;
    }
    a(paramq, true);
    GMTrace.o(12597675950080L, 93860);
  }
  
  public static void a(q paramq, boolean paramBoolean)
  {
    GMTrace.i(12597944385536L, 93862);
    if (bg.mZ(paramq.field_appId))
    {
      w.e("MicroMsg.GameAutoDownloader", "appid = " + paramq.field_appId);
      GMTrace.o(12597944385536L, 93862);
      return;
    }
    w.i("MicroMsg.GameAutoDownloader", "addDownloadTask, appid = %s, initDownload = %s", new Object[] { paramq.field_appId, Boolean.valueOf(paramBoolean) });
    FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramq.field_appId);
    if (localFileDownloadTaskInfo == null)
    {
      GMTrace.o(12597944385536L, 93862);
      return;
    }
    if (g.n(ab.getContext(), paramq.field_appId))
    {
      SubCoreGameCenter.aFe().a(paramq, new String[0]);
      w.i("MicroMsg.GameAutoDownloader", "app is installed, appid = " + paramq.field_appId);
      GMTrace.o(12597944385536L, 93862);
      return;
    }
    w.i("MicroMsg.GameAutoDownloader", "downloadId = %d, status = %d", new Object[] { Long.valueOf(localFileDownloadTaskInfo.id), Integer.valueOf(localFileDownloadTaskInfo.status) });
    switch (localFileDownloadTaskInfo.status)
    {
    }
    for (;;)
    {
      GMTrace.o(12597944385536L, 93862);
      return;
      if ((paramBoolean) && (!localFileDownloadTaskInfo.kTy))
      {
        SubCoreGameCenter.aFe().a(paramq, new String[0]);
        GMTrace.o(12597944385536L, 93862);
        return;
        if ((paramBoolean) && (!localFileDownloadTaskInfo.kTy))
        {
          SubCoreGameCenter.aFe().a(paramq, new String[0]);
          GMTrace.o(12597944385536L, 93862);
          return;
        }
        Message localMessage = new Message();
        localMessage.what = 1;
        a locala = new a();
        locala.fti = localFileDownloadTaskInfo.id;
        locala.mzz = paramq;
        localMessage.obj = locala;
        mzy.sendMessageDelayed(localMessage, 2000L);
        GMTrace.o(12597944385536L, 93862);
        return;
        SubCoreGameCenter.aFe().a(paramq, new String[0]);
        GMTrace.o(12597944385536L, 93862);
        return;
        if ((am.getNetType(ab.getContext()) == 0) && (mzw)) {
          b(paramq);
        }
      }
    }
  }
  
  public static void aEb()
  {
    GMTrace.i(12597407514624L, 93858);
    if (mzv == null) {
      mzv = new b((byte)0);
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    try
    {
      ab.getContext().registerReceiver(mzv, localIntentFilter);
      mzw = true;
      GMTrace.o(12597407514624L, 93858);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.GameAutoDownloader", localException.getMessage());
      mzw = false;
      GMTrace.o(12597407514624L, 93858);
    }
  }
  
  public static void aEc()
  {
    GMTrace.i(12597541732352L, 93859);
    if (mzv != null) {}
    try
    {
      ab.getContext().unregisterReceiver(mzv);
      mzv = null;
      mzw = false;
      GMTrace.o(12597541732352L, 93859);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.GameAutoDownloader", localException.getMessage());
      }
    }
  }
  
  public static void b(q paramq)
  {
    GMTrace.i(12597810167808L, 93861);
    if (!ap.AV())
    {
      w.e("MicroMsg.GameAutoDownloader", "MMCore is not ready");
      GMTrace.o(12597810167808L, 93861);
      return;
    }
    if (ap.wG())
    {
      w.e("MicroMsg.GameAutoDownloader", "MMCore.isHold() = " + ap.wG());
      GMTrace.o(12597810167808L, 93861);
      return;
    }
    int i = paramq.mAl;
    ap.AS();
    if (!c.isSDCardAvailable())
    {
      w.e("MicroMsg.GameAutoDownloader", "sdCard is not available");
      i = 0;
    }
    while (i != 0) {
      if ((bg.mZ(paramq.mAj)) || (bg.mZ(paramq.mAk)) || (bg.mZ(paramq.field_appId)))
      {
        w.e("MicroMsg.GameAutoDownloader", "mAppDownloadURL = %s, mAppMD5 = %s, appId = %s", new Object[] { paramq.mAj, paramq.mAk, paramq.field_appId });
        GMTrace.o(12597810167808L, 93861);
        return;
        if (!com.tencent.mm.compatible.util.f.K(i))
        {
          w.e("MicroMsg.GameAutoDownloader", "sdCard have not enough space, need size = " + i);
          i = 0;
        }
        else
        {
          i = 1;
        }
      }
      else
      {
        com.tencent.mm.pluginsdk.model.app.f localf = g.aM(paramq.field_appId, true);
        if (localf == null)
        {
          w.e("MicroMsg.GameAutoDownloader", "appInfo = null");
          GMTrace.o(12597810167808L, 93861);
          return;
        }
        w.i("MicroMsg.GameAutoDownloader", "startDownloadTask, appid = %s, url = %s, md5 = %s", new Object[] { paramq.field_appId, paramq.mAj, paramq.mAk });
        g.a locala = new g.a();
        locala.va(paramq.mAj);
        locala.setAppId(paramq.field_appId);
        locala.bz(localf.field_packageName);
        locala.vc(g.a(ab.getContext(), localf, null));
        locala.vd(paramq.mAk);
        locala.dK(false);
        locala.dL(false);
        locala.mh(1);
        locala.dM(true);
        long l = com.tencent.mm.plugin.downloader.model.f.aoQ().a(locala.kTs);
        w.i("MicroMsg.GameAutoDownloader", "startDownloadTask id = " + l);
        if (l > 0L) {
          l.a(paramq.mAj, paramq.mAk, 1999, paramq.field_appId, null, null);
        }
      }
    }
    GMTrace.o(12597810167808L, 93861);
  }
  
  public static void c(q paramq)
  {
    GMTrace.i(16083847217152L, 119834);
    paramq = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramq.field_appId);
    if (paramq == null)
    {
      GMTrace.o(16083847217152L, 119834);
      return;
    }
    w.i("MicroMsg.GameAutoDownloader", "pauseDownloadTask, downloadId = %d, status = %d", new Object[] { Long.valueOf(paramq.id), Integer.valueOf(paramq.status) });
    if (paramq.status == 1)
    {
      boolean bool = com.tencent.mm.plugin.downloader.model.f.aoQ().be(paramq.id);
      if (!bool) {
        com.tencent.mm.plugin.downloader.model.f.aoQ().bc(paramq.id);
      }
      w.i("MicroMsg.GameAutoDownloader", "pauseDownloadTask ret = " + bool);
    }
    GMTrace.o(16083847217152L, 119834);
  }
  
  private static final class a
  {
    long fti;
    q mzz;
    
    public a()
    {
      GMTrace.i(12584656830464L, 93763);
      GMTrace.o(12584656830464L, 93763);
    }
  }
  
  private static final class b
    extends BroadcastReceiver
  {
    private b()
    {
      GMTrace.i(12616869085184L, 94003);
      GMTrace.o(12616869085184L, 94003);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(12617003302912L, 94004);
      if ((!ap.AV()) || (ap.wG()))
      {
        w.e("MicroMsg.GameAutoDownloader", "acc has not ready");
        GMTrace.o(12617003302912L, 94004);
        return;
      }
      int i = am.getNetType(ab.getContext());
      if (i == d.mzx)
      {
        GMTrace.o(12617003302912L, 94004);
        return;
      }
      d.mzx = i;
      w.i("MicroMsg.GameAutoDownloader", "onNetStateChange, netState = " + i);
      paramContext = SubCoreGameCenter.aFe().aEy();
      if (bg.bX(paramContext))
      {
        GMTrace.o(12617003302912L, 94004);
        return;
      }
      d.N(paramContext);
      if (i == 0)
      {
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          paramIntent = (q)paramContext.next();
          paramIntent.aEq();
          d.a(paramIntent, false);
        }
        GMTrace.o(12617003302912L, 94004);
        return;
      }
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        paramIntent = (q)paramContext.next();
        paramIntent.aEq();
        d.c(paramIntent);
      }
      GMTrace.o(12617003302912L, 94004);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */