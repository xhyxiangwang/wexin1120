package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sr;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class f
{
  public static String as(List<sp> paramList)
  {
    GMTrace.i(6264746672128L, 46676);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.v("MicroMsg.FavDataItemParser", "klem toXml data list empty");
      GMTrace.o(6264746672128L, 46676);
      return "";
    }
    int j = paramList.size();
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("<datalist count='").append(j).append("'>");
    int i = 0;
    if (i < j)
    {
      Object localObject1 = (sp)paramList.get(i);
      localStringBuffer.append("<dataitem ");
      if (((sp)localObject1).tOL) {
        localStringBuffer.append("datatype='").append(((sp)localObject1).aHe).append("'");
      }
      if (((sp)localObject1).tPo) {
        localStringBuffer.append(" datastatus='").append(((sp)localObject1).tPn).append("'");
      }
      if (((sp)localObject1).tOU) {
        localStringBuffer.append(" dataid='").append(((sp)localObject1).lUP).append("'");
      }
      if (((sp)localObject1).tPA) {
        localStringBuffer.append(" htmlid='").append(bg.RD(((sp)localObject1).tPz)).append("'");
      }
      if (((sp)localObject1).tPG) {
        localStringBuffer.append(" dataillegaltype='").append(((sp)localObject1).tPF).append("'");
      }
      if (((sp)localObject1).tPg) {
        localStringBuffer.append(" datasourceid='").append(((sp)localObject1).tPf).append("'");
      }
      localStringBuffer.append(">");
      if (((sp)localObject1).tON) {
        localStringBuffer.append("<datafmt>").append(((sp)localObject1).tOM).append("</datafmt>");
      }
      if (((sp)localObject1).tOq) {
        localStringBuffer.append("<datatitle>").append(bg.RD(((sp)localObject1).title)).append("</datatitle>");
      }
      if (((sp)localObject1).tOr) {
        localStringBuffer.append("<datadesc>").append(bg.RD(((sp)localObject1).desc)).append("</datadesc>");
      }
      if (((sp)localObject1).tOs) {
        localStringBuffer.append("<cdn_thumburl>").append(bg.RD(((sp)localObject1).haX)).append("</cdn_thumburl>");
      }
      if (((sp)localObject1).tOv) {
        localStringBuffer.append("<thumb_width>").append(((sp)localObject1).hbc).append("</thumb_width>");
      }
      if (((sp)localObject1).tOw) {
        localStringBuffer.append("<thumb_height>").append(((sp)localObject1).hbb).append("</thumb_height>");
      }
      if (((sp)localObject1).tOy) {
        localStringBuffer.append("<cdn_dataurl>").append(bg.RD(((sp)localObject1).tOx)).append("</cdn_dataurl>");
      }
      if (((sp)localObject1).tOu) {
        localStringBuffer.append("<cdn_thumbkey>").append(bg.RD(((sp)localObject1).tOt)).append("</cdn_thumbkey>");
      }
      if (((sp)localObject1).tOA) {
        localStringBuffer.append("<cdn_datakey>").append(bg.RD(((sp)localObject1).tOz)).append("</cdn_datakey>");
      }
      if (((sp)localObject1).tOC) {
        localStringBuffer.append("<cdn_encryver>").append(((sp)localObject1).tOB).append("</cdn_encryver>");
      }
      if (((sp)localObject1).tOD) {
        localStringBuffer.append("<duration>").append(((sp)localObject1).duration).append("</duration>");
      }
      if (((sp)localObject1).tOF) {
        localStringBuffer.append("<stream_weburl>").append(bg.RD(((sp)localObject1).tOE)).append("</stream_weburl>");
      }
      if (((sp)localObject1).tOH) {
        localStringBuffer.append("<stream_dataurl>").append(bg.RD(((sp)localObject1).tOG)).append("</stream_dataurl>");
      }
      if (((sp)localObject1).tOJ) {
        localStringBuffer.append("<stream_lowbandurl>").append(bg.RD(((sp)localObject1).tOI)).append("</stream_lowbandurl>");
      }
      if (((sp)localObject1).tOK) {
        localStringBuffer.append("<dataext>").append(bg.RD(((sp)localObject1).fwl)).append("</dataext>");
      }
      if (((sp)localObject1).tOP) {
        localStringBuffer.append("<fullmd5>").append(((sp)localObject1).tOO).append("</fullmd5>");
      }
      if (((sp)localObject1).tOR) {
        localStringBuffer.append("<head256md5>").append(((sp)localObject1).tOQ).append("</head256md5>");
      }
      if (((sp)localObject1).tOT) {
        localStringBuffer.append("<fullsize>").append(((sp)localObject1).tOS).append("</fullsize>");
      }
      if (((sp)localObject1).tPa) {
        localStringBuffer.append("<thumbfullmd5>").append(((sp)localObject1).tOZ).append("</thumbfullmd5>");
      }
      if (((sp)localObject1).tPc) {
        localStringBuffer.append("<thumbhead256md5>").append(((sp)localObject1).tPb).append("</thumbhead256md5>");
      }
      if (((sp)localObject1).tPe) {
        localStringBuffer.append("<thumbfullsize>").append(((sp)localObject1).tPd).append("</thumbfullsize>");
      }
      if (((sp)localObject1).tPi) {
        localStringBuffer.append("<stream_videoid>").append(bg.RD(((sp)localObject1).tPh)).append("</stream_videoid>");
      }
      if (((sp)localObject1).tPq) {
        localStringBuffer.append("<datasrctitle>").append(bg.RD(((sp)localObject1).tPp)).append("</datasrctitle>");
      }
      if (((sp)localObject1).tPu) {
        localStringBuffer.append("<datasrcname>").append(bg.RD(((sp)localObject1).tPt)).append("</datasrcname>");
      }
      if (((sp)localObject1).tPw) {
        localStringBuffer.append("<datasrctime>").append(bg.RD(((sp)localObject1).tPv)).append("</datasrctime>");
      }
      if ((((sp)localObject1).tPC) && ((((sp)localObject1).tPr == null) || (((sp)localObject1).tPr.tPN == null) || (((sp)localObject1).tPr.tPN.aWM() == 0))) {
        localStringBuffer.append("<canvasPageXml>").append(bg.RD(((sp)localObject1).canvasPageXml)).append("</canvasPageXml>");
      }
      if (((sp)localObject1).tPB) {
        localStringBuffer.append("<statextstr>").append(bg.RD(((sp)localObject1).fMi)).append("</statextstr>");
      }
      if (((sp)localObject1).tPI) {
        localStringBuffer.append("<recordxml>").append(((sp)localObject1).tPH).append("</recordxml>");
      }
      Object localObject2 = ((sp)localObject1).tPx;
      if (localObject2 != null)
      {
        localStringBuffer.append("<streamvideo>");
        localStringBuffer.append("<streamvideourl>").append(bg.RD(((ss)localObject2).hdc)).append("</streamvideourl>");
        localStringBuffer.append("<streamvideototaltime>").append(((ss)localObject2).tQo).append("</streamvideototaltime>");
        localStringBuffer.append("<streamvideotitle>").append(bg.RD(((ss)localObject2).hde)).append("</streamvideotitle>");
        localStringBuffer.append("<streamvideowording>").append(bg.RD(((ss)localObject2).hdf)).append("</streamvideowording>");
        localStringBuffer.append("<streamvideoweburl>").append(bg.RD(((ss)localObject2).hdg)).append("</streamvideoweburl>");
        localStringBuffer.append("<streamvideoaduxinfo>").append(bg.RD(((ss)localObject2).hdi)).append("</streamvideoaduxinfo>");
        localStringBuffer.append("<streamvideopublishid>").append(bg.RD(((ss)localObject2).hdj)).append("</streamvideopublishid>");
        localStringBuffer.append("</streamvideo>");
      }
      localObject2 = ((sp)localObject1).tPr;
      if ((localObject2 == null) || (((sq)localObject2).tPJ == null) || (((sq)localObject2).tPJ.aWM() == 0))
      {
        w.v("MicroMsg.FavDataItemParser", "klem toXml, data source item empty");
        label1408:
        localObject2 = ((sp)localObject1).tPr;
        if ((localObject2 != null) && (((sq)localObject2).tPL != null) && (((sq)localObject2).tPL.aWM() != 0)) {
          break label1925;
        }
        w.v("MicroMsg.FavDataItemParser", "klem toXml, loc item empty");
        label1447:
        localObject2 = ((sp)localObject1).tPr;
        if ((localObject2 != null) && (((sq)localObject2).tPN != null) && (((sq)localObject2).tPN.aWM() != 0)) {
          break label2104;
        }
        w.v("MicroMsg.FavDataItemParser", "klem toXml, url item empty");
        label1486:
        localObject2 = ((sp)localObject1).tPr;
        if ((localObject2 != null) && (((sq)localObject2).tPP != null) && (((sq)localObject2).tPP.aWM() != 0)) {
          break label2355;
        }
        w.v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
        label1525:
        localObject1 = ((sp)localObject1).tPr;
        if ((localObject1 != null) && (((sq)localObject1).tPR != null) && (((sq)localObject1).tPR.aWM() != 0)) {
          break label2549;
        }
        w.v("MicroMsg.FavDataItemParser", "klem toXml, product item empty");
      }
      for (;;)
      {
        localStringBuffer.append("</dataitem>");
        i += 1;
        break;
        localObject2 = ((sq)localObject2).tPJ;
        localStringBuffer.append("<dataitemsource");
        if (((sr)localObject2).tQa) {
          localStringBuffer.append(" sourcetype='").append(((sr)localObject2).fwj).append("'");
        }
        if (((sr)localObject2).tQe) {
          localStringBuffer.append(" sourceid='").append(((sr)localObject2).tQd).append("'");
        }
        localStringBuffer.append(">");
        if (((sr)localObject2).tQb) {
          localStringBuffer.append("<fromusr>").append(bg.RD(((sr)localObject2).fFB)).append("</fromusr>");
        }
        if (((sr)localObject2).tQc) {
          localStringBuffer.append("<tousr>").append(bg.RD(((sr)localObject2).toUser)).append("</tousr>");
        }
        if (((sr)localObject2).tQg) {
          localStringBuffer.append("<realchatname>").append(bg.RD(((sr)localObject2).tQf)).append("</realchatname>");
        }
        if (((sr)localObject2).tQh) {
          localStringBuffer.append("<msgid>").append(((sr)localObject2).fJw).append("</msgid>");
        }
        if (((sr)localObject2).tQi) {
          localStringBuffer.append("<eventid>").append(((sr)localObject2).fOu).append("</eventid>");
        }
        if (((sr)localObject2).tQj) {
          localStringBuffer.append("<appid>").append(((sr)localObject2).appId).append("</appid>");
        }
        if (((sr)localObject2).tQk) {
          localStringBuffer.append("<link>").append(bg.RD(((sr)localObject2).hNh)).append("</link>");
        }
        if (((sr)localObject2).tQn) {
          localStringBuffer.append("<brandid>").append(bg.RD(((sr)localObject2).ftu)).append("</brandid>");
        }
        localStringBuffer.append("</dataitemsource>");
        break label1408;
        label1925:
        localObject2 = ((sq)localObject2).tPL;
        localStringBuffer.append("<locitem>");
        if (((sw)localObject2).tQv) {
          localStringBuffer.append("<label>").append(bg.RD(((sw)localObject2).label)).append("</label>");
        }
        if (((sw)localObject2).tQt) {
          localStringBuffer.append("<lat>").append(((sw)localObject2).lat).append("</lat>");
        }
        if (((sw)localObject2).tQs) {
          localStringBuffer.append("<lng>").append(((sw)localObject2).lng).append("</lng>");
        }
        if (((sw)localObject2).tQu) {
          localStringBuffer.append("<scale>").append(((sw)localObject2).fFj).append("</scale>");
        }
        if (((sw)localObject2).tQw) {
          localStringBuffer.append("<poiname>").append(((sw)localObject2).fJh).append("</poiname>");
        }
        localStringBuffer.append("</locitem>");
        break label1447;
        label2104:
        localObject2 = ((sq)localObject2).tPN;
        localStringBuffer.append("<weburlitem>");
        if (((tj)localObject2).tRd) {
          localStringBuffer.append("<clean_url>").append(bg.RD(((tj)localObject2).tRc)).append("</clean_url>");
        }
        if (((tj)localObject2).tOr) {
          localStringBuffer.append("<pagedesc>").append(bg.RD(((tj)localObject2).desc)).append("</pagedesc>");
        }
        if (((tj)localObject2).tQx) {
          localStringBuffer.append("<pagethumb_url>").append(bg.RD(((tj)localObject2).thumbUrl)).append("</pagethumb_url>");
        }
        if (((tj)localObject2).tOq) {
          localStringBuffer.append("<pagetitle>").append(bg.RD(((tj)localObject2).title)).append("</pagetitle>");
        }
        if (((tj)localObject2).tRf) {
          localStringBuffer.append("<opencache>").append(((tj)localObject2).tRe).append("</opencache>");
        }
        if (((tj)localObject2).tRg) {
          localStringBuffer.append("<contentattr>").append(((tj)localObject2).haU).append("</contentattr>");
        }
        if (((tj)localObject2).tPC) {
          localStringBuffer.append("<canvasPageXml>").append(bg.RD(((tj)localObject2).canvasPageXml)).append("</canvasPageXml>");
        }
        localStringBuffer.append("</weburlitem>");
        break label1486;
        label2355:
        localObject2 = ((sq)localObject2).tPP;
        localStringBuffer.append("<productitem");
        if (((sy)localObject2).tQz) {
          localStringBuffer.append(" type='").append(((sy)localObject2).type).append("'");
        }
        localStringBuffer.append(">");
        if (((sy)localObject2).tOq) {
          localStringBuffer.append("<producttitle>").append(bg.RD(((sy)localObject2).title)).append("</producttitle>");
        }
        if (((sy)localObject2).tOr) {
          localStringBuffer.append("<productdesc>").append(bg.RD(((sy)localObject2).desc)).append("</productdesc>");
        }
        if (((sy)localObject2).tQx) {
          localStringBuffer.append("<productthumb_url>").append(bg.RD(((sy)localObject2).thumbUrl)).append("</productthumb_url>");
        }
        if (((sy)localObject2).tQy) {
          localStringBuffer.append("<productinfo>").append(bg.RD(((sy)localObject2).info)).append("</productinfo>");
        }
        localStringBuffer.append("</productitem>");
        break label1525;
        label2549:
        localObject1 = ((sq)localObject1).tPR;
        localStringBuffer.append("<tvitem>");
        if (((td)localObject1).tOq) {
          localStringBuffer.append("<tvtitle>").append(bg.RD(((td)localObject1).title)).append("</tvtitle>");
        }
        if (((td)localObject1).tOr) {
          localStringBuffer.append("<tvdesc>").append(bg.RD(((td)localObject1).desc)).append("</tvdesc>");
        }
        if (((td)localObject1).tQx) {
          localStringBuffer.append("<tvthumb_url>").append(bg.RD(((td)localObject1).thumbUrl)).append("</tvthumb_url>");
        }
        if (((td)localObject1).tQy) {
          localStringBuffer.append("<tvinfo>").append(bg.RD(((td)localObject1).info)).append("</tvinfo>");
        }
        localStringBuffer.append("</tvitem>");
      }
    }
    localStringBuffer.append("</datalist>");
    paramList = localStringBuffer.toString();
    GMTrace.o(6264746672128L, 46676);
    return paramList;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */