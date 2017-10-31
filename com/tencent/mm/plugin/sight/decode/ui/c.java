package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.an.n;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.plugin.ae.a.a;
import com.tencent.mm.plugin.ae.a.b;
import com.tencent.mm.plugin.ae.a.e;
import com.tencent.mm.plugin.ae.a.f;
import com.tencent.mm.plugin.ae.a.h;
import com.tencent.mm.plugin.ae.a.i;
import com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.j;
import com.tencent.mm.x.d.a;
import java.io.File;

public final class c
  extends j
  implements d.a
{
  public int fPe;
  public String hCR;
  public String imagePath;
  private com.tencent.mm.x.d jdd;
  private com.tencent.mm.pluginsdk.ui.tools.f kwz;
  public int lRC;
  public int pBL;
  private TextView pCF;
  private boolean pCG;
  
  public c(Context paramContext)
  {
    super(paramContext, a.i.rim);
    GMTrace.i(9275652964352L, 69109);
    this.kwz = null;
    this.pCF = null;
    this.fPe = 0;
    this.pBL = 0;
    this.lRC = 0;
    this.pCG = false;
    this.jdd = new com.tencent.mm.x.d();
    GMTrace.o(9275652964352L, 69109);
  }
  
  private void beW()
  {
    GMTrace.i(9275921399808L, 69111);
    w.v("check", "onclick");
    if (this.kwz.isPlaying())
    {
      this.kwz.pause();
      this.jdd.bc(false);
    }
    new ae().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9248675201024L, 68908);
        c.this.dismiss();
        GMTrace.o(9248675201024L, 68908);
      }
    });
    GMTrace.o(9275921399808L, 69111);
  }
  
  public final void dismiss()
  {
    GMTrace.i(9276189835264L, 69113);
    w.d("MicroMsg.VideoPopupHelper", "on dismiss");
    if (com.tencent.mm.booter.a.rl() != null) {
      com.tencent.mm.booter.a.rl().rm();
    }
    if (this.kwz != null)
    {
      this.kwz.a(null);
      this.kwz.stop();
      this.kwz.onDetach();
      findViewById(a.e.cEe).setOnClickListener(null);
    }
    if ((!this.pCG) && (isShowing()))
    {
      rb localrb = new rb();
      localrb.fPb.type = 0;
      localrb.fPb.fPc = this.pBL;
      localrb.fPb.fPd = this.lRC;
      localrb.fPb.fPe = this.fPe;
      com.tencent.mm.sdk.b.a.uLm.m(localrb);
    }
    super.dismiss();
    this.jdd.bc(true);
    GMTrace.o(9276189835264L, 69113);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9275787182080L, 69110);
    long l = System.currentTimeMillis();
    w.d("MicroMsg.VideoPopupHelper", l + " initView beg");
    super.onCreate(paramBundle);
    getWindow().setFlags(16777216, 16777216);
    setContentView(a.f.rid);
    if (com.tencent.mm.booter.a.rl() != null) {
      com.tencent.mm.booter.a.rl().rn();
    }
    w.d("MicroMsg.VideoPopupHelper", g.tG() + " initView: fullpath:" + this.hCR + ", imagepath:" + this.imagePath);
    this.pCF = ((TextView)findViewById(a.e.cBu));
    findViewById(a.e.cxV).setVisibility(8);
    paramBundle = (ViewGroup)findViewById(a.e.cEe);
    paramBundle.setBackgroundResource(a.b.black);
    w.i("MicroMsg.VideoPopupHelper", "getVideoView, is normal video");
    if (com.tencent.mm.compatible.util.d.et(14)) {}
    for (this.kwz = new VideoTextureView(getContext());; this.kwz = new VideoSurfaceView(getContext()))
    {
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams.addRule(13);
      paramBundle.addView((View)this.kwz, localLayoutParams);
      this.kwz.a(new f.a()
      {
        public final void Xd()
        {
          GMTrace.i(9277666230272L, 69124);
          w.d("MicroMsg.VideoPopupHelper", g.tG() + " onPrepared");
          c.a(c.this);
          GMTrace.o(9277666230272L, 69124);
        }
        
        public final int bL(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(9278068883456L, 69127);
          GMTrace.o(9278068883456L, 69127);
          return 0;
        }
        
        public final void br(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(9278203101184L, 69128);
          GMTrace.o(9278203101184L, 69128);
        }
        
        public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(9277800448000L, 69125);
          w.e("MicroMsg.VideoPopupHelper", "on play video error, what %d extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          c.b(c.this).stop();
          b.q(Base64.encodeToString((com.tencent.mm.plugin.sight.base.d.beu() + "[SightPopupHelper] on play video error, what " + paramAnonymousInt1 + " extra " + paramAnonymousInt2 + ", path=" + bg.ap(c.c(c.this), "")).getBytes(), 2), "FullScreenPlaySight");
          final String str = c.c(c.this);
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9247601459200L, 68900);
              Object localObject = (ImageView)c.this.findViewById(a.e.cEP);
              ((ImageView)localObject).setImageBitmap(this.oVf);
              ((ImageView)localObject).setVisibility(0);
              localObject = new Intent();
              ((Intent)localObject).setAction("android.intent.action.VIEW");
              ((Intent)localObject).setDataAndType(Uri.fromFile(new File(str)), "video/*");
              try
              {
                c.this.getContext().startActivity(Intent.createChooser((Intent)localObject, c.this.getContext().getString(a.h.rif)));
                GMTrace.o(9247601459200L, 68900);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.VideoPopupHelper", "startActivity fail, activity not found");
                h.h(c.this.getContext(), a.h.rih, a.h.rii);
                GMTrace.o(9247601459200L, 68900);
              }
            }
          });
          GMTrace.o(9277800448000L, 69125);
        }
        
        public final void qq()
        {
          GMTrace.i(9277934665728L, 69126);
          w.d("MicroMsg.VideoPopupHelper", "on completion");
          c.d(c.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9254312345600L, 68950);
              c.d(c.this).setVisibility(0);
              c.d(c.this).startAnimation(AnimationUtils.loadAnimation(c.this.getContext(), a.a.aLC));
              GMTrace.o(9254312345600L, 68950);
            }
          });
          c.b(c.this).ch(true);
          c.a(c.this);
          GMTrace.o(9277934665728L, 69126);
        }
      });
      findViewById(a.e.cEe).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9250420031488L, 68921);
          c.e(c.this);
          GMTrace.o(9250420031488L, 68921);
        }
      });
      ((View)this.kwz).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(9270821126144L, 69073);
          c.e(c.this);
          GMTrace.o(9270821126144L, 69073);
        }
      });
      if (this.hCR != null)
      {
        this.kwz.stop();
        this.kwz.setVideoPath(this.hCR);
      }
      w.d("MicroMsg.VideoPopupHelper", System.currentTimeMillis() - l + " initView end");
      paramBundle = new rb();
      paramBundle.fPb.type = 1;
      com.tencent.mm.sdk.b.a.uLm.m(paramBundle);
      GMTrace.o(9275787182080L, 69110);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sight/decode/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */