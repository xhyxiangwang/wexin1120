package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public class CardTextPreference
  extends Preference
{
  private TextView YD;
  private TextView kBf;
  public int kBg;
  boolean kBh;
  Context mContext;
  
  public CardTextPreference(Context paramContext)
  {
    super(paramContext, null);
    GMTrace.i(4889820266496L, 36432);
    this.kBg = 0;
    this.kBh = true;
    this.mContext = paramContext;
    GMTrace.o(4889820266496L, 36432);
  }
  
  public CardTextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4890088701952L, 36434);
    this.kBg = 0;
    this.kBh = true;
    setLayoutResource(R.i.dap);
    this.mContext = paramContext;
    GMTrace.o(4890088701952L, 36434);
  }
  
  public CardTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(4889954484224L, 36433);
    this.kBg = 0;
    this.kBh = true;
    this.mContext = paramContext;
    GMTrace.o(4889954484224L, 36433);
  }
  
  private void dA(boolean paramBoolean)
  {
    GMTrace.i(4890625572864L, 36438);
    if (this.YD != null)
    {
      TextView localTextView = this.YD;
      Rect localRect = new Rect();
      localRect.left = localTextView.getPaddingLeft();
      localRect.right = localTextView.getPaddingRight();
      localRect.top = localTextView.getPaddingTop();
      localRect.bottom = localTextView.getPaddingBottom();
      this.YD.setSingleLine(paramBoolean);
      if (!paramBoolean)
      {
        localRect.top = this.mContext.getResources().getDimensionPixelOffset(R.f.aRS);
        localRect.bottom = this.mContext.getResources().getDimensionPixelOffset(R.f.aRS);
        localTextView = this.YD;
        if (localTextView == null)
        {
          GMTrace.o(4890625572864L, 36438);
          return;
        }
        localTextView.setPadding(localRect.left, localRect.top, localRect.right, localRect.bottom);
      }
    }
    GMTrace.o(4890625572864L, 36438);
  }
  
  public final void amo()
  {
    GMTrace.i(4890357137408L, 36436);
    if ((this.kBf != null) && (this.kBg != 0)) {
      this.kBf.setTextColor(this.kBg);
    }
    GMTrace.o(4890357137408L, 36436);
  }
  
  public final void amp()
  {
    GMTrace.i(4890491355136L, 36437);
    dA(false);
    this.kBh = false;
    GMTrace.o(4890491355136L, 36437);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(4890222919680L, 36435);
    super.onBindView(paramView);
    this.kBf = ((TextView)paramView.findViewById(16908304));
    this.YD = ((TextView)paramView.findViewById(16908310));
    amo();
    dA(this.kBh);
    GMTrace.o(4890222919680L, 36435);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/CardTextPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */