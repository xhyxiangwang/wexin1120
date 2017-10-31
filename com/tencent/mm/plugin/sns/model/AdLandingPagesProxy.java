package com.tencent.mm.plugin.sns.model;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.cd.a;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.a.pv.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.plugin.sns.ui.SnsTransparentUI;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.protocal.c.ku;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AdLandingPagesProxy
  extends com.tencent.mm.remoteservice.a
{
  private static AdLandingPagesProxy pZF;
  private com.tencent.mm.ac.e hnC;
  private Map<Long, a> pZG;
  private Map<k, Long> pZH;
  private com.tencent.mm.remoteservice.d pZI;
  private Map<Long, a.a> pZJ;
  private Map<Long, a.a> pZK;
  
  public AdLandingPagesProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
    GMTrace.i(15235456958464L, 113513);
    this.pZG = new HashMap();
    this.pZH = new HashMap();
    this.hnC = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(15245925941248L, 113591);
        w.i("AdLandingPagesProxy", "errType %d,errCode %d,errMsg %s,scene %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousk.toString() });
        long l;
        if ((paramAnonymousk instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.b))
        {
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.b))
            {
              paramAnonymousString = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.b)paramAnonymousk).fHI;
              w.i("AdLandingPagesProxy", "the dynamic string is " + paramAnonymousString);
              if (AdLandingPagesProxy.a(AdLandingPagesProxy.this).containsKey(paramAnonymousk))
              {
                l = ((Long)AdLandingPagesProxy.a(AdLandingPagesProxy.this).remove(paramAnonymousk)).longValue();
                AdLandingPagesProxy.this.CLIENT_CALL("onDynamicUpdateEnd", new Object[] { Long.valueOf(l), paramAnonymousString });
              }
              GMTrace.o(15245925941248L, 113591);
            }
          }
          else
          {
            w.e("AdLandingPagesProxy", "the netscene is error ,error type is " + paramAnonymousInt1 + " error msg is " + paramAnonymousString);
            GMTrace.o(15245925941248L, 113591);
          }
        }
        else if (((paramAnonymousk instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.a)) && (AdLandingPagesProxy.a(AdLandingPagesProxy.this).containsKey(paramAnonymousk)))
        {
          l = ((Long)AdLandingPagesProxy.a(AdLandingPagesProxy.this).remove(paramAnonymousk)).longValue();
          paramAnonymousString = (ku)((com.tencent.mm.ac.b)paramAnonymousk.hmv).hlV.hmc;
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousString == null)) {
            break label362;
          }
        }
        for (;;)
        {
          try
          {
            paramAnonymousString = paramAnonymousString.toByteArray();
            AdLandingPagesProxy.this.CLIENT_CALL("onAdChannelEnd", new Object[] { Long.valueOf(l), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            GMTrace.o(15245925941248L, 113591);
            return;
          }
          catch (IOException paramAnonymousString)
          {
            w.e("AdLandingPagesProxy", bg.f(paramAnonymousString));
          }
          GMTrace.o(15245925941248L, 113591);
          return;
          label362:
          paramAnonymousString = null;
        }
      }
    };
    this.pZJ = new HashMap();
    this.pZK = new HashMap();
    if (paramd == null)
    {
      h.xA();
      h.xy().gQO.a(1337, this.hnC);
      h.xA();
      h.xy().gQO.a(1210, this.hnC);
    }
    this.pZI = paramd;
    GMTrace.o(15235456958464L, 113513);
  }
  
  private static SharedPreferences bgl()
  {
    GMTrace.i(16638300651520L, 123965);
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences(ab.getPackageName() + "_comm_preferences", 0);
    GMTrace.o(16638300651520L, 123965);
    return localSharedPreferences;
  }
  
  public static void create(com.tencent.mm.remoteservice.d paramd)
  {
    GMTrace.i(15235322740736L, 113512);
    pZF = new AdLandingPagesProxy(paramd);
    GMTrace.o(15235322740736L, 113512);
  }
  
  public static AdLandingPagesProxy getInstance()
  {
    GMTrace.i(15235591176192L, 113514);
    if (pZF == null) {
      throw new IllegalStateException("init first");
    }
    AdLandingPagesProxy localAdLandingPagesProxy = pZF;
    GMTrace.o(15235591176192L, 113514);
    return localAdLandingPagesProxy;
  }
  
  @com.tencent.mm.remoteservice.e
  public void addCanvasCache(long paramLong, String paramString)
  {
    GMTrace.i(18584323489792L, 138464);
    REMOTE_CALL("addCanvasCacheMM", new Object[] { Long.valueOf(paramLong), paramString });
    GMTrace.o(18584323489792L, 138464);
  }
  
  @com.tencent.mm.remoteservice.f
  public void addCanvasCacheMM(long paramLong, String paramString)
  {
    GMTrace.i(18584457707520L, 138465);
    i.bjG().o(paramLong, paramString);
    GMTrace.o(18584457707520L, 138465);
  }
  
  public void addReportInfo(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18584189272064L, 138463);
    REMOTE_CALL("addReportInfoMM", new Object[] { paramString1, paramString2, paramString3 });
    GMTrace.o(18584189272064L, 138463);
  }
  
  @com.tencent.mm.remoteservice.f
  public void addReportInfoMM(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18584055054336L, 138462);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      GMTrace.o(18584055054336L, 138462);
      return;
    }
    paramString2 = new a.b(paramString2, paramString3);
    locala.qmy.put(paramString1, paramString2);
    GMTrace.o(18584055054336L, 138462);
  }
  
  @com.tencent.mm.remoteservice.e
  public void asyncCacheXml(String paramString)
  {
    GMTrace.i(18584591925248L, 138466);
    REMOTE_CALL("asyncCacheXmlMM", new Object[] { paramString });
    GMTrace.o(18584591925248L, 138466);
  }
  
  @com.tencent.mm.remoteservice.f
  public void asyncCacheXmlMM(final String paramString)
  {
    GMTrace.i(18584726142976L, 138467);
    h.xA();
    h.xC().h(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18585397231616L, 138472);
        Object localObject = ae.bhp().Hz(paramString);
        if (localObject != null)
        {
          localObject = ((com.tencent.mm.plugin.sns.storage.m)localObject).bjH();
          if (localObject != null)
          {
            AdLandingPagesProxy.a(AdLandingPagesProxy.this, ((com.tencent.mm.plugin.sns.storage.b)localObject).bip());
            AdLandingPagesProxy.a(AdLandingPagesProxy.this, ((com.tencent.mm.plugin.sns.storage.b)localObject).biq());
          }
        }
        GMTrace.o(18585397231616L, 138472);
      }
    }, 5000L);
    GMTrace.o(18584726142976L, 138467);
  }
  
  public int contactGetTypeTextFromUserName(String paramString)
  {
    GMTrace.i(15236262264832L, 113519);
    paramString = REMOTE_CALL("contactGetTypeTextFromUserNameMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15236262264832L, 113519);
      return 0;
    }
    int i = ((Integer)paramString).intValue();
    GMTrace.o(15236262264832L, 113519);
    return i;
  }
  
  @com.tencent.mm.remoteservice.f
  public int contactGetTypeTextFromUserNameMM(String paramString)
  {
    GMTrace.i(15236396482560L, 113520);
    int i = com.tencent.mm.x.o.fY(paramString);
    GMTrace.o(15236396482560L, 113520);
    return i;
  }
  
  public void deleteDeferredDeepLink(String paramString)
  {
    GMTrace.i(16638032216064L, 123963);
    REMOTE_CALL("deleteDeferredDeepLinkMM", new Object[] { paramString });
    GMTrace.o(16638032216064L, 123963);
  }
  
  @com.tencent.mm.remoteservice.f
  public void deleteDeferredDeepLinkMM(String paramString)
  {
    GMTrace.i(16638166433792L, 123964);
    bgl().edit().remove(paramString).commit();
    GMTrace.o(16638166433792L, 123964);
  }
  
  public void doAdChannelScene(String paramString1, String paramString2, a parama)
  {
    GMTrace.i(15240020361216L, 113547);
    long l = System.currentTimeMillis();
    this.pZG.put(Long.valueOf(l), parama);
    REMOTE_CALL("doAdChannelSceneMM", new Object[] { Long.valueOf(l), paramString1, paramString2 });
    GMTrace.o(15240020361216L, 113547);
  }
  
  @com.tencent.mm.remoteservice.f
  public void doAdChannelSceneMM(long paramLong, String paramString1, String paramString2)
  {
    GMTrace.i(15240154578944L, 113548);
    paramString1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.a(paramString1, paramString2);
    this.pZH.put(paramString1, Long.valueOf(paramLong));
    h.xA();
    h.xy().gQO.a(paramString1, 0);
    GMTrace.o(15240154578944L, 113548);
  }
  
  public void doDynamicUpdateScene(String paramString1, String paramString2, String paramString3, a parama)
  {
    GMTrace.i(15239483490304L, 113543);
    long l = System.currentTimeMillis();
    this.pZG.put(Long.valueOf(l), parama);
    REMOTE_CALL("doDynamicUpdateSceneMM", new Object[] { Long.valueOf(l), paramString1, paramString2, paramString3 });
    GMTrace.o(15239483490304L, 113543);
  }
  
  @com.tencent.mm.remoteservice.f
  public void doDynamicUpdateSceneMM(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(15239617708032L, 113544);
    paramString1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.b(paramString1, paramString2, paramString3);
    this.pZH.put(paramString1, Long.valueOf(paramLong));
    h.xA();
    h.xy().gQO.a(paramString1, 0);
    GMTrace.o(15239617708032L, 113544);
  }
  
  public int doFav(Intent paramIntent, int paramInt)
  {
    GMTrace.i(15238946619392L, 113539);
    paramIntent = REMOTE_CALL("doFavMM", new Object[] { paramIntent, Integer.valueOf(paramInt) });
    if (paramIntent == null)
    {
      GMTrace.o(15238946619392L, 113539);
      return 0;
    }
    paramInt = ((Integer)paramIntent).intValue();
    GMTrace.o(15238946619392L, 113539);
    return paramInt;
  }
  
  public int doFavAdlanding(long paramLong, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt2, String paramString7)
  {
    GMTrace.i(16637495345152L, 123959);
    paramString1 = REMOTE_CALL("doFavAdlandingMM", new Object[] { Long.valueOf(paramLong), paramString1, Integer.valueOf(paramInt1), paramString2, paramString3, paramString4, paramString5, paramString6, Integer.valueOf(paramInt2), paramString7 });
    if (paramString1 == null)
    {
      GMTrace.o(16637495345152L, 123959);
      return 0;
    }
    paramInt1 = ((Integer)paramString1).intValue();
    GMTrace.o(16637495345152L, 123959);
    return paramInt1;
  }
  
  @com.tencent.mm.remoteservice.f
  public int doFavAdlandingMM(long paramLong, String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt2, String paramString7)
  {
    GMTrace.i(16637629562880L, 123960);
    boolean bool = false;
    cd localcd = new cd();
    if (((paramInt1 == 1) || (paramInt1 == 2) || (paramInt1 == 3) || (paramInt1 == 4) || (paramInt1 == 9) || (paramInt1 == 10) || (paramInt1 == 11)) && (!bg.mZ(paramString1)))
    {
      paramString7 = new pv();
      paramString7.fNF.fNI = paramString1;
      paramString7.fNF.fNJ = localcd;
      paramString7.fNF.url = paramString2;
      com.tencent.mm.sdk.b.a.uLm.m(paramString7);
      bool = paramString7.fNG.fwc;
    }
    while (!bool)
    {
      if (localcd.fwt.fwz == 0) {
        localcd.fwt.fwz = i.j.dWJ;
      }
      paramInt1 = localcd.fwt.fwz;
      GMTrace.o(16637629562880L, 123960);
      return paramInt1;
      if (((paramInt1 == 5) || (paramInt1 == 6)) && (paramLong != -2147483648L)) {
        bool = ((com.tencent.mm.plugin.fav.a.b)h.h(com.tencent.mm.plugin.fav.a.b.class)).a(localcd, paramLong);
      } else if ((paramInt1 == 13) || (paramInt1 == 14)) {
        bool = ((com.tencent.mm.plugin.fav.a.b)h.h(com.tencent.mm.plugin.fav.a.b.class)).a(localcd, paramString4.hashCode(), com.tencent.mm.x.m.zF(), paramString4, paramString5, paramString6, paramString7);
      }
    }
    paramString1 = com.tencent.mm.x.q.gi(paramString3);
    localcd.fwt.fwy = paramString1;
    localcd.fwt.title = paramString4;
    localcd.fwt.desc = paramString5;
    paramString1 = localcd.fwt.fwv;
    if ((paramString1 != null) && (paramString1.tQC != null) && (paramString1.tQC.size() > 0) && (paramString1.tQC.get(0) != null))
    {
      ((sp)paramString1.tQC.get(0)).PM(paramString6);
      ((sp)paramString1.tQC.get(0)).Pn(paramString4);
      ((sp)paramString1.tQC.get(0)).Po(paramString5);
    }
    paramString1.Qd(paramString4);
    paramString1.Qe(paramString5);
    localcd.fwt.fwA = paramInt2;
    com.tencent.mm.sdk.b.a.uLm.m(localcd);
    paramInt1 = localcd.fwt.fwz;
    GMTrace.o(16637629562880L, 123960);
    return paramInt1;
  }
  
  @com.tencent.mm.remoteservice.f
  public int doFavMM(Intent paramIntent, int paramInt)
  {
    GMTrace.i(15239080837120L, 113540);
    cd localcd = new cd();
    ((com.tencent.mm.plugin.fav.a.b)h.h(com.tencent.mm.plugin.fav.a.b.class)).a(localcd, paramIntent);
    localcd.fwt.fwA = paramInt;
    com.tencent.mm.sdk.b.a.uLm.m(localcd);
    paramInt = localcd.fwt.fwz;
    GMTrace.o(15239080837120L, 113540);
    return paramInt;
  }
  
  public void doTransimt(Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(15239215054848L, 113541);
    Intent localIntent = new Intent(ab.getContext(), SnsTransparentUI.class);
    localIntent.putExtra("adlandingXml", paramString1);
    localIntent.putExtra("shareTitle", paramString2);
    localIntent.putExtra("shareThumbUrl", paramString3);
    localIntent.putExtra("shareDesc", paramString4);
    localIntent.putExtra("shareUrl", paramString5);
    localIntent.putExtra("op", 2);
    paramActivity.startActivity(localIntent);
    GMTrace.o(15239215054848L, 113541);
  }
  
  @com.tencent.mm.remoteservice.f
  public void doTransimtMM(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(15239349272576L, 113542);
    GMTrace.o(15239349272576L, 113542);
  }
  
  @com.tencent.mm.remoteservice.e
  public void failed(long paramLong)
  {
    GMTrace.i(15242167844864L, 113563);
    a.a locala = (a.a)this.pZK.get(Long.valueOf(paramLong));
    if (locala != null)
    {
      locala.bgp();
      this.pZK.remove(Long.valueOf(paramLong));
    }
    GMTrace.o(15242167844864L, 113563);
  }
  
  public void favEditTag()
  {
    GMTrace.i(15238275530752L, 113534);
    REMOTE_CALL("favEditTagMM", new Object[0]);
    GMTrace.o(15238275530752L, 113534);
  }
  
  @com.tencent.mm.remoteservice.f
  public void favEditTagMM()
  {
    GMTrace.i(15238409748480L, 113535);
    fr localfr = new fr();
    localfr.fBn.type = 35;
    com.tencent.mm.sdk.b.a.uLm.m(localfr);
    GMTrace.o(15238409748480L, 113535);
  }
  
  public String getAccSnsPath()
  {
    GMTrace.i(15236799135744L, 113523);
    String str = (String)REMOTE_CALL("getAccSnsPathMM", new Object[0]);
    GMTrace.o(15236799135744L, 113523);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getAccSnsPathMM()
  {
    GMTrace.i(15236933353472L, 113524);
    String str = ae.getAccSnsPath();
    GMTrace.o(15236933353472L, 113524);
    return str;
  }
  
  public Object getCfg(int paramInt, Object paramObject)
  {
    GMTrace.i(15235993829376L, 113517);
    Object localObject = REMOTE_CALL("getCfgMM", new Object[] { Integer.valueOf(paramInt), paramObject });
    if (localObject == null)
    {
      GMTrace.o(15235993829376L, 113517);
      return paramObject;
    }
    GMTrace.o(15235993829376L, 113517);
    return localObject;
  }
  
  @com.tencent.mm.remoteservice.f
  public Object getCfgMM(int paramInt, Object paramObject)
  {
    GMTrace.i(15236128047104L, 113518);
    h.xA();
    paramObject = h.xz().xi().get(paramInt, paramObject);
    GMTrace.o(15236128047104L, 113518);
    return paramObject;
  }
  
  public String getExpIdByKey(String paramString)
  {
    GMTrace.i(15238007095296L, 113532);
    paramString = (String)REMOTE_CALL("getExpIdByKeyMM", new Object[] { paramString });
    GMTrace.o(15238007095296L, 113532);
    return paramString;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getExpIdByKeyMM(String paramString)
  {
    GMTrace.i(15237872877568L, 113531);
    paramString = com.tencent.mm.x.c.c.Cv().getExpIdByKey(paramString);
    GMTrace.o(15237872877568L, 113531);
    return paramString;
  }
  
  public int getExpValueByKey(String paramString, int paramInt)
  {
    GMTrace.i(15237738659840L, 113530);
    paramString = REMOTE_CALL("getExpValueByKeyMM", new Object[] { paramString, Integer.valueOf(paramInt) });
    if (paramString == null)
    {
      GMTrace.o(15237738659840L, 113530);
      return -1;
    }
    paramInt = ((Integer)paramString).intValue();
    GMTrace.o(15237738659840L, 113530);
    return paramInt;
  }
  
  @com.tencent.mm.remoteservice.f
  public int getExpValueByKeyMM(String paramString, int paramInt)
  {
    GMTrace.i(15237604442112L, 113529);
    paramInt = com.tencent.mm.x.c.c.Cv().cK(paramString, paramInt);
    GMTrace.o(15237604442112L, 113529);
    return paramInt;
  }
  
  public String getSnsAid(String paramString)
  {
    GMTrace.i(20066892513280L, 149510);
    paramString = (String)REMOTE_CALL("getSnsAidMM", new Object[] { paramString });
    GMTrace.o(20066892513280L, 149510);
    return paramString;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getSnsAidMM(String paramString)
  {
    GMTrace.i(20067026731008L, 149511);
    paramString = ae.bhp().Hz(paramString);
    if (paramString != null)
    {
      paramString = paramString.bkl();
      GMTrace.o(20067026731008L, 149511);
      return paramString;
    }
    GMTrace.o(20067026731008L, 149511);
    return "";
  }
  
  public com.tencent.mm.plugin.sns.storage.m getSnsInfo(String paramString)
  {
    GMTrace.i(15237067571200L, 113525);
    Bundle localBundle = (Bundle)REMOTE_CALL("getSnsInfoMM", new Object[] { paramString });
    if (localBundle == null)
    {
      GMTrace.o(15237067571200L, 113525);
      return null;
    }
    paramString = new com.tencent.mm.plugin.sns.storage.m();
    if (localBundle != null)
    {
      Object localObject = (ContentValues)localBundle.getParcelable("values");
      paramString.field_snsId = ((ContentValues)localObject).getAsLong("snsId").longValue();
      paramString.field_userName = ((ContentValues)localObject).getAsString("userName");
      paramString.field_localFlag = ((ContentValues)localObject).getAsInteger("localFlag").intValue();
      paramString.field_createTime = ((ContentValues)localObject).getAsInteger("createTime").intValue();
      paramString.field_head = ((ContentValues)localObject).getAsInteger("head").intValue();
      paramString.field_localPrivate = ((ContentValues)localObject).getAsInteger("localPrivate").intValue();
      paramString.field_type = ((ContentValues)localObject).getAsInteger("type").intValue();
      paramString.field_sourceType = ((ContentValues)localObject).getAsInteger("sourceType").intValue();
      paramString.field_likeFlag = ((ContentValues)localObject).getAsInteger("likeFlag").intValue();
      paramString.field_pravited = ((ContentValues)localObject).getAsInteger("pravited").intValue();
      paramString.field_stringSeq = ((ContentValues)localObject).getAsString("stringSeq");
      paramString.field_content = ((ContentValues)localObject).getAsByteArray("content");
      paramString.field_attrBuf = ((ContentValues)localObject).getAsByteArray("attrBuf");
      paramString.field_postBuf = ((ContentValues)localObject).getAsByteArray("postBuf");
      paramString.field_subType = ((ContentValues)localObject).getAsInteger("subType").intValue();
      if (((ContentValues)localObject).containsKey("rowid")) {
        paramString.uQF = ((ContentValues)localObject).getAsLong("rowid").longValue();
      }
      paramString.quQ = localBundle.getInt("localid");
      localBundle = localBundle.getBundle("adValues");
      if (localBundle != null)
      {
        localObject = new com.tencent.mm.plugin.sns.storage.e();
        ((com.tencent.mm.plugin.sns.storage.e)localObject).C(localBundle);
        paramString.qva = ((com.tencent.mm.plugin.sns.storage.e)localObject);
      }
    }
    GMTrace.o(15237067571200L, 113525);
    return paramString;
  }
  
  @com.tencent.mm.remoteservice.f
  public Bundle getSnsInfoMM(String paramString)
  {
    GMTrace.i(15237201788928L, 113526);
    paramString = ae.bhp().Hz(paramString);
    if (paramString == null)
    {
      GMTrace.o(15237201788928L, 113526);
      return null;
    }
    paramString = paramString.bjO();
    GMTrace.o(15237201788928L, 113526);
    return paramString;
  }
  
  public String getSnsStatExtBySnsId(long paramLong)
  {
    GMTrace.i(15236530700288L, 113521);
    String str = (String)REMOTE_CALL("getSnsStatExtBySnsIdMM", new Object[] { Long.valueOf(paramLong) });
    GMTrace.o(15236530700288L, 113521);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getSnsStatExtBySnsIdMM(long paramLong)
  {
    GMTrace.i(15236664918016L, 113522);
    Object localObject = ae.bhr().dI(paramLong);
    if (localObject != null)
    {
      localObject = com.tencent.mm.plugin.sns.a.b.f.a(((com.tencent.mm.plugin.sns.storage.e)localObject).bjL());
      GMTrace.o(15236664918016L, 113522);
      return (String)localObject;
    }
    w.v("SnsAdExtUtil", "getSnsStatExtBySnsId snsInfo null, snsId %s", new Object[] { Long.valueOf(paramLong) });
    GMTrace.o(15236664918016L, 113522);
    return "";
  }
  
  public String getSnsTraceid(String paramString)
  {
    GMTrace.i(20067160948736L, 149512);
    paramString = (String)REMOTE_CALL("getSnsTraceidMM", new Object[] { paramString });
    GMTrace.o(20067160948736L, 149512);
    return paramString;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getSnsTraceidMM(String paramString)
  {
    GMTrace.i(20067295166464L, 149513);
    paramString = ae.bhp().Hz(paramString);
    if (paramString != null)
    {
      paramString = paramString.bkm();
      GMTrace.o(20067295166464L, 149513);
      return paramString;
    }
    GMTrace.o(20067295166464L, 149513);
    return "";
  }
  
  public int getTaskProgress(String paramString)
  {
    GMTrace.i(15244449546240L, 113580);
    paramString = REMOTE_CALL("getTaskProgressMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15244449546240L, 113580);
      return -1;
    }
    int i = ((Integer)paramString).intValue();
    GMTrace.o(15244449546240L, 113580);
    return i;
  }
  
  @com.tencent.mm.remoteservice.f
  public int getTaskProgressMM(String paramString)
  {
    GMTrace.i(15244315328512L, 113579);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    paramString = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramString);
    if (paramString.fCd != 0L)
    {
      int i = (int)(paramString.fCc * 100L / paramString.fCd);
      GMTrace.o(15244315328512L, 113579);
      return i;
    }
    GMTrace.o(15244315328512L, 113579);
    return 0;
  }
  
  public String getUin()
  {
    GMTrace.i(20374116892672L, 151799);
    Object localObject = REMOTE_CALL("getUinMM", new Object[0]);
    if (localObject == null)
    {
      GMTrace.o(20374116892672L, 151799);
      return "";
    }
    localObject = (String)localObject;
    GMTrace.o(20374116892672L, 151799);
    return (String)localObject;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getUinMM()
  {
    GMTrace.i(20374251110400L, 151800);
    h.xx();
    String str = new com.tencent.mm.a.o(com.tencent.mm.kernel.a.wy()).toString();
    GMTrace.o(20374251110400L, 151800);
    return str;
  }
  
  public boolean installApp(Context paramContext, String paramString)
  {
    GMTrace.i(15244986417152L, 113584);
    paramContext = REMOTE_CALL("installAppMM", new Object[] { paramString });
    if (paramContext == null)
    {
      GMTrace.o(15244986417152L, 113584);
      return false;
    }
    boolean bool = ((Boolean)paramContext).booleanValue();
    GMTrace.o(15244986417152L, 113584);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean installAppMM(String paramString)
  {
    GMTrace.i(15244852199424L, 113583);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    Context localContext = ab.getContext();
    if ((localContext == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(15244852199424L, 113583);
      return false;
    }
    paramString = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramString);
    if ((paramString != null) && (paramString.status == 3) && (!TextUtils.isEmpty(paramString.path)))
    {
      Uri localUri = Uri.fromFile(new File(paramString.path));
      locala.E(4, paramString.id);
      boolean bool = com.tencent.mm.pluginsdk.model.app.q.e(localContext, localUri);
      GMTrace.o(15244852199424L, 113583);
      return bool;
    }
    GMTrace.o(15244852199424L, 113583);
    return false;
  }
  
  @com.tencent.mm.remoteservice.e
  public boolean isApkExist(String paramString)
  {
    GMTrace.i(15240423014400L, 113550);
    paramString = REMOTE_CALL("isApkExistMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15240423014400L, 113550);
      return false;
    }
    boolean bool = ((Boolean)paramString).booleanValue();
    GMTrace.o(15240423014400L, 113550);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean isApkExistMM(String paramString)
  {
    GMTrace.i(15240557232128L, 113551);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    paramString = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramString);
    if ((paramString != null) && (!TextUtils.isEmpty(paramString.path)) && (new File(paramString.path).exists()))
    {
      GMTrace.o(15240557232128L, 113551);
      return true;
    }
    GMTrace.o(15240557232128L, 113551);
    return false;
  }
  
  public int isAutoAdDownload()
  {
    GMTrace.i(15238141313024L, 113533);
    Object localObject = REMOTE_CALL("isAutoAdDownloadMM", new Object[0]);
    if (localObject == null)
    {
      GMTrace.o(15238141313024L, 113533);
      return 0;
    }
    int i = ((Integer)localObject).intValue();
    GMTrace.o(15238141313024L, 113533);
    return i;
  }
  
  @com.tencent.mm.remoteservice.f
  public int isAutoAdDownloadMM()
  {
    GMTrace.i(15238543966208L, 113536);
    int i = ae.bhm().b(null, null);
    GMTrace.o(15238543966208L, 113536);
    return i;
  }
  
  public boolean isConnected()
  {
    GMTrace.i(15235725393920L, 113515);
    if (this.pZI == null)
    {
      GMTrace.o(15235725393920L, 113515);
      return false;
    }
    boolean bool = this.pZI.isConnected();
    GMTrace.o(15235725393920L, 113515);
    return bool;
  }
  
  public boolean isDownloading(String paramString)
  {
    GMTrace.i(15240825667584L, 113553);
    paramString = REMOTE_CALL("isDownloadingMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15240825667584L, 113553);
      return false;
    }
    boolean bool = ((Boolean)paramString).booleanValue();
    GMTrace.o(15240825667584L, 113553);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean isDownloadingMM(String paramString)
  {
    GMTrace.i(15240691449856L, 113552);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    paramString = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramString);
    if ((paramString != null) && (paramString.status == 1))
    {
      GMTrace.o(15240691449856L, 113552);
      return true;
    }
    GMTrace.o(15240691449856L, 113552);
    return false;
  }
  
  public boolean isPaused(String paramString)
  {
    GMTrace.i(15241362538496L, 113557);
    paramString = REMOTE_CALL("isPausedMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15241362538496L, 113557);
      return false;
    }
    boolean bool = ((Boolean)paramString).booleanValue();
    GMTrace.o(15241362538496L, 113557);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean isPausedMM(String paramString)
  {
    GMTrace.i(15241228320768L, 113556);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    paramString = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramString);
    if ((paramString != null) && (paramString.status == 2))
    {
      GMTrace.o(15241228320768L, 113556);
      return true;
    }
    GMTrace.o(15241228320768L, 113556);
    return false;
  }
  
  public boolean isPkgInstalled(String paramString)
  {
    GMTrace.i(15241094103040L, 113555);
    paramString = REMOTE_CALL("isPkgInstalledMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15241094103040L, 113555);
      return false;
    }
    boolean bool = ((Boolean)paramString).booleanValue();
    GMTrace.o(15241094103040L, 113555);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean isPkgInstalledMM(String paramString)
  {
    GMTrace.i(15240959885312L, 113554);
    Object localObject = a.c.qmA;
    localObject = ab.getContext();
    if ((localObject == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(15240959885312L, 113554);
      return false;
    }
    boolean bool = p.n((Context)localObject, paramString);
    GMTrace.o(15240959885312L, 113554);
    return bool;
  }
  
  public boolean isRecExpAd(String paramString)
  {
    GMTrace.i(20067429384192L, 149514);
    paramString = REMOTE_CALL("isRecExpAdMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(20067429384192L, 149514);
      return false;
    }
    boolean bool = ((Boolean)paramString).booleanValue();
    GMTrace.o(20067429384192L, 149514);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean isRecExpAdMM(String paramString)
  {
    GMTrace.i(20067563601920L, 149515);
    paramString = ae.bhp().Hz(paramString);
    if (paramString == null)
    {
      GMTrace.o(20067563601920L, 149515);
      return false;
    }
    boolean bool = paramString.bir();
    GMTrace.o(20067563601920L, 149515);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.e
  public void onAdChannelEnd(long paramLong, int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(17841562583040L, 132930);
    a locala = (a)this.pZG.remove(Long.valueOf(paramLong));
    if (locala != null) {
      locala.f(paramInt1, paramInt2, paramObject);
    }
    GMTrace.o(17841562583040L, 132930);
  }
  
  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(15240288796672L, 113549);
    w.d("AdLandingPagesProxy", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject2 = null;
    for (;;)
    {
      int i;
      Object localObject1;
      try
      {
        Method[] arrayOfMethod = getClass().getMethods();
        int j = arrayOfMethod.length;
        i = 0;
        localObject1 = localObject2;
        if (i >= j) {
          break label206;
        }
        localObject1 = arrayOfMethod[i];
        if (!((Method)localObject1).getName().equalsIgnoreCase(paramString)) {
          break label222;
        }
      }
      catch (Exception paramString)
      {
        w.e("AdLandingPagesProxy", "exception:%s", new Object[] { bg.f(paramString) });
        GMTrace.o(15240288796672L, 113549);
        return;
      }
      if (((Method)localObject1).isAnnotationPresent(paramString))
      {
        paramString = ((Method)localObject1).invoke(this, getArgs(paramBundle));
        if (((Method)localObject1).getReturnType() != Void.TYPE)
        {
          if ((paramString instanceof Parcelable))
          {
            paramBundle.putParcelable("result_key", (Parcelable)paramString);
            GMTrace.o(15240288796672L, 113549);
            return;
          }
          paramBundle.putSerializable("result_key", (Serializable)paramString);
        }
      }
      GMTrace.o(15240288796672L, 113549);
      return;
      label206:
      if (localObject1 != null) {
        if (paramBoolean)
        {
          paramString = com.tencent.mm.remoteservice.e.class;
          continue;
          label222:
          i += 1;
        }
        else
        {
          paramString = com.tencent.mm.remoteservice.f.class;
        }
      }
    }
  }
  
  @com.tencent.mm.remoteservice.e
  public void onDynamicUpdateEnd(long paramLong, String paramString)
  {
    GMTrace.i(15239751925760L, 113545);
    a locala = (a)this.pZG.remove(Long.valueOf(paramLong));
    if (locala != null) {
      locala.al(paramString);
    }
    GMTrace.o(15239751925760L, 113545);
  }
  
  public void onRelease()
  {
    GMTrace.i(15235859611648L, 113516);
    h.xA();
    h.xy().gQO.b(1337, this.hnC);
    h.xA();
    h.xy().gQO.b(1210, this.hnC);
    GMTrace.o(15235859611648L, 113516);
  }
  
  public boolean pauseTask(long paramLong)
  {
    GMTrace.i(15244181110784L, 113578);
    Object localObject = REMOTE_CALL("pauseTaskMM", new Object[] { Long.valueOf(paramLong) });
    if (localObject == null)
    {
      GMTrace.o(15244181110784L, 113578);
      return false;
    }
    boolean bool = ((Boolean)localObject).booleanValue();
    GMTrace.o(15244181110784L, 113578);
    return bool;
  }
  
  public boolean pauseTask(String paramString)
  {
    GMTrace.i(15243912675328L, 113576);
    paramString = REMOTE_CALL("pauseTaskMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15243912675328L, 113576);
      return false;
    }
    boolean bool = ((Boolean)paramString).booleanValue();
    GMTrace.o(15243912675328L, 113576);
    return bool;
  }
  
  public boolean pauseTaskByAppid(String paramString)
  {
    GMTrace.i(15243644239872L, 113574);
    paramString = REMOTE_CALL("pauseTaskByAppidMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15243644239872L, 113574);
      return false;
    }
    boolean bool = ((Boolean)paramString).booleanValue();
    GMTrace.o(15243644239872L, 113574);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean pauseTaskByAppidMM(String paramString)
  {
    GMTrace.i(15243510022144L, 113573);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    long l = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.queryIdByAppid(paramString);
    boolean bool = com.tencent.mm.plugin.downloader.model.f.aoQ().be(l);
    GMTrace.o(15243510022144L, 113573);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean pauseTaskMM(long paramLong)
  {
    GMTrace.i(15698508120064L, 116963);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    boolean bool = com.tencent.mm.plugin.downloader.model.f.aoQ().be(paramLong);
    GMTrace.o(15698508120064L, 116963);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean pauseTaskMM(String paramString)
  {
    GMTrace.i(15243778457600L, 113575);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    long l = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.queryIdByAppid(paramString);
    boolean bool = com.tencent.mm.plugin.downloader.model.f.aoQ().be(l);
    GMTrace.o(15243778457600L, 113575);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.e
  public void paused(long paramLong)
  {
    GMTrace.i(15241765191680L, 113560);
    a.a locala = (a.a)this.pZK.get(Long.valueOf(paramLong));
    if (locala != null) {
      locala.bgm();
    }
    GMTrace.o(15241765191680L, 113560);
  }
  
  @com.tencent.mm.remoteservice.e
  public void progress(long paramLong, int paramInt)
  {
    GMTrace.i(15241630973952L, 113559);
    w.v("AdLandingPagesProxy", "progress client id %d , progress %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    a.a locala = (a.a)this.pZK.get(Long.valueOf(paramLong));
    if (locala != null) {
      locala.tU(paramInt);
    }
    GMTrace.o(15241630973952L, 113559);
  }
  
  public long queryIdByAppid(String paramString)
  {
    GMTrace.i(15243375804416L, 113572);
    paramString = REMOTE_CALL("queryIdByAppidMM", new Object[] { paramString });
    if (paramString == null)
    {
      GMTrace.o(15243375804416L, 113572);
      return -1L;
    }
    long l = ((Long)paramString).longValue();
    GMTrace.o(15243375804416L, 113572);
    return l;
  }
  
  @com.tencent.mm.remoteservice.f
  public long queryIdByAppidMM(String paramString)
  {
    GMTrace.i(15243241586688L, 113571);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    long l = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.queryIdByAppid(paramString);
    GMTrace.o(15243241586688L, 113571);
    return l;
  }
  
  public void reportDownloadInfo(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(15245254852608L, 113586);
    REMOTE_CALL("reportDownloadInfoMM", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2, paramString3, paramString4 });
    GMTrace.o(15245254852608L, 113586);
  }
  
  @com.tencent.mm.remoteservice.f
  public void reportDownloadInfoMM(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(15245120634880L, 113585);
    a.c.qmA.c(paramInt, paramString1, paramString2, paramString4);
    GMTrace.o(15245120634880L, 113585);
  }
  
  public boolean resumeTask(String paramString1, a.a parama, String paramString2, String paramString3)
  {
    GMTrace.i(18583920836608L, 138461);
    paramString2 = REMOTE_CALL("resumeTaskMM", new Object[] { paramString1, paramString2, paramString3 });
    if (paramString2 == null) {}
    for (boolean bool = false;; bool = ((Boolean)paramString2).booleanValue())
    {
      if (bool) {
        this.pZK.put(Long.valueOf(queryIdByAppid(paramString1)), parama);
      }
      GMTrace.o(18583920836608L, 138461);
      return bool;
    }
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean resumeTaskMM(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18583786618880L, 138460);
    b localb = new b();
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    long l = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.queryIdByAppid(paramString1);
    this.pZJ.put(Long.valueOf(l), localb);
    localb.id = l;
    locala = a.c.qmA;
    FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramString1);
    if (localFileDownloadTaskInfo != null)
    {
      locala.qmx.put(Long.valueOf(localFileDownloadTaskInfo.id), new WeakReference(localb));
      locala.qmy.put(paramString1, new a.b(paramString2, paramString3));
      boolean bool = com.tencent.mm.plugin.downloader.model.f.aoQ().bf(localFileDownloadTaskInfo.id);
      GMTrace.o(18583786618880L, 138460);
      return bool;
    }
    GMTrace.o(18583786618880L, 138460);
    return false;
  }
  
  @com.tencent.mm.remoteservice.e
  public void resumed(long paramLong)
  {
    GMTrace.i(15242302062592L, 113564);
    a.a locala = (a.a)this.pZK.get(Long.valueOf(paramLong));
    if (locala != null) {
      locala.bgq();
    }
    GMTrace.o(15242302062592L, 113564);
  }
  
  @com.tencent.mm.remoteservice.e
  public void start(long paramLong)
  {
    GMTrace.i(15241496756224L, 113558);
    a.a locala = (a.a)this.pZK.get(Long.valueOf(paramLong));
    if (locala != null) {
      locala.start();
    }
    GMTrace.o(15241496756224L, 113558);
  }
  
  public long startDownload(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, a.a parama, String paramString6, String paramString7)
  {
    GMTrace.i(18583652401152L, 138459);
    w.v("AdLandingPagesProxy", "startDownload");
    paramString1 = REMOTE_CALL("startDownloadMM", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, Boolean.valueOf(paramBoolean), paramString6, paramString7 });
    if (paramString1 == null) {}
    for (long l = -1L;; l = ((Long)paramString1).longValue())
    {
      this.pZK.put(Long.valueOf(l), parama);
      GMTrace.o(18583652401152L, 138459);
      return l;
    }
  }
  
  @com.tencent.mm.remoteservice.f
  public long startDownloadMM(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7)
  {
    GMTrace.i(18583518183424L, 138458);
    b localb = new b();
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    g.a locala1 = new g.a();
    locala1.setAppId(paramString1);
    locala1.bz(paramString2);
    locala1.vd(paramString3);
    locala1.va(paramString4);
    locala1.vc(paramString5);
    locala1.dK(paramBoolean);
    paramString2 = locala1.kTs;
    long l = com.tencent.mm.plugin.downloader.model.f.aoQ().a(paramString2);
    locala.qmx.put(Long.valueOf(l), new WeakReference(localb));
    locala.qmy.put(paramString1, new a.b(paramString6, paramString7));
    this.pZJ.put(Long.valueOf(l), localb);
    w.v("AdLandingPagesProxy", "startDownloadMM, id %d", new Object[] { Long.valueOf(l) });
    localb.id = l;
    GMTrace.o(18583518183424L, 138458);
    return l;
  }
  
  public void stopTask(long paramLong)
  {
    GMTrace.i(15243107368960L, 113570);
    REMOTE_CALL("stopTaskMM", new Object[] { Long.valueOf(paramLong) });
    GMTrace.o(15243107368960L, 113570);
  }
  
  public void stopTask(String paramString)
  {
    GMTrace.i(15242838933504L, 113568);
    REMOTE_CALL("stopTaskMM", new Object[] { paramString });
    GMTrace.o(15242838933504L, 113568);
  }
  
  public void stopTaskMM(long paramLong)
  {
    GMTrace.i(15242973151232L, 113569);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.stopTask(paramLong);
    GMTrace.o(15242973151232L, 113569);
  }
  
  @com.tencent.mm.remoteservice.f
  public void stopTaskMM(String paramString)
  {
    GMTrace.i(15242704715776L, 113567);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a locala = a.c.qmA;
    paramString = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(paramString);
    if (paramString != null) {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.a.stopTask(paramString.id);
    }
    GMTrace.o(15242704715776L, 113567);
  }
  
  @com.tencent.mm.remoteservice.e
  public void stopped(long paramLong)
  {
    GMTrace.i(15241899409408L, 113561);
    a.a locala = (a.a)this.pZK.get(Long.valueOf(paramLong));
    if (locala != null)
    {
      locala.bgn();
      this.pZK.remove(Long.valueOf(paramLong));
    }
    GMTrace.o(15241899409408L, 113561);
  }
  
  @com.tencent.mm.remoteservice.e
  public void succeed(long paramLong)
  {
    GMTrace.i(15242033627136L, 113562);
    a.a locala = (a.a)this.pZK.get(Long.valueOf(paramLong));
    if (locala != null)
    {
      locala.bgo();
      this.pZK.remove(Long.valueOf(paramLong));
    }
    GMTrace.o(15242033627136L, 113562);
  }
  
  public boolean useOnlineStreamPlayer()
  {
    GMTrace.i(15237336006656L, 113527);
    Object localObject = REMOTE_CALL("useOnlineStreamPlayerMM", new Object[0]);
    if (localObject == null)
    {
      GMTrace.o(15237336006656L, 113527);
      return false;
    }
    boolean bool = ((Boolean)localObject).booleanValue();
    GMTrace.o(15237336006656L, 113527);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean useOnlineStreamPlayerMM()
  {
    GMTrace.i(15237470224384L, 113528);
    com.tencent.mm.storage.c localc = com.tencent.mm.x.c.c.Cu().em("100208");
    if (localc.isValid())
    {
      int i = bg.getInt((String)localc.bPn().get("useOnlineVideoPlayer"), 0);
      w.i("AdLandingPagesProxy", "useOnlineVideoPlayer abtest=" + i);
      if (i == 1)
      {
        GMTrace.o(15237470224384L, 113528);
        return true;
      }
      GMTrace.o(15237470224384L, 113528);
      return false;
    }
    GMTrace.o(15237470224384L, 113528);
    return false;
  }
  
  public void writeDeferredDeepLink(String paramString1, String paramString2)
  {
    GMTrace.i(16637763780608L, 123961);
    REMOTE_CALL("writeDeferredDeepLinkMM", new Object[] { paramString1, paramString2 });
    GMTrace.o(16637763780608L, 123961);
  }
  
  @com.tencent.mm.remoteservice.f
  public void writeDeferredDeepLinkMM(String paramString1, String paramString2)
  {
    GMTrace.i(16637897998336L, 123962);
    bgl().edit().putString(paramString1, paramString2).commit();
    GMTrace.o(16637897998336L, 123962);
  }
  
  public static abstract interface a
  {
    public abstract void al(Object paramObject);
    
    public abstract void f(int paramInt1, int paramInt2, Object paramObject);
  }
  
  private final class b
    implements a.a
  {
    public long id;
    
    public b()
    {
      GMTrace.i(15246060158976L, 113592);
      GMTrace.o(15246060158976L, 113592);
    }
    
    public final void bgm()
    {
      GMTrace.i(15246462812160L, 113595);
      AdLandingPagesProxy.this.CLIENT_CALL("paused", new Object[] { Long.valueOf(this.id) });
      GMTrace.o(15246462812160L, 113595);
    }
    
    public final void bgn()
    {
      GMTrace.i(15246597029888L, 113596);
      AdLandingPagesProxy.this.CLIENT_CALL("stopped", new Object[] { Long.valueOf(this.id) });
      GMTrace.o(15246597029888L, 113596);
    }
    
    public final void bgo()
    {
      GMTrace.i(15246731247616L, 113597);
      AdLandingPagesProxy.this.CLIENT_CALL("succeed", new Object[] { Long.valueOf(this.id) });
      GMTrace.o(15246731247616L, 113597);
    }
    
    public final void bgp()
    {
      GMTrace.i(15246865465344L, 113598);
      AdLandingPagesProxy.this.CLIENT_CALL("failed", new Object[] { Long.valueOf(this.id) });
      GMTrace.o(15246865465344L, 113598);
    }
    
    public final void bgq()
    {
      GMTrace.i(15246999683072L, 113599);
      AdLandingPagesProxy.this.CLIENT_CALL("resumed", new Object[] { Long.valueOf(this.id) });
      GMTrace.o(15246999683072L, 113599);
    }
    
    public final void start()
    {
      GMTrace.i(15246194376704L, 113593);
      AdLandingPagesProxy.this.CLIENT_CALL("start", new Object[] { Long.valueOf(this.id) });
      GMTrace.o(15246194376704L, 113593);
    }
    
    public final void tU(int paramInt)
    {
      GMTrace.i(15246328594432L, 113594);
      w.v("AdLandingPagesProxy", "progress %d", new Object[] { Integer.valueOf(paramInt) });
      AdLandingPagesProxy.this.CLIENT_CALL("progress", new Object[] { Long.valueOf(this.id), Integer.valueOf(paramInt) });
      GMTrace.o(15246328594432L, 113594);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/AdLandingPagesProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */