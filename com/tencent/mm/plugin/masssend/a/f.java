package com.tencent.mm.plugin.masssend.a;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.a;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.b;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.ami;
import com.tencent.mm.protocal.c.amj;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import junit.framework.Assert;

public final class f
  extends k
  implements j
{
  int fvP;
  public com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  g.a hEn;
  int hUB;
  boolean hng;
  private int hzi;
  private a nGx;
  
  public f(a parama, boolean paramBoolean)
  {
    this(parama, paramBoolean, 0);
    GMTrace.i(11211743690752L, 83534);
    GMTrace.o(11211743690752L, 83534);
  }
  
  public f(a parama, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(11211877908480L, 83535);
    this.nGx = null;
    this.hEn = null;
    this.fvP = 0;
    this.hUB = 0;
    this.hng = false;
    this.nGx = parama;
    this.hzi = paramInt;
    parama.hUw = bg.Pp();
    if (parama.msgType == 43)
    {
      parama.status = 104;
      com.tencent.mm.modelvideo.o.Na();
      parama.nGs = s.lZ(s.lY(parama.aMr()));
      com.tencent.mm.modelvideo.o.Na();
      parama.fjT = s.lZ(s.lX(parama.aMr()));
      this.hUB = 2500;
      if (parama.nGt == 2) {
        this.hUB = 2500;
      }
    }
    Object localObject;
    for (;;)
    {
      localObject = new b.a();
      ((b.a)localObject).hlX = new ami();
      ((b.a)localObject).hlY = new amj();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/masssend";
      ((b.a)localObject).hlW = 193;
      ((b.a)localObject).hlZ = 84;
      ((b.a)localObject).hma = 1000000084;
      this.gMC = ((b.a)localObject).DA();
      localObject = (ami)this.gMC.hlU.hmc;
      ((ami)localObject).uhe = com.tencent.mm.a.g.n(parama.aMt().getBytes());
      ((ami)localObject).uhp = parama.nGp;
      ((ami)localObject).uhd = parama.aMt();
      parama.hNT = bg.Pp();
      ((ami)localObject).uhf = parama.aMq();
      ((ami)localObject).mDF = parama.msgType;
      ((ami)localObject).uhg = parama.nGq;
      if (!paramBoolean) {
        break label553;
      }
      i = j;
      label304:
      ((ami)localObject).uhq = i;
      ((ami)localObject).tXe = paramInt;
      this.hEn = new g.a();
      GMTrace.o(11211877908480L, 83535);
      return;
      if (parama.msgType != 34) {
        break;
      }
      this.hUB = 40;
      parama.status = 104;
      parama.fjT = com.tencent.mm.modelvoice.o.lZ(parama.aMr());
      parama.nGs = 0;
    }
    if (parama.msgType == 3)
    {
      this.hUB = 40;
      if (paramInt != 1) {
        break label559;
      }
      this.hUB = 1250;
    }
    label553:
    label559:
    for (int i = 1;; i = 0)
    {
      parama.nGu = i;
      parama.status = 104;
      parama.nGs = 0;
      localObject = new StringBuilder();
      ap.AS();
      parama.fjT = com.tencent.mm.a.e.aY(c.yV() + parama.aMr());
      break;
      if (parama.msgType == 1)
      {
        this.hUB = 1;
        parama.status = 104;
        parama.fjT = parama.aMr().getBytes().length;
        parama.nGs = 0;
        break;
      }
      w.d("MicroMsg.NetSceneMasSend", "error msgtype:" + parama.msgType);
      Assert.assertTrue("error msgtype:" + parama.msgType, false);
      break;
      i = 0;
      break label304;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    int j = 0;
    int i = 0;
    GMTrace.i(11212146343936L, 83537);
    this.gMF = parame1;
    if (this.hng)
    {
      w.d("MicroMsg.NetSceneMasSend", "isCancel");
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    this.hUB -= 1;
    if (this.hUB < 0)
    {
      w.d("MicroMsg.NetSceneMasSend", "MAX_SEND_TIMES");
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if (this.nGx == null)
    {
      w.d("MicroMsg.NetSceneMasSend", "MasSendInfo is null");
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if (bg.mZ(this.nGx.aMt()))
    {
      w.d("MicroMsg.NetSceneMasSend", "MasSendInfo.toList is null");
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if (this.nGx.nGp == 0)
    {
      w.d("MicroMsg.NetSceneMasSend", "getTolistCount is 0");
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if (this.nGx.fjT <= 0)
    {
      w.d("MicroMsg.NetSceneMasSend", "getDataLen is 0");
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if ((this.nGx.status == 103) && (this.nGx.nGs <= 0))
    {
      w.d("MicroMsg.NetSceneMasSend", "getThumbTotalLen is 0");
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    if ((this.nGx.status != 103) && (this.nGx.status != 104))
    {
      w.d("MicroMsg.NetSceneMasSend", "msg type :" + this.nGx.msgType);
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      GMTrace.o(11212146343936L, 83537);
      return -1;
    }
    parame1 = (ami)this.gMC.hlU.hmc;
    Object localObject1;
    Object localObject2;
    if (this.nGx.msgType == 43)
    {
      localObject1 = this.nGx.aMr();
      if (bg.mZ((String)localObject1))
      {
        w.d("MicroMsg.NetSceneMasSend", "MasSendInfo.fileName is null");
        this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
        i = -1;
      }
      for (;;)
      {
        if (i == 0) {
          break label2284;
        }
        GMTrace.o(11212146343936L, 83537);
        return i;
        parame1.uhh = new axs();
        parame1.uhi = 0;
        parame1.uhm = new axs();
        parame1.uhl = 0;
        parame1.uhn = 2;
        parame1.uhg = this.nGx.nGq;
        if (this.nGx.nGt > 0) {}
        for (i = 2;; i = 0)
        {
          parame1.uho = i;
          parame1.uhk = this.nGx.nGs;
          parame1.uhj = this.nGx.fjT;
          if (this.nGx.status != 103) {
            break label909;
          }
          com.tencent.mm.modelvideo.o.Na();
          localObject2 = s.h(s.lY((String)localObject1), this.nGx.hUu, 8000);
          if ((((s.b)localObject2).ret >= 0) && (((s.b)localObject2).frx != 0)) {
            break label677;
          }
          w.e("MicroMsg.NetSceneMasSend", "doScene READ THUMB[" + (String)localObject1 + "]  Error ");
          this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
          i = -1;
          break;
        }
        label677:
        w.d("MicroMsg.NetSceneMasSend", "doScene READ THUMB[" + (String)localObject1 + "] read ret:" + ((s.b)localObject2).ret + " readlen:" + ((s.b)localObject2).frx + " newOff:" + ((s.b)localObject2).hUZ + " netOff:" + this.nGx.hUu);
        if (((s.b)localObject2).hUZ >= this.nGx.hUu) {
          break;
        }
        w.e("MicroMsg.NetSceneMasSend", "Err doScene READ THUMB[" + (String)localObject1 + "] newOff:" + ((s.b)localObject2).hUZ + " OldtOff:" + this.nGx.hUu);
        this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
        i = -1;
      }
      localObject1 = new byte[((s.b)localObject2).frx];
      System.arraycopy(((s.b)localObject2).buf, 0, localObject1, 0, ((s.b)localObject2).frx);
      parame1.uhl = this.nGx.hUu;
      localObject2 = new axs();
      ((axs)localObject2).bd((byte[])localObject1);
      parame1.uhm = ((axs)localObject2);
      for (;;)
      {
        i = 0;
        break;
        label909:
        com.tencent.mm.modelvideo.o.Na();
        localObject2 = s.h(s.lX((String)localObject1), this.nGx.nGr, 8000);
        if ((((s.b)localObject2).ret < 0) || (((s.b)localObject2).frx == 0))
        {
          w.e("MicroMsg.NetSceneMasSend", "doScene READ VIDEO[" + (String)localObject1 + "]  Error ");
          this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
          i = -1;
          break;
        }
        w.d("MicroMsg.NetSceneMasSend", "doScene READ VIDEO[" + (String)localObject1 + "] read ret:" + ((s.b)localObject2).ret + " readlen:" + ((s.b)localObject2).frx + " newOff:" + ((s.b)localObject2).hUZ + " netOff:" + this.nGx.nGr);
        if (((s.b)localObject2).hUZ < this.nGx.nGr)
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ VIDEO[" + (String)localObject1 + "] newOff:" + ((s.b)localObject2).hUZ + " OldtOff:" + this.nGx.nGr);
          this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
          i = -1;
          break;
        }
        if (((s.b)localObject2).hUZ >= 20971520)
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ VIDEO[" + (String)localObject1 + "] maxsize:20971520");
          this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
          i = -1;
          break;
        }
        localObject1 = new byte[((s.b)localObject2).frx];
        System.arraycopy(((s.b)localObject2).buf, 0, localObject1, 0, ((s.b)localObject2).frx);
        parame1.uhi = this.nGx.nGr;
        parame1.uhl = this.nGx.hUu;
        localObject2 = new axs();
        ((axs)localObject2).bd((byte[])localObject1);
        parame1.uhh = ((axs)localObject2);
      }
    }
    if (this.nGx.msgType == 34)
    {
      parame1.uhn = 0;
      parame1.uho = 0;
      parame1.uhh = new axs().bd(new byte[0]);
      parame1.uhi = 0;
      parame1.uhm = new axs().bd(new byte[0]);
      parame1.uhl = 0;
      parame1.uhk = 0;
      parame1.uhj = this.nGx.fjT;
      localObject1 = q.mx(this.nGx.aMr());
      if (localObject1 == null)
      {
        this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
        w.d("MicroMsg.NetSceneMasSend", "fileop is null");
        i = -1;
      }
      while (i != 0)
      {
        GMTrace.o(11212146343936L, 83537);
        return -1;
        localObject2 = ((com.tencent.mm.modelvoice.b)localObject1).bc(this.nGx.nGr, 8000);
        if (((com.tencent.mm.modelvoice.g)localObject2).ret < 0)
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ file[" + this.nGx.aMr() + "] read ret:" + ((com.tencent.mm.modelvoice.g)localObject2).ret + " readlen:" + ((com.tencent.mm.modelvoice.g)localObject2).frx + " newOff:" + ((com.tencent.mm.modelvoice.g)localObject2).hUZ + " netOff:" + this.nGx.nGr);
          this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
          i = -1;
        }
        else if ((((com.tencent.mm.modelvoice.g)localObject2).hUZ < this.nGx.nGr) || (((com.tencent.mm.modelvoice.g)localObject2).hUZ >= 469000))
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ offseterror file[" + this.nGx.aMr() + "] read ret:" + ((com.tencent.mm.modelvoice.g)localObject2).ret + " readlen:" + ((com.tencent.mm.modelvoice.g)localObject2).frx + " newOff:" + ((com.tencent.mm.modelvoice.g)localObject2).hUZ + " netOff:" + this.nGx.nGr);
          this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
          i = -1;
        }
        else if (this.nGx.fjT <= 0)
        {
          w.e("MicroMsg.NetSceneMasSend", "Err doScene READ datalen file[" + this.nGx.aMr() + "] read totalLen:" + this.nGx.fjT);
          this.fvP = (com.tencent.mm.compatible.util.g.tF() + 10000);
          i = -1;
        }
        else
        {
          byte[] arrayOfByte = new byte[((com.tencent.mm.modelvoice.g)localObject2).frx];
          System.arraycopy(((com.tencent.mm.modelvoice.g)localObject2).buf, 0, arrayOfByte, 0, ((com.tencent.mm.modelvoice.g)localObject2).frx);
          parame1.uhh = new axs().bd(arrayOfByte);
          parame1.uhg = this.nGx.nGq;
          parame1.uhi = this.nGx.nGr;
          parame1.uhr = ((com.tencent.mm.modelvoice.b)localObject1).getFormat();
        }
      }
    }
    if (this.nGx.msgType == 3)
    {
      if (bg.mZ(this.nGx.aMr()))
      {
        w.d("MicroMsg.NetSceneMasSend", "getFilename is null");
        this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
        i = -1;
      }
      while (i != 0)
      {
        GMTrace.o(11212146343936L, 83537);
        return -1;
        parame1.uhn = 0;
        parame1.uho = 0;
        parame1.uhh = new axs().bd(new byte[0]);
        parame1.uhi = 0;
        parame1.uhm = new axs().bd(new byte[0]);
        parame1.uhl = 0;
        parame1.uhk = 0;
        parame1.uhg = 0;
        parame1.uhk = this.nGx.nGs;
        parame1.uhj = this.nGx.fjT;
        parame1.tXe = this.hzi;
        localObject1 = new StringBuilder();
        ap.AS();
        localObject1 = c.yV() + this.nGx.aMr();
        int k = this.nGx.fjT - this.nGx.nGr;
        i = k;
        if (k > 8000) {
          i = 8000;
        }
        localObject1 = com.tencent.mm.a.e.c((String)localObject1, this.nGx.nGr, i);
        if (bg.bp((byte[])localObject1))
        {
          w.e("MicroMsg.NetSceneMasSend", "doScene READ data[" + this.nGx.aMr() + "]  Error ");
          this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
          i = -1;
        }
        else
        {
          parame1.uhi = this.nGx.nGr;
          parame1.uhl = this.nGx.hUu;
          localObject2 = new axs();
          ((axs)localObject2).bd((byte[])localObject1);
          parame1.uhh = ((axs)localObject2);
          i = j;
        }
      }
    }
    if (this.nGx.msgType == 1)
    {
      parame1.uhh = new axs().bd(this.nGx.aMr().getBytes());
      parame1.uhj = this.nGx.fjT;
      parame1.uhg = 0;
      parame1.uhi = 0;
      parame1.uhm = new axs().bd(new byte[0]);
      parame1.uhl = 0;
      parame1.uhk = 0;
      parame1.uhn = 0;
      parame1.uho = 0;
      label2284:
      i = a(parame, this.gMC, this);
      GMTrace.o(11212146343936L, 83537);
      return i;
    }
    w.d("MicroMsg.NetSceneMasSend", "error msgtype:" + this.nGx.msgType);
    this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
    GMTrace.o(11212146343936L, 83537);
    return -1;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(11212280561664L, 83538);
    int i = k.b.hmE;
    GMTrace.o(11212280561664L, 83538);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(11212683214848L, 83541);
    w.d("MicroMsg.NetSceneMasSend", "onGYNetEnd  errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd FAILED errtype:" + paramInt2 + " errCode:" + paramInt3);
      this.fvP = (0 - com.tencent.mm.compatible.util.g.tF() - 10000);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    if (this.nGx == null)
    {
      w.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd Get INFO FAILED :");
      this.fvP = (0 - com.tencent.mm.compatible.util.g.tF() - 10000);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    if ((this.nGx.status != 104) && (this.nGx.status != 103))
    {
      w.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd STATUS ERR: status:" + this.nGx.status);
      this.fvP = (0 - com.tencent.mm.compatible.util.g.tF() - 10000);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    paramArrayOfByte = (amj)this.gMC.hlV.hmc;
    paramp = (ami)this.gMC.hlU.hmc;
    if ((paramp.uhk > 0) && (paramp.uhm != null) && (paramp.uhm.ush != null) && (!bg.bp(paramp.uhm.ush.toByteArray())) && (paramp.uhl != paramArrayOfByte.uhl - paramp.uhm.usf))
    {
      w.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Thumb ");
      this.fvP = (0 - com.tencent.mm.compatible.util.g.tF() - 10000);
      this.gMF.a(3, -1, "doScene failed", this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    if ((paramp.uhj > 0) && (paramp.uhh != null) && (paramp.uhh.ush != null) && (!bg.bp(paramp.uhh.ush.toByteArray())) && (paramp.uhi != paramArrayOfByte.uhi - paramp.uhh.usf))
    {
      w.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Data ");
      this.fvP = (0 - com.tencent.mm.compatible.util.g.tF() - 10000);
      this.gMF.a(3, -1, "doScene failed", this);
      GMTrace.o(11212683214848L, 83541);
      return;
    }
    this.nGx.hUx = bg.Po();
    paramInt1 = this.nGx.status;
    if (paramInt1 == 103)
    {
      paramArrayOfByte = this.nGx;
      paramInt1 = paramp.uhl;
      paramArrayOfByte.hUu = (paramp.uhm.usf + paramInt1);
      if (this.nGx.hUu >= this.nGx.nGs) {
        this.nGx.status = 199;
      }
    }
    while (this.nGx.status != 199)
    {
      if (a(this.hmo, this.gMF) != -1) {
        break label1559;
      }
      this.fvP = (0 - (com.tencent.mm.compatible.util.g.tF() + 10000));
      this.gMF.a(3, -1, "doScene failed", this);
      GMTrace.o(11212683214848L, 83541);
      return;
      if (paramInt1 == 104)
      {
        paramArrayOfByte = this.nGx;
        paramInt1 = paramp.uhi;
        paramArrayOfByte.nGr = (paramp.uhh.usf + paramInt1);
        if (this.nGx.nGr >= this.nGx.fjT) {
          if (this.nGx.nGs > 0) {
            this.nGx.status = 103;
          } else {
            this.nGx.status = 199;
          }
        }
      }
      else
      {
        w.e("MicroMsg.NetSceneMasSend", "onGYNetEnd ERROR STATUS:" + paramInt1);
        this.fvP = (0 - com.tencent.mm.compatible.util.g.tF() - 10000);
        this.gMF.a(3, -1, "doScene failed", this);
        GMTrace.o(11212683214848L, 83541);
        return;
      }
    }
    paramArrayOfByte = h.aMy();
    a locala = this.nGx;
    if (locala != null)
    {
      locala.fJg = -1;
      ContentValues localContentValues = new ContentValues();
      if ((locala.fJg & 0x1) != 0) {
        localContentValues.put("clientid", locala.aMq());
      }
      if ((locala.fJg & 0x2) != 0) {
        localContentValues.put("status", Integer.valueOf(locala.status));
      }
      if ((locala.fJg & 0x4) != 0) {
        localContentValues.put("createtime", Long.valueOf(locala.hUw));
      }
      if ((locala.fJg & 0x8) != 0) {
        localContentValues.put("lastmodifytime", Long.valueOf(locala.hUx));
      }
      if ((locala.fJg & 0x10) != 0) {
        localContentValues.put("filename", locala.aMr());
      }
      if ((locala.fJg & 0x20) != 0) {
        localContentValues.put("thumbfilename", locala.aMs());
      }
      if ((locala.fJg & 0x40) != 0) {
        localContentValues.put("tolist", locala.aMt());
      }
      if ((locala.fJg & 0x80) != 0) {
        localContentValues.put("tolistcount", Integer.valueOf(locala.nGp));
      }
      if ((locala.fJg & 0x100) != 0) {
        localContentValues.put("msgtype", Integer.valueOf(locala.msgType));
      }
      if ((locala.fJg & 0x200) != 0) {
        localContentValues.put("mediatime", Integer.valueOf(locala.nGq));
      }
      if ((locala.fJg & 0x400) != 0) {
        localContentValues.put("datanetoffset", Integer.valueOf(locala.nGr));
      }
      if ((locala.fJg & 0x800) != 0) {
        localContentValues.put("datalen", Integer.valueOf(locala.fjT));
      }
      if ((locala.fJg & 0x1000) != 0) {
        localContentValues.put("thumbnetoffset", Integer.valueOf(locala.hUu));
      }
      if ((locala.fJg & 0x2000) != 0) {
        localContentValues.put("thumbtotallen", Integer.valueOf(locala.nGs));
      }
      if ((locala.fJg & 0x4000) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(locala.nGt));
      }
      if ((locala.fJg & 0x8000) != 0) {
        localContentValues.put("reserved2", Integer.valueOf(locala.nGu));
      }
      if ((locala.fJg & 0x10000) != 0)
      {
        if (locala.hhg != null) {
          break label1507;
        }
        paramp = "";
        localContentValues.put("reserved3", paramp);
      }
      if ((locala.fJg & 0x20000) != 0)
      {
        if (locala.hhh != null) {
          break label1517;
        }
        paramp = "";
        label1320:
        localContentValues.put("reserved4", paramp);
      }
      if ((int)paramArrayOfByte.hhi.insert("massendinfo", "clientid", localContentValues) != -1)
      {
        ap.AS();
        if (c.yQ().SV("masssendapp") != null) {
          break label1527;
        }
        paramInt1 = 1;
        label1371:
        paramp = new ae();
        paramp.setUsername("masssendapp");
        paramp.setContent(b.a(locala));
        paramp.w(locala.hUw);
        paramp.dC(0);
        paramp.dz(0);
        if (paramInt1 == 0) {
          break label1532;
        }
        ap.AS();
        c.yQ().d(paramp);
        label1439:
        paramArrayOfByte.doNotify();
      }
    }
    if (this.hEn != null) {}
    for (long l = this.hEn.tI();; l = 0L)
    {
      w.d("MicroMsg.NetSceneMasSend", "!!!FIN: useTime:" + l);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(11212683214848L, 83541);
      return;
      label1507:
      paramp = locala.hhg;
      break;
      label1517:
      paramp = locala.hhh;
      break label1320;
      label1527:
      paramInt1 = 0;
      break label1371;
      label1532:
      ap.AS();
      c.yQ().a(paramp, "masssendapp");
      break label1439;
    }
    label1559:
    GMTrace.o(11212683214848L, 83541);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(11212548997120L, 83540);
    GMTrace.o(11212548997120L, 83540);
  }
  
  public final void cancel()
  {
    GMTrace.i(11212012126208L, 83536);
    this.hng = true;
    GMTrace.o(11212012126208L, 83536);
  }
  
  public final int getType()
  {
    GMTrace.i(11212817432576L, 83542);
    GMTrace.o(11212817432576L, 83542);
    return 193;
  }
  
  protected final int vG()
  {
    GMTrace.i(11212414779392L, 83539);
    GMTrace.o(11212414779392L, 83539);
    return 2500;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */