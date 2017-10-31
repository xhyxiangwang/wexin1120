package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.n;
import com.tencent.mm.av.t;
import com.tencent.mm.modelsns.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.dl;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class g
  extends BaseAdapter
{
  private final Activity fGo;
  final List<amn> fIU;
  private final com.tencent.mm.sdk.platformtools.ae handler;
  private String nkl;
  final Map<Integer, Integer> qwH;
  final Map<Integer, Integer> qwI;
  int qwJ;
  int qwK;
  private final b qwL;
  private final h qwM;
  final a qwN;
  
  public g(Activity paramActivity, String paramString, b paramb, a parama)
  {
    GMTrace.i(8314251378688L, 61946);
    this.fIU = new ArrayList();
    this.qwH = new HashMap();
    this.qwI = new HashMap();
    this.qwJ = 0;
    this.qwK = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.nkl = "";
    this.fGo = paramActivity;
    this.nkl = paramString;
    this.qwL = paramb;
    this.qwN = parama;
    this.qwM = new h(new h.a()
    {
      public final void a(List<amn> paramAnonymousList, Map<Integer, Integer> paramAnonymousMap1, Map<Integer, Integer> paramAnonymousMap2, int paramAnonymousInt1, int paramAnonymousInt2, dl paramAnonymousdl)
      {
        GMTrace.i(8516383277056L, 63452);
        w.d("MicroMsg.ArtistAdapter", "onFinishFixPos");
        g localg = g.this;
        if ((paramAnonymousList == null) || (paramAnonymousList.size() <= 0))
        {
          GMTrace.o(8516383277056L, 63452);
          return;
        }
        try
        {
          paramAnonymousdl = (dl)new dl().aC(paramAnonymousdl.toByteArray());
          localg.qwN.a(paramAnonymousdl);
          w.d("MicroMsg.ArtistAdapter", "copy list info");
          j = paramAnonymousList.size();
          localg.fIU.clear();
          localg.qwH.clear();
          localg.qwI.clear();
          i = 0;
          while (i < j)
          {
            paramAnonymousdl = (amn)paramAnonymousList.get(i);
            paramAnonymousdl = e.a(paramAnonymousdl.nas, paramAnonymousdl.jXP, paramAnonymousdl.mDo, paramAnonymousdl.uhA, paramAnonymousdl.uhz, paramAnonymousdl.uhB, paramAnonymousdl.mCK);
            localg.fIU.add(paramAnonymousdl);
            i += 1;
          }
        }
        catch (Exception paramAnonymousdl)
        {
          int j;
          int i;
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.ArtistAdapter", paramAnonymousdl, "", new Object[0]);
          }
          paramAnonymousdl = paramAnonymousMap1.keySet().iterator();
          while (paramAnonymousdl.hasNext())
          {
            i = ((Integer)paramAnonymousdl.next()).intValue();
            j = ((Integer)paramAnonymousMap1.get(Integer.valueOf(i))).intValue();
            localg.qwH.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousdl = paramAnonymousMap2.keySet().iterator();
          while (paramAnonymousdl.hasNext())
          {
            i = ((Integer)paramAnonymousdl.next()).intValue();
            j = ((Integer)paramAnonymousMap2.get(Integer.valueOf(i))).intValue();
            localg.qwI.put(Integer.valueOf(i), Integer.valueOf(j));
          }
          paramAnonymousList.clear();
          paramAnonymousMap1.clear();
          paramAnonymousMap2.clear();
          localg.qwK = paramAnonymousInt1;
          localg.qwJ = paramAnonymousInt2;
          w.d("MicroMsg.ArtistAdapter", "reallyCount " + paramAnonymousInt1 + " icount " + paramAnonymousInt2);
          localg.notifyDataSetChanged();
          GMTrace.o(8516383277056L, 63452);
        }
      }
      
      public final void bkL()
      {
        GMTrace.i(8516517494784L, 63453);
        g localg = g.this;
        if (localg.qwN != null) {
          localg.qwN.bkM();
        }
        GMTrace.o(8516517494784L, 63453);
      }
    });
    QA();
    GMTrace.o(8314251378688L, 61946);
  }
  
  private void a(int paramInt, ImageView paramImageView)
  {
    GMTrace.i(8315056685056L, 61952);
    amn localamn = (amn)getItem(paramInt);
    paramImageView.setVisibility(0);
    g.b.a locala = new g.b.a();
    locala.fMT = "";
    locala.position = paramInt;
    paramImageView.setTag(locala);
    com.tencent.mm.plugin.sns.model.ae.bhm().b(localamn, paramImageView, this.fGo.hashCode(), an.vfb);
    GMTrace.o(8315056685056L, 61952);
  }
  
  public final void QA()
  {
    GMTrace.i(8314385596416L, 61947);
    if (this.qwM != null)
    {
      t.Kg();
      String str = n.Kc();
      w.d("MicroMsg.ArtistAdapter", "packgePath: " + str);
      this.qwM.dD(this.nkl, str);
    }
    GMTrace.o(8314385596416L, 61947);
  }
  
  public final int getCount()
  {
    GMTrace.i(8314519814144L, 61948);
    int i = this.qwJ;
    GMTrace.o(8314519814144L, 61948);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(8314654031872L, 61949);
    Object localObject = this.fIU.get(paramInt);
    GMTrace.o(8314654031872L, 61949);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(8314788249600L, 61950);
    GMTrace.o(8314788249600L, 61950);
    return 0L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8314922467328L, 61951);
    if (paramView == null)
    {
      paramViewGroup = new c();
      paramView = View.inflate(this.fGo, i.g.pOD, null);
      paramViewGroup.jaE = ((TextView)paramView.findViewById(i.f.pNk));
      paramViewGroup.qwU = ((TextView)paramView.findViewById(i.f.pNl));
      paramViewGroup.qwV = ((ImageView)paramView.findViewById(i.f.pKb));
      paramViewGroup.qwW = ((ImageView)paramView.findViewById(i.f.pKc));
      paramViewGroup.qwX = ((ImageView)paramView.findViewById(i.f.pKd));
      paramViewGroup.qwY = ((LinearLayout)paramView.findViewById(i.f.pKt));
      paramViewGroup.qwZ = paramView.findViewById(i.f.pKq);
      paramViewGroup.qwV.setOnClickListener(this.qwL.qwP);
      paramViewGroup.qwW.setOnClickListener(this.qwL.qwQ);
      paramViewGroup.qwX.setOnClickListener(this.qwL.qwR);
      paramView.setTag(paramViewGroup);
      if (this.qwH.get(Integer.valueOf(paramInt)) == null) {
        break label632;
      }
    }
    label356:
    label576:
    label632:
    for (int i = ((Integer)this.qwH.get(Integer.valueOf(paramInt))).intValue();; i = -1)
    {
      paramViewGroup.qwV.setVisibility(8);
      paramViewGroup.qwW.setVisibility(8);
      paramViewGroup.qwX.setVisibility(8);
      paramViewGroup.qwZ.setVisibility(8);
      if (paramViewGroup.qwO.nkl.equals("en"))
      {
        paramViewGroup.jaE.setVisibility(8);
        paramViewGroup.qwU.setVisibility(4);
      }
      for (;;)
      {
        if ((i < this.qwK) && (i != -1)) {
          break label356;
        }
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
        paramView.setVisibility(8);
        GMTrace.o(8314922467328L, 61951);
        return paramView;
        paramViewGroup = (c)paramView.getTag();
        break;
        paramViewGroup.jaE.setVisibility(4);
        paramViewGroup.qwU.setVisibility(8);
      }
      if (i - 1 >= 0) {}
      for (String str = ((amn)getItem(i - 1)).mCK;; str = "")
      {
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        paramView.setVisibility(0);
        if (this.qwI.get(Integer.valueOf(paramInt)) != null) {}
        for (paramInt = ((Integer)this.qwI.get(Integer.valueOf(paramInt))).intValue();; paramInt = 1)
        {
          amn localamn = (amn)getItem(i);
          if ((localamn.mCK.equals("")) || (!localamn.mCK.equals(str)))
          {
            if (!this.nkl.equals("en")) {
              break label576;
            }
            paramViewGroup.qwU.setVisibility(0);
            paramViewGroup.qwU.setText(localamn.mCK);
            paramViewGroup.qwZ.setVisibility(0);
          }
          for (;;)
          {
            if (paramInt > 0) {
              a(i, paramViewGroup.qwV);
            }
            if (paramInt >= 2) {
              a(i + 1, paramViewGroup.qwW);
            }
            if (paramInt < 3) {
              break;
            }
            a(i + 2, paramViewGroup.qwX);
            break;
            paramViewGroup.jaE.setVisibility(0);
            paramViewGroup.jaE.setText(localamn.mCK);
            paramViewGroup.qwZ.setVisibility(0);
          }
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(dl paramdl);
    
    public abstract void bkM();
  }
  
  static abstract class b
  {
    View.OnClickListener qwP;
    View.OnClickListener qwQ;
    View.OnClickListener qwR;
    public a qwS;
    
    public b()
    {
      GMTrace.i(8555977506816L, 63747);
      this.qwS = new a();
      this.qwP = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8366327857152L, 62334);
          g.b.this.qwS = ((g.b.a)paramAnonymousView.getTag());
          int i = g.b.this.qwS.position;
          g.b.this.uK(i);
          GMTrace.o(8366327857152L, 62334);
        }
      };
      this.qwQ = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8389144870912L, 62504);
          g.b.this.qwS = ((g.b.a)paramAnonymousView.getTag());
          int i = g.b.this.qwS.position;
          g.b.this.uK(i);
          GMTrace.o(8389144870912L, 62504);
        }
      };
      this.qwR = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8657848762368L, 64506);
          g.b.this.qwS = ((g.b.a)paramAnonymousView.getTag());
          int i = g.b.this.qwS.position;
          g.b.this.uK(i);
          GMTrace.o(8657848762368L, 64506);
        }
      };
      GMTrace.o(8555977506816L, 63747);
    }
    
    public abstract void uK(int paramInt);
    
    public static final class a
    {
      public String fMT;
      public int position;
      
      public a()
      {
        GMTrace.i(8613422694400L, 64175);
        GMTrace.o(8613422694400L, 64175);
      }
    }
  }
  
  final class c
  {
    TextView jaE;
    TextView qwU;
    ImageView qwV;
    ImageView qwW;
    ImageView qwX;
    LinearLayout qwY;
    View qwZ;
    
    c()
    {
      GMTrace.i(8469004419072L, 63099);
      GMTrace.o(8469004419072L, 63099);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */