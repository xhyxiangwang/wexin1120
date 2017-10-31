package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ot;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.g.i;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
{
  private static String pYK;
  private static g pYL;
  private static int[] pZq;
  private StringBuffer jPS;
  public long jYa;
  public String pYH;
  public long pYI;
  public String pYM;
  public int pYN;
  public int pYO;
  public long pYP;
  public long pYQ;
  public String pYR;
  public long pYS;
  public long pYT;
  public String pYU;
  public String pYV;
  public String pYW;
  public String pYX;
  public String pYY;
  public String pYZ;
  public String pZa;
  public String pZb;
  public String pZc;
  public String pZd;
  public String pZe;
  public String pZf;
  public String pZg;
  public String pZh;
  public String pZi;
  public String pZj;
  public String pZk;
  public String pZl;
  public int pZm;
  public String pZn;
  private List<List<Integer>> pZo;
  private List<Integer> pZp;
  private LinkedList<c> pZr;
  
  static
  {
    GMTrace.i(8802267037696L, 65582);
    pYL = null;
    pYK = "";
    pZq = new int[] { 50, 66, 68, 88, 99, 121, 123, 166, 168, 188, 199, 233, 266, 268, 288, 299, 369, 419, 520, 666, 1024 };
    GMTrace.o(8802267037696L, 65582);
  }
  
  public g()
  {
    GMTrace.i(8801595949056L, 65577);
    this.pYI = 0L;
    this.jYa = 0L;
    this.pYM = "";
    this.pYN = 0;
    this.pYO = 0;
    this.pYH = "";
    this.pYP = 0L;
    this.pYQ = 0L;
    this.pYR = "";
    this.pYS = 0L;
    this.pYT = 0L;
    this.pYU = "";
    this.pYV = "";
    this.pYW = "";
    this.pYX = "";
    this.pYY = "";
    this.pYZ = "";
    this.pZa = "";
    this.pZb = "";
    this.pZc = "";
    this.pZd = "";
    this.pZe = "";
    this.pZf = "";
    this.pZg = "";
    this.pZh = "";
    this.pZi = "";
    this.pZj = "";
    this.pZk = "";
    this.pZl = "";
    this.pZm = -1;
    this.pZn = "";
    this.pZo = new LinkedList();
    this.pZp = new LinkedList();
    this.pZr = new LinkedList();
    this.jPS = new StringBuffer();
    GMTrace.o(8801595949056L, 65577);
  }
  
  public static g bgi()
  {
    GMTrace.i(8801864384512L, 65579);
    h.xA();
    if (!h.xx().wM())
    {
      localObject1 = new g();
      GMTrace.o(8801864384512L, 65579);
      return (g)localObject1;
    }
    Object localObject3 = com.tencent.mm.x.c.c.Cu().em("100068");
    Object localObject2 = ((com.tencent.mm.storage.c)localObject3).field_rawXML;
    Object localObject1 = localObject2;
    if (bg.mZ((String)localObject2)) {
      localObject1 = "";
    }
    String str = com.tencent.mm.a.g.n(((String)localObject1).getBytes());
    if ((pYL == null) || (!str.equals(pYK)))
    {
      w.i("MicroMsg.NewYearSnsCtrlV2", "create newYearSnsCtrl");
      pYL = new g();
    }
    for (;;)
    {
      try
      {
        localObject2 = ((com.tencent.mm.storage.c)localObject3).bPn();
        localObject1 = "";
        if (localObject2 != null) {
          localObject1 = (String)((Map)localObject2).get("SnsHBConfig");
        }
        localObject2 = localObject1;
        if (bg.mZ((String)localObject1)) {
          localObject2 = "";
        }
        localObject1 = URLDecoder.decode((String)localObject2, "UTF-8");
        localObject2 = pYL;
        ((g)localObject2).jPS = new StringBuffer();
        ((g)localObject2).pZr.clear();
        localObject3 = bh.p((String)localObject1, "sysmsg");
        if (localObject3 != null) {
          continue;
        }
        w.i("MicroMsg.NewYearSnsCtrlV2", "errr for paser %s", new Object[] { localObject1 });
        pYK = str;
      }
      catch (Exception localException)
      {
        int i;
        int k;
        LinkedList localLinkedList;
        int j;
        StringBuilder localStringBuilder;
        int m;
        w.e("MicroMsg.NewYearSnsCtrlV2", "createctrl error " + localException.getMessage());
        continue;
      }
      localObject1 = pYL;
      GMTrace.o(8801864384512L, 65579);
      return (g)localObject1;
      ((g)localObject2).pYI = bg.RG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BeginTime"));
      ((g)localObject2).jPS.append("BeginTime:" + ((g)localObject2).pYI + ";");
      ((g)localObject2).jYa = bg.RG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.EndTime"));
      ((g)localObject2).jPS.append("EndTime:" + ((g)localObject2).jYa + ";\n");
      ((g)localObject2).pYN = bg.RF((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMin"));
      ((g)localObject2).pYO = bg.RF((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMax"));
      ((g)localObject2).jPS.append("SvrDownReqLimitLevelMin:" + ((g)localObject2).pYN + " SvrDownReqLimitLevelMax: " + ((g)localObject2).pYO + ";\n");
      ((g)localObject2).pYS = bg.RG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseBeginTime"));
      ((g)localObject2).pYT = bg.RG((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseEndTime"));
      ((g)localObject2).pYU = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenTitle"), "");
      ((g)localObject2).pYV = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenDescription"), "");
      ((g)localObject2).pYW = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenQueryTips"), "");
      ((g)localObject2).pYX = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenAcceptButtonText"), "");
      ((g)localObject2).pYY = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenRejectButtonText"), "");
      ((g)localObject2).pYZ = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenTips"), "");
      ((g)localObject2).pZb = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenSuccTips"), "");
      ((g)localObject2).pZc = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenFailTips"), "");
      ((g)localObject2).pZa = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseTips"), "");
      ((g)localObject2).pZd = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseSuccTips"), "");
      ((g)localObject2).pZe = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseFailTips"), "");
      ((g)localObject2).pZl = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedID"), "");
      ((g)localObject2).pZm = bg.RF((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedCount"));
      ((g)localObject2).pZn = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenID"), "");
      if (((g)localObject2).pZm <= 0)
      {
        w.i("MicroMsg.NewYearSnsCtrlV2", "svr MaxPostFeedCount error " + ((g)localObject2).pZm);
        ((g)localObject2).pZm = 1;
      }
      ((g)localObject2).jPS.append("FullScreenID:" + ((g)localObject2).pZn + " BrowseBeginTime:" + ((g)localObject2).pYS + " BrowseEndTime:" + ((g)localObject2).pYT + " FullScreenTitle:" + ((g)localObject2).pYU + " FullScreenDescription:" + ((g)localObject2).pYV + " FullScreenQueryTips:" + ((g)localObject2).pYW + " FullScreenAcceptButtonText: " + ((g)localObject2).pYX);
      ((g)localObject2).jPS.append("FullScreenRejectButtonText:" + ((g)localObject2).pYY + " ActionSheetOpenTips:" + ((g)localObject2).pYZ + " ActionSheetOpenSuccTips:" + ((g)localObject2).pZb + " ActionSheetOpenFailTips:" + ((g)localObject2).pZc + " ActionSheetCloseTips:" + ((g)localObject2).pZa + " ActionSheetCloseSuccTips: " + ((g)localObject2).pZd + " ActionSheetCloseFailTips: " + ((g)localObject2).pZe + "MaxPostFeedID: " + ((g)localObject2).pZl + " MaxPostFeedCount:" + ((g)localObject2).pZm);
      ((g)localObject2).pZf = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForHasUsed"), "");
      ((g)localObject2).pZg = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForObtainUsedRight"), "");
      ((g)localObject2).pZh = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForClosedBrowseSwitch"), "");
      ((g)localObject2).pZi = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.AlertButtonText"), "");
      ((g)localObject2).pZj = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTip"), "");
      ((g)localObject2).pZk = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTipID"), "");
      ((g)localObject2).jPS.append("AlertTipForHasUsed:" + ((g)localObject2).pZf + " AlertTipForObtainUsedRight:" + ((g)localObject2).pZg + " AlertTipForClosedBrowseSwitch:" + ((g)localObject2).pZh + " AlertButtonText:" + ((g)localObject2).pZi + " GoldenCameraTip:" + ((g)localObject2).pZj + " GoldenCameraTipID:" + ((g)localObject2).pZk);
      i = 0;
      if (i == 0)
      {
        localObject1 = "";
        ((g)localObject2).pYH = bg.ap((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "RedPointID" })), "");
        ((g)localObject2).jPS.append("RedPointID:" + ((g)localObject2).pYH + ";");
        if (bg.mZ(((g)localObject2).pYH)) {
          continue;
        }
        if (i == 0)
        {
          localObject1 = "";
          ((g)localObject2).pYP = bg.RG((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "BeginTime" })));
          ((g)localObject2).jPS.append("RedPointID_BeginTime:" + ((g)localObject2).pYP + ";");
          if (i != 0) {
            continue;
          }
          localObject1 = "";
          ((g)localObject2).pYQ = bg.RG((String)((Map)localObject3).get(String.format(".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s", new Object[] { localObject1, "EndTime" })));
          ((g)localObject2).jPS.append("RedPointID_EndTime:" + ((g)localObject2).pYQ + ";\n");
          localObject1 = new c();
          ((c)localObject1).pYH = ((g)localObject2).pYH;
          ((c)localObject1).pYI = ((g)localObject2).pYP;
          ((c)localObject1).jYa = ((g)localObject2).pYQ;
          ((g)localObject2).pZr.add(localObject1);
          i += 1;
        }
      }
      else
      {
        localObject1 = String.valueOf(i);
        continue;
      }
      localObject1 = String.valueOf(i);
      continue;
      localObject1 = String.valueOf(i);
      continue;
      ((g)localObject2).pYR = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.PostTips"), "");
      ((g)localObject2).jPS.append("PostTips:" + ((g)localObject2).pYR + ";");
      ((g)localObject2).pYM = bg.ap((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.Entrance.EntranceTips"), "");
      ((g)localObject2).jPS.append("EntranceTips:" + ((g)localObject2).pYM + ";");
      ((g)localObject2).pZo.clear();
      i = 0;
      k = bg.RF((String)((Map)localObject3).get(".sysmsg.NewYearSNSCtrl2016.AmountLevel" + i + ".Count"));
      ((g)localObject2).jPS.append("count: " + i + " | " + k + ";\n");
      if (k != 0)
      {
        localLinkedList = new LinkedList();
        j = 0;
        if (j < k)
        {
          localStringBuilder = new StringBuilder(".sysmsg.NewYearSNSCtrl2016.AmountLevel").append(i).append(".Amount");
          if (j == 0)
          {
            localObject1 = "";
            m = bg.RF((String)((Map)localObject3).get(localObject1));
            localLinkedList.add(Integer.valueOf(m));
            ((g)localObject2).jPS.append("AmountLevel : " + i + " index " + j + " val: " + m + ";");
            j += 1;
          }
          else
          {
            localObject1 = Integer.valueOf(j);
          }
        }
        else
        {
          ((g)localObject2).pZo.add(localLinkedList);
          i += 1;
        }
      }
      else
      {
        w.i("MicroMsg.NewYearSnsCtrlV2", "dumpinfo " + ((g)localObject2).jPS.toString());
      }
    }
  }
  
  public static boolean bgj()
  {
    GMTrace.i(8801998602240L, 65580);
    h.xA();
    boolean bool = ((Boolean)h.xz().xi().get(w.a.uXM, Boolean.valueOf(true))).booleanValue();
    GMTrace.o(8801998602240L, 65580);
    return bool;
  }
  
  public final void bgk()
  {
    GMTrace.i(8802132819968L, 65581);
    Object localObject = k.g(w.a.uXQ);
    if ((((i)localObject).qil == null) || (bg.mZ(((i)localObject).qil.qii)))
    {
      ((i)localObject).qil = new com.tencent.mm.plugin.sns.g.g();
      ((i)localObject).qil.qii = this.pZl;
      ((i)localObject).qil.qij = 0;
    }
    if ((!bg.mZ(((i)localObject).qil.qii)) && (((i)localObject).qil.qii.equals(this.pZl)))
    {
      com.tencent.mm.plugin.sns.g.g localg = ((i)localObject).qil;
      localg.qij -= 1;
      if (((i)localObject).qil.qij < 0) {
        ((i)localObject).qil.qij = 0;
      }
    }
    for (;;)
    {
      w.i("MicroMsg.NewYearSnsCtrlV2", "minusPostCountV2 " + ((i)localObject).qil.qij + " postId: " + this.pZl + " " + bg.bOd().toString());
      try
      {
        h.xA();
        h.xz().xi().a(w.a.uXQ, new String(((i)localObject).toByteArray(), Charset.forName("ISO-8859-1")));
        localObject = new ot();
        com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
        GMTrace.o(8802132819968L, 65581);
        return;
        ((i)localObject).qil = new com.tencent.mm.plugin.sns.g.g();
        ((i)localObject).qil.qii = this.pZl;
        ((i)localObject).qil.qij = 0;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          w.w("MicroMsg.NewYearSnsCtrlV2", "minusPostCountV2 save exception:" + localIOException.getLocalizedMessage());
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */