package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.base.Vending.d;
import com.tencent.mm.vending.f.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public final class ax
  extends BaseAdapter
  implements x
{
  private static HashMap<Long, a> qPM;
  private boolean gQK;
  av qPK;
  public aw qPL;
  
  static
  {
    GMTrace.i(8318814781440L, 61980);
    qPM = new HashMap();
    GMTrace.o(8318814781440L, 61980);
  }
  
  public ax(MMActivity paramMMActivity, ListView paramListView, com.tencent.mm.plugin.sns.ui.b.b paramb, j paramj, String paramString)
  {
    GMTrace.i(8316533080064L, 61963);
    this.gQK = false;
    this.qPK = new av(paramMMActivity, paramListView, paramb, paramj, 10, this);
    this.qPK.qGP = true;
    this.qPL = new aw();
    paramListView = this.qPL;
    paramb = this.qPK;
    paramListView.mContext = paramMMActivity;
    paramListView.qPA = paramb;
    paramListView.qyX = paramString;
    com.tencent.mm.kernel.h.xA();
    paramListView.hhr = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL();
    paramMMActivity = this.qPL;
    a.i("Vending.ForwardVending", "Vending.setRangeSize(%s)", new Object[] { Integer.valueOf(10) });
    paramMMActivity.wZW = 10;
    this.qPL.addVendingDataChangedCallback(new Vending.d()
    {
      public final void bnL()
      {
        GMTrace.i(8712609595392L, 64914);
        ax.this.notifyDataSetChanged();
        GMTrace.o(8712609595392L, 64914);
      }
    });
    GMTrace.o(8316533080064L, 61963);
  }
  
  public static void B(m paramm)
  {
    GMTrace.i(8317741039616L, 61972);
    long l1;
    a locala;
    if (paramm != null)
    {
      l1 = paramm.field_snsId;
      if (!qPM.containsKey(Long.valueOf(l1)))
      {
        locala = new a();
        if ((paramm.bjL() != null) && (paramm.bjL().uyu != null) && (paramm.bjL().uyu.tKc == 1) && (paramm.bjL().uyu.tKd != null) && (paramm.bjL().uyu.tKd.size() > 0))
        {
          locala.qfi = paramm.bjL().uyu.tKd.size();
          locala.qPO = new HashSet();
          locala.qPP = new HashSet();
          locala.qPQ = new HashSet();
          locala.qPR = new HashSet();
          locala.id = paramm.bjL().nas;
        }
      }
    }
    try
    {
      bdk localbdk = ai.n(paramm);
      locala.qPU = localbdk.uvg;
      locala.qPV = localbdk.uvj;
    }
    catch (Exception localException)
    {
      try
      {
        for (;;)
        {
          com.tencent.mm.kernel.h.xA();
          locala.mml = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aNc().BJ(paramm.field_userName);
          long l2 = System.currentTimeMillis();
          com.tencent.mm.kernel.h.xA();
          locala.qPT = ((l2 - ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aNc().BP(paramm.field_userName)) / 1000L);
          qPM.put(Long.valueOf(l1), locala);
          GMTrace.o(8317741039616L, 61972);
          return;
          localException = localException;
          locala.qPU = 0;
          locala.qPV = 0;
        }
      }
      catch (Exception paramm)
      {
        for (;;)
        {
          locala.mml = 0;
          locala.qPT = 0L;
        }
      }
    }
  }
  
  public static void b(m paramm, int paramInt)
  {
    GMTrace.i(8317875257344L, 61973);
    if (paramm != null)
    {
      long l = paramm.field_snsId;
      if (qPM.containsKey(Long.valueOf(l)))
      {
        paramm = (a)qPM.get(Long.valueOf(l));
        if (paramm.qPS == 0) {
          paramm.qPS = (paramInt + 1);
        }
        if (paramm.qPO == null) {
          paramm.qPO = new HashSet();
        }
        paramm.qPO.add(Integer.valueOf(paramInt + 1));
      }
    }
    GMTrace.o(8317875257344L, 61973);
  }
  
  public static void bnK()
  {
    GMTrace.i(8318412128256L, 61977);
    Iterator localIterator = qPM.entrySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)((Map.Entry)localIterator.next()).getValue();
      locala.networkType = i.bgg();
      w.d("MicroMsg.SnsTimeLineVendingAdapter", "report big pic click, picNum:%d, clickPicNum:%d, firstClickPos:%d, networkType:%d, id:%s", new Object[] { Integer.valueOf(locala.qfi), Integer.valueOf(locala.qPO.size()), Integer.valueOf(locala.qPS), Integer.valueOf(locala.networkType), locala.id });
      Object localObject1 = locala.qPP.iterator();
      for (String str = ""; ((Iterator)localObject1).hasNext(); str = str + localObject2 + "|") {
        localObject2 = (Integer)((Iterator)localObject1).next();
      }
      localObject1 = str;
      if (str.length() >= 2) {
        localObject1 = str.substring(0, str.length() - 1);
      }
      Object localObject2 = locala.qPQ.iterator();
      for (str = ""; ((Iterator)localObject2).hasNext(); str = str + localObject3 + "|") {
        localObject3 = (Integer)((Iterator)localObject2).next();
      }
      localObject2 = str;
      if (str.length() >= 2) {
        localObject2 = str.substring(0, str.length() - 1);
      }
      Object localObject3 = locala.qPR.iterator();
      Integer localInteger;
      for (str = ""; ((Iterator)localObject3).hasNext(); str = str + localInteger + "|") {
        localInteger = (Integer)((Iterator)localObject3).next();
      }
      localObject3 = str;
      if (str.length() >= 2) {
        localObject3 = str.substring(0, str.length() - 1);
      }
      g.paX.i(11599, new Object[] { Integer.valueOf(locala.qfi), Integer.valueOf(locala.qPO.size()), Integer.valueOf(locala.qPS), Integer.valueOf(locala.networkType), Integer.valueOf(0), locala.id, Long.valueOf(locala.qPT), Integer.valueOf(locala.mml), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(locala.qPU), Integer.valueOf(locala.qPV), Integer.valueOf(0), localObject1, localObject2, localObject3 });
    }
    qPM.clear();
    GMTrace.o(8318412128256L, 61977);
  }
  
  public static void c(m paramm, int paramInt)
  {
    GMTrace.i(8318009475072L, 61974);
    if (paramm != null)
    {
      long l = paramm.field_snsId;
      if (qPM.containsKey(Long.valueOf(l)))
      {
        paramm = (a)qPM.get(Long.valueOf(l));
        if (paramm.qPP == null) {
          paramm.qPP = new HashSet();
        }
        if (!paramm.qPP.contains(Integer.valueOf(paramInt + 1))) {
          paramm.qPP.add(Integer.valueOf(paramInt + 1));
        }
      }
    }
    GMTrace.o(8318009475072L, 61974);
  }
  
  public static void d(m paramm, int paramInt)
  {
    GMTrace.i(8318143692800L, 61975);
    if (paramm != null)
    {
      long l = paramm.field_snsId;
      if (qPM.containsKey(Long.valueOf(l)))
      {
        paramm = (a)qPM.get(Long.valueOf(l));
        if (paramm.qPQ == null) {
          paramm.qPQ = new HashSet();
        }
        if (!paramm.qPQ.contains(Integer.valueOf(paramInt + 1))) {
          paramm.qPQ.add(Integer.valueOf(paramInt + 1));
        }
      }
    }
    GMTrace.o(8318143692800L, 61975);
  }
  
  public static void e(m paramm, int paramInt)
  {
    GMTrace.i(8318277910528L, 61976);
    if (paramm != null)
    {
      long l = paramm.field_snsId;
      if (qPM.containsKey(Long.valueOf(l)))
      {
        paramm = (a)qPM.get(Long.valueOf(l));
        if (paramm.qPR == null) {
          paramm.qPR = new HashSet();
        }
        if (!paramm.qPR.contains(Integer.valueOf(paramInt + 1))) {
          paramm.qPR.add(Integer.valueOf(paramInt + 1));
        }
      }
    }
    GMTrace.o(8318277910528L, 61976);
  }
  
  public final void blG()
  {
    GMTrace.i(8317204168704L, 61968);
    this.qPL.notifyVendingDataChange();
    GMTrace.o(8317204168704L, 61968);
  }
  
  public final int getCount()
  {
    GMTrace.i(8317606821888L, 61971);
    int i = this.qPL.mCount;
    GMTrace.o(8317606821888L, 61971);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(8317472604160L, 61970);
    GMTrace.o(8317472604160L, 61970);
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(8317069950976L, 61967);
    paramInt = this.qPK.getItemViewType(paramInt);
    GMTrace.o(8317069950976L, 61967);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(8316801515520L, 61965);
    paramView = this.qPK.g(paramInt, paramView);
    GMTrace.o(8316801515520L, 61965);
    return paramView;
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(8316935733248L, 61966);
    GMTrace.o(8316935733248L, 61966);
    return 12;
  }
  
  public final m uN(int paramInt)
  {
    GMTrace.i(8317338386432L, 61969);
    Object localObject = (ay)this.qPL.get(paramInt);
    if (localObject == null)
    {
      GMTrace.o(8317338386432L, 61969);
      return null;
    }
    localObject = ((ay)localObject).pFU;
    GMTrace.o(8317338386432L, 61969);
    return (m)localObject;
  }
  
  public final void up()
  {
    GMTrace.i(8316667297792L, 61964);
    if (this.gQK)
    {
      GMTrace.o(8316667297792L, 61964);
      return;
    }
    this.gQK = true;
    this.qPL.notifyVendingDataChangeSynchronize();
    GMTrace.o(8316667297792L, 61964);
  }
  
  static final class a
  {
    String id;
    int mml;
    int networkType;
    HashSet<Integer> qPO;
    HashSet<Integer> qPP;
    HashSet<Integer> qPQ;
    HashSet<Integer> qPR;
    int qPS;
    long qPT;
    int qPU;
    int qPV;
    int qfi;
    
    a()
    {
      GMTrace.i(8540005597184L, 63628);
      GMTrace.o(8540005597184L, 63628);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */