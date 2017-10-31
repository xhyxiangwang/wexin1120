package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.messenger.foundation.a.l;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class y
  implements l
{
  public y()
  {
    GMTrace.i(19313259970560L, 143895);
    GMTrace.o(19313259970560L, 143895);
  }
  
  public final d.b a(String paramString, Map<String, String> paramMap, d.a parama)
  {
    GMTrace.i(19313394188288L, 143896);
    w.i("MicroMsg.FavoriteNewXmlConsumer", "FavoriteNewXmlConsumer consumeNewXml");
    if (paramMap == null)
    {
      w.e("MicroMsg.FavoriteNewXmlConsumer", "FavoriteNewXmlConsumer consumeNewXml, values is null");
      GMTrace.o(19313394188288L, 143896);
      return null;
    }
    w.i("MicroMsg.FavoriteNewXmlConsumer", "FavoriteNewXmlConsumer,new xml is:\n %s", new Object[] { parama.hme.tvq });
    if ((paramString != null) && (paramString.equals("uploadfavitem")))
    {
      paramString = (String)paramMap.get(".sysmsg.favids");
      if (bg.mZ(paramString))
      {
        w.e("MicroMsg.FavoriteNewXmlConsumer", "FavoriteNewXmlConsumer consumeNewXml,idlist is null,return");
        GMTrace.o(19313394188288L, 143896);
        return null;
      }
      paramString = paramString.split(";");
      paramMap = new LinkedList();
      paramMap.addAll(Arrays.asList(paramString));
      if (paramMap.size() == 0)
      {
        w.e("MicroMsg.FavoriteNewXmlConsumer", "do scene NetSceneCheckFavItem fail");
        GMTrace.o(19313394188288L, 143896);
        return null;
      }
      paramString = new ae(paramMap);
      if (!ap.wT().a(paramString, 0)) {
        w.e("MicroMsg.FavoriteNewXmlConsumer", "do scene NetSceneCheckFavItem fail");
      }
    }
    GMTrace.o(19313394188288L, 143896);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */