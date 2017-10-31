package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ae.m;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public class WxaBindBizInfoView
  extends LinearLayout
{
  private static int jAj;
  private static int jAk;
  public List<WxaAttributes.WxaEntryInfo> jAc;
  private View jAd;
  private ImageView jAe;
  private TextView jAf;
  private LinearLayout jAg;
  private ViewGroup jAh;
  private View jAi;
  private TextView jpp;
  
  static
  {
    GMTrace.i(15417053544448L, 114866);
    jAj = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 15);
    jAk = com.tencent.mm.bq.a.fromDPToPix(ab.getContext(), 30);
    GMTrace.o(15417053544448L, 114866);
  }
  
  public WxaBindBizInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15416382455808L, 114861);
    init();
    GMTrace.o(15416382455808L, 114861);
  }
  
  public WxaBindBizInfoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15416248238080L, 114860);
    init();
    GMTrace.o(15416248238080L, 114860);
  }
  
  private static void a(WxaAttributes.WxaEntryInfo paramWxaEntryInfo, ImageView paramImageView, TextView paramTextView)
  {
    GMTrace.i(17274761117696L, 128707);
    if (paramWxaEntryInfo == null)
    {
      GMTrace.o(17274761117696L, 128707);
      return;
    }
    Object localObject = paramWxaEntryInfo.username;
    if (paramImageView != null)
    {
      paramImageView.setTag(localObject);
      localObject = m.iJ(paramWxaEntryInfo.username);
      if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
        break label83;
      }
      paramImageView.setImageBitmap((Bitmap)localObject);
    }
    for (;;)
    {
      if (paramTextView != null) {
        paramTextView.setText(bg.mY(paramWxaEntryInfo.title));
      }
      GMTrace.o(17274761117696L, 128707);
      return;
      label83:
      b.CT().a(paramImageView, paramWxaEntryInfo.iconUrl, com.tencent.mm.modelappbrand.a.a.CS(), e.hkj);
    }
  }
  
  private void init()
  {
    GMTrace.i(15416516673536L, 114862);
    this.jAc = new LinkedList();
    View localView = View.inflate(getContext(), p.g.ivn, this);
    this.jAd = localView.findViewById(p.f.bIC);
    this.jAe = ((ImageView)localView.findViewById(p.f.bOU));
    this.jpp = ((TextView)localView.findViewById(p.f.cBx));
    this.jAf = ((TextView)localView.findViewById(p.f.bzm));
    this.jAi = localView.findViewById(p.f.cdu);
    this.jAg = ((LinearLayout)localView.findViewById(p.f.byU));
    this.jAh = ((ViewGroup)localView.findViewById(p.f.bRy));
    GMTrace.o(15416516673536L, 114862);
  }
  
  public final void cL(boolean paramBoolean)
  {
    GMTrace.i(15416650891264L, 114863);
    if (this.jAh.getMeasuredWidth() == 0)
    {
      if (paramBoolean) {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            GMTrace.i(15436917768192L, 115014);
            WxaBindBizInfoView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            WxaBindBizInfoView.a(WxaBindBizInfoView.this);
            GMTrace.o(15436917768192L, 115014);
            return true;
          }
        });
      }
      GMTrace.o(15416650891264L, 114863);
      return;
    }
    Object localObject = null;
    int j;
    int k;
    int i;
    if (this.jAc.isEmpty())
    {
      setVisibility(8);
      if (localObject != null) {
        a((WxaAttributes.WxaEntryInfo)localObject, this.jAe, this.jpp);
      }
      this.jAf.setText(getContext().getString(p.i.dLV, new Object[] { Integer.valueOf(this.jAc.size()) }));
      localObject = this.jAc;
      this.jAg.removeAllViews();
      if (((List)localObject).isEmpty()) {
        break label382;
      }
      j = ((List)localObject).size();
      k = this.jAh.getMeasuredWidth() - this.jAh.getPaddingLeft() - this.jAh.getPaddingRight();
      i = k / (jAk + jAj);
      if (i <= j) {
        break label326;
      }
      this.jAi.setVisibility(8);
    }
    for (;;)
    {
      j = Math.min(i, j);
      if (j <= 1) {
        break label356;
      }
      i = 0;
      while (i < j)
      {
        WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)((List)localObject).get(i);
        ImageView localImageView = new ImageView(getContext());
        localImageView.setLayoutParams(new ViewGroup.LayoutParams(jAk + jAj, jAk));
        localImageView.setPadding(0, 0, jAj, 0);
        this.jAg.addView(localImageView);
        a(localWxaEntryInfo, localImageView, null);
        i += 1;
      }
      setVisibility(0);
      localObject = (WxaAttributes.WxaEntryInfo)this.jAc.get(0);
      break;
      label326:
      this.jAi.setVisibility(0);
      i = (k - this.jAi.getMeasuredWidth()) / (jAk + jAj);
    }
    label356:
    w.i("MicroMsg.WxaBindBizInfoView", "attachItemToContainer(size : %s)", new Object[] { Integer.valueOf(((List)localObject).size()) });
    label382:
    if (this.jAc.size() == 1)
    {
      this.jAd.setVisibility(0);
      this.jAh.setTag(((WxaAttributes.WxaEntryInfo)this.jAc.get(0)).username);
      GMTrace.o(15416650891264L, 114863);
      return;
    }
    this.jAd.setVisibility(8);
    this.jAh.setTag(null);
    GMTrace.o(15416650891264L, 114863);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/WxaBindBizInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */