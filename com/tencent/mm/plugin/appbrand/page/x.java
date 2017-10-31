package com.tencent.mm.plugin.appbrand.page;

import com.tencent.gmtrace.GMTrace;

 enum x
{
  private final String type;
  
  static
  {
    GMTrace.i(10223498559488L, 76171);
    jmz = new x("APP_LAUNCH", 0, "appLaunch");
    jmA = new x("NAVIGATE_TO", 1, "navigateTo");
    jmB = new x("NAVIGATE_BACK", 2, "navigateBack");
    jmC = new x("REDIRECT_TO", 3, "redirectTo");
    jmD = new x("RE_LAUNCH", 4, "reLaunch");
    jmE = new x("AUTO_RE_LAUNCH", 5, "autoReLaunch");
    jmF = new x("SWITCH_TAB", 6, "switchTab");
    jmG = new x[] { jmz, jmA, jmB, jmC, jmD, jmE, jmF };
    GMTrace.o(10223498559488L, 76171);
  }
  
  private x(String paramString)
  {
    GMTrace.i(10223230124032L, 76169);
    this.type = paramString;
    GMTrace.o(10223230124032L, 76169);
  }
  
  public final String toString()
  {
    GMTrace.i(10223364341760L, 76170);
    String str = this.type;
    GMTrace.o(10223364341760L, 76170);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */