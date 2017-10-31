package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class b
{
  View Vc;
  ThreeDotsLoadingView juM;
  View juN;
  View juO;
  
  b(Context paramContext, ViewGroup paramViewGroup)
  {
    GMTrace.i(16367046623232L, 121944);
    this.Vc = LayoutInflater.from(paramContext).inflate(p.g.ivp, paramViewGroup, false);
    this.juM = ((ThreeDotsLoadingView)this.Vc.findViewById(p.f.bUq));
    this.juN = this.Vc.findViewById(p.f.itZ);
    this.juO = this.Vc.findViewById(p.f.itY);
    GMTrace.o(16367046623232L, 121944);
  }
  
  final void setLoading(boolean paramBoolean)
  {
    GMTrace.i(16366912405504L, 121943);
    if (paramBoolean)
    {
      if (this.juM != null)
      {
        this.juM.setVisibility(0);
        this.juM.cgs();
      }
      if (this.juO != null)
      {
        this.juO.setVisibility(8);
        GMTrace.o(16366912405504L, 121943);
      }
    }
    else
    {
      if (this.juM != null)
      {
        this.juM.Zo();
        this.juM.setVisibility(8);
      }
      if (this.juO != null) {
        this.juO.setVisibility(0);
      }
    }
    GMTrace.o(16366912405504L, 121943);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */