package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class au
  implements f
{
  private static HashMap<String, b> qfd;
  private static HashMap<String, WeakReference<b>> qfe;
  
  static
  {
    GMTrace.i(8107153424384L, 60403);
    qfd = new HashMap();
    qfe = new HashMap();
    GMTrace.o(8107153424384L, 60403);
  }
  
  public au()
  {
    GMTrace.i(8106213900288L, 60396);
    GMTrace.o(8106213900288L, 60396);
  }
  
  public static void GN(String paramString)
  {
    GMTrace.i(8106348118016L, 60397);
    if (r.icO) {
      w.d("MicroMsg.TimelineSmallPicStat", "recordStartLoadSmallPic, mediaId:%s", new Object[] { paramString });
    }
    paramString = (WeakReference)qfe.get(paramString);
    if (paramString != null)
    {
      paramString = (b)paramString.get();
      if (paramString != null)
      {
        paramString.mRF = true;
        GMTrace.o(8106348118016L, 60397);
        return;
      }
    }
    GMTrace.o(8106348118016L, 60397);
  }
  
  public static void GO(String paramString)
  {
    GMTrace.i(8106482335744L, 60398);
    if (r.icO) {
      w.d("MicroMsg.TimelineSmallPicStat", "recordEndLoadSmallPic, mediaId:%s", new Object[] { paramString });
    }
    Object localObject = (WeakReference)qfe.get(paramString);
    if (localObject != null)
    {
      localObject = (b)((WeakReference)localObject).get();
      if (localObject != null)
      {
        if ((localObject != null) && (((b)localObject).qff == -1L))
        {
          HashMap localHashMap = ((b)localObject).qfk;
          if ((localHashMap != null) && (localHashMap.containsKey(paramString)))
          {
            paramString = (a)localHashMap.get(paramString);
            if ((paramString != null) && (paramString.qff == -1L))
            {
              paramString.qff = 1L;
              ((b)localObject).qfj += 1;
            }
          }
        }
        GMTrace.o(8106482335744L, 60398);
        return;
      }
    }
    GMTrace.o(8106482335744L, 60398);
  }
  
  public static void GP(String paramString)
  {
    GMTrace.i(8106616553472L, 60399);
    w.d("MicroMsg.TimelineSmallPicStat", "recordClickBigpic, localId:%s", new Object[] { paramString });
    if (qfd.containsKey(paramString))
    {
      w.d("MicroMsg.TimelineSmallPicStat", "recordClickBigPic, localId:%s, update map", new Object[] { paramString });
      paramString = (b)qfd.get(paramString);
      if ((paramString != null) && (paramString.qff == -1L) && (paramString.startTime != -1L))
      {
        paramString.qff = 1L;
        paramString.qfj = paramString.qfi;
        paramString.endTime = System.currentTimeMillis();
        paramString.qfh = (paramString.endTime - paramString.startTime);
        paramString = paramString.qfk.values().iterator();
        while (paramString.hasNext()) {
          ((a)paramString.next()).qff = 1L;
        }
      }
    }
    GMTrace.o(8106616553472L, 60399);
  }
  
  public final void Gr(String paramString)
  {
    GMTrace.i(8106884988928L, 60401);
    if (qfd.containsKey(paramString))
    {
      if (r.icO) {
        w.d("MicroMsg.TimelineSmallPicStat", "load finish localId:%s", new Object[] { paramString });
      }
      paramString = (b)qfd.get(paramString);
      if ((paramString != null) && (paramString.startTime != -1L) && (paramString.qff == -1L))
      {
        paramString.endTime = System.currentTimeMillis();
        paramString.qfh = (paramString.endTime - paramString.startTime);
        if (paramString.qfj == paramString.qfi)
        {
          paramString.qff = 1L;
          GMTrace.o(8106884988928L, 60401);
          return;
        }
        paramString.qff = 2L;
      }
    }
    GMTrace.o(8106884988928L, 60401);
  }
  
  public final void a(String paramString, bhc parambhc)
  {
    GMTrace.i(8106750771200L, 60400);
    if (!qfd.containsKey(paramString))
    {
      if (r.icO) {
        w.d("MicroMsg.TimelineSmallPicStat", "put localId:%s into reportData", new Object[] { paramString });
      }
      if ((parambhc != null) && (parambhc.uyu != null) && (parambhc.uyu.tKc == 1) && (parambhc.uyu.tKd != null) && (parambhc.uyu.tKd.size() > 0))
      {
        b localb = new b();
        localb.qfi = parambhc.uyu.tKd.size();
        localb.qfj = 0;
        localb.qfk = new HashMap();
        parambhc = parambhc.uyu.tKd.iterator();
        while (parambhc.hasNext())
        {
          amn localamn = (amn)parambhc.next();
          a locala = new a();
          locala.mediaId = localamn.nas;
          localb.qfk.put(localamn.nas, locala);
          qfe.put(localamn.nas, new WeakReference(localb));
        }
        localb.startTime = System.currentTimeMillis();
        qfd.put(paramString, localb);
        GMTrace.o(8106750771200L, 60400);
        return;
      }
      if (r.icO) {
        w.d("MicroMsg.TimelineSmallPicStat", "onItemAdd error, timelineObject is nulli");
      }
    }
    GMTrace.o(8106750771200L, 60400);
  }
  
  public final void bgD()
  {
    GMTrace.i(8107019206656L, 60402);
    w.d("MicroMsg.TimelineSmallPicStat", "reportAll, reportData.size:%d", new Object[] { Integer.valueOf(qfd.size()) });
    int i = i.bgg();
    Iterator localIterator = qfd.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (b)qfd.get(localObject);
      if ((localObject != null) && (((b)localObject).mRF))
      {
        if ((((b)localObject).qfh == -1L) || (((b)localObject).qff == -1L) || (((b)localObject).startTime == -1L))
        {
          if (((b)localObject).startTime == -1L) {
            continue;
          }
          ((b)localObject).endTime = System.currentTimeMillis();
          ((b)localObject).qfh = (((b)localObject).endTime - ((b)localObject).startTime);
          if (((b)localObject).qfi != ((b)localObject).qfj) {
            break label289;
          }
        }
        label289:
        for (((b)localObject).qff = 1L;; ((b)localObject).qff = 2L)
        {
          w.d("MicroMsg.TimelineSmallPicStat", "reportAll, picNum:%d, loadResult:%d, loadCostTime:%d, loadPicNum:%d, networkType:%d", new Object[] { Integer.valueOf(((b)localObject).qfi), Long.valueOf(((b)localObject).qff), Long.valueOf(((b)localObject).qfh), Integer.valueOf(((b)localObject).qfj), Integer.valueOf(i) });
          g.paX.i(11600, new Object[] { Integer.valueOf(((b)localObject).qfi), Long.valueOf(((b)localObject).qff), Long.valueOf(((b)localObject).qfh), Integer.valueOf(((b)localObject).qfj), Integer.valueOf(i) });
          break;
        }
      }
    }
    qfd.clear();
    qfe.clear();
    GMTrace.o(8107019206656L, 60402);
  }
  
  final class a
  {
    String mediaId;
    long qff;
    
    a()
    {
      GMTrace.i(8152653234176L, 60742);
      this.qff = -1L;
      GMTrace.o(8152653234176L, 60742);
    }
  }
  
  final class b
  {
    long endTime;
    boolean mRF;
    long qff;
    long qfh;
    int qfi;
    int qfj;
    HashMap<String, au.a> qfk;
    long startTime;
    
    b()
    {
      GMTrace.i(8121380503552L, 60509);
      this.startTime = -1L;
      this.endTime = -1L;
      this.qff = -1L;
      this.qfh = -1L;
      this.qfi = 0;
      this.qfj = 0;
      this.mRF = false;
      this.qfk = new HashMap();
      GMTrace.o(8121380503552L, 60509);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */