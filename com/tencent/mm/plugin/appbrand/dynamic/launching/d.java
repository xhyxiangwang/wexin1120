package com.tencent.mm.plugin.appbrand.dynamic.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.a.a;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.protocal.c.bsc;
import com.tencent.mm.protocal.c.lj;
import com.tencent.mm.protocal.c.lk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  private final String appId;
  private final String fwU;
  private final String iMx;
  private final boolean iMy;
  
  private d(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(19907576070144L, 148323);
    this.appId = paramString1;
    this.fwU = paramString2;
    this.iMx = paramString3;
    this.iMy = false;
    GMTrace.o(19907576070144L, 148323);
  }
  
  public d(String paramString1, String paramString2, String paramString3, byte paramByte)
  {
    this(paramString1, paramString2, paramString3);
    GMTrace.i(19907710287872L, 148324);
    GMTrace.o(19907710287872L, 148324);
  }
  
  private void h(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(19907844505600L, 148325);
    ((a)h.h(a.class)).RT().a(this.appId, paramInt, paramString1, paramString2, 0L, 0L);
    GMTrace.o(19907844505600L, 148325);
  }
  
  public final int Va()
  {
    GMTrace.i(19907978723328L, 148326);
    Object localObject = this.appId;
    String str1 = this.fwU;
    String str2 = this.iMx;
    b.a locala = new b.a();
    lj locallj = new lj();
    locallj.fKY = ((String)localObject);
    locallj.tHI = str1;
    locallj.tHJ = str2;
    locala.hlX = locallj;
    locala.hlY = new lk();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo";
    locala.hlW = 1124;
    localObject = c.b(locala.DA());
    int i;
    if ((((a.a)localObject).errType != 0) || (((a.a)localObject).errCode != 0))
    {
      w.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, errType %d, errCode %d, errMsg %s", new Object[] { this.appId, Integer.valueOf(((a.a)localObject).errType), Integer.valueOf(((a.a)localObject).errCode), ((a.a)localObject).ftU });
      i = a.iMC;
      GMTrace.o(19907978723328L, 148326);
      return i - 1;
    }
    try
    {
      localObject = (lk)((a.a)localObject).fPm;
      if (((lk)localObject).tHK == null)
      {
        w.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, null wxaapp resp", new Object[] { this.appId });
        i = a.iMD;
        GMTrace.o(19907978723328L, 148326);
        return i - 1;
      }
      w.i("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, wxa.ErrCode %d, has_new_demo %b, url %s, md5 %s", new Object[] { this.appId, Integer.valueOf(((lk)localObject).tHK.lpk), Boolean.valueOf(((lk)localObject).tHL), ((lk)localObject).tHM, ((lk)localObject).tHN });
      if (((lk)localObject).tHK.lpk != 0)
      {
        i = ((lk)localObject).tHK.lpk;
        GMTrace.o(19907978723328L, 148326);
        return i;
      }
      if ((((lk)localObject).tHL) && (!bg.mZ(((lk)localObject).tHN)) && (!bg.mZ(((lk)localObject).tHM))) {
        h(2, ((lk)localObject).tHM, ((lk)localObject).tHN);
      }
      if ((((lk)localObject).tHO) && (!bg.mZ(((lk)localObject).tHQ)) && (!bg.mZ(((lk)localObject).tHP))) {
        h(10001, ((lk)localObject).tHP, ((lk)localObject).tHQ);
      }
      i = a.iMz;
      GMTrace.o(19907978723328L, 148326);
      return i - 1;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", localException, "CgiCheckDemoInfo, appId %s, cast response failed", new Object[] { this.appId });
      i = a.iMD;
      GMTrace.o(19907978723328L, 148326);
    }
    return i - 1;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19907441852416L, 148322);
      iMz = 1;
      iMA = 2;
      iMB = 3;
      iMC = 4;
      iMD = 5;
      iME = 6;
      iMF = new int[] { iMz, iMA, iMB, iMC, iMD, iME };
      GMTrace.o(19907441852416L, 148322);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/launching/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */