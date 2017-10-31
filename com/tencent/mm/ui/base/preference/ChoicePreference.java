package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.u.a.g;
import com.tencent.mm.u.a.h;
import com.tencent.mm.u.a.m;
import java.util.HashMap;
import junit.framework.Assert;

public final class ChoicePreference
  extends Preference
{
  public int owl;
  private RadioGroup vNp;
  private CharSequence[] vNq;
  public CharSequence[] vNr;
  public Preference.a vNs;
  public String value;
  private final HashMap<CharSequence, b> values;
  
  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(3213306626048L, 23941);
    GMTrace.o(3213306626048L, 23941);
  }
  
  public ChoicePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3213440843776L, 23942);
    this.values = new HashMap();
    this.owl = -1;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.fdU, paramInt, 0);
    this.vNq = paramContext.getTextArray(a.m.gZb);
    this.vNr = paramContext.getTextArray(a.m.gZc);
    paramContext.recycle();
    bXZ();
    GMTrace.o(3213440843776L, 23942);
  }
  
  private void bXZ()
  {
    int i = 0;
    GMTrace.i(3213843496960L, 23945);
    if (this.vNq == null) {
      this.vNq = new CharSequence[0];
    }
    if (this.vNr == null) {
      this.vNr = new CharSequence[0];
    }
    if (this.vNq.length == this.vNr.length) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("entries count different", bool);
      this.values.clear();
      while (i < this.vNr.length)
      {
        b localb = new b(this.vNq[i], 1048576 + i);
        this.values.put(this.vNr[i], localb);
        i += 1;
      }
    }
    GMTrace.o(3213843496960L, 23945);
  }
  
  public final void a(Preference.a parama)
  {
    GMTrace.i(3213575061504L, 23943);
    this.vNs = parama;
    GMTrace.o(3213575061504L, 23943);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(3213977714688L, 23946);
    super.onBindView(paramView);
    if (this.vNp != null) {
      this.vNp.check(this.owl);
    }
    GMTrace.o(3213977714688L, 23946);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(3213709279232L, 23944);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    Object localObject = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    ((ViewGroup)localObject).removeAllViews();
    localLayoutInflater.inflate(a.h.gXL, (ViewGroup)localObject);
    this.vNp = ((RadioGroup)paramViewGroup.findViewById(a.g.bOe));
    int i = 0;
    if (i < this.vNr.length)
    {
      localObject = this.vNr[i];
      localObject = (b)this.values.get(localObject);
      RadioButton localRadioButton;
      if (localObject != null)
      {
        if (i != 0) {
          break label147;
        }
        localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.gXy, null);
        ((b)localObject).a(localRadioButton);
        this.vNp.addView(localRadioButton);
      }
      for (;;)
      {
        i += 1;
        break;
        label147:
        if (i == this.vNr.length - 1)
        {
          localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.gXA, null);
          ((b)localObject).a(localRadioButton);
          this.vNp.addView(localRadioButton);
        }
        else
        {
          localRadioButton = (RadioButton)localLayoutInflater.inflate(a.h.gXz, null);
          ((b)localObject).a(localRadioButton);
          this.vNp.addView(localRadioButton);
        }
      }
    }
    this.vNp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
      {
        GMTrace.i(3219212206080L, 23985);
        if (ChoicePreference.this.vNs != null) {
          if (paramAnonymousInt == -1) {
            break label98;
          }
        }
        label98:
        for (ChoicePreference.this.value = ChoicePreference.this.vNr[(paramAnonymousInt - 1048576)];; ChoicePreference.this.value = null)
        {
          ChoicePreference.this.owl = paramAnonymousInt;
          ChoicePreference.this.vNs.a(ChoicePreference.this, ChoicePreference.this.value);
          GMTrace.o(3219212206080L, 23985);
          return;
        }
      }
    });
    GMTrace.o(3213709279232L, 23944);
    return paramViewGroup;
  }
  
  public final void setValue(String paramString)
  {
    GMTrace.i(3214111932416L, 23947);
    this.value = paramString;
    paramString = (b)this.values.get(paramString);
    if (paramString == null)
    {
      this.owl = -1;
      GMTrace.o(3214111932416L, 23947);
      return;
    }
    this.owl = paramString.id;
    GMTrace.o(3214111932416L, 23947);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/base/preference/ChoicePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */