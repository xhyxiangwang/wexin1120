package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.b.a.b;
import com.b.a.h;
import com.tencent.gmtrace.GMTrace;
import java.util.List;
import junit.framework.Assert;

public final class j
  implements a
{
  private b iMp;
  
  public j()
  {
    GMTrace.i(19963276427264L, 148738);
    this.iMp = new b();
    GMTrace.o(19963276427264L, 148738);
  }
  
  j(b paramb)
  {
    GMTrace.i(19963410644992L, 148739);
    Assert.assertNotNull(paramb);
    this.iMp = paramb;
    GMTrace.o(19963410644992L, 148739);
  }
  
  public final a aJ(Object paramObject)
  {
    GMTrace.i(19964215951360L, 148745);
    i.a(this.iMp, paramObject);
    GMTrace.o(19964215951360L, 148745);
    return this;
  }
  
  public final a aK(long paramLong)
  {
    GMTrace.i(19964081733632L, 148744);
    this.iMp.h(paramLong);
    GMTrace.o(19964081733632L, 148744);
    return this;
  }
  
  public final a ca(boolean paramBoolean)
  {
    GMTrace.i(19963679080448L, 148741);
    this.iMp.ac(paramBoolean);
    GMTrace.o(19963679080448L, 148741);
    return this;
  }
  
  public final a g(double paramDouble)
  {
    GMTrace.i(19963813298176L, 148742);
    this.iMp.e(paramDouble);
    GMTrace.o(19963813298176L, 148742);
    return this;
  }
  
  public final Object get(int paramInt)
  {
    GMTrace.i(19964484386816L, 148747);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    Object localObject = this.iMp.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(19964484386816L, 148747);
      return null;
    }
    if (((h)localObject).hs())
    {
      localObject = ((h)localObject).toString();
      GMTrace.o(19964484386816L, 148747);
      return localObject;
    }
    if (((h)localObject).hq())
    {
      boolean bool = ((h)localObject).hr();
      GMTrace.o(19964484386816L, 148747);
      return Boolean.valueOf(bool);
    }
    if (((h)localObject).isArray())
    {
      localObject = new j(((h)localObject).hp());
      GMTrace.o(19964484386816L, 148747);
      return localObject;
    }
    if (((h)localObject).hw())
    {
      localObject = new k(((h)localObject).hx());
      GMTrace.o(19964484386816L, 148747);
      return localObject;
    }
    if (((h)localObject).hG())
    {
      localObject = ((h)localObject).hH();
      GMTrace.o(19964484386816L, 148747);
      return localObject;
    }
    GMTrace.o(19964484386816L, 148747);
    return null;
  }
  
  public final boolean getBoolean(int paramInt)
  {
    GMTrace.i(19964887040000L, 148750);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.iMp.bN(paramInt);
    if (localh == null) {
      throw new f(String.format("getBoolean(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    if (localh.hq())
    {
      boolean bool = localh.hr();
      GMTrace.o(19964887040000L, 148750);
      return bool;
    }
    if (localh.hG())
    {
      String str = localh.hH();
      if ("true".equals(str))
      {
        GMTrace.o(19964887040000L, 148750);
        return true;
      }
      if ("false".equals(str))
      {
        GMTrace.o(19964887040000L, 148750);
        return false;
      }
    }
    throw new f(String.format("getBoolean(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
  }
  
  public final double getDouble(int paramInt)
  {
    GMTrace.i(19965289693184L, 148753);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.iMp.bN(paramInt);
    if (localh == null) {
      throw new f(String.format("getDouble(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    try
    {
      double d;
      if (localh.hs())
      {
        d = localh.hv();
        GMTrace.o(19965289693184L, 148753);
        return d;
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.hH());
        GMTrace.o(19965289693184L, 148753);
        return d;
      }
    }
    catch (Exception localException)
    {
      throw new f(String.format("getDouble(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final int getInt(int paramInt)
  {
    GMTrace.i(19965692346368L, 148756);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.iMp.bN(paramInt);
    if (localh == null) {
      throw new f(String.format("getInteger(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    try
    {
      boolean bool = localh.hs();
      double d;
      if (bool) {
        try
        {
          i = localh.ht();
          GMTrace.o(19965692346368L, 148756);
          return i;
        }
        catch (Exception localException1)
        {
          d = localh.hv();
          paramInt = (int)d;
          GMTrace.o(19965692346368L, 148756);
          return paramInt;
        }
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.hH());
        paramInt = (int)d;
        GMTrace.o(19965692346368L, 148756);
        return paramInt;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getInt(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final long getLong(int paramInt)
  {
    GMTrace.i(19966094999552L, 148759);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.iMp.bN(paramInt);
    if (localh == null) {
      throw new f(String.format("getLong(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    try
    {
      boolean bool = localh.hs();
      long l;
      double d;
      if (bool) {
        try
        {
          l = localh.hu();
          GMTrace.o(19966094999552L, 148759);
          return l;
        }
        catch (Exception localException1)
        {
          d = localh.hv();
          l = d;
          GMTrace.o(19966094999552L, 148759);
          return l;
        }
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.hH());
        l = d;
        GMTrace.o(19966094999552L, 148759);
        return l;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getLong(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(19966497652736L, 148762);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    Object localObject = this.iMp.bN(paramInt);
    if (localObject == null) {
      throw new f(String.format("getString(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    if (((h)localObject).hG())
    {
      localObject = ((h)localObject).hH();
      GMTrace.o(19966497652736L, 148762);
      return (String)localObject;
    }
    localObject = ((h)localObject).toString();
    GMTrace.o(19966497652736L, 148762);
    return (String)localObject;
  }
  
  public final a ih(int paramInt)
  {
    GMTrace.i(19963947515904L, 148743);
    this.iMp.bM(paramInt);
    GMTrace.o(19963947515904L, 148743);
    return this;
  }
  
  public final a ii(int paramInt)
  {
    GMTrace.i(19966900305920L, 148765);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    Object localObject = this.iMp.bN(paramInt);
    if (localObject == null) {
      throw new f(String.format("getJSONArray(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    localObject = new j(((h)localObject).hp());
    GMTrace.o(19966900305920L, 148765);
    return (a)localObject;
  }
  
  public final a ij(int paramInt)
  {
    GMTrace.i(19967034523648L, 148766);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(19967034523648L, 148766);
      return null;
    }
    Object localObject = this.iMp.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(19967034523648L, 148766);
      return null;
    }
    localObject = new j(((h)localObject).hp());
    GMTrace.o(19967034523648L, 148766);
    return (a)localObject;
  }
  
  public final c ik(int paramInt)
  {
    GMTrace.i(19967168741376L, 148767);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    Object localObject = this.iMp.bN(paramInt);
    if (localObject == null) {
      throw new f(String.format("getJSONObject(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    localObject = new k(((h)localObject).hx());
    GMTrace.o(19967168741376L, 148767);
    return (c)localObject;
  }
  
  public final c il(int paramInt)
  {
    GMTrace.i(19967302959104L, 148768);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(19967302959104L, 148768);
      return null;
    }
    Object localObject = this.iMp.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(19967302959104L, 148768);
      return null;
    }
    localObject = new k(((h)localObject).hx());
    GMTrace.o(19967302959104L, 148768);
    return (c)localObject;
  }
  
  public final boolean isNull(int paramInt)
  {
    GMTrace.i(19964350169088L, 148746);
    if ((paramInt < 0) || (paramInt >= length()) || (this.iMp.bN(paramInt) == null))
    {
      GMTrace.o(19964350169088L, 148746);
      return true;
    }
    GMTrace.o(19964350169088L, 148746);
    return false;
  }
  
  public final int length()
  {
    GMTrace.i(19963544862720L, 148740);
    int i = this.iMp.aaE.size();
    GMTrace.o(19963544862720L, 148740);
    return i;
  }
  
  public final Object opt(int paramInt)
  {
    GMTrace.i(19964618604544L, 148748);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(19964618604544L, 148748);
      return null;
    }
    Object localObject = this.iMp.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(19964618604544L, 148748);
      return null;
    }
    if (((h)localObject).hs())
    {
      localObject = ((h)localObject).toString();
      GMTrace.o(19964618604544L, 148748);
      return localObject;
    }
    if (((h)localObject).hq())
    {
      boolean bool = ((h)localObject).hr();
      GMTrace.o(19964618604544L, 148748);
      return Boolean.valueOf(bool);
    }
    if (((h)localObject).isArray())
    {
      localObject = new j(((h)localObject).hp());
      GMTrace.o(19964618604544L, 148748);
      return localObject;
    }
    if (((h)localObject).hw())
    {
      localObject = new k(((h)localObject).hx());
      GMTrace.o(19964618604544L, 148748);
      return localObject;
    }
    if (((h)localObject).hG())
    {
      localObject = ((h)localObject).hH();
      GMTrace.o(19964618604544L, 148748);
      return localObject;
    }
    GMTrace.o(19964618604544L, 148748);
    return null;
  }
  
  public final boolean optBoolean(int paramInt)
  {
    GMTrace.i(19965021257728L, 148751);
    boolean bool = optBoolean(paramInt, false);
    GMTrace.o(19965021257728L, 148751);
    return bool;
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(19965155475456L, 148752);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(19965155475456L, 148752);
      return paramBoolean;
    }
    Object localObject = this.iMp.bN(paramInt);
    if (localObject == null)
    {
      GMTrace.o(19965155475456L, 148752);
      return paramBoolean;
    }
    if (((h)localObject).hq())
    {
      paramBoolean = ((h)localObject).hr();
      GMTrace.o(19965155475456L, 148752);
      return paramBoolean;
    }
    if (((h)localObject).hG())
    {
      localObject = ((h)localObject).hH();
      if ("true".equals(localObject))
      {
        GMTrace.o(19965155475456L, 148752);
        return true;
      }
      if ("false".equals(localObject))
      {
        GMTrace.o(19965155475456L, 148752);
        return false;
      }
    }
    GMTrace.o(19965155475456L, 148752);
    return paramBoolean;
  }
  
  public final double optDouble(int paramInt)
  {
    GMTrace.i(19965423910912L, 148754);
    double d = optDouble(paramInt, 0.0D);
    GMTrace.o(19965423910912L, 148754);
    return d;
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    GMTrace.i(19965558128640L, 148755);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(19965558128640L, 148755);
      return paramDouble;
    }
    h localh = this.iMp.bN(paramInt);
    if (localh == null)
    {
      GMTrace.o(19965558128640L, 148755);
      return paramDouble;
    }
    try
    {
      double d;
      if (localh.hs())
      {
        d = localh.hv();
        GMTrace.o(19965558128640L, 148755);
        return d;
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.hH());
        GMTrace.o(19965558128640L, 148755);
        return d;
      }
    }
    catch (Exception localException)
    {
      GMTrace.o(19965558128640L, 148755);
    }
    return paramDouble;
  }
  
  public final int optInt(int paramInt)
  {
    GMTrace.i(19965826564096L, 148757);
    paramInt = optInt(paramInt, 0);
    GMTrace.o(19965826564096L, 148757);
    return paramInt;
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    GMTrace.i(19965960781824L, 148758);
    int i = length();
    if ((paramInt1 < 0) || (paramInt1 >= i))
    {
      GMTrace.o(19965960781824L, 148758);
      return paramInt2;
    }
    h localh = this.iMp.bN(paramInt1);
    if (localh == null)
    {
      GMTrace.o(19965960781824L, 148758);
      return paramInt2;
    }
    try
    {
      boolean bool = localh.hs();
      double d;
      if (bool) {
        try
        {
          paramInt1 = localh.ht();
          GMTrace.o(19965960781824L, 148758);
          return paramInt1;
        }
        catch (Exception localException2)
        {
          d = localh.hv();
          paramInt1 = (int)d;
          GMTrace.o(19965960781824L, 148758);
          return paramInt1;
        }
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.hH());
        paramInt1 = (int)d;
        GMTrace.o(19965960781824L, 148758);
        return paramInt1;
      }
    }
    catch (Exception localException1)
    {
      GMTrace.o(19965960781824L, 148758);
    }
    return paramInt2;
  }
  
  public final long optLong(int paramInt)
  {
    GMTrace.i(19966229217280L, 148760);
    long l = optLong(paramInt, 0L);
    GMTrace.o(19966229217280L, 148760);
    return l;
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    GMTrace.i(19966363435008L, 148761);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(19966363435008L, 148761);
      return paramLong;
    }
    h localh = this.iMp.bN(paramInt);
    if (localh == null)
    {
      GMTrace.o(19966363435008L, 148761);
      return paramLong;
    }
    try
    {
      boolean bool = localh.hs();
      double d;
      if (bool) {
        try
        {
          long l = localh.hu();
          GMTrace.o(19966363435008L, 148761);
          return l;
        }
        catch (Exception localException2)
        {
          d = localh.hv();
          paramLong = d;
          GMTrace.o(19966363435008L, 148761);
          return paramLong;
        }
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.hH());
        paramLong = d;
        GMTrace.o(19966363435008L, 148761);
        return paramLong;
      }
    }
    catch (Exception localException1)
    {
      GMTrace.o(19966363435008L, 148761);
    }
    return paramLong;
  }
  
  public final String optString(int paramInt)
  {
    GMTrace.i(19966631870464L, 148763);
    String str = optString(paramInt, null);
    GMTrace.o(19966631870464L, 148763);
    return str;
  }
  
  public final String optString(int paramInt, String paramString)
  {
    GMTrace.i(19966766088192L, 148764);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(19966766088192L, 148764);
      return paramString;
    }
    h localh = this.iMp.bN(paramInt);
    if (localh == null)
    {
      GMTrace.o(19966766088192L, 148764);
      return paramString;
    }
    if (localh.hG())
    {
      paramString = localh.hH();
      GMTrace.o(19966766088192L, 148764);
      return paramString;
    }
    paramString = localh.toString();
    GMTrace.o(19966766088192L, 148764);
    return paramString;
  }
  
  public final Object remove(int paramInt)
  {
    GMTrace.i(19964752822272L, 148749);
    int i = length();
    if ((paramInt < 0) || (paramInt >= i))
    {
      GMTrace.o(19964752822272L, 148749);
      return null;
    }
    Object localObject = this.iMp;
    ((b)localObject).aaE.remove(paramInt);
    if (localObject == null)
    {
      GMTrace.o(19964752822272L, 148749);
      return null;
    }
    if (((h)localObject).hs())
    {
      localObject = ((h)localObject).toString();
      GMTrace.o(19964752822272L, 148749);
      return localObject;
    }
    if (((h)localObject).hq())
    {
      boolean bool = ((h)localObject).hr();
      GMTrace.o(19964752822272L, 148749);
      return Boolean.valueOf(bool);
    }
    if (((h)localObject).isArray())
    {
      localObject = new j(((h)localObject).hp());
      GMTrace.o(19964752822272L, 148749);
      return localObject;
    }
    if (((h)localObject).hw())
    {
      localObject = new k(((h)localObject).hx());
      GMTrace.o(19964752822272L, 148749);
      return localObject;
    }
    if (((h)localObject).hG())
    {
      localObject = ((h)localObject).hH();
      GMTrace.o(19964752822272L, 148749);
      return localObject;
    }
    GMTrace.o(19964752822272L, 148749);
    return null;
  }
  
  public final String toString()
  {
    GMTrace.i(19967437176832L, 148769);
    String str = this.iMp.toString();
    GMTrace.o(19967437176832L, 148769);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */