package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.d;
import com.tencent.mm.sdk.platformtools.bh;
import java.util.Map;

public final class g
{
  public static String a(d paramd)
  {
    GMTrace.i(5058397732864L, 37688);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<from_username>").append(paramd.koB).append("</from_username>");
    localStringBuilder.append("<card_id>").append(paramd.fMv).append("</card_id>");
    localStringBuilder.append("<card_type>").append(paramd.knq).append("</card_type>");
    localStringBuilder.append("<from_scene>").append(paramd.fMx).append("</from_scene>");
    localStringBuilder.append("<color>").append(paramd.hbA).append("</color>");
    localStringBuilder.append("<card_type_name>").append(paramd.koC).append("</card_type_name>");
    localStringBuilder.append("<brand_name>").append(paramd.koD).append("</brand_name>");
    if (TextUtils.isEmpty(paramd.fMw)) {
      localStringBuilder.append("<card_ext></card_ext>");
    }
    for (;;)
    {
      localStringBuilder.append("<is_recommend>").append(paramd.koE).append("</is_recommend>");
      localStringBuilder.append("<recommend_card_id>").append(paramd.koF).append("</recommend_card_id>");
      paramd = localStringBuilder.toString();
      GMTrace.o(5058397732864L, 37688);
      return paramd;
      localStringBuilder.append("<card_ext>").append(paramd.fMw).append("</card_ext>");
    }
  }
  
  public static d uf(String paramString)
  {
    GMTrace.i(5057995079680L, 37685);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5057995079680L, 37685);
      return null;
    }
    d locald = new d();
    paramString = bh.p(paramString, "msg");
    locald.koB = ((String)paramString.get(".msg.appmsg.carditem.from_username"));
    locald.fMv = ((String)paramString.get(".msg.appmsg.carditem.card_id"));
    locald.knq = uh((String)paramString.get(".msg.appmsg.carditem.card_type"));
    locald.fMx = uh((String)paramString.get(".msg.appmsg.carditem.from_scene"));
    locald.hbA = ((String)paramString.get(".msg.appmsg.carditem.color"));
    locald.koC = ((String)paramString.get(".msg.appmsg.carditem.card_type_name"));
    locald.koD = ((String)paramString.get(".msg.appmsg.carditem.brand_name"));
    locald.fMw = ((String)paramString.get(".msg.appmsg.carditem.card_ext"));
    locald.koE = uh((String)paramString.get(".msg.appmsg.carditem.is_recommend"));
    locald.koF = ((String)paramString.get(".msg.appmsg.carditem.recommend_card_id"));
    GMTrace.o(5057995079680L, 37685);
    return locald;
  }
  
  public static String ug(String paramString)
  {
    GMTrace.i(5058129297408L, 37686);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5058129297408L, 37686);
      return null;
    }
    paramString = (String)bh.p(paramString, "msg").get(".msg.appmsg.fromusername");
    GMTrace.o(5058129297408L, 37686);
    return paramString;
  }
  
  private static int uh(String paramString)
  {
    GMTrace.i(5058263515136L, 37687);
    if ((TextUtils.isEmpty(paramString)) || (!l.ul(paramString)))
    {
      GMTrace.o(5058263515136L, 37687);
      return 0;
    }
    int i = Integer.valueOf(paramString).intValue();
    GMTrace.o(5058263515136L, 37687);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */