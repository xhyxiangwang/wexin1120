package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements c
{
  private JSONObject iMl;
  
  public d()
  {
    GMTrace.i(19975624458240L, 148830);
    this.iMl = new JSONObject();
    GMTrace.o(19975624458240L, 148830);
  }
  
  public d(String paramString)
  {
    GMTrace.i(19975758675968L, 148831);
    try
    {
      this.iMl = new JSONObject(paramString);
      GMTrace.o(19975758675968L, 148831);
      return;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  d(JSONObject paramJSONObject)
  {
    GMTrace.i(19975892893696L, 148832);
    Assert.assertNotNull(paramJSONObject);
    this.iMl = paramJSONObject;
    GMTrace.o(19975892893696L, 148832);
  }
  
  public final c I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19976161329152L, 148834);
    try
    {
      this.iMl.put(paramString, paramBoolean);
      GMTrace.o(19976161329152L, 148834);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c a(String paramString, double paramDouble)
  {
    GMTrace.i(19976295546880L, 148835);
    try
    {
      this.iMl.put(paramString, paramDouble);
      GMTrace.o(19976295546880L, 148835);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c ag(String paramString, int paramInt)
  {
    GMTrace.i(19976429764608L, 148836);
    try
    {
      this.iMl.put(paramString, paramInt);
      GMTrace.o(19976429764608L, 148836);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final Object get(String paramString)
  {
    GMTrace.i(19977503506432L, 148844);
    try
    {
      paramString = this.iMl.get(paramString);
      if ((paramString instanceof JSONObject))
      {
        paramString = new d((JSONObject)paramString);
        GMTrace.o(19977503506432L, 148844);
        return paramString;
      }
      if ((paramString instanceof JSONArray))
      {
        paramString = new b((JSONArray)paramString);
        GMTrace.o(19977503506432L, 148844);
        return paramString;
      }
      GMTrace.o(19977503506432L, 148844);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final boolean getBoolean(String paramString)
  {
    GMTrace.i(19977771941888L, 148846);
    try
    {
      boolean bool = this.iMl.getBoolean(paramString);
      GMTrace.o(19977771941888L, 148846);
      return bool;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final double getDouble(String paramString)
  {
    GMTrace.i(19978040377344L, 148848);
    try
    {
      double d = this.iMl.getDouble(paramString);
      GMTrace.o(19978040377344L, 148848);
      return d;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final int getInt(String paramString)
  {
    GMTrace.i(19978308812800L, 148850);
    try
    {
      int i = this.iMl.getInt(paramString);
      GMTrace.o(19978308812800L, 148850);
      return i;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final long getLong(String paramString)
  {
    GMTrace.i(19978577248256L, 148852);
    try
    {
      long l = this.iMl.getLong(paramString);
      GMTrace.o(19978577248256L, 148852);
      return l;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final String getString(String paramString)
  {
    GMTrace.i(19978845683712L, 148854);
    try
    {
      paramString = this.iMl.getString(paramString);
      GMTrace.o(19978845683712L, 148854);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final boolean has(String paramString)
  {
    GMTrace.i(19977369288704L, 148843);
    boolean bool = this.iMl.has(paramString);
    GMTrace.o(19977369288704L, 148843);
    return bool;
  }
  
  public final boolean isNull(String paramString)
  {
    GMTrace.i(19977235070976L, 148842);
    boolean bool = this.iMl.isNull(paramString);
    GMTrace.o(19977235070976L, 148842);
    return bool;
  }
  
  public final Iterator<String> keys()
  {
    GMTrace.i(19979785207808L, 148861);
    Iterator localIterator = this.iMl.keys();
    GMTrace.o(19979785207808L, 148861);
    return localIterator;
  }
  
  public final int length()
  {
    GMTrace.i(19976027111424L, 148833);
    int i = this.iMl.length();
    GMTrace.o(19976027111424L, 148833);
    return i;
  }
  
  public final c n(String paramString, long paramLong)
  {
    GMTrace.i(19976563982336L, 148837);
    try
    {
      this.iMl.put(paramString, paramLong);
      GMTrace.o(19976563982336L, 148837);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c n(String paramString, Object paramObject)
  {
    GMTrace.i(19976698200064L, 148838);
    try
    {
      this.iMl.put(paramString, paramObject);
      GMTrace.o(19976698200064L, 148838);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final c o(String paramString, Object paramObject)
  {
    GMTrace.i(19976832417792L, 148839);
    try
    {
      this.iMl.put(paramString, paramObject);
      GMTrace.o(19976832417792L, 148839);
      return this;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final Object opt(String paramString)
  {
    GMTrace.i(19977637724160L, 148845);
    try
    {
      paramString = this.iMl.get(paramString);
      if ((paramString instanceof JSONObject))
      {
        paramString = new d((JSONObject)paramString);
        GMTrace.o(19977637724160L, 148845);
        return paramString;
      }
      if ((paramString instanceof JSONArray))
      {
        paramString = new b((JSONArray)paramString);
        GMTrace.o(19977637724160L, 148845);
        return paramString;
      }
      GMTrace.o(19977637724160L, 148845);
      return paramString;
    }
    catch (JSONException paramString)
    {
      GMTrace.o(19977637724160L, 148845);
    }
    return null;
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19977906159616L, 148847);
    paramBoolean = this.iMl.optBoolean(paramString, paramBoolean);
    GMTrace.o(19977906159616L, 148847);
    return paramBoolean;
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    GMTrace.i(19978174595072L, 148849);
    paramDouble = this.iMl.optDouble(paramString, paramDouble);
    GMTrace.o(19978174595072L, 148849);
    return paramDouble;
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    GMTrace.i(19978443030528L, 148851);
    paramInt = this.iMl.optInt(paramString, paramInt);
    GMTrace.o(19978443030528L, 148851);
    return paramInt;
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    GMTrace.i(19978711465984L, 148853);
    paramLong = this.iMl.optLong(paramString, paramLong);
    GMTrace.o(19978711465984L, 148853);
    return paramLong;
  }
  
  public final String optString(String paramString)
  {
    GMTrace.i(19978979901440L, 148855);
    paramString = this.iMl.optString(paramString);
    GMTrace.o(19978979901440L, 148855);
    return paramString;
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    GMTrace.i(19979114119168L, 148856);
    paramString1 = this.iMl.optString(paramString1, paramString2);
    GMTrace.o(19979114119168L, 148856);
    return paramString1;
  }
  
  public final c pA(String paramString)
  {
    GMTrace.i(19979650990080L, 148860);
    paramString = this.iMl.optJSONObject(paramString);
    if (paramString == null)
    {
      GMTrace.o(19979650990080L, 148860);
      return null;
    }
    paramString = new d(paramString);
    GMTrace.o(19979650990080L, 148860);
    return paramString;
  }
  
  public final String pw(String paramString)
  {
    GMTrace.i(19976966635520L, 148840);
    if (paramString == null) {
      throw new f("Names must be non-null");
    }
    GMTrace.o(19976966635520L, 148840);
    return paramString;
  }
  
  public final a px(String paramString)
  {
    GMTrace.i(19979248336896L, 148857);
    try
    {
      paramString = this.iMl.getJSONArray(paramString);
      if (paramString == null)
      {
        GMTrace.o(19979248336896L, 148857);
        return null;
      }
      paramString = new b(paramString);
      GMTrace.o(19979248336896L, 148857);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final a py(String paramString)
  {
    GMTrace.i(19979382554624L, 148858);
    paramString = this.iMl.optJSONArray(paramString);
    if (paramString == null)
    {
      GMTrace.o(19979382554624L, 148858);
      return null;
    }
    paramString = new b(paramString);
    GMTrace.o(19979382554624L, 148858);
    return paramString;
  }
  
  public final c pz(String paramString)
  {
    GMTrace.i(19979516772352L, 148859);
    try
    {
      paramString = this.iMl.getJSONObject(paramString);
      if (paramString == null)
      {
        GMTrace.o(19979516772352L, 148859);
        return null;
      }
      paramString = new d(paramString);
      GMTrace.o(19979516772352L, 148859);
      return paramString;
    }
    catch (JSONException paramString)
    {
      throw new f(paramString);
    }
  }
  
  public final Object remove(String paramString)
  {
    GMTrace.i(19977100853248L, 148841);
    paramString = this.iMl.remove(paramString);
    GMTrace.o(19977100853248L, 148841);
    return paramString;
  }
  
  public final String toString()
  {
    GMTrace.i(19979919425536L, 148862);
    String str = this.iMl.toString();
    GMTrace.o(19979919425536L, 148862);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */