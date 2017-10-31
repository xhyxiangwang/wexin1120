package com.tencent.mm.plugin.card.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.bbz;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.js;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.n;
import com.tencent.mm.x.o;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l
{
  private static SimpleDateFormat kAO;
  private static SimpleDateFormat kAP;
  private static SimpleDateFormat kAQ;
  
  static
  {
    GMTrace.i(5044036435968L, 37581);
    kAO = null;
    kAP = null;
    kAQ = null;
    GMTrace.o(5044036435968L, 37581);
  }
  
  public static boolean Ip()
  {
    GMTrace.i(5041352081408L, 37561);
    try
    {
      boolean bool = ((LocationManager)ab.getContext().getSystemService("location")).isProviderEnabled("gps");
      GMTrace.o(5041352081408L, 37561);
      return bool;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.CardUtil", localException, "", new Object[0]);
      GMTrace.o(5041352081408L, 37561);
    }
    return false;
  }
  
  public static boolean Iq()
  {
    GMTrace.i(5041486299136L, 37562);
    try
    {
      boolean bool = ((LocationManager)ab.getContext().getSystemService("location")).isProviderEnabled("network");
      GMTrace.o(5041486299136L, 37562);
      return bool;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.CardUtil", localException, "", new Object[0]);
      GMTrace.o(5041486299136L, 37562);
    }
    return false;
  }
  
  public static ColorStateList R(Context paramContext, String paramString)
  {
    GMTrace.i(5043902218240L, 37580);
    int i = paramContext.getResources().getColor(R.e.white);
    int j = uk(paramString);
    paramContext = new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j });
    GMTrace.o(5043902218240L, 37580);
    return paramContext;
  }
  
  public static bbz a(int paramInt, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    GMTrace.i(5042694258688L, 37571);
    w.i("MicroMsg.CardUtil", "getShareTag()");
    bbz localbbz = new bbz();
    String str;
    if (paramInt == 2)
    {
      if ((paramArrayList1 != null) && (paramArrayList1.size() > 0)) {
        localbbz.uud.addAll(paramArrayList1);
      }
      if ((paramArrayList2 != null) && (paramArrayList2.size() > 0))
      {
        paramArrayList1 = new ArrayList();
        paramInt = 0;
        while (paramInt < paramArrayList2.size())
        {
          str = (String)paramArrayList2.get(paramInt);
          if ((!TextUtils.isEmpty(str)) && (ul(str))) {
            paramArrayList1.add(Integer.valueOf(str));
          }
          paramInt += 1;
        }
        localbbz.uuf.addAll(paramArrayList1);
      }
    }
    for (;;)
    {
      GMTrace.o(5042694258688L, 37571);
      return localbbz;
      if (paramInt == 3)
      {
        if ((paramArrayList1 != null) && (paramArrayList1.size() > 0)) {
          localbbz.uue.addAll(paramArrayList1);
        }
        if ((paramArrayList2 != null) && (paramArrayList2.size() > 0))
        {
          paramArrayList1 = new ArrayList();
          paramInt = 0;
          while (paramInt < paramArrayList2.size())
          {
            str = (String)paramArrayList2.get(paramInt);
            if ((!TextUtils.isEmpty(str)) && (ul(str))) {
              paramArrayList1.add(Integer.valueOf(str));
            }
            paramInt += 1;
          }
          localbbz.uug.addAll(paramArrayList1);
        }
      }
    }
  }
  
  public static void a(com.tencent.mm.plugin.card.base.b paramb, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(5039875686400L, 37550);
    Object localObject = j.a(new com.tencent.mm.plugin.card.model.m(paramb.aiK().knr));
    if (localObject != null) {}
    for (localObject = d.P((Bitmap)localObject);; localObject = null)
    {
      if (paramb == null)
      {
        paramString2 = null;
        com.tencent.mm.pluginsdk.model.app.l.a(paramString2, paramb.aiK().fKY, paramb.aiK().koD, paramString1, null, (byte[])localObject);
        GMTrace.o(5039875686400L, 37550);
        return;
      }
      if (paramInt == 23) {
        paramInt = 2;
      }
      for (int i = 1;; i = 0)
      {
        StringBuilder localStringBuilder1 = new StringBuilder();
        f.a locala = new f.a();
        if (paramb.aiK() != null)
        {
          locala.title = paramb.aiM().uuc;
          locala.description = paramb.aiK().title;
          locala.type = 16;
          locala.showType = 0;
          locala.haS = 3;
          locala.appId = paramb.aiK().fKY;
          locala.hbi = 0;
          locala.thumburl = paramb.aiK().knr;
          locala.hbZ = paramInt;
          locala.hbY = paramb.aiK().koD;
          locala.url = paramb.aiK().tFc;
        }
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("<from_username>").append(paramb.aiQ()).append("</from_username>");
        if (lL(paramInt))
        {
          localStringBuilder2.append("<card_id>").append(paramb.aiP()).append("</card_id>");
          label300:
          localStringBuilder2.append("<card_type>").append(paramb.aiK().knq).append("</card_type>");
          localStringBuilder2.append("<from_scene>").append(paramInt).append("</from_scene>");
          localStringBuilder2.append("<color>").append(paramb.aiK().hbA).append("</color>");
          localStringBuilder2.append("<card_type_name>").append(paramb.aiK().koC).append("</card_type_name>");
          localStringBuilder2.append("<brand_name>").append(paramb.aiK().koD).append("</brand_name>");
          if (!TextUtils.isEmpty(paramString2)) {
            break label555;
          }
          localStringBuilder2.append("<card_ext></card_ext>");
        }
        for (;;)
        {
          localStringBuilder2.append("<is_recommend>").append(i).append("</is_recommend>");
          localStringBuilder2.append("<recommend_card_id>").append(paramb.aiO()).append("</recommend_card_id>");
          locala.hbX = localStringBuilder2.toString();
          locala.fEk = f.a.a(locala, null, null);
          paramString2 = locala;
          break;
          if (paramInt != 5) {
            break label300;
          }
          localStringBuilder2.append("<card_id>").append(paramb.aiO()).append("</card_id>");
          break label300;
          label555:
          localStringBuilder2.append("<card_ext>").append(paramString2).append("</card_ext>");
        }
      }
    }
  }
  
  public static boolean a(com.tencent.mm.plugin.card.model.b paramb, String paramString)
  {
    GMTrace.i(5042962694144L, 37573);
    if (!aW(paramb.tFX))
    {
      w.i("MicroMsg.CardUtil", "ShowWarning not support show the warning!");
      GMTrace.o(5042962694144L, 37573);
      return false;
    }
    paramb = paramb.title;
    if (up(paramString))
    {
      w.i("MicroMsg.CardUtil", "ShowWarning has show the warning!");
      GMTrace.o(5042962694144L, 37573);
      return false;
    }
    w.i("MicroMsg.CardUtil", "ShowWarning has not show the warning!");
    GMTrace.o(5042962694144L, 37573);
    return true;
  }
  
  public static boolean a(ShareCardInfo paramShareCardInfo)
  {
    GMTrace.i(5041620516864L, 37563);
    if (paramShareCardInfo == null)
    {
      w.e("MicroMsg.CardUtil", "processShareCardObject fail, card is null");
      GMTrace.o(5041620516864L, 37563);
      return false;
    }
    ShareCardInfo localShareCardInfo = al.ajK().tR(paramShareCardInfo.field_card_id);
    if (localShareCardInfo == null)
    {
      bool = al.ajK().b(paramShareCardInfo);
      w.d("MicroMsg.CardUtil", "processShareCardObject, insertRet = %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        w.e("MicroMsg.CardUtil", "processShareCardObject, insert fail");
      }
      for (;;)
      {
        GMTrace.o(5041620516864L, 37563);
        return bool;
        com.tencent.mm.plugin.card.sharecard.a.b.bx(paramShareCardInfo.field_card_id, paramShareCardInfo.field_card_tp_id);
      }
    }
    paramShareCardInfo.field_categoryType = localShareCardInfo.field_categoryType;
    paramShareCardInfo.field_itemIndex = localShareCardInfo.field_itemIndex;
    boolean bool = al.ajK().c(paramShareCardInfo, new String[0]);
    w.d("MicroMsg.CardUtil", "processShareCardObject, updateRet = %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(5041620516864L, 37563);
    return bool;
  }
  
  public static boolean a(nc paramnc, String paramString)
  {
    GMTrace.i(5042828476416L, 37572);
    if (!aW(paramnc.tFX))
    {
      w.i("MicroMsg.CardUtil", "ShowWarning not support show the warning!");
      GMTrace.o(5042828476416L, 37572);
      return false;
    }
    paramnc = paramnc.title;
    if (up(paramString))
    {
      w.i("MicroMsg.CardUtil", "ShowWarning has show the warning!");
      GMTrace.o(5042828476416L, 37572);
      return false;
    }
    w.i("MicroMsg.CardUtil", "ShowWarning has not show the warning!");
    GMTrace.o(5042828476416L, 37572);
    return true;
  }
  
  public static int aM(String paramString, int paramInt)
  {
    GMTrace.i(5038533509120L, 37540);
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      w.e("MicroMsg.CardUtil", "string format error");
      GMTrace.o(5038533509120L, 37540);
      return i;
    }
    try
    {
      paramString = paramString.substring(1).toUpperCase();
      paramInt = Color.argb(paramInt, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
      GMTrace.o(5038533509120L, 37540);
      return paramInt;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.CardUtil", paramString.toString());
      GMTrace.o(5038533509120L, 37540);
    }
    return i;
  }
  
  private static boolean aW(long paramLong)
  {
    GMTrace.i(5043096911872L, 37574);
    if ((0x8 & paramLong) > 0L)
    {
      w.i("MicroMsg.CardUtil", "shouldShowWarning show the warning!");
      GMTrace.o(5043096911872L, 37574);
      return true;
    }
    GMTrace.o(5043096911872L, 37574);
    return false;
  }
  
  public static List<com.tencent.mm.plugin.card.model.b> aa(List<js> paramList)
  {
    GMTrace.i(5039070380032L, 37544);
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(5039070380032L, 37544);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramList.size())
    {
      js localjs = (js)paramList.get(i);
      com.tencent.mm.plugin.card.model.b localb = new com.tencent.mm.plugin.card.model.b();
      localb.title = localjs.title;
      localb.kns = localjs.kns;
      localb.kqV = localjs.kqV;
      localb.url = localjs.url;
      localb.tFX = localjs.tFX;
      localb.knE = false;
      localb.tFY = localjs.tFY;
      localb.tFZ = localjs.tFZ;
      localb.oqo = localjs.oqo;
      localb.tEL = localjs.tEL;
      localb.tEM = localjs.tEM;
      localb.knD = 1;
      localArrayList.add(localb);
      i += 1;
    }
    GMTrace.o(5039070380032L, 37544);
    return localArrayList;
  }
  
  public static ArrayList<String> ab(List<String> paramList)
  {
    GMTrace.i(5042291605504L, 37568);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.e("MicroMsg.CardUtil", "getContactNamesFromLabels labels is empty!");
      GMTrace.o(5042291605504L, 37568);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (String)paramList.next();
      localObject = com.tencent.mm.plugin.label.a.a.aIM().At(com.tencent.mm.plugin.label.a.a.aIM().Aq((String)localObject));
      if ((localObject == null) || (((List)localObject).size() == 0)) {
        w.e("MicroMsg.CardUtil", "getContactNamesFromLabels, namelist get bu label is null");
      } else {
        localHashSet.addAll((Collection)localObject);
      }
    }
    localArrayList.addAll(localHashSet);
    GMTrace.o(5042291605504L, 37568);
    return localArrayList;
  }
  
  public static ArrayList<String> ac(List<String> paramList)
  {
    GMTrace.i(5042425823232L, 37569);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.e("MicroMsg.CardUtil", "getContactIdsFromLabels labels is empty!");
      GMTrace.o(5042425823232L, 37569);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      str = com.tencent.mm.plugin.label.a.a.aIM().Aq(str);
      if (!TextUtils.isEmpty(str)) {
        localArrayList.add(str);
      }
    }
    GMTrace.o(5042425823232L, 37569);
    return localArrayList;
  }
  
  public static void amj()
  {
    GMTrace.i(5040680992768L, 37556);
    ap.AS();
    Integer localInteger = (Integer)com.tencent.mm.x.c.xi().get(282883, null);
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      w.i("MicroMsg.CardUtil", "card entrance is open");
      GMTrace.o(5040680992768L, 37556);
      return;
    }
    w.i("MicroMsg.CardUtil", "open card entrance");
    ap.AS();
    com.tencent.mm.x.c.xi().set(282883, Integer.valueOf(1));
    com.tencent.mm.s.c.vP().k(262152, true);
    GMTrace.o(5040680992768L, 37556);
  }
  
  public static boolean amk()
  {
    GMTrace.i(5040815210496L, 37557);
    ap.AS();
    Integer localInteger = (Integer)com.tencent.mm.x.c.xi().get(282883, null);
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      GMTrace.o(5040815210496L, 37557);
      return true;
    }
    GMTrace.o(5040815210496L, 37557);
    return false;
  }
  
  public static void aml()
  {
    GMTrace.i(5040949428224L, 37558);
    ap.AS();
    Integer localInteger = (Integer)com.tencent.mm.x.c.xi().get(w.a.uVy, Integer.valueOf(0));
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      w.i("MicroMsg.CardUtil", "share card entrance is open");
      GMTrace.o(5040949428224L, 37558);
      return;
    }
    w.i("MicroMsg.CardUtil", "open share card entrance");
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uVy, Integer.valueOf(1));
    com.tencent.mm.s.c.vP().k(262152, true);
    GMTrace.o(5040949428224L, 37558);
  }
  
  public static boolean amm()
  {
    GMTrace.i(5041083645952L, 37559);
    ap.AS();
    Integer localInteger = (Integer)com.tencent.mm.x.c.xi().get(w.a.uVy, null);
    if ((localInteger != null) && (localInteger.intValue() == 1))
    {
      GMTrace.o(5041083645952L, 37559);
      return true;
    }
    GMTrace.o(5041083645952L, 37559);
    return false;
  }
  
  public static String amn()
  {
    GMTrace.i(5042023170048L, 37566);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uVw, "");
    GMTrace.o(5042023170048L, 37566);
    return str;
  }
  
  public static String av(long paramLong)
  {
    GMTrace.i(5039204597760L, 37545);
    paramLong = 1000L * paramLong;
    new GregorianCalendar().setTimeInMillis(paramLong);
    if (kAO == null) {
      kAO = new SimpleDateFormat("yyyy.MM.dd");
    }
    String str = kAO.format(new Date(paramLong));
    GMTrace.o(5039204597760L, 37545);
    return str;
  }
  
  public static boolean b(CardInfo paramCardInfo)
  {
    GMTrace.i(5039741468672L, 37549);
    if (paramCardInfo == null)
    {
      w.e("MicroMsg.CardUtil", "processCardObject fail, card is null");
      GMTrace.o(5039741468672L, 37549);
      return false;
    }
    CardInfo localCardInfo = al.ajC().tB(paramCardInfo.field_card_id);
    if (localCardInfo == null)
    {
      bool = al.ajC().b(paramCardInfo);
      w.d("MicroMsg.CardUtil", "processCardObject, insertRet = %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        w.e("MicroMsg.CardUtil", "processCardObject, insert fail");
      }
      GMTrace.o(5039741468672L, 37549);
      return bool;
    }
    paramCardInfo.field_stickyIndex = localCardInfo.field_stickyIndex;
    paramCardInfo.field_stickyEndTime = localCardInfo.field_stickyEndTime;
    paramCardInfo.field_stickyAnnouncement = localCardInfo.field_stickyAnnouncement;
    boolean bool = al.ajC().c(paramCardInfo, new String[0]);
    w.d("MicroMsg.CardUtil", "processCardObject, updateRet = %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(5039741468672L, 37549);
    return bool;
  }
  
  public static void bF(String paramString1, String paramString2)
  {
    GMTrace.i(5040009904128L, 37551);
    if (!bg.mZ(paramString1))
    {
      ob localob = new ob();
      localob.fMk.fMl = paramString2;
      localob.fMk.content = paramString1;
      localob.fMk.type = o.fY(paramString2);
      localob.fMk.flags = 0;
      com.tencent.mm.sdk.b.a.uLm.m(localob);
    }
    GMTrace.o(5040009904128L, 37551);
  }
  
  public static ShapeDrawable bM(int paramInt1, int paramInt2)
  {
    GMTrace.i(5038801944576L, 37542);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2 }, null, null));
    localShapeDrawable.getPaint().setColor(paramInt1);
    GMTrace.o(5038801944576L, 37542);
    return localShapeDrawable;
  }
  
  public static ShapeDrawable d(Context paramContext, int paramInt1, int paramInt2)
  {
    GMTrace.i(5038936162304L, 37543);
    int i = paramContext.getResources().getDimensionPixelSize(R.f.aSi);
    paramContext = new float[8];
    paramContext[0] = paramInt2;
    paramContext[1] = paramInt2;
    paramContext[2] = paramInt2;
    paramContext[3] = paramInt2;
    paramContext[4] = paramInt2;
    paramContext[5] = paramInt2;
    paramContext[6] = paramInt2;
    paramContext[7] = paramInt2;
    paramContext = new ShapeDrawable(new RoundRectShape(paramContext, new RectF(i, i, i, i), paramContext));
    Paint localPaint = paramContext.getPaint();
    localPaint.setColor(paramInt1);
    localPaint.setStrokeWidth(i);
    GMTrace.o(5038936162304L, 37543);
    return paramContext;
  }
  
  public static String d(Context paramContext, float paramFloat)
  {
    GMTrace.i(5041217863680L, 37560);
    if (paramFloat <= 0.0F)
    {
      GMTrace.o(5041217863680L, 37560);
      return "";
    }
    if ((paramFloat > 0.0F) && (paramFloat < 1000.0F))
    {
      paramContext = paramContext.getString(R.l.dFg, new Object[] { (int)paramFloat });
      GMTrace.o(5041217863680L, 37560);
      return paramContext;
    }
    if (paramFloat >= 1000.0F)
    {
      int i = R.l.dFf;
      StringBuilder localStringBuilder = new StringBuilder();
      paramFloat /= 1000.0F;
      paramContext = paramContext.getString(i, new Object[] { new DecimalFormat("0.00").format(paramFloat) });
      GMTrace.o(5041217863680L, 37560);
      return paramContext;
    }
    GMTrace.o(5041217863680L, 37560);
    return "";
  }
  
  public static Drawable e(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(5043768000512L, 37579);
    paramContext = d(paramContext, uk(paramString), paramInt);
    paramString = bM(uk(paramString), paramInt);
    StateListDrawable localStateListDrawable = new StateListDrawable();
    localStateListDrawable.addState(new int[] { 16842919 }, paramString);
    localStateListDrawable.addState(new int[0], paramContext);
    GMTrace.o(5043768000512L, 37579);
    return localStateListDrawable;
  }
  
  public static boolean isNetworkAvailable(Context paramContext)
  {
    GMTrace.i(18905640730624L, 140858);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext != null)
    {
      paramContext = paramContext.getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnected()) && (paramContext.getState() == NetworkInfo.State.CONNECTED))
      {
        GMTrace.o(18905640730624L, 140858);
        return true;
      }
    }
    GMTrace.o(18905640730624L, 140858);
    return false;
  }
  
  public static boolean j(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5041754734592L, 37564);
    boolean bool2;
    boolean bool1;
    if ((paramb instanceof CardInfo))
    {
      bool2 = al.ajC().c((CardInfo)paramb, new String[0]);
      bool1 = bool2;
      if (!bool2)
      {
        w.e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", new Object[] { paramb.aiO() });
        bool1 = bool2;
      }
    }
    for (;;)
    {
      GMTrace.o(5041754734592L, 37564);
      return bool1;
      if ((paramb instanceof ShareCardInfo))
      {
        bool2 = al.ajK().c((ShareCardInfo)paramb, new String[0]);
        bool1 = bool2;
        if (!bool2)
        {
          w.e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", new Object[] { paramb.aiO() });
          bool1 = bool2;
        }
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public static boolean lL(int paramInt)
  {
    GMTrace.i(5040144121856L, 37552);
    if ((paramInt == 0) || (paramInt == 1) || (paramInt == 2) || (paramInt == 9) || (paramInt == 12) || (paramInt == 17) || (paramInt == 21))
    {
      GMTrace.o(5040144121856L, 37552);
      return true;
    }
    GMTrace.o(5040144121856L, 37552);
    return false;
  }
  
  public static boolean lM(int paramInt)
  {
    GMTrace.i(5040278339584L, 37553);
    if ((paramInt == 7) || (paramInt == 8) || (paramInt == 16) || (paramInt == 26))
    {
      GMTrace.o(5040278339584L, 37553);
      return true;
    }
    GMTrace.o(5040278339584L, 37553);
    return false;
  }
  
  public static boolean lN(int paramInt)
  {
    GMTrace.i(5040412557312L, 37554);
    if ((paramInt == 3) || (paramInt == 4) || (paramInt == 5) || (paramInt == 15))
    {
      GMTrace.o(5040412557312L, 37554);
      return true;
    }
    GMTrace.o(5040412557312L, 37554);
    return false;
  }
  
  public static boolean lu(int paramInt)
  {
    GMTrace.i(5040546775040L, 37555);
    switch (paramInt)
    {
    default: 
      GMTrace.o(5040546775040L, 37555);
      return false;
    }
    GMTrace.o(5040546775040L, 37555);
    return true;
  }
  
  public static String r(String paramString, long paramLong)
  {
    GMTrace.i(5043499565056L, 37577);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5043499565056L, 37577);
      return "";
    }
    float f1 = al.ajI().gBT;
    float f2 = al.ajI().gBS;
    if ((f1 == -1000.0F) || (f2 == -85.0F))
    {
      w.e("MicroMsg.CardUtil", "getRedirectUrl() location info is empty!");
      GMTrace.o(5043499565056L, 37577);
      return paramString;
    }
    if ((0x10 & paramLong) > 0L)
    {
      String str = "&longitude=" + f1 + "&latitude=" + f2;
      str = paramString.replace("#", str + "#");
      w.i("MicroMsg.CardUtil", "getRedirectUrl originalUrl:" + paramString);
      w.i("MicroMsg.CardUtil", "getRedirectUrl afterwardsUrl:" + str);
      GMTrace.o(5043499565056L, 37577);
      return str;
    }
    GMTrace.o(5043499565056L, 37577);
    return paramString;
  }
  
  public static Bitmap t(Bitmap paramBitmap)
  {
    boolean bool = true;
    GMTrace.i(5039473033216L, 37547);
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    ((Matrix)localObject).setRotate(90.0F, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    localObject = new StringBuilder("resultBmp is null: ");
    if (paramBitmap == null) {}
    for (;;)
    {
      w.d("MicroMsg.CardUtil", bool + "  degree:90.0");
      GMTrace.o(5039473033216L, 37547);
      return paramBitmap;
      bool = false;
    }
  }
  
  public static void u(Bitmap paramBitmap)
  {
    GMTrace.i(5039607250944L, 37548);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      w.i("MicroMsg.CardUtil", "bitmap recycle %s", new Object[] { paramBitmap });
      paramBitmap.recycle();
    }
    GMTrace.o(5039607250944L, 37548);
  }
  
  public static int uk(String paramString)
  {
    GMTrace.i(5038399291392L, 37539);
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      w.e("MicroMsg.CardUtil", "string format error");
      GMTrace.o(5038399291392L, 37539);
      return i;
    }
    try
    {
      paramString = paramString.substring(1).toUpperCase();
      int j = Color.argb(255, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
      GMTrace.o(5038399291392L, 37539);
      return j;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.CardUtil", paramString.toString());
      GMTrace.o(5038399291392L, 37539);
    }
    return i;
  }
  
  public static boolean ul(String paramString)
  {
    GMTrace.i(5039338815488L, 37546);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    GMTrace.o(5039338815488L, 37546);
    return bool;
  }
  
  public static void um(String paramString)
  {
    GMTrace.i(5041888952320L, 37565);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uVw, paramString);
    GMTrace.o(5041888952320L, 37565);
  }
  
  public static String un(String paramString)
  {
    GMTrace.i(5042157387776L, 37567);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(5042157387776L, 37567);
      return "";
    }
    String str1 = n.fd(paramString);
    String str2 = n.fc(paramString);
    if (!TextUtils.isEmpty(str1))
    {
      GMTrace.o(5042157387776L, 37567);
      return str1;
    }
    if (!TextUtils.isEmpty(str2))
    {
      GMTrace.o(5042157387776L, 37567);
      return str2;
    }
    GMTrace.o(5042157387776L, 37567);
    return paramString;
  }
  
  public static String uo(String paramString)
  {
    GMTrace.i(5042560040960L, 37570);
    paramString = Arrays.asList(paramString.split(","));
    LinkedList localLinkedList = new LinkedList();
    if (ap.AV()) {
      if ((paramString != null) && (paramString.size() != 0)) {}
    }
    for (;;)
    {
      paramString = bg.c(localLinkedList, ",");
      GMTrace.o(5042560040960L, 37570);
      return paramString;
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ap.AS();
        x localx = com.tencent.mm.x.c.yL().SL(str);
        paramString = str;
        if (localx != null)
        {
          paramString = str;
          if ((int)localx.gLS != 0) {
            paramString = localx.vq();
          }
        }
        localLinkedList.add(paramString);
      }
    }
  }
  
  private static boolean up(String paramString)
  {
    GMTrace.i(5043231129600L, 37575);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardUtil", "hasShowTheWarning card_id or title is empty!");
      GMTrace.o(5043231129600L, 37575);
      return true;
    }
    w.i("MicroMsg.CardUtil", "hasShowWarning()");
    ap.AS();
    Object localObject = (String)com.tencent.mm.x.c.xi().get(w.a.uVD, "");
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      w.e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
      GMTrace.o(5043231129600L, 37575);
      return false;
    }
    localObject = ((String)localObject).split(",");
    if ((localObject == null) || (localObject.length == 0))
    {
      w.e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
      GMTrace.o(5043231129600L, 37575);
      return false;
    }
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      if (paramString.equals(localObject[i]))
      {
        GMTrace.o(5043231129600L, 37575);
        return true;
      }
      i += 1;
    }
    GMTrace.o(5043231129600L, 37575);
    return false;
  }
  
  public static void uq(String paramString)
  {
    int j = 0;
    GMTrace.i(5043365347328L, 37576);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardUtil", "setShowWarningFlag card_id or title is empty!");
      GMTrace.o(5043365347328L, 37576);
      return;
    }
    w.i("MicroMsg.CardUtil", "setShowWarningFlag()");
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(w.a.uVD, "");
    if (TextUtils.isEmpty(str)) {
      w.e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
    }
    for (;;)
    {
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.uVD, paramString);
      GMTrace.o(5043365347328L, 37576);
      return;
      String[] arrayOfString = str.split(",");
      if ((arrayOfString == null) || (arrayOfString.length == 0))
      {
        w.e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
        str = paramString;
      }
      int k = arrayOfString.length;
      int i = 0;
      while (i < k)
      {
        if (paramString.equals(arrayOfString[i])) {
          j = 1;
        }
        i += 1;
      }
      if (j == 0) {
        paramString = str + "," + paramString;
      } else {
        paramString = str;
      }
    }
  }
  
  public static int ur(String paramString)
  {
    GMTrace.i(5043633782784L, 37578);
    if ((!TextUtils.isEmpty(paramString)) && (!paramString.equals(com.tencent.mm.x.m.zF())))
    {
      GMTrace.o(5043633782784L, 37578);
      return 1;
    }
    GMTrace.o(5043633782784L, 37578);
    return 0;
  }
  
  public static ShapeDrawable v(Context paramContext, int paramInt)
  {
    GMTrace.i(5038667726848L, 37541);
    paramContext = bM(paramInt, paramContext.getResources().getDimensionPixelOffset(R.f.aSJ));
    GMTrace.o(5038667726848L, 37541);
    return paramContext;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */