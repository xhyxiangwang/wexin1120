package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.Spanned;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.tools.h;
import java.lang.ref.WeakReference;

final class n
  extends c
{
  private n(WeakReference<EditText> paramWeakReference)
  {
    super(paramWeakReference);
    GMTrace.i(10047539118080L, 74860);
    GMTrace.o(10047539118080L, 74860);
  }
  
  public static n a(EditText paramEditText)
  {
    GMTrace.i(10047673335808L, 74861);
    paramEditText = new n(new WeakReference(paramEditText));
    GMTrace.o(10047673335808L, 74861);
    return paramEditText;
  }
  
  protected final h bC(int paramInt1, int paramInt2)
  {
    GMTrace.i(10047807553536L, 74862);
    b localb = new b(paramInt1, paramInt2);
    GMTrace.o(10047807553536L, 74862);
    return localb;
  }
  
  static abstract class a
    implements c.a
  {
    a()
    {
      GMTrace.i(10072235180032L, 75044);
      GMTrace.o(10072235180032L, 75044);
    }
    
    public void abH()
    {
      GMTrace.i(10072637833216L, 75047);
      GMTrace.o(10072637833216L, 75047);
    }
    
    public final void acg()
    {
      GMTrace.i(10072503615488L, 75046);
      GMTrace.o(10072503615488L, 75046);
    }
    
    public final void sy(String paramString)
    {
      GMTrace.i(10072369397760L, 75045);
      GMTrace.o(10072369397760L, 75045);
    }
  }
  
  private final class b
    extends h
  {
    private final int jCn;
    private final int jCo;
    
    b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      GMTrace.i(10078677630976L, 75092);
      this.jCn = paramInt1;
      this.jCo = paramInt2;
      GMTrace.o(10078677630976L, 75092);
    }
    
    public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      int i = 0;
      GMTrace.i(10078811848704L, 75093);
      if (dd(paramSpanned.subSequence(0, paramInt3).toString() + paramSpanned.subSequence(paramInt4, paramSpanned.length()).toString(), this.jCo) + dd(paramCharSequence.subSequence(paramInt1, paramInt2).toString(), this.jCo) > this.jCn) {
        i = 1;
      }
      if (i == 0) {
        if ((i != 0) && (bg.L(paramCharSequence))) {
          if (n.this.wNp != null) {
            break label213;
          }
        }
      }
      label213:
      for (paramSpanned = null;; paramSpanned = (EditText)n.this.wNp.get())
      {
        final c.a locala = n.this.wNt;
        if ((paramSpanned != null) && (locala != null)) {
          paramSpanned.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(10048075988992L, 74864);
              locala.abH();
              GMTrace.o(10048075988992L, 74864);
            }
          });
        }
        GMTrace.o(10078811848704L, 75093);
        return paramCharSequence;
        paramCharSequence = paramCharSequence.subSequence(paramInt1, Math.max(paramInt1, Math.min(this.jCn - (paramSpanned.length() - (paramInt4 - paramInt3)), paramInt2)));
        break;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */