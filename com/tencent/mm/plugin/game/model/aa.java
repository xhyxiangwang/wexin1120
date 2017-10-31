package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.co;
import com.tencent.mm.plugin.game.c.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class aa
{
  public aa()
  {
    GMTrace.i(12597139079168L, 93856);
    GMTrace.o(12597139079168L, 93856);
  }
  
  public static c a(com.tencent.mm.plugin.game.c.c paramc)
  {
    GMTrace.i(12597273296896L, 93857);
    if (paramc == null)
    {
      w.e("MicroMsg.GamePBData", "Invalid pb object");
      GMTrace.o(12597273296896L, 93857);
      return null;
    }
    if (bg.mZ(paramc.mCH))
    {
      w.e("MicroMsg.GamePBData", "No AppID field, abort");
      GMTrace.o(12597273296896L, 93857);
      return null;
    }
    w.i("MicroMsg.GamePBData", "Parsing AppID: %s", new Object[] { paramc.mCH });
    c localc = new c();
    localc.field_appId = paramc.mCH;
    localc.field_appName = paramc.mCJ;
    localc.field_appIconUrl = paramc.mCI;
    localc.field_appType = ",1,";
    localc.field_packageName = paramc.mCM;
    localc.field_appVersion = paramc.jXO;
    localc.field_appInfoFlag = paramc.mCP;
    if (paramc.mCO != null)
    {
      localc.bS(paramc.mCO.mDt);
      localc.bV(paramc.mCO.mDu);
      localc.dg(paramc.mCO.mDx);
      localc.bW(paramc.mCO.mDv);
      localc.mzr = paramc.mCO.mDz;
      localc.mzs = paramc.mCO.mDy;
      localc.fCC = paramc.mCO.mDA;
    }
    if ((paramc.mCO != null) && (paramc.mCO.mDw != null))
    {
      localc.cb(paramc.mCO.mDw.mDt);
      localc.cc(paramc.mCO.mDw.mGK);
      localc.bZ(paramc.mCO.mDw.mGL);
      localc.ca(paramc.mCO.mDw.mGM);
      localc.dh(paramc.mCO.mDw.mGO);
    }
    localc.myY = paramc.mCK;
    localc.myX = paramc.mCL;
    localc.status = paramc.jXo;
    localc.mza = paramc.mCE;
    localc.versionCode = paramc.mCN;
    localc.fuy = paramc.mCG;
    localc.mzc = paramc.mCQ;
    localc.mzk = paramc.mCV;
    if ((paramc.mCO != null) && (paramc.mCO.mDw != null))
    {
      localc.mzd = paramc.mCO.mDw.mGN;
      localc.mze = paramc.mCO.mDw.mGP;
      localc.mzf = paramc.mCO.mDw.mGQ;
    }
    localc.mzt = paramc.mCX;
    localc.mzu = paramc.mCY;
    GMTrace.o(12597273296896L, 93857);
    return localc;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */