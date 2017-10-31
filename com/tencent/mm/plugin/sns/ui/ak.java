package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class ak
{
  public String fxL;
  public a pDA;
  public boolean pYb;
  public int position;
  public bhc qFm;
  public View qFn;
  public View qFo;
  public MMPinProgressBtn qFp;
  public TextView qFq;
  public ImageView qrh;
  public TextView qrk;
  
  public ak()
  {
    GMTrace.i(8402700861440L, 62605);
    this.pYb = false;
    GMTrace.o(8402700861440L, 62605);
  }
  
  public final void a(bhc parambhc, int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(8402835079168L, 62606);
    this.qFm = parambhc;
    this.position = paramInt;
    this.fxL = paramString;
    this.pYb = paramBoolean;
    GMTrace.o(8402835079168L, 62606);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */