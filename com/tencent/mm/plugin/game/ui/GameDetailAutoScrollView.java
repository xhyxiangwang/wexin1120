package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import java.util.ArrayList;

public class GameDetailAutoScrollView
  extends LinearLayout
{
  int liX;
  aj mHP;
  ArrayList<String> mJC;
  ViewGroup mJD;
  TextView mJE;
  TextView mJF;
  ViewGroup mJG;
  private TextView mJH;
  private TextView mJI;
  private Animation mJJ;
  private Animation mJK;
  
  public GameDetailAutoScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12727464493056L, 94827);
    this.mJC = new ArrayList();
    this.liX = 0;
    this.mHP = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(12732564766720L, 94865);
        GameDetailAutoScrollView.a(GameDetailAutoScrollView.this);
        GMTrace.o(12732564766720L, 94865);
        return true;
      }
    }, true);
    this.mJD = ((ViewGroup)LayoutInflater.from(paramContext).inflate(R.i.cWd, this, false));
    this.mJE = ((TextView)this.mJD.findViewById(R.h.bLs));
    this.mJF = ((TextView)this.mJD.findViewById(R.h.bLt));
    addView(this.mJD);
    this.mJD.setVisibility(8);
    this.mJG = ((ViewGroup)LayoutInflater.from(paramContext).inflate(R.i.cWd, this, false));
    this.mJH = ((TextView)this.mJG.findViewById(R.h.bLs));
    this.mJI = ((TextView)this.mJG.findViewById(R.h.bLt));
    addView(this.mJG);
    this.mJG.setVisibility(8);
    this.mJJ = AnimationUtils.loadAnimation(paramContext, R.a.aMm);
    this.mJK = AnimationUtils.loadAnimation(paramContext, R.a.aMs);
    GMTrace.o(12727464493056L, 94827);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(12727598710784L, 94828);
    super.onDetachedFromWindow();
    this.mHP.MM();
    GMTrace.o(12727598710784L, 94828);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailAutoScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */