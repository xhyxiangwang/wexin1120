package com.tencent.mm.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.m;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.j;
import com.tencent.mm.ui.base.r;

public final class g
  extends r
{
  private View HB;
  private ProgressBar jyC;
  private Context mContext;
  private TextView vof;
  
  private g(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    GMTrace.i(1479079362560L, 11020);
    this.mContext = paramContext;
    this.HB = null;
    if (this.HB == null)
    {
      paramInt = R.i.dje;
      this.HB = View.inflate(this.mContext, paramInt, null);
      this.vof = ((TextView)this.HB.findViewById(R.h.ccB));
      this.jyC = ((ProgressBar)this.HB.findViewById(R.h.ccA));
      setCanceledOnTouchOutside(true);
    }
    GMTrace.o(1479079362560L, 11020);
  }
  
  public static Dialog a(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(1479616233472L, 11024);
    paramContext = new g(paramContext, R.m.fdt);
    paramContext.setMessage(paramCharSequence);
    paramContext.setCancelable(paramBoolean);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.show();
    GMTrace.o(1479616233472L, 11024);
    return paramContext;
  }
  
  public static Dialog a(Context paramContext, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(1479750451200L, 11025);
    View localView = View.inflate(paramContext, R.i.djf, null);
    paramContext = new j(paramContext, R.m.fds);
    paramContext.setCancelable(paramBoolean);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    GMTrace.o(1479750451200L, 11025);
    return paramContext;
  }
  
  public static Dialog b(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(19126294675456L, 142502);
    View localView = View.inflate(paramContext, R.i.djf, null);
    ((TextView)localView.findViewById(R.h.bBU)).setText(paramString);
    paramContext = new j(paramContext, R.m.fds);
    paramContext.setCancelable(false);
    paramContext.setContentView(localView);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    GMTrace.o(19126294675456L, 142502);
    return paramContext;
  }
  
  public static Dialog e(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(1479884668928L, 11026);
    View localView = View.inflate(paramContext, R.i.djf, null);
    paramContext = new j(paramContext, R.m.fds);
    paramContext.setCancelable(true);
    paramContext.setContentView(localView);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.setOnCancelListener(paramOnCancelListener);
    paramContext.show();
    GMTrace.o(1479884668928L, 11026);
    return paramContext;
  }
  
  public final void dismiss()
  {
    GMTrace.i(1480018886656L, 11027);
    try
    {
      super.dismiss();
      GMTrace.o(1480018886656L, 11027);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.WalletProgressDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(1480018886656L, 11027);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1479213580288L, 11021);
    super.onCreate(paramBundle);
    setContentView(this.HB, new LinearLayout.LayoutParams(-1, -1));
    paramBundle = getWindow().getAttributes();
    paramBundle.width = -2;
    paramBundle.height = -2;
    getWindow().addFlags(2);
    paramBundle.dimAmount = 0.65F;
    onWindowAttributesChanged(paramBundle);
    GMTrace.o(1479213580288L, 11021);
  }
  
  public final void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(1479347798016L, 11022);
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
    GMTrace.o(1479347798016L, 11022);
  }
  
  public final void setMessage(CharSequence paramCharSequence)
  {
    GMTrace.i(1479482015744L, 11023);
    this.vof.setText(paramCharSequence);
    GMTrace.o(1479482015744L, 11023);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */