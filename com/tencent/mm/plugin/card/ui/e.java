package com.tencent.mm.plugin.card.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.g.a.bu;
import com.tencent.mm.plugin.card.a.g.a;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI;
import com.tencent.mm.plugin.card.ui.a.a;
import com.tencent.mm.plugin.card.ui.view.i;
import com.tencent.mm.plugin.card.ui.view.k;
import com.tencent.mm.plugin.card.ui.view.u;
import com.tencent.mm.plugin.card.ui.view.y;
import com.tencent.mm.plugin.card.ui.view.z;
import com.tencent.mm.pluginsdk.ui.applet.k.a;
import com.tencent.mm.protocal.c.afc;
import com.tencent.mm.protocal.c.au;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.protocal.c.pd;
import com.tencent.mm.protocal.c.pu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.x.q.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"UseSparseArrays"})
public final class e
  implements g.a, m, MMActivity.a
{
  ListView EA;
  private final String TAG;
  LinearLayout dl;
  boolean fBD;
  View.OnClickListener iom;
  public MMActivity jFp;
  public com.tencent.mm.plugin.card.base.b kmJ;
  public List<com.tencent.mm.plugin.card.model.b> kmN;
  public ArrayList<ji> kmP;
  public int krX;
  public String krY;
  public String krZ;
  private View krg;
  public ArrayList<String> ksa;
  public ArrayList<String> ksb;
  public j kuA;
  public boolean kuB;
  com.tencent.mm.plugin.card.a.f kuC;
  public String kuD;
  public String kuE;
  public HashMap<Integer, String> kuF;
  public HashMap<String, String> kuG;
  public ArrayList<String> kuH;
  public d kuI;
  public a kuJ;
  private ae kuK;
  com.tencent.mm.sdk.b.c kuL;
  com.tencent.mm.plugin.card.ui.a.g kui;
  i kuj;
  public boolean kuk;
  i kul;
  i kum;
  com.tencent.mm.plugin.card.widget.g kun;
  public com.tencent.mm.plugin.card.ui.view.g kuo;
  l kup;
  i kuq;
  i kur;
  i kus;
  i kut;
  i kuu;
  i kuv;
  i kuw;
  i kux;
  com.tencent.mm.plugin.card.ui.view.d kuy;
  i kuz;
  
  public e(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(4964847976448L, 36991);
    this.TAG = "MicroMsg.CardDetailUIContoller";
    this.kuk = false;
    this.kuB = true;
    this.kmN = new ArrayList();
    this.kuD = "";
    this.kuE = "";
    this.krX = 0;
    this.krY = "";
    this.krZ = "";
    this.ksa = new ArrayList();
    this.ksb = new ArrayList();
    this.kuF = new HashMap();
    this.kuG = new HashMap();
    this.kuH = new ArrayList();
    this.fBD = false;
    this.kuK = new ae()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(18900406239232L, 140819);
        if ((paramAnonymousMessage.obj != null) && ((paramAnonymousMessage.obj instanceof e.c)))
        {
          paramAnonymousMessage = (e.c)paramAnonymousMessage.obj;
          if (paramAnonymousMessage.kuV == e.b.kuT)
          {
            if (e.this.kuo != null)
            {
              com.tencent.mm.plugin.card.b.d.a(e.this.jFp, paramAnonymousMessage.ftU, false);
              e.this.kuo.ame();
              GMTrace.o(18900406239232L, 140819);
            }
          }
          else if (paramAnonymousMessage.kuV == e.b.kuR)
          {
            if (e.this.kuo != null)
            {
              e.this.kuo.d(com.tencent.mm.plugin.card.b.c.kAD);
              GMTrace.o(18900406239232L, 140819);
            }
          }
          else if (e.this.kuo != null) {
            e.this.kuo.d(paramAnonymousMessage.kuW);
          }
        }
        GMTrace.o(18900406239232L, 140819);
      }
    };
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        boolean bool = true;
        int i = 0;
        GMTrace.i(18898929844224L, 140808);
        if ((paramAnonymousView.getId() == R.h.boF) || (paramAnonymousView.getId() == R.h.bow))
        {
          if (e.this.kmJ.aip())
          {
            if (e.this.kuI != null)
            {
              e.this.kuI.akH();
              GMTrace.o(18898929844224L, 140808);
            }
          }
          else if ((e.this.kmJ.aiq()) && (e.this.kuI != null))
          {
            e.this.kuI.akF();
            GMTrace.o(18898929844224L, 140808);
          }
        }
        else
        {
          if ((paramAnonymousView.getId() == R.h.bKD) || (paramAnonymousView.getId() == R.h.bfZ))
          {
            com.tencent.mm.plugin.card.b.b.P(e.this.jFp, e.this.kuJ.ktT);
            GMTrace.o(18898929844224L, 140808);
            return;
          }
          Object localObject;
          if ((paramAnonymousView.getId() == R.h.bvz) || (paramAnonymousView.getId() == R.h.bvq))
          {
            if (paramAnonymousView.getId() == R.h.bvz)
            {
              e.this.kuB = false;
              if ((e.this.kuo instanceof com.tencent.mm.plugin.card.ui.view.q))
              {
                localObject = ((com.tencent.mm.plugin.card.ui.view.q)e.this.kuo).e(com.tencent.mm.plugin.card.b.c.kAF);
                e.this.kuA.kyD = ((String)localObject);
              }
              localObject = e.this.kuA;
              bool = e.this.kuB;
              ((j)localObject).alm();
              ((j)localObject).kuB = bool;
              if ((((j)localObject).ioi != null) && (!((j)localObject).ioi.isShowing()))
              {
                ((j)localObject).ioi.showAtLocation(paramAnonymousView.getRootView(), 17, 0, 0);
                ((j)localObject).ioi.setFocusable(true);
                ((j)localObject).ioi.setTouchable(true);
                ((j)localObject).ioi.setBackgroundDrawable(new ColorDrawable(16777215));
                ((j)localObject).ioi.setOutsideTouchable(true);
                if (!((j)localObject).kuB) {
                  break label766;
                }
                ((j)localObject).kyz.setOnClickListener(((j)localObject).iom);
                paramAnonymousView = ((j)localObject).kyv;
                if (((j)localObject).krk == null) {
                  break label678;
                }
                ((j)localObject).kyv = com.tencent.mm.plugin.card.b.l.t(((j)localObject).krk);
                label412:
                ((j)localObject).kyz.setImageBitmap(((j)localObject).kyv);
                ((j)localObject).kyC.add(0, paramAnonymousView);
                ((j)localObject).alo();
                ((j)localObject).iok.setVisibility(8);
                ((j)localObject).kyy.setVisibility(0);
                paramAnonymousView = ((j)localObject).kmJ.aiL().code;
                if ((((j)localObject).kmJ.aiK().tFB != null) && (((j)localObject).kmJ.aiK().tFB.tLw)) {
                  break label720;
                }
                if (com.tencent.pb.common.c.h.isNullOrEmpty(((j)localObject).kmJ.aiL().tEG)) {
                  break label687;
                }
                paramAnonymousView = ((j)localObject).kmJ.aiL().tEG;
                label541:
                if ((TextUtils.isEmpty(paramAnonymousView)) || (paramAnonymousView.length() > 40)) {
                  break label740;
                }
                ((j)localObject).kyA.setText(com.tencent.mm.plugin.card.b.m.us(paramAnonymousView));
                if (!((j)localObject).kmJ.aiz()) {
                  break label727;
                }
                ((j)localObject).kyA.setVisibility(0);
                label591:
                if (TextUtils.isEmpty(((j)localObject).kmJ.aiK().kKJ)) {
                  break label753;
                }
                ((j)localObject).kyB.setText(((j)localObject).kmJ.aiK().kKJ);
                ((j)localObject).kyB.setVisibility(0);
              }
            }
            for (;;)
            {
              ((j)localObject).ioi.update();
              GMTrace.o(18898929844224L, 140808);
              return;
              if (paramAnonymousView.getId() != R.h.bvq) {
                break;
              }
              e.this.kuB = true;
              break;
              label678:
              ((j)localObject).kyv = null;
              break label412;
              label687:
              if (!((j)localObject).kmJ.aiE()) {
                break label541;
              }
              if (!com.tencent.pb.common.c.h.isNullOrEmpty(((j)localObject).kyD))
              {
                paramAnonymousView = ((j)localObject).kyD;
                break label541;
              }
              label720:
              paramAnonymousView = "";
              break label541;
              label727:
              ((j)localObject).kyA.setVisibility(8);
              break label591;
              label740:
              ((j)localObject).kyA.setVisibility(8);
              break label591;
              label753:
              ((j)localObject).kyB.setVisibility(8);
            }
            label766:
            ((j)localObject).ioj.setOnClickListener(((j)localObject).iom);
            ((j)localObject).ioj.setImageBitmap(((j)localObject).ioh);
            paramAnonymousView = ((j)localObject).kmJ.aiL().code;
            if ((((j)localObject).kmJ.aiK().tFB == null) || (!((j)localObject).kmJ.aiK().tFB.tLw)) {
              if (!com.tencent.pb.common.c.h.isNullOrEmpty(((j)localObject).kmJ.aiL().tEG))
              {
                paramAnonymousView = ((j)localObject).kmJ.aiL().tEG;
                label874:
                if ((TextUtils.isEmpty(paramAnonymousView)) || (paramAnonymousView.length() > 40)) {
                  break label1048;
                }
                ((j)localObject).kyw.setText(com.tencent.mm.plugin.card.b.m.us(paramAnonymousView));
                if (!((j)localObject).kmJ.aiz()) {
                  break label1035;
                }
                ((j)localObject).kyw.setVisibility(0);
                label924:
                if (TextUtils.isEmpty(((j)localObject).kmJ.aiK().kKJ)) {
                  break label1061;
                }
                ((j)localObject).kyx.setText(((j)localObject).kmJ.aiK().kKJ);
                ((j)localObject).kyx.setVisibility(0);
              }
            }
            for (;;)
            {
              ((j)localObject).iok.setVisibility(0);
              ((j)localObject).kyy.setVisibility(8);
              break;
              if (!((j)localObject).kmJ.aiE()) {
                break label874;
              }
              if (!com.tencent.pb.common.c.h.isNullOrEmpty(((j)localObject).kyD))
              {
                paramAnonymousView = ((j)localObject).kyD;
                break label874;
              }
              paramAnonymousView = "";
              break label874;
              label1035:
              ((j)localObject).kyw.setVisibility(8);
              break label924;
              label1048:
              ((j)localObject).kyw.setVisibility(8);
              break label924;
              label1061:
              ((j)localObject).kyx.setVisibility(8);
            }
          }
          int j;
          String str1;
          int k;
          String str2;
          if ((paramAnonymousView.getId() == R.h.bpo) || (paramAnonymousView.getId() == R.h.bpk) || (paramAnonymousView.getId() == R.h.bpj) || (paramAnonymousView.getId() == R.h.bvG) || (paramAnonymousView.getId() == R.h.bpi))
          {
            if (paramAnonymousView.getId() == R.h.bpo)
            {
              if (e.this.kmJ.aiq())
              {
                paramAnonymousView = com.tencent.mm.plugin.report.service.g.paX;
                j = e.this.kmJ.aiK().knq;
                localObject = e.this.kmJ.aiP();
                str1 = e.this.kmJ.aiO();
                k = e.this.kuJ.krw;
                str2 = e.this.kuJ.ktT;
                if (e.this.kmJ.aiI()) {}
                for (i = 1;; i = 0)
                {
                  paramAnonymousView.i(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(j), localObject, str1, Integer.valueOf(0), Integer.valueOf(k), str2, Integer.valueOf(i), "" });
                  if (e.this.kuI == null) {
                    break;
                  }
                  e.this.kuI.dz(true);
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
              }
              paramAnonymousView = new i.b();
              e.this.a(true, paramAnonymousView, false);
              GMTrace.o(18898929844224L, 140808);
              return;
            }
            if ((paramAnonymousView.getId() == R.h.bvG) && (e.this.kmJ.aiK().tFE))
            {
              GMTrace.o(18898929844224L, 140808);
              return;
            }
            if (e.this.kmJ.aiq())
            {
              if (e.this.kuI != null)
              {
                e.this.kuI.dz(false);
                GMTrace.o(18898929844224L, 140808);
              }
            }
            else
            {
              paramAnonymousView = new i.b();
              e.this.a(false, paramAnonymousView, false);
              GMTrace.o(18898929844224L, 140808);
            }
          }
          else if (paramAnonymousView.getId() == R.h.bhe)
          {
            if (!TextUtils.isEmpty(e.this.kmJ.aiK().tFi))
            {
              com.tencent.mm.plugin.card.b.b.a(e.this.jFp, e.this.kmJ.aiK().tFi, 3);
              com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(13), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", e.this.kmJ.aiK().tFh });
              GMTrace.o(18898929844224L, 140808);
            }
          }
          else
          {
            if (paramAnonymousView.getId() == R.h.bqN)
            {
              com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OpenShareUserSelectView", Integer.valueOf(0), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), e.this.kuJ.ktT });
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("KLabel_range_index", e.this.krX);
              paramAnonymousView.putExtra("Klabel_name_list", e.this.krY);
              paramAnonymousView.putExtra("Kother_user_name_list", e.this.krZ);
              paramAnonymousView.putExtra("k_sns_label_ui_title", e.this.jFp.getString(R.l.dGn));
              paramAnonymousView.putExtra("k_sns_label_ui_style", 0);
              paramAnonymousView.putExtra("Ktag_rangeFilterprivate", true);
              com.tencent.mm.bi.d.b(e.this.jFp, "sns", ".ui.SnsLabelUI", paramAnonymousView, 2);
              e.this.jFp.vow = e.this;
              GMTrace.o(18898929844224L, 140808);
              return;
            }
            if (paramAnonymousView.getId() == R.h.bqY)
            {
              if (e.this.kmJ.aiL().tEu != null)
              {
                localObject = e.this.kmJ.aiL().tEu;
                i = ((Integer)paramAnonymousView.getTag()).intValue();
                paramAnonymousView = (nc)((LinkedList)localObject).get(i);
                if (com.tencent.mm.plugin.card.b.b.a(e.this.kmJ.aiO(), paramAnonymousView, e.this.kuJ.krw, e.this.kuJ.kuP))
                {
                  com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(19), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", paramAnonymousView.title });
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                if ((paramAnonymousView != null) && (!TextUtils.isEmpty(paramAnonymousView.url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.jFp, paramAnonymousView.url, 1);
                  localObject = com.tencent.mm.plugin.report.service.g.paX;
                  switch (i)
                  {
                  default: 
                    i = 10;
                  }
                }
                for (;;)
                {
                  ((com.tencent.mm.plugin.report.service.g)localObject).i(11941, new Object[] { Integer.valueOf(i), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", paramAnonymousView.title });
                  if (com.tencent.mm.plugin.card.b.l.a(paramAnonymousView, e.this.kmJ.aiO()))
                  {
                    localObject = e.this.kmJ.aiO();
                    paramAnonymousView = paramAnonymousView.title;
                    com.tencent.mm.plugin.card.b.l.uq((String)localObject);
                    com.tencent.mm.plugin.card.b.b.a(e.this.jFp, e.this.kmJ.aiK().koD);
                  }
                  GMTrace.o(18898929844224L, 140808);
                  return;
                  i = 10;
                  continue;
                  i = 11;
                  continue;
                  i = 12;
                  continue;
                  i = 16;
                }
              }
            }
            else if (paramAnonymousView.getId() == R.h.bqZ)
            {
              if (e.this.kmJ.aiL().tEu != null)
              {
                localObject = (nc)e.this.kmJ.aiL().tEu.get(0);
                if (com.tencent.mm.plugin.card.b.b.a(e.this.kmJ.aiO(), (nc)localObject, e.this.kuJ.krw, e.this.kuJ.kuP))
                {
                  com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(19), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", ((nc)localObject).title });
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                if ((localObject != null) && (!TextUtils.isEmpty(((nc)localObject).url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.jFp, ((nc)localObject).url, 1);
                  com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(10), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", ((nc)localObject).title });
                  if (com.tencent.mm.plugin.card.b.l.a((nc)localObject, e.this.kmJ.aiO()))
                  {
                    paramAnonymousView = e.this.kmJ.aiO();
                    localObject = ((nc)localObject).title;
                    com.tencent.mm.plugin.card.b.l.uq(paramAnonymousView);
                    com.tencent.mm.plugin.card.b.b.a(e.this.jFp, e.this.kmJ.aiK().koD);
                  }
                }
                GMTrace.o(18898929844224L, 140808);
              }
            }
            else if ((paramAnonymousView.getId() == R.h.bry) || (paramAnonymousView.getId() == R.h.bqG))
            {
              if (e.this.kmJ.aiL().tEB != null) {
                if (e.this.kmJ.aiC())
                {
                  if (e.this.kmJ.aiq())
                  {
                    if (e.this.kuI != null)
                    {
                      e.this.kuI.dz(false);
                      GMTrace.o(18898929844224L, 140808);
                    }
                  }
                  else
                  {
                    paramAnonymousView = new i.b();
                    e.this.a(false, paramAnonymousView, false);
                    GMTrace.o(18898929844224L, 140808);
                  }
                }
                else
                {
                  if (e.this.kmJ.aiD())
                  {
                    paramAnonymousView = new i.b();
                    com.tencent.mm.plugin.card.b.b.a(e.this.jFp, paramAnonymousView.knf, paramAnonymousView.kng, false, e.this.kmJ);
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  paramAnonymousView = e.this.kmJ.aiL().tEB;
                  if (com.tencent.mm.plugin.card.b.b.a(e.this.kmJ.aiO(), paramAnonymousView, e.this.kuJ.krw, e.this.kuJ.kuP))
                  {
                    com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(20), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", paramAnonymousView.title });
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  if ((paramAnonymousView != null) && (!TextUtils.isEmpty(paramAnonymousView.url)))
                  {
                    localObject = com.tencent.mm.plugin.card.b.l.r(paramAnonymousView.url, paramAnonymousView.tFX);
                    com.tencent.mm.plugin.card.b.b.a(e.this.jFp, (String)localObject, 1);
                    com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(9), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", paramAnonymousView.title });
                    if (com.tencent.mm.plugin.card.b.l.a(paramAnonymousView, e.this.kmJ.aiO()))
                    {
                      localObject = e.this.kmJ.aiO();
                      paramAnonymousView = paramAnonymousView.title;
                      com.tencent.mm.plugin.card.b.l.uq((String)localObject);
                      com.tencent.mm.plugin.card.b.b.a(e.this.jFp, e.this.kmJ.aiK().koD);
                    }
                  }
                  GMTrace.o(18898929844224L, 140808);
                }
              }
            }
            else
            {
              String str3;
              if ((paramAnonymousView.getId() == R.h.bpz) || (paramAnonymousView.getId() == R.h.boH))
              {
                paramAnonymousView = e.this.kmJ.aiK().tFo;
                localObject = com.tencent.mm.plugin.report.service.g.paX;
                j = e.this.kmJ.aiK().knq;
                str1 = e.this.kmJ.aiP();
                str2 = e.this.kmJ.aiO();
                k = e.this.kuJ.krw;
                str3 = e.this.kuJ.ktT;
                if (e.this.kmJ.aiI()) {
                  i = 1;
                }
                ((com.tencent.mm.plugin.report.service.g)localObject).i(11324, new Object[] { "CardLeftRightIntroduceView", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
                if ((paramAnonymousView != null) && (!TextUtils.isEmpty(paramAnonymousView.url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.jFp, paramAnonymousView.url, 1);
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                paramAnonymousView = new Intent();
                if ((e.this.kmJ instanceof CardInfo)) {
                  paramAnonymousView.putExtra("key_card_info_data", (CardInfo)e.this.kmJ);
                }
                for (;;)
                {
                  paramAnonymousView.setClass(e.this.jFp, CardDetailPreference.class);
                  e.this.jFp.startActivity(paramAnonymousView);
                  GMTrace.o(18898929844224L, 140808);
                  return;
                  if ((e.this.kmJ instanceof ShareCardInfo)) {
                    paramAnonymousView.putExtra("key_card_info_data", (ShareCardInfo)e.this.kmJ);
                  }
                }
              }
              if (paramAnonymousView.getId() == R.h.cxM)
              {
                if (com.tencent.mm.plugin.card.sharecard.a.b.tJ(e.this.kmJ.aiP()) <= 1)
                {
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                paramAnonymousView = e.this;
                if (!e.this.kuk) {}
                for (;;)
                {
                  paramAnonymousView.kuk = bool;
                  e.this.akd();
                  GMTrace.o(18898929844224L, 140808);
                  return;
                  bool = false;
                }
              }
              if (paramAnonymousView.getId() == R.h.boL)
              {
                if ((e.this.kmJ.aiK().tFk != null) && (!TextUtils.isEmpty(e.this.kmJ.aiK().tFk.url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.jFp, e.this.kmJ.aiK().tFk.url, 3);
                  com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(3), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", e.this.kmJ.aiK().tFk.text });
                  GMTrace.o(18898929844224L, 140808);
                }
              }
              else if (paramAnonymousView.getId() == R.h.boD)
              {
                if ((e.this.kmJ.aiK().tFr != null) && (!bg.mZ(e.this.kmJ.aiK().tFr.url)))
                {
                  com.tencent.mm.plugin.card.b.b.a(e.this.jFp, e.this.kmJ.aiK().tFr.url, 1);
                  com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(14), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", e.this.kmJ.aiK().tFr.text });
                  GMTrace.o(18898929844224L, 140808);
                }
              }
              else if ((paramAnonymousView.getId() == R.h.cxR) || (paramAnonymousView.getId() == R.h.cxS))
              {
                if (e.this.kmJ.aiK().tFa > 0)
                {
                  if ((e.this.kmP == null) || (e.this.kmP.size() == 0))
                  {
                    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  paramAnonymousView = (ji)e.this.kmP.get(0);
                  com.tencent.mm.plugin.card.b.b.a(e.this.jFp, paramAnonymousView.fFh, paramAnonymousView.fGL, paramAnonymousView.hwK);
                  localObject = com.tencent.mm.plugin.report.service.g.paX;
                  j = e.this.kmJ.aiK().knq;
                  str1 = e.this.kmJ.aiP();
                  str2 = e.this.kmJ.aiO();
                  k = e.this.kuJ.krw;
                  str3 = e.this.kuJ.ktT;
                  if (e.this.kmJ.aiI()) {}
                  for (i = 1;; i = 0)
                  {
                    ((com.tencent.mm.plugin.report.service.g)localObject).i(11324, new Object[] { "UsedStoresView", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
                    com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(5), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", paramAnonymousView.name });
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                }
              }
              else
              {
                if (paramAnonymousView.getId() == R.h.cAM)
                {
                  if ((e.this.kmP == null) || (e.this.kmP.size() == 0))
                  {
                    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "mShopList == null || mShopList.size() == 0");
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  localObject = (ji)e.this.kmP.get(0);
                  paramAnonymousView = (String)paramAnonymousView.getTag();
                  if ((!TextUtils.isEmpty(paramAnonymousView)) && (paramAnonymousView.equals(e.this.jFp.getString(R.l.dEP))))
                  {
                    e.this.akX();
                    GMTrace.o(18898929844224L, 140808);
                    return;
                  }
                  if (!TextUtils.isEmpty(((ji)localObject).kpe))
                  {
                    com.tencent.mm.plugin.card.b.b.a(e.this.jFp, ((ji)localObject).kpe, 1);
                    com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(4), e.this.kmJ.aiO(), e.this.kmJ.aiP(), "", ((ji)localObject).name });
                  }
                  GMTrace.o(18898929844224L, 140808);
                  return;
                }
                if (paramAnonymousView.getId() == R.h.cAH) {
                  e.this.akX();
                }
              }
            }
          }
        }
        GMTrace.o(18898929844224L, 140808);
      }
    };
    this.kuL = new com.tencent.mm.sdk.b.c() {};
    this.jFp = paramMMActivity;
    this.krg = paramView;
    GMTrace.o(4964847976448L, 36991);
  }
  
  private void akV()
  {
    GMTrace.i(4967398113280L, 37010);
    int i = R.g.baG;
    if (this.kmJ.air()) {
      i = R.g.aXe;
    }
    this.jFp.a(0, i, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18897050796032L, 140794);
        com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "CardDetailUiMenu", Integer.valueOf(1), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), e.this.kuJ.ktT });
        paramAnonymousMenuItem = (String[])e.this.kuH.toArray(new String[e.this.kuH.size()]);
        com.tencent.mm.ui.base.h.a(e.this.jFp.vov.voR, null, paramAnonymousMenuItem, null, false, new h.c()
        {
          public final void hC(int paramAnonymous2Int)
          {
            GMTrace.i(18897453449216L, 140797);
            Object localObject1 = (String)e.this.kuF.get(Integer.valueOf(paramAnonymous2Int));
            if (TextUtils.isEmpty((CharSequence)localObject1))
            {
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            Object localObject2;
            Object localObject3;
            String str1;
            if (((String)localObject1).equals("menu_func_share_friend"))
            {
              localObject1 = e.this;
              com.tencent.mm.plugin.card.b.b.a(((e)localObject1).jFp, 1, (MMActivity.a)localObject1);
              ((e)localObject1).jFp.vow = ((MMActivity.a)localObject1);
              localObject1 = com.tencent.mm.plugin.report.service.g.paX;
              int i = e.this.kmJ.aiK().knq;
              localObject2 = e.this.kmJ.aiP();
              localObject3 = e.this.kmJ.aiO();
              int j = e.this.kuJ.krw;
              str1 = e.this.kuJ.ktT;
              if (e.this.kmJ.aiI()) {}
              for (paramAnonymous2Int = 1;; paramAnonymous2Int = 0)
              {
                ((com.tencent.mm.plugin.report.service.g)localObject1).i(11324, new Object[] { "BrandContactView", Integer.valueOf(i), localObject2, localObject3, Integer.valueOf(0), Integer.valueOf(j), str1, Integer.valueOf(paramAnonymous2Int), "" });
                com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperShareFriend", Integer.valueOf(1), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), e.this.kuD });
                GMTrace.o(18897453449216L, 140797);
                return;
              }
            }
            if (((String)localObject1).equals("menu_func_gift"))
            {
              e.this.akW();
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            if (((String)localObject1).equals("menu_func_delete"))
            {
              localObject1 = "";
              if (e.this.kmJ.air()) {
                localObject1 = e.this.jFp.getString(R.l.dFc);
              }
              com.tencent.mm.plugin.card.b.d.a(e.this.jFp, e.this.kuJ.kmv, (String)localObject1, new d.a()
              {
                public final void aio()
                {
                  GMTrace.i(18882286845952L, 140684);
                  if (e.this.kuI != null) {
                    e.this.kuI.akG();
                  }
                  GMTrace.o(18882286845952L, 140684);
                }
              });
              com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperDelete", Integer.valueOf(1), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), "" });
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            if (((String)localObject1).equals("menu_func_service"))
            {
              if (!TextUtils.isEmpty(e.this.kmJ.aiK().tET))
              {
                com.tencent.mm.plugin.card.b.b.Q(e.this.jFp, e.this.kmJ.aiK().tET);
                al.ajI().m(e.this.kmJ.aiO(), e.this.kmJ.aiP(), 1);
              }
              com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperService", Integer.valueOf(1), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), e.this.kuJ.ktT });
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            if (((String)localObject1).equals("menu_func_report"))
            {
              if (!TextUtils.isEmpty(e.this.kmJ.aiL().tEx)) {
                com.tencent.mm.plugin.card.b.b.a(e.this.jFp, e.this.kmJ.aiL().tEx, e.this.getString(R.l.dFY));
              }
              com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperReport", Integer.valueOf(1), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), "" });
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            if (((String)localObject1).equals("menu_func_share_timeline"))
            {
              com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.card.model.m(e.this.kmJ.aiK().knr));
              localObject1 = e.this.jFp;
              localObject3 = e.this.kmJ;
              str1 = e.this.kuJ.kmv;
              String str2 = e.this.kuJ.ktV;
              localObject2 = new Intent();
              ((Intent)localObject2).putExtra("Ksnsupload_link", ((com.tencent.mm.plugin.card.base.b)localObject3).aiK().tFc);
              ((Intent)localObject2).putExtra("KContentObjDesc", ((com.tencent.mm.plugin.card.base.b)localObject3).aiK().koD);
              ((Intent)localObject2).putExtra("Ksnsupload_title", ((com.tencent.mm.plugin.card.base.b)localObject3).aiK().title);
              if (TextUtils.isEmpty(str2)) {
                ((Intent)localObject2).putExtra("KUploadProduct_UserData", str1 + "#");
              }
              for (;;)
              {
                ((Intent)localObject2).putExtra("Ksnsupload_imgurl", ((com.tencent.mm.plugin.card.base.b)localObject3).aiK().knr);
                if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.base.b)localObject3).aiK().knr)) {
                  ((Intent)localObject2).putExtra("KsnsUpload_imgPath", new com.tencent.mm.plugin.card.model.m(((com.tencent.mm.plugin.card.base.b)localObject3).aiK().knr).Pg());
                }
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CardActivityHelper", "doShareTimeLine KSnsUploadImgPath:" + ((Intent)localObject2).getStringExtra("KsnsUpload_imgPath"));
                ((Intent)localObject2).putExtra("src_username", com.tencent.mm.x.m.zF());
                ((Intent)localObject2).putExtra("src_displayname", com.tencent.mm.x.m.zH());
                ((Intent)localObject2).putExtra("Ksnsupload_appid", ((com.tencent.mm.plugin.card.base.b)localObject3).aiK().fKY);
                ((Intent)localObject2).putExtra("Ksnsupload_appname", ((com.tencent.mm.plugin.card.base.b)localObject3).aiK().tET);
                ((Intent)localObject2).putExtra("Ksnsupload_type", 7);
                localObject3 = com.tencent.mm.x.q.gi("card_package");
                com.tencent.mm.x.q.Aw().n((String)localObject3, true).k("prePublishId", "card_package");
                ((Intent)localObject2).putExtra("reportSessionId", (String)localObject3);
                com.tencent.mm.bi.d.a((Context)localObject1, "sns", ".ui.En_c4f742e5", (Intent)localObject2, false);
                com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperShareTimeLine", Integer.valueOf(1), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), e.this.kuJ.ktT });
                GMTrace.o(18897453449216L, 140797);
                return;
                ((Intent)localObject2).putExtra("KUploadProduct_UserData", str1 + "#" + str2);
              }
            }
            if (((String)localObject1).equals("menu_func_delete_share_card"))
            {
              com.tencent.mm.plugin.card.b.d.a(e.this.jFp, e.this.kuJ.kmv, "", new d.a()
              {
                public final void aio()
                {
                  GMTrace.i(18881884192768L, 140681);
                  if (e.this.kuI != null) {
                    e.this.kuI.akJ();
                  }
                  GMTrace.o(18881884192768L, 140681);
                }
              });
              GMTrace.o(18897453449216L, 140797);
              return;
            }
            localObject1 = (String)e.this.kuG.get(localObject1);
            if (!bg.mZ((String)localObject1)) {
              com.tencent.mm.plugin.card.b.b.a(e.this.jFp, (String)localObject1, 0);
            }
            GMTrace.o(18897453449216L, 140797);
          }
        });
        GMTrace.o(18897050796032L, 140794);
        return true;
      }
    });
    GMTrace.o(4967398113280L, 37010);
  }
  
  private String akf()
  {
    GMTrace.i(4967666548736L, 37012);
    String str;
    if ((!TextUtils.isEmpty(this.krY)) && (!TextUtils.isEmpty(this.krZ)))
    {
      str = this.krY + "," + com.tencent.mm.plugin.card.b.l.uo(this.krZ);
      GMTrace.o(4967666548736L, 37012);
      return str;
    }
    if (!TextUtils.isEmpty(this.krY))
    {
      str = this.krY;
      GMTrace.o(4967666548736L, 37012);
      return str;
    }
    if (!TextUtils.isEmpty(this.krZ))
    {
      str = com.tencent.mm.plugin.card.b.l.uo(this.krZ);
      GMTrace.o(4967666548736L, 37012);
      return str;
    }
    GMTrace.o(4967666548736L, 37012);
    return "";
  }
  
  private void l(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4967129677824L, 37008);
    if (this.kun != null) {
      this.kun.l(paramBoolean1, paramBoolean2);
    }
    GMTrace.o(4967129677824L, 37008);
  }
  
  private void lG(int paramInt)
  {
    GMTrace.i(4967263895552L, 37009);
    LinkedList localLinkedList = this.kmJ.aiL().tEz;
    if (localLinkedList == null)
    {
      GMTrace.o(4967263895552L, 37009);
      return;
    }
    this.kuG.clear();
    int j = 0;
    int i = paramInt;
    paramInt = j;
    while (paramInt < localLinkedList.size())
    {
      au localau = (au)localLinkedList.get(paramInt);
      j = i;
      if (!bg.mZ(localau.text))
      {
        j = i;
        if (!bg.mZ(localau.url))
        {
          this.kuH.add(localau.text);
          this.kuF.put(Integer.valueOf(i), localau.text);
          this.kuG.put(localau.text, localau.url);
          j = i + 1;
        }
      }
      paramInt += 1;
      i = j;
    }
    GMTrace.o(4967263895552L, 37009);
  }
  
  private void tX(String paramString)
  {
    GMTrace.i(4967800766464L, 37013);
    Intent localIntent = new Intent();
    if ((this.kmJ instanceof CardInfo)) {
      localIntent.putExtra("key_card_info_data", (CardInfo)this.kmJ);
    }
    for (;;)
    {
      localIntent.setClass(this.jFp, CardConsumeCodeUI.class);
      localIntent.putExtra("key_from_scene", this.kuJ.kjz);
      localIntent.putExtra("key_previous_scene", this.kuJ.krw);
      localIntent.putExtra("key_mark_user", paramString);
      localIntent.putExtra("key_from_appbrand_type", this.kuJ.kuP);
      this.jFp.startActivityForResult(localIntent, 3);
      this.jFp.vow = this;
      GMTrace.o(4967800766464L, 37013);
      return;
      if ((this.kmJ instanceof ShareCardInfo)) {
        localIntent.putExtra("key_card_info_data", (ShareCardInfo)this.kmJ);
      }
    }
  }
  
  public final void G(int paramInt, String paramString)
  {
    GMTrace.i(18899735150592L, 140814);
    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "onGetCodeFail! errCode = %d, errMsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    Message localMessage = Message.obtain();
    c localc = new c();
    localc.kuV = b.kuT;
    localc.errCode = paramInt;
    if (paramInt == -1) {
      paramString = getString(R.l.dFj);
    }
    for (;;)
    {
      localc.ftU = paramString;
      localMessage.obj = localc;
      this.kuK.sendMessage(localMessage);
      GMTrace.o(18899735150592L, 140814);
      return;
      if (paramInt == 2) {
        paramString = getString(R.l.dEU);
      } else {
        paramString = getString(R.l.dFi);
      }
    }
  }
  
  public final void a(final int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(4967532331008L, 37011);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(4967532331008L, 37011);
      return;
      if (paramInt2 == -1)
      {
        this.kuD = paramIntent.getStringExtra("Select_Conv_User");
        paramIntent = this.kuD;
        if (this.kmJ.aiK() == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
          GMTrace.o(4967532331008L, 37011);
          return;
        }
        StringBuilder localStringBuilder = new StringBuilder();
        if (paramInt1 == 0) {
          if (!TextUtils.isEmpty(this.kmJ.aiM().uuc)) {
            localStringBuilder.append(this.kmJ.aiM().uuc);
          }
        }
        for (;;)
        {
          String str = this.kmJ.aiK().title + "\n" + this.kmJ.aiK().koD;
          com.tencent.mm.pluginsdk.ui.applet.d.a(this.jFp.vov, localStringBuilder.toString(), this.kmJ.aiK().knr, str, null, true, this.jFp.getResources().getString(R.l.dwY), new k.a()
          {
            public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(18899332497408L, 140811);
              if (paramAnonymousBoolean)
              {
                e.this.kuE = paramAnonymousString;
                if (paramInt1 == 0)
                {
                  if (e.this.kuI != null) {
                    e.this.kuI.tW(paramIntent);
                  }
                  com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperGift", Integer.valueOf(1), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), e.this.kuD });
                  com.tencent.mm.ui.base.h.bl(e.this.jFp, e.this.jFp.getResources().getString(R.l.dFt));
                  GMTrace.o(18899332497408L, 140811);
                  return;
                }
                if (paramInt1 == 1)
                {
                  paramAnonymousString = e.this;
                  paramAnonymousString.kmJ.aiM().uuc = (paramAnonymousString.getString(R.l.dGu) + paramAnonymousString.kuC.getTitle());
                  com.tencent.mm.plugin.card.b.l.a(paramAnonymousString.kmJ, paramAnonymousString.kuD, paramAnonymousString.kuJ.ktV, 2);
                  com.tencent.mm.plugin.card.b.l.bF(paramAnonymousString.kuE, paramAnonymousString.kuD);
                  com.tencent.mm.ui.base.h.bl(e.this.jFp, e.this.jFp.getResources().getString(R.l.dFt));
                  GMTrace.o(18899332497408L, 140811);
                  return;
                }
                if (paramInt1 == 4)
                {
                  paramAnonymousString = e.this;
                  if (TextUtils.isEmpty(paramAnonymousString.kmJ.aiQ())) {
                    paramAnonymousString.kmJ.tp(com.tencent.mm.x.m.zF());
                  }
                  paramAnonymousString.kmJ.aiM().uuc = (paramAnonymousString.getString(R.l.dFX) + paramAnonymousString.kuC.getTitle());
                  com.tencent.mm.plugin.card.b.l.a(paramAnonymousString.kmJ, paramAnonymousString.kuD, paramAnonymousString.kuJ.ktV, 23);
                  com.tencent.mm.plugin.card.b.l.bF(paramAnonymousString.kuE, paramAnonymousString.kuD);
                  com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OpeRecommendCard", Integer.valueOf(e.this.kuJ.kjz), Integer.valueOf(e.this.kmJ.aiK().knq), e.this.kmJ.aiP(), e.this.kmJ.aiO(), e.this.kuD });
                  com.tencent.mm.ui.base.h.bl(e.this.jFp, e.this.jFp.getResources().getString(R.l.dFt));
                }
              }
              GMTrace.o(18899332497408L, 140811);
            }
          });
          GMTrace.o(4967532331008L, 37011);
          return;
          localStringBuilder.append(getString(R.l.eLC));
          continue;
          if (paramInt1 == 1) {
            localStringBuilder.append(getString(R.l.dGu) + this.kuC.getTitle());
          } else if (paramInt1 == 4) {
            localStringBuilder.append(getString(R.l.dFX) + this.kuC.getTitle());
          }
        }
        if (paramInt2 != -1)
        {
          GMTrace.o(4967532331008L, 37011);
          return;
        }
        this.krX = paramIntent.getIntExtra("Ktag_range_index", 0);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.krX) });
        if (this.krX >= 2)
        {
          this.krY = paramIntent.getStringExtra("Klabel_name_list");
          this.krZ = paramIntent.getStringExtra("Kother_user_name_list");
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CardDetailUIContoller", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.krX), this.krY });
          if ((TextUtils.isEmpty(this.krY)) && (TextUtils.isEmpty(this.krZ)))
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "mLabelNameList by getIntent is empty");
            GMTrace.o(4967532331008L, 37011);
            return;
          }
          paramIntent = Arrays.asList(this.krY.split(","));
          this.ksb = com.tencent.mm.plugin.card.b.l.ac(paramIntent);
          this.ksa = com.tencent.mm.plugin.card.b.l.ab(paramIntent);
          if ((this.krZ != null) && (this.krZ.length() > 0))
          {
            paramIntent = Arrays.asList(this.krZ.split(","));
            this.ksa.addAll(paramIntent);
          }
          if (this.ksb != null) {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "mPrivateIdsList size is " + this.ksb.size());
          }
          if (this.ksa != null)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "mPrivateNamesList size is " + this.ksa.size());
            paramIntent = this.ksa.iterator();
            while (paramIntent.hasNext()) {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CardDetailUIContoller", "username : %s", new Object[] { (String)paramIntent.next() });
            }
          }
          if (this.krX == 2)
          {
            this.kuy.ua(this.jFp.getString(R.l.dGm, new Object[] { akf() }));
            GMTrace.o(4967532331008L, 37011);
            return;
          }
          if (this.krX == 3)
          {
            this.kuy.ua(this.jFp.getString(R.l.dGl, new Object[] { akf() }));
            GMTrace.o(4967532331008L, 37011);
            return;
          }
          this.kuy.ua(this.jFp.getString(R.l.dGk));
          GMTrace.o(4967532331008L, 37011);
          return;
        }
        this.kuy.ua(this.jFp.getString(R.l.dGk));
        GMTrace.o(4967532331008L, 37011);
        return;
        if (this.kuI != null) {
          this.kuI.akK();
        }
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.card.base.b paramb, a parama, ArrayList<ji> paramArrayList)
  {
    GMTrace.i(4964982194176L, 36992);
    this.kmJ = paramb;
    this.kuJ = parama;
    this.kmP = paramArrayList;
    GMTrace.o(4964982194176L, 36992);
  }
  
  public final void a(boolean paramBoolean1, i.b paramb, boolean paramBoolean2)
  {
    int j = 1;
    int i = 1;
    GMTrace.i(4966995460096L, 37007);
    if (paramBoolean1)
    {
      localObject1 = this.kmJ.aiL().tEB;
      if (this.kmJ.aiD())
      {
        com.tencent.mm.plugin.card.b.b.a(this.jFp, paramb.knf, paramb.kng, paramBoolean2, this.kmJ);
        com.tencent.mm.plugin.report.service.g.paX.i(11941, new Object[] { Integer.valueOf(17), this.kmJ.aiO(), this.kmJ.aiP(), "", this.kmJ.aiL().tEB.title });
        GMTrace.o(4966995460096L, 37007);
        return;
      }
      if ((localObject1 != null) && (!TextUtils.isEmpty(((nc)localObject1).tEL)) && (!TextUtils.isEmpty(((nc)localObject1).tEM)))
      {
        com.tencent.mm.plugin.card.b.b.a(this.kmJ.aiO(), (nc)localObject1, this.kuJ.krw, this.kuJ.kuP);
        localObject2 = com.tencent.mm.plugin.report.service.g.paX;
        str1 = this.kmJ.aiO();
        str2 = this.kmJ.aiP();
        if (((nc)localObject1).title != null) {}
        for (paramb = ((nc)localObject1).title;; paramb = "")
        {
          ((com.tencent.mm.plugin.report.service.g)localObject2).i(11941, new Object[] { Integer.valueOf(6), str1, str2, "", paramb });
          GMTrace.o(4966995460096L, 37007);
          return;
        }
      }
      if ((localObject1 != null) && (!TextUtils.isEmpty(((nc)localObject1).url)))
      {
        paramb = com.tencent.mm.plugin.card.b.l.r(((nc)localObject1).url, ((nc)localObject1).tFX);
        com.tencent.mm.plugin.card.b.b.a(this.jFp, paramb, 1);
        localObject2 = com.tencent.mm.plugin.report.service.g.paX;
        str1 = this.kmJ.aiO();
        str2 = this.kmJ.aiP();
        if (((nc)localObject1).title != null) {}
        for (paramb = ((nc)localObject1).title;; paramb = "")
        {
          ((com.tencent.mm.plugin.report.service.g)localObject2).i(11941, new Object[] { Integer.valueOf(6), str1, str2, "", paramb });
          GMTrace.o(4966995460096L, 37007);
          return;
        }
      }
      localObject1 = com.tencent.mm.plugin.report.service.g.paX;
      j = this.kmJ.aiK().knq;
      localObject2 = this.kmJ.aiP();
      str1 = this.kmJ.aiO();
      k = this.kuJ.krw;
      str2 = this.kuJ.ktT;
      if (this.kmJ.aiI()) {}
      for (;;)
      {
        ((com.tencent.mm.plugin.report.service.g)localObject1).i(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(j), localObject2, str1, Integer.valueOf(0), Integer.valueOf(k), str2, Integer.valueOf(i), "" });
        tX(paramb.knc);
        GMTrace.o(4966995460096L, 37007);
        return;
        i = 0;
      }
    }
    Object localObject1 = com.tencent.mm.plugin.report.service.g.paX;
    int k = this.kmJ.aiK().knq;
    Object localObject2 = this.kmJ.aiP();
    String str1 = this.kmJ.aiO();
    int m = this.kuJ.krw;
    String str2 = this.kuJ.ktT;
    if (this.kmJ.aiI()) {}
    for (i = j;; i = 0)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject1).i(11324, new Object[] { "CardConsumedCodeUI", Integer.valueOf(k), localObject2, str1, Integer.valueOf(0), Integer.valueOf(m), str2, Integer.valueOf(i), "" });
      tX(paramb.knc);
      GMTrace.o(4966995460096L, 37007);
      return;
    }
  }
  
  public final void ajk()
  {
    GMTrace.i(18899869368320L, 140815);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "on show TimeExpired! do update refresh code view!");
    Message localMessage = Message.obtain();
    c localc = new c();
    localc.kuV = b.kuR;
    localMessage.obj = localc;
    this.kuK.sendMessage(localMessage);
    GMTrace.o(18899869368320L, 140815);
  }
  
  public final com.tencent.mm.plugin.card.base.b akL()
  {
    GMTrace.i(4965250629632L, 36994);
    com.tencent.mm.plugin.card.base.b localb = this.kmJ;
    GMTrace.o(4965250629632L, 36994);
    return localb;
  }
  
  public final boolean akM()
  {
    GMTrace.i(4965519065088L, 36996);
    boolean bool = this.kuk;
    GMTrace.o(4965519065088L, 36996);
    return bool;
  }
  
  public final void akN()
  {
    GMTrace.i(4965653282816L, 36997);
    this.kuk = false;
    GMTrace.o(4965653282816L, 36997);
  }
  
  public final MMActivity akO()
  {
    GMTrace.i(4965787500544L, 36998);
    MMActivity localMMActivity = this.jFp;
    GMTrace.o(4965787500544L, 36998);
    return localMMActivity;
  }
  
  public final View.OnClickListener akP()
  {
    GMTrace.i(4965921718272L, 36999);
    View.OnClickListener localOnClickListener = this.iom;
    GMTrace.o(4965921718272L, 36999);
    return localOnClickListener;
  }
  
  public final com.tencent.mm.plugin.card.ui.a.g akQ()
  {
    GMTrace.i(4966055936000L, 37000);
    com.tencent.mm.plugin.card.ui.a.g localg = this.kui;
    GMTrace.o(4966055936000L, 37000);
    return localg;
  }
  
  public final d akR()
  {
    GMTrace.i(4966190153728L, 37001);
    d locald = this.kuI;
    GMTrace.o(4966190153728L, 37001);
    return locald;
  }
  
  public final a akS()
  {
    GMTrace.i(4966324371456L, 37002);
    a locala = this.kuJ;
    GMTrace.o(4966324371456L, 37002);
    return locala;
  }
  
  public final com.tencent.mm.plugin.card.a.f akT()
  {
    GMTrace.i(4966458589184L, 37003);
    com.tencent.mm.plugin.card.a.f localf = this.kuC;
    GMTrace.o(4966458589184L, 37003);
    return localf;
  }
  
  public final j akU()
  {
    GMTrace.i(4966592806912L, 37004);
    j localj = this.kuA;
    GMTrace.o(4966592806912L, 37004);
    return localj;
  }
  
  public final void akW()
  {
    GMTrace.i(16026133594112L, 119404);
    com.tencent.mm.plugin.card.b.b.a(this.jFp, 0, this);
    this.jFp.vow = this;
    GMTrace.o(16026133594112L, 119404);
  }
  
  public final void akX()
  {
    GMTrace.i(16026267811840L, 119405);
    Object localObject = new Intent();
    int j;
    String str1;
    String str2;
    int k;
    String str3;
    if ((this.kmJ instanceof CardInfo))
    {
      ((Intent)localObject).putExtra("key_card_info_data", (CardInfo)this.kmJ);
      ((Intent)localObject).putExtra("key_from_appbrand_type", this.kuJ.kuP);
      ((Intent)localObject).setClass(this.jFp, CardShopUI.class);
      this.jFp.startActivity((Intent)localObject);
      localObject = com.tencent.mm.plugin.report.service.g.paX;
      j = this.kmJ.aiK().knq;
      str1 = this.kmJ.aiP();
      str2 = this.kmJ.aiO();
      k = this.kuJ.krw;
      str3 = this.kuJ.ktT;
      if (!this.kmJ.aiI()) {
        break label262;
      }
    }
    label262:
    for (int i = 1;; i = 0)
    {
      ((com.tencent.mm.plugin.report.service.g)localObject).i(11324, new Object[] { "UsedStoresView", Integer.valueOf(j), str1, str2, Integer.valueOf(0), Integer.valueOf(k), str3, Integer.valueOf(i), "" });
      GMTrace.o(16026267811840L, 119405);
      return;
      if (!(this.kmJ instanceof ShareCardInfo)) {
        break;
      }
      ((Intent)localObject).putExtra("key_card_info_data", (ShareCardInfo)this.kmJ);
      break;
    }
  }
  
  public final int akY()
  {
    GMTrace.i(4967934984192L, 37014);
    if (this.kuC == null)
    {
      GMTrace.o(4967934984192L, 37014);
      return 0;
    }
    com.tencent.mm.plugin.card.a.f localf = this.kuC;
    if (localf.kmO == null) {}
    for (boolean bool = false; bool; bool = localf.kmO.knG)
    {
      GMTrace.o(4967934984192L, 37014);
      return 1;
    }
    GMTrace.o(4967934984192L, 37014);
    return 0;
  }
  
  public final boolean akZ()
  {
    GMTrace.i(4968069201920L, 37015);
    if (this.kui == null)
    {
      GMTrace.o(4968069201920L, 37015);
      return false;
    }
    boolean bool = this.kui.akZ();
    GMTrace.o(4968069201920L, 37015);
    return bool;
  }
  
  public final void akd()
  {
    GMTrace.i(4966861242368L, 37006);
    if (this.kmJ == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo == null");
      if (this.kuI != null) {
        this.kuI.akI();
      }
      GMTrace.o(4966861242368L, 37006);
      return;
    }
    if (this.kmJ.aiK() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getCardTpInfo() == null");
      if (this.kuI != null) {
        this.kuI.akI();
      }
      GMTrace.o(4966861242368L, 37006);
      return;
    }
    if (this.kmJ.aiL() == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, mCardInfo.getDataInfo() == null");
      if (this.kuI != null) {
        this.kuI.akI();
      }
      GMTrace.o(4966861242368L, 37006);
      return;
    }
    if (!this.kmJ.aiw())
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "doUpdate fail, not support card type :%d", new Object[] { Integer.valueOf(this.kmJ.aiK().knq) });
      if (!TextUtils.isEmpty(this.kmJ.aiK().tFc))
      {
        com.tencent.mm.plugin.card.b.b.a(this.jFp, this.kmJ.aiK().tFc, 0);
        if (this.kuI != null)
        {
          this.kuI.akI();
          GMTrace.o(4966861242368L, 37006);
        }
      }
      else
      {
        com.tencent.mm.ui.base.h.a(this.jFp, getString(R.l.dFU), null, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4956660695040L, 36930);
            paramAnonymousDialogInterface.dismiss();
            if (e.this.kuI != null) {
              e.this.kuI.akI();
            }
            GMTrace.o(4956660695040L, 36930);
          }
        });
      }
      GMTrace.o(4966861242368L, 37006);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "doUpdate()");
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "doUpdate() showAcceptView:" + this.kmJ.aiK().tFx);
    Object localObject1 = this.kuC;
    Object localObject2 = this.kmJ;
    Object localObject3 = this.kmP;
    int i = this.kuJ.kjz;
    ((com.tencent.mm.plugin.card.a.f)localObject1).kmJ = ((com.tencent.mm.plugin.card.base.b)localObject2);
    ((com.tencent.mm.plugin.card.a.f)localObject1).kmP = ((ArrayList)localObject3);
    ((com.tencent.mm.plugin.card.a.f)localObject1).kjz = i;
    if (this.kui == null)
    {
      i = 0;
      if (i != 0)
      {
        this.kui.release();
        this.kui = null;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, need recreate show logic, card_type:%d", new Object[] { Integer.valueOf(this.kmJ.aiK().knq) });
      }
      if (this.kui == null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, mCardShowLogic == null, card_type:%d", new Object[] { Integer.valueOf(this.kmJ.aiK().knq) });
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "createShowLogic, card_type:%d", new Object[] { Integer.valueOf(this.kmJ.aiK().knq) });
        if (!this.kmJ.aiq()) {
          break label2204;
        }
        this.kui = new com.tencent.mm.plugin.card.ui.a.h(this.jFp);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateShowLogic, card_tye:%d", new Object[] { Integer.valueOf(this.kmJ.aiK().knq) });
      this.kui.a(this.kmJ, this.kuJ);
      this.kui.ama();
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "");
      if (this.kui.alI()) {
        break label2376;
      }
      this.jFp.rV("");
      label605:
      if (this.kmJ != null) {
        break label2393;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "updateWidget, mCardInfo is null");
      if (!this.kui.alJ()) {
        break label2898;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateShareUsersInfoLayout()");
      this.kuj.update();
      label647:
      if (!this.kui.alA()) {
        break label2916;
      }
      if (this.kuz == null)
      {
        this.kuz = new com.tencent.mm.plugin.card.ui.view.b();
        this.kuz.a(this);
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardAcceptView()");
      this.kuz.update();
      label700:
      boolean bool = this.kui.alE();
      this.jFp.kS(bool);
      if (this.kui.alF())
      {
        this.kuF.clear();
        this.kuH.clear();
        if (!this.kmJ.aiy()) {
          break label6763;
        }
        this.kuH.add(getString(R.l.fct));
        this.kuF.put(Integer.valueOf(0), "menu_func_share_friend");
        this.kuH.add(getString(R.l.fcs));
        this.kuF.put(Integer.valueOf(1), "menu_func_share_timeline");
      }
    }
    label1073:
    label1275:
    label1368:
    label1421:
    label1474:
    label1527:
    label1580:
    label1633:
    label1686:
    label1739:
    label1912:
    label1927:
    label1944:
    label2204:
    label2376:
    label2393:
    label2424:
    label2755:
    label2760:
    label2898:
    label2916:
    label3133:
    label3191:
    label3293:
    label3748:
    label3914:
    label4031:
    label4248:
    label4385:
    label4617:
    label4702:
    label4717:
    label4746:
    label4761:
    label4786:
    label4811:
    label4836:
    label4861:
    label4886:
    label4911:
    label4936:
    label4961:
    label5489:
    label5884:
    label5995:
    label6186:
    label6221:
    label6237:
    label6338:
    label6565:
    label6586:
    label6596:
    label6641:
    label6676:
    label6693:
    label6735:
    label6753:
    label6758:
    label6763:
    for (i = 2;; i = 0)
    {
      int j = i;
      if (!TextUtils.isEmpty(this.kmJ.aiL().tEx))
      {
        this.kuH.add(getString(R.l.dFP));
        this.kuF.put(Integer.valueOf(i), "menu_func_report");
        j = i + 1;
      }
      lG(j);
      if (this.kuH.size() > 0) {
        akV();
      }
      if (this.kui.alG())
      {
        this.kuF.clear();
        this.kuH.clear();
        if ((!this.kmJ.aip()) || (!this.kmJ.aix())) {
          break label6758;
        }
        this.kuH.add(getString(R.l.dFO));
        this.kuF.put(Integer.valueOf(0), "menu_func_gift");
      }
      for (j = 1;; j = 0)
      {
        i = j;
        if (!TextUtils.isEmpty(this.kmJ.aiL().tEx))
        {
          this.kuH.add(getString(R.l.dFP));
          this.kuF.put(Integer.valueOf(j), "menu_func_report");
          i = j + 1;
        }
        if (this.kmJ.aip())
        {
          this.kuH.add(getString(R.l.duY));
          this.kuF.put(Integer.valueOf(i), "menu_func_delete");
          j = i + 1;
          lG(j);
          if (this.kuH.size() > 0) {
            akV();
          }
          if (this.kui.alH())
          {
            this.kuF.clear();
            this.kuH.clear();
            if (TextUtils.isEmpty(this.kmJ.aiL().tEx)) {
              break label6753;
            }
            this.kuH.add(getString(R.l.dFP));
            this.kuF.put(Integer.valueOf(0), "menu_func_report");
          }
        }
        for (i = 1;; i = 0)
        {
          lG(i);
          if (this.kuH.size() > 0) {
            akV();
          }
          if ((this.kun != null) && ((this.kun instanceof com.tencent.mm.plugin.card.widget.b))) {
            ((com.tencent.mm.plugin.card.widget.b)this.kun).amx();
          }
          l(this.kui.alC(), this.kui.alD());
          if ((!this.kmJ.air()) && (this.kui.alL()))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mFromUserView");
            this.kul.update();
            if (this.kun != null) {
              this.kun.dC(this.kui.akZ());
            }
            if (!this.fBD) {
              break label3133;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateUIBackground onPause return");
            if (!this.kui.alQ()) {
              break label4761;
            }
            if (this.kur == null)
            {
              this.kur = new y();
              this.kur.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardStatusView");
            this.kur.update();
            if (!this.kui.alZ()) {
              break label4786;
            }
            if (this.kuq == null)
            {
              this.kuq = new com.tencent.mm.plugin.card.ui.view.c();
              this.kuq.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mAdtitleView()");
            this.kuq.update();
            if (!this.kui.alR()) {
              break label4811;
            }
            if (this.kus == null)
            {
              this.kus = new k();
              this.kus.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mCardDetailFieldView()");
            this.kus.update();
            if (!this.kui.alS()) {
              break label4836;
            }
            if (this.kut == null)
            {
              this.kut = new com.tencent.mm.plugin.card.ui.view.w();
              this.kut.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardSecondaryFieldView");
            this.kut.update();
            if (!this.kui.alT()) {
              break label4861;
            }
            if (this.kuu == null)
            {
              this.kuu = new com.tencent.mm.plugin.card.ui.view.l();
              this.kuu.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardDetailTableView");
            this.kuu.update();
            if (!this.kui.alU()) {
              break label4886;
            }
            if (this.kuv == null)
            {
              this.kuv = new z();
              this.kuv.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardThirdFieldView");
            this.kuv.update();
            if (!this.kui.alW()) {
              break label4911;
            }
            if (this.kuw == null)
            {
              this.kuw = new com.tencent.mm.plugin.card.ui.view.e();
              this.kuw.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateCardAnnoucementView");
            this.kuw.update();
            if (!this.kui.alV()) {
              break label4936;
            }
            if (this.kux == null)
            {
              this.kux = new u();
              this.kux.a(this);
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "updateCardOperateFieldView");
            this.kux.update();
            if (this.kui.alN()) {
              break label4961;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "card is membership or share card or general coupon, not accept, don't updateCellData()");
            if (!this.kui.alO()) {
              break label6693;
            }
            localObject1 = this.kmJ.aiL();
            this.kmJ.a((jf)localObject1);
            com.tencent.mm.plugin.card.b.l.j(this.kmJ);
            if (!this.kui.alP()) {
              break label6676;
            }
            if (this.kuo != null) {
              break label6641;
            }
            if ((this.kmJ.aiK().tFB == null) || (!this.kmJ.aiK().tFB.tLw)) {
              break label6596;
            }
            this.kuo = new com.tencent.mm.plugin.card.ui.view.m();
            localObject1 = al.ajS();
            if (((com.tencent.mm.plugin.card.a.g)localObject1).kmu == null) {
              ((com.tencent.mm.plugin.card.a.g)localObject1).kmu = new ArrayList();
            }
            if (this != null) {
              ((com.tencent.mm.plugin.card.a.g)localObject1).kmu.add(new WeakReference(this));
            }
            this.kuo.a(this);
            this.kuo.update();
            if (this.kun != null) {
              this.kun.dB(true);
            }
            if (!this.kui.alX()) {
              break label6735;
            }
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update CardAdvertiseView");
            this.kuy.update();
          }
          for (;;)
          {
            this.kuA.kmJ = this.kmJ;
            GMTrace.o(4966861242368L, 37006);
            return;
            if (this.kmJ.aiq())
            {
              if ((this.kui instanceof com.tencent.mm.plugin.card.ui.a.h))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.kmJ.air())
            {
              if ((this.kui instanceof com.tencent.mm.plugin.card.ui.a.e))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.kmJ.aiu())
            {
              if ((this.kui instanceof com.tencent.mm.plugin.card.ui.a.b))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.kmJ.ais())
            {
              if ((this.kui instanceof com.tencent.mm.plugin.card.ui.a.c))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.kmJ.ait())
            {
              if ((this.kui instanceof com.tencent.mm.plugin.card.ui.a.f))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if (this.kmJ.aiv())
            {
              if ((this.kui instanceof com.tencent.mm.plugin.card.ui.a.d))
              {
                i = 0;
                break;
              }
              i = 1;
              break;
            }
            if ((this.kui instanceof a))
            {
              i = 0;
              break;
            }
            i = 1;
            break;
            switch (this.kmJ.aiK().knq)
            {
            default: 
              this.kui = new a(this.jFp);
              break;
            case 0: 
              this.kui = new com.tencent.mm.plugin.card.ui.a.c(this.jFp);
              break;
            case 10: 
              this.kui = new com.tencent.mm.plugin.card.ui.a.e(this.jFp);
              break;
            case 11: 
              this.kui = new com.tencent.mm.plugin.card.ui.a.b(this.jFp);
              break;
            case 20: 
              this.kui = new com.tencent.mm.plugin.card.ui.a.f(this.jFp);
              break;
            case 30: 
              this.kui = new com.tencent.mm.plugin.card.ui.a.d(this.jFp);
              break;
              this.jFp.rV(this.kuC.getTitle());
              break label605;
              if (this.kun != null) {
                if (this.kmJ.air())
                {
                  if ((this.kun instanceof com.tencent.mm.plugin.card.widget.e)) {
                    break label2755;
                  }
                  i = 1;
                  if (i != 0)
                  {
                    localObject1 = this.kun.amq();
                    if (localObject1 != null) {
                      this.dl.removeView((View)localObject1);
                    }
                    this.dl.removeAllViews();
                    this.dl.invalidate();
                    this.kun.release();
                    this.kun = null;
                  }
                  if (this.kun == null)
                  {
                    if (!this.kmJ.air()) {
                      break label2760;
                    }
                    this.kun = new com.tencent.mm.plugin.card.widget.e(this.jFp);
                  }
                }
              }
              for (;;)
              {
                this.kun.k(this.kmJ);
                localObject1 = this.kun.amq();
                if (localObject1 != null)
                {
                  localObject2 = this.dl;
                  ((View)localObject1).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                  ((LinearLayout)localObject2).addView((View)localObject1);
                }
                this.dl.invalidate();
                this.kun.setOnClickListener(this.iom);
                l(false, false);
                if (this.kun == null) {
                  break;
                }
                if (this.kmJ.ait()) {
                  ((com.tencent.mm.plugin.card.widget.f)this.kun).kmP = this.kmP;
                }
                this.kun.f(this.kmJ);
                break;
                if (this.kmJ.aiu())
                {
                  if ((this.kun instanceof com.tencent.mm.plugin.card.widget.c)) {
                    break label2755;
                  }
                  i = 1;
                  break label2424;
                }
                if (this.kmJ.ais())
                {
                  if ((this.kun instanceof com.tencent.mm.plugin.card.widget.b)) {
                    break label2755;
                  }
                  i = 1;
                  break label2424;
                }
                if (this.kmJ.ait())
                {
                  if ((this.kun instanceof com.tencent.mm.plugin.card.widget.f)) {
                    break label2755;
                  }
                  i = 1;
                  break label2424;
                }
                if ((this.kmJ.aiv()) && (!(this.kun instanceof com.tencent.mm.plugin.card.widget.d)))
                {
                  i = 1;
                  break label2424;
                }
                i = 0;
                break label2424;
                if (this.kmJ.aiu()) {
                  this.kun = new com.tencent.mm.plugin.card.widget.c(this.jFp);
                } else if (this.kmJ.ais()) {
                  this.kun = new com.tencent.mm.plugin.card.widget.b(this.jFp);
                } else if (this.kmJ.ait()) {
                  this.kun = new com.tencent.mm.plugin.card.widget.f(this.jFp);
                } else if (this.kmJ.aiv()) {
                  this.kun = new com.tencent.mm.plugin.card.widget.d(this.jFp);
                } else {
                  this.kun = new com.tencent.mm.plugin.card.widget.b(this.jFp);
                }
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't updateShareUsersInfoLayout()");
              this.kuj.amb();
              break label647;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardAcceptView()");
              if (this.kuz == null) {
                break label700;
              }
              this.kuz.amb();
              break label700;
              j = i;
              if (!this.kmJ.aiq()) {
                break label1073;
              }
              localObject1 = com.tencent.mm.x.m.zF();
              localObject2 = this.kmJ.aiQ();
              if ((localObject1 != null) && (((String)localObject1).equals(localObject2)))
              {
                this.kuH.add(getString(R.l.duY));
                this.kuF.put(Integer.valueOf(i), "menu_func_delete_share_card");
                j = i + 1;
                break label1073;
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "the card is not belong mine");
              j = i;
              break label1073;
              if ((this.kmJ.air()) && (this.kui.alL()))
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout for username");
                this.kum.update();
                break label1275;
              }
              if (this.kui.alM())
              {
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "update mAcceptHeaderLayout");
                this.kum.update();
                break label1275;
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update mFromUserView and mAcceptHeaderLayout");
              this.kum.amb();
              this.kul.amb();
              break label1275;
              if ((this.kmJ.aip()) && (this.kmJ.air()))
              {
                this.krg.findViewById(R.h.bpC).setBackgroundColor(this.jFp.getResources().getColor(R.e.aPC));
                com.tencent.mm.plugin.card.b.m.b(this.jFp, true);
                localObject3 = this.krg.findViewById(R.h.bAW);
                localObject2 = this.krg.findViewById(R.h.bOH);
                localObject1 = this.krg.findViewById(R.h.bAT);
                if ((!this.kmJ.aip()) || (!this.kui.alL())) {
                  break label4385;
                }
                if (!this.kmJ.ais()) {
                  break label4248;
                }
                ((View)localObject3).setBackgroundResource(R.g.aXp);
                this.krg.findViewById(R.h.bKE).setBackgroundResource(R.g.aXa);
                ((View)localObject1).setBackgroundResource(0);
                Object localObject5;
                if (this.kmJ.aiv())
                {
                  localObject4 = (TextView)this.krg.findViewById(R.h.bnA);
                  localObject5 = new BitmapDrawable(com.tencent.mm.sdk.platformtools.d.zz(R.g.aXm));
                  ((BitmapDrawable)localObject5).setTileModeX(Shader.TileMode.REPEAT);
                  ((TextView)localObject4).setBackgroundDrawable((Drawable)localObject5);
                  ((TextView)localObject4).setVisibility(0);
                }
                localObject4 = new Rect(0, 0, 0, 0);
                ((View)localObject3).setPadding(((Rect)localObject4).left, ((Rect)localObject4).top, ((Rect)localObject4).right, ((Rect)localObject4).bottom);
                ((View)localObject3).invalidate();
                ((View)localObject1).setPadding(((Rect)localObject4).left, ((Rect)localObject4).top, ((Rect)localObject4).right, ((Rect)localObject4).bottom);
                ((View)localObject1).invalidate();
                if ((this.kmJ.aiq()) && (this.kui.alJ()) && (this.kuk))
                {
                  localObject5 = this.krg.findViewById(R.h.cxJ);
                  ((View)localObject5).setPadding(((Rect)localObject4).left, ((Rect)localObject4).top, ((Rect)localObject4).right, ((Rect)localObject4).bottom);
                  ((View)localObject5).invalidate();
                }
                if ((this.kmJ.aip()) && (this.kui.alL()))
                {
                  localObject5 = this.krg.findViewById(R.h.bKE);
                  ((Rect)localObject4).left = this.jFp.getResources().getDimensionPixelOffset(R.f.aRS);
                  ((Rect)localObject4).right = this.jFp.getResources().getDimensionPixelOffset(R.f.aRS);
                  ((View)localObject5).setPadding(((Rect)localObject4).left, ((Rect)localObject4).top, ((Rect)localObject4).right, ((Rect)localObject4).bottom);
                  ((View)localObject5).invalidate();
                  if (this.kmJ.ait())
                  {
                    localObject4 = this.krg.findViewById(R.h.bKF);
                    localObject5 = (LinearLayout.LayoutParams)((View)localObject4).getLayoutParams();
                    i = this.jFp.getResources().getDimensionPixelSize(R.f.aSq);
                    ((LinearLayout.LayoutParams)localObject5).rightMargin = i;
                    ((LinearLayout.LayoutParams)localObject5).leftMargin = i;
                    ((View)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject5);
                  }
                }
                if ((!this.kui.alL()) && (!this.kui.alJ())) {
                  break label4617;
                }
                if ((this.kun != null) && (((this.kmJ.aip()) && (this.kmJ.ais())) || (this.kmJ.aiq()))) {
                  this.kun.lO(0);
                }
                if ((this.kun != null) && (this.kmJ.aip()) && (this.kmJ.air()))
                {
                  i = this.jFp.getResources().getDimensionPixelOffset(R.f.aTa);
                  localObject4 = com.tencent.mm.plugin.card.b.l.bM(com.tencent.mm.plugin.card.b.l.uk(this.kmJ.aiK().hbA), i);
                  this.kun.a((ShapeDrawable)localObject4);
                }
                if ((this.kmJ.aip()) && (this.kmJ.air()))
                {
                  localObject4 = (LinearLayout.LayoutParams)((View)localObject3).getLayoutParams();
                  ((LinearLayout.LayoutParams)localObject4).bottomMargin = 0;
                  ((LinearLayout.LayoutParams)localObject4).topMargin = 0;
                  ((LinearLayout.LayoutParams)localObject4).rightMargin = 0;
                  ((LinearLayout.LayoutParams)localObject4).leftMargin = 0;
                  if (TextUtils.isEmpty(this.kmJ.aiK().tFh)) {
                    break label4702;
                  }
                  ((LinearLayout.LayoutParams)localObject4).weight = 0.0F;
                  ((LinearLayout.LayoutParams)localObject4).height = -2;
                  ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
                  localObject3 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
                  i = this.jFp.getResources().getDimensionPixelSize(R.f.aRY);
                  ((LinearLayout.LayoutParams)localObject3).rightMargin = i;
                  ((LinearLayout.LayoutParams)localObject3).leftMargin = i;
                  if (!this.kmJ.air()) {
                    break label4717;
                  }
                  ((LinearLayout.LayoutParams)localObject3).topMargin = this.jFp.getResources().getDimensionPixelSize(R.f.aRV);
                  ((LinearLayout.LayoutParams)localObject3).bottomMargin = this.jFp.getResources().getDimensionPixelSize(R.f.aRW);
                  i = this.jFp.getResources().getDimensionPixelSize(R.f.aRT);
                  ((LinearLayout.LayoutParams)localObject3).rightMargin = i;
                  ((LinearLayout.LayoutParams)localObject3).leftMargin = i;
                  ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject3);
                  localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
                  ((LinearLayout.LayoutParams)localObject2).bottomMargin = 0;
                  ((LinearLayout.LayoutParams)localObject2).topMargin = 0;
                  ((LinearLayout.LayoutParams)localObject2).rightMargin = 0;
                  ((LinearLayout.LayoutParams)localObject2).leftMargin = 0;
                  if (this.kmJ.air()) {
                    ((LinearLayout.LayoutParams)localObject2).bottomMargin = this.jFp.getResources().getDimensionPixelSize(R.f.aRT);
                  }
                  if (TextUtils.isEmpty(this.kmJ.aiK().tFh)) {
                    break label4746;
                  }
                  ((LinearLayout.LayoutParams)localObject2).weight = 0.0F;
                  ((LinearLayout.LayoutParams)localObject2).height = -2;
                }
              }
              for (;;)
              {
                ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                if (!TextUtils.isEmpty(this.kmJ.aiK().tFh))
                {
                  localObject1 = findViewById(R.h.bhd);
                  localObject2 = (LinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
                  ((LinearLayout.LayoutParams)localObject2).height = 0;
                  ((LinearLayout.LayoutParams)localObject2).weight = 1.0F;
                  ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                }
                this.krg.invalidate();
                break;
                this.krg.findViewById(R.h.bpC).setBackgroundColor(com.tencent.mm.plugin.card.b.l.uk(this.kmJ.aiK().hbA));
                com.tencent.mm.plugin.card.b.m.a(this.jFp, this.kmJ);
                break label3191;
                if (this.kmJ.air())
                {
                  this.krg.findViewById(R.h.bKE).setBackgroundResource(0);
                  ((View)localObject1).setBackgroundColor(this.jFp.getResources().getColor(R.e.aPC));
                  break label3293;
                }
                if (this.kmJ.ait())
                {
                  ((View)localObject3).setBackgroundResource(R.g.aXp);
                  this.krg.findViewById(R.h.bKE).setBackgroundResource(R.g.aXa);
                  ((View)localObject1).setBackgroundResource(0);
                  break label3293;
                }
                if ((this.kmJ.aiu()) || (!this.kmJ.aiv())) {
                  break label3293;
                }
                ((View)localObject1).setBackgroundColor(this.jFp.getResources().getColor(R.e.aPC));
                break label3293;
                if (this.kmJ.aiq())
                {
                  if ((this.kui.alJ()) && (this.kuk))
                  {
                    ((View)localObject3).setBackgroundResource(R.g.aXp);
                    ((View)localObject1).setBackgroundResource(0);
                    break label3293;
                  }
                  if ((this.kui.alJ()) && (!this.kuk))
                  {
                    ((View)localObject3).setBackgroundResource(R.g.aXn);
                    ((View)localObject1).setBackgroundResource(0);
                    break label3293;
                  }
                  ((View)localObject3).setBackgroundResource(0);
                  if (this.kui.akZ())
                  {
                    ((View)localObject1).setBackgroundResource(R.g.aXn);
                    break label3293;
                  }
                  ((View)localObject1).setBackgroundResource(R.g.aXp);
                  break label3293;
                }
                if (this.kmJ.ais())
                {
                  ((View)localObject3).setBackgroundResource(0);
                  if (this.kui.akZ())
                  {
                    ((View)localObject1).setBackgroundResource(R.g.aXn);
                    break label3293;
                  }
                  ((View)localObject1).setBackgroundResource(R.g.aXp);
                  break label3293;
                }
                if (this.kmJ.ait())
                {
                  ((View)localObject3).setBackgroundResource(R.g.aXr);
                  ((View)localObject1).setBackgroundResource(0);
                  break label3293;
                }
                ((View)localObject3).setBackgroundResource(0);
                ((View)localObject1).setBackgroundColor(this.jFp.getResources().getColor(R.e.aPC));
                break label3293;
                if ((this.kun == null) || (((!this.kmJ.aip()) || (!this.kmJ.ais())) && (!this.kmJ.aiq()))) {
                  break label3748;
                }
                if (this.kui.akZ())
                {
                  this.kun.lO(R.g.aXq);
                  break label3748;
                }
                this.kun.lO(R.g.aXo);
                break label3748;
                ((LinearLayout.LayoutParams)localObject4).height = 0;
                ((LinearLayout.LayoutParams)localObject4).weight = 1.0F;
                break label3914;
                i = this.jFp.getResources().getDimensionPixelSize(R.f.aRd);
                ((LinearLayout.LayoutParams)localObject3).bottomMargin = i;
                ((LinearLayout.LayoutParams)localObject3).topMargin = i;
                break label4031;
                ((LinearLayout.LayoutParams)localObject2).height = 0;
                ((LinearLayout.LayoutParams)localObject2).weight = 1.0F;
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardStatusView");
              if (this.kur == null) {
                break label1368;
              }
              this.kur.amb();
              break label1368;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update AdTitleView()");
              if (this.kuq == null) {
                break label1421;
              }
              this.kuq.amb();
              break label1421;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update mCardDetailFieldView()");
              if (this.kus == null) {
                break label1474;
              }
              this.kus.amb();
              break label1474;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardSecondaryFieldView");
              if (this.kut == null) {
                break label1527;
              }
              this.kut.amb();
              break label1527;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardDetailTableView");
              if (this.kuu == null) {
                break label1580;
              }
              this.kuu.amb();
              break label1580;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardThirdFieldView");
              if (this.kuv == null) {
                break label1633;
              }
              this.kuv.amb();
              break label1633;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't updateCardAnnoucementView");
              if (this.kuw == null) {
                break label1686;
              }
              this.kuw.amb();
              break label1686;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't updateCardOperateFieldView");
              if (this.kux == null) {
                break label1739;
              }
              this.kux.amb();
              break label1739;
              this.kmN.clear();
              localObject1 = this.kmN;
              localObject2 = this.kuC;
              ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.clear();
              if ((((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEF != null) && (!bg.mZ(((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEF.title)))
              {
                localObject3 = new com.tencent.mm.plugin.card.model.b();
                ((com.tencent.mm.plugin.card.model.b)localObject3).knD = 1;
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEF.title;
                ((com.tencent.mm.plugin.card.model.b)localObject3).kqV = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_card_gift";
                ((com.tencent.mm.plugin.card.model.b)localObject3).oqo = ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEF.oqo;
                ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.add(localObject3);
              }
              if ((((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEo != null) && (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEo.size() > 0))
              {
                localObject3 = com.tencent.mm.plugin.card.b.l.aa(((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEo);
                if (localObject3 != null)
                {
                  ((com.tencent.mm.plugin.card.model.b)((List)localObject3).get(0)).knE = false;
                  ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.addAll((Collection)localObject3);
                }
              }
              if (((((com.tencent.mm.plugin.card.a.f)localObject2).kjz == 6) && (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEs <= 0)) || ((com.tencent.mm.plugin.card.b.l.lN(((com.tencent.mm.plugin.card.a.f)localObject2).kjz)) && (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiG()) && (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aip()) && (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aix())))
              {
                localObject3 = new com.tencent.mm.plugin.card.model.b();
                ((com.tencent.mm.plugin.card.model.b)localObject3).knD = 1;
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ab.getContext().getString(R.l.dFO);
                ((com.tencent.mm.plugin.card.model.b)localObject3).kqV = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_gift";
                ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.add(localObject3);
              }
              if ((((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().status != 0) && (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().status != 1)) {
                i = ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().status;
              }
              if ((((com.tencent.mm.plugin.card.a.f)localObject2).kjz != 3) && (((com.tencent.mm.plugin.card.a.f)localObject2).kjz == 6)) {
                i = ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEs;
              }
              Object localObject4 = ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFo;
              if (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEy != null) {
                TextUtils.isEmpty(((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().tEy.title);
              }
              localObject3 = new com.tencent.mm.plugin.card.model.b();
              if (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiv())
              {
                i = 0;
                ((com.tencent.mm.plugin.card.model.b)localObject3).knE = false;
                ((com.tencent.mm.plugin.card.model.b)localObject3).knD = 1;
                localObject4 = new StringBuilder();
                ((StringBuilder)localObject4).append(((com.tencent.mm.plugin.card.a.f)localObject2).getTitle());
                ((StringBuilder)localObject4).append(((com.tencent.mm.plugin.card.a.f)localObject2).getString(R.l.dFe));
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((StringBuilder)localObject4).toString();
                ((com.tencent.mm.plugin.card.model.b)localObject3).kns = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).kqV = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_detail";
                if (i != 0) {
                  ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.add(localObject3);
                }
                if ((!((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.ait()) || (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa <= 0))
                {
                  if ((!((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.air()) || (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa <= 0))
                  {
                    if (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa <= 0) {
                      break label5995;
                    }
                    com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailDataMgr", "shop_count:" + ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa);
                    if ((((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa > 0) && (((com.tencent.mm.plugin.card.a.f)localObject2).kmP != null) && (((com.tencent.mm.plugin.card.a.f)localObject2).kmP.size() > 0))
                    {
                      localObject3 = (ji)((com.tencent.mm.plugin.card.a.f)localObject2).kmP.get(0);
                      if ((localObject3 == null) || (((ji)localObject3).tEK >= 50000.0F)) {
                        break label6186;
                      }
                      localObject4 = new com.tencent.mm.plugin.card.model.b();
                      ((com.tencent.mm.plugin.card.model.b)localObject4).knD = 2;
                      ((com.tencent.mm.plugin.card.model.b)localObject4).title = ((ji)localObject3).name;
                      ((com.tencent.mm.plugin.card.model.b)localObject4).kns = ((com.tencent.mm.plugin.card.a.f)localObject2).jFp.getString(R.l.dGv, new Object[] { com.tencent.mm.plugin.card.b.l.d(((com.tencent.mm.plugin.card.a.f)localObject2).jFp, ((ji)localObject3).tEK), ((ji)localObject3).hwK });
                      ((com.tencent.mm.plugin.card.model.b)localObject4).kqV = "";
                      ((com.tencent.mm.plugin.card.model.b)localObject4).url = "card://jump_shop";
                      ((com.tencent.mm.plugin.card.model.b)localObject4).knH = ((ji)localObject3).knH;
                      ((com.tencent.mm.plugin.card.model.b)localObject4).hbA = ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().hbA;
                      ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.add(localObject4);
                    }
                  }
                  if ((((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa <= 0) || (((com.tencent.mm.plugin.card.a.f)localObject2).kmP != null)) {
                    break label6237;
                  }
                  localObject3 = new com.tencent.mm.plugin.card.model.b();
                  ((com.tencent.mm.plugin.card.model.b)localObject3).knD = 1;
                  if (TextUtils.isEmpty(((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFz)) {
                    break label6221;
                  }
                  ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFz;
                  ((com.tencent.mm.plugin.card.model.b)localObject3).kns = "";
                  ((com.tencent.mm.plugin.card.model.b)localObject3).kqV = "";
                  ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_shop_list";
                  ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.add(localObject3);
                }
              }
              while ((((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa <= 0) || (((com.tencent.mm.plugin.card.a.f)localObject2).kmP == null) || (((com.tencent.mm.plugin.card.a.f)localObject2).kmP.size() <= 0)) {
                for (;;)
                {
                  if (((!((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiv()) || (((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiL().status != 3)) && (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tET))) {
                    ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.add(((com.tencent.mm.plugin.card.a.f)localObject2).ajj());
                  }
                  ((List)localObject1).addAll(((com.tencent.mm.plugin.card.a.f)localObject2).kmN);
                  localObject1 = this.kup;
                  localObject2 = this.kmN;
                  ((l)localObject1).kmN.clear();
                  ((l)localObject1).kmN.addAll((Collection)localObject2);
                  this.kup.kzf = this.kmJ.aiv();
                  this.kup.notifyDataSetChanged();
                  break;
                  if ((localObject4 != null) && (((pd)localObject4).tKV != null) && (((pd)localObject4).tKV.size() > 0) && (!TextUtils.isEmpty((CharSequence)((pd)localObject4).tKV.get(0))))
                  {
                    i = 0;
                    break label5489;
                  }
                  i = 1;
                  break label5489;
                  if (localObject3 == null) {
                    break label5884;
                  }
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailDataMgr", "distance:" + ((ji)localObject3).tEK);
                  break label5884;
                  ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).getString(R.l.dEK);
                }
              }
              localObject3 = new com.tencent.mm.plugin.card.model.b();
              ((com.tencent.mm.plugin.card.model.b)localObject3).knD = 1;
              localObject4 = (ji)((com.tencent.mm.plugin.card.a.f)localObject2).kmP.get(0);
              if (!TextUtils.isEmpty(((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFz))
              {
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFz;
                if ((!((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.air()) || (((ji)localObject4).tEK >= 2000.0F)) {
                  break label6586;
                }
                if ((((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa <= 1) && ((((com.tencent.mm.plugin.card.a.f)localObject2).kmP == null) || (((com.tencent.mm.plugin.card.a.f)localObject2).kmP.size() <= 1))) {
                  break label6565;
                }
                ((com.tencent.mm.plugin.card.model.b)localObject3).kns = ((com.tencent.mm.plugin.card.a.f)localObject2).jFp.getString(R.l.dFK, new Object[] { com.tencent.mm.plugin.card.b.l.d(((com.tencent.mm.plugin.card.a.f)localObject2).jFp, ((ji)localObject4).tEK) });
              }
              for (;;)
              {
                ((com.tencent.mm.plugin.card.model.b)localObject3).kqV = "";
                ((com.tencent.mm.plugin.card.model.b)localObject3).url = "card://jump_shop_list";
                ((com.tencent.mm.plugin.card.a.f)localObject2).kmN.add(localObject3);
                break;
                if ((!((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.air()) && (((ji)localObject4).tEK < 5000.0F))
                {
                  if ((((com.tencent.mm.plugin.card.a.f)localObject2).kmJ.aiK().tFa == 1) || (((com.tencent.mm.plugin.card.a.f)localObject2).kmP.size() == 1))
                  {
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailDataMgr", "shop_count is 1 or mShopList size is 1");
                    break;
                  }
                  ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).getString(R.l.dEQ);
                  break label6338;
                }
                ((com.tencent.mm.plugin.card.model.b)localObject3).title = ((com.tencent.mm.plugin.card.a.f)localObject2).getString(R.l.dEK);
                break label6338;
                ((com.tencent.mm.plugin.card.model.b)localObject3).kns = com.tencent.mm.plugin.card.b.l.d(((com.tencent.mm.plugin.card.a.f)localObject2).jFp, ((ji)localObject4).tEK);
                continue;
                ((com.tencent.mm.plugin.card.model.b)localObject3).kns = "";
              }
              if (this.kmJ.aiK().knq == 10)
              {
                this.kuo = new com.tencent.mm.plugin.card.ui.view.q();
                break label1912;
              }
              this.kuo = new com.tencent.mm.plugin.card.ui.view.j();
              break label1912;
              if (!this.kuo.h(this.kmJ)) {
                break label1927;
              }
              this.kuo.d(this.kmJ);
              this.kuo.update();
              break label1927;
              if (this.kuo == null) {
                break label1927;
              }
              this.kuo.amb();
              break label1927;
              com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CardDetailUIContoller", "don't update CardCodeView");
              if (this.kuo != null) {
                this.kuo.amb();
              }
              if (this.kun == null) {
                break label1944;
              }
              this.kun.dB(false);
              break label1944;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "don't update CardAdvertiseView");
              this.kuy.amb();
            }
          }
        }
      }
    }
  }
  
  public final void b(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18900003586048L, 140816);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "on onReceiveCodeUnavailable! do update refresh code view!");
    Message localMessage = Message.obtain();
    c localc = new c();
    localc.kuV = b.kuS;
    localc.kuW = paramc;
    localMessage.obj = localc;
    this.kuK.sendMessage(localMessage);
    GMTrace.o(18900003586048L, 140816);
  }
  
  public final void c(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18899600932864L, 140813);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CardDetailUIContoller", "onGetCodeSuccess! do update code view!");
    Message localMessage = Message.obtain();
    c localc = new c();
    localc.kuV = b.kuQ;
    localc.kuW = paramc;
    localMessage.obj = localc;
    this.kuK.sendMessage(localMessage);
    GMTrace.o(18899600932864L, 140813);
  }
  
  public final void d(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(4965384847360L, 36995);
    if (paramb != null)
    {
      this.kmJ = paramb;
      if (this.kuI != null) {
        this.kuI.d(paramb);
      }
      akd();
    }
    GMTrace.o(4965384847360L, 36995);
  }
  
  public final View findViewById(int paramInt)
  {
    GMTrace.i(4965116411904L, 36993);
    View localView = this.krg.findViewById(paramInt);
    GMTrace.o(4965116411904L, 36993);
    return localView;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(4966727024640L, 37005);
    String str = this.jFp.getString(paramInt);
    GMTrace.o(4966727024640L, 37005);
    return str;
  }
  
  public static final class a
  {
    public int kjz;
    public String kmv;
    public boolean knC;
    public int krw;
    public String ktD;
    public String ktE;
    public String ktT;
    public String ktU;
    public String ktV;
    public int kuP;
    
    public a()
    {
      GMTrace.i(4968874508288L, 37021);
      this.kjz = 3;
      this.krw = -1;
      this.kmv = "";
      this.ktT = "";
      this.ktU = "";
      this.ktV = "";
      this.ktD = "";
      this.ktE = "";
      this.knC = false;
      this.kuP = 0;
      GMTrace.o(4968874508288L, 37021);
    }
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(18899064061952L, 140809);
      kuQ = 1;
      kuR = 2;
      kuS = 3;
      kuT = 4;
      kuU = new int[] { kuQ, kuR, kuS, kuT };
      GMTrace.o(18899064061952L, 140809);
    }
  }
  
  private static final class c
  {
    int errCode;
    String ftU;
    int kuV;
    com.tencent.mm.plugin.card.b.c kuW;
    
    public c()
    {
      GMTrace.i(18897185013760L, 140795);
      GMTrace.o(18897185013760L, 140795);
    }
  }
  
  public static abstract interface d
  {
    public abstract void akE();
    
    public abstract void akF();
    
    public abstract void akG();
    
    public abstract void akH();
    
    public abstract void akI();
    
    public abstract void akJ();
    
    public abstract void akK();
    
    public abstract void d(com.tencent.mm.plugin.card.base.b paramb);
    
    public abstract void dz(boolean paramBoolean);
    
    public abstract void tW(String paramString);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */