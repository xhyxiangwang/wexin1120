package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.kernel.e;
import com.tencent.mm.protocal.c.aew;
import com.tencent.mm.protocal.c.aex;
import com.tencent.mm.protocal.c.bsn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.List;

public enum g
{
  public static Integer iEU;
  
  static
  {
    GMTrace.i(10029419724800L, 74725);
    iEV = new g[0];
    iEU = null;
    GMTrace.o(10029419724800L, 74725);
  }
  
  static void a(int paramInt1, int paramInt2, b paramb)
  {
    GMTrace.i(16370402066432L, 121969);
    if (paramb == null)
    {
      GMTrace.o(16370402066432L, 121969);
      return;
    }
    if ((((aew)paramb.hlU.hmc).condition & 0x2) == 0)
    {
      GMTrace.o(16370402066432L, 121969);
      return;
    }
    paramb = (aex)paramb.hlV.hmc;
    Object localObject1;
    Object localObject2;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramb != null))
    {
      if (com.tencent.mm.plugin.appbrand.app.f.Sg() != null)
      {
        localObject1 = com.tencent.mm.plugin.appbrand.app.f.Sg();
        localObject2 = paramb.uaH;
        long l = ((f)localObject1).iCj.cA(Thread.currentThread().getId());
        ((f)localObject1).iCj.delete("AppBrandStarApp", "", null);
        f.a locala = new f.a();
        Iterator localIterator = ((List)localObject2).iterator();
        while (localIterator.hasNext())
        {
          bsn localbsn = (bsn)localIterator.next();
          if (!bg.mZ(localbsn.username))
          {
            locala.field_username = localbsn.username;
            locala.field_versionType = localbsn.tCf;
            locala.field_updateTime = localbsn.tGt;
            ((f)localObject1).iCj.insert("AppBrandStarApp", null, locala.qQ());
          }
        }
        ((f)localObject1).iCj.aJ(l);
        ((f)localObject1).a("batch", 3, localObject2);
        h.r(paramb.uaH);
      }
      localObject1 = com.tencent.mm.kernel.h.xz().xi();
      localObject2 = w.a.uYO;
      if ((paramb.status & 0x1) <= 0) {
        break label292;
      }
    }
    label292:
    for (boolean bool = true;; bool = false)
    {
      ((t)localObject1).a((w.a)localObject2, Boolean.valueOf(bool));
      GMTrace.o(16370402066432L, 121969);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */