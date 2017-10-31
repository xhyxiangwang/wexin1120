package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.d.b.f.b.a;
import com.tencent.d.b.f.f;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.walletlock.a.a;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.a.d;
import com.tencent.mm.plugin.walletlock.a.e;
import com.tencent.mm.plugin.walletlock.a.g;
import com.tencent.mm.plugin.walletlock.fingerprint.a.c;
import com.tencent.mm.plugin.walletlock.fingerprint.a.d.a;
import com.tencent.mm.plugin.walletlock.fingerprint.a.h.1;
import com.tencent.mm.plugin.walletlock.fingerprint.a.h.2;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.p;
import java.lang.ref.WeakReference;

public class FingerprintWalletLockUI
  extends MMActivity
{
  private String hyx;
  private TextView jPf;
  private String lZf;
  private int lZn;
  private boolean nTn;
  private boolean oFe;
  private boolean seW;
  private TextView sfc;
  private TextView sfd;
  private Animation sfe;
  private String sff;
  private String sfg;
  private com.tencent.mm.plugin.walletlock.fingerprint.a.d sfh;
  private com.tencent.mm.plugin.walletlock.fingerprint.a.h sfi;
  private com.tencent.mm.plugin.walletlock.b.b sfj;
  private String sfk;
  private ProgressDialog sfl;
  private com.tencent.mm.ui.base.i sfm;
  private int sfn;
  private String uH;
  
  public FingerprintWalletLockUI()
  {
    GMTrace.i(20258286993408L, 150936);
    this.sfk = "-1";
    this.lZn = 0;
    this.sfl = null;
    this.sfm = null;
    this.lZf = null;
    this.seW = false;
    this.oFe = false;
    this.nTn = true;
    this.sfn = -1;
    GMTrace.o(20258286993408L, 150936);
  }
  
  private void bva()
  {
    GMTrace.i(20260031823872L, 150949);
    if ((this.sfl != null) && (this.sfl.isShowing())) {
      this.sfl.dismiss();
    }
    GMTrace.o(20260031823872L, 150949);
  }
  
  private void byE()
  {
    GMTrace.i(20258958082048L, 150941);
    if (this.uH.equals("action.verify_pattern"))
    {
      this.sfc.setText(a.g.seA);
      this.sfc.setTextColor(getResources().getColor(a.b.aPH));
      this.sfd.setVisibility(0);
      GMTrace.o(20258958082048L, 150941);
      return;
    }
    this.sfc.setText(a.g.sev);
    this.sfc.setTextColor(getResources().getColor(a.b.aPH));
    this.sfd.setVisibility(8);
    GMTrace.o(20258958082048L, 150941);
  }
  
  private void byF()
  {
    GMTrace.i(20259226517504L, 150943);
    bva();
    i.a locala = new i.a(this);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo mAuthType: %d", new Object[] { Integer.valueOf(this.sfn) });
    if (this.sfn == 2) {
      locala.Bh(a.g.seF).Bj(a.g.seI).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20263118831616L, 150972);
          FingerprintWalletLockUI.g(FingerprintWalletLockUI.this);
          GMTrace.o(20263118831616L, 150972);
        }
      }).Bk(a.g.duP).b(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20263655702528L, 150976);
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo click negative button");
          GMTrace.o(20263655702528L, 150976);
        }
      });
    }
    for (;;)
    {
      this.sfm = locala.ZT();
      this.sfm.setCanceledOnTouchOutside(false);
      this.sfm.show();
      GMTrace.o(20259226517504L, 150943);
      return;
      locala.Bh(a.g.seE).UI(getString(a.g.dwr)).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20258152775680L, 150935);
          FingerprintWalletLockUI.this.finish();
          FingerprintWalletLockUI.byI();
          GMTrace.o(20258152775680L, 150935);
        }
      });
    }
  }
  
  private void byG()
  {
    GMTrace.i(20259629170688L, 150946);
    w.i("MicroMsg.FingerprintWalletLockUI", "currentAction: %s", new Object[] { this.sfg });
    if (bg.mZ(this.sfg))
    {
      finish();
      GMTrace.o(20259629170688L, 150946);
      return;
    }
    Object localObject1 = this.sfg;
    int i = -1;
    switch (((String)localObject1).hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(20259629170688L, 150946);
      return;
      if (!((String)localObject1).equals("action.switch_on_pattern")) {
        break;
      }
      i = 0;
      break;
      if (!((String)localObject1).equals("action.verify_pattern")) {
        break;
      }
      i = 1;
      break;
      if (!((String)localObject1).equals("next_action.switch_on_pattern")) {
        break;
      }
      i = 2;
      break;
      if (!((String)localObject1).equals("next_action.goto_protected_page")) {
        break;
      }
      i = 3;
      break;
      this.sfj = new a(this);
      this.sfk = "-1";
      if (this.sfi == null) {
        this.sfi = new com.tencent.mm.plugin.walletlock.fingerprint.a.h();
      }
      localObject1 = this.sfi;
      Object localObject2 = this.sfj;
      Object localObject3 = new h.1((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1, (com.tencent.mm.plugin.walletlock.b.b)localObject2);
      ((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1).lYV = new com.tencent.d.b.c.a();
      localObject3 = new b.a().hO(this).a(((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1).lYV).XE(com.tencent.mm.plugin.walletlock.b.g.sgO.sgP).EB(3).a((com.tencent.d.b.c.b)localObject3).xCu;
      com.tencent.mm.plugin.walletlock.b.g.sgO.sgQ = null;
      w.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo start auth");
      com.tencent.d.b.a.a(new h.2((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1, (com.tencent.mm.plugin.walletlock.b.b)localObject2), (com.tencent.d.b.f.b)localObject3);
      GMTrace.o(20259629170688L, 150946);
      return;
      localObject2 = com.tencent.mm.plugin.walletlock.b.g.sgO.sgQ;
      if (localObject2 == null)
      {
        pZ(getString(a.g.sew));
        GMTrace.o(20259629170688L, 150946);
        return;
      }
      localObject1 = ((com.tencent.d.a.c.h)localObject2).xBV;
      localObject2 = ((com.tencent.d.a.c.h)localObject2).signature;
      if (this.sfh != null)
      {
        this.sfl = com.tencent.mm.ui.base.h.a(this, getString(a.g.seB), false, null);
        this.sfh.a(new d.a()
        {
          public final void R(int paramAnonymousInt, String paramAnonymousString)
          {
            GMTrace.i(20257615904768L, 150931);
            w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo open fingerprint lock onFinish errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
            if (paramAnonymousInt == 0)
            {
              FingerprintWalletLockUI.i(FingerprintWalletLockUI.this);
              GMTrace.o(20257615904768L, 150931);
              return;
            }
            FingerprintWalletLockUI.b(FingerprintWalletLockUI.this, FingerprintWalletLockUI.this.getString(a.g.set));
            GMTrace.o(20257615904768L, 150931);
          }
        }, this.hyx, (String)localObject1, (String)localObject2);
      }
      GMTrace.o(20259629170688L, 150946);
      return;
      com.tencent.mm.plugin.walletlock.fingerprint.a.a.ee(SystemClock.elapsedRealtime());
      byH();
    }
  }
  
  private void byH()
  {
    GMTrace.i(20259763388416L, 150947);
    this.nTn = false;
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20255468421120L, 150915);
        FingerprintWalletLockUI.this.finish();
        GMTrace.o(20255468421120L, 150915);
      }
    }, 200L);
    Intent localIntent = (Intent)getIntent().getParcelableExtra("page_intent");
    if (localIntent != null)
    {
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo go to protected page");
      com.tencent.mm.plugin.walletlock.b.i.sgS.jj(true);
      com.tencent.mm.plugin.walletlock.b.i.sgS.jk(true);
      localIntent.addFlags(131072);
      startActivity(localIntent);
      overridePendingTransition(a.a.aMn, a.a.aMq);
      GMTrace.o(20259763388416L, 150947);
      return;
    }
    w.i("MicroMsg.FingerprintWalletLockUI", "Protected page's intent not found, finish myself only.");
    GMTrace.o(20259763388416L, 150947);
  }
  
  private void dismissDialog()
  {
    GMTrace.i(20259360735232L, 150944);
    bva();
    if ((this.sfm != null) && (this.sfm.isShowing())) {
      this.sfm.dismiss();
    }
    GMTrace.o(20259360735232L, 150944);
  }
  
  private void pZ(String paramString)
  {
    GMTrace.i(20260300259328L, 150951);
    int i = (int)(System.currentTimeMillis() / 1000L);
    if (i - this.lZn > 1)
    {
      this.lZn = i;
      dismissDialog();
      if (this.sfc != null)
      {
        this.sfc.setText(paramString);
        this.sfc.setTextColor(getResources().getColor(a.b.aPW));
        this.sfc.setVisibility(4);
        if (this.sfe == null) {
          this.sfe = AnimationUtils.loadAnimation(this.vov.voR, a.a.sdw);
        }
        this.sfc.startAnimation(this.sfe);
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20256273727488L, 150921);
            FingerprintWalletLockUI.h(FingerprintWalletLockUI.this).setVisibility(0);
            GMTrace.o(20256273727488L, 150921);
          }
        }, this.sfe.getDuration());
      }
      GMTrace.o(20260300259328L, 150951);
      return;
    }
    GMTrace.o(20260300259328L, 150951);
  }
  
  private void release()
  {
    GMTrace.i(20260434477056L, 150952);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo fingerprint lock ui release isCancelled: %b", new Object[] { Boolean.valueOf(this.oFe) });
    if (this.oFe)
    {
      GMTrace.o(20260434477056L, 150952);
      return;
    }
    this.oFe = true;
    if (this.sfi != null)
    {
      com.tencent.mm.plugin.walletlock.fingerprint.a.h localh = this.sfi;
      w.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo release fingerprint auth");
      if (localh.lYV != null) {
        localh.lYV.mO(true);
      }
    }
    if (this.sfh != null) {
      this.sfh.release();
    }
    f.cmE().cmF();
    GMTrace.o(20260434477056L, 150952);
  }
  
  private void t(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(20260568694784L, 150953);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo finish with result, resultCode: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(-1), Integer.valueOf(paramInt2), paramString });
    release();
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    localIntent.putExtra("key_err_msg", paramString);
    setResult(-1, localIntent);
    finish();
    GMTrace.o(20260568694784L, 150953);
  }
  
  private void vT(String paramString)
  {
    GMTrace.i(20260166041600L, 150950);
    String str = paramString;
    if (bg.mZ(paramString)) {
      str = getString(a.g.sez);
    }
    dismissDialog();
    this.sfm = com.tencent.mm.ui.base.h.a(this, str, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20255736856576L, 150917);
        FingerprintWalletLockUI.this.finish();
        GMTrace.o(20255736856576L, 150917);
      }
    });
    this.sfm.setCanceledOnTouchOutside(false);
    GMTrace.o(20260166041600L, 150950);
  }
  
  private void wL(int paramInt)
  {
    GMTrace.i(20259897606144L, 150948);
    Intent localIntent = new Intent();
    if (paramInt == 1) {
      localIntent.putExtra("action", "action.touchlock_verify_by_paypwd");
    }
    for (;;)
    {
      localIntent.putExtra("key_wallet_lock_type", 2);
      com.tencent.mm.bi.d.b(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt);
      GMTrace.o(20259897606144L, 150948);
      return;
      if (paramInt == 2)
      {
        localIntent.putExtra("action", "action.touchlock_need_verify_paypwd");
        localIntent.putExtra("key_wallet_lock_input_new_fp_tips", getString(a.g.seD));
      }
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(20258823864320L, 150940);
    super.MH();
    this.sfc = ((TextView)findViewById(a.d.sdG));
    this.sfd = ((TextView)findViewById(a.d.sdJ));
    this.jPf = ((TextView)findViewById(a.d.sdF));
    this.sfd.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20255199985664L, 150913);
        FingerprintWalletLockUI.e(FingerprintWalletLockUI.this);
        GMTrace.o(20255199985664L, 150913);
      }
    });
    this.jPf.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20257347469312L, 150929);
        FingerprintWalletLockUI.byI();
        FingerprintWalletLockUI.a(FingerprintWalletLockUI.this, "user cancel setting fingerprint lock");
        GMTrace.o(20257347469312L, 150929);
      }
    });
    GMTrace.o(20258823864320L, 150940);
  }
  
  public void finish()
  {
    GMTrace.i(20260702912512L, 150954);
    super.finish();
    release();
    GMTrace.o(20260702912512L, 150954);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20259092299776L, 150942);
    int i = a.e.sdL;
    GMTrace.o(20259092299776L, 150942);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20260837130240L, 150955);
    w.v("MicroMsg.FingerprintWalletLockUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramIntent == null)
    {
      w.e("MicroMsg.FingerprintWalletLockUI", "alvinluo data is null");
      GMTrace.o(20260837130240L, 150955);
      return;
    }
    paramInt2 = paramIntent.getIntExtra("key_err_code", -1);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onActivityResult errCode: %d", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      if (paramInt2 == 0)
      {
        byH();
        w.i("MicroMsg.WalletLockReportManager", "alvinluo idkey report fingerprintlock verify by passwd success");
        com.tencent.mm.plugin.report.service.g.paX.a(713L, 2L, 1L, false);
        GMTrace.o(20260837130240L, 150955);
        return;
      }
      if (paramInt2 == -1)
      {
        this.nTn = false;
        vT(getString(a.g.seL));
        GMTrace.o(20260837130240L, 150955);
      }
    }
    else if (paramInt1 == 2)
    {
      if (paramInt2 == 0)
      {
        com.tencent.mm.plugin.walletlock.fingerprint.a.a.JW(this.sfk);
        com.tencent.mm.plugin.walletlock.fingerprint.a.a.ee(SystemClock.elapsedRealtime());
        byH();
        GMTrace.o(20260837130240L, 150955);
        return;
      }
      if (paramInt2 == -1)
      {
        this.nTn = false;
        vT(getString(a.g.seL));
        GMTrace.o(20260837130240L, 150955);
      }
    }
    else
    {
      if (paramInt1 == 3)
      {
        if (paramInt2 == 0)
        {
          byH();
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        finish();
        com.tencent.mm.plugin.walletlock.b.i.sgS.bzl();
        GMTrace.o(20260837130240L, 150955);
        return;
      }
      if (paramInt1 == 4)
      {
        if (paramInt2 == 0)
        {
          byH();
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        if (paramInt2 == -1)
        {
          this.nTn = false;
          vT(getString(a.g.seC));
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        finish();
        com.tencent.mm.plugin.walletlock.b.i.sgS.bzl();
        GMTrace.o(20260837130240L, 150955);
        return;
      }
      if (paramInt1 == 5)
      {
        if (paramInt2 == 0)
        {
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).wK(0);
          paramIntent = com.tencent.mm.plugin.walletlock.b.g.sgO;
          com.tencent.mm.plugin.walletlock.b.g.byC();
          Toast.makeText(this, getString(a.g.seq), 0).show();
          byH();
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        if (paramInt2 == -1)
        {
          this.nTn = false;
          vT(getString(a.g.ser));
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        if (paramInt2 == 4)
        {
          finish();
          com.tencent.mm.plugin.walletlock.b.i.sgS.bzl();
        }
      }
    }
    GMTrace.o(20260837130240L, 150955);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(20259494952960L, 150945);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onBackPressed");
    finish();
    com.tencent.mm.plugin.walletlock.b.i.sgS.bzl();
    GMTrace.o(20259494952960L, 150945);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20258421211136L, 150937);
    super.onCreate(paramBundle);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onCreate %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    if (cO().cP() != null) {
      cO().cP().hide();
    }
    MH();
    paramBundle = getIntent();
    this.uH = paramBundle.getStringExtra("action");
    this.sfg = this.uH;
    this.sff = paramBundle.getStringExtra("next_action");
    this.hyx = paramBundle.getStringExtra("token");
    this.lZf = paramBundle.getStringExtra("key_pay_passwd");
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo mAction: %s, mNextAction: %s", new Object[] { this.uH, this.sff });
    if (this.uH.equals("action.verify_pattern"))
    {
      this.sfn = 2;
      GMTrace.o(20258421211136L, 150937);
      return;
    }
    if (this.uH.equals("action.switch_on_pattern")) {
      this.sfn = 1;
    }
    GMTrace.o(20258421211136L, 150937);
  }
  
  protected void onPause()
  {
    GMTrace.i(20258689646592L, 150939);
    super.onPause();
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo FingerprintWalletLockUI onPause");
    dismissDialog();
    release();
    this.nTn = true;
    GMTrace.o(20258689646592L, 150939);
  }
  
  protected void onResume()
  {
    GMTrace.i(20258555428864L, 150938);
    super.onResume();
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo needResume: %b", new Object[] { Boolean.valueOf(this.nTn) });
    if (!this.nTn)
    {
      GMTrace.o(20258555428864L, 150938);
      return;
    }
    this.sfh = new c();
    this.sfi = new com.tencent.mm.plugin.walletlock.fingerprint.a.h();
    this.oFe = false;
    f.cmE().cmF();
    this.sfl = com.tencent.mm.ui.base.h.a(this, getString(a.g.dxB), false, null);
    byE();
    Object localObject;
    if (this.uH.equals("action.switch_on_pattern"))
    {
      this.seW = false;
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo start prepare, time: %d, isOffline: %b", new Object[] { Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(this.seW) });
      localObject = com.tencent.mm.plugin.walletlock.b.g.sgO;
      boolean bool = com.tencent.mm.plugin.walletlock.b.g.bzg();
      localObject = com.tencent.mm.plugin.walletlock.b.g.sgO;
      if ((!com.tencent.mm.plugin.walletlock.b.g.byA()) || (bool)) {
        break label565;
      }
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user opend fingerprint lock but device not support soter, isSupportFingerprintLock: %b", new Object[] { Boolean.valueOf(bool) });
      if (!com.tencent.mm.plugin.walletlock.gesture.a.e.byL()) {
        break label463;
      }
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user opened gesture, then switch to gesture");
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).wK(1);
      localObject = com.tencent.mm.plugin.walletlock.b.g.sgO;
      com.tencent.mm.plugin.walletlock.b.g.jf(true);
      finish();
      localObject = new Intent(this, GestureGuardLogicUI.class);
      ((Intent)localObject).addFlags(131072);
      ((Intent)localObject).putExtra("action", "action.verify_pattern");
      ((Intent)localObject).putExtra("next_action", "next_action.goto_protected_page");
      ((Intent)localObject).putExtra("page_intent", getIntent().getParcelableExtra("page_intent"));
      ((Intent)localObject).setPackage(ab.getPackageName());
      bool = com.tencent.mm.kernel.h.xz().xi().c(w.a.vdw, false);
      if (!bool)
      {
        ((Intent)localObject).putExtra("verify_title", getString(a.g.seK));
        com.tencent.mm.kernel.h.xz().xi().a(w.a.vdw, Boolean.valueOf(true));
        com.tencent.mm.kernel.h.xz().xi().kz(true);
      }
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo start gesture protect ui, isShowed: %b", new Object[] { Boolean.valueOf(bool) });
      startActivity((Intent)localObject);
      com.tencent.mm.plugin.report.service.g.paX.i(12097, new Object[] { Integer.valueOf(8), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
    }
    for (;;)
    {
      w.i("MicroMsg.FingerprintWalletLockUI", "onResume end: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      GMTrace.o(20258555428864L, 150938);
      return;
      this.seW = true;
      break;
      label463:
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo show not support fingerprint dialog");
      bva();
      this.sfm = new i.a(this).Bh(a.g.seG).Bj(a.g.seJ).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20263924137984L, 150978);
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user click set gesture");
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).b(FingerprintWalletLockUI.this, 1, 4);
          GMTrace.o(20263924137984L, 150978);
        }
      }).d(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(20263387267072L, 150974);
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo cancel not support fingerprint dialog");
          FingerprintWalletLockUI.this.finish();
          FingerprintWalletLockUI.byI();
          GMTrace.o(20263387267072L, 150974);
        }
      }).ZT();
      this.sfm.setCanceledOnTouchOutside(false);
      this.sfm.b(getString(a.g.sep), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20257884340224L, 150933);
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user click close wallet lock");
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).i(FingerprintWalletLockUI.this, 5);
          GMTrace.o(20257884340224L, 150933);
        }
      });
      this.sfm.show();
      continue;
      label565:
      if (!com.tencent.d.a.a.hD(this))
      {
        byF();
      }
      else
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("key_pay_passwd", this.lZf);
        ((Bundle)localObject).putBoolean("key_fp_lock_offline_mode", this.seW);
        this.sfh.a(new d.a()
        {
          public final void R(int paramAnonymousInt, String paramAnonymousString)
          {
            GMTrace.i(20256005292032L, 150919);
            w.i("MicroMsg.FingerprintWalletLockUI", "prepare onFinish errCode: %d, errMsg: %s, time: %d", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString, Long.valueOf(System.currentTimeMillis()) });
            if (FingerprintWalletLockUI.c(FingerprintWalletLockUI.this))
            {
              w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo has cancelled and return");
              GMTrace.o(20256005292032L, 150919);
              return;
            }
            if (paramAnonymousInt == 0)
            {
              FingerprintWalletLockUI.f(FingerprintWalletLockUI.this);
              GMTrace.o(20256005292032L, 150919);
              return;
            }
            FingerprintWalletLockUI.b(FingerprintWalletLockUI.this, FingerprintWalletLockUI.this.getString(a.g.sew));
            GMTrace.o(20256005292032L, 150919);
          }
        }, (Bundle)localObject);
      }
    }
  }
  
  public final class a
    implements com.tencent.mm.plugin.walletlock.b.b
  {
    private WeakReference<FingerprintWalletLockUI> lZB;
    
    public a(FingerprintWalletLockUI paramFingerprintWalletLockUI)
    {
      GMTrace.i(20256676380672L, 150924);
      this.lZB = null;
      this.lZB = new WeakReference(paramFingerprintWalletLockUI);
      GMTrace.o(20256676380672L, 150924);
    }
    
    private FingerprintWalletLockUI byJ()
    {
      GMTrace.i(20256810598400L, 150925);
      if (this.lZB != null)
      {
        FingerprintWalletLockUI localFingerprintWalletLockUI = (FingerprintWalletLockUI)this.lZB.get();
        GMTrace.o(20256810598400L, 150925);
        return localFingerprintWalletLockUI;
      }
      GMTrace.o(20256810598400L, 150925);
      return null;
    }
    
    public final void Q(int paramInt, String paramString)
    {
      GMTrace.i(20257079033856L, 150927);
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onResult result: %d, errMsg: %s, isCancelled: %b", new Object[] { Integer.valueOf(paramInt), paramString, Boolean.valueOf(FingerprintWalletLockUI.c(FingerprintWalletLockUI.this)) });
      if (FingerprintWalletLockUI.c(FingerprintWalletLockUI.this))
      {
        GMTrace.o(20257079033856L, 150927);
        return;
      }
      switch (paramInt)
      {
      }
      for (;;)
      {
        GMTrace.o(20257079033856L, 150927);
        return;
        w.i("MicroMsg.FingerprintWalletLockUI", "identify success");
        if (byJ() != null)
        {
          FingerprintWalletLockUI.d(byJ());
          GMTrace.o(20257079033856L, 150927);
          return;
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user cancel");
          GMTrace.o(20257079033856L, 150927);
          return;
          w.i("MicroMsg.FingerprintWalletLockUI", "identify ERR_NO_MATCH");
          if (byJ() != null)
          {
            FingerprintWalletLockUI.a(byJ(), paramInt, FingerprintWalletLockUI.this.getString(a.g.sey));
            GMTrace.o(20257079033856L, 150927);
            return;
            w.i("MicroMsg.FingerprintWalletLockUI", "identify TIMEOUT");
            if (byJ() != null)
            {
              FingerprintWalletLockUI.a(byJ(), paramInt, FingerprintWalletLockUI.this.getString(a.g.sey));
              GMTrace.o(20257079033856L, 150927);
              return;
              if (byJ() != null)
              {
                FingerprintWalletLockUI.b(byJ(), paramInt, FingerprintWalletLockUI.this.getString(a.g.sew));
                GMTrace.o(20257079033856L, 150927);
                return;
                if (byJ() != null)
                {
                  FingerprintWalletLockUI.b(byJ(), paramInt, FingerprintWalletLockUI.this.getString(a.g.seF));
                  GMTrace.o(20257079033856L, 150927);
                  return;
                  w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo on error: %d", new Object[] { Integer.valueOf(paramInt) });
                  if (byJ() != null) {
                    FingerprintWalletLockUI.b(byJ(), paramInt, FingerprintWalletLockUI.this.getString(a.g.sex));
                  }
                }
              }
            }
          }
        }
      }
    }
    
    public final void byK()
    {
      GMTrace.i(20256944816128L, 150926);
      FingerprintWalletLockUI.a(FingerprintWalletLockUI.this);
      FingerprintWalletLockUI.b(FingerprintWalletLockUI.this);
      GMTrace.o(20256944816128L, 150926);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/fingerprint/ui/FingerprintWalletLockUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */