package com.tencent.mm.plugin.sns.storage;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  public static int qkV;
  public static int qkW;
  public String fId;
  public String iLj;
  public String qhb;
  public int qkX;
  public long qkY;
  public long qkZ;
  public int qla;
  public String qlb;
  public String qlc;
  public String qld;
  public String qle;
  public int qlf;
  public String qlg;
  public String qlh;
  public String qli;
  public int qlj;
  public String qlk;
  public String qll;
  public LinkedList<String> qlm;
  boolean qln;
  public String qlo;
  public String qlp;
  public HashMap<String, String> qlq;
  public a qlr;
  
  static
  {
    GMTrace.i(8303916613632L, 61869);
    qkV = 0;
    qkW = 1;
    GMTrace.o(8303916613632L, 61869);
  }
  
  public a()
  {
    GMTrace.i(8303513960448L, 61866);
    this.fId = "";
    this.qhb = "";
    this.qla = 0;
    this.qlb = "";
    this.qlc = "";
    this.qld = "";
    this.qle = "";
    this.qlf = 0;
    this.qlg = "";
    this.qlh = "";
    this.qli = "";
    this.qlj = qkV;
    this.qlk = "";
    this.qll = "";
    this.qlm = new LinkedList();
    GMTrace.o(8303513960448L, 61866);
  }
  
  public a(String paramString)
  {
    GMTrace.i(8303648178176L, 61867);
    this.fId = "";
    this.qhb = "";
    this.qla = 0;
    this.qlb = "";
    this.qlc = "";
    this.qld = "";
    this.qle = "";
    this.qlf = 0;
    this.qlg = "";
    this.qlh = "";
    this.qli = "";
    this.qlj = qkV;
    this.qlk = "";
    this.qll = "";
    this.qlm = new LinkedList();
    this.qln = false;
    Hn(paramString);
    GMTrace.o(8303648178176L, 61867);
  }
  
  private void Hn(String paramString)
  {
    int j = 0;
    GMTrace.i(8303782395904L, 61868);
    if (bg.mZ(paramString))
    {
      GMTrace.o(8303782395904L, 61868);
      return;
    }
    w.i("MicroMsg.ADInfo", "feed xml %s", new Object[] { paramString });
    Map localMap = bh.p(paramString, "ADInfo");
    if (localMap == null)
    {
      GMTrace.o(8303782395904L, 61868);
      return;
    }
    this.iLj = bg.ap((String)localMap.get(".ADInfo.viewid"), "");
    if (localMap.get(".ADInfo.ad_sns_pos") == null)
    {
      GMTrace.o(8303782395904L, 61868);
      return;
    }
    this.qkX = bg.RF((String)localMap.get(".ADInfo.ad_sns_pos"));
    this.qkY = bg.RG((String)localMap.get(".ADInfo.noExposureExpireTime"));
    this.qkZ = bg.RG((String)localMap.get(".ADInfo.exposureNoActionExpireTime"));
    this.qhb = bg.ap((String)localMap.get(".ADInfo.uxInfo"), "");
    this.qla = bg.RF((String)localMap.get(".ADInfo.adActionType"));
    this.qlb = bg.ap((String)localMap.get(".ADInfo.adActionCardTitle"), "");
    this.qlc = bg.ap((String)localMap.get(".ADInfo.adActionCardTpId"), "");
    this.qld = bg.ap((String)localMap.get(".ADInfo.adActionCardExt"), "");
    this.qle = bg.ap((String)localMap.get(".ADInfo.adActionLink"), "");
    this.qlf = bg.RF((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIType"));
    this.qlg = bg.ap((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIId"), "");
    this.qlh = bg.ap((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POIName"), "");
    this.qli = bg.ap((String)localMap.get(".ADInfo.adActionExt.adActionExtPOI.POILink"), "");
    String str1 = bg.ap((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.Wording"), "");
    this.qlj = bg.RF((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingType"));
    int i;
    if (this.qlj == qkW)
    {
      this.qll = bg.ap((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingLink"), "");
      String str2 = bg.ap((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.WordingRepAndroid"), "");
      this.qlm.clear();
      i = 0;
      if (i == 0) {}
      for (paramString = bg.ap((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.UserNameList.UserName"), "");; paramString = bg.ap((String)localMap.get(".ADInfo.adActionExt.adChainStrengthen.UserNameList.UserName" + i), ""))
      {
        if (bg.mZ(paramString)) {
          break label550;
        }
        this.qlm.add(paramString);
        i = i + 1 + 1;
        break;
      }
      label550:
      if (str2.indexOf("%s") >= 0)
      {
        i = 1;
        int k = str2.indexOf("%");
        int m = str2.lastIndexOf("%");
        if ((bg.mZ(str2)) || (i == 0) || (k != m)) {
          break label764;
        }
        this.qlk = str2;
        label605:
        this.qln = localMap.containsKey(".ADInfo.adCanvasInfo");
        this.qlp = ((String)localMap.get(".ADInfo.session_data.aid"));
        this.qlo = ((String)localMap.get(".ADInfo.session_data.trace_id"));
        this.qlq = new HashMap();
        i = j;
        label663:
        if (i != 0) {
          break label796;
        }
      }
    }
    label764:
    label796:
    for (paramString = ".ADInfo.adCanvasExt.adCardItemList.cardItem";; paramString = ".ADInfo.adCanvasExt.adCardItemList.cardItem" + i)
    {
      str1 = (String)localMap.get(paramString + ".cardTpId");
      paramString = (String)localMap.get(paramString + ".cardExt");
      if (bg.mZ(str1)) {
        break label819;
      }
      this.qlq.put(str1, paramString);
      i += 1;
      break label663;
      i = 0;
      break;
      this.qlk = str1;
      this.qlj = qkV;
      break label605;
      this.qlk = str1;
      this.qlj = qkV;
      break label605;
    }
    label819:
    paramString = (String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.appUserName");
    if (!TextUtils.isEmpty(paramString))
    {
      this.qlr = new a();
      this.qlr.fBG = paramString;
      this.qlr.aKG = ((String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.appVersion"));
      this.qlr.ftz = ((String)localMap.get(".ADInfo.adActionExt.adActionExtWeApp.relativePagePath"));
    }
    GMTrace.o(8303782395904L, 61868);
  }
  
  public static final class a
  {
    public String aKG;
    public String fBG;
    public String ftz;
    
    public a()
    {
      GMTrace.i(14313783820288L, 106646);
      GMTrace.o(14313783820288L, 106646);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */