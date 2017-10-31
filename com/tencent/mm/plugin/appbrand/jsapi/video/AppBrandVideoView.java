package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.ThumbnailUtils;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.4;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.5;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.a;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppBrandVideoView
  extends RelativeLayout
{
  String iqL;
  private b jbY;
  AppBrandVideoWrapper jbZ;
  private TextView jca;
  private DanmuView jcb;
  AppBrandVideoViewControlBar jcc;
  private View jcd;
  private View jce;
  TextView jcf;
  private LinearLayout jcg;
  private AppBrandDotPercentIndicator jch;
  private TextView jci;
  private ImageView jcj;
  private ImageView jck;
  String jcl;
  int jcm;
  boolean jcn;
  private boolean jco;
  e jcp;
  private boolean jcq;
  private boolean jcr;
  private f jcs;
  a jct;
  private boolean jcu;
  private boolean jcv;
  private int jcw;
  private String jcx;
  
  public AppBrandVideoView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17364284342272L, 129374);
    this.jbY = b.jcC;
    init(paramContext);
    GMTrace.o(17364284342272L, 129374);
  }
  
  public AppBrandVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17364418560000L, 129375);
    this.jbY = b.jcC;
    init(paramContext);
    GMTrace.o(17364418560000L, 129375);
  }
  
  public AppBrandVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17364552777728L, 129376);
    this.jbY = b.jcC;
    init(paramContext);
    GMTrace.o(17364552777728L, 129376);
  }
  
  private void WU()
  {
    GMTrace.i(18212137730048L, 135691);
    this.jcb = ((DanmuView)findViewById(p.f.itV));
    this.jcb.jdY = new com.tencent.mm.plugin.appbrand.jsapi.video.danmu.c()
    {
      public final int Gn()
      {
        GMTrace.i(19814160531456L, 147627);
        int i = AppBrandVideoView.b(AppBrandVideoView.this).Xu();
        GMTrace.o(19814160531456L, 147627);
        return i;
      }
    };
    Object localObject1 = this.jcb;
    ((DanmuView)localObject1).jdU = 0.0F;
    ((DanmuView)localObject1).jdV = 0.8F;
    this.jcb.jdT = 5;
    this.jcb.jdS = 200;
    this.jcb.hide();
    int i;
    DanmuView localDanmuView;
    if ((this.jbZ != null) && (this.jbZ.getHeight() > 0))
    {
      localObject1 = this.jcb;
      i = (int)((((DanmuView)localObject1).jdV - ((DanmuView)localObject1).jdU) * this.jbZ.getHeight());
      float f = com.tencent.mm.plugin.appbrand.jsapi.video.danmu.b.bM(getContext());
      localDanmuView = this.jcb;
      localDanmuView.jdR = ((int)(i / f));
      if (localDanmuView.jdZ != null)
      {
        localObject1 = localDanmuView.jdZ;
        i = 0;
      }
    }
    for (;;)
    {
      try
      {
        if (i < localDanmuView.jdZ.size())
        {
          ArrayList localArrayList = (ArrayList)localDanmuView.jdZ.get(Integer.valueOf(i));
          if (localArrayList != null) {
            localArrayList.clear();
          }
        }
        else
        {
          localDanmuView.XD();
          GMTrace.o(18212137730048L, 135691);
          return;
        }
      }
      finally {}
      i += 1;
    }
  }
  
  private boolean WV()
  {
    GMTrace.i(20368479748096L, 151757);
    w.i("MicroMsg.AppBrandVideoView", "isLive %b %b", new Object[] { Boolean.valueOf(this.jcu), Boolean.valueOf(this.jbZ.WV()) });
    if ((this.jcu) || (this.jbZ.WV()))
    {
      GMTrace.o(20368479748096L, 151757);
      return true;
    }
    GMTrace.o(20368479748096L, 151757);
    return false;
  }
  
  static String iF(int paramInt)
  {
    GMTrace.i(17367505567744L, 129398);
    String str = iG(paramInt / 60) + ":" + iG(paramInt % 60);
    GMTrace.o(17367505567744L, 129398);
    return str;
  }
  
  private static String iG(int paramInt)
  {
    GMTrace.i(17367639785472L, 129399);
    if (paramInt < 10)
    {
      String str = "0" + paramInt;
      GMTrace.o(17367639785472L, 129399);
      return str;
    }
    GMTrace.o(17367639785472L, 129399);
    return String.valueOf(paramInt);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(17364686995456L, 129377);
    LayoutInflater.from(paramContext).inflate(p.g.ivB, this);
    this.jbZ = ((AppBrandVideoWrapper)findViewById(p.f.cEM));
    this.jca = ((TextView)findViewById(p.f.progress));
    this.jcd = findViewById(p.f.bzz);
    this.jce = findViewById(p.f.itS);
    this.jcf = ((TextView)findViewById(p.f.itT));
    this.jcg = ((LinearLayout)findViewById(p.f.isR));
    this.jch = ((AppBrandDotPercentIndicator)findViewById(p.f.isS));
    this.jci = ((TextView)findViewById(p.f.isP));
    this.jcj = ((ImageView)findViewById(p.f.isQ));
    this.jck = ((ImageView)findViewById(p.f.bzy));
    paramContext = this.jch;
    paramContext.jbG = 8;
    paramContext.removeAllViews();
    int i = 0;
    while (i < paramContext.jbG)
    {
      paramContext.addView((ImageView)paramContext.CO.inflate(p.g.iva, paramContext, false));
      i += 1;
    }
    ((ImageView)findViewById(p.f.itR)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17370995228672L, 129424);
        AppBrandVideoView.this.start();
        GMTrace.o(17370995228672L, 129424);
      }
    });
    this.jcs = new f(getContext(), this, new f.b()
    {
      public final void R(float paramAnonymousFloat)
      {
        GMTrace.i(19811476176896L, 147607);
        w.d("MicroMsg.AppBrandVideoView", "onAdjustVolume:" + paramAnonymousFloat);
        AppBrandVideoView.i(AppBrandVideoView.this).Q(paramAnonymousFloat);
        AppBrandVideoView.j(AppBrandVideoView.this).setText(p.i.iyK);
        AppBrandVideoView.k(AppBrandVideoView.this).setImageResource(p.h.iwd);
        AppBrandVideoView.l(AppBrandVideoView.this).setVisibility(0);
        GMTrace.o(19811476176896L, 147607);
      }
      
      public final void S(float paramAnonymousFloat)
      {
        GMTrace.i(19811610394624L, 147608);
        w.d("MicroMsg.AppBrandVideoView", "onAdjustBrightness:" + paramAnonymousFloat);
        AppBrandVideoView.i(AppBrandVideoView.this).Q(paramAnonymousFloat);
        AppBrandVideoView.j(AppBrandVideoView.this).setText(p.i.iyJ);
        AppBrandVideoView.k(AppBrandVideoView.this).setImageResource(p.h.ivS);
        AppBrandVideoView.l(AppBrandVideoView.this).setVisibility(0);
        GMTrace.o(19811610394624L, 147608);
      }
      
      public final void WY()
      {
        GMTrace.i(19810670870528L, 147601);
        w.d("MicroMsg.AppBrandVideoView", "onSingleTap");
        if (AppBrandVideoView.f(AppBrandVideoView.this)) {
          AppBrandVideoView.g(AppBrandVideoView.this).Xm();
        }
        GMTrace.o(19810670870528L, 147601);
      }
      
      public final void WZ()
      {
        GMTrace.i(19810805088256L, 147602);
        w.d("MicroMsg.AppBrandVideoView", "onDoubleTap");
        GMTrace.o(19810805088256L, 147602);
      }
      
      public final void Xa()
      {
        GMTrace.i(19810939305984L, 147603);
        if (AppBrandVideoView.b(AppBrandVideoView.this).WV())
        {
          w.i("MicroMsg.AppBrandVideoView", "onStartDragProgress isLive: no seek");
          GMTrace.o(19810939305984L, 147603);
          return;
        }
        AppBrandVideoView.h(AppBrandVideoView.this).setVisibility(0);
        GMTrace.o(19810939305984L, 147603);
      }
      
      public final void Xb()
      {
        GMTrace.i(19811744612352L, 147609);
        AppBrandVideoView.l(AppBrandVideoView.this).setVisibility(8);
        GMTrace.o(19811744612352L, 147609);
      }
      
      public final void Xc()
      {
        GMTrace.i(19811878830080L, 147610);
        AppBrandVideoView.l(AppBrandVideoView.this).setVisibility(8);
        GMTrace.o(19811878830080L, 147610);
      }
      
      public final int d(int paramAnonymousInt, float paramAnonymousFloat)
      {
        int j = 0;
        GMTrace.i(19811073523712L, 147604);
        if (AppBrandVideoView.b(AppBrandVideoView.this).WV())
        {
          w.i("MicroMsg.AppBrandVideoView", "onDragProgress isLive: no seek");
          GMTrace.o(19811073523712L, 147604);
          return 0;
        }
        w.i("MicroMsg.AppBrandVideoView", "onDragProgress:" + paramAnonymousInt + "/" + paramAnonymousFloat);
        paramAnonymousFloat /= AppBrandVideoView.this.getMeasuredWidth();
        int i = AppBrandVideoView.b(AppBrandVideoView.this).Xs();
        paramAnonymousInt = getCurrentPosition();
        paramAnonymousInt = (int)(paramAnonymousFloat * i) + paramAnonymousInt;
        if (paramAnonymousInt < 0) {
          paramAnonymousInt = j;
        }
        for (;;)
        {
          String str = g.av(i * 1000L);
          AppBrandVideoView.h(AppBrandVideoView.this).setText(g.av(paramAnonymousInt * 1000L) + "/" + str);
          GMTrace.o(19811073523712L, 147604);
          return paramAnonymousInt;
          if (paramAnonymousInt > i) {
            paramAnonymousInt = i;
          }
        }
      }
      
      public final void e(int paramAnonymousInt, float paramAnonymousFloat)
      {
        GMTrace.i(19811207741440L, 147605);
        AppBrandVideoView.h(AppBrandVideoView.this).setVisibility(8);
        w.i("MicroMsg.AppBrandVideoView", "onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(AppBrandVideoView.b(AppBrandVideoView.this).Xu()), Float.valueOf(paramAnonymousFloat) });
        if (AppBrandVideoView.b(AppBrandVideoView.this).WV())
        {
          w.i("MicroMsg.AppBrandVideoView", "onEndDragProgress isLive: no seek");
          GMTrace.o(19811207741440L, 147605);
          return;
        }
        AppBrandVideoView.this.r(paramAnonymousInt, false);
        GMTrace.o(19811207741440L, 147605);
      }
      
      public final int getCurrentPosition()
      {
        GMTrace.i(19811341959168L, 147606);
        int i = AppBrandVideoView.b(AppBrandVideoView.this).Xu();
        GMTrace.o(19811341959168L, 147606);
        return i;
      }
    });
    this.jbZ.jcV = new h.b()
    {
      public final void Xd()
      {
        GMTrace.i(19812684136448L, 147616);
        w.i("MicroMsg.AppBrandVideoView", "onPrepared");
        f localf = AppBrandVideoView.m(AppBrandVideoView.this);
        localf.jdw = -1;
        localf.jdx = 0;
        localf.jdv = 0.0F;
        GMTrace.o(19812684136448L, 147616);
      }
      
      public final void Xe()
      {
        GMTrace.i(19812818354176L, 147617);
        w.i("MicroMsg.AppBrandVideoView", "onVideoEnded");
        AppBrandVideoView.n(AppBrandVideoView.this).setVisibility(0);
        if (AppBrandVideoView.o(AppBrandVideoView.this)) {
          AppBrandVideoView.p(AppBrandVideoView.this).setVisibility(8);
        }
        for (;;)
        {
          e locale;
          if (AppBrandVideoView.d(AppBrandVideoView.this) != null) {
            locale = AppBrandVideoView.d(AppBrandVideoView.this);
          }
          try
          {
            locale.a(new e.b(), locale.Xx());
            locale.Xy();
            if (AppBrandVideoView.r(AppBrandVideoView.this)) {
              AppBrandVideoView.this.r(0, true);
            }
            GMTrace.o(19812818354176L, 147617);
            return;
            if (AppBrandVideoView.q(AppBrandVideoView.this).getTag() == null) {
              AppBrandVideoView.q(AppBrandVideoView.this).setText(AppBrandVideoView.a(AppBrandVideoView.this, AppBrandVideoView.b(AppBrandVideoView.this).Xs()));
            }
            AppBrandVideoView.p(AppBrandVideoView.this).setVisibility(0);
          }
          catch (JSONException localJSONException)
          {
            for (;;)
            {
              w.e("MicroMsg.JsApiVideoCallback", "OnVideoEnded e=%s", new Object[] { localJSONException });
            }
          }
        }
      }
      
      public final void Xf()
      {
        GMTrace.i(19813086789632L, 147619);
        w.i("MicroMsg.AppBrandVideoView", "onVideoPause");
        e locale;
        if (AppBrandVideoView.d(AppBrandVideoView.this) != null) {
          locale = AppBrandVideoView.d(AppBrandVideoView.this);
        }
        try
        {
          locale.a(new e.d(), locale.Xx());
          locale.Xy();
          GMTrace.o(19813086789632L, 147619);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.e("MicroMsg.JsApiVideoCallback", "OnVideoPause e=%s", new Object[] { localJSONException });
          }
        }
      }
      
      public final void Xg()
      {
        GMTrace.i(19813221007360L, 147620);
        w.i("MicroMsg.AppBrandVideoView", "onVideoPlay, isLive:%b", new Object[] { Boolean.valueOf(AppBrandVideoView.o(AppBrandVideoView.this)) });
        if ((AppBrandVideoView.q(AppBrandVideoView.this).getTag() == null) && (!AppBrandVideoView.o(AppBrandVideoView.this))) {
          AppBrandVideoView.q(AppBrandVideoView.this).setText(AppBrandVideoView.a(AppBrandVideoView.this, AppBrandVideoView.b(AppBrandVideoView.this).Xs()));
        }
        AppBrandVideoView.g(AppBrandVideoView.this).cs(AppBrandVideoView.o(AppBrandVideoView.this));
        if (AppBrandVideoView.f(AppBrandVideoView.this)) {
          AppBrandVideoView.g(AppBrandVideoView.this).Xl();
        }
        if (AppBrandVideoView.d(AppBrandVideoView.this) != null)
        {
          e locale = AppBrandVideoView.d(AppBrandVideoView.this);
          try
          {
            locale.jdo = 0;
            locale.a(new e.e(), locale.Xx());
            if (locale.jdn == null) {
              locale.jdn = new aj(new e.1(locale), true);
            }
            locale.jdn.w(250L, 250L);
            GMTrace.o(19813221007360L, 147620);
            return;
          }
          catch (JSONException localJSONException)
          {
            w.e("MicroMsg.JsApiVideoCallback", "OnVideoPlay e=%s", new Object[] { localJSONException });
          }
        }
        GMTrace.o(19813221007360L, 147620);
      }
      
      public final void br(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19812952571904L, 147618);
        w.i("MicroMsg.AppBrandVideoView", "onGetVideoSize width=%d height=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        AppBrandVideoView localAppBrandVideoView;
        if (AppBrandVideoView.s(AppBrandVideoView.this) == AppBrandVideoView.b.jcC)
        {
          localAppBrandVideoView = AppBrandVideoView.this;
          if (paramAnonymousInt1 >= paramAnonymousInt2) {
            break label98;
          }
        }
        label98:
        for (AppBrandVideoView.b localb = AppBrandVideoView.b.jcE;; localb = AppBrandVideoView.b.jcD)
        {
          AppBrandVideoView.a(localAppBrandVideoView, localb);
          w.i("MicroMsg.AppBrandVideoView", "onGetVideoSize adjust direction from AUTO to %s", new Object[] { AppBrandVideoView.s(AppBrandVideoView.this) });
          GMTrace.o(19812952571904L, 147618);
          return;
        }
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19812549918720L, 147615);
        w.i("MicroMsg.AppBrandVideoView", "onError what=%d extra=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (AppBrandVideoView.d(AppBrandVideoView.this) != null)
        {
          e locale = AppBrandVideoView.d(AppBrandVideoView.this);
          w.e("MicroMsg.JsApiVideoCallback", "onError");
          locale.clean();
        }
        GMTrace.o(19812549918720L, 147615);
      }
    };
    this.jcc = new AppBrandVideoViewControlBar(getContext());
    this.jcc.setVisibility(8);
    paramContext = this.jcc;
    View.OnClickListener local8 = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19813355225088L, 147621);
        if (!AppBrandVideoView.this.WT()) {}
        for (boolean bool = true;; bool = false)
        {
          AppBrandVideoView.this.cn(bool);
          GMTrace.o(19813355225088L, 147621);
          return;
        }
      }
    };
    paramContext.jcG.setOnClickListener(local8);
    this.jcc.pBX = new com.tencent.mm.plugin.sight.decode.ui.b()
    {
      public final void Xh()
      {
        GMTrace.i(19812281483264L, 147613);
        w.i("MicroMsg.AppBrandVideoView", "onSeekPre");
        GMTrace.o(19812281483264L, 147613);
      }
      
      public final void iH(int paramAnonymousInt)
      {
        GMTrace.i(19812415700992L, 147614);
        AppBrandVideoView.this.r(paramAnonymousInt, false);
        GMTrace.o(19812415700992L, 147614);
      }
    };
    this.jcc.d(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19814428966912L, 147629);
        if (AppBrandVideoView.b(AppBrandVideoView.this).isPlaying())
        {
          AppBrandVideoView.this.pause();
          GMTrace.o(19814428966912L, 147629);
          return;
        }
        AppBrandVideoView.this.start();
        GMTrace.o(19814428966912L, 147629);
      }
    });
    this.jcc.jcM = new AppBrandVideoViewControlBar.b()
    {
      public final int WW()
      {
        GMTrace.i(19813892096000L, 147625);
        int i = AppBrandVideoView.b(AppBrandVideoView.this).MN();
        GMTrace.o(19813892096000L, 147625);
        return i;
      }
      
      public final int WX()
      {
        GMTrace.i(19814026313728L, 147626);
        int i = AppBrandVideoView.b(AppBrandVideoView.this).Xs();
        GMTrace.o(19814026313728L, 147626);
        return i;
      }
    };
    this.jcc.cs(WV());
    this.jbZ.a(this.jcc);
    GMTrace.o(17364686995456L, 129377);
  }
  
  private com.tencent.mm.plugin.appbrand.jsapi.video.danmu.d m(JSONObject paramJSONObject)
  {
    GMTrace.i(17366968696832L, 129394);
    if (paramJSONObject == null)
    {
      GMTrace.o(17366968696832L, 129394);
      return null;
    }
    int j = paramJSONObject.optInt("time", 0);
    String str = paramJSONObject.optString("text", "");
    paramJSONObject = paramJSONObject.optString("color", "");
    try
    {
      i = Color.parseColor(paramJSONObject);
      paramJSONObject = new a(getContext(), new SpannableString(str), i, j);
      GMTrace.o(17366968696832L, 129394);
      return paramJSONObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.d("MicroMsg.AppBrandVideoView", "addDanmakuItemList parse color=%s exp=%s", new Object[] { paramJSONObject, localException });
        int i = getResources().getColor(p.c.white);
      }
    }
  }
  
  public final boolean WT()
  {
    GMTrace.i(17367371350016L, 129397);
    if (this.jct == null)
    {
      w.w("MicroMsg.AppBrandVideoView", "isInFullScreen mFullScreenDelegate null");
      GMTrace.o(17367371350016L, 129397);
      return false;
    }
    boolean bool = this.jct.isFullScreen();
    GMTrace.o(17367371350016L, 129397);
    return bool;
  }
  
  /* Error */
  public final boolean aZ(String arg1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 594
    //   3: ldc_w 596
    //   6: invokestatic 87	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 129	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:jcb	Lcom/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView;
    //   13: ifnonnull +15 -> 28
    //   16: ldc -48
    //   18: ldc_w 598
    //   21: invokestatic 588	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: aload_0
    //   25: invokespecial 600	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:WU	()V
    //   28: aload_2
    //   29: invokestatic 516	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   32: istore_3
    //   33: new 518	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/a
    //   36: dup
    //   37: aload_0
    //   38: invokevirtual 165	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:getContext	()Landroid/content/Context;
    //   41: new 520	android/text/SpannableString
    //   44: dup
    //   45: aload_1
    //   46: invokespecial 523	android/text/SpannableString:<init>	(Ljava/lang/CharSequence;)V
    //   49: iload_3
    //   50: aload_0
    //   51: getfield 155	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:jbZ	Lcom/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoWrapper;
    //   54: invokevirtual 603	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoWrapper:Xu	()I
    //   57: invokespecial 526	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/a:<init>	(Landroid/content/Context;Landroid/text/SpannableString;II)V
    //   60: astore_2
    //   61: aload_0
    //   62: getfield 129	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:jcb	Lcom/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView;
    //   65: astore 4
    //   67: aload 4
    //   69: getfield 607	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView:jea	Ljava/util/Deque;
    //   72: astore_1
    //   73: aload_1
    //   74: monitorenter
    //   75: aload 4
    //   77: getfield 607	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView:jea	Ljava/util/Deque;
    //   80: aload_2
    //   81: invokeinterface 613 2 0
    //   86: pop
    //   87: new 615	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView$3
    //   90: dup
    //   91: aload 4
    //   93: aload_2
    //   94: invokespecial 618	com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView$3:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView;Lcom/tencent/mm/plugin/appbrand/jsapi/video/danmu/d;)V
    //   97: ldc_w 620
    //   100: invokestatic 626	com/tencent/mm/sdk/f/e:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   103: aload_1
    //   104: monitorexit
    //   105: ldc2_w 594
    //   108: ldc_w 596
    //   111: invokestatic 98	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   114: iconst_1
    //   115: ireturn
    //   116: astore 4
    //   118: ldc -48
    //   120: ldc_w 528
    //   123: iconst_2
    //   124: anewarray 212	java/lang/Object
    //   127: dup
    //   128: iconst_0
    //   129: aload_2
    //   130: aastore
    //   131: dup
    //   132: iconst_1
    //   133: aload 4
    //   135: aastore
    //   136: invokestatic 530	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: aload_0
    //   140: invokevirtual 534	com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView:getResources	()Landroid/content/res/Resources;
    //   143: getstatic 539	com/tencent/mm/plugin/appbrand/p$c:white	I
    //   146: invokevirtual 545	android/content/res/Resources:getColor	(I)I
    //   149: istore_3
    //   150: goto -117 -> 33
    //   153: astore_2
    //   154: aload_1
    //   155: monitorexit
    //   156: aload_2
    //   157: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	AppBrandVideoView
    //   0	158	2	paramString2	String
    //   32	118	3	i	int
    //   65	27	4	localDanmuView	DanmuView
    //   116	18	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   28	33	116	java/lang/Exception
    //   75	105	153	finally
    //   154	156	153	finally
  }
  
  public final void ch(boolean paramBoolean)
  {
    GMTrace.i(17364821213184L, 129378);
    w.i("MicroMsg.AppBrandVideoView", "setLoop loop=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jcv = paramBoolean;
    GMTrace.o(17364821213184L, 129378);
  }
  
  public final void ci(boolean paramBoolean)
  {
    GMTrace.i(17365760737280L, 129385);
    w.i("MicroMsg.AppBrandVideoView", "setIsShowBasicControls isShowBasicControls=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jco = paramBoolean;
    GMTrace.o(17365760737280L, 129385);
  }
  
  public final void cj(boolean paramBoolean)
  {
    GMTrace.i(17366029172736L, 129387);
    w.i("MicroMsg.AppBrandVideoView", "setShowDanmakuBtn showDanmakuBtn=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      if (this.jcb == null) {
        WU();
      }
      localAppBrandVideoViewControlBar = this.jcc;
      AppBrandVideoViewControlBar.a local4 = new AppBrandVideoViewControlBar.a()
      {
        public final void cp(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19814294749184L, 147628);
          if (paramAnonymousBoolean) {
            if (AppBrandVideoView.b(AppBrandVideoView.this).isPlaying()) {
              AppBrandVideoView.c(AppBrandVideoView.this).show();
            }
          }
          for (;;)
          {
            if (AppBrandVideoView.d(AppBrandVideoView.this) == null) {
              break label167;
            }
            e locale = AppBrandVideoView.d(AppBrandVideoView.this);
            int i = AppBrandVideoView.e(AppBrandVideoView.this);
            try
            {
              w.i("MicroMsg.JsApiVideoCallback", "onVideoClickDanmuBtn showDanmu=%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
              JSONObject localJSONObject = locale.Xx();
              localJSONObject.put("showDanmu", paramAnonymousBoolean);
              localJSONObject.put("videoPlayerId", i);
              locale.a(new e.a(), localJSONObject);
              GMTrace.o(19814294749184L, 147628);
              return;
            }
            catch (JSONException localJSONException)
            {
              w.e("MicroMsg.JsApiVideoCallback", "onVideoClickDanmuBtn e=%s", new Object[] { localJSONException });
            }
            AppBrandVideoView.c(AppBrandVideoView.this).pause();
            continue;
            AppBrandVideoView.c(AppBrandVideoView.this).hide();
          }
          label167:
          GMTrace.o(19814294749184L, 147628);
        }
      };
      localAppBrandVideoViewControlBar.jcH.setOnClickListener(new AppBrandVideoViewControlBar.1(localAppBrandVideoViewControlBar, local4));
    }
    AppBrandVideoViewControlBar localAppBrandVideoViewControlBar = this.jcc;
    if (paramBoolean)
    {
      localAppBrandVideoViewControlBar.jcH.setVisibility(0);
      GMTrace.o(17366029172736L, 129387);
      return;
    }
    localAppBrandVideoViewControlBar.jcH.setVisibility(8);
    GMTrace.o(17366029172736L, 129387);
  }
  
  public final void ck(boolean paramBoolean)
  {
    GMTrace.i(17366297608192L, 129389);
    w.i("MicroMsg.AppBrandVideoView", "setMute isMute=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jbZ.ck(paramBoolean);
    GMTrace.o(17366297608192L, 129389);
  }
  
  public final void cl(boolean paramBoolean)
  {
    GMTrace.i(17366566043648L, 129391);
    w.i("MicroMsg.AppBrandVideoView", "setDisableScroll isDisableScroll=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jcq = paramBoolean;
    GMTrace.o(17366566043648L, 129391);
  }
  
  public final void clean()
  {
    GMTrace.i(17365358084096L, 129382);
    w.i("MicroMsg.AppBrandVideoView", "clean");
    stop();
    this.jbZ.Xv();
    if (this.jcb != null)
    {
      localObject = this.jcb;
      ((DanmuView)localObject).status = 3;
      ((DanmuView)localObject).XH();
      ((DanmuView)localObject).jeb.clear();
      ((DanmuView)localObject).invalidate();
    }
    Object localObject = this.jcc;
    if (((AppBrandVideoViewControlBar)localObject).jcO != null) {
      ((AppBrandVideoViewControlBar)localObject).jcO.MM();
    }
    if (((AppBrandVideoViewControlBar)localObject).jcN != null) {
      ((AppBrandVideoViewControlBar)localObject).jcN.MM();
    }
    GMTrace.o(17365358084096L, 129382);
  }
  
  public final void cm(boolean paramBoolean)
  {
    GMTrace.i(18212003512320L, 135690);
    w.i("MicroMsg.AppBrandVideoView", "setPageGesture pageGesture=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jcr = paramBoolean;
    GMTrace.o(18212003512320L, 135690);
  }
  
  public final void cn(boolean paramBoolean)
  {
    boolean bool = false;
    GMTrace.i(17367237132288L, 129396);
    w.i("MicroMsg.AppBrandVideoView", "operateFullScreen toFullScreen=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (this.jct == null)
    {
      w.w("MicroMsg.AppBrandVideoView", "operateFullScreen mFullScreenDelegate null");
      GMTrace.o(17367237132288L, 129396);
      return;
    }
    if (paramBoolean == WT())
    {
      w.i("MicroMsg.AppBrandVideoView", "operateFullScreen current same");
      GMTrace.o(17367237132288L, 129396);
      return;
    }
    if (paramBoolean)
    {
      Object localObject = this.jct;
      paramBoolean = bool;
      if (this.jbY != b.jcE) {
        paramBoolean = true;
      }
      ((a)localObject).cq(paramBoolean);
      localObject = this.jcc;
      ((AppBrandVideoViewControlBar)localObject).jcP = true;
      ((AppBrandVideoViewControlBar)localObject).Xn();
      co(true);
      GMTrace.o(17367237132288L, 129396);
      return;
    }
    this.jct.Xi();
    this.jcc.Xi();
    GMTrace.o(17367237132288L, 129396);
  }
  
  final void co(boolean paramBoolean)
  {
    GMTrace.i(18212271947776L, 135692);
    if (this.jcp == null)
    {
      GMTrace.o(18212271947776L, 135692);
      return;
    }
    if (this.jbY == b.jcE) {}
    for (String str = "vertical";; str = "horizontal")
    {
      e locale = this.jcp;
      int i = this.jcm;
      try
      {
        w.i("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%s", new Object[] { Integer.valueOf(i), Boolean.valueOf(paramBoolean), str });
        JSONObject localJSONObject = locale.Xx();
        localJSONObject.put("fullScreen", paramBoolean);
        localJSONObject.put("videoPlayerId", i);
        localJSONObject.put("direction", str);
        locale.a(new e.c(), localJSONObject);
        GMTrace.o(18212271947776L, 135692);
        return;
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange e=%s", new Object[] { localJSONException });
        GMTrace.o(18212271947776L, 135692);
      }
    }
  }
  
  public final void e(final String paramString, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(17365492301824L, 129383);
    w.i("MicroMsg.AppBrandVideoView", "setVideoPath path=%s isLive=%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (bg.mZ(paramString))
    {
      w.v("MicroMsg.AppBrandVideoView", "setVideoPath videoPath empty");
      GMTrace.o(17365492301824L, 129383);
      return;
    }
    stop();
    this.jcu = paramBoolean;
    AppBrandVideoWrapper localAppBrandVideoWrapper = this.jbZ;
    Object localObject;
    if (bg.mZ(paramString)) {
      localObject = paramString;
    }
    for (;;)
    {
      localAppBrandVideoWrapper.b(paramBoolean, (String)localObject, paramInt);
      if (this.jcw > 0) {
        this.jbZ.iI(this.jcw);
      }
      if (this.jcn)
      {
        w.i("MicroMsg.AppBrandVideoView", "setVideoPath autoPlay");
        start();
      }
      if ((!paramString.startsWith("wxfile://")) || (bg.mZ(paramString))) {
        break label391;
      }
      if (bg.mZ(this.jcx)) {
        break;
      }
      w.i("MicroMsg.AppBrandVideoView", "setCover mCoverUrl not null");
      GMTrace.o(17365492301824L, 129383);
      return;
      if (!paramString.startsWith("wxfile://"))
      {
        localObject = paramString;
      }
      else
      {
        w.i("MicroMsg.AppBrandVideoView", "convertPath appid=%s path=%s", new Object[] { this.iqL, paramString });
        localObject = com.tencent.mm.plugin.appbrand.appstorage.c.aI(this.iqL, paramString);
        if (localObject == null)
        {
          w.e("MicroMsg.AppBrandVideoView", "convertPath AppBrandLocalMediaObject null");
          localObject = paramString;
        }
        else
        {
          localObject = ((AppBrandLocalMediaObject)localObject).hhT;
          if (bg.mZ((String)localObject))
          {
            w.e("MicroMsg.AppBrandVideoView", "convertPath fileFullPath null");
            localObject = paramString;
          }
          else
          {
            localObject = String.format("%s%s", new Object[] { "wxfile://", localObject });
            w.i("MicroMsg.AppBrandVideoView", "convertPath convertedPath=%s", new Object[] { localObject });
          }
        }
      }
    }
    paramString = com.tencent.mm.plugin.appbrand.appstorage.c.aI(this.iqL, paramString);
    if (paramString == null)
    {
      w.w("MicroMsg.AppBrandVideoView", "setCover AppBrandLocalMediaObject null");
      GMTrace.o(17365492301824L, 129383);
      return;
    }
    paramString = paramString.hhT;
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.AppBrandVideoView", "setCover fileFullPath null");
      GMTrace.o(17365492301824L, 129383);
      return;
    }
    com.tencent.mm.plugin.appbrand.o.d.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19813623660544L, 147623);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19812147265536L, 147612);
            if ((this.jcA != null) && (!this.jcA.isRecycled())) {
              AppBrandVideoView.a(AppBrandVideoView.this).setImageBitmap(this.jcA);
            }
            GMTrace.o(19812147265536L, 147612);
          }
        });
        GMTrace.o(19813623660544L, 147623);
      }
    });
    label391:
    GMTrace.o(17365492301824L, 129383);
  }
  
  public final void iE(int paramInt)
  {
    GMTrace.i(19807986515968L, 147581);
    w.i("MicroMsg.AppBrandVideoView", "setInitialTime initialTime=%d", new Object[] { Integer.valueOf(paramInt) });
    this.jcw = paramInt;
    GMTrace.o(19807986515968L, 147581);
  }
  
  public final void j(JSONArray paramJSONArray)
  {
    int j = 0;
    GMTrace.i(17366700261376L, 129392);
    if (paramJSONArray == null)
    {
      GMTrace.o(17366700261376L, 129392);
      return;
    }
    if (paramJSONArray != null) {}
    ArrayList localArrayList;
    for (int i = paramJSONArray.length();; i = 0)
    {
      w.i("MicroMsg.AppBrandVideoView", "setDanmakuItemList length=%d", new Object[] { Integer.valueOf(i) });
      if (this.jcb == null)
      {
        w.w("MicroMsg.AppBrandVideoView", " setDanmakuItemList mDanmakuView null");
        WU();
      }
      localArrayList = new ArrayList();
      i = j;
      while (i < paramJSONArray.length())
      {
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.d locald = m(paramJSONArray.optJSONObject(i));
        if (locald != null) {
          localArrayList.add(locald);
        }
        i += 1;
      }
    }
    paramJSONArray = this.jcb;
    paramJSONArray.XF();
    paramJSONArray.XH();
    paramJSONArray.jeb.clear();
    paramJSONArray.prepare();
    if (localArrayList.isEmpty())
    {
      paramJSONArray.XG();
      GMTrace.o(17366700261376L, 129392);
      return;
    }
    new DanmuView.4(paramJSONArray, localArrayList).start();
    paramJSONArray.XG();
    GMTrace.o(17366700261376L, 129392);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17367102914560L, 129395);
    if ((this.jcr) || (WT()))
    {
      f localf;
      if (this.jcs != null)
      {
        localf = this.jcs;
        int i = paramMotionEvent.getActionMasked();
        if (i == 0)
        {
          localf.jdv = paramMotionEvent.getRawX();
          localf.jdu = ((AudioManager)localf.mContext.getSystemService("audio")).getStreamVolume(3);
          localf.iRk = g.bL(localf.mContext);
        }
        localf.jds.onTouchEvent(paramMotionEvent);
        if ((i == 1) || (i == 3))
        {
          if (localf.jdr != f.a.jdD) {
            break label183;
          }
          localf.jdt.e(localf.jdx, paramMotionEvent.getRawX() - localf.jdv);
          localf.jdw = -1;
          localf.jdx = 0;
          localf.jdv = 0.0F;
        }
      }
      for (;;)
      {
        localf.jdr = f.a.jdA;
        GMTrace.o(17367102914560L, 129395);
        return true;
        label183:
        if (localf.jdr == f.a.jdB)
        {
          ((AudioManager)localf.mContext.getSystemService("audio")).getStreamMaxVolume(3);
          localf.jdt.Xb();
        }
        else if (localf.jdr == f.a.jdC)
        {
          localf.jdt.Xc();
        }
      }
    }
    if ((paramMotionEvent.getAction() == 0) && (this.jco) && (this.jcd.getVisibility() != 0)) {
      this.jcc.Xm();
    }
    boolean bool = super.onTouchEvent(paramMotionEvent);
    GMTrace.o(17367102914560L, 129395);
    return bool;
  }
  
  public final void pause()
  {
    GMTrace.i(17365089648640L, 129380);
    w.i("MicroMsg.AppBrandVideoView", "pause");
    if (!this.jbZ.isPlaying())
    {
      GMTrace.o(17365089648640L, 129380);
      return;
    }
    this.jbZ.pause();
    if ((this.jcb != null) && (this.jcc.jcQ)) {
      this.jcb.pause();
    }
    GMTrace.o(17365089648640L, 129380);
  }
  
  public final void qv(String paramString)
  {
    GMTrace.i(19807852298240L, 147580);
    w.i("MicroMsg.AppBrandVideoView", "setCover coverUrl=%s", new Object[] { paramString });
    if (bg.mZ(paramString))
    {
      GMTrace.o(19807852298240L, 147580);
      return;
    }
    this.jcx = paramString;
    com.tencent.mm.modelappbrand.a.b.CT().a(this.jck, paramString, null, null);
    GMTrace.o(19807852298240L, 147580);
  }
  
  public final void qw(String paramString)
  {
    GMTrace.i(17366163390464L, 129388);
    w.i("MicroMsg.AppBrandVideoView", "setObjectFit objectFit=%s", new Object[] { paramString });
    if ("fill".equalsIgnoreCase(paramString))
    {
      this.jbZ.a(h.d.sYN);
      this.jck.setScaleType(ImageView.ScaleType.FIT_XY);
      GMTrace.o(17366163390464L, 129388);
      return;
    }
    if ("cover".equalsIgnoreCase(paramString))
    {
      this.jbZ.a(h.d.sYP);
      this.jck.setScaleType(ImageView.ScaleType.CENTER_CROP);
      GMTrace.o(17366163390464L, 129388);
      return;
    }
    this.jbZ.a(h.d.sYO);
    this.jck.setScaleType(ImageView.ScaleType.FIT_CENTER);
    GMTrace.o(17366163390464L, 129388);
  }
  
  public final void qx(String paramString)
  {
    GMTrace.i(17366431825920L, 129390);
    w.i("MicroMsg.AppBrandVideoView", "setFullScreenDirection %s", new Object[] { paramString });
    if ("horizontal".equalsIgnoreCase(paramString))
    {
      this.jbY = b.jcD;
      GMTrace.o(17366431825920L, 129390);
      return;
    }
    if ("vertical".equalsIgnoreCase(paramString))
    {
      this.jbY = b.jcE;
      GMTrace.o(17366431825920L, 129390);
      return;
    }
    this.jbY = b.jcC;
    GMTrace.o(17366431825920L, 129390);
  }
  
  public final void r(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17365626519552L, 129384);
    int i = this.jbZ.Xu();
    w.i("MicroMsg.AppBrandVideoView", "seek to position=%d current=%d isLive=%b", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Boolean.valueOf(this.jcu) });
    if (WV())
    {
      GMTrace.o(17365626519552L, 129384);
      return;
    }
    this.jcd.setVisibility(8);
    if (paramBoolean) {
      this.jbZ.o(paramInt, paramBoolean);
    }
    for (;;)
    {
      if ((this.jcb != null) && (i > paramInt))
      {
        DanmuView localDanmuView = this.jcb;
        w.i("MicroMsg.DanmuView", "seekToPlayTime playTime=%d", new Object[] { Integer.valueOf(paramInt) });
        localDanmuView.XF();
        localDanmuView.XH();
        localDanmuView.prepare();
        com.tencent.mm.sdk.f.e.post(new DanmuView.5(localDanmuView, paramInt), "DanmuView-seekToPlayTime");
      }
      GMTrace.o(17365626519552L, 129384);
      return;
      this.jbZ.iI(paramInt);
    }
  }
  
  public final void start()
  {
    GMTrace.i(17364955430912L, 129379);
    w.i("MicroMsg.AppBrandVideoView", "start");
    if (this.jbZ.isPlaying())
    {
      GMTrace.o(17364955430912L, 129379);
      return;
    }
    if (this.jco)
    {
      AppBrandVideoViewControlBar localAppBrandVideoViewControlBar = this.jcc;
      if (localAppBrandVideoViewControlBar.jcO == null) {
        localAppBrandVideoViewControlBar.jcO = new aj(new AppBrandVideoViewControlBar.3(localAppBrandVideoViewControlBar), true);
      }
      localAppBrandVideoViewControlBar.Xo();
      localAppBrandVideoViewControlBar.jcO.MM();
      localAppBrandVideoViewControlBar.jcO.w(500L, 500L);
    }
    this.jcd.setVisibility(8);
    this.jbZ.start();
    if ((this.jcb != null) && (this.jcc.jcQ)) {
      this.jcb.show();
    }
    GMTrace.o(17364955430912L, 129379);
  }
  
  public final void stop()
  {
    GMTrace.i(17365223866368L, 129381);
    w.i("MicroMsg.AppBrandVideoView", "stop");
    if (!this.jbZ.isPlaying())
    {
      GMTrace.o(17365223866368L, 129381);
      return;
    }
    this.jbZ.stop();
    AppBrandVideoViewControlBar localAppBrandVideoViewControlBar = this.jcc;
    if (localAppBrandVideoViewControlBar.jcO != null) {
      localAppBrandVideoViewControlBar.jcO.MM();
    }
    if (this.jcb != null) {
      this.jcb.hide();
    }
    GMTrace.o(17365223866368L, 129381);
  }
  
  public static abstract interface a
  {
    public abstract void Xi();
    
    public abstract void cq(boolean paramBoolean);
    
    public abstract boolean isFullScreen();
  }
  
  private static enum b
  {
    static
    {
      GMTrace.i(17362673729536L, 129362);
      jcC = new b("AUTO", 0);
      jcD = new b("LANDSCAPE", 1);
      jcE = new b("PORTRAIT", 2);
      jcF = new b[] { jcC, jcD, jcE };
      GMTrace.o(17362673729536L, 129362);
    }
    
    private b()
    {
      GMTrace.i(17362539511808L, 129361);
      GMTrace.o(17362539511808L, 129361);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */