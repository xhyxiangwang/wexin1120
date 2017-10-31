package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class u
  extends a
{
  private ImageView fBd;
  ProgressBar jUz;
  private int kic;
  private int kid;
  boolean qnb;
  boolean qpA;
  private WindowManager qra;
  
  public u(Context paramContext, m paramm, ViewGroup paramViewGroup)
  {
    super(paramContext, paramm, paramViewGroup);
    GMTrace.i(8229694210048L, 61316);
    this.qpA = true;
    GMTrace.o(8229694210048L, 61316);
  }
  
  public final boolean K(Bitmap paramBitmap)
  {
    GMTrace.i(8230365298688L, 61321);
    if (paramBitmap == null)
    {
      w.e("AdLandingPagePureImageComponet", "when set image the bmp is null!");
      GMTrace.o(8230365298688L, 61321);
      return false;
    }
    if (this.fBd == null)
    {
      w.e("AdLandingPagePureImageComponet", "when set image the imageView is null!");
      GMTrace.o(8230365298688L, 61321);
      return false;
    }
    if (paramBitmap.getWidth() == 0)
    {
      w.e("AdLandingPagePureImageComponet", "when set image the bmp.getWidth is 0!");
      GMTrace.o(8230365298688L, 61321);
      return false;
    }
    this.fBd.setImageBitmap(paramBitmap);
    this.jUz.setVisibility(8);
    GMTrace.o(8230365298688L, 61321);
    return true;
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8230499516416L, 61322);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8230499516416L, 61322);
      return false;
    }
    try
    {
      if (!this.qpA)
      {
        String str = aa.QW(((m)this.qpH).qne);
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("urlMd5", str);
        localJSONObject.put("needDownload", 1);
        paramJSONObject.put("imgUrlInfo", localJSONObject);
      }
      GMTrace.o(8230499516416L, 61322);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("AdLandingPagePureImageComponet", paramJSONObject, "", new Object[0]);
      GMTrace.o(8230499516416L, 61322);
    }
    return false;
  }
  
  protected final int aWs()
  {
    GMTrace.i(8229828427776L, 61317);
    int i = i.g.pOt;
    GMTrace.o(8229828427776L, 61317);
    return i;
  }
  
  public final View biL()
  {
    GMTrace.i(8229962645504L, 61318);
    this.fBd = ((ImageView)this.iiK.findViewById(i.f.pLB));
    this.jUz = ((ProgressBar)this.iiK.findViewById(i.f.cle));
    View localView = this.iiK;
    GMTrace.o(8229962645504L, 61318);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8230096863232L, 61319);
    if ((this.iiK == null) || (this.fBd == null) || (this.jUz == null))
    {
      GMTrace.o(8230096863232L, 61319);
      return;
    }
    if ((m)this.qpH == null)
    {
      GMTrace.o(8230096863232L, 61319);
      return;
    }
    if (this.qra == null)
    {
      this.qra = ((WindowManager)this.context.getSystemService("window"));
      this.kic = this.qra.getDefaultDisplay().getWidth();
      this.kid = this.qra.getDefaultDisplay().getHeight();
    }
    float f1 = ((m)this.qpH).qns;
    float f2 = ((m)this.qpH).qnt;
    String str = ((m)this.qpH).qne;
    float f3 = ((m)this.qpH).height;
    float f4 = ((m)this.qpH).width;
    this.qnb = ((m)this.qpH).qnb;
    if ((f3 != 0.0F) && (f4 != 0.0F) && (!this.qnb)) {
      this.fBd.setLayoutParams(new RelativeLayout.LayoutParams(this.kic - (int)f1 - (int)f2, (this.kic - (int)f1 - (int)f2) * (int)f3 / (int)f4));
    }
    for (;;)
    {
      Bitmap localBitmap = d.dB("adId", str);
      if ((localBitmap == null) || (!K(localBitmap))) {
        break;
      }
      w.i("AdLandingPagePureImageComponet", "loaded cached image with  " + str);
      this.qpA = true;
      GMTrace.o(8230096863232L, 61319);
      return;
      if ((this.qnb) && (f3 != 0.0F) && (f4 != 0.0F)) {
        this.fBd.setLayoutParams(new RelativeLayout.LayoutParams(this.kic, this.kid));
      } else {
        this.fBd.setLayoutParams(new RelativeLayout.LayoutParams(this.kic, this.kid));
      }
    }
    this.qpA = false;
    startLoading();
    d.a(str, ((m)this.qpH).qnp, new d.a()
    {
      public final void Hp(String paramAnonymousString)
      {
        GMTrace.i(8242847547392L, 61414);
        try
        {
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          u.this.K(paramAnonymousString);
          GMTrace.o(8242847547392L, 61414);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("AdLandingPagePureImageComponet", "%s" + bg.f(paramAnonymousString));
          GMTrace.o(8242847547392L, 61414);
        }
      }
      
      public final void biT()
      {
        GMTrace.i(8242579111936L, 61412);
        u.this.startLoading();
        GMTrace.o(8242579111936L, 61412);
      }
      
      public final void biU()
      {
        GMTrace.i(8242713329664L, 61413);
        u.this.jUz.setVisibility(8);
        GMTrace.o(8242713329664L, 61413);
      }
    });
    GMTrace.o(8230096863232L, 61319);
  }
  
  public final void startLoading()
  {
    GMTrace.i(8230231080960L, 61320);
    this.jUz.setVisibility(0);
    GMTrace.o(8230231080960L, 61320);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */