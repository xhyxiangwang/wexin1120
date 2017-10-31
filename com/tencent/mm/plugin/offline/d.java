package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.kg;
import com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI;
import com.tencent.mm.plugin.wallet_core.b.h;
import com.tencent.mm.plugin.wallet_core.b.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class d
  extends com.tencent.mm.plugin.wallet_core.a.b
{
  public d()
  {
    GMTrace.i(6236829384704L, 46468);
    GMTrace.o(6236829384704L, 46468);
  }
  
  public static void e(MMActivity paramMMActivity)
  {
    GMTrace.i(16031099650048L, 119441);
    String str = ((WalletBaseUI)paramMMActivity).un.getString("key_pwd1");
    int i = ((WalletBaseUI)paramMMActivity).un.getInt("offline_add_fee", 0);
    Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.aUs();
    if (localBankcard != null) {
      ((WalletBaseUI)paramMMActivity).r(new com.tencent.mm.plugin.offline.a.k(localBankcard, str, i));
    }
    GMTrace.o(16031099650048L, 119441);
  }
  
  public final com.tencent.mm.wallet_core.d.d a(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(6237232037888L, 46471);
    if ((paramMMActivity instanceof WalletVerifyCodeUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(6255217213440L, 46605);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
            if ((paramAnonymousk instanceof m))
            {
              if ((((WalletBaseUI)this.xgA).un != null) && (((WalletBaseUI)this.xgA).un.getInt("key_bind_scene", -1) == 5) && (!com.tencent.mm.plugin.offline.c.a.aUp()))
              {
                d.e(this.xgA);
                GMTrace.o(6255217213440L, 46605);
                return true;
              }
            }
            else if ((paramAnonymousk instanceof com.tencent.mm.plugin.offline.a.k))
            {
              com.tencent.mm.wallet_core.a.i(this.xgA, ((WalletBaseUI)this.xgA).un);
              com.tencent.mm.plugin.offline.c.a.E(this.xgA);
              GMTrace.o(6255217213440L, 46605);
              return true;
            }
          }
          GMTrace.o(6255217213440L, 46605);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6255082995712L, 46604);
          paramAnonymousVarArgs = (n)paramAnonymousVarArgs[1];
          paramAnonymousVarArgs.flag = "1";
          this.xgB.a(new h(paramAnonymousVarArgs), true, 1);
          GMTrace.o(6255082995712L, 46604);
          return true;
        }
      };
      GMTrace.o(6237232037888L, 46471);
      return paramMMActivity;
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
    {
      paramMMActivity = new com.tencent.mm.wallet_core.d.d(paramMMActivity, paramf)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
        {
          GMTrace.i(6201395904512L, 46204);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousk instanceof m))
            {
              if ((((WalletBaseUI)this.xgA).un != null) && (((WalletBaseUI)this.xgA).un.getInt("key_bind_scene", -1) == 5) && (!com.tencent.mm.plugin.offline.c.a.aUp())) {
                d.e(this.xgA);
              }
              GMTrace.o(6201395904512L, 46204);
              return true;
            }
            if ((paramAnonymousk instanceof com.tencent.mm.plugin.offline.a.k))
            {
              paramAnonymousString = ((WalletBaseUI)this.xgA).un;
              paramAnonymousString.putBoolean("intent_bind_end", true);
              com.tencent.mm.wallet_core.a.i(this.xgA, paramAnonymousString);
              com.tencent.mm.plugin.offline.c.a.E(this.xgA);
              GMTrace.o(6201395904512L, 46204);
              return true;
            }
          }
          GMTrace.o(6201395904512L, 46204);
          return false;
        }
        
        public final boolean j(Object... paramAnonymousVarArgs)
        {
          GMTrace.i(6201261686784L, 46203);
          paramAnonymousVarArgs = (n)paramAnonymousVarArgs[0];
          this.xgB.a(new com.tencent.mm.plugin.wallet_core.a.a.b(paramAnonymousVarArgs), true, 1);
          GMTrace.o(6201261686784L, 46203);
          return true;
        }
      };
      GMTrace.o(6237232037888L, 46471);
      return paramMMActivity;
    }
    paramMMActivity = super.a(paramMMActivity, paramf);
    GMTrace.o(6237232037888L, 46471);
    return paramMMActivity;
  }
  
  public final String azd()
  {
    GMTrace.i(6237500473344L, 46473);
    GMTrace.o(6237500473344L, 46473);
    return "OfflineBindCardRegProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6236963602432L, 46469);
    com.tencent.mm.sdk.b.a.uLm.m(new kg());
    c(paramActivity, WalletOfflineEntranceUI.class);
    if (paramActivity != null) {
      paramActivity.finish();
    }
    GMTrace.o(6236963602432L, 46469);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    GMTrace.i(6237097820160L, 46470);
    super.c(paramActivity, paramInt);
    GMTrace.o(6237097820160L, 46470);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    GMTrace.i(6237366255616L, 46472);
    boolean bool = super.c(paramActivity, paramBundle);
    GMTrace.o(6237366255616L, 46472);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */