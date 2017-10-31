package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.b;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  View qtC;
  int qtD;
  FrameLayout.LayoutParams qtE;
  
  public a(Activity paramActivity)
  {
    GMTrace.i(16273362649088L, 121246);
    this.qtC = ((FrameLayout)paramActivity.findViewById(16908290)).getChildAt(0);
    this.qtC.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        GMTrace.i(16273228431360L, 121245);
        a locala = a.this;
        Rect localRect = new Rect();
        locala.qtC.getWindowVisibleDisplayFrame(localRect);
        int i = localRect.bottom - localRect.top;
        int j;
        int k;
        if (i != locala.qtD)
        {
          j = locala.qtC.getRootView().getHeight();
          k = j - i;
          if (k <= j / 4) {
            break label111;
          }
        }
        label111:
        for (locala.qtE.height = (j - k);; locala.qtE.height = j)
        {
          locala.qtC.requestLayout();
          locala.qtD = i;
          GMTrace.o(16273228431360L, 121245);
          return;
        }
      }
    });
    this.qtE = ((FrameLayout.LayoutParams)this.qtC.getLayoutParams());
    GMTrace.o(16273362649088L, 121246);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */