package com.tencent.mm.plugin.backup.c;

import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.b.b.3;
import com.tencent.mm.plugin.backup.b.b.4;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b.b
{
  public com.tencent.mm.plugin.backup.b.b jMX;
  public b.b jMY;
  public long jMZ;
  private LinkedList<com.tencent.mm.plugin.backup.a.d> jNa;
  private LinkedList<com.tencent.mm.plugin.backup.a.d> jNb;
  public LinkedList<com.tencent.mm.plugin.backup.a.d> jNc;
  public boolean jNd;
  boolean jNe;
  private Object lock;
  
  public a()
  {
    GMTrace.i(9544491073536L, 71112);
    this.lock = new Object();
    this.jNa = null;
    this.jNb = null;
    this.jNc = null;
    this.jNd = false;
    this.jNe = false;
    GMTrace.o(9544491073536L, 71112);
  }
  
  private static long y(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(18448092495872L, 137449);
    long l1 = 0L;
    long l2 = l1;
    if (paramLinkedList != null)
    {
      l2 = l1;
      if (paramLinkedList.size() > 0)
      {
        l1 = ((com.tencent.mm.plugin.backup.a.d)paramLinkedList.get(0)).jKV;
        paramLinkedList = paramLinkedList.iterator();
        l2 = l1;
        if (paramLinkedList.hasNext())
        {
          com.tencent.mm.plugin.backup.a.d locald = (com.tencent.mm.plugin.backup.a.d)paramLinkedList.next();
          if (l1 <= locald.jKV) {
            break label93;
          }
          l1 = locald.jKV;
        }
      }
    }
    label93:
    for (;;)
    {
      break;
      GMTrace.o(18448092495872L, 137449);
      return l2;
    }
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2, LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(18448360931328L, 137451);
    if (paramInt == 0)
    {
      this.jNb = new LinkedList(paramLinkedList);
      GMTrace.o(18448360931328L, 137451);
      return;
    }
    this.jNb = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      com.tencent.mm.plugin.backup.a.d locald = (com.tencent.mm.plugin.backup.a.d)paramLinkedList.next();
      if (com.tencent.mm.plugin.backup.g.a.afe().aff().yN().l(locald.jKU, paramLong1, paramLong2) > 0) {
        this.jNb.add(locald);
      }
    }
    GMTrace.o(18448360931328L, 137451);
  }
  
  public final void a(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList, com.tencent.mm.plugin.backup.a.d paramd, int paramInt)
  {
    GMTrace.i(18448897802240L, 137455);
    w.i("MicroMsg.BackupMoveChooseServer", "onCalcuSizeProgress.");
    this.jNa = paramLinkedList;
    if (this.jNb != null)
    {
      Iterator localIterator = this.jNb.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.backup.a.d locald = (com.tencent.mm.plugin.backup.a.d)localIterator.next();
        if (locald.jKU.equals(paramd.jKU))
        {
          locald.jKX = paramd.jKX;
          locald.jKY = paramd.jKY;
        }
      }
    }
    if (b.aef().aeh().jOf)
    {
      w.i("MicroMsg.BackupMoveChooseServer", "onCalcuChooseSizeFinish startRequestNotify");
      b.aef().adG().y(13, paramInt, paramLinkedList.size());
      b.aef().aeh().a(b.aef().adG());
    }
    if (this.jMY != null) {
      this.jMY.a(aea(), paramd, paramInt);
    }
    GMTrace.o(18448897802240L, 137455);
  }
  
  public final LinkedList<com.tencent.mm.plugin.backup.a.d> adZ()
  {
    GMTrace.i(18447958278144L, 137448);
    if (this.jNa == null) {
      this.jNa = new LinkedList();
    }
    LinkedList localLinkedList = this.jNa;
    GMTrace.o(18447958278144L, 137448);
    return localLinkedList;
  }
  
  public final LinkedList<com.tencent.mm.plugin.backup.a.d> aea()
  {
    GMTrace.i(18448226713600L, 137450);
    if (this.jNb == null) {
      this.jNb = new LinkedList();
    }
    LinkedList localLinkedList = this.jNb;
    GMTrace.o(18448226713600L, 137450);
    return localLinkedList;
  }
  
  public final LinkedList<com.tencent.mm.plugin.backup.a.d> aeb()
  {
    GMTrace.i(18448495149056L, 137452);
    if (this.jNc == null) {
      this.jNc = new LinkedList();
    }
    LinkedList localLinkedList = this.jNc;
    GMTrace.o(18448495149056L, 137452);
    return localLinkedList;
  }
  
  public final void aec()
  {
    GMTrace.i(14822871662592L, 110439);
    this.jNa = null;
    this.jNc = null;
    this.jNb = null;
    this.jNe = false;
    this.jNd = false;
    GMTrace.o(14822871662592L, 110439);
  }
  
  public final void aed()
  {
    GMTrace.i(18448763584512L, 137454);
    b.aef();
    SharedPreferences localSharedPreferences = b.adL();
    a(localSharedPreferences.getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0), localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L), localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L), adZ());
    GMTrace.o(18448763584512L, 137454);
  }
  
  public final long aee()
  {
    GMTrace.i(9545296379904L, 71118);
    if (aeb() == null)
    {
      GMTrace.o(9545296379904L, 71118);
      return 0L;
    }
    Iterator localIterator = aeb().iterator();
    for (long l = 0L; localIterator.hasNext(); l = ((com.tencent.mm.plugin.backup.a.d)localIterator.next()).jKX + l) {}
    GMTrace.o(9545296379904L, 71118);
    return l;
  }
  
  public final void cancel()
  {
    GMTrace.i(18448629366784L, 137453);
    synchronized (this.lock)
    {
      if (this.jMX != null)
      {
        this.jMX.cancel();
        this.jMX = null;
      }
      e.f(new File(h.adP()));
      GMTrace.o(18448629366784L, 137453);
      return;
    }
  }
  
  public final void u(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(9544893726720L, 71115);
    w.i("MicroMsg.BackupMoveChooseServer", "onCalcuConvFinish.");
    this.jNd = true;
    this.jNa = new LinkedList(paramLinkedList);
    this.jMZ = y(this.jNa);
    aed();
    w.i("MicroMsg.BackupMoveChooseServer", "summerbak onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", new Object[] { Integer.valueOf(adZ().size()), Integer.valueOf(aea().size()) });
    if (this.jMY != null) {
      this.jMY.u(aea());
    }
    GMTrace.o(9544893726720L, 71115);
  }
  
  public final void v(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(9545162162176L, 71117);
    w.i("MicroMsg.BackupMoveChooseServer", "onCalcuSizeFinish.");
    this.jNe = true;
    this.jNa = ((LinkedList)paramLinkedList.clone());
    aed();
    if (b.aef().aeh().jOf)
    {
      w.i("MicroMsg.BackupMoveChooseServer", "onCalcuChooseSizeFinish startRequestNotify");
      b.aef().aeh().aer();
      GMTrace.o(9545162162176L, 71117);
      return;
    }
    if (this.jMY != null) {
      this.jMY.v(paramLinkedList);
    }
    GMTrace.o(9545162162176L, 71117);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */