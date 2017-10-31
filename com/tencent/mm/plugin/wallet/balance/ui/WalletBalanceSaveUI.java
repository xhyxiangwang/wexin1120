package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet.balance.a.c;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.ui.g;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.a;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.wallet_core.c.o;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;

@com.tencent.mm.ui.base.a(3)
public class WalletBalanceSaveUI
  extends WalletBaseUI
{
  private final int ije;
  protected WalletFormView kNI;
  private View krg;
  protected Button lsT;
  public double oWT;
  private ArrayList<Bankcard> rCk;
  protected Bankcard rCl;
  private String rCm;
  public WalletFormView rCo;
  
  public WalletBalanceSaveUI()
  {
    GMTrace.i(7707050377216L, 57422);
    this.ije = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 270);
    GMTrace.o(7707050377216L, 57422);
  }
  
  private void ar()
  {
    GMTrace.i(7707855683584L, 57428);
    if (this.rCo != null)
    {
      if (this.rCl != null)
      {
        this.rCo.setText(getString(R.l.eSw, new Object[] { this.rCl.field_bankName, this.rCl.field_bankcardTail }));
        this.rCo.uN(this.rCl.field_bankcardTypeName);
        String str = this.rCl.field_avail_save_wording;
        if (this.rCo.oSW == null)
        {
          w.e("MicroMsg.WalletBalanceSaveUI", "why layout is null !!!???");
          GMTrace.o(7707855683584L, 57428);
          return;
        }
        if (!bg.mZ(str))
        {
          this.rCo.oSW.setText(this.rCl.field_avail_save_wording);
          GMTrace.o(7707855683584L, 57428);
          return;
        }
        w.i("MicroMsg.WalletBalanceSaveUI", "hy: wording's missing. use default");
        this.rCo.oSW.setText("");
        GMTrace.o(7707855683584L, 57428);
        return;
      }
      this.rCo.setText(this.rCm);
      if (this.rCo.oSW != null) {
        this.rCo.oSW.setText("");
      }
      this.rCo.uN(getString(R.l.eSv));
    }
    GMTrace.o(7707855683584L, 57428);
  }
  
  private void buQ()
  {
    GMTrace.i(7707318812672L, 57424);
    com.tencent.mm.plugin.wallet.a.p.bvm();
    Object localObject = com.tencent.mm.plugin.wallet.a.p.bvn();
    this.rCk = ((ae)localObject).bxk();
    this.rCl = ((ae)localObject).a(this.rCk, null, false, true);
    int i;
    if ((this.rCl != null) && (bg.mZ(this.rCl.field_forbidWord)))
    {
      this.rCl = null;
      i = 0;
    }
    for (;;)
    {
      if (i < this.rCk.size())
      {
        if ((this.rCk.get(i) != null) && (bg.mZ(((Bankcard)this.rCk.get(i)).field_forbidWord))) {
          this.rCl = ((Bankcard)this.rCk.get(i));
        }
      }
      else
      {
        if ((this.rCl != null) && (!bg.mZ(this.rCl.field_forbidWord))) {
          this.rCl = null;
        }
        localObject = this.rCk;
        if (localObject == null) {
          break;
        }
        i = 0;
        while (i < ((ArrayList)localObject).size())
        {
          w.v("MicroMsg.WalletBalanceSaveUI", "pos %s word %s", new Object[] { Integer.valueOf(i), ((Bankcard)((ArrayList)localObject).get(i)).field_forbidWord });
          i += 1;
        }
      }
      i += 1;
    }
    GMTrace.o(7707318812672L, 57424);
  }
  
  protected final void MH()
  {
    GMTrace.i(7707721465856L, 57427);
    oC(R.l.eSB);
    this.krg = findViewById(R.h.csq);
    this.kNI = ((WalletFormView)findViewById(R.h.cdq));
    com.tencent.mm.wallet_core.ui.formview.a.e(this.kNI);
    this.kNI.jpp.setText(s.ciV());
    e(this.kNI, 2, false);
    this.lsT = ((Button)findViewById(R.h.cgl));
    this.lsT.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7726511947776L, 57567);
        WalletBalanceSaveUI.this.oWT = bg.getDouble(WalletBalanceSaveUI.this.kNI.getText(), 0.0D);
        if ((WalletBalanceSaveUI.this.oWT > 0.0D) && (WalletBalanceSaveUI.this.kNI.QR()))
        {
          WalletBalanceSaveUI.this.buZ();
          GMTrace.o(7726511947776L, 57567);
          return;
        }
        t.makeText(WalletBalanceSaveUI.this.vov.voR, R.l.eSA, 0).show();
        GMTrace.o(7726511947776L, 57567);
      }
    });
    this.rCo = ((WalletFormView)findViewById(R.h.bkm));
    if (this.rCo != null)
    {
      com.tencent.mm.wallet_core.ui.formview.a.g(this.rCo);
      this.rCo.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7724230246400L, 57550);
          paramAnonymousView = WalletBalanceSaveUI.this.vov.voR;
          ArrayList localArrayList = WalletBalanceSaveUI.a(WalletBalanceSaveUI.this);
          String str = WalletBalanceSaveUI.b(WalletBalanceSaveUI.this);
          Bankcard localBankcard = WalletBalanceSaveUI.this.rCl;
          h.a local1 = new h.a()
          {
            public final void sQ(int paramAnonymous2Int)
            {
              GMTrace.i(7725303988224L, 57558);
              if ((WalletBalanceSaveUI.a(WalletBalanceSaveUI.this) == null) || (paramAnonymous2Int < 0) || (paramAnonymous2Int >= WalletBalanceSaveUI.a(WalletBalanceSaveUI.this).size())) {}
              for (WalletBalanceSaveUI.this.rCl = null;; WalletBalanceSaveUI.this.rCl = ((Bankcard)WalletBalanceSaveUI.a(WalletBalanceSaveUI.this).get(paramAnonymous2Int)))
              {
                if ((WalletBalanceSaveUI.this.rCl != null) && (!bg.mZ(WalletBalanceSaveUI.this.rCl.field_forbidWord)))
                {
                  h.a(WalletBalanceSaveUI.this.vov.voR, WalletBalanceSaveUI.this.getString(R.l.eSz), "", WalletBalanceSaveUI.this.getString(R.l.dwr), new DialogInterface.OnClickListener()
                  {
                    public final void onClick(DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(7727048818688L, 57571);
                      GMTrace.o(7727048818688L, 57571);
                    }
                  });
                  WalletBalanceSaveUI.this.rCl = null;
                }
                WalletBalanceSaveUI.c(WalletBalanceSaveUI.this);
                GMTrace.o(7725303988224L, 57558);
                return;
              }
            }
          };
          g.a(paramAnonymousView, localArrayList, str, paramAnonymousView.getString(R.l.eSC), localBankcard, local1);
          GMTrace.o(7724230246400L, 57550);
        }
      });
    }
    this.nzs = new com.tencent.mm.wallet_core.ui.a()
    {
      public final void gS(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18390378872832L, 137019);
        if (paramAnonymousBoolean)
        {
          WalletBalanceSaveUI.d(WalletBalanceSaveUI.this);
          GMTrace.o(18390378872832L, 137019);
          return;
        }
        WalletBalanceSaveUI.e(WalletBalanceSaveUI.this).scrollTo(0, 0);
        GMTrace.o(18390378872832L, 137019);
      }
    };
    GMTrace.o(7707721465856L, 57427);
  }
  
  protected final int Qb()
  {
    GMTrace.i(7708124119040L, 57430);
    GMTrace.o(7708124119040L, 57430);
    return 1;
  }
  
  public void buZ()
  {
    GMTrace.i(7707989901312L, 57429);
    if (this.rCl != null)
    {
      l(new c(this.oWT, "CNY", this.rCl.field_bindSerial, this.rCl.field_bankcardType));
      GMTrace.o(7707989901312L, 57429);
      return;
    }
    l(new c(this.oWT, "CNY", "", ""));
    GMTrace.o(7707989901312L, 57429);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7707184594944L, 57423);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramk instanceof c)) {
        break label275;
      }
      Object localObject = (c)paramk;
      boolean bool;
      if ("1".equals(((c)localObject).fQq))
      {
        w.i("MicroMsg.WalletBalanceSaveUI", "need realname verify");
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceSaveUI");
        paramString.putString("realname_verify_process_jump_plugin", "wallet");
        String str = ((c)localObject).fQr;
        str = ((c)localObject).fQs;
        localObject = ((c)localObject).fQt;
        aMd();
        bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString, 0);
      }
      while (bool)
      {
        GMTrace.o(7707184594944L, 57423);
        return false;
        if ("2".equals(((c)localObject).fQq))
        {
          w.i("MicroMsg.WalletBalanceSaveUI", "need upload credit");
          bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, ((c)localObject).fQr, ((c)localObject).fQu, ((c)localObject).fQs, ((c)localObject).fQt, aMd(), null);
        }
        else
        {
          w.i("MicroMsg.WalletBalanceSaveUI", "realnameGuideFlag =  " + ((c)localObject).fQq);
          bool = false;
        }
      }
      paramk = ((c)paramk).fCP;
      if (this.rCl != null) {
        break label264;
      }
      paramString = "";
      f.a(this, paramString, paramk, "", 11, 1);
    }
    for (;;)
    {
      GMTrace.o(7707184594944L, 57423);
      return false;
      label264:
      paramString = this.rCl.field_bindSerial;
      break;
      label275:
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m))
      {
        buQ();
        ar();
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7707453030400L, 57425);
    int i = R.i.dhU;
    GMTrace.o(7707453030400L, 57425);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7707587248128L, 57426);
    super.onCreate(paramBundle);
    if (!com.tencent.mm.x.m.zS()) {
      b(new com.tencent.mm.plugin.wallet_core.b.m(null, 3), false);
    }
    buQ();
    this.rCm = getString(R.l.eSy);
    MH();
    ar();
    o.eK(3, 0);
    GMTrace.o(7707587248128L, 57426);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceSaveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */