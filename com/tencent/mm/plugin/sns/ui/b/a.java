package com.tencent.mm.plugin.sns.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.MenuItem;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.cd.a;
import com.tencent.mm.g.a.cd.b;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.a.pv.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.plugin.sns.ui.FlipView;
import com.tencent.mm.plugin.sns.ui.SnsBrowseUI;
import com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.ap;
import com.tencent.mm.plugin.sns.ui.as;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bfu;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.td;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.x.o;
import com.tencent.mm.x.q.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
  implements com.tencent.mm.ac.e, o.d
{
  private Activity activity;
  private ClipboardManager lWu;
  private View qUY;
  private String qUZ;
  private bhc qVa;
  private com.tencent.mm.ui.base.q qxY;
  private ad qyj;
  private int scene;
  
  public a(Activity paramActivity, int paramInt, ad paramad)
  {
    GMTrace.i(8644963860480L, 64410);
    this.activity = paramActivity;
    this.scene = paramInt;
    this.lWu = ((ClipboardManager)paramActivity.getSystemService("clipboard"));
    this.qyj = paramad;
    GMTrace.o(8644963860480L, 64410);
  }
  
  private void Iz(String paramString)
  {
    GMTrace.i(8645500731392L, 64414);
    Object localObject2 = ae.bhp().HA(paramString);
    if (localObject2 == null)
    {
      GMTrace.o(8645500731392L, 64414);
      return;
    }
    if (((com.tencent.mm.plugin.sns.storage.m)localObject2).uF(32))
    {
      ((com.tencent.mm.plugin.sns.storage.m)localObject2).bjJ();
      localObject1 = ((com.tencent.mm.plugin.sns.storage.m)localObject2).bkr();
      str1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject2);
      if (!bg.mZ(str1)) {
        ((com.tencent.mm.plugin.sns.storage.e)localObject1).field_adxml = str1;
      }
    }
    for (Object localObject1 = ((com.tencent.mm.plugin.sns.storage.e)localObject1).field_adxml;; localObject1 = ((com.tencent.mm.plugin.sns.storage.m)localObject2).bjL().qAC)
    {
      localObject3 = bh.p((String)localObject1, "adxml");
      if (localObject3 != null) {
        break;
      }
      GMTrace.o(8645500731392L, 64414);
      return;
    }
    if (!((Map)localObject3).containsKey(".adxml.adCanvasInfo"))
    {
      com.tencent.mm.ui.base.h.h(this.activity, i.j.dWK, 0);
      GMTrace.o(8645500731392L, 64414);
      return;
    }
    localObject2 = com.tencent.mm.x.q.gi(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_snsId);
    String str1 = bg.ap((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareTitle"), "");
    String str2 = bg.ap((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareWebUrl"), "");
    String str3 = bg.ap((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareDesc"), "");
    Object localObject3 = new cd();
    pv localpv = new pv();
    localpv.fNF.fNI = paramString;
    localpv.fNF.fNJ = ((cd)localObject3);
    localpv.fNF.url = str2;
    com.tencent.mm.sdk.b.a.uLm.m(localpv);
    if (!localpv.fNG.fwc)
    {
      if (((cd)localObject3).fwt.fwz == 0) {
        ((cd)localObject3).fwt.fwz = i.j.dWJ;
      }
      com.tencent.mm.ui.base.h.h(this.activity, ((cd)localObject3).fwt.fwz, 0);
      GMTrace.o(8645500731392L, 64414);
      return;
    }
    ((cd)localObject3).fwt.fwy = ((String)localObject2);
    ((cd)localObject3).fwt.title = str1;
    ((cd)localObject3).fwt.desc = str3;
    paramString = ((cd)localObject3).fwt.fwv;
    if ((paramString != null) && (paramString.tQC != null) && (paramString.tQC.size() > 0) && (paramString.tQC.get(0) != null))
    {
      ((sp)paramString.tQC.get(0)).PM((String)localObject1);
      if (bg.mZ(((sp)paramString.tQC.get(0)).title)) {
        ((sp)paramString.tQC.get(0)).Pn(((cd)localObject3).fwt.title);
      }
      if (bg.mZ(((sp)paramString.tQC.get(0)).desc)) {
        ((sp)paramString.tQC.get(0)).Po(((cd)localObject3).fwt.desc);
      }
    }
    ((cd)localObject3).fwt.activity = this.activity;
    ((cd)localObject3).fwt.fwA = 28;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject3);
    GMTrace.o(8645500731392L, 64414);
  }
  
  private String bob()
  {
    GMTrace.i(8645232295936L, 64412);
    if ((this.qUY != null) && ((this.qUY.getTag() instanceof as)) && (((as)this.qUY.getTag()).bnr()))
    {
      Object localObject = ao.GJ(ae.bhp().HA(this.qUZ).bjM());
      if (localObject != null)
      {
        localObject = ((ao.b)localObject).result;
        GMTrace.o(8645232295936L, 64412);
        return (String)localObject;
      }
    }
    GMTrace.o(8645232295936L, 64412);
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8645769166848L, 64416);
    w.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "onSceneEnd");
    if ((this.qxY != null) && (this.qxY.isShowing())) {
      this.qxY.dismiss();
    }
    GMTrace.o(8645769166848L, 64416);
  }
  
  public final void a(View paramView, String paramString, bhc parambhc)
  {
    GMTrace.i(8645098078208L, 64411);
    this.qUY = paramView;
    this.qUZ = paramString;
    this.qVa = parambhc;
    GMTrace.o(8645098078208L, 64411);
  }
  
  public final void c(final MenuItem paramMenuItem, int paramInt)
  {
    GMTrace.i(8645366513664L, 64413);
    if (this.qUY == null)
    {
      GMTrace.o(8645366513664L, 64413);
      return;
    }
    Object localObject3;
    Object localObject4;
    label677:
    label865:
    Object localObject7;
    Object localObject5;
    Object localObject6;
    label1485:
    int i;
    long l;
    label2568:
    Object localObject2;
    switch (paramMenuItem.getItemId())
    {
    case 6: 
    default: 
    case 0: 
    case 1: 
    case 2: 
    case 4: 
    case 18: 
    case 19: 
    case 3: 
    case 5: 
    case 9: 
    case 7: 
    case 8: 
    case 10: 
    case 12: 
    case 11: 
    case 13: 
    case 14: 
    case 15: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                GMTrace.o(8645366513664L, 64413);
                return;
                Object localObject1 = bob();
                paramMenuItem = (MenuItem)localObject1;
                if (bg.mZ((String)localObject1)) {
                  paramMenuItem = this.qVa.uyr;
                }
                this.lWu.setText(paramMenuItem);
                com.tencent.mm.ui.base.h.bl(this.activity, this.activity.getString(i.j.duV));
                com.tencent.mm.plugin.secinforeport.a.a.poO.c(2, this.qVa.nas, bg.Rv(paramMenuItem));
                GMTrace.o(8645366513664L, 64413);
                return;
                localObject1 = bob();
                paramMenuItem = (MenuItem)localObject1;
                if (bg.mZ((String)localObject1)) {
                  paramMenuItem = this.qVa.uyr;
                }
                this.qyj.bgU().dy(this.qUZ, this.qVa.nas);
                localObject1 = new cd();
                com.tencent.mm.plugin.sns.i.a.a((cd)localObject1, this.qUZ, paramMenuItem);
                ((cd)localObject1).fwt.activity = this.activity;
                ((cd)localObject1).fwt.fwA = 30;
                com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject1);
                GMTrace.o(8645366513664L, 64413);
                return;
                this.qyj.bgU().dy(this.qUZ, this.qVa.nas);
                paramMenuItem = new cd();
                localObject1 = com.tencent.mm.plugin.sns.storage.h.HA(this.qUZ);
                if ((((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qln))
                {
                  Iz(this.qUZ);
                  if (((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)) {
                    if (this.scene != 0) {
                      break label677;
                    }
                  }
                }
                for (paramInt = 1;; paramInt = 2)
                {
                  paramMenuItem = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp(), 11, paramInt, "", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bku(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
                  com.tencent.mm.kernel.h.xA();
                  com.tencent.mm.kernel.h.xy().gQO.a(paramMenuItem, 0);
                  GMTrace.o(8645366513664L, 64413);
                  return;
                  localObject3 = (ap)this.qUY.getTag();
                  localObject4 = this.qUZ;
                  paramInt = ((ap)localObject3).index;
                  if ((u.HX((String)localObject4)) || (paramInt < 0))
                  {
                    w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
                    paramMenuItem.fwt.fwz = i.j.dWB;
                  }
                  for (;;)
                  {
                    paramMenuItem.fwt.activity = this.activity;
                    paramMenuItem.fwt.fwA = 31;
                    com.tencent.mm.sdk.b.a.uLm.m(paramMenuItem);
                    break;
                    if (ae.bgY())
                    {
                      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                      paramMenuItem.fwt.fwz = i.j.pQY;
                    }
                    else
                    {
                      localObject3 = ae.bhp().HA((String)localObject4);
                      if (localObject3 == null)
                      {
                        w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                        paramMenuItem.fwt.fwz = i.j.dWC;
                      }
                      else
                      {
                        localObject4 = ai.a((com.tencent.mm.plugin.sns.storage.m)localObject3, paramInt);
                        if (localObject4 == null)
                        {
                          w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, media obj is null");
                          paramMenuItem.fwt.fwz = i.j.dWC;
                        }
                        else
                        {
                          com.tencent.mm.plugin.sns.i.a.a(paramMenuItem, (com.tencent.mm.plugin.sns.storage.m)localObject3, ((amn)localObject4).nas);
                        }
                      }
                    }
                  }
                }
                this.qyj.bgU().dy(this.qUZ, this.qVa.nas);
                paramMenuItem = ae.bhp().HA(this.qUZ);
                if (this.qVa.uyu.tKd.size() != 0)
                {
                  localObject1 = (amn)this.qVa.uyu.tKd.get(0);
                  if ((paramMenuItem == null) || (localObject1 == null))
                  {
                    w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite music fail, snsinfo or mediaobj is null");
                    GMTrace.o(8645366513664L, 64413);
                    return;
                  }
                  localObject3 = new cd();
                  if ((localObject1 != null) && (paramMenuItem != null) && (paramMenuItem.quQ != 0)) {
                    break label865;
                  }
                  w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or media is null");
                }
                for (((cd)localObject3).fwt.fwz = i.j.dWB;; ((cd)localObject3).fwt.fwz = i.j.pQY)
                {
                  ((cd)localObject3).fwt.activity = this.activity;
                  ((cd)localObject3).fwt.fwA = 25;
                  com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject3);
                  GMTrace.o(8645366513664L, 64413);
                  return;
                  if (!ae.bgY()) {
                    break;
                  }
                  w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                }
                localObject7 = String.format("%s#%s", new Object[] { i.jdMethod_do(paramMenuItem.field_snsId), ((amn)localObject1).nas });
                localObject4 = new sz();
                localObject5 = new ta();
                w.i("MicroMsg.Sns.GetFavDataSource", "fav sns music, from %s", new Object[] { paramMenuItem.field_userName });
                ((ta)localObject5).Qf(paramMenuItem.field_userName);
                ((ta)localObject5).Qg(com.tencent.mm.x.m.zF());
                ((ta)localObject5).zs(2);
                ((ta)localObject5).ez(paramMenuItem.field_createTime * 1000L);
                ((ta)localObject5).Qk(paramMenuItem.bjM());
                ((ta)localObject5).Qh((String)localObject7);
                localObject6 = new sp();
                ((sp)localObject6).PF((String)localObject7);
                ((sp)localObject6).Pu(((amn)localObject1).mDo);
                ((sp)localObject6).Pv(((amn)localObject1).uhE);
                ((sp)localObject6).Pt(paramMenuItem.bjL().uyu.mDo);
                localObject7 = am.dt(ae.getAccSnsPath(), ((amn)localObject1).nas) + i.e((amn)localObject1);
                if (FileOp.aZ((String)localObject7)) {
                  ((sp)localObject6).PC((String)localObject7);
                }
                for (;;)
                {
                  ((sp)localObject6).zk(7);
                  ((sp)localObject6).Pn(((amn)localObject1).fuw);
                  ((sp)localObject6).Po(((amn)localObject1).mCK);
                  ((sp)localObject6).kk(true);
                  ((sz)localObject4).tQC.add(localObject6);
                  ((sz)localObject4).a((ta)localObject5);
                  ((cd)localObject3).fwt.fwv = ((sz)localObject4);
                  ((cd)localObject3).fwt.type = 7;
                  com.tencent.mm.plugin.sns.i.a.a((sp)localObject6, paramMenuItem);
                  break;
                  ((sp)localObject6).kl(true);
                  ((sp)localObject6).Pw(((amn)localObject1).uhA);
                  localObject7 = new tj();
                  ((tj)localObject7).Qv(((amn)localObject1).uhA);
                  ((sz)localObject4).b((tj)localObject7);
                }
                paramMenuItem = this.activity;
                localObject4 = ae.bhp().HA(this.qUZ);
                if (localObject4 != null)
                {
                  localObject1 = new Intent();
                  if (((com.tencent.mm.plugin.sns.storage.m)localObject4).bjL().uyu.tKc != 1) {
                    break label1485;
                  }
                  localObject3 = (ap)this.qUY.getTag();
                  localObject4 = ai.a((com.tencent.mm.plugin.sns.storage.m)localObject4, ((ap)localObject3).index);
                  if (localObject4 == null)
                  {
                    w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "send photo fail, mediaObj is null");
                    GMTrace.o(8645366513664L, 64413);
                    return;
                  }
                  localObject5 = ((amn)localObject4).nas;
                  ((Intent)localObject1).putExtra("sns_send_data_ui_image_path", FlipView.f(am.dt(ae.getAccSnsPath(), (String)localObject5) + i.l((amn)localObject4), paramMenuItem));
                  ((Intent)localObject1).putExtra("sns_send_data_ui_image_position", ((ap)localObject3).index);
                }
                while (((((com.tencent.mm.plugin.sns.storage.m)localObject4).bjL().uyu.tKc != 4) && (((com.tencent.mm.plugin.sns.storage.m)localObject4).bjL().uyu.tKc != 15) && (((com.tencent.mm.plugin.sns.storage.m)localObject4).bjL().uyu.tKc != 3)) || ((amn)((com.tencent.mm.plugin.sns.storage.m)localObject4).bjL().uyu.tKd.get(0) != null))
                {
                  ((Intent)localObject1).putExtra("exdevice_open_scene_type", 1);
                  ((Intent)localObject1).putExtra("sns_local_id", this.qUZ);
                  ((Intent)localObject1).putExtra("sns_send_data_ui_activity", true);
                  com.tencent.mm.bi.d.a(this.activity, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject1);
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mediaObj is null, send failed!");
                GMTrace.o(8645366513664L, 64413);
                return;
                paramMenuItem = ae.bhp().HA(this.qUZ);
                if (paramMenuItem == null)
                {
                  w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute play video but sns info is null.");
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                if (paramMenuItem.uF(32))
                {
                  w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute play video but it is ad");
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                localObject1 = (amn)paramMenuItem.bjL().uyu.tKd.get(0);
                if (localObject1 == null)
                {
                  w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute paly video but media is null");
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                localObject3 = am.dt(ae.getAccSnsPath(), ((amn)localObject1).nas);
                paramMenuItem = "";
                localObject4 = i.j((amn)localObject1);
                if (FileOp.aZ((String)localObject3 + (String)localObject4)) {
                  paramMenuItem = (String)localObject3 + i.e((amn)localObject1);
                }
                if (FileOp.aZ((String)localObject3 + i.p((amn)localObject1))) {
                  paramMenuItem = (String)localObject3 + i.n((amn)localObject1);
                }
                localObject1 = new Intent();
                ((Intent)localObject1).setClass(this.activity, SnsOnlineVideoActivity.class);
                ((Intent)localObject1).putExtra("intent_thumbpath", paramMenuItem);
                ((Intent)localObject1).putExtra("intent_localid", this.qUZ);
                ((Intent)localObject1).putExtra("intent_from_scene", this.scene);
                ((Intent)localObject1).putExtra("intent_ismute", true);
                if (this.qUY != null)
                {
                  paramMenuItem = new int[2];
                  this.qUY.getLocationInWindow(paramMenuItem);
                  paramInt = this.qUY.getWidth();
                  i = this.qUY.getHeight();
                  ((Intent)localObject1).putExtra("img_gallery_left", paramMenuItem[0]);
                  ((Intent)localObject1).putExtra("img_gallery_top", paramMenuItem[1]);
                  ((Intent)localObject1).putExtra("img_gallery_width", paramInt);
                  ((Intent)localObject1).putExtra("img_gallery_height", i);
                }
                this.activity.startActivity((Intent)localObject1);
                this.activity.overridePendingTransition(0, 0);
                GMTrace.o(8645366513664L, 64413);
                return;
                this.qyj.bgU().dy(this.qUZ, this.qVa.nas);
                paramMenuItem = this.qVa.uyu.mDo;
                localObject1 = this.qVa.uyt.nas;
                localObject1 = av.Iy(paramMenuItem);
                if (bg.mZ((String)localObject1))
                {
                  w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite url fail, url is null");
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                paramMenuItem = new cd();
                localObject3 = com.tencent.mm.plugin.sns.storage.h.HA(this.qUZ);
                if (localObject3 != null)
                {
                  localObject4 = com.tencent.mm.x.q.gi(((com.tencent.mm.plugin.sns.storage.m)localObject3).field_snsId);
                  localObject5 = com.tencent.mm.x.q.Aw().n((String)localObject4, true);
                  ((q.b)localObject5).k("prePublishId", "sns_" + i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject3).field_snsId));
                  ((q.b)localObject5).k("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject3).field_userName);
                  ((q.b)localObject5).k("preChatName", "");
                  ((q.b)localObject5).k("url", localObject1);
                  ((q.b)localObject5).k("preMsgIndex", Integer.valueOf(0));
                  ((q.b)localObject5).k("sendAppMsgScene", Integer.valueOf(1));
                  ((q.b)localObject5).k("adExtStr", ((com.tencent.mm.plugin.sns.storage.m)localObject3).bjL().qBT);
                  paramMenuItem.fwt.fwy = ((String)localObject4);
                }
                localObject3 = ae.bhp().HA(this.qUZ);
                if ((localObject3 != null) && (this.qVa.uyu.tKc == 18)) {
                  com.tencent.mm.plugin.sns.a.b.j.a(j.d.pXB, j.c.pXv, j.e.pXG, 0, (com.tencent.mm.plugin.sns.storage.m)localObject3);
                }
                if (!bg.mZ(this.qVa.qAC))
                {
                  Iz(((com.tencent.mm.plugin.sns.storage.m)localObject3).bkg());
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                if (((com.tencent.mm.plugin.sns.storage.m)localObject3).uF(32)) {
                  if (this.scene != 0) {
                    break label2568;
                  }
                }
                for (paramInt = 1;; paramInt = 2)
                {
                  localObject3 = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject3).bkp(), 11, paramInt, "", ((com.tencent.mm.plugin.sns.storage.m)localObject3).bku(), ((com.tencent.mm.plugin.sns.storage.m)localObject3).bjM());
                  com.tencent.mm.kernel.h.xA();
                  com.tencent.mm.kernel.h.xy().gQO.a((k)localObject3, 0);
                  com.tencent.mm.plugin.sns.i.a.a(paramMenuItem, (String)localObject1, this.qUZ);
                  paramMenuItem.fwt.activity = this.activity;
                  paramMenuItem.fwt.fwA = 28;
                  com.tencent.mm.sdk.b.a.uLm.m(paramMenuItem);
                  if (paramMenuItem.fwu.ret == 0)
                  {
                    l = bg.Po();
                    if (!bg.mZ((String)localObject1))
                    {
                      w.d("MicroMsg.TimeLineMMMenuItemSelectedListener", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), localObject1, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
                      paramMenuItem = "";
                    }
                  }
                  try
                  {
                    localObject1 = URLEncoder.encode((String)localObject1, "UTF-8");
                    paramMenuItem = (MenuItem)localObject1;
                  }
                  catch (UnsupportedEncodingException localUnsupportedEncodingException)
                  {
                    for (;;)
                    {
                      w.printErrStackTrace("MicroMsg.TimeLineMMMenuItemSelectedListener", localUnsupportedEncodingException, "", new Object[0]);
                    }
                  }
                  com.tencent.mm.plugin.report.service.g.paX.i(13378, new Object[] { paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
                  GMTrace.o(8645366513664L, 64413);
                  return;
                }
                this.qyj.bgU().dy(this.qUZ, this.qVa.nas);
              } while (this.qVa == null);
              paramMenuItem = new cd();
              localObject5 = this.qVa;
              if (localObject5 == null)
              {
                w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
                paramMenuItem.fwt.fwz = i.j.dWB;
              }
              for (;;)
              {
                paramMenuItem.fwt.activity = this.activity;
                paramMenuItem.fwt.fwA = 26;
                com.tencent.mm.sdk.b.a.uLm.m(paramMenuItem);
                GMTrace.o(8645366513664L, 64413);
                return;
                localObject2 = new sz();
                localObject3 = new ta();
                localObject4 = new sy();
                ((ta)localObject3).Qf(((bhc)localObject5).jWW);
                ((ta)localObject3).Qg(com.tencent.mm.x.m.zF());
                ((ta)localObject3).zs(2);
                ((ta)localObject3).ez(bg.Pp());
                if (((bhc)localObject5).uyt != null) {
                  ((ta)localObject3).Ql(((bhc)localObject5).uyt.nas);
                }
                if (((bhc)localObject5).uyu != null)
                {
                  ((sy)localObject4).PY(((bhc)localObject5).uyu.fuw);
                  ((sy)localObject4).PZ(((bhc)localObject5).uyu.mCK);
                  if ((((bhc)localObject5).uyu.tKd != null) && (!((bhc)localObject5).uyu.tKd.isEmpty()))
                  {
                    localObject5 = (amn)((bhc)localObject5).uyu.tKd.get(0);
                    ((sy)localObject4).zp(((amn)localObject5).fvu);
                    ((sy)localObject4).Qb(((amn)localObject5).qyB);
                    ((sy)localObject4).Qa(((amn)localObject5).uhA);
                  }
                }
                paramMenuItem.fwt.title = ((sy)localObject4).title;
                paramMenuItem.fwt.desc = ((sy)localObject4).desc;
                paramMenuItem.fwt.fwv = ((sz)localObject2);
                paramMenuItem.fwt.type = 10;
                ((sz)localObject2).a((ta)localObject3);
                ((sz)localObject2).b((sy)localObject4);
              }
              this.qyj.bgU().dy(this.qUZ, this.qVa.nas);
            } while (this.qVa == null);
            paramMenuItem = new cd();
            localObject5 = this.qVa;
            if (localObject5 == null)
            {
              w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
              paramMenuItem.fwt.fwz = i.j.dWB;
            }
            for (;;)
            {
              paramMenuItem.fwt.activity = this.activity;
              paramMenuItem.fwt.fwA = 27;
              com.tencent.mm.sdk.b.a.uLm.m(paramMenuItem);
              GMTrace.o(8645366513664L, 64413);
              return;
              localObject2 = new sz();
              localObject3 = new ta();
              localObject4 = new td();
              ((ta)localObject3).Qf(((bhc)localObject5).jWW);
              ((ta)localObject3).Qg(com.tencent.mm.x.m.zF());
              ((ta)localObject3).zs(8);
              ((ta)localObject3).ez(bg.Pp());
              if (((bhc)localObject5).uyt != null) {
                ((ta)localObject3).Ql(((bhc)localObject5).uyt.nas);
              }
              if (((bhc)localObject5).uyu != null)
              {
                ((td)localObject4).Qo(((bhc)localObject5).uyu.fuw);
                ((td)localObject4).Qp(((bhc)localObject5).uyu.mCK);
                if ((((bhc)localObject5).uyu.tKd != null) && (!((bhc)localObject5).uyu.tKd.isEmpty()))
                {
                  localObject5 = (amn)((bhc)localObject5).uyu.tKd.get(0);
                  ((td)localObject4).Qr(((amn)localObject5).qyB);
                  ((td)localObject4).Qq(((amn)localObject5).uhA);
                }
              }
              paramMenuItem.fwt.title = ((td)localObject4).title;
              paramMenuItem.fwt.desc = ((td)localObject4).desc;
              paramMenuItem.fwt.fwv = ((sz)localObject2);
              paramMenuItem.fwt.type = 15;
              ((sz)localObject2).a((ta)localObject3);
              ((sz)localObject2).b((td)localObject4);
            }
            paramMenuItem = ae.bhp().HA(this.qUZ).bjM();
            localObject2 = (com.tencent.mm.plugin.sns.ui.m)this.qUY.getTag();
            if (u.HT(paramMenuItem))
            {
              paramMenuItem = new com.tencent.mm.plugin.sns.model.q(u.HU(paramMenuItem), 6, ((com.tencent.mm.plugin.sns.ui.m)localObject2).qbt);
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(paramMenuItem, 0);
            }
            for (;;)
            {
              localObject2 = this.activity;
              this.activity.getString(i.j.dxm);
              this.qxY = com.tencent.mm.ui.base.h.a((Context)localObject2, this.activity.getString(i.j.pRU), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                  GMTrace.i(8644561207296L, 64407);
                  com.tencent.mm.kernel.h.xA();
                  com.tencent.mm.kernel.h.xy().gQO.c(paramMenuItem);
                  GMTrace.o(8644561207296L, 64407);
                }
              });
              GMTrace.o(8645366513664L, 64413);
              return;
              paramMenuItem = new com.tencent.mm.plugin.sns.model.q(u.HU(paramMenuItem), 4, ((com.tencent.mm.plugin.sns.ui.m)localObject2).qbt);
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(paramMenuItem, 0);
            }
            paramMenuItem = ae.bhp().HA(this.qUZ);
          } while (paramMenuItem == null);
          com.tencent.mm.plugin.sns.abtest.a.b(paramMenuItem);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_permission_snsinfo_svr_id", paramMenuItem.field_snsId);
          ((Intent)localObject2).putExtra("sns_permission_userName", paramMenuItem.field_userName);
          ((Intent)localObject2).putExtra("sns_permission_anim", true);
          ((Intent)localObject2).setClass(this.activity, SnsPermissionUI.class);
          this.activity.startActivityForResult((Intent)localObject2, 11);
          GMTrace.o(8645366513664L, 64413);
          return;
          this.qyj.bgU().dy(this.qUZ, this.qVa.nas);
          paramMenuItem = com.tencent.mm.plugin.sns.storage.h.HA(this.qUZ);
          if ((paramMenuItem.uF(32)) && (paramMenuItem.bjH().qln))
          {
            paramMenuItem = ae.bhp().HA(this.qUZ);
            if ((paramMenuItem != null) && (paramMenuItem.uF(32))) {
              if (this.scene != 0) {
                break label3706;
              }
            }
            for (paramInt = 1;; paramInt = 2)
            {
              paramMenuItem = new com.tencent.mm.plugin.sns.a.b.c(paramMenuItem.bkp(), 11, paramInt, "", 2, paramMenuItem.bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(paramMenuItem, 0);
              Iz(this.qUZ);
              GMTrace.o(8645366513664L, 64413);
              return;
            }
          }
          paramMenuItem = this.qUZ;
          paramMenuItem = ae.bhp().HA(paramMenuItem);
          if (paramMenuItem != null) {
            if (paramMenuItem.uF(32))
            {
              com.tencent.mm.plugin.sns.a.b.j.a(j.d.pXA, j.c.pXv, j.e.pXG, 0, paramMenuItem);
              if (this.scene != 0) {
                break label3860;
              }
            }
          }
          for (paramInt = 1;; paramInt = 2)
          {
            localObject2 = new com.tencent.mm.plugin.sns.a.b.c(paramMenuItem.bkp(), 11, paramInt, "", paramMenuItem.bku(), paramMenuItem.bjM());
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a((k)localObject2, 0);
            localObject2 = new cd();
            com.tencent.mm.plugin.sns.i.a.a((cd)localObject2, paramMenuItem);
            ((cd)localObject2).fwt.activity = this.activity;
            ((cd)localObject2).fwt.fwA = 29;
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
            GMTrace.o(8645366513664L, 64413);
            return;
          }
          paramMenuItem = (amn)this.qVa.uyu.tKd.get(0);
          paramMenuItem = am.dt(ae.getAccSnsPath(), paramMenuItem.nas) + i.e(paramMenuItem);
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("Select_Conv_Type", 3);
          ((Intent)localObject2).putExtra("select_is_ret", true);
          ((Intent)localObject2).putExtra("mutil_select_is_ret", true);
          ((Intent)localObject2).putExtra("image_path", paramMenuItem);
          ((Intent)localObject2).putExtra("Retr_Msg_Type", 11);
          com.tencent.mm.bi.d.a(this.activity, ".ui.transmit.SelectConversationUI", (Intent)localObject2, 15);
          GMTrace.o(8645366513664L, 64413);
          return;
        } while (!(this.qUY.getTag() instanceof com.tencent.mm.plugin.sns.ui.m));
        paramMenuItem = (com.tencent.mm.plugin.sns.ui.m)this.qUY.getTag();
        this.lWu.setText(paramMenuItem.ovi);
        com.tencent.mm.ui.base.h.bl(this.activity, this.activity.getString(i.j.duV));
        if (paramMenuItem.qbt != null) {
          com.tencent.mm.plugin.secinforeport.a.a.poO.c(4, this.qVa.nas + ":" + paramMenuItem.qbt.uuE, bg.Rv(paramMenuItem.ovi));
        }
        GMTrace.o(8645366513664L, 64413);
        return;
        paramMenuItem = ae.bhp().HA(this.qUZ);
        com.tencent.mm.plugin.sns.abtest.a.a(this.activity, paramMenuItem);
        GMTrace.o(8645366513664L, 64413);
        return;
        localObject2 = ae.bhp().HA(this.qUZ);
        if (localObject2 != null) {
          if (this.scene != 0) {
            break label4234;
          }
        }
        for (paramMenuItem = com.tencent.mm.modelsns.b.gM(714);; paramMenuItem = com.tencent.mm.modelsns.b.gN(714))
        {
          paramMenuItem.lh(i.g((com.tencent.mm.plugin.sns.storage.m)localObject2)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type).bA(((com.tencent.mm.plugin.sns.storage.m)localObject2).uF(32)).lh(((com.tencent.mm.plugin.sns.storage.m)localObject2).bkq());
          paramMenuItem.LJ();
          ao.o((com.tencent.mm.plugin.sns.storage.m)localObject2);
          GMTrace.o(8645366513664L, 64413);
          return;
        }
      } while (!(this.qUY.getTag() instanceof com.tencent.mm.plugin.sns.ui.m));
      localObject2 = (com.tencent.mm.plugin.sns.ui.m)this.qUY.getTag();
      localObject3 = ae.bhp().Hz(((com.tencent.mm.plugin.sns.ui.m)localObject2).qys);
      if (localObject3 != null)
      {
        if (this.scene != 0) {
          break label4414;
        }
        paramMenuItem = com.tencent.mm.modelsns.b.gM(715);
        paramMenuItem.lh(i.g((com.tencent.mm.plugin.sns.storage.m)localObject3)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject3).field_type).bA(((com.tencent.mm.plugin.sns.storage.m)localObject3).uF(32)).lh(((com.tencent.mm.plugin.sns.storage.m)localObject3).bkq());
        if (((com.tencent.mm.plugin.sns.ui.m)localObject2).qbt == null) {
          break label4450;
        }
        if (((com.tencent.mm.plugin.sns.ui.m)localObject2).qbt.uuE != 0) {
          break label4424;
        }
        localObject2 = ((com.tencent.mm.plugin.sns.ui.m)localObject2).qbt.uuH;
        paramMenuItem.lh((String)localObject2);
      }
      for (;;)
      {
        paramMenuItem.LJ();
        ao.a((com.tencent.mm.plugin.sns.ui.m)this.qUY.getTag());
        GMTrace.o(8645366513664L, 64413);
        return;
        paramMenuItem = com.tencent.mm.modelsns.b.gN(715);
        break;
        localObject2 = ((com.tencent.mm.plugin.sns.ui.m)localObject2).qbt.uuE;
        break label4379;
        paramMenuItem.lh("");
      }
    case 20: 
      label3706:
      label3860:
      label4234:
      label4379:
      label4414:
      label4424:
      label4450:
      this.qyj.bgU().dy(this.qUZ, this.qVa.nas);
      paramMenuItem = com.tencent.mm.plugin.sns.storage.h.HA(this.qUZ);
      if ((paramMenuItem.uF(32)) && (paramMenuItem.bjH().qln))
      {
        paramMenuItem = ae.bhp().HA(this.qUZ);
        if ((paramMenuItem != null) && (paramMenuItem.uF(32)))
        {
          if ((this.qVa == null) || (this.qVa.uyu.tKc != 15) || (this.qVa.uyB == 1)) {
            break label4637;
          }
          if (this.scene != 0) {
            break label4632;
          }
        }
        label4632:
        for (paramInt = 1;; paramInt = 2)
        {
          paramMenuItem = new com.tencent.mm.plugin.sns.a.b.c(paramMenuItem.bkp(), 11, paramInt, "", 5, paramMenuItem.bjM());
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a(paramMenuItem, 0);
          Iz(this.qUZ);
          GMTrace.o(8645366513664L, 64413);
          return;
        }
        label4637:
        if (this.scene == 0) {}
        for (paramInt = 1;; paramInt = 2)
        {
          paramMenuItem = new com.tencent.mm.plugin.sns.a.b.c(paramMenuItem.bkp(), 11, paramInt, "", 4, paramMenuItem.bjM());
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a(paramMenuItem, 0);
          break;
        }
      }
      paramMenuItem = this.qUZ;
      localObject3 = ae.bhp().HA(paramMenuItem);
      localObject2 = null;
      paramMenuItem = (MenuItem)localObject2;
      if (localObject3 != null)
      {
        paramMenuItem = (MenuItem)localObject2;
        if (((com.tencent.mm.plugin.sns.storage.m)localObject3).uF(32))
        {
          localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject3).bko();
          paramMenuItem = (MenuItem)localObject2;
          if (bg.mZ((String)localObject2)) {
            paramMenuItem = ((com.tencent.mm.plugin.sns.storage.m)localObject3).bkn();
          }
        }
      }
      if (bg.mZ(paramMenuItem))
      {
        paramMenuItem = this.qVa.uyu.mDo;
        localObject2 = this.qVa.uyt.nas;
        paramMenuItem = av.Iy(paramMenuItem);
      }
      break;
    }
    for (;;)
    {
      if (bg.mZ(paramMenuItem))
      {
        w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite url fail, url is null");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      localObject2 = new cd();
      localObject4 = com.tencent.mm.plugin.sns.storage.h.HA(this.qUZ);
      if (localObject4 != null)
      {
        localObject5 = com.tencent.mm.x.q.gi(((com.tencent.mm.plugin.sns.storage.m)localObject4).field_snsId);
        localObject6 = com.tencent.mm.x.q.Aw().n((String)localObject5, true);
        ((q.b)localObject6).k("prePublishId", "sns_" + i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject4).field_snsId));
        ((q.b)localObject6).k("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject4).field_userName);
        ((q.b)localObject6).k("preChatName", "");
        ((q.b)localObject6).k("url", paramMenuItem);
        ((q.b)localObject6).k("preMsgIndex", Integer.valueOf(0));
        ((q.b)localObject6).k("sendAppMsgScene", Integer.valueOf(1));
        ((q.b)localObject6).k("adExtStr", ((com.tencent.mm.plugin.sns.storage.m)localObject4).bjL().qBT);
        ((cd)localObject2).fwt.fwy = ((String)localObject5);
      }
      if ((localObject3 != null) && ((this.qVa.uyu.tKc == 18) || (((com.tencent.mm.plugin.sns.storage.m)localObject3).uF(32))))
      {
        com.tencent.mm.plugin.sns.a.b.j.a(j.d.pXB, j.c.pXv, j.e.pXG, 0, (com.tencent.mm.plugin.sns.storage.m)localObject3);
        if ((this.qVa == null) || (this.qVa.uyu.tKc != 15) || (this.qVa.uyB == 1)) {
          break label5159;
        }
        if (this.scene != 0) {
          break label5154;
        }
      }
      label5154:
      for (paramInt = 1;; paramInt = 2)
      {
        localObject4 = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject3).bkp(), 11, paramInt, "", 5, ((com.tencent.mm.plugin.sns.storage.m)localObject3).bjM());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((k)localObject4, 0);
        if (bg.mZ(this.qVa.qAC)) {
          break;
        }
        Iz(((com.tencent.mm.plugin.sns.storage.m)localObject3).bkg());
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      label5159:
      if (this.scene == 0) {}
      for (paramInt = 1;; paramInt = 2)
      {
        localObject4 = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject3).bkp(), 11, paramInt, "", ((com.tencent.mm.plugin.sns.storage.m)localObject3).bku(), ((com.tencent.mm.plugin.sns.storage.m)localObject3).bjM());
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a((k)localObject4, 0);
        break;
      }
      com.tencent.mm.plugin.sns.i.a.a((cd)localObject2, paramMenuItem, this.qUZ);
      ((cd)localObject2).fwt.activity = this.activity;
      ((cd)localObject2).fwt.fwA = 28;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
      if (((cd)localObject2).fwu.ret == 0)
      {
        l = bg.Po();
        if (!bg.mZ(paramMenuItem))
        {
          w.d("MicroMsg.TimeLineMMMenuItemSelectedListener", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
          localObject2 = "";
        }
      }
      try
      {
        paramMenuItem = URLEncoder.encode(paramMenuItem, "UTF-8");
        com.tencent.mm.plugin.report.service.g.paX.i(13378, new Object[] { paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      catch (UnsupportedEncodingException paramMenuItem)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.TimeLineMMMenuItemSelectedListener", paramMenuItem, "", new Object[0]);
          paramMenuItem = (MenuItem)localObject2;
        }
      }
      ao.p(ae.bhp().HA(this.qUZ));
      GMTrace.o(8645366513664L, 64413);
      return;
      if (!(this.qUY.getTag() instanceof com.tencent.mm.plugin.sns.ui.m)) {
        break;
      }
      ao.b((com.tencent.mm.plugin.sns.ui.m)this.qUY.getTag());
      GMTrace.o(8645366513664L, 64413);
      return;
      localObject2 = com.tencent.mm.plugin.sns.storage.h.HA(this.qUZ);
      if (localObject2 == null)
      {
        w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "edit photo fail, info is null");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      localObject6 = (ap)this.qUY.getTag();
      localObject3 = this.activity;
      localObject4 = paramMenuItem.getIntent();
      paramMenuItem = this.qyj;
      if (localObject4 == null)
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] intent is null!");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      if (paramMenuItem == null)
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] snsContext is null!");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      if (localObject2 == null)
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      com.tencent.mm.kernel.h.xA();
      if (!com.tencent.mm.kernel.h.xz().isSDCardAvailable())
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is not SDCardAvailable");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      localObject5 = ((ap)localObject6).fAx;
      paramInt = ((ap)localObject6).index;
      i = ((ap)localObject6).position;
      localObject6 = ((com.tencent.mm.plugin.sns.storage.m)localObject2).bjL();
      if ((((bhc)localObject6).uyu == null) || (((bhc)localObject6).uyu.tKd.size() == 0))
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is ContentObj null");
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      paramMenuItem.bgU().v((com.tencent.mm.plugin.sns.storage.m)localObject2);
      localObject6 = ((com.tencent.mm.plugin.sns.storage.m)localObject2).bjL();
      if (paramInt < ((bhc)localObject6).uyu.tKd.size()) {}
      for (paramMenuItem = (amn)((bhc)localObject6).uyu.tKd.get(paramInt); !ae.bhm().A(paramMenuItem); paramMenuItem = new amn())
      {
        w.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] media[%s] is illegal", new Object[] { Integer.valueOf(paramMenuItem.pYt) });
        GMTrace.o(8645366513664L, 64413);
        return;
      }
      localObject7 = com.tencent.mm.modelsns.b.gM(716);
      ((com.tencent.mm.modelsns.b)localObject7).lh(i.g((com.tencent.mm.plugin.sns.storage.m)localObject2)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type).bA(((com.tencent.mm.plugin.sns.storage.m)localObject2).uF(32)).lh(((com.tencent.mm.plugin.sns.storage.m)localObject2).bkq()).lh(paramMenuItem.nas).gP(paramInt).gP(((bhc)localObject6).uyu.tKd.size());
      ((com.tencent.mm.modelsns.b)localObject7).LJ();
      paramMenuItem = com.tencent.mm.modelsns.b.gM(744);
      paramMenuItem.lh(i.g((com.tencent.mm.plugin.sns.storage.m)localObject2)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_type).bA(((com.tencent.mm.plugin.sns.storage.m)localObject2).uF(32)).lh(((com.tencent.mm.plugin.sns.storage.m)localObject2).bkq());
      paramMenuItem.b((Intent)localObject4, "intent_key_StatisticsOplog");
      ((Intent)localObject4).putExtra("sns_soon_enter_photoedit_ui", true);
      ((Intent)localObject4).putExtra("sns_gallery_localId", (String)localObject5);
      ((Intent)localObject4).putExtra("sns_gallery_position", paramInt);
      ((Intent)localObject4).putExtra("sns_position", i);
      ((Intent)localObject4).putExtra("sns_gallery_showtype", 1);
      ((Intent)localObject4).putExtra("K_ad_scene", 1);
      ((Intent)localObject4).putExtra("k_is_from_sns_main_timeline", true);
      ((Intent)localObject4).setClass((Context)localObject3, SnsBrowseUI.class);
      paramMenuItem = new Bundle();
      paramMenuItem.putInt("stat_scene", 3);
      paramMenuItem.putString("stat_msg_id", "sns_" + i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject2).field_snsId));
      paramMenuItem.putString("stat_send_msg_user", ((com.tencent.mm.plugin.sns.storage.m)localObject2).field_userName);
      ((Intent)localObject4).putExtra("_stat_obj", paramMenuItem);
      ((Activity)localObject3).startActivity((Intent)localObject4);
      ((Activity)localObject3).overridePendingTransition(0, 0);
      break;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8645634949120L, 64415);
    if (paramInt2 == -1)
    {
      if (paramInt1 == 15)
      {
        com.tencent.mm.plugin.sns.storage.m localm = ae.bhp().HA(this.qUZ);
        Object localObject1 = (amn)this.qVa.uyu.tKd.get(0);
        String str1 = paramIntent.getStringExtra("Select_Conv_User");
        Object localObject2 = paramIntent.getStringExtra("custom_send_text");
        String str2 = am.dt(ae.getAccSnsPath(), ((amn)localObject1).nas) + i.e((amn)localObject1);
        paramIntent = bg.f(str1.split(",")).iterator();
        while (paramIntent.hasNext())
        {
          str1 = (String)paramIntent.next();
          if (localm.uF(32))
          {
            str3 = am.dt(ae.getAccSnsPath(), ((amn)localObject1).nas) + i.j((amn)localObject1);
            bhc localbhc = localm.bjL();
            com.tencent.mm.plugin.sns.storage.b localb = localm.bjH();
            bfu localbfu = new bfu();
            localbfu.tQo = ((amn)localObject1).qTd;
            localbfu.hdc = ((amn)localObject1).uhH;
            if (localbhc.uyu.tKc == 15)
            {
              localbfu.hdi = localm.bjJ().qhb;
              localbfu.hdj = localbhc.nas;
              localbfu.hde = localbhc.uyr;
              if (!bg.mZ(((amn)localObject1).uhK)) {
                break label568;
              }
              paramIntent = ((amn)localObject1).uhA;
              label290:
              localbfu.hdh = paramIntent;
              if ((localb != null) && (localb.qlE == 0))
              {
                localbfu.hdg = localb.qlG;
                localbfu.hdf = localb.qlF;
              }
              paramInt1 = i.Gl(str3);
              w.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str1, str3, str2, ((amn)localObject1).uhH, Integer.valueOf(((amn)localObject1).qTd), Integer.valueOf(paramInt1) });
              com.tencent.mm.plugin.messenger.a.d.aNb().a(this.activity, str1, str3, str2, 43, paramInt1, localbfu, false, false, localbhc.qBT);
              com.tencent.mm.plugin.messenger.a.d.aNb().cM((String)localObject2, str1);
              if (this.scene != 0) {
                break label577;
              }
              paramInt1 = 1;
              label441:
              paramIntent = new com.tencent.mm.plugin.sns.a.b.c(localm.bkp(), 12, paramInt1, "", 2, localm.bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(paramIntent, 0);
              boolean bool = o.dW(str1);
              localObject1 = j.d.pXA;
              if (!bool) {
                break label582;
              }
              paramIntent = j.c.pXx;
              label502:
              localObject2 = j.e.pXG;
              if (!bool) {
                break label589;
              }
            }
            label568:
            label577:
            label582:
            label589:
            for (paramInt1 = com.tencent.mm.x.j.eU(str1);; paramInt1 = 0)
            {
              com.tencent.mm.plugin.sns.a.b.j.a((j.d)localObject1, paramIntent, (j.e)localObject2, paramInt1, localm);
              GMTrace.o(8645634949120L, 64415);
              return;
              localbfu.hdi = localbhc.uyz.hdi;
              localbfu.hdj = localbhc.uyz.hdj;
              break;
              paramIntent = ((amn)localObject1).uhK;
              break label290;
              paramInt1 = 2;
              break label441;
              paramIntent = j.c.pXw;
              break label502;
            }
          }
          String str3 = am.dt(ae.getAccSnsPath(), ((amn)localObject1).nas) + i.j((amn)localObject1);
          paramInt1 = i.Gl(str3);
          w.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str1, str3, str2, ((amn)localObject1).uhH, Integer.valueOf(((amn)localObject1).qTd), Integer.valueOf(paramInt1) });
          com.tencent.mm.plugin.messenger.a.d.aNb().a(this.activity, str1, str3, str2, 43, paramInt1, this.qVa.qBT);
          com.tencent.mm.plugin.messenger.a.d.aNb().cM((String)localObject2, str1);
        }
        com.tencent.mm.ui.snackbar.a.e(this.activity, this.activity.getString(i.j.egk));
        GMTrace.o(8645634949120L, 64415);
      }
    }
    else if (paramInt1 == 15)
    {
      paramIntent = ae.bhp().HA(this.qUZ);
      if (paramIntent == null)
      {
        w.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "menuitemselected and snsinfo is null %s", new Object[] { this.qUZ });
        GMTrace.o(8645634949120L, 64415);
        return;
      }
      if (this.scene != 0) {
        break label867;
      }
    }
    label867:
    for (paramInt1 = 1;; paramInt1 = 2)
    {
      paramIntent = new com.tencent.mm.plugin.sns.a.b.c(paramIntent.bkp(), 13, paramInt1, "", 2, paramIntent.bjM());
      com.tencent.mm.kernel.h.xA();
      com.tencent.mm.kernel.h.xy().gQO.a(paramIntent, 0);
      GMTrace.o(8645634949120L, 64415);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */