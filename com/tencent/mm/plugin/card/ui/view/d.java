package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.ui.MMActivity;

public final class d
  extends i
{
  private TextView krO;
  private View kzG;
  private TextView kzH;
  private TextView kzI;
  
  public d()
  {
    GMTrace.i(4990483562496L, 37182);
    GMTrace.o(4990483562496L, 37182);
  }
  
  public final void MH()
  {
    GMTrace.i(4990617780224L, 37183);
    this.kzG = findViewById(R.h.bhd);
    this.kzH = ((TextView)findViewById(R.h.bhe));
    this.krO = ((TextView)findViewById(R.h.cxA));
    this.kzI = ((TextView)findViewById(R.h.bqP));
    this.kzH.setOnClickListener(this.kzR.akP());
    this.kzG.setVisibility(8);
    GMTrace.o(4990617780224L, 37183);
  }
  
  public final void amb()
  {
    GMTrace.i(4990886215680L, 37185);
    this.kzG.setVisibility(8);
    GMTrace.o(4990886215680L, 37185);
  }
  
  public final void ua(String paramString)
  {
    GMTrace.i(4991020433408L, 37186);
    this.kzI.setText(paramString);
    GMTrace.o(4991020433408L, 37186);
  }
  
  public final void update()
  {
    GMTrace.i(4990751997952L, 37184);
    b localb = this.kzR.akL();
    Object localObject1 = this.kzR.akO();
    this.kzG.setVisibility(0);
    if (!TextUtils.isEmpty(localb.aiK().tFh))
    {
      this.kzH.setVisibility(0);
      this.kzH.setText(localb.aiK().tFh);
      if ((localb.aiq()) || ((localb.aip()) && (localb.ais()))) {
        this.kzH.setTextColor(((MMActivity)localObject1).getResources().getColor(R.e.white));
      }
    }
    Object localObject2;
    for (;;)
    {
      localObject2 = this.kzG.findViewById(R.h.brc);
      if (!this.kzR.akQ().alY()) {
        break label552;
      }
      ((View)localObject2).setVisibility(0);
      this.kzI.setText(((MMActivity)localObject1).getString(R.l.dGk));
      this.kzI.setTextColor(((MMActivity)localObject1).getResources().getColor(R.e.white));
      int i = ((MMActivity)localObject1).getResources().getDimensionPixelOffset(R.f.aSg);
      localObject2 = (Button)this.kzG.findViewById(R.h.bqN);
      ShapeDrawable localShapeDrawable1 = l.d((Context)localObject1, ((MMActivity)localObject1).getResources().getColor(R.e.white), i);
      ShapeDrawable localShapeDrawable2 = l.bM(((MMActivity)localObject1).getResources().getColor(R.e.white), i);
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(new int[] { 16842919 }, localShapeDrawable2);
      localStateListDrawable.addState(new int[0], localShapeDrawable1);
      ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
      i = l.uk(localb.aiK().hbA);
      int j = ((MMActivity)localObject1).getResources().getColor(R.e.white);
      ((Button)localObject2).setTextColor(new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j }));
      ((Button)localObject2).setOnClickListener(this.kzR.akP());
      localObject1 = this.kzG.findViewById(R.h.cch);
      localObject2 = this.kzG.findViewById(R.h.bqd);
      if (localb.aiK().tFv != 1) {
        break;
      }
      ((View)localObject1).setVisibility(0);
      ((View)localObject2).setVisibility(0);
      GMTrace.o(4990751997952L, 37184);
      return;
      if ((localb.aip()) && (localb.air()))
      {
        this.kzH.setTextColor(((MMActivity)localObject1).getResources().getColor(R.e.aNJ));
        this.kzG.setBackgroundColor(((MMActivity)localObject1).getResources().getColor(R.e.aPC));
      }
      else
      {
        this.kzH.setTextColor(((MMActivity)localObject1).getResources().getColor(R.e.white));
        continue;
        this.kzH.setVisibility(8);
      }
    }
    ((View)localObject1).setVisibility(8);
    ((View)localObject2).setVisibility(8);
    GMTrace.o(4990751997952L, 37184);
    return;
    label552:
    ((View)localObject2).setVisibility(8);
    GMTrace.o(4990751997952L, 37184);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */