package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet_core.b.i;
import com.tencent.mm.plugin.wallet_core.b.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.b;
import com.tencent.mm.wallet_core.b.a;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.d.d;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;

@com.tencent.mm.ui.base.a(3)
public class WalletCheckPwdUI
  extends WalletBaseUI
{
  private String lYL;
  public EditHintPasswdView rEk;
  private boolean rTT;
  private boolean rTU;
  private boolean rTV;
  private String rTW;
  
  public WalletCheckPwdUI()
  {
    GMTrace.i(6988717096960L, 52070);
    this.rTT = false;
    this.rTU = false;
    this.rTV = false;
    GMTrace.o(6988717096960L, 52070);
  }
  
  protected final void MH()
  {
    GMTrace.i(6989656621056L, 52077);
    TextView localTextView = (TextView)findViewById(R.h.bQj);
    CharSequence localCharSequence = rQ(0);
    if (!bg.L(localCharSequence))
    {
      localTextView.setText(localCharSequence);
      if ((localCharSequence instanceof SpannableString)) {
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
      }
    }
    for (;;)
    {
      this.rEk = ((EditHintPasswdView)findViewById(R.h.bQg));
      com.tencent.mm.wallet_core.ui.formview.a.a(this.rEk);
      this.rEk.xhY = new EditHintPasswdView.a()
      {
        public final void gQ(boolean paramAnonymousBoolean)
        {
          GMTrace.i(7021332004864L, 52313);
          if (paramAnonymousBoolean)
          {
            WalletCheckPwdUI.a(WalletCheckPwdUI.this, WalletCheckPwdUI.this.rEk.getText());
            b localb = com.tencent.mm.wallet_core.a.aa(WalletCheckPwdUI.this);
            String str = null;
            if (localb != null) {
              str = localb.azd();
            }
            if ((WalletCheckPwdUI.b(WalletCheckPwdUI.this)) && (!"UnbindProcess".equals(str)))
            {
              WalletCheckPwdUI.this.l(new com.tencent.mm.plugin.wallet_core.b.j(WalletCheckPwdUI.c(WalletCheckPwdUI.this), WalletCheckPwdUI.d(WalletCheckPwdUI.this)));
              GMTrace.o(7021332004864L, 52313);
              return;
            }
            if (!WalletCheckPwdUI.this.cjn().j(new Object[] { WalletCheckPwdUI.c(WalletCheckPwdUI.this), WalletCheckPwdUI.this.bvp() })) {
              WalletCheckPwdUI.this.l(new i(WalletCheckPwdUI.c(WalletCheckPwdUI.this), 1, WalletCheckPwdUI.this.bvp()));
            }
          }
          GMTrace.o(7021332004864L, 52313);
        }
      };
      e(this.rEk, 0, false);
      GMTrace.o(6989656621056L, 52077);
      return;
      localTextView.setText(R.l.eTS);
    }
  }
  
  public int Qb()
  {
    GMTrace.i(6990461927424L, 52083);
    GMTrace.o(6990461927424L, 52083);
    return 1;
  }
  
  protected final void aKZ()
  {
    GMTrace.i(6989119750144L, 52073);
    w.d("Micromsg.WalletCheckPwdUI", "check pwd ");
    this.xhw.aKZ();
    GMTrace.o(6989119750144L, 52073);
  }
  
  public final boolean aMd()
  {
    GMTrace.i(6990327709696L, 52082);
    boolean bool = this.rTT;
    GMTrace.o(6990327709696L, 52082);
    return bool;
  }
  
  public boolean bvz()
  {
    GMTrace.i(6990059274240L, 52080);
    if (this.un.getInt("key_pay_flag", 0) != 0)
    {
      GMTrace.o(6990059274240L, 52080);
      return true;
    }
    GMTrace.o(6990059274240L, 52080);
    return false;
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6989790838784L, 52078);
    w.d("Micromsg.WalletCheckPwdUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof i))
      {
        paramString = this.un;
        paramString.putString("key_pwd1", this.rEk.getText());
        com.tencent.mm.wallet_core.a.i(this, paramString);
        if (this.rEk != null) {
          this.rEk.aYY();
        }
        finish();
      }
      for (;;)
      {
        GMTrace.o(6989790838784L, 52078);
        return true;
        if ((paramk instanceof m))
        {
          h.bl(this, getString(R.l.eTW));
          paramString = com.tencent.mm.wallet_core.a.aa(this);
          if (paramString != null) {
            paramString.lRQ.putInt("key_process_result_code", -1);
          }
          com.tencent.mm.wallet_core.a.i(this, paramString.lRQ);
          if (this.rEk != null) {
            this.rEk.aYY();
          }
          finish();
        }
        else if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.a))
        {
          this.rTW = ((com.tencent.mm.plugin.wallet_core.b.a)paramk).aUD();
          setResult(-1);
          sh(0);
        }
        else if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.j))
        {
          paramString = (com.tencent.mm.plugin.wallet_core.b.j)paramk;
          if (paramString.bwf())
          {
            w.i("Micromsg.WalletCheckPwdUI", "need free sms");
            paramk = new Bundle();
            paramk.putString("key_pwd1", this.lYL);
            paramk.putString("key_jsapi_token", this.rTW);
            paramk.putString("key_relation_key", paramString.rKJ);
            paramk.putString("key_mobile", paramString.rKI);
            com.tencent.mm.wallet_core.a.a(this, j.class, paramk, new b.a()
            {
              public final Intent k(int paramAnonymousInt, Bundle paramAnonymousBundle)
              {
                GMTrace.i(7003078393856L, 52177);
                Intent localIntent = new Intent();
                localIntent.putExtra("token", paramAnonymousBundle.getString("key_jsapi_token"));
                localIntent.putExtra("key_process_result_code", paramAnonymousInt);
                localIntent.setClass(WalletCheckPwdUI.this.vov.voR, WalletCheckPwdUI.class);
                localIntent.addFlags(536870912);
                localIntent.putExtra("key_process_is_stay", false);
                GMTrace.o(7003078393856L, 52177);
                return localIntent;
              }
            });
          }
          else
          {
            paramString = new Intent();
            paramString.putExtra("token", ((com.tencent.mm.plugin.wallet_core.b.j)paramk).rKG);
            setResult(-1, paramString);
            finish();
          }
        }
      }
    }
    if (this.rEk != null) {
      this.rEk.aYY();
    }
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.a))
    {
      w.i("Micromsg.WalletCheckPwdUI", "check jsapi fail");
      paramString = com.tencent.mm.wallet_core.a.aa(this);
      if ((paramString != null) && (paramString.azd().equals("UnbindProcess")))
      {
        setResult(1);
        paramString.lRQ.putInt("key_process_result_code", 1);
        com.tencent.mm.wallet_core.a.i(this, paramString.lRQ);
      }
      for (;;)
      {
        GMTrace.o(6989790838784L, 52078);
        return true;
        setResult(0);
        finish();
      }
    }
    GMTrace.o(6989790838784L, 52078);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6988851314688L, 52071);
    int i = R.i.dio;
    GMTrace.o(6988851314688L, 52071);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = -1;
    GMTrace.i(6988985532416L, 52072);
    super.onCreate(paramBundle);
    paramBundle = rQ(1);
    label70:
    Object localObject;
    if (!bg.L(paramBundle))
    {
      rV(paramBundle.toString());
      paramBundle = getIntent();
      if ((paramBundle == null) || (!getIntent().hasExtra("scene"))) {
        break label175;
      }
      i = paramBundle.getIntExtra("scene", -1);
      if (i != 1) {
        break label422;
      }
      this.rTU = true;
      w.d("Micromsg.WalletCheckPwdUI", "check pwd jsapi");
      paramBundle = null;
      if (!this.rTV) {
        break label229;
      }
      localObject = com.tencent.mm.wallet_core.a.aa(this);
      if (localObject != null) {
        paramBundle = ((b)localObject).lRQ;
      }
      localObject = paramBundle;
      if (paramBundle != null) {
        break label265;
      }
      w.d("Micromsg.WalletCheckPwdUI", "func[doCheckPayNetscene] process.getContextData null");
      setResult(1);
      finish();
      label138:
      MH();
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7020795133952L, 52309);
          paramAnonymousMenuItem = WalletCheckPwdUI.this.cjm();
          w.i("Micromsg.WalletCheckPwdUI", "onbackbtn click");
          if (paramAnonymousMenuItem != null)
          {
            if (!(paramAnonymousMenuItem instanceof com.tencent.mm.plugin.wallet_core.id_verify.a)) {
              break label60;
            }
            paramAnonymousMenuItem.c(WalletCheckPwdUI.this, 0);
          }
          for (;;)
          {
            WalletCheckPwdUI.this.finish();
            GMTrace.o(7020795133952L, 52309);
            return false;
            label60:
            if (WalletCheckPwdUI.a(WalletCheckPwdUI.this))
            {
              paramAnonymousMenuItem.lRQ.putInt("key_process_result_code", 0);
              paramAnonymousMenuItem.b(WalletCheckPwdUI.this, paramAnonymousMenuItem.lRQ);
            }
            else if (paramAnonymousMenuItem.azd().equals("OpenECardProcess"))
            {
              WalletCheckPwdUI.this.un.putInt("key_process_result_code", 0);
              WalletCheckPwdUI.this.setResult(-1);
              paramAnonymousMenuItem.ab(WalletCheckPwdUI.this.vov.voR);
            }
          }
        }
      });
      GMTrace.o(6988985532416L, 52072);
      return;
      rV(s.fK(this));
      break;
      label175:
      paramBundle = com.tencent.mm.wallet_core.a.aa(this);
      if (paramBundle == null) {
        break label70;
      }
      i = paramBundle.lRQ.getInt("scene", -1);
      if ((i == 1) && ("UnbindProcess".equals(paramBundle.azd()))) {}
      for (boolean bool = true;; bool = false)
      {
        this.rTV = bool;
        break;
      }
      label229:
      if (getIntent() == null)
      {
        w.d("Micromsg.WalletCheckPwdUI", "func[doCheckPayNetscene] intent null");
        setResult(0);
        finish();
        break label138;
      }
      localObject = getIntent().getExtras();
      label265:
      paramBundle = ((Bundle)localObject).getString("appId");
      String str1 = ((Bundle)localObject).getString("timeStamp");
      String str2 = ((Bundle)localObject).getString("nonceStr");
      String str3 = ((Bundle)localObject).getString("packageExt");
      String str4 = ((Bundle)localObject).getString("signtype");
      String str5 = ((Bundle)localObject).getString("paySignature");
      localObject = ((Bundle)localObject).getString("url");
      if (this.rTV) {
        w.i("Micromsg.WalletCheckPwdUI", "appId is null? " + bg.mZ(paramBundle));
      }
      for (paramBundle = new com.tencent.mm.plugin.wallet_core.b.a(paramBundle, str1, str2, str3, str4, str5, (String)localObject, 10);; paramBundle = new com.tencent.mm.plugin.wallet_core.b.a(paramBundle, str1, str2, str3, str4, str5, (String)localObject, 5))
      {
        r(paramBundle);
        break;
      }
      label422:
      sh(0);
      if (!this.un.getBoolean("key_is_expired_bankcard", false)) {
        MH();
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6989522403328L, 52076);
    super.onDestroy();
    GMTrace.o(6989522403328L, 52076);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6989925056512L, 52079);
    if ((this.nzg != null) && (this.nzg.isShown()))
    {
      this.nzg.setVisibility(8);
      GMTrace.o(6989925056512L, 52079);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6989925056512L, 52079);
    return bool;
  }
  
  public void onPause()
  {
    GMTrace.i(6989388185600L, 52075);
    super.onPause();
    hA(580);
    GMTrace.o(6989388185600L, 52075);
  }
  
  public void onResume()
  {
    GMTrace.i(6989253967872L, 52074);
    if (this.rEk != null) {
      this.rEk.aYY();
    }
    hz(580);
    super.onResume();
    GMTrace.o(6989253967872L, 52074);
  }
  
  public final void sa(int paramInt)
  {
    GMTrace.i(6990193491968L, 52081);
    if (this.rTT)
    {
      finish();
      GMTrace.o(6990193491968L, 52081);
      return;
    }
    if (this.rEk != null) {
      this.rEk.aYY();
    }
    GMTrace.o(6990193491968L, 52081);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */