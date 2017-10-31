package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.protocal.c.bdk;

public final class bh
{
  Context mContext;
  int pWC;
  LinearLayout qHp;
  LinearLayout qHq;
  SnsCommentShowAbLayout qSJ;
  FrameLayout qgE;
  private av qhj;
  
  public bh(Context paramContext, av paramav, FrameLayout paramFrameLayout)
  {
    GMTrace.i(8715428167680L, 64935);
    this.qSJ = null;
    this.pWC = -1;
    this.mContext = paramContext;
    this.qhj = paramav;
    this.qgE = paramFrameLayout;
    GMTrace.o(8715428167680L, 64935);
  }
  
  public final boolean blj()
  {
    GMTrace.i(8715696603136L, 64937);
    if (this.qSJ != null)
    {
      this.qgE.removeView(this.qSJ);
      this.qSJ = null;
      GMTrace.o(8715696603136L, 64937);
      return true;
    }
    GMTrace.o(8715696603136L, 64937);
    return false;
  }
  
  public final void c(View paramView1, View paramView2)
  {
    GMTrace.i(16046534688768L, 119556);
    paramView1 = (a.c)paramView1.getTag();
    Object localObject3 = ae.bhp().HA(paramView1.fxL);
    Object localObject1;
    Object localObject2;
    int i;
    if (localObject3 != null)
    {
      localObject1 = com.tencent.mm.modelsns.b.gM(740);
      localObject2 = ai.n((m)localObject3);
      localObject3 = ((com.tencent.mm.modelsns.b)localObject1).lh(i.g((m)localObject3)).gP(((m)localObject3).field_type).bA(((m)localObject3).uF(32)).lh(((m)localObject3).bkq()).lh(((m)localObject3).field_userName);
      if (localObject2 == null)
      {
        i = 0;
        localObject3 = ((com.tencent.mm.modelsns.b)localObject3).gP(i);
        if (localObject2 != null) {
          break label458;
        }
        i = 0;
        label116:
        ((com.tencent.mm.modelsns.b)localObject3).gP(i);
        ((com.tencent.mm.modelsns.b)localObject1).LJ();
      }
    }
    else
    {
      paramView2.setVisibility(0);
      paramView2.startAnimation(this.qhj.qHn);
      this.qHp = ((LinearLayout)paramView2.findViewById(i.f.pIx));
      this.qHp.setOnClickListener(this.qhj.qgD.qVi);
      this.qHp.setOnTouchListener(this.qhj.qBi);
      this.qHq = ((LinearLayout)paramView2.findViewById(i.f.pIP));
      this.qHq.setOnClickListener(this.qhj.qgD.qVj);
      this.qHq.setOnTouchListener(this.qhj.qBi);
      this.qHq.setTag(paramView1);
      this.qHp.setTag(paramView1);
      paramView2 = (ImageView)this.qHq.findViewById(i.f.pIO);
      localObject1 = (ImageView)this.qHp.findViewById(i.f.pIp);
      localObject2 = (TextView)this.qHq.findViewById(i.f.pIQ);
      localObject3 = (TextView)this.qHp.findViewById(i.f.pIy);
      if (!u.HX(paramView1.fMT)) {
        break label485;
      }
      this.qHp.setEnabled(false);
      this.qHq.setEnabled(false);
      ((TextView)localObject3).setTextColor(this.mContext.getResources().getColor(i.c.pGm));
      if (paramView1.kxh != 11) {
        break label467;
      }
      paramView2.setImageResource(i.i.pQh);
      ((ImageView)localObject1).setImageResource(i.i.pQk);
      label378:
      ((TextView)localObject2).setText(this.mContext.getString(i.j.pSY));
      ((TextView)localObject2).setTextColor(this.mContext.getResources().getColor(i.c.pGm));
    }
    for (;;)
    {
      if (paramView1.kxh == 11)
      {
        this.qHq.setBackgroundResource(i.e.pHa);
        this.qHp.setBackgroundResource(i.e.pHb);
      }
      GMTrace.o(16046534688768L, 119556);
      return;
      i = ((bdk)localObject2).uvg;
      break;
      label458:
      i = ((bdk)localObject2).uvj;
      break label116;
      label467:
      paramView2.setImageResource(i.i.pQj);
      ((ImageView)localObject1).setImageResource(i.i.pQl);
      break label378;
      label485:
      this.qHp.setEnabled(true);
      if (paramView1.kxh == 11)
      {
        paramView2.setImageResource(i.e.pGY);
        ((ImageView)localObject1).setImageResource(i.e.pGZ);
        ((TextView)localObject2).setTextColor(this.mContext.getResources().getColor(i.c.pGn));
        ((TextView)localObject3).setTextColor(this.mContext.getResources().getColor(i.c.pGn));
      }
      for (;;)
      {
        this.qHq.setEnabled(true);
        if (paramView1.qTD != 0) {
          break label632;
        }
        ((TextView)localObject2).setText(this.mContext.getString(i.j.pSY));
        break;
        paramView2.setImageResource(i.e.pGQ);
        ((TextView)localObject2).setTextColor(this.mContext.getResources().getColor(i.c.white));
        ((TextView)localObject3).setTextColor(this.mContext.getResources().getColor(i.c.white));
      }
      label632:
      ((TextView)localObject2).setText(this.mContext.getString(i.j.pSy));
    }
  }
  
  final void cD(final View paramView)
  {
    GMTrace.i(8715562385408L, 64936);
    paramView.clearAnimation();
    paramView.startAnimation(this.qhj.qHo);
    this.qhj.qHo.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8546448048128L, 63676);
        if (paramView != null)
        {
          paramView.setVisibility(8);
          bh.this.blj();
        }
        GMTrace.o(8546448048128L, 63676);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8546313830400L, 63675);
        GMTrace.o(8546313830400L, 63675);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8546179612672L, 63674);
        GMTrace.o(8546179612672L, 63674);
      }
    });
    GMTrace.o(8715562385408L, 64936);
  }
  
  final class a
  {
    View pVI;
    String qgY;
    
    public a(String paramString, View paramView)
    {
      GMTrace.i(8657982980096L, 64507);
      this.pVI = null;
      this.qgY = paramString;
      this.pVI = paramView;
      GMTrace.o(8657982980096L, 64507);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */