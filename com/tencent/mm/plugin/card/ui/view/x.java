package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.plugin.card.sharecard.model.r;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.e.d;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;

public final class x
  extends i
{
  MMActivity jFp;
  private boolean kAp;
  private View kAq;
  private View kAr;
  private ImageView kAs;
  private TextView kAt;
  private TextView kAu;
  private ImageView kAv;
  public View kAw;
  private LinearLayout kAx;
  private View.OnClickListener kAy;
  
  public x()
  {
    GMTrace.i(4991154651136L, 37187);
    this.kAp = false;
    this.kAy = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4999207714816L, 37247);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        Object localObject = x.this.kzR.akL();
        x.this.kzR.akN();
        paramAnonymousView = (r)paramAnonymousView.getTag();
        if (paramAnonymousView == null)
        {
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        if ((paramAnonymousView.krd == null) || (paramAnonymousView.krd.isEmpty()))
        {
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        if ((paramAnonymousView.krc != null) && (paramAnonymousView.krc.equals(((com.tencent.mm.plugin.card.base.b)localObject).aiQ())))
        {
          x.this.kAw.setVisibility(8);
          x.this.kzR.akd();
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        if ((TextUtils.isEmpty(paramAnonymousView.krc)) && (TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject).aiQ())))
        {
          x.this.kAw.setVisibility(8);
          x.this.kzR.akd();
          GMTrace.o(4999207714816L, 37247);
          return;
        }
        localObject = com.tencent.mm.plugin.card.sharecard.a.b.tK(paramAnonymousView.knp);
        int k;
        if ((localObject != null) && (((ArrayList)localObject).size() > 0))
        {
          int j = 0;
          int i = 0;
          k = i;
          if (j < ((ArrayList)localObject).size())
          {
            r localr = (r)((ArrayList)localObject).get(j);
            if (((localr.krc != null) && (localr.krc.equals(paramAnonymousView.krc))) || ((TextUtils.isEmpty(localr.krc)) && (TextUtils.isEmpty(paramAnonymousView.krc))))
            {
              localr.kre = true;
              if (!localr.krf)
              {
                localr.krf = true;
                i = 1;
              }
              ((ArrayList)localObject).set(j, localr);
            }
            for (;;)
            {
              j += 1;
              break;
              localr.kre = false;
              ((ArrayList)localObject).set(j, localr);
            }
          }
        }
        else
        {
          k = 0;
        }
        paramAnonymousView = (String)paramAnonymousView.krd.get(0);
        paramAnonymousView = al.ajK().tR(paramAnonymousView);
        if (paramAnonymousView != null) {
          x.this.kzR.d(paramAnonymousView);
        }
        if ((k != 0) && (x.this.kzR.akR() != null)) {
          x.this.kzR.akR().akE();
        }
        x.this.kAw.setVisibility(8);
        GMTrace.o(4999207714816L, 37247);
      }
    };
    GMTrace.o(4991154651136L, 37187);
  }
  
  public final void MH()
  {
    GMTrace.i(4991288868864L, 37188);
    this.kAq = findViewById(R.h.cxL);
    this.kAr = findViewById(R.h.cxM);
    this.kAs = ((ImageView)findViewById(R.h.cxF));
    this.kAt = ((TextView)findViewById(R.h.cxG));
    this.kAu = ((TextView)findViewById(R.h.cxI));
    this.kAv = ((ImageView)findViewById(R.h.cxH));
    this.kAq.setVisibility(8);
    this.kAw = findViewById(R.h.cxJ);
    this.kAx = ((LinearLayout)findViewById(R.h.cxK));
    this.kAw.setVisibility(8);
    this.jFp = this.kzR.akO();
    GMTrace.o(4991288868864L, 37188);
  }
  
  public final void amb()
  {
    GMTrace.i(4991557304320L, 37190);
    this.kAq.setVisibility(8);
    GMTrace.o(4991557304320L, 37190);
  }
  
  public final void update()
  {
    GMTrace.i(4991423086592L, 37189);
    Object localObject4 = this.kzR.akL();
    Object localObject3 = com.tencent.mm.plugin.card.sharecard.a.b.tK(((com.tencent.mm.plugin.card.base.b)localObject4).aiP());
    Object localObject1 = this.kzR.akQ();
    Object localObject2;
    Object localObject5;
    Object localObject6;
    label357:
    label445:
    label542:
    int i;
    if (((g)localObject1).alK())
    {
      this.kAq.setVisibility(0);
      if (com.tencent.mm.plugin.card.sharecard.a.b.tJ(((com.tencent.mm.plugin.card.base.b)localObject4).aiP()) > 1) {
        this.kAr.setOnClickListener(this.kzR.akP());
      }
      for (;;)
      {
        localObject4 = this.kzR.akL();
        if (!this.kzR.akM()) {
          break;
        }
        this.kAs.setVisibility(8);
        this.kAt.setVisibility(8);
        this.kAu.setVisibility(0);
        this.kAv.setImageResource(R.g.aXh);
        this.kAu.setText(this.jFp.getString(R.l.dGo));
        if (!this.kzR.akM()) {
          break label895;
        }
        this.kAw.setVisibility(0);
        if ((this.kAx.getChildCount() != 0) || (localObject3 == null)) {
          break label765;
        }
        localObject1 = (LayoutInflater)this.jFp.getSystemService("layout_inflater");
        localObject2 = ((ArrayList)localObject3).iterator();
        for (;;)
        {
          if (!((Iterator)localObject2).hasNext()) {
            break label744;
          }
          localObject3 = (r)((Iterator)localObject2).next();
          localObject4 = ((LayoutInflater)localObject1).inflate(R.i.dgu, this.kAx, false);
          Object localObject7 = (ImageView)((View)localObject4).findViewById(R.h.cDA);
          localObject5 = (TextView)((View)localObject4).findViewById(R.h.cDF);
          localObject6 = (TextView)((View)localObject4).findViewById(R.h.cxy);
          if (!TextUtils.isEmpty(((r)localObject3).krc))
          {
            a.b.a((ImageView)localObject7, ((r)localObject3).krc);
            localObject7 = l.un(((r)localObject3).krc);
            if (TextUtils.isEmpty((CharSequence)localObject7)) {
              break;
            }
            ((TextView)localObject5).setText(h.g(this.jFp, (CharSequence)localObject7, this.jFp.getResources().getDimensionPixelOffset(R.f.aSv)));
          }
          ((TextView)localObject6).setText("x " + ((r)localObject3).cxy);
          ((View)localObject4).setTag(localObject3);
          ((View)localObject4).setOnClickListener(this.kAy);
          localObject5 = (ImageView)((View)localObject4).findViewById(R.h.cDC);
          localObject6 = (ImageView)((View)localObject4).findViewById(R.h.cDB);
          if (!((r)localObject3).kre) {
            break label727;
          }
          ((ImageView)localObject5).setVisibility(0);
          ((ImageView)localObject6).setVisibility(0);
          this.kAx.addView((View)localObject4);
        }
        this.kAv.setVisibility(8);
        this.kAw.setVisibility(8);
        this.kAx.removeAllViews();
        this.kzR.akN();
      }
      this.kAs.setVisibility(0);
      this.kAt.setVisibility(0);
      this.kAu.setVisibility(8);
      if (com.tencent.mm.plugin.card.sharecard.a.b.tJ(((com.tencent.mm.plugin.card.base.b)localObject4).aiP()) <= 1)
      {
        this.kAv.setVisibility(8);
        if ((localObject3 == null) || (((ArrayList)localObject3).size() <= 0)) {
          break label1087;
        }
        i = 0;
        label557:
        if (i >= ((ArrayList)localObject3).size()) {
          break label1087;
        }
        localObject1 = (r)((ArrayList)localObject3).get(i);
        if (!((r)localObject1).kre) {
          break label709;
        }
      }
    }
    label709:
    label727:
    label744:
    label765:
    label895:
    label1082:
    label1087:
    for (localObject1 = ((r)localObject1).krc;; localObject1 = "")
    {
      localObject2 = localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject2 = localObject1;
        if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject4).aiQ())) {
          localObject2 = ((com.tencent.mm.plugin.card.base.b)localObject4).aiQ();
        }
      }
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        break;
      }
      a.b.a(this.kAs, (String)localObject2);
      localObject1 = this.jFp.getString(R.l.dGs, new Object[] { l.un((String)localObject2) });
      this.kAt.setText(h.g(this.jFp, (CharSequence)localObject1, this.jFp.getResources().getDimensionPixelOffset(R.f.aSh)));
      break;
      this.kAv.setVisibility(0);
      this.kAv.setImageResource(R.g.aXg);
      break label542;
      i += 1;
      break label557;
      ((TextView)localObject5).setText("");
      break label357;
      ((ImageView)localObject5).setVisibility(8);
      ((ImageView)localObject6).setVisibility(8);
      break label445;
      this.kAx.invalidate();
      this.kAp = true;
      GMTrace.o(4991423086592L, 37189);
      return;
      i = 0;
      if (i < this.kAx.getChildCount())
      {
        localObject2 = this.kAx.getChildAt(i);
        if ((localObject3 == null) || (((ArrayList)localObject3).size() < this.kAx.getChildCount())) {
          break label1082;
        }
      }
      for (localObject1 = (r)((ArrayList)localObject3).get(i);; localObject1 = null)
      {
        localObject4 = (ImageView)((View)localObject2).findViewById(R.h.cDC);
        localObject2 = (ImageView)((View)localObject2).findViewById(R.h.cDB);
        if ((localObject1 != null) && (((r)localObject1).kre))
        {
          ((ImageView)localObject4).setVisibility(0);
          ((ImageView)localObject2).setVisibility(0);
        }
        for (;;)
        {
          i += 1;
          break;
          ((ImageView)localObject4).setVisibility(8);
          ((ImageView)localObject2).setVisibility(8);
        }
        this.kAx.invalidate();
        break;
        this.kAw.setVisibility(8);
        this.kAx.removeAllViews();
        break;
        if (!((g)localObject1).alK())
        {
          this.kAq.setVisibility(0);
          this.kAs.setVisibility(0);
          this.kAt.setVisibility(0);
          this.kAu.setVisibility(8);
          this.kAv.setVisibility(8);
          localObject2 = "";
          localObject1 = localObject2;
          if (TextUtils.isEmpty(""))
          {
            localObject1 = localObject2;
            if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject4).aiQ())) {
              localObject1 = ((com.tencent.mm.plugin.card.base.b)localObject4).aiQ();
            }
          }
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            a.b.a(this.kAs, (String)localObject1);
            localObject1 = this.jFp.getString(R.l.dGs, new Object[] { l.un((String)localObject1) });
            this.kAt.setText(h.g(this.jFp, (CharSequence)localObject1, this.jFp.getResources().getDimensionPixelOffset(R.f.aSh)));
          }
          this.kAp = true;
        }
        GMTrace.o(4991423086592L, 37189);
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */