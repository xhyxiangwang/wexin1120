package com.tencent.mm.plugin.sns.lucky.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI;
import com.tencent.mm.plugin.sns.ui.TouchImageView;
import com.tencent.mm.plugin.sns.ui.b.b;
import com.tencent.mm.plugin.sns.ui.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.bdg;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public class SnsDetailLuckyHeader
  extends LinearLayout
{
  private View lcV;
  private TextView pZC;
  private LinearLayout pZD;
  private LinearLayout pZE;
  
  public SnsDetailLuckyHeader(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8848840589312L, 65929);
    this.lcV = null;
    init();
    GMTrace.o(8848840589312L, 65929);
  }
  
  public SnsDetailLuckyHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8848974807040L, 65930);
    this.lcV = null;
    init();
    GMTrace.o(8848974807040L, 65930);
  }
  
  public SnsDetailLuckyHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8848706371584L, 65928);
    this.lcV = null;
    init();
    GMTrace.o(8848706371584L, 65928);
  }
  
  private void init()
  {
    GMTrace.i(8849109024768L, 65931);
    Object localObject = View.inflate(getContext(), i.g.pOa, this);
    this.lcV = ((View)localObject).findViewById(i.f.pIU);
    this.pZC = ((TextView)((View)localObject).findViewById(i.f.pID));
    this.pZD = ((LinearLayout)((View)localObject).findViewById(i.f.pIE));
    BackwardSupportUtil.b.a(getContext(), 2.0F);
    localObject = new AbsListView.LayoutParams(-1, 1);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setBackgroundResource(i.e.pHA);
    localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.pZE = localLinearLayout;
    GMTrace.o(8849109024768L, 65931);
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.m paramm, b paramb)
  {
    GMTrace.i(8849377460224L, 65933);
    Object localObject2 = ai.n(paramm);
    Object localObject1 = ((bdk)localObject2).uvw;
    if ((localObject1 == null) || (((bdz)localObject1).uvZ.size() == 0))
    {
      setVisibility(8);
      GMTrace.o(8849377460224L, 65933);
      return;
    }
    setVisibility(0);
    double d = com.tencent.mm.plugin.sns.lucky.a.m.b(paramm, (bdk)localObject2);
    localObject2 = getContext().getString(i.j.pTc, new Object[] { Integer.valueOf(((bdk)localObject2).uvw.uvY), bg.r(d * 1.0D / 100.0D) });
    this.pZC.setText((CharSequence)localObject2);
    this.lcV.setTag(paramm);
    this.lcV.setOnClickListener(paramb.qVo);
    paramm = ((bdz)localObject1).uvZ;
    boolean bool = ((bdz)localObject1).uvZ.isEmpty();
    int k = BackwardSupportUtil.b.a(getContext(), 32.0F);
    int m = BackwardSupportUtil.b.a(getContext(), 6.0F);
    int i = BackwardSupportUtil.b.a(getContext(), 10.0F);
    int j = BackwardSupportUtil.b.a(getContext(), 17.0F);
    int n;
    float f;
    if (this.pZD != null)
    {
      n = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getWidth();
      f = getResources().getDimension(i.d.aSg);
      w.d("MicroMsg.SnsDetailLuckyHeader", "guess size %d %f", new Object[] { Integer.valueOf(n), Float.valueOf(f) });
      f = n - f * 2.0F;
      if (paramm.size() > 0) {
        break label340;
      }
      if (this.pZD.getParent() != null) {
        this.pZD.setVisibility(8);
      }
      this.pZD.removeAllViews();
      this.pZD.setVisibility(8);
      paramm = this.pZD;
      i = 8;
    }
    for (;;)
    {
      paramm.setVisibility(i);
      GMTrace.o(8849377460224L, 65933);
      return;
      label340:
      this.pZD.getParent();
      this.pZD.removeAllViews();
      this.pZD.setVisibility(0);
      this.pZD.setPadding(0, m, 0, m);
      localObject1 = new ImageView(getContext());
      ((ImageView)localObject1).setImageResource(i.i.pQo);
      ((ImageView)localObject1).setPadding(i, j, i, 0);
      localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).gravity = 49;
      ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((ImageView)localObject1).setClickable(false);
      ((ImageView)localObject1).setFocusable(false);
      this.pZD.addView((View)localObject1);
      n = a.fromDPToPix(getContext(), SnsCommentDetailUI.qHG);
      j = (int)(f - n) / (m + k);
      i = j;
      if ((int)(f - n) % (m + k) > k) {
        i = j + 1;
      }
      w.d("MicroMsg.SnsDetailLuckyHeader", "guess size %d", new Object[] { Integer.valueOf(i) });
      localObject1 = new i(getContext());
      ((i)localObject1).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      ((i)localObject1).qxI = i;
      i = 0;
      while (i < paramm.size())
      {
        localObject2 = (bdg)paramm.get(i);
        TouchImageView localTouchImageView = new TouchImageView(getContext());
        localTouchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        localTouchImageView.setImageResource(i.e.pGR);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(k, k);
        localLayoutParams.setMargins(0, m, m, 0);
        localTouchImageView.setLayoutParams(localLayoutParams);
        localTouchImageView.setTag(((bdg)localObject2).twR);
        a.b.b(localTouchImageView, ((bdg)localObject2).twR, true);
        localTouchImageView.setOnClickListener(paramb.qVd);
        ((i)localObject1).addView(localTouchImageView);
        i += 1;
      }
      this.pZD.addView((View)localObject1);
      paramm = this.pZE;
      if (bool) {
        i = 8;
      } else {
        i = 0;
      }
    }
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(8849243242496L, 65932);
    super.setVisibility(paramInt);
    if (this.lcV != null) {
      this.lcV.setVisibility(paramInt);
    }
    GMTrace.o(8849243242496L, 65932);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/view/SnsDetailLuckyHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */