package com.tencent.mm.plugin.appbrand.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.plugin.appbrand.compat.a.a;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public class WxaShareMessagePage
  extends LinearLayout
  implements b.h
{
  public ImageView jck;
  public TextView jpp;
  public ImageView jpq;
  public IPCDynamicPageView jpr;
  public ThreeDotsLoadingView jps;
  
  public WxaShareMessagePage(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18349979336704L, 136718);
    init(paramContext);
    GMTrace.o(18349979336704L, 136718);
  }
  
  public WxaShareMessagePage(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18350113554432L, 136719);
    init(paramContext);
    GMTrace.o(18350113554432L, 136719);
  }
  
  public WxaShareMessagePage(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18350247772160L, 136720);
    init(paramContext);
    GMTrace.o(18350247772160L, 136720);
  }
  
  public static int ZK()
  {
    GMTrace.i(18351321513984L, 136728);
    int i = c.jF(224);
    GMTrace.o(18351321513984L, 136728);
    return i;
  }
  
  public static int ZL()
  {
    GMTrace.i(18351455731712L, 136729);
    int i = c.jF(180);
    GMTrace.o(18351455731712L, 136729);
    return i;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(18350381989888L, 136721);
    View localView = View.inflate(paramContext, p.g.ivL, this);
    this.jck = ((ImageView)localView.findViewById(p.f.bzD));
    this.jpq = ((ImageView)localView.findViewById(p.f.bEQ));
    this.jpr = ((IPCDynamicPageView)localView.findViewById(p.f.iuR));
    this.jpp = ((TextView)localView.findViewById(p.f.cBJ));
    this.jps = ((ThreeDotsLoadingView)localView.findViewById(p.f.bUq));
    paramContext = ((a)h.h(a.class)).c(paramContext, (ViewGroup)localView);
    ((ViewGroup)localView.findViewById(p.f.byT)).addView(paramContext);
    setGravity(17);
    GMTrace.o(18350381989888L, 136721);
  }
  
  public final void CV()
  {
    GMTrace.i(18350516207616L, 136722);
    GMTrace.o(18350516207616L, 136722);
  }
  
  public final void CW()
  {
    GMTrace.i(18350784643072L, 136724);
    this.jps.setVisibility(4);
    this.jps.Zo();
    this.jck.setImageBitmap(null);
    this.jpq.setVisibility(0);
    GMTrace.o(18350784643072L, 136724);
  }
  
  public final String CX()
  {
    GMTrace.i(18350918860800L, 136725);
    String str = com.tencent.mm.plugin.appbrand.n.g.aP(this);
    GMTrace.o(18350918860800L, 136725);
    return str;
  }
  
  public final void j(Bitmap paramBitmap)
  {
    GMTrace.i(18350650425344L, 136723);
    this.jps.setVisibility(4);
    this.jps.Zo();
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.jck.setImageBitmap(paramBitmap);
      this.jpq.setVisibility(4);
      GMTrace.o(18350650425344L, 136723);
      return;
    }
    this.jck.setImageBitmap(null);
    this.jpq.setVisibility(0);
    GMTrace.o(18350650425344L, 136723);
  }
  
  public final void rM(String paramString)
  {
    GMTrace.i(18351053078528L, 136726);
    this.jps.setVisibility(0);
    this.jps.cgs();
    this.jpq.setVisibility(4);
    this.jck.setVisibility(0);
    b.CT().a(this, paramString, null, ((com.tencent.mm.modelappbrand.g)h.h(com.tencent.mm.modelappbrand.g.class)).aL(112, 90));
    GMTrace.o(18351053078528L, 136726);
  }
  
  public final void s(Bitmap paramBitmap)
  {
    GMTrace.i(18351187296256L, 136727);
    this.jck.setVisibility(0);
    this.jps.setVisibility(4);
    this.jpq.setVisibility(4);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      b.f localf = ((com.tencent.mm.modelappbrand.g)h.h(com.tencent.mm.modelappbrand.g.class)).CJ();
      this.jck.setImageBitmap(localf.k(paramBitmap));
      GMTrace.o(18351187296256L, 136727);
      return;
    }
    this.jck.setImageBitmap(null);
    GMTrace.o(18351187296256L, 136727);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/share/widget/WxaShareMessagePage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */