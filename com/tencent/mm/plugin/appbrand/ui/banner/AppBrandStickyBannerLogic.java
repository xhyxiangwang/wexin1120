package com.tencent.mm.plugin.appbrand.ui.banner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public enum AppBrandStickyBannerLogic
{
  static
  {
    GMTrace.i(15518119493632L, 115619);
    jtx = new AppBrandStickyBannerLogic[0];
    GMTrace.o(15518119493632L, 115619);
  }
  
  static final class OperateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateTask> CREATOR;
    String iZk;
    boolean jtE;
    int jtF;
    String jtG;
    int op;
    
    static
    {
      GMTrace.i(15523219767296L, 115657);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15523219767296L, 115657);
    }
    
    OperateTask()
    {
      GMTrace.i(15522146025472L, 115649);
      this.op = 0;
      GMTrace.o(15522146025472L, 115649);
    }
    
    static OperateTask ay(String paramString, int paramInt)
    {
      GMTrace.i(15522414460928L, 115651);
      OperateTask localOperateTask = new OperateTask();
      localOperateTask.op = 1;
      localOperateTask.iZk = paramString;
      localOperateTask.jtF = paramInt;
      GMTrace.o(15522414460928L, 115651);
      return localOperateTask;
    }
    
    static OperateTask az(String paramString, int paramInt)
    {
      GMTrace.i(15522548678656L, 115652);
      OperateTask localOperateTask = new OperateTask();
      localOperateTask.op = 3;
      localOperateTask.iZk = paramString;
      localOperateTask.jtF = paramInt;
      GMTrace.o(15522548678656L, 115652);
      return localOperateTask;
    }
    
    static OperateTask i(String paramString1, int paramInt, String paramString2)
    {
      GMTrace.i(17313415823360L, 128995);
      OperateTask localOperateTask = new OperateTask();
      localOperateTask.op = 2;
      localOperateTask.iZk = paramString1;
      localOperateTask.jtF = paramInt;
      localOperateTask.jtG = paramString2;
      GMTrace.o(17313415823360L, 128995);
      return localOperateTask;
    }
    
    public final void RS()
    {
      GMTrace.i(15522280243200L, 115650);
      switch (this.op)
      {
      }
      for (;;)
      {
        GMTrace.o(15522280243200L, 115650);
        return;
        this.jtE = AppBrandStickyBannerLogic.b.aw(this.iZk, this.jtF);
        VC();
        GMTrace.o(15522280243200L, 115650);
        return;
        AppBrandStickyBannerLogic.b.ax(this.iZk, this.jtF);
        GMTrace.o(15522280243200L, 115650);
        return;
        AppBrandStickyBannerLogic.b.b(this);
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15522951331840L, 115655);
      this.op = paramParcel.readInt();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.jtE = bool;
        this.iZk = paramParcel.readString();
        this.jtF = paramParcel.readInt();
        this.jtG = paramParcel.readString();
        GMTrace.o(15522951331840L, 115655);
        return;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15522817114112L, 115654);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.op);
      if (this.jtE) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeString(this.iZk);
        paramParcel.writeInt(this.jtF);
        paramParcel.writeString(this.jtG);
        GMTrace.o(15522817114112L, 115654);
        return;
      }
    }
  }
  
  private static final class Watcher
    extends MainProcessTask
  {
    public static final Parcelable.Creator<Watcher> CREATOR;
    private static final transient Map<String, Boolean> jtK;
    String jtH;
    String jtI;
    int jtJ;
    
    static
    {
      GMTrace.i(15522011807744L, 115648);
      jtK = new HashMap();
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15522011807744L, 115648);
    }
    
    Watcher()
    {
      GMTrace.i(15521743372288L, 115646);
      GMTrace.o(15521743372288L, 115646);
    }
    
    public final void RS()
    {
      GMTrace.i(15521206501376L, 115642);
      if (bg.mZ(this.jtH))
      {
        GMTrace.o(15521206501376L, 115642);
        return;
      }
      synchronized (jtK)
      {
        if ((jtK.containsKey(this.jtH)) && (((Boolean)jtK.get(this.jtH)).booleanValue()))
        {
          GMTrace.o(15521206501376L, 115642);
          return;
        }
        d.aQ(this);
        AppBrandStickyBannerLogic.b.d(new e()
        {
          public final void X(String paramAnonymousString, int paramAnonymousInt)
          {
            GMTrace.i(15515972009984L, 115603);
            AppBrandStickyBannerLogic.Watcher.this.jtI = paramAnonymousString;
            AppBrandStickyBannerLogic.Watcher.this.jtJ = paramAnonymousInt;
            AppBrandStickyBannerLogic.Watcher.a(AppBrandStickyBannerLogic.Watcher.this);
            GMTrace.o(15515972009984L, 115603);
          }
        });
        jtK.put(this.jtH, Boolean.valueOf(true));
        GMTrace.o(15521206501376L, 115642);
        return;
      }
    }
    
    public final void VB()
    {
      GMTrace.i(15521340719104L, 115643);
      AppBrandStickyBannerLogic.a.av(this.jtI, this.jtJ);
      GMTrace.o(15521340719104L, 115643);
    }
    
    public final int describeContents()
    {
      GMTrace.i(15521072283648L, 115641);
      GMTrace.o(15521072283648L, 115641);
      return 0;
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(15521609154560L, 115645);
      this.jtH = paramParcel.readString();
      this.jtI = paramParcel.readString();
      this.jtJ = paramParcel.readInt();
      GMTrace.o(15521609154560L, 115645);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15521474936832L, 115644);
      paramParcel.writeString(this.jtH);
      paramParcel.writeString(this.jtI);
      paramParcel.writeInt(this.jtJ);
      GMTrace.o(15521474936832L, 115644);
    }
  }
  
  public static final class a
  {
    public static volatile boolean jtA;
    public static String jtB;
    private static e jtC;
    private static final Map<String, String> jtD;
    private static final AppBrandStickyBannerLogic.Watcher jty;
    private static final Set<e> jtz;
    
    static
    {
      GMTrace.i(17316905484288L, 129021);
      jty = new AppBrandStickyBannerLogic.Watcher();
      jtz = new HashSet();
      jtC = new e()
      {
        public final void X(String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(17317845008384L, 129028);
          AppBrandSysConfig localAppBrandSysConfig = com.tencent.mm.plugin.appbrand.a.nx(AppBrandStickyBannerLogic.a.jtB);
          if (localAppBrandSysConfig != null) {}
          for (int i = localAppBrandSysConfig.iJa.iCx;; i = 0)
          {
            if ((AppBrandStickyBannerLogic.a.jtB != null) && (AppBrandStickyBannerLogic.a.jtB.equals(paramAnonymousString)) && (i == paramAnonymousInt)) {}
            for (boolean bool = true;; bool = false)
            {
              AppBrandStickyBannerLogic.a.jtA = bool;
              w.i("MicroMsg.AppBrandStickyBannerLogic", "onStickyBannerChanged(appId : %s, openType : %s), isStick(appId : %s) = %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), AppBrandStickyBannerLogic.a.jtB, Boolean.valueOf(AppBrandStickyBannerLogic.a.jtA) });
              GMTrace.o(17317845008384L, 129028);
              return;
            }
          }
        }
      };
      jtD = new HashMap();
      GMTrace.o(17316905484288L, 129021);
    }
    
    public static void a(Context paramContext, String paramString1, int paramInt, String paramString2, String paramString3)
    {
      GMTrace.i(17315831742464L, 129013);
      if (bg.mZ(paramString1))
      {
        GMTrace.o(17315831742464L, 129013);
        return;
      }
      if (paramContext == null) {
        paramContext = ab.getContext();
      }
      for (;;)
      {
        Intent localIntent = new Intent().setClassName(paramContext, "com.tencent.mm.ui.LauncherUI").addFlags(268435456).addFlags(67108864).addFlags(536870912);
        synchronized (jtD)
        {
          String str = (String)jtD.get(paramString1);
          b.a(localIntent, paramString1, paramInt, paramString2, paramString3, bg.mY(str));
          paramContext.startActivity(localIntent);
          if (!(paramContext instanceof Activity)) {}
        }
        GMTrace.o(17315831742464L, 129013);
        return;
      }
    }
    
    static void av(String paramString, int paramInt)
    {
      GMTrace.i(17315697524736L, 129012);
      synchronized (jtz)
      {
        Iterator localIterator = jtz.iterator();
        if (localIterator.hasNext()) {
          ((e)localIterator.next()).X(paramString, paramInt);
        }
      }
      GMTrace.o(17315697524736L, 129012);
    }
    
    public static boolean aw(String paramString, int paramInt)
    {
      GMTrace.i(17315965960192L, 129014);
      if ((bg.mZ(paramString)) || (paramInt < 0))
      {
        GMTrace.o(17315965960192L, 129014);
        return false;
      }
      AppBrandStickyBannerLogic.OperateTask localOperateTask = AppBrandStickyBannerLogic.OperateTask.ay(paramString, paramInt);
      boolean bool = AppBrandMainProcessService.b(localOperateTask);
      if (!bool)
      {
        w.w("MicroMsg.AppBrandStickyBannerLogic.ClientLogic", "execSync process task failed(%s, %s) use local state(%s).", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(jtA) });
        bool = jtA;
        GMTrace.o(17315965960192L, 129014);
        return bool;
      }
      if ((bool) && (localOperateTask.jtE))
      {
        GMTrace.o(17315965960192L, 129014);
        return true;
      }
      GMTrace.o(17315965960192L, 129014);
      return false;
    }
    
    public static void bj(String paramString1, String paramString2)
    {
      GMTrace.i(17316771266560L, 129020);
      if (bg.mZ(paramString1))
      {
        GMTrace.o(17316771266560L, 129020);
        return;
      }
      synchronized (jtD)
      {
        jtD.put(paramString1, bg.mY(paramString2));
        ??? = com.tencent.mm.plugin.appbrand.a.nx(paramString1);
        if (??? == null)
        {
          GMTrace.o(17316771266560L, 129020);
          return;
        }
      }
      AppBrandMainProcessService.a(AppBrandStickyBannerLogic.OperateTask.i(paramString1, ((AppBrandSysConfig)???).iJa.iCx, paramString2));
      GMTrace.o(17316771266560L, 129020);
    }
    
    public static void c(e parame)
    {
      GMTrace.i(17316100177920L, 129015);
      if (parame != null) {
        synchronized (jtz)
        {
          jtz.remove(parame);
          GMTrace.o(17316100177920L, 129015);
          return;
        }
      }
      GMTrace.o(17316100177920L, 129015);
    }
    
    public static void cB(boolean paramBoolean)
    {
      GMTrace.i(17316368613376L, 129017);
      jtA = paramBoolean;
      GMTrace.o(17316368613376L, 129017);
    }
    
    public static void d(e parame)
    {
      GMTrace.i(17316234395648L, 129016);
      jty.jtH = ab.vR();
      AppBrandMainProcessService.a(jty);
      if (parame != null) {
        synchronized (jtz)
        {
          jtz.add(parame);
          GMTrace.o(17316234395648L, 129016);
          return;
        }
      }
      GMTrace.o(17316234395648L, 129016);
    }
    
    public static void rX(String paramString)
    {
      GMTrace.i(17316502831104L, 129018);
      jtB = "";
      c(jtC);
      w.i("MicroMsg.AppBrandStickyBannerLogic", "release(%s)", new Object[] { paramString });
      GMTrace.o(17316502831104L, 129018);
    }
    
    public static void rY(String paramString)
    {
      GMTrace.i(17316637048832L, 129019);
      if (bg.mZ(paramString))
      {
        GMTrace.o(17316637048832L, 129019);
        return;
      }
      int i = com.tencent.mm.plugin.appbrand.a.nx(paramString).iJa.iCx;
      if (i < 0)
      {
        GMTrace.o(17316637048832L, 129019);
        return;
      }
      com.tencent.mm.plugin.appbrand.jsapi.h.pS(paramString);
      AppBrandMainProcessService.a(AppBrandStickyBannerLogic.OperateTask.az(paramString, i));
      GMTrace.o(17316637048832L, 129019);
    }
  }
  
  public static final class b
  {
    static final Set<e> gFw;
    
    static
    {
      GMTrace.i(17314892218368L, 129006);
      gFw = new HashSet();
      GMTrace.o(17314892218368L, 129006);
    }
    
    public static void aaB()
    {
      GMTrace.i(17314221129728L, 129001);
      ??? = BannerModel.aaC();
      String str1;
      if (??? == null)
      {
        str1 = null;
        if (??? != null) {
          break label80;
        }
      }
      label80:
      for (int i = -1;; i = ((BannerModel)???).iQS)
      {
        synchronized (gFw)
        {
          Iterator localIterator = gFw.iterator();
          if (!localIterator.hasNext()) {
            break label88;
          }
          ((e)localIterator.next()).X(str1, i);
        }
        String str2 = ((BannerModel)???).appId;
        break;
      }
      label88:
      GMTrace.o(17314221129728L, 129001);
    }
    
    static void aav()
    {
      GMTrace.i(17314086912000L, 129000);
      BannerModel localBannerModel = BannerModel.aaC();
      String str;
      if (localBannerModel == null)
      {
        str = null;
        if (localBannerModel != null) {
          break label63;
        }
      }
      label63:
      for (int i = -1;; i = localBannerModel.iQS)
      {
        w.i("MicroMsg.AppBrandStickyBannerLogic", "checkAfterProcessRestart stored banner %s, %d", new Object[] { str, Integer.valueOf(i) });
        GMTrace.o(17314086912000L, 129000);
        return;
        str = localBannerModel.appId;
        break;
      }
    }
    
    public static boolean aw(String paramString, int paramInt)
    {
      GMTrace.i(17314623782912L, 129004);
      BannerModel localBannerModel = BannerModel.aaD();
      if ((localBannerModel != null) && (!bg.mZ(paramString)) && (paramString.equals(localBannerModel.appId)) && (paramInt == localBannerModel.iQS))
      {
        GMTrace.o(17314623782912L, 129004);
        return true;
      }
      GMTrace.o(17314623782912L, 129004);
      return false;
    }
    
    public static void ax(String paramString, int paramInt)
    {
      GMTrace.i(17314758000640L, 129005);
      if (aw(paramString, paramInt))
      {
        b.aaw();
        aaB();
      }
      GMTrace.o(17314758000640L, 129005);
    }
    
    static void b(AppBrandStickyBannerLogic.OperateTask paramOperateTask)
    {
      GMTrace.i(17313952694272L, 128999);
      if (b.a(paramOperateTask)) {
        aaB();
      }
      GMTrace.o(17313952694272L, 128999);
    }
    
    public static void c(e parame)
    {
      GMTrace.i(17314489565184L, 129003);
      if (parame != null) {
        synchronized (gFw)
        {
          gFw.remove(parame);
          GMTrace.o(17314489565184L, 129003);
          return;
        }
      }
      GMTrace.o(17314489565184L, 129003);
    }
    
    public static void d(e parame)
    {
      GMTrace.i(17314355347456L, 129002);
      if (parame != null) {
        synchronized (gFw)
        {
          gFw.add(parame);
          GMTrace.o(17314355347456L, 129002);
          return;
        }
      }
      GMTrace.o(17314355347456L, 129002);
    }
    
    public static void w(Intent paramIntent)
    {
      GMTrace.i(17313818476544L, 128998);
      if ((paramIntent == null) || (!com.tencent.mm.kernel.h.xx().wM()))
      {
        GMTrace.o(17313818476544L, 128998);
        return;
      }
      com.tencent.mm.kernel.h.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17313684258816L, 128997);
          if (b.v(this.val$intent)) {
            AppBrandStickyBannerLogic.b.aaB();
          }
          GMTrace.o(17313684258816L, 128997);
        }
      });
      GMTrace.o(17313818476544L, 128998);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/banner/AppBrandStickyBannerLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */