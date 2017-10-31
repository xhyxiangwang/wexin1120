package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.game.c.bb;
import com.tencent.mm.plugin.game.c.be;
import com.tencent.mm.plugin.game.c.bf;
import com.tencent.mm.plugin.game.c.bn;
import com.tencent.mm.plugin.game.c.br;
import com.tencent.mm.plugin.game.c.cn;
import com.tencent.mm.plugin.game.c.x;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.plugin.game.model.ae.a;
import com.tencent.mm.plugin.game.model.ae.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.l.b;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.widget.EllipsizingTextView;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyGameInfoView
  extends LinearLayout
{
  static Map<String, View> mQI;
  private LinearLayout lTO;
  private ae.a mBL;
  private int mBs;
  private Context mContext;
  private j mIc;
  private LayoutInflater mJi;
  private int mJk;
  l.b mKr;
  e mKs;
  private View.OnClickListener mLd;
  Map<String, m> mQH;
  
  static
  {
    GMTrace.i(12716995510272L, 94749);
    mQI = new HashMap();
    GMTrace.o(12716995510272L, 94749);
  }
  
  public MyGameInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12715384897536L, 94737);
    this.mLd = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12728940888064L, 94838);
        if (!(paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
        {
          w.e("MicroMsg.MyGameInfoView", "No button tag retrived, ignore click");
          GMTrace.o(12728940888064L, 94838);
          return;
        }
        paramAnonymousView = (com.tencent.mm.plugin.game.model.c)paramAnonymousView.getTag();
        if (!MyGameInfoView.c(MyGameInfoView.this).containsKey(paramAnonymousView.field_appId))
        {
          w.e("MicroMsg.MyGameInfoView", "No DownloadInfo found");
          GMTrace.o(12728940888064L, 94838);
          return;
        }
        m localm = (m)MyGameInfoView.c(MyGameInfoView.this).get(paramAnonymousView.field_appId);
        localm.cA(MyGameInfoView.a(MyGameInfoView.this));
        MyGameInfoView.d(MyGameInfoView.this).a(paramAnonymousView, localm);
        GMTrace.o(12728940888064L, 94838);
      }
    };
    this.mKr = new l.b()
    {
      public final void g(int paramAnonymousInt, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(12738604564480L, 94910);
        if ((!paramAnonymousBoolean) || (bg.mZ(paramAnonymousString)))
        {
          GMTrace.o(12738604564480L, 94910);
          return;
        }
        String[] arrayOfString = new String[MyGameInfoView.c(MyGameInfoView.this).keySet().size()];
        MyGameInfoView.c(MyGameInfoView.this).keySet().toArray(arrayOfString);
        paramAnonymousInt = 0;
        while (paramAnonymousInt < arrayOfString.length)
        {
          m localm = (m)MyGameInfoView.c(MyGameInfoView.this).get(arrayOfString[paramAnonymousInt]);
          if ((localm != null) && (localm.mzY != null) && ((localm.mzY.field_appId.equals(paramAnonymousString)) || (localm.mzY.field_packageName.equals(paramAnonymousString))))
          {
            localm.cA(MyGameInfoView.a(MyGameInfoView.this));
            localm.aEn();
            Object localObject = (View)MyGameInfoView.aFK().get(localm.mzY.field_appId);
            if (localObject != null)
            {
              localObject = (MyGameInfoView.a)((View)localObject).getTag();
              MyGameInfoView.d(MyGameInfoView.this).a(((MyGameInfoView.a)localObject).mNv, ((MyGameInfoView.a)localObject).mNu, localm.mzY, (m)MyGameInfoView.c(MyGameInfoView.this).get(localm.mzY.field_appId));
            }
          }
          paramAnonymousInt += 1;
        }
        GMTrace.o(12738604564480L, 94910);
      }
    };
    this.mContext = paramContext;
    this.mJi = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    GMTrace.o(12715384897536L, 94737);
  }
  
  private void a(ae.a parama)
  {
    GMTrace.i(12715787550720L, 94740);
    this.lTO.removeAllViews();
    if (!bg.bX(parama.mBM))
    {
      Iterator localIterator = parama.mBM.iterator();
      for (int i = 0;; i = 1)
      {
        ae.a.a locala;
        do
        {
          j = i;
          if (!localIterator.hasNext()) {
            break;
          }
          locala = (ae.a.a)localIterator.next();
        } while ((locala.mBO == null) || (bg.mZ(locala.mBO.field_appId)) || (bg.mZ(locala.mBO.field_appName)));
        Object localObject3 = locala.mBO;
        g(this.lTO);
        Object localObject4 = new a();
        Object localObject5 = this.mJi.inflate(R.i.cWu, this.lTO, false);
        ((a)localObject4).mNq = ((ViewGroup)((View)localObject5).findViewById(R.h.bZp));
        ((a)localObject4).mQK = ((ImageView)((View)localObject5).findViewById(R.h.bMC));
        ((a)localObject4).mQL = ((TextView)((View)localObject5).findViewById(R.h.bNj));
        ((a)localObject4).mQM = ((TextView)((View)localObject5).findViewById(R.h.bLp));
        ((a)localObject4).mNu = ((Button)((View)localObject5).findViewById(R.h.bMs));
        ((a)localObject4).mNv = ((TextProgressBar)((View)localObject5).findViewById(R.h.bMt));
        ((a)localObject4).mNv.oN(14);
        ((a)localObject4).mNu.setOnClickListener(this.mLd);
        ((a)localObject4).mNv.setOnClickListener(this.mLd);
        ((a)localObject4).mQN = ((TextView)((View)localObject5).findViewById(R.h.bMO));
        label366:
        label462:
        label495:
        Object localObject2;
        if ((((com.tencent.mm.plugin.game.model.c)localObject3).aEa()) && (!g.a(this.mContext, (f)localObject3)))
        {
          if (!bg.mZ(((com.tencent.mm.plugin.game.model.c)localObject3).mzu.mFx))
          {
            com.tencent.mm.plugin.game.d.e.aFP().g(((a)localObject4).mQK, ((com.tencent.mm.plugin.game.model.c)localObject3).mzu.mFx);
            if (bg.mZ(((com.tencent.mm.plugin.game.model.c)localObject3).mzu.mFw)) {
              break label796;
            }
            ((a)localObject4).mQL.setText(((com.tencent.mm.plugin.game.model.c)localObject3).mzu.mFw);
            if (((com.tencent.mm.plugin.game.model.c)localObject3).mzu.mCW != null)
            {
              ((a)localObject4).mQN.setVisibility(0);
              ((a)localObject4).mQN.setText(((com.tencent.mm.plugin.game.model.c)localObject3).mzu.mCW.mCJ);
            }
          }
          try
          {
            i = Color.parseColor(((com.tencent.mm.plugin.game.model.c)localObject3).mzu.mCW.mFN);
            ((a)localObject4).mQN.setTextColor(i);
            localObject1 = ((a)localObject4).mQN.getBackground();
            if ((localObject1 != null) && ((localObject1 instanceof GradientDrawable))) {
              ((GradientDrawable)localObject1).setStroke(1, i);
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              Object localObject1;
              w.e("MicroMsg.MyGameInfoView", localException.getMessage());
              ((a)localObject4).mQN.setVisibility(8);
            }
          }
          if (bg.mZ(((com.tencent.mm.plugin.game.model.c)localObject3).myY)) {
            break label877;
          }
          ((a)localObject4).mQM.setText(((com.tencent.mm.plugin.game.model.c)localObject3).mzn);
          ((a)localObject4).mQM.setVisibility(0);
          ((a)localObject4).mNu.setTag(localObject3);
          ((a)localObject4).mNv.setTag(localObject3);
          localObject2 = (m)this.mQH.get(((com.tencent.mm.plugin.game.model.c)localObject3).field_appId);
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = new m((com.tencent.mm.plugin.game.model.c)localObject3);
          }
          this.mKs.a(((a)localObject4).mNv, ((a)localObject4).mNu, (com.tencent.mm.plugin.game.model.c)localObject3, (m)localObject1);
          ((a)localObject4).mNq.setOnClickListener(this.mIc);
          ((a)localObject4).mNq.setTag(localObject3);
          ((View)localObject5).setTag(localObject4);
          mQI.put(((com.tencent.mm.plugin.game.model.c)localObject3).field_appId, localObject5);
          this.lTO.addView((View)localObject5);
          localObject1 = locala.mBP;
          if (bg.bX((List)localObject1)) {
            continue;
          }
          localObject1 = ((LinkedList)localObject1).iterator();
        }
        for (;;)
        {
          label651:
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (x)((Iterator)localObject1).next();
            if (localObject2 != null)
            {
              switch (((x)localObject2).mDT)
              {
              }
              for (;;)
              {
                if (this.mJk != 2) {
                  break label2096;
                }
                ai.a(this.mContext, 1002, ((x)localObject2).mDS, locala.mBO.field_appId, this.mBs, ai.ze(((x)localObject2).mDh));
                break label651;
                com.tencent.mm.plugin.game.d.e.aFP().a(((a)localObject4).mQK, ((com.tencent.mm.plugin.game.model.c)localObject3).field_appId, a.getDensity(this.mContext));
                break;
                label796:
                ((a)localObject4).mQL.setText(((com.tencent.mm.plugin.game.model.c)localObject3).field_appName);
                break label366;
                com.tencent.mm.plugin.game.d.e.aFP().a(((a)localObject4).mQK, ((com.tencent.mm.plugin.game.model.c)localObject3).field_appId, a.getDensity(this.mContext));
                ((a)localObject4).mQL.setText(((com.tencent.mm.plugin.game.model.c)localObject3).field_appName);
                break label462;
                label877:
                ((a)localObject4).mQM.setVisibility(8);
                break label495;
                if ((bg.mZ(((x)localObject2).mDQ)) || (((x)localObject2).mDU == null) || (bg.mZ(((x)localObject2).mDU.fuw))) {
                  break label651;
                }
                localObject3 = this.mJi.inflate(R.i.cWR, null);
                localObject4 = (MyGameTextStyleView)((View)localObject3).findViewById(R.h.bNz);
                ((MyGameTextStyleView)localObject4).mBs = this.mBs;
                ((MyGameTextStyleView)localObject4).appId = locala.mBO.field_appId;
                if ((localObject2 == null) || (bg.mZ(((x)localObject2).mDQ)) || (((x)localObject2).mDU == null) || (bg.mZ(((x)localObject2).mDU.fuw)))
                {
                  ((MyGameTextStyleView)localObject4).setVisibility(8);
                  if (((MyGameTextStyleView)localObject4).getVisibility() == 0)
                  {
                    h(this.lTO);
                    this.lTO.addView((View)localObject3);
                  }
                }
                else
                {
                  ((MyGameTextStyleView)localObject4).setVisibility(0);
                  label1080:
                  boolean bool;
                  if (((x)localObject2).mDQ.length() > 4)
                  {
                    ((MyGameTextStyleView)localObject4).mQO.setText(((x)localObject2).mDQ.substring(0, 4));
                    if (!bg.mZ(((x)localObject2).mDR))
                    {
                      ((MyGameTextStyleView)localObject4).mQP.setText(((x)localObject2).mDR);
                      ((MyGameTextStyleView)localObject4).mQP.setVisibility(0);
                    }
                    ((MyGameTextStyleView)localObject4).jaE.setText(h.b(((MyGameTextStyleView)localObject4).mContext, ((x)localObject2).mDU.fuw, ((MyGameTextStyleView)localObject4).jaE.getTextSize()));
                    bool = ((x)localObject2).mDU.mFC;
                    if (!bg.mZ(((x)localObject2).mDU.mCK))
                    {
                      ((MyGameTextStyleView)localObject4).mQR.setText(h.b(((MyGameTextStyleView)localObject4).mContext, ((x)localObject2).mDU.mCK, ((MyGameTextStyleView)localObject4).mQR.getTextSize()));
                      ((MyGameTextStyleView)localObject4).mQR.setVisibility(0);
                    }
                    if (!bg.mZ(((x)localObject2).mDU.mDf))
                    {
                      localObject5 = new e.a.a();
                      switch (((x)localObject2).mDU.mFA)
                      {
                      }
                    }
                  }
                  for (;;)
                  {
                    ((MyGameTextStyleView)localObject4).setTag(localObject2);
                    ((MyGameTextStyleView)localObject4).setOnClickListener((View.OnClickListener)localObject4);
                    break;
                    ((MyGameTextStyleView)localObject4).mQO.setText(((x)localObject2).mDQ);
                    break label1080;
                    ((MyGameTextStyleView)localObject4).mQW.setVisibility(0);
                    com.tencent.mm.plugin.game.d.e.aFP().a(((MyGameTextStyleView)localObject4).mQX, ((x)localObject2).mDU.mDf, ((e.a.a)localObject5).aFQ());
                    continue;
                    ((MyGameTextStyleView)localObject4).mQT.setVisibility(0);
                    ((MyGameTextStyleView)localObject4).mQS.setVisibility(0);
                    ((e.a.a)localObject5).hDm = true;
                    ((e.a.a)localObject5).mRG = R.g.aZc;
                    com.tencent.mm.plugin.game.d.e.aFP().a(((MyGameTextStyleView)localObject4).mQU, ((x)localObject2).mDU.mDf, ((e.a.a)localObject5).aFQ());
                    continue;
                    if (bool)
                    {
                      ((MyGameTextStyleView)localObject4).mQY.setVisibility(0);
                      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)((MyGameTextStyleView)localObject4).mQZ.getLayoutParams();
                      if (((MyGameTextStyleView)localObject4).mQR.getLineCount() < 2) {
                        localLayoutParams.addRule(15);
                      }
                      for (;;)
                      {
                        ((MyGameTextStyleView)localObject4).mQZ.setLayoutParams(localLayoutParams);
                        ((e.a.a)localObject5).mRD = true;
                        com.tencent.mm.plugin.game.d.e.aFP().a(((MyGameTextStyleView)localObject4).mRa, ((x)localObject2).mDU.mDf, ((e.a.a)localObject5).aFQ());
                        MyGameTextStyleView.f(((MyGameTextStyleView)localObject4).mRb, ((x)localObject2).mDU.mFB);
                        break;
                        localLayoutParams.addRule(12);
                      }
                    }
                    ((MyGameTextStyleView)localObject4).mQS.setVisibility(0);
                    ((e.a.a)localObject5).mRD = true;
                    ((e.a.a)localObject5).mRG = R.g.aZd;
                    com.tencent.mm.plugin.game.d.e.aFP().a(((MyGameTextStyleView)localObject4).mQU, ((x)localObject2).mDU.mDf, ((e.a.a)localObject5).aFQ());
                    MyGameTextStyleView.f(((MyGameTextStyleView)localObject4).mQV, ((x)localObject2).mDU.mFB);
                  }
                  if ((bg.mZ(((x)localObject2).mDQ)) || (((x)localObject2).mDV == null) || (bg.mZ(((x)localObject2).mDV.mDf))) {
                    break label651;
                  }
                  localObject3 = this.mJi.inflate(R.i.cWQ, null);
                  localObject4 = (MyGamePicStyleView)((View)localObject3).findViewById(R.h.bNl);
                  ((MyGamePicStyleView)localObject4).mBs = this.mBs;
                  ((MyGamePicStyleView)localObject4).appId = locala.mBO.field_appId;
                  if ((localObject2 == null) || (bg.mZ(((x)localObject2).mDQ)) || (((x)localObject2).mDV == null) || (bg.mZ(((x)localObject2).mDV.mDf)))
                  {
                    ((MyGamePicStyleView)localObject4).setVisibility(8);
                    if (((MyGamePicStyleView)localObject4).getVisibility() == 0)
                    {
                      h(this.lTO);
                      this.lTO.addView((View)localObject3);
                    }
                  }
                  else
                  {
                    ((MyGamePicStyleView)localObject4).setVisibility(0);
                    if (((x)localObject2).mDQ.length() > 4) {
                      ((MyGamePicStyleView)localObject4).mQO.setText(((x)localObject2).mDQ.substring(0, 4));
                    }
                    for (;;)
                    {
                      if (!bg.mZ(((x)localObject2).mDR))
                      {
                        ((MyGamePicStyleView)localObject4).mQP.setText(((x)localObject2).mDR);
                        ((MyGamePicStyleView)localObject4).mQP.setVisibility(0);
                      }
                      localObject5 = new e.a.a();
                      ((e.a.a)localObject5).mRG = R.g.aZa;
                      com.tencent.mm.plugin.game.d.e.aFP().a(((MyGamePicStyleView)localObject4).mQQ, ((x)localObject2).mDV.mDf, ((e.a.a)localObject5).aFQ());
                      i = Math.round((com.tencent.mm.plugin.game.d.c.getScreenWidth(((MyGamePicStyleView)localObject4).mContext) - ((MyGamePicStyleView)localObject4).getPaddingLeft() - ((MyGamePicStyleView)localObject4).getPaddingRight()) / 690.0F * 80.0F);
                      localObject5 = (RelativeLayout.LayoutParams)((MyGamePicStyleView)localObject4).mQQ.getLayoutParams();
                      ((RelativeLayout.LayoutParams)localObject5).height = i;
                      ((MyGamePicStyleView)localObject4).mQQ.setLayoutParams((ViewGroup.LayoutParams)localObject5);
                      ((MyGamePicStyleView)localObject4).setTag(localObject2);
                      ((MyGamePicStyleView)localObject4).setOnClickListener((View.OnClickListener)localObject4);
                      break;
                      ((MyGamePicStyleView)localObject4).mQO.setText(((x)localObject2).mDQ);
                    }
                    if ((bg.mZ(((x)localObject2).mDQ)) || (((x)localObject2).mDX == null) || (bg.mZ(((x)localObject2).mDX.fuw))) {
                      break label651;
                    }
                    localObject3 = this.mJi.inflate(R.i.cWS, null);
                    localObject4 = (MyGameVideoRecomStyleView)((View)localObject3).findViewById(R.h.cew);
                    ((MyGameVideoRecomStyleView)localObject4).mBs = this.mBs;
                    ((MyGameVideoRecomStyleView)localObject4).iqL = locala.mBO.field_appId;
                    if ((localObject2 != null) && (!bg.mZ(((x)localObject2).mDQ)) && (((x)localObject2).mDX != null) && (!bg.mZ(((x)localObject2).mDX.fuw))) {
                      break label2098;
                    }
                    ((MyGameVideoRecomStyleView)localObject4).setVisibility(8);
                    label2070:
                    if (((MyGameVideoRecomStyleView)localObject4).getVisibility() != 0) {
                      break label2355;
                    }
                    h(this.lTO);
                    this.lTO.addView((View)localObject3);
                  }
                }
              }
              label2096:
              continue;
              label2098:
              ((MyGameVideoRecomStyleView)localObject4).setVisibility(0);
              if (((x)localObject2).mDQ.length() > 4)
              {
                ((MyGameVideoRecomStyleView)localObject4).mRc.setText(((x)localObject2).mDQ.substring(0, 4));
                label2134:
                if (bg.mZ(((x)localObject2).mDR)) {
                  break label2373;
                }
                ((MyGameVideoRecomStyleView)localObject4).mRd.setText(((x)localObject2).mDR);
                ((MyGameVideoRecomStyleView)localObject4).mRd.setVisibility(0);
                label2167:
                ((MyGameVideoRecomStyleView)localObject4).lwa.setText(h.b(((MyGameVideoRecomStyleView)localObject4).mContext, ((x)localObject2).mDX.fuw, ((MyGameVideoRecomStyleView)localObject4).lwa.getTextSize()));
                if (bg.mZ(((x)localObject2).mDX.mGE)) {
                  break label2383;
                }
                ((MyGameVideoRecomStyleView)localObject4).mRe.setText(((x)localObject2).mDX.mGE);
                ((MyGameVideoRecomStyleView)localObject4).mRe.setVisibility(0);
                label2238:
                if (bg.mZ(((x)localObject2).mDX.mGJ)) {
                  break label2396;
                }
                ((MyGameVideoRecomStyleView)localObject4).mRf.setText(((x)localObject2).mDX.mGJ);
                ((MyGameVideoRecomStyleView)localObject4).mRf.setVisibility(0);
                label2277:
                if (bg.mZ(((x)localObject2).mDX.mFF)) {
                  break label2409;
                }
                ((MyGameVideoRecomStyleView)localObject4).mRg.setText(((x)localObject2).mDX.mFF);
                ((MyGameVideoRecomStyleView)localObject4).mRg.setVisibility(0);
                label2316:
                if (!bg.mZ(((x)localObject2).mDX.mDf)) {
                  break label2422;
                }
                ((MyGameVideoRecomStyleView)localObject4).mRh.setVisibility(8);
              }
              for (;;)
              {
                ((MyGameVideoRecomStyleView)localObject4).setTag(localObject2);
                ((MyGameVideoRecomStyleView)localObject4).setOnClickListener((View.OnClickListener)localObject4);
                break label2070;
                label2355:
                break;
                ((MyGameVideoRecomStyleView)localObject4).mRc.setText(((x)localObject2).mDQ);
                break label2134;
                label2373:
                ((MyGameVideoRecomStyleView)localObject4).setVisibility(8);
                break label2167;
                label2383:
                ((MyGameVideoRecomStyleView)localObject4).mRe.setVisibility(8);
                break label2238;
                label2396:
                ((MyGameVideoRecomStyleView)localObject4).mRf.setVisibility(8);
                break label2277;
                label2409:
                ((MyGameVideoRecomStyleView)localObject4).mRg.setVisibility(8);
                break label2316;
                label2422:
                ((MyGameVideoRecomStyleView)localObject4).mRh.setVisibility(0);
                localObject5 = new e.a.a();
                ((e.a.a)localObject5).mRD = true;
                com.tencent.mm.plugin.game.d.e.aFP().a(((MyGameVideoRecomStyleView)localObject4).jsH, ((x)localObject2).mDX.mDf, ((e.a.a)localObject5).aFQ());
                if (bg.mZ(((x)localObject2).mDX.mFB))
                {
                  ((MyGameVideoRecomStyleView)localObject4).mRj.setVisibility(8);
                }
                else
                {
                  com.tencent.mm.plugin.game.d.e.aFP().g(((MyGameVideoRecomStyleView)localObject4).mRj, ((x)localObject2).mDX.mFB);
                  ((MyGameVideoRecomStyleView)localObject4).mRj.setVisibility(0);
                }
              }
            }
          }
        }
      }
    }
    int j = 0;
    if (j != 0) {
      g(this.lTO);
    }
    if ((parama.mBN != null) && (!bg.mZ(parama.mBN.mCK)) && (!bg.mZ(parama.mBN.mDg)))
    {
      View localView = this.mJi.inflate(R.i.cWO, this, false);
      ((TextView)localView.findViewById(R.h.text)).setText(parama.mBN.mCK);
      localView.setTag(parama.mBN.mDg);
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(12663174201344L, 94348);
          if ((paramAnonymousView.getTag() == null) || (!(paramAnonymousView.getTag() instanceof String)))
          {
            GMTrace.o(12663174201344L, 94348);
            return;
          }
          paramAnonymousView = (String)paramAnonymousView.getTag();
          int i = com.tencent.mm.plugin.game.d.c.p(MyGameInfoView.a(MyGameInfoView.this), paramAnonymousView, "game_center_mygame_more");
          ai.a(MyGameInfoView.a(MyGameInfoView.this), 10, 1002, 99, i, MyGameInfoView.b(MyGameInfoView.this), null);
          GMTrace.o(12663174201344L, 94348);
        }
      });
      this.lTO.addView(localView);
      g(this.lTO);
    }
    if (j != 0)
    {
      setVisibility(0);
      GMTrace.o(12715787550720L, 94740);
      return;
    }
    setVisibility(8);
    GMTrace.o(12715787550720L, 94740);
  }
  
  private void g(ViewGroup paramViewGroup)
  {
    GMTrace.i(12715921768448L, 94741);
    paramViewGroup.addView((ImageView)this.mJi.inflate(R.i.cWp, paramViewGroup, false));
    GMTrace.o(12715921768448L, 94741);
  }
  
  private void h(ViewGroup paramViewGroup)
  {
    GMTrace.i(12716055986176L, 94742);
    ImageView localImageView = (ImageView)this.mJi.inflate(R.i.cWp, paramViewGroup, false);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)localImageView.getLayoutParams();
    localMarginLayoutParams.leftMargin = a.fromDPToPix(this.mContext, 15);
    localImageView.setLayoutParams(localMarginLayoutParams);
    paramViewGroup.addView(localImageView);
    GMTrace.o(12716055986176L, 94742);
  }
  
  public final void a(ae.a parama, int paramInt1, int paramInt2)
  {
    GMTrace.i(12715653332992L, 94739);
    if (parama == null)
    {
      setVisibility(8);
      GMTrace.o(12715653332992L, 94739);
      return;
    }
    this.mBs = paramInt1;
    this.mJk = paramInt2;
    this.mIc.oz(this.mBs);
    setVisibility(0);
    if (this.mJk == 2) {
      ai.a(this.mContext, 1002, 0, null, this.mBs, null);
    }
    this.mBL = parama;
    final LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.mBL.mBM.iterator();
    while (localIterator.hasNext()) {
      localLinkedList.add(((ae.a.a)localIterator.next()).mBO);
    }
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12700218294272L, 94624);
        try
        {
          Iterator localIterator = localLinkedList.iterator();
          while (localIterator.hasNext())
          {
            com.tencent.mm.plugin.game.model.c localc = (com.tencent.mm.plugin.game.model.c)localIterator.next();
            if (!MyGameInfoView.c(MyGameInfoView.this).containsKey(localc.field_appId)) {
              MyGameInfoView.a(MyGameInfoView.this, localc);
            }
          }
          GMTrace.o(12700218294272L, 94624);
        }
        catch (Exception localException)
        {
          w.i("MicroMsg.MyGameInfoView", localException.getMessage());
          GMTrace.o(12700218294272L, 94624);
          return;
        }
      }
    });
    a(parama);
    GMTrace.o(12715653332992L, 94739);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12715519115264L, 94738);
    super.onFinishInflate();
    this.lTO = ((LinearLayout)findViewById(R.h.bLo));
    this.mIc = new j();
    this.mKs = new e(this.mContext);
    this.mQH = new HashMap();
    l.a(this.mKr);
    w.i("MicroMsg.MyGameInfoView", "initView finished");
    GMTrace.o(12715519115264L, 94738);
  }
  
  private static final class a
  {
    public ViewGroup mNq;
    public Button mNu;
    public TextProgressBar mNv;
    public ImageView mQK;
    public TextView mQL;
    public TextView mQM;
    public TextView mQN;
    
    public a()
    {
      GMTrace.i(12688407134208L, 94536);
      GMTrace.o(12688407134208L, 94536);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/MyGameInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */