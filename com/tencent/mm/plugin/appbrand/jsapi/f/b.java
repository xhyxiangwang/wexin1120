package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.b.b.a;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.h.j;
import com.tencent.mm.plugin.appbrand.h.j.a;
import com.tencent.mm.plugin.appbrand.h.k.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 20;
  public static final String NAME = "connectSocket";
  
  public b()
  {
    GMTrace.i(18237907533824L, 135883);
    GMTrace.o(18237907533824L, 135883);
  }
  
  /* Error */
  public final void a(final com.tencent.mm.plugin.appbrand.k paramk, JSONObject paramJSONObject, final int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 37
    //   3: ldc 39
    //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: getstatic 45	com/tencent/mm/plugin/appbrand/h/k$a:jju	Lcom/tencent/mm/plugin/appbrand/h/k;
    //   11: aload_1
    //   12: getfield 50	com/tencent/mm/plugin/appbrand/k:iqL	Ljava/lang/String;
    //   15: invokevirtual 56	com/tencent/mm/plugin/appbrand/h/k:ri	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/h/j;
    //   18: astore 7
    //   20: aload 7
    //   22: ifnull +82 -> 104
    //   25: aload 7
    //   27: getfield 62	com/tencent/mm/plugin/appbrand/h/j:jjo	Lcom/tencent/mm/plugin/appbrand/p/a/a;
    //   30: ifnull +68 -> 98
    //   33: aload 7
    //   35: getfield 62	com/tencent/mm/plugin/appbrand/h/j:jjo	Lcom/tencent/mm/plugin/appbrand/p/a/a;
    //   38: getfield 68	com/tencent/mm/plugin/appbrand/p/a/a:jxt	Lcom/tencent/mm/plugin/appbrand/p/c;
    //   41: invokevirtual 74	com/tencent/mm/plugin/appbrand/p/c:isOpen	()Z
    //   44: istore 4
    //   46: iload 4
    //   48: ifeq +56 -> 104
    //   51: ldc 76
    //   53: ldc 78
    //   55: invokestatic 83	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: new 85	java/util/HashMap
    //   61: dup
    //   62: invokespecial 86	java/util/HashMap:<init>	()V
    //   65: astore_2
    //   66: aload_2
    //   67: ldc 88
    //   69: ldc 90
    //   71: invokeinterface 96 3 0
    //   76: pop
    //   77: aload_1
    //   78: iload_3
    //   79: aload_0
    //   80: ldc 98
    //   82: aload_2
    //   83: invokevirtual 102	com/tencent/mm/plugin/appbrand/jsapi/f/b:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   86: invokevirtual 106	com/tencent/mm/plugin/appbrand/k:v	(ILjava/lang/String;)V
    //   89: ldc2_w 37
    //   92: ldc 39
    //   94: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   97: return
    //   98: iconst_0
    //   99: istore 4
    //   101: goto -55 -> 46
    //   104: aload 7
    //   106: ifnull +14 -> 120
    //   109: getstatic 45	com/tencent/mm/plugin/appbrand/h/k$a:jju	Lcom/tencent/mm/plugin/appbrand/h/k;
    //   112: aload_1
    //   113: getfield 50	com/tencent/mm/plugin/appbrand/k:iqL	Ljava/lang/String;
    //   116: invokevirtual 110	com/tencent/mm/plugin/appbrand/h/k:rj	(Ljava/lang/String;)Z
    //   119: pop
    //   120: aload_1
    //   121: invokestatic 114	com/tencent/mm/plugin/appbrand/jsapi/f/b:b	(Lcom/tencent/mm/plugin/appbrand/k;)Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;
    //   124: astore 9
    //   126: aconst_null
    //   127: astore 8
    //   129: aload 8
    //   131: astore 7
    //   133: aload 9
    //   135: ifnull +28 -> 163
    //   138: aload 8
    //   140: astore 7
    //   142: aload 9
    //   144: getfield 120	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:jlc	Lcom/tencent/mm/plugin/appbrand/page/s;
    //   147: ifnull +16 -> 163
    //   150: aload 9
    //   152: getfield 120	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:jlc	Lcom/tencent/mm/plugin/appbrand/page/s;
    //   155: invokevirtual 126	com/tencent/mm/plugin/appbrand/page/s:getSettings	()Lcom/tencent/xweb/l;
    //   158: invokevirtual 132	com/tencent/xweb/l:getUserAgentString	()Ljava/lang/String;
    //   161: astore 7
    //   163: new 58	com/tencent/mm/plugin/appbrand/h/j
    //   166: dup
    //   167: aload_1
    //   168: getfield 50	com/tencent/mm/plugin/appbrand/k:iqL	Ljava/lang/String;
    //   171: aload 7
    //   173: invokespecial 134	com/tencent/mm/plugin/appbrand/h/j:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: astore 9
    //   178: new 8	com/tencent/mm/plugin/appbrand/jsapi/f/b$2
    //   181: dup
    //   182: aload_0
    //   183: aload_1
    //   184: aload 9
    //   186: new 6	com/tencent/mm/plugin/appbrand/jsapi/f/b$1
    //   189: dup
    //   190: aload_0
    //   191: aload 9
    //   193: invokespecial 137	com/tencent/mm/plugin/appbrand/jsapi/f/b$1:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/f/b;Lcom/tencent/mm/plugin/appbrand/h/j;)V
    //   196: iload_3
    //   197: invokespecial 140	com/tencent/mm/plugin/appbrand/jsapi/f/b$2:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/f/b;Lcom/tencent/mm/plugin/appbrand/k;Lcom/tencent/mm/plugin/appbrand/h/j;Lcom/tencent/mm/plugin/appbrand/b/b$a;I)V
    //   200: astore 7
    //   202: aload_1
    //   203: getfield 144	com/tencent/mm/plugin/appbrand/k:irS	Lcom/tencent/mm/plugin/appbrand/f;
    //   206: getfield 150	com/tencent/mm/plugin/appbrand/f:iqP	Lcom/tencent/mm/plugin/appbrand/config/a;
    //   209: astore 8
    //   211: aload_2
    //   212: ldc -104
    //   214: invokevirtual 158	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   217: astore 11
    //   219: aload 11
    //   221: invokestatic 163	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   224: ifeq +31 -> 255
    //   227: ldc 76
    //   229: ldc -91
    //   231: invokestatic 83	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   234: aload_1
    //   235: iload_3
    //   236: aload_0
    //   237: ldc 98
    //   239: aconst_null
    //   240: invokevirtual 168	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   243: invokevirtual 106	com/tencent/mm/plugin/appbrand/k:v	(ILjava/lang/String;)V
    //   246: ldc2_w 37
    //   249: ldc 39
    //   251: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   254: return
    //   255: ldc 76
    //   257: new 170	java/lang/StringBuilder
    //   260: dup
    //   261: ldc -84
    //   263: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   266: aload 11
    //   268: invokevirtual 179	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   274: invokestatic 83	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   277: aload_1
    //   278: getfield 50	com/tencent/mm/plugin/appbrand/k:iqL	Ljava/lang/String;
    //   281: invokestatic 188	com/tencent/mm/plugin/appbrand/a:nx	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfig;
    //   284: astore 12
    //   286: aload_2
    //   287: aload 12
    //   289: invokestatic 193	com/tencent/mm/plugin/appbrand/h/i:a	(Lorg/json/JSONObject;Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfig;)Ljava/util/Map;
    //   292: astore 10
    //   294: aload 12
    //   296: invokestatic 197	com/tencent/mm/plugin/appbrand/h/i:c	(Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfig;)Z
    //   299: ifeq +53 -> 352
    //   302: aload 12
    //   304: getfield 203	com/tencent/mm/plugin/appbrand/config/AppBrandSysConfig:iIU	Ljava/util/ArrayList;
    //   307: aload 11
    //   309: invokestatic 206	com/tencent/mm/plugin/appbrand/h/i:a	(Ljava/util/ArrayList;Ljava/lang/String;)Z
    //   312: ifne +40 -> 352
    //   315: aload_1
    //   316: iload_3
    //   317: aload_0
    //   318: ldc -48
    //   320: aconst_null
    //   321: invokevirtual 168	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   324: invokevirtual 106	com/tencent/mm/plugin/appbrand/k:v	(ILjava/lang/String;)V
    //   327: ldc 76
    //   329: ldc -46
    //   331: iconst_1
    //   332: anewarray 212	java/lang/Object
    //   335: dup
    //   336: iconst_0
    //   337: aload 11
    //   339: aastore
    //   340: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   343: ldc2_w 37
    //   346: ldc 39
    //   348: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   351: return
    //   352: aload 12
    //   354: aload 8
    //   356: iconst_1
    //   357: invokestatic 218	com/tencent/mm/plugin/appbrand/h/i:a	(Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfig;Lcom/tencent/mm/plugin/appbrand/config/a;I)I
    //   360: istore_3
    //   361: iload_3
    //   362: ifle +585 -> 947
    //   365: ldc 76
    //   367: ldc -36
    //   369: iconst_2
    //   370: anewarray 212	java/lang/Object
    //   373: dup
    //   374: iconst_0
    //   375: aload 11
    //   377: aastore
    //   378: dup
    //   379: iconst_1
    //   380: aload 12
    //   382: getfield 223	com/tencent/mm/plugin/appbrand/config/AppBrandSysConfig:appId	Ljava/lang/String;
    //   385: aastore
    //   386: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   389: aload_2
    //   390: ldc -104
    //   392: invokevirtual 158	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   395: astore 8
    //   397: new 225	java/net/URI
    //   400: dup
    //   401: aload 8
    //   403: invokespecial 226	java/net/URI:<init>	(Ljava/lang/String;)V
    //   406: astore_1
    //   407: ldc -28
    //   409: ldc -26
    //   411: iconst_2
    //   412: anewarray 212	java/lang/Object
    //   415: dup
    //   416: iconst_0
    //   417: aload 8
    //   419: aastore
    //   420: dup
    //   421: iconst_1
    //   422: iload_3
    //   423: invokestatic 236	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   426: aastore
    //   427: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   430: aload 10
    //   432: ldc -18
    //   434: invokestatic 244	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   437: aload 9
    //   439: getfield 247	com/tencent/mm/plugin/appbrand/h/j:jiE	Ljava/lang/String;
    //   442: invokestatic 253	com/tencent/mm/pluginsdk/ui/tools/s:aY	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   445: invokeinterface 96 3 0
    //   450: pop
    //   451: aload_2
    //   452: invokestatic 257	com/tencent/mm/plugin/appbrand/h/j:q	(Lorg/json/JSONObject;)Ljava/lang/String;
    //   455: astore_2
    //   456: aload_2
    //   457: invokestatic 163	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   460: ifne +31 -> 491
    //   463: ldc -28
    //   465: ldc_w 259
    //   468: iconst_1
    //   469: anewarray 212	java/lang/Object
    //   472: dup
    //   473: iconst_0
    //   474: aload_2
    //   475: aastore
    //   476: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   479: aload 10
    //   481: ldc_w 261
    //   484: aload_2
    //   485: invokeinterface 96 3 0
    //   490: pop
    //   491: aload_1
    //   492: invokestatic 264	com/tencent/mm/plugin/appbrand/h/j:a	(Ljava/net/URI;)Ljava/lang/String;
    //   495: astore_2
    //   496: aload_2
    //   497: invokestatic 163	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   500: ifne +31 -> 531
    //   503: ldc -28
    //   505: ldc_w 266
    //   508: iconst_1
    //   509: anewarray 212	java/lang/Object
    //   512: dup
    //   513: iconst_0
    //   514: aload_2
    //   515: aastore
    //   516: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   519: aload 10
    //   521: ldc_w 268
    //   524: aload_2
    //   525: invokeinterface 96 3 0
    //   530: pop
    //   531: aload 9
    //   533: new 270	com/tencent/mm/plugin/appbrand/h/j$1
    //   536: dup
    //   537: aload 9
    //   539: aload_1
    //   540: new 272	com/tencent/mm/plugin/appbrand/p/b/d
    //   543: dup
    //   544: invokespecial 273	com/tencent/mm/plugin/appbrand/p/b/d:<init>	()V
    //   547: aload 10
    //   549: iload_3
    //   550: aload 8
    //   552: aload 7
    //   554: invokespecial 276	com/tencent/mm/plugin/appbrand/h/j$1:<init>	(Lcom/tencent/mm/plugin/appbrand/h/j;Ljava/net/URI;Lcom/tencent/mm/plugin/appbrand/p/b/a;Ljava/util/Map;ILjava/lang/String;Lcom/tencent/mm/plugin/appbrand/h/j$a;)V
    //   557: putfield 62	com/tencent/mm/plugin/appbrand/h/j:jjo	Lcom/tencent/mm/plugin/appbrand/p/a/a;
    //   560: aload 8
    //   562: ldc_w 278
    //   565: invokestatic 282	com/tencent/mm/pluginsdk/ui/tools/s:ew	(Ljava/lang/String;Ljava/lang/String;)Z
    //   568: ifeq +200 -> 768
    //   571: ldc -28
    //   573: ldc_w 284
    //   576: iconst_1
    //   577: anewarray 212	java/lang/Object
    //   580: dup
    //   581: iconst_0
    //   582: aload 8
    //   584: aastore
    //   585: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   588: new 286	java/net/Socket
    //   591: dup
    //   592: getstatic 292	java/net/Proxy:NO_PROXY	Ljava/net/Proxy;
    //   595: invokespecial 295	java/net/Socket:<init>	(Ljava/net/Proxy;)V
    //   598: astore_1
    //   599: aload 9
    //   601: getfield 62	com/tencent/mm/plugin/appbrand/h/j:jjo	Lcom/tencent/mm/plugin/appbrand/p/a/a;
    //   604: aload_1
    //   605: invokevirtual 298	com/tencent/mm/plugin/appbrand/p/a/a:a	(Ljava/net/Socket;)V
    //   608: aload 9
    //   610: getfield 62	com/tencent/mm/plugin/appbrand/h/j:jjo	Lcom/tencent/mm/plugin/appbrand/p/a/a;
    //   613: invokevirtual 301	com/tencent/mm/plugin/appbrand/p/a/a:connect	()V
    //   616: aload 7
    //   618: invokeinterface 306 1 0
    //   623: invokestatic 309	com/tencent/mm/plugin/appbrand/h/j:MM	()V
    //   626: ldc 58
    //   628: monitorenter
    //   629: new 311	com/tencent/mm/sdk/platformtools/aj
    //   632: dup
    //   633: new 313	com/tencent/mm/plugin/appbrand/h/j$2
    //   636: dup
    //   637: aload 9
    //   639: aload 7
    //   641: invokespecial 316	com/tencent/mm/plugin/appbrand/h/j$2:<init>	(Lcom/tencent/mm/plugin/appbrand/h/j;Lcom/tencent/mm/plugin/appbrand/h/j$a;)V
    //   644: iconst_0
    //   645: invokespecial 319	com/tencent/mm/sdk/platformtools/aj:<init>	(Lcom/tencent/mm/sdk/platformtools/aj$a;Z)V
    //   648: putstatic 323	com/tencent/mm/plugin/appbrand/h/j:jjq	Lcom/tencent/mm/sdk/platformtools/aj;
    //   651: ldc 58
    //   653: monitorexit
    //   654: getstatic 323	com/tencent/mm/plugin/appbrand/h/j:jjq	Lcom/tencent/mm/sdk/platformtools/aj;
    //   657: astore_1
    //   658: iload_3
    //   659: i2l
    //   660: lstore 5
    //   662: aload_1
    //   663: lload 5
    //   665: lload 5
    //   667: invokevirtual 327	com/tencent/mm/sdk/platformtools/aj:w	(JJ)V
    //   670: ldc2_w 37
    //   673: ldc 39
    //   675: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   678: return
    //   679: astore_1
    //   680: ldc -28
    //   682: ldc_w 329
    //   685: iconst_2
    //   686: anewarray 212	java/lang/Object
    //   689: dup
    //   690: iconst_0
    //   691: aload 8
    //   693: aastore
    //   694: dup
    //   695: iconst_1
    //   696: aload_1
    //   697: invokevirtual 330	java/lang/Exception:toString	()Ljava/lang/String;
    //   700: aastore
    //   701: invokestatic 333	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   704: aload 7
    //   706: ldc_w 335
    //   709: invokeinterface 338 2 0
    //   714: ldc2_w 37
    //   717: ldc 39
    //   719: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   722: return
    //   723: astore_1
    //   724: ldc -28
    //   726: ldc_w 340
    //   729: iconst_1
    //   730: anewarray 212	java/lang/Object
    //   733: dup
    //   734: iconst_0
    //   735: aload_1
    //   736: invokevirtual 330	java/lang/Exception:toString	()Ljava/lang/String;
    //   739: aastore
    //   740: invokestatic 333	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   743: aload 7
    //   745: ldc_w 342
    //   748: invokeinterface 345 2 0
    //   753: ldc2_w 37
    //   756: ldc 39
    //   758: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   761: return
    //   762: astore_1
    //   763: ldc 58
    //   765: monitorexit
    //   766: aload_1
    //   767: athrow
    //   768: aload 8
    //   770: ldc_w 347
    //   773: invokestatic 282	com/tencent/mm/pluginsdk/ui/tools/s:ew	(Ljava/lang/String;Ljava/lang/String;)Z
    //   776: ifeq +135 -> 911
    //   779: ldc -28
    //   781: ldc_w 349
    //   784: iconst_1
    //   785: anewarray 212	java/lang/Object
    //   788: dup
    //   789: iconst_0
    //   790: aload 8
    //   792: aastore
    //   793: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   796: aload 9
    //   798: getfield 353	com/tencent/mm/plugin/appbrand/h/j:jjp	Ljavax/net/ssl/SSLSocketFactory;
    //   801: ifnull +94 -> 895
    //   804: aload 9
    //   806: getfield 353	com/tencent/mm/plugin/appbrand/h/j:jjp	Ljavax/net/ssl/SSLSocketFactory;
    //   809: astore_1
    //   810: aload_1
    //   811: invokevirtual 359	javax/net/ssl/SSLSocketFactory:createSocket	()Ljava/net/Socket;
    //   814: astore_1
    //   815: aload 9
    //   817: getfield 62	com/tencent/mm/plugin/appbrand/h/j:jjo	Lcom/tencent/mm/plugin/appbrand/p/a/a;
    //   820: aload_1
    //   821: invokevirtual 298	com/tencent/mm/plugin/appbrand/p/a/a:a	(Ljava/net/Socket;)V
    //   824: aload 9
    //   826: getfield 62	com/tencent/mm/plugin/appbrand/h/j:jjo	Lcom/tencent/mm/plugin/appbrand/p/a/a;
    //   829: invokevirtual 301	com/tencent/mm/plugin/appbrand/p/a/a:connect	()V
    //   832: aload 7
    //   834: invokeinterface 306 1 0
    //   839: invokestatic 309	com/tencent/mm/plugin/appbrand/h/j:MM	()V
    //   842: ldc 58
    //   844: monitorenter
    //   845: new 311	com/tencent/mm/sdk/platformtools/aj
    //   848: dup
    //   849: new 361	com/tencent/mm/plugin/appbrand/h/j$3
    //   852: dup
    //   853: aload 9
    //   855: aload 7
    //   857: invokespecial 362	com/tencent/mm/plugin/appbrand/h/j$3:<init>	(Lcom/tencent/mm/plugin/appbrand/h/j;Lcom/tencent/mm/plugin/appbrand/h/j$a;)V
    //   860: iconst_0
    //   861: invokespecial 319	com/tencent/mm/sdk/platformtools/aj:<init>	(Lcom/tencent/mm/sdk/platformtools/aj$a;Z)V
    //   864: putstatic 323	com/tencent/mm/plugin/appbrand/h/j:jjq	Lcom/tencent/mm/sdk/platformtools/aj;
    //   867: ldc 58
    //   869: monitorexit
    //   870: getstatic 323	com/tencent/mm/plugin/appbrand/h/j:jjq	Lcom/tencent/mm/sdk/platformtools/aj;
    //   873: astore_1
    //   874: iload_3
    //   875: i2l
    //   876: lstore 5
    //   878: aload_1
    //   879: lload 5
    //   881: lload 5
    //   883: invokevirtual 327	com/tencent/mm/sdk/platformtools/aj:w	(JJ)V
    //   886: ldc2_w 37
    //   889: ldc 39
    //   891: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   894: return
    //   895: invokestatic 366	javax/net/ssl/SSLSocketFactory:getDefault	()Ljavax/net/SocketFactory;
    //   898: checkcast 355	javax/net/ssl/SSLSocketFactory
    //   901: astore_1
    //   902: goto -92 -> 810
    //   905: astore_1
    //   906: ldc 58
    //   908: monitorexit
    //   909: aload_1
    //   910: athrow
    //   911: ldc -28
    //   913: ldc_w 368
    //   916: iconst_1
    //   917: anewarray 212	java/lang/Object
    //   920: dup
    //   921: iconst_0
    //   922: aload 8
    //   924: aastore
    //   925: invokestatic 215	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   928: aload 7
    //   930: ldc_w 370
    //   933: invokeinterface 345 2 0
    //   938: ldc2_w 37
    //   941: ldc 39
    //   943: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   946: return
    //   947: ldc_w 371
    //   950: istore_3
    //   951: goto -586 -> 365
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	954	0	this	b
    //   0	954	1	paramk	com.tencent.mm.plugin.appbrand.k
    //   0	954	2	paramJSONObject	JSONObject
    //   0	954	3	paramInt	int
    //   44	56	4	bool	boolean
    //   660	222	5	l	long
    //   18	911	7	localObject1	Object
    //   127	796	8	localObject2	Object
    //   124	730	9	localObject3	Object
    //   292	256	10	localMap	Map
    //   217	159	11	str	String
    //   284	97	12	localAppBrandSysConfig	com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig
    // Exception table:
    //   from	to	target	type
    //   531	629	679	java/lang/Exception
    //   654	658	679	java/lang/Exception
    //   662	678	679	java/lang/Exception
    //   766	768	679	java/lang/Exception
    //   768	810	679	java/lang/Exception
    //   810	845	679	java/lang/Exception
    //   870	874	679	java/lang/Exception
    //   878	894	679	java/lang/Exception
    //   895	902	679	java/lang/Exception
    //   909	911	679	java/lang/Exception
    //   911	938	679	java/lang/Exception
    //   397	407	723	java/lang/Exception
    //   629	654	762	finally
    //   763	766	762	finally
    //   845	870	905	finally
    //   906	909	905	finally
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */