package com.tencent.mm.plugin.backup.c;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.k;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui.BakMoveOldUI;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.f.i.a;
import com.tencent.mm.plugin.backup.f.j.a;
import com.tencent.mm.plugin.backup.h.m;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.backup.h.v;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
  implements com.tencent.mm.plugin.backup.a.b.b, b.c
{
  public static boolean jMG;
  public static boolean jOh;
  public byte[] bitmapData;
  public b.d jMC;
  public boolean jNE;
  public com.tencent.mm.plugin.backup.f.b.b jNT;
  private final i.a jNU;
  public final j.a jNV;
  public LinkedList<String> jOa;
  private com.tencent.mm.plugin.backup.b.b jOb;
  private com.tencent.mm.plugin.backup.b.c jOc;
  public long jOd;
  public long jOe;
  public boolean jOf;
  public int jOg;
  private boolean jOi;
  private int jOj;
  private int jOk;
  private int jOl;
  public e jOm;
  
  static
  {
    GMTrace.i(18449434673152L, 137459);
    jMG = false;
    jOh = false;
    GMTrace.o(18449434673152L, 137459);
  }
  
  public d()
  {
    GMTrace.i(9540330323968L, 71081);
    this.jOd = 0L;
    this.jOe = 0L;
    this.jOf = false;
    this.jOg = 0;
    this.jOi = false;
    this.jNE = false;
    this.jOl = 0;
    this.jNT = new com.tencent.mm.plugin.backup.f.b.b()
    {
      public final void aeq()
      {
        GMTrace.i(18447287189504L, 137443);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "stopCallback ");
        if (com.tencent.mm.plugin.backup.f.b.aeT() != null) {
          com.tencent.mm.plugin.backup.f.b.aeT().stop();
        }
        b.aef().adI();
        GMTrace.o(18447287189504L, 137443);
      }
    };
    this.jNU = new i.a()
    {
      public final void xD()
      {
        GMTrace.i(18449703108608L, 137461);
        if (b.aef().adG().jLh <= 0)
        {
          GMTrace.o(18449703108608L, 137461);
          return;
        }
        d.this.bI(true);
        b.aef().aeg().stop();
        b.aef().adG().jLh = -4;
        d.this.a(b.aef().adG());
        GMTrace.o(18449703108608L, 137461);
      }
    };
    this.jNV = new j.a()
    {
      public final void aep()
      {
        GMTrace.i(18450105761792L, 137464);
        d.this.a(b.aef().adG());
        GMTrace.o(18450105761792L, 137464);
      }
    };
    this.jOm = new e(new e.a()
    {
      public final void a(com.tencent.mm.plugin.backup.a.f paramAnonymousf, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(18449568890880L, 137460);
        if (paramAnonymousArrayOfByte != null) {
          d.this.bitmapData = paramAnonymousArrayOfByte;
        }
        d.this.a(paramAnonymousf);
        GMTrace.o(18449568890880L, 137460);
      }
    }, b.aef().adG());
    GMTrace.o(9540330323968L, 71081);
  }
  
  private static void aeo()
  {
    GMTrace.i(9541135630336L, 71087);
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = b.aef().jKZ;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "send cancel req.");
      com.tencent.mm.plugin.backup.f.b.r(locala.toByteArray(), 5);
      GMTrace.o(9541135630336L, 71087);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "buf to BackupCancelRequest err.", new Object[0]);
      GMTrace.o(9541135630336L, 71087);
    }
  }
  
  public static String aes()
  {
    GMTrace.i(18449300455424L, 137458);
    String str = com.tencent.mm.plugin.backup.f.b.aeU().afd();
    GMTrace.o(18449300455424L, 137458);
    return str;
  }
  
  private static LinkedList<com.tencent.mm.plugin.backup.a.g> b(LinkedList<String> paramLinkedList, LinkedList<Long> paramLinkedList1)
  {
    long l1 = 0L;
    GMTrace.i(9541672501248L, 71091);
    if ((paramLinkedList == null) || (paramLinkedList1 == null) || (paramLinkedList.isEmpty()) || (paramLinkedList.size() * 2 != paramLinkedList1.size()))
    {
      GMTrace.o(9541672501248L, 71091);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList1 = paramLinkedList1.iterator();
    int i = 0;
    long l3 = 0L;
    while (i < paramLinkedList.size())
    {
      long l2 = l1;
      if (paramLinkedList1.hasNext())
      {
        long l4 = ((Long)paramLinkedList1.next()).longValue();
        l3 = l4;
        l2 = l1;
        if (paramLinkedList1.hasNext())
        {
          l2 = ((Long)paramLinkedList1.next()).longValue();
          l3 = l4;
        }
      }
      localLinkedList.add(new com.tencent.mm.plugin.backup.a.g(i, (String)paramLinkedList.get(i), l3, l2));
      i += 1;
      l1 = l2;
    }
    GMTrace.o(9541672501248L, 71091);
    return localLinkedList;
  }
  
  public static void c(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    long l = 0L;
    GMTrace.i(18449032019968L, 137456);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "setBakupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt2) });
    if (paramInt1 == 0)
    {
      paramLong2 = 0L;
      paramLong1 = l;
    }
    for (;;)
    {
      b.aef();
      SharedPreferences.Editor localEditor = b.adL().edit();
      localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", paramInt1);
      localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", paramLong1);
      localEditor.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", paramLong2);
      localEditor.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", paramInt2);
      localEditor.commit();
      GMTrace.o(18449032019968L, 137456);
      return;
    }
  }
  
  public final void a(final com.tencent.mm.plugin.backup.a.f paramf)
  {
    GMTrace.i(14820724178944L, 110423);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "updateBackupMoveRecoverUI state:%d, transferSession:%d, totalSession:%d", new Object[] { Integer.valueOf(paramf.jLh), Integer.valueOf(paramf.jLi), Integer.valueOf(paramf.jLj) });
    b.aef().adG().b(paramf);
    if (this.jMC != null) {
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18447555624960L, 137445);
          if (d.this.jMC != null) {
            d.this.jMC.a(paramf);
          }
          GMTrace.o(18447555624960L, 137445);
        }
      });
    }
    GMTrace.o(14820724178944L, 110423);
  }
  
  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    GMTrace.i(9540732977152L, 71084);
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak onNotify isLocal:%b type:%d seq:%d buf:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((paramBoolean) && (paramArrayOfByte != null) && (10011 == paramInt1))
      {
        i = b.aef().adG().jLh;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak local disconnect, backupMoveState:%d", new Object[] { Integer.valueOf(i) });
        switch (i)
        {
        }
      }
    }
    Object localObject;
    for (;;)
    {
      if (paramInt1 == 1)
      {
        localObject = (v)h.a(new v(), paramArrayOfByte);
        if (localObject == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "authReq parseBuf failed:%d", new Object[] { Integer.valueOf(bg.bq(paramArrayOfByte)) });
          b.aef().adG().jLh = -5;
          a(b.aef().adG());
          GMTrace.o(9540732977152L, 71084);
          return;
          i = paramArrayOfByte.length;
          break;
          b.aef().aeg().stop();
          b.aef().adG().jLh = -100;
          a(b.aef().adG());
          continue;
          b.aef().aeg().stop();
          continue;
          bI(true);
          b.aef().aeg().stop();
          b.aef().adG().jLh = -4;
          a(b.aef().adG());
          com.tencent.mm.plugin.report.service.g.paX.a(485L, 24L, 1L, false);
          if ((this.jOc == null) || (this.jOc.jLK == 0L)) {
            continue;
          }
          long l = bg.aF(this.jOc.jLK);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak backup transfer disconnect, backupDataSize:%d, backupCostTime:%d", new Object[] { Long.valueOf(this.jOc.jLJ), Long.valueOf(l) });
          continue;
          bI(true);
          continue;
        }
        if (bg.mZ(b.aef().jKZ)) {
          b.aef().jKZ = ((v)localObject).ID;
        }
        if (!((v)localObject).ID.equals(b.aef().jKZ))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "id not equel:self:%s, authReq.id:%s", new Object[] { b.aef().jKZ, ((v)localObject).ID });
          bI(false);
          b.aef().adG().jLh = -5;
          a(b.aef().adG());
          GMTrace.o(9540732977152L, 71084);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "authReq info, id:%s, step:%d", new Object[] { ((v)localObject).ID, Integer.valueOf(((v)localObject).jXN) });
        if (((v)localObject).jXN == 0)
        {
          paramArrayOfByte = ((v)localObject).jWD.toK;
          if (!b.aef().jLa.equals(new String(k.a(paramArrayOfByte, com.tencent.mm.plugin.backup.a.e.adK()))))
          {
            paramArrayOfByte = new com.tencent.mm.plugin.backup.h.w();
            paramArrayOfByte.jXN = 0;
            paramArrayOfByte.ID = b.aef().jKZ;
            paramArrayOfByte.jXo = 1;
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "get authReq step 0, but hello failed");
          }
          try
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak send authFailResp.");
            com.tencent.mm.plugin.backup.f.b.d(paramArrayOfByte.toByteArray(), 2, paramInt2);
            b.aef().adG().jLh = -5;
            a(b.aef().adG());
            if (((v)localObject).jXO < com.tencent.mm.plugin.backup.a.c.jKM)
            {
              this.jOi = true;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak old move, version:%d", new Object[] { Integer.valueOf(((v)localObject).jXO) });
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak start move, isOldVersion:%b", new Object[] { Boolean.valueOf(this.jOi) });
              this.jOk = paramInt2;
              if ((!jOh) && (!jMG)) {
                break label966;
              }
              if ((!jOh) || (!jMG) || ((((v)localObject).jXQ & com.tencent.mm.plugin.backup.a.c.jKR) != 0) || ((((v)localObject).jXQ & com.tencent.mm.plugin.backup.a.c.jKS) != 0)) {
                break label858;
              }
              b.aef().adG().jLh = -31;
              a(b.aef().adG());
              this.jOl = 1;
              GMTrace.o(9540732977152L, 71084);
            }
          }
          catch (Exception paramArrayOfByte)
          {
            for (;;)
            {
              com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
              continue;
              this.jOi = false;
            }
            label858:
            if ((jOh) && ((((v)localObject).jXQ & com.tencent.mm.plugin.backup.a.c.jKR) == 0))
            {
              b.aef().adG().jLh = -32;
              a(b.aef().adG());
              this.jOl = 2;
              GMTrace.o(9540732977152L, 71084);
              return;
            }
            if ((jMG) && ((((v)localObject).jXQ & com.tencent.mm.plugin.backup.a.c.jKS) == 0))
            {
              b.aef().adG().jLh = -33;
              a(b.aef().adG());
              this.jOl = 3;
              GMTrace.o(9540732977152L, 71084);
              return;
            }
            label966:
            db(false);
            GMTrace.o(9540732977152L, 71084);
            return;
          }
        }
        if (((v)localObject).jXN == 1)
        {
          paramArrayOfByte = ((v)localObject).jWD.toK;
          if (!b.aef().jLb.equals(new String(k.a(paramArrayOfByte, com.tencent.mm.plugin.backup.a.e.adK()))))
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok failed");
            b.aef().adG().jLh = -5;
            a(b.aef().adG());
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok success");
          if (this.jOi)
          {
            com.tencent.mm.plugin.report.service.g.paX.a(485L, 101L, 1L, false);
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afu();
            paramArrayOfByte = new Intent(ab.getContext(), BakMoveOldUI.class);
            paramArrayOfByte.addFlags(335544320);
            ab.getContext().startActivity(paramArrayOfByte);
            GMTrace.o(9540732977152L, 71084);
            return;
          }
          b.aef().adG().jLh = 2;
          a(b.aef().adG());
        }
        GMTrace.o(9540732977152L, 71084);
        return;
      }
    }
    if (paramInt1 == 3)
    {
      this.jOj = paramInt2;
      if (b.aef().aej().jNe)
      {
        aer();
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      this.jOf = true;
      GMTrace.o(9540732977152L, 71084);
      return;
    }
    if (paramInt1 == 9)
    {
      localObject = (com.tencent.mm.plugin.backup.h.e)h.a(new com.tencent.mm.plugin.backup.h.e(), paramArrayOfByte);
      if (localObject == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "heartBeatRequest parseBuf failed:%d", new Object[] { Integer.valueOf(bg.bq(paramArrayOfByte)) });
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak receive heartbeatReq,req:%s ack:%d", new Object[] { localObject, Long.valueOf(((com.tencent.mm.plugin.backup.h.e)localObject).jRD) });
      paramArrayOfByte = (com.tencent.mm.plugin.backup.h.f)h.a(new com.tencent.mm.plugin.backup.h.f(), paramArrayOfByte);
      paramArrayOfByte.jRD = ((com.tencent.mm.plugin.backup.h.e)localObject).jRD;
      try
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak send heartbeatResp");
        com.tencent.mm.plugin.backup.f.b.d(paramArrayOfByte.toByteArray(), 10, paramInt2);
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "summerbak buf to BackupHeartBeatResponse err.", new Object[0]);
        GMTrace.o(9540732977152L, 71084);
        return;
      }
    }
    if (paramInt1 == 10)
    {
      localObject = new com.tencent.mm.plugin.backup.h.f();
      try
      {
        ((com.tencent.mm.plugin.backup.h.f)localObject).aC(paramArrayOfByte);
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", paramArrayOfByte, "summerbak heartbeatResp parse from buf error.", new Object[0]);
        GMTrace.o(9540732977152L, 71084);
        return;
      }
    }
    if (paramInt1 == 5)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak receive command cancel");
      bI(true);
      b.aef().adG().jLh = -100;
      a(b.aef().adG());
      GMTrace.o(9540732977152L, 71084);
      return;
    }
    if (paramInt1 == 12)
    {
      localObject = (com.tencent.mm.plugin.backup.h.j)h.a(new com.tencent.mm.plugin.backup.h.j(), paramArrayOfByte);
      if (localObject == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "requestSessionResp parseBuf failed:%d", new Object[] { Integer.valueOf(bg.bq(paramArrayOfByte)) });
        b.aef().adG().jLh = -5;
        a(b.aef().adG());
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      paramArrayOfByte = b(((com.tencent.mm.plugin.backup.h.j)localObject).jWS, ((com.tencent.mm.plugin.backup.h.j)localObject).jWT);
      if (paramArrayOfByte == null) {}
      for (paramInt1 = -1;; paramInt1 = paramArrayOfByte.size())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak backup receive requestsession response. backupSessionList:%d ", new Object[] { Integer.valueOf(paramInt1) });
        if (paramArrayOfByte != null) {
          break;
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "requestSessionResp sessionName or timeInterval null or requestSessionResp number error.");
        aeo();
        b.aef().adG().jLh = -21;
        a(b.aef().adG());
        GMTrace.o(9540732977152L, 71084);
        return;
      }
      com.tencent.mm.plugin.backup.f.b.a(this.jNU);
      com.tencent.mm.plugin.backup.f.b.aeT().start();
      this.jOc = new com.tencent.mm.plugin.backup.b.c(b.aef(), 2, this);
      this.jOc.jLG = false;
      this.jOc.cZ(false);
      this.jOc.a(paramArrayOfByte, 0, b.aef().adG().jLk, jMG);
    }
    GMTrace.o(9540732977152L, 71084);
  }
  
  public final void adC()
  {
    GMTrace.i(9541538283520L, 71090);
    bI(false);
    GMTrace.o(9541538283520L, 71090);
  }
  
  public final void aer()
  {
    GMTrace.i(9540867194880L, 71085);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak receive start request.");
    this.jOf = false;
    if (this.jOi)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak start old move");
      com.tencent.mm.plugin.backup.a.e.km(-21);
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afu().bI(true);
      com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afu());
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afu().a(h.t(b.aef().aej().aeb()), new PLong(b.aef().aej().aee()), new PInt());
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afu().kw(this.jOj);
      GMTrace.o(9540867194880L, 71085);
      return;
    }
    b.aef().adG().jLh = 12;
    a(b.aef().adG());
    com.tencent.mm.plugin.backup.g.a.afe().afh();
    if (this.jOa == null)
    {
      GMTrace.o(9540867194880L, 71085);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "transfer conversation size:%d", new Object[] { Integer.valueOf(this.jOa.size()) });
    Object localObject1 = new o();
    ((o)localObject1).ID = b.aef().jKZ;
    ((o)localObject1).jXm = this.jOa.size();
    ((o)localObject1).jXn = b.aef().aej().aee();
    ((o)localObject1).jXo = 0;
    int i;
    if (this.jNE) {
      i = com.tencent.mm.plugin.backup.a.c.jKK;
    }
    for (;;)
    {
      ((o)localObject1).jXp = i;
      if (jMG) {
        ((o)localObject1).jXl = 3;
      }
      Object localObject2 = new m();
      ((m)localObject2).jWZ = p.tf();
      ((m)localObject2).jXa = Build.MANUFACTURER;
      ((m)localObject2).jXb = Build.MODEL;
      ((m)localObject2).jXc = "Android";
      ((m)localObject2).jXd = Build.VERSION.RELEASE;
      ((m)localObject2).jXe = com.tencent.mm.protocal.d.toX;
      ((m)localObject2).jXf = 0L;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak generalinfo wechatversion:%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.toX) });
      ((o)localObject1).jXj = ((m)localObject2);
      try
      {
        com.tencent.mm.plugin.backup.f.b.d(((o)localObject1).toByteArray(), 4, this.jOj);
        long l1 = this.jOd;
        long l2 = this.jOe;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "backupSendRequestSession sessionName[%d], startTime[%d], endTime[%d]", new Object[] { Integer.valueOf(this.jOa.size()), Long.valueOf(l1), Long.valueOf(l2) });
        localObject1 = new com.tencent.mm.plugin.backup.h.i();
        ((com.tencent.mm.plugin.backup.h.i)localObject1).jWS = this.jOa;
        ((com.tencent.mm.plugin.backup.h.i)localObject1).jWT = new LinkedList();
        localObject2 = this.jOa.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ((Iterator)localObject2).next();
          ((com.tencent.mm.plugin.backup.h.i)localObject1).jWT.add(Long.valueOf(l1));
          ((com.tencent.mm.plugin.backup.h.i)localObject1).jWT.add(Long.valueOf(l2));
          continue;
          i = com.tencent.mm.plugin.backup.a.c.jKJ;
        }
      }
      catch (IOException localIOException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "prase startResp error!!");
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", localIOException, "", new Object[0]);
        GMTrace.o(9540867194880L, 71085);
        return;
      }
    }
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak send request session, chooseConvNames size:%d", new Object[] { Integer.valueOf(this.jOa.size()) });
      com.tencent.mm.plugin.backup.f.b.r(localIOException.toByteArray(), 11);
      GMTrace.o(9540867194880L, 71085);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "summerbak BackupRequestSession parse req failed.", new Object[0]);
      GMTrace.o(9540867194880L, 71085);
    }
  }
  
  public final void bI(boolean paramBoolean)
  {
    GMTrace.i(9540598759424L, 71083);
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveServer", "summerbak BackupMoveServer CANCEL, Caller:%s", new Object[] { ah.bNq() });
    if (!paramBoolean) {
      aeo();
    }
    if (this.jOc != null) {
      this.jOc.jLG = true;
    }
    if (this.jOb != null)
    {
      this.jOb.cancel();
      this.jOb = null;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "cancel , notifyall.");
    if (com.tencent.mm.plugin.backup.f.b.aeT() != null) {
      com.tencent.mm.plugin.backup.f.b.aeT().stop();
    }
    if (com.tencent.mm.plugin.backup.f.b.aeU() != null) {
      com.tencent.mm.plugin.backup.f.b.aeU().stop();
    }
    Boolean localBoolean = com.tencent.mm.plugin.backup.g.a.afe().aff().jSx;
    if (localBoolean == null) {}
    for (Object localObject = "null";; localObject = localBoolean)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "cancel, isTempDb[%s]", new Object[] { localObject });
      if (localBoolean != null) {
        com.tencent.mm.plugin.backup.g.a.afe().o(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(9544356855808L, 71111);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "backupChatRunnable backupcloseTempDB end");
            com.tencent.mm.sdk.platformtools.w.bMS();
            GMTrace.o(9544356855808L, 71111);
          }
        });
      }
      GMTrace.o(9540598759424L, 71083);
      return;
    }
  }
  
  public final void db(boolean paramBoolean)
  {
    GMTrace.i(18449166237696L, 137457);
    if (paramBoolean) {
      switch (this.jOl)
      {
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.backup.h.w localw = new com.tencent.mm.plugin.backup.h.w();
      localw.jXN = 0;
      localw.ID = b.aef().jKZ;
      localw.jXO = com.tencent.mm.plugin.backup.a.c.jKM;
      localw.jXo = 0;
      localw.jXP = this.jOg;
      localw.jWD = new com.tencent.mm.bl.b(k.b(b.aef().jLb.getBytes(), com.tencent.mm.plugin.backup.a.e.adK()));
      if (bg.getInt(com.tencent.mm.k.g.uz().getValue("ChattingRecordsKvstatDisable"), 0) == 0) {
        localw.jXQ |= com.tencent.mm.plugin.backup.a.c.jKQ;
      }
      localw.jXQ |= com.tencent.mm.plugin.backup.a.c.jKR;
      localw.jXQ |= com.tencent.mm.plugin.backup.a.c.jKS;
      try
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveServer", "summerbak send authSuccessResp.");
        com.tencent.mm.plugin.backup.f.b.d(localw.toByteArray(), 2, this.jOk);
        GMTrace.o(18449166237696L, 137457);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveServer", localException, "buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
        GMTrace.o(18449166237696L, 137457);
      }
      jOh = false;
      jMG = false;
      this.jOd = 0L;
      this.jOe = 0L;
      continue;
      jOh = false;
      this.jOd = 0L;
      this.jOe = 0L;
      continue;
      jMG = false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */