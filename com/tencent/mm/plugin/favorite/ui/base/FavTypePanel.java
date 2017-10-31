package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import java.util.List;

public class FavTypePanel
  extends LinearLayout
{
  private LinearLayout lTO;
  private View.OnClickListener lTT;
  public a lUF;
  
  public FavTypePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6446611693568L, 48031);
    this.lTT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6459765030912L, 48129);
        ImageButton localImageButton = (ImageButton)paramAnonymousView.findViewById(R.h.bHA);
        int i = ((Integer)paramAnonymousView.getTag(R.h.bGH)).intValue();
        int j = ((Integer)paramAnonymousView.getTag(R.h.bHp)).intValue();
        if (j == 0)
        {
          localImageButton.setImageResource(FavTypePanel.ny(i));
          paramAnonymousView.setTag(R.h.bHp, Integer.valueOf(1));
          if (FavTypePanel.a(FavTypePanel.this) != null)
          {
            paramAnonymousView = FavTypePanel.a(FavTypePanel.this);
            if (1 != j) {
              break label139;
            }
          }
        }
        label139:
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousView.y(i, bool);
          GMTrace.o(6459765030912L, 48129);
          return;
          localImageButton.setImageResource(FavTypePanel.nz(i));
          paramAnonymousView.setTag(R.h.bHp, Integer.valueOf(0));
          break;
        }
      }
    };
    this.lTO = this;
    a(this.lTO, R.k.doq, R.l.dYa, 5);
    a(this.lTO, R.k.doo, R.l.dXW, 2);
    a(this.lTO, R.k.dou, R.l.dYc, 3);
    a(this.lTO, R.k.dom, R.l.dXY, 7);
    a(this.lTO, R.k.dos, R.l.dYb, 4);
    GMTrace.o(6446611693568L, 48031);
  }
  
  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(6447014346752L, 48034);
    View localView = View.inflate(getContext(), R.i.cUu, null);
    localView.setTag(R.h.bGH, Integer.valueOf(paramInt3));
    localView.setTag(R.h.bHp, Integer.valueOf(1));
    localView.setOnClickListener(this.lTT);
    ((ImageButton)localView.findViewById(R.h.bHA)).setImageResource(paramInt1);
    ((TextView)localView.findViewById(R.h.bHB)).setText(paramInt2);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -2);
    localLayoutParams.weight = 1.0F;
    paramLinearLayout.addView(localView, localLayoutParams);
    GMTrace.o(6447014346752L, 48034);
  }
  
  private static int nw(int paramInt)
  {
    GMTrace.i(6446745911296L, 48032);
    switch (paramInt)
    {
    case 6: 
    default: 
      GMTrace.o(6446745911296L, 48032);
      return 0;
    case 5: 
      paramInt = R.k.doq;
      GMTrace.o(6446745911296L, 48032);
      return paramInt;
    case 2: 
      paramInt = R.k.doo;
      GMTrace.o(6446745911296L, 48032);
      return paramInt;
    case 7: 
      paramInt = R.k.dom;
      GMTrace.o(6446745911296L, 48032);
      return paramInt;
    case 3: 
      paramInt = R.k.dou;
      GMTrace.o(6446745911296L, 48032);
      return paramInt;
    }
    paramInt = R.k.dos;
    GMTrace.o(6446745911296L, 48032);
    return paramInt;
  }
  
  private static int nx(int paramInt)
  {
    GMTrace.i(6446880129024L, 48033);
    switch (paramInt)
    {
    case 6: 
    default: 
      GMTrace.o(6446880129024L, 48033);
      return 0;
    case 5: 
      paramInt = R.k.dor;
      GMTrace.o(6446880129024L, 48033);
      return paramInt;
    case 2: 
      paramInt = R.k.dop;
      GMTrace.o(6446880129024L, 48033);
      return paramInt;
    case 7: 
      paramInt = R.k.don;
      GMTrace.o(6446880129024L, 48033);
      return paramInt;
    case 3: 
      paramInt = R.k.dov;
      GMTrace.o(6446880129024L, 48033);
      return paramInt;
    }
    paramInt = R.k.dot;
    GMTrace.o(6446880129024L, 48033);
    return paramInt;
  }
  
  public final void az(List<Integer> paramList)
  {
    GMTrace.i(6447148564480L, 48035);
    int i = 0;
    if (i < this.lTO.getChildCount())
    {
      View localView = this.lTO.getChildAt(i);
      Integer localInteger = (Integer)localView.getTag(R.h.bGH);
      if ((paramList != null) && (paramList.contains(localInteger)))
      {
        ((ImageButton)localView.findViewById(R.h.bHA)).setImageResource(nx(localInteger.intValue()));
        localView.setTag(R.h.bHp, Integer.valueOf(0));
      }
      for (;;)
      {
        i += 1;
        break;
        ((ImageButton)localView.findViewById(R.h.bHA)).setImageResource(nw(localInteger.intValue()));
        localView.setTag(R.h.bHp, Integer.valueOf(1));
      }
    }
    GMTrace.o(6447148564480L, 48035);
  }
  
  public static abstract interface a
  {
    public abstract void y(int paramInt, boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/FavTypePanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */