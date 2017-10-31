package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.ui.MMActivity;

public final class u
  extends i
{
  private View kAm;
  
  public u()
  {
    GMTrace.i(4989946691584L, 37178);
    GMTrace.o(4989946691584L, 37178);
  }
  
  public final void MH()
  {
    GMTrace.i(4990080909312L, 37179);
    GMTrace.o(4990080909312L, 37179);
  }
  
  public final void amb()
  {
    GMTrace.i(4990349344768L, 37181);
    if (this.kAm != null) {
      this.kAm.setVisibility(8);
    }
    GMTrace.o(4990349344768L, 37181);
  }
  
  public final void update()
  {
    GMTrace.i(4990215127040L, 37180);
    if (this.kAm == null) {
      this.kAm = ((ViewStub)findViewById(R.h.bqF)).inflate();
    }
    b localb = this.kzR.akL();
    MMActivity localMMActivity = this.kzR.akO();
    Object localObject = localb.aiL().tEB;
    TextView localTextView1;
    TextView localTextView2;
    LinearLayout localLinearLayout;
    LinearLayout.LayoutParams localLayoutParams1;
    LinearLayout.LayoutParams localLayoutParams2;
    if (this.kAm != null)
    {
      localTextView1 = (TextView)this.kAm.findViewById(R.h.bqG);
      localTextView1.setText(((nc)localObject).title);
      localTextView1.setTextColor(l.uk(localb.aiK().hbA));
      localTextView2 = (TextView)this.kAm.findViewById(R.h.bqE);
      localLinearLayout = (LinearLayout)this.kAm.findViewById(R.h.bry);
      localLayoutParams1 = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
      if (!localb.air()) {
        break label434;
      }
      localLayoutParams2 = (LinearLayout.LayoutParams)localTextView1.getLayoutParams();
      if (TextUtils.isEmpty(((nc)localObject).knt)) {
        break label409;
      }
      localTextView2.setText(((nc)localObject).knt);
      localTextView2.setVisibility(0);
      localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(R.f.aSX);
      localLayoutParams2.bottomMargin = localMMActivity.getResources().getDimensionPixelSize(R.f.aQX);
      localObject = (LinearLayout.LayoutParams)localTextView2.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).topMargin = localMMActivity.getResources().getDimensionPixelSize(R.f.aQX);
      localTextView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
      localTextView2.invalidate();
    }
    for (;;)
    {
      localLayoutParams2.height = localMMActivity.getResources().getDimensionPixelSize(R.f.aSZ);
      localTextView1.setLayoutParams(localLayoutParams2);
      localTextView1.invalidate();
      int i = localMMActivity.getResources().getDimensionPixelSize(R.f.aTb);
      localTextView1.setBackgroundDrawable(l.e(localMMActivity, localb.aiK().hbA, i));
      localTextView1.setTextColor(l.R(localMMActivity, localb.aiK().hbA));
      localLinearLayout.setBackgroundDrawable(null);
      localTextView1.setOnClickListener(this.kzR.akP());
      localLinearLayout.setLayoutParams(localLayoutParams1);
      localLinearLayout.invalidate();
      this.kAm.invalidate();
      if (localb.air()) {
        localLinearLayout.getLayoutParams();
      }
      GMTrace.o(4990215127040L, 37180);
      return;
      label409:
      localTextView2.setVisibility(8);
      localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(R.f.aSY);
    }
    label434:
    if (!TextUtils.isEmpty(((nc)localObject).knt))
    {
      localTextView2.setText(((nc)localObject).knt);
      localTextView2.setVisibility(0);
    }
    for (localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(R.f.aTf);; localLayoutParams1.height = localMMActivity.getResources().getDimensionPixelOffset(R.f.aTg))
    {
      localLinearLayout.setOnClickListener(this.kzR.akP());
      break;
      localTextView2.setVisibility(8);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */