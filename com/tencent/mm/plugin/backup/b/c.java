package com.tencent.mm.plugin.backup.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.backup.a.b.b;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.e.a.a;
import com.tencent.mm.plugin.backup.e.a.c;
import com.tencent.mm.plugin.backup.f.b;
import com.tencent.mm.plugin.backup.f.h;
import com.tencent.mm.plugin.backup.f.h.a;
import com.tencent.mm.plugin.backup.f.i;
import com.tencent.mm.plugin.backup.f.j;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.h.aa;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.eh;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.n;
import com.tencent.mm.x.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import junit.framework.Assert;

public final class c
{
  public boolean jLG;
  public b.b jLH;
  public com.tencent.mm.plugin.backup.a.e jLI;
  public long jLJ;
  public long jLK;
  private int jLd;
  
  public c(com.tencent.mm.plugin.backup.a.e parame, int paramInt, b.b paramb)
  {
    GMTrace.i(18451045285888L, 137471);
    this.jLG = false;
    this.jLJ = 0L;
    this.jLK = 0L;
    this.jLI = parame;
    this.jLd = paramInt;
    this.jLH = paramb;
    GMTrace.o(18451045285888L, 137471);
  }
  
  public static int w(LinkedList<com.tencent.mm.plugin.backup.a.g> paramLinkedList)
  {
    GMTrace.i(16048816390144L, 119573);
    HashSet localHashSet = new HashSet();
    if (paramLinkedList == null)
    {
      GMTrace.o(16048816390144L, 119573);
      return 0;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext()) {
      localHashSet.add(((com.tencent.mm.plugin.backup.a.g)paramLinkedList.next()).jLl);
    }
    int i = localHashSet.size();
    GMTrace.o(16048816390144L, 119573);
    return i;
  }
  
  public final void a(final LinkedList<com.tencent.mm.plugin.backup.a.g> paramLinkedList, final int paramInt, final long paramLong, boolean paramBoolean)
  {
    GMTrace.i(18451179503616L, 137472);
    if (paramLinkedList == null) {}
    for (int i = -1;; i = paramLinkedList.size())
    {
      w.i("MicroMsg.BackupPackAndSend", "startBackup, backupSessionList size[%d], bigFileSize[%d], isOnlyText[%b]", new Object[] { Integer.valueOf(i), Long.valueOf(paramLong), Boolean.valueOf(paramBoolean) });
      com.tencent.mm.sdk.f.e.d(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9474026766336L, 70587);
          if (paramLinkedList == null)
          {
            w.e("MicroMsg.BackupPackAndSend", "backupChatRunnable backupSessionList is null.");
            if (c.this.jLH != null)
            {
              c.this.jLH.adC();
              c.this.jLI.adG().jLh = -21;
              c.this.jLH.a(c.this.jLI.adG());
            }
            GMTrace.o(9474026766336L, 70587);
            return;
          }
          b.aeU().start();
          c.this.jLI.adG().y(14, 1, c.w(paramLinkedList));
          c.this.jLH.a(c.this.jLI.adG());
          Object localObject1 = (String)a.afe().aff().xi().get(2, null);
          long l1 = bg.Pp();
          c.this.jLK = l1;
          Object localObject2 = new c.c(c.this);
          int i = 0;
          while (i < paramLinkedList.size())
          {
            c.this.a((com.tencent.mm.plugin.backup.a.g)paramLinkedList.get(i), (c.c)localObject2, (String)localObject1, paramLong, paramInt);
            if (c.this.jLG) {
              break;
            }
            i += 1;
          }
          if (c.this.jLG)
          {
            w.e("MicroMsg.BackupPackAndSend", "backupChatRunnable canceled!");
            GMTrace.o(9474026766336L, 70587);
            return;
          }
          long l2 = bg.Pp();
          long l3 = bg.Pp();
          ((c.c)localObject2).jMq.offer(((c.c)localObject2).jMr);
          ((c.c)localObject2).jMr.block();
          w.i("MicroMsg.BackupPackAndSend", "TagQueue waitFinish Finish Now:%d", new Object[] { Long.valueOf(bg.aF(l3)) });
          Assert.assertTrue(((c.c)localObject2).jMq.isEmpty());
          w.i("MicroMsg.BackupPackAndSend", "backupChatRunnable finish cancel[%b], Session[%d], loopTime[%d], waitSendTime:%d", new Object[] { Boolean.valueOf(c.this.jLG), Integer.valueOf(paramLinkedList.size()), Long.valueOf(bg.aF(l1)), Long.valueOf(bg.aF(l2)) });
          c.this.adS();
          i = c.w(paramLinkedList);
          c.this.jLI.adG().y(15, i, c.w(paramLinkedList));
          c.this.jLH.a(c.this.jLI.adG());
          c.this.cZ(true);
          if (b.aeT() != null) {
            b.aeT().stop();
          }
          if (b.aeU() != null) {
            b.aeU().stop();
          }
          if (com.tencent.mm.plugin.backup.a.e.adJ() == 1)
          {
            com.tencent.mm.plugin.report.service.g.paX.a(400L, 12L, bg.aF(l1), false);
            com.tencent.mm.plugin.report.service.g.paX.a(400L, 11L, 1L, false);
            com.tencent.mm.plugin.report.service.g.paX.a(400L, 13L, c.this.jLJ, false);
            com.tencent.mm.plugin.report.service.g.paX.i(13737, new Object[] { Integer.valueOf(0), Long.valueOf(c.this.jLJ / 1024L), Long.valueOf(bg.aF(l1) / 1000L), Integer.valueOf(1), Integer.valueOf(this.jLO) });
          }
          w.i("MicroMsg.BackupPackAndSend", "backupChatRunnable backupfinish, backupDataSize[%d], backupCostTime[%d], backupStartTime[%d], backupEndTime[%d]", new Object[] { Long.valueOf(c.this.jLJ), Long.valueOf(bg.aF(l1)), Long.valueOf(l1), Long.valueOf(bg.Pp()) });
          localObject2 = a.afe().aff().jSx;
          if (localObject2 == null) {}
          for (localObject1 = "null";; localObject1 = localObject2)
          {
            w.i("MicroMsg.BackupPackAndSend", "backupChatRunnable send finish, isTempDb[%s]", new Object[] { localObject1 });
            if (localObject2 != null) {
              a.afe().o(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(9469463363584L, 70553);
                  w.i("MicroMsg.BackupPackAndSend", "backupChatRunnable backupcloseTempDB end");
                  w.bMS();
                  GMTrace.o(9469463363584L, 70553);
                }
              });
            }
            GMTrace.o(9474026766336L, 70587);
            return;
          }
        }
      }, "backupPackThread", 10).start();
      GMTrace.o(18451179503616L, 137472);
      return;
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.backup.a.g paramg, c paramc, String paramString, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(18451313721344L, 137473);
    localObject1 = a.afe().aff().yQ().SV(paramg.jLl);
    int i;
    long l5;
    int k;
    long l2;
    long l1;
    int j;
    if (localObject1 != null)
    {
      i = ((aj)localObject1).field_unReadCount;
      w.i("MicroMsg.BackupPackAndSend", "backupChatMsg index[%d], convName[%s], startTime[%d], endTime[%d], unReadCount[%d]", new Object[] { Integer.valueOf(paramg.jLm), paramg.jLl, Long.valueOf(paramg.startTime), Long.valueOf(paramg.endTime), Integer.valueOf(i) });
      l5 = bg.Pp();
      k = 0;
      l2 = 0L;
      l3 = 0L;
      l1 = 0L;
      j = i;
      i = k;
    }
    long l4;
    for (;;)
    {
      LinkedList localLinkedList1 = new LinkedList();
      l4 = bg.Pp();
      localObject1 = a.afe().aff().yN().a(paramg.jLl, paramg.startTime, paramg.endTime, i);
      Object localObject2;
      for (;;)
      {
        if (!((Cursor)localObject1).moveToNext()) {
          break label260;
        }
        k = i + 1;
        if (this.jLG)
        {
          ((Cursor)localObject1).close();
          GMTrace.o(18451313721344L, 137473);
          return false;
          i = 0;
          break;
        }
        localObject2 = new au();
        ((au)localObject2).b((Cursor)localObject1);
        if (paramBoolean)
        {
          i = k;
          if (((ce)localObject2).field_type != 1) {}
        }
        else
        {
          localLinkedList1.add(localObject2);
          i = k;
        }
      }
      label260:
      ((Cursor)localObject1).close();
      l4 = l3 - l4 + bg.Pp();
      if (localLinkedList1.size() == 0) {
        break label679;
      }
      k = 0;
      l3 = l2;
      l2 = l1;
      l1 = l3;
      if (k < localLinkedList1.size())
      {
        Object localObject3 = (au)localLinkedList1.get(k);
        PLong localPLong = new PLong();
        LinkedList localLinkedList2 = new LinkedList();
        HashMap localHashMap = new HashMap();
        for (;;)
        {
          try
          {
            l3 = bg.Pp();
            l1 -= l3;
            if (j > 0) {
              bool = true;
            }
          }
          catch (Exception localException1)
          {
            boolean bool;
            int m;
            localObject1 = null;
          }
          try
          {
            localObject1 = a.a.a((au)localObject3, false, paramString, localPLong, localLinkedList2, localHashMap, bool, false, paramLong);
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              label643:
              localObject1 = null;
            }
          }
          try
          {
            l3 = bg.Pp();
            l1 = l3 + l1;
            w.i("MicroMsg.BackupPackAndSend", "backupChatMsg bakitem[%s], mediaList[%d], addupSize[%d], bigfile[%d], msgSvrId[%d], type[%d], creatTime[%d], talker[%s]", new Object[] { localObject1, Integer.valueOf(localLinkedList2.size()), Long.valueOf(localPLong.value), Integer.valueOf(localHashMap.size()), Long.valueOf(((ce)localObject3).field_msgSvrId), Integer.valueOf(((ce)localObject3).field_type), Long.valueOf(((ce)localObject3).field_createTime), ((ce)localObject3).field_talker });
            l3 = l2;
            m = j;
            if (localObject1 != null)
            {
              l3 = bg.Pp();
              long l6 = localPLong.value;
              long l7 = ((ce)localObject3).field_createTime;
              if (paramc.jMs == null)
              {
                localObject2 = paramc.jMq;
                localObject3 = new b(paramc.jLP, paramc.jLV, paramg);
                paramc.jMs = ((b)localObject3);
                ((LinkedBlockingQueue)localObject2).offer(localObject3);
              }
              if (paramc.jMs.a((eh)localObject1, l6, l7, localLinkedList2, localHashMap)) {
                paramc.jMs = null;
              }
              l3 = l2 - l3 + bg.Pp();
              m = j - 1;
            }
            k += 1;
            l2 = l3;
            j = m;
          }
          catch (Exception localException3)
          {
            break label643;
          }
          bool = false;
          continue;
          w.printErrStackTrace("MicroMsg.BackupPackAndSend", localException1, "backupChatMsg packedMsg", new Object[0]);
        }
      }
      l3 = l4;
      l4 = l1;
      l1 = l2;
      l2 = l4;
    }
    label679:
    paramLong = bg.Pp();
    if (paramc.jMs == null)
    {
      paramString = paramc.jMq;
      localObject1 = new b(paramc.jLP, paramc.jLV, paramg);
      paramc.jMs = ((b)localObject1);
      paramString.offer(localObject1);
    }
    paramc.jMs.adT();
    paramc.jMs = null;
    long l3 = bg.Pp();
    w.i("MicroMsg.BackupPackAndSend", "backupChatMsg finish Cursor Session[%d], convName[%s], msgCnt[%d], time[%d], [%d,%d,%d]", new Object[] { Integer.valueOf(paramg.jLm), paramg.jLl, Integer.valueOf(i), Long.valueOf(bg.aF(l5)), Long.valueOf(l4), Long.valueOf(l2), Long.valueOf(l1 - paramLong + l3) });
    GMTrace.o(18451313721344L, 137473);
    return true;
  }
  
  public final void adS()
  {
    GMTrace.i(9470134452224L, 70558);
    w.i("MicroMsg.BackupPackAndSend", "backupSendFinishRequest.");
    com.tencent.mm.plugin.backup.h.d locald = new com.tencent.mm.plugin.backup.h.d();
    locald.ID = this.jLI.jKZ;
    try
    {
      b.r(locald.toByteArray(), 8);
      GMTrace.o(9470134452224L, 70558);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.BackupPackAndSend", localException, "BackupFinishRequest to buf err.", new Object[0]);
      GMTrace.o(9470134452224L, 70558);
    }
  }
  
  public final void cZ(boolean paramBoolean)
  {
    GMTrace.i(14728516599808L, 109736);
    w.i("MicroMsg.BackupPackAndSend", "clearContinueBackupData.");
    SharedPreferences.Editor localEditor;
    if (this.jLd == 1)
    {
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.vae, Boolean.valueOf(false));
      localEditor = com.tencent.mm.plugin.backup.a.e.adL().edit();
      localEditor.putString("BACKUP_PC_CHOOSE_SESSION", null);
      if (paramBoolean)
      {
        if (this.jLd != 1) {
          break label163;
        }
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
      }
    }
    for (;;)
    {
      localEditor.commit();
      GMTrace.o(14728516599808L, 109736);
      return;
      if (this.jLd != 2) {
        break;
      }
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.vah, Boolean.valueOf(false));
      break;
      label163:
      if (this.jLd == 2)
      {
        localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0);
        localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0);
        localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L);
        localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L);
      }
    }
  }
  
  private final class a
  {
    volatile AtomicLong jLR;
    ac jLS;
    ac jLT;
    
    public a()
    {
      GMTrace.i(9481811394560L, 70645);
      this.jLR = new AtomicLong(0L);
      this.jLS = new ac(true);
      this.jLT = new ac(true);
      GMTrace.o(9481811394560L, 70645);
    }
  }
  
  private final class b
  {
    public String TAG;
    public String aDw;
    public String fAJ;
    public long jKV;
    public long jKW;
    public LinkedBlockingQueue<Runnable> jLU;
    public c.a jLV;
    long jLW;
    public String jLX;
    public Vector<String> jLY;
    Vector<eh> jLZ;
    public int jLm;
    public HashMap<Long, a.c> jMa;
    public long jMb;
    public boolean jMc;
    private final com.tencent.mm.plugin.backup.f.c.b jMd;
    private final Runnable jMe;
    public final Runnable jMf;
    
    public b(c.a parama, com.tencent.mm.plugin.backup.a.g paramg)
    {
      GMTrace.i(18452655898624L, 137483);
      this.TAG = "";
      this.jLU = new LinkedBlockingQueue();
      this.jLV = null;
      this.jKV = 0L;
      this.jKW = 0L;
      this.jLW = 0L;
      this.jLX = "";
      this.jLY = new Vector();
      this.jLZ = new Vector();
      this.jMa = new HashMap();
      this.jMb = 0L;
      this.jMc = false;
      this.jMd = new com.tencent.mm.plugin.backup.f.c.b()
      {
        public final void c(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(9479663910912L, 70629);
          c.a locala = c.b.this.jLV;
          long l1 = paramAnonymousInt;
          locala.jLR.addAndGet(0L - l1);
          if (locala.jLR.get() < 8388608L) {
            locala.jLS.open();
          }
          if (locala.jLR.get() < 16777216L) {
            locala.jLT.open();
          }
          long l2 = locala.jLR.get();
          boolean bool1;
          if (locala.jLR.get() >= 8388608L)
          {
            bool1 = true;
            if (locala.jLR.get() < 16777216L) {
              break label270;
            }
          }
          label270:
          for (boolean bool2 = true;; bool2 = false)
          {
            w.v("MicroMsg.BackupPackAndSend", "MemoryChecker.release size:%d sum:%d [%b,%b] [%b,%b]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(locala.jLS.uMD), Boolean.valueOf(locala.jLT.uMD) });
            c.this.jLJ += paramAnonymousInt;
            w.i(c.b.this.TAG, "OnfinishIdCallback size:%d finishid:%b [%s] ", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString });
            GMTrace.o(9479663910912L, 70629);
            return;
            bool1 = false;
            break;
          }
        }
      };
      this.jMe = new Runnable()
      {
        public final void run()
        {
          boolean bool = true;
          GMTrace.i(9464363089920L, 70515);
          Assert.assertTrue(toString() + ", check running. ", c.b.this.jMc);
          w.i(c.b.this.TAG, "requestBigFileList svrIdCnt:%d timeDiff:%d caller:%s", new Object[] { Integer.valueOf(c.b.this.jMa.size()), Long.valueOf(bg.aF(c.b.this.jMb)), ah.bNq() });
          if (!c.b.this.jMa.isEmpty()) {}
          for (;;)
          {
            Assert.assertTrue("BigFileMap should not Empty", bool);
            h.a local1 = new h.a()
            {
              public final void x(final LinkedList<Long> paramAnonymous2LinkedList)
              {
                GMTrace.i(9481140305920L, 70640);
                com.tencent.mm.sdk.f.e.b(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(9476040032256L, 70602);
                    int i = 0;
                    if ((paramAnonymous2LinkedList != null) && (i < paramAnonymous2LinkedList.size()))
                    {
                      Long localLong = (Long)paramAnonymous2LinkedList.get(i);
                      a.c localc = (a.c)c.b.this.jMa.get(localLong);
                      String str3 = c.b.this.TAG;
                      int j = paramAnonymous2LinkedList.size();
                      String str1;
                      if (localc == null)
                      {
                        str1 = "null";
                        label95:
                        if (localc != null) {
                          break label222;
                        }
                      }
                      label222:
                      for (String str2 = "null";; str2 = localc.jPt.path)
                      {
                        w.i(str3, "backupBigDataFiles svrIdIndex:%d(%d), svrId:%d media:%s item:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localLong, str1, str2 });
                        if (localc != null)
                        {
                          c.b.this.jLY.add(localc.jPt.mediaId);
                          c.b.this.g(localc.jPt.mediaId, localc.jPt.path, true);
                        }
                        i += 1;
                        break;
                        str1 = localc.jPt.mediaId;
                        break label95;
                      }
                    }
                    c.b.this.jLU.offer(c.b.this.jMf);
                    GMTrace.o(9476040032256L, 70602);
                  }
                }, "AddBigFileToQueue").start();
                GMTrace.o(9481140305920L, 70640);
              }
            };
            new h(c.b.this.fAJ, c.b.this.jMa, local1).aeV();
            GMTrace.o(9464363089920L, 70515);
            return;
            bool = false;
          }
        }
        
        public final String toString()
        {
          GMTrace.i(9464228872192L, 70514);
          String str = c.b.this.TAG + ".reqBigFile";
          GMTrace.o(9464228872192L, 70514);
          return str;
        }
      };
      this.jMf = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9481542959104L, 70643);
          Assert.assertTrue(toString() + ", check running. ", c.b.this.jMc);
          final boolean bool1;
          switch (com.tencent.mm.plugin.backup.a.e.adJ())
          {
          default: 
            if (c.b.this.jLm == c.this.jLI.adG().jLj - 1)
            {
              bool1 = true;
              label106:
              if (bool1) {
                break label763;
              }
            }
            break;
          }
          label763:
          for (boolean bool2 = true;; bool2 = false)
          {
            final Object localObject = new ac(bool2);
            com.tencent.mm.ac.e local1 = new com.tencent.mm.ac.e()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, k paramAnonymous2k)
              {
                GMTrace.i(9464631525376L, 70517);
                paramAnonymous2k = ((aa)((com.tencent.mm.plugin.backup.f.d)paramAnonymous2k).jRu).jYb;
                w.i(c.b.this.TAG, "Send Tag finish last:%b  cv:%s [%d,%d,%s] tag[%s,%s]", new Object[] { Boolean.valueOf(bool1), localObject, Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String, c.b.this.jLX, paramAnonymous2k });
                if ((bool1) && (c.b.this.jLX.equals(paramAnonymous2k))) {
                  localObject.open();
                }
                GMTrace.o(9464631525376L, 70517);
              }
            };
            new com.tencent.mm.plugin.backup.f.d(c.b.this.fAJ, c.b.this.jKV, c.b.this.jKW, c.b.this.jLX, c.b.this.aDw, new LinkedList(c.b.this.jLY), local1).aeV();
            if (bool1)
            {
              w.w(c.b.this.TAG, "sendTag last Session :[%d/%d] wait tag resp callback .", new Object[] { Integer.valueOf(c.b.this.jLm), Integer.valueOf(c.this.jLI.adG().jLj - 1) });
              ((ac)localObject).block();
            }
            c.b.this.jMc = false;
            GMTrace.o(9481542959104L, 70643);
            return;
            w.i(c.b.this.TAG, "sendTag session:%d time[%d,%d] media:%d nick:%s id:%s timeDiff:%s", new Object[] { Integer.valueOf(c.this.jLI.adG().jLi), Long.valueOf(c.b.this.jKV), Long.valueOf(c.b.this.jKW), Integer.valueOf(c.b.this.jLY.size()), c.b.this.aDw, c.b.this.jLX, Long.valueOf(bg.aF(c.b.this.jMb)) });
            if (c.this.jLI.adG().jLi >= c.b.this.jLm + 1) {
              break;
            }
            int i = c.this.jLI.adG().jLj;
            localObject = c.this.jLI.adG();
            if (c.b.this.jLm + 1 > i) {}
            for (;;)
            {
              ((f)localObject).jLi = i;
              c.this.jLH.a(c.this.jLI.adG());
              break;
              i = c.b.this.jLm + 1;
            }
            w.i(c.b.this.TAG, "sendTag session:%d time[%d,%d] media:%d nick:%s id:%s timeDiff:%s", new Object[] { Integer.valueOf(c.this.jLI.adG().jLi), Long.valueOf(c.b.this.jKV), Long.valueOf(c.b.this.jKW), Integer.valueOf(c.b.this.jLY.size()), c.b.this.aDw, c.b.this.jLX, Long.valueOf(bg.aF(c.b.this.jMb)) });
            if (c.this.jLI.adG().jLi >= c.b.this.jLm + 1) {
              break;
            }
            i = c.this.jLI.adG().jLj;
            localObject = c.this.jLI.adG();
            if (c.b.this.jLm + 1 > i) {}
            for (;;)
            {
              ((f)localObject).jLi = i;
              c.this.jLH.a(c.this.jLI.adG());
              break;
              i = c.b.this.jLm + 1;
            }
            bool1 = false;
            break label106;
          }
        }
        
        public final String toString()
        {
          GMTrace.i(9481408741376L, 70642);
          String str = c.b.this.TAG + ".sendTag";
          GMTrace.o(9481408741376L, 70642);
          return str;
        }
      };
      this.jMb = bg.Pp();
      this.jLV = parama;
      this.fAJ = paramg.jLl;
      this.jLm = paramg.jLm;
      if (o.dW(this.fAJ))
      {
        this$1 = n.E(this.fAJ, this.fAJ);
        this.aDw = c.this;
        parama = new StringBuilder("MicroMsg.BackupPackAndSend.tag");
        if (!this.jMc) {
          break label308;
        }
      }
      label308:
      for (this$1 = "S.";; this$1 = "W.")
      {
        this.TAG = (c.this + this.jLm + "." + this.aDw);
        w.i(this.TAG, "initTagNow [%d,%s,%s] [%s]", new Object[] { Integer.valueOf(this.jLm), this.aDw, this.fAJ, ah.bNq() });
        GMTrace.o(18452655898624L, 137483);
        return;
        this$1 = n.fc(this.fAJ);
        break;
      }
    }
    
    public final boolean a(eh parameh, long paramLong1, long paramLong2, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap)
    {
      GMTrace.i(9466779009024L, 70533);
      this.jLZ.add(parameh);
      long l2 = this.jLW;
      if (paramLong1 > 0L) {}
      for (long l1 = paramLong1;; l1 = 0L)
      {
        this.jLW = (l1 + l2);
        if (this.jKV == 0L) {
          this.jKV = paramLong2;
        }
        this.jKW = paramLong2;
        this.jMa.putAll(paramHashMap);
        parameh = paramLinkedList.iterator();
        while (parameh.hasNext())
        {
          paramHashMap = (u)parameh.next();
          g(paramHashMap.mediaId, paramHashMap.path, false);
        }
      }
      w.i(this.TAG, "addToTag msgtime[%d,%d] size[%d,%d] baklist:%d media:%d timeDiff:%d", new Object[] { Long.valueOf(this.jKV), Long.valueOf(this.jKW), Long.valueOf(paramLong1), Long.valueOf(this.jLW), Integer.valueOf(this.jLZ.size()), Integer.valueOf(paramLinkedList.size()), Long.valueOf(bg.aF(this.jMb)) });
      if ((this.jLW > 83886080L) || (this.jLZ.size() > 80))
      {
        adT();
        GMTrace.o(9466779009024L, 70533);
        return true;
      }
      GMTrace.o(9466779009024L, 70533);
      return false;
    }
    
    public final void adT()
    {
      GMTrace.i(9466913226752L, 70534);
      this.jLX = ("MSG_" + this.jLZ.size() + "_" + this.fAJ + "_" + bg.Pp());
      w.i(this.TAG, "setTagEnd msgtime[%d,%d] size:%d baklist:%d bigfile:%d id:%s timeDiff:%d", new Object[] { Long.valueOf(this.jKV), Long.valueOf(this.jKW), Long.valueOf(this.jLW), Integer.valueOf(this.jLZ.size()), Integer.valueOf(this.jMa.size()), this.jLX, Long.valueOf(bg.aF(this.jMb)) });
      if (this.jLZ.size() > 0)
      {
        g(this.jLX, null, false);
        if (this.jMa.isEmpty())
        {
          this.jLU.offer(this.jMf);
          GMTrace.o(9466913226752L, 70534);
          return;
        }
        this.jLU.offer(this.jMe);
        GMTrace.o(9466913226752L, 70534);
        return;
      }
      w.w(this.TAG, "setTagEnd NoFileSend, Go Send Tag: Direct. baklist:%d media:%d bigFileMap:%d ", new Object[] { Integer.valueOf(this.jLZ.size()), Integer.valueOf(this.jLY.size()), Integer.valueOf(this.jMa.size()) });
      Assert.assertTrue("cursorEnd NOMsg, chatMsgList should empty", this.jLZ.isEmpty());
      Assert.assertTrue("cursorEnd NOMsg, MediaList should empty", this.jLY.isEmpty());
      Assert.assertTrue("cursorEnd NOMsg, BigFileList should empyt", this.jMa.isEmpty());
      this.jLU.offer(this.jMf);
      GMTrace.o(9466913226752L, 70534);
    }
    
    public final void g(String paramString1, String paramString2, boolean paramBoolean)
    {
      boolean bool = true;
      GMTrace.i(9467047444480L, 70535);
      com.tencent.mm.plugin.backup.f.c.c local2 = new com.tencent.mm.plugin.backup.f.c.c()
      {
        public final void a(final com.tencent.mm.plugin.backup.f.c paramAnonymousc)
        {
          GMTrace.i(9480469217280L, 70635);
          final long l2 = bg.Pp();
          c.a locala = c.b.this.jLV;
          long l3 = paramAnonymousc.aeZ();
          boolean bool3 = c.b.this.jMc;
          long l1 = locala.jLR.get();
          boolean bool1;
          label83:
          long l4;
          if (locala.jLR.get() >= 8388608L)
          {
            bool1 = true;
            if (locala.jLR.get() < 16777216L) {
              break label383;
            }
            bool2 = true;
            w.v("MicroMsg.BackupPackAndSend", "MemoryChecker.waitMemoryValid %b inSize:%d sum:%d  [%b,%b]", new Object[] { Boolean.valueOf(bool3), Long.valueOf(l3), Long.valueOf(l1), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            if (locala.jLR.get() + l3 >= 8388608L) {
              locala.jLS.close();
            }
            if (locala.jLR.get() >= 16777216L) {
              locala.jLT.close();
            }
            l4 = bg.Pp();
            if (!locala.jLP.jLG)
            {
              long l5 = locala.jLR.get();
              if (!bool3) {
                break label389;
              }
              l1 = 16777216L;
              label217:
              if (l5 >= l1) {
                break label408;
              }
              locala.jLR.addAndGet(l3);
              l1 = bg.aF(l4);
              l4 = locala.jLR.get();
              if (locala.jLR.get() < 8388608L) {
                break label396;
              }
              bool1 = true;
              label269:
              if (locala.jLR.get() < 16777216L) {
                break label402;
              }
            }
          }
          label383:
          label389:
          label396:
          label402:
          for (boolean bool2 = true;; bool2 = false)
          {
            w.v("MicroMsg.BackupPackAndSend", "MemoryChecker.waitMemoryValid Out:%d %b inSize:%d sum:%d  [%b,%b]", new Object[] { Long.valueOf(l1), Boolean.valueOf(bool3), Long.valueOf(l3), Long.valueOf(l4), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            c.b.this.jLU.offer(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(9468121186304L, 70543);
                Assert.assertTrue(toString() + ", check running. ", c.b.this.jMc);
                long l1 = bg.Pp();
                paramAnonymousc.aeV();
                long l2 = bg.Pp();
                w.i(c.b.this.TAG, "SendFileScene size:%d waitTime:%d netTime:%d [%s]", new Object[] { Integer.valueOf(paramAnonymousc.aeZ()), Long.valueOf(l2 - l2), Long.valueOf(l2 - l1), paramAnonymousc.jRj.jXS });
                GMTrace.o(9468121186304L, 70543);
              }
              
              public final String toString()
              {
                GMTrace.i(9467986968576L, 70542);
                String str = c.b.this.TAG + ".sendFile";
                GMTrace.o(9467986968576L, 70542);
                return str;
              }
            });
            GMTrace.o(9480469217280L, 70635);
            return;
            bool1 = false;
            break;
            bool2 = false;
            break label83;
            l1 = 8388608L;
            break label217;
            bool1 = false;
            break label269;
          }
          label408:
          if (bool3) {}
          for (ac localac = locala.jLT;; localac = locala.jLS)
          {
            localac.bNj();
            break;
          }
        }
      };
      w.i(this.TAG, "postSendFile BIG:%b  baklst:%d Id:%s path:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(this.jLZ.size()), paramString1, paramString2 });
      if (!TextUtils.isEmpty(paramString2))
      {
        this.jLY.add(paramString1);
        if (paramString1 != null)
        {
          com.tencent.mm.plugin.backup.f.c.a(this.jMd, local2, paramString1, paramString2, c.this.jLI.jLf);
          GMTrace.o(9467047444480L, 70535);
        }
      }
      else
      {
        if (this.jLZ.isEmpty()) {
          break label180;
        }
      }
      label180:
      for (paramBoolean = bool;; paramBoolean = false)
      {
        Assert.assertTrue("chatMsgList should not empty", paramBoolean);
        if (paramString1 != null) {
          com.tencent.mm.plugin.backup.f.c.a(this.jMd, local2, paramString1, new LinkedList(this.jLZ), c.this.jLI.jLf);
        }
        GMTrace.o(9467047444480L, 70535);
        return;
      }
    }
    
    public final String toString()
    {
      GMTrace.i(9466510573568L, 70531);
      String str = this.TAG;
      GMTrace.o(9466510573568L, 70531);
      return str;
    }
  }
  
  private final class c
  {
    public c.a jLV;
    public LinkedBlockingQueue<Object> jMq;
    public ac jMr;
    public c.b jMs;
    private Runnable jMt;
    
    public c()
    {
      GMTrace.i(9468523839488L, 70546);
      this.jMq = new LinkedBlockingQueue();
      this.jLV = new c.a(c.this);
      this.jMr = new ac();
      this.jMs = null;
      this.jMt = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9479932346368L, 70631);
          while (!c.this.jLG)
          {
            Object localObject1 = null;
            try
            {
              localObject2 = c.c.this.jMq.poll(500L, TimeUnit.MILLISECONDS);
              localObject1 = localObject2;
            }
            catch (Exception localException2)
            {
              Object localObject2;
              c.b localb1;
              label150:
              label186:
              label277:
              label288:
              label439:
              label444:
              label449:
              for (;;) {}
            }
            w.d("MicroMsg.BackupPackAndSend", "TagQueue(%d)startNext obj:%s", new Object[] { Integer.valueOf(c.c.this.jMq.size()), localObject1 });
            if (localObject1 != null)
            {
              if (localObject1 == c.c.this.jMr)
              {
                c.c.this.jMr.open();
                GMTrace.o(9479932346368L, 70631);
                return;
              }
              localb1 = (c.b)localObject1;
              localb1.jMc = true;
              localObject2 = new StringBuilder("MicroMsg.BackupPackAndSend.tag");
              if (localb1.jMc)
              {
                localObject1 = "S.";
                localb1.TAG = ((String)localObject1 + localb1.jLm + "." + localb1.aDw);
                while (!c.this.jLG)
                {
                  localObject1 = null;
                  try
                  {
                    localObject2 = (Runnable)localb1.jLU.poll(500L, TimeUnit.MILLISECONDS);
                    localObject1 = localObject2;
                  }
                  catch (Exception localException1)
                  {
                    long l1;
                    int k;
                    long l2;
                    int i;
                    int j;
                    String str;
                    c.b localb2;
                    for (;;) {}
                  }
                  if (localObject1 != null)
                  {
                    l1 = bg.Pp();
                    ((Runnable)localObject1).run();
                    k = localb1.jLU.size();
                    l2 = c.c.this.jLV.jLR.get();
                    if (l2 < 8388608L) {
                      break label439;
                    }
                    i = 1;
                    if (l2 < 16777216L) {
                      break label444;
                    }
                    j = 1;
                    str = String.format("[%s,%s,%s]", new Object[] { Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j) });
                    l1 = bg.aF(l1);
                    localb2 = c.c.this.jMs;
                    if (c.c.this.jMs == null) {
                      break label449;
                    }
                  }
                }
              }
              for (localObject2 = Integer.valueOf(c.c.this.jMs.jLU.size());; localObject2 = "null")
              {
                w.d("MicroMsg.BackupPackAndSend", "workerQueue poll q:%d mem:%s rt:%d [%s,%s,%s,%s]", new Object[] { Integer.valueOf(k), str, Long.valueOf(l1), localObject1, localb1, localb2, localObject2 });
                if (localb1.jMc) {
                  break label186;
                }
                System.gc();
                break;
                localObject1 = "W.";
                break label150;
                i = 0;
                break label277;
                j = 0;
                break label288;
              }
            }
          }
          GMTrace.o(9479932346368L, 70631);
        }
      };
      com.tencent.mm.sdk.f.e.b(this.jMt, "TagWorker").start();
      GMTrace.o(9468523839488L, 70546);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */