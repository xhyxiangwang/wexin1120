package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.d.c;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;

@a(3)
public abstract class WalletPreferenceUI
  extends MMPreference
  implements c
{
  public b xhv;
  public f xhw;
  public d xhx;
  
  public WalletPreferenceUI()
  {
    GMTrace.i(1480153104384L, 11028);
    this.xhw = null;
    this.xhx = null;
    this.xhv = null;
    GMTrace.o(1480153104384L, 11028);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, k paramk, boolean paramBoolean)
  {
    GMTrace.i(1480555757568L, 11031);
    if ((!f(paramInt1, paramInt2, paramString, paramk)) && (paramInt2 != 0))
    {
      paramk = paramString;
      if (bg.mZ(paramString)) {
        paramk = getString(R.l.eUe);
      }
      h.a(this, paramk, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1515855020032L, 11294);
          WalletPreferenceUI.this.finish();
          GMTrace.o(1515855020032L, 11294);
        }
      });
    }
    GMTrace.o(1480555757568L, 11031);
  }
  
  public final f cjr()
  {
    GMTrace.i(1480421539840L, 11030);
    if (this.xhw == null) {
      this.xhw = new f(this, this);
    }
    f localf = this.xhw;
    GMTrace.o(1480421539840L, 11030);
    return localf;
  }
  
  public abstract boolean f(int paramInt1, int paramInt2, String paramString, k paramk);
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1480287322112L, 11029);
    super.onCreate(paramBundle);
    this.xhw = new f(this, this);
    this.xhw.hz(385);
    this.xhw.hz(1518);
    if (getLayoutId() > 0) {
      e.cjp();
    }
    GMTrace.o(1480287322112L, 11029);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1480689975296L, 11032);
    this.xhw.hA(385);
    this.xhw.hA(1518);
    this.xhw = null;
    super.onDestroy();
    GMTrace.o(1480689975296L, 11032);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/WalletPreferenceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */