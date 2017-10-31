package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.as.b;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.t;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class h
  extends a
{
  private final int lXn;
  private Set<ImageView> lXy;
  private View.OnClickListener lXz;
  
  public h(com.tencent.mm.plugin.favorite.c.g paramg)
  {
    super(paramg);
    GMTrace.i(6429566042112L, 47904);
    this.lXz = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6418694406144L, 47823);
        if (!f.tD())
        {
          t.fn(h.this.lNK.context);
          GMTrace.o(6418694406144L, 47823);
          return;
        }
        Object localObject;
        ta localta;
        sp localsp;
        if ((paramAnonymousView.getTag() instanceof j))
        {
          localObject = (j)paramAnonymousView.getTag();
          localta = ((j)localObject).field_favProto.tQA;
          localsp = x.n((j)localObject);
          if (localsp == null)
          {
            w.w("MicroMsg.FavBaseListItem", "data item is null");
            GMTrace.o(6418694406144L, 47823);
            return;
          }
          if (e.l(localsp))
          {
            w.i("MicroMsg.FavBaseListItem", "same song, do release");
            b.JL();
            h.this.c(null);
            GMTrace.o(6418694406144L, 47823);
            return;
          }
          localObject = new File(x.h(localsp));
          if (((File)localObject).exists()) {
            break label293;
          }
          if (localsp.fwl != null) {
            break label234;
          }
          localObject = "";
        }
        for (;;)
        {
          b.b(((com.tencent.mm.as.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.as.a.a.class)).a(6, null, localsp.title, localsp.desc, localsp.tOE, localsp.tOI, localsp.tOG, localsp.lUP, x.axc(), (String)localObject, "", localta.appId));
          h.this.c((ImageView)paramAnonymousView);
          GMTrace.o(6418694406144L, 47823);
          return;
          label234:
          localObject = new File(x.axa() + com.tencent.mm.a.g.n(localsp.fwl.getBytes()));
          if (((File)localObject).exists()) {}
          for (localObject = ((File)localObject).getAbsolutePath();; localObject = "") {
            break;
          }
          label293:
          localObject = ((File)localObject).getAbsolutePath();
        }
      }
    };
    this.lXn = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 60);
    this.lXy = new HashSet();
    GMTrace.o(6429566042112L, 47904);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6429700259840L, 47905);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, R.i.cUb, null), paramViewGroup, paramj);
      paramViewGroup.lVi = ((MMImageView)paramView.findViewById(R.h.bGW));
      paramViewGroup.iiM = ((TextView)paramView.findViewById(R.h.bHx));
      paramViewGroup.iiN = ((TextView)paramView.findViewById(R.h.bGI));
      paramViewGroup.lXB = ((ImageView)paramView.findViewById(R.h.bGY));
      paramViewGroup.lXo = ((TextView)paramView.findViewById(R.h.bHo));
      paramViewGroup.lXo.setVisibility(8);
      paramViewGroup.lXB.setOnClickListener(this.lXz);
      paramViewGroup.lXB.setVisibility(0);
      this.lXy.add(paramViewGroup.lXB);
      a(paramViewGroup, paramj);
      localObject = paramj.field_favProto.tQA;
      localObject = x.n(paramj);
      paramViewGroup.iiM.setText(((sp)localObject).title);
      paramViewGroup.iiN.setText(((sp)localObject).desc);
      this.lNK.a(paramViewGroup.lVi, (sp)localObject, paramj, R.k.dob, this.lXn, this.lXn);
      paramViewGroup.lXB.setTag(paramj);
      if (!e.l((sp)localObject)) {
        break label271;
      }
      paramViewGroup.lXB.setImageResource(R.g.baP);
    }
    for (;;)
    {
      GMTrace.o(6429700259840L, 47905);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label271:
      paramViewGroup.lXB.setImageResource(R.g.baQ);
    }
  }
  
  public final void c(ImageView paramImageView)
  {
    GMTrace.i(16031904956416L, 119447);
    w.i("MicroMsg.FavBaseListItem", "mask iv set size is %d", new Object[] { Integer.valueOf(this.lXy.size()) });
    Iterator localIterator = this.lXy.iterator();
    while (localIterator.hasNext())
    {
      ImageView localImageView = (ImageView)localIterator.next();
      if (localImageView == paramImageView) {
        localImageView.setImageResource(R.g.baP);
      } else {
        localImageView.setImageResource(R.g.baQ);
      }
    }
    GMTrace.o(16031904956416L, 119447);
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6429834477568L, 47906);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6429834477568L, 47906);
  }
  
  public static final class a
    extends a.b
  {
    TextView iiM;
    TextView iiN;
    MMImageView lVi;
    ImageView lXB;
    TextView lXo;
    
    public a()
    {
      GMTrace.i(6432518832128L, 47926);
      GMTrace.o(6432518832128L, 47926);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */