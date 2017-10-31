package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.f.g;
import com.tencent.mm.plugin.sns.i.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
{
  private Context mContext;
  private int pWC;
  private com.tencent.mm.plugin.sns.ui.b.b qgD;
  private FrameLayout qgE;
  AbsoluteLayout qgF;
  protected Animation qgG;
  protected Animation qgH;
  public boolean qgI;
  private com.tencent.mm.plugin.sns.f.b qwu;
  TextView qwv;
  ListView qww;
  View qwx;
  
  public c(Context paramContext, com.tencent.mm.plugin.sns.ui.b.b paramb, FrameLayout paramFrameLayout, com.tencent.mm.plugin.sns.f.b paramb1)
  {
    GMTrace.i(8429410189312L, 62804);
    this.qgF = null;
    this.qgI = false;
    this.pWC = -1;
    this.mContext = paramContext;
    this.qwu = paramb1;
    this.qgD = paramb;
    this.qgE = paramFrameLayout;
    this.qgG = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.qgG = AnimationUtils.loadAnimation(paramContext, i.a.pGd);
    this.qgH = new ScaleAnimation(1.0F, 1.0F, 1.0F, 0.0F, 1, 1.0F, 1, 0.0F);
    this.qgH = AnimationUtils.loadAnimation(paramContext, i.a.pGe);
    GMTrace.o(8429410189312L, 62804);
  }
  
  public final boolean bif()
  {
    GMTrace.i(8429678624768L, 62806);
    if ((this.qwu != null) && (com.tencent.mm.plugin.sns.model.ae.bhh().big())) {
      this.qwu.bif();
    }
    if (this.qgF != null)
    {
      this.qgE.removeView(this.qgF);
      this.qgF = null;
      GMTrace.o(8429678624768L, 62806);
      return true;
    }
    this.qgI = false;
    this.qww = null;
    this.qwx = null;
    GMTrace.o(8429678624768L, 62806);
    return false;
  }
  
  public final boolean bkJ()
  {
    GMTrace.i(20061523804160L, 149470);
    final int k = this.qwv.getHeight();
    this.qwv.setVisibility(8);
    int i = 0;
    Object localObject = null;
    final int j = 0;
    while (i < this.qww.getAdapter().getCount())
    {
      localObject = this.qww.getAdapter().getView(i, (View)localObject, null);
      ((View)localObject).measure(this.qwx.getWidth(), -2);
      j += ((View)localObject).getMeasuredHeight();
      i += 1;
    }
    ((RelativeLayout.LayoutParams)this.qww.getLayoutParams()).bottomMargin = (k - j);
    this.qww.setVisibility(0);
    localObject = new Animation()
    {
      protected final void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        GMTrace.i(20061255368704L, 149468);
        paramAnonymousTransformation = (RelativeLayout.LayoutParams)c.this.qww.getLayoutParams();
        if (paramAnonymousFloat == 1.0F) {}
        for (int i = 0;; i = (int)((k - j) * (1.0F - paramAnonymousFloat)))
        {
          paramAnonymousTransformation.bottomMargin = i;
          c.this.qww.requestLayout();
          GMTrace.o(20061255368704L, 149468);
          return;
        }
      }
      
      public final boolean willChangeBounds()
      {
        GMTrace.i(20061389586432L, 149469);
        GMTrace.o(20061389586432L, 149469);
        return true;
      }
    };
    ((Animation)localObject).setDuration(250L);
    this.qww.startAnimation((Animation)localObject);
    GMTrace.o(20061523804160L, 149470);
    return true;
  }
  
  public final void c(View paramView1, View paramView2)
  {
    GMTrace.i(16044252987392L, 119539);
    Object localObject = (com.tencent.mm.plugin.sns.data.b)paramView1.getTag();
    paramView2.setVisibility(0);
    this.qgI = true;
    this.qgG.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8345121456128L, 62176);
        c.this.qgI = false;
        GMTrace.o(8345121456128L, 62176);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8345255673856L, 62177);
        GMTrace.o(8345255673856L, 62177);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(8344987238400L, 62175);
        c.this.qgI = true;
        GMTrace.o(8344987238400L, 62175);
      }
    });
    paramView2.startAnimation(this.qgG);
    this.qwv = ((TextView)paramView2.findViewById(i.f.pIf));
    this.qwv.setOnClickListener(this.qgD.qVn);
    this.qwv.setOnTouchListener(bg.bOc());
    this.qwv.setTag(localObject);
    String str;
    if ((((com.tencent.mm.plugin.sns.data.b)localObject).pYc != null) && (((com.tencent.mm.plugin.sns.data.b)localObject).pYc.qSm != null))
    {
      localObject = ((com.tencent.mm.plugin.sns.data.b)localObject).pYc.qSm;
      str = com.tencent.mm.sdk.platformtools.v.eq(ab.getContext());
      if (!"zh_CN".equals(str)) {
        break label226;
      }
      localObject = ((com.tencent.mm.plugin.sns.storage.b)localObject).qlA;
    }
    for (;;)
    {
      if (!bg.mZ((String)localObject)) {
        this.qwv.setText((CharSequence)localObject);
      }
      this.qww = ((ListView)paramView2.findViewById(i.f.pIb));
      this.qww.setAdapter(new d(this.mContext, (com.tencent.mm.plugin.sns.data.b)paramView1.getTag()));
      this.qww.setOnItemClickListener(this.qgD.qVE);
      this.qwx = paramView2;
      GMTrace.o(16044252987392L, 119539);
      return;
      label226:
      if (("zh_TW".equals(str)) || ("zh_HK".equals(str))) {
        localObject = ((com.tencent.mm.plugin.sns.storage.b)localObject).qlC;
      } else {
        localObject = ((com.tencent.mm.plugin.sns.storage.b)localObject).qlB;
      }
    }
  }
  
  public final boolean cv(final View paramView)
  {
    GMTrace.i(8429544407040L, 62805);
    if ((com.tencent.mm.plugin.sns.model.ae.bhh().big()) && (this.qwu != null))
    {
      i = this.qwu.cs(paramView);
      if ((i == 0) || (i == 1))
      {
        GMTrace.o(8429544407040L, 62805);
        return true;
      }
      w.i("MicroMsg.AdNotLikeHelper", "abtest error return 2");
    }
    if (this.qgI)
    {
      GMTrace.o(8429544407040L, 62805);
      return false;
    }
    if (this.qgF != null)
    {
      if ((this.qgF.getTag() instanceof a))
      {
        paramView = ((a)this.qgF.getTag()).pVI;
        this.qgI = true;
        paramView.startAnimation(this.qgH);
        this.qgH.setAnimationListener(new Animation.AnimationListener()
        {
          public final void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8348342681600L, 62200);
            if (paramView != null)
            {
              paramView.clearAnimation();
              paramView.setVisibility(8);
              c.this.bif();
            }
            c.this.qgI = false;
            GMTrace.o(8348342681600L, 62200);
          }
          
          public final void onAnimationRepeat(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8348208463872L, 62199);
            GMTrace.o(8348208463872L, 62199);
          }
          
          public final void onAnimationStart(Animation paramAnonymousAnimation)
          {
            GMTrace.i(8348074246144L, 62198);
            c.this.qgI = true;
            GMTrace.o(8348074246144L, 62198);
          }
        });
      }
      for (;;)
      {
        GMTrace.o(8429544407040L, 62805);
        return false;
        bif();
      }
    }
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
    {
      GMTrace.o(8429544407040L, 62805);
      return false;
    }
    com.tencent.mm.plugin.sns.data.b localb = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
    Object localObject2 = localb.fxL;
    this.qgF = new AbsoluteLayout(this.mContext);
    this.qgF.setId(i.f.cMc);
    new FrameLayout.LayoutParams(-1, -1);
    this.qgE.addView(this.qgF);
    int i = BackwardSupportUtil.b.a(this.mContext, 150.0F);
    int j = BackwardSupportUtil.b.a(this.mContext, 17.0F);
    BackwardSupportUtil.b.a(this.mContext, 40.0F);
    final View localView = com.tencent.mm.ui.v.fa(this.mContext).inflate(i.g.pNS, null);
    TextView localTextView = (TextView)localView.findViewById(i.f.pIe);
    Object localObject1 = com.tencent.mm.sdk.platformtools.v.eq(ab.getContext());
    com.tencent.mm.plugin.sns.storage.b localb1 = localb.pYc.qSm;
    if (localb1 != null)
    {
      if (!"zh_CN".equals(localObject1)) {
        break label571;
      }
      localObject1 = localb1.qlN;
    }
    for (;;)
    {
      if (!bg.mZ((String)localObject1)) {
        localTextView.setText((CharSequence)localObject1);
      }
      new Rect();
      int k = e.dG(this.mContext);
      localObject1 = localb.pYc.bnX();
      w.d("MicroMsg.AdNotLikeHelper", "addCommentView getLocationInWindow " + localObject1[0] + "  " + localObject1[1] + " height: " + k);
      this.pWC = e.dH(this.mContext);
      localObject1 = new AbsoluteLayout.LayoutParams(-2, -2, localObject1[0] - i, localObject1[1] - this.pWC - k + j);
      localObject2 = new a((String)localObject2, localView);
      this.qgF.setTag(localObject2);
      this.qgF.addView(localView, (ViewGroup.LayoutParams)localObject1);
      localView.setVisibility(8);
      this.qgI = true;
      new com.tencent.mm.sdk.platformtools.ae().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8548998184960L, 63695);
          c.this.c(paramView, localView);
          GMTrace.o(8548998184960L, 63695);
        }
      });
      GMTrace.o(8429544407040L, 62805);
      return true;
      label571:
      if (("zh_TW".equals(localObject1)) || ("zh_HK".equals(localObject1))) {
        localObject1 = localb1.qlP;
      } else {
        localObject1 = localb1.qlO;
      }
    }
  }
  
  final class a
  {
    View pVI;
    String qgY;
    
    public a(String paramString, View paramView)
    {
      GMTrace.i(8543763693568L, 63656);
      this.pVI = null;
      this.qgY = paramString;
      this.pVI = paramView;
      GMTrace.o(8543763693568L, 63656);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */