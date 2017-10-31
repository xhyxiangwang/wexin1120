package com.tencent.mm.plugin.appbrand.jsapi.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.g;
import com.tencent.mm.plugin.appbrand.widget.input.g.a;
import com.tencent.mm.plugin.appbrand.widget.input.g.b;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import org.json.JSONObject;

public final class c
  extends e
{
  private static final int CTRL_INDEX = 110;
  private static final String NAME = "insertTextArea";
  
  public c()
  {
    GMTrace.i(10370869624832L, 77269);
    GMTrace.o(10370869624832L, 77269);
  }
  
  protected final boolean WB()
  {
    GMTrace.i(10371138060288L, 77271);
    GMTrace.o(10371138060288L, 77271);
    return false;
  }
  
  protected final boolean WC()
  {
    GMTrace.i(15479733223424L, 115333);
    GMTrace.o(15479733223424L, 115333);
    return false;
  }
  
  protected final boolean WD()
  {
    GMTrace.i(10371540713472L, 77274);
    GMTrace.o(10371540713472L, 77274);
    return false;
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(10371003842560L, 77270);
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    GMTrace.o(10371003842560L, 77270);
  }
  
  protected final void a(final g paramg)
  {
    GMTrace.i(10371406495744L, 77273);
    super.a(paramg);
    paramg.jBf = new g.b()
    {
      public final void bq(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(15479062134784L, 115328);
        String str = paramg.jBm;
        if (bg.mZ(str))
        {
          GMTrace.o(15479062134784L, 115328);
          return;
        }
        AppBrandPageView localAppBrandPageView = c.qf(str);
        if ((localAppBrandPageView == null) || (!localAppBrandPageView.UF))
        {
          GMTrace.o(15479062134784L, 115328);
          return;
        }
        c.b localb = new c.b();
        HashMap localHashMap = new HashMap();
        localHashMap.put("height", Integer.valueOf(com.tencent.mm.plugin.appbrand.n.c.jE(paramAnonymousInt2)));
        localHashMap.put("lineCount", Integer.valueOf(paramAnonymousInt1));
        localHashMap.put("inputId", str);
        localb.aj(localAppBrandPageView.iqL, 0).r(localHashMap).f(new int[] { localAppBrandPageView.hashCode() });
        GMTrace.o(15479062134784L, 115328);
      }
    };
    paramg.jBg = new g.a()
    {
      public final void cf(boolean paramAnonymousBoolean)
      {
        GMTrace.i(10367916834816L, 77247);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(10367916834816L, 77247);
          return;
        }
        Object localObject = paramg.jBm;
        if (bg.mZ((String)localObject))
        {
          GMTrace.o(10367916834816L, 77247);
          return;
        }
        localObject = c.qf((String)localObject);
        if ((localObject == null) || (!((AppBrandPageView)localObject).UF))
        {
          GMTrace.o(10367916834816L, 77247);
          return;
        }
        c.a locala = new c.a();
        HashMap localHashMap = new HashMap();
        localHashMap.put("inputId", paramg.jBm);
        locala.aj(((AppBrandPageView)localObject).iqL, 0).r(localHashMap).f(new int[] { localObject.hashCode() });
        GMTrace.o(10367916834816L, 77247);
      }
    };
    GMTrace.o(10371406495744L, 77273);
  }
  
  protected final boolean a(com.tencent.mm.plugin.appbrand.widget.input.b.e parame, JSONObject paramJSONObject, AppBrandPageView paramAppBrandPageView, int paramInt)
  {
    GMTrace.i(17389651492864L, 129563);
    if (!super.a(parame, paramJSONObject, paramAppBrandPageView, paramInt))
    {
      GMTrace.o(17389651492864L, 129563);
      return false;
    }
    parame.jGr = Boolean.valueOf(true);
    parame.jFS = "emoji";
    parame.jFT = false;
    parame.jFU = false;
    parame.jGx = Boolean.valueOf(false);
    parame.jGs = Boolean.valueOf(paramJSONObject.optBoolean("confirm", true));
    GMTrace.o(17389651492864L, 129563);
    return true;
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onKeyboardShow";
    
    public a()
    {
      GMTrace.i(10367111528448L, 77241);
      GMTrace.o(10367111528448L, 77241);
    }
  }
  
  private static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onTextAreaHeightChange";
    
    public b()
    {
      GMTrace.i(10366172004352L, 77234);
      GMTrace.o(10366172004352L, 77234);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */