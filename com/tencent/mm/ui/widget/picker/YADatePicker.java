package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.a.a;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.BaseSavedState;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bw.a.a;
import com.tencent.mm.bw.a.e;
import com.tencent.mm.bw.a.f;
import com.tencent.mm.bw.a.j;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class YADatePicker
  extends FrameLayout
{
  private static final String Do;
  public final b wXs;
  
  static
  {
    GMTrace.i(18777999671296L, 139907);
    Do = YADatePicker.class.getSimpleName();
    GMTrace.o(18777999671296L, 139907);
  }
  
  public YADatePicker(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(18775046881280L, 139885);
    GMTrace.o(18775046881280L, 139885);
  }
  
  public YADatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.datePickerStyle);
    GMTrace.i(18775181099008L, 139886);
    GMTrace.o(18775181099008L, 139886);
  }
  
  public YADatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18775315316736L, 139887);
    this.wXs = new c(this, paramContext, paramAttributeSet, paramInt, 0);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.fdZ, paramInt, 0);
    paramInt = paramContext.getInt(a.j.wYM, 0);
    paramContext.recycle();
    if (paramInt != 0)
    {
      if ((paramInt <= 0) || (paramInt > 7)) {
        throw new IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
      }
      this.wXs.setFirstDayOfWeek(paramInt);
    }
    GMTrace.o(18775315316736L, 139887);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, d paramd)
  {
    GMTrace.i(18775583752192L, 139889);
    this.wXs.a(paramInt1, paramInt2, paramInt3, paramd);
    GMTrace.o(18775583752192L, 139889);
  }
  
  public final void cgJ()
  {
    GMTrace.i(18777194364928L, 139901);
    this.wXs.setCalendarViewShown(false);
    GMTrace.o(18777194364928L, 139901);
  }
  
  public final void cgK()
  {
    GMTrace.i(18777328582656L, 139902);
    this.wXs.setSpinnersShown(true);
    GMTrace.o(18777328582656L, 139902);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(18776657494016L, 139897);
    boolean bool = this.wXs.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
    GMTrace.o(18776657494016L, 139897);
    return bool;
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    GMTrace.i(18777462800384L, 139903);
    dispatchThawSelfOnly(paramSparseArray);
    GMTrace.o(18777462800384L, 139903);
  }
  
  public CharSequence getAccessibilityClassName()
  {
    GMTrace.i(18776925929472L, 139899);
    String str = YADatePicker.class.getName();
    GMTrace.o(18776925929472L, 139899);
    return str;
  }
  
  public int getDayOfMonth()
  {
    GMTrace.i(18775986405376L, 139892);
    int i = this.wXs.getDayOfMonth();
    GMTrace.o(18775986405376L, 139892);
    return i;
  }
  
  public int getMonth()
  {
    GMTrace.i(18775852187648L, 139891);
    int i = this.wXs.getMonth();
    GMTrace.o(18775852187648L, 139891);
    return i;
  }
  
  @a
  public b getUIDelegate()
  {
    GMTrace.i(18775449534464L, 139888);
    b localb = this.wXs;
    GMTrace.o(18775449534464L, 139888);
    return localb;
  }
  
  public int getYear()
  {
    GMTrace.i(18775717969920L, 139890);
    int i = this.wXs.getYear();
    GMTrace.o(18775717969920L, 139890);
    return i;
  }
  
  public boolean isEnabled()
  {
    GMTrace.i(18776523276288L, 139896);
    boolean bool = this.wXs.isEnabled();
    GMTrace.o(18776523276288L, 139896);
    return bool;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(18777060147200L, 139900);
    super.onConfigurationChanged(paramConfiguration);
    this.wXs.onConfigurationChanged(paramConfiguration);
    GMTrace.o(18777060147200L, 139900);
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    GMTrace.i(18776791711744L, 139898);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    this.wXs.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    GMTrace.o(18776791711744L, 139898);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    GMTrace.i(18777731235840L, 139905);
    paramParcelable = (View.BaseSavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.wXs.onRestoreInstanceState(paramParcelable);
    GMTrace.o(18777731235840L, 139905);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    GMTrace.i(18777597018112L, 139904);
    Parcelable localParcelable = super.onSaveInstanceState();
    localParcelable = this.wXs.b(localParcelable);
    GMTrace.o(18777597018112L, 139904);
    return localParcelable;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(18776389058560L, 139895);
    if (this.wXs.isEnabled() == paramBoolean)
    {
      GMTrace.o(18776389058560L, 139895);
      return;
    }
    super.setEnabled(paramBoolean);
    this.wXs.setEnabled(paramBoolean);
    GMTrace.o(18776389058560L, 139895);
  }
  
  public void setMaxDate(long paramLong)
  {
    GMTrace.i(18776254840832L, 139894);
    this.wXs.setMaxDate(paramLong);
    GMTrace.o(18776254840832L, 139894);
  }
  
  public void setMinDate(long paramLong)
  {
    GMTrace.i(18776120623104L, 139893);
    this.wXs.setMinDate(paramLong);
    GMTrace.o(18776120623104L, 139893);
  }
  
  private static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    private final int kcU;
    private final int kcV;
    private final int kcW;
    
    static
    {
      GMTrace.i(18773436268544L, 139873);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(18773436268544L, 139873);
    }
    
    private SavedState(Parcel paramParcel)
    {
      super();
      GMTrace.i(18772496744448L, 139866);
      this.kcU = paramParcel.readInt();
      this.kcV = paramParcel.readInt();
      this.kcW = paramParcel.readInt();
      GMTrace.o(18772496744448L, 139866);
    }
    
    private SavedState(Parcelable paramParcelable, int paramInt1, int paramInt2, int paramInt3)
    {
      super();
      GMTrace.i(18772362526720L, 139865);
      this.kcU = paramInt1;
      this.kcV = paramInt2;
      this.kcW = paramInt3;
      GMTrace.o(18772362526720L, 139865);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(18772630962176L, 139867);
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.kcU);
      paramParcel.writeInt(this.kcV);
      paramParcel.writeInt(this.kcW);
      GMTrace.o(18772630962176L, 139867);
    }
  }
  
  static abstract class a
    implements YADatePicker.b
  {
    protected Context mContext;
    protected YADatePicker wXt;
    protected Locale wXu;
    protected YADatePicker.d wXv;
    
    public a(YADatePicker paramYADatePicker, Context paramContext)
    {
      GMTrace.i(18772094091264L, 139863);
      this.wXt = paramYADatePicker;
      this.mContext = paramContext;
      e(Locale.getDefault());
      GMTrace.o(18772094091264L, 139863);
    }
    
    protected void e(Locale paramLocale)
    {
      GMTrace.i(18772228308992L, 139864);
      if (!paramLocale.equals(this.wXu)) {
        this.wXu = paramLocale;
      }
      GMTrace.o(18772228308992L, 139864);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd);
    
    public abstract Parcelable b(Parcelable paramParcelable);
    
    public abstract boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);
    
    public abstract int getDayOfMonth();
    
    public abstract int getMonth();
    
    public abstract int getYear();
    
    public abstract boolean isEnabled();
    
    public abstract void onConfigurationChanged(Configuration paramConfiguration);
    
    public abstract void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);
    
    public abstract void onRestoreInstanceState(Parcelable paramParcelable);
    
    public abstract void setCalendarViewShown(boolean paramBoolean);
    
    public abstract void setEnabled(boolean paramBoolean);
    
    public abstract void setFirstDayOfWeek(int paramInt);
    
    public abstract void setMaxDate(long paramLong);
    
    public abstract void setMinDate(long paramLong);
    
    public abstract void setSpinnersShown(boolean paramBoolean);
  }
  
  public static final class c
    extends YADatePicker.a
  {
    public Calendar jHo;
    private String[] jHp;
    private final EditText wXA;
    private final EditText wXB;
    private final EditText wXC;
    private final CalendarView wXD;
    private final java.text.DateFormat wXE;
    private int wXF;
    private Calendar wXG;
    private Calendar wXH;
    public Calendar wXI;
    private boolean wXJ;
    private final LinearLayout wXw;
    public final NumberPicker wXx;
    public final NumberPicker wXy;
    public final NumberPicker wXz;
    
    c(YADatePicker paramYADatePicker, Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
    {
      super(paramContext);
      GMTrace.i(18778402324480L, 139910);
      this.wXE = new SimpleDateFormat("MM/dd/yyyy");
      this.wXJ = true;
      this.wXt = paramYADatePicker;
      this.mContext = paramContext;
      e(Locale.getDefault());
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a.j.fdZ, paramInt1, 0);
      boolean bool1 = localTypedArray.getBoolean(a.j.wYQ, true);
      boolean bool2 = localTypedArray.getBoolean(a.j.wYK, true);
      paramInt1 = localTypedArray.getInt(a.j.wYR, 1900);
      paramInt2 = localTypedArray.getInt(a.j.wYL, 2100);
      paramYADatePicker = localTypedArray.getString(a.j.wYP);
      paramAttributeSet = localTypedArray.getString(a.j.wYO);
      int i = localTypedArray.getResourceId(a.j.wYN, a.f.wYi);
      localTypedArray.recycle();
      ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(i, this.wXt, true);
      paramContext = new NumberPicker.OnValueChangeListener()
      {
        public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(18771288784896L, 139857);
          YADatePicker.c.this.cgR();
          YADatePicker.c.this.jHo.setTimeInMillis(YADatePicker.c.this.wXI.getTimeInMillis());
          int i;
          if (paramAnonymousNumberPicker == YADatePicker.c.this.wXx)
          {
            i = YADatePicker.c.this.jHo.getActualMaximum(5);
            if ((paramAnonymousInt1 == i) && (paramAnonymousInt2 == 1)) {
              YADatePicker.c.this.jHo.add(5, 1);
            }
          }
          for (;;)
          {
            YADatePicker.c.this.ab(YADatePicker.c.this.jHo.get(1), YADatePicker.c.this.jHo.get(2), YADatePicker.c.this.jHo.get(5));
            YADatePicker.c.this.cgO();
            YADatePicker.c.this.cgP();
            YADatePicker.c.this.cgQ();
            GMTrace.o(18771288784896L, 139857);
            return;
            if ((paramAnonymousInt1 == 1) && (paramAnonymousInt2 == i))
            {
              YADatePicker.c.this.jHo.add(5, -1);
            }
            else
            {
              YADatePicker.c.this.jHo.add(5, paramAnonymousInt2 - paramAnonymousInt1);
              continue;
              if (paramAnonymousNumberPicker == YADatePicker.c.this.wXy)
              {
                if ((paramAnonymousInt1 == 11) && (paramAnonymousInt2 == 0)) {
                  YADatePicker.c.this.jHo.add(2, 1);
                } else if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 11)) {
                  YADatePicker.c.this.jHo.add(2, -1);
                } else {
                  YADatePicker.c.this.jHo.add(2, paramAnonymousInt2 - paramAnonymousInt1);
                }
              }
              else
              {
                if (paramAnonymousNumberPicker != YADatePicker.c.this.wXz) {
                  break;
                }
                YADatePicker.c.this.jHo.set(1, paramAnonymousInt2);
              }
            }
          }
          throw new IllegalArgumentException();
        }
      };
      this.wXw = ((LinearLayout)this.wXt.findViewById(a.e.wYh));
      this.wXD = ((CalendarView)this.wXt.findViewById(a.e.wYe));
      this.wXD.setOnDateChangeListener(new CalendarView.OnDateChangeListener()
      {
        public final void onSelectedDayChange(CalendarView paramAnonymousCalendarView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(18778268106752L, 139909);
          YADatePicker.c.this.ab(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3);
          YADatePicker.c.this.cgO();
          YADatePicker.c.this.cgQ();
          GMTrace.o(18778268106752L, 139909);
        }
      });
      this.wXx = ((NumberPicker)this.wXt.findViewById(a.e.kgN));
      this.wXx.setFormatter(new c());
      this.wXx.setOnLongPressUpdateInterval(100L);
      this.wXx.setOnValueChangedListener(paramContext);
      this.wXA = b.a(this.wXx);
      this.wXy = ((NumberPicker)this.wXt.findViewById(a.e.month));
      this.wXy.setMinValue(0);
      this.wXy.setMaxValue(this.wXF - 1);
      this.wXy.setDisplayedValues(this.jHp);
      this.wXy.setOnLongPressUpdateInterval(200L);
      this.wXy.setOnValueChangedListener(paramContext);
      this.wXB = b.a(this.wXy);
      this.wXz = ((NumberPicker)this.wXt.findViewById(a.e.year));
      this.wXz.setOnLongPressUpdateInterval(100L);
      this.wXz.setOnValueChangedListener(paramContext);
      this.wXC = b.a(this.wXz);
      if ((!bool1) && (!bool2)) {
        setSpinnersShown(true);
      }
      for (;;)
      {
        this.jHo.clear();
        if ((TextUtils.isEmpty(paramYADatePicker)) || (!a(paramYADatePicker, this.jHo))) {
          this.jHo.set(paramInt1, 0, 1);
        }
        setMinDate(this.jHo.getTimeInMillis());
        this.jHo.clear();
        if ((TextUtils.isEmpty(paramAttributeSet)) || (!a(paramAttributeSet, this.jHo))) {
          this.jHo.set(paramInt2, 11, 31);
        }
        setMaxDate(this.jHo.getTimeInMillis());
        this.wXI.setTimeInMillis(System.currentTimeMillis());
        a(this.wXI.get(1), this.wXI.get(2), this.wXI.get(5), null);
        cgN();
        if (this.wXt.getImportantForAccessibility() == 0) {
          this.wXt.setImportantForAccessibility(1);
        }
        GMTrace.o(18778402324480L, 139910);
        return;
        setSpinnersShown(bool1);
        setCalendarViewShown(bool2);
      }
    }
    
    private static Calendar a(Calendar paramCalendar, Locale paramLocale)
    {
      GMTrace.i(18780952461312L, 139929);
      if (paramCalendar == null)
      {
        paramCalendar = Calendar.getInstance(paramLocale);
        GMTrace.o(18780952461312L, 139929);
        return paramCalendar;
      }
      long l = paramCalendar.getTimeInMillis();
      paramCalendar = Calendar.getInstance(paramLocale);
      paramCalendar.setTimeInMillis(l);
      GMTrace.o(18780952461312L, 139929);
      return paramCalendar;
    }
    
    private static void a(NumberPicker paramNumberPicker, int paramInt1, int paramInt2)
    {
      GMTrace.i(18781891985408L, 139936);
      if (paramInt2 < paramInt1 - 1) {}
      for (paramInt1 = 5;; paramInt1 = 6)
      {
        paramNumberPicker = b.a(paramNumberPicker);
        if (paramNumberPicker != null) {
          paramNumberPicker.setImeOptions(paramInt1);
        }
        GMTrace.o(18781891985408L, 139936);
        return;
      }
    }
    
    private boolean a(String paramString, Calendar paramCalendar)
    {
      GMTrace.i(18781220896768L, 139931);
      try
      {
        paramCalendar.setTime(this.wXE.parse(paramString));
        GMTrace.o(18781220896768L, 139931);
        return true;
      }
      catch (ParseException paramCalendar)
      {
        YADatePicker.cgL();
        new StringBuilder("Date: ").append(paramString).append(" not in format: MM/dd/yyyy");
        GMTrace.o(18781220896768L, 139931);
      }
      return false;
    }
    
    private boolean cgM()
    {
      GMTrace.i(18780818243584L, 139928);
      boolean bool = Character.isDigit(this.jHp[0].charAt(0));
      GMTrace.o(18780818243584L, 139928);
      return bool;
    }
    
    private void cgN()
    {
      GMTrace.i(18781086679040L, 139930);
      this.wXw.removeAllViews();
      char[] arrayOfChar;
      if ((Build.VERSION.SDK_INT < 17) || (this.wXt.getLayoutDirection() == 0))
      {
        arrayOfChar = new char[3];
        char[] tmp39_38 = arrayOfChar;
        tmp39_38[0] = 121;
        char[] tmp45_39 = tmp39_38;
        tmp45_39[1] = 77;
        char[] tmp51_45 = tmp45_39;
        tmp51_45[2] = 100;
        tmp51_45;
      }
      int j;
      int i;
      for (;;)
      {
        j = arrayOfChar.length;
        i = 0;
        if (i >= j) {
          break;
        }
        switch (arrayOfChar[i])
        {
        default: 
          throw new IllegalArgumentException(Arrays.toString(arrayOfChar));
          arrayOfChar = android.text.format.DateFormat.getDateFormatOrder(this.wXt.getContext());
        }
      }
      this.wXw.addView(this.wXx);
      a(this.wXx, j, i);
      for (;;)
      {
        i += 1;
        break;
        this.wXw.addView(this.wXy);
        a(this.wXy, j, i);
        continue;
        this.wXw.addView(this.wXz);
        a(this.wXz, j, i);
      }
      GMTrace.o(18781086679040L, 139930);
    }
    
    public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
    {
      GMTrace.i(18778536542208L, 139911);
      ab(paramInt1, paramInt2, paramInt3);
      cgO();
      cgP();
      this.wXv = paramd;
      GMTrace.o(18778536542208L, 139911);
    }
    
    public final void ab(int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(18781355114496L, 139932);
      this.wXI.set(paramInt1, paramInt2, paramInt3);
      if (this.wXI.before(this.wXG))
      {
        this.wXI.setTimeInMillis(this.wXG.getTimeInMillis());
        GMTrace.o(18781355114496L, 139932);
        return;
      }
      if (this.wXI.after(this.wXH)) {
        this.wXI.setTimeInMillis(this.wXH.getTimeInMillis());
      }
      GMTrace.o(18781355114496L, 139932);
    }
    
    public final Parcelable b(Parcelable paramParcelable)
    {
      GMTrace.i(18780147154944L, 139923);
      paramParcelable = new YADatePicker.SavedState(paramParcelable, getYear(), getMonth(), getDayOfMonth(), (byte)0);
      GMTrace.o(18780147154944L, 139923);
      return paramParcelable;
    }
    
    public final void cgO()
    {
      GMTrace.i(18781489332224L, 139933);
      if (this.wXI.equals(this.wXG))
      {
        this.wXx.setMinValue(this.wXI.get(5));
        this.wXx.setMaxValue(this.wXI.getActualMaximum(5));
        this.wXx.setWrapSelectorWheel(false);
        this.wXy.setDisplayedValues(null);
        this.wXy.setMinValue(this.wXI.get(2));
        this.wXy.setMaxValue(this.wXI.getActualMaximum(2));
        this.wXy.setWrapSelectorWheel(false);
      }
      for (;;)
      {
        String[] arrayOfString = (String[])Arrays.copyOfRange(this.jHp, this.wXy.getMinValue(), this.wXy.getMaxValue() + 1);
        this.wXy.setDisplayedValues(arrayOfString);
        this.wXz.setMinValue(this.wXG.get(1));
        this.wXz.setMaxValue(this.wXH.get(1));
        this.wXz.setWrapSelectorWheel(false);
        this.wXz.setValue(this.wXI.get(1));
        this.wXy.setValue(this.wXI.get(2));
        this.wXx.setValue(this.wXI.get(5));
        if (cgM()) {
          this.wXB.setRawInputType(2);
        }
        GMTrace.o(18781489332224L, 139933);
        return;
        if (this.wXI.equals(this.wXH))
        {
          this.wXx.setMinValue(this.wXI.getActualMinimum(5));
          this.wXx.setMaxValue(this.wXI.get(5));
          this.wXx.setWrapSelectorWheel(false);
          this.wXy.setDisplayedValues(null);
          this.wXy.setMinValue(this.wXI.getActualMinimum(2));
          this.wXy.setMaxValue(this.wXI.get(2));
          this.wXy.setWrapSelectorWheel(false);
        }
        else
        {
          this.wXx.setMinValue(1);
          this.wXx.setMaxValue(this.wXI.getActualMaximum(5));
          this.wXx.setWrapSelectorWheel(true);
          this.wXy.setDisplayedValues(null);
          this.wXy.setMinValue(0);
          this.wXy.setMaxValue(11);
          this.wXy.setWrapSelectorWheel(true);
        }
      }
    }
    
    public final void cgP()
    {
      GMTrace.i(18781623549952L, 139934);
      this.wXD.setDate(this.wXI.getTimeInMillis(), false, false);
      GMTrace.o(18781623549952L, 139934);
    }
    
    public final void cgQ()
    {
      GMTrace.i(18781757767680L, 139935);
      this.wXt.sendAccessibilityEvent(4);
      if (this.wXv != null)
      {
        getYear();
        getMonth();
        getDayOfMonth();
      }
      GMTrace.o(18781757767680L, 139935);
    }
    
    public final void cgR()
    {
      GMTrace.i(18782026203136L, 139937);
      InputMethodManager localInputMethodManager = (InputMethodManager)this.wXt.getContext().getSystemService("input_method");
      if (localInputMethodManager != null)
      {
        if (localInputMethodManager.isActive(this.wXC))
        {
          this.wXC.clearFocus();
          localInputMethodManager.hideSoftInputFromWindow(this.wXt.getWindowToken(), 0);
          GMTrace.o(18782026203136L, 139937);
          return;
        }
        if (localInputMethodManager.isActive(this.wXB))
        {
          this.wXB.clearFocus();
          localInputMethodManager.hideSoftInputFromWindow(this.wXt.getWindowToken(), 0);
          GMTrace.o(18782026203136L, 139937);
          return;
        }
        if (localInputMethodManager.isActive(this.wXA))
        {
          this.wXA.clearFocus();
          localInputMethodManager.hideSoftInputFromWindow(this.wXt.getWindowToken(), 0);
        }
      }
      GMTrace.o(18782026203136L, 139937);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      GMTrace.i(18780415590400L, 139925);
      onPopulateAccessibilityEvent(paramAccessibilityEvent);
      GMTrace.o(18780415590400L, 139925);
      return true;
    }
    
    protected final void e(Locale paramLocale)
    {
      GMTrace.i(18780684025856L, 139927);
      super.e(paramLocale);
      this.jHo = a(this.jHo, paramLocale);
      this.wXG = a(this.wXG, paramLocale);
      this.wXH = a(this.wXH, paramLocale);
      this.wXI = a(this.wXI, paramLocale);
      this.wXF = (this.jHo.getActualMaximum(2) + 1);
      this.jHp = new DateFormatSymbols().getShortMonths();
      if (cgM())
      {
        this.jHp = new String[this.wXF];
        int i = 0;
        while (i < this.wXF)
        {
          this.jHp[i] = String.format("%d", new Object[] { Integer.valueOf(i + 1) });
          i += 1;
        }
      }
      GMTrace.o(18780684025856L, 139927);
    }
    
    public final int getDayOfMonth()
    {
      GMTrace.i(18778939195392L, 139914);
      int i = this.wXI.get(5);
      GMTrace.o(18778939195392L, 139914);
      return i;
    }
    
    public final int getMonth()
    {
      GMTrace.i(18778804977664L, 139913);
      int i = this.wXI.get(2);
      GMTrace.o(18778804977664L, 139913);
      return i;
    }
    
    public final int getYear()
    {
      GMTrace.i(18778670759936L, 139912);
      int i = this.wXI.get(1);
      GMTrace.o(18778670759936L, 139912);
      return i;
    }
    
    public final boolean isEnabled()
    {
      GMTrace.i(18779610284032L, 139919);
      boolean bool = this.wXJ;
      GMTrace.o(18779610284032L, 139919);
      return bool;
    }
    
    public final void onConfigurationChanged(Configuration paramConfiguration)
    {
      GMTrace.i(18780012937216L, 139922);
      e(paramConfiguration.locale);
      GMTrace.o(18780012937216L, 139922);
    }
    
    public final void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      GMTrace.i(18780549808128L, 139926);
      String str = DateUtils.formatDateTime(this.mContext, this.wXI.getTimeInMillis(), 20);
      paramAccessibilityEvent.getText().add(str);
      GMTrace.o(18780549808128L, 139926);
    }
    
    public final void onRestoreInstanceState(Parcelable paramParcelable)
    {
      GMTrace.i(18780281372672L, 139924);
      paramParcelable = (YADatePicker.SavedState)paramParcelable;
      ab(YADatePicker.SavedState.a(paramParcelable), YADatePicker.SavedState.b(paramParcelable), YADatePicker.SavedState.c(paramParcelable));
      cgO();
      cgP();
      GMTrace.o(18780281372672L, 139924);
    }
    
    public final void setCalendarViewShown(boolean paramBoolean)
    {
      GMTrace.i(18779744501760L, 139920);
      CalendarView localCalendarView = this.wXD;
      if (paramBoolean) {}
      for (int i = 0;; i = 8)
      {
        localCalendarView.setVisibility(i);
        GMTrace.o(18779744501760L, 139920);
        return;
      }
    }
    
    public final void setEnabled(boolean paramBoolean)
    {
      GMTrace.i(18779476066304L, 139918);
      this.wXx.setEnabled(paramBoolean);
      this.wXy.setEnabled(paramBoolean);
      this.wXz.setEnabled(paramBoolean);
      this.wXD.setEnabled(paramBoolean);
      this.wXJ = paramBoolean;
      GMTrace.o(18779476066304L, 139918);
    }
    
    public final void setFirstDayOfWeek(int paramInt)
    {
      GMTrace.i(18779073413120L, 139915);
      this.wXD.setFirstDayOfWeek(paramInt);
      GMTrace.o(18779073413120L, 139915);
    }
    
    public final void setMaxDate(long paramLong)
    {
      GMTrace.i(18779341848576L, 139917);
      this.jHo.setTimeInMillis(paramLong);
      if ((this.jHo.get(1) == this.wXH.get(1)) && (this.jHo.get(6) != this.wXH.get(6)))
      {
        GMTrace.o(18779341848576L, 139917);
        return;
      }
      this.wXH.setTimeInMillis(paramLong);
      this.wXD.setMaxDate(paramLong);
      if (this.wXI.after(this.wXH))
      {
        this.wXI.setTimeInMillis(this.wXH.getTimeInMillis());
        cgP();
      }
      cgO();
      GMTrace.o(18779341848576L, 139917);
    }
    
    public final void setMinDate(long paramLong)
    {
      GMTrace.i(18779207630848L, 139916);
      this.jHo.setTimeInMillis(paramLong);
      if ((this.jHo.get(1) == this.wXG.get(1)) && (this.jHo.get(6) != this.wXG.get(6)))
      {
        GMTrace.o(18779207630848L, 139916);
        return;
      }
      this.wXG.setTimeInMillis(paramLong);
      this.wXD.setMinDate(paramLong);
      if (this.wXI.before(this.wXG))
      {
        this.wXI.setTimeInMillis(this.wXG.getTimeInMillis());
        cgP();
      }
      cgO();
      GMTrace.o(18779207630848L, 139916);
    }
    
    public final void setSpinnersShown(boolean paramBoolean)
    {
      GMTrace.i(18779878719488L, 139921);
      LinearLayout localLinearLayout = this.wXw;
      if (paramBoolean) {}
      for (int i = 0;; i = 8)
      {
        localLinearLayout.setVisibility(i);
        GMTrace.o(18779878719488L, 139921);
        return;
      }
    }
  }
  
  public static abstract interface d {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/picker/YADatePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */