package com.tencent.mm.plugin.webview.c;

import android.view.MenuItem;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.plugin.webview.model.z;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.a;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.widget.e;
import com.tencent.mm.ui.widget.e.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a
{
  private static final a sjc;
  public Map<Integer, e> sja;
  public c sjb;
  
  static
  {
    GMTrace.i(19471502671872L, 145074);
    sjc = new a();
    GMTrace.o(19471502671872L, 145074);
  }
  
  private a()
  {
    GMTrace.i(19471368454144L, 145073);
    this.sja = new HashMap();
    c.a locala = new c.a();
    locala.hCP = true;
    locala.hCO = true;
    this.sjb = locala.Jk();
    GMTrace.o(19471368454144L, 145073);
  }
  
  public static a bzI()
  {
    GMTrace.i(19471234236416L, 145072);
    a locala = sjc;
    GMTrace.o(19471234236416L, 145072);
    return locala;
  }
  
  public static abstract interface a
  {
    public abstract void dC(int paramInt1, int paramInt2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */