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
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.x.ap;
import java.util.HashSet;
import java.util.LinkedList;

public final class k
  extends a
{
  private HashSet<Long> lXM;
  final int lXp;
  final int lXq;
  
  public k(g paramg)
  {
    super(paramg);
    GMTrace.i(6422184067072L, 47849);
    this.lXq = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 138);
    this.lXp = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 230);
    this.lXM = new HashSet();
    GMTrace.o(6422184067072L, 47849);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, final j paramj)
  {
    GMTrace.i(6422318284800L, 47850);
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
        break label253;
      }
      int i = ((sp)localLinkedList.getFirst()).duration;
      paramViewGroup.lXP.setText(u.t((Context)localObject, i));
      if ((paramj != null) && (i <= 1)) {
        break label202;
      }
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      localObject = x.n(paramj);
      this.lNK.a(paramViewGroup.lXO, (sp)localObject, paramj, R.k.doh, this.lXp, this.lXq);
      GMTrace.o(6422318284800L, 47850);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label202:
      if (!this.lXM.contains(Long.valueOf(paramj.field_localId)))
      {
        this.lXM.add(Long.valueOf(paramj.field_localId));
        ap.xC().C(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6419231277056L, 47827);
            x.t(paramj);
            GMTrace.o(6419231277056L, 47827);
          }
        });
        continue;
        label253:
        paramViewGroup.lXP.setText("");
      }
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6422452502528L, 47851);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6422452502528L, 47851);
  }
  
  public static final class a
    extends a.b
  {
    MMImageView lXO;
    TextView lXP;
    
    public a()
    {
      GMTrace.i(6418962841600L, 47825);
      GMTrace.o(6418962841600L, 47825);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */