package com.tencent.mm.plugin.appbrand.ui.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.g.a.iu;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;

public final class c
  extends com.tencent.mm.pluginsdk.ui.b.b
  implements View.OnClickListener, e
{
  private static boolean jtv;
  public View jto;
  private TextView jtp;
  public ImageView jtq;
  public String jtr;
  public Drawable jts;
  private final Runnable jtt;
  private final b.h jtu;
  
  static
  {
    GMTrace.i(15520938065920L, 115640);
    jtv = false;
    GMTrace.o(15520938065920L, 115640);
  }
  
  private c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(15518656364544L, 115623);
    this.jtt = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17311805210624L, 128983);
        c.this.jtr = null;
        c.this.jtq.setImageDrawable(c.this.jts);
        if ((c.this.jto != null) && (c.this.jto.getVisibility() == 0)) {}
        for (int i = 1;; i = 0)
        {
          boolean bool = c.this.aaz();
          if ((i == 0) && (bool)) {
            com.tencent.mm.sdk.b.a.uLm.m(new iu());
          }
          GMTrace.o(17311805210624L, 128983);
          return;
        }
      }
    };
    this.jtu = new b.h()
    {
      public final void CV()
      {
        GMTrace.i(17315160653824L, 129008);
        if (c.this.jtq != null) {
          c.this.jtq.setImageDrawable(c.this.jts);
        }
        GMTrace.o(17315160653824L, 129008);
      }
      
      public final void CW()
      {
        GMTrace.i(17315429089280L, 129010);
        GMTrace.o(17315429089280L, 129010);
      }
      
      public final String CX()
      {
        GMTrace.i(17315563307008L, 129011);
        GMTrace.o(17315563307008L, 129011);
        return "AppBrandChattingBannerLoadTarget";
      }
      
      public final void j(Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(17315294871552L, 129009);
        if (c.this.jtq == null)
        {
          GMTrace.o(17315294871552L, 129009);
          return;
        }
        int i = com.tencent.mm.bq.a.fromDPToPix(c.this.jtq.getContext(), 5);
        paramAnonymousBitmap = new LayerDrawable(new Drawable[] { new BitmapDrawable(c.this.jtq.getContext().getResources(), paramAnonymousBitmap) });
        paramAnonymousBitmap.setLayerInset(0, i, i, i, i);
        c.this.jtq.setImageDrawable(paramAnonymousBitmap);
        GMTrace.o(17315294871552L, 129009);
      }
    };
    if (getView() != null)
    {
      getView().setOnClickListener(this);
      ((d)h.h(d.class)).a(this);
      this.jto = ((ViewGroup)getView()).getChildAt(0);
      this.jtp = ((TextView)getView().findViewById(R.h.bsJ));
      this.jtq = ((ImageView)getView().findViewById(R.h.bsI));
      if (this.jtq != null)
      {
        paramContext = this.jtq;
        Drawable localDrawable = com.tencent.mm.svg.a.a.c(this.jtq.getResources(), R.k.dlo);
        this.jts = localDrawable;
        paramContext.setImageDrawable(localDrawable);
      }
      setVisibility(8);
    }
    GMTrace.o(15518656364544L, 115623);
  }
  
  public static void aaA()
  {
    GMTrace.i(17317979226112L, 129029);
    jtv = false;
    GMTrace.o(17317979226112L, 129029);
  }
  
  public static c bS(Context paramContext)
  {
    GMTrace.i(19504922886144L, 145323);
    paramContext = new c(paramContext);
    GMTrace.o(19504922886144L, 145323);
    return paramContext;
  }
  
  public final void X(String paramString, int paramInt)
  {
    GMTrace.i(17318113443840L, 129030);
    af.u(this.jtt);
    GMTrace.o(17318113443840L, 129030);
  }
  
  public final boolean aaz()
  {
    GMTrace.i(15518924800000L, 115625);
    if (!jtv)
    {
      ((d)h.h(d.class)).b(this);
      ((d)h.h(d.class)).aav();
      ((d)h.h(d.class)).a(this);
      jtv = true;
    }
    Object localObject2 = BannerModel.aaD();
    if ((localObject2 != null) && (!bg.mZ(((BannerModel)localObject2).appId)))
    {
      Object localObject1 = ((BannerModel)localObject2).appName;
      String str = ((BannerModel)localObject2).jtM;
      localObject2 = ((BannerModel)localObject2).jpi;
      if (bg.mZ(str)) {}
      while (bg.mZ((String)localObject1))
      {
        GMTrace.o(15518924800000L, 115625);
        return false;
        localObject1 = str;
      }
      setVisibility(0);
      if (this.jtp != null) {
        this.jtp.setText((CharSequence)localObject1);
      }
      if (!bg.mZ((String)localObject2))
      {
        localObject1 = null;
        if (!bg.mZ(this.jtr)) {
          localObject1 = com.tencent.mm.modelappbrand.a.b.CT().hg(this.jtr);
        }
        if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
          break label202;
        }
        this.jtu.j((Bitmap)localObject1);
      }
      for (;;)
      {
        GMTrace.o(15518924800000L, 115625);
        return true;
        label202:
        this.jtr = com.tencent.mm.modelappbrand.a.b.CT().a(this.jtu, (String)localObject2, com.tencent.mm.modelappbrand.a.e.hkj);
      }
    }
    setVisibility(8);
    GMTrace.o(15518924800000L, 115625);
    return false;
  }
  
  public final void destroy()
  {
    GMTrace.i(15519193235456L, 115627);
    if (this.jto != null)
    {
      ((ViewGroup)this.jto).removeAllViews();
      this.jto.setVisibility(8);
    }
    this.jto = null;
    this.jtp = null;
    this.jtq = null;
    ((d)h.h(d.class)).b(this);
    GMTrace.o(15519193235456L, 115627);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(15518790582272L, 115624);
    int i = R.i.cOY;
    GMTrace.o(15518790582272L, 115624);
    return i;
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(15519327453184L, 115628);
    Object localObject = BannerModel.aaD();
    if (localObject == null)
    {
      GMTrace.o(15519327453184L, 115628);
      return;
    }
    String str = ((BannerModel)localObject).appId;
    int i = ((BannerModel)localObject).iQS;
    if (bg.mZ(str))
    {
      aaz();
      GMTrace.o(15519327453184L, 115628);
      return;
    }
    localObject = new AppBrandStatObject();
    ((AppBrandStatObject)localObject).scene = 1022;
    ((com.tencent.mm.plugin.appbrand.k.c)h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(paramView.getContext(), null, str, i, -1, null, (AppBrandStatObject)localObject);
    GMTrace.o(15519327453184L, 115628);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(15519059017728L, 115626);
    if (this.jto != null) {
      this.jto.setVisibility(paramInt);
    }
    GMTrace.o(15519059017728L, 115626);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/banner/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */