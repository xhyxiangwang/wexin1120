package com.tencent.mm.plugin.appbrand.h;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.d.d;
import com.tencent.mm.plugin.appbrand.p.d.d.a;
import com.tencent.mm.plugin.appbrand.p.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONObject;

public class j
{
  public static volatile aj jjq;
  private String iqL;
  public final String jiE;
  public com.tencent.mm.plugin.appbrand.p.a.a jjo;
  public SSLSocketFactory jjp;
  
  static
  {
    GMTrace.i(10680241487872L, 79574);
    jjq = null;
    GMTrace.o(10680241487872L, 79574);
  }
  
  public j(String paramString1, String paramString2)
  {
    GMTrace.i(19901536272384L, 148278);
    this.iqL = paramString1;
    paramString1 = i.re(paramString1);
    if (paramString1 != null) {
      this.jjp = paramString1.getSocketFactory();
    }
    this.jiE = paramString2;
    GMTrace.o(19901536272384L, 148278);
  }
  
  public static void MM()
  {
    GMTrace.i(10679838834688L, 79571);
    w.i("MicroMsg.AppBrandNetworkWebSocket", "try to stop connectTimer");
    if (jjq != null) {
      try
      {
        if (jjq != null)
        {
          jjq.MM();
          jjq = null;
        }
        GMTrace.o(10679838834688L, 79571);
        return;
      }
      finally {}
    }
    GMTrace.o(10679838834688L, 79571);
  }
  
  public static String a(URI paramURI)
  {
    GMTrace.i(18359911448576L, 136792);
    Object localObject2 = paramURI.getScheme();
    if (bg.mZ((String)localObject2))
    {
      GMTrace.o(18359911448576L, 136792);
      return null;
    }
    Object localObject1;
    if (((String)localObject2).equalsIgnoreCase("wss"))
    {
      localObject1 = "https";
      localObject2 = new StringBuilder((String)localObject1);
      ((StringBuilder)localObject2).append("://");
      ((StringBuilder)localObject2).append(paramURI.getHost());
      i = paramURI.getPort();
      if ((i != -1) && ((!((String)localObject1).equalsIgnoreCase("http")) || (i != 80)) && ((!((String)localObject1).equalsIgnoreCase("https")) || (i != 443))) {
        break label162;
      }
    }
    label162:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        ((StringBuilder)localObject2).append(":");
        ((StringBuilder)localObject2).append(paramURI.getPort());
      }
      paramURI = ((StringBuilder)localObject2).toString();
      GMTrace.o(18359911448576L, 136792);
      return paramURI;
      localObject1 = localObject2;
      if (!((String)localObject2).equalsIgnoreCase("ws")) {
        break;
      }
      localObject1 = "http";
      break;
    }
  }
  
  public static String q(JSONObject paramJSONObject)
  {
    GMTrace.i(17694325735424L, 131833);
    if (paramJSONObject == null)
    {
      GMTrace.o(17694325735424L, 131833);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    paramJSONObject = paramJSONObject.optJSONArray("protocols");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
    {
      int i = 0;
      while (i < paramJSONObject.length())
      {
        localLinkedList.add(paramJSONObject.optString(i));
        i += 1;
      }
    }
    if (!bg.bX(localLinkedList))
    {
      paramJSONObject = TextUtils.join(", ", localLinkedList);
      GMTrace.o(17694325735424L, 131833);
      return paramJSONObject;
    }
    GMTrace.o(17694325735424L, 131833);
    return null;
  }
  
  public final void YC()
  {
    GMTrace.i(10679704616960L, 79570);
    if (this.jjo != null) {
      try
      {
        w.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
        this.jjo.close();
        GMTrace.o(10679704616960L, 79570);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.AppBrandNetworkWebSocket", "send error" + localException.toString());
      }
    }
    GMTrace.o(10679704616960L, 79570);
  }
  
  public static abstract interface a
  {
    public abstract void WO();
    
    public abstract void WP();
    
    public abstract void a(ByteBuffer paramByteBuffer);
    
    public abstract void qm(String paramString);
    
    public abstract void qn(String paramString);
    
    public abstract void qo(String paramString);
    
    public abstract void y(int paramInt, String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */