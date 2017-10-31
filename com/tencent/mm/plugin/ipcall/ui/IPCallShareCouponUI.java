package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.hy;
import com.tencent.mm.plugin.ipcall.a.e.i;
import com.tencent.mm.protocal.c.aej;
import com.tencent.mm.protocal.c.boi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IPCallShareCouponUI
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  private String gEe;
  private String mTitle;
  private com.tencent.mm.sdk.b.c ncj;
  private ProgressDialog ncs;
  private String nfR;
  private String nfS;
  private String nfT;
  private String nfU;
  private String nfV;
  private String nfW;
  private String nfX;
  private String nfY;
  private TextView ngA;
  private TextView ngB;
  private ImageView ngC;
  private TextView ngD;
  private TextView ngE;
  private View ngF;
  private IPCallDynamicTextView ngG;
  private com.tencent.mm.plugin.ipcall.a.e.b ngH;
  private LinkedList<boi> ngI;
  private boolean ngJ;
  private RelativeLayout ngm;
  private TextView ngn;
  private ImageView ngo;
  private RelativeLayout ngp;
  private TextView ngq;
  private ImageView ngr;
  private LinearLayout ngs;
  private LinearLayout ngt;
  private LinearLayout ngu;
  private LinearLayout ngv;
  private ImageView ngw;
  private LinearLayout ngx;
  private ImageView ngy;
  private TextView ngz;
  
  public IPCallShareCouponUI()
  {
    GMTrace.i(11644193210368L, 86756);
    this.ngH = new com.tencent.mm.plugin.ipcall.a.e.b();
    this.nfR = null;
    this.gEe = null;
    this.nfS = null;
    this.mTitle = null;
    this.nfT = null;
    this.nfU = null;
    this.nfV = null;
    this.nfW = null;
    this.nfX = null;
    this.nfY = null;
    this.ngI = null;
    this.ncj = new com.tencent.mm.sdk.b.c() {};
    this.ngJ = false;
    GMTrace.o(11644193210368L, 86756);
  }
  
  private void a(aej paramaej)
  {
    GMTrace.i(11645401169920L, 86765);
    this.nfR = paramaej.tZX;
    this.gEe = paramaej.mCK;
    this.nfS = paramaej.tZY;
    this.mTitle = paramaej.fuw;
    this.nfT = paramaej.nat;
    this.nfU = paramaej.tZZ;
    this.nfW = paramaej.uaa;
    this.nfX = paramaej.uab;
    this.nfY = paramaej.uac;
    this.ngI = paramaej.tZL;
    GMTrace.o(11645401169920L, 86765);
  }
  
  private void amr()
  {
    GMTrace.i(11645132734464L, 86763);
    if (!bg.mZ(this.nfW))
    {
      if (this.nfV == null)
      {
        this.ngG.setValue(this.nfW, this.nfW);
        this.nfV = this.nfW;
      }
    }
    else
    {
      this.ngD.getText();
      this.ngD.setText(this.nfX);
      if (!bg.mZ(this.nfX)) {
        break label189;
      }
      this.ngD.setVisibility(8);
    }
    StringBuffer localStringBuffer;
    for (;;)
    {
      localStringBuffer = new StringBuffer("");
      if ((this.ngI == null) || (this.ngI.size() <= 0)) {
        break label200;
      }
      Iterator localIterator = this.ngI.iterator();
      while (localIterator.hasNext())
      {
        boi localboi = (boi)localIterator.next();
        if ((localboi != null) && (!bg.mZ(localboi.uEM))) {
          localStringBuffer.append(localboi.uEM).append('\n');
        }
      }
      this.ngG.setValue(this.nfV, this.nfW);
      break;
      label189:
      this.ngD.setVisibility(0);
    }
    label200:
    if (!bg.mZ(localStringBuffer.toString()))
    {
      if (localStringBuffer.charAt(localStringBuffer.length() - 1) == '\n') {
        localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
      }
      this.ngE.setText(localStringBuffer.toString());
      this.ngE.setVisibility(0);
    }
    while ((this.ngD.getVisibility() == 0) && (this.ngE.getVisibility() == 0))
    {
      this.ngF.setVisibility(0);
      GMTrace.o(11645132734464L, 86763);
      return;
      this.ngE.setText("");
      this.ngE.setVisibility(8);
    }
    this.ngF.setVisibility(8);
    GMTrace.o(11645132734464L, 86763);
  }
  
  protected final int Qb()
  {
    GMTrace.i(11644327428096L, 86757);
    GMTrace.o(11644327428096L, 86757);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11645266952192L, 86764);
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.g))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        a(((com.tencent.mm.plugin.ipcall.a.d.g)paramk).mZl);
        amr();
        if ((this.ncs != null) && (this.ncs.isShowing())) {
          this.ncs.dismiss();
        }
        GMTrace.o(11645266952192L, 86764);
        return;
      }
      if ((this.ncs != null) && (this.ncs.isShowing()))
      {
        this.ncs.dismiss();
        h.a(this.vov.voR, getString(R.l.ehO), getString(R.l.ehK), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19564381339648L, 145766);
            IPCallShareCouponUI.this.finish();
            GMTrace.o(19564381339648L, 145766);
          }
        });
      }
    }
    GMTrace.o(11645266952192L, 86764);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11644998516736L, 86762);
    int i = R.i.cXQ;
    GMTrace.o(11644998516736L, 86762);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11644595863552L, 86759);
    super.onCreate(paramBundle);
    ap.wT().a(257, this);
    com.tencent.mm.sdk.b.a.uLm.b(this.ncj);
    oC(R.l.eiy);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11632382050304L, 86668);
        IPCallShareCouponUI.this.finish();
        GMTrace.o(11632382050304L, 86668);
        return true;
      }
    });
    this.vov.bUJ();
    a(0, R.g.baG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(19564112904192L, 145764);
        paramAnonymousMenuItem = com.tencent.mm.plugin.ipcall.b.c.aIF();
        int i;
        if ((paramAnonymousMenuItem != null) && (!bg.mZ(paramAnonymousMenuItem.uah))) {
          if (com.tencent.mm.k.g.uz().getInt("WCOWebPayListSwitch", 0) > 0)
          {
            i = 1;
            if (i == 0) {
              break label144;
            }
            i = 1;
            label46:
            if (i == 0) {
              break label149;
            }
            paramAnonymousMenuItem = new String[3];
            paramAnonymousMenuItem[0] = IPCallShareCouponUI.this.getString(R.l.eix);
            paramAnonymousMenuItem[1] = IPCallShareCouponUI.this.getString(R.l.ehL);
            paramAnonymousMenuItem[2] = IPCallShareCouponUI.this.getString(R.l.ehw);
            IPCallShareCouponUI.a(IPCallShareCouponUI.this, true);
          }
        }
        for (;;)
        {
          h.a(IPCallShareCouponUI.this.vov.voR, null, paramAnonymousMenuItem, null, false, new h.c()
          {
            public final void hC(int paramAnonymous2Int)
            {
              GMTrace.i(19563710251008L, 145761);
              int i = paramAnonymous2Int;
              if (!IPCallShareCouponUI.h(IPCallShareCouponUI.this)) {
                i = paramAnonymous2Int + 1;
              }
              switch (i)
              {
              }
              for (;;)
              {
                GMTrace.o(19563710251008L, 145761);
                return;
                IPCallShareCouponUI.i(IPCallShareCouponUI.this);
                GMTrace.o(19563710251008L, 145761);
                return;
                IPCallShareCouponUI.d(IPCallShareCouponUI.this);
                GMTrace.o(19563710251008L, 145761);
                return;
                IPCallShareCouponUI.e(IPCallShareCouponUI.this);
              }
            }
          });
          GMTrace.o(19564112904192L, 145764);
          return true;
          i = 0;
          break;
          label144:
          i = 0;
          break label46;
          label149:
          paramAnonymousMenuItem = new String[2];
          paramAnonymousMenuItem[0] = IPCallShareCouponUI.this.getString(R.l.ehL);
          paramAnonymousMenuItem[1] = IPCallShareCouponUI.this.getString(R.l.ehw);
          IPCallShareCouponUI.a(IPCallShareCouponUI.this, false);
        }
      }
    });
    this.ngG = ((IPCallDynamicTextView)findViewById(R.h.bkk));
    this.ngm = ((RelativeLayout)findViewById(R.h.coU));
    this.ngn = ((TextView)findViewById(R.h.cpl));
    this.ngo = ((ImageView)findViewById(R.h.coY));
    ap.AS();
    if (((Boolean)com.tencent.mm.x.c.xi().get(w.a.uWt, Boolean.valueOf(false))).booleanValue()) {
      this.ngo.setVisibility(0);
    }
    ap.AS();
    paramBundle = (String)com.tencent.mm.x.c.xi().get(w.a.uWs, "");
    this.ngn.setText(paramBundle);
    this.ngp = ((RelativeLayout)findViewById(R.h.clk));
    this.ngq = ((TextView)findViewById(R.h.ciC));
    this.ngr = ((ImageView)findViewById(R.h.ciA));
    ap.AS();
    paramBundle = (String)com.tencent.mm.x.c.xi().get(w.a.uWu, "");
    this.ngq.setText(paramBundle);
    this.ngD = ((TextView)findViewById(R.h.bzx));
    this.ngE = ((TextView)findViewById(R.h.ciz));
    this.ngF = findViewById(R.h.cyt);
    this.ngs = ((LinearLayout)findViewById(R.h.bEY));
    this.ngC = ((ImageView)findViewById(R.h.cfq));
    ap.AS();
    if (((Boolean)com.tencent.mm.x.c.xi().get(w.a.uWv, Boolean.valueOf(false))).booleanValue()) {
      this.ngC.setVisibility(0);
    }
    this.ngz = ((TextView)findViewById(R.h.cgJ));
    this.ngA = ((TextView)findViewById(R.h.bhm));
    this.ngB = ((TextView)findViewById(R.h.czl));
    this.ngt = ((LinearLayout)findViewById(R.h.cxz));
    this.ngu = ((LinearLayout)findViewById(R.h.cex));
    this.ngx = ((LinearLayout)findViewById(R.h.cuj));
    this.ngy = ((ImageView)findViewById(R.h.cuk));
    this.ngv = ((LinearLayout)findViewById(R.h.cdF));
    this.ngw = ((ImageView)findViewById(R.h.cdG));
    ap.AS();
    if (((Boolean)com.tencent.mm.x.c.xi().get(w.a.uWB, Boolean.valueOf(false))).booleanValue()) {
      this.ngw.setVisibility(0);
    }
    int i;
    label566:
    label594:
    label600:
    label621:
    label786:
    Object localObject1;
    Object localObject2;
    if (com.tencent.mm.plugin.ipcall.b.c.aIE())
    {
      i = 1;
      if (i != 0) {
        this.ngm.setVisibility(8);
      }
      if ((com.tencent.mm.plugin.ipcall.b.c.aIE()) || (com.tencent.mm.k.g.uz().getInt("WCOPackagePurchaseSwitch", 0) == 0)) {
        break label1069;
      }
      i = 1;
      if (i != 0) {
        this.ngp.setVisibility(0);
      }
      if (com.tencent.mm.k.g.uz().getInt("WCOAccountDetailSwitch", 0) != 1) {
        break label1074;
      }
      i = 1;
      if (i == 0) {
        break label1079;
      }
      i = 1;
      if (i != 0) {
        this.ngs.setVisibility(8);
      }
      if (!com.tencent.mm.plugin.ipcall.b.c.aIE()) {
        break label1084;
      }
      i = 1;
      if (i != 0) {
        this.ngt.setVisibility(8);
      }
      this.ngz.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11690364108800L, 87100);
          IPCallShareCouponUI.d(IPCallShareCouponUI.this);
          GMTrace.o(11690364108800L, 87100);
        }
      });
      this.ngA.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11731434733568L, 87406);
          IPCallShareCouponUI.e(IPCallShareCouponUI.this);
          GMTrace.o(11731434733568L, 87406);
        }
      });
      this.ngs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11658822942720L, 86865);
          IPCallShareCouponUI.f(IPCallShareCouponUI.this);
          GMTrace.o(11658822942720L, 86865);
        }
      });
      this.ngt.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11668889272320L, 86940);
          com.tencent.mm.plugin.report.service.g.paX.i(13340, new Object[] { Integer.valueOf(1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vov.voR, IPCallShareCouponCardUI.class);
          IPCallShareCouponUI.this.vov.voR.startActivity(paramAnonymousView);
          GMTrace.o(11668889272320L, 86940);
        }
      });
      this.ngv.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11647817089024L, 86783);
          ap.AS();
          if (((Boolean)com.tencent.mm.x.c.xi().get(w.a.uWB, Boolean.valueOf(false))).booleanValue())
          {
            ap.AS();
            i.F(4, -1, ((Integer)com.tencent.mm.x.c.xi().get(w.a.uWC, Integer.valueOf(-1))).intValue());
          }
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uWC, Integer.valueOf(-1));
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uWB, Boolean.valueOf(false));
          IPCallShareCouponUI.g(IPCallShareCouponUI.this).setVisibility(8);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vov.voR, IPCallMsgUI.class);
          IPCallShareCouponUI.this.vov.voR.startActivity(paramAnonymousView);
          GMTrace.o(11647817089024L, 86783);
        }
      });
      this.ngu.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11671305191424L, 86958);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vov.voR, IPCallMyGiftCardUI.class);
          IPCallShareCouponUI.this.vov.voR.startActivity(paramAnonymousView);
          GMTrace.o(11671305191424L, 86958);
        }
      });
      this.ngm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11719489355776L, 87317);
          ap.AS();
          if (((Boolean)com.tencent.mm.x.c.xi().get(w.a.uWt, Boolean.valueOf(false))).booleanValue() == true) {
            i.F(3, -1, -1);
          }
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uWt, Boolean.valueOf(false));
          IPCallShareCouponUI.a(IPCallShareCouponUI.this).setVisibility(8);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vov.voR, IPCallRechargeUI.class);
          IPCallShareCouponUI.this.startActivity(paramAnonymousView);
          GMTrace.o(11719489355776L, 87317);
        }
      });
      this.ngp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(15072248201216L, 112297);
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(IPCallShareCouponUI.this.vov.voR, IPCallPackageUI.class);
          IPCallShareCouponUI.this.startActivity(paramAnonymousView);
          GMTrace.o(15072248201216L, 112297);
        }
      });
      this.ngx.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16567702126592L, 123439);
          Intent localIntent = new Intent();
          paramAnonymousView = IPCallShareCouponUI.this.getString(R.l.eie) + "&usedcc=";
          Object localObject = com.tencent.mm.plugin.ipcall.a.c.aGX().aHa();
          int j;
          if ((localObject != null) && (((List)localObject).size() > 0))
          {
            j = ((List)localObject).size();
            int i = j;
            if (j > 5) {
              i = 5;
            }
            j = 0;
            if (j < i)
            {
              String str = com.tencent.mm.plugin.ipcall.b.a.Af(((Integer)((List)localObject).get(j)).toString());
              if (bg.mZ(str)) {
                break label246;
              }
              paramAnonymousView = paramAnonymousView + str + "|";
            }
          }
          label246:
          for (;;)
          {
            j += 1;
            break;
            localObject = paramAnonymousView;
            if (paramAnonymousView.endsWith("|")) {}
            for (localObject = paramAnonymousView.substring(0, paramAnonymousView.length() - 1);; localObject = paramAnonymousView + com.tencent.mm.plugin.ipcall.b.a.Af(com.tencent.mm.plugin.ipcall.b.c.aID()))
            {
              localIntent.putExtra("rawUrl", (String)localObject);
              localIntent.putExtra("showShare", false);
              d.b(IPCallShareCouponUI.this, "webview", ".ui.tools.WebViewUI", localIntent);
              GMTrace.o(16567702126592L, 123439);
              return;
            }
          }
        }
      });
      paramBundle = com.tencent.mm.plugin.ipcall.b.c.aIF();
      if (paramBundle == null) {
        break label1119;
      }
      a(paramBundle);
      amr();
      if (!com.tencent.mm.plugin.ipcall.b.c.aIE()) {
        break label1194;
      }
      paramBundle = getString(R.l.ejm);
      localObject1 = getString(R.l.ejl);
      localObject2 = paramBundle + (String)localObject1;
      localObject1 = new ClickableSpan()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19563844468736L, 145762);
          ((TextView)paramAnonymousView).setHighlightColor(IPCallShareCouponUI.this.getResources().getColor(R.e.transparent));
          paramAnonymousView = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=weixin_phone/notice";
          Object localObject = v.eq(ab.getContext());
          if (!bg.mZ((String)localObject)) {
            paramAnonymousView = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=weixin_phone/notice" + "&wechat_real_lang=" + (String)localObject;
          }
          localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", paramAnonymousView);
          ((Intent)localObject).putExtra("showShare", false);
          d.b(IPCallShareCouponUI.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
          GMTrace.o(19563844468736L, 145762);
        }
        
        public final void updateDrawState(TextPaint paramAnonymousTextPaint)
        {
          GMTrace.i(19563978686464L, 145763);
          paramAnonymousTextPaint.setColor(IPCallShareCouponUI.this.getResources().getColor(R.e.aOU));
          paramAnonymousTextPaint.setUnderlineText(false);
          GMTrace.o(19563978686464L, 145763);
        }
      };
      localObject2 = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject2);
      i = paramBundle.length();
      int j = ((Spannable)localObject2).length();
      if ((i < 0) || (i >= j) || (j < 0) || (j > ((Spannable)localObject2).length())) {
        break label1172;
      }
      ((Spannable)localObject2).setSpan(localObject1, i, j, 33);
      label900:
      this.ngB.setText((CharSequence)localObject2);
      this.ngB.setMovementMethod(LinkMovementMethod.getInstance());
      this.ngB.setVisibility(0);
    }
    for (;;)
    {
      paramBundle = (LinearLayout)findViewById(R.h.bTo);
      if ((paramBundle != null) && (this.ngm.getVisibility() == 8) && (this.ngp.getVisibility() == 8)) {
        paramBundle.setVisibility(8);
      }
      paramBundle = (LinearLayout)findViewById(R.h.bTp);
      if ((paramBundle != null) && (this.ngt.getVisibility() == 8) && (this.ngu.getVisibility() == 8)) {
        paramBundle.setVisibility(8);
      }
      this.ngH.start();
      GMTrace.o(11644595863552L, 86759);
      return;
      if (com.tencent.mm.k.g.uz().getInt("WCOPurchaseSwitch", 0) == 1) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label1064;
        }
        i = 1;
        break;
      }
      label1064:
      i = 0;
      break;
      label1069:
      i = 0;
      break label566;
      label1074:
      i = 0;
      break label594;
      label1079:
      i = 0;
      break label600;
      label1084:
      if (com.tencent.mm.k.g.uz().getInt("WCOInviteFriend", 0) == 1) {}
      for (i = 1;; i = 0)
      {
        if (i == 0) {
          break label1114;
        }
        i = 1;
        break;
      }
      label1114:
      i = 0;
      break label621;
      label1119:
      this.ngG.setText("0");
      paramBundle = this.vov.voR;
      getString(R.l.dxm);
      this.ncs = h.a(paramBundle, getString(R.l.ehQ), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(16567970562048L, 123441);
          try
          {
            IPCallShareCouponUI.this.finish();
            GMTrace.o(16567970562048L, 123441);
            return;
          }
          catch (Exception paramAnonymousDialogInterface)
          {
            w.e("MicroMsg.IPCallShareCouponUI", "IPCallShareCouponUI error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
            GMTrace.o(16567970562048L, 123441);
          }
        }
      });
      break label786;
      label1172:
      ((Spannable)localObject2).setSpan(localObject1, 0, ((Spannable)localObject2).length(), 33);
      break label900;
      label1194:
      this.ngB.setVisibility(8);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11644864299008L, 86761);
    super.onDestroy();
    ap.wT().b(257, this);
    com.tencent.mm.sdk.b.a.uLm.c(this.ncj);
    this.ngH.mZD = System.currentTimeMillis();
    this.ngH.finish();
    GMTrace.o(11644864299008L, 86761);
  }
  
  protected void onResume()
  {
    GMTrace.i(11644730081280L, 86760);
    super.onResume();
    com.tencent.mm.plugin.ipcall.a.f.b.aHQ().ft(false);
    GMTrace.o(11644730081280L, 86760);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */