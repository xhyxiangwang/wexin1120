package com.tencent.mm.plugin.favorite;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.b.ed;
import com.tencent.mm.plugin.favorite.b.ac;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.p;
import com.tencent.mm.plugin.favorite.b.t;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.b.y;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class h
  implements am
{
  private k lNL;
  private com.tencent.mm.plugin.favorite.b.b lNM;
  private com.tencent.mm.plugin.favorite.c.h lNN;
  private com.tencent.mm.plugin.favorite.c.c lNO;
  private com.tencent.mm.plugin.favorite.c.b lNP;
  private p lNQ;
  private com.tencent.mm.plugin.favorite.b.h lNR;
  private com.tencent.mm.plugin.favorite.b.e lNS;
  private com.tencent.mm.plugin.favorite.c.f lNT;
  private com.tencent.mm.plugin.favorite.c.d lNU;
  private t lNV;
  private a lNW;
  private b lNX;
  private f lNY;
  private e lNZ;
  private g lOa;
  private d lOb;
  public ed lOc;
  private com.tencent.mm.plugin.favorite.b.l lOd;
  private volatile boolean lOe;
  private byte[] lOf;
  private y lOg;
  private com.tencent.mm.sdk.b.c lOh;
  private com.tencent.mm.sdk.b.c lOi;
  
  public h()
  {
    GMTrace.i(6257901568000L, 46625);
    this.lNW = new a();
    this.lNX = new b();
    this.lNY = new f();
    this.lNZ = new e();
    this.lOa = new g();
    this.lOb = new d();
    this.lOc = null;
    this.lOe = false;
    this.lOf = new byte[0];
    this.lOg = new y();
    this.lOh = new com.tencent.mm.sdk.b.c() {};
    this.lOi = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6257901568000L, 46625);
  }
  
  public static com.tencent.mm.plugin.favorite.b.e awA()
  {
    GMTrace.i(6259109527552L, 46634);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNS == null) {
      aws().lNS = new com.tencent.mm.plugin.favorite.b.e(aws().lOc);
    }
    com.tencent.mm.plugin.favorite.b.e locale = aws().lNS;
    GMTrace.o(6259109527552L, 46634);
    return locale;
  }
  
  public static com.tencent.mm.plugin.favorite.c.d awB()
  {
    GMTrace.i(6259243745280L, 46635);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNU == null) {
      aws().lNU = new com.tencent.mm.plugin.favorite.c.d();
    }
    com.tencent.mm.plugin.favorite.c.d locald = aws().lNU;
    GMTrace.o(6259243745280L, 46635);
    return locald;
  }
  
  public static p awC()
  {
    GMTrace.i(6259377963008L, 46636);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNQ == null) {
      aws().lNQ = new p(aws().lOc);
    }
    p localp = aws().lNQ;
    GMTrace.o(6259377963008L, 46636);
    return localp;
  }
  
  public static k awD()
  {
    GMTrace.i(6259512180736L, 46637);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNL == null) {
      aws().lNL = new k(aws().lOc);
    }
    k localk = aws().lNL;
    GMTrace.o(6259512180736L, 46637);
    return localk;
  }
  
  public static h aws()
  {
    GMTrace.i(6258035785728L, 46626);
    ??? = (h)ap.AL().gJ("plugin.favorite");
    Object localObject1 = ???;
    if (??? == null)
    {
      localObject1 = new h();
      ap.AL().a("plugin.favorite", (am)localObject1);
    }
    if (((h)localObject1).lOe) {
      w.w("MicroMsg.SubCoreFav", "getCore need reset DB now, befor synchronized %b", new Object[] { Boolean.valueOf(((h)localObject1).lOe) });
    }
    synchronized (((h)localObject1).lOf)
    {
      if (((h)localObject1).lOe)
      {
        ((h)localObject1).lOc = ed.rj();
        ((h)localObject1).lOe = false;
      }
      w.i("MicroMsg.SubCoreFav", "getCore need reset DB now, after synchronized %b", new Object[] { Boolean.valueOf(((h)localObject1).lOe) });
      GMTrace.o(6258035785728L, 46626);
      return (h)localObject1;
    }
  }
  
  public static com.tencent.mm.plugin.favorite.c.h awt()
  {
    GMTrace.i(6258170003456L, 46627);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNN == null) {
      aws().lNN = new com.tencent.mm.plugin.favorite.c.h();
    }
    com.tencent.mm.plugin.favorite.c.h localh = aws().lNN;
    GMTrace.o(6258170003456L, 46627);
    return localh;
  }
  
  public static com.tencent.mm.plugin.favorite.c.b awu()
  {
    GMTrace.i(6258304221184L, 46628);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNP == null) {
      aws().lNP = new com.tencent.mm.plugin.favorite.c.b();
    }
    com.tencent.mm.plugin.favorite.c.b localb = aws().lNP;
    GMTrace.o(6258304221184L, 46628);
    return localb;
  }
  
  public static com.tencent.mm.plugin.favorite.c.f awv()
  {
    GMTrace.i(6258438438912L, 46629);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNT == null) {
      aws().lNT = new com.tencent.mm.plugin.favorite.c.f();
    }
    com.tencent.mm.plugin.favorite.c.f localf = aws().lNT;
    GMTrace.o(6258438438912L, 46629);
    return localf;
  }
  
  public static t aww()
  {
    GMTrace.i(6258572656640L, 46630);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNV == null) {
      aws().lNV = new t();
    }
    t localt = aws().lNV;
    GMTrace.o(6258572656640L, 46630);
    return localt;
  }
  
  public static com.tencent.mm.plugin.favorite.c.c awx()
  {
    GMTrace.i(6258706874368L, 46631);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNO == null) {
      aws().lNO = new com.tencent.mm.plugin.favorite.c.c();
    }
    com.tencent.mm.plugin.favorite.c.c localc = aws().lNO;
    GMTrace.o(6258706874368L, 46631);
    return localc;
  }
  
  public static com.tencent.mm.plugin.favorite.b.b awy()
  {
    GMTrace.i(6258841092096L, 46632);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNM == null) {
      aws().lNM = new com.tencent.mm.plugin.favorite.b.b(aws().lOc);
    }
    com.tencent.mm.plugin.favorite.b.b localb = aws().lNM;
    GMTrace.o(6258841092096L, 46632);
    return localb;
  }
  
  public static com.tencent.mm.plugin.favorite.b.h awz()
  {
    GMTrace.i(6258975309824L, 46633);
    if (!ap.AV()) {
      throw new com.tencent.mm.x.b();
    }
    if (aws().lNR == null) {
      aws().lNR = new com.tencent.mm.plugin.favorite.b.h(aws().lOc);
    }
    com.tencent.mm.plugin.favorite.b.h localh = aws().lNR;
    GMTrace.o(6258975309824L, 46633);
    return localh;
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(6259780616192L, 46639);
    w.i("MicroMsg.SubCoreFav", "onAccountPostReset updated:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.lOe = true;
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("uploadfavitem", this.lOg);
    com.tencent.mm.sdk.b.a.uLm.b(this.lNW);
    com.tencent.mm.sdk.b.a.uLm.b(this.lNX);
    com.tencent.mm.sdk.b.a.uLm.b(this.lNZ);
    com.tencent.mm.sdk.b.a.uLm.b(this.lNY);
    com.tencent.mm.sdk.b.a.uLm.b(this.lOi);
    com.tencent.mm.sdk.b.a.uLm.b(this.lOa);
    com.tencent.mm.sdk.b.a.uLm.b(this.lOb);
    com.tencent.mm.sdk.b.a.uLm.a(this.lOh);
    Object localObject = new File(x.awZ());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.d("MicroMsg.SubCoreFav", "fav root dir not exists, try to make it");
      ((File)localObject).mkdirs();
    }
    localObject = new File(x.axa());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.d("MicroMsg.SubCoreFav", "fav web dir not exists, try to make it");
      ((File)localObject).mkdirs();
    }
    localObject = new File(x.axc());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.d("MicroMsg.SubCoreFav", "fav attach dir not exists, try to make it");
      ((File)localObject).mkdirs();
    }
    localObject = new File(x.axb());
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.d("MicroMsg.SubCoreFav", "fav voice dir not exists, try to make it");
      ((File)localObject).mkdirs();
    }
    this.lOd = new com.tencent.mm.plugin.favorite.b.l();
    awy().a(this.lOd);
    awD().c(this.lOd);
    localObject = new com.tencent.mm.plugin.favorite.a.a();
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).registerIndexStorage((com.tencent.mm.plugin.fts.a.g)localObject);
    localObject = new com.tencent.mm.plugin.favorite.a.b();
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).registerNativeLogic(6, (i)localObject);
    com.tencent.mm.plugin.fts.d.h.a(new com.tencent.mm.plugin.favorite.ui.b.d());
    com.tencent.mm.plugin.fts.d.h.a(new com.tencent.mm.plugin.favorite.ui.b.b());
    GMTrace.o(6259780616192L, 46639);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(6259914833920L, 46640);
    GMTrace.o(6259914833920L, 46640);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(6259646398464L, 46638);
    GMTrace.o(6259646398464L, 46638);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(6260049051648L, 46641);
    this.lOe = false;
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("uploadfavitem", this.lOg);
    com.tencent.mm.sdk.b.a.uLm.c(this.lNW);
    com.tencent.mm.sdk.b.a.uLm.c(this.lNX);
    com.tencent.mm.sdk.b.a.uLm.c(this.lNZ);
    com.tencent.mm.sdk.b.a.uLm.c(this.lOi);
    com.tencent.mm.sdk.b.a.uLm.c(this.lNY);
    com.tencent.mm.sdk.b.a.uLm.c(this.lOa);
    com.tencent.mm.sdk.b.a.uLm.c(this.lOb);
    com.tencent.mm.sdk.b.a.uLm.c(this.lOh);
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).unregisterIndexStorage(256);
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).unregisterNativeLogic(6);
    com.tencent.mm.plugin.fts.d.h.nT(128);
    com.tencent.mm.plugin.fts.d.h.nT(4176);
    awy().b(this.lOd);
    awD().j(this.lOd);
    this.lOd = null;
    Object localObject = awx();
    ((com.tencent.mm.plugin.favorite.c.c)localObject).qM();
    ((com.tencent.mm.plugin.favorite.c.c)localObject).fsg.MM();
    ((com.tencent.mm.plugin.favorite.c.c)localObject).fsb = 0;
    ap.b(((com.tencent.mm.plugin.favorite.c.c)localObject).hrU);
    localObject = awu();
    ((com.tencent.mm.plugin.favorite.c.b)localObject).qM();
    ((com.tencent.mm.plugin.favorite.c.b)localObject).fsg.MM();
    ap.wT().b(404, (com.tencent.mm.ac.e)localObject);
    ap.b(((com.tencent.mm.plugin.favorite.c.b)localObject).hrU);
    localObject = awt();
    ((com.tencent.mm.plugin.favorite.c.h)localObject).qM();
    ((com.tencent.mm.plugin.favorite.c.h)localObject).fsg.MM();
    ((com.tencent.mm.plugin.favorite.c.h)localObject).fsb = 0;
    ap.wT().b(401, (com.tencent.mm.ac.e)localObject);
    localObject = awv();
    ((com.tencent.mm.plugin.favorite.c.f)localObject).qM();
    ((com.tencent.mm.plugin.favorite.c.f)localObject).fsg.MM();
    ((com.tencent.mm.plugin.favorite.c.f)localObject).fsb = 0;
    ap.wT().b(426, (com.tencent.mm.ac.e)localObject);
    localObject = awB();
    ap.wT().b(426, (com.tencent.mm.ac.e)localObject);
    ap.wT().b(401, (com.tencent.mm.ac.e)localObject);
    ((com.tencent.mm.plugin.favorite.c.d)localObject).lQx.clear();
    ac.axq();
    if (this.lOc != null) {
      this.lOc.yF();
    }
    GMTrace.o(6260049051648L, 46641);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(6260183269376L, 46642);
    GMTrace.o(6260183269376L, 46642);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */