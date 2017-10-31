package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.h.a.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLContext;
import org.json.JSONObject;

public final class a
{
  public static int FAILED;
  public static int SUCCESS;
  private String iqL;
  private int jiB;
  private String jiC;
  private SSLContext jiD;
  private final String jiE;
  private final ArrayList<b> jiF;
  
  static
  {
    GMTrace.i(10681852100608L, 79586);
    SUCCESS = 0;
    FAILED = -1;
    GMTrace.o(10681852100608L, 79586);
  }
  
  public a(String paramString1, String paramString2)
  {
    GMTrace.i(19902610014208L, 148286);
    this.jiC = (com.tencent.mm.compatible.util.e.gKy + "appbrand/");
    this.jiF = new ArrayList();
    this.iqL = paramString1;
    this.jiB = com.tencent.mm.plugin.appbrand.a.nx(paramString1).iIO;
    this.jiD = i.re(this.iqL);
    this.jiE = paramString2;
    GMTrace.o(19902610014208L, 148286);
  }
  
  private b qV(String paramString)
  {
    GMTrace.i(10681583665152L, 79584);
    if (paramString == null)
    {
      GMTrace.o(10681583665152L, 79584);
      return null;
    }
    synchronized (this.jiF)
    {
      Iterator localIterator = this.jiF.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb.uri.equals(paramString))
        {
          GMTrace.o(10681583665152L, 79584);
          return localb;
        }
      }
      GMTrace.o(10681583665152L, 79584);
      return null;
    }
  }
  
  public final void a(JSONObject paramJSONObject, int paramInt1, Map<String, String> arg3, ArrayList<String> paramArrayList, int paramInt2, final a parama, String paramString1, String paramString2)
  {
    GMTrace.i(18360448319488L, 136796);
    paramJSONObject = paramJSONObject.optString("url");
    synchronized (this.jiF)
    {
      if (this.jiF.size() >= this.jiB)
      {
        parama.qp("max_connected");
        w.i("MicroMsg.AppBrandNetworkDownload", "max connected");
        GMTrace.o(18360448319488L, 136796);
        return;
      }
      if (bg.mZ(paramJSONObject))
      {
        w.i("MicroMsg.AppBrandNetworkDownload", "url is null");
        parama.qp("url is null");
        GMTrace.o(18360448319488L, 136796);
        return;
      }
    }
    if (qV(paramJSONObject) != null)
    {
      w.i("MicroMsg.AppBrandNetworkDownload", "the same task is working");
      parama.qp("the same task is working");
      GMTrace.o(18360448319488L, 136796);
      return;
    }
    ??? = this.jiC + aa.QW(paramJSONObject) + "temp";
    paramJSONObject = new b(this.iqL, paramJSONObject, (String)???, this.jiE, new com.tencent.mm.plugin.appbrand.h.a.a()
    {
      public final void A(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(10670577811456L, 79502);
        w.e("MicroMsg.AppBrandNetworkDownload", "download error! filename %s, url %s", new Object[] { paramAnonymousString1, paramAnonymousString2 });
        parama.qp(paramAnonymousString3);
        a.this.qU(paramAnonymousString2);
        GMTrace.o(10670577811456L, 79502);
      }
      
      public final void a(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt)
      {
        GMTrace.i(10670309376000L, 79500);
        a.this.qU(paramAnonymousString3);
        parama.b(a.SUCCESS, paramAnonymousString2, paramAnonymousString1, paramAnonymousInt);
        w.i("MicroMsg.AppBrandNetworkDownload", "download success! filename %s, url %s", new Object[] { paramAnonymousString1, paramAnonymousString3 });
        GMTrace.o(10670309376000L, 79500);
      }
      
      public final void bb(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(10670712029184L, 79503);
        w.i("MicroMsg.AppBrandNetworkDownload", "download start! filename %s, url %s", new Object[] { paramAnonymousString1, paramAnonymousString2 });
        GMTrace.o(10670712029184L, 79503);
      }
      
      public final void c(int paramAnonymousInt, long paramAnonymousLong1, long paramAnonymousLong2)
      {
        GMTrace.i(17695802130432L, 131844);
        parama.b(paramAnonymousInt, paramAnonymousLong1, paramAnonymousLong2);
        GMTrace.o(17695802130432L, 131844);
      }
    });
    paramJSONObject.jjA = ???;
    paramJSONObject.jjB = paramInt1;
    paramJSONObject.aDR = true;
    paramJSONObject.jiY = paramArrayList;
    paramJSONObject.jjC = paramInt2;
    paramJSONObject.jiD = this.jiD;
    paramJSONObject.iPd = paramString1;
    paramJSONObject.jjc = paramString2;
    synchronized (this.jiF)
    {
      this.jiF.add(paramJSONObject);
      com.tencent.mm.sdk.f.e.post(paramJSONObject, "appbrand_download_thread");
      GMTrace.o(18360448319488L, 136796);
      return;
    }
  }
  
  public final void qU(String paramString)
  {
    GMTrace.i(16058480066560L, 119645);
    if (paramString == null)
    {
      GMTrace.o(16058480066560L, 119645);
      return;
    }
    ArrayList localArrayList2 = new ArrayList();
    synchronized (this.jiF)
    {
      Iterator localIterator = this.jiF.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb.uri.equals(paramString)) {
          localArrayList2.add(localb);
        }
      }
    }
    if (localArrayList2.size() > 0) {
      this.jiF.removeAll(localArrayList2);
    }
    GMTrace.o(16058480066560L, 119645);
  }
  
  public final b qW(String paramString)
  {
    GMTrace.i(17693117775872L, 131824);
    if (paramString == null)
    {
      GMTrace.o(17693117775872L, 131824);
      return null;
    }
    synchronized (this.jiF)
    {
      Iterator localIterator = this.jiF.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (paramString.equals(localb.iPd))
        {
          GMTrace.o(17693117775872L, 131824);
          return localb;
        }
      }
      GMTrace.o(17693117775872L, 131824);
      return null;
    }
  }
  
  public static abstract interface a
  {
    public abstract void b(int paramInt, long paramLong1, long paramLong2);
    
    public abstract void b(int paramInt1, String paramString1, String paramString2, int paramInt2);
    
    public abstract void qp(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */