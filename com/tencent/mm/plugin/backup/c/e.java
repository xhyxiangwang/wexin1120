package com.tencent.mm.plugin.backup.c;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.ef;
import com.tencent.mm.protocal.c.eg;
import com.tencent.mm.protocal.c.nh;
import com.tencent.mm.protocal.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.LinkedList;

public final class e
{
  public f jLc;
  public LinkedList<nh> jOo;
  public String jOp;
  private String jOq;
  private boolean jOr;
  public a jOs;
  public aj jOt;
  final com.tencent.mm.ac.e jOu;
  final com.tencent.mm.ac.e jOv;
  
  public e(a parama, f paramf)
  {
    GMTrace.i(14822066356224L, 110433);
    this.jOq = "";
    this.jOr = false;
    this.jOt = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(14821529485312L, 110429);
        e.this.aet();
        e.this.jOt.w(5000L, 5000L);
        GMTrace.o(14821529485312L, 110429);
        return true;
      }
    }, true);
    this.jOu = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(14829850984448L, 110491);
        com.tencent.mm.plugin.backup.f.b.b(704, e.this.jOu);
        w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createQrcode response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e("MicroMsg.CheckNetworkGenQrCodeHandler", "create qrcode failed, errMsg:" + paramAnonymousString);
          w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if (paramAnonymousInt2 == -100)
          {
            ap.wT().a(1000, e.this.jOv);
            paramAnonymousString = new com.tencent.mm.plugin.backup.d.a(e.this.jOo, e.this.jOp, b.aef().jNl);
            ap.wT().a(paramAnonymousString, 0);
            GMTrace.o(14829850984448L, 110491);
            return;
          }
          e.this.jLc.jLh = -11;
          e.this.jOs.a(e.this.jLc, null);
          GMTrace.o(14829850984448L, 110491);
          return;
        }
        paramAnonymousString = (com.tencent.mm.plugin.backup.d.b)paramAnonymousk;
        paramAnonymousk = (eg)paramAnonymousString.gMC.hlV.hmc;
        b.aef().jKZ = "";
        b.aef().jLa = paramAnonymousk.tym;
        b.aef().jLb = paramAnonymousk.tyn;
        b.aef().jNl = paramAnonymousk.tyh;
        paramAnonymousString = (eg)paramAnonymousString.gMC.hlV.hmc;
        if (paramAnonymousString == null) {
          paramAnonymousString = null;
        }
        for (;;)
        {
          if (paramAnonymousString != null)
          {
            e.this.jLc.jLh = 51;
            e.this.jOs.a(e.this.jLc, paramAnonymousString);
          }
          GMTrace.o(14829850984448L, 110491);
          return;
          if (paramAnonymousString.tyj == null) {
            paramAnonymousString = null;
          } else {
            paramAnonymousString = paramAnonymousString.tyj.ush.toK;
          }
        }
      }
    };
    this.jOv = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(14821932138496L, 110432);
        com.tencent.mm.plugin.backup.f.b.b(1000, e.this.jOv);
        w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createOffilineQrcode response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          w.e("MicroMsg.CheckNetworkGenQrCodeHandler", "create offline qrcode failed, errMsg:" + paramAnonymousString);
          e.this.jLc.jLh = -11;
          e.this.jOs.a(e.this.jLc, null);
          GMTrace.o(14821932138496L, 110432);
          return;
        }
        paramAnonymousk = ((j.b)((com.tencent.mm.plugin.backup.d.a)paramAnonymousk).hne.Ba()).tpC;
        if (paramAnonymousk == null)
        {
          paramAnonymousString = "null";
          w.i("MicroMsg.BackupCreateQRCodeOfflineScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramAnonymousString });
          if (paramAnonymousk != null) {
            break label225;
          }
          paramAnonymousString = null;
        }
        for (;;)
        {
          if (paramAnonymousString != null)
          {
            e.this.jLc.jLh = 51;
            e.this.jOs.a(e.this.jLc, paramAnonymousString);
          }
          GMTrace.o(14821932138496L, 110432);
          return;
          paramAnonymousString = paramAnonymousk.tyk;
          break;
          label225:
          if (paramAnonymousk.tyj == null) {
            paramAnonymousString = null;
          } else {
            paramAnonymousString = paramAnonymousk.tyj.ush.toK;
          }
        }
      }
    };
    this.jOs = parama;
    this.jLc = paramf;
    GMTrace.o(14822066356224L, 110433);
  }
  
  private boolean aeu()
  {
    GMTrace.i(14822603227136L, 110437);
    this.jOo = new LinkedList();
    PString localPString = new PString();
    PInt localPInt = new PInt();
    this.jOp = h.bY(ab.getContext());
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "wifiName :%s", new Object[] { this.jOp });
    if (bg.mZ(this.jOp))
    {
      this.jLc.jLh = -4;
      this.jOs.a(this.jLc, null);
      this.jOq = "";
      GMTrace.o(14822603227136L, 110437);
      return false;
    }
    if (!b.aef().aeg().a(localPString, localPInt))
    {
      this.jLc.jLh = -4;
      this.jOs.a(this.jLc, null);
      this.jOq = "";
      GMTrace.o(14822603227136L, 110437);
      return false;
    }
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "server listen result: %s, %d", new Object[] { localPString.value, Integer.valueOf(localPInt.value) });
    nh localnh = new nh();
    localnh.tJG = localPString.value;
    localnh.tJH = new LinkedList();
    localnh.tJH.add(Integer.valueOf(localPInt.value));
    this.jOo.add(localnh);
    GMTrace.o(14822603227136L, 110437);
    return true;
  }
  
  public final void aet()
  {
    GMTrace.i(14822469009408L, 110436);
    Object localObject = h.bY(ab.getContext());
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "checkNetStatus newWifiName:%s  preWifiName:%s acc:%b hold:%b", new Object[] { localObject, this.jOq, Boolean.valueOf(ap.AV()), Boolean.valueOf(ap.wG()) });
    if (!((String)localObject).equals(this.jOq))
    {
      if (!ap.AV())
      {
        GMTrace.o(14822469009408L, 110436);
        return;
      }
      this.jOq = ((String)localObject);
      if (!aeu())
      {
        this.jOr = false;
        GMTrace.o(14822469009408L, 110436);
        return;
      }
      this.jOr = false;
      if (!ap.wG())
      {
        w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "begin to netscene create QRCode online ");
        ap.wT().a(704, this.jOu);
        localObject = new com.tencent.mm.plugin.backup.d.b(this.jOo, this.jOp);
        ap.wT().a((k)localObject, 0);
        GMTrace.o(14822469009408L, 110436);
        return;
      }
      w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "begin to netscene create QRCode offline");
      ap.wT().a(1000, this.jOv);
      localObject = new com.tencent.mm.plugin.backup.d.a(this.jOo, this.jOp, b.aef().jNl);
      ap.wT().a((k)localObject, 0);
    }
    GMTrace.o(14822469009408L, 110436);
  }
  
  public final void start()
  {
    GMTrace.i(14822200573952L, 110434);
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "start check network and gen qrcode handler starting:%b stop:%b .%s %s", new Object[] { Boolean.valueOf(this.jOr), Boolean.valueOf(this.jOt.bNt()), this, bg.bOd() });
    if (this.jOr)
    {
      GMTrace.o(14822200573952L, 110434);
      return;
    }
    this.jOr = true;
    if (aeu())
    {
      this.jOq = null;
      aet();
    }
    for (;;)
    {
      this.jOt.w(500L, 500L);
      GMTrace.o(14822200573952L, 110434);
      return;
      this.jLc.jLh = -4;
      this.jOs.a(this.jLc, null);
    }
  }
  
  public final void stop()
  {
    GMTrace.i(14822334791680L, 110435);
    w.i("MicroMsg.CheckNetworkGenQrCodeHandler", "stop check network and gen qrcode handler.");
    this.jOr = false;
    ap.wT().b(704, this.jOu);
    ap.wT().b(1000, this.jOv);
    this.jOt.MM();
    GMTrace.o(14822334791680L, 110435);
  }
  
  public static abstract interface a
  {
    public abstract void a(f paramf, byte[] paramArrayOfByte);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */