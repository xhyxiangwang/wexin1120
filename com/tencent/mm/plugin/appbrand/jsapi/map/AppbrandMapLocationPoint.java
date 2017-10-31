package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;

public class AppbrandMapLocationPoint
  extends LinearLayout
{
  ImageView iWY;
  double iWZ;
  double iXa;
  double iXb;
  double iXc;
  private Context mContext;
  
  public AppbrandMapLocationPoint(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10445092028416L, 77822);
    this.iWZ = -1.0D;
    this.iXa = -1.0D;
    this.iXb = -1.0D;
    this.iXc = -1.0D;
    this.mContext = paramContext;
    init();
    GMTrace.o(10445092028416L, 77822);
  }
  
  public AppbrandMapLocationPoint(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10444957810688L, 77821);
    this.iWZ = -1.0D;
    this.iXa = -1.0D;
    this.iXb = -1.0D;
    this.iXc = -1.0D;
    this.mContext = paramContext;
    init();
    GMTrace.o(10444957810688L, 77821);
  }
  
  private void init()
  {
    GMTrace.i(10445226246144L, 77823);
    this.iWY = ((ImageView)View.inflate(this.mContext, p.g.ivg, this).findViewById(p.f.iuP));
    this.iWY.requestFocus();
    GMTrace.o(10445226246144L, 77823);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/AppbrandMapLocationPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */