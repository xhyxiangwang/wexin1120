package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends BaseAdapter
{
  List<CardInfo> ksp;
  HashMap<String, Integer> ktn;
  Context mContext;
  
  public a(Context paramContext)
  {
    GMTrace.i(4984175329280L, 37135);
    this.ksp = new ArrayList();
    this.ktn = new HashMap();
    this.mContext = paramContext;
    GMTrace.o(4984175329280L, 37135);
  }
  
  public final int getCount()
  {
    GMTrace.i(4984309547008L, 37136);
    int i = this.ksp.size();
    GMTrace.o(4984309547008L, 37136);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(4984577982464L, 37138);
    long l = paramInt;
    GMTrace.o(4984577982464L, 37138);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4984712200192L, 37139);
    CardInfo localCardInfo = lD(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, R.i.cNN, null);
      paramViewGroup = new a();
      paramViewGroup.ktd = ((RelativeLayout)paramView.findViewById(R.h.bpq));
      paramViewGroup.kto = ((LinearLayout)paramView.findViewById(R.h.brt));
      paramViewGroup.kte = ((ImageView)paramView.findViewById(R.h.bqf));
      paramViewGroup.ktf = ((TextView)paramView.findViewById(R.h.boW));
      paramViewGroup.ktg = ((TextView)paramView.findViewById(R.h.bqz));
      paramViewGroup.kth = ((TextView)paramView.findViewById(R.h.subtitle));
      paramViewGroup.ktj = ((TextView)paramView.findViewById(R.h.bqB));
      paramViewGroup.ktp = ((ImageView)paramView.findViewById(R.h.bqs));
      paramViewGroup.ktq = ((TextView)paramView.findViewById(R.h.bpr));
      paramViewGroup.ktr = ((TextView)paramView.findViewById(R.h.brg));
      paramView.setTag(paramViewGroup);
      if (!localCardInfo.aiw()) {
        break label992;
      }
      paramViewGroup.kte.setVisibility(0);
      paramViewGroup.ktg.setVisibility(0);
      paramViewGroup.kth.setVisibility(0);
      paramViewGroup.ktj.setVisibility(8);
      paramViewGroup.ktf.setVisibility(0);
      paramViewGroup.ktf.setText(localCardInfo.aiK().koD);
      if (!localCardInfo.ait()) {
        break label749;
      }
      if ((localCardInfo.aiK().tEW == null) || (localCardInfo.aiK().tEW.size() != 1)) {
        break label634;
      }
      paramViewGroup.ktg.setText(((nc)localCardInfo.aiK().tEW.get(0)).title);
      label320:
      if (localCardInfo.aiK().tFv != 1) {
        break label769;
      }
      paramViewGroup.ktp.setVisibility(0);
      label342:
      long l = ((CardInfo)localCardInfo).field_begin_time;
      if ((localCardInfo.getEndTime() <= 0L) || (l <= 0L)) {
        break label781;
      }
      paramViewGroup.kth.setText(this.mContext.getString(R.l.dGR, new Object[] { l.av(l) + "  -  " + l.av(localCardInfo.getEndTime()) }));
      paramViewGroup.kth.setVisibility(0);
      label439:
      paramInt = this.mContext.getResources().getDimensionPixelSize(R.f.aSW);
      m.a(paramViewGroup.kte, localCardInfo.aiK().knr, paramInt, R.g.baR, true);
      if (localCardInfo.aiK().tFt != 1) {
        break label860;
      }
      paramViewGroup.kte.setAlpha(255);
      paramViewGroup.ktr.setVisibility(8);
      paramViewGroup.ktg.setTextColor(this.mContext.getResources().getColor(R.e.aNK));
      paramViewGroup.ktf.setTextColor(this.mContext.getResources().getColor(R.e.aNK));
      paramViewGroup.kth.setTextColor(this.mContext.getResources().getColor(R.e.aOz));
      label568:
      paramInt = ((Integer)this.ktn.get(localCardInfo.aiP())).intValue();
      if (paramInt != 1) {
        break label957;
      }
      paramViewGroup.ktq.setText("");
      paramViewGroup.ktq.setVisibility(8);
    }
    for (;;)
    {
      GMTrace.o(4984712200192L, 37139);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label634:
      if ((localCardInfo.aiK().tEW == null) || (localCardInfo.aiK().tEW.size() != 2)) {
        break label320;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(((nc)localCardInfo.aiK().tEW.get(0)).title);
      localStringBuilder.append("-");
      localStringBuilder.append(((nc)localCardInfo.aiK().tEW.get(1)).title);
      paramViewGroup.ktg.setText(localStringBuilder.toString());
      break label320;
      label749:
      paramViewGroup.ktg.setText(localCardInfo.aiK().title);
      break label320;
      label769:
      paramViewGroup.ktp.setVisibility(8);
      break label342;
      label781:
      if (localCardInfo.getEndTime() > 0L)
      {
        paramViewGroup.kth.setText(this.mContext.getString(R.l.dGQ, new Object[] { l.av(localCardInfo.getEndTime()) }));
        paramViewGroup.kth.setVisibility(0);
        break label439;
      }
      paramViewGroup.kth.setText("");
      paramViewGroup.kth.setVisibility(8);
      break label439;
      label860:
      paramViewGroup.ktr.setText(localCardInfo.aiK().tFu);
      paramViewGroup.kte.setAlpha(90);
      paramViewGroup.ktr.setVisibility(0);
      paramViewGroup.ktg.setTextColor(this.mContext.getResources().getColor(R.e.aOz));
      paramViewGroup.ktf.setTextColor(this.mContext.getResources().getColor(R.e.aOz));
      paramViewGroup.kth.setTextColor(this.mContext.getResources().getColor(R.e.aOz));
      break label568;
      label957:
      paramViewGroup.ktq.setText("x" + paramInt);
      paramViewGroup.ktq.setVisibility(0);
      continue;
      label992:
      paramViewGroup.kte.setVisibility(8);
      paramViewGroup.ktg.setVisibility(8);
      paramViewGroup.ktf.setVisibility(8);
      paramViewGroup.kth.setVisibility(8);
      paramViewGroup.ktr.setVisibility(8);
      paramViewGroup.ktq.setVisibility(8);
      paramViewGroup.ktj.setVisibility(0);
      paramViewGroup.ktd.setBackgroundColor(this.mContext.getResources().getColor(R.e.aNP));
      paramViewGroup.ktj.setText(this.mContext.getResources().getString(R.l.dFU));
    }
  }
  
  public final CardInfo lD(int paramInt)
  {
    GMTrace.i(4984443764736L, 37137);
    CardInfo localCardInfo = (CardInfo)this.ksp.get(paramInt);
    GMTrace.o(4984443764736L, 37137);
    return localCardInfo;
  }
  
  public final class a
  {
    public RelativeLayout ktd;
    public ImageView kte;
    public TextView ktf;
    public TextView ktg;
    public TextView kth;
    public TextView ktj;
    public LinearLayout kto;
    public ImageView ktp;
    public TextView ktq;
    public TextView ktr;
    
    public a()
    {
      GMTrace.i(4958942396416L, 36947);
      GMTrace.o(4958942396416L, 36947);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */