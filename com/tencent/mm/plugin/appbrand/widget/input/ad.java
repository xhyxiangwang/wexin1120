package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bs.e;
import com.tencent.mm.plugin.appbrand.p.b;
import com.tencent.mm.plugin.appbrand.p.d;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;
import com.tencent.mm.sdk.platformtools.ab;

final class ad
  extends c
{
  public static final int jEf;
  private e jEe;
  
  static
  {
    GMTrace.i(19867310751744L, 148023);
    jEf = ab.getContext().getResources().getDimensionPixelSize(p.d.aSh);
    GMTrace.o(19867310751744L, 148023);
  }
  
  ad()
  {
    GMTrace.i(19867042316288L, 148021);
    this.jEe = null;
    GMTrace.o(19867042316288L, 148021);
  }
  
  protected final e acJ()
  {
    GMTrace.i(19867176534016L, 148022);
    if (this.jEe == null) {
      this.jEe = new a();
    }
    e locale = this.jEe;
    GMTrace.o(19867176534016L, 148022);
    return locale;
  }
  
  private static final class a
    extends e
  {
    private String[] jEg;
    
    a()
    {
      super();
      GMTrace.i(19869995106304L, 148043);
      this.jEg = null;
      this.jEg = ab.getContext().getResources().getStringArray(p.b.isj);
      GMTrace.o(19869995106304L, 148043);
    }
    
    public final void acK()
    {
      GMTrace.i(19870129324032L, 148044);
      GMTrace.o(19870129324032L, 148044);
    }
    
    public final int acL()
    {
      GMTrace.i(19870263541760L, 148045);
      if (this.jEg != null)
      {
        int i = this.jEg.length;
        GMTrace.o(19870263541760L, 148045);
        return i;
      }
      GMTrace.o(19870263541760L, 148045);
      return 0;
    }
    
    public final String getText(int paramInt)
    {
      GMTrace.i(19870666194944L, 148048);
      String str = ka(paramInt);
      GMTrace.o(19870666194944L, 148048);
      return str;
    }
    
    public final Drawable jZ(int paramInt)
    {
      GMTrace.i(19870397759488L, 148046);
      ad.b localb = new ad.b(ka(paramInt), ad.jEf, (byte)0);
      GMTrace.o(19870397759488L, 148046);
      return localb;
    }
    
    public final String ka(int paramInt)
    {
      GMTrace.i(19870531977216L, 148047);
      if ((this.jEg == null) || (paramInt < 0) || (paramInt > this.jEg.length - 1))
      {
        GMTrace.o(19870531977216L, 148047);
        return "";
      }
      Object localObject2 = this.jEg[paramInt].split(" ");
      Object localObject1 = Character.toChars(Integer.decode(localObject2[0]).intValue());
      localObject2 = Character.toChars(Integer.decode(localObject2[1]).intValue());
      localObject1 = (char[])localObject1 + (char[])localObject2;
      GMTrace.o(19870531977216L, 148047);
      return (String)localObject1;
    }
    
    public final String kb(int paramInt)
    {
      GMTrace.i(19870800412672L, 148049);
      String str = ka(paramInt);
      GMTrace.o(19870800412672L, 148049);
      return str;
    }
  }
  
  private static final class b
    extends Drawable
  {
    private final int he;
    private final TextPaint jEh;
    private Rect jEi;
    private final String jzo;
    
    private b(String paramString, int paramInt)
    {
      GMTrace.i(19863552655360L, 147995);
      this.jzo = paramString;
      this.he = paramInt;
      this.jEh = new TextPaint();
      this.jEh.setAntiAlias(true);
      this.jEh.setTextAlign(Paint.Align.CENTER);
      this.jEh.setTextSize(this.he);
      this.jEi = new Rect();
      this.jEh.getTextBounds(this.jzo, 0, this.jzo.length(), this.jEi);
      GMTrace.o(19863552655360L, 147995);
    }
    
    public final void draw(Canvas paramCanvas)
    {
      GMTrace.i(19863955308544L, 147998);
      paramCanvas.drawText(this.jzo, getBounds().width() / 2, getBounds().height() / 2 - (this.jEh.descent() + this.jEh.ascent()) / 2.0F, this.jEh);
      GMTrace.o(19863955308544L, 147998);
    }
    
    public final int getIntrinsicHeight()
    {
      GMTrace.i(19863821090816L, 147997);
      int i = this.jEi.height();
      GMTrace.o(19863821090816L, 147997);
      return i;
    }
    
    public final int getIntrinsicWidth()
    {
      GMTrace.i(19863686873088L, 147996);
      int i = this.jEi.width();
      GMTrace.o(19863686873088L, 147996);
      return i;
    }
    
    public final int getOpacity()
    {
      GMTrace.i(19864357961728L, 148001);
      GMTrace.o(19864357961728L, 148001);
      return -3;
    }
    
    public final void setAlpha(int paramInt)
    {
      GMTrace.i(19864089526272L, 147999);
      this.jEh.setAlpha(paramInt);
      GMTrace.o(19864089526272L, 147999);
    }
    
    public final void setColorFilter(ColorFilter paramColorFilter)
    {
      GMTrace.i(19864223744000L, 148000);
      this.jEh.setColorFilter(paramColorFilter);
      GMTrace.o(19864223744000L, 148000);
    }
  }
  
  private static final class c
    extends ContextWrapper
  {
    private Resources mResources;
    
    public c(Context paramContext)
    {
      super();
      GMTrace.i(19881672048640L, 148130);
      GMTrace.o(19881672048640L, 148130);
    }
    
    public final Resources getResources()
    {
      GMTrace.i(19881806266368L, 148131);
      if ((this.mResources != null) && ((this.mResources instanceof ad.d)))
      {
        localResources = this.mResources;
        GMTrace.o(19881806266368L, 148131);
        return localResources;
      }
      Resources localResources = super.getResources();
      this.mResources = new ad.d(localResources.getAssets(), localResources.getDisplayMetrics(), localResources.getConfiguration());
      localResources = this.mResources;
      GMTrace.o(19881806266368L, 148131);
      return localResources;
    }
  }
  
  private static final class d
    extends Resources
  {
    d(AssetManager paramAssetManager, DisplayMetrics paramDisplayMetrics, Configuration paramConfiguration)
    {
      super(paramDisplayMetrics, paramConfiguration);
      GMTrace.i(19865029050368L, 148006);
      GMTrace.o(19865029050368L, 148006);
    }
    
    public final String[] getStringArray(int paramInt)
    {
      GMTrace.i(19865163268096L, 148007);
      if (p.b.aMK == paramInt)
      {
        GMTrace.o(19865163268096L, 148007);
        return new String[0];
      }
      if (p.b.aML == paramInt)
      {
        GMTrace.o(19865163268096L, 148007);
        return new String[0];
      }
      String[] arrayOfString = super.getStringArray(paramInt);
      GMTrace.o(19865163268096L, 148007);
      return arrayOfString;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */