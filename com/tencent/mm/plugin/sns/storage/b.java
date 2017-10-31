package com.tencent.mm.plugin.sns.storage;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.c.f;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  public static String qlV;
  public String fId;
  public String fvS;
  public int hNB;
  public String qlA;
  public String qlB;
  public String qlC;
  public b qlD;
  public int qlE;
  public String qlF;
  public String qlG;
  public int qlH;
  public String qlI;
  public int qlJ;
  public String qlK;
  public String qlL;
  public String qlM;
  public String qlN;
  public String qlO;
  public String qlP;
  public int qlQ;
  public int qlR;
  public int qlS;
  public long qlT;
  public Map<String, String> qlU;
  public int qlW;
  public int qlX;
  public float qlY;
  public float qlZ;
  public String qle;
  public boolean qln;
  public String qls;
  public int qlt;
  public int qlu;
  public String qlv;
  public String qlw;
  public String qlx;
  public String qly;
  public String qlz;
  public int qma;
  public int qmb;
  public int qmc;
  public String qmd;
  public float qme;
  public float qmf;
  public float qmg;
  public float qmh;
  public int qmi;
  public String qmj;
  public String qmk;
  private a qml;
  
  static
  {
    GMTrace.i(8309553758208L, 61911);
    qlV = ".adxml.adArgs.arg";
    GMTrace.o(8309553758208L, 61911);
  }
  
  public b(String paramString)
  {
    GMTrace.i(8309016887296L, 61907);
    this.fId = "";
    this.qlt = 0;
    this.qlu = 0;
    this.qlv = "";
    this.qlw = "";
    this.qlx = "";
    this.qly = "";
    this.qlz = "";
    this.qlA = "";
    this.qlB = "";
    this.qlC = "";
    this.qlD = new b();
    this.qlE = 0;
    this.qlF = "";
    this.qlG = "";
    this.qlH = 0;
    this.qlI = "";
    this.qlJ = 0;
    this.qlK = "";
    this.qlL = "";
    this.qlM = "";
    this.qlN = "";
    this.qlO = "";
    this.qlP = "";
    this.qlU = new HashMap();
    if ((!bg.mZ(paramString)) && (paramString.trim().startsWith("<RecXml")))
    {
      paramString = U(paramString, ".RecXml", "RecXml");
      if ((paramString != null) && (!paramString.isEmpty()))
      {
        this.qlQ = bg.RF((String)paramString.get(".RecXml.$type"));
        this.qlR = bg.RF((String)paramString.get(".RecXml.$source"));
        this.qlS = bg.RF((String)paramString.get(".RecXml.$expId"));
        this.qlT = i.Gk((String)paramString.get(".RecXml.$expOriginSnsId"));
      }
      GMTrace.o(8309016887296L, 61907);
      return;
    }
    U(paramString, "", "adxml");
    GMTrace.o(8309016887296L, 61907);
  }
  
  private Map<String, String> U(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8309151105024L, 61908);
    if ((bg.mZ(paramString1)) || (bg.mZ(paramString3)))
    {
      GMTrace.o(8309151105024L, 61908);
      return null;
    }
    this.fId = paramString1;
    w.i("MicroMsg.ADXml", "feed xml %s, keyPrefix %s, tag %s", new Object[] { paramString1, paramString2, paramString3 });
    paramString3 = f.p(paramString1, paramString3);
    if (paramString3 == null)
    {
      GMTrace.o(8309151105024L, 61908);
      return null;
    }
    this.hNB = bg.RF((String)paramString3.get(paramString2 + ".adxml.adType"));
    this.qls = bg.ap((String)paramString3.get(paramString2 + ".adxml.adActionTitle"), "");
    this.qle = bg.ap((String)paramString3.get(paramString2 + ".adxml.adActionLink"), "");
    this.fvS = bg.ap((String)paramString3.get(paramString2 + ".adxml.nickname"), "");
    this.qlt = bg.RF((String)paramString3.get(paramString2 + ".adxml.webviewRightBarShow"));
    this.qlu = bg.RF((String)paramString3.get(paramString2 + ".adxml.adActionLinkHidden"));
    this.qlv = bg.ap((String)paramString3.get(paramString2 + ".adxml.adActionLinkName"), "");
    this.qlw = bg.ap((String)paramString3.get(paramString2 + ".adxml.adActionLinkIcon"), "");
    this.qlx = bg.ap((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.zh"), "");
    this.qlz = bg.ap((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.tw"), "");
    this.qly = bg.ap((String)paramString3.get(paramString2 + ".adxml.adActionLinkTitle.en"), "");
    this.qlA = bg.ap((String)paramString3.get(paramString2 + ".adxml.dislikeInfo.Title.zh"), "");
    this.qlC = bg.ap((String)paramString3.get(paramString2 + ".adxml.dislikeInfo.Title.tw"), "");
    this.qlB = bg.ap((String)paramString3.get(paramString2 + ".adxml.dislikeInfo.Title.en"), "");
    this.qlD = new b(paramString3, paramString2);
    this.qlF = bg.ap((String)paramString3.get(paramString2 + ".adxml.attachShareLinkWording"), "");
    this.qlG = bg.ap((String)paramString3.get(paramString2 + ".adxml.attachShareLinkUrl"), "");
    this.qlE = bg.RF((String)paramString3.get(paramString2 + ".adxml.attachShareLinkIsHidden"));
    if ((bg.mZ(this.qlF)) || (bg.mZ(this.qlG))) {
      this.qlE = 1;
    }
    this.qlK = bg.ap((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.zh"), "");
    this.qlM = bg.ap((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.tw"), "");
    this.qlL = bg.ap((String)paramString3.get(paramString2 + ".adxml.expandOutsideTitle.en"), "");
    this.qlN = bg.ap((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.zh"), "");
    this.qlP = bg.ap((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.tw"), "");
    this.qlO = bg.ap((String)paramString3.get(paramString2 + ".adxml.expandInsideTitle.en"), "");
    this.qlH = bg.RF((String)paramString3.get(paramString2 + ".adxml.headClickType"));
    this.qlI = bg.ap((String)paramString3.get(paramString2 + ".adxml.headClickParam"), "");
    this.qlJ = bg.RF((String)paramString3.get(paramString2 + ".adxml.headClickRightBarShow"));
    int i = 0;
    Object localObject1 = new StringBuilder().append(paramString2).append(qlV);
    label1122:
    String str;
    Object localObject2;
    if (i == 0)
    {
      paramString1 = "";
      localObject1 = paramString1 + ".key";
      str = (String)paramString3.get(localObject1);
      if (str == null) {
        break label1308;
      }
      localObject2 = new StringBuilder().append(paramString2).append(qlV);
      if (i != 0) {
        break label1299;
      }
    }
    label1299:
    for (paramString1 = "";; paramString1 = Integer.valueOf(i))
    {
      paramString1 = paramString1 + ".value";
      localObject2 = (String)paramString3.get(paramString1);
      w.i("MicroMsg.ADXml", "newKey " + (String)localObject1 + " " + str + " newValue : " + paramString1 + " " + (String)localObject2);
      this.qlU.put(str, localObject2);
      i += 1;
      break;
      paramString1 = Integer.valueOf(i);
      break label1122;
    }
    label1308:
    this.qln = paramString3.containsKey(paramString2 + ".adxml.adCanvasInfo");
    this.qlW = bg.RF((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.contentDisplayType"));
    this.qlX = bg.RF((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayMode"));
    this.qlY = ((float)bg.RH((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayWidth")));
    this.qlZ = ((float)bg.RH((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaDisplayHeight")));
    this.qmc = bg.RF((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.btnDisplayType"));
    this.qmd = bg.ap((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconUrl"), "");
    this.qma = bg.RF((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.basicRemWidth"));
    this.qmb = bg.RF((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.basicRootFontSize"));
    this.qme = ((float)bg.RH((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconWidth")));
    this.qmf = ((float)bg.RH((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconHeight")));
    this.qmg = ((float)bg.RH((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconPaddingRight")));
    this.qmh = ((float)bg.RH((String)paramString3.get(paramString2 + ".adxml.adFeedDisplayInfo.mediaIconPaddingBottom")));
    this.qmi = bg.RF((String)paramString3.get(paramString2 + ".adxml.adContentStyle"));
    this.qmj = bg.ap((String)paramString3.get(paramString2 + ".adxml.adCardInfo.title"), "");
    this.qmk = bg.ap((String)paramString3.get(paramString2 + ".adxml.adCardInfo.description"), "");
    paramString1 = bg.ap((String)paramString3.get(paramString2 + ".adxml.adSelectInfo.leftBtnTitle"), "");
    paramString2 = bg.ap((String)paramString3.get(paramString2 + ".adxml.adSelectInfo.rightBtnTitle"), "");
    if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)))
    {
      this.qml = new a();
      this.qml.qmm = paramString1;
      this.qml.qmn = paramString2;
    }
    GMTrace.o(8309151105024L, 61908);
    return paramString3;
  }
  
  public final String bik()
  {
    GMTrace.i(18582041788416L, 138447);
    if (bio())
    {
      String str = this.qml.qmm;
      GMTrace.o(18582041788416L, 138447);
      return str;
    }
    GMTrace.o(18582041788416L, 138447);
    return "";
  }
  
  public final String bil()
  {
    GMTrace.i(18582176006144L, 138448);
    if (bio())
    {
      String str = this.qml.qmn;
      GMTrace.o(18582176006144L, 138448);
      return str;
    }
    GMTrace.o(18582176006144L, 138448);
    return "";
  }
  
  public final boolean bim()
  {
    GMTrace.i(8309285322752L, 61909);
    if (this.qmi == 2)
    {
      GMTrace.o(8309285322752L, 61909);
      return true;
    }
    GMTrace.o(8309285322752L, 61909);
    return false;
  }
  
  public final boolean bin()
  {
    GMTrace.i(8309419540480L, 61910);
    if (this.qmi == 1)
    {
      GMTrace.o(8309419540480L, 61910);
      return true;
    }
    GMTrace.o(8309419540480L, 61910);
    return false;
  }
  
  public final boolean bio()
  {
    GMTrace.i(18582310223872L, 138449);
    if (this.qml != null)
    {
      GMTrace.o(18582310223872L, 138449);
      return true;
    }
    GMTrace.o(18582310223872L, 138449);
    return false;
  }
  
  public final String bip()
  {
    GMTrace.i(18582444441600L, 138450);
    String str = this.fId.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "").replaceAll("adCanvasInfoLeft", "adCanvasInfo");
    GMTrace.o(18582444441600L, 138450);
    return str;
  }
  
  public final String biq()
  {
    GMTrace.i(18582578659328L, 138451);
    String str = this.fId.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("adCanvasInfoRight", "adCanvasInfo");
    GMTrace.o(18582578659328L, 138451);
    return str;
  }
  
  public final boolean bir()
  {
    GMTrace.i(20066489860096L, 149507);
    if (this.qlR == 2)
    {
      GMTrace.o(20066489860096L, 149507);
      return true;
    }
    GMTrace.o(20066489860096L, 149507);
    return false;
  }
  
  public final class a
  {
    public String qmm;
    public String qmn;
    
    public a()
    {
      GMTrace.i(18577209950208L, 138411);
      GMTrace.o(18577209950208L, 138411);
    }
  }
  
  public static final class b
  {
    private List<a> qmp;
    public Map<String, List<a>> qmq;
    
    public b()
    {
      GMTrace.i(20064610811904L, 149493);
      this.qmp = new ArrayList();
      this.qmq = new HashMap();
      GMTrace.o(20064610811904L, 149493);
    }
    
    public b(Map<String, String> paramMap, String paramString)
    {
      GMTrace.i(20064745029632L, 149494);
      this.qmp = new ArrayList();
      this.qmq = new HashMap();
      String str = paramString + ".adxml.dislikeInfo.ReasonList";
      int i = 0;
      paramString = str + ".Reason";
      if (i > 0) {
        paramString = paramString + i;
      }
      for (;;)
      {
        if (paramMap.get(paramString + ".ReasonId") != null)
        {
          this.qmp.add(new a(bg.ap((String)paramMap.get(paramString + ".Wording.zh"), ""), bg.ap((String)paramMap.get(paramString + ".Wording.tw"), ""), bg.ap((String)paramMap.get(paramString + ".Wording.en"), ""), bg.RF((String)paramMap.get(paramString + ".ReasonId"))));
          i += 1;
          break;
        }
        GMTrace.o(20064745029632L, 149494);
        return;
      }
    }
    
    public final List<a> bis()
    {
      GMTrace.i(20064476594176L, 149492);
      Object localObject = v.eq(ab.getContext());
      if ((!"zh_CN".equals(localObject)) && (!"zh_TW".equals(localObject)) && (!"zh_HK".equals(localObject))) {
        localObject = "en";
      }
      for (;;)
      {
        if (!this.qmq.containsKey(localObject))
        {
          ArrayList localArrayList = new ArrayList();
          Iterator localIterator = this.qmp.iterator();
          while (localIterator.hasNext())
          {
            a locala = (a)localIterator.next();
            if (("zh_CN".equals(localObject)) && (!bg.mZ(locala.qms))) {
              localArrayList.add(locala);
            } else if ((("zh_TW".equals(localObject)) || ("zh_HK".equals(localObject))) && (!bg.mZ(locala.qmt))) {
              localArrayList.add(locala);
            } else if (("en".equals(localObject)) && (!bg.mZ(locala.qmu))) {
              localArrayList.add(locala);
            }
          }
          this.qmq.put(localObject, localArrayList);
        }
        localObject = (List)this.qmq.get(localObject);
        GMTrace.o(20064476594176L, 149492);
        return (List<a>)localObject;
      }
    }
    
    public static final class a
    {
      public static int qmr;
      public long pYe;
      public String qms;
      public String qmt;
      public String qmu;
      public int qmv;
      public long qmw;
      
      static
      {
        GMTrace.i(20064208158720L, 149490);
        qmr = 101;
        GMTrace.o(20064208158720L, 149490);
      }
      
      public a()
      {
        GMTrace.i(20064073940992L, 149489);
        this.qms = "";
        this.qmt = "";
        this.qmu = "";
        this.qmv = 0;
        this.pYe = 0L;
        this.qmw = 0L;
        GMTrace.o(20064073940992L, 149489);
      }
      
      public a(String paramString1, String paramString2, String paramString3, int paramInt)
      {
        GMTrace.i(20063939723264L, 149488);
        this.qms = "";
        this.qmt = "";
        this.qmu = "";
        this.qmv = 0;
        this.pYe = 0L;
        this.qmw = 0L;
        this.qms = paramString1;
        this.qmt = paramString2;
        this.qmu = paramString3;
        this.qmv = paramInt;
        GMTrace.o(20063939723264L, 149488);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */