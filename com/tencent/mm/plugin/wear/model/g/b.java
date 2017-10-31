package com.tencent.mm.plugin.wear.model.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.g.a.sv;
import com.tencent.mm.g.a.sv.b;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.LinkedHashMap;

public final class b
  implements d
{
  public b()
  {
    GMTrace.i(9174721232896L, 68357);
    GMTrace.o(9174721232896L, 68357);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(9174855450624L, 68358);
    ??? = parama.hme;
    ap.AS();
    if (bg.mZ((String)c.xi().get(2, "")))
    {
      GMTrace.o(9174855450624L, 68358);
      return null;
    }
    parama = n.a(((bu)???).tvo);
    Object localObject2 = n.a(((bu)???).tvp);
    if ((bg.mZ(parama)) || (bg.mZ((String)localObject2)))
    {
      w.e("MicroMsg.YoExtension", "neither from-user nor to-user can be empty");
      GMTrace.o(9174855450624L, 68358);
      return null;
    }
    Object localObject3 = n.a(((bu)???).tvq);
    w.i("MicroMsg.YoExtension", "from  " + parama + "content " + (String)localObject3);
    localObject2 = com.tencent.mm.plugin.wear.model.a.bzo().sho;
    synchronized (((a)localObject2).siC)
    {
      sv localsv = a.Kh(parama);
      if ((!((a)localObject2).siC.containsKey(parama)) && (localsv.fRz.fRA != 1))
      {
        w.i("MicroMsg.wear.WearYoLogic", "Can add Yo Message %s", new Object[] { parama });
        localObject3 = new a.a((a)localObject2, parama, (String)localObject3);
        ((a)localObject2).siC.put(parama, localObject3);
        com.tencent.mm.plugin.wear.model.a.bzo().sho.bzF();
        GMTrace.o(9174855450624L, 68358);
        return null;
      }
      w.i("MicroMsg.wear.WearYoLogic", "Can not add Yo Message %s", new Object[] { parama });
      localObject2 = new sv();
      ((sv)localObject2).fRy.fvy = 2;
      ((sv)localObject2).fRy.username = parama;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(9174989668352L, 68359);
    GMTrace.o(9174989668352L, 68359);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */