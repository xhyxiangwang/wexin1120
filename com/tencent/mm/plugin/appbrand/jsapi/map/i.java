package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.compat.a.b.k;
import com.tencent.mm.plugin.appbrand.compat.a.b.l;
import com.tencent.mm.plugin.appbrand.compat.a.b.m;
import com.tencent.mm.plugin.appbrand.compat.a.c;
import com.tencent.mm.plugin.appbrand.compat.a.e.a;
import com.tencent.mm.plugin.appbrand.compat.a.e.b;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
  extends a
{
  public static final int CTRL_INDEX = 2;
  public static final String NAME = "insertMap";
  
  public i()
  {
    GMTrace.i(10441602367488L, 77796);
    GMTrace.o(10441602367488L, 77796);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(10441736585216L, 77797);
    float f1 = bg.getFloat(paramJSONObject.optString("centerLatitude"), 0.0F);
    float f2 = bg.getFloat(paramJSONObject.optString("centerLongitude"), 0.0F);
    if ((Math.abs(f1) > 90.0F) || (Math.abs(f2) > 180.0F))
    {
      w.d("MicroMsg.JsApiInsertMap", "centerLatitude or centerLongitude value is error!");
      GMTrace.o(10441736585216L, 77797);
      return null;
    }
    paramAppBrandPageView = ((c)h.h(c.class)).bH(paramAppBrandPageView.mContext);
    paramAppBrandPageView.getView().setVisibility(0);
    paramAppBrandPageView = paramAppBrandPageView.getView();
    GMTrace.o(10441736585216L, 77797);
    return paramAppBrandPageView;
  }
  
  /* Error */
  protected final void b(final AppBrandPageView paramAppBrandPageView, final int paramInt, final View paramView, final JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc2_w 127
    //   3: ldc -127
    //   5: invokestatic 51	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 95
    //   10: invokestatic 101	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   13: checkcast 95	com/tencent/mm/plugin/appbrand/compat/a/c
    //   16: aload_3
    //   17: invokeinterface 133 2 0
    //   22: astore_3
    //   23: aload_1
    //   24: getfield 137	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:jla	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   27: iload_2
    //   28: iconst_1
    //   29: invokevirtual 143	com/tencent/mm/plugin/appbrand/page/t:t	(IZ)Lcom/tencent/mm/x/q$b;
    //   32: astore 8
    //   34: aload 4
    //   36: ldc -111
    //   38: invokevirtual 149	org/json/JSONObject:optBoolean	(Ljava/lang/String;)Z
    //   41: ifeq +361 -> 402
    //   44: aload_1
    //   45: getfield 137	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:jla	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   48: iload_2
    //   49: iconst_1
    //   50: invokevirtual 143	com/tencent/mm/plugin/appbrand/page/t:t	(IZ)Lcom/tencent/mm/x/q$b;
    //   53: astore 9
    //   55: new 16	com/tencent/mm/plugin/appbrand/jsapi/map/i$5
    //   58: dup
    //   59: aload_0
    //   60: aload 9
    //   62: iload_2
    //   63: aload_1
    //   64: aload_3
    //   65: invokespecial 152	com/tencent/mm/plugin/appbrand/jsapi/map/i$5:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;Lcom/tencent/mm/x/q$b;ILcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Lcom/tencent/mm/plugin/appbrand/compat/a/b;)V
    //   68: astore 10
    //   70: ldc -102
    //   72: invokestatic 101	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   75: checkcast 154	com/tencent/mm/plugin/appbrand/compat/a/e
    //   78: aload 10
    //   80: invokeinterface 157 2 0
    //   85: new 27	com/tencent/mm/plugin/appbrand/jsapi/map/i$b
    //   88: dup
    //   89: aload_0
    //   90: iload_2
    //   91: aload 9
    //   93: invokespecial 160	com/tencent/mm/plugin/appbrand/jsapi/map/i$b:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;ILcom/tencent/mm/x/q$b;)V
    //   96: astore 11
    //   98: invokestatic 166	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   101: ldc -88
    //   103: invokevirtual 174	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   106: checkcast 176	android/hardware/SensorManager
    //   109: astore 12
    //   111: aload 12
    //   113: aload 11
    //   115: aload 12
    //   117: iconst_3
    //   118: invokevirtual 180	android/hardware/SensorManager:getDefaultSensor	(I)Landroid/hardware/Sensor;
    //   121: iconst_1
    //   122: invokevirtual 184	android/hardware/SensorManager:registerListener	(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    //   125: pop
    //   126: aload 9
    //   128: ldc -70
    //   130: aconst_null
    //   131: invokevirtual 192	com/tencent/mm/x/q$b:get	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   134: checkcast 194	com/tencent/mm/plugin/appbrand/page/AppBrandPageView$c
    //   137: ifnonnull +39 -> 176
    //   140: new 20	com/tencent/mm/plugin/appbrand/jsapi/map/i$6
    //   143: dup
    //   144: aload_0
    //   145: aload_1
    //   146: aload_3
    //   147: aload 12
    //   149: aload 11
    //   151: aload 10
    //   153: aload 9
    //   155: invokespecial 197	com/tencent/mm/plugin/appbrand/jsapi/map/i$6:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Lcom/tencent/mm/plugin/appbrand/compat/a/b;Landroid/hardware/SensorManager;Lcom/tencent/mm/plugin/appbrand/jsapi/map/i$b;Lcom/tencent/mm/plugin/appbrand/compat/a/e$a;Lcom/tencent/mm/x/q$b;)V
    //   158: astore 10
    //   160: aload 9
    //   162: ldc -70
    //   164: aload 10
    //   166: invokevirtual 201	com/tencent/mm/x/q$b:k	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/x/q$b;
    //   169: pop
    //   170: aload_1
    //   171: aload 10
    //   173: invokevirtual 204	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:a	(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView$c;)V
    //   176: aload_3
    //   177: new 10	com/tencent/mm/plugin/appbrand/jsapi/map/i$2
    //   180: dup
    //   181: aload_0
    //   182: aload 4
    //   184: aload_3
    //   185: invokespecial 207	com/tencent/mm/plugin/appbrand/jsapi/map/i$2:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;Lorg/json/JSONObject;Lcom/tencent/mm/plugin/appbrand/compat/a/b;)V
    //   188: invokeinterface 210 2 0
    //   193: aload_3
    //   194: new 12	com/tencent/mm/plugin/appbrand/jsapi/map/i$3
    //   197: dup
    //   198: aload_0
    //   199: iload_2
    //   200: aload_1
    //   201: invokespecial 213	com/tencent/mm/plugin/appbrand/jsapi/map/i$3:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;ILcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V
    //   204: invokeinterface 216 2 0
    //   209: aload_3
    //   210: new 14	com/tencent/mm/plugin/appbrand/jsapi/map/i$4
    //   213: dup
    //   214: aload_0
    //   215: iload_2
    //   216: aload_1
    //   217: invokespecial 217	com/tencent/mm/plugin/appbrand/jsapi/map/i$4:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;ILcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;)V
    //   220: invokeinterface 220 2 0
    //   225: aload 4
    //   227: ldc -34
    //   229: invokevirtual 225	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   232: ifeq +227 -> 459
    //   235: new 227	java/util/ArrayList
    //   238: dup
    //   239: invokespecial 228	java/util/ArrayList:<init>	()V
    //   242: astore 9
    //   244: new 230	org/json/JSONArray
    //   247: dup
    //   248: aload 4
    //   250: ldc -34
    //   252: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   255: invokespecial 233	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   258: astore 10
    //   260: iconst_0
    //   261: istore_2
    //   262: iload_2
    //   263: aload 10
    //   265: invokevirtual 237	org/json/JSONArray:length	()I
    //   268: if_icmpge +181 -> 449
    //   271: aload 10
    //   273: iload_2
    //   274: invokevirtual 240	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   277: checkcast 63	org/json/JSONObject
    //   280: astore 12
    //   282: aload 12
    //   284: ldc -14
    //   286: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   289: fconst_0
    //   290: invokestatic 73	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   293: fstore 5
    //   295: aload 12
    //   297: ldc -12
    //   299: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   302: fconst_0
    //   303: invokestatic 73	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   306: fstore 6
    //   308: aload 12
    //   310: ldc -10
    //   312: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   315: invokestatic 251	com/tencent/mm/plugin/appbrand/o/d:sd	(Ljava/lang/String;)Ljava/lang/String;
    //   318: astore 11
    //   320: aload 12
    //   322: ldc -3
    //   324: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   327: invokestatic 251	com/tencent/mm/plugin/appbrand/o/d:sd	(Ljava/lang/String;)Ljava/lang/String;
    //   330: astore 12
    //   332: aload_3
    //   333: invokeinterface 257 1 0
    //   338: astore 13
    //   340: aload 13
    //   342: fload 5
    //   344: f2d
    //   345: fload 6
    //   347: f2d
    //   348: invokeinterface 263 5 0
    //   353: aload 13
    //   355: aload 11
    //   357: invokeinterface 266 2 0
    //   362: aload 12
    //   364: invokestatic 269	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   367: ifne +12 -> 379
    //   370: aload 13
    //   372: aload 12
    //   374: invokeinterface 272 2 0
    //   379: aload 9
    //   381: aload_3
    //   382: aload 13
    //   384: invokeinterface 275 2 0
    //   389: invokeinterface 281 2 0
    //   394: pop
    //   395: iload_2
    //   396: iconst_1
    //   397: iadd
    //   398: istore_2
    //   399: goto -137 -> 262
    //   402: aload 8
    //   404: ldc -70
    //   406: aconst_null
    //   407: invokevirtual 192	com/tencent/mm/x/q$b:get	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   410: checkcast 194	com/tencent/mm/plugin/appbrand/page/AppBrandPageView$c
    //   413: ifnonnull -237 -> 176
    //   416: new 6	com/tencent/mm/plugin/appbrand/jsapi/map/i$1
    //   419: dup
    //   420: aload_0
    //   421: aload_1
    //   422: aload_3
    //   423: aload 8
    //   425: invokespecial 284	com/tencent/mm/plugin/appbrand/jsapi/map/i$1:<init>	(Lcom/tencent/mm/plugin/appbrand/jsapi/map/i;Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Lcom/tencent/mm/plugin/appbrand/compat/a/b;Lcom/tencent/mm/x/q$b;)V
    //   428: astore 9
    //   430: aload 8
    //   432: ldc -70
    //   434: aload 9
    //   436: invokevirtual 201	com/tencent/mm/x/q$b:k	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/x/q$b;
    //   439: pop
    //   440: aload_1
    //   441: aload 9
    //   443: invokevirtual 204	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:a	(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView$c;)V
    //   446: goto -270 -> 176
    //   449: aload 8
    //   451: ldc -34
    //   453: aload 9
    //   455: invokevirtual 201	com/tencent/mm/x/q$b:k	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/x/q$b;
    //   458: pop
    //   459: aload 4
    //   461: ldc_w 286
    //   464: invokevirtual 225	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   467: ifeq +236 -> 703
    //   470: new 227	java/util/ArrayList
    //   473: dup
    //   474: invokespecial 228	java/util/ArrayList:<init>	()V
    //   477: astore 9
    //   479: new 230	org/json/JSONArray
    //   482: dup
    //   483: aload 4
    //   485: ldc_w 286
    //   488: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   491: invokespecial 233	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   494: astore 4
    //   496: iconst_0
    //   497: istore_2
    //   498: iload_2
    //   499: aload 4
    //   501: invokevirtual 237	org/json/JSONArray:length	()I
    //   504: if_icmpge +188 -> 692
    //   507: aload 4
    //   509: iload_2
    //   510: invokevirtual 240	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   513: checkcast 63	org/json/JSONObject
    //   516: astore 11
    //   518: aload 11
    //   520: ldc -14
    //   522: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   525: fconst_0
    //   526: invokestatic 73	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   529: fstore 5
    //   531: aload 11
    //   533: ldc -12
    //   535: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   538: fconst_0
    //   539: invokestatic 73	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   542: fstore 6
    //   544: aload 11
    //   546: ldc_w 288
    //   549: invokevirtual 67	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   552: astore 10
    //   554: aload 11
    //   556: ldc_w 290
    //   559: dconst_0
    //   560: invokevirtual 294	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   563: d2f
    //   564: fstore 7
    //   566: aload_3
    //   567: invokeinterface 257 1 0
    //   572: astore 11
    //   574: aload 11
    //   576: fload 5
    //   578: f2d
    //   579: fload 6
    //   581: f2d
    //   582: invokeinterface 263 5 0
    //   587: aload_1
    //   588: getfield 298	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:irS	Lcom/tencent/mm/plugin/appbrand/f;
    //   591: aload 10
    //   593: invokestatic 304	com/tencent/mm/plugin/appbrand/page/n:g	(Lcom/tencent/mm/plugin/appbrand/f;Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   596: astore 10
    //   598: aload 10
    //   600: ifnull +20 -> 620
    //   603: aload 10
    //   605: invokevirtual 310	android/graphics/Bitmap:isRecycled	()Z
    //   608: ifne +12 -> 620
    //   611: aload 11
    //   613: aload 10
    //   615: invokeinterface 314 2 0
    //   620: aload 11
    //   622: fload 7
    //   624: invokeinterface 318 2 0
    //   629: aload_3
    //   630: aload 11
    //   632: invokeinterface 275 2 0
    //   637: astore 10
    //   639: aload 10
    //   641: ldc_w 320
    //   644: invokeinterface 325 2 0
    //   649: aload 9
    //   651: aload 10
    //   653: invokeinterface 281 2 0
    //   658: pop
    //   659: iload_2
    //   660: iconst_1
    //   661: iadd
    //   662: istore_2
    //   663: goto -165 -> 498
    //   666: astore_1
    //   667: ldc 85
    //   669: ldc_w 327
    //   672: iconst_1
    //   673: anewarray 329	java/lang/Object
    //   676: dup
    //   677: iconst_0
    //   678: aload_1
    //   679: aastore
    //   680: invokestatic 333	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   683: ldc2_w 127
    //   686: ldc -127
    //   688: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   691: return
    //   692: aload 8
    //   694: ldc_w 335
    //   697: aload 9
    //   699: invokevirtual 201	com/tencent/mm/x/q$b:k	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/x/q$b;
    //   702: pop
    //   703: ldc2_w 127
    //   706: ldc -127
    //   708: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   711: return
    //   712: astore_1
    //   713: ldc 85
    //   715: ldc_w 337
    //   718: iconst_1
    //   719: anewarray 329	java/lang/Object
    //   722: dup
    //   723: iconst_0
    //   724: aload_1
    //   725: aastore
    //   726: invokestatic 333	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   729: ldc2_w 127
    //   732: ldc -127
    //   734: invokestatic 54	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   737: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	738	0	this	i
    //   0	738	1	paramAppBrandPageView	AppBrandPageView
    //   0	738	2	paramInt	int
    //   0	738	3	paramView	View
    //   0	738	4	paramJSONObject	JSONObject
    //   293	284	5	f1	float
    //   306	274	6	f2	float
    //   564	59	7	f3	float
    //   32	661	8	localb	q.b
    //   53	645	9	localObject1	Object
    //   68	584	10	localObject2	Object
    //   96	535	11	localObject3	Object
    //   109	264	12	localObject4	Object
    //   338	45	13	locali	com.tencent.mm.plugin.appbrand.compat.a.b.i
    // Exception table:
    //   from	to	target	type
    //   225	260	666	java/lang/Exception
    //   262	379	666	java/lang/Exception
    //   379	395	666	java/lang/Exception
    //   449	459	666	java/lang/Exception
    //   459	496	712	java/lang/Exception
    //   498	598	712	java/lang/Exception
    //   603	620	712	java/lang/Exception
    //   620	659	712	java/lang/Exception
    //   692	703	712	java/lang/Exception
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10442005020672L, 77799);
    int i = paramJSONObject.getInt("mapId");
    GMTrace.o(10442005020672L, 77799);
    return i;
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 147;
    private static final String NAME = "onMapRegionChange";
    
    public a()
    {
      GMTrace.i(10444689375232L, 77819);
      GMTrace.o(10444689375232L, 77819);
    }
  }
  
  private final class b
    implements SensorEventListener
  {
    int fFw;
    q.b iLn;
    private float iXw;
    private long timestamp;
    
    public b(int paramInt, q.b paramb)
    {
      GMTrace.i(10445628899328L, 77826);
      this.iXw = 0.0F;
      this.timestamp = 200L;
      this.fFw = paramInt;
      this.iLn = paramb;
      GMTrace.o(10445628899328L, 77826);
    }
    
    public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
    {
      GMTrace.i(10445897334784L, 77828);
      GMTrace.o(10445897334784L, 77828);
    }
    
    public final void onSensorChanged(SensorEvent paramSensorEvent)
    {
      GMTrace.i(10445763117056L, 77827);
      float f3;
      float f4;
      if (paramSensorEvent.sensor.getType() == 3)
      {
        long l1 = System.currentTimeMillis();
        long l2 = this.timestamp;
        f3 = m.at(paramSensorEvent.values[0]);
        if ((l1 - l2 > 200L) && (Math.abs(f3 - this.iXw) > 3.0F))
        {
          paramSensorEvent = (AppbrandMapLocationPoint)this.iLn.get(this.fFw, null);
          if (paramSensorEvent != null)
          {
            f4 = this.iXw;
            if ((f4 < 0.0F) || (f4 > 45.0F) || (f3 < 315.0F) || (f3 >= 360.0F)) {
              break label290;
            }
          }
        }
      }
      label290:
      for (float f1 = f3 - 360.0F;; f1 = f3)
      {
        float f2;
        if ((f4 >= 0.0F) && (f4 <= 45.0F) && (f3 >= 315.0F))
        {
          f2 = f4;
          if (f3 < 360.0F) {}
        }
        else
        {
          f2 = f4;
          if (f4 >= 315.0F)
          {
            f2 = f4;
            if (f4 < 360.0F)
            {
              f2 = f4;
              if (f3 >= 0.0F)
              {
                f2 = f4;
                if (f3 <= 45.0F) {
                  f2 = f4 - 360.0F;
                }
              }
            }
          }
        }
        RotateAnimation localRotateAnimation = new RotateAnimation(f2, f1, 1, 0.5F, 1, 0.7F);
        localRotateAnimation.setDuration(200L);
        localRotateAnimation.setFillAfter(true);
        paramSensorEvent.iWY.startAnimation(localRotateAnimation);
        this.iXw = f3;
        this.timestamp = System.currentTimeMillis();
        GMTrace.o(10445763117056L, 77827);
        return;
      }
    }
  }
  
  private static final class c
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 151;
    private static final String NAME = "onMapClick";
    
    public c()
    {
      GMTrace.i(10448984342528L, 77851);
      GMTrace.o(10448984342528L, 77851);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */