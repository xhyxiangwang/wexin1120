package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.plugin.favorite.c.g.2;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class j
  extends a
{
  private final String lXC;
  private final SparseIntArray lXD;
  private HashMap<String, SpannableString> lXE;
  private final int lXn;
  
  public j(g paramg)
  {
    super(paramg);
    GMTrace.i(6420170801152L, 47834);
    this.lXD = new SparseIntArray();
    this.lXE = new HashMap();
    this.lXn = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 60);
    this.lXC = " ";
    GMTrace.o(6420170801152L, 47834);
  }
  
  private static void a(TextView paramTextView1, TextView paramTextView2, sp paramsp)
  {
    GMTrace.i(6420439236608L, 47836);
    if (!paramsp.tPu)
    {
      w.d("MicroMsg.FavRecordListItem", "has no datasrcname");
      paramTextView1.setVisibility(8);
      w.d("MicroMsg.FavRecordListItem", "field type %d", new Object[] { Integer.valueOf(paramsp.aHe) });
      switch (paramsp.aHe)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView1.setVisibility(0);
      paramTextView1.setText(h.b(paramTextView1.getContext(), paramsp.tPt, paramTextView1.getTextSize()));
      break;
      paramTextView2.setText(h.b(paramTextView2.getContext(), paramsp.desc, paramTextView2.getTextSize()));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dYc));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dYa) + paramsp.title);
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dXY) + paramsp.title);
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView1 = paramsp.tPr.tPL;
      paramsp = new StringBuilder().append(y(paramTextView2.getContext(), R.l.dXX));
      if (bg.mZ(paramTextView1.fJh)) {}
      for (paramTextView1 = paramTextView1.label;; paramTextView1 = paramTextView1.fJh)
      {
        paramTextView2.setText(paramTextView1);
        GMTrace.o(6420439236608L, 47836);
        return;
      }
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dXV) + paramsp.title);
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dXT));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dYb));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dXW));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dXh) + paramsp.tPr.tPP.title);
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dWU));
      GMTrace.o(6420439236608L, 47836);
      return;
      paramTextView2.setText(y(paramTextView2.getContext(), R.l.dXZ));
    }
  }
  
  private static String y(Context paramContext, int paramInt)
  {
    GMTrace.i(6420573454336L, 47837);
    paramContext = "[" + paramContext.getResources().getString(paramInt) + "]";
    GMTrace.o(6420573454336L, 47837);
    return paramContext;
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.favorite.b.j paramj)
  {
    GMTrace.i(6420305018880L, 47835);
    Object localObject1 = paramViewGroup.getContext();
    int k;
    int m;
    int i;
    boolean bool;
    int j;
    if (paramView == null)
    {
      paramViewGroup = new a();
      localObject1 = a(View.inflate((Context)localObject1, R.i.cUe, null), paramViewGroup, paramj);
      paramViewGroup.jjR = ((ImageView)((View)localObject1).findViewById(R.h.bGW));
      paramViewGroup.lXH = ((TextView)((View)localObject1).findViewById(R.h.bHy));
      paramViewGroup.lXI = ((TextView)((View)localObject1).findViewById(R.h.bGJ));
      paramViewGroup.lXJ = ((TextView)((View)localObject1).findViewById(R.h.bHz));
      paramViewGroup.lXK = ((TextView)((View)localObject1).findViewById(R.h.bGK));
      paramViewGroup.lXF = ((ImageView)((View)localObject1).findViewById(R.h.bHa));
      paramViewGroup.lXG = ((ImageView)((View)localObject1).findViewById(R.h.bGZ));
      paramViewGroup.lXL = ((FrameLayout)((View)localObject1).findViewById(R.h.bGX));
      a(paramViewGroup, paramj);
      paramView = paramj.field_favProto.tQC;
      localObject2 = paramView.iterator();
      k = 0;
      m = 0;
      i = 0;
      bool = false;
      j = 0;
      label200:
      if (!((Iterator)localObject2).hasNext()) {
        break label357;
      }
      switch (((sp)((Iterator)localObject2).next()).aHe)
      {
      }
    }
    for (;;)
    {
      i += 1;
      break label200;
      paramViewGroup = (a)paramView.getTag();
      localObject1 = paramView;
      break;
      if (!bool)
      {
        m = i;
        bool = true;
        continue;
        if (j == 0)
        {
          j = 1;
          k = i;
        }
      }
    }
    label357:
    w.d("MicroMsg.FavRecordListItem", "hasThumb %s, firstRemarkIndex %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(k) });
    if (paramView.size() <= 0)
    {
      w.w("MicroMsg.FavRecordListItem", "dataList size is null");
      GMTrace.o(6420305018880L, 47835);
      return (View)localObject1;
    }
    Object localObject2 = (sp)paramView.get(k);
    a(paramViewGroup.lXH, paramViewGroup.lXI, (sp)localObject2);
    sp localsp;
    label538:
    g localg;
    if (bool)
    {
      paramViewGroup.lXL.setVisibility(0);
      paramViewGroup.jjR.setVisibility(0);
      localObject2 = paramViewGroup.jjR;
      localsp = (sp)paramView.get(m);
      switch (localsp.aHe)
      {
      default: 
      case 2: 
        String str;
        do
        {
          do
          {
            for (;;)
            {
              paramViewGroup.lXJ.setVisibility(8);
              paramViewGroup.lXK.setVisibility(8);
              GMTrace.o(6420305018880L, 47835);
              return (View)localObject1;
              localg = this.lNK;
              i = R.k.dqu;
              j = this.lXn;
              k = this.lXn;
              if (localObject2 != null)
              {
                if (f.tD()) {
                  break;
                }
                ((ImageView)localObject2).setImageResource(R.g.bbq);
              }
            }
          } while ((localsp == null) || (paramj == null));
          str = localsp.lUP;
        } while (str == null);
        paramView = null;
        if (localsp.lUP != null)
        {
          paramView = (String[])localg.lQD.get(str);
          if (paramView != null) {
            break label883;
          }
          paramView = new String[2];
          paramView[0] = x.g(localsp);
          paramView[1] = x.h(localsp);
          localg.lQD.put(str, paramView);
        }
        break;
      }
    }
    label883:
    for (;;)
    {
      localg.lQC.a((ImageView)localObject2, paramView, null, i, j, k);
      if ((paramView == null) || (paramView.length <= 0)) {
        break;
      }
      paramView = paramView[0];
      ap.xC().C(new g.2(localg, paramView, paramj, localsp));
      break;
      this.lNK.b((ImageView)localObject2, localsp, paramj, R.k.doh, this.lXn, this.lXn);
      break;
      paramViewGroup.lXL.setVisibility(8);
      paramViewGroup.jjR.setVisibility(8);
      if (k + 1 < paramView.size())
      {
        paramViewGroup.lXJ.setVisibility(0);
        paramViewGroup.lXK.setVisibility(0);
        a(paramViewGroup.lXJ, paramViewGroup.lXK, (sp)paramView.get(k + 1));
        break label538;
      }
      w.d("MicroMsg.FavRecordListItem", "outofbound %d, size %d", new Object[] { Integer.valueOf(k), Integer.valueOf(paramView.size()) });
      paramViewGroup.lXJ.setVisibility(8);
      paramViewGroup.lXK.setVisibility(8);
      break label538;
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6420707672064L, 47838);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6420707672064L, 47838);
  }
  
  public static final class a
    extends a.b
  {
    ImageView jjR;
    ImageView lXF;
    ImageView lXG;
    TextView lXH;
    TextView lXI;
    TextView lXJ;
    TextView lXK;
    FrameLayout lXL;
    
    public a()
    {
      GMTrace.i(6418828623872L, 47824);
      GMTrace.o(6418828623872L, 47824);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */