package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.c;
import com.tencent.mm.plugin.card.widget.CardTagTextView;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.bgn;
import com.tencent.mm.protocal.c.bkr;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
  implements c
{
  private BaseAdapter ksR;
  private long ksS;
  private long ksT;
  private int ksU;
  private int ksV;
  private ArrayList<Integer> ksW;
  private ArrayList<String> ksX;
  private ArrayList<String> ksY;
  protected LinkedList<CardTagTextView> ksZ;
  private Context mContext;
  
  public j(Context paramContext, BaseAdapter paramBaseAdapter)
  {
    GMTrace.i(5077859303424L, 37833);
    this.ksS = 0L;
    this.ksT = 0L;
    this.ksW = new ArrayList();
    this.ksX = new ArrayList();
    this.ksY = new ArrayList();
    this.ksZ = new LinkedList();
    this.mContext = paramContext;
    this.ksR = paramBaseAdapter;
    this.ksU = this.mContext.getResources().getDimensionPixelSize(R.f.aSi);
    this.ksV = this.mContext.getResources().getDimensionPixelSize(R.f.aRY);
    this.ksW.clear();
    this.ksX.clear();
    this.ksY.clear();
    GMTrace.o(5077859303424L, 37833);
  }
  
  private CardTagTextView aks()
  {
    GMTrace.i(5078664609792L, 37839);
    if (this.ksZ.size() == 0)
    {
      localCardTagTextView = new CardTagTextView(this.mContext);
      GMTrace.o(5078664609792L, 37839);
      return localCardTagTextView;
    }
    CardTagTextView localCardTagTextView = (CardTagTextView)this.ksZ.removeFirst();
    GMTrace.o(5078664609792L, 37839);
    return localCardTagTextView;
  }
  
  public final View a(int paramInt, View paramView, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5078127738880L, 37835);
    long l = System.currentTimeMillis();
    a locala;
    Object localObject1;
    int j;
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, R.i.brd, null);
      locala = new a();
      locala.kta = ((LinearLayout)paramView.findViewById(R.h.brl));
      locala.ktb = ((TextView)paramView.findViewById(R.h.bqj));
      locala.ktc = ((TextView)paramView.findViewById(R.h.bqk));
      locala.ktd = ((RelativeLayout)paramView.findViewById(R.h.bpq));
      locala.kte = ((ImageView)paramView.findViewById(R.h.bqf));
      locala.ktf = ((TextView)paramView.findViewById(R.h.boW));
      locala.ktg = ((TextView)paramView.findViewById(R.h.bqz));
      locala.ktk = paramView.findViewById(R.h.bql);
      locala.kth = ((TextView)paramView.findViewById(R.h.subtitle));
      locala.kti = ((TextView)paramView.findViewById(R.h.boM));
      locala.ktj = ((TextView)paramView.findViewById(R.h.bqB));
      locala.ktl = ((TextView)paramView.findViewById(R.h.bps));
      locala.kth.setEllipsize(TextUtils.TruncateAt.MIDDLE);
      paramView.setTag(locala);
      localObject1 = (com.tencent.mm.plugin.card.base.b)this.ksR.getItem(paramInt);
      j = ((com.tencent.mm.plugin.card.base.b)localObject1).aiT();
      if (!com.tencent.mm.plugin.card.sharecard.a.b.ly(((com.tencent.mm.plugin.card.base.b)localObject1).aiT())) {
        break label1820;
      }
      if (paramInt != 0) {
        break label853;
      }
      if (TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).ls(j))) {
        break label1820;
      }
      i = 1;
    }
    for (;;)
    {
      label290:
      if (i != 0)
      {
        locala.ktb.setVisibility(0);
        locala.ktb.setText(((com.tencent.mm.plugin.card.base.b)localObject1).ls(j));
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject1).aiS()))
        {
          locala.ktc.setVisibility(0);
          locala.ktc.setText(((com.tencent.mm.plugin.card.base.b)localObject1).aiS());
          label358:
          if (!paramb.aiw()) {
            break label1659;
          }
          locala.kte.setVisibility(0);
          locala.ktf.setVisibility(0);
          locala.kta.setVisibility(0);
          locala.ktg.setVisibility(0);
          locala.ktl.setVisibility(0);
          locala.ktk.setVisibility(0);
          locala.kth.setVisibility(0);
          locala.kti.setVisibility(0);
          locala.ktj.setVisibility(8);
          locala.ktf.setText(paramb.aiK().koD);
          if (!paramb.ait()) {
            break label1041;
          }
          if ((paramb.aiK().tEW == null) || (paramb.aiK().tEW.size() != 1)) {
            break label929;
          }
          locala.ktg.setText(((nc)paramb.aiK().tEW.get(0)).title);
          label530:
          i = this.mContext.getResources().getDimensionPixelSize(R.f.aSW);
          m.a(locala.kte, paramb.aiK().knr, i, R.g.baR, true);
          locala.ktf.setTextColor(this.mContext.getResources().getColor(R.e.aNK));
          localObject1 = com.tencent.mm.plugin.card.sharecard.a.b.tI(paramb.aiP());
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            break label1061;
          }
          locala.kti.setText((CharSequence)localObject1);
          label618:
          localObject1 = com.tencent.mm.plugin.card.sharecard.a.b.iR(paramb.aiP());
          boolean bool = com.tencent.mm.plugin.card.sharecard.a.b.ly(paramb.aiT());
          if ((TextUtils.isEmpty((CharSequence)localObject1)) || (!bool)) {
            break label1075;
          }
          locala.kth.setText(h.c(this.mContext, (CharSequence)localObject1, this.mContext.getResources().getDimensionPixelOffset(R.f.aSt)));
          label683:
          i = com.tencent.mm.plugin.card.sharecard.a.b.tJ(paramb.aiP());
          if ((i <= 1) || (!bool)) {
            break label1191;
          }
          locala.ktl.setText("X" + i);
          locala.ktl.setVisibility(0);
        }
      }
      label740:
      label853:
      label929:
      label1041:
      label1061:
      label1075:
      label1191:
      Object localObject2;
      for (;;)
      {
        if (((paramb.aiK().tFp != null) && (!bg.bX(paramb.aiK().tFp.uAR))) || (com.tencent.mm.plugin.card.sharecard.a.b.tL(paramb.aiP())))
        {
          locala.kta.setVisibility(0);
          i = 0;
          for (;;)
          {
            if (i < locala.kta.getChildCount())
            {
              localObject1 = (CardTagTextView)locala.kta.getChildAt(i);
              this.ksZ.add(localObject1);
              i += 1;
              continue;
              locala = (a)paramView.getTag();
              break;
              if (j == ((com.tencent.mm.plugin.card.base.b)this.ksR.getItem(paramInt - 1)).aiT()) {
                break label1820;
              }
              i = 1;
              break label290;
              locala.ktc.setVisibility(8);
              break label358;
              locala.ktb.setVisibility(8);
              locala.ktc.setVisibility(8);
              locala.ktb.setText("");
              break label358;
              if ((paramb.aiK().tEW == null) || (paramb.aiK().tEW.size() != 2)) {
                break label530;
              }
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append(((nc)paramb.aiK().tEW.get(0)).title);
              ((StringBuilder)localObject1).append("-");
              ((StringBuilder)localObject1).append(((nc)paramb.aiK().tEW.get(1)).title);
              locala.ktg.setText(((StringBuilder)localObject1).toString());
              break label530;
              locala.ktg.setText(paramb.aiK().title);
              break label530;
              locala.kti.setText("");
              break label618;
              if (!TextUtils.isEmpty(paramb.aiQ()))
              {
                localObject1 = l.un(paramb.aiQ());
                if (!TextUtils.isEmpty((CharSequence)localObject1))
                {
                  localObject1 = this.mContext.getResources().getString(R.l.dGj, new Object[] { localObject1 });
                  locala.kth.setText(h.c(this.mContext, (CharSequence)localObject1, this.mContext.getResources().getDimensionPixelOffset(R.f.aSt)));
                  break label683;
                }
                locala.kth.setText("");
                break label683;
              }
              locala.kth.setText("");
              break label683;
              locala.ktl.setVisibility(8);
              break label740;
            }
          }
          locala.kta.removeAllViews();
          if (com.tencent.mm.plugin.card.sharecard.a.b.tL(paramb.aiP()))
          {
            localObject1 = aks();
            ((CardTagTextView)localObject1).setPadding(this.ksV, this.ksU, this.ksV, this.ksU);
            ((CardTagTextView)localObject1).setTextColor(this.mContext.getResources().getColor(R.e.aPW));
            ((CardTagTextView)localObject1).setText(this.mContext.getString(R.l.dGr));
            ((CardTagTextView)localObject1).setTextSize(12.0F);
            localObject2 = new LinearLayout.LayoutParams(-2, -2);
            ((LinearLayout.LayoutParams)localObject2).rightMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aRW);
            locala.kta.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
          }
          if ((paramb.aiK().tFp == null) || (bg.bX(paramb.aiK().tFp.uAR))) {
            break label1485;
          }
          localObject1 = paramb.aiK().tFp.uAR.iterator();
        }
      }
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (bgn)((Iterator)localObject1).next();
        CardTagTextView localCardTagTextView = aks();
        localCardTagTextView.setPadding(this.ksV, this.ksU, this.ksV, this.ksU);
        localCardTagTextView.setTextColor(l.uk(((bgn)localObject2).hbA));
        localCardTagTextView.setText(((bgn)localObject2).tag);
        localCardTagTextView.setTextSize(12.0F);
        locala.kta.addView(localCardTagTextView);
        continue;
        locala.kta.setVisibility(8);
      }
      label1485:
      if ((paramInt == this.ksR.getCount() - 1) && (locala.ktd != null))
      {
        localObject1 = (LinearLayout.LayoutParams)locala.ktd.getLayoutParams();
        if (((LinearLayout.LayoutParams)localObject1).bottomMargin != this.mContext.getResources().getDimensionPixelOffset(R.f.aRW))
        {
          ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aRW);
          locala.ktd.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
      }
      for (;;)
      {
        this.ksS = (System.currentTimeMillis() - l + this.ksS);
        this.ksT += 1L;
        if (!this.ksX.contains(paramb.aiO()))
        {
          this.ksX.add(paramb.aiO());
          this.ksY.add(paramb.aiP());
          this.ksW.add(Integer.valueOf(paramInt));
        }
        GMTrace.o(5078127738880L, 37835);
        return paramView;
        label1659:
        locala.kte.setVisibility(8);
        locala.ktf.setVisibility(8);
        locala.kta.setVisibility(8);
        locala.ktg.setVisibility(8);
        locala.ktl.setVisibility(8);
        locala.ktk.setVisibility(8);
        locala.kth.setVisibility(8);
        locala.kti.setVisibility(8);
        locala.ktj.setVisibility(0);
        locala.ktj.setText(this.mContext.getResources().getString(R.l.dFU));
        break;
        if (locala.ktd != null)
        {
          localObject1 = (LinearLayout.LayoutParams)locala.ktd.getLayoutParams();
          if (((LinearLayout.LayoutParams)localObject1).bottomMargin != 0)
          {
            ((LinearLayout.LayoutParams)localObject1).bottomMargin = 0;
            locala.ktd.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
      }
      label1820:
      i = 0;
    }
  }
  
  public final void a(View paramView, int paramInt, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(5078530392064L, 37838);
    GMTrace.o(5078530392064L, 37838);
  }
  
  public final void release()
  {
    GMTrace.i(5077993521152L, 37834);
    this.mContext = null;
    this.ksR = null;
    if (this.ksT > 0L)
    {
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(5);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(6);
      localIDKey2.SetValue((int)(this.ksS / this.ksT));
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      g.paX.b(localArrayList, true);
    }
    if ((this.ksW.size() == this.ksX.size()) && (this.ksX.size() == this.ksY.size()) && (this.ksW.size() > 0))
    {
      long l = System.currentTimeMillis();
      int i = 0;
      while (i < this.ksW.size())
      {
        g.paX.i(13220, new Object[] { this.ksY.get(i), this.ksX.get(i), this.ksW.get(i), Long.valueOf(l) });
        i += 1;
      }
    }
    this.ksW.clear();
    this.ksX.clear();
    this.ksY.clear();
    if (this.ksZ != null) {
      this.ksZ.clear();
    }
    GMTrace.o(5077993521152L, 37834);
  }
  
  public final void t(View paramView, int paramInt)
  {
    GMTrace.i(5078261956608L, 37836);
    GMTrace.o(5078261956608L, 37836);
  }
  
  public final void u(View paramView, int paramInt)
  {
    GMTrace.i(5078396174336L, 37837);
    GMTrace.o(5078396174336L, 37837);
  }
  
  public final class a
  {
    public LinearLayout kta;
    public TextView ktb;
    public TextView ktc;
    public RelativeLayout ktd;
    public ImageView kte;
    public TextView ktf;
    public TextView ktg;
    public TextView kth;
    public TextView kti;
    public TextView ktj;
    public View ktk;
    public TextView ktl;
    
    public a()
    {
      GMTrace.i(5078798827520L, 37840);
      GMTrace.o(5078798827520L, 37840);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */