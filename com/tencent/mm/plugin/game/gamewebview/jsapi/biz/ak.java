package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.c;
import com.tencent.mm.plugin.webview.ui.tools.e;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.ahr;
import com.tencent.mm.protocal.c.ahx;
import com.tencent.mm.protocal.c.ahy;
import com.tencent.mm.protocal.c.blf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ak
  extends a
{
  public static final int CTRL_BYTE = -3;
  public static final String NAME = "preVerifyJSAPI";
  
  public ak()
  {
    GMTrace.i(17032363900928L, 126901);
    GMTrace.o(17032363900928L, 126901);
  }
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17032498118656L, 126902);
    w.i("MicroMsg.GameJsApiPreVerify", "invoke");
    String str1 = paramJSONObject.optString("verifyAppId");
    String str2 = paramJSONObject.optString("verifySignature");
    String str3 = paramJSONObject.optString("verifyNonceStr");
    String str4 = paramJSONObject.optString("verifyTimestamp");
    String str5 = paramJSONObject.optString("verifySignType");
    Object localObject1 = paramJSONObject.optJSONArray("verifyJsApiList");
    w.i("MicroMsg.GameJsApiPreVerify", "appid : %s, %s, %s, %s, %s", new Object[] { str1, str2, str3, str4, str5 });
    paramJSONObject = paramd.aDp();
    LinkedList localLinkedList = new LinkedList();
    try
    {
      w.i("MicroMsg.GameJsApiPreVerify", "jsItem length %s", new Object[] { Integer.valueOf(((JSONArray)localObject1).length()) });
      if (((JSONArray)localObject1).length() == 0)
      {
        paramd.v(paramInt, "checkJsApi:param is empty");
        GMTrace.o(17032498118656L, 126902);
        return;
      }
      int i = 0;
      while (i < ((JSONArray)localObject1).length())
      {
        localObject2 = ((JSONArray)localObject1).getString(i);
        if (!bg.mZ((String)localObject2)) {
          localLinkedList.add(localObject2);
        }
        i += 1;
      }
      if (bg.mZ(str1)) {
        break label270;
      }
    }
    catch (Exception paramJSONObject)
    {
      w.w("MicroMsg.GameJsApiPreVerify", "exception occur " + paramJSONObject.getMessage());
      paramd.v(paramInt, "pre_verify_jsapi:fail");
      GMTrace.o(17032498118656L, 126902);
      return;
    }
    if ((localLinkedList.size() <= 0) || (bg.mZ(paramJSONObject)))
    {
      label270:
      w.e("MicroMsg.GameJsApiPreVerify", "handlePreVerify wrong args, %s", new Object[] { str1 });
      paramd.v(paramInt, a.d("pre_verify_jsapi:fail_invalid_args", null));
      GMTrace.o(17032498118656L, 126902);
      return;
    }
    localObject1 = new com.tencent.mm.ac.b.a();
    ((com.tencent.mm.ac.b.a)localObject1).hlX = new ahx();
    ((com.tencent.mm.ac.b.a)localObject1).hlY = new ahy();
    ((com.tencent.mm.ac.b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/jsapi-preverify";
    ((com.tencent.mm.ac.b.a)localObject1).hlW = 1093;
    ((com.tencent.mm.ac.b.a)localObject1).hlZ = 0;
    ((com.tencent.mm.ac.b.a)localObject1).hma = 0;
    localObject1 = ((com.tencent.mm.ac.b.a)localObject1).DA();
    Object localObject2 = (ahx)((com.tencent.mm.ac.b)localObject1).hlU.hmc;
    ((ahx)localObject2).url = paramJSONObject;
    ((ahx)localObject2).fKY = str1;
    ((ahx)localObject2).ucX = localLinkedList;
    ((ahx)localObject2).fwH = str4;
    ((ahx)localObject2).ucJ = str3;
    ((ahx)localObject2).signature = str2;
    ((ahx)localObject2).ucK = str5;
    com.tencent.mm.ipcinvoker.wx_extension.b.a((com.tencent.mm.ac.b)localObject1, new a(paramd, paramInt, str1));
    GMTrace.o(17032498118656L, 126902);
  }
  
  private static final class a
    implements com.tencent.mm.ipcinvoker.wx_extension.b.a
  {
    private String appId;
    private int iQC;
    private com.tencent.mm.plugin.game.gamewebview.ui.d mtZ;
    
    a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, int paramInt, String paramString)
    {
      GMTrace.i(20361500426240L, 151705);
      this.mtZ = paramd;
      this.iQC = paramInt;
      this.appId = paramString;
      GMTrace.o(20361500426240L, 151705);
    }
    
    private void qb(String paramString)
    {
      GMTrace.i(20361768861696L, 151707);
      this.mtZ.v(this.iQC, paramString);
      this.mtZ = null;
      this.appId = null;
      GMTrace.o(20361768861696L, 151707);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.b paramb)
    {
      GMTrace.i(20361634643968L, 151706);
      if (this.mtZ == null)
      {
        GMTrace.o(20361634643968L, 151706);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.GameJsApiPreVerify", "errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        qb(com.tencent.mm.plugin.game.gamewebview.a.d.yF("pre_verify_jsapi:fail_" + paramString));
        GMTrace.o(20361634643968L, 151706);
        return;
      }
      paramb = (ahy)paramb.hlV.hmc;
      if ((paramb == null) || (paramb.ucN == null) || (paramb.ucN.fzx != 0))
      {
        qb(com.tencent.mm.plugin.game.gamewebview.a.d.yF("pre_verify_jsapi:fail_" + paramString));
        GMTrace.o(20361634643968L, 151706);
        return;
      }
      paramString = this.mtZ;
      Object localObject = this.appId;
      if ((!bg.mZ((String)localObject)) && (!bg.mZ(paramString.aDp()))) {
        paramString.mxD.put(com.tencent.mm.plugin.game.gamewebview.ui.d.yV(paramString.aDp()), localObject);
      }
      paramString = new c.d();
      paramString.appId = this.appId;
      paramString.syr = paramb.uda;
      localObject = this.mtZ;
      if (!bg.mZ(((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject).aDp())) {
        ((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject).mxE.put(((com.tencent.mm.plugin.game.gamewebview.ui.d)localObject).aDp(), paramString);
      }
      paramb = paramb.ucZ;
      paramString = this.mtZ;
      if (paramString.mxc != null) {}
      for (paramString = paramString.mxc.Lm(paramString.aDp()); paramString == null; paramString = null)
      {
        qb(com.tencent.mm.plugin.game.gamewebview.a.d.yF("pre_verify_jsapi:ok"));
        GMTrace.o(20361634643968L, 151706);
        return;
      }
      if (!bg.bX(paramb))
      {
        paramb = paramb.iterator();
        while (paramb.hasNext())
        {
          localObject = (blf)paramb.next();
          c localc = (c)com.tencent.mm.plugin.game.gamewebview.jsapi.d.aCQ().get(((blf)localObject).ucH);
          if ((localc != null) && (paramString.zg(localc.aCM()) != ((blf)localObject).state)) {
            paramString.a(localc.aCM(), (byte)((blf)localObject).state);
          }
        }
      }
      qb(com.tencent.mm.plugin.game.gamewebview.a.d.yF("pre_verify_jsapi:ok"));
      GMTrace.o(20361634643968L, 151706);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */