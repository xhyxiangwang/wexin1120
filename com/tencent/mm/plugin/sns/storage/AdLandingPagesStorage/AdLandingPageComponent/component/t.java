package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.q;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class t
  extends i
{
  public TextView imU;
  private RelativeLayout qqX;
  public ImageView qqY;
  
  public t(Context paramContext, q paramq, ViewGroup paramViewGroup)
  {
    super(paramContext, paramq, paramViewGroup);
    GMTrace.i(8257477279744L, 61523);
    this.qpH = paramq;
    GMTrace.o(8257477279744L, 61523);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8257611497472L, 61524);
    int i = i.g.pOs;
    GMTrace.o(8257611497472L, 61524);
    return i;
  }
  
  public final View biL()
  {
    GMTrace.i(8258014150656L, 61527);
    View localView = this.iiK;
    localView.setBackgroundColor(this.backgroundColor);
    this.imU = ((TextView)localView.findViewById(i.f.pLj));
    this.qqX = ((RelativeLayout)localView.findViewById(i.f.pLh));
    this.qqY = ((ImageView)localView.findViewById(i.f.pLi));
    GMTrace.o(8258014150656L, 61527);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8257879932928L, 61526);
    this.imU.setText(((q)this.qpH).label);
    this.imU.setTextSize(0, ((q)this.qpH).qmV);
    if ((((q)this.qpH).iHK != null) && (((q)this.qpH).iHK.length() > 0))
    {
      int i = Color.parseColor(((q)this.qpH).iHK);
      this.qqX.setBackgroundColor(i);
    }
    d.a(((q)this.qpH).qnD, ((q)this.qpH).qnp, new d.a()
    {
      public final void Hp(String paramAnonymousString)
      {
        GMTrace.i(8283918172160L, 61720);
        try
        {
          paramAnonymousString = BitmapFactory.decodeFile(paramAnonymousString);
          t.this.qqY.setImageBitmap(paramAnonymousString);
          paramAnonymousString = t.this.imU;
          Paint localPaint = new Paint();
          String str = paramAnonymousString.getText().toString();
          localPaint.setTextSize(paramAnonymousString.getTextSize());
          float f = localPaint.measureText(str, 0, str.length());
          f = t.this.qpH.qnu - f - TypedValue.applyDimension(1, 3.0F, t.this.context.getResources().getDisplayMetrics());
          int i = (int)(f - t.this.bjf().value * f);
          paramAnonymousString = (RelativeLayout.LayoutParams)t.this.qqY.getLayoutParams();
          paramAnonymousString.setMargins(paramAnonymousString.leftMargin, paramAnonymousString.topMargin, i, paramAnonymousString.leftMargin);
          t.this.qqY.setLayoutParams(paramAnonymousString);
          GMTrace.o(8283918172160L, 61720);
          return;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.Sns.AdLandingPageProcessBarComponent", "%s" + bg.f(paramAnonymousString));
          GMTrace.o(8283918172160L, 61720);
        }
      }
      
      public final void biT()
      {
        GMTrace.i(8283649736704L, 61718);
        GMTrace.o(8283649736704L, 61718);
      }
      
      public final void biU()
      {
        GMTrace.i(8283783954432L, 61719);
        GMTrace.o(8283783954432L, 61719);
      }
    });
    GMTrace.o(8257879932928L, 61526);
  }
  
  public final void biu()
  {
    GMTrace.i(8257745715200L, 61525);
    super.biu();
    GMTrace.o(8257745715200L, 61525);
  }
  
  public final void biv()
  {
    GMTrace.i(8258148368384L, 61528);
    super.biv();
    GMTrace.o(8258148368384L, 61528);
  }
  
  public final void biw()
  {
    GMTrace.i(8258282586112L, 61529);
    super.biw();
    GMTrace.o(8258282586112L, 61529);
  }
  
  public final q bjf()
  {
    GMTrace.i(16043313463296L, 119532);
    q localq = (q)this.qpH;
    GMTrace.o(16043313463296L, 119532);
    return localq;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */