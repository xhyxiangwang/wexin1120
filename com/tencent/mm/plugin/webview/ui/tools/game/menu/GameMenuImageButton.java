package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.bq.a;

public class GameMenuImageButton
  extends LinearLayout
{
  private ImageView fBd;
  public boolean sxv;
  
  public GameMenuImageButton(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18084630888448L, 134741);
    cm(paramContext);
    GMTrace.o(18084630888448L, 134741);
  }
  
  public GameMenuImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18084765106176L, 134742);
    cm(paramContext);
    GMTrace.o(18084765106176L, 134742);
  }
  
  public GameMenuImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18084899323904L, 134743);
    cm(paramContext);
    GMTrace.o(18084899323904L, 134743);
  }
  
  private void cm(Context paramContext)
  {
    GMTrace.i(18085033541632L, 134744);
    this.fBd = new ImageView(paramContext);
    this.fBd.setLayoutParams(new ViewGroup.LayoutParams(a.V(paramContext, R.f.aTW), a.V(paramContext, R.f.aTW)));
    this.fBd.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.fBd.setImageResource(R.g.aZe);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.setMargins(0, a.V(paramContext, R.f.aTV), a.V(paramContext, R.f.aTV), 0);
    addView(this.fBd, localLayoutParams);
    GMTrace.o(18085033541632L, 134744);
  }
  
  public final void a(FrameLayout paramFrameLayout, final a parama)
  {
    GMTrace.i(18085167759360L, 134745);
    if ((getParent() == null) && (paramFrameLayout != null))
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.gravity = 53;
      paramFrameLayout.addView(this, localLayoutParams);
    }
    if (this.fBd != null) {
      this.fBd.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18079933267968L, 134706);
          if (parama != null) {
            parama.aDD();
          }
          GMTrace.o(18079933267968L, 134706);
        }
      });
    }
    this.sxv = true;
    GMTrace.o(18085167759360L, 134745);
  }
  
  public static abstract interface a
  {
    public abstract void aDD();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */