package com.tencent.mm.plugin.appbrand.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.e;
import com.tencent.mm.plugin.appbrand.widget.f.a;

@SuppressLint({"AppCompatCustomView"})
public final class g
  extends TextView
  implements e
{
  private boolean jyX;
  public a jzB;
  
  public g(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17632585580544L, 131373);
    super.setIncludeFontPadding(false);
    super.setLineSpacing(0.0F, 1.0F);
    super.setSpannableFactory(new Spannable.Factory()
    {
      public final Spannable newSpannable(CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(17631914491904L, 131368);
        paramAnonymousCharSequence = super.newSpannable(paramAnonymousCharSequence);
        if ((g.a(g.this) != null) && (!TextUtils.isEmpty(paramAnonymousCharSequence))) {
          paramAnonymousCharSequence.setSpan(g.a(g.this), 0, paramAnonymousCharSequence.length(), 18);
        }
        GMTrace.o(17631914491904L, 131368);
        return paramAnonymousCharSequence;
      }
    });
    GMTrace.o(17632585580544L, 131373);
  }
  
  public final boolean Wf()
  {
    GMTrace.i(17632854016000L, 131375);
    boolean bool = this.jyX;
    GMTrace.o(17632854016000L, 131375);
    return bool;
  }
  
  public final void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    GMTrace.i(17841831018496L, 132932);
    TextView.BufferType localBufferType = paramBufferType;
    if (paramBufferType == TextView.BufferType.NORMAL) {
      localBufferType = TextView.BufferType.SPANNABLE;
    }
    super.setText(paramCharSequence, localBufferType);
    GMTrace.o(17841831018496L, 132932);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */