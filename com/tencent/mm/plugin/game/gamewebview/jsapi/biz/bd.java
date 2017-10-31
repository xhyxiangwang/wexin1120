package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import org.json.JSONObject;

public final class bd
  extends a
{
  public static final int CTRL_BYTE = 237;
  public static final String NAME = "uploadMediaFile";
  private GameWebViewUI muD;
  public UploadMediaFileHelp mvp;
  
  public bd()
  {
    GMTrace.i(17069944864768L, 127181);
    this.mvp = new UploadMediaFileHelp();
    GMTrace.o(17069944864768L, 127181);
  }
  
  public final void a(final com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17070079082496L, 127182);
    w.i("MicroMsg.GameJsApiUploadMediaFile", "invoke");
    if (paramJSONObject == null)
    {
      paramd.v(paramInt, a.d("chooseVideo:fail_invalid_data", null));
      GMTrace.o(17070079082496L, 127182);
      return;
    }
    this.muD = paramd.aDm();
    String str1 = paramJSONObject.optString("appId");
    String str2 = paramJSONObject.optString("localId");
    if (paramJSONObject.optInt("isShowProgressTips", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.GameJsApiUploadMediaFile", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips = %b", new Object[] { str1, str2, Boolean.valueOf(bool) });
      if ((!bg.mZ(str1)) && (!bg.mZ(str2))) {
        break;
      }
      w.e("MicroMsg.GameJsApiUploadMediaFile", "appId or localid is null or nil.");
      paramd.v(paramInt, a.d("uploadMediaFile:fail_missing arguments", null));
      GMTrace.o(17070079082496L, 127182);
      return;
    }
    paramJSONObject = this.mvp;
    GameWebViewUI localGameWebViewUI = this.muD;
    UploadMediaFileHelp.b local1 = new UploadMediaFileHelp.b()
    {
      public final void a(boolean paramAnonymousBoolean, HashMap<String, Object> paramAnonymousHashMap)
      {
        GMTrace.i(17063233978368L, 127131);
        w.i("MicroMsg.GameJsApiUploadMediaFile", "sucess = %b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (paramAnonymousBoolean) {
          paramd.v(paramInt, bd.d("uploadMediaFile:ok", paramAnonymousHashMap));
        }
        for (;;)
        {
          paramAnonymousHashMap = bd.this.mvp;
          paramAnonymousHashMap.iqJ = null;
          paramAnonymousHashMap.muE = null;
          paramAnonymousHashMap.iqL = null;
          paramAnonymousHashMap.mvs = null;
          paramAnonymousHashMap.mvu = null;
          GMTrace.o(17063233978368L, 127131);
          return;
          paramAnonymousHashMap = paramd;
          int i = paramInt;
          bd localbd = bd.this;
          paramAnonymousHashMap.v(i, a.d("uploadMediaFile:fail", null));
        }
      }
    };
    paramJSONObject.iqJ = localGameWebViewUI;
    paramJSONObject.muE = paramd;
    paramJSONObject.iqL = str1;
    paramJSONObject.mvs = str2;
    paramJSONObject.mvt = bool;
    paramJSONObject.mvu = local1;
    paramd = this.mvp;
    paramJSONObject = com.tencent.mm.plugin.game.gamewebview.a.d.yG(paramd.mvs);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.UploadMediaFileHelp", "item is null");
      paramd.mvu.a(false, null);
      GMTrace.o(17070079082496L, 127182);
      return;
    }
    if (paramJSONObject.fzJ != 1)
    {
      if ((bg.mZ(paramJSONObject.iGk)) || (!e.aZ(paramJSONObject.iGk)))
      {
        w.e("MicroMsg.UploadMediaFileHelp", "origFilePath is not exist");
        paramd.mvu.a(false, null);
        GMTrace.o(17070079082496L, 127182);
        return;
      }
      if (!aa.bu(paramd.iqJ))
      {
        paramJSONObject = bg.eG(e.aY(paramJSONObject.iGk));
        h.a(paramd.iqJ, paramd.iqJ.getString(R.l.fbr, new Object[] { paramJSONObject }), paramd.iqJ.getString(R.l.dxm), false, new UploadMediaFileHelp.1(paramd), new UploadMediaFileHelp.2(paramd));
        GMTrace.o(17070079082496L, 127182);
        return;
      }
      paramd.aCS();
      GMTrace.o(17070079082496L, 127182);
      return;
    }
    paramd.aCT();
    GMTrace.o(17070079082496L, 127182);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */