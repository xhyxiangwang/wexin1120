package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bdd;
import com.tencent.mm.protocal.c.bde;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.io.OutputStream;

public final class o
  extends k
  implements j
{
  private String filename;
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  private OutputStream hlt;
  String mediaId;
  private String qbm;
  private int qbn;
  int qbo;
  private boolean qbp;
  private String qbq;
  private amn qbr;
  
  public o(amn paramamn, String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2, String paramString3)
  {
    GMTrace.i(8039105036288L, 59896);
    this.mediaId = "";
    this.hlt = null;
    this.qbn = -1;
    this.qbo = -1;
    this.qbp = true;
    this.qbq = null;
    this.mediaId = paramString1;
    this.qbr = paramamn;
    this.qbp = paramBoolean;
    this.qbn = paramInt1;
    this.qbo = paramInt2;
    this.qbq = paramString3;
    this.qbm = am.dt(ae.getAccSnsPath(), paramString1);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bdd();
    ((b.a)localObject).hlY = new bde();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsdownload";
    ((b.a)localObject).hlW = 208;
    ((b.a)localObject).hlZ = 96;
    ((b.a)localObject).hma = 1000000096;
    this.gMC = ((b.a)localObject).DA();
    bdd localbdd = (bdd)this.gMC.hlU.hmc;
    q localq = ae.bhe().HP(paramString1);
    localObject = localq;
    if (localq == null) {
      localObject = new q();
    }
    ((q)localObject).qvz = paramString1;
    ((q)localObject).offset = 0;
    ae.bhe().a(paramString1, (q)localObject);
    if (paramBoolean) {}
    for (this.filename = i.n(paramamn);; this.filename = i.m(paramamn))
    {
      FileOp.kL(this.qbm);
      FileOp.deleteFile(am.dt(ae.getAccSnsPath(), paramString1) + this.filename);
      localbdd.uva = paramString2;
      localbdd.uvb = 0;
      localbdd.twV = 0;
      localbdd.twU = 0;
      localbdd.jXP = this.qbn;
      w.d("MicroMsg.NetSceneSnsDownload", "requestKey " + paramString3);
      GMTrace.o(8039105036288L, 59896);
      return;
    }
  }
  
  private void Dr()
  {
    GMTrace.i(8040178778112L, 59904);
    try
    {
      if (this.hlt != null)
      {
        this.hlt.flush();
        this.hlt.close();
        this.hlt = null;
      }
      GMTrace.o(8040178778112L, 59904);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.NetSceneSnsDownload", localIOException, "", new Object[0]);
      GMTrace.o(8040178778112L, 59904);
    }
  }
  
  private void onError()
  {
    GMTrace.i(8039507689472L, 59899);
    ae.bhk().Gq(this.qbq);
    GMTrace.o(8039507689472L, 59899);
  }
  
  private int z(byte[] paramArrayOfByte)
  {
    GMTrace.i(8040044560384L, 59903);
    if (!i.Gh(ae.zp()))
    {
      GMTrace.o(8040044560384L, 59903);
      return 0;
    }
    try
    {
      if (this.hlt == null)
      {
        FileOp.kL(this.qbm);
        this.hlt = FileOp.hk(this.qbm + this.filename);
      }
      w.d("MicroMsg.NetSceneSnsDownload", "appendBuf " + paramArrayOfByte.length);
      this.hlt.write(paramArrayOfByte);
      Dr();
      int i = paramArrayOfByte.length;
      GMTrace.o(8040044560384L, 59903);
      return i;
    }
    catch (IOException paramArrayOfByte)
    {
      w.printErrStackTrace("MicroMsg.NetSceneSnsDownload", paramArrayOfByte, "appendBuf failed: " + this.filename, new Object[0]);
      Dr();
      GMTrace.o(8040044560384L, 59903);
      return -1;
    }
    finally
    {
      Dr();
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8039239254016L, 59897);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8039239254016L, 59897);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(8039776124928L, 59901);
    int i = k.b.hmE;
    GMTrace.o(8039776124928L, 59901);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8039373471744L, 59898);
    w.d("MicroMsg.NetSceneSnsDownload", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (b.c)paramp.Ba();
    paramp = (bde)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if (paramArrayOfByte.tpN != 0)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      ae.bhk().Gq(this.qbq);
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    paramArrayOfByte = ae.bhe().HP(this.mediaId);
    if (paramp.twU <= 0)
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 1");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    if (paramp.tyt == null)
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 2");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    if ((paramp.twV < 0) || (paramp.twV + paramp.tyt.ush.toK.length > paramp.twU))
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 3");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    if (paramp.twV != paramArrayOfByte.offset)
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 4");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    paramInt1 = z(paramp.tyt.ush.toByteArray());
    if (paramInt1 < 0)
    {
      w.e("MicroMsg.NetSceneSnsDownload", "error 5");
      onError();
      GMTrace.o(8039373471744L, 59898);
      return;
    }
    paramArrayOfByte.offset += paramInt1;
    paramArrayOfByte.qvv = paramp.twU;
    w.d("MicroMsg.NetSceneSnsDownload", "byteLen " + paramInt1 + "  totalLen " + paramp.twU);
    ae.bhe().a(this.mediaId, paramArrayOfByte);
    if ((paramArrayOfByte.offset == paramArrayOfByte.qvv) && (paramArrayOfByte.qvv != 0))
    {
      paramInt1 = 1;
      if (paramInt1 == 0) {
        break label689;
      }
      w.d("MicroMsg.NetSceneSnsDownload", "downLoad ok");
      if (this.qbo != 1) {
        break label576;
      }
      paramp = i.e(this.qbr);
      label463:
      paramArrayOfByte = am.dt(ae.getAccSnsPath(), this.mediaId);
      FileOp.deleteFile(paramArrayOfByte + paramp);
      FileOp.g(paramArrayOfByte, this.filename, paramp);
      if (!this.qbp) {
        break label588;
      }
      r.b(paramArrayOfByte, paramp, i.f(this.qbr), ae.bhw());
    }
    for (;;)
    {
      ae.bhk().Gq(this.qbq);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8039373471744L, 59898);
      return;
      paramInt1 = 0;
      break;
      label576:
      paramp = i.l(this.qbr);
      break label463;
      label588:
      String str = i.e(this.qbr);
      if (!FileOp.aZ(paramArrayOfByte + str)) {
        r.a(paramArrayOfByte, paramp, str, ae.bhx());
      }
      str = i.f(this.qbr);
      if (!FileOp.aZ(paramArrayOfByte + str)) {
        r.b(paramArrayOfByte, paramp, str, ae.bhw());
      }
    }
    label689:
    a(this.hmo, this.gMF);
    GMTrace.o(8039373471744L, 59898);
  }
  
  public final int getType()
  {
    GMTrace.i(8039641907200L, 59900);
    GMTrace.o(8039641907200L, 59900);
    return 208;
  }
  
  protected final int vG()
  {
    GMTrace.i(8039910342656L, 59902);
    GMTrace.o(8039910342656L, 59902);
    return 100;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */