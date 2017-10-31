package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.bl;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.g.a.sl;
import com.tencent.mm.plugin.wallet_core.c.f;
import com.tencent.mm.plugin.wallet_core.c.g;
import com.tencent.mm.plugin.wallet_core.c.i;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class m
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private bp.a rQA;
  private o rQi;
  private ae rQj;
  private j rQk;
  private com.tencent.mm.plugin.wallet_core.c.c rQl;
  private y rQm;
  private ab rQn;
  private com.tencent.mm.plugin.wallet_core.c.a rQo;
  private f rQp;
  private com.tencent.mm.plugin.wallet_core.c.d rQq;
  private s rQr;
  private com.tencent.mm.plugin.wallet_core.c.e rQs;
  private i rQt;
  private com.tencent.mm.plugin.wallet_core.c.h rQu;
  private g rQv;
  private com.tencent.mm.plugin.wallet_core.id_verify.util.a rQw;
  private com.tencent.mm.sdk.b.c rQx;
  private com.tencent.mm.sdk.b.c rQy;
  private com.tencent.mm.sdk.b.c<sl> rQz;
  
  static
  {
    GMTrace.i(6876645294080L, 51235);
    com.tencent.mm.compatible.util.k.b("tenpay_utils", m.class.getClassLoader());
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("WALLET_USER_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6864163045376L, 51142);
        String[] arrayOfString = j.gMz;
        GMTrace.o(6864163045376L, 51142);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("WALLET_BANKCARD_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6907918024704L, 51468);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.c.c.gMz;
        GMTrace.o(6907918024704L, 51468);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("LOAN_ENTRY_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6870337060864L, 51188);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.c.a.gMz;
        GMTrace.o(6870337060864L, 51188);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("WALLET_KIND_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6903354621952L, 51434);
        String[] arrayOfString = f.gMz;
        GMTrace.o(6903354621952L, 51434);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("WALLET_BULLETIN_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6904965234688L, 51446);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.c.d.gMz;
        GMTrace.o(6904965234688L, 51446);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("WALLET_PREF_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6867115835392L, 51164);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.c.h.gMz;
        GMTrace.o(6867115835392L, 51164);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("WALLET_FUNCTIOIN_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6867921141760L, 51170);
        String[] arrayOfString = com.tencent.mm.plugin.wallet_core.c.e.gMz;
        GMTrace.o(6867921141760L, 51170);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("WALLET_GREY_ITEM_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(6877584818176L, 51242);
        String[] arrayOfString = i.gMz;
        GMTrace.o(6877584818176L, 51242);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("WALLET_LUKCY_MONEY".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(18041949650944L, 134423);
        String[] arrayOfString = g.gMz;
        GMTrace.o(18041949650944L, 134423);
        return arrayOfString;
      }
    });
    GMTrace.o(6876645294080L, 51235);
  }
  
  public m()
  {
    GMTrace.i(6873558286336L, 51212);
    this.rQi = new o();
    this.rQj = null;
    this.rQk = null;
    this.rQl = null;
    this.rQm = null;
    this.rQn = null;
    this.rQo = null;
    this.rQp = null;
    this.rQq = null;
    this.rQr = new s();
    this.rQs = null;
    this.rQt = null;
    this.rQu = null;
    this.rQv = null;
    this.rQw = new com.tencent.mm.plugin.wallet_core.id_verify.util.a();
    this.rQx = new com.tencent.mm.sdk.b.c() {};
    this.rQy = new com.tencent.mm.sdk.b.c() {};
    this.rQz = new com.tencent.mm.sdk.b.c() {};
    this.rQA = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(18040875909120L, 134415);
        paramAnonymousa = bh.p(com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq), "sysmsg");
        if (paramAnonymousa == null)
        {
          GMTrace.o(18040875909120L, 134415);
          return;
        }
        int i = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.PayMsgType"), -1);
        w.i("MicroMsg.SubCoreNfc", "got a pay msg, type = " + i);
        switch (i)
        {
        }
        for (;;)
        {
          GMTrace.o(18040875909120L, 134415);
          return;
          i = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.WalletType"), -1);
          w.i("MicroMsg.SubCoreNfc", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=" + i);
          if (i >= 0)
          {
            ap.AS();
            com.tencent.mm.x.c.xi().set(339975, Integer.valueOf(i));
            GMTrace.o(18040875909120L, 134415);
            return;
            i = bg.getInt((String)paramAnonymousa.get(".sysmsg.paymsg.Flag"), 0);
            w.i("MicroMsg.SubCoreNfc", "MSG_TYPE_WALLET_TYPE_CHANGE,wallet_type=" + i);
            if (i == 1)
            {
              w.i("MicroMsg.SubCoreNfc", "open wallet");
              com.tencent.mm.x.m.zP();
              GMTrace.o(18040875909120L, 134415);
              return;
            }
            if (i == 2)
            {
              w.i("MicroMsg.SubCoreNfc", "close wallet");
              i = com.tencent.mm.x.m.zL();
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xz().xi().set(40, Integer.valueOf(i & 0xFFFF7FFF));
            }
          }
        }
      }
    };
    GMTrace.o(6873558286336L, 51212);
  }
  
  public static boolean a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.b paramb, a.a parama)
  {
    GMTrace.i(6876376858624L, 51233);
    boolean bool = bwz().rQw.a(paramMMActivity, 2, paramb, parama, false, 1008, true);
    GMTrace.o(6876376858624L, 51233);
    return bool;
  }
  
  public static boolean b(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.b paramb, a.a parama)
  {
    GMTrace.i(6876511076352L, 51234);
    boolean bool = bwz().rQw.a(paramMMActivity, 4, paramb, parama, false, 1006, false);
    GMTrace.o(6876511076352L, 51234);
    return bool;
  }
  
  public static j bwA()
  {
    GMTrace.i(6873960939520L, 51215);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQk == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQk = new j(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQk;
    GMTrace.o(6873960939520L, 51215);
    return (j)localObject;
  }
  
  public static g bwB()
  {
    GMTrace.i(6874095157248L, 51216);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQv == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQv = new g(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQv;
    GMTrace.o(6874095157248L, 51216);
    return (g)localObject;
  }
  
  public static com.tencent.mm.plugin.wallet_core.c.c bwC()
  {
    GMTrace.i(6874229374976L, 51217);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQl == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQl = new com.tencent.mm.plugin.wallet_core.c.c(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQl;
    GMTrace.o(6874229374976L, 51217);
    return (com.tencent.mm.plugin.wallet_core.c.c)localObject;
  }
  
  public static com.tencent.mm.plugin.wallet_core.c.h bwD()
  {
    GMTrace.i(6874363592704L, 51218);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQu == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQu = new com.tencent.mm.plugin.wallet_core.c.h(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQu;
    GMTrace.o(6874363592704L, 51218);
    return (com.tencent.mm.plugin.wallet_core.c.h)localObject;
  }
  
  public static ae bwE()
  {
    GMTrace.i(6874497810432L, 51219);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQj == null) {
      bwz().rQj = new ae();
    }
    ae localae = bwz().rQj;
    GMTrace.o(6874497810432L, 51219);
    return localae;
  }
  
  public static ab bwF()
  {
    GMTrace.i(6874632028160L, 51220);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQn == null) {
      bwz().rQn = new ab();
    }
    ab localab = bwz().rQn;
    GMTrace.o(6874632028160L, 51220);
    return localab;
  }
  
  public static com.tencent.mm.plugin.wallet_core.c.a bwG()
  {
    GMTrace.i(6874766245888L, 51221);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQo == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQo = new com.tencent.mm.plugin.wallet_core.c.a(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQo;
    GMTrace.o(6874766245888L, 51221);
    return (com.tencent.mm.plugin.wallet_core.c.a)localObject;
  }
  
  public static f bwH()
  {
    GMTrace.i(6874900463616L, 51222);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQp == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQp = new f(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQp;
    GMTrace.o(6874900463616L, 51222);
    return (f)localObject;
  }
  
  public static com.tencent.mm.plugin.wallet_core.c.d bwI()
  {
    GMTrace.i(6875034681344L, 51223);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQq == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQq = new com.tencent.mm.plugin.wallet_core.c.d(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQq;
    GMTrace.o(6875034681344L, 51223);
    return (com.tencent.mm.plugin.wallet_core.c.d)localObject;
  }
  
  public static com.tencent.mm.plugin.wallet_core.c.e bwJ()
  {
    GMTrace.i(6875168899072L, 51224);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQs == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQs = new com.tencent.mm.plugin.wallet_core.c.e(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQs;
    GMTrace.o(6875168899072L, 51224);
    return (com.tencent.mm.plugin.wallet_core.c.e)localObject;
  }
  
  public static i bwK()
  {
    GMTrace.i(6875303116800L, 51225);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (bwz().rQt == null)
    {
      localObject = bwz();
      ap.AS();
      ((m)localObject).rQt = new i(com.tencent.mm.x.c.yI());
    }
    Object localObject = bwz().rQt;
    GMTrace.o(6875303116800L, 51225);
    return (i)localObject;
  }
  
  public static y bwL()
  {
    GMTrace.i(6875705769984L, 51228);
    y localy = bwz().rQm;
    GMTrace.o(6875705769984L, 51228);
    return localy;
  }
  
  public static o bwM()
  {
    GMTrace.i(6876242640896L, 51232);
    o localo = bwz().rQi;
    GMTrace.o(6876242640896L, 51232);
    return localo;
  }
  
  public static m bwz()
  {
    GMTrace.i(6873692504064L, 51213);
    m localm2 = (m)ap.AL().gJ("plugin.wallet_core");
    m localm1 = localm2;
    if (localm2 == null)
    {
      w.w("MicroMsg.SubCoreNfc", "[NFC]not found in MMCore, new one");
      localm1 = new m();
      ap.AL().a("plugin.wallet_core", localm1);
    }
    GMTrace.o(6873692504064L, 51213);
    return localm1;
  }
  
  public static void s(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(6876108423168L, 51231);
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    if (com.tencent.mm.x.m.zT())
    {
      localIntent.setFlags(536870912);
      w.i("MicroMsg.SubCoreNfc", "entryWalletIndexPage wallet type is h5,jump to ibg");
      com.tencent.mm.bi.d.b(paramContext, "wallet_core", ".ui.ibg.WalletIbgAdapterUI", localIntent);
      GMTrace.o(6876108423168L, 51231);
      return;
    }
    if (com.tencent.mm.x.m.zU())
    {
      localIntent.setFlags(536870912);
      com.tencent.mm.bi.d.b(paramContext, "mall", ".ui.MallIndexOSUI", localIntent);
      GMTrace.o(6876108423168L, 51231);
      return;
    }
    w.i("MicroMsg.SubCoreNfc", "entryWalletIndexPage wallet type is native");
    localIntent.setFlags(536870912);
    com.tencent.mm.bi.d.b(paramContext, "mall", ".ui.MallIndexUI", localIntent);
    ap.AS();
    if (com.tencent.mm.x.c.isSDCardAvailable())
    {
      paramContext = new com.tencent.mm.av.k(11);
      ap.wT().a(paramContext, 0);
    }
    GMTrace.o(6876108423168L, 51231);
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(6875839987712L, 51229);
    com.tencent.mm.wallet_core.c.a.ciD();
    com.tencent.mm.wallet_core.c.a.init(com.tencent.mm.sdk.platformtools.ab.getContext());
    ap.getSysCmdMsgExtension().a("paymsg", this.rQA, true);
    bwE().bxh();
    this.rQm = y.bwO();
    y localy = this.rQm;
    ap.getSysCmdMsgExtension().a("paymsg", localy.kJS, true);
    com.tencent.mm.sdk.b.a.uLm.b(this.rQx);
    com.tencent.mm.sdk.b.a.uLm.b(this.rQr);
    com.tencent.mm.sdk.b.a.uLm.a(this.rQy);
    com.tencent.mm.sdk.b.a.uLm.a(this.rQz);
    GMTrace.o(6875839987712L, 51229);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6875571552256L, 51227);
    GMTrace.o(6875571552256L, 51227);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6875437334528L, 51226);
    GMTrace.o(6875437334528L, 51226);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6875974205440L, 51230);
    ap.getSysCmdMsgExtension().b("paymsg", this.rQA, true);
    bwE().axG();
    Object localObject = bwF();
    ((ab)localObject).rRm = null;
    ((ab)localObject).rRl.clear();
    ((ab)localObject).rRl = new ArrayList();
    localObject = this.rQm;
    ap.getSysCmdMsgExtension().b("paymsg", ((y)localObject).kJS, true);
    if (y.lHv != null) {
      y.lHv.clear();
    }
    this.rQm = null;
    com.tencent.mm.sdk.b.a.uLm.c(this.rQx);
    com.tencent.mm.sdk.b.a.uLm.c(this.rQr);
    com.tencent.mm.sdk.b.a.uLm.c(this.rQy);
    com.tencent.mm.sdk.b.a.uLm.c(this.rQz);
    GMTrace.o(6875974205440L, 51230);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(6873826721792L, 51214);
    HashMap localHashMap = gBa;
    GMTrace.o(6873826721792L, 51214);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */