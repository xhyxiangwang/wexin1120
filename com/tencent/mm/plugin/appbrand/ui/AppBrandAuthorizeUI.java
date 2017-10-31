package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.s;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.p.l;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.protocal.c.bkw;
import com.tencent.mm.protocal.c.bse;
import com.tencent.mm.protocal.c.bsp;
import com.tencent.mm.protocal.c.dq;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppBrandAuthorizeUI
  extends MMPreference
{
  private String iqL;
  private String jqc;
  List<dq> jqd;
  private s jqe;
  protected f jqf;
  private boolean jqg;
  private boolean jqh;
  private boolean jqi;
  private j jqj;
  
  public AppBrandAuthorizeUI()
  {
    GMTrace.i(10542131445760L, 78545);
    this.jqd = new ArrayList();
    this.jqg = false;
    this.jqh = true;
    this.jqi = false;
    this.jqj = null;
    GMTrace.o(10542131445760L, 78545);
  }
  
  private void ZV()
  {
    GMTrace.i(10543205187584L, 78553);
    if (!this.jqi)
    {
      GMTrace.o(10543205187584L, 78553);
      return;
    }
    JSONArray localJSONArray = new JSONArray();
    Object localObject = this.jqd.iterator();
    while (((Iterator)localObject).hasNext())
    {
      dq localdq = (dq)((Iterator)localObject).next();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("scope", localdq.scope);
        localJSONObject.put("state", localdq.state);
        localJSONObject.put("desc", localdq.txn);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        w.printErrStackTrace("MicroMsg.AppBrandAuthorizeUI", localJSONException, "", new Object[0]);
      }
    }
    w.d("MicroMsg.AppBrandAuthorizeUI", "authInfo %s", new Object[] { localJSONArray });
    localObject = new Intent();
    ((Intent)localObject).putExtra("key_app_authorize_state", localJSONArray.toString());
    setResult(-1, (Intent)localObject);
    GMTrace.o(10543205187584L, 78553);
  }
  
  private void cx(final boolean paramBoolean)
  {
    GMTrace.i(10542668316672L, 78549);
    runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10500926603264L, 78238);
        Preference localPreference = new Preference(AppBrandAuthorizeUI.this);
        localPreference.vOZ = false;
        if (paramBoolean)
        {
          localPreference.setLayoutResource(p.g.iuW);
          localPreference.setTitle(AppBrandAuthorizeUI.this.getString(p.i.iwm, new Object[] { AppBrandAuthorizeUI.e(AppBrandAuthorizeUI.this).fvS }));
        }
        for (;;)
        {
          AppBrandAuthorizeUI.this.jqf.a(localPreference);
          AppBrandAuthorizeUI.this.jqf.notifyDataSetChanged();
          GMTrace.o(10500926603264L, 78238);
          return;
          localPreference.setLayoutResource(p.g.iuX);
          localPreference.setTitle(AppBrandAuthorizeUI.this.getString(p.i.iwn, new Object[] { AppBrandAuthorizeUI.e(AppBrandAuthorizeUI.this).fvS }));
        }
      }
    });
    GMTrace.o(10542668316672L, 78549);
  }
  
  public final int QD()
  {
    GMTrace.i(10542265663488L, 78546);
    int i = p.l.izK;
    GMTrace.o(10542265663488L, 78546);
    return i;
  }
  
  protected final void ZU()
  {
    GMTrace.i(19702222946304L, 146793);
    super.ZU();
    if ((this.vqg != null) && (this.vqg.getChildCount() > 0))
    {
      View localView = this.vqg.getChildAt(0);
      this.vqg.removeView(localView);
      this.jqj = new j(this);
      this.jqj.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      this.jqj.setStatusBarColor(getResources().getColor(p.c.aQq));
      this.vqg.addView(this.jqj);
      this.vqg.HB = this.jqj;
    }
    GMTrace.o(19702222946304L, 146793);
  }
  
  public final boolean a(final f paramf, final Preference paramPreference)
  {
    GMTrace.i(10542534098944L, 78548);
    w.d("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClcik.(key : %s)", new Object[] { paramPreference.iay });
    if (this.jqd == null)
    {
      w.w("MicroMsg.AppBrandAuthorizeUI", "mAuthItem == null");
      GMTrace.o(10542534098944L, 78548);
      return false;
    }
    String str = paramPreference.iay;
    if (bg.mZ(str))
    {
      w.e("MicroMsg.AppBrandAuthorizeUI", "key is null");
      GMTrace.o(10542534098944L, 78548);
      return false;
    }
    Iterator localIterator = this.jqd.iterator();
    while (localIterator.hasNext())
    {
      final Object localObject = (dq)localIterator.next();
      if (str.equals(bg.mY(((dq)localObject).scope)))
      {
        this.jqg = true;
        if (((CheckBoxPreference)paramPreference).isChecked())
        {
          ((dq)localObject).state = 1;
        }
        else if (this.jqh)
        {
          this.jqh = false;
          i.a locala = new i.a(this);
          locala.UG(getString(p.i.iwl));
          locala.UI(getString(p.i.iwk));
          locala.a(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10539312873472L, 78524);
              localObject.state = 2;
              w.d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state close");
              GMTrace.o(10539312873472L, 78524);
            }
          });
          locala.UJ(getString(p.i.duP));
          locala.b(new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10547097501696L, 78582);
              w.d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state open");
              localObject.state = 1;
              ((CheckBoxPreference)paramPreference).vNl = true;
              paramf.notifyDataSetChanged();
              GMTrace.o(10547097501696L, 78582);
            }
          });
          locala.d(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(10522133004288L, 78396);
              w.d("MicroMsg.AppBrandAuthorizeUI", "on cancel click!");
              localObject.state = 1;
              ((CheckBoxPreference)paramPreference).vNl = true;
              paramf.notifyDataSetChanged();
              GMTrace.o(10522133004288L, 78396);
            }
          });
          localObject = locala.ZT();
          ((i)localObject).setCanceledOnTouchOutside(false);
          ((i)localObject).show();
        }
        else
        {
          ((dq)localObject).state = 2;
        }
      }
    }
    GMTrace.o(10542534098944L, 78548);
    return false;
  }
  
  public void onBackPressed()
  {
    GMTrace.i(10542936752128L, 78551);
    w.d("MicroMsg.AppBrandAuthorizeUI", "onBackPressed !");
    ZV();
    super.onBackPressed();
    GMTrace.o(10542936752128L, 78551);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10542399881216L, 78547);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10513274634240L, 78330);
        AppBrandAuthorizeUI.a(AppBrandAuthorizeUI.this);
        AppBrandAuthorizeUI.this.finish();
        GMTrace.o(10513274634240L, 78330);
        return false;
      }
    });
    oC(p.i.iwu);
    this.jqf = this.vOv;
    paramBundle = getIntent().getStringExtra("key_username");
    this.jqc = paramBundle;
    if (bg.mZ(paramBundle))
    {
      finish();
      GMTrace.o(10542399881216L, 78547);
      return;
    }
    this.jqi = getIntent().getBooleanExtra("key_app_authorize_jsapi", false);
    this.jqe = p.oX(this.jqc);
    if (this.jqe == null)
    {
      w.e("MicroMsg.AppBrandAuthorizeUI", "AppBrandBizInfo is Null");
      GMTrace.o(10542399881216L, 78547);
      return;
    }
    this.iqL = this.jqe.appId;
    d.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10533809946624L, 78483);
        AppBrandAuthorizeUI.a(AppBrandAuthorizeUI.this, AppBrandAuthorizeUI.b(AppBrandAuthorizeUI.this));
        GMTrace.o(10533809946624L, 78483);
      }
    });
    GMTrace.o(10542399881216L, 78547);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10543070969856L, 78552);
    super.onDestroy();
    GMTrace.o(10543070969856L, 78552);
  }
  
  protected void onPause()
  {
    GMTrace.i(10542802534400L, 78550);
    if (this.jqg)
    {
      w.d("MicroMsg.AppBrandAuthorizeUI", "onPause key change!");
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10525891100672L, 78424);
          if (AppBrandAuthorizeUI.f(AppBrandAuthorizeUI.this))
          {
            AppBrandAuthorizeUI.g(AppBrandAuthorizeUI.this);
            AppBrandAuthorizeUI.a(AppBrandAuthorizeUI.this, AppBrandAuthorizeUI.b(AppBrandAuthorizeUI.this), AppBrandAuthorizeUI.this.jqd);
          }
          GMTrace.o(10525891100672L, 78424);
        }
      });
    }
    super.onPause();
    GMTrace.o(10542802534400L, 78550);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandAuthorizeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */