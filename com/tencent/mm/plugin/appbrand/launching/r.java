package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.v;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.task.b;
import com.tencent.mm.protocal.c.bsc;
import com.tencent.mm.protocal.c.lj;
import com.tencent.mm.protocal.c.lk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class r
{
  private final String appId;
  private final String fwU;
  private final String iMx;
  private final boolean iMy;
  
  public r(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(17669227020288L, 131646);
    this.appId = paramString1;
    this.fwU = paramString2;
    this.iMx = paramString3;
    this.iMy = paramBoolean;
    GMTrace.o(17669227020288L, 131646);
  }
  
  private void h(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(17669495455744L, 131648);
    if ((f.Sh().a(this.appId, paramInt, paramString1, paramString2, 0L, 0L)) && (this.iMy)) {
      b.at(this.appId, 2);
    }
    GMTrace.o(17669495455744L, 131648);
  }
  
  public final int Va()
  {
    GMTrace.i(10153973776384L, 75653);
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
      i = a.jgC.ordinal();
      GMTrace.o(10153973776384L, 75653);
      return i;
    }
    try
    {
      localObject = (lk)((a.a)localObject).fPm;
      if (((lk)localObject).tHK == null)
      {
        w.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, null wxaapp resp", new Object[] { this.appId });
        i = a.jgD.ordinal();
        GMTrace.o(10153973776384L, 75653);
        return i;
      }
      w.i("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, wxa.ErrCode %d, has_new_demo %b, url %s, md5 %s", new Object[] { this.appId, Integer.valueOf(((lk)localObject).tHK.lpk), Boolean.valueOf(((lk)localObject).tHL), ((lk)localObject).tHM, ((lk)localObject).tHN });
      if (((lk)localObject).tHK.lpk != 0)
      {
        i = ((lk)localObject).tHK.lpk;
        GMTrace.o(10153973776384L, 75653);
        return i;
      }
      if ((((lk)localObject).tHL) && (!bg.mZ(((lk)localObject).tHN)) && (!bg.mZ(((lk)localObject).tHM))) {
        h(2, ((lk)localObject).tHM, ((lk)localObject).tHN);
      }
      if ((((lk)localObject).tHO) && (!bg.mZ(((lk)localObject).tHQ)) && (!bg.mZ(((lk)localObject).tHP))) {
        h(10001, ((lk)localObject).tHP, ((lk)localObject).tHQ);
      }
      i = a.jgz.ordinal();
      GMTrace.o(10153973776384L, 75653);
      return i;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", localException, "CgiCheckDemoInfo, appId %s, cast response failed", new Object[] { this.appId });
      i = a.jgD.ordinal();
      GMTrace.o(10153973776384L, 75653);
    }
    return i;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(10148739284992L, 75614);
      jgz = new a("Ok", 0);
      jgA = new a("Fail", 1);
      jgB = new a("Timeout", 2);
      jgC = new a("CgiFail", 3);
      jgD = new a("ResponseInvalid", 4);
      jgE = new a("AwaitFail", 5);
      jgF = new a[] { jgz, jgA, jgB, jgC, jgD, jgE };
      GMTrace.o(10148739284992L, 75614);
    }
    
    private a()
    {
      GMTrace.i(10148470849536L, 75612);
      GMTrace.o(10148470849536L, 75612);
    }
    
    public static a iP(int paramInt)
    {
      GMTrace.i(10148605067264L, 75613);
      if (paramInt < 0)
      {
        GMTrace.o(10148605067264L, 75613);
        return null;
      }
      a[] arrayOfa = values();
      int j = arrayOfa.length;
      int i = 0;
      while (i < j)
      {
        a locala = arrayOfa[i];
        if (locala.ordinal() == paramInt)
        {
          GMTrace.o(10148605067264L, 75613);
          return locala;
        }
        i += 1;
      }
      GMTrace.o(10148605067264L, 75613);
      return null;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */