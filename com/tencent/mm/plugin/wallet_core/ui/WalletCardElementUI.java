package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.List;
import java.util.Map;

public class WalletCardElementUI
  extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private String countryCode;
  private String hhp;
  private String hhq;
  private String nrq;
  private String nrr;
  private Orders oZx;
  private TextView qMW;
  private Button rFt;
  private Authen rGU;
  a rHS;
  private PayInfo rHl;
  private com.tencent.mm.sdk.b.c rJr;
  private WalletFormView rJu;
  private TextView rJv;
  private TextView rJw;
  private int rJy;
  private Profession[] rKQ;
  private ElementQuery rLN;
  private Profession rLO;
  private TextView rSF;
  private TextView rSG;
  private TextView rSH;
  private TextView rSI;
  private TextView rSJ;
  private TextView rSK;
  private TextView rSL;
  private TextView rSM;
  private WalletFormView rSN;
  private WalletFormView rSO;
  private WalletFormView rSP;
  private WalletFormView rSQ;
  private WalletFormView rSR;
  private WalletFormView rSS;
  private WalletFormView rST;
  private WalletFormView rSU;
  private WalletFormView rSV;
  private WalletFormView rSW;
  private WalletFormView rSX;
  private WalletFormView rSY;
  private WalletFormView rSZ;
  private WalletFormView rSu;
  private Bankcard rSv;
  private WalletFormView rTa;
  private ScrollView rTb;
  private WalletFormView rTc;
  private WalletFormView rTd;
  private Map<String, a.a> rTe;
  private boolean rTf;
  private CheckBox rTg;
  private CheckBox rTh;
  private String rTi;
  private boolean rTj;
  private boolean rTk;
  private BaseAdapter rTl;
  private View.OnClickListener rTm;
  
  public WalletCardElementUI()
  {
    GMTrace.i(6998246555648L, 52141);
    this.rTc = null;
    this.rLN = new ElementQuery();
    this.rGU = new Authen();
    this.oZx = null;
    this.rHl = null;
    this.rSv = null;
    this.rTe = null;
    this.rHS = null;
    this.rTf = false;
    this.rJy = 1;
    this.rTl = new BaseAdapter()
    {
      private Integer wC(int paramAnonymousInt)
      {
        GMTrace.i(6962007769088L, 51871);
        Integer localInteger = (Integer)WalletCardElementUI.d(WalletCardElementUI.this).bwu().get(paramAnonymousInt);
        GMTrace.o(6962007769088L, 51871);
        return localInteger;
      }
      
      public final int getCount()
      {
        GMTrace.i(6961873551360L, 51870);
        if (WalletCardElementUI.d(WalletCardElementUI.this).bwu() != null)
        {
          int i = WalletCardElementUI.d(WalletCardElementUI.this).bwu().size();
          GMTrace.o(6961873551360L, 51870);
          return i;
        }
        GMTrace.o(6961873551360L, 51870);
        return 0;
      }
      
      public final long getItemId(int paramAnonymousInt)
      {
        GMTrace.i(6962141986816L, 51872);
        long l = paramAnonymousInt;
        GMTrace.o(6962141986816L, 51872);
        return l;
      }
      
      public final View getView(int paramAnonymousInt, View paramAnonymousView, ViewGroup paramAnonymousViewGroup)
      {
        GMTrace.i(6962276204544L, 51873);
        paramAnonymousView = (CheckedTextView)View.inflate(WalletCardElementUI.this, R.i.diD, null);
        paramAnonymousView.setText(com.tencent.mm.plugin.wallet_core.model.m.bwM().J(WalletCardElementUI.this, wC(paramAnonymousInt).intValue()));
        if (WalletCardElementUI.g(WalletCardElementUI.this) == wC(paramAnonymousInt).intValue()) {
          paramAnonymousView.setChecked(true);
        }
        for (;;)
        {
          GMTrace.o(6962276204544L, 51873);
          return paramAnonymousView;
          paramAnonymousView.setChecked(false);
        }
      }
    };
    this.rTm = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6951001915392L, 51789);
        g.paX.i(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
        e.e(WalletCardElementUI.this, com.tencent.mm.plugin.wallet_core.model.m.bwE().aoj());
        GMTrace.o(6951001915392L, 51789);
      }
    };
    this.rJr = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6998246555648L, 52141);
  }
  
  private boolean QN()
  {
    GMTrace.i(6999857168384L, 52153);
    WalletFormView localWalletFormView = this.rTc;
    this.rTc = null;
    if (!this.rSN.dI(null))
    {
      if ((this.rTc == null) && (localWalletFormView != this.rSN)) {
        this.rTc = this.rSN;
      }
      this.rSI.setText(R.l.eTa);
      this.rSI.setTextColor(getResources().getColor(R.e.aPW));
    }
    for (boolean bool1 = false;; bool1 = true)
    {
      if (!this.rSu.dI(null))
      {
        if ((this.rTc == null) && (localWalletFormView != this.rSu)) {
          this.rTc = this.rSu;
        }
        bool1 = false;
      }
      if (!this.rTd.dI(this.rSG))
      {
        if ((this.rTc == null) && (localWalletFormView != this.rTd)) {
          this.rTc = this.rTd;
        }
        bool1 = false;
      }
      int i;
      if ((!this.rJu.dI(this.rJw)) && (!this.rTf))
      {
        if ((this.rTc == null) && (localWalletFormView != this.rJu)) {
          this.rTc = this.rJu;
        }
        this.rJw.setText(R.l.cIz);
        this.rJw.setTextColor(getResources().getColor(R.e.aPW));
        i = 1;
        bool1 = false;
      }
      for (;;)
      {
        boolean bool2;
        if (!this.rSR.dI(this.rJw)) {
          if (i != 0)
          {
            this.rJw.setText(R.l.eTj);
            this.rJw.setTextColor(getResources().getColor(R.e.aPW));
            if ((this.rTc == null) && (localWalletFormView != this.rSR)) {
              this.rTc = this.rSR;
            }
            bool2 = false;
            label307:
            if (this.rJw.getVisibility() == 4)
            {
              if (!this.rLN.rNQ) {
                break label931;
              }
              this.rJw.setText(getString(R.l.eTn));
              label342:
              this.rJw.setTextColor(getResources().getColor(R.e.aOI));
              this.rJw.setVisibility(0);
            }
            if (this.rSP.dI(this.rSK)) {
              break label986;
            }
            if ((this.rTc == null) && (localWalletFormView != this.rSP)) {
              this.rTc = this.rSP;
            }
            i = 1;
            bool2 = false;
          }
        }
        for (;;)
        {
          if (!this.rSO.dI(this.rSK))
          {
            if ((this.rTc == null) && (localWalletFormView != this.rSO)) {
              this.rTc = this.rSO;
            }
            bool1 = false;
            label449:
            if (!this.rTg.isChecked()) {
              bool1 = false;
            }
            if (!this.rSU.dI(this.rSL))
            {
              if ((this.rTc == null) && (localWalletFormView != this.rSU)) {
                this.rTc = this.rSU;
              }
              bool1 = false;
            }
            if (!this.rSV.dI(this.rSL))
            {
              if ((this.rTc == null) && (localWalletFormView != this.rSV)) {
                this.rTc = this.rSV;
              }
              bool1 = false;
            }
            if (!this.rSW.dI(this.rSL))
            {
              if ((this.rTc == null) && (localWalletFormView != this.rSW)) {
                this.rTc = this.rSW;
              }
              bool1 = false;
            }
            if (!this.rSX.dI(this.rSL))
            {
              if ((this.rTc == null) && (localWalletFormView != this.rSX)) {
                this.rTc = this.rSX;
              }
              bool1 = false;
            }
            if (!this.rSY.dI(this.rSL))
            {
              if ((this.rTc == null) && (localWalletFormView != this.rSY)) {
                this.rTc = this.rSY;
              }
              bool1 = false;
            }
            if (!this.rSZ.dI(this.rSL))
            {
              if ((this.rTc == null) && (localWalletFormView != this.rSZ)) {
                this.rTc = this.rSZ;
              }
              bool1 = false;
            }
            bool2 = bool1;
            if (!this.rTa.dI(this.rSL))
            {
              if ((this.rTc == null) && (localWalletFormView != this.rTa)) {
                this.rTc = this.rTa;
              }
              bool2 = false;
            }
            bool1 = bool2;
            if (this.rTk)
            {
              bool1 = bool2;
              if (!this.rSS.dI(null))
              {
                if ((this.rTc == null) && (localWalletFormView != this.rSS)) {
                  this.rTc = this.rSS;
                }
                bool1 = false;
              }
            }
            bool2 = bool1;
            if (this.rTj)
            {
              bool2 = bool1;
              if (!this.rST.dI(null))
              {
                if ((this.rTc == null) && (localWalletFormView != this.rST)) {
                  this.rTc = this.rST;
                }
                bool2 = false;
              }
            }
            if (!bool2) {
              break label967;
            }
            this.rFt.setEnabled(true);
            this.rFt.setClickable(true);
            if (localWalletFormView != null) {
              localWalletFormView.setImeOptions(1073741824);
            }
          }
          for (;;)
          {
            GMTrace.o(6999857168384L, 52153);
            return bool2;
            this.rJw.setText(R.l.eTk);
            this.rJw.setTextColor(getResources().getColor(R.e.aPW));
            break;
            bool2 = bool1;
            if (i == 0) {
              break label307;
            }
            this.rJw.setVisibility(0);
            bool2 = bool1;
            break label307;
            label931:
            this.rJw.setText(getString(R.l.eTp));
            break label342;
            bool1 = bool2;
            if (i == 0) {
              break label449;
            }
            this.rSK.setVisibility(4);
            bool1 = bool2;
            break label449;
            label967:
            this.rFt.setEnabled(false);
            this.rFt.setClickable(false);
          }
          label986:
          i = 0;
        }
        i = 0;
      }
    }
  }
  
  private static void a(WalletFormView paramWalletFormView, int paramInt)
  {
    GMTrace.i(7000394039296L, 52157);
    paramWalletFormView = paramWalletFormView.xif;
    if ((paramWalletFormView instanceof com.tencent.mm.wallet_core.ui.formview.a.a)) {
      ((com.tencent.mm.wallet_core.ui.formview.a.a)paramWalletFormView).Ei(paramInt);
    }
    GMTrace.o(7000394039296L, 52157);
  }
  
  private static void a(WalletFormView paramWalletFormView, String paramString)
  {
    GMTrace.i(6998783426560L, 52145);
    if (!bg.mZ(paramString))
    {
      KeyListener localKeyListener = paramWalletFormView.getKeyListener();
      paramWalletFormView.setKeyListener(null);
      paramWalletFormView.setEnabled(false);
      paramWalletFormView.setClickable(false);
      paramWalletFormView.setText(paramString);
      paramWalletFormView.setKeyListener(localKeyListener);
      paramWalletFormView.setVisibility(0);
      GMTrace.o(6998783426560L, 52145);
      return;
    }
    paramWalletFormView.setVisibility(8);
    GMTrace.o(6998783426560L, 52145);
  }
  
  private static void a(boolean[] paramArrayOfBoolean, WalletFormView[] paramArrayOfWalletFormView, TextView paramTextView1, TextView paramTextView2)
  {
    GMTrace.i(6999186079744L, 52148);
    a(paramArrayOfBoolean, paramArrayOfWalletFormView, paramTextView1, paramTextView2, false);
    GMTrace.o(6999186079744L, 52148);
  }
  
  private static void a(boolean[] paramArrayOfBoolean, WalletFormView[] paramArrayOfWalletFormView, TextView paramTextView1, TextView paramTextView2, boolean paramBoolean)
  {
    GMTrace.i(6999051862016L, 52147);
    int k = paramArrayOfBoolean.length;
    int i = 0;
    int j = 0;
    if (i < k)
    {
      if (paramArrayOfBoolean[i] != 0)
      {
        j = 1;
        paramArrayOfWalletFormView[i].setVisibility(0);
      }
      for (;;)
      {
        i += 1;
        break;
        paramArrayOfWalletFormView[i].setVisibility(8);
      }
    }
    if (j != 0)
    {
      paramTextView1.setVisibility(0);
      if (paramTextView2 != null)
      {
        if (paramBoolean)
        {
          paramTextView2.setVisibility(8);
          GMTrace.o(6999051862016L, 52147);
          return;
        }
        paramTextView2.setVisibility(4);
        GMTrace.o(6999051862016L, 52147);
      }
    }
    else
    {
      paramTextView1.setVisibility(8);
      if (paramTextView2 != null) {
        paramTextView2.setVisibility(8);
      }
    }
    GMTrace.o(6999051862016L, 52147);
  }
  
  private void ar()
  {
    GMTrace.i(6998649208832L, 52144);
    if (this.rLN == null) {
      this.rLN = new ElementQuery();
    }
    Object localObject1;
    if ((this.rLN != null) && (this.rTe != null) && (this.rTe.containsKey(this.rLN.oql)))
    {
      localObject1 = (a.a)this.rTe.get(this.rLN.oql);
      if ((localObject1 == null) || (((a.a)localObject1).rSm == null)) {
        break label1793;
      }
    }
    label277:
    label411:
    label541:
    label954:
    label968:
    label995:
    label1053:
    label1240:
    label1375:
    label1392:
    label1560:
    label1577:
    label1680:
    label1691:
    label1762:
    label1774:
    label1793:
    for (double d = ((a.a)localObject1).rSn;; d = 0.0D)
    {
      localObject1 = getString(R.l.eSZ, new Object[] { e.s(d) });
      this.rSM.setText((CharSequence)localObject1);
      this.rSM.setVisibility(0);
      com.tencent.mm.wallet_core.a.aa(this);
      localObject1 = (Bankcard)this.un.getParcelable("key_bankcard");
      Object localObject2;
      Object localObject3;
      TextView localTextView1;
      TextView localTextView2;
      boolean bool1;
      boolean bool2;
      if ((bxC()) && (localObject1 != null))
      {
        this.rTd.setHint(getString(R.l.eTm, new Object[] { ((Bankcard)localObject1).field_bankcardTail }));
        localObject1 = this.rTd;
        localObject2 = this.rSF;
        localObject3 = this.rSG;
        a(new boolean[] { true }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3);
        localObject1 = this.rSN;
        localObject2 = this.rSH;
        localObject3 = this.rSI;
        a(new boolean[] { false }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3);
        if (!Bankcard.wx(this.rLN.rKN)) {
          break label968;
        }
        localObject1 = this.rSu;
        localObject2 = this.rSQ;
        localObject3 = this.rJu;
        localTextView1 = this.rJv;
        localTextView2 = this.rJw;
        a(new boolean[] { 0, 0, 0 }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
        this.rSR.setVisibility(8);
        iS(true);
        this.rST.setVisibility(8);
        this.rSS.setVisibility(8);
        findViewById(R.h.cIC).setVisibility(8);
        bool1 = this.rLN.rNS;
        bool2 = this.rLN.rNT;
        localObject1 = this.rSP;
        localObject2 = this.rSO;
        localObject3 = this.rSJ;
        localTextView1 = this.rSK;
        a(new boolean[] { bool1, bool2 }, new WalletFormView[] { localObject1, localObject2 }, (TextView)localObject3, localTextView1);
        if (this.rSN.getVisibility() != 0) {
          break label1762;
        }
        switch (this.rLN.rNW)
        {
        default: 
          this.rSI.setVisibility(8);
          this.rSI.setTextColor(getResources().getColor(R.e.aPE));
        }
      }
      for (;;)
      {
        if ((bg.mZ(this.rLN.rOb)) || (!com.tencent.mm.x.o.fm(this.rLN.rOb)) || (bxC())) {
          break label1774;
        }
        this.rTh.setText(this.rLN.rOc);
        this.rTh.setVisibility(0);
        GMTrace.o(6998649208832L, 52144);
        return;
        this.rSM.setVisibility(8);
        break;
        if (bg.mZ(this.rLN.mVv)) {
          this.rSN.setText("");
        }
        for (;;)
        {
          localObject1 = this.rTd;
          localObject2 = this.rSF;
          localObject3 = this.rSG;
          a(new boolean[] { false }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3, true);
          localObject1 = this.rSN;
          localObject2 = this.rSH;
          localObject3 = this.rSI;
          a(new boolean[] { true }, new WalletFormView[] { localObject1 }, (TextView)localObject2, (TextView)localObject3, true);
          this.rTd.j(this.rTm);
          if (!com.tencent.mm.plugin.wallet_core.model.m.bwE().bxc().bwS()) {
            break label954;
          }
          this.rTd.oSV.setImageResource(R.k.drJ);
          this.rTd.oSV.setVisibility(0);
          break;
          if (!bg.mZ(this.rLN.rNY)) {
            this.rSN.setText(this.rLN.mVv + " " + this.rLN.rNY);
          } else if (2 == this.rLN.rNX) {
            this.rSN.setText(this.rLN.mVv + " " + getString(R.l.eUc));
          } else {
            this.rSN.setText(this.rLN.mVv + " " + getString(R.l.eUr));
          }
        }
        this.rTd.oSV.setVisibility(4);
        break label277;
        if ((this.rLN.bwu() != null) && (this.rLN.bwu().size() > 0))
        {
          bool1 = true;
          if ((!bxC()) && (!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwV())) {
            break label1392;
          }
          localObject1 = com.tencent.mm.plugin.wallet_core.model.m.bwE().aoj();
          if (bg.mZ((String)localObject1)) {
            break label1375;
          }
          this.rSu.setHint(getString(R.l.eTE, new Object[] { e.WC((String)localObject1) }));
          localObject1 = this.rSu;
          localObject2 = this.rSQ;
          localObject3 = this.rJu;
          localTextView1 = this.rJv;
          localTextView2 = this.rJw;
          a(new boolean[] { true, bool1, true }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
          this.rSR.setVisibility(0);
          if (this.rSv != null)
          {
            if (!bg.mZ(this.rSv.field_mobile)) {
              a(this.rSR, this.rSv.field_mobile);
            }
            if (!bg.mZ(this.rSv.rMz)) {
              a(this.rSP, this.rSv.rMz);
            }
            if (!bg.mZ(this.rSv.rMX)) {
              a(this.rSO, this.rSv.rMX);
            }
          }
          if (!this.rLN.rNQ) {
            break label1560;
          }
          this.rJw.setText("");
          if ((!bxC()) || (com.tencent.mm.plugin.wallet_core.model.m.bwE().bxe() <= 0)) {
            break label1577;
          }
          this.rSQ.setClickable(false);
          this.rSQ.setText(com.tencent.mm.plugin.wallet_core.model.m.bwM().J(this, com.tencent.mm.plugin.wallet_core.model.m.bwE().bxe()));
          this.rSQ.setEnabled(false);
          a(this.rJu, this.rJy);
          wB(this.rJy);
          iS(false);
          if (this.rTj) {
            break label1680;
          }
          this.rST.setVisibility(8);
        }
        for (;;)
        {
          this.rSS.setVisibility(8);
          if ((this.rTj) || (this.rTk)) {
            break label1691;
          }
          findViewById(R.h.cIC).setVisibility(8);
          break;
          bool1 = false;
          break label995;
          this.rSu.setHint(getString(R.l.eTD));
          break label1053;
          bool2 = this.rLN.rNQ;
          if ((bool1) && (this.rLN.rNR)) {}
          for (bool1 = true;; bool1 = false)
          {
            boolean bool3 = this.rLN.rNR;
            localObject1 = this.rSu;
            localObject2 = this.rSQ;
            localObject3 = this.rJu;
            localTextView1 = this.rJv;
            localTextView2 = this.rJw;
            a(new boolean[] { bool2, bool1, bool3 }, new WalletFormView[] { localObject1, localObject2, localObject3 }, localTextView1, localTextView2);
            this.rSR.setVisibility(0);
            w.i("MicroMsg.WalletCardElmentUI", "elemt canModifyName:" + this.rLN.rNQ + " canModifyIdentity:" + this.rLN.rNR);
            break;
          }
          this.rJw.setText(getString(R.l.eTp));
          break label1240;
          if (this.rTl.getCount() <= 1)
          {
            this.rSQ.setClickable(false);
            this.rSQ.setEnabled(false);
          }
          for (;;)
          {
            localObject1 = this.rLN.bwu();
            if ((localObject1 == null) || (!((List)localObject1).contains(Integer.valueOf(this.rJy)))) {
              this.rJy = 1;
            }
            this.rSQ.setText(com.tencent.mm.plugin.wallet_core.model.m.bwM().J(this, this.rJy));
            break;
            this.rSQ.setClickable(true);
            this.rSQ.setEnabled(true);
          }
          this.rST.setVisibility(0);
        }
        findViewById(R.h.cIC).setVisibility(0);
        break label411;
        this.rSI.setText(R.l.eTc);
        this.rSI.setVisibility(0);
        break label541;
        this.rSI.setVisibility(8);
        break label541;
        this.rSI.setVisibility(8);
        break label541;
        this.rSI.setVisibility(8);
        break label541;
        this.rSI.setVisibility(8);
      }
      this.rTh.setVisibility(8);
      GMTrace.o(6998649208832L, 52144);
      return;
    }
  }
  
  private void bxB()
  {
    GMTrace.i(6999320297472L, 52149);
    Object localObject1;
    boolean bool;
    if (QN())
    {
      com.tencent.mm.plugin.wallet_core.d.c.byf();
      if (!bg.mZ(this.rLN.rOb))
      {
        localObject1 = this.un;
        if ((this.rTh.getVisibility() == 0) && (this.rTh.isChecked()))
        {
          bool = true;
          ((Bundle)localObject1).putBoolean("key_is_follow_bank_username", bool);
          this.un.putString("key_bank_username", this.rLN.rOb);
        }
      }
      else
      {
        localObject1 = (FavorPayInfo)this.un.getParcelable("key_favor_pay_info");
        if ((this.rLN != null) && (localObject1 != null) && (this.rHS != null) && (this.rTe != null))
        {
          if (!this.rTe.containsKey(this.rLN.oql)) {
            break label823;
          }
          ((FavorPayInfo)localObject1).rOr = ((a.a)this.rTe.get(this.rLN.oql)).rSm.rGf;
          label171:
          this.un.putParcelable("key_favor_pay_info", (Parcelable)localObject1);
        }
        this.rGU = new Authen();
        if (this.rSv != null)
        {
          this.rGU.oqm = this.rSv.rMY;
          this.rGU.rMB = this.rSv.field_bankcardTail;
        }
        localObject1 = this.un.getString("key_card_id");
        if (this.rTd.getVisibility() != 0) {
          break label866;
        }
        localObject1 = this.rTd.getText();
      }
    }
    label823:
    label847:
    label866:
    for (;;)
    {
      this.rGU.oRb = ((PayInfo)this.un.getParcelable("key_pay_info"));
      this.rGU.rMy = ((String)localObject1);
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
      localObject1 = e.WD(this.rGU.rKI);
      this.un.putString("key_mobile", (String)localObject1);
      Object localObject2 = this.un;
      if (this.rLN.rKN == 2) {}
      for (bool = true;; bool = false)
      {
        ((Bundle)localObject2).putBoolean("key_is_oversea", bool);
        this.rGU.rMw = this.rJu.getText();
        this.rGU.rMv = this.rSu.getText();
        this.rGU.rMA = this.rSO.getText();
        localObject2 = (FavorPayInfo)this.un.getParcelable("key_favor_pay_info");
        if (localObject2 != null)
        {
          this.rGU.rMF = ((FavorPayInfo)localObject2).rOu;
          this.rGU.rMG = ((FavorPayInfo)localObject2).rOr;
        }
        w.d("MicroMsg.WalletCardElmentUI", "payInfo " + this.rGU.oRb + " elemt.bankcardTag : " + this.rLN.rKN);
        w.i("MicroMsg.WalletCardElmentUI", " elemt.bankcardTag : " + this.rLN.rKN);
        localObject2 = this.un;
        ((Bundle)localObject2).putString("key_mobile", (String)localObject1);
        ((Bundle)localObject2).putParcelable("key_authen", this.rGU);
        ((Bundle)localObject2).putString("key_bank_phone", this.rLN.rOa);
        ((Bundle)localObject2).putString("key_country_code", this.countryCode);
        ((Bundle)localObject2).putString("key_province_code", this.hhq);
        ((Bundle)localObject2).putString("key_city_code", this.hhp);
        ((Bundle)localObject2).putParcelable("key_profession", this.rLO);
        if (!cjn().j(new Object[] { this.rGU, this.oZx })) {
          break label847;
        }
        w.i("MicroMsg.WalletCardElmentUI", "process controller deal with!!!");
        GMTrace.o(6999320297472L, 52149);
        return;
        bool = false;
        break;
        ((FavorPayInfo)localObject1).rOr = this.rHS.ay(((FavorPayInfo)localObject1).rOr, false);
        break label171;
      }
      w.e("MicroMsg.WalletCardElmentUI", "error process in the tenpay!!");
      GMTrace.o(6999320297472L, 52149);
      return;
    }
  }
  
  private boolean bxC()
  {
    GMTrace.i(7000796692480L, 52160);
    boolean bool = this.un.getBoolean("key_is_forgot_process", false);
    GMTrace.o(7000796692480L, 52160);
    return bool;
  }
  
  private void iS(boolean paramBoolean)
  {
    int j = 0;
    GMTrace.i(6998917644288L, 52146);
    if (paramBoolean)
    {
      Object localObject = this.qMW;
      if (this.rLN.rOe)
      {
        i = 0;
        ((TextView)localObject).setVisibility(i);
        localObject = this.rSU;
        if (!this.rLN.rOe) {
          break label231;
        }
        i = 0;
        label57:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rSV;
        if (!this.rLN.rOf) {
          break label237;
        }
        i = 0;
        label81:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rSW;
        if (!this.rLN.rOg) {
          break label243;
        }
        i = 0;
        label105:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rSX;
        if (!this.rLN.rOj) {
          break label249;
        }
        i = 0;
        label129:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rSY;
        if (!this.rLN.rOl) {
          break label255;
        }
        i = 0;
        label153:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rSZ;
        if (!this.rLN.rOk) {
          break label261;
        }
        i = 0;
        label177:
        ((WalletFormView)localObject).setVisibility(i);
        localObject = this.rTa;
        if (!this.rLN.rOm) {
          break label267;
        }
      }
      label231:
      label237:
      label243:
      label249:
      label255:
      label261:
      label267:
      for (int i = j;; i = 8)
      {
        ((WalletFormView)localObject).setVisibility(i);
        this.rSL.setVisibility(4);
        GMTrace.o(6998917644288L, 52146);
        return;
        i = 8;
        break;
        i = 8;
        break label57;
        i = 8;
        break label81;
        i = 8;
        break label105;
        i = 8;
        break label129;
        i = 8;
        break label153;
        i = 8;
        break label177;
      }
    }
    this.qMW.setVisibility(8);
    this.rSU.setVisibility(8);
    this.rSV.setVisibility(8);
    this.rSW.setVisibility(8);
    this.rSX.setVisibility(8);
    this.rSY.setVisibility(8);
    this.rSZ.setVisibility(8);
    this.rTa.setVisibility(8);
    this.rSL.setVisibility(8);
    GMTrace.o(6998917644288L, 52146);
  }
  
  private void wB(int paramInt)
  {
    GMTrace.i(7000528257024L, 52158);
    if (paramInt == 1)
    {
      e(this.rJu, 1, false);
      GMTrace.o(7000528257024L, 52158);
      return;
    }
    e(this.rJu, 1, true);
    GMTrace.o(7000528257024L, 52158);
  }
  
  protected final void MH()
  {
    GMTrace.i(6998514991104L, 52143);
    this.rSF = ((TextView)findViewById(R.h.cIy));
    this.rTd = ((WalletFormView)findViewById(R.h.cIw));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rTd);
    this.rSG = ((TextView)findViewById(R.h.cIx));
    this.rJv = ((TextView)findViewById(R.h.cIA));
    this.rSu = ((WalletFormView)findViewById(R.h.ceC));
    com.tencent.mm.wallet_core.ui.formview.a.e(this, this.rSu);
    this.rSR = ((WalletFormView)findViewById(R.h.ccG));
    com.tencent.mm.wallet_core.ui.formview.a.c(this, this.rSR);
    this.rSQ = ((WalletFormView)findViewById(R.h.cIN));
    this.rJu = ((WalletFormView)findViewById(R.h.bPa));
    com.tencent.mm.wallet_core.ui.formview.a.c(this.rJu);
    this.rJw = ((TextView)findViewById(R.h.cIz));
    this.rSH = ((TextView)findViewById(R.h.cIq));
    this.rSN = ((WalletFormView)findViewById(R.h.cIE));
    this.rSI = ((TextView)findViewById(R.h.cIr));
    this.rSM = ((TextView)findViewById(R.h.cIu));
    this.rSJ = ((TextView)findViewById(R.h.cIt));
    this.rSP = ((WalletFormView)findViewById(R.h.bAb));
    com.tencent.mm.wallet_core.ui.formview.a.b(this, this.rSP);
    this.rSO = ((WalletFormView)findViewById(R.h.bAf));
    com.tencent.mm.wallet_core.ui.formview.a.a(this, this.rSO);
    this.rSK = ((TextView)findViewById(R.h.cIs));
    this.qMW = ((TextView)findViewById(R.h.cIo));
    this.rSU = ((WalletFormView)findViewById(R.h.bID));
    this.rSV = ((WalletFormView)findViewById(R.h.bSQ));
    this.rSW = ((WalletFormView)findViewById(R.h.biU));
    this.rSX = ((WalletFormView)findViewById(R.h.bgO));
    this.rSY = ((WalletFormView)findViewById(R.h.cjv));
    this.rSZ = ((WalletFormView)findViewById(R.h.ckj));
    this.rTa = ((WalletFormView)findViewById(R.h.bDq));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.rTa);
    this.rSL = ((TextView)findViewById(R.h.cIn));
    this.rTg = ((CheckBox)findViewById(R.h.bhl));
    this.rTh = ((CheckBox)findViewById(R.h.bhh));
    this.rFt = ((Button)findViewById(R.h.cgl));
    this.rTb = ((ScrollView)findViewById(R.h.cKi));
    this.rSS = ((WalletFormView)findViewById(R.h.ckt));
    this.rST = ((WalletFormView)findViewById(R.h.cks));
    this.rSu.xid = this;
    this.rTd.xid = this;
    this.rSQ.xid = this;
    this.rJu.xid = this;
    this.rSR.xid = new WalletFormView.a()
    {
      public final void gQ(boolean paramAnonymousBoolean)
      {
        GMTrace.i(6924024152064L, 51588);
        if (!paramAnonymousBoolean)
        {
          WalletCardElementUI.a(WalletCardElementUI.this);
          WalletCardElementUI.this.un.putParcelable("key_history_bankcard", null);
        }
        WalletCardElementUI.b(WalletCardElementUI.this);
        GMTrace.o(6924024152064L, 51588);
      }
    };
    this.rSP.xid = this;
    this.rSO.xid = this;
    this.rSU.xid = this;
    this.rSV.xid = this;
    this.rSW.xid = this;
    this.rSX.xid = this;
    this.rSY.xid = this;
    this.rSZ.xid = this;
    this.rTa.xid = this;
    this.rSS.xid = this;
    this.rST.xid = this;
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
    this.rST.setOnEditorActionListener(this);
    this.rSS.setOnEditorActionListener(this);
    this.rSN.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6928184901632L, 51619);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putInt("key_support_bankcard", WalletCardElementUI.this.un.getInt("key_support_bankcard", 3));
        paramAnonymousView.putInt("key_bind_scene", WalletCardElementUI.this.un.getInt("key_bind_scene", -1));
        if (!bg.mZ(WalletCardElementUI.c(WalletCardElementUI.this).getText()))
        {
          paramAnonymousView.putString("key_bank_type", WalletCardElementUI.d(WalletCardElementUI.this).oql);
          paramAnonymousView.putInt("key_bankcard_type", WalletCardElementUI.d(WalletCardElementUI.this).rNX);
        }
        com.tencent.mm.wallet_core.b localb = com.tencent.mm.wallet_core.a.aa(WalletCardElementUI.this);
        if (localb != null) {
          localb.a(WalletCardElementUI.this, WalletCardSelectUI.class, paramAnonymousView, 1);
        }
        GMTrace.o(6928184901632L, 51619);
      }
    });
    this.rSQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6929527078912L, 51629);
        WalletCardElementUI.this.showDialog(1);
        GMTrace.o(6929527078912L, 51629);
      }
    });
    this.rST.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7021063569408L, 52311);
        paramAnonymousView = new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true).putExtra("ShowSelectedLocation", false);
        if (!Bankcard.wx(WalletCardElementUI.d(WalletCardElementUI.this).rKN))
        {
          paramAnonymousView.putExtra("IsRealNameVerifyScene", true);
          paramAnonymousView.putExtra("IsNeedShowSearchBar", true);
        }
        WalletCardElementUI.this.startActivityForResult(paramAnonymousView, 4);
        GMTrace.o(7021063569408L, 52311);
      }
    });
    this.rSS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6953954705408L, 51811);
        paramAnonymousView = new Intent(WalletCardElementUI.this.vov.voR, WalletSelectProfessionUI.class);
        paramAnonymousView.putExtra("key_profession_list", WalletCardElementUI.e(WalletCardElementUI.this));
        WalletCardElementUI.this.startActivityForResult(paramAnonymousView, 5);
        GMTrace.o(6953954705408L, 51811);
      }
    });
    this.rTg.setChecked(true);
    this.rTg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6983616823296L, 52032);
        WalletCardElementUI.b(WalletCardElementUI.this);
        GMTrace.o(6983616823296L, 52032);
      }
    });
    findViewById(R.h.bhf).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6979321856000L, 52000);
        e.a(WalletCardElementUI.this, WalletCardElementUI.d(WalletCardElementUI.this).oql, WalletCardElementUI.d(WalletCardElementUI.this).mVv, false, WalletCardElementUI.d(WalletCardElementUI.this).rOp);
        GMTrace.o(6979321856000L, 52000);
      }
    });
    this.rSW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6962947293184L, 51878);
        paramAnonymousView = new Intent("com.tencent.mm.action.GET_ADRESS").putExtra("GetAddress", true).putExtra("ShowSelectedLocation", false);
        if (Bankcard.wx(WalletCardElementUI.d(WalletCardElementUI.this).rKN)) {
          paramAnonymousView.putExtra("IsAutoPosition", false);
        }
        for (;;)
        {
          WalletCardElementUI.this.startActivityForResult(paramAnonymousView, 2);
          GMTrace.o(6962947293184L, 51878);
          return;
          paramAnonymousView.putExtra("IsRealNameVerifyScene", true);
          paramAnonymousView.putExtra("IsNeedShowSearchBar", true);
        }
      }
    });
    this.rFt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7022137311232L, 52319);
        WalletCardElementUI.f(WalletCardElementUI.this);
        GMTrace.o(7022137311232L, 52319);
      }
    });
    e(this.rTd, 0, false);
    e(this.rJu, 1, false);
    e(this.rSR, 0, false);
    if ((this.rLN != null) && (!bg.mZ(this.rLN.rOd)))
    {
      com.tencent.mm.ui.base.h.a(this, this.rLN.rOd, null, true, null);
      this.rLN = null;
    }
    for (;;)
    {
      ar();
      QN();
      Object localObject = com.tencent.mm.wallet_core.a.aa(this);
      if ((localObject == null) || (!((com.tencent.mm.wallet_core.b)localObject).ciA())) {
        break label1204;
      }
      localObject = (Orders)this.un.getParcelable("key_orders");
      if ((localObject == null) || (((Orders)localObject).rOT != 1)) {
        break;
      }
      this.rTf = true;
      this.rSu.setText(e.WC(((Orders)localObject).rMv));
      this.rSu.setEnabled(false);
      this.rSu.setFocusable(false);
      this.rJy = ((Orders)localObject).rOV;
      this.rSQ.setText(com.tencent.mm.plugin.wallet_core.model.m.bwM().J(this, this.rJy));
      this.rSQ.setEnabled(false);
      this.rJu.setText(((Orders)localObject).rOU);
      this.rJu.setEnabled(false);
      this.rJu.setFocusable(false);
      this.rJv.setText(R.l.eSY);
      this.rSR.cjw();
      GMTrace.o(6998514991104L, 52143);
      return;
      if ((this.un.getInt("key_bind_scene", -1) == 5) && (!this.rLN.rOq))
      {
        com.tencent.mm.ui.base.h.a(this, getString(R.l.fal), null, true, null);
        this.rLN.mVv = null;
      }
    }
    this.rTf = false;
    label1204:
    GMTrace.o(6998514991104L, 52143);
  }
  
  protected final int Qb()
  {
    GMTrace.i(7000662474752L, 52159);
    GMTrace.o(7000662474752L, 52159);
    return 1;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6999454515200L, 52150);
    w.i("MicroMsg.WalletCardElmentUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.un;
      w.d("MicroMsg.WalletCardElmentUI", "PayInfo  " + this.rHl);
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m))
      {
        w.i("MicroMsg.WalletCardElmentUI", "query bound bank card resp, forwardProcess");
        com.tencent.mm.wallet_core.a.i(this, paramString);
        GMTrace.o(6999454515200L, 52150);
        return true;
      }
      GMTrace.o(6999454515200L, 52150);
      return false;
    }
    GMTrace.o(6999454515200L, 52150);
    return false;
  }
  
  public final void gQ(boolean paramBoolean)
  {
    GMTrace.i(6999991386112L, 52154);
    QN();
    GMTrace.o(6999991386112L, 52154);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6999588732928L, 52151);
    int i = R.i.dih;
    GMTrace.o(6999588732928L, 52151);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6999722950656L, 52152);
    w.i("MicroMsg.WalletCardElmentUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(6999722950656L, 52152);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      QN();
      GMTrace.o(6999722950656L, 52152);
      return;
      this.rLN = ((ElementQuery)paramIntent.getParcelableExtra("elemt_query"));
      this.rSv = null;
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
        label307:
        if ((!"US".equals(str2)) && (!"CA".equals(str2)) && (!this.rLN.rOk)) {
          break label494;
        }
        this.rSZ.setVisibility(0);
      }
      for (;;)
      {
        w.i("MicroMsg.WalletCardElmentUI", "onActivityResult for address countryName %s,countryCode %s, provinceName %s, cityName %s, mCity %s", new Object[] { str1, str2, str3, str4, this.nrr });
        break;
        if (!bg.mZ(paramIntent.getStringExtra("Contact_Province")))
        {
          this.nrr = (str3 + "|" + paramIntent.getStringExtra("Contact_Province"));
          this.rSW.setText(str1 + " " + str3);
          break label307;
        }
        this.nrr = this.rTi;
        this.rSW.setText(str1);
        break label307;
        label494:
        this.rSZ.setVisibility(8);
      }
      paramIntent = paramIntent.getStringExtra("key_bankcard_id");
      this.rTd.WK(paramIntent);
      continue;
      str1 = paramIntent.getStringExtra("CountryName");
      str2 = paramIntent.getStringExtra("ProviceName");
      str3 = paramIntent.getStringExtra("CityName");
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
      this.rST.setText(paramIntent.toString());
      continue;
      this.rLO = ((Profession)paramIntent.getParcelableExtra("key_select_profession"));
      this.rSS.setText(this.rLO.rMg);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6998380773376L, 52142);
    super.onCreate(paramBundle);
    this.rLN = ((ElementQuery)this.un.getParcelable("elemt_query"));
    this.oZx = ((Orders)this.un.getParcelable("key_orders"));
    this.rHl = ((PayInfo)this.un.getParcelable("key_pay_info"));
    this.rJy = com.tencent.mm.plugin.wallet_core.model.m.bwE().bxe();
    this.rSv = ((Bankcard)this.un.getParcelable("key_history_bankcard"));
    this.rTj = this.un.getBoolean("key_need_area", false);
    if ((this.rTj) || (this.rTk))
    {
      oC(R.l.eUu);
      if (this.rHl == null) {
        this.rHl = new PayInfo();
      }
      w.d("MicroMsg.WalletCardElmentUI", "mPayInfo " + this.rHl);
      paramBundle = (FavorPayInfo)this.un.getParcelable("key_favor_pay_info");
      if ((this.oZx != null) && (paramBundle != null))
      {
        this.rHS = b.rSp.a(this.oZx);
        if (this.rHS == null) {
          break label296;
        }
        paramBundle = this.rHS.JE(paramBundle.rOr);
        this.rTe = this.rHS.JA(paramBundle);
      }
    }
    for (;;)
    {
      MH();
      this.rTb.pageScroll(33);
      com.tencent.mm.plugin.wallet_core.d.c.b(this, this.un, 3);
      com.tencent.mm.sdk.b.a.uLm.b(this.rJr);
      GMTrace.o(6998380773376L, 52142);
      return;
      oC(R.l.eUt);
      break;
      label296:
      w.w("MicroMsg.WalletCardElmentUI", " get favorLogicHelper null");
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7000259821568L, 52156);
    com.tencent.mm.sdk.b.a.uLm.c(this.rJr);
    super.onDestroy();
    GMTrace.o(7000259821568L, 52156);
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    GMTrace.i(7000125603840L, 52155);
    w.d("MicroMsg.WalletCardElmentUI", "onEditorAction actionId : " + paramInt);
    switch (paramInt)
    {
    default: 
      if (this.rTc == null) {
        bxB();
      }
      GMTrace.o(7000125603840L, 52155);
      return false;
    }
    boolean bool1;
    if (this.rTc != null)
    {
      paramTextView = this.rTc;
      if (paramTextView.xic != null)
      {
        bool1 = paramTextView.xic.isFocusable();
        if (!bool1) {
          break label175;
        }
        paramTextView = this.rTc;
        bool1 = bool2;
        if (paramTextView.xic != null) {
          bool1 = paramTextView.xic.isClickable();
        }
        if ((!bool1) || (!this.rTc.cju())) {
          break label175;
        }
        this.rTc.cjw();
      }
    }
    for (;;)
    {
      GMTrace.o(7000125603840L, 52155);
      return true;
      bool1 = false;
      break;
      label175:
      this.rTc.performClick();
      continue;
      bxB();
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */