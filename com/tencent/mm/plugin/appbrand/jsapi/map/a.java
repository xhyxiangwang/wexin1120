package com.tencent.mm.plugin.appbrand.jsapi.map;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class a
  extends c
{
  public static final int CTRL_INDEX = 135;
  public static final String NAME = "addMapCircles";
  
  public a()
  {
    GMTrace.i(10449521213440L, 77855);
    GMTrace.o(10449521213440L, 77855);
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
    //   17: astore 11
    //   19: aload 11
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
    //   66: astore_3
    //   67: aload 4
    //   69: ldc 78
    //   71: invokevirtual 84	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   74: ifeq +345 -> 419
    //   77: aload 11
    //   79: ldc 86
    //   81: aconst_null
    //   82: invokevirtual 92	com/tencent/mm/x/q$b:get	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   85: checkcast 94	java/util/List
    //   88: astore_1
    //   89: aload_1
    //   90: ifnonnull +339 -> 429
    //   93: new 96	java/util/ArrayList
    //   96: dup
    //   97: invokespecial 97	java/util/ArrayList:<init>	()V
    //   100: astore_1
    //   101: aload 11
    //   103: ldc 86
    //   105: aload_1
    //   106: invokevirtual 101	com/tencent/mm/x/q$b:k	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/x/q$b;
    //   109: pop
    //   110: aload_1
    //   111: invokeinterface 105 1 0
    //   116: ifle +76 -> 192
    //   119: iconst_0
    //   120: istore_2
    //   121: iload_2
    //   122: aload_1
    //   123: invokeinterface 105 1 0
    //   128: if_icmpge +58 -> 186
    //   131: aload_1
    //   132: iload_2
    //   133: invokeinterface 108 2 0
    //   138: checkcast 110	com/tencent/mm/plugin/appbrand/compat/a/b$b
    //   141: invokeinterface 113 1 0
    //   146: iload_2
    //   147: iconst_1
    //   148: iadd
    //   149: istore_2
    //   150: goto -29 -> 121
    //   153: astore_1
    //   154: ldc 49
    //   156: ldc 115
    //   158: iconst_2
    //   159: anewarray 53	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: iload_2
    //   165: invokestatic 59	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   168: aastore
    //   169: dup
    //   170: iconst_1
    //   171: aload_1
    //   172: aastore
    //   173: invokestatic 118	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: ldc2_w 33
    //   179: ldc 35
    //   181: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   184: iconst_0
    //   185: ireturn
    //   186: aload_1
    //   187: invokeinterface 121 1 0
    //   192: new 123	org/json/JSONArray
    //   195: dup
    //   196: aload 4
    //   198: ldc 78
    //   200: invokevirtual 127	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   203: invokespecial 130	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   206: astore 4
    //   208: iconst_0
    //   209: istore_2
    //   210: iload_2
    //   211: aload 4
    //   213: invokevirtual 133	org/json/JSONArray:length	()I
    //   216: if_icmpge +203 -> 419
    //   219: aload 4
    //   221: iload_2
    //   222: invokevirtual 134	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   225: checkcast 80	org/json/JSONObject
    //   228: astore 11
    //   230: aload 11
    //   232: ldc -120
    //   234: invokevirtual 127	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   237: fconst_0
    //   238: invokestatic 142	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   241: fstore 5
    //   243: aload 11
    //   245: ldc -112
    //   247: invokevirtual 127	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   250: fconst_0
    //   251: invokestatic 142	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   254: fstore 6
    //   256: aload 11
    //   258: ldc -110
    //   260: ldc -108
    //   262: invokevirtual 151	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   265: ldc -103
    //   267: invokestatic 159	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   270: invokestatic 165	com/tencent/mm/plugin/appbrand/n/c:aA	(Ljava/lang/String;I)I
    //   273: istore 8
    //   275: aload 11
    //   277: ldc -89
    //   279: ldc -108
    //   281: invokevirtual 151	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   284: ldc -103
    //   286: invokestatic 159	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   289: invokestatic 165	com/tencent/mm/plugin/appbrand/n/c:aA	(Ljava/lang/String;I)I
    //   292: istore 9
    //   294: aload 11
    //   296: ldc -87
    //   298: invokevirtual 172	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   301: istore 10
    //   303: aload 11
    //   305: ldc -82
    //   307: fconst_0
    //   308: invokestatic 177	com/tencent/mm/plugin/appbrand/n/c:a	(Lorg/json/JSONObject;Ljava/lang/String;F)F
    //   311: fstore 7
    //   313: aload_3
    //   314: invokeinterface 183 1 0
    //   319: astore 11
    //   321: aload 11
    //   323: fload 5
    //   325: f2d
    //   326: fload 6
    //   328: f2d
    //   329: invokeinterface 189 5 0
    //   334: aload 11
    //   336: iload 10
    //   338: invokeinterface 193 2 0
    //   343: aload 11
    //   345: iload 8
    //   347: invokeinterface 196 2 0
    //   352: aload 11
    //   354: fload 7
    //   356: f2i
    //   357: invokeinterface 199 2 0
    //   362: aload 11
    //   364: iload 9
    //   366: invokeinterface 202 2 0
    //   371: aload_1
    //   372: aload_3
    //   373: aload 11
    //   375: invokeinterface 205 2 0
    //   380: invokeinterface 209 2 0
    //   385: pop
    //   386: iload_2
    //   387: iconst_1
    //   388: iadd
    //   389: istore_2
    //   390: goto -180 -> 210
    //   393: astore_1
    //   394: ldc 49
    //   396: ldc -45
    //   398: iconst_1
    //   399: anewarray 53	java/lang/Object
    //   402: dup
    //   403: iconst_0
    //   404: aload_1
    //   405: aastore
    //   406: invokestatic 118	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   409: ldc2_w 33
    //   412: ldc 35
    //   414: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   417: iconst_0
    //   418: ireturn
    //   419: ldc2_w 33
    //   422: ldc 35
    //   424: invokestatic 27	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   427: iconst_1
    //   428: ireturn
    //   429: goto -319 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	432	0	this	a
    //   0	432	1	paramAppBrandPageView	com.tencent.mm.plugin.appbrand.page.AppBrandPageView
    //   0	432	2	paramInt	int
    //   0	432	3	paramView	android.view.View
    //   0	432	4	paramJSONObject	JSONObject
    //   241	83	5	f1	float
    //   254	73	6	f2	float
    //   311	44	7	f3	float
    //   273	73	8	i	int
    //   292	73	9	j	int
    //   301	36	10	k	int
    //   17	357	11	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   52	67	153	java/lang/Exception
    //   67	89	393	java/lang/Exception
    //   93	110	393	java/lang/Exception
    //   110	119	393	java/lang/Exception
    //   121	146	393	java/lang/Exception
    //   186	192	393	java/lang/Exception
    //   192	208	393	java/lang/Exception
    //   210	386	393	java/lang/Exception
  }
  
  protected final int i(JSONObject paramJSONObject)
  {
    GMTrace.i(10449655431168L, 77856);
    try
    {
      int i = paramJSONObject.optInt("mapId");
      GMTrace.o(10449655431168L, 77856);
      return i;
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiAddMapCircles", "get mapId error, exception : %s", new Object[] { paramJSONObject });
      GMTrace.o(10449655431168L, 77856);
    }
    return 0;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/map/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */