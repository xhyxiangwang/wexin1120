package com.tencent.mm.plugin.sns.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public static final Pattern qhM;
  public static String[] qhN;
  public static HashMap<String, a> qhO;
  
  static
  {
    GMTrace.i(8772739137536L, 65362);
    qhM = Pattern.compile("\\{([\\s\\S]*?)\\}");
    qhN = new String[] { "{sex", "{username", "{richtext" };
    qhO = new HashMap();
    GMTrace.o(8772739137536L, 65362);
  }
  
  public static String a(d.a parama)
  {
    GMTrace.i(8772604919808L, 65361);
    if (qhO.containsKey(parama.qhJ))
    {
      if ((a)qhO.get(parama.qhJ) == a.qhP)
      {
        parama = parama.qhJ;
        GMTrace.o(8772604919808L, 65361);
        return parama;
      }
      parama = parama.qhI;
      GMTrace.o(8772604919808L, 65361);
      return parama;
    }
    Object localObject2 = parama.qhJ;
    Object localObject1 = localObject2;
    if (bg.mZ((String)localObject2))
    {
      parama = parama.qhI;
      GMTrace.o(8772604919808L, 65361);
      return parama;
    }
    label255:
    label258:
    for (;;)
    {
      localObject2 = qhM.matcher((CharSequence)localObject1);
      if (((Matcher)localObject2).find())
      {
        i = ((Matcher)localObject2).groupCount();
        localObject2 = ((Matcher)localObject2).group();
        w.i("MicroMsg.SnsAbTestUtil", "hello matcher group() " + i + " " + (String)localObject2);
        localObject1 = ((String)localObject1).replace((CharSequence)localObject2, "");
        i = 0;
        if (i >= qhN.length) {
          break label255;
        }
        if (((String)localObject2).indexOf(qhN[i]) < 0) {}
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label258;
        }
        qhO.put(parama.qhJ, a.qhQ);
        parama = parama.qhI;
        GMTrace.o(8772604919808L, 65361);
        return parama;
        i += 1;
        break;
        qhO.put(parama.qhJ, a.qhP);
        parama = parama.qhJ;
        GMTrace.o(8772604919808L, 65361);
        return parama;
      }
    }
  }
  
  static enum a
  {
    static
    {
      GMTrace.i(8771396960256L, 65352);
      qhP = new a("OK", 0);
      qhQ = new a("FAIL", 1);
      qhR = new a[] { qhP, qhQ };
      GMTrace.o(8771396960256L, 65352);
    }
    
    private a()
    {
      GMTrace.i(8771262742528L, 65351);
      GMTrace.o(8771262742528L, 65351);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */