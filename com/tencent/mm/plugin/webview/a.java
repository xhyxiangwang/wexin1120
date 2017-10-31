package com.tencent.mm.plugin.webview;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import java.util.regex.Pattern;

public final class a
{
  public static final Pattern siQ;
  public static final String siR;
  
  static
  {
    GMTrace.i(12474195640320L, 92940);
    siQ = Pattern.compile("(http|https)://mp.weixin.qq.com.*");
    siR = e.gZT + "vproxy";
    GMTrace.o(12474195640320L, 92940);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */