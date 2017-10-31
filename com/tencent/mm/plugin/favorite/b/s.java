package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Map;

public final class s
{
  public static String a(th paramth)
  {
    int j = 0;
    GMTrace.i(6304340901888L, 46971);
    if ((paramth == null) || ((paramth.tQM.isEmpty()) && (paramth.tQL.isEmpty())))
    {
      w.v("MicroMsg.FavTagParser", "tag list toXml data list empty");
      GMTrace.o(6304340901888L, 46971);
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    int k = paramth.tQM.size();
    localStringBuffer.append("<taglist count='").append(k).append("'>");
    int i = 0;
    while (i < k)
    {
      localStringBuffer.append("<tag>").append(bg.RD((String)paramth.tQM.get(i))).append("</tag>");
      i += 1;
    }
    localStringBuffer.append("</taglist>");
    k = paramth.tQL.size();
    localStringBuffer.append("<recommendtaglist count='").append(k).append("'>");
    i = j;
    while (i < k)
    {
      localStringBuffer.append("<tag>").append(bg.RD((String)paramth.tQL.get(i))).append("</tag>");
      i += 1;
    }
    localStringBuffer.append("</recommendtaglist>");
    paramth = localStringBuffer.toString();
    GMTrace.o(6304340901888L, 46971);
    return paramth;
  }
  
  public static void a(Map<String, String> paramMap, th paramth)
  {
    GMTrace.i(6304206684160L, 46970);
    if ((paramMap == null) || (paramth == null))
    {
      w.w("MicroMsg.FavTagParser", "maps is null or item is null");
      GMTrace.o(6304206684160L, 46970);
      return;
    }
    paramth.tQM.clear();
    int i = 0;
    StringBuilder localStringBuilder;
    Object localObject;
    if (i < 1024)
    {
      localStringBuilder = new StringBuilder(".favitem.taglist.tag");
      if (i > 0) {}
      for (localObject = Integer.valueOf(i);; localObject = "")
      {
        localObject = (String)paramMap.get(localObject);
        if (localObject == null) {
          break label113;
        }
        paramth.tQM.add(localObject);
        i += 1;
        break;
      }
    }
    label113:
    if (!paramth.tQM.isEmpty()) {
      w.d("MicroMsg.FavTagParser", "user def tag not empty, res=%s", new Object[] { paramth.tQM });
    }
    paramth.tQL.clear();
    i = 0;
    if (i < 1024)
    {
      localStringBuilder = new StringBuilder(".favitem.recommendtaglist.tag");
      if (i > 0) {}
      for (localObject = Integer.valueOf(i);; localObject = "")
      {
        localObject = (String)paramMap.get(localObject);
        if (localObject == null) {
          break label222;
        }
        paramth.tQL.add(localObject);
        i += 1;
        break;
      }
    }
    label222:
    if (!paramth.tQL.isEmpty()) {
      w.d("MicroMsg.FavTagParser", "recommended tag not empty, res=%s", new Object[] { paramth.tQL });
    }
    GMTrace.o(6304206684160L, 46970);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */