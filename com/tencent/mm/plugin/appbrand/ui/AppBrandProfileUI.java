package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView.t;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.config.s;
import com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.AppBrandOnOpReportStartEvent;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.p.c;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.b;
import com.tencent.mm.plugin.appbrand.widget.WxaBindBizInfoView;
import com.tencent.mm.plugin.appbrand.widget.i;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.o;
import com.tencent.mm.x.q.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class AppBrandProfileUI
  extends DrawStatusBarActivity
  implements View.OnClickListener, j.a
{
  private String jqc;
  private s jqe;
  private long jrk;
  private LinearLayout jrl;
  private TableLayout jrm;
  private ImageView jrn;
  private TextView jro;
  private TextView jrp;
  private TextView jrq;
  private View jrr;
  private View jrs;
  private TextView jrt;
  private a jru;
  private WxaExposedParams jrv;
  private com.tencent.mm.ui.widget.e jrw;
  
  public AppBrandProfileUI()
  {
    GMTrace.i(10488712790016L, 78147);
    this.jrk = 0L;
    GMTrace.o(10488712790016L, 78147);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, WxaExposedParams paramWxaExposedParams)
  {
    GMTrace.i(18193481465856L, 135552);
    if (bg.mZ(paramString1))
    {
      GMTrace.o(18193481465856L, 135552);
      return;
    }
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ab.getContext();
    }
    paramContext = new Intent(localContext, AppBrandProfileUI.class).putExtra("key_username", paramString1).putExtra("key_from_scene", 3).putExtra("key_scene_note", paramString2).putExtra("key_can_swipe_back", true).putExtra("key_scene_exposed_params", paramWxaExposedParams);
    if (paramWxaExposedParams != null)
    {
      paramString1 = new Bundle();
      paramString1.putInt("stat_scene", 6);
      paramString1.putString("stat_app_id", paramWxaExposedParams.appId);
      paramString1.putString("stat_url", paramWxaExposedParams.iJY);
      paramContext.putExtra("_stat_obj", paramString1);
    }
    if (!(localContext instanceof Activity)) {
      paramContext.addFlags(268435456);
    }
    localContext.startActivity(paramContext);
    GMTrace.o(18193481465856L, 135552);
  }
  
  private void a(TableLayout paramTableLayout)
  {
    GMTrace.i(19700075462656L, 146777);
    if (paramTableLayout == null)
    {
      GMTrace.o(19700075462656L, 146777);
      return;
    }
    int j = getResources().getDisplayMetrics().widthPixels;
    int k = paramTableLayout.getChildCount();
    int i = 0;
    while (i < k)
    {
      Object localObject = paramTableLayout.getChildAt(i);
      if ((localObject instanceof TableRow))
      {
        localObject = (TableRow)localObject;
        if (((TableRow)localObject).getChildCount() > 1)
        {
          View localView = ((TableRow)localObject).getChildAt(0);
          if ((localView != null) && ((localView instanceof TextView)))
          {
            int m = j / 2;
            int n = ((TableRow)localObject).getPaddingLeft();
            ((TextView)localView).setMaxWidth(m - n);
          }
        }
      }
      i += 1;
    }
    GMTrace.o(19700075462656L, 146777);
  }
  
  private void b(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(14297006604288L, 106521);
    if (this.jqe == null) {}
    for (String str1 = null; bg.mZ(str1); str1 = this.jqe.appId)
    {
      GMTrace.o(14297006604288L, 106521);
      return;
    }
    int i = getIntent().getIntExtra("key_from_scene", 3);
    String str2 = bg.mY(getIntent().getStringExtra("key_scene_note"));
    w.d("MicroMsg.AppBrandProfileUI", "stev report(%s), appId %s, scene %s, sceneNote %s, eventId %s, result %s", new Object[] { Integer.valueOf(13919), str1, Integer.valueOf(i), str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g.paX.i(13919, new Object[] { str1, Integer.valueOf(i), str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
    GMTrace.o(14297006604288L, 106521);
  }
  
  private void bu(int paramInt1, int paramInt2)
  {
    GMTrace.i(10489920749568L, 78156);
    b(paramInt1, paramInt2, bg.Po());
    GMTrace.o(10489920749568L, 78156);
  }
  
  private void cA(final boolean paramBoolean)
  {
    GMTrace.i(10490323402752L, 78159);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10547768590336L, 78587);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10541460357120L, 78540);
            AppBrandProfileUI.a(AppBrandProfileUI.this, this.jry, this.jrB);
            if ((AppBrandProfileUI.6.this.jrA) && (!AppBrandProfileUI.this.isFinishing()) && (!AppBrandProfileUI.this.vox)) {
              com.tencent.mm.plugin.appbrand.config.p.Up().a(AppBrandProfileUI.this, com.tencent.mm.plugin.appbrand.o.d.xC().nTP.getLooper());
            }
            GMTrace.o(10541460357120L, 78540);
          }
        });
        if (paramBoolean)
        {
          com.tencent.mm.plugin.appbrand.config.q.pk(AppBrandProfileUI.d(AppBrandProfileUI.this));
          AppBrandProfileUI.a(AppBrandProfileUI.this, 1, 1);
        }
        GMTrace.o(10547768590336L, 78587);
      }
    }, "AppBrandProfile");
    GMTrace.o(10490323402752L, 78159);
  }
  
  private void cz(boolean paramBoolean)
  {
    GMTrace.i(10489786531840L, 78155);
    if (this.jrs == null)
    {
      GMTrace.o(10489786531840L, 78155);
      return;
    }
    if (paramBoolean)
    {
      this.jrs.setVisibility(8);
      GMTrace.o(10489786531840L, 78155);
      return;
    }
    this.jrs.setVisibility(0);
    this.jrs.setOnClickListener(this);
    GMTrace.o(10489786531840L, 78155);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(10490457620480L, 78160);
    if ((paraml.uQU == 3) && ((paraml.obj instanceof String)) && (!bg.mZ(this.jqc)) && (this.jqc.equals((String)paraml.obj))) {
      cA(false);
    }
    GMTrace.o(10490457620480L, 78160);
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(10489518096384L, 78153);
    super.bH(paramView);
    ScrollView localScrollView = new ScrollView(this);
    localScrollView.setBackgroundResource(p.c.isk);
    this.jrl = new LinearLayout(this);
    this.jrl.setOrientation(1);
    localScrollView.addView(this.jrl, new FrameLayout.LayoutParams(-1, -2));
    ((FrameLayout)paramView).addView(localScrollView);
    GMTrace.o(10489518096384L, 78153);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10488981225472L, 78149);
    GMTrace.o(10488981225472L, 78149);
    return -1;
  }
  
  public final void onBackPressed()
  {
    GMTrace.i(10489249660928L, 78151);
    super.onBackPressed();
    bu(6, 1);
    GMTrace.o(10489249660928L, 78151);
  }
  
  public final void onClick(final View paramView)
  {
    GMTrace.i(10490189185024L, 78158);
    if (paramView.getId() == p.f.iuy)
    {
      if ((this.jqe != null) && (!bg.mZ(this.jqe.appId)))
      {
        com.tencent.mm.bi.d.b(this.vov.voR, "webview", ".ui.tools.WebViewUI", new Intent().putExtra("rawUrl", com.tencent.mm.plugin.appbrand.m.nT(this.jqe.appId)).putExtra("forceHideShare", true));
        bu(2, 1);
        GMTrace.o(10490189185024L, 78158);
      }
    }
    else
    {
      final Object localObject;
      if (paramView.getId() == p.f.iux)
      {
        if (this.jqe != null)
        {
          paramView = getIntent().getBundleExtra("_stat_obj");
          localObject = new AppBrandStatObject();
          ((AppBrandStatObject)localObject).scene = 1024;
          ((AppBrandStatObject)localObject).fNV = b.e(((AppBrandStatObject)localObject).scene, paramView);
          ((AppBrandStatObject)localObject).fNW = b.f(((AppBrandStatObject)localObject).scene, paramView);
          AppBrandLaunchProxyUI.a(this, this.jqe.username, null, 0, -1, (AppBrandStatObject)localObject, null);
          bu(4, 1);
          GMTrace.o(10490189185024L, 78158);
        }
      }
      else if (paramView.getId() == p.f.iuD)
      {
        localObject = com.tencent.mm.plugin.appbrand.config.p.oX(this.jqc);
        if (localObject == null)
        {
          w.w("MicroMsg.AppBrandProfileUI", "attrs is null.");
          GMTrace.o(10490189185024L, 78158);
          return;
        }
        HashMap localHashMap = new HashMap();
        localHashMap.put("desc", "");
        localHashMap.put("type", Integer.valueOf(1));
        localHashMap.put("title", ((s)localObject).fvS);
        localHashMap.put("img_url", ((s)localObject).iKa);
        Intent localIntent = new Intent();
        localIntent.putExtra("Select_Conv_Type", 3);
        localIntent.putExtra("mutil_select_is_ret", true);
        localIntent.putExtra("select_is_ret", true);
        localIntent.putExtra("scene_from", 3);
        localIntent.putExtra("appbrand_params", localHashMap);
        localIntent.putExtra("Retr_Msg_Type", 2);
        com.tencent.mm.bi.d.a((MMActivity)paramView.getContext(), ".ui.transmit.SelectConversationUI", localIntent, 1, new MMActivity.a()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
          {
            GMTrace.i(10499718643712L, 78229);
            if (paramAnonymousInt1 == 1)
            {
              if (paramAnonymousInt2 == -1)
              {
                if (paramAnonymousIntent == null) {}
                for (Object localObject1 = null; (localObject1 == null) || (((String)localObject1).length() == 0); localObject1 = paramAnonymousIntent.getStringExtra("Select_Conv_User"))
                {
                  w.i("MicroMsg.AppBrandProfileUI", "mmOnActivityResult fail, toUser is null");
                  GMTrace.o(10499718643712L, 78229);
                  return;
                }
                w.i("MicroMsg.AppBrandProfileUI", "result success toUser : %s ", new Object[] { localObject1 });
                paramAnonymousIntent = paramAnonymousIntent.getStringExtra("custom_send_text");
                String str1 = localObject.appId;
                Object localObject2 = com.tencent.mm.x.q.gi("wxapp_" + str1);
                com.tencent.mm.x.q.Aw().n((String)localObject2, true).k("prePublishId", "wxapp_" + str1);
                localObject2 = new f.a();
                ((f.a)localObject2).title = localObject.fvS;
                ((f.a)localObject2).type = 33;
                ((f.a)localObject2).hdl = AppBrandProfileUI.d(AppBrandProfileUI.this);
                ((f.a)localObject2).hdm = str1;
                ((f.a)localObject2).hdn = 1;
                ((f.a)localObject2).fMh = ("wxapp_" + str1);
                ((f.a)localObject2).thumburl = localObject.iKa;
                ((f.a)localObject2).url = com.tencent.mm.plugin.appbrand.m.nU(str1);
                ((f.a)localObject2).fMb = AppBrandProfileUI.d(AppBrandProfileUI.this);
                ((f.a)localObject2).fMc = localObject.fvS;
                localObject1 = bg.f(((String)localObject1).split(",")).iterator();
                if (((Iterator)localObject1).hasNext())
                {
                  String str2 = (String)((Iterator)localObject1).next();
                  ((com.tencent.mm.plugin.appbrand.compat.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a((f.a)localObject2, str1, localObject.fvS, str2, null);
                  if (!bg.mZ(paramAnonymousIntent))
                  {
                    ob localob = new ob();
                    localob.fMk.fMl = str2;
                    localob.fMk.content = paramAnonymousIntent;
                    localob.fMk.type = o.fY(str2);
                    localob.fMk.flags = 0;
                    com.tencent.mm.sdk.b.a.uLm.m(localob);
                  }
                  if (str2.endsWith("@chatroom")) {}
                  for (paramAnonymousInt1 = 9;; paramAnonymousInt1 = 8)
                  {
                    AppBrandProfileUI.a(AppBrandProfileUI.this, paramAnonymousInt1, bg.Po());
                    break;
                  }
                }
                com.tencent.mm.ui.base.h.bl(paramView.getContext(), paramView.getContext().getResources().getString(p.i.dxe));
                GMTrace.o(10499718643712L, 78229);
              }
            }
            else {
              AppBrandProfileUI.a(AppBrandProfileUI.this, 8, 2);
            }
            GMTrace.o(10499718643712L, 78229);
          }
        });
      }
    }
    GMTrace.o(10490189185024L, 78158);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10489383878656L, 78152);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_username");
    this.jqc = paramBundle;
    if (bg.mZ(paramBundle))
    {
      finish();
      GMTrace.o(10489383878656L, 78152);
      return;
    }
    i.d(this.vov.iiK, -1, true);
    this.jrv = ((WxaExposedParams)getIntent().getParcelableExtra("key_scene_exposed_params"));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10512066674688L, 78321);
        AppBrandProfileUI.this.onBackPressed();
        GMTrace.o(10512066674688L, 78321);
        return true;
      }
    }, p.e.isE);
    a(0, p.i.gYD, p.h.iwe, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10502134562816L, 78247);
        AppBrandProfileUI.a(AppBrandProfileUI.this);
        GMTrace.o(10502134562816L, 78247);
        return true;
      }
    });
    cO().cP().setBackgroundDrawable(new ColorDrawable(-1));
    bUu();
    Object localObject = LayoutInflater.from(this);
    paramBundle = ((LayoutInflater)localObject).inflate(p.g.ivm, this.jrl, true);
    localObject = ((LayoutInflater)localObject).inflate(p.g.ivl, this.jrl, true);
    this.jrm = ((TableLayout)paramBundle.findViewById(p.f.iuE));
    a(this.jrm);
    this.jrn = ((ImageView)paramBundle.findViewById(p.f.ckO));
    this.jro = ((TextView)paramBundle.findViewById(p.f.iuA));
    this.jrp = ((TextView)paramBundle.findViewById(p.f.iuw));
    this.jrq = ((TextView)paramBundle.findViewById(p.f.iuC));
    this.jrr = paramBundle.findViewById(p.f.iuB);
    this.jru = new a(paramBundle.findViewById(p.f.iuv));
    this.jrs = paramBundle.findViewById(p.f.iuy);
    this.jrt = ((TextView)this.jrs.findViewById(p.f.iuz));
    cz(true);
    paramBundle.setClickable(false);
    paramBundle.setLongClickable(false);
    ((View)localObject).setClickable(false);
    ((View)localObject).setLongClickable(false);
    paramBundle = ((View)localObject).findViewById(p.f.iux);
    localObject = ((View)localObject).findViewById(p.f.iuD);
    paramBundle.setOnClickListener(this);
    ((View)localObject).setOnClickListener(this);
    cA(true);
    GMTrace.o(10489383878656L, 78152);
  }
  
  protected final void onDestroy()
  {
    GMTrace.i(10490054967296L, 78157);
    super.onDestroy();
    com.tencent.mm.plugin.appbrand.config.p.Up().j(this);
    GMTrace.o(10490054967296L, 78157);
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(10489115443200L, 78150);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (!bg.mZ(this.jqc)) {
      com.tencent.mm.plugin.appbrand.config.p.Up().j(this);
    }
    paramIntent = getIntent().getStringExtra("key_username");
    this.jqc = paramIntent;
    if (bg.mZ(paramIntent))
    {
      finish();
      GMTrace.o(10489115443200L, 78150);
      return;
    }
    cA(true);
    GMTrace.o(10489115443200L, 78150);
  }
  
  protected final void onResume()
  {
    GMTrace.i(10489652314112L, 78154);
    super.onResume();
    if (this.vqg != null) {
      this.vqg.mEnable = getIntent().getBooleanExtra("key_can_swipe_back", true);
    }
    GMTrace.o(10489652314112L, 78154);
  }
  
  private final class a
    extends RecyclerView.t
    implements View.OnClickListener
  {
    WxaBindBizInfoView jrD;
    
    a(View paramView)
    {
      super();
      GMTrace.i(10547231719424L, 78583);
      this.jrD = ((WxaBindBizInfoView)paramView.findViewById(p.f.iuu));
      paramView.setOnClickListener(this);
      GMTrace.o(10547231719424L, 78583);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(10547365937152L, 78584);
      paramView = this.jrD.jAc;
      if ((paramView == null) || (paramView.isEmpty()))
      {
        w.i("MicroMsg.AppBrandProfileUI", "deal onBindBizInfo click failed, bindBizInfoList is null or nil.");
        GMTrace.o(10547365937152L, 78584);
        return;
      }
      if (paramView.size() == 1)
      {
        paramView = (WxaAttributes.WxaEntryInfo)paramView.get(0);
        com.tencent.mm.bi.d.b(this.Vc.getContext(), "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramView.username).putExtra("key_start_biz_profile_from_app_brand_profile", true).putExtra("force_get_contact", true));
        AppBrandProfileUI.a(AppBrandProfileUI.this, 3, 1);
        GMTrace.o(10547365937152L, 78584);
        return;
      }
      Intent localIntent = new Intent(AppBrandProfileUI.this.vov.voR, WxaBindBizInfoUI.class);
      localIntent.putParcelableArrayListExtra("wxa_entry_info_list", new ArrayList(paramView));
      AppBrandProfileUI.this.vov.voR.startActivity(localIntent);
      GMTrace.o(10547365937152L, 78584);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */