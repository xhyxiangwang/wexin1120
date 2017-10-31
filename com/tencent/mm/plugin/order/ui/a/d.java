package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.an.a.a;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.plugin.order.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.preference.Preference;

public final class d
  extends Preference
{
  String lsu;
  String mName;
  View.OnClickListener mOnClickListener;
  private View mView;
  
  public d(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6642435358720L, 49490);
    this.mView = null;
    setLayoutResource(R.i.cZH);
    GMTrace.o(6642435358720L, 49490);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6642569576448L, 49491);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6642569576448L, 49491);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6642703794176L, 49492);
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(R.h.bZK);
    TextView localTextView = (TextView)paramView.findViewById(R.h.bZL);
    localImageView.setImageBitmap(null);
    if (!bg.mZ(this.lsu))
    {
      Object localObject = new c.a();
      b.aVa();
      ((c.a)localObject).hCS = b.aKO();
      ((c.a)localObject).hCP = true;
      ((c.a)localObject).hDl = true;
      ((c.a)localObject).hDm = true;
      localObject = ((c.a)localObject).Jk();
      n.Ja().a(this.lsu, localImageView, (c)localObject);
    }
    localTextView.setText(this.mName);
    paramView.findViewById(R.h.bZJ).setOnClickListener(this.mOnClickListener);
    GMTrace.o(6642703794176L, 49492);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */