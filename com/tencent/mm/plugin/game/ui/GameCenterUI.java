package com.tencent.mm.plugin.game.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.ak;
import com.tencent.mm.plugin.game.c.z;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.g;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.a;
import com.tencent.mm.plugin.game.model.q.c;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.x.ap;
import java.net.URI;
import java.net.URISyntaxException;

@com.tencent.mm.ui.base.a(19)
public class GameCenterUI
  extends MMBaseActivity
{
  public GameCenterUI()
  {
    GMTrace.i(12742094225408L, 94936);
    GMTrace.o(12742094225408L, 94936);
  }
  
  private void J(Intent paramIntent)
  {
    GMTrace.i(16557770014720L, 123365);
    if (bg.bOi()) {
      w.i("MicroMsg.GameCenterUI", "GP version");
    }
    Object localObject;
    do
    {
      paramIntent = new Intent(this, GameCenterUI2.class);
      localObject = getIntent().getExtras();
      if (localObject != null) {
        paramIntent.putExtras((Bundle)localObject);
      }
      startActivity(paramIntent);
      overridePendingTransition(MMFragmentActivity.a.vqs, MMFragmentActivity.a.vqt);
      finish();
      GMTrace.o(16557770014720L, 123365);
      return;
      localObject = com.tencent.mm.plugin.game.model.a.aDW();
    } while ((((a.a)localObject).fJg != 2) || (bg.mZ(((a.a)localObject).url)));
    b(((a.a)localObject).url, paramIntent);
    GMTrace.o(16557770014720L, 123365);
  }
  
  private void b(String paramString, Intent paramIntent)
  {
    GMTrace.i(16557904232448L, 123366);
    boolean bool3 = paramIntent.getBooleanExtra("from_find_more_friend", false);
    int i = paramIntent.getIntExtra("game_report_from_scene", 0);
    boolean bool2 = false;
    SubCoreGameCenter.aFf();
    q localq = com.tencent.mm.plugin.game.model.t.aEt();
    boolean bool1 = bool2;
    if (localq != null)
    {
      localq.aEq();
      bool1 = bool2;
      if (!bg.mZ(localq.mAF.url)) {
        bool1 = true;
      }
    }
    w.i("MicroMsg.GameCenterUI", "hasFloatLayer = " + bool1);
    Uri localUri;
    if (bool1)
    {
      localUri = Uri.parse(paramString);
      paramIntent = localUri.getQuery();
      if (paramIntent != null) {
        paramIntent = paramIntent + "&h5FloatLayer=1";
      }
    }
    for (;;)
    {
      try
      {
        paramIntent = new URI(localUri.getScheme(), localUri.getAuthority(), localUri.getPath(), paramIntent, localUri.getFragment()).toString();
        paramString = paramIntent;
        w.i("MicroMsg.GameCenterUI", "abtest, url = %s", new Object[] { paramString });
        if (!bool3) {
          break label371;
        }
        com.tencent.mm.plugin.game.d.c.a(this, paramString, "game_center_entrance", true, localq, i);
        ap.AS();
        long l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWQ, Long.valueOf(0L))).longValue();
        paramString = SubCoreGameCenter.aFe().cw(l);
        if (paramString != null) {
          break label303;
        }
        ai.a(this, 9, 901, 1, 7, 0, ai.co("resource", "0"));
        SubCoreGameCenter.aFf();
        com.tencent.mm.plugin.game.model.t.aEs();
        finish();
        GMTrace.o(16557904232448L, 123366);
        return;
      }
      catch (URISyntaxException paramIntent)
      {
        w.printErrStackTrace("MicroMsg.GameCenterUI", paramIntent, "", new Object[0]);
      }
      paramIntent = "h5FloatLayer=1";
      continue;
      continue;
      label303:
      paramString.aEq();
      i = paramString.field_msgType;
      if (paramString.field_msgType == 100) {
        i = paramString.mAX;
      }
      ai.a(this, 9, 901, 1, 7, 0, paramString.field_appId, 0, i, paramString.field_gameMsgId, paramString.mAY, ai.co("resource", String.valueOf(paramString.mAq.mBf)));
      continue;
      label371:
      com.tencent.mm.plugin.game.d.c.a(this, paramString, "game_center_entrance", false, localq, i);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12742228443136L, 94937);
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      finish();
      GMTrace.o(12742228443136L, 94937);
      return;
    }
    if (localIntent.getBooleanExtra("game_check_float", false))
    {
      int i = localIntent.getIntExtra("game_sourceScene", 0);
      SubCoreGameCenter.aFf();
      paramBundle = com.tencent.mm.plugin.game.model.t.aEt();
      if (paramBundle != null)
      {
        paramBundle.aEq();
        if (!bg.mZ(paramBundle.mAF.url)) {
          com.tencent.mm.plugin.game.d.c.a(getBaseContext(), paramBundle, "game_center_h5_floatlayer");
        }
      }
      com.tencent.mm.plugin.game.d.c.a(paramBundle, i);
      finish();
      GMTrace.o(12742228443136L, 94937);
      return;
    }
    Object localObject = g.aEh();
    paramBundle = null;
    if (((g)localObject).mzK != null)
    {
      localObject = ((g)localObject).mzK.mEp;
      paramBundle = (Bundle)localObject;
      if (localObject != null)
      {
        w.i("MicroMsg.GameConfigManager", "getGameIndexSettingControl jumpType:%d, jumpUrl:%s", new Object[] { Integer.valueOf(((z)localObject).mDO), ((z)localObject).mDg });
        paramBundle = (Bundle)localObject;
      }
    }
    for (;;)
    {
      if (paramBundle != null) {}
      switch (paramBundle.mDO)
      {
      default: 
        J(localIntent);
        GMTrace.o(12742228443136L, 94937);
        return;
        ((g)localObject).QK();
      }
    }
    J(localIntent);
    GMTrace.o(12742228443136L, 94937);
    return;
    if (!bg.mZ(paramBundle.mDg))
    {
      b(paramBundle.mDg, localIntent);
      GMTrace.o(12742228443136L, 94937);
      return;
    }
    J(localIntent);
    GMTrace.o(12742228443136L, 94937);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */