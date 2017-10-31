package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.n;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  /* Error */
  public static void a(android.widget.TextView paramTextView, JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc2_w 9
    //   3: ldc 11
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnull +7 -> 16
    //   12: aload_1
    //   13: ifnonnull +12 -> 25
    //   16: ldc2_w 9
    //   19: ldc 11
    //   21: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   24: return
    //   25: aload_1
    //   26: ldc 22
    //   28: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   31: astore_3
    //   32: aload_3
    //   33: invokestatic 34	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   36: ifne +11 -> 47
    //   39: aload_0
    //   40: aload_3
    //   41: invokestatic 40	com/tencent/mm/plugin/appbrand/n/c:rZ	(Ljava/lang/String;)I
    //   44: invokevirtual 46	android/widget/TextView:setTextColor	(I)V
    //   47: aload_0
    //   48: iconst_0
    //   49: aload_1
    //   50: ldc 48
    //   52: invokevirtual 51	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   55: invokestatic 55	com/tencent/mm/plugin/appbrand/n/c:jF	(I)I
    //   58: i2f
    //   59: invokevirtual 59	android/widget/TextView:setTextSize	(IF)V
    //   62: aload_1
    //   63: ldc 61
    //   65: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   68: astore_3
    //   69: ldc 63
    //   71: aload_3
    //   72: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   75: ifeq +147 -> 222
    //   78: aload_0
    //   79: iconst_3
    //   80: invokevirtual 72	android/widget/TextView:setGravity	(I)V
    //   83: aload_1
    //   84: ldc 74
    //   86: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   89: astore_3
    //   90: ldc 76
    //   92: aload_3
    //   93: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   96: ifeq +161 -> 257
    //   99: aload_0
    //   100: invokevirtual 80	android/widget/TextView:getPaint	()Landroid/text/TextPaint;
    //   103: iconst_1
    //   104: invokevirtual 86	android/text/TextPaint:setFakeBoldText	(Z)V
    //   107: aload_1
    //   108: ldc 88
    //   110: aload_0
    //   111: invokevirtual 92	android/widget/TextView:getTextSize	()F
    //   114: ldc 93
    //   116: fmul
    //   117: invokestatic 99	java/lang/Math:round	(F)I
    //   120: invokevirtual 103	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   123: invokestatic 55	com/tencent/mm/plugin/appbrand/n/c:jF	(I)I
    //   126: istore_2
    //   127: aload_0
    //   128: instanceof 105
    //   131: ifeq +44 -> 175
    //   134: aload_0
    //   135: checkcast 105	com/tencent/mm/plugin/appbrand/widget/g
    //   138: astore_3
    //   139: aload_3
    //   140: getfield 109	com/tencent/mm/plugin/appbrand/widget/g:jzB	Lcom/tencent/mm/plugin/appbrand/widget/f/a;
    //   143: ifnonnull +16 -> 159
    //   146: aload_3
    //   147: new 111	com/tencent/mm/plugin/appbrand/widget/f/a
    //   150: dup
    //   151: iload_2
    //   152: i2f
    //   153: invokespecial 115	com/tencent/mm/plugin/appbrand/widget/f/a:<init>	(F)V
    //   156: putfield 109	com/tencent/mm/plugin/appbrand/widget/g:jzB	Lcom/tencent/mm/plugin/appbrand/widget/f/a;
    //   159: aload_3
    //   160: getfield 109	com/tencent/mm/plugin/appbrand/widget/g:jzB	Lcom/tencent/mm/plugin/appbrand/widget/f/a;
    //   163: iload_2
    //   164: i2f
    //   165: invokevirtual 119	com/tencent/mm/plugin/appbrand/widget/f/a:X	(F)Z
    //   168: ifeq +7 -> 175
    //   171: aload_3
    //   172: invokevirtual 123	com/tencent/mm/plugin/appbrand/widget/g:invalidate	()V
    //   175: aload_1
    //   176: ldc 125
    //   178: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   181: astore_3
    //   182: ldc 127
    //   184: aload_3
    //   185: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   188: ifeq +93 -> 281
    //   191: aload_0
    //   192: getstatic 133	android/text/TextUtils$TruncateAt:END	Landroid/text/TextUtils$TruncateAt;
    //   195: invokevirtual 137	android/widget/TextView:setEllipsize	(Landroid/text/TextUtils$TruncateAt;)V
    //   198: aload_0
    //   199: iconst_1
    //   200: invokevirtual 140	android/widget/TextView:setSingleLine	(Z)V
    //   203: aload_0
    //   204: aload_1
    //   205: ldc -114
    //   207: invokevirtual 28	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   210: invokevirtual 146	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   213: ldc2_w 9
    //   216: ldc 11
    //   218: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   221: return
    //   222: ldc -108
    //   224: aload_3
    //   225: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   228: ifeq +12 -> 240
    //   231: aload_0
    //   232: bipush 17
    //   234: invokevirtual 72	android/widget/TextView:setGravity	(I)V
    //   237: goto -154 -> 83
    //   240: ldc -106
    //   242: aload_3
    //   243: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   246: ifeq -163 -> 83
    //   249: aload_0
    //   250: iconst_5
    //   251: invokevirtual 72	android/widget/TextView:setGravity	(I)V
    //   254: goto -171 -> 83
    //   257: ldc -104
    //   259: aload_3
    //   260: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   263: ifeq -156 -> 107
    //   266: aload_0
    //   267: invokevirtual 80	android/widget/TextView:getPaint	()Landroid/text/TextPaint;
    //   270: iconst_0
    //   271: invokevirtual 86	android/text/TextPaint:setFakeBoldText	(Z)V
    //   274: goto -167 -> 107
    //   277: astore_3
    //   278: goto -171 -> 107
    //   281: ldc -102
    //   283: aload_3
    //   284: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   287: ifeq +11 -> 298
    //   290: aload_0
    //   291: iconst_1
    //   292: invokevirtual 140	android/widget/TextView:setSingleLine	(Z)V
    //   295: goto -92 -> 203
    //   298: ldc -100
    //   300: aload_3
    //   301: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   304: ifeq +11 -> 315
    //   307: aload_0
    //   308: iconst_0
    //   309: invokevirtual 140	android/widget/TextView:setSingleLine	(Z)V
    //   312: goto -109 -> 203
    //   315: ldc -98
    //   317: aload_3
    //   318: invokevirtual 69	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   321: ifeq -118 -> 203
    //   324: aload_0
    //   325: iconst_0
    //   326: invokevirtual 140	android/widget/TextView:setSingleLine	(Z)V
    //   329: goto -126 -> 203
    //   332: astore_0
    //   333: ldc2_w 9
    //   336: ldc 11
    //   338: invokestatic 20	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   341: return
    //   342: astore_3
    //   343: goto -281 -> 62
    //   346: astore_3
    //   347: goto -300 -> 47
    //   350: astore_3
    //   351: goto -268 -> 83
    //   354: astore_3
    //   355: goto -152 -> 203
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	358	0	paramTextView	android.widget.TextView
    //   0	358	1	paramJSONObject	JSONObject
    //   126	38	2	i	int
    //   31	229	3	localObject	Object
    //   277	41	3	localJSONException1	JSONException
    //   342	1	3	localJSONException2	JSONException
    //   346	1	3	localJSONException3	JSONException
    //   350	1	3	localJSONException4	JSONException
    //   354	1	3	localJSONException5	JSONException
    // Exception table:
    //   from	to	target	type
    //   83	107	277	org/json/JSONException
    //   257	274	277	org/json/JSONException
    //   203	213	332	org/json/JSONException
    //   47	62	342	org/json/JSONException
    //   25	47	346	org/json/JSONException
    //   62	83	350	org/json/JSONException
    //   222	237	350	org/json/JSONException
    //   240	254	350	org/json/JSONException
    //   175	203	354	org/json/JSONException
    //   281	295	354	org/json/JSONException
    //   298	312	354	org/json/JSONException
    //   315	329	354	org/json/JSONException
  }
  
  public static void a(AppBrandPageView paramAppBrandPageView, ImageView paramImageView, JSONObject paramJSONObject)
  {
    Object localObject = null;
    GMTrace.i(17675401035776L, 131692);
    if ((paramImageView == null) || (paramJSONObject == null))
    {
      GMTrace.o(17675401035776L, 131692);
      return;
    }
    for (;;)
    {
      String str;
      try
      {
        str = paramJSONObject.getString("iconPath");
        if (TextUtils.isEmpty(str)) {
          break label227;
        }
        if (str.startsWith("wxfile://"))
        {
          paramJSONObject = c.aI(paramAppBrandPageView.iqL, str);
          paramAppBrandPageView = (AppBrandPageView)localObject;
          if (paramJSONObject != null)
          {
            paramAppBrandPageView = (AppBrandPageView)localObject;
            if (!TextUtils.isEmpty(paramJSONObject.hhT))
            {
              paramJSONObject = paramJSONObject.hhT;
              paramAppBrandPageView = paramJSONObject;
              if (!paramJSONObject.startsWith("file://")) {
                paramAppBrandPageView = "file://" + paramJSONObject;
              }
              paramAppBrandPageView = b.CT().hh(paramAppBrandPageView);
            }
          }
          if ((paramAppBrandPageView != null) && (!paramAppBrandPageView.isRecycled())) {
            break;
          }
          paramImageView.setImageBitmap(null);
          GMTrace.o(17675401035776L, 131692);
          return;
        }
      }
      catch (JSONException paramAppBrandPageView)
      {
        GMTrace.o(17675401035776L, 131692);
        return;
      }
      if ((str.startsWith("https://")) || (str.startsWith("http://")))
      {
        paramJSONObject = b.CT().hh(str);
        paramAppBrandPageView = paramJSONObject;
        if (paramJSONObject == null)
        {
          b.CT().a(paramImageView, str, null, null);
          paramAppBrandPageView = paramJSONObject;
        }
      }
      else
      {
        paramAppBrandPageView = n.g(paramAppBrandPageView.irS, str);
      }
    }
    paramImageView.setImageBitmap(paramAppBrandPageView);
    label227:
    GMTrace.o(17675401035776L, 131692);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */