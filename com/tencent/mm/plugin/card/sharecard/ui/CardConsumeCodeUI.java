package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.c.a;
import com.tencent.mm.plugin.card.a.d.a;
import com.tencent.mm.plugin.card.a.i;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public class CardConsumeCodeUI
  extends MMActivity
  implements View.OnClickListener, c.a, d.a
{
  private final String TAG;
  private Vibrator kiq;
  private int kjz;
  private com.tencent.mm.plugin.card.base.b kmJ;
  private TextView krA;
  private LinearLayout krB;
  private ImageView krC;
  private View krD;
  private LinearLayout krE;
  private View krF;
  private TextView krG;
  private TextView krH;
  private TextView krI;
  private boolean krJ;
  private String krv;
  private int krw;
  private int krx;
  private a kry;
  private TextView krz;
  
  public CardConsumeCodeUI()
  {
    GMTrace.i(5073430118400L, 37800);
    this.TAG = "MicroMsg.CardConsumeCodeUI";
    this.kjz = 3;
    this.krw = 3;
    this.krx = 0;
    this.krJ = false;
    GMTrace.o(5073430118400L, 37800);
  }
  
  protected final void MH()
  {
    GMTrace.i(5073832771584L, 37803);
    Object localObject1;
    label416:
    int i;
    if (this.kmJ.air())
    {
      if (!TextUtils.isEmpty(this.kmJ.aiK().koC)) {
        rV(getString(R.l.dEZ, new Object[] { this.kmJ.aiK().koC }));
      }
    }
    else
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5088596721664L, 37913);
          CardConsumeCodeUI.this.setResult(-1);
          CardConsumeCodeUI.this.finish();
          GMTrace.o(5088596721664L, 37913);
          return true;
        }
      });
      if (this.kry == null)
      {
        this.kry = new a(this, this.vov.iiK);
        localObject1 = this.kry;
        ((a)localObject1).krs = ((a)localObject1).jFp.getWindow().getAttributes().screenBrightness;
        localObject1 = this.kry;
        ((a)localObject1).krl = ((TextView)((a)localObject1).krg.findViewById(R.h.bqC));
        ((a)localObject1).krm = ((TextView)((a)localObject1).krg.findViewById(R.h.bqJ));
        ((a)localObject1).krn = ((CheckBox)((a)localObject1).krg.findViewById(R.h.che));
        ((a)localObject1).krn.setChecked(true);
        ((a)localObject1).krn.setOnClickListener(((a)localObject1).iom);
        if (((a)localObject1).krs < 0.8F) {
          ((a)localObject1).Y(0.8F);
        }
        this.kry.krr = new a.a()
        {
          public final void lB(int paramAnonymousInt)
          {
            GMTrace.i(5092489035776L, 37942);
            al.ajO().y(CardConsumeCodeUI.a(CardConsumeCodeUI.this).aiO(), paramAnonymousInt, 1);
            GMTrace.o(5092489035776L, 37942);
          }
        };
      }
      this.kry.kmJ = this.kmJ;
      this.kry.krq = true;
      Object localObject2;
      if (this.kmJ.aiq())
      {
        localObject1 = this.kry;
        localObject2 = this.krv;
        ((a)localObject1).krp = 1;
        ((a)localObject1).kro = ((String)localObject2);
      }
      this.kiq = ((Vibrator)getSystemService("vibrator"));
      this.krz = ((TextView)findViewById(R.h.bnB));
      this.krA = ((TextView)findViewById(R.h.title));
      this.krB = ((LinearLayout)findViewById(R.h.biq));
      this.krC = ((ImageView)findViewById(R.h.bip));
      this.krD = findViewById(R.h.bAc);
      this.krE = ((LinearLayout)findViewById(R.h.bvx));
      if (!this.kmJ.air()) {
        break label1016;
      }
      findViewById(R.h.bpp).setBackgroundColor(getResources().getColor(R.e.aPC));
      m.b(this, true);
      if ((!this.kmJ.air()) || (TextUtils.isEmpty(this.kmJ.aiK().knr))) {
        break label1052;
      }
      this.krB.setVisibility(0);
      this.krz.setVisibility(8);
      this.krA.setVisibility(8);
      this.krD.setVisibility(8);
      i = getResources().getDimensionPixelSize(R.f.aSN);
      m.a(this.krC, this.kmJ.aiK().knr, i, R.g.baR, true);
      label516:
      if (this.kmJ.aiK().tFA != null)
      {
        localObject1 = this.kmJ.aiK().tFA;
        if (!TextUtils.isEmpty(((nc)localObject1).title))
        {
          if (this.krF == null) {
            this.krF = ((ViewStub)findViewById(R.h.bqK)).inflate();
          }
          this.krF.setOnClickListener(this);
          this.krG = ((TextView)this.krF.findViewById(R.h.bqM));
          this.krH = ((TextView)this.krF.findViewById(R.h.bqL));
          this.krI = ((TextView)this.krF.findViewById(R.h.bqI));
          this.krG.setVisibility(0);
          this.krG.setText(((nc)localObject1).title);
          localObject2 = getResources().getDrawable(R.g.aWZ);
          ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getMinimumWidth(), ((Drawable)localObject2).getMinimumHeight());
          ((Drawable)localObject2).setColorFilter(com.tencent.mm.plugin.card.b.l.uk(this.kmJ.aiK().hbA), PorterDuff.Mode.SRC_IN);
          this.krG.setCompoundDrawables(null, null, (Drawable)localObject2, null);
          this.krG.setTextColor(com.tencent.mm.plugin.card.b.l.uk(this.kmJ.aiK().hbA));
          this.krG.setOnClickListener(this);
          if (TextUtils.isEmpty(((nc)localObject1).kns)) {
            break label1093;
          }
          this.krH.setVisibility(0);
          this.krH.setText(((nc)localObject1).kns);
        }
      }
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(((nc)localObject1).knt))
      {
        this.krI.setVisibility(0);
        this.krI.setText(((nc)localObject1).knt);
      }
      localObject1 = this.krC.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = getResources().getDimensionPixelSize(R.f.aSO);
      ((ViewGroup.LayoutParams)localObject1).width = getResources().getDimensionPixelSize(R.f.aSO);
      this.krC.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      localObject1 = this.krB.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = com.tencent.mm.bq.a.fromDPToPix(this, 54);
      ((ViewGroup.LayoutParams)localObject1).width = com.tencent.mm.bq.a.fromDPToPix(this, 54);
      this.krB.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      i = getResources().getDimensionPixelSize(R.f.aSO);
      m.a(this.krC, this.kmJ.aiK().knr, i, R.g.baR, true);
      this.krE.setPadding(0, com.tencent.mm.bq.a.fromDPToPix(this, 10), 0, com.tencent.mm.bq.a.fromDPToPix(this, 30));
      al.ajN().a(this);
      if (!this.kmJ.aiE()) {
        break label1141;
      }
      al.ajP().a(this);
      if (al.ajP().isEmpty()) {
        break label1118;
      }
      al.ajP().aja();
      GMTrace.o(5073832771584L, 37803);
      return;
      rV(getString(R.l.dEZ, new Object[] { getString(R.l.cOu) }));
      break;
      label1016:
      findViewById(R.h.bpp).setBackgroundColor(com.tencent.mm.plugin.card.b.l.uk(this.kmJ.aiK().hbA));
      m.a(this, this.kmJ);
      break label416;
      label1052:
      this.krz.setText(this.kmJ.aiK().koD);
      this.krA.setText(this.kmJ.aiK().title);
      break label516;
      label1093:
      this.krH.setVisibility(0);
      this.krH.setText(getString(R.l.dFJ));
    }
    label1118:
    w.i("MicroMsg.CardConsumeCodeUI", "registerListener doGetCardCodes");
    al.ajP().tr(this.kmJ.aiO());
    label1141:
    GMTrace.o(5073832771584L, 37803);
  }
  
  public final void ajc()
  {
    GMTrace.i(5075040731136L, 37812);
    this.kry.akd();
    GMTrace.o(5075040731136L, 37812);
  }
  
  public final void ajh()
  {
    GMTrace.i(5074638077952L, 37809);
    this.kiq.vibrate(300L);
    GMTrace.o(5074638077952L, 37809);
  }
  
  public final void aji()
  {
    GMTrace.i(5074772295680L, 37810);
    w.i("MicroMsg.CardConsumeCodeUI", "onFinishUI");
    finish();
    GMTrace.o(5074772295680L, 37810);
  }
  
  public final void f(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5074503860224L, 37808);
    w.i("MicroMsg.CardConsumeCodeUI", "onDataChange");
    if ((paramb != null) && (paramb.aiO() != null) && (paramb.aiO().equals(this.kmJ.aiO())))
    {
      this.kmJ = paramb;
      this.kry.kmJ = this.kmJ;
      this.kry.akd();
    }
    GMTrace.o(5074503860224L, 37808);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5073564336128L, 37801);
    int i = R.i.cNY;
    GMTrace.o(5073564336128L, 37801);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(5075443384320L, 37815);
    if ((paramView.getId() == R.h.bqM) || (paramView.getId() == R.h.bqH))
    {
      if (!this.kmJ.aiD()) {
        break label80;
      }
      paramView = new i.b();
      com.tencent.mm.plugin.card.b.b.a(this, paramView.knf, paramView.kng, false, this.kmJ);
    }
    for (;;)
    {
      finish();
      GMTrace.o(5075443384320L, 37815);
      return;
      label80:
      Object localObject = this.kmJ.aiK().tFA;
      if ((!com.tencent.mm.plugin.card.b.b.a(this.kmJ.aiO(), (nc)localObject, this.krw, this.krx)) && (localObject != null) && (!TextUtils.isEmpty(((nc)localObject).url)))
      {
        com.tencent.mm.plugin.card.b.b.a(this, com.tencent.mm.plugin.card.b.l.r(((nc)localObject).url, ((nc)localObject).tFX), 1);
        g.paX.i(11941, new Object[] { Integer.valueOf(9), this.kmJ.aiO(), this.kmJ.aiP(), "", ((nc)localObject).title });
        if (com.tencent.mm.plugin.card.b.l.a((nc)localObject, this.kmJ.aiO()))
        {
          paramView = this.kmJ.aiO();
          localObject = ((nc)localObject).title;
          com.tencent.mm.plugin.card.b.l.uq(paramView);
          com.tencent.mm.plugin.card.b.b.a(this, this.kmJ.aiK().koD);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5073698553856L, 37802);
    super.onCreate(paramBundle);
    w.i("MicroMsg.CardConsumeCodeUI", "onCreate()");
    setResult(0);
    this.kmJ = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    this.kjz = getIntent().getIntExtra("key_from_scene", 3);
    this.krw = getIntent().getIntExtra("key_previous_scene", 3);
    this.krv = getIntent().getStringExtra("key_mark_user");
    this.krx = getIntent().getIntExtra("key_from_appbrand_type", 0);
    if ((this.kmJ == null) || (this.kmJ.aiK() == null) || (this.kmJ.aiL() == null))
    {
      w.e("MicroMsg.CardConsumeCodeUI", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
      finish();
      GMTrace.o(5073698553856L, 37802);
      return;
    }
    MH();
    al.ajI().m("", "", 3);
    GMTrace.o(5073698553856L, 37802);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5074235424768L, 37806);
    a locala = this.kry;
    locala.Y(locala.krs);
    com.tencent.mm.plugin.card.b.l.u(locala.ioh);
    com.tencent.mm.plugin.card.b.l.u(locala.krk);
    locala.krr = null;
    locala.jFp = null;
    al.ajN().c(this);
    al.ajN().b(this);
    if (this.kmJ.aiE())
    {
      al.ajP().b(this);
      al.ajP().ajb();
    }
    this.kiq.cancel();
    super.onDestroy();
    GMTrace.o(5074235424768L, 37806);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5074369642496L, 37807);
    if (paramInt == 4)
    {
      w.e("MicroMsg.CardConsumeCodeUI", "onKeyDown finishUI");
      setResult(-1);
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5074369642496L, 37807);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(5074101207040L, 37805);
    al.ajN().a(this, false);
    super.onPause();
    GMTrace.o(5074101207040L, 37805);
  }
  
  protected void onResume()
  {
    GMTrace.i(5073966989312L, 37804);
    this.kry.akd();
    al.ajN().a(this, true);
    super.onResume();
    GMTrace.o(5073966989312L, 37804);
  }
  
  public final void onSuccess()
  {
    GMTrace.i(5075309166592L, 37814);
    this.kry.akd();
    GMTrace.o(5075309166592L, 37814);
  }
  
  public final void tq(String paramString)
  {
    GMTrace.i(5075174948864L, 37813);
    com.tencent.mm.plugin.card.b.d.a(this, paramString, true);
    GMTrace.o(5075174948864L, 37813);
  }
  
  public final void tt(String paramString)
  {
    GMTrace.i(5074906513408L, 37811);
    w.i("MicroMsg.CardConsumeCodeUI", "onStartConsumedSuccUI");
    if (this.krJ)
    {
      w.e("MicroMsg.CardConsumeCodeUI", "has start CardConsumeSuccessUI!");
      GMTrace.o(5074906513408L, 37811);
      return;
    }
    w.i("MicroMsg.CardConsumeCodeUI", "startConsumedSuccUI() ");
    this.krJ = true;
    Intent localIntent = new Intent(this, CardConsumeSuccessUI.class);
    localIntent.putExtra("KEY_CARD_ID", this.kmJ.aiO());
    localIntent.putExtra("KEY_CARD_CONSUMED_JSON", paramString);
    localIntent.putExtra("KEY_CARD_COLOR", this.kmJ.aiK().hbA);
    localIntent.putExtra("key_stastic_scene", this.kjz);
    localIntent.putExtra("key_from_scene", 0);
    startActivity(localIntent);
    GMTrace.o(5074906513408L, 37811);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */