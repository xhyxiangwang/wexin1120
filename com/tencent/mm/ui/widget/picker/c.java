package com.tencent.mm.ui.widget.picker;

import android.widget.NumberPicker.Formatter;
import com.tencent.gmtrace.GMTrace;
import java.util.Formatter;
import java.util.Locale;

final class c
  implements NumberPicker.Formatter
{
  final StringBuilder mBuilder;
  char wXp;
  Formatter wXq;
  final Object[] wXr;
  
  c()
  {
    GMTrace.i(18771423002624L, 139858);
    this.mBuilder = new StringBuilder();
    this.wXr = new Object[1];
    d(Locale.getDefault());
    GMTrace.o(18771423002624L, 139858);
  }
  
  private void d(Locale paramLocale)
  {
    GMTrace.i(18771557220352L, 139859);
    this.wXq = new Formatter(this.mBuilder, paramLocale);
    this.wXp = '0';
    GMTrace.o(18771557220352L, 139859);
  }
  
  public final String format(int paramInt)
  {
    GMTrace.i(18771691438080L, 139860);
    Object localObject = Locale.getDefault();
    if (this.wXp != '0') {
      d((Locale)localObject);
    }
    this.wXr[0] = Integer.valueOf(paramInt);
    this.mBuilder.delete(0, this.mBuilder.length());
    this.wXq.format("%02d", this.wXr);
    localObject = this.wXq.toString();
    GMTrace.o(18771691438080L, 139860);
    return (String)localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/picker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */