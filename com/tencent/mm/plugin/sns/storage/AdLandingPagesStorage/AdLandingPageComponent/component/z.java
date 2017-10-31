package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class z
  extends a
{
  private static final int qrT;
  public CountDownLatch lqM;
  private RadarChart qrU;
  public Bitmap qrV;
  public Bitmap qrW;
  
  static
  {
    GMTrace.i(8244995031040L, 61430);
    qrT = Color.parseColor("#26eae9e2");
    GMTrace.o(8244995031040L, 61430);
  }
  
  public z(Context paramContext, v paramv, ViewGroup paramViewGroup)
  {
    super(paramContext, paramv, paramViewGroup);
    GMTrace.i(8243518636032L, 61419);
    GMTrace.o(8243518636032L, 61419);
  }
  
  private static void a(Spannable paramSpannable, int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    GMTrace.i(8244055506944L, 61423);
    int i = 0;
    while (i < 2)
    {
      paramSpannable.setSpan(paramVarArgs[i], paramInt1, paramInt2, 18);
      i += 1;
    }
    GMTrace.o(8244055506944L, 61423);
  }
  
  public final void a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    GMTrace.i(16042910810112L, 119529);
    Object localObject1 = (v)biJ();
    Object localObject2 = this.qrU;
    ((RadarChart)localObject2).qoK = 0;
    ((RadarChart)localObject2).qoM = null;
    ((RadarChart)localObject2).qoD = null;
    ((RadarChart)localObject2).qoB = null;
    this.qrU.qoL = 5;
    localObject2 = new c();
    ((c)localObject2).qog = 0;
    int i = Color.parseColor(((v)localObject1).qnQ);
    ((c)localObject2).backgroundColor = (0x55FFFFFF & i);
    ((c)localObject2).qol = qrT;
    ((c)localObject2).qop = 1.0F;
    ((c)localObject2).qoA = paramBitmap2;
    ((c)localObject2).qom = qrT;
    ((c)localObject2).qon = qrT;
    ((c)localObject2).qoo = com.tencent.mm.bq.a.fromDPToPix(this.context, 1);
    ((c)localObject2).qoq = -1;
    ((c)localObject2).qos = 30.0F;
    ((c)localObject2).qor = 40.0F;
    ((c)localObject2).qow = paramBitmap1;
    ((c)localObject2).qox = ((v)localObject1).qnP;
    ((c)localObject2).qoy = Color.parseColor("#7feae9e2");
    ((c)localObject2).qoz = com.tencent.mm.bq.a.fromDPToPix(this.context, 1);
    paramBitmap1 = this.qrU;
    paramBitmap1.qoC = ((c)localObject2);
    if (paramBitmap1.qoE != null)
    {
      paramBitmap1 = paramBitmap1.qoE;
      paramBitmap1.qoO = ((c)localObject2);
      paramBitmap1.invalidate();
    }
    Object localObject3 = new b();
    ((b)localObject3).qoa = qrT;
    ((b)localObject3).qob = 1.0F;
    ((b)localObject3).qoc = (i & 0x7FFFFFFF);
    ((b)localObject3).qod = 127;
    ((b)localObject3).qoe = Color.parseColor("#00fcff");
    ((b)localObject3).qof = com.tencent.mm.bq.a.fromDPToPix(this.context, 2);
    paramBitmap1 = new ForegroundColorSpan(((v)localObject1).qnR);
    paramBitmap2 = new ForegroundColorSpan(((v)localObject1).qnT);
    localObject2 = new AbsoluteSizeSpan(((v)localObject1).qnS);
    AbsoluteSizeSpan localAbsoluteSizeSpan = new AbsoluteSizeSpan(((v)localObject1).qnU);
    localObject3 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a((b)localObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    localObject1 = ((v)localObject1).piV.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      v.a locala = (v.a)((Iterator)localObject1).next();
      if (locala != null)
      {
        localStringBuilder.delete(0, localStringBuilder.length());
        localStringBuilder.append(locala.label).append(":").append(locala.qnW);
        SpannableString localSpannableString = new SpannableString(localStringBuilder.toString());
        a(localSpannableString, 0, locala.label.length() + 1, new Object[] { paramBitmap1, localObject2 });
        a(localSpannableString, locala.label.length() + 1, localStringBuilder.length(), new Object[] { paramBitmap2, localAbsoluteSizeSpan });
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a)localObject3).put(localSpannableString, Float.valueOf(locala.value));
      }
    }
    paramBitmap1 = new ArrayList();
    paramBitmap1.add(localObject3);
    try
    {
      this.qrU.a((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a[])paramBitmap1.toArray(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a[paramBitmap1.size()]));
      this.qrU.qoJ = 2;
      GMTrace.o(16042910810112L, 119529);
      return;
    }
    catch (Exception paramBitmap1)
    {
      for (;;)
      {
        Log.getStackTraceString(paramBitmap1);
      }
    }
  }
  
  protected final int aWs()
  {
    GMTrace.i(8243921289216L, 61422);
    int i = i.g.pOl;
    GMTrace.o(8243921289216L, 61422);
    return i;
  }
  
  public final View biL()
  {
    GMTrace.i(8243652853760L, 61420);
    this.qrU = ((RadarChart)this.iiK.findViewById(i.f.pJl));
    View localView = this.iiK;
    GMTrace.o(8243652853760L, 61420);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8243787071488L, 61421);
    this.lqM = new CountDownLatch(2);
    e.b(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8259758981120L, 61540);
        try
        {
          z.this.lqM.await();
          z.this.iiK.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8253719183360L, 61495);
              z.this.a(z.this.qrV, z.this.qrW);
              GMTrace.o(8253719183360L, 61495);
            }
          });
          GMTrace.o(8259758981120L, 61540);
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;) {}
        }
      }
    }, "AdlandingRadarComp").start();
    v localv = (v)biJ();
    if (localv != null)
    {
      d.a(localv.qnO, localv.qnp, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(8272375447552L, 61634);
          try
          {
            paramAnonymousString = MMBitmapFactory.decodeFile(paramAnonymousString);
            z.this.qrV = paramAnonymousString;
            z.this.lqM.countDown();
            GMTrace.o(8272375447552L, 61634);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e("AdlandingRadarChartComp", "%s" + bg.f(paramAnonymousString));
            GMTrace.o(8272375447552L, 61634);
          }
        }
        
        public final void biT()
        {
          GMTrace.i(8272107012096L, 61632);
          GMTrace.o(8272107012096L, 61632);
        }
        
        public final void biU()
        {
          GMTrace.i(8272241229824L, 61633);
          z.this.qrV = null;
          z.this.lqM.countDown();
          GMTrace.o(8272241229824L, 61633);
        }
      });
      d.a(localv.qnV, localv.qnp, new d.a()
      {
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(8252108570624L, 61483);
          try
          {
            z.this.qrW = MMBitmapFactory.decodeFile(paramAnonymousString);
            z.this.lqM.countDown();
            GMTrace.o(8252108570624L, 61483);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e("AdlandingRadarChartComp", "%s" + bg.f(paramAnonymousString));
            GMTrace.o(8252108570624L, 61483);
          }
        }
        
        public final void biT()
        {
          GMTrace.i(8251840135168L, 61481);
          GMTrace.o(8251840135168L, 61481);
        }
        
        public final void biU()
        {
          GMTrace.i(8251974352896L, 61482);
          z.this.qrW = null;
          z.this.lqM.countDown();
          GMTrace.o(8251974352896L, 61482);
        }
      });
      GMTrace.o(8243787071488L, 61421);
      return;
    }
    Log.wtf("AdlandingRadarChartComp", "null info");
    GMTrace.o(8243787071488L, 61421);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */