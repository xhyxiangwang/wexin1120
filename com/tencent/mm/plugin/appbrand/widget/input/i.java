package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.text.Layout;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.plugin.appbrand.ui.g;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.Set;

public class i
  implements AppBrandPageView.c
{
  private static final i jBK;
  private static final android.support.v4.e.a<AppBrandPageView, i> jBP;
  public final AppBrandPageView iTB;
  public final Map<a, i> jBJ;
  public final int jBL;
  private final int jBM;
  public int jBN;
  private boolean jBO;
  private final Runnable jBQ;
  private final Runnable jBR;
  
  static
  {
    GMTrace.i(17637014765568L, 131406);
    jBK = new i()
    {
      public final void abZ()
      {
        GMTrace.i(17637417418752L, 131409);
        GMTrace.o(17637417418752L, 131409);
      }
      
      public final void aca()
      {
        GMTrace.i(17637551636480L, 131410);
        GMTrace.o(17637551636480L, 131410);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(17637685854208L, 131411);
        GMTrace.o(17637685854208L, 131411);
      }
      
      public final String toString()
      {
        GMTrace.i(17637820071936L, 131412);
        String str = super.toString() + "|DUMMY";
        GMTrace.o(17637820071936L, 131412);
        return str;
      }
    };
    jBP = new android.support.v4.e.a();
    GMTrace.o(17637014765568L, 131406);
  }
  
  public i()
  {
    GMTrace.i(17636075241472L, 131399);
    this.jBJ = new android.support.v4.e.a();
    this.jBM = 5;
    this.jBN = 0;
    this.jBO = false;
    this.jBQ = new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(17633927757824L, 131383);
        if (!i.this.iTB.UF)
        {
          GMTrace.o(17633927757824L, 131383);
          return;
        }
        Object localObject = i.this.abY();
        if (localObject != null)
        {
          ((View)localObject).scrollTo(0, 0);
          localObject = i.this;
          if (((i)localObject).jBJ.size() > 0)
          {
            i.a[] arrayOfa = new i.a[((i)localObject).jBJ.size()];
            localObject = (i.a[])((i)localObject).jBJ.keySet().toArray(arrayOfa);
            int j = localObject.length;
            while (i < j)
            {
              localObject[i].acd();
              i += 1;
            }
          }
        }
        GMTrace.o(17633927757824L, 131383);
      }
    };
    this.jBR = new Runnable()
    {
      private int acb()
      {
        GMTrace.i(17635269935104L, 131393);
        View localView = i.this.abY();
        if (localView != null)
        {
          int i = localView.getScrollY();
          GMTrace.o(17635269935104L, 131393);
          return i;
        }
        GMTrace.o(17635269935104L, 131393);
        return 0;
      }
      
      private void jS(int paramAnonymousInt)
      {
        int i = 0;
        GMTrace.i(17635404152832L, 131394);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandInputPageOffsetHelper", "[TextAreaHeight] offsetRoot %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        Object localObject = i.this.abY();
        if (localObject != null)
        {
          ((View)localObject).scrollTo(0, paramAnonymousInt);
          localObject = i.this;
          if (((i)localObject).jBJ.size() > 0)
          {
            i.a[] arrayOfa = new i.a[((i)localObject).jBJ.size()];
            localObject = (i.a[])((i)localObject).jBJ.keySet().toArray(arrayOfa);
            int j = localObject.length;
            paramAnonymousInt = i;
            while (paramAnonymousInt < j)
            {
              localObject[paramAnonymousInt].acc();
              paramAnonymousInt += 1;
            }
          }
        }
        GMTrace.o(17635404152832L, 131394);
      }
      
      public final void run()
      {
        GMTrace.i(17635135717376L, 131392);
        com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] offsetRunner enter");
        Object localObject2 = m.m(i.this.iTB);
        if (localObject2 == null)
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        if (!i.this.iTB.UF)
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        if ((((w)localObject2).abI() == null) || (((w)localObject2).abE() == null))
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        Object localObject1 = ((w)localObject2).abE();
        View localView = ((w)localObject2).abI();
        int i;
        int k;
        int j;
        int n;
        int m;
        if (!g.bI((View)localObject1)) {
          if (localView.getHeight() <= localView.getMinimumHeight())
          {
            com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panel height %d, tryCount %d", new Object[] { Integer.valueOf(localView.getHeight()), Integer.valueOf(i.this.jBN) });
            localObject1 = i.this;
            i = ((i)localObject1).jBN + 1;
            ((i)localObject1).jBN = i;
            if (i < 5)
            {
              i.this.cQ(false);
              GMTrace.o(17635135717376L, 131392);
            }
          }
          else
          {
            i.this.jBN = 0;
            com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panelHeight %d", new Object[] { Integer.valueOf(localView.getHeight()) });
            int[] arrayOfInt = new int[2];
            ((EditText)localObject1).getLocationOnScreen(arrayOfInt);
            k = arrayOfInt[1];
            com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] inputHeight %d, inputTop %d, inputAttached %B", new Object[] { Integer.valueOf(((EditText)localObject1).getHeight()), Integer.valueOf(k), Boolean.valueOf(z.al((View)localObject1)) });
            Display localDisplay = ((WindowManager)i.this.iTB.jjV.getContext().getSystemService("window")).getDefaultDisplay();
            Point localPoint = new Point();
            localDisplay.getSize(localPoint);
            if (k <= localPoint.y)
            {
              j = k + ((EditText)localObject1).getHeight();
              localView.getLocationOnScreen(arrayOfInt);
              n = arrayOfInt[1];
              if ((!((x)localObject1).aci()) || (((EditText)localObject1).getLayout() == null)) {
                break label699;
              }
              i = k + ((x)localObject1).jY(((EditText)localObject1).getLayout().getLineForOffset(((EditText)localObject1).getSelectionStart()));
              m = k + ((x)localObject1).jY(((EditText)localObject1).getLayout().getLineForOffset(((EditText)localObject1).getSelectionStart()) + 1);
              if (i - k < ((EditText)localObject1).getHeight()) {
                break label696;
              }
              i = j - ((EditText)localObject1).getLineHeight();
              if (m - k < ((EditText)localObject1).getHeight()) {
                break label688;
              }
              k = j;
              j = i;
              i = k;
            }
          }
        }
        for (;;)
        {
          i += ((w)localObject2).abJ();
          if (n < i)
          {
            i = Math.max(0, Math.min(i - n, j - i.this.jBL));
            localObject2 = i.this.iTB.jlc;
            if (localObject2 != null)
            {
              localView = ((s)localObject2).getView();
              if ((localView != null) && (localObject1 != null)) {}
            }
            else
            {
              GMTrace.o(17635135717376L, 131392);
              return;
            }
            if ((((x)localObject1).acF()) || (!((x)localObject1).aci()))
            {
              jS(acb() + i);
              GMTrace.o(17635135717376L, 131392);
              return;
            }
            j = ((s)localObject2).getHeight();
            k = localView.getScrollY();
            m = c.jF(((s)localObject2).getContentHeight());
            ((EditText)localObject1).getHeight();
            ((EditText)localObject1).getTop();
            j = Math.max(0, Math.min(m - k - j, i));
            localView.scrollBy(localView.getScrollX(), j);
            jS(i - j + acb());
          }
          GMTrace.o(17635135717376L, 131392);
          return;
          label688:
          j = i;
          i = m;
          continue;
          label696:
          break;
          label699:
          i = j;
          j = k;
        }
      }
    };
    this.iTB = null;
    this.jBL = 0;
    GMTrace.o(17636075241472L, 131399);
  }
  
  private i(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17636209459200L, 131400);
    this.jBJ = new android.support.v4.e.a();
    this.jBM = 5;
    this.jBN = 0;
    this.jBO = false;
    this.jBQ = new Runnable()
    {
      public final void run()
      {
        int i = 0;
        GMTrace.i(17633927757824L, 131383);
        if (!i.this.iTB.UF)
        {
          GMTrace.o(17633927757824L, 131383);
          return;
        }
        Object localObject = i.this.abY();
        if (localObject != null)
        {
          ((View)localObject).scrollTo(0, 0);
          localObject = i.this;
          if (((i)localObject).jBJ.size() > 0)
          {
            i.a[] arrayOfa = new i.a[((i)localObject).jBJ.size()];
            localObject = (i.a[])((i)localObject).jBJ.keySet().toArray(arrayOfa);
            int j = localObject.length;
            while (i < j)
            {
              localObject[i].acd();
              i += 1;
            }
          }
        }
        GMTrace.o(17633927757824L, 131383);
      }
    };
    this.jBR = new Runnable()
    {
      private int acb()
      {
        GMTrace.i(17635269935104L, 131393);
        View localView = i.this.abY();
        if (localView != null)
        {
          int i = localView.getScrollY();
          GMTrace.o(17635269935104L, 131393);
          return i;
        }
        GMTrace.o(17635269935104L, 131393);
        return 0;
      }
      
      private void jS(int paramAnonymousInt)
      {
        int i = 0;
        GMTrace.i(17635404152832L, 131394);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandInputPageOffsetHelper", "[TextAreaHeight] offsetRoot %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        Object localObject = i.this.abY();
        if (localObject != null)
        {
          ((View)localObject).scrollTo(0, paramAnonymousInt);
          localObject = i.this;
          if (((i)localObject).jBJ.size() > 0)
          {
            i.a[] arrayOfa = new i.a[((i)localObject).jBJ.size()];
            localObject = (i.a[])((i)localObject).jBJ.keySet().toArray(arrayOfa);
            int j = localObject.length;
            paramAnonymousInt = i;
            while (paramAnonymousInt < j)
            {
              localObject[paramAnonymousInt].acc();
              paramAnonymousInt += 1;
            }
          }
        }
        GMTrace.o(17635404152832L, 131394);
      }
      
      public final void run()
      {
        GMTrace.i(17635135717376L, 131392);
        com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] offsetRunner enter");
        Object localObject2 = m.m(i.this.iTB);
        if (localObject2 == null)
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        if (!i.this.iTB.UF)
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        if ((((w)localObject2).abI() == null) || (((w)localObject2).abE() == null))
        {
          GMTrace.o(17635135717376L, 131392);
          return;
        }
        Object localObject1 = ((w)localObject2).abE();
        View localView = ((w)localObject2).abI();
        int i;
        int k;
        int j;
        int n;
        int m;
        if (!g.bI((View)localObject1)) {
          if (localView.getHeight() <= localView.getMinimumHeight())
          {
            com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panel height %d, tryCount %d", new Object[] { Integer.valueOf(localView.getHeight()), Integer.valueOf(i.this.jBN) });
            localObject1 = i.this;
            i = ((i)localObject1).jBN + 1;
            ((i)localObject1).jBN = i;
            if (i < 5)
            {
              i.this.cQ(false);
              GMTrace.o(17635135717376L, 131392);
            }
          }
          else
          {
            i.this.jBN = 0;
            com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp], panelHeight %d", new Object[] { Integer.valueOf(localView.getHeight()) });
            int[] arrayOfInt = new int[2];
            ((EditText)localObject1).getLocationOnScreen(arrayOfInt);
            k = arrayOfInt[1];
            com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] inputHeight %d, inputTop %d, inputAttached %B", new Object[] { Integer.valueOf(((EditText)localObject1).getHeight()), Integer.valueOf(k), Boolean.valueOf(z.al((View)localObject1)) });
            Display localDisplay = ((WindowManager)i.this.iTB.jjV.getContext().getSystemService("window")).getDefaultDisplay();
            Point localPoint = new Point();
            localDisplay.getSize(localPoint);
            if (k <= localPoint.y)
            {
              j = k + ((EditText)localObject1).getHeight();
              localView.getLocationOnScreen(arrayOfInt);
              n = arrayOfInt[1];
              if ((!((x)localObject1).aci()) || (((EditText)localObject1).getLayout() == null)) {
                break label699;
              }
              i = k + ((x)localObject1).jY(((EditText)localObject1).getLayout().getLineForOffset(((EditText)localObject1).getSelectionStart()));
              m = k + ((x)localObject1).jY(((EditText)localObject1).getLayout().getLineForOffset(((EditText)localObject1).getSelectionStart()) + 1);
              if (i - k < ((EditText)localObject1).getHeight()) {
                break label696;
              }
              i = j - ((EditText)localObject1).getLineHeight();
              if (m - k < ((EditText)localObject1).getHeight()) {
                break label688;
              }
              k = j;
              j = i;
              i = k;
            }
          }
        }
        for (;;)
        {
          i += ((w)localObject2).abJ();
          if (n < i)
          {
            i = Math.max(0, Math.min(i - n, j - i.this.jBL));
            localObject2 = i.this.iTB.jlc;
            if (localObject2 != null)
            {
              localView = ((s)localObject2).getView();
              if ((localView != null) && (localObject1 != null)) {}
            }
            else
            {
              GMTrace.o(17635135717376L, 131392);
              return;
            }
            if ((((x)localObject1).acF()) || (!((x)localObject1).aci()))
            {
              jS(acb() + i);
              GMTrace.o(17635135717376L, 131392);
              return;
            }
            j = ((s)localObject2).getHeight();
            k = localView.getScrollY();
            m = c.jF(((s)localObject2).getContentHeight());
            ((EditText)localObject1).getHeight();
            ((EditText)localObject1).getTop();
            j = Math.max(0, Math.min(m - k - j, i));
            localView.scrollBy(localView.getScrollX(), j);
            jS(i - j + acb());
          }
          GMTrace.o(17635135717376L, 131392);
          return;
          label688:
          j = i;
          i = m;
          continue;
          label696:
          break;
          label699:
          i = j;
          j = k;
        }
      }
    };
    this.iTB = paramAppBrandPageView;
    this.iTB.a(this);
    int j = com.tencent.mm.bq.a.fromDPToPix(paramAppBrandPageView.mContext, 10);
    if (Build.VERSION.SDK_INT >= 21) {
      i = g.aak();
    }
    this.jBL = (i + j);
    GMTrace.o(17636209459200L, 131400);
  }
  
  public static i a(Reference<AppBrandPageView> paramReference)
  {
    GMTrace.i(17636343676928L, 131401);
    if (paramReference == null) {}
    for (paramReference = null;; paramReference = (AppBrandPageView)paramReference.get())
    {
      paramReference = h(paramReference);
      GMTrace.o(17636343676928L, 131401);
      return paramReference;
    }
  }
  
  public static i h(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(18281259859968L, 136206);
    if ((paramAppBrandPageView == null) || (!paramAppBrandPageView.UF))
    {
      com.tencent.mm.sdk.platformtools.w.j("MicroMsg.AppBrandInputPageOffsetHelper", " obtain with invalid page " + paramAppBrandPageView, new Object[0]);
      paramAppBrandPageView = jBK;
      GMTrace.o(18281259859968L, 136206);
      return paramAppBrandPageView;
    }
    i locali2 = (i)jBP.get(paramAppBrandPageView);
    i locali1 = locali2;
    if (locali2 == null)
    {
      locali1 = new i(paramAppBrandPageView);
      jBP.put(paramAppBrandPageView, locali1);
    }
    GMTrace.o(18281259859968L, 136206);
    return locali1;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(18281125642240L, 136205);
    if (parama == null)
    {
      GMTrace.o(18281125642240L, 136205);
      return;
    }
    this.jBJ.remove(parama);
    GMTrace.o(18281125642240L, 136205);
  }
  
  public final View abY()
  {
    GMTrace.i(17636477894656L, 131402);
    if (!this.iTB.UF)
    {
      GMTrace.o(17636477894656L, 131402);
      return null;
    }
    FrameLayout localFrameLayout = this.iTB.jjY;
    GMTrace.o(17636477894656L, 131402);
    return localFrameLayout;
  }
  
  public void abZ()
  {
    GMTrace.i(17636612112384L, 131403);
    cQ(true);
    GMTrace.o(17636612112384L, 131403);
  }
  
  public void aca()
  {
    GMTrace.i(17636746330112L, 131404);
    if (!this.iTB.UF)
    {
      GMTrace.o(17636746330112L, 131404);
      return;
    }
    this.jBO = true;
    this.iTB.jjV.post(this.jBQ);
    GMTrace.o(17636746330112L, 131404);
  }
  
  public final void cQ(boolean paramBoolean)
  {
    GMTrace.i(18281394077696L, 136207);
    if (paramBoolean)
    {
      this.jBN = 0;
      this.jBO = false;
    }
    if (!this.iTB.UF)
    {
      GMTrace.o(18281394077696L, 136207);
      return;
    }
    if (this.jBO)
    {
      GMTrace.o(18281394077696L, 136207);
      return;
    }
    if (this.jBN == 0)
    {
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] post, attached %B", new Object[] { Boolean.valueOf(z.al(this.iTB.jjV)) });
      this.iTB.jjV.post(this.jBR);
      GMTrace.o(18281394077696L, 136207);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.v("MicroMsg.AppBrandInputPageOffsetHelper", "[scrollUp] postOnAnimation, attached %B", new Object[] { Boolean.valueOf(z.al(this.iTB.jjV)) });
    this.iTB.jjV.postOnAnimation(this.jBR);
    GMTrace.o(18281394077696L, 136207);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17636880547840L, 131405);
    this.iTB.b(this);
    jBP.remove(this.iTB);
    GMTrace.o(17636880547840L, 131405);
  }
  
  public static abstract interface a
  {
    public abstract void acc();
    
    public abstract void acd();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */