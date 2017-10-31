package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.n;

public class GameMenuView
  extends LinearLayout
{
  private LayoutInflater CO;
  private Context mContext;
  private boolean sxR;
  private View sxW;
  private LinearLayout sxX;
  private LinearLayout sxY;
  f sxZ;
  b.c sya;
  b.a syb;
  
  public GameMenuView(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(18080335921152L, 134709);
    this.sxR = false;
    this.mContext = paramContext;
    this.CO = LayoutInflater.from(this.mContext);
    paramContext = this.mContext.getResources().getDisplayMetrics();
    if (paramContext.widthPixels > paramContext.heightPixels) {
      bool = true;
    }
    this.sxR = bool;
    MH();
    GMTrace.o(18080335921152L, 134709);
  }
  
  public GameMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    GMTrace.i(18080470138880L, 134710);
    this.sxR = false;
    this.mContext = paramContext;
    MH();
    GMTrace.o(18080470138880L, 134710);
  }
  
  private void MH()
  {
    GMTrace.i(18080604356608L, 134711);
    if (this.sxR)
    {
      setOrientation(0);
      this.CO.inflate(R.i.cWK, this, true);
    }
    for (View localView = this.CO.inflate(R.i.cWH, this, true);; localView = this.CO.inflate(R.i.cWI, this, true))
    {
      this.sxW = localView.findViewById(R.h.bMY);
      this.sxX = ((LinearLayout)localView.findViewById(R.h.bMX));
      this.sxY = ((LinearLayout)localView.findViewById(R.h.bMZ));
      GMTrace.o(18080604356608L, 134711);
      return;
      setOrientation(1);
      this.CO.inflate(R.i.cWL, this, true);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */