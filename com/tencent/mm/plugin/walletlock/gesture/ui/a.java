package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.walletlock.a.d;
import com.tencent.mm.plugin.walletlock.a.e;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;

final class a
{
  View mView;
  TextView sfS;
  FrameLayout sfT;
  PatternLockView sfU;
  TextView sfV;
  
  public a(Activity paramActivity)
  {
    GMTrace.i(20222048206848L, 150666);
    this.mView = null;
    this.sfS = null;
    this.sfT = null;
    this.sfU = null;
    this.sfV = null;
    this.mView = View.inflate(paramActivity, a.e.sdM, null);
    this.sfS = ((TextView)this.mView.findViewById(a.d.dhe));
    this.sfT = ((FrameLayout)this.mView.findViewById(a.d.sdI));
    this.sfU = ((PatternLockView)this.mView.findViewById(a.d.sdH));
    this.sfV = ((TextView)this.mView.findViewById(a.d.sdK));
    GMTrace.o(20222048206848L, 150666);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */