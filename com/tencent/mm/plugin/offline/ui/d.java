package com.tencent.mm.plugin.offline.ui;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ql;
import com.tencent.mm.plugin.offline.i;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ae;

public final class d
  extends c<ql>
{
  private ae mHandler;
  
  public d()
  {
    GMTrace.i(6208643661824L, 46258);
    this.mHandler = new ae(Looper.getMainLooper());
    this.uLu = ql.class.getName().hashCode();
    GMTrace.o(6208643661824L, 46258);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */