package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jv;
import com.tencent.mm.g.a.jw;
import com.tencent.mm.g.a.kd;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.w;

public final class l
  implements b.a, j.a
{
  private int lOF;
  
  public l()
  {
    GMTrace.i(6301388111872L, 46949);
    GMTrace.o(6301388111872L, 46949);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(6301656547328L, 46951);
    paraml = String.valueOf(this.lOF);
    w.d("MircoMsg.FavItemInfoStorageProxy", "on notify change event %s, favIDStr %s", new Object[] { paramString, paraml });
    if (paraml.equals(paramString))
    {
      paramString = new jw();
      paramString.fHl.fHm = this.lOF;
      com.tencent.mm.sdk.b.a.uLm.m(paramString);
    }
    GMTrace.o(6301656547328L, 46951);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(6301522329600L, 46950);
    if (parama == null)
    {
      GMTrace.o(6301522329600L, 46950);
      return;
    }
    w.d("MircoMsg.FavItemInfoStorageProxy", "notify CdnChanged dataId: %s, status: %d", new Object[] { parama.field_dataId, Integer.valueOf(parama.field_status) });
    Object localObject = h.awD().cc(parama.field_favLocalId);
    if ((localObject != null) && (((j)localObject).field_type == 18))
    {
      localObject = new kd();
      ((kd)localObject).fHt.field_favLocalId = parama.field_favLocalId;
      ((kd)localObject).fHt.field_dataId = parama.field_dataId;
      ((kd)localObject).fHt.field_status = parama.field_status;
      ((kd)localObject).fHt.field_offset = parama.field_offset;
      ((kd)localObject).fHt.field_totalLen = parama.field_totalLen;
      ((kd)localObject).fHt.field_path = parama.field_path;
      com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
      GMTrace.o(6301522329600L, 46950);
      return;
    }
    localObject = new jv();
    ((jv)localObject).fHk.field_favLocalId = parama.field_favLocalId;
    ((jv)localObject).fHk.field_dataId = parama.field_dataId;
    ((jv)localObject).fHk.field_status = parama.field_status;
    ((jv)localObject).fHk.field_offset = parama.field_offset;
    ((jv)localObject).fHk.field_totalLen = parama.field_totalLen;
    com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
    GMTrace.o(6301522329600L, 46950);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */