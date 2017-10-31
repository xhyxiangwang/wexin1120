package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.g.a.jf;
import com.tencent.mm.g.a.jf.b;
import com.tencent.mm.g.a.mt;
import com.tencent.mm.g.a.px;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import com.tencent.mm.x.ag.b.a;
import java.util.LinkedList;
import java.util.List;

public final class bg
{
  public Context context;
  public q ikZ;
  public View.OnClickListener qMO;
  public View.OnClickListener qSA;
  public View.OnClickListener qSB;
  public View.OnClickListener qSC;
  public View.OnClickListener qSD;
  public View.OnClickListener qSE;
  public View.OnClickListener qSF;
  public a qSr;
  public long qSs;
  public View.OnClickListener qSt;
  public View.OnClickListener qSu;
  public View.OnClickListener qSv;
  public View.OnClickListener qSw;
  public View.OnClickListener qSx;
  public View.OnClickListener qSy;
  public View.OnClickListener qSz;
  public ad qyj;
  public int scene;
  
  public bg(Context paramContext, a parama, int paramInt, ad paramad)
  {
    GMTrace.i(8562956828672L, 63799);
    this.scene = 0;
    this.qSs = 0L;
    this.qMO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8543629475840L, 63655);
        long l = System.currentTimeMillis();
        if (l - bg.this.qSs < 500L)
        {
          GMTrace.o(8543629475840L, 63655);
          return;
        }
        bg.this.qSs = l;
        Object localObject2;
        Object localObject4;
        Object localObject1;
        if ((paramAnonymousView.getTag() instanceof r))
        {
          localObject2 = (r)paramAnonymousView.getTag();
          localObject4 = ((r)localObject2).qAK;
          m localm = ae.bhp().HA(((r)localObject2).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v(localm);
          }
          if (((bhc)localObject4).uyu.tKc == 18)
          {
            localObject1 = bg.this.context;
            localObject3 = ((r)localObject2).qAK;
            paramAnonymousView = ((r)localObject2).fxL;
            paramAnonymousView = ae.bhp().HA(paramAnonymousView);
            j.a(j.b.pXq, j.a.pXi, paramAnonymousView);
            localObject2 = new Intent();
            paramAnonymousView = null;
            if (((bhc)localObject3).uyu.tKd.size() > 0) {
              paramAnonymousView = (amn)((bhc)localObject3).uyu.tKd.get(0);
            }
            ((Intent)localObject2).putExtra("IsAd", false);
            ((Intent)localObject2).putExtra("KStremVideoUrl", ((bhc)localObject3).uyu.mDo);
            ((Intent)localObject2).putExtra("KSta_SourceType", 2);
            ((Intent)localObject2).putExtra("KSta_Scene", j.b.pXq.value);
            ((Intent)localObject2).putExtra("KSta_FromUserName", ((bhc)localObject3).jWW);
            ((Intent)localObject2).putExtra("KSta_SnSId", ((bhc)localObject3).nas);
            if (paramAnonymousView == null)
            {
              localObject4 = new StringBuilder("fakeid_");
              if (paramAnonymousView == null)
              {
                paramAnonymousView = ((bhc)localObject3).nas;
                ((Intent)localObject2).putExtra("KMediaId", paramAnonymousView);
              }
            }
            for (;;)
            {
              paramAnonymousView = ((bhc)localObject3).uyz;
              if (paramAnonymousView != null)
              {
                ((Intent)localObject2).putExtra("KMediaVideoTime", paramAnonymousView.hdd);
                ((Intent)localObject2).putExtra("StreamWording", paramAnonymousView.hdf);
                ((Intent)localObject2).putExtra("StremWebUrl", paramAnonymousView.hdg);
                ((Intent)localObject2).putExtra("KMediaTitle", paramAnonymousView.hde);
                ((Intent)localObject2).putExtra("KStremVideoUrl", paramAnonymousView.hdc);
                ((Intent)localObject2).putExtra("KThumUrl", paramAnonymousView.hdh);
                ((Intent)localObject2).putExtra("KSta_StremVideoAduxInfo", paramAnonymousView.hdi);
                ((Intent)localObject2).putExtra("KSta_StremVideoPublishId", paramAnonymousView.hdj);
              }
              ((Intent)localObject2).putExtra("KSta_SnsStatExtStr", ((bhc)localObject3).qBT);
              com.tencent.mm.bi.d.b((Context)localObject1, "sns", ".ui.VideoAdPlayerUI", (Intent)localObject2);
              GMTrace.o(8543629475840L, 63655);
              return;
              paramAnonymousView = paramAnonymousView.nas;
              break;
              ((Intent)localObject2).putExtra("KMediaId", paramAnonymousView.nas);
            }
          }
          localObject1 = ((bhc)localObject4).uyu.mDo;
          Object localObject3 = ((bhc)localObject4).uyt.nas;
          w.d("MicroMsg.TimeLineClickEvent", "url:" + (String)localObject1);
          localObject3 = com.tencent.mm.plugin.sns.c.a.ifN.r((String)localObject1, "timeline");
          if ((localObject3 == null) || (((String)localObject3).length() == 0))
          {
            GMTrace.o(8543629475840L, 63655);
            return;
          }
          Intent localIntent = new Intent();
          localObject1 = null;
          if (localObject4 != null)
          {
            localObject1 = new Bundle();
            ((Bundle)localObject1).putString("KSnsStrId", ((bhc)localObject4).nas);
            ((Bundle)localObject1).putString("KSnsLocalId", ((r)localObject2).fxL);
            ((Bundle)localObject1).putBoolean("KFromTimeline", true);
            if ((((bhc)localObject4).uyu != null) && (((bhc)localObject4).uyu.tKd.size() > 0))
            {
              ((Bundle)localObject1).putString("K_sns_thumb_url", ((amn)((bhc)localObject4).uyu.tKd.get(0)).uhA);
              ((Bundle)localObject1).putString("K_sns_raw_url", ((bhc)localObject4).uyu.mDo);
              w.i("MicroMsg.TimeLineClickEvent", "put the thumb url %s redirectUrl %s", new Object[] { ((amn)((bhc)localObject4).uyu.tKd.get(0)).uhA, ((bhc)localObject4).uyu.mDo });
            }
          }
          ((Bundle)localObject1).putString("key_snsad_statextstr", ((bhc)localObject4).qBT);
          localIntent.putExtra("rawUrl", (String)localObject3);
          localIntent.putExtra("shortUrl", (String)localObject3);
          localIntent.putExtra("useJs", true);
          localIntent.putExtra("type", 65281);
          if (((bhc)localObject4).uyv != null)
          {
            localIntent.putExtra("srcUsername", ((bhc)localObject4).uyv);
            localIntent.putExtra("srcDisplayname", ((bhc)localObject4).tbI);
            w.i("MicroMsg.TimeLineClickEvent", "urlRedirectListener tlObj.sourceNickName: " + ((bhc)localObject4).tbI + " tlObj.publicUserName: " + ((bhc)localObject4).uyv);
          }
          localIntent.putExtra("sns_local_id", ((r)localObject2).fxL);
          if (localm != null)
          {
            localIntent.putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId));
            localIntent.putExtra("pre_username", localm.field_userName);
            localIntent.putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId));
            localIntent.putExtra("preUsername", localm.field_userName);
            localIntent.putExtra("share_report_pre_msg_url", (String)localObject3);
            localIntent.putExtra("share_report_pre_msg_title", ((bhc)localObject4).uyu.fuw);
            localIntent.putExtra("share_report_pre_msg_desc", ((bhc)localObject4).uyu.mCK);
            if ((((bhc)localObject4).uyu.tKd != null) && (((bhc)localObject4).uyu.tKd.size() > 0)) {
              localIntent.putExtra("share_report_pre_msg_icon_url", ((amn)((bhc)localObject4).uyu.tKd.get(0)).uhA);
            }
            localIntent.putExtra("share_report_pre_msg_appid", "");
            localIntent.putExtra("share_report_from_scene", 1);
          }
          if ((localObject4 != null) && (((bhc)localObject4).uyt != null)) {
            localIntent.putExtra("KAppId", ((bhc)localObject4).uyt.nas);
          }
          if ((localm != null) && (localm.uF(32)))
          {
            localObject2 = localm.bjJ();
            if (localObject2 != null) {
              localIntent.putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject2).iLj);
            }
          }
          if ((localm != null) && (localObject4 != null))
          {
            if (bg.this.scene != 0) {
              break label1735;
            }
            localObject2 = com.tencent.mm.modelsns.b.gM(718);
            com.tencent.mm.modelsns.b localb = ((com.tencent.mm.modelsns.b)localObject2).lh(com.tencent.mm.plugin.sns.data.i.g(localm)).gP(localm.field_type).bA(localm.uF(32)).lh(localm.bkq()).lh(((bhc)localObject4).uyv);
            if (((bhc)localObject4).uyt != null) {
              break label1746;
            }
            localObject3 = "";
            label1261:
            localb.lh((String)localObject3).lh(((bhc)localObject4).uyu.mDo);
            ((com.tencent.mm.modelsns.b)localObject2).LJ();
            if (bg.this.scene != 0) {
              break label1759;
            }
            localObject2 = com.tencent.mm.modelsns.b.gM(743);
            label1304:
            localb = ((com.tencent.mm.modelsns.b)localObject2).lh(com.tencent.mm.plugin.sns.data.i.g(localm)).gP(localm.field_type).bA(localm.uF(32)).lh(localm.bkq()).lh(((bhc)localObject4).uyv);
            if (((bhc)localObject4).uyt != null) {
              break label1770;
            }
            localObject3 = "";
            label1363:
            localb.lh((String)localObject3).lh(((bhc)localObject4).uyu.mDo);
            if (localObject1 != null)
            {
              localObject2 = ((com.tencent.mm.modelsns.b)localObject2).Eb();
              if (localObject2 != null) {
                ((Bundle)localObject1).putByteArray("intent_key_StatisticsOplog", (byte[])localObject2);
              }
            }
          }
          if (localObject1 != null) {
            localIntent.putExtra("jsapiargs", (Bundle)localObject1);
          }
          localIntent.putExtra("geta8key_scene", 2);
          localIntent.putExtra("from_scence", 3);
          if ((!com.tencent.mm.sdk.platformtools.bg.mZ(((bhc)localObject4).qAC)) && (e.Hu(((bhc)localObject4).qAC)))
          {
            localObject1 = new int[2];
            if (paramAnonymousView != null) {
              paramAnonymousView.getLocationInWindow((int[])localObject1);
            }
            i = paramAnonymousView.getWidth();
            j = paramAnonymousView.getHeight();
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("img_gallery_left", localObject1[0]);
            paramAnonymousView.putExtra("img_gallery_top", localObject1[1]);
            paramAnonymousView.putExtra("img_gallery_width", i);
            paramAnonymousView.putExtra("img_gallery_height", j);
            if (localObject4 != null)
            {
              localObject1 = ((bhc)localObject4).uyu.tKd;
              if (((List)localObject1).size() > 0) {
                paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject1).get(0)).uhA);
              }
            }
            paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", localm.bjM());
            paramAnonymousView.putExtra("sns_landing_pages_aid", localm.bkl());
            paramAnonymousView.putExtra("sns_landing_pages_traceid", localm.bkm());
            paramAnonymousView.putExtra("sns_landing_pages_ux_info", localm.bkq());
            if (bg.this.scene == 0) {}
            for (i = 3;; i = 4)
            {
              paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
              paramAnonymousView.setClass(bg.this.context, SnsAdNativeLandingPagesUI.class);
              paramAnonymousView.putExtra("sns_landing_pages_xml", ((bhc)localObject4).qAC);
              paramAnonymousView.putExtra("sns_landing_pages_rec_src", localm.bkt());
              paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
              e.z(paramAnonymousView, bg.this.context);
              GMTrace.o(8543629475840L, 63655);
              return;
              label1735:
              localObject2 = com.tencent.mm.modelsns.b.gN(718);
              break;
              label1746:
              localObject3 = ((bhc)localObject4).uyt.nas;
              break label1261;
              label1759:
              localObject2 = com.tencent.mm.modelsns.b.gN(743);
              break label1304;
              label1770:
              localObject3 = ((bhc)localObject4).uyt.nas;
              break label1363;
            }
          }
          com.tencent.mm.plugin.sns.c.a.ifM.j(localIntent, bg.this.context);
          localObject1 = null;
          int j = 0;
          int i = j;
          paramAnonymousView = (View)localObject1;
          if (localObject4 != null)
          {
            i = j;
            paramAnonymousView = (View)localObject1;
            if (((bhc)localObject4).uyt != null)
            {
              paramAnonymousView = ((bhc)localObject4).uyt.nas;
              i = com.tencent.mm.sdk.platformtools.bg.getInt(((bhc)localObject4).uyt.jXC, 0);
            }
          }
          localObject3 = com.tencent.mm.plugin.sns.c.a.ifN.j(paramAnonymousView, i);
          if ((!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject3)) && (com.tencent.mm.plugin.sns.c.a.ifN.bE(paramAnonymousView)))
          {
            localObject2 = null;
            localObject1 = localObject2;
            if (localObject4 != null)
            {
              localObject1 = localObject2;
              if (((bhc)localObject4).qfM != null)
              {
                localObject1 = localObject2;
                if (((bhc)localObject4).qfM.tuc != null) {
                  localObject1 = ((bhc)localObject4).qfM.tuc.ttV;
                }
              }
            }
            if (localObject4 != null) {
              break label2108;
            }
            localObject2 = null;
            com.tencent.mm.plugin.sns.c.a.ifN.a(bg.this.context, paramAnonymousView, (String)localObject3, (String)localObject2, 5, 4, 1, (String)localObject1, ((bhc)localObject4).nas);
          }
          g.paX.i(11105, new Object[] { ((bhc)localObject4).jWW, ((bhc)localObject4).uyu.mDo });
          if ((localm != null) && (localm.field_type == 4))
          {
            paramAnonymousView = (amn)((bhc)localObject4).uyu.tKd.get(0);
            localObject1 = g.paX;
            if (paramAnonymousView != null) {
              break label2118;
            }
          }
        }
        label2108:
        label2118:
        for (paramAnonymousView = "";; paramAnonymousView = paramAnonymousView.mCK)
        {
          ((g)localObject1).i(13043, new Object[] { Integer.valueOf(1), paramAnonymousView, ((bhc)localObject4).uyt.nas });
          GMTrace.o(8543629475840L, 63655);
          return;
          localObject2 = ((bhc)localObject4).jWW;
          break;
        }
      }
    };
    this.qSt = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8586981801984L, 63978);
        Object localObject1 = bg.this;
        int i;
        if ((paramAnonymousView == null) || (!(paramAnonymousView.getTag() instanceof bhc))) {
          i = 1;
        }
        Object localObject2;
        bhc localbhc;
        String str1;
        String str2;
        for (;;)
        {
          if (i == 0) {
            if ((paramAnonymousView == null) || (!(paramAnonymousView.getTag() instanceof bhc)))
            {
              GMTrace.o(8586981801984L, 63978);
              return;
              localObject2 = ((bhc)paramAnonymousView.getTag()).uyt.nas;
              if ("wx485a97c844086dc9".equals(localObject2))
              {
                com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "shake", ".ui.ShakeReportUI", new Intent().putExtra("shake_music", true));
                i = 1;
              }
              else
              {
                if ("wx7fa037cc7dfabad5".equals(localObject2))
                {
                  com.tencent.mm.plugin.sport.b.d.nK(34);
                  com.tencent.mm.kernel.h.xA();
                  if (com.tencent.mm.l.a.eE(((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL("gh_43f2581f6fd6").field_type))
                  {
                    localObject2 = new Intent();
                    ((Intent)localObject2).putExtra("Chat_User", "gh_43f2581f6fd6");
                    ((Intent)localObject2).putExtra("finish_direct", true);
                    com.tencent.mm.bi.d.a(((bg)localObject1).context, ".ui.chatting.En_5b8fbb1e", (Intent)localObject2);
                  }
                  for (;;)
                  {
                    i = 1;
                    break;
                    localObject2 = new Intent();
                    ((Intent)localObject2).putExtra("Contact_User", "gh_43f2581f6fd6");
                    com.tencent.mm.bi.d.b(((bg)localObject1).context, "profile", ".ui.ContactInfoUI", (Intent)localObject2);
                  }
                }
                if (("wx9181ed3f223e6d76".equals(localObject2)) || ("wx2fe12a395c426fcf".equals(localObject2)))
                {
                  w.i("MicroMsg.TimeLineClickEvent", "hy: shake new year closed. try to go to shake TV");
                  localObject1 = new Intent();
                  ((Intent)localObject1).putExtra("shake_tv", true);
                  com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "shake", ".ui.ShakeReportUI", (Intent)localObject1);
                  i = 1;
                }
                else if ("wx751a1acca5688ba3".equals(localObject2))
                {
                  localObject2 = new Intent();
                  ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 5);
                  if ((!com.tencent.mm.p.a.aP(((bg)localObject1).context)) && (!com.tencent.mm.p.a.aO(((bg)localObject1).context))) {
                    com.tencent.mm.bi.d.b(((bg)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
                  }
                  i = 1;
                }
                else if ("wxfbc915ff7c30e335".equals(localObject2))
                {
                  localObject2 = new Intent();
                  ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 1);
                  if ((!com.tencent.mm.p.a.aP(((bg)localObject1).context)) && (!com.tencent.mm.p.a.aO(((bg)localObject1).context))) {
                    com.tencent.mm.bi.d.b(((bg)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
                  }
                  i = 1;
                }
                else if ("wx482a4001c37e2b74".equals(localObject2))
                {
                  localObject2 = new Intent();
                  ((Intent)localObject2).putExtra("BaseScanUI_select_scan_mode", 2);
                  if ((!com.tencent.mm.p.a.aP(((bg)localObject1).context)) && (!com.tencent.mm.p.a.aO(((bg)localObject1).context))) {
                    com.tencent.mm.bi.d.b(((bg)localObject1).context, "scanner", ".ui.BaseScanUI", (Intent)localObject2);
                  }
                  i = 1;
                }
                else if ("wxaf060266bfa9a35c".equals(localObject2))
                {
                  if (!com.tencent.mm.as.c.JU())
                  {
                    i = 1;
                  }
                  else
                  {
                    localObject2 = new Intent();
                    ((Intent)localObject2).putExtra("shake_tv", true);
                    com.tencent.mm.bi.d.b(((bg)localObject1).context, "shake", ".ui.ShakeReportUI", (Intent)localObject2);
                    i = 1;
                  }
                }
                else
                {
                  i = 0;
                }
              }
            }
            else
            {
              localbhc = (bhc)paramAnonymousView.getTag();
              if ((localbhc == null) || (localbhc.uyt == null))
              {
                w.e("MicroMsg.TimeLineClickEvent", "appInfo is null");
                GMTrace.o(8586981801984L, 63978);
                return;
              }
              str1 = localbhc.uyt.nas;
              str2 = com.tencent.mm.plugin.sns.c.a.ifN.bC(str1);
              if ((!com.tencent.mm.sdk.platformtools.bg.mZ(str2)) && (com.tencent.mm.plugin.sns.c.a.ifN.bE(str1))) {
                if (localbhc == null)
                {
                  paramAnonymousView = null;
                  if (localbhc.uyu.tKc != 1) {
                    break label902;
                  }
                  i = 2;
                }
              }
            }
          }
        }
        for (;;)
        {
          localObject2 = null;
          localObject1 = localObject2;
          if (localbhc.qfM != null)
          {
            localObject1 = localObject2;
            if (localbhc.qfM.tuc != null) {
              localObject1 = localbhc.qfM.tuc.ttV;
            }
          }
          localObject2 = new mt();
          ((mt)localObject2).fKX.context = bg.this.context;
          ((mt)localObject2).fKX.scene = 4;
          ((mt)localObject2).fKX.fKY = str1;
          ((mt)localObject2).fKX.packageName = str2;
          ((mt)localObject2).fKX.msgType = i;
          ((mt)localObject2).fKX.fFB = paramAnonymousView;
          ((mt)localObject2).fKX.mediaTagName = ((String)localObject1);
          ((mt)localObject2).fKX.fKZ = 5;
          ((mt)localObject2).fKX.fLa = 0L;
          ((mt)localObject2).fKX.fLb = localbhc.nas;
          com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
          paramAnonymousView = new gi();
          paramAnonymousView.fCx.actionCode = 2;
          paramAnonymousView.fCx.scene = 3;
          paramAnonymousView.fCx.extMsg = "timeline_src=3";
          paramAnonymousView.fCx.appId = str1;
          paramAnonymousView.fCx.context = bg.this.context;
          com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
          GMTrace.o(8586981801984L, 63978);
          return;
          paramAnonymousView = localbhc.jWW;
          break;
          label902:
          if (localbhc.uyu.tKc == 3)
          {
            i = 5;
            continue;
            paramAnonymousView = bg.this;
            paramAnonymousView = com.tencent.mm.plugin.sns.c.a.ifN.f(paramAnonymousView.context, str1, "timeline");
            if ((paramAnonymousView == null) || (paramAnonymousView.length() == 0))
            {
              GMTrace.o(8586981801984L, 63978);
              return;
            }
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", paramAnonymousView);
            ((Intent)localObject1).putExtra("shortUrl", paramAnonymousView);
            ((Intent)localObject1).putExtra("useJs", true);
            ((Intent)localObject1).putExtra("type", 65281);
            ((Intent)localObject1).putExtra("geta8key_scene", 2);
            com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject1, bg.this.context);
            GMTrace.o(8586981801984L, 63978);
          }
          else
          {
            i = 2;
          }
        }
      }
    };
    this.qSu = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(8339886964736L, 62137);
        if ((paramAnonymousView.getTag() instanceof bd))
        {
          paramAnonymousView = (bd)paramAnonymousView.getTag();
          if (com.tencent.mm.sdk.platformtools.bg.mZ(paramAnonymousView.qSd))
          {
            w.e("MicroMsg.TimeLineClickEvent", "show source profile fail, username is null");
            Toast.makeText(bg.this.context, bg.this.context.getString(i.j.eas, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
            GMTrace.o(8339886964736L, 62137);
            return;
          }
          com.tencent.mm.kernel.h.xA();
          Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(paramAnonymousView.qSd);
          if ((localObject != null) && (((af)localObject).field_username.equals(paramAnonymousView.qSd)))
          {
            localObject = new Intent();
            ((Intent)localObject).addFlags(268435456);
            ((Intent)localObject).putExtra("Contact_User", paramAnonymousView.qSd);
            g.paX.z(10298, paramAnonymousView.qSd + ",37");
            ((Intent)localObject).putExtra("Contact_Scene", 37);
            com.tencent.mm.plugin.sns.c.a.ifM.d((Intent)localObject, bg.this.context);
            GMTrace.o(8339886964736L, 62137);
            return;
          }
          ag.a.hfr.a(paramAnonymousView.qSd, "", new ag.b.a()
          {
            public final void p(String paramAnonymous2String, boolean paramAnonymous2Boolean)
            {
              GMTrace.i(8540810903552L, 63634);
              if (bg.this.ikZ != null) {
                bg.this.ikZ.dismiss();
              }
              if (!paramAnonymous2Boolean)
              {
                Toast.makeText(bg.this.context, bg.this.context.getString(i.j.eas, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
                GMTrace.o(8540810903552L, 63634);
                return;
              }
              com.tencent.mm.ab.b.w(paramAnonymous2String, 3);
              com.tencent.mm.ab.n.Dv().hD(paramAnonymous2String);
              Intent localIntent = new Intent();
              localIntent.addFlags(268435456);
              localIntent.putExtra("Contact_User", paramAnonymous2String);
              localIntent.putExtra("Contact_Scene", 37);
              com.tencent.mm.kernel.h.xA();
              x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(paramAnonymous2String);
              if ((localx != null) && (localx.bPH()))
              {
                g.paX.z(10298, paramAnonymous2String + ",37");
                localIntent.putExtra("Contact_Scene", 37);
              }
              com.tencent.mm.plugin.sns.c.a.ifM.d(localIntent, bg.this.context);
              GMTrace.o(8540810903552L, 63634);
            }
          });
          localObject = bg.this;
          Context localContext = bg.this.context;
          bg.this.context.getString(i.j.dxm);
          ((bg)localObject).ikZ = com.tencent.mm.ui.base.h.a(localContext, bg.this.context.getString(i.j.dxB), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(8322841313280L, 62010);
              ag.a.hfr.gt(paramAnonymousView.qSd);
              GMTrace.o(8322841313280L, 62010);
            }
          });
        }
        GMTrace.o(8339886964736L, 62137);
      }
    };
    this.qSv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8592618946560L, 64020);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8592618946560L, 64020);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).qAK;
        if (((bhc)localObject1).uyu.tKd.size() > 0)
        {
          localObject2 = ae.bhp().HA(((r)localObject2).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v((m)localObject2);
          }
          localObject1 = ((amn)((bhc)localObject1).uyu.tKd.get(0)).qyB;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("key_Product_xml", (String)localObject1);
          ((Intent)localObject2).putExtra("key_ProductUI_getProductInfoScene", 2);
          com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "scanner", ".ui.ProductUI", (Intent)localObject2);
        }
        GMTrace.o(8592618946560L, 64020);
      }
    };
    this.qSw = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8354114043904L, 62243);
        w.d("MicroMsg.TimeLineClickEvent", "hardTVRedirectListener");
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8354114043904L, 62243);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).qAK;
        if (((bhc)localObject1).uyu.tKd.size() > 0)
        {
          localObject2 = ae.bhp().HA(((r)localObject2).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v((m)localObject2);
          }
          localObject1 = ((amn)((bhc)localObject1).uyu.tKd.get(0)).qyB;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("key_TV_xml", (String)localObject1);
          ((Intent)localObject2).putExtra("key_TV_getProductInfoScene", 2);
          com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "shake", ".ui.TVInfoUI", (Intent)localObject2);
        }
        GMTrace.o(8354114043904L, 62243);
      }
    };
    this.qSx = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8466454282240L, 63080);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8466454282240L, 63080);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).qAK;
        if (((bhc)localObject1).uyu.tKd.size() > 0)
        {
          localObject2 = ae.bhp().HA(((r)localObject2).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v((m)localObject2);
          }
          localObject1 = ((amn)((bhc)localObject1).uyu.tKd.get(0)).qyB;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
          ((Intent)localObject2).putExtra("preceding_scence", 10);
          ((Intent)localObject2).putExtra("download_entrance_scene", 13);
          com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "emoji", ".ui.EmojiStoreDetailUI", (Intent)localObject2);
        }
        GMTrace.o(8466454282240L, 63080);
      }
    };
    this.qSy = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8391292354560L, 62520);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8391292354560L, 62520);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).qAK;
        if (((bhc)localObject1).uyu.tKd.size() > 0)
        {
          localObject2 = ae.bhp().HA(((r)localObject2).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v((m)localObject2);
          }
          localObject1 = ((amn)((bhc)localObject1).uyu.tKd.get(0)).qyB;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
          ((Intent)localObject2).putExtra("extra_scence", 13);
          com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "emoji", ".ui.v2.EmojiStoreV2DesignerUI", (Intent)localObject2);
        }
        GMTrace.o(8391292354560L, 62520);
      }
    };
    this.qSz = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8344718802944L, 62173);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8344718802944L, 62173);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).qAK;
        if (((bhc)localObject1).uyu.tKd.size() > 0)
        {
          localObject2 = ae.bhp().HA(((r)localObject2).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v((m)localObject2);
          }
          localObject1 = ((amn)((bhc)localObject1).uyu.tKd.get(0)).qyB;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
          ((Intent)localObject2).putExtra("extra_scence", 13);
          com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "emoji", ".ui.EmojiStoreTopicUI", (Intent)localObject2);
        }
        GMTrace.o(8344718802944L, 62173);
      }
    };
    this.qSA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8539334508544L, 63623);
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8539334508544L, 63623);
          return;
        }
        Object localObject2 = (r)paramAnonymousView.getTag();
        Object localObject1 = ((r)localObject2).qAK;
        if (((bhc)localObject1).uyu.tKd.size() > 0)
        {
          localObject2 = ae.bhp().HA(((r)localObject2).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v((m)localObject2);
          }
          localObject1 = ((amn)((bhc)localObject1).uyu.tKd.get(0)).qyB;
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("sns_object_data", (String)localObject1);
          com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", (Intent)localObject2);
        }
        GMTrace.o(8539334508544L, 63623);
      }
    };
    this.qSB = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8535039541248L, 63591);
        boolean bool = paramAnonymousView.getTag() instanceof r;
        w.d("MicroMsg.TimeLineClickEvent", "musicRedirectListener click " + bool);
        if (!bool)
        {
          GMTrace.o(8535039541248L, 63591);
          return;
        }
        r localr = (r)paramAnonymousView.getTag();
        bhc localbhc = localr.qAK;
        String str;
        if (!bg.Fb(localbhc.nas)) {
          if ((!com.tencent.mm.p.a.aQ(bg.this.context)) && (!com.tencent.mm.p.a.aO(bg.this.context)))
          {
            g.paX.z(10090, "1,0");
            if (localbhc.uyu.tKd.size() > 0)
            {
              amn localamn = (amn)localbhc.uyu.tKd.get(0);
              if (bg.this.scene != 0) {
                break label287;
              }
              paramAnonymousView = com.tencent.mm.modelsns.b.gM(738);
              com.tencent.mm.modelsns.b localb = paramAnonymousView.lh(localbhc.nas).lh(localbhc.jWW);
              if (localbhc.uyt != null) {
                break label297;
              }
              str = "";
              label192:
              localb.lh(str).lh(localamn.fuw).lh(localamn.mCK).lh("");
              paramAnonymousView.LJ();
            }
            if (!localr.qAL) {
              break label309;
            }
            com.tencent.mm.as.b.a(((com.tencent.mm.as.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.as.a.a.class)).a(ae.zp(), localbhc, 9));
          }
        }
        for (;;)
        {
          if (bg.this.qSr != null) {
            bg.this.qSr.bmI();
          }
          GMTrace.o(8535039541248L, 63591);
          return;
          label287:
          paramAnonymousView = com.tencent.mm.modelsns.b.gN(738);
          break;
          label297:
          str = localbhc.uyt.nas;
          break label192;
          label309:
          com.tencent.mm.as.b.b(((com.tencent.mm.as.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.as.a.a.class)).a(ae.zp(), localbhc, 1));
          continue;
          g.paX.z(10231, "1");
          com.tencent.mm.as.b.JL();
        }
      }
    };
    this.qSC = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8675565502464L, 64638);
        w.i("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener");
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8675565502464L, 64638);
          return;
        }
        Object localObject = (r)paramAnonymousView.getTag();
        paramAnonymousView = ((r)localObject).qAK;
        localObject = ae.bhp().HA(((r)localObject).fxL);
        if (bg.this.qyj != null) {
          bg.this.qyj.bgU().v((m)localObject);
        }
        if (paramAnonymousView.uyA == null)
        {
          w.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener weappInfo is null");
          GMTrace.o(8675565502464L, 64638);
          return;
        }
        String str1 = paramAnonymousView.uyA.username;
        String str2 = paramAnonymousView.uyA.path;
        w.i("MicroMsg.TimeLineClickEvent", "username: " + str1 + "pagepath: " + str2);
        px localpx = new px();
        localpx.fNL.userName = str1;
        localpx.fNL.fNN = str2;
        localpx.fNL.scene = 1009;
        localpx.fNL.fty = (paramAnonymousView.nas + ":" + paramAnonymousView.jWW);
        paramAnonymousView = new Bundle();
        paramAnonymousView.putString("stat_send_msg_user", ((m)localObject).field_userName);
        paramAnonymousView.putString("stat_msg_id", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(((m)localObject).field_snsId));
        com.tencent.mm.sdk.b.a.uLm.m(localpx);
        GMTrace.o(8675565502464L, 64638);
      }
    };
    this.qSD = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8673820672000L, 64625);
        w.i("MicroMsg.TimeLineClickEvent", "appbrandHomeRedirectListener");
        if (!(paramAnonymousView.getTag() instanceof bhc))
        {
          GMTrace.o(8673820672000L, 64625);
          return;
        }
        paramAnonymousView = (bhc)paramAnonymousView.getTag();
        if (paramAnonymousView.uyA == null)
        {
          w.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener username is null");
          GMTrace.o(8673820672000L, 64625);
          return;
        }
        String str = paramAnonymousView.uyA.username;
        px localpx = new px();
        w.i("MicroMsg.TimeLineClickEvent", "username: " + str);
        localpx.fNL.userName = str;
        localpx.fNL.scene = 1009;
        localpx.fNL.fty = (paramAnonymousView.nas + ":" + paramAnonymousView.jWW);
        com.tencent.mm.sdk.b.a.uLm.m(localpx);
        GMTrace.o(8673820672000L, 64625);
      }
    };
    this.qSE = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8706704015360L, 64870);
        w.i("MicroMsg.TimeLineClickEvent", "hardMallProductRedirectListener");
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8706704015360L, 64870);
          return;
        }
        Object localObject = (r)paramAnonymousView.getTag();
        paramAnonymousView = ((r)localObject).qAK;
        if (paramAnonymousView.uyu.tKd.size() > 0)
        {
          localObject = ae.bhp().HA(((r)localObject).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v((m)localObject);
          }
          paramAnonymousView = ((amn)paramAnonymousView.uyu.tKd.get(0)).qyB;
          localObject = new Intent();
          ((Intent)localObject).putExtra("key_product_scene", 2);
          ((Intent)localObject).putExtra("key_product_info", paramAnonymousView);
          com.tencent.mm.bi.d.b(bg.this.context, "product", ".ui.MallProductUI", (Intent)localObject);
        }
        GMTrace.o(8706704015360L, 64870);
      }
    };
    this.qSF = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8673552236544L, 64623);
        w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener");
        if (!(paramAnonymousView.getTag() instanceof r))
        {
          GMTrace.o(8673552236544L, 64623);
          return;
        }
        Object localObject = (r)paramAnonymousView.getTag();
        paramAnonymousView = ((r)localObject).qAK;
        if (paramAnonymousView.uyu.tKd.size() > 0)
        {
          localObject = ae.bhp().HA(((r)localObject).fxL);
          if (bg.this.qyj != null) {
            bg.this.qyj.bgU().v((m)localObject);
          }
          paramAnonymousView = ((amn)paramAnonymousView.uyu.tKd.get(0)).qyB;
          localObject = new Intent();
          ((Intent)localObject).putExtra("key_from_scene", 12);
          if (!TextUtils.isEmpty(paramAnonymousView))
          {
            String[] arrayOfString = paramAnonymousView.split("#");
            if (arrayOfString.length >= 2)
            {
              w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData[0]:" + arrayOfString[0]);
              ((Intent)localObject).putExtra("key_card_id", arrayOfString[0]);
              ((Intent)localObject).putExtra("key_card_ext", arrayOfString[1]);
              com.tencent.mm.bi.d.b(bg.this.context, "card", ".ui.CardDetailUI", (Intent)localObject);
              GMTrace.o(8673552236544L, 64623);
              return;
            }
            if (arrayOfString.length == 1)
            {
              w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include cardExt");
              w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener card_id :" + paramAnonymousView);
              ((Intent)localObject).putExtra("key_card_id", arrayOfString[0]);
              ((Intent)localObject).putExtra("key_card_ext", "");
              com.tencent.mm.bi.d.b(bg.this.context, "card", ".ui.CardDetailUI", (Intent)localObject);
              GMTrace.o(8673552236544L, 64623);
              return;
            }
            w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData not include card_id and cardExt");
            w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData :" + paramAnonymousView);
            GMTrace.o(8673552236544L, 64623);
            return;
          }
          w.i("MicroMsg.TimeLineClickEvent", "cardRediretListener userData is empty");
        }
        GMTrace.o(8673552236544L, 64623);
      }
    };
    this.context = paramContext;
    this.qSr = parama;
    this.scene = paramInt;
    this.qyj = paramad;
    GMTrace.o(8562956828672L, 63799);
  }
  
  protected static boolean Fb(String paramString)
  {
    GMTrace.i(8563091046400L, 63800);
    Object localObject = new jf();
    ((jf)localObject).fGd.action = -2;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((jf)localObject).fGe.fGf;
    if ((localObject != null) && (com.tencent.mm.as.b.d((aol)localObject)) && (paramString.equals(((aol)localObject).tIh)) && (com.tencent.mm.as.b.JN()))
    {
      GMTrace.o(8563091046400L, 63800);
      return true;
    }
    GMTrace.o(8563091046400L, 63800);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void bmI();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */