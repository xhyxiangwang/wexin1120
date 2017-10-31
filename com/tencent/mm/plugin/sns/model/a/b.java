package com.tencent.mm.plugin.sns.model.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.kernel.h;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.b.b;
import com.tencent.mm.network.t;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.pluginsdk.model.k;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class b
  extends k<String, Integer, Integer>
{
  private static HashSet<String> qgo;
  private long dnsCostTime;
  protected amn fNf;
  private int fvP;
  private int hYo;
  private String host;
  protected a qfU;
  protected n qfV;
  protected a qfW;
  private String qfX;
  private String qfY;
  private String qfZ;
  private int qga;
  protected int qgb;
  private long qgc;
  protected long qgd;
  protected long qge;
  protected long qgf;
  protected String qgg;
  protected PString qgh;
  protected int qgi;
  protected long qgj;
  protected long qgk;
  protected long qgl;
  private int qgm;
  protected int qgn;
  private Map<String, List<String>> qgp;
  int qgq;
  
  static
  {
    GMTrace.i(8065277493248L, 60091);
    qgo = new HashSet();
    GMTrace.o(8065277493248L, 60091);
  }
  
  public b(a parama, a parama1)
  {
    GMTrace.i(8062995791872L, 60074);
    this.qfV = null;
    this.qfW = null;
    this.fNf = null;
    this.qfX = "";
    this.qfY = "";
    this.qfZ = "";
    this.qga = 0;
    this.qgb = 0;
    this.qgc = -1L;
    this.dnsCostTime = -1L;
    this.hYo = -1;
    this.qgd = -1L;
    this.qge = -1L;
    this.qgf = -1L;
    this.qgg = "";
    this.qgh = new PString();
    this.fvP = -1;
    this.qgm = 0;
    this.host = "";
    this.qgn = 0;
    this.qgq = 0;
    this.qfU = parama;
    this.qfW = parama1;
    if (parama1 == null)
    {
      GMTrace.o(8062995791872L, 60074);
      return;
    }
    this.fNf = parama1.qbr;
    qgo.add(parama1.qbq);
    parama1.init();
    GMTrace.o(8062995791872L, 60074);
  }
  
  private static void H(Map<String, List<String>> paramMap)
  {
    GMTrace.i(8064337969152L, 60084);
    if (paramMap == null)
    {
      GMTrace.o(8064337969152L, 60084);
      return;
    }
    StringBuffer localStringBuffer;
    for (;;)
    {
      try
      {
        localStringBuffer = new StringBuffer();
        Iterator localIterator = paramMap.keySet().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        Object localObject1 = (String)localIterator.next();
        Object localObject2 = (List)paramMap.get(localObject1);
        if (localObject2 != null)
        {
          localStringBuffer.append((String)localObject1 + ":");
          localObject1 = ((List)localObject2).iterator();
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            localStringBuffer.append((String)localObject2 + "|");
          }
          else
          {
            localStringBuffer.append(";");
          }
        }
      }
      catch (Exception paramMap)
      {
        GMTrace.o(8064337969152L, 60084);
        return;
      }
    }
    w.i("MicroMsg.SnsCdnDownloadBase", "header respone %s", new Object[] { localStringBuffer.toString() });
    GMTrace.o(8064337969152L, 60084);
  }
  
  public static boolean Hc(String paramString)
  {
    GMTrace.i(8062861574144L, 60073);
    if (qgo.contains(i.aq(1, paramString)))
    {
      GMTrace.o(8062861574144L, 60073);
      return true;
    }
    if (qgo.contains(i.aq(5, paramString)))
    {
      GMTrace.o(8062861574144L, 60073);
      return true;
    }
    GMTrace.o(8062861574144L, 60073);
    return false;
  }
  
  private static long He(String paramString)
  {
    GMTrace.i(8064606404608L, 60086);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(8064606404608L, 60086);
      return 0L;
    }
    try
    {
      paramString = paramString.split("\\.");
      long l1 = bg.getLong(paramString[0], 0L);
      long l2 = bg.getLong(paramString[1], 0L);
      long l3 = bg.getLong(paramString[2], 0L);
      long l4 = bg.getLong(paramString[3], 0L);
      GMTrace.o(8064606404608L, 60086);
      return l4 + (16777216L * l1 + 65536L * l2 + 256L * l3);
    }
    catch (Exception paramString)
    {
      GMTrace.o(8064606404608L, 60086);
    }
    return 0L;
  }
  
  private t a(b.b paramb, String paramString)
  {
    GMTrace.i(17153294073856L, 127802);
    try
    {
      this.qfZ = paramb.ip;
      this.hYo = paramb.hYo;
      this.qgd = bg.Pp();
      paramb = com.tencent.mm.network.b.a(this.qfW.url, paramb);
      paramb.setRequestMethod("GET");
      paramb.setRequestProperty("referer", paramString);
      if (bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsDownloadHttpKeep"), 0) > 0)
      {
        w.i("MicroMsg.SnsCdnDownloadBase", "header Connection close ");
        paramb.setRequestProperty("Connection", "close");
      }
      paramb.setConnectTimeout(25000);
      paramb.setReadTimeout(25000);
      paramb = b(paramb);
      this.qgp = paramb.getHeaderFields();
      paramString = (List)this.qgp.get("X-ClientIp");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.qfY = ((String)paramString.get(0));
      }
      paramString = (List)this.qgp.get("X-ServerIp");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.qfX = ((String)paramString.get(0));
      }
      paramString = (List)this.qgp.get("X-ErrNo");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.qga = bg.RF((String)paramString.get(0));
      }
      paramString = (List)this.qgp.get("X-RtFlag");
      if ((paramString != null) && (paramString.size() > 0)) {
        this.qgb = bg.RF((String)paramString.get(0));
      }
      for (;;)
      {
        try
        {
          this.fvP = paramb.getResponseCode();
          this.host = paramb.url.getHost();
          if ((this.fvP == 200) || (this.fvP == 206)) {
            break;
          }
          H(paramb.getHeaderFields());
          if (this.qfW.qfR)
          {
            if ((this.fvP >= 400) && (this.fvP < 500))
            {
              com.tencent.mm.plugin.report.service.g.paX.a(22L, 78L, 1L, true);
              if (this.qfW.qfQ) {
                com.tencent.mm.plugin.report.service.g.paX.a(150L, 14L, 1L, true);
              }
              w.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! mediaId : " + this.qfW.mediaId + " " + this.qfW.url + " " + this.fvP);
              hB(false);
              GMTrace.o(17153294073856L, 127802);
              return null;
            }
            if ((this.fvP < 500) || (this.fvP >= 600)) {
              continue;
            }
            com.tencent.mm.plugin.report.service.g.paX.a(22L, 79L, 1L, true);
            continue;
          }
        }
        catch (SocketTimeoutException paramb)
        {
          this.fvP = 1;
          hB(false);
          paramb = paramb.getMessage();
          if (!this.qfW.qfR) {
            break label826;
          }
          com.tencent.mm.plugin.report.service.g.paX.a(22L, 77L, 1L, true);
          if (this.qfW.qfQ) {
            com.tencent.mm.plugin.report.service.g.paX.a(150L, 14L, 1L, true);
          }
          w.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! socket timeout mediaId : " + this.qfW.mediaId + " " + this.qfW.url + " msg:" + paramb);
          GMTrace.o(17153294073856L, 127802);
          return null;
          if ((this.fvP >= 400) && (this.fvP < 500))
          {
            com.tencent.mm.plugin.report.service.g.paX.a(22L, 56L, 1L, true);
            continue;
          }
        }
        catch (Exception paramb)
        {
          hB(false);
          paramb = paramb.getMessage();
          if (this.qfW.qfQ) {
            com.tencent.mm.plugin.report.service.g.paX.a(150L, 14L, 1L, true);
          }
          w.e("MicroMsg.SnsCdnDownloadBase", "GprsSetting.checkHttpConnection failed! mediaId : " + this.qfW.mediaId + " " + this.qfW.url + " msg:" + paramb);
          GMTrace.o(17153294073856L, 127802);
          return null;
        }
        if ((this.fvP >= 500) && (this.fvP < 600))
        {
          com.tencent.mm.plugin.report.service.g.paX.a(22L, 57L, 1L, true);
          continue;
          label826:
          com.tencent.mm.plugin.report.service.g.paX.a(22L, 55L, 1L, true);
        }
      }
      H(paramb.getHeaderFields());
    }
    catch (Exception paramb)
    {
      w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramb, "connect fail : " + paramb.getMessage(), new Object[0]);
      this.fvP = 2;
      hB(false);
      GMTrace.o(17153294073856L, 127802);
      return null;
    }
    if (!d(paramb))
    {
      com.tencent.mm.plugin.report.service.g.paX.a(22L, 62L, 1L, true);
      w.e("MicroMsg.SnsCdnDownloadBase", "checkHttpConnection failed! nocache mediaId : " + this.qfW.mediaId);
      hB(false);
      GMTrace.o(17153294073856L, 127802);
      return null;
    }
    this.qgd = bg.aF(this.qgd);
    paramString = (List)this.qgp.get("Content-Length");
    if ((paramString != null) && (paramString.size() > 0)) {
      this.qgn = bg.RF((String)paramString.get(0));
    }
    w.i("MicroMsg.SnsCdnDownloadBase", "ip: url %s client ip %s server ip %s svrlen %d %d", new Object[] { this.qfW.url, this.qfY, this.qfX, Integer.valueOf(this.qgn), Integer.valueOf(this.qga) });
    GMTrace.o(17153294073856L, 127802);
    return paramb;
  }
  
  protected static boolean a(int paramInt, long paramLong, PString paramPString)
  {
    GMTrace.i(8063801098240L, 60080);
    long l = System.currentTimeMillis();
    if (l - paramLong < 1000L)
    {
      GMTrace.o(8063801098240L, 60080);
      return false;
    }
    paramPString.value += String.format("ts=%d&size=%d|", new Object[] { Long.valueOf(l / 1000L), Integer.valueOf(paramInt) });
    GMTrace.o(8063801098240L, 60080);
    return true;
  }
  
  private static boolean a(an paraman, String paramString1, long paramLong, String paramString2)
  {
    GMTrace.i(8064069533696L, 60082);
    if (paramString1 == null)
    {
      GMTrace.o(8064069533696L, 60082);
      return false;
    }
    try
    {
      paramString1 = new URL(paramString1);
      if (paraman == null)
      {
        GMTrace.o(8064069533696L, 60082);
        return false;
      }
      if (paramString2 == null)
      {
        GMTrace.o(8064069533696L, 60082);
        return false;
      }
      int i = paramString2.indexOf(paramString1.getHost());
      if (i == -1)
      {
        GMTrace.o(8064069533696L, 60082);
        return false;
      }
      i = paraman.time;
      if (i == 0)
      {
        GMTrace.o(8064069533696L, 60082);
        return false;
      }
      long l = bg.aE(paraman.time);
      if (l > paramLong)
      {
        GMTrace.o(8064069533696L, 60082);
        return true;
      }
      GMTrace.o(8064069533696L, 60082);
      return false;
    }
    catch (Exception paraman)
    {
      w.e("MicroMsg.SnsCdnDownloadBase", "error for check dcip %s", new Object[] { paraman.getMessage() });
      GMTrace.o(8064069533696L, 60082);
    }
    return false;
  }
  
  private Integer bid()
  {
    GMTrace.i(8064203751424L, 60083);
    h.xA();
    if ((!h.xz().isSDCardAvailable()) || (this.qfW == null))
    {
      hB(false);
      GMTrace.o(8064203751424L, 60083);
      return Integer.valueOf(2);
    }
    if (bia())
    {
      localObject1 = this.qfW.qbm + this.qfW.bhZ();
      w.i("MicroMsg.SnsCdnDownloadBase", "[tomys] delete img: %s", new Object[] { localObject1 });
      FileOp.deleteFile((String)localObject1);
    }
    long l3 = System.currentTimeMillis();
    this.qgf = System.currentTimeMillis();
    w.d("MicroMsg.SnsCdnDownloadBase", "to downloadBitmap " + this.qfW.mediaId + " " + this.qfW.qfQ + " type " + this.qfW.qfS);
    FileOp.kL(this.qfW.getPath());
    Object localObject3 = this.qfW.qfT;
    Object localObject1 = "";
    if (localObject3 == null) {
      localObject1 = "";
    }
    for (;;)
    {
      Object localObject2 = localObject1;
      if (!bg.mZ((String)localObject1)) {
        localObject2 = "&scene=" + (String)localObject1;
      }
      String str2 = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.toX), o.getString(com.tencent.mm.plugin.sns.model.ae.bgW()), Integer.valueOf(am.getNetTypeForStat(ab.getContext())), Integer.valueOf(am.getStrength(ab.getContext())), localObject2 });
      this.qfW.url = Hd(this.qfW.url);
      this.dnsCostTime = bg.Pp();
      label346:
      label361:
      boolean bool;
      if (this.qfW.qfR)
      {
        localObject1 = "SnsSightDomainList";
        if (!this.qfW.qfR) {
          break label969;
        }
        localObject2 = "SnsSightMainStandbyIpSwitchTime";
        localObject1 = com.tencent.mm.k.g.uz().getValue((String)localObject1);
        long l2 = com.tencent.mm.k.g.uz().getInt((String)localObject2, 0);
        w.i("MicroMsg.SnsCdnDownloadBase", "pack.isAlbum %s pack.isthumb %s hostvalue %s dcipTime %s", new Object[] { Boolean.valueOf(this.qfW.qfR), Boolean.valueOf(this.qfW.qfQ), localObject1, Long.valueOf(l2) });
        long l1 = l2;
        if (l2 <= 0L) {
          l1 = 259200L;
        }
        bool = a((an)localObject3, this.qfW.url, l1, (String)localObject1);
        localObject2 = new b.b(this.qfW.url, bool);
        this.dnsCostTime = bg.aF(this.dnsCostTime);
      }
      try
      {
        if (bg.mZ(((b.b)localObject2).ip)) {}
        for (localObject1 = InetAddress.getByName(((b.b)localObject2).host).getHostAddress();; localObject1 = ((b.b)localObject2).ip)
        {
          w.i("MicroMsg.SnsCdnDownloadBase", "checkAndGetHttpConn[%s] [%s] [id:%s] host ip:%d[%s] [%s] download type[%d] isDcIp[%s] fromScene[%s]", new Object[] { str2, this.qfW.url, this.qfW.mediaId, Integer.valueOf(((b.b)localObject2).hYo), localObject1, this.qfW.url, Integer.valueOf(this.qfW.qfS), Boolean.valueOf(bool), ((an)localObject3).toString() });
          int i = 0;
          this.qgb = 1;
          localObject1 = a((b.b)localObject2, str2);
          i += 1;
          localObject3 = ((b.b)localObject2).ip;
          if (localObject1 == null) {
            break label997;
          }
          bool = true;
          w.i("MicroMsg.SnsCdnDownloadBase", "[sns ip strategy]connect ip:%s, result:%b, canRetry(X-RtFlag):%d, isDC(cold ip):%b, url:%s", new Object[] { localObject3, Boolean.valueOf(bool), Integer.valueOf(this.qgb), Boolean.valueOf(((b.b)localObject2).hYr), ((b.b)localObject2).hYq });
          if ((bie()) && (localObject1 == null) && (this.qgb == 1) && (((b.b)localObject2).Or()) && (i < 4)) {
            break label1003;
          }
          i = 2;
          if (localObject1 != null) {
            i = c((t)localObject1);
          }
          w.i("MicroMsg.SnsCdnDownloadBase", "DOWN FIN time:%d down:%d mediaId:%s url[%s], size %d", new Object[] { Long.valueOf(bg.aF(l3)), Long.valueOf(this.qgc), this.qfW.mediaId, this.qfW.url, Integer.valueOf(this.qgq) });
          GMTrace.o(8064203751424L, 60083);
          return Integer.valueOf(i);
          if (((an)localObject3).equals(an.veU))
          {
            localObject1 = "album_friend";
            break;
          }
          if (((an)localObject3).equals(an.veV))
          {
            localObject1 = "album_self";
            break;
          }
          if (((an)localObject3).equals(an.veW))
          {
            localObject1 = "album_stranger";
            break;
          }
          if (((an)localObject3).equals(an.veX))
          {
            localObject1 = "profile_friend";
            break;
          }
          if (((an)localObject3).equals(an.veY))
          {
            localObject1 = "profile_stranger";
            break;
          }
          if (((an)localObject3).equals(an.veZ))
          {
            localObject1 = "comment";
            break;
          }
          if (!((an)localObject3).equals(an.veT)) {
            break;
          }
          localObject1 = "timeline";
          break;
          localObject1 = "SnsAlbumDomainList";
          break label346;
          label969:
          localObject2 = "SnsAlbumMainStandbyIpSwitchTime";
          break label361;
        }
      }
      catch (Exception localException)
      {
        label997:
        label1003:
        for (;;)
        {
          String str1 = "-";
          continue;
          bool = false;
        }
      }
    }
  }
  
  private int c(t paramt)
  {
    GMTrace.i(17153428291584L, 127803);
    Object localObject3 = null;
    InputStream localInputStream2 = null;
    InputStream localInputStream1 = localInputStream2;
    Object localObject1 = localObject3;
    try
    {
      this.qgl = bg.Pp();
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      localInputStream2 = paramt.getInputStream();
      localInputStream1 = localInputStream2;
      localObject1 = localInputStream2;
      this.qge = bg.Pp();
      localInputStream1 = localInputStream2;
      localObject1 = localInputStream2;
      boolean bool = a(localInputStream2, this.qgp);
      localInputStream1 = localInputStream2;
      localObject1 = localInputStream2;
      localInputStream2.close();
      localObject3 = null;
      localInputStream2 = null;
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      w.i("MicroMsg.SnsCdnDownloadBase", "reportResult ret : " + bool);
      if (!bool)
      {
        localInputStream1 = localInputStream2;
        localObject1 = localObject3;
        hB(false);
        if (paramt != null) {
          paramt.hZk.disconnect();
        }
        GMTrace.o(17153428291584L, 127803);
        return 2;
      }
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      this.qge = bg.aF(this.qge);
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      this.qgc = bg.aF(this.qgf);
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      bool = bib();
      localInputStream1 = localInputStream2;
      localObject1 = localObject3;
      w.i("MicroMsg.SnsCdnDownloadBase", "processData ret : " + bool);
      if (!bool)
      {
        localInputStream1 = localInputStream2;
        localObject1 = localObject3;
        this.fvP = 3;
        localInputStream1 = localInputStream2;
        localObject1 = localObject3;
        hB(false);
        if (paramt != null) {
          paramt.hZk.disconnect();
        }
        GMTrace.o(17153428291584L, 127803);
        return 2;
      }
      if (paramt != null) {
        paramt.hZk.disconnect();
      }
      hB(true);
      if (this.qfW.qfQ)
      {
        GMTrace.o(17153428291584L, 127803);
        return 3;
      }
    }
    catch (Exception localException)
    {
      localObject1 = localInputStream1;
      w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", localException, "snscdndownload fail : " + localException.getMessage(), new Object[0]);
      localObject1 = localInputStream1;
      this.fvP = 4;
      localObject1 = localInputStream1;
      hB(false);
      if (localInputStream1 != null) {}
      try
      {
        localInputStream1.close();
        if (paramt != null) {
          paramt.hZk.disconnect();
        }
        GMTrace.o(17153428291584L, 127803);
        return 2;
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", localIOException1, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localIOException1 != null) {}
      try
      {
        localIOException1.close();
        if (paramt != null) {
          paramt.hZk.disconnect();
        }
        throw ((Throwable)localObject2);
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", localIOException2, "", new Object[0]);
        }
      }
      GMTrace.o(17153428291584L, 127803);
    }
    return 1;
  }
  
  private static boolean d(t paramt)
  {
    GMTrace.i(8064472186880L, 60085);
    try
    {
      paramt = (List)paramt.getHeaderFields().get("cache-control");
      if (paramt != null)
      {
        int i = paramt.size();
        if (i != 0) {}
      }
      else
      {
        GMTrace.o(8064472186880L, 60085);
        return true;
      }
      if (!bg.mZ(paramt.toString()))
      {
        bool = paramt.toString().contains("no-cache");
        if (bool) {}
      }
      else
      {
        GMTrace.o(8064472186880L, 60085);
        return true;
      }
      boolean bool = paramt.toString().contains("no-cache");
      if (bool)
      {
        GMTrace.o(8064472186880L, 60085);
        return false;
      }
      GMTrace.o(8064472186880L, 60085);
      return false;
    }
    catch (Exception paramt)
    {
      w.printErrStackTrace("MicroMsg.SnsCdnDownloadBase", paramt, "", new Object[0]);
      GMTrace.o(8064472186880L, 60085);
    }
    return false;
  }
  
  private void hB(boolean paramBoolean)
  {
    GMTrace.i(8064740622336L, 60087);
    label44:
    int j;
    label122:
    int k;
    long l2;
    Object localObject1;
    Object localObject3;
    label188:
    int m;
    if ((this.qfW != null) && (this.qfW.qfR)) {
      if (!paramBoolean)
      {
        com.tencent.mm.plugin.report.service.g.paX.a(22L, 74L, 1L, true);
        com.tencent.mm.plugin.report.service.g.paX.a(22L, 73L, 1L, true);
        if ((this.qfW != null) && (this.qfW.qfQ) && (!paramBoolean) && (!i.a(this.qfV))) {
          com.tencent.mm.plugin.report.service.g.paX.a(150L, 66L, 1L, true);
        }
        this.qgm = this.qgq;
        if (!am.isWifi(ab.getContext())) {
          break label837;
        }
        j = 1;
        k = am.getStrength(ab.getContext());
        i = this.hYo;
        l1 = this.dnsCostTime;
        l2 = this.qgd;
        long l3 = this.qge;
        long l4 = this.qgc;
        localObject1 = this.qfX;
        localObject2 = this.qfZ;
        localObject3 = this.qfY;
        if (this.qfW != null) {
          break label842;
        }
        str = "";
        w.v("MicroMsg.SnsCdnDownloadBase", "report dns:%d wifi:%d signal:%d [%d,%d,%d]%d serverIp:[%s,%s] xclientip:%s url[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), localObject1, localObject2, localObject3, str });
        m = am.getNetType(ab.getContext());
        i = 0;
        if (this.qfW != null)
        {
          if (this.qfW.qfS != 4) {
            break label854;
          }
          i = 1;
        }
        label310:
        w.i("MicroMsg.SnsCdnDownloadBase", "retCode :%d totalSize: %d net: %d downloadType %d xErrorNo %d", new Object[] { Integer.valueOf(this.fvP), Integer.valueOf(this.qgm), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.qga) });
        localObject1 = com.tencent.mm.plugin.report.service.g.paX;
        if (this.qfW != null) {
          break label859;
        }
        str = "";
        label383:
        l2 = He(this.qfZ);
        if (!paramBoolean) {
          break label871;
        }
      }
    }
    label837:
    label842:
    label854:
    label859:
    label871:
    for (long l1 = this.qgc;; l1 = 0L)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject1).i(10736, new Object[] { str, Long.valueOf(l2), Long.valueOf(l1), "", Integer.valueOf(j), Long.valueOf(this.dnsCostTime), Long.valueOf(this.qgd), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(this.qge), Long.valueOf(He(this.qfY)), Long.valueOf(He(this.qfX)), Integer.valueOf(this.hYo), Integer.valueOf(k), Integer.valueOf(this.fvP), Integer.valueOf(this.qgm), Integer.valueOf(m), Integer.valueOf(i), Integer.valueOf(this.qga) });
      boolean bool = am.isConnected(ab.getContext());
      w.d("MicroMsg.SnsCdnDownloadBase", "isConntected  " + bool + " urlIp: " + this.qgg);
      if ((!paramBoolean) && (!bg.mZ(this.qgg)) && (bool))
      {
        str = this.qgg;
        if ((com.tencent.mm.network.b.hYn != null) && (com.tencent.mm.network.b.hYn.wX() != null)) {
          com.tencent.mm.network.b.hYn.wX().reportFailIp(str);
        }
      }
      w.i("MicroMsg.SnsCdnDownloadBase", "ready to report logbuffer(13346) packageRecordList:%s", new Object[] { this.qgh.value });
      j = bic();
      localObject1 = "";
      switch (j)
      {
      default: 
        GMTrace.o(8064740622336L, 60087);
        return;
        com.tencent.mm.plugin.report.service.g.paX.a(22L, 75L, this.qgc, true);
        break label44;
        if (!paramBoolean) {
          com.tencent.mm.plugin.report.service.g.paX.a(22L, 52L, 1L, true);
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.g.paX.a(22L, 51L, 1L, true);
          break;
          com.tencent.mm.plugin.report.service.g.paX.a(22L, 53L, this.qgc, true);
        }
        j = 0;
        break label122;
        str = this.qfW.url;
        break label188;
        i = 0;
        break label310;
        str = this.qfW.url;
        break label383;
      }
    }
    String str = "100105";
    Object localObject2 = com.tencent.mm.x.c.c.Cu().em(str);
    int i = 0;
    if (((com.tencent.mm.storage.c)localObject2).isValid())
    {
      i = bg.getInt((String)((com.tencent.mm.storage.c)localObject2).bPn().get("needUploadData"), 1);
      localObject1 = ((com.tencent.mm.storage.c)localObject2).field_expId;
    }
    if (i != 0)
    {
      localObject2 = new com.tencent.mm.modelsns.d();
      ((com.tencent.mm.modelsns.d)localObject2).m("20ImgSize", this.qgq + ",");
      localObject3 = new StringBuilder();
      if (!am.isWifi(ab.getContext())) {
        break label1698;
      }
    }
    label1698:
    for (i = 1;; i = 0)
    {
      ((com.tencent.mm.modelsns.d)localObject2).m("21NetType", i + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("22DelayTime", this.qgc - this.qgd + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("23RetCode", this.fvP + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("24DnsCostTime", this.dnsCostTime + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("25ConnectCostTime", this.qgd + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("26SendCostTime", ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("27WaitResponseCostTime", this.qgk + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("28ReceiveCostTime", this.qge + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("29ClientAddrIP", this.qfY + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("30ServerAddrIP", this.qfZ + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("31dnstype", this.hYo + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("32signal", am.getStrength(ab.getContext()) + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("33host", this.host + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("34MediaType", j + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("35X_Errno", this.qga + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("36MaxPackageSize", this.qgi + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("37MaxPackageTimeStamp", this.qgj + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("38PackageRecordList", this.qgh.value + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("39ExpLayerId", str + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("40ExpId", (String)localObject1 + ",");
      ((com.tencent.mm.modelsns.d)localObject2).m("41FeedId", ",");
      w.i("MicroMsg.SnsCdnDownloadBase", "report logbuffer(13480 TLMediaFielDownloadRecord): " + ((com.tencent.mm.modelsns.d)localObject2).LL());
      com.tencent.mm.plugin.report.service.g.paX.i(13480, new Object[] { localObject2 });
      if (this.fvP != 200) {
        com.tencent.mm.plugin.report.service.g.paX.i(14071, new Object[] { localObject2 });
      }
      GMTrace.o(8064740622336L, 60087);
      return;
      str = "100106";
      break;
      str = "100100";
      break;
    }
  }
  
  public String Hd(String paramString)
  {
    GMTrace.i(8063264227328L, 60076);
    GMTrace.o(8063264227328L, 60076);
    return paramString;
  }
  
  public abstract boolean a(InputStream paramInputStream, Map<String, List<String>> paramMap);
  
  public t b(t paramt)
  {
    GMTrace.i(8063398445056L, 60077);
    GMTrace.o(8063398445056L, 60077);
    return paramt;
  }
  
  public final com.tencent.mm.sdk.platformtools.ae bgG()
  {
    GMTrace.i(8064874840064L, 60088);
    com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.plugin.sns.model.ae.bha();
    GMTrace.o(8064874840064L, 60088);
    return localae;
  }
  
  public boolean bia()
  {
    GMTrace.i(8063130009600L, 60075);
    GMTrace.o(8063130009600L, 60075);
    return true;
  }
  
  public abstract boolean bib();
  
  protected abstract int bic();
  
  protected boolean bie()
  {
    GMTrace.i(17153562509312L, 127804);
    GMTrace.o(17153562509312L, 127804);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, amn paramamn, int paramInt2, boolean paramBoolean, String paramString, int paramInt3);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */