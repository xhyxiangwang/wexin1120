package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.id_verify.model.g;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.wallet_core.ui.formview.a.a;
import java.util.LinkedList;
import java.util.List;

public class WalletRealNameVerifyUI
  extends WalletBaseUI
  implements View.OnClickListener, WalletFormView.a
{
  private String countryCode;
  private String hhp;
  private String hhq;
  private Button lsT;
  private TextView ngA;
  private Profession[] rKQ;
  private WalletFormView rLH;
  private WalletFormView rLI;
  private WalletFormView rLJ;
  private WalletFormView rLK;
  private CheckBox rLL;
  private TextView rLM;
  private ElementQuery rLN;
  private Profession rLO;
  private boolean rLP;
  private boolean rLQ;
  
  public WalletRealNameVerifyUI()
  {
    GMTrace.i(6847117393920L, 51015);
    this.rLP = false;
    this.rLQ = false;
    GMTrace.o(6847117393920L, 51015);
  }
  
  protected final void MH()
  {
    GMTrace.i(6847385829376L, 51017);
    oC(R.l.eYi);
    this.lsT = ((Button)findViewById(R.h.cgl));
    this.rLH = ((WalletFormView)findViewById(R.h.ceC));
    this.rLI = ((WalletFormView)findViewById(R.h.bqD));
    this.rLJ = ((WalletFormView)findViewById(R.h.ckt));
    this.rLK = ((WalletFormView)findViewById(R.h.cks));
    this.rLM = ((TextView)findViewById(R.h.bQj));
    this.rLH.xid = this;
    this.rLI.xid = this;
    this.rLJ.xid = this;
    this.rLK.xid = this;
    this.rLH.setFocusable(true);
    this.rLH.oSV.setVisibility(8);
    com.tencent.mm.wallet_core.ui.formview.a.c(this.rLI);
    com.tencent.mm.wallet_core.ui.formview.a.b localb = this.rLI.xif;
    if ((localb instanceof a.a)) {
      ((a.a)localb).Ei(1);
    }
    this.rLJ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6837185282048L, 50941);
        paramAnonymousView = new Intent(WalletRealNameVerifyUI.this.vov.voR, WalletSelectProfessionUI.class);
        paramAnonymousView.putExtra("key_profession_list", WalletRealNameVerifyUI.a(WalletRealNameVerifyUI.this));
        WalletRealNameVerifyUI.this.startActivityForResult(paramAnonymousView, 1);
        GMTrace.o(6837185282048L, 50941);
      }
    });
    this.rLK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6849130659840L, 51030);
        paramAnonymousView = new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true).putExtra("ShowSelectedLocation", false).putExtra("IsRealNameVerifyScene", true).putExtra("IsNeedShowSearchBar", true);
        WalletRealNameVerifyUI.this.startActivityForResult(paramAnonymousView, 2);
        GMTrace.o(6849130659840L, 51030);
      }
    });
    this.lsT.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6846714740736L, 51012);
        paramAnonymousView = WalletRealNameVerifyUI.b(WalletRealNameVerifyUI.this).getText();
        String str = WalletRealNameVerifyUI.c(WalletRealNameVerifyUI.this).getText();
        WalletRealNameVerifyUI.a(WalletRealNameVerifyUI.this, paramAnonymousView, str);
        GMTrace.o(6846714740736L, 51012);
      }
    });
    e(this.rLI, 1, false);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6858794336256L, 51102);
        ((a)WalletRealNameVerifyUI.this.cjm()).c(WalletRealNameVerifyUI.this, 0);
        WalletRealNameVerifyUI.this.finish();
        GMTrace.o(6858794336256L, 51102);
        return true;
      }
    });
    this.rLL = ((CheckBox)findViewById(R.h.bhl));
    this.ngA = ((TextView)findViewById(R.h.bhj));
    this.rLL.setChecked(true);
    this.rLL.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6849399095296L, 51032);
        if (paramAnonymousBoolean)
        {
          WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setEnabled(true);
          WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setClickable(true);
          GMTrace.o(6849399095296L, 51032);
          return;
        }
        WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setEnabled(false);
        WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setClickable(false);
        GMTrace.o(6849399095296L, 51032);
      }
    });
    this.ngA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6859331207168L, 51106);
        paramAnonymousView = new LinkedList();
        LinkedList localLinkedList = new LinkedList();
        paramAnonymousView.add(WalletRealNameVerifyUI.this.getString(R.l.eSV));
        localLinkedList.add(Integer.valueOf(0));
        if ((WalletRealNameVerifyUI.e(WalletRealNameVerifyUI.this) != null) && (WalletRealNameVerifyUI.e(WalletRealNameVerifyUI.this).rOp))
        {
          paramAnonymousView.add(WalletRealNameVerifyUI.this.getString(R.l.eSU));
          localLinkedList.add(Integer.valueOf(1));
        }
        h.a(WalletRealNameVerifyUI.this, "", paramAnonymousView, localLinkedList, "", new h.d()
        {
          public final void bQ(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(6859062771712L, 51104);
            Intent localIntent = new Intent();
            switch (paramAnonymous2Int1)
            {
            }
            for (;;)
            {
              localIntent.putExtra("showShare", false);
              com.tencent.mm.bi.d.b(WalletRealNameVerifyUI.this.vov.voR, "webview", ".ui.tools.WebViewUI", localIntent);
              GMTrace.o(6859062771712L, 51104);
              return;
              localIntent.putExtra("rawUrl", WalletRealNameVerifyUI.this.getString(R.l.eRQ, new Object[] { v.bMQ() }));
              continue;
              if (WalletRealNameVerifyUI.e(WalletRealNameVerifyUI.this) != null) {
                localIntent.putExtra("rawUrl", WalletRealNameVerifyUI.this.getString(R.l.eRP, new Object[] { v.bMQ(), WalletRealNameVerifyUI.e(WalletRealNameVerifyUI.this).oql }));
              }
            }
          }
        });
        GMTrace.o(6859331207168L, 51106);
      }
    });
    GMTrace.o(6847385829376L, 51017);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    boolean bool2 = false;
    GMTrace.i(6847520047104L, 51018);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.d))
      {
        com.tencent.mm.wallet_core.b localb = cjm();
        paramString = null;
        if (localb != null) {
          paramString = localb.lRQ;
        }
        paramk = ((com.tencent.mm.plugin.wallet_core.id_verify.model.d)paramk).token;
        w.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response succ");
        if (localb != null)
        {
          paramString.putString("key_real_name_token", paramk);
          paramString.putString("key_country_code", this.countryCode);
          paramString.putString("key_province_code", this.hhq);
          paramString.putString("key_city_code", this.hhp);
          paramString.putParcelable("key_profession", this.rLO);
          localb.a(this, 0, paramString);
        }
        GMTrace.o(6847520047104L, 51018);
        return true;
      }
      if ((paramk instanceof g))
      {
        paramString = (g)paramk;
        if (paramString.rKO == 1) {}
        for (boolean bool1 = true;; bool1 = false)
        {
          this.rLP = bool1;
          bool1 = bool2;
          if (paramString.rKP == 1) {
            bool1 = true;
          }
          this.rLQ = bool1;
          if (!this.rLQ) {
            this.rLJ.setVisibility(8);
          }
          if (!this.rLP) {
            this.rLK.setVisibility(8);
          }
          if ((this.rLP) || (this.rLQ)) {
            this.rLM.setText(R.l.eYg);
          }
          this.rKQ = paramString.rMf;
          GMTrace.o(6847520047104L, 51018);
          return true;
        }
      }
    }
    else
    {
      w.e("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response fail");
    }
    GMTrace.o(6847520047104L, 51018);
    return false;
  }
  
  public final void gQ(boolean paramBoolean)
  {
    GMTrace.i(6848056918016L, 51022);
    w.d("MicroMsg.WalletRealNameVerifyUI", "check info");
    String str1 = this.rLH.getText();
    String str2 = this.rLI.getText();
    int i;
    if (bg.mZ(str1)) {
      i = 0;
    }
    for (;;)
    {
      if (i == 0)
      {
        this.lsT.setEnabled(false);
        this.lsT.setClickable(false);
        GMTrace.o(6848056918016L, 51022);
        return;
        if (bg.mZ(str2))
        {
          i = 0;
          continue;
        }
        if (this.rLP)
        {
          if ((!bg.mZ(this.countryCode)) || (!bg.mZ(this.hhq)) || (!bg.mZ(this.hhp))) {}
          for (i = 1;; i = 0)
          {
            if (i != 0) {
              break label140;
            }
            i = 0;
            break;
          }
        }
        label140:
        if ((this.rLQ) && (this.rLO == null)) {
          i = 0;
        }
      }
      else
      {
        this.lsT.setEnabled(true);
        this.lsT.setClickable(true);
        GMTrace.o(6848056918016L, 51022);
        return;
      }
      i = 1;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6847654264832L, 51019);
    int i = R.i.djg;
    GMTrace.o(6847654264832L, 51019);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6847922700288L, 51021);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        this.rLO = ((Profession)paramIntent.getParcelableExtra("key_select_profession"));
        this.rLJ.setText(this.rLO.rMg);
        GMTrace.o(6847922700288L, 51021);
        return;
      }
      w.i("MicroMsg.WalletRealNameVerifyUI", "no choose!");
      GMTrace.o(6847922700288L, 51021);
      return;
    }
    if (paramInt1 == 2)
    {
      if (paramInt2 == -1)
      {
        String str1 = paramIntent.getStringExtra("CountryName");
        String str2 = paramIntent.getStringExtra("ProviceName");
        String str3 = paramIntent.getStringExtra("CityName");
        this.countryCode = paramIntent.getStringExtra("Country");
        this.hhq = paramIntent.getStringExtra("Contact_Province");
        this.hhp = paramIntent.getStringExtra("Contact_City");
        paramIntent = new StringBuilder();
        if (!bg.mZ(str1)) {
          paramIntent.append(str1);
        }
        if (!bg.mZ(str2)) {
          paramIntent.append(" ").append(str2);
        }
        if (!bg.mZ(str3)) {
          paramIntent.append(" ").append(str3);
        }
        this.rLK.setText(paramIntent.toString());
        GMTrace.o(6847922700288L, 51021);
        return;
      }
      w.i("MicroMsg.WalletRealNameVerifyUI", "no area choose!");
    }
    GMTrace.o(6847922700288L, 51021);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(6847788482560L, 51020);
    GMTrace.o(6847788482560L, 51020);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6847251611648L, 51016);
    super.onCreate(paramBundle);
    this.xhw.hz(1616);
    this.rLN = ((ElementQuery)this.un.getParcelable("elemt_query"));
    MH();
    r(new g());
    GMTrace.o(6847251611648L, 51016);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14438203654144L, 107573);
    this.xhw.hA(1616);
    super.onDestroy();
    GMTrace.o(14438203654144L, 107573);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */