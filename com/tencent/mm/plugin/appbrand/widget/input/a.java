package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.input.b.c;
import com.tencent.mm.plugin.appbrand.widget.input.b.g;
import com.tencent.mm.plugin.appbrand.widget.input.b.h;
import com.tencent.mm.sdk.platformtools.bg;

 enum a
{
  static
  {
    GMTrace.i(10070624567296L, 75032);
    jAI = new a[0];
    GMTrace.o(10070624567296L, 75032);
  }
  
  static <Input extends EditText,  extends x> void a(Input paramInput, h paramh)
  {
    GMTrace.i(18287970746368L, 136256);
    if ((paramInput == null) || (paramh == null))
    {
      GMTrace.o(18287970746368L, 136256);
      return;
    }
    if ((paramh.jGh != null) && (paramh.jGh.intValue() != paramInput.getTextSize())) {
      paramInput.setTextSize(paramh.jGh.intValue());
    }
    if (paramh.jGg != null) {
      paramInput.setTextColor(paramh.jGg.intValue());
    }
    if ((paramh.jGf != null) && ((paramInput.getBackground() == null) || (!(paramInput.getBackground() instanceof ColorDrawable)) || (((ColorDrawable)paramInput.getBackground()).getColor() != paramh.jGf.intValue()))) {
      paramInput.setBackground(new ColorDrawable(paramh.jGf.intValue()));
    }
    Object localObject;
    if (!bg.mZ(paramh.jGl))
    {
      localObject = new SpannableStringBuilder(paramh.jGl);
      int i = paramh.jGl.length();
      ((SpannableStringBuilder)localObject).setSpan(new StyleSpan(c.sB(paramh.jGm).style), 0, i, 18);
      if (paramh.jGo != null) {
        ((SpannableStringBuilder)localObject).setSpan(new ForegroundColorSpan(paramh.jGo.intValue()), 0, i, 18);
      }
      if (paramh.jGn != null) {
        ((SpannableStringBuilder)localObject).setSpan(new AbsoluteSizeSpan(paramh.jGn.intValue(), false), 0, i, 18);
      }
      paramInput.setHint((CharSequence)localObject);
    }
    if (paramh.jGj != null)
    {
      localObject = Typeface.create("sans-serif", c.sB(paramh.jGj).style);
      if (localObject != null) {
        paramInput.setTypeface((Typeface)localObject);
      }
    }
    g.sC(paramh.jGe).a((x)paramInput);
    if ((paramh.jGq != null) && (paramh.jGq.booleanValue())) {
      paramInput.setVisibility(8);
    }
    for (;;)
    {
      if ((paramh.jGu != null) && (paramh.jGu.booleanValue())) {
        ((x)paramInput).cV(true);
      }
      GMTrace.o(18287970746368L, 136256);
      return;
      paramInput.setVisibility(0);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */