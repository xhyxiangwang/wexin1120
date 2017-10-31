package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.support.a.a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.p.j;
import com.tencent.mm.ui.widget.picker.YADatePicker;
import com.tencent.mm.ui.widget.picker.YADatePicker.c;
import com.tencent.mm.ui.widget.picker.YADatePicker.d;
import com.tencent.mm.ui.widget.picker.b;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class c
  extends YADatePicker
  implements i<String>
{
  public boolean jHg;
  public boolean jHh;
  public boolean jHi;
  public NumberPicker jHj;
  public NumberPicker jHk;
  public NumberPicker jHl;
  private Date jHm;
  private Date jHn;
  private final Calendar jHo;
  private final String[] jHp;
  
  @a
  public c(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, p.j.izg));
    GMTrace.i(10125653835776L, 75442);
    this.jHg = true;
    this.jHh = true;
    this.jHi = true;
    this.jHp = new String[12];
    int i = 0;
    while (i < this.jHp.length)
    {
      this.jHp[i] = (i + 1);
      i += 1;
    }
    this.jHo = Calendar.getInstance(Locale.US);
    cgJ();
    cgK();
    this.jHj = ((YADatePicker.c)getUIDelegate()).wXz;
    this.jHk = ((YADatePicker.c)getUIDelegate()).wXy;
    this.jHl = ((YADatePicker.c)getUIDelegate()).wXx;
    paramContext = getResources().getDrawable(p.e.isD);
    b.a(this.jHj, paramContext);
    b.a(this.jHk, paramContext);
    b.a(this.jHl, paramContext);
    b.b(this.jHj);
    b.b(this.jHk);
    b.b(this.jHl);
    paramContext = new NumberPicker.OnValueChangeListener()
    {
      public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10130083020800L, 75475);
        c.a(c.this);
        GMTrace.o(10130083020800L, 75475);
      }
    };
    if (this.jHj != null)
    {
      this.jHj.setOnValueChangedListener(paramContext);
      this.jHj.setMinValue(1900);
    }
    if (this.jHk != null) {
      this.jHk.setOnValueChangedListener(paramContext);
    }
    if (this.jHl != null) {
      this.jHl.setOnValueChangedListener(paramContext);
    }
    ade();
    b.d(this.jHj);
    b.d(this.jHk);
    b.d(this.jHl);
    GMTrace.o(10125653835776L, 75442);
  }
  
  private void ade()
  {
    int j = 0;
    GMTrace.i(10125788053504L, 75443);
    if ((this.jHj == null) || (this.jHk == null) || (this.jHl == null))
    {
      GMTrace.o(10125788053504L, 75443);
      return;
    }
    this.jHk.setDisplayedValues(null);
    if ((this.jHj.getValue() == this.jHj.getMaxValue()) && (this.jHn != null))
    {
      this.jHk.setMaxValue(this.jHn.getMonth());
      if ((this.jHk.getValue() != this.jHk.getMaxValue()) || (this.jHn == null)) {
        break label342;
      }
      this.jHl.setMaxValue(this.jHn.getDate());
      i = 1;
      if (i == 0)
      {
        i = this.jHj.getValue();
        int k = this.jHk.getValue();
        this.jHo.set(i, k, 1);
        i = this.jHo.getActualMaximum(5);
        this.jHl.setMaxValue(i);
      }
      if ((this.jHj.getValue() != this.jHj.getMinValue()) || (this.jHm == null)) {
        break label347;
      }
      this.jHk.setMinValue(this.jHm.getMonth());
      i = j;
      if (this.jHk.getValue() == this.jHk.getMinValue())
      {
        i = j;
        if (this.jHm != null) {
          this.jHl.setMinValue(this.jHm.getDate());
        }
      }
    }
    for (int i = 1;; i = j)
    {
      if (i == 0) {
        this.jHl.setMinValue(1);
      }
      this.jHk.setDisplayedValues((String[])Arrays.copyOfRange(this.jHp, this.jHk.getMinValue(), this.jHk.getMaxValue() + 1));
      this.jHj.setWrapSelectorWheel(true);
      this.jHk.setWrapSelectorWheel(true);
      this.jHl.setWrapSelectorWheel(true);
      GMTrace.o(10125788053504L, 75443);
      return;
      this.jHk.setMaxValue(11);
      label342:
      i = 0;
      break;
      label347:
      this.jHk.setMinValue(0);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
  {
    GMTrace.i(18247302774784L, 135953);
    super.a(paramInt1, Math.max(paramInt2 - 1, 0), paramInt3, paramd);
    ade();
    GMTrace.o(18247302774784L, 135953);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17649765449728L, 131501);
    ade();
    GMTrace.o(17649765449728L, 131501);
  }
  
  public final void adf()
  {
    GMTrace.i(17649899667456L, 131502);
    GMTrace.o(17649899667456L, 131502);
  }
  
  public final void adg()
  {
    GMTrace.i(17650168102912L, 131504);
    GMTrace.o(17650168102912L, 131504);
  }
  
  public final void b(g paramg)
  {
    GMTrace.i(17650033885184L, 131503);
    GMTrace.o(17650033885184L, 131503);
  }
  
  public final int getDayOfMonth()
  {
    GMTrace.i(10127130230784L, 75453);
    if (this.jHl != null)
    {
      i = this.jHl.getValue();
      GMTrace.o(10127130230784L, 75453);
      return i;
    }
    int i = super.getDayOfMonth();
    GMTrace.o(10127130230784L, 75453);
    return i;
  }
  
  public final int getMonth()
  {
    GMTrace.i(10126996013056L, 75452);
    if (this.jHk != null) {}
    for (int i = this.jHk.getValue() + 1;; i = super.getMonth() + 1)
    {
      i = Math.max(Math.min(i, 12), 0);
      GMTrace.o(10126996013056L, 75452);
      return i;
    }
  }
  
  public final View getView()
  {
    GMTrace.i(10126459142144L, 75448);
    GMTrace.o(10126459142144L, 75448);
    return this;
  }
  
  public final int getYear()
  {
    GMTrace.i(10126861795328L, 75451);
    if (this.jHj != null)
    {
      i = this.jHj.getValue();
      GMTrace.o(10126861795328L, 75451);
      return i;
    }
    int i = super.getYear();
    GMTrace.o(10126861795328L, 75451);
    return i;
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(10126190706688L, 75446);
    super.onAttachedToWindow();
    b.c(this.jHj);
    b.c(this.jHk);
    b.c(this.jHl);
    GMTrace.o(10126190706688L, 75446);
  }
  
  public final void setMaxDate(long paramLong)
  {
    GMTrace.i(10125922271232L, 75444);
    super.setMaxDate(paramLong);
    this.jHn = new Date(paramLong);
    if (this.jHj != null) {
      this.jHj.setMaxValue(this.jHn.getYear() + 1900);
    }
    GMTrace.o(10125922271232L, 75444);
  }
  
  public final void setMinDate(long paramLong)
  {
    GMTrace.i(10126056488960L, 75445);
    super.setMinDate(paramLong);
    this.jHm = new Date(paramLong);
    if (this.jHj != null) {
      this.jHj.setMinValue(this.jHm.getYear() + 1900);
    }
    GMTrace.o(10126056488960L, 75445);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */