package com.tencent.mm.plugin.shake.e;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.shake.d.a.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.w.f.a;
import java.util.LinkedList;
import java.util.Map;

public final class c
{
  public static a FG(String paramString)
  {
    GMTrace.i(6613846982656L, 49277);
    if (paramString == null)
    {
      GMTrace.o(6613846982656L, 49277);
      return null;
    }
    Map localMap = bh.p(paramString, "tv");
    if (localMap == null)
    {
      GMTrace.o(6613846982656L, 49277);
      return null;
    }
    a locala = new a();
    locala.field_id = bg.mY((String)localMap.get("" + ".tv.id"));
    locala.field_topic = bg.mY((String)localMap.get("" + ".tv.topic"));
    locala.field_title = bg.mY((String)localMap.get("" + ".tv.title"));
    locala.field_subtitle = bg.mY((String)localMap.get("" + ".tv.subtitle"));
    locala.field_thumburl = bg.mY((String)localMap.get("" + ".tv.thumburl"));
    locala.field_shareurl = bg.mY((String)localMap.get("" + ".tv.shareurl"));
    locala.field_playurl = bg.mY((String)localMap.get("" + ".tv.playurl"));
    locala.field_playstatid = bg.mY((String)localMap.get("" + ".tv.playurl$statid"));
    locala.field_source = bg.mY((String)localMap.get("" + ".tv.source"));
    locala.plh = a.j(localMap, "" + ".tv");
    locala.field_xml = paramString;
    GMTrace.o(6613846982656L, 49277);
    return locala;
  }
  
  public static String a(Context paramContext, a parama)
  {
    GMTrace.i(6614115418112L, 49279);
    f.a locala = new f.a();
    locala.title = parama.field_title;
    if (!bg.mZ(parama.field_topic)) {}
    for (locala.description = parama.field_topic;; locala.description = parama.field_subtitle)
    {
      locala.type = 20;
      locala.url = parama.field_shareurl;
      locala.action = "";
      if (k.bdu())
      {
        locala.appName = paramContext.getString(R.l.eEd);
        locala.appId = "wxaf060266bfa9a35c";
      }
      locala.thumburl = parama.field_thumburl;
      locala.hbo = b(parama);
      paramContext = f.a.a(locala, null, null);
      GMTrace.o(6614115418112L, 49279);
      return paramContext;
    }
  }
  
  public static String b(a parama)
  {
    GMTrace.i(6613981200384L, 49278);
    StringBuilder localStringBuilder = new StringBuilder(256);
    localStringBuilder.append("<tv>");
    if (!bg.mZ(parama.field_id)) {
      localStringBuilder.append("<id>" + bg.RD(parama.field_id) + "</id>");
    }
    localStringBuilder.append("<title>" + bg.RD(parama.field_title) + "</title>");
    localStringBuilder.append("<subtitle>" + bg.RD(parama.field_subtitle) + "</subtitle>");
    localStringBuilder.append("<topic>" + bg.RD(parama.field_topic) + "</topic>");
    localStringBuilder.append("<thumburl>" + bg.RD(parama.field_thumburl) + "</thumburl>");
    localStringBuilder.append("<shareurl>" + bg.RD(parama.field_shareurl) + "</shareurl>");
    if (!bg.mZ(parama.field_playstatid)) {
      localStringBuilder.append("<playurl statid=\"" + parama.field_playstatid + "\">" + bg.RD(parama.field_playurl) + "</playurl>");
    }
    for (;;)
    {
      localStringBuilder.append("<source>" + bg.RD(parama.field_source) + "</source>");
      localStringBuilder.append("</tv>");
      parama = localStringBuilder.toString();
      GMTrace.o(6613981200384L, 49278);
      return parama;
      localStringBuilder.append("<playurl>" + bg.RD(parama.field_playurl) + "</playurl>");
    }
  }
  
  public static final class a
  {
    public String field_id;
    public String field_playstatid;
    public String field_playurl;
    public String field_shareurl;
    public String field_source;
    public String field_subtitle;
    public String field_thumburl;
    public String field_title;
    public String field_topic;
    public String field_xml;
    public LinkedList<a> plh;
    
    public a()
    {
      GMTrace.i(6614652289024L, 49283);
      GMTrace.o(6614652289024L, 49283);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */