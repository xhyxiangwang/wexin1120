package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.ac.k;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.am;
import com.tencent.mm.g.a.an;
import com.tencent.mm.g.a.ie;
import com.tencent.mm.g.a.ie.a;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.wallet_core.b.f;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.a;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import com.tencent.mm.x.ag.b.a;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoOldUI
  extends WalletOrderInfoUI
{
  protected boolean fuL;
  protected boolean fuM;
  protected boolean fuN;
  protected String iqL;
  protected String jqc;
  private String oYQ;
  protected String onw;
  private com.tencent.mm.sdk.b.c opz;
  protected String osA;
  public Orders rGT;
  protected PayInfo rHl;
  public List<Orders.Commodity> rUA;
  private HashMap<String, b> rUG;
  protected String rUH;
  protected boolean rUy;
  public Set<String> rUz;
  private d rVA;
  private boolean rVB;
  public ag.b.a rVC;
  private View.OnLongClickListener rVD;
  private com.tencent.mm.sdk.b.c rVl;
  protected LinearLayout rVs;
  protected TextView rVt;
  protected TextView rVu;
  public a rVv;
  protected String rVw;
  protected HashMap<String, TextView> rVx;
  protected c rVy;
  protected Map<Long, String> rVz;
  
  public WalletOrderInfoOldUI()
  {
    GMTrace.i(6932614086656L, 51652);
    this.rVs = null;
    this.rVt = null;
    this.rVu = null;
    this.rUA = null;
    this.rVv = null;
    this.jqc = null;
    this.osA = null;
    this.rUy = false;
    this.rUz = null;
    this.iqL = "";
    this.rVw = null;
    this.fuL = true;
    this.fuM = false;
    this.fuN = false;
    this.rVx = new HashMap();
    this.rVz = new HashMap();
    this.rUG = new HashMap();
    this.rVB = false;
    this.opz = new com.tencent.mm.sdk.b.c() {};
    this.rVC = new ag.b.a()
    {
      public final void p(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6928453337088L, 51621);
        ap.AS();
        x localx = com.tencent.mm.x.c.yL().SL(paramAnonymousString);
        w.d("MicroMsg.WalletOrderInfoOldUI", "call back from contactServer " + paramAnonymousString + " succ: " + paramAnonymousBoolean);
        WalletOrderInfoOldUI.this.K(localx);
        GMTrace.o(6928453337088L, 51621);
      }
    };
    this.rVD = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(6983348387840L, 52030);
        if ((paramAnonymousView.getId() == R.h.cJo) || (paramAnonymousView.getId() == R.h.cJM)) {}
        try
        {
          paramAnonymousView = (String)paramAnonymousView.getTag();
          Toast.makeText(WalletOrderInfoOldUI.this, R.l.eVQ, 0).show();
          com.tencent.mm.pluginsdk.i.c.a(WalletOrderInfoOldUI.this.vov.voR, paramAnonymousView, paramAnonymousView);
          GMTrace.o(6983348387840L, 52030);
          return true;
        }
        catch (Exception paramAnonymousView)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.WalletOrderInfoOldUI", paramAnonymousView, "", new Object[0]);
          }
        }
      }
    };
    this.rVl = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6932614086656L, 51652);
  }
  
  private void bxN()
  {
    GMTrace.i(6935701094400L, 51675);
    if ((this.rGT != null) && (this.rGT.rPj != null) && (this.rGT.rPj.size() > 0) && (((Orders.Commodity)this.rGT.rPj.get(0)).rPG != null) && (!bg.mZ(((Orders.Commodity)this.rGT.rPj.get(0)).rPG.text)) && (!bg.mZ(((Orders.Commodity)this.rGT.rPj.get(0)).rPG.url)))
    {
      this.rVu.setVisibility(0);
      this.rVu.setText(((Orders.Commodity)this.rGT.rPj.get(0)).rPG.text);
      this.rVu.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6923755716608L, 51586);
          e.m(WalletOrderInfoOldUI.this, ((Orders.Commodity)WalletOrderInfoOldUI.this.rGT.rPj.get(0)).rPG.url, false);
          GMTrace.o(6923755716608L, 51586);
        }
      });
      GMTrace.o(6935701094400L, 51675);
      return;
    }
    w.i("MicroMsg.WalletOrderInfoOldUI", "hy: no commodity or no link act or link act is illegal!");
    this.rVu.setVisibility(8);
    GMTrace.o(6935701094400L, 51675);
  }
  
  protected final void JH(String paramString)
  {
    GMTrace.i(6934493134848L, 51666);
    bxJ();
    e.m(this, paramString, false);
    this.rVB = false;
    GMTrace.o(6934493134848L, 51666);
  }
  
  public void JI(String paramString)
  {
    GMTrace.i(6933553610752L, 51659);
    l(new com.tencent.mm.plugin.wallet_core.b.n(paramString));
    GMTrace.o(6933553610752L, 51659);
  }
  
  public final void K(x paramx)
  {
    GMTrace.i(6934761570304L, 51668);
    if ((paramx != null) && ((int)paramx.gLS != 0))
    {
      String str = paramx.vp();
      w.d("MicroMsg.WalletOrderInfoOldUI", "call back from contactServer nickName " + str + " username: " + paramx.field_username);
      if ((this.rUA != null) && (this.rUA.size() > 0))
      {
        Iterator localIterator = this.rUA.iterator();
        while (localIterator.hasNext()) {
          ((Orders.Commodity)localIterator.next()).orj = str;
        }
        this.rVv.notifyDataSetChanged();
      }
      this.jqc = paramx.field_username;
    }
    GMTrace.o(6934761570304L, 51668);
  }
  
  protected final void MH()
  {
    GMTrace.i(6934090481664L, 51663);
    oC(R.l.eWu);
    bUv();
    kR(false);
    String str = getString(R.l.dvM);
    Object localObject;
    if ((this.rHl != null) && (this.rHl.fIG == 2)) {
      if (!bg.mZ(this.rHl.rZS)) {
        localObject = getString(R.l.dut) + this.rHl.rZS;
      }
    }
    for (;;)
    {
      a(0, (String)localObject, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6986166960128L, 52051);
          WalletOrderInfoOldUI.this.done();
          GMTrace.o(6986166960128L, 52051);
          return true;
        }
      });
      this.rVs = ((LinearLayout)findViewById(R.h.cJD));
      this.rVt = ((TextView)findViewById(R.h.cJC));
      this.rVu = ((TextView)findViewById(R.h.cJv));
      localObject = (MaxListView)findViewById(R.h.cJi);
      this.rVv = new a();
      ((MaxListView)localObject).setAdapter(this.rVv);
      bxM();
      bxN();
      ((ScrollView)findViewById(R.h.cKi)).pageScroll(33);
      GMTrace.o(6934090481664L, 51663);
      return;
      localObject = str;
      if (!bg.mZ(this.rHl.appId))
      {
        localObject = str;
        if (!bg.mZ(com.tencent.mm.pluginsdk.model.app.g.m(this, this.rHl.appId)))
        {
          localObject = getString(R.l.dut) + com.tencent.mm.pluginsdk.model.app.g.m(this, this.rHl.appId);
          continue;
          localObject = str;
          if (this.rGT != null)
          {
            localObject = str;
            if (!bg.mZ(this.rGT.rPu)) {
              localObject = this.rGT.rPu;
            }
          }
        }
      }
    }
  }
  
  public void PU()
  {
    GMTrace.i(6932882522112L, 51654);
    Object localObject1 = com.tencent.mm.wallet_core.a.aa(this);
    this.rHl = ((PayInfo)this.un.getParcelable("key_pay_info"));
    this.onw = this.un.getString("key_trans_id");
    this.un.getInt("key_pay_type", -1);
    w.i("MicroMsg.WalletOrderInfoOldUI", "mTransId %s", new Object[] { this.onw });
    this.rGT = bxK();
    int i;
    Object localObject2;
    label213:
    int j;
    if (this.rGT != null)
    {
      sh(0);
      this.rGT = ((Orders)this.un.getParcelable("key_orders"));
      c(this.rGT);
      if ((localObject1 != null) && (this.rGT != null) && (this.rHl != null))
      {
        this.iqL = this.rHl.appId;
        boolean bool2 = ((com.tencent.mm.wallet_core.b)localObject1).ciA();
        com.tencent.mm.plugin.wallet_core.d.c.b(this, this.un, 7);
        if (this.un.getInt("key_support_bankcard", 1) == 2)
        {
          i = 2;
          localObject2 = com.tencent.mm.plugin.report.service.g.paX;
          int k = this.rHl.fIG;
          if (this.rHl.fIG != 3) {
            break label495;
          }
          bool1 = true;
          if (!bool2) {
            break label501;
          }
          j = 1;
          label220:
          ((com.tencent.mm.plugin.report.service.g)localObject2).i(10691, new Object[] { Integer.valueOf(k), Boolean.valueOf(bool1), Integer.valueOf(j), Integer.valueOf(com.tencent.mm.wallet_core.c.o.ciP()), Integer.valueOf((int)(this.rGT.rOR * 100.0D)), this.rGT.ori, Integer.valueOf(i) });
        }
      }
      else
      {
        if (((!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY()) && (localObject1 != null) && (((com.tencent.mm.wallet_core.b)localObject1).ciA())) || (!com.tencent.mm.x.m.zO())) {
          com.tencent.mm.x.m.zP();
        }
        if ((this.rGT == null) || (this.rGT.rPj == null) || (this.rGT.rPj.size() <= 0)) {
          break label506;
        }
        this.rUA = this.rGT.rPj;
        this.onw = ((Orders.Commodity)this.rUA.get(0)).fKK;
        if ((this.rHl != null) && (localObject1 != null) && ((((com.tencent.mm.wallet_core.b)localObject1).ciz()) || (((com.tencent.mm.wallet_core.b)localObject1).ciA()))) {
          bxL();
        }
        label426:
        if (this.onw != null) {
          break label672;
        }
        ap.AS();
        localObject1 = com.tencent.mm.x.c.xi().get(w.a.uVQ, Boolean.valueOf(false));
        if (localObject1 == null) {
          break label682;
        }
      }
    }
    label495:
    label501:
    label506:
    label672:
    label682:
    for (boolean bool1 = ((Boolean)localObject1).booleanValue();; bool1 = false)
    {
      if (bool1)
      {
        w.i("MicroMsg.WalletOrderInfoOldUI", "has show the finger print auth guide!");
        GMTrace.o(6932882522112L, 51654);
        return;
        i = 1;
        break;
        bool1 = false;
        break label213;
        j = 2;
        break label220;
        w.k("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new Object[0]);
        com.tencent.mm.ui.base.h.a(this.vov.voR, R.l.eVU, 0, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6963484164096L, 51882);
            WalletOrderInfoOldUI.this.done();
            GMTrace.o(6963484164096L, 51882);
          }
        });
        break label426;
      }
      localObject2 = com.tencent.mm.wallet_core.a.aa(this);
      localObject1 = new Bundle();
      if (localObject2 != null) {
        localObject1 = ((com.tencent.mm.wallet_core.b)localObject2).lRQ;
      }
      if (TextUtils.isEmpty(((Bundle)localObject1).getString("key_pwd1")))
      {
        w.i("MicroMsg.WalletOrderInfoOldUI", "pwd is empty, not show the finger print auth guide!");
        GMTrace.o(6932882522112L, 51654);
        return;
      }
      this.rVB = false;
      if (localObject2 != null) {
        ((com.tencent.mm.wallet_core.b)localObject2).a(this, "fingerprint", ".ui.FingerPrintAuthTransparentUI", (Bundle)localObject1);
      }
      GMTrace.o(6932882522112L, 51654);
      return;
      w.k("MicroMsg.WalletOrderInfoOldUI", "mOrders info is Illegal!", new Object[0]);
      com.tencent.mm.ui.base.h.a(this.vov.voR, R.l.eVU, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6982140428288L, 52021);
          WalletOrderInfoOldUI.this.finish();
          GMTrace.o(6982140428288L, 52021);
        }
      });
      GMTrace.o(6932882522112L, 51654);
      return;
    }
  }
  
  protected final void a(Orders.b paramb)
  {
    GMTrace.i(6933822046208L, 51661);
    r(new f(paramb, bvp(), this.onw, paramb.rPV));
    GMTrace.o(6933822046208L, 51661);
  }
  
  protected final void a(String paramString, d paramd)
  {
    GMTrace.i(6934358917120L, 51665);
    bxJ();
    this.rVA = paramd;
    e.p(this, paramString, 1);
    this.rVB = false;
    GMTrace.o(6934358917120L, 51665);
  }
  
  protected final boolean aZY()
  {
    GMTrace.i(6933150957568L, 51656);
    GMTrace.o(6933150957568L, 51656);
    return false;
  }
  
  public final void bxI()
  {
    GMTrace.i(6935164223488L, 51671);
    bxJ();
    this.rVB = false;
    Object localObject1 = new am();
    ((am)localObject1).fuG.fuH = true;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
    Object localObject2 = new Bundle();
    ((Bundle)localObject2).putInt("intent_pay_end_errcode", this.un.getInt("intent_pay_end_errcode"));
    ((Bundle)localObject2).putString("intent_pay_app_url", this.un.getString("intent_pay_app_url"));
    ((Bundle)localObject2).putBoolean("intent_pay_end", this.un.getBoolean("intent_pay_end"));
    w.i("MicroMsg.WalletOrderInfoOldUI", "pay done...feedbackData errCode:" + this.un.getInt("intent_pay_end_errcode"));
    Iterator localIterator = this.rUz.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (!bg.mZ(str1))
      {
        w.i("MicroMsg.WalletOrderInfoOldUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str1 });
        if ((this.rGT == null) || (this.rHl == null)) {
          break label339;
        }
        com.tencent.mm.ac.n localn = ap.wT();
        String str2 = this.rGT.fAF;
        if (this.rGT.rPj.size() <= 0) {
          break label333;
        }
        localObject1 = ((Orders.Commodity)this.rGT.rPj.get(0)).fKK;
        label250:
        localn.a(new com.tencent.mm.wallet_core.c.h(str1, str2, (String)localObject1, this.rHl.fIG, this.rHl.fIC, this.rGT.rPa), 0);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.paX.i(13033, new Object[] { Integer.valueOf(2), str1, "", "", "" });
        break;
        label333:
        localObject1 = "";
        break label250;
        label339:
        ap.wT().a(new com.tencent.mm.wallet_core.c.h(str1), 0);
      }
    }
    com.tencent.mm.wallet_core.a.i(this, (Bundle)localObject2);
    if ((this.rGT != null) && (!bg.mZ(this.rGT.lpQ))) {
      if (this.rGT.rPj.size() <= 0) {
        break label542;
      }
    }
    label542:
    for (localObject1 = ((Orders.Commodity)this.rGT.rPj.get(0)).fKK;; localObject1 = "")
    {
      localObject1 = d(this.rGT.lpQ, this.rGT.fAF, (String)localObject1, this.rHl.knH, this.rHl.iDL);
      w.d("MicroMsg.WalletOrderInfoOldUI", "url = " + (String)localObject1);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("showShare", false);
      ((Intent)localObject2).putExtra("geta8key_username", com.tencent.mm.x.m.zF());
      ((Intent)localObject2).putExtra("stastic_scene", 8);
      d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject2);
      GMTrace.o(6935164223488L, 51671);
      return;
    }
  }
  
  public final void bxJ()
  {
    int i = 0;
    GMTrace.i(6934627352576L, 51667);
    if (!this.rUy)
    {
      ie localie = new ie();
      localie.fEI.fEJ = 4;
      ie.a locala = localie.fEI;
      if (this.un.getBoolean("intent_pay_end", false)) {
        i = -1;
      }
      locala.aHi = i;
      com.tencent.mm.sdk.b.a.uLm.m(localie);
      this.rUy = true;
    }
    GMTrace.o(6934627352576L, 51667);
  }
  
  protected final Orders bxK()
  {
    GMTrace.i(6933285175296L, 51657);
    Orders localOrders = (Orders)this.un.getParcelable("key_orders");
    GMTrace.o(6933285175296L, 51657);
    return localOrders;
  }
  
  public void bxL()
  {
    GMTrace.i(6933419393024L, 51658);
    l(new com.tencent.mm.plugin.wallet_core.b.m(bvp()));
    GMTrace.o(6933419393024L, 51658);
  }
  
  public final void bxM()
  {
    GMTrace.i(6934224699392L, 51664);
    if (this.rGT != null)
    {
      this.rUA = this.rGT.rPj;
      Iterator localIterator = this.rUA.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!"1".equals(((Orders.Commodity)localIterator.next()).orb));
    }
    for (int i = 0;; i = 1)
    {
      this.rVs.setVisibility(0);
      this.rVt.setVisibility(0);
      if (i != 0)
      {
        if ((!bg.mZ(this.rGT.rPc)) && (!bg.mZ(this.rGT.rPc.trim())))
        {
          this.rVt.setText(this.rGT.rPc);
          GMTrace.o(6934224699392L, 51664);
          return;
        }
        if (this.rGT.rKN != 1)
        {
          this.rVt.setText(R.l.eWj);
          GMTrace.o(6934224699392L, 51664);
          return;
        }
        this.rVt.setText(R.l.eWi);
        GMTrace.o(6934224699392L, 51664);
        return;
      }
      this.rVt.setText(R.l.eWk);
      GMTrace.o(6934224699392L, 51664);
      return;
    }
  }
  
  public final void c(Orders paramOrders)
  {
    GMTrace.i(6933956263936L, 51662);
    this.rUz.clear();
    if ((paramOrders == null) || (paramOrders.rPj == null))
    {
      w.w("MicroMsg.WalletOrderInfoOldUI", "hy: orders is null");
      GMTrace.o(6933956263936L, 51662);
      return;
    }
    paramOrders = paramOrders.rPj.iterator();
    while (paramOrders.hasNext())
    {
      Orders.Commodity localCommodity = (Orders.Commodity)paramOrders.next();
      if ((localCommodity.rPa == 2) && (!bg.mZ(localCommodity.rPy)))
      {
        w.d("MicroMsg.WalletOrderInfoOldUI", "hy: has username and is force recommend");
        this.rUz.add(localCommodity.rPy);
      }
    }
    GMTrace.o(6933956263936L, 51662);
  }
  
  protected final void ce(String paramString, int paramInt)
  {
    GMTrace.i(6933687828480L, 51660);
    l(new com.tencent.mm.plugin.wallet_core.b.n(paramString, paramInt));
    GMTrace.o(6933687828480L, 51660);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6935835312128L, 51676);
    int i;
    if (((paramk instanceof com.tencent.mm.plugin.wallet_core.b.o)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.plugin.wallet_core.b.o localo = (com.tencent.mm.plugin.wallet_core.b.o)paramk;
      b localb = new b(localo.nKX);
      if ((!bg.mZ(localb.url)) && (!bg.mZ(localb.fEM)))
      {
        i = 1;
        if (i != 0) {
          this.rUG.put(localo.rKS, localb);
        }
        this.rVv.notifyDataSetChanged();
      }
    }
    else
    {
      if (!(paramk instanceof com.tencent.mm.plugin.wallet_core.b.n)) {
        break label354;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        sh(0);
        this.rGT = ((com.tencent.mm.plugin.wallet_core.b.n)paramk).rKR;
        if (this.rGT != null) {
          this.rUA = this.rGT.rPj;
        }
        c(this.rGT);
        w.d("MicroMsg.WalletOrderInfoOldUI", "Coomdity:" + this.rUA);
        if ((this.rUA != null) && (this.rUA.size() != 0))
        {
          paramString = (Orders.Commodity)this.rUA.get(0);
          this.onw = paramString.fKK;
          w.d("MicroMsg.WalletOrderInfoOldUI", "Coomdity:" + paramString.toString());
          ap.AS();
          paramk = com.tencent.mm.x.c.yL().SL(paramString.orj);
          if ((paramk == null) || ((int)paramk.gLS == 0)) {
            break label333;
          }
          K(paramk);
        }
      }
    }
    for (;;)
    {
      this.rVv.notifyDataSetChanged();
      bxM();
      if (this.rVv != null) {
        this.rVv.notifyDataSetChanged();
      }
      bxN();
      GMTrace.o(6935835312128L, 51676);
      return true;
      i = 0;
      break;
      label333:
      ag.a.hfr.a(paramString.orj, "", this.rVC);
    }
    label354:
    if ((paramk instanceof f))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (f)paramk;
        paramk = paramString.rKD;
        long l = paramString.rKC.rPN;
        this.rVz.put(Long.valueOf(l), paramk);
        paramString.rKC.rPL = paramString.kCB;
        if ((!"-1".equals(paramk)) && (!"0".equals(paramk)) && (!bg.mZ(paramString.rKE))) {
          com.tencent.mm.ui.base.h.b(this, paramString.rKE, "", true);
        }
        while (!"0".equals(paramk))
        {
          this.rVv.notifyDataSetChanged();
          GMTrace.o(6935835312128L, 51676);
          return true;
        }
        if (!bg.mZ(paramString.rKE)) {}
        for (paramString = paramString.rKE;; paramString = getString(R.l.eWW))
        {
          Toast.makeText(this, paramString, 0).show();
          break;
        }
      }
      if ((paramk instanceof f))
      {
        paramk = paramString;
        if (bg.mZ(paramString)) {
          paramk = getString(R.l.eZz);
        }
        com.tencent.mm.ui.base.h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6947243819008L, 51761);
            GMTrace.o(6947243819008L, 51761);
          }
        });
        GMTrace.o(6935835312128L, 51676);
        return true;
      }
    }
    GMTrace.o(6935835312128L, 51676);
    return false;
  }
  
  public void done()
  {
    GMTrace.i(6935030005760L, 51670);
    if (this.un.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.un.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoOldUI");
        localBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        boolean bool = localRealnameGuideHelper.b(this, localBundle, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6984422129664L, 52038);
            WalletOrderInfoOldUI.this.bxI();
            GMTrace.o(6984422129664L, 52038);
          }
        });
        this.un.remove("key_realname_guide_helper");
        if (!bool) {
          bxI();
        }
      }
      GMTrace.o(6935030005760L, 51670);
      return;
    }
    bxI();
    GMTrace.o(6935030005760L, 51670);
  }
  
  public final String ed(long paramLong)
  {
    GMTrace.i(6935969529856L, 51677);
    if (this.rVz.containsKey(Long.valueOf(paramLong)))
    {
      String str = (String)this.rVz.get(Long.valueOf(paramLong));
      GMTrace.o(6935969529856L, 51677);
      return str;
    }
    GMTrace.o(6935969529856L, 51677);
    return "-1";
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6932748304384L, 51653);
    int i = R.i.cJi;
    GMTrace.o(6932748304384L, 51653);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6935566876672L, 51674);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.WalletOrderInfoOldUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1) {
      l(new com.tencent.mm.plugin.wallet_core.b.o(this.rVA.rKS, this.rVA.rVp, this.rVA.rVq, this.rVA.rVr, this.rVA.fCP, this.rVA.oWy, this.rVA.rQh));
    }
    GMTrace.o(6935566876672L, 51674);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6933016739840L, 51655);
    super.onCreate(paramBundle);
    sh(4);
    this.rUz = new HashSet();
    PU();
    MH();
    hz(1979);
    com.tencent.mm.sdk.b.a.uLm.b(this.rVl);
    com.tencent.mm.sdk.b.a.uLm.b(this.opz);
    this.rVB = false;
    GMTrace.o(6933016739840L, 51655);
  }
  
  @Deprecated
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(6935432658944L, 51673);
    Dialog localDialog = com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.eWg), getResources().getStringArray(R.c.aMU), "", new h.c()
    {
      public final void hC(int paramAnonymousInt)
      {
        GMTrace.i(6979590291456L, 52002);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(6979590291456L, 52002);
          return;
          WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this, false);
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletOrderInfoOldUI.this.osA));
          localIntent.addFlags(268435456);
          WalletOrderInfoOldUI.this.startActivity(localIntent);
        }
      }
    });
    GMTrace.o(6935432658944L, 51673);
    return localDialog;
  }
  
  public void onDestroy()
  {
    GMTrace.i(6934895788032L, 51669);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.uLm.c(this.rVl);
    com.tencent.mm.sdk.b.a.uLm.c(this.opz);
    hA(1979);
    GMTrace.o(6934895788032L, 51669);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6935298441216L, 51672);
    if (paramInt == 4)
    {
      done();
      GMTrace.o(6935298441216L, 51672);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6935298441216L, 51672);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(16141963493376L, 120267);
    super.onResume();
    w.i("MicroMsg.WalletOrderInfoOldUI", "onResume, isClickActivityTinyApp: %s", new Object[] { Boolean.valueOf(this.rVB) });
    if (this.rVB) {
      l(new com.tencent.mm.plugin.wallet_core.b.o(this.rVA.rKS, this.rVA.rVp, this.rVA.rVq, this.rVA.rVr, this.rVA.fCP, this.rVA.oWy, this.rVA.rQh));
    }
    GMTrace.o(16141963493376L, 120267);
  }
  
  public final class a
    extends BaseAdapter
  {
    public a()
    {
      GMTrace.i(6919460749312L, 51554);
      GMTrace.o(6919460749312L, 51554);
    }
    
    private Orders.Commodity wE(int paramInt)
    {
      GMTrace.i(6919729184768L, 51556);
      Orders.Commodity localCommodity = (Orders.Commodity)WalletOrderInfoOldUI.this.rUA.get(paramInt);
      GMTrace.o(6919729184768L, 51556);
      return localCommodity;
    }
    
    public final int getCount()
    {
      GMTrace.i(6919594967040L, 51555);
      if (WalletOrderInfoOldUI.this.rUA != null)
      {
        int i = WalletOrderInfoOldUI.this.rUA.size();
        GMTrace.o(6919594967040L, 51555);
        return i;
      }
      GMTrace.o(6919594967040L, 51555);
      return 0;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6919863402496L, 51557);
      long l = paramInt;
      GMTrace.o(6919863402496L, 51557);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6919997620224L, 51558);
      final Orders.Commodity localCommodity;
      if (paramView == null)
      {
        paramView = View.inflate(WalletOrderInfoOldUI.this, R.i.diT, null);
        paramViewGroup = new a();
        paramViewGroup.rVH = ((TextView)paramView.findViewById(R.h.cJk));
        paramViewGroup.iiN = ((TextView)paramView.findViewById(R.h.cJo));
        paramViewGroup.rVK = ((TextView)paramView.findViewById(R.h.cJG));
        paramViewGroup.rVI = ((TextView)paramView.findViewById(R.h.cJL));
        paramViewGroup.rVJ = ((TextView)paramView.findViewById(R.h.cJz));
        paramViewGroup.rVJ.getPaint().setFlags(16);
        paramViewGroup.rVL = ((TextView)paramView.findViewById(R.h.cJM));
        paramViewGroup.rVM = ((TextView)paramView.findViewById(R.h.cJn));
        paramViewGroup.rVN = ((TextView)paramView.findViewById(R.h.cJj));
        paramViewGroup.rVP = ((MaxListView)paramView.findViewById(R.h.cJB));
        paramViewGroup.rVQ = paramView.findViewById(R.h.cJr);
        paramViewGroup.rVO = paramView.findViewById(R.h.cJE);
        paramViewGroup.rVS = ((TextView)paramView.findViewById(R.h.cJN));
        paramViewGroup.rVR = ((TextView)paramView.findViewById(R.h.cJO));
        paramViewGroup.rVT = ((TextView)paramView.findViewById(R.h.cJP));
        paramViewGroup.rVU = ((TextView)paramView.findViewById(R.h.cJQ));
        paramViewGroup.rVW = ((ViewGroup)paramView.findViewById(R.h.cJI));
        paramViewGroup.rUT = ((CdnImageView)paramView.findViewById(R.h.cAZ));
        paramViewGroup.rUU = ((TextView)paramView.findViewById(R.h.cAV));
        paramViewGroup.rUV = ((TextView)paramView.findViewById(R.h.cBa));
        paramViewGroup.rVV = paramView.findViewById(R.h.cJF);
        paramView.setTag(paramViewGroup);
        localCommodity = wE(paramInt);
        if ((localCommodity == null) || (paramViewGroup == null)) {
          break label1201;
        }
        WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this, localCommodity.fKK);
        paramViewGroup.rVI.setText(e.d(localCommodity.kKX, localCommodity.ori));
        if ((localCommodity.rPx < 0.0D) || (localCommodity.kKX >= localCommodity.rPx)) {
          break label656;
        }
        paramViewGroup.rVJ.setText(e.d(localCommodity.rPx, localCommodity.ori));
        paramViewGroup.rVJ.setVisibility(0);
      }
      Object localObject1;
      Object localObject2;
      for (;;)
      {
        localObject1 = (LinearLayout)paramViewGroup.rVQ;
        localObject2 = localCommodity.rPA;
        ((LinearLayout)localObject1).removeAllViews();
        if ((localObject2 == null) || (((List)localObject2).size() <= 0)) {
          break label668;
        }
        paramInt = 0;
        while (paramInt < ((List)localObject2).size())
        {
          Orders.DiscountInfo localDiscountInfo = (Orders.DiscountInfo)((List)localObject2).get(paramInt);
          TextView localTextView = new TextView(WalletOrderInfoOldUI.this.vov.voR);
          LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
          localLayoutParams.bottomMargin = WalletOrderInfoOldUI.this.vov.voR.getResources().getDimensionPixelOffset(R.f.aQX);
          localTextView.setLayoutParams(localLayoutParams);
          localTextView.setTextAppearance(WalletOrderInfoOldUI.this.vov.voR, R.m.fdl);
          localTextView.setText(localDiscountInfo.rFJ + e.d(localDiscountInfo.rPK / 100.0D, WalletOrderInfoOldUI.this.rGT.ori));
          ((LinearLayout)localObject1).addView(localTextView);
          localTextView.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(R.e.aQF));
          paramInt += 1;
        }
        paramViewGroup = (a)paramView.getTag();
        break;
        label656:
        paramViewGroup.rVJ.setVisibility(8);
      }
      label668:
      if (((LinearLayout)localObject1).getChildCount() > 0)
      {
        ((LinearLayout)localObject1).setVisibility(0);
        localObject2 = paramViewGroup.rVH;
        localObject1 = WalletOrderInfoOldUI.this;
        if (!com.tencent.mm.x.m.zS()) {
          break label1221;
        }
        localObject1 = ((Context)localObject1).getString(R.l.eWf);
        label710:
        ((TextView)localObject2).setText((CharSequence)localObject1);
        paramViewGroup.rVK.setText(localCommodity.oqX);
        paramViewGroup.iiN.setText(localCommodity.desc);
        paramViewGroup.iiN.setTag(localCommodity.desc);
        paramViewGroup.iiN.setOnLongClickListener(WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this));
        paramViewGroup.iiN.setBackgroundResource(R.g.bfq);
        paramViewGroup.rVL.setText(localCommodity.fKK);
        paramViewGroup.rVL.setTag(localCommodity.fKK);
        paramViewGroup.rVL.setOnLongClickListener(WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this));
        paramViewGroup.rVL.setBackgroundResource(R.g.bfq);
        paramViewGroup.rVM.setText(e.Ef(localCommodity.ore));
        paramViewGroup.rVN.setText(localCommodity.org);
        localObject1 = localCommodity.rPB;
        if (paramViewGroup.rVT != null)
        {
          if (bg.mZ((String)localObject1)) {
            break label1234;
          }
          paramViewGroup.rVT.setText((CharSequence)localObject1);
          paramViewGroup.rVT.setVisibility(0);
          paramViewGroup.rVU.setVisibility(0);
        }
        label899:
        localObject1 = localCommodity.rPC;
        if (paramViewGroup.rVS != null)
        {
          if (bg.mZ((String)localObject1)) {
            break label1255;
          }
          paramViewGroup.rVS.setText((CharSequence)localObject1);
          paramViewGroup.rVS.setVisibility(0);
          paramViewGroup.rVR.setVisibility(0);
        }
        label946:
        if (localCommodity.rPE.size() <= 0) {
          break label1276;
        }
        localObject1 = (Orders.b)localCommodity.rPE.get(0);
        com.tencent.mm.plugin.report.service.g.paX.i(13033, new Object[] { Integer.valueOf(1), ((Orders.b)localObject1).orj, ((Orders.b)localObject1).url, ((Orders.b)localObject1).name, WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this) });
        WalletOrderInfoOldUI.this.rVy = new WalletOrderInfoOldUI.c(WalletOrderInfoOldUI.this, localCommodity.rPE);
        paramViewGroup.rVP.setAdapter(WalletOrderInfoOldUI.this.rVy);
        paramViewGroup.rVP.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(6994488459264L, 52113);
            paramAnonymousAdapterView = WalletOrderInfoOldUI.this.rVy.wF(paramAnonymousInt);
            if (!bg.mZ(paramAnonymousAdapterView.orj))
            {
              if (WalletOrderInfoOldUI.this.rUz.contains(paramAnonymousAdapterView.orj)) {
                WalletOrderInfoOldUI.this.rUz.remove(paramAnonymousAdapterView.orj);
              }
              for (;;)
              {
                WalletOrderInfoOldUI.this.rVv.notifyDataSetChanged();
                GMTrace.o(6994488459264L, 52113);
                return;
                WalletOrderInfoOldUI.this.rUz.add(paramAnonymousAdapterView.orj);
              }
            }
            paramAnonymousView = WalletOrderInfoOldUI.this.ed(paramAnonymousAdapterView.rPN);
            if (("-1".equals(paramAnonymousView)) || ("3".equals(paramAnonymousView)))
            {
              com.tencent.mm.plugin.report.service.g.paX.i(13472, new Object[] { WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this), Integer.valueOf(paramAnonymousAdapterView.rPO), Integer.valueOf(1), Long.valueOf(paramAnonymousAdapterView.rPN), Long.valueOf(paramAnonymousAdapterView.rPV) });
              com.tencent.mm.plugin.report.service.g.paX.i(13033, new Object[] { Integer.valueOf(2), "", paramAnonymousAdapterView.url, paramAnonymousAdapterView.name, "" });
              if ((!bg.mZ(paramAnonymousAdapterView.rPT)) && (!bg.mZ(paramAnonymousAdapterView.rPU)))
              {
                w.i("MicroMsg.WalletOrderInfoOldUI", "promotion jump tiny app, username: %s, path: %s", new Object[] { paramAnonymousAdapterView.rPT, paramAnonymousAdapterView.rPU });
                paramAnonymousView = new px();
                paramAnonymousView.fNL.userName = paramAnonymousAdapterView.rPT;
                paramAnonymousView.fNL.fNN = bg.ap(paramAnonymousAdapterView.rPU, "");
                paramAnonymousView.fNL.scene = 1060;
                paramAnonymousView.fNL.fty = WalletOrderInfoOldUI.this.onw;
                paramAnonymousView.fNL.fNO = 0;
                com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
                com.tencent.mm.plugin.report.service.g.paX.i(14118, new Object[] { WalletOrderInfoOldUI.this.onw, WalletOrderInfoOldUI.this.bvp(), Integer.valueOf(2) });
                WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this, new WalletOrderInfoOldUI.d(WalletOrderInfoOldUI.this, paramAnonymousAdapterView.rPN, paramAnonymousAdapterView.rPP, paramAnonymousAdapterView.rPQ, paramAnonymousAdapterView.rPR, WalletOrderInfoOldUI.this.bvp(), WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this), paramAnonymousAdapterView.rPV));
                WalletOrderInfoOldUI.a(WalletOrderInfoOldUI.this, true);
                GMTrace.o(6994488459264L, 52113);
                return;
              }
              if (paramAnonymousAdapterView.rPO == 1)
              {
                WalletOrderInfoOldUI.this.a(paramAnonymousAdapterView);
                GMTrace.o(6994488459264L, 52113);
                return;
              }
              if ((paramAnonymousAdapterView.rPO == 2) && (!bg.mZ(paramAnonymousAdapterView.url)))
              {
                if (WalletOrderInfoOldUI.c(WalletOrderInfoOldUI.this).containsKey(paramAnonymousAdapterView.rPN))
                {
                  paramAnonymousAdapterView = (WalletOrderInfoOldUI.b)WalletOrderInfoOldUI.c(WalletOrderInfoOldUI.this).get(paramAnonymousAdapterView.rPN);
                  w.i("MicroMsg.WalletOrderInfoOldUI", "go to new url %s", new Object[] { paramAnonymousAdapterView.url });
                  WalletOrderInfoOldUI.this.JH(paramAnonymousAdapterView.url);
                  GMTrace.o(6994488459264L, 52113);
                  return;
                }
                WalletOrderInfoOldUI.this.rUH = paramAnonymousAdapterView.url;
                WalletOrderInfoOldUI.this.a(paramAnonymousAdapterView.url, new WalletOrderInfoOldUI.d(WalletOrderInfoOldUI.this, paramAnonymousAdapterView.rPN, paramAnonymousAdapterView.rPP, paramAnonymousAdapterView.rPQ, paramAnonymousAdapterView.rPR, WalletOrderInfoOldUI.this.bvp(), WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this), paramAnonymousAdapterView.rPV));
                GMTrace.o(6994488459264L, 52113);
                return;
              }
              w.e("MicroMsg.WalletOrderInfoOldUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
            }
            GMTrace.o(6994488459264L, 52113);
          }
        });
        WalletOrderInfoOldUI.this.rVy.notifyDataSetChanged();
        paramViewGroup.rVP.setVisibility(0);
        paramViewGroup.rVO.setVisibility(0);
        label1107:
        if ((localCommodity.rPD == null) || (bg.mZ(localCommodity.rPD.rPZ))) {
          break label1306;
        }
        paramViewGroup.rUT.O(localCommodity.rPD.rPX, 0, 0);
        paramViewGroup.rUU.setText(localCommodity.rPD.rPY);
        paramViewGroup.rUV.setText(localCommodity.rPD.rPW);
        paramViewGroup.rVW.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6964557905920L, 51890);
            paramAnonymousView = new px();
            paramAnonymousView.fNL.userName = localCommodity.rPD.rPZ;
            paramAnonymousView.fNL.fNN = bg.ap(localCommodity.rPD.rQa, "");
            paramAnonymousView.fNL.scene = 1034;
            paramAnonymousView.fNL.fNO = 0;
            com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
            com.tencent.mm.plugin.report.service.g.paX.i(14118, new Object[] { WalletOrderInfoOldUI.this.onw, WalletOrderInfoOldUI.this.bvp(), Integer.valueOf(1) });
            GMTrace.o(6964557905920L, 51890);
          }
        });
        paramViewGroup.rVV.setVisibility(0);
      }
      for (;;)
      {
        label1201:
        GMTrace.o(6919997620224L, 51558);
        return paramView;
        ((LinearLayout)localObject1).setVisibility(8);
        break;
        label1221:
        localObject1 = ((Context)localObject1).getString(R.l.eWe);
        break label710;
        label1234:
        paramViewGroup.rVU.setVisibility(8);
        paramViewGroup.rVT.setVisibility(8);
        break label899;
        label1255:
        paramViewGroup.rVR.setVisibility(8);
        paramViewGroup.rVS.setVisibility(8);
        break label946;
        label1276:
        paramViewGroup.rVP.setVisibility(8);
        paramViewGroup.rVW.setVisibility(8);
        paramViewGroup.rVO.setVisibility(8);
        break label1107;
        label1306:
        paramViewGroup.rVW.setVisibility(8);
        paramViewGroup.rVV.setVisibility(8);
      }
    }
    
    final class a
    {
      TextView iiN;
      CdnImageView rUT;
      TextView rUU;
      TextView rUV;
      TextView rVH;
      TextView rVI;
      TextView rVJ;
      TextView rVK;
      TextView rVL;
      TextView rVM;
      TextView rVN;
      View rVO;
      MaxListView rVP;
      View rVQ;
      TextView rVR;
      TextView rVS;
      TextView rVT;
      TextView rVU;
      View rVV;
      ViewGroup rVW;
      
      a()
      {
        GMTrace.i(6996501725184L, 52128);
        GMTrace.o(6996501725184L, 52128);
      }
    }
  }
  
  final class b
  {
    public String fEM;
    public String fJv;
    public String rVo;
    public String title;
    public String url;
    
    public b(JSONObject paramJSONObject)
    {
      GMTrace.i(6927782248448L, 51616);
      if (paramJSONObject == null)
      {
        GMTrace.o(6927782248448L, 51616);
        return;
      }
      this$1 = paramJSONObject.optJSONObject("activity_change_info");
      if (WalletOrderInfoOldUI.this != null)
      {
        this.url = WalletOrderInfoOldUI.this.optString("url");
        this.fEM = WalletOrderInfoOldUI.this.optString("wording");
        this.fJv = WalletOrderInfoOldUI.this.optString("icon");
        this.rVo = WalletOrderInfoOldUI.this.optString("btn_text");
        this.title = WalletOrderInfoOldUI.this.optString("title");
      }
      GMTrace.o(6927782248448L, 51616);
    }
    
    public final String toString()
    {
      GMTrace.i(6927916466176L, 51617);
      String str = this.url + " , " + this.fEM + " , " + this.fJv + " , " + this.rVo + " , " + this.title;
      GMTrace.o(6927916466176L, 51617);
      return str;
    }
  }
  
  final class c
    extends BaseAdapter
  {
    protected List<Orders.b> rPE;
    
    public c()
    {
      GMTrace.i(6948183343104L, 51768);
      this.rPE = null;
      this.rPE = new ArrayList();
      Object localObject;
      int j = ((List)localObject).size();
      int i = 0;
      while (i < j)
      {
        this$1 = (Orders.b)((List)localObject).get(i);
        if ((WalletOrderInfoOldUI.this != null) && ((!bg.mZ(WalletOrderInfoOldUI.this.orj)) || (WalletOrderInfoOldUI.this.rPO == 2) || (WalletOrderInfoOldUI.this.rPO == 1))) {
          this.rPE.add(((List)localObject).get(i));
        }
        i += 1;
      }
      GMTrace.o(6948183343104L, 51768);
    }
    
    public final int getCount()
    {
      GMTrace.i(6948317560832L, 51769);
      if (this.rPE != null)
      {
        int i = this.rPE.size();
        GMTrace.o(6948317560832L, 51769);
        return i;
      }
      GMTrace.o(6948317560832L, 51769);
      return 0;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6948585996288L, 51771);
      long l = paramInt;
      GMTrace.o(6948585996288L, 51771);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6948720214016L, 51772);
      Orders.b localb = wF(paramInt);
      Object localObject;
      if ((bg.mZ(localb.orj)) && (localb.rPN > 0L))
      {
        localObject = WalletOrderInfoOldUI.this.ed(localb.rPN);
        com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.paX;
        String str = WalletOrderInfoOldUI.b(WalletOrderInfoOldUI.this);
        paramInt = localb.rPO;
        paramViewGroup = (ViewGroup)localObject;
        if ("-1".equals(localObject)) {
          paramViewGroup = Integer.valueOf(5);
        }
        localg.i(13471, new Object[] { str, Integer.valueOf(1), Integer.valueOf(paramInt), paramViewGroup, Long.valueOf(localb.rPN), Long.valueOf(localb.rPV) });
      }
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramViewGroup.type = localb.type;
        if (localb.type == Orders.rPw) {
          if (localb.rPM == 1)
          {
            paramView = View.inflate(WalletOrderInfoOldUI.this, R.i.diU, null);
            paramViewGroup.rVX = ((CdnImageView)paramView.findViewById(R.h.cJw));
            paramViewGroup.iin = ((TextView)paramView.findViewById(R.h.cJJ));
            paramViewGroup.rVY = ((TextView)paramView.findViewById(R.h.cJm));
            paramViewGroup.inV = ((TextView)paramView.findViewById(R.h.cJy));
            if (!TextUtils.isEmpty(localb.url)) {
              WalletOrderInfoOldUI.this.rVx.put(localb.url, paramViewGroup.rVY);
            }
            paramView.setTag(paramViewGroup);
            paramViewGroup.rPM = localb.rPM;
          }
        }
      }
      label301:
      label404:
      label467:
      label502:
      label1351:
      label1392:
      label1403:
      label1430:
      label1482:
      label1633:
      for (;;)
      {
        if (localb != null)
        {
          localObject = (WalletOrderInfoOldUI.b)WalletOrderInfoOldUI.c(WalletOrderInfoOldUI.this).get(localb.rPN);
          w.i("MicroMsg.WalletOrderInfoOldUI", "try get result " + localObject);
          if (localObject == null) {
            break label1351;
          }
          paramViewGroup.rVX.O(((WalletOrderInfoOldUI.b)localObject).fJv, 0, 0);
          paramViewGroup.inV.setText(((WalletOrderInfoOldUI.b)localObject).fEM);
          paramViewGroup.rVY.setText(((WalletOrderInfoOldUI.b)localObject).rVo);
          if (bg.mZ(localb.orj)) {
            break label1403;
          }
          paramViewGroup.rVY.setVisibility(8);
          if (paramViewGroup.rVZ != null)
          {
            paramViewGroup.rVZ.setVisibility(0);
            if (!WalletOrderInfoOldUI.this.rUz.contains(localb.orj)) {
              break label1392;
            }
            paramViewGroup.rVZ.setChecked(true);
          }
          if ((paramViewGroup.iin == null) || (localObject == null) || (bg.mZ(((WalletOrderInfoOldUI.b)localObject).title))) {
            break label1430;
          }
          paramViewGroup.iin.setText(((WalletOrderInfoOldUI.b)localObject).title);
          if ((!bg.mZ(WalletOrderInfoOldUI.this.rUH)) && (paramViewGroup.rVY != null))
          {
            paramViewGroup.rVY.setClickable(WalletOrderInfoOldUI.this.fuL);
            paramViewGroup.rVY.setEnabled(WalletOrderInfoOldUI.this.fuL);
            paramViewGroup.rVY.setOnClickListener(null);
            if (WalletOrderInfoOldUI.this.fuM) {
              paramViewGroup.rVY.setVisibility(8);
            }
          }
          long l = localb.rPN;
          localObject = WalletOrderInfoOldUI.this.ed(l);
          if (!((String)localObject).equals("0")) {
            break label1482;
          }
          paramViewGroup.rVY.setBackgroundColor(WalletOrderInfoOldUI.this.getResources().getColor(R.e.transparent));
          paramViewGroup.rVY.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(R.e.aQR));
        }
        for (;;)
        {
          if (paramViewGroup.rVY != null)
          {
            paramInt = BackwardSupportUtil.b.a(WalletOrderInfoOldUI.this.vov.voR, 15.0F);
            i = BackwardSupportUtil.b.a(WalletOrderInfoOldUI.this.vov.voR, 5.0F);
            paramViewGroup.rVY.setPadding(paramInt, i, paramInt, i);
          }
          GMTrace.o(6948720214016L, 51772);
          return paramView;
          paramView = View.inflate(WalletOrderInfoOldUI.this, R.i.diV, null);
          paramViewGroup.rVX = ((CdnImageView)paramView.findViewById(R.h.cJw));
          paramViewGroup.rVY = ((TextView)paramView.findViewById(R.h.cJm));
          paramViewGroup.inV = ((TextView)paramView.findViewById(R.h.cJy));
          paramViewGroup.iin = ((TextView)paramView.findViewById(R.h.cJJ));
          if (!TextUtils.isEmpty(localb.url)) {
            WalletOrderInfoOldUI.this.rVx.put(localb.url, paramViewGroup.rVY);
          }
          paramView.setTag(paramViewGroup);
          break;
          paramView = View.inflate(WalletOrderInfoOldUI.this, R.i.diW, null);
          paramViewGroup.rVX = ((CdnImageView)paramView.findViewById(R.h.cJw));
          paramViewGroup.rVY = ((TextView)paramView.findViewById(R.h.cJm));
          paramViewGroup.inV = ((TextView)paramView.findViewById(R.h.cJy));
          paramViewGroup.rVZ = ((CheckBox)paramView.findViewById(R.h.bhl));
          if (!TextUtils.isEmpty(localb.url)) {
            WalletOrderInfoOldUI.this.rVx.put(localb.url, paramViewGroup.rVY);
          }
          paramView.setTag(paramViewGroup);
          break label301;
          paramViewGroup = (a)paramView.getTag();
          int i = 0;
          paramInt = i;
          if (localb.type == paramViewGroup.type) {
            if (localb.type == Orders.rPw)
            {
              paramInt = i;
              if (localb.rPM != paramViewGroup.rPM) {}
            }
            else
            {
              paramInt = 1;
            }
          }
          if (paramInt != 0) {
            break label1633;
          }
          paramViewGroup = new a();
          paramViewGroup.type = localb.type;
          if (localb.type == Orders.rPw)
          {
            if (localb.rPM == 1)
            {
              paramView = View.inflate(WalletOrderInfoOldUI.this, R.i.diU, null);
              paramViewGroup.rVX = ((CdnImageView)paramView.findViewById(R.h.cJw));
              paramViewGroup.iin = ((TextView)paramView.findViewById(R.h.cJJ));
              paramViewGroup.rVY = ((TextView)paramView.findViewById(R.h.cJm));
              paramViewGroup.inV = ((TextView)paramView.findViewById(R.h.cJy));
              if (!TextUtils.isEmpty(localb.url)) {
                WalletOrderInfoOldUI.this.rVx.put(localb.url, paramViewGroup.rVY);
              }
              paramView.setTag(paramViewGroup);
            }
            for (;;)
            {
              paramViewGroup.rPM = localb.rPM;
              break;
              paramView = View.inflate(WalletOrderInfoOldUI.this, R.i.diV, null);
              paramViewGroup.rVX = ((CdnImageView)paramView.findViewById(R.h.cJw));
              paramViewGroup.rVY = ((TextView)paramView.findViewById(R.h.cJm));
              paramViewGroup.inV = ((TextView)paramView.findViewById(R.h.cJy));
              paramViewGroup.iin = ((TextView)paramView.findViewById(R.h.cJJ));
              if (!TextUtils.isEmpty(localb.url)) {
                WalletOrderInfoOldUI.this.rVx.put(localb.url, paramViewGroup.rVY);
              }
              paramView.setTag(paramViewGroup);
            }
          }
          paramView = View.inflate(WalletOrderInfoOldUI.this, R.i.diW, null);
          paramViewGroup.rVX = ((CdnImageView)paramView.findViewById(R.h.cJw));
          paramViewGroup.rVY = ((TextView)paramView.findViewById(R.h.cJm));
          paramViewGroup.inV = ((TextView)paramView.findViewById(R.h.cJy));
          paramViewGroup.rVZ = ((CheckBox)paramView.findViewById(R.h.bhl));
          if (!TextUtils.isEmpty(localb.url)) {
            WalletOrderInfoOldUI.this.rVx.put(localb.url, paramViewGroup.rVY);
          }
          paramView.setTag(paramViewGroup);
          break label301;
          paramViewGroup.rVX.O(localb.ovK, 0, 0);
          paramViewGroup.inV.setText(localb.name);
          paramViewGroup.rVY.setText(localb.rPL);
          break label404;
          paramViewGroup.rVZ.setChecked(false);
          break label467;
          paramViewGroup.rVY.setVisibility(0);
          if (paramViewGroup.rVZ == null) {
            break label467;
          }
          paramViewGroup.rVZ.setVisibility(8);
          break label467;
          if ((paramViewGroup.iin != null) && (!bg.mZ(localb.title)))
          {
            paramViewGroup.iin.setText(localb.title);
            break label502;
          }
          if (paramViewGroup.iin == null) {
            break label502;
          }
          paramViewGroup.iin.setVisibility(8);
          break label502;
          if ((((String)localObject).equals("-1")) || (((String)localObject).equals("3")))
          {
            paramViewGroup.rVY.setBackgroundDrawable(WalletOrderInfoOldUI.this.getResources().getDrawable(R.g.aWR));
            paramViewGroup.rVY.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(R.e.aQR));
          }
          else if ((((String)localObject).equals("4")) || (((String)localObject).equals("2")) || (((String)localObject).equals("1")))
          {
            paramViewGroup.rVY.setBackgroundColor(WalletOrderInfoOldUI.this.getResources().getColor(R.e.transparent));
            paramViewGroup.rVY.setTextColor(WalletOrderInfoOldUI.this.getResources().getColor(R.e.aOI));
          }
          else
          {
            w.e("MicroMsg.WalletOrderInfoOldUI", "PromotionsAdapter unknow award state");
          }
        }
      }
    }
    
    public final Orders.b wF(int paramInt)
    {
      GMTrace.i(6948451778560L, 51770);
      Orders.b localb = (Orders.b)this.rPE.get(paramInt);
      GMTrace.o(6948451778560L, 51770);
      return localb;
    }
    
    final class a
    {
      TextView iin;
      TextView inV;
      int rPM;
      CdnImageView rVX;
      TextView rVY;
      CheckBox rVZ;
      int type;
      
      a()
      {
        GMTrace.i(6954357358592L, 51814);
        GMTrace.o(6954357358592L, 51814);
      }
    }
  }
  
  final class d
  {
    public String fCP;
    public String oWy;
    public String rKS;
    public long rQh;
    public String rVp;
    public String rVq;
    public String rVr;
    
    public d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong)
    {
      GMTrace.i(16143171452928L, 120276);
      this.rKS = paramString1;
      this.rVp = paramString2;
      this.rVq = paramString3;
      this.rVr = paramString4;
      this.fCP = paramString5;
      this.oWy = paramString6;
      this.rQh = paramLong;
      GMTrace.o(16143171452928L, 120276);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */