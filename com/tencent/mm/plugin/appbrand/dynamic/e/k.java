package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.b.a.e;
import com.b.a.e.a;
import com.b.a.h;
import com.tencent.gmtrace.GMTrace;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class k
  implements c
{
  private e iMq;
  
  public k()
  {
    GMTrace.i(19941801590784L, 148578);
    this.iMq = new e();
    GMTrace.o(19941801590784L, 148578);
  }
  
  k(e parame)
  {
    GMTrace.i(19941935808512L, 148579);
    e locale = parame;
    if (parame == null) {
      locale = new e();
    }
    this.iMq = locale;
    GMTrace.o(19941935808512L, 148579);
  }
  
  public k(String paramString)
  {
    GMTrace.i(19942070026240L, 148580);
    this.iMq = com.b.a.a.w(paramString).hx();
    GMTrace.o(19942070026240L, 148580);
  }
  
  public final c I(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19942338461696L, 148582);
    this.iMq.a(paramString, com.b.a.a.ab(paramBoolean));
    GMTrace.o(19942338461696L, 148582);
    return this;
  }
  
  public final c a(String paramString, double paramDouble)
  {
    GMTrace.i(19942472679424L, 148583);
    this.iMq.a(paramString, com.b.a.a.d(paramDouble));
    GMTrace.o(19942472679424L, 148583);
    return this;
  }
  
  public final c ag(String paramString, int paramInt)
  {
    GMTrace.i(19942606897152L, 148584);
    this.iMq.a(paramString, com.b.a.a.bL(paramInt));
    GMTrace.o(19942606897152L, 148584);
    return this;
  }
  
  public final Object get(String paramString)
  {
    GMTrace.i(19943680638976L, 148592);
    paramString = opt(paramString);
    GMTrace.o(19943680638976L, 148592);
    return paramString;
  }
  
  public final boolean getBoolean(String paramString)
  {
    GMTrace.i(19943949074432L, 148594);
    h localh = this.iMq.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    if (localh.hq())
    {
      boolean bool = localh.hr();
      GMTrace.o(19943949074432L, 148594);
      return bool;
    }
    if (localh.hG())
    {
      String str = localh.toString();
      if ("true".equals(str))
      {
        GMTrace.o(19943949074432L, 148594);
        return true;
      }
      if ("false".equals(str))
      {
        GMTrace.o(19943949074432L, 148594);
        return false;
      }
    }
    throw new f(String.format("getBoolean by key : %s error, value : %s", new Object[] { paramString, localh }));
  }
  
  public final double getDouble(String paramString)
  {
    GMTrace.i(19944217509888L, 148596);
    h localh = this.iMq.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    try
    {
      double d;
      if (localh.hs())
      {
        d = localh.hv();
        GMTrace.o(19944217509888L, 148596);
        return d;
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.toString());
        GMTrace.o(19944217509888L, 148596);
        return d;
      }
    }
    catch (Exception localException)
    {
      throw new f(String.format("getDouble by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final int getInt(String paramString)
  {
    GMTrace.i(19944485945344L, 148598);
    h localh = this.iMq.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    try
    {
      boolean bool = localh.hs();
      int i;
      double d;
      if (bool) {
        try
        {
          i = localh.ht();
          GMTrace.o(19944485945344L, 148598);
          return i;
        }
        catch (Exception localException1)
        {
          d = localh.hv();
          i = (int)d;
          GMTrace.o(19944485945344L, 148598);
          return i;
        }
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.toString());
        i = (int)d;
        GMTrace.o(19944485945344L, 148598);
        return i;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getInt by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final long getLong(String paramString)
  {
    GMTrace.i(19944754380800L, 148600);
    h localh = this.iMq.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
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
          GMTrace.o(19944754380800L, 148600);
          return l;
        }
        catch (Exception localException1)
        {
          d = localh.hv();
          l = d;
          GMTrace.o(19944754380800L, 148600);
          return l;
        }
      }
      if (localh.hG())
      {
        d = Double.parseDouble(localh.toString());
        l = d;
        GMTrace.o(19944754380800L, 148600);
        return l;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getLong by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final String getString(String paramString)
  {
    GMTrace.i(19945022816256L, 148602);
    h localh = this.iMq.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    if (localh.hG())
    {
      paramString = localh.hH();
      GMTrace.o(19945022816256L, 148602);
      return paramString;
    }
    paramString = localh.toString();
    GMTrace.o(19945022816256L, 148602);
    return paramString;
  }
  
  public final boolean has(String paramString)
  {
    GMTrace.i(19943546421248L, 148591);
    if (this.iMq.y(paramString) != null)
    {
      GMTrace.o(19943546421248L, 148591);
      return true;
    }
    GMTrace.o(19943546421248L, 148591);
    return false;
  }
  
  public final boolean isNull(String paramString)
  {
    GMTrace.i(19943412203520L, 148590);
    if (this.iMq.y(paramString) == null)
    {
      GMTrace.o(19943412203520L, 148590);
      return true;
    }
    GMTrace.o(19943412203520L, 148590);
    return false;
  }
  
  public final Iterator<String> keys()
  {
    GMTrace.i(19945962340352L, 148609);
    Iterator localIterator = Collections.unmodifiableList(this.iMq.aaL).iterator();
    GMTrace.o(19945962340352L, 148609);
    return localIterator;
  }
  
  public final int length()
  {
    GMTrace.i(19942204243968L, 148581);
    int i = this.iMq.aaL.size();
    GMTrace.o(19942204243968L, 148581);
    return i;
  }
  
  public final c n(String paramString, long paramLong)
  {
    GMTrace.i(19942741114880L, 148585);
    this.iMq.a(paramString, com.b.a.a.g(paramLong));
    GMTrace.o(19942741114880L, 148585);
    return this;
  }
  
  public final c n(String paramString, Object paramObject)
  {
    GMTrace.i(19942875332608L, 148586);
    i.a(this.iMq, paramString, paramObject);
    GMTrace.o(19942875332608L, 148586);
    return this;
  }
  
  public final c o(String paramString, Object paramObject)
  {
    GMTrace.i(19943009550336L, 148587);
    i.a(this.iMq, paramString, paramObject);
    GMTrace.o(19943009550336L, 148587);
    return this;
  }
  
  public final Object opt(String paramString)
  {
    GMTrace.i(19943814856704L, 148593);
    paramString = this.iMq.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(19943814856704L, 148593);
      return null;
    }
    if (paramString.hs())
    {
      paramString = paramString.toString();
      GMTrace.o(19943814856704L, 148593);
      return paramString;
    }
    if (paramString.hq())
    {
      boolean bool = paramString.hr();
      GMTrace.o(19943814856704L, 148593);
      return Boolean.valueOf(bool);
    }
    if (paramString.isArray())
    {
      paramString = new j(paramString.hp());
      GMTrace.o(19943814856704L, 148593);
      return paramString;
    }
    if (paramString.hw())
    {
      paramString = new k(paramString.hx());
      GMTrace.o(19943814856704L, 148593);
      return paramString;
    }
    if (paramString.hG())
    {
      paramString = paramString.hH();
      GMTrace.o(19943814856704L, 148593);
      return paramString;
    }
    GMTrace.o(19943814856704L, 148593);
    return null;
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    GMTrace.i(19944083292160L, 148595);
    paramString = this.iMq.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(19944083292160L, 148595);
      return paramBoolean;
    }
    if (paramString.hq())
    {
      paramBoolean = paramString.hr();
      GMTrace.o(19944083292160L, 148595);
      return paramBoolean;
    }
    if (paramString.hG())
    {
      paramString = paramString.toString();
      if ("true".equals(paramString))
      {
        GMTrace.o(19944083292160L, 148595);
        return true;
      }
      if ("false".equals(paramString))
      {
        GMTrace.o(19944083292160L, 148595);
        return false;
      }
    }
    GMTrace.o(19944083292160L, 148595);
    return paramBoolean;
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    GMTrace.i(19944351727616L, 148597);
    paramString = this.iMq.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(19944351727616L, 148597);
      return paramDouble;
    }
    try
    {
      double d;
      if (paramString.hs())
      {
        d = paramString.hv();
        GMTrace.o(19944351727616L, 148597);
        return d;
      }
      if (paramString.hG())
      {
        d = Double.parseDouble(paramString.toString());
        GMTrace.o(19944351727616L, 148597);
        return d;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(19944351727616L, 148597);
    }
    return paramDouble;
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    GMTrace.i(19944620163072L, 148599);
    paramString = this.iMq.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(19944620163072L, 148599);
      return paramInt;
    }
    try
    {
      boolean bool = paramString.hs();
      double d;
      if (bool) {
        try
        {
          int i = paramString.ht();
          GMTrace.o(19944620163072L, 148599);
          return i;
        }
        catch (Exception localException)
        {
          d = paramString.hv();
          paramInt = (int)d;
          GMTrace.o(19944620163072L, 148599);
          return paramInt;
        }
      }
      if (paramString.hG())
      {
        d = Double.parseDouble(paramString.toString());
        paramInt = (int)d;
        GMTrace.o(19944620163072L, 148599);
        return paramInt;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(19944620163072L, 148599);
    }
    return paramInt;
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    GMTrace.i(19944888598528L, 148601);
    paramString = this.iMq.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(19944888598528L, 148601);
      return paramLong;
    }
    try
    {
      boolean bool = paramString.hs();
      double d;
      if (bool) {
        try
        {
          long l = paramString.hu();
          GMTrace.o(19944888598528L, 148601);
          return l;
        }
        catch (Exception localException)
        {
          d = paramString.hv();
          paramLong = d;
          GMTrace.o(19944888598528L, 148601);
          return paramLong;
        }
      }
      if (paramString.hG())
      {
        d = Double.parseDouble(paramString.toString());
        paramLong = d;
        GMTrace.o(19944888598528L, 148601);
        return paramLong;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(19944888598528L, 148601);
    }
    return paramLong;
  }
  
  public final String optString(String paramString)
  {
    GMTrace.i(19945157033984L, 148603);
    paramString = optString(paramString, null);
    GMTrace.o(19945157033984L, 148603);
    return paramString;
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    GMTrace.i(19945291251712L, 148604);
    paramString1 = this.iMq.y(paramString1);
    if (paramString1 == null)
    {
      GMTrace.o(19945291251712L, 148604);
      return null;
    }
    if (paramString1.hG())
    {
      paramString1 = paramString1.hH();
      GMTrace.o(19945291251712L, 148604);
      return paramString1;
    }
    paramString1 = paramString1.toString();
    GMTrace.o(19945291251712L, 148604);
    return paramString1;
  }
  
  public final c pA(String paramString)
  {
    GMTrace.i(19945828122624L, 148608);
    paramString = this.iMq.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(19945828122624L, 148608);
      return null;
    }
    paramString = new k(paramString.hx());
    GMTrace.o(19945828122624L, 148608);
    return paramString;
  }
  
  public final String pw(String paramString)
  {
    GMTrace.i(19943143768064L, 148588);
    if (paramString == null) {
      throw new f("Names must be non-null");
    }
    GMTrace.o(19943143768064L, 148588);
    return paramString;
  }
  
  public final a px(String paramString)
  {
    GMTrace.i(19945425469440L, 148605);
    h localh = this.iMq.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    paramString = new j(localh.hp());
    GMTrace.o(19945425469440L, 148605);
    return paramString;
  }
  
  public final a py(String paramString)
  {
    GMTrace.i(19945559687168L, 148606);
    paramString = this.iMq.y(paramString);
    if (paramString == null)
    {
      GMTrace.o(19945559687168L, 148606);
      return null;
    }
    paramString = new j(paramString.hp());
    GMTrace.o(19945559687168L, 148606);
    return paramString;
  }
  
  public final c pz(String paramString)
  {
    GMTrace.i(19945693904896L, 148607);
    h localh = this.iMq.y(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    paramString = new k(localh.hx());
    GMTrace.o(19945693904896L, 148607);
    return paramString;
  }
  
  public final Object remove(String paramString)
  {
    GMTrace.i(19943277985792L, 148589);
    e locale = this.iMq;
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    int i = locale.indexOf(paramString);
    if (i != -1)
    {
      locale.aaM.remove(i);
      locale.aaL.remove(i);
      locale.aaE.remove(i);
    }
    if (locale == null)
    {
      GMTrace.o(19943277985792L, 148589);
      return null;
    }
    if (locale.hs())
    {
      paramString = locale.toString();
      GMTrace.o(19943277985792L, 148589);
      return paramString;
    }
    if (locale.hq())
    {
      boolean bool = locale.hr();
      GMTrace.o(19943277985792L, 148589);
      return Boolean.valueOf(bool);
    }
    if (locale.isArray())
    {
      paramString = new j(locale.hp());
      GMTrace.o(19943277985792L, 148589);
      return paramString;
    }
    if (locale.hw())
    {
      paramString = new k(locale.hx());
      GMTrace.o(19943277985792L, 148589);
      return paramString;
    }
    if (locale.hG())
    {
      paramString = locale.hH();
      GMTrace.o(19943277985792L, 148589);
      return paramString;
    }
    GMTrace.o(19943277985792L, 148589);
    return null;
  }
  
  public final String toString()
  {
    GMTrace.i(19946096558080L, 148610);
    String str = this.iMq.toString();
    GMTrace.o(19946096558080L, 148610);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */