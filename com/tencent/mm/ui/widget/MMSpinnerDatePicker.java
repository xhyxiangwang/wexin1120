package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;

public class MMSpinnerDatePicker
  extends DatePicker
  implements DatePicker.OnDateChangedListener
{
  public NumberPicker wUg;
  public NumberPicker wUh;
  public NumberPicker wUi;
  public int wUj;
  
  public MMSpinnerDatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1640543289344L, 12223);
    this.wUj = 0;
    init();
    GMTrace.o(1640543289344L, 12223);
  }
  
  public MMSpinnerDatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1640677507072L, 12224);
    this.wUj = 0;
    init();
    GMTrace.o(1640677507072L, 12224);
  }
  
  private void init()
  {
    GMTrace.i(1640811724800L, 12225);
    setCalendarViewShown(false);
    Object localObject = Resources.getSystem();
    int i = ((Resources)localObject).getIdentifier("year", "id", "android");
    int j = ((Resources)localObject).getIdentifier("month", "id", "android");
    int k = ((Resources)localObject).getIdentifier("day", "id", "android");
    this.wUg = ((NumberPicker)findViewById(i));
    this.wUh = ((NumberPicker)findViewById(j));
    this.wUi = ((NumberPicker)findViewById(k));
    localObject = getChildAt(0);
    ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
    localLayoutParams.width = -1;
    ((View)localObject).setLayoutParams(localLayoutParams);
    localObject = (LinearLayout.LayoutParams)this.wUg.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject).topMargin = 0;
    ((LinearLayout.LayoutParams)localObject).bottomMargin = 0;
    ((LinearLayout.LayoutParams)localObject).leftMargin = 0;
    ((LinearLayout.LayoutParams)localObject).rightMargin = 0;
    ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
    this.wUg.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.wUh.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.wUi.setLayoutParams((ViewGroup.LayoutParams)localObject);
    setDescendantFocusability(393216);
    DB(2);
    GMTrace.o(1640811724800L, 12225);
  }
  
  public final void DB(int paramInt)
  {
    GMTrace.i(1640945942528L, 12226);
    this.wUj = paramInt;
    if (this.wUj == 0)
    {
      this.wUg.setVisibility(0);
      this.wUh.setVisibility(0);
      this.wUi.setVisibility(0);
      GMTrace.o(1640945942528L, 12226);
      return;
    }
    if (this.wUj == 1)
    {
      this.wUg.setVisibility(0);
      this.wUh.setVisibility(0);
      this.wUi.setVisibility(8);
      GMTrace.o(1640945942528L, 12226);
      return;
    }
    this.wUg.setVisibility(0);
    this.wUh.setVisibility(8);
    this.wUi.setVisibility(8);
    GMTrace.o(1640945942528L, 12226);
  }
  
  public final boolean DC(int paramInt)
  {
    GMTrace.i(1641214377984L, 12228);
    try
    {
      Field localField = NumberPicker.class.getDeclaredField("mSelectionDivider");
      localField.setAccessible(true);
      ColorDrawable localColorDrawable = new ColorDrawable();
      localColorDrawable.setColor(getResources().getColor(paramInt));
      localField.set(this.wUg, localColorDrawable);
      localField.set(this.wUh, localColorDrawable);
      localField.set(this.wUi, localColorDrawable);
      invalidate();
      GMTrace.o(1641214377984L, 12228);
      return true;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      w.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", localIllegalAccessException, "", new Object[0]);
      GMTrace.o(1641214377984L, 12228);
      return false;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", localNoSuchFieldException, "", new Object[0]);
      }
    }
  }
  
  public final void a(NumberPicker paramNumberPicker, int paramInt)
  {
    GMTrace.i(1641348595712L, 12229);
    if (paramNumberPicker == null)
    {
      GMTrace.o(1641348595712L, 12229);
      return;
    }
    Object localObject = (EditText)paramNumberPicker.findViewById(Resources.getSystem().getIdentifier("numberpicker_input", "id", "android"));
    ((EditText)localObject).setTextSize(0, getResources().getDimension(paramInt));
    paramInt = (int)((EditText)localObject).getTextSize();
    try
    {
      localObject = NumberPicker.class.getDeclaredField("mTextSize");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(paramNumberPicker, Integer.valueOf(paramInt));
      localObject = NumberPicker.class.getDeclaredField("mSelectorWheelPaint");
      ((Field)localObject).setAccessible(true);
      Paint localPaint = (Paint)((Field)localObject).get(paramNumberPicker);
      localPaint.setTextSize(paramInt);
      ((Field)localObject).set(paramNumberPicker, localPaint);
      GMTrace.o(1641348595712L, 12229);
      return;
    }
    catch (NoSuchFieldException paramNumberPicker)
    {
      w.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", paramNumberPicker, "", new Object[0]);
      GMTrace.o(1641348595712L, 12229);
      return;
    }
    catch (IllegalAccessException paramNumberPicker)
    {
      w.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", paramNumberPicker, "", new Object[0]);
      GMTrace.o(1641348595712L, 12229);
    }
  }
  
  public void onDateChanged(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1641080160256L, 12227);
    GMTrace.o(1641080160256L, 12227);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/MMSpinnerDatePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */