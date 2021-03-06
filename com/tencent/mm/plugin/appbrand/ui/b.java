package com.tencent.mm.plugin.appbrand.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.plugin.appbrand.report.a;

public final class b
  extends AppBrandLauncherUI.a
{
  public b()
  {
    GMTrace.i(10493141975040L, 78180);
    GMTrace.o(10493141975040L, 78180);
  }
  
  static b bg(String paramString1, String paramString2)
  {
    GMTrace.i(10493276192768L, 78181);
    b localb = new b();
    Bundle localBundle = new Bundle(2);
    localBundle.putString("extra_title", paramString1);
    localBundle.putString("extra_tip", paramString2);
    localb.setArguments(localBundle);
    GMTrace.o(10493276192768L, 78181);
    return localb;
  }
  
  public final void MH()
  {
    GMTrace.i(10493544628224L, 78183);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setOrientation(1);
    Object localObject1 = new ImageView(getContext());
    ((ImageView)localObject1).setImageResource(p.h.ivQ);
    Object localObject2 = new LinearLayout.LayoutParams(js(50), js(50));
    ((LinearLayout.LayoutParams)localObject2).topMargin = js(91);
    ((LinearLayout.LayoutParams)localObject2).gravity = 1;
    localLinearLayout.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new TextView(getContext());
    ((TextView)localObject2).setTextSize(2, 14.0F);
    ((TextView)localObject2).setTextColor(Color.parseColor("#B2B2B2"));
    ((TextView)localObject2).setGravity(17);
    if (this.or == null) {}
    for (localObject1 = "";; localObject1 = this.or.getString("extra_tip"))
    {
      ((TextView)localObject2).setText((CharSequence)localObject1);
      localObject1 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject1).topMargin = js(16);
      ((LinearLayout.LayoutParams)localObject1).gravity = 1;
      localLinearLayout.addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
      ((ViewGroup)this.HB).addView(localLinearLayout, new ViewGroup.LayoutParams(-1, -1));
      a.a(this.hJp, "", "", 0, "", this.jqD);
      GMTrace.o(10493544628224L, 78183);
      return;
    }
  }
  
  public final void onResume()
  {
    GMTrace.i(10493410410496L, 78182);
    super.onResume();
    FragmentActivity localFragmentActivity = aG();
    if (this.or == null) {}
    for (String str = "";; str = this.or.getString("extra_title"))
    {
      localFragmentActivity.setTitle(str);
      GMTrace.o(10493410410496L, 78182);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */