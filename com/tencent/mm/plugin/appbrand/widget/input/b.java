package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.tools.h.a;
import java.lang.ref.WeakReference;

public abstract class b<Input extends EditText,  extends x>
  extends com.tencent.mm.ui.widget.h
  implements w
{
  public y jAJ;
  final String jAK;
  public final WeakReference<AppBrandPageView> jAL;
  public final View.OnFocusChangeListener jAM;
  private final c.a jAN;
  
  b(String paramString, AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(10096931241984L, 75228);
    this.jAM = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(10101494644736L, 75262);
        b.this.cM(paramAnonymousBoolean);
        if (paramAnonymousBoolean)
        {
          m.a((AppBrandPageView)b.this.jAL.get(), (x)b.this.abB());
          ((x)b.this.abB()).sz(b.this.abA());
          m.a(b.this.abA(), b.this);
        }
        GMTrace.o(10101494644736L, 75262);
      }
    };
    this.jAN = new n.a()
    {
      public final void abH()
      {
        GMTrace.i(10048344424448L, 74866);
        if (b.this.abB() != null) {
          b.this.b(b.this.abB().getEditableText());
        }
        GMTrace.o(10048344424448L, 74866);
      }
    };
    this.jAK = paramString;
    this.jAL = new WeakReference(paramAppBrandPageView);
    GMTrace.o(10096931241984L, 75228);
  }
  
  final void a(Editable paramEditable)
  {
    GMTrace.i(18283273125888L, 136221);
    y localy;
    if (this.jAJ != null)
    {
      localy = this.jAJ;
      if (paramEditable != null) {
        break label50;
      }
    }
    label50:
    for (String str = "";; str = paramEditable.toString())
    {
      localy.a(str, Selection.getSelectionEnd(paramEditable), y.a.jDD);
      GMTrace.o(18283273125888L, 136221);
      return;
    }
  }
  
  public final boolean a(com.tencent.mm.plugin.appbrand.widget.input.b.h paramh)
  {
    GMTrace.i(17284156358656L, 128777);
    paramh = b(paramh);
    if (paramh == null)
    {
      GMTrace.o(17284156358656L, 128777);
      return false;
    }
    if (paramh.jGk == null) {
      paramh.jGk = Integer.valueOf(140);
    }
    while (abB() == null)
    {
      GMTrace.o(17284156358656L, 128777);
      return false;
      if (paramh.jGk.intValue() <= 0) {
        paramh.jGk = Integer.valueOf(Integer.MAX_VALUE);
      }
    }
    paramh = n.a(abB()).Dr(paramh.jGk.intValue());
    paramh.wNo = false;
    paramh.jCo = h.a.wKw;
    paramh.a(this.jAN);
    GMTrace.o(17284156358656L, 128777);
    return true;
  }
  
  public abstract String abA();
  
  public abstract Input abB();
  
  public abstract Rect abC();
  
  public final boolean abD()
  {
    GMTrace.i(17637954289664L, 131413);
    boolean bool = abF();
    GMTrace.o(17637954289664L, 131413);
    return bool;
  }
  
  public final Input abE()
  {
    GMTrace.i(18283138908160L, 136220);
    EditText localEditText = abB();
    GMTrace.o(18283138908160L, 136220);
    return localEditText;
  }
  
  public final boolean abF()
  {
    GMTrace.i(17638222725120L, 131415);
    EditText localEditText = abB();
    if (localEditText == null)
    {
      GMTrace.o(17638222725120L, 131415);
      return false;
    }
    ((x)localEditText).b(this.jAM);
    localEditText.removeTextChangedListener(this);
    ((x)localEditText).destroy();
    Object localObject = (AppBrandPageView)this.jAL.get();
    if (localObject == null)
    {
      GMTrace.o(17638222725120L, 131415);
      return false;
    }
    localObject = ((AppBrandPageView)localObject).jlb;
    if (localObject == null)
    {
      GMTrace.o(17638222725120L, 131415);
      return false;
    }
    ((e)localObject).bP(localEditText);
    GMTrace.o(17638222725120L, 131415);
    return true;
  }
  
  public final Editable abG()
  {
    GMTrace.i(18283675779072L, 136224);
    if (abB() == null)
    {
      GMTrace.o(18283675779072L, 136224);
      return null;
    }
    Editable localEditable = abB().getEditableText();
    GMTrace.o(18283675779072L, 136224);
    return localEditable;
  }
  
  public final void afterTextChanged(Editable paramEditable)
  {
    GMTrace.i(10097736548352L, 75234);
    b(paramEditable);
    GMTrace.o(10097736548352L, 75234);
  }
  
  protected abstract com.tencent.mm.plugin.appbrand.widget.input.b.h b(com.tencent.mm.plugin.appbrand.widget.input.b.h paramh);
  
  public final void b(Editable paramEditable)
  {
    GMTrace.i(18283407343616L, 136222);
    y localy;
    if (this.jAJ != null)
    {
      localy = this.jAJ;
      if (paramEditable != null) {
        break label50;
      }
    }
    label50:
    for (String str = "";; str = paramEditable.toString())
    {
      localy.a(str, Selection.getSelectionEnd(paramEditable), y.a.jDF);
      GMTrace.o(18283407343616L, 136222);
      return;
    }
  }
  
  public final void b(String paramString, Integer paramInteger)
  {
    GMTrace.i(19869189799936L, 148037);
    su(paramString);
    if (paramInteger == null) {}
    for (int i = -1;; i = paramInteger.intValue())
    {
      jQ(i);
      GMTrace.o(19869189799936L, 148037);
      return;
    }
  }
  
  protected abstract boolean cM(boolean paramBoolean);
  
  public final boolean g(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17638356942848L, 131416);
    if ((paramAppBrandPageView != null) && (paramAppBrandPageView == this.jAL.get()))
    {
      GMTrace.o(17638356942848L, 131416);
      return true;
    }
    GMTrace.o(17638356942848L, 131416);
    return false;
  }
  
  public abstract boolean jP(int paramInt);
  
  protected final void jQ(int paramInt)
  {
    GMTrace.i(19869324017664L, 148038);
    if (paramInt <= -2)
    {
      GMTrace.o(19869324017664L, 148038);
      return;
    }
    if (abB() == null)
    {
      GMTrace.o(19869324017664L, 148038);
      return;
    }
    int i = paramInt;
    if (-1 == paramInt) {
      i = abB().getEditableText().length();
    }
    abB().setSelection(i);
    GMTrace.o(19869324017664L, 148038);
  }
  
  public abstract boolean su(String paramString);
  
  public static enum a
  {
    static
    {
      GMTrace.i(10093307363328L, 75201);
      jAP = new a[0];
      GMTrace.o(10093307363328L, 75201);
    }
    
    public static b a(String paramString, AppBrandPageView paramAppBrandPageView)
    {
      GMTrace.i(10093173145600L, 75200);
      if (("digit".equalsIgnoreCase(paramString)) || ("idcard".equalsIgnoreCase(paramString)) || ("number".equalsIgnoreCase(paramString)))
      {
        paramString = new c(paramString, paramAppBrandPageView);
        GMTrace.o(10093173145600L, 75200);
        return paramString;
      }
      GMTrace.o(10093173145600L, 75200);
      return null;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */