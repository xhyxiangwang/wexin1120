package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  private Map<String, c> iHA;
  public d iHB;
  public b iHC;
  public JSONObject iHD;
  public String iHE;
  public a iHz;
  
  public a()
  {
    GMTrace.i(10573806829568L, 78781);
    GMTrace.o(10573806829568L, 78781);
  }
  
  private static <T extends f> T a(JSONObject paramJSONObject, Class<T> paramClass, f paramf)
  {
    GMTrace.i(17266305400832L, 128644);
    try
    {
      f localf = (f)paramClass.newInstance();
      paramClass = paramJSONObject;
      if (paramJSONObject == null) {
        paramClass = f.iHX;
      }
      paramJSONObject = paramClass.optJSONObject("window");
      paramClass = paramJSONObject;
      if (paramJSONObject == null) {
        paramClass = f.iHX;
      }
      paramJSONObject = paramf;
      if (paramf == null) {
        paramJSONObject = f.iHW;
      }
      localf.iHN = paramClass.optString("navigationBarTitleText", paramJSONObject.iHN);
      localf.iHO = paramClass.optString("navigationBarTextStyle", paramJSONObject.iHO);
      localf.iHP = paramClass.optString("navigationBarBackgroundColor", paramJSONObject.iHP);
      localf.iHK = paramClass.optString("backgroundColor", paramJSONObject.iHK);
      localf.iHU = paramClass.optBoolean("enablePullDownRefresh", paramJSONObject.iHU);
      localf.iHV = paramClass.optString("backgroundTextStyle", paramJSONObject.iHV);
      localf.iHT = paramClass.optBoolean("enableFullScreen", paramJSONObject.iHT);
      paramf = paramClass.optJSONObject("navigationBarRightButton");
      paramClass = paramf;
      if (paramf == null) {
        paramClass = f.iHX;
      }
      localf.iHS = paramClass.optBoolean("hide", paramJSONObject.iHS);
      localf.iHQ = paramClass.optString("text", paramJSONObject.iHQ);
      localf.iHR = paramClass.optString("iconPath", paramJSONObject.iHR);
      GMTrace.o(17266305400832L, 128644);
      return localf;
    }
    catch (Exception paramJSONObject)
    {
      GMTrace.o(17266305400832L, 128644);
    }
    return null;
  }
  
  private static Map<String, c> a(JSONObject paramJSONObject, a parama)
  {
    GMTrace.i(10574343700480L, 78785);
    HashMap localHashMap = new HashMap();
    if (paramJSONObject == null)
    {
      GMTrace.o(10574343700480L, 78785);
      return localHashMap;
    }
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, b(paramJSONObject.optJSONObject(str), parama));
    }
    GMTrace.o(10574343700480L, 78785);
    return localHashMap;
  }
  
  private static c b(JSONObject paramJSONObject, a parama)
  {
    GMTrace.i(10574477918208L, 78786);
    paramJSONObject = (c)a(paramJSONObject, c.class, parama);
    GMTrace.o(10574477918208L, 78786);
    return paramJSONObject;
  }
  
  private static d f(JSONObject paramJSONObject)
  {
    GMTrace.i(10574612135936L, 78787);
    Object localObject = paramJSONObject;
    if (paramJSONObject == null) {
      localObject = new JSONObject();
    }
    paramJSONObject = new d();
    paramJSONObject.iHI = ((JSONObject)localObject).optString("position");
    paramJSONObject.hbA = ((JSONObject)localObject).optString("color");
    paramJSONObject.iHJ = ((JSONObject)localObject).optString("selectedColor");
    paramJSONObject.iHK = ((JSONObject)localObject).optString("backgroundColor");
    paramJSONObject.iHL = ((JSONObject)localObject).optString("borderStyle");
    try
    {
      localObject = ((JSONObject)localObject).getJSONArray("list");
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        ArrayList localArrayList = paramJSONObject.fHD;
        JSONObject localJSONObject = ((JSONArray)localObject).getJSONObject(i);
        e locale = new e();
        locale.url = localJSONObject.optString("pagePath");
        locale.text = localJSONObject.optString("text");
        locale.fJv = localJSONObject.optString("iconData");
        locale.iHM = localJSONObject.optString("selectedIconData");
        localArrayList.add(locale);
        i += 1;
      }
      return paramJSONObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandAppConfig", localException.getMessage());
      GMTrace.o(10574612135936L, 78787);
    }
  }
  
  public static a oO(String paramString)
  {
    GMTrace.i(17266171183104L, 128643);
    a locala = new a();
    try
    {
      paramString = new JSONObject(paramString);
      locala.iHE = paramString.optString("entryPagePath");
      locala.iHD = paramString;
      locala.iHz = ((a)a(paramString.optJSONObject("global"), a.class, null));
      locala.iHA = a(paramString.optJSONObject("page"), locala.iHz);
      locala.iHB = f(paramString.optJSONObject("tabBar"));
      JSONObject localJSONObject = paramString.optJSONObject("networkTimeout");
      b localb = new b();
      paramString = localJSONObject;
      if (localJSONObject == null) {
        paramString = new JSONObject();
      }
      localb.fQG = paramString.optInt("request");
      localb.iHF = paramString.optInt("connectSocket");
      localb.iHH = paramString.optInt("downloadFile");
      localb.iHG = paramString.optInt("uploadFile");
      locala.iHC = localb;
      GMTrace.o(17266171183104L, 128643);
      return locala;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrandAppConfig", paramString.getMessage());
        paramString = new JSONObject();
      }
    }
  }
  
  public final String Uf()
  {
    GMTrace.i(10574075265024L, 78783);
    if (!bg.mZ(this.iHE))
    {
      String str = this.iHE;
      GMTrace.o(10574075265024L, 78783);
      return str;
    }
    GMTrace.o(10574075265024L, 78783);
    return "index.html";
  }
  
  public final c oN(String paramString)
  {
    GMTrace.i(10573941047296L, 78782);
    if (this.iHA.containsKey(paramString))
    {
      paramString = (c)this.iHA.get(paramString);
      GMTrace.o(10573941047296L, 78782);
      return paramString;
    }
    paramString = b(null, this.iHz);
    GMTrace.o(10573941047296L, 78782);
    return paramString;
  }
  
  public static class a
    extends a.f
  {
    public a()
    {
      GMTrace.i(10585752207360L, 78870);
      GMTrace.o(10585752207360L, 78870);
    }
  }
  
  public static final class b
  {
    public int fQG;
    public int iHF;
    public int iHG;
    public int iHH;
    
    public b()
    {
      GMTrace.i(10577564925952L, 78809);
      GMTrace.o(10577564925952L, 78809);
    }
  }
  
  public static class c
    extends a.f
  {
    public c()
    {
      GMTrace.i(10585617989632L, 78869);
      GMTrace.o(10585617989632L, 78869);
    }
  }
  
  public static final class d
  {
    public ArrayList<a.e> fHD;
    public String hbA;
    public String iHI;
    public String iHJ;
    public String iHK;
    public String iHL;
    
    public d()
    {
      GMTrace.i(10581054586880L, 78835);
      this.fHD = new ArrayList();
      GMTrace.o(10581054586880L, 78835);
    }
    
    public final boolean oP(String paramString)
    {
      GMTrace.i(10581188804608L, 78836);
      Iterator localIterator = this.fHD.iterator();
      while (localIterator.hasNext()) {
        if (((a.e)localIterator.next()).url.equals(h.sa(paramString)))
        {
          GMTrace.o(10581188804608L, 78836);
          return true;
        }
      }
      GMTrace.o(10581188804608L, 78836);
      return false;
    }
  }
  
  public static final class e
  {
    public String fJv;
    public String iHM;
    public String text;
    public String url;
    
    public e()
    {
      GMTrace.i(10573672611840L, 78780);
      GMTrace.o(10573672611840L, 78780);
    }
  }
  
  private static abstract class f
  {
    static final f iHW;
    static final JSONObject iHX;
    public String iHK;
    public String iHN;
    public String iHO;
    public String iHP;
    public String iHQ;
    public String iHR;
    public boolean iHS;
    public boolean iHT;
    public boolean iHU;
    public String iHV;
    
    static
    {
      GMTrace.i(17265365876736L, 128637);
      iHW = new f() {};
      iHX = new JSONObject();
      GMTrace.o(17265365876736L, 128637);
    }
    
    public f()
    {
      GMTrace.i(17265231659008L, 128636);
      this.iHS = false;
      this.iHT = false;
      this.iHU = false;
      GMTrace.o(17265231659008L, 128636);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */