package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet_core.d.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.j;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.MMScrollView.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.LinkedList;
import java.util.List;

public class WalletCardImportUI
  extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private static final String[] rTo;
  private com.tencent.mm.sdk.platformtools.ae mHandler;
  private String nrq;
  private String nrr;
  private Orders oZx;
  private Dialog oe;
  private Button rFt;
  private Authen rGU;
  private PayInfo rHl;
  private WalletFormView rJu;
  private int rJy;
  private ElementQuery rLN;
  private WalletFormView rSN;
  private WalletFormView rSO;
  private WalletFormView rSP;
  private WalletFormView rSQ;
  private WalletFormView rSR;
  private WalletFormView rSU;
  private WalletFormView rSV;
  private WalletFormView rSW;
  private WalletFormView rSX;
  private WalletFormView rSY;
  private WalletFormView rSZ;
  private WalletFormView rSu;
  private WalletFormView rTa;
  private WalletFormView rTc;
  private WalletFormView rTd;
  private CheckBox rTh;
  private String rTi;
  private TextView rTp;
  private MMScrollView rTq;
  private Bankcard rTr;
  private CheckBox rTs;
  private BaseAdapter rTt;
  
  static
  {
    GMTrace.i(6976905936896L, 51982);
    rTo = new String[] { "ABC_DEBIT", "ABC_CREDIT", "CITIC_CREDIT", "CMBC_DEBIT", "HSBC_DEBIT" };
    GMTrace.o(6976905936896L, 51982);
  }
  
  public WalletCardImportUI()
  {
    GMTrace.i(6973550493696L, 51957);
    this.oe = null;
    this.rTc = null;
    this.mHandler = new com.tencent.mm.sdk.platformtools.ae();
    this.rLN = new ElementQuery();
    this.rGU = new Authen();
    this.oZx = null;
    this.rHl = null;
    this.rTr = null;
    this.rJy = 1;
    this.rTt = new BaseAdapter()
    {
      private Integer wC(int paramAnonymousInt)
      {
        GMTrace.i(6947646472192L, 51764);
        Integer localInteger = (Integer)WalletCardImportUI.c(WalletCardImportUI.this).bwu().get(paramAnonymousInt);
        GMTrace.o(6947646472192L, 51764);
        return localInteger;
      }
      
      public final int getCount()
      {
        GMTrace.i(6947512254464L, 51763);
        if (WalletCardImportUI.c(WalletCardImportUI.this).bwu() != null)
        {
          int i = WalletCardImportUI.c(WalletCardImportUI.this).bwu().size();
          GMTrace.o(6947512254464L, 51763);
          return i;
        }
        GMTrace.o(6947512254464L, 51763);
        return 0;
      }
      
      public final long getItemId(int paramAnonymousInt)
      {
        GMTrace.i(6947780689920L, 51765);
        long l = paramAnonymousInt;
        GMTrace.o(6947780689920L, 51765);
        return l;
      }
      
      public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
      {
        GMTrace.i(6947914907648L, 51766);
        paramAnonymousView = (CheckedTextView)View.inflate(WalletCardImportUI.this, R.i.diD, null);
        paramAnonymousView.setText(com.tencent.mm.plugin.wallet_core.model.m.bwM().J(WalletCardImportUI.this, wC(paramAnonymousInt).intValue()));
        if (WalletCardImportUI.f(WalletCardImportUI.this) == wC(paramAnonymousInt).intValue()) {
          paramAnonymousView.setChecked(true);
        }
        for (;;)
        {
          paramAnonymousView.setBackgroundResource(R.g.aYc);
          GMTrace.o(6947914907648L, 51766);
          return paramAnonymousView;
          paramAnonymousView.setChecked(false);
        }
      }
    };
    GMTrace.o(6973550493696L, 51957);
  }
  
  private boolean QN()
  {
    GMTrace.i(6974758453248L, 51966);
    if (!this.rTs.isChecked()) {}
    for (boolean bool = false;; bool = true)
    {
      if (bool)
      {
        this.rFt.setEnabled(true);
        this.rFt.setClickable(true);
      }
      for (;;)
      {
        GMTrace.o(6974758453248L, 51966);
        return bool;
        this.rFt.setEnabled(false);
        this.rFt.setClickable(false);
      }
    }
  }
  
  private void ar()
  {
    Object localObject2 = null;
    GMTrace.i(6973953146880L, 51960);
    if (this.rTr != null)
    {
      findViewById(R.h.cID).setVisibility(0);
      Object localObject1;
      label96:
      label199:
      Object localObject3;
      if (!bg.mZ(this.un.getString("key_bank_username")))
      {
        localObject1 = this.un.getString("key_recommand_desc");
        if (bg.mZ((String)localObject1))
        {
          this.rTh.setText(getString(R.l.eTl, new Object[] { this.rTr.field_bankName }));
          this.rTh.setVisibility(0);
          this.rSU.setVisibility(8);
          this.rSV.setVisibility(8);
          this.rSW.setVisibility(8);
          this.rSX.setVisibility(8);
          this.rSY.setVisibility(8);
          this.rSZ.setVisibility(8);
          this.rTa.setVisibility(8);
          if ((bg.mZ(this.rTr.field_bankcardTail)) || (!b(this.rTd, this.rTr.rMW))) {
            break label574;
          }
          localObject1 = this.rTd;
          localObject2 = this.rTd;
          if (!this.rTr.bwo()) {
            break label588;
          }
          localObject3 = getString(R.l.eUc);
          label217:
          if ((bg.mZ(this.rTr.field_bankName)) || (!b(this.rSN, this.rTr.field_bankName + " " + (String)localObject3))) {
            break label599;
          }
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = this.rSN;
          }
          localObject3 = this.rSN;
        }
      }
      for (;;)
      {
        localObject1 = localObject2;
        if (b(this.rSu, this.rTr.field_trueName))
        {
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = this.rSu;
          }
          localObject3 = this.rSu;
        }
        localObject2 = localObject1;
        if (b(this.rSQ, com.tencent.mm.plugin.wallet_core.model.m.bwM().J(this.vov.voR, this.rTr.rMx)))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = this.rSQ;
          }
          localObject3 = this.rSQ;
        }
        localObject1 = localObject2;
        if (b(this.rJu, this.rTr.rMV))
        {
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = this.rJu;
          }
          localObject3 = this.rJu;
        }
        localObject2 = localObject1;
        if (b(this.rSR, this.rTr.field_mobile))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = this.rSR;
          }
          localObject3 = this.rSR;
        }
        localObject1 = localObject2;
        if (b(this.rSP, this.rTr.rMz))
        {
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = this.rSP;
          }
          localObject3 = this.rSP;
        }
        localObject2 = localObject1;
        if (b(this.rSO, this.rTr.rMX))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = this.rSO;
          }
          localObject3 = this.rSO;
        }
        ((WalletFormView)localObject2).setBackgroundResource(R.g.aYc);
        ((WalletFormView)localObject3).setBackgroundResource(R.g.aYc);
        if (!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwV()) {
          break label615;
        }
        this.rFt.setText(R.l.eTs);
        GMTrace.o(6973953146880L, 51960);
        return;
        this.rTh.setText((CharSequence)localObject1);
        break;
        this.rTh.setVisibility(8);
        break label96;
        label574:
        this.rTd.setVisibility(8);
        localObject1 = null;
        break label199;
        label588:
        localObject3 = getString(R.l.eUr);
        break label217;
        label599:
        this.rSN.setVisibility(8);
        localObject3 = localObject2;
        localObject2 = localObject1;
      }
      label615:
      this.rFt.setText(R.l.eTq);
      GMTrace.o(6973953146880L, 51960);
      return;
    }
    GMTrace.o(6973953146880L, 51960);
  }
  
  private static boolean b(WalletFormView paramWalletFormView, String paramString)
  {
    GMTrace.i(6974087364608L, 51961);
    if (!bg.mZ(paramString))
    {
      KeyListener localKeyListener = paramWalletFormView.getKeyListener();
      paramWalletFormView.setKeyListener(null);
      paramWalletFormView.setEnabled(false);
      paramWalletFormView.setClickable(false);
      paramWalletFormView.setText(paramString);
      paramWalletFormView.setKeyListener(localKeyListener);
      paramWalletFormView.setVisibility(0);
      GMTrace.o(6974087364608L, 51961);
      return true;
    }
    paramWalletFormView.setVisibility(8);
    GMTrace.o(6974087364608L, 51961);
    return false;
  }
  
  private void bxB()
  {
    GMTrace.i(6974221582336L, 51962);
    Object localObject;
    if (QN())
    {
      c.byf();
      this.rGU = new Authen();
      this.un.putBoolean("key_is_follow_bank_username", this.rTh.isChecked());
      if ((this.rTr != null) && (!bg.mZ(this.rTr.rNg)))
      {
        this.rGU.rEu = this.rTr.rNg;
        this.rGU.oqm = this.rTr.field_bindSerial;
        this.rGU.oql = this.rTr.field_bankcardType;
        this.rGU.rMx = this.rTr.rMx;
        this.rGU.rMu = this.un.getString("key_pwd1");
        this.rGU.token = this.un.getString("kreq_token");
        com.tencent.mm.wallet_core.a.aa(this);
        if (cjn().j(new Object[] { this.rGU, this.oZx }))
        {
          w.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
          GMTrace.o(6974221582336L, 51962);
        }
      }
      else
      {
        localObject = this.un.getString("key_card_id");
        if (this.rTd.getVisibility() != 0) {
          break label628;
        }
        localObject = this.rTd.getText();
      }
    }
    label628:
    for (;;)
    {
      this.rGU.oRb = ((PayInfo)this.un.getParcelable("key_pay_info"));
      this.rGU.rMy = ((String)localObject);
      this.rGU.oql = this.rLN.oql;
      this.rGU.rMx = this.rJy;
      this.rGU.rMu = this.un.getString("key_pwd1");
      if (!bg.mZ(this.rSP.getText())) {
        this.rGU.rMz = this.rSP.getText();
      }
      this.rGU.rKI = this.rSR.getText();
      this.rGU.rMD = this.rSU.getText();
      this.rGU.rME = this.rSV.getText();
      this.rGU.country = this.rTi;
      this.rGU.gbW = this.nrq;
      this.rGU.gbX = this.nrr;
      this.rGU.hwK = this.rSX.getText();
      this.rGU.mVx = this.rSY.getText();
      this.rGU.imw = this.rSZ.getText();
      this.rGU.gbP = this.rTa.getText();
      localObject = e.WD(this.rGU.rKI);
      this.un.putString("key_mobile", (String)localObject);
      localObject = this.un;
      if (this.rLN.rKN == 2) {}
      for (boolean bool = true;; bool = false)
      {
        ((Bundle)localObject).putBoolean("key_is_oversea", bool);
        this.rGU.rMw = this.rJu.getText();
        this.rGU.rMv = this.rSu.getText();
        this.rGU.rMA = this.rSO.getText();
        w.d("MicroMsg.WalletCardElmentUI", "payInfo " + this.rGU.oRb + " elemt.bankcardTag : " + this.rLN.rKN);
        break;
      }
      w.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
      GMTrace.o(6974221582336L, 51962);
      return;
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(6973818929152L, 51959);
    this.rTd = ((WalletFormView)findViewById(R.h.cIw));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rTd);
    this.rSR = ((WalletFormView)findViewById(R.h.ccG));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.rSR);
    this.rSu = ((WalletFormView)findViewById(R.h.ceC));
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.rSu);
    this.rSQ = ((WalletFormView)findViewById(R.h.cIN));
    this.rJu = ((WalletFormView)findViewById(R.h.bPa));
    com.tencent.mm.wallet_core.ui.formview.a.c(this.rJu);
    this.rSN = ((WalletFormView)findViewById(R.h.cIE));
    this.rSP = ((WalletFormView)findViewById(R.h.bAb));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.rSP);
    this.rSO = ((WalletFormView)findViewById(R.h.bAf));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.rSO);
    this.rTp = ((TextView)findViewById(R.h.cJW));
    this.rSU = ((WalletFormView)findViewById(R.h.bID));
    this.rSV = ((WalletFormView)findViewById(R.h.bSQ));
    this.rSW = ((WalletFormView)findViewById(R.h.biU));
    this.rSX = ((WalletFormView)findViewById(R.h.bgO));
    this.rSY = ((WalletFormView)findViewById(R.h.cjv));
    this.rSZ = ((WalletFormView)findViewById(R.h.ckj));
    this.rTa = ((WalletFormView)findViewById(R.h.bDq));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.rTa);
    this.rTs = ((CheckBox)findViewById(R.h.bhl));
    this.rTh = ((CheckBox)findViewById(R.h.bhh));
    this.rFt = ((Button)findViewById(R.h.cgl));
    this.rTq = ((MMScrollView)findViewById(R.h.cKi));
    MMScrollView localMMScrollView = this.rTq;
    localMMScrollView.a(localMMScrollView, localMMScrollView);
    this.rTq.xhq = new MMScrollView.a()
    {
      public final void iT(boolean paramAnonymousBoolean)
      {
        GMTrace.i(6927648030720L, 51615);
        if (paramAnonymousBoolean) {}
        for (final int i = 8;; i = 0)
        {
          w.d("MicroMsg.WalletCardElmentUI", "onSizeChanged : " + paramAnonymousBoolean);
          WalletCardImportUI.b(WalletCardImportUI.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6957444366336L, 51837);
              if (i != WalletCardImportUI.a(WalletCardImportUI.this).getVisibility()) {
                WalletCardImportUI.a(WalletCardImportUI.this).setVisibility(i);
              }
              GMTrace.o(6957444366336L, 51837);
            }
          });
          GMTrace.o(6927648030720L, 51615);
          return;
        }
      }
    };
    this.rSu.xid = this;
    this.rTd.xid = this;
    this.rSQ.xid = this;
    this.rJu.xid = this;
    this.rSR.xid = this;
    this.rSP.xid = this;
    this.rSO.xid = this;
    this.rSU.xid = this;
    this.rSV.xid = this;
    this.rSW.xid = this;
    this.rSX.xid = this;
    this.rSY.xid = this;
    this.rSZ.xid = this;
    this.rTa.xid = this;
    this.rSu.setOnEditorActionListener(this);
    this.rTd.setOnEditorActionListener(this);
    this.rSQ.setOnEditorActionListener(this);
    this.rJu.setOnEditorActionListener(this);
    this.rSR.setOnEditorActionListener(this);
    this.rSP.setOnEditorActionListener(this);
    this.rSO.setOnEditorActionListener(this);
    this.rSU.setOnEditorActionListener(this);
    this.rSV.setOnEditorActionListener(this);
    this.rSW.setOnEditorActionListener(this);
    this.rSX.setOnEditorActionListener(this);
    this.rSY.setOnEditorActionListener(this);
    this.rSZ.setOnEditorActionListener(this);
    this.rTa.setOnEditorActionListener(this);
    this.rSN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6917179047936L, 51537);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putInt("key_support_bankcard", WalletCardImportUI.this.un.getInt("key_support_bankcard", 3));
        paramAnonymousView.putString("key_bank_type", WalletCardImportUI.c(WalletCardImportUI.this).oql);
        paramAnonymousView.putInt("key_bankcard_type", WalletCardImportUI.c(WalletCardImportUI.this).rNX);
        com.tencent.mm.wallet_core.a.aa(WalletCardImportUI.this).a(WalletCardImportUI.this, WalletCardSelectUI.class, paramAnonymousView, 1);
        GMTrace.o(6917179047936L, 51537);
      }
    });
    this.rSQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6997307031552L, 52134);
        WalletCardImportUI.this.showDialog(1);
        GMTrace.o(6997307031552L, 52134);
      }
    });
    this.rTs.setChecked(true);
    this.rTs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6925232111616L, 51597);
        WalletCardImportUI.d(WalletCardImportUI.this);
        GMTrace.o(6925232111616L, 51597);
      }
    });
    this.rTh.setChecked(true);
    findViewById(R.h.bhf).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7014889553920L, 52265);
        paramAnonymousView = new LinkedList();
        LinkedList localLinkedList = new LinkedList();
        paramAnonymousView.add(WalletCardImportUI.this.getString(R.l.eSV));
        localLinkedList.add(Integer.valueOf(0));
        if ((WalletCardImportUI.c(WalletCardImportUI.this) != null) && (WalletCardImportUI.c(WalletCardImportUI.this).rOp))
        {
          paramAnonymousView.add(WalletCardImportUI.this.getString(R.l.eSU));
          localLinkedList.add(Integer.valueOf(1));
        }
        h.a(WalletCardImportUI.this, "", paramAnonymousView, localLinkedList, "", new h.d()
        {
          public final void bQ(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(7021868875776L, 52317);
            Intent localIntent = new Intent();
            switch (paramAnonymous2Int1)
            {
            }
            for (;;)
            {
              localIntent.putExtra("showShare", false);
              com.tencent.mm.bi.d.b(WalletCardImportUI.this.vov.voR, "webview", ".ui.tools.WebViewUI", localIntent);
              GMTrace.o(7021868875776L, 52317);
              return;
              localIntent.putExtra("rawUrl", WalletCardImportUI.this.getString(R.l.eRQ, new Object[] { v.bMQ() }));
              continue;
              if (WalletCardImportUI.c(WalletCardImportUI.this) != null) {
                localIntent.putExtra("rawUrl", WalletCardImportUI.this.getString(R.l.eRP, new Object[] { v.bMQ(), WalletCardImportUI.c(WalletCardImportUI.this).oql }));
              }
            }
          }
        });
        GMTrace.o(7014889553920L, 52265);
      }
    });
    this.rSW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7015157989376L, 52267);
        WalletCardImportUI.this.startActivityForResult(new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true), 2);
        GMTrace.o(7015157989376L, 52267);
      }
    });
    this.rFt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6918789660672L, 51549);
        WalletCardImportUI.e(WalletCardImportUI.this);
        GMTrace.o(6918789660672L, 51549);
      }
    });
    ar();
    QN();
    GMTrace.o(6973818929152L, 51959);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6974355800064L, 51963);
    w.d("MicroMsg.WalletCardElmentUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.un;
      w.d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.rHl);
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m))
      {
        paramString.putBoolean("intent_bind_end", true);
        com.tencent.mm.wallet_core.a.i(this, paramString);
        h.bl(this, getString(R.l.eSE));
        GMTrace.o(6974355800064L, 51963);
        return true;
      }
      GMTrace.o(6974355800064L, 51963);
      return false;
    }
    GMTrace.o(6974355800064L, 51963);
    return false;
  }
  
  public final void gQ(boolean paramBoolean)
  {
    GMTrace.i(6974892670976L, 51967);
    QN();
    GMTrace.o(6974892670976L, 51967);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6974490017792L, 51964);
    int i = R.i.dii;
    GMTrace.o(6974490017792L, 51964);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6974624235520L, 51965);
    w.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(6974624235520L, 51965);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      QN();
      GMTrace.o(6974624235520L, 51965);
      return;
      this.rLN = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
      ar();
      continue;
      String str1 = paramIntent.getStringExtra("CountryName");
      String str2 = paramIntent.getStringExtra("Country");
      this.rTi = (str1 + "|" + str2);
      String str3 = paramIntent.getStringExtra("ProviceName");
      String str4 = paramIntent.getStringExtra("CityName");
      if (!bg.mZ(paramIntent.getStringExtra("Contact_City")))
      {
        this.nrq = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
        this.nrr = (str4 + "|" + paramIntent.getStringExtra("Contact_City"));
        this.rSW.setText(str1 + " " + str4);
      }
      for (;;)
      {
        if ((!"US".equals(str2)) && (!"CA".equals(str2)) && (!this.rLN.rOk)) {
          break label437;
        }
        this.rSZ.setVisibility(0);
        break;
        if (!bg.mZ(paramIntent.getStringExtra("Contact_Province")))
        {
          this.nrr = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
          this.rSW.setText(str1 + " " + str3);
        }
        else
        {
          this.nrr = this.rTi;
          this.rSW.setText(str1);
        }
      }
      label437:
      this.rSZ.setVisibility(8);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6973684711424L, 51958);
    super.onCreate(paramBundle);
    oC(R.l.eUt);
    this.rLN = ((ElementQuery)this.un.getParcelable("elemt_query"));
    this.oZx = ((Orders)this.un.getParcelable("key_orders"));
    this.rHl = ((PayInfo)this.un.getParcelable("key_pay_info"));
    this.rTr = ((Bankcard)this.un.getParcelable("key_import_bankcard"));
    if (this.rHl == null) {
      this.rHl = new PayInfo();
    }
    w.d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.rHl);
    MH();
    this.rTq.pageScroll(33);
    c.b(this, this.un, 3);
    GMTrace.o(6973684711424L, 51958);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(6975295324160L, 51970);
    switch (paramInt)
    {
    default: 
      localObject = super.onCreateDialog(paramInt);
      GMTrace.o(6975295324160L, 51970);
      return (Dialog)localObject;
    }
    Object localObject = new j(this, R.m.fdq);
    ((Dialog)localObject).setContentView(R.i.diC);
    ListView localListView = (ListView)((Dialog)localObject).findViewById(R.h.bgK);
    localListView.setAdapter(this.rTt);
    localListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6926574288896L, 51607);
        WalletCardImportUI.this.dismissDialog(1);
        paramAnonymousInt = ((Integer)WalletCardImportUI.c(WalletCardImportUI.this).bwu().get(paramAnonymousInt)).intValue();
        if (WalletCardImportUI.f(WalletCardImportUI.this) != paramAnonymousInt)
        {
          WalletCardImportUI.a(WalletCardImportUI.this, paramAnonymousInt);
          WalletCardImportUI.g(WalletCardImportUI.this).setText(((CheckedTextView)paramAnonymousView).getText().toString());
          WalletCardImportUI.c(WalletCardImportUI.h(WalletCardImportUI.this), WalletCardImportUI.f(WalletCardImportUI.this));
          WalletCardImportUI.h(WalletCardImportUI.this).aYY();
          WalletCardImportUI.i(WalletCardImportUI.this);
        }
        GMTrace.o(6926574288896L, 51607);
      }
    });
    GMTrace.o(6975295324160L, 51970);
    return (Dialog)localObject;
  }
  
  public void onDestroy()
  {
    GMTrace.i(6975161106432L, 51969);
    if ((this.oe != null) && (this.oe.isShowing()))
    {
      this.oe.dismiss();
      this.oe = null;
    }
    super.onDestroy();
    GMTrace.o(6975161106432L, 51969);
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6975026888704L, 51968);
    w.d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : " + paramInt);
    switch (paramInt)
    {
    default: 
      if (this.rTc == null) {
        bxB();
      }
      GMTrace.o(6975026888704L, 51968);
      return false;
    }
    if (this.rTc != null) {
      if ((this.rTc.isEnabled()) && (!this.rTc.isClickable()) && (this.rTc.cju())) {
        this.rTc.cjw();
      }
    }
    for (;;)
    {
      GMTrace.o(6975026888704L, 51968);
      return true;
      this.rTc.performClick();
      continue;
      bxB();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */