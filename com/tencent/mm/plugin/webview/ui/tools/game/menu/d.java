package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.m;

public final class d
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private ViewTreeObserver Lj;
  private View gO;
  private Context mContext;
  private m qQU;
  private e sxN;
  public b.b sxO;
  private GameMenuView sxP;
  private f sxQ;
  private boolean sxR;
  private boolean sxS;
  public boolean sxT;
  public boolean sxU;
  
  public d(Context paramContext)
  {
    GMTrace.i(18081275445248L, 134716);
    this.sxR = false;
    this.sxU = false;
    this.mContext = paramContext;
    if ((this.mContext instanceof Activity))
    {
      paramContext = (ViewGroup)((Activity)this.mContext).getWindow().getDecorView();
      if (paramContext.getChildCount() <= 0) {
        break label181;
      }
    }
    label181:
    for (this.gO = paramContext.getChildAt(0);; this.gO = paramContext)
    {
      paramContext = this.mContext;
      this.qQU = new m();
      this.sxN = new e(paramContext);
      this.sxP = new GameMenuView(paramContext);
      this.sxQ = new f(paramContext);
      paramContext = this.sxP;
      f localf = this.sxQ;
      paramContext.sxZ = localf;
      localf.registerDataSetObserver(new GameMenuView.1(paramContext));
      localf.notifyDataSetChanged();
      this.sxR = aNT();
      this.sxN.setContentView(this.sxP);
      GMTrace.o(18081275445248L, 134716);
      return;
    }
  }
  
  private boolean aNT()
  {
    GMTrace.i(18081946533888L, 134721);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
    {
      GMTrace.o(18081946533888L, 134721);
      return true;
    }
    GMTrace.o(18081946533888L, 134721);
    return false;
  }
  
  private boolean isShowing()
  {
    GMTrace.i(18081678098432L, 134719);
    if (this.sxN != null)
    {
      if (this.sxN.isShowing())
      {
        GMTrace.o(18081678098432L, 134719);
        return true;
      }
      GMTrace.o(18081678098432L, 134719);
      return false;
    }
    GMTrace.o(18081678098432L, 134719);
    return false;
  }
  
  public final void a(b.c paramc)
  {
    GMTrace.i(18081812316160L, 134720);
    if (this.sxP != null) {
      this.sxP.sya = paramc;
    }
    GMTrace.o(18081812316160L, 134720);
  }
  
  public final void bCV()
  {
    int i = 0;
    GMTrace.i(18081409662976L, 134717);
    this.sxR = aNT();
    if (this.sxO != null) {
      this.sxO.a(this.qQU);
    }
    if (this.sxN != null)
    {
      if (this.sxQ != null)
      {
        f localf = this.sxQ;
        localf.qQU = this.qQU;
        localf.notifyDataSetChanged();
      }
      if (Build.VERSION.SDK_INT >= 21) {
        this.sxN.getWindow().addFlags(Integer.MIN_VALUE);
      }
      if ((this.sxS) && (Build.VERSION.SDK_INT >= 23) && (this.sxN != null))
      {
        this.sxN.getWindow().getDecorView().setSystemUiVisibility(9216);
        this.sxN.getWindow().setStatusBarColor(0);
      }
      if (this.sxT) {
        this.sxN.getWindow().addFlags(1024);
      }
      if (!this.sxU) {
        break label298;
      }
      this.sxN.getWindow().setFlags(8, 8);
      this.sxN.getWindow().addFlags(131200);
      this.sxN.getWindow().getDecorView().setSystemUiVisibility(6);
    }
    for (;;)
    {
      if (this.gO != null)
      {
        if (this.Lj == null) {
          i = 1;
        }
        this.Lj = this.gO.getViewTreeObserver();
        if (i != 0) {
          this.Lj.addOnGlobalLayoutListener(this);
        }
      }
      this.sxN.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(18086509936640L, 134755);
          d.this.bCW();
          GMTrace.o(18086509936640L, 134755);
        }
      });
      if (this.sxP != null) {
        this.sxP.syb = new b.a()
        {
          public final void onDismiss()
          {
            GMTrace.i(18086778372096L, 134757);
            d.this.bCW();
            GMTrace.o(18086778372096L, 134757);
          }
        };
      }
      this.sxN.show();
      GMTrace.o(18081409662976L, 134717);
      return;
      label298:
      this.sxN.getWindow().clearFlags(8);
      this.sxN.getWindow().clearFlags(131072);
      this.sxN.getWindow().clearFlags(128);
      this.sxN.getWindow().getDecorView().setSystemUiVisibility(0);
    }
  }
  
  public final void bCW()
  {
    GMTrace.i(18081543880704L, 134718);
    if (this.Lj != null)
    {
      if (!this.Lj.isAlive()) {
        this.Lj = this.gO.getViewTreeObserver();
      }
      this.Lj.removeGlobalOnLayoutListener(this);
      this.Lj = null;
    }
    if (this.sxN != null) {
      this.sxN.dismiss();
    }
    GMTrace.o(18081543880704L, 134718);
  }
  
  public final void onGlobalLayout()
  {
    GMTrace.i(18081141227520L, 134715);
    if (isShowing())
    {
      View localView = this.gO;
      if ((localView == null) || (!localView.isShown()))
      {
        bCW();
        GMTrace.o(18081141227520L, 134715);
        return;
      }
      if ((isShowing()) && (this.sxR != aNT())) {
        bCW();
      }
    }
    GMTrace.o(18081141227520L, 134715);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */