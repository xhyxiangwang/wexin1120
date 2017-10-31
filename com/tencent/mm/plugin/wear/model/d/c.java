package com.tencent.mm.plugin.wear.model.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.a;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bju;
import com.tencent.mm.protocal.c.bjv;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import java.util.UUID;

public final class c
  extends k
  implements j
{
  private String clientId;
  public String fAJ;
  public String filename;
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  public boolean hVr;
  private boolean hWW;
  private int hXa;
  aj hkB;
  public int pcX;
  public int sie;
  public String sif;
  public boolean sig;
  
  public c(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(9180761030656L, 68402);
    this.filename = null;
    this.hXa = 0;
    this.hVr = false;
    this.sie = 0;
    this.hWW = false;
    this.hkB = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(9181968990208L, 68411);
        long l1 = com.tencent.mm.a.e.aY(c.this.filename);
        long l2 = l1 - c.this.sie;
        w.d("MicroMsg.Wear.NetSceneVoiceToText", "onTimerExpired: filename=%s | fileLength=%d | readOffset=%d | isRecordFinished=%b | canReadLength=%d", new Object[] { c.this.filename, Long.valueOf(l1), Integer.valueOf(c.this.sie), Boolean.valueOf(c.this.hVr), Long.valueOf(l2) });
        if ((l2 < 3300L) && (!c.this.hVr))
        {
          GMTrace.o(9181968990208L, 68411);
          return true;
        }
        if ((c.this.hVr) && (l2 <= 0L))
        {
          GMTrace.o(9181968990208L, 68411);
          return false;
        }
        if (c.this.a(c.this.hmo, c.this.gMF) == -1) {
          c.this.gMF.a(3, -1, "doScene failed", c.this);
        }
        GMTrace.o(9181968990208L, 68411);
        return false;
      }
    }, true);
    this.pcX = paramInt;
    this.fAJ = paramString2;
    this.filename = paramString1;
    this.hXa = 0;
    this.clientId = UUID.randomUUID().toString();
    GMTrace.o(9180761030656L, 68402);
  }
  
  private static String d(axs paramaxs)
  {
    GMTrace.i(9181566337024L, 68408);
    if ((paramaxs != null) && (paramaxs.ush != null))
    {
      paramaxs = paramaxs.ush.bKX();
      GMTrace.o(9181566337024L, 68408);
      return paramaxs;
    }
    GMTrace.o(9181566337024L, 68408);
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9180895248384L, 68403);
    this.gMF = parame1;
    int k = com.tencent.mm.a.e.aY(this.filename);
    if (k <= 0)
    {
      w.e("MicroMsg.Wear.NetSceneVoiceToText", "doScene file length is zero: %s", new Object[] { this.filename });
      GMTrace.o(9180895248384L, 68403);
      return -1;
    }
    int j = k - this.sie;
    int i;
    if (j > 3960) {
      i = 3960;
    }
    for (;;)
    {
      w.i("MicroMsg.Wear.NetSceneVoiceToText", "fileLength: %d | readOffset: %d | isRecordFinish=%b | endFlag=%b | filename=%s", new Object[] { Integer.valueOf(k), Integer.valueOf(this.sie), Boolean.valueOf(this.hVr), Boolean.valueOf(this.hWW), this.filename });
      parame1 = com.tencent.mm.a.e.c(this.filename, this.sie, i);
      if (parame1 != null) {
        break label289;
      }
      if (!this.hWW) {
        break;
      }
      GMTrace.o(9180895248384L, 68403);
      return 0;
      if ((j < 3300) && (!this.hVr))
      {
        w.e("MicroMsg.Wear.NetSceneVoiceToText", "try to send a buf less than MIN_SEND_BYTE_PER_PACK: canReadLen=%d | isRecordFinished=%b", new Object[] { Integer.valueOf(j), Boolean.valueOf(this.hVr) });
        GMTrace.o(9180895248384L, 68403);
        return -1;
      }
      i = j;
      if (this.hVr)
      {
        this.hWW = true;
        i = j;
      }
    }
    w.e("MicroMsg.Wear.NetSceneVoiceToText", "Can not read file: canReadLen=%d | isRecordFinish=%b | endFlag=%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.hVr), Boolean.valueOf(this.hWW) });
    GMTrace.o(9180895248384L, 68403);
    return -1;
    label289:
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bju();
    ((b.a)localObject).hlY = new bjv();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadinputvoice";
    ((b.a)localObject).hlW = 349;
    ((b.a)localObject).hlZ = 158;
    ((b.a)localObject).hma = 1000000158;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bju)this.gMC.hlU.hmc;
    ap.AS();
    ((bju)localObject).jWW = ((String)com.tencent.mm.x.c.xi().get(2, ""));
    ((bju)localObject).tJz = new axs().bd(parame1);
    ((bju)localObject).tBI = this.sie;
    ((bju)localObject).uzV = this.clientId;
    if (this.hWW)
    {
      i = 1;
      ((bju)localObject).tyZ = i;
      ((bju)localObject).uzW = 0;
      ((bju)localObject).txa = 0;
      ((bju)localObject).uzX = this.hXa;
      ((bju)localObject).twX = 0;
      i = a(parame, this.gMC, this);
      j = ((bju)localObject).tBI;
      this.sie = (((bju)localObject).tJz.usf + j);
      if (!this.hVr) {
        break label579;
      }
    }
    label579:
    for (long l = 0L;; l = 500L)
    {
      w.i("MicroMsg.Wear.NetSceneVoiceToText", "doScene filename=%s | delay=%d | ret=%d", new Object[] { this.filename, Long.valueOf(l), Integer.valueOf(i) });
      this.hkB.w(l, l);
      GMTrace.o(9180895248384L, 68403);
      return i;
      i = 0;
      break;
    }
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(9181029466112L, 68404);
    int i = k.b.hmE;
    GMTrace.o(9181029466112L, 68404);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9181432119296L, 68407);
    w.i("MicroMsg.Wear.NetSceneVoiceToText", "onGYNetEnd errorType=%d | errorCode=%d |filename=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.filename });
    paramp = (bjv)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9181432119296L, 68407);
      return;
    }
    w.i("MicroMsg.Wear.NetSceneVoiceToText", "resp EndFlag=%d | Text=%s", new Object[] { Integer.valueOf(paramp.tyZ), d(paramp.uzY) });
    if (paramp.tyZ == 1)
    {
      this.sig = true;
      paramp = d(paramp.uzY);
      if (paramp != null) {
        this.sif = paramp;
      }
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9181432119296L, 68407);
      return;
    }
    GMTrace.o(9181432119296L, 68407);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(9181297901568L, 68406);
    this.gMF.a(3, 0, "securityCheckError", this);
    GMTrace.o(9181297901568L, 68406);
  }
  
  public final int getType()
  {
    GMTrace.i(9181700554752L, 68409);
    GMTrace.o(9181700554752L, 68409);
    return 349;
  }
  
  protected final int vG()
  {
    GMTrace.i(9181163683840L, 68405);
    GMTrace.o(9181163683840L, 68405);
    return 20;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */