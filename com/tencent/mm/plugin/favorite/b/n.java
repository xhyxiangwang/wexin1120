package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sr;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class n
{
  static void a(String paramString, sz paramsz)
  {
    GMTrace.i(16937606184960L, 126195);
    paramsz.tQC.clear();
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      Object localObject2;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("datalist");
        if (paramString == null) {
          break label3525;
        }
        NodeList localNodeList = paramString.item(0).getChildNodes();
        if ((localNodeList == null) || (localNodeList.getLength() <= 0)) {
          break label3525;
        }
        int j = localNodeList.getLength();
        i = 0;
        if (i >= j) {
          break label3525;
        }
        localObject1 = localNodeList.item(i);
        paramString = bh.b((Node)localObject1);
        localObject1 = ((Element)localObject1).getElementsByTagName("recordxml");
        if ((localObject1 == null) || (((NodeList)localObject1).getLength() <= 0)) {
          break label3539;
        }
        localObject1 = bh.b(((NodeList)localObject1).item(0).getFirstChild());
        if (!paramString.trim().startsWith("<dataitem")) {
          break label3534;
        }
        paramString = bh.p(paramString, "dataitem");
        if (paramString == null) {
          break label3545;
        }
        sp localsp = new sp();
        localsp.zk(bg.getInt((String)paramString.get(".dataitem" + ".$datatype"), 0));
        localsp.PF((String)paramString.get(".dataitem" + ".$datasourceid"));
        localsp.zl(bg.getInt((String)paramString.get(".dataitem" + ".$datastatus"), 0));
        localsp.Px((String)paramString.get(".dataitem" + ".datafmt"));
        localsp.Pn((String)paramString.get(".dataitem" + ".datatitle"));
        localsp.Po((String)paramString.get(".dataitem" + ".datadesc"));
        localsp.Pp((String)paramString.get(".dataitem" + ".cdn_thumburl"));
        localsp.Pq((String)paramString.get(".dataitem" + ".cdn_thumbkey"));
        localsp.zh(bg.getInt((String)paramString.get(".dataitem" + ".thumb_width"), 0));
        localsp.zi(bg.getInt((String)paramString.get(".dataitem" + ".thumb_height"), 0));
        localsp.Pr((String)paramString.get(".dataitem" + ".cdn_dataurl"));
        localsp.Ps((String)paramString.get(".dataitem" + ".cdn_datakey"));
        localObject2 = (String)paramString.get(".dataitem" + ".duration");
        if ((localObject2 != null) && (((String)localObject2).length() > 0)) {
          localsp.zj(bg.getInt((String)localObject2, 0));
        }
        localsp.Pu((String)paramString.get(".dataitem" + ".stream_dataurl"));
        localsp.Pv((String)paramString.get(".dataitem" + ".stream_lowbandurl"));
        localsp.Pt((String)paramString.get(".dataitem" + ".stream_weburl"));
        localsp.PM((String)paramString.get(".dataitem" + ".canvasPageXml"));
        localsp.Py((String)paramString.get(".dataitem" + ".fullmd5"));
        localsp.Pz((String)paramString.get(".dataitem" + ".head256md5"));
        localObject2 = (String)paramString.get(".dataitem" + ".fullsize");
        if (!bg.mZ((String)localObject2)) {
          localsp.et(bg.getInt((String)localObject2, 0));
        }
        localsp.Pw((String)paramString.get(".dataitem" + ".dataext"));
        localsp.PD((String)paramString.get(".dataitem" + ".thumbfullmd5"));
        localsp.PE((String)paramString.get(".dataitem" + ".thumbhead256md5"));
        localObject2 = (String)paramString.get(".dataitem" + ".thumbfullsize");
        if (!bg.mZ((String)localObject2)) {
          localsp.eu(bg.getInt((String)localObject2, 0));
        }
        localsp.PG((String)paramString.get(".dataitem" + ".stream_videoid"));
        localObject3 = (String)paramString.get(".dataitem" + ".$dataid");
        if (!bg.mZ((String)localObject3))
        {
          localObject2 = localObject3;
          if (((String)localObject3).length() >= 32) {}
        }
        else
        {
          localObject2 = x.aY(localsp.toString(), localsp.aHe);
        }
        localsp.PA((String)localObject2);
        localsp.PH((String)paramString.get(".dataitem" + ".datasrctitle"));
        localsp.PI((String)paramString.get(".dataitem" + ".datasrcname"));
        localsp.PJ((String)paramString.get(".dataitem" + ".datasrctime"));
        localsp.PL((String)paramString.get(".dataitem" + ".statextstr"));
        localsp.PK((String)paramString.get(".dataitem" + ".$htmlid"));
        localsp.zm(bg.getInt((String)paramString.get(".dataitem" + ".$dataillegaltype"), 0));
        if (localObject1 != null) {
          localsp.PN((String)localObject1);
        }
        localObject1 = new ss();
        ((ss)localObject1).hdc = bg.ap((String)paramString.get(".dataitem" + ".streamvideo.streamvideourl"), "");
        ((ss)localObject1).tQo = bg.RF((String)paramString.get(".dataitem" + ".streamvideo.streamvideototaltime"));
        ((ss)localObject1).hde = bg.ap((String)paramString.get(".dataitem" + ".streamvideo.streamvideotitle"), "");
        ((ss)localObject1).hdf = bg.ap((String)paramString.get(".dataitem" + ".streamvideo.streamvideowording"), "");
        ((ss)localObject1).hdg = bg.ap((String)paramString.get(".dataitem" + ".streamvideo.streamvideoweburl"), "");
        ((ss)localObject1).hdi = bg.ap((String)paramString.get(".dataitem" + ".streamvideo.streamvideoaduxinfo"), "");
        ((ss)localObject1).hdj = bg.ap((String)paramString.get(".dataitem" + ".streamvideo.streamvideopublishid"), "");
        localsp.a((ss)localObject1);
        localObject1 = new sq();
        localObject2 = ".dataitem" + ".dataitemsource";
        if (!paramString.containsKey(localObject2))
        {
          w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
          localObject3 = ".dataitem" + ".locitem";
          if (!paramString.containsKey(localObject3))
          {
            w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject3 });
            localObject2 = ".dataitem" + ".weburlitem";
            if (paramString.containsKey(localObject2)) {
              break label2878;
            }
            w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
            localObject2 = ".dataitem" + ".productitem";
            if (paramString.containsKey(localObject2)) {
              break label3157;
            }
            w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
            localObject2 = ".dataitem" + ".tvitem";
            if (paramString.containsKey(localObject2)) {
              break label3361;
            }
            w.v("MicroMsg.FavDataItemParser", "cur fav not contains %s", new Object[] { localObject2 });
            localsp.a((sq)localObject1);
            paramsz.tQC.add(localsp);
            break label3545;
          }
        }
        else
        {
          localObject3 = new sr();
          ((sr)localObject3).zn(bg.getInt((String)paramString.get((String)localObject2 + ".$sourcetype"), 0));
          ((sr)localObject3).PQ((String)paramString.get((String)localObject2 + ".$sourceid"));
          ((sr)localObject3).PO((String)paramString.get((String)localObject2 + ".fromusr"));
          ((sr)localObject3).PP((String)paramString.get((String)localObject2 + ".tousr"));
          ((sr)localObject3).PR((String)paramString.get((String)localObject2 + ".realchatname"));
          ((sr)localObject3).ew(bg.getLong((String)paramString.get((String)localObject2 + ".createtime"), 0L));
          ((sr)localObject3).PS((String)paramString.get((String)localObject2 + ".msgid"));
          ((sr)localObject3).fOu = ((String)paramString.get((String)localObject2 + ".eventid"));
          ((sr)localObject3).tQi = true;
          ((sr)localObject3).PT((String)paramString.get((String)localObject2 + ".appid"));
          ((sr)localObject3).PU((String)paramString.get((String)localObject2 + ".link"));
          ((sr)localObject3).PV((String)paramString.get((String)localObject2 + ".brandid"));
          ((sq)localObject1).c((sr)localObject3);
          continue;
        }
        localObject2 = new sw();
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.FavProtoItemParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
        GMTrace.o(16937606184960L, 126195);
        return;
      }
      if (!bg.mZ((String)paramString.get((String)localObject3 + ".label"))) {
        ((sw)localObject2).PW((String)paramString.get((String)localObject3 + ".label"));
      }
      if (!bg.mZ((String)paramString.get((String)localObject3 + ".poiname"))) {
        ((sw)localObject2).PX((String)paramString.get((String)localObject3 + ".poiname"));
      }
      String str = (String)paramString.get((String)localObject3 + ".lng");
      if (!bg.mZ(str)) {
        ((sw)localObject2).p(bg.getDouble(str, 0.0D));
      }
      str = (String)paramString.get((String)localObject3 + ".lat");
      if (!bg.mZ(str)) {
        ((sw)localObject2).q(bg.getDouble(str, 0.0D));
      }
      Object localObject3 = (String)paramString.get((String)localObject3 + ".scale");
      if (!bg.mZ((String)localObject3))
      {
        if (((String)localObject3).indexOf('.') == -1) {
          break label2863;
        }
        ((sw)localObject2).zo(bg.getInt(((String)localObject3).substring(0, ((String)localObject3).indexOf('.')), -1));
      }
      for (;;)
      {
        ((sq)localObject1).a((sw)localObject2);
        break;
        label2863:
        ((sw)localObject2).zo(bg.getInt((String)localObject3, -1));
      }
      label2878:
      localObject3 = new tj();
      ((tj)localObject3).Qu((String)paramString.get((String)localObject2 + ".clean_url"));
      ((tj)localObject3).Qt((String)paramString.get((String)localObject2 + ".pagedesc"));
      ((tj)localObject3).Qv((String)paramString.get((String)localObject2 + ".pagethumb_url"));
      ((tj)localObject3).Qs((String)paramString.get((String)localObject2 + ".pagetitle"));
      ((tj)localObject3).zt(bg.getInt((String)paramString.get((String)localObject2 + ".opencache"), 0));
      ((tj)localObject3).zu(bg.getInt((String)paramString.get((String)localObject2 + ".contentattr"), 0));
      ((tj)localObject3).Qw((String)paramString.get((String)localObject2 + ".canvasPageXml"));
      ((sq)localObject1).a((tj)localObject3);
      continue;
      label3157:
      localObject3 = new sy();
      ((sy)localObject3).PY((String)paramString.get((String)localObject2 + ".producttitle"));
      ((sy)localObject3).PZ((String)paramString.get((String)localObject2 + ".productdesc"));
      ((sy)localObject3).Qa((String)paramString.get((String)localObject2 + ".productthumb_url"));
      ((sy)localObject3).Qb((String)paramString.get((String)localObject2 + ".productinfo"));
      ((sy)localObject3).zp(bg.getInt((String)paramString.get((String)localObject2 + ".$type"), 0));
      ((sq)localObject1).a((sy)localObject3);
      continue;
      label3361:
      localObject3 = new td();
      ((td)localObject3).Qo((String)paramString.get((String)localObject2 + ".tvtitle"));
      ((td)localObject3).Qp((String)paramString.get((String)localObject2 + ".tvdesc"));
      ((td)localObject3).Qq((String)paramString.get((String)localObject2 + ".tvthumb_url"));
      ((td)localObject3).Qr((String)paramString.get((String)localObject2 + ".tvinfo"));
      ((sq)localObject1).a((td)localObject3);
      continue;
      label3525:
      GMTrace.o(16937606184960L, 126195);
      return;
      label3534:
      paramString = null;
      continue;
      label3539:
      localObject1 = null;
      continue;
      label3545:
      i += 1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */