package com.tencent.mm.wallet_core.ui;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.c.g;
import com.tencent.mm.wallet_core.f.a.l;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.x.ap;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;

public abstract class WalletBaseUI
  extends MMActivity
  implements com.tencent.mm.wallet_core.d.c
{
  public static final int ije;
  private static g xhy;
  public MyKeyboardWindow mKeyboard;
  public View nzg;
  public a nzs;
  public Bundle un;
  private MenuItem.OnMenuItemClickListener whJ;
  public boolean xhA;
  private com.tencent.mm.wallet_core.b xhv;
  public com.tencent.mm.wallet_core.d.f xhw;
  private com.tencent.mm.wallet_core.d.d xhx;
  private MenuItem.OnMenuItemClickListener xhz;
  
  static
  {
    GMTrace.i(1477200314368L, 11006);
    ije = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 270);
    xhy = null;
    GMTrace.o(1477200314368L, 11006);
  }
  
  public WalletBaseUI()
  {
    GMTrace.i(1471294734336L, 10962);
    this.xhv = null;
    this.xhw = null;
    this.xhx = null;
    this.un = new Bundle();
    this.xhA = false;
    GMTrace.o(1471294734336L, 10962);
  }
  
  public static void cjk()
  {
    GMTrace.i(1474784395264L, 10988);
    f.cjk();
    GMTrace.o(1474784395264L, 10988);
  }
  
  public final void Ee(int paramInt)
  {
    GMTrace.i(1475187048448L, 10991);
    this.mKeyboard.setXMode(paramInt);
    GMTrace.o(1475187048448L, 10991);
  }
  
  public void Qc()
  {
    GMTrace.i(1474918612992L, 10989);
    if ((this.nzg != null) && (this.nzg.isShown()))
    {
      this.nzg.setVisibility(8);
      if (this.nzs != null) {
        this.nzs.gS(false);
      }
    }
    GMTrace.o(1474918612992L, 10989);
  }
  
  public boolean Qf()
  {
    GMTrace.i(1473844871168L, 10981);
    GMTrace.o(1473844871168L, 10981);
    return true;
  }
  
  public final void a(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(1472100040704L, 10968);
    this.xhz = paramOnMenuItemClickListener;
    super.a(paramInt, paramString, paramOnMenuItemClickListener);
    GMTrace.o(1472100040704L, 10968);
  }
  
  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(1471965822976L, 10967);
    this.whJ = paramOnMenuItemClickListener;
    super.a(paramOnMenuItemClickListener);
    GMTrace.o(1471965822976L, 10967);
  }
  
  @TargetApi(14)
  public void a(final View paramView, final int paramInt, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    GMTrace.i(1474515959808L, 10986);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(R.h.cAi));
    this.nzg = findViewById(R.h.cAh);
    View localView = findViewById(R.h.cAj);
    final EditText localEditText = (EditText)paramView.findViewById(R.h.cIF);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.nzg == null))
    {
      GMTrace.o(1474515959808L, 10986);
      return;
    }
    e.setNoSystemInputOnEditText(localEditText);
    localEditText.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(final View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(1504043859968L, 11206);
        if ((paramAnonymousView.isFocused()) && (!paramBoolean1))
        {
          ((InputMethodManager)WalletBaseUI.this.vov.voR.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
          new ae().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(1478542491648L, 11016);
              if ((!WalletBaseUI.this.nzg.isShown()) && (paramAnonymousView.isShown()) && ((WalletBaseUI.5.this.ijg) || (WalletBaseUI.this.xhA)))
              {
                WalletBaseUI.this.xhA = true;
                WalletBaseUI.this.cjl();
              }
              Object localObject;
              if (((WalletBaseUI.5.this.iji instanceof WalletFormView)) && (Build.VERSION.SDK_INT >= 14))
              {
                localObject = (WalletFormView)WalletBaseUI.5.this.iji;
                if (((com.tencent.mm.x.m.zS()) || (((WalletFormView)localObject).xih == 100)) && ((!com.tencent.mm.x.m.zS()) || (((WalletFormView)localObject).xih == 0))) {
                  break label306;
                }
                localObject = new com.tencent.mm.ui.a.c();
                WalletBaseUI.this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
                WalletBaseUI.5.this.ijh.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
              }
              for (;;)
              {
                if (((WalletBaseUI.5.this.iji instanceof EditHintPasswdView)) && (Build.VERSION.SDK_INT >= 14))
                {
                  localObject = new com.tencent.mm.ui.a.c();
                  WalletBaseUI.this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
                  WalletBaseUI.5.this.ijh.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
                }
                WalletBaseUI.this.Ee(WalletBaseUI.5.this.ijj);
                WalletBaseUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
                ((InputMethodManager)WalletBaseUI.this.vov.voR.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
                GMTrace.o(1478542491648L, 11016);
                return;
                label306:
                WalletBaseUI.this.mKeyboard.resetSecureAccessibility();
                WalletBaseUI.5.this.ijh.setAccessibilityDelegate(null);
              }
            }
          }, 300L);
          GMTrace.o(1504043859968L, 11206);
          return;
        }
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1469549903872L, 10949);
            WalletBaseUI.this.Qc();
            ((InputMethodManager)WalletBaseUI.this.vov.voR.getSystemService("input_method")).showSoftInput(WalletBaseUI.5.this.ijh, 0);
            GMTrace.o(1469549903872L, 10949);
          }
        }, 200L);
        GMTrace.o(1504043859968L, 11206);
      }
    });
    localEditText.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1462436364288L, 10896);
        if ((!WalletBaseUI.this.nzg.isShown()) && (!paramBoolean1))
        {
          WalletBaseUI.this.cjl();
          WalletBaseUI.this.Ee(paramInt);
          GMTrace.o(1462436364288L, 10896);
          return;
        }
        if (paramBoolean1)
        {
          WalletBaseUI.this.Qc();
          ((InputMethodManager)WalletBaseUI.this.vov.voR.getSystemService("input_method")).showSoftInput(localEditText, 0);
        }
        GMTrace.o(1462436364288L, 10896);
      }
    });
    localView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1471160516608L, 10961);
        WalletBaseUI.this.Qc();
        GMTrace.o(1471160516608L, 10961);
      }
    });
    GMTrace.o(1474515959808L, 10986);
  }
  
  public final void a(final View paramView1, View paramView2, final int paramInt)
  {
    GMTrace.i(19126160457728L, 142501);
    if (paramView1 != null)
    {
      int[] arrayOfInt = new int[2];
      paramView2.getLocationInWindow(arrayOfInt);
      paramInt = arrayOfInt[1] + paramView2.getHeight();
      int i = com.tencent.mm.bq.a.eg(this);
      int j = i - paramInt - com.tencent.mm.bq.a.fromDPToPix(this, 30);
      w.d("MicroMsg.WalletBaseUI", "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(ije) });
      if ((j > 0) && (j < ije))
      {
        paramInt = ije - j;
        w.d("MicroMsg.WalletBaseUI", "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", new Object[] { Integer.valueOf(paramInt) });
        paramView1.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19126563110912L, 142504);
            paramView1.scrollBy(0, paramInt);
            GMTrace.o(19126563110912L, 142504);
          }
        });
      }
    }
    GMTrace.o(19126160457728L, 142501);
  }
  
  public void aKZ()
  {
    GMTrace.i(1471563169792L, 10964);
    w.d("MicroMsg.WalletBaseUI", "cancelforceScene");
    this.xhw.aKZ();
    finish();
    GMTrace.o(1471563169792L, 10964);
  }
  
  public boolean aMd()
  {
    GMTrace.i(1473442217984L, 10978);
    if (getLayoutId() <= 0)
    {
      GMTrace.o(1473442217984L, 10978);
      return true;
    }
    if (this.xhw.aLa())
    {
      GMTrace.o(1473442217984L, 10978);
      return true;
    }
    GMTrace.o(1473442217984L, 10978);
    return false;
  }
  
  public boolean aMg()
  {
    GMTrace.i(1473308000256L, 10977);
    GMTrace.o(1473308000256L, 10977);
    return false;
  }
  
  public boolean aMh()
  {
    GMTrace.i(1473173782528L, 10976);
    GMTrace.o(1473173782528L, 10976);
    return true;
  }
  
  public void b(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(1472636911616L, 10972);
    w.d("MicroMsg.WalletBaseUI", "errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    TenpaySecureEditText.setSalt(com.tencent.mm.wallet_core.c.m.ciJ());
    if ((paramk instanceof g))
    {
      g localg = (g)paramk;
      xhy = localg;
      if (this.un != null)
      {
        if (localg.rNw > 0) {
          this.un.putInt("key_is_gen_cert", localg.rNw);
        }
        if (localg.rNy > 0) {
          this.un.putInt("key_is_hint_crt", localg.rNy);
        }
        if (localg.rNA > 0) {
          this.un.putInt("key_is_ignore_cert", localg.rNA);
        }
        if (!bg.mZ(localg.rNx)) {
          this.un.putString("key_crt_token", localg.rNx);
        }
        if (!bg.mZ(localg.rNz)) {
          this.un.putString("key_crt_wording", localg.rNz);
        }
      }
    }
    i(paramInt1, paramInt2, paramString, paramk);
    f.a(this, paramInt1, paramInt2, paramString, paramk, paramBoolean);
    GMTrace.o(1472636911616L, 10972);
  }
  
  public final void b(k paramk, boolean paramBoolean)
  {
    GMTrace.i(1476126572544L, 10998);
    cjo();
    this.xhw.a(paramk, paramBoolean, 1);
    GMTrace.o(1476126572544L, 10998);
  }
  
  public final boolean bBV()
  {
    GMTrace.i(1474113306624L, 10983);
    if (this.whJ != null)
    {
      this.whJ.onMenuItemClick(null);
      GMTrace.o(1474113306624L, 10983);
      return true;
    }
    if (this.xhz != null)
    {
      this.xhz.onMenuItemClick(null);
      GMTrace.o(1474113306624L, 10983);
      return true;
    }
    boolean bool = super.bBV();
    GMTrace.o(1474113306624L, 10983);
    return bool;
  }
  
  public void buY()
  {
    GMTrace.i(1475723919360L, 10995);
    cjm().a(this, 0, this.un);
    GMTrace.o(1475723919360L, 10995);
  }
  
  public final String bvp()
  {
    GMTrace.i(1471428952064L, 10963);
    if (this.un == null)
    {
      GMTrace.o(1471428952064L, 10963);
      return "";
    }
    Object localObject = (PayInfo)this.un.getParcelable("key_pay_info");
    if (localObject != null)
    {
      localObject = ((PayInfo)localObject).fAF;
      GMTrace.o(1471428952064L, 10963);
      return (String)localObject;
    }
    GMTrace.o(1471428952064L, 10963);
    return "";
  }
  
  public boolean bvz()
  {
    GMTrace.i(1473576435712L, 10979);
    GMTrace.o(1473576435712L, 10979);
    return false;
  }
  
  public final int cji()
  {
    GMTrace.i(1471831605248L, 10966);
    int i = this.vov.iiK.getVisibility();
    GMTrace.o(1471831605248L, 10966);
    return i;
  }
  
  public final void cjj()
  {
    GMTrace.i(1473710653440L, 10980);
    PayInfo localPayInfo2 = (PayInfo)this.un.getParcelable("key_pay_info");
    PayInfo localPayInfo1 = localPayInfo2;
    if (localPayInfo2 == null) {
      localPayInfo1 = (PayInfo)getIntent().getParcelableExtra("key_pay_info");
    }
    if ((localPayInfo1 != null) && (!bg.mZ(localPayInfo1.mBX)))
    {
      this.xhw.a(new com.tencent.mm.wallet_core.c.d(localPayInfo1.mBX, localPayInfo1.fAF), true, 1);
      localPayInfo1.mBX = null;
    }
    GMTrace.o(1473710653440L, 10980);
  }
  
  public final void cjl()
  {
    GMTrace.i(1475052830720L, 10990);
    if ((this.nzg != null) && (!this.nzg.isShown()))
    {
      this.nzg.setVisibility(0);
      if (this.nzs != null) {
        this.nzs.gS(true);
      }
    }
    GMTrace.o(1475052830720L, 10990);
  }
  
  public final com.tencent.mm.wallet_core.b cjm()
  {
    GMTrace.i(1475321266176L, 10992);
    if (this.xhv == null) {
      this.xhv = com.tencent.mm.wallet_core.a.aa(this);
    }
    com.tencent.mm.wallet_core.b localb = this.xhv;
    GMTrace.o(1475321266176L, 10992);
    return localb;
  }
  
  public final com.tencent.mm.wallet_core.d.d cjn()
  {
    GMTrace.i(1475455483904L, 10993);
    if (this.xhx == null)
    {
      localObject = cjm();
      if (localObject != null) {
        this.xhx = ((com.tencent.mm.wallet_core.b)localObject).a(this, this.xhw);
      }
      if (this.xhx == null) {
        this.xhx = new com.tencent.mm.wallet_core.d.d(this, this.xhw)
        {
          public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
          {
            GMTrace.i(1468207726592L, 10939);
            GMTrace.o(1468207726592L, 10939);
            return false;
          }
          
          public final boolean j(Object... paramAnonymousVarArgs)
          {
            GMTrace.i(1468341944320L, 10940);
            GMTrace.o(1468341944320L, 10940);
            return false;
          }
        };
      }
    }
    Object localObject = this.xhx;
    GMTrace.o(1475455483904L, 10993);
    return (com.tencent.mm.wallet_core.d.d)localObject;
  }
  
  public void cjo()
  {
    GMTrace.i(1476529225728L, 11001);
    com.tencent.mm.wallet_core.b localb = cjm();
    if (localb != null) {
      this.xhw.un = localb.lRQ;
    }
    GMTrace.o(1476529225728L, 11001);
  }
  
  public abstract boolean d(int paramInt1, int paramInt2, String paramString, k paramk);
  
  public final void e(View paramView, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1474381742080L, 10985);
    a(paramView, paramInt, paramBoolean, true);
    GMTrace.o(1474381742080L, 10985);
  }
  
  public final void hA(int paramInt)
  {
    GMTrace.i(1475992354816L, 10997);
    this.xhw.hA(paramInt);
    GMTrace.o(1475992354816L, 10997);
  }
  
  public final void hz(int paramInt)
  {
    GMTrace.i(1475858137088L, 10996);
    this.xhw.hz(paramInt);
    GMTrace.o(1475858137088L, 10996);
  }
  
  public boolean i(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1472905347072L, 10974);
    GMTrace.o(1472905347072L, 10974);
    return true;
  }
  
  public final void l(k paramk)
  {
    GMTrace.i(1476260790272L, 10999);
    cjo();
    this.xhw.a(paramk, true, 1);
    GMTrace.o(1476260790272L, 10999);
  }
  
  public final boolean mE(boolean paramBoolean)
  {
    GMTrace.i(1474650177536L, 10987);
    if ((xhy != null) && ((xhy.aTK()) || (paramBoolean)))
    {
      this.xhw.a(xhy, true);
      GMTrace.o(1474650177536L, 10987);
      return true;
    }
    GMTrace.o(1474650177536L, 10987);
    return false;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19126026240000L, 142500);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    cjn().onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(19126026240000L, 142500);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1471697387520L, 10965);
    super.onCreate(paramBundle);
    if (!ap.AV())
    {
      w.e("MicroMsg.WalletBaseUI", "hy: account not ready. finish now");
      h.a(this, getString(R.l.eRO), "", false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1503506989056L, 11202);
          com.tencent.mm.wallet_core.a.c(WalletBaseUI.this, null, 55536);
          GMTrace.o(1503506989056L, 11202);
        }
      });
    }
    this.xhw = new com.tencent.mm.wallet_core.d.f(this, this);
    this.xhw.hz(385);
    this.xhw.hz(1518);
    w.d("MicroMsg.WalletBaseUI", "current process:" + getIntent().getIntExtra("process_id", 0));
    paramBundle = com.tencent.mm.wallet_core.a.aa(this);
    if (paramBundle != null) {
      this.xhw.gPI = paramBundle.azd();
    }
    w.d("MicroMsg.WalletBaseUI", "proc " + paramBundle);
    this.un = com.tencent.mm.wallet_core.a.Z(this);
    if (this.un == null) {
      this.un = new Bundle();
    }
    this.xhw.un = this.un;
    if ((aMh()) && (!com.tencent.mm.wallet_core.a.Y(this))) {
      w.e("MicroMsg.WalletBaseUI", "Activity extends WalletBaseUI but not in process!!!");
    }
    if ((getLayoutId() > 0) && (!bg.mZ(""))) {
      Uk("");
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1506057125888L, 11221);
        if (WalletBaseUI.this.bvz())
        {
          WalletBaseUI.this.aKl();
          WalletBaseUI.this.showDialog(1000);
        }
        for (;;)
        {
          GMTrace.o(1506057125888L, 11221);
          return true;
          WalletBaseUI.this.finish();
        }
      }
    });
    this.xhx = cjn();
    if ((this.xhx != null) && (this.xhx.p(new Object[0])))
    {
      sh(4);
      GMTrace.o(1471697387520L, 10965);
      return;
    }
    if (getLayoutId() <= 0)
    {
      sh(4);
      GMTrace.o(1471697387520L, 10965);
      return;
    }
    if (aMd())
    {
      sh(4);
      GMTrace.o(1471697387520L, 10965);
      return;
    }
    sh(0);
    GMTrace.o(1471697387520L, 10965);
  }
  
  public Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(1474247524352L, 10984);
    w.i("MicroMsg.WalletBaseUI", "onCreateDialog id = " + paramInt);
    switch (paramInt)
    {
    default: 
      localObject = super.onCreateDialog(paramInt);
      GMTrace.o(1474247524352L, 10984);
      return (Dialog)localObject;
    }
    Object localObject = com.tencent.mm.wallet_core.a.aa(this);
    if (localObject != null) {}
    for (int i = ((com.tencent.mm.wallet_core.b)localObject).b(this, 1);; i = -1)
    {
      if (i != -1)
      {
        localObject = h.a(this, true, getString(i), "", getString(R.l.dxC), getString(R.l.dwo), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1506325561344L, 11223);
            WalletBaseUI.this.cjj();
            paramAnonymousDialogInterface = com.tencent.mm.wallet_core.a.aa(WalletBaseUI.this);
            if (paramAnonymousDialogInterface != null)
            {
              if (!paramAnonymousDialogInterface.g(WalletBaseUI.this, WalletBaseUI.this.un))
              {
                paramAnonymousDialogInterface.b(WalletBaseUI.this, WalletBaseUI.this.un);
                GMTrace.o(1506325561344L, 11223);
              }
            }
            else {
              WalletBaseUI.this.finish();
            }
            GMTrace.o(1506325561344L, 11223);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1507533520896L, 11232);
            if (WalletBaseUI.a(WalletBaseUI.this) == null) {}
            for (paramAnonymousDialogInterface = null;; paramAnonymousDialogInterface = WalletBaseUI.b(WalletBaseUI.this).findFocus())
            {
              if ((paramAnonymousDialogInterface != null) && ((paramAnonymousDialogInterface instanceof EditText))) {
                WalletBaseUI.this.aKp();
              }
              GMTrace.o(1507533520896L, 11232);
              return;
            }
          }
        });
        GMTrace.o(1474247524352L, 10984);
        return (Dialog)localObject;
      }
      if (localObject != null) {
        ((com.tencent.mm.wallet_core.b)localObject).b(this, this.un);
      }
      for (;;)
      {
        localObject = super.onCreateDialog(paramInt);
        GMTrace.o(1474247524352L, 10984);
        return (Dialog)localObject;
        finish();
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(1472502693888L, 10971);
    super.onDestroy();
    this.xhw.hA(385);
    this.xhw.hA(1518);
    GMTrace.o(1472502693888L, 10971);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1473979088896L, 10982);
    if (paramInt == 4)
    {
      if ((this.nzg != null) && (this.nzg.isShown()))
      {
        Qc();
        GMTrace.o(1473979088896L, 10982);
        return true;
      }
      if (bvz())
      {
        aKl();
        showDialog(1000);
        GMTrace.o(1473979088896L, 10982);
        return true;
      }
      if ((this.whJ != null) && (Qf()))
      {
        this.whJ.onMenuItemClick(null);
        GMTrace.o(1473979088896L, 10982);
        return true;
      }
      if (this.xhz != null)
      {
        this.xhz.onMenuItemClick(null);
        GMTrace.o(1473979088896L, 10982);
        return true;
      }
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(1473979088896L, 10982);
    return bool;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(1476797661184L, 11003);
    super.onNewIntent(paramIntent);
    int i;
    if ((paramIntent.getBooleanExtra("key_process_is_end", false)) && (!paramIntent.getBooleanExtra("key_process_is_stay", true)))
    {
      setIntent(paramIntent);
      paramIntent = getIntent().getExtras();
      if ((paramIntent == null) || (!paramIntent.containsKey("key_process_result_code"))) {
        break label108;
      }
      i = paramIntent.getInt("key_process_result_code", 0);
      if (i != -1) {
        break label113;
      }
      w.i("MicroMsg.WalletBaseUI", "process end ok!");
      setResult(-1, getIntent());
    }
    for (;;)
    {
      finish();
      GMTrace.o(1476797661184L, 11003);
      return;
      label108:
      i = 0;
      break;
      label113:
      w.i("MicroMsg.WalletBaseUI", "process end with user cancel or err! resultCode : " + i);
      setResult(0, getIntent());
    }
  }
  
  public void onPause()
  {
    GMTrace.i(1472368476160L, 10970);
    super.onPause();
    GMTrace.o(1472368476160L, 10970);
  }
  
  public void onResume()
  {
    GMTrace.i(1472234258432L, 10969);
    super.onResume();
    if (com.tencent.mm.wallet_core.c.m.ciI()) {
      if (com.tencent.mm.x.m.zS()) {
        break label52;
      }
    }
    label52:
    for (Object localObject = new l();; localObject = new com.tencent.mm.wallet_core.e.a.b())
    {
      this.xhw.a((k)localObject, false);
      GMTrace.o(1472234258432L, 10969);
      return;
    }
  }
  
  public final void r(k paramk)
  {
    GMTrace.i(1476395008000L, 11000);
    cjo();
    this.xhw.a(paramk, true);
    GMTrace.o(1476395008000L, 11000);
  }
  
  public final CharSequence rQ(int paramInt)
  {
    GMTrace.i(1475589701632L, 10994);
    if (this.xhx == null)
    {
      GMTrace.o(1475589701632L, 10994);
      return null;
    }
    CharSequence localCharSequence = this.xhx.rQ(paramInt);
    GMTrace.o(1475589701632L, 10994);
    return localCharSequence;
  }
  
  public void sa(int paramInt)
  {
    GMTrace.i(1472771129344L, 10973);
    GMTrace.o(1472771129344L, 10973);
  }
  
  public void sh(int paramInt)
  {
    GMTrace.i(1476663443456L, 11002);
    super.sh(paramInt);
    GMTrace.o(1476663443456L, 11002);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/WalletBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */