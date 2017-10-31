package com.tencent.mm.modelsns;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.bq.a;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.bdh;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.protocal.c.cl;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.ct;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Map;

public final class e
{
  public static bhc LM()
  {
    GMTrace.i(4464350068736L, 33262);
    bhc localbhc = new bhc();
    Object localObject = new nn();
    localbhc.uyt = new cr();
    localbhc.uyu = ((nn)localObject);
    localbhc.uhC = 0;
    localbhc.orU = 0;
    localbhc.nas = "";
    localObject = new akv();
    ((akv)localObject).tDN = 0.0F;
    ((akv)localObject).tDM = 0.0F;
    localbhc.uys = ((akv)localObject);
    localbhc.qAC = "";
    localbhc.uyA = new bpn();
    GMTrace.o(4464350068736L, 33262);
    return localbhc;
  }
  
  public static amn LN()
  {
    GMTrace.i(4464484286464L, 33263);
    amn localamn = new amn();
    localamn.mCK = "";
    localamn.uhC = 0;
    GMTrace.o(4464484286464L, 33263);
    return localamn;
  }
  
  public static Pair<Integer, Integer> a(bhc parambhc, Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(4465155375104L, 33268);
    int j = 0;
    if ((parambhc != null) && (parambhc.uyu != null) && (parambhc.uyu.tKd != null) && (parambhc.uyu.tKd.size() > 0))
    {
      parambhc = (amn)parambhc.uyu.tKd.get(0);
      if ((parambhc != null) && (parambhc.uhD != null) && (parambhc.uhD.uis > 0.0F) && (parambhc.uhD.uit > 0.0F)) {
        j = (int)parambhc.uhD.uis;
      }
    }
    for (int i = (int)parambhc.uhD.uit;; i = 0)
    {
      int m = j;
      if (j <= 0) {
        m = 320;
      }
      if (i <= 0) {}
      for (int n = 240;; n = i)
      {
        if (paramContext == null)
        {
          w.e("MicroMsg.TimeLineHelper", "the context is null");
          parambhc = Pair.create(Integer.valueOf(m), Integer.valueOf(n));
          GMTrace.o(4465155375104L, 33268);
          return parambhc;
        }
        parambhc = paramContext.getResources().getDisplayMetrics();
        if (parambhc != null) {}
        for (i = (int)Math.min(parambhc.widthPixels * 0.63F, parambhc.heightPixels * 0.63F);; i = m)
        {
          i = i >> 5 << 5;
          j = i;
          if (m < n)
          {
            j = i;
            if (paramContext != null) {
              j = Math.min(BackwardSupportUtil.b.a(paramContext, 160.0F), i);
            }
          }
          int i2 = (int)(j * 1.0D * n / m);
          i = i2;
          int k = j;
          int i3;
          int i1;
          if (!paramBoolean)
          {
            i3 = a.fromDPToPix(paramContext, 200);
            i1 = a.fromDPToPix(paramContext, 44);
            if (i2 >= j)
            {
              i = i2;
              if (i2 > i3) {
                i = i3;
              }
              j = (int)(m * 1.0F / n * i);
              k = j;
              if (j >= i1) {
                break label484;
              }
              i = (int)(i1 * 1.0D * n / m);
              j = i1;
            }
          }
          for (;;)
          {
            w.i("MicroMsg.TimeLineHelper", "getTimelineVideoSize: width %d, height %d, expectWidth %d,expectHeight %d, isAd: %s", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
            parambhc = Pair.create(Integer.valueOf(j), Integer.valueOf(i));
            GMTrace.o(4465155375104L, 33268);
            return parambhc;
            k = j;
            if (j > i3) {
              k = i3;
            }
            j = (int)(n * 1.0F / m * k);
            i = j;
            if (j < i1)
            {
              j = (int)(i1 * 1.0D * m / n);
              i = i1;
            }
            else
            {
              label484:
              j = k;
            }
          }
        }
      }
    }
  }
  
  public static amn a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4, String paramString4, amp paramamp)
  {
    GMTrace.i(4464752721920L, 33265);
    amn localamn = new amn();
    localamn.nas = ll(paramString1);
    localamn.jXP = paramInt1;
    localamn.mCK = ll(paramString4);
    localamn.mDo = ll(paramString2);
    localamn.uhz = paramInt2;
    localamn.uhA = ll(paramString3);
    localamn.uhB = paramInt3;
    localamn.uhC = paramInt4;
    localamn.uhD = paramamp;
    if (paramString2 == null) {}
    for (paramString1 = "".getBytes();; paramString1 = paramString2.getBytes())
    {
      localamn.uhO = g.n(paramString1);
      GMTrace.o(4464752721920L, 33265);
      return localamn;
    }
  }
  
  public static amn a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, String paramString4)
  {
    GMTrace.i(4464618504192L, 33264);
    amn localamn = new amn();
    localamn.nas = paramString1;
    localamn.jXP = paramInt1;
    localamn.mDo = paramString2;
    localamn.uhA = paramString3;
    localamn.uhz = paramInt2;
    localamn.uhB = paramInt3;
    localamn.mCK = paramString4;
    paramString1 = new amp();
    paramString1.uit = 0.0F;
    paramString1.uis = 0.0F;
    paramString1.uiu = 0.0F;
    localamn.uhD = paramString1;
    if (paramString2 == null) {}
    for (paramString1 = "".getBytes();; paramString1 = paramString2.getBytes())
    {
      localamn.uhO = g.n(paramString1);
      GMTrace.o(4464618504192L, 33264);
      return localamn;
    }
  }
  
  private static float lk(String paramString)
  {
    GMTrace.i(4464081633280L, 33260);
    if (paramString == null)
    {
      GMTrace.o(4464081633280L, 33260);
      return 0.0F;
    }
    float f = bg.getFloat(paramString, 0.0F);
    GMTrace.o(4464081633280L, 33260);
    return f;
  }
  
  private static String ll(String paramString)
  {
    GMTrace.i(4464215851008L, 33261);
    if (paramString == null)
    {
      GMTrace.o(4464215851008L, 33261);
      return "";
    }
    GMTrace.o(4464215851008L, 33261);
    return paramString;
  }
  
  public static bhc lm(String paramString)
  {
    GMTrace.i(4464886939648L, 33266);
    Map localMap = bh.p(paramString, "TimelineObject");
    bhc localbhc = LM();
    if (localMap != null)
    {
      localbhc.nas = ll((String)localMap.get(".TimelineObject.id"));
      localbhc.jWW = ll((String)localMap.get(".TimelineObject.username"));
      localbhc.uhC = bg.getInt((String)localMap.get(".TimelineObject.private"), 0);
      localbhc.orU = bg.getInt((String)localMap.get(".TimelineObject.createTime"), 0);
      localbhc.uyr = ll((String)localMap.get(".TimelineObject.contentDesc"));
      localbhc.uyw = bg.getInt((String)localMap.get(".TimelineObject.contentDescShowType"), 0);
      localbhc.uyx = bg.getInt((String)localMap.get(".TimelineObject.contentDescScene"), 0);
      localbhc.qBT = ll((String)localMap.get(".TimelineObject.statExtStr"));
      localbhc.uyB = bg.getInt((String)localMap.get(".TimelineObject.sightFolded"), 0);
      paramString = new akv();
      paramString.tDM = lk((String)localMap.get(".TimelineObject.location.$longitude"));
      paramString.tDN = lk((String)localMap.get(".TimelineObject.location.$latitude"));
      paramString.huL = ll((String)localMap.get(".TimelineObject.location.$city"));
      paramString.ufK = bg.getInt((String)localMap.get(".TimelineObject.location.$poiScale"), 0);
      paramString.ufI = ll((String)localMap.get(".TimelineObject.location.$poiClassifyId"));
      paramString.qCx = bg.getInt((String)localMap.get(".TimelineObject.location.$poiClassifyType"), 0);
      paramString.qCv = ll((String)localMap.get(".TimelineObject.location.$poiAddress"));
      paramString.nmP = ll((String)localMap.get(".TimelineObject.location.$poiName"));
      paramString.ufL = bg.getInt((String)localMap.get(".TimelineObject.location.$poiClickableStatus"), 0);
      localbhc.uys = paramString;
      if (localbhc.uyu == null) {
        localbhc.uyu = new nn();
      }
      localbhc.uyu.mCK = ll((String)localMap.get(".TimelineObject.ContentObject.description"));
      localbhc.uyu.tKc = bg.getInt((String)localMap.get(".TimelineObject.ContentObject.contentStyle"), 0);
      localbhc.uyu.tKe = bg.getInt((String)localMap.get(".TimelineObject.ContentObject.contentSubStyle"), 0);
      localbhc.uyu.fuw = ll((String)localMap.get(".TimelineObject.ContentObject.title"));
      localbhc.uyu.mDo = ll((String)localMap.get(".TimelineObject.ContentObject.contentUrl"));
      int i = 0;
      Object localObject5;
      String str23;
      String str22;
      String str21;
      String str20;
      String str17;
      String str18;
      String str16;
      String str15;
      String str19;
      String str12;
      String str11;
      Object localObject4;
      String str14;
      String str13;
      String str10;
      String str9;
      String str8;
      String str7;
      String str6;
      Object localObject6;
      label1292:
      Object localObject7;
      if (i != 0)
      {
        localObject5 = ".TimelineObject.ContentObject.mediaList.media" + i + ".id";
        str23 = ".TimelineObject.ContentObject.mediaList.media" + i + ".type";
        str22 = ".TimelineObject.ContentObject.mediaList.media" + i + ".title";
        str21 = ".TimelineObject.ContentObject.mediaList.media" + i + ".description";
        str20 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url";
        str17 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$videomd5";
        str18 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb";
        str16 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$type";
        str15 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$type";
        str19 = ".TimelineObject.ContentObject.mediaList.media" + i + ".private";
        str12 = ".TimelineObject.ContentObject.mediaList.media" + i + ".subType";
        str11 = ".TimelineObject.ContentObject.mediaList.media" + i + ".userData";
        localObject4 = ".TimelineObject.ContentObject.mediaList.media" + i;
        str14 = ".TimelineObject.ContentObject.mediaList.media" + i + ".lowBandUrl";
        str13 = ".TimelineObject.ContentObject.mediaList.media" + i + ".lowBandUrl.$type";
        str10 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachUrl";
        str9 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachUrl.$md5";
        str8 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$md5";
        str7 = ".TimelineObject.ContentObject.mediaList.media" + i + ".videosize.$attachTotalTime";
        str6 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachThumbUrl";
        str5 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachShareTitle";
        str4 = ".TimelineObject.ContentObject.mediaList.media" + i + ".enc";
        str3 = ".TimelineObject.ContentObject.mediaList.media" + i + ".enc.$key";
        str2 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$token";
        localObject3 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$enc_idx";
        localObject2 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$key";
        str1 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$token";
        localObject1 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$enc_idx";
        paramString = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$key";
        localObject6 = localObject5;
        localObject5 = str23;
        str23 = (String)localObject4 + ".size.$width";
        localObject7 = (String)localObject4 + ".size.$height";
        localObject4 = (String)localObject4 + ".size.$totalSize";
        str23 = (String)localMap.get(str23);
        localObject7 = (String)localMap.get(localObject7);
        String str24 = (String)localMap.get(localObject4);
        localObject4 = new amp();
        ((amp)localObject4).uit = 0.0F;
        ((amp)localObject4).uis = 0.0F;
        ((amp)localObject4).uiu = 0.0F;
        if (str23 != null) {
          ((amp)localObject4).uis = lk(str23);
        }
        if (localObject7 != null) {
          ((amp)localObject4).uit = lk((String)localObject7);
        }
        if (str24 != null) {
          ((amp)localObject4).uiu = lk(str24);
        }
        localObject6 = (String)localMap.get(localObject6);
        localObject5 = (String)localMap.get(localObject5);
        str22 = (String)localMap.get(str22);
        str21 = (String)localMap.get(str21);
        str20 = (String)localMap.get(str20);
        str19 = (String)localMap.get(str19);
        str18 = (String)localMap.get(str18);
        str17 = (String)localMap.get(str17);
        str16 = (String)localMap.get(str16);
        str15 = (String)localMap.get(str15);
        str14 = (String)localMap.get(str14);
        str13 = (String)localMap.get(str13);
        str12 = (String)localMap.get(str12);
        str11 = (String)localMap.get(str11);
        str10 = (String)localMap.get(str10);
        str9 = (String)localMap.get(str9);
        str8 = (String)localMap.get(str8);
        str7 = (String)localMap.get(str7);
        str6 = (String)localMap.get(str6);
        str5 = (String)localMap.get(str5);
        str4 = (String)localMap.get(str4);
        str3 = (String)localMap.get(str3);
        str2 = (String)localMap.get(str2);
        localObject3 = (String)localMap.get(localObject3);
        localObject2 = (String)localMap.get(localObject2);
        str1 = (String)localMap.get(str1);
        localObject1 = (String)localMap.get(localObject1);
        str23 = (String)localMap.get(paramString);
        if ((localObject5 == null) || (localObject6 == null)) {
          break label2370;
        }
        localObject7 = new amn();
        ((amn)localObject7).nas = ll((String)localObject6);
        ((amn)localObject7).jXP = bg.getInt((String)localObject5, 0);
        ((amn)localObject7).fuw = ll(str22);
        ((amn)localObject7).mCK = ll(str21);
        ((amn)localObject7).mDo = ll(str20);
        ((amn)localObject7).uhz = bg.getInt(str16, 0);
        ((amn)localObject7).uhA = ll(str18);
        ((amn)localObject7).uhB = bg.getInt(str15, 0);
        ((amn)localObject7).uhC = bg.getInt(str19, 0);
        ((amn)localObject7).uhD = ((amp)localObject4);
        ((amn)localObject7).uhE = ll(str14);
        ((amn)localObject7).uhF = bg.getInt(str13, 0);
        ((amn)localObject7).qyB = ll(str11);
        ((amn)localObject7).fvu = bg.getInt(str12, 0);
        ((amn)localObject7).uhH = ll(str10);
        ((amn)localObject7).uhJ = ll(str9);
        ((amn)localObject7).uhI = ll(str8);
        ((amn)localObject7).uhV = ll(str17);
        ((amn)localObject7).qTd = bg.getInt(str7, 0);
        ((amn)localObject7).uhK = ll(str6);
        ((amn)localObject7).uhL = ll(str5);
        ((amn)localObject7).uhM = bg.getInt(str4, 0);
        ((amn)localObject7).uhN = bg.getLong(str3, 0L);
        if (((amn)localObject7).mDo != null) {
          break label2358;
        }
      }
      label2358:
      for (paramString = "".getBytes();; paramString = ((amn)localObject7).mDo.getBytes())
      {
        ((amn)localObject7).uhO = g.n(paramString);
        ((amn)localObject7).uhP = str2;
        ((amn)localObject7).uhQ = bg.getInt((String)localObject3, 0);
        ((amn)localObject7).uhR = ((String)localObject2);
        ((amn)localObject7).uhS = str1;
        ((amn)localObject7).uhT = bg.getInt((String)localObject1, 0);
        ((amn)localObject7).uhU = str23;
        localbhc.uyu.tKd.add(localObject7);
        i += 1;
        break;
        str22 = ".TimelineObject.ContentObject.mediaList.media.title";
        str13 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl.$type";
        str21 = ".TimelineObject.ContentObject.mediaList.media.description";
        paramString = ".TimelineObject.ContentObject.mediaList.media.thumb.$key";
        localObject4 = ".TimelineObject.ContentObject.mediaList.media";
        localObject1 = ".TimelineObject.ContentObject.mediaList.media.thumb.$enc_idx";
        str9 = ".TimelineObject.ContentObject.mediaList.media.attachUrl.$md5";
        str12 = ".TimelineObject.ContentObject.mediaList.media.subType";
        str7 = ".TimelineObject.ContentObject.mediaList.media.videosize.$attachTotalTime";
        str14 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl";
        str10 = ".TimelineObject.ContentObject.mediaList.media.attachUrl";
        str11 = ".TimelineObject.ContentObject.mediaList.media.userData";
        str8 = ".TimelineObject.ContentObject.mediaList.media.url.$md5";
        str20 = ".TimelineObject.ContentObject.mediaList.media.url";
        str1 = ".TimelineObject.ContentObject.mediaList.media.thumb.$token";
        localObject6 = ".TimelineObject.ContentObject.mediaList.media.id";
        str2 = ".TimelineObject.ContentObject.mediaList.media.url.$token";
        str19 = ".TimelineObject.ContentObject.mediaList.media.private";
        str6 = ".TimelineObject.ContentObject.mediaList.media.attachThumbUrl";
        str15 = ".TimelineObject.ContentObject.mediaList.media.thumb.$type";
        str5 = ".TimelineObject.ContentObject.mediaList.media.attachShareTitle";
        str16 = ".TimelineObject.ContentObject.mediaList.media.url.$type";
        str4 = ".TimelineObject.ContentObject.mediaList.media.enc";
        str17 = ".TimelineObject.ContentObject.mediaList.media.url.$videomd5";
        localObject2 = ".TimelineObject.ContentObject.mediaList.media.url.$key";
        localObject5 = ".TimelineObject.ContentObject.mediaList.media.type";
        str3 = ".TimelineObject.ContentObject.mediaList.media.enc.$key";
        str18 = ".TimelineObject.ContentObject.mediaList.media.thumb";
        localObject3 = ".TimelineObject.ContentObject.mediaList.media.url.$enc_idx";
        break label1292;
      }
      label2370:
      paramString = new cr();
      Object localObject1 = ll((String)localMap.get(".TimelineObject.appInfo.id"));
      String str1 = ll((String)localMap.get(".TimelineObject.appInfo.version"));
      Object localObject2 = ll((String)localMap.get(".TimelineObject.appInfo.appName"));
      Object localObject3 = ll((String)localMap.get(".TimelineObject.appInfo.installUrl "));
      String str2 = ll((String)localMap.get(".TimelineObject.appInfo.fromUrl "));
      paramString.nas = ((String)localObject1);
      paramString.mFw = ((String)localObject2);
      paramString.tvW = ((String)localObject3);
      paramString.tvX = str2;
      paramString.jXC = str1;
      paramString.tvY = bg.getInt((String)localMap.get(".TimelineObject.appInfo.clickable"), 0);
      localbhc.uyt = paramString;
      paramString = new bpn();
      localObject1 = ll((String)localMap.get(".TimelineObject.weappInfo.appUserName"));
      str1 = ll((String)localMap.get(".TimelineObject.weappInfo.pagePath"));
      paramString.username = ((String)localObject1);
      paramString.path = str1;
      localbhc.uyA = paramString;
      paramString = new bft();
      localObject1 = ll((String)localMap.get(".TimelineObject.streamvideo.streamvideotitle"));
      str1 = ll((String)localMap.get(".TimelineObject.streamvideo.streamvideototaltime"));
      localObject2 = ll((String)localMap.get(".TimelineObject.streamvideo.streamvideourl"));
      localObject3 = ll((String)localMap.get(".TimelineObject.streamvideo.streamvideoweburl"));
      str2 = ll((String)localMap.get(".TimelineObject.streamvideo.streamvideowording"));
      String str3 = ll((String)localMap.get(".TimelineObject.streamvideo.streamvideothumburl"));
      String str4 = ll((String)localMap.get(".TimelineObject.streamvideo.streamvideoaduxinfo"));
      String str5 = ll((String)localMap.get(".TimelineObject.streamvideo.streamvideopublishid"));
      paramString.hde = ((String)localObject1);
      paramString.hdd = bg.RF(str1);
      paramString.hdc = ((String)localObject2);
      paramString.hdg = ((String)localObject3);
      paramString.hdf = str2;
      paramString.hdh = str3;
      paramString.hdi = str4;
      paramString.hdj = str5;
      localbhc.uyz = paramString;
      paramString = new bdh();
      localObject1 = ll((String)localMap.get(".TimelineObject.redEnvelopesInfo.sendId"));
      str1 = ll((String)localMap.get(".TimelineObject.redEnvelopesInfo.ticket"));
      paramString.nsQ = ((String)localObject1);
      paramString.fxT = str1;
      paramString = new as();
      i = bg.getInt((String)localMap.get(".TimelineObject.actionInfo.scene"), 0);
      localObject1 = ll((String)localMap.get(".TimelineObject.actionInfo.appid"));
      int j = bg.getInt((String)localMap.get(".TimelineObject.actionInfo.type"), 0);
      str1 = ll((String)localMap.get(".TimelineObject.actionInfo.url"));
      localObject2 = ll((String)localMap.get(".TimelineObject.actionInfo.mediaTagName"));
      localObject3 = ll((String)localMap.get(".TimelineObject.actionInfo.wordingKey"));
      paramString.ttZ = ((String)localObject1);
      paramString.ttY = i;
      paramString.jXP = j;
      paramString.mDo = str1;
      paramString.tua = ((String)localObject2);
      paramString.tub = ((String)localObject3);
      localObject1 = new aq();
      str1 = ll((String)localMap.get(".TimelineObject.actionInfo.appMsg.appid"));
      localObject2 = ll((String)localMap.get(".TimelineObject.actionInfo.appMsg.mediaTagName"));
      localObject3 = ll((String)localMap.get(".TimelineObject.actionInfo.appMsg.messageExt"));
      str2 = ll((String)localMap.get(".TimelineObject.actionInfo.appMsg.messageAction"));
      ((aq)localObject1).mDD = str1;
      ((aq)localObject1).ttV = ((String)localObject2);
      ((aq)localObject1).ttW = ((String)localObject3);
      ((aq)localObject1).ttX = str2;
      paramString.tuc = ((aq)localObject1);
      i = bg.getInt((String)localMap.get(".TimelineObject.actionInfo.appActionScene.installedActionScene"), 0);
      j = bg.getInt((String)localMap.get(".TimelineObject.actionInfo.appActionScene.uninstalledActionScene"), 0);
      localObject1 = ll((String)localMap.get(".TimelineObject.actionInfo.appJumpWordingKey.installedWordingKey"));
      str1 = ll((String)localMap.get(".TimelineObject.actionInfo.appJumpWordingKey.uninstalledWordingKey"));
      paramString.tud = ll((String)localMap.get(".TimelineObject.actionInfo.newWordingKey"));
      localObject2 = new cl();
      ((cl)localObject2).tvP = i;
      ((cl)localObject2).tvQ = j;
      localObject3 = new ct();
      ((ct)localObject3).twc = ((String)localObject1);
      ((ct)localObject3).twd = str1;
      paramString.tue = ((cl)localObject2);
      paramString.tuf = ((ct)localObject3);
      paramString.tug = ln((String)localMap.get(".TimelineObject.actionInfo.installedWording"));
      paramString.tuh = ln((String)localMap.get(".TimelineObject.actionInfo.uninstalledWording"));
      localbhc.qfM = paramString;
      localbhc.tbH = ll((String)localMap.get(".TimelineObject.sourceUserName"));
      localbhc.tbI = ll((String)localMap.get(".TimelineObject.sourceNickName"));
      localbhc.uyv = ll((String)localMap.get(".TimelineObject.publicUserName"));
      localbhc.uyy = ll((String)localMap.get(".TimelineObject.statisticsData"));
      localbhc.qAC = ll((String)localMap.get(".TimelineObject.canvasInfoXml"));
      localbhc.haU = bg.getInt((String)localMap.get(".TimelineObject.contentattr"), 0);
    }
    GMTrace.o(4464886939648L, 33266);
    return localbhc;
  }
  
  private static cs ln(String paramString)
  {
    GMTrace.i(4465021157376L, 33267);
    if (bg.mZ(paramString))
    {
      GMTrace.o(4465021157376L, 33267);
      return null;
    }
    Object localObject = new StringBuilder(paramString.length());
    int i = 0;
    int j = paramString.length();
    while (i < j)
    {
      char c = paramString.charAt(i);
      if (c != '&')
      {
        ((StringBuilder)localObject).append(c);
        i += 1;
      }
      else if (paramString.startsWith("&amp;", i))
      {
        ((StringBuilder)localObject).append('&');
        i += 5;
      }
      else if (paramString.startsWith("&apos;", i))
      {
        ((StringBuilder)localObject).append('\'');
        i += 6;
      }
      else if (paramString.startsWith("&quot;", i))
      {
        ((StringBuilder)localObject).append('"');
        i += 6;
      }
      else if (paramString.startsWith("&lt;", i))
      {
        ((StringBuilder)localObject).append('<');
        i += 4;
      }
      else if (paramString.startsWith("&gt;", i))
      {
        ((StringBuilder)localObject).append('>');
        i += 4;
      }
    }
    paramString = ((StringBuilder)localObject).toString();
    paramString = bh.p("<root>" + paramString + "</root>", "root");
    localObject = new cs();
    ((cs)localObject).tvZ = ll((String)paramString.get(".root.en"));
    ((cs)localObject).twa = ll((String)paramString.get(".root.zh-CN"));
    ((cs)localObject).twb = ll((String)paramString.get(".root.zh-TW"));
    GMTrace.o(4465021157376L, 33267);
    return (cs)localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/modelsns/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */