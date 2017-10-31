package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ae.m.a;
import com.tencent.mm.ae.m.a.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.protocal.c.ayn;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.s;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.x.ap;

@com.tencent.mm.ui.base.a(1)
public class BottleBeachUI
  extends MMActivity
  implements View.OnClickListener, com.tencent.mm.ac.e, m.a.a, m.b
{
  private com.tencent.mm.ui.base.q ikZ;
  private int kfA;
  boolean kfB;
  private ImageView kfC;
  private ImageView kfD;
  private ImageView kfE;
  private TextView kfF;
  private d kfG;
  private b kfH;
  private boolean kfI;
  private View kfq;
  private FrameLayout kfr;
  private ThrowBottleUI kfs;
  private PickBottleUI kft;
  private OpenBottleUI kfu;
  private BallonImageView kfv;
  private LightHouseImageView kfw;
  private ImageView kfx;
  private MoonImageView kfy;
  private ImageView kfz;
  
  public BottleBeachUI()
  {
    GMTrace.i(7607595040768L, 56681);
    this.kfA = 0;
    this.kfB = true;
    this.ikZ = null;
    this.kfI = true;
    GMTrace.o(7607595040768L, 56681);
  }
  
  private void aha()
  {
    GMTrace.i(7609071435776L, 56692);
    boolean bool = this.kfI;
    kQ(bool);
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      this.kfI = bool;
      GMTrace.o(7609071435776L, 56692);
      return;
    }
  }
  
  private void ahb()
  {
    GMTrace.i(7609742524416L, 56697);
    if (this.kfF == null)
    {
      this.kfF = ((TextView)findViewById(R.h.bmN));
      this.kfF.setBackgroundResource(s.fG(this.vov.voR));
    }
    int i = com.tencent.mm.plugin.bottle.a.c.agR();
    this.kfF.setText(String.valueOf(i));
    TextView localTextView = this.kfF;
    if (i > 0) {}
    for (i = 0;; i = 8)
    {
      localTextView.setVisibility(i);
      GMTrace.o(7609742524416L, 56697);
      return;
    }
  }
  
  private void i(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(7609608306688L, 56696);
    w.v("MM.UI.BottleUI", "set frame visible");
    if (this.kfr == null) {
      this.kfr = ((FrameLayout)findViewById(R.h.bmL));
    }
    this.kfq.setVisibility(paramInt1);
    if (paramInt1 == 0)
    {
      ahb();
      this.kfz.setVisibility(8);
      aKl();
    }
    Object localObject;
    if ((paramInt2 == 0) && (this.kfs == null))
    {
      this.kfs = ((ThrowBottleUI)View.inflate(this, R.i.cNE, null));
      this.kfr.addView(this.kfs);
      localObject = this.kfs;
      ((ThrowBottleUI)localObject).kin = new ToneGenerator(1, 60);
      ((ThrowBottleUI)localObject).kiq = ((Vibrator)((ThrowBottleUI)localObject).kgS.getSystemService("vibrator"));
      ((ThrowBottleUI)localObject).kit = ((ImageView)((ThrowBottleUI)localObject).findViewById(R.h.bnf));
      ((ThrowBottleUI)localObject).kiu = ((TextView)((ThrowBottleUI)localObject).findViewById(R.h.bmE));
      ((ThrowBottleUI)localObject).kiu.setVisibility(8);
      ((ThrowBottleUI)localObject).kiv = ((ImageView)((ThrowBottleUI)localObject).findViewById(R.h.bne));
      ((ThrowBottleUI)localObject).kiw = ((MMEditText)((ThrowBottleUI)localObject).findViewById(R.h.bns));
      ((ThrowBottleUI)localObject).kix = ((ThrowBottleUI)localObject).findViewById(R.h.bno);
      ((ThrowBottleUI)localObject).kiA = ((ThrowBottleFooter)((ThrowBottleUI)localObject).findViewById(R.h.bnt));
      ((ThrowBottleUI)localObject).khp = ((ImageView)((ThrowBottleUI)localObject).kgS.findViewById(R.h.bmI));
      ((ThrowBottleUI)localObject).kiz = ((ImageButton)((ThrowBottleUI)localObject).findViewById(R.h.bmD));
      ((ThrowBottleUI)localObject).kiz.setOnClickListener((View.OnClickListener)localObject);
      ((ThrowBottleUI)localObject).kiy = ((Button)((ThrowBottleUI)localObject).findViewById(R.h.bnp));
      ((ThrowBottleUI)localObject).kiy.setOnTouchListener(new ThrowBottleUI.2((ThrowBottleUI)localObject));
      ((ThrowBottleUI)localObject).setOnClickListener((View.OnClickListener)localObject);
      if (((ThrowBottleUI)localObject).kiD == null)
      {
        ((ThrowBottleUI)localObject).kiD = ((LinearLayout.LayoutParams)((ThrowBottleUI)localObject).kiw.getLayoutParams());
        ((ThrowBottleUI)localObject).kiF = ((ThrowBottleUI)localObject).kiD.topMargin;
      }
      ((ThrowBottleUI)localObject).kiA.kij = new ThrowBottleUI.1((ThrowBottleUI)localObject);
    }
    if (this.kfs != null) {
      this.kfs.setVisibility(paramInt2);
    }
    if ((paramInt3 == 0) && (this.kft == null))
    {
      this.kft = ((PickBottleUI)View.inflate(this, R.i.cND, null));
      this.kfr.addView(this.kft);
      this.kft.MH();
    }
    if (this.kft != null) {
      this.kft.setVisibility(paramInt3);
    }
    if (paramInt3 == 0)
    {
      this.kft.density = com.tencent.mm.bq.a.getDensity(this);
      localObject = this.kft;
      ((PickBottleUI)localObject).kho.setVisibility(8);
      ((PickBottleUI)localObject).khn.z(Integer.MAX_VALUE, -1, -1);
      ((PickBottleUI)localObject).khp.setVisibility(8);
      ((PickBottleUI)localObject).kgS.kfB = false;
      ((PickBottleUI)localObject).handler.postDelayed(((PickBottleUI)localObject).khr, 1000L);
    }
    if ((paramInt4 == 0) && (this.kfu == null))
    {
      this.kfu = ((OpenBottleUI)View.inflate(this, R.i.cNC, null));
      this.kfr.addView(this.kfu);
      localObject = this.kfu;
      ((Button)((OpenBottleUI)localObject).findViewById(R.h.bmU)).setOnClickListener((View.OnClickListener)localObject);
      ((Button)((OpenBottleUI)localObject).findViewById(R.h.bmS)).setOnClickListener((View.OnClickListener)localObject);
      ((OpenBottleUI)localObject).khi = this;
    }
    if (this.kfu != null) {
      this.kfu.setVisibility(paramInt4);
    }
    GMTrace.o(7609608306688L, 56696);
  }
  
  private void kY(int paramInt)
  {
    GMTrace.i(7609205653504L, 56693);
    if (paramInt > 0) {}
    for (String str = this.vov.voR.getString(paramInt);; str = null)
    {
      if (this.kfG == null) {
        this.kfG = new d(this);
      }
      this.kfG.cancel();
      if (str != null)
      {
        this.kfG.setDuration(0);
        this.kfG.setText(str);
        this.kfG.show();
      }
      GMTrace.o(7609205653504L, 56693);
      return;
    }
  }
  
  protected final void MH()
  {
    int j = 8;
    GMTrace.i(7608534564864L, 56688);
    oC(R.l.dDG);
    a(0, R.l.dsV, R.k.dkN, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7630814707712L, 56854);
        paramAnonymousMenuItem = new Intent(BottleBeachUI.this, BottlePersonalInfoUI.class);
        paramAnonymousMenuItem.putExtra("is_allow_set", false);
        BottleBeachUI.this.startActivity(paramAnonymousMenuItem);
        GMTrace.o(7630814707712L, 56854);
        return false;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7625043345408L, 56811);
        BottleBeachUI.this.aKl();
        BottleBeachUI.this.finish();
        GMTrace.o(7625043345408L, 56811);
        return false;
      }
    });
    boolean bool = bg.bNV();
    Object localObject;
    if (this.kfv == null)
    {
      localObject = (FrameLayout)findViewById(R.h.bmG);
      ((FrameLayout)((FrameLayout)localObject).getParent()).removeView((View)localObject);
      ((FrameLayout)getWindow().getDecorView()).addView((View)localObject, 0);
      if (bool)
      {
        i = R.g.aWr;
        ((FrameLayout)localObject).setBackgroundResource(i);
        ((FrameLayout)localObject).setVisibility(0);
        this.kfv = ((BallonImageView)findViewById(R.h.bmF));
        this.kfw = ((LightHouseImageView)findViewById(R.h.bmM));
        this.kfx = ((ImageView)findViewById(R.h.bnk));
        this.kfy = ((MoonImageView)findViewById(R.h.bmO));
      }
    }
    else
    {
      localObject = this.kfv;
      if (!bool) {
        break label375;
      }
      i = 0;
      label190:
      ((BallonImageView)localObject).setVisibility(i);
      localObject = this.kfw;
      if (!bool) {
        break label381;
      }
      i = 8;
      label209:
      ((LightHouseImageView)localObject).setVisibility(i);
      this.kfy.kfx = this.kfx;
      localObject = this.kfy;
      if (!bool) {
        break label386;
      }
    }
    label375:
    label381:
    label386:
    for (int i = j;; i = 0)
    {
      ((MoonImageView)localObject).setVisibility(i);
      this.kfq = findViewById(R.h.bmH);
      this.kfq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7644236480512L, 56954);
          BottleBeachUI.d(BottleBeachUI.this);
          GMTrace.o(7644236480512L, 56954);
        }
      });
      this.kfC = ((ImageView)findViewById(R.h.bnb));
      this.kfD = ((ImageView)findViewById(R.h.bna));
      this.kfE = ((ImageView)findViewById(R.h.bmZ));
      this.kfC.setOnClickListener(this);
      this.kfD.setOnClickListener(this);
      this.kfE.setOnClickListener(this);
      this.kfz = ((ImageView)findViewById(R.h.bmI));
      this.kfz.setOnClickListener(this);
      GMTrace.o(7608534564864L, 56688);
      return;
      i = R.g.aWz;
      break;
      i = 8;
      break label190;
      i = 0;
      break label209;
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(7608400347136L, 56687);
    GMTrace.o(7608400347136L, 56687);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7608668782592L, 56689);
    w.d("MM.UI.BottleUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramInt2 == 63534) && (this.kfA == 0))
    {
      kZ(R.l.dDF);
      GMTrace.o(7608668782592L, 56689);
      return;
    }
    switch (paramk.getType())
    {
    default: 
      kY(R.l.dDO);
      GMTrace.o(7608668782592L, 56689);
      return;
    case 152: 
      ahb();
      GMTrace.o(7608668782592L, 56689);
      return;
    }
    w.i("MM.UI.BottleUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ikZ != null)
    {
      this.ikZ.dismiss();
      this.ikZ = null;
    }
    if (!com.tencent.mm.plugin.bottle.a.ifN.a(this.vov.voR, paramInt1, paramInt2, paramString))
    {
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        com.tencent.mm.ui.base.h.h(this.vov.voR, R.l.dtO, R.l.dxm);
        GMTrace.o(7608668782592L, 56689);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        Toast.makeText(this.vov.voR, this.vov.voR.getString(R.l.eaq, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        GMTrace.o(7608668782592L, 56689);
        return;
      }
      paramString = ((ab)paramk).LC();
      paramk = com.tencent.mm.platformtools.n.a(paramString.tKE);
      com.tencent.mm.ab.n.Dh().f(paramk, com.tencent.mm.platformtools.n.a(paramString.tvs));
      Intent localIntent = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.c.a(localIntent, paramString, 25);
      if (bg.mY(paramk).length() > 0)
      {
        if ((paramString.ufg & 0x8) > 0) {
          com.tencent.mm.plugin.report.service.g.paX.z(10298, paramk + ",25");
        }
        com.tencent.mm.plugin.bottle.a.ifM.d(localIntent, this.vov.voR);
      }
    }
    GMTrace.o(7608668782592L, 56689);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(7610010959872L, 56699);
    ahb();
    GMTrace.o(7610010959872L, 56699);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7607729258496L, 56682);
    int i = R.i.cNA;
    GMTrace.o(7607729258496L, 56682);
    return i;
  }
  
  public final void iL(String paramString)
  {
    GMTrace.i(7609876742144L, 56698);
    if (this.kft != null)
    {
      Object localObject = this.kft;
      if (((PickBottleUI)localObject).kho != null)
      {
        localObject = ((PickBottleUI)localObject).kho;
        if (paramString.equals(((PickedBottleImageView)localObject).keX))
        {
          ((PickedBottleImageView)localObject).khw = com.tencent.mm.ae.m.d(((PickedBottleImageView)localObject).keX, ((PickedBottleImageView)localObject).iconUrl, R.g.bbs);
          ((PickedBottleImageView)localObject).update();
          ((PickedBottleImageView)localObject).invalidate();
        }
      }
    }
    GMTrace.o(7609876742144L, 56698);
  }
  
  public final void kZ(int paramInt)
  {
    GMTrace.i(7609339871232L, 56694);
    if (this.kfH == null) {
      this.kfH = new b(this);
    }
    b localb = this.kfH;
    String str = getString(paramInt);
    localb.imU.setText(str);
    this.kfH.show();
    GMTrace.o(7609339871232L, 56694);
  }
  
  public final void la(int paramInt)
  {
    GMTrace.i(7609474088960L, 56695);
    this.kfA = paramInt;
    kY(0);
    if (this.kfI) {
      aha();
    }
    switch (paramInt)
    {
    default: 
      i(8, 8, 8, 8);
      GMTrace.o(7609474088960L, 56695);
      return;
    case 0: 
      this.kfB = true;
      i(0, 8, 8, 8);
      GMTrace.o(7609474088960L, 56695);
      return;
    case 1: 
      i(8, 0, 8, 8);
      GMTrace.o(7609474088960L, 56695);
      return;
    case 2: 
      i(8, 8, 0, 8);
      GMTrace.o(7609474088960L, 56695);
      return;
    }
    i(8, 8, 8, 0);
    GMTrace.o(7609474088960L, 56695);
  }
  
  public void onClick(final View paramView)
  {
    GMTrace.i(7608937218048L, 56691);
    int i = paramView.getId();
    if (R.h.bnb == i)
    {
      if (com.tencent.mm.plugin.bottle.a.c.agP() > 0)
      {
        la(1);
        GMTrace.o(7608937218048L, 56691);
        return;
      }
      kZ(R.l.dDI);
      GMTrace.o(7608937218048L, 56691);
      return;
    }
    if (R.h.bna == i)
    {
      if (com.tencent.mm.plugin.bottle.a.c.agQ() > 0)
      {
        la(2);
        GMTrace.o(7608937218048L, 56691);
        return;
      }
      kZ(R.l.dDH);
      GMTrace.o(7608937218048L, 56691);
      return;
    }
    if (R.h.bmZ == i)
    {
      if (!this.kfI) {
        aha();
      }
      paramView = new Intent();
      paramView.setClass(this, BottleConversationUI.class);
      paramView.putExtra("conversation_from", "from_beach");
      startActivity(paramView);
      GMTrace.o(7608937218048L, 56691);
      return;
    }
    if (R.h.bmI == i)
    {
      if (this.kfA == 3)
      {
        this.kfu.onPause();
        this.kfu.ahk();
      }
      la(0);
      i(0, 8, 8, 8);
      GMTrace.o(7608937218048L, 56691);
      return;
    }
    if (R.h.bnd == i)
    {
      Object localObject = ((PickedBottleImageView)paramView).khc;
      paramView = ((PickedBottleImageView)paramView).keX;
      if ((paramView != null) && (paramView.length() > 0))
      {
        la(0);
        ap.AS();
        localObject = com.tencent.mm.x.c.yL().SL(paramView);
        if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).gLS != 0) && (com.tencent.mm.l.a.eE(((af)localObject).field_type)))
        {
          paramView = new Intent();
          paramView.putExtra("Contact_User", ((af)localObject).field_username);
          if (((com.tencent.mm.storage.x)localObject).bPH())
          {
            com.tencent.mm.plugin.report.service.g.paX.z(10298, ((af)localObject).field_username + ",25");
            paramView.putExtra("Contact_Scene", 25);
          }
          com.tencent.mm.plugin.bottle.a.ifM.d(paramView, this.vov.voR);
          GMTrace.o(7608937218048L, 56691);
          return;
        }
        paramView = new ab(paramView);
        ap.wT().a(paramView, 0);
        localObject = this.vov.voR;
        getString(R.l.dxm);
        this.ikZ = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.dtR), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(7649202536448L, 56991);
            ap.wT().c(paramView);
            GMTrace.o(7649202536448L, 56991);
          }
        });
        GMTrace.o(7608937218048L, 56691);
        return;
      }
      if (localObject != null)
      {
        la(3);
        paramView = this.kfu;
        if (paramView.khb == null)
        {
          paramView.khb = ((ThrowBottleAnimUI)paramView.kgS.findViewById(R.h.bnm));
          paramView.khb.kif = new OpenBottleUI.1(paramView);
        }
        if (paramView.kgT == null)
        {
          paramView.kgT = ((TextView)paramView.findViewById(R.h.bmT));
          paramView.kgU = ((LinearLayout)paramView.findViewById(R.h.bmW));
          paramView.kgV = ((FrameLayout)paramView.findViewById(R.h.bmY));
          paramView.kgW = ((ImageView)paramView.findViewById(R.h.bmV));
          paramView.kgX = ((TextView)paramView.findViewById(R.h.bmX));
          paramView.kgY = ((TextView)paramView.findViewById(R.h.bmQ));
          paramView.kgZ = ((TextView)paramView.findViewById(R.h.bmR));
          paramView.kgV.setOnClickListener(paramView);
        }
        paramView.khc = ((String)localObject);
        w.d("MM.Bottle_OpenBottleUI", (String)localObject);
        ap.AS();
        paramView.ftK = com.tencent.mm.x.c.yN().Bu((String)localObject);
        if (paramView.ftK.bQC())
        {
          paramView.kgT.setVisibility(8);
          paramView.kgU.setVisibility(0);
          float f = com.tencent.mm.modelvoice.q.A(paramView.ftK);
          paramView.kgV.setMinimumWidth(com.tencent.mm.bq.a.fromDPToPix(paramView.kgS, OpenBottleUI.lf((int)f)));
          paramView.kgX.setText(paramView.kgS.getString(R.l.eaA, new Object[] { Integer.valueOf((int)f) }));
          OpenBottleUI.kha.a(paramView);
          if (paramView.ftK != null)
          {
            f = com.tencent.mm.modelvoice.q.aB(new com.tencent.mm.modelvoice.n(paramView.ftK.field_content).time);
            localObject = paramView.kgV;
            paramView.getResources().getString(R.l.dEd);
            ((FrameLayout)localObject).setContentDescription(String.format("%d", new Object[] { Integer.valueOf((int)f) }));
          }
        }
        for (;;)
        {
          paramView.ahl();
          if (paramView.khh == null)
          {
            paramView.khh = ((TextView)paramView.findViewById(R.h.bFM));
            paramView.khh.setOnClickListener(new OpenBottleUI.4(paramView));
          }
          GMTrace.o(7608937218048L, 56691);
          return;
          paramView.kgT.setVisibility(0);
          paramView.kgU.setVisibility(8);
          localObject = paramView.ftK;
          paramView.kgT.setText(((ce)localObject).field_content);
          com.tencent.mm.pluginsdk.ui.d.h.d(paramView.kgT, 1);
        }
      }
      la(0);
    }
    GMTrace.o(7608937218048L, 56691);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7607863476224L, 56683);
    super.onCreate(paramBundle);
    if (!com.tencent.mm.x.m.zW())
    {
      ap.AS();
      com.tencent.mm.x.c.yK().b(new com.tencent.mm.au.g(11, 1));
    }
    MH();
    ap.wT().a(152, this);
    ap.wT().a(new com.tencent.mm.plugin.bottle.a.d(), 0);
    GMTrace.o(7607863476224L, 56683);
  }
  
  public void onDestroy()
  {
    GMTrace.i(7608266129408L, 56686);
    Object localObject;
    if (this.kfs != null)
    {
      localObject = this.kfs;
      ((ThrowBottleUI)localObject).kim = null;
      ((ThrowBottleUI)localObject).kip = null;
      if (((ThrowBottleUI)localObject).kiq != null)
      {
        ((ThrowBottleUI)localObject).kiq.cancel();
        ((ThrowBottleUI)localObject).kiq = null;
      }
      if (((ThrowBottleUI)localObject).kir != null) {
        ((ThrowBottleUI)localObject).kir.release();
      }
      ((ThrowBottleUI)localObject).kir = null;
      ((ThrowBottleUI)localObject).kis = null;
      ((ThrowBottleUI)localObject).kgS = null;
      if (((ThrowBottleUI)localObject).kin != null) {
        ((ThrowBottleUI)localObject).kin.release();
      }
      this.kfs = null;
    }
    if (this.kft != null)
    {
      localObject = this.kft;
      ((PickBottleUI)localObject).handler.removeCallbacks(((PickBottleUI)localObject).khr);
      ((PickBottleUI)localObject).handler.removeCallbacks(((PickBottleUI)localObject).khs);
      ((PickBottleUI)localObject).kgS = null;
      ((PickBottleUI)localObject).khn = null;
      ((PickBottleUI)localObject).kho = null;
      this.kft = null;
    }
    if (this.kfG != null)
    {
      this.kfG.cancel();
      this.kfG.context = null;
      this.kfG = null;
    }
    if (this.kfu != null)
    {
      localObject = this.kfu;
      if ((((OpenBottleUI)localObject).ftK != null) && (((OpenBottleUI)localObject).ftK.bQC())) {
        ((OpenBottleUI)localObject).ahk();
      }
      ((OpenBottleUI)localObject).kgS = null;
      if (((OpenBottleUI)localObject).khb != null)
      {
        ((OpenBottleUI)localObject).khb.release();
        ((OpenBottleUI)localObject).khb = null;
      }
      OpenBottleUI.kha = null;
      ap.AS();
      com.tencent.mm.x.c.yL().b((m.b)localObject);
      this.kfu = null;
    }
    this.kfv = null;
    this.kfw = null;
    this.kfy = null;
    if (this.kfH != null)
    {
      this.kfH.dismiss();
      this.kfH = null;
    }
    ap.wT().b(152, this);
    super.onDestroy();
    GMTrace.o(7608266129408L, 56686);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7608803000320L, 56690);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
    {
      if (!this.kfB)
      {
        GMTrace.o(7608803000320L, 56690);
        return true;
      }
      if (this.kfA == 0) {
        finish();
      }
      for (;;)
      {
        GMTrace.o(7608803000320L, 56690);
        return true;
        la(0);
      }
    }
    if (this.kfA == 3)
    {
      w.v("MM.UI.BottleUI", "on key dwon");
      if ((paramInt == 25) && (this.kfu.ahn()))
      {
        ap.AT().ei(0);
        GMTrace.o(7608803000320L, 56690);
        return true;
      }
      if ((paramInt == 24) && (this.kfu.ahn()))
      {
        ap.AT().eh(0);
        GMTrace.o(7608803000320L, 56690);
        return true;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(7608803000320L, 56690);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(7608131911680L, 56685);
    super.onPause();
    if ((this.kfA == 1) && (this.kfs != null)) {
      this.kfs.ahx();
    }
    if ((this.kfA == 3) && (this.kfu != null)) {
      this.kfu.onPause();
    }
    if (ap.AV())
    {
      ap.AS();
      com.tencent.mm.x.c.yQ().b(this);
      ap.wT().b(106, this);
    }
    com.tencent.mm.ae.x.FM().b(this);
    GMTrace.o(7608131911680L, 56685);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(7610145177600L, 56700);
    w.i("MM.UI.BottleUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(7610145177600L, 56700);
      return;
      if (paramArrayOfInt[0] != 0) {
        com.tencent.mm.ui.base.h.a(this, getString(R.l.etT), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(7621419466752L, 56784);
            BottleBeachUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            GMTrace.o(7621419466752L, 56784);
          }
        }, null);
      }
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(7607997693952L, 56684);
    super.onResume();
    ahb();
    this.vov.voD.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7617929805824L, 56758);
        if ((BottleBeachUI.a(BottleBeachUI.this) != null) && (BottleBeachUI.b(BottleBeachUI.this) == 0) && (BottleBeachUI.c(BottleBeachUI.this))) {
          BottleBeachUI.d(BottleBeachUI.this);
        }
        GMTrace.o(7617929805824L, 56758);
      }
    }, 1000L);
    if ((this.kfA == 3) && (this.kfu != null))
    {
      OpenBottleUI localOpenBottleUI = this.kfu;
      if ((localOpenBottleUI.ftK != null) && (localOpenBottleUI.ftK.bQC())) {
        OpenBottleUI.kha.a(localOpenBottleUI);
      }
      localOpenBottleUI.dq(true);
      localOpenBottleUI.khj = bg.Pq();
    }
    ap.AS();
    com.tencent.mm.x.c.yQ().a(this);
    com.tencent.mm.ae.x.FM().a(this);
    ap.wT().a(106, this);
    GMTrace.o(7607997693952L, 56684);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/BottleBeachUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */