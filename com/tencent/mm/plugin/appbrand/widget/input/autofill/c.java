package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.i.a;
import com.tencent.mm.plugin.appbrand.widget.input.x;
import com.tencent.mm.ui.base.p;

public final class c
{
  public final i.a jEE;
  public AppBrandPageView jEF;
  public int jEG;
  boolean jEH;
  final x jEr;
  public final e jEs;
  
  c(x paramx, e parame)
  {
    GMTrace.i(18260724547584L, 136053);
    this.jEE = new i.a()
    {
      public final void acc()
      {
        GMTrace.i(18263945773056L, 136077);
        c.this.jEG = Integer.MIN_VALUE;
        c.this.kc(3);
        GMTrace.o(18263945773056L, 136077);
      }
      
      public final void acd()
      {
        GMTrace.i(18264079990784L, 136078);
        c.this.jEG = Integer.MIN_VALUE;
        c.this.kc(3);
        GMTrace.o(18264079990784L, 136078);
      }
    };
    this.jEG = Integer.MIN_VALUE;
    this.jEH = false;
    this.jEr = paramx;
    this.jEs = parame;
    GMTrace.o(18260724547584L, 136053);
  }
  
  public final void kc(final int paramInt)
  {
    GMTrace.i(18260858765312L, 136054);
    final AutoFillListPopupWindowBase.a locala = this.jEs.jEL;
    if (locala == null)
    {
      GMTrace.o(18260858765312L, 136054);
      return;
    }
    if (!this.jEs.ioi.isShowing())
    {
      GMTrace.o(18260858765312L, 136054);
      return;
    }
    if ((1 == paramInt) && (this.jEH))
    {
      this.jEG = Integer.MIN_VALUE;
      this.jEH = false;
    }
    locala.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        GMTrace.i(18260321894400L, 136050);
        locala.getViewTreeObserver().removeOnPreDrawListener(this);
        c localc = c.this;
        if ((!localc.jEs.ioi.isShowing()) || (localc.jEs.jEL == null) || (localc.jEs.jEL.getAdapter() == null) || (localc.jEs.jEL.getAdapter().getCount() <= 0)) {}
        Object localObject;
        do
        {
          GMTrace.o(18260321894400L, 136050);
          return true;
          localObject = localc.jEr.abI();
        } while (localObject == null);
        int m = a.fromDPToPix(localc.jEr.getContext(), 8);
        int n = localc.jEs.jEL.getChildAt(0).getHeight();
        int i = localc.jEs.jEL.getAdapter().getCount() * n;
        int k = i + m * 2;
        int j = n * 3 + m * 2;
        if (k > j) {
          i = j - m * 2;
        }
        for (;;)
        {
          localc.jEs.RT = j;
          int[] arrayOfInt = new int[2];
          localc.jEr.getView().getLocationInWindow(arrayOfInt);
          j = arrayOfInt[1] + localc.jEr.getView().getHeight();
          ((View)localObject).getLocationInWindow(arrayOfInt);
          k = arrayOfInt[1];
          label253:
          if (((localc.jEG == Integer.MIN_VALUE) || (localc.jEG >= 0 - m)) && (k - j >= i + m))
          {
            localc.jEs.Sd = localc.jEr.getView();
            localc.jEs.RT = (i + m * 2);
            localc.jEs.setVerticalOffset(0 - m);
            label329:
            localc.jEs.show();
            localObject = localc.jEs;
            if (((AutoFillListPopupWindowBase)localObject).RX) {
              break label543;
            }
          }
          label543:
          for (i = 0;; i = ((AutoFillListPopupWindowBase)localObject).RV)
          {
            localc.jEG = i;
            break;
            if (j - localc.jEr.getView().getHeight() >= i)
            {
              localc.jEs.Sd = localc.jEr.getView();
              localc.jEs.RT = (m * 2 + i);
              localc.jEs.setVerticalOffset(-(i + m) - localc.jEr.getView().getHeight());
              break label329;
            }
            if (i <= n)
            {
              localc.jEs.RT = n;
              localc.jEs.Sd = localc.jEr.getView();
              if (localc.jEG < 0 - m)
              {
                localc.jEs.setVerticalOffset(-(i + m) - localc.jEr.getView().getHeight());
                break label329;
              }
              localc.jEs.setVerticalOffset(0 - m);
              break label329;
            }
            i -= n;
            break label253;
          }
          j = k;
        }
      }
    });
    GMTrace.o(18260858765312L, 136054);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/autofill/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */