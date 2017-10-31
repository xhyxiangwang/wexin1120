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
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMImageView;

public final class g
  extends a
{
  private final int lXn;
  private final String lXx;
  
  public g(com.tencent.mm.plugin.favorite.c.g paramg)
  {
    super(paramg);
    GMTrace.i(6433055703040L, 47930);
    this.lXn = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 60);
    this.lXx = paramg.context.getString(R.l.dXh);
    GMTrace.o(6433055703040L, 47930);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6433189920768L, 47931);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cUb, null), paramViewGroup, paramj);
      paramViewGroup.lVi = ((MMImageView)paramView.findViewById(R.h.bGW));
      paramViewGroup.iiM = ((TextView)paramView.findViewById(R.h.bHx));
      paramViewGroup.iiN = ((TextView)paramView.findViewById(R.h.bGI));
      paramViewGroup.lXo = ((TextView)paramView.findViewById(R.h.bHo));
      paramViewGroup.lXo.setVisibility(8);
    }
    for (;;)
    {
      a(paramViewGroup, paramj);
      localObject = paramj.field_favProto.tPP;
      paramViewGroup.iiM.setText(bg.mY(((sy)localObject).title));
      paramViewGroup.iiN.setText(bg.mY(((sy)localObject).desc));
      paramViewGroup.iiM.setSingleLine(false);
      paramViewGroup.iiM.setMaxLines(2);
      this.lNK.a(paramViewGroup.lVi, null, paramj, R.k.dle, this.lXn, this.lXn);
      GMTrace.o(6433189920768L, 47931);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6433324138496L, 47932);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6433324138496L, 47932);
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
      GMTrace.i(6434934751232L, 47944);
      GMTrace.o(6434934751232L, 47944);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */