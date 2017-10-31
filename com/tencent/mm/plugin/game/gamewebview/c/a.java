package com.tencent.mm.plugin.game.gamewebview.c;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.agi;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  public static String amo;
  public static List<agi> mvZ;
  public static String mwa;
  public static String mwb;
  public static Map<Integer, String> mwc;
  public static String uin;
  
  static
  {
    GMTrace.i(19312186228736L, 143887);
    mwa = "";
    mwc = new HashMap();
    GMTrace.o(19312186228736L, 143887);
  }
  
  private static String a(String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(19311246704640L, 143880);
    try
    {
      paramString = (HttpURLConnection)new URL(yP(c(paramString, paramJSONObject))).openConnection();
      paramString.setReadTimeout(5000);
      paramString.setConnectTimeout(5000);
      paramString.setUseCaches(false);
      paramString.setDoInput(true);
      paramString.setRequestMethod("GET");
      paramString.setDoOutput(false);
      e(paramString);
      int i = paramString.getResponseCode();
      w.i("MicroMsg.GameWebViewRequest", "GET, code = " + i);
      if (i == 200)
      {
        paramString = paramString.getInputStream();
        paramJSONObject = l(paramString);
        paramString.close();
        w.d("MicroMsg.GameWebViewRequest", paramJSONObject);
        GMTrace.o(19311246704640L, 143880);
        return paramJSONObject;
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.GameWebViewRequest", paramString.getMessage());
      GMTrace.o(19311246704640L, 143880);
    }
    return null;
  }
  
  public static String b(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    GMTrace.i(19310978269184L, 143878);
    if (mwc.containsKey(Integer.valueOf(paramString1.hashCode())))
    {
      paramString1 = (String)mwc.remove(Integer.valueOf(paramString1.hashCode()));
      GMTrace.o(19310978269184L, 143878);
      return paramString1;
    }
    if (paramString2.equalsIgnoreCase("POST"))
    {
      paramString1 = b(paramString1, paramJSONObject);
      GMTrace.o(19310978269184L, 143878);
      return paramString1;
    }
    if (paramString2.equalsIgnoreCase("GET"))
    {
      paramString1 = a(paramString1, paramJSONObject);
      GMTrace.o(19310978269184L, 143878);
      return paramString1;
    }
    GMTrace.o(19310978269184L, 143878);
    return null;
  }
  
  private static String b(String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(19311380922368L, 143881);
    try
    {
      paramString = (HttpURLConnection)new URL(paramString).openConnection();
      paramString.setReadTimeout(5000);
      paramString.setConnectTimeout(5000);
      paramString.setUseCaches(false);
      paramString.setDoInput(true);
      paramString.setRequestMethod("POST");
      paramString.setDoOutput(true);
      e(paramString);
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.toString();
        if (paramJSONObject != null)
        {
          OutputStream localOutputStream = paramString.getOutputStream();
          BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(localOutputStream, "utf-8"));
          localBufferedWriter.write(paramJSONObject);
          localBufferedWriter.flush();
          localBufferedWriter.close();
          localOutputStream.close();
        }
      }
      int i = paramString.getResponseCode();
      w.i("MicroMsg.GameWebViewRequest", "POST, code = " + i);
      if (i == 200)
      {
        paramString = paramString.getInputStream();
        paramJSONObject = l(paramString);
        paramString.close();
        w.d("MicroMsg.GameWebViewRequest", paramJSONObject);
        GMTrace.o(19311380922368L, 143881);
        return paramJSONObject;
      }
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.GameWebViewRequest", paramString.getMessage());
      GMTrace.o(19311380922368L, 143881);
    }
    return null;
  }
  
  private static String c(String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(19311515140096L, 143882);
    if (paramJSONObject == null)
    {
      GMTrace.o(19311515140096L, 143882);
      return paramString;
    }
    Uri localUri = Uri.parse(paramString);
    String str1 = localUri.getQuery();
    Iterator localIterator = paramJSONObject.keys();
    if (bg.mZ(str1)) {
      str1 = "";
    }
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      String str3 = paramJSONObject.optString(str2);
      str1 = str1 + str2 + "=" + str3 + "&";
      continue;
      str1 = str1 + "&";
    }
    paramJSONObject = str1.substring(0, str1.lastIndexOf("&"));
    try
    {
      paramJSONObject = new URI(localUri.getScheme(), localUri.getAuthority(), localUri.getPath(), paramJSONObject, localUri.getFragment()).toString();
      paramString = paramJSONObject;
    }
    catch (URISyntaxException paramJSONObject)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GameWebViewRequest", paramJSONObject, "", new Object[0]);
      }
    }
    w.d("MicroMsg.GameWebViewRequest", "url: " + paramString);
    GMTrace.o(19311515140096L, 143882);
    return paramString;
  }
  
  public static void c(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    GMTrace.i(19311112486912L, 143879);
    paramString2 = b(paramString1, paramString2, paramJSONObject);
    mwc.put(Integer.valueOf(paramString1.hashCode()), paramString2);
    GMTrace.o(19311112486912L, 143879);
  }
  
  private static void e(HttpURLConnection paramHttpURLConnection)
  {
    GMTrace.i(19311783575552L, 143884);
    paramHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    paramHttpURLConnection.setRequestProperty("User-agent", mwa);
    Iterator localIterator = mvZ.iterator();
    while (localIterator.hasNext())
    {
      agi localagi = (agi)localIterator.next();
      paramHttpURLConnection.setRequestProperty(localagi.tBb, localagi.paD);
    }
    GMTrace.o(19311783575552L, 143884);
  }
  
  public static void h(String paramString, List<agi> paramList)
  {
    GMTrace.i(19312052011008L, 143886);
    if (!bg.mZ(paramString))
    {
      paramString = Uri.parse(paramString);
      uin = paramString.getQueryParameter("uin");
      amo = paramString.getQueryParameter("key");
      mwb = paramString.getQueryParameter("pass_ticket");
    }
    mvZ = paramList;
    GMTrace.o(19312052011008L, 143886);
  }
  
  private static String l(InputStream paramInputStream)
  {
    GMTrace.i(19311917793280L, 143885);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte['Ѐ'];
    try
    {
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte, 0, 1024);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      paramInputStream = new String(localByteArrayOutputStream.toByteArray(), "utf-8");
    }
    catch (Exception paramInputStream)
    {
      w.e("MicroMsg.GameWebViewRequest", "inputStream2Str: " + paramInputStream.getMessage());
      GMTrace.o(19311917793280L, 143885);
      return "";
    }
    GMTrace.o(19311917793280L, 143885);
    return paramInputStream;
  }
  
  private static String yP(String paramString)
  {
    GMTrace.i(19311649357824L, 143883);
    if ((bg.mZ(uin)) || (bg.mZ(amo)) || (bg.mZ(mwb)))
    {
      GMTrace.o(19311649357824L, 143883);
      return paramString;
    }
    Uri localUri = Uri.parse(paramString);
    Object localObject1 = localUri.getQuery();
    Object localObject3;
    if (bg.mZ((String)localObject1))
    {
      localObject3 = "";
      localObject1 = localObject3;
      if (!bg.mZ(uin)) {
        localObject1 = (String)localObject3 + "uin=" + uin + "&";
      }
      localObject3 = localObject1;
      if (!bg.mZ(amo)) {
        localObject3 = (String)localObject1 + "key=" + amo + "&";
      }
      if (bg.mZ(mwb)) {
        break label291;
      }
    }
    label291:
    Object localObject2;
    for (localObject1 = (String)localObject3 + "pass_ticket=" + mwb;; localObject2 = localObject3)
    {
      try
      {
        localObject1 = new URI(localUri.getScheme(), localUri.getAuthority(), localUri.getPath(), (String)localObject1, localUri.getFragment()).toString();
        paramString = (String)localObject1;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.GameWebViewRequest", localURISyntaxException, "", new Object[0]);
        }
      }
      w.d("MicroMsg.GameWebViewRequest", "url: " + paramString);
      GMTrace.o(19311649357824L, 143883);
      return paramString;
      localObject3 = (String)localObject1 + "&";
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */