package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.fr.b;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.a;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.plugin.record.ui.a.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;

public final class d
{
  public static String a(b paramb)
  {
    GMTrace.i(7500623511552L, 55884);
    fr localfr = new fr();
    localfr.fBn.type = 2;
    localfr.fBn.fBp = paramb.fBc;
    a.uLm.m(localfr);
    paramb = localfr.fBo.path;
    GMTrace.o(7500623511552L, 55884);
    return paramb;
  }
  
  public static String b(b paramb)
  {
    GMTrace.i(7500757729280L, 55885);
    fr localfr = new fr();
    localfr.fBn.type = 2;
    localfr.fBn.fBp = paramb.fBc;
    a.uLm.m(localfr);
    paramb = localfr.fBo.fBx;
    GMTrace.o(7500757729280L, 55885);
    return paramb;
  }
  
  public static boolean c(b paramb)
  {
    GMTrace.i(7500891947008L, 55886);
    fr localfr = new fr();
    localfr.fBn.type = 14;
    localfr.fBn.fBp = paramb.fBc;
    a.uLm.m(localfr);
    if (localfr.fBo.ret == 1)
    {
      GMTrace.o(7500891947008L, 55886);
      return true;
    }
    GMTrace.o(7500891947008L, 55886);
    return false;
  }
  
  public static c cZ(long paramLong)
  {
    GMTrace.i(7501026164736L, 55887);
    ft localft = new ft();
    localft.fBI.fwq = paramLong;
    a.uLm.m(localft);
    if (localft.fBJ.ret == 0)
    {
      w.w("MicroMsg.RecordFavLogic", "can not fetch FavItem");
      GMTrace.o(7501026164736L, 55887);
      return null;
    }
    w.d("MicroMsg.RecordFavLogic", "fetch favitem localId %s, itemStatus %d", new Object[] { Long.valueOf(localft.fBI.fwq), Integer.valueOf(localft.fBJ.field_itemStatus) });
    c localc = new c();
    localc.field_localId = localft.fBI.fwq;
    localc.field_id = localft.fBJ.field_id;
    localc.field_fromUser = localft.fBJ.field_fromUser;
    localc.field_toUser = localft.fBJ.field_toUser;
    localc.field_favProto = localft.fBJ.field_favProto;
    localc.field_realChatName = localft.fBJ.field_realChatName;
    localc.field_type = localft.fBJ.field_type;
    localc.field_itemStatus = localft.fBJ.field_itemStatus;
    GMTrace.o(7501026164736L, 55887);
    return localc;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */