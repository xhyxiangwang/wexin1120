package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.am;
import com.tencent.mm.g.a.an;
import com.tencent.mm.g.a.ie;
import com.tencent.mm.g.a.ie.a;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.wallet_core.b.f;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.b;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoNewUI
  extends WalletOrderInfoUI
{
  private String iqL;
  private String jqc;
  private String oYQ;
  private TextView oZA;
  private String onw;
  private com.tencent.mm.sdk.b.c opz;
  private String osA;
  private Orders rGT;
  private PayInfo rHl;
  private List<Orders.Commodity> rUA;
  private String rUB;
  private String rUC;
  private Orders.RecommendTinyAppInfo rUD;
  private String rUE;
  private b rUF;
  private HashMap<String, a> rUG;
  private String rUH;
  private Orders.b rUI;
  private String rUJ;
  private TextView rUK;
  private TextView rUL;
  private WalletTextView rUM;
  private TextView rUN;
  private Button rUO;
  private ImageView rUP;
  private ViewGroup rUQ;
  private ViewGroup rUR;
  private ViewGroup rUS;
  private CdnImageView rUT;
  private TextView rUU;
  private TextView rUV;
  private View rUW;
  private Button rUX;
  private ViewGroup rUY;
  private TextView rUZ;
  private boolean rUy;
  private Set<String> rUz;
  private CheckBox rVa;
  private ViewGroup rVb;
  private CdnImageView rVc;
  private TextView rVd;
  private TextView rVe;
  private Button rVf;
  private ViewGroup rVg;
  private boolean rVh;
  private boolean rVi;
  private boolean rVj;
  private com.tencent.mm.wallet_core.b rVk;
  private com.tencent.mm.sdk.b.c rVl;
  
  public WalletOrderInfoNewUI()
  {
    GMTrace.i(6936909053952L, 51684);
    this.jqc = null;
    this.osA = null;
    this.rUy = false;
    this.rUz = null;
    this.iqL = "";
    this.rUA = null;
    this.rUG = new HashMap();
    this.rUI = null;
    this.rUJ = "-1";
    this.rVh = false;
    this.rVi = false;
    this.rVj = false;
    this.opz = new com.tencent.mm.sdk.b.c() {};
    this.rVl = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6936909053952L, 51684);
  }
  
  private void JH(String paramString)
  {
    GMTrace.i(17094909362176L, 127367);
    bxJ();
    e.m(this, paramString, false);
    GMTrace.o(17094909362176L, 127367);
  }
  
  private void b(Orders paramOrders)
  {
    GMTrace.i(6938519666688L, 51696);
    this.rUz.clear();
    if ((paramOrders == null) || (paramOrders.rPj == null))
    {
      w.w("MicroMsg.WalletOrderInfoNewUI", "hy: orders is null");
      GMTrace.o(6938519666688L, 51696);
      return;
    }
    paramOrders = paramOrders.rPj.iterator();
    while (paramOrders.hasNext())
    {
      Orders.Commodity localCommodity = (Orders.Commodity)paramOrders.next();
      if ((localCommodity.rPa == 2) && (!bg.mZ(localCommodity.rPy)))
      {
        w.d("MicroMsg.WalletOrderInfoNewUI", "hy: has username and is force recommend");
        this.rUz.add(localCommodity.rPy);
      }
    }
    GMTrace.o(6938519666688L, 51696);
  }
  
  private void bxE()
  {
    GMTrace.i(6937445924864L, 51688);
    int j = 0;
    if (this.rUS.getVisibility() == 0) {
      j = 1;
    }
    int i = j;
    if (this.rUQ.getVisibility() == 0) {
      i = j + 1;
    }
    j = i;
    if (this.rUY.getVisibility() == 0) {
      j = i + 1;
    }
    if (this.rVb.getVisibility() == 0) {}
    for (i = j + 1;; i = j)
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams1 = (ViewGroup.MarginLayoutParams)this.rUP.getLayoutParams();
      ViewGroup.MarginLayoutParams localMarginLayoutParams2 = (ViewGroup.MarginLayoutParams)this.rUK.getLayoutParams();
      if (i >= 3)
      {
        i = com.tencent.mm.bq.a.fromDPToPix(this, 40);
        localMarginLayoutParams1.topMargin = i;
      }
      for (localMarginLayoutParams2.topMargin = i;; localMarginLayoutParams2.topMargin = i)
      {
        this.rUP.setLayoutParams(localMarginLayoutParams1);
        this.rUK.setLayoutParams(localMarginLayoutParams2);
        this.rVg.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6987240701952L, 52059);
            int k = WalletOrderInfoNewUI.e(WalletOrderInfoNewUI.this).getHeight();
            int m = WalletOrderInfoNewUI.this.findViewById(R.h.csi).getHeight();
            int i;
            int j;
            label64:
            label83:
            int n;
            ViewGroup.MarginLayoutParams localMarginLayoutParams;
            if (WalletOrderInfoNewUI.f(WalletOrderInfoNewUI.this).getVisibility() == 0)
            {
              i = 1;
              if (WalletOrderInfoNewUI.g(WalletOrderInfoNewUI.this).getVisibility() != 0) {
                break label255;
              }
              j = 1;
              if ((i == 0) || (j == 0)) {
                break label260;
              }
              i = WalletOrderInfoNewUI.f(WalletOrderInfoNewUI.this).getBottom();
              j = k;
              if (WalletOrderInfoNewUI.h(WalletOrderInfoNewUI.this).getVisibility() != 0)
              {
                j = k;
                if (WalletOrderInfoNewUI.c(WalletOrderInfoNewUI.this).getVisibility() != 0) {
                  j = k + com.tencent.mm.bq.a.fromDPToPix(WalletOrderInfoNewUI.this, 70);
                }
              }
              k = m - i - j;
              n = com.tencent.mm.bq.a.fromDPToPix(WalletOrderInfoNewUI.this, 50);
              w.i("MicroMsg.WalletOrderInfoNewUI", "autoAdjustLayout inner, height: %s, topViewPos: %s, contentHeight: %s, topMargin: %s, 50dp: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(k), Integer.valueOf(n) });
              localMarginLayoutParams = (ViewGroup.MarginLayoutParams)WalletOrderInfoNewUI.e(WalletOrderInfoNewUI.this).getLayoutParams();
              if (k <= n) {
                break label313;
              }
            }
            label255:
            label260:
            label313:
            for (localMarginLayoutParams.topMargin = k;; localMarginLayoutParams.topMargin = n)
            {
              WalletOrderInfoNewUI.e(WalletOrderInfoNewUI.this).setLayoutParams(localMarginLayoutParams);
              WalletOrderInfoNewUI.e(WalletOrderInfoNewUI.this).setVisibility(0);
              GMTrace.o(6987240701952L, 52059);
              return;
              i = 0;
              break;
              j = 0;
              break label64;
              if (j != 0)
              {
                i = WalletOrderInfoNewUI.g(WalletOrderInfoNewUI.this).getBottom();
                break label83;
              }
              if (i != 0)
              {
                i = WalletOrderInfoNewUI.f(WalletOrderInfoNewUI.this).getBottom();
                break label83;
              }
              i = WalletOrderInfoNewUI.this.findViewById(R.h.ciO).getBottom();
              break label83;
            }
          }
        });
        GMTrace.o(6937445924864L, 51688);
        return;
        i = com.tencent.mm.bq.a.fromDPToPix(this, 70);
        localMarginLayoutParams1.topMargin = i;
      }
    }
  }
  
  private void bxF()
  {
    GMTrace.i(6937580142592L, 51689);
    if ((this.rGT != null) && (this.rUA != null) && (this.rUA.size() > 0))
    {
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
      this.oZA.setVisibility(0);
      if (i != 0)
      {
        if ((!bg.mZ(this.rGT.rPc)) && (!bg.mZ(this.rGT.rPc.trim())))
        {
          this.oZA.setText(this.rGT.rPc);
          GMTrace.o(6937580142592L, 51689);
          return;
        }
        if (this.rGT.rKN != 1)
        {
          this.oZA.setText(R.l.eWj);
          GMTrace.o(6937580142592L, 51689);
          return;
        }
        this.oZA.setText(R.l.eWi);
        GMTrace.o(6937580142592L, 51689);
        return;
      }
      this.oZA.setText(R.l.eWk);
      GMTrace.o(6937580142592L, 51689);
      return;
    }
  }
  
  private void bxG()
  {
    GMTrace.i(14549201715200L, 108400);
    this.rUQ.setVisibility(8);
    if ((this.rGT != null) && (this.rUA != null) && (this.rUA.size() > 0))
    {
      Orders.Commodity localCommodity = (Orders.Commodity)this.rUA.get(0);
      List localList = localCommodity.rPA;
      if (localList != null) {}
      for (int i = localList.size();; i = 0)
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "discountInfoList: %s, size: %s", new Object[] { localList, Integer.valueOf(i) });
        if ((localList == null) || (localList.size() <= 0)) {
          break label267;
        }
        this.rUR.removeAllViews();
        i = 0;
        while (i < localList.size())
        {
          Orders.DiscountInfo localDiscountInfo = (Orders.DiscountInfo)localList.get(i);
          TextView localTextView = new TextView(this.vov.voR);
          localTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
          localTextView.setTextSize(1, 12.0F);
          localTextView.setTextColor(Color.parseColor("#FA962A"));
          localTextView.setText(localDiscountInfo.rFJ + e.d(localDiscountInfo.rPK / 100.0D, this.rGT.ori));
          this.rUR.addView(localTextView);
          i += 1;
        }
      }
      this.rUQ.setVisibility(0);
      label267:
      if ((localCommodity.rPx >= 0.0D) && (localCommodity.kKX < localCommodity.rPx))
      {
        this.rUN.setText(e.d(localCommodity.rPx, localCommodity.ori));
        this.rUN.getPaint().setFlags(16);
        this.rUQ.setVisibility(0);
      }
    }
    GMTrace.o(14549201715200L, 108400);
  }
  
  private void bxH()
  {
    GMTrace.i(6937714360320L, 51690);
    this.rUY.setVisibility(8);
    Orders.Commodity localCommodity;
    Orders.b localb;
    if (this.rGT != null)
    {
      b(this.rGT);
      if ((this.rUA != null) && (this.rUA.size() > 0))
      {
        localCommodity = (Orders.Commodity)this.rUA.get(0);
        w.i("MicroMsg.WalletOrderInfoNewUI", "setSubscribeBizInfo, hasSubscribeBiz: %s", new Object[] { Boolean.valueOf(localCommodity.rPF) });
        if ((localCommodity.rPF) && (localCommodity.rPE != null) && (localCommodity.rPE.size() > 0))
        {
          Iterator localIterator = localCommodity.rPE.iterator();
          do
          {
            if (!localIterator.hasNext()) {
              break;
            }
            localb = (Orders.b)localIterator.next();
          } while (localb.type != Orders.rPv);
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.WalletOrderInfoNewUI", "subscribePromotions: %s", new Object[] { localb });
      if ((localb != null) && (!bg.mZ(localb.orj)))
      {
        this.oYQ = localCommodity.fKK;
        com.tencent.mm.plugin.report.service.g.paX.i(13033, new Object[] { Integer.valueOf(1), localb.orj, localb.url, localb.name, this.oYQ });
        this.rUZ.setText(localb.name);
        this.rUE = localb.orj;
        this.rVa.setVisibility(0);
        if (!this.rUz.contains(localb.orj)) {
          break label323;
        }
        this.rVa.setChecked(true);
      }
      for (;;)
      {
        this.rUY.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6932211433472L, 51649);
            if (!bg.mZ(WalletOrderInfoNewUI.i(WalletOrderInfoNewUI.this)))
            {
              if (WalletOrderInfoNewUI.j(WalletOrderInfoNewUI.this).contains(WalletOrderInfoNewUI.i(WalletOrderInfoNewUI.this)))
              {
                WalletOrderInfoNewUI.j(WalletOrderInfoNewUI.this).remove(WalletOrderInfoNewUI.i(WalletOrderInfoNewUI.this));
                WalletOrderInfoNewUI.k(WalletOrderInfoNewUI.this).setChecked(false);
                GMTrace.o(6932211433472L, 51649);
                return;
              }
              WalletOrderInfoNewUI.j(WalletOrderInfoNewUI.this).add(WalletOrderInfoNewUI.i(WalletOrderInfoNewUI.this));
              WalletOrderInfoNewUI.k(WalletOrderInfoNewUI.this).setChecked(true);
            }
            GMTrace.o(6932211433472L, 51649);
          }
        });
        this.rUY.setVisibility(0);
        GMTrace.o(6937714360320L, 51690);
        return;
        label323:
        this.rVa.setChecked(false);
      }
      localb = null;
    }
  }
  
  private void bxJ()
  {
    int i = 0;
    GMTrace.i(6939190755328L, 51701);
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
    GMTrace.o(6939190755328L, 51701);
  }
  
  private void iV(boolean paramBoolean)
  {
    GMTrace.i(18829673496576L, 140292);
    this.rUS.setVisibility(8);
    this.rVi = false;
    this.rVh = false;
    final Object localObject2;
    Object localObject3;
    Object localObject1;
    if (this.rGT != null) {
      if ((this.rUA != null) && (this.rUA.size() > 0))
      {
        localObject2 = (Orders.Commodity)this.rUA.get(0);
        if (localObject2 != null)
        {
          w.i("MicroMsg.WalletOrderInfoNewUI", "setTinyAppActivityInfo, hasSubscribeBiz: %s", new Object[] { Boolean.valueOf(((Orders.Commodity)localObject2).rPF) });
          if ((((Orders.Commodity)localObject2).rPE == null) || (((Orders.Commodity)localObject2).rPE.size() <= 0)) {
            break label1608;
          }
          localObject3 = ((Orders.Commodity)localObject2).rPE.iterator();
          do
          {
            if (!((Iterator)localObject3).hasNext()) {
              break;
            }
            localObject1 = (Orders.b)((Iterator)localObject3).next();
          } while (((Orders.b)localObject1).type != Orders.rPw);
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.WalletOrderInfoNewUI", "activityPromotions: %s", new Object[] { localObject1 });
      if ((localObject1 != null) && (((Orders.b)localObject1).rPN > 0L) && (!bg.mZ(((Orders.b)localObject1).rPL)))
      {
        this.rUI = ((Orders.b)localObject1);
        this.rUW.setVisibility(8);
        this.rUT.tbV = true;
        this.rUX.setEnabled(true);
        this.rUX.setBackgroundResource(R.g.aWM);
        this.rUV.setCompoundDrawables(null, null, null, null);
        localObject3 = (a)this.rUG.get(((Orders.b)localObject1).rPN);
        if (localObject3 != null)
        {
          if (!bg.mZ(((a)localObject3).fJv)) {
            this.rUT.O(((a)localObject3).fJv, 0, 0);
          }
          if (!bg.mZ(((a)localObject3).fEM)) {
            this.rUU.setText(((a)localObject3).fEM);
          }
          if (!bg.mZ(((a)localObject3).rVo))
          {
            this.rUX.setText(((a)localObject3).rVo);
            this.rUX.setBackgroundResource(R.g.bfp);
          }
          localObject4 = (RelativeLayout.LayoutParams)this.rUV.getLayoutParams();
          if ((localObject3 == null) || (bg.mZ(((a)localObject3).title))) {
            break label866;
          }
          this.rUV.setText(((Orders.b)localObject1).title);
          ((RelativeLayout.LayoutParams)localObject4).addRule(15, 0);
          this.rUV.setLayoutParams((ViewGroup.LayoutParams)localObject4);
          this.rUX.setVisibility(0);
          this.rUX.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(17094104055808L, 127361);
              w.i("MicroMsg.WalletOrderInfoNewUI", "click activity button");
              WalletOrderInfoNewUI.p(WalletOrderInfoNewUI.this);
              GMTrace.o(17094104055808L, 127361);
            }
          });
          if (((Orders.b)localObject1).rPO != 1) {
            this.rUS.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(17096385757184L, 127378);
                w.i("MicroMsg.WalletOrderInfoNewUI", "click activity layout");
                WalletOrderInfoNewUI.p(WalletOrderInfoNewUI.this);
                GMTrace.o(17096385757184L, 127378);
              }
            });
          }
          localObject3 = this.rUJ;
          i = -1;
          switch (((String)localObject3).hashCode())
          {
          default: 
            switch (i)
            {
            default: 
              localObject3 = this.rUU.getText();
              if ((!bg.L((CharSequence)localObject3)) && (((CharSequence)localObject3).length() > 9))
              {
                this.rUU.setText(((CharSequence)localObject3).subSequence(0, 9));
                this.rUU.append("...");
              }
              localObject3 = (ViewGroup.MarginLayoutParams)this.rUS.getLayoutParams();
              localObject4 = ((Orders.Commodity)localObject2).rPA;
              if (((((Orders.Commodity)localObject2).rPx >= 0.0D) && (((Orders.Commodity)localObject2).kKX < ((Orders.Commodity)localObject2).rPx)) || ((localObject4 != null) && (((List)localObject4).size() > 0)))
              {
                ((ViewGroup.MarginLayoutParams)localObject3).topMargin = 0;
                this.rUS.setLayoutParams((ViewGroup.LayoutParams)localObject3);
                this.rUS.setVisibility(0);
                if (paramBoolean)
                {
                  localObject3 = com.tencent.mm.plugin.report.service.g.paX;
                  localObject4 = this.oYQ;
                  i = ((Orders.b)localObject1).rPO;
                  if (!this.rUJ.equals("-1")) {
                    break label1038;
                  }
                  localObject2 = Integer.valueOf(5);
                  ((com.tencent.mm.plugin.report.service.g)localObject3).i(13471, new Object[] { localObject4, Integer.valueOf(1), Integer.valueOf(i), localObject2, Long.valueOf(((Orders.b)localObject1).rPN), Long.valueOf(((Orders.b)localObject1).rPV) });
                }
              }
              break;
            }
            break;
          }
        }
      }
      label866:
      label1038:
      while ((((Orders.Commodity)localObject2).rPD == null) || (bg.mZ(((Orders.Commodity)localObject2).rPD.rPZ))) {
        for (;;)
        {
          Object localObject4;
          int i;
          if (this.rUU.getVisibility() == 0) {
            this.rUU.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19001472188416L, 141572);
                if ((WalletOrderInfoNewUI.q(WalletOrderInfoNewUI.this).getVisibility() == 0) && (WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getRight() >= WalletOrderInfoNewUI.q(WalletOrderInfoNewUI.this).getLeft()) && (!bg.L(WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getText())))
                {
                  float f1 = WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getTextSize();
                  w.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", new Object[] { Integer.valueOf(WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getRight()), Integer.valueOf(WalletOrderInfoNewUI.q(WalletOrderInfoNewUI.this).getLeft()) });
                  Paint localPaint = new Paint();
                  localPaint.setTextSize(f1);
                  String str = WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getText().toString();
                  f1 = localPaint.measureText(str);
                  float f2 = WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).getRight() - WalletOrderInfoNewUI.q(WalletOrderInfoNewUI.this).getLeft();
                  int i = 1;
                  while ((localPaint.measureText(str.substring(0, str.length() - i - 1)) > f1 - f2) && (i <= str.length() - 1)) {
                    i += 1;
                  }
                  w.i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(str.length()) });
                  WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).setText(str.substring(0, str.length() - i - 1));
                  WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this).append("...");
                }
                GMTrace.o(19001472188416L, 141572);
              }
            });
          }
          GMTrace.o(18829673496576L, 140292);
          return;
          this.rUT.O(((Orders.b)localObject1).ovK, 0, 0);
          this.rUU.setText(((Orders.b)localObject1).name);
          this.rUX.setText(((Orders.b)localObject1).rPL);
          continue;
          if (!bg.mZ(((Orders.b)localObject1).title))
          {
            this.rUV.setText(((Orders.b)localObject1).title);
            ((RelativeLayout.LayoutParams)localObject4).addRule(15, 0);
          }
          else
          {
            this.rUV.setVisibility(8);
            ((RelativeLayout.LayoutParams)localObject4).addRule(15, -1);
            continue;
            if (((String)localObject3).equals("0"))
            {
              i = 0;
              continue;
              if (((String)localObject3).equals("-1"))
              {
                i = 1;
                continue;
                if (((String)localObject3).equals("3"))
                {
                  i = 2;
                  continue;
                  if (((String)localObject3).equals("4"))
                  {
                    i = 3;
                    continue;
                    if (((String)localObject3).equals("2"))
                    {
                      i = 4;
                      continue;
                      if (((String)localObject3).equals("1"))
                      {
                        i = 5;
                        continue;
                        this.rUX.setEnabled(false);
                        continue;
                        ((ViewGroup.MarginLayoutParams)localObject3).topMargin = com.tencent.mm.bq.a.fromDPToPix(this, 50);
                        continue;
                        localObject2 = this.rUJ;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      this.rUB = ((Orders.Commodity)localObject2).rPD.rPZ;
      this.rUC = ((Orders.Commodity)localObject2).rPD.rQa;
      this.rUD = ((Orders.Commodity)localObject2).rPD;
      this.rUT.O(((Orders.Commodity)localObject2).rPD.rPX, 0, 0);
      this.rUU.setText(((Orders.Commodity)localObject2).rPD.rPY);
      this.rUV.setText(getString(R.l.duy));
      this.rUV.setVisibility(0);
      this.rUT.tbV = true;
      this.rUX.setEnabled(true);
      this.rUX.setBackgroundResource(R.g.aWM);
      localObject1 = (RelativeLayout.LayoutParams)this.rUV.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject1).addRule(15, 0);
      this.rUV.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      if (((Orders.Commodity)localObject2).rPD.rQc > 0L)
      {
        if (!bg.mZ(((Orders.Commodity)localObject2).rPD.rQb))
        {
          this.rUX.setVisibility(0);
          this.rUX.setText(((Orders.Commodity)localObject2).rPD.rQb);
          this.rUW.setVisibility(8);
        }
        localObject1 = (a)this.rUG.get(((Orders.Commodity)localObject2).rPD.rQc);
        if (localObject1 != null)
        {
          if (!bg.mZ(((a)localObject1).rPX)) {
            this.rUT.O(((a)localObject1).rPX, 0, 0);
          }
          if (!bg.mZ(((a)localObject1).rPY)) {
            this.rUU.setText(((a)localObject1).rPY);
          }
          if (!bg.mZ(((a)localObject1).rQb))
          {
            this.rUX.setText(((a)localObject1).rQb);
            this.rUX.setBackgroundResource(R.g.bfp);
          }
          if (!bg.mZ(((a)localObject1).rPZ)) {
            this.rUB = ((a)localObject1).rPZ;
          }
          if (!bg.mZ(((a)localObject1).rQa)) {
            this.rUC = ((a)localObject1).rQa;
          }
        }
        label1414:
        localObject1 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17094372491264L, 127363);
            w.i("MicroMsg.WalletOrderInfoNewUI", "click tiny app");
            paramAnonymousView = new px();
            paramAnonymousView.fNL.userName = WalletOrderInfoNewUI.l(WalletOrderInfoNewUI.this);
            paramAnonymousView.fNL.fNN = bg.ap(WalletOrderInfoNewUI.m(WalletOrderInfoNewUI.this), "");
            paramAnonymousView.fNL.scene = 1034;
            paramAnonymousView.fNL.fNO = 0;
            com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
            if ((!bg.mZ(localObject2.rPD.rQb)) && (localObject2.rPD.rQc > 0L)) {
              WalletOrderInfoNewUI.a(WalletOrderInfoNewUI.this, true);
            }
            while (WalletOrderInfoNewUI.n(WalletOrderInfoNewUI.this))
            {
              com.tencent.mm.plugin.report.service.g.paX.i(14118, new Object[] { WalletOrderInfoNewUI.o(WalletOrderInfoNewUI.this), WalletOrderInfoNewUI.this.bvp(), Integer.valueOf(3) });
              GMTrace.o(17094372491264L, 127363);
              return;
              WalletOrderInfoNewUI.a(WalletOrderInfoNewUI.this, false);
            }
            com.tencent.mm.plugin.report.service.g.paX.i(14118, new Object[] { WalletOrderInfoNewUI.o(WalletOrderInfoNewUI.this), WalletOrderInfoNewUI.this.bvp(), Integer.valueOf(1) });
            GMTrace.o(17094372491264L, 127363);
          }
        };
        this.rUS.setOnClickListener((View.OnClickListener)localObject1);
        this.rUX.setOnClickListener((View.OnClickListener)localObject1);
        localObject1 = this.rUU.getText();
        if ((!bg.L((CharSequence)localObject1)) && (((CharSequence)localObject1).length() > 9))
        {
          this.rUU.setText(((CharSequence)localObject1).subSequence(0, 9));
          this.rUU.append("...");
        }
        localObject1 = (ViewGroup.MarginLayoutParams)this.rUS.getLayoutParams();
        localObject3 = ((Orders.Commodity)localObject2).rPA;
        if (((((Orders.Commodity)localObject2).rPx < 0.0D) || (((Orders.Commodity)localObject2).kKX >= ((Orders.Commodity)localObject2).rPx)) && ((localObject3 == null) || (((List)localObject3).size() <= 0))) {
          break label1595;
        }
      }
      label1595:
      for (((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;; ((ViewGroup.MarginLayoutParams)localObject1).topMargin = com.tencent.mm.bq.a.fromDPToPix(this, 50))
      {
        this.rUS.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.rUS.setVisibility(0);
        break;
        this.rUX.setVisibility(8);
        this.rUW.setVisibility(8);
        break label1414;
      }
      label1608:
      localObject1 = null;
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(6937311707136L, 51687);
    if (cO().cP() != null) {
      cO().cP().hide();
    }
    this.rUP = ((ImageView)findViewById(R.h.cLK));
    this.oZA = ((TextView)findViewById(R.h.ciP));
    this.rUK = ((TextView)findViewById(R.h.bnD));
    this.rUL = ((TextView)findViewById(R.h.bHO));
    this.rUM = ((WalletTextView)findViewById(R.h.cBX));
    this.rUN = ((TextView)findViewById(R.h.cir));
    this.rUO = ((Button)findViewById(R.h.ciM));
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
      this.rUO.setText((CharSequence)localObject);
      this.rUO.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7003346829312L, 52179);
          WalletOrderInfoNewUI.this.done();
          GMTrace.o(7003346829312L, 52179);
        }
      });
      this.rUQ = ((ViewGroup)findViewById(R.h.bBZ));
      this.rUR = ((ViewGroup)findViewById(R.h.bBY));
      this.rVg = ((ViewGroup)findViewById(R.h.cJl));
      this.rUS = ((ViewGroup)findViewById(R.h.cAX));
      this.rUT = ((CdnImageView)findViewById(R.h.cAZ));
      this.rUT.tbW = true;
      this.rUU = ((TextView)findViewById(R.h.cAW));
      this.rUV = ((TextView)findViewById(R.h.cBb));
      this.rUX = ((Button)findViewById(R.h.cAU));
      this.rUW = findViewById(R.h.cAY);
      this.rUY = ((ViewGroup)findViewById(R.h.czp));
      this.rUZ = ((TextView)findViewById(R.h.bmy));
      this.rVa = ((CheckBox)findViewById(R.h.czo));
      this.rVb = ((ViewGroup)findViewById(R.h.bgy));
      this.rVc = ((CdnImageView)findViewById(R.h.bgz));
      this.rVc.tbW = true;
      this.rVe = ((TextView)findViewById(R.h.bgA));
      this.rVd = ((TextView)findViewById(R.h.bgx));
      this.rVf = ((Button)findViewById(R.h.bgw));
      this.rVg.setVisibility(4);
      bxF();
      if ((this.rGT != null) && (this.rUA != null) && (this.rUA.size() > 0))
      {
        localObject = (Orders.Commodity)this.rUA.get(0);
        this.rUK.setText(((Orders.Commodity)localObject).oqX);
        this.rUL.setText(e.Wz(((Orders.Commodity)localObject).ori));
        this.rUM.setText(String.format("%.2f", new Object[] { Double.valueOf(((Orders.Commodity)localObject).kKX) }));
      }
      bxG();
      bxH();
      iV(true);
      bxE();
      GMTrace.o(6937311707136L, 51687);
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
  
  protected final boolean aZY()
  {
    GMTrace.i(6938251231232L, 51694);
    GMTrace.o(6938251231232L, 51694);
    return false;
  }
  
  public final void bxI()
  {
    GMTrace.i(6938788102144L, 51698);
    bxJ();
    Object localObject1 = new am();
    ((am)localObject1).fuG.fuH = true;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
    Object localObject2 = new Bundle();
    ((Bundle)localObject2).putInt("intent_pay_end_errcode", this.un.getInt("intent_pay_end_errcode"));
    ((Bundle)localObject2).putString("intent_pay_app_url", this.un.getString("intent_pay_app_url"));
    ((Bundle)localObject2).putBoolean("intent_pay_end", this.un.getBoolean("intent_pay_end"));
    w.i("MicroMsg.WalletOrderInfoNewUI", "pay done...feedbackData errCode:" + this.un.getInt("intent_pay_end_errcode"));
    Iterator localIterator = this.rUz.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (!bg.mZ(str1))
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str1 });
        if ((this.rGT == null) || (this.rHl == null)) {
          break label334;
        }
        n localn = ap.wT();
        String str2 = this.rGT.fAF;
        if (this.rGT.rPj.size() <= 0) {
          break label328;
        }
        localObject1 = ((Orders.Commodity)this.rGT.rPj.get(0)).fKK;
        label245:
        localn.a(new com.tencent.mm.wallet_core.c.h(str1, str2, (String)localObject1, this.rHl.fIG, this.rHl.fIC, this.rGT.rPa), 0);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.paX.i(13033, new Object[] { Integer.valueOf(2), str1, "", "", "" });
        break;
        label328:
        localObject1 = "";
        break label245;
        label334:
        ap.wT().a(new com.tencent.mm.wallet_core.c.h(str1), 0);
      }
    }
    if (this.rVk != null) {
      this.rVk.a(this, 0, (Bundle)localObject2);
    }
    if ((this.rGT != null) && (!bg.mZ(this.rGT.lpQ))) {
      if (this.rGT.rPj.size() <= 0) {
        break label549;
      }
    }
    label549:
    for (localObject1 = ((Orders.Commodity)this.rGT.rPj.get(0)).fKK;; localObject1 = "")
    {
      localObject1 = d(this.rGT.lpQ, this.rGT.fAF, (String)localObject1, this.rHl.knH, this.rHl.iDL);
      w.d("MicroMsg.WalletOrderInfoNewUI", "url = " + (String)localObject1);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("showShare", false);
      ((Intent)localObject2).putExtra("geta8key_username", com.tencent.mm.x.m.zF());
      ((Intent)localObject2).putExtra("stastic_scene", 8);
      com.tencent.mm.bi.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject2);
      GMTrace.o(6938788102144L, 51698);
      return;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6939324973056L, 51702);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.o)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.b.o)paramk;
        paramk = new a(paramString.nKX);
        if (this.rUF == null) {
          break label86;
        }
        this.rUG.put(paramString.rKS, paramk);
        iV(false);
        bxE();
      }
    }
    label86:
    while (!(paramk instanceof f)) {
      for (;;)
      {
        GMTrace.o(6939324973056L, 51702);
        return false;
        if (this.rVh)
        {
          this.rUG.put(paramString.rKS, paramk);
          iV(false);
          bxE();
        }
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (f)paramk;
      paramk = paramString.rKD;
      if ((this.rUI != null) && (this.rUI.rPN == paramString.rKC.rPN))
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "activityAwardState: %s", new Object[] { this.rUI });
        this.rUJ = paramk;
        w.d("MicroMsg.WalletOrderInfoNewUI", "btnName: %s", new Object[] { paramString.rKC.rPL });
        iV(false);
        bxE();
        if ((!bg.mZ(paramString.kCB)) && (!"3".equals(paramk))) {
          this.rUX.setText(paramString.kCB);
        }
      }
      if ((!"-1".equals(paramk)) && (!"0".equals(paramk)) && (!bg.mZ(paramString.rKE))) {
        com.tencent.mm.ui.base.h.b(this, paramString.rKE, "", true);
      }
      while (!"0".equals(paramk))
      {
        GMTrace.o(6939324973056L, 51702);
        return true;
      }
      if (!bg.mZ(paramString.rKE)) {}
      for (paramString = paramString.rKE;; paramString = getString(R.l.eWW))
      {
        Toast.makeText(this, paramString, 0).show();
        break;
      }
    }
    paramk = paramString;
    if (bg.mZ(paramString)) {
      paramk = getString(R.l.eZz);
    }
    com.tencent.mm.ui.base.h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(19318091808768L, 143931);
        GMTrace.o(19318091808768L, 143931);
      }
    });
    GMTrace.o(6939324973056L, 51702);
    return true;
  }
  
  public final void done()
  {
    GMTrace.i(6938653884416L, 51697);
    if (this.un.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.un.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoNewUI");
        localBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        boolean bool1 = localRealnameGuideHelper.b(this, localBundle, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17094640926720L, 127365);
            WalletOrderInfoNewUI.this.bxI();
            GMTrace.o(17094640926720L, 127365);
          }
        });
        boolean bool2 = localRealnameGuideHelper.a(this, localBundle, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19001740623872L, 141574);
            WalletOrderInfoNewUI.this.bxI();
            GMTrace.o(19001740623872L, 141574);
          }
        });
        this.un.remove("key_realname_guide_helper");
        if ((!bool1) && (!bool2)) {
          bxI();
        }
      }
      GMTrace.o(6938653884416L, 51697);
      return;
    }
    bxI();
    GMTrace.o(6938653884416L, 51697);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6938385448960L, 51695);
    int i = R.i.diX;
    GMTrace.o(6938385448960L, 51695);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6937982795776L, 51692);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.WalletOrderInfoNewUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      w.i("MicroMsg.WalletOrderInfoNewUI", "do query pay arawrd");
      l(new com.tencent.mm.plugin.wallet_core.b.o(this.rUF.rKS, this.rUF.rVp, this.rUF.rVq, this.rUF.rVr, this.rUF.fCP, this.rUF.oWy, this.rUF.rQh));
    }
    GMTrace.o(6937982795776L, 51692);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = false;
    GMTrace.i(6937043271680L, 51685);
    super.onCreate(paramBundle);
    int i;
    label244:
    Object localObject;
    boolean bool1;
    label272:
    int j;
    if (com.tencent.mm.compatible.util.d.et(21))
    {
      if (com.tencent.mm.compatible.util.d.et(23))
      {
        getWindow().setStatusBarColor(-1);
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    else
    {
      sh(4);
      this.rUz = new HashSet();
      paramBundle = com.tencent.mm.wallet_core.a.aa(this);
      this.rHl = ((PayInfo)this.un.getParcelable("key_pay_info"));
      this.onw = this.un.getString("key_trans_id");
      this.un.getInt("key_pay_type", -1);
      w.i("MicroMsg.WalletOrderInfoNewUI", "mTransId %s", new Object[] { this.onw });
      this.rGT = bxK();
      if (this.rGT == null) {
        break label794;
      }
      sh(0);
      this.rGT = ((Orders)this.un.getParcelable("key_orders"));
      b(this.rGT);
      if ((paramBundle != null) && (this.rGT != null) && (this.rHl != null))
      {
        this.iqL = this.rHl.appId;
        boolean bool3 = paramBundle.ciA();
        com.tencent.mm.plugin.wallet_core.d.c.b(this, this.un, 7);
        if (this.un.getInt("key_support_bankcard", 1) != 2) {
          break label670;
        }
        i = 2;
        localObject = com.tencent.mm.plugin.report.service.g.paX;
        int k = this.rHl.fIG;
        if (this.rHl.fIG != 3) {
          break label675;
        }
        bool1 = true;
        if (!bool3) {
          break label681;
        }
        j = 1;
        label279:
        ((com.tencent.mm.plugin.report.service.g)localObject).i(10691, new Object[] { Integer.valueOf(k), Boolean.valueOf(bool1), Integer.valueOf(j), Integer.valueOf(com.tencent.mm.wallet_core.c.o.ciP()), Integer.valueOf((int)(this.rGT.rOR * 100.0D)), this.rGT.ori, Integer.valueOf(i) });
      }
      if (((!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY()) && (paramBundle != null) && (paramBundle.ciA())) || (!com.tencent.mm.x.m.zO())) {
        com.tencent.mm.x.m.zP();
      }
      if ((this.rGT == null) || (this.rGT.rPj == null) || (this.rGT.rPj.size() <= 0)) {
        break label686;
      }
      this.rUA = this.rGT.rPj;
      w.i("MicroMsg.WalletOrderInfoNewUI", "init data commoditys size: %s", new Object[] { Integer.valueOf(this.rUA.size()) });
      this.onw = ((Orders.Commodity)this.rUA.get(0)).fKK;
      this.oYQ = ((Orders.Commodity)this.rUA.get(0)).fKK;
      if ((this.rHl != null) && (paramBundle != null) && ((paramBundle.ciz()) || (paramBundle.ciA()))) {
        l(new com.tencent.mm.plugin.wallet_core.b.m(bvp()));
      }
      label539:
      if (this.onw == null)
      {
        ap.AS();
        paramBundle = com.tencent.mm.x.c.xi().get(w.a.uVQ, Boolean.valueOf(false));
        bool1 = bool2;
        if (paramBundle != null) {
          bool1 = ((Boolean)paramBundle).booleanValue();
        }
        if (!bool1) {
          break label724;
        }
        w.i("MicroMsg.WalletOrderInfoNewUI", "has show the finger print auth guide!");
      }
    }
    for (;;)
    {
      MH();
      this.rVk = cjm();
      bxF();
      hz(1979);
      com.tencent.mm.sdk.b.a.uLm.b(this.rVl);
      com.tencent.mm.sdk.b.a.uLm.b(this.opz);
      this.rVj = true;
      GMTrace.o(6937043271680L, 51685);
      return;
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      break;
      label670:
      i = 1;
      break label244;
      label675:
      bool1 = false;
      break label272;
      label681:
      j = 2;
      break label279;
      label686:
      w.k("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new Object[0]);
      com.tencent.mm.ui.base.h.a(this.vov.voR, R.l.eVU, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6981603557376L, 52017);
          WalletOrderInfoNewUI.this.done();
          GMTrace.o(6981603557376L, 52017);
        }
      });
      break label539;
      label724:
      localObject = com.tencent.mm.wallet_core.a.aa(this);
      paramBundle = new Bundle();
      if (localObject != null) {
        paramBundle = ((com.tencent.mm.wallet_core.b)localObject).lRQ;
      }
      if (TextUtils.isEmpty(paramBundle.getString("key_pwd1")))
      {
        w.i("MicroMsg.WalletOrderInfoNewUI", "pwd is empty, not show the finger print auth guide!");
      }
      else if (localObject != null)
      {
        ((com.tencent.mm.wallet_core.b)localObject).a(this, "fingerprint", ".ui.FingerPrintAuthTransparentUI", paramBundle);
        continue;
        label794:
        w.k("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new Object[0]);
        com.tencent.mm.ui.base.h.a(this.vov.voR, R.l.eVU, 0, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(6997038596096L, 52132);
            WalletOrderInfoNewUI.this.finish();
            GMTrace.o(6997038596096L, 52132);
          }
        });
      }
    }
  }
  
  @Deprecated
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(6938117013504L, 51693);
    Dialog localDialog = com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.eWg), getResources().getStringArray(R.c.aMU), "", new h.c()
    {
      public final void hC(int paramAnonymousInt)
      {
        GMTrace.i(19000935317504L, 141568);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(19000935317504L, 141568);
          return;
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletOrderInfoNewUI.s(WalletOrderInfoNewUI.this)));
          localIntent.addFlags(268435456);
          WalletOrderInfoNewUI.this.startActivity(localIntent);
        }
      }
    });
    GMTrace.o(6938117013504L, 51693);
    return localDialog;
  }
  
  public void onDestroy()
  {
    GMTrace.i(6939056537600L, 51700);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.uLm.c(this.rVl);
    com.tencent.mm.sdk.b.a.uLm.c(this.opz);
    hA(1979);
    GMTrace.o(6939056537600L, 51700);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6938922319872L, 51699);
    if (paramInt == 4)
    {
      done();
      GMTrace.o(6938922319872L, 51699);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6938922319872L, 51699);
    return bool;
  }
  
  public void onResume()
  {
    GMTrace.i(6937177489408L, 51686);
    super.onResume();
    w.i("MicroMsg.WalletOrderInfoNewUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s", new Object[] { Boolean.valueOf(this.rVj), this.rUI, Boolean.valueOf(this.rVh), Boolean.valueOf(this.rVi), this.rUD });
    if (this.rVj)
    {
      this.rVj = false;
      GMTrace.o(6937177489408L, 51686);
      return;
    }
    if ((this.rUI != null) && (this.rVi))
    {
      l(new com.tencent.mm.plugin.wallet_core.b.o(this.rUI.rPN, this.rUI.rPP, this.rUI.rPQ, this.rUI.rPR, bvp(), this.oYQ, this.rUI.rPV));
      GMTrace.o(6937177489408L, 51686);
      return;
    }
    if ((this.rVh) && (this.rUD != null)) {
      l(new com.tencent.mm.plugin.wallet_core.b.o(this.rUD.rQc, this.rUD.rQe, this.rUD.rQf, this.rUD.rQg, bvp(), this.oYQ, this.rUD.rQh));
    }
    GMTrace.o(6937177489408L, 51686);
  }
  
  public final void sh(int paramInt)
  {
    GMTrace.i(6939459190784L, 51703);
    this.vov.iiK.setVisibility(paramInt);
    GMTrace.o(6939459190784L, 51703);
  }
  
  final class a
  {
    public String fEM;
    public String fJv;
    public String rPW;
    public String rPX;
    public String rPY;
    public String rPZ;
    public String rQa;
    public String rQb;
    public String rVo;
    public String title;
    public String url;
    
    public a(JSONObject paramJSONObject)
    {
      GMTrace.i(6981200904192L, 52014);
      if (paramJSONObject == null)
      {
        GMTrace.o(6981200904192L, 52014);
        return;
      }
      this$1 = paramJSONObject.optJSONObject("activity_change_info");
      if (WalletOrderInfoNewUI.this != null)
      {
        this.url = WalletOrderInfoNewUI.this.optString("url");
        this.fEM = WalletOrderInfoNewUI.this.optString("wording");
        this.fJv = WalletOrderInfoNewUI.this.optString("icon");
        this.rVo = WalletOrderInfoNewUI.this.optString("btn_text");
        this.title = WalletOrderInfoNewUI.this.optString("title");
        this.rPW = WalletOrderInfoNewUI.this.optString("tinyapp_name");
        this.rPX = WalletOrderInfoNewUI.this.optString("tinyapp_logo");
        this.rPY = WalletOrderInfoNewUI.this.optString("tinyapp_desc");
        this.rPZ = WalletOrderInfoNewUI.this.optString("tinyapp_username");
        this.rQa = WalletOrderInfoNewUI.this.optString("tinyapp_path");
        this.rQb = WalletOrderInfoNewUI.this.optString("activity_tinyapp_btn_text");
      }
      GMTrace.o(6981200904192L, 52014);
    }
    
    public final String toString()
    {
      GMTrace.i(6981335121920L, 52015);
      String str = this.url + " , " + this.fEM + " , " + this.fJv + " , " + this.rVo + " , " + this.title;
      GMTrace.o(6981335121920L, 52015);
      return str;
    }
  }
  
  final class b
  {
    public String fCP;
    public String oWy;
    public String rKS;
    public long rQh;
    public String rVp;
    public String rVq;
    public String rVr;
    
    public b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong)
    {
      GMTrace.i(16141829275648L, 120266);
      this.rKS = paramString1;
      this.rVp = paramString2;
      this.rVq = paramString3;
      this.rVr = paramString4;
      this.fCP = paramString5;
      this.oWy = paramString6;
      this.rQh = paramLong;
      GMTrace.o(16141829275648L, 120266);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */