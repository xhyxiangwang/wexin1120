package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.protocal.c.amu;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static final List<amu> sxu;
  
  static
  {
    GMTrace.i(18083557146624L, 134733);
    sxu = new LinkedList();
    amu localamu = new amu();
    localamu.fuw = ab.getResources().getString(R.l.edD);
    localamu.osy = "game_menu_icon_share_to_friend";
    localamu.uiN = 1;
    localamu.uiM = 1;
    localamu.tSa = c.a.sxD.code;
    sxu.add(localamu);
    localamu = new amu();
    localamu.fuw = ab.getResources().getString(R.l.edB);
    localamu.osy = "game_menu_icon_exit";
    localamu.uiN = 2;
    localamu.uiM = 2;
    localamu.tSa = c.a.sxC.code;
    sxu.add(localamu);
    localamu = new amu();
    localamu.fuw = ab.getResources().getString(R.l.edF);
    localamu.osy = "game_menu_icon_stick_on";
    localamu.uiN = 3;
    localamu.uiM = 3;
    localamu.tSa = c.a.sxF.code;
    sxu.add(localamu);
    localamu = new amu();
    localamu.fuw = ab.getResources().getString(R.l.edE);
    localamu.osy = "game_menu_icon_stick_off";
    localamu.uiN = 3;
    localamu.uiM = 4;
    localamu.tSa = c.a.sxG.code;
    sxu.add(localamu);
    localamu = new amu();
    localamu.fuw = ab.getResources().getString(R.l.edC);
    localamu.osy = "game_menu_icon_refresh";
    localamu.uiN = 4;
    localamu.uiM = 5;
    localamu.tSa = c.a.sxH.code;
    sxu.add(localamu);
    localamu = new amu();
    localamu.fuw = ab.getResources().getString(R.l.edz);
    localamu.osy = "game_menu_icon_collect";
    localamu.uiN = 5;
    localamu.uiM = 6;
    localamu.tSa = c.a.sxE.code;
    sxu.add(localamu);
    localamu = new amu();
    localamu.fuw = ab.getResources().getString(R.l.edA);
    localamu.osy = "game_menu_icon_complaint";
    localamu.uiN = 6;
    localamu.uiM = 7;
    localamu.tSa = c.a.sxJ.code;
    sxu.add(localamu);
    localamu = new amu();
    localamu.fuw = ab.getResources().getString(R.l.edy);
    localamu.osy = "game_menu_icon_add_to_desktop";
    localamu.uiN = 7;
    localamu.uiM = 8;
    localamu.tSa = c.a.sxI.code;
    sxu.add(localamu);
    GMTrace.o(18083557146624L, 134733);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */