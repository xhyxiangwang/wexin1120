package com.tencent.mm.plugin.order.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.plugin.order.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;
import com.tencent.mm.wallet_core.ui.c;
import java.util.List;

public class MallOrderTransactionInfoUI
  extends WalletPreferenceUI
{
  protected com.tencent.mm.ui.base.preference.f jqf;
  private int oto;
  private MallTransactionObject otp;
  private c otq;
  
  public MallOrderTransactionInfoUI()
  {
    GMTrace.i(6651293728768L, 49556);
    this.otp = null;
    GMTrace.o(6651293728768L, 49556);
  }
  
  private Bundle aVq()
  {
    GMTrace.i(6652367470592L, 49564);
    Bundle localBundle2 = com.tencent.mm.wallet_core.a.Z(this);
    Bundle localBundle1 = localBundle2;
    if (localBundle2 == null) {
      localBundle1 = new Bundle();
    }
    GMTrace.o(6652367470592L, 49564);
    return localBundle1;
  }
  
  protected final void MH()
  {
    GMTrace.i(6651562164224L, 49558);
    oC(R.l.enJ);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6650891075584L, 49553);
        MallOrderTransactionInfoUI.this.finish();
        GMTrace.o(6650891075584L, 49553);
        return false;
      }
    });
    this.jqf = this.vOv;
    this.otq = new c(this);
    this.otq.init();
    GMTrace.o(6651562164224L, 49558);
  }
  
  public final int QD()
  {
    GMTrace.i(6651964817408L, 49561);
    int i = R.o.fhP;
    GMTrace.o(6651964817408L, 49561);
    return i;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    GMTrace.i(6652099035136L, 49562);
    GMTrace.o(6652099035136L, 49562);
    return false;
  }
  
  public final boolean f(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6652233252864L, 49563);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.order.model.h))
      {
        paramString = ((com.tencent.mm.plugin.order.model.h)paramk).orP;
        if (paramString != null)
        {
          this.otp = paramString.oqE;
          this.jqf.removeAll();
          ActionBarActivity localActionBarActivity = this.vov.voR;
          com.tencent.mm.ui.base.preference.f localf = this.jqf;
          MallTransactionObject localMallTransactionObject = this.otp;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.otq;
          if (localMallTransactionObject == null)
          {
            paramString = null;
            if (paramString != null)
            {
              paramInt1 = 0;
              while (paramInt1 < paramString.size())
              {
                paramk = (Preference)paramString.get(paramInt1);
                this.jqf.a(paramk);
                paramInt1 += 1;
              }
            }
          }
          else
          {
            switch (localMallTransactionObject.oqT)
            {
            default: 
              paramk = new com.tencent.mm.plugin.order.ui.a.a();
              paramString = paramk;
              if ((arrayOfObject[0] instanceof c)) {
                ((com.tencent.mm.plugin.order.ui.a.a)paramk).otq = ((c)arrayOfObject[0]);
              }
              break;
            }
            for (paramString = paramk;; paramString = new b())
            {
              paramString = paramString.a(localActionBarActivity, localf, localMallTransactionObject);
              break;
            }
          }
          this.jqf.notifyDataSetChanged();
        }
      }
      GMTrace.o(6652233252864L, 49563);
      return true;
    }
    GMTrace.o(6652233252864L, 49563);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6651830599680L, 49560);
    int i = R.i.cZT;
    GMTrace.o(6651830599680L, 49560);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    Object localObject1 = null;
    GMTrace.i(6651427946496L, 49557);
    super.onCreate(paramBundle);
    paramBundle = com.tencent.mm.wallet_core.a.aa(this);
    if ((paramBundle != null) && ((paramBundle instanceof com.tencent.mm.plugin.order.a.a)))
    {
      localObject1 = aVq().getString("key_trans_id");
      paramBundle = aVq().getString("bill_id");
    }
    for (;;)
    {
      if (bg.mZ((String)localObject1))
      {
        w.w("MicroMsg.mmui.MMPreference", "mOrders info is Illegal!");
        com.tencent.mm.ui.base.h.a(this.vov.voR, R.l.eVU, 0, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6640019439616L, 49472);
            MallOrderTransactionInfoUI.this.finish();
            GMTrace.o(6640019439616L, 49472);
          }
        });
      }
      this.oto = aVq().getInt("key_pay_type");
      MH();
      cjr().a(new com.tencent.mm.plugin.order.model.h((String)localObject1, paramBundle), true, 1);
      GMTrace.o(6651427946496L, 49557);
      return;
      if ((getIntent().getIntExtra("scene", 0) == 1) || (getIntent().getIntExtra("scene", 0) == 2))
      {
        localObject1 = getIntent().getStringExtra("trans_id");
        paramBundle = getIntent().getStringExtra("bill_id");
      }
      else
      {
        Object localObject2 = null;
        paramBundle = (Bundle)localObject1;
        localObject1 = localObject2;
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6651696381952L, 49559);
    super.onDestroy();
    if (this.otq != null) {
      this.otq.release();
    }
    GMTrace.o(6651696381952L, 49559);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/MallOrderTransactionInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */