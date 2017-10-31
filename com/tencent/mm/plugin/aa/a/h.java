package com.tencent.mm.plugin.aa.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.protocal.c.y;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.aa;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.m;
import com.tencent.mm.x.o;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class h
{
  public static String PJ()
  {
    GMTrace.i(17092761878528L, 127351);
    ap.AS();
    String str = bg.mY((String)com.tencent.mm.x.c.xi().get(w.a.vcJ, null));
    GMTrace.o(17092761878528L, 127351);
    return str;
  }
  
  private static void a(String paramString1, String paramString2, com.tencent.mm.plugin.aa.a.b.a parama, String paramString3)
  {
    try
    {
      GMTrace.i(5584531226624L, 41608);
      au localau = new au();
      localau.dC(0);
      localau.cW(paramString2);
      localau.dB(3);
      localau.setContent(paramString1);
      localau.D(ay.i(paramString2, System.currentTimeMillis() / 1000L));
      localau.setType(10000);
      ap.AS();
      long l = com.tencent.mm.x.c.yN().K(localau);
      w.i("MicroMsg.AAUtil", "insertPaySysMsg, inserted msgId: %s", new Object[] { Long.valueOf(l) });
      paramString1 = parama;
      if (parama == null) {
        paramString1 = new com.tencent.mm.plugin.aa.a.b.a();
      }
      if (l > 0L)
      {
        paramString1.field_payMsgId = paramString3;
        paramString1.field_chatroom = paramString2;
        paramString1.field_insertmsg = true;
        paramString1.field_msgId = l;
        com.tencent.mm.plugin.aa.b.PA().a(paramString1);
      }
      GMTrace.o(5584531226624L, 41608);
      return;
    }
    finally {}
  }
  
  public static void a(String paramString, boolean paramBoolean, long paramLong)
  {
    try
    {
      GMTrace.i(5583860137984L, 41603);
      if (!bg.mZ(paramString))
      {
        w.i("MicroMsg.AAUtil", "insertOrUpdateAARecord, billNo: %s, insertMsg: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
        com.tencent.mm.plugin.aa.a.b.c localc = new com.tencent.mm.plugin.aa.a.b.c();
        localc.field_billNo = paramString;
        localc.field_insertmsg = paramBoolean;
        localc.field_localMsgId = paramLong;
        com.tencent.mm.plugin.aa.b.Pz().b(localc);
      }
      GMTrace.o(5583860137984L, 41603);
      return;
    }
    finally {}
  }
  
  public static boolean a(Activity paramActivity, y paramy)
  {
    GMTrace.i(5584933879808L, 41611);
    boolean bool;
    if (paramy.tsl == 1)
    {
      w.i("MicroMsg.AAUtil", "need realname verify");
      Bundle localBundle = new Bundle();
      localBundle.putString("realname_verify_process_jump_activity", ".ui.LaunchAAUI");
      localBundle.putString("realname_verify_process_jump_plugin", "aa");
      String str = paramy.nxi;
      str = paramy.nxj;
      paramy = paramy.nxk;
      bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, localBundle, 0);
      GMTrace.o(5584933879808L, 41611);
      return bool;
    }
    if (paramy.tsl == 2)
    {
      w.i("MicroMsg.AAUtil", "need upload credit");
      bool = com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(paramActivity, paramy.nxi, paramy.nxl, paramy.nxj, paramy.nxk, false, null);
      GMTrace.o(5584933879808L, 41611);
      return bool;
    }
    w.i("MicroMsg.AAUtil", "realnameGuideFlag =  " + paramy.tsl);
    GMTrace.o(5584933879808L, 41611);
    return false;
  }
  
  /* Error */
  private static void as(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc2_w 251
    //   8: ldc -3
    //   10: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: aload_0
    //   14: invokestatic 158	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   17: ifne +435 -> 452
    //   20: aload_0
    //   21: invokestatic 259	com/tencent/mm/w/f$a:eC	(Ljava/lang/String;)Lcom/tencent/mm/w/f$a;
    //   24: astore 5
    //   26: aload 5
    //   28: ifnull +424 -> 452
    //   31: aload 5
    //   33: getfield 262	com/tencent/mm/w/f$a:hcD	Ljava/lang/String;
    //   36: invokestatic 158	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   39: ifne +413 -> 452
    //   42: invokestatic 179	com/tencent/mm/plugin/aa/b:Pz	()Lcom/tencent/mm/plugin/aa/a/b/d;
    //   45: aload 5
    //   47: getfield 262	com/tencent/mm/w/f$a:hcD	Ljava/lang/String;
    //   50: invokevirtual 266	com/tencent/mm/plugin/aa/a/b/d:ni	(Ljava/lang/String;)Lcom/tencent/mm/plugin/aa/a/b/c;
    //   53: astore 6
    //   55: aload 5
    //   57: getfield 262	com/tencent/mm/w/f$a:hcD	Ljava/lang/String;
    //   60: astore 7
    //   62: aload 6
    //   64: ifnull +87 -> 151
    //   67: aload 6
    //   69: getfield 172	com/tencent/mm/plugin/aa/a/b/c:field_insertmsg	Z
    //   72: ifeq +79 -> 151
    //   75: aload 6
    //   77: ifnull +79 -> 156
    //   80: aload 6
    //   82: getfield 175	com/tencent/mm/plugin/aa/a/b/c:field_localMsgId	J
    //   85: lstore_3
    //   86: ldc 108
    //   88: ldc_w 268
    //   91: iconst_5
    //   92: anewarray 4	java/lang/Object
    //   95: dup
    //   96: iconst_0
    //   97: aload 7
    //   99: aastore
    //   100: dup
    //   101: iconst_1
    //   102: aload_1
    //   103: aastore
    //   104: dup
    //   105: iconst_2
    //   106: aload 6
    //   108: aastore
    //   109: dup
    //   110: iconst_3
    //   111: iload_2
    //   112: invokestatic 165	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   115: aastore
    //   116: dup
    //   117: iconst_4
    //   118: lload_3
    //   119: invokestatic 116	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   122: aastore
    //   123: invokestatic 121	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   126: aload 6
    //   128: ifnonnull +33 -> 161
    //   131: ldc 108
    //   133: ldc_w 270
    //   136: invokestatic 273	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: ldc2_w 251
    //   142: ldc -3
    //   144: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   147: ldc 2
    //   149: monitorexit
    //   150: return
    //   151: iconst_0
    //   152: istore_2
    //   153: goto -78 -> 75
    //   156: lconst_0
    //   157: lstore_3
    //   158: goto -72 -> 86
    //   161: aload 6
    //   163: getfield 172	com/tencent/mm/plugin/aa/a/b/c:field_insertmsg	Z
    //   166: ifeq +13 -> 179
    //   169: aload 6
    //   171: getfield 175	com/tencent/mm/plugin/aa/a/b/c:field_localMsgId	J
    //   174: lconst_0
    //   175: lcmp
    //   176: ifgt +276 -> 452
    //   179: new 58	com/tencent/mm/storage/au
    //   182: dup
    //   183: invokespecial 62	com/tencent/mm/storage/au:<init>	()V
    //   186: astore 6
    //   188: aload 6
    //   190: aload_1
    //   191: invokestatic 277	com/tencent/mm/x/ay:gB	(Ljava/lang/String;)J
    //   194: invokevirtual 93	com/tencent/mm/storage/au:D	(J)V
    //   197: aload 6
    //   199: ldc_w 278
    //   202: invokevirtual 96	com/tencent/mm/storage/au:setType	(I)V
    //   205: invokestatic 283	com/tencent/mm/x/m:zF	()Ljava/lang/String;
    //   208: astore 7
    //   210: aload 6
    //   212: new 238	java/lang/StringBuilder
    //   215: dup
    //   216: invokespecial 284	java/lang/StringBuilder:<init>	()V
    //   219: aload 7
    //   221: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: ldc_w 289
    //   227: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: aload_0
    //   231: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: invokevirtual 249	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: invokevirtual 76	com/tencent/mm/storage/au:setContent	(Ljava/lang/String;)V
    //   240: new 238	java/lang/StringBuilder
    //   243: dup
    //   244: invokespecial 284	java/lang/StringBuilder:<init>	()V
    //   247: invokestatic 292	com/tencent/mm/sdk/platformtools/bg:Pp	()J
    //   250: invokevirtual 295	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   253: invokevirtual 249	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   256: invokevirtual 299	java/lang/String:getBytes	()[B
    //   259: invokestatic 305	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   262: astore 7
    //   264: invokestatic 311	com/tencent/mm/an/n:IW	()Lcom/tencent/mm/an/f;
    //   267: aload 7
    //   269: invokevirtual 316	com/tencent/mm/an/f:getFullPath	(Ljava/lang/String;)Ljava/lang/String;
    //   272: astore_0
    //   273: invokestatic 311	com/tencent/mm/an/n:IW	()Lcom/tencent/mm/an/f;
    //   276: pop
    //   277: aload 7
    //   279: invokestatic 319	com/tencent/mm/an/f:jR	(Ljava/lang/String;)Ljava/lang/String;
    //   282: astore 7
    //   284: invokestatic 323	com/tencent/mm/an/n:Ja	()Lcom/tencent/mm/an/a/a;
    //   287: astore 8
    //   289: aload 5
    //   291: getfield 326	com/tencent/mm/w/f$a:hcn	Ljava/lang/String;
    //   294: astore 9
    //   296: new 328	com/tencent/mm/an/a/a/c$a
    //   299: dup
    //   300: invokespecial 329	com/tencent/mm/an/a/a/c$a:<init>	()V
    //   303: astore 10
    //   305: aload 10
    //   307: aload_0
    //   308: putfield 332	com/tencent/mm/an/a/a/c$a:hCR	Ljava/lang/String;
    //   311: aload 10
    //   313: iconst_1
    //   314: putfield 335	com/tencent/mm/an/a/a/c$a:hCP	Z
    //   317: aload 8
    //   319: aload 9
    //   321: aconst_null
    //   322: aload 10
    //   324: invokevirtual 339	com/tencent/mm/an/a/a/c$a:Jk	()Lcom/tencent/mm/an/a/a/c;
    //   327: invokevirtual 344	com/tencent/mm/an/a/a:a	(Ljava/lang/String;Landroid/widget/ImageView;Lcom/tencent/mm/an/a/a/c;)V
    //   330: aload 6
    //   332: aload 7
    //   334: invokevirtual 347	com/tencent/mm/storage/au:cX	(Ljava/lang/String;)V
    //   337: aload 6
    //   339: iconst_1
    //   340: invokevirtual 66	com/tencent/mm/storage/au:dC	(I)V
    //   343: aload 6
    //   345: aload_1
    //   346: invokevirtual 70	com/tencent/mm/storage/au:cW	(Ljava/lang/String;)V
    //   349: aload 6
    //   351: iconst_3
    //   352: invokevirtual 73	com/tencent/mm/storage/au:dB	(I)V
    //   355: aload 6
    //   357: aload 6
    //   359: invokestatic 349	com/tencent/mm/x/ay:i	(Lcom/tencent/mm/storage/au;)J
    //   362: invokevirtual 352	com/tencent/mm/storage/au:B	(J)V
    //   365: ldc 108
    //   367: ldc_w 354
    //   370: invokestatic 200	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: aload 5
    //   375: getfield 262	com/tencent/mm/w/f$a:hcD	Ljava/lang/String;
    //   378: iconst_1
    //   379: aload 6
    //   381: getfield 357	com/tencent/mm/g/b/ce:field_msgId	J
    //   384: invokestatic 359	com/tencent/mm/plugin/aa/a/h:a	(Ljava/lang/String;ZJ)V
    //   387: new 361	com/tencent/mm/g/a/s
    //   390: dup
    //   391: invokespecial 362	com/tencent/mm/g/a/s:<init>	()V
    //   394: astore_0
    //   395: aload_0
    //   396: getfield 366	com/tencent/mm/g/a/s:ftJ	Lcom/tencent/mm/g/a/s$a;
    //   399: aload 6
    //   401: putfield 372	com/tencent/mm/g/a/s$a:ftK	Lcom/tencent/mm/storage/au;
    //   404: aload_0
    //   405: getfield 366	com/tencent/mm/g/a/s:ftJ	Lcom/tencent/mm/g/a/s$a;
    //   408: aload 5
    //   410: putfield 376	com/tencent/mm/g/a/s$a:ftL	Lcom/tencent/mm/w/f$a;
    //   413: getstatic 382	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   416: aload_0
    //   417: invokevirtual 386	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   420: pop
    //   421: new 388	com/tencent/mm/w/f
    //   424: dup
    //   425: invokespecial 389	com/tencent/mm/w/f:<init>	()V
    //   428: astore_0
    //   429: aload 5
    //   431: aload_0
    //   432: invokevirtual 392	com/tencent/mm/w/f$a:a	(Lcom/tencent/mm/w/f;)V
    //   435: aload_0
    //   436: aload 6
    //   438: getfield 357	com/tencent/mm/g/b/ce:field_msgId	J
    //   441: putfield 393	com/tencent/mm/w/f:field_msgId	J
    //   444: invokestatic 399	com/tencent/mm/pluginsdk/model/app/an:bGM	()Lcom/tencent/mm/pluginsdk/model/app/k;
    //   447: aload_0
    //   448: invokevirtual 403	com/tencent/mm/pluginsdk/model/app/k:b	(Lcom/tencent/mm/sdk/e/c;)Z
    //   451: pop
    //   452: ldc2_w 251
    //   455: ldc -3
    //   457: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   460: goto -313 -> 147
    //   463: astore_0
    //   464: ldc 2
    //   466: monitorexit
    //   467: aload_0
    //   468: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	469	0	paramString1	String
    //   0	469	1	paramString2	String
    //   1	152	2	bool	boolean
    //   85	73	3	l	long
    //   24	406	5	locala	f.a
    //   53	384	6	localObject	Object
    //   60	273	7	str1	String
    //   287	31	8	locala1	com.tencent.mm.an.a.a
    //   294	26	9	str2	String
    //   303	20	10	locala2	com.tencent.mm.an.a.a.c.a
    // Exception table:
    //   from	to	target	type
    //   5	26	463	finally
    //   31	62	463	finally
    //   67	75	463	finally
    //   80	86	463	finally
    //   86	126	463	finally
    //   131	147	463	finally
    //   161	179	463	finally
    //   179	452	463	finally
    //   452	460	463	finally
  }
  
  public static void at(String paramString1, String paramString2)
  {
    boolean bool2 = true;
    for (;;)
    {
      Object localObject;
      try
      {
        GMTrace.i(5583994355712L, 41604);
        if (bg.mZ(paramString1)) {
          break label341;
        }
        localObject = f.a.eC(paramString1);
        String str;
        if (localObject != null)
        {
          str = ((f.a)localObject).hcD;
          w.d("MicroMsg.AAUtil", "checkIfInsertAAMsg, billNo: %s, appMsgContent: %s", new Object[] { str, paramString1.trim().replace(" ", "") });
          if ((localObject == null) || (bg.mZ(((f.a)localObject).hcD))) {
            break label341;
          }
          str = ((f.a)localObject).hcD;
          localObject = com.tencent.mm.plugin.aa.b.Pz().ni(str);
          if (localObject != null) {
            break label353;
          }
          bool1 = true;
          if ((localObject == null) || (!((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg)) {
            break label358;
          }
          if (localObject == null) {
            break label363;
          }
          l = ((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId;
          w.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, record==null: %s, billNo: %s, insertMsg: %s, chatroom: %s, localMsgId: %s", new Object[] { Boolean.valueOf(bool1), str, Boolean.valueOf(bool2), paramString2, Long.valueOf(l) });
          if ((localObject != null) && (((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg) && (((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId > 0L))
          {
            ap.AS();
            if (com.tencent.mm.x.c.yN().cI(((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId).field_msgId <= 0L)
            {
              w.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, the oldMsgInfo has deleted, ignore this");
              com.tencent.mm.plugin.aa.b.Pz().a((com.tencent.mm.plugin.aa.a.b.c)localObject, new String[0]);
              GMTrace.o(5583994355712L, 41604);
            }
          }
        }
        else
        {
          str = "";
          continue;
        }
        if ((localObject == null) || (!((com.tencent.mm.plugin.aa.a.b.c)localObject).field_insertmsg) || (((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId <= 0L))
        {
          w.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, insert new aa msg");
          as(paramString1, paramString2);
          GMTrace.o(5583994355712L, 41604);
          continue;
        }
        w.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, update aa msg");
      }
      finally {}
      g(((com.tencent.mm.plugin.aa.a.b.c)localObject).field_localMsgId, paramString1);
      label341:
      GMTrace.o(5583994355712L, 41604);
      continue;
      label353:
      boolean bool1 = false;
      continue;
      label358:
      bool2 = false;
      continue;
      label363:
      long l = 0L;
    }
  }
  
  public static long au(String paramString1, String paramString2)
  {
    GMTrace.i(15032117100544L, 111998);
    try
    {
      double d1 = bg.getDouble(paramString1, 0.0D);
      double d2 = bg.getDouble(paramString2, 0.0D);
      if (d1 == 0.0D) {
        paramString1 = "0";
      }
      paramString1 = new BigDecimal(paramString1);
      if (d2 == 0.0D) {
        paramString2 = "0";
      }
      long l = paramString1.multiply(new BigDecimal(paramString2)).longValue();
      GMTrace.o(15032117100544L, 111998);
      return l;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.AAUtil", paramString1, "", new Object[0]);
      GMTrace.o(15032117100544L, 111998);
    }
    return 0L;
  }
  
  public static double b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    GMTrace.i(5585202315264L, 41613);
    try
    {
      if (bg.getDouble(paramString1.trim(), 0.0D) == 0.0D) {}
      for (paramString1 = "0";; paramString1 = paramString1.trim())
      {
        double d = new BigDecimal(paramString1).divide(new BigDecimal(paramString2.trim()), paramInt1, paramInt2).doubleValue();
        GMTrace.o(5585202315264L, 41613);
        return d;
      }
      return 0.0D;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.AAUtil", paramString1, "", new Object[0]);
      GMTrace.o(5585202315264L, 41613);
    }
  }
  
  /* Error */
  public static void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: ldc 2
    //   5: monitorenter
    //   6: ldc2_w 485
    //   9: ldc_w 487
    //   12: invokestatic 15	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   15: ldc 108
    //   17: ldc_w 489
    //   20: iconst_3
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: aload_0
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: aload_2
    //   31: aastore
    //   32: dup
    //   33: iconst_2
    //   34: aload_3
    //   35: aastore
    //   36: invokestatic 423	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: aload_0
    //   40: invokestatic 158	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   43: ifne +171 -> 214
    //   46: aload_2
    //   47: invokestatic 158	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   50: ifne +164 -> 214
    //   53: aload_3
    //   54: invokestatic 158	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   57: ifne +157 -> 214
    //   60: invokestatic 145	com/tencent/mm/plugin/aa/b:PA	()Lcom/tencent/mm/plugin/aa/a/b/b;
    //   63: aload_3
    //   64: invokevirtual 493	com/tencent/mm/plugin/aa/a/b/b:nh	(Ljava/lang/String;)Lcom/tencent/mm/plugin/aa/a/b/a;
    //   67: astore 6
    //   69: aload 6
    //   71: ifnull +156 -> 227
    //   74: aload 6
    //   76: getfield 135	com/tencent/mm/plugin/aa/a/b/a:field_insertmsg	Z
    //   79: ifeq +148 -> 227
    //   82: ldc 108
    //   84: ldc_w 495
    //   87: iconst_5
    //   88: anewarray 4	java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: aload_0
    //   94: aastore
    //   95: dup
    //   96: iconst_1
    //   97: aload_1
    //   98: aastore
    //   99: dup
    //   100: iconst_2
    //   101: aload_3
    //   102: aastore
    //   103: dup
    //   104: iconst_3
    //   105: aload 6
    //   107: aastore
    //   108: dup
    //   109: iconst_4
    //   110: iload 5
    //   112: invokestatic 165	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   115: aastore
    //   116: invokestatic 121	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aload 6
    //   121: ifnull +11 -> 132
    //   124: aload 6
    //   126: getfield 135	com/tencent/mm/plugin/aa/a/b/a:field_insertmsg	Z
    //   129: ifne +85 -> 214
    //   132: new 238	java/lang/StringBuilder
    //   135: dup
    //   136: ldc_w 497
    //   139: invokespecial 242	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   142: aload_2
    //   143: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: ldc_w 499
    //   149: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload_0
    //   153: invokevirtual 287	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 249	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: astore_2
    //   160: aload 4
    //   162: invokestatic 158	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   165: ifeq +100 -> 265
    //   168: ldc 108
    //   170: ldc_w 501
    //   173: invokestatic 200	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: aload_0
    //   177: invokestatic 283	com/tencent/mm/x/m:zF	()Ljava/lang/String;
    //   180: invokevirtual 505	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   183: ifeq +50 -> 233
    //   186: invokestatic 511	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   189: getstatic 516	com/tencent/mm/R$l:etz	I
    //   192: iconst_1
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: aload_2
    //   199: aastore
    //   200: invokevirtual 522	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   203: astore 4
    //   205: aload 4
    //   207: aload_1
    //   208: aload 6
    //   210: aload_3
    //   211: invokestatic 524	com/tencent/mm/plugin/aa/a/h:a	(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/aa/a/b/a;Ljava/lang/String;)V
    //   214: ldc2_w 485
    //   217: ldc_w 487
    //   220: invokestatic 50	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   223: ldc 2
    //   225: monitorexit
    //   226: return
    //   227: iconst_0
    //   228: istore 5
    //   230: goto -148 -> 82
    //   233: aload_0
    //   234: aload_1
    //   235: invokestatic 530	com/tencent/mm/x/n:E	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   238: astore_0
    //   239: invokestatic 511	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   242: getstatic 533	com/tencent/mm/R$l:etA	I
    //   245: iconst_2
    //   246: anewarray 4	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: aload_0
    //   252: aastore
    //   253: dup
    //   254: iconst_1
    //   255: aload_2
    //   256: aastore
    //   257: invokevirtual 522	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   260: astore 4
    //   262: goto -57 -> 205
    //   265: ldc 108
    //   267: ldc_w 535
    //   270: iconst_1
    //   271: anewarray 4	java/lang/Object
    //   274: dup
    //   275: iconst_0
    //   276: aload 4
    //   278: aastore
    //   279: invokestatic 423	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: goto -77 -> 205
    //   285: astore_0
    //   286: ldc 2
    //   288: monitorexit
    //   289: aload_0
    //   290: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	291	0	paramString1	String
    //   0	291	1	paramString2	String
    //   0	291	2	paramString3	String
    //   0	291	3	paramString4	String
    //   0	291	4	paramString5	String
    //   1	228	5	bool	boolean
    //   67	142	6	locala	com.tencent.mm.plugin.aa.a.b.a
    // Exception table:
    //   from	to	target	type
    //   6	69	285	finally
    //   74	82	285	finally
    //   82	119	285	finally
    //   124	132	285	finally
    //   132	205	285	finally
    //   205	214	285	finally
    //   214	223	285	finally
    //   233	262	285	finally
    //   265	282	285	finally
  }
  
  public static void g(long paramLong, String paramString)
  {
    for (;;)
    {
      Object localObject;
      try
      {
        GMTrace.i(5584665444352L, 41609);
        if ((paramLong <= 0L) || (bg.mZ(paramString))) {
          break label390;
        }
        localObject = f.a.eC(paramString);
        if ((localObject == null) || (bg.mZ(((f.a)localObject).hcD))) {
          break label359;
        }
        w.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgId: %s, billNo: %s", new Object[] { Long.valueOf(paramLong), ((f.a)localObject).hcD });
        com.tencent.mm.plugin.aa.a.b.c localc = com.tencent.mm.plugin.aa.b.Pz().ni(((f.a)localObject).hcD);
        if (localc != null)
        {
          long l = localc.field_localMsgId;
          ap.AS();
          localObject = com.tencent.mm.x.c.yN().cI(l);
          if (((ce)localObject).field_msgId > 0L)
          {
            String str = ay.gz(((ce)localObject).field_content);
            ((au)localObject).setContent(str + ":\n" + paramString);
            ap.AS();
            com.tencent.mm.x.c.yN().a(l, (au)localObject);
            w.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, update success, oldMsgId: %s, billNo: %s", new Object[] { Long.valueOf(l), localc.field_billNo });
            GMTrace.o(5584665444352L, 41609);
            return;
          }
          w.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, cannot find old msg, insert new one, billNo: %s, oldMsgId: %s, newMsgId: %s, needUpdateInfo.msgId: %s", new Object[] { localc.field_billNo, Long.valueOf(localc.field_localMsgId), Long.valueOf(paramLong), Long.valueOf(((ce)localObject).field_msgId) });
          GMTrace.o(5584665444352L, 41609);
          continue;
        }
        paramString = new com.tencent.mm.plugin.aa.a.b.c();
      }
      finally {}
      paramString.field_localMsgId = paramLong;
      paramString.field_billNo = ((f.a)localObject).hcD;
      paramString.field_insertmsg = true;
      com.tencent.mm.plugin.aa.b.Pz().a(paramString);
      w.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, insert new aa record, msgId: %s, billNo: %s", new Object[] { Long.valueOf(paramLong), ((f.a)localObject).hcD });
      GMTrace.o(5584665444352L, 41609);
      continue;
      label359:
      w.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, parse app msg failed, msgId: %s", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(5584665444352L, 41609);
      continue;
      label390:
      w.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgContent is null or msgId invalid, msgId: %s, %s", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(bg.mZ(paramString)) });
    }
  }
  
  public static void h(long paramLong, String paramString)
  {
    GMTrace.i(5584799662080L, 41610);
    w.i("MicroMsg.AAUtil", "do update sys msg, %s, %s", new Object[] { Long.valueOf(paramLong), paramString });
    ap.AS();
    au localau = com.tencent.mm.x.c.yN().cI(paramLong);
    paramString = ne(paramString);
    if (!bg.mZ(paramString)) {
      localau.setContent(paramString);
    }
    ap.AS();
    com.tencent.mm.x.c.yN().a(paramLong, localau);
    GMTrace.o(5584799662080L, 41610);
  }
  
  private static String ne(String paramString)
  {
    GMTrace.i(5585068097536L, 41612);
    paramString = (String)bh.p(paramString, "sysmsg").get(".sysmsg.paymsg.appmsgcontent");
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.AAUtil", "empty appmsgcontent!");
      GMTrace.o(5585068097536L, 41612);
      return "";
    }
    for (;;)
    {
      try
      {
        paramString = URLDecoder.decode(paramString, "UTF-8");
        w.e("MicroMsg.AAUtil", localUnsupportedEncodingException1.getMessage());
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          w.d("MicroMsg.AAUtil", "msgContent: %s", new Object[] { paramString });
          GMTrace.o(5585068097536L, 41612);
          return paramString;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;) {}
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        paramString = "";
      }
    }
  }
  
  public static List<String> nf(String paramString)
  {
    GMTrace.i(5585336532992L, 41614);
    if (bg.mZ(paramString))
    {
      w.i("MicroMsg.AAUtil", "illegal chatroomName");
      paramString = new ArrayList();
      GMTrace.o(5585336532992L, 41614);
      return paramString;
    }
    Object localObject;
    if (!o.dW(paramString))
    {
      localObject = new ArrayList();
      ((List)localObject).add(m.zF());
      ((List)localObject).add(paramString);
      GMTrace.o(5585336532992L, 41614);
      return (List<String>)localObject;
    }
    try
    {
      ap.AS();
      localObject = com.tencent.mm.x.c.yU().gq(paramString);
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = new ArrayList();
      }
      GMTrace.o(5585336532992L, 41614);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.AAUtil", "getChatroomMemberList error! %s", new Object[] { paramString.getMessage() });
      paramString = new ArrayList();
      GMTrace.o(5585336532992L, 41614);
    }
    return paramString;
  }
  
  public static void ng(String paramString)
  {
    GMTrace.i(17092896096256L, 127352);
    Object localObject = PJ();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(",");
    if (!bg.mZ((String)localObject))
    {
      localObject = ((String)localObject).split(",");
      int i = 0;
      int k;
      for (int j = 1; i < localObject.length; j = k)
      {
        String str = localObject[i];
        k = j;
        if (!str.equals(paramString))
        {
          k = j;
          if (j < 5)
          {
            localStringBuilder.append(str);
            localStringBuilder.append(",");
            k = j + 1;
          }
        }
        i += 1;
      }
    }
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    w.d("MicroMsg.AAUtil", "recent group: %s", new Object[] { localStringBuilder.toString() });
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.vcJ, localStringBuilder.toString());
    GMTrace.o(17092896096256L, 127352);
  }
  
  public static void q(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      GMTrace.i(5584128573440L, 41605);
      com.tencent.mm.plugin.aa.a.b.c localc = com.tencent.mm.plugin.aa.b.Pz().ni(paramString1);
      w.i("MicroMsg.AAUtil", "setAARecordAfterLaunchAA, billNo: %s, chatroom: %s, msgContent==null:%s, oldRecord: %s", new Object[] { paramString1, paramString2, Boolean.valueOf(bg.mZ(paramString3)), localc });
      if (localc == null) {
        a(paramString1, false, 0L);
      }
      at(paramString3, paramString2);
      GMTrace.o(5584128573440L, 41605);
      return;
    }
    finally {}
  }
  
  public static void r(String paramString1, String paramString2, String paramString3)
  {
    for (;;)
    {
      com.tencent.mm.plugin.aa.a.b.a locala;
      try
      {
        GMTrace.i(5584397008896L, 41607);
      }
      finally {}
      try
      {
        if ((bg.mZ(paramString1)) || (bg.mZ(paramString2)) || (bg.mZ(paramString3))) {
          continue;
        }
        w.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, chatroom: %s, payMsgId: %s", new Object[] { paramString2, paramString3 });
        locala = com.tencent.mm.plugin.aa.b.PA().nh(paramString3);
        if ((locala != null) && (locala.field_insertmsg)) {
          continue;
        }
        w.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, insert new msg");
        a(paramString1, paramString2, locala, paramString3);
        GMTrace.o(5584397008896L, 41607);
      }
      catch (Exception paramString1)
      {
        w.e("MicroMsg.AAUtil", "checkIfInsertPaySysMsg error: %s", new Object[] { paramString1.getMessage() });
        GMTrace.o(5584397008896L, 41607);
        continue;
      }
      return;
      ap.AS();
      paramString2 = com.tencent.mm.x.c.yN().cI(locala.field_msgId);
      w.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, update old one, msgId: %s, dbMsginfo.id: %s", new Object[] { Long.valueOf(locala.field_msgId), Long.valueOf(paramString2.field_msgId) });
      paramString2.setContent(paramString1);
      ap.AS();
      com.tencent.mm.x.c.yN().a(locala.field_msgId, paramString2);
      GMTrace.o(5584397008896L, 41607);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */