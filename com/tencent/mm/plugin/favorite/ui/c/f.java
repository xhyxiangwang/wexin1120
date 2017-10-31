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
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.bg;

public final class f
  extends a
{
  public f(g paramg)
  {
    super(paramg);
    GMTrace.i(6433458356224L, 47933);
    GMTrace.o(6433458356224L, 47933);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6433592573952L, 47934);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cUc, null), paramViewGroup, paramj);
      paramViewGroup.jjR = ((ImageView)paramView.findViewById(R.h.bGW));
      paramViewGroup.iiM = ((TextView)paramView.findViewById(R.h.bHx));
      paramViewGroup.iiN = ((TextView)paramView.findViewById(R.h.bGL));
      a(paramViewGroup, paramj);
      paramViewGroup.jjR.setImageResource(R.k.doa);
      localObject = paramj.field_favProto.tPL;
      paramj = paramj.field_favProto.iDL;
      if (!bg.mZ(paramj)) {
        break label205;
      }
      if (!bg.mZ(((sw)localObject).fJh)) {
        break label178;
      }
      paramViewGroup.iiM.setText(((sw)localObject).label);
      paramViewGroup.iiN.setText(R.l.dXf);
    }
    for (;;)
    {
      GMTrace.o(6433592573952L, 47934);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label178:
      paramViewGroup.iiM.setText(((sw)localObject).fJh);
      paramViewGroup.iiN.setText(((sw)localObject).label);
      continue;
      label205:
      paramViewGroup.iiM.setText(h.b(paramViewGroup.iiM.getContext(), paramj, paramViewGroup.iiM.getTextSize()));
      if (bg.mZ(((sw)localObject).fJh)) {
        paramViewGroup.iiN.setText(((sw)localObject).label);
      } else {
        paramViewGroup.iiN.setText(((sw)localObject).fJh);
      }
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6433726791680L, 47935);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6433726791680L, 47935);
  }
  
  public static final class a
    extends a.b
  {
    TextView iiM;
    TextView iiN;
    ImageView jjR;
    
    public a()
    {
      GMTrace.i(6431579308032L, 47919);
      GMTrace.o(6431579308032L, 47919);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */