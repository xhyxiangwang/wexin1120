package com.tencent.mm.plugin.appbrand.jsapi.map;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class n
  extends c
{
  public static final int CTRL_INDEX = 4;
  public static final String NAME = "updateMap";
  
  public n()
  {
    GMTrace.i(10442810327040L, 77805);
    GMTrace.o(10442810327040L, 77805);
  }
  
  /* Error */
  protected final boolean a(com.tencent.mm.plugin.appbrand.page.AppBrandPageView paramAppBrandPageView, int paramInt, android.view.View paramView, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc2_w 33
    //   3: ldc 35
    //   5: invokestatic 24	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_1
    //   9: getfield 41	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:jla	Lcom/tencent/mm/plugin/appbrand/page/t;
    //   12: iload_2
    //   13: iconst_1
    //   14: invokevirtual 47	com/tencent/mm/plugin/appbrand/page/t:t	(IZ)Lcom/tencent/mm/x/q$b;
    //   17: astore 9
    //   19: aload 9
    //   21: ifnonnull +31 -> 52
    //   24: ldc 49
    //   26: ldc 51
    //   28: iconst_1
    //   29: anewarray 53	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: iload_2
    //   35: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   38: aastore
    //   39: invokestatic 64	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: ldc2_w 33
    //   45: ldc 35
    //   47: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   50: iconst_0
    //   51: ireturn
    //   52: ldc 66
    //   54: invokestatic 72	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   57: checkcast 66	com/tencent/mm/plugin/appbrand/compat/a/c
    //   60: aload_3
    //   61: invokeinterface 76 2 0
    //   66: astore 8
    //   68: aload 4
    //   70: ldc 78
    //   72: invokevirtual 84	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   75: ifeq +19 -> 94
    //   78: aload 8
    //   80: aload 4
    //   82: ldc 78
    //   84: bipush 16
    //   86: invokevirtual 88	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   89: invokeinterface 94 2 0
    //   94: aload 4
    //   96: ldc 96
    //   98: invokevirtual 84	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   101: ifeq +328 -> 429
    //   104: aload 9
    //   106: ldc 98
    //   108: aconst_null
    //   109: invokevirtual 104	com/tencent/mm/x/q$b:get	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   112: checkcast 106	java/util/List
    //   115: astore_3
    //   116: aload_3
    //   117: ifnonnull +403 -> 520
    //   120: new 108	java/util/ArrayList
    //   123: dup
    //   124: invokespecial 109	java/util/ArrayList:<init>	()V
    //   127: astore_3
    //   128: aload 9
    //   130: ldc 98
    //   132: aload_3
    //   133: invokevirtual 113	com/tencent/mm/x/q$b:k	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/x/q$b;
    //   136: pop
    //   137: aload_3
    //   138: invokeinterface 117 1 0
    //   143: ifle +76 -> 219
    //   146: iconst_0
    //   147: istore_2
    //   148: iload_2
    //   149: aload_3
    //   150: invokeinterface 117 1 0
    //   155: if_icmpge +58 -> 213
    //   158: aload_3
    //   159: iload_2
    //   160: invokeinterface 120 2 0
    //   165: checkcast 122	com/tencent/mm/plugin/appbrand/compat/a/b$h
    //   168: invokeinterface 125 1 0
    //   173: iload_2
    //   174: iconst_1
    //   175: iadd
    //   176: istore_2
    //   177: goto -29 -> 148
    //   180: astore_1
    //   181: ldc 49
    //   183: ldc 127
    //   185: iconst_2
    //   186: anewarray 53	java/lang/Object
    //   189: dup
    //   190: iconst_0
    //   191: iload_2
    //   192: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   195: aastore
    //   196: dup
    //   197: iconst_1
    //   198: aload_1
    //   199: aastore
    //   200: invokestatic 130	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: ldc2_w 33
    //   206: ldc 35
    //   208: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   211: iconst_0
    //   212: ireturn
    //   213: aload_3
    //   214: invokeinterface 133 1 0
    //   219: new 135	org/json/JSONArray
    //   222: dup
    //   223: aload 4
    //   225: ldc 96
    //   227: invokevirtual 139	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   230: invokespecial 142	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   233: astore 9
    //   235: iconst_0
    //   236: istore_2
    //   237: iload_2
    //   238: aload 9
    //   240: invokevirtual 145	org/json/JSONArray:length	()I
    //   243: if_icmpge +186 -> 429
    //   246: aload 9
    //   248: iload_2
    //   249: invokevirtual 146	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   252: checkcast 80	org/json/JSONObject
    //   255: astore 11
    //   257: aload 11
    //   259: ldc -108
    //   261: invokevirtual 139	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   264: fconst_0
    //   265: invokestatic 154	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   268: fstore 5
    //   270: aload 11
    //   272: ldc -100
    //   274: invokevirtual 139	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   277: fconst_0
    //   278: invokestatic 154	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   281: fstore 6
    //   283: aload 11
    //   285: ldc -98
    //   287: invokevirtual 139	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   290: astore 10
    //   292: aload 11
    //   294: ldc -96
    //   296: dconst_0
    //   297: invokevirtual 164	org/json/JSONObject:optDouble	(Ljava/lang/String;D)D
    //   300: d2f
    //   301: fstore 7
    //   303: aload 8
    //   305: invokeinterface 168 1 0
    //   310: astore 11
    //   312: aload 11
    //   314: fload 5
    //   316: f2d
    //   317: fload 6
    //   319: f2d
    //   320: invokeinterface 174 5 0
    //   325: aload_1
    //   326: getfield 178	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:irS	Lcom/tencent/mm/plugin/appbrand/f;
    //   329: aload 10
    //   331: invokestatic 184	com/tencent/mm/plugin/appbrand/page/n:g	(Lcom/tencent/mm/plugin/appbrand/f;Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   334: astore 10
    //   336: aload 10
    //   338: ifnull +20 -> 358
    //   341: aload 10
    //   343: invokevirtual 190	android/graphics/Bitmap:isRecycled	()Z
    //   346: ifne +12 -> 358
    //   349: aload 11
    //   351: aload 10
    //   353: invokeinterface 194 2 0
    //   358: aload 11
    //   360: fload 7
    //   362: invokeinterface 198 2 0
    //   367: aload 8
    //   369: aload 11
    //   371: invokeinterface 201 2 0
    //   376: astore 10
    //   378: aload 10
    //   380: ldc -53
    //   382: invokeinterface 206 2 0
    //   387: aload_3
    //   388: aload 10
    //   390: invokeinterface 210 2 0
    //   395: pop
    //   396: iload_2
    //   397: iconst_1
    //   398: iadd
    //   399: istore_2
    //   400: goto -163 -> 237
    //   403: astore_1
    //   404: ldc 49
    //   406: ldc -44
    //   408: iconst_1
    //   409: anewarray 53	java/lang/Object
    //   412: dup
    //   413: iconst_0
    //   414: aload_1
    //   415: aastore
    //   416: invokestatic 130	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   419: ldc2_w 33
    //   422: ldc 35
    //   424: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   427: iconst_0
    //   428: ireturn
    //   429: aload 4
    //   431: ldc -42
    //   433: invokevirtual 84	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   436: ifeq +74 -> 510
    //   439: aload 4
    //   441: ldc -40
    //   443: invokevirtual 84	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   446: ifeq +64 -> 510
    //   449: aload 4
    //   451: ldc -42
    //   453: invokevirtual 139	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   456: fconst_0
    //   457: invokestatic 154	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   460: fstore 5
    //   462: aload 4
    //   464: ldc -40
    //   466: invokevirtual 139	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   469: fconst_0
    //   470: invokestatic 154	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   473: fstore 6
    //   475: fload 5
    //   477: invokestatic 222	java/lang/Math:abs	(F)F
    //   480: ldc -33
    //   482: fcmpg
    //   483: ifgt +27 -> 510
    //   486: fload 6
    //   488: invokestatic 222	java/lang/Math:abs	(F)F
    //   491: ldc -32
    //   493: fcmpg
    //   494: ifgt +16 -> 510
    //   497: aload 8
    //   499: fload 5
    //   501: f2d
    //   502: fload 6
    //   504: f2d
    //   505: invokeinterface 227 5 0
    //   510: ldc2_w 33
    //   513: ldc 35
    //   515: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   518: iconst_1
    //   519: ireturn
    //   520: goto -383 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	523	0	this	n
    //   0	523	1	paramAppBrandPageView	com.tencent.mm.plugin.appbrand.page.AppBrandPageView
    //   0	523	2	paramInt	int
    //   0	523	3	paramView	android.view.View
    //   0	523	4	paramJSONObject	JSONObject
    //   268	232	5	f1	float
    //   281	222	6	f2	float
    //   301	60	7	f3	float
    //   66	432	8	localb	com.tencent.mm.plugin.appbrand.compat.a.b
    //   17	230	9	localObject1	Object
    //   290	99	10	localObject2	Object
    //   255	115	11	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   52	68	180	java/lang/Exception
    //   94	116	403	java/lang/Exception
    //   120	137	403	java/lang/Exception
    //   137	146	403	java/lang/Exception
    //   148	173	403	java/lang/Exception
    //   213	219	403	java/lang/Exception
    //   219	235	403	java/lang/Exception
    //   237	336	403	java/lang/Exception
    //   341	358	403	java/lang/Exception
    //   358	396	403	java/lang/Exception
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10442944544768L, 77806);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10442944544768L, 77806);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiUpdateMap", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10442944544768L, 77806);
    }
    return 0;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */