package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.a.a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TimePicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.p.j;
import com.tencent.mm.ui.widget.picker.b;

public final class h
  extends TimePicker
  implements i<String>
{
  public NumberPicker jHK;
  private NumberPicker jHL;
  public int jar;
  public int jas;
  public int jat;
  public int jau;
  
  @a
  public h(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, p.j.izg));
    GMTrace.i(10108876619776L, 75317);
    this.jar = -1;
    this.jas = -1;
    this.jat = -1;
    this.jau = -1;
    setIs24HourView(Boolean.valueOf(true));
    this.jHK = sD("mHourSpinner");
    this.jHL = sD("mMinuteSpinner");
    b.b(this.jHK);
    b.b(this.jHL);
    paramContext = getResources().getDrawable(p.e.isD);
    b.a(this.jHK, paramContext);
    b.a(this.jHL, paramContext);
    if (this.jHK != null) {
      this.jHK.setOnValueChangedListener(new NumberPicker.OnValueChangeListener()
      {
        public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(10130351456256L, 75477);
          h.a(h.this);
          GMTrace.o(10130351456256L, 75477);
        }
      });
    }
    if ((this.jHL != null) && (Build.VERSION.SDK_INT >= 21)) {
      this.jHL.setOnValueChangedListener(new NumberPicker.OnValueChangeListener()
      {
        public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(10125116964864L, 75438);
          GMTrace.o(10125116964864L, 75438);
        }
      });
    }
    b.d(this.jHK);
    b.d(this.jHL);
    GMTrace.o(10108876619776L, 75317);
  }
  
  private NumberPicker sD(String paramString)
  {
    GMTrace.i(10109413490688L, 75321);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramString = sF(paramString);
      GMTrace.o(10109413490688L, 75321);
      return paramString;
    }
    paramString = sE(paramString);
    GMTrace.o(10109413490688L, 75321);
    return paramString;
  }
  
  private NumberPicker sE(String paramString)
  {
    GMTrace.i(10109547708416L, 75322);
    try
    {
      paramString = (NumberPicker)new c(this, paramString, null).get();
      GMTrace.o(10109547708416L, 75322);
      return paramString;
    }
    catch (Exception paramString)
    {
      GMTrace.o(10109547708416L, 75322);
    }
    return null;
  }
  
  private NumberPicker sF(String paramString)
  {
    GMTrace.i(10109681926144L, 75323);
    try
    {
      Object localObject = new c(this, "mDelegate", null).get();
      if (localObject != null)
      {
        paramString = (NumberPicker)new c(localObject, paramString, null).get();
        GMTrace.o(10109681926144L, 75323);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(10109681926144L, 75323);
    }
    return null;
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17641041297408L, 131436);
    GMTrace.o(17641041297408L, 131436);
  }
  
  public final void adf()
  {
    GMTrace.i(17641175515136L, 131437);
    GMTrace.o(17641175515136L, 131437);
  }
  
  public final void adg()
  {
    GMTrace.i(17641443950592L, 131439);
    GMTrace.o(17641443950592L, 131439);
  }
  
  public final void adl()
  {
    GMTrace.i(10109010837504L, 75318);
    if ((j.ki(this.jar)) && (j.kh(this.jas)) && (this.jHK != null) && (this.jHL != null))
    {
      if (this.jHK.getValue() != this.jar) {
        break label125;
      }
      this.jHL.setMinValue(this.jas);
    }
    while ((j.ki(this.jat)) && (this.jHK != null) && (this.jHL != null)) {
      if (this.jHK.getValue() == this.jat)
      {
        this.jHL.setMaxValue(this.jau);
        GMTrace.o(10109010837504L, 75318);
        return;
        label125:
        this.jHL.setMinValue(0);
      }
      else
      {
        this.jHL.setMaxValue(59);
      }
    }
    GMTrace.o(10109010837504L, 75318);
  }
  
  public final void b(g paramg)
  {
    GMTrace.i(17641309732864L, 131438);
    GMTrace.o(17641309732864L, 131438);
  }
  
  public final View getView()
  {
    GMTrace.i(10110084579328L, 75326);
    GMTrace.o(10110084579328L, 75326);
    return this;
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(10109816143872L, 75324);
    super.onAttachedToWindow();
    b.c(this.jHK);
    b.c(this.jHL);
    GMTrace.o(10109816143872L, 75324);
  }
  
  public final void setCurrentHour(Integer paramInteger)
  {
    GMTrace.i(10109279272960L, 75320);
    if (paramInteger == null) {}
    for (int i = 0;; i = paramInteger.intValue())
    {
      super.setCurrentHour(Integer.valueOf(i));
      adl();
      GMTrace.o(10109279272960L, 75320);
      return;
    }
  }
  
  public final void setCurrentMinute(Integer paramInteger)
  {
    GMTrace.i(10109145055232L, 75319);
    if (paramInteger == null) {}
    for (int i = 0;; i = paramInteger.intValue())
    {
      super.setCurrentMinute(Integer.valueOf(i));
      adl();
      GMTrace.o(10109145055232L, 75319);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */