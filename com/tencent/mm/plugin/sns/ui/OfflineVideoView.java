package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class OfflineVideoView
  extends RelativeLayout
  implements f.a
{
  private int duration;
  private ae kvt;
  private aj kwG;
  private boolean kwx;
  public f kwz;
  private ImageView lUH;
  private boolean lUJ;
  private boolean lUK;
  private ProgressBar lUN;
  private RelativeLayout lWD;
  private Context mContext;
  private int oeb;
  public a qCZ;
  private boolean qDa;
  private boolean qDb;
  private int qDc;
  private f.e qDd;
  
  public OfflineVideoView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(15295452282880L, 113960);
    GMTrace.o(15295452282880L, 113960);
  }
  
  public OfflineVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(15295586500608L, 113961);
    GMTrace.o(15295586500608L, 113961);
  }
  
  public OfflineVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15295720718336L, 113962);
    this.mContext = null;
    this.kwx = false;
    this.lUJ = false;
    this.qDa = false;
    this.qDb = true;
    this.qDc = -1;
    this.oeb = 0;
    this.duration = 0;
    this.kvt = new ae(Looper.getMainLooper());
    this.kwG = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(16273631084544L, 121248);
        if (OfflineVideoView.b(OfflineVideoView.this) == null)
        {
          GMTrace.o(16273631084544L, 121248);
          return false;
        }
        if (((View)OfflineVideoView.b(OfflineVideoView.this)).getAlpha() < 1.0F) {
          OfflineVideoView.e(OfflineVideoView.this);
        }
        if (OfflineVideoView.b(OfflineVideoView.this).isPlaying())
        {
          OfflineVideoView.f(OfflineVideoView.this);
          OfflineVideoView localOfflineVideoView = OfflineVideoView.this;
          int i = OfflineVideoView.b(OfflineVideoView.this).getCurrentPosition() / 1000;
          if (localOfflineVideoView.qCZ != null) {
            localOfflineVideoView.qCZ.uu(i);
          }
        }
        GMTrace.o(16273631084544L, 121248);
        return true;
      }
    }, true);
    this.qDd = new f.e()
    {
      public final void aPF()
      {
        GMTrace.i(16276315439104L, 121268);
        w.i("MicroMsg.OfflineVideoView", "%d on texture update.", new Object[] { Integer.valueOf(OfflineVideoView.this.hashCode()) });
        try
        {
          OfflineVideoView.e(OfflineVideoView.this);
          GMTrace.o(16276315439104L, 121268);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.OfflineVideoView", "texture view update. error " + localException.toString());
          GMTrace.o(16276315439104L, 121268);
        }
      }
    };
    this.mContext = paramContext;
    w.i("MicroMsg.OfflineVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(this.mContext).inflate(i.g.pPO, this);
    this.lUH = ((ImageView)findViewById(i.f.cEH));
    this.lWD = ((RelativeLayout)findViewById(i.f.cEG));
    this.lUN = ((ProgressBar)findViewById(i.f.cEr));
    if (d.eu(18))
    {
      paramInt = 0;
      if (paramInt == 0) {
        break label280;
      }
      this.lUK = true;
    }
    for (this.kwz = new VideoPlayerTextureView(this.mContext);; this.kwz = new VideoTextureView(this.mContext))
    {
      this.kwz.a(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      this.lWD.addView((View)this.kwz, paramContext);
      a(false, 0.0F);
      GMTrace.o(15295720718336L, 113962);
      return;
      paramInt = 1;
      break;
      label280:
      this.lUK = false;
    }
  }
  
  private void a(final boolean paramBoolean, final float paramFloat)
  {
    GMTrace.i(15296123371520L, 113965);
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15281762074624L, 113858);
        w.i("MicroMsg.OfflineVideoView", "%d switch video model isVideoPlay %b %f", new Object[] { Integer.valueOf(OfflineVideoView.this.hashCode()), Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat) });
        View localView = (View)OfflineVideoView.b(OfflineVideoView.this);
        if (paramBoolean)
        {
          localView.setAlpha(paramFloat);
          localView.setVisibility(0);
          OfflineVideoView.c(OfflineVideoView.this).setVisibility(0);
          OfflineVideoView.c(OfflineVideoView.this).setAlpha(paramFloat);
          if (paramFloat >= 1.0D)
          {
            OfflineVideoView.a(OfflineVideoView.this).setVisibility(8);
            GMTrace.o(15281762074624L, 113858);
          }
        }
        else
        {
          localView.setVisibility(0);
          OfflineVideoView.c(OfflineVideoView.this).setVisibility(0);
          OfflineVideoView.c(OfflineVideoView.this).setAlpha(0.0F);
          OfflineVideoView.a(OfflineVideoView.this).setVisibility(0);
        }
        GMTrace.o(15281762074624L, 113858);
      }
    });
    GMTrace.o(15296123371520L, 113965);
  }
  
  private void aIO()
  {
    GMTrace.i(15296391806976L, 113967);
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16276986527744L, 121273);
        if ((OfflineVideoView.d(OfflineVideoView.this) != null) && (OfflineVideoView.d(OfflineVideoView.this).getVisibility() != 8))
        {
          w.i("MicroMsg.OfflineVideoView", "%d hide loading.", new Object[] { Integer.valueOf(OfflineVideoView.this.hashCode()) });
          OfflineVideoView.d(OfflineVideoView.this).setVisibility(8);
        }
        GMTrace.o(16276986527744L, 121273);
      }
    });
    GMTrace.o(15296391806976L, 113967);
  }
  
  private void onResume()
  {
    GMTrace.i(17148999106560L, 127770);
    w.d("MicroMsg.OfflineVideoView", "%d on resume %s", new Object[] { Integer.valueOf(hashCode()), bg.bOd() });
    if (!this.lUJ) {
      blS();
    }
    this.qDa = true;
    GMTrace.o(17148999106560L, 127770);
  }
  
  public final void B(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(15296928677888L, 113971);
    w.i("MicroMsg.OfflineVideoView", "%d seek second %d afterSeekPlay %b", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    aIO();
    this.kwz.c(paramInt * 1000, paramBoolean);
    aao();
    GMTrace.o(15296928677888L, 113971);
  }
  
  public final void I(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17149670195200L, 127775);
    w.i("MicroMsg.OfflineVideoView", "%d ui touch seek second %d afterSeekPlay %b", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    B(paramInt, paramBoolean);
    aao();
    GMTrace.o(17149670195200L, 127775);
  }
  
  public final void Ih(final String paramString)
  {
    GMTrace.i(17149401759744L, 127773);
    if (bg.mZ(paramString))
    {
      GMTrace.o(17149401759744L, 127773);
      return;
    }
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15280151461888L, 113846);
        if (OfflineVideoView.a(OfflineVideoView.this) != null)
        {
          w.i("MicroMsg.OfflineVideoView", "%d fresh thumb image", new Object[] { Integer.valueOf(hashCode()) });
          OfflineVideoView.a(OfflineVideoView.this).setImageBitmap(BackwardSupportUtil.b.c(paramString, 1.0F));
        }
        GMTrace.o(15280151461888L, 113846);
      }
    });
    GMTrace.o(17149401759744L, 127773);
  }
  
  public final void Xd()
  {
    GMTrace.i(15296257589248L, 113966);
    a(true, 0.0F);
    this.lUJ = false;
    aIO();
    this.duration = (this.kwz.getDuration() / 1000);
    w.i("MicroMsg.OfflineVideoView", "%d on prepared. shouldPlayWhenPrepared [%b] shouldSeekTimeWhenPrepared[%d]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.qDb), Integer.valueOf(this.qDc) });
    if (this.qDb)
    {
      if (this.qDc <= 0) {
        this.kwz.start();
      }
      for (;;)
      {
        aao();
        if (this.qCZ != null) {
          this.qCZ.onStart(this.duration);
        }
        this.qDc = -1;
        GMTrace.o(15296257589248L, 113966);
        return;
        B(this.qDc, true);
      }
    }
    if (this.qDc > 0) {}
    for (int i = this.qDc;; i = 0)
    {
      B(i, false);
      break;
    }
  }
  
  public final void aao()
  {
    GMTrace.i(15296526024704L, 113968);
    this.kwG.w(500L, 500L);
    GMTrace.o(15296526024704L, 113968);
  }
  
  public final int bL(int paramInt1, int paramInt2)
  {
    GMTrace.i(15297331331072L, 113974);
    GMTrace.o(15297331331072L, 113974);
    return 0;
  }
  
  public final void blS()
  {
    GMTrace.i(17149267542016L, 127772);
    if (this.qCZ != null)
    {
      PString localPString1 = new PString();
      PString localPString2 = new PString();
      if (this.qCZ.a(localPString1))
      {
        if (!bg.mZ(localPString2.value)) {
          Ih(localPString2.value);
        }
        if (!bg.mZ(localPString1.value))
        {
          xC(localPString1.value);
          GMTrace.o(17149267542016L, 127772);
        }
      }
      else
      {
        this.kvt.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15291023097856L, 113927);
            w.i("MicroMsg.OfflineVideoView", "%d show loading. downloadMode %d", new Object[] { Integer.valueOf(OfflineVideoView.this.hashCode()), Integer.valueOf(OfflineVideoView.this.hashCode()) });
            if ((OfflineVideoView.d(OfflineVideoView.this) != null) && (OfflineVideoView.d(OfflineVideoView.this).getVisibility() != 0)) {
              OfflineVideoView.d(OfflineVideoView.this).setVisibility(0);
            }
            GMTrace.o(15291023097856L, 113927);
          }
        });
        a(false, 0.0F);
      }
      GMTrace.o(17149267542016L, 127772);
      return;
    }
    w.w("MicroMsg.OfflineVideoView", "%d toggle video but video callback is null", new Object[] { Integer.valueOf(hashCode()) });
    GMTrace.o(17149267542016L, 127772);
  }
  
  public final void blT()
  {
    GMTrace.i(15297062895616L, 113972);
    w.i("MicroMsg.OfflineVideoView", "%d pause", new Object[] { Integer.valueOf(hashCode()) });
    w.d("MicroMsg.OfflineVideoView", "%d on pause %s ", new Object[] { Integer.valueOf(hashCode()), bg.bOd() });
    this.qDb = false;
    if (this.kwz.isPlaying()) {
      this.qDc = (this.kwz.getCurrentPosition() / 1000);
    }
    w.i("MicroMsg.OfflineVideoView", "%d pause play", new Object[] { Integer.valueOf(hashCode()) });
    this.kwz.pause();
    aIO();
    this.kwG.MM();
    GMTrace.o(15297062895616L, 113972);
  }
  
  public final void blU()
  {
    GMTrace.i(17149535977472L, 127774);
    w.i("MicroMsg.OfflineVideoView", "%d start hasResumed[%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.qDa) });
    this.qDb = true;
    if (this.qDa) {
      if (!bg.mZ(this.kwz.Nx())) {
        if ((this.kwz.start()) && (this.qCZ != null)) {
          this.qCZ.onStart(this.duration);
        }
      }
    }
    for (;;)
    {
      aao();
      GMTrace.o(17149535977472L, 127774);
      return;
      onResume();
      continue;
      onResume();
    }
  }
  
  public final void br(int paramInt1, int paramInt2)
  {
    GMTrace.i(15297465548800L, 113975);
    GMTrace.o(15297465548800L, 113975);
  }
  
  public final void ck(boolean paramBoolean)
  {
    GMTrace.i(15295854936064L, 113963);
    this.kwx = paramBoolean;
    this.kwz.ck(this.kwx);
    GMTrace.o(15295854936064L, 113963);
  }
  
  public final int getCurrentPosition()
  {
    GMTrace.i(17149804412928L, 127776);
    if (this.kwz != null)
    {
      int i = this.kwz.getCurrentPosition() / 1000;
      GMTrace.o(17149804412928L, 127776);
      return i;
    }
    GMTrace.o(17149804412928L, 127776);
    return 0;
  }
  
  public final boolean isPlaying()
  {
    GMTrace.i(15297197113344L, 113973);
    if (this.kwz != null)
    {
      boolean bool = this.kwz.isPlaying();
      GMTrace.o(15297197113344L, 113973);
      return bool;
    }
    GMTrace.o(15297197113344L, 113973);
    return false;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(17149133324288L, 127771);
    w.d("MicroMsg.OfflineVideoView", "%d on destroy %s", new Object[] { Integer.valueOf(hashCode()), bg.bOd() });
    w.i("MicroMsg.OfflineVideoView", "%d logic unInit", new Object[] { Integer.valueOf(hashCode()) });
    this.kvt.removeCallbacksAndMessages(null);
    this.kwG.MM();
    if (this.kwz != null) {
      this.kwz.stop();
    }
    GMTrace.o(17149133324288L, 127771);
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(15295989153792L, 113964);
    w.e("MicroMsg.OfflineVideoView", "%d on play video error what %d extra %d isMMVideoPlayer %b errorCount %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.lUK), Integer.valueOf(this.oeb) });
    this.oeb += 1;
    final String str = this.kwz.Nx();
    this.kwz.stop();
    this.lUJ = true;
    a(false, 0.0F);
    if (this.oeb <= 3)
    {
      this.kvt.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15295318065152L, 113959);
          OfflineVideoView.this.xC(str);
          GMTrace.o(15295318065152L, 113959);
        }
      }, 200L);
      GMTrace.o(15295989153792L, 113964);
      return;
    }
    if (!bg.mZ(str))
    {
      w.w("MicroMsg.OfflineVideoView", "%d start third player to play", new Object[] { Integer.valueOf(hashCode()) });
      this.kvt.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15279480373248L, 113841);
          Intent localIntent = new Intent();
          localIntent.setAction("android.intent.action.VIEW");
          localIntent.setDataAndType(Uri.fromFile(new File(str)), "video/*");
          try
          {
            OfflineVideoView.this.getContext().startActivity(localIntent);
            GMTrace.o(15279480373248L, 113841);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.OfflineVideoView", "startActivity fail, activity not found");
            h.h(OfflineVideoView.this.getContext(), i.j.dXl, i.j.dXm);
            GMTrace.o(15279480373248L, 113841);
          }
        }
      });
    }
    GMTrace.o(15295989153792L, 113964);
  }
  
  public final void qq()
  {
    GMTrace.i(15296660242432L, 113969);
    w.i("MicroMsg.OfflineVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if (this.qCZ == null)
    {
      if ((d.ev(18)) || (!this.lUK))
      {
        B(0, true);
        GMTrace.o(15296660242432L, 113969);
        return;
      }
      if (this.kwz != null)
      {
        String str = this.kwz.Nx();
        this.kwz.stop();
        xC(str);
        GMTrace.o(15296660242432L, 113969);
      }
    }
    else
    {
      this.qCZ.qq();
    }
    GMTrace.o(15296660242432L, 113969);
  }
  
  public final void xC(String paramString)
  {
    GMTrace.i(15296794460160L, 113970);
    w.i("MicroMsg.OfflineVideoView", "%d prepare video  filePath %s", new Object[] { Integer.valueOf(hashCode()), paramString });
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.OfflineVideoView", "%d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(15296794460160L, 113970);
      return;
    }
    if (this.kwz != null)
    {
      this.kwz.a(this.qDd);
      this.kwz.setVideoPath(paramString);
    }
    GMTrace.o(15296794460160L, 113970);
  }
  
  public static abstract interface a
  {
    public abstract boolean a(PString paramPString);
    
    public abstract void onStart(int paramInt);
    
    public abstract void qq();
    
    public abstract void uu(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/OfflineVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */