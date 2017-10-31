package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.balance.a.a.i;
import com.tencent.mm.plugin.wallet.balance.a.a.j;
import com.tencent.mm.plugin.wallet.balance.a.a.j.c;
import com.tencent.mm.plugin.wallet.balance.a.a.k.5;
import com.tencent.mm.plugin.wallet.balance.a.a.k.6;
import com.tencent.mm.plugin.wallet.balance.a.a.k.7;
import com.tencent.mm.plugin.wallet.balance.a.a.k.8;
import com.tencent.mm.plugin.wallet.balance.a.a.l;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.protocal.c.aui;
import com.tencent.mm.protocal.c.awc;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.vending.g.b;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WalletLqtSaveFetchUI
  extends WalletLqtBasePresenterUI
{
  private Dialog iiw;
  private int mode;
  private i rBT;
  private j rBU;
  private com.tencent.mm.plugin.wallet.balance.a.a.k rDM;
  private l rDN;
  private ViewGroup rDO;
  private WalletFormView rDP;
  private TextView rDQ;
  private TextView rDR;
  private Button rDS;
  private TextView rDT;
  private ViewGroup rDU;
  private TextView rDV;
  private CheckBox rDW;
  private CharSequence rDX;
  private Bankcard rDY;
  private int rDZ;
  private String rEa;
  private String rEb;
  private long rEc;
  
  public WalletLqtSaveFetchUI()
  {
    GMTrace.i(18394673840128L, 137051);
    this.rBT = ((i)p(i.class));
    this.rBU = ((j)m(j.class));
    this.rDM = new com.tencent.mm.plugin.wallet.balance.a.a.k(this.rBT, this.rBU, this);
    this.rDN = new l(this.rDM);
    this.rEc = -1L;
    GMTrace.o(18394673840128L, 137051);
  }
  
  private static double D(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(19534853439488L, 145546);
    try
    {
      if (bg.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim())
      {
        double d = new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), 5, 2).doubleValue();
        GMTrace.o(19534853439488L, 145546);
        return d;
      }
      return 0.0D;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", paramString1, "", new Object[0]);
      GMTrace.o(19534853439488L, 145546);
    }
  }
  
  private static int dM(String paramString1, String paramString2)
  {
    GMTrace.i(19534987657216L, 145547);
    try
    {
      double d1 = bg.getDouble(paramString1, 0.0D);
      double d2 = bg.getDouble(paramString2, 0.0D);
      if (d1 == 0.0D) {
        paramString1 = "0";
      }
      paramString1 = new BigDecimal(paramString1);
      if (d2 == 0.0D) {
        paramString2 = "0";
      }
      int i = paramString1.multiply(new BigDecimal(paramString2)).intValue();
      GMTrace.o(19534987657216L, 145547);
      return i;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", paramString1, "", new Object[0]);
      GMTrace.o(19534987657216L, 145547);
    }
    return 0;
  }
  
  public final void Ey(String paramString)
  {
    GMTrace.i(18395747581952L, 137059);
    Toast.makeText(this, paramString, 1).show();
    GMTrace.o(18395747581952L, 137059);
  }
  
  public final void WM()
  {
    GMTrace.i(18395479146496L, 137057);
    if (this.iiw == null)
    {
      this.iiw = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
      GMTrace.o(18395479146496L, 137057);
      return;
    }
    this.iiw.show();
    GMTrace.o(18395479146496L, 137057);
  }
  
  public final void bva()
  {
    GMTrace.i(18395613364224L, 137058);
    if (this.iiw != null) {
      this.iiw.dismiss();
    }
    GMTrace.o(18395613364224L, 137058);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(18395344928768L, 137056);
    com.tencent.mm.plugin.wallet.balance.a.a.k localk = this.rDM;
    w.i("MicroMsg.LqtSaveFetchLogic", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk });
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m))
    {
      p.bvm();
      localk.rCa = p.bvn().rCP;
      if (localk.igB != null) {
        localk.igB.resume();
      }
    }
    boolean bool = super.d(paramInt1, paramInt2, paramString, paramk);
    GMTrace.o(18395344928768L, 137056);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18395076493312L, 137054);
    int i = R.i.diG;
    GMTrace.o(18395076493312L, 137054);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(18395210711040L, 137055);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.plugin.wallet.balance.a.a.k localk = this.rDM;
    if ((paramInt1 == com.tencent.mm.plugin.wallet.balance.a.a.k.rBR) && (paramInt2 == -1))
    {
      paramIntent = (Orders)paramIntent.getParcelableExtra("key_orders");
      if ((paramIntent != null) && (paramIntent.rPj != null) && (paramIntent.rPj.size() > 0))
      {
        w.i("MicroMsg.LqtSaveFetchLogic", "onActivityResult, doQueryPurchaseResult");
        localk.fKK = ((Orders.Commodity)paramIntent.rPj.get(0)).fKK;
        w.i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult");
        localk.rBV.WM();
        paramIntent = localk.rBU.rBN;
        com.tencent.mm.vending.g.g.a(localk.rBW, localk.fKK, Integer.valueOf(localk.rBX)).a(paramIntent).d(new k.6(localk)).a(new k.5(localk));
      }
      GMTrace.o(18395210711040L, 137055);
      return;
    }
    if ((paramInt1 == com.tencent.mm.plugin.wallet.balance.a.a.k.rBS) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringExtra("lqt_fetch_enc_pwd");
      w.i("MicroMsg.LqtSaveFetchLogic", "onActivityResult, doRedeemFund");
      w.i("MicroMsg.LqtSaveFetchLogic", "doRedeemFund");
      localk.rBV.WM();
      j.c localc = localk.rBU.rBO;
      com.tencent.mm.vending.g.g.a(Integer.valueOf(localk.rBY), paramIntent, localk.rBZ).a(localc).d(new k.8(localk)).a(new k.7(localk));
    }
    GMTrace.o(18395210711040L, 137055);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(18394808057856L, 137052);
    super.onCreate(paramBundle);
    this.rDP = ((WalletFormView)findViewById(R.h.bVD));
    this.rDS = ((Button)findViewById(R.h.cgl));
    this.rDT = ((TextView)findViewById(R.h.bVC));
    this.rDQ = ((TextView)findViewById(R.h.bVE));
    this.rDR = ((TextView)findViewById(R.h.bVF));
    this.rDU = ((ViewGroup)findViewById(R.h.bVG));
    this.rDV = ((TextView)findViewById(R.h.bVI));
    this.rDW = ((CheckBox)findViewById(R.h.bVH));
    this.rDO = ((ViewGroup)findViewById(R.h.bZg));
    a(this.rDP, 2, false, false);
    this.mode = getIntent().getIntExtra("lqt_save_fetch_mode", 1);
    this.rDZ = getIntent().getIntExtra("lqt_max_redeem_amount", -1);
    this.rEa = getIntent().getStringExtra("lqt_redeem_invalid_amount_hint");
    this.rEb = getIntent().getStringExtra("lqt_profile_wording");
    final int i;
    if (this.mode == 1)
    {
      this.rDQ.setText(getString(R.l.eVA));
      this.rDS.setText(R.l.eVE);
      this.rDR.setText(getString(R.l.eVC));
      this.rDP.a(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(18400445202432L, 137094);
          if (paramAnonymousEditable.toString().startsWith(".")) {
            paramAnonymousEditable.insert(0, "0");
          }
          String str = paramAnonymousEditable.toString();
          int i = str.indexOf(".");
          int j = str.length();
          if ((i >= 0) && (j - i > 3)) {
            paramAnonymousEditable.delete(i + 3, j);
          }
          for (;;)
          {
            i = WalletLqtSaveFetchUI.dO(paramAnonymousEditable.toString(), "100");
            if (i <= 0) {
              break label488;
            }
            if (WalletLqtSaveFetchUI.g(WalletLqtSaveFetchUI.this) != 1) {
              break label286;
            }
            if ((WalletLqtSaveFetchUI.a(WalletLqtSaveFetchUI.this) == null) || (i <= WalletLqtSaveFetchUI.dO(WalletLqtSaveFetchUI.a(WalletLqtSaveFetchUI.this).rNa, "100"))) {
              break;
            }
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.this.getString(R.l.eVB));
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(-65536);
            WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
            GMTrace.o(18400445202432L, 137094);
            return;
            if (i > 12) {
              paramAnonymousEditable.delete(12, i);
            } else if ((i == -1) && (j > 12)) {
              paramAnonymousEditable.delete(12, j);
            }
          }
          WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.h(WalletLqtSaveFetchUI.this));
          WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(Color.parseColor("#888888"));
          WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(true);
          GMTrace.o(18400445202432L, 137094);
          return;
          label286:
          if (WalletLqtSaveFetchUI.g(WalletLqtSaveFetchUI.this) == 2)
          {
            if (i > WalletLqtSaveFetchUI.this.getIntent().getIntExtra("lqt_balance", 0))
            {
              WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.this.getString(R.l.eVp));
              WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(-65536);
              WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
              GMTrace.o(18400445202432L, 137094);
              return;
            }
            if ((WalletLqtSaveFetchUI.i(WalletLqtSaveFetchUI.this) > 0) && (i > WalletLqtSaveFetchUI.i(WalletLqtSaveFetchUI.this)))
            {
              WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.j(WalletLqtSaveFetchUI.this));
              WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(-65536);
              WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
              GMTrace.o(18400445202432L, 137094);
              return;
            }
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.h(WalletLqtSaveFetchUI.this));
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(Color.parseColor("#888888"));
            WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(true);
            GMTrace.o(18400445202432L, 137094);
            return;
            label488:
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setText(WalletLqtSaveFetchUI.h(WalletLqtSaveFetchUI.this));
            WalletLqtSaveFetchUI.c(WalletLqtSaveFetchUI.this).setTextColor(Color.parseColor("#888888"));
            WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
          }
          GMTrace.o(18400445202432L, 137094);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(18400176766976L, 137092);
          GMTrace.o(18400176766976L, 137092);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(18400310984704L, 137093);
          GMTrace.o(18400310984704L, 137093);
        }
      });
      this.rDS.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18402592686080L, 137110);
          if ((WalletLqtSaveFetchUI.k(WalletLqtSaveFetchUI.this) <= 0L) || (bg.aG(WalletLqtSaveFetchUI.k(WalletLqtSaveFetchUI.this)) < 800L))
          {
            w.d("MicroMsg.WalletLqtSaveFetchUI", "saveButton click too soon");
            WalletLqtSaveFetchUI.a(WalletLqtSaveFetchUI.this, bg.Pq());
            GMTrace.o(18402592686080L, 137110);
            return;
          }
          WalletLqtSaveFetchUI.a(WalletLqtSaveFetchUI.this, bg.Pq());
          final int i = WalletLqtSaveFetchUI.dO(WalletLqtSaveFetchUI.b(WalletLqtSaveFetchUI.this).getText(), "100");
          if (i > 0)
          {
            if (WalletLqtSaveFetchUI.g(WalletLqtSaveFetchUI.this) == 1)
            {
              w.i("MicroMsg.WalletLqtSaveFetchUI", "click save lqt");
              paramAnonymousView = WalletLqtSaveFetchUI.l(WalletLqtSaveFetchUI.this).rCd;
              com.tencent.mm.vending.g.g.bV(Integer.valueOf(i)).a(paramAnonymousView).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
              {
                public final void aE(Object paramAnonymous2Object)
                {
                  GMTrace.i(18401518944256L, 137102);
                  w.i("MicroMsg.WalletLqtSaveFetchUI", "save failed: %s", new Object[] { paramAnonymous2Object });
                  WalletLqtSaveFetchUI.this.bva();
                  if (paramAnonymous2Object != null) {
                    if (!(paramAnonymous2Object instanceof String)) {
                      break label69;
                    }
                  }
                  label69:
                  for (paramAnonymous2Object = paramAnonymous2Object.toString();; paramAnonymous2Object = WalletLqtSaveFetchUI.this.getString(R.l.eVx))
                  {
                    WalletLqtSaveFetchUI.this.Ey((String)paramAnonymous2Object);
                    GMTrace.o(18401518944256L, 137102);
                    return;
                  }
                }
              });
              GMTrace.o(18402592686080L, 137110);
              return;
            }
            if (WalletLqtSaveFetchUI.g(WalletLqtSaveFetchUI.this) == 2)
            {
              w.i("MicroMsg.WalletLqtSaveFetchUI", "click fetch lqt");
              paramAnonymousView = WalletLqtSaveFetchUI.l(WalletLqtSaveFetchUI.this).rCe;
              com.tencent.mm.vending.g.g.bV(Integer.valueOf(i)).a(paramAnonymousView).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
              {
                public final void aE(Object paramAnonymous2Object)
                {
                  GMTrace.i(18414135410688L, 137196);
                  WalletLqtSaveFetchUI.this.bva();
                  if (paramAnonymous2Object != null) {
                    if (!(paramAnonymous2Object instanceof String)) {
                      break label54;
                    }
                  }
                  label54:
                  for (paramAnonymous2Object = paramAnonymous2Object.toString();; paramAnonymous2Object = WalletLqtSaveFetchUI.this.getString(R.l.eVx))
                  {
                    WalletLqtSaveFetchUI.this.Ey((String)paramAnonymous2Object);
                    GMTrace.o(18414135410688L, 137196);
                    return;
                  }
                }
              });
            }
          }
          GMTrace.o(18402592686080L, 137110);
        }
      });
      if (!bg.mZ(this.rEb))
      {
        paramBundle = (TextView)findViewById(R.h.bVA);
        paramBundle.setText(this.rEb);
        paramBundle.setVisibility(0);
      }
      this.rDT.setText("");
      this.rDT.setClickable(true);
      this.rDT.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k(this));
      this.rDS.setEnabled(false);
      if (this.mode != 1) {
        break label693;
      }
      this.rDO.setVisibility(4);
      rV(getString(R.l.eVE));
      paramBundle = getIntent().getStringArrayListExtra("lqt_protocol_list");
      boolean bool = getIntent().getBooleanExtra("lqt_is_show_protocol", false);
      if ((paramBundle == null) || (paramBundle.size() <= 0) || (!bool)) {
        break label681;
      }
      this.rDU.setVisibility(0);
      this.rDW.setChecked(getIntent().getBooleanExtra("lqt_is_agree_protocol", false));
      this.rDU.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18398163501056L, 137077);
          if (!WalletLqtSaveFetchUI.e(WalletLqtSaveFetchUI.this).isChecked()) {}
          for (boolean bool = true;; bool = false)
          {
            WalletLqtSaveFetchUI.e(WalletLqtSaveFetchUI.this).setChecked(bool);
            GMTrace.o(18398163501056L, 137077);
            return;
          }
        }
      });
      this.rDW.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
      {
        public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
        {
          GMTrace.i(18411987927040L, 137180);
          if (!paramAnonymousBoolean)
          {
            WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(false);
            GMTrace.o(18411987927040L, 137180);
            return;
          }
          WalletLqtSaveFetchUI.f(WalletLqtSaveFetchUI.this).setEnabled(true);
          GMTrace.o(18411987927040L, 137180);
        }
      });
      Object localObject = getString(R.l.eVy);
      i = ((String)localObject).length();
      localObject = new SpannableString((String)localObject + getString(R.l.eVz));
      ((SpannableString)localObject).setSpan(new a(new a.a()
      {
        public final void PP()
        {
          GMTrace.i(18409572007936L, 137162);
          com.tencent.mm.ui.widget.e locale = new com.tencent.mm.ui.widget.e(WalletLqtSaveFetchUI.this, com.tencent.mm.ui.widget.e.wSP, false);
          locale.qQS = new o.c()
          {
            public final void a(com.tencent.mm.ui.base.m paramAnonymous2m)
            {
              GMTrace.i(18404069081088L, 137121);
              Iterator localIterator = WalletLqtSaveFetchUI.5.this.rEg.iterator();
              int i = 0;
              while (localIterator.hasNext())
              {
                paramAnonymous2m.add(0, i, 0, ((String)localIterator.next()).split("\\|\\|")[0]);
                i += 1;
              }
              GMTrace.o(18404069081088L, 137121);
            }
          };
          locale.qQT = new o.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(18397895065600L, 137075);
              paramAnonymous2Int = paramAnonymous2MenuItem.getItemId();
              if (paramAnonymous2Int < WalletLqtSaveFetchUI.5.this.rEg.size())
              {
                paramAnonymous2MenuItem = ((String)WalletLqtSaveFetchUI.5.this.rEg.get(paramAnonymous2Int)).split("\\|\\|")[1];
                com.tencent.mm.wallet_core.ui.e.m(WalletLqtSaveFetchUI.this, paramAnonymous2MenuItem, false);
              }
              GMTrace.o(18397895065600L, 137075);
            }
          };
          locale.bCV();
          GMTrace.o(18409572007936L, 137162);
        }
      }), i, ((SpannableString)localObject).length(), 17);
      this.rDV.setText((CharSequence)localObject);
      this.rDV.setClickable(true);
      this.rDV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.k());
    }
    for (;;)
    {
      paramBundle = this.rDN.rCf;
      com.tencent.mm.vending.g.g.chn().a(paramBundle).d(new com.tencent.mm.vending.c.a() {});
      GMTrace.o(18394808057856L, 137052);
      return;
      if (this.mode != 2) {
        break;
      }
      this.rDQ.setText(getString(R.l.eVo));
      this.rDS.setText(R.l.eVv);
      this.rDR.setText(getString(R.l.eVq));
      break;
      label681:
      this.rDU.setVisibility(8);
    }
    label693:
    if (this.mode == 2)
    {
      this.rDU.setVisibility(8);
      rV(getString(R.l.eVw));
      i = getIntent().getIntExtra("lqt_balance", 0);
      if (i > 0)
      {
        paramBundle = getString(R.l.eVs, new Object[] { Double.valueOf(D(String.valueOf(i), "100", 2)) });
        int j = paramBundle.length();
        paramBundle = new SpannableString(paramBundle + getString(R.l.eVt));
        paramBundle.setSpan(new a(new a.a()
        {
          public final void PP()
          {
            GMTrace.i(18400713637888L, 137096);
            WalletLqtSaveFetchUI.b(WalletLqtSaveFetchUI.this).setText(com.tencent.mm.wallet_core.ui.e.r(WalletLqtSaveFetchUI.dN(i, "100")));
            GMTrace.o(18400713637888L, 137096);
          }
        }), j, paramBundle.length(), 18);
        this.rDX = paramBundle;
        this.rDT.setText(paramBundle);
      }
    }
    GMTrace.o(18394808057856L, 137052);
  }
  
  public void onDestroy()
  {
    GMTrace.i(18395881799680L, 137060);
    super.onDestroy();
    this.rDM = null;
    this.rDN = null;
    GMTrace.o(18395881799680L, 137060);
  }
  
  public void onResume()
  {
    GMTrace.i(18394942275584L, 137053);
    super.onResume();
    GMTrace.o(18394942275584L, 137053);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */