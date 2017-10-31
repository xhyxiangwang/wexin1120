package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.a;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.protocal.c.aew;
import com.tencent.mm.protocal.c.aex;

class l
  extends a<aex>
{
  l(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(10017205911552L, 74634);
    b.a locala = new b.a();
    aew localaew = new aew();
    localaew.fFs = paramInt1;
    localaew.condition = paramInt2;
    localaew.uaF = paramInt3;
    localaew.uaG = paramInt4;
    locala.hlX = localaew;
    locala.hlY = new aex();
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getwxausagerecord";
    locala.hlW = 1148;
    this.gMC = locala.DA();
    GMTrace.o(10017205911552L, 74634);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */