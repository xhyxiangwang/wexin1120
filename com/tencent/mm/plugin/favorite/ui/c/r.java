package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.im;
import com.tencent.mm.g.a.im.b;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
  extends a
{
  private static int lXp;
  private static int lXq;
  private final String lXC;
  private final SparseIntArray lXD;
  private HashMap<String, SpannableString> lXE;
  private final int lXn;
  
  public r(g paramg)
  {
    super(paramg);
    GMTrace.i(6429163388928L, 47901);
    this.lXD = new SparseIntArray();
    this.lXE = new HashMap();
    this.lXn = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 60);
    this.lXC = " ";
    lXq = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 138);
    lXp = com.tencent.mm.bq.a.fromDPToPix(paramg.context, 230);
    GMTrace.o(6429163388928L, 47901);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, j paramj)
  {
    GMTrace.i(6429297606656L, 47902);
    Context localContext = paramViewGroup.getContext();
    LinkedList localLinkedList;
    int i4;
    int i5;
    int i;
    int j;
    int k;
    int n;
    boolean bool;
    int m;
    int i1;
    int i2;
    int i3;
    label267:
    final Object localObject3;
    Object localObject2;
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate(localContext, R.i.cUh, null), paramViewGroup, paramj);
      paramViewGroup.jjR = ((ImageView)paramView.findViewById(R.h.bGW));
      paramViewGroup.lXL = ((FrameLayout)paramView.findViewById(R.h.bGX));
      paramViewGroup.lXH = ((TextView)paramView.findViewById(R.h.bHy));
      paramViewGroup.lXI = ((TextView)paramView.findViewById(R.h.bGJ));
      paramViewGroup.lXT = ((LinearLayout)paramView.findViewById(R.h.bHv));
      paramViewGroup.lXF = ((ImageView)paramView.findViewById(R.h.bHa));
      paramViewGroup.lXG = ((ImageView)paramView.findViewById(R.h.bGZ));
      paramViewGroup.lXS = ((TextView)paramView.findViewById(R.h.bHC));
      paramViewGroup.lXU = ((ImageView)paramView.findViewById(R.h.bHf));
      paramViewGroup.lXV = ((TextView)paramView.findViewById(R.h.bHg));
      paramViewGroup.lXW = ((TextView)paramView.findViewById(R.h.bHe));
      paramViewGroup.lXX = ((LinearLayout)paramView.findViewById(R.h.bGc));
      a(paramViewGroup, paramj);
      localLinkedList = paramj.field_favProto.tQC;
      localObject1 = localLinkedList.iterator();
      i4 = 0;
      i5 = 0;
      i = 0;
      j = 0;
      k = 0;
      n = 0;
      bool = false;
      m = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      if (!((Iterator)localObject1).hasNext()) {
        break label922;
      }
      localObject3 = (sp)((Iterator)localObject1).next();
      if (i != 0) {
        break label406;
      }
      localObject2 = new File(x.g((sp)localObject3));
      if (((File)localObject2).exists()) {
        break label342;
      }
      g.a(paramj, (sp)localObject3);
    }
    for (;;)
    {
      i += 1;
      break label267;
      paramViewGroup = (a)paramView.getTag();
      break;
      label342:
      if (((sp)localObject3).tPz == null)
      {
        localObject3 = new ke();
        ((ke)localObject3).fHu.type = 10;
        ((ke)localObject3).fHu.field_localId = paramj.field_localId;
        ((ke)localObject3).fHu.path = ((File)localObject2).getAbsolutePath();
        com.tencent.mm.sdk.b.a.uLm.m((b)localObject3);
      }
    }
    label406:
    label488:
    int i6;
    int i7;
    int i8;
    switch (((sp)localObject3).aHe)
    {
    case 9: 
    case 12: 
    case 13: 
    case 15: 
    default: 
      i6 = i3;
      i7 = i2;
      i8 = i1;
      i3 = j;
      i2 = k;
      i1 = n;
      n = m;
      m = i8;
      k = i7;
      j = i6;
    }
    for (;;)
    {
      i8 = i + 1;
      i = i3;
      i6 = i2;
      i7 = i1;
      i3 = j;
      i2 = k;
      i1 = m;
      m = n;
      n = i7;
      k = i6;
      j = i;
      i = i8;
      break;
      if (bool) {
        break label488;
      }
      i5 = i;
      i6 = m;
      bool = true;
      i7 = n;
      i8 = k;
      int i9 = j;
      j = i3;
      k = i2;
      m = i1;
      n = i6;
      i1 = i7;
      i2 = i8;
      i3 = i9;
      continue;
      if (i3 != 0) {
        break label488;
      }
      localObject2 = ((sp)localObject3).desc;
      if ((bg.mZ((String)localObject2)) || (bg.mZ(((String)localObject2).replaceAll("\n", "").trim()))) {
        break label488;
      }
      i7 = 1;
      i3 = k;
      k = i2;
      i6 = j;
      n = i1;
      i2 = m;
      i1 = i;
      j = i7;
      m = n;
      n = i2;
      i2 = i3;
      i3 = i6;
      continue;
      if (m != 0) {
        break label488;
      }
      k = i3;
      i3 = j;
      m = i2;
      i6 = i1;
      i7 = 1;
      i1 = n;
      i2 = i;
      j = k;
      k = m;
      m = i6;
      n = i7;
      continue;
      if (i2 != 0) {
        break label488;
      }
      j = i3;
      i8 = 1;
      i2 = m;
      i6 = n;
      i7 = k;
      i3 = i;
      k = i8;
      m = i1;
      n = i2;
      i1 = i6;
      i2 = i7;
      continue;
      if (!c.sRV) {
        ap.xC().C(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6419768147968L, 47831);
            if ((localObject3.tPr == null) || (localObject3.tPr.tPL == null))
            {
              GMTrace.o(6419768147968L, 47831);
              return;
            }
            Object localObject = new im();
            ((im)localObject).fFd.fFh = ((float)localObject3.tPr.tPL.lat);
            ((im)localObject).fFd.fFi = ((float)localObject3.tPr.tPL.lng);
            ((im)localObject).fFd.fFj = localObject3.tPr.tPL.fFj;
            ((im)localObject).fFd.fFf = 1;
            com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
            localObject = ((im)localObject).fFe.path;
            if (!com.tencent.mm.a.e.aZ((String)localObject))
            {
              im localim = new im();
              localim.fFd.fFh = ((float)localObject3.tPr.tPL.lat);
              localim.fFd.fFi = ((float)localObject3.tPr.tPL.lng);
              localim.fFd.fFj = localObject3.tPr.tPL.fFj;
              localim.fFd.height = 450;
              localim.fFd.width = 600;
              localim.fFd.filename = ((String)localObject);
              localim.fFd.fFf = 2;
              com.tencent.mm.sdk.b.a.uLm.m(localim);
            }
            GMTrace.o(6419768147968L, 47831);
          }
          
          public final String toString()
          {
            GMTrace.i(6419902365696L, 47832);
            String str = super.toString() + "|getlocationthumb";
            GMTrace.o(6419902365696L, 47832);
            return str;
          }
        });
      }
      if (i1 != 0) {
        break label488;
      }
      i7 = i3;
      i4 = i;
      i8 = i2;
      i9 = 1;
      i1 = m;
      i2 = n;
      i3 = k;
      i6 = j;
      j = i7;
      k = i8;
      m = i9;
      n = i1;
      i1 = i2;
      i2 = i3;
      i3 = i6;
    }
    label922:
    w.d("MicroMsg.FavWNNoteListItem", "hasThumb %s, firstRemarkIndex %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(0) });
    paramViewGroup.lXL.setVisibility(8);
    paramViewGroup.lXT.setVisibility(8);
    paramViewGroup.lXX.setVisibility(8);
    paramViewGroup.lXH.setVisibility(8);
    paramViewGroup.lXI.setVisibility(8);
    paramViewGroup.lXF.setVisibility(8);
    paramViewGroup.lXS.setVisibility(8);
    if (localLinkedList.size() < 2)
    {
      w.w("MicroMsg.FavWNNoteListItem", "dataList size is null");
      GMTrace.o(6429297606656L, 47902);
      return paramView;
    }
    if (i3 != 0)
    {
      paramViewGroup.lXT.setVisibility(0);
      localObject2 = ((sp)localLinkedList.get(n)).desc;
      localObject1 = localObject2;
      if (((String)localObject2).length() > 100) {
        localObject1 = ((String)localObject2).substring(0, 100);
      }
      if (bg.mZ((String)localObject1)) {
        break label2039;
      }
    }
    label1518:
    label1612:
    label2030:
    label2033:
    label2039:
    for (Object localObject1 = ((String)localObject1).replaceAll("&lt;", "<").replaceAll("&gt;", ">").split("\n");; localObject1 = null)
    {
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        localObject3 = new ArrayList();
        i = 0;
        if (i >= localObject1.length) {
          break label2033;
        }
        if (!bg.mZ(localObject1[i])) {
          ((ArrayList)localObject3).add(localObject1[i]);
        }
      }
      for (;;)
      {
        i += 1;
        localObject2 = "";
        for (;;)
        {
          if (i < localObject1.length)
          {
            localObject2 = (String)localObject2 + localObject1[i] + " ";
            i += 1;
            continue;
            i += 1;
            break;
          }
        }
        localObject1 = ((String)localObject2).trim();
        if (((String)localObject1).length() > 0) {
          ((ArrayList)localObject3).add(localObject1);
        }
        if (((ArrayList)localObject3).size() > 1)
        {
          paramViewGroup.lXI.setVisibility(0);
          paramViewGroup.lXH.setVisibility(0);
          paramViewGroup.lXH.setText(h.b(paramViewGroup.lXH.getContext(), (CharSequence)((ArrayList)localObject3).get(0), paramViewGroup.lXH.getTextSize()));
          paramViewGroup.lXI.setText(h.b(paramViewGroup.lXI.getContext(), (CharSequence)((ArrayList)localObject3).get(1), paramViewGroup.lXI.getTextSize()));
          if (!bool) {
            break label1612;
          }
          paramViewGroup.lXX.setVisibility(8);
          paramViewGroup.lXL.setVisibility(0);
          paramViewGroup.jjR.setVisibility(0);
          if (((sp)localLinkedList.get(i5)).aHe != 2) {
            break label1518;
          }
          g.a(paramViewGroup.jjR, R.k.dol, (sp)localLinkedList.get(i5), paramj, true, lXp, lXq);
        }
        for (;;)
        {
          GMTrace.o(6429297606656L, 47902);
          return paramView;
          if (((ArrayList)localObject3).size() != 1) {
            break;
          }
          paramViewGroup.lXI.setVisibility(8);
          paramViewGroup.lXH.setVisibility(0);
          paramViewGroup.lXH.setText(h.b(paramViewGroup.lXH.getContext(), (CharSequence)((ArrayList)localObject3).get(0), paramViewGroup.lXH.getTextSize()));
          break;
          paramViewGroup.lXF.setVisibility(0);
          paramViewGroup.lXS.setVisibility(0);
          this.lNK.a(paramViewGroup.jjR, (sp)localLinkedList.get(i5), paramj, ((sp)localLinkedList.get(i5)).fwl, R.k.doh, lXp, lXq);
          paramViewGroup.lXS.setText(u.t(localContext, ((sp)localLinkedList.get(i5)).duration));
        }
        if (i1 != 0)
        {
          localObject1 = (sp)localLinkedList.get(i4);
          paramViewGroup.lXL.setVisibility(8);
          paramViewGroup.jjR.setVisibility(8);
          paramViewGroup.lXX.setVisibility(0);
          paramViewGroup.lXU.setImageResource(R.k.doa);
          paramj = ((sp)localObject1).tPr.tPL;
          localObject1 = ((sp)localObject1).tPr.iDL;
          if (bg.mZ((String)localObject1)) {
            if (bg.mZ(paramj.fJh))
            {
              paramViewGroup.lXV.setText(paramj.label);
              paramViewGroup.lXW.setText(R.l.dXf);
            }
          }
          for (;;)
          {
            GMTrace.o(6429297606656L, 47902);
            return paramView;
            paramViewGroup.lXV.setText(paramj.fJh);
            paramViewGroup.lXW.setText(paramj.label);
            continue;
            paramViewGroup.lXV.setText((CharSequence)localObject1);
            if (bg.mZ(paramj.fJh)) {
              paramViewGroup.lXW.setText(paramj.label);
            } else {
              paramViewGroup.lXW.setText(paramj.fJh);
            }
          }
        }
        if (m != 0)
        {
          localObject1 = (sp)localLinkedList.get(k);
          paramViewGroup.lXL.setVisibility(8);
          paramViewGroup.jjR.setVisibility(8);
          paramViewGroup.lXX.setVisibility(0);
          paramViewGroup.lXU.setImageResource(c.Np(((sp)localObject1).tOM));
          paramViewGroup.lXV.setText(((sp)localObject1).title);
          paramj = ((sp)localObject1).desc;
          if (!bg.mZ(paramj)) {
            break label2030;
          }
          paramj = x.ab((float)((sp)localObject1).tOS);
        }
        for (;;)
        {
          paramViewGroup.lXW.setText(paramj);
          GMTrace.o(6429297606656L, 47902);
          return paramView;
          if (i2 != 0)
          {
            paramj = (sp)localLinkedList.get(j);
            paramViewGroup.lXL.setVisibility(8);
            paramViewGroup.jjR.setVisibility(8);
            paramViewGroup.lXX.setVisibility(0);
            paramViewGroup.lXU.setImageResource(R.k.doe);
            paramViewGroup.lXV.setText(localContext.getString(R.l.dxx));
            paramViewGroup.lXW.setText(x.t(this.lNK.context, paramj.duration));
            GMTrace.o(6429297606656L, 47902);
            return paramView;
          }
          GMTrace.o(6429297606656L, 47902);
          return paramView;
        }
        i = 0;
      }
    }
  }
  
  public final void ci(View paramView)
  {
    GMTrace.i(6429431824384L, 47903);
    a locala = (a)paramView.getTag();
    e.b(paramView.getContext(), locala.lPM);
    GMTrace.o(6429431824384L, 47903);
  }
  
  public static final class a
    extends a.b
  {
    ImageView jjR;
    ImageView lXF;
    ImageView lXG;
    TextView lXH;
    TextView lXI;
    FrameLayout lXL;
    TextView lXS;
    LinearLayout lXT;
    ImageView lXU;
    TextView lXV;
    TextView lXW;
    LinearLayout lXX;
    
    public a()
    {
      GMTrace.i(6427686993920L, 47890);
      GMTrace.o(6427686993920L, 47890);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */