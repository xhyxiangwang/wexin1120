package com.tencent.mm.plugin.qqmail.stub;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.downloader.model.n;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI.b;
import com.tencent.mm.plugin.qqmail.ui.ReadMailUI.c;
import com.tencent.mm.pluginsdk.ui.tools.i;
import com.tencent.mm.pluginsdk.ui.tools.i.a;
import com.tencent.mm.remoteservice.a;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.remoteservice.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import java.net.URI;
import java.net.URL;
import java.util.Map;

public class ReadMailProxy
  extends a
{
  private p.a oGN;
  private ReadMailUI.b oGO;
  private ReadMailUI.c oGP;
  private n oGQ;
  private i.a oGR;
  private p.a oGa;
  
  public ReadMailProxy(d paramd, p.a parama)
  {
    super(paramd);
    GMTrace.i(5569364623360L, 41495);
    this.oGQ = new n()
    {
      public final void bp(long paramAnonymousLong)
      {
        GMTrace.i(5576075509760L, 41545);
        GMTrace.o(5576075509760L, 41545);
      }
      
      public final void c(long paramAnonymousLong, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(5575807074304L, 41543);
        ReadMailProxy.this.CLIENT_CALL("onTaskFailed", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(5575807074304L, 41543);
      }
      
      public final void c(long paramAnonymousLong, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(5575672856576L, 41542);
        ReadMailProxy.this.CLIENT_CALL("onTaskFinished", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(5575672856576L, 41542);
      }
      
      public final void k(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(14307207151616L, 106597);
        GMTrace.o(14307207151616L, 106597);
      }
      
      public final void onTaskPaused(long paramAnonymousLong)
      {
        GMTrace.i(5575941292032L, 41544);
        ReadMailProxy.this.CLIENT_CALL("onTaskPaused", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(5575941292032L, 41544);
      }
      
      public final void onTaskRemoved(long paramAnonymousLong)
      {
        GMTrace.i(5575538638848L, 41541);
        ReadMailProxy.this.CLIENT_CALL("onTaskRemoved", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(5575538638848L, 41541);
      }
      
      public final void onTaskStarted(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(5575404421120L, 41540);
        ReadMailProxy.this.CLIENT_CALL("onTaskStarted", new Object[] { Long.valueOf(paramAnonymousLong), paramAnonymousString });
        GMTrace.o(5575404421120L, 41540);
      }
    };
    this.oGR = new i.a()
    {
      public final void aXf()
      {
        GMTrace.i(5574196461568L, 41531);
        ReadMailProxy.this.CLIENT_CALL("onGetQQMailUnreadFailed", new Object[0]);
        GMTrace.o(5574196461568L, 41531);
      }
      
      public final void sF(int paramAnonymousInt)
      {
        GMTrace.i(5574062243840L, 41530);
        ReadMailProxy.this.CLIENT_CALL("onGetQQMailUnreadSuccess", new Object[] { Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(5574062243840L, 41530);
      }
    };
    this.oGa = parama;
    this.oGN = new p.a()
    {
      public final void onComplete()
      {
        GMTrace.i(5574867550208L, 41536);
        ReadMailProxy.this.CLIENT_CALL("onComplete", new Object[0]);
        GMTrace.o(5574867550208L, 41536);
      }
      
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5574733332480L, 41535);
        ReadMailProxy.this.CLIENT_CALL("onError", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        GMTrace.o(5574733332480L, 41535);
      }
      
      public final boolean onReady()
      {
        GMTrace.i(5574464897024L, 41533);
        boolean bool = ((Boolean)ReadMailProxy.this.CLIENT_CALL("onReady", new Object[0])).booleanValue();
        GMTrace.o(5574464897024L, 41533);
        return bool;
      }
      
      public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(5574599114752L, 41534);
        ReadMailProxy.this.CLIENT_CALL("onSuccess", new Object[] { paramAnonymousString, paramAnonymousMap });
        GMTrace.o(5574599114752L, 41534);
      }
    };
    GMTrace.o(5569364623360L, 41495);
  }
  
  public ReadMailProxy(d paramd, p.a parama, ReadMailUI.b paramb, ReadMailUI.c paramc)
  {
    super(paramd);
    GMTrace.i(5569498841088L, 41496);
    this.oGQ = new n()
    {
      public final void bp(long paramAnonymousLong)
      {
        GMTrace.i(5576075509760L, 41545);
        GMTrace.o(5576075509760L, 41545);
      }
      
      public final void c(long paramAnonymousLong, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(5575807074304L, 41543);
        ReadMailProxy.this.CLIENT_CALL("onTaskFailed", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(5575807074304L, 41543);
      }
      
      public final void c(long paramAnonymousLong, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(5575672856576L, 41542);
        ReadMailProxy.this.CLIENT_CALL("onTaskFinished", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(5575672856576L, 41542);
      }
      
      public final void k(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(14307207151616L, 106597);
        GMTrace.o(14307207151616L, 106597);
      }
      
      public final void onTaskPaused(long paramAnonymousLong)
      {
        GMTrace.i(5575941292032L, 41544);
        ReadMailProxy.this.CLIENT_CALL("onTaskPaused", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(5575941292032L, 41544);
      }
      
      public final void onTaskRemoved(long paramAnonymousLong)
      {
        GMTrace.i(5575538638848L, 41541);
        ReadMailProxy.this.CLIENT_CALL("onTaskRemoved", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(5575538638848L, 41541);
      }
      
      public final void onTaskStarted(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(5575404421120L, 41540);
        ReadMailProxy.this.CLIENT_CALL("onTaskStarted", new Object[] { Long.valueOf(paramAnonymousLong), paramAnonymousString });
        GMTrace.o(5575404421120L, 41540);
      }
    };
    this.oGR = new i.a()
    {
      public final void aXf()
      {
        GMTrace.i(5574196461568L, 41531);
        ReadMailProxy.this.CLIENT_CALL("onGetQQMailUnreadFailed", new Object[0]);
        GMTrace.o(5574196461568L, 41531);
      }
      
      public final void sF(int paramAnonymousInt)
      {
        GMTrace.i(5574062243840L, 41530);
        ReadMailProxy.this.CLIENT_CALL("onGetQQMailUnreadSuccess", new Object[] { Integer.valueOf(paramAnonymousInt) });
        GMTrace.o(5574062243840L, 41530);
      }
    };
    this.oGa = parama;
    this.oGO = paramb;
    this.oGP = paramc;
    this.oGN = new p.a()
    {
      public final void onComplete()
      {
        GMTrace.i(5576880816128L, 41551);
        ReadMailProxy.this.CLIENT_CALL("onComplete", new Object[0]);
        GMTrace.o(5576880816128L, 41551);
      }
      
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5576746598400L, 41550);
        ReadMailProxy.this.CLIENT_CALL("onError", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        GMTrace.o(5576746598400L, 41550);
      }
      
      public final boolean onReady()
      {
        GMTrace.i(5576478162944L, 41548);
        boolean bool = ((Boolean)ReadMailProxy.this.CLIENT_CALL("onReady", new Object[0])).booleanValue();
        GMTrace.o(5576478162944L, 41548);
        return bool;
      }
      
      public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(5576612380672L, 41549);
        ReadMailProxy.this.CLIENT_CALL("onSuccess", new Object[] { paramAnonymousString, paramAnonymousMap });
        GMTrace.o(5576612380672L, 41549);
      }
    };
    GMTrace.o(5569498841088L, 41496);
  }
  
  @com.tencent.mm.remoteservice.f
  public void addDownloadCallback()
  {
    GMTrace.i(5572048977920L, 41515);
    com.tencent.mm.plugin.downloader.model.f.aoQ();
    com.tencent.mm.plugin.downloader.model.c.c(this.oGQ);
    GMTrace.o(5572048977920L, 41515);
  }
  
  @com.tencent.mm.remoteservice.f
  public void cancel(final long paramLong)
  {
    GMTrace.i(5571109453824L, 41508);
    new ae().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5575135985664L, 41538);
        com.tencent.mm.plugin.qqmail.b.w.aXa().cancel(paramLong);
        GMTrace.o(5575135985664L, 41538);
      }
    });
    GMTrace.o(5571109453824L, 41508);
  }
  
  @com.tencent.mm.remoteservice.f
  public void deleteMsgById(long paramLong)
  {
    GMTrace.i(5571780542464L, 41513);
    ap.AS();
    com.tencent.mm.x.c.yN().cJ(paramLong);
    GMTrace.o(5571780542464L, 41513);
  }
  
  @com.tencent.mm.remoteservice.f
  public long downloadQQMailApp(String paramString1, String paramString2)
  {
    GMTrace.i(5572317413376L, 41517);
    try
    {
      paramString1 = new URL(paramString1);
      paramString1 = new URI(paramString1.getProtocol(), paramString1.getUserInfo(), paramString1.getHost(), paramString1.getPort(), paramString1.getPath(), paramString1.getQuery(), paramString1.getRef()).toURL();
      g.a locala = new g.a();
      locala.va(paramString1.toString());
      locala.vc("qqmail.apk");
      locala.vd(paramString2);
      locala.dK(true);
      locala.mh(1);
      l = com.tencent.mm.plugin.downloader.model.f.aoQ().a(locala.kTs);
      GMTrace.o(5572317413376L, 41517);
      return l;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ReadMailProxy", "dz[download qq mail error:%s]", new Object[] { paramString1.toString() });
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.ReadMailProxy", paramString1, "", new Object[0]);
        long l = -1L;
      }
    }
  }
  
  @com.tencent.mm.remoteservice.f
  public long get(String paramString, Map paramMap, Bundle paramBundle)
  {
    GMTrace.i(5570841018368L, 41506);
    p.c localc = new p.c();
    localc.fromBundle(paramBundle);
    long l = com.tencent.mm.plugin.qqmail.b.w.aXa().b(paramString, paramMap, localc, this.oGN);
    GMTrace.o(5570841018368L, 41506);
    return l;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getBindUin()
  {
    GMTrace.i(5572585848832L, 41519);
    ap.AS();
    String str = new o(bg.e((Integer)com.tencent.mm.x.c.xi().get(9, null))).toString();
    GMTrace.o(5572585848832L, 41519);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public Map getCookie()
  {
    GMTrace.i(5571646324736L, 41512);
    Map localMap = com.tencent.mm.plugin.qqmail.b.w.aXa().getCookie();
    GMTrace.o(5571646324736L, 41512);
    return localMap;
  }
  
  @com.tencent.mm.remoteservice.f
  public double getMailAppDownloadProgress(long paramLong)
  {
    GMTrace.i(5573256937472L, 41524);
    FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.f.aoQ().bd(paramLong);
    if (localFileDownloadTaskInfo.fCd <= 0L)
    {
      GMTrace.o(5573256937472L, 41524);
      return 0.0D;
    }
    double d = 1.0D * localFileDownloadTaskInfo.fCc / localFileDownloadTaskInfo.fCd;
    GMTrace.o(5573256937472L, 41524);
    return d;
  }
  
  @com.tencent.mm.remoteservice.f
  public Integer getMailAppDownloadStatus(long paramLong)
  {
    GMTrace.i(5573122719744L, 41523);
    int i = com.tencent.mm.plugin.downloader.model.f.aoQ().bd(paramLong).status;
    GMTrace.o(5573122719744L, 41523);
    return Integer.valueOf(i);
  }
  
  @com.tencent.mm.remoteservice.f
  public String getMailAppEnterUlAndroid()
  {
    GMTrace.i(5572854284288L, 41521);
    String str = com.tencent.mm.k.g.uA().getMailAppEnterUlAndroid();
    GMTrace.o(5572854284288L, 41521);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getMailAppRedirectUrlAndroid()
  {
    GMTrace.i(5572988502016L, 41522);
    String str = com.tencent.mm.k.g.uA().uo();
    GMTrace.o(5572988502016L, 41522);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getMsgContent(long paramLong)
  {
    GMTrace.i(5571377889280L, 41510);
    ap.AS();
    String str = com.tencent.mm.x.c.yN().cI(paramLong).field_content;
    GMTrace.o(5571377889280L, 41510);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public Object getUneradMailCountFromConfig()
  {
    GMTrace.i(5573793808384L, 41528);
    ap.AS();
    Object localObject = com.tencent.mm.x.c.xi().get(w.a.uVb, Integer.valueOf(-1));
    GMTrace.o(5573793808384L, 41528);
    return localObject;
  }
  
  @com.tencent.mm.remoteservice.f
  public void getUnreadMailCount()
  {
    GMTrace.i(5573659590656L, 41527);
    i.a(this.oGR);
    GMTrace.o(5573659590656L, 41527);
  }
  
  @com.tencent.mm.remoteservice.f
  public String getUserBindEmail()
  {
    GMTrace.i(5571914760192L, 41514);
    String str = m.getUserBindEmail();
    GMTrace.o(5571914760192L, 41514);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean isSDCardAvailable()
  {
    GMTrace.i(5571243671552L, 41509);
    ap.AS();
    boolean bool = com.tencent.mm.x.c.isSDCardAvailable();
    GMTrace.o(5571243671552L, 41509);
    return bool;
  }
  
  @e
  public void onComplete()
  {
    GMTrace.i(5570035712000L, 41500);
    if (this.oGa != null) {
      this.oGa.onComplete();
    }
    GMTrace.o(5570035712000L, 41500);
  }
  
  @e
  public void onError(int paramInt, String paramString)
  {
    GMTrace.i(5569901494272L, 41499);
    if (this.oGa != null) {
      this.oGa.onError(paramInt, paramString);
    }
    GMTrace.o(5569901494272L, 41499);
  }
  
  @e
  public boolean onReady()
  {
    GMTrace.i(5569633058816L, 41497);
    if (this.oGa == null)
    {
      GMTrace.o(5569633058816L, 41497);
      return true;
    }
    boolean bool = this.oGa.onReady();
    GMTrace.o(5569633058816L, 41497);
    return bool;
  }
  
  @e
  public void onSuccess(String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(5569767276544L, 41498);
    if (this.oGa != null) {
      this.oGa.onSuccess(paramString, paramMap);
    }
    GMTrace.o(5569767276544L, 41498);
  }
  
  @e
  public void onTaskFailed(long paramLong)
  {
    GMTrace.i(5570706800640L, 41505);
    if (this.oGO != null) {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ReadMailUI", "onTaskFailed id:%d", new Object[] { Long.valueOf(paramLong) });
    }
    GMTrace.o(5570706800640L, 41505);
  }
  
  @e
  public void onTaskFinished(long paramLong)
  {
    GMTrace.i(5570572582912L, 41504);
    if (this.oGO != null) {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ReadMailUI", "onTaskFinished id:%d", new Object[] { Long.valueOf(paramLong) });
    }
    GMTrace.o(5570572582912L, 41504);
  }
  
  @e
  public void onTaskPaused(long paramLong)
  {
    GMTrace.i(5570438365184L, 41503);
    if (this.oGO != null) {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ReadMailUI", "onTaskPaused id:%d", new Object[] { Long.valueOf(paramLong) });
    }
    GMTrace.o(5570438365184L, 41503);
  }
  
  @e
  public void onTaskRemoved(long paramLong)
  {
    GMTrace.i(5570304147456L, 41502);
    if (this.oGO != null) {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ReadMailUI", "onTaskRemoved id:%d", new Object[] { Long.valueOf(paramLong) });
    }
    GMTrace.o(5570304147456L, 41502);
  }
  
  @e
  public void onTaskStarted(long paramLong, String paramString)
  {
    GMTrace.i(5570169929728L, 41501);
    if (this.oGO != null)
    {
      ReadMailUI.b localb = this.oGO;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ReadMailUI", "onTaskStarted id:%d, saveFilePath:%s", new Object[] { Long.valueOf(paramLong), paramString });
      ReadMailUI.a(localb.oLr, ab.getContext().getSharedPreferences("QQMAIL", 4));
      if (ReadMailUI.o(localb.oLr) != null) {
        ReadMailUI.o(localb.oLr).edit().putString("qqmail_downloadpath", paramString).commit();
      }
    }
    GMTrace.o(5570169929728L, 41501);
  }
  
  @com.tencent.mm.remoteservice.f
  public long post(String paramString, Map paramMap, Bundle paramBundle)
  {
    GMTrace.i(5570975236096L, 41507);
    p.c localc = new p.c();
    localc.fromBundle(paramBundle);
    long l = com.tencent.mm.plugin.qqmail.b.w.aXa().a(paramString, paramMap, localc, this.oGN);
    GMTrace.o(5570975236096L, 41507);
    return l;
  }
  
  @com.tencent.mm.remoteservice.f
  public void removeDownloadCallback()
  {
    GMTrace.i(5572183195648L, 41516);
    com.tencent.mm.plugin.downloader.model.f.aoQ();
    com.tencent.mm.plugin.downloader.model.c.aoO();
    GMTrace.o(5572183195648L, 41516);
  }
  
  @com.tencent.mm.remoteservice.f
  public int removeDownloadQQMailAppTask(long paramLong)
  {
    GMTrace.i(5572451631104L, 41518);
    int i = com.tencent.mm.plugin.downloader.model.f.aoQ().bc(paramLong);
    GMTrace.o(5572451631104L, 41518);
    return i;
  }
  
  @com.tencent.mm.remoteservice.f
  public void replaceMsgContent(final long paramLong, String paramString)
  {
    GMTrace.i(5571512107008L, 41511);
    new ae().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5577417687040L, 41555);
        ap.AS();
        au localau = com.tencent.mm.x.c.yN().cI(paramLong);
        localau.setContent(localau.field_content.replaceFirst("<digest>.*</digest>", "<digest>" + this.jaX + "</digest>"));
        ap.AS();
        com.tencent.mm.x.c.yN().a(paramLong, localau);
        GMTrace.o(5577417687040L, 41555);
      }
    });
    GMTrace.o(5571512107008L, 41511);
  }
  
  @com.tencent.mm.remoteservice.f
  public void reportKvState(int paramInt1, int paramInt2)
  {
    GMTrace.i(5573391155200L, 41525);
    com.tencent.mm.plugin.report.service.g.paX.i(paramInt1, new Object[] { Integer.valueOf(paramInt2) });
    GMTrace.o(5573391155200L, 41525);
  }
  
  @com.tencent.mm.remoteservice.f
  public void reportKvStates(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5573525372928L, 41526);
    com.tencent.mm.plugin.report.service.g.paX.i(paramInt1, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    GMTrace.o(5573525372928L, 41526);
  }
  
  @com.tencent.mm.remoteservice.f
  public Integer showMailAppRecommend()
  {
    GMTrace.i(5572720066560L, 41520);
    if (com.tencent.mm.sdk.platformtools.f.fjU == 1)
    {
      GMTrace.o(5572720066560L, 41520);
      return Integer.valueOf(0);
    }
    int i = bg.getInt(com.tencent.mm.k.g.uA().y("MailApp", "ShowMailAppRecommend"), 0);
    GMTrace.o(5572720066560L, 41520);
    return Integer.valueOf(i);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/stub/ReadMailProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */