package com.tencent.mm.plugin.card.sharecard.ui;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.g.a.bv;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.r;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.j;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CardConsumeSuccessUI
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  private View HB;
  private final String TAG;
  private com.tencent.mm.ui.base.q iXW;
  private View.OnClickListener iom;
  ae jht;
  private String kmv;
  private String knl;
  private TextView krA;
  private TextView krL;
  private TextView krM;
  private TextView krN;
  private TextView krO;
  private ImageView krP;
  private Button krQ;
  private CheckBox krR;
  private j krS;
  private String krT;
  private String krU;
  int krV;
  int krW;
  public int krX;
  private String krY;
  private String krZ;
  private TextView krz;
  public ArrayList<String> ksa;
  public ArrayList<String> ksb;
  private long mStartTime;
  
  public CardConsumeSuccessUI()
  {
    GMTrace.i(5085509713920L, 37890);
    this.TAG = "MicroMsg.CardConsumeSuccessUI";
    this.kmv = "";
    this.krT = "";
    this.knl = "";
    this.krU = "";
    this.krV = 0;
    this.krW = 0;
    this.krX = 0;
    this.krY = "";
    this.krZ = "";
    this.ksa = new ArrayList();
    this.ksb = new ArrayList();
    this.mStartTime = 0L;
    this.jht = new ae(Looper.getMainLooper());
    this.iXW = null;
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5090341552128L, 37926);
        if (paramAnonymousView.getId() == R.h.bfW)
        {
          CardConsumeSuccessUI.a(CardConsumeSuccessUI.this);
          GMTrace.o(5090341552128L, 37926);
          return;
        }
        if (paramAnonymousView.getId() == R.h.czs)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("KLabel_range_index", CardConsumeSuccessUI.this.krX);
          paramAnonymousView.putExtra("Klabel_name_list", CardConsumeSuccessUI.b(CardConsumeSuccessUI.this));
          paramAnonymousView.putExtra("Kother_user_name_list", CardConsumeSuccessUI.c(CardConsumeSuccessUI.this));
          paramAnonymousView.putExtra("k_sns_label_ui_title", CardConsumeSuccessUI.this.getString(R.l.dGn));
          paramAnonymousView.putExtra("k_sns_label_ui_style", 0);
          paramAnonymousView.putExtra("Ktag_rangeFilterprivate", true);
          com.tencent.mm.bi.d.b(CardConsumeSuccessUI.this, "sns", ".ui.SnsLabelUI", paramAnonymousView, 1);
        }
        GMTrace.o(5090341552128L, 37926);
      }
    };
    GMTrace.o(5085509713920L, 37890);
  }
  
  private void ake()
  {
    GMTrace.i(5086717673472L, 37899);
    this.vov.iiK.setBackgroundColor(getResources().getColor(R.e.aPC));
    findViewById(R.h.csf).setVisibility(4);
    GMTrace.o(5086717673472L, 37899);
  }
  
  private String akf()
  {
    GMTrace.i(5087657197568L, 37906);
    String str;
    if ((!TextUtils.isEmpty(this.krY)) && (!TextUtils.isEmpty(this.krZ)))
    {
      str = this.krY + "," + l.uo(this.krZ);
      GMTrace.o(5087657197568L, 37906);
      return str;
    }
    if (!TextUtils.isEmpty(this.krY))
    {
      str = this.krY;
      GMTrace.o(5087657197568L, 37906);
      return str;
    }
    if (!TextUtils.isEmpty(this.krZ))
    {
      str = l.uo(this.krZ);
      GMTrace.o(5087657197568L, 37906);
      return str;
    }
    GMTrace.o(5087657197568L, 37906);
    return "";
  }
  
  private void ar()
  {
    GMTrace.i(5086583455744L, 37898);
    if (this.krS == null)
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "don't updateView() , mConsumedInfo is null");
      GMTrace.o(5086583455744L, 37898);
      return;
    }
    findViewById(R.h.csf).setVisibility(0);
    jn localjn;
    if ((!TextUtils.isEmpty(this.krS.kqN)) && (!TextUtils.isEmpty(this.krS.kqO)))
    {
      this.krR.setText(this.krS.kqN);
      this.krR.setVisibility(0);
      if ((this.krS.kqL == null) || (this.krS.kqL.size() <= 0)) {
        break label428;
      }
      this.krM.setText(getString(R.l.dFa, new Object[] { Integer.valueOf(this.krS.kqL.size()) }));
      localjn = ((com.tencent.mm.plugin.card.sharecard.model.q)this.krS.kqL.get(0)).kov;
      if (localjn == null) {
        break label410;
      }
      tT(localjn.hbA);
      this.krz.setText(localjn.koD);
      this.krA.setText(localjn.title);
      int i = getResources().getDimensionPixelSize(R.f.aSW);
      if (TextUtils.isEmpty(localjn.knr)) {
        break label360;
      }
      Object localObject = new c.a();
      ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
      com.tencent.mm.an.n.Jb();
      ((c.a)localObject).hDk = null;
      ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(localjn.knr);
      ((c.a)localObject).hCP = true;
      ((c.a)localObject).hDm = true;
      ((c.a)localObject).hCN = true;
      ((c.a)localObject).hCW = i;
      ((c.a)localObject).hCV = i;
      ((c.a)localObject).hDe = R.g.baR;
      localObject = ((c.a)localObject).Jk();
      com.tencent.mm.an.n.Ja().a(localjn.knr, this.krP, (c)localObject);
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(localjn.tFf)) {
        break label381;
      }
      this.krQ.setText(R.l.dEY);
      GMTrace.o(5086583455744L, 37898);
      return;
      this.krR.setVisibility(8);
      w.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.subscribe_wording is empty or subscribe_app_username is empty!");
      break;
      label360:
      w.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo.logo_url is empty!");
      this.krP.setImageResource(R.g.baR);
    }
    label381:
    w.e("MicroMsg.CardConsumeSuccessUI", "accept_wording is empty!");
    this.krQ.setText(localjn.tFf);
    GMTrace.o(5086583455744L, 37898);
    return;
    label410:
    w.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo is null!");
    GMTrace.o(5086583455744L, 37898);
    return;
    label428:
    this.krQ.setEnabled(false);
    w.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list is null!");
    GMTrace.o(5086583455744L, 37898);
  }
  
  private void dv(boolean paramBoolean)
  {
    GMTrace.i(5085643931648L, 37891);
    if (paramBoolean)
    {
      this.iXW = com.tencent.mm.ui.base.q.b(this, getString(R.l.bUo), true, 0, null);
      GMTrace.o(5085643931648L, 37891);
      return;
    }
    if ((this.iXW != null) && (this.iXW.isShowing()))
    {
      this.iXW.dismiss();
      this.iXW = null;
    }
    GMTrace.o(5085643931648L, 37891);
  }
  
  private static void lC(int paramInt)
  {
    GMTrace.i(5087388762112L, 37904);
    w.i("MicroMsg.CardConsumeSuccessUI", "pushConsumedEvent resultCode is " + paramInt);
    bv localbv = new bv();
    localbv.fwe.aHi = paramInt;
    com.tencent.mm.sdk.b.a.uLm.m(localbv);
    GMTrace.o(5087388762112L, 37904);
  }
  
  private boolean tS(String paramString)
  {
    GMTrace.i(5086046584832L, 37894);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the consumed json is empty!");
      GMTrace.o(5086046584832L, 37894);
      return false;
    }
    this.krS = r.ut(paramString);
    if (this.krS == null)
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the mConsumedInfo is null! json is " + paramString);
      GMTrace.o(5086046584832L, 37894);
      return false;
    }
    GMTrace.o(5086046584832L, 37894);
    return true;
  }
  
  @TargetApi(16)
  private void tT(String paramString)
  {
    GMTrace.i(5086851891200L, 37900);
    int i = l.uk(paramString);
    this.HB.setBackgroundColor(i);
    com.tencent.mm.plugin.card.b.m.a(this, i);
    if (com.tencent.mm.compatible.util.d.et(16)) {
      this.krQ.setBackground(l.bM(i, getResources().getDimensionPixelSize(R.f.aSH) / 2));
    }
    for (;;)
    {
      this.HB.invalidate();
      GMTrace.o(5086851891200L, 37900);
      return;
      this.krQ.setBackgroundDrawable(l.bM(i, getResources().getDimensionPixelSize(R.f.aSH) / 2));
    }
  }
  
  private void tU(String paramString)
  {
    GMTrace.i(5087120326656L, 37902);
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = getString(R.l.dED);
    }
    h.a(this, str, "", false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(5077456650240L, 37830);
        paramAnonymousDialogInterface.dismiss();
        CardConsumeSuccessUI.akg();
        CardConsumeSuccessUI.this.finish();
        GMTrace.o(5077456650240L, 37830);
      }
    });
    GMTrace.o(5087120326656L, 37902);
  }
  
  protected final void MH()
  {
    GMTrace.i(5086449238016L, 37897);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5088999374848L, 37916);
        CardConsumeSuccessUI.this.finish();
        CardConsumeSuccessUI.akg();
        GMTrace.o(5088999374848L, 37916);
        return true;
      }
    });
    this.HB = this.vov.iiK;
    this.krz = ((TextView)findViewById(R.h.boW));
    this.krA = ((TextView)findViewById(R.h.bqz));
    this.krL = ((TextView)findViewById(R.h.bpr));
    this.krM = ((TextView)findViewById(R.h.czt));
    this.krN = ((TextView)findViewById(R.h.czs));
    this.krO = ((TextView)findViewById(R.h.czr));
    this.krP = ((ImageView)findViewById(R.h.bqf));
    this.krQ = ((Button)findViewById(R.h.bfW));
    this.krR = ((CheckBox)findViewById(R.h.bje));
    this.krQ.setOnClickListener(this.iom);
    this.krR.setOnClickListener(this.iom);
    this.krN.setOnClickListener(this.iom);
    if (this.krS != null) {
      ar();
    }
    GMTrace.o(5086449238016L, 37897);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5086986108928L, 37901);
    w.i("MicroMsg.CardConsumeSuccessUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2 + " scene cmd is " + paramk.getType());
    dv(false);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.g))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.g)paramk;
        if (paramString.kpr == 0)
        {
          h.bl(this, getString(R.l.dEE));
          setResult(-1);
          this.krQ.setEnabled(false);
          l.aml();
          w.i("MicroMsg.CardConsumeSuccessUI", "finish UI!");
          lC(-1);
          paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paramk).kpq;
          paramk = new ShareCardInfo();
          f.a(paramk, paramString);
          l.a(paramk);
          al.ajJ().ahA();
          finish();
          GMTrace.o(5086986108928L, 37901);
          return;
        }
        w.e("MicroMsg.CardConsumeSuccessUI", "shareNetscene.getRetCode() is " + paramString.kpr);
        com.tencent.mm.plugin.card.b.d.b(this, paramString.kps);
        h.bl(this, getString(R.l.dEB));
        GMTrace.o(5086986108928L, 37901);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.d))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.d)paramk;
        if (paramString.kpr == 0)
        {
          if ((!TextUtils.isEmpty(paramString.kpq)) && (tS(paramString.kpq)))
          {
            w.i("MicroMsg.CardConsumeSuccessUI", "consumed return json is valid, update ui");
            this.jht.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5076517126144L, 37823);
                CardConsumeSuccessUI.d(CardConsumeSuccessUI.this);
                GMTrace.o(5076517126144L, 37823);
              }
            });
            GMTrace.o(5086986108928L, 37901);
            return;
          }
          w.e("MicroMsg.CardConsumeSuccessUI", "consumed return json is empty, finish ui!");
          if (this.krV == 1)
          {
            lC(0);
            finish();
            GMTrace.o(5086986108928L, 37901);
            return;
          }
          ake();
          tU(paramString.kps);
          if (bg.mZ(paramString.kps))
          {
            h.bl(this, getString(R.l.dED));
            GMTrace.o(5086986108928L, 37901);
            return;
          }
          h.bl(this, paramString.kps);
          GMTrace.o(5086986108928L, 37901);
          return;
        }
        if (this.krV == 1)
        {
          lC(0);
          finish();
          GMTrace.o(5086986108928L, 37901);
          return;
        }
        w.e("MicroMsg.CardConsumeSuccessUI", "succScene.getRetCode() is " + paramString.kpr);
        ake();
        tU(paramString.kps);
        GMTrace.o(5086986108928L, 37901);
      }
    }
    else
    {
      if (((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.d)) && (this.krV == 1))
      {
        lC(0);
        finish();
        GMTrace.o(5086986108928L, 37901);
        return;
      }
      com.tencent.mm.plugin.card.b.d.b(this, paramString);
    }
    GMTrace.o(5086986108928L, 37901);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5085778149376L, 37892);
    int i = R.i.cNZ;
    GMTrace.o(5085778149376L, 37892);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5087522979840L, 37905);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5087522979840L, 37905);
      return;
      if (paramInt2 != -1)
      {
        GMTrace.o(5087522979840L, 37905);
        return;
      }
      this.krX = paramIntent.getIntExtra("Ktag_range_index", 0);
      w.i("MicroMsg.CardConsumeSuccessUI", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.krX) });
      if (this.krX >= 2)
      {
        this.krY = paramIntent.getStringExtra("Klabel_name_list");
        this.krZ = paramIntent.getStringExtra("Kother_user_name_list");
        w.d("MicroMsg.CardConsumeSuccessUI", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.krX), this.krY });
        if ((TextUtils.isEmpty(this.krY)) && (TextUtils.isEmpty(this.krZ)))
        {
          w.e("MicroMsg.CardConsumeSuccessUI", "mLabelNameList and mPrivateTmpUsers by getIntent is empty");
          GMTrace.o(5087522979840L, 37905);
          return;
        }
        paramIntent = Arrays.asList(this.krY.split(","));
        this.ksb = l.ac(paramIntent);
        this.ksa = l.ab(paramIntent);
        if ((this.krZ != null) && (this.krZ.length() > 0))
        {
          paramIntent = Arrays.asList(this.krZ.split(","));
          this.ksa.addAll(paramIntent);
        }
        if (this.ksb != null) {
          w.i("MicroMsg.CardConsumeSuccessUI", "mPrivateIdsList size is " + this.ksb.size());
        }
        if (this.ksa != null)
        {
          w.i("MicroMsg.CardConsumeSuccessUI", "mPrivateNamesList size is " + this.ksa.size());
          paramIntent = this.ksa.iterator();
          while (paramIntent.hasNext()) {
            w.d("MicroMsg.CardConsumeSuccessUI", "username : %s", new Object[] { (String)paramIntent.next() });
          }
        }
        if (this.krX == 2)
        {
          this.krO.setVisibility(0);
          this.krO.setText(getString(R.l.dGm, new Object[] { akf() }));
          GMTrace.o(5087522979840L, 37905);
          return;
        }
        if (this.krX == 3)
        {
          this.krO.setVisibility(0);
          this.krO.setText(getString(R.l.dGl, new Object[] { akf() }));
          GMTrace.o(5087522979840L, 37905);
          return;
        }
        this.krO.setVisibility(8);
        GMTrace.o(5087522979840L, 37905);
        return;
      }
      this.krO.setVisibility(8);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5085912367104L, 37893);
    super.onCreate(paramBundle);
    w.i("MicroMsg.CardConsumeSuccessUI", "onCreate()");
    this.mStartTime = System.currentTimeMillis();
    rV("");
    setResult(0);
    ap.wT().a(902, this);
    ap.wT().a(910, this);
    paramBundle = "";
    this.krV = getIntent().getIntExtra("key_from_scene", 0);
    Object localObject;
    if (this.krV == 1)
    {
      w.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_JS");
      this.krT = getIntent().getStringExtra("key_consumed_card_id");
      this.krU = getIntent().getStringExtra("key_consumed_Code");
      if (TextUtils.isEmpty(this.krT))
      {
        w.e("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCardId is empty!");
        lC(0);
        finish();
        GMTrace.o(5085912367104L, 37893);
        return;
      }
      w.i("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCode is " + this.krU);
      dv(true);
      localObject = new com.tencent.mm.plugin.card.sharecard.model.d("", this.krT, this.krU);
      ap.wT().a((k)localObject, 0);
      ake();
    }
    for (this.krW = 7;; this.krW = 4)
    {
      com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(this.krW), "", Integer.valueOf(0), "" });
      MH();
      if (!TextUtils.isEmpty(paramBundle)) {
        tT(paramBundle);
      }
      GMTrace.o(5085912367104L, 37893);
      return;
      if (this.krV != 2) {
        break;
      }
      w.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_MSG_UI");
      this.kmv = getIntent().getStringExtra("key_card_id");
      if (TextUtils.isEmpty(this.kmv))
      {
        w.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
        lC(0);
        finish();
        GMTrace.o(5085912367104L, 37893);
        return;
      }
      w.i("MicroMsg.CardConsumeSuccessUI", "the mCardId is " + this.kmv);
      dv(true);
      localObject = new com.tencent.mm.plugin.card.sharecard.model.d(this.kmv, "", "");
      ap.wT().a((k)localObject, 0);
      ake();
    }
    w.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_CONSUMED_CODE");
    this.kmv = getIntent().getStringExtra("KEY_CARD_ID");
    if (!tS(getIntent().getStringExtra("KEY_CARD_CONSUMED_JSON")))
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
      lC(0);
      finish();
      GMTrace.o(5085912367104L, 37893);
      return;
    }
    if ((this.krS != null) && (!bg.bX(this.krS.kqL)))
    {
      paramBundle = ((com.tencent.mm.plugin.card.sharecard.model.q)this.krS.kqL.get(0)).kov;
      if (paramBundle == null) {}
    }
    for (paramBundle = paramBundle.hbA;; paramBundle = "")
    {
      localObject = paramBundle;
      if (bg.mZ(paramBundle)) {
        localObject = getIntent().getStringExtra("KEY_CARD_COLOR");
      }
      this.krW = getIntent().getIntExtra("key_stastic_scene", 0);
      paramBundle = (Bundle)localObject;
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5086315020288L, 37896);
    ap.wT().b(902, this);
    ap.wT().b(910, this);
    long l = System.currentTimeMillis() - this.mStartTime;
    if (!TextUtils.isEmpty(this.kmv)) {
      com.tencent.mm.plugin.report.service.g.paX.i(13219, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(this.krV), this.knl, this.kmv, Long.valueOf(l) });
    }
    for (;;)
    {
      super.onDestroy();
      GMTrace.o(5086315020288L, 37896);
      return;
      com.tencent.mm.plugin.report.service.g.paX.i(13219, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(this.krV), this.knl, this.krT, Long.valueOf(l) });
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5087254544384L, 37903);
    if (paramInt == 4)
    {
      w.e("MicroMsg.CardConsumeSuccessUI", "onKeyDown finishUI");
      lC(0);
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5087254544384L, 37903);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(5086180802560L, 37895);
    super.onResume();
    GMTrace.o(5086180802560L, 37895);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */