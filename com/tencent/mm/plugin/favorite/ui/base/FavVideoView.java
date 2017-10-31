package com.tencent.mm.plugin.favorite.ui.base;

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
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.x.ap;
import java.io.File;

public class FavVideoView
  extends RelativeLayout
  implements f.a
{
  public String hCR;
  public ae kvt;
  public f kwz;
  private ImageView lUH;
  private TextView lUI;
  private boolean lUJ;
  private boolean lUK;
  private int lUL;
  private boolean lUM;
  private ProgressBar lUN;
  private MMPinProgressBtn lUO;
  public String lUP;
  private int lUQ;
  public com.tencent.mm.sdk.b.c lUR;
  
  public FavVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6460436119552L, 48134);
    GMTrace.o(6460436119552L, 48134);
  }
  
  public FavVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6460570337280L, 48135);
    this.kvt = new ae(Looper.getMainLooper());
    this.lUJ = false;
    this.lUK = false;
    this.lUL = 0;
    this.lUM = false;
    this.lUP = "";
    this.lUQ = 0;
    this.lUR = new com.tencent.mm.sdk.b.c() {};
    w.i("MicroMsg.FavVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(paramContext).inflate(R.i.cUw, this);
    this.lUH = ((ImageView)findViewById(R.h.cEH));
    paramAttributeSet = (RelativeLayout)findViewById(R.h.cEG);
    ((TextView)findViewById(R.h.cEl)).setVisibility(8);
    this.lUO = ((MMPinProgressBtn)findViewById(R.h.cEw));
    this.lUN = ((ProgressBar)findViewById(R.h.cEr));
    this.lUI = ((TextView)findViewById(R.h.cEJ));
    if (com.tencent.mm.modelcontrol.d.Gz()) {
      this.lUK = true;
    }
    for (this.kwz = new VideoPlayerTextureView(paramContext);; this.kwz = new VideoTextureView(paramContext))
    {
      this.kwz.a(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      paramAttributeSet.addView((View)this.kwz, paramContext);
      a.uLm.b(this.lUR);
      GMTrace.o(6460570337280L, 48135);
      return;
      this.lUK = false;
    }
  }
  
  private void eA(final boolean paramBoolean)
  {
    GMTrace.i(6460838772736L, 48137);
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6450101354496L, 48057);
        w.i("MicroMsg.FavVideoView", "VideoPlay: switch video model isVideoPlay %b ", new Object[] { Boolean.valueOf(paramBoolean) });
        View localView = (View)FavVideoView.a(FavVideoView.this);
        if (paramBoolean)
        {
          localView.setVisibility(0);
          FavVideoView.b(FavVideoView.this).setVisibility(8);
          GMTrace.o(6450101354496L, 48057);
          return;
        }
        localView.setVisibility(8);
        FavVideoView.b(FavVideoView.this).setVisibility(0);
        GMTrace.o(6450101354496L, 48057);
      }
    });
    GMTrace.o(6460838772736L, 48137);
  }
  
  public final void Xd()
  {
    GMTrace.i(6461241425920L, 48140);
    this.lUL = 0;
    eA(true);
    this.lUM = this.kwz.start();
    w.i("MicroMsg.FavVideoView", "VideoPlay: startPlay(),duration is %d", new Object[] { Integer.valueOf(this.kwz.getDuration() / 1000) });
    GMTrace.o(6461241425920L, 48140);
  }
  
  public final int bL(int paramInt1, int paramInt2)
  {
    GMTrace.i(6460972990464L, 48138);
    GMTrace.o(6460972990464L, 48138);
    return 0;
  }
  
  public final void br(int paramInt1, int paramInt2)
  {
    GMTrace.i(6461107208192L, 48139);
    GMTrace.o(6461107208192L, 48139);
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(6461509861376L, 48142);
    w.e("MicroMsg.FavVideoView", "VideoPlay: %d on play video error what %d extra %d. isMMVideoPlayer[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.lUK) });
    if (this.lUM)
    {
      qq();
      GMTrace.o(6461509861376L, 48142);
      return;
    }
    this.lUL = paramInt2;
    final String str = this.kwz.Nx();
    this.kwz.stop();
    this.lUJ = true;
    eA(false);
    if (this.lUL == -1)
    {
      this.lUQ += 1;
      if (this.lUQ <= 3)
      {
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6454396321792L, 48089);
            if (FavVideoView.a(FavVideoView.this) != null) {
              FavVideoView.this.xC(FavVideoView.c(FavVideoView.this));
            }
            GMTrace.o(6454396321792L, 48089);
          }
        });
        GMTrace.o(6461509861376L, 48142);
        return;
      }
    }
    if ((!bg.mZ(str)) && (FileOp.aZ(str)))
    {
      w.e("MicroMsg.FavVideoView", "VideoPlay: start third player to play");
      this.kvt.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16935727136768L, 126181);
          Intent localIntent = new Intent();
          localIntent.setAction("android.intent.action.VIEW");
          localIntent.setDataAndType(Uri.fromFile(new File(str)), "video/*");
          try
          {
            FavVideoView.this.getContext().startActivity(localIntent);
            GMTrace.o(16935727136768L, 126181);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.FavVideoView", "startActivity fail, activity not found");
            h.h(FavVideoView.this.getContext(), R.l.dXl, R.l.dXm);
            GMTrace.o(16935727136768L, 126181);
          }
        }
      });
    }
    GMTrace.o(6461509861376L, 48142);
  }
  
  public final void onResume()
  {
    GMTrace.i(6460704555008L, 48136);
    w.i("MicroMsg.FavVideoView", "VideoPlay:   onResume()");
    if (!this.lUJ)
    {
      if ((!bg.mZ(this.hCR)) && (e.aZ(this.hCR)))
      {
        w.i("MicroMsg.FavVideoView", "VideoPlay: fullPath is not null,exist,  toggleVideo()");
        xC(this.hCR);
        GMTrace.o(6460704555008L, 48136);
        return;
      }
      w.i("MicroMsg.FavVideoView", "VideoPlay: fullPath is  null, show error, toggleVideo()");
      eA(false);
    }
    GMTrace.o(6460704555008L, 48136);
  }
  
  public final void qq()
  {
    GMTrace.i(6461375643648L, 48141);
    w.i("MicroMsg.FavVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if ((com.tencent.mm.compatible.util.d.ev(18)) || (!this.lUK))
    {
      w.i("MicroMsg.FavVideoView", "VideoPlay: seek second is %d", new Object[] { Integer.valueOf(0) });
      this.kwz.o(0.0D);
      GMTrace.o(6461375643648L, 48141);
      return;
    }
    if (this.kwz != null) {
      this.kwz.stop();
    }
    GMTrace.o(6461375643648L, 48141);
  }
  
  public final void xC(String paramString)
  {
    GMTrace.i(16934250741760L, 126170);
    w.i("MicroMsg.FavVideoView", "VideoPlay: prepareVideo");
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.FavVideoView", "VideoPlay: %d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(16934250741760L, 126170);
      return;
    }
    if (this.kwz != null)
    {
      if ((this.kwz instanceof VideoPlayerTextureView))
      {
        VideoPlayerTextureView localVideoPlayerTextureView = (VideoPlayerTextureView)this.kwz;
        ap.AS();
        localVideoPlayerTextureView.fT(com.tencent.mm.x.c.xi().c(w.a.vaK, false));
      }
      this.kwz.setVideoPath(paramString);
    }
    ap.AS();
    if (((Integer)com.tencent.mm.x.c.xi().get(w.a.uZI, Integer.valueOf(0))).intValue() == 1)
    {
      this.lUI.setText(com.tencent.mm.plugin.sight.base.d.Ca(paramString));
      this.lUI.setVisibility(0);
    }
    GMTrace.o(16934250741760L, 126170);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/FavVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */