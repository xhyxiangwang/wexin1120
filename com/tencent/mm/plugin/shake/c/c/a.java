package com.tencent.mm.plugin.shake.c.c;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public final class a
{
  private static SimpleDateFormat kAO;
  
  static
  {
    GMTrace.i(6531705733120L, 48665);
    kAO = null;
    GMTrace.o(6531705733120L, 48665);
  }
  
  public static String av(long paramLong)
  {
    GMTrace.i(6531034644480L, 48660);
    paramLong = 1000L * paramLong;
    new GregorianCalendar().setTimeInMillis(paramLong);
    if (kAO == null) {
      kAO = new SimpleDateFormat("yyyy.MM.dd");
    }
    String str = kAO.format(new Date(paramLong));
    GMTrace.o(6531034644480L, 48660);
    return str;
  }
  
  private static boolean bdL()
  {
    GMTrace.i(6529289814016L, 48647);
    ap.AS();
    int i = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uTY, Integer.valueOf(0))).intValue();
    ap.AS();
    int j = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uTZ, Integer.valueOf(0))).intValue();
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time : " + i + " end time : " + j);
    if (i <= 0)
    {
      w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is " + i + " , invalid");
      GMTrace.o(6529289814016L, 48647);
      return false;
    }
    if (j <= 0)
    {
      w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil end time  is " + j + " , invalid");
      GMTrace.o(6529289814016L, 48647);
      return false;
    }
    if (i >= j)
    {
      w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is >= end time, invalid time");
      GMTrace.o(6529289814016L, 48647);
      return false;
    }
    int k = (int)(System.currentTimeMillis() / 1000L);
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time : " + k);
    if ((k >= i) && (k <= j))
    {
      w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is incled in [btime, etime]");
      GMTrace.o(6529289814016L, 48647);
      return true;
    }
    w.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is not incled in [btime, etime]");
    GMTrace.o(6529289814016L, 48647);
    return false;
  }
  
  public static int bdM()
  {
    GMTrace.i(6529424031744L, 48648);
    ap.AS();
    int i = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uUe, Integer.valueOf(0))).intValue();
    GMTrace.o(6529424031744L, 48648);
    return i;
  }
  
  public static String bdN()
  {
    GMTrace.i(6529558249472L, 48649);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uUd, "");
    GMTrace.o(6529558249472L, 48649);
    return str;
  }
  
  public static String bdO()
  {
    GMTrace.i(6529692467200L, 48650);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uUa, "");
    GMTrace.o(6529692467200L, 48650);
    return str;
  }
  
  public static String bdP()
  {
    GMTrace.i(6529826684928L, 48651);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uUg, "");
    GMTrace.o(6529826684928L, 48651);
    return str;
  }
  
  public static String bdQ()
  {
    GMTrace.i(6529960902656L, 48652);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uUf, "");
    GMTrace.o(6529960902656L, 48652);
    return str;
  }
  
  public static String bdR()
  {
    GMTrace.i(6530095120384L, 48653);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uUj, "");
    GMTrace.o(6530095120384L, 48653);
    return str;
  }
  
  public static String bdS()
  {
    GMTrace.i(6530229338112L, 48654);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uUi, "");
    GMTrace.o(6530229338112L, 48654);
    return str;
  }
  
  public static int bdT()
  {
    GMTrace.i(6530497773568L, 48656);
    ap.AS();
    int i = com.tencent.mm.x.c.wy();
    int j = (int)(System.currentTimeMillis() % 10L);
    i = (new Random(i).nextInt(10) + j) % 10;
    w.i("MicroMsg.ShakeCardUtil", "genShakeCardFrequencyLevel retRand:" + i);
    GMTrace.o(6530497773568L, 48656);
    return i;
  }
  
  public static boolean bdU()
  {
    GMTrace.i(6531303079936L, 48662);
    if ((bdr()) && (v.bMM()))
    {
      GMTrace.o(6531303079936L, 48662);
      return true;
    }
    GMTrace.o(6531303079936L, 48662);
    return false;
  }
  
  public static void bdq()
  {
    GMTrace.i(6529021378560L, 48645);
    w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance()");
    if (!bdr())
    {
      w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is not open");
      if (bdL())
      {
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uTX, Boolean.valueOf(true));
        w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() open shake card entrance");
        GMTrace.o(6529021378560L, 48645);
        return;
      }
      w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time");
      GMTrace.o(6529021378560L, 48645);
      return;
    }
    w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is open");
    if (!bdL())
    {
      w.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time, close card entrance");
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.uTX, Boolean.valueOf(false));
    }
    GMTrace.o(6529021378560L, 48645);
  }
  
  public static boolean bdr()
  {
    GMTrace.i(6529155596288L, 48646);
    if (!ap.AV())
    {
      w.e("MicroMsg.ShakeCardUtil", "acc is not ready");
      GMTrace.o(6529155596288L, 48646);
      return false;
    }
    ap.AS();
    Object localObject = com.tencent.mm.x.c.xi().get(w.a.uTX, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      GMTrace.o(6529155596288L, 48646);
      return bool;
    }
  }
  
  public static void bds()
  {
    GMTrace.i(6531437297664L, 48663);
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil setShakeCardEntranceData()");
    int i = (int)(System.currentTimeMillis() / 1000L);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uTY, Integer.valueOf(i));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uTZ, Integer.valueOf(86400 + i));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUa, "");
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUe, Integer.valueOf(0));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUb, Integer.valueOf(1));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUc, Integer.valueOf(6));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUd, "");
    com.tencent.mm.s.c.vP().l(262154, true);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUf, String.valueOf(i));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUg, "hello");
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUh, "shake card");
    GMTrace.o(6531437297664L, 48663);
  }
  
  public static void bdt()
  {
    GMTrace.i(6531571515392L, 48664);
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil clearShakeCardEntranceData()");
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uTY, Integer.valueOf(0));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uTZ, Integer.valueOf(0));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUa, "");
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUe, Integer.valueOf(0));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUb, Integer.valueOf(0));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUc, Integer.valueOf(0));
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUd, "");
    com.tencent.mm.s.c.vP().l(262154, false);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUf, "");
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUg, "");
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uUh, "");
    GMTrace.o(6531571515392L, 48664);
  }
  
  public static void q(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(6531168862208L, 48661);
    w.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil doCardDetailUI()");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_card_id", paramString1);
    localIntent.putExtra("key_card_ext", paramString2);
    localIntent.putExtra("key_from_scene", 15);
    d.b(paramContext, "card", ".ui.CardDetailUI", localIntent);
    GMTrace.o(6531168862208L, 48661);
  }
  
  public static int tA(int paramInt)
  {
    GMTrace.i(6530766209024L, 48658);
    switch (paramInt)
    {
    default: 
      GMTrace.o(6530766209024L, 48658);
      return 10;
    case 0: 
      GMTrace.o(6530766209024L, 48658);
      return 10;
    case 1: 
      GMTrace.o(6530766209024L, 48658);
      return 20;
    case 2: 
      GMTrace.o(6530766209024L, 48658);
      return 30;
    case 3: 
      GMTrace.o(6530766209024L, 48658);
      return 60;
    case 4: 
      GMTrace.o(6530766209024L, 48658);
      return 90;
    case 5: 
      GMTrace.o(6530766209024L, 48658);
      return 120;
    case 6: 
      GMTrace.o(6530766209024L, 48658);
      return 150;
    case 7: 
      GMTrace.o(6530766209024L, 48658);
      return 180;
    case 8: 
      GMTrace.o(6530766209024L, 48658);
      return 240;
    }
    GMTrace.o(6530766209024L, 48658);
    return 300;
  }
  
  public static boolean ty(int paramInt)
  {
    GMTrace.i(6530363555840L, 48655);
    if ((paramInt >= 0) && (paramInt <= 5))
    {
      GMTrace.o(6530363555840L, 48655);
      return true;
    }
    GMTrace.o(6530363555840L, 48655);
    return false;
  }
  
  public static int tz(int paramInt)
  {
    GMTrace.i(6530631991296L, 48657);
    switch (paramInt)
    {
    default: 
      GMTrace.o(6530631991296L, 48657);
      return 0;
    case 0: 
      GMTrace.o(6530631991296L, 48657);
      return 0;
    case 1: 
      GMTrace.o(6530631991296L, 48657);
      return 10;
    case 2: 
      GMTrace.o(6530631991296L, 48657);
      return 30;
    case 3: 
      GMTrace.o(6530631991296L, 48657);
      return 60;
    case 4: 
      GMTrace.o(6530631991296L, 48657);
      return 120;
    }
    GMTrace.o(6530631991296L, 48657);
    return 240;
  }
  
  public static int uk(String paramString)
  {
    GMTrace.i(6530900426752L, 48659);
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      w.e("MicroMsg.ShakeCardUtil", "string format error");
      GMTrace.o(6530900426752L, 48659);
      return i;
    }
    try
    {
      paramString = paramString.substring(1).toUpperCase();
      int j = Color.argb(255, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
      GMTrace.o(6530900426752L, 48659);
      return j;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.ShakeCardUtil", paramString.toString());
      GMTrace.o(6530900426752L, 48659);
    }
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/c/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */