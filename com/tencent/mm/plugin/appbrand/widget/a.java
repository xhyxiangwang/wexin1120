package com.tencent.mm.plugin.appbrand.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  extends LinearLayout
{
  public int Co;
  public ImageButton jyA;
  public AppBrandOptionButton jyB;
  private ProgressBar jyC;
  private h jyD;
  public int jyE;
  private boolean jyF;
  public View.OnClickListener jyG;
  public View.OnClickListener jyH;
  private long jyI;
  public LinearLayout jyu;
  public View jyv;
  public TextView jyw;
  private TextView jyx;
  private ImageView jyy;
  private View jyz;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10140686221312L, 75554);
    this.jyF = false;
    this.jyG = null;
    this.jyH = null;
    this.jyI = 0L;
    setLayoutParams(new LinearLayout.LayoutParams(-1, b.bX(getContext())));
    setGravity(19);
    setBackgroundResource(p.c.aNf);
    this.jyu = ((LinearLayout)v.fa(getContext()).inflate(p.g.iuT, this, false));
    addView(this.jyu);
    addView(v.fa(getContext()).inflate(p.g.iuT, this, false));
    this.jyE = -1;
    this.Co = getResources().getColor(p.c.aNf);
    this.jyv = findViewById(p.f.isM);
    this.jyw = ((TextView)findViewById(p.f.isN));
    this.jyx = ((TextView)findViewById(p.f.isO));
    this.jyy = ((ImageView)findViewById(p.f.isL));
    this.jyz = findViewById(p.f.isK);
    this.jyA = ((ImageButton)findViewById(p.f.isI));
    this.jyB = ((AppBrandOptionButton)findViewById(p.f.bgr));
    this.jyC = ((ProgressBar)findViewById(p.f.isJ));
    this.jyD = new h();
    this.jyz.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10040962449408L, 74811);
        a.a(a.this);
        GMTrace.o(10040962449408L, 74811);
      }
    });
    GMTrace.o(10140686221312L, 75554);
  }
  
  public final void abt()
  {
    GMTrace.i(19883953750016L, 148147);
    this.jyx.clearAnimation();
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(500L);
    localAlphaAnimation.setStartOffset(0L);
    localAlphaAnimation.setRepeatMode(2);
    localAlphaAnimation.setRepeatCount(-1);
    this.jyx.startAnimation(localAlphaAnimation);
    GMTrace.o(19883953750016L, 148147);
  }
  
  public final void abu()
  {
    GMTrace.i(17288853979136L, 128812);
    if (this.jyF) {
      this.jyy.setImageResource(p.h.ivO);
    }
    for (;;)
    {
      this.jyy.setColorFilter(this.jyE, PorterDuff.Mode.SRC_ATOP);
      this.jyw.setTextColor(this.jyE);
      this.jyx.setTextColor(this.jyE);
      this.jyA.setImageDrawable(g.c(getContext(), p.h.ivM, this.jyE));
      h localh = this.jyD;
      localh.lK = this.jyE;
      localh.invalidateSelf();
      this.jyC.setLayerType(1, null);
      this.jyC.setIndeterminateDrawable(this.jyD);
      this.jyB.setColor(this.jyE);
      GMTrace.o(17288853979136L, 128812);
      return;
      this.jyy.setImageResource(p.h.ivP);
    }
  }
  
  public final void cF(boolean paramBoolean)
  {
    GMTrace.i(19884087967744L, 148148);
    if (paramBoolean)
    {
      setVisibility(8);
      GMTrace.o(19884087967744L, 148148);
      return;
    }
    setVisibility(0);
    GMTrace.o(19884087967744L, 148148);
  }
  
  public final void cG(boolean paramBoolean)
  {
    GMTrace.i(15437051985920L, 115015);
    if (paramBoolean)
    {
      this.jyB.setVisibility(0);
      GMTrace.o(15437051985920L, 115015);
      return;
    }
    this.jyB.setVisibility(8);
    GMTrace.o(15437051985920L, 115015);
  }
  
  public final void cH(boolean paramBoolean)
  {
    GMTrace.i(15437186203648L, 115016);
    if (paramBoolean)
    {
      this.jyA.setVisibility(0);
      GMTrace.o(15437186203648L, 115016);
      return;
    }
    this.jyA.setVisibility(8);
    GMTrace.o(15437186203648L, 115016);
  }
  
  public final void cI(boolean paramBoolean)
  {
    GMTrace.i(10141088874496L, 75557);
    this.jyF = paramBoolean;
    abu();
    GMTrace.o(10141088874496L, 75557);
  }
  
  public final void cJ(boolean paramBoolean)
  {
    GMTrace.i(10141223092224L, 75558);
    View localView = this.jyz;
    if (paramBoolean)
    {
      i = 8;
      localView.setVisibility(i);
      localView = this.jyv;
      if (!paramBoolean) {
        break label72;
      }
    }
    label72:
    for (int i = getContext().getResources().getDimensionPixelSize(p.d.aRS);; i = 0)
    {
      localView.setPadding(i, 0, 0, 0);
      GMTrace.o(10141223092224L, 75558);
      return;
      i = 0;
      break;
    }
  }
  
  public final void cK(boolean paramBoolean)
  {
    int j = 0;
    GMTrace.i(17288988196864L, 128813);
    Object localObject = this.jyC;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      ((ProgressBar)localObject).setVisibility(i);
      if (!paramBoolean) {
        break label188;
      }
      localObject = this.jyD;
      ((h)localObject).lr.clear();
      ((h)localObject).lr.add(h.a(((h)localObject).jzJ));
      ((h)localObject).lr.add(h.a(((h)localObject).jzK));
      localObject = this.jyD;
      Iterator localIterator = ((h)localObject).lr.iterator();
      do
      {
        i = j;
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!((Animator)localIterator.next()).isStarted());
      i = 1;
      if (i != 0) {
        break label178;
      }
      localIterator = ((h)localObject).lr.iterator();
      while (localIterator.hasNext()) {
        ((Animator)localIterator.next()).start();
      }
    }
    ((h)localObject).invalidateSelf();
    label178:
    GMTrace.o(17288988196864L, 128813);
    return;
    label188:
    localObject = this.jyD.lr.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Animator)((Iterator)localObject).next()).end();
    }
    GMTrace.o(17288988196864L, 128813);
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    GMTrace.i(17288719761408L, 128811);
    this.Co = paramInt;
    super.setBackgroundColor(paramInt);
    GMTrace.o(17288719761408L, 128811);
  }
  
  public final void so(String paramString)
  {
    GMTrace.i(17288585543680L, 128810);
    this.jyw.setText(paramString);
    GMTrace.o(17288585543680L, 128810);
  }
  
  public final void sp(String paramString)
  {
    GMTrace.i(19883819532288L, 148146);
    if (bg.mZ(paramString)) {
      this.jyx.setVisibility(8);
    }
    for (;;)
    {
      this.jyx.clearAnimation();
      GMTrace.o(19883819532288L, 148146);
      return;
      this.jyx.setVisibility(0);
      this.jyx.setText(paramString);
    }
  }
  
  public final void sq(String paramString)
  {
    GMTrace.i(10140954656768L, 75556);
    if ("white".equals(paramString)) {
      this.jyE = -1;
    }
    for (;;)
    {
      abu();
      GMTrace.o(10140954656768L, 75556);
      return;
      if ("black".equals(paramString)) {
        this.jyE = -16777216;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */