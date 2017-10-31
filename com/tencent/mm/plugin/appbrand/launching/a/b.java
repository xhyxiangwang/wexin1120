package com.tencent.mm.plugin.appbrand.launching.a;

import com.tencent.gmtrace.GMTrace;

 enum b
{
  final String hLv;
  final int scene;
  
  static
  {
    GMTrace.i(17331803652096L, 129132);
    jgL = new b("WALLET", 0, "weapp://wallet/", 1019);
    jgM = new b("SEARCH_NATIVE_FEATURE", 1, "weapp://search/", 1005);
    jgN = new b[] { jgL, jgM };
    GMTrace.o(17331803652096L, 129132);
  }
  
  private b(String paramString, int paramInt)
  {
    GMTrace.i(17331266781184L, 129128);
    this.hLv = paramString;
    this.scene = paramInt;
    GMTrace.o(17331266781184L, 129128);
  }
  
  static String Yj()
  {
    GMTrace.i(17331400998912L, 129129);
    GMTrace.o(17331400998912L, 129129);
    return "";
  }
  
  static int Yk()
  {
    GMTrace.i(17331535216640L, 129130);
    GMTrace.o(17331535216640L, 129130);
    return 0;
  }
  
  static String Yl()
  {
    GMTrace.i(17331669434368L, 129131);
    GMTrace.o(17331669434368L, 129131);
    return "";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */