package com.tencent.mm.plugin.order.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;

public final class a
  extends ClickableSpan
{
  private int jsK;
  private Context mContext;
  public a otT;
  private int rE;
  
  public a(Context paramContext)
  {
    GMTrace.i(6662970671104L, 49643);
    this.mContext = null;
    this.otT = null;
    this.rE = -1;
    this.jsK = -1;
    this.mContext = paramContext;
    this.rE = this.mContext.getResources().getColor(R.e.aPn);
    this.jsK = -1;
    GMTrace.o(6662970671104L, 49643);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(6663104888832L, 49644);
    if (this.otT != null) {
      this.otT.onClick(paramView);
    }
    GMTrace.o(6663104888832L, 49644);
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    GMTrace.i(6663239106560L, 49645);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setFakeBoldText(true);
    paramTextPaint.setColor(this.rE);
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.bgColor = this.jsK;
    GMTrace.o(6663239106560L, 49645);
  }
  
  public static abstract interface a
  {
    public abstract void onClick(View paramView);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */