package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.a;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.c;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AppBrandCameraView
  extends RelativeLayout
  implements AppBrandPageView.b, AppBrandPageView.c, AppBrandPageView.d
{
  MMSightRecordView.a iVA;
  AppBrandPageView iVf;
  int iVg;
  private String iVh;
  String iVi;
  String iVj;
  boolean iVk;
  private boolean iVl;
  private int iVm;
  private int iVn;
  private int iVo;
  private int iVp;
  c iVq;
  b iVr;
  MMSightRecordView iVs;
  private String iVt;
  private String iVu;
  private String iVv;
  int iVw;
  boolean iVx;
  long iVy;
  long iVz;
  String iqL;
  Context mContext;
  
  public AppBrandCameraView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(19839393464320L, 147815);
    this.iVh = "back";
    this.iVi = "auto";
    this.iVj = "high";
    this.iVl = false;
    this.iVm = 1080;
    this.iVn = 1920;
    this.iVo = 1080;
    this.iVp = 1920;
    this.iVw = -1;
    this.iVx = false;
    this.iVy = -1L;
    this.iVz = -1L;
    this.iVA = new MMSightRecordView.a() {};
    init(paramContext);
    GMTrace.o(19839393464320L, 147815);
  }
  
  public AppBrandCameraView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19839527682048L, 147816);
    this.iVh = "back";
    this.iVi = "auto";
    this.iVj = "high";
    this.iVl = false;
    this.iVm = 1080;
    this.iVn = 1920;
    this.iVo = 1080;
    this.iVp = 1920;
    this.iVw = -1;
    this.iVx = false;
    this.iVy = -1L;
    this.iVz = -1L;
    this.iVA = new MMSightRecordView.a() {};
    init(paramContext);
    GMTrace.o(19839527682048L, 147816);
  }
  
  public AppBrandCameraView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(19839661899776L, 147817);
    this.iVh = "back";
    this.iVi = "auto";
    this.iVj = "high";
    this.iVl = false;
    this.iVm = 1080;
    this.iVn = 1920;
    this.iVo = 1080;
    this.iVp = 1920;
    this.iVw = -1;
    this.iVx = false;
    this.iVy = -1L;
    this.iVz = -1L;
    this.iVA = new MMSightRecordView.a() {};
    init(paramContext);
    GMTrace.o(19839661899776L, 147817);
  }
  
  private void Wr()
  {
    GMTrace.i(19841138294784L, 147828);
    w.i("MicroMsg.AppBrandCameraView", "initCamera.");
    if (!a.a.iVe.Wp())
    {
      Toast.makeText(this.mContext, p.i.izc, 1).show();
      w.w("MicroMsg.AppBrandCameraView", "no permission");
      GMTrace.o(19841138294784L, 147828);
      return;
    }
    if (this.iVs != null)
    {
      w.i("MicroMsg.AppBrandCameraView", "initCamera recordView not null.");
      GMTrace.o(19841138294784L, 147828);
      return;
    }
    this.iVs = new MMSightRecordView(this.mContext);
    addView(this.iVs);
    this.iVs.hG(720);
    this.iVs.nKp.Rp();
    this.iVs.M(this.iVm * 1.0F / this.iVn);
    this.iVs.qw(600000);
    this.iVs.nu(this.iVt);
    this.iVs.aNP();
    this.iVs.aNO();
    MMSightRecordView localMMSightRecordView = this.iVs;
    boolean bool = "back".equals(this.iVh);
    localMMSightRecordView.nKp.bP(bool);
    this.iVs.nKp.startPreview();
    this.iVs.nKp.Rf();
    localMMSightRecordView = this.iVs;
    MMSightRecordView.c local2 = new MMSightRecordView.c()
    {
      public final void Wx()
      {
        GMTrace.i(19838319722496L, 147807);
        w.w("MicroMsg.AppBrandCameraView", "InitErrorCallback");
        Object localObject = new HashMap();
        ((Map)localObject).put("cameraId", Integer.valueOf(AppBrandCameraView.b(AppBrandCameraView.this)));
        localObject = new JSONObject((Map)localObject).toString();
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new d().a(AppBrandCameraView.c(AppBrandCameraView.this));
        locale.mData = ((String)localObject);
        locale.VI();
        GMTrace.o(19838319722496L, 147807);
      }
    };
    localMMSightRecordView.nKp.a(local2);
    this.iVw = 1;
    GMTrace.o(19841138294784L, 147828);
  }
  
  private void Wt()
  {
    GMTrace.i(19841406730240L, 147830);
    this.iVv = (com.tencent.mm.compatible.util.e.gKA + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" }));
    GMTrace.o(19841406730240L, 147830);
  }
  
  private void Wu()
  {
    GMTrace.i(19841540947968L, 147831);
    String str = "MicroMsg_" + System.currentTimeMillis();
    this.iVt = (com.tencent.mm.compatible.util.e.gKA + str + ".mp4");
    this.iVu = (com.tencent.mm.compatible.util.e.gKA + str + ".jpeg");
    if (this.iVs != null) {
      this.iVs.nu(this.iVt);
    }
    GMTrace.o(19841540947968L, 147831);
  }
  
  private boolean a(Bitmap paramBitmap, String paramString)
  {
    GMTrace.i(19842212036608L, 147836);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled())) {
      try
      {
        int i = paramBitmap.getWidth();
        int j = paramBitmap.getHeight();
        Bitmap localBitmap = paramBitmap;
        if (i != 0)
        {
          localBitmap = paramBitmap;
          if (j != 0)
          {
            if (!"normal".equals(this.iVj)) {
              break label141;
            }
            localBitmap = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, j * 2 / 3, i * 2 / 3, false, true);
          }
        }
        for (;;)
        {
          this.iVo = localBitmap.getWidth();
          this.iVp = localBitmap.getHeight();
          com.tencent.mm.sdk.platformtools.d.a(localBitmap, 90, Bitmap.CompressFormat.JPEG, paramString, false);
          w.i("MicroMsg.AppBrandCameraView", "bitmap filelen %s", new Object[] { Long.valueOf(FileOp.kI(paramString)) });
          GMTrace.o(19842212036608L, 147836);
          return true;
          label141:
          localBitmap = paramBitmap;
          if ("low".equals(this.iVj)) {
            localBitmap = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, j / 2, i / 2, false, true);
          }
        }
        GMTrace.o(19842212036608L, 147836);
      }
      catch (Exception paramBitmap)
      {
        w.e("MicroMsg.AppBrandCameraView", "error for saveBitmapToImage %s", new Object[] { paramBitmap.getMessage() });
      }
    }
    return false;
  }
  
  private void b(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(19842077818880L, 147835);
    if (this.iVq != null) {
      this.iVq.b(paramInt, paramString1, qe(paramString2), qe(paramString3));
    }
    Wv();
    GMTrace.o(19842077818880L, 147835);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(19839796117504L, 147818);
    this.mContext = paramContext;
    LayoutInflater.from(paramContext).inflate(p.g.iuZ, this);
    GMTrace.o(19839796117504L, 147818);
  }
  
  private String qe(String paramString)
  {
    GMTrace.i(19841004077056L, 147827);
    if (bg.mZ(paramString))
    {
      GMTrace.o(19841004077056L, 147827);
      return paramString;
    }
    paramString = com.tencent.mm.plugin.appbrand.appstorage.c.c(this.iqL, paramString, false);
    if (paramString != null)
    {
      paramString = paramString.fAx;
      GMTrace.o(19841004077056L, 147827);
      return paramString;
    }
    GMTrace.o(19841004077056L, 147827);
    return null;
  }
  
  public final void K(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19840064552960L, 147820);
    if (bg.eI(this.iVh, paramString))
    {
      GMTrace.o(19840064552960L, 147820);
      return;
    }
    this.iVh = paramString;
    if ((!paramBoolean) && (this.iVs != null)) {
      this.iVs.nKp.Rj();
    }
    GMTrace.o(19840064552960L, 147820);
  }
  
  public final void MH()
  {
    GMTrace.i(19839930335232L, 147819);
    w.i("MicroMsg.AppBrandCameraView", "initView");
    if (!a.a.iVe.Wp())
    {
      GMTrace.o(19839930335232L, 147819);
      return;
    }
    Wu();
    Wt();
    Wr();
    Ws();
    GMTrace.o(19839930335232L, 147819);
  }
  
  public final void VS()
  {
    GMTrace.i(19840467206144L, 147823);
    w.i("MicroMsg.AppBrandCameraView", "onUIPause");
    if (this.iVw == 2)
    {
      w.d("MicroMsg.AppBrandCameraView", "onStopRecord fromOnPause");
      localObject = new HashMap();
      ((Map)localObject).put("cameraId", Integer.valueOf(this.iVg));
      ((Map)localObject).put("errMsg", "stop on record");
      localObject = new JSONObject((Map)localObject).toString();
      locale = new g().a(this.iVf);
      locale.mData = ((String)localObject);
      locale.VI();
    }
    release();
    Object localObject = new HashMap();
    ((Map)localObject).put("cameraId", Integer.valueOf(this.iVg));
    localObject = new JSONObject((Map)localObject).toString();
    com.tencent.mm.plugin.appbrand.jsapi.e locale = new e().a(this.iVf);
    locale.mData = ((String)localObject);
    locale.VI();
    GMTrace.o(19840467206144L, 147823);
  }
  
  public final void Wq()
  {
    GMTrace.i(19840601423872L, 147824);
    w.i("MicroMsg.AppBrandCameraView", "onUIResume");
    try
    {
      Wr();
      GMTrace.o(19840601423872L, 147824);
      return;
    }
    finally {}
  }
  
  public final void Ws()
  {
    GMTrace.i(19841272512512L, 147829);
    if (this.iVs == null)
    {
      w.i("MicroMsg.AppBrandCameraView", "recordView is null");
      GMTrace.o(19841272512512L, 147829);
      return;
    }
    if (this.iVk) {
      this.iVs.a(this.iVA);
    }
    for (;;)
    {
      Wv();
      GMTrace.o(19841272512512L, 147829);
      return;
      this.iVs.a(null);
    }
  }
  
  public final void Wv()
  {
    GMTrace.i(19841675165696L, 147832);
    if ((this.iVs == null) || (this.iVi == null))
    {
      GMTrace.o(19841675165696L, 147832);
      return;
    }
    if (this.iVw != 2)
    {
      if (this.iVs.nKp.Rn() == 1) {
        this.iVs.hH(2);
      }
      if (this.iVi.equals("auto"))
      {
        this.iVs.hH(3);
        GMTrace.o(19841675165696L, 147832);
      }
    }
    else
    {
      if (this.iVi.equals("on"))
      {
        this.iVs.hH(1);
        GMTrace.o(19841675165696L, 147832);
        return;
      }
      this.iVs.hH(2);
    }
    GMTrace.o(19841675165696L, 147832);
  }
  
  public final boolean bp(int paramInt1, int paramInt2)
  {
    GMTrace.i(19840332988416L, 147822);
    if ((this.iVm == paramInt1) && (this.iVn == paramInt2))
    {
      GMTrace.o(19840332988416L, 147822);
      return false;
    }
    w.i("MicroMsg.AppBrandCameraView", "setViewSize");
    this.iVm = paramInt1;
    this.iVn = paramInt2;
    GMTrace.o(19840332988416L, 147822);
    return true;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19840735641600L, 147825);
    release();
    GMTrace.o(19840735641600L, 147825);
  }
  
  public final void pN()
  {
    GMTrace.i(19841943601152L, 147834);
    w.i("MicroMsg.AppBrandCameraView", "stopRecord");
    if (this.iVs == null)
    {
      w.i("MicroMsg.AppBrandCameraView", "recordView is null");
      b(-1, "camera is null", null, null);
      GMTrace.o(19841943601152L, 147834);
      return;
    }
    if (this.iVw != 2)
    {
      w.w("MicroMsg.AppBrandCameraView", "stopRecord is not recording!!");
      b(-1, "is not recording", null, null);
      GMTrace.o(19841943601152L, 147834);
      return;
    }
    if (this.iVl)
    {
      w.i("MicroMsg.AppBrandCameraView", "recordView is IsStopping");
      b(-1, "is stopping", null, null);
      GMTrace.o(19841943601152L, 147834);
      return;
    }
    this.iVl = true;
    this.iVs.a(new MMSightRecordView.f()
    {
      public final void ce(boolean paramAnonymousBoolean)
      {
        GMTrace.i(19839259246592L, 147814);
        w.i("MicroMsg.AppBrandCameraView", "onRecordFinish error %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (AppBrandCameraView.d(AppBrandCameraView.this) == null)
        {
          w.i("MicroMsg.AppBrandCameraView", "onRecordFinish recordView is null");
          AppBrandCameraView.a(AppBrandCameraView.this, -1, "camera is null", null, null);
          GMTrace.o(19839259246592L, 147814);
          return;
        }
        AppBrandCameraView.this.iVw = 1;
        if (paramAnonymousBoolean) {
          AppBrandCameraView.a(AppBrandCameraView.this, -1, "stop error", null, null);
        }
        for (;;)
        {
          AppBrandCameraView.h(AppBrandCameraView.this);
          AppBrandCameraView.i(AppBrandCameraView.this);
          GMTrace.o(19839259246592L, 147814);
          return;
          Bitmap localBitmap = com.tencent.mm.plugin.sight.base.d.L(AppBrandCameraView.d(AppBrandCameraView.this).nKp.Re(), AppBrandCameraView.e(AppBrandCameraView.this), AppBrandCameraView.f(AppBrandCameraView.this));
          AppBrandCameraView.a(AppBrandCameraView.this, localBitmap, AppBrandCameraView.g(AppBrandCameraView.this));
          AppBrandCameraView.a(AppBrandCameraView.this, 0, "", AppBrandCameraView.g(AppBrandCameraView.this), AppBrandCameraView.d(AppBrandCameraView.this).nKp.Re());
        }
      }
    });
    GMTrace.o(19841943601152L, 147834);
  }
  
  public final void qd(String paramString)
  {
    GMTrace.i(19840198770688L, 147821);
    if (bg.eI(this.iVi, paramString))
    {
      GMTrace.o(19840198770688L, 147821);
      return;
    }
    this.iVi = paramString;
    GMTrace.o(19840198770688L, 147821);
  }
  
  public final void release()
  {
    GMTrace.i(19840869859328L, 147826);
    w.i("MicroMsg.AppBrandCameraView", "release");
    try
    {
      if (this.iVs != null)
      {
        this.iVs.nKp.release();
        removeView(this.iVs);
        this.iVw = -1;
        this.iVs = null;
      }
      GMTrace.o(19840869859328L, 147826);
      return;
    }
    finally {}
  }
  
  final void x(int paramInt, String paramString)
  {
    GMTrace.i(19841809383424L, 147833);
    if (this.iVq != null) {
      this.iVq.x(paramInt, paramString);
    }
    GMTrace.o(19841809383424L, 147833);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/camera/AppBrandCameraView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */