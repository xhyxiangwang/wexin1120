package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.gmtrace.GMTrace;

public final class r
  extends p
{
  public r(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17640907079680L, 131435);
    GMTrace.o(17640907079680L, 131435);
  }
  
  public final View abI()
  {
    GMTrace.i(18253074137088L, 135996);
    u localu = u.bW(this);
    GMTrace.o(18253074137088L, 135996);
    return localu;
  }
  
  public final void ack()
  {
    GMTrace.i(18253342572544L, 135998);
    ac.cb(this).restartInput(this);
    GMTrace.o(18253342572544L, 135998);
  }
  
  public final void cS(boolean paramBoolean)
  {
    GMTrace.i(18253208354816L, 135997);
    acD();
    int i = getInputType() | 0x1;
    if (paramBoolean) {
      i |= 0x80;
    }
    for (;;)
    {
      setInputType(i);
      super.cS(paramBoolean);
      acE();
      GMTrace.o(18253208354816L, 135997);
      return;
      i &= 0xFF7F;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */