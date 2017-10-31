package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;

public class f
  extends ClickableSpan
{
  private int jsK;
  private Context mContext;
  int rE;
  public a rTY;
  
  public f(Context paramContext)
  {
    GMTrace.i(6961336680448L, 51866);
    this.mContext = null;
    this.rTY = null;
    this.rE = -1;
    this.jsK = -1;
    this.mContext = paramContext;
    this.rE = this.mContext.getResources().getColor(R.e.aQH);
    this.jsK = this.mContext.getResources().getColor(R.e.transparent);
    GMTrace.o(6961336680448L, 51866);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(6961470898176L, 51867);
    if (this.rTY != null) {
      this.rTY.onClick(paramView);
    }
    GMTrace.o(6961470898176L, 51867);
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    GMTrace.i(6961605115904L, 51868);
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setFakeBoldText(false);
    paramTextPaint.setColor(this.rE);
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.bgColor = this.jsK;
    GMTrace.o(6961605115904L, 51868);
  }
  
  public static abstract interface a
  {
    public abstract void onClick(View paramView);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */