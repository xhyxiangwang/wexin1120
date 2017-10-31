package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.sp;

public final class q
  extends a
{
  public q(g paramg)
  {
    super(paramg);
    GMTrace.i(6421244542976L, 47842);
    GMTrace.o(6421244542976L, 47842);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6421378760704L, 47843);
    Object localObject = paramViewGroup.getContext();
    int i;
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cUc, null), paramViewGroup, paramj);
      paramViewGroup.iiM = ((TextView)paramView.findViewById(R.h.bHx));
      paramViewGroup.lXQ = ((TextView)paramView.findViewById(R.h.bGL));
      paramViewGroup.jjR = ((ImageView)paramView.findViewById(R.h.bGW));
      a(paramViewGroup, paramj);
      paramViewGroup.iiM.setText(((Context)localObject).getString(R.l.dxx));
      i = (int)x.aB(x.n(paramj).duration);
      localObject = paramViewGroup.lXQ;
      paramj = this.lNK.context;
      if (i > 0) {
        break label194;
      }
    }
    label194:
    for (paramj = paramj.getString(R.l.dYn, new Object[] { Integer.valueOf(0) });; paramj = paramj.getString(R.l.dYn, new Object[] { Integer.valueOf(i) }))
    {
      ((TextView)localObject).setText(paramj);
      paramViewGroup.jjR.setImageResource(R.k.doe);
      GMTrace.o(6421378760704L, 47843);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6421512978432L, 47844);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6421512978432L, 47844);
  }
  
  public static final class a
    extends a.b
  {
    TextView iiM;
    ImageView jjR;
    TextView lXQ;
    
    public a()
    {
      GMTrace.i(6420036583424L, 47833);
      GMTrace.o(6420036583424L, 47833);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */