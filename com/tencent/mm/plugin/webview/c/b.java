package com.tencent.mm.plugin.webview.c;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.bq.a;
import com.tencent.mm.ipcinvoker.k;
import com.tencent.mm.modelappbrand.f;
import com.tencent.mm.modelappbrand.p;
import com.tencent.mm.modelappbrand.s;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.25;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.29;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class b
{
  public Context context;
  private MMWebView oKv;
  public HashMap<String, Object> sjf;
  private HashMap<String, Object> sjg;
  private HashMap<String, Object> sjh;
  public int sji;
  public com.tencent.mm.modelappbrand.e sjj;
  public com.tencent.mm.plugin.webview.ui.tools.jsapi.d sjk;
  Map<String, c> sjl;
  private Map<String, b> sjm;
  
  public b(Context paramContext, MMWebView paramMMWebView)
  {
    GMTrace.i(19465060220928L, 145026);
    this.sjf = new HashMap();
    this.sjg = new HashMap();
    this.sjh = new HashMap();
    this.sji = -1;
    this.sjl = new HashMap();
    this.sjm = new HashMap();
    this.context = paramContext;
    this.oKv = paramMMWebView;
    this.sjj = ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class));
    GMTrace.o(19465060220928L, 145026);
  }
  
  private void Kk(String paramString)
  {
    GMTrace.i(19465597091840L, 145030);
    if ((paramString != null) && (paramString.length() > 0))
    {
      View localView = (View)this.sjf.get(paramString);
      if (localView == null)
      {
        w.i("FTSSearchWidgetMgr", "removeWidget cacheKey %s, can not find view", new Object[] { paramString });
        GMTrace.o(19465597091840L, 145030);
        return;
      }
      w.i("FTSSearchWidgetMgr", "removing widget sessionId %s", new Object[] { localView.getTag().toString() });
      Object localObject;
      if (this.sjj != null)
      {
        localObject = (String)localView.getTag();
        this.sjj.a((String)localObject, localView);
      }
      this.sjf.remove(paramString);
      this.sjh.remove(paramString);
      localView = (View)this.sjg.get(paramString);
      if (localView != null)
      {
        localObject = (ViewGroup)this.oKv.getView();
        if ((localObject != null) && ((localObject instanceof AbsoluteLayout))) {
          ((ViewGroup)localObject).removeView(localView);
        }
        this.sjg.remove(paramString);
      }
    }
    GMTrace.o(19465597091840L, 145030);
  }
  
  public final void K(Bundle paramBundle)
  {
    GMTrace.i(19465194438656L, 145027);
    paramBundle = (String)paramBundle.get("widgetId");
    paramBundle = (b)this.sjm.get(paramBundle);
    if (paramBundle != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("app_id", paramBundle.fKY);
      localBundle.putString("msg_id", paramBundle.sjy);
      localBundle.putInt("pkg_type", paramBundle.fBH);
      localBundle.putInt("pkg_version", paramBundle.iCy);
      ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CI().b(this.context, localBundle);
    }
    GMTrace.o(19465194438656L, 145027);
  }
  
  public final void L(Bundle paramBundle)
  {
    GMTrace.i(19465462874112L, 145029);
    Kk(paramBundle.getString("fts_key_widget_view_cache_key"));
    GMTrace.o(19465462874112L, 145029);
  }
  
  public final void M(Bundle paramBundle)
  {
    GMTrace.i(19465731309568L, 145031);
    final Object localObject1 = paramBundle.getString("fts_key_json_data");
    final Object localObject2 = paramBundle.getString("fts_key_widget_view_cache_key");
    w.i("FTSSearchWidgetMgr", "updating widget: widgetId %s, jsonData %s", new Object[] { localObject2, localObject1 });
    View localView;
    for (;;)
    {
      try
      {
        paramBundle = new JSONObject((String)localObject1);
        if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
          break label528;
        }
        localObject1 = (View)this.sjf.get(localObject2);
        localView = (View)this.sjg.get(localObject2);
        if (localObject1 == null) {
          break label528;
        }
        final Object localObject3 = (AbsoluteLayout.LayoutParams)((View)localObject1).getLayoutParams();
        AbsoluteLayout.LayoutParams localLayoutParams = (AbsoluteLayout.LayoutParams)localView.getLayoutParams();
        if ((paramBundle.has("width")) || (paramBundle.has("height")))
        {
          int i = ((AbsoluteLayout.LayoutParams)localObject3).height;
          int j = a.fromDPToPix(this.context, paramBundle.optInt("height"));
          int k = ((AbsoluteLayout.LayoutParams)localObject3).width;
          int m = a.fromDPToPix(this.context, paramBundle.optInt("width"));
          localObject2 = (View)this.sjh.get(localObject2);
          w.i("FTSSearchWidgetMgr", "animating  size beginH %d, endH %d, beginW %d, endW %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
          if ((i != j) || (k != m))
          {
            localObject3 = ((View)localObject1).getLayoutParams();
            final ViewGroup.LayoutParams localLayoutParams1 = ((View)localObject2).getLayoutParams();
            ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { i, j });
            localValueAnimator.setDuration(300L);
            localValueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
            {
              public final void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
              {
                GMTrace.i(19472710631424L, 145083);
                int i = ((Integer)paramAnonymousValueAnimator.getAnimatedValue()).intValue();
                localObject3.height = i;
                localObject1.setLayoutParams(localObject3);
                localLayoutParams1.height = i;
                localObject2.setLayoutParams(localLayoutParams1);
                GMTrace.o(19472710631424L, 145083);
              }
            });
            localValueAnimator.start();
          }
        }
        if (paramBundle.has("offsetX")) {
          localLayoutParams.x = a.fromDPToPix(this.context, paramBundle.optInt("offsetX"));
        }
        if (paramBundle.has("offsetY")) {
          localLayoutParams.y = a.fromDPToPix(this.context, paramBundle.optInt("offsetY"));
        }
        localView.setLayoutParams(localLayoutParams);
        boolean bool = paramBundle.has("backgroundColor");
        if (bool) {}
        try
        {
          ((View)localObject1).setBackgroundColor(Color.parseColor(paramBundle.getString("backgroundColor")));
          if (!paramBundle.has("show")) {
            break label528;
          }
          if (paramBundle.has("show"))
          {
            bool = paramBundle.optBoolean("show");
            if (!bool) {
              break;
            }
            ((View)localObject1).setVisibility(0);
            localView.setVisibility(0);
            GMTrace.o(19465731309568L, 145031);
            return;
          }
        }
        catch (Exception localException)
        {
          w.e("FTSSearchWidgetMgr", bg.f(localException));
          continue;
        }
        bool = false;
      }
      catch (Exception paramBundle)
      {
        w.e("FTSSearchWidgetMgr", "the error is e");
        GMTrace.o(19465731309568L, 145031);
        return;
      }
    }
    ((View)localObject1).setVisibility(8);
    localView.setVisibility(8);
    label528:
    GMTrace.o(19465731309568L, 145031);
  }
  
  /* Error */
  public final void a(Bundle paramBundle, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 354
    //   3: ldc_w 356
    //   6: invokestatic 63	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ldc -22
    //   12: invokevirtual 224	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   15: astore 5
    //   17: aload_1
    //   18: ldc -36
    //   20: invokevirtual 224	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   23: astore 7
    //   25: aload_0
    //   26: invokestatic 362	com/tencent/mm/plugin/appbrand/n/g:aP	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: astore 8
    //   31: ldc 115
    //   33: ldc_w 364
    //   36: iconst_3
    //   37: anewarray 4	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload 7
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: aload 8
    //   49: aastore
    //   50: dup
    //   51: iconst_2
    //   52: aload 5
    //   54: aastore
    //   55: invokestatic 122	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: aload 5
    //   60: ifnull +11 -> 71
    //   63: aload 5
    //   65: invokevirtual 107	java/lang/String:length	()I
    //   68: ifne +21 -> 89
    //   71: ldc 115
    //   73: ldc_w 366
    //   76: invokestatic 368	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: ldc2_w 354
    //   82: ldc_w 356
    //   85: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   88: return
    //   89: aload_0
    //   90: getfield 78	com/tencent/mm/plugin/webview/c/b:sjm	Ljava/util/Map;
    //   93: aload 7
    //   95: invokeinterface 167 2 0
    //   100: checkcast 25	com/tencent/mm/plugin/webview/c/b$b
    //   103: astore_1
    //   104: aload_1
    //   105: ifnonnull +1188 -> 1293
    //   108: new 25	com/tencent/mm/plugin/webview/c/b$b
    //   111: dup
    //   112: aload_0
    //   113: invokespecial 371	com/tencent/mm/plugin/webview/c/b$b:<init>	(Lcom/tencent/mm/plugin/webview/c/b;)V
    //   116: astore_1
    //   117: aload_0
    //   118: getfield 78	com/tencent/mm/plugin/webview/c/b:sjm	Ljava/util/Map;
    //   121: aload 7
    //   123: aload_1
    //   124: invokeinterface 375 3 0
    //   129: pop
    //   130: new 238	org/json/JSONObject
    //   133: dup
    //   134: aload 5
    //   136: invokespecial 240	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   139: astore 9
    //   141: aload 9
    //   143: ldc_w 377
    //   146: invokevirtual 252	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   149: ifeq +1026 -> 1175
    //   152: aload 9
    //   154: ldc_w 379
    //   157: invokevirtual 252	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   160: ifeq +1015 -> 1175
    //   163: aload_0
    //   164: getfield 76	com/tencent/mm/plugin/webview/c/b:sjl	Ljava/util/Map;
    //   167: aload 7
    //   169: invokeinterface 167 2 0
    //   174: checkcast 28	com/tencent/mm/plugin/webview/c/b$c
    //   177: astore 6
    //   179: aload 6
    //   181: astore 5
    //   183: aload 6
    //   185: ifnonnull +27 -> 212
    //   188: new 28	com/tencent/mm/plugin/webview/c/b$c
    //   191: dup
    //   192: aload_0
    //   193: invokespecial 380	com/tencent/mm/plugin/webview/c/b$c:<init>	(Lcom/tencent/mm/plugin/webview/c/b;)V
    //   196: astore 5
    //   198: aload_0
    //   199: getfield 76	com/tencent/mm/plugin/webview/c/b:sjl	Ljava/util/Map;
    //   202: aload 7
    //   204: aload 5
    //   206: invokeinterface 375 3 0
    //   211: pop
    //   212: aload 5
    //   214: aload 9
    //   216: ldc_w 379
    //   219: invokevirtual 260	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   222: putfield 383	com/tencent/mm/plugin/webview/c/b$c:sjz	I
    //   225: aload 5
    //   227: aload 9
    //   229: ldc_w 377
    //   232: invokevirtual 260	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   235: putfield 386	com/tencent/mm/plugin/webview/c/b$c:sjA	I
    //   238: ldc 115
    //   240: ldc_w 388
    //   243: iconst_1
    //   244: anewarray 4	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload 5
    //   251: invokevirtual 389	com/tencent/mm/plugin/webview/c/b$c:toString	()Ljava/lang/String;
    //   254: aastore
    //   255: invokestatic 122	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: aload 9
    //   260: ldc_w 391
    //   263: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   266: astore 6
    //   268: aload 9
    //   270: ldc_w 396
    //   273: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   276: astore 11
    //   278: aload 9
    //   280: ldc_w 398
    //   283: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   286: astore 12
    //   288: aload 9
    //   290: ldc_w 400
    //   293: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   296: astore 13
    //   298: aload 9
    //   300: ldc_w 402
    //   303: invokevirtual 405	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   306: istore 4
    //   308: aload 9
    //   310: ldc_w 407
    //   313: invokevirtual 252	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   316: ifne +920 -> 1236
    //   319: iconst_0
    //   320: istore_3
    //   321: getstatic 413	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   324: sipush 14452
    //   327: iconst_3
    //   328: anewarray 4	java/lang/Object
    //   331: dup
    //   332: iconst_0
    //   333: new 182	java/lang/StringBuilder
    //   336: dup
    //   337: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   340: aload 9
    //   342: ldc_w 398
    //   345: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   348: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: ldc_w 415
    //   354: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: aload 6
    //   359: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   365: aastore
    //   366: dup
    //   367: iconst_1
    //   368: iconst_1
    //   369: invokestatic 276	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   372: aastore
    //   373: dup
    //   374: iconst_2
    //   375: invokestatic 421	java/lang/System:currentTimeMillis	()J
    //   378: invokestatic 426	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   381: aastore
    //   382: invokevirtual 429	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   385: aload_0
    //   386: getfield 92	com/tencent/mm/plugin/webview/c/b:sjj	Lcom/tencent/mm/modelappbrand/e;
    //   389: aload_0
    //   390: getfield 80	com/tencent/mm/plugin/webview/c/b:context	Landroid/content/Context;
    //   393: invokeinterface 433 2 0
    //   398: astore 10
    //   400: getstatic 413	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   403: sipush 14452
    //   406: iconst_3
    //   407: anewarray 4	java/lang/Object
    //   410: dup
    //   411: iconst_0
    //   412: new 182	java/lang/StringBuilder
    //   415: dup
    //   416: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   419: aload 9
    //   421: ldc_w 398
    //   424: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   427: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: ldc_w 415
    //   433: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: aload 6
    //   438: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   444: aastore
    //   445: dup
    //   446: iconst_1
    //   447: iconst_2
    //   448: invokestatic 276	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   451: aastore
    //   452: dup
    //   453: iconst_2
    //   454: invokestatic 421	java/lang/System:currentTimeMillis	()J
    //   457: invokestatic 426	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   460: aastore
    //   461: invokevirtual 429	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   464: aload_0
    //   465: getfield 80	com/tencent/mm/plugin/webview/c/b:context	Landroid/content/Context;
    //   468: invokestatic 439	com/tencent/mm/ui/v:fa	(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   471: getstatic 444	com/tencent/mm/R$i:cVM	I
    //   474: aconst_null
    //   475: invokevirtual 450	android/view/LayoutInflater:inflate	(ILandroid/view/ViewGroup;)Landroid/view/View;
    //   478: checkcast 148	android/widget/AbsoluteLayout
    //   481: astore 5
    //   483: aload 5
    //   485: new 246	android/widget/AbsoluteLayout$LayoutParams
    //   488: dup
    //   489: iconst_m1
    //   490: bipush -2
    //   492: aload_0
    //   493: getfield 80	com/tencent/mm/plugin/webview/c/b:context	Landroid/content/Context;
    //   496: aload 9
    //   498: ldc_w 307
    //   501: invokevirtual 405	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   504: invokestatic 266	com/tencent/mm/bq/a:fromDPToPix	(Landroid/content/Context;I)I
    //   507: aload_0
    //   508: getfield 80	com/tencent/mm/plugin/webview/c/b:context	Landroid/content/Context;
    //   511: aload 9
    //   513: ldc_w 312
    //   516: invokevirtual 405	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   519: invokestatic 266	com/tencent/mm/bq/a:fromDPToPix	(Landroid/content/Context;I)I
    //   522: invokespecial 453	android/widget/AbsoluteLayout$LayoutParams:<init>	(IIII)V
    //   525: invokevirtual 454	android/widget/AbsoluteLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   528: new 246	android/widget/AbsoluteLayout$LayoutParams
    //   531: dup
    //   532: aload_0
    //   533: getfield 80	com/tencent/mm/plugin/webview/c/b:context	Landroid/content/Context;
    //   536: aload 9
    //   538: ldc -8
    //   540: invokevirtual 405	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   543: invokestatic 266	com/tencent/mm/bq/a:fromDPToPix	(Landroid/content/Context;I)I
    //   546: aload_0
    //   547: getfield 80	com/tencent/mm/plugin/webview/c/b:context	Landroid/content/Context;
    //   550: aload 9
    //   552: ldc -2
    //   554: invokevirtual 405	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   557: invokestatic 266	com/tencent/mm/bq/a:fromDPToPix	(Landroid/content/Context;I)I
    //   560: iconst_0
    //   561: iconst_0
    //   562: invokespecial 453	android/widget/AbsoluteLayout$LayoutParams:<init>	(IIII)V
    //   565: astore 15
    //   567: aload 10
    //   569: aload 15
    //   571: invokevirtual 319	android/view/View:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   574: aload 5
    //   576: aload 10
    //   578: invokevirtual 457	android/widget/AbsoluteLayout:addView	(Landroid/view/View;)V
    //   581: aload 5
    //   583: getstatic 462	com/tencent/mm/R$h:bUr	I
    //   586: invokevirtual 466	android/widget/AbsoluteLayout:findViewById	(I)Landroid/view/View;
    //   589: checkcast 468	android/widget/FrameLayout
    //   592: astore 14
    //   594: aload 14
    //   596: aload 15
    //   598: invokevirtual 469	android/widget/FrameLayout:setLayoutParams	(Landroid/view/ViewGroup$LayoutParams;)V
    //   601: aload 5
    //   603: aload 14
    //   605: invokevirtual 470	android/widget/AbsoluteLayout:removeView	(Landroid/view/View;)V
    //   608: aload 5
    //   610: aload 14
    //   612: invokevirtual 457	android/widget/AbsoluteLayout:addView	(Landroid/view/View;)V
    //   615: aload 10
    //   617: aload 9
    //   619: ldc_w 321
    //   622: invokevirtual 322	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   625: invokestatic 327	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   628: invokevirtual 331	android/view/View:setBackgroundColor	(I)V
    //   631: aload 10
    //   633: aload 8
    //   635: invokevirtual 474	android/view/View:setTag	(Ljava/lang/Object;)V
    //   638: aload_0
    //   639: getfield 68	com/tencent/mm/plugin/webview/c/b:sjf	Ljava/util/HashMap;
    //   642: aload 7
    //   644: aload 10
    //   646: invokevirtual 475	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   649: pop
    //   650: aload_0
    //   651: getfield 70	com/tencent/mm/plugin/webview/c/b:sjg	Ljava/util/HashMap;
    //   654: aload 7
    //   656: aload 5
    //   658: invokevirtual 475	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   661: pop
    //   662: aload_0
    //   663: getfield 72	com/tencent/mm/plugin/webview/c/b:sjh	Ljava/util/HashMap;
    //   666: aload 7
    //   668: aload 14
    //   670: invokevirtual 475	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   673: pop
    //   674: aload 5
    //   676: getstatic 478	com/tencent/mm/R$h:bUq	I
    //   679: invokevirtual 466	android/widget/AbsoluteLayout:findViewById	(I)Landroid/view/View;
    //   682: checkcast 480	com/tencent/mm/ui/widget/ThreeDotsLoadingView
    //   685: astore 14
    //   687: aload 5
    //   689: getstatic 483	com/tencent/mm/R$h:bzD	I
    //   692: invokevirtual 466	android/widget/AbsoluteLayout:findViewById	(I)Landroid/view/View;
    //   695: checkcast 485	android/widget/ImageView
    //   698: astore 15
    //   700: aload 9
    //   702: ldc_w 487
    //   705: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   708: astore 17
    //   710: new 182	java/lang/StringBuilder
    //   713: dup
    //   714: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   717: aload 6
    //   719: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   722: ldc_w 489
    //   725: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   728: aload 17
    //   730: invokevirtual 492	java/lang/String:hashCode	()I
    //   733: invokevirtual 495	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   736: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   739: astore 18
    //   741: new 161	android/os/Bundle
    //   744: dup
    //   745: invokespecial 168	android/os/Bundle:<init>	()V
    //   748: astore 16
    //   750: aload 16
    //   752: ldc -86
    //   754: aload 6
    //   756: invokevirtual 178	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   759: aload 16
    //   761: ldc -76
    //   763: aload 18
    //   765: invokevirtual 178	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   768: aload 16
    //   770: ldc_w 497
    //   773: aload 12
    //   775: invokevirtual 178	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   778: aload 16
    //   780: ldc_w 499
    //   783: aload 17
    //   785: invokevirtual 178	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   788: aload 16
    //   790: ldc_w 501
    //   793: aload 13
    //   795: invokevirtual 178	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   798: aload 16
    //   800: ldc_w 503
    //   803: aload 11
    //   805: invokevirtual 178	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   808: aload 16
    //   810: ldc -54
    //   812: iload 4
    //   814: invokevirtual 200	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   817: aload 16
    //   819: ldc_w 505
    //   822: iload_3
    //   823: invokevirtual 200	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   826: aload 16
    //   828: ldc_w 507
    //   831: aload 9
    //   833: ldc_w 509
    //   836: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   839: invokevirtual 178	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   842: aload 16
    //   844: ldc_w 511
    //   847: iconst_1
    //   848: invokevirtual 200	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   851: aload 16
    //   853: ldc_w 513
    //   856: iload_2
    //   857: invokestatic 519	com/tencent/mm/ay/d:gz	(I)I
    //   860: invokevirtual 200	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   863: aload 16
    //   865: ldc_w 521
    //   868: aload_0
    //   869: getfield 80	com/tencent/mm/plugin/webview/c/b:context	Landroid/content/Context;
    //   872: aload 9
    //   874: ldc -8
    //   876: invokevirtual 405	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   879: invokestatic 266	com/tencent/mm/bq/a:fromDPToPix	(Landroid/content/Context;I)I
    //   882: invokevirtual 200	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   885: aload 16
    //   887: ldc_w 523
    //   890: aload_0
    //   891: getfield 80	com/tencent/mm/plugin/webview/c/b:context	Landroid/content/Context;
    //   894: aload 9
    //   896: ldc -2
    //   898: invokevirtual 405	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   901: invokestatic 266	com/tencent/mm/bq/a:fromDPToPix	(Landroid/content/Context;I)I
    //   904: invokevirtual 200	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   907: aload 16
    //   909: ldc_w 525
    //   912: aload 9
    //   914: ldc_w 487
    //   917: invokevirtual 394	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   920: invokevirtual 178	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   923: aload 14
    //   925: iconst_0
    //   926: invokevirtual 526	com/tencent/mm/ui/widget/ThreeDotsLoadingView:setVisibility	(I)V
    //   929: aload 15
    //   931: iconst_4
    //   932: invokevirtual 527	android/widget/ImageView:setVisibility	(I)V
    //   935: aload 14
    //   937: invokevirtual 530	com/tencent/mm/ui/widget/ThreeDotsLoadingView:cgs	()V
    //   940: aload_1
    //   941: aload 6
    //   943: putfield 174	com/tencent/mm/plugin/webview/c/b$b:fKY	Ljava/lang/String;
    //   946: aload_1
    //   947: iload_3
    //   948: putfield 196	com/tencent/mm/plugin/webview/c/b$b:fBH	I
    //   951: aload_1
    //   952: iload 4
    //   954: putfield 205	com/tencent/mm/plugin/webview/c/b$b:iCy	I
    //   957: aload_1
    //   958: aload 18
    //   960: putfield 186	com/tencent/mm/plugin/webview/c/b$b:sjy	Ljava/lang/String;
    //   963: ldc 115
    //   965: ldc_w 532
    //   968: iconst_1
    //   969: anewarray 4	java/lang/Object
    //   972: dup
    //   973: iconst_0
    //   974: aload_1
    //   975: invokevirtual 533	com/tencent/mm/plugin/webview/c/b$b:toString	()Ljava/lang/String;
    //   978: aastore
    //   979: invokestatic 122	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   982: new 535	com/tencent/mm/modelappbrand/r
    //   985: dup
    //   986: new 6	com/tencent/mm/plugin/webview/c/b$1
    //   989: dup
    //   990: aload_0
    //   991: aload 8
    //   993: aload 14
    //   995: aload 15
    //   997: invokespecial 538	com/tencent/mm/plugin/webview/c/b$1:<init>	(Lcom/tencent/mm/plugin/webview/c/b;Ljava/lang/String;Lcom/tencent/mm/ui/widget/ThreeDotsLoadingView;Landroid/widget/ImageView;)V
    //   1000: invokespecial 541	com/tencent/mm/modelappbrand/r:<init>	(Lcom/tencent/mm/modelappbrand/f;)V
    //   1003: astore_1
    //   1004: aload_1
    //   1005: new 8	com/tencent/mm/plugin/webview/c/b$2
    //   1008: dup
    //   1009: aload_0
    //   1010: aload 7
    //   1012: invokespecial 544	com/tencent/mm/plugin/webview/c/b$2:<init>	(Lcom/tencent/mm/plugin/webview/c/b;Ljava/lang/String;)V
    //   1015: invokevirtual 547	com/tencent/mm/modelappbrand/r:a	(Lcom/tencent/mm/modelappbrand/i;)V
    //   1018: aload_1
    //   1019: new 10	com/tencent/mm/plugin/webview/c/b$3
    //   1022: dup
    //   1023: aload_0
    //   1024: aload 7
    //   1026: invokespecial 548	com/tencent/mm/plugin/webview/c/b$3:<init>	(Lcom/tencent/mm/plugin/webview/c/b;Ljava/lang/String;)V
    //   1029: invokevirtual 547	com/tencent/mm/modelappbrand/r:a	(Lcom/tencent/mm/modelappbrand/i;)V
    //   1032: aload_1
    //   1033: new 12	com/tencent/mm/plugin/webview/c/b$4
    //   1036: dup
    //   1037: aload_0
    //   1038: aload 7
    //   1040: invokespecial 549	com/tencent/mm/plugin/webview/c/b$4:<init>	(Lcom/tencent/mm/plugin/webview/c/b;Ljava/lang/String;)V
    //   1043: invokevirtual 547	com/tencent/mm/modelappbrand/r:a	(Lcom/tencent/mm/modelappbrand/i;)V
    //   1046: aload_1
    //   1047: new 14	com/tencent/mm/plugin/webview/c/b$5
    //   1050: dup
    //   1051: aload_0
    //   1052: invokespecial 550	com/tencent/mm/plugin/webview/c/b$5:<init>	(Lcom/tencent/mm/plugin/webview/c/b;)V
    //   1055: invokevirtual 547	com/tencent/mm/modelappbrand/r:a	(Lcom/tencent/mm/modelappbrand/i;)V
    //   1058: aload_0
    //   1059: getfield 92	com/tencent/mm/plugin/webview/c/b:sjj	Lcom/tencent/mm/modelappbrand/e;
    //   1062: aload 8
    //   1064: aload 10
    //   1066: aload 16
    //   1068: aload_1
    //   1069: invokeinterface 553 5 0
    //   1074: pop
    //   1075: new 16	com/tencent/mm/plugin/webview/c/b$6
    //   1078: dup
    //   1079: aload_0
    //   1080: aload 14
    //   1082: aload 15
    //   1084: aload 8
    //   1086: aload 10
    //   1088: aload 5
    //   1090: aload 9
    //   1092: aload 6
    //   1094: invokespecial 556	com/tencent/mm/plugin/webview/c/b$6:<init>	(Lcom/tencent/mm/plugin/webview/c/b;Lcom/tencent/mm/ui/widget/ThreeDotsLoadingView;Landroid/widget/ImageView;Ljava/lang/String;Landroid/view/View;Landroid/widget/AbsoluteLayout;Lorg/json/JSONObject;Ljava/lang/String;)V
    //   1097: invokestatic 562	com/tencent/mm/bu/a:post	(Ljava/lang/Runnable;)Z
    //   1100: pop
    //   1101: aload_0
    //   1102: getfield 82	com/tencent/mm/plugin/webview/c/b:oKv	Lcom/tencent/mm/ui/widget/MMWebView;
    //   1105: invokevirtual 144	com/tencent/mm/ui/widget/MMWebView:getView	()Landroid/view/View;
    //   1108: checkcast 146	android/view/ViewGroup
    //   1111: astore_1
    //   1112: aload_1
    //   1113: ifnull +148 -> 1261
    //   1116: aload_1
    //   1117: instanceof 148
    //   1120: ifeq +141 -> 1261
    //   1123: aload_1
    //   1124: aload 5
    //   1126: invokevirtual 563	android/view/ViewGroup:addView	(Landroid/view/View;)V
    //   1129: ldc2_w 354
    //   1132: ldc_w 356
    //   1135: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1138: return
    //   1139: astore_1
    //   1140: ldc 115
    //   1142: new 182	java/lang/StringBuilder
    //   1145: dup
    //   1146: ldc_w 565
    //   1149: invokespecial 566	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1152: aload_1
    //   1153: invokevirtual 567	java/lang/Exception:toString	()Ljava/lang/String;
    //   1156: invokevirtual 190	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1159: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1162: invokestatic 348	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1165: ldc2_w 354
    //   1168: ldc_w 356
    //   1171: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1174: return
    //   1175: aload_0
    //   1176: getfield 76	com/tencent/mm/plugin/webview/c/b:sjl	Ljava/util/Map;
    //   1179: aload 7
    //   1181: invokeinterface 568 2 0
    //   1186: checkcast 28	com/tencent/mm/plugin/webview/c/b$c
    //   1189: astore 5
    //   1191: ldc 115
    //   1193: new 182	java/lang/StringBuilder
    //   1196: dup
    //   1197: ldc_w 570
    //   1200: invokespecial 566	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1203: aload 5
    //   1205: invokevirtual 573	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1208: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1211: invokestatic 368	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1214: goto -956 -> 258
    //   1217: astore_1
    //   1218: ldc 115
    //   1220: ldc_w 575
    //   1223: invokestatic 348	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1226: ldc2_w 354
    //   1229: ldc_w 356
    //   1232: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1235: return
    //   1236: aload 9
    //   1238: ldc_w 407
    //   1241: invokevirtual 260	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   1244: istore_3
    //   1245: goto -924 -> 321
    //   1248: astore 15
    //   1250: ldc 115
    //   1252: ldc_w 577
    //   1255: invokestatic 348	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1258: goto -627 -> 631
    //   1261: ldc 115
    //   1263: new 182	java/lang/StringBuilder
    //   1266: dup
    //   1267: ldc_w 579
    //   1270: invokespecial 566	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1273: aload_1
    //   1274: invokevirtual 573	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1277: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1280: invokestatic 348	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1283: ldc2_w 354
    //   1286: ldc_w 356
    //   1289: invokestatic 95	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1292: return
    //   1293: goto -1163 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1296	0	this	b
    //   0	1296	1	paramBundle	Bundle
    //   0	1296	2	paramInt	int
    //   320	925	3	i	int
    //   306	647	4	j	int
    //   15	1189	5	localObject1	Object
    //   177	916	6	localObject2	Object
    //   23	1157	7	str1	String
    //   29	1056	8	str2	String
    //   139	1098	9	localJSONObject	JSONObject
    //   398	689	10	localView	View
    //   276	528	11	str3	String
    //   286	488	12	str4	String
    //   296	498	13	str5	String
    //   592	489	14	localObject3	Object
    //   565	518	15	localObject4	Object
    //   1248	1	15	localException	Exception
    //   748	319	16	localBundle	Bundle
    //   708	76	17	str6	String
    //   739	220	18	str7	String
    // Exception table:
    //   from	to	target	type
    //   141	179	1139	java/lang/Exception
    //   188	212	1139	java/lang/Exception
    //   212	258	1139	java/lang/Exception
    //   258	319	1139	java/lang/Exception
    //   321	615	1139	java/lang/Exception
    //   631	1112	1139	java/lang/Exception
    //   1116	1138	1139	java/lang/Exception
    //   1175	1214	1139	java/lang/Exception
    //   1236	1245	1139	java/lang/Exception
    //   1250	1258	1139	java/lang/Exception
    //   1261	1283	1139	java/lang/Exception
    //   89	104	1217	org/json/JSONException
    //   108	130	1217	org/json/JSONException
    //   130	141	1217	org/json/JSONException
    //   141	179	1217	org/json/JSONException
    //   188	212	1217	org/json/JSONException
    //   212	258	1217	org/json/JSONException
    //   258	319	1217	org/json/JSONException
    //   321	615	1217	org/json/JSONException
    //   615	631	1217	org/json/JSONException
    //   631	1112	1217	org/json/JSONException
    //   1116	1138	1217	org/json/JSONException
    //   1140	1165	1217	org/json/JSONException
    //   1175	1214	1217	org/json/JSONException
    //   1236	1245	1217	org/json/JSONException
    //   1250	1258	1217	org/json/JSONException
    //   1261	1283	1217	org/json/JSONException
    //   1283	1292	1217	org/json/JSONException
    //   615	631	1248	java/lang/Exception
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19466133962752L, 145034);
    try
    {
      if (this.sjj == null) {
        break label152;
      }
      Iterator localIterator = this.sjf.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if ((str1 != null) && (str1.length() > 0))
        {
          String str2 = (String)((View)this.sjf.get(str1)).getTag();
          this.sjj.hc(str2);
          if ((View)this.sjg.get(str1) != null)
          {
            Kk(str1);
            this.sjg.remove(str1);
          }
        }
      }
      this.sjf.clear();
    }
    catch (Exception localException)
    {
      w.e("FTSSearchWidgetMgr", bg.f(localException));
      GMTrace.o(19466133962752L, 145034);
      return;
    }
    this.sjh.clear();
    label152:
    GMTrace.o(19466133962752L, 145034);
  }
  
  public final void onPause()
  {
    GMTrace.i(19465999745024L, 145033);
    if (this.sjj != null)
    {
      Iterator localIterator = this.sjf.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((str != null) && (str.length() > 0))
        {
          str = (String)((View)this.sjf.get(str)).getTag();
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CH().ha(str);
        }
      }
    }
    GMTrace.o(19465999745024L, 145033);
  }
  
  public final void onResume()
  {
    GMTrace.i(19465865527296L, 145032);
    if (this.sjj != null)
    {
      Iterator localIterator = this.sjf.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((str != null) && (str.length() > 0))
        {
          str = (String)((View)this.sjf.get(str)).getTag();
          ((com.tencent.mm.modelappbrand.e)com.tencent.mm.kernel.h.h(com.tencent.mm.modelappbrand.e.class)).CH().hb(str);
        }
      }
    }
    GMTrace.o(19465865527296L, 145032);
  }
  
  private static class a
    implements k
  {
    private a()
    {
      GMTrace.i(19474052808704L, 145093);
      GMTrace.o(19474052808704L, 145093);
    }
    
    public final Bundle l(Bundle paramBundle)
    {
      GMTrace.i(19474187026432L, 145094);
      paramBundle = com.tencent.mm.x.c.c.Cu().em("100266");
      if (paramBundle.isValid()) {}
      for (int i = com.tencent.mm.platformtools.t.getInt((String)paramBundle.bPn().get("search_wa_widget_init_out_time"), 8000);; i = 8000)
      {
        paramBundle = new Bundle();
        paramBundle.putInt("search_wa_widget_init_out_time", i);
        GMTrace.o(19474187026432L, 145094);
        return paramBundle;
      }
    }
  }
  
  private final class b
  {
    int fBH;
    String fKY;
    int iCy;
    String sjy;
    
    public b()
    {
      GMTrace.i(19470160494592L, 145064);
      GMTrace.o(19470160494592L, 145064);
    }
    
    public final String toString()
    {
      GMTrace.i(20362574168064L, 151713);
      String str = String.format("WidgetInfo appid %s, widgetId %s, pkgType %d, pkgVer %d", new Object[] { this.fKY, this.sjy, Integer.valueOf(this.fBH), Integer.valueOf(this.iCy) });
      GMTrace.o(20362574168064L, 151713);
      return str;
    }
  }
  
  private final class c
  {
    int sjA;
    int sjz;
    
    public c()
    {
      GMTrace.i(19473113284608L, 145086);
      GMTrace.o(19473113284608L, 145086);
    }
    
    public final String toString()
    {
      GMTrace.i(19473247502336L, 145087);
      String str = String.format("minH %d, maxH %d", new Object[] { Integer.valueOf(this.sjz), Integer.valueOf(this.sjA) });
      GMTrace.o(19473247502336L, 145087);
      return str;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */