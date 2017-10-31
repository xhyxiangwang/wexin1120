package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;

public class LoadingMoreView
  extends LinearLayout
{
  private Context context;
  private ImageView fDY;
  protected LinearLayout ksj;
  protected LinearLayout ksk;
  protected LinearLayout qCl;
  protected LinearLayout qCm;
  protected TextView qCn;
  
  public LoadingMoreView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8714891296768L, 64931);
    this.context = paramContext;
    init();
    GMTrace.o(8714891296768L, 64931);
  }
  
  public LoadingMoreView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8714757079040L, 64930);
    this.context = paramContext;
    init();
    GMTrace.o(8714757079040L, 64930);
  }
  
  private void init()
  {
    GMTrace.i(8715025514496L, 64932);
    Object localObject = LayoutInflater.from(this.context).inflate(i.g.pPf, this, true);
    this.fDY = ((ImageView)findViewById(i.f.bhx));
    this.ksj = ((LinearLayout)((View)localObject).findViewById(i.f.bUi));
    this.ksk = ((LinearLayout)((View)localObject).findViewById(i.f.bUg));
    this.qCl = ((LinearLayout)((View)localObject).findViewById(i.f.pNq));
    this.qCm = ((LinearLayout)((View)localObject).findViewById(i.f.pKO));
    this.qCn = ((TextView)((View)localObject).findViewById(i.f.pKP));
    this.ksj.setVisibility(0);
    this.ksk.setVisibility(8);
    this.qCl.setVisibility(8);
    this.qCm.setVisibility(8);
    localObject = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
    ((Animation)localObject).setDuration(1000L);
    ((Animation)localObject).setRepeatCount(-1);
    ((Animation)localObject).setInterpolator(new LinearInterpolator());
    this.fDY.startAnimation((Animation)localObject);
    GMTrace.o(8715025514496L, 64932);
  }
  
  public final void hW(boolean paramBoolean)
  {
    GMTrace.i(8715159732224L, 64933);
    this.ksj.setVisibility(8);
    if (paramBoolean)
    {
      this.qCl.setVisibility(0);
      this.ksk.setVisibility(8);
    }
    for (;;)
    {
      this.qCm.setVisibility(8);
      GMTrace.o(8715159732224L, 64933);
      return;
      this.ksk.setVisibility(0);
      this.qCl.setVisibility(8);
    }
  }
  
  public final void uP(int paramInt)
  {
    GMTrace.i(8715293949952L, 64934);
    this.ksj.setVisibility(8);
    this.qCl.setVisibility(8);
    this.ksk.setVisibility(8);
    this.qCm.setVisibility(0);
    if (paramInt == 2001)
    {
      this.qCn.setText(getContext().getResources().getString(i.j.pTx));
      GMTrace.o(8715293949952L, 64934);
      return;
    }
    if (paramInt == 2003)
    {
      this.qCn.setText(getContext().getResources().getString(i.j.pRO));
      GMTrace.o(8715293949952L, 64934);
      return;
    }
    if (paramInt == 2004) {
      this.qCn.setText(getContext().getResources().getString(i.j.pTy));
    }
    GMTrace.o(8715293949952L, 64934);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/LoadingMoreView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */