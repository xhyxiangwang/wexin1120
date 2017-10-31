package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.sa;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.ui.f.a;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletForgotPwdUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private ListView inK;
  private ArrayList<Bankcard> rEU;
  c rFr;
  private Button rFt;
  private List<ElementQuery> rJj;
  private Bankcard rJk;
  private a rJl;
  private LinearLayout rJm;
  private WalletFormView rJn;
  private WalletFormView rJo;
  private int rJp;
  private boolean rJq;
  c rJr;
  
  public WalletForgotPwdUI()
  {
    GMTrace.i(7750134267904L, 57743);
    this.rEU = new ArrayList();
    this.rJj = new LinkedList();
    this.rJp = 1;
    this.rJq = false;
    this.rJr = new c() {};
    this.rFr = new c() {};
    GMTrace.o(7750134267904L, 57743);
  }
  
  private boolean QN()
  {
    GMTrace.i(7751610662912L, 57754);
    if ((this.inK.getVisibility() == 0) || ((this.rJo.QR()) && (this.rJn.QR())))
    {
      this.rFt.setEnabled(true);
      this.rFt.setClickable(true);
      GMTrace.o(7751610662912L, 57754);
      return true;
    }
    this.rFt.setEnabled(false);
    this.rFt.setClickable(false);
    GMTrace.o(7751610662912L, 57754);
    return false;
  }
  
  private void bvX()
  {
    GMTrace.i(7750939574272L, 57749);
    this.un.remove("elemt_query");
    this.un.remove("key_bankcard");
    this.un.remove("bank_name");
    this.un.remove("key_card_id");
    GMTrace.o(7750939574272L, 57749);
  }
  
  private void bvY()
  {
    GMTrace.i(7751073792000L, 57750);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("key_is_reset_with_new_card", this.un.getBoolean("key_is_reset_with_new_card", false));
    bvX();
    if ((this.rJk == null) && (!this.rJq))
    {
      l(new com.tencent.mm.plugin.wallet_core.b.k(null, this.rJn.getText(), null));
      GMTrace.o(7751073792000L, 57750);
      return;
    }
    if (this.rJq)
    {
      localObject = com.tencent.mm.plugin.wallet_core.model.m.bwA().bxx();
      if (!bg.mZ(((ad)localObject).field_find_passwd_url))
      {
        w.i("MicroMsg.WalletForgotPwdUI", "hy: not support bind new bankcard. start to url");
        e.m(this, ((ad)localObject).field_find_passwd_url, false);
        GMTrace.o(7751073792000L, 57750);
        return;
      }
      localBundle.putBoolean("key_is_force_bind", true);
      localBundle.putBoolean("key_is_reset_with_new_card", true);
      if (cjm() != null) {
        cjm().a(this, 0, localBundle);
      }
      GMTrace.o(7751073792000L, 57750);
      return;
    }
    b localb = com.tencent.mm.wallet_core.a.aa(this);
    localBundle.putParcelable("key_bankcard", this.rJk);
    Object localObject = new ElementQuery();
    Iterator localIterator = this.rJj.iterator();
    while (localIterator.hasNext())
    {
      ElementQuery localElementQuery = (ElementQuery)localIterator.next();
      w.i("MicroMsg.WalletForgotPwdUI", "helios:::" + localElementQuery.oql);
      if ((!bg.mZ(localElementQuery.oql)) && (!bg.mZ(this.rJk.field_bankcardType)) && (localElementQuery.oql.trim().equals(this.rJk.field_bankcardType.trim()))) {
        localObject = localElementQuery;
      }
    }
    for (;;)
    {
      localBundle.putParcelable("elemt_query", (Parcelable)localObject);
      if (localb != null) {
        localb.a(this, 0, localBundle);
      }
      GMTrace.o(7751073792000L, 57750);
      return;
    }
  }
  
  private void update()
  {
    GMTrace.i(7750671138816L, 57747);
    p.bvm();
    this.rEU = p.bvn().bxi();
    if ((this.rEU == null) || (this.rEU.size() == 0) || (this.un.getBoolean("key_is_force_bind", false)))
    {
      w.i("MicroMsg.WalletForgotPwdUI", "No bound bankcard process %s", new Object[] { Boolean.valueOf(this.un.getBoolean("key_is_force_bind", false)) });
      this.rEU = new ArrayList();
      this.rJm.setVisibility(0);
      this.inK.setVisibility(8);
      oC(R.l.eUt);
      ((TextView)findViewById(R.h.cJa)).setText(getString(R.l.eWz));
      WalletFormView localWalletFormView = this.rJo;
      p.bvm();
      localWalletFormView.setText(e.WE(p.bvn().aoj()));
      GMTrace.o(7750671138816L, 57747);
      return;
    }
    w.i("MicroMsg.WalletForgotPwdUI", "domestic process!");
    if (com.tencent.mm.wallet_core.a.aa(this) != null) {
      r(new com.tencent.mm.plugin.wallet_core.b.k());
    }
    this.rJm.setVisibility(8);
    this.rFt.setVisibility(8);
    findViewById(R.h.cdy).setVisibility(0);
    this.rJl = new a(this);
    this.inK.setAdapter(this.rJl);
    this.rJl.hip = this.rEU;
    this.rJl.notifyDataSetChanged();
    GMTrace.o(7750671138816L, 57747);
  }
  
  public void MH()
  {
    GMTrace.i(7750805356544L, 57748);
    this.inK = ((ListView)findViewById(R.h.cwi));
    this.rJm = ((LinearLayout)findViewById(R.h.bJz));
    this.rJo = ((WalletFormView)findViewById(R.h.ceC));
    this.rJn = ((WalletFormView)findViewById(R.h.bpD));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rJn);
    if (this.un.getBoolean("key_is_paymanager", false)) {
      com.tencent.mm.wallet_core.ui.formview.a.d(this, this.rJo);
    }
    for (;;)
    {
      this.rJo.xid = this;
      this.rJn.xid = this;
      this.rFt = ((Button)findViewById(R.h.cgl));
      this.rFt.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7766911483904L, 57868);
          g.paX.i(11353, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
          WalletForgotPwdUI.a(WalletForgotPwdUI.this);
          GMTrace.o(7766911483904L, 57868);
        }
      });
      this.rJq = false;
      p.bvm();
      this.rEU = p.bvn().bxi();
      update();
      findViewById(R.h.cdy).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7757784678400L, 57800);
          e.m(WalletForgotPwdUI.this, "https://kf.qq.com/touch/scene_product.html?scene_id=kf3258", false);
          GMTrace.o(7757784678400L, 57800);
        }
      });
      QN();
      a(this.rJn, 0, false, false);
      this.rJn.j(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7766106177536L, 57862);
          g.paX.i(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
          paramAnonymousView = WalletForgotPwdUI.this;
          p.bvm();
          e.e(paramAnonymousView, p.bvn().aoj());
          GMTrace.o(7766106177536L, 57862);
        }
      });
      this.rJn.oSV.setImageResource(R.k.drJ);
      this.rJn.oSV.setVisibility(0);
      GMTrace.o(7750805356544L, 57748);
      return;
      com.tencent.mm.wallet_core.ui.formview.a.e(this, this.rJo);
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(7752013316096L, 57757);
    GMTrace.o(7752013316096L, 57757);
    return 1;
  }
  
  public final boolean aMd()
  {
    GMTrace.i(7752147533824L, 57758);
    if ((this.rEU == null) || (this.rEU.size() == 0))
    {
      if (bg.mZ(com.tencent.mm.plugin.wallet_core.model.m.bwA().bxx().field_find_passwd_url))
      {
        GMTrace.o(7752147533824L, 57758);
        return false;
      }
      GMTrace.o(7752147533824L, 57758);
      return true;
    }
    GMTrace.o(7752147533824L, 57758);
    return false;
  }
  
  protected final boolean aMg()
  {
    GMTrace.i(7752281751552L, 57759);
    if (aMd()) {}
    for (int i = 4;; i = 0)
    {
      sh(i);
      GMTrace.o(7752281751552L, 57759);
      return true;
    }
  }
  
  public final boolean aMh()
  {
    GMTrace.i(7751476445184L, 57753);
    GMTrace.o(7751476445184L, 57753);
    return true;
  }
  
  protected boolean bvz()
  {
    GMTrace.i(7751879098368L, 57756);
    GMTrace.o(7751879098368L, 57756);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(7751342227456L, 57752);
    w.i("MicroMsg.WalletForgotPwdUI", " errCode: %s errMsg :  scene: ", new Object[] { Integer.valueOf(paramInt2), paramString, paramk });
    ArrayList localArrayList;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.k))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.b.k)paramk;
        paramk = new Bundle();
        if (bg.mZ(paramString.kmv))
        {
          this.rJj = paramString.rKK;
          w.i("MicroMsg.WalletForgotPwdUI", "scene case 1 mCardId is null");
          GMTrace.o(7751342227456L, 57752);
          return true;
        }
        if (paramString.rKL != null)
        {
          if (paramString.rKL.isError())
          {
            w.i("MicroMsg.WalletForgotPwdUI", "scene case 2 mTargetElement is error");
            h.h(this, R.l.eSD, R.l.dxm);
            GMTrace.o(7751342227456L, 57752);
            return true;
          }
          if (this.rEU == null) {}
          for (paramInt1 = 0;; paramInt1 = this.rEU.size())
          {
            w.i("MicroMsg.WalletForgotPwdUI", "scene case 3 bankcards size %d", new Object[] { Integer.valueOf(paramInt1) });
            if ((this.rEU != null) && (this.rEU.size() != 0)) {
              break;
            }
            bvX();
            paramk.putString("bank_name", paramString.rKL.mVv);
            paramk.putParcelable("elemt_query", paramString.rKL);
            paramk.putString("key_card_id", this.rJn.getText());
            com.tencent.mm.wallet_core.a.i(this, paramk);
            GMTrace.o(7751342227456L, 57752);
            return true;
          }
        }
      }
      else if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m))
      {
        boolean bool;
        if (this.rJl == null)
        {
          bool = true;
          w.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter is null ? %s", new Object[] { Boolean.valueOf(bool) });
          if (this.rJl == null) {
            break label515;
          }
          paramString = null;
          if (com.tencent.mm.plugin.wallet_core.model.m.bwE() != null) {
            paramString = com.tencent.mm.plugin.wallet_core.model.m.bwE().bxi();
          }
          paramk = com.tencent.mm.wallet_core.a.aa(this);
          if (paramk != null)
          {
            paramk.cix();
            paramk = new ArrayList();
            localArrayList = new ArrayList();
            paramString = paramString.iterator();
          }
        }
        else
        {
          for (;;)
          {
            if (!paramString.hasNext()) {
              break label439;
            }
            Bankcard localBankcard = (Bankcard)paramString.next();
            if (localBankcard.field_bankcardTag == 1)
            {
              paramk.add(localBankcard);
              continue;
              bool = false;
              break;
            }
            if (localBankcard.field_bankcardTag == 2) {
              localArrayList.add(localBankcard);
            }
          }
          label439:
          if (paramk.size() <= 0) {
            break label526;
          }
          this.rEU = paramk;
        }
        if (this.rEU != null) {
          break label535;
        }
      }
    }
    label515:
    label526:
    label535:
    for (paramInt1 = 0;; paramInt1 = this.rEU.size())
    {
      w.i("MicroMsg.WalletForgotPwdUI", "scene case queryBound adapter update bankcardsize:  %d", new Object[] { Integer.valueOf(paramInt1) });
      this.rJl.hip = this.rEU;
      new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7750000050176L, 57742);
          WalletForgotPwdUI.b(WalletForgotPwdUI.this).notifyDataSetChanged();
          WalletForgotPwdUI.c(WalletForgotPwdUI.this);
          GMTrace.o(7750000050176L, 57742);
        }
      });
      GMTrace.o(7751342227456L, 57752);
      return false;
      this.rEU = localArrayList;
      break;
    }
  }
  
  public final void gQ(boolean paramBoolean)
  {
    GMTrace.i(7751744880640L, 57755);
    QN();
    GMTrace.o(7751744880640L, 57755);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7751208009728L, 57751);
    int i = R.i.diw;
    GMTrace.o(7751208009728L, 57751);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7752415969280L, 57760);
    if ((paramInt2 == -1) && (1 == paramInt1))
    {
      paramIntent = paramIntent.getStringExtra("key_bankcard_id");
      this.rJn.WK(paramIntent);
      bvY();
    }
    GMTrace.o(7752415969280L, 57760);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7750268485632L, 57744);
    super.onCreate(paramBundle);
    oC(R.l.eWN);
    if (!this.un.getBoolean("key_is_force_bind", false))
    {
      l(new com.tencent.mm.plugin.wallet_core.b.m(null, 6));
      sh(4);
    }
    MH();
    com.tencent.mm.sdk.b.a.uLm.b(this.rJr);
    com.tencent.mm.sdk.b.a.uLm.b(this.rFr);
    GMTrace.o(7750268485632L, 57744);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7750402703360L, 57745);
    com.tencent.mm.sdk.b.a.uLm.c(this.rJr);
    com.tencent.mm.sdk.b.a.uLm.c(this.rFr);
    super.onDestroy();
    GMTrace.o(7750402703360L, 57745);
  }
  
  public void onResume()
  {
    GMTrace.i(7750536921088L, 57746);
    super.onResume();
    update();
    GMTrace.o(7750536921088L, 57746);
  }
  
  public final class a
    extends BaseAdapter
  {
    private Context context;
    List<Bankcard> hip;
    
    public a(Context paramContext)
    {
      GMTrace.i(7762348081152L, 57834);
      this.hip = new ArrayList();
      this.context = paramContext;
      GMTrace.o(7762348081152L, 57834);
    }
    
    private Bankcard wt(int paramInt)
    {
      GMTrace.i(7762750734336L, 57837);
      if ((paramInt >= 0) && (paramInt <= this.hip.size() - 1))
      {
        Bankcard localBankcard = (Bankcard)this.hip.get(paramInt);
        GMTrace.o(7762750734336L, 57837);
        return localBankcard;
      }
      GMTrace.o(7762750734336L, 57837);
      return null;
    }
    
    public final int getCount()
    {
      GMTrace.i(7762616516608L, 57836);
      int i = this.hip.size();
      GMTrace.o(7762616516608L, 57836);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7762884952064L, 57838);
      long l = paramInt;
      GMTrace.o(7762884952064L, 57838);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, final ViewGroup paramViewGroup)
    {
      GMTrace.i(7762482298880L, 57835);
      if (paramView == null) {}
      for (paramView = (WalletFormView)View.inflate(this.context, R.i.dhV, null);; paramView = (WalletFormView)paramView)
      {
        paramViewGroup = wt(paramInt);
        if (paramViewGroup != null) {
          paramView.setText(((Bankcard)this.hip.get(paramInt)).field_desc);
        }
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7754831888384L, 57778);
            WalletForgotPwdUI.a(WalletForgotPwdUI.this, paramViewGroup);
            WalletForgotPwdUI.a(WalletForgotPwdUI.this, false);
            WalletForgotPwdUI.a(WalletForgotPwdUI.this);
            GMTrace.o(7754831888384L, 57778);
          }
        });
        GMTrace.o(7762482298880L, 57835);
        return paramView;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/ui/WalletForgotPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */