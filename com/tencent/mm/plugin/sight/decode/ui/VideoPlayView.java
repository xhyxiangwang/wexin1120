package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.plugin.ae.a.e;
import com.tencent.mm.plugin.ae.a.f;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.b;
import com.tencent.mm.pluginsdk.ui.tools.f.c;
import com.tencent.mm.pluginsdk.ui.tools.f.d;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.d.a;

public class VideoPlayView
  extends RelativeLayout
  implements f, d.a
{
  private int duration;
  public String hCR;
  private ae ham;
  private boolean kwx;
  public f kwz;
  private ProgressBar lhK;
  public View ocG;
  private int pCL;
  private int pCM;
  private boolean pCN;
  public a pCO;
  private ViewGroup pCP;
  public a pCQ;
  private double pCR;
  public TextView pCS;
  public String pCT;
  public View pCU;
  public View pCV;
  public boolean pCW;
  private int pCX;
  private int pCY;
  private boolean pCZ;
  private boolean pDa;
  private long pDb;
  private Animation pDc;
  private Animation pDd;
  private Runnable pDe;
  public int pDf;
  
  public VideoPlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9257667788800L, 68975);
    this.pCL = 320;
    this.pCM = 240;
    this.pCN = true;
    this.kwz = null;
    this.pCR = 0.0D;
    this.pCT = "";
    this.ham = new ae();
    this.pCW = true;
    this.duration = 0;
    this.pCX = 0;
    this.pCY = 0;
    this.pCZ = false;
    this.pDa = false;
    this.pDb = 0L;
    this.pDc = new AlphaAnimation(1.0F, 0.0F);
    this.pDd = new AlphaAnimation(0.0F, 1.0F);
    this.pDe = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9241964314624L, 68858);
        VideoPlayView.this.beZ();
        GMTrace.o(9241964314624L, 68858);
      }
    };
    this.pDf = 0;
    this.kwx = false;
    init();
    GMTrace.o(9257667788800L, 68975);
  }
  
  public VideoPlayView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9257802006528L, 68976);
    this.pCL = 320;
    this.pCM = 240;
    this.pCN = true;
    this.kwz = null;
    this.pCR = 0.0D;
    this.pCT = "";
    this.ham = new ae();
    this.pCW = true;
    this.duration = 0;
    this.pCX = 0;
    this.pCY = 0;
    this.pCZ = false;
    this.pDa = false;
    this.pDb = 0L;
    this.pDc = new AlphaAnimation(1.0F, 0.0F);
    this.pDd = new AlphaAnimation(0.0F, 1.0F);
    this.pDe = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9241964314624L, 68858);
        VideoPlayView.this.beZ();
        GMTrace.o(9241964314624L, 68858);
      }
    };
    this.pDf = 0;
    this.kwx = false;
    init();
    GMTrace.o(9257802006528L, 68976);
  }
  
  private void beY()
  {
    GMTrace.i(9258070441984L, 68978);
    ((View)this.pCQ).setVisibility(0);
    this.pCU.setVisibility(0);
    if (this.pCW) {
      this.pCV.setVisibility(0);
    }
    int i;
    if (this.pDf == 2) {
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        this.ocG.setVisibility(0);
      }
      this.ham.removeCallbacks(this.pDe);
      this.ham.postDelayed(this.pDe, 3000L);
      GMTrace.o(9258070441984L, 68978);
      return;
      if (bg.mZ(this.pCT)) {
        i = 0;
      } else {
        i = 1;
      }
    }
  }
  
  private void ht(boolean paramBoolean)
  {
    GMTrace.i(9258607312896L, 68982);
    this.kwz.o(this.pCR);
    this.kwz.start();
    w.i("MicroMsg.VideoPlayView", "startplay get duration " + this.duration + " lastPlayProgressTime: " + this.pCR);
    if (this.pCO != null) {
      this.pCO.hv(paramBoolean);
    }
    GMTrace.o(9258607312896L, 68982);
  }
  
  private void init()
  {
    GMTrace.i(9257936224256L, 68977);
    this.pDc.setDuration(200L);
    this.pDd.setDuration(200L);
    View.inflate(getContext(), a.f.pNF, this);
    this.pCU = findViewById(a.e.ric);
    this.pCV = findViewById(a.e.rib);
    this.lhK = ((ProgressBar)findViewById(a.e.cle));
    this.pCP = ((ViewGroup)findViewById(a.e.cEe));
    this.kwz = n.dX(getContext());
    this.kwz.ch(false);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    this.pCP.addView((View)this.kwz, 0, localLayoutParams);
    this.pCS = ((TextView)findViewById(a.e.cxV));
    this.ocG = this.pCS;
    this.kwz.a(new f.a()
    {
      public final void Xd()
      {
        GMTrace.i(9264110239744L, 69023);
        w.d("MicroMsg.VideoPlayView", g.tG() + " onPrepared");
        VideoPlayView.a(VideoPlayView.this, true);
        GMTrace.o(9264110239744L, 69023);
      }
      
      public final int bL(final int paramAnonymousInt1, final int paramAnonymousInt2)
      {
        GMTrace.i(9264512892928L, 69026);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9271357997056L, 69077);
            w.i("MicroMsg.VideoPlayView", "play time " + paramAnonymousInt1 + " video time " + paramAnonymousInt2);
            if (paramAnonymousInt2 > 0)
            {
              VideoPlayView.b(VideoPlayView.this, paramAnonymousInt2);
              if ((VideoPlayView.c(VideoPlayView.this) != null) && (VideoPlayView.h(VideoPlayView.this))) {
                VideoPlayView.i(VideoPlayView.this);
              }
              VideoPlayView.f(VideoPlayView.this).tK(paramAnonymousInt2);
            }
            if (VideoPlayView.c(VideoPlayView.this) != null)
            {
              if (VideoPlayView.c(VideoPlayView.this).beQ() != paramAnonymousInt2) {
                VideoPlayView.c(VideoPlayView.this).tI(paramAnonymousInt2);
              }
              VideoPlayView.c(VideoPlayView.this).seek(paramAnonymousInt1);
              VideoPlayView.c(VideoPlayView.this).cr(true);
            }
            if (VideoPlayView.j(VideoPlayView.this).getVisibility() == 0) {
              VideoPlayView.j(VideoPlayView.this).setVisibility(8);
            }
            VideoPlayView.a(VideoPlayView.this, paramAnonymousInt1);
            GMTrace.o(9271357997056L, 69077);
          }
        });
        GMTrace.o(9264512892928L, 69026);
        return 0;
      }
      
      public final void br(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9264647110656L, 69027);
        VideoPlayView.c(VideoPlayView.this, paramAnonymousInt1);
        VideoPlayView.d(VideoPlayView.this, paramAnonymousInt2);
        if (VideoPlayView.k(VideoPlayView.this)) {
          VideoPlayView.l(VideoPlayView.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(18656801062912L, 139004);
              VideoPlayView.e(VideoPlayView.this, VideoPlayView.this.pDf);
              GMTrace.o(18656801062912L, 139004);
            }
          });
        }
        GMTrace.o(9264647110656L, 69027);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(9264244457472L, 69024);
        w.e("MicroMsg.VideoPlayView", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        VideoPlayView.a(VideoPlayView.this).stop();
        GMTrace.o(9264244457472L, 69024);
      }
      
      public final void qq()
      {
        GMTrace.i(9264378675200L, 69025);
        w.d("MicroMsg.VideoPlayView", "on completion " + bg.bOd().toString());
        if (!VideoPlayView.b(VideoPlayView.this))
        {
          VideoPlayView.a(VideoPlayView.this, 0.0D);
          VideoPlayView.this.o(0.0D);
          VideoPlayView.c(VideoPlayView.this).cr(false);
          VideoPlayView.a(VideoPlayView.this, 0);
          VideoPlayView.d(VideoPlayView.this);
          if (System.currentTimeMillis() - VideoPlayView.e(VideoPlayView.this) < 2000L)
          {
            w.i("MicroMsg.VideoPlayView", "Too short onCompletion");
            GMTrace.o(9264378675200L, 69025);
            return;
          }
          VideoPlayView.a(VideoPlayView.this, System.currentTimeMillis());
          if (VideoPlayView.f(VideoPlayView.this) != null)
          {
            VideoPlayView.f(VideoPlayView.this).bfd();
            GMTrace.o(9264378675200L, 69025);
          }
        }
        else
        {
          VideoPlayView.c(VideoPlayView.this).cr(false);
          VideoPlayView.a(VideoPlayView.this, (int)VideoPlayView.g(VideoPlayView.this));
          VideoPlayView.d(VideoPlayView.this);
          if (VideoPlayView.f(VideoPlayView.this) != null) {
            VideoPlayView.f(VideoPlayView.this).bfe();
          }
        }
        GMTrace.o(9264378675200L, 69025);
      }
    });
    if ((this.kwz instanceof VideoSightView)) {
      ((VideoSightView)this.kwz).qsI = false;
    }
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9253372821504L, 68943);
        if (paramAnonymousMotionEvent.getAction() == 1) {
          VideoPlayView.m(VideoPlayView.this);
        }
        for (;;)
        {
          GMTrace.o(9253372821504L, 68943);
          return true;
          paramAnonymousMotionEvent.getAction();
        }
      }
    });
    beZ();
    ((View)this.kwz).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9264915546112L, 69029);
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        if ((VideoPlayView.this.getContext() instanceof MMActivity))
        {
          ((MMActivity)VideoPlayView.this.getContext()).getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
          if ((VideoPlayView.a(VideoPlayView.this) instanceof VideoSightView)) {
            ((VideoSightView)VideoPlayView.a(VideoPlayView.this)).tG(localDisplayMetrics.widthPixels);
          }
        }
        ((View)VideoPlayView.a(VideoPlayView.this)).requestLayout();
        ((View)VideoPlayView.a(VideoPlayView.this)).postInvalidate();
        GMTrace.o(9264915546112L, 69029);
      }
    });
    GMTrace.o(9257936224256L, 68977);
  }
  
  private void tJ(int paramInt)
  {
    GMTrace.i(9258741530624L, 68983);
    if (paramInt >= 0) {}
    for (double d = paramInt;; d = this.kwz.bfa())
    {
      this.pCR = d;
      w.i("MicroMsg.VideoPlayView", "pause play " + this.pCR + " lastTime: " + paramInt + " last " + this.kwz.bfa());
      this.kwz.pause();
      this.ham.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9238474653696L, 68832);
          if (VideoPlayView.c(VideoPlayView.this) != null) {
            VideoPlayView.c(VideoPlayView.this).cr(false);
          }
          GMTrace.o(9238474653696L, 68832);
        }
      });
      if (this.pCO != null) {
        this.pCO.bfc();
      }
      GMTrace.o(9258741530624L, 68983);
      return;
    }
  }
  
  public final String Nx()
  {
    GMTrace.i(9259009966080L, 68985);
    String str = this.hCR;
    GMTrace.o(9259009966080L, 68985);
    return str;
  }
  
  public final void a(f.a parama)
  {
    GMTrace.i(9259815272448L, 68991);
    this.kwz.a(parama);
    GMTrace.o(9259815272448L, 68991);
  }
  
  public final void a(f.b paramb)
  {
    GMTrace.i(16373489074176L, 121992);
    GMTrace.o(16373489074176L, 121992);
  }
  
  public final void a(f.c paramc)
  {
    GMTrace.i(16373354856448L, 121991);
    GMTrace.o(16373354856448L, 121991);
  }
  
  public final void a(f.d paramd)
  {
    GMTrace.i(17438909399040L, 129930);
    GMTrace.o(17438909399040L, 129930);
  }
  
  public final void a(f.e parame)
  {
    GMTrace.i(9261023232000L, 69000);
    GMTrace.o(9261023232000L, 69000);
  }
  
  public final void beX()
  {
    GMTrace.i(18912754270208L, 140911);
    this.lhK.setVisibility(0);
    GMTrace.o(18912754270208L, 140911);
  }
  
  public final void beZ()
  {
    GMTrace.i(9258204659712L, 68979);
    if (this.pCQ != null) {
      ((View)this.pCQ).setVisibility(4);
    }
    this.pCU.setVisibility(8);
    this.pCV.setVisibility(8);
    this.ocG.setVisibility(8);
    GMTrace.o(9258204659712L, 68979);
  }
  
  public final double bfa()
  {
    GMTrace.i(9259681054720L, 68990);
    double d = Math.max(this.pCR, this.kwz.bfa());
    GMTrace.o(9259681054720L, 68990);
    return d;
  }
  
  public final long bfb()
  {
    GMTrace.i(9260620578816L, 68997);
    GMTrace.o(9260620578816L, 68997);
    return 0L;
  }
  
  public final void c(double paramDouble, boolean paramBoolean)
  {
    GMTrace.i(9260889014272L, 68999);
    o(paramDouble);
    GMTrace.o(9260889014272L, 68999);
  }
  
  public final void ch(boolean paramBoolean)
  {
    GMTrace.i(9259546836992L, 68989);
    this.kwz.ch(paramBoolean);
    GMTrace.o(9259546836992L, 68989);
  }
  
  public final void ck(boolean paramBoolean)
  {
    GMTrace.i(9260754796544L, 68998);
    this.kwx = paramBoolean;
    GMTrace.o(9260754796544L, 68998);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(9259949490176L, 68992);
    int i = this.kwz.getCurrentPosition();
    GMTrace.o(9259949490176L, 68992);
    return i;
  }
  
  public final int getDuration()
  {
    GMTrace.i(9260083707904L, 68993);
    if (this.duration == 0)
    {
      i = this.kwz.getDuration();
      GMTrace.o(9260083707904L, 68993);
      return i;
    }
    int i = this.duration;
    GMTrace.o(9260083707904L, 68993);
    return i;
  }
  
  public final void hs(boolean paramBoolean)
  {
    GMTrace.i(18912620052480L, 140910);
    this.pCZ = paramBoolean;
    Object localObject;
    if ((this.kwz != null) && ((this.kwz instanceof VideoSightView)))
    {
      localObject = (VideoSightView)this.kwz;
      if (((SightPlayImageView)localObject).pCn != null)
      {
        localObject = ((SightPlayImageView)localObject).pCn;
        if (paramBoolean) {
          break label72;
        }
      }
    }
    label72:
    for (paramBoolean = true;; paramBoolean = false)
    {
      ((com.tencent.mm.plugin.sight.decode.a.b)localObject).pBt = paramBoolean;
      GMTrace.o(18912620052480L, 140910);
      return;
    }
  }
  
  public final void hu(boolean paramBoolean)
  {
    GMTrace.i(9260352143360L, 68995);
    this.kwz.hu(paramBoolean);
    GMTrace.o(9260352143360L, 68995);
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(9258875748352L, 68984);
    boolean bool = this.kwz.isPlaying();
    GMTrace.o(9258875748352L, 68984);
    return bool;
  }
  
  public final boolean j(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(9259144183808L, 68986);
    paramBoolean = this.kwz.j(paramContext, paramBoolean);
    GMTrace.o(9259144183808L, 68986);
    return paramBoolean;
  }
  
  public final void o(double paramDouble)
  {
    GMTrace.i(9260217925632L, 68994);
    this.kwz.o(paramDouble);
    this.pCQ.seek((int)paramDouble);
    GMTrace.o(9260217925632L, 68994);
  }
  
  public final void onDetach()
  {
    GMTrace.i(9259412619264L, 68988);
    this.kwz.onDetach();
    GMTrace.o(9259412619264L, 68988);
  }
  
  public final void pause()
  {
    GMTrace.i(9258473095168L, 68981);
    tJ(-1);
    GMTrace.o(9258473095168L, 68981);
  }
  
  public final void setVideoPath(String paramString)
  {
    GMTrace.i(9257533571072L, 68974);
    this.hCR = paramString;
    w.i("MicroMsg.VideoPlayView", "videoPath  %s", new Object[] { this.hCR });
    this.kwz.setVideoPath(this.hCR);
    GMTrace.o(9257533571072L, 68974);
  }
  
  public final boolean start()
  {
    GMTrace.i(9258338877440L, 68980);
    ht(true);
    GMTrace.o(9258338877440L, 68980);
    return true;
  }
  
  public final void stop()
  {
    GMTrace.i(9259278401536L, 68987);
    this.kwz.stop();
    GMTrace.o(9259278401536L, 68987);
  }
  
  public final void update(int paramInt)
  {
    GMTrace.i(9260486361088L, 68996);
    this.pDa = true;
    Object localObject;
    if ((this.pCY == 0) || (this.pCX == 0))
    {
      localObject = getResources().getDisplayMetrics();
      this.pCY = ((DisplayMetrics)localObject).heightPixels;
      this.pCX = ((DisplayMetrics)localObject).widthPixels;
      if (this.pCY < this.pCX)
      {
        this.pCY = ((DisplayMetrics)localObject).widthPixels;
        this.pCX = ((DisplayMetrics)localObject).heightPixels;
      }
      w.i("MicroMsg.VideoPlayView", "getScreen screen_height:" + this.pCY + " screen_width:" + this.pCX);
    }
    ViewGroup.LayoutParams localLayoutParams = this.pCP.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams1;
    if (this.pCQ == null)
    {
      localObject = null;
      localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
      if (paramInt != 1) {
        break label418;
      }
      localLayoutParams1.width = this.pCX;
      localLayoutParams1.height = ((int)(this.pCX * 1.0D * this.pCM / this.pCL));
      if (this.pCQ != null) {
        ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.a(getContext(), 0.0F);
      }
    }
    for (;;)
    {
      if (this.pCQ != null)
      {
        this.pCQ.beT();
        ((View)this.pCQ).setLayoutParams((ViewGroup.LayoutParams)localObject);
        if ((this.pCQ instanceof AdVideoPlayerLoadingBar)) {
          this.ham.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9249480507392L, 68914);
              if (!VideoPlayView.a(VideoPlayView.this).isPlaying()) {
                ((AdVideoPlayerLoadingBar)VideoPlayView.c(VideoPlayView.this)).beV();
              }
              GMTrace.o(9249480507392L, 68914);
            }
          }, 500L);
        }
      }
      w.i("MicroMsg.VideoPlayView", "orientation " + paramInt + " " + localLayoutParams1.width + " " + localLayoutParams1.height);
      ((View)this.kwz).setLayoutParams(localLayoutParams1);
      if ((this.kwz instanceof com.tencent.mm.plugin.sight.decode.a.a)) {
        ((com.tencent.mm.plugin.sight.decode.a.a)this.kwz).cT(localLayoutParams1.width, localLayoutParams1.height);
      }
      localLayoutParams.height = localLayoutParams1.height;
      localLayoutParams.width = localLayoutParams1.width;
      this.pCP.setLayoutParams(localLayoutParams);
      ((View)this.kwz).requestLayout();
      GMTrace.o(9260486361088L, 68996);
      return;
      localObject = (RelativeLayout.LayoutParams)((View)this.pCQ).getLayoutParams();
      break;
      label418:
      localLayoutParams1.height = this.pCX;
      localLayoutParams1.width = ((int)(this.pCX * 1.0D * this.pCL / this.pCM));
      if (this.pCQ != null) {
        ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.a(getContext(), 0.0F);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void bfc();
    
    public abstract void bfd();
    
    public abstract void bfe();
    
    public abstract void hv(boolean paramBoolean);
    
    public abstract void tK(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sight/decode/ui/VideoPlayView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */