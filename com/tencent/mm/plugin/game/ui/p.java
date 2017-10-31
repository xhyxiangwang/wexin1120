package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class p
  implements View.OnClickListener
{
  int kjz;
  protected Context mContext;
  String mOs;
  private com.tencent.mm.plugin.game.model.c mzY;
  
  public p(Context paramContext)
  {
    GMTrace.i(12746791845888L, 94971);
    this.mContext = paramContext;
    this.mOs = null;
    GMTrace.o(12746791845888L, 94971);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12746926063616L, 94972);
    if (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      w.e("MicroMsg.GamePreemptiveCliclListener", "No GameAppInfo");
      GMTrace.o(12746926063616L, 94972);
      return;
    }
    this.mzY = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
    w.i("MicroMsg.GamePreemptiveCliclListener", "Clicked appid = " + this.mzY.field_appId);
    if (g.n(this.mContext, this.mzY.field_appId))
    {
      w.d("MicroMsg.GamePreemptiveCliclListener", "launchFromWX, appId = " + this.mzY.field_appId + ", pkg = " + this.mzY.field_packageName + ", openId = " + this.mzY.field_openId);
      e.V(this.mContext, this.mzY.field_appId);
      ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 3, this.mzY.field_appId, this.kjz, this.mzY.fuy, this.mzY.mzp);
      GMTrace.o(12746926063616L, 94972);
      return;
    }
    w.i("MicroMsg.GamePreemptiveCliclListener", "get preemptive url:[%s]", new Object[] { this.mOs });
    if (!bg.mZ(this.mOs))
    {
      com.tencent.mm.plugin.game.d.c.aa(this.mContext, this.mOs);
      ai.a(this.mContext, this.mzY.scene, this.mzY.fKV, this.mzY.position, 11, this.mzY.field_appId, this.kjz, this.mzY.fuy, this.mzY.mzp);
      GMTrace.o(12746926063616L, 94972);
      return;
    }
    w.e("MicroMsg.GamePreemptiveCliclListener", "null or nill preemptive url");
    GMTrace.o(12746926063616L, 94972);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */