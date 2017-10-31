package com.tencent.mm.plugin.qqmail.b;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class p
{
  private static SparseArray<String> oFN;
  public j oFI;
  public c oFJ;
  public e oFK;
  public Map<Long, d> oFL;
  public Map<Long, b> oFM;
  Map<String, String> oFi;
  
  static
  {
    GMTrace.i(5456621731840L, 40655);
    oFN = null;
    GMTrace.o(5456621731840L, 40655);
  }
  
  public p(int paramInt, String paramString)
  {
    GMTrace.i(5454205812736L, 40637);
    this.oFi = new HashMap();
    this.oFL = new HashMap();
    this.oFM = new HashMap();
    x.setHost("qqmail.weixin.qq.com:443");
    x.setUserAgent("weixin/" + paramString + "/0x" + Integer.toHexString(paramInt));
    reset();
    GMTrace.o(5454205812736L, 40637);
  }
  
  public static int a(d paramd)
  {
    GMTrace.i(16027073118208L, 119411);
    if (!paramd.oFW.oFV)
    {
      paramd.oGa.onSuccess(paramd.oFY.content, null);
      GMTrace.o(16027073118208L, 119411);
      return 0;
    }
    h.c localc = paramd.oFY;
    if (paramd.oFZ == null)
    {
      paramd.oGa.onError(64534, "format error");
      GMTrace.o(16027073118208L, 119411);
      return 64534;
    }
    int i = bg.getInt((String)paramd.oFZ.get(".Response.error.code"), 0);
    if (i == 0)
    {
      paramd.oGa.onSuccess(localc.content, paramd.oFZ);
      GMTrace.o(16027073118208L, 119411);
      return 0;
    }
    paramd.oGa.onError(i, aj(i, (String)paramd.oFZ.get(".Response.error.message")));
    GMTrace.o(16027073118208L, 119411);
    return i;
  }
  
  public static String aWV()
  {
    GMTrace.i(5454608465920L, 40640);
    GMTrace.o(5454608465920L, 40640);
    return "https://qqmail.weixin.qq.com:443";
  }
  
  private static String aj(int paramInt, String paramString)
  {
    GMTrace.i(5455682207744L, 40648);
    int i = 0;
    switch (paramInt)
    {
    default: 
      paramInt = i;
    }
    while (paramInt == 0)
    {
      GMTrace.o(5455682207744L, 40648);
      return paramString;
      paramInt = R.l.euL;
      continue;
      paramInt = R.l.euQ;
      continue;
      paramInt = R.l.euS;
      continue;
      paramInt = R.l.euP;
      continue;
      paramInt = R.l.euR;
      continue;
      paramInt = R.l.euN;
      continue;
      paramInt = R.l.euO;
    }
    paramString = a.W(ab.getContext(), paramInt);
    GMTrace.o(5455682207744L, 40648);
    return paramString;
  }
  
  public static String getDownloadPath()
  {
    GMTrace.i(5455145336832L, 40644);
    String str = com.tencent.mm.compatible.util.e.gKy;
    File localFile = new File(str);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    GMTrace.o(5455145336832L, 40644);
    return str;
  }
  
  private static String getLocalIp()
  {
    GMTrace.i(5455279554560L, 40645);
    try
    {
      InetAddress localInetAddress;
      do
      {
        localObject = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration;
        while (!localEnumeration.hasMoreElements())
        {
          if (!((Enumeration)localObject).hasMoreElements()) {
            break;
          }
          localEnumeration = ((NetworkInterface)((Enumeration)localObject).nextElement()).getInetAddresses();
        }
        localInetAddress = (InetAddress)localEnumeration.nextElement();
      } while (localInetAddress.isLoopbackAddress());
      Object localObject = localInetAddress.getHostAddress();
      GMTrace.o(5455279554560L, 40645);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      GMTrace.o(5455279554560L, 40645);
      return null;
    }
    catch (SocketException localSocketException)
    {
      for (;;) {}
    }
  }
  
  public static String sD(int paramInt)
  {
    GMTrace.i(5455547990016L, 40647);
    if (oFN == null)
    {
      oFN = new SparseArray();
      localObject1 = HttpURLConnection.class.getDeclaredFields();
      int k = localObject1.length;
      int i = 0;
      while (i < k)
      {
        StringBuilder localStringBuilder = localObject1[i];
        int j = localStringBuilder.getModifiers();
        Object localObject2 = localStringBuilder.getName();
        if ((localObject2 != null) && (((String)localObject2).startsWith("HTTP_")) && (Modifier.isPublic(j)) && (Modifier.isFinal(j)) && (Modifier.isStatic(j))) {}
        try
        {
          int m = localStringBuilder.getInt(Integer.valueOf(0));
          localStringBuilder = new StringBuilder();
          localObject2 = ((String)localObject2).split("_");
          if (localObject2 != null)
          {
            j = 1;
            while (j < localObject2.length)
            {
              localStringBuilder.append(localObject2[j]).append(' ');
              j += 1;
            }
            localStringBuilder.append("error");
          }
          oFN.put(m, localStringBuilder.toString().toLowerCase());
        }
        catch (Exception localException)
        {
          for (;;) {}
        }
        i += 1;
      }
    }
    Object localObject1 = (String)oFN.get(paramInt);
    if (localObject1 == null)
    {
      localObject1 = aj(paramInt, "request error");
      GMTrace.o(5455547990016L, 40647);
      return (String)localObject1;
    }
    GMTrace.o(5455547990016L, 40647);
    return (String)localObject1;
  }
  
  public final long a(final String paramString, int paramInt, Map<String, String> paramMap, h.d paramd, c paramc, a parama)
  {
    GMTrace.i(5454742683648L, 40641);
    Object localObject = paramMap;
    if (paramMap == null) {
      localObject = new HashMap();
    }
    ((Map)localObject).put("appname", "qqmail_weixin");
    ((Map)localObject).put("f", "xml");
    ((Map)localObject).put("charset", "utf-8");
    ((Map)localObject).put("clientip", getLocalIp());
    paramString = new d(paramString, new h.b(paramInt, (Map)localObject, getCookie(), paramd), parama);
    paramString.oFW = paramc;
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5476485955584L, 40803);
        p.b localb = new p.b(p.this, (byte)0);
        p.this.oFL.put(Long.valueOf(paramString.id), paramString);
        p.this.oFM.put(Long.valueOf(paramString.id), localb);
        localb.b(paramString);
        GMTrace.o(5476485955584L, 40803);
      }
    });
    long l = paramString.id;
    GMTrace.o(5454742683648L, 40641);
    return l;
  }
  
  public final long a(String paramString, Map<String, String> paramMap, c paramc, a parama)
  {
    GMTrace.i(5454340030464L, 40638);
    long l = a(paramString, 1, paramMap, null, paramc, parama);
    GMTrace.o(5454340030464L, 40638);
    return l;
  }
  
  public final long b(String paramString, Map<String, String> paramMap, c paramc, a parama)
  {
    GMTrace.i(5454474248192L, 40639);
    long l = a(paramString, 0, paramMap, null, paramc, parama);
    GMTrace.o(5454474248192L, 40639);
    return l;
  }
  
  public final void cancel(long paramLong)
  {
    GMTrace.i(5454876901376L, 40642);
    b localb = (b)this.oFM.get(Long.valueOf(paramLong));
    if (localb != null)
    {
      localb.onCancelled();
      localb.cancel(true);
    }
    this.oFM.remove(Long.valueOf(paramLong));
    this.oFL.remove(Long.valueOf(paramLong));
    GMTrace.o(5454876901376L, 40642);
  }
  
  public final Map<String, String> getCookie()
  {
    GMTrace.i(5455413772288L, 40646);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(-1535680990, null);
    Map localMap = this.oFi;
    if (str == null) {}
    for (Object localObject = "";; localObject = str)
    {
      localMap.put("skey", localObject);
      ap.AS();
      int i = bg.m(com.tencent.mm.x.c.xi().get(9, null), 0);
      this.oFi.put("uin", "o" + new o(i));
      w.d("MicroMsg.NormalMailAppService", "sKey:%b, uin:%d", new Object[] { Boolean.valueOf(bg.mZ(str)), Integer.valueOf(i) });
      localObject = this.oFi;
      GMTrace.o(5455413772288L, 40646);
      return (Map<String, String>)localObject;
    }
  }
  
  public final void reset()
  {
    GMTrace.i(5455011119104L, 40643);
    x.Ef(getDownloadPath());
    Object localObject = this.oFM.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((b)((Iterator)localObject).next()).cancel(true);
    }
    this.oFM.clear();
    this.oFL.clear();
    this.oFi.clear();
    ap.AS();
    localObject = com.tencent.mm.x.c.zd();
    this.oFI = new j((String)localObject + "addr/");
    this.oFJ = new c((String)localObject + "draft/");
    this.oFK = new e((String)localObject + "http/", 0);
    GMTrace.o(5455011119104L, 40643);
  }
  
  public static abstract class a
  {
    public a()
    {
      GMTrace.i(5468969762816L, 40747);
      GMTrace.o(5468969762816L, 40747);
    }
    
    public void onComplete()
    {
      GMTrace.i(5469640851456L, 40752);
      GMTrace.o(5469640851456L, 40752);
    }
    
    public abstract void onError(int paramInt, String paramString);
    
    public void onProgress(int paramInt)
    {
      GMTrace.i(5469238198272L, 40749);
      GMTrace.o(5469238198272L, 40749);
    }
    
    public boolean onReady()
    {
      GMTrace.i(5469103980544L, 40748);
      GMTrace.o(5469103980544L, 40748);
      return true;
    }
    
    public abstract void onSuccess(String paramString, Map<String, String> paramMap);
  }
  
  private final class b
    extends AsyncTask<p.d, Integer, p.d>
    implements h.a
  {
    private h oFQ;
    p.d oFR;
    
    private b()
    {
      GMTrace.i(5447763361792L, 40589);
      GMTrace.o(5447763361792L, 40589);
    }
    
    public final void aWP()
    {
      GMTrace.i(5448031797248L, 40591);
      publishProgress(new Integer[] { Integer.valueOf(0) });
      GMTrace.o(5448031797248L, 40591);
    }
    
    public final boolean b(p.d paramd)
    {
      GMTrace.i(5447897579520L, 40590);
      if (!paramd.oGa.onReady())
      {
        GMTrace.o(5447897579520L, 40590);
        return false;
      }
      this.oFR = paramd;
      super.execute(new p.d[] { paramd });
      GMTrace.o(5447897579520L, 40590);
      return true;
    }
    
    protected final void onCancelled()
    {
      GMTrace.i(5448166014976L, 40592);
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5463064182784L, 40703);
          if (p.b.a(p.b.this) != null) {
            p.b.a(p.b.this).cancel();
          }
          GMTrace.o(5463064182784L, 40703);
        }
        
        public final String toString()
        {
          GMTrace.i(5463198400512L, 40704);
          String str = super.toString() + "|onCancelled";
          GMTrace.o(5463198400512L, 40704);
          return str;
        }
      });
      super.onCancelled();
      GMTrace.o(5448166014976L, 40592);
    }
  }
  
  public static final class c
  {
    public boolean oFT;
    public boolean oFU;
    public boolean oFV;
    
    public c()
    {
      GMTrace.i(5465077448704L, 40718);
      this.oFT = false;
      this.oFU = true;
      this.oFV = true;
      GMTrace.o(5465077448704L, 40718);
    }
    
    public final void fromBundle(Bundle paramBundle)
    {
      GMTrace.i(5465345884160L, 40720);
      this.oFT = paramBundle.getBoolean("qqmail_httpoptions_expired");
      this.oFU = paramBundle.getBoolean("qqmail_httpoptions_needcache");
      this.oFV = paramBundle.getBoolean("qqmail_httpoptions_needparse");
      GMTrace.o(5465345884160L, 40720);
    }
    
    public final void toBundle(Bundle paramBundle)
    {
      GMTrace.i(5465211666432L, 40719);
      paramBundle.putBoolean("qqmail_httpoptions_expired", this.oFT);
      paramBundle.putBoolean("qqmail_httpoptions_needcache", this.oFU);
      paramBundle.putBoolean("qqmail_httpoptions_needparse", this.oFV);
      GMTrace.o(5465211666432L, 40719);
    }
  }
  
  private final class d
  {
    long id;
    p.c oFW;
    h.b oFX;
    h.c oFY;
    Map<String, String> oFZ;
    p.a oGa;
    String uri;
    
    public d(String paramString, h.b paramb, p.a parama)
    {
      GMTrace.i(5476217520128L, 40801);
      this.id = System.currentTimeMillis();
      this.uri = paramString;
      this.oFX = paramb;
      this.oGa = parama;
      GMTrace.o(5476217520128L, 40801);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */