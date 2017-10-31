package com.tencent.mm.plugin.sns.data;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bcz;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  public ConcurrentHashMap<String, CharSequence> pYk;
  
  public d()
  {
    GMTrace.i(8781463289856L, 65427);
    this.pYk = new ConcurrentHashMap();
    GMTrace.o(8781463289856L, 65427);
  }
  
  public final void a(bcz parambcz, CharSequence paramCharSequence)
  {
    GMTrace.i(8781597507584L, 65428);
    this.pYk.put(parambcz.uuE + "-" + parambcz.uuH + "-" + parambcz.ovi, paramCharSequence);
    GMTrace.o(8781597507584L, 65428);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/data/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */