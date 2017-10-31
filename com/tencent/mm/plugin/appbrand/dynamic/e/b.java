package com.tencent.mm.plugin.appbrand.dynamic.e;

import android.annotation.TargetApi;
import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements a
{
  private JSONArray iMk;
  
  public b()
  {
    GMTrace.i(19946230775808L, 148611);
    this.iMk = new JSONArray();
    GMTrace.o(19946230775808L, 148611);
  }
  
  b(JSONArray paramJSONArray)
  {
    GMTrace.i(19946364993536L, 148612);
    Assert.assertNotNull(paramJSONArray);
    this.iMk = paramJSONArray;
    GMTrace.o(19946364993536L, 148612);
  }
  
  public final a aJ(Object paramObject)
  {
    GMTrace.i(19947170299904L, 148618);
    this.iMk.put(paramObject);
    GMTrace.o(19947170299904L, 148618);
    return this;
  }
  
  public final a aK(long paramLong)
  {
    GMTrace.i(19947036082176L, 148617);
    this.iMk.put(paramLong);
    GMTrace.o(19947036082176L, 148617);
    return this;
  }
  
  public final a ca(boolean paramBoolean)
  {
    GMTrace.i(19946633428992L, 148614);
    this.iMk.put(paramBoolean);
    GMTrace.o(19946633428992L, 148614);
    return this;
  }
  
  public final a g(double paramDouble)
  {
    GMTrace.i(19946767646720L, 148615);
    try
    {
      this.iMk.put(paramDouble);
      GMTrace.o(19946767646720L, 148615);
      return this;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final Object get(int paramInt)
  {
    GMTrace.i(19947438735360L, 148620);
    try
    {
      Object localObject = this.iMk.get(paramInt);
      if ((localObject instanceof JSONObject))
      {
        localObject = new d((JSONObject)localObject);
        GMTrace.o(19947438735360L, 148620);
        return localObject;
      }
      if ((localObject instanceof JSONArray))
      {
        localObject = new b((JSONArray)localObject);
        GMTrace.o(19947438735360L, 148620);
        return localObject;
      }
      GMTrace.o(19947438735360L, 148620);
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final boolean getBoolean(int paramInt)
  {
    GMTrace.i(19947841388544L, 148623);
    try
    {
      boolean bool = this.iMk.getBoolean(paramInt);
      GMTrace.o(19947841388544L, 148623);
      return bool;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(19948244041728L, 148626);
    try
    {
      double d = this.iMk.getDouble(paramInt);
      GMTrace.o(19948244041728L, 148626);
      return d;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(19948646694912L, 148629);
    try
    {
      paramInt = this.iMk.getInt(paramInt);
      GMTrace.o(19948646694912L, 148629);
      return paramInt;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(19949049348096L, 148632);
    try
    {
      long l = this.iMk.getLong(paramInt);
      GMTrace.o(19949049348096L, 148632);
      return l;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(19949452001280L, 148635);
    try
    {
      String str = this.iMk.getString(paramInt);
      GMTrace.o(19949452001280L, 148635);
      return str;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final a ih(int paramInt)
  {
    GMTrace.i(19946901864448L, 148616);
    this.iMk.put(paramInt);
    GMTrace.o(19946901864448L, 148616);
    return this;
  }
  
  public final a ii(int paramInt)
  {
    GMTrace.i(19949854654464L, 148638);
    try
    {
      Object localObject = this.iMk.getJSONArray(paramInt);
      if (localObject == null)
      {
        GMTrace.o(19949854654464L, 148638);
        return null;
      }
      localObject = new b((JSONArray)localObject);
      GMTrace.o(19949854654464L, 148638);
      return (a)localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final a ij(int paramInt)
  {
    GMTrace.i(19949988872192L, 148639);
    Object localObject = this.iMk.optJSONArray(paramInt);
    if (localObject == null)
    {
      GMTrace.o(19949988872192L, 148639);
      return null;
    }
    localObject = new b((JSONArray)localObject);
    GMTrace.o(19949988872192L, 148639);
    return (a)localObject;
  }
  
  public final c ik(int paramInt)
  {
    GMTrace.i(19950123089920L, 148640);
    try
    {
      Object localObject = this.iMk.getJSONObject(paramInt);
      if (localObject == null)
      {
        GMTrace.o(19950123089920L, 148640);
        return null;
      }
      localObject = new d((JSONObject)localObject);
      GMTrace.o(19950123089920L, 148640);
      return (c)localObject;
    }
    catch (JSONException localJSONException)
    {
      throw new f(localJSONException);
    }
  }
  
  public final c il(int paramInt)
  {
    GMTrace.i(19950257307648L, 148641);
    Object localObject = this.iMk.optJSONObject(paramInt);
    if (localObject == null)
    {
      GMTrace.o(19950257307648L, 148641);
      return null;
    }
    localObject = new d((JSONObject)localObject);
    GMTrace.o(19950257307648L, 148641);
    return (c)localObject;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(19947304517632L, 148619);
    boolean bool = this.iMk.isNull(paramInt);
    GMTrace.o(19947304517632L, 148619);
    return bool;
  }
  
  public final int length()
  {
    GMTrace.i(19946499211264L, 148613);
    int i = this.iMk.length();
    GMTrace.o(19946499211264L, 148613);
    return i;
  }
  
  public final Object opt(int paramInt)
  {
    GMTrace.i(19947572953088L, 148621);
    Object localObject = this.iMk.opt(paramInt);
    if ((localObject instanceof JSONObject))
    {
      localObject = new d((JSONObject)localObject);
      GMTrace.o(19947572953088L, 148621);
      return localObject;
    }
    if ((localObject instanceof JSONArray))
    {
      localObject = new b((JSONArray)localObject);
      GMTrace.o(19947572953088L, 148621);
      return localObject;
    }
    GMTrace.o(19947572953088L, 148621);
    return localObject;
  }
  
  public final boolean optBoolean(int paramInt)
  {
    GMTrace.i(19947975606272L, 148624);
    boolean bool = this.iMk.optBoolean(paramInt);
    GMTrace.o(19947975606272L, 148624);
    return bool;
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(19948109824000L, 148625);
    paramBoolean = this.iMk.optBoolean(paramInt, paramBoolean);
    GMTrace.o(19948109824000L, 148625);
    return paramBoolean;
  }
  
  public final double optDouble(int paramInt)
  {
    GMTrace.i(19948378259456L, 148627);
    double d = this.iMk.optDouble(paramInt);
    GMTrace.o(19948378259456L, 148627);
    return d;
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    GMTrace.i(19948512477184L, 148628);
    paramDouble = this.iMk.optDouble(paramInt, paramDouble);
    GMTrace.o(19948512477184L, 148628);
    return paramDouble;
  }
  
  public final int optInt(int paramInt)
  {
    GMTrace.i(19948780912640L, 148630);
    paramInt = this.iMk.optInt(paramInt);
    GMTrace.o(19948780912640L, 148630);
    return paramInt;
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    GMTrace.i(19948915130368L, 148631);
    paramInt1 = this.iMk.optInt(paramInt1, paramInt2);
    GMTrace.o(19948915130368L, 148631);
    return paramInt1;
  }
  
  public final long optLong(int paramInt)
  {
    GMTrace.i(19949183565824L, 148633);
    long l = this.iMk.optLong(paramInt);
    GMTrace.o(19949183565824L, 148633);
    return l;
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    GMTrace.i(19949317783552L, 148634);
    paramLong = this.iMk.optLong(paramInt, paramLong);
    GMTrace.o(19949317783552L, 148634);
    return paramLong;
  }
  
  public final String optString(int paramInt)
  {
    GMTrace.i(19949586219008L, 148636);
    String str = this.iMk.optString(paramInt);
    GMTrace.o(19949586219008L, 148636);
    return str;
  }
  
  public final String optString(int paramInt, String paramString)
  {
    GMTrace.i(19949720436736L, 148637);
    paramString = this.iMk.optString(paramInt, paramString);
    GMTrace.o(19949720436736L, 148637);
    return paramString;
  }
  
  @TargetApi(19)
  public final Object remove(int paramInt)
  {
    GMTrace.i(19947707170816L, 148622);
    Object localObject = this.iMk.remove(paramInt);
    if ((localObject instanceof JSONObject))
    {
      localObject = new d((JSONObject)localObject);
      GMTrace.o(19947707170816L, 148622);
      return localObject;
    }
    if ((localObject instanceof JSONArray))
    {
      localObject = new b((JSONArray)localObject);
      GMTrace.o(19947707170816L, 148622);
      return localObject;
    }
    GMTrace.o(19947707170816L, 148622);
    return localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */