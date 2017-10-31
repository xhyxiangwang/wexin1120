package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i;

public final class r
  extends k
{
  public r(Context paramContext, h paramh, ViewGroup paramViewGroup)
  {
    super(paramContext, paramh, paramViewGroup);
    GMTrace.i(18579894304768L, 138431);
    GMTrace.o(18579894304768L, 138431);
  }
  
  protected final void d(Button paramButton)
  {
    GMTrace.i(18580028522496L, 138432);
    paramButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18579088998400L, 138425);
        r.this.biY();
        paramAnonymousView = (h)r.this.biZ();
        r.this.j(r.this.context, paramAnonymousView.qmQ);
        GMTrace.o(18579088998400L, 138425);
      }
    });
    GMTrace.o(18580028522496L, 138432);
  }
  
  public final void j(Context paramContext, long paramLong)
  {
    GMTrace.i(18580162740224L, 138433);
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_landig_pages_from_source", 14);
    localIntent.putExtra("sns_landig_pages_origin_from_source", biZ().qnB);
    localIntent.putExtra("sns_landing_pages_xml", "");
    localIntent.putExtra("sns_landing_pages_pageid", paramLong);
    localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
    localIntent.putExtra("sns_landing_pages_extra", "");
    localIntent.putExtra("sns_landing_pages_no_store", 0);
    localIntent.putExtra("sns_landing_pages_ux_info", biZ().qhb);
    localIntent.putExtra("sns_landing_is_native_sight_ad", biZ().qnC);
    d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
    GMTrace.o(18580162740224L, 138433);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */