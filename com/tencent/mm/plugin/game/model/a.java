package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class a
{
  private static String TAG;
  
  static
  {
    GMTrace.i(12615258472448L, 93991);
    TAG = "MicroMsg.GameABTestStrategy";
    GMTrace.o(12615258472448L, 93991);
  }
  
  public static a aDW()
  {
    GMTrace.i(12614721601536L, 93987);
    a locala = new a();
    com.tencent.mm.storage.c localc = com.tencent.mm.x.c.c.Cu().em("100001");
    if (!localc.isValid())
    {
      w.e(TAG, "getIndexABTestInfo is timeout,startTime: %d, endTime: %d", new Object[] { Long.valueOf(localc.field_startTime), Long.valueOf(localc.field_endTime) });
      GMTrace.o(12614721601536L, 93987);
      return locala;
    }
    Object localObject = localc.bPn();
    locala.fJg = bg.getInt((String)((Map)localObject).get("game_homepage_jump"), 0);
    String str = (String)((Map)localObject).get("game_homepage_url");
    localObject = str;
    if (str == null) {
      localObject = "";
    }
    locala.url = ((String)localObject);
    w.i(TAG, "getIndexABTestInfo success, layerId = %s, flag = %d, url = %s", new Object[] { localc.field_layerId, Integer.valueOf(locala.fJg), locala.url });
    GMTrace.o(12614721601536L, 93987);
    return locala;
  }
  
  public static a aDX()
  {
    GMTrace.i(12614990036992L, 93989);
    a locala = new a();
    Object localObject = com.tencent.mm.x.c.c.Cu().em("100003");
    if (!((com.tencent.mm.storage.c)localObject).isValid())
    {
      w.e(TAG, "getLibraryABTestInfo is timeout,startTime: %d, endTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.storage.c)localObject).field_startTime), Long.valueOf(((com.tencent.mm.storage.c)localObject).field_endTime) });
      GMTrace.o(12614990036992L, 93989);
      return locala;
    }
    w.i(TAG, "getLibraryABTestInfo success, layerId = %s", new Object[] { ((com.tencent.mm.storage.c)localObject).field_layerId });
    localObject = ((com.tencent.mm.storage.c)localObject).bPn();
    locala.fJg = bg.getInt((String)((Map)localObject).get("game_library_jump"), 0);
    String str = (String)((Map)localObject).get("game_library_url");
    localObject = str;
    if (str == null) {
      localObject = "";
    }
    locala.url = ((String)localObject);
    GMTrace.o(12614990036992L, 93989);
    return locala;
  }
  
  public static a aDY()
  {
    GMTrace.i(12615124254720L, 93990);
    a locala = new a();
    Object localObject = com.tencent.mm.x.c.c.Cu().em("100022");
    if (!((com.tencent.mm.storage.c)localObject).isValid())
    {
      GMTrace.o(12615124254720L, 93990);
      return locala;
    }
    localObject = ((com.tencent.mm.storage.c)localObject).bPn();
    locala.fJg = bg.getInt((String)((Map)localObject).get("game_message_jump"), 0);
    String str = (String)((Map)localObject).get("game_message_url");
    localObject = str;
    if (str == null) {
      localObject = "";
    }
    locala.url = ((String)localObject);
    GMTrace.o(12615124254720L, 93990);
    return locala;
  }
  
  public static a za(String paramString)
  {
    GMTrace.i(12614855819264L, 93988);
    a locala = new a();
    if (bg.mZ(paramString))
    {
      w.e(TAG, "appid is null");
      GMTrace.o(12614855819264L, 93988);
      return locala;
    }
    Object localObject = com.tencent.mm.x.c.c.Cu().em("100002");
    if (!((com.tencent.mm.storage.c)localObject).isValid())
    {
      w.e(TAG, "getDetailABTestInfo is timeout,startTime: %d, endTime: %d", new Object[] { Long.valueOf(((com.tencent.mm.storage.c)localObject).field_startTime), Long.valueOf(((com.tencent.mm.storage.c)localObject).field_endTime) });
      GMTrace.o(12614855819264L, 93988);
      return locala;
    }
    w.i(TAG, "getDetailABTestInfo success, layerId = %s", new Object[] { ((com.tencent.mm.storage.c)localObject).field_layerId });
    localObject = ((com.tencent.mm.storage.c)localObject).bPn();
    locala.fJg = bg.getInt((String)((Map)localObject).get("game_detail_jump"), 0);
    localObject = (String)((Map)localObject).get("game_detail_url");
    if (localObject == null) {}
    for (paramString = "";; paramString = (String)localObject + paramString)
    {
      locala.url = paramString;
      GMTrace.o(12614855819264L, 93988);
      return locala;
    }
  }
  
  public static final class a
  {
    public int fJg;
    public String url;
    
    public a()
    {
      GMTrace.i(12613647859712L, 93979);
      this.fJg = 0;
      this.url = "";
      GMTrace.o(12613647859712L, 93979);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */