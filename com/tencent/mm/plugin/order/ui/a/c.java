package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bq.a;
import com.tencent.mm.ui.base.preference.Preference;

public final class c
  extends Preference
{
  Bitmap hkH;
  View.OnClickListener mOnClickListener;
  private View mView;
  private TextView ooZ;
  private ImageView otx;
  String oty;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6648206721024L, 49533);
    this.mView = null;
    this.oty = "";
    this.hkH = null;
    setLayoutResource(R.i.cZG);
    GMTrace.o(6648206721024L, 49533);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6648340938752L, 49534);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6648340938752L, 49534);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6648475156480L, 49535);
    super.onBindView(paramView);
    this.ooZ = ((TextView)paramView.findViewById(R.h.bZI));
    this.otx = ((ImageView)paramView.findViewById(R.h.bZH));
    this.ooZ.setText(this.oty);
    this.otx.setImageBitmap(this.hkH);
    this.otx.setOnClickListener(this.mOnClickListener);
    if ((this.oty != null) && (this.oty.length() > 48)) {
      this.ooZ.setTextSize(0, a.U(this.mContext, R.f.aRQ));
    }
    GMTrace.o(6648475156480L, 49535);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */