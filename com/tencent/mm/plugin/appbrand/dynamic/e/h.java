package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import junit.framework.Assert;
import org.json.JSONObject;

public final class h
  extends JSONObject
  implements c
{
  private final c iMo;
  
  public h()
  {
    GMTrace.i(19955357581312L, 148679);
    this.iMo = g.UU();
    GMTrace.o(19955357581312L, 148679);
  }
  
  public h(c paramc)
  {
    GMTrace.i(19955491799040L, 148680);
    Assert.assertNotNull(paramc);
    this.iMo = paramc;
    GMTrace.o(19955491799040L, 148680);
  }
  
  public h(String paramString)
  {
    GMTrace.i(19955626016768L, 148681);
    this.iMo = g.pC(paramString);
    GMTrace.o(19955626016768L, 148681);
  }
  
  private h J(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19955894452224L, 148683);
    this.iMo.I(paramString, paramBoolean);
    GMTrace.o(19955894452224L, 148683);
    return this;
  }
  
  private h ah(String paramString, int paramInt)
  {
    GMTrace.i(19956162887680L, 148685);
    this.iMo.ag(pw(paramString), paramInt);
    GMTrace.o(19956162887680L, 148685);
    return this;
  }
  
  private h b(String paramString, double paramDouble)
  {
    GMTrace.i(19956028669952L, 148684);
    this.iMo.a(pw(paramString), paramDouble);
    GMTrace.o(19956028669952L, 148684);
    return this;
  }
  
  private h o(String paramString, long paramLong)
  {
    GMTrace.i(19956297105408L, 148686);
    this.iMo.n(pw(paramString), paramLong);
    GMTrace.o(19956297105408L, 148686);
    return this;
  }
  
  private h p(String paramString, Object paramObject)
  {
    GMTrace.i(19956431323136L, 148687);
    this.iMo.n(paramString, paramObject);
    GMTrace.o(19956431323136L, 148687);
    return this;
  }
  
  private e pD(String paramString)
  {
    GMTrace.i(19959518330880L, 148710);
    paramString = this.iMo.px(paramString);
    if (paramString == null)
    {
      GMTrace.o(19959518330880L, 148710);
      return null;
    }
    paramString = new e(paramString);
    GMTrace.o(19959518330880L, 148710);
    return paramString;
  }
  
  private e pE(String paramString)
  {
    GMTrace.i(19959652548608L, 148711);
    paramString = this.iMo.py(paramString);
    if (paramString == null)
    {
      GMTrace.o(19959652548608L, 148711);
      return null;
    }
    paramString = new e(paramString);
    GMTrace.o(19959652548608L, 148711);
    return paramString;
  }
  
  private h pF(String paramString)
  {
    GMTrace.i(19959786766336L, 148712);
    paramString = this.iMo.pz(paramString);
    if (paramString == null)
    {
      GMTrace.o(19959786766336L, 148712);
      return null;
    }
    paramString = new h(paramString);
    GMTrace.o(19959786766336L, 148712);
    return paramString;
  }
  
  private h pG(String paramString)
  {
    GMTrace.i(19959920984064L, 148713);
    paramString = this.iMo.pA(paramString);
    if (paramString == null)
    {
      GMTrace.o(19959920984064L, 148713);
      return null;
    }
    paramString = new h(paramString);
    GMTrace.o(19959920984064L, 148713);
    return paramString;
  }
  
  private h q(String paramString, Object paramObject)
  {
    GMTrace.i(19956565540864L, 148688);
    this.iMo.o(paramString, paramObject);
    GMTrace.o(19956565540864L, 148688);
    return this;
  }
  
  public final Object get(String paramString)
  {
    GMTrace.i(19957236629504L, 148693);
    paramString = this.iMo.get(paramString);
    GMTrace.o(19957236629504L, 148693);
    return paramString;
  }
  
  public final boolean getBoolean(String paramString)
  {
    GMTrace.i(19957505064960L, 148695);
    boolean bool = this.iMo.getBoolean(paramString);
    GMTrace.o(19957505064960L, 148695);
    return bool;
  }
  
  public final double getDouble(String paramString)
  {
    GMTrace.i(19957907718144L, 148698);
    double d = this.iMo.getDouble(paramString);
    GMTrace.o(19957907718144L, 148698);
    return d;
  }
  
  public final int getInt(String paramString)
  {
    GMTrace.i(19958310371328L, 148701);
    int i = this.iMo.getInt(paramString);
    GMTrace.o(19958310371328L, 148701);
    return i;
  }
  
  public final long getLong(String paramString)
  {
    GMTrace.i(19958713024512L, 148704);
    long l = this.iMo.getLong(paramString);
    GMTrace.o(19958713024512L, 148704);
    return l;
  }
  
  public final String getString(String paramString)
  {
    GMTrace.i(19959115677696L, 148707);
    paramString = this.iMo.getString(paramString);
    GMTrace.o(19959115677696L, 148707);
    return paramString;
  }
  
  public final boolean has(String paramString)
  {
    GMTrace.i(19957102411776L, 148692);
    boolean bool = this.iMo.has(paramString);
    GMTrace.o(19957102411776L, 148692);
    return bool;
  }
  
  public final boolean isNull(String paramString)
  {
    GMTrace.i(19956968194048L, 148691);
    boolean bool = this.iMo.isNull(paramString);
    GMTrace.o(19956968194048L, 148691);
    return bool;
  }
  
  public final Iterator<String> keys()
  {
    GMTrace.i(19960055201792L, 148714);
    Iterator localIterator = this.iMo.keys();
    GMTrace.o(19960055201792L, 148714);
    return localIterator;
  }
  
  public final int length()
  {
    GMTrace.i(19955760234496L, 148682);
    int i = this.iMo.length();
    GMTrace.o(19955760234496L, 148682);
    return i;
  }
  
  public final Object opt(String paramString)
  {
    GMTrace.i(19957370847232L, 148694);
    paramString = this.iMo.opt(paramString);
    GMTrace.o(19957370847232L, 148694);
    return paramString;
  }
  
  public final boolean optBoolean(String paramString)
  {
    GMTrace.i(19957639282688L, 148696);
    boolean bool = this.iMo.optBoolean(paramString, false);
    GMTrace.o(19957639282688L, 148696);
    return bool;
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19957773500416L, 148697);
    paramBoolean = this.iMo.optBoolean(paramString, paramBoolean);
    GMTrace.o(19957773500416L, 148697);
    return paramBoolean;
  }
  
  public final double optDouble(String paramString)
  {
    GMTrace.i(19958041935872L, 148699);
    double d = this.iMo.optDouble(paramString, NaN.0D);
    GMTrace.o(19958041935872L, 148699);
    return d;
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    GMTrace.i(19958176153600L, 148700);
    paramDouble = this.iMo.optDouble(paramString, paramDouble);
    GMTrace.o(19958176153600L, 148700);
    return paramDouble;
  }
  
  public final int optInt(String paramString)
  {
    GMTrace.i(19958444589056L, 148702);
    int i = this.iMo.optInt(paramString, 0);
    GMTrace.o(19958444589056L, 148702);
    return i;
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    GMTrace.i(19958578806784L, 148703);
    paramInt = this.iMo.optInt(paramString, paramInt);
    GMTrace.o(19958578806784L, 148703);
    return paramInt;
  }
  
  public final long optLong(String paramString)
  {
    GMTrace.i(19958847242240L, 148705);
    long l = this.iMo.optLong(paramString, 0L);
    GMTrace.o(19958847242240L, 148705);
    return l;
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    GMTrace.i(19958981459968L, 148706);
    paramLong = this.iMo.optLong(paramString, paramLong);
    GMTrace.o(19958981459968L, 148706);
    return paramLong;
  }
  
  public final String optString(String paramString)
  {
    GMTrace.i(19959249895424L, 148708);
    paramString = this.iMo.optString(paramString, "");
    GMTrace.o(19959249895424L, 148708);
    return paramString;
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    GMTrace.i(19959384113152L, 148709);
    paramString1 = this.iMo.optString(paramString1);
    GMTrace.o(19959384113152L, 148709);
    return paramString1;
  }
  
  public final String pw(String paramString)
  {
    GMTrace.i(19956699758592L, 148689);
    paramString = this.iMo.pw(paramString);
    GMTrace.o(19956699758592L, 148689);
    return paramString;
  }
  
  public final Object remove(String paramString)
  {
    GMTrace.i(19956833976320L, 148690);
    paramString = this.iMo.remove(paramString);
    GMTrace.o(19956833976320L, 148690);
    return paramString;
  }
  
  public final String toString()
  {
    GMTrace.i(19960189419520L, 148715);
    String str = this.iMo.toString();
    GMTrace.o(19960189419520L, 148715);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */