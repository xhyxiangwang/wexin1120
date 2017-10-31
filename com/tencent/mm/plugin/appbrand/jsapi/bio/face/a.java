package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public a()
  {
    GMTrace.i(14564234100736L, 108512);
    GMTrace.o(14564234100736L, 108512);
  }
  
  protected abstract boolean Wh();
  
  protected abstract String Wi();
  
  public final void a(k paramk, int paramInt, Bundle paramBundle, String paramString)
  {
    GMTrace.i(16054319316992L, 119614);
    int i = -1;
    String str1 = "not returned";
    String str2 = "";
    if (paramBundle != null)
    {
      i = paramBundle.getInt("err_code");
      str1 = paramBundle.getString("err_msg");
      str2 = paramBundle.getString("verify_result");
    }
    HashMap localHashMap = new HashMap(3);
    localHashMap.put("errCode", Integer.valueOf(i));
    localHashMap.put("verifyResult", str2);
    paramBundle = paramString;
    if ("fail".equals(paramString)) {
      paramBundle = paramString + " " + str1;
    }
    paramk.v(paramInt, d(paramBundle, localHashMap));
    GMTrace.o(16054319316992L, 119614);
  }
  
  public final void a(final k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(14564502536192L, 108514);
    super.a(paramk, paramJSONObject, paramInt);
    MMActivity localMMActivity = a(paramk);
    if (localMMActivity == null)
    {
      w.e("MicroMsg.JsApiFaceAsyncBase", "JsApiFaceAsyncBase context is null, appId is %s", new Object[] { paramk.iqL });
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(14564502536192L, 108514);
      return;
    }
    Object localObject = paramJSONObject.optString("requestVerifyPreInfo");
    String str = paramk.iqL;
    if (Wh()) {}
    for (int i = 1001;; i = 1000)
    {
      paramJSONObject = new Bundle();
      paramJSONObject.putBoolean("k_need_signature", true);
      paramJSONObject.putInt("k_server_scene", 5);
      paramJSONObject.putBoolean("key_is_need_video", Wh());
      paramJSONObject.putBoolean("is_check_dyncfg", false);
      paramJSONObject.putString("k_app_id", str);
      paramJSONObject.putString("request_verify_pre_info", (String)localObject);
      paramJSONObject.putInt("key_business_type", 4);
      paramJSONObject.putString("key_function_name", Wi());
      localObject = new Intent(localMMActivity, FaceTransparentStubUI.class);
      ((Intent)localObject).putExtra("KEY_EXTRAS", paramJSONObject);
      ((Intent)localObject).putExtra("KEY_REQUEST_CODE", i);
      localMMActivity.vow = new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          a locala = null;
          Object localObject2 = null;
          k localk = null;
          Object localObject3 = null;
          Object localObject4 = null;
          Object localObject1 = null;
          GMTrace.i(14567186890752L, 108534);
          if (paramAnonymousIntent != null) {
            paramAnonymousInt2 = paramAnonymousIntent.getIntExtra("err_code", 90199);
          }
          while (paramAnonymousInt1 == 1000)
          {
            w.i("MicroMsg.JsApiFaceAsyncBase", "alvinluo: requestWxFacePictureVerify errCode: %d", new Object[] { Integer.valueOf(paramAnonymousInt2) });
            if (paramAnonymousInt2 == 0)
            {
              locala = a.this;
              localObject2 = paramk;
              paramAnonymousInt1 = paramInt;
              if (paramAnonymousIntent != null) {
                localObject1 = paramAnonymousIntent.getExtras();
              }
              locala.a((k)localObject2, paramAnonymousInt1, (Bundle)localObject1, "ok");
              GMTrace.o(14567186890752L, 108534);
              return;
              paramAnonymousInt2 = 90199;
            }
            else
            {
              if (paramAnonymousInt2 == 90100)
              {
                localObject2 = a.this;
                localk = paramk;
                paramAnonymousInt1 = paramInt;
                localObject1 = locala;
                if (paramAnonymousIntent != null) {
                  localObject1 = paramAnonymousIntent.getExtras();
                }
                ((a)localObject2).a(localk, paramAnonymousInt1, (Bundle)localObject1, "cancel");
                GMTrace.o(14567186890752L, 108534);
                return;
              }
              locala = a.this;
              localk = paramk;
              paramAnonymousInt1 = paramInt;
              localObject1 = localObject2;
              if (paramAnonymousIntent != null) {
                localObject1 = paramAnonymousIntent.getExtras();
              }
              locala.a(localk, paramAnonymousInt1, (Bundle)localObject1, "fail");
              GMTrace.o(14567186890752L, 108534);
              return;
            }
          }
          if (paramAnonymousInt1 == 1001)
          {
            w.i("MicroMsg.JsApiFaceAsyncBase", "hy: REQUEST_FACE_DETECT_WITH_VIDEO errCode: %d", new Object[] { Integer.valueOf(paramAnonymousInt2) });
            if (paramAnonymousInt2 == 0)
            {
              locala = a.this;
              localObject2 = paramk;
              paramAnonymousInt1 = paramInt;
              localObject1 = localk;
              if (paramAnonymousIntent != null) {
                localObject1 = paramAnonymousIntent.getExtras();
              }
              locala.a((k)localObject2, paramAnonymousInt1, (Bundle)localObject1, "ok");
              GMTrace.o(14567186890752L, 108534);
              return;
            }
            if (paramAnonymousInt2 == 90100)
            {
              locala = a.this;
              localObject2 = paramk;
              paramAnonymousInt1 = paramInt;
              localObject1 = localObject3;
              if (paramAnonymousIntent != null) {
                localObject1 = paramAnonymousIntent.getExtras();
              }
              locala.a((k)localObject2, paramAnonymousInt1, (Bundle)localObject1, "cancel");
              GMTrace.o(14567186890752L, 108534);
              return;
            }
            locala = a.this;
            localObject2 = paramk;
            paramAnonymousInt1 = paramInt;
            localObject1 = localObject4;
            if (paramAnonymousIntent != null) {
              localObject1 = paramAnonymousIntent.getExtras();
            }
            locala.a((k)localObject2, paramAnonymousInt1, (Bundle)localObject1, "fail");
          }
          GMTrace.o(14567186890752L, 108534);
        }
      };
      localMMActivity.startActivityForResult((Intent)localObject, i);
      GMTrace.o(14564502536192L, 108514);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bio/face/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */