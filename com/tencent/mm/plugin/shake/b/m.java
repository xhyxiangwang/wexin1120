package com.tencent.mm.plugin.shake.b;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bb.l;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.jf;
import com.tencent.mm.g.a.mq;
import com.tencent.mm.g.a.ok;
import com.tencent.mm.g.a.qj;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ar.a;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.util.HashMap;
import java.util.Map;

public final class m
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private as.a hfJ;
  private com.tencent.mm.sdk.b.c kCk;
  public com.tencent.mm.sdk.platformtools.ae mHandler;
  private com.tencent.mm.sdk.b.c odK;
  private ar.a ogO;
  private e pvJ;
  private g pvK;
  private com.tencent.mm.plugin.shake.c.a.f pvL;
  private com.tencent.mm.plugin.shake.c.a.d pvM;
  private com.tencent.mm.plugin.shake.d.a.o pvN;
  private n pvO;
  com.tencent.mm.pluginsdk.e.d pvP;
  private bp.a pvQ;
  private com.tencent.mm.sdk.b.c pvR;
  private bp.a pvS;
  private bp.a pvT;
  
  static
  {
    GMTrace.i(6513720557568L, 48531);
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("SHAKEITEM_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6508620283904L, 48493);
        String[] arrayOfString = e.gMz;
        GMTrace.o(6508620283904L, 48493);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("SHAKEMSG_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6507143888896L, 48482);
        String[] arrayOfString = g.gMz;
        GMTrace.o(6507143888896L, 48482);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("SHAKETVHISTORY_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6503654227968L, 48456);
        String[] arrayOfString = com.tencent.mm.plugin.shake.d.a.o.gMz;
        GMTrace.o(6503654227968L, 48456);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("SHAKENEWYEARFRIENDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6513988993024L, 48533);
        String[] arrayOfString = k.gMz;
        GMTrace.o(6513988993024L, 48533);
        return arrayOfString;
      }
    });
    GMTrace.o(6513720557568L, 48531);
  }
  
  public m()
  {
    GMTrace.i(6511304638464L, 48513);
    this.mHandler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.pvO = new n();
    this.pvP = new com.tencent.mm.pluginsdk.e.d()
    {
      public final j aFm()
      {
        GMTrace.i(6515733823488L, 48546);
        g localg = m.bdx();
        GMTrace.o(6515733823488L, 48546);
        return localg;
      }
      
      public final b zj(String paramAnonymousString)
      {
        GMTrace.i(6515599605760L, 48545);
        ok localok = new ok();
        localok.fMy.fut = paramAnonymousString;
        GMTrace.o(6515599605760L, 48545);
        return localok;
      }
    };
    this.kCk = new com.tencent.mm.sdk.b.c() {};
    this.pvQ = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(6507412324352L, 48484);
        m.bdv();
        if (m.bdA() != 0)
        {
          m.bdv();
          m.bdA();
          Object localObject = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
          w.v("MicroMsg.ShakeMsgMgr", "func[onResvMsg] content:" + (String)localObject);
          if (bg.mZ((String)localObject))
          {
            w.d("MicroMsg.ShakeMsgMgr", "func[onResvMsg] Msg content empty");
            GMTrace.o(6507412324352L, 48484);
            return;
          }
          localObject = bh.p((String)localObject, "sysmsg");
          int i = bg.getInt((String)((Map)localObject).get(".sysmsg.shake.$type"), 0);
          switch (i)
          {
          default: 
            w.d("MicroMsg.ShakeMsgMgr", "Unrecognized type :" + i);
            GMTrace.o(6507412324352L, 48484);
            return;
          }
          f localf = new f();
          i = bg.getInt((String)((Map)localObject).get(".sysmsg.shake.shaketv.msgtype"), 0);
          if (i == 0)
          {
            localf.field_type = 1;
            localf.field_subtype = i;
            localf.field_svrid = paramAnonymousa.hme.tvv;
            localf.field_createtime = bg.Po();
            localf.field_tag = ((String)((Map)localObject).get(".sysmsg.shake.shaketv.jumpurl"));
            localf.field_status = 0;
            localf.field_title = ((String)((Map)localObject).get(".sysmsg.shake.shaketv.title"));
            localf.field_thumburl = ((String)((Map)localObject).get(".sysmsg.shake.shaketv.iconurl"));
            localf.field_desc = ((String)((Map)localObject).get(".sysmsg.shake.shaketv.desc"));
            localf.field_reserved1 = bg.mY((String)((Map)localObject).get(".sysmsg.shake.shaketv.pid"));
            m.bdx().a(localf);
            GMTrace.o(6507412324352L, 48484);
            return;
          }
          w.w("MicroMsg.ShakeMsgMgr", "Unknown subType:" + i);
          GMTrace.o(6507412324352L, 48484);
          return;
        }
        w.w("MicroMsg.SubCoreShake", "func[onRecieveMsg] getShakeMsgMgr null");
        GMTrace.o(6507412324352L, 48484);
      }
    };
    this.ogO = new ar.a()
    {
      public final void a(ar paramAnonymousar, x paramAnonymousx)
      {
        GMTrace.i(6514794299392L, 48539);
        if ((paramAnonymousar != null) && (paramAnonymousx != null) && (paramAnonymousx.vf())) {
          m.bdw().Fw(paramAnonymousx.field_username);
        }
        GMTrace.o(6514794299392L, 48539);
      }
    };
    this.hfJ = new as.a()
    {
      public final void a(com.tencent.mm.storage.ae paramAnonymousae, as paramAnonymousas)
      {
        GMTrace.i(6504191098880L, 48460);
        if ((paramAnonymousae != null) && (com.tencent.mm.x.o.fQ(paramAnonymousae.field_username))) {
          paramAnonymousae.setUsername("");
        }
        GMTrace.o(6504191098880L, 48460);
      }
    };
    this.pvR = new com.tencent.mm.sdk.b.c() {};
    this.pvS = new bp.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(6516270694400L, 48550);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
        if ((str == null) || (str.length() == 0))
        {
          w.e("MicroMsg.SubCoreShake", "onReceiveMsg, ShakeCardEntranceMsg msgContent is null");
          GMTrace.o(6516270694400L, 48550);
          return;
        }
        m.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6502043615232L, 48444);
            m.bdB().d(str, paramAnonymousa.hme.tvv, 0);
            GMTrace.o(6502043615232L, 48444);
          }
        });
        GMTrace.o(6516270694400L, 48550);
      }
    };
    this.pvT = new bp.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(6505935929344L, 48473);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
        if ((str == null) || (str.length() == 0))
        {
          w.e("MicroMsg.SubCoreShake", "onReceiveMsg, ShakeCardRedDotMsg msgContent is null");
          GMTrace.o(6505935929344L, 48473);
          return;
        }
        m.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6508351848448L, 48491);
            m.bdB().d(str, paramAnonymousa.hme.tvv, 1);
            GMTrace.o(6508351848448L, 48491);
          }
        });
        GMTrace.o(6505935929344L, 48473);
      }
    };
    this.odK = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6511304638464L, 48513);
  }
  
  public static int bdA()
  {
    GMTrace.i(6512781033472L, 48524);
    com.tencent.mm.kernel.h.xx().wH();
    int i = i.pvy;
    GMTrace.o(6512781033472L, 48524);
    return i;
  }
  
  public static com.tencent.mm.plugin.shake.c.a.f bdB()
  {
    GMTrace.i(6513183686656L, 48527);
    com.tencent.mm.kernel.h.xx().wH();
    if (bdv().pvL == null) {
      bdv().pvL = new com.tencent.mm.plugin.shake.c.a.f();
    }
    com.tencent.mm.plugin.shake.c.a.f localf = bdv().pvL;
    GMTrace.o(6513183686656L, 48527);
    return localf;
  }
  
  public static com.tencent.mm.plugin.shake.c.a.d bdC()
  {
    GMTrace.i(6513317904384L, 48528);
    com.tencent.mm.kernel.h.xx().wH();
    if (bdv().pvM == null) {
      bdv().pvM = new com.tencent.mm.plugin.shake.c.a.d();
    }
    com.tencent.mm.plugin.shake.c.a.d locald = bdv().pvM;
    GMTrace.o(6513317904384L, 48528);
    return locald;
  }
  
  public static m bdv()
  {
    GMTrace.i(6511438856192L, 48514);
    m localm2 = (m)ap.AL().gJ("plugin.shake");
    m localm1 = localm2;
    if (localm2 == null)
    {
      localm1 = new m();
      ap.AL().a("plugin.shake", localm1);
    }
    GMTrace.o(6511438856192L, 48514);
    return localm1;
  }
  
  public static e bdw()
  {
    GMTrace.i(6511573073920L, 48515);
    com.tencent.mm.kernel.h.xx().wH();
    if (bdv().pvJ == null)
    {
      localObject = bdv();
      ap.AS();
      ((m)localObject).pvJ = new e(com.tencent.mm.x.c.yI());
    }
    Object localObject = bdv().pvJ;
    GMTrace.o(6511573073920L, 48515);
    return (e)localObject;
  }
  
  public static g bdx()
  {
    GMTrace.i(6511707291648L, 48516);
    com.tencent.mm.kernel.h.xx().wH();
    if (bdv().pvK == null)
    {
      localObject = bdv();
      ap.AS();
      ((m)localObject).pvK = new g(com.tencent.mm.x.c.yI());
    }
    Object localObject = bdv().pvK;
    GMTrace.o(6511707291648L, 48516);
    return (g)localObject;
  }
  
  public static com.tencent.mm.plugin.shake.d.a.o bdy()
  {
    GMTrace.i(6511841509376L, 48517);
    com.tencent.mm.kernel.h.xx().wH();
    if (bdv().pvN == null)
    {
      localObject = bdv();
      ap.AS();
      ((m)localObject).pvN = new com.tencent.mm.plugin.shake.d.a.o(com.tencent.mm.x.c.yI());
    }
    Object localObject = bdv().pvN;
    GMTrace.o(6511841509376L, 48517);
    return (com.tencent.mm.plugin.shake.d.a.o)localObject;
  }
  
  public static void bdz()
  {
    GMTrace.i(6512378380288L, 48521);
    bdw().bdn();
    l.MF().Mz();
    GMTrace.o(6512378380288L, 48521);
  }
  
  public static String dk(String paramString1, String paramString2)
  {
    GMTrace.i(6513049468928L, 48526);
    if ((ap.AV()) && (!bg.mZ(paramString1)))
    {
      ap.AS();
      paramString1 = String.format("%s/Sk%s_%s", new Object[] { com.tencent.mm.x.c.ze(), paramString2, com.tencent.mm.a.g.n(paramString1.getBytes()) });
      GMTrace.o(6513049468928L, 48526);
      return paramString1;
    }
    GMTrace.o(6513049468928L, 48526);
    return "";
  }
  
  public static String ka(String paramString)
  {
    GMTrace.i(6512915251200L, 48525);
    if (ap.AV())
    {
      ap.AS();
      paramString = String.format("%s/Sk_%s", new Object[] { com.tencent.mm.x.c.ze(), com.tencent.mm.a.g.n(paramString.getBytes()) });
      GMTrace.o(6512915251200L, 48525);
      return paramString;
    }
    GMTrace.o(6512915251200L, 48525);
    return "";
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(6512512598016L, 48522);
    com.tencent.mm.pluginsdk.l.a.sRl = new h();
    ap.AS();
    com.tencent.mm.x.c.yQ().b(this.hfJ);
    com.tencent.mm.sdk.b.a.uLm.b(this.kCk);
    com.tencent.mm.sdk.b.a.uLm.b(this.pvR);
    com.tencent.mm.sdk.b.a.uLm.b(this.pvO);
    com.tencent.mm.sdk.b.a.uLm.b(this.odK);
    ap.AS();
    com.tencent.mm.x.c.yL().a(this.ogO);
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6502312050688L, 48446);
        if (!ap.AV())
        {
          GMTrace.o(6502312050688L, 48446);
          return;
        }
        ap.AS();
        bg.d(com.tencent.mm.x.c.ze(), "Sk", 604800000L);
        GMTrace.o(6502312050688L, 48446);
      }
      
      public final String toString()
      {
        GMTrace.i(6502446268416L, 48447);
        String str = super.toString() + "|onAccountPostReset";
        GMTrace.o(6502446268416L, 48447);
        return str;
      }
    });
    ap.getSysCmdMsgExtension().a("shake", this.pvQ, true);
    ap.getSysCmdMsgExtension().a("ShakeCardEntrance", this.pvS, true);
    ap.getSysCmdMsgExtension().a("ShakeCardRedDot", this.pvT, true);
    this.pvL = null;
    this.pvM = null;
    GMTrace.o(6512512598016L, 48522);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6512646815744L, 48523);
    GMTrace.o(6512646815744L, 48523);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6512244162560L, 48520);
    if ((paramInt & 0x100) != 0) {
      bdz();
    }
    GMTrace.o(6512244162560L, 48520);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6511975727104L, 48518);
    ap.AS();
    com.tencent.mm.x.c.yQ().c(this.hfJ);
    com.tencent.mm.sdk.b.a.uLm.c(this.kCk);
    com.tencent.mm.sdk.b.a.uLm.c(this.pvR);
    com.tencent.mm.sdk.b.a.uLm.c(this.pvO);
    com.tencent.mm.sdk.b.a.uLm.c(this.odK);
    ap.AS();
    com.tencent.mm.x.c.yL().b(this.ogO);
    ap.getSysCmdMsgExtension().b("shake", this.pvQ, true);
    ap.getSysCmdMsgExtension().b("ShakeCardEntrance", this.pvS, true);
    ap.getSysCmdMsgExtension().b("ShakeCardRedDot", this.pvT, true);
    com.tencent.mm.pluginsdk.l.a.sRl = null;
    GMTrace.o(6511975727104L, 48518);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(6512109944832L, 48519);
    HashMap localHashMap = gBa;
    GMTrace.o(6512109944832L, 48519);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */