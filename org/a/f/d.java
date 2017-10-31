package org.a.f;

import java.util.Random;

public final class d
  implements c
{
  private a xVM = new a();
  
  private static Long cqv()
  {
    return Long.valueOf(Long.valueOf(System.currentTimeMillis()).longValue() / 1000L);
  }
  
  public final String cqu()
  {
    return String.valueOf(cqv());
  }
  
  public final String getNonce()
  {
    return String.valueOf(cqv().longValue() + Integer.valueOf(new Random().nextInt()).intValue());
  }
  
  static final class a {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/org/a/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */