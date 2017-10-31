package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.c;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.qmessage.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.bn;
import java.util.HashMap;

public final class g
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private e oEl;
  private f oEm;
  private a oEn;
  private b oEo;
  
  static
  {
    GMTrace.i(8940377079808L, 66611);
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("QCONTACT_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(8940645515264L, 66613);
        String[] arrayOfString = e.gMz;
        GMTrace.o(8940645515264L, 66613);
        return arrayOfString;
      }
    });
    GMTrace.o(8940377079808L, 66611);
  }
  
  public g()
  {
    GMTrace.i(8939034902528L, 66601);
    this.oEm = new f();
    this.oEn = new a();
    this.oEo = new b();
    GMTrace.o(8939034902528L, 66601);
  }
  
  private static g aWF()
  {
    GMTrace.i(8939169120256L, 66602);
    g localg2 = (g)ap.AL().gJ("plugin.qmessage");
    g localg1 = localg2;
    if (localg2 == null)
    {
      localg1 = new g();
      ap.AL().a("plugin.qmessage", localg1);
    }
    GMTrace.o(8939169120256L, 66602);
    return localg1;
  }
  
  public static e aWG()
  {
    GMTrace.i(8939303337984L, 66603);
    h.xx().wH();
    if (aWF().oEl == null)
    {
      localObject = aWF();
      ap.AS();
      ((g)localObject).oEl = new e(com.tencent.mm.x.c.yI());
    }
    Object localObject = aWF().oEl;
    GMTrace.o(8939303337984L, 66603);
    return (e)localObject;
  }
  
  public static void aWH()
  {
    GMTrace.i(8939840208896L, 66607);
    ap.AS();
    if (com.tencent.mm.x.c.yQ().SV("qmessage") == null)
    {
      localObject = new ae();
      ((ae)localObject).setUsername("qmessage");
      ((ae)localObject).setContent("");
      ((ae)localObject).w(bg.Pp());
      ((ae)localObject).dC(0);
      ((ae)localObject).dz(0);
      ap.AS();
      com.tencent.mm.x.c.yQ().d((ae)localObject);
      GMTrace.o(8939840208896L, 66607);
      return;
    }
    ap.AS();
    Object localObject = com.tencent.mm.x.c.yN().Bu("qmessage");
    ae localae = new ae();
    localae.setUsername("qmessage");
    if (localObject == null) {}
    for (localObject = "";; localObject = ((ce)localObject).field_content)
    {
      localae.setContent((String)localObject);
      localae.w(bg.Pp());
      localae.dC(0);
      localae.dz(0);
      ap.AS();
      com.tencent.mm.x.c.yQ().a(localae, "qmessage");
      GMTrace.o(8939840208896L, 66607);
      return;
    }
  }
  
  public static void aWI()
  {
    GMTrace.i(8939974426624L, 66608);
    ay.Bj();
    ap.AS();
    com.tencent.mm.x.c.yQ().BB("@qqim");
    ap.AS();
    com.tencent.mm.x.c.yQ().SU("qmessage");
    GMTrace.o(8939974426624L, 66608);
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(8940108644352L, 66609);
    d.c.a(Integer.valueOf(36), this.oEm);
    d.c.a(Integer.valueOf(39), this.oEm);
    com.tencent.mm.sdk.b.a.uLm.b(this.oEn);
    com.tencent.mm.sdk.b.a.uLm.b(this.oEo);
    GMTrace.o(8940108644352L, 66609);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(8940242862080L, 66610);
    GMTrace.o(8940242862080L, 66610);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(8939705991168L, 66606);
    w.d("MicroMsg.SubCoreQMsg", "clear plugin");
    if ((paramInt & 0x20) != 0) {
      aWI();
    }
    GMTrace.o(8939705991168L, 66606);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(8939437555712L, 66604);
    d.c.aB(Integer.valueOf(36));
    d.c.aB(Integer.valueOf(39));
    com.tencent.mm.sdk.b.a.uLm.c(this.oEn);
    com.tencent.mm.sdk.b.a.uLm.c(this.oEo);
    GMTrace.o(8939437555712L, 66604);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(8939571773440L, 66605);
    HashMap localHashMap = gBa;
    GMTrace.o(8939571773440L, 66605);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */