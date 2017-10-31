package com.tencent.mm.plugin.appbrand.widget.input.a;

import android.os.Looper;
import android.os.Message;
import android.text.Selection;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;

public final class a
{
  private final ae jBu;
  public volatile c jEZ;
  
  public a()
  {
    GMTrace.i(19862478913536L, 147987);
    this.jBu = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(19862881566720L, 147990);
        if (1000 == paramAnonymousMessage.what)
        {
          String str = (String)paramAnonymousMessage.obj;
          int i = paramAnonymousMessage.arg1;
          if (a.this.jEZ != null) {
            a.this.jEZ.al(str, i);
          }
        }
        GMTrace.o(19862881566720L, 147990);
      }
    };
    GMTrace.o(19862478913536L, 147987);
  }
  
  public final void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    GMTrace.i(19862613131264L, 147988);
    if (paramCharSequence == null)
    {
      GMTrace.o(19862613131264L, 147988);
      return;
    }
    paramCharSequence = this.jBu.obtainMessage(1000, Selection.getSelectionEnd(paramCharSequence), 0, paramCharSequence.toString());
    this.jBu.removeMessages(1000);
    ae localae = this.jBu;
    if (paramBoolean) {}
    for (long l = 150L;; l = 0L)
    {
      localae.sendMessageDelayed(paramCharSequence, l);
      GMTrace.o(19862613131264L, 147988);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */