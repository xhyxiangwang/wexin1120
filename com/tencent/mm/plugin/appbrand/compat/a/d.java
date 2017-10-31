package com.tencent.mm.plugin.appbrand.compat.a;

import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public abstract interface d
  extends a
{
  public abstract void a(MMActivity paramMMActivity, JSONObject paramJSONObject, a parama);
  
  public abstract void a(MMActivity paramMMActivity, JSONObject paramJSONObject, b paramb);
  
  public abstract boolean a(MMActivity paramMMActivity, AppBrandStatObject paramAppBrandStatObject, JSONObject paramJSONObject, a parama);
  
  public abstract boolean a(MMActivity paramMMActivity, AppBrandStatObject paramAppBrandStatObject, JSONObject paramJSONObject, a parama, PString paramPString);
  
  public abstract void b(MMActivity paramMMActivity, JSONObject paramJSONObject, a parama);
  
  public static abstract interface a
  {
    public abstract void f(int paramInt1, int paramInt2, String paramString);
  }
  
  public static abstract interface b
  {
    public abstract void d(boolean paramBoolean, String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */