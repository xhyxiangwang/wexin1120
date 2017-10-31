package com.tencent.mm.plugin.card.ui.view;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.ui.m;

public abstract class i
{
  m kzR;
  
  public i()
  {
    GMTrace.i(4991691522048L, 37191);
    GMTrace.o(4991691522048L, 37191);
  }
  
  public abstract void MH();
  
  public final void a(m paramm)
  {
    GMTrace.i(4991825739776L, 37192);
    this.kzR = paramm;
    MH();
    GMTrace.o(4991825739776L, 37192);
  }
  
  public void amb()
  {
    GMTrace.i(4992228392960L, 37195);
    GMTrace.o(4992228392960L, 37195);
  }
  
  public void destroy()
  {
    GMTrace.i(4991959957504L, 37193);
    this.kzR = null;
    GMTrace.o(4991959957504L, 37193);
  }
  
  protected final View findViewById(int paramInt)
  {
    GMTrace.i(4992496828416L, 37197);
    View localView = this.kzR.findViewById(paramInt);
    GMTrace.o(4992496828416L, 37197);
    return localView;
  }
  
  protected final String getString(int paramInt)
  {
    GMTrace.i(4992631046144L, 37198);
    String str = this.kzR.getString(paramInt);
    GMTrace.o(4992631046144L, 37198);
    return str;
  }
  
  public void update()
  {
    GMTrace.i(4992094175232L, 37194);
    GMTrace.o(4992094175232L, 37194);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */