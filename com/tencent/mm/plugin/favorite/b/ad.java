package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.ac.n;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.favorite.c.c;
import com.tencent.mm.plugin.favorite.c.f;
import com.tencent.mm.protocal.c.lc;
import com.tencent.mm.protocal.c.ld;
import com.tencent.mm.protocal.c.le;
import com.tencent.mm.protocal.c.so;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class ad
  extends com.tencent.mm.ac.k
  implements com.tencent.mm.network.j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private int lPL;
  public j lPM;
  private boolean lPN;
  private boolean lPO;
  HashMap<sp, Boolean> lPP;
  
  public ad(j paramj)
  {
    GMTrace.i(6305548861440L, 46980);
    this.lPL = 0;
    this.gMF = null;
    this.lPN = true;
    this.lPO = false;
    this.lPP = new HashMap();
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new ld();
    ((b.a)localObject).hlY = new le();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkcdn";
    ((b.a)localObject).hlW = 404;
    ((b.a)localObject).hlZ = 197;
    ((b.a)localObject).hma = 1000000197;
    this.gMC = ((b.a)localObject).DA();
    this.lPM = paramj;
    paramj = paramj.field_favProto.tQC.iterator();
    while (paramj.hasNext())
    {
      localObject = (sp)paramj.next();
      this.lPP.put(localObject, Boolean.valueOf(false));
    }
    GMTrace.o(6305548861440L, 46980);
  }
  
  private boolean axt()
  {
    GMTrace.i(6306354167808L, 46986);
    if (this.lPM.field_type == 18)
    {
      Object localObject = com.tencent.mm.plugin.favorite.h.awD().cc(this.lPM.field_localId);
      if ((localObject != null) && (((j)localObject).field_id < 0) && (((j)localObject).field_favProto.version >= 2))
      {
        ((j)localObject).field_favProto.zr(1);
        com.tencent.mm.plugin.favorite.h.awD().a((j)localObject, new String[] { "localId" });
        this.lPM = ((j)localObject);
        localObject = new ad(this.lPM);
        ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
        GMTrace.o(6306354167808L, 46986);
        return true;
      }
    }
    GMTrace.o(6306354167808L, 46986);
    return false;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6305683079168L, 46981);
    this.gMF = parame1;
    parame1 = this.lPP.keySet().iterator();
    int j = 0;
    Object localObject;
    if (parame1.hasNext())
    {
      localObject = (sp)parame1.next();
      if (((Boolean)this.lPP.get(localObject)).booleanValue()) {
        break label669;
      }
    }
    label544:
    label565:
    label660:
    label666:
    label669:
    for (int i = j + 1;; i = j)
    {
      j = i;
      break;
      if (j == 0)
      {
        w.e("MicroMsg.NetSceneCheckCDN", "klem doScene data list null");
        this.lPL = -100;
        GMTrace.o(6305683079168L, 46981);
        return -100;
      }
      parame1 = (ld)this.gMC.hlU.hmc;
      parame1.jWR.clear();
      localObject = this.lPM.field_favProto.tQC;
      int m = 0;
      i = 0;
      int k;
      if (m < ((List)localObject).size())
      {
        sp localsp = (sp)((List)localObject).get(m);
        if (((Boolean)this.lPP.get(localsp)).booleanValue()) {
          break label666;
        }
        k = i;
        if (!localsp.tPj)
        {
          locallc = new lc();
          locallc.tHv = ((int)localsp.tOS);
          locallc.tHt = localsp.tOO;
          locallc.tHu = localsp.tOQ;
          locallc.tHs = String.valueOf(m);
          locallc.tHx = localsp.tPf;
          locallc.tHw = this.lPM.field_sourceType;
          locallc.tHy = 0;
          parame1.jWR.add(locallc);
          k = i + 1;
          w.i("MicroMsg.NetSceneCheckCDN", "check CDN, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", new Object[] { locallc.tHs, locallc.tHx, Integer.valueOf(locallc.tHw), Integer.valueOf(locallc.tHv), locallc.tHt, locallc.tHu });
        }
        if (localsp.tPl) {
          break label660;
        }
        lc locallc = new lc();
        locallc.tHv = ((int)localsp.tPd);
        locallc.tHt = localsp.tOZ;
        locallc.tHu = localsp.tPb;
        locallc.tHx = localsp.tPf;
        locallc.tHw = this.lPM.field_sourceType;
        locallc.tHs = (m + "t");
        locallc.tHy = 1;
        parame1.jWR.add(locallc);
        i = k + 1;
        w.i("MicroMsg.NetSceneCheckCDN", "check CDN thumb, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", new Object[] { locallc.tHs, locallc.tHx, Integer.valueOf(locallc.tHw), Integer.valueOf(locallc.tHv), locallc.tHt, locallc.tHu });
        k = i;
        if (i >= 19) {
          break label565;
        }
      }
      for (;;)
      {
        m += 1;
        break;
        k = i;
        w.i("MicroMsg.NetSceneCheckCDN", "doScene:  usedCount %d, dataSize %d, nextBegIndex %d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(m + 1) });
        parame1.jWQ = k;
        if (k == 0)
        {
          w.w("MicroMsg.NetSceneCheckCDN", "no more data, must not check cdn!");
          this.lPL = -101;
          GMTrace.o(6305683079168L, 46981);
          return -101;
        }
        i = a(parame, this.gMC, this);
        GMTrace.o(6305683079168L, 46981);
        return i;
        i = k;
        break label544;
      }
    }
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(6305951514624L, 46983);
    int i = k.b.hmE;
    GMTrace.o(6305951514624L, 46983);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6305817296896L, 46982);
    w.i("MicroMsg.NetSceneCheckCDN", "netId %d errType %d errCode %d localErrCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.lPL), paramString });
    int i;
    if (paramInt2 == 0)
    {
      i = paramInt3;
      if (paramInt3 == 0) {}
    }
    else
    {
      if ((paramInt2 == 3) && (this.lPL == -100))
      {
        w.d("MicroMsg.NetSceneCheckCDN", "need not check cdn, add fav now");
        com.tencent.mm.plugin.favorite.h.awD().r(9, this.lPM.field_localId);
        com.tencent.mm.plugin.favorite.h.awt().run();
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(6305817296896L, 46982);
        return;
      }
      if ((paramInt2 != 3) || (this.lPL != -101)) {
        break label819;
      }
      i = 0;
    }
    if ((this.lPL != -101) && (paramInt2 == 0) && (i == 0))
    {
      paramp = ((le)((b)paramp).hlV.hmc).jWR;
      paramArrayOfByte = this.lPM.field_favProto.tQC;
      paramInt1 = 0;
      Object localObject2;
      if (paramInt1 < paramp.size())
      {
        localObject1 = (so)paramp.get(paramInt1);
        localObject2 = ((so)localObject1).tHs;
        sp localsp;
        if (!bg.mZ((String)localObject2))
        {
          w.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet status:%d, tmpId %s", new Object[] { Integer.valueOf(((so)localObject1).jXo), localObject2 });
          if (((so)localObject1).jXo == 1)
          {
            if (((String)localObject2).endsWith("t")) {
              break label843;
            }
            localsp = (sp)paramArrayOfByte.get(bg.getInt((String)localObject2, 0));
            w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn data exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s", new Object[] { ((so)localObject1).tOn, ((so)localObject1).tDT, ((so)localObject1).tHs, ((so)localObject1).tHt, Integer.valueOf(((so)localObject1).tHv), ((so)localObject1).tHu });
            localsp.Ps(((so)localObject1).tDT);
            localsp.Pr(((so)localObject1).tOn);
            if (!bg.mZ(((so)localObject1).tOo)) {
              localsp.PG(((so)localObject1).tOo);
            }
            if (bg.mZ(localsp.tOO))
            {
              w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn exist, local not exist");
              localsp.Py(((so)localObject1).tHt);
              localsp.et(((so)localObject1).tHv);
              localsp.Pz(((so)localObject1).tHu);
              x.a(localsp, this.lPM, 1, false);
            }
            if ((!bg.mZ(((so)localObject1).tHt)) && (!((so)localObject1).tHt.equals(localsp.tOO)))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "svrFullMd5 %s, localMd5 %s", new Object[] { ((so)localObject1).tHt, localsp.tOO });
              localsp.Py(((so)localObject1).tHt);
            }
            if ((!bg.mZ(((so)localObject1).tHu)) && (!((so)localObject1).tHu.equals(localsp.tOQ)))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "svrHead256md5 %s, localHead256md5 %s", new Object[] { ((so)localObject1).tHu, localsp.tOQ });
              localsp.Pz(((so)localObject1).tHu);
            }
            if ((((so)localObject1).tHv > 0) && (((so)localObject1).tHv != localsp.tOS))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "svrFullSize %d, localFullSize %d", new Object[] { Integer.valueOf(((so)localObject1).tHv), Long.valueOf(localsp.tOS) });
              localsp.et(((so)localObject1).tHv);
            }
          }
          label681:
          if (((String)localObject2).endsWith("t")) {
            break label1113;
          }
          localsp = (sp)paramArrayOfByte.get(bg.getInt((String)localObject2, 0));
          this.lPP.put(localsp, Boolean.valueOf(true));
          label724:
          if ((((so)localObject1).jXo != 3) && (((so)localObject1).jXo != -2) && (((so)localObject1).jXo != -1)) {
            break label1195;
          }
          if (((String)localObject2).endsWith("t")) {
            break label1536;
          }
          localsp = (sp)paramArrayOfByte.get(bg.getInt((String)localObject2, 0));
          if (!bg.mZ(localsp.tOO)) {
            break label1159;
          }
          w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet data cdn not exist, local not exist ", new Object[] { localsp.tOO });
        }
        for (;;)
        {
          paramInt1 += 1;
          break;
          label819:
          this.gMF.a(paramInt2, paramInt3, paramString, this);
          GMTrace.o(6305817296896L, 46982);
          return;
          label843:
          localsp = (sp)paramArrayOfByte.get(bg.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
          w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn thumb exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s", new Object[] { ((so)localObject1).tOn, ((so)localObject1).tDT, ((so)localObject1).tHs, ((so)localObject1).tHt, Integer.valueOf(((so)localObject1).tHv), ((so)localObject1).tHu });
          localsp.Pq(((so)localObject1).tDT);
          localsp.Pp(((so)localObject1).tOn);
          if (((so)localObject1).tHv <= 0) {
            break label681;
          }
          localsp.eu(((so)localObject1).tHv);
          if ((!bg.mZ(((so)localObject1).tHt)) && (!((so)localObject1).tHt.equals(localsp.tOZ)))
          {
            w.w("MicroMsg.NetSceneCheckCDN", "svrThumbMd5 %s, localThumbMd5 %s", new Object[] { ((so)localObject1).tHt, localsp.tOZ });
            localsp.PD(((so)localObject1).tHt);
          }
          if ((bg.mZ(((so)localObject1).tHu)) || (((so)localObject1).tHu.equals(localsp.tPb))) {
            break label681;
          }
          w.w("MicroMsg.NetSceneCheckCDN", "svrThumbHead256md5 %s, localThumbHead256md5 %s", new Object[] { ((so)localObject1).tHu, localsp.tPb });
          localsp.PE(((so)localObject1).tHu);
          break label681;
          label1113:
          localsp = (sp)paramArrayOfByte.get(bg.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
          this.lPP.put(localsp, Boolean.valueOf(true));
          break label724;
          label1159:
          this.lPN = false;
          w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn not exist, insert data md5:%s", new Object[] { localsp.tOO });
          x.a(localsp, this.lPM, 0, false);
          for (;;)
          {
            label1195:
            if (((so)localObject1).jXo != 2) {
              break label1635;
            }
            this.lPO = true;
            if (((String)localObject2).endsWith("t")) {
              break label1637;
            }
            w.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet data cdn not exist svr upload, dataStatus:%d, CdnUrl:%s, CdnKey:%s", new Object[] { Integer.valueOf(((so)localObject1).tOp), ((so)localObject1).tOn, ((so)localObject1).tDT });
            localObject2 = (sp)paramArrayOfByte.get(bg.getInt((String)localObject2, 0));
            ((sp)localObject2).zl(((so)localObject1).tOp);
            ((sp)localObject2).Ps(((so)localObject1).tDT);
            ((sp)localObject2).Pr(((so)localObject1).tOn);
            if (!bg.mZ(((so)localObject1).tOo)) {
              ((sp)localObject2).PG(((so)localObject1).tOo);
            }
            if ((!bg.mZ(((so)localObject1).tHt)) && (!((so)localObject1).tHt.equals(((sp)localObject2).tOO)))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrFullMd5 %s, localMd5 %s", new Object[] { ((so)localObject1).tHt, ((sp)localObject2).tOO });
              ((sp)localObject2).Py(((so)localObject1).tHt);
            }
            if ((!bg.mZ(((so)localObject1).tHu)) && (!((so)localObject1).tHu.equals(((sp)localObject2).tOQ)))
            {
              w.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrHead256md5 %s, localHead256md5 %s", new Object[] { ((so)localObject1).tHu, ((sp)localObject2).tOQ });
              ((sp)localObject2).Pz(((so)localObject1).tHu);
            }
            if ((((so)localObject1).tHv <= 0) || (((so)localObject1).tHv == ((sp)localObject2).tOS)) {
              break;
            }
            w.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrFullSize %d, localFullSize %d", new Object[] { Integer.valueOf(((so)localObject1).tHv), Long.valueOf(((sp)localObject2).tOS) });
            ((sp)localObject2).et(((so)localObject1).tHv);
            break;
            label1536:
            localsp = (sp)paramArrayOfByte.get(bg.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
            if (bg.mZ(localsp.tOZ))
            {
              w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet thumb cdn not exist, local not exist ", new Object[] { localsp.tOZ });
              break;
            }
            this.lPN = false;
            w.v("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn not exist, insert thumb md5:%s", new Object[] { localsp.tOZ });
            x.a(localsp, this.lPM, 0);
          }
          label1635:
          continue;
          label1637:
          w.e("MicroMsg.NetSceneCheckCDN", "klem OnGYNet svr uploading thumb?! should not reach here!!");
        }
      }
      Object localObject1 = this.lPP.keySet().iterator();
      paramInt1 = 0;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (sp)((Iterator)localObject1).next();
        if (((Boolean)this.lPP.get(localObject2)).booleanValue()) {
          break label2111;
        }
        paramInt1 += 1;
      }
    }
    label2111:
    for (;;)
    {
      break;
      w.i("MicroMsg.NetSceneCheckCDN", "onGYSceneEnd:  resultCount %d, dataSize %d", new Object[] { Integer.valueOf(paramp.size()), Integer.valueOf(paramArrayOfByte.size()) });
      if (paramInt1 > 0)
      {
        w.w("MicroMsg.NetSceneCheckCDN", "check cdn list not end, continues");
        paramInt1 = a(this.hmo, this.gMF);
        if ((paramInt1 != -100) && (paramInt1 != -101))
        {
          GMTrace.o(6305817296896L, 46982);
          return;
        }
      }
      if (this.lPO)
      {
        w.i("MicroMsg.NetSceneCheckCDN", "klem onGYNet waitServerUpload, send item now");
        this.lPM.field_itemStatus = 12;
        com.tencent.mm.plugin.favorite.h.awD().a(this.lPM, new String[] { "localId" });
        com.tencent.mm.plugin.favorite.h.awt().run();
        this.gMF.a(paramInt2, i, paramString, this);
        GMTrace.o(6305817296896L, 46982);
        return;
      }
      if (this.lPN)
      {
        w.v("MicroMsg.NetSceneCheckCDN", "klem onGYNet all data exist, start send item");
        if ((this.lPM.field_type == 18) && (this.lPM.field_id > 0))
        {
          this.lPM.field_itemStatus = 17;
          com.tencent.mm.plugin.favorite.h.awD().a(this.lPM, new String[] { "localId" });
          com.tencent.mm.plugin.favorite.h.awv().run();
        }
        for (;;)
        {
          this.gMF.a(paramInt2, i, paramString, this);
          GMTrace.o(6305817296896L, 46982);
          return;
          if (axt())
          {
            GMTrace.o(6305817296896L, 46982);
            return;
          }
          this.lPM.field_itemStatus = 9;
          com.tencent.mm.plugin.favorite.h.awD().a(this.lPM, new String[] { "localId" });
          com.tencent.mm.plugin.favorite.h.awt().run();
        }
      }
      if ((this.lPM.field_type == 18) && (this.lPM.field_id > 0)) {}
      for (this.lPM.field_itemStatus = 15;; this.lPM.field_itemStatus = 4)
      {
        com.tencent.mm.plugin.favorite.h.awD().a(this.lPM, new String[] { "localId" });
        com.tencent.mm.plugin.favorite.h.awx().run();
        break;
        if (axt())
        {
          GMTrace.o(6305817296896L, 46982);
          return;
        }
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6306219950080L, 46985);
    GMTrace.o(6306219950080L, 46985);
    return 404;
  }
  
  protected final int vG()
  {
    GMTrace.i(6306085732352L, 46984);
    GMTrace.o(6306085732352L, 46984);
    return 10;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */