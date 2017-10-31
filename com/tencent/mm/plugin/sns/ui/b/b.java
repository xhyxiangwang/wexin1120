package com.tencent.mm.plugin.sns.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.bw.a.e;
import com.tencent.mm.g.a.df;
import com.tencent.mm.g.a.df.b;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.g.a.mr;
import com.tencent.mm.g.a.px;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ac;
import com.tencent.mm.plugin.sns.model.ad;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.model.au;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.storage.b.b;
import com.tencent.mm.plugin.sns.storage.b.b.a;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI;
import com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.ag;
import com.tencent.mm.plugin.sns.ui.ak;
import com.tencent.mm.plugin.sns.ui.av.a;
import com.tencent.mm.plugin.sns.ui.ax;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.asw;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdg;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bds;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.tools.MaskImageButton;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class b
{
  public Activity activity;
  private ClipboardManager lWu;
  public View.OnClickListener qBP;
  public b.e qUT;
  public View.OnClickListener qVA;
  public View.OnClickListener qVB;
  public View.OnClickListener qVC;
  public View.OnClickListener qVD;
  public AdapterView.OnItemClickListener qVE;
  public View.OnClickListener qVF;
  public View.OnClickListener qVG;
  public View.OnClickListener qVH;
  public av.a qVI;
  public int qVJ;
  public View.OnClickListener qVK;
  public a qVc;
  public View.OnClickListener qVd;
  public View.OnLongClickListener qVe;
  public c qVf;
  public View.OnClickListener qVg;
  public View.OnClickListener qVh;
  public View.OnClickListener qVi;
  public View.OnClickListener qVj;
  public View.OnClickListener qVk;
  public View.OnClickListener qVl;
  public View.OnClickListener qVm;
  public View.OnClickListener qVn;
  public View.OnClickListener qVo;
  public c qVp;
  public c qVq;
  public c qVr;
  public c qVs;
  public c qVt;
  public c qVu;
  public c qVv;
  public View.OnTouchListener qVw;
  public View.OnClickListener qVx;
  public View.OnClickListener qVy;
  public View.OnClickListener qVz;
  public ad qyj;
  public int scene;
  
  public b(int paramInt, Activity paramActivity, ad paramad)
  {
    GMTrace.i(8652748488704L, 64468);
    this.scene = 0;
    this.qVF = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8656909238272L, 64499);
        if (paramAnonymousView.getTag() == null)
        {
          GMTrace.o(8656909238272L, 64499);
          return;
        }
        com.tencent.mm.plugin.sns.storage.m localm = b.cE(paramAnonymousView);
        if ((localm == null) || (!localm.uF(32)))
        {
          GMTrace.o(8656909238272L, 64499);
          return;
        }
        bhc localbhc = localm.bjL();
        if ((localbhc.uyu.tKc == 15) && (localbhc.uyB != 1))
        {
          b.this.b(paramAnonymousView, localm, 1001, localm.bkr().bjH().bip());
          GMTrace.o(8656909238272L, 64499);
          return;
        }
        if (((localbhc.uyu.tKc == 1) && (localbhc.uyu.tKd.size() == 1)) || (localbhc.uyu.tKc == 7)) {
          b.this.a(paramAnonymousView, localm, 1001, localm.bkr().bjH().bip());
        }
        GMTrace.o(8656909238272L, 64499);
      }
    };
    this.qVG = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8650601005056L, 64452);
        if (paramAnonymousView.getTag() == null)
        {
          GMTrace.o(8650601005056L, 64452);
          return;
        }
        com.tencent.mm.plugin.sns.storage.m localm = b.cE(paramAnonymousView);
        if ((localm == null) || (!localm.uF(32)))
        {
          GMTrace.o(8650601005056L, 64452);
          return;
        }
        bhc localbhc = localm.bjL();
        if ((localbhc.uyu.tKc == 15) && (localbhc.uyB != 1))
        {
          b.this.b(paramAnonymousView, localm, 1002, localm.bkr().bjH().biq());
          GMTrace.o(8650601005056L, 64452);
          return;
        }
        if (((localbhc.uyu.tKc == 1) && (localbhc.uyu.tKd.size() == 1)) || (localbhc.uyu.tKc == 7)) {
          b.this.a(paramAnonymousView, localm, 1002, localm.bkr().bjH().biq());
        }
        GMTrace.o(8650601005056L, 64452);
      }
    };
    this.qVK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20054141829120L, 149415);
        Object localObject1 = paramAnonymousView.getTag();
        Object localObject2;
        Object localObject3;
        if ((localObject1 instanceof a.c))
        {
          localObject2 = (a.c)paramAnonymousView.getTag();
          localObject1 = com.tencent.mm.plugin.sns.storage.h.Hz(((a.c)localObject2).fMT);
          localObject3 = ((a.c)localObject2).qTP;
          localObject2 = null;
        }
        for (;;)
        {
          Object localObject4;
          Object localObject5;
          int i;
          label187:
          label336:
          label552:
          label557:
          boolean bool;
          if (localObject1 != null)
          {
            localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr();
            ((com.tencent.mm.plugin.sns.storage.e)localObject4).getSource();
            if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)))
            {
              localObject5 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjJ();
              if ((((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qln) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml)))
              {
                localObject5 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject1);
                if (!bg.mZ((String)localObject5)) {
                  ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_adxml = ((String)localObject5);
                }
                localObject4 = new int[2];
                if (paramAnonymousView != null) {
                  paramAnonymousView.getLocationInWindow((int[])localObject4);
                }
                i = paramAnonymousView.getWidth();
                int j = paramAnonymousView.getHeight();
                if (localObject3 != null)
                {
                  ((TagImageView)localObject3).getLocationInWindow((int[])localObject4);
                  i = ((TagImageView)localObject3).getWidth();
                  j = ((TagImageView)localObject3).getHeight();
                  paramAnonymousView = new Intent();
                  paramAnonymousView.putExtra("img_gallery_left", localObject4[0]);
                  paramAnonymousView.putExtra("img_gallery_top", localObject4[1]);
                  paramAnonymousView.putExtra("img_gallery_width", i);
                  paramAnonymousView.putExtra("img_gallery_height", j);
                  paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
                  paramAnonymousView.putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq());
                  localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
                  if (localObject2 != null)
                  {
                    localObject2 = ((bhc)localObject2).uyu.tKd;
                    if (((List)localObject2).size() > 0) {
                      paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject2).get(0)).uhA);
                    }
                  }
                  paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                  if (b.this.scene != 0) {
                    break label552;
                  }
                  i = 1;
                  paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
                  paramAnonymousView.putExtra("sns_landing_pages_xml", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml);
                  paramAnonymousView.putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkt());
                  paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
                  paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                  paramAnonymousView.putExtra("sns_landing_is_native_sight_ad", true);
                  b.this.activity.startActivity(paramAnonymousView);
                  b.this.activity.overridePendingTransition(0, 0);
                  paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
                  if (b.this.scene != 0) {
                    break label557;
                  }
                }
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 23, i, "", 3, 21, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
                  com.tencent.mm.kernel.h.xA();
                  com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
                  GMTrace.o(20054141829120L, 149415);
                  return;
                  if (!(localObject1 instanceof com.tencent.mm.plugin.sns.storage.m)) {
                    break label1305;
                  }
                  localObject1 = (com.tencent.mm.plugin.sns.storage.m)localObject1;
                  localObject2 = (MMImageView)paramAnonymousView.getTag(i.f.pKs);
                  localObject3 = null;
                  break;
                  if (localObject2 == null) {
                    break label187;
                  }
                  ((MMImageView)localObject2).getLocationInWindow((int[])localObject4);
                  i = ((MMImageView)localObject2).getWidth();
                  j = ((MMImageView)localObject2).getHeight();
                  break label187;
                  i = 2;
                  break label336;
                }
              }
              if ((localObject5 != null) && (((com.tencent.mm.plugin.sns.storage.a)localObject5).qla == 1))
              {
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("key_card_id", ((com.tencent.mm.plugin.sns.storage.a)localObject5).qlc);
                paramAnonymousView.putExtra("key_card_ext", ((com.tencent.mm.plugin.sns.storage.a)localObject5).qld);
                paramAnonymousView.putExtra("key_from_scene", 21);
                paramAnonymousView.putExtra("key_stastic_scene", 15);
                com.tencent.mm.bi.d.b(b.this.activity, "card", ".ui.CardDetailUI", paramAnonymousView);
                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
                if (b.this.scene == 0) {}
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 23, i, "", 3, 11, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
                  com.tencent.mm.kernel.h.xA();
                  com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
                  GMTrace.o(20054141829120L, 149415);
                  return;
                }
              }
              if (b.this.a((com.tencent.mm.plugin.sns.storage.a)localObject5, (com.tencent.mm.plugin.sns.storage.m)localObject1))
              {
                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
                if (b.this.scene == 0) {}
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 23, i, "", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bku(), 31, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
                  com.tencent.mm.kernel.h.xA();
                  com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
                  GMTrace.o(20054141829120L, 149415);
                  return;
                }
              }
            }
            paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
            if (b.this.scene != 0) {
              break label1286;
            }
            i = 1;
            paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 23, i, "", 3, 0, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
            localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bko();
            paramAnonymousView = (View)localObject2;
            if (bg.mZ((String)localObject2)) {
              paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkn();
            }
            w.i("MicroMsg.TimelineClickListener", "adlink url " + paramAnonymousView + " " + ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qlt);
            localObject2 = new Intent();
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qlt != 0) {
              break label1291;
            }
            bool = true;
            label971:
            if (!com.tencent.mm.platformtools.r.icx) {
              break label1302;
            }
            bool = false;
          }
          label1286:
          label1291:
          label1302:
          for (;;)
          {
            localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
            if (b.this.scene == 0) {}
            for (i = 1;; i = 2)
            {
              localObject3 = new SnsAdClick((String)localObject3, i, ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq(), 3, (byte)0);
              if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)))
              {
                localObject5 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjJ();
                if (localObject5 != null) {
                  ((Intent)localObject2).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject5).iLj);
                }
              }
              ((Intent)localObject2).putExtra("KRightBtn", bool);
              localObject5 = new Bundle();
              ((Bundle)localObject5).putParcelable("KSnsAdTag", (Parcelable)localObject3);
              ((Bundle)localObject5).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.sns.storage.e)localObject4).bjL().qBT);
              ((Intent)localObject2).putExtra("jsapiargs", (Bundle)localObject5);
              ((Intent)localObject2).putExtra("rawUrl", paramAnonymousView);
              ((Intent)localObject2).putExtra("useJs", true);
              ((Intent)localObject2).putExtra("srcUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject2).putExtra("stastic_scene", 15);
              ((Intent)localObject2).putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject2).putExtra("pre_username", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject2).putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject2).putExtra("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject2, b.this.activity);
              GMTrace.o(20054141829120L, 149415);
              return;
              i = 2;
              break;
              bool = false;
              break label971;
            }
          }
          label1305:
          localObject1 = null;
          localObject3 = null;
          localObject2 = null;
        }
      }
    };
    this.scene = paramInt;
    this.activity = paramActivity;
    this.qyj = paramad;
    this.qVJ = bg.getInt(com.tencent.mm.k.g.uz().getValue("SnsPOICommentFeedNewUrlSwitch"), 0);
    w.i("MicroMsg.TimelineClickListener", "init POIComment_FeedNewUrl_Switch:%d", new Object[] { Integer.valueOf(this.qVJ) });
    this.lWu = ((ClipboardManager)this.activity.getSystemService("clipboard"));
    this.qVc = new a(this.activity, this.scene, this.qyj);
    this.qVm = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8650064134144L, 64448);
        if ((paramAnonymousView.getTag() == null) || (!(paramAnonymousView.getTag() instanceof Long)))
        {
          GMTrace.o(8650064134144L, 64448);
          return;
        }
        long l = ((Long)paramAnonymousView.getTag()).longValue();
        com.tencent.mm.plugin.sns.storage.e locale = com.tencent.mm.plugin.sns.model.ae.bhr().dI(l);
        com.tencent.mm.plugin.sns.storage.m localm = locale.bjN();
        com.tencent.mm.plugin.sns.a.b.j.a(j.b.pXp, j.a.pXn, locale.bjN());
        locale.getSource();
        paramAnonymousView = localm.bko();
        if (bg.mZ(paramAnonymousView)) {
          paramAnonymousView = localm.bkn();
        }
        for (;;)
        {
          Object localObject1;
          int i;
          Object localObject2;
          if (localm.uF(32))
          {
            localObject1 = localm.bjJ();
            i = -1;
            localObject2 = com.tencent.mm.x.c.c.Cv().Sl("Sns_CanvasAd_DetailLink_JumpWay");
            if (((com.tencent.mm.storage.a)localObject2).isValid()) {
              i = bg.getInt(((com.tencent.mm.storage.a)localObject2).field_value, -1);
            }
            if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.a)localObject1).qla == 1))
            {
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("key_card_id", ((com.tencent.mm.plugin.sns.storage.a)localObject1).qlc);
              paramAnonymousView.putExtra("key_card_ext", ((com.tencent.mm.plugin.sns.storage.a)localObject1).qld);
              paramAnonymousView.putExtra("key_from_scene", 21);
              paramAnonymousView.putExtra("key_stastic_scene", 15);
              com.tencent.mm.bi.d.b(b.this.activity, "card", ".ui.CardDetailUI", paramAnonymousView);
              paramAnonymousView = localm.bkp();
              if (b.this.scene == 0) {}
              for (i = 1;; i = 2)
              {
                paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 3, i, "", localm.bku(), 11, localm.bjL().qBT, localm.bjM());
                com.tencent.mm.kernel.h.xA();
                com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
                GMTrace.o(8650064134144L, 64448);
                return;
              }
            }
            if ((localObject1 != null) && (i == 1))
            {
              if ((localm.bjH().qln) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(localm.bkr().field_adxml)))
              {
                paramAnonymousView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(localm);
                if (!bg.mZ(paramAnonymousView)) {
                  locale.field_adxml = paramAnonymousView;
                }
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", localm.bjM());
                paramAnonymousView.putExtra("sns_landing_pages_ux_info", localm.bkq());
                paramAnonymousView.putExtra("sns_landing_pages_aid", localm.bkl());
                paramAnonymousView.putExtra("sns_landing_pages_traceid", localm.bkm());
                localObject1 = localm.bjL();
                if (localObject1 != null)
                {
                  localObject1 = ((bhc)localObject1).uyu.tKd;
                  if (((List)localObject1).size() > 0) {
                    paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject1).get(0)).uhA);
                  }
                }
                paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                if (b.this.scene == 0)
                {
                  i = 9;
                  paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
                  paramAnonymousView.putExtra("sns_landing_pages_xml", localm.bkr().field_adxml);
                  paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
                  paramAnonymousView.putExtra("sns_landing_pages_rec_src", localm.bkt());
                  paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
                  b.this.activity.startActivity(paramAnonymousView);
                  b.this.activity.overridePendingTransition(0, 0);
                  paramAnonymousView = localm.bkp();
                  if (b.this.scene != 0) {
                    break label666;
                  }
                }
                label666:
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 3, i, "", localm.bku(), 21, localm.bjL().qBT, localm.bjM());
                  com.tencent.mm.kernel.h.xA();
                  com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
                  GMTrace.o(8650064134144L, 64448);
                  return;
                  i = 10;
                  break;
                }
              }
            }
            else if ((localObject1 != null) && (i == 0))
            {
              if ((!localm.bjH().qln) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(localm.bkr().field_adxml))) {
                break label1757;
              }
              localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(localm);
              if (!bg.mZ((String)localObject1)) {
                locale.field_adxml = ((String)localObject1);
              }
              localObject1 = com.tencent.mm.c.f.p(localm.bkr().field_adxml, "adxml");
              if (localObject1 != null)
              {
                localObject1 = bg.ap((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareWebUrl"), "");
                if (!bg.mZ((String)localObject1)) {
                  paramAnonymousView = (View)localObject1;
                }
              }
            }
          }
          label798:
          label912:
          label1641:
          label1746:
          label1752:
          label1757:
          for (;;)
          {
            localObject1 = localm.bkp();
            boolean bool;
            if (b.this.scene == 0)
            {
              i = 1;
              localObject1 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject1, 3, i, "", localm.bku(), 0, localm.bjL().qBT, localm.bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
              w.i("MicroMsg.TimelineClickListener", "adlink url " + paramAnonymousView + " " + localm.bjH().qlt);
              localObject1 = new Intent();
              if (localm.bjH().qlt != 0) {
                break label1746;
              }
              bool = true;
              if (com.tencent.mm.platformtools.r.icx) {
                bool = false;
              }
              localObject2 = localm.bkp();
              if (b.this.scene != 0) {
                break label1752;
              }
            }
            for (i = 1;; i = 2)
            {
              localObject2 = new SnsAdClick((String)localObject2, i, localm.field_snsId, localm.bkq(), localm.bku(), (byte)0);
              if (localm.uF(32))
              {
                localObject3 = localm.bjJ();
                if (localObject3 != null) {
                  ((Intent)localObject1).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject3).iLj);
                }
              }
              ((Intent)localObject1).putExtra("KRightBtn", bool);
              Object localObject3 = new Bundle();
              ((Bundle)localObject3).putParcelable("KSnsAdTag", (Parcelable)localObject2);
              ((Bundle)localObject3).putString("key_snsad_statextstr", locale.bjL().qBT);
              ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject3);
              ((Intent)localObject1).putExtra("rawUrl", paramAnonymousView);
              ((Intent)localObject1).putExtra("useJs", true);
              ((Intent)localObject1).putExtra("srcUsername", localm.field_userName);
              ((Intent)localObject1).putExtra("sns_local_id", localm.bkg());
              ((Intent)localObject1).putExtra("stastic_scene", 15);
              ((Intent)localObject1).putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId));
              ((Intent)localObject1).putExtra("pre_username", localm.field_userName);
              ((Intent)localObject1).putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId));
              ((Intent)localObject1).putExtra("preUsername", localm.field_userName);
              com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject1, b.this.activity);
              GMTrace.o(8650064134144L, 64448);
              return;
              w.e("MicroMsg.TimelineClickListener", "parse landingpagexml is error,landingpagexml is " + localm.bkr().field_adxml);
              break;
              if ((localObject1 != null) && (i == -1) && (((com.tencent.mm.plugin.sns.storage.a)localObject1).qla == 3))
              {
                if ((!localm.bjH().qln) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(localm.bkr().field_adxml))) {
                  break label1757;
                }
                paramAnonymousView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(localm);
                if (!bg.mZ(paramAnonymousView)) {
                  locale.field_adxml = paramAnonymousView;
                }
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", localm.bjM());
                paramAnonymousView.putExtra("sns_landing_pages_ux_info", localm.bkq());
                paramAnonymousView.putExtra("sns_landing_pages_aid", localm.bkl());
                paramAnonymousView.putExtra("sns_landing_pages_traceid", localm.bkm());
                localObject1 = localm.bjL();
                if (localObject1 != null)
                {
                  localObject1 = ((bhc)localObject1).uyu.tKd;
                  if (((List)localObject1).size() > 0) {
                    paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject1).get(0)).uhA);
                  }
                }
                paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                if (b.this.scene == 0)
                {
                  i = 9;
                  paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
                  paramAnonymousView.putExtra("sns_landing_pages_xml", localm.bkr().field_adxml);
                  paramAnonymousView.putExtra("sns_landing_pages_rec_src", localm.bkt());
                  paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
                  paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
                  b.this.activity.startActivity(paramAnonymousView);
                  b.this.activity.overridePendingTransition(0, 0);
                  paramAnonymousView = localm.bkp();
                  if (b.this.scene != 0) {
                    break label1641;
                  }
                }
                for (i = 1;; i = 2)
                {
                  paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 3, i, "", localm.bku(), 21, localm.bjL().qBT, localm.bjM());
                  com.tencent.mm.kernel.h.xA();
                  com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
                  GMTrace.o(8650064134144L, 64448);
                  return;
                  i = 10;
                  break;
                }
              }
              if (!b.this.a((com.tencent.mm.plugin.sns.storage.a)localObject1, localm)) {
                break label1757;
              }
              paramAnonymousView = localm.bkp();
              if (b.this.scene == 0) {}
              for (i = 1;; i = 2)
              {
                paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 3, i, "", localm.bku(), 31, localm.bjL().qBT, localm.bjM());
                com.tencent.mm.kernel.h.xA();
                com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
                GMTrace.o(8650064134144L, 64448);
                return;
              }
              i = 2;
              break label798;
              bool = false;
              break label912;
            }
          }
        }
      }
    };
    this.qVy = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8657177673728L, 64501);
        if (!(paramAnonymousView.getTag() instanceof String))
        {
          GMTrace.o(8657177673728L, 64501);
          return;
        }
        paramAnonymousView = (String)paramAnonymousView.getTag();
        com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousView);
        if (localm == null)
        {
          GMTrace.o(8657177673728L, 64501);
          return;
        }
        if (localm.uF(32))
        {
          w.i("MicroMsg.TimelineClickListener", "click the ad poi button");
          paramAnonymousView = localm.bkp();
          if (b.this.scene == 0) {}
          for (int i = 1;; i = 2)
          {
            paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 19, i, "", localm.bku(), localm.bjM());
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
            localObject1 = localm.bjJ();
            if (localObject1 != null) {
              break;
            }
            w.e("MicroMsg.TimelineClickListener", "the adInfo is null");
            GMTrace.o(8657177673728L, 64501);
            return;
          }
          if (bg.mZ(((com.tencent.mm.plugin.sns.storage.a)localObject1).qli))
          {
            w.e("MicroMsg.TimelineClickListener", "the adActionPOILink is null");
            GMTrace.o(8657177673728L, 64501);
            return;
          }
          label341:
          long l;
          if (b.this.scene == 0)
          {
            paramAnonymousView = com.tencent.mm.modelsns.b.gM(724);
            paramAnonymousView.lh(com.tencent.mm.plugin.sns.data.i.g(localm)).gP(localm.field_type).bA(localm.uF(32)).lh(localm.bkq()).lh("").lh("").lh("").lh("").lh(((com.tencent.mm.plugin.sns.storage.a)localObject1).qlh).lh("").lh("");
            paramAnonymousView.LJ();
            w.i("MicroMsg.TimelineClickListener", "open webview url : " + ((com.tencent.mm.plugin.sns.storage.a)localObject1).qli);
            paramAnonymousView = new Intent();
            localObject2 = localm.bkp();
            if (b.this.scene != 0) {
              break label588;
            }
            i = 1;
            l = localm.field_snsId;
            localObject3 = localm.bkq();
            if (localm.field_type != 1) {
              break label593;
            }
          }
          label588:
          label593:
          for (int j = 1;; j = 2)
          {
            localObject2 = new SnsAdClick((String)localObject2, i, l, (String)localObject3, j);
            if ((localm != null) && (localm.uF(32)))
            {
              localObject3 = localm.bjJ();
              if (localObject3 != null) {
                paramAnonymousView.putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject3).iLj);
              }
            }
            localObject3 = new Bundle();
            ((Bundle)localObject3).putParcelable("KSnsAdTag", (Parcelable)localObject2);
            paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject3);
            paramAnonymousView.putExtra("useJs", true);
            paramAnonymousView.putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId));
            paramAnonymousView.putExtra("pre_username", localm.field_userName);
            paramAnonymousView.putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(localm.field_snsId));
            paramAnonymousView.putExtra("preUsername", localm.field_userName);
            paramAnonymousView.putExtra("rawUrl", ((com.tencent.mm.plugin.sns.storage.a)localObject1).qli);
            com.tencent.mm.plugin.sns.c.a.ifM.j(paramAnonymousView, b.this.activity);
            GMTrace.o(8657177673728L, 64501);
            return;
            paramAnonymousView = com.tencent.mm.modelsns.b.gN(724);
            break;
            i = 2;
            break label341;
          }
        }
        Object localObject2 = localm.bjL();
        Object localObject3 = ((bhc)localObject2).uys;
        Object localObject1 = new Intent();
        if (b.this.scene == 0) {}
        for (paramAnonymousView = com.tencent.mm.modelsns.b.gM(724);; paramAnonymousView = com.tencent.mm.modelsns.b.gN(724))
        {
          paramAnonymousView.lh(com.tencent.mm.plugin.sns.data.i.g(localm)).gP(localm.field_type).bA(localm.uF(32)).lh(localm.bkq()).lh(((akv)localObject3).ufI).gP(((akv)localObject3).qCx).lh(((akv)localObject3).tDN).lh(((akv)localObject3).tDM).lh(((akv)localObject3).nmP).lh(((akv)localObject3).qCv).lh(((akv)localObject3).huL);
          paramAnonymousView.LJ();
          if (!bg.mZ(((akv)localObject3).ufI)) {
            break;
          }
          ((Intent)localObject1).putExtra("map_view_type", 7);
          ((Intent)localObject1).putExtra("kwebmap_slat", ((akv)localObject3).tDN);
          ((Intent)localObject1).putExtra("kwebmap_lng", ((akv)localObject3).tDM);
          ((Intent)localObject1).putExtra("kPoiName", ((akv)localObject3).nmP);
          ((Intent)localObject1).putExtra("Kwebmap_locaion", ((akv)localObject3).qCv);
          com.tencent.mm.bi.d.b(b.this.activity, "location", ".ui.RedirectUI", (Intent)localObject1);
          GMTrace.o(8657177673728L, 64501);
          return;
        }
        if (b.this.qVJ == 0) {}
        for (paramAnonymousView = String.format("http://mp.weixin.qq.com/mp/lifedetail?bid=%s&action=list#wechat_redirect", new Object[] { ((akv)localObject3).ufI });; paramAnonymousView = String.format("http://mp.weixin.qq.com/mp/lifedetail?bid=%s&tid=%s&action=list#wechat_redirect", new Object[] { ((akv)localObject3).ufI, ((bhc)localObject2).nas }))
        {
          ((Intent)localObject1).putExtra("rawUrl", paramAnonymousView);
          com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject1, b.this.activity);
          GMTrace.o(8657177673728L, 64501);
          return;
        }
      }
    };
    this.qVC = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8655298625536L, 64487);
        if (!(paramAnonymousView.getTag() instanceof String))
        {
          GMTrace.o(8655298625536L, 64487);
          return;
        }
        paramAnonymousView = (String)paramAnonymousView.getTag();
        paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousView);
        if (paramAnonymousView == null)
        {
          GMTrace.o(8655298625536L, 64487);
          return;
        }
        if (paramAnonymousView.uF(32))
        {
          w.i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
          paramAnonymousView = paramAnonymousView.bjJ();
          if (paramAnonymousView == null)
          {
            w.e("MicroMsg.TimelineClickListener", "the adInfo is null");
            GMTrace.o(8655298625536L, 64487);
            return;
          }
          if (bg.mZ(paramAnonymousView.qll))
          {
            w.e("MicroMsg.TimelineClickListener", "the adActionExtTailLink is null");
            GMTrace.o(8655298625536L, 64487);
            return;
          }
          w.i("MicroMsg.TimelineClickListener", "open webview url : " + paramAnonymousView.qll);
          Intent localIntent = new Intent();
          localIntent.putExtra("jsapiargs", new Bundle());
          localIntent.putExtra("useJs", true);
          localIntent.putExtra("rawUrl", paramAnonymousView.qll);
          com.tencent.mm.plugin.sns.c.a.ifM.j(localIntent, b.this.activity);
          GMTrace.o(8655298625536L, 64487);
          return;
        }
        GMTrace.o(8655298625536L, 64487);
      }
    };
    this.qVD = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18568485797888L, 138346);
        Object localObject;
        if ((paramAnonymousView.getTag() instanceof a.c))
        {
          localObject = ((a.c)paramAnonymousView.getTag()).fxL;
          localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject);
          if (localObject == null)
          {
            GMTrace.o(18568485797888L, 138346);
            return;
          }
          if (((com.tencent.mm.plugin.sns.storage.m)localObject).uF(32))
          {
            w.i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
            if (b.this.scene != 0) {
              break label136;
            }
          }
        }
        label136:
        for (int i = 1;; i = 2)
        {
          localObject = new com.tencent.mm.plugin.sns.a.b.c(((com.tencent.mm.plugin.sns.storage.m)localObject).bkp(), 24, i, "", ((com.tencent.mm.plugin.sns.storage.m)localObject).bku(), ((com.tencent.mm.plugin.sns.storage.m)localObject).bjM());
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a((k)localObject, 0);
          b.this.cx(paramAnonymousView);
          GMTrace.o(18568485797888L, 138346);
          return;
        }
      }
    };
    this.qVd = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18567277838336L, 138337);
        Object localObject3 = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.TimelineClickListener", "onCommentClick:" + (String)localObject3);
        Intent localIntent = new Intent();
        int i;
        Object localObject2;
        Object localObject1;
        if (((paramAnonymousView instanceof MaskImageButton)) && (((MaskImageButton)paramAnonymousView).wLk != null))
        {
          paramAnonymousView = (String)((MaskImageButton)paramAnonymousView).wLk;
          paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousView);
          if (paramAnonymousView.uF(32))
          {
            i = 1;
            localObject2 = paramAnonymousView.bkp();
            localObject1 = paramAnonymousView.bjH();
            if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject1).qlH == 1) && (!bg.mZ(((com.tencent.mm.plugin.sns.storage.b)localObject1).qlI)))
            {
              paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.b)localObject1).qlI;
              w.i("MicroMsg.TimelineClickListener", "headClickParam url " + paramAnonymousView + " " + ((com.tencent.mm.plugin.sns.storage.b)localObject1).qlJ);
              localObject3 = new Intent();
              if (((com.tencent.mm.plugin.sns.storage.b)localObject1).qlJ == 0) {}
              for (boolean bool = true;; bool = false)
              {
                ((Intent)localObject3).putExtra("KsnsViewId", (String)localObject2);
                ((Intent)localObject3).putExtra("KRightBtn", bool);
                ((Intent)localObject3).putExtra("jsapiargs", new Bundle());
                ((Intent)localObject3).putExtra("rawUrl", paramAnonymousView);
                ((Intent)localObject3).putExtra("useJs", true);
                com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject3, b.this.activity);
                GMTrace.o(18567277838336L, 138337);
                return;
              }
            }
            localObject1 = paramAnonymousView;
            paramAnonymousView = (View)localObject2;
          }
        }
        for (;;)
        {
          int j;
          if (localObject1 != null)
          {
            if (b.this.scene != 0) {
              break label513;
            }
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32))
            {
              j = 722;
              localObject2 = com.tencent.mm.modelsns.b.gM(j);
              ((com.tencent.mm.modelsns.b)localObject2).lh(com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type).bA(((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)).lh(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq()).lh((String)localObject3);
              ((com.tencent.mm.modelsns.b)localObject2).LJ();
            }
          }
          else
          {
            if (i == 0) {
              break label553;
            }
            if (b.this.scene != 0) {
              break label543;
            }
            i = 1;
            label382:
            localObject2 = new SnsAdClick(paramAnonymousView, i, ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).bku(), (byte)0);
            localIntent.putExtra("Contact_User", (String)localObject3);
            localIntent.putExtra("KSnsAdTag", (Parcelable)localObject2);
            com.tencent.mm.plugin.sns.c.a.ifM.d(localIntent, b.this.activity);
            if (b.this.scene != 0) {
              break label548;
            }
          }
          label513:
          label543:
          label548:
          for (i = 1;; i = 2)
          {
            paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 1, i, "", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bku(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
            GMTrace.o(18567277838336L, 138337);
            return;
            j = 721;
            break;
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)) {}
            for (j = 722;; j = 721)
            {
              localObject2 = com.tencent.mm.modelsns.b.gN(j);
              break;
            }
            i = 2;
            break label382;
          }
          label553:
          b.this.qyj.bgU().a((com.tencent.mm.plugin.sns.storage.m)localObject1, true);
          if (b.this.scene == 0) {}
          for (paramAnonymousView = com.tencent.mm.modelsns.b.gM(746);; paramAnonymousView = com.tencent.mm.modelsns.b.gN(746))
          {
            localObject1 = com.tencent.mm.x.m.zF();
            paramAnonymousView.lh((String)localObject3).bA(((String)localObject3).endsWith((String)localObject1));
            paramAnonymousView.b(localIntent, "intent_key_StatisticsOplog");
            localIntent.putExtra("Contact_User", (String)localObject3);
            com.tencent.mm.plugin.sns.c.a.ifM.d(localIntent, b.this.activity);
            GMTrace.o(18567277838336L, 138337);
            return;
          }
          localObject1 = paramAnonymousView;
          paramAnonymousView = "";
          i = 0;
          continue;
          localObject1 = null;
          paramAnonymousView = "";
          i = 0;
        }
      }
    };
    this.qVe = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(18568888451072L, 138349);
        final String str = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.TimelineClickListener", "onCommentLongClick:" + str);
        if (bg.mZ(str))
        {
          GMTrace.o(18568888451072L, 138349);
          return true;
        }
        if (str.equals(com.tencent.mm.plugin.sns.model.ae.bgV()))
        {
          GMTrace.o(18568888451072L, 138349);
          return true;
        }
        final Object localObject;
        final com.tencent.mm.plugin.sns.storage.m localm;
        if ((((MaskImageButton)paramAnonymousView).wLk != null) && ((((MaskImageButton)paramAnonymousView).wLk instanceof String)))
        {
          localObject = (String)((MaskImageButton)paramAnonymousView).wLk;
          new Intent();
          localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject);
          if ((localm == null) || (!localm.uF(32))) {
            break label267;
          }
        }
        label267:
        for (int i = 1;; i = 0)
        {
          if (i != 0)
          {
            GMTrace.o(18568888451072L, 138349);
            return false;
            localObject = "";
            break;
          }
          com.tencent.mm.ui.widget.g localg = new com.tencent.mm.ui.widget.g(b.this.activity, paramAnonymousView);
          localg.wTE = new View.OnCreateContextMenuListener()
          {
            public final void onCreateContextMenu(ContextMenu paramAnonymous2ContextMenu, View paramAnonymous2View, ContextMenu.ContextMenuInfo paramAnonymous2ContextMenuInfo)
            {
              GMTrace.i(18571438587904L, 138368);
              paramAnonymous2ContextMenu.add(0, 0, 0, b.this.activity.getString(i.j.dNr));
              paramAnonymous2ContextMenu.add(1, 1, 0, b.this.activity.getString(i.j.pTX));
              GMTrace.o(18571438587904L, 138368);
            }
          };
          localg.qQT = new o.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              long l = 0L;
              GMTrace.i(18569291104256L, 138352);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              default: 
                GMTrace.o(18569291104256L, 138352);
                return;
              case 0: 
                paramAnonymous2MenuItem = new Intent();
                if (localm == null) {}
                for (;;)
                {
                  paramAnonymous2MenuItem.putExtra("sns_permission_snsinfo_svr_id", l);
                  paramAnonymous2MenuItem.putExtra("sns_permission_userName", str);
                  paramAnonymous2MenuItem.putExtra("sns_permission_anim", true);
                  paramAnonymous2MenuItem.putExtra("sns_permission_block_scene", 5);
                  paramAnonymous2MenuItem.setClass(b.this.activity, SnsPermissionUI.class);
                  b.this.activity.startActivityForResult(paramAnonymous2MenuItem, 11);
                  GMTrace.o(18569291104256L, 138352);
                  return;
                  l = localm.field_snsId;
                }
              }
              Intent localIntent = new Intent();
              paramAnonymous2MenuItem = com.tencent.mm.plugin.sns.model.ae.bhp().HA(localObject);
              if (paramAnonymous2MenuItem == null)
              {
                w.i("MicroMsg.TimelineClickListener", "error get snsinfo by id " + localObject);
                GMTrace.o(18569291104256L, 138352);
                return;
              }
              w.i("MicroMsg.TimelineClickListener", "expose id " + paramAnonymous2MenuItem.bjM() + " " + paramAnonymous2MenuItem.field_userName);
              if (paramAnonymous2MenuItem == null)
              {
                label249:
                localIntent.putExtra("k_expose_msg_id", l);
                if (paramAnonymous2MenuItem != null) {
                  break label338;
                }
              }
              label338:
              for (paramAnonymous2MenuItem = "";; paramAnonymous2MenuItem = paramAnonymous2MenuItem.field_userName)
              {
                localIntent.putExtra("k_username", paramAnonymous2MenuItem);
                localIntent.putExtra("showShare", false);
                localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
                com.tencent.mm.bi.d.b(b.this.activity, "webview", ".ui.tools.WebViewUI", localIntent);
                break;
                l = paramAnonymous2MenuItem.field_snsId;
                break label249;
              }
            }
          };
          localObject = new int[2];
          if ((paramAnonymousView.getTag(a.e.cBY) instanceof int[])) {
            localObject = (int[])paramAnonymousView.getTag(a.e.cBY);
          }
          localg.by(localObject[0], localObject[1]);
          GMTrace.o(18568888451072L, 138349);
          return false;
        }
      }
    };
    this.qVf = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(8651406311424L, 64458);
        paramAnonymousView = (com.tencent.mm.plugin.sns.ui.as)paramAnonymousView.getTag();
        paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ae.bhp().Hz(paramAnonymousView.fMT);
        if (paramAnonymousContextMenuInfo == null)
        {
          GMTrace.o(8651406311424L, 64458);
          return;
        }
        paramAnonymousContextMenu.add(0, 0, 0, b.this.activity.getString(i.j.duU));
        if (com.tencent.mm.bi.d.KT("favorite")) {
          paramAnonymousContextMenu.add(0, 1, 0, b.this.activity.getString(i.j.euj));
        }
        bhc localbhc = paramAnonymousContextMenuInfo.bjL();
        if ((paramAnonymousView.qMx) || ((localbhc != null) && (localbhc.uyw != 1) && (!paramAnonymousView.qMy)))
        {
          if (paramAnonymousView.bnr()) {
            break label154;
          }
          ao.a(paramAnonymousContextMenu, true);
        }
        for (;;)
        {
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, paramAnonymousContextMenuInfo);
          GMTrace.o(8651406311424L, 64458);
          return;
          label154:
          ao.b(paramAnonymousContextMenu, true);
        }
      }
      
      public final boolean cF(View paramAnonymousView)
      {
        GMTrace.i(8651272093696L, 64457);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.as))
        {
          Object localObject = (com.tencent.mm.plugin.sns.ui.as)paramAnonymousView.getTag();
          localObject = com.tencent.mm.plugin.sns.model.ae.bhp().Hz(((com.tencent.mm.plugin.sns.ui.as)localObject).fMT);
          if (localObject == null)
          {
            GMTrace.o(8651272093696L, 64457);
            return false;
          }
          String str = ((com.tencent.mm.plugin.sns.storage.m)localObject).bkg();
          b.this.qVc.a(paramAnonymousView, str, ((com.tencent.mm.plugin.sns.storage.m)localObject).bjL());
          GMTrace.o(8651272093696L, 64457);
          return true;
        }
        GMTrace.o(8651272093696L, 64457);
        return false;
      }
    };
    this.qVt = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(8650869440512L, 64454);
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        if (((paramAnonymousContextMenuInfo instanceof a.c)) || ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.storage.m)) || ((paramAnonymousContextMenuInfo instanceof ak)) || ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.ui.ap))) {
          if ((paramAnonymousContextMenuInfo instanceof a.c)) {
            paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.storage.h.Hz(((a.c)paramAnonymousContextMenuInfo).fMT);
          }
        }
        for (;;)
        {
          if (!paramAnonymousContextMenuInfo.uF(32))
          {
            GMTrace.o(8650869440512L, 64454);
            return;
            if ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.storage.m))
            {
              paramAnonymousContextMenuInfo = (com.tencent.mm.plugin.sns.storage.m)paramAnonymousContextMenuInfo;
              continue;
            }
            if ((paramAnonymousContextMenuInfo instanceof ak))
            {
              paramAnonymousContextMenuInfo = (ak)paramAnonymousContextMenuInfo;
              paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousContextMenuInfo.fxL);
              continue;
            }
            if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
            {
              paramAnonymousContextMenuInfo = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).fAx;
              paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousContextMenuInfo);
            }
          }
          else
          {
            if ((paramAnonymousContextMenuInfo.bjH() == null) || (paramAnonymousContextMenuInfo.bjH().qmi != 1))
            {
              GMTrace.o(8650869440512L, 64454);
              return;
            }
            if (com.tencent.mm.bi.d.KT("favorite"))
            {
              Object localObject = paramAnonymousContextMenuInfo.bjH();
              paramAnonymousContextMenuInfo.bjJ();
              if (((com.tencent.mm.plugin.sns.storage.b)localObject).bin()) {
                paramAnonymousContextMenu.add(0, 20, 0, paramAnonymousView.getContext().getString(i.j.euj));
              }
              localObject = new df();
              ((df)localObject).fxU.fxL = paramAnonymousContextMenuInfo.bkg();
              com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
              if (((df)localObject).fxV.fxs) {
                paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.pQV));
              }
            }
            if (paramAnonymousContextMenuInfo != null) {
              com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, paramAnonymousContextMenuInfo);
            }
            GMTrace.o(8650869440512L, 64454);
            return;
          }
          paramAnonymousContextMenuInfo = null;
        }
      }
      
      public final boolean cF(View paramAnonymousView)
      {
        GMTrace.i(8651003658240L, 64455);
        Object localObject;
        if (((paramAnonymousView.getTag() instanceof a.c)) || ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.storage.m)) || ((paramAnonymousView.getTag() instanceof ak)) || ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)))
        {
          localObject = paramAnonymousView.getTag();
          if ((localObject instanceof a.c)) {
            localObject = com.tencent.mm.plugin.sns.storage.h.Hz(((a.c)paramAnonymousView.getTag()).fMT);
          }
        }
        for (;;)
        {
          if (!((com.tencent.mm.plugin.sns.storage.m)localObject).uF(32))
          {
            GMTrace.o(8651003658240L, 64455);
            return false;
            if ((localObject instanceof com.tencent.mm.plugin.sns.storage.m))
            {
              localObject = (com.tencent.mm.plugin.sns.storage.m)localObject;
              continue;
            }
            if ((localObject instanceof ak))
            {
              localObject = (ak)localObject;
              localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA(((ak)localObject).fxL);
              continue;
            }
            if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
            {
              localObject = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).fAx;
              localObject = com.tencent.mm.plugin.sns.model.ae.bhp().HA((String)localObject);
            }
          }
          else
          {
            if ((((com.tencent.mm.plugin.sns.storage.m)localObject).bjH() == null) || (((com.tencent.mm.plugin.sns.storage.m)localObject).bjH().qmi != 1))
            {
              GMTrace.o(8651003658240L, 64455);
              return false;
            }
            b.this.qVc.a(paramAnonymousView, ((com.tencent.mm.plugin.sns.storage.m)localObject).bkg(), ((com.tencent.mm.plugin.sns.storage.m)localObject).bjL());
            GMTrace.o(8651003658240L, 64455);
            return true;
            GMTrace.o(8651003658240L, 64455);
            return false;
          }
          localObject = null;
        }
      }
    };
    this.qVu = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(8647379779584L, 64428);
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        if (((paramAnonymousContextMenuInfo instanceof a.c)) || ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.storage.m)))
        {
          if (!(paramAnonymousContextMenuInfo instanceof a.c)) {
            break label181;
          }
          paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.storage.h.Hz(((a.c)paramAnonymousContextMenuInfo).fMT);
        }
        for (;;)
        {
          Object localObject;
          com.tencent.mm.plugin.sns.storage.a locala;
          if (com.tencent.mm.bi.d.KT("favorite"))
          {
            localObject = paramAnonymousContextMenuInfo.bjH();
            locala = paramAnonymousContextMenuInfo.bjJ();
            if (((com.tencent.mm.plugin.sns.storage.b)localObject).bim())
            {
              if (!((com.tencent.mm.plugin.sns.storage.b)localObject).qln) {
                break label196;
              }
              paramAnonymousContextMenu.add(0, 2, 0, paramAnonymousView.getContext().getString(i.j.euj));
            }
          }
          for (;;)
          {
            localObject = new df();
            ((df)localObject).fxU.fxL = paramAnonymousContextMenuInfo.bkg();
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
            if (((df)localObject).fxV.fxs) {
              paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.pQV));
            }
            if (paramAnonymousContextMenuInfo != null) {
              com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, paramAnonymousContextMenuInfo);
            }
            GMTrace.o(8647379779584L, 64428);
            return;
            label181:
            if (!(paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.storage.m)) {
              break label227;
            }
            paramAnonymousContextMenuInfo = (com.tencent.mm.plugin.sns.storage.m)paramAnonymousContextMenuInfo;
            break;
            label196:
            if (locala.qla == 0) {
              paramAnonymousContextMenu.add(0, 3, 0, paramAnonymousView.getContext().getString(i.j.euj));
            }
          }
          label227:
          paramAnonymousContextMenuInfo = null;
        }
      }
      
      public final boolean cF(View paramAnonymousView)
      {
        GMTrace.i(8647513997312L, 64429);
        Object localObject;
        if (((paramAnonymousView.getTag() instanceof a.c)) || ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.storage.m)))
        {
          localObject = paramAnonymousView.getTag();
          if ((localObject instanceof a.c)) {
            localObject = com.tencent.mm.plugin.sns.storage.h.Hz(((a.c)paramAnonymousView.getTag()).fMT);
          }
        }
        for (;;)
        {
          b.this.qVc.a(paramAnonymousView, ((com.tencent.mm.plugin.sns.storage.m)localObject).bkg(), ((com.tencent.mm.plugin.sns.storage.m)localObject).bjL());
          GMTrace.o(8647513997312L, 64429);
          return true;
          if ((localObject instanceof com.tencent.mm.plugin.sns.storage.m))
          {
            localObject = (com.tencent.mm.plugin.sns.storage.m)localObject;
            continue;
            GMTrace.o(8647513997312L, 64429);
            return false;
          }
          else
          {
            localObject = null;
          }
        }
      }
    };
    this.qVr = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(18567412056064L, 138338);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.r)) {
          b.this.qVv.onCreateContextMenu(paramAnonymousContextMenu, paramAnonymousView, paramAnonymousContextMenuInfo);
        }
        GMTrace.o(18567412056064L, 138338);
      }
      
      public final boolean cF(View paramAnonymousView)
      {
        GMTrace.i(18567546273792L, 138339);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.r))
        {
          String str = ((com.tencent.mm.plugin.sns.ui.r)paramAnonymousView.getTag()).fxL;
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(str);
          b.this.qVc.a(paramAnonymousView, str, localm.bjL());
          GMTrace.o(18567546273792L, 138339);
          return true;
        }
        GMTrace.o(18567546273792L, 138339);
        return false;
      }
    };
    this.qVq = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(18571707023360L, 138370);
        int j;
        int i;
        if ((paramAnonymousView != null) && ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)))
        {
          paramAnonymousContextMenuInfo = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).fAx;
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousContextMenuInfo);
          if (com.tencent.mm.bi.d.KT("favorite"))
          {
            paramAnonymousContextMenu.add(0, 2, 0, b.this.activity.getString(i.j.euj));
            df localdf = new df();
            localdf.fxU.fxL = paramAnonymousContextMenuInfo;
            com.tencent.mm.sdk.b.a.uLm.m(localdf);
            if (localdf.fxV.fxs) {
              paramAnonymousContextMenu.add(0, 18, 0, b.this.activity.getString(i.j.pQV));
            }
          }
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, localm);
          if (com.tencent.mm.bi.d.KT("photoedit"))
          {
            paramAnonymousContextMenu = paramAnonymousContextMenu.add(0, 21, 0, b.this.activity.getString(i.j.pSa));
            paramAnonymousContextMenuInfo = new int[2];
            if (paramAnonymousView == null) {
              break label255;
            }
            j = paramAnonymousView.getWidth();
            i = paramAnonymousView.getHeight();
            paramAnonymousView.getLocationInWindow(paramAnonymousContextMenuInfo);
          }
        }
        for (;;)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("img_gallery_width", j).putExtra("img_gallery_height", i).putExtra("img_gallery_left", paramAnonymousContextMenuInfo[0]).putExtra("img_gallery_top", paramAnonymousContextMenuInfo[1]);
          paramAnonymousContextMenu.setIntent(paramAnonymousView);
          GMTrace.o(18571707023360L, 138370);
          return;
          label255:
          i = 0;
          j = 0;
        }
      }
      
      public final boolean cF(View paramAnonymousView)
      {
        GMTrace.i(18571841241088L, 138371);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
        {
          String str = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).fAx;
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(str);
          b.this.qVc.a(paramAnonymousView, str, localm.bjL());
          GMTrace.o(18571841241088L, 138371);
          return true;
        }
        GMTrace.o(18571841241088L, 138371);
        return false;
      }
    };
    this.qBP = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8646306037760L, 64420);
        Object localObject2;
        Object localObject1;
        int i;
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
        {
          localObject2 = ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).fAx;
          localObject1 = com.tencent.mm.plugin.sns.storage.h.HA((String)localObject2);
          if (localObject1 == null)
          {
            w.e("MicroMsg.TimelineClickListener", "photo click without snsinfo ,localId " + (String)localObject2);
            GMTrace.o(8646306037760L, 64420);
            return;
          }
          if ((((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH() != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qmi == 1))
          {
            b.this.qVH.onClick(paramAnonymousView);
            GMTrace.o(8646306037760L, 64420);
            return;
          }
          if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().uyu.tKc == 21)
          {
            if (com.tencent.mm.x.m.zF().equals(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName))
            {
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().nas;
              com.tencent.mm.plugin.sns.lucky.a.m.j((com.tencent.mm.plugin.sns.storage.m)localObject1);
              com.tencent.mm.plugin.sns.lucky.a.m.i((com.tencent.mm.plugin.sns.storage.m)localObject1);
              System.currentTimeMillis();
              com.tencent.mm.plugin.sns.lucky.a.b.nK(25);
            }
            if (!com.tencent.mm.x.m.zF().equals(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName))
            {
              com.tencent.mm.plugin.sns.lucky.b.a.a(2, (com.tencent.mm.plugin.sns.storage.m)localObject1);
              com.tencent.mm.plugin.sns.lucky.a.b.nK(30);
            }
          }
          if (!((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)) {
            break label858;
          }
          ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjJ();
          if ((!((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qln) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml))) {
            break label847;
          }
          localObject2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject1);
          if (!bg.mZ((String)localObject2)) {
            ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml = ((String)localObject2);
          }
          localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
          if (b.this.scene != 0) {
            break label837;
          }
          i = 1;
          localObject2 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject2, 21, i, "", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bku(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a((k)localObject2, 0);
          Object localObject3 = new int[2];
          if (paramAnonymousView != null) {
            paramAnonymousView.getLocationInWindow((int[])localObject3);
          }
          i = paramAnonymousView.getWidth();
          int j = paramAnonymousView.getHeight();
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("img_gallery_left", localObject3[0]);
          ((Intent)localObject2).putExtra("img_gallery_top", localObject3[1]);
          ((Intent)localObject2).putExtra("img_gallery_width", i);
          ((Intent)localObject2).putExtra("img_gallery_height", j);
          ((Intent)localObject2).putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
          ((Intent)localObject2).putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq());
          ((Intent)localObject2).putExtra("sns_landing_pages_aid", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkl());
          ((Intent)localObject2).putExtra("sns_landing_pages_traceid", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkm());
          localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
          if (localObject3 != null)
          {
            localObject3 = ((bhc)localObject3).uyu.tKd;
            if (((List)localObject3).size() > 0)
            {
              ((Intent)localObject2).putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject3).get(0)).uhA);
              ((Intent)localObject2).putExtra("sns_landing_pages_from_outer_index", ((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).index);
            }
          }
          ((Intent)localObject2).setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
          if (b.this.scene != 0) {
            break label842;
          }
          i = 1;
          label573:
          ((Intent)localObject2).putExtra("sns_landig_pages_from_source", i);
          ((Intent)localObject2).putExtra("sns_landing_pages_xml", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml);
          ((Intent)localObject2).putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkt());
          ((Intent)localObject2).putExtra("sns_landing_pages_xml_prefix", "adxml");
          ((Intent)localObject2).putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
          b.this.activity.startActivity((Intent)localObject2);
          b.this.activity.overridePendingTransition(0, 0);
          if (b.this.qyj != null) {
            b.this.qyj.bgU().v((com.tencent.mm.plugin.sns.storage.m)localObject1);
          }
          label687:
          ((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32);
          paramAnonymousView = (com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag();
          if ((paramAnonymousView.qGP) && (localObject1 != null))
          {
            ax.b((com.tencent.mm.plugin.sns.storage.m)localObject1, paramAnonymousView.index);
            ax.c((com.tencent.mm.plugin.sns.storage.m)localObject1, paramAnonymousView.index);
            au.GP(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkg());
          }
          if (localObject1 != null)
          {
            localObject1 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
            if (localObject1 != null) {
              if (((bhc)localObject1).uyt != null) {
                break label869;
              }
            }
          }
        }
        label837:
        label842:
        label847:
        label858:
        label869:
        for (paramAnonymousView = null;; paramAnonymousView = ((bhc)localObject1).uyt.nas)
        {
          if ((!bg.mZ(paramAnonymousView)) && (com.tencent.mm.plugin.sns.c.a.ifN.bE(paramAnonymousView)))
          {
            localObject2 = com.tencent.mm.plugin.sns.c.a.ifN.bC(paramAnonymousView);
            com.tencent.mm.plugin.sns.c.a.ifN.a(null, paramAnonymousView, (String)localObject2, ((bhc)localObject1).jWW, 2, 4, 4, ((bhc)localObject1).uyy, ((bhc)localObject1).nas);
          }
          GMTrace.o(8646306037760L, 64420);
          return;
          i = 2;
          break;
          i = 2;
          break label573;
          b.this.br(paramAnonymousView);
          break label687;
          b.this.br(paramAnonymousView);
          break label687;
        }
      }
    };
    this.qVg = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(8654493319168L, 64481);
        com.tencent.mm.ui.base.h.a(b.this.activity, i.j.pTY, i.j.dxm, i.j.duY, i.j.duP, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(18570499063808L, 138361);
            if (!(paramAnonymousView.getTag() instanceof String))
            {
              GMTrace.o(18570499063808L, 138361);
              return;
            }
            paramAnonymous2DialogInterface = (String)paramAnonymousView.getTag();
            w.d("MicroMsg.TimelineClickListener", "onItemDelClick:" + paramAnonymous2DialogInterface);
            com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymous2DialogInterface);
            if (localm == null)
            {
              w.d("MicroMsg.TimelineClickListener", "can not get snsinfo by localid %s then return it", new Object[] { paramAnonymous2DialogInterface });
              GMTrace.o(18570499063808L, 138361);
              return;
            }
            Object localObject2;
            if (localm.bki())
            {
              w.i("MicroMsg.TimelineClickListener", "dead item");
              com.tencent.mm.plugin.sns.model.ae.bhp().uJ(localm.quQ);
              if (b.this.qVI != null) {
                b.this.qVI.blr();
              }
              if (b.this.scene == 0)
              {
                localObject1 = com.tencent.mm.modelsns.b.gM(739);
                localObject2 = ((com.tencent.mm.modelsns.b)localObject1).lh(com.tencent.mm.plugin.sns.data.i.g(localm)).gP(localm.field_type);
                if (!localm.bki()) {
                  break label253;
                }
                paramAnonymous2DialogInterface = "2";
              }
              for (;;)
              {
                ((com.tencent.mm.modelsns.b)localObject2).lh(paramAnonymous2DialogInterface);
                ((com.tencent.mm.modelsns.b)localObject1).LJ();
                if (localm.field_type == 21) {
                  com.tencent.mm.plugin.sns.lucky.a.g.bgi().bgk();
                }
                GMTrace.o(18570499063808L, 138361);
                return;
                localObject1 = com.tencent.mm.modelsns.b.gN(739);
                break;
                label253:
                if (localm.field_snsId == 0L) {
                  paramAnonymous2DialogInterface = "1";
                } else {
                  paramAnonymous2DialogInterface = "0";
                }
              }
            }
            if (localm.bgY())
            {
              w.i("MicroMsg.TimelineClickListener", "cancel item " + localm.bkg());
              com.tencent.mm.plugin.sns.model.ae.bhl().r(localm);
              b.this.bkX();
              GMTrace.o(18570499063808L, 138361);
              return;
            }
            w.i("MicroMsg.TimelineClickListener", "delete by server");
            paramAnonymous2DialogInterface = localm.bjM();
            com.tencent.mm.plugin.sns.model.ae.bho().dB(u.HU(paramAnonymous2DialogInterface));
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(new q(u.HU(paramAnonymous2DialogInterface), 1), 0);
            com.tencent.mm.plugin.sns.model.ae.bhp().delete(u.HU(paramAnonymous2DialogInterface));
            com.tencent.mm.plugin.sns.model.ae.bht().dK(u.HU(paramAnonymous2DialogInterface));
            b.this.bkX();
            Object localObject1 = localm.bjL();
            if (localObject1 != null)
            {
              if (((bhc)localObject1).uyt != null) {
                break label598;
              }
              paramAnonymous2DialogInterface = null;
              if ((!bg.mZ(paramAnonymous2DialogInterface)) && (com.tencent.mm.plugin.sns.c.a.ifN.bE(paramAnonymous2DialogInterface)))
              {
                localObject2 = com.tencent.mm.plugin.sns.c.a.ifN.bC(paramAnonymous2DialogInterface);
                mr localmr = new mr();
                localmr.fKS.appId = paramAnonymous2DialogInterface;
                localmr.fKS.fKT = ((bhc)localObject1).jWW;
                localmr.fKS.flK = ((String)localObject2);
                localmr.fKS.mediaTagName = ((bhc)localObject1).uyy;
                com.tencent.mm.sdk.b.a.uLm.m(localmr);
              }
            }
            if (b.this.scene == 0)
            {
              localObject1 = com.tencent.mm.modelsns.b.gM(739);
              label547:
              localObject2 = ((com.tencent.mm.modelsns.b)localObject1).lh(com.tencent.mm.plugin.sns.data.i.g(localm)).gP(localm.field_type);
              if (!localm.bki()) {
                break label619;
              }
              paramAnonymous2DialogInterface = "2";
            }
            for (;;)
            {
              ((com.tencent.mm.modelsns.b)localObject2).lh(paramAnonymous2DialogInterface);
              ((com.tencent.mm.modelsns.b)localObject1).LJ();
              GMTrace.o(18570499063808L, 138361);
              return;
              label598:
              paramAnonymous2DialogInterface = ((bhc)localObject1).uyt.nas;
              break;
              localObject1 = com.tencent.mm.modelsns.b.gN(739);
              break label547;
              label619:
              if (localm.field_snsId == 0L) {
                paramAnonymous2DialogInterface = "1";
              } else {
                paramAnonymous2DialogInterface = "0";
              }
            }
          }
        }, null);
        GMTrace.o(8654493319168L, 64481);
      }
    };
    this.qVh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8647111344128L, 64426);
        paramAnonymousView = (String)paramAnonymousView.getTag();
        w.d("MicroMsg.TimelineClickListener", "onItemDelClick:" + paramAnonymousView);
        paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousView).bjL();
        com.tencent.mm.protocal.c.as localas = paramAnonymousView.qfM;
        if (localas.tuc == null)
        {
          GMTrace.o(8647111344128L, 64426);
          return;
        }
        String str = com.tencent.mm.plugin.sns.c.a.ifN.bC(localas.tuc.mDD);
        int i = 0;
        if (paramAnonymousView.uyu.tKc == 1) {
          i = 2;
        }
        while (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.a(paramAnonymousView, b.this.activity))
        {
          com.tencent.mm.plugin.sns.c.a.ifN.a(b.this.activity, localas.tuc.mDD, str, paramAnonymousView.jWW, i, 11, 9, localas.tuc.ttV, paramAnonymousView.nas);
          GMTrace.o(8647111344128L, 64426);
          return;
          if (paramAnonymousView.uyu.tKc == 3) {
            i = 5;
          } else if (paramAnonymousView.uyu.tKc == 15) {
            i = 38;
          }
        }
        switch (localas.jXP)
        {
        }
        for (;;)
        {
          GMTrace.o(8647111344128L, 64426);
          return;
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("rawUrl", localas.mDo);
          com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject, b.this.activity);
          com.tencent.mm.plugin.sns.c.a.ifN.a(b.this.activity, localas.tuc.mDD, str, paramAnonymousView.jWW, i, 11, 1, localas.tuc.ttV, paramAnonymousView.nas);
          GMTrace.o(8647111344128L, 64426);
          return;
          if (localas.ttY == 1)
          {
            localObject = new gi();
            ((gi)localObject).fCx.actionCode = 2;
            ((gi)localObject).fCx.scene = 3;
            ((gi)localObject).fCx.appId = localas.tuc.mDD;
            ((gi)localObject).fCx.context = b.this.activity;
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
            com.tencent.mm.plugin.sns.c.a.ifN.a(b.this.activity, localas.tuc.mDD, str, paramAnonymousView.jWW, i, 11, 6, localas.tuc.ttV, paramAnonymousView.nas);
            GMTrace.o(8647111344128L, 64426);
            return;
            int j = ag.a(b.this.activity, localas);
            if (j == 1)
            {
              localObject = new gi();
              ((gi)localObject).fCx.context = b.this.activity;
              ((gi)localObject).fCx.actionCode = 2;
              ((gi)localObject).fCx.appId = localas.tuc.mDD;
              ((gi)localObject).fCx.messageAction = localas.tuc.ttX;
              ((gi)localObject).fCx.messageExt = localas.tuc.ttW;
              ((gi)localObject).fCx.scene = 3;
              com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
              com.tencent.mm.plugin.sns.c.a.ifN.a(b.this.activity, localas.tuc.mDD, str, paramAnonymousView.jWW, i, 11, 6, localas.tuc.ttV, paramAnonymousView.nas);
              GMTrace.o(8647111344128L, 64426);
              return;
            }
            if (j == 2)
            {
              localObject = new gi();
              ((gi)localObject).fCx.context = b.this.activity;
              ((gi)localObject).fCx.actionCode = 1;
              ((gi)localObject).fCx.appId = localas.tuc.mDD;
              ((gi)localObject).fCx.messageAction = localas.tuc.ttX;
              ((gi)localObject).fCx.messageExt = localas.tuc.ttW;
              ((gi)localObject).fCx.scene = 3;
              com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
              com.tencent.mm.plugin.sns.c.a.ifN.a(b.this.activity, localas.tuc.mDD, str, paramAnonymousView.jWW, i, 11, 3, localas.tuc.ttV, paramAnonymousView.nas);
            }
          }
        }
      }
    };
    this.qVo = new View.OnClickListener()
    {
      private static void IA(String paramAnonymousString)
      {
        GMTrace.i(18567814709248L, 138341);
        long l = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousString).field_snsId;
        Object localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().dP(l);
        if (localObject1 != null)
        {
          Object localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
          if (localObject2 != null)
          {
            localObject2 = ((bhc)localObject2).uyu.tKd;
            if (((List)localObject2).size() > 0) {
              ((List)localObject2).get(0);
            }
          }
          localObject2 = ai.n((com.tencent.mm.plugin.sns.storage.m)localObject1);
          localObject1 = new ArrayList();
          localObject2 = ((bdk)localObject2).uvw.uvZ;
          if (localObject2 != null)
          {
            int i = 0;
            while (i < ((List)localObject2).size())
            {
              bdg localbdg = (bdg)((List)localObject2).get(i);
              com.tencent.mm.plugin.p.a.a locala = new com.tencent.mm.plugin.p.a.a();
              locala.jqc = localbdg.twR;
              locala.nsw = localbdg.orU;
              locala.nsx = localbdg.uuI;
              ((List)localObject1).add(locala);
              i += 1;
            }
          }
          com.tencent.mm.plugin.p.a.i(paramAnonymousString, (List)localObject1);
        }
        GMTrace.o(18567814709248L, 138341);
      }
      
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8652614270976L, 64467);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.storage.m))
        {
          paramAnonymousView = (com.tencent.mm.plugin.sns.storage.m)paramAnonymousView.getTag();
          if ((paramAnonymousView.field_type == 21) && (com.tencent.mm.x.m.zF().equals(paramAnonymousView.field_userName)))
          {
            localObject = paramAnonymousView.bjL().nas;
            com.tencent.mm.plugin.sns.lucky.a.m.j(paramAnonymousView);
            com.tencent.mm.plugin.sns.lucky.a.m.i(paramAnonymousView);
            System.currentTimeMillis();
            com.tencent.mm.plugin.sns.lucky.a.b.nK(24);
          }
          Object localObject = new Intent();
          ((Intent)localObject).putExtra("key_sendid", paramAnonymousView.bjM());
          ((Intent)localObject).putExtra("key_feedid", paramAnonymousView.bkg());
          ((Intent)localObject).setClassName(b.this.activity, "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI");
          b.this.activity.startActivity((Intent)localObject);
          localObject = paramAnonymousView.bkg();
          paramAnonymousView.bjM();
          IA((String)localObject);
        }
        GMTrace.o(8652614270976L, 64467);
      }
    };
    this.qVi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8648990392320L, 64440);
        b.this.cw(paramAnonymousView);
        GMTrace.o(8648990392320L, 64440);
      }
    };
    this.qVj = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8646574473216L, 64422);
        b.this.cz(paramAnonymousView);
        GMTrace.o(8646574473216L, 64422);
      }
    };
    this.qVk = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18571572805632L, 138369);
        if ((paramAnonymousView.getTag() instanceof String))
        {
          paramAnonymousView = (String)paramAnonymousView.getTag();
          w.d("MicroMsg.TimelineClickListener", "localId " + paramAnonymousView);
          ai.uh(u.HV(paramAnonymousView));
          ai.uf(u.HV(paramAnonymousView));
          com.tencent.mm.plugin.sns.model.ae.bhl().bgd();
          b.this.bkX();
          if (b.this.qVI != null) {
            b.this.qVI.blr();
          }
        }
        GMTrace.o(18571572805632L, 138369);
      }
    };
    this.qVl = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18569827975168L, 138356);
        try
        {
          int i = u.HV((String)paramAnonymousView.getTag());
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("sns_label_sns_info", i);
          com.tencent.mm.plugin.sns.c.a.ifM.x(paramAnonymousView, b.this.activity);
          GMTrace.o(18569827975168L, 138356);
          return;
        }
        catch (Exception paramAnonymousView)
        {
          GMTrace.o(18569827975168L, 138356);
        }
      }
    };
    this.qVp = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(18569962192896L, 138357);
        long l;
        int i;
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.m))
        {
          paramAnonymousView = (com.tencent.mm.plugin.sns.ui.m)paramAnonymousView.getTag();
          paramAnonymousContextMenu.add(0, 11, 0, b.this.activity.getString(i.j.duU));
          if ((paramAnonymousView.jWW != null) && (paramAnonymousView.jWW.equals(com.tencent.mm.x.m.zF()))) {
            paramAnonymousContextMenu.add(0, 7, 0, b.this.activity.getString(i.j.duY));
          }
          paramAnonymousContextMenuInfo = paramAnonymousView.qys;
          StringBuilder localStringBuilder = new StringBuilder();
          if (paramAnonymousView.qbt.uuE != 0)
          {
            l = paramAnonymousView.qbt.uuE;
            paramAnonymousContextMenuInfo = ao.du(paramAnonymousContextMenuInfo, l);
            if (paramAnonymousView.scene != 1) {
              break label221;
            }
            i = 2;
          }
        }
        for (;;)
        {
          label154:
          paramAnonymousView = ao.GJ(paramAnonymousContextMenuInfo);
          if ((paramAnonymousView != null) && (paramAnonymousView.hie) && (!paramAnonymousView.hkX) && ((i & paramAnonymousView.gbQ) != 0)) {}
          for (i = 1;; i = 0)
          {
            if (i != 0) {
              break label241;
            }
            ao.a(paramAnonymousContextMenu, false);
            GMTrace.o(18569962192896L, 138357);
            return;
            l = paramAnonymousView.qbt.uuH;
            break;
            label221:
            if (paramAnonymousView.scene != 2) {
              break label255;
            }
            i = 4;
            break label154;
          }
          label241:
          ao.b(paramAnonymousContextMenu, false);
          GMTrace.o(18569962192896L, 138357);
          return;
          label255:
          i = -1;
        }
      }
      
      public final boolean cF(View paramAnonymousView)
      {
        GMTrace.i(18570096410624L, 138358);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.m))
        {
          Object localObject = (com.tencent.mm.plugin.sns.ui.m)paramAnonymousView.getTag();
          localObject = com.tencent.mm.plugin.sns.model.ae.bhp().Hz(((com.tencent.mm.plugin.sns.ui.m)localObject).qys);
          b.this.qVc.a(paramAnonymousView, ((com.tencent.mm.plugin.sns.storage.m)localObject).bkg(), ((com.tencent.mm.plugin.sns.storage.m)localObject).bjL());
          GMTrace.o(18570096410624L, 138358);
          return true;
        }
        GMTrace.o(18570096410624L, 138358);
        return false;
      }
    };
    this.qVw = new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(18569693757440L, 138355);
        w.d("MicroMsg.TimelineClickListener", "v " + paramAnonymousView.getId() + "  ");
        b.this.cy(paramAnonymousView);
        GMTrace.o(18569693757440L, 138355);
        return false;
      }
    };
    this.qVx = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8655969714176L, 64492);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.as))
        {
          paramAnonymousView = (com.tencent.mm.plugin.sns.ui.as)paramAnonymousView.getTag();
          paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhp().Hz(paramAnonymousView.fMT);
          if (paramAnonymousView == null)
          {
            GMTrace.o(8655969714176L, 64492);
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("sns_text_show", paramAnonymousView.bjL().uyr);
          localIntent.putExtra("sns_local_id", paramAnonymousView.bkg());
          localIntent.setClass(b.this.activity, SnsSingleTextViewUI.class);
          b.this.activity.startActivity(localIntent);
        }
        GMTrace.o(8655969714176L, 64492);
      }
    };
    this.qVA = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18569022668800L, 138350);
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.r))
        {
          com.tencent.mm.plugin.sns.ui.r localr = (com.tencent.mm.plugin.sns.ui.r)paramAnonymousView.getTag();
          Object localObject = (amn)localr.qAK.uyu.tKd.get(0);
          String str1 = localr.fxL;
          com.tencent.mm.plugin.sns.model.ae.bhp().Hz(str1);
          str1 = "";
          String str3 = com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), ((amn)localObject).nas);
          String str2 = "";
          String str4 = com.tencent.mm.plugin.sns.data.i.j((amn)localObject);
          if (FileOp.aZ(str3 + str4))
          {
            str1 = str3 + str4;
            str2 = str3 + com.tencent.mm.plugin.sns.data.i.e((amn)localObject);
          }
          if (FileOp.aZ(str3 + com.tencent.mm.plugin.sns.data.i.p((amn)localObject)))
          {
            str1 = str3 + com.tencent.mm.plugin.sns.data.i.p((amn)localObject);
            str2 = str3 + com.tencent.mm.plugin.sns.data.i.n((amn)localObject);
          }
          localObject = new int[2];
          paramAnonymousView.getLocationInWindow((int[])localObject);
          int i = paramAnonymousView.getWidth();
          int j = paramAnonymousView.getHeight();
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(b.this.activity, SnsOnlineVideoActivity.class);
          paramAnonymousView.putExtra("intent_videopath", str1);
          paramAnonymousView.putExtra("intent_thumbpath", str2);
          paramAnonymousView.putExtra("intent_localid", localr.fxL);
          paramAnonymousView.putExtra("intent_isad", false);
          paramAnonymousView.putExtra("intent_from_scene", b.this.scene);
          paramAnonymousView.putExtra("img_gallery_left", localObject[0]);
          paramAnonymousView.putExtra("img_gallery_top", localObject[1]);
          paramAnonymousView.putExtra("img_gallery_width", i);
          paramAnonymousView.putExtra("img_gallery_height", j);
          b.this.activity.startActivity(paramAnonymousView);
          b.this.activity.overridePendingTransition(0, 0);
          b.this.h(localr.qAK);
        }
        GMTrace.o(18569022668800L, 138350);
      }
    };
    this.qVz = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8654761754624L, 64483);
        w.i("MicroMsg.TimelineClickListener", "onsight click");
        if (!(paramAnonymousView.getTag() instanceof ak))
        {
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        final ak localak = (ak)paramAnonymousView.getTag();
        final com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(localak.fxL);
        if (localm == null)
        {
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        if (b.this.qyj != null) {
          b.this.qyj.bgU().v(localm);
        }
        final boolean bool = localm.uF(32);
        if ((bool) && (localm.bjH() != null) && (localm.bjH().qmi == 1))
        {
          b.this.qVH.onClick(paramAnonymousView);
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        final bhc localbhc = localak.qFm;
        if ((localbhc.uyu.tKd == null) || (localbhc.uyu.tKd.size() == 0))
        {
          w.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        final amn localamn = (amn)localbhc.uyu.tKd.get(0);
        Object localObject1;
        if (bool)
        {
          com.tencent.mm.plugin.sns.model.ae.bhm();
          if (!com.tencent.mm.plugin.sns.model.g.t(localamn))
          {
            localak.qrh.setVisibility(8);
            localak.qFp.setVisibility(0);
            localak.qFp.cgd();
            com.tencent.mm.plugin.sns.model.ae.bhm().y(localamn);
            paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhk();
            localObject1 = an.bQy();
            ((an)localObject1).time = localbhc.orU;
            paramAnonymousView.a(localamn, 4, null, (an)localObject1);
            if (bool) {
              com.tencent.mm.plugin.sns.a.b.j.a(j.b.pXp, j.a.pXg, localm);
            }
            GMTrace.o(8654761754624L, 64483);
            return;
          }
        }
        if ((localm.uF(32)) && (localm.bjH().qln) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(localm.bkr().field_adxml))) {}
        Object localObject2;
        for (int i = 1; (i == 0) && (bool) && (com.tencent.mm.plugin.sns.model.ae.bhm().u(localamn)); i = 0)
        {
          com.tencent.mm.plugin.sns.model.ae.bhm().y(localamn);
          localak.qrh.setVisibility(8);
          localak.qFp.setVisibility(8);
          paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhm();
          localObject1 = localak.pDA;
          i = b.this.activity.hashCode();
          j = localak.position;
          localObject2 = an.bQy();
          ((an)localObject2).time = localbhc.orU;
          paramAnonymousView.a(localm, localamn, (com.tencent.mm.plugin.sight.decode.a.a)localObject1, i, j, (an)localObject2, bool);
          if (bool) {
            com.tencent.mm.plugin.sns.a.b.j.a(j.b.pXp, j.a.pXg, localm);
          }
          GMTrace.o(8654761754624L, 64483);
          return;
        }
        com.tencent.mm.modelsns.b localb;
        if (b.this.scene == 0)
        {
          localObject1 = com.tencent.mm.modelsns.b.gM(717);
          ((com.tencent.mm.modelsns.b)localObject1).lh(com.tencent.mm.plugin.sns.data.i.g(localm)).gP(localm.field_type).bA(localm.uF(32)).lh(localm.bkq()).lh(localamn.nas);
          ((com.tencent.mm.modelsns.b)localObject1).LJ();
          if (b.this.scene != 0) {
            break label1166;
          }
          localb = com.tencent.mm.modelsns.b.gM(745);
          label587:
          localb.lh(com.tencent.mm.plugin.sns.data.i.g(localm)).gP(localm.field_type).bA(localm.uF(32));
          if (bool)
          {
            if (b.this.scene != 0) {
              break label1177;
            }
            i = 1;
            label633:
            localObject1 = localm.bkp();
            if ((!localm.uF(32)) || (!localm.bjH().qln)) {
              break label1182;
            }
          }
        }
        Object localObject3;
        label1166:
        label1177:
        label1182:
        for (int j = 21;; j = 17)
        {
          localObject1 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject1, j, i, "", localm.bku(), localm.bjM());
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a((k)localObject1, 0);
          if ((!localm.bjH().qln) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(localm.bkr().field_adxml))) {
            com.tencent.mm.plugin.sns.a.b.j.a(j.b.pXp, j.a.pXh, localm);
          }
          localObject2 = "";
          localObject3 = com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), localamn.nas);
          localObject1 = "";
          String str = com.tencent.mm.plugin.sns.data.i.j(localamn);
          if (FileOp.aZ((String)localObject3 + str))
          {
            localObject2 = (String)localObject3 + str;
            localObject1 = (String)localObject3 + com.tencent.mm.plugin.sns.data.i.e(localamn);
          }
          if (FileOp.aZ((String)localObject3 + com.tencent.mm.plugin.sns.data.i.p(localamn)))
          {
            localObject2 = (String)localObject3 + com.tencent.mm.plugin.sns.data.i.p(localamn);
            localObject1 = (String)localObject3 + com.tencent.mm.plugin.sns.data.i.n(localamn);
          }
          localObject3 = new int[2];
          paramAnonymousView.getLocationInWindow((int[])localObject3);
          i = paramAnonymousView.getWidth();
          j = paramAnonymousView.getHeight();
          com.tencent.mm.plugin.report.service.g.paX.i(11444, new Object[] { Integer.valueOf(3) });
          if (bool) {
            break label1188;
          }
          w.i("MicroMsg.TimelineClickListener", "it not ad video, use online video activity to play.");
          paramAnonymousView = new Intent();
          paramAnonymousView.setClass(b.this.activity, SnsOnlineVideoActivity.class);
          paramAnonymousView.putExtra("intent_videopath", (String)localObject2);
          paramAnonymousView.putExtra("intent_thumbpath", (String)localObject1);
          paramAnonymousView.putExtra("intent_localid", localak.fxL);
          paramAnonymousView.putExtra("intent_isad", bool);
          paramAnonymousView.putExtra("intent_from_scene", b.this.scene);
          paramAnonymousView.putExtra("img_gallery_left", localObject3[0]);
          paramAnonymousView.putExtra("img_gallery_top", localObject3[1]);
          paramAnonymousView.putExtra("img_gallery_width", i);
          paramAnonymousView.putExtra("img_gallery_height", j);
          localb.b(paramAnonymousView, "intent_key_StatisticsOplog");
          b.this.activity.startActivity(paramAnonymousView);
          b.this.activity.overridePendingTransition(0, 0);
          b.this.h(localm.bjL());
          GMTrace.o(8654761754624L, 64483);
          return;
          localObject1 = com.tencent.mm.modelsns.b.gN(717);
          break;
          localb = com.tencent.mm.modelsns.b.gN(745);
          break label587;
          i = 2;
          break label633;
        }
        label1188:
        if ((localm.uF(32)) && (localm.bjH().qln) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(localm.bkr().field_adxml)))
        {
          paramAnonymousView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(localm);
          if (!bg.mZ(paramAnonymousView)) {
            localm.bkr().field_adxml = paramAnonymousView;
          }
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("img_gallery_left", localObject3[0]);
          paramAnonymousView.putExtra("img_gallery_top", localObject3[1]);
          paramAnonymousView.putExtra("img_gallery_width", i);
          paramAnonymousView.putExtra("img_gallery_height", j);
          paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", localm.bjM());
          paramAnonymousView.putExtra("sns_landing_pages_ux_info", localm.bkq());
          localObject1 = localm.bjL();
          if (localObject1 != null)
          {
            localObject1 = ((bhc)localObject1).uyu.tKd;
            if (((List)localObject1).size() > 0) {
              paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject1).get(0)).uhA);
            }
          }
          paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
          if (b.this.scene == 0) {}
          for (i = 1;; i = 2)
          {
            paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
            paramAnonymousView.putExtra("sns_landing_pages_xml", localm.bkr().field_adxml);
            paramAnonymousView.putExtra("sns_landing_pages_rec_src", localm.bkt());
            paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
            paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            paramAnonymousView.putExtra("sns_landing_is_native_sight_ad", true);
            b.this.activity.startActivity(paramAnonymousView);
            b.this.activity.overridePendingTransition(0, 0);
            GMTrace.o(8654761754624L, 64483);
            return;
          }
        }
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(b.this.activity, SnsSightPlayerUI.class);
        paramAnonymousView.putExtra("intent_videopath", (String)localObject2);
        paramAnonymousView.putExtra("intent_thumbpath", (String)localObject1);
        paramAnonymousView.putExtra("intent_localid", localak.fxL);
        paramAnonymousView.putExtra("intent_isad", bool);
        paramAnonymousView.putExtra("intent_from_scene", b.this.scene);
        paramAnonymousView.putExtra("img_gallery_left", localObject3[0]);
        paramAnonymousView.putExtra("img_gallery_top", localObject3[1]);
        paramAnonymousView.putExtra("img_gallery_width", i);
        paramAnonymousView.putExtra("img_gallery_height", j);
        localb.b(paramAnonymousView, "intent_key_StatisticsOplog");
        b.this.activity.startActivity(paramAnonymousView);
        b.this.activity.overridePendingTransition(0, 0);
        new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18568083144704L, 138343);
            if (com.tencent.mm.plugin.sns.model.ae.bhm().u(localamn))
            {
              localak.pDA.an(null, false);
              com.tencent.mm.plugin.sns.model.g localg = com.tencent.mm.plugin.sns.model.ae.bhm();
              com.tencent.mm.plugin.sns.storage.m localm = localm;
              amn localamn = localamn;
              com.tencent.mm.plugin.sight.decode.a.a locala = localak.pDA;
              int i = b.this.activity.hashCode();
              int j = localak.position;
              an localan = an.bQy();
              localan.time = localbhc.orU;
              localg.a(localm, localamn, locala, i, j, localan, bool);
              localak.qrh.setVisibility(0);
              localak.qFp.setVisibility(8);
              localak.qrh.setImageDrawable(com.tencent.mm.bq.a.b(b.this.activity, i.i.dqL));
            }
            GMTrace.o(18568083144704L, 138343);
          }
        }, 500L);
        paramAnonymousView = new int[3];
        if ((!bool) && (com.tencent.mm.plugin.sns.model.ae.bhm().a(localm, paramAnonymousView) > 5))
        {
          com.tencent.mm.plugin.sns.model.ae.bhm().x(localamn);
          i = 1;
        }
        label2338:
        for (;;)
        {
          int n = paramAnonymousView[0];
          int i1 = paramAnonymousView[1];
          if (i == 2) {}
          for (int m = 1;; m = 0)
          {
            int i2 = paramAnonymousView[2];
            paramAnonymousView = localm.bjL();
            localObject1 = new com.tencent.mm.modelsns.d();
            ((com.tencent.mm.modelsns.d)localObject1).m("20FeedId", paramAnonymousView.nas + ",");
            ((com.tencent.mm.modelsns.d)localObject1).m("21AdUxInfo", localm.bkq() + ",");
            for (;;)
            {
              try
              {
                paramAnonymousView = (bdk)new bdk().aC(localm.field_attrBuf);
                if (paramAnonymousView.uvv == null) {
                  continue;
                }
                paramAnonymousView = (bds)new bds().aC(paramAnonymousView.uvv.ush.toK);
                if (paramAnonymousView.uvK == null) {
                  continue;
                }
                k = paramAnonymousView.uvK.tKO;
              }
              catch (Exception paramAnonymousView)
              {
                int k = 0;
                w.printErrStackTrace("MicroMsg.TimelineClickListener", paramAnonymousView, "", new Object[0]);
                j = 0;
                continue;
                if (com.tencent.mm.sdk.platformtools.am.is2G(ab.getContext()))
                {
                  i = 2;
                  continue;
                }
                if (com.tencent.mm.sdk.platformtools.am.is3G(ab.getContext()))
                {
                  i = 3;
                  continue;
                }
                if (!com.tencent.mm.sdk.platformtools.am.is4G(ab.getContext())) {
                  continue;
                }
                i = 4;
                continue;
                j = 0;
                k = 0;
                continue;
                i = 2;
              }
              try
              {
                j = paramAnonymousView.uvK.tKP;
                ((com.tencent.mm.modelsns.d)localObject1).m("22LayerId", k + ",");
                ((com.tencent.mm.modelsns.d)localObject1).m("23ExpId", j + ",");
                ((com.tencent.mm.modelsns.d)localObject1).m("24ClickState", i + ",");
                ((com.tencent.mm.modelsns.d)localObject1).m("25ClickTime", bg.Po() + ",");
                i = 0;
                if (!com.tencent.mm.sdk.platformtools.am.isWifi(ab.getContext())) {
                  continue;
                }
                i = 1;
                ((com.tencent.mm.modelsns.d)localObject1).m("26NetworkType", i + ",");
                ((com.tencent.mm.modelsns.d)localObject1).m("27IsFlowControl", n + ",");
                ((com.tencent.mm.modelsns.d)localObject1).m("28AutoDownloadSetting", i1 + ",");
                ((com.tencent.mm.modelsns.d)localObject1).m("29IsAutoPlay", m + ",");
                ((com.tencent.mm.modelsns.d)localObject1).m("30IsFlowControlDatePeriod", i2 + ",");
                w.i("MicroMsg.TimelineClickListener", "report SnsSightPreloadExp(sight_autodownload) logbuffer(13323): " + ((com.tencent.mm.modelsns.d)localObject1).LL());
                com.tencent.mm.plugin.report.service.g.paX.i(13323, new Object[] { localObject1 });
                GMTrace.o(8654761754624L, 64483);
                return;
              }
              catch (Exception paramAnonymousView) {}
            }
            if ((!bool) || (com.tencent.mm.plugin.sns.model.ae.bhm().b(localm, paramAnonymousView) <= 5)) {
              break label2338;
            }
            com.tencent.mm.plugin.sns.model.ae.bhm().x(localamn);
            i = 1;
            break;
          }
        }
      }
    };
    this.qVs = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(18569425321984L, 138353);
        if ((paramAnonymousView.getTag() instanceof ak))
        {
          paramAnonymousView = (ak)paramAnonymousView.getTag();
          if (!paramAnonymousView.pYb) {
            paramAnonymousContextMenu.add(0, 19, 0, b.this.activity.getString(i.j.dIO));
          }
          if (bg.RF(com.tencent.mm.k.g.uz().getValue("SIGHTCannotTransmitForFav")) != 0) {
            break label317;
          }
          if (paramAnonymousView.qFm.uyu.tKd.size() <= 0) {
            break label310;
          }
          paramAnonymousContextMenuInfo = (amn)paramAnonymousView.qFm.uyu.tKd.get(0);
          String str = paramAnonymousContextMenuInfo.nas;
          str = com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), str) + com.tencent.mm.plugin.sns.data.i.e(paramAnonymousContextMenuInfo);
          paramAnonymousContextMenuInfo = com.tencent.mm.plugin.sns.model.ap.a(paramAnonymousView.fxL, paramAnonymousContextMenuInfo);
          boolean bool1 = FileOp.aZ(str);
          boolean bool2 = FileOp.aZ(paramAnonymousContextMenuInfo);
          w.i("MicroMsg.TimelineOnCreateContextMenuListener", "config can forward sight, thumb existed %B, video existed %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          if ((!bool1) || (!bool2)) {
            break label317;
          }
        }
        label310:
        label317:
        for (int i = 1;; i = 0)
        {
          if (com.tencent.mm.bi.d.KT("favorite")) {
            paramAnonymousContextMenu.add(0, 10, 0, b.this.activity.getString(i.j.euj));
          }
          if (i != 0)
          {
            paramAnonymousContextMenuInfo = new df();
            paramAnonymousContextMenuInfo.fxU.fxL = paramAnonymousView.fxL;
            com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousContextMenuInfo);
            if (paramAnonymousContextMenuInfo.fxV.fxs) {
              paramAnonymousContextMenu.add(0, 18, 0, b.this.activity.getString(i.j.pQV));
            }
          }
          GMTrace.o(18569425321984L, 138353);
          return;
          w.w("MicroMsg.TimelineOnCreateContextMenuListener", "sight item had not attch.");
        }
      }
      
      public final boolean cF(View paramAnonymousView)
      {
        GMTrace.i(18569559539712L, 138354);
        if ((paramAnonymousView.getTag() instanceof ak))
        {
          String str = ((ak)paramAnonymousView.getTag()).fxL;
          com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(str);
          b.this.qVc.a(paramAnonymousView, str, localm.bjL());
          GMTrace.o(18569559539712L, 138354);
          return true;
        }
        GMTrace.o(18569559539712L, 138354);
        return false;
      }
    };
    this.qVB = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8656640802816L, 64497);
        b.this.cA(paramAnonymousView);
        if ((paramAnonymousView.getTag() == null) || (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
        {
          GMTrace.o(8656640802816L, 64497);
          return;
        }
        Object localObject = (com.tencent.mm.plugin.sns.data.b)paramAnonymousView.getTag();
        paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhp().HA(((com.tencent.mm.plugin.sns.data.b)localObject).fxL);
        if (paramAnonymousView == null)
        {
          GMTrace.o(8656640802816L, 64497);
          return;
        }
        if (paramAnonymousView.uF(32))
        {
          ((com.tencent.mm.plugin.sns.data.b)localObject).pYe = System.currentTimeMillis();
          localObject = paramAnonymousView.bkp();
          if (b.this.scene != 0) {
            break label154;
          }
        }
        label154:
        for (int i = 1;; i = 2)
        {
          paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c((String)localObject, 20, i, "", paramAnonymousView.bku(), paramAnonymousView.bjM());
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
          GMTrace.o(8656640802816L, 64497);
          return;
        }
      }
    };
    this.qVn = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18567680491520L, 138340);
        w.i("MicroMsg.TimelineClickListener", "unlike click");
        com.tencent.mm.plugin.sns.data.b localb = (com.tencent.mm.plugin.sns.data.b)paramAnonymousView.getTag();
        com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(localb.fxL);
        if (localm == null)
        {
          GMTrace.o(18567680491520L, 138340);
          return;
        }
        if (localm.uF(32))
        {
          paramAnonymousView = localm.bjJ();
          if (paramAnonymousView == null)
          {
            paramAnonymousView = "";
            ((com.tencent.mm.plugin.sns.b.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sns.b.c.class)).a(11855, localm.bkt(), new Object[] { Integer.valueOf(3), paramAnonymousView, Integer.valueOf(localm.bkt()) });
          }
        }
        else
        {
          if (localb.pYc.qSm.qlD.bis().size() <= 0) {
            break label230;
          }
        }
        label230:
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label235;
          }
          b.this.bkY();
          paramAnonymousView = new b.b.a();
          paramAnonymousView.qmv = b.b.a.qmr;
          paramAnonymousView.pYe = localb.pYe;
          paramAnonymousView.qmw = 0L;
          paramAnonymousView = new q(localm.field_snsId, 8, paramAnonymousView);
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
          GMTrace.o(18567680491520L, 138340);
          return;
          paramAnonymousView = paramAnonymousView.iLj;
          break;
        }
        label235:
        b.this.bkZ();
        paramAnonymousView = new b.b.a();
        paramAnonymousView.pYe = localb.pYe;
        paramAnonymousView.qmw = System.currentTimeMillis();
        paramAnonymousView = new q(localm.field_snsId, 8, paramAnonymousView);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
        GMTrace.o(18567680491520L, 138340);
      }
    };
    this.qVE = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(20054276046848L, 149416);
        if ((paramAnonymousView.getTag() != null) && ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
        {
          paramAnonymousAdapterView = (com.tencent.mm.plugin.sns.data.b)paramAnonymousView.getTag();
          if (paramAnonymousInt < paramAnonymousAdapterView.pYc.qSm.qlD.bis().size())
          {
            paramAnonymousView = (b.b.a)paramAnonymousAdapterView.pYc.qSm.qlD.bis().get(paramAnonymousInt);
            w.i("MicroMsg.TimelineClickListener", "unlike item click, reason=%s, id=%s", new Object[] { paramAnonymousView.qms, Integer.valueOf(paramAnonymousView.qmv) });
            com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousAdapterView.fxL);
            if (localm == null)
            {
              GMTrace.o(20054276046848L, 149416);
              return;
            }
            paramAnonymousView.pYe = paramAnonymousAdapterView.pYe;
            paramAnonymousView.qmw = System.currentTimeMillis();
            paramAnonymousAdapterView = new q(localm.field_snsId, 8, paramAnonymousView);
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousAdapterView, 0);
            b.this.bkZ();
          }
        }
        GMTrace.o(20054276046848L, 149416);
      }
    };
    this.qVH = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20053739175936L, 149412);
        if ((paramAnonymousView.getTag() == null) || ((!(paramAnonymousView.getTag() instanceof a.c)) && (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) && (!(paramAnonymousView.getTag() instanceof ak)) && (!(paramAnonymousView.getTag() instanceof MaskImageView))))
        {
          GMTrace.o(20053739175936L, 149412);
          return;
        }
        Object localObject1;
        int i;
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap))
        {
          localObject1 = com.tencent.mm.plugin.sns.storage.h.HA(((com.tencent.mm.plugin.sns.ui.ap)paramAnonymousView.getTag()).fAx);
          if ((paramAnonymousView instanceof LinearLayout)) {
            i = 0;
          }
        }
        for (;;)
        {
          if ((localObject1 == null) || (!((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)))
          {
            GMTrace.o(20053739175936L, 149412);
            return;
            i = 1;
            continue;
            if ((paramAnonymousView.getTag() instanceof MaskImageView))
            {
              localObject1 = (MaskImageView)paramAnonymousView.getTag();
              if (!(((MaskImageView)localObject1).getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
                break label3388;
              }
              localObject1 = com.tencent.mm.plugin.sns.storage.h.HA(((com.tencent.mm.plugin.sns.ui.ap)((MaskImageView)localObject1).getTag()).fAx);
              if ((paramAnonymousView instanceof LinearLayout))
              {
                i = 0;
                continue;
              }
              i = 1;
            }
          }
        }
        for (;;)
        {
          break;
          if ((paramAnonymousView.getTag() instanceof ak))
          {
            localObject1 = (ak)paramAnonymousView.getTag();
            localObject1 = com.tencent.mm.plugin.sns.model.ae.bhp().HA(((ak)localObject1).fxL);
            if ((paramAnonymousView instanceof LinearLayout))
            {
              i = 0;
              break;
            }
            i = 1;
            break;
          }
          localObject1 = com.tencent.mm.plugin.sns.storage.h.Hz(((a.c)paramAnonymousView.getTag()).fMT);
          i = 0;
          break;
          Object localObject4;
          Object localObject5;
          int j;
          for (;;)
          {
            try
            {
              localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjJ();
              if (localObject2 != null) {
                continue;
              }
              localObject2 = "";
              localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().nas;
              if (!((com.tencent.mm.plugin.sns.storage.m)localObject1).bir())
              {
                localObject5 = com.tencent.mm.plugin.report.service.g.paX;
                if (b.this.scene != 0) {
                  continue;
                }
                j = 1;
                if (i == 0) {
                  continue;
                }
                i = 1;
                ((com.tencent.mm.plugin.report.service.g)localObject5).i(14066, new Object[] { Integer.valueOf(j), Integer.valueOf(i), localObject4, localObject2 });
              }
            }
            catch (Exception localException)
            {
              Object localObject2;
              w.e("MicroMsg.TimelineClickListener", "report click ad card style error " + localException.getMessage());
              continue;
              localObject4 = (ak)localException.qUD.qFo.getTag();
            }
            localObject2 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
            if ((((bhc)localObject2).uyu.tKc != 15) || (((bhc)localObject2).uyB == 1)) {
              break label2283;
            }
            w.i("MicroMsg.TimelineClickListener", "onsight click");
            localObject2 = null;
            if ((paramAnonymousView.getTag() instanceof ak)) {
              localObject2 = (ak)paramAnonymousView.getTag();
            }
            if (!(paramAnonymousView.getTag() instanceof a.c)) {
              break label3374;
            }
            localObject2 = (a.c)paramAnonymousView.getTag();
            if ((((a.c)localObject2).qUD.qFo.getTag() instanceof ak)) {
              continue;
            }
            GMTrace.o(20053739175936L, 149412);
            return;
            localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject2).iLj;
            continue;
            j = 2;
            continue;
            i = 2;
          }
          for (;;)
          {
            if (localObject1 == null)
            {
              GMTrace.o(20053739175936L, 149412);
              return;
            }
            if (b.this.qyj != null) {
              b.this.qyj.bgU().v((com.tencent.mm.plugin.sns.storage.m)localObject1);
            }
            boolean bool = ((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32);
            Object localObject6 = ((ak)localObject4).qFm;
            if ((((bhc)localObject6).uyu.tKd == null) || (((bhc)localObject6).uyu.tKd.size() == 0))
            {
              w.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
              GMTrace.o(20053739175936L, 149412);
              return;
            }
            localObject5 = (amn)((bhc)localObject6).uyu.tKd.get(0);
            if (bool)
            {
              com.tencent.mm.plugin.sns.model.ae.bhm();
              if (!com.tencent.mm.plugin.sns.model.g.t((amn)localObject5))
              {
                ((ak)localObject4).qrh.setVisibility(8);
                ((ak)localObject4).qFp.setVisibility(0);
                ((ak)localObject4).qFp.cgd();
                com.tencent.mm.plugin.sns.model.ae.bhm().y((amn)localObject5);
                paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhk();
                localObject3 = an.bQy();
                ((an)localObject3).time = ((bhc)localObject6).orU;
                paramAnonymousView.a((amn)localObject5, 4, null, (an)localObject3);
                if (bool) {
                  com.tencent.mm.plugin.sns.a.b.j.a(j.b.pXp, j.a.pXg, (com.tencent.mm.plugin.sns.storage.m)localObject1);
                }
                GMTrace.o(20053739175936L, 149412);
                return;
              }
            }
            if ((((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qln) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml))) {}
            for (i = 1; (i == 0) && (bool) && (com.tencent.mm.plugin.sns.model.ae.bhm().u((amn)localObject5)); i = 0)
            {
              com.tencent.mm.plugin.sns.model.ae.bhm().y((amn)localObject5);
              ((ak)localObject4).qrh.setVisibility(8);
              ((ak)localObject4).qFp.setVisibility(8);
              paramAnonymousView = com.tencent.mm.plugin.sns.model.ae.bhm();
              localObject3 = ((ak)localObject4).pDA;
              i = b.this.activity.hashCode();
              j = ((ak)localObject4).position;
              localObject4 = an.bQy();
              ((an)localObject4).time = ((bhc)localObject6).orU;
              paramAnonymousView.a((com.tencent.mm.plugin.sns.storage.m)localObject1, (amn)localObject5, (com.tencent.mm.plugin.sight.decode.a.a)localObject3, i, j, (an)localObject4, bool);
              if (bool) {
                com.tencent.mm.plugin.sns.a.b.j.a(j.b.pXp, j.a.pXg, (com.tencent.mm.plugin.sns.storage.m)localObject1);
              }
              GMTrace.o(20053739175936L, 149412);
              return;
            }
            label1005:
            label1248:
            int k;
            if (b.this.scene == 0)
            {
              localObject4 = com.tencent.mm.modelsns.b.gM(717);
              ((com.tencent.mm.modelsns.b)localObject4).lh(com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type).bA(((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)).lh(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq()).lh(((amn)localObject5).nas);
              ((com.tencent.mm.modelsns.b)localObject4).LJ();
              if (b.this.scene != 0) {
                break label1675;
              }
              localObject4 = com.tencent.mm.modelsns.b.gM(745);
              ((com.tencent.mm.modelsns.b)localObject4).lh(com.tencent.mm.plugin.sns.data.i.g((com.tencent.mm.plugin.sns.storage.m)localObject1)).gP(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type).bA(((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32));
              localObject4 = com.tencent.mm.plugin.sns.model.am.dt(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), ((amn)localObject5).nas);
              localObject6 = com.tencent.mm.plugin.sns.data.i.j((amn)localObject5);
              if (FileOp.aZ((String)localObject4 + (String)localObject6))
              {
                new StringBuilder().append((String)localObject4).append((String)localObject6);
                new StringBuilder().append((String)localObject4).append(com.tencent.mm.plugin.sns.data.i.e((amn)localObject5));
              }
              if (FileOp.aZ((String)localObject4 + com.tencent.mm.plugin.sns.data.i.p((amn)localObject5)))
              {
                new StringBuilder().append((String)localObject4).append(com.tencent.mm.plugin.sns.data.i.p((amn)localObject5));
                new StringBuilder().append((String)localObject4).append(com.tencent.mm.plugin.sns.data.i.n((amn)localObject5));
              }
              localObject4 = new int[2];
              if (localObject3 == null) {
                break label1686;
              }
              if (((a.c)localObject3).qUD.qFo != null) {
                ((a.c)localObject3).qUD.qFo.getLocationInWindow((int[])localObject4);
              }
              i = ((a.c)localObject3).qUD.qFo.getWidth();
              j = ((a.c)localObject3).qUD.qFo.getHeight();
              com.tencent.mm.plugin.report.service.g.paX.i(11444, new Object[] { Integer.valueOf(3) });
              if ((!((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)) || (!((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qln) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml))) {
                break label1770;
              }
              paramAnonymousView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject1);
              if (!bg.mZ(paramAnonymousView)) {
                ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml = paramAnonymousView;
              }
              paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
              if (b.this.scene != 0) {
                break label1759;
              }
              k = 1;
              label1344:
              if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr() != null) {
                ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().getSource();
              }
              paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 22, k, "", 5, 21, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("img_gallery_left", localObject4[0]);
              paramAnonymousView.putExtra("img_gallery_top", localObject4[1]);
              paramAnonymousView.putExtra("img_gallery_width", i);
              paramAnonymousView.putExtra("img_gallery_height", j);
              paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
              paramAnonymousView.putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq());
              localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
              if (localObject3 != null)
              {
                localObject3 = ((bhc)localObject3).uyu.tKd;
                if (((List)localObject3).size() > 0) {
                  paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject3).get(0)).uhA);
                }
              }
              paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
              if (b.this.scene != 0) {
                break label1765;
              }
            }
            label1675:
            label1686:
            label1759:
            label1765:
            for (i = 1;; i = 2)
            {
              paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
              paramAnonymousView.putExtra("sns_landing_pages_xml", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml);
              paramAnonymousView.putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkt());
              paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
              paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
              paramAnonymousView.putExtra("sns_landing_is_native_sight_ad", true);
              b.this.activity.startActivity(paramAnonymousView);
              b.this.activity.overridePendingTransition(0, 0);
              GMTrace.o(20053739175936L, 149412);
              return;
              localObject4 = com.tencent.mm.modelsns.b.gN(717);
              break;
              localObject4 = com.tencent.mm.modelsns.b.gN(745);
              break label1005;
              if ((paramAnonymousView.getTag() instanceof ak))
              {
                paramAnonymousView = (ak)paramAnonymousView.getTag();
                if (paramAnonymousView != null) {
                  paramAnonymousView.qFo.getLocationInWindow((int[])localObject4);
                }
                i = paramAnonymousView.qFo.getWidth();
                j = paramAnonymousView.qFo.getHeight();
                break label1248;
              }
              if (paramAnonymousView != null) {
                paramAnonymousView.getLocationInWindow((int[])localObject4);
              }
              i = paramAnonymousView.getWidth();
              j = paramAnonymousView.getHeight();
              break label1248;
              k = 2;
              break label1344;
            }
            label1770:
            paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
            if (b.this.scene == 0) {}
            for (i = 1;; i = 2)
            {
              if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr() != null) {
                ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().getSource();
              }
              paramAnonymousView = new com.tencent.mm.plugin.sns.a.b.c(paramAnonymousView, 22, i, "", 5, 0, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(paramAnonymousView, 0);
              localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bko();
              paramAnonymousView = (View)localObject3;
              if (bg.mZ((String)localObject3)) {
                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkn();
              }
              if (!bg.mZ(paramAnonymousView)) {
                break;
              }
              GMTrace.o(20053739175936L, 149412);
              return;
            }
            w.i("MicroMsg.TimelineClickListener", "adlink url " + paramAnonymousView + " " + ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qlt);
            Object localObject3 = new Intent();
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qlt == 0)
            {
              bool = true;
              if (com.tencent.mm.platformtools.r.icx) {
                bool = false;
              }
              localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
              if (b.this.scene != 0) {
                break label2278;
              }
            }
            label2278:
            for (i = 1;; i = 2)
            {
              localObject4 = new SnsAdClick((String)localObject4, i, ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq(), 5, (byte)0);
              if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)))
              {
                localObject5 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjJ();
                if (localObject5 != null) {
                  ((Intent)localObject3).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject5).iLj);
                }
              }
              ((Intent)localObject3).putExtra("KRightBtn", bool);
              localObject5 = new Bundle();
              ((Bundle)localObject5).putParcelable("KSnsAdTag", (Parcelable)localObject4);
              ((Bundle)localObject5).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT);
              ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject5);
              ((Intent)localObject3).putExtra("rawUrl", paramAnonymousView);
              ((Intent)localObject3).putExtra("useJs", true);
              ((Intent)localObject3).putExtra("srcUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject3).putExtra("stastic_scene", 15);
              ((Intent)localObject3).putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject3).putExtra("pre_username", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject3).putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject3).putExtra("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject3, b.this.activity);
              GMTrace.o(20053739175936L, 149412);
              return;
              bool = false;
              break;
            }
            label2283:
            if (((((bhc)localObject3).uyu.tKc == 1) && (((bhc)localObject3).uyu.tKd.size() == 1)) || (((bhc)localObject3).uyu.tKc == 7))
            {
              if ((paramAnonymousView.getTag() instanceof a.c))
              {
                paramAnonymousView = ((a.c)paramAnonymousView.getTag()).qUe.uS(0);
                if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
                  break label3349;
                }
                if ((!((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qln) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml))) {
                  break label2857;
                }
                localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
                if (b.this.scene != 0) {
                  break label2847;
                }
                i = 1;
                label2402:
                if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr() != null) {
                  ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().getSource();
                }
                localObject3 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject3, 22, i, "", 4, 21, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
                com.tencent.mm.kernel.h.xA();
                com.tencent.mm.kernel.h.xy().gQO.a((k)localObject3, 0);
                localObject3 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w((com.tencent.mm.plugin.sns.storage.m)localObject1);
                if (!bg.mZ((String)localObject3)) {
                  ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml = ((String)localObject3);
                }
                localObject3 = new int[2];
                if (paramAnonymousView != null) {
                  paramAnonymousView.getLocationInWindow((int[])localObject3);
                }
                i = paramAnonymousView.getWidth();
                j = paramAnonymousView.getHeight();
                paramAnonymousView = new Intent();
                paramAnonymousView.putExtra("img_gallery_left", localObject3[0]);
                paramAnonymousView.putExtra("img_gallery_top", localObject3[1]);
                paramAnonymousView.putExtra("img_gallery_width", i);
                paramAnonymousView.putExtra("img_gallery_height", j);
                paramAnonymousView.putExtra("sns_landing_pages_share_sns_id", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
                paramAnonymousView.putExtra("sns_landing_pages_ux_info", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq());
                paramAnonymousView.putExtra("sns_landing_pages_aid", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkl());
                paramAnonymousView.putExtra("sns_landing_pages_traceid", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkm());
                localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL();
                if (localObject3 != null)
                {
                  localObject3 = ((bhc)localObject3).uyu.tKd;
                  if (((List)localObject3).size() > 0) {
                    paramAnonymousView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject3).get(0)).uhA);
                  }
                }
                paramAnonymousView.setClass(b.this.activity, SnsAdNativeLandingPagesUI.class);
                if (b.this.scene != 0) {
                  break label2852;
                }
              }
              label2847:
              label2852:
              for (i = 1;; i = 2)
              {
                paramAnonymousView.putExtra("sns_landig_pages_from_source", i);
                paramAnonymousView.putExtra("sns_landing_pages_xml", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().field_adxml);
                paramAnonymousView.putExtra("sns_landing_pages_rec_src", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkt());
                paramAnonymousView.putExtra("sns_landing_pages_xml_prefix", "adxml");
                paramAnonymousView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                b.this.activity.startActivity(paramAnonymousView);
                b.this.activity.overridePendingTransition(0, 0);
                if (b.this.qyj != null) {
                  b.this.qyj.bgU().v((com.tencent.mm.plugin.sns.storage.m)localObject1);
                }
                GMTrace.o(20053739175936L, 149412);
                return;
                if ((paramAnonymousView.getTag() instanceof MaskImageView))
                {
                  paramAnonymousView = (MaskImageView)paramAnonymousView.getTag();
                  break;
                }
                paramAnonymousView = (TagImageView)paramAnonymousView;
                break;
                i = 2;
                break label2402;
              }
              label2857:
              localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bko();
              paramAnonymousView = (View)localObject3;
              if (bg.mZ((String)localObject3)) {
                paramAnonymousView = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkn();
              }
              if (bg.mZ(paramAnonymousView))
              {
                GMTrace.o(20053739175936L, 149412);
                return;
              }
              localObject3 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
              if (b.this.scene != 0) {
                break label3358;
              }
              i = 1;
              if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr() != null) {
                ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkr().getSource();
              }
              localObject3 = new com.tencent.mm.plugin.sns.a.b.c((String)localObject3, 22, i, "", 4, 0, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjM());
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a((k)localObject3, 0);
              w.i("MicroMsg.TimelineClickListener", "adlink url " + paramAnonymousView + " " + ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qlt);
              localObject3 = new Intent();
              if (((com.tencent.mm.plugin.sns.storage.m)localObject1).bjH().qlt != 0) {
                break label3363;
              }
              bool = true;
              label3043:
              if (com.tencent.mm.platformtools.r.icx) {
                bool = false;
              }
              localObject4 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkp();
              if (b.this.scene != 0) {
                break label3369;
              }
            }
            label3349:
            label3358:
            label3363:
            label3369:
            for (i = 1;; i = 2)
            {
              localObject4 = new SnsAdClick((String)localObject4, i, ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId, ((com.tencent.mm.plugin.sns.storage.m)localObject1).bkq(), 4, (byte)0);
              if ((localObject1 != null) && (((com.tencent.mm.plugin.sns.storage.m)localObject1).uF(32)))
              {
                localObject5 = ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjJ();
                if (localObject5 != null) {
                  ((Intent)localObject3).putExtra("KsnsViewId", ((com.tencent.mm.plugin.sns.storage.a)localObject5).iLj);
                }
              }
              ((Intent)localObject3).putExtra("KRightBtn", bool);
              localObject5 = new Bundle();
              ((Bundle)localObject5).putParcelable("KSnsAdTag", (Parcelable)localObject4);
              ((Bundle)localObject5).putString("key_snsad_statextstr", ((com.tencent.mm.plugin.sns.storage.m)localObject1).bjL().qBT);
              ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject5);
              ((Intent)localObject3).putExtra("rawUrl", paramAnonymousView);
              ((Intent)localObject3).putExtra("useJs", true);
              ((Intent)localObject3).putExtra("srcUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject3).putExtra("stastic_scene", 15);
              ((Intent)localObject3).putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject3).putExtra("pre_username", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              ((Intent)localObject3).putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(((com.tencent.mm.plugin.sns.storage.m)localObject1).field_snsId));
              ((Intent)localObject3).putExtra("preUsername", ((com.tencent.mm.plugin.sns.storage.m)localObject1).field_userName);
              com.tencent.mm.plugin.sns.c.a.ifM.j((Intent)localObject3, b.this.activity);
              GMTrace.o(20053739175936L, 149412);
              return;
              i = 2;
              break;
              bool = false;
              break label3043;
            }
            label3374:
            localObject5 = null;
            localObject4 = localObject3;
            localObject3 = localObject5;
          }
          label3388:
          i = 0;
          localObject1 = null;
        }
      }
    };
    this.qVv = new c()
    {
      public final void a(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(20054678700032L, 149419);
        paramAnonymousContextMenuInfo = paramAnonymousView.getTag();
        Object localObject;
        if ((paramAnonymousContextMenuInfo instanceof com.tencent.mm.plugin.sns.ui.r))
        {
          paramAnonymousContextMenuInfo = (com.tencent.mm.plugin.sns.ui.r)paramAnonymousContextMenuInfo;
          localObject = paramAnonymousContextMenuInfo.qAK;
          if (com.tencent.mm.bi.d.KT("favorite")) {
            switch (((bhc)localObject).uyu.tKc)
            {
            default: 
              paramAnonymousContextMenu.add(0, 3, 0, paramAnonymousView.getContext().getString(i.j.euj));
            }
          }
        }
        for (;;)
        {
          com.tencent.mm.plugin.sns.abtest.a.a(paramAnonymousContextMenu, com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramAnonymousContextMenuInfo.fxL));
          GMTrace.o(20054678700032L, 149419);
          return;
          paramAnonymousContextMenu.add(0, 4, 0, paramAnonymousView.getContext().getString(i.j.euj));
          localObject = new df();
          ((df)localObject).fxU.fxL = paramAnonymousContextMenuInfo.fxL;
          com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
          if (((df)localObject).fxV.fxs)
          {
            paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.pQV));
            continue;
            paramAnonymousContextMenu.add(0, 5, 0, paramAnonymousView.getContext().getString(i.j.euj));
            continue;
            paramAnonymousContextMenu.add(0, 9, 0, paramAnonymousView.getContext().getString(i.j.euj));
            continue;
            paramAnonymousContextMenu.add(0, 3, 0, paramAnonymousView.getContext().getString(i.j.euj));
            localObject = new df();
            ((df)localObject).fxU.fxL = paramAnonymousContextMenuInfo.fxL;
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
            if (((df)localObject).fxV.fxs)
            {
              paramAnonymousContextMenu.add(0, 18, 0, paramAnonymousView.getContext().getString(i.j.pQV));
              continue;
              paramAnonymousContextMenu.add(0, 10, 0, paramAnonymousView.getContext().getString(i.j.euj));
            }
          }
        }
      }
      
      public final boolean cF(View paramAnonymousView)
      {
        GMTrace.i(20054544482304L, 149418);
        Object localObject = paramAnonymousView.getTag();
        if ((localObject instanceof com.tencent.mm.plugin.sns.ui.r))
        {
          localObject = (com.tencent.mm.plugin.sns.ui.r)localObject;
          bhc localbhc = ((com.tencent.mm.plugin.sns.ui.r)localObject).qAK;
          if ((localbhc.uyu.tKc == 10) || (localbhc.uyu.tKc == 17) || (localbhc.uyu.tKc == 22) || (localbhc.uyu.tKc == 23))
          {
            GMTrace.o(20054544482304L, 149418);
            return false;
          }
          b.this.qVc.a(paramAnonymousView, ((com.tencent.mm.plugin.sns.ui.r)localObject).fxL, localbhc);
          GMTrace.o(20054544482304L, 149418);
          return true;
        }
        GMTrace.o(20054544482304L, 149418);
        return false;
      }
    };
    this.qUT = new b.e()
    {
      public final void a(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
      {
        GMTrace.i(20053873393664L, 149413);
        if ((paramAnonymousb != null) && (paramAnonymousInt == 0)) {
          if (paramAnonymousb.pBj == null) {
            break label94;
          }
        }
        label94:
        for (paramAnonymousb = (View)paramAnonymousb.pBj.get();; paramAnonymousb = null)
        {
          if ((paramAnonymousb != null) && ((paramAnonymousb instanceof com.tencent.mm.plugin.sight.decode.a.a)))
          {
            paramAnonymousb = (com.tencent.mm.plugin.sight.decode.a.a)paramAnonymousb;
            paramAnonymousb.Nx();
            if ((paramAnonymousb.bex() != null) && ((paramAnonymousb.bex() instanceof ak))) {
              paramAnonymousb.bex();
            }
          }
          GMTrace.o(20053873393664L, 149413);
          return;
        }
      }
    };
    GMTrace.o(8652748488704L, 64468);
  }
  
  public static com.tencent.mm.plugin.sns.storage.m cE(View paramView)
  {
    GMTrace.i(18570901716992L, 138364);
    if ((paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
      paramView = com.tencent.mm.plugin.sns.storage.h.HA(((com.tencent.mm.plugin.sns.ui.ap)paramView.getTag()).fAx);
    }
    for (;;)
    {
      GMTrace.o(18570901716992L, 138364);
      return paramView;
      if ((paramView.getTag() instanceof MaskImageView))
      {
        paramView = (MaskImageView)paramView.getTag();
        if ((paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
          paramView = com.tencent.mm.plugin.sns.storage.h.HA(((com.tencent.mm.plugin.sns.ui.ap)paramView.getTag()).fAx);
        }
      }
      else
      {
        if ((paramView.getTag() instanceof ak))
        {
          paramView = (ak)paramView.getTag();
          paramView = com.tencent.mm.plugin.sns.model.ae.bhp().HA(paramView.fxL);
          continue;
        }
        paramView = com.tencent.mm.plugin.sns.storage.h.Hz(((a.c)paramView.getTag()).fMT);
        continue;
      }
      paramView = null;
    }
  }
  
  public final void a(View paramView, com.tencent.mm.plugin.sns.storage.m paramm, int paramInt, String paramString)
  {
    GMTrace.i(18570633281536L, 138362);
    int i;
    if ((paramView.getTag() instanceof a.c))
    {
      paramView = ((a.c)paramView.getTag()).qUe.uS(0);
      if (!(paramView.getTag() instanceof com.tencent.mm.plugin.sns.ui.ap)) {
        break label512;
      }
      if ((!paramm.bjH().qln) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(paramString))) {
        break label504;
      }
      Object localObject = paramm.bkp();
      if (this.scene != 0) {
        break label493;
      }
      i = 1;
      label78:
      int j = paramm.bku();
      if (paramm.bkr() != null) {
        paramm.bkr().getSource();
      }
      localObject = new com.tencent.mm.plugin.sns.a.b.c((String)localObject, paramInt, i, "", j, 21, paramm.bjL().qBT, paramm.bjM());
      com.tencent.mm.kernel.h.xy().gQO.a((k)localObject, 0);
      localObject = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(paramm);
      if (!bg.mZ((String)localObject)) {
        paramm.bkr().field_adxml = ((String)localObject);
      }
      localObject = new int[2];
      if (paramView != null) {
        paramView.getLocationInWindow((int[])localObject);
      }
      paramInt = paramView.getWidth();
      i = paramView.getHeight();
      paramView = new Intent();
      paramView.putExtra("img_gallery_left", localObject[0]);
      paramView.putExtra("img_gallery_top", localObject[1]);
      paramView.putExtra("img_gallery_width", paramInt);
      paramView.putExtra("img_gallery_height", i);
      paramView.putExtra("sns_landing_pages_share_sns_id", paramm.bjM());
      paramView.putExtra("sns_landing_pages_ux_info", paramm.bkq());
      paramView.putExtra("sns_landing_pages_aid", paramm.bkl());
      paramView.putExtra("sns_landing_pages_traceid", paramm.bkm());
      localObject = paramm.bjL();
      if (localObject != null)
      {
        localObject = ((bhc)localObject).uyu.tKd;
        if (((List)localObject).size() > 0) {
          paramView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject).get(0)).uhA);
        }
      }
      paramView.setClass(this.activity, SnsAdNativeLandingPagesUI.class);
      if (this.scene != 0) {
        break label499;
      }
    }
    label493:
    label499:
    for (paramInt = 1;; paramInt = 2)
    {
      paramView.putExtra("sns_landig_pages_from_source", paramInt);
      paramView.putExtra("sns_landing_pages_xml", paramString);
      paramView.putExtra("sns_landing_pages_rec_src", paramm.bkt());
      paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
      paramView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
      this.activity.startActivity(paramView);
      this.activity.overridePendingTransition(0, 0);
      if (this.qyj != null) {
        this.qyj.bgU().v(paramm);
      }
      GMTrace.o(18570633281536L, 138362);
      return;
      if ((paramView.getTag() instanceof MaskImageView))
      {
        paramView = (MaskImageView)paramView.getTag();
        break;
      }
      paramView = (TagImageView)paramView;
      break;
      i = 2;
      break label78;
    }
    label504:
    w.e("MicroMsg.TimelineClickListener", "cardSelectLeftLsn invalid ad style");
    label512:
    GMTrace.o(18570633281536L, 138362);
  }
  
  public final boolean a(com.tencent.mm.plugin.sns.storage.a parama, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(16046400471040L, 119555);
    if ((parama != null) && (parama.qla == 4) && (parama.qlr != null))
    {
      px localpx = new px();
      localpx.fNL.fty = (com.tencent.mm.plugin.sns.data.i.jdMethod_do(paramm.field_snsId) + ":" + parama.qhb + ":" + com.tencent.mm.plugin.sns.model.ae.bgV() + ":" + System.currentTimeMillis());
      localpx.fNL.userName = parama.qlr.fBG;
      localpx.fNL.fNP = bg.RF(parama.qlr.aKG);
      localpx.fNL.fNN = parama.qlr.ftz;
      parama = localpx.fNL;
      if (this.scene == 0) {}
      for (int i = 1045;; i = 1046)
      {
        parama.scene = i;
        com.tencent.mm.sdk.b.a.uLm.m(localpx);
        GMTrace.o(16046400471040L, 119555);
        return true;
      }
    }
    GMTrace.o(16046400471040L, 119555);
    return false;
  }
  
  public final void aIu()
  {
    GMTrace.i(8654090665984L, 64478);
    a locala = this.qVc;
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(218, locala);
    GMTrace.o(8654090665984L, 64478);
  }
  
  public final void aqA()
  {
    GMTrace.i(8654224883712L, 64479);
    a locala = this.qVc;
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(218, locala);
    GMTrace.o(8654224883712L, 64479);
  }
  
  public final void b(View paramView, com.tencent.mm.plugin.sns.storage.m paramm, int paramInt, String paramString)
  {
    GMTrace.i(18570767499264L, 138363);
    Object localObject = null;
    a.c localc = null;
    if ((paramView.getTag() instanceof ak)) {
      localObject = (ak)paramView.getTag();
    }
    if ((paramView.getTag() instanceof a.c))
    {
      localc = (a.c)paramView.getTag();
      if (!(localc.qUD.qFo.getTag() instanceof ak))
      {
        GMTrace.o(18570767499264L, 138363);
        return;
      }
      localObject = (ak)localc.qUD.qFo.getTag();
    }
    for (;;)
    {
      if (paramm == null)
      {
        GMTrace.o(18570767499264L, 138363);
        return;
      }
      if (this.qyj != null) {
        this.qyj.bgU().v(paramm);
      }
      boolean bool = paramm.uF(32);
      bhc localbhc = ((ak)localObject).qFm;
      if ((localbhc.uyu.tKd == null) || (localbhc.uyu.tKd.size() == 0))
      {
        w.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
        GMTrace.o(18570767499264L, 138363);
        return;
      }
      amn localamn = (amn)localbhc.uyu.tKd.get(0);
      if (bool)
      {
        com.tencent.mm.plugin.sns.model.ae.bhm();
        if (!com.tencent.mm.plugin.sns.model.g.t(localamn))
        {
          ((ak)localObject).qrh.setVisibility(8);
          ((ak)localObject).qFp.setVisibility(0);
          ((ak)localObject).qFp.cgd();
          com.tencent.mm.plugin.sns.model.ae.bhm().y(localamn);
          paramView = com.tencent.mm.plugin.sns.model.ae.bhk();
          paramm = an.bQy();
          paramm.time = localbhc.orU;
          paramView.a(localamn, 4, null, paramm);
          GMTrace.o(18570767499264L, 138363);
          return;
        }
      }
      if ((paramm.uF(32)) && (paramm.bjH().qln) && (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(paramString))) {}
      for (int i = 1; (i == 0) && (bool) && (com.tencent.mm.plugin.sns.model.ae.bhm().u(localamn)); i = 0)
      {
        com.tencent.mm.plugin.sns.model.ae.bhm().y(localamn);
        ((ak)localObject).qrh.setVisibility(8);
        ((ak)localObject).qFp.setVisibility(8);
        paramView = com.tencent.mm.plugin.sns.model.ae.bhm();
        paramString = ((ak)localObject).pDA;
        paramInt = this.activity.hashCode();
        i = ((ak)localObject).position;
        localObject = an.bQy();
        ((an)localObject).time = localbhc.orU;
        paramView.a(paramm, localamn, paramString, paramInt, i, (an)localObject, bool);
        GMTrace.o(18570767499264L, 138363);
        return;
      }
      localObject = new int[2];
      int j;
      int k;
      if (localc != null)
      {
        if (localc.qUD.qFo != null) {
          localc.qUD.qFo.getLocationInWindow((int[])localObject);
        }
        i = localc.qUD.qFo.getWidth();
        j = localc.qUD.qFo.getHeight();
        if ((!paramm.uF(32)) || (!paramm.bjH().qln) || (!com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.Hu(paramString))) {
          break label957;
        }
        paramView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e.w(paramm);
        if (!bg.mZ(paramView)) {
          paramm.bkr().field_adxml = paramView;
        }
        paramView = paramm.bkp();
        if (this.scene != 0) {
          break label946;
        }
        k = 1;
        label569:
        int m = paramm.bku();
        if (paramm.bkr() != null) {
          paramm.bkr().getSource();
        }
        paramView = new com.tencent.mm.plugin.sns.a.b.c(paramView, paramInt, k, "", m, 21, paramm.bjL().qBT, paramm.bjM());
        com.tencent.mm.kernel.h.xy().gQO.a(paramView, 0);
        paramView = new Intent();
        paramView.putExtra("img_gallery_left", localObject[0]);
        paramView.putExtra("img_gallery_top", localObject[1]);
        paramView.putExtra("img_gallery_width", i);
        paramView.putExtra("img_gallery_height", j);
        paramView.putExtra("sns_landing_pages_share_sns_id", paramm.bjM());
        paramView.putExtra("sns_landing_pages_ux_info", paramm.bkq());
        localObject = paramm.bjL();
        if (localObject != null)
        {
          localObject = ((bhc)localObject).uyu.tKd;
          if (((List)localObject).size() > 0) {
            paramView.putExtra("sns_landing_pages_share_thumb_url", ((amn)((List)localObject).get(0)).uhA);
          }
        }
        paramView.setClass(this.activity, SnsAdNativeLandingPagesUI.class);
        if (this.scene != 0) {
          break label952;
        }
      }
      label946:
      label952:
      for (paramInt = 1;; paramInt = 2)
      {
        paramView.putExtra("sns_landig_pages_from_source", paramInt);
        paramView.putExtra("sns_landing_pages_xml", paramString);
        paramView.putExtra("sns_landing_pages_rec_src", paramm.bkt());
        paramView.putExtra("sns_landing_pages_xml_prefix", "adxml");
        paramView.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
        paramView.putExtra("sns_landing_is_native_sight_ad", true);
        this.activity.startActivity(paramView);
        this.activity.overridePendingTransition(0, 0);
        GMTrace.o(18570767499264L, 138363);
        return;
        if ((paramView.getTag() instanceof ak))
        {
          paramView = (ak)paramView.getTag();
          if (paramView != null) {
            paramView.qFo.getLocationInWindow((int[])localObject);
          }
          i = paramView.qFo.getWidth();
          j = paramView.qFo.getHeight();
          break;
        }
        if (paramView != null) {
          paramView.getLocationInWindow((int[])localObject);
        }
        i = paramView.getWidth();
        j = paramView.getHeight();
        break;
        k = 2;
        break label569;
      }
      label957:
      w.e("MicroMsg.TimelineClickListener", "cardSelectLeftLsn invalid ad style");
      GMTrace.o(18570767499264L, 138363);
      return;
    }
  }
  
  public abstract void bkX();
  
  public abstract void bkY();
  
  public abstract void bkZ();
  
  public abstract void br(Object paramObject);
  
  public abstract void c(View paramView, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void cA(View paramView);
  
  public abstract void cw(View paramView);
  
  public abstract void cx(View paramView);
  
  public abstract void cy(View paramView);
  
  public abstract void cz(View paramView);
  
  public final void h(bhc parambhc)
  {
    GMTrace.i(16631187111936L, 123912);
    if ((parambhc != null) && (parambhc.qfM != null) && (parambhc.qfM.tuc != null) && (com.tencent.mm.pluginsdk.model.app.g.bE(parambhc.qfM.tuc.mDD)))
    {
      com.tencent.mm.protocal.c.as localas = parambhc.qfM;
      String str = com.tencent.mm.plugin.sns.c.a.ifN.bC(localas.tuc.mDD);
      com.tencent.mm.plugin.sns.c.a.ifN.a(this.activity, localas.tuc.mDD, str, parambhc.jWW, 38, 19, 10, localas.tuc.ttV, parambhc.nas);
    }
    GMTrace.o(16631187111936L, 123912);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */