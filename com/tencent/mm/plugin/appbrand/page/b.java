package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.AppBrandOptionButton;
import com.tencent.mm.plugin.appbrand.widget.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.tools.h;
import com.tencent.mm.ui.tools.h.a;

public final class b
{
  public static int a(AppBrandPageView paramAppBrandPageView, final String paramString1, String paramString2, final boolean paramBoolean)
  {
    final Object localObject1 = null;
    Object localObject2 = null;
    GMTrace.i(17299457179648L, 128891);
    if (paramAppBrandPageView == null)
    {
      i = a.jjL;
      GMTrace.o(17299457179648L, 128891);
      return i;
    }
    if (!paramBoolean)
    {
      localObject1 = localObject2;
      if (!bg.mZ(paramString2))
      {
        paramString2 = n.g(paramAppBrandPageView.irS, paramString2);
        localObject1 = paramString2;
        if (paramString2 == null)
        {
          i = a.jjM;
          GMTrace.o(17299457179648L, 128891);
          return i;
        }
      }
      i = h.dd(paramString1, h.a.wKx);
      if ((i <= 0) || (i > 8))
      {
        i = a.jjN;
        GMTrace.o(17299457179648L, 128891);
        return i;
      }
    }
    paramString1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17289793503232L, 128819);
        Object localObject1 = this.iQw.jkY;
        if (!paramBoolean) {}
        Object localObject2;
        for (boolean bool = true;; bool = false)
        {
          ((a)localObject1).cG(bool);
          if (paramBoolean) {
            break label195;
          }
          if (localObject1 == null) {
            break label137;
          }
          localObject2 = this.iQw.jkY;
          localObject1 = localObject1;
          localObject2 = ((a)localObject2).jyB;
          if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled())) {
            break;
          }
          GMTrace.o(17289793503232L, 128819);
          return;
        }
        ((AppBrandOptionButton)localObject2).jyZ = false;
        ((AppBrandOptionButton)localObject2).jzd.setImageDrawable(new BitmapDrawable(((AppBrandOptionButton)localObject2).getResources(), (Bitmap)localObject1));
        ((AppBrandOptionButton)localObject2).jzd.setVisibility(0);
        ((AppBrandOptionButton)localObject2).jza.setVisibility(8);
        GMTrace.o(17289793503232L, 128819);
        return;
        label137:
        if (!bg.mZ(paramString1))
        {
          localObject2 = this.iQw.jkY;
          localObject1 = paramString1;
          localObject2 = ((a)localObject2).jyB;
          ((AppBrandOptionButton)localObject2).jyZ = false;
          ((AppBrandOptionButton)localObject2).jzc.setText((CharSequence)localObject1);
          ((AppBrandOptionButton)localObject2).jza.setVisibility(0);
          ((AppBrandOptionButton)localObject2).jzd.setVisibility(8);
        }
        label195:
        GMTrace.o(17289793503232L, 128819);
      }
    };
    paramAppBrandPageView.jjV.post(paramString1);
    int i = a.jjO;
    GMTrace.o(17299457179648L, 128891);
    return i;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(17298786091008L, 128886);
      jjL = 1;
      jjM = 2;
      jjN = 3;
      jjO = 4;
      jjP = new int[] { jjL, jjM, jjN, jjO };
      GMTrace.o(17298786091008L, 128886);
    }
    
    public static int[] YH()
    {
      GMTrace.i(17298651873280L, 128885);
      int[] arrayOfInt = (int[])jjP.clone();
      GMTrace.o(17298651873280L, 128885);
      return arrayOfInt;
    }
  }
  
  private static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.b
  {
    static final int CTRL_INDEX = 237;
    static final String NAME = "config_navigationBarRightButton";
    static b jjQ;
    
    static
    {
      GMTrace.i(17296504389632L, 128869);
      jjQ = new b();
      GMTrace.o(17296504389632L, 128869);
    }
    
    private b()
    {
      GMTrace.i(17296370171904L, 128868);
      GMTrace.o(17296370171904L, 128868);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */