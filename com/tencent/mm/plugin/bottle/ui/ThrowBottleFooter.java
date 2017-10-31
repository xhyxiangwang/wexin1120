package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

public class ThrowBottleFooter
  extends LinearLayout
{
  a kij;
  
  public ThrowBottleFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7629472530432L, 56844);
    GMTrace.o(7629472530432L, 56844);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(7629606748160L, 56845);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.kij != null) {
      this.kij.ahu();
    }
    GMTrace.o(7629606748160L, 56845);
  }
  
  public static abstract interface a
  {
    public abstract void ahu();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/ThrowBottleFooter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */