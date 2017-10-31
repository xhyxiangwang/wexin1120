package com.tencent.mm.plugin.bottle.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.au.f;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.a;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.bn;
import java.util.HashMap;

public final class i
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private as.a hfJ;
  private b kfa;
  
  static
  {
    GMTrace.i(7597931364352L, 56609);
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("THROWBOTTLEINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(7595112792064L, 56588);
        String[] arrayOfString = b.gMz;
        GMTrace.o(7595112792064L, 56588);
        return arrayOfString;
      }
    });
    GMTrace.o(7597931364352L, 56609);
  }
  
  public i()
  {
    GMTrace.i(7596723404800L, 56600);
    this.hfJ = new as.a()
    {
      public final void a(ae paramAnonymousae, as paramAnonymousas)
      {
        GMTrace.i(7598199799808L, 56611);
        if (paramAnonymousae == null)
        {
          GMTrace.o(7598199799808L, 56611);
          return;
        }
        if ("_USER_FOR_THROWBOTTLE_".equals(paramAnonymousae.field_username))
        {
          paramAnonymousae.setUsername("");
          GMTrace.o(7598199799808L, 56611);
          return;
        }
        if ((1 != paramAnonymousae.field_isSend) && (x.fg(paramAnonymousae.field_username)) && (!paramAnonymousas.yh(paramAnonymousae.field_username))) {
          c.ti(paramAnonymousae.field_username);
        }
        GMTrace.o(7598199799808L, 56611);
      }
    };
    GMTrace.o(7596723404800L, 56600);
  }
  
  private static i agW()
  {
    GMTrace.i(7596857622528L, 56601);
    i locali2 = (i)ap.AL().gJ("plugin.bottle");
    i locali1 = locali2;
    if (locali2 == null)
    {
      locali1 = new i();
      ap.AL().a("plugin.bottle", locali1);
    }
    GMTrace.o(7596857622528L, 56601);
    return locali1;
  }
  
  public static b agX()
  {
    GMTrace.i(7596991840256L, 56602);
    h.xx().wH();
    if (agW().kfa == null)
    {
      localObject = agW();
      ap.AS();
      ((i)localObject).kfa = new b(com.tencent.mm.x.c.yI());
    }
    Object localObject = agW().kfa;
    GMTrace.o(7596991840256L, 56602);
    return (b)localObject;
  }
  
  public static void agY()
  {
    GMTrace.i(7597528711168L, 56606);
    ap.AS();
    Cursor localCursor = com.tencent.mm.x.c.yQ().bQm();
    int i = 0;
    while (i < localCursor.getCount())
    {
      localCursor.moveToPosition(i);
      ae localae = new ae();
      localae.b(localCursor);
      ap.AS();
      au localau = com.tencent.mm.x.c.yN().Bt(localae.field_username);
      ap.AS();
      com.tencent.mm.x.c.yK().b(new com.tencent.mm.au.d(localae.field_username, localau.field_msgSvrId));
      ap.AS();
      com.tencent.mm.x.c.yK().b(new f(localae.field_username, 0));
      ap.AS();
      com.tencent.mm.x.c.yL().SR(localae.field_username);
      i += 1;
    }
    localCursor.close();
    ap.AS();
    com.tencent.mm.x.c.yN().BB("@bottle");
    ap.AS();
    com.tencent.mm.x.c.yQ().bQg();
    ap.AS();
    com.tencent.mm.x.c.yQ().BB("floatbottle");
    ay.Bi();
    agX().hhi.delete("bottleinfo1", null, null);
    GMTrace.o(7597528711168L, 56606);
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(7597662928896L, 56607);
    c.agS();
    ap.AS();
    com.tencent.mm.x.c.yQ().b(this.hfJ);
    GMTrace.o(7597662928896L, 56607);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7597797146624L, 56608);
    GMTrace.o(7597797146624L, 56608);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7597394493440L, 56605);
    if ((paramInt & 0x40) != 0) {
      agY();
    }
    GMTrace.o(7597394493440L, 56605);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7597126057984L, 56603);
    ap.AS();
    com.tencent.mm.x.c.yQ().c(this.hfJ);
    GMTrace.o(7597126057984L, 56603);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(7597260275712L, 56604);
    HashMap localHashMap = gBa;
    GMTrace.o(7597260275712L, 56604);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */