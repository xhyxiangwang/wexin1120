package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.plugin.favorite.b.w.a;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.t;

public class FavVoiceBaseView
  extends LinearLayout
  implements w.a
{
  private int duration;
  private int fBu;
  public com.tencent.mm.plugin.favorite.b.w lQh;
  private ViewGroup lUV;
  private TextView lUW;
  private ImageButton lUX;
  private TextView lUY;
  private a lUZ;
  private String path;
  
  public FavVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6451443531776L, 48067);
    this.path = "";
    GMTrace.o(6451443531776L, 48067);
  }
  
  public final void C(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(6451846184960L, 48070);
    this.path = bg.ap(paramString, "");
    this.fBu = paramInt1;
    this.duration = paramInt2;
    if (this.path.equals(this.lQh.path))
    {
      if (this.lQh.awW())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceBaseView", "updateInfo .isPlay()");
        paramString = this.lUZ;
        this.lQh.qo();
        paramString.eB(true);
        GMTrace.o(6451846184960L, 48070);
        return;
      }
      if (this.lQh.qp())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceBaseView", "updateInfo .isPause()");
        paramString = this.lUZ;
        this.lQh.qo();
        paramString.eB(false);
        GMTrace.o(6451846184960L, 48070);
        return;
      }
      this.lUZ.nA(paramInt2);
      GMTrace.o(6451846184960L, 48070);
      return;
    }
    this.lUZ.nA(paramInt2);
    GMTrace.o(6451846184960L, 48070);
  }
  
  public final void aX(String paramString, int paramInt)
  {
    GMTrace.i(6452248838144L, 48073);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bg.ap(paramString, "").equals(this.path))
    {
      this.lUZ.stop();
      this.lUW.setKeepScreenOn(false);
      GMTrace.o(6452248838144L, 48073);
      return;
    }
    this.lUW.setKeepScreenOn(true);
    this.lUZ.begin();
    GMTrace.o(6452248838144L, 48073);
  }
  
  public final void ahm()
  {
    GMTrace.i(6452114620416L, 48072);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceBaseView", "stop play");
    this.lQh.ahm();
    this.lUZ.stop();
    this.lUW.setKeepScreenOn(false);
    GMTrace.o(6452114620416L, 48072);
  }
  
  public final boolean awY()
  {
    GMTrace.i(6451980402688L, 48071);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceBaseView", "pause play");
    boolean bool = this.lQh.awY();
    a locala = this.lUZ;
    locala.isPaused = true;
    locala.removeMessages(4096);
    locala.lVa.lUX.setImageResource(R.k.dry);
    locala.lVa.lUX.setContentDescription(locala.lVa.getContext().getResources().getString(R.l.dwH));
    this.lUW.setKeepScreenOn(false);
    GMTrace.o(6451980402688L, 48071);
    return bool;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(6451577749504L, 48068);
    super.onConfigurationChanged(paramConfiguration);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceBaseView", "on configuration changed, is paused ? %B", new Object[] { Boolean.valueOf(this.lUZ.isPaused) });
    if (this.lUZ.isPaused) {
      this.lUZ.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6456006934528L, 48101);
          FavVoiceBaseView.f(FavVoiceBaseView.this).ayb();
          GMTrace.o(6456006934528L, 48101);
        }
      }, 128L);
    }
    GMTrace.o(6451577749504L, 48068);
  }
  
  public final void onFinish()
  {
    GMTrace.i(6452383055872L, 48074);
    ahm();
    GMTrace.o(6452383055872L, 48074);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(6451711967232L, 48069);
    super.onFinishInflate();
    this.lUV = ((ViewGroup)findViewById(R.h.cFD));
    this.lUY = ((TextView)findViewById(R.h.cFA));
    this.lUW = ((TextView)findViewById(R.h.cFC));
    this.lUX = ((ImageButton)findViewById(R.h.cFy));
    this.lUZ = new a();
    this.lUX.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6463657345024L, 48158);
        if ((com.tencent.mm.p.a.aQ(paramAnonymousView.getContext())) || (com.tencent.mm.p.a.aO(paramAnonymousView.getContext())))
        {
          GMTrace.o(6463657345024L, 48158);
          return;
        }
        if ((!f.tD()) && (!bg.mZ(FavVoiceBaseView.g(FavVoiceBaseView.this))))
        {
          t.fn(paramAnonymousView.getContext());
          GMTrace.o(6463657345024L, 48158);
          return;
        }
        if (!bg.ap(FavVoiceBaseView.g(FavVoiceBaseView.this), "").equals(FavVoiceBaseView.h(FavVoiceBaseView.this).path))
        {
          FavVoiceBaseView.i(FavVoiceBaseView.this);
          GMTrace.o(6463657345024L, 48158);
          return;
        }
        if (FavVoiceBaseView.h(FavVoiceBaseView.this).awW())
        {
          FavVoiceBaseView.this.awY();
          GMTrace.o(6463657345024L, 48158);
          return;
        }
        if (!FavVoiceBaseView.j(FavVoiceBaseView.this)) {
          FavVoiceBaseView.i(FavVoiceBaseView.this);
        }
        GMTrace.o(6463657345024L, 48158);
      }
    });
    GMTrace.o(6451711967232L, 48069);
  }
  
  public final void onPause()
  {
    GMTrace.i(6452517273600L, 48075);
    awY();
    GMTrace.o(6452517273600L, 48075);
  }
  
  private final class a
    extends ae
  {
    boolean isPaused;
    float lVb;
    float lVc;
    int lVd;
    int lVe;
    
    public a()
    {
      GMTrace.i(6458288635904L, 48118);
      GMTrace.o(6458288635904L, 48118);
    }
    
    public final void ayb()
    {
      GMTrace.i(6458825506816L, 48122);
      this.lVd = ((int)((1.0F - this.lVc / this.lVb) * (FavVoiceBaseView.e(FavVoiceBaseView.this).getWidth() - this.lVe)) + this.lVe);
      FavVoiceBaseView.a(FavVoiceBaseView.this).setText(u.t(FavVoiceBaseView.this.getContext(), Math.min((int)Math.ceil(this.lVc), (int)this.lVb)));
      FavVoiceBaseView.c(FavVoiceBaseView.this).setWidth(this.lVd);
      GMTrace.o(6458825506816L, 48122);
    }
    
    public final void begin()
    {
      GMTrace.i(6458557071360L, 48120);
      stop();
      this.isPaused = false;
      FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(R.k.drz);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(R.l.dws));
      sendEmptyMessage(4096);
      GMTrace.o(6458557071360L, 48120);
    }
    
    public final void eB(boolean paramBoolean)
    {
      GMTrace.i(14547993755648L, 108391);
      this.lVe = com.tencent.mm.bq.a.fromDPToPix(FavVoiceBaseView.this.getContext(), 3);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(R.k.dry);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(R.l.dwH));
      ayb();
      if (paramBoolean)
      {
        FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(R.k.drz);
        FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(R.l.dws));
        sendEmptyMessage(4096);
      }
      GMTrace.o(14547993755648L, 108391);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(6459093942272L, 48124);
      this.lVc = Math.max(0.0F, this.lVc - 0.256F);
      ayb();
      if (this.lVc <= 0.1F)
      {
        GMTrace.o(6459093942272L, 48124);
        return;
      }
      sendEmptyMessageDelayed(4096, 256L);
      GMTrace.o(6459093942272L, 48124);
    }
    
    public final void nA(int paramInt)
    {
      GMTrace.i(6458422853632L, 48119);
      this.isPaused = false;
      this.lVb = x.aB(paramInt);
      this.lVc = this.lVb;
      this.lVe = com.tencent.mm.bq.a.fromDPToPix(FavVoiceBaseView.this.getContext(), 3);
      FavVoiceBaseView.a(FavVoiceBaseView.this).setText(u.t(FavVoiceBaseView.this.getContext(), (int)this.lVb));
      FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(R.k.dry);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(R.l.dwH));
      FavVoiceBaseView.c(FavVoiceBaseView.this).setWidth(this.lVe);
      GMTrace.o(6458422853632L, 48119);
    }
    
    public final void stop()
    {
      GMTrace.i(6458691289088L, 48121);
      this.isPaused = false;
      removeMessages(4096);
      nA(FavVoiceBaseView.d(FavVoiceBaseView.this));
      GMTrace.o(6458691289088L, 48121);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/FavVoiceBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */