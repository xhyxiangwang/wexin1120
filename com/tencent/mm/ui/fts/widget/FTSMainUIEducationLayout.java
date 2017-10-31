package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ay.d;
import com.tencent.mm.bq.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class FTSMainUIEducationLayout
  extends LinearLayout
{
  protected TextView iiM;
  protected View.OnClickListener pnn;
  protected List<LinearLayout> wGk;
  protected Map<Integer, TextView> wGl;
  public String wGm;
  protected boolean wGn;
  public boolean wGo;
  public View.OnClickListener wGp;
  public View.OnClickListener wGq;
  
  public FTSMainUIEducationLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16179007586304L, 120543);
    this.wGl = new HashMap();
    this.wGm = "";
    this.wGn = true;
    MH();
    GMTrace.o(16179007586304L, 120543);
  }
  
  public FTSMainUIEducationLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16179141804032L, 120544);
    this.wGl = new HashMap();
    this.wGm = "";
    this.wGn = true;
    MH();
    GMTrace.o(16179141804032L, 120544);
  }
  
  private void MH()
  {
    GMTrace.i(16179276021760L, 120545);
    setOrientation(1);
    this.wGk = new ArrayList();
    GMTrace.o(16179276021760L, 120545);
  }
  
  private void bN(Object paramObject)
  {
    GMTrace.i(19223602528256L, 143227);
    String str;
    if ((paramObject != null) && ((paramObject instanceof JSONObject)))
    {
      str = ((JSONObject)paramObject).optString("businessType");
      if (!bg.mZ(str)) {
        if (this.wGm != null) {
          break label121;
        }
      }
    }
    label121:
    for (paramObject = "";; paramObject = this.wGm)
    {
      this.wGm = ((String)paramObject);
      if (this.wGm.length() > 0) {
        this.wGm += "|";
      }
      this.wGm += str;
      GMTrace.o(19223602528256L, 143227);
      return;
    }
  }
  
  private void ceE()
  {
    GMTrace.i(16795872264192L, 125139);
    Iterator localIterator = this.wGk.iterator();
    while (localIterator.hasNext()) {
      removeView((LinearLayout)localIterator.next());
    }
    this.wGk.clear();
    this.wGl.clear();
    this.wGm = "";
    GMTrace.o(16795872264192L, 125139);
  }
  
  private void ceF()
  {
    GMTrace.i(16179812892672L, 120549);
    a(getContext().getString(R.l.eEB), null, getContext().getString(R.l.eEy), null, getContext().getString(R.l.eEz), null, a.U(getContext(), R.f.aSh));
    ceG();
    GMTrace.o(16179812892672L, 120549);
  }
  
  public final void Dc(int paramInt)
  {
    GMTrace.i(16796274917376L, 125142);
    Iterator localIterator = this.wGl.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Integer)localEntry.getKey()).intValue() == paramInt) {
        ((TextView)localEntry.getValue()).setTextColor(Color.parseColor("#B5B5B5"));
      } else {
        ((TextView)localEntry.getValue()).setTextColor(Color.parseColor("#45C01A"));
      }
    }
    GMTrace.o(16796274917376L, 125142);
  }
  
  public final String Dd(int paramInt)
  {
    GMTrace.i(16796409135104L, 125143);
    Object localObject = (TextView)this.wGl.get(Integer.valueOf(paramInt));
    if (localObject == null)
    {
      GMTrace.o(16796409135104L, 125143);
      return "";
    }
    localObject = ((TextView)localObject).getText().toString();
    GMTrace.o(16796409135104L, 125143);
    return (String)localObject;
  }
  
  public final void X(JSONObject paramJSONObject)
  {
    GMTrace.i(16179544457216L, 120547);
    ceE();
    try
    {
      if (!Y(paramJSONObject)) {
        ceF();
      }
      GMTrace.o(16179544457216L, 120547);
      return;
    }
    catch (Exception paramJSONObject)
    {
      ceF();
      GMTrace.o(16179544457216L, 120547);
    }
  }
  
  protected boolean Y(JSONObject paramJSONObject)
  {
    GMTrace.i(16179678674944L, 120548);
    if (paramJSONObject == null)
    {
      GMTrace.o(16179678674944L, 120548);
      return false;
    }
    if (this.iiM == null) {
      this.iiM = ((TextView)findViewById(R.h.bDo));
    }
    String str1 = paramJSONObject.optString("title");
    if (bg.mZ(str1)) {
      this.iiM.setText(R.l.eEA);
    }
    JSONArray localJSONArray;
    for (;;)
    {
      localJSONArray = paramJSONObject.optJSONArray("items");
      if (localJSONArray != null) {
        break;
      }
      GMTrace.o(16179678674944L, 120548);
      return false;
      this.iiM.setText(str1);
    }
    String str2 = null;
    str1 = null;
    paramJSONObject = null;
    Object localObject = null;
    int i;
    int j;
    label148:
    JSONObject localJSONObject;
    if (v.eq(ab.getContext()).equalsIgnoreCase("en"))
    {
      i = a.U(getContext(), R.f.aRc);
      j = 0;
      if (j >= localJSONArray.length()) {
        break label265;
      }
      localJSONObject = localJSONArray.optJSONObject(j);
      if (j % 3 != 0) {
        break label205;
      }
      str2 = localJSONObject.optString("hotword");
      paramJSONObject = localJSONObject;
    }
    for (;;)
    {
      j += 1;
      break label148;
      i = a.U(getContext(), R.f.aSh);
      break;
      label205:
      if (j % 3 == 1)
      {
        str1 = localJSONObject.optString("hotword");
        localObject = localJSONObject;
      }
      else
      {
        a(str2, paramJSONObject, str1, localObject, localJSONObject.optString("hotword"), localJSONObject, i);
        str2 = null;
        str1 = null;
        paramJSONObject = null;
        localObject = null;
      }
    }
    label265:
    if ((str2 != null) && (paramJSONObject != null)) {
      a(str2, paramJSONObject, str1, localObject, null, null, i);
    }
    GMTrace.o(16179678674944L, 120548);
    return true;
  }
  
  protected final void a(String paramString1, Object paramObject1, String paramString2, Object paramObject2, String paramString3, Object paramObject3, int paramInt)
  {
    GMTrace.i(16179947110400L, 120550);
    w.i("MicroMsg.FTS.FTSMainUIEducationLayout", "addCellLayout %s %s %s", new Object[] { paramString1, paramString2, paramString3 });
    if (!bg.mZ(paramString1))
    {
      LinearLayout localLinearLayout = (LinearLayout)inflate(getContext(), R.i.cVD, null);
      TextView localTextView = (TextView)localLinearLayout.findViewById(R.h.cAu);
      localTextView.setText(paramString1);
      localTextView.setTag(paramObject1);
      localTextView.setVisibility(0);
      localTextView.setOnClickListener(this.pnn);
      this.wGl.put(Integer.valueOf(d.a((JSONObject)paramObject1, paramString1, getContext())), localTextView);
      bN(paramObject1);
      if (!bg.mZ(paramString2))
      {
        paramString1 = (TextView)localLinearLayout.findViewById(R.h.cAv);
        paramString1.setText(paramString2);
        paramString1.setTag(paramObject2);
        paramString1.setVisibility(0);
        paramString1.setOnClickListener(this.pnn);
        paramObject1 = localLinearLayout.findViewById(R.h.bCf);
        ((View)paramObject1).getLayoutParams().height = paramInt;
        ((View)paramObject1).setVisibility(0);
        this.wGl.put(Integer.valueOf(d.a((JSONObject)paramObject2, paramString2, getContext())), paramString1);
        bN(paramObject2);
        if (!bg.mZ(paramString3))
        {
          paramString1 = (TextView)localLinearLayout.findViewById(R.h.cAw);
          paramString1.setText(paramString3);
          paramString1.setTag(paramObject3);
          paramString1.setVisibility(0);
          paramString1.setOnClickListener(this.pnn);
          paramObject1 = localLinearLayout.findViewById(R.h.bCg);
          ((View)paramObject1).getLayoutParams().height = paramInt;
          ((View)paramObject1).setVisibility(0);
          this.wGl.put(Integer.valueOf(d.a((JSONObject)paramObject3, paramString3, getContext())), paramString1);
          bN(paramObject3);
        }
      }
      this.wGk.add(localLinearLayout);
      addView(localLinearLayout);
    }
    GMTrace.o(16179947110400L, 120550);
  }
  
  /* Error */
  public final void ar()
  {
    // Byte code:
    //   0: ldc2_w 397
    //   3: ldc_w 399
    //   6: invokestatic 34	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokespecial 251	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:ceE	()V
    //   13: aload_0
    //   14: ldc_w 401
    //   17: invokestatic 407	com/tencent/mm/ay/j:kA	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   20: invokevirtual 255	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:Y	(Lorg/json/JSONObject;)Z
    //   23: ifne +7 -> 30
    //   26: aload_0
    //   27: invokespecial 257	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:ceF	()V
    //   30: aload_0
    //   31: getfield 47	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGn	Z
    //   34: ifeq +91 -> 125
    //   37: ldc_w 409
    //   40: invokestatic 407	com/tencent/mm/ay/j:kA	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   43: ldc_w 281
    //   46: invokevirtual 285	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   49: iconst_0
    //   50: invokevirtual 312	org/json/JSONArray:optJSONObject	(I)Lorg/json/JSONObject;
    //   53: ldc_w 314
    //   56: invokevirtual 85	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   59: astore_2
    //   60: aload_2
    //   61: invokestatic 91	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   64: ifne +61 -> 125
    //   67: aload_0
    //   68: invokevirtual 148	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:getContext	()Landroid/content/Context;
    //   71: getstatic 412	com/tencent/mm/R$i:cVF	I
    //   74: aconst_null
    //   75: invokestatic 337	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   78: checkcast 4	android/widget/LinearLayout
    //   81: astore_3
    //   82: aload_3
    //   83: getstatic 415	com/tencent/mm/R$h:bOQ	I
    //   86: invokevirtual 341	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   89: checkcast 210	android/widget/TextView
    //   92: aload_2
    //   93: invokevirtual 288	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   96: aload_3
    //   97: aload_0
    //   98: getfield 417	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGp	Landroid/view/View$OnClickListener;
    //   101: invokevirtual 418	android/widget/LinearLayout:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   104: aload_3
    //   105: aload_2
    //   106: invokevirtual 419	android/widget/LinearLayout:setTag	(Ljava/lang/Object;)V
    //   109: aload_0
    //   110: aload_3
    //   111: invokevirtual 395	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:addView	(Landroid/view/View;)V
    //   114: aload_0
    //   115: getfield 72	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGk	Ljava/util/List;
    //   118: aload_3
    //   119: invokeinterface 392 2 0
    //   124: pop
    //   125: aload_0
    //   126: getfield 421	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGo	Z
    //   129: ifeq +443 -> 572
    //   132: ldc_w 423
    //   135: invokestatic 429	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   138: checkcast 423	com/tencent/mm/plugin/appbrand/k/f
    //   141: invokeinterface 433 1 0
    //   146: astore_3
    //   147: aload_3
    //   148: getfield 438	com/tencent/mm/plugin/appbrand/k/f$b:hip	Ljava/util/List;
    //   151: ifnull +421 -> 572
    //   154: aload_3
    //   155: getfield 438	com/tencent/mm/plugin/appbrand/k/f$b:hip	Ljava/util/List;
    //   158: invokeinterface 441 1 0
    //   163: ifle +409 -> 572
    //   166: aload_0
    //   167: invokevirtual 148	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:getContext	()Landroid/content/Context;
    //   170: getstatic 444	com/tencent/mm/R$i:cVG	I
    //   173: aconst_null
    //   174: invokestatic 337	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   177: checkcast 4	android/widget/LinearLayout
    //   180: astore_2
    //   181: aload_2
    //   182: getstatic 447	com/tencent/mm/R$h:cBJ	I
    //   185: invokevirtual 341	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   188: checkcast 210	android/widget/TextView
    //   191: aload_3
    //   192: getfield 450	com/tencent/mm/plugin/appbrand/k/f$b:fEM	Ljava/lang/String;
    //   195: invokevirtual 288	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   198: iconst_4
    //   199: anewarray 452	android/widget/ImageView
    //   202: astore 4
    //   204: aload 4
    //   206: iconst_0
    //   207: aload_2
    //   208: getstatic 455	com/tencent/mm/R$h:bhY	I
    //   211: invokevirtual 341	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   214: checkcast 452	android/widget/ImageView
    //   217: aastore
    //   218: aload 4
    //   220: iconst_1
    //   221: aload_2
    //   222: getstatic 458	com/tencent/mm/R$h:bhZ	I
    //   225: invokevirtual 341	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   228: checkcast 452	android/widget/ImageView
    //   231: aastore
    //   232: aload 4
    //   234: iconst_2
    //   235: aload_2
    //   236: getstatic 461	com/tencent/mm/R$h:bia	I
    //   239: invokevirtual 341	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   242: checkcast 452	android/widget/ImageView
    //   245: aastore
    //   246: aload 4
    //   248: iconst_3
    //   249: aload_2
    //   250: getstatic 464	com/tencent/mm/R$h:bib	I
    //   253: invokevirtual 341	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   256: checkcast 452	android/widget/ImageView
    //   259: aastore
    //   260: aload_2
    //   261: getstatic 467	com/tencent/mm/R$h:cdC	I
    //   264: invokevirtual 341	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   267: checkcast 452	android/widget/ImageView
    //   270: astore 5
    //   272: iconst_0
    //   273: istore_1
    //   274: iload_1
    //   275: aload_3
    //   276: getfield 438	com/tencent/mm/plugin/appbrand/k/f$b:hip	Ljava/util/List;
    //   279: invokeinterface 441 1 0
    //   284: if_icmpge +116 -> 400
    //   287: iload_1
    //   288: iconst_4
    //   289: if_icmpge +111 -> 400
    //   292: aload_3
    //   293: getfield 438	com/tencent/mm/plugin/appbrand/k/f$b:hip	Ljava/util/List;
    //   296: iload_1
    //   297: invokeinterface 470 2 0
    //   302: checkcast 472	com/tencent/mm/plugin/appbrand/k/f$c
    //   305: astore 6
    //   307: new 474	com/tencent/mm/an/a/a/c$a
    //   310: dup
    //   311: invokespecial 475	com/tencent/mm/an/a/a/c$a:<init>	()V
    //   314: astore 7
    //   316: aload 7
    //   318: getstatic 480	com/tencent/mm/R$k:aYg	I
    //   321: putfield 483	com/tencent/mm/an/a/a/c$a:hDe	I
    //   324: aload 7
    //   326: iconst_1
    //   327: putfield 486	com/tencent/mm/an/a/a/c$a:hDm	Z
    //   330: invokestatic 492	com/tencent/mm/an/n:Ja	()Lcom/tencent/mm/an/a/a;
    //   333: aload 6
    //   335: getfield 495	com/tencent/mm/plugin/appbrand/k/f$c:jpi	Ljava/lang/String;
    //   338: aload 4
    //   340: iload_1
    //   341: aaload
    //   342: aload 7
    //   344: invokevirtual 499	com/tencent/mm/an/a/a/c$a:Jk	()Lcom/tencent/mm/an/a/a/c;
    //   347: invokevirtual 504	com/tencent/mm/an/a/a:a	(Ljava/lang/String;Landroid/widget/ImageView;Lcom/tencent/mm/an/a/a/c;)V
    //   350: aload 4
    //   352: iload_1
    //   353: aaload
    //   354: iconst_0
    //   355: invokevirtual 505	android/widget/ImageView:setVisibility	(I)V
    //   358: aload 4
    //   360: iload_1
    //   361: aaload
    //   362: aload 6
    //   364: invokevirtual 506	android/widget/ImageView:setTag	(Ljava/lang/Object;)V
    //   367: aload_0
    //   368: getfield 508	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGq	Landroid/view/View$OnClickListener;
    //   371: ifnull +14 -> 385
    //   374: aload 4
    //   376: iload_1
    //   377: aaload
    //   378: aload_0
    //   379: getfield 508	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGq	Landroid/view/View$OnClickListener;
    //   382: invokevirtual 509	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   385: iload_1
    //   386: iconst_1
    //   387: iadd
    //   388: istore_1
    //   389: goto -115 -> 274
    //   392: astore_2
    //   393: aload_0
    //   394: invokespecial 257	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:ceF	()V
    //   397: goto -367 -> 30
    //   400: aload_3
    //   401: getfield 438	com/tencent/mm/plugin/appbrand/k/f$b:hip	Ljava/util/List;
    //   404: invokeinterface 441 1 0
    //   409: ifle +26 -> 435
    //   412: aload 5
    //   414: iconst_0
    //   415: invokevirtual 505	android/widget/ImageView:setVisibility	(I)V
    //   418: aload 5
    //   420: ldc_w 511
    //   423: invokevirtual 506	android/widget/ImageView:setTag	(Ljava/lang/Object;)V
    //   426: aload 5
    //   428: aload_0
    //   429: getfield 508	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGq	Landroid/view/View$OnClickListener;
    //   432: invokevirtual 509	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   435: aload_0
    //   436: aload_2
    //   437: invokevirtual 395	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:addView	(Landroid/view/View;)V
    //   440: aload_0
    //   441: getfield 72	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGk	Ljava/util/List;
    //   444: aload_2
    //   445: invokeinterface 392 2 0
    //   450: pop
    //   451: aload_3
    //   452: getfield 438	com/tencent/mm/plugin/appbrand/k/f$b:hip	Ljava/util/List;
    //   455: invokeinterface 120 1 0
    //   460: astore 4
    //   462: ldc 43
    //   464: astore_2
    //   465: aload 4
    //   467: invokeinterface 126 1 0
    //   472: ifeq +47 -> 519
    //   475: aload 4
    //   477: invokeinterface 130 1 0
    //   482: checkcast 472	com/tencent/mm/plugin/appbrand/k/f$c
    //   485: astore 5
    //   487: new 99	java/lang/StringBuilder
    //   490: dup
    //   491: invokespecial 100	java/lang/StringBuilder:<init>	()V
    //   494: aload_2
    //   495: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: aload 5
    //   500: getfield 514	com/tencent/mm/plugin/appbrand/k/f$c:username	Ljava/lang/String;
    //   503: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: ldc_w 516
    //   509: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   515: astore_2
    //   516: goto -51 -> 465
    //   519: getstatic 522	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   522: sipush 14630
    //   525: iconst_5
    //   526: anewarray 323	java/lang/Object
    //   529: dup
    //   530: iconst_0
    //   531: getstatic 527	com/tencent/mm/ay/g:hJR	Ljava/lang/String;
    //   534: aastore
    //   535: dup
    //   536: iconst_1
    //   537: aload_3
    //   538: getfield 450	com/tencent/mm/plugin/appbrand/k/f$b:fEM	Ljava/lang/String;
    //   541: aastore
    //   542: dup
    //   543: iconst_2
    //   544: aload_2
    //   545: aastore
    //   546: dup
    //   547: iconst_3
    //   548: aload_3
    //   549: getfield 530	com/tencent/mm/plugin/appbrand/k/f$b:jph	I
    //   552: invokestatic 231	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   555: aastore
    //   556: dup
    //   557: iconst_4
    //   558: invokestatic 536	java/lang/System:currentTimeMillis	()J
    //   561: ldc2_w 537
    //   564: ldiv
    //   565: invokestatic 543	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   568: aastore
    //   569: invokevirtual 546	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   572: ldc2_w 397
    //   575: ldc_w 399
    //   578: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   581: return
    //   582: astore_2
    //   583: goto -458 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	586	0	this	FTSMainUIEducationLayout
    //   273	116	1	i	int
    //   59	202	2	localObject1	Object
    //   392	53	2	localException1	Exception
    //   464	81	2	str	String
    //   582	1	2	localException2	Exception
    //   81	468	3	localObject2	Object
    //   202	274	4	localObject3	Object
    //   270	229	5	localObject4	Object
    //   305	58	6	localc	com.tencent.mm.plugin.appbrand.k.f.c
    //   314	29	7	locala	com.tencent.mm.an.a.a.c.a
    // Exception table:
    //   from	to	target	type
    //   13	30	392	java/lang/Exception
    //   30	125	582	java/lang/Exception
  }
  
  public final void ceD()
  {
    GMTrace.i(19223468310528L, 143226);
    this.wGn = false;
    GMTrace.o(19223468310528L, 143226);
  }
  
  protected void ceG()
  {
    GMTrace.i(16796006481920L, 125140);
    GMTrace.o(16796006481920L, 125140);
  }
  
  public final void i(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(16796140699648L, 125141);
    this.pnn = paramOnClickListener;
    GMTrace.o(16796140699648L, 125141);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */