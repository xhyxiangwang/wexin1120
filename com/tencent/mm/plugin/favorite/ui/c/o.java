package com.tencent.mm.plugin.favorite.ui.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import com.tencent.mm.x.ap;

public final class o
  extends a
{
  private final int lXn;
  
  public o(g paramg)
  {
    super(paramg);
    GMTrace.i(6420841889792L, 47839);
    this.lXn = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 60);
    GMTrace.o(6420841889792L, 47839);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6420976107520L, 47840);
    paramViewGroup = paramViewGroup.getContext();
    a locala;
    View localView;
    sp localsp1;
    Object localObject;
    ta localta;
    TextView localTextView;
    if (paramView == null)
    {
      locala = new a();
      localView = a(View.inflate(paramViewGroup, R.i.cUb, null), locala, paramj);
      locala.jjR = ((ImageView)localView.findViewById(R.h.bGW));
      locala.iiM = ((TextView)localView.findViewById(R.h.bHx));
      locala.iiM.setSingleLine(false);
      locala.iiM.setMaxLines(2);
      locala.iiN = ((TextView)localView.findViewById(R.h.bGI));
      locala.lXo = ((TextView)localView.findViewById(R.h.bHo));
      a(locala, paramj);
      localsp1 = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      localObject = paramj.field_favProto.tPN;
      localta = paramj.field_favProto.tQA;
      localTextView = locala.iiM;
      sp localsp2 = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      paramView = "";
      if (localObject != null) {
        paramView = ((tj)localObject).title;
      }
      paramViewGroup = paramView;
      if (bg.mZ(paramView))
      {
        paramViewGroup = paramView;
        if (localsp2 != null) {
          paramViewGroup = localsp2.title;
        }
      }
      if (!bg.mZ(paramViewGroup)) {
        break label486;
      }
      localTextView.setVisibility(8);
      label219:
      paramView = locala.iiN;
      paramViewGroup = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      paramView.setVisibility(8);
      if ((paramViewGroup != null) && (!bg.mZ(paramViewGroup.canvasPageXml)))
      {
        paramView.setVisibility(0);
        paramViewGroup = paramViewGroup.desc;
        if (!bg.mZ(paramViewGroup)) {
          break label501;
        }
        paramView.setVisibility(8);
      }
      label273:
      localTextView = locala.lXo;
      localsp2 = com.tencent.mm.plugin.favorite.b.x.n(paramj);
      paramView = "";
      if (localObject != null) {
        paramView = bg.RC(((tj)localObject).tRc);
      }
      localObject = paramView;
      if (localta != null)
      {
        if (bg.mZ(localta.appId)) {
          break label514;
        }
        paramViewGroup = bg.ap(com.tencent.mm.plugin.favorite.c.getAppName(localTextView.getContext(), localta.appId), "");
        label341:
        if (!bg.mZ(paramViewGroup))
        {
          localObject = paramViewGroup;
          if (!paramViewGroup.equals(localta.ftu)) {}
        }
        else
        {
          localObject = bg.RC(localta.hNh);
        }
      }
      if ((!bg.mZ((String)localObject)) && ((localsp2 == null) || (bg.mZ(localsp2.canvasPageXml)))) {
        break label593;
      }
      localTextView.setVisibility(8);
    }
    for (;;)
    {
      int j = com.tencent.mm.pluginsdk.c.Nd(localsp1.tOM);
      paramView = this.lNK;
      paramViewGroup = locala.jjR;
      int i = j;
      if (j == com.tencent.mm.pluginsdk.c.bFS()) {
        i = R.k.dlk;
      }
      paramView.a(paramViewGroup, localsp1, paramj, i, this.lXn, this.lXn);
      GMTrace.o(6420976107520L, 47840);
      return localView;
      locala = (a)paramView.getTag();
      localView = paramView;
      break;
      label486:
      localTextView.setText(paramViewGroup);
      localTextView.setVisibility(0);
      break label219;
      label501:
      paramView.setText(paramViewGroup);
      paramView.setVisibility(0);
      break label273;
      label514:
      paramViewGroup = paramView;
      if (bg.mZ(localta.ftu)) {
        break label341;
      }
      ap.AS();
      paramViewGroup = com.tencent.mm.x.c.yL().SL(localta.ftu);
      if ((paramViewGroup == null) || (!paramViewGroup.field_username.equals(localta.ftu)))
      {
        ag.a.hfr.a(localta.ftu, "", null);
        paramViewGroup = paramView;
        break label341;
      }
      paramViewGroup = paramViewGroup.vq();
      break label341;
      label593:
      localTextView.setText((CharSequence)localObject);
      localTextView.setVisibility(0);
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6421110325248L, 47841);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6421110325248L, 47841);
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
      GMTrace.i(6427150123008L, 47886);
      GMTrace.o(6427150123008L, 47886);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */