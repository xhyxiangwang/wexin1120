package com.tencent.mm.plugin.appbrand.h;

import com.tencent.gmtrace.GMTrace;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;

public final class g
{
  public volatile boolean aDR;
  String iPd;
  int jiT;
  Map<String, String> jiX;
  ArrayList<String> jiY;
  int jiZ;
  public HttpURLConnection jjb;
  String jjc;
  public String jjh;
  Map<String, String> jji;
  f.a jjj;
  String mMimeType;
  public String mName;
  public String mUrl;
  private long startTime;
  
  g(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, f.a parama)
  {
    GMTrace.i(10676214956032L, 79544);
    this.aDR = false;
    this.jiZ = 15;
    this.jjb = null;
    this.jjh = paramString1;
    this.mUrl = paramString2;
    this.jjj = parama;
    this.mName = paramString3;
    this.jiT = paramInt;
    this.mMimeType = paramString4;
    this.startTime = System.currentTimeMillis();
    GMTrace.o(10676214956032L, 79544);
  }
  
  public final int Yz()
  {
    GMTrace.i(18360045666304L, 136793);
    int i = (int)(System.currentTimeMillis() - this.startTime);
    GMTrace.o(18360045666304L, 136793);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */