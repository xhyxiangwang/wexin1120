package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.VideoView;

final class u
{
  private static u xyq = null;
  Context sS;
  v xyr = null;
  
  private u(Context paramContext)
  {
    this.sS = paramContext.getApplicationContext();
    this.xyr = new v(this.sS);
  }
  
  public static u gX(Context paramContext)
  {
    try
    {
      if (xyq == null) {
        xyq = new u(paramContext);
      }
      paramContext = xyq;
      return paramContext;
    }
    finally {}
  }
  
  final void l(Activity paramActivity, int paramInt)
  {
    v localv = this.xyr;
    if ((paramInt == 3) && (!localv.clB()) && (localv.xyv != null)) {
      localv.xyv.pause();
    }
    if (paramInt == 4)
    {
      localv.mContext = null;
      if ((!localv.clB()) && (localv.xyv != null))
      {
        localv.xyv.stopPlayback();
        localv.xyv = null;
      }
    }
    if ((paramInt == 2) && (!localv.clB()))
    {
      localv.mContext = paramActivity;
      if ((!localv.clB()) && (localv.xyv != null))
      {
        if (localv.xyv.getParent() == null)
        {
          Object localObject = paramActivity.getWindow();
          FrameLayout localFrameLayout = (FrameLayout)((Window)localObject).getDecorView();
          ((Window)localObject).addFlags(1024);
          ((Window)localObject).addFlags(128);
          localFrameLayout.setBackgroundColor(-16777216);
          localObject = new MediaController(paramActivity);
          ((MediaController)localObject).setMediaPlayer(localv.xyv);
          localv.xyv.setMediaController((MediaController)localObject);
          localObject = new FrameLayout.LayoutParams(-1, -1);
          ((FrameLayout.LayoutParams)localObject).gravity = 17;
          localFrameLayout.addView(localv.xyv, (ViewGroup.LayoutParams)localObject);
        }
        if (Build.VERSION.SDK_INT >= 8) {
          localv.xyv.start();
        }
      }
    }
    if (localv.clB()) {
      localv.xyu.a(localv.xyt, paramActivity, paramInt);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */