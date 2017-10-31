package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.game.c.bb;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  protected int mBs;
  
  public j()
  {
    GMTrace.i(12676864409600L, 94450);
    this.mBs = 0;
    GMTrace.o(12676864409600L, 94450);
  }
  
  private void a(Context paramContext, com.tencent.mm.plugin.game.model.c paramc)
  {
    GMTrace.i(12677401280512L, 94454);
    int i = 0;
    if (paramc.type == 1) {
      i = com.tencent.mm.plugin.game.d.c.aa(paramContext, paramc.mza);
    }
    for (;;)
    {
      ai.a(paramContext, paramc.scene, paramc.fKV, paramc.position, i, paramc.field_appId, this.mBs, paramc.fuy, paramc.mzp);
      GMTrace.o(12677401280512L, 94454);
      return;
      if (paramc.type == 0) {
        if ((paramc.aEa()) && (!bg.mZ(paramc.mzu.mDg)) && (!g.a(paramContext, paramc)))
        {
          i = com.tencent.mm.plugin.game.d.c.aa(paramContext, paramc.mzu.mDg);
        }
        else
        {
          if ((bg.mZ(paramc.fWD)) || (paramc.fWG != 4)) {
            break;
          }
          w.i("MicroMsg.GameItemClickListener", "Download via Google Play");
          q.aQ(paramContext, paramc.fWD);
          i = 25;
        }
      }
    }
    Bundle localBundle = new Bundle();
    localBundle.putCharSequence("game_app_id", paramc.field_appId);
    if (paramc.fKV == 1601) {
      localBundle.putInt("game_report_from_scene", this.mBs);
    }
    for (;;)
    {
      i = com.tencent.mm.plugin.game.d.c.a(paramContext, paramc.field_appId, paramc.mza, localBundle);
      break;
      localBundle.putInt("game_report_from_scene", paramc.fKV);
    }
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12677267062784L, 94453);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c)))
    {
      GMTrace.o(12677267062784L, 94453);
      return;
    }
    com.tencent.mm.plugin.game.model.c localc = (com.tencent.mm.plugin.game.model.c)paramView.getTag();
    a(paramView.getContext(), localc);
    GMTrace.o(12677267062784L, 94453);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(12677132845056L, 94452);
    paramAdapterView = paramAdapterView.getAdapter().getItem(paramInt);
    if ((paramAdapterView == null) || (!(paramAdapterView instanceof com.tencent.mm.plugin.game.model.c)))
    {
      GMTrace.o(12677132845056L, 94452);
      return;
    }
    paramAdapterView = (com.tencent.mm.plugin.game.model.c)paramAdapterView;
    if (bg.mZ(paramAdapterView.field_appId))
    {
      GMTrace.o(12677132845056L, 94452);
      return;
    }
    a(paramView.getContext(), paramAdapterView);
    GMTrace.o(12677132845056L, 94452);
  }
  
  public final void oz(int paramInt)
  {
    GMTrace.i(12676998627328L, 94451);
    this.mBs = paramInt;
    GMTrace.o(12676998627328L, 94451);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */