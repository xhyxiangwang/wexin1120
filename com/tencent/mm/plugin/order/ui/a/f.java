package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.order.c.a;
import com.tencent.mm.plugin.order.c.a.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.ui.base.preference.Preference;

public final class f
  extends Preference
{
  public View.OnClickListener lyc;
  private String mBh;
  private boolean mBl;
  private View mView;
  private int otA;
  private int otB;
  private int otC;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6647267196928L, 49526);
    this.mView = null;
    this.otA = Integer.MAX_VALUE;
    this.otB = -1;
    this.otC = -1;
    setLayoutResource(R.i.cZJ);
    GMTrace.o(6647267196928L, 49526);
  }
  
  public final void DM(String paramString)
  {
    GMTrace.i(6647669850112L, 49529);
    try
    {
      this.otA = Color.parseColor(paramString);
      GMTrace.o(6647669850112L, 49529);
      return;
    }
    catch (Exception paramString)
    {
      this.otA = Integer.MAX_VALUE;
      GMTrace.o(6647669850112L, 49529);
    }
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(6647938285568L, 49531);
    this.mBh = paramString;
    this.mBl = true;
    this.otB = paramInt1;
    this.otC = paramInt2;
    this.lyc = paramOnClickListener;
    GMTrace.o(6647938285568L, 49531);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6647401414656L, 49527);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6647401414656L, 49527);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6647535632384L, 49528);
    super.onBindView(paramView);
    Object localObject = (TextView)paramView.findViewById(R.h.bZO);
    paramView = (TextView)paramView.findViewById(R.h.bZN);
    ((TextView)localObject).setText(getTitle());
    if (this.otA != Integer.MAX_VALUE) {
      paramView.setTextColor(this.otA);
    }
    if (this.mBl)
    {
      if ((this.otB >= 0) && (this.otC > 0))
      {
        localObject = new a(this.mContext);
        SpannableString localSpannableString = new SpannableString(this.mBh);
        ((a)localObject).otT = new a.a()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6641630052352L, 49484);
            if (f.this.lyc != null) {
              f.this.lyc.onClick(paramAnonymousView);
            }
            GMTrace.o(6641630052352L, 49484);
          }
        };
        paramView.setMovementMethod(LinkMovementMethod.getInstance());
        localSpannableString.setSpan(localObject, this.otB, this.otC, 33);
        paramView.setText(localSpannableString);
        GMTrace.o(6647535632384L, 49528);
        return;
      }
      paramView.setTextColor(this.mContext.getResources().getColor(R.e.aPn));
      paramView.setOnClickListener(this.lyc);
      paramView.setText(h.b(this.mContext, this.mBh, paramView.getTextSize()));
      GMTrace.o(6647535632384L, 49528);
      return;
    }
    paramView.setOnClickListener(null);
    paramView.setText(h.b(this.mContext, this.mBh, paramView.getTextSize()));
    GMTrace.o(6647535632384L, 49528);
  }
  
  public final void setContent(String paramString)
  {
    GMTrace.i(6647804067840L, 49530);
    this.mBh = paramString;
    this.mBl = false;
    GMTrace.o(6647804067840L, 49530);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */