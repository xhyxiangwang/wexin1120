package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.view.View;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.b.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Map;

final class c
  extends b<q>
{
  final String jAQ;
  int jAR;
  q jAS;
  t jAT;
  h jAU;
  boolean jAV;
  boolean jAW;
  
  c(String paramString, AppBrandPageView paramAppBrandPageView)
  {
    super(paramString, paramAppBrandPageView);
    GMTrace.i(10048747077632L, 74869);
    this.jAR = 0;
    this.jAS = new q(paramAppBrandPageView.mContext);
    ac.b.setNoSystemInputOnEditText(this.jAS);
    this.jAQ = String.valueOf(com.tencent.mm.plugin.appbrand.jsapi.base.f.a(paramAppBrandPageView, this.jAS));
    this.jAR = bg.a((Integer)m.jCf.get(paramString), 0);
    GMTrace.o(10048747077632L, 74869);
  }
  
  private t abL()
  {
    GMTrace.i(18248376516608L, 135961);
    if (this.jAT != null)
    {
      localt = this.jAT;
      GMTrace.o(18248376516608L, 135961);
      return localt;
    }
    t localt = (t)t.bU(this.jAS);
    this.jAT = localt;
    GMTrace.o(18248376516608L, 135961);
    return localt;
  }
  
  private boolean isFocused()
  {
    GMTrace.i(15420274769920L, 114890);
    if (this.jAS == null)
    {
      GMTrace.o(15420274769920L, 114890);
      return false;
    }
    if (this.jAS.isFocused())
    {
      GMTrace.o(15420274769920L, 114890);
      return true;
    }
    if (abL() == null)
    {
      GMTrace.o(15420274769920L, 114890);
      return false;
    }
    if (!abL().isShown())
    {
      GMTrace.o(15420274769920L, 114890);
      return false;
    }
    if (this.jAT.kb == this.jAS)
    {
      GMTrace.o(15420274769920L, 114890);
      return true;
    }
    GMTrace.o(15420274769920L, 114890);
    return false;
  }
  
  final String abA()
  {
    GMTrace.i(10048881295360L, 74870);
    String str = this.jAQ;
    GMTrace.o(10048881295360L, 74870);
    return str;
  }
  
  final Rect abC()
  {
    GMTrace.i(10049418166272L, 74874);
    Rect localRect = new Rect(this.jAU.jGb.intValue(), this.jAU.jGa.intValue(), this.jAU.jGb.intValue() + this.jAU.jFY.intValue(), this.jAU.jGa.intValue() + this.jAU.jFZ.intValue());
    GMTrace.o(10049418166272L, 74874);
    return localRect;
  }
  
  public final View abI()
  {
    GMTrace.i(10049149730816L, 74872);
    abL();
    t localt = this.jAT;
    GMTrace.o(10049149730816L, 74872);
    return localt;
  }
  
  public final int abJ()
  {
    GMTrace.i(10049283948544L, 74873);
    if ((this.jAU == null) || (this.jAU.jGv == null))
    {
      GMTrace.o(10049283948544L, 74873);
      return 0;
    }
    int i = this.jAU.jGv.intValue();
    GMTrace.o(10049283948544L, 74873);
    return i;
  }
  
  public final boolean abK()
  {
    GMTrace.i(14316333957120L, 106665);
    if (abL() == null)
    {
      GMTrace.o(14316333957120L, 106665);
      return false;
    }
    if (isFocused())
    {
      Object localObject = this.jAT;
      ((t)localObject).setVisibility(8);
      ((t)localObject).acn();
      w.d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] disableInputFocus %s", new Object[] { this.jAS });
      if (this.jAS != null)
      {
        this.jAS.setFocusable(false);
        this.jAS.setFocusableInTouchMode(false);
        this.jAS.setEnabled(false);
      }
      localObject = (AppBrandPageView)this.jAL.get();
      if ((localObject != null) && (((AppBrandPageView)localObject).jlc != null)) {
        f.abN().q(((AppBrandPageView)localObject).jlc);
      }
      i.a(this.jAL).aca();
      GMTrace.o(14316333957120L, 106665);
      return true;
    }
    GMTrace.o(14316333957120L, 106665);
    return false;
  }
  
  public final h b(h paramh)
  {
    GMTrace.i(17818208698368L, 132756);
    if (this.jAU == null)
    {
      this.jAU = paramh;
      if ((ac.d(paramh.jGF)) && (this.jAS != null)) {
        this.jAS.cS(true);
      }
    }
    while (this.jAS == null)
    {
      GMTrace.o(17818208698368L, 132756);
      return null;
      this.jAU.a(paramh);
    }
    a.a(this.jAS, this.jAU);
    paramh = this.jAU;
    GMTrace.o(17818208698368L, 132756);
    return paramh;
  }
  
  protected final boolean cM(boolean paramBoolean)
  {
    GMTrace.i(10050089254912L, 74879);
    w.d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] onFocusChanged hasFocus %b, isFocused %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(isFocused()) });
    if (!paramBoolean)
    {
      if (this.jAV)
      {
        GMTrace.o(10050089254912L, 74879);
        return true;
      }
      if (!isFocused())
      {
        GMTrace.o(10050089254912L, 74879);
        return true;
      }
      this.jAV = true;
      a(abG());
      abK();
      abF();
      this.jAV = false;
      this.jAS = null;
    }
    for (;;)
    {
      GMTrace.o(10050089254912L, 74879);
      return true;
      if (this.jAW)
      {
        GMTrace.o(10050089254912L, 74879);
        return true;
      }
      if (isFocused())
      {
        GMTrace.o(10050089254912L, 74879);
        return true;
      }
      this.jAW = true;
      jP(-2);
      this.jAW = false;
    }
  }
  
  public final boolean jP(int paramInt)
  {
    GMTrace.i(18248242298880L, 135960);
    if (this.jAS == null)
    {
      GMTrace.o(18248242298880L, 135960);
      return false;
    }
    this.jAT = t.bV(((AppBrandPageView)this.jAL.get()).jjV);
    if (this.jAT == null)
    {
      GMTrace.o(18248242298880L, 135960);
      return false;
    }
    this.jAW = true;
    Object localObject = (AppBrandPageView)this.jAL.get();
    if ((localObject != null) && (((AppBrandPageView)localObject).jlc != null)) {
      f.abN().p(((AppBrandPageView)localObject).jlc);
    }
    localObject = this.jAT;
    int i = this.jAR;
    ((t)localObject).jCJ.setXMode(i);
    localObject = this.jAT;
    q localq = this.jAS;
    if (localq != null)
    {
      if (((t)localObject).kb != localq) {
        ((t)localObject).acn();
      }
      ((t)localObject).setInputEditText(localq);
      ac.b.c(((t)localObject).kb);
      ((t)localObject).kb.requestFocus();
      ((t)localObject).setVisibility(0);
    }
    this.jAT.jCI = new t.a()
    {
      public final void onDone()
      {
        GMTrace.i(10099078725632L, 75244);
        c.this.a(c.this.abG());
        c.this.cM(false);
        GMTrace.o(10099078725632L, 75244);
      }
    };
    jQ(paramInt);
    i.a(this.jAL).abZ();
    this.jAW = false;
    GMTrace.o(18248242298880L, 135960);
    return true;
  }
  
  public final boolean su(String paramString)
  {
    GMTrace.i(10049686601728L, 74876);
    if (this.jAS == null)
    {
      GMTrace.o(10049686601728L, 74876);
      return false;
    }
    this.jAS.r(paramString);
    GMTrace.o(10049686601728L, 74876);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */