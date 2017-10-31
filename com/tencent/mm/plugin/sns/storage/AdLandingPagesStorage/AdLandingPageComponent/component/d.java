package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.pluginsdk.ui.d.c;
import com.tencent.mm.pluginsdk.ui.d.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends b
{
  LinearLayout lTO;
  private ImageView qpr;
  private ImageView qps;
  private TextView qpt;
  LinearLayout qpu;
  int qpv;
  
  public d(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d paramd, ViewGroup paramViewGroup)
  {
    super(paramContext, paramd, paramViewGroup);
    GMTrace.i(8269959528448L, 61616);
    GMTrace.o(8269959528448L, 61616);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(16642192965632L, 123994);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(16642192965632L, 123994);
      return false;
    }
    try
    {
      paramJSONObject.put("clickCount", this.qpv);
      GMTrace.o(16642192965632L, 123994);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("AdLandingBorderedComp", paramJSONObject, "", new Object[0]);
      GMTrace.o(16642192965632L, 123994);
    }
    return false;
  }
  
  protected final int aWs()
  {
    GMTrace.i(8270093746176L, 61617);
    int i = i.g.pOq;
    GMTrace.o(8270093746176L, 61617);
    return i;
  }
  
  public final View biL()
  {
    GMTrace.i(8270362181632L, 61619);
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.qpH).qmN.isEmpty())
    {
      GMTrace.o(8270362181632L, 61619);
      return null;
    }
    View localView = this.iiK;
    this.qpr = ((ImageView)localView.findViewById(i.f.pKn));
    this.qps = ((ImageView)localView.findViewById(i.f.pHs));
    this.qpt = ((TextView)localView.findViewById(i.f.bAw));
    this.lTO = ((LinearLayout)localView.findViewById(i.f.byT));
    this.qpu = ((LinearLayout)localView.findViewById(i.f.pKi));
    localView = this.iiK;
    GMTrace.o(8270362181632L, 61619);
    return localView;
  }
  
  public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d biQ()
  {
    GMTrace.i(16043447681024L, 119533);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d locald = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.qpH;
    GMTrace.o(16043447681024L, 119533);
    return locald;
  }
  
  protected final void biR()
  {
    GMTrace.i(8270227963904L, 61618);
    this.qpt.setText((CharSequence)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.qpH).qmN.get(0));
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.qpH).qnw)
    {
      this.qpr.setImageDrawable(a.b(this.context, i.e.pHI));
      this.qps.setImageDrawable(a.b(this.context, i.e.pHt));
      this.qpt.setTextColor(-16777216);
      this.qpu.setBackgroundResource(i.e.pGD);
    }
    for (;;)
    {
      this.qpu.setPadding((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.qpH).qns, 0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.qpH).qnt, 0);
      this.lTO.setPadding(0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.qpH).qnq, 0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.qpH).qnr);
      a(this.qpu);
      this.qpu.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8236405096448L, 61366);
          paramAnonymousView = d.this;
          paramAnonymousView.qpv += 1;
          if (c.a.tjc == null)
          {
            GMTrace.o(8236405096448L, 61366);
            return;
          }
          if (d.this.biQ().qmN.size() > 1)
          {
            c.a.tjc.a(d.this.context, d.this.biQ().qmN, new DialogInterface.OnDismissListener()
            {
              public final void onDismiss(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(17126316310528L, 127601);
                ab.df(d.this.context);
                GMTrace.o(17126316310528L, 127601);
              }
            });
            GMTrace.o(8236405096448L, 61366);
            return;
          }
          c.a.tjc.a(d.this.context, (String)d.this.biQ().qmN.get(0), new DialogInterface.OnDismissListener()new Bundle
          {
            public final void onDismiss(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(17130342842368L, 127631);
              ab.df(d.this.context);
              GMTrace.o(17130342842368L, 127631);
            }
          }, new Bundle());
          GMTrace.o(8236405096448L, 61366);
        }
      });
      GMTrace.o(8270227963904L, 61618);
      return;
      this.qpr.setImageDrawable(a.b(this.context, i.e.pHH));
      this.qps.setImageDrawable(a.b(this.context, i.e.pHs));
      this.qpt.setTextColor(-1);
      this.qpu.setBackgroundResource(i.e.pGE);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */