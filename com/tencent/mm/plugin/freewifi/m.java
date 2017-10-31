package com.tencent.mm.plugin.freewifi;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ao.b;
import com.tencent.mm.ao.b.a;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.b;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.protocal.c.dy;
import com.tencent.mm.protocal.c.pf;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindmobile.BindMContactUI;
import com.tencent.mm.x.ap;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.NetworkInterface;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public final class m
{
  private static SimpleDateFormat jOS;
  
  static
  {
    GMTrace.i(7153402249216L, 53297);
    jOS = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
    GMTrace.o(7153402249216L, 53297);
  }
  
  public static void A(Intent paramIntent)
  {
    GMTrace.i(7149509935104L, 53268);
    if (xJ(paramIntent.getStringExtra("free_wifi_sessionkey"))) {
      d(paramIntent, azF());
    }
    GMTrace.o(7149509935104L, 53268);
  }
  
  public static String B(Intent paramIntent)
  {
    GMTrace.i(7149912588288L, 53271);
    paramIntent = xL(paramIntent.getStringExtra("free_wifi_sessionkey"));
    GMTrace.o(7149912588288L, 53271);
    return paramIntent;
  }
  
  public static int C(Intent paramIntent)
  {
    GMTrace.i(7150046806016L, 53272);
    int i = paramIntent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", 0) + 1;
    paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", i);
    GMTrace.o(7150046806016L, 53272);
    return i;
  }
  
  public static int D(Intent paramIntent)
  {
    GMTrace.i(7150181023744L, 53273);
    int i = paramIntent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    GMTrace.o(7150181023744L, 53273);
    return i;
  }
  
  public static int E(Intent paramIntent)
  {
    GMTrace.i(7150315241472L, 53274);
    int i = paramIntent.getIntExtra("free_wifi_channel_id", 0);
    GMTrace.o(7150315241472L, 53274);
    return i;
  }
  
  public static String F(Intent paramIntent)
  {
    GMTrace.i(7150449459200L, 53275);
    paramIntent = paramIntent.getStringExtra("free_wifi_ap_key");
    GMTrace.o(7150449459200L, 53275);
    return paramIntent;
  }
  
  public static String a(int paramInt1, k.b paramb, int paramInt2)
  {
    GMTrace.i(7151523201024L, 53283);
    w.i("MicroMsg.FreeWifi.Utils", "getUiErrorCode, protocol=%d, stageName=%s, stageCode=%d, errocode=%d", new Object[] { Integer.valueOf(paramInt1), paramb.name, Long.valueOf(paramb.mcK), Integer.valueOf(paramInt2) });
    paramInt2 = Math.abs(paramInt2);
    StringBuilder localStringBuilder = new StringBuilder().append(String.format("%02d", new Object[] { Integer.valueOf(paramInt1) })).append(String.format("%03d", new Object[] { Long.valueOf(paramb.mcK) }));
    if (paramInt2 <= 999) {}
    for (paramb = String.format("%03d", new Object[] { Integer.valueOf(paramInt2) });; paramb = Integer.valueOf(paramInt2))
    {
      paramb = paramb;
      GMTrace.o(7151523201024L, 53283);
      return paramb;
    }
  }
  
  public static String a(String paramString1, LinkedHashMap<String, Class> paramLinkedHashMap, i parami, String paramString2)
  {
    GMTrace.i(7153133813760L, 53295);
    if (paramLinkedHashMap.size() == 0)
    {
      GMTrace.o(7153133813760L, 53295);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1).append("\r\n");
    Object localObject1 = new StringBuilder();
    Object localObject2 = paramLinkedHashMap.entrySet().iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((StringBuilder)localObject1).append((String)((Map.Entry)((Iterator)localObject2).next()).getKey()).append(",");
    }
    if (((StringBuilder)localObject1).length() > 0) {
      ((StringBuilder)localObject1).delete(((StringBuilder)localObject1).length() - 1, ((StringBuilder)localObject1).length());
    }
    localObject1 = "select " + ((StringBuilder)localObject1).toString() + " from " + paramString1;
    localObject2 = paramLinkedHashMap.entrySet().iterator();
    while (((Iterator)localObject2).hasNext()) {
      localStringBuilder.append((String)((Map.Entry)((Iterator)localObject2).next()).getKey()).append("\t");
    }
    localStringBuilder.append("\r\n");
    parami = parami.rawQuery((String)localObject1, new String[0]);
    for (;;)
    {
      int i;
      try
      {
        if (!parami.moveToNext()) {
          break;
        }
        localObject1 = paramLinkedHashMap.entrySet().iterator();
        i = 0;
        if (!((Iterator)localObject1).hasNext()) {
          break label532;
        }
        localObject2 = (Class)((Map.Entry)((Iterator)localObject1).next()).getValue();
        if (localObject2 != String.class) {
          continue;
        }
        localStringBuilder.append(parami.getString(i));
      }
      catch (Exception paramLinkedHashMap)
      {
        w.i(paramString2, "print " + paramString1 + "error." + paramLinkedHashMap.getMessage());
        parami.close();
        GMTrace.o(7153133813760L, 53295);
        return "";
        if (localObject2 != Long.TYPE) {
          break label440;
        }
        localStringBuilder.append(parami.getLong(i));
        continue;
      }
      finally
      {
        parami.close();
      }
      localStringBuilder.append("\t");
      i += 1;
      continue;
      if (localObject2 == Integer.TYPE) {
        localStringBuilder.append(parami.getInt(i));
      } else {
        label440:
        if (localObject2 == Float.TYPE)
        {
          localStringBuilder.append(parami.getFloat(i));
        }
        else if (localObject2 == Double.TYPE)
        {
          localStringBuilder.append(parami.getDouble(i));
        }
        else
        {
          w.e(paramString2, "unkonwn type " + ((Class)localObject2).toString());
          localStringBuilder.append(parami.getString(i));
          continue;
          label532:
          localStringBuilder.append("\r\n");
        }
      }
    }
    w.i(paramString2, localStringBuilder.toString());
    paramLinkedHashMap = localStringBuilder.toString();
    parami.close();
    GMTrace.o(7153133813760L, 53295);
    return paramLinkedHashMap;
  }
  
  public static void a(final Intent paramIntent, final String paramString1, final int paramInt1, final int paramInt2, final a parama, String paramString2)
  {
    GMTrace.i(7151791636480L, 53285);
    j.aAh().azR().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7266279358464L, 54138);
        Object localObject = k.azB();
        ((k.a)localObject).ssid = m.xM(this.mcN);
        ((k.a)localObject).bssid = m.xN(this.mcN);
        ((k.a)localObject).fvG = m.xO(this.mcN);
        ((k.a)localObject).fvF = paramString1;
        ((k.a)localObject).mbX = m.B(paramIntent);
        ((k.a)localObject).mbY = paramInt1;
        ((k.a)localObject).mbZ = k.b.mcl.mcK;
        ((k.a)localObject).mca = k.b.mcl.name;
        ((k.a)localObject).fIC = m.E(paramIntent);
        ((k.a)localObject).result = 0;
        ((k.a)localObject).azD().azC();
        localObject = m.xN(this.mcN);
        String str = m.xM(this.mcN);
        int i = com.tencent.mm.plugin.freewifi.model.d.azU();
        w.i(this.mcN, "NetStatusUtil.getNetType(MMApplicationContext.getContext()) = " + am.getNetType(ab.getContext()));
        w.i(this.mcN, "sessionKey=%s, step=%d, method=getBackPageInfoAfterConnectSuccess, desc=it starts net request [apauth.getBackPage]  for backpage info. fullUrl=%s, nowApMac=%s, nowNetworkSSID=%s, rssi=%d", new Object[] { m.B(paramIntent), Integer.valueOf(m.C(paramIntent)), paramString1, localObject, str, Integer.valueOf(i) });
        new a(paramString1, (String)localObject, str, i, paramInt2, m.B(paramIntent)).b(new e()
        {
          public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ac.k paramAnonymous2k)
          {
            GMTrace.i(7148704628736L, 53262);
            w.i(m.2.this.mcN, "sessionKey=%s, step=%d, desc=net request [apauth.getBackPage] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { m.B(m.2.this.val$intent), Integer.valueOf(m.C(m.2.this.val$intent)), Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
            k.a locala = k.azB();
            locala.ssid = m.xM(m.2.this.mcN);
            locala.bssid = m.xN(m.2.this.mcN);
            locala.fvG = m.xO(m.2.this.mcN);
            locala.fvF = m.2.this.mcP;
            locala.mbX = m.B(m.2.this.val$intent);
            locala.mbY = m.D(m.2.this.val$intent);
            locala.mbZ = k.b.mco.mcK;
            locala.mca = k.b.mco.name;
            locala.fIC = m.E(m.2.this.val$intent);
            locala.result = paramAnonymous2Int2;
            locala.kCB = paramAnonymous2String;
            locala.azD().b(m.2.this.val$intent, true).azC();
            m.2.this.mcR.h(paramAnonymous2Int1, paramAnonymous2Int2, paramAnonymous2String, paramAnonymous2k);
            GMTrace.o(7148704628736L, 53262);
          }
        });
        GMTrace.o(7266279358464L, 54138);
      }
    });
    GMTrace.o(7151791636480L, 53285);
  }
  
  public static void a(Intent paramIntent, String paramString1, final int paramInt1, int paramInt2, final FreeWifiFrontPageUI paramFreeWifiFrontPageUI, String paramString2)
  {
    GMTrace.i(7151657418752L, 53284);
    a(paramIntent, paramString1, paramInt1, paramInt2, new a()
    {
      public final void h(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.k paramAnonymousk)
      {
        GMTrace.i(7126827139072L, 53099);
        Object localObject2;
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          if (!(paramAnonymousk instanceof a))
          {
            GMTrace.o(7126827139072L, 53099);
            return;
          }
          paramAnonymousString = ((a)paramAnonymousk).aAs();
          if (paramAnonymousString != null)
          {
            w.i(this.mcN, "backPageInfo appid: %s, nickName: %s, userName: %s, finishActionCode: %d, finishUrl: %s, signature: %s, qingHuaiPageUrl: %s", new Object[] { paramAnonymousString.mGI, paramAnonymousString.jYc, paramAnonymousString.jWW, Integer.valueOf(paramAnonymousString.txV), paramAnonymousString.txW, paramAnonymousString.huM, paramAnonymousString.txX });
            paramAnonymousk = paramFreeWifiFrontPageUI;
            localObject1 = FreeWifiFrontPageUI.d.mhf;
            localObject2 = new FreeWifiFrontPageUI.b();
            ((FreeWifiFrontPageUI.b)localObject2).mhb = paramAnonymousString;
            paramAnonymousk.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
            GMTrace.o(7126827139072L, 53099);
            return;
          }
          w.i(this.mcN, "backPageInfo is null");
          paramAnonymousString = paramFreeWifiFrontPageUI;
          paramAnonymousk = FreeWifiFrontPageUI.d.mhe;
          localObject1 = new FreeWifiFrontPageUI.a();
          ((FreeWifiFrontPageUI.a)localObject1).mgD = m.a(paramInt1, k.b.mcm, 21);
          paramAnonymousString.a(paramAnonymousk, localObject1);
          GMTrace.o(7126827139072L, 53099);
          return;
        }
        if ((m.cd(paramAnonymousInt1, paramAnonymousInt2)) && (!m.xJ(paramAnonymousString)))
        {
          paramAnonymousk = paramFreeWifiFrontPageUI;
          localObject1 = FreeWifiFrontPageUI.d.mhe;
          localObject2 = new FreeWifiFrontPageUI.a();
          ((FreeWifiFrontPageUI.a)localObject2).text = paramAnonymousString;
          ((FreeWifiFrontPageUI.a)localObject2).mgD = m.a(paramInt1, k.b.mcm, paramAnonymousInt2);
          paramAnonymousk.a((FreeWifiFrontPageUI.d)localObject1, localObject2);
          GMTrace.o(7126827139072L, 53099);
          return;
        }
        paramAnonymousString = paramFreeWifiFrontPageUI;
        paramAnonymousk = FreeWifiFrontPageUI.d.mhe;
        Object localObject1 = new FreeWifiFrontPageUI.a();
        ((FreeWifiFrontPageUI.a)localObject1).mgD = m.a(paramInt1, k.b.mcm, paramAnonymousInt2);
        paramAnonymousString.a(paramAnonymousk, localObject1);
        GMTrace.o(7126827139072L, 53099);
      }
    }, paramString2);
    GMTrace.o(7151657418752L, 53284);
  }
  
  public static boolean azE()
  {
    GMTrace.i(7149375717376L, 53267);
    String str = bg.br(ab.getContext());
    if ((str != null) && (str.toLowerCase().startsWith(ab.getPackageName())))
    {
      GMTrace.o(7149375717376L, 53267);
      return true;
    }
    GMTrace.o(7149375717376L, 53267);
    return false;
  }
  
  public static String azF()
  {
    GMTrace.i(7149644152832L, 53269);
    String str = UUID.randomUUID().toString().replace("-", "");
    GMTrace.o(7149644152832L, 53269);
    return str;
  }
  
  public static String azG()
  {
    GMTrace.i(7151120547840L, 53280);
    long l = System.currentTimeMillis();
    try
    {
      if (NetworkInterface.getNetworkInterfaces() != null)
      {
        Object localObject1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (NetworkInterface)((Iterator)localObject1).next();
          if (((NetworkInterface)localObject2).getName().equalsIgnoreCase("wlan0"))
          {
            localObject1 = ((NetworkInterface)localObject2).getHardwareAddress();
            if (localObject1 == null)
            {
              w.d("MicroMsg.FreeWifi.Utils", "et mobile mac from net time cost :" + (System.currentTimeMillis() - l));
              GMTrace.o(7151120547840L, 53280);
              return "02:00:00:00:00:00";
            }
            localObject2 = new StringBuilder();
            int j = localObject1.length;
            int i = 0;
            while (i < j)
            {
              ((StringBuilder)localObject2).append(String.format("%02X:", new Object[] { Byte.valueOf(localObject1[i]) }));
              i += 1;
            }
            if (((StringBuilder)localObject2).length() > 0) {
              ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
            }
            w.d("MicroMsg.FreeWifi.Utils", "et mobile mac from net time cost :" + (System.currentTimeMillis() - l));
            localObject1 = ((StringBuilder)localObject2).toString();
            GMTrace.o(7151120547840L, 53280);
            return (String)localObject1;
          }
        }
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.FreeWifi.Utils", "get mobile mac from net fail!" + localException);
      w.d("MicroMsg.FreeWifi.Utils", "et mobile mac from net time cost :" + (System.currentTimeMillis() - l));
      GMTrace.o(7151120547840L, 53280);
    }
    return "02:00:00:00:00:00";
  }
  
  public static int azH()
  {
    GMTrace.i(7151925854208L, 53286);
    Object localObject = com.tencent.mm.modelfriend.m.Hl();
    if ((localObject == com.tencent.mm.modelfriend.m.a.hvw) || (localObject == com.tencent.mm.modelfriend.m.a.hvx))
    {
      GMTrace.o(7151925854208L, 53286);
      return 1;
    }
    ap.AS();
    localObject = (String)com.tencent.mm.x.c.xi().get(6, null);
    if (xJ((String)localObject))
    {
      GMTrace.o(7151925854208L, 53286);
      return 1;
    }
    if (((String)localObject).startsWith("+")) {}
    for (localObject = an.Ag((String)localObject); "86".equals(localObject); localObject = "86")
    {
      GMTrace.o(7151925854208L, 53286);
      return 2;
    }
    GMTrace.o(7151925854208L, 53286);
    return 3;
  }
  
  public static boolean azI()
  {
    GMTrace.i(7152865378304L, 53293);
    if (((ConnectivityManager)ab.getContext().getSystemService("connectivity")).getNetworkInfo(1).isConnected())
    {
      w.i("TAG", "isWifiConnected()=true");
      GMTrace.o(7152865378304L, 53293);
      return true;
    }
    w.i("TAG", "isWifiConnected()=false");
    GMTrace.o(7152865378304L, 53293);
    return false;
  }
  
  public static pf azJ()
  {
    GMTrace.i(7152999596032L, 53294);
    pf localpf = new pf();
    localpf.deviceBrand = com.tencent.mm.protocal.d.toQ;
    if ((d.mbD != null) && (!d.mbD.equals(""))) {}
    for (localpf.tKZ = d.mbD;; localpf.tKZ = xO("MicroMsg.FreeWifi.Utils"))
    {
      localpf.deviceModel = com.tencent.mm.protocal.d.toR;
      localpf.osName = com.tencent.mm.protocal.d.toT;
      localpf.osVersion = com.tencent.mm.protocal.d.toU;
      GMTrace.o(7152999596032L, 53294);
      return localpf;
    }
  }
  
  public static boolean cc(int paramInt1, int paramInt2)
  {
    GMTrace.i(7152194289664L, 53288);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      GMTrace.o(7152194289664L, 53288);
      return true;
    }
    GMTrace.o(7152194289664L, 53288);
    return false;
  }
  
  private static boolean cc(String paramString1, String paramString2)
  {
    GMTrace.i(7152731160576L, 53292);
    int i = bg.getInt(paramString1, 0);
    int j = bg.getInt(paramString2, 0);
    if ((i == 0) && (j != 0) && (com.tencent.mm.protocal.d.toX <= j))
    {
      GMTrace.o(7152731160576L, 53292);
      return true;
    }
    if ((i != 0) && (j == 0) && (com.tencent.mm.protocal.d.toX >= i))
    {
      GMTrace.o(7152731160576L, 53292);
      return true;
    }
    if ((i != 0) && (j != 0) && (com.tencent.mm.protocal.d.toX >= i) && (com.tencent.mm.protocal.d.toX <= j))
    {
      GMTrace.o(7152731160576L, 53292);
      return true;
    }
    GMTrace.o(7152731160576L, 53292);
    return false;
  }
  
  public static boolean cd(int paramInt1, int paramInt2)
  {
    GMTrace.i(7152328507392L, 53289);
    if ((paramInt1 == 4) && (paramInt2 <= 35536) && (paramInt2 > 34536))
    {
      GMTrace.o(7152328507392L, 53289);
      return true;
    }
    GMTrace.o(7152328507392L, 53289);
    return false;
  }
  
  public static void cv(Context paramContext)
  {
    GMTrace.i(7152060071936L, 53287);
    Intent localIntent = new Intent(paramContext, BindMContactUI.class);
    localIntent.putExtra("is_bind_for_safe_device", false);
    localIntent.putExtra("is_bind_for_change_mobile", false);
    Object localObject = ((TelephonyManager)paramContext.getSystemService("phone")).getSimCountryIso();
    if (!bg.mZ((String)localObject))
    {
      localObject = b.h(paramContext, (String)localObject, paramContext.getString(R.l.bzo));
      if (localObject != null)
      {
        localIntent.putExtra("country_name", ((b.a)localObject).hDL);
        localIntent.putExtra("couttry_code", ((b.a)localObject).hDK);
      }
    }
    MMWizardActivity.A(paramContext, localIntent);
    GMTrace.o(7152060071936L, 53287);
  }
  
  public static String d(Exception paramException)
  {
    GMTrace.i(7151254765568L, 53281);
    Object localObject = new StringWriter();
    paramException.printStackTrace(new PrintWriter((Writer)localObject));
    localObject = xL(((StringWriter)localObject).toString());
    paramException = (Exception)localObject;
    if (((String)localObject).length() > 1024) {
      paramException = ((String)localObject).substring(0, 1024);
    }
    GMTrace.o(7151254765568L, 53281);
    return paramException;
  }
  
  public static void d(Intent paramIntent, String paramString)
  {
    GMTrace.i(7149778370560L, 53270);
    paramIntent.putExtra("free_wifi_sessionkey", paramString);
    paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", 0);
    GMTrace.o(7149778370560L, 53270);
  }
  
  public static String e(Exception paramException)
  {
    GMTrace.i(7151388983296L, 53282);
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    paramException = xL(localStringWriter.toString());
    GMTrace.o(7151388983296L, 53282);
    return paramException;
  }
  
  public static int f(Exception paramException)
  {
    GMTrace.i(7152462725120L, 53290);
    if ((paramException instanceof SocketTimeoutException))
    {
      paramException = e(paramException);
      if (paramException.indexOf(".read") != -1)
      {
        GMTrace.o(7152462725120L, 53290);
        return 105;
      }
      if (paramException.indexOf(".connect") != -1)
      {
        GMTrace.o(7152462725120L, 53290);
        return 104;
      }
      GMTrace.o(7152462725120L, 53290);
      return 101;
    }
    if ((paramException instanceof ConnectException))
    {
      GMTrace.o(7152462725120L, 53290);
      return 106;
    }
    if ((paramException instanceof UnknownHostException))
    {
      GMTrace.o(7152462725120L, 53290);
      return 102;
    }
    GMTrace.o(7152462725120L, 53290);
    return 101;
  }
  
  public static boolean i(Map<String, String> paramMap, String paramString)
  {
    GMTrace.i(7152596942848L, 53291);
    w.i(paramString, "CLIENT_VERSION=" + com.tencent.mm.protocal.d.toX);
    String str1 = (String)paramMap.get(".sysmsg.apply_versions.version_desc.$minInclude");
    String str2 = (String)paramMap.get(".sysmsg.apply_versions.version_desc.$maxInclude");
    w.i(paramString, "checkMsgPushedVersion. min0=%s,max0=%s", new Object[] { str1, str2 });
    if ((xJ(str1)) && (xJ(str2)))
    {
      GMTrace.o(7152596942848L, 53291);
      return false;
    }
    if (cc(str1, str2))
    {
      GMTrace.o(7152596942848L, 53291);
      return true;
    }
    int i = 1;
    for (;;)
    {
      str1 = (String)paramMap.get(".sysmsg.apply_versions.version_desc#" + i + ".$minInclude");
      str2 = (String)paramMap.get(".sysmsg.apply_versions.version_desc#" + i + ".$maxInclude");
      w.i(paramString, "checkMsgPushedVersion. min" + i + "=%s,max" + i + "=%s", new Object[] { str1, str2 });
      if ((xJ(str1)) && (xJ(str2))) {
        break;
      }
      if (cc(str1, str2))
      {
        GMTrace.o(7152596942848L, 53291);
        return true;
      }
      i += 1;
    }
    GMTrace.o(7152596942848L, 53291);
    return false;
  }
  
  public static boolean xJ(String paramString)
  {
    GMTrace.i(7149107281920L, 53265);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(7149107281920L, 53265);
      return true;
    }
    GMTrace.o(7149107281920L, 53265);
    return false;
  }
  
  public static String xK(String paramString)
  {
    GMTrace.i(7149241499648L, 53266);
    if (xJ(paramString))
    {
      GMTrace.o(7149241499648L, 53266);
      return "";
    }
    String str = paramString;
    if (paramString.startsWith("\""))
    {
      str = paramString;
      if (paramString.endsWith("\"")) {
        str = paramString.substring(1, paramString.length() - 1);
      }
    }
    GMTrace.o(7149241499648L, 53266);
    return str;
  }
  
  public static String xL(String paramString)
  {
    GMTrace.i(7150583676928L, 53276);
    if (paramString == null)
    {
      GMTrace.o(7150583676928L, 53276);
      return "";
    }
    GMTrace.o(7150583676928L, 53276);
    return paramString;
  }
  
  public static String xM(String paramString)
  {
    GMTrace.i(7150717894656L, 53277);
    if (!azI())
    {
      w.i(paramString, "wifi not connected. getConnectedWifiSsid() is empty");
      GMTrace.o(7150717894656L, 53277);
      return "";
    }
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      GMTrace.o(7150717894656L, 53277);
      return "";
    }
    localObject = ((WifiManager)localObject).getConnectionInfo();
    if (localObject == null)
    {
      GMTrace.o(7150717894656L, 53277);
      return "";
    }
    localObject = ((WifiInfo)localObject).getSSID();
    if (xJ((String)localObject))
    {
      w.i(paramString, "getConnectedWifiSsid() is empty");
      GMTrace.o(7150717894656L, 53277);
      return "";
    }
    w.i(paramString, "getConnectedWifiSsid()=" + xK((String)localObject));
    paramString = xK((String)localObject);
    GMTrace.o(7150717894656L, 53277);
    return paramString;
  }
  
  public static String xN(String paramString)
  {
    GMTrace.i(7150852112384L, 53278);
    if (!azI())
    {
      w.i(paramString, "wifi not connected. getConnectedWifiBssid() is empty");
      GMTrace.o(7150852112384L, 53278);
      return "";
    }
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      GMTrace.o(7150852112384L, 53278);
      return "";
    }
    localObject = ((WifiManager)localObject).getConnectionInfo();
    if (localObject == null)
    {
      GMTrace.o(7150852112384L, 53278);
      return "";
    }
    localObject = xL(((WifiInfo)localObject).getBSSID()).toLowerCase();
    w.i(paramString, "getConnectedWifiBssid()=" + (String)localObject);
    GMTrace.o(7150852112384L, 53278);
    return (String)localObject;
  }
  
  public static String xO(String paramString)
  {
    GMTrace.i(7150986330112L, 53279);
    Object localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      w.e(paramString, "error wifiManager is null!!");
      GMTrace.o(7150986330112L, 53279);
      return "";
    }
    localObject = ((WifiManager)localObject).getConnectionInfo();
    if (localObject == null)
    {
      w.e(paramString, "error wifiInfo is null!!");
      GMTrace.o(7150986330112L, 53279);
      return "";
    }
    String str = ((WifiInfo)localObject).getMacAddress();
    localObject = str;
    if (Build.VERSION.SDK_INT > 22) {
      if (str != null)
      {
        localObject = str;
        if (!str.equals("02:00:00:00:00:00")) {}
      }
      else
      {
        localObject = azG();
      }
    }
    localObject = xL((String)localObject).toLowerCase();
    w.i(paramString, "getConnectedWifiClientMac()=" + (String)localObject);
    GMTrace.o(7150986330112L, 53279);
    return (String)localObject;
  }
  
  public static void xP(String paramString)
  {
    GMTrace.i(7153268031488L, 53296);
    w.i("FreeWifi", paramString);
    GMTrace.o(7153268031488L, 53296);
  }
  
  public static abstract interface a
  {
    public abstract void h(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */