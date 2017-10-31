package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.AnimatedExpandableListView.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aq
  extends AnimatedExpandableListView.a
{
  public static int[] qKQ;
  public static int[] qKu;
  private LayoutInflater CO;
  private Context mContext;
  ArrayList<String> qKR;
  public int qKS;
  public boolean qKT;
  public ArrayList<String> qKU;
  public ArrayList<String> qKV;
  public ArrayList<String> qKW;
  public ArrayList<String> qKX;
  public int style;
  
  static
  {
    GMTrace.i(8596242825216L, 64047);
    qKu = new int[] { i.j.pSS, i.j.pSQ, i.j.pSM, i.j.pSF };
    qKQ = new int[] { i.j.pST, i.j.pSR, i.j.pSN, i.j.pSG };
    GMTrace.o(8596242825216L, 64047);
  }
  
  public aq(Context paramContext)
  {
    GMTrace.i(8593826906112L, 64029);
    this.qKS = 0;
    this.qKT = false;
    this.qKU = new ArrayList();
    this.qKV = new ArrayList();
    this.qKW = new ArrayList();
    this.qKX = new ArrayList();
    this.mContext = paramContext;
    this.CO = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    GMTrace.o(8593826906112L, 64029);
  }
  
  public static void Im(String paramString)
  {
    GMTrace.i(8594497994752L, 64034);
    w.d("MicroMsg.Sns.AnimatedExpandableListAdapter", "recordTopFive : %s", new Object[] { paramString });
    if (bno() != null)
    {
      ArrayList localArrayList = new ArrayList(bno());
      if (!i(localArrayList, paramString))
      {
        if (localArrayList.size() == 5) {
          localArrayList.remove(4);
        }
        localArrayList.add(0, paramString);
        paramString = bg.c(localArrayList, ",");
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xz().xi().set(335875, paramString);
      }
      GMTrace.o(8594497994752L, 64034);
      return;
    }
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xz().xi().set(335875, paramString);
    GMTrace.o(8594497994752L, 64034);
  }
  
  private CharSequence In(String paramString)
  {
    GMTrace.i(8594632212480L, 64035);
    paramString = com.tencent.mm.plugin.label.a.a.aIM().Aq(paramString);
    Object localObject = com.tencent.mm.plugin.label.a.a.aIM().At(paramString);
    if ((localObject == null) || (((List)localObject).size() == 0))
    {
      GMTrace.o(8594632212480L, 64035);
      return "";
    }
    paramString = new ArrayList(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramString.add(((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fc((String)((Iterator)localObject).next()));
    }
    paramString = bg.c(paramString, ",");
    paramString = com.tencent.mm.pluginsdk.ui.d.h.a(this.mContext, paramString);
    GMTrace.o(8594632212480L, 64035);
    return paramString;
  }
  
  private static List<String> af(List<String> paramList)
  {
    GMTrace.i(8595840172032L, 64044);
    LinkedList localLinkedList = new LinkedList();
    com.tencent.mm.kernel.h.xA();
    if (!com.tencent.mm.kernel.h.xx().wM())
    {
      GMTrace.o(8595840172032L, 64044);
      return localLinkedList;
    }
    if (paramList == null)
    {
      GMTrace.o(8595840172032L, 64044);
      return localLinkedList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      com.tencent.mm.kernel.h.xA();
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(str);
      paramList = str;
      if (localx != null)
      {
        paramList = str;
        if ((int)localx.gLS != 0) {
          paramList = localx.vq();
        }
      }
      localLinkedList.add(paramList);
    }
    GMTrace.o(8595840172032L, 64044);
    return localLinkedList;
  }
  
  private boolean as(int paramInt, String paramString)
  {
    GMTrace.i(8594900647936L, 64037);
    if (paramInt == 1)
    {
      bool = i(this.qKU, paramString);
      GMTrace.o(8594900647936L, 64037);
      return bool;
    }
    boolean bool = i(this.qKV, paramString);
    GMTrace.o(8594900647936L, 64037);
    return bool;
  }
  
  private static List<String> bno()
  {
    GMTrace.i(8594363777024L, 64033);
    com.tencent.mm.kernel.h.xA();
    Object localObject = (String)com.tencent.mm.kernel.h.xz().xi().get(335875, null);
    w.d("MicroMsg.Sns.AnimatedExpandableListAdapter", "dz:getTopFive : %s", new Object[] { localObject });
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(8594363777024L, 64033);
      return null;
    }
    localObject = bg.f(((String)localObject).split(","));
    GMTrace.o(8594363777024L, 64033);
    return (List<String>)localObject;
  }
  
  private static boolean i(List<String> paramList, String paramString)
  {
    GMTrace.i(8594766430208L, 64036);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((String)paramList.next()).equals(paramString))
      {
        GMTrace.o(8594766430208L, 64036);
        return true;
      }
    }
    GMTrace.o(8594766430208L, 64036);
    return false;
  }
  
  public final void S(ArrayList<String> paramArrayList)
  {
    GMTrace.i(8594229559296L, 64032);
    Object localObject2 = bno();
    Object localObject1 = new ArrayList();
    if ((localObject2 != null) && (paramArrayList != null))
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        String str = (String)((Iterator)localObject2).next();
        if (i(paramArrayList, str))
        {
          paramArrayList.remove(str);
          ((ArrayList)localObject1).add(str);
        }
      }
      paramArrayList.addAll(0, (Collection)localObject1);
      localObject1 = bg.c((List)localObject1, ",");
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xz().xi().set(335875, localObject1);
    }
    this.qKR = paramArrayList;
    GMTrace.o(8594229559296L, 64032);
  }
  
  public final View a(int paramInt1, int paramInt2, View paramView)
  {
    GMTrace.i(8595974389760L, 64045);
    a locala;
    label124:
    String str;
    if (paramView == null) {
      if (this.style == 1)
      {
        paramView = this.CO.inflate(i.g.pOW, null);
        locala = new a();
        locala.titleView = ((TextView)paramView.findViewById(i.f.pMp));
        locala.nri = ((TextView)paramView.findViewById(i.f.pMo));
        locala.qKY = ((TextView)paramView.findViewById(i.f.pMn));
        locala.qKZ = ((TextView)paramView.findViewById(i.f.pMm));
        locala.nFo = ((ImageView)paramView.findViewById(i.f.pMl));
        paramView.setTag(locala);
        if (paramInt2 != this.qKR.size()) {
          break label440;
        }
        locala.titleView.setVisibility(8);
        locala.nri.setVisibility(8);
        locala.nFo.setVisibility(8);
        locala.qKY.setVisibility(0);
        locala.qKZ.setVisibility(0);
        if (paramInt1 != 3) {
          break label329;
        }
        if (this.qKX.size() <= 0) {
          break label306;
        }
        str = bg.c(af(this.qKX), ",");
        locala.qKZ.setText("√" + str);
        locala.qKZ.setVisibility(0);
        locala.qKZ.setTextColor(this.mContext.getResources().getColor(i.c.pGq));
      }
    }
    for (;;)
    {
      GMTrace.o(8595974389760L, 64045);
      return paramView;
      paramView = this.CO.inflate(i.g.pOV, null);
      break;
      locala = (a)paramView.getTag();
      break label124;
      label306:
      locala.qKZ.setText("");
      locala.qKZ.setVisibility(8);
      continue;
      label329:
      if (paramInt1 == 2) {
        if (this.qKW.size() > 0)
        {
          str = bg.c(af(this.qKW), ",");
          locala.qKZ.setText("√" + str);
          locala.qKZ.setVisibility(0);
          locala.qKZ.setTextColor(this.mContext.getResources().getColor(i.c.pGp));
        }
        else
        {
          locala.qKZ.setText("");
          locala.qKZ.setVisibility(8);
          continue;
          label440:
          locala.titleView.setVisibility(0);
          locala.nri.setVisibility(0);
          locala.nFo.setVisibility(0);
          locala.qKY.setVisibility(8);
          locala.qKZ.setVisibility(8);
          str = (String)this.qKR.get(paramInt2);
          locala.titleView.setText(com.tencent.mm.pluginsdk.ui.d.h.a(this.mContext, str));
          locala.nri.setText(In(str));
          locala.nFo.setVisibility(0);
          if (this.style == 1)
          {
            if (paramInt1 == 2)
            {
              if (as(1, str)) {
                locala.nFo.setImageResource(i.i.dqO);
              } else {
                locala.nFo.setImageResource(i.i.dqP);
              }
            }
            else if (paramInt1 == 3)
            {
              if (this.qKS != paramInt1) {
                locala.nFo.setImageResource(i.i.pQA);
              }
              for (;;)
              {
                if (!as(2, str)) {
                  break label653;
                }
                locala.nFo.setImageResource(i.i.pQz);
                break;
                locala.nFo.setImageResource(i.i.pQz);
              }
              label653:
              locala.nFo.setImageResource(i.i.pQA);
            }
          }
          else if (paramInt1 == 2)
          {
            if (as(1, str)) {
              locala.nFo.setImageResource(i.i.dnj);
            } else {
              locala.nFo.setImageResource(i.i.dnk);
            }
          }
          else if (paramInt1 == 3) {
            if (as(2, str)) {
              locala.nFo.setImageResource(i.i.pQg);
            } else {
              locala.nFo.setImageResource(i.i.dnk);
            }
          }
        }
      }
    }
  }
  
  public final Object getChild(int paramInt1, int paramInt2)
  {
    GMTrace.i(8593961123840L, 64030);
    Object localObject = this.qKR.get(paramInt2);
    GMTrace.o(8593961123840L, 64030);
    return localObject;
  }
  
  public final long getChildId(int paramInt1, int paramInt2)
  {
    GMTrace.i(8594095341568L, 64031);
    GMTrace.o(8594095341568L, 64031);
    return 0L;
  }
  
  public final Object getGroup(int paramInt)
  {
    GMTrace.i(8595034865664L, 64038);
    GMTrace.o(8595034865664L, 64038);
    return null;
  }
  
  public final int getGroupCount()
  {
    GMTrace.i(8595169083392L, 64039);
    GMTrace.o(8595169083392L, 64039);
    return 4;
  }
  
  public final long getGroupId(int paramInt)
  {
    GMTrace.i(8595303301120L, 64040);
    GMTrace.o(8595303301120L, 64040);
    return 0L;
  }
  
  public final View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8595437518848L, 64041);
    if ((paramView == null) || (!(paramView.getTag() instanceof a))) {
      if (this.style == 1)
      {
        paramView = this.CO.inflate(i.g.pOY, null);
        paramViewGroup = new a();
        paramViewGroup.titleView = ((TextView)paramView.findViewById(i.f.pMp));
        paramViewGroup.nFo = ((ImageView)paramView.findViewById(i.f.pMl));
        paramViewGroup.nri = ((TextView)paramView.findViewById(i.f.pMo));
        paramView.setTag(paramViewGroup);
        label104:
        paramViewGroup.titleView.setText(qKu[paramInt]);
        paramViewGroup.nri.setText(qKQ[paramInt]);
        switch (paramInt)
        {
        }
      }
    }
    for (;;)
    {
      if ((!this.qKT) || (paramInt != 1)) {
        break label452;
      }
      paramView = new View(this.mContext);
      paramView.setVisibility(8);
      GMTrace.o(8595437518848L, 64041);
      return paramView;
      paramView = this.CO.inflate(i.g.pOX, null);
      break;
      paramViewGroup = (a)paramView.getTag();
      break label104;
      if (this.qKS != paramInt)
      {
        paramViewGroup.nFo.setImageResource(i.i.dqq);
      }
      else
      {
        paramViewGroup.nFo.setImageResource(i.i.dqr);
        paramViewGroup.nFo.setContentDescription(this.mContext.getString(i.j.pRl));
        continue;
        if (this.qKS != paramInt)
        {
          paramViewGroup.nFo.setImageResource(i.i.dqq);
        }
        else
        {
          paramViewGroup.nFo.setImageResource(i.i.dqr);
          paramViewGroup.nFo.setContentDescription(this.mContext.getString(i.j.pRl));
          continue;
          if (this.style == 1)
          {
            if (this.qKS != paramInt)
            {
              paramViewGroup.nFo.setImageResource(i.i.dqq);
            }
            else
            {
              paramViewGroup.nFo.setImageResource(i.i.pQs);
              paramViewGroup.nFo.setContentDescription(this.mContext.getString(i.j.pRl));
            }
          }
          else if (this.qKS != paramInt)
          {
            paramViewGroup.nFo.setImageResource(i.i.dqq);
          }
          else
          {
            paramViewGroup.nFo.setImageResource(i.i.pQr);
            paramViewGroup.nFo.setContentDescription(this.mContext.getString(i.j.pRl));
          }
        }
      }
    }
    label452:
    GMTrace.o(8595437518848L, 64041);
    return paramView;
  }
  
  public final boolean hasStableIds()
  {
    GMTrace.i(8595571736576L, 64042);
    GMTrace.o(8595571736576L, 64042);
    return false;
  }
  
  public final boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    GMTrace.i(8595705954304L, 64043);
    GMTrace.o(8595705954304L, 64043);
    return true;
  }
  
  public final int vb(int paramInt)
  {
    GMTrace.i(8596108607488L, 64046);
    if ((paramInt > 1) && (this.qKR != null))
    {
      paramInt = this.qKR.size();
      GMTrace.o(8596108607488L, 64046);
      return paramInt + 1;
    }
    GMTrace.o(8596108607488L, 64046);
    return 0;
  }
  
  private final class a
  {
    ImageView nFo;
    TextView nri;
    TextView qKY;
    TextView qKZ;
    TextView titleView;
    
    public a()
    {
      GMTrace.i(8365119897600L, 62325);
      GMTrace.o(8365119897600L, 62325);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */