package com.tencent.mm.plugin.freewifi.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class a
{
  public String bssid;
  public String mdo;
  public String mdp;
  public long mdq;
  public String mdr;
  public long mds;
  public String ssid;
  public String type;
  public long uin;
  
  private a()
  {
    GMTrace.i(7127498227712L, 53104);
    GMTrace.o(7127498227712L, 53104);
  }
  
  public static a xQ(String paramString)
  {
    GMTrace.i(7127632445440L, 53105);
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "It starts to parse msgContent for FreeWifiSchemaMsg. msgContent=%s", new Object[] { paramString });
    if (m.xJ(paramString))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "msgCoentent is empty. return.");
      GMTrace.o(7127632445440L, 53105);
      return null;
    }
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Shorten msgContent into one line. msgContent=%s", new Object[] { paramString });
    paramString = bh.p(paramString, "sysmsg");
    if ((paramString == null) || (paramString.size() == 0))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Parsing xml failed");
      GMTrace.o(7127632445440L, 53105);
      return null;
    }
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "Parsed values = " + paramString.toString());
    if (!"freewifi".equalsIgnoreCase((String)paramString.get(".sysmsg.$type")))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "sysmsg type is not freewifi. return.");
      GMTrace.o(7127632445440L, 53105);
      return null;
    }
    a locala = new a();
    locala.type = ((String)paramString.get(".sysmsg.type"));
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.type=" + locala.type);
    if (!"schemamsg".equals(locala.type))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.type is not schemamsg. return.");
      GMTrace.o(7127632445440L, 53105);
      return null;
    }
    boolean bool = m.i(paramString, "MicroMsg.FreeWifi.FreeWifiSchemaMsg");
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "checkMsgPushedVersion=" + bool);
    if (!bool)
    {
      w.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "version not matched. return.");
      GMTrace.o(7127632445440L, 53105);
      return null;
    }
    locala.uin = bg.getLong((String)paramString.get(".sysmsg.uin"), 0L);
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.uin=" + locala.uin);
    locala.ssid = ((String)paramString.get(".sysmsg.schemamsg.ssid"));
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.ssid=" + locala.ssid);
    if (m.xJ(locala.ssid))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.ssid is empty. return.");
      GMTrace.o(7127632445440L, 53105);
      return null;
    }
    locala.bssid = m.xL((String)paramString.get(".sysmsg.schemamsg.bssid"));
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.bssid=" + locala.bssid);
    locala.mdo = ((String)paramString.get(".sysmsg.schemamsg.mobilemac"));
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mobilemac=" + locala.mdo);
    if (m.xJ(locala.mdo))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.mobilemac is empty. return.");
      GMTrace.o(7127632445440L, 53105);
      return null;
    }
    locala.mdp = ((String)paramString.get(".sysmsg.schemamsg.mpappid"));
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mpappid=" + locala.mdp);
    locala.mdq = bg.getLong((String)paramString.get(".sysmsg.schemamsg.mpshopid"), 0L);
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.mpshopid=" + locala.mdq);
    locala.mdr = ((String)paramString.get(".sysmsg.schemamsg.schemaurl"));
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schemaMsg.schemaurl=" + locala.mdr);
    if (m.xJ(locala.mdr))
    {
      w.e("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "scemaMsg.schemaurl is empty. return.");
      GMTrace.o(7127632445440L, 53105);
      return null;
    }
    locala.mds = bg.getLong((String)paramString.get(".sysmsg.schemamsg.expiredseconds"), 0L);
    w.i("MicroMsg.FreeWifi.FreeWifiSchemaMsg", "schema.expiredseconds=" + locala.mds);
    GMTrace.o(7127632445440L, 53105);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */