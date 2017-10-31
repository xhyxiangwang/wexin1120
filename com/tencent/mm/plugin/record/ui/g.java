package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends j
  implements h.a
{
  public g()
  {
    GMTrace.i(7554847473664L, 56288);
    GMTrace.o(7554847473664L, 56288);
  }
  
  public final Bitmap a(h.a.b paramb)
  {
    GMTrace.i(7555250126848L, 56291);
    sp localsp = paramb.fBc;
    long l = paramb.oUO;
    boolean bool = paramb.fBf;
    int j = paramb.maxWidth;
    if (!com.tencent.mm.compatible.util.f.tD()) {
      paramb = BitmapFactory.decodeResource(ab.getContext().getResources(), R.g.bbq);
    }
    String str;
    for (;;)
    {
      if ((paramb == null) && (!bool))
      {
        bool = super.a(localsp, l);
        w.d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
        m.a(localsp, l, bool);
      }
      GMTrace.o(7555250126848L, 56291);
      return paramb;
      str = m.c(localsp, l);
      if ((bg.mZ(str)) || (!e.aZ(str)))
      {
        w.d("MicroMsg.RecordMsgImgService", "getBitmap file not exist, thumb[%B] path[%s]", new Object[] { Boolean.valueOf(false), str });
        paramb = null;
      }
      else
      {
        paramb = (Bitmap)this.lQG.get(str);
        if (paramb != null)
        {
          w.d("MicroMsg.RecordMsgImgService", "get bm from cache %s", new Object[] { str });
        }
        else
        {
          if (!bool) {
            break;
          }
          paramb = null;
        }
      }
    }
    w.d("MicroMsg.RecordMsgImgService", "get from cache fail, try to decode from file, path %s", new Object[] { str });
    paramb = new BitmapFactory.Options();
    paramb.inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(str, paramb);
    if (localBitmap != null)
    {
      w.i("MicroMsg.RecordMsgImgService", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int i = paramb.outHeight;
    int m = paramb.outWidth;
    w.d("MicroMsg.RecordMsgImgService", "width: %s, height: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(i) });
    int k = m;
    if (m > j)
    {
      i = paramb.outHeight * j / paramb.outWidth;
      k = j;
    }
    k = Math.max(1, k);
    i = Math.max(1, i);
    if (k > j) {
      i = paramb.outHeight * j / paramb.outWidth;
    }
    for (;;)
    {
      int n = BackwardSupportUtil.ExifHelper.QG(str);
      if (n != 90)
      {
        m = i;
        k = j;
        if (n != 270) {}
      }
      else
      {
        k = i;
        m = j;
      }
      paramb = d.d(str, m, k, false);
      if (paramb == null)
      {
        w.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + str);
        paramb = null;
        break;
      }
      paramb = d.b(paramb, n);
      this.lQG.put(str, paramb);
      break;
      j = k;
    }
  }
  
  public final Bitmap a(h.a.c paramc)
  {
    GMTrace.i(7555115909120L, 56290);
    paramc = super.b(paramc.fBc, paramc.oUO);
    GMTrace.o(7555115909120L, 56290);
    return paramc;
  }
  
  public final void a(h.a.a parama)
  {
    GMTrace.i(7554981691392L, 56289);
    ImageView localImageView = parama.fBd;
    sp localsp = parama.fBc;
    long l = parama.oUO;
    int i = parama.fBe;
    int j = parama.width;
    int k = parama.height;
    if (localImageView == null)
    {
      GMTrace.o(7554981691392L, 56289);
      return;
    }
    if (!com.tencent.mm.compatible.util.f.tD())
    {
      localImageView.setImageResource(R.g.bbq);
      GMTrace.o(7554981691392L, 56289);
      return;
    }
    if (localsp == null)
    {
      localImageView.setImageResource(i);
      GMTrace.o(7554981691392L, 56289);
      return;
    }
    switch (localsp.aHe)
    {
    case 6: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    default: 
      w.w("MicroMsg.RecordMsgImgService", "attach thumb, pass data type is %d", new Object[] { Integer.valueOf(localsp.aHe) });
      GMTrace.o(7554981691392L, 56289);
      return;
    case 7: 
      super.a(localImageView, localsp, l, localsp.fwl, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
    case 4: 
    case 15: 
      super.a(localImageView, localsp, l, localsp.fwl, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
    case 5: 
      parama = null;
      if (localsp.tPr != null)
      {
        parama = localsp.tPr.tPN;
        label274:
        if (parama != null) {
          break label340;
        }
        parama = null;
        label280:
        if (!bg.mZ(parama)) {
          break label579;
        }
        parama = localsp.fwl;
      }
      break;
    }
    label340:
    label579:
    for (;;)
    {
      super.a(localImageView, localsp, l, parama, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
      w.w("MicroMsg.RecordMsgImgService", "webpage: get data proto item null, dataid[%s]", new Object[] { localsp.lUP });
      break label274;
      parama = parama.thumbUrl;
      break label280;
      if (localsp.tPr == null)
      {
        w.w("MicroMsg.RecordMsgImgService", "good: get data proto item null, dataid[%s]", new Object[] { localsp.lUP });
        GMTrace.o(7554981691392L, 56289);
        return;
      }
      parama = localsp.tPr.tPP;
      if (parama == null) {
        break;
      }
      this.oUb.a(localImageView, null, parama.thumbUrl, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
      if (localsp.tPr == null)
      {
        w.w("MicroMsg.RecordMsgImgService", "tv: get data proto item null, dataid[%s]", new Object[] { localsp.lUP });
        GMTrace.o(7554981691392L, 56289);
        return;
      }
      parama = localsp.tPr.tPR;
      if (parama == null) {
        break;
      }
      this.oUb.a(localImageView, null, parama.thumbUrl, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
      if (localsp.tPr == null)
      {
        w.w("MicroMsg.RecordMsgImgService", "product: get data proto item null, dataid[%s]", new Object[] { localsp.lUP });
        GMTrace.o(7554981691392L, 56289);
        return;
      }
      parama = localsp.tPr.tPP;
      if (parama == null) {
        break;
      }
      this.oUb.a(localImageView, null, parama.thumbUrl, i, j, k);
      GMTrace.o(7554981691392L, 56289);
      return;
    }
  }
  
  public final void aZk()
  {
    GMTrace.i(7555384344576L, 56292);
    super.destory();
    GMTrace.o(7555384344576L, 56292);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */