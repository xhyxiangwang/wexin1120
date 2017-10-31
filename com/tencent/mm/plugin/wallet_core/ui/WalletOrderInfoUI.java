package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.wallet_core.b.n;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import com.tencent.mm.x.ag.b.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoUI
  extends WalletBaseUI
{
  private String onw;
  private Orders rGT;
  protected ag.b.a rVC;
  
  public WalletOrderInfoUI()
  {
    GMTrace.i(6920534491136L, 51562);
    this.rVC = new ag.b.a()
    {
      public final void p(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6926842724352L, 51609);
        ap.AS();
        x localx = c.yL().SL(paramAnonymousString);
        w.d("MicroMsg.WalletOrderInfoUI", "call back from contactServer " + paramAnonymousString + " succ: " + paramAnonymousBoolean);
        WalletOrderInfoUI.this.K(localx);
        GMTrace.o(6926842724352L, 51609);
      }
    };
    GMTrace.o(6920534491136L, 51562);
  }
  
  protected static String d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(6921876668416L, 51572);
    for (;;)
    {
      try
      {
        paramString5 = URLEncoder.encode(URLEncoder.encode(paramString5, "utf-8"), "utf-8");
        if ((paramString1.indexOf("%7Breqkey%7D") <= 0) && (paramString1.indexOf("%7Btransid%7D") <= 0) && (paramString1.indexOf("%7Bphone%7D") <= 0) && (paramString1.indexOf("%7Bremark%7D") <= 0)) {
          continue;
        }
        w.i("MicroMsg.WalletOrderInfoUI", "concat url 1: ");
        paramString2 = paramString1.replace("%7Breqkey%7D", paramString2).replace("%7Btransid%7D", paramString3).replace("%7Bphone%7D", paramString4).replace("%7Bremark%7D", paramString5);
        paramString1 = paramString2;
      }
      catch (Exception paramString2)
      {
        w.printErrStackTrace("MicroMsg.WalletOrderInfoUI", paramString2, "", new Object[0]);
        continue;
      }
      GMTrace.o(6921876668416L, 51572);
      return paramString1;
      if ((paramString1.indexOf("{reqkey}") > 0) || (paramString1.indexOf("{transid}") > 0) || (paramString1.indexOf("{phone}") > 0) || (paramString1.indexOf("{remark}") > 0))
      {
        w.i("MicroMsg.WalletOrderInfoUI", "concat url 2: ");
        paramString2 = paramString1.replace("{reqkey}", paramString2).replace("{transid}", paramString3).replace("{phone}", paramString4).replace("{remark}", paramString5);
        paramString1 = paramString2;
      }
      else
      {
        w.i("MicroMsg.WalletOrderInfoUI", "concat url 3: ");
        paramString2 = paramString1 + String.format("?reqkey=%s&transid=%s&phone=%s&remark=%s", new Object[] { paramString2, paramString3, paramString4, paramString5 });
        paramString1 = paramString2;
      }
    }
  }
  
  private void d(Orders paramOrders)
  {
    GMTrace.i(6921608232960L, 51570);
    w.k("MicroMsg.WalletOrderInfoUI", "goToOrderInfoUI, is_use_new_paid_succ_page: %d", new Object[] { Integer.valueOf(paramOrders.rPt) });
    if (paramOrders.rPt == 1) {
      cjm().c(this, WalletOrderInfoNewUI.class, this.un);
    }
    for (;;)
    {
      finish();
      GMTrace.o(6921608232960L, 51570);
      return;
      cjm().c(this, WalletOrderInfoOldUI.class, this.un);
    }
  }
  
  public void JI(String paramString)
  {
    GMTrace.i(6921339797504L, 51568);
    l(new n(paramString));
    GMTrace.o(6921339797504L, 51568);
  }
  
  protected void K(x paramx)
  {
    GMTrace.i(6921742450688L, 51571);
    if ((paramx != null) && ((int)paramx.gLS != 0))
    {
      String str = paramx.vp();
      w.d("MicroMsg.WalletOrderInfoUI", "call back from contactServer nickName " + str + " username: " + paramx.field_username);
      if ((this.rGT.rPj != null) && (this.rGT.rPj.size() > 0))
      {
        paramx = this.rGT.rPj.iterator();
        while (paramx.hasNext()) {
          ((Orders.Commodity)paramx.next()).orj = str;
        }
      }
    }
    GMTrace.o(6921742450688L, 51571);
  }
  
  protected boolean aZY()
  {
    GMTrace.i(6920937144320L, 51565);
    GMTrace.o(6920937144320L, 51565);
    return true;
  }
  
  protected Orders bxK()
  {
    GMTrace.i(6921071362048L, 51566);
    Orders localOrders = (Orders)this.un.getParcelable("key_orders");
    GMTrace.o(6921071362048L, 51566);
    return localOrders;
  }
  
  protected void ce(String paramString, int paramInt)
  {
    GMTrace.i(6921474015232L, 51569);
    l(new n(paramString, paramInt));
    GMTrace.o(6921474015232L, 51569);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6922010886144L, 51573);
    if (((paramk instanceof n)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      this.rGT = ((n)paramk).rKR;
      if (this.rGT != null) {
        if ((this.rGT.rPj != null) && (this.rGT.rPj.size() != 0))
        {
          paramString = (Orders.Commodity)this.rGT.rPj.get(0);
          this.onw = paramString.fKK;
          w.d("MicroMsg.WalletOrderInfoUI", "Coomdity:" + paramString.toString());
          ap.AS();
          paramk = c.yL().SL(paramString.orj);
          if ((paramk != null) && ((int)paramk.gLS != 0)) {
            K(paramk);
          }
        }
        else
        {
          d(this.rGT);
        }
      }
      for (;;)
      {
        GMTrace.o(6922010886144L, 51573);
        return true;
        ag.a.hfr.a(paramString.orj, "", this.rVC);
        break;
        w.e("MicroMsg.WalletOrderInfoUI", "cannot get orders");
        h.a(this.vov.voR, R.l.eVU, 0, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6924695240704L, 51593);
            WalletOrderInfoUI.this.finish();
            GMTrace.o(6924695240704L, 51593);
          }
        });
      }
    }
    GMTrace.o(6922010886144L, 51573);
    return false;
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(6921205579776L, 51567);
    int i = R.i.dhc;
    GMTrace.o(6921205579776L, 51567);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6920668708864L, 51563);
    super.onCreate(paramBundle);
    if (aZY())
    {
      this.rGT = bxK();
      this.onw = this.un.getString("key_trans_id");
      int i = this.un.getInt("key_pay_type", -1);
      w.i("MicroMsg.WalletOrderInfoUI", "mTransId %s", new Object[] { this.onw });
      if (this.onw != null)
      {
        if (i == -1)
        {
          JI(this.onw);
          GMTrace.o(6920668708864L, 51563);
          return;
        }
        ce(this.onw, i);
        GMTrace.o(6920668708864L, 51563);
        return;
      }
      if (this.rGT != null) {
        d(this.rGT);
      }
    }
    GMTrace.o(6920668708864L, 51563);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6920802926592L, 51564);
    super.onDestroy();
    if ((this.rGT != null) && (!bg.mZ(this.rGT.username))) {
      ag.a.hfr.gt(this.rGT.username);
    }
    GMTrace.o(6920802926592L, 51564);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */