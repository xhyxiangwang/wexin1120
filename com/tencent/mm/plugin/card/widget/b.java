package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
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
import com.tencent.mm.protocal.c.bkr;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
  extends a
{
  private final String TAG;
  protected TextView jaE;
  protected TextView kBl;
  protected TextView kBm;
  protected Button kBn;
  protected LinearLayout kBo;
  protected TextView kBp;
  protected ImageView kBq;
  protected View kBr;
  protected ImageView kBs;
  private boolean kzo;
  
  public b(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4888075436032L, 36419);
    this.TAG = "MicroMsg.CardWidgetCommon";
    this.kzo = false;
    GMTrace.o(4888075436032L, 36419);
  }
  
  private void amv()
  {
    GMTrace.i(4888478089216L, 36422);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.kBo.getLayoutParams();
    if (this.kmJ.aip())
    {
      this.kBj.setVisibility(0);
      this.kBq.setVisibility(8);
      localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aSM);
    }
    for (;;)
    {
      this.kBo.setLayoutParams(localLayoutParams);
      GMTrace.o(4888478089216L, 36422);
      return;
      if ((this.kmJ.aiq()) && (this.kzo))
      {
        this.kBj.setVisibility(8);
        this.kBq.setVisibility(8);
        localLayoutParams.topMargin = 0;
      }
      else if (this.kmJ.aiq())
      {
        this.kBj.setVisibility(0);
        this.kBq.setVisibility(8);
        localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aSM);
      }
    }
  }
  
  private void amw()
  {
    GMTrace.i(4888746524672L, 36424);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.kBn.getLayoutParams();
    if ((this.kmJ.aiL().tEB != null) && (!TextUtils.isEmpty(this.kmJ.aiL().tEB.knt))) {
      localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aSg);
    }
    for (;;)
    {
      this.kBn.setLayoutParams(localLayoutParams);
      GMTrace.o(4888746524672L, 36424);
      return;
      if ((this.kmJ.aiL().tEC != null) && (!TextUtils.isEmpty(this.kmJ.aiL().tEC.kns))) {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aSg);
      } else if ((this.kmJ.aiK().tEW != null) && (this.kmJ.aiK().tEW.size() > 0)) {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aSg);
      } else {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(R.f.aRT);
      }
    }
  }
  
  protected final void amt()
  {
    GMTrace.i(4888209653760L, 36420);
    this.jaE = ((TextView)this.kBi.findViewById(R.h.brq));
    this.kBl = ((TextView)this.kBi.findViewById(R.h.brk));
    this.kBm = ((TextView)this.kBi.findViewById(R.h.boO));
    this.kBn = ((Button)this.kBi.findViewById(R.h.bpo));
    this.kBo = ((LinearLayout)this.kBi.findViewById(R.h.cLD));
    this.kBq = ((ImageView)this.kBo.findViewById(R.h.biy));
    this.kBr = this.kBi.findViewById(R.h.boU);
    this.kBs = ((ImageView)this.kBi.findViewById(R.h.bpj));
    this.kBp = ((TextView)this.kBi.findViewById(R.h.bqE));
    GMTrace.o(4888209653760L, 36420);
  }
  
  protected final void amu()
  {
    GMTrace.i(4888343871488L, 36421);
    nc localnc1;
    Object localObject1;
    if ((this.kmJ.aiK().tEW != null) && (this.kmJ.aiK().tEW.size() > 0))
    {
      localnc1 = (nc)this.kmJ.aiK().tEW.get(0);
      if (!bg.mZ(localnc1.title)) {
        this.jaE.setText(localnc1.title);
      }
      if (!bg.mZ(localnc1.kns))
      {
        this.kBl.setText(localnc1.kns);
        this.kBl.setVisibility(0);
        localObject1 = (LinearLayout.LayoutParams)this.kBl.getLayoutParams();
        if (bg.mZ(localnc1.knt)) {
          break label249;
        }
        this.kBm.setText(localnc1.knt);
        this.kBm.setVisibility(0);
        ((LinearLayout.LayoutParams)localObject1).bottomMargin = 0;
        label156:
        this.kBl.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.kBl.invalidate();
      }
    }
    else
    {
      if ((this.kBn != null) && (this.kBs != null)) {
        break label278;
      }
      w.e("MicroMsg.CardWidgetCommon", "consumeBtn == null || mCardCodeImg == null");
    }
    for (;;)
    {
      amv();
      this.kBo.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.g.aXq));
      amw();
      this.kBi.invalidate();
      GMTrace.o(4888343871488L, 36421);
      return;
      this.kBl.setVisibility(8);
      break;
      label249:
      this.kBm.setVisibility(8);
      ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aRT);
      break label156;
      label278:
      if (this.kmJ.aiL() == null)
      {
        w.e("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo() == null");
        this.kBn.setVisibility(8);
        this.kBs.setVisibility(8);
      }
      else
      {
        if (this.kmJ.aiL().tEB != null)
        {
          w.i("MicroMsg.CardWidgetCommon", "operate_field.title is " + this.kmJ.aiL().tEB.title);
          w.d("MicroMsg.CardWidgetCommon", "operate_field.url is " + this.kmJ.aiL().tEB.url);
          w.i("MicroMsg.CardWidgetCommon", "operate_field.aux_title is " + this.kmJ.aiL().tEB.knt);
        }
        localnc1 = this.kmJ.aiL().tEC;
        if (localnc1 != null)
        {
          w.i("MicroMsg.CardWidgetCommon", "limit_field.title is " + localnc1.title);
          w.i("MicroMsg.CardWidgetCommon", "limit_field.show_flag is " + localnc1.tFX);
          w.i("MicroMsg.CardWidgetCommon", "limit_field.aux_title is " + localnc1.knt);
        }
        Object localObject2 = this.kmJ.aiK().tFp;
        localObject1 = (LinearLayout)this.kBo.findViewById(R.h.bpx);
        if ((localObject2 != null) && (!bg.bX(((bkr)localObject2).uAT)))
        {
          ((LinearLayout)localObject1).setVisibility(0);
          ((LinearLayout)localObject1).removeAllViews();
          localObject2 = ((bkr)localObject2).uAT.iterator();
        }
        while (((Iterator)localObject2).hasNext())
        {
          nc localnc2 = (nc)((Iterator)localObject2).next();
          View localView = LayoutInflater.from(this.mContext).inflate(R.i.cOb, null);
          TextView localTextView1 = (TextView)localView.findViewById(R.h.bpA);
          TextView localTextView2 = (TextView)localView.findViewById(R.h.bpw);
          localTextView1.setText(localnc2.title);
          localTextView2.setText(localnc2.kns);
          ((LinearLayout)localObject1).addView(localView);
          continue;
          ((LinearLayout)localObject1).setVisibility(8);
        }
        if ((localnc1 != null) && (!TextUtils.isEmpty(localnc1.title)) && (localnc1.tFX != 0L) && (this.kmJ.aiG()))
        {
          this.kBn.setClickable(false);
          this.kBn.setVisibility(0);
          this.kBn.setTextColor(this.mContext.getResources().getColor(R.e.aQU));
          this.kBn.setText(localnc1.title);
          if ((localnc1 != null) && (!TextUtils.isEmpty(localnc1.kns)))
          {
            this.kBp.setText(localnc1.kns);
            this.kBp.setVisibility(0);
          }
          for (;;)
          {
            this.kBs.setVisibility(8);
            if ((localnc1.tFX & 0x2) <= 0L) {
              break label895;
            }
            this.kBn.setBackgroundDrawable(l.v(this.mContext, l.aM(this.kmJ.aiK().hbA, 150)));
            this.kBp.setTextColor(l.uk(this.kmJ.aiK().hbA));
            break;
            this.kBp.setVisibility(8);
          }
          label895:
          if ((localnc1.tFX & 0x4) > 0L)
          {
            this.kBn.setBackgroundDrawable(l.v(this.mContext, this.mContext.getResources().getColor(R.e.aOR)));
            this.kBp.setTextColor(this.mContext.getResources().getColor(R.e.aPE));
          }
          else
          {
            this.kBn.setBackgroundDrawable(l.v(this.mContext, l.uk(this.kmJ.aiK().hbA)));
            this.kBp.setTextColor(this.mContext.getResources().getColor(R.e.aPE));
          }
        }
        else if ((this.kmJ.aiL().tEB != null) && (!TextUtils.isEmpty(this.kmJ.aiL().tEB.title)) && (!TextUtils.isEmpty(this.kmJ.aiL().tEB.url)) && (this.kmJ.aiG()))
        {
          this.kBn.setClickable(true);
          this.kBn.setVisibility(0);
          this.kBn.setBackgroundDrawable(l.v(this.mContext, l.uk(this.kmJ.aiK().hbA)));
          this.kBn.setTextColor(this.mContext.getResources().getColorStateList(R.e.aQU));
          this.kBn.setText(this.kmJ.aiL().tEB.title);
          if ((this.kmJ.aiL().tEB != null) && (!TextUtils.isEmpty(this.kmJ.aiL().tEB.knt)))
          {
            this.kBp.setTextColor(this.mContext.getResources().getColor(R.e.aPE));
            this.kBp.setText(this.kmJ.aiL().tEB.knt);
            this.kBp.setVisibility(0);
          }
          for (;;)
          {
            if (TextUtils.isEmpty(this.kmJ.aiL().code)) {
              break label1293;
            }
            this.kBs.setVisibility(0);
            break;
            this.kBp.setVisibility(8);
          }
          label1293:
          this.kBs.setVisibility(8);
        }
        else if ((!TextUtils.isEmpty(this.kmJ.aiL().code)) && (this.kmJ.aiG()))
        {
          w.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().code is valid");
          this.kBs.setVisibility(8);
          this.kBp.setVisibility(8);
          this.kBn.setClickable(true);
          this.kBn.setVisibility(0);
          this.kBn.setBackgroundDrawable(l.v(this.mContext, l.uk(this.kmJ.aiK().hbA)));
          this.kBn.setTextColor(this.mContext.getResources().getColorStateList(R.e.aQU));
          this.kBn.setText(R.l.dGE);
        }
        else if (!this.kmJ.aiG())
        {
          w.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().status is " + this.kmJ.aiL().status);
          this.kBs.setVisibility(8);
          this.kBp.setVisibility(8);
          this.kBn.setClickable(true);
          this.kBn.setVisibility(0);
          this.kBn.setTextColor(this.mContext.getResources().getColor(R.e.aOz));
          this.kBn.setBackgroundDrawable(l.v(this.mContext, this.mContext.getResources().getColor(R.e.aNI)));
          if (!TextUtils.isEmpty(this.kmJ.aiK().tFu)) {
            this.kBn.setText(this.kmJ.aiK().tFu);
          } else {
            m.b(this.kBn, this.kmJ.aiL().status);
          }
        }
        else
        {
          w.i("MicroMsg.CardWidgetCommon", "operate_field and code is empty!");
          this.kBn.setVisibility(8);
          this.kBp.setVisibility(8);
          this.kBs.setVisibility(8);
        }
      }
    }
  }
  
  public final void amx()
  {
    GMTrace.i(4889149177856L, 36427);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.kBo.getLayoutParams();
    if (this.kmJ.aiq())
    {
      this.kBj.setVisibility(0);
      localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aSM);
    }
    this.kBo.setLayoutParams(localLayoutParams);
    this.kBo.invalidate();
    GMTrace.o(4889149177856L, 36427);
  }
  
  public final void dC(boolean paramBoolean)
  {
    GMTrace.i(4889283395584L, 36428);
    this.kzo = paramBoolean;
    if (paramBoolean)
    {
      this.kBr.setVisibility(0);
      GMTrace.o(4889283395584L, 36428);
      return;
    }
    this.kBr.setVisibility(8);
    GMTrace.o(4889283395584L, 36428);
  }
  
  public final void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4889014960128L, 36426);
    if (this.kBn != null)
    {
      nc localnc = this.kmJ.aiL().tEC;
      if ((localnc != null) && (!TextUtils.isEmpty(localnc.title)) && (localnc.tFX != 0L) && (this.kmJ.aiG()))
      {
        this.kBn.setClickable(false);
        this.kBn.setVisibility(0);
        this.kBs.setVisibility(8);
        GMTrace.o(4889014960128L, 36426);
        return;
      }
      if ((this.kmJ.aiL().tEB != null) && (!TextUtils.isEmpty(this.kmJ.aiL().tEB.title)) && (!TextUtils.isEmpty(this.kmJ.aiL().tEB.url)) && (this.kmJ.aiG()))
      {
        this.kBn.setVisibility(0);
        this.kBn.setEnabled(true);
        if ((!TextUtils.isEmpty(this.kmJ.aiL().code)) && (this.kmJ.aiL().tEt != 0))
        {
          this.kBs.setVisibility(0);
          GMTrace.o(4889014960128L, 36426);
          return;
        }
        this.kBs.setVisibility(8);
        GMTrace.o(4889014960128L, 36426);
        return;
      }
      if ((paramBoolean1) && (!TextUtils.isEmpty(this.kmJ.aiL().code)) && (this.kmJ.aiG()))
      {
        this.kBn.setVisibility(0);
        this.kBn.setEnabled(paramBoolean2);
        this.kBs.setVisibility(8);
        GMTrace.o(4889014960128L, 36426);
        return;
      }
      if ((paramBoolean1) && (!this.kmJ.aiG()))
      {
        this.kBn.setVisibility(0);
        this.kBn.setEnabled(false);
        this.kBs.setVisibility(8);
        GMTrace.o(4889014960128L, 36426);
        return;
      }
      this.kBn.setVisibility(8);
      this.kBs.setVisibility(8);
    }
    GMTrace.o(4889014960128L, 36426);
  }
  
  public final void lO(int paramInt)
  {
    GMTrace.i(4888612306944L, 36423);
    this.kBo.setBackgroundResource(paramInt);
    this.kBq.setVisibility(8);
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramInt == 0)
    {
      localLayoutParams = (RelativeLayout.LayoutParams)this.kBo.getLayoutParams();
      if (this.kmJ.aip())
      {
        this.kBj.setVisibility(8);
        localLayoutParams.topMargin = 0;
        this.kBq.setVisibility(0);
        int i = this.mContext.getResources().getDimensionPixelSize(R.f.aSI);
        m.a(this.kBq, this.kmJ.aiK().knr, i, R.g.baR, false);
        this.kBo.setLayoutParams(localLayoutParams);
        this.kBo.invalidate();
        label128:
        amw();
        localLayoutParams = (RelativeLayout.LayoutParams)this.kBr.getLayoutParams();
        if (paramInt != 0) {
          break label232;
        }
        localLayoutParams.leftMargin = 0;
      }
    }
    for (localLayoutParams.rightMargin = 0;; localLayoutParams.rightMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aRd))
    {
      this.kBr.setLayoutParams(localLayoutParams);
      this.kBr.invalidate();
      this.kBi.invalidate();
      GMTrace.o(4888612306944L, 36423);
      return;
      if ((!this.kmJ.aiq()) || (!this.kzo)) {
        break;
      }
      this.kBj.setVisibility(8);
      localLayoutParams.topMargin = 0;
      break;
      amv();
      break label128;
      label232:
      localLayoutParams.leftMargin = this.mContext.getResources().getDimensionPixelSize(R.f.aRd);
    }
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(4888880742400L, 36425);
    super.setOnClickListener(paramOnClickListener);
    if (this.kBn != null) {
      this.kBn.setOnClickListener(paramOnClickListener);
    }
    if (this.kBs != null) {
      this.kBs.setOnClickListener(paramOnClickListener);
    }
    GMTrace.o(4888880742400L, 36425);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */