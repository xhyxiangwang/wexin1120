package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.n;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ay;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class u
  implements View.OnClickListener
{
  private c mBA;
  int mBs;
  private Context mContext;
  String mHt;
  private int mQA;
  
  public u(Context paramContext)
  {
    GMTrace.i(12731491024896L, 94857);
    this.mBs = 0;
    this.mHt = null;
    this.mContext = paramContext;
    GMTrace.o(12731491024896L, 94857);
  }
  
  private void aFJ()
  {
    GMTrace.i(12731759460352L, 94859);
    String str2 = this.mBA.fWI;
    String str1 = str2;
    if (!bg.mZ(str2)) {
      str1 = str2.replace("ANDROIDWX.GAMECENTER", "ANDROIDWX.YYB.GAMECENTER");
    }
    int i;
    if (this.mBA.status == 3)
    {
      ay.aEZ();
      ay.startToAuthorized(this.mContext, str1);
      i = 5;
      if (this.mBA.status == 3) {
        i = 10;
      }
      if (this.mQA != 4) {
        break label159;
      }
      i = 8;
    }
    label159:
    for (;;)
    {
      ai.a(this.mContext, this.mBA.scene, this.mBA.fKV, this.mBA.position, i, this.mBA.field_appId, this.mBs, this.mBA.fuy, this.mHt);
      GMTrace.o(12731759460352L, 94859);
      return;
      ay.aEZ();
      ay.Z(this.mContext, str1);
      break;
    }
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12731625242624L, 94858);
    if (!(paramView.getTag() instanceof c))
    {
      w.e("MicroMsg.GameTMAssistClickListener", "No GameAppInfo");
      GMTrace.o(12731625242624L, 94858);
      return;
    }
    this.mBA = ((c)paramView.getTag());
    w.i("MicroMsg.GameTMAssistClickListener", "Clicked appid = " + this.mBA.field_appId);
    if (g.n(this.mContext, this.mBA.field_appId))
    {
      w.d("MicroMsg.GameTMAssistClickListener", "launchFromWX, appId = " + this.mBA.field_appId + ", pkg = " + this.mBA.field_packageName + ", openId = " + this.mBA.field_openId);
      ai.a(this.mContext, this.mBA.scene, this.mBA.fKV, 1, 3, this.mBA.field_appId, this.mBs, this.mHt);
      e.V(this.mContext, this.mBA.field_appId);
      GMTrace.o(12731625242624L, 94858);
      return;
    }
    ay.aEZ();
    this.mQA = ay.zh(this.mBA.fWI);
    w.i("MicroMsg.GameTMAssistClickListener", "get download status:[%s]", new Object[] { Integer.valueOf(this.mQA) });
    switch (this.mQA)
    {
    default: 
      aFJ();
      GMTrace.o(12731625242624L, 94858);
      return;
    case 1: 
      aFJ();
      GMTrace.o(12731625242624L, 94858);
      return;
    case 2: 
      aFJ();
      GMTrace.o(12731625242624L, 94858);
      return;
    case 3: 
      aFJ();
      GMTrace.o(12731625242624L, 94858);
      return;
    case 4: 
      aFJ();
      GMTrace.o(12731625242624L, 94858);
      return;
    }
    aFJ();
    GMTrace.o(12731625242624L, 94858);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */