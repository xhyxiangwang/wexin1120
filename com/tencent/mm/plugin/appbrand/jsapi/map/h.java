package com.tencent.mm.plugin.appbrand.jsapi.map;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class h
  extends c
{
  public static final int CTRL_INDEX = 136;
  public static final String NAME = "includeMapPoints";
  
  public h()
  {
    GMTrace.i(10448313253888L, 77846);
    GMTrace.o(10448313253888L, 77846);
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
    //   17: ifnonnull +31 -> 48
    //   20: ldc 49
    //   22: ldc 51
    //   24: iconst_1
    //   25: anewarray 53	java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: iload_2
    //   31: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   34: aastore
    //   35: invokestatic 64	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: ldc2_w 33
    //   41: ldc 35
    //   43: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   46: iconst_0
    //   47: ireturn
    //   48: ldc 66
    //   50: invokestatic 72	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   53: checkcast 66	com/tencent/mm/plugin/appbrand/compat/a/c
    //   56: aload_3
    //   57: invokeinterface 76 2 0
    //   62: astore_1
    //   63: ldc 49
    //   65: ldc 78
    //   67: invokestatic 81	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: aload 4
    //   72: ldc 83
    //   74: invokevirtual 89	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   77: ifeq +199 -> 276
    //   80: new 91	java/util/ArrayList
    //   83: dup
    //   84: invokespecial 92	java/util/ArrayList:<init>	()V
    //   87: astore_3
    //   88: aload 4
    //   90: ldc 83
    //   92: invokevirtual 96	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   95: astore 7
    //   97: aload 7
    //   99: invokestatic 101	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   102: ifne +121 -> 223
    //   105: new 103	org/json/JSONArray
    //   108: dup
    //   109: aload 7
    //   111: invokespecial 106	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   114: astore 7
    //   116: iconst_0
    //   117: istore_2
    //   118: iload_2
    //   119: aload 7
    //   121: invokevirtual 110	org/json/JSONArray:length	()I
    //   124: if_icmpge +99 -> 223
    //   127: aload 7
    //   129: iload_2
    //   130: invokevirtual 114	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   133: checkcast 85	org/json/JSONObject
    //   136: astore 8
    //   138: aload 8
    //   140: ldc 116
    //   142: invokevirtual 96	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   145: fconst_0
    //   146: invokestatic 120	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   149: fstore 5
    //   151: aload 8
    //   153: ldc 122
    //   155: invokevirtual 96	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   158: fconst_0
    //   159: invokestatic 120	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   162: fstore 6
    //   164: aload_3
    //   165: aload_1
    //   166: fload 5
    //   168: f2d
    //   169: fload 6
    //   171: f2d
    //   172: invokeinterface 128 5 0
    //   177: invokeinterface 134 2 0
    //   182: pop
    //   183: iload_2
    //   184: iconst_1
    //   185: iadd
    //   186: istore_2
    //   187: goto -69 -> 118
    //   190: astore_1
    //   191: ldc 49
    //   193: ldc -120
    //   195: iconst_2
    //   196: anewarray 53	java/lang/Object
    //   199: dup
    //   200: iconst_0
    //   201: iload_2
    //   202: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   205: aastore
    //   206: dup
    //   207: iconst_1
    //   208: aload_1
    //   209: aastore
    //   210: invokestatic 138	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   213: ldc2_w 33
    //   216: ldc 35
    //   218: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   221: iconst_0
    //   222: ireturn
    //   223: iconst_0
    //   224: istore_2
    //   225: aload 4
    //   227: ldc -116
    //   229: invokevirtual 96	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   232: astore 4
    //   234: aload 4
    //   236: invokestatic 101	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   239: ifne +20 -> 259
    //   242: new 103	org/json/JSONArray
    //   245: dup
    //   246: aload 4
    //   248: invokespecial 106	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   251: iconst_0
    //   252: invokevirtual 144	org/json/JSONArray:optInt	(I)I
    //   255: invokestatic 149	com/tencent/mm/plugin/appbrand/n/c:jF	(I)I
    //   258: istore_2
    //   259: aload_3
    //   260: invokeinterface 152 1 0
    //   265: ifle +11 -> 276
    //   268: aload_1
    //   269: aload_3
    //   270: iload_2
    //   271: invokeinterface 156 3 0
    //   276: ldc2_w 33
    //   279: ldc 35
    //   281: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   284: iconst_1
    //   285: ireturn
    //   286: astore_1
    //   287: ldc 49
    //   289: ldc -98
    //   291: iconst_1
    //   292: anewarray 53	java/lang/Object
    //   295: dup
    //   296: iconst_0
    //   297: aload_1
    //   298: aastore
    //   299: invokestatic 138	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   302: ldc2_w 33
    //   305: ldc 35
    //   307: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   310: iconst_0
    //   311: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	this	h
    //   0	312	1	paramAppBrandPageView	com.tencent.mm.plugin.appbrand.page.AppBrandPageView
    //   0	312	2	paramInt	int
    //   0	312	3	paramView	android.view.View
    //   0	312	4	paramJSONObject	JSONObject
    //   149	18	5	f1	float
    //   162	8	6	f2	float
    //   95	33	7	localObject	Object
    //   136	16	8	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   48	63	190	java/lang/Exception
    //   70	116	286	java/lang/Exception
    //   118	183	286	java/lang/Exception
    //   225	234	286	java/lang/Exception
    //   234	259	286	java/lang/Exception
    //   259	276	286	java/lang/Exception
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10448447471616L, 77847);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10448447471616L, 77847);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiIncludeMapPoints", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10448447471616L, 77847);
    }
    return 0;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */