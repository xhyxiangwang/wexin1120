package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;

final class n
  extends k<h>
{
  final String appId;
  final int fNP;
  final int fNV;
  final AppBrandLaunchReferrer iIA;
  final String iIy;
  final int iQS;
  final int iUz;
  final int jge;
  final String jgf;
  
  n(String paramString1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString2, AppBrandLaunchReferrer paramAppBrandLaunchReferrer, String paramString3)
  {
    GMTrace.i(19675513618432L, 146594);
    this.appId = paramString1;
    this.iQS = paramInt1;
    this.fNP = paramInt2;
    this.iUz = paramInt3;
    this.fNV = paramInt4;
    this.jge = paramInt5;
    this.iIy = paramString2;
    this.iIA = paramAppBrandLaunchReferrer;
    this.jgf = paramString3;
    GMTrace.o(19675513618432L, 146594);
  }
  
  final String getTag()
  {
    GMTrace.i(17336367054848L, 129166);
    GMTrace.o(17336367054848L, 129166);
    return "MicroMsg.AppBrand.PrepareStepCheckLaunchInfo";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */