package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class CommonVideoView
  extends AbstractVideoView
{
  protected int jda;
  protected boolean jdb;
  public String url;
  
  public CommonVideoView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17460115800064L, 130088);
    GMTrace.o(17460115800064L, 130088);
  }
  
  public CommonVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16394695475200L, 122150);
    GMTrace.o(16394695475200L, 122150);
  }
  
  public CommonVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16394829692928L, 122151);
    GMTrace.o(16394829692928L, 122151);
  }
  
  public void MH()
  {
    GMTrace.i(16394963910656L, 122152);
    super.MH();
    this.TAG = "MicroMsg.CommonVideoView";
    GMTrace.o(16394963910656L, 122152);
  }
  
  public void MJ()
  {
    GMTrace.i(17461055324160L, 130095);
    super.MJ();
    GMTrace.o(17461055324160L, 130095);
  }
  
  public void MK()
  {
    GMTrace.i(17460921106432L, 130094);
    super.MK();
    if ((this.kwz != null) && ((this.kwz instanceof VideoTextureView)))
    {
      if (this.sXG)
      {
        play();
        GMTrace.o(17460921106432L, 130094);
        return;
      }
      ((VideoTextureView)this.kwz).aNI();
    }
    GMTrace.o(17460921106432L, 130094);
  }
  
  public int MN()
  {
    GMTrace.i(17460652670976L, 130092);
    try
    {
      if ((this.kwz instanceof VideoTextureView))
      {
        int i = ((VideoTextureView)this.kwz).tnl;
        int j = super.Xs();
        float f = j;
        i = (int)(i * 1.0F / 100.0F * f);
        GMTrace.o(17460652670976L, 130092);
        return i;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace(this.TAG, localException, "%s get cache time sec error", new Object[] { bHG() });
      GMTrace.o(17460652670976L, 130092);
    }
    return 0;
  }
  
  public int MP()
  {
    GMTrace.i(17461592195072L, 130099);
    GMTrace.o(17461592195072L, 130099);
    return 0;
  }
  
  public final boolean T(float paramFloat)
  {
    GMTrace.i(17460518453248L, 130091);
    w.i(this.TAG, "%s set play rate [%f]", new Object[] { bHG(), Float.valueOf(paramFloat) });
    if ((this.kwz instanceof VideoTextureView))
    {
      es(MP() + 13);
      boolean bool = ((VideoTextureView)this.kwz).T(paramFloat);
      GMTrace.o(17460518453248L, 130091);
      return bool;
    }
    GMTrace.o(17460518453248L, 130091);
    return false;
  }
  
  public final boolean WV()
  {
    GMTrace.i(17461457977344L, 130098);
    boolean bool = isPrepared();
    int i;
    if (this.kwz != null)
    {
      i = this.kwz.getDuration();
      if (!this.jdb) {
        break label108;
      }
      bool = true;
    }
    for (;;)
    {
      w.d(this.TAG, "%s is live video result [%b] isPrepared[%b] durationMs[%d] isLive[%b]", new Object[] { bHG(), Boolean.valueOf(bool), Boolean.valueOf(isPrepared()), Integer.valueOf(i), Boolean.valueOf(this.jdb) });
      GMTrace.o(17461457977344L, 130098);
      return bool;
      i = 0;
      break;
      label108:
      if ((bool) && (i <= 0)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  public final int Xs()
  {
    GMTrace.i(16395366563840L, 122155);
    if (this.jda <= 0)
    {
      i = super.Xs();
      GMTrace.o(16395366563840L, 122155);
      return i;
    }
    int i = this.jda;
    GMTrace.o(16395366563840L, 122155);
    return i;
  }
  
  public void a(h.d paramd)
  {
    GMTrace.i(17460384235520L, 130090);
    if ((this.kwz instanceof VideoTextureView))
    {
      VideoTextureView localVideoTextureView = (VideoTextureView)this.kwz;
      localVideoTextureView.tmR.a(paramd);
      localVideoTextureView.requestLayout();
      es(MP() + 14);
    }
    GMTrace.o(17460384235520L, 130090);
  }
  
  public void b(boolean paramBoolean, String paramString, int paramInt)
  {
    GMTrace.i(17460250017792L, 130089);
    w.i(this.TAG, "%s set video path isLive [%b] url [%s] durationSec [%d]", new Object[] { bHG(), Boolean.valueOf(paramBoolean), paramString, Integer.valueOf(paramInt) });
    this.jdb = paramBoolean;
    this.url = paramString;
    this.jda = paramInt;
    Oe(paramString);
    GMTrace.o(17460250017792L, 130089);
  }
  
  public f bt(Context paramContext)
  {
    GMTrace.i(16395098128384L, 122153);
    this.sXH = 0;
    paramContext = new VideoTextureView(paramContext);
    GMTrace.o(16395098128384L, 122153);
    return paramContext;
  }
  
  public final void dQ(int paramInt1, int paramInt2)
  {
    GMTrace.i(17461189541888L, 130096);
    w.d(this.TAG, "%s onInfo [%d %d]", new Object[] { bHG(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 701)
    {
      aaN();
      bHL();
      bHJ();
      es(MP() + 40);
      GMTrace.o(17461189541888L, 130096);
      return;
    }
    if (paramInt1 == 702)
    {
      aIO();
      bHK();
      bHM();
    }
    GMTrace.o(17461189541888L, 130096);
  }
  
  public boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17460786888704L, 130093);
    if (WV())
    {
      w.w(this.TAG, "%s it is live, don't seek ", new Object[] { bHG() });
      GMTrace.o(17460786888704L, 130093);
      return false;
    }
    paramBoolean = super.o(paramInt, paramBoolean);
    GMTrace.o(17460786888704L, 130093);
    return paramBoolean;
  }
  
  public void qq()
  {
    GMTrace.i(17461323759616L, 130097);
    if (WV())
    {
      w.i(this.TAG, "%s it is live video, do not completion", new Object[] { bHG() });
      stop();
      start();
      GMTrace.o(17461323759616L, 130097);
      return;
    }
    super.qq();
    GMTrace.o(17461323759616L, 130097);
  }
  
  public void start()
  {
    GMTrace.i(16395232346112L, 122154);
    if (this.kwz != null)
    {
      w.i(this.TAG, "%s start path [%s] [%s]", new Object[] { bHG(), this.kwz.Nx(), bg.bOd() });
      if (!bg.mZ(this.kwz.Nx())) {
        break label112;
      }
      this.kwz.setVideoPath(this.url);
      aaN();
      bmi();
    }
    for (;;)
    {
      es(MP() + 1);
      GMTrace.o(16395232346112L, 122154);
      return;
      label112:
      play();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/CommonVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */