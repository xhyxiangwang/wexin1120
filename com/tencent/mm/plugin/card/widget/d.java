package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class d
  extends a
{
  private TextView kBA;
  private View kBB;
  private View kBC;
  private View kBD;
  private View kBv;
  private TextView kBw;
  private TextView kBx;
  private View kBy;
  private TextView kBz;
  
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4883377815552L, 36384);
    GMTrace.o(4883377815552L, 36384);
  }
  
  protected final void amt()
  {
    GMTrace.i(4883512033280L, 36385);
    this.kBv = this.kBi.findViewById(R.h.ciS);
    this.kBw = ((TextView)this.kBi.findViewById(R.h.ciU));
    this.kBx = ((TextView)this.kBi.findViewById(R.h.ciT));
    this.kBy = this.kBi.findViewById(R.h.blx);
    this.kBz = ((TextView)this.kBi.findViewById(R.h.blz));
    this.kBA = ((TextView)this.kBi.findViewById(R.h.bly));
    this.kBC = this.kBi.findViewById(R.h.brz);
    this.kBD = this.kBi.findViewById(R.h.boV);
    GMTrace.o(4883512033280L, 36385);
  }
  
  protected final void amu()
  {
    GMTrace.i(4883646251008L, 36386);
    Object localObject3;
    Object localObject2;
    Object localObject1;
    if ((this.kmJ.aiK().tEW != null) && (this.kmJ.aiK().tEW.size() > 0))
    {
      localObject3 = this.kmJ.aiK().tEW;
      localObject2 = null;
      if (((LinkedList)localObject3).size() == 1)
      {
        localObject1 = (nc)((LinkedList)localObject3).get(0);
        if (localObject1 != null)
        {
          this.kBv.setVisibility(0);
          this.kBw.setText(((nc)localObject1).title);
          this.kBx.setText(((nc)localObject1).kns);
          if (!TextUtils.isEmpty(((nc)localObject1).tFY)) {
            this.kBw.setTextColor(l.uk(((nc)localObject1).tFY));
          }
          if (!TextUtils.isEmpty(((nc)localObject1).tFZ)) {
            this.kBx.setTextColor(l.uk(((nc)localObject1).tFZ));
          }
        }
        if (localObject2 != null)
        {
          this.kBy.setVisibility(0);
          this.kBz.setText(((nc)localObject2).title);
          this.kBA.setText(((nc)localObject2).kns);
          if (!TextUtils.isEmpty(((nc)localObject2).tFY)) {
            this.kBz.setTextColor(l.uk(((nc)localObject2).tFY));
          }
          if (!TextUtils.isEmpty(((nc)localObject2).tFZ)) {
            this.kBA.setTextColor(l.uk(((nc)localObject2).tFZ));
          }
        }
        label237:
        if ((!this.kmJ.aip()) || (this.kmJ.aiv())) {
          break label364;
        }
        w.i("MicroMsg.CardWidgetInvoice", "is not invoice, don't updateCardSecondaryFieldListView");
        label268:
        if (!this.kmJ.aiG()) {
          break label892;
        }
        this.kBC.setVisibility(8);
      }
    }
    for (;;)
    {
      if ((this.kmJ.aiL().tED != null) || (!this.kmJ.aiG())) {
        break label970;
      }
      this.kBD.setVisibility(0);
      GMTrace.o(4883646251008L, 36386);
      return;
      localObject1 = (nc)((LinkedList)localObject3).get(0);
      localObject2 = (nc)((LinkedList)localObject3).get(1);
      break;
      w.i("MicroMsg.CardWidgetInvoice", "primary_fields is null");
      break label237;
      label364:
      if ((this.kmJ.aiL().tEu != null) && (this.kmJ.aiL().tEu.size() > 0))
      {
        if (this.kBB == null) {
          this.kBB = ((ViewStub)this.kBi.findViewById(R.h.bqV)).inflate();
        }
        this.kBi.findViewById(R.h.boV).setVisibility(8);
        localObject1 = this.kBB;
        localObject3 = this.kmJ;
        localObject2 = this.iom;
        localObject3 = ((b)localObject3).aiL().tEu;
        if (((LinkedList)localObject3).size() == 1)
        {
          ((View)localObject1).findViewById(R.h.bqZ).setVisibility(0);
          localObject3 = (nc)((LinkedList)localObject3).get(0);
          ((TextView)((View)localObject1).findViewById(R.h.cub)).setText(((nc)localObject3).title);
          ((TextView)((View)localObject1).findViewById(R.h.ctY)).setText(((nc)localObject3).kns);
          ((View)localObject1).findViewById(R.h.bqZ).setOnClickListener((View.OnClickListener)localObject2);
          if (!TextUtils.isEmpty(((nc)localObject3).tFY)) {
            ((TextView)((View)localObject1).findViewById(R.h.cub)).setTextColor(l.uk(((nc)localObject3).tFY));
          }
          if (!TextUtils.isEmpty(((nc)localObject3).tFZ)) {
            ((TextView)((View)localObject1).findViewById(R.h.ctY)).setTextColor(l.uk(((nc)localObject3).tFZ));
          }
          ((View)localObject1).findViewById(R.h.bra).setVisibility(8);
          break label268;
        }
        if (((LinkedList)localObject3).size() < 2) {
          break label268;
        }
        nc localnc = (nc)((LinkedList)localObject3).get(0);
        ((TextView)((View)localObject1).findViewById(R.h.cub)).setText(localnc.title);
        ((TextView)((View)localObject1).findViewById(R.h.ctY)).setText(localnc.kns);
        if (!TextUtils.isEmpty(localnc.tFY)) {
          ((TextView)((View)localObject1).findViewById(R.h.cub)).setTextColor(l.uk(localnc.tFY));
        }
        if (!TextUtils.isEmpty(localnc.tFZ)) {
          ((TextView)((View)localObject1).findViewById(R.h.ctY)).setTextColor(l.uk(localnc.tFZ));
        }
        localObject3 = (nc)((LinkedList)localObject3).get(1);
        ((TextView)((View)localObject1).findViewById(R.h.cuc)).setText(((nc)localObject3).title);
        ((TextView)((View)localObject1).findViewById(R.h.ctZ)).setText(((nc)localObject3).kns);
        if (!TextUtils.isEmpty(((nc)localObject3).tFY)) {
          ((TextView)((View)localObject1).findViewById(R.h.cuc)).setTextColor(l.uk(((nc)localObject3).tFY));
        }
        if (!TextUtils.isEmpty(((nc)localObject3).tFZ)) {
          ((TextView)((View)localObject1).findViewById(R.h.ctZ)).setTextColor(l.uk(((nc)localObject3).tFZ));
        }
        ((View)localObject1).findViewById(R.h.bqZ).setOnClickListener((View.OnClickListener)localObject2);
        ((View)localObject1).findViewById(R.h.bra).setOnClickListener((View.OnClickListener)localObject2);
        break label268;
      }
      if (this.kBB != null) {
        this.kBB.setVisibility(8);
      }
      this.kBi.findViewById(R.h.boV).setVisibility(8);
      break label268;
      label892:
      this.kBC.setVisibility(0);
      localObject1 = (TextView)this.kBC.findViewById(R.h.bri);
      if (!TextUtils.isEmpty(this.kmJ.aiK().tFu)) {
        ((TextView)localObject1).setText(this.kmJ.aiK().tFu);
      } else {
        m.b((TextView)localObject1, this.kmJ.aiL().status);
      }
    }
    label970:
    this.kBD.setVisibility(8);
    GMTrace.o(4883646251008L, 36386);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */