package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;

public final class w
  extends i
{
  private View kAn;
  private View kAo;
  
  public w()
  {
    GMTrace.i(4993704787968L, 37206);
    GMTrace.o(4993704787968L, 37206);
  }
  
  public final void MH()
  {
    GMTrace.i(4993839005696L, 37207);
    GMTrace.o(4993839005696L, 37207);
  }
  
  public final void amb()
  {
    GMTrace.i(4994107441152L, 37209);
    if (this.kAn != null) {
      this.kAn.setVisibility(8);
    }
    if (this.kAo != null) {
      this.kAo.setVisibility(8);
    }
    GMTrace.o(4994107441152L, 37209);
  }
  
  public final void update()
  {
    GMTrace.i(4993973223424L, 37208);
    b localb = this.kzR.akL();
    g localg = this.kzR.akQ();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i;
    if ((localb.aiL().tEu != null) && (localb.aiL().tEu.size() > 1))
    {
      if (this.kAn == null) {
        this.kAn = ((ViewStub)findViewById(R.h.bqX)).inflate();
      }
      if (this.kAo != null) {
        this.kAo.setVisibility(8);
      }
      localObject1 = this.kzR.akO();
      localObject2 = this.kAn;
      localObject3 = this.kzR.akP();
      LinkedList localLinkedList = localb.aiL().tEu;
      int j = l.uk(localb.aiK().hbA);
      ((ViewGroup)localObject2).removeAllViews();
      Iterator localIterator = localLinkedList.iterator();
      label368:
      while (localIterator.hasNext())
      {
        Object localObject4 = (nc)localIterator.next();
        View localView = v.fa((Context)localObject1).inflate(R.i.cOB, (ViewGroup)localObject2, false);
        localView.setId(R.h.bqY);
        localView.setTag(Integer.valueOf(localLinkedList.indexOf(localObject4)));
        localView.setOnClickListener((View.OnClickListener)localObject3);
        if (TextUtils.isEmpty(((nc)localObject4).url)) {
          localView.setEnabled(false);
        }
        ((TextView)localView.findViewById(R.h.cua)).setText(((nc)localObject4).title);
        TextView localTextView = (TextView)localView.findViewById(R.h.ctX);
        localTextView.setText(((nc)localObject4).kns);
        localTextView.setTextColor(j);
        ((ViewGroup)localObject2).addView(localView);
        if (localLinkedList.indexOf(localObject4) + 1 != localLinkedList.size()) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label368;
          }
          localObject4 = v.fa((Context)localObject1).inflate(R.i.cOC, (ViewGroup)localObject2, false);
          ((ViewGroup)localObject2).addView((View)localObject4);
          break;
        }
      }
      if ((localb.air()) && (localb.aiL().tEB != null) && (!TextUtils.isEmpty(localb.aiL().tEB.title))) {
        this.kAn.setBackgroundResource(R.g.baH);
      }
      if ((!localb.air()) && (localg.alO()))
      {
        this.kAn.setBackgroundResource(R.g.baH);
        GMTrace.o(4993973223424L, 37208);
      }
    }
    else if ((localb.aiL().tEu != null) && (localb.aiL().tEu.size() == 1))
    {
      if (this.kAo == null) {
        this.kAo = ((ViewStub)findViewById(R.h.bqW)).inflate();
      }
      if (this.kAn != null) {
        this.kAn.setVisibility(8);
      }
      localObject1 = this.kAo;
      localObject2 = this.kzR.akP();
      localObject3 = localb.aiL().tEu;
      if (((LinkedList)localObject3).size() == 1)
      {
        ((View)localObject1).findViewById(R.h.bqZ).setVisibility(0);
        localObject3 = (nc)((LinkedList)localObject3).get(0);
        ((TextView)((View)localObject1).findViewById(R.h.cub)).setText(((nc)localObject3).title);
        ((TextView)((View)localObject1).findViewById(R.h.ctY)).setText(((nc)localObject3).kns);
        i = l.uk(localb.aiK().hbA);
        ((TextView)((View)localObject1).findViewById(R.h.ctY)).setTextColor(i);
        ((View)localObject1).findViewById(R.h.bqZ).setOnClickListener((View.OnClickListener)localObject2);
        if (TextUtils.isEmpty(((nc)localObject3).url)) {
          ((View)localObject1).findViewById(R.h.bqZ).setEnabled(false);
        }
      }
      if ((localb.air()) && (localb.aiL().tEB != null) && (!TextUtils.isEmpty(localb.aiL().tEB.title))) {
        this.kAo.setBackgroundResource(R.g.baH);
      }
      if ((!localb.air()) && (localg.alO()))
      {
        this.kAo.setBackgroundResource(R.g.baH);
        GMTrace.o(4993973223424L, 37208);
      }
    }
    else
    {
      if (this.kAn != null) {
        this.kAn.setVisibility(8);
      }
      if (this.kAo != null) {
        this.kAo.setVisibility(8);
      }
    }
    GMTrace.o(4993973223424L, 37208);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */