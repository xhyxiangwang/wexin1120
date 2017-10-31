package com.tencent.mm.plugin.backup.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.n;
import com.tencent.mm.bb.m;
import com.tencent.mm.bt.f.a;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.chatroom.b.a;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.am;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.aa;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class c
{
  private String cachePath;
  String gRr;
  public com.tencent.mm.bt.g gRs;
  private t gRu;
  private ba gRv;
  private com.tencent.mm.av.b hIA;
  private s hUe;
  private u hWq;
  private com.tencent.mm.ae.e hpT;
  private ar jSi;
  private com.tencent.mm.plugin.messenger.foundation.a.a.c jSj;
  private as jSk;
  private com.tencent.mm.an.f jSl;
  private com.tencent.mm.storage.emotion.d jSm;
  public com.tencent.mm.plugin.messenger.foundation.a.a.f jSn;
  aa jSo;
  private m jSp;
  private com.tencent.mm.ab.g jSq;
  private com.tencent.mm.modelstat.l jSr;
  private n jSs;
  public k jSt;
  public com.tencent.mm.pluginsdk.model.app.i jSu;
  private com.tencent.mm.pluginsdk.model.app.c jSv;
  public com.tencent.mm.bt.f jSw;
  public Boolean jSx;
  public int uin;
  
  public c()
  {
    GMTrace.i(14852802215936L, 110662);
    this.gRs = null;
    this.jSw = null;
    this.uin = 0;
    this.jSx = null;
    GMTrace.o(14852802215936L, 110662);
  }
  
  public final com.tencent.mm.an.f IW()
  {
    GMTrace.i(14853741740032L, 110669);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    com.tencent.mm.an.f localf = this.jSl;
    GMTrace.o(14853741740032L, 110669);
    return localf;
  }
  
  public final s Na()
  {
    GMTrace.i(14854010175488L, 110671);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    s locals = this.hUe;
    GMTrace.o(14854010175488L, 110671);
    return locals;
  }
  
  final void afl()
  {
    GMTrace.i(14853070651392L, 110664);
    this.gRu = new t(this.gRs);
    com.tencent.mm.plugin.messenger.foundation.a.i locali = (com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.i.class);
    this.jSi = locali.d(this.gRs);
    this.jSk = locali.e(this.gRs);
    this.jSj = locali.a(this.gRs, this.jSi, this.jSk);
    this.jSj.a(new am(this.jSj));
    this.jSj.a(new o(this.jSj));
    this.jSn = locali.f(this.gRs);
    this.jSl = new com.tencent.mm.an.f(this.gRs);
    if (com.tencent.mm.bi.d.KT("emoji")) {
      this.jSm = new com.tencent.mm.storage.emotion.d(this.gRs);
    }
    this.jSo = ((a)com.tencent.mm.kernel.h.h(a.class)).c(this.gRs);
    this.jSq = new com.tencent.mm.ab.g(this.gRs);
    this.hWq = new u(this.gRs);
    this.hUe = new s(this.gRs);
    this.jSp = new m(this.gRs);
    this.jSr = new com.tencent.mm.modelstat.l(this.gRs);
    this.jSs = new n(this.gRs);
    this.hIA = new com.tencent.mm.av.b(this.gRs);
    this.jSt = new k(this.gRs);
    this.jSu = new com.tencent.mm.pluginsdk.model.app.i(this.gRs);
    this.jSv = new com.tencent.mm.pluginsdk.model.app.c(this.gRs);
    this.hpT = new com.tencent.mm.ae.e(this.gRs);
    this.gRv = new ba(this.gRu);
    this.gRv.c(new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(14855352352768L, 110681);
        p.dJ(paramAnonymousString);
        GMTrace.o(14855352352768L, 110681);
      }
    });
    this.gRv.bRw();
    GMTrace.o(14853070651392L, 110664);
  }
  
  public final com.tencent.mm.storage.emotion.d afm()
  {
    GMTrace.i(14853875957760L, 110670);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    com.tencent.mm.storage.emotion.d locald = this.jSm;
    GMTrace.o(14853875957760L, 110670);
    return locald;
  }
  
  public final com.tencent.mm.pluginsdk.model.app.c afn()
  {
    GMTrace.i(14854278610944L, 110673);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    com.tencent.mm.pluginsdk.model.app.c localc = this.jSv;
    GMTrace.o(14854278610944L, 110673);
    return localc;
  }
  
  public final void k(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(14852936433664L, 110663);
    w.i("MicroMsg.TempStorage", "accPath %s, cachePath %s, accUin:%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    this.uin = paramInt;
    this.gRr = paramString1;
    this.cachePath = paramString2;
    GMTrace.o(14852936433664L, 110663);
  }
  
  public final t xi()
  {
    GMTrace.i(14853204869120L, 110665);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    t localt = this.gRu;
    GMTrace.o(14853204869120L, 110665);
    return localt;
  }
  
  public final void yF()
  {
    GMTrace.i(18452924334080L, 137485);
    w.i("MicroMsg.TempStorage", "closeDB isTempDb:%s datadb:%s memdb:%s %s", new Object[] { this.jSx, this.gRs, this.jSw, bg.bOd() });
    if ((this.jSx != null) && (!this.jSx.booleanValue()))
    {
      this.jSx = null;
      GMTrace.o(18452924334080L, 137485);
      return;
    }
    if (this.gRs != null)
    {
      w.i("MicroMsg.TempStorage", "closeDB true DB[%s]!!! ", new Object[] { this.gRs });
      this.gRs.yF();
      this.gRs = null;
    }
    if (this.jSw != null)
    {
      com.tencent.mm.bt.f localf = this.jSw;
      com.tencent.mm.bt.f.vhl = bg.bOd().toString();
      if (localf.vgO != null)
      {
        localf.vgO.close();
        localf.vgO = null;
      }
      this.jSw = null;
    }
    this.jSx = null;
    GMTrace.o(18452924334080L, 137485);
  }
  
  public final ar yL()
  {
    GMTrace.i(14853339086848L, 110666);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    ar localar = this.jSi;
    GMTrace.o(14853339086848L, 110666);
    return localar;
  }
  
  public final com.tencent.mm.plugin.messenger.foundation.a.a.c yN()
  {
    GMTrace.i(14853473304576L, 110667);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    com.tencent.mm.plugin.messenger.foundation.a.a.c localc = this.jSj;
    GMTrace.o(14853473304576L, 110667);
    return localc;
  }
  
  public final as yQ()
  {
    GMTrace.i(14853607522304L, 110668);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    as localas = this.jSk;
    GMTrace.o(14853607522304L, 110668);
    return localas;
  }
  
  public final String zc()
  {
    GMTrace.i(14854144393216L, 110672);
    if (this.uin == 0) {
      throw new com.tencent.mm.x.b();
    }
    String str = this.gRr + "emoji/";
    GMTrace.o(14854144393216L, 110672);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */