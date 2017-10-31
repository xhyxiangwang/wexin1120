package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.backup.bakoldlogic.a.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.e;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  public static int jTh;
  public LinkedList<String> hHm;
  public final com.tencent.mm.sdk.platformtools.ae handler;
  public boolean hng;
  private final int jLd;
  private LinkedList<String> jNa;
  public final b jTd;
  public final c jTe;
  private final a jTf;
  public ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> jTg;
  
  static
  {
    GMTrace.i(14732274696192L, 109764);
    jTh = 8;
    GMTrace.o(14732274696192L, 109764);
  }
  
  public a(b paramb, c paramc)
  {
    GMTrace.i(14731200954368L, 109756);
    this.hng = false;
    this.jLd = -21;
    this.jTd = paramb;
    this.jTe = paramc;
    this.jTf = null;
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    GMTrace.o(14731200954368L, 109756);
  }
  
  public final LinkedList<String> a(final PLong paramPLong, PInt paramPInt)
  {
    GMTrace.i(14731469389824L, 109758);
    if ((paramPLong == null) || (paramPInt == null))
    {
      w.e("MicroMsg.BakCalculator", "calculConv backupDataSize or msgCount is null.");
      GMTrace.o(14731469389824L, 109758);
      return null;
    }
    paramPInt.value = 0;
    paramPLong.value = 0L;
    this.jNa = new LinkedList();
    long l1 = System.currentTimeMillis();
    Object localObject1 = com.tencent.mm.plugin.backup.g.a.afe().aff().yQ().c(o.heQ, d.adR(), "*");
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      if (this.hng)
      {
        GMTrace.o(14731469389824L, 109758);
        return null;
      }
      paramPLong = this.jNa;
      GMTrace.o(14731469389824L, 109758);
      return paramPLong;
    }
    ((Cursor)localObject1).moveToFirst();
    w.i("MicroMsg.BakCalculator", "calcItems userCnt at conv:%d", new Object[] { Integer.valueOf(((Cursor)localObject1).getCount()) });
    do
    {
      if (this.hng)
      {
        ((Cursor)localObject1).close();
        GMTrace.o(14731469389824L, 109758);
        return null;
      }
      localObject2 = new com.tencent.mm.storage.ae();
      ((com.tencent.mm.storage.ae)localObject2).b((Cursor)localObject1);
      if (!bg.mZ(((aj)localObject2).field_username))
      {
        i = com.tencent.mm.plugin.backup.g.a.afe().aff().yN().BJ(((aj)localObject2).field_username);
        w.i("MicroMsg.BakCalculator", "calculConv user:%s convMsgCount:%d", new Object[] { ((aj)localObject2).field_username, Integer.valueOf(i) });
        if (i > 0)
        {
          paramPInt.value = (i + paramPInt.value);
          ap.AS();
          if (!x.zM(com.tencent.mm.x.c.yL().SL(((aj)localObject2).field_username).field_verifyFlag)) {
            this.jNa.add(((aj)localObject2).field_username);
          }
        }
      }
    } while (((Cursor)localObject1).moveToNext());
    ((Cursor)localObject1).close();
    localObject1 = (String)com.tencent.mm.plugin.backup.g.a.afe().aff().xi().get(2, null);
    Object localObject2 = this.jNa.iterator();
    int i = 0;
    int j = 0;
    String str;
    Cursor localCursor;
    long l2;
    final int k;
    if (((Iterator)localObject2).hasNext())
    {
      str = (String)((Iterator)localObject2).next();
      localCursor = com.tencent.mm.plugin.backup.g.a.afe().aff().yN().BD(str);
      w.i("MicroMsg.BakCalculator", "calcItems user:%s msgCnt:%d[cu.getCount]", new Object[] { str, Integer.valueOf(localCursor.getCount()) });
      l2 = paramPLong.value;
      if (!localCursor.moveToFirst()) {
        break label946;
      }
      k = j;
      j = i;
      i = k;
      for (;;)
      {
        if (!localCursor.isAfterLast())
        {
          if (this.hng)
          {
            w.i("MicroMsg.BakCalculator", "calcItems cancel, return");
            localCursor.close();
            GMTrace.o(14731469389824L, 109758);
            return null;
          }
          au localau = new au();
          localau.b(localCursor);
          try
          {
            com.tencent.mm.plugin.backup.e.a.a.a(localau, true, (String)localObject1, paramPLong, null, null, false, false, 0L);
            j += 1;
            k = (int)(j * 100L / paramPInt.value);
            w.i("MicroMsg.BakCalculator", "temPro, progress, tempCnt, msgCount.value:  %d, %d, %d, %d", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramPInt.value) });
            if ((this.jTd != null) && (k > i)) {
              if (-1 == this.jLd)
              {
                this.jTf.m(k, paramPLong.value);
                i = k;
                label639:
                localCursor.moveToNext();
              }
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.BakCalculator", localException, "packedMsg", new Object[0]);
              continue;
              i = k;
              if (-21 == this.jLd)
              {
                this.handler.post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(14732543131648L, 109766);
                    a.this.jTd.n(k, paramPLong.value);
                    GMTrace.o(14732543131648L, 109766);
                  }
                });
                i = k;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      localCursor.close();
      w.i("MicroMsg.BakCalculator", "calc user:%s,  itemSize:%d, backupDataSize:%d, msgCount:%d", new Object[] { str, Long.valueOf(paramPLong.value - l2), Long.valueOf(paramPLong.value), Integer.valueOf(paramPInt.value) });
      k = j;
      j = i;
      i = k;
      break;
      w.i("MicroMsg.BakCalculator", "calc all, backupDataSize:%d, msgCount:%d, userSize:%d", new Object[] { Long.valueOf(paramPLong.value), Integer.valueOf(paramPInt.value), Integer.valueOf(this.jNa.size()) });
      if (-1 == this.jLd) {
        this.jTf.m(100, paramPLong.value);
      }
      for (;;)
      {
        l2 = System.currentTimeMillis();
        w.d("MicroMsg.BakCalculator", "loading  " + (l2 - l1));
        if (!this.hng) {
          break;
        }
        GMTrace.o(14731469389824L, 109758);
        return null;
        if ((-21 == this.jLd) && (this.jTd != null)) {
          this.handler.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(14734556397568L, 109781);
              a.this.jTd.n(100, paramPLong.value);
              a.this.jTd.afq();
              GMTrace.o(14734556397568L, 109781);
            }
          });
        }
      }
      paramPLong = this.jNa;
      GMTrace.o(14731469389824L, 109758);
      return paramPLong;
      break label639;
      label946:
      k = i;
      i = j;
      j = k;
    }
  }
  
  public final boolean a(PLong paramPLong1, PInt paramPInt, String paramString1, long paramLong, PLong paramPLong2, String paramString2)
  {
    GMTrace.i(14731603607552L, 109759);
    Cursor localCursor = com.tencent.mm.plugin.backup.g.a.afe().aff().yN().BD(paramString2);
    w.i("MicroMsg.BakCalculator", "calConversation user:%s msgCnt:%d[cu.getCount]", new Object[] { paramString2, Integer.valueOf(localCursor.getCount()) });
    if (localCursor.moveToFirst())
    {
      com.tencent.mm.plugin.backup.bakoldlogic.a.a locala = new com.tencent.mm.plugin.backup.bakoldlogic.a.a();
      locala.jKU = paramString2;
      paramPLong1.value = 0L;
      paramPInt.value = 0;
      for (;;)
      {
        if (!localCursor.isAfterLast())
        {
          if (this.hng)
          {
            w.i("MicroMsg.BakCalculator", "calcItemsToChoose cancel, return");
            localCursor.close();
            e.n(this.jTg);
            GMTrace.o(14731603607552L, 109759);
            return true;
          }
          au localau = new au();
          localau.b(localCursor);
          try
          {
            com.tencent.mm.plugin.backup.e.a.a.a(localau, true, paramString1, paramPLong1, null, null, false, false, 0L);
            paramPInt.value += 1;
            localCursor.moveToNext();
          }
          catch (Exception localException)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.BakCalculator", localException, "packedMsg", new Object[0]);
            }
          }
        }
      }
      locala.jKX = paramPLong1.value;
      locala.jKY = paramPInt.value;
      this.jTg.add(locala);
      paramPLong2.value += 1L;
      w.i("MicroMsg.BakCalculator", "calcItemsToChoose calitem user:%s,  convDataSize:%d, convMsgCount:%d", new Object[] { paramString2, Long.valueOf(paramPLong1.value), Integer.valueOf(paramPInt.value) });
    }
    if (this.jTe != null)
    {
      final long l = paramPLong2.value;
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14736703881216L, 109797);
          if (l % a.jTh == 0L)
          {
            a.this.jTe.a(l, this.jTo, a.this.jTg, true);
            GMTrace.o(14736703881216L, 109797);
            return;
          }
          a.this.jTe.a(l, this.jTo, a.this.jTg, false);
          GMTrace.o(14736703881216L, 109797);
        }
      });
    }
    localCursor.close();
    GMTrace.o(14731603607552L, 109759);
    return false;
  }
  
  public final void cancel()
  {
    GMTrace.i(14731335172096L, 109757);
    w.i("MicroMsg.BakCalculator", "calculator cancel.");
    w.d("MicroMsg.BakCalculator", "calculator cancel. stack:%s", new Object[] { bg.bOd() });
    this.hng = true;
    GMTrace.o(14731335172096L, 109757);
  }
  
  public static abstract interface a
  {
    public abstract void m(int paramInt, long paramLong);
  }
  
  public static abstract interface b
  {
    public abstract void afq();
    
    public abstract void n(int paramInt, long paramLong);
  }
  
  public static abstract interface c
  {
    public abstract void a(long paramLong1, long paramLong2, ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> paramArrayList, boolean paramBoolean);
    
    public abstract void a(ArrayList<com.tencent.mm.plugin.backup.bakoldlogic.a.a> paramArrayList, PLong paramPLong, PInt paramPInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */