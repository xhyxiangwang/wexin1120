package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.protocal.c.bsw;
import com.tencent.mm.protocal.c.fs;
import com.tencent.mm.protocal.c.ft;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class i
  extends a<ft>
{
  i(List<String> paramList)
  {
    GMTrace.i(15531943919616L, 115722);
    fs localfs = new fs();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!bg.mZ(str))
      {
        bsw localbsw = new bsw();
        localbsw.uHG = str;
        localbsw.tAZ = q.pi(str);
        localfs.tzt.add(localbsw);
      }
    }
    paramList = new b.a();
    paramList.hlX = localfs;
    paramList.hlY = new ft();
    paramList.hlW = 1192;
    paramList.uri = "/cgi-bin/mmbiz-bin/wxaattr/batchwxaattrsync";
    this.gMC = paramList.DA();
    GMTrace.o(15531943919616L, 115722);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */