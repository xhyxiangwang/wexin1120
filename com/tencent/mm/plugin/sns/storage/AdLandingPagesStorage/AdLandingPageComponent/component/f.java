package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
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

public final class f
  extends i
{
  ImageView fBd;
  ProgressBar jUz;
  boolean qpA;
  
  public f(Context paramContext, ViewGroup paramViewGroup)
  {
    this(paramContext, paramViewGroup, (byte)0);
    GMTrace.i(8224057065472L, 61274);
    GMTrace.o(8224057065472L, 61274);
  }
  
  private f(Context paramContext, ViewGroup paramViewGroup, byte paramByte)
  {
    super(paramContext, null, paramViewGroup);
    GMTrace.i(8224191283200L, 61275);
    this.qpA = true;
    GMTrace.o(8224191283200L, 61275);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8224862371840L, 61280);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8224862371840L, 61280);
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
      GMTrace.o(8224862371840L, 61280);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("AdLandingImageComp", paramJSONObject, "", new Object[0]);
      GMTrace.o(8224862371840L, 61280);
    }
    return false;
  }
  
  protected final int aWs()
  {
    GMTrace.i(8224459718656L, 61277);
    int i = i.g.pOp;
    GMTrace.o(8224459718656L, 61277);
    return i;
  }
  
  public final View biL()
  {
    GMTrace.i(8224325500928L, 61276);
    View localView = this.iiK;
    this.fBd = ((ImageView)localView.findViewById(i.f.pLB));
    this.jUz = ((ProgressBar)localView.findViewById(i.f.cle));
    GMTrace.o(8224325500928L, 61276);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8224593936384L, 61278);
    if ((this.iiK == null) || (this.fBd == null) || (this.jUz == null))
    {
      GMTrace.o(8224593936384L, 61278);
      return;
    }
    if ((m)this.qpH == null)
    {
      GMTrace.o(8224593936384L, 61278);
      return;
    }
    float f1 = ((m)this.qpH).qnq;
    float f2 = ((m)this.qpH).qnr;
    float f3 = ((m)this.qpH).qns;
    float f4 = ((m)this.qpH).qnt;
    String str = ((m)this.qpH).qne;
    float f5 = ((m)this.qpH).height;
    float f6 = ((m)this.qpH).width;
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.fBd.getLayoutParams();
    localLayoutParams.width = ((int)f6);
    localLayoutParams.height = ((int)f5);
    this.fBd.setLayoutParams(localLayoutParams);
    this.qpA = false;
    startLoading();
    d.a(str, ((m)this.qpH).qnp, new d.a()
    {
      public final void Hp(String paramAnonymousString)
      {
        GMTrace.i(8271033270272L, 61624);
        f localf;
        try
        {
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          localf = f.this;
          if (paramAnonymousString == null)
          {
            w.e("AdLandingImageComp", "when set image the bmp is null!");
            GMTrace.o(8271033270272L, 61624);
            return;
          }
          if (localf.fBd == null)
          {
            w.e("AdLandingImageComp", "when set image the imageView is null!");
            GMTrace.o(8271033270272L, 61624);
            return;
          }
        }
        catch (Exception paramAnonymousString)
        {
          w.e("AdLandingImageComp", "%s" + bg.f(paramAnonymousString));
          GMTrace.o(8271033270272L, 61624);
          return;
        }
        if (paramAnonymousString.getWidth() == 0)
        {
          w.e("AdLandingImageComp", "when set image the bmp.getWidth is 0!");
          GMTrace.o(8271033270272L, 61624);
          return;
        }
        localf.fBd.setImageBitmap(paramAnonymousString);
        localf.jUz.setVisibility(8);
        GMTrace.o(8271033270272L, 61624);
      }
      
      public final void biT()
      {
        GMTrace.i(8270764834816L, 61622);
        f.this.startLoading();
        GMTrace.o(8270764834816L, 61622);
      }
      
      public final void biU()
      {
        GMTrace.i(8270899052544L, 61623);
        f.this.jUz.setVisibility(8);
        GMTrace.o(8270899052544L, 61623);
      }
    });
    this.iiK.setPadding((int)f3, (int)f1, (int)f4, (int)f2);
    hT(false);
    GMTrace.o(8224593936384L, 61278);
  }
  
  public final void startLoading()
  {
    GMTrace.i(8224728154112L, 61279);
    this.jUz.setVisibility(0);
    GMTrace.o(8224728154112L, 61279);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */