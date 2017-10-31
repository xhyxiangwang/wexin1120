package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class p
  implements am
{
  public int fQa;
  public int rGr;
  private o rGs;
  private com.tencent.mm.plugin.wallet_core.model.t rGt;
  private i rGu;
  private m.b rGv;
  private com.tencent.mm.plugin.messenger.foundation.a.m rGw;
  private j rGx;
  
  static
  {
    GMTrace.i(7700876361728L, 57376);
    com.tencent.mm.wallet_core.a.h("ForgotPwdProcess", com.tencent.mm.plugin.wallet.pwd.a.class);
    com.tencent.mm.wallet_core.a.h("BindCardProcess", com.tencent.mm.plugin.wallet_core.a.b.class);
    GMTrace.o(7700876361728L, 57376);
  }
  
  public p()
  {
    GMTrace.i(7699534184448L, 57366);
    this.rGr = 0;
    this.fQa = 0;
    this.rGs = new o();
    this.rGt = new com.tencent.mm.plugin.wallet_core.model.t();
    this.rGu = new i();
    this.rGv = new m.b()
    {
      public final void a(int paramAnonymousInt, com.tencent.mm.sdk.e.m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(14284255920128L, 106426);
        if (bg.m(paramAnonymousObject, 0) == 339975)
        {
          ap.AS();
          paramAnonymousInt = ((Integer)com.tencent.mm.x.c.xi().get(339975, Integer.valueOf(0))).intValue();
          if (paramAnonymousInt != p.this.rGr)
          {
            ao.bGP().reset();
            p.this.rGr = paramAnonymousInt;
          }
          GMTrace.o(14284255920128L, 106426);
          return;
        }
        if (w.a.uYH.equals(paramAnonymousObject))
        {
          ap.AS();
          paramAnonymousInt = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uYH, Integer.valueOf(0))).intValue();
          if (paramAnonymousInt != p.this.fQa)
          {
            ao.bGP().reset();
            p.this.fQa = paramAnonymousInt;
          }
        }
        GMTrace.o(14284255920128L, 106426);
      }
    };
    this.rGw = new com.tencent.mm.plugin.messenger.foundation.a.m()
    {
      public final void b(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(16563004506112L, 123404);
        String str;
        if (("paymsg".equals(paramAnonymousString)) && ("30".equals(paramAnonymousMap.get(".sysmsg.paymsg.PayMsgType"))))
        {
          int i = bg.getInt((String)paramAnonymousMap.get(".sysmsg.paymsg.WalletRedDot"), 0);
          int j = bg.getInt((String)paramAnonymousMap.get(".sysmsg.paymsg.BankCardRedDot"), 0);
          str = (String)paramAnonymousMap.get(".sysmsg.paymsg.NewTagBankSerial");
          paramAnonymousString = (String)paramAnonymousMap.get(".sysmsg.paymsg.WalletRedDotWording");
          w.i("MicroMsg.SubCoreMMWallet", "moreTabWallet: %s, walletBankCard: %s, bankSerial: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), str });
          if (i != 1) {
            break label259;
          }
          com.tencent.mm.s.c.vP().b(w.a.vda, true);
          if (j != 1) {
            break label272;
          }
          com.tencent.mm.s.c.vP().b(w.a.vdb, true);
        }
        for (;;)
        {
          if (!bg.mZ(paramAnonymousString))
          {
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.vdd, paramAnonymousString);
          }
          if (!bg.mZ(str))
          {
            ap.AS();
            paramAnonymousMap = (String)com.tencent.mm.x.c.xi().get(w.a.vde, "");
            paramAnonymousString = str;
            if (!bg.mZ(paramAnonymousMap)) {
              paramAnonymousString = paramAnonymousMap + "," + str;
            }
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.vde, paramAnonymousString);
          }
          GMTrace.o(16563004506112L, 123404);
          return;
          label259:
          com.tencent.mm.s.c.vP().b(w.a.vda, false);
          break;
          label272:
          com.tencent.mm.s.c.vP().b(w.a.vdb, false);
        }
      }
    };
    this.rGx = new j();
    File localFile = new File(com.tencent.mm.plugin.wallet_core.c.b.bxu());
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    GMTrace.o(7699534184448L, 57366);
  }
  
  public static String Hw()
  {
    GMTrace.i(7700607926272L, 57374);
    ap.AS();
    String str1 = (String)com.tencent.mm.x.c.xi().get(6, null);
    String str2 = an.Ag(str1);
    if (bg.mZ(str1))
    {
      GMTrace.o(7700607926272L, 57374);
      return "";
    }
    str1 = str1.substring(str2.length() + 1);
    GMTrace.o(7700607926272L, 57374);
    return str1;
  }
  
  public static p bvm()
  {
    GMTrace.i(7699668402176L, 57367);
    p localp2 = (p)ap.AL().gJ("plugin.wallet");
    p localp1 = localp2;
    if (localp2 == null)
    {
      w.w("MicroMsg.SubCoreMMWallet", "not found in MMCore, new one");
      localp1 = new p();
      ap.AL().a("plugin.wallet", localp1);
    }
    GMTrace.o(7699668402176L, 57367);
    return localp1;
  }
  
  public static ae bvn()
  {
    GMTrace.i(7700473708544L, 57373);
    ae localae = com.tencent.mm.plugin.wallet_core.model.m.bwE();
    GMTrace.o(7700473708544L, 57373);
    return localae;
  }
  
  public static String bvo()
  {
    GMTrace.i(7700742144000L, 57375);
    ap.AS();
    String str1 = (String)com.tencent.mm.x.c.xi().get(6, null);
    if (bg.mZ(str1))
    {
      str1 = "";
      str2 = str1;
      if (bg.mZ(str1)) {
        if (!com.tencent.mm.x.m.zS()) {
          break label78;
        }
      }
    }
    label78:
    for (String str2 = "27";; str2 = "86")
    {
      GMTrace.o(7700742144000L, 57375);
      return str2;
      str1 = an.Ag(str1.replace("+", ""));
      break;
    }
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(7700205273088L, 57371);
    ap.AS();
    this.rGr = ((Integer)com.tencent.mm.x.c.xi().get(339975, Integer.valueOf(0))).intValue();
    ap.AS();
    this.fQa = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uYH, Integer.valueOf(0))).intValue();
    ap.getSysCmdMsgExtension().a("paymsg", this.rGw);
    com.tencent.mm.sdk.b.a.uLm.b(this.rGs);
    com.tencent.mm.sdk.b.a.uLm.b(this.rGt);
    com.tencent.mm.sdk.b.a.uLm.b(this.rGu);
    this.rGx.bMz();
    ap.AS();
    com.tencent.mm.x.c.xi().a(this.rGv);
    GMTrace.o(7700205273088L, 57371);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7700071055360L, 57370);
    GMTrace.o(7700071055360L, 57370);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7699936837632L, 57369);
    GMTrace.o(7699936837632L, 57369);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7700339490816L, 57372);
    ap.getSysCmdMsgExtension().b("paymsg", this.rGw);
    com.tencent.mm.sdk.b.a.uLm.c(this.rGs);
    com.tencent.mm.sdk.b.a.uLm.c(this.rGt);
    com.tencent.mm.sdk.b.a.uLm.c(this.rGu);
    this.rGx.dead();
    ap.AS();
    com.tencent.mm.x.c.xi().b(this.rGv);
    GMTrace.o(7700339490816L, 57372);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(7699802619904L, 57368);
    GMTrace.o(7699802619904L, 57368);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */