package com.tencent.mm.plugin.sns.g;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.bfg;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class j
{
  public static String jPN;
  public static String jPO;
  public static String jPP;
  
  static
  {
    GMTrace.i(8868704813056L, 66077);
    jPP = "]]>";
    jPN = "<TimelineObject>";
    jPO = "</TimelineObject>";
    GMTrace.o(8868704813056L, 66077);
  }
  
  private static String Hj(String paramString)
  {
    GMTrace.i(8868302159872L, 66074);
    if (paramString == null)
    {
      GMTrace.o(8868302159872L, 66074);
      return "";
    }
    GMTrace.o(8868302159872L, 66074);
    return paramString;
  }
  
  private static String Hk(String paramString)
  {
    GMTrace.i(8868436377600L, 66075);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8868436377600L, 66075);
      return "";
    }
    if (paramString.matches("\\d*")) {}
    for (int i = 1; i != 0; i = 0)
    {
      GMTrace.o(8868436377600L, 66075);
      return paramString;
    }
    GMTrace.o(8868436377600L, 66075);
    return "";
  }
  
  public static String b(bhc parambhc)
  {
    GMTrace.i(8868570595328L, 66076);
    a locala = new a();
    Object localObject1 = new HashMap();
    locala.sT("TimelineObject");
    locala.sT("id");
    Object localObject2;
    label1434:
    Object localObject3;
    if ((parambhc.nas == null) || (parambhc.nas.equals("")))
    {
      locala.setText("0");
      locala.sU("id");
      if (parambhc.jWW != null)
      {
        locala.sT("username");
        locala.setText(parambhc.jWW);
        locala.sU("username");
      }
      locala.sT("createTime");
      locala.setText(parambhc.orU);
      locala.sU("createTime");
      locala.sT("contentDescShowType");
      locala.uq(parambhc.uyw);
      locala.sU("contentDescShowType");
      locala.sT("contentDescScene");
      locala.uq(parambhc.uyx);
      locala.sU("contentDescScene");
      locala.sT("private");
      locala.setText(parambhc.uhC);
      locala.sU("private");
      if ((parambhc.uyt != null) && (!bg.mZ(parambhc.uyt.nas)))
      {
        locala.sT("appInfo");
        locala.sT("id");
        locala.setText(Hj(parambhc.uyt.nas));
        locala.sU("id");
        locala.sT("version");
        locala.setText(Hj(parambhc.uyt.jXC));
        locala.sU("version");
        locala.sT("appName");
        locala.setText(Hj(parambhc.uyt.mFw));
        locala.sU("appName");
        locala.sT("installUrl");
        locala.setText(Hj(parambhc.uyt.tvW));
        locala.sU("installUrl");
        locala.sT("fromUrl");
        locala.setText(Hj(parambhc.uyt.tvX));
        locala.sU("fromUrl");
        locala.sU("appInfo");
      }
      if ((parambhc.uyz != null) && (!bg.mZ(parambhc.uyz.hdc)))
      {
        locala.sT("streamvideo");
        locala.sT("streamvideourl");
        locala.setText(Hj(parambhc.uyz.hdc));
        locala.sU("streamvideourl");
        locala.sT("streamvideototaltime");
        locala.uq(parambhc.uyz.hdd);
        locala.sU("streamvideototaltime");
        locala.sT("streamvideotitle");
        locala.setText(Hj(parambhc.uyz.hde));
        locala.sU("streamvideotitle");
        locala.sT("streamvideowording");
        locala.setText(Hj(parambhc.uyz.hdf));
        locala.sU("streamvideowording");
        locala.sT("streamvideoweburl");
        locala.setText(Hj(parambhc.uyz.hdg));
        locala.sU("streamvideoweburl");
        locala.sT("streamvideothumburl");
        locala.setText(Hj(parambhc.uyz.hdh));
        locala.sU("streamvideothumburl");
        locala.sT("streamvideoaduxinfo");
        locala.setText(Hj(parambhc.uyz.hdi));
        locala.sU("streamvideoaduxinfo");
        locala.sT("streamvideopublishid");
        locala.setText(Hj(parambhc.uyz.hdj));
        locala.sU("streamvideopublishid");
        locala.sU("streamvideo");
      }
      locala.sT("contentDesc");
      locala.setText(Hj(parambhc.uyr));
      locala.sU("contentDesc");
      locala.sT("contentattr");
      locala.setText(parambhc.haU);
      locala.sU("contentattr");
      locala.sT("sourceUserName");
      locala.setText(Hj(parambhc.tbH));
      locala.sU("sourceUserName");
      locala.sT("sourceNickName");
      locala.setText(Hj(parambhc.tbI));
      locala.sU("sourceNickName");
      locala.sT("statisticsData");
      locala.setText(Hj(parambhc.uyy));
      locala.sU("statisticsData");
      locala.sT("weappInfo");
      locala.sT("appUserName");
      locala.setText(Hj(parambhc.uyA.username));
      locala.sU("appUserName");
      locala.sT("pagePath");
      locala.setText(Hj(parambhc.uyA.path));
      locala.sU("pagePath");
      locala.sU("weappInfo");
      locala.sT("canvasInfoXml");
      locala.setText(Hj(parambhc.qAC));
      locala.sU("canvasInfoXml");
      if (parambhc.uys != null)
      {
        float f1 = parambhc.uys.tDM;
        float f2 = parambhc.uys.tDN;
        if ((f1 != -1000.0F) && (f2 != -1000.0F))
        {
          ((Map)localObject1).clear();
          ((Map)localObject1).put("longitude", parambhc.uys.tDM);
          ((Map)localObject1).put("latitude", parambhc.uys.tDN);
          ((Map)localObject1).put("city", bg.RD(Hj(parambhc.uys.huL)));
          ((Map)localObject1).put("poiName", bg.RD(Hj(parambhc.uys.nmP)));
          ((Map)localObject1).put("poiAddress", bg.RD(Hj(parambhc.uys.qCv)));
          ((Map)localObject1).put("poiScale", parambhc.uys.ufK);
          ((Map)localObject1).put("poiClassifyId", Hj(parambhc.uys.ufI));
          ((Map)localObject1).put("poiClassifyType", parambhc.uys.qCx);
          ((Map)localObject1).put("poiClickableStatus", parambhc.uys.ufL);
          locala.f("location", (Map)localObject1);
          locala.sU("location");
        }
      }
      locala.sT("ContentObject");
      locala.sT("contentStyle");
      locala.setText(parambhc.uyu.tKc);
      locala.sU("contentStyle");
      locala.sT("contentSubStyle");
      locala.setText(parambhc.uyu.tKe);
      locala.sU("contentSubStyle");
      locala.sT("title");
      locala.setText(Hj(parambhc.uyu.fuw));
      locala.sU("title");
      locala.sT("description");
      locala.setText(Hj(parambhc.uyu.mCK));
      locala.sU("description");
      locala.sT("contentUrl");
      locala.setText(Hj(parambhc.uyu.mDo));
      locala.sU("contentUrl");
      if (parambhc.uyu.tKd.size() <= 0) {
        break label2267;
      }
      locala.sT("mediaList");
      localObject2 = parambhc.uyu.tKd.iterator();
      if (!((Iterator)localObject2).hasNext()) {
        break label2259;
      }
      localObject3 = (amn)((Iterator)localObject2).next();
      locala.sT("media");
      locala.sT("id");
      if (!Hk(((amn)localObject3).nas).equals("")) {
        break label2243;
      }
      locala.setText("0");
    }
    for (;;)
    {
      locala.sU("id");
      locala.sT("type");
      locala.setText(((amn)localObject3).jXP);
      locala.sU("type");
      locala.sT("title");
      locala.setText(Hj(((amn)localObject3).fuw));
      locala.sU("title");
      locala.sT("description");
      locala.setText(Hj(((amn)localObject3).mCK));
      locala.sU("description");
      locala.sT("private");
      locala.setText(((amn)localObject3).uhC);
      locala.sU("private");
      ((Map)localObject1).clear();
      ((Map)localObject1).put("type", ((amn)localObject3).uhz);
      if (!bg.mZ(((amn)localObject3).fwU)) {
        ((Map)localObject1).put("md5", ((amn)localObject3).fwU);
      }
      if (!bg.mZ(((amn)localObject3).uhV)) {
        ((Map)localObject1).put("videomd5", ((amn)localObject3).uhV);
      }
      locala.f("url", (Map)localObject1);
      locala.setText(Hj(((amn)localObject3).mDo));
      locala.sU("url");
      if ((((amn)localObject3).uhA != null) && (!((amn)localObject3).uhA.equals("")))
      {
        ((Map)localObject1).clear();
        ((Map)localObject1).put("type", ((amn)localObject3).uhB);
        locala.f("thumb", (Map)localObject1);
        locala.setText(Hj(((amn)localObject3).uhA));
        locala.sU("thumb");
      }
      if (((amn)localObject3).fvu > 0)
      {
        locala.sT("subType");
        locala.setText(((amn)localObject3).fvu);
        locala.sU("subType");
      }
      if (!bg.mZ(((amn)localObject3).qyB))
      {
        locala.sT("userData");
        locala.setText(((amn)localObject3).qyB);
        locala.sU("userData");
      }
      if ((((amn)localObject3).uhE != null) && (!((amn)localObject3).uhE.equals("")))
      {
        ((Map)localObject1).clear();
        ((Map)localObject1).put("type", ((amn)localObject3).uhF);
        locala.f("lowBandUrl", (Map)localObject1);
        locala.setText(Hj(((amn)localObject3).uhE));
        locala.sU("lowBandUrl");
      }
      if (((amn)localObject3).uhD != null)
      {
        ((Map)localObject1).clear();
        if (((amn)localObject3).uhD.uis > 0.0F) {
          ((Map)localObject1).put("width", ((amn)localObject3).uhD.uis);
        }
        if (((amn)localObject3).uhD.uit > 0.0F) {
          ((Map)localObject1).put("height", ((amn)localObject3).uhD.uit);
        }
        if (((amn)localObject3).uhD.uiu > 0.0F) {
          ((Map)localObject1).put("totalSize", ((amn)localObject3).uhD.uiu);
        }
        locala.f("size", (Map)localObject1);
        locala.sU("size");
      }
      locala.sU("media");
      break label1434;
      locala.setText(parambhc.nas);
      break;
      label2243:
      locala.setText(Hk(((amn)localObject3).nas));
    }
    label2259:
    locala.sU("mediaList");
    label2267:
    locala.sU("ContentObject");
    if (parambhc.qfM != null)
    {
      locala.sT("actionInfo");
      if (parambhc.qfM.tuc != null)
      {
        locala.sT("appMsg");
        locala.sT("mediaTagName");
        locala.setText(parambhc.qfM.tuc.ttV);
        locala.sU("mediaTagName");
        locala.sT("messageExt");
        locala.setText(parambhc.qfM.tuc.ttW);
        locala.sU("messageExt");
        locala.sT("messageAction");
        locala.setText(parambhc.qfM.tuc.ttX);
        locala.sU("messageAction");
        locala.sU("appMsg");
      }
      locala.sU("actionInfo");
    }
    if ((parambhc.uyt != null) && (!bg.mZ(parambhc.uyt.nas)))
    {
      localObject1 = parambhc.qBT;
      localObject2 = new bfi();
      if (localObject1 != null) {
        localObject3 = Base64.decode((String)localObject1, 0);
      }
    }
    try
    {
      ((bfi)localObject2).aC((byte[])localObject3);
      ((bfi)localObject2).uxv = new bfg();
      ((bfi)localObject2).uxv.mzX = parambhc.uyt.nas;
      try
      {
        localObject2 = Base64.encodeToString(((bfi)localObject2).toByteArray(), 0);
        localObject1 = localObject2;
        localObject2 = ((String)localObject2).replace("\n", "");
        localObject1 = localObject2;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.TimelineConvert", localIOException, "", new Object[0]);
        }
        GMTrace.o(8868570595328L, 66076);
        return parambhc;
      }
      parambhc.qBT = ((String)localObject1);
      if (parambhc.qBT != null)
      {
        locala.sT("statExtStr");
        locala.setText(parambhc.qBT);
        locala.sU("statExtStr");
      }
      locala.sU("TimelineObject");
      parambhc = locala.jPS.toString();
      w.d("MicroMsg.TimelineConvert", "xmlContent: " + parambhc);
      if (bh.p(parambhc, "TimelineObject") == null)
      {
        w.e("MicroMsg.TimelineConvert", "xml is error");
        GMTrace.o(8868570595328L, 66076);
        return "";
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  static final class a
  {
    StringBuffer jPS;
    
    a()
    {
      GMTrace.i(8866691547136L, 66062);
      this.jPS = new StringBuffer();
      GMTrace.o(8866691547136L, 66062);
    }
    
    public final void f(String paramString, Map<String, String> paramMap)
    {
      GMTrace.i(8867362635776L, 66067);
      this.jPS.append("<" + paramString);
      paramString = paramMap.keySet().iterator();
      while (paramString.hasNext())
      {
        String str1 = (String)paramString.next();
        String str2 = (String)paramMap.get(str1);
        this.jPS.append(" " + str1 + "=\"" + str2 + "\" ");
      }
      this.jPS.append(">");
      paramMap.clear();
      GMTrace.o(8867362635776L, 66067);
    }
    
    public final void sT(String paramString)
    {
      GMTrace.i(8866825764864L, 66063);
      this.jPS.append("<" + paramString + ">");
      GMTrace.o(8866825764864L, 66063);
    }
    
    public final void sU(String paramString)
    {
      GMTrace.i(8866959982592L, 66064);
      this.jPS.append("</" + paramString + ">");
      GMTrace.o(8866959982592L, 66064);
    }
    
    public final void setText(String paramString)
    {
      GMTrace.i(8867094200320L, 66065);
      if (bg.mZ(paramString))
      {
        GMTrace.o(8867094200320L, 66065);
        return;
      }
      if (paramString.contains(j.jPP))
      {
        this.jPS.append("<![CDATA[" + bg.RD(paramString) + "]]>");
        GMTrace.o(8867094200320L, 66065);
        return;
      }
      this.jPS.append("<![CDATA[" + paramString + "]]>");
      GMTrace.o(8867094200320L, 66065);
    }
    
    public final void uq(int paramInt)
    {
      GMTrace.i(8867228418048L, 66066);
      this.jPS.append(paramInt);
      GMTrace.o(8867228418048L, 66066);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */