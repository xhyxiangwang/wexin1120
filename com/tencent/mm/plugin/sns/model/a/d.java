package com.tencent.mm.plugin.sns.model.a;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.c;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  extends e
{
  public d(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8066082799616L, 60097);
    GMTrace.o(8066082799616L, 60097);
  }
  
  public final boolean bib()
  {
    GMTrace.i(8066217017344L, 60098);
    long l1 = -1L;
    String str1 = i.l(this.fNf);
    String str2 = this.qfW.getPath() + this.qfW.bhZ();
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeFile(str2, localOptions, null, 0, new int[0]);
    Object localObject;
    long l3;
    int i;
    if (localOptions.outMimeType != null)
    {
      localObject = localOptions.outMimeType.toLowerCase();
      l3 = FileOp.kI(str2);
      if ((!this.qgt) && (!((String)localObject).contains("webp"))) {
        break label599;
      }
      i = 0;
    }
    for (;;)
    {
      label126:
      label152:
      boolean bool;
      label170:
      long l2;
      switch (i)
      {
      default: 
        localObject = new StringBuilder("donwload big pic isWebp ");
        if (i == 0)
        {
          bool = true;
          w.i("MicroMsg.SnsDownloadImage", bool);
          l2 = FileOp.kI(this.qfW.getPath() + str1);
          g.paX.i(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2), Thread.currentThread().getName(), ae.bhD(), com.tencent.mm.compatible.util.e.gZR });
          if (this.qfW.qfS == 3) {
            break label1409;
          }
        }
        break;
      }
      label599:
      label1409:
      for (i = 1;; i = 0)
      {
        int j = i;
        if (this.qfW.pYf != null)
        {
          j = i;
          if (this.qfW.pYf.pYl != 4)
          {
            j = i;
            if (this.qfW.pYf.pYl != 5) {
              j = 0;
            }
          }
        }
        if (j != 0)
        {
          localObject = i.e(this.fNf);
          if (FileOp.aZ(this.qfW.getPath() + (String)localObject)) {
            FileOp.deleteFile(this.qfW.getPath() + (String)localObject);
          }
          l1 = bg.Pq();
          r.a(this.qfW.getPath(), str1, (String)localObject, ae.bhx());
          l1 = bg.aG(l1);
          FileOp.kI(this.qfW.getPath() + (String)localObject);
          g.paX.i(11696, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2), Thread.currentThread().getName(), ae.bhD(), com.tencent.mm.compatible.util.e.gZR });
          localObject = i.f(this.fNf);
          if (!FileOp.aZ(this.qfW.getPath() + (String)localObject)) {
            r.b(this.qfW.getPath(), str1, (String)localObject, ae.bhw());
          }
        }
        GMTrace.o(8066217017344L, 60098);
        return true;
        localObject = "";
        break;
        if ((!this.qgu) && (!((String)localObject).contains("vcodec"))) {
          break label1414;
        }
        i = 1;
        break label126;
        g.paX.a(22L, 64L, 1L, true);
        FileOp.deleteFile(this.qfW.getPath() + str1);
        l1 = bg.Pq();
        r.d(this.qfW.getPath(), this.qfW.getPath() + this.qfW.bhZ(), str1, false);
        l2 = bg.aG(l1);
        FileOp.deleteFile(this.qfW.getPath() + this.qfW.bhZ());
        l1 = bg.aG(l1);
        c.a(this.qfW.getPath() + str1, this.qfW.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, -1, l3, l2);
        break label152;
        w.i("MicroMsg.SnsDownloadImage", "found vcodec:%s, reencoded.", new Object[] { this.qfW.getPath() + this.qfW.bhZ() });
        FileOp.deleteFile(this.qfW.getPath() + str1);
        l1 = bg.Pq();
        r.d(this.qfW.getPath(), this.qfW.getPath() + this.qfW.bhZ(), str1, false);
        l2 = bg.aG(l1);
        FileOp.deleteFile(this.qfW.getPath() + this.qfW.bhZ());
        l1 = bg.aG(l1);
        c.a(this.qfW.getPath() + str1, this.qfW.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, -1, l3, l2);
        break label152;
        l2 = -1L;
        if (i.Gj(this.qfW.getPath() + this.qfW.bhZ()))
        {
          w.w("MicroMsg.SnsDownloadImage", "the " + this.qfW.mediaId + " is too max ! " + this.qfW.url);
          FileOp.deleteFile(this.qfW.getPath() + str1);
          l1 = bg.Pq();
          r.V(this.qfW.getPath(), this.qfW.getPath() + this.qfW.bhZ(), str1);
          l2 = bg.aG(l1);
          FileOp.deleteFile(this.qfW.getPath() + this.qfW.bhZ());
        }
        for (l1 = bg.aG(l1);; l1 = 0L)
        {
          j = -1;
          if ((((String)localObject).contains("jpg")) || (((String)localObject).contains("jpeg")))
          {
            int k = MMNativeJpeg.queryQuality(this.qfW.getPath() + str1);
            j = k;
            if (k == 0) {
              j = -1;
            }
          }
          c.a(this.qfW.getPath() + str1, this.qfW.url, 0, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, j, l3, l2);
          break;
          FileOp.g(this.qfW.getPath(), this.qfW.bhZ(), str1);
        }
        bool = false;
        break label170;
      }
      label1414:
      i = 2;
    }
  }
  
  protected final int bic()
  {
    GMTrace.i(8066351235072L, 60099);
    GMTrace.o(8066351235072L, 60099);
    return 1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */