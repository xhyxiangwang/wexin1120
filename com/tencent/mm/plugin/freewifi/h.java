package com.tencent.mm.plugin.freewifi;

import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.g.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.protocal.c.ac;
import com.tencent.mm.protocal.c.ng;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class h
{
  private b mbH;
  private String mbI;
  
  public h()
  {
    GMTrace.i(7267353100288L, 54146);
    this.mbH = j.aAf();
    GMTrace.o(7267353100288L, 54146);
  }
  
  private void azu()
  {
    try
    {
      GMTrace.i(7267621535744L, 54148);
      try
      {
        String str = this.mbH.xZ(a.mbJ.amo);
        if ((!m.xJ(str)) && (Integer.valueOf(str).intValue() < Integer.valueOf(a.mbJ.mbP).intValue()))
        {
          nE(Integer.valueOf(a.mbK.mbP).intValue());
          nF(Integer.valueOf(a.mbL.mbP).intValue());
          xG(a.mbN.mbP);
          xF(a.mbM.mbP);
          xH(a.mbO.mbP);
          nD(Integer.valueOf(a.mbJ.mbP).intValue());
        }
        GMTrace.o(7267621535744L, 54148);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "updateDiskDbCacheIfLowerThanDefault exception. " + m.e(localException));
          GMTrace.o(7267621535744L, 54148);
        }
      }
      return;
    }
    finally {}
  }
  
  private void nD(int paramInt)
  {
    try
    {
      GMTrace.i(7267889971200L, 54150);
      if (paramInt > Integer.valueOf(a.mbJ.mbP).intValue()) {
        j.aAf().cg(a.mbJ.amo, String.valueOf(paramInt));
      }
      GMTrace.o(7267889971200L, 54150);
      return;
    }
    finally {}
  }
  
  private static void nE(int paramInt)
  {
    GMTrace.i(7268158406656L, 54152);
    if (paramInt > 0) {
      j.aAf().cg(a.mbK.amo, String.valueOf(paramInt));
    }
    GMTrace.o(7268158406656L, 54152);
  }
  
  private void nF(int paramInt)
  {
    GMTrace.i(7268426842112L, 54154);
    if (paramInt > 0) {
      this.mbH.cg(a.mbL.amo, String.valueOf(paramInt));
    }
    GMTrace.o(7268426842112L, 54154);
  }
  
  private void xF(String paramString)
  {
    GMTrace.i(7268695277568L, 54156);
    if (("0".equals(paramString)) || ("1".equals(paramString))) {
      try
      {
        this.mbH.cg(a.mbM.amo, paramString);
        GMTrace.o(7268695277568L, 54156);
        return;
      }
      catch (Exception paramString) {}
    }
    GMTrace.o(7268695277568L, 54156);
  }
  
  private void xG(String paramString)
  {
    GMTrace.i(7268963713024L, 54158);
    if (!m.xJ(paramString)) {
      try
      {
        Uri.parse(paramString);
        this.mbH.cg(a.mbN.amo, paramString);
        GMTrace.o(7268963713024L, 54158);
        return;
      }
      catch (Exception paramString) {}
    }
    GMTrace.o(7268963713024L, 54158);
  }
  
  private void xH(String paramString)
  {
    GMTrace.i(7269232148480L, 54160);
    if (!m.xJ(paramString)) {
      try
      {
        Uri.parse(paramString);
        this.mbH.cg(a.mbO.amo, paramString);
        GMTrace.o(7269232148480L, 54160);
        return;
      }
      catch (Exception paramString) {}
    }
    GMTrace.o(7269232148480L, 54160);
  }
  
  public final void a(ac paramac)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(7267487318016L, 54147);
        azu();
        if ((paramac == null) || (paramac.tsL == null))
        {
          w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config is null.");
          GMTrace.o(7267487318016L, 54147);
          return;
        }
        this.mbH.aAF();
        if (paramac.tsL.version == -1)
        {
          this.mbH.Mz();
          w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "all local config data deleted.");
          this.mbH.aAF();
          GMTrace.o(7267487318016L, 54147);
          continue;
        }
        if (paramac.tsL.version <= azv()) {
          break label390;
        }
      }
      finally {}
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.version is %d, local version is %d.", new Object[] { Integer.valueOf(paramac.tsL.version), Integer.valueOf(azv()) });
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.version = %d " + paramac.tsL.version);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.httpConnectTimeoutMillis = %d " + paramac.tsL.tJD);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.httpReadTimeoutMillis = %d " + paramac.tsL.tJE);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.pingUrl = %s " + paramac.tsL.fvE);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.pingEnabled = %s " + paramac.tsL.fvD);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "resp.config.ThreeTwoBlackUrl = %s " + paramac.tsL.tJF);
      nE(paramac.tsL.tJD);
      nF(paramac.tsL.tJE);
      xG(paramac.tsL.fvE);
      xF(paramac.tsL.fvD);
      xH(paramac.tsL.tJF);
      nD(paramac.tsL.version);
      w.i("MicroMsg.FreeWifi.FreeWifiConfigHelper", "local config data changed.");
      this.mbH.aAF();
      label390:
      GMTrace.o(7267487318016L, 54147);
    }
  }
  
  public final String azA()
  {
    GMTrace.i(7269097930752L, 54159);
    azu();
    try
    {
      String str1 = this.mbH.xZ(a.mbO.amo);
      if (m.xJ(str1))
      {
        str1 = a.mbO.mbP;
        GMTrace.o(7269097930752L, 54159);
        return str1;
      }
      Uri.parse(str1);
      GMTrace.o(7269097930752L, 54159);
      return str1;
    }
    catch (Exception localException)
    {
      String str2 = a.mbO.mbP;
      GMTrace.o(7269097930752L, 54159);
      return str2;
    }
  }
  
  public final int azv()
  {
    for (;;)
    {
      String str;
      try
      {
        GMTrace.i(7267755753472L, 54149);
        azu();
      }
      finally {}
      try
      {
        str = this.mbH.xZ(a.mbJ.amo);
        if (!m.xJ(str)) {
          continue;
        }
        i = Integer.valueOf(a.mbJ.mbP).intValue();
        GMTrace.o(7267755753472L, 54149);
      }
      catch (Exception localException)
      {
        i = Integer.valueOf(a.mbJ.mbP).intValue();
        GMTrace.o(7267755753472L, 54149);
        continue;
      }
      return i;
      i = Integer.valueOf(str).intValue();
      GMTrace.o(7267755753472L, 54149);
    }
  }
  
  public final int azw()
  {
    GMTrace.i(7268024188928L, 54151);
    azu();
    int i;
    try
    {
      String str = this.mbH.xZ(a.mbK.amo);
      if (m.xJ(str))
      {
        i = Integer.valueOf(a.mbK.mbP).intValue();
        GMTrace.o(7268024188928L, 54151);
        return i;
      }
      i = Integer.valueOf(str).intValue();
      GMTrace.o(7268024188928L, 54151);
      return i;
    }
    catch (Exception localException)
    {
      i = Integer.valueOf(a.mbK.mbP).intValue();
      GMTrace.o(7268024188928L, 54151);
    }
    return i;
  }
  
  public final int azx()
  {
    GMTrace.i(7268292624384L, 54153);
    azu();
    int i;
    try
    {
      String str = this.mbH.xZ(a.mbL.amo);
      if (m.xJ(str))
      {
        i = Integer.valueOf(a.mbL.mbP).intValue();
        GMTrace.o(7268292624384L, 54153);
        return i;
      }
      i = Integer.valueOf(str).intValue();
      GMTrace.o(7268292624384L, 54153);
      return i;
    }
    catch (Exception localException)
    {
      i = Integer.valueOf(a.mbL.mbP).intValue();
      GMTrace.o(7268292624384L, 54153);
    }
    return i;
  }
  
  public final String azy()
  {
    GMTrace.i(7268561059840L, 54155);
    azu();
    try
    {
      if ("0".equals(this.mbH.xZ(a.mbM.amo)))
      {
        GMTrace.o(7268561059840L, 54155);
        return "0";
      }
      GMTrace.o(7268561059840L, 54155);
      return "1";
    }
    catch (Exception localException)
    {
      String str = a.mbM.mbP;
      GMTrace.o(7268561059840L, 54155);
      return str;
    }
  }
  
  public final String azz()
  {
    GMTrace.i(7268829495296L, 54157);
    azu();
    try
    {
      String str1 = this.mbH.xZ(a.mbN.amo);
      if (m.xJ(str1))
      {
        str1 = a.mbN.mbP;
        GMTrace.o(7268829495296L, 54157);
        return str1;
      }
      Uri.parse(str1);
      GMTrace.o(7268829495296L, 54157);
      return str1;
    }
    catch (Exception localException)
    {
      String str2 = a.mbN.mbP;
      GMTrace.o(7268829495296L, 54157);
      return str2;
    }
  }
  
  public final String getUserAgent()
  {
    GMTrace.i(7269366366208L, 54161);
    if (m.xJ(this.mbI)) {
      this.mbI = s.aY(ab.getContext(), null).toLowerCase();
    }
    String str = this.mbI;
    GMTrace.o(7269366366208L, 54161);
    return str;
  }
  
  static enum a
  {
    String amo;
    String mbP;
    
    static
    {
      GMTrace.i(7127364009984L, 53103);
      mbJ = new a("version", 0, "version", "2");
      mbK = new a("httpConnectTimeoutMillis", 1, "httpConnectTimeoutMillis", "5000");
      mbL = new a("httpReadTimeoutMillis", 2, "httpReadTimeoutMillis", "5000");
      mbM = new a("pingEnabled", 3, "pingEnabled", "1");
      mbN = new a("pingUrl", 4, "pingUrl", "http://o2o.gtimg.com/wifi/echo");
      mbO = new a("threeTwoBlackUrl", 5, "threeTwoBlackUrl", "http://o2o.gtimg.com/wifi/echo.html");
      mbQ = new a[] { mbJ, mbK, mbL, mbM, mbN, mbO };
      GMTrace.o(7127364009984L, 53103);
    }
    
    private a(String paramString1, String paramString2)
    {
      GMTrace.i(7127229792256L, 53102);
      this.amo = paramString1;
      this.mbP = paramString2;
      GMTrace.o(7127229792256L, 53102);
    }
  }
  
  private static final class b
  {
    public static h mbR;
    
    static
    {
      GMTrace.i(7146154491904L, 53243);
      mbR = new h();
      GMTrace.o(7146154491904L, 53243);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */