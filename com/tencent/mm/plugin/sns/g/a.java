package com.tencent.mm.plugin.sns.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.afk;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.cc;
import com.tencent.mm.protocal.c.dl;
import com.tencent.mm.protocal.c.dm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  private static int Hh(String paramString)
  {
    int i = 0;
    GMTrace.i(8867496853504L, 66068);
    try
    {
      int j = bg.getInt(paramString, 0);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AlbumBgHelper", "parserInt error " + paramString);
      }
    }
    GMTrace.o(8867496853504L, 66068);
    return i;
  }
  
  public static cc Hi(String paramString)
  {
    GMTrace.i(8867899506688L, 66071);
    Map localMap = bh.p(paramString, "albumList");
    cc localcc = new cc();
    if (localMap != null)
    {
      localcc.mEm = ll((String)localMap.get(".albumList.$lang"));
      paramString = new dl();
      paramString.mCJ = ll((String)localMap.get(".albumList.album.author.name"));
      paramString.fuw = ll((String)localMap.get(".albumList.album.author.title"));
      paramString.txe = ll((String)localMap.get(".albumList.album.author.description"));
      paramString.txd = ll((String)localMap.get(".albumList.album.author.quote"));
      Object localObject1 = new dm();
      Object localObject2 = m(localMap, ".albumList.album.author.icon.media");
      String str1 = (String)localMap.get(".albumList.album.author.icon.media.id");
      String str2 = (String)localMap.get(".albumList.album.author.icon.media.type");
      String str3 = (String)localMap.get(".albumList.album.author.icon.media.title");
      String str4 = (String)localMap.get(".albumList.album.author.icon.media.desc");
      String str5 = (String)localMap.get(".albumList.album.author.icon.media.url");
      String str6 = (String)localMap.get(".albumList.album.author.icon.media.private");
      String str7 = (String)localMap.get(".albumList.album.author.icon.media.thumb");
      String str8 = (String)localMap.get(".albumList.album.author.icon.media.url.$type");
      String str9 = (String)localMap.get(".albumList.album.author.icon.media.thumb.$type");
      amn localamn = new amn();
      localamn.nas = ll(str1);
      localamn.jXP = Hh(str2);
      localamn.fuw = ll(str3);
      localamn.mCK = ll(str4);
      localamn.mDo = ll(str5);
      localamn.uhz = Hh(str8);
      localamn.uhA = ll(str7);
      localamn.uhB = Hh(str9);
      localamn.uhC = Hh(str6);
      localamn.uhD = ((amp)localObject2);
      ((dm)localObject1).txg = localamn;
      paramString.txf = ((dm)localObject1);
      localcc.tvJ = paramString;
      int i = 0;
      localObject2 = new afk();
      if (i == 0) {
        localObject1 = ".albumList.album.groupList.group.name";
      }
      for (paramString = ".albumList.album.groupList.group.mediaList";; paramString = ".albumList.album.groupList.group" + i + ".mediaList")
      {
        localObject1 = (String)localMap.get(localObject1);
        if (localObject1 == null) {
          break label503;
        }
        ((afk)localObject2).mCJ = ll((String)localObject1);
        ((afk)localObject2).tKd = n(localMap, paramString);
        localcc.tvK.add(localObject2);
        i += 1;
        break;
        localObject1 = ".albumList.album.groupList.group" + i + ".name";
      }
    }
    for (;;)
    {
      label503:
      GMTrace.o(8867899506688L, 66071);
      return localcc;
    }
  }
  
  private static float lk(String paramString)
  {
    float f1 = 0.0F;
    GMTrace.i(8867631071232L, 66069);
    if (paramString == null)
    {
      GMTrace.o(8867631071232L, 66069);
      return 0.0F;
    }
    try
    {
      float f2 = bg.getFloat(paramString, 0.0F);
      f1 = f2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.AlbumBgHelper", "parseFloat error " + paramString);
      }
    }
    GMTrace.o(8867631071232L, 66069);
    return f1;
  }
  
  private static String ll(String paramString)
  {
    GMTrace.i(8867765288960L, 66070);
    if (paramString == null)
    {
      GMTrace.o(8867765288960L, 66070);
      return "";
    }
    GMTrace.o(8867765288960L, 66070);
    return paramString;
  }
  
  private static amp m(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(8868033724416L, 66072);
    String str2 = paramString + ".size.$width";
    String str1 = paramString + ".size.$height";
    Object localObject = paramString + ".size.$totalSize";
    paramString = (String)paramMap.get(str2);
    str1 = (String)paramMap.get(str1);
    paramMap = (String)paramMap.get(localObject);
    localObject = new amp();
    ((amp)localObject).uit = 0.0F;
    ((amp)localObject).uis = 0.0F;
    ((amp)localObject).uiu = 0.0F;
    if (paramString != null) {
      ((amp)localObject).uis = lk(paramString);
    }
    if (str1 != null) {
      ((amp)localObject).uit = lk(str1);
    }
    if (paramMap != null) {
      ((amp)localObject).uiu = lk(paramMap);
    }
    GMTrace.o(8868033724416L, 66072);
    return (amp)localObject;
  }
  
  private static LinkedList<amn> n(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(8868167942144L, 66073);
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    String str9;
    String str4;
    String str8;
    String str7;
    String str6;
    String str3;
    String str2;
    String str1;
    String str5;
    if (i != 0)
    {
      str9 = paramString + ".media" + i + ".id";
      str4 = paramString + ".media" + i + ".type";
      str8 = paramString + ".media" + i + ".title";
      str7 = paramString + ".media" + i + ".desc";
      str6 = paramString + ".media" + i + ".url";
      str3 = paramString + ".media" + i + ".thumb";
      str2 = paramString + ".media" + i + ".url.$type";
      str1 = paramString + ".media" + i + ".thumb.$type";
      str5 = paramString + ".media" + i + ".private";
    }
    for (Object localObject = paramString + ".media" + i;; localObject = paramString + ".media")
    {
      if ((str9 == null) || (str4 == null)) {
        break label822;
      }
      localObject = m(paramMap, (String)localObject);
      str9 = (String)paramMap.get(str9);
      str4 = (String)paramMap.get(str4);
      str8 = (String)paramMap.get(str8);
      str7 = (String)paramMap.get(str7);
      str6 = (String)paramMap.get(str6);
      str5 = (String)paramMap.get(str5);
      str3 = (String)paramMap.get(str3);
      str2 = (String)paramMap.get(str2);
      str1 = (String)paramMap.get(str1);
      if ((str9 == null) || (str4 == null)) {
        break label822;
      }
      amn localamn = new amn();
      localamn.nas = ll(str9);
      localamn.jXP = Hh(str4);
      localamn.fuw = ll(str8);
      localamn.mCK = ll(str7);
      localamn.mDo = ll(str6);
      localamn.uhz = Hh(str2);
      localamn.uhA = ll(str3);
      localamn.uhB = Hh(str1);
      localamn.uhC = Hh(str5);
      localamn.uhD = ((amp)localObject);
      localLinkedList.add(localamn);
      i += 1;
      break;
      str9 = paramString + ".media.id";
      str4 = paramString + ".media.type";
      str8 = paramString + ".media.title";
      str7 = paramString + ".media.desc";
      str6 = paramString + ".media.url";
      str3 = paramString + ".media.thumb";
      str2 = paramString + ".media.url.$type";
      str1 = paramString + ".media.thumb.$type";
      str5 = paramString + ".media.private";
    }
    label822:
    GMTrace.o(8868167942144L, 66073);
    return localLinkedList;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */