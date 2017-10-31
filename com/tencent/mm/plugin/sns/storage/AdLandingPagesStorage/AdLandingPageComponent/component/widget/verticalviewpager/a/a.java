package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  extends RecyclerView.a<RecyclerView.t>
  implements b.b
{
  int bgColor;
  private Context context;
  private int kic;
  private int kid;
  private LinearLayoutManager qpe;
  c qtb;
  LinkedHashMap<String, i> qtc;
  private LayoutInflater qtd;
  
  public a(c paramc, int paramInt, Context paramContext, LinearLayoutManager paramLinearLayoutManager)
  {
    GMTrace.i(17107794264064L, 127463);
    this.qpe = paramLinearLayoutManager;
    this.qtb = paramc;
    this.qtc = new LinkedHashMap();
    this.bgColor = paramInt;
    this.context = paramContext;
    this.qtd = ((LayoutInflater)this.context.getSystemService("layout_inflater"));
    paramc = ab.de(this.context);
    this.kic = paramc[0];
    this.kid = paramc[1];
    GMTrace.o(17107794264064L, 127463);
  }
  
  private int a(i parami)
  {
    GMTrace.i(17108465352704L, 127468);
    if (parami != null)
    {
      View localView = parami.getView();
      int[] arrayOfInt = new int[2];
      localView.getLocationOnScreen(arrayOfInt);
      int i = arrayOfInt[1];
      int j = localView.getHeight() + i;
      w.v("ContentAdapter", "comp %s , top %d,bottom %d ", new Object[] { parami, Integer.valueOf(i), Integer.valueOf(j) });
      if ((i >= 0) && (j <= this.kid))
      {
        i = localView.getHeight();
        GMTrace.o(17108465352704L, 127468);
        return i;
      }
      if ((i < 0) && (j > 0) && (j <= this.kid))
      {
        GMTrace.o(17108465352704L, 127468);
        return j;
      }
      if ((i < 0) && (j > this.kid))
      {
        i = this.kid;
        GMTrace.o(17108465352704L, 127468);
        return i;
      }
      if ((i < this.kid) && (j > this.kid))
      {
        j = this.kid;
        GMTrace.o(17108465352704L, 127468);
        return j - i;
      }
    }
    GMTrace.o(17108465352704L, 127468);
    return 0;
  }
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(17107928481792L, 127464);
    paramViewGroup = new a(LayoutInflater.from(paramViewGroup.getContext()).inflate(i.g.pNQ, paramViewGroup, false));
    GMTrace.o(17107928481792L, 127464);
    return paramViewGroup;
  }
  
  public final void a(int paramInt, b paramb)
  {
    GMTrace.i(17108599570432L, 127469);
    Object localObject1 = (p)this.qtb.qtX.get(paramInt);
    i locali = (i)this.qtc.get(((p)localObject1).qno);
    if (locali != null)
    {
      locali.biv();
      Object localObject2 = locali.getView();
      locali.O(a(locali), ((View)localObject2).getHeight(), this.kid);
      if ((((p)localObject1).type == 61) || (((p)localObject1).type == 62))
      {
        localObject1 = new ArrayList();
        paramb = paramb.qpd.entrySet().iterator();
        while (paramb.hasNext())
        {
          localObject2 = (Map.Entry)paramb.next();
          if (((b.a)((Map.Entry)localObject2).getValue()).qmD) {
            ((List)localObject1).add(((Map.Entry)localObject2).getKey());
          }
        }
        paramb = ((List)localObject1).iterator();
        while (paramb.hasNext())
        {
          int i = ((Integer)paramb.next()).intValue();
          if ((i != paramInt) && (uy(i)))
          {
            localObject1 = (p)this.qtb.qtX.get(i);
            localObject1 = (i)this.qtc.get(((p)localObject1).qno);
            if ((localObject1 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a))
            {
              localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1;
              if ((((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1).qmB) && (this.qtb.qtY) && (i == 0)) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)locali).bit();
              } else if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)locali).qmB) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1).bit();
              }
            }
          }
        }
      }
    }
    GMTrace.o(17108599570432L, 127469);
  }
  
  public final void a(RecyclerView.t paramt, int paramInt)
  {
    GMTrace.i(17108062699520L, 127465);
    w.i("ContentAdapter", "display page " + this.qtb.id + ", pos " + paramInt);
    a locala = (a)paramt;
    locala.jyN.removeAllViews();
    p localp = (p)this.qtb.qtX.get(paramInt);
    paramt = (i)this.qtc.get(localp.qno);
    if (paramt != null) {
      paramt.a((p)this.qtb.qtX.get(paramInt));
    }
    for (;;)
    {
      if (paramt != null)
      {
        if ((paramt.getView().getParent() != null) && ((paramt.getView().getParent() instanceof ViewGroup))) {
          ((ViewGroup)paramt.getView().getParent()).removeView(paramt.getView());
        }
        locala.jyN.addView(paramt.getView());
      }
      GMTrace.o(17108062699520L, 127465);
      return;
      i locali = am.a(locala.jyN.getContext(), localp, locala.jyN, this.bgColor);
      paramt = locali;
      if (locali != null)
      {
        this.qtc.put(localp.qno, locali);
        paramt = locali;
      }
    }
  }
  
  public final int getItemCount()
  {
    GMTrace.i(17108196917248L, 127466);
    int i = this.qtb.qtX.size();
    GMTrace.o(17108196917248L, 127466);
    return i;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(17836193873920L, 132890);
    GMTrace.o(17836193873920L, 132890);
    return paramInt;
  }
  
  public final void onDestroy()
  {
    GMTrace.i(17108868005888L, 127471);
    Iterator localIterator = this.qtc.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((i)((Map.Entry)localIterator.next()).getValue()).biu();
    }
    GMTrace.o(17108868005888L, 127471);
  }
  
  public final void ux(int paramInt)
  {
    GMTrace.i(17108733788160L, 127470);
    Object localObject = (p)this.qtb.qtX.get(paramInt);
    localObject = (i)this.qtc.get(((p)localObject).qno);
    if (localObject != null) {
      ((i)localObject).biw();
    }
    GMTrace.o(17108733788160L, 127470);
  }
  
  public final boolean uy(int paramInt)
  {
    GMTrace.i(17108331134976L, 127467);
    if ((paramInt < this.qpe.fa()) || (paramInt > this.qpe.fb()))
    {
      w.v("ContentAdapter", "index %d not visible");
      GMTrace.o(17108331134976L, 127467);
      return false;
    }
    Object localObject = (p)this.qtb.qtX.get(paramInt);
    localObject = (i)this.qtc.get(((p)localObject).qno);
    if (localObject != null)
    {
      paramInt = a((i)localObject);
      w.v("ContentAdapter", "comp %s, inScreenH %d", new Object[] { localObject, Integer.valueOf(paramInt) });
      if (paramInt >= ((i)localObject).getView().getHeight() >>> 1)
      {
        GMTrace.o(17108331134976L, 127467);
        return true;
      }
      GMTrace.o(17108331134976L, 127467);
      return false;
    }
    GMTrace.o(17108331134976L, 127467);
    return false;
  }
  
  public final class a
    extends RecyclerView.t
  {
    public LinearLayout jyN;
    
    public a(View paramView)
    {
      super();
      GMTrace.i(17107660046336L, 127462);
      this.jyN = ((LinearLayout)paramView.findViewById(i.f.cse));
      GMTrace.o(17107660046336L, 127462);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */