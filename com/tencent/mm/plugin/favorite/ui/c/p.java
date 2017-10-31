package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.ui.MMImageView;
import java.util.LinkedList;

public final class p
  extends a
{
  final int lXp;
  final int lXq;
  
  public p(g paramg)
  {
    super(paramg);
    GMTrace.i(6434397880320L, 47940);
    this.lXq = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 138);
    this.lXp = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 230);
    GMTrace.o(6434397880320L, 47940);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6434532098048L, 47941);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cUf, null), paramViewGroup, paramj);
      paramViewGroup.lXO = ((MMImageView)paramView.findViewById(R.h.bHb));
      paramViewGroup.lXP = ((TextView)paramView.findViewById(R.h.bHC));
      paramView.findViewById(R.h.bHn).setVisibility(8);
      paramViewGroup.lXP.setVisibility(0);
      LinkedList localLinkedList = paramj.field_favProto.tQC;
      if (localLinkedList.size() <= 0) {
        break label188;
      }
      paramViewGroup.lXP.setText(u.t((Context)localObject, ((sp)localLinkedList.getFirst()).duration));
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      localObject = x.n(paramj);
      this.lNK.a(paramViewGroup.lXO, (sp)localObject, paramj, R.k.doh, this.lXp, this.lXq);
      GMTrace.o(6434532098048L, 47941);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label188:
      paramViewGroup.lXP.setText("");
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6434666315776L, 47942);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6434666315776L, 47942);
  }
  
  public static final class a
    extends a.b
  {
    MMImageView lXO;
    TextView lXP;
    
    public a()
    {
      GMTrace.i(6430908219392L, 47914);
      GMTrace.o(6430908219392L, 47914);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */