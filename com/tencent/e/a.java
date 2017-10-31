package com.tencent.e;

import java.util.HashMap;

public final class a
  implements com.tencent.e.b.a
{
  private g xLf;
  private boolean xLg = true;
  
  protected a(g paramg)
  {
    this.xLf = paramg;
  }
  
  public final void t(String paramString, Object paramObject)
  {
    if (!this.xLg) {
      return;
    }
    f localf = f.cnK();
    if (paramObject == null) {
      throw new h("TpfServiceCenter|registerService|name or service should not be null");
    }
    synchronized (localf.xLm)
    {
      localf.xLk.put(paramString, paramObject);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */