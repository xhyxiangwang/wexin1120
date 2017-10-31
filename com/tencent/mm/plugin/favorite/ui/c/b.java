package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;

public final class b
  extends a
{
  private final int lXn;
  
  public b(g paramg)
  {
    super(paramg);
    GMTrace.i(6431042437120L, 47915);
    this.lXn = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 60);
    GMTrace.o(6431042437120L, 47915);
  }
  
  private static String a(au.a parama)
  {
    int j = 1;
    int k = 0;
    GMTrace.i(6431445090304L, 47918);
    String str2 = parama.glq;
    int i = k;
    String str1 = str2;
    if (bg.mZ(str2))
    {
      str2 = parama.siD;
      if (!com.tencent.mm.storage.x.Sz(str2))
      {
        i = k;
        str1 = str2;
        if (!o.fl(str2)) {}
      }
      else
      {
        i = 1;
        str1 = str2;
      }
    }
    if (i == 0)
    {
      ap.AS();
      if (!com.tencent.mm.x.c.yL().SH(str1)) {
        i = j;
      }
    }
    for (;;)
    {
      boolean bool = o.fe(parama.skn);
      if ((i != 0) || (bool))
      {
        GMTrace.o(6431445090304L, 47918);
        return "";
      }
      GMTrace.o(6431445090304L, 47918);
      return str1;
    }
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6431176654848L, 47916);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate(localContext, R.i.cUb, null), paramViewGroup, paramj);
      paramViewGroup.jjR = ((ImageView)paramView.findViewById(R.h.bGW));
      paramViewGroup.iiM = ((TextView)paramView.findViewById(R.h.bHx));
      paramViewGroup.iiM.setSingleLine(false);
      paramViewGroup.iiM.setMaxLines(2);
      paramViewGroup.iiN = ((TextView)paramView.findViewById(R.h.bGI));
      paramViewGroup.lXo = ((TextView)paramView.findViewById(R.h.bHo));
      a(paramViewGroup, paramj);
      paramj = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      ap.AS();
      paramj = com.tencent.mm.x.c.yN().BH(paramj.desc);
      if ((paramj.siD == null) || (paramj.siD.length() <= 0)) {
        w.e("MicroMsg.FavCardListItem", "parse possible friend msg failed");
      }
      if (!bg.mZ(a(paramj))) {
        break label248;
      }
      paramViewGroup.iiN.setVisibility(8);
      label185:
      paramViewGroup.lXo.setText(R.l.dWU);
      paramViewGroup.lXo.setVisibility(0);
      paramViewGroup = paramViewGroup.jjR;
      paramj = paramj.siD;
      if (!bg.mZ(paramj)) {
        break label262;
      }
      paramViewGroup.setImageResource(R.g.aYg);
    }
    for (;;)
    {
      GMTrace.o(6431176654848L, 47916);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label248:
      paramViewGroup.iiN.setText(a(paramj));
      break label185;
      label262:
      com.tencent.mm.pluginsdk.ui.a.b.a(paramViewGroup, paramj);
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6431310872576L, 47917);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6431310872576L, 47917);
  }
  
  public static final class a
    extends a.b
  {
    TextView iiM;
    TextView iiN;
    ImageView jjR;
    TextView lXo;
    
    public a()
    {
      GMTrace.i(6426344816640L, 47880);
      GMTrace.o(6426344816640L, 47880);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */