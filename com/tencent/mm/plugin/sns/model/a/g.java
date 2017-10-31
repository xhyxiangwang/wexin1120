package com.tencent.mm.plugin.sns.model.a;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.c;
import com.tencent.mm.plugin.sns.lucky.a.b;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends e
{
  private boolean hfm;
  
  public g(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8067424976896L, 60107);
    this.hfm = false;
    com.tencent.mm.plugin.report.service.g.paX.a(150L, 10L, 1L, true);
    GMTrace.o(8067424976896L, 60107);
  }
  
  public final boolean bib()
  {
    GMTrace.i(8067559194624L, 60108);
    String str2;
    String str3;
    BitmapFactory.Options localOptions;
    String str1;
    if (this.qfW.pYf != null)
    {
      str2 = i.e(this.fNf);
      this.hfm = r.HQ(this.qfW.getPath() + this.qfW.bhZ());
      if (this.qgt) {
        this.hfm = true;
      }
      if (this.hfm) {
        com.tencent.mm.plugin.report.service.g.paX.a(22L, 64L, 1L, true);
      }
      str3 = this.qfW.getPath() + this.qfW.bhZ();
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      MMBitmapFactory.decodeFile(str3, localOptions, null, 0, new int[0]);
      if (localOptions.outMimeType == null) {
        break label920;
      }
      str1 = localOptions.outMimeType.toLowerCase();
      if ((localOptions.outMimeType == null) || (bg.mZ(localOptions.outMimeType))) {
        com.tencent.mm.plugin.report.service.g.paX.a(150L, 35L, 1L, true);
      }
      if ((!str1.contains("jpg")) && (!str1.contains("jpeg"))) {
        break label952;
      }
      int j = MMNativeJpeg.queryQuality(str3);
      i = j;
      if (j != 0) {}
    }
    label920:
    label928:
    label952:
    for (int i = -1;; i = -1)
    {
      long l1 = FileOp.kI(str3);
      if (l1 <= 0L) {
        com.tencent.mm.plugin.report.service.g.paX.a(150L, 23L, 1L, true);
      }
      long l2 = bg.Pq();
      str1 = i.i(this.fNf);
      FileOp.o(this.qfW.getPath() + this.qfW.bhZ(), this.qfW.getPath() + str1);
      w.v("MicroMsg.SnsDownloadThumb", "file src" + FileOp.aZ(new StringBuilder().append(this.qfW.getPath()).append(str1).toString()));
      long l3 = bg.Pq();
      if (!r.a(this.qfW.getPath(), this.qfW.bhZ(), str2, ae.bhx())) {
        com.tencent.mm.plugin.report.service.g.paX.a(150L, 27L, 1L, true);
      }
      l3 = bg.aG(l3);
      FileOp.deleteFile(this.qfW.getPath() + this.qfW.bhZ());
      l2 = bg.aG(l2);
      if (!FileOp.aZ(this.qfW.getPath() + str2)) {
        com.tencent.mm.plugin.report.service.g.paX.a(150L, 31L, 1L, true);
      }
      com.tencent.mm.plugin.report.service.g.paX.i(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l2), Integer.valueOf(this.qgq), Thread.currentThread().getName(), ae.bhD(), com.tencent.mm.compatible.util.e.gZR });
      if ((this.qfW.pYf.pYl == 0) || (this.qfW.pYf.pYl == 5))
      {
        str1 = i.f(this.fNf);
        r.b(this.qfW.getPath(), str2, str1, ae.bhw());
      }
      for (;;)
      {
        c.a(this.qfW.getPath() + str1, this.qfW.url, 1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, i, l1, l3);
        this.qfV = i.Ge(this.qfW.getPath() + str1);
        boolean bool = i.a(this.qfV);
        w.i("MicroMsg.SnsDownloadThumb", "download decode bitmap done : succ: " + bool + " isWebp: " + this.hfm + " srcImgFileSize: " + l1);
        if (!bool)
        {
          com.tencent.mm.plugin.report.service.g.paX.a(150L, 65L, 1L, true);
          if (!this.qgv) {
            break label928;
          }
          com.tencent.mm.plugin.report.service.g.paX.a(150L, 50L, 1L, true);
        }
        for (;;)
        {
          if (this.qgu) {
            com.tencent.mm.plugin.report.service.g.paX.a(150L, 54L, 1L, true);
          }
          if (this.qgt) {
            com.tencent.mm.plugin.report.service.g.paX.a(150L, 57L, 1L, true);
          }
          if ((this.hfm) && (!bool)) {
            com.tencent.mm.plugin.report.service.g.paX.a(22L, 65L, 1L, true);
          }
          if ((this.qgv) && (bool)) {
            b.nK(139);
          }
          GMTrace.o(8067559194624L, 60108);
          return true;
          str1 = "";
          break;
          com.tencent.mm.plugin.report.service.g.paX.a(150L, 51L, 1L, true);
        }
        str1 = str2;
      }
    }
  }
  
  protected final int bic()
  {
    GMTrace.i(8067693412352L, 60109);
    GMTrace.o(8067693412352L, 60109);
    return 3;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */