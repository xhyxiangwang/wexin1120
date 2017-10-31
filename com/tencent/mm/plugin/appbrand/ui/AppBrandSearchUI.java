package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.38;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.a;
import com.tencent.mm.ui.fts.widget.a.b;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppBrandSearchUI
  extends FTSSearchTabWebViewUI
{
  private View jrF;
  private String jrG;
  private String jrH;
  private int scene;
  
  public AppBrandSearchUI()
  {
    GMTrace.i(10507369054208L, 78286);
    GMTrace.o(10507369054208L, 78286);
  }
  
  private int aak()
  {
    int i = 0;
    GMTrace.i(10508174360576L, 78292);
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int j = bg.getInt(localClass.getField("status_bar_height").get(localObject).toString(), 0);
      j = getResources().getDimensionPixelSize(j);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    GMTrace.o(10508174360576L, 78292);
    return i;
  }
  
  protected final void MH()
  {
    GMTrace.i(19503580708864L, 145313);
    super.MH();
    cO().cP().setBackgroundDrawable(new ColorDrawable(-1052684));
    bUu();
    xz(-16777216);
    GMTrace.o(19503580708864L, 145313);
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(17308986638336L, 128962);
    if (!TextUtils.isEmpty(paramString2)) {
      this.jrF.setVisibility(8);
    }
    try
    {
      this.jeK.d(10001, null);
      super.a(paramString1, paramString2, paramList, paramb);
      GMTrace.o(17308986638336L, 128962);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandSearchUI", "refresh keyword id error : %s", new Object[] { localRemoteException });
      }
    }
  }
  
  protected final int aad()
  {
    GMTrace.i(19503849144320L, 145315);
    if ((Build.VERSION.SDK_INT >= 23) && ((!com.tencent.mm.compatible.util.h.tJ()) || (!AppBrandNearbyWebViewUI.aae())))
    {
      ad.e(getWindow());
      GMTrace.o(19503849144320L, 145315);
      return -1052684;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = o.isd;
      GMTrace.o(19503849144320L, 145315);
      return i;
    }
    int i = super.aad();
    GMTrace.o(19503849144320L, 145315);
    return i;
  }
  
  public final boolean aaj()
  {
    GMTrace.i(10507771707392L, 78289);
    this.jrF.setVisibility(8);
    boolean bool = super.aaj();
    GMTrace.o(10507771707392L, 78289);
    return bool;
  }
  
  protected final void aal()
  {
    GMTrace.i(19503714926592L, 145314);
    super.aal();
    if (this.pmg != null)
    {
      this.pmg.findViewById(R.h.bfS).setVisibility(8);
      ((ImageView)this.pmg.findViewById(R.h.bfQ)).setImageResource(R.g.aWW);
      FTSEditTextView localFTSEditTextView = (FTSEditTextView)this.pmg.findViewById(R.h.bKI);
      localFTSEditTextView.jjR.setImageResource(R.k.dlu);
      ((ImageButton)localFTSEditTextView.findViewById(R.h.bvk)).setImageResource(R.k.dlt);
      localFTSEditTextView.vNy.setHintTextColor(1711276032);
      localFTSEditTextView.vNy.setTextColor(-16777216);
      h.a(this);
    }
    GMTrace.o(19503714926592L, 145314);
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(10508040142848L, 78291);
    super.bH(paramView);
    this.jrG = getIntent().getStringExtra("key_nearby_url");
    getIntent().getStringExtra("key_nearby_list_id");
    this.jrF = getLayoutInflater().inflate(R.i.cMn, (ViewGroup)paramView, false);
    View localView1 = this.jrF.findViewById(R.h.ceO);
    localView1.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19503312273408L, 145311);
        if (TextUtils.isEmpty(AppBrandSearchUI.a(AppBrandSearchUI.this)))
        {
          GMTrace.o(19503312273408L, 145311);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.putExtra("showShare", false);
        localIntent.putExtra("rawUrl", AppBrandSearchUI.a(AppBrandSearchUI.this));
        localIntent.putExtra("geta8key_scene", 41);
        localIntent.putExtra("show_long_click_popup_menu", false);
        com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
        GMTrace.o(19503312273408L, 145311);
      }
    });
    if (TextUtils.isEmpty(this.jrG))
    {
      localView1.setVisibility(8);
      this.jrF.setVisibility(8);
    }
    while ((paramView instanceof FrameLayout))
    {
      ((FrameLayout)paramView).addView(this.jrF);
      GMTrace.o(10508040142848L, 78291);
      return;
      localView1.setVisibility(0);
      this.jrF.setVisibility(0);
    }
    paramView = paramView.getLayoutParams();
    int k;
    Rect localRect;
    int i;
    if (getWindow().hasFeature(9))
    {
      localView1 = this.jrF;
      k = this.jrF.getPaddingLeft();
      localRect = new Rect();
      int j = bBI();
      View localView2 = getWindow().getDecorView();
      localView2.getWindowVisibleDisplayFrame(localRect);
      int m = localView2.getHeight();
      int[] arrayOfInt = new int[2];
      localView2.getLocationOnScreen(arrayOfInt);
      i = j;
      if (m == 0) {
        i = j + aak();
      }
      if ((m - localRect.height() < 0) || (arrayOfInt[1] <= 200)) {
        break label330;
      }
      i += m - localRect.height();
    }
    for (;;)
    {
      localView1.setPadding(k, i + this.jrF.getPaddingTop(), this.jrF.getPaddingRight(), this.jrF.getPaddingBottom());
      addContentView(this.jrF, paramView);
      GMTrace.o(10508040142848L, 78291);
      return;
      label330:
      i += localRect.top;
    }
  }
  
  protected final void g(final int paramInt, Bundle paramBundle)
  {
    GMTrace.i(19503983362048L, 145316);
    super.g(paramInt, paramBundle);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(19503983362048L, 145316);
      return;
      final String str = paramBundle.getString("fts_key_json_data");
      paramInt = paramBundle.getInt("fts_key_is_cache_data", 0);
      final int i = paramBundle.getInt("fts_key_is_expired", 1);
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19504654450688L, 145321);
          if (AppBrandSearchUI.b(AppBrandSearchUI.this) != null)
          {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = AppBrandSearchUI.c(AppBrandSearchUI.this);
            String str = str;
            int i = paramInt;
            int j = i;
            if (!locald.syz)
            {
              w.e("MicroMsg.JsApiHandler", "onSearchGuideDataReady fail, not ready");
              GMTrace.o(19504654450688L, 145321);
              return;
            }
            w.i("MicroMsg.JsApiHandler", "onSearchGuideDataReady success, ready");
            HashMap localHashMap = new HashMap();
            localHashMap.put("json", str);
            localHashMap.put("isCacheData", Integer.valueOf(i));
            localHashMap.put("isExpired", Integer.valueOf(j));
            af.u(new d.38(locald, i.a.a("onSearchGuideDataReady", localHashMap, locald.syB, locald.syC)));
          }
          GMTrace.o(19504654450688L, 145321);
        }
      });
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10507503271936L, 78287);
    super.onCreate(paramBundle);
    this.jrH = getIntent().getStringExtra("key_session_id");
    this.scene = getIntent().getIntExtra("ftsbizscene", 0);
    w.i("MicroMsg.AppBrandSearchUI", "onCreate oreh report weAppSearchClickStream(13929) statSessionId:%s", new Object[] { this.jrH });
    g.paX.i(13929, new Object[] { this.jrH, "", Integer.valueOf(1), Integer.valueOf(this.scene) });
    paramBundle = new Intent();
    paramBundle.putExtra("key_session_id", this.jrH);
    paramBundle.putExtra("ftsbizscene", this.scene);
    setResult(-1, paramBundle);
    GMTrace.o(10507503271936L, 78287);
  }
  
  public void onDestroy()
  {
    GMTrace.i(10507637489664L, 78288);
    if ((this.scene == 3) || (this.scene == 16)) {
      g.paX.i(13929, new Object[] { this.jrH, b.hjs, Integer.valueOf(2), Integer.valueOf(this.scene) });
    }
    super.onDestroy();
    GMTrace.o(10507637489664L, 78288);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */