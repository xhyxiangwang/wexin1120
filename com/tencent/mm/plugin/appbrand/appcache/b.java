package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.protocal.c.aes;
import com.tencent.mm.protocal.c.aet;

public final class b
  extends a<aet>
{
  final String appId;
  public final com.tencent.mm.ac.b gMC;
  final String iAB;
  final int version;
  
  public b(String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    this(paramString1, paramInt1, paramString2, paramInt2, 0);
    GMTrace.i(17655268376576L, 131542);
    GMTrace.o(17655268376576L, 131542);
  }
  
  public b(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3)
  {
    GMTrace.i(19993072762880L, 148960);
    this.appId = paramString1;
    this.version = paramInt1;
    this.iAB = paramString2;
    b.a locala = new b.a();
    locala.hlW = 1139;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxacdndownloadurl";
    aes localaes = new aes();
    localaes.tCg = paramInt1;
    localaes.fKY = paramString1;
    localaes.uap = paramString2;
    localaes.uaq = paramInt2;
    localaes.uar = paramInt3;
    locala.hlX = localaes;
    locala.hlY = new aet();
    paramString1 = locala.DA();
    this.gMC = paramString1;
    this.gMC = paramString1;
    GMTrace.o(19993072762880L, 148960);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */