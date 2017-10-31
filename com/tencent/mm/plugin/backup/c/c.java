package com.tencent.mm.plugin.backup.c;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.backup.a.b.a;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.b.a.a;
import com.tencent.mm.plugin.backup.f.b.b;
import com.tencent.mm.plugin.backup.f.b.c;
import com.tencent.mm.plugin.backup.f.i.a;
import com.tencent.mm.plugin.backup.f.j.a;
import com.tencent.mm.plugin.backup.h.aa;
import com.tencent.mm.plugin.backup.h.ag;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.plugin.backup.h.y;
import com.tencent.mm.plugin.backup.h.z;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.nh;
import com.tencent.mm.protocal.c.ye;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class c
  implements b.d, b.c
{
  public static int hkI;
  public static boolean jNN;
  public long fCd;
  String flE;
  public boolean hng;
  public b.d jMC;
  public boolean jMG;
  int jNA;
  boolean jNB;
  HashSet<String> jNC;
  public int jND;
  public boolean jNE;
  public boolean jNF;
  public boolean jNG;
  public boolean jNH;
  boolean jNI;
  public String jNJ;
  String jNK;
  int jNL;
  public aj jNM;
  public final com.tencent.mm.ac.e jNO;
  public final com.tencent.mm.ac.e jNP;
  public final com.tencent.mm.ac.e jNQ;
  public long jNR;
  int jNS;
  b.b jNT;
  public final i.a jNU;
  public final j.a jNV;
  private com.tencent.mm.plugin.backup.b.e jNn;
  LinkedList<String> jNo;
  LinkedList<Long> jNp;
  private LinkedList<String> jNq;
  private LinkedList<Long> jNr;
  public b.a jNs;
  HashSet<String> jNt;
  public long jNu;
  public long jNv;
  int jNw;
  long jNx;
  int jNy;
  long jNz;
  private Object lock;
  long recvSize;
  
  static
  {
    GMTrace.i(9552946790400L, 71175);
    jNN = false;
    hkI = 0;
    GMTrace.o(9552946790400L, 71175);
  }
  
  public c()
  {
    GMTrace.i(9546504339456L, 71127);
    this.fCd = 0L;
    this.recvSize = 0L;
    this.lock = new Object();
    this.hng = false;
    this.jNt = new HashSet();
    this.jNu = 0L;
    this.jNv = 0L;
    this.jNw = 0;
    this.jNx = 0L;
    this.jNy = 0;
    this.jNz = 0L;
    this.jNA = 0;
    this.jNB = true;
    this.jNC = new HashSet();
    this.jND = 0;
    this.jNE = false;
    this.jNF = true;
    this.jNG = true;
    this.jMG = false;
    this.jNH = false;
    this.jNI = false;
    this.jNO = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(18805111652352L, 140109);
        ap.wT().b(595, c.this.jNO);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak getConnect info other error [%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 == 4) && (paramAnonymousInt2 == 63525)) {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak getConnect info: INVALID URL");
          }
          b.aef().adG().jLh = -5;
          c.this.a(b.aef().adG());
          GMTrace.o(18805111652352L, 140109);
          return;
        }
        paramAnonymousk = ((com.tencent.mm.plugin.backup.f.e)paramAnonymousk).afa();
        ap.AS();
        if (!bg.mY((String)com.tencent.mm.x.c.xi().get(2, null)).equals(paramAnonymousk.tyf))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak getConnectinfo not the same account");
          b.aef().adG().jLh = -5;
          c.this.a(b.aef().adG());
          GMTrace.o(18805111652352L, 140109);
          return;
        }
        b.aef().jKZ = paramAnonymousk.ID;
        b.aef().jLa = paramAnonymousk.tym;
        b.aef().jLb = paramAnonymousk.tyn;
        com.tencent.mm.plugin.backup.f.b.a(c.this.jNT);
        b.aef().adH();
        com.tencent.mm.plugin.backup.f.b.a(b.aef().aei());
        com.tencent.mm.plugin.backup.f.b.a(b.aef().aeg());
        com.tencent.mm.plugin.backup.f.b.km(2);
        com.tencent.mm.plugin.backup.f.b.a(c.this.jNV);
        com.tencent.mm.plugin.backup.f.b.a(c.this.jNU);
        paramAnonymousInt1 = 0;
        Object localObject;
        if (paramAnonymousk.tyc > 0)
        {
          localObject = (nh)paramAnonymousk.tyd.getFirst();
          paramAnonymousString = ((nh)localObject).tJG;
          paramAnonymousInt1 = ((Integer)((nh)localObject).tJH.getFirst()).intValue();
        }
        for (;;)
        {
          localObject = c.this;
          ((c)localObject).jNJ = paramAnonymousk.tyg;
          ((c)localObject).jNK = paramAnonymousString;
          ((c)localObject).jNL = paramAnonymousInt1;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak getconnetinfo, type:%d, scene:%d, wifiName:%s, ip:%s, port:%d", new Object[] { Integer.valueOf(paramAnonymousk.jXP), Integer.valueOf(paramAnonymousk.ttY), paramAnonymousk.tyg, paramAnonymousString, Integer.valueOf(paramAnonymousInt1) });
          com.tencent.mm.plugin.backup.a.e.km(22);
          b.aef().adG().jLh = 1;
          localObject = new Intent().setClassName(ab.getContext(), "com.tencent.mm.ui.LauncherUI");
          ((Intent)localObject).addFlags(335544320);
          ((Intent)localObject).putExtra("nofification_type", "backup_move_notification");
          ab.getContext().startActivity((Intent)localObject);
          com.tencent.mm.plugin.report.service.g.paX.a(485L, 41L, 1L, false);
          c.jNN = false;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak try connct old phone, oldphone ip:%s, oldphone wifi:%s, newphone wifi:%s", new Object[] { paramAnonymousString, paramAnonymousk.tyg, h.bY(ab.getContext()) });
          c.hkI = 2;
          c.this.aC(paramAnonymousString, paramAnonymousInt1);
          GMTrace.o(18805111652352L, 140109);
          return;
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak address convMsgCount is empty");
          paramAnonymousString = null;
        }
      }
    };
    this.jNP = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(18805648523264L, 140113);
        c.jNN = true;
        com.tencent.mm.plugin.report.service.g.paX.a(485L, 42L, 1L, false);
        com.tencent.mm.plugin.backup.f.b.b(1, c.this.jNP);
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak auth failed");
          b.aef().adG().jLh = -5;
          c.this.a(b.aef().adG());
          GMTrace.o(18805648523264L, 140113);
          return;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak auth success");
        paramAnonymousk = (com.tencent.mm.plugin.backup.f.a)paramAnonymousk;
        if (paramAnonymousk.jQV.jXO < com.tencent.mm.plugin.backup.a.c.jKM)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak start old move, version:%d", new Object[] { Integer.valueOf(paramAnonymousk.jQV.jXO) });
          com.tencent.mm.plugin.report.service.g.paX.a(485L, 102L, 1L, false);
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().jKZ = b.aef().jKZ;
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().jLa = b.aef().jLa;
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().jLb = b.aef().jLb;
          com.tencent.mm.plugin.backup.a.e.km(-22);
          com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw());
          b.aef().adG().jLh = 3;
          c.this.a(b.aef().adG());
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw().a(false, c.this.jNJ, c.this.jNK, c.this.jNL);
          paramAnonymousString = com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().afw();
          paramAnonymousString.jNF = paramAnonymousk.aeS();
          paramAnonymousString.jTT = true;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MoveRecoverServer", "auth ok and request bakStart");
          com.tencent.mm.plugin.backup.f.b.a(3, paramAnonymousString);
          com.tencent.mm.plugin.backup.g.a.afe().afh();
          paramAnonymousk = new PLong();
          PLong localPLong1 = new PLong();
          PLong localPLong2 = new PLong();
          ap.AS();
          paramAnonymousInt1 = com.tencent.mm.a.e.aY(com.tencent.mm.x.c.xf());
          ap.AS();
          paramAnonymousk.value = (paramAnonymousInt1 + com.tencent.mm.a.e.aY(com.tencent.mm.x.c.xg()));
          long l = paramAnonymousk.value;
          ap.AS();
          com.tencent.mm.plugin.backup.bakoldlogic.a.d.a(l, localPLong1, localPLong2, com.tencent.mm.x.c.zp());
          paramAnonymousString.jUe = (localPLong2.value - paramAnonymousk.value);
          paramAnonymousString.jUf = localPLong1.value;
          new com.tencent.mm.plugin.backup.bakoldlogic.b.b(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.aft().jKZ).aeV();
          GMTrace.o(18805648523264L, 140113);
          return;
        }
        paramAnonymousInt1 = paramAnonymousk.jQV.jXP;
        c.this.jNF = paramAnonymousk.aeS();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak start new move, version:%d, type:%d, isServerSupportKv:%b", new Object[] { Integer.valueOf(paramAnonymousk.jQV.jXO), Integer.valueOf(paramAnonymousInt1), Boolean.valueOf(c.this.jNF) });
        if (paramAnonymousInt1 == com.tencent.mm.plugin.backup.a.c.jKN)
        {
          c.this.ael();
          c.this.jNH = false;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak is Normal move.");
        }
        for (;;)
        {
          paramAnonymousString = c.this;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "move recover init");
          paramAnonymousString.fCd = 0L;
          paramAnonymousString.recvSize = 0L;
          paramAnonymousString.hng = false;
          paramAnonymousString.jNt.clear();
          paramAnonymousString.jNB = true;
          paramAnonymousString.jNx = 0L;
          paramAnonymousString.jNC.clear();
          com.tencent.mm.plugin.backup.f.b.a(3, c.this.jNQ);
          new com.tencent.mm.plugin.backup.f.g(b.aef().jKZ).aeV();
          b.aef().adG().jLh = 22;
          c.this.a(b.aef().adG());
          GMTrace.o(18805648523264L, 140113);
          return;
          if (paramAnonymousInt1 == com.tencent.mm.plugin.backup.a.c.jKO)
          {
            c.this.jNH = true;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak is Resume Move!!!.");
          }
        }
      }
    };
    this.jNQ = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(14820992614400L, 110425);
        com.tencent.mm.plugin.backup.f.b.b(3, c.this.jNQ);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "backupmove receive startrequest response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "start request failed, errMsg:" + paramAnonymousString);
          b.aef().adG().jLh = -5;
          c.this.a(b.aef().adG());
          GMTrace.o(14820992614400L, 110425);
          return;
        }
        paramAnonymousString = (com.tencent.mm.plugin.backup.f.g)paramAnonymousk;
        paramAnonymousk = paramAnonymousString.jRy;
        if (!b.aef().jKZ.equals(paramAnonymousk.ID))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "start response not the same id");
          b.aef().adG().jLh = -5;
          c.this.a(b.aef().adG());
          GMTrace.o(14820992614400L, 110425);
          return;
        }
        b.aef().adG().jLk = paramAnonymousk.jXg;
        c.this.flE = paramAnonymousString.jRy.jXj.jWZ;
        c.this.fCd = paramAnonymousString.jRy.jXn;
        c.this.jNv = paramAnonymousString.jRy.jXm;
        c.this.jND = paramAnonymousString.jRy.jXp;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "move recover total:%d, convDataSize:%d, and wait old mobile's pushData", new Object[] { Long.valueOf(paramAnonymousString.jRy.jXm), Long.valueOf(paramAnonymousString.jRy.jXn) });
        label363:
        label382:
        long l;
        if ((c.this.jNG) && (c.this.jNF))
        {
          paramAnonymousk = com.tencent.mm.plugin.report.service.g.paX;
          if ((c.this.jNE) || (c.this.jND == 1))
          {
            paramAnonymousInt1 = 66;
            paramAnonymousk.a(485L, paramAnonymousInt1, 1L, false);
          }
        }
        else
        {
          if (paramAnonymousString.jRy.jXl != 3) {
            break label580;
          }
          paramAnonymousInt1 = 1;
          if (paramAnonymousInt1 == 0) {
            break label585;
          }
          c.this.jMG = true;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "isQuickBackup!!!");
          paramAnonymousString = new PLong();
          paramAnonymousk = new PLong();
          ap.AS();
          h.a(0L, paramAnonymousString, paramAnonymousk, com.tencent.mm.x.c.zp());
          l = c.this.fCd;
          if (c.this.fCd * 0.1D <= 5.24288E8D) {
            break label596;
          }
        }
        label580:
        label585:
        label596:
        for (double d = 5.24288E8D;; d = c.this.fCd * 0.1D)
        {
          l = d + l;
          c.this.jNR = l;
          if (paramAnonymousk.value >= l) {
            break label613;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d, dataSize:%d", new Object[] { Long.valueOf(paramAnonymousk.value), Long.valueOf(l), Long.valueOf(c.this.fCd) });
          b.aef().aeg().stop();
          b.aef().adG().jLh = -13;
          c.this.a(b.aef().adG());
          com.tencent.mm.plugin.report.service.g.paX.a(485L, 5L, 1L, false);
          GMTrace.o(14820992614400L, 110425);
          return;
          paramAnonymousInt1 = 65;
          break;
          paramAnonymousInt1 = 0;
          break label363;
          c.this.jMG = false;
          break label382;
        }
        label613:
        c.this.jNu = bg.Pp();
        GMTrace.o(14820992614400L, 110425);
      }
    };
    this.jNT = new b.b()
    {
      public final void aeq()
      {
        GMTrace.i(18806319611904L, 140118);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "stopCallback ");
        if (com.tencent.mm.plugin.backup.f.b.aeT() != null) {
          com.tencent.mm.plugin.backup.f.b.aeT().stop();
        }
        b.aef().adI();
        GMTrace.o(18806319611904L, 140118);
      }
    };
    this.jNU = new i.a()
    {
      public final void xD()
      {
        GMTrace.i(18806453829632L, 140119);
        if (b.aef().adG().jLh <= 0)
        {
          GMTrace.o(18806453829632L, 140119);
          return;
        }
        c.this.a(true, false, -4);
        b.aef().aeg().stop();
        GMTrace.o(18806453829632L, 140119);
      }
    };
    this.jNV = new j.a()
    {
      public final void aep()
      {
        GMTrace.i(18805245870080L, 140110);
        c.this.a(b.aef().adG());
        GMTrace.o(18805245870080L, 140110);
      }
    };
    GMTrace.o(9546504339456L, 71127);
  }
  
  public static void R(byte[] paramArrayOfByte)
  {
    GMTrace.i(16049621696512L, 119579);
    com.tencent.mm.plugin.backup.h.af localaf = (com.tencent.mm.plugin.backup.h.af)h.a(new com.tencent.mm.plugin.backup.h.af(), paramArrayOfByte);
    if (localaf == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "requestBigFileSvrIdNotify PacketSvrIDRequest parse failed :%d", new Object[] { Integer.valueOf(bg.bq(paramArrayOfByte)) });
      GMTrace.o(16049621696512L, 119579);
      return;
    }
    paramArrayOfByte = new ag();
    paramArrayOfByte.jYk = localaf.jYk;
    paramArrayOfByte.jYm = localaf.jYm;
    paramArrayOfByte.jYl = localaf.jYl;
    paramArrayOfByte.jWO = localaf.jWO;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "send SvrID resp");
      com.tencent.mm.plugin.backup.f.b.r(paramArrayOfByte.toByteArray(), 14);
      GMTrace.o(16049621696512L, 119579);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramArrayOfByte, "buf to PacketSvrIDResponse err.", new Object[0]);
      GMTrace.o(16049621696512L, 119579);
    }
  }
  
  public static boolean aek()
  {
    GMTrace.i(9546772774912L, 71129);
    boolean bool = ap.AS().zA().bPs();
    GMTrace.o(9546772774912L, 71129);
    return bool;
  }
  
  public static String aen()
  {
    GMTrace.i(9548114952192L, 71139);
    String str = com.tencent.mm.plugin.backup.f.b.aeU().afd();
    GMTrace.o(9548114952192L, 71139);
    return str;
  }
  
  static void aeo()
  {
    GMTrace.i(9548249169920L, 71140);
    com.tencent.mm.plugin.backup.h.a locala = new com.tencent.mm.plugin.backup.h.a();
    locala.ID = b.aef().jKZ;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "send cancel req.");
      com.tencent.mm.plugin.backup.f.b.r(locala.toByteArray(), 5);
      GMTrace.o(9548249169920L, 71140);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "buf to BackupCancelRequest err.", new Object[0]);
      GMTrace.o(9548249169920L, 71140);
    }
  }
  
  static void b(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(9547846516736L, 71137);
    y localy = new y();
    localy.jXS = paramString;
    localy.jXT = paramInt1;
    localy.jXV = paramInt2;
    localy.jXW = paramInt3;
    localy.jXo = paramInt4;
    try
    {
      com.tencent.mm.plugin.backup.f.b.d(localy.toByteArray(), 7, paramInt5);
      GMTrace.o(9547846516736L, 71137);
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramString, "sendResp", new Object[0]);
      GMTrace.o(9547846516736L, 71137);
    }
  }
  
  public final void a(final com.tencent.mm.plugin.backup.a.f paramf)
  {
    GMTrace.i(14825421799424L, 110458);
    if (this.jMC != null) {
      com.tencent.mm.sdk.platformtools.af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18805916958720L, 140115);
          if (c.this.jMC != null) {
            c.this.jMC.a(paramf);
          }
          GMTrace.o(18805916958720L, 140115);
        }
      });
    }
    if (this.jNs != null) {
      com.tencent.mm.sdk.platformtools.af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14829448331264L, 110488);
          if (c.this.jNs != null) {
            c.this.jNs.adB();
          }
          GMTrace.o(14829448331264L, 110488);
        }
      });
    }
    GMTrace.o(14825421799424L, 110458);
  }
  
  public final void a(boolean paramBoolean, final int paramInt1, final byte[] paramArrayOfByte, final int paramInt2)
  {
    GMTrace.i(9547578081280L, 71135);
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "onNotify isLocal:%b, type:%d, seq:%d, buf.len:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if ((!paramBoolean) || (10011 != paramInt1)) {
        break label392;
      }
      paramInt1 = b.aef().adG().jLh;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak local disconnect, backupMoveState:%d", new Object[] { Integer.valueOf(paramInt1) });
      switch (paramInt1)
      {
      }
    }
    long l;
    for (;;)
    {
      GMTrace.o(9547578081280L, 71135);
      return;
      i = paramArrayOfByte.length;
      break;
      b.aef().aeg().stop();
      if (!jNN)
      {
        if (this.jNM != null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "stop backupConnectTimerHandler.");
          this.jNM.MM();
        }
        aem();
        GMTrace.o(9547578081280L, 71135);
        return;
      }
      b.aef().adG().jLh = -4;
      a(b.aef().adG());
      GMTrace.o(9547578081280L, 71135);
      return;
      b.aef().aeg().stop();
      GMTrace.o(9547578081280L, 71135);
      return;
      a(true, false, -4);
      b.aef().aeg().stop();
      com.tencent.mm.plugin.report.service.g.paX.a(485L, 43L, 1L, false);
      l = 0L;
      if (this.jNu != 0L) {
        l = bg.aF(this.jNu);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak recover transfer disconnect, recoverDataSize:%d, recoverCostTime:%d", new Object[] { Long.valueOf(this.fCd), Long.valueOf(l) });
      GMTrace.o(9547578081280L, 71135);
      return;
      a(true, false, 0);
    }
    label392:
    if (paramInt1 == 9)
    {
      com.tencent.mm.plugin.backup.h.e locale = (com.tencent.mm.plugin.backup.h.e)h.a(new com.tencent.mm.plugin.backup.h.e(), paramArrayOfByte);
      if (locale == null)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "heartBeatRequest parseBuf failed:%d", new Object[] { Integer.valueOf(bg.bq(paramArrayOfByte)) });
        GMTrace.o(9547578081280L, 71135);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive heartbeat req, req:%s ack:%d", new Object[] { locale, Long.valueOf(locale.jRD) });
      paramArrayOfByte = new com.tencent.mm.plugin.backup.h.f();
      paramArrayOfByte.jRD = locale.jRD;
      try
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak send heartbeat resp");
        com.tencent.mm.plugin.backup.f.b.d(paramArrayOfByte.toByteArray(), 10, paramInt2);
        GMTrace.o(9547578081280L, 71135);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramArrayOfByte, "summerbak buf to BackupHeartBeatResponse err.", new Object[0]);
        GMTrace.o(9547578081280L, 71135);
        return;
      }
    }
    if (paramInt1 == 10)
    {
      paramArrayOfByte = (com.tencent.mm.plugin.backup.h.f)h.a(new com.tencent.mm.plugin.backup.h.f(), paramArrayOfByte);
      if (paramArrayOfByte != null) {}
      for (l = paramArrayOfByte.jRD;; l = -1L)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive heartbeat response, resp:%s ack:%d", new Object[] { paramArrayOfByte, Long.valueOf(l) });
        GMTrace.o(9547578081280L, 71135);
        return;
      }
    }
    if (paramInt1 == 5) {
      a(true, false, -100);
    }
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18806722265088L, 140121);
        Object localObject1;
        Object localObject2;
        int i;
        Object localObject3;
        if (paramInt1 == 11)
        {
          localObject1 = c.this;
          localObject2 = paramArrayOfByte;
          i = paramInt2;
          if (b.aef().adG().jLh == -13)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "receive requestSession request, but no enough space for recover, quit.");
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          localObject3 = (com.tencent.mm.plugin.backup.h.i)h.a(new com.tencent.mm.plugin.backup.h.i(), (byte[])localObject2);
          if (localObject3 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "requestSessionListNotify parseBuf failed:%d", new Object[] { Integer.valueOf(bg.bq((byte[])localObject2)) });
            b.aef().adG().jLh = -21;
            ((c)localObject1).a(b.aef().adG());
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive requestSession request, SessionName size:%d, TimeInterval size:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.h.i)localObject3).jWS.size()), Integer.valueOf(((com.tencent.mm.plugin.backup.h.i)localObject3).jWT.size()) });
          ((c)localObject1).jNo = ((com.tencent.mm.plugin.backup.h.i)localObject3).jWS;
          ((c)localObject1).jNp = ((com.tencent.mm.plugin.backup.h.i)localObject3).jWT;
          if (((c)localObject1).jNp.size() != ((c)localObject1).jNo.size() * 2)
          {
            c.aeo();
            b.aef().adG().jLh = -21;
            ((c)localObject1).a(b.aef().adG());
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          ((c)localObject1).jNS = i;
          if (!((c)localObject1).jNH)
          {
            localObject3 = ap.AS().zy();
            localObject2 = ((c)localObject1).flE;
            String str = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + (String)localObject2 + "\"";
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BackupMoveTimeStorage", "getCountByDevice:" + str);
            localObject3 = ((com.tencent.mm.storage.j)localObject3).gMB.rawQuery(str, null);
            if (localObject3 == null)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveTimeStorage", "getCountByDevice failed, deviceid:%s", new Object[] { localObject2 });
              l1 = 0L;
            }
            while (l1 > 0L)
            {
              b.aef().adG().jLh = 52;
              ((c)localObject1).a(b.aef().adG());
              GMTrace.o(18806722265088L, 140121);
              return;
              l1 = ((Cursor)localObject3).getCount();
              ((Cursor)localObject3).close();
            }
            ((c)localObject1).da(true);
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          ((c)localObject1).da(((c)localObject1).jNI);
          GMTrace.o(18806722265088L, 140121);
          return;
        }
        long l2;
        if (paramInt1 == 6)
        {
          localObject1 = c.this;
          localObject3 = paramArrayOfByte;
          i = paramInt2;
          if (((c)localObject1).jNB)
          {
            ((c)localObject1).jNz = bg.Pp();
            ((c)localObject1).jNB = false;
          }
          ((c)localObject1).jNx += localObject3.length;
          localObject2 = (x)h.a(new x(), (byte[])localObject3);
          if (localObject2 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "dataPushNotify parseBuf failed:%d", new Object[] { Integer.valueOf(bg.bq((byte[])localObject3)) });
            c.b("", 0, 0, 0, 1, i);
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "dataPushNotify recoverData id:%s, type:%d, start:%d, end:%d", new Object[] { ((x)localObject2).jXS, Integer.valueOf(((x)localObject2).jXT), Integer.valueOf(((x)localObject2).jXV), Integer.valueOf(((x)localObject2).jXW) });
          l1 = bg.Pp();
          if ((((x)localObject2).jXT == 1) && (((x)localObject2).jWD != null))
          {
            localObject3 = h.adP() + "backupItem/" + h.sN(((x)localObject2).jXS);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "dataPushNotify text dataid:%s, dir:%s", new Object[] { ((x)localObject2).jXS, localObject3 });
            h.b((String)localObject3, (x)localObject2);
            ((c)localObject1).recvSize += ((x)localObject2).jWD.toK.length;
          }
          l2 = ((c)localObject1).jNw;
          ((c)localObject1).jNw = ((int)(bg.aF(l1) + l2));
          l1 = bg.Pp();
          if (((x)localObject2).jXT == 2)
          {
            localObject3 = h.adP() + "backupMeida/" + h.sN(((x)localObject2).jXS);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "dataPushNotify datapush media dataid:%s, dir:%s", new Object[] { ((x)localObject2).jXS, localObject3 });
            h.a((String)localObject3, (x)localObject2);
            ((c)localObject1).recvSize += ((x)localObject2).jWD.toK.length;
            ((c)localObject1).jNC.add(((x)localObject2).jXS);
          }
          l2 = ((c)localObject1).jNy;
          ((c)localObject1).jNy = ((int)(bg.aF(l1) + l2));
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "dataPushNotify recvSize/convDataSize: %d, %d", new Object[] { Long.valueOf(((c)localObject1).recvSize), Long.valueOf(((c)localObject1).fCd) });
          if (((c)localObject1).fCd < ((c)localObject1).recvSize) {
            ((c)localObject1).fCd = ((c)localObject1).recvSize;
          }
          c.b(((x)localObject2).jXS, ((x)localObject2).jXT, ((x)localObject2).jXV, ((x)localObject2).jXW, 0, i);
          GMTrace.o(18806722265088L, 140121);
          return;
        }
        if (paramInt1 == 13)
        {
          c.R(paramArrayOfByte);
          GMTrace.o(18806722265088L, 140121);
          return;
        }
        if (paramInt1 == 15)
        {
          localObject2 = c.this;
          localObject3 = paramArrayOfByte;
          int j = paramInt2;
          localObject1 = (z)h.a(new z(), (byte[])localObject3);
          if (localObject1 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "SendTagNotify PacketBackupDataTag parse failed:%d", new Object[] { Integer.valueOf(bg.bq((byte[])localObject3)) });
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive tag, MsgDataID:%s, BakChatName:%s, StartTime:%d, EndTime:%d,  NickName:%s", new Object[] { ((z)localObject1).jYb, ((z)localObject1).jWO, Long.valueOf(((z)localObject1).jXZ), Long.valueOf(((z)localObject1).jYa), ((z)localObject1).jYc });
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.vai, Boolean.valueOf(true));
          if (ap.AS().zA().Sp(((z)localObject1).jYb) != null)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak the same tag has received, ignore. MsgDataID:%s", new Object[] { ((z)localObject1).jYb });
            ((c)localObject2).jNt.add(((z)localObject1).jWO);
            localObject3 = b.aef().adG();
            if (((c)localObject2).jNt.size() >= ((c)localObject2).jNo.size()) {
              break label1514;
            }
          }
          label1514:
          for (i = ((c)localObject2).jNt.size();; i = ((c)localObject2).jNo.size())
          {
            ((com.tencent.mm.plugin.backup.a.f)localObject3).y(23, i, ((c)localObject2).jNo.size());
            ((c)localObject2).a(b.aef().adG());
            localObject2 = new aa();
            ((aa)localObject2).jWO = ((z)localObject1).jWO;
            ((aa)localObject2).jXZ = ((z)localObject1).jXZ;
            ((aa)localObject2).jYa = ((z)localObject1).jYa;
            ((aa)localObject2).jYb = ((z)localObject1).jYb;
            try
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak send tag resp");
              com.tencent.mm.plugin.backup.f.b.d(((aa)localObject2).toByteArray(), 16, j);
              GMTrace.o(18806722265088L, 140121);
              return;
            }
            catch (Exception localException)
            {
              com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "summerbak buf to PacketBackupDataTagResponse err.", new Object[0]);
              GMTrace.o(18806722265088L, 140121);
              return;
            }
            localObject3 = new com.tencent.mm.storage.k();
            ((com.tencent.mm.storage.k)localObject3).field_msgListDataId = ((z)localObject1).jYb;
            ((com.tencent.mm.storage.k)localObject3).field_sessionName = ((z)localObject1).jWO;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak insert BackupRecoverMsgListDataIdStorage ret[%b], systemRowid[%d]", new Object[] { Boolean.valueOf(ap.AS().zA().b((com.tencent.mm.sdk.e.c)localObject3)), Long.valueOf(((com.tencent.mm.storage.k)localObject3).uQF) });
            localObject3 = new com.tencent.mm.storage.m();
            ((com.tencent.mm.storage.m)localObject3).field_sessionName = ((z)localObject1).jWO;
            ((com.tencent.mm.storage.m)localObject3).field_startTime = ((z)localObject1).jXZ;
            ((com.tencent.mm.storage.m)localObject3).field_endTime = ((z)localObject1).jYa;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak insert BackupTempMoveTimeStorage ret[%b], systemRowid[%d]", new Object[] { Boolean.valueOf(ap.AS().zz().b((com.tencent.mm.sdk.e.c)localObject3)), Long.valueOf(((com.tencent.mm.storage.m)localObject3).uQF) });
            break;
          }
        }
        c localc;
        if (paramInt1 == 8)
        {
          localc = c.this;
          localObject2 = paramArrayOfByte;
          localObject3 = (com.tencent.mm.plugin.backup.h.d)h.a(new com.tencent.mm.plugin.backup.h.d(), (byte[])localObject2);
          if (localObject3 == null)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "recoverFinishNotify BackupFinishRequest parse failed buf:%d", new Object[] { Integer.valueOf(bg.bq((byte[])localObject2)) });
            GMTrace.o(18806722265088L, 140121);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak receive finish request. NewBakMoveInfoKvstat, Client receive Server data, ServerSessionCount:%d, ServerMessageCount:%d, ServerFileCount:%d, CalculateSize:%d, ServerDataPushSize:%d, ServerReadDBTotalTime:%d, ServerReadFileTotalTime:%d, ServerCostTotalTime:%d, ServerVersion:%x", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWF), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWG), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWH), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWI), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWJ), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWK), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWL), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWM), Integer.valueOf(((com.tencent.mm.plugin.backup.h.d)localObject3).jWN) });
          localc.jNA = ((int)bg.aF(localc.jNz));
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.vai, Boolean.valueOf(false));
          b.aef().aeg().jLs = null;
          if (com.tencent.mm.plugin.backup.f.b.aeT() != null) {
            com.tencent.mm.plugin.backup.f.b.aeT().stop();
          }
          if (com.tencent.mm.plugin.backup.f.b.aeU() != null) {
            com.tencent.mm.plugin.backup.f.b.aeU().stop();
          }
          b.aef().adG().y(24, localc.jNt.size(), localc.jNo.size());
          localc.a(b.aef().adG());
          l2 = bg.aF(localc.jNu);
          if (l2 == 0L) {
            break label2064;
          }
        }
        label2049:
        label2064:
        for (long l1 = localc.fCd / l2;; l1 = 0L)
        {
          com.tencent.mm.plugin.report.service.g.paX.a(485L, 45L, 1L, false);
          localObject2 = com.tencent.mm.plugin.report.service.g.paX;
          if ((localc.jNE) || (localc.jND == 1))
          {
            i = 68;
            ((com.tencent.mm.plugin.report.service.g)localObject2).a(485L, i, 1L, false);
            com.tencent.mm.plugin.report.service.g.paX.a(485L, 61L, l2 / 1000L, false);
            com.tencent.mm.plugin.report.service.g.paX.a(485L, 62L, localc.fCd / 1024L, false);
            localObject2 = com.tencent.mm.plugin.report.service.g.paX;
            if ((!localc.jNE) && (localc.jND != 1)) {
              break label2049;
            }
          }
          for (i = 70;; i = 69)
          {
            ((com.tencent.mm.plugin.report.service.g)localObject2).a(485L, i, l1 / 1024L, false);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "recoverFinishNotify recover success. recoverCostTime[%d], recoverTotalSize[%d]", new Object[] { Long.valueOf(l2), Long.valueOf(localc.fCd) });
            GMTrace.o(18806722265088L, 140121);
            return;
            i = 67;
            break;
          }
          GMTrace.o(18806722265088L, 140121);
          return;
        }
      }
    });
    GMTrace.o(9547578081280L, 71135);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    int i = 0;
    GMTrace.i(18910875222016L, 140897);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak backupMoveRecoverServer cancel isSelf[%b], needClearContinueRecoverData[%b], caller:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), ah.bNq() });
    if (!paramBoolean1) {
      aeo();
    }
    synchronized (this.lock)
    {
      this.hng = true;
      if (this.jNn != null)
      {
        this.jNn.f(paramBoolean2, paramInt);
        this.jNn = null;
        if ((i != 0) && (paramInt != 0))
        {
          b.aef().adG().jLh = paramInt;
          a(b.aef().adG());
        }
        if (paramBoolean2) {
          ael();
        }
        if (com.tencent.mm.plugin.backup.f.b.aeT() != null) {
          com.tencent.mm.plugin.backup.f.b.aeT().stop();
        }
        if (com.tencent.mm.plugin.backup.f.b.aeU() != null) {
          com.tencent.mm.plugin.backup.f.b.aeU().stop();
        }
        b.aef().aeg().jLs = null;
        GMTrace.o(18910875222016L, 140897);
        return;
      }
      i = 1;
    }
  }
  
  public final void aC(String paramString, int paramInt)
  {
    GMTrace.i(9547309645824L, 71133);
    b.aef().aeg().connect(paramString, paramInt);
    com.tencent.mm.plugin.backup.f.b.a(1, this.jNP);
    for (;;)
    {
      try
      {
        if (bg.getInt(com.tencent.mm.k.g.uz().getValue("ChattingRecordsKvstatDisable"), 0) != 0) {
          continue;
        }
        bool = true;
        this.jNG = bool;
      }
      catch (Exception paramString)
      {
        boolean bool;
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", paramString, "getInt", new Object[0]);
        continue;
      }
      paramString = new com.tencent.mm.plugin.backup.f.a(b.aef().jLa, b.aef().jLb, com.tencent.mm.plugin.backup.a.e.adK(), b.aef().jKZ, com.tencent.mm.plugin.backup.a.c.jKM, 22);
      paramString.df(this.jNG);
      paramString.aeV();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak tryConnect start connect timehandler.");
      if (this.jNM == null) {
        this.jNM = new aj(new aj.a()
        {
          public final boolean pO()
          {
            GMTrace.i(18806856482816L, 140122);
            if (!c.jNN)
            {
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "summerbak try connect overtime failed.");
              if (c.this.jNM != null) {
                c.this.jNM.MM();
              }
              c.this.aem();
            }
            GMTrace.o(18806856482816L, 140122);
            return true;
          }
        }, false);
      }
      this.jNM.w(3000L, 3000L);
      GMTrace.o(9547309645824L, 71133);
      return;
      bool = false;
    }
  }
  
  public final void adE()
  {
    GMTrace.i(18449971544064L, 137463);
    com.tencent.mm.plugin.report.service.g.paX.a(485L, 49L, 1L, false);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.vak, Boolean.valueOf(true));
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "move recover finish, make BACKUP_MOVE_RECORDS.");
    Object localObject;
    LinkedList localLinkedList;
    if (!this.jMG)
    {
      localObject = ap.AS().zz();
      localLinkedList = new LinkedList();
      localObject = ((com.tencent.mm.storage.n)localObject).Mp();
      if (localObject != null) {
        break label141;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupTempMoveTimeStorage", "getAllData failed.");
      if (localLinkedList.size() > 0) {
        break label181;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "merge finish and BackupTempMoveTimeStorage is empty!");
    }
    for (;;)
    {
      ael();
      if (com.tencent.mm.plugin.backup.f.b.aeT() != null) {
        com.tencent.mm.plugin.backup.f.b.aeT().stop();
      }
      if (com.tencent.mm.plugin.backup.f.b.aeU() != null) {
        com.tencent.mm.plugin.backup.f.b.aeU().stop();
      }
      GMTrace.o(18449971544064L, 137463);
      return;
      label141:
      while (((Cursor)localObject).moveToNext())
      {
        com.tencent.mm.storage.m localm = new com.tencent.mm.storage.m();
        localm.b((Cursor)localObject);
        localLinkedList.add(localm);
      }
      ((Cursor)localObject).close();
      break;
      label181:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "merge finish and start update BackupMoveTimeStorage!");
      ap.AS().zy().d(this.flE, localLinkedList);
    }
  }
  
  public final void adU()
  {
    GMTrace.i(9547980734464L, 71138);
    synchronized (this.lock)
    {
      if (this.hng)
      {
        GMTrace.o(9547980734464L, 71138);
        return;
      }
      if (this.jNn != null) {
        this.jNn.f(false, 0);
      }
      if ((this.jNt == null) || (this.jNt.size() <= 0)) {
        this.jNt = ap.AS().zA().bPt();
      }
      b.aef().adG().y(26, 1, this.jNt.size());
      a(b.aef().adG());
      this.jNn = new com.tencent.mm.plugin.backup.b.e(b.aef(), 22, this, this.jNt.size(), false, new LinkedList(), new LinkedList());
      this.jNn.adU();
      com.tencent.mm.plugin.report.service.g.paX.a(485L, 46L, 1L, false);
      GMTrace.o(9547980734464L, 71138);
      return;
    }
  }
  
  public final void ael()
  {
    GMTrace.i(9547041210368L, 71131);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "recover clearContinueRecoverData");
    this.jNt.clear();
    GMTrace.o(9547041210368L, 71131);
  }
  
  public final void aem()
  {
    GMTrace.i(9547443863552L, 71134);
    String str1 = this.jNJ;
    String str2 = this.jNK;
    String str3 = h.bY(ab.getContext());
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "connect failed thisWifi:%s, oldPhoneWifiName:%s, oldPhoneIpAddress:%s, tryCount:%d", new Object[] { str3, str1, str2, Integer.valueOf(hkI) });
    if ((str3 == null) || (str3.equals("")))
    {
      com.tencent.mm.plugin.report.service.g.paX.a(485L, 1L, 1L, false);
      b.aef().adG().jLh = -1;
      a(b.aef().adG());
      GMTrace.o(9547443863552L, 71134);
      return;
    }
    if ((str1 == null) || (!str1.equals(str3)))
    {
      com.tencent.mm.plugin.report.service.g.paX.a(485L, 2L, 1L, false);
      b.aef().adG().jLh = -2;
      a(b.aef().adG());
      GMTrace.o(9547443863552L, 71134);
      return;
    }
    if (!h.sK(str2))
    {
      com.tencent.mm.plugin.report.service.g.paX.a(485L, 3L, 1L, false);
      b.aef().adG().jLh = -3;
      a(b.aef().adG());
      GMTrace.o(9547443863552L, 71134);
      return;
    }
    if (hkI <= 0)
    {
      b.aef().adG().jLh = -5;
      a(b.aef().adG());
      com.tencent.mm.plugin.report.service.g.paX.a(485L, 4L, 1L, false);
      GMTrace.o(9547443863552L, 71134);
      return;
    }
    hkI -= 1;
    aC(this.jNK, this.jNL);
    GMTrace.o(9547443863552L, 71134);
  }
  
  public final void cY(final boolean paramBoolean)
  {
    GMTrace.i(9548517605376L, 71142);
    if (this.jMC != null) {
      com.tencent.mm.sdk.platformtools.af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14830387855360L, 110495);
          if (c.this.jMC != null) {
            c.this.jMC.cY(paramBoolean);
          }
          GMTrace.o(14830387855360L, 110495);
        }
      });
    }
    GMTrace.o(9548517605376L, 71142);
  }
  
  public final void da(boolean paramBoolean)
  {
    GMTrace.i(9547712299008L, 71136);
    this.jNI = paramBoolean;
    final Object localObject = new LinkedBlockingQueue();
    b.aef().aeg().jLs = new a.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(18805514305536L, 140112);
        for (;;)
        {
          if (!c.this.hng) {}
          try
          {
            boolean bool = localObject.offer(new c.a(c.this, false, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousArrayOfByte), 500L, TimeUnit.MILLISECONDS);
            if (bool)
            {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak offer datapushQueue, datapushQueue size:%d", new Object[] { Integer.valueOf(localObject.size()) });
              GMTrace.o(18805514305536L, 140112);
              return;
            }
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BackupMoveRecoverServer", "onBackupMoveRecoverDatapushCallback e:%s", new Object[] { localException.getMessage() });
          }
        }
      }
    };
    com.tencent.mm.sdk.f.e.b(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18806990700544L, 140123);
        for (;;)
        {
          if (!c.this.hng) {
            try
            {
              c.a locala = (c.a)localObject.poll(500L, TimeUnit.MILLISECONDS);
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BackupMoveRecoverServer", "datapushQueue size:%d, startNext receiveData:%s", new Object[] { Integer.valueOf(localObject.size()), locala });
              if (locala != null) {
                c.this.a(locala.jdc, locala.type, locala.buf, locala.hNG);
              }
            }
            catch (Exception localException)
            {
              for (;;)
              {
                Object localObject = null;
              }
            }
          }
        }
        GMTrace.o(18806990700544L, 140123);
      }
    }, "onNotifyWorker").start();
    this.jNq = new LinkedList();
    this.jNr = new LinkedList();
    ap.AS().zz().a(this.jNo, this.jNp, this.jNq, this.jNr);
    if ((!this.jMG) && (!paramBoolean))
    {
      localObject = this.jNq;
      LinkedList localLinkedList = this.jNr;
      this.jNq = new LinkedList();
      this.jNr = new LinkedList();
      ap.AS().zy().a(this.flE, (LinkedList)localObject, localLinkedList, this.jNq, this.jNr);
    }
    localObject = new com.tencent.mm.plugin.backup.h.j();
    ((com.tencent.mm.plugin.backup.h.j)localObject).jWS = this.jNq;
    ((com.tencent.mm.plugin.backup.h.j)localObject).jWT = this.jNr;
    try
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BackupMoveRecoverServer", "summerbak send requestsession resp, SessionName size:%d, TimeInterval size:%d", new Object[] { Integer.valueOf(this.jNo.size()), Integer.valueOf(((com.tencent.mm.plugin.backup.h.j)localObject).jWT.size()) });
      com.tencent.mm.plugin.backup.f.b.d(((com.tencent.mm.plugin.backup.h.j)localObject).toByteArray(), 12, this.jNS);
      com.tencent.mm.plugin.backup.f.b.aeU().start();
      b.aef().adG().y(23, 1, this.jNo.size());
      a(b.aef().adG());
      GMTrace.o(9547712299008L, 71136);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.BackupMoveRecoverServer", localException, "buf to BackupRequestSessionResponse err.", new Object[0]);
      }
    }
  }
  
  private final class a
  {
    byte[] buf;
    int hNG;
    boolean jdc;
    int type;
    
    a(boolean paramBoolean, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
    {
      GMTrace.i(9541806718976L, 71092);
      this.jdc = false;
      this.hNG = paramInt1;
      this.type = paramInt2;
      this.buf = ((byte[])paramArrayOfByte.clone());
      GMTrace.o(9541806718976L, 71092);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */