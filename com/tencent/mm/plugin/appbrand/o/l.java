package com.tencent.mm.plugin.appbrand.o;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.jsapi.b;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
{
  public static final boolean a(com.tencent.mm.plugin.appbrand.k paramk, Map paramMap, b paramb)
  {
    GMTrace.i(19684774641664L, 146663);
    if (paramk == null)
    {
      GMTrace.o(19684774641664L, 146663);
      return true;
    }
    AppBrandSysConfig localAppBrandSysConfig = a.nx(paramk.iqL);
    boolean bool2 = paramk.Rv();
    JSONArray localJSONArray = new JSONArray();
    boolean bool1;
    Iterator localIterator;
    int i;
    int j;
    label94:
    Object localObject2;
    Object localObject1;
    Object localObject3;
    if ((paramb instanceof com.tencent.mm.plugin.appbrand.jsapi.k))
    {
      if (((com.tencent.mm.plugin.appbrand.jsapi.k)paramb).iPI == Thread.currentThread())
      {
        bool1 = true;
        Assert.assertFalse("processNativeBufferToJs can not use in SyncThread", bool1);
      }
    }
    else
    {
      localIterator = paramMap.entrySet().iterator();
      i = 0;
      j = 0;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject2 = (Map.Entry)localIterator.next();
        localObject1 = (String)((Map.Entry)localObject2).getKey();
        localObject3 = ((Map.Entry)localObject2).getValue();
      } while ((localObject3 == null) || (!(localObject3 instanceof ByteBuffer)));
    }
    for (;;)
    {
      try
      {
        localObject2 = new JSONObject();
        ((JSONObject)localObject2).put("key", localObject1);
        if (bool2)
        {
          k = paramk.irU.Ru();
          if (k != -1)
          {
            localObject1 = (ByteBuffer)localObject3;
            if (localObject1 == null) {
              w.w("MicroMsg.NativeBufferUtil", "processNativeBufferToJs byteBuffer is null");
            }
          }
        }
      }
      catch (JSONException localJSONException1)
      {
        w.w("MicroMsg.NativeBufferUtil", "processNativeBuffer JSONException :%s", new Object[] { localJSONException1.getMessage() });
        localIterator.remove();
        break label94;
        bool1 = false;
        break;
        paramk.irU.a(k, localJSONException1);
        ((JSONObject)localObject2).put("id", k);
        int k = localJSONException1.array().length;
        i += k;
        try
        {
          localJSONArray.put(localObject2);
          j = 1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;) {}
        }
        catch (JSONException localJSONException2) {}
        ((JSONObject)localObject2).put("base64", new String(Base64.encode(((ByteBuffer)localObject3).array(), 2), "utf-8"));
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1) {}
      w.w("MicroMsg.NativeBufferUtil", "processNativeBuffer UnsupportedEncodingException :%s", new Object[] { localUnsupportedEncodingException1.getMessage() });
      continue;
      w.i("MicroMsg.NativeBufferUtil", "ToJs useX5JSCore %b,bufferSize %d", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(i) });
      if (i > localAppBrandSysConfig.iJc.iIm)
      {
        paramMap = new HashMap();
        paramMap.put("message", "convert native buffer parameter fail, event=" + paramb.getName() + ", error=native buffer exceed size limit");
        paramMap.put("stack", "");
        paramk.h("onError", new JSONObject(paramMap).toString(), 0);
        GMTrace.o(19684774641664L, 146663);
        return false;
      }
      if (j != 0) {
        paramMap.put("__nativeBuffers__", localJSONArray);
      }
      GMTrace.o(19684774641664L, 146663);
      return true;
    }
  }
  
  public static final boolean a(com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, b paramb)
  {
    GMTrace.i(19684908859392L, 146664);
    if ((paramk == null) || (paramJSONObject == null))
    {
      GMTrace.o(19684908859392L, 146664);
      return true;
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("__nativeBuffers__");
    if (localJSONArray == null)
    {
      GMTrace.o(19684908859392L, 146664);
      return true;
    }
    paramJSONObject.remove("__nativeBuffers__");
    int m = localJSONArray.length();
    if ((paramb instanceof com.tencent.mm.plugin.appbrand.jsapi.k)) {
      if (((com.tencent.mm.plugin.appbrand.jsapi.k)paramb).iPI != Thread.currentThread()) {
        break label400;
      }
    }
    label400:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertFalse("processNativeBufferFromJs can not use in SyncThread", bool);
      int i = 0;
      int k;
      for (int j = 0;; j = k)
      {
        if (i < m)
        {
          Object localObject = localJSONArray.optJSONObject(i);
          k = j;
          if (localObject != null)
          {
            String str = ((JSONObject)localObject).optString("key");
            k = j;
            if (!bg.mZ(str))
            {
              k = ((JSONObject)localObject).optInt("id", -1);
              if (k == -1) {
                try
                {
                  localObject = ((JSONObject)localObject).optString("base64", "");
                  if (bg.mZ((String)localObject))
                  {
                    w.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs base64 is null");
                    k = j;
                  }
                  else
                  {
                    paramJSONObject.put(str, ByteBuffer.wrap(Base64.decode(((String)localObject).getBytes(Charset.forName("UTF-8")), 2)));
                    k = j;
                  }
                }
                catch (JSONException localJSONException)
                {
                  w.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs JSONException :%s", new Object[] { localJSONException.getMessage() });
                  k = j;
                }
              }
              localObject = paramk.irU.hI(k);
              if (localObject == null)
              {
                w.w("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs byteBuffer is null");
                k = j;
              }
              else
              {
                paramJSONObject.put(localJSONException, localObject);
                k = ((ByteBuffer)localObject).array().length;
                k = j + k;
              }
            }
          }
        }
        else
        {
          w.i("MicroMsg.NativeBufferUtil", "processNativeBufferFromJs bufferSize %d", new Object[] { Integer.valueOf(j) });
          if (j > a.nx(paramk.iqL).iJc.iIm)
          {
            if ((paramb instanceof d)) {
              ((d)paramb).iPx = "fail convert native buffer parameter fail. native buffer exceed size limit";
            }
            GMTrace.o(19684908859392L, 146664);
            return false;
          }
          GMTrace.o(19684908859392L, 146664);
          return true;
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/o/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */