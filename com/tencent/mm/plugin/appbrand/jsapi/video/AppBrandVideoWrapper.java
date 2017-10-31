package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.modelvideo.b;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.c;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.d.a;

public class AppBrandVideoWrapper
  extends RelativeLayout
  implements com.tencent.mm.pluginsdk.ui.h, h.a, h.b, h.c, d.a
{
  private com.tencent.mm.pluginsdk.ui.h jcU;
  h.b jcV;
  private com.tencent.mm.pluginsdk.ui.g jcW;
  private h.d jcX;
  private boolean jcY;
  private float jcZ;
  private int jda;
  private boolean jdb;
  private boolean jdc;
  private com.tencent.mm.x.d jdd;
  private Context mContext;
  private String url;
  
  public AppBrandVideoWrapper(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(17357036584960L, 129320);
    GMTrace.o(17357036584960L, 129320);
  }
  
  public AppBrandVideoWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17357170802688L, 129321);
    this.jcX = h.d.sYO;
    this.jcY = false;
    this.jcZ = -1.0F;
    this.mContext = paramContext;
    this.jdd = new com.tencent.mm.x.d();
    GMTrace.o(17357170802688L, 129321);
  }
  
  private com.tencent.mm.pluginsdk.ui.h Xp()
  {
    GMTrace.i(17357439238144L, 129323);
    CommonVideoView localCommonVideoView = new CommonVideoView(this.mContext);
    localCommonVideoView.sXR = this;
    localCommonVideoView.a(this);
    a(600L, 200L, 1L, false);
    GMTrace.o(17357439238144L, 129323);
    return localCommonVideoView;
  }
  
  private com.tencent.mm.pluginsdk.ui.h Xq()
  {
    GMTrace.i(17357573455872L, 129324);
    MMVideoView localMMVideoView = new MMVideoView(this.mContext);
    localMMVideoView.sXR = this;
    localMMVideoView.a(this);
    localMMVideoView.hSl = new AppBrandOnlineVideoProxy();
    localMMVideoView.hSl.a(localMMVideoView);
    localMMVideoView.hSo = this;
    String str = e.gZT + "appbrandvideo/";
    com.tencent.mm.sdk.platformtools.h.Mt(str);
    localMMVideoView.hSk = str;
    a(600L, 201L, 1L, false);
    GMTrace.o(17357573455872L, 129324);
    return localMMVideoView;
  }
  
  private boolean a(boolean paramBoolean, String paramString1, String paramString2)
  {
    GMTrace.i(17357707673600L, 129325);
    if ((paramBoolean) || (this.jdc))
    {
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    if (com.tencent.mm.compatible.util.d.eu(18))
    {
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    int i = ab.getContext().getSharedPreferences("system_config_prefs", 4).getInt("appbrand_video_player", -1);
    w.d("MicroMsg.AppBrandVideoWrapper", "checkUseSystemPlayer abtestFlag[%d]", new Object[] { Integer.valueOf(i) });
    if (i <= 0)
    {
      w.i("MicroMsg.AppBrandVideoWrapper", "abtest is zero, use system player");
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    if ((!bg.mZ(paramString1)) && (paramString1.contains(".m3u8")))
    {
      w.i("MicroMsg.AppBrandVideoWrapper", "%d it is m3u8 file use system player.", new Object[] { Integer.valueOf(hashCode()) });
      a(600L, 204L, 1L, false);
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    if (q.lS(paramString2))
    {
      w.i("MicroMsg.AppBrandVideoWrapper", "%d it is m3u8 file use system player.", new Object[] { Integer.valueOf(hashCode()) });
      a(600L, 204L, 1L, false);
      GMTrace.o(17357707673600L, 129325);
      return true;
    }
    GMTrace.o(17357707673600L, 129325);
    return false;
  }
  
  public final void M(String paramString, boolean paramBoolean)
  {
    GMTrace.i(17360257810432L, 129344);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", new Object[] { Integer.valueOf(hashCode()), paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      GMTrace.o(17360257810432L, 129344);
      return;
    }
    int i;
    if (a(false, "", paramString))
    {
      if (!(this.jcU instanceof MMVideoView)) {
        break label315;
      }
      this.jcU.stop();
      this.jcU.Xr();
      removeView((View)this.jcU);
      w.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.jcU = Xp();
      i = 1;
    }
    for (;;)
    {
      a(this.jcX);
      T(this.jcZ);
      ck(this.jcY);
      if (i != 0)
      {
        a(this.jcW);
        paramString = new RelativeLayout.LayoutParams(-1, -2);
        paramString.addRule(13);
        addView((View)this.jcU, paramString);
        this.jcU.b(this.jdb, this.url, this.jda);
        this.jcU.start();
      }
      GMTrace.o(17360257810432L, 129344);
      return;
      if ((this.jcU instanceof CommonVideoView))
      {
        this.jcU.stop();
        this.jcU.Xr();
        removeView((View)this.jcU);
        w.i("MicroMsg.AppBrandVideoWrapper", "%d onDownloadFinish use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.jcU = Xq();
        i = 1;
      }
      else
      {
        label315:
        i = 0;
      }
    }
  }
  
  public final void MJ()
  {
    GMTrace.i(17359720939520L, 129340);
    if (this.jcU != null) {
      this.jcU.MJ();
    }
    this.jdd.bc(false);
    setKeepScreenOn(false);
    GMTrace.o(17359720939520L, 129340);
  }
  
  public final void MK()
  {
    GMTrace.i(17359586721792L, 129339);
    if (this.jcU != null) {
      this.jcU.MK();
    }
    GMTrace.o(17359586721792L, 129339);
  }
  
  public final int MN()
  {
    GMTrace.i(17358647197696L, 129332);
    if (this.jcU != null)
    {
      int i = this.jcU.MN();
      GMTrace.o(17358647197696L, 129332);
      return i;
    }
    GMTrace.o(17358647197696L, 129332);
    return 0;
  }
  
  public final boolean T(float paramFloat)
  {
    GMTrace.i(17360123592704L, 129343);
    if (paramFloat <= 0.0F)
    {
      GMTrace.o(17360123592704L, 129343);
      return false;
    }
    this.jcZ = paramFloat;
    if (this.jcU != null)
    {
      boolean bool = this.jcU.T(this.jcZ);
      GMTrace.o(17360123592704L, 129343);
      return bool;
    }
    GMTrace.o(17360123592704L, 129343);
    return false;
  }
  
  public final boolean WV()
  {
    GMTrace.i(17358915633152L, 129334);
    if (this.jcU != null)
    {
      boolean bool = this.jcU.WV();
      GMTrace.o(17358915633152L, 129334);
      return bool;
    }
    GMTrace.o(17358915633152L, 129334);
    return false;
  }
  
  public final void Xd()
  {
    GMTrace.i(17360526245888L, 129346);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onPrepared", new Object[] { Integer.valueOf(hashCode()) });
    if (this.jcV != null) {
      this.jcV.Xd();
    }
    if (WV())
    {
      a(600L, 203L, 1L, false);
      GMTrace.o(17360526245888L, 129346);
      return;
    }
    a(600L, 202L, 1L, false);
    GMTrace.o(17360526245888L, 129346);
  }
  
  public final void Xe()
  {
    GMTrace.i(17360660463616L, 129347);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onVideoEnded", new Object[] { Integer.valueOf(hashCode()) });
    if (this.jcV != null) {
      this.jcV.Xe();
    }
    GMTrace.o(17360660463616L, 129347);
  }
  
  public final void Xf()
  {
    GMTrace.i(17360928899072L, 129349);
    w.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPause", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(false);
    this.jdd.bc(false);
    if (this.jcV != null) {
      this.jcV.Xf();
    }
    GMTrace.o(17360928899072L, 129349);
  }
  
  public final void Xg()
  {
    GMTrace.i(17361063116800L, 129350);
    w.d("MicroMsg.AppBrandVideoWrapper", "%d onVideoPlay", new Object[] { Integer.valueOf(hashCode()) });
    setKeepScreenOn(true);
    this.jdd.a(this);
    if (this.jcV != null) {
      this.jcV.Xg();
    }
    GMTrace.o(17361063116800L, 129350);
  }
  
  public final void Xr()
  {
    GMTrace.i(17357976109056L, 129327);
    if (this.jcU != null) {
      this.jcU.Xr();
    }
    GMTrace.o(17357976109056L, 129327);
  }
  
  public final int Xs()
  {
    GMTrace.i(17358378762240L, 129330);
    if (this.jcU != null)
    {
      i = this.jcU.Xs();
      GMTrace.o(17358378762240L, 129330);
      return i;
    }
    int i = this.jda;
    GMTrace.o(17358378762240L, 129330);
    return i;
  }
  
  public final int Xt()
  {
    GMTrace.i(17785862225920L, 132515);
    if (this.jcU != null)
    {
      int i = this.jcU.Xt();
      GMTrace.o(17785862225920L, 132515);
      return i;
    }
    GMTrace.o(17785862225920L, 132515);
    return 0;
  }
  
  public final int Xu()
  {
    GMTrace.i(17358512979968L, 129331);
    if (this.jcU != null)
    {
      int i = this.jcU.Xu();
      GMTrace.o(17358512979968L, 129331);
      return i;
    }
    GMTrace.o(17358512979968L, 129331);
    return 0;
  }
  
  public final void Xv()
  {
    GMTrace.i(17359855157248L, 129341);
    if (this.jcU != null) {
      this.jcU.Xv();
    }
    this.jdd.bc(false);
    setKeepScreenOn(false);
    GMTrace.o(17359855157248L, 129341);
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    GMTrace.i(17361331552256L, 129352);
    com.tencent.mm.plugin.report.service.g.paX.a(600L, paramLong2, 1L, false);
    GMTrace.o(17361331552256L, 129352);
  }
  
  public final void a(com.tencent.mm.pluginsdk.ui.g paramg)
  {
    GMTrace.i(17357841891328L, 129326);
    this.jcW = paramg;
    if (this.jcU != null) {
      this.jcU.a(this.jcW);
    }
    GMTrace.o(17357841891328L, 129326);
  }
  
  public final void a(h.d paramd)
  {
    GMTrace.i(17359989374976L, 129342);
    this.jcX = paramd;
    if (this.jcU != null) {
      this.jcU.a(this.jcX);
    }
    GMTrace.o(17359989374976L, 129342);
  }
  
  public final void b(boolean paramBoolean, String paramString, int paramInt)
  {
    int i = 1;
    GMTrace.i(17357305020416L, 129322);
    this.jda = paramInt;
    this.jdb = paramBoolean;
    PString localPString = new PString();
    localPString.value = paramString;
    if ((!bg.mZ(localPString.value)) && (localPString.value.indexOf("wxfile://") == 0))
    {
      localPString.value = localPString.value.substring(9);
      paramBoolean = true;
      this.jdc = paramBoolean;
      this.url = localPString.value;
      if (this.jcU != null) {
        break label289;
      }
      if (!a(this.jdb, this.url, "")) {
        break label253;
      }
      w.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.jcU = Xp();
      paramInt = i;
    }
    for (;;)
    {
      a(this.jcX);
      T(this.jcZ);
      ck(this.jcY);
      if (paramInt != 0)
      {
        a(this.jcW);
        paramString = new RelativeLayout.LayoutParams(-1, -2);
        paramString.addRule(13);
        addView((View)this.jcU, paramString);
      }
      this.jcU.b(this.jdb, this.url, this.jda);
      GMTrace.o(17357305020416L, 129322);
      return;
      paramBoolean = false;
      break;
      label253:
      w.i("MicroMsg.AppBrandVideoWrapper", "%d use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
      this.jcU = Xq();
      paramInt = i;
      continue;
      label289:
      if (a(this.jdb, this.url, ""))
      {
        if ((this.jcU instanceof MMVideoView))
        {
          this.jcU.stop();
          this.jcU.Xr();
          removeView((View)this.jcU);
          w.i("MicroMsg.AppBrandVideoWrapper", "%d use common video view !", new Object[] { Integer.valueOf(hashCode()) });
          this.jcU = Xp();
          paramInt = i;
        }
        else
        {
          w.i("MicroMsg.AppBrandVideoWrapper", "%d use last common video view !", new Object[] { Integer.valueOf(hashCode()) });
          this.jcU.stop();
          paramInt = 0;
        }
      }
      else if ((this.jcU instanceof CommonVideoView))
      {
        this.jcU.stop();
        this.jcU.Xr();
        removeView((View)this.jcU);
        w.i("MicroMsg.AppBrandVideoWrapper", "%d use mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.jcU = Xq();
        paramInt = i;
      }
      else
      {
        w.i("MicroMsg.AppBrandVideoWrapper", "%d use last mm video view !", new Object[] { Integer.valueOf(hashCode()) });
        this.jcU.stop();
        paramInt = 0;
      }
    }
  }
  
  public final void br(int paramInt1, int paramInt2)
  {
    GMTrace.i(17360794681344L, 129348);
    w.i("MicroMsg.AppBrandVideoWrapper", "%d onGetVideoSize[%d %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.jcV != null) {
      this.jcV.br(paramInt1, paramInt2);
    }
    GMTrace.o(17360794681344L, 129348);
  }
  
  public final void ck(boolean paramBoolean)
  {
    GMTrace.i(17359452504064L, 129338);
    this.jcY = paramBoolean;
    if (this.jcU != null) {
      this.jcU.ck(this.jcY);
    }
    GMTrace.o(17359452504064L, 129338);
  }
  
  public final boolean iI(int paramInt)
  {
    GMTrace.i(17358110326784L, 129328);
    if (this.jcU != null)
    {
      boolean bool = this.jcU.iI(paramInt);
      GMTrace.o(17358110326784L, 129328);
      return bool;
    }
    GMTrace.o(17358110326784L, 129328);
    return false;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(17358781415424L, 129333);
    if (this.jcU != null)
    {
      boolean bool = this.jcU.isPlaying();
      GMTrace.o(17358781415424L, 129333);
      return bool;
    }
    GMTrace.o(17358781415424L, 129333);
    return false;
  }
  
  public final boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17358244544512L, 129329);
    if (this.jcU != null)
    {
      paramBoolean = this.jcU.o(paramInt, paramBoolean);
      GMTrace.o(17358244544512L, 129329);
      return paramBoolean;
    }
    GMTrace.o(17358244544512L, 129329);
    return false;
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(17360392028160L, 129345);
    w.w("MicroMsg.AppBrandVideoWrapper", "%d onError[%d, %d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.jcV != null) {
      this.jcV.onError(paramInt1, paramInt2);
    }
    GMTrace.o(17360392028160L, 129345);
  }
  
  public final boolean pause()
  {
    GMTrace.i(17359318286336L, 129337);
    if (this.jcU != null)
    {
      setKeepScreenOn(false);
      this.jdd.bc(false);
      boolean bool = this.jcU.pause();
      GMTrace.o(17359318286336L, 129337);
      return bool;
    }
    GMTrace.o(17359318286336L, 129337);
    return false;
  }
  
  public void setKeepScreenOn(boolean paramBoolean)
  {
    GMTrace.i(17361197334528L, 129351);
    w.d("MicroMsg.AppBrandVideoWrapper", "set keep screen on[%b] stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bg.bOd() });
    super.setKeepScreenOn(paramBoolean);
    GMTrace.o(17361197334528L, 129351);
  }
  
  public final void start()
  {
    GMTrace.i(17359049850880L, 129335);
    if (this.jcU != null)
    {
      this.jcU.start();
      setKeepScreenOn(true);
      this.jdd.a(this);
    }
    GMTrace.o(17359049850880L, 129335);
  }
  
  public final void stop()
  {
    GMTrace.i(17359184068608L, 129336);
    if (this.jcU != null)
    {
      this.jcU.stop();
      this.jdd.bc(false);
      setKeepScreenOn(false);
    }
    GMTrace.o(17359184068608L, 129336);
  }
  
  public final void z(int paramInt, String paramString)
  {
    GMTrace.i(17361465769984L, 129353);
    com.tencent.mm.plugin.report.service.g.paX.z(14349, paramString);
    GMTrace.o(17361465769984L, 129353);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */