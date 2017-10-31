package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.tencent.gmtrace.GMTrace;
import junit.framework.Assert;
import org.json.JSONArray;

public final class e
  extends JSONArray
  implements a
{
  private final a iMm;
  
  public e()
  {
    GMTrace.i(19967839830016L, 148772);
    this.iMm = g.UV();
    GMTrace.o(19967839830016L, 148772);
  }
  
  e(a parama)
  {
    GMTrace.i(19967974047744L, 148773);
    Assert.assertNotNull(parama);
    this.iMm = parama;
    GMTrace.o(19967974047744L, 148773);
  }
  
  private e aK(Object paramObject)
  {
    GMTrace.i(19968779354112L, 148779);
    this.iMm.aJ(paramObject);
    GMTrace.o(19968779354112L, 148779);
    return this;
  }
  
  private e aL(long paramLong)
  {
    GMTrace.i(19968645136384L, 148778);
    this.iMm.aK(paramLong);
    GMTrace.o(19968645136384L, 148778);
    return this;
  }
  
  private e cb(boolean paramBoolean)
  {
    GMTrace.i(19968242483200L, 148775);
    this.iMm.ca(paramBoolean);
    GMTrace.o(19968242483200L, 148775);
    return this;
  }
  
  private e h(double paramDouble)
  {
    GMTrace.i(19968376700928L, 148776);
    this.iMm.g(paramDouble);
    GMTrace.o(19968376700928L, 148776);
    return this;
  }
  
  private e im(int paramInt)
  {
    GMTrace.i(19968510918656L, 148777);
    this.iMm.ih(paramInt);
    GMTrace.o(19968510918656L, 148777);
    return this;
  }
  
  private e in(int paramInt)
  {
    GMTrace.i(19971463708672L, 148799);
    e locale = new e(this.iMm.ii(paramInt));
    GMTrace.o(19971463708672L, 148799);
    return locale;
  }
  
  private e io(int paramInt)
  {
    GMTrace.i(19971597926400L, 148800);
    e locale = new e(this.iMm.ij(paramInt));
    GMTrace.o(19971597926400L, 148800);
    return locale;
  }
  
  private h ip(int paramInt)
  {
    GMTrace.i(19971732144128L, 148801);
    h localh = new h(this.iMm.ik(paramInt));
    GMTrace.o(19971732144128L, 148801);
    return localh;
  }
  
  private h iq(int paramInt)
  {
    GMTrace.i(19971866361856L, 148802);
    h localh = new h(this.iMm.il(paramInt));
    GMTrace.o(19971866361856L, 148802);
    return localh;
  }
  
  public final Object get(int paramInt)
  {
    GMTrace.i(19969047789568L, 148781);
    Object localObject = this.iMm.get(paramInt);
    GMTrace.o(19969047789568L, 148781);
    return localObject;
  }
  
  public final boolean getBoolean(int paramInt)
  {
    GMTrace.i(19969450442752L, 148784);
    boolean bool = this.iMm.getBoolean(paramInt);
    GMTrace.o(19969450442752L, 148784);
    return bool;
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(19969853095936L, 148787);
    double d = this.iMm.getDouble(paramInt);
    GMTrace.o(19969853095936L, 148787);
    return d;
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(19970255749120L, 148790);
    paramInt = this.iMm.getInt(paramInt);
    GMTrace.o(19970255749120L, 148790);
    return paramInt;
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(19970658402304L, 148793);
    long l = this.iMm.getLong(paramInt);
    GMTrace.o(19970658402304L, 148793);
    return l;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(19971061055488L, 148796);
    String str = this.iMm.getString(paramInt);
    GMTrace.o(19971061055488L, 148796);
    return str;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(19968913571840L, 148780);
    boolean bool = this.iMm.isNull(paramInt);
    GMTrace.o(19968913571840L, 148780);
    return bool;
  }
  
  public final int length()
  {
    GMTrace.i(19968108265472L, 148774);
    int i = this.iMm.length();
    GMTrace.o(19968108265472L, 148774);
    return i;
  }
  
  public final Object opt(int paramInt)
  {
    GMTrace.i(19969182007296L, 148782);
    Object localObject = this.iMm.opt(paramInt);
    GMTrace.o(19969182007296L, 148782);
    return localObject;
  }
  
  public final boolean optBoolean(int paramInt)
  {
    GMTrace.i(19969584660480L, 148785);
    boolean bool = this.iMm.optBoolean(paramInt);
    GMTrace.o(19969584660480L, 148785);
    return bool;
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(19969718878208L, 148786);
    paramBoolean = this.iMm.optBoolean(paramInt, paramBoolean);
    GMTrace.o(19969718878208L, 148786);
    return paramBoolean;
  }
  
  public final double optDouble(int paramInt)
  {
    GMTrace.i(19969987313664L, 148788);
    double d = this.iMm.optDouble(paramInt);
    GMTrace.o(19969987313664L, 148788);
    return d;
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    GMTrace.i(19970121531392L, 148789);
    paramDouble = this.iMm.optDouble(paramInt, paramDouble);
    GMTrace.o(19970121531392L, 148789);
    return paramDouble;
  }
  
  public final int optInt(int paramInt)
  {
    GMTrace.i(19970389966848L, 148791);
    paramInt = this.iMm.optInt(paramInt);
    GMTrace.o(19970389966848L, 148791);
    return paramInt;
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    GMTrace.i(19970524184576L, 148792);
    paramInt1 = this.iMm.optInt(paramInt1, paramInt2);
    GMTrace.o(19970524184576L, 148792);
    return paramInt1;
  }
  
  public final long optLong(int paramInt)
  {
    GMTrace.i(19970792620032L, 148794);
    long l = this.iMm.optLong(paramInt);
    GMTrace.o(19970792620032L, 148794);
    return l;
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    GMTrace.i(19970926837760L, 148795);
    paramLong = this.iMm.optLong(paramInt, paramLong);
    GMTrace.o(19970926837760L, 148795);
    return paramLong;
  }
  
  public final String optString(int paramInt)
  {
    GMTrace.i(19971195273216L, 148797);
    String str = this.iMm.optString(paramInt);
    GMTrace.o(19971195273216L, 148797);
    return str;
  }
  
  public final String optString(int paramInt, String paramString)
  {
    GMTrace.i(19971329490944L, 148798);
    paramString = this.iMm.optString(paramInt, paramString);
    GMTrace.o(19971329490944L, 148798);
    return paramString;
  }
  
  public final Object remove(int paramInt)
  {
    GMTrace.i(19969316225024L, 148783);
    Object localObject = this.iMm.remove(paramInt);
    GMTrace.o(19969316225024L, 148783);
    return localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */