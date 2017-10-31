package com.tencent.mm.plugin.backup.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.e.a.a;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import java.util.LinkedList;

public final class b
{
  public boolean jLy;
  
  public b()
  {
    GMTrace.i(9474429419520L, 70590);
    this.jLy = false;
    GMTrace.o(9474429419520L, 70590);
  }
  
  public final void a(final a parama)
  {
    GMTrace.i(18452790116352L, 137484);
    w.i("MicroMsg.BackupCalculator", "calculateChooseConversation start");
    long l = bg.Pp();
    final LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = a.afe().aff().yQ().c(o.heQ, h.adR(), "*");
    if (localCursor.getCount() == 0)
    {
      if (parama != null) {
        com.tencent.mm.sdk.platformtools.af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9476979556352L, 70609);
            if (parama != null) {
              parama.u(localLinkedList);
            }
            GMTrace.o(9476979556352L, 70609);
          }
        });
      }
      w.i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation!");
      localCursor.close();
      GMTrace.o(18452790116352L, 137484);
      return;
    }
    localCursor.moveToFirst();
    w.i("MicroMsg.BackupCalculator", "calculateChooseConversation count[%d]", new Object[] { Integer.valueOf(localCursor.getCount()) });
    for (;;)
    {
      if (this.jLy)
      {
        w.e("MicroMsg.BackupCalculator", "calculateChooseConversation cancel.");
        localCursor.close();
        GMTrace.o(18452790116352L, 137484);
        return;
      }
      ae localae = new ae();
      localae.b(localCursor);
      int i;
      if (!bg.mZ(localae.field_username))
      {
        i = a.afe().aff().yN().BJ(localae.field_username);
        if (i > 0) {
          break label307;
        }
        w.i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation:%s", new Object[] { localae.field_username });
      }
      while (!localCursor.moveToNext())
      {
        localCursor.close();
        if ((!this.jLy) && (parama != null)) {
          com.tencent.mm.sdk.platformtools.af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9469731799040L, 70555);
              if ((!b.this.jLy) && (parama != null)) {
                parama.u(localLinkedList);
              }
              GMTrace.o(9469731799040L, 70555);
            }
          });
        }
        w.i("MicroMsg.BackupCalculator", "calculateChooseConversation finish, use time[%d]", new Object[] { Long.valueOf(bg.aF(l)) });
        GMTrace.o(18452790116352L, 137484);
        return;
        label307:
        ap.AS();
        if (x.zM(com.tencent.mm.x.c.yL().SL(localae.field_username).field_verifyFlag))
        {
          w.i("MicroMsg.BackupCalculator", "calculateChooseConversation Biz conv:%s, msgCount[%d]", new Object[] { localae.field_username, Integer.valueOf(i) });
        }
        else
        {
          d locald = new d();
          locald.jKU = localae.field_username;
          locald.jKV = a.afe().aff().yN().BO(localae.field_username);
          locald.jKW = a.afe().aff().yN().BP(localae.field_username);
          w.i("MicroMsg.BackupCalculator", "calculateChooseConversation add conv:%s, msgCount[%d], firstMsgTime[%d], lastMsgTime[%d]", new Object[] { locald.jKU, Integer.valueOf(i), Long.valueOf(locald.jKV), Long.valueOf(locald.jKW) });
          localLinkedList.add(locald);
        }
      }
    }
  }
  
  public final boolean a(d paramd, String paramString, long paramLong)
  {
    GMTrace.i(14729992994816L, 109747);
    if (paramd == null)
    {
      GMTrace.o(14729992994816L, 109747);
      return false;
    }
    Cursor localCursor = a.afe().aff().yN().BD(paramd.jKU);
    w.i("MicroMsg.BackupCalculator", "calConversation start convName:%s msgCnt:%d[cu.getCount]", new Object[] { paramd.jKU, Integer.valueOf(localCursor.getCount()) });
    if (localCursor.moveToFirst())
    {
      PLong localPLong1 = new PLong();
      PLong localPLong2 = new PLong();
      for (;;)
      {
        if (!localCursor.isAfterLast())
        {
          if (this.jLy)
          {
            w.i("MicroMsg.BackupCalculator", "calConversation cancel, return");
            localCursor.close();
            GMTrace.o(14729992994816L, 109747);
            return true;
          }
          au localau = new au();
          localau.b(localCursor);
          try
          {
            a.a.a(localau, true, paramString, localPLong1, null, null, false, false, paramLong);
            localPLong2.value += 1L;
            localCursor.moveToNext();
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.BackupCalculator", localException, "packedMsg", new Object[0]);
            }
          }
        }
      }
      paramd.jKX = localPLong1.value;
      paramd.jKY = localPLong2.value;
      w.i("MicroMsg.BackupCalculator", "calConversation convName:%s, convDataSize:%d, convMsgCount:%d", new Object[] { paramd.jKU, Long.valueOf(paramd.jKX), Long.valueOf(paramd.jKY) });
    }
    localCursor.close();
    GMTrace.o(14729992994816L, 109747);
    return false;
  }
  
  public final void cancel()
  {
    GMTrace.i(9474563637248L, 70591);
    w.i("MicroMsg.BackupCalculator", "cancel. stack:%s", new Object[] { bg.bOd() });
    this.jLy = true;
    GMTrace.o(9474563637248L, 70591);
  }
  
  public static abstract interface a
  {
    public abstract void u(LinkedList<d> paramLinkedList);
  }
  
  public static abstract interface b
    extends b.a
  {
    public abstract void a(LinkedList<d> paramLinkedList, d paramd, int paramInt);
    
    public abstract void v(LinkedList<d> paramLinkedList);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */