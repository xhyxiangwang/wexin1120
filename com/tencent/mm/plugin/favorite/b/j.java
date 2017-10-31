package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ba;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sr;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class j
  extends ba
{
  protected static c.a gLR;
  private static a lOC;
  private static a lOD;
  
  static
  {
    GMTrace.i(6309441175552L, 47009);
    gLR = ba.qR();
    lOC = new a()
    {
      public final void xd(String paramAnonymousString)
      {
        GMTrace.i(6277497356288L, 46771);
        w.d("MicroMsg.FavItemInfo", paramAnonymousString);
        GMTrace.o(6277497356288L, 46771);
      }
    };
    lOD = new a()
    {
      public final void xd(String paramAnonymousString)
      {
        GMTrace.i(6266088849408L, 46686);
        w.e("MicroMsg.FavItemInfo", paramAnonymousString);
        GMTrace.o(6266088849408L, 46686);
      }
    };
    GMTrace.o(6309441175552L, 47009);
  }
  
  public j()
  {
    GMTrace.i(6306488385536L, 46987);
    this.field_flag = -1;
    this.field_fromUser = "";
    this.field_toUser = "";
    this.field_id = -1;
    this.field_realChatName = "";
    this.field_sourceType = -1;
    this.field_updateTime = -1L;
    this.field_type = -1;
    this.field_updateSeq = -1;
    this.field_xml = "";
    this.field_itemStatus = 0;
    awI();
    GMTrace.o(6306488385536L, 46987);
  }
  
  private static void a(String paramString, a parama, sw paramsw)
  {
    GMTrace.i(6308635869184L, 47003);
    if (paramsw == null)
    {
      GMTrace.o(6308635869184L, 47003);
      return;
    }
    parama.xd(paramString + " ----loc item----");
    parama.xd(paramString + "  lng: " + paramsw.lng);
    parama.xd(paramString + "  lat: " + paramsw.lat);
    parama.xd(paramString + "  scale: " + paramsw.fFj);
    parama.xd(paramString + "  label: " + paramsw.label);
    parama.xd(paramString + "  poiname: " + paramsw.fJh);
    GMTrace.o(6308635869184L, 47003);
  }
  
  private static void a(String paramString, a parama, sy paramsy)
  {
    GMTrace.i(6308501651456L, 47002);
    if (paramsy == null)
    {
      GMTrace.o(6308501651456L, 47002);
      return;
    }
    parama.xd(paramString + " ----product item----");
    parama.xd(paramString + "  title: " + paramsy.title);
    parama.xd(paramString + "  desc: " + paramsy.desc);
    parama.xd(paramString + "  thumbUrl: " + paramsy.thumbUrl);
    parama.xd(paramString + "  type: " + paramsy.type);
    GMTrace.o(6308501651456L, 47002);
  }
  
  private static void a(String paramString, a parama, td paramtd)
  {
    GMTrace.i(6308367433728L, 47001);
    if (paramtd == null)
    {
      GMTrace.o(6308367433728L, 47001);
      return;
    }
    parama.xd(paramString + " ----tv item----");
    parama.xd(paramString + "  title: " + paramtd.title);
    parama.xd(paramString + "  desc: " + paramtd.desc);
    parama.xd(paramString + "  thumbUrl: " + paramtd.thumbUrl);
    GMTrace.o(6308367433728L, 47001);
  }
  
  private static void a(String paramString, a parama, tj paramtj)
  {
    GMTrace.i(6308770086912L, 47004);
    if (paramtj == null)
    {
      GMTrace.o(6308770086912L, 47004);
      return;
    }
    parama.xd(paramString + " ----url item----");
    parama.xd(paramString + "  title: " + paramtj.title);
    parama.xd(paramString + "  desc: " + paramtj.desc);
    parama.xd(paramString + "  cleanUrl: " + paramtj.tRc);
    parama.xd(paramString + "  thumbUrl: " + paramtj.thumbUrl);
    parama.xd(paramString + "  opencache: " + paramtj.tRe);
    GMTrace.o(6308770086912L, 47004);
  }
  
  private void awI()
  {
    GMTrace.i(6306622603264L, 46988);
    this.field_favProto = new sz();
    ta localta = new ta();
    localta.zs(1);
    this.field_favProto.a(localta);
    this.field_favProto.b(new tj());
    this.field_favProto.b(new sw());
    this.field_favProto.b(new sy());
    this.field_favProto.b(new td());
    this.field_favProto.zq(-1);
    this.field_tagProto = new th();
    GMTrace.o(6306622603264L, 46988);
  }
  
  public static String b(j paramj)
  {
    GMTrace.i(6309038522368L, 47006);
    StringBuffer localStringBuffer1 = new StringBuffer();
    localStringBuffer1.append("<favitem");
    localStringBuffer1.append(" type='").append(paramj.field_type).append("'");
    localStringBuffer1.append(">");
    Object localObject2 = paramj.field_favProto;
    StringBuilder localStringBuilder = new StringBuilder();
    if (!bg.mZ(((sz)localObject2).title)) {
      localStringBuilder.append("<title>").append(bg.RD(((sz)localObject2).title)).append("</title>");
    }
    if (!bg.mZ(((sz)localObject2).desc)) {
      localStringBuilder.append("<desc>").append(bg.RD(((sz)localObject2).desc)).append("</desc>");
    }
    if (((sz)localObject2).tPY > 0L) {
      localStringBuilder.append("<edittime>").append(((sz)localObject2).tPY).append("</edittime>");
    }
    if (!bg.mZ(((sz)localObject2).iDL))
    {
      localStringBuilder.append("<remark ");
      if (((sz)localObject2).tPU > 0L) {
        localStringBuilder.append(" time ='").append(((sz)localObject2).tPU).append("'");
      }
      localStringBuilder.append(">").append(bg.RD(((sz)localObject2).iDL)).append("</remark>");
    }
    if (((sz)localObject2).tPX) {
      localStringBuilder.append("<ctrlflag>").append(((sz)localObject2).tPW).append("</ctrlflag>");
    }
    if (((sz)localObject2).tQE)
    {
      localStringBuilder.append("<version>").append(((sz)localObject2).version).append("</version>");
      localObject1 = ((sz)localObject2).tQA;
      if ((localObject1 != null) && (((ta)localObject1).aWM() != 0)) {
        break label569;
      }
      w.w("MicroMsg.FavSourceItemParser", "klem toXml, source item empty");
      localObject1 = "";
      label337:
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(f.as(((sz)localObject2).tQC));
      localObject1 = paramj.field_favProto.tPL;
      if ((localObject1 != null) && (((sw)localObject1).aWM() != 0)) {
        break label919;
      }
      w.d("MicroMsg.FavLocItemParser", "klem toXml, loc item empty");
      localObject1 = "";
      label387:
      localStringBuilder.append((String)localObject1);
      localObject1 = paramj.field_favProto.tPN;
      if ((localObject1 != null) && (((tj)localObject1).aWM() != 0)) {
        break label1103;
      }
      w.d("MicroMsg.FavUrlItemParser", "klem toXml, url item empty");
      localObject1 = "";
      label424:
      localStringBuilder.append((String)localObject1);
      localObject1 = paramj.field_favProto.tPP;
      if ((localObject1 != null) && (((sy)localObject1).aWM() != 0)) {
        break label1354;
      }
      w.d("MicroMsg.FavProductItemParser", "klem toXml, product item empty");
      localObject1 = "";
      label461:
      localStringBuilder.append((String)localObject1);
      localObject1 = paramj.field_favProto.tPR;
      if ((localObject1 != null) && (((td)localObject1).aWM() != 0)) {
        break label1556;
      }
      w.d("MicroMsg.FavTVItemParser", "klem toXml, product item empty");
    }
    for (Object localObject1 = "";; localObject1 = ((StringBuffer)localObject2).toString())
    {
      localStringBuilder.append((String)localObject1);
      localStringBuffer1.append(localStringBuilder.toString());
      localStringBuffer1.append(s.a(paramj.field_tagProto));
      localStringBuffer1.append("</favitem>");
      paramj = localStringBuffer1.toString();
      GMTrace.o(6309038522368L, 47006);
      return paramj;
      if (paramj.field_type != 18) {
        break;
      }
      localStringBuilder.append("<version>1</version>");
      break;
      label569:
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append("<source");
      if (((ta)localObject1).tQa) {
        localStringBuffer2.append(" sourcetype='").append(((ta)localObject1).fwj).append("'");
      }
      if (((ta)localObject1).tQG) {
        localStringBuffer2.append(" sourceid='").append(((ta)localObject1).tQF).append("'");
      }
      localStringBuffer2.append(">");
      if (((ta)localObject1).tQb) {
        localStringBuffer2.append("<fromusr>").append(bg.RD(((ta)localObject1).fFB)).append("</fromusr>");
      }
      if (((ta)localObject1).tQc) {
        localStringBuffer2.append("<tousr>").append(bg.RD(((ta)localObject1).toUser)).append("</tousr>");
      }
      if (((ta)localObject1).tQg) {
        localStringBuffer2.append("<realchatname>").append(bg.RD(((ta)localObject1).tQf)).append("</realchatname>");
      }
      if (((ta)localObject1).tQh) {
        localStringBuffer2.append("<msgid>").append(((ta)localObject1).fJw).append("</msgid>");
      }
      if (((ta)localObject1).tQi) {
        localStringBuffer2.append("<eventid>").append(((ta)localObject1).fOu).append("</eventid>");
      }
      if (((ta)localObject1).tQj) {
        localStringBuffer2.append("<appid>").append(((ta)localObject1).appId).append("</appid>");
      }
      if (((ta)localObject1).tQk) {
        localStringBuffer2.append("<link>").append(bg.RD(((ta)localObject1).hNh)).append("</link>");
      }
      if (((ta)localObject1).tQn) {
        localStringBuffer2.append("<brandid>").append(bg.RD(((ta)localObject1).ftu)).append("</brandid>");
      }
      localStringBuffer2.append("</source>");
      localObject1 = localStringBuffer2.toString();
      break label337;
      label919:
      localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append("<locitem>");
      if (((sw)localObject1).tQv) {
        ((StringBuffer)localObject2).append("<label>").append(bg.RD(((sw)localObject1).label)).append("</label>");
      }
      if (((sw)localObject1).tQt) {
        ((StringBuffer)localObject2).append("<lat>").append(((sw)localObject1).lat).append("</lat>");
      }
      if (((sw)localObject1).tQs) {
        ((StringBuffer)localObject2).append("<lng>").append(((sw)localObject1).lng).append("</lng>");
      }
      if (((sw)localObject1).tQu) {
        ((StringBuffer)localObject2).append("<scale>").append(((sw)localObject1).fFj).append("</scale>");
      }
      if (((sw)localObject1).tQw) {
        ((StringBuffer)localObject2).append("<poiname>").append(((sw)localObject1).fJh).append("</poiname>");
      }
      ((StringBuffer)localObject2).append("</locitem>");
      localObject1 = ((StringBuffer)localObject2).toString();
      break label387;
      label1103:
      localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append("<weburlitem>");
      if (((tj)localObject1).tRd) {
        ((StringBuffer)localObject2).append("<clean_url>").append(bg.RD(((tj)localObject1).tRc)).append("</clean_url>");
      }
      if (((tj)localObject1).tOr) {
        ((StringBuffer)localObject2).append("<pagedesc>").append(bg.RD(((tj)localObject1).desc)).append("</pagedesc>");
      }
      if (((tj)localObject1).tQx) {
        ((StringBuffer)localObject2).append("<pagethumb_url>").append(bg.RD(((tj)localObject1).thumbUrl)).append("</pagethumb_url>");
      }
      if (((tj)localObject1).tOq) {
        ((StringBuffer)localObject2).append("<pagetitle>").append(bg.RD(((tj)localObject1).title)).append("</pagetitle>");
      }
      if (((tj)localObject1).tRf) {
        ((StringBuffer)localObject2).append("<opencache>").append(((tj)localObject1).tRe).append("</opencache>");
      }
      if (((tj)localObject1).tRg) {
        ((StringBuffer)localObject2).append("<contentattr>").append(((tj)localObject1).haU).append("</contentattr>");
      }
      if (((tj)localObject1).tPC) {
        ((StringBuffer)localObject2).append("<canvasPageXml>").append(((tj)localObject1).canvasPageXml).append("</canvasPageXml>");
      }
      ((StringBuffer)localObject2).append("</weburlitem>");
      localObject1 = ((StringBuffer)localObject2).toString();
      break label424;
      label1354:
      localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append("<productitem");
      if (((sy)localObject1).tQz) {
        ((StringBuffer)localObject2).append(" type='").append(((sy)localObject1).type).append("'");
      }
      ((StringBuffer)localObject2).append(">");
      if (((sy)localObject1).tOq) {
        ((StringBuffer)localObject2).append("<producttitle>").append(bg.RD(((sy)localObject1).title)).append("</producttitle>");
      }
      if (((sy)localObject1).tOr) {
        ((StringBuffer)localObject2).append("<productdesc>").append(bg.RD(((sy)localObject1).desc)).append("</productdesc>");
      }
      if (((sy)localObject1).tQx) {
        ((StringBuffer)localObject2).append("<productthumb_url>").append(bg.RD(((sy)localObject1).thumbUrl)).append("</productthumb_url>");
      }
      if (((sy)localObject1).tQy) {
        ((StringBuffer)localObject2).append("<productinfo>").append(bg.RD(((sy)localObject1).info)).append("</productinfo>");
      }
      ((StringBuffer)localObject2).append("</productitem>");
      localObject1 = ((StringBuffer)localObject2).toString();
      break label461;
      label1556:
      localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append("<tvitem>");
      if (((td)localObject1).tOq) {
        ((StringBuffer)localObject2).append("<tvtitle>").append(bg.RD(((td)localObject1).title)).append("</tvtitle>");
      }
      if (((td)localObject1).tOr) {
        ((StringBuffer)localObject2).append("<tvdesc>").append(bg.RD(((td)localObject1).desc)).append("</tvdesc>");
      }
      if (((td)localObject1).tQx) {
        ((StringBuffer)localObject2).append("<tvthumb_url>").append(bg.RD(((td)localObject1).thumbUrl)).append("</tvthumb_url>");
      }
      if (((td)localObject1).tQy) {
        ((StringBuffer)localObject2).append("<tvinfo>").append(bg.RD(((td)localObject1).info)).append("</tvinfo>");
      }
      ((StringBuffer)localObject2).append("</tvitem>");
    }
  }
  
  public final boolean awJ()
  {
    GMTrace.i(6306891038720L, 46990);
    if ((this.field_favProto.tPW & 0x1) != 0)
    {
      GMTrace.o(6306891038720L, 46990);
      return true;
    }
    GMTrace.o(6306891038720L, 46990);
    return false;
  }
  
  public final boolean awK()
  {
    GMTrace.i(6307025256448L, 46991);
    if ((this.field_favProto.tPW & 0x2) != 0)
    {
      GMTrace.o(6307025256448L, 46991);
      return true;
    }
    GMTrace.o(6307025256448L, 46991);
    return false;
  }
  
  public final boolean awL()
  {
    GMTrace.i(6307159474176L, 46992);
    if ((this.field_itemStatus == 1) || (this.field_itemStatus == 4) || (this.field_itemStatus == 9) || (this.field_itemStatus == 12) || (this.field_itemStatus == 13) || (this.field_itemStatus == 15) || (this.field_itemStatus == 17))
    {
      GMTrace.o(6307159474176L, 46992);
      return true;
    }
    GMTrace.o(6307159474176L, 46992);
    return false;
  }
  
  public final boolean awM()
  {
    GMTrace.i(6307293691904L, 46993);
    if ((this.field_itemStatus == 3) || (this.field_itemStatus == 6) || (this.field_itemStatus == 11) || (this.field_itemStatus == 14) || (this.field_itemStatus == 16) || (this.field_itemStatus == 18))
    {
      GMTrace.o(6307293691904L, 46993);
      return true;
    }
    GMTrace.o(6307293691904L, 46993);
    return false;
  }
  
  public final boolean awN()
  {
    GMTrace.i(6307562127360L, 46995);
    if (this.field_itemStatus == 8)
    {
      GMTrace.o(6307562127360L, 46995);
      return true;
    }
    GMTrace.o(6307562127360L, 46995);
    return false;
  }
  
  public final boolean awO()
  {
    GMTrace.i(6307830562816L, 46997);
    if ((this.field_itemStatus == 15) || (this.field_itemStatus == 16))
    {
      GMTrace.o(6307830562816L, 46997);
      return true;
    }
    GMTrace.o(6307830562816L, 46997);
    return false;
  }
  
  public final boolean awP()
  {
    GMTrace.i(6307964780544L, 46998);
    if ((this.field_itemStatus == 12) || (this.field_itemStatus == 13) || (this.field_itemStatus == 14))
    {
      GMTrace.o(6307964780544L, 46998);
      return true;
    }
    GMTrace.o(6307964780544L, 46998);
    return false;
  }
  
  public final j awQ()
  {
    GMTrace.i(6309172740096L, 47007);
    j localj = new j();
    localj.field_favProto = this.field_favProto;
    localj.field_sourceId = this.field_sourceId;
    localj.field_edittime = this.field_edittime;
    localj.field_ext = this.field_ext;
    localj.field_flag = this.field_flag;
    localj.field_fromUser = this.field_fromUser;
    localj.field_id = this.field_id;
    localj.field_itemStatus = this.field_itemStatus;
    localj.field_localId = this.field_localId;
    localj.field_localSeq = this.field_localSeq;
    localj.field_realChatName = this.field_realChatName;
    localj.field_tagProto = this.field_tagProto;
    localj.field_sourceCreateTime = this.field_sourceCreateTime;
    localj.field_updateSeq = this.field_updateSeq;
    localj.field_toUser = this.field_toUser;
    localj.field_updateTime = this.field_updateTime;
    localj.field_type = this.field_type;
    localj.field_xml = this.field_xml;
    localj.field_datatotalsize = this.field_datatotalsize;
    GMTrace.o(6309172740096L, 47007);
    return localj;
  }
  
  public final boolean isDone()
  {
    GMTrace.i(6307696345088L, 46996);
    if (this.field_itemStatus == 10)
    {
      GMTrace.o(6307696345088L, 46996);
      return true;
    }
    GMTrace.o(6307696345088L, 46996);
    return false;
  }
  
  public final boolean isDownloading()
  {
    GMTrace.i(6307427909632L, 46994);
    if (this.field_itemStatus == 7)
    {
      GMTrace.o(6307427909632L, 46994);
      return true;
    }
    GMTrace.o(6307427909632L, 46994);
    return false;
  }
  
  protected final c.a uC()
  {
    GMTrace.i(6306756820992L, 46989);
    c.a locala = gLR;
    GMTrace.o(6306756820992L, 46989);
    return locala;
  }
  
  public final j xa(String paramString)
  {
    GMTrace.i(6308098998272L, 46999);
    if ((paramString == null) || (paramString.equals("")))
    {
      w.e("MicroMsg.FavItemInfo", "klem, FavItemInfo xml null");
      GMTrace.o(6308098998272L, 46999);
      return this;
    }
    Map localMap = bh.p(paramString, "favitem");
    if (localMap == null)
    {
      w.e("MicroMsg.FavItemInfo", "klem, FavItemInfo maps null");
      GMTrace.o(6308098998272L, 46999);
      return this;
    }
    for (;;)
    {
      try
      {
        awI();
        sz localsz = this.field_favProto;
        localsz.Qd((String)localMap.get(".favitem.title"));
        localsz.Qe((String)localMap.get(".favitem.desc"));
        localsz.Qc((String)localMap.get(".favitem.remark"));
        localsz.ex(bg.getLong((String)localMap.get(".favitem.remark.$time"), 0L));
        localObject = (String)localMap.get(".favitem.edittime");
        localsz.zr(bg.getInt((String)localMap.get(".favitem.version"), 0));
        localsz.ey(bg.getLong((String)localObject, 0L));
        localsz.zq(bg.getInt((String)localMap.get(".favitem.ctrlflag"), -1));
        localObject = localsz.tQA;
        ((ta)localObject).zs(bg.getInt((String)localMap.get(".favitem.source" + ".$sourcetype"), 0));
        ((ta)localObject).Qh((String)localMap.get(".favitem.source" + ".$sourceid"));
        ((ta)localObject).Qf((String)localMap.get(".favitem.source" + ".fromusr"));
        ((ta)localObject).Qg((String)localMap.get(".favitem.source" + ".tousr"));
        ((ta)localObject).Qi((String)localMap.get(".favitem.source" + ".realchatname"));
        ((ta)localObject).ez(bg.getLong((String)localMap.get(".favitem.source" + ".createtime"), 0L));
        ((ta)localObject).Qj((String)localMap.get(".favitem.source" + ".msgid"));
        ((ta)localObject).Qk((String)localMap.get(".favitem.source" + ".eventid"));
        ((ta)localObject).Ql((String)localMap.get(".favitem.source" + ".appid"));
        ((ta)localObject).Qm((String)localMap.get(".favitem.source" + ".link"));
        ((ta)localObject).Qn((String)localMap.get(".favitem.source" + ".brandid"));
        n.a(paramString, localsz);
        paramString = localsz.tPL;
        if (!bg.mZ((String)localMap.get(".favitem.locitem" + ".label"))) {
          paramString.PW((String)localMap.get(".favitem.locitem" + ".label"));
        }
        if (!bg.mZ((String)localMap.get(".favitem.locitem" + ".poiname"))) {
          paramString.PX((String)localMap.get(".favitem.locitem" + ".poiname"));
        }
        localObject = (String)localMap.get(".favitem.locitem" + ".lng");
        if (!bg.mZ((String)localObject)) {
          paramString.p(bg.getDouble((String)localObject, 0.0D));
        }
        localObject = (String)localMap.get(".favitem.locitem" + ".lat");
        if (!bg.mZ((String)localObject)) {
          paramString.q(bg.getDouble((String)localObject, 0.0D));
        }
        localObject = (String)localMap.get(".favitem.locitem" + ".scale");
        if (!bg.mZ((String)localObject))
        {
          if (((String)localObject).indexOf('.') == -1) {
            continue;
          }
          paramString.zo(bg.getInt(((String)localObject).substring(0, ((String)localObject).indexOf('.')), -1));
        }
        paramString = localsz.tPN;
        paramString.Qu((String)localMap.get(".favitem.weburlitem" + ".clean_url"));
        paramString.Qt((String)localMap.get(".favitem.weburlitem" + ".pagedesc"));
        paramString.Qv((String)localMap.get(".favitem.weburlitem" + ".pagethumb_url"));
        paramString.Qs((String)localMap.get(".favitem.weburlitem" + ".pagetitle"));
        paramString.zt(bg.getInt((String)localMap.get(".favitem.weburlitem" + ".opencache"), 0));
        paramString.zu(bg.getInt((String)localMap.get(".favitem.weburlitem" + ".contentattr"), 0));
        paramString.Qw((String)localMap.get(".favitem.weburlitem" + ".canvasPageXml"));
        paramString = localsz.tPP;
        paramString.PY((String)localMap.get(".favitem.productitem" + ".producttitle"));
        paramString.PZ((String)localMap.get(".favitem.productitem" + ".productdesc"));
        paramString.Qa((String)localMap.get(".favitem.productitem" + ".productthumb_url"));
        paramString.Qb((String)localMap.get(".favitem.productitem" + ".productinfo"));
        paramString.zp(bg.getInt((String)localMap.get(".favitem.productitem" + ".$type"), 0));
        paramString = localsz.tPR;
        paramString.Qo((String)localMap.get(".favitem.tvitem" + ".tvtitle"));
        paramString.Qp((String)localMap.get(".favitem.tvitem" + ".tvdesc"));
        paramString.Qq((String)localMap.get(".favitem.tvitem" + ".tvthumb_url"));
        paramString.Qr((String)localMap.get(".favitem.tvitem" + ".tvinfo"));
        if (this.field_favProto.tQA != null)
        {
          paramString = this.field_favProto.tQA;
          this.field_sourceId = paramString.tQF;
          this.field_sourceType = paramString.fwj;
          this.field_fromUser = paramString.fFB;
          this.field_toUser = paramString.toUser;
        }
        this.field_edittime = this.field_favProto.tPY;
        s.a(localMap, this.field_tagProto);
      }
      catch (Exception paramString)
      {
        Object localObject;
        w.printErrStackTrace("MicroMsg.FavItemInfo", paramString, "", new Object[0]);
        w.e("MicroMsg.FavItemInfo", "klem , FavItemInfo exception:+%s", new Object[] { paramString.toString() });
        continue;
      }
      GMTrace.o(6308098998272L, 46999);
      return this;
      paramString.zo(bg.getInt((String)localObject, -1));
    }
  }
  
  public final void xb(String paramString)
  {
    GMTrace.i(6308233216000L, 47000);
    a locala = lOC;
    locala.xd("----dump favitem from[" + paramString + "] beg----");
    locala.xd("type: " + this.field_type);
    locala.xd("favId: " + this.field_id);
    locala.xd("localId: " + this.field_localId);
    locala.xd("itemStatus: " + this.field_itemStatus);
    locala.xd("localSeq: " + this.field_localSeq);
    locala.xd("updateSeq: " + this.field_updateSeq);
    locala.xd("ctrlFlag: " + this.field_flag);
    locala.xd("sourceId: " + this.field_sourceId);
    locala.xd("sourceType: " + this.field_sourceType);
    locala.xd("sourceCreateTime: " + this.field_sourceCreateTime);
    locala.xd("updateTime: " + this.field_updateTime);
    locala.xd("editTime: " + this.field_edittime);
    locala.xd("fromuser: " + this.field_fromUser);
    locala.xd("toUser: " + this.field_toUser);
    locala.xd("realChatName: " + this.field_realChatName);
    if (this.field_favProto != null)
    {
      locala.xd("remarktime: " + this.field_favProto.tPU);
      locala.xd("dataitemCount: " + this.field_favProto.tQC.size());
      if (this.field_favProto.tQA != null)
      {
        locala.xd(" ----source item----");
        paramString = this.field_favProto.tQA;
        locala.xd("  sourceType: " + paramString.fwj);
        locala.xd("  fromUser: " + paramString.fFB);
        locala.xd("  toUser: " + paramString.toUser);
        locala.xd("  sourceId: " + paramString.tQF);
        locala.xd("  realChatName: " + paramString.tQf);
        locala.xd("  createTime: " + paramString.hUw);
        locala.xd("  msgId: " + paramString.fJw);
        locala.xd("  eventId: " + paramString.fOu);
        locala.xd("  appId: " + paramString.appId);
        locala.xd("  link: " + paramString.hNh);
        locala.xd("  mediaId: " + paramString.tQl);
        locala.xd("  brandId: " + paramString.ftu);
      }
      paramString = this.field_favProto.tQC.iterator();
      int i = 0;
      while (paramString.hasNext())
      {
        sp localsp = (sp)paramString.next();
        locala.xd(" ----data item " + i + "----");
        locala.xd("  dataId: " + localsp.lUP);
        locala.xd("  dataType: " + localsp.aHe);
        locala.xd("  dataSouceId: " + localsp.tPf);
        locala.xd("  svrDataStatus: " + localsp.tPn);
        locala.xd("  cdnThumbUrl: " + localsp.haX);
        locala.xd("  cdnThumbKey: " + localsp.tOt);
        locala.xd("  cdnDataUrl: " + localsp.tOx);
        locala.xd("  cdnDataKey: " + localsp.tOz);
        locala.xd("  cdnEncryVer: " + localsp.tOB);
        locala.xd("  fullmd5: " + localsp.tOO);
        locala.xd("  head256md5: " + localsp.tOQ);
        locala.xd("  fullsize: " + localsp.tOS);
        locala.xd("  thumbMd5: " + localsp.tOZ);
        locala.xd("  thumbHead256md5: " + localsp.tPb);
        locala.xd("  thumbfullsize: " + localsp.tPd);
        locala.xd("  duration: " + localsp.duration);
        locala.xd("  datafmt: " + localsp.tOM);
        locala.xd("  streamWebUrl: " + localsp.tOE);
        locala.xd("  streamDataUrl: " + localsp.tOG);
        locala.xd("  streamLowBandUrl: " + localsp.tOI);
        locala.xd("  ext: " + localsp.fwl);
        if (localsp.tPr != null)
        {
          locala.xd("  remarktime: " + localsp.tPr.tPU);
          locala.xd("  ctrlflag: " + localsp.tPr.tPW);
          locala.xd("  edittime: " + localsp.tPr.tPY);
          if (localsp.tPr.tPJ != null)
          {
            locala.xd("   ----data source item----");
            sr localsr = localsp.tPr.tPJ;
            locala.xd("    sourceType: " + localsr.fwj);
            locala.xd("    fromUser: " + localsr.fFB);
            locala.xd("    toUser: " + localsr.toUser);
            locala.xd("    realChatName: " + localsr.tQf);
            locala.xd("    createTime: " + localsr.hUw);
            locala.xd("    msgId: " + localsr.fJw);
            locala.xd("    eventId: " + localsr.fOu);
            locala.xd("    appId: " + localsr.appId);
            locala.xd("    link: " + localsr.hNh);
            locala.xd("    mediaId: " + localsr.tQl);
            locala.xd("    brandId: " + localsr.ftu);
          }
          a("  ", locala, localsp.tPr.tPL);
          a("  ", locala, localsp.tPr.tPN);
          a("  ", locala, localsp.tPr.tPP);
          a("  ", locala, localsp.tPr.tPR);
        }
        i += 1;
      }
      a("", locala, this.field_favProto.tPL);
      a("", locala, this.field_favProto.tPN);
      a("", locala, this.field_favProto.tPP);
      a("", locala, this.field_favProto.tPR);
    }
    locala.xd("----dump favitem end----");
    GMTrace.o(6308233216000L, 47000);
  }
  
  public final boolean xc(String paramString)
  {
    GMTrace.i(6308904304640L, 47005);
    if (bg.mZ(paramString))
    {
      GMTrace.o(6308904304640L, 47005);
      return false;
    }
    Iterator localIterator = this.field_tagProto.tQM.iterator();
    while (localIterator.hasNext()) {
      if (paramString.equals((String)localIterator.next()))
      {
        GMTrace.o(6308904304640L, 47005);
        return false;
      }
    }
    this.field_tagProto.tQM.add(paramString);
    GMTrace.o(6308904304640L, 47005);
    return true;
  }
  
  private static abstract interface a
  {
    public abstract void xd(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */