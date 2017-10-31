package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.b.b.a;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bcl;
import com.tencent.mm.protocal.c.bco;
import com.tencent.mm.protocal.c.bcs;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdj;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdn;
import com.tencent.mm.protocal.c.bdo;
import com.tencent.mm.protocal.c.bdp;
import com.tencent.mm.protocal.c.bdq;
import com.tencent.mm.protocal.c.bdr;
import com.tencent.mm.protocal.c.bdx;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class q
  extends k
  implements com.tencent.mm.network.j
{
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  private com.tencent.mm.sdk.platformtools.ae handler;
  public int pYt;
  private long qbs;
  private bcz qbt;
  private Object qbu;
  private int qbv;
  public int type;
  
  public q(long paramLong, int paramInt)
  {
    this(paramLong, paramInt, null, null);
    GMTrace.i(8044876398592L, 59939);
    GMTrace.o(8044876398592L, 59939);
  }
  
  public q(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(8045279051776L, 59942);
    this.type = -1;
    this.qbs = 0L;
    this.pYt = -1;
    this.qbv = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.qbt = null;
    this.type = 9;
    this.qbs = paramLong;
    w.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + paramLong + "  op : " + this.type);
    Object localObject1 = new b.a();
    ((b.a)localObject1).hlX = new bdq();
    ((b.a)localObject1).hlY = new bdr();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/mmsnsobjectop";
    ((b.a)localObject1).hlW = 218;
    ((b.a)localObject1).hlZ = 104;
    ((b.a)localObject1).hma = 1000000104;
    this.gMC = ((b.a)localObject1).DA();
    localObject1 = (bdq)this.gMC.hlU.hmc;
    Object localObject2 = ae.bhp().dP(paramLong);
    if (localObject2 != null) {
      this.pYt = ((m)localObject2).quQ;
    }
    localObject2 = v(paramLong, this.type);
    bdp localbdp = new bdp();
    localbdp.ttY = paramInt1;
    localbdp.uvB = paramInt2;
    localbdp.uvC = com.tencent.mm.platformtools.n.mV(paramString);
    try
    {
      paramString = localbdp.toByteArray();
      ((bdn)localObject2).umJ = new axs().bd(paramString);
      paramString = new LinkedList();
      paramString.add(localObject2);
      ((bdq)localObject1).uvE = paramString;
      ((bdq)localObject1).uvD = paramString.size();
      GMTrace.o(8045279051776L, 59942);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramString, "", new Object[0]);
      }
    }
  }
  
  public q(long paramLong, int paramInt, bcz parambcz)
  {
    this(paramLong, paramInt, parambcz, null);
    GMTrace.i(8045010616320L, 59940);
    GMTrace.o(8045010616320L, 59940);
  }
  
  private q(long paramLong, int paramInt, bcz parambcz, Object paramObject)
  {
    GMTrace.i(8045144834048L, 59941);
    this.type = -1;
    this.qbs = 0L;
    this.pYt = -1;
    this.qbv = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.qbt = parambcz;
    this.type = paramInt;
    this.qbs = paramLong;
    this.qbu = paramObject;
    w.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + paramLong + "  op : " + paramInt);
    if (parambcz != null) {
      w.i("MicroMsg.NetSceneSnsObjectOp", parambcz.uuE + " " + parambcz.uuH);
    }
    parambcz = new b.a();
    parambcz.hlX = new bdq();
    parambcz.hlY = new bdr();
    parambcz.uri = "/cgi-bin/micromsg-bin/mmsnsobjectop";
    parambcz.hlW = 218;
    parambcz.hlZ = 104;
    parambcz.hma = 1000000104;
    this.gMC = parambcz.DA();
    parambcz = (bdq)this.gMC.hlU.hmc;
    Object localObject = ae.bhp().dP(paramLong);
    if (localObject != null) {
      this.pYt = ((m)localObject).quQ;
    }
    paramObject = a(paramLong, paramInt, this.qbt, paramObject);
    localObject = new LinkedList();
    ((LinkedList)localObject).add(paramObject);
    parambcz.uvE = ((LinkedList)localObject);
    parambcz.uvD = ((LinkedList)localObject).size();
    GMTrace.o(8045144834048L, 59941);
  }
  
  public q(long paramLong, int paramInt, Object paramObject)
  {
    this(paramLong, paramInt, null, paramObject);
    GMTrace.i(20067697819648L, 149516);
    GMTrace.o(20067697819648L, 149516);
  }
  
  private static bdn a(long paramLong, int paramInt, bcz parambcz, Object paramObject)
  {
    GMTrace.i(8045413269504L, 59943);
    bdn localbdn = v(paramLong, paramInt);
    Object localObject2 = new StringBuilder("getSnsObjectOp ").append(paramInt).append(" ");
    Object localObject1;
    if (paramObject == null)
    {
      localObject1 = "";
      w.i("MicroMsg.NetSceneSnsObjectOp", (String)localObject1);
      localObject2 = "";
      if ((paramInt != 8) && (paramInt != 10) && (paramInt != 7) && (paramInt != 8) && (paramInt != 6)) {
        break label1056;
      }
      localObject1 = ae.bhr().dI(paramLong);
      if (localObject1 == null) {
        break label1050;
      }
      localObject1 = ((com.tencent.mm.plugin.sns.storage.e)localObject1).bjN();
      label116:
      if ((localObject1 == null) || (!((m)localObject1).uF(32))) {
        break label1047;
      }
      localObject2 = ((m)localObject1).bjJ();
      if (localObject2 != null) {
        break label218;
      }
      localObject2 = "";
      label147:
      w.i("MicroMsg.NetSceneSnsObjectOp", "aduxinfo " + (String)localObject2);
    }
    for (;;)
    {
      if (paramInt == 6)
      {
        if ((parambcz == null) || ((parambcz.uuE == 0) && (parambcz.uuH == 0L)))
        {
          GMTrace.o(8045413269504L, 59943);
          return localbdn;
          localObject1 = paramObject.toString();
          break;
          label218:
          localObject2 = ((a)localObject2).qhb;
          break label147;
        }
        paramObject = new bcs();
        ((bcs)paramObject).uuA = parambcz.uuH;
        ((bcs)paramObject).uus = com.tencent.mm.platformtools.n.mV(bg.ap((String)localObject2, ""));
      }
      for (;;)
      {
        try
        {
          parambcz = ((bcs)paramObject).toByteArray();
          localbdn.umJ = new axs().bd(parambcz);
          GMTrace.o(8045413269504L, 59943);
          return localbdn;
        }
        catch (Exception parambcz)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambcz, "", new Object[0]);
          continue;
        }
        if (paramInt != 7) {
          break;
        }
        parambcz = new bcl();
        parambcz.uus = com.tencent.mm.platformtools.n.mV(bg.ap((String)localObject2, ""));
        try
        {
          parambcz = parambcz.toByteArray();
          localbdn.umJ = new axs().bd(parambcz);
        }
        catch (Exception parambcz)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambcz, "", new Object[0]);
        }
      }
      if (paramInt == 8) {
        if ((paramObject != null) && ((paramObject instanceof b.b.a)))
        {
          paramInt = 1;
          label400:
          if (paramInt == 0) {
            break label1041;
          }
          parambcz = (b.b.a)paramObject;
          localObject2 = bg.ap((String)localObject2, "");
        }
      }
      label533:
      label642:
      label1041:
      for (parambcz = (String)localObject2 + new StringBuilder("&").append(parambcz.pYe).append("|").append(parambcz.qmw).toString();; parambcz = (bcz)localObject2)
      {
        localObject2 = new bco();
        ((bco)localObject2).uus = com.tencent.mm.platformtools.n.mV(bg.ap(parambcz, ""));
        ((bco)localObject2).twh = ((m)localObject1).bkt();
        parambcz = ((m)localObject1).bjM();
        localObject1 = ae.bhp().Hz(parambcz);
        if (localObject1 != null)
        {
          parambcz = com.tencent.mm.plugin.sns.a.b.f.a(((m)localObject1).bjL());
          ((bco)localObject2).uuu = com.tencent.mm.platformtools.n.mV(bg.ap(parambcz, ""));
          if ((paramInt == 0) || (((b.b.a)paramObject).qmv != b.b.a.qmr)) {
            break label642;
          }
          ((bco)localObject2).uuv = b.b.a.qmr;
        }
        for (;;)
        {
          try
          {
            parambcz = ((bco)localObject2).toByteArray();
            localbdn.umJ = new axs().bd(parambcz);
          }
          catch (Exception parambcz)
          {
            w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambcz, "", new Object[0]);
          }
          break;
          paramInt = 0;
          break label400;
          w.v("SnsAdExtUtil", "getSnsStatExtBySnsId snsInfo null, snsId %s", new Object[] { parambcz });
          parambcz = "";
          break label533;
          ae.bhr().delete(paramLong);
          ae.bht().dK(paramLong);
          if (paramInt != 0) {
            ((bco)localObject2).uuv = ((b.b.a)paramObject).qmv;
          }
        }
        if (paramInt == 4)
        {
          if ((parambcz == null) || ((parambcz.uuE == 0) && (parambcz.uuH == 0L)))
          {
            GMTrace.o(8045413269504L, 59943);
            return localbdn;
          }
          paramObject = new bdo();
          ((bdo)paramObject).uuE = parambcz.uuE;
          try
          {
            parambcz = ((bdo)paramObject).toByteArray();
            localbdn.umJ = new axs().bd(parambcz);
          }
          catch (Exception parambcz)
          {
            w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambcz, "", new Object[0]);
          }
          break;
        }
        if (paramInt == 10)
        {
          parambcz = new bdx();
          if ((paramObject instanceof com.tencent.mm.bl.b))
          {
            paramObject = (com.tencent.mm.bl.b)paramObject;
            parambcz.uvW = com.tencent.mm.platformtools.n.H(((com.tencent.mm.bl.b)paramObject).toK);
            w.i("MicroMsg.NetSceneSnsObjectOp", "NetSceneSnsObjectOpticket " + ((com.tencent.mm.bl.b)paramObject).toK.length);
          }
          for (;;)
          {
            try
            {
              parambcz = parambcz.toByteArray();
              localbdn.umJ = new axs().bd(parambcz);
              w.i("MicroMsg.NetSceneSnsObjectOp", "opFree " + parambcz.length);
            }
            catch (Exception parambcz)
            {
              w.e("MicroMsg.NetSceneSnsObjectOp", "error ticket " + parambcz.getMessage());
              w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", parambcz, "", new Object[0]);
            }
            break;
            w.e("MicroMsg.NetSceneSnsObjectOp", "error ticket");
          }
        }
        if (paramInt != 12) {
          break;
        }
        if ((paramObject instanceof bdj))
        {
          parambcz = (bdj)paramObject;
          try
          {
            localbdn.umJ = com.tencent.mm.platformtools.n.H(parambcz.toByteArray());
            w.i("MicroMsg.NetSceneSnsObjectOp", "snsMetionBlockOp, switch:%d " + parambcz.uvd);
          }
          catch (Exception parambcz)
          {
            w.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp " + parambcz.getMessage());
          }
          break;
        }
        w.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp");
        break;
      }
      label1047:
      continue;
      label1050:
      localObject1 = null;
      break label116;
      label1056:
      localObject1 = null;
    }
  }
  
  private static bdn v(long paramLong, int paramInt)
  {
    GMTrace.i(8045547487232L, 59944);
    bdn localbdn = new bdn();
    localbdn.umJ = new axs();
    localbdn.tDg = paramLong;
    localbdn.mEi = paramInt;
    GMTrace.o(8045547487232L, 59944);
    return localbdn;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8045681704960L, 59945);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8045681704960L, 59945);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8045950140416L, 59947);
    w.i("MicroMsg.NetSceneSnsObjectOp", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (this.type == 1)) {
        switch (this.type)
        {
        }
      }
      for (;;)
      {
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8045950140416L, 59947);
        return;
        ae.bho().dC(this.qbs);
        continue;
        ae.bho().dE(this.qbs);
      }
    }
    switch (this.type)
    {
    case 10: 
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 5: 
    case 4: 
      do
      {
        for (;;)
        {
          ae.bho().bgQ();
          this.gMF.a(paramInt2, paramInt3, paramString, this);
          GMTrace.o(8045950140416L, 59947);
          return;
          ae.bho().dC(this.qbs);
          ae.bhp().delete(this.qbs);
          continue;
          paramp = ae.bhp().dP(this.qbs);
          if (paramp != null)
          {
            paramp.field_pravited = 1;
            paramp.bka();
            ae.bhp().b(this.qbs, paramp);
            continue;
            paramp = ae.bhp().dP(this.qbs);
            if (paramp != null)
            {
              paramp.field_pravited = 0;
              paramp.field_localPrivate = 0;
              paramp.bkd();
              ae.bhp().b(this.qbs, paramp);
              continue;
              ae.bho().dE(this.qbs);
            }
          }
        }
        paramArrayOfByte = ae.bhp().dP(this.qbs);
      } while (paramArrayOfByte == null);
    }
    for (;;)
    {
      bdk localbdk;
      Iterator localIterator;
      try
      {
        localbdk = (bdk)new bdk().aC(paramArrayOfByte.field_attrBuf);
        localIterator = localbdk.uvl.iterator();
        if (!localIterator.hasNext()) {
          break label1309;
        }
        paramp = (bcz)localIterator.next();
        if ((this.qbt == null) || (paramp.uuE != this.qbt.uuE)) {
          continue;
        }
        if (paramp != null) {
          localbdk.uvl.remove(paramp);
        }
        paramArrayOfByte.aE(localbdk.toByteArray());
        ae.bhp().z(paramArrayOfByte);
        ae.bht().e(paramArrayOfByte.field_snsId, this.qbt.uuE, this.qbt.jXP);
      }
      catch (Exception paramp)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramp, "", new Object[0]);
      }
      break;
      paramArrayOfByte = ae.bhr().dI(this.qbs);
      if (paramArrayOfByte == null) {
        break;
      }
      for (;;)
      {
        try
        {
          localbdk = (bdk)new bdk().aC(paramArrayOfByte.field_attrBuf);
          localIterator = localbdk.uvl.iterator();
          if (!localIterator.hasNext()) {
            break label1303;
          }
          paramp = (bcz)localIterator.next();
          if ((this.qbt == null) || (paramp.uuH != this.qbt.uuH)) {
            continue;
          }
          if (paramp != null) {
            localbdk.uvl.remove(paramp);
          }
          paramArrayOfByte.aE(localbdk.toByteArray());
          ae.bhr().a(paramArrayOfByte);
          ae.bht().e(paramArrayOfByte.field_snsId, this.qbt.uuH, this.qbt.jXP);
        }
        catch (Exception paramp)
        {
          w.printErrStackTrace("MicroMsg.NetSceneSnsObjectOp", paramp, "", new Object[0]);
        }
        break;
        ae.bho().dE(this.qbs);
        break;
        if ((this.qbu != null) && ((this.qbu instanceof b.b.a)) && (((b.b.a)this.qbu).qmv == b.b.a.qmr)) {
          break;
        }
        ae.bhr().delete(this.qbs);
        ae.bht().dK(this.qbs);
        break;
        paramp = ae.bhp().dP(this.qbs);
        if (paramp == null) {
          break;
        }
        paramp.uG(2);
        ae.bhp().b(this.qbs, paramp);
        break;
        w.i("MicroMsg.NetSceneSnsObjectOp", "scene end switch " + this.qbv);
        label909:
        int i;
        int j;
        if (this.qbv == 0)
        {
          h.xA();
          h.xz().xi().a(w.a.uXM, Boolean.valueOf(true));
          h.xA();
          paramInt1 = ((Integer)h.xz().xi().get(w.a.uXO, Integer.valueOf(0))).intValue();
          h.xA();
          h.xz().xi().a(w.a.uXO, Integer.valueOf(paramInt1 + 1));
          h.xA();
          i = ((Integer)h.xz().xi().get(w.a.uXP, Integer.valueOf(0))).intValue();
          if (this.qbv != 0) {
            break label1124;
          }
          i += 1;
          j = i * 2 + 198;
          paramInt1 = j;
          if (j >= 216) {
            paramInt1 = 216;
          }
          if (paramInt1 >= 200) {
            com.tencent.mm.plugin.sns.lucky.a.b.nK(paramInt1);
          }
          w.i("MicroMsg.NetSceneSnsObjectOp", "opcount open " + paramInt1 + " " + i);
          paramInt1 = i;
        }
        for (;;)
        {
          h.xA();
          h.xz().xi().a(w.a.uXP, Integer.valueOf(paramInt1));
          break;
          if (this.qbv != 1) {
            break label909;
          }
          h.xA();
          h.xz().xi().a(w.a.uXM, Boolean.valueOf(false));
          break label909;
          label1124:
          paramInt1 = i;
          if (this.qbv == 1)
          {
            i += 1;
            j = i * 2 + 198 + 1;
            paramInt1 = j;
            if (j >= 217) {
              paramInt1 = 217;
            }
            if (paramInt1 >= 201) {
              com.tencent.mm.plugin.sns.lucky.a.b.nK(paramInt1);
            }
            w.i("MicroMsg.NetSceneSnsObjectOp", "opcount close " + paramInt1 + " " + i);
            paramInt1 = i;
          }
        }
        if ((this.qbu == null) || (!(this.qbu instanceof bdj))) {
          break;
        }
        if (((bdj)this.qbu).uvd == 1) {}
        for (boolean bool = true;; bool = false)
        {
          ae.bht().l(this.qbs, bool);
          w.i("MicroMsg.NetSceneSnsObjectOp", "remind  update [snsId:%d] ->isSilence: %b", new Object[] { Long.valueOf(this.qbs), Boolean.valueOf(bool) });
          break;
        }
        label1303:
        paramp = null;
      }
      label1309:
      paramp = null;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(8045815922688L, 59946);
    GMTrace.o(8045815922688L, 59946);
    return 218;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */