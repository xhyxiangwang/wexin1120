package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.g.a.tb;
import com.tencent.mm.g.a.tb.a;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bq;
import com.tencent.mm.protocal.c.br;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;

public final class aa
  extends com.tencent.mm.ac.k
  implements com.tencent.mm.network.j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  public j lPF;
  
  public aa(j paramj)
  {
    GMTrace.i(6264075583488L, 46671);
    this.gMF = null;
    b.a locala = new b.a();
    locala.hlX = new bq();
    locala.hlY = new br();
    locala.uri = "/cgi-bin/micromsg-bin/addfavitem";
    locala.hlW = 401;
    locala.hlZ = 193;
    locala.hma = 1000000193;
    this.gMC = locala.DA();
    this.lPF = paramj;
    GMTrace.o(6264075583488L, 46671);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6264209801216L, 46672);
    bq localbq = (bq)this.gMC.hlU.hmc;
    localbq.tvh = com.tencent.mm.x.k.f(this.lPF.field_xml, System.currentTimeMillis());
    localbq.jXP = this.lPF.field_type;
    localbq.tvi = this.lPF.field_sourceType;
    this.lPF.field_xml = j.b(this.lPF);
    h.awD().a(this.lPF, new String[] { "localId" });
    localbq.tvk = this.lPF.field_xml;
    localbq.tvj = this.lPF.field_sourceId;
    this.lPF.xb("MicroMsg.NetSceneAddFav");
    this.gMF = parame1;
    w.i("MicroMsg.NetSceneAddFav", "ADD FavItem, sourceId:%s localId:%d favId:%d", new Object[] { this.lPF.field_sourceId, Long.valueOf(this.lPF.field_localId), Integer.valueOf(this.lPF.field_id) });
    int i = a(parame, this.gMC, this);
    GMTrace.o(6264209801216L, 46672);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6264344018944L, 46673);
    w.i("MicroMsg.NetSceneAddFav", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (((paramInt2 == 0) && (paramInt3 == 0)) || (paramInt3 == 65136))
    {
      paramp = (br)((com.tencent.mm.ac.b)paramp).hlV.hmc;
      w.i("MicroMsg.NetSceneAddFav", "fav id %d, local id %d, itemStatus %d, update seq %d", new Object[] { Integer.valueOf(paramp.tvd), Long.valueOf(this.lPF.field_localId), Integer.valueOf(this.lPF.field_itemStatus), Integer.valueOf(paramp.tvg) });
      this.lPF.field_id = paramp.tvd;
      this.lPF.field_localSeq = paramp.tvg;
      if (this.lPF.field_itemStatus == 12)
      {
        w.v("MicroMsg.NetSceneAddFav", "onGYNetEnd wait server upload sent");
        this.lPF.field_itemStatus = 13;
      }
      if (this.lPF.field_itemStatus == 9)
      {
        w.v("MicroMsg.NetSceneAddFav", "onGYNetEnd item done");
        this.lPF.field_itemStatus = 10;
        h.awy().ca(this.lPF.field_localId);
        g.paX.i(10659, new Object[] { Integer.valueOf(0), Integer.valueOf(this.lPF.field_type), Integer.valueOf(0), Long.valueOf(x.k(this.lPF)), Long.valueOf(x.ch(this.lPF.field_localId)) });
      }
      paramArrayOfByte = h.awD().cd(paramp.tvd);
      if (paramArrayOfByte != null)
      {
        this.lPF.field_updateSeq = paramArrayOfByte.field_updateSeq;
        h.awD().d(paramArrayOfByte);
        w.i("MicroMsg.NetSceneAddFav", "onGYNetEnd aleady exist, delete old info, favId:%d", new Object[] { Integer.valueOf(paramArrayOfByte.field_id) });
      }
      paramArrayOfByte = q.Aw().gh(this.lPF.field_sessionId);
      if ((!bg.mZ(this.lPF.field_sessionId)) && (this.lPF.field_type == 5) && (paramArrayOfByte != null))
      {
        tb localtb = new tb();
        localtb.fRM.fRN = paramArrayOfByte.getString("prePublishId", "");
        if ((this.lPF.field_favProto != null) && (this.lPF.field_favProto.tQA != null)) {
          localtb.fRM.url = this.lPF.field_favProto.tQA.hNh;
        }
        if ((bg.mZ(localtb.fRM.url)) && (this.lPF.field_favProto != null) && (this.lPF.field_favProto.tPN != null) && (this.lPF.field_favProto.tPN.tRc != null)) {
          localtb.fRM.url = this.lPF.field_favProto.tPN.tRc;
        }
        if (bg.mZ(localtb.fRM.url)) {
          localtb.fRM.url = paramArrayOfByte.getString("url", "");
        }
        localtb.fRM.fRP = paramArrayOfByte.getString("preUsername", "");
        localtb.fRM.fRQ = paramArrayOfByte.getString("preChatName", "");
        localtb.fRM.fRR = paramArrayOfByte.getInt("preMsgIndex", 0);
        localtb.fRM.fRV = paramArrayOfByte.getInt("sendAppMsgScene", 0);
        localtb.fRM.fRW = paramArrayOfByte.getInt("getA8KeyScene", 0);
        localtb.fRM.fRX = paramArrayOfByte.getString("referUrl", null);
        localtb.fRM.fRY = paramArrayOfByte.getString("adExtStr", null);
        localtb.fRM.fRS = "";
        localtb.fRM.fRT = "";
        localtb.fRM.fRU = 0;
        localtb.fRM.fRO = ("fav_" + m.zF() + "_" + this.lPF.field_id);
        a.uLm.m(localtb);
      }
      this.lPF.field_sessionId = null;
      h.awD().a(this.lPF, new String[] { "localId" });
      x.ck(paramp.tvl);
    }
    if ((paramInt2 == 4) && (paramInt3 == 65135))
    {
      w.w("MicroMsg.NetSceneAddFav", "fav fail, full size");
      if (!this.lPF.awO()) {
        break label904;
      }
      h.awD().r(16, this.lPF.field_localId);
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6264344018944L, 46673);
      return;
      label904:
      h.awD().r(6, this.lPF.field_localId);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6264478236672L, 46674);
    GMTrace.o(6264478236672L, 46674);
    return 401;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */