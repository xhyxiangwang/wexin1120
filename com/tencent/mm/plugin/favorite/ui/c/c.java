package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  extends a
{
  public c(g paramg)
  {
    super(paramg);
    GMTrace.i(6430505566208L, 47911);
    GMTrace.o(6430505566208L, 47911);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6430639783936L, 47912);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cUc, null), paramViewGroup, paramj);
      paramViewGroup.jjR = ((ImageView)paramView.findViewById(R.h.bGW));
      paramViewGroup.iiM = ((TextView)paramView.findViewById(R.h.bHx));
      paramViewGroup.iiN = ((TextView)paramView.findViewById(R.h.bGL));
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      sp localsp = x.n(paramj);
      localObject = paramj.field_favProto.tQA;
      localObject = paramj.field_favProto.title;
      paramj = (j)localObject;
      if (bg.mZ((String)localObject)) {
        paramj = localsp.title;
      }
      paramViewGroup.iiM.setText(paramj);
      paramViewGroup.iiN.setText(x.ab((float)localsp.tOS));
      if (localsp.tPF == 2) {
        paramViewGroup.iiN.setText(">25MB");
      }
      paramViewGroup.jjR.setImageResource(com.tencent.mm.pluginsdk.model.c.Np(localsp.tOM));
      GMTrace.o(6430639783936L, 47912);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6430774001664L, 47913);
    j localj = ((a)paramView.getTag()).lPM;
    e.b(paramView.getContext(), localj);
    GMTrace.o(6430774001664L, 47913);
  }
  
  public static final class a
    extends a.b
  {
    TextView iiM;
    TextView iiN;
    ImageView jjR;
    
    public a()
    {
      GMTrace.i(6421647196160L, 47845);
      GMTrace.o(6421647196160L, 47845);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */