package com.tencent.mm.plugin.card.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.pluginsdk.l.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;

public final class j
  implements l.c
{
  public j()
  {
    GMTrace.i(5114366525440L, 38105);
    GMTrace.o(5114366525440L, 38105);
  }
  
  public final boolean ajl()
  {
    GMTrace.i(5114500743168L, 38106);
    boolean bool = l.amk();
    GMTrace.o(5114500743168L, 38106);
    return bool;
  }
  
  public final boolean ajm()
  {
    GMTrace.i(5114634960896L, 38107);
    boolean bool = l.amm();
    GMTrace.o(5114634960896L, 38107);
    return bool;
  }
  
  public final String ajn()
  {
    GMTrace.i(5114769178624L, 38108);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uVo, null);
    GMTrace.o(5114769178624L, 38108);
    return str;
  }
  
  public final int ajo()
  {
    int j = 0;
    int i = 0;
    GMTrace.i(5114903396352L, 38109);
    Object localObject1 = al.ajC();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR ").append("status=5) and (block_mask").append("= '1' OR block_mask= '0' ").append(")");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((com.tencent.mm.plugin.card.model.c)localObject1).gMB.a((String)localObject2, null, 2);
    if (localObject1 == null) {}
    for (;;)
    {
      w.i("MicroMsg.CardMgrImpl", "getGiftCardCount:" + i);
      GMTrace.o(5114903396352L, 38109);
      return i;
      i = j;
      if (((Cursor)localObject1).moveToFirst()) {
        i = ((Cursor)localObject1).getInt(0);
      }
      ((Cursor)localObject1).close();
    }
  }
  
  public final boolean lu(int paramInt)
  {
    GMTrace.i(5115037614080L, 38110);
    boolean bool = l.lu(paramInt);
    GMTrace.o(5115037614080L, 38110);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */