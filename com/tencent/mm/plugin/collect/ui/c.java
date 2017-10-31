package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.n;
import com.tencent.mm.l.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import com.tencent.mm.x.ag.b.a;
import com.tencent.mm.x.ap;

public final class c
  extends Preference
{
  public String gDm;
  private TextView jpp;
  public ImageView kLU;
  private Context mContext;
  String mTitle;
  private View mView;
  
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5403471511552L, 40259);
    this.mView = null;
    this.jpp = null;
    this.kLU = null;
    this.gDm = null;
    this.mTitle = null;
    this.mContext = null;
    this.mContext = paramContext;
    setLayoutResource(R.i.cQS);
    GMTrace.o(5403471511552L, 40259);
  }
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext);
    GMTrace.i(5403605729280L, 40260);
    this.mView = null;
    this.jpp = null;
    this.kLU = null;
    this.gDm = null;
    this.mTitle = null;
    this.mContext = null;
    this.mContext = paramContext;
    setLayoutResource(paramInt);
    GMTrace.o(5403605729280L, 40260);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5403739947008L, 40261);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(5403739947008L, 40261);
    return paramView;
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(5403874164736L, 40262);
    super.onBindView(paramView);
    this.jpp = ((TextView)paramView.findViewById(16908310));
    this.kLU = ((ImageView)paramView.findViewById(R.h.bwF));
    this.jpp.setText(h.b(this.mContext, this.mTitle, this.jpp.getTextSize()));
    if (!bg.mZ(this.gDm))
    {
      this.kLU.setVisibility(0);
      ap.AS();
      paramView = com.tencent.mm.x.c.yL().SK(this.gDm);
      if ((paramView == null) || ((int)paramView.gLS <= 0))
      {
        w.d("MicroMsg.CollectPayInfoPreference", "Receiver in contactStg and try to get contact");
        final long l = bg.Pp();
        ag.a.hfr.a(this.gDm, "", new ag.b.a()
        {
          public final void p(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(5415416889344L, 40348);
            if (paramAnonymousBoolean)
            {
              w.v("MicroMsg.CollectPayInfoPreference", "getContact suc; cost=" + (bg.Pp() - l) + " ms");
              b.w(paramAnonymousString, 3);
              n.Dv().hD(paramAnonymousString);
            }
            for (;;)
            {
              a.b.a(c.this.kLU, c.this.gDm);
              GMTrace.o(5415416889344L, 40348);
              return;
              w.w("MicroMsg.CollectPayInfoPreference", "getContact failed");
            }
          }
        });
        GMTrace.o(5403874164736L, 40262);
        return;
      }
      a.b.a(this.kLU, this.gDm);
      GMTrace.o(5403874164736L, 40262);
      return;
    }
    this.kLU.setVisibility(8);
    GMTrace.o(5403874164736L, 40262);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */