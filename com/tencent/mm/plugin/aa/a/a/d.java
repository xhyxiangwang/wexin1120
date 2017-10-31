package com.tencent.mm.plugin.aa.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.protocal.c.b;

public final class d
  extends a<com.tencent.mm.protocal.c.c>
{
  public d(String paramString1, String paramString2)
  {
    GMTrace.i(5599697829888L, 41721);
    b.a locala = new b.a();
    b localb = new b();
    localb.trs = paramString1;
    localb.trt = paramString2;
    locala.hlX = localb;
    locala.hlY = new com.tencent.mm.protocal.c.c();
    locala.uri = "/cgi-bin/mmpay-bin/newaaclosenotify";
    locala.hlW = 1672;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    com.tencent.pb.common.c.c.j("MicroMsg.CgiCloseAAUrgeNotify", new Object[] { "CgiCloseAAUrgeNotify, billNo: %s, chatroom: %s", paramString1, paramString2 });
    GMTrace.o(5599697829888L, 41721);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */