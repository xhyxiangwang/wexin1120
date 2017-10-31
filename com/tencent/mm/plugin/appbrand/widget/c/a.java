package com.tencent.mm.plugin.appbrand.widget.c;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.v;

public class a
  extends i
{
  private View iiK;
  public DialogInterface.OnShowListener jAr;
  private DialogInterface.OnDismissListener jAs;
  private DialogInterface.OnCancelListener jAt;
  boolean jAu;
  public b jAv;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18294144761856L, 136302);
    GMTrace.o(18294144761856L, 136302);
  }
  
  public a(Context paramContext, byte paramByte)
  {
    super(paramContext);
    GMTrace.i(18294278979584L, 136303);
    GMTrace.o(18294278979584L, 136303);
  }
  
  public void dismiss()
  {
    GMTrace.i(18295352721408L, 136311);
    if (this.jAv != null)
    {
      this.jAv.b(this);
      if (this.jAs != null) {
        this.jAs.onDismiss(this);
      }
    }
    GMTrace.o(18295352721408L, 136311);
  }
  
  public final View getContentView()
  {
    GMTrace.i(18294413197312L, 136304);
    if (this.iiK != null)
    {
      localView = this.iiK;
      GMTrace.o(18294413197312L, 136304);
      return localView;
    }
    View localView = super.getContentView();
    GMTrace.o(18294413197312L, 136304);
    return localView;
  }
  
  public final void onCancel()
  {
    GMTrace.i(18295218503680L, 136310);
    if (this.jAt != null) {
      this.jAt.onCancel(this);
    }
    GMTrace.o(18295218503680L, 136310);
  }
  
  public void setCanceledOnTouchOutside(boolean paramBoolean)
  {
    GMTrace.i(18295621156864L, 136313);
    super.setCanceledOnTouchOutside(paramBoolean);
    this.jAu = paramBoolean;
    GMTrace.o(18295621156864L, 136313);
  }
  
  public void setContentView(int paramInt)
  {
    GMTrace.i(18294547415040L, 136305);
    setContentView(v.fa(getContext()).inflate(paramInt, null));
    GMTrace.o(18294547415040L, 136305);
  }
  
  public void setContentView(View paramView)
  {
    GMTrace.i(18294681632768L, 136306);
    this.iiK = paramView;
    GMTrace.o(18294681632768L, 136306);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(18294815850496L, 136307);
    if (paramLayoutParams != null) {
      paramView.setLayoutParams(paramLayoutParams);
    }
    setContentView(paramView);
    GMTrace.o(18294815850496L, 136307);
  }
  
  public void setOnCancelListener(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(18295755374592L, 136314);
    super.setOnCancelListener(paramOnCancelListener);
    this.jAt = paramOnCancelListener;
    GMTrace.o(18295755374592L, 136314);
  }
  
  public void setOnDismissListener(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    GMTrace.i(18295486939136L, 136312);
    super.setOnDismissListener(paramOnDismissListener);
    this.jAs = paramOnDismissListener;
    GMTrace.o(18295486939136L, 136312);
  }
  
  public void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener)
  {
    GMTrace.i(18295084285952L, 136309);
    super.setOnShowListener(paramOnShowListener);
    this.jAr = paramOnShowListener;
    GMTrace.o(18295084285952L, 136309);
  }
  
  public void show()
  {
    GMTrace.i(18294950068224L, 136308);
    GMTrace.o(18294950068224L, 136308);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */