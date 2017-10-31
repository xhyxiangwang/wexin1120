package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.a.a;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMBaseActivity;

@com.tencent.mm.ui.base.a(19)
public class GameDetailUI
  extends MMBaseActivity
{
  public GameDetailUI()
  {
    GMTrace.i(12675924885504L, 94443);
    GMTrace.o(12675924885504L, 94443);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12676059103232L, 94444);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("game_app_id");
    Object localObject = com.tencent.mm.plugin.game.model.a.za(paramBundle);
    if ((((a.a)localObject).fJg == 2) && (!bg.mZ(((a.a)localObject).url))) {
      c.p(getBaseContext(), ((a.a)localObject).url, "game_center_detail");
    }
    for (;;)
    {
      finish();
      GMTrace.o(12676059103232L, 94444);
      return;
      int i = e.aEg();
      if (i == 2)
      {
        c.ac(this, paramBundle);
      }
      else if (i == 1)
      {
        c.c(this, getIntent().getExtras());
      }
      else
      {
        localObject = bg.bOa();
        if ((bg.mZ((String)localObject)) || (((String)localObject).toLowerCase().equals("cn"))) {
          c.ac(this, paramBundle);
        } else {
          c.c(this, getIntent().getExtras());
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */