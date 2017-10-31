package com.tencent.mm.pluginsdk.ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;

public class WalletIconImageView
  extends ImageView
{
  private int le;
  private int tnR;
  private View.OnClickListener tnS;
  
  public WalletIconImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(1163533484032L, 8669);
    GMTrace.o(1163533484032L, 8669);
  }
  
  public WalletIconImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1163399266304L, 8668);
    this.tnR = -1;
    this.le = 4;
    this.tnS = null;
    GMTrace.o(1163399266304L, 8668);
  }
  
  public final void bKE()
  {
    GMTrace.i(1164204572672L, 8674);
    super.setVisibility(this.le);
    super.setImageResource(this.tnR);
    super.setOnClickListener(this.tnS);
    GMTrace.o(1164204572672L, 8674);
  }
  
  public final void g(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1164070354944L, 8673);
    super.setVisibility(0);
    super.setImageResource(R.g.aZM);
    super.setContentDescription(getContext().getString(R.l.bvk));
    super.setOnClickListener(paramOnClickListener);
    GMTrace.o(1164070354944L, 8673);
  }
  
  public void setImageResource(int paramInt)
  {
    GMTrace.i(1163667701760L, 8670);
    this.tnR = paramInt;
    super.setImageResource(paramInt);
    GMTrace.o(1163667701760L, 8670);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1163936137216L, 8672);
    this.tnS = paramOnClickListener;
    GMTrace.o(1163936137216L, 8672);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(1163801919488L, 8671);
    this.le = paramInt;
    super.setVisibility(paramInt);
    GMTrace.o(1163801919488L, 8671);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/wallet/WalletIconImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */