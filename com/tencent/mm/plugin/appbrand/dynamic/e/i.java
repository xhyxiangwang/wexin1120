package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.b.a.b;
import com.b.a.e;
import com.b.a.h;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.List;

public final class i
{
  private static b a(a parama)
  {
    GMTrace.i(19975221805056L, 148827);
    localb = new b();
    if (parama == null)
    {
      GMTrace.o(19975221805056L, 148827);
      return localb;
    }
    int i = 0;
    try
    {
      while (i < parama.length())
      {
        a(localb, parama.get(i));
        i += 1;
      }
      return localb;
    }
    catch (f parama)
    {
      GMTrace.o(19975221805056L, 148827);
    }
  }
  
  private static e a(c paramc)
  {
    GMTrace.i(19975087587328L, 148826);
    locale = new e();
    if (paramc == null)
    {
      GMTrace.o(19975087587328L, 148826);
      return locale;
    }
    try
    {
      Iterator localIterator = paramc.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(locale, str, paramc.get(str));
      }
      return locale;
    }
    catch (f paramc)
    {
      GMTrace.o(19975087587328L, 148826);
    }
  }
  
  protected static void a(b paramb, Object paramObject)
  {
    GMTrace.i(19975356022784L, 148828);
    if ((paramObject instanceof c))
    {
      paramb.a(a((c)paramObject));
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof a))
    {
      paramb.a(a((a)paramObject));
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      paramb.bM(((Integer)paramObject).intValue());
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      paramb.aaE.add(com.b.a.a.u((String)paramObject));
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      paramb.ac(((Boolean)paramObject).booleanValue());
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof Long))
    {
      paramb.h(((Long)paramObject).longValue());
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof Float))
    {
      float f = ((Float)paramObject).floatValue();
      paramb.aaE.add(com.b.a.a.H(f));
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      paramb.bM(((Integer)paramObject).intValue());
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof Double))
    {
      paramb.e(((Double)paramObject).doubleValue());
      GMTrace.o(19975356022784L, 148828);
      return;
    }
    if ((paramObject instanceof h)) {
      paramb.a((h)paramObject);
    }
    GMTrace.o(19975356022784L, 148828);
  }
  
  protected static void a(e parame, String paramString, Object paramObject)
  {
    GMTrace.i(19975490240512L, 148829);
    if ((paramObject instanceof c))
    {
      parame.b(paramString, a((c)paramObject));
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof a))
    {
      parame.b(paramString, a((a)paramObject));
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      parame.c(paramString, ((Integer)paramObject).intValue());
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof String))
    {
      parame.b(paramString, com.b.a.a.u((String)paramObject));
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof Boolean))
    {
      parame.b(paramString, com.b.a.a.ab(((Boolean)paramObject).booleanValue()));
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof Long))
    {
      parame.b(paramString, com.b.a.a.g(((Long)paramObject).longValue()));
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof Float))
    {
      parame.b(paramString, com.b.a.a.H(((Float)paramObject).floatValue()));
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof Integer))
    {
      parame.c(paramString, ((Integer)paramObject).intValue());
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof Double))
    {
      parame.b(paramString, com.b.a.a.d(((Double)paramObject).doubleValue()));
      GMTrace.o(19975490240512L, 148829);
      return;
    }
    if ((paramObject instanceof h)) {
      parame.b(paramString, (h)paramObject);
    }
    GMTrace.o(19975490240512L, 148829);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */