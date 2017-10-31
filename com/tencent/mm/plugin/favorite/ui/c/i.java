package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.c;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMImageView;

public final class i
  extends a
{
  private final int lXn;
  private final String lXx;
  
  public i(g paramg)
  {
    super(paramg);
    GMTrace.i(6428358082560L, 47895);
    this.lXn = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 60);
    this.lXx = paramg.context.getString(R.l.dXw);
    GMTrace.o(6428358082560L, 47895);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6428492300288L, 47896);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate(localContext, R.i.cUb, null), paramViewGroup, paramj);
      paramViewGroup.lVi = ((MMImageView)paramView.findViewById(R.h.bGW));
      paramViewGroup.iiM = ((TextView)paramView.findViewById(R.h.bHx));
      paramViewGroup.iiN = ((TextView)paramView.findViewById(R.h.bGI));
      paramViewGroup.iiN.setVisibility(8);
      paramViewGroup.lXo = ((TextView)paramView.findViewById(R.h.bHo));
      paramViewGroup.lXo.setVisibility(0);
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      sy localsy = paramj.field_favProto.tPP;
      paramViewGroup.iiM.setText(bg.mY(localsy.title));
      paramViewGroup.lXo.setText(bg.ap(c.getAppName(localContext, paramj.field_favProto.tQA.appId), this.lXx));
      this.lNK.a(paramViewGroup.lVi, null, paramj, R.k.dle, this.lXn, this.lXn);
      GMTrace.o(6428492300288L, 47896);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6428626518016L, 47897);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6428626518016L, 47897);
  }
  
  public static final class a
    extends a.b
  {
    TextView iiM;
    TextView iiN;
    MMImageView lVi;
    TextView lXo;
    
    public a()
    {
      GMTrace.i(6421781413888L, 47846);
      GMTrace.o(6421781413888L, 47846);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */