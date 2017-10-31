package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import org.json.JSONException;
import org.json.JSONObject;

public class SwitchRealnameVerifyModeUI
  extends WalletBaseUI
  implements View.OnClickListener
{
  private int hys;
  private String rLA;
  private String rLB;
  private boolean rLC;
  private boolean rLD;
  private View rLp;
  private View rLq;
  private View rLr;
  private TextView rLs;
  private TextView rLt;
  private TextView rLu;
  private TextView rLv;
  private TextView rLw;
  private TextView rLx;
  private TextView rLy;
  private String rLz;
  
  public SwitchRealnameVerifyModeUI()
  {
    GMTrace.i(6861076037632L, 51119);
    this.hys = 0;
    this.rLD = false;
    GMTrace.o(6861076037632L, 51119);
  }
  
  private static JSONObject bwj()
  {
    GMTrace.i(6861881344000L, 51125);
    ap.AS();
    Object localObject = c.xi().get(w.a.uYs, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      if (!bg.mZ((String)localObject)) {
        try
        {
          localObject = new JSONObject((String)localObject);
          long l1 = System.currentTimeMillis() / 1000L;
          long l2 = ((JSONObject)localObject).getLong("timestamp");
          long l3 = ((JSONObject)localObject).getLong("cache_time");
          w.i("MicroMsg.SwitchRealnameVerifyModeUI", " dddd time=" + l1 + ";timestamp=" + l2 + ";cachetime=" + l3);
          if (l1 - l2 > l3)
          {
            w.e("MicroMsg.SwitchRealnameVerifyModeUI", "wording data from cache is out of date");
            GMTrace.o(6861881344000L, 51125);
            return null;
          }
          GMTrace.o(6861881344000L, 51125);
          return (JSONObject)localObject;
        }
        catch (JSONException localJSONException)
        {
          w.printErrStackTrace("MicroMsg.SwitchRealnameVerifyModeUI", localJSONException, "", new Object[0]);
          w.e("MicroMsg.SwitchRealnameVerifyModeUI", "parse wording data form cache error");
          GMTrace.o(6861881344000L, 51125);
          return null;
        }
      }
    }
    w.i("MicroMsg.SwitchRealnameVerifyModeUI", "cache is null");
    GMTrace.o(6861881344000L, 51125);
    return null;
  }
  
  private boolean iQ(boolean paramBoolean)
  {
    GMTrace.i(6862015561728L, 51126);
    JSONObject localJSONObject = bwj();
    if ((paramBoolean) && (localJSONObject == null)) {
      localJSONObject = new JSONObject();
    }
    for (;;)
    {
      if (localJSONObject != null)
      {
        String str = bg.ap(localJSONObject.optString("cache_header_titles", getString(R.l.eLU)), getString(R.l.eLU));
        if (this.rLD)
        {
          ((TextView)findViewById(R.h.czB)).setText(R.l.eYk);
          if (!localJSONObject.optBoolean("isShowBindCardVerify", false)) {
            break label429;
          }
          this.rLx.setText(localJSONObject.optString("bindCardVerifyTitle"));
          this.rLy.setText(localJSONObject.optString("bindCardVerifySubtitle"));
          this.rLr.setVisibility(0);
          label123:
          if (!localJSONObject.optBoolean("isShowBindCard", false)) {
            break label441;
          }
          this.rLs.setText(localJSONObject.optString("bindcardTitle", getString(R.l.eLV)));
          this.rLt.setText(localJSONObject.optString("bindcardSubTitle", getString(R.l.eLW)));
          this.rLp.setVisibility(0);
          label182:
          if (!localJSONObject.optBoolean("isShowBindId", false)) {
            break label453;
          }
          this.rLu.setText(localJSONObject.optString("bindIdTitle", getString(R.l.eLX)));
          this.rLv.setText(localJSONObject.optString("bindIdSubTitle", getString(R.l.eLY)));
          this.rLq.setVisibility(0);
          label243:
          this.rLA = localJSONObject.optString("bindCardVerifyAlertViewRightBtnTxt", "");
          this.rLB = localJSONObject.optString("bindCardVerifyAlertViewContent", "");
          this.rLC = localJSONObject.optBoolean("isShowBindCardVerifyAlertView", false);
          str = localJSONObject.optString("extral_wording", "");
          if (bg.mZ(str)) {
            break label465;
          }
          this.rLw.setText(str);
          this.rLw.setVisibility(0);
        }
        for (;;)
        {
          this.rLA = localJSONObject.optString("bindCardVerifyAlertViewRightBtnTxt", "");
          this.rLB = localJSONObject.optString("bindCardVerifyAlertViewContent");
          this.rLC = localJSONObject.optBoolean("isShowBindCardVerifyAlertView", false);
          paramBoolean = localJSONObject.optBoolean("question_answer_switch", false);
          this.rLz = localJSONObject.optString("question_answer_url", "");
          if ((paramBoolean) && (!bg.mZ(this.rLz))) {
            a(0, R.g.bfr, new MenuItem.OnMenuItemClickListener()
            {
              public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
              {
                GMTrace.i(6837453717504L, 50943);
                e.a(18, bg.Po(), SwitchRealnameVerifyModeUI.a(SwitchRealnameVerifyModeUI.this));
                e.m(SwitchRealnameVerifyModeUI.this.vov.voR, SwitchRealnameVerifyModeUI.b(SwitchRealnameVerifyModeUI.this), false);
                GMTrace.o(6837453717504L, 50943);
                return true;
              }
            });
          }
          GMTrace.o(6862015561728L, 51126);
          return true;
          ((TextView)findViewById(R.h.czB)).setText(str);
          break;
          label429:
          this.rLr.setVisibility(8);
          break label123;
          label441:
          this.rLp.setVisibility(8);
          break label182;
          label453:
          this.rLq.setVisibility(8);
          break label243;
          label465:
          this.rLw.setVisibility(8);
        }
      }
      GMTrace.o(6862015561728L, 51126);
      return paramBoolean;
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(6861344473088L, 51121);
    oC(R.l.eYi);
    this.rLp = findViewById(R.h.czC);
    this.rLq = findViewById(R.h.czD);
    this.rLr = findViewById(R.h.czE);
    this.rLq.setOnClickListener(this);
    this.rLp.setOnClickListener(this);
    this.rLr.setOnClickListener(this);
    this.rLs = ((TextView)findViewById(R.h.blB));
    this.rLt = ((TextView)findViewById(R.h.blA));
    this.rLu = ((TextView)findViewById(R.h.blF));
    this.rLv = ((TextView)findViewById(R.h.blE));
    this.rLw = ((TextView)findViewById(R.h.bFS));
    this.rLx = ((TextView)findViewById(R.h.cDW));
    this.rLy = ((TextView)findViewById(R.h.cDV));
    if (this.rLD) {
      ((TextView)findViewById(R.h.czB)).setText(R.l.eYk);
    }
    if (!iQ(false))
    {
      com.tencent.mm.plugin.wallet_core.id_verify.model.b localb = new com.tencent.mm.plugin.wallet_core.id_verify.model.b();
      hz(1666);
      l(localb);
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6846983176192L, 51014);
        paramAnonymousMenuItem = SwitchRealnameVerifyModeUI.this.cjm();
        if (paramAnonymousMenuItem != null)
        {
          e.a(14, bg.Po(), SwitchRealnameVerifyModeUI.a(SwitchRealnameVerifyModeUI.this));
          paramAnonymousMenuItem.c(SwitchRealnameVerifyModeUI.this, 0);
          SwitchRealnameVerifyModeUI.this.finish();
          GMTrace.o(6846983176192L, 51014);
          return true;
        }
        GMTrace.o(6846983176192L, 51014);
        return false;
      }
    });
    GMTrace.o(6861344473088L, 51121);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6861478690816L, 51122);
    if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.a))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        hA(580);
        ((com.tencent.mm.plugin.wallet_core.b.a)paramk).aUD();
        paramString = cjm();
        if (paramString != null)
        {
          paramString = paramString.lRQ;
          paramString.putInt("real_name_verify_mode", 1);
          com.tencent.mm.wallet_core.a.i(this, paramString);
        }
        GMTrace.o(6861478690816L, 51122);
        return true;
      }
    }
    else if ((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.b))
    {
      hA(1666);
      iQ(true);
    }
    GMTrace.o(6861478690816L, 51122);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6861612908544L, 51123);
    int i = R.i.djh;
    GMTrace.o(6861612908544L, 51123);
    return i;
  }
  
  public void onClick(final View paramView)
  {
    GMTrace.i(6861747126272L, 51124);
    int i = paramView.getId();
    paramView = cjm();
    Bundle localBundle;
    if (paramView != null)
    {
      localBundle = paramView.lRQ;
      if (i != R.h.czC) {
        break label231;
      }
      e.a(15, bg.Po(), this.hys);
      if (localBundle.getInt("realname_scene") == 1)
      {
        if (getIntent() == null)
        {
          paramView = "";
          if (bg.mZ("")) {
            paramView = getString(R.l.eZz);
          }
          h.a(this, paramView, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6838795894784L, 50953);
              SwitchRealnameVerifyModeUI.this.finish();
              GMTrace.o(6838795894784L, 50953);
            }
          });
          GMTrace.o(6861747126272L, 51124);
          return;
        }
        hz(580);
        r(new com.tencent.mm.plugin.wallet_core.b.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url")));
        GMTrace.o(6861747126272L, 51124);
        return;
      }
      localBundle.putInt("real_name_verify_mode", 1);
    }
    for (;;)
    {
      com.tencent.mm.wallet_core.a.i(this, localBundle);
      GMTrace.o(6861747126272L, 51124);
      return;
      label231:
      if (i == R.h.czD)
      {
        e.a(17, bg.Po(), this.hys);
        localBundle.putInt("real_name_verify_mode", 2);
      }
      else if (i == R.h.czE)
      {
        e.a(16, bg.Po(), this.hys);
        if ((this.rLC) && (!bg.mZ(this.rLB)))
        {
          h.a(this, this.rLB, "", this.rLA, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(6856109981696L, 51082);
              paramAnonymousDialogInterface = paramView.lRQ;
              paramAnonymousDialogInterface.putInt("real_name_verify_mode", 3);
              paramAnonymousDialogInterface.putString("verify_card_flag", "1");
              com.tencent.mm.wallet_core.a.i(SwitchRealnameVerifyModeUI.this, paramAnonymousDialogInterface);
              GMTrace.o(6856109981696L, 51082);
            }
          });
          GMTrace.o(6861747126272L, 51124);
          return;
        }
        localBundle.putInt("real_name_verify_mode", 3);
        localBundle.putString("verify_card_flag", "1");
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6861210255360L, 51120);
    super.onCreate(paramBundle);
    this.rLD = this.un.getBoolean("key_from_set_pwd", false);
    MH();
    cjm();
    this.hys = this.un.getInt("entry_scene", this.hys);
    e.a(13, bg.Po(), this.hys);
    if (this.rLD) {
      oC(R.l.eYj);
    }
    GMTrace.o(6861210255360L, 51120);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6862149779456L, 51127);
    if (paramInt == 4)
    {
      com.tencent.mm.wallet_core.b localb = cjm();
      if (localb != null)
      {
        e.a(14, bg.Po(), this.hys);
        localb.c(this, 0);
        finish();
        GMTrace.o(6862149779456L, 51127);
        return true;
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(6862149779456L, 51127);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */