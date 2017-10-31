package com.tencent.mm.wallet_core.ui.formview;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnFocusChangeListener;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.n;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class EditHintPasswdView
  extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private static final int xhT;
  private View.OnFocusChangeListener inm;
  private int rwv;
  private TenpaySecureEditText xhU;
  private int xhV;
  private int xhW;
  public int xhX;
  public a xhY;
  
  static
  {
    GMTrace.i(1489950998528L, 11101);
    xhT = R.g.aYs;
    GMTrace.o(1489950998528L, 11101);
  }
  
  public EditHintPasswdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(1488474603520L, 11090);
    GMTrace.o(1488474603520L, 11090);
  }
  
  public EditHintPasswdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1488340385792L, 11089);
    this.xhU = null;
    this.xhV = 6;
    this.rwv = 1;
    this.xhW = xhT;
    this.xhX = 1;
    this.xhY = null;
    this.inm = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.fgj, paramInt, 0);
    this.rwv = paramAttributeSet.getInteger(R.n.fgm, 1);
    this.xhW = paramAttributeSet.getResourceId(R.n.fgk, xhT);
    this.xhX = paramAttributeSet.getInteger(R.n.fgl, 1);
    paramAttributeSet.recycle();
    this.xhU = ((TenpaySecureEditText)v.fa(paramContext).inflate(R.i.cXr, this, true).findViewById(R.h.cIF));
    b.a(this.xhU, this.rwv);
    switch (this.rwv)
    {
    case 2: 
    default: 
      w.i("MicroMsg.EditHintPasswdView", "hy: error or not set format. use default");
      paramInt = 6;
    }
    for (;;)
    {
      this.xhV = paramInt;
      if (this.xhU == null) {
        break;
      }
      this.xhU.setBackgroundResource(this.xhW);
      this.xhU.setImeOptions(6);
      this.xhU.setInputType(128);
      this.xhU.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(1486058684416L, 11072);
          if (EditHintPasswdView.b(EditHintPasswdView.this) != null) {
            EditHintPasswdView.b(EditHintPasswdView.this).gQ(EditHintPasswdView.c(EditHintPasswdView.this));
          }
          GMTrace.o(1486058684416L, 11072);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1485924466688L, 11071);
          GMTrace.o(1485924466688L, 11071);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1485790248960L, 11070);
          GMTrace.o(1485790248960L, 11070);
        }
      });
      this.xhU.setOnFocusChangeListener(this);
      super.setEnabled(true);
      super.setClickable(true);
      GMTrace.o(1488340385792L, 11089);
      return;
      paramInt = 6;
      continue;
      paramInt = 3;
      continue;
      paramInt = 4;
    }
    w.e("MicroMsg.EditHintPasswdView", "hy: no edit text view");
    GMTrace.o(1488340385792L, 11089);
  }
  
  private boolean QR()
  {
    GMTrace.i(1488743038976L, 11092);
    if ((this.xhU != null) && (this.xhU.getInputLength() == this.xhV))
    {
      GMTrace.o(1488743038976L, 11092);
      return true;
    }
    GMTrace.o(1488743038976L, 11092);
    return false;
  }
  
  public final void aYY()
  {
    GMTrace.i(1489279909888L, 11096);
    if (this.xhU != null) {
      this.xhU.ClearInput();
    }
    GMTrace.o(1489279909888L, 11096);
  }
  
  public final String cjt()
  {
    GMTrace.i(1488608821248L, 11091);
    if (this.xhU != null)
    {
      String str = aa.QW(this.xhU.getText().toString());
      GMTrace.o(1488608821248L, 11091);
      return str;
    }
    w.w("MicroMsg.EditHintPasswdView", "hy: edit view is null");
    GMTrace.o(1488608821248L, 11091);
    return "";
  }
  
  public final View.OnFocusChangeListener getOnFocusChangeListener()
  {
    GMTrace.i(1489011474432L, 11094);
    View.OnFocusChangeListener localOnFocusChangeListener = this.inm;
    GMTrace.o(1489011474432L, 11094);
    return localOnFocusChangeListener;
  }
  
  public final String getText()
  {
    GMTrace.i(1489145692160L, 11095);
    if (this.xhU != null)
    {
      String str = c.a.a(this.xhX, this.xhU);
      GMTrace.o(1489145692160L, 11095);
      return str;
    }
    w.w("MicroMsg.EditHintPasswdView", "hy: no edit view");
    GMTrace.o(1489145692160L, 11095);
    return "";
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(1489548345344L, 11098);
    if (this.inm != null) {
      this.inm.onFocusChange(this, paramBoolean);
    }
    if (this.xhY != null) {
      this.xhY.gQ(QR());
    }
    GMTrace.o(1489548345344L, 11098);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1489414127616L, 11097);
    setMeasuredDimension(getDefaultSize(BackwardSupportUtil.b.a(getContext(), 960.0F), paramInt1), getDefaultSize(BackwardSupportUtil.b.a(getContext(), 720.0F), paramInt2));
    paramInt2 = getMeasuredWidth();
    if (this.xhV == 0) {}
    for (paramInt1 = paramInt2 / 6;; paramInt1 = paramInt2 / this.xhV)
    {
      int i = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      int j = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      setMeasuredDimension(getDefaultSize(paramInt2, i), getDefaultSize(paramInt1, j));
      super.onMeasure(i, j);
      GMTrace.o(1489414127616L, 11097);
      return;
    }
  }
  
  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(1488877256704L, 11093);
    this.inm = paramOnFocusChangeListener;
    GMTrace.o(1488877256704L, 11093);
  }
  
  public static abstract interface a
  {
    public abstract void gQ(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/formview/EditHintPasswdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */