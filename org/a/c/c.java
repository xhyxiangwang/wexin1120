package org.a.c;

import java.util.Collections;
import java.util.Map;
import org.a.d.e;
import org.a.d.j;
import org.a.g.d;

public final class c
  implements b
{
  public final String a(org.a.d.c paramc)
  {
    d.e(paramc, "Cannot extract base string from null object");
    if ((paramc.xVl == null) || (paramc.xVl.size() <= 0)) {
      throw new org.a.b.c(paramc);
    }
    String str1 = org.a.g.c.encode(paramc.cqj().name());
    String str2 = org.a.g.c.encode(paramc.cqo());
    e locale = new e();
    locale.a(paramc.cqi());
    locale.a(paramc.cqn());
    locale.a(new e(paramc.xVl));
    paramc = new e(locale.xVm);
    Collections.sort(paramc.xVm);
    return String.format("%s&%s&%s", new Object[] { str1, str2, org.a.g.c.encode(paramc.cqp()) });
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/org/a/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */