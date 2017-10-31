package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.card.sharecard.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public final class f
{
  private MMActivity jFp;
  private View krg;
  private b ksi;
  private int kwK;
  private View kwL;
  private TextView kwM;
  private TextView kwN;
  private ImageView kwO;
  private ImageView[] kwP;
  private TextView kwQ;
  private ImageView kwR;
  
  public f(MMActivity paramMMActivity, View paramView, int paramInt, b paramb)
  {
    GMTrace.i(4956794912768L, 36931);
    this.kwP = new ImageView[3];
    this.jFp = paramMMActivity;
    this.krg = paramView;
    this.kwK = paramInt;
    this.ksi = paramb;
    this.kwL = this.krg.findViewById(R.h.bpZ);
    this.kwM = ((TextView)this.krg.findViewById(R.h.bqb));
    this.kwN = ((TextView)this.krg.findViewById(R.h.bqa));
    this.kwQ = ((TextView)this.krg.findViewById(R.h.bqA));
    this.kwO = ((ImageView)this.krg.findViewById(R.h.bqc));
    this.kwP[0] = ((ImageView)this.krg.findViewById(R.h.bpW));
    this.kwP[1] = ((ImageView)this.krg.findViewById(R.h.bpX));
    this.kwP[2] = ((ImageView)this.krg.findViewById(R.h.bpY));
    this.kwR = ((ImageView)this.krg.findViewById(R.h.bqS));
    if (this.kwK == 1)
    {
      this.kwM.setText(this.jFp.getString(R.l.dFH, new Object[] { Integer.valueOf(0) }));
      this.kwO.setImageResource(R.g.aXd);
      GMTrace.o(4956794912768L, 36931);
      return;
    }
    if (this.kwK == 2)
    {
      this.kwM.setText(R.l.dGq);
      this.kwO.setImageResource(R.g.aXi);
      GMTrace.o(4956794912768L, 36931);
      return;
    }
    if (this.kwK == 3)
    {
      this.kwM.setText(this.jFp.getString(R.l.dGN, new Object[] { Integer.valueOf(b.ajV()) }));
      this.kwO.setImageResource(R.g.aXj);
    }
    GMTrace.o(4956794912768L, 36931);
  }
  
  public final void ar()
  {
    GMTrace.i(4957063348224L, 36933);
    Object localObject;
    if (this.kwK == 2)
    {
      localObject = (l)al.ajH().getValue("key_share_card_layout_data");
      if (localObject == null)
      {
        w.w("MicroMsg.CardHomePageItemController", "updateShareCardView data is null");
        GMTrace.o(4957063348224L, 36933);
        return;
      }
      if (bg.mZ(((l)localObject).kqV)) {
        this.kwN.setVisibility(8);
      }
      while (bg.bX(((l)localObject).kqU))
      {
        i = 0;
        while (i < 3)
        {
          this.kwP[i].setVisibility(8);
          i += 1;
        }
        this.kwN.setVisibility(0);
        this.kwN.setText(((l)localObject).kqV);
      }
      int i = 0;
      if (i < 3)
      {
        if (i < ((l)localObject).kqU.size())
        {
          this.kwP[i].setVisibility(0);
          int j = this.jFp.getResources().getDimensionPixelSize(R.f.aRT);
          m.a(this.kwP[i], (String)((l)localObject).kqU.get(i), j, R.g.baR, true);
        }
        for (;;)
        {
          i += 1;
          break;
          this.kwP[i].setVisibility(8);
        }
      }
      if (((l)localObject).fMF) {
        this.kwQ.setVisibility(0);
      }
      while ((!bg.bX(((l)localObject).kqU)) && (((l)localObject).kqU.size() == 1) && (((l)localObject).fME) && (!((l)localObject).fMF))
      {
        this.kwR.setVisibility(0);
        GMTrace.o(4957063348224L, 36933);
        return;
        this.kwQ.setVisibility(8);
      }
      this.kwR.setVisibility(8);
      GMTrace.o(4957063348224L, 36933);
      return;
    }
    if (this.kwK == 3)
    {
      this.kwM.setText(this.jFp.getString(R.l.dGN, new Object[] { Integer.valueOf(b.ajV()) }));
      localObject = (String)al.ajH().getValue("key_card_entrance_tips");
      if (!bg.mZ((String)localObject))
      {
        this.kwN.setText((CharSequence)localObject);
        this.kwN.setVisibility(0);
        GMTrace.o(4957063348224L, 36933);
        return;
      }
      this.kwN.setVisibility(8);
    }
    GMTrace.o(4957063348224L, 36933);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(4956929130496L, 36932);
    this.kwL.setOnClickListener(paramOnClickListener);
    GMTrace.o(4956929130496L, 36932);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(4957197565952L, 36934);
    this.krg.setVisibility(paramInt);
    GMTrace.o(4957197565952L, 36934);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */