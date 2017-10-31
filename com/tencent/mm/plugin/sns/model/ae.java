package com.tencent.mm.plugin.sns.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Looper;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.bi;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cg;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.gs;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.jf;
import com.tencent.mm.g.a.kj;
import com.tencent.mm.g.a.kj.a;
import com.tencent.mm.g.a.kq;
import com.tencent.mm.g.a.li;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.g.a.mu;
import com.tencent.mm.g.a.nc;
import com.tencent.mm.g.a.ou;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.g.a.pg;
import com.tencent.mm.g.a.pn;
import com.tencent.mm.g.a.qe;
import com.tencent.mm.g.a.qe.a;
import com.tencent.mm.g.a.qy;
import com.tencent.mm.g.a.rl;
import com.tencent.mm.memory.e.a;
import com.tencent.mm.memory.o;
import com.tencent.mm.memory.o.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.Builder;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.k;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.av.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ak;
import com.tencent.mm.x.am;
import com.tencent.mm.x.bp;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class ae
  implements com.tencent.mm.plugin.sns.b.j, am
{
  public static boolean qcK;
  private static int qcL;
  private static int qcM;
  private static int qcR;
  private static int qcS;
  private static String qdp;
  protected static HashMap<Integer, g.d> qdq;
  private static int qdy;
  private static Point qdz;
  private com.tencent.mm.bt.g gRs;
  private com.tencent.mm.sdk.platformtools.ae handler;
  private String hlH;
  private byte[] hur;
  private boolean lOe;
  private com.tencent.mm.sdk.b.c odK;
  public com.tencent.mm.sdk.platformtools.ae[] qcN;
  public com.tencent.mm.sdk.platformtools.ae[] qcO;
  public com.tencent.mm.sdk.platformtools.ae qcP;
  public com.tencent.mm.sdk.platformtools.ae qcQ;
  private r qcT;
  private com.tencent.mm.plugin.sns.storage.n qcU;
  private com.tencent.mm.plugin.sns.storage.f qcV;
  private com.tencent.mm.plugin.sns.storage.d qcW;
  private g qcX;
  private com.tencent.mm.plugin.sns.storage.l qcY;
  private com.tencent.mm.plugin.sns.storage.j qcZ;
  private com.tencent.mm.plugin.sns.n qdA;
  private k qdB;
  private com.tencent.mm.plugin.sns.e qdC;
  private com.tencent.mm.plugin.sns.p qdD;
  private com.tencent.mm.plugin.sns.h qdE;
  private com.tencent.mm.plugin.sns.g qdF;
  private com.tencent.mm.plugin.sns.m qdG;
  private com.tencent.mm.plugin.sns.j qdH;
  private com.tencent.mm.plugin.sns.b qdI;
  private com.tencent.mm.plugin.sns.c qdJ;
  private com.tencent.mm.plugin.sns.f qdK;
  private com.tencent.mm.sdk.b.c qdL;
  private com.tencent.mm.sdk.b.c qdM;
  private com.tencent.mm.sdk.b.c qdN;
  private com.tencent.mm.sdk.b.c qdO;
  private com.tencent.mm.sdk.b.c qdP;
  private com.tencent.mm.sdk.b.c qdQ;
  private com.tencent.mm.sdk.b.c qdR;
  private com.tencent.mm.sdk.b.c qdS;
  private com.tencent.mm.sdk.b.c qdT;
  private com.tencent.mm.sdk.b.c qdU;
  private com.tencent.mm.sdk.b.c qdV;
  private com.tencent.mm.sdk.b.c qdW;
  private com.tencent.mm.sdk.b.c qdX;
  private com.tencent.mm.sdk.b.c qdY;
  private com.tencent.mm.sdk.b.c qdZ;
  private com.tencent.mm.plugin.sns.storage.t qda;
  private ac qdb;
  private al.a qdc;
  private b qdd;
  private av qde;
  private aj qdf;
  private com.tencent.mm.plugin.sns.f.c qdg;
  private com.tencent.mm.plugin.sns.f.g qdh;
  private com.tencent.mm.plugin.sns.storage.p qdi;
  public com.tencent.mm.plugin.sns.a.b.i qdj;
  private an qdk;
  private boolean qdl;
  private com.tencent.mm.plugin.sns.storage.v qdm;
  private boolean qdn;
  private byte[] qdo;
  private com.tencent.mm.plugin.sns.d qdr;
  private com.tencent.mm.plugin.sns.e.a qds;
  private aq qdt;
  private com.tencent.mm.plugin.sns.lucky.a.f qdu;
  private com.tencent.mm.plugin.sns.lucky.a.j qdv;
  private com.tencent.mm.plugin.sns.lucky.a.d qdw;
  private com.tencent.mm.plugin.sns.lucky.a.l qdx;
  private com.tencent.mm.sdk.b.c qea;
  private com.tencent.mm.sdk.b.c qeb;
  private com.tencent.mm.sdk.b.c qec;
  boolean qed;
  private com.tencent.mm.sdk.b.c qee;
  
  static
  {
    GMTrace.i(8058566606848L, 60041);
    qcK = true;
    qcL = 0;
    qcM = 0;
    qdp = "";
    qdq = new HashMap();
    qdy = 103;
    qdz = new Point();
    qdq.put(Integer.valueOf("CanvasInfo".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8040715649024L, 59908);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.d.gMz;
        GMTrace.o(8040715649024L, 59908);
        return arrayOfString;
      }
    });
    qdq.put(Integer.valueOf("SNSMEDIA_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8106079682560L, 60395);
        String[] arrayOfString = r.gMz;
        GMTrace.o(8106079682560L, 60395);
        return arrayOfString;
      }
    });
    qdq.put(Integer.valueOf("SNSINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8147284525056L, 60702);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.n.gMz;
        GMTrace.o(8147284525056L, 60702);
        return arrayOfString;
      }
    });
    qdq.put(Integer.valueOf("SNSINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8089570902016L, 60272);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.n.gMz;
        GMTrace.o(8089570902016L, 60272);
        return arrayOfString;
      }
    });
    qdq.put(Integer.valueOf("ADSNSINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8049171365888L, 59971);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.f.gMz;
        GMTrace.o(8049171365888L, 59971);
        return arrayOfString;
      }
    });
    qdq.put(Integer.valueOf("SNSEXT_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8121246285824L, 60508);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.l.gMz;
        GMTrace.o(8121246285824L, 60508);
        return arrayOfString;
      }
    });
    qdq.put(Integer.valueOf("SNSCOMMENT_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8088497160192L, 60264);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.j.gMz;
        GMTrace.o(8088497160192L, 60264);
        return arrayOfString;
      }
    });
    qdq.put(Integer.valueOf("SNSTAGINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8073330556928L, 60151);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.t.gMz;
        GMTrace.o(8073330556928L, 60151);
        return arrayOfString;
      }
    });
    qdq.put(Integer.valueOf("SNSKVREPORT_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(16640716570624L, 123983);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.p.gMz;
        GMTrace.o(16640716570624L, 123983);
        return arrayOfString;
      }
    });
    GMTrace.o(8058566606848L, 60041);
  }
  
  public ae()
  {
    GMTrace.i(8051989938176L, 59992);
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.qcN = new com.tencent.mm.sdk.platformtools.ae[3];
    this.qcO = new com.tencent.mm.sdk.platformtools.ae[1];
    this.qcP = null;
    this.qcQ = null;
    this.qdk = new an();
    this.lOe = false;
    this.qdl = true;
    this.hur = new byte[0];
    this.qdm = new com.tencent.mm.plugin.sns.storage.v();
    this.qdn = false;
    this.qdo = new byte[0];
    this.qdu = new com.tencent.mm.plugin.sns.lucky.a.f();
    this.qdv = new com.tencent.mm.plugin.sns.lucky.a.j();
    this.qdw = new com.tencent.mm.plugin.sns.lucky.a.d();
    this.qdx = new com.tencent.mm.plugin.sns.lucky.a.l();
    this.qdL = new com.tencent.mm.sdk.b.c() {};
    this.qdM = new com.tencent.mm.sdk.b.c() {};
    this.qdN = new com.tencent.mm.sdk.b.c() {};
    this.qdO = new com.tencent.mm.sdk.b.c() {};
    this.qdP = new com.tencent.mm.sdk.b.c() {};
    this.qdQ = new com.tencent.mm.sdk.b.c() {};
    this.qdR = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(kj paramAnonymouskj)
      {
        GMTrace.i(16638434869248L, 123966);
        Object localObject2 = paramAnonymouskj.fHO.fCW;
        com.tencent.mm.plugin.sns.storage.n localn = ae.bhp();
        paramAnonymouskj = ae.yI();
        long l1 = paramAnonymouskj.cA(-1L);
        try
        {
          localObject2 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            long l2 = ((Long)((Iterator)localObject2).next()).longValue();
            com.tencent.mm.plugin.sns.storage.m localm = localn.uI((int)l2);
            if (localm != null)
            {
              localm.field_localFlag |= 0x40;
              w.d("MicroMsg.SnsInfoStorage", "snsInfoId:%d, setOmitFailResend", new Object[] { Long.valueOf(l2) });
              localn.b((int)l2, localm);
            }
          }
        }
        finally
        {
          paramAnonymouskj.aJ(l1);
        }
        GMTrace.o(16638434869248L, 123966);
        return false;
      }
    };
    this.qdS = new com.tencent.mm.sdk.b.c() {};
    this.qdT = new com.tencent.mm.sdk.b.c() {};
    this.qdU = new com.tencent.mm.sdk.b.c() {};
    this.qdV = new com.tencent.mm.sdk.b.c() {};
    this.qdW = new com.tencent.mm.sdk.b.c() {};
    this.qdX = new com.tencent.mm.sdk.b.c() {};
    this.qdY = new com.tencent.mm.sdk.b.c() {};
    this.qdZ = new com.tencent.mm.sdk.b.c() {};
    this.qea = new com.tencent.mm.sdk.b.c()
    {
      private static boolean bhE()
      {
        GMTrace.i(16639105957888L, 123971);
        com.tencent.mm.plugin.sns.lucky.a.g.bgi();
        w.a locala = w.a.uXL;
        com.tencent.mm.plugin.sns.g.i locali = new com.tencent.mm.plugin.sns.g.i();
        try
        {
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xz().xi().a(locala, new String(locali.toByteArray(), Charset.forName("ISO-8859-1")));
          GMTrace.o(16639105957888L, 123971);
          return false;
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            w.w("MicroMsg.RedDotUtil", "mardRedotList save exception:" + localIOException.getLocalizedMessage());
          }
        }
      }
    };
    this.qeb = new com.tencent.mm.sdk.b.c() {};
    this.qec = new com.tencent.mm.sdk.b.c() {};
    this.qed = false;
    this.odK = new com.tencent.mm.sdk.b.c() {};
    this.qee = new com.tencent.mm.sdk.b.c() {};
    w.i("MicroMsg.SnsCore", "snscore create! " + Thread.currentThread().getId());
    bhA();
    if (this.qcP == null) {
      com.tencent.mm.sdk.f.e.d(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8070109331456L, 60127);
          Looper.prepare();
          ae.this.qcP = new com.tencent.mm.sdk.platformtools.ae();
          Looper.loop();
          GMTrace.o(8070109331456L, 60127);
        }
      }, "SnsCore_fileTask_handler", 1).start();
    }
    if (this.qcQ == null) {
      com.tencent.mm.sdk.f.e.d(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16636421603328L, 123951);
          Looper.prepare();
          ae.this.qcQ = new com.tencent.mm.sdk.platformtools.ae();
          Looper.loop();
          GMTrace.o(16636421603328L, 123951);
        }
      }, "SnsCore_task_handler", 10).start();
    }
    com.tencent.mm.kiss.a.b.xL().a("R.layout.sns_timeline_item_photo_one3", i.g.pPG, new int[] { i.f.pIv, 0 });
    com.tencent.mm.kiss.a.b.xL().a("R.layout.sns_timeline_imagesline_one", i.g.pPG, new int[] { i.f.pJZ, i.g.pPF, i.f.pIv, 0 });
    com.tencent.mm.kiss.a.b.xL().a("R.layout.sns_timeline_imagesline1", i.g.pPG, new int[] { i.f.pJZ, i.g.pPC, i.f.pIv, 0 });
    com.tencent.mm.kiss.a.b.xL().a("R.layout.sns_timeline_imagesline2", i.g.pPG, new int[] { i.f.pJZ, i.g.pPD, i.f.pIv, 0 });
    com.tencent.mm.kiss.a.b.xL().a("R.layout.sns_timeline_imagesline3", i.g.pPG, new int[] { i.f.pJZ, i.g.pPE, i.f.pIv, 0 });
    com.tencent.mm.kiss.a.b.xL().a("R.layout.sns_media_sub_item2", i.g.pPG, new int[] { i.f.pJZ, i.g.pPb, i.f.pIv, 0 });
    com.tencent.mm.kiss.a.b.xL().a("R.layout.sns_media_sight_item", i.g.pPG, new int[] { i.f.pJZ, i.g.pMs, i.f.pIv, 0 });
    com.tencent.mm.kiss.a.b.xL().a("R.layout.sns_hb_reward_item", i.g.pPG, new int[] { i.f.pJZ, i.g.pOR, i.f.pIv, 0 });
    GMTrace.o(8051989938176L, 59992);
  }
  
  public static com.tencent.mm.sdk.platformtools.ae aBY()
  {
    GMTrace.i(8052392591360L, 59995);
    if (qcM > 0) {
      qcM = 0;
    }
    Object localObject = bgX().qcO;
    int i = qcM;
    qcM = i + 1;
    localObject = localObject[i];
    GMTrace.o(8052392591360L, 59995);
    return (com.tencent.mm.sdk.platformtools.ae)localObject;
  }
  
  public static com.tencent.mm.sdk.platformtools.ae aCa()
  {
    GMTrace.i(8052795244544L, 59998);
    com.tencent.mm.sdk.platformtools.ae localae = bgX().handler;
    GMTrace.o(8052795244544L, 59998);
    return localae;
  }
  
  private static Point aNM()
  {
    GMTrace.i(8055882252288L, 60021);
    Object localObject = (WindowManager)ab.getContext().getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localObject).getDefaultDisplay().getMetrics(localDisplayMetrics);
    qdz.x = localDisplayMetrics.widthPixels;
    qdz.y = localDisplayMetrics.heightPixels;
    localObject = qdz;
    GMTrace.o(8055882252288L, 60021);
    return (Point)localObject;
  }
  
  public static String bgV()
  {
    GMTrace.i(8051318849536L, 59987);
    com.tencent.mm.kernel.h.xA();
    String str = (String)com.tencent.mm.kernel.h.xz().xi().get(2, null);
    GMTrace.o(8051318849536L, 59987);
    return str;
  }
  
  public static int bgW()
  {
    GMTrace.i(8051453067264L, 59988);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xx();
    int i = com.tencent.mm.kernel.a.wy();
    GMTrace.o(8051453067264L, 59988);
    return i;
  }
  
  private static ae bgX()
  {
    GMTrace.i(8051721502720L, 59990);
    ae localae1 = (ae)com.tencent.mm.x.l.o(ae.class);
    if (!localae1.qdn) {}
    for (;;)
    {
      Object localObject3;
      Object localObject2;
      synchronized (localae1.qdo)
      {
        if (!localae1.qdn)
        {
          w.i("MicroMsg.SnsCore", "onAccInit because bug!");
          localae1.aW(true);
        }
        if (!localae1.lOe) {
          break label1579;
        }
        synchronized (localae1.hur)
        {
          w.i("MicroMsg.SnsCore", "getCore need reset DB now " + Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + localae1.hashCode());
          if (!localae1.lOe) {
            break label1576;
          }
          localae1.qdl = false;
          localObject3 = localae1.qdm;
          localObject2 = qdq;
          if (((com.tencent.mm.plugin.sns.storage.v)localObject3).qvL)
          {
            w.i("MicroMsg.TrimSnsDb", "pass hasTrim");
            if (localae1.gRs != null) {
              break;
            }
            localae1.gRs = new com.tencent.mm.bt.g();
            com.tencent.mm.kernel.h.xA();
            localObject2 = com.tencent.mm.kernel.h.xz().cachePath;
            localObject2 = (String)localObject2 + "SnsMicroMsg.db";
            if (localae1.gRs.b((String)localObject2, qdq, true, true)) {
              break;
            }
            throw new SQLiteException("sns db init failed");
          }
        }
      }
      com.tencent.mm.kernel.h.xA();
      if (com.tencent.mm.kernel.h.xx().wM())
      {
        int i = bg.getInt(com.tencent.mm.k.g.uz().getValue("AndroidCleanSnsDb"), 0);
        w.i("MicroMsg.TrimSnsDb", "pass dynamic? " + i);
        if (i <= 0)
        {
          com.tencent.mm.kernel.h.xA();
          String str = com.tencent.mm.kernel.h.xz().cachePath;
          if (FileOp.aZ(str + "SnsMicroMsg2.db.ini"))
          {
            com.tencent.mm.plugin.sns.storage.v.HY(str);
            FileOp.deleteFile(str + "SnsMicroMsg2.db.ini");
          }
          Object localObject4 = ab.getContext().getSharedPreferences(ab.bNa(), 0);
          if (bg.aE(((SharedPreferences)localObject4).getLong("check_trim_time", 0L)) < 604800L)
          {
            w.i("MicroMsg.TrimSnsDb", "trim sns pass because time short");
          }
          else
          {
            ((SharedPreferences)localObject4).edit().putLong("check_trim_time", bg.Po()).commit();
            ((com.tencent.mm.plugin.sns.storage.v)localObject3).qvL = true;
            long l1 = System.currentTimeMillis();
            i = com.tencent.mm.o.a.vu();
            if ((i == 1) || (i == 2))
            {
              w.i("MicroMsg.TrimSnsDb", "trim sns error space dangerous");
            }
            else if (FileOp.aZ(str + "sns_mark.ini"))
            {
              if (bg.aF(FileOp.kJ(str + "sns_mark.ini")) < 2592000000L)
              {
                w.i("MicroMsg.TrimSnsDb", "mark file exist and return");
                com.tencent.mm.plugin.sns.storage.v.HY(str);
              }
              else
              {
                FileOp.deleteFile(str + "sns_mark.ini");
              }
            }
            else
            {
              long l2 = FileOp.kI(str + "SnsMicroMsg.db");
              w.i("MicroMsg.TrimSnsDb", "trim sns " + l2);
              if (l2 < 52428800L)
              {
                w.i("MicroMsg.TrimSnsDb", "trim sns free pass: " + (System.currentTimeMillis() - l1));
              }
              else
              {
                FileOp.kM(str + "sns_mark.ini");
                localObject4 = str + "SnsMicroMsg2.db";
                localObject3 = new com.tencent.mm.bt.g();
                if (!((com.tencent.mm.bt.g)localObject3).b((String)localObject4, null, true, false)) {
                  throw new com.tencent.mm.x.b((byte)0);
                }
                localObject4 = new com.tencent.mm.bt.g();
                if (!((com.tencent.mm.bt.g)localObject4).b(str + "SnsMicroMsg.db", (HashMap)localObject2, true, true)) {
                  throw new com.tencent.mm.x.b((byte)0);
                }
                l2 = System.currentTimeMillis();
                if (!com.tencent.mm.plugin.sns.storage.v.a((com.tencent.mm.bt.g)localObject4, (com.tencent.mm.bt.g)localObject3)) {}
                for (i = -1;; i = 1)
                {
                  long l3 = System.currentTimeMillis() - l2;
                  w.i("MicroMsg.TrimSnsDb", "copysns insert all %d passed ret:" + i, new Object[] { Long.valueOf(l3) });
                  ((com.tencent.mm.bt.g)localObject4).yF();
                  ((com.tencent.mm.bt.g)localObject3).yF();
                  if (i >= 0)
                  {
                    com.tencent.mm.kernel.h.xA();
                    localObject2 = com.tencent.mm.kernel.h.xz().cachePath;
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db");
                    bool = FileOp.g((String)localObject2, "SnsMicroMsg2.db", "SnsMicroMsg.db");
                    w.i("MicroMsg.TrimSnsDb", "rename file " + bool);
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db-shm");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db-wal");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db.ini");
                    FileOp.o("SnsMicroMsg2.db.ini", "SnsMicroMsg.db.ini");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg2.db.ini");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg2.db");
                    FileOp.deleteFile((String)localObject2 + "sns_mark.ini");
                  }
                  l2 = System.currentTimeMillis() - l2;
                  w.i("MicroMsg.TrimSnsDb", "copysns data ret=%d all: %d copytime %d ", new Object[] { Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l2 - l3) });
                  w.i("MicroMsg.TrimSnsDb", "trim sns done pass: " + (System.currentTimeMillis() - l1));
                  break;
                  l3 = System.currentTimeMillis();
                  com.tencent.mm.plugin.sns.storage.v.a((com.tencent.mm.bt.g)localObject4, (com.tencent.mm.bt.g)localObject3, "snsExtInfo3");
                  boolean bool = ((com.tencent.mm.bt.g)localObject3).eL("", "insert into " + "snsExtInfo3" + " select * from old." + "snsExtInfo3");
                  w.i("MicroMsg.TrimSnsDb", "copysns ret_ext:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  com.tencent.mm.plugin.sns.storage.v.a((com.tencent.mm.bt.g)localObject4, (com.tencent.mm.bt.g)localObject3, "SnsComment");
                  bool = ((com.tencent.mm.bt.g)localObject3).eL("", "insert into " + "SnsComment" + " select * from old." + "SnsComment");
                  w.i("MicroMsg.TrimSnsDb", "copysns ret_msg:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  com.tencent.mm.plugin.sns.storage.v.a((com.tencent.mm.bt.g)localObject4, (com.tencent.mm.bt.g)localObject3, "SnsInfo");
                  bool = ((com.tencent.mm.bt.g)localObject3).eL("", "insert into " + "SnsInfo" + " select * from old." + "SnsInfo" + " where  (sourceType & 2 != 0 ) " + com.tencent.mm.plugin.sns.storage.n.qvg + " limit 200");
                  w.i("MicroMsg.TrimSnsDb", "copysns ret_sns:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  bool = ((com.tencent.mm.bt.g)localObject3).eL("", "update snsExtinfo3 set md5 = '', faults = '';");
                  w.i("MicroMsg.TrimSnsDb", "update ext info  passed  %s  updateRet %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l3), Boolean.valueOf(bool) });
                  ((com.tencent.mm.bt.g)localObject3).eL("", "DETACH DATABASE old");
                }
              }
            }
          }
        }
      }
    }
    localae2.lOe = false;
    w.i("MicroMsg.SnsCore", "resetdb done");
    label1576:
    label1579:
    GMTrace.o(8051721502720L, 59990);
    return localae2;
  }
  
  public static boolean bgY()
  {
    GMTrace.i(8051855720448L, 59991);
    bgX();
    if (!com.tencent.mm.kernel.h.xx().wM())
    {
      GMTrace.o(8051855720448L, 59991);
      return true;
    }
    GMTrace.o(8051855720448L, 59991);
    return false;
  }
  
  public static com.tencent.mm.sdk.platformtools.ae bgZ()
  {
    GMTrace.i(8052124155904L, 59993);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.kernel.h.xC().bNo();
    GMTrace.o(8052124155904L, 59993);
    return localae;
  }
  
  private void bhA()
  {
    GMTrace.i(8056284905472L, 60024);
    final int i = 0;
    while (i < 3)
    {
      if (this.qcN[i] == null) {
        com.tencent.mm.sdk.f.e.d(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8070914637824L, 60133);
            Looper.prepare();
            ae.this.qcN[i] = new com.tencent.mm.sdk.platformtools.ae();
            Looper.loop();
            GMTrace.o(8070914637824L, 60133);
          }
        }, "SnsCore_CDNDownload_handler", 1).start();
      }
      i += 1;
    }
    i = 0;
    while (i <= 0)
    {
      if (this.qcO[0] == null) {
        com.tencent.mm.sdk.f.e.d(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8047426535424L, 59958);
            Looper.prepare();
            ae.this.qcO[this.val$id] = new com.tencent.mm.sdk.platformtools.ae();
            Looper.loop();
            GMTrace.o(8047426535424L, 59958);
          }
        }, "SnsCore_thumbDecode_handler", 1).start();
      }
      i += 1;
    }
    GMTrace.o(8056284905472L, 60024);
  }
  
  public static void bhB()
  {
    GMTrace.i(16041031761920L, 119515);
    w.i("MicroMsg.SnsCore", "dumptable");
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject = bhp();
    long l = System.currentTimeMillis();
    localObject = ((com.tencent.mm.plugin.sns.storage.n)localObject).gMB.a("select count(*) from SnsInfo", null, 2);
    if (((Cursor)localObject).moveToFirst()) {}
    for (int i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      w.i("MicroMsg.SnsInfoStorage", "sns table count %d passed %d", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      localObject = bhe();
      l = System.currentTimeMillis();
      localObject = ((r)localObject).hhi.a("select count(*) from SnsMedia", null, 2);
      if (((Cursor)localObject).moveToFirst()) {}
      for (int j = ((Cursor)localObject).getInt(0);; j = 0)
      {
        ((Cursor)localObject).close();
        w.i("MicroMsg.snsMediaStorage", "media table count %d passed %d", new Object[] { Integer.valueOf(j), Long.valueOf(System.currentTimeMillis() - l) });
        localObject = bhs();
        l = System.currentTimeMillis();
        localObject = ((com.tencent.mm.plugin.sns.storage.l)localObject).gMB.a("select count(*) from snsExtInfo3", null, 2);
        if (((Cursor)localObject).moveToFirst()) {}
        for (int k = ((Cursor)localObject).getInt(0);; k = 0)
        {
          ((Cursor)localObject).close();
          w.i("MicroMsg.SnsExtStorage", "ext table count %d passed %d", new Object[] { Integer.valueOf(k), Long.valueOf(System.currentTimeMillis() - l) });
          localStringBuffer.append(" snscount " + i);
          localStringBuffer.append(" mediacount " + j);
          localStringBuffer.append(" extcount " + k);
          w.i("MicroMsg.SnsCore", "dump table " + localStringBuffer.toString());
          GMTrace.o(16041031761920L, 119515);
          return;
        }
      }
    }
  }
  
  private static void bhC()
  {
    GMTrace.i(14556449472512L, 108454);
    FileOp.kL(((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath());
    FileOp.kL(((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath());
    GMTrace.o(14556449472512L, 108454);
  }
  
  public static String bhD()
  {
    GMTrace.i(8057358647296L, 60032);
    if (bg.mZ(qdp))
    {
      localObject = com.tencent.mm.sdk.platformtools.av.bNG().iterator();
      while (((Iterator)localObject).hasNext())
      {
        av.a locala = (av.a)((Iterator)localObject).next();
        if (com.tencent.mm.compatible.util.e.gZR.equals(locala.uOU)) {
          qdp = locala.uOV;
        }
      }
      w.i("MicroMsg.SnsCore", "get filesys " + qdp);
    }
    Object localObject = bg.ap(qdp, "");
    GMTrace.o(8057358647296L, 60032);
    return (String)localObject;
  }
  
  public static com.tencent.mm.sdk.platformtools.ae bha()
  {
    GMTrace.i(8052258373632L, 59994);
    if ((qcL >= com.tencent.mm.storage.v.uTN) || (qcL >= 3)) {
      qcL = 0;
    }
    Object localObject = bgX().qcN;
    int i = qcL;
    qcL = i + 1;
    localObject = localObject[i];
    GMTrace.o(8052258373632L, 59994);
    return (com.tencent.mm.sdk.platformtools.ae)localObject;
  }
  
  protected static com.tencent.mm.sdk.platformtools.ae bhb()
  {
    GMTrace.i(8052526809088L, 59996);
    com.tencent.mm.sdk.platformtools.ae localae = bgX().qcP;
    GMTrace.o(8052526809088L, 59996);
    return localae;
  }
  
  public static com.tencent.mm.sdk.platformtools.ae bhc()
  {
    GMTrace.i(8052661026816L, 59997);
    com.tencent.mm.sdk.platformtools.ae localae = bgX().qcQ;
    GMTrace.o(8052661026816L, 59997);
    return localae;
  }
  
  public static ar bhd()
  {
    GMTrace.i(8053197897728L, 60001);
    com.tencent.mm.kernel.h.xA();
    ar localar = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL();
    GMTrace.o(8053197897728L, 60001);
    return localar;
  }
  
  public static r bhe()
  {
    GMTrace.i(8053332115456L, 60002);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qcT == null) {
      bgX().qcT = new r(bgX().gRs);
    }
    r localr = bgX().qcT;
    GMTrace.o(8053332115456L, 60002);
    return localr;
  }
  
  public static al.a bhf()
  {
    GMTrace.i(8053466333184L, 60003);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdc == null)
    {
      bgX().qdc = new al.a();
      com.tencent.mm.plugin.sns.b.n.pXX = bgX().qdc;
    }
    al.a locala = bgX().qdc;
    GMTrace.o(8053466333184L, 60003);
    return locala;
  }
  
  public static com.tencent.mm.plugin.sns.f.c bhg()
  {
    GMTrace.i(8053600550912L, 60004);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdg == null) {
      bgX().qdg = new com.tencent.mm.plugin.sns.f.c();
    }
    com.tencent.mm.plugin.sns.f.c localc = bgX().qdg;
    GMTrace.o(8053600550912L, 60004);
    return localc;
  }
  
  public static com.tencent.mm.plugin.sns.f.g bhh()
  {
    GMTrace.i(8053734768640L, 60005);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdh == null) {
      bgX().qdh = new com.tencent.mm.plugin.sns.f.g();
    }
    com.tencent.mm.plugin.sns.f.g localg = bgX().qdh;
    GMTrace.o(8053734768640L, 60005);
    return localg;
  }
  
  public static com.tencent.mm.plugin.sns.storage.p bhi()
  {
    GMTrace.i(8053868986368L, 60006);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdi == null) {
      bgX().qdi = new com.tencent.mm.plugin.sns.storage.p(bgX().gRs);
    }
    com.tencent.mm.plugin.sns.storage.p localp = bgX().qdi;
    GMTrace.o(8053868986368L, 60006);
    return localp;
  }
  
  public static com.tencent.mm.plugin.sns.a.b.i bhj()
  {
    GMTrace.i(8054003204096L, 60007);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdj == null) {
      bgX().qdj = new com.tencent.mm.plugin.sns.a.b.i();
    }
    com.tencent.mm.plugin.sns.a.b.i locali = bgX().qdj;
    GMTrace.o(8054003204096L, 60007);
    return locali;
  }
  
  public static b bhk()
  {
    GMTrace.i(8054137421824L, 60008);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdd == null) {
      bgX().qdd = new b();
    }
    b localb = bgX().qdd;
    GMTrace.o(8054137421824L, 60008);
    return localb;
  }
  
  public static av bhl()
  {
    GMTrace.i(8054271639552L, 60009);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qde == null)
    {
      bgX().qde = new av();
      com.tencent.mm.plugin.sns.b.n.pXR = bgX().qde;
    }
    av localav = bgX().qde;
    GMTrace.o(8054271639552L, 60009);
    return localav;
  }
  
  public static g bhm()
  {
    GMTrace.i(8054405857280L, 60010);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qcX == null)
    {
      bgX().qcX = new g();
      com.tencent.mm.plugin.sns.b.n.pXS = bgX().qcX;
    }
    g localg = bgX().qcX;
    GMTrace.o(8054405857280L, 60010);
    return localg;
  }
  
  public static aq bhn()
  {
    GMTrace.i(8054540075008L, 60011);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdt == null) {
      bgX().qdt = new aq();
    }
    aq localaq = bgX().qdt;
    GMTrace.o(8054540075008L, 60011);
    return localaq;
  }
  
  public static ac bho()
  {
    GMTrace.i(8054674292736L, 60012);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdb == null)
    {
      localObject = bgX();
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.h.xA();
      ((ae)localObject).qdb = new ac(com.tencent.mm.kernel.h.xz().cachePath + "snsAsyncQueue.data");
    }
    Object localObject = bgX().qdb;
    GMTrace.o(8054674292736L, 60012);
    return (ac)localObject;
  }
  
  public static com.tencent.mm.plugin.sns.storage.n bhp()
  {
    GMTrace.i(8054808510464L, 60013);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qcU == null)
    {
      bgX().qcU = new com.tencent.mm.plugin.sns.storage.n(bgX().gRs);
      com.tencent.mm.plugin.sns.b.n.pXY = bgX().qcU;
    }
    com.tencent.mm.plugin.sns.storage.n localn = bgX().qcU;
    GMTrace.o(8054808510464L, 60013);
    return localn;
  }
  
  public static com.tencent.mm.plugin.sns.storage.d bhq()
  {
    GMTrace.i(16637092691968L, 123956);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qcW == null) {
      bgX().qcW = new com.tencent.mm.plugin.sns.storage.d(bgX().gRs);
    }
    com.tencent.mm.plugin.sns.storage.d locald = bgX().qcW;
    GMTrace.o(16637092691968L, 123956);
    return locald;
  }
  
  public static com.tencent.mm.plugin.sns.storage.f bhr()
  {
    GMTrace.i(8054942728192L, 60014);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qcV == null) {
      bgX().qcV = new com.tencent.mm.plugin.sns.storage.f(bgX().gRs);
    }
    com.tencent.mm.plugin.sns.storage.f localf = bgX().qcV;
    GMTrace.o(8054942728192L, 60014);
    return localf;
  }
  
  public static com.tencent.mm.plugin.sns.storage.l bhs()
  {
    GMTrace.i(8055076945920L, 60015);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qcY == null)
    {
      bgX().qcY = new com.tencent.mm.plugin.sns.storage.l(bgX().gRs, new ag());
      com.tencent.mm.plugin.sns.b.n.pXT = bgX().qcY;
    }
    com.tencent.mm.plugin.sns.storage.l locall = bgX().qcY;
    GMTrace.o(8055076945920L, 60015);
    return locall;
  }
  
  public static com.tencent.mm.plugin.sns.storage.j bht()
  {
    GMTrace.i(8055211163648L, 60016);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qcZ == null)
    {
      bgX().qcZ = new com.tencent.mm.plugin.sns.storage.j(bgX().gRs);
      com.tencent.mm.plugin.sns.b.n.pXU = bgX().qcZ;
    }
    com.tencent.mm.plugin.sns.storage.j localj = bgX().qcZ;
    GMTrace.o(8055211163648L, 60016);
    return localj;
  }
  
  public static com.tencent.mm.plugin.sns.storage.t bhu()
  {
    GMTrace.i(8055345381376L, 60017);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qda == null)
    {
      bgX().qda = new com.tencent.mm.plugin.sns.storage.t(bgX().gRs);
      com.tencent.mm.plugin.sns.b.n.pXV = bgX().qda;
    }
    com.tencent.mm.plugin.sns.storage.t localt = bgX().qda;
    GMTrace.o(8055345381376L, 60017);
    return localt;
  }
  
  public static aj bhv()
  {
    GMTrace.i(8055479599104L, 60018);
    com.tencent.mm.kernel.h.xx().wH();
    if (bgX().qdf == null) {
      bgX().qdf = new aj();
    }
    aj localaj = bgX().qdf;
    GMTrace.o(8055479599104L, 60018);
    return localaj;
  }
  
  public static int bhw()
  {
    GMTrace.i(8055613816832L, 60019);
    if (aNM().y < aNM().x) {}
    for (int i = aNM().y;; i = aNM().x - com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), qdy))
    {
      i /= 3;
      qcR = i;
      if (i > 10) {
        break;
      }
      w.e("MicroMsg.SnsCore", "can not get multiThumbDisplaySize or the multiThumbDisplaySize < 10");
      GMTrace.o(8055613816832L, 60019);
      return 150;
    }
    i = qcR;
    GMTrace.o(8055613816832L, 60019);
    return i;
  }
  
  public static int bhx()
  {
    GMTrace.i(8055748034560L, 60020);
    if (qcS <= 0) {
      if (aNM().x > 720) {
        break label60;
      }
    }
    label60:
    for (qcS = 200;; qcS = 100)
    {
      qcS = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), qcS);
      int i = qcS;
      GMTrace.o(8055748034560L, 60020);
      return i;
    }
  }
  
  public static boolean bhy()
  {
    GMTrace.i(8056016470016L, 60022);
    SharedPreferences localSharedPreferences = al.aZ(ab.getContext(), "sp_sns_dynswitch_stg");
    boolean bool;
    if (localSharedPreferences.contains("st_sw_use_vcodec_img"))
    {
      bool = localSharedPreferences.getBoolean("st_sw_use_vcodec_img", false);
      w.w("MicroMsg.SnsCore", "isUseVCodecImg: %b (set statically outside)", new Object[] { Boolean.valueOf(bool) });
    }
    for (;;)
    {
      GMTrace.o(8056016470016L, 60022);
      return bool;
      bool = localSharedPreferences.getBoolean("sw_use_vcodec_img", false);
      w.d("MicroMsg.SnsCore", "isUseVCodecImg: %b", new Object[] { Boolean.valueOf(bool) });
    }
  }
  
  public static boolean bhz()
  {
    GMTrace.i(8056150687744L, 60023);
    SharedPreferences localSharedPreferences = al.aZ(ab.getContext(), "sp_sns_dynswitch_stg");
    boolean bool;
    if (localSharedPreferences.contains("st_sw_use_wxpc_img"))
    {
      bool = localSharedPreferences.getBoolean("st_sw_use_wxpc_img", false);
      w.w("MicroMsg.SnsCore", "isUseWxpcImg: %b (set statically outside)", new Object[] { Boolean.valueOf(bool) });
    }
    for (;;)
    {
      GMTrace.o(8056150687744L, 60023);
      return bool;
      bool = localSharedPreferences.getBoolean("sw_use_wxpc_img", false);
      w.d("MicroMsg.SnsCore", "isUseWxpcImg: %b", new Object[] { Boolean.valueOf(bool) });
    }
  }
  
  public static String getAccSnsPath()
  {
    GMTrace.i(8052929462272L, 59999);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath();
    GMTrace.o(8052929462272L, 59999);
    return str;
  }
  
  public static String getAccSnsTmpPath()
  {
    GMTrace.i(8053063680000L, 60000);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath();
    GMTrace.o(8053063680000L, 60000);
    return str;
  }
  
  public static com.tencent.mm.bt.g yI()
  {
    GMTrace.i(8051587284992L, 59989);
    com.tencent.mm.bt.g localg = bgX().gRs;
    GMTrace.o(8051587284992L, 59989);
    return localg;
  }
  
  public static String zp()
  {
    GMTrace.i(8051184631808L, 59986);
    com.tencent.mm.kernel.h.xx().wH();
    com.tencent.mm.kernel.h.xA();
    String str = com.tencent.mm.kernel.h.xz().gRr;
    GMTrace.o(8051184631808L, 59986);
    return str;
  }
  
  public final void a(ak paramak)
  {
    GMTrace.i(8057090211840L, 60030);
    t.a(paramak);
    GMTrace.o(8057090211840L, 60030);
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(8056821776384L, 60028);
    w.i("MicroMsg.SnsCore", "onAccountPostReset " + Thread.currentThread().getId() + " isAccInit: " + this.qdn);
    if (this.qdn)
    {
      GMTrace.o(8056821776384L, 60028);
      return;
    }
    this.qdn = true;
    this.lOe = true;
    FileOp.kL(zp() + "sfs");
    this.hlH = getAccSnsPath();
    Object localObject1 = this.hlH;
    Object localObject2 = new SFSContext.Builder();
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.h.xA();
    localObject2 = ((SFSContext.Builder)localObject2).setDBDirectory(com.tencent.mm.kernel.h.xz().cachePath + "sfs").setStoragePath(com.tencent.mm.plugin.m.b.zl()).setName("sns");
    FileOp.a((String)localObject1, new String[] { "sight_*", "sns_tmp*", "sightad_*", "sns_tmpsad_*" }, (SFSContext.Builder)localObject2);
    bhC();
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("NewYearSNSCtrl2016", this.qdu, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("NewYearSNSTips2016", this.qdv, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("NewYearSNSAmountLevelCtrl2016", this.qdw, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("SnsAd", this.qdx, true);
    com.tencent.mm.plugin.sns.b.n.pXR = bhl();
    com.tencent.mm.plugin.sns.b.n.pXS = bhm();
    com.tencent.mm.plugin.sns.b.n.pXT = bhs();
    com.tencent.mm.plugin.sns.b.n.pXU = bht();
    com.tencent.mm.plugin.sns.b.n.pXV = bhu();
    com.tencent.mm.plugin.sns.b.n.pXX = bhf();
    com.tencent.mm.plugin.sns.b.n.pXW = this;
    com.tencent.mm.plugin.sns.b.n.pXY = bhp();
    com.tencent.mm.sdk.b.a.uLm.b(this.qeb);
    com.tencent.mm.sdk.b.a.uLm.b(this.qec);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdP);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdN);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdO);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdQ);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdR);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdS);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdT);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdU);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdV);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdW);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdX);
    this.qdA = new com.tencent.mm.plugin.sns.n();
    this.qdB = new k();
    this.qdC = new com.tencent.mm.plugin.sns.e();
    this.qdD = new com.tencent.mm.plugin.sns.p();
    this.qdE = new com.tencent.mm.plugin.sns.h();
    this.qdF = new com.tencent.mm.plugin.sns.g();
    this.qdG = new com.tencent.mm.plugin.sns.m();
    this.qdH = new com.tencent.mm.plugin.sns.j();
    this.qdI = new com.tencent.mm.plugin.sns.b();
    this.qdJ = new com.tencent.mm.plugin.sns.c();
    this.qdK = new com.tencent.mm.plugin.sns.f();
    com.tencent.mm.sdk.b.a.uLm.b(this.qea);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdZ);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdD);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdA);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdB);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdC);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdE);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdF);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdG);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdH);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdI);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdJ);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdK);
    com.tencent.mm.sdk.b.a.uLm.b(this.odK);
    this.qdr = new com.tencent.mm.plugin.sns.d();
    com.tencent.mm.sdk.b.a.uLm.b(this.qdr);
    com.tencent.mm.sdk.b.a.uLm.b(this.qee);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdL);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdM);
    com.tencent.mm.sdk.b.a.uLm.b(this.qdY);
    localObject1 = bhj();
    com.tencent.mm.plugin.sns.a.b.i.pWS = com.tencent.mm.k.g.uz().getInt("MMUxAdLog2GSendSize", 20480);
    com.tencent.mm.plugin.sns.a.b.i.pWT = com.tencent.mm.k.g.uz().getInt("MMUxAdLog3GSendSize", 30720);
    com.tencent.mm.plugin.sns.a.b.i.pWU = com.tencent.mm.k.g.uz().getInt("MMUxAdLogWifiSendSize", 51200);
    com.tencent.mm.plugin.sns.a.b.i.pWV = com.tencent.mm.k.g.uz().getInt("MMUxAdLogMinRandTime", 60);
    com.tencent.mm.plugin.sns.a.b.i.pWW = com.tencent.mm.k.g.uz().getInt("MMUxAdLogMaxRandTime", 1800);
    com.tencent.mm.plugin.sns.a.b.i.pWX = com.tencent.mm.k.g.uz().getInt("MMUxAdLogMaxExceptionTime", 43200);
    w.i("MicroMsg.SnsLogMgr", "init " + com.tencent.mm.plugin.sns.a.b.i.pWS + ";" + com.tencent.mm.plugin.sns.a.b.i.pWT + ";" + com.tencent.mm.plugin.sns.a.b.i.pWU + ";" + com.tencent.mm.plugin.sns.a.b.i.pWV + ";" + com.tencent.mm.plugin.sns.a.b.i.pWW + ";" + com.tencent.mm.plugin.sns.a.b.i.pWX);
    if (com.tencent.mm.plugin.sns.a.b.i.pWW - com.tencent.mm.plugin.sns.a.b.i.pWV < 0) {
      com.tencent.mm.plugin.sns.a.b.i.pWW = com.tencent.mm.plugin.sns.a.b.i.pWV;
    }
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(1802, (com.tencent.mm.ac.e)localObject1);
    localObject1 = bhl();
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(207, (com.tencent.mm.ac.e)localObject1);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(209, (com.tencent.mm.ac.e)localObject1);
    localObject1 = this.qdk;
    com.tencent.mm.sdk.b.a.uLm.b(((an)localObject1).qeI);
    com.tencent.mm.sdk.b.a.uLm.b(((an)localObject1).qeJ);
    com.tencent.mm.sdk.b.a.uLm.b(((an)localObject1).qeK);
    this.qds = new com.tencent.mm.plugin.sns.e.a();
    ao.init();
    localObject1 = com.tencent.mm.modelsns.c.hNQ;
    com.tencent.mm.modelsns.c.LK();
    if (com.tencent.mm.memory.l.yp())
    {
      localObject1 = com.tencent.mm.memory.c.gZY;
      localObject2 = com.tencent.mm.memory.c.gZY;
      localObject2.getClass();
      ((com.tencent.mm.memory.c)localObject1).a(new e.a((com.tencent.mm.memory.c)localObject2)
      {
        final int qeg;
        
        public final long yk()
        {
          GMTrace.i(8048634494976L, 59967);
          GMTrace.o(8048634494976L, 59967);
          return 10485760L;
        }
        
        public final int yl()
        {
          GMTrace.i(8048768712704L, 59968);
          GMTrace.o(8048768712704L, 59968);
          return -1;
        }
      });
    }
    localObject1 = o.hav;
    localObject2 = o.hav;
    localObject2.getClass();
    ((o)localObject1).a(new e.a((o)localObject2)
    {
      public final long yk()
      {
        GMTrace.i(8075746476032L, 60169);
        GMTrace.o(8075746476032L, 60169);
        return -1L;
      }
      
      public final int yl()
      {
        GMTrace.i(8075880693760L, 60170);
        GMTrace.o(8075880693760L, 60170);
        return 3;
      }
    });
    localObject1 = com.tencent.mm.memory.g.haf;
    localObject2 = com.tencent.mm.memory.g.haf;
    localObject2.getClass();
    ((com.tencent.mm.memory.g)localObject1).a(new e.a((com.tencent.mm.memory.g)localObject2)
    {
      public final long yk()
      {
        GMTrace.i(16640179699712L, 123979);
        GMTrace.o(16640179699712L, 123979);
        return 0L;
      }
      
      public final int yl()
      {
        GMTrace.i(16640313917440L, 123980);
        GMTrace.o(16640313917440L, 123980);
        return 5;
      }
    });
    bhn();
    GMTrace.o(8056821776384L, 60028);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(8056955994112L, 60029);
    FileOp.kL(zp() + "sfs");
    if (this.hlH != null)
    {
      FileOp.kC(this.hlH);
      this.hlH = getAccSnsPath();
      String str = this.hlH;
      SFSContext.Builder localBuilder = new SFSContext.Builder();
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.h.xA();
      localBuilder = localBuilder.setDBDirectory(com.tencent.mm.kernel.h.xz().cachePath + "sfs").setStoragePath(com.tencent.mm.plugin.m.b.zl()).setName("sns");
      FileOp.a(str, new String[] { "sight_*", "sns_tmp*", "sightad_*", "sns_tmpsad_*" }, localBuilder);
    }
    bhC();
    GMTrace.o(8056955994112L, 60029);
  }
  
  public final void b(ak paramak)
  {
    GMTrace.i(8057224429568L, 60031);
    t.b(paramak);
    GMTrace.o(8057224429568L, 60031);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(8056687558656L, 60027);
    GMTrace.o(8056687558656L, 60027);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(8056419123200L, 60025);
    ??? = bhj();
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(1802, (com.tencent.mm.ac.e)???);
    ??? = this.qdk;
    com.tencent.mm.sdk.b.a.uLm.c(((an)???).qeI);
    com.tencent.mm.sdk.b.a.uLm.c(((an)???).qeJ);
    com.tencent.mm.sdk.b.a.uLm.c(((an)???).qeK);
    com.tencent.mm.sdk.b.a.uLm.c(this.qeb);
    com.tencent.mm.sdk.b.a.uLm.c(this.qec);
    com.tencent.mm.sdk.b.a.uLm.c(this.qea);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdZ);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdP);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdN);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdO);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdQ);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdR);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdS);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdD);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdE);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdU);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdV);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdA);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdB);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdC);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdF);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdG);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdH);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdI);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdJ);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdK);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdT);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdr);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdW);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdX);
    com.tencent.mm.sdk.b.a.uLm.c(this.odK);
    com.tencent.mm.sdk.b.a.uLm.c(this.qee);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdY);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdL);
    com.tencent.mm.sdk.b.a.uLm.c(this.qdM);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("NewYearSNSCtrl2016", this.qdu, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("NewYearSNSTips2016", this.qdv, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("NewYearSNSAmountLevelCtrl2016", this.qdw, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("SnsAd", this.qdx, true);
    ??? = bhl();
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(207, (com.tencent.mm.ac.e)???);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(209, (com.tencent.mm.ac.e)???);
    ??? = (ae)com.tencent.mm.x.l.o(ae.class);
    if (??? != null)
    {
      w.d("MicroMsg.SnsCore", "SnsCore close db");
      if (((ae)???).gRs != null)
      {
        ((ae)???).gRs.yF();
        ((ae)???).gRs = null;
      }
      int i = 0;
      while (i < 3)
      {
        if (???.qcN[i] != null) {
          ???.qcN[i].getLooper().quit();
        }
        i += 1;
      }
      i = 0;
      while (i <= 0)
      {
        if (???.qcO[0] != null) {
          ???.qcO[0].getLooper().quit();
        }
        i += 1;
      }
      if (((ae)???).qcP != null) {
        ((ae)???).qcP.getLooper().quit();
      }
      if (((ae)???).qcQ != null) {
        ((ae)???).qcQ.getLooper().quit();
      }
    }
    if (this.hlH != null)
    {
      FileOp.kC(this.hlH);
      this.hlH = null;
    }
    ??? = this.qds;
    bhk().b((b.b)???);
    com.tencent.mm.sdk.b.a.uLm.c(((com.tencent.mm.plugin.sns.e.a)???).pYF);
    ao.PK();
    com.tencent.mm.memory.g.haf.yf();
    com.tencent.mm.memory.c.gZY.yf();
    o.hav.yf();
    aq localaq = bhn();
    localaq.qeT = null;
    localaq.hTA = null;
    localaq.qeV.clear();
    localaq.qeU.clear();
    synchronized (localaq.qeW)
    {
      localaq.qeW.clear();
      com.tencent.mm.sdk.b.a.uLm.c(localaq.qeX);
      com.tencent.mm.sdk.b.a.uLm.c(localaq.qeJ);
      com.tencent.mm.sdk.b.a.uLm.c(localaq.qeK);
      GMTrace.o(8056419123200L, 60025);
      return;
    }
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(8056553340928L, 60026);
    GMTrace.o(8056553340928L, 60026);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */