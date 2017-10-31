package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.pb.common.c.h;
import java.util.LinkedList;

public final class k
  implements com.tencent.mm.plugin.card.base.c
{
  private BaseAdapter ksR;
  private int ksV;
  protected LinkedList<CardTagTextView> ksZ;
  private int kyT;
  int kyU;
  int kyV;
  private Context mContext;
  
  public k(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    GMTrace.i(5030883098624L, 37483);
    this.ksZ = new LinkedList();
    this.mContext = paramContext;
    this.ksR = paramBaseAdapter;
    this.kyT = this.mContext.getResources().getDimensionPixelSize(R.f.aSu);
    this.ksV = this.mContext.getResources().getDimensionPixelSize(R.f.aRY);
    this.kyU = this.mContext.getResources().getDimensionPixelOffset(R.f.aSS);
    this.kyV = this.mContext.getResources().getDimensionPixelOffset(R.f.aST);
    GMTrace.o(5030883098624L, 37483);
  }
  
  public final View a(int paramInt, View paramView, b paramb)
  {
    GMTrace.i(5031151534080L, 37485);
    View localView;
    a locala;
    Object localObject2;
    label326:
    int i;
    if (paramView == null)
    {
      localView = View.inflate(this.mContext, R.i.cOp, null);
      locala = new a();
      locala.ktd = ((RelativeLayout)localView.findViewById(R.h.bpq));
      locala.kte = ((ImageView)localView.findViewById(R.h.bqf));
      locala.kyk = localView.findViewById(R.h.brv);
      locala.kyl = ((ImageView)localView.findViewById(R.h.bru));
      locala.ktf = ((TextView)localView.findViewById(R.h.boW));
      locala.ktg = ((TextView)localView.findViewById(R.h.bqz));
      locala.ktj = ((TextView)localView.findViewById(R.h.bqB));
      locala.kyW = ((ImageView)localView.findViewById(R.h.boK));
      locala.kyY = ((ImageView)localView.findViewById(R.h.boR));
      locala.kyZ = ((ImageView)localView.findViewById(R.h.boT));
      locala.kza = ((ImageView)localView.findViewById(R.h.boS));
      locala.kyX = ((LinearLayout)localView.findViewById(R.h.bqU));
      localView.setTag(locala);
      if (!(this.ksR.getItem(paramInt) instanceof CardInfo)) {
        break label642;
      }
      localObject2 = (CardInfo)this.ksR.getItem(paramInt);
      if (((CardInfo)localObject2).field_stickyIndex % 10 == 0) {
        break label452;
      }
      if (((CardInfo)localObject2).field_stickyIndex <= 0) {
        break label1574;
      }
      paramView = this.mContext;
      switch (((CardInfo)localObject2).field_stickyIndex % 10)
      {
      default: 
        paramView = null;
        i = 1;
      }
    }
    for (;;)
    {
      label329:
      Object localObject1;
      if (i != 0)
      {
        i = 0;
        for (;;)
        {
          if (i < locala.kyX.getChildCount())
          {
            localObject1 = (CardTagTextView)locala.kyX.getChildAt(i);
            this.ksZ.add(localObject1);
            i += 1;
            continue;
            locala = (a)paramView.getTag();
            localView = paramView;
            break;
            paramView = paramView.getString(R.l.dGH);
            break label326;
            paramView = paramView.getString(R.l.dGI);
            break label326;
            paramView = paramView.getString(R.l.dGJ);
            break label326;
            paramView = paramView.getString(R.l.dGK);
            break label326;
            paramView = ((CardInfo)localObject2).field_label_wording;
            break label326;
            label452:
            if (h.xJ(((CardInfo)localObject2).field_label_wording)) {
              break label1574;
            }
            paramView = ((CardInfo)localObject2).field_label_wording;
            i = 1;
            break label329;
          }
        }
        locala.kyX.removeAllViews();
        locala.kyX.setVisibility(0);
        if (this.ksZ.size() == 0)
        {
          localObject1 = new CardTagTextView(this.mContext);
          ((CardTagTextView)localObject1).setPadding(this.ksV, this.kyT, this.ksV, this.kyT);
          ((CardTagTextView)localObject1).setGravity(17);
          ((CardTagTextView)localObject1).setMinWidth(this.mContext.getResources().getDimensionPixelSize(R.f.aSV));
          ((CardTagTextView)localObject1).setMinHeight(this.mContext.getResources().getDimensionPixelSize(R.f.aSU));
          if (!((CardInfo)localObject2).air()) {
            break label1059;
          }
          ((CardTagTextView)localObject1).setTextColor(com.tencent.mm.bq.a.c(this.mContext, R.e.white));
          ((CardTagTextView)localObject1).fillColor = com.tencent.mm.bq.a.c(this.mContext, R.e.aNQ);
          label617:
          ((CardTagTextView)localObject1).setText(paramView);
          ((CardTagTextView)localObject1).setTextSize(1, 10.0F);
          locala.kyX.addView((View)localObject1);
          label642:
          if (!paramb.aiw()) {
            break label1435;
          }
          locala.kte.setVisibility(0);
          locala.ktg.setVisibility(0);
          locala.ktj.setVisibility(8);
          locala.ktf.setVisibility(0);
          locala.ktf.setText(paramb.aiK().koD);
          locala.ktg.setText(paramb.aiK().title);
          if (!paramb.ait()) {
            break label1118;
          }
          locala.kyk.setVisibility(0);
          locala.kte.setVisibility(4);
          paramView = locala.kyl;
          if (TextUtils.isEmpty(paramb.aiK().tFe)) {
            break label1096;
          }
          i = this.mContext.getResources().getDimensionPixelSize(R.f.aSW);
          com.tencent.mm.plugin.card.b.m.a(this.mContext, paramView, paramb.aiK().tFe, i, R.g.aXk, l.uk(paramb.aiK().hbA));
          label819:
          if (!paramb.air()) {
            break label1339;
          }
          if (!bg.mZ(paramb.aiL().tEE)) {
            break label1178;
          }
          paramView = l.bM(l.uk(paramb.aiK().hbA), this.kyU);
          locala.ktd.setBackgroundDrawable(paramView);
          locala.kyY.setVisibility(8);
          locala.kyZ.setVisibility(8);
          locala.kza.setVisibility(0);
          label901:
          locala.ktf.setTextColor(this.mContext.getResources().getColor(R.e.white));
          locala.ktg.setTextColor(this.mContext.getResources().getColor(R.e.white));
          label943:
          i = paramb.aiK().knq;
          if ((paramInt != this.ksR.getCount() - 1) || (locala.ktd == null)) {
            break label1538;
          }
          paramView = (LinearLayout.LayoutParams)locala.ktd.getLayoutParams();
          if (paramView.bottomMargin != this.mContext.getResources().getDimensionPixelOffset(R.f.aRW))
          {
            paramView.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aRW);
            locala.ktd.setLayoutParams(paramView);
          }
        }
      }
      for (;;)
      {
        GMTrace.o(5031151534080L, 37485);
        return localView;
        localObject1 = (CardTagTextView)this.ksZ.removeFirst();
        break;
        label1059:
        ((CardTagTextView)localObject1).setTextColor(com.tencent.mm.bq.a.c(this.mContext, R.e.aOU));
        ((CardTagTextView)localObject1).fillColor = 0;
        break label617;
        locala.kyX.setVisibility(8);
        break label642;
        label1096:
        com.tencent.mm.plugin.card.b.m.a(paramView, R.g.aXk, l.uk(paramb.aiK().hbA));
        break label819;
        label1118:
        locala.kyk.setVisibility(8);
        locala.kte.setVisibility(0);
        i = this.mContext.getResources().getDimensionPixelSize(R.f.aSW);
        com.tencent.mm.plugin.card.b.m.a(locala.kte, paramb.aiK().knr, i, R.g.baR, true);
        break label819;
        label1178:
        locala.ktd.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.g.aXc));
        locala.kyY.setVisibility(0);
        locala.kyZ.setVisibility(0);
        paramView = locala.kyY;
        localObject1 = paramb.aiL().tEE;
        localObject2 = new c.a();
        ((c.a)localObject2).hCS = e.gZT;
        n.Jb();
        ((c.a)localObject2).hDk = null;
        ((c.a)localObject2).hCR = com.tencent.mm.plugin.card.model.m.tG((String)localObject1);
        ((c.a)localObject2).hCP = true;
        ((c.a)localObject2).hDo = true;
        ((c.a)localObject2).hCN = true;
        ((c.a)localObject2).hDe = R.g.aXc;
        localObject2 = ((c.a)localObject2).Jk();
        n.Ja().a((String)localObject1, paramView, (com.tencent.mm.an.a.a.c)localObject2);
        paramView.setImageMatrix(new Matrix());
        locala.kza.setVisibility(8);
        break label901;
        label1339:
        locala.kza.setVisibility(8);
        locala.kyY.setVisibility(8);
        locala.kyZ.setVisibility(8);
        locala.ktd.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.g.aXc));
        locala.ktg.setTextColor(this.mContext.getResources().getColor(R.e.aNK));
        locala.ktf.setTextColor(this.mContext.getResources().getColor(R.e.aNK));
        break label943;
        label1435:
        locala.kte.setVisibility(8);
        locala.ktg.setVisibility(8);
        locala.ktf.setVisibility(8);
        locala.kyX.setVisibility(8);
        locala.ktj.setVisibility(0);
        paramView = l.bM(this.mContext.getResources().getColor(R.e.aNP), this.kyU);
        locala.ktd.setBackgroundDrawable(paramView);
        locala.ktj.setText(this.mContext.getResources().getString(R.l.dFU));
        break label943;
        label1538:
        paramView = (LinearLayout.LayoutParams)locala.ktd.getLayoutParams();
        if (paramView.bottomMargin != 0)
        {
          paramView.bottomMargin = 0;
          locala.ktd.setLayoutParams(paramView);
        }
      }
      label1574:
      paramView = null;
      i = 0;
    }
  }
  
  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5031554187264L, 37488);
    paramView = (a)paramView.getTag();
    paramView.kyW.setTag(Integer.valueOf(paramInt));
    paramView.kyW.setOnClickListener(paramOnClickListener);
    GMTrace.o(5031554187264L, 37488);
  }
  
  public final void release()
  {
    GMTrace.i(5031017316352L, 37484);
    this.mContext = null;
    this.ksR = null;
    if (this.ksZ != null) {
      this.ksZ.clear();
    }
    GMTrace.o(5031017316352L, 37484);
  }
  
  public final void t(View paramView, int paramInt)
  {
    GMTrace.i(5031285751808L, 37486);
    ((a)paramView.getTag()).kyW.setImageResource(paramInt);
    GMTrace.o(5031285751808L, 37486);
  }
  
  public final void u(View paramView, int paramInt)
  {
    GMTrace.i(5031419969536L, 37487);
    ((a)paramView.getTag()).kyW.setVisibility(paramInt);
    GMTrace.o(5031419969536L, 37487);
  }
  
  public final class a
  {
    public RelativeLayout ktd;
    public ImageView kte;
    public TextView ktf;
    public TextView ktg;
    public TextView ktj;
    public ImageView kyW;
    public LinearLayout kyX;
    public ImageView kyY;
    public ImageView kyZ;
    public View kyk;
    public ImageView kyl;
    public ImageView kza;
    
    public a()
    {
      GMTrace.i(4959076614144L, 36948);
      GMTrace.o(4959076614144L, 36948);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */