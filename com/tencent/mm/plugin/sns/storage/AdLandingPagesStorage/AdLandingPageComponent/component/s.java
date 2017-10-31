package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class s
  extends i
  implements SensorEventListener
{
  private SensorManager aEb;
  Sensor aHM;
  Sensor aHO;
  ImageView fBd;
  ProgressBar jUz;
  int qqN;
  final float qqO;
  final int qqP;
  HorizontalScrollView qqQ;
  float[] qqR;
  float[] qqS;
  private int qqT;
  boolean qqU;
  
  public s(Context paramContext, l paraml, ViewGroup paramViewGroup)
  {
    super(paramContext, paraml, paramViewGroup);
    GMTrace.i(8233318088704L, 61343);
    this.qqO = 10.0F;
    this.qqP = 1;
    this.qqT = 0;
    this.qqU = true;
    GMTrace.o(8233318088704L, 61343);
  }
  
  public final void J(Bitmap paramBitmap)
  {
    GMTrace.i(8233989177344L, 61348);
    if (paramBitmap == null)
    {
      w.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp is null!");
      GMTrace.o(8233989177344L, 61348);
      return;
    }
    if (this.fBd == null)
    {
      w.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the imageView is null!");
      GMTrace.o(8233989177344L, 61348);
      return;
    }
    if (paramBitmap.getHeight() == 0)
    {
      w.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "when set image the bmp.getHeight is 0!");
      GMTrace.o(8233989177344L, 61348);
      return;
    }
    this.jUz.setVisibility(8);
    this.fBd.setImageBitmap(paramBitmap);
    WindowManager localWindowManager = (WindowManager)this.context.getSystemService("window");
    final int i = localWindowManager.getDefaultDisplay().getWidth();
    int j = localWindowManager.getDefaultDisplay().getHeight();
    this.fBd.setLayoutParams(new RelativeLayout.LayoutParams(paramBitmap.getWidth() * j / paramBitmap.getHeight(), j));
    this.fBd.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8265932996608L, 61586);
        int i = s.this.fBd.getMeasuredWidth();
        if (i > i)
        {
          s.this.qqN = ((i - i) / 2);
          s.this.qqQ.scrollBy(s.this.qqN, 0);
        }
        GMTrace.o(8265932996608L, 61586);
      }
    });
    if (paramBitmap.getHeight() != 0) {
      this.iiK.setLayoutParams(new LinearLayout.LayoutParams(paramBitmap.getWidth() * j / paramBitmap.getHeight(), j));
    }
    GMTrace.o(8233989177344L, 61348);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8234660265984L, 61353);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(8234660265984L, 61353);
      return false;
    }
    try
    {
      paramJSONObject.put("swipeCount", this.qqT);
      if (!this.qqU)
      {
        String str = aa.QW(((l)this.qpH).qne);
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("urlMd5", str);
        localJSONObject.put("needDownload", 1);
        paramJSONObject.put("imgUrlInfo", localJSONObject);
      }
      GMTrace.o(8234660265984L, 61353);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", paramJSONObject, "", new Object[0]);
      GMTrace.o(8234660265984L, 61353);
    }
    return false;
  }
  
  protected final int aWs()
  {
    GMTrace.i(8233452306432L, 61344);
    int i = i.g.pOm;
    GMTrace.o(8233452306432L, 61344);
    return i;
  }
  
  public final View biL()
  {
    GMTrace.i(8233586524160L, 61345);
    View localView = this.iiK;
    this.aEb = ((SensorManager)this.context.getSystemService("sensor"));
    this.aHM = this.aEb.getDefaultSensor(1);
    this.aHO = this.aEb.getDefaultSensor(2);
    this.qqQ = ((HorizontalScrollView)localView.findViewById(i.f.pHO));
    this.fBd = ((ImageView)localView.findViewById(i.f.pHP));
    this.jUz = ((ProgressBar)localView.findViewById(i.f.cle));
    this.jUz.setVisibility(8);
    GMTrace.o(8233586524160L, 61345);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8233720741888L, 61346);
    if (!e.aZ(d.dz("adId", ((l)this.qpH).qne))) {
      this.qqU = false;
    }
    this.qqQ.setLayoutParams(new RelativeLayout.LayoutParams(this.kic, this.kid));
    this.fBd.setLayoutParams(new RelativeLayout.LayoutParams(this.kic, this.kid));
    this.iiK.setLayoutParams(new LinearLayout.LayoutParams(this.kic, this.kid));
    this.iiK.setPadding(this.iiK.getPaddingLeft(), (int)((l)this.qpH).qnq, this.iiK.getPaddingRight(), (int)((l)this.qpH).qnr);
    String str = ((l)this.qpH).qne;
    Bitmap localBitmap = d.dB("adId", str);
    if (localBitmap != null)
    {
      w.i("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "loaded cached image with  " + str);
      J(localBitmap);
      GMTrace.o(8233720741888L, 61346);
      return;
    }
    startLoading();
    d.a(str, ((l)this.qpH).qnp, new d.a()
    {
      public final void Hp(String paramAnonymousString)
      {
        GMTrace.i(8267677827072L, 61599);
        try
        {
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          s.this.J(paramAnonymousString);
          GMTrace.o(8267677827072L, 61599);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "%s" + bg.f(paramAnonymousString));
          GMTrace.o(8267677827072L, 61599);
        }
      }
      
      public final void biT()
      {
        GMTrace.i(8267409391616L, 61597);
        s.this.startLoading();
        GMTrace.o(8267409391616L, 61597);
      }
      
      public final void biU()
      {
        GMTrace.i(8267543609344L, 61598);
        s.this.jUz.setVisibility(8);
        GMTrace.o(8267543609344L, 61598);
      }
    });
    GMTrace.o(8233720741888L, 61346);
  }
  
  public final void biv()
  {
    GMTrace.i(8234391830528L, 61351);
    super.biv();
    this.aEb.registerListener(this, this.aHM, 1);
    this.aEb.registerListener(this, this.aHO, 1);
    GMTrace.o(8234391830528L, 61351);
  }
  
  public final void biw()
  {
    GMTrace.i(8234526048256L, 61352);
    super.biw();
    this.aEb.unregisterListener(this);
    GMTrace.o(8234526048256L, 61352);
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    GMTrace.i(8234257612800L, 61350);
    GMTrace.o(8234257612800L, 61350);
  }
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float f2 = -10.0F;
    GMTrace.i(8234123395072L, 61349);
    if (paramSensorEvent.sensor.getType() == 1) {
      this.qqR = paramSensorEvent.values;
    }
    if (paramSensorEvent.sensor.getType() == 2) {
      this.qqS = paramSensorEvent.values;
    }
    float f1;
    if ((this.qqR != null) && (this.qqS != null))
    {
      paramSensorEvent = new float[9];
      if (SensorManager.getRotationMatrix(paramSensorEvent, new float[9], this.qqR, this.qqS))
      {
        float[] arrayOfFloat = new float[3];
        SensorManager.getOrientation(paramSensorEvent, arrayOfFloat);
        float f3 = arrayOfFloat[2];
        if (this.qqN != 0)
        {
          f1 = f3;
          if (f3 > 10.0F) {
            f1 = 10.0F;
          }
          if (f1 >= -10.0F) {
            break label169;
          }
          f1 = f2;
        }
      }
    }
    label169:
    for (;;)
    {
      f1 = f1 * this.qqN / 10.0F;
      this.qqQ.scrollBy((int)f1, 0);
      GMTrace.o(8234123395072L, 61349);
      return;
    }
  }
  
  public final void startLoading()
  {
    GMTrace.i(8233854959616L, 61347);
    this.jUz.setVisibility(0);
    GMTrace.o(8233854959616L, 61347);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */