package com.tencent.mm.plugin.appbrand.h;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.o.l;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.SSLContext;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  private String iqL;
  public int jiB;
  private SSLContext jiD;
  private final String jiE;
  protected final ArrayList<d> jiK;
  
  public c(String paramString1, String paramString2)
  {
    GMTrace.i(19902744231936L, 148287);
    this.jiK = new ArrayList();
    this.iqL = paramString1;
    this.jiB = a.nx(paramString1).iIM;
    this.jiE = paramString2;
    GMTrace.o(19902744231936L, 148287);
  }
  
  private static JSONObject b(HttpURLConnection paramHttpURLConnection)
  {
    GMTrace.i(15564021956608L, 115961);
    JSONObject localJSONObject = new JSONObject();
    if (paramHttpURLConnection == null)
    {
      GMTrace.o(15564021956608L, 115961);
      return localJSONObject;
    }
    paramHttpURLConnection = paramHttpURLConnection.getHeaderFields();
    if (paramHttpURLConnection == null)
    {
      GMTrace.o(15564021956608L, 115961);
      return localJSONObject;
    }
    paramHttpURLConnection = paramHttpURLConnection.entrySet().iterator();
    while (paramHttpURLConnection.hasNext())
    {
      Object localObject = (Map.Entry)paramHttpURLConnection.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = (List)((Map.Entry)localObject).getValue();
      if ((!bg.mZ(str)) && (localObject != null) && (!((List)localObject).isEmpty()))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append((String)((List)localObject).get(0));
        int i = 1;
        while (i < ((List)localObject).size())
        {
          localStringBuilder.append(",");
          localStringBuilder.append((String)((List)localObject).get(i));
          i += 1;
        }
        try
        {
          localJSONObject.put(str, localStringBuilder.toString());
        }
        catch (JSONException localJSONException)
        {
          w.e("MicroMsg.AppBrandNetworkRequest", "put header error : %s", new Object[] { Log.getStackTraceString(localJSONException) });
        }
      }
    }
    GMTrace.o(15564021956608L, 115961);
    return localJSONObject;
  }
  
  private void qU(String paramString)
  {
    for (;;)
    {
      ArrayList localArrayList2;
      try
      {
        GMTrace.i(10673530601472L, 79524);
        if (paramString == null)
        {
          GMTrace.o(10673530601472L, 79524);
          return;
        }
        localArrayList2 = new ArrayList();
        synchronized (this.jiK)
        {
          Iterator localIterator = this.jiK.iterator();
          if (localIterator.hasNext())
          {
            d locald = (d)localIterator.next();
            if (!locald.mUrl.equals(paramString)) {
              continue;
            }
            localArrayList2.add(locald);
          }
        }
        if (localArrayList2.size() <= 0) {
          break label119;
        }
      }
      finally {}
      this.jiK.removeAll(localArrayList2);
      label119:
      GMTrace.o(10673530601472L, 79524);
    }
  }
  
  public static boolean qY(String paramString)
  {
    GMTrace.i(10673262166016L, 79522);
    if ((paramString.equalsIgnoreCase("POST")) || (paramString.equalsIgnoreCase("PUT")) || (paramString.equalsIgnoreCase("DELETE")))
    {
      GMTrace.o(10673262166016L, 79522);
      return true;
    }
    GMTrace.o(10673262166016L, 79522);
    return false;
  }
  
  /* Error */
  public final void a(d paramd)
  {
    // Byte code:
    //   0: ldc2_w 211
    //   3: ldc -43
    //   5: invokestatic 35	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aconst_null
    //   9: astore 22
    //   11: aconst_null
    //   12: astore 23
    //   14: aconst_null
    //   15: astore 30
    //   17: aconst_null
    //   18: astore 31
    //   20: aconst_null
    //   21: astore 32
    //   23: aconst_null
    //   24: astore 33
    //   26: aconst_null
    //   27: astore 21
    //   29: aconst_null
    //   30: astore 24
    //   32: aconst_null
    //   33: astore 25
    //   35: aconst_null
    //   36: astore 26
    //   38: aconst_null
    //   39: astore 27
    //   41: aconst_null
    //   42: astore 28
    //   44: aconst_null
    //   45: astore 29
    //   47: aconst_null
    //   48: astore 18
    //   50: aconst_null
    //   51: astore 14
    //   53: aconst_null
    //   54: astore 17
    //   56: aconst_null
    //   57: astore 15
    //   59: aconst_null
    //   60: astore 19
    //   62: aconst_null
    //   63: astore 20
    //   65: aconst_null
    //   66: astore 16
    //   68: aconst_null
    //   69: astore 34
    //   71: aconst_null
    //   72: astore 35
    //   74: aconst_null
    //   75: astore 36
    //   77: aconst_null
    //   78: astore 37
    //   80: aconst_null
    //   81: astore 38
    //   83: aconst_null
    //   84: astore 13
    //   86: aload_1
    //   87: getfield 217	com/tencent/mm/plugin/appbrand/h/d:jiW	Lcom/tencent/mm/plugin/appbrand/h/c$a;
    //   90: astore 39
    //   92: aload_1
    //   93: getfield 221	com/tencent/mm/plugin/appbrand/h/d:jiX	Ljava/util/Map;
    //   96: astore 40
    //   98: iconst_0
    //   99: istore_3
    //   100: iconst_0
    //   101: istore 4
    //   103: iconst_0
    //   104: istore 6
    //   106: iconst_0
    //   107: istore 7
    //   109: iconst_0
    //   110: istore 5
    //   112: aload_1
    //   113: getfield 224	com/tencent/mm/plugin/appbrand/h/d:jiY	Ljava/util/ArrayList;
    //   116: astore 41
    //   118: aload 41
    //   120: ifnull +78 -> 198
    //   123: aload 41
    //   125: aload_1
    //   126: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   129: invokestatic 229	com/tencent/mm/plugin/appbrand/h/i:a	(Ljava/util/ArrayList;Ljava/lang/String;)Z
    //   132: ifne +66 -> 198
    //   135: aload 39
    //   137: ldc -25
    //   139: invokeinterface 234 2 0
    //   144: aload_0
    //   145: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   148: aload_1
    //   149: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   152: aload_1
    //   153: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   156: aload_1
    //   157: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   160: lconst_0
    //   161: lconst_0
    //   162: iconst_0
    //   163: iconst_2
    //   164: aload_1
    //   165: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   168: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   171: ldc -109
    //   173: ldc -6
    //   175: iconst_1
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_1
    //   182: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   185: aastore
    //   186: invokestatic 252	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: ldc2_w 211
    //   192: ldc -43
    //   194: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   197: return
    //   198: getstatic 258	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   201: ldc2_w 259
    //   204: lconst_0
    //   205: lconst_1
    //   206: iconst_0
    //   207: invokevirtual 263	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   210: ldc -109
    //   212: ldc_w 265
    //   215: iconst_2
    //   216: anewarray 4	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: aload_1
    //   222: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   225: aastore
    //   226: dup
    //   227: iconst_1
    //   228: aload_1
    //   229: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   232: aastore
    //   233: invokestatic 252	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   236: new 267	java/net/URL
    //   239: dup
    //   240: aload_1
    //   241: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   244: invokespecial 269	java/net/URL:<init>	(Ljava/lang/String;)V
    //   247: invokevirtual 273	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   250: checkcast 73	java/net/HttpURLConnection
    //   253: astore 12
    //   255: aload 13
    //   257: astore 16
    //   259: aload 34
    //   261: astore 15
    //   263: aload 35
    //   265: astore 17
    //   267: aload 36
    //   269: astore 18
    //   271: aload 37
    //   273: astore 19
    //   275: aload 38
    //   277: astore 20
    //   279: aload_1
    //   280: getfield 276	com/tencent/mm/plugin/appbrand/h/d:iPd	Ljava/lang/String;
    //   283: invokestatic 117	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   286: ifne +33 -> 319
    //   289: aload 13
    //   291: astore 16
    //   293: aload 34
    //   295: astore 15
    //   297: aload 35
    //   299: astore 17
    //   301: aload 36
    //   303: astore 18
    //   305: aload 37
    //   307: astore 19
    //   309: aload 38
    //   311: astore 20
    //   313: aload_1
    //   314: aload 12
    //   316: putfield 280	com/tencent/mm/plugin/appbrand/h/d:jjb	Ljava/net/HttpURLConnection;
    //   319: aload 12
    //   321: ifnonnull +52 -> 373
    //   324: aload_0
    //   325: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   328: aload_1
    //   329: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   332: aload_1
    //   333: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   336: aload_1
    //   337: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   340: aload_1
    //   341: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   344: lconst_0
    //   345: iconst_0
    //   346: iconst_2
    //   347: aload_1
    //   348: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   351: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   354: aload_0
    //   355: aload_1
    //   356: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   359: aload 12
    //   361: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   364: ldc2_w 211
    //   367: ldc -43
    //   369: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   372: return
    //   373: aload 13
    //   375: astore 16
    //   377: aload 34
    //   379: astore 15
    //   381: aload 35
    //   383: astore 17
    //   385: aload 36
    //   387: astore 18
    //   389: aload 37
    //   391: astore 19
    //   393: aload 38
    //   395: astore 20
    //   397: aload 12
    //   399: instanceof 289
    //   402: ifeq +217 -> 619
    //   405: aload 13
    //   407: astore 16
    //   409: aload 34
    //   411: astore 15
    //   413: aload 35
    //   415: astore 17
    //   417: aload 36
    //   419: astore 18
    //   421: aload 37
    //   423: astore 19
    //   425: aload 38
    //   427: astore 20
    //   429: aload_0
    //   430: getfield 291	com/tencent/mm/plugin/appbrand/h/c:jiD	Ljavax/net/ssl/SSLContext;
    //   433: ifnonnull +38 -> 471
    //   436: aload 13
    //   438: astore 16
    //   440: aload 34
    //   442: astore 15
    //   444: aload 35
    //   446: astore 17
    //   448: aload 36
    //   450: astore 18
    //   452: aload 37
    //   454: astore 19
    //   456: aload 38
    //   458: astore 20
    //   460: aload_0
    //   461: aload_0
    //   462: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   465: invokestatic 295	com/tencent/mm/plugin/appbrand/h/i:re	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   468: putfield 291	com/tencent/mm/plugin/appbrand/h/c:jiD	Ljavax/net/ssl/SSLContext;
    //   471: aload 13
    //   473: astore 16
    //   475: aload 34
    //   477: astore 15
    //   479: aload 35
    //   481: astore 17
    //   483: aload 36
    //   485: astore 18
    //   487: aload 37
    //   489: astore 19
    //   491: aload 38
    //   493: astore 20
    //   495: aload_0
    //   496: getfield 291	com/tencent/mm/plugin/appbrand/h/c:jiD	Ljavax/net/ssl/SSLContext;
    //   499: ifnull +42 -> 541
    //   502: aload 13
    //   504: astore 16
    //   506: aload 34
    //   508: astore 15
    //   510: aload 35
    //   512: astore 17
    //   514: aload 36
    //   516: astore 18
    //   518: aload 37
    //   520: astore 19
    //   522: aload 38
    //   524: astore 20
    //   526: aload 12
    //   528: checkcast 289	javax/net/ssl/HttpsURLConnection
    //   531: aload_0
    //   532: getfield 291	com/tencent/mm/plugin/appbrand/h/c:jiD	Ljavax/net/ssl/SSLContext;
    //   535: invokevirtual 301	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   538: invokevirtual 305	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   541: aload 13
    //   543: astore 16
    //   545: aload 34
    //   547: astore 15
    //   549: aload 35
    //   551: astore 17
    //   553: aload 36
    //   555: astore 18
    //   557: aload 37
    //   559: astore 19
    //   561: aload 38
    //   563: astore 20
    //   565: ldc -109
    //   567: new 122	java/lang/StringBuilder
    //   570: dup
    //   571: ldc_w 307
    //   574: invokespecial 308	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   577: aload 41
    //   579: invokevirtual 311	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   582: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   585: invokestatic 313	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   588: aload 13
    //   590: astore 16
    //   592: aload 34
    //   594: astore 15
    //   596: aload 35
    //   598: astore 17
    //   600: aload 36
    //   602: astore 18
    //   604: aload 37
    //   606: astore 19
    //   608: aload 38
    //   610: astore 20
    //   612: aload 12
    //   614: aload 41
    //   616: invokestatic 316	com/tencent/mm/plugin/appbrand/h/i:a	(Ljava/net/HttpURLConnection;Ljava/util/ArrayList;)V
    //   619: aload 13
    //   621: astore 16
    //   623: aload 34
    //   625: astore 15
    //   627: aload 35
    //   629: astore 17
    //   631: aload 36
    //   633: astore 18
    //   635: aload 37
    //   637: astore 19
    //   639: aload 38
    //   641: astore 20
    //   643: aload 12
    //   645: aload_1
    //   646: getfield 319	com/tencent/mm/plugin/appbrand/h/d:jiT	I
    //   649: invokevirtual 323	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   652: aload 13
    //   654: astore 16
    //   656: aload 34
    //   658: astore 15
    //   660: aload 35
    //   662: astore 17
    //   664: aload 36
    //   666: astore 18
    //   668: aload 37
    //   670: astore 19
    //   672: aload 38
    //   674: astore 20
    //   676: aload 12
    //   678: aload_1
    //   679: getfield 319	com/tencent/mm/plugin/appbrand/h/d:jiT	I
    //   682: invokevirtual 326	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   685: aload 13
    //   687: astore 16
    //   689: aload 34
    //   691: astore 15
    //   693: aload 35
    //   695: astore 17
    //   697: aload 36
    //   699: astore 18
    //   701: aload 37
    //   703: astore 19
    //   705: aload 38
    //   707: astore 20
    //   709: aload 12
    //   711: ldc_w 328
    //   714: ldc_w 330
    //   717: invokevirtual 333	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   720: aload 13
    //   722: astore 16
    //   724: aload 34
    //   726: astore 15
    //   728: aload 35
    //   730: astore 17
    //   732: aload 36
    //   734: astore 18
    //   736: aload 37
    //   738: astore 19
    //   740: aload 38
    //   742: astore 20
    //   744: aload 12
    //   746: iconst_0
    //   747: invokevirtual 337	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   750: aload 13
    //   752: astore 16
    //   754: aload 34
    //   756: astore 15
    //   758: aload 35
    //   760: astore 17
    //   762: aload 36
    //   764: astore 18
    //   766: aload 37
    //   768: astore 19
    //   770: aload 38
    //   772: astore 20
    //   774: aload 12
    //   776: aload_1
    //   777: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   780: invokevirtual 340	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   783: aload 13
    //   785: astore 16
    //   787: aload 34
    //   789: astore 15
    //   791: aload 35
    //   793: astore 17
    //   795: aload 36
    //   797: astore 18
    //   799: aload 37
    //   801: astore 19
    //   803: aload 38
    //   805: astore 20
    //   807: aload 12
    //   809: iconst_1
    //   810: invokevirtual 343	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   813: aload 13
    //   815: astore 16
    //   817: aload 34
    //   819: astore 15
    //   821: aload 35
    //   823: astore 17
    //   825: aload 36
    //   827: astore 18
    //   829: aload 37
    //   831: astore 19
    //   833: aload 38
    //   835: astore 20
    //   837: aload 12
    //   839: ldc_w 345
    //   842: ldc_w 347
    //   845: invokevirtual 333	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   848: aload 40
    //   850: ifnull +410 -> 1260
    //   853: aload 13
    //   855: astore 16
    //   857: aload 34
    //   859: astore 15
    //   861: aload 35
    //   863: astore 17
    //   865: aload 36
    //   867: astore 18
    //   869: aload 37
    //   871: astore 19
    //   873: aload 38
    //   875: astore 20
    //   877: ldc -109
    //   879: ldc_w 349
    //   882: iconst_1
    //   883: anewarray 4	java/lang/Object
    //   886: dup
    //   887: iconst_0
    //   888: aload_1
    //   889: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   892: aastore
    //   893: invokestatic 252	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   896: aload 13
    //   898: astore 16
    //   900: aload 34
    //   902: astore 15
    //   904: aload 35
    //   906: astore 17
    //   908: aload 36
    //   910: astore 18
    //   912: aload 37
    //   914: astore 19
    //   916: aload 38
    //   918: astore 20
    //   920: aload 40
    //   922: invokeinterface 83 1 0
    //   927: invokeinterface 89 1 0
    //   932: astore 40
    //   934: aload 13
    //   936: astore 16
    //   938: aload 34
    //   940: astore 15
    //   942: aload 35
    //   944: astore 17
    //   946: aload 36
    //   948: astore 18
    //   950: aload 37
    //   952: astore 19
    //   954: aload 38
    //   956: astore 20
    //   958: aload 40
    //   960: invokeinterface 95 1 0
    //   965: ifeq +295 -> 1260
    //   968: aload 13
    //   970: astore 16
    //   972: aload 34
    //   974: astore 15
    //   976: aload 35
    //   978: astore 17
    //   980: aload 36
    //   982: astore 18
    //   984: aload 37
    //   986: astore 19
    //   988: aload 38
    //   990: astore 20
    //   992: aload 40
    //   994: invokeinterface 99 1 0
    //   999: checkcast 101	java/util/Map$Entry
    //   1002: astore 41
    //   1004: aload 13
    //   1006: astore 16
    //   1008: aload 34
    //   1010: astore 15
    //   1012: aload 35
    //   1014: astore 17
    //   1016: aload 36
    //   1018: astore 18
    //   1020: aload 37
    //   1022: astore 19
    //   1024: aload 38
    //   1026: astore 20
    //   1028: aload 12
    //   1030: aload 41
    //   1032: invokeinterface 104 1 0
    //   1037: checkcast 106	java/lang/String
    //   1040: aload 41
    //   1042: invokeinterface 109 1 0
    //   1047: checkcast 106	java/lang/String
    //   1050: invokevirtual 333	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1053: aload 13
    //   1055: astore 16
    //   1057: aload 34
    //   1059: astore 15
    //   1061: aload 35
    //   1063: astore 17
    //   1065: aload 36
    //   1067: astore 18
    //   1069: aload 37
    //   1071: astore 19
    //   1073: aload 38
    //   1075: astore 20
    //   1077: ldc -109
    //   1079: ldc_w 351
    //   1082: iconst_3
    //   1083: anewarray 4	java/lang/Object
    //   1086: dup
    //   1087: iconst_0
    //   1088: aload_1
    //   1089: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1092: aastore
    //   1093: dup
    //   1094: iconst_1
    //   1095: aload 41
    //   1097: invokeinterface 104 1 0
    //   1102: aastore
    //   1103: dup
    //   1104: iconst_2
    //   1105: aload 41
    //   1107: invokeinterface 109 1 0
    //   1112: aastore
    //   1113: invokestatic 252	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1116: goto -182 -> 934
    //   1119: astore 17
    //   1121: iconst_0
    //   1122: istore_3
    //   1123: iconst_0
    //   1124: istore_2
    //   1125: aload 12
    //   1127: astore 13
    //   1129: aload 29
    //   1131: astore 15
    //   1133: aload 16
    //   1135: astore 14
    //   1137: aload 17
    //   1139: astore 12
    //   1141: getstatic 258	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   1144: ldc2_w 259
    //   1147: lconst_1
    //   1148: lconst_1
    //   1149: iconst_0
    //   1150: invokevirtual 263	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   1153: ldc -109
    //   1155: ldc_w 353
    //   1158: iconst_2
    //   1159: anewarray 4	java/lang/Object
    //   1162: dup
    //   1163: iconst_0
    //   1164: aload_1
    //   1165: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1168: aastore
    //   1169: dup
    //   1170: iconst_1
    //   1171: aload 12
    //   1173: invokevirtual 354	java/io/UnsupportedEncodingException:toString	()Ljava/lang/String;
    //   1176: aastore
    //   1177: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1180: aload 39
    //   1182: ldc_w 356
    //   1185: invokeinterface 234 2 0
    //   1190: aload_0
    //   1191: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   1194: aload_1
    //   1195: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   1198: aload_1
    //   1199: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   1202: aload_1
    //   1203: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1206: aload_1
    //   1207: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   1210: iload_2
    //   1211: i2l
    //   1212: iload_3
    //   1213: iconst_2
    //   1214: aload_1
    //   1215: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   1218: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1221: aload_0
    //   1222: aload_1
    //   1223: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1226: aload 13
    //   1228: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   1231: aload 15
    //   1233: ifnull +8 -> 1241
    //   1236: aload 15
    //   1238: invokevirtual 361	java/io/InputStream:close	()V
    //   1241: aload 14
    //   1243: ifnull +3141 -> 4384
    //   1246: aload 14
    //   1248: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   1251: ldc2_w 211
    //   1254: ldc -43
    //   1256: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1259: return
    //   1260: aload 13
    //   1262: astore 16
    //   1264: aload 34
    //   1266: astore 15
    //   1268: aload 35
    //   1270: astore 17
    //   1272: aload 36
    //   1274: astore 18
    //   1276: aload 37
    //   1278: astore 19
    //   1280: aload 38
    //   1282: astore 20
    //   1284: aload 12
    //   1286: ldc_w 366
    //   1289: invokestatic 372	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1292: aload_0
    //   1293: getfield 57	com/tencent/mm/plugin/appbrand/h/c:jiE	Ljava/lang/String;
    //   1296: invokestatic 378	com/tencent/mm/pluginsdk/ui/tools/s:aY	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   1299: invokevirtual 333	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1302: aload 13
    //   1304: astore 16
    //   1306: aload 34
    //   1308: astore 15
    //   1310: aload 35
    //   1312: astore 17
    //   1314: aload 36
    //   1316: astore 18
    //   1318: aload 37
    //   1320: astore 19
    //   1322: aload 38
    //   1324: astore 20
    //   1326: aload_1
    //   1327: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   1330: invokestatic 380	com/tencent/mm/plugin/appbrand/h/c:qY	(Ljava/lang/String;)Z
    //   1333: ifeq +166 -> 1499
    //   1336: aload 13
    //   1338: astore 16
    //   1340: aload 34
    //   1342: astore 15
    //   1344: aload 35
    //   1346: astore 17
    //   1348: aload 36
    //   1350: astore 18
    //   1352: aload 37
    //   1354: astore 19
    //   1356: aload 38
    //   1358: astore 20
    //   1360: ldc -109
    //   1362: ldc_w 382
    //   1365: invokestatic 313	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1368: aload 13
    //   1370: astore 16
    //   1372: aload 34
    //   1374: astore 15
    //   1376: aload 35
    //   1378: astore 17
    //   1380: aload 36
    //   1382: astore 18
    //   1384: aload 37
    //   1386: astore 19
    //   1388: aload 38
    //   1390: astore 20
    //   1392: aload 12
    //   1394: ldc_w 384
    //   1397: aload_1
    //   1398: getfield 388	com/tencent/mm/plugin/appbrand/h/d:jiU	[B
    //   1401: arraylength
    //   1402: invokestatic 393	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1405: invokevirtual 333	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1408: aload 13
    //   1410: astore 16
    //   1412: aload 34
    //   1414: astore 15
    //   1416: aload 35
    //   1418: astore 17
    //   1420: aload 36
    //   1422: astore 18
    //   1424: aload 37
    //   1426: astore 19
    //   1428: aload 38
    //   1430: astore 20
    //   1432: aload 12
    //   1434: iconst_1
    //   1435: invokevirtual 396	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   1438: aload 13
    //   1440: astore 16
    //   1442: aload 34
    //   1444: astore 15
    //   1446: aload 35
    //   1448: astore 17
    //   1450: aload 36
    //   1452: astore 18
    //   1454: aload 37
    //   1456: astore 19
    //   1458: aload 38
    //   1460: astore 20
    //   1462: new 363	java/io/DataOutputStream
    //   1465: dup
    //   1466: aload 12
    //   1468: invokevirtual 400	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   1471: invokespecial 403	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   1474: astore 13
    //   1476: aload 13
    //   1478: aload_1
    //   1479: getfield 388	com/tencent/mm/plugin/appbrand/h/d:jiU	[B
    //   1482: invokevirtual 407	java/io/DataOutputStream:write	([B)V
    //   1485: aload 13
    //   1487: invokevirtual 410	java/io/DataOutputStream:flush	()V
    //   1490: aload 13
    //   1492: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   1495: aload 13
    //   1497: astore 14
    //   1499: aload 14
    //   1501: astore 16
    //   1503: aload 14
    //   1505: astore 15
    //   1507: aload 14
    //   1509: astore 17
    //   1511: aload 14
    //   1513: astore 18
    //   1515: aload 14
    //   1517: astore 19
    //   1519: aload 14
    //   1521: astore 20
    //   1523: aload 12
    //   1525: invokevirtual 413	java/net/HttpURLConnection:getResponseCode	()I
    //   1528: istore_2
    //   1529: aload 23
    //   1531: astore 16
    //   1533: aload 24
    //   1535: astore 15
    //   1537: aload 25
    //   1539: astore 21
    //   1541: aload 26
    //   1543: astore 18
    //   1545: aload 27
    //   1547: astore 19
    //   1549: aload 28
    //   1551: astore 20
    //   1553: ldc -109
    //   1555: ldc_w 415
    //   1558: iconst_2
    //   1559: anewarray 4	java/lang/Object
    //   1562: dup
    //   1563: iconst_0
    //   1564: iload_2
    //   1565: invokestatic 419	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1568: aastore
    //   1569: dup
    //   1570: iconst_1
    //   1571: aload_1
    //   1572: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1575: aastore
    //   1576: invokestatic 252	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1579: iload_2
    //   1580: sipush 200
    //   1583: if_icmpeq +626 -> 2209
    //   1586: aload 23
    //   1588: astore 16
    //   1590: aload 24
    //   1592: astore 15
    //   1594: aload 25
    //   1596: astore 21
    //   1598: aload 26
    //   1600: astore 18
    //   1602: aload 27
    //   1604: astore 19
    //   1606: aload 28
    //   1608: astore 20
    //   1610: ldc -109
    //   1612: ldc_w 421
    //   1615: iconst_2
    //   1616: anewarray 4	java/lang/Object
    //   1619: dup
    //   1620: iconst_0
    //   1621: aload_1
    //   1622: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1625: aastore
    //   1626: dup
    //   1627: iconst_1
    //   1628: iload_2
    //   1629: invokestatic 419	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1632: aastore
    //   1633: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1636: aload 23
    //   1638: astore 16
    //   1640: aload 24
    //   1642: astore 15
    //   1644: aload 25
    //   1646: astore 21
    //   1648: aload 26
    //   1650: astore 18
    //   1652: aload 27
    //   1654: astore 19
    //   1656: aload 28
    //   1658: astore 20
    //   1660: iload_2
    //   1661: invokestatic 425	com/tencent/mm/plugin/appbrand/h/i:iX	(I)Z
    //   1664: ifeq +545 -> 2209
    //   1667: aload 23
    //   1669: astore 16
    //   1671: aload 24
    //   1673: astore 15
    //   1675: aload 25
    //   1677: astore 21
    //   1679: aload 26
    //   1681: astore 18
    //   1683: aload 27
    //   1685: astore 19
    //   1687: aload 28
    //   1689: astore 20
    //   1691: aload 12
    //   1693: invokestatic 429	com/tencent/mm/plugin/appbrand/h/i:c	(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    //   1696: astore 13
    //   1698: aload 23
    //   1700: astore 16
    //   1702: aload 24
    //   1704: astore 15
    //   1706: aload 25
    //   1708: astore 21
    //   1710: aload 26
    //   1712: astore 18
    //   1714: aload 27
    //   1716: astore 19
    //   1718: aload 28
    //   1720: astore 20
    //   1722: aload_1
    //   1723: getfield 432	com/tencent/mm/plugin/appbrand/h/d:jiZ	I
    //   1726: istore 8
    //   1728: aload 23
    //   1730: astore 16
    //   1732: aload 24
    //   1734: astore 15
    //   1736: aload 25
    //   1738: astore 21
    //   1740: aload 26
    //   1742: astore 18
    //   1744: aload 27
    //   1746: astore 19
    //   1748: aload 28
    //   1750: astore 20
    //   1752: aload 13
    //   1754: invokestatic 437	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1757: ifne +452 -> 2209
    //   1760: iload 8
    //   1762: ifgt +172 -> 1934
    //   1765: aload 23
    //   1767: astore 16
    //   1769: aload 24
    //   1771: astore 15
    //   1773: aload 25
    //   1775: astore 21
    //   1777: aload 26
    //   1779: astore 18
    //   1781: aload 27
    //   1783: astore 19
    //   1785: aload 28
    //   1787: astore 20
    //   1789: ldc -109
    //   1791: ldc_w 439
    //   1794: iconst_1
    //   1795: anewarray 4	java/lang/Object
    //   1798: dup
    //   1799: iconst_0
    //   1800: bipush 15
    //   1802: invokestatic 419	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1805: aastore
    //   1806: invokestatic 442	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1809: aload 23
    //   1811: astore 16
    //   1813: aload 24
    //   1815: astore 15
    //   1817: aload 25
    //   1819: astore 21
    //   1821: aload 26
    //   1823: astore 18
    //   1825: aload 27
    //   1827: astore 19
    //   1829: aload 28
    //   1831: astore 20
    //   1833: aload 39
    //   1835: ldc_w 444
    //   1838: ldc_w 446
    //   1841: iload_2
    //   1842: aload 12
    //   1844: invokestatic 448	com/tencent/mm/plugin/appbrand/h/c:b	(Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    //   1847: invokeinterface 451 5 0
    //   1852: aload_0
    //   1853: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   1856: aload_1
    //   1857: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   1860: aload_1
    //   1861: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   1864: aload_1
    //   1865: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1868: aload_1
    //   1869: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   1872: lconst_0
    //   1873: iload_2
    //   1874: iconst_1
    //   1875: aload_1
    //   1876: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   1879: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   1882: aload_0
    //   1883: aload_1
    //   1884: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1887: aload 12
    //   1889: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   1892: aload 14
    //   1894: ifnull +31 -> 1925
    //   1897: aload 14
    //   1899: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   1902: ldc2_w 211
    //   1905: ldc -43
    //   1907: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1910: return
    //   1911: astore_1
    //   1912: ldc -109
    //   1914: aload_1
    //   1915: ldc_w 453
    //   1918: iconst_0
    //   1919: anewarray 4	java/lang/Object
    //   1922: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1925: ldc2_w 211
    //   1928: ldc -43
    //   1930: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1933: return
    //   1934: aload 23
    //   1936: astore 16
    //   1938: aload 24
    //   1940: astore 15
    //   1942: aload 25
    //   1944: astore 21
    //   1946: aload 26
    //   1948: astore 18
    //   1950: aload 27
    //   1952: astore 19
    //   1954: aload 28
    //   1956: astore 20
    //   1958: ldc -109
    //   1960: ldc_w 459
    //   1963: iconst_3
    //   1964: anewarray 4	java/lang/Object
    //   1967: dup
    //   1968: iconst_0
    //   1969: iload 8
    //   1971: invokestatic 419	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1974: aastore
    //   1975: dup
    //   1976: iconst_1
    //   1977: aload_1
    //   1978: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   1981: aastore
    //   1982: dup
    //   1983: iconst_2
    //   1984: aload 13
    //   1986: aastore
    //   1987: invokestatic 252	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1990: aload 23
    //   1992: astore 16
    //   1994: aload 24
    //   1996: astore 15
    //   1998: aload 25
    //   2000: astore 21
    //   2002: aload 26
    //   2004: astore 18
    //   2006: aload 27
    //   2008: astore 19
    //   2010: aload 28
    //   2012: astore 20
    //   2014: aload_1
    //   2015: aload 13
    //   2017: putfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2020: aload 23
    //   2022: astore 16
    //   2024: aload 24
    //   2026: astore 15
    //   2028: aload 25
    //   2030: astore 21
    //   2032: aload 26
    //   2034: astore 18
    //   2036: aload 27
    //   2038: astore 19
    //   2040: aload 28
    //   2042: astore 20
    //   2044: aload_1
    //   2045: iload 8
    //   2047: iconst_1
    //   2048: isub
    //   2049: putfield 432	com/tencent/mm/plugin/appbrand/h/d:jiZ	I
    //   2052: aload 23
    //   2054: astore 16
    //   2056: aload 24
    //   2058: astore 15
    //   2060: aload 25
    //   2062: astore 21
    //   2064: aload 26
    //   2066: astore 18
    //   2068: aload 27
    //   2070: astore 19
    //   2072: aload 28
    //   2074: astore 20
    //   2076: ldc -109
    //   2078: ldc_w 461
    //   2081: iconst_1
    //   2082: anewarray 4	java/lang/Object
    //   2085: dup
    //   2086: iconst_0
    //   2087: aload_1
    //   2088: getfield 432	com/tencent/mm/plugin/appbrand/h/d:jiZ	I
    //   2091: invokestatic 419	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2094: aastore
    //   2095: invokestatic 252	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2098: aload 23
    //   2100: astore 16
    //   2102: aload 24
    //   2104: astore 15
    //   2106: aload 25
    //   2108: astore 21
    //   2110: aload 26
    //   2112: astore 18
    //   2114: aload 27
    //   2116: astore 19
    //   2118: aload 28
    //   2120: astore 20
    //   2122: aload_0
    //   2123: aload_1
    //   2124: invokevirtual 463	com/tencent/mm/plugin/appbrand/h/c:a	(Lcom/tencent/mm/plugin/appbrand/h/d;)V
    //   2127: aload_0
    //   2128: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   2131: aload_1
    //   2132: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   2135: aload_1
    //   2136: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   2139: aload_1
    //   2140: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2143: aload_1
    //   2144: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   2147: lconst_0
    //   2148: iload_2
    //   2149: iconst_2
    //   2150: aload_1
    //   2151: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   2154: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2157: aload_0
    //   2158: aload_1
    //   2159: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2162: aload 12
    //   2164: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   2167: aload 14
    //   2169: ifnull +31 -> 2200
    //   2172: aload 14
    //   2174: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   2177: ldc2_w 211
    //   2180: ldc -43
    //   2182: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2185: return
    //   2186: astore_1
    //   2187: ldc -109
    //   2189: aload_1
    //   2190: ldc_w 453
    //   2193: iconst_0
    //   2194: anewarray 4	java/lang/Object
    //   2197: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2200: ldc2_w 211
    //   2203: ldc -43
    //   2205: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2208: return
    //   2209: aload 23
    //   2211: astore 16
    //   2213: aload 24
    //   2215: astore 15
    //   2217: aload 25
    //   2219: astore 21
    //   2221: aload 26
    //   2223: astore 18
    //   2225: aload 27
    //   2227: astore 19
    //   2229: aload 28
    //   2231: astore 20
    //   2233: new 465	java/io/ByteArrayOutputStream
    //   2236: dup
    //   2237: invokespecial 466	java/io/ByteArrayOutputStream:<init>	()V
    //   2240: astore 17
    //   2242: aload 23
    //   2244: astore 16
    //   2246: aload 24
    //   2248: astore 15
    //   2250: aload 26
    //   2252: astore 18
    //   2254: aload 27
    //   2256: astore 19
    //   2258: aload 28
    //   2260: astore 20
    //   2262: ldc_w 347
    //   2265: aload 12
    //   2267: invokevirtual 469	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   2270: invokevirtual 176	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2273: ifeq +249 -> 2522
    //   2276: aload 23
    //   2278: astore 16
    //   2280: aload 24
    //   2282: astore 15
    //   2284: aload 26
    //   2286: astore 18
    //   2288: aload 27
    //   2290: astore 19
    //   2292: aload 28
    //   2294: astore 20
    //   2296: new 471	java/util/zip/GZIPInputStream
    //   2299: dup
    //   2300: aload 12
    //   2302: invokevirtual 475	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   2305: invokespecial 478	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   2308: astore 13
    //   2310: aconst_null
    //   2311: astore 15
    //   2313: aload 13
    //   2315: ifnull +2523 -> 4838
    //   2318: aload 13
    //   2320: astore 16
    //   2322: aload 13
    //   2324: astore 15
    //   2326: aload 13
    //   2328: astore 21
    //   2330: aload 13
    //   2332: astore 18
    //   2334: aload 13
    //   2336: astore 19
    //   2338: aload 13
    //   2340: astore 20
    //   2342: sipush 1024
    //   2345: newarray <illegal type>
    //   2347: astore 22
    //   2349: iconst_0
    //   2350: istore_3
    //   2351: iload_3
    //   2352: istore 4
    //   2354: iload_3
    //   2355: istore 5
    //   2357: iload_3
    //   2358: istore 6
    //   2360: iload_3
    //   2361: istore 7
    //   2363: iload_3
    //   2364: istore 8
    //   2366: iload_3
    //   2367: istore 9
    //   2369: aload 13
    //   2371: aload 22
    //   2373: invokevirtual 482	java/io/InputStream:read	([B)I
    //   2376: istore 10
    //   2378: iload 10
    //   2380: iconst_m1
    //   2381: if_icmpeq +547 -> 2928
    //   2384: iload_3
    //   2385: istore 4
    //   2387: iload_3
    //   2388: istore 5
    //   2390: iload_3
    //   2391: istore 6
    //   2393: iload_3
    //   2394: istore 7
    //   2396: iload_3
    //   2397: istore 8
    //   2399: iload_3
    //   2400: istore 9
    //   2402: aload_0
    //   2403: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   2406: invokestatic 486	com/tencent/mm/plugin/appbrand/a:nv	(Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/f;
    //   2409: astore 15
    //   2411: aload 15
    //   2413: ifnonnull +364 -> 2777
    //   2416: iconst_1
    //   2417: istore 4
    //   2419: iload 4
    //   2421: ifeq +471 -> 2892
    //   2424: iload_3
    //   2425: istore 4
    //   2427: iload_3
    //   2428: istore 5
    //   2430: iload_3
    //   2431: istore 6
    //   2433: iload_3
    //   2434: istore 7
    //   2436: iload_3
    //   2437: istore 8
    //   2439: iload_3
    //   2440: istore 9
    //   2442: aload 39
    //   2444: ldc_w 488
    //   2447: invokeinterface 234 2 0
    //   2452: aload_0
    //   2453: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   2456: aload_1
    //   2457: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   2460: aload_1
    //   2461: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   2464: aload_1
    //   2465: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2468: aload_1
    //   2469: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   2472: iload_3
    //   2473: i2l
    //   2474: iload_2
    //   2475: iconst_2
    //   2476: aload_1
    //   2477: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   2480: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   2483: aload_0
    //   2484: aload_1
    //   2485: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   2488: aload 12
    //   2490: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   2493: aload 13
    //   2495: ifnull +8 -> 2503
    //   2498: aload 13
    //   2500: invokevirtual 361	java/io/InputStream:close	()V
    //   2503: aload 14
    //   2505: ifnull +378 -> 2883
    //   2508: aload 14
    //   2510: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   2513: ldc2_w 211
    //   2516: ldc -43
    //   2518: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2521: return
    //   2522: aload 23
    //   2524: astore 16
    //   2526: aload 24
    //   2528: astore 15
    //   2530: aload 26
    //   2532: astore 18
    //   2534: aload 27
    //   2536: astore 19
    //   2538: aload 28
    //   2540: astore 20
    //   2542: aload 12
    //   2544: invokevirtual 475	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   2547: astore 13
    //   2549: goto -239 -> 2310
    //   2552: astore 13
    //   2554: aload 23
    //   2556: astore 16
    //   2558: aload 24
    //   2560: astore 15
    //   2562: aload 25
    //   2564: astore 21
    //   2566: aload 26
    //   2568: astore 18
    //   2570: aload 27
    //   2572: astore 19
    //   2574: aload 28
    //   2576: astore 20
    //   2578: ldc -109
    //   2580: ldc_w 490
    //   2583: iconst_1
    //   2584: anewarray 4	java/lang/Object
    //   2587: dup
    //   2588: iconst_0
    //   2589: aload 13
    //   2591: invokevirtual 491	java/lang/Exception:toString	()Ljava/lang/String;
    //   2594: aastore
    //   2595: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2598: aload 23
    //   2600: astore 16
    //   2602: aload 24
    //   2604: astore 15
    //   2606: aload 26
    //   2608: astore 18
    //   2610: aload 27
    //   2612: astore 19
    //   2614: aload 28
    //   2616: astore 20
    //   2618: ldc_w 347
    //   2621: aload 12
    //   2623: invokevirtual 469	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   2626: invokevirtual 176	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2629: ifeq +40 -> 2669
    //   2632: aload 23
    //   2634: astore 16
    //   2636: aload 24
    //   2638: astore 15
    //   2640: aload 26
    //   2642: astore 18
    //   2644: aload 27
    //   2646: astore 19
    //   2648: aload 28
    //   2650: astore 20
    //   2652: new 471	java/util/zip/GZIPInputStream
    //   2655: dup
    //   2656: aload 12
    //   2658: invokevirtual 494	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   2661: invokespecial 478	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   2664: astore 13
    //   2666: goto -356 -> 2310
    //   2669: aload 23
    //   2671: astore 16
    //   2673: aload 24
    //   2675: astore 15
    //   2677: aload 26
    //   2679: astore 18
    //   2681: aload 27
    //   2683: astore 19
    //   2685: aload 28
    //   2687: astore 20
    //   2689: aload 12
    //   2691: invokevirtual 494	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   2694: astore 13
    //   2696: goto -386 -> 2310
    //   2699: astore 13
    //   2701: aload 23
    //   2703: astore 16
    //   2705: aload 24
    //   2707: astore 15
    //   2709: aload 25
    //   2711: astore 21
    //   2713: aload 26
    //   2715: astore 18
    //   2717: aload 27
    //   2719: astore 19
    //   2721: aload 28
    //   2723: astore 20
    //   2725: ldc -109
    //   2727: ldc_w 496
    //   2730: iconst_1
    //   2731: anewarray 4	java/lang/Object
    //   2734: dup
    //   2735: iconst_0
    //   2736: aload 13
    //   2738: invokevirtual 491	java/lang/Exception:toString	()Ljava/lang/String;
    //   2741: aastore
    //   2742: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2745: aload 22
    //   2747: astore 13
    //   2749: goto -439 -> 2310
    //   2752: astore 15
    //   2754: iconst_0
    //   2755: istore 4
    //   2757: aload 12
    //   2759: astore 13
    //   2761: iload_2
    //   2762: istore_3
    //   2763: aload 15
    //   2765: astore 12
    //   2767: iload 4
    //   2769: istore_2
    //   2770: aload 16
    //   2772: astore 15
    //   2774: goto -1633 -> 1141
    //   2777: iload_3
    //   2778: istore 4
    //   2780: iload_3
    //   2781: istore 5
    //   2783: iload_3
    //   2784: istore 6
    //   2786: iload_3
    //   2787: istore 7
    //   2789: iload_3
    //   2790: istore 8
    //   2792: iload_3
    //   2793: istore 9
    //   2795: getstatic 500	com/tencent/mm/plugin/appbrand/h/c$2:iCP	[I
    //   2798: aload 15
    //   2800: getfield 506	com/tencent/mm/plugin/appbrand/f:irc	Lcom/tencent/mm/plugin/appbrand/b/b;
    //   2803: getfield 512	com/tencent/mm/plugin/appbrand/b/b:iCL	Lcom/tencent/mm/plugin/appbrand/b/c;
    //   2806: invokevirtual 518	com/tencent/mm/plugin/appbrand/b/c:SR	()Lcom/tencent/mm/plugin/appbrand/b/a;
    //   2809: invokevirtual 523	com/tencent/mm/plugin/appbrand/b/a:ordinal	()I
    //   2812: iaload
    //   2813: istore 11
    //   2815: iload 11
    //   2817: tableswitch	default:+23->2840, 1:+29->2846, 2:+29->2846
    //   2840: iconst_0
    //   2841: istore 4
    //   2843: goto -424 -> 2419
    //   2846: iconst_1
    //   2847: istore 4
    //   2849: goto -430 -> 2419
    //   2852: astore_1
    //   2853: ldc -109
    //   2855: aload_1
    //   2856: ldc_w 453
    //   2859: iconst_0
    //   2860: anewarray 4	java/lang/Object
    //   2863: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2866: goto -363 -> 2503
    //   2869: astore_1
    //   2870: ldc -109
    //   2872: aload_1
    //   2873: ldc_w 453
    //   2876: iconst_0
    //   2877: anewarray 4	java/lang/Object
    //   2880: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2883: ldc2_w 211
    //   2886: ldc -43
    //   2888: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2891: return
    //   2892: iload_3
    //   2893: istore 4
    //   2895: iload_3
    //   2896: istore 5
    //   2898: iload_3
    //   2899: istore 6
    //   2901: iload_3
    //   2902: istore 7
    //   2904: iload_3
    //   2905: istore 8
    //   2907: iload_3
    //   2908: istore 9
    //   2910: aload 17
    //   2912: aload 22
    //   2914: iconst_0
    //   2915: iload 10
    //   2917: invokevirtual 526	java/io/ByteArrayOutputStream:write	([BII)V
    //   2920: iload_3
    //   2921: iload 10
    //   2923: iadd
    //   2924: istore_3
    //   2925: goto -574 -> 2351
    //   2928: iload_3
    //   2929: istore 4
    //   2931: iload_3
    //   2932: istore 5
    //   2934: iload_3
    //   2935: istore 6
    //   2937: iload_3
    //   2938: istore 7
    //   2940: iload_3
    //   2941: istore 8
    //   2943: iload_3
    //   2944: istore 9
    //   2946: aload 17
    //   2948: invokevirtual 527	java/io/ByteArrayOutputStream:flush	()V
    //   2951: iload_3
    //   2952: istore 4
    //   2954: iload_3
    //   2955: istore 5
    //   2957: iload_3
    //   2958: istore 6
    //   2960: iload_3
    //   2961: istore 7
    //   2963: iload_3
    //   2964: istore 8
    //   2966: iload_3
    //   2967: istore 9
    //   2969: aload 13
    //   2971: invokevirtual 361	java/io/InputStream:close	()V
    //   2974: iload_3
    //   2975: istore 4
    //   2977: iload_3
    //   2978: istore 5
    //   2980: iload_3
    //   2981: istore 6
    //   2983: iload_3
    //   2984: istore 7
    //   2986: iload_3
    //   2987: istore 8
    //   2989: iload_3
    //   2990: istore 9
    //   2992: ldc_w 529
    //   2995: aload_1
    //   2996: getfield 532	com/tencent/mm/plugin/appbrand/h/d:jja	Ljava/lang/String;
    //   2999: invokevirtual 176	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3002: ifeq +185 -> 3187
    //   3005: iload_3
    //   3006: istore 4
    //   3008: iload_3
    //   3009: istore 5
    //   3011: iload_3
    //   3012: istore 6
    //   3014: iload_3
    //   3015: istore 7
    //   3017: iload_3
    //   3018: istore 8
    //   3020: iload_3
    //   3021: istore 9
    //   3023: aload 17
    //   3025: invokevirtual 536	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   3028: invokestatic 542	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   3031: astore 15
    //   3033: iload_3
    //   3034: istore 4
    //   3036: iload_3
    //   3037: istore 5
    //   3039: iload_3
    //   3040: istore 6
    //   3042: iload_3
    //   3043: istore 7
    //   3045: iload_3
    //   3046: istore 8
    //   3048: iload_3
    //   3049: istore 9
    //   3051: ldc -109
    //   3053: ldc_w 544
    //   3056: iconst_2
    //   3057: anewarray 4	java/lang/Object
    //   3060: dup
    //   3061: iconst_0
    //   3062: aload_1
    //   3063: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3066: aastore
    //   3067: dup
    //   3068: iconst_1
    //   3069: aload 17
    //   3071: invokevirtual 545	java/io/ByteArrayOutputStream:size	()I
    //   3074: invokestatic 419	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   3077: aastore
    //   3078: invokestatic 548	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3081: iload_3
    //   3082: istore 4
    //   3084: iload_3
    //   3085: istore 5
    //   3087: iload_3
    //   3088: istore 6
    //   3090: iload_3
    //   3091: istore 7
    //   3093: iload_3
    //   3094: istore 8
    //   3096: iload_3
    //   3097: istore 9
    //   3099: aload 39
    //   3101: ldc_w 444
    //   3104: aload 15
    //   3106: iload_2
    //   3107: aload 12
    //   3109: invokestatic 448	com/tencent/mm/plugin/appbrand/h/c:b	(Ljava/net/HttpURLConnection;)Lorg/json/JSONObject;
    //   3112: invokeinterface 451 5 0
    //   3117: aload_0
    //   3118: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   3121: aload_1
    //   3122: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   3125: aload_1
    //   3126: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   3129: aload_1
    //   3130: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3133: aload_1
    //   3134: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   3137: iload_3
    //   3138: i2l
    //   3139: iload_2
    //   3140: iconst_1
    //   3141: aload_1
    //   3142: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   3145: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3148: aload_0
    //   3149: aload_1
    //   3150: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3153: aload 12
    //   3155: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3158: aload 13
    //   3160: ifnull +8 -> 3168
    //   3163: aload 13
    //   3165: invokevirtual 361	java/io/InputStream:close	()V
    //   3168: aload 14
    //   3170: ifnull +1214 -> 4384
    //   3173: aload 14
    //   3175: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   3178: ldc2_w 211
    //   3181: ldc -43
    //   3183: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3186: return
    //   3187: iload_3
    //   3188: istore 4
    //   3190: iload_3
    //   3191: istore 5
    //   3193: iload_3
    //   3194: istore 6
    //   3196: iload_3
    //   3197: istore 7
    //   3199: iload_3
    //   3200: istore 8
    //   3202: iload_3
    //   3203: istore 9
    //   3205: aload 17
    //   3207: ldc_w 550
    //   3210: invokevirtual 553	java/io/ByteArrayOutputStream:toString	(Ljava/lang/String;)Ljava/lang/String;
    //   3213: invokestatic 558	com/tencent/mm/plugin/appbrand/o/d:se	(Ljava/lang/String;)Ljava/lang/String;
    //   3216: astore 15
    //   3218: goto -185 -> 3033
    //   3221: astore_1
    //   3222: ldc -109
    //   3224: aload_1
    //   3225: ldc_w 453
    //   3228: iconst_0
    //   3229: anewarray 4	java/lang/Object
    //   3232: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3235: goto -67 -> 3168
    //   3238: astore_1
    //   3239: ldc -109
    //   3241: aload_1
    //   3242: ldc_w 453
    //   3245: iconst_0
    //   3246: anewarray 4	java/lang/Object
    //   3249: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3252: ldc2_w 211
    //   3255: ldc -43
    //   3257: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3260: return
    //   3261: astore_1
    //   3262: ldc -109
    //   3264: aload_1
    //   3265: ldc_w 453
    //   3268: iconst_0
    //   3269: anewarray 4	java/lang/Object
    //   3272: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3275: goto -2034 -> 1241
    //   3278: astore_1
    //   3279: ldc -109
    //   3281: aload_1
    //   3282: ldc_w 453
    //   3285: iconst_0
    //   3286: anewarray 4	java/lang/Object
    //   3289: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3292: ldc2_w 211
    //   3295: ldc -43
    //   3297: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3300: return
    //   3301: astore 16
    //   3303: aconst_null
    //   3304: astore 12
    //   3306: iconst_0
    //   3307: istore_2
    //   3308: aload 30
    //   3310: astore 18
    //   3312: iload 5
    //   3314: istore_3
    //   3315: iload_2
    //   3316: istore 4
    //   3318: aload 17
    //   3320: astore 14
    //   3322: aload 18
    //   3324: astore 15
    //   3326: aload 12
    //   3328: astore 13
    //   3330: getstatic 258	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   3333: ldc2_w 259
    //   3336: ldc2_w 559
    //   3339: lconst_1
    //   3340: iconst_0
    //   3341: invokevirtual 263	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   3344: iload 5
    //   3346: istore_3
    //   3347: iload_2
    //   3348: istore 4
    //   3350: aload 17
    //   3352: astore 14
    //   3354: aload 18
    //   3356: astore 15
    //   3358: aload 12
    //   3360: astore 13
    //   3362: ldc -109
    //   3364: ldc_w 562
    //   3367: iconst_2
    //   3368: anewarray 4	java/lang/Object
    //   3371: dup
    //   3372: iconst_0
    //   3373: aload_1
    //   3374: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3377: aastore
    //   3378: dup
    //   3379: iconst_1
    //   3380: aload 16
    //   3382: invokevirtual 563	javax/net/ssl/SSLHandshakeException:toString	()Ljava/lang/String;
    //   3385: aastore
    //   3386: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3389: iload 5
    //   3391: istore_3
    //   3392: iload_2
    //   3393: istore 4
    //   3395: aload 17
    //   3397: astore 14
    //   3399: aload 18
    //   3401: astore 15
    //   3403: aload 12
    //   3405: astore 13
    //   3407: aload 39
    //   3409: ldc_w 565
    //   3412: invokeinterface 234 2 0
    //   3417: aload_0
    //   3418: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   3421: aload_1
    //   3422: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   3425: aload_1
    //   3426: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   3429: aload_1
    //   3430: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3433: aload_1
    //   3434: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   3437: iload 5
    //   3439: i2l
    //   3440: iload_2
    //   3441: iconst_2
    //   3442: aload_1
    //   3443: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   3446: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3449: aload_0
    //   3450: aload_1
    //   3451: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3454: aload 12
    //   3456: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3459: aload 18
    //   3461: ifnull +8 -> 3469
    //   3464: aload 18
    //   3466: invokevirtual 361	java/io/InputStream:close	()V
    //   3469: aload 17
    //   3471: ifnull +913 -> 4384
    //   3474: aload 17
    //   3476: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   3479: ldc2_w 211
    //   3482: ldc -43
    //   3484: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3487: return
    //   3488: astore_1
    //   3489: ldc -109
    //   3491: aload_1
    //   3492: ldc_w 453
    //   3495: iconst_0
    //   3496: anewarray 4	java/lang/Object
    //   3499: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3502: goto -33 -> 3469
    //   3505: astore_1
    //   3506: ldc -109
    //   3508: aload_1
    //   3509: ldc_w 453
    //   3512: iconst_0
    //   3513: anewarray 4	java/lang/Object
    //   3516: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3519: ldc2_w 211
    //   3522: ldc -43
    //   3524: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3527: return
    //   3528: astore 16
    //   3530: aconst_null
    //   3531: astore 12
    //   3533: iconst_0
    //   3534: istore_2
    //   3535: aload 31
    //   3537: astore 18
    //   3539: aload 15
    //   3541: astore 17
    //   3543: iload_3
    //   3544: istore 5
    //   3546: iload 5
    //   3548: istore_3
    //   3549: iload_2
    //   3550: istore 4
    //   3552: aload 17
    //   3554: astore 14
    //   3556: aload 18
    //   3558: astore 15
    //   3560: aload 12
    //   3562: astore 13
    //   3564: getstatic 258	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   3567: ldc2_w 259
    //   3570: ldc2_w 566
    //   3573: lconst_1
    //   3574: iconst_0
    //   3575: invokevirtual 263	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   3578: iload 5
    //   3580: istore_3
    //   3581: iload_2
    //   3582: istore 4
    //   3584: aload 17
    //   3586: astore 14
    //   3588: aload 18
    //   3590: astore 15
    //   3592: aload 12
    //   3594: astore 13
    //   3596: ldc -109
    //   3598: ldc_w 569
    //   3601: iconst_2
    //   3602: anewarray 4	java/lang/Object
    //   3605: dup
    //   3606: iconst_0
    //   3607: aload_1
    //   3608: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3611: aastore
    //   3612: dup
    //   3613: iconst_1
    //   3614: aload 16
    //   3616: invokevirtual 570	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   3619: aastore
    //   3620: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3623: iload 5
    //   3625: istore_3
    //   3626: iload_2
    //   3627: istore 4
    //   3629: aload 17
    //   3631: astore 14
    //   3633: aload 18
    //   3635: astore 15
    //   3637: aload 12
    //   3639: astore 13
    //   3641: aload 39
    //   3643: ldc_w 572
    //   3646: invokeinterface 234 2 0
    //   3651: aload_0
    //   3652: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   3655: aload_1
    //   3656: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   3659: aload_1
    //   3660: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   3663: aload_1
    //   3664: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3667: aload_1
    //   3668: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   3671: iload 5
    //   3673: i2l
    //   3674: iload_2
    //   3675: iconst_2
    //   3676: aload_1
    //   3677: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   3680: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3683: aload_0
    //   3684: aload_1
    //   3685: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3688: aload 12
    //   3690: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3693: aload 18
    //   3695: ifnull +8 -> 3703
    //   3698: aload 18
    //   3700: invokevirtual 361	java/io/InputStream:close	()V
    //   3703: aload 17
    //   3705: ifnull +679 -> 4384
    //   3708: aload 17
    //   3710: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   3713: ldc2_w 211
    //   3716: ldc -43
    //   3718: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3721: return
    //   3722: astore_1
    //   3723: ldc -109
    //   3725: aload_1
    //   3726: ldc_w 453
    //   3729: iconst_0
    //   3730: anewarray 4	java/lang/Object
    //   3733: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3736: goto -33 -> 3703
    //   3739: astore_1
    //   3740: ldc -109
    //   3742: aload_1
    //   3743: ldc_w 453
    //   3746: iconst_0
    //   3747: anewarray 4	java/lang/Object
    //   3750: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3753: ldc2_w 211
    //   3756: ldc -43
    //   3758: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3761: return
    //   3762: astore 16
    //   3764: aconst_null
    //   3765: astore 12
    //   3767: iconst_0
    //   3768: istore_2
    //   3769: aload 32
    //   3771: astore 18
    //   3773: aload 19
    //   3775: astore 17
    //   3777: iload 4
    //   3779: istore 5
    //   3781: iload 5
    //   3783: istore_3
    //   3784: iload_2
    //   3785: istore 4
    //   3787: aload 17
    //   3789: astore 14
    //   3791: aload 18
    //   3793: astore 15
    //   3795: aload 12
    //   3797: astore 13
    //   3799: getstatic 258	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   3802: ldc2_w 259
    //   3805: ldc2_w 573
    //   3808: lconst_1
    //   3809: iconst_0
    //   3810: invokevirtual 263	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   3813: iload 5
    //   3815: istore_3
    //   3816: iload_2
    //   3817: istore 4
    //   3819: aload 17
    //   3821: astore 14
    //   3823: aload 18
    //   3825: astore 15
    //   3827: aload 12
    //   3829: astore 13
    //   3831: ldc -109
    //   3833: ldc_w 576
    //   3836: iconst_2
    //   3837: anewarray 4	java/lang/Object
    //   3840: dup
    //   3841: iconst_0
    //   3842: aload_1
    //   3843: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3846: aastore
    //   3847: dup
    //   3848: iconst_1
    //   3849: aload 16
    //   3851: invokevirtual 577	java/net/SocketTimeoutException:toString	()Ljava/lang/String;
    //   3854: aastore
    //   3855: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3858: iload 5
    //   3860: istore_3
    //   3861: iload_2
    //   3862: istore 4
    //   3864: aload 17
    //   3866: astore 14
    //   3868: aload 18
    //   3870: astore 15
    //   3872: aload 12
    //   3874: astore 13
    //   3876: aload 39
    //   3878: new 122	java/lang/StringBuilder
    //   3881: dup
    //   3882: ldc_w 579
    //   3885: invokespecial 308	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3888: aload 16
    //   3890: invokevirtual 582	java/net/SocketTimeoutException:getMessage	()Ljava/lang/String;
    //   3893: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3896: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3899: invokeinterface 234 2 0
    //   3904: aload_0
    //   3905: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   3908: aload_1
    //   3909: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   3912: aload_1
    //   3913: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   3916: aload_1
    //   3917: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3920: aload_1
    //   3921: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   3924: iload 5
    //   3926: i2l
    //   3927: iload_2
    //   3928: iconst_2
    //   3929: aload_1
    //   3930: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   3933: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   3936: aload_0
    //   3937: aload_1
    //   3938: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   3941: aload 12
    //   3943: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   3946: aload 18
    //   3948: ifnull +8 -> 3956
    //   3951: aload 18
    //   3953: invokevirtual 361	java/io/InputStream:close	()V
    //   3956: aload 17
    //   3958: ifnull +426 -> 4384
    //   3961: aload 17
    //   3963: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   3966: ldc2_w 211
    //   3969: ldc -43
    //   3971: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   3974: return
    //   3975: astore_1
    //   3976: ldc -109
    //   3978: aload_1
    //   3979: ldc_w 453
    //   3982: iconst_0
    //   3983: anewarray 4	java/lang/Object
    //   3986: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3989: goto -33 -> 3956
    //   3992: astore_1
    //   3993: ldc -109
    //   3995: aload_1
    //   3996: ldc_w 453
    //   3999: iconst_0
    //   4000: anewarray 4	java/lang/Object
    //   4003: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4006: ldc2_w 211
    //   4009: ldc -43
    //   4011: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4014: return
    //   4015: astore 16
    //   4017: aconst_null
    //   4018: astore 12
    //   4020: iconst_0
    //   4021: istore_2
    //   4022: aload 33
    //   4024: astore 18
    //   4026: aload 20
    //   4028: astore 17
    //   4030: iload 6
    //   4032: istore 5
    //   4034: iload 5
    //   4036: istore_3
    //   4037: iload_2
    //   4038: istore 4
    //   4040: aload 17
    //   4042: astore 14
    //   4044: aload 18
    //   4046: astore 15
    //   4048: aload 12
    //   4050: astore 13
    //   4052: getstatic 258	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   4055: ldc2_w 259
    //   4058: ldc2_w 583
    //   4061: lconst_1
    //   4062: iconst_0
    //   4063: invokevirtual 263	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   4066: iload 5
    //   4068: istore_3
    //   4069: iload_2
    //   4070: istore 4
    //   4072: aload 17
    //   4074: astore 14
    //   4076: aload 18
    //   4078: astore 15
    //   4080: aload 12
    //   4082: astore 13
    //   4084: ldc -109
    //   4086: ldc_w 586
    //   4089: iconst_2
    //   4090: anewarray 4	java/lang/Object
    //   4093: dup
    //   4094: iconst_0
    //   4095: aload_1
    //   4096: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4099: aastore
    //   4100: dup
    //   4101: iconst_1
    //   4102: aload 16
    //   4104: invokevirtual 491	java/lang/Exception:toString	()Ljava/lang/String;
    //   4107: aastore
    //   4108: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4111: iload 5
    //   4113: istore_3
    //   4114: iload_2
    //   4115: istore 4
    //   4117: aload 17
    //   4119: astore 14
    //   4121: aload 18
    //   4123: astore 15
    //   4125: aload 12
    //   4127: astore 13
    //   4129: aload 39
    //   4131: new 122	java/lang/StringBuilder
    //   4134: dup
    //   4135: ldc_w 579
    //   4138: invokespecial 308	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4141: aload 16
    //   4143: invokevirtual 587	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   4146: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4149: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4152: invokeinterface 234 2 0
    //   4157: aload_0
    //   4158: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   4161: aload_1
    //   4162: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   4165: aload_1
    //   4166: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   4169: aload_1
    //   4170: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4173: aload_1
    //   4174: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   4177: iload 5
    //   4179: i2l
    //   4180: iload_2
    //   4181: iconst_2
    //   4182: aload_1
    //   4183: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   4186: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   4189: aload_0
    //   4190: aload_1
    //   4191: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4194: aload 12
    //   4196: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   4199: aload 18
    //   4201: ifnull +8 -> 4209
    //   4204: aload 18
    //   4206: invokevirtual 361	java/io/InputStream:close	()V
    //   4209: aload 17
    //   4211: ifnull +173 -> 4384
    //   4214: aload 17
    //   4216: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   4219: ldc2_w 211
    //   4222: ldc -43
    //   4224: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4227: return
    //   4228: astore_1
    //   4229: ldc -109
    //   4231: aload_1
    //   4232: ldc_w 453
    //   4235: iconst_0
    //   4236: anewarray 4	java/lang/Object
    //   4239: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4242: goto -33 -> 4209
    //   4245: astore_1
    //   4246: ldc -109
    //   4248: aload_1
    //   4249: ldc_w 453
    //   4252: iconst_0
    //   4253: anewarray 4	java/lang/Object
    //   4256: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4259: ldc2_w 211
    //   4262: ldc -43
    //   4264: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4267: return
    //   4268: astore 12
    //   4270: iconst_0
    //   4271: istore_2
    //   4272: aconst_null
    //   4273: astore 13
    //   4275: aload 21
    //   4277: astore 15
    //   4279: aload 16
    //   4281: astore 14
    //   4283: iload 7
    //   4285: istore_3
    //   4286: aload_0
    //   4287: getfield 42	com/tencent/mm/plugin/appbrand/h/c:iqL	Ljava/lang/String;
    //   4290: aload_1
    //   4291: getfield 237	com/tencent/mm/plugin/appbrand/h/d:jjc	Ljava/lang/String;
    //   4294: aload_1
    //   4295: getfield 240	com/tencent/mm/plugin/appbrand/h/d:jiV	Ljava/lang/String;
    //   4298: aload_1
    //   4299: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4302: aload_1
    //   4303: invokevirtual 284	com/tencent/mm/plugin/appbrand/h/d:getDataSize	()J
    //   4306: iload_3
    //   4307: i2l
    //   4308: iload_2
    //   4309: iconst_2
    //   4310: aload_1
    //   4311: invokevirtual 243	com/tencent/mm/plugin/appbrand/h/d:Yz	()I
    //   4314: invokestatic 248	com/tencent/mm/plugin/appbrand/report/a/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIII)V
    //   4317: aload_0
    //   4318: aload_1
    //   4319: getfield 172	com/tencent/mm/plugin/appbrand/h/d:mUrl	Ljava/lang/String;
    //   4322: aload 13
    //   4324: invokevirtual 287	com/tencent/mm/plugin/appbrand/h/c:a	(Ljava/lang/String;Ljava/net/HttpURLConnection;)V
    //   4327: aload 15
    //   4329: ifnull +8 -> 4337
    //   4332: aload 15
    //   4334: invokevirtual 361	java/io/InputStream:close	()V
    //   4337: aload 14
    //   4339: ifnull +8 -> 4347
    //   4342: aload 14
    //   4344: invokevirtual 364	java/io/DataOutputStream:close	()V
    //   4347: aload 12
    //   4349: athrow
    //   4350: astore_1
    //   4351: ldc -109
    //   4353: aload_1
    //   4354: ldc_w 453
    //   4357: iconst_0
    //   4358: anewarray 4	java/lang/Object
    //   4361: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4364: goto -27 -> 4337
    //   4367: astore_1
    //   4368: ldc -109
    //   4370: aload_1
    //   4371: ldc_w 453
    //   4374: iconst_0
    //   4375: anewarray 4	java/lang/Object
    //   4378: invokestatic 457	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4381: goto -34 -> 4347
    //   4384: ldc2_w 211
    //   4387: ldc -43
    //   4389: invokestatic 60	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4392: return
    //   4393: astore 14
    //   4395: iconst_0
    //   4396: istore_2
    //   4397: aload 12
    //   4399: astore 13
    //   4401: aload 14
    //   4403: astore 12
    //   4405: iload 7
    //   4407: istore_3
    //   4408: aload 15
    //   4410: astore 14
    //   4412: aload 21
    //   4414: astore 15
    //   4416: goto -130 -> 4286
    //   4419: astore 15
    //   4421: iconst_0
    //   4422: istore_2
    //   4423: aload 13
    //   4425: astore 14
    //   4427: aload 12
    //   4429: astore 13
    //   4431: aload 15
    //   4433: astore 12
    //   4435: iload 7
    //   4437: istore_3
    //   4438: aload 21
    //   4440: astore 15
    //   4442: goto -156 -> 4286
    //   4445: astore 16
    //   4447: aload 12
    //   4449: astore 13
    //   4451: aload 16
    //   4453: astore 12
    //   4455: iload 7
    //   4457: istore_3
    //   4458: goto -172 -> 4286
    //   4461: astore 15
    //   4463: iload 4
    //   4465: istore_3
    //   4466: aload 12
    //   4468: astore 16
    //   4470: aload 15
    //   4472: astore 12
    //   4474: aload 13
    //   4476: astore 15
    //   4478: aload 16
    //   4480: astore 13
    //   4482: goto -196 -> 4286
    //   4485: astore 12
    //   4487: iload_2
    //   4488: istore 4
    //   4490: iload_3
    //   4491: istore_2
    //   4492: iload 4
    //   4494: istore_3
    //   4495: goto -209 -> 4286
    //   4498: astore 12
    //   4500: iload 4
    //   4502: istore_2
    //   4503: goto -217 -> 4286
    //   4506: astore 16
    //   4508: iconst_0
    //   4509: istore_2
    //   4510: iload 6
    //   4512: istore 5
    //   4514: aload 33
    //   4516: astore 18
    //   4518: goto -484 -> 4034
    //   4521: astore 16
    //   4523: iconst_0
    //   4524: istore_2
    //   4525: iload 6
    //   4527: istore 5
    //   4529: aload 13
    //   4531: astore 17
    //   4533: aload 33
    //   4535: astore 18
    //   4537: goto -503 -> 4034
    //   4540: astore 16
    //   4542: iload 6
    //   4544: istore 5
    //   4546: aload 14
    //   4548: astore 17
    //   4550: aload 21
    //   4552: astore 18
    //   4554: goto -520 -> 4034
    //   4557: astore 16
    //   4559: aload 14
    //   4561: astore 17
    //   4563: aload 13
    //   4565: astore 18
    //   4567: goto -533 -> 4034
    //   4570: astore 16
    //   4572: iconst_0
    //   4573: istore_2
    //   4574: iload 4
    //   4576: istore 5
    //   4578: aload 18
    //   4580: astore 17
    //   4582: aload 32
    //   4584: astore 18
    //   4586: goto -805 -> 3781
    //   4589: astore 16
    //   4591: iconst_0
    //   4592: istore_2
    //   4593: iload 4
    //   4595: istore 5
    //   4597: aload 13
    //   4599: astore 17
    //   4601: aload 32
    //   4603: astore 18
    //   4605: goto -824 -> 3781
    //   4608: astore 16
    //   4610: iload 4
    //   4612: istore 5
    //   4614: aload 14
    //   4616: astore 17
    //   4618: goto -837 -> 3781
    //   4621: astore 16
    //   4623: iload 6
    //   4625: istore 5
    //   4627: aload 14
    //   4629: astore 17
    //   4631: aload 13
    //   4633: astore 18
    //   4635: goto -854 -> 3781
    //   4638: astore 16
    //   4640: iconst_0
    //   4641: istore_2
    //   4642: iload_3
    //   4643: istore 5
    //   4645: aload 19
    //   4647: astore 17
    //   4649: aload 31
    //   4651: astore 18
    //   4653: goto -1107 -> 3546
    //   4656: astore 16
    //   4658: iconst_0
    //   4659: istore_2
    //   4660: iload_3
    //   4661: istore 5
    //   4663: aload 13
    //   4665: astore 17
    //   4667: aload 31
    //   4669: astore 18
    //   4671: goto -1125 -> 3546
    //   4674: astore 16
    //   4676: iload_3
    //   4677: istore 5
    //   4679: aload 14
    //   4681: astore 17
    //   4683: aload 19
    //   4685: astore 18
    //   4687: goto -1141 -> 3546
    //   4690: astore 16
    //   4692: iload 7
    //   4694: istore 5
    //   4696: aload 14
    //   4698: astore 17
    //   4700: aload 13
    //   4702: astore 18
    //   4704: goto -1158 -> 3546
    //   4707: astore 16
    //   4709: iconst_0
    //   4710: istore_2
    //   4711: aload 20
    //   4713: astore 17
    //   4715: aload 30
    //   4717: astore 18
    //   4719: goto -1407 -> 3312
    //   4722: astore 16
    //   4724: iconst_0
    //   4725: istore_2
    //   4726: aload 13
    //   4728: astore 17
    //   4730: aload 30
    //   4732: astore 18
    //   4734: goto -1422 -> 3312
    //   4737: astore 16
    //   4739: aload 14
    //   4741: astore 17
    //   4743: aload 20
    //   4745: astore 18
    //   4747: goto -1435 -> 3312
    //   4750: astore 16
    //   4752: iload 8
    //   4754: istore 5
    //   4756: aload 14
    //   4758: astore 17
    //   4760: aload 13
    //   4762: astore 18
    //   4764: goto -1452 -> 3312
    //   4767: astore 12
    //   4769: aconst_null
    //   4770: astore 13
    //   4772: iconst_0
    //   4773: istore_3
    //   4774: iconst_0
    //   4775: istore_2
    //   4776: aload 18
    //   4778: astore 14
    //   4780: aload 29
    //   4782: astore 15
    //   4784: goto -3643 -> 1141
    //   4787: astore 15
    //   4789: aload 13
    //   4791: astore 14
    //   4793: aload 12
    //   4795: astore 13
    //   4797: iconst_0
    //   4798: istore_3
    //   4799: iconst_0
    //   4800: istore_2
    //   4801: aload 15
    //   4803: astore 12
    //   4805: aload 29
    //   4807: astore 15
    //   4809: goto -3668 -> 1141
    //   4812: astore 15
    //   4814: aload 12
    //   4816: astore 16
    //   4818: iload_2
    //   4819: istore_3
    //   4820: aload 15
    //   4822: astore 12
    //   4824: iload 9
    //   4826: istore_2
    //   4827: aload 13
    //   4829: astore 15
    //   4831: aload 16
    //   4833: astore 13
    //   4835: goto -3694 -> 1141
    //   4838: iconst_0
    //   4839: istore_3
    //   4840: goto -1759 -> 3081
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	4843	0	this	c
    //   0	4843	1	paramd	d
    //   1124	3703	2	i	int
    //   99	4741	3	j	int
    //   101	4510	4	k	int
    //   110	4645	5	m	int
    //   104	4520	6	n	int
    //   107	4586	7	i1	int
    //   1726	3027	8	i2	int
    //   2367	2458	9	i3	int
    //   2376	548	10	i4	int
    //   2813	3	11	i5	int
    //   253	3942	12	localObject1	Object
    //   4268	130	12	localObject2	Object
    //   4403	70	12	localObject3	Object
    //   4485	1	12	localObject4	Object
    //   4498	1	12	localObject5	Object
    //   4767	27	12	localUnsupportedEncodingException1	java.io.UnsupportedEncodingException
    //   4803	20	12	localUnsupportedEncodingException2	java.io.UnsupportedEncodingException
    //   84	2464	13	localObject6	Object
    //   2552	38	13	localException1	Exception
    //   2664	31	13	localObject7	Object
    //   2699	38	13	localException2	Exception
    //   2747	2087	13	localObject8	Object
    //   51	4292	14	localObject9	Object
    //   4393	9	14	localObject10	Object
    //   4410	382	14	localObject11	Object
    //   57	2651	15	localObject12	Object
    //   2752	12	15	localUnsupportedEncodingException3	java.io.UnsupportedEncodingException
    //   2772	1643	15	localObject13	Object
    //   4419	13	15	localObject14	Object
    //   4440	1	15	localObject15	Object
    //   4461	10	15	localObject16	Object
    //   4476	307	15	localObject17	Object
    //   4787	15	15	localUnsupportedEncodingException4	java.io.UnsupportedEncodingException
    //   4807	1	15	localObject18	Object
    //   4812	9	15	localUnsupportedEncodingException5	java.io.UnsupportedEncodingException
    //   4829	1	15	localObject19	Object
    //   66	2705	16	localObject20	Object
    //   3301	80	16	localSSLHandshakeException1	javax.net.ssl.SSLHandshakeException
    //   3528	87	16	localFileNotFoundException1	java.io.FileNotFoundException
    //   3762	127	16	localSocketTimeoutException1	java.net.SocketTimeoutException
    //   4015	265	16	localException3	Exception
    //   4445	7	16	localObject21	Object
    //   4468	11	16	localObject22	Object
    //   4506	1	16	localException4	Exception
    //   4521	1	16	localException5	Exception
    //   4540	1	16	localException6	Exception
    //   4557	1	16	localException7	Exception
    //   4570	1	16	localSocketTimeoutException2	java.net.SocketTimeoutException
    //   4589	1	16	localSocketTimeoutException3	java.net.SocketTimeoutException
    //   4608	1	16	localSocketTimeoutException4	java.net.SocketTimeoutException
    //   4621	1	16	localSocketTimeoutException5	java.net.SocketTimeoutException
    //   4638	1	16	localFileNotFoundException2	java.io.FileNotFoundException
    //   4656	1	16	localFileNotFoundException3	java.io.FileNotFoundException
    //   4674	1	16	localFileNotFoundException4	java.io.FileNotFoundException
    //   4690	1	16	localFileNotFoundException5	java.io.FileNotFoundException
    //   4707	1	16	localSSLHandshakeException2	javax.net.ssl.SSLHandshakeException
    //   4722	1	16	localSSLHandshakeException3	javax.net.ssl.SSLHandshakeException
    //   4737	1	16	localSSLHandshakeException4	javax.net.ssl.SSLHandshakeException
    //   4750	1	16	localSSLHandshakeException5	javax.net.ssl.SSLHandshakeException
    //   4816	16	16	localObject23	Object
    //   54	1010	17	localObject24	Object
    //   1119	19	17	localUnsupportedEncodingException6	java.io.UnsupportedEncodingException
    //   1270	3489	17	localObject25	Object
    //   48	4729	18	localObject26	Object
    //   60	4624	19	localObject27	Object
    //   63	4681	20	localObject28	Object
    //   27	4524	21	localObject29	Object
    //   9	2904	22	arrayOfByte	byte[]
    //   12	2690	23	localObject30	Object
    //   30	2676	24	localObject31	Object
    //   33	2677	25	localObject32	Object
    //   36	2678	26	localObject33	Object
    //   39	2679	27	localObject34	Object
    //   42	2680	28	localObject35	Object
    //   45	4761	29	localObject36	Object
    //   15	4716	30	localObject37	Object
    //   18	4650	31	localObject38	Object
    //   21	4581	32	localObject39	Object
    //   24	4510	33	localObject40	Object
    //   69	1374	34	localObject41	Object
    //   72	1375	35	localObject42	Object
    //   75	1376	36	localObject43	Object
    //   78	1377	37	localObject44	Object
    //   81	1378	38	localObject45	Object
    //   90	4040	39	locala	a
    //   96	897	40	localObject46	Object
    //   116	990	41	localObject47	Object
    // Exception table:
    //   from	to	target	type
    //   279	289	1119	java/io/UnsupportedEncodingException
    //   313	319	1119	java/io/UnsupportedEncodingException
    //   397	405	1119	java/io/UnsupportedEncodingException
    //   429	436	1119	java/io/UnsupportedEncodingException
    //   460	471	1119	java/io/UnsupportedEncodingException
    //   495	502	1119	java/io/UnsupportedEncodingException
    //   526	541	1119	java/io/UnsupportedEncodingException
    //   565	588	1119	java/io/UnsupportedEncodingException
    //   612	619	1119	java/io/UnsupportedEncodingException
    //   643	652	1119	java/io/UnsupportedEncodingException
    //   676	685	1119	java/io/UnsupportedEncodingException
    //   709	720	1119	java/io/UnsupportedEncodingException
    //   744	750	1119	java/io/UnsupportedEncodingException
    //   774	783	1119	java/io/UnsupportedEncodingException
    //   807	813	1119	java/io/UnsupportedEncodingException
    //   837	848	1119	java/io/UnsupportedEncodingException
    //   877	896	1119	java/io/UnsupportedEncodingException
    //   920	934	1119	java/io/UnsupportedEncodingException
    //   958	968	1119	java/io/UnsupportedEncodingException
    //   992	1004	1119	java/io/UnsupportedEncodingException
    //   1028	1053	1119	java/io/UnsupportedEncodingException
    //   1077	1116	1119	java/io/UnsupportedEncodingException
    //   1284	1302	1119	java/io/UnsupportedEncodingException
    //   1326	1336	1119	java/io/UnsupportedEncodingException
    //   1360	1368	1119	java/io/UnsupportedEncodingException
    //   1392	1408	1119	java/io/UnsupportedEncodingException
    //   1432	1438	1119	java/io/UnsupportedEncodingException
    //   1462	1476	1119	java/io/UnsupportedEncodingException
    //   1523	1529	1119	java/io/UnsupportedEncodingException
    //   1897	1902	1911	java/io/IOException
    //   2172	2177	2186	java/io/IOException
    //   2262	2276	2552	java/lang/Exception
    //   2296	2310	2552	java/lang/Exception
    //   2542	2549	2552	java/lang/Exception
    //   2618	2632	2699	java/lang/Exception
    //   2652	2666	2699	java/lang/Exception
    //   2689	2696	2699	java/lang/Exception
    //   1553	1579	2752	java/io/UnsupportedEncodingException
    //   1610	1636	2752	java/io/UnsupportedEncodingException
    //   1660	1667	2752	java/io/UnsupportedEncodingException
    //   1691	1698	2752	java/io/UnsupportedEncodingException
    //   1722	1728	2752	java/io/UnsupportedEncodingException
    //   1752	1760	2752	java/io/UnsupportedEncodingException
    //   1789	1809	2752	java/io/UnsupportedEncodingException
    //   1833	1852	2752	java/io/UnsupportedEncodingException
    //   1958	1990	2752	java/io/UnsupportedEncodingException
    //   2014	2020	2752	java/io/UnsupportedEncodingException
    //   2044	2052	2752	java/io/UnsupportedEncodingException
    //   2076	2098	2752	java/io/UnsupportedEncodingException
    //   2122	2127	2752	java/io/UnsupportedEncodingException
    //   2233	2242	2752	java/io/UnsupportedEncodingException
    //   2262	2276	2752	java/io/UnsupportedEncodingException
    //   2296	2310	2752	java/io/UnsupportedEncodingException
    //   2342	2349	2752	java/io/UnsupportedEncodingException
    //   2542	2549	2752	java/io/UnsupportedEncodingException
    //   2578	2598	2752	java/io/UnsupportedEncodingException
    //   2618	2632	2752	java/io/UnsupportedEncodingException
    //   2652	2666	2752	java/io/UnsupportedEncodingException
    //   2689	2696	2752	java/io/UnsupportedEncodingException
    //   2725	2745	2752	java/io/UnsupportedEncodingException
    //   2498	2503	2852	java/io/IOException
    //   2508	2513	2869	java/io/IOException
    //   3163	3168	3221	java/io/IOException
    //   3173	3178	3238	java/io/IOException
    //   1236	1241	3261	java/io/IOException
    //   1246	1251	3278	java/io/IOException
    //   236	255	3301	javax/net/ssl/SSLHandshakeException
    //   3464	3469	3488	java/io/IOException
    //   3474	3479	3505	java/io/IOException
    //   236	255	3528	java/io/FileNotFoundException
    //   3698	3703	3722	java/io/IOException
    //   3708	3713	3739	java/io/IOException
    //   236	255	3762	java/net/SocketTimeoutException
    //   3951	3956	3975	java/io/IOException
    //   3961	3966	3992	java/io/IOException
    //   236	255	4015	java/lang/Exception
    //   4204	4209	4228	java/io/IOException
    //   4214	4219	4245	java/io/IOException
    //   236	255	4268	finally
    //   4332	4337	4350	java/io/IOException
    //   4342	4347	4367	java/io/IOException
    //   279	289	4393	finally
    //   313	319	4393	finally
    //   397	405	4393	finally
    //   429	436	4393	finally
    //   460	471	4393	finally
    //   495	502	4393	finally
    //   526	541	4393	finally
    //   565	588	4393	finally
    //   612	619	4393	finally
    //   643	652	4393	finally
    //   676	685	4393	finally
    //   709	720	4393	finally
    //   744	750	4393	finally
    //   774	783	4393	finally
    //   807	813	4393	finally
    //   837	848	4393	finally
    //   877	896	4393	finally
    //   920	934	4393	finally
    //   958	968	4393	finally
    //   992	1004	4393	finally
    //   1028	1053	4393	finally
    //   1077	1116	4393	finally
    //   1284	1302	4393	finally
    //   1326	1336	4393	finally
    //   1360	1368	4393	finally
    //   1392	1408	4393	finally
    //   1432	1438	4393	finally
    //   1462	1476	4393	finally
    //   1523	1529	4393	finally
    //   1476	1495	4419	finally
    //   1553	1579	4445	finally
    //   1610	1636	4445	finally
    //   1660	1667	4445	finally
    //   1691	1698	4445	finally
    //   1722	1728	4445	finally
    //   1752	1760	4445	finally
    //   1789	1809	4445	finally
    //   1833	1852	4445	finally
    //   1958	1990	4445	finally
    //   2014	2020	4445	finally
    //   2044	2052	4445	finally
    //   2076	2098	4445	finally
    //   2122	2127	4445	finally
    //   2233	2242	4445	finally
    //   2262	2276	4445	finally
    //   2296	2310	4445	finally
    //   2342	2349	4445	finally
    //   2542	2549	4445	finally
    //   2578	2598	4445	finally
    //   2618	2632	4445	finally
    //   2652	2666	4445	finally
    //   2689	2696	4445	finally
    //   2725	2745	4445	finally
    //   2369	2378	4461	finally
    //   2402	2411	4461	finally
    //   2442	2452	4461	finally
    //   2795	2815	4461	finally
    //   2910	2920	4461	finally
    //   2946	2951	4461	finally
    //   2969	2974	4461	finally
    //   2992	3005	4461	finally
    //   3023	3033	4461	finally
    //   3051	3081	4461	finally
    //   3099	3117	4461	finally
    //   3205	3218	4461	finally
    //   1141	1190	4485	finally
    //   3330	3344	4498	finally
    //   3362	3389	4498	finally
    //   3407	3417	4498	finally
    //   3564	3578	4498	finally
    //   3596	3623	4498	finally
    //   3641	3651	4498	finally
    //   3799	3813	4498	finally
    //   3831	3858	4498	finally
    //   3876	3904	4498	finally
    //   4052	4066	4498	finally
    //   4084	4111	4498	finally
    //   4129	4157	4498	finally
    //   279	289	4506	java/lang/Exception
    //   313	319	4506	java/lang/Exception
    //   397	405	4506	java/lang/Exception
    //   429	436	4506	java/lang/Exception
    //   460	471	4506	java/lang/Exception
    //   495	502	4506	java/lang/Exception
    //   526	541	4506	java/lang/Exception
    //   565	588	4506	java/lang/Exception
    //   612	619	4506	java/lang/Exception
    //   643	652	4506	java/lang/Exception
    //   676	685	4506	java/lang/Exception
    //   709	720	4506	java/lang/Exception
    //   744	750	4506	java/lang/Exception
    //   774	783	4506	java/lang/Exception
    //   807	813	4506	java/lang/Exception
    //   837	848	4506	java/lang/Exception
    //   877	896	4506	java/lang/Exception
    //   920	934	4506	java/lang/Exception
    //   958	968	4506	java/lang/Exception
    //   992	1004	4506	java/lang/Exception
    //   1028	1053	4506	java/lang/Exception
    //   1077	1116	4506	java/lang/Exception
    //   1284	1302	4506	java/lang/Exception
    //   1326	1336	4506	java/lang/Exception
    //   1360	1368	4506	java/lang/Exception
    //   1392	1408	4506	java/lang/Exception
    //   1432	1438	4506	java/lang/Exception
    //   1462	1476	4506	java/lang/Exception
    //   1523	1529	4506	java/lang/Exception
    //   1476	1495	4521	java/lang/Exception
    //   1553	1579	4540	java/lang/Exception
    //   1610	1636	4540	java/lang/Exception
    //   1660	1667	4540	java/lang/Exception
    //   1691	1698	4540	java/lang/Exception
    //   1722	1728	4540	java/lang/Exception
    //   1752	1760	4540	java/lang/Exception
    //   1789	1809	4540	java/lang/Exception
    //   1833	1852	4540	java/lang/Exception
    //   1958	1990	4540	java/lang/Exception
    //   2014	2020	4540	java/lang/Exception
    //   2044	2052	4540	java/lang/Exception
    //   2076	2098	4540	java/lang/Exception
    //   2122	2127	4540	java/lang/Exception
    //   2233	2242	4540	java/lang/Exception
    //   2342	2349	4540	java/lang/Exception
    //   2578	2598	4540	java/lang/Exception
    //   2725	2745	4540	java/lang/Exception
    //   2369	2378	4557	java/lang/Exception
    //   2402	2411	4557	java/lang/Exception
    //   2442	2452	4557	java/lang/Exception
    //   2795	2815	4557	java/lang/Exception
    //   2910	2920	4557	java/lang/Exception
    //   2946	2951	4557	java/lang/Exception
    //   2969	2974	4557	java/lang/Exception
    //   2992	3005	4557	java/lang/Exception
    //   3023	3033	4557	java/lang/Exception
    //   3051	3081	4557	java/lang/Exception
    //   3099	3117	4557	java/lang/Exception
    //   3205	3218	4557	java/lang/Exception
    //   279	289	4570	java/net/SocketTimeoutException
    //   313	319	4570	java/net/SocketTimeoutException
    //   397	405	4570	java/net/SocketTimeoutException
    //   429	436	4570	java/net/SocketTimeoutException
    //   460	471	4570	java/net/SocketTimeoutException
    //   495	502	4570	java/net/SocketTimeoutException
    //   526	541	4570	java/net/SocketTimeoutException
    //   565	588	4570	java/net/SocketTimeoutException
    //   612	619	4570	java/net/SocketTimeoutException
    //   643	652	4570	java/net/SocketTimeoutException
    //   676	685	4570	java/net/SocketTimeoutException
    //   709	720	4570	java/net/SocketTimeoutException
    //   744	750	4570	java/net/SocketTimeoutException
    //   774	783	4570	java/net/SocketTimeoutException
    //   807	813	4570	java/net/SocketTimeoutException
    //   837	848	4570	java/net/SocketTimeoutException
    //   877	896	4570	java/net/SocketTimeoutException
    //   920	934	4570	java/net/SocketTimeoutException
    //   958	968	4570	java/net/SocketTimeoutException
    //   992	1004	4570	java/net/SocketTimeoutException
    //   1028	1053	4570	java/net/SocketTimeoutException
    //   1077	1116	4570	java/net/SocketTimeoutException
    //   1284	1302	4570	java/net/SocketTimeoutException
    //   1326	1336	4570	java/net/SocketTimeoutException
    //   1360	1368	4570	java/net/SocketTimeoutException
    //   1392	1408	4570	java/net/SocketTimeoutException
    //   1432	1438	4570	java/net/SocketTimeoutException
    //   1462	1476	4570	java/net/SocketTimeoutException
    //   1523	1529	4570	java/net/SocketTimeoutException
    //   1476	1495	4589	java/net/SocketTimeoutException
    //   1553	1579	4608	java/net/SocketTimeoutException
    //   1610	1636	4608	java/net/SocketTimeoutException
    //   1660	1667	4608	java/net/SocketTimeoutException
    //   1691	1698	4608	java/net/SocketTimeoutException
    //   1722	1728	4608	java/net/SocketTimeoutException
    //   1752	1760	4608	java/net/SocketTimeoutException
    //   1789	1809	4608	java/net/SocketTimeoutException
    //   1833	1852	4608	java/net/SocketTimeoutException
    //   1958	1990	4608	java/net/SocketTimeoutException
    //   2014	2020	4608	java/net/SocketTimeoutException
    //   2044	2052	4608	java/net/SocketTimeoutException
    //   2076	2098	4608	java/net/SocketTimeoutException
    //   2122	2127	4608	java/net/SocketTimeoutException
    //   2233	2242	4608	java/net/SocketTimeoutException
    //   2262	2276	4608	java/net/SocketTimeoutException
    //   2296	2310	4608	java/net/SocketTimeoutException
    //   2342	2349	4608	java/net/SocketTimeoutException
    //   2542	2549	4608	java/net/SocketTimeoutException
    //   2578	2598	4608	java/net/SocketTimeoutException
    //   2618	2632	4608	java/net/SocketTimeoutException
    //   2652	2666	4608	java/net/SocketTimeoutException
    //   2689	2696	4608	java/net/SocketTimeoutException
    //   2725	2745	4608	java/net/SocketTimeoutException
    //   2369	2378	4621	java/net/SocketTimeoutException
    //   2402	2411	4621	java/net/SocketTimeoutException
    //   2442	2452	4621	java/net/SocketTimeoutException
    //   2795	2815	4621	java/net/SocketTimeoutException
    //   2910	2920	4621	java/net/SocketTimeoutException
    //   2946	2951	4621	java/net/SocketTimeoutException
    //   2969	2974	4621	java/net/SocketTimeoutException
    //   2992	3005	4621	java/net/SocketTimeoutException
    //   3023	3033	4621	java/net/SocketTimeoutException
    //   3051	3081	4621	java/net/SocketTimeoutException
    //   3099	3117	4621	java/net/SocketTimeoutException
    //   3205	3218	4621	java/net/SocketTimeoutException
    //   279	289	4638	java/io/FileNotFoundException
    //   313	319	4638	java/io/FileNotFoundException
    //   397	405	4638	java/io/FileNotFoundException
    //   429	436	4638	java/io/FileNotFoundException
    //   460	471	4638	java/io/FileNotFoundException
    //   495	502	4638	java/io/FileNotFoundException
    //   526	541	4638	java/io/FileNotFoundException
    //   565	588	4638	java/io/FileNotFoundException
    //   612	619	4638	java/io/FileNotFoundException
    //   643	652	4638	java/io/FileNotFoundException
    //   676	685	4638	java/io/FileNotFoundException
    //   709	720	4638	java/io/FileNotFoundException
    //   744	750	4638	java/io/FileNotFoundException
    //   774	783	4638	java/io/FileNotFoundException
    //   807	813	4638	java/io/FileNotFoundException
    //   837	848	4638	java/io/FileNotFoundException
    //   877	896	4638	java/io/FileNotFoundException
    //   920	934	4638	java/io/FileNotFoundException
    //   958	968	4638	java/io/FileNotFoundException
    //   992	1004	4638	java/io/FileNotFoundException
    //   1028	1053	4638	java/io/FileNotFoundException
    //   1077	1116	4638	java/io/FileNotFoundException
    //   1284	1302	4638	java/io/FileNotFoundException
    //   1326	1336	4638	java/io/FileNotFoundException
    //   1360	1368	4638	java/io/FileNotFoundException
    //   1392	1408	4638	java/io/FileNotFoundException
    //   1432	1438	4638	java/io/FileNotFoundException
    //   1462	1476	4638	java/io/FileNotFoundException
    //   1523	1529	4638	java/io/FileNotFoundException
    //   1476	1495	4656	java/io/FileNotFoundException
    //   1553	1579	4674	java/io/FileNotFoundException
    //   1610	1636	4674	java/io/FileNotFoundException
    //   1660	1667	4674	java/io/FileNotFoundException
    //   1691	1698	4674	java/io/FileNotFoundException
    //   1722	1728	4674	java/io/FileNotFoundException
    //   1752	1760	4674	java/io/FileNotFoundException
    //   1789	1809	4674	java/io/FileNotFoundException
    //   1833	1852	4674	java/io/FileNotFoundException
    //   1958	1990	4674	java/io/FileNotFoundException
    //   2014	2020	4674	java/io/FileNotFoundException
    //   2044	2052	4674	java/io/FileNotFoundException
    //   2076	2098	4674	java/io/FileNotFoundException
    //   2122	2127	4674	java/io/FileNotFoundException
    //   2233	2242	4674	java/io/FileNotFoundException
    //   2262	2276	4674	java/io/FileNotFoundException
    //   2296	2310	4674	java/io/FileNotFoundException
    //   2342	2349	4674	java/io/FileNotFoundException
    //   2542	2549	4674	java/io/FileNotFoundException
    //   2578	2598	4674	java/io/FileNotFoundException
    //   2618	2632	4674	java/io/FileNotFoundException
    //   2652	2666	4674	java/io/FileNotFoundException
    //   2689	2696	4674	java/io/FileNotFoundException
    //   2725	2745	4674	java/io/FileNotFoundException
    //   2369	2378	4690	java/io/FileNotFoundException
    //   2402	2411	4690	java/io/FileNotFoundException
    //   2442	2452	4690	java/io/FileNotFoundException
    //   2795	2815	4690	java/io/FileNotFoundException
    //   2910	2920	4690	java/io/FileNotFoundException
    //   2946	2951	4690	java/io/FileNotFoundException
    //   2969	2974	4690	java/io/FileNotFoundException
    //   2992	3005	4690	java/io/FileNotFoundException
    //   3023	3033	4690	java/io/FileNotFoundException
    //   3051	3081	4690	java/io/FileNotFoundException
    //   3099	3117	4690	java/io/FileNotFoundException
    //   3205	3218	4690	java/io/FileNotFoundException
    //   279	289	4707	javax/net/ssl/SSLHandshakeException
    //   313	319	4707	javax/net/ssl/SSLHandshakeException
    //   397	405	4707	javax/net/ssl/SSLHandshakeException
    //   429	436	4707	javax/net/ssl/SSLHandshakeException
    //   460	471	4707	javax/net/ssl/SSLHandshakeException
    //   495	502	4707	javax/net/ssl/SSLHandshakeException
    //   526	541	4707	javax/net/ssl/SSLHandshakeException
    //   565	588	4707	javax/net/ssl/SSLHandshakeException
    //   612	619	4707	javax/net/ssl/SSLHandshakeException
    //   643	652	4707	javax/net/ssl/SSLHandshakeException
    //   676	685	4707	javax/net/ssl/SSLHandshakeException
    //   709	720	4707	javax/net/ssl/SSLHandshakeException
    //   744	750	4707	javax/net/ssl/SSLHandshakeException
    //   774	783	4707	javax/net/ssl/SSLHandshakeException
    //   807	813	4707	javax/net/ssl/SSLHandshakeException
    //   837	848	4707	javax/net/ssl/SSLHandshakeException
    //   877	896	4707	javax/net/ssl/SSLHandshakeException
    //   920	934	4707	javax/net/ssl/SSLHandshakeException
    //   958	968	4707	javax/net/ssl/SSLHandshakeException
    //   992	1004	4707	javax/net/ssl/SSLHandshakeException
    //   1028	1053	4707	javax/net/ssl/SSLHandshakeException
    //   1077	1116	4707	javax/net/ssl/SSLHandshakeException
    //   1284	1302	4707	javax/net/ssl/SSLHandshakeException
    //   1326	1336	4707	javax/net/ssl/SSLHandshakeException
    //   1360	1368	4707	javax/net/ssl/SSLHandshakeException
    //   1392	1408	4707	javax/net/ssl/SSLHandshakeException
    //   1432	1438	4707	javax/net/ssl/SSLHandshakeException
    //   1462	1476	4707	javax/net/ssl/SSLHandshakeException
    //   1523	1529	4707	javax/net/ssl/SSLHandshakeException
    //   1476	1495	4722	javax/net/ssl/SSLHandshakeException
    //   1553	1579	4737	javax/net/ssl/SSLHandshakeException
    //   1610	1636	4737	javax/net/ssl/SSLHandshakeException
    //   1660	1667	4737	javax/net/ssl/SSLHandshakeException
    //   1691	1698	4737	javax/net/ssl/SSLHandshakeException
    //   1722	1728	4737	javax/net/ssl/SSLHandshakeException
    //   1752	1760	4737	javax/net/ssl/SSLHandshakeException
    //   1789	1809	4737	javax/net/ssl/SSLHandshakeException
    //   1833	1852	4737	javax/net/ssl/SSLHandshakeException
    //   1958	1990	4737	javax/net/ssl/SSLHandshakeException
    //   2014	2020	4737	javax/net/ssl/SSLHandshakeException
    //   2044	2052	4737	javax/net/ssl/SSLHandshakeException
    //   2076	2098	4737	javax/net/ssl/SSLHandshakeException
    //   2122	2127	4737	javax/net/ssl/SSLHandshakeException
    //   2233	2242	4737	javax/net/ssl/SSLHandshakeException
    //   2262	2276	4737	javax/net/ssl/SSLHandshakeException
    //   2296	2310	4737	javax/net/ssl/SSLHandshakeException
    //   2342	2349	4737	javax/net/ssl/SSLHandshakeException
    //   2542	2549	4737	javax/net/ssl/SSLHandshakeException
    //   2578	2598	4737	javax/net/ssl/SSLHandshakeException
    //   2618	2632	4737	javax/net/ssl/SSLHandshakeException
    //   2652	2666	4737	javax/net/ssl/SSLHandshakeException
    //   2689	2696	4737	javax/net/ssl/SSLHandshakeException
    //   2725	2745	4737	javax/net/ssl/SSLHandshakeException
    //   2369	2378	4750	javax/net/ssl/SSLHandshakeException
    //   2402	2411	4750	javax/net/ssl/SSLHandshakeException
    //   2442	2452	4750	javax/net/ssl/SSLHandshakeException
    //   2795	2815	4750	javax/net/ssl/SSLHandshakeException
    //   2910	2920	4750	javax/net/ssl/SSLHandshakeException
    //   2946	2951	4750	javax/net/ssl/SSLHandshakeException
    //   2969	2974	4750	javax/net/ssl/SSLHandshakeException
    //   2992	3005	4750	javax/net/ssl/SSLHandshakeException
    //   3023	3033	4750	javax/net/ssl/SSLHandshakeException
    //   3051	3081	4750	javax/net/ssl/SSLHandshakeException
    //   3099	3117	4750	javax/net/ssl/SSLHandshakeException
    //   3205	3218	4750	javax/net/ssl/SSLHandshakeException
    //   236	255	4767	java/io/UnsupportedEncodingException
    //   1476	1495	4787	java/io/UnsupportedEncodingException
    //   2369	2378	4812	java/io/UnsupportedEncodingException
    //   2402	2411	4812	java/io/UnsupportedEncodingException
    //   2442	2452	4812	java/io/UnsupportedEncodingException
    //   2795	2815	4812	java/io/UnsupportedEncodingException
    //   2910	2920	4812	java/io/UnsupportedEncodingException
    //   2946	2951	4812	java/io/UnsupportedEncodingException
    //   2969	2974	4812	java/io/UnsupportedEncodingException
    //   2992	3005	4812	java/io/UnsupportedEncodingException
    //   3023	3033	4812	java/io/UnsupportedEncodingException
    //   3051	3081	4812	java/io/UnsupportedEncodingException
    //   3099	3117	4812	java/io/UnsupportedEncodingException
    //   3205	3218	4812	java/io/UnsupportedEncodingException
  }
  
  public final void a(final k paramk, final com.tencent.mm.plugin.appbrand.jsapi.d paramd, final int paramInt, final JSONObject paramJSONObject, final Map<String, String> paramMap, final ArrayList<String> paramArrayList, final a parama, final String paramString1, final String paramString2)
  {
    GMTrace.i(19902878449664L, 148288);
    e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10677825568768L, 79556);
        if (!l.a(paramk, paramJSONObject, paramd))
        {
          parama.qq(paramd.iPx);
          GMTrace.o(10677825568768L, 79556);
          return;
        }
        String str = paramJSONObject.optString("url");
        Object localObject6 = paramJSONObject.opt("data");
        ??? = paramJSONObject.optString("method");
        Object localObject3 = ???;
        if (bg.mZ((String)???)) {
          localObject3 = "GET";
        }
        if (TextUtils.isEmpty(str))
        {
          parama.qq("url is null");
          GMTrace.o(10677825568768L, 79556);
          return;
        }
        if ((!URLUtil.isHttpsUrl(str)) && (!URLUtil.isHttpUrl(str)))
        {
          parama.qq("request protocol must be http or https");
          GMTrace.o(10677825568768L, 79556);
          return;
        }
        ??? = new byte[0];
        ??? = ???;
        if (localObject6 != null)
        {
          ??? = ???;
          if (c.qY((String)localObject3))
          {
            if (!(localObject6 instanceof String)) {
              break label260;
            }
            ??? = ((String)localObject6).getBytes(Charset.forName("UTF-8"));
          }
        }
        synchronized (c.this.jiK)
        {
          while (c.this.jiK.size() >= c.this.jiB)
          {
            parama.qq("max connected");
            w.i("MicroMsg.AppBrandNetworkRequest", "max connected");
            GMTrace.o(10677825568768L, 79556);
            return;
            label260:
            ??? = ???;
            if ((localObject6 instanceof ByteBuffer)) {
              ??? = ((ByteBuffer)localObject6).array();
            }
          }
          w.i("MicroMsg.AppBrandNetworkRequest", "method %s ,url %s timeout %s", new Object[] { localObject3, str, Integer.valueOf(paramInt) });
          localObject3 = new d(str, (byte[])???, paramInt, parama, (String)localObject3);
          ((d)localObject3).jiX = paramMap;
          ((d)localObject3).jiY = paramArrayList;
          ((d)localObject3).jjc = paramString2;
          ((d)localObject3).jja = paramJSONObject.optString("responseType", "text");
        }
        synchronized (c.this.jiK)
        {
          c.this.jiK.add(localObject3);
          ((d)localObject3).iPd = paramString1;
          c.this.a((d)localObject3);
          GMTrace.o(10677825568768L, 79556);
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
        }
      }
    }, "appbrand_request_thread");
    GMTrace.o(19902878449664L, 148288);
  }
  
  public final void a(String paramString, HttpURLConnection paramHttpURLConnection)
  {
    GMTrace.i(17693251993600L, 131825);
    qU(paramString);
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.disconnect();
    }
    GMTrace.o(17693251993600L, 131825);
  }
  
  public final d qZ(String paramString)
  {
    GMTrace.i(17693520429056L, 131827);
    if (paramString == null)
    {
      GMTrace.o(17693520429056L, 131827);
      return null;
    }
    synchronized (this.jiK)
    {
      Iterator localIterator = this.jiK.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (paramString.equals(locald.iPd))
        {
          GMTrace.o(17693520429056L, 131827);
          return locald;
        }
      }
      GMTrace.o(17693520429056L, 131827);
      return null;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, Object paramObject, int paramInt, JSONObject paramJSONObject);
    
    public abstract void qq(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/h/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */