package com.tencent.mm.plugin.appbrand.compat.a;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import java.util.List;

public abstract interface b
{
  public abstract f TO();
  
  public abstract q TP();
  
  public abstract i TQ();
  
  public abstract c TR();
  
  public abstract p TS();
  
  public abstract b a(c paramc);
  
  public abstract h a(i parami);
  
  public abstract o a(p paramp);
  
  public abstract void a(double paramDouble1, double paramDouble2, int paramInt);
  
  public abstract void a(e parame);
  
  public abstract void a(j paramj);
  
  public abstract void a(k paramk);
  
  public abstract void a(l paraml);
  
  public abstract void a(m paramm);
  
  public abstract void a(n paramn);
  
  public abstract boolean a(View paramView, double paramDouble1, double paramDouble2);
  
  public abstract void animateTo(double paramDouble1, double paramDouble2);
  
  public abstract boolean b(View paramView, double paramDouble1, double paramDouble2);
  
  public abstract void c(List<f> paramList, int paramInt);
  
  public abstract void clean();
  
  public abstract f e(double paramDouble1, double paramDouble2);
  
  public abstract View getView();
  
  public abstract int getZoomLevel();
  
  public abstract void hY(int paramInt);
  
  public abstract void setCenter(double paramDouble1, double paramDouble2);
  
  public static abstract interface a {}
  
  public static abstract interface b
    extends b.d
  {}
  
  public static abstract interface c
  {
    public abstract void d(double paramDouble1, double paramDouble2);
    
    public abstract void hU(int paramInt);
    
    public abstract void hV(int paramInt);
    
    public abstract void hW(int paramInt);
    
    public abstract void hX(int paramInt);
  }
  
  public static abstract interface d
  {
    public abstract String getId();
    
    public abstract void remove();
  }
  
  public static abstract interface e
  {
    public abstract View a(b.h paramh);
  }
  
  public static abstract interface f
  {
    public abstract double TW();
    
    public abstract double TX();
  }
  
  public static abstract interface g
  {
    public abstract b.f TU();
    
    public abstract b.f TV();
  }
  
  public static abstract interface h
    extends b.d
  {
    public abstract b.f TY();
    
    public abstract void b(b.f paramf);
    
    public abstract float getRotation();
    
    public abstract String getSnippet();
    
    public abstract String getTitle();
    
    public abstract void hideInfoWindow();
    
    public abstract boolean isInfoWindowShown();
    
    public abstract void oJ(String paramString);
    
    public abstract void remove();
    
    public abstract void setRotation(float paramFloat);
    
    public abstract void showInfoWindow();
  }
  
  public static abstract interface i
  {
    public abstract void O(float paramFloat);
    
    public abstract void P(float paramFloat);
    
    public abstract void bD(View paramView);
    
    public abstract void e(Animation paramAnimation);
    
    public abstract void f(double paramDouble1, double paramDouble2);
    
    public abstract void f(Animation paramAnimation);
    
    public abstract void o(float paramFloat1, float paramFloat2);
    
    public abstract void oK(String paramString);
    
    public abstract void oL(String paramString);
    
    public abstract void p(Bitmap paramBitmap);
  }
  
  public static abstract interface j
  {
    public abstract void b(b.h paramh);
  }
  
  public static abstract interface k
  {
    public abstract void Ub();
    
    public abstract void Uc();
  }
  
  public static abstract interface l
  {
    public abstract void Ud();
  }
  
  public static abstract interface m
  {
    public abstract void TT();
  }
  
  public static abstract interface n
  {
    public abstract boolean c(b.h paramh);
  }
  
  public static abstract interface o
    extends b.d
  {}
  
  public static abstract interface p
  {
    public abstract void a(Iterable<b.f> paramIterable);
    
    public abstract void hZ(int paramInt);
    
    public abstract void ia(int paramInt);
    
    public abstract void ib(int paramInt);
    
    public abstract void ic(int paramInt);
    
    public abstract void q(Bitmap paramBitmap);
    
    public abstract void setDottedLine(boolean paramBoolean);
  }
  
  public static abstract interface q
  {
    public abstract b.r TZ();
    
    public abstract double a(b.f paramf1, b.f paramf2);
  }
  
  public static abstract interface r
  {
    public abstract b.g Ua();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */