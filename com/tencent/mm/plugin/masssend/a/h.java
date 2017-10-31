package com.tencent.mm.plugin.masssend.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.util.HashMap;

public final class h
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private bp.a nEH;
  private i nGA;
  private g nGB;
  private b nGy;
  private c nGz;
  
  static
  {
    GMTrace.i(11215233351680L, 83560);
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("MASSENDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(11215501787136L, 83562);
        String[] arrayOfString = b.gMz;
        GMTrace.o(11215501787136L, 83562);
        return arrayOfString;
      }
    });
    GMTrace.o(11215233351680L, 83560);
  }
  
  public h()
  {
    GMTrace.i(11214025392128L, 83551);
    this.nGA = new i();
    this.nGB = new g();
    this.nEH = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(11216978182144L, 83573);
        paramAnonymousa = n.a(paramAnonymousa.hme.tvq);
        w.i("MicroMsg.SubCoreMassSend", "MassSendTopConfXml:" + paramAnonymousa);
        h.aMz().Bg(paramAnonymousa);
        h.aMz().aMu();
        h.aMz();
        c.cH(bg.Pp());
        GMTrace.o(11216978182144L, 83573);
      }
    };
    GMTrace.o(11214025392128L, 83551);
  }
  
  private static h aMx()
  {
    GMTrace.i(11214159609856L, 83552);
    h localh2 = (h)ap.AL().gJ("plugin.masssend");
    h localh1 = localh2;
    if (localh2 == null)
    {
      localh1 = new h();
      ap.AL().a("plugin.favorite", localh1);
    }
    GMTrace.o(11214159609856L, 83552);
    return localh1;
  }
  
  public static b aMy()
  {
    GMTrace.i(11214293827584L, 83553);
    com.tencent.mm.kernel.h.xx().wH();
    if (aMx().nGy == null)
    {
      localObject = aMx();
      ap.AS();
      ((h)localObject).nGy = new b(com.tencent.mm.x.c.yI());
    }
    Object localObject = aMx().nGy;
    GMTrace.o(11214293827584L, 83553);
    return (b)localObject;
  }
  
  public static c aMz()
  {
    GMTrace.i(11214428045312L, 83554);
    if (aMx().nGz == null) {
      aMx().nGz = new c();
    }
    c localc = aMx().nGz;
    GMTrace.o(11214428045312L, 83554);
    return localc;
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(11214964916224L, 83558);
    ap.getSysCmdMsgExtension().a("masssendapp", this.nEH, false);
    com.tencent.mm.sdk.b.a.uLm.b(this.nGA);
    com.tencent.mm.sdk.b.a.uLm.b(this.nGB);
    GMTrace.o(11214964916224L, 83558);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(11215099133952L, 83559);
    GMTrace.o(11215099133952L, 83559);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(11214830698496L, 83557);
    GMTrace.o(11214830698496L, 83557);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(11214562263040L, 83555);
    ap.getSysCmdMsgExtension().b("masssendapp", this.nEH, false);
    com.tencent.mm.sdk.b.a.uLm.c(this.nGA);
    com.tencent.mm.sdk.b.a.uLm.c(this.nGB);
    GMTrace.o(11214562263040L, 83555);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(11214696480768L, 83556);
    HashMap localHashMap = gBa;
    GMTrace.o(11214696480768L, 83556);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */