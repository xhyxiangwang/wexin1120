package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;

public final class f
  extends a
{
  protected TextView iiM;
  private View kBM;
  private ImageView kBN;
  private TextView kBO;
  private TextView kBP;
  private View kBQ;
  private TextView kBR;
  private TextView kBS;
  private ImageView kBT;
  private TextView kBU;
  public ArrayList<ji> kmP;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4887135911936L, 36412);
    GMTrace.o(4887135911936L, 36412);
  }
  
  protected final void amt()
  {
    GMTrace.i(4887270129664L, 36413);
    this.iiM = ((TextView)ams().findViewById(R.h.brq));
    this.kBM = ams().findViewById(R.h.boU);
    this.kBN = ((ImageView)ams().findViewById(R.h.cAK));
    this.kBO = ((TextView)ams().findViewById(R.h.cAJ));
    this.kBP = ((TextView)ams().findViewById(R.h.cAI));
    this.kBQ = ams().findViewById(R.h.cAM);
    this.kBR = ((TextView)ams().findViewById(R.h.cAO));
    this.kBS = ((TextView)ams().findViewById(R.h.cAN));
    this.kBT = ((ImageView)ams().findViewById(R.h.cAL));
    this.kBU = ((TextView)ams().findViewById(R.h.cAH));
    GMTrace.o(4887270129664L, 36413);
  }
  
  protected final void amu()
  {
    GMTrace.i(4887404347392L, 36414);
    label132:
    label213:
    Object localObject;
    StringBuilder localStringBuilder;
    nc localnc1;
    if ((this.kmJ.aiK().tFy != null) && (!TextUtils.isEmpty(this.kmJ.aiK().tFy.title)))
    {
      this.kBk.setText(this.kmJ.aiK().tFy.title);
      if ((this.kmJ.aiK().tFy == null) || (TextUtils.isEmpty(this.kmJ.aiK().tFy.kns))) {
        break label615;
      }
      this.iiM.setText(this.kmJ.aiK().tFy.kns);
      this.iiM.setVisibility(0);
      w.i("MicroMsg.CardWidgetTicket", "updateContentView()");
      if (bg.mZ(this.kmJ.aiK().tFe)) {
        break label637;
      }
      int i = this.mContext.getResources().getDimensionPixelSize(R.f.aTi);
      m.a(this.mContext, this.kBN, this.kmJ.aiK().tFe, i, R.g.aXk, l.uk(this.kmJ.aiK().hbA));
      localObject = new StringBuilder();
      localStringBuilder = new StringBuilder();
      if ((this.kmJ.aiK().tEW == null) || (this.kmJ.aiK().tEW.size() < 2)) {
        break label665;
      }
      w.i("MicroMsg.CardWidgetTicket", "primary_fields length is >= 2");
      localnc1 = (nc)this.kmJ.aiK().tEW.get(0);
      nc localnc2 = (nc)this.kmJ.aiK().tEW.get(1);
      ((StringBuilder)localObject).append(localnc1.title).append(" - ").append(localnc2.title);
      if ((!TextUtils.isEmpty(localnc1.knt)) && (!TextUtils.isEmpty(localnc2.knt)))
      {
        localStringBuilder.append(localnc1.knt).append(" ").append(localnc1.kns);
        localStringBuilder.append(" - ");
        localStringBuilder.append(localnc2.knt).append(" ").append(localnc2.kns);
      }
      label410:
      if (TextUtils.isEmpty(((StringBuilder)localObject).toString())) {
        break label751;
      }
      this.kBO.setText(((StringBuilder)localObject).toString());
      label431:
      if (TextUtils.isEmpty(localStringBuilder.toString())) {
        break label764;
      }
      w.i("MicroMsg.CardWidgetTicket", "sub_title_builder is not empty!");
      this.kBP.setText(localStringBuilder.toString());
      this.kBP.setVisibility(0);
      label467:
      w.e("MicroMsg.CardWidgetTicket", "updateShopView(), shop_count:" + this.kmJ.aiK().tFa);
      if (this.kmJ.aiK().tFa > 0) {
        break label832;
      }
      this.kBQ.setVisibility(8);
      this.kBU.setVisibility(8);
    }
    for (;;)
    {
      if (!this.kmJ.aiJ()) {
        break label1214;
      }
      this.kBM.setVisibility(8);
      GMTrace.o(4887404347392L, 36414);
      return;
      if (!TextUtils.isEmpty(this.kmJ.aiK().koD))
      {
        this.kBk.setText(this.kmJ.aiK().koD);
        break;
      }
      this.kBk.setText("");
      break;
      label615:
      this.iiM.setText("");
      this.iiM.setVisibility(8);
      break label132;
      label637:
      m.a(this.kBN, R.g.aXk, l.uk(this.kmJ.aiK().hbA));
      break label213;
      label665:
      if ((this.kmJ.aiK().tEW == null) || (this.kmJ.aiK().tEW.size() != 1)) {
        break label410;
      }
      w.i("MicroMsg.CardWidgetTicket", "primary_fields length is == 1");
      localnc1 = (nc)this.kmJ.aiK().tEW.get(0);
      ((StringBuilder)localObject).append(localnc1.title);
      localStringBuilder.append(localnc1.kns);
      break label410;
      label751:
      this.kBO.setText("");
      break label431;
      label764:
      if (!TextUtils.isEmpty(this.kmJ.aiK().tFm))
      {
        w.i("MicroMsg.CardWidgetTicket", "primary_sub_title is not empty!");
        this.kBP.setText(this.kmJ.aiK().tFm);
        this.kBP.setVisibility(0);
        break label467;
      }
      this.kBP.setVisibility(8);
      break label467;
      label832:
      this.kBQ.setVisibility(0);
      this.kBQ.setOnClickListener(this.iom);
      m.a(this.kBT, R.g.aXl, l.uk(this.kmJ.aiK().hbA));
      localStringBuilder = null;
      localObject = localStringBuilder;
      if (this.kmP != null)
      {
        localObject = localStringBuilder;
        if (this.kmP.size() > 0) {
          localObject = (ji)this.kmP.get(0);
        }
      }
      if ((this.kmJ.aiK().tFa == 1) && (localObject != null))
      {
        this.kBR.setText(((ji)localObject).name);
        this.kBS.setText(this.mContext.getString(R.l.dGv, new Object[] { l.d(this.mContext, ((ji)localObject).tEK), ((ji)localObject).hwK }));
        this.kBU.setVisibility(8);
        this.kBQ.setTag(((ji)localObject).name);
      }
      else if ((this.kmJ.aiK().tFa > 1) && (localObject != null))
      {
        this.kBR.setText(((ji)localObject).name);
        this.kBS.setText(this.mContext.getString(R.l.dGv, new Object[] { l.d(this.mContext, ((ji)localObject).tEK), ((ji)localObject).hwK }));
        this.kBU.setVisibility(0);
        this.kBU.setOnClickListener(this.iom);
        this.kBQ.setTag(((ji)localObject).name);
      }
      else if (this.kmJ.aiK().tFa > 0)
      {
        this.kBR.setText(R.l.dEP);
        this.kBS.setText(this.mContext.getString(R.l.dGP, new Object[] { Integer.valueOf(this.kmJ.aiK().tFa) }));
        this.kBU.setVisibility(8);
        this.kBU.setOnClickListener(null);
        this.kBQ.setTag(this.mContext.getString(R.l.dEP));
      }
    }
    label1214:
    this.kBM.setVisibility(0);
    GMTrace.o(4887404347392L, 36414);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */