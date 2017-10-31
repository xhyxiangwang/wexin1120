package com.tencent.mm.plugin.sns.i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  public static void a(sp paramsp, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8864678281216L, 66047);
    if (paramm != null) {
      a(paramsp, paramm.bjL());
    }
    GMTrace.o(8864678281216L, 66047);
  }
  
  private static void a(sp paramsp, bhc parambhc)
  {
    GMTrace.i(8864544063488L, 66046);
    if ((paramsp != null) && (parambhc != null) && (!bg.mZ(parambhc.qBT))) {
      paramsp.PL(parambhc.qBT);
    }
    GMTrace.o(8864544063488L, 66046);
  }
  
  public static boolean a(cd paramcd, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8863738757120L, 66040);
    if (paramm == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill sight favorite event fail, event is null or tlObj is null");
      paramcd.fwt.fwz = i.j.dWB;
      GMTrace.o(8863738757120L, 66040);
      return false;
    }
    sz localsz = new sz();
    Object localObject2 = new ta();
    bhc localbhc = paramm.bjL();
    amn localamn = (amn)localbhc.uyu.tKd.get(0);
    if ((paramm.uF(32)) && (localbhc.uyu.tKc == 15))
    {
      localbhc.uyz.hdi = paramm.bjJ().qhb;
      localbhc.uyz.hdj = localbhc.nas;
    }
    Object localObject1 = String.format("%s#%s", new Object[] { i.jdMethod_do(paramm.field_snsId), localamn.nas });
    ((ta)localObject2).Qf(paramm.field_userName);
    ((ta)localObject2).Qg(com.tencent.mm.x.m.zF());
    ((ta)localObject2).zs(2);
    ((ta)localObject2).ez(bg.Pp());
    ((ta)localObject2).Qk(paramm.bjM());
    ((ta)localObject2).Qh((String)localObject1);
    localsz.a((ta)localObject2);
    localObject2 = new sp();
    ((sp)localObject2).PF((String)localObject1);
    localObject1 = am.dt(ae.getAccSnsPath(), localamn.nas);
    Object localObject4 = i.j(localamn);
    Object localObject3 = i.e(localamn);
    if (bg.mZ(ap.a(paramm.bkg(), localamn)))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "this sight had no download finish, can not favorite.");
      paramcd.fwt.fwz = i.j.pQX;
      GMTrace.o(8863738757120L, 66040);
      return false;
    }
    if (!FileOp.aZ((String)localObject1 + (String)localObject4))
    {
      w.i("MicroMsg.Sns.GetFavDataSource", "fav error sight: " + FileOp.aZ(new StringBuilder().append((String)localObject1).append((String)localObject4).toString()) + " thumb:" + FileOp.aZ(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
      paramcd.fwt.fwz = i.j.pQX;
      GMTrace.o(8863738757120L, 66040);
      return false;
    }
    int j;
    int i;
    Bitmap localBitmap;
    if (!FileOp.aZ((String)localObject1 + (String)localObject3))
    {
      int k = 320;
      int m = 240;
      j = m;
      i = k;
      if (localamn.uhD != null)
      {
        j = m;
        i = k;
        if (localamn.uhD.uit > 0.0F)
        {
          j = m;
          i = k;
          if (localamn.uhD.uis > 0.0F)
          {
            i = (int)localamn.uhD.uis;
            j = (int)localamn.uhD.uit;
          }
        }
      }
      localBitmap = com.tencent.mm.plugin.sight.base.d.L((String)localObject1 + (String)localObject4, i, j);
      if (localBitmap == null)
      {
        w.i("MicroMsg.Sns.GetFavDataSource", "fav error on get thumb:" + FileOp.aZ(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
        paramcd.fwt.fwz = i.j.pQX;
        GMTrace.o(8863738757120L, 66040);
        return false;
      }
    }
    for (;;)
    {
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(localBitmap, 60, Bitmap.CompressFormat.JPEG, (String)localObject1 + (String)localObject3, true);
        ((sp)localObject2).PB((String)localObject1 + (String)localObject4);
        ((sp)localObject2).PC((String)localObject1 + (String)localObject3);
        if (bg.mZ(localamn.uhL))
        {
          localObject1 = localbhc.uyr;
          ((sp)localObject2).Pn((String)localObject1);
          ((sp)localObject2).PM(localbhc.qAC);
          if (!bg.mZ(localbhc.qAC))
          {
            localObject1 = bh.p(localbhc.qAC, "adxml");
            if (((Map)localObject1).size() > 0)
            {
              ((sp)localObject2).Pn(bg.ap((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareTitle"), ""));
              ((sp)localObject2).Po(bg.ap((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareDesc"), ""));
            }
          }
          if (!paramm.uF(32)) {
            break label1278;
          }
          localObject3 = paramm.bjH();
          localObject4 = new ss();
          if (!bg.mZ(localamn.uhL)) {
            break label1248;
          }
          localObject1 = localbhc.uyr;
          ((ss)localObject4).hde = ((String)localObject1);
          ((ss)localObject4).tQo = localamn.qTd;
          ((ss)localObject4).hdc = localamn.uhH;
          ((ss)localObject4).hdi = localbhc.uyz.hdi;
          ((ss)localObject4).hdj = localbhc.uyz.hdj;
          if (bg.mZ(((ss)localObject4).hdj)) {
            ((ss)localObject4).hdj = localbhc.nas;
          }
          if (!bg.mZ(localamn.uhK)) {
            break label1258;
          }
          localObject1 = localamn.uhA;
          ((ss)localObject4).hdh = ((String)localObject1);
          if ((localObject3 != null) && (((b)localObject3).qlE == 0))
          {
            ((ss)localObject4).hdg = ((b)localObject3).qlG;
            ((ss)localObject4).hdf = ((b)localObject3).qlF;
          }
          ((sp)localObject2).a((ss)localObject4);
          j = 15;
          i = 16;
          ((sp)localObject2).zk(j);
          localObject1 = com.tencent.mm.plugin.sight.base.d.FK(((sp)localObject2).tOV);
          if (localObject1 == null) {
            break label1268;
          }
          ((sp)localObject2).zj(((com.tencent.mm.plugin.sight.base.a)localObject1).bes());
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(localObject2);
          localsz.aw((LinkedList)localObject1);
          paramcd.fwt.fwv = localsz;
          paramcd.fwt.type = i;
          a((sp)localObject2, paramm);
          w.i("MicroMsg.Sns.GetFavDataSource", "fill event Info sight dataType %d eventType %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          GMTrace.o(8863738757120L, 66040);
          return true;
        }
      }
      catch (Exception paramm)
      {
        w.printErrStackTrace("MicroMsg.Sns.GetFavDataSource", paramm, "save bmp error %s", new Object[] { paramm.getMessage() });
        w.i("MicroMsg.Sns.GetFavDataSource", "fav error on save thumb:" + FileOp.aZ(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
        paramcd.fwt.fwz = i.j.pQX;
        GMTrace.o(8863738757120L, 66040);
        return false;
      }
      localObject1 = localamn.uhL;
      continue;
      label1248:
      localObject1 = localamn.uhL;
      continue;
      label1258:
      localObject1 = localamn.uhK;
      continue;
      label1268:
      ((sp)localObject2).zj(1);
      continue;
      label1278:
      i = 4;
      j = 4;
    }
  }
  
  public static boolean a(cd paramcd, com.tencent.mm.plugin.sns.storage.m paramm, String paramString)
  {
    GMTrace.i(8864275628032L, 66044);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or media id is null");
      paramcd.fwt.fwz = i.j.dWB;
      GMTrace.o(8864275628032L, 66044);
      return false;
    }
    if (paramm == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramcd.fwt.fwz = i.j.dWC;
      GMTrace.o(8864275628032L, 66044);
      return false;
    }
    amn localamn = ai.a(paramm, paramString);
    if (localamn == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
      paramcd.fwt.fwz = i.j.dWC;
      GMTrace.o(8864275628032L, 66044);
      return false;
    }
    String str = String.format("%s#%s", new Object[] { i.jdMethod_do(paramm.field_snsId), paramString });
    sz localsz = new sz();
    ta localta = new ta();
    sp localsp = new sp();
    w.i("MicroMsg.Sns.GetFavDataSource", "fav sns image, from %s", new Object[] { paramm.field_userName });
    localta.Qf(paramm.field_userName);
    localta.Qg(com.tencent.mm.x.m.zF());
    localta.zs(2);
    localta.ez(paramm.field_createTime * 1000L);
    localta.Qk(paramm.bjM());
    localta.Qh(str);
    localsp.PF(str);
    localsp.PB(am.dt(ae.getAccSnsPath(), paramString) + i.l(localamn));
    if (paramm.bjL() != null)
    {
      localsp.PM(paramm.bjL().qAC);
      if (!bg.mZ(paramm.bjL().qAC))
      {
        paramString = bh.p(paramm.bjL().qAC, "adxml");
        if (paramString.size() > 0)
        {
          localsp.Pn(bg.ap((String)paramString.get(".adxml.adCanvasInfo.shareTitle"), ""));
          localsp.Po(bg.ap((String)paramString.get(".adxml.adCanvasInfo.shareDesc"), ""));
        }
      }
    }
    a(localsp, paramm);
    paramString = am.dt(ae.getAccSnsPath(), localamn.nas) + i.e(localamn);
    if ((!FileOp.aZ(localsp.tOV)) && (paramm.field_userName.endsWith(ae.bgV())))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
      paramcd.fwt.fwz = i.j.dWC;
      GMTrace.o(8864275628032L, 66044);
      return false;
    }
    if (FileOp.aZ(paramString)) {
      localsp.PC(paramString);
    }
    for (;;)
    {
      localsp.zk(2);
      localsz.tQC.add(localsp);
      localsz.a(localta);
      paramcd.fwt.fwv = localsz;
      paramcd.fwt.type = 2;
      GMTrace.o(8864275628032L, 66044);
      return true;
      localsp.kl(true);
      localsp.Pw(localamn.uhA);
      paramm = new tj();
      paramm.Qv(localamn.uhA);
      localsz.b(paramm);
    }
  }
  
  public static boolean a(cd paramcd, String paramString, CharSequence paramCharSequence)
  {
    GMTrace.i(8864141410304L, 66043);
    if ((u.HX(paramString)) || (paramCharSequence == null))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or text is null");
      paramcd.fwt.fwz = i.j.dWB;
      GMTrace.o(8864141410304L, 66043);
      return false;
    }
    if (ae.bgY())
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramcd.fwt.fwz = i.j.pQY;
      GMTrace.o(8864141410304L, 66043);
      return false;
    }
    paramString = ae.bhp().HA(paramString);
    if (paramString == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramcd.fwt.fwz = i.j.dWC;
      GMTrace.o(8864141410304L, 66043);
      return false;
    }
    if (0L == paramString.field_snsId)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo.field_snsId is 0");
      paramcd.fwt.fwz = i.j.dWA;
      GMTrace.o(8864141410304L, 66043);
      return false;
    }
    String str = String.format("%s#0", new Object[] { i.jdMethod_do(paramString.field_snsId) });
    sz localsz = new sz();
    ta localta = new ta();
    w.i("MicroMsg.Sns.GetFavDataSource", "fav sns text, from %s", new Object[] { paramString.field_userName });
    localta.Qf(paramString.field_userName);
    localta.Qg(com.tencent.mm.x.m.zF());
    localta.zs(2);
    localta.ez(paramString.field_createTime * 1000L);
    localta.Qk(paramString.bjM());
    localta.Qh(str);
    localsz.a(localta);
    paramcd.fwt.fwv = localsz;
    paramcd.fwt.desc = paramCharSequence.toString();
    paramcd.fwt.type = 1;
    GMTrace.o(8864141410304L, 66043);
    return true;
  }
  
  public static boolean a(cd paramcd, String paramString1, String paramString2)
  {
    GMTrace.i(8864007192576L, 66042);
    if ((paramcd == null) || (!u.HW(paramString2)) || (paramString1 == null))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
      if (paramcd != null) {
        paramcd.fwt.fwz = i.j.dWB;
      }
      GMTrace.o(8864007192576L, 66042);
      return false;
    }
    if (ae.bgY())
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramcd.fwt.fwz = i.j.pQY;
      GMTrace.o(8864007192576L, 66042);
      return false;
    }
    Object localObject1 = h.HA(paramString2);
    if (localObject1 == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramcd.fwt.fwz = i.j.dWC;
      GMTrace.o(8864007192576L, 66042);
      return false;
    }
    paramString2 = "0";
    Object localObject2 = ai.a((com.tencent.mm.plugin.sns.storage.m)localObject1, 0);
    if (localObject2 != null) {
      paramString2 = ((amn)localObject2).nas;
    }
    Object localObject3 = String.format("%s#%s", new Object[] { i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId), paramString2 });
    paramString2 = new sz();
    ta localta = new ta();
    w.i("MicroMsg.Sns.GetFavDataSource", "fav sns url, from %s", new Object[] { ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName });
    localta.Qf(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
    localta.Qg(com.tencent.mm.x.m.zF());
    localta.zs(2);
    localta.ez(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_createTime * 1000L);
    localta.Qk(((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
    localta.Qh((String)localObject3);
    localta.Qm(paramString1);
    paramString1 = new sp();
    paramString1.PF((String)localObject3);
    if (localObject2 != null)
    {
      localObject3 = am.dt(ae.getAccSnsPath(), ((amn)localObject2).nas) + i.e((amn)localObject2);
      if (FileOp.aZ((String)localObject3)) {
        paramString1.PC((String)localObject3);
      }
    }
    for (;;)
    {
      paramString1.zk(5);
      localObject1 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
      paramString1.Pn(((bhc)localObject1).uyu.fuw);
      paramString1.Po(((bhc)localObject1).uyu.mCK);
      paramString1.PM(((bhc)localObject1).qAC);
      if (!bg.mZ(((bhc)localObject1).qAC))
      {
        localObject2 = bh.p(((bhc)localObject1).qAC, "adxml");
        if (((Map)localObject2).size() > 0)
        {
          paramString1.Pn(bg.ap((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareTitle"), ""));
          paramString1.Po(bg.ap((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareDesc"), ""));
        }
      }
      a(paramString1, (bhc)localObject1);
      paramString1.kk(true);
      paramString2.tQC.add(paramString1);
      paramString1 = new tj();
      paramString1.zu(((bhc)localObject1).haU);
      paramString2.b(paramString1);
      paramString2.a(localta);
      paramcd.fwt.fwv = paramString2;
      paramcd.fwt.desc = ((bhc)localObject1).uyu.fuw;
      paramcd.fwt.type = 5;
      GMTrace.o(8864007192576L, 66042);
      return true;
      paramString1.kl(true);
      paramString1.Pw(((amn)localObject2).uhA);
      localObject3 = new tj();
      ((tj)localObject3).Qv(((amn)localObject2).uhA);
      paramString2.b((tj)localObject3);
      continue;
      paramString1.kl(true);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */