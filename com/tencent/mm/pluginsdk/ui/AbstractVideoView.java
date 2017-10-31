package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.x.a.a;
import com.tencent.mm.plugin.x.a.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.b;
import com.tencent.mm.pluginsdk.ui.tools.f.c;
import com.tencent.mm.pluginsdk.ui.tools.f.d;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class AbstractVideoView
  extends RelativeLayout
  implements h, f.a, f.b, f.c, f.d, f.e
{
  private boolean GN;
  public String TAG;
  protected ae ham;
  protected h.b jcV;
  public f kwz;
  protected ImageView lRM;
  protected ProgressBar lUN;
  protected Context mContext;
  private int oeb;
  protected TextView qDm;
  protected TextView sXA;
  protected LinearLayout sXB;
  protected VideoPlayerSeekBar sXC;
  protected g sXD;
  protected boolean sXE;
  public int sXF;
  public boolean sXG;
  public int sXH;
  public boolean sXI;
  public int sXJ;
  private long sXK;
  private int sXL;
  protected aj sXM;
  protected aj sXN;
  protected aj sXO;
  private b sXP;
  private View.OnClickListener sXQ;
  public h.c sXR;
  protected l sXS;
  protected boolean sXy;
  protected RelativeLayout sXz;
  
  public AbstractVideoView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(17461860630528L, 130101);
    GMTrace.o(17461860630528L, 130101);
  }
  
  public AbstractVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(16395769217024L, 122158);
    GMTrace.o(16395769217024L, 122158);
  }
  
  public AbstractVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16395903434752L, 122159);
    this.TAG = "MicroMsg.AbstractVideoView";
    this.sXy = true;
    this.sXE = true;
    this.sXF = 0;
    this.sXG = false;
    this.ham = new ae(Looper.getMainLooper());
    this.sXH = 0;
    this.sXI = true;
    this.sXJ = -1;
    this.oeb = 0;
    this.GN = false;
    this.sXK = 0L;
    this.sXL = 0;
    this.sXM = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(16399929966592L, 122189);
        if (!AbstractVideoView.this.isPlaying())
        {
          GMTrace.o(16399929966592L, 122189);
          return false;
        }
        if (AbstractVideoView.this.sXG)
        {
          if (AbstractVideoView.this.jcV != null) {
            AbstractVideoView.this.jcV.Xg();
          }
          AbstractVideoView.this.sXG = false;
        }
        AbstractVideoView.this.oL(AbstractVideoView.this.Xu());
        AbstractVideoView.a(AbstractVideoView.this, AbstractVideoView.this.isPlaying());
        GMTrace.o(16399929966592L, 122189);
        return true;
      }
    }, true);
    this.sXN = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(17468034646016L, 130147);
        boolean bool = AbstractVideoView.this.isPlaying();
        int i = AbstractVideoView.this.Xt();
        w.i(AbstractVideoView.this.TAG, "%s prepare start checker isplaying[%b] currPosMs[%d]", new Object[] { AbstractVideoView.this.bHG(), Boolean.valueOf(bool), Integer.valueOf(i) });
        if ((AbstractVideoView.this.kwz != null) && (i <= 50)) {
          AbstractVideoView.this.kwz.o(0.0D);
        }
        GMTrace.o(17468034646016L, 130147);
        return false;
      }
    }, false);
    this.sXO = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(20205405208576L, 150542);
        if (AbstractVideoView.a(AbstractVideoView.this) > 0)
        {
          if (AbstractVideoView.this.isPlaying())
          {
            AbstractVideoView.b(AbstractVideoView.this);
            GMTrace.o(20205405208576L, 150542);
            return false;
          }
          GMTrace.o(20205405208576L, 150542);
          return true;
        }
        GMTrace.o(20205405208576L, 150542);
        return false;
      }
    }, true);
    this.sXP = new b()
    {
      public final void Xh()
      {
        GMTrace.i(20205539426304L, 150543);
        GMTrace.o(20205539426304L, 150543);
      }
      
      public final void iH(int paramAnonymousInt)
      {
        GMTrace.i(20205673644032L, 150544);
        if (AbstractVideoView.this.o(paramAnonymousInt, true)) {
          AbstractVideoView.this.bD(false);
        }
        AbstractVideoView.this.sXC.cr(true);
        GMTrace.o(20205673644032L, 150544);
      }
    };
    this.sXQ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20207015821312L, 150554);
        w.i(AbstractVideoView.this.TAG, "%s seek bar play button on click ", new Object[] { AbstractVideoView.this.bHG() });
        AbstractVideoView.this.bHH();
        GMTrace.o(20207015821312L, 150554);
      }
    };
    this.sXR = null;
    this.sXS = new l();
    this.mContext = paramContext;
    MH();
    GMTrace.o(16395903434752L, 122159);
  }
  
  private void jK(boolean paramBoolean)
  {
    GMTrace.i(16396306087936L, 122162);
    this.sXD.jK(paramBoolean);
    GMTrace.o(16396306087936L, 122162);
  }
  
  public void MH()
  {
    GMTrace.i(16396171870208L, 122161);
    w.i(this.TAG, "%s init view ", new Object[] { bHG() });
    LayoutInflater.from(this.mContext).inflate(a.b.oum, this);
    this.lRM = ((ImageView)findViewById(a.a.cEH));
    this.sXz = ((RelativeLayout)findViewById(a.a.cEG));
    this.qDm = ((TextView)findViewById(a.a.cEl));
    this.lUN = ((ProgressBar)findViewById(a.a.cEr));
    this.sXA = ((TextView)findViewById(a.a.cEJ));
    this.sXB = ((LinearLayout)findViewById(a.a.cEo));
    Object localObject = (VideoPlayerSeekBar)findViewById(a.a.cEv);
    this.sXC = ((VideoPlayerSeekBar)localObject);
    this.sXD = ((g)localObject);
    this.sXC.pBX = this.sXP;
    this.sXC.setOnClickListener(this.sXQ);
    this.kwz = bt(this.mContext);
    this.kwz.a(this);
    this.kwz.a(this);
    this.kwz.a(this);
    this.kwz.a(this);
    localObject = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(13);
    this.sXz.addView((View)this.kwz, (ViewGroup.LayoutParams)localObject);
    GMTrace.o(16396171870208L, 122161);
  }
  
  public void MJ()
  {
    GMTrace.i(17463605460992L, 130114);
    w.i(this.TAG, "%s onUIPause", new Object[] { bHG() });
    this.sXF = Xu();
    this.sXG = isPlaying();
    this.sXL = 0;
    this.sXK = 0L;
    pause();
    MM();
    this.sXy = false;
    es(MP() + 11);
    GMTrace.o(17463605460992L, 130114);
  }
  
  public void MK()
  {
    GMTrace.i(17463471243264L, 130113);
    w.i(this.TAG, "%s onUIResume", new Object[] { bHG() });
    this.sXy = true;
    es(MP() + 10);
    GMTrace.o(17463471243264L, 130113);
  }
  
  public void MM()
  {
    GMTrace.i(17462531719168L, 130106);
    this.sXM.MM();
    this.sXN.MM();
    GMTrace.o(17462531719168L, 130106);
  }
  
  public int MN()
  {
    GMTrace.i(17462397501440L, 130105);
    GMTrace.o(17462397501440L, 130105);
    return 0;
  }
  
  public void MO()
  {
    GMTrace.i(17463873896448L, 130116);
    w.i(this.TAG, "%s on surface available", new Object[] { bHG() });
    bD(false);
    GMTrace.o(17463873896448L, 130116);
  }
  
  public abstract int MP();
  
  protected final void Oe(String paramString)
  {
    GMTrace.i(17464947638272L, 130124);
    this.sXS.url = paramString;
    GMTrace.o(17464947638272L, 130124);
  }
  
  public final void Xd()
  {
    GMTrace.i(16398050918400L, 122175);
    w.i(this.TAG, "%s onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", new Object[] { bHG(), Boolean.valueOf(this.sXI), Integer.valueOf(this.sXJ), Boolean.valueOf(this.GN) });
    this.GN = true;
    if (this.kwz != null) {
      this.kwz.a(this);
    }
    int i = Xs();
    if ((this.sXD != null) && (this.sXD.beQ() != i)) {
      this.sXD.tI(i);
    }
    int k;
    int j;
    if (this.sXI) {
      if (this.sXJ < 0)
      {
        if (play()) {
          this.sXN.w(1000L, 1000L);
        }
        this.sXJ = -1;
        this.sXI = true;
        this.sXL = 0;
        this.sXK = 0L;
        if (this.jcV != null) {
          this.jcV.Xd();
        }
        if (this.oeb > 0)
        {
          w.d(this.TAG, "%s start error check timer", new Object[] { bHG() });
          this.sXO.w(5000L, 5000L);
        }
        es(MP() + 2);
        if (this.sXS.sZL == 0L) {
          this.sXS.sZL = bg.Pp();
        }
        i = Xs();
        this.sXS.duration = i;
        if ((this.sXS.sZK > 0L) && (this.sXS.sZL > 0L))
        {
          k = (int)((this.sXS.sZL - this.sXS.sZK) / 1000L);
          if (!am.isWifi(this.mContext)) {
            break label490;
          }
          j = 20;
          i = 24;
        }
      }
    }
    for (;;)
    {
      int m = MP();
      int n = MP();
      i = bg.e((Integer)d.a(k, new int[] { 1, 2, 3, 4 }, j + m, i + n));
      w.d(this.TAG, "%s rptFirstPlayTime [%d]", new Object[] { bHG(), Integer.valueOf(i) });
      es(i);
      GMTrace.o(16398050918400L, 122175);
      return;
      if (!WV())
      {
        o(this.sXJ, this.sXI);
        break;
      }
      play();
      break;
      if (this.sXJ < 0) {}
      for (i = 0;; i = this.sXJ)
      {
        o(i, this.sXI);
        break;
      }
      label490:
      if (am.is4G(this.mContext))
      {
        j = 25;
        i = 29;
      }
      else if (am.is3G(this.mContext))
      {
        j = 30;
        i = 34;
      }
      else
      {
        if (!am.is2G(this.mContext)) {
          break label547;
        }
        j = 35;
        i = 39;
      }
    }
    label547:
    GMTrace.o(16398050918400L, 122175);
  }
  
  public final void Xr()
  {
    GMTrace.i(17462129065984L, 130103);
    this.sXB.removeView((View)this.sXD);
    GMTrace.o(17462129065984L, 130103);
  }
  
  public int Xs()
  {
    GMTrace.i(16397648265216L, 122172);
    if (this.kwz != null)
    {
      int i = Math.round(this.kwz.getDuration() * 1.0F / 1000.0F);
      GMTrace.o(16397648265216L, 122172);
      return i;
    }
    GMTrace.o(16397648265216L, 122172);
    return -1;
  }
  
  public final int Xt()
  {
    GMTrace.i(17799149780992L, 132614);
    if (this.kwz != null)
    {
      int i = this.kwz.getCurrentPosition();
      GMTrace.o(17799149780992L, 132614);
      return i;
    }
    GMTrace.o(17799149780992L, 132614);
    return 0;
  }
  
  public final int Xu()
  {
    GMTrace.i(17462800154624L, 130108);
    if (this.kwz != null)
    {
      int i = Math.round(this.kwz.getCurrentPosition() * 1.0F / 1000.0F);
      GMTrace.o(17462800154624L, 130108);
      return i;
    }
    GMTrace.o(17462800154624L, 130108);
    return 0;
  }
  
  public final void Xv()
  {
    GMTrace.i(17463739678720L, 130115);
    w.i(this.TAG, "%s onUIDestroy", new Object[] { bHG() });
    stop();
    this.ham.removeCallbacksAndMessages(null);
    MM();
    this.sXO.MM();
    es(MP() + 12);
    GMTrace.o(17463739678720L, 130115);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17461994848256L, 130102);
    if (!(paramg instanceof View))
    {
      w.w(this.TAG, "%s set video footer view but is not view", new Object[] { bHG() });
      GMTrace.o(17461994848256L, 130102);
      return;
    }
    Xr();
    this.sXD = paramg;
    this.sXE = false;
    this.sXB.addView((View)this.sXD);
    GMTrace.o(17461994848256L, 130102);
  }
  
  public final void a(h.b paramb)
  {
    GMTrace.i(17463068590080L, 130110);
    this.jcV = paramb;
    GMTrace.o(17463068590080L, 130110);
  }
  
  public final void aIO()
  {
    GMTrace.i(16396842958848L, 122166);
    w.d(this.TAG, "%s hide loading %s", new Object[] { bHG(), bg.bOd() });
    this.ham.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17477161451520L, 130215);
        if ((AbstractVideoView.this.lUN != null) && (AbstractVideoView.this.lUN.getVisibility() != 8))
        {
          w.i(AbstractVideoView.this.TAG, "%s hide loading", new Object[] { AbstractVideoView.this.bHG() });
          AbstractVideoView.this.lUN.setVisibility(8);
        }
        GMTrace.o(17477161451520L, 130215);
      }
    });
    GMTrace.o(16396842958848L, 122166);
  }
  
  public final void aPF()
  {
    GMTrace.i(16398185136128L, 122176);
    w.i(this.TAG, "%s onTextureUpdate ", new Object[] { bHG() });
    aIO();
    GMTrace.o(16398185136128L, 122176);
  }
  
  public final void aaN()
  {
    GMTrace.i(16396708741120L, 122165);
    this.ham.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17468839952384L, 130153);
        if ((AbstractVideoView.this.lUN != null) && (AbstractVideoView.this.lUN.getVisibility() != 0))
        {
          w.i(AbstractVideoView.this.TAG, "%s show loading", new Object[] { AbstractVideoView.this.bHG() });
          AbstractVideoView.this.lUN.setVisibility(0);
        }
        GMTrace.o(17468839952384L, 130153);
      }
    });
    GMTrace.o(16396708741120L, 122165);
  }
  
  public void bC(boolean paramBoolean)
  {
    GMTrace.i(16398722007040L, 122180);
    w.i(this.TAG, "%s on seek complete startPlay[%b]", new Object[] { bHG(), Boolean.valueOf(paramBoolean) });
    if (this.kwz != null) {
      this.kwz.a(this);
    }
    aIO();
    jK(paramBoolean);
    oL(Xu());
    if (paramBoolean)
    {
      bD(false);
      this.sXG = false;
      if (this.jcV != null) {
        this.jcV.Xg();
      }
    }
    GMTrace.o(16398722007040L, 122180);
  }
  
  public void bD(boolean paramBoolean)
  {
    GMTrace.i(17462263283712L, 130104);
    this.sXM.w(500L, 500L);
    GMTrace.o(17462263283712L, 130104);
  }
  
  public final String bHG()
  {
    GMTrace.i(16396977176576L, 122167);
    String str = hashCode();
    GMTrace.o(16396977176576L, 122167);
    return str;
  }
  
  public final boolean bHH()
  {
    GMTrace.i(16397111394304L, 122168);
    if (this.kwz == null)
    {
      GMTrace.o(16397111394304L, 122168);
      return false;
    }
    if (isPlaying()) {
      pause();
    }
    for (;;)
    {
      GMTrace.o(16397111394304L, 122168);
      return true;
      if (bg.mZ(this.kwz.Nx())) {
        start();
      } else {
        play();
      }
    }
  }
  
  public final void bHI()
  {
    GMTrace.i(17464410767360L, 130120);
    if (this.sXS.qDK == 0L) {
      this.sXS.qDK = bg.Pp();
    }
    GMTrace.o(17464410767360L, 130120);
  }
  
  public final void bHJ()
  {
    GMTrace.i(17464544985088L, 130121);
    this.sXS.sZN = bg.Pp();
    GMTrace.o(17464544985088L, 130121);
  }
  
  public final void bHK()
  {
    GMTrace.i(17464679202816L, 130122);
    this.sXS.sZO = bg.Pp();
    if (this.sXS.sZN > 0L)
    {
      l locall = this.sXS;
      locall.sZP += this.sXS.sZO - this.sXS.sZN;
    }
    GMTrace.o(17464679202816L, 130122);
  }
  
  public final void bHL()
  {
    GMTrace.i(17464813420544L, 130123);
    l locall = this.sXS;
    locall.blockCount += 1;
    GMTrace.o(17464813420544L, 130123);
  }
  
  public final void bHM()
  {
    GMTrace.i(17465081856000L, 130125);
    int k;
    int j;
    int i;
    if ((this.sXS.sZO > 0L) && (this.sXS.sZN > 0L))
    {
      k = (int)((this.sXS.sZO - this.sXS.sZN) / 1000L);
      if (!am.isWifi(this.mContext)) {
        break label164;
      }
      j = 70;
      i = 74;
    }
    for (;;)
    {
      int m = MP();
      int n = MP();
      i = bg.e((Integer)d.a(k, new int[] { 1, 2, 3, 4 }, j + m, i + n));
      w.d(this.TAG, "%s rptResumeTime [%d]", new Object[] { bHG(), Integer.valueOf(i) });
      es(i);
      GMTrace.o(17465081856000L, 130125);
      return;
      label164:
      if (am.is4G(this.mContext))
      {
        j = 75;
        i = 79;
      }
      else if (am.is3G(this.mContext))
      {
        j = 80;
        i = 84;
      }
      else
      {
        if (!am.is2G(this.mContext)) {
          break;
        }
        j = 85;
        i = 89;
      }
    }
    GMTrace.o(17465081856000L, 130125);
  }
  
  public final int bL(int paramInt1, int paramInt2)
  {
    GMTrace.i(16398453571584L, 122178);
    GMTrace.o(16398453571584L, 122178);
    return 0;
  }
  
  public final void bmi()
  {
    GMTrace.i(17464276549632L, 130119);
    if (this.sXS.sZK == 0L) {
      this.sXS.sZK = bg.Pp();
    }
    GMTrace.o(17464276549632L, 130119);
  }
  
  public final void br(int paramInt1, int paramInt2)
  {
    GMTrace.i(16398587789312L, 122179);
    w.i(this.TAG, "%s on get video size [%d, %d]", new Object[] { bHG(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (this.jcV != null) {
      this.jcV.br(paramInt1, paramInt2);
    }
    es(MP() + 8);
    GMTrace.o(16398587789312L, 122179);
  }
  
  public f bt(Context paramContext)
  {
    GMTrace.i(16396037652480L, 122160);
    GMTrace.o(16396037652480L, 122160);
    return null;
  }
  
  public final void ck(boolean paramBoolean)
  {
    GMTrace.i(17463337025536L, 130112);
    if (this.kwz != null) {
      this.kwz.ck(paramBoolean);
    }
    GMTrace.o(17463337025536L, 130112);
  }
  
  public final void es(long paramLong)
  {
    GMTrace.i(17464142331904L, 130118);
    if (this.sXR != null) {
      this.sXR.a(600L, paramLong, 1L, false);
    }
    GMTrace.o(17464142331904L, 130118);
  }
  
  public final boolean iI(int paramInt)
  {
    GMTrace.i(16397514047488L, 122171);
    boolean bool = o(paramInt, isPlaying());
    GMTrace.o(16397514047488L, 122171);
    return bool;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(16397782482944L, 122173);
    boolean bool = false;
    if (this.kwz != null) {
      bool = this.kwz.isPlaying();
    }
    GMTrace.o(16397782482944L, 122173);
    return bool;
  }
  
  public final boolean isPrepared()
  {
    GMTrace.i(17462934372352L, 130109);
    boolean bool;
    if (this.kwz != null) {
      if ((!bg.mZ(this.kwz.Nx())) && (this.GN)) {
        bool = true;
      }
    }
    for (;;)
    {
      w.d(this.TAG, "%s is prepared [%b] isPrepared[%b]", new Object[] { bHG(), Boolean.valueOf(bool), Boolean.valueOf(this.GN) });
      GMTrace.o(17462934372352L, 130109);
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
  
  public boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17462665936896L, 130107);
    boolean bool2 = isPrepared();
    int j = Xs();
    if ((j > 0) && (paramInt > j)) {}
    for (int i = j;; i = paramInt)
    {
      boolean bool1;
      if (this.kwz != null) {
        if (!bg.mZ(this.kwz.Nx())) {
          bool1 = true;
        }
      }
      for (;;)
      {
        w.i(this.TAG, "%s seek to [%d %d] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", new Object[] { bHG(), Integer.valueOf(i), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2), Integer.valueOf(j), Boolean.valueOf(bool1) });
        es(MP() + 5);
        if (!bool2) {
          break;
        }
        if (this.kwz == null) {
          break label214;
        }
        aaN();
        oL(i);
        this.kwz.c(i * 1000, paramBoolean);
        GMTrace.o(17462665936896L, 130107);
        return paramBoolean;
        bool1 = false;
        continue;
        bool1 = false;
      }
      this.sXJ = i;
      if (bool1) {
        this.sXI = true;
      }
      for (;;)
      {
        label214:
        GMTrace.o(17462665936896L, 130107);
        return false;
        this.sXI = paramBoolean;
        start();
      }
    }
  }
  
  public final void oL(int paramInt)
  {
    GMTrace.i(16396574523392L, 122164);
    this.sXD.uu(paramInt);
    GMTrace.o(16396574523392L, 122164);
  }
  
  public final void onError(final int paramInt1, int paramInt2)
  {
    GMTrace.i(16397916700672L, 122174);
    w.w(this.TAG, "%s onError info [%d %d] errorCount[%d]", new Object[] { bHG(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.oeb) });
    es(MP() + 90);
    this.oeb += 1;
    if (this.oeb > 5)
    {
      es(MP() + 92);
      this.sXS.sZQ = paramInt1;
      this.sXS.sZR = paramInt2;
      if (this.jcV != null) {
        this.jcV.onError(paramInt1, paramInt2);
      }
      stop();
      aIO();
      GMTrace.o(16397916700672L, 122174);
      return;
    }
    paramInt2 = Xu();
    if (this.sXJ == -1) {}
    for (paramInt1 = paramInt2;; paramInt1 = this.sXJ)
    {
      w.i(this.TAG, "%s onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", new Object[] { bHG(), Integer.valueOf(paramInt1), Integer.valueOf(this.sXJ), Integer.valueOf(paramInt2) });
      stop();
      aaN();
      this.ham.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20205270990848L, 150541);
          AbstractVideoView.this.oL(paramInt1);
          AbstractVideoView.this.o(paramInt1, true);
          GMTrace.o(20205270990848L, 150541);
        }
      }, 200L);
      GMTrace.o(16397916700672L, 122174);
      return;
    }
  }
  
  public final boolean pause()
  {
    GMTrace.i(16397379829760L, 122170);
    w.i(this.TAG, "%s pause", new Object[] { bHG() });
    es(MP() + 4);
    if (this.kwz != null)
    {
      jK(false);
      this.kwz.pause();
      MM();
      if (this.jcV != null) {
        this.jcV.Xf();
      }
      this.sXS.qDM = bg.Pp();
      GMTrace.o(16397379829760L, 122170);
      return true;
    }
    GMTrace.o(16397379829760L, 122170);
    return false;
  }
  
  public final boolean play()
  {
    GMTrace.i(16397245612032L, 122169);
    if (!this.sXy)
    {
      w.w(this.TAG, "%s ui on pause now, why u call me to play? [%s]", new Object[] { bHG(), bg.bOd() });
      GMTrace.o(16397245612032L, 122169);
      return false;
    }
    es(MP() + 3);
    if (this.kwz != null)
    {
      boolean bool = this.kwz.start();
      w.i(this.TAG, "%s video play [%b] isPlayOnUiPause[%b]", new Object[] { bHG(), Boolean.valueOf(bool), Boolean.valueOf(this.sXG) });
      jK(bool);
      if (bool)
      {
        this.sXG = false;
        bD(false);
        if (this.jcV != null) {
          this.jcV.Xg();
        }
      }
      GMTrace.o(16397245612032L, 122169);
      return bool;
    }
    GMTrace.o(16397245612032L, 122169);
    return false;
  }
  
  public void qq()
  {
    GMTrace.i(16398319353856L, 122177);
    w.i(this.TAG, "%s onCompletion", new Object[] { bHG() });
    aIO();
    MM();
    if (this.jcV != null) {
      this.jcV.Xe();
    }
    this.sXL = 0;
    this.sXK = 0L;
    es(MP() + 7);
    GMTrace.o(16398319353856L, 122177);
  }
  
  public void stop()
  {
    GMTrace.i(17463202807808L, 130111);
    w.i(this.TAG, "%s stop", new Object[] { bHG() });
    es(MP() + 6);
    if (this.kwz != null) {
      this.kwz.stop();
    }
    this.sXJ = -1;
    this.sXI = true;
    this.GN = false;
    this.sXL = 0;
    this.sXK = 0L;
    MM();
    this.ham.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17468303081472L, 130149);
        try
        {
          AbstractVideoView.this.oL(0);
          AbstractVideoView.a(AbstractVideoView.this, AbstractVideoView.this.isPlaying());
          GMTrace.o(17468303081472L, 130149);
          return;
        }
        catch (Throwable localThrowable)
        {
          GMTrace.o(17468303081472L, 130149);
        }
      }
    }, 10L);
    this.sXS.sZM = bg.Pp();
    int j;
    int i;
    label230:
    Object localObject;
    if (this.sXS.blockCount > 0)
    {
      if (am.isWifi(this.mContext))
      {
        j = 41;
        i = 45;
        int k = MP();
        int m = MP();
        i = bg.e((Integer)d.a(this.sXS.blockCount, new int[] { 1, 2, 3, 4 }, j + k, i + m));
        w.d(this.TAG, "%s rptBlockCount [%d]", new Object[] { bHG(), Integer.valueOf(i) });
        es(i);
      }
    }
    else
    {
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(this.sXS.sZK).append(",");
      ((StringBuffer)localObject).append(this.sXS.sZL).append(",");
      ((StringBuffer)localObject).append(this.sXS.sZM).append(",");
      ((StringBuffer)localObject).append(this.sXS.qDM).append(",");
      ((StringBuffer)localObject).append(this.sXS.sZN).append(",");
      ((StringBuffer)localObject).append(this.sXS.sZO).append(",");
      ((StringBuffer)localObject).append(this.sXS.sZP).append(",");
      ((StringBuffer)localObject).append(this.sXS.blockCount).append(",");
      ((StringBuffer)localObject).append(this.sXS.sZL - this.sXS.sZK).append(",");
      ((StringBuffer)localObject).append(this.sXS.url).append(",");
      ((StringBuffer)localObject).append(this.sXS.duration).append(",");
      ((StringBuffer)localObject).append(this.sXS.sZQ).append(",");
      ((StringBuffer)localObject).append(this.sXS.sZR).append(",");
      ((StringBuffer)localObject).append(this.sXS.qDK).append(",");
      if (this.sXS.qDK <= this.sXS.sZK) {
        break label693;
      }
    }
    label693:
    for (long l = this.sXS.qDK - this.sXS.sZK;; l = 0L)
    {
      ((StringBuffer)localObject).append(l).append(",");
      ((StringBuffer)localObject).append(this.sXH);
      localObject = ((StringBuffer)localObject).toString();
      w.i(this.TAG, "%s rpt video kv stat{%s}", new Object[] { bHG(), localObject });
      if (this.sXR != null) {
        this.sXR.z(14349, (String)localObject);
      }
      GMTrace.o(17463202807808L, 130111);
      return;
      if (am.is4G(this.mContext))
      {
        j = 46;
        i = 50;
        break;
      }
      if (am.is3G(this.mContext))
      {
        j = 51;
        i = 55;
        break;
      }
      if (!am.is2G(this.mContext)) {
        break label230;
      }
      j = 56;
      i = 60;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/AbstractVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */