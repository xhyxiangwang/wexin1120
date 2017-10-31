package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  extends b
{
  private LinearLayout lTO;
  public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g qpC;
  private View qpD;
  private ImageView qpE;
  private ImageView qps;
  private TextView qpt;
  private LinearLayout qpu;
  int qpv;
  
  public g(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.g paramg, ViewGroup paramViewGroup)
  {
    super(paramContext, paramg, paramViewGroup);
    GMTrace.i(8227680944128L, 61301);
    this.qpC = paramg;
    GMTrace.o(8227680944128L, 61301);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(16642058747904L, 123993);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(16642058747904L, 123993);
      return false;
    }
    try
    {
      paramJSONObject.put("clickCount", this.qpv);
      GMTrace.o(16642058747904L, 123993);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("AdLandingBorderedComp", paramJSONObject, "", new Object[0]);
      GMTrace.o(16642058747904L, 123993);
    }
    return false;
  }
  
  protected final int aWs()
  {
    GMTrace.i(8228083597312L, 61304);
    int i = i.g.pOq;
    GMTrace.o(8228083597312L, 61304);
    return i;
  }
  
  public final View biL()
  {
    GMTrace.i(8227815161856L, 61302);
    View localView = this.iiK;
    this.qpE = ((ImageView)localView.findViewById(i.f.pKn));
    this.qps = ((ImageView)localView.findViewById(i.f.pHs));
    this.qpt = ((TextView)localView.findViewById(i.f.bAw));
    this.qpu = ((LinearLayout)localView.findViewById(i.f.pKi));
    this.lTO = ((LinearLayout)localView.findViewById(i.f.byT));
    this.qpD = this.qpu;
    localView = this.iiK;
    GMTrace.o(8227815161856L, 61302);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8227949379584L, 61303);
    this.qpt.setText(this.qpC.qmP.nkk);
    if (this.qpC.qnw)
    {
      this.qpE.setImageDrawable(a.b(this.context, i.e.pGW));
      this.qps.setImageDrawable(a.b(this.context, i.e.pHt));
      this.qpt.setTextColor(-16777216);
      this.qpu.setBackgroundResource(i.e.pGD);
    }
    for (;;)
    {
      this.qpu.setPadding((int)this.qpC.qns, 0, (int)this.qpC.qnt, 0);
      this.lTO.setPadding(0, (int)this.qpC.qnq, 0, (int)this.qpC.qnr);
      a(this.qpu);
      View.OnClickListener local1 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8257343062016L, 61522);
          paramAnonymousView = g.this;
          paramAnonymousView.qpv += 1;
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("map_view_type", 1);
          paramAnonymousView.putExtra("kwebmap_slat", g.this.qpC.qmP.nki);
          paramAnonymousView.putExtra("kwebmap_lng", g.this.qpC.qmP.nkj);
          paramAnonymousView.putExtra("kwebmap_scale", g.this.qpC.qmP.fFj);
          paramAnonymousView.putExtra("kPoiName", g.this.qpC.qmP.fJh);
          paramAnonymousView.putExtra("Kwebmap_locaion", g.this.qpC.qmP.nkk);
          w.i("AdLandingBorderedComp", "locatint to slat " + g.this.qpC.qmP.nki + ", slong " + g.this.qpC.qmP.nkj + ", " + g.this.qpC.qmP.fJh);
          d.b(g.this.context, "location", ".ui.RedirectUI", paramAnonymousView, 2);
          GMTrace.o(8257343062016L, 61522);
        }
      };
      if (this.qpD != null) {
        this.qpD.setOnClickListener(local1);
      }
      GMTrace.o(8227949379584L, 61303);
      return;
      this.qpE.setImageDrawable(a.b(this.context, i.e.pGV));
      this.qps.setImageDrawable(a.b(this.context, i.e.pHs));
      this.qpt.setTextColor(-1);
      this.qpu.setBackgroundResource(i.e.pGE);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */