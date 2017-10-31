package com.tencent.mm.plugin.sns.ui.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.d;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.model.at;
import com.tencent.mm.plugin.sns.ui.AsyncNormalTextView;
import com.tencent.mm.plugin.sns.ui.AsyncTextView;
import com.tencent.mm.plugin.sns.ui.MaskTextView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.SnsTranslateResultView;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.TranslateCommentTextView;
import com.tencent.mm.plugin.sns.ui.ab;
import com.tencent.mm.plugin.sns.ui.ak;
import com.tencent.mm.plugin.sns.ui.as;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.av.b;
import com.tencent.mm.plugin.sns.ui.aw;
import com.tencent.mm.plugin.sns.ui.ax;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.plugin.sns.ui.bd;
import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.plugin.sns.ui.j;
import com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView;
import com.tencent.mm.plugin.sns.ui.x;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.pluginsdk.ui.d.l;
import com.tencent.mm.pluginsdk.ui.d.m.a;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.bcz;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.u.a.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MaskImageButton;
import com.tencent.mm.ui.widget.d;
import com.tencent.mm.ui.widget.g;
import com.tencent.mm.vending.base.Vending;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class a
{
  public boolean DEBUG;
  protected int kxh;
  protected Activity mActivity;
  protected boolean qGP;
  public ArrayList<ao.b> qTA;
  protected av qhj;
  
  public a()
  {
    GMTrace.i(8520007155712L, 63479);
    this.DEBUG = false;
    this.qGP = false;
    this.qTA = new ArrayList();
    GMTrace.o(8520007155712L, 63479);
  }
  
  private ao.b X(String paramString, long paramLong)
  {
    GMTrace.i(8521751986176L, 63492);
    if (this.qTA.size() <= 0)
    {
      GMTrace.o(8521751986176L, 63492);
      return null;
    }
    Iterator localIterator = this.qTA.iterator();
    while (localIterator.hasNext())
    {
      ao.b localb = (ao.b)localIterator.next();
      if ((localb.id != null) && (localb.id.equals(ao.du(paramString, String.valueOf(paramLong)))))
      {
        GMTrace.o(8521751986176L, 63492);
        return localb;
      }
    }
    GMTrace.o(8521751986176L, 63492);
    return null;
  }
  
  private static void a(View paramView, CharSequence paramCharSequence)
  {
    GMTrace.i(8521617768448L, 63491);
    if ((paramView instanceof SnsCommentPreloadTextView))
    {
      ((SnsCommentPreloadTextView)paramView).setText(paramCharSequence);
      GMTrace.o(8521617768448L, 63491);
      return;
    }
    if ((paramView instanceof TextView)) {
      ((TextView)paramView).setText(paramCharSequence);
    }
    GMTrace.o(8521617768448L, 63491);
  }
  
  private void a(c paramc, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8520275591168L, 63481);
    if (paramm.uF(32))
    {
      if ((paramm.bjH() != null) && (paramm.bjH().qmi == 1))
      {
        if (paramc.qTH != null) {
          paramc.qTH.setVisibility(8);
        }
        paramc.qTL.setTag(paramc);
        paramc.qTL.setOnClickListener(this.qhj.qgD.qVH);
        paramc.qTL.setLongClickable(true);
        this.qhj.kkG.c(paramc.qTL, this.qhj.qgD.qVt, this.qhj.qgD.qVc);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 8), -2);
        localLayoutParams.setMargins(0, com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 5), 0, 0);
        paramc.qTL.setLayoutParams(localLayoutParams);
        paramc.qTL.setBackgroundResource(i.e.pHu);
        if (paramc.qUe != null)
        {
          localLayoutParams = (LinearLayout.LayoutParams)paramc.qUe.getLayoutParams();
          localLayoutParams.leftMargin = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 10);
          localLayoutParams.rightMargin = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 10);
          paramc.qUe.setLayoutParams(localLayoutParams);
        }
        if (paramc.qUC)
        {
          localLayoutParams = (LinearLayout.LayoutParams)paramc.qUD.qFn.getLayoutParams();
          localLayoutParams.leftMargin = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 10);
          localLayoutParams.rightMargin = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 10);
          paramc.qUD.qFn.setLayoutParams(localLayoutParams);
        }
        if (paramc.qTJ != null) {
          paramc.qTJ.setVisibility(0);
        }
        if (paramc.qTI != null)
        {
          if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramm.bjH().qmj))
          {
            paramc.qTI.setVisibility(0);
            GMTrace.o(8520275591168L, 63481);
            return;
          }
          paramc.qTI.setVisibility(8);
        }
        GMTrace.o(8520275591168L, 63481);
        return;
      }
      if (paramc.qTH != null) {
        paramc.qTH.setVisibility(0);
      }
      paramc.qTL.setLongClickable(false);
      paramc.qTL.setOnClickListener(null);
      paramm = new LinearLayout.LayoutParams(-1, -2);
      paramc.qTL.setLayoutParams(paramm);
      paramc.qTL.setBackgroundColor(Color.parseColor("#00ffffff"));
      if (paramc.qUe != null)
      {
        paramm = (LinearLayout.LayoutParams)paramc.qUe.getLayoutParams();
        paramm.leftMargin = 0;
        paramm.rightMargin = 0;
        paramc.qUe.setLayoutParams(paramm);
      }
      if (paramc.qUC)
      {
        paramm = (LinearLayout.LayoutParams)paramc.qUD.qFn.getLayoutParams();
        paramm.leftMargin = 0;
        paramm.rightMargin = 0;
        paramc.qUD.qFn.setLayoutParams(paramm);
      }
      if (paramc.qTJ != null) {
        paramc.qTJ.setVisibility(8);
      }
      if (paramc.qTI != null) {
        paramc.qTI.setVisibility(8);
      }
      GMTrace.o(8520275591168L, 63481);
      return;
    }
    if (paramc.qTH != null) {
      paramc.qTH.setVisibility(0);
    }
    paramc.qTL.setLongClickable(false);
    paramc.qTL.setOnClickListener(null);
    if (paramc.qUe != null)
    {
      paramm = (LinearLayout.LayoutParams)paramc.qUe.getLayoutParams();
      paramm.leftMargin = 0;
      paramm.rightMargin = 0;
      paramc.qUe.setLayoutParams(paramm);
    }
    if (paramc.qUC)
    {
      paramm = (LinearLayout.LayoutParams)paramc.qUD.qFn.getLayoutParams();
      paramm.leftMargin = 0;
      paramm.rightMargin = 0;
      paramc.qUD.qFn.setLayoutParams(paramm);
    }
    paramm = new LinearLayout.LayoutParams(-1, -2);
    paramc.qTL.setLayoutParams(paramm);
    paramc.qTL.setBackgroundColor(Color.parseColor("#00ffffff"));
    if (paramc.qTJ != null) {
      paramc.qTJ.setVisibility(8);
    }
    if (paramc.qTI != null) {
      paramc.qTI.setVisibility(8);
    }
    GMTrace.o(8520275591168L, 63481);
  }
  
  private boolean a(MaskTextView paramMaskTextView, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, int paramInt)
  {
    GMTrace.i(8521080897536L, 63487);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(" ");
    int k = localSpannableStringBuilder.length() - 1;
    StringBuffer localStringBuffer = new StringBuffer();
    int[] arrayOfInt1 = new int[paramb.size()];
    int[] arrayOfInt2 = new int[paramb.size()];
    int j = 1;
    int i = 0;
    Object localObject;
    try
    {
      if (i < paramb.size())
      {
        localObject = (String)((com.tencent.mm.vending.j.a)paramb.get(i)).get(1);
        if (j != 0)
        {
          localSpannableStringBuilder.append(" ");
          localStringBuffer.append(" ");
          j = 0;
        }
        for (;;)
        {
          arrayOfInt1[i] = localSpannableStringBuilder.length();
          arrayOfInt1[i] += ((String)localObject).length();
          localStringBuffer.append((String)localObject);
          localSpannableStringBuilder.append(h.b(this.mActivity, (CharSequence)localObject, paramMaskTextView.getTextSize()));
          i += 1;
          break;
          localSpannableStringBuilder.append(", ");
          localStringBuffer.append(", ");
        }
        GMTrace.o(8521080897536L, 63487);
      }
    }
    catch (Exception paramMaskTextView)
    {
      w.e("MicroMsg.BaseTimeLineItem", "setLikedList  e:%s", new Object[] { com.tencent.mm.sdk.platformtools.bg.f(paramMaskTextView) });
    }
    for (;;)
    {
      return true;
      localObject = this.mActivity.getResources();
      if (paramInt == 11) {}
      for (i = i.e.pGS;; i = i.e.pHd)
      {
        localObject = ((Resources)localObject).getDrawable(i);
        ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
        d locald = new d((Drawable)localObject);
        locald.wSA = ((int)((((Drawable)localObject).getIntrinsicHeight() - paramMaskTextView.getTextSize() + com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 2)) / 2.0F));
        localSpannableStringBuilder.setSpan(locald, k, k + 1, 33);
        if (paramInt != 11) {
          break label441;
        }
        paramInt = 3;
        break label435;
        while (i < arrayOfInt1.length)
        {
          localSpannableStringBuilder.setSpan(new com.tencent.mm.pluginsdk.ui.d.m((String)((com.tencent.mm.vending.j.a)paramb.get(i)).get(0), this.qhj.qHz, paramInt), arrayOfInt1[i], arrayOfInt2[i], 33);
          i += 1;
        }
      }
      paramMaskTextView.setText(localSpannableStringBuilder, TextView.BufferType.SPANNABLE);
      paramMaskTextView.noa = localStringBuffer.toString();
    }
    for (;;)
    {
      label435:
      i = 0;
      break;
      label441:
      paramInt = 2;
    }
  }
  
  private boolean a(List<bcz> paramList, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, c paramc)
  {
    GMTrace.i(8521483550720L, 63490);
    LinearLayout localLinearLayout = paramc.qUa;
    int n = localLinearLayout.getChildCount();
    int j = paramb.size();
    int i;
    if (n > j)
    {
      i = j;
      while (i < n)
      {
        localObject1 = localLinearLayout.getChildAt(j);
        localLinearLayout.removeViewAt(j);
        if ((localObject1 instanceof SnsCommentPreloadTextView)) {
          this.qhj.a((SnsCommentPreloadTextView)localObject1);
        }
        i += 1;
      }
    }
    if (paramb.size() == 0)
    {
      localLinearLayout.setVisibility(8);
      GMTrace.o(8521483550720L, 63490);
      return false;
    }
    localLinearLayout.setVisibility(0);
    final Object localObject1 = this.qhj.bnI();
    if ((localObject1 instanceof ax)) {}
    for (ay localay = (ay)((ax)localObject1).qPL.get(paramc.position);; localay = null)
    {
      if (this.DEBUG) {
        w.d("MicroMsg.BaseTimeLineItem", "debug:setCommentList position " + paramc.position + " commentCount: " + j);
      }
      int k = 0;
      j = 0;
      Object localObject3;
      ao.b localb;
      label437:
      int m;
      Object localObject2;
      TranslateCommentTextView localTranslateCommentTextView;
      label652:
      String str4;
      String str5;
      if (j < paramb.size())
      {
        localObject1 = (com.tencent.mm.vending.j.a)paramb.get(j);
        long l = ((Long)((com.tencent.mm.vending.j.a)localObject1).get(0)).longValue();
        String str1 = (String)((com.tencent.mm.vending.j.a)localObject1).get(1);
        String str2 = (String)((com.tencent.mm.vending.j.a)localObject1).get(2);
        String str3 = (String)((com.tencent.mm.vending.j.a)localObject1).get(3);
        localObject3 = (CharSequence)((com.tencent.mm.vending.j.a)localObject1).get(4);
        bcz localbcz = (bcz)paramList.get(j);
        localb = X(paramc.fMT, l);
        if ((localb != null) && (localb.hkX)) {
          ao.bP(localb.id, 2);
        }
        if (k >= n) {
          if ((localb == null) || (localb.hkX))
          {
            localObject1 = this.qhj.bnE();
            ((SnsCommentPreloadTextView)localObject1).J(14.0F * com.tencent.mm.bq.a.dZ(((View)localObject1).getContext()));
            if (this.qhj.qPm == -1) {
              this.qhj.qPm = this.mActivity.getResources().getColor(i.c.pGl);
            }
            ((SnsCommentPreloadTextView)localObject1).setTextColor(this.qhj.qPm);
            ((SnsCommentPreloadTextView)localObject1).xT();
            m = 1;
            localObject2 = localObject1;
          }
        }
        for (;;)
        {
          if (localb != null)
          {
            localObject1 = localObject2;
            if (!(localObject2 instanceof TranslateCommentTextView))
            {
              localLinearLayout.removeView((View)localObject2);
              localObject1 = new TranslateCommentTextView(this.mActivity);
              localLinearLayout.addView((View)localObject1, k);
              ((TranslateCommentTextView)localObject1).qIE.ar(14.0F * com.tencent.mm.bq.a.dZ(((View)localObject1).getContext()));
              ((TranslateCommentTextView)localObject1).qSZ.setTextSize(1, 14.0F * com.tencent.mm.bq.a.dZ(((View)localObject1).getContext()));
            }
            localTranslateCommentTextView = (TranslateCommentTextView)localObject1;
            ((View)localObject1).setOnTouchListener(null);
            a(localTranslateCommentTextView.qSZ, (CharSequence)localObject3);
            if (!localb.hie)
            {
              localTranslateCommentTextView.qSZ.setTextSize(1, 14.0F * com.tencent.mm.bq.a.dZ(localTranslateCommentTextView.getContext()));
              localTranslateCommentTextView.qIE.vi(2);
              localTranslateCommentTextView.qIE.setVisibility(0);
              i = 1;
              ((View)localObject1).setBackgroundResource(i.e.pHE);
              if (k <= 0) {
                break label1227;
              }
              if (i == 0) {
                break label1201;
              }
              ((View)localObject1).setPadding(0, com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 2), 0, com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 7));
              if (i != 0)
              {
                localObject2 = (TranslateCommentTextView)localObject1;
                i = (int)this.mActivity.getResources().getDimension(i.d.aSq);
                ((TranslateCommentTextView)localObject2).qIE.qRc.setPadding(0, 0, i, 0);
              }
              ((View)localObject1).setOnLongClickListener(new View.OnLongClickListener()
              {
                public final boolean onLongClick(View paramAnonymousView)
                {
                  GMTrace.i(16145050501120L, 120290);
                  int[] arrayOfInt = new int[2];
                  if ((paramAnonymousView.getTag(i.f.cBY) instanceof int[])) {}
                  for (paramAnonymousView = (int[])paramAnonymousView.getTag(i.f.cBY);; paramAnonymousView = arrayOfInt)
                  {
                    a.this.qhj.kkG.a(localObject1, a.this.qhj.qgD.qVp, a.this.qhj.qgD.qVc, paramAnonymousView[0], paramAnonymousView[1]);
                    GMTrace.o(16145050501120L, 120290);
                    return true;
                  }
                }
              });
              ((View)localObject1).setOnClickListener(new com.tencent.mm.plugin.sns.ui.j.a(this.qhj.qPi, localbcz, str2, str3, paramc));
              if (localay != null) {
                ((View)localObject1).setTag(new com.tencent.mm.plugin.sns.ui.m(localay.qPZ, localbcz, str1, str3, (View)localObject1, 1));
              }
              if (m != 0) {
                localLinearLayout.addView((View)localObject1);
              }
              k += 1;
              j += 1;
              break;
              localObject1 = new TranslateCommentTextView(this.mActivity);
              ((TranslateCommentTextView)localObject1).qIE.ar(14.0F * com.tencent.mm.bq.a.dZ(((View)localObject1).getContext()));
              ((TranslateCommentTextView)localObject1).qSZ.setTextSize(1, 14.0F * com.tencent.mm.bq.a.dZ(((View)localObject1).getContext()));
              break label437;
              localObject2 = localLinearLayout.getChildAt(k);
              m = 0;
              continue;
            }
            if (!localb.hkX)
            {
              str4 = localb.result;
              str5 = localb.hpO;
              String str6 = localTranslateCommentTextView.qSZ.getText().toString();
              if (!com.tencent.mm.sdk.platformtools.bg.mZ(str6))
              {
                localObject2 = str6.split(":");
                if (localObject2.length <= 2) {
                  break label1282;
                }
                localObject3 = new String[2];
                localObject3[0] = localObject2[0];
                localObject3[1] = str6.substring(localObject3[0].length() + 1);
                localObject2 = localObject3;
              }
            }
          }
        }
      }
      label1068:
      label1201:
      label1227:
      label1282:
      for (;;)
      {
        if (localObject2.length == 2)
        {
          if (com.tencent.mm.sdk.platformtools.bg.mZ(str4)) {
            break label1068;
          }
          localTranslateCommentTextView.qIE.a(localb, 2, localObject2[0] + ": " + str4, str5, localb.qeR);
        }
        for (;;)
        {
          localTranslateCommentTextView.qIE.setVisibility(0);
          localTranslateCommentTextView.qSZ.setTextSize(1, 14.0F * com.tencent.mm.bq.a.dZ(localTranslateCommentTextView.getContext()));
          i = 1;
          break;
          localTranslateCommentTextView.qIE.a(localb, 2, null, str5, localb.qeR);
        }
        localTranslateCommentTextView.qIE.setVisibility(8);
        i = 1;
        break;
        localObject1 = localObject2;
        if (m == 0)
        {
          localObject1 = localObject2;
          if ((localObject2 instanceof TranslateCommentTextView))
          {
            localLinearLayout.removeView((View)localObject2);
            localObject1 = this.qhj.bnE();
            localLinearLayout.addView((View)localObject1, k);
            ((SnsCommentPreloadTextView)localObject1).J(14.0F * com.tencent.mm.bq.a.dZ(((View)localObject1).getContext()));
          }
        }
        ((View)localObject1).setOnTouchListener(new k(this.mActivity));
        a((View)localObject1, (CharSequence)localObject3);
        i = 0;
        break;
        ((View)localObject1).setPadding(0, com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 2), 0, com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 3));
        break label652;
        if (i != 0)
        {
          ((View)localObject1).setPadding(0, 1, 0, com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 7));
          break label652;
        }
        ((View)localObject1).setPadding(0, 1, 0, com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 3));
        break label652;
        GMTrace.o(8521483550720L, 63490);
        return true;
      }
    }
  }
  
  private void b(MaskTextView paramMaskTextView, com.tencent.mm.vending.d.b<com.tencent.mm.vending.j.a> paramb, int paramInt)
  {
    GMTrace.i(8521215115264L, 63488);
    if (paramb.size() == 0)
    {
      paramMaskTextView.setVisibility(8);
      GMTrace.o(8521215115264L, 63488);
      return;
    }
    paramMaskTextView.setVisibility(0);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(" ");
    int k = localSpannableStringBuilder.length() - 1;
    StringBuffer localStringBuffer = new StringBuffer();
    int[] arrayOfInt1 = new int[paramb.size()];
    int[] arrayOfInt2 = new int[paramb.size()];
    int j = 1;
    int i = 0;
    Object localObject;
    try
    {
      if (i < paramb.size())
      {
        localObject = (String)((com.tencent.mm.vending.j.a)paramb.get(i)).get(1);
        if (j != 0)
        {
          localSpannableStringBuilder.append(" ");
          localStringBuffer.append(" ");
          j = 0;
        }
        for (;;)
        {
          arrayOfInt1[i] = localSpannableStringBuilder.length();
          arrayOfInt1[i] += ((String)localObject).length();
          localStringBuffer.append((String)localObject);
          localSpannableStringBuilder.append(h.b(this.mActivity, (CharSequence)localObject, paramMaskTextView.getTextSize()));
          i += 1;
          break;
          localSpannableStringBuilder.append(", ");
          localStringBuffer.append(", ");
        }
      }
      localObject = this.mActivity.getResources().getDrawable(i.i.pQo);
    }
    catch (Exception paramMaskTextView)
    {
      w.e("MicroMsg.BaseTimeLineItem", "setReward error  e:%s", new Object[] { com.tencent.mm.sdk.platformtools.bg.f(paramMaskTextView) });
      GMTrace.o(8521215115264L, 63488);
      return;
    }
    ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
    d locald = new d((Drawable)localObject);
    locald.wSA = ((int)((((Drawable)localObject).getIntrinsicHeight() - paramMaskTextView.getTextSize() + com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 2)) / 2.0F));
    localSpannableStringBuilder.setSpan(locald, k, k + 1, 33);
    if (paramInt == 11)
    {
      paramInt = 3;
      break label447;
      while (i < arrayOfInt1.length)
      {
        localSpannableStringBuilder.setSpan(new com.tencent.mm.pluginsdk.ui.d.m((String)((com.tencent.mm.vending.j.a)paramb.get(i)).get(0), this.qhj.qHz, paramInt), arrayOfInt1[i], arrayOfInt2[i], 33);
        i += 1;
      }
      paramMaskTextView.setText(localSpannableStringBuilder, TextView.BufferType.SPANNABLE);
      paramMaskTextView.noa = localStringBuffer.toString();
      GMTrace.o(8521215115264L, 63488);
      return;
    }
    for (;;)
    {
      label447:
      i = 0;
      break;
      paramInt = 2;
    }
  }
  
  public static void e(c paramc)
  {
    GMTrace.i(8520812462080L, 63485);
    if ((paramc != null) && (paramc.qTK != null)) {
      paramc.qTK.setVisibility(8);
    }
    GMTrace.o(8520812462080L, 63485);
  }
  
  public final View a(Activity paramActivity, c paramc, int paramInt, av paramav, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8520409808896L, 63482);
    this.mActivity = paramActivity;
    this.kxh = paramInt;
    this.qhj = paramav;
    paramc.fMT = paramm.bjM();
    Object localObject;
    View localView;
    label151:
    int i;
    int j;
    int k;
    switch (paramInt)
    {
    default: 
      localObject = "R.layout.sns_media_sub_item2";
      localView = com.tencent.mm.kiss.a.b.xL().a(this.mActivity, (String)localObject, i.g.pPG);
      paramc.qUN = ((String)localObject);
      localObject = localView.findViewById(i.f.pJZ);
      if ((localObject instanceof ViewStub))
      {
        paramc.qTM = ((ViewStub)localObject);
        w.i("MicroMsg.BaseTimeLineItem", "create new item  " + paramInt + "  " + localView.hashCode());
        paramc.qUG = localView.findViewById(i.f.pNj);
        paramc.kxh = paramInt;
        paramc.iiL = ((MaskImageButton)localView.findViewById(i.f.pIj));
        paramc.iiL.setOnClickListener(paramav.qgD.qVd);
        paramc.iiL.setOnLongClickListener(paramav.qgD.qVe);
        paramc.iiL.setOnTouchListener(new View.OnTouchListener()
        {
          public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
          {
            GMTrace.i(15967346229248L, 118966);
            if (paramAnonymousMotionEvent.getAction() == 0)
            {
              int i = (int)paramAnonymousMotionEvent.getRawX();
              int j = (int)paramAnonymousMotionEvent.getRawY();
              paramAnonymousView.setTag(i.f.cBY, new int[] { i, j });
            }
            GMTrace.o(15967346229248L, 118966);
            return false;
          }
        });
        paramc.qTE = ((AsyncTextView)localView.findViewById(i.f.cgr));
        paramc.qTF = ((ImageView)localView.findViewById(i.f.pNC));
        paramc.qTE.setOnTouchListener(new ab());
        paramc.qTG = ((ViewGroup)localView.findViewById(i.f.pKD));
        paramc.qTH = ((AsyncNormalTextView)localView.findViewById(i.f.pJB));
        paramc.qTH.e(paramav.qPt);
        paramc.qTJ = ((TextView)localView.findViewById(i.f.pJA));
        paramc.qTJ.setClickable(false);
        paramc.qTJ.setLongClickable(false);
        paramc.qTI = ((TextView)localView.findViewById(i.f.pJz));
        paramc.qTI.setClickable(false);
        paramc.qTI.setLongClickable(false);
        paramc.qUO = localView.findViewById(i.f.pJi);
        paramc.qUP = ((Button)localView.findViewById(i.f.pJj));
        paramc.qUQ = ((Button)localView.findViewById(i.f.pJk));
        paramc.qUP.setOnClickListener(paramav.qgD.qVF);
        paramc.qUQ.setOnClickListener(paramav.qgD.qVG);
        paramc.qTL = ((LinearLayout)localView.findViewById(i.f.pKa));
        if (paramm.uF(32))
        {
          localObject = paramm.bjH();
          if ((localObject == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject).qlX != 1)) {
            break label1362;
          }
          paramInt = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
          i = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50);
          j = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50);
          k = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
          int m = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
          paramc.qTH.setContentWidth(paramInt - i - j - k - m);
          paramc.qTH.bkO();
        }
      }
      break;
    }
    for (;;)
    {
      paramc.qTL.setTag(paramc);
      paramc.qTL.setOnClickListener(paramav.qgD.qVH);
      localObject = localView.findViewById(i.f.bAy);
      paramav.kkG.c((View)localObject, paramav.qgD.qVf, paramav.qgD.qVc);
      localObject = (TextView)localView.findViewById(i.f.pJE);
      paramav.kkG.c((View)localObject, paramav.qgD.qVf, paramav.qgD.qVc);
      paramc.qTK = ((SnsTranslateResultView)localView.findViewById(i.f.pNo));
      paramc.qTK.setVisibility(8);
      paramc.qTK.qRc.setPadding(0, 0, (int)this.mActivity.getResources().getDimension(i.d.aSq), 0);
      paramc.qTK.pio.setBackgroundResource(i.e.pHw);
      paramav.kkG.c(paramc.qTK.pio, paramav.qgD.qVf, paramav.qgD.qVc);
      paramc.qUd = ((LinearLayout)localView.findViewById(i.f.pJo));
      paramc.qTS = ((TextView)localView.findViewById(i.f.pNM));
      paramc.lvy = ((TextView)localView.findViewById(i.f.pIX));
      paramc.qTT = ((AsyncTextView)localView.findViewById(i.f.pIh));
      paramc.qTU = ((AsyncTextView)localView.findViewById(i.f.pIg));
      paramc.qMW = ((TextView)localView.findViewById(i.f.pIi));
      paramc.pYc = new bf(localView);
      paramc.pYc.a(paramav.qgD.qVm, paramav.qgD.qVB);
      paramc.qBB = ((TextView)localView.findViewById(i.f.pIz));
      paramc.qBB.setText(paramActivity.getString(i.j.duY));
      paramc.qBB.setOnClickListener(paramav.qgD.qVg);
      paramc.qTT.setOnClickListener(paramav.qgD.qVC);
      paramc.qTU.setOnClickListener(paramav.qgD.qVD);
      paramc.qMW.setOnClickListener(paramav.qgD.qVy);
      paramc.qTW = localView.findViewById(i.f.pIB);
      paramc.qTW.setOnClickListener(paramav.qgD.qVl);
      paramc.qTV = ((TextView)localView.findViewById(i.f.pIA));
      paramc.qTX = ((ImageView)localView.findViewById(i.f.pIY));
      paramc.qUg = ((ViewStub)localView.findViewById(i.f.pIv));
      paramc.qwY = ((LinearLayout)localView.findViewById(i.f.pIT));
      paramc.qUI = ((ViewStub)localView.findViewById(i.f.pIC));
      paramc.qUi = ((ViewStub)localView.findViewById(i.f.pMR));
      paramc.qTO = ((TextView)localView.findViewById(i.f.pJS));
      paramc.qTO.setOnClickListener(paramav.qgD.qVh);
      paramc.qUM = ((TextView)localView.findViewById(i.f.pJW));
      paramc.msJ = localView;
      if (this.qGP)
      {
        com.tencent.mm.plugin.sns.abtest.c.b(localView, paramc);
        com.tencent.mm.plugin.sns.abtest.a.a(localView, paramc);
        ae.bhg();
        com.tencent.mm.plugin.sns.f.c.c(localView, paramc);
      }
      d(paramc);
      localView.setTag(paramc);
      a(paramc, paramm);
      GMTrace.o(8520409808896L, 63482);
      return localView;
      localObject = "R.layout.sns_timeline_item_photo_one3";
      break;
      localObject = "R.layout.sns_timeline_imagesline_one";
      break;
      localObject = "R.layout.sns_timeline_imagesline1";
      break;
      localObject = "R.layout.sns_timeline_imagesline2";
      break;
      localObject = "R.layout.sns_timeline_imagesline3";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_media_sight_item";
      break;
      localObject = "R.layout.sns_media_sub_item2";
      break;
      localObject = "R.layout.sns_hb_reward_item";
      break;
      paramc.qTM = null;
      break label151;
      label1362:
      if ((localObject != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject).qlX == 2))
      {
        paramInt = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
        i = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 50);
        j = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
        k = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
        paramc.qTH.setContentWidth(paramInt - i - j - k);
        paramc.qTH.bkO();
      }
    }
  }
  
  public final void a(c paramc, int paramInt, com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8521349332992L, 63489);
    paramm = paramm.bjL();
    a(paramc, paramInt, (ay)this.qhj.bnI().blH().get(Integer.valueOf(paramInt)), paramm, paramc.kxh, this.qhj);
    GMTrace.o(8521349332992L, 63489);
  }
  
  public final void a(c paramc, int paramInt1, com.tencent.mm.plugin.sns.storage.m paramm, bhc parambhc, int paramInt2, av paramav)
  {
    GMTrace.i(8520678244352L, 63484);
    Object localObject3 = (ay)paramav.bnI().blH().get(Integer.valueOf(paramInt1));
    a(paramc, paramm);
    this.kxh = paramInt2;
    this.qhj = paramav;
    if (this.qGP) {
      ax.B(paramm);
    }
    if (paramm.uF(32)) {
      w.i("MicroMsg.BaseTimeLineItem", "the ad sns id is " + com.tencent.mm.plugin.sns.data.i.dp(paramm.field_snsId) + " for susan");
    }
    paramc.qTC = ((ay)localObject3).qQa;
    paramc.mzq = false;
    paramc.position = paramInt1;
    paramc.fMT = ((ay)localObject3).qPZ;
    paramc.fxL = ((ay)localObject3).qAX;
    paramc.qTD = ((ay)localObject3).qQe;
    paramc.qTX.setOnClickListener(paramav.qPs);
    paramc.qUE = parambhc;
    bdk localbdk = ((ay)localObject3).pFT;
    paramc.pVG = localbdk;
    Object localObject1 = paramav.qPi.qxL.qek;
    Object localObject2;
    if (paramm != null)
    {
      localObject2 = paramm.bkg();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qks.add(localObject2);
      if (paramm.uF(32)) {
        ((com.tencent.mm.plugin.sns.h.b)localObject1).qkx.add(localObject2);
      }
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qky.add(paramm.field_userName);
    }
    label634:
    Object localObject4;
    Object localObject5;
    boolean bool1;
    Object localObject6;
    switch (paramm.field_type)
    {
    default: 
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qkD.add(localObject2);
      if (paramInt1 < ((com.tencent.mm.plugin.sns.h.b)localObject1).qkq)
      {
        ((com.tencent.mm.plugin.sns.h.b)localObject1).qkq = paramInt1;
        ((com.tencent.mm.plugin.sns.h.b)localObject1).qiW = com.tencent.mm.plugin.sns.data.i.g(paramm);
      }
      if (paramInt1 > ((com.tencent.mm.plugin.sns.h.b)localObject1).qkr)
      {
        ((com.tencent.mm.plugin.sns.h.b)localObject1).qkr = paramInt1;
        ((com.tencent.mm.plugin.sns.h.b)localObject1).qiX = com.tencent.mm.plugin.sns.data.i.g(paramm);
      }
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qjc = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkt.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qjd = ((com.tencent.mm.plugin.sns.h.b)localObject1).qku.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qje = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkv.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qjg = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkw.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qjf = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkx.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qjh = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkB.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qjp = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkC.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).kkz = ((com.tencent.mm.plugin.sns.h.b)localObject1).qky.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qja = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkz.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qjb = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkA.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qjo = ((com.tencent.mm.plugin.sns.h.b)localObject1).qkD.size();
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qiK = ((com.tencent.mm.plugin.sns.h.b)localObject1).qks.size();
      localObject1 = ((ay)localObject3).jqc;
      if (localObject1 != null)
      {
        paramc.qUF = ((ay)localObject3).qPY;
        if (((ay)localObject3).qQp)
        {
          w.i("MicroMsg.BaseTimeLineItem", "getContact %s", new Object[] { localObject1 });
          if (com.tencent.mm.pluginsdk.ui.a.b.bHN().oX() != null) {
            paramc.iiL.setImageBitmap(com.tencent.mm.pluginsdk.ui.a.b.bHN().oX());
          }
          ag.a.hfr.a((String)localObject1, "", new av.b(paramav.bnI(), paramInt1));
          paramc.iiL.setTag(localObject1);
          ((MaskImageButton)paramc.iiL).wLk = ((ay)localObject3).qAX;
          localObject2 = paramc.qTE;
          localObject4 = ((ay)localObject3).qQo;
          localObject5 = paramav.qHz;
          bool1 = ((ay)localObject3).qxx;
          localObject6 = ((ay)localObject3).qAX;
          boolean bool2 = ((ay)localObject3).qxx;
          ((AsyncTextView)localObject2).userName = ((String)localObject1);
          ((AsyncTextView)localObject2).qxw = ((String)localObject4);
          ((AsyncTextView)localObject2).kxh = paramInt2;
          ((AsyncTextView)localObject2).qxx = bool1;
          ((AsyncTextView)localObject2).qxy = ((String)localObject6);
          ((AsyncTextView)localObject2).qxz = ((m.a)localObject5);
          ((AsyncTextView)localObject2).qxA = bool2;
          ((AsyncTextView)localObject2).run();
        }
      }
      else
      {
        paramc.qTF.setVisibility(8);
        if (!((ay)localObject3).qxx) {
          break label2745;
        }
        paramc.pYb = true;
        paramc.mzq = ((ay)localObject3).qQf;
        paramc.iLj = ((ay)localObject3).qQg;
        label793:
        paramc.qUO.setVisibility(8);
        if ((paramc == null) || (!paramm.uF(32)) || (paramm.bjH() == null) || (paramm.bjH().qmi != 1)) {
          break label2832;
        }
        if (!com.tencent.mm.sdk.platformtools.bg.mZ(paramm.bjH().qmk)) {
          break label2760;
        }
        localObject1 = parambhc.uyr;
        label853:
        if (com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject1)) {
          break label2772;
        }
        paramc.qTJ.setText((String)localObject1 + " ");
        h.d(paramc.qTJ, 2);
        paramc.qTJ.setVisibility(0);
        label906:
        localObject1 = paramm.bjH().qmj;
        if (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject1)) {
          break label2784;
        }
        paramc.qTI.setVisibility(8);
        label932:
        if (paramm.bjH().bio())
        {
          paramc.qUO.setVisibility(0);
          paramc.qUP.setText(paramm.bjH().bik());
          paramc.qUQ.setText(paramm.bjH().bil());
        }
        label978:
        paramc.qTV.setOnTouchListener(new ab());
        a(paramc, paramInt1, (ay)localObject3, parambhc, paramInt2, paramav);
        paramav.qPk.put(Integer.valueOf(paramInt1), new WeakReference(paramc.msJ));
        if (paramc.msJ.getBackground() == null)
        {
          paramc.msJ.setBackgroundResource(i.e.aYc);
          paramInt1 = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 12);
          int i = com.tencent.mm.bq.a.fromDPToPix(this.mActivity, 8);
          paramc.msJ.setPadding(paramInt1, paramInt1, paramInt1, i);
        }
        paramc.lvy.setText(((ay)localObject3).qQh);
        paramc.qTT.setVisibility(8);
        paramc.qTU.setVisibility(8);
        if (((ay)localObject3).qxx)
        {
          localObject2 = ((ay)localObject3).qQi;
          paramc.qTT.setTag(((ay)localObject3).qAX);
          if (((ay)localObject3).qQi.qlj != com.tencent.mm.plugin.sns.storage.a.qkV) {
            break label2914;
          }
          if (com.tencent.mm.sdk.platformtools.bg.mZ(((ay)localObject3).qQl)) {
            break label2902;
          }
          paramc.qTT.setText(((ay)localObject3).qQl);
          paramc.qTT.setVisibility(0);
          label1185:
          if ((paramc.qTT.getVisibility() != 8) && (com.tencent.mm.sdk.platformtools.bg.mZ(((com.tencent.mm.plugin.sns.storage.a)localObject2).qll)))
          {
            paramc.qTT.setTextColor(this.mActivity.getResources().getColor(i.c.pGu));
            paramc.qTT.setOnClickListener(null);
          }
          if (paramm.bjL().uyu.tKe != 4) {
            break label3223;
          }
          paramc.qTU.setTag(paramc);
          paramc.qTU.setVisibility(0);
          paramc.qTU.setText(String.format("%s%s%s", new Object[] { this.mActivity.getResources().getString(i.j.pRz), ((ay)localObject3).qQo, this.mActivity.getResources().getString(i.j.pRA) }));
        }
        label1323:
        if (!((ay)localObject3).qQr) {
          break label3235;
        }
        localObject1 = paramav.fsU.getString(i.j.pRd, new Object[] { Integer.valueOf(((ay)localObject3).qQs) });
        paramc.qUM.setText((CharSequence)localObject1);
        paramc.qUM.setVisibility(0);
        label1376:
        paramc.qMW.setTag(((ay)localObject3).qAX);
        if (com.tencent.mm.sdk.platformtools.bg.mZ(((ay)localObject3).qQu)) {
          break label3254;
        }
        paramc.qMW.setVisibility(0);
        paramc.qMW.setText(((ay)localObject3).qQu);
        paramc.qMW.setClickable(((ay)localObject3).qQv);
        localObject1 = paramc.qMW;
        if (!((ay)localObject3).qQv) {
          break label3247;
        }
        paramInt1 = -11048043;
        label1449:
        ((TextView)localObject1).setTextColor(paramInt1);
        label1455:
        paramc.qTV.setTextColor(this.mActivity.getResources().getColor(i.c.aQn));
        if (!((ay)localObject3).qQw) {
          break label3266;
        }
        paramc.qTV.setVisibility(0);
        localObject2 = this.mActivity.getString(i.j.pRQ) + ((ay)localObject3).iTg;
        localObject1 = localObject2;
        if (((String)localObject2).length() > 10) {
          localObject1 = ((String)localObject2).substring(0, 10) + "...";
        }
        localObject1 = new SpannableString((CharSequence)localObject1);
        ((SpannableString)localObject1).setSpan(new b(), 0, ((SpannableString)localObject1).length(), 33);
        paramc.qTV.setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
        if ((!((ay)localObject3).qQy) && (!"wx7fa037cc7dfabad5".equals(parambhc.uyt.nas)))
        {
          paramc.qTV.setTextColor(this.mActivity.getResources().getColor(i.c.pGu));
          paramc.qTV.setOnTouchListener(null);
        }
        paramc.qTV.setTag(parambhc);
        label1673:
        if (!((ay)localObject3).qQq) {
          break label3567;
        }
        paramc.qBB.setVisibility(0);
        paramc.qBB.setTag(((ay)localObject3).qAX);
        label1701:
        paramc.qTX.setTag(paramc);
        if (!((ay)localObject3).qQC) {
          break label3666;
        }
        if (!paramc.qUm)
        {
          paramc.qUb = ((LinearLayout)paramc.qUi.inflate());
          paramc.qUc = paramc.msJ.findViewById(i.f.pKI);
          paramc.qUm = true;
          paramc.qUc.setTag(((ay)localObject3).qAX);
          paramc.qrk = ((TextView)paramc.qUb.findViewById(i.f.pKI));
        }
        paramc.qUi.setVisibility(0);
        paramc.qUc.setOnClickListener(paramav.qgD.qVk);
        switch (((ay)localObject3).qQD)
        {
        default: 
          paramc.qrk.setText(i.j.pTv);
          paramc.qUc.setClickable(true);
          paramc.qUc.setEnabled(true);
          label1874:
          parambhc = paramm.bjY();
          if ((parambhc != null) && (!com.tencent.mm.sdk.platformtools.bg.mZ(parambhc.uip))) {
            paramc.qrk.setText(parambhc.uip);
          }
          label1908:
          if (((ay)localObject3).qQE)
          {
            paramc.qTW.setVisibility(0);
            paramc.qTW.setTag(((ay)localObject3).qAX);
            label1936:
            if (!((ay)localObject3).qQF) {
              break label3788;
            }
            if (com.tencent.mm.sdk.platformtools.bg.mZ(((ay)localObject3).qQG)) {
              break label3727;
            }
            paramc.qTS.setVisibility(0);
            if (paramInt2 != 7) {
              break label3697;
            }
            parambhc = String.format(this.mActivity.getString(i.j.pUa), new Object[] { ((ay)localObject3).qQG });
            label1997:
            parambhc = h.b(this.mActivity, parambhc, paramc.qTS.getTextSize());
            paramc.qTS.setText(parambhc);
            label2024:
            if (!((ay)localObject3).qQI) {
              break label3800;
            }
            if (paramc.qUJ == null)
            {
              paramc.qUJ = paramc.qUI.inflate();
              paramc.pZC = ((TextView)paramc.qUJ.findViewById(i.f.pID));
              paramc.qUK = ((MaskTextView)paramc.qUJ.findViewById(i.f.pIE));
              paramc.qUK.setOnTouchListener(new ab());
            }
            paramc.qUJ.setVisibility(0);
            b(paramc.qUK, ((ay)localObject3).qQL, paramInt2);
            parambhc = this.mActivity.getString(i.j.pTc, new Object[] { Integer.valueOf(((ay)localObject3).qQJ), com.tencent.mm.sdk.platformtools.bg.r(((ay)localObject3).qQK / 100.0D) });
            paramc.pZC.setText(parambhc);
            paramc.qUJ.setTag(paramm);
            paramc.qUJ.setOnClickListener(paramav.qgD.qVo);
            label2195:
            if (((((ay)localObject3).qQM != null) && (((ay)localObject3).qQM.size() != 0)) || ((((ay)localObject3).qQN != null) && (((ay)localObject3).qQN.size() != 0))) {
              break label3838;
            }
            if (paramc.qwY == null) {
              break label3819;
            }
            paramc.qwY.setVisibility(8);
            label2249:
            if (!((ay)localObject3).qQO) {
              break label4131;
            }
            paramc.qTO.setTag(((ay)localObject3).qAX);
            paramc.qTO.setText(((ay)localObject3).qQP);
            paramc.qTO.setVisibility(0);
            label2289:
            if (!((ay)localObject3).qxx) {
              break label4148;
            }
            w.i("MicroMsg.BaseTimeLineItem", "adatag " + ((ay)localObject3).qQk);
            paramc.pYc.p(Long.valueOf(((ay)localObject3).qQa), new com.tencent.mm.plugin.sns.data.b(paramc.pYc, paramc.position, ((ay)localObject3).qAX, ((ay)localObject3).qQa));
            paramc.pYc.a(((ay)localObject3).qQj, ((ay)localObject3).qQi);
            paramc.pYc.setVisibility(0);
            if ((paramc.qMW != null) && (paramc.qMW.getVisibility() == 0))
            {
              if (paramc.pYc.qSj.getVisibility() != 0) {
                break label4143;
              }
              paramInt1 = 1;
              label2421:
              if (paramInt1 != 0)
              {
                paramm = (LinearLayout.LayoutParams)paramc.qMW.getLayoutParams();
                paramm.setMargins(paramm.leftMargin, BackwardSupportUtil.b.a(this.mActivity, 0.0F), paramm.rightMargin, paramm.bottomMargin);
                paramc.qMW.setLayoutParams(paramm);
              }
            }
          }
          break;
        }
      }
      break;
    }
    for (;;)
    {
      if (this.qGP) {
        ae.bhg().a(this.mActivity, localbdk, paramc);
      }
      paramm = new as(((ay)localObject3).qPZ, ((ay)localObject3).qAX, false, true, 1);
      paramc.qTK.pio.setTag(paramm);
      paramm = com.tencent.mm.ui.a.a.a.vsW;
      parambhc = paramc.msJ;
      paramav = paramc.qTE;
      localObject3 = paramc.lvy;
      localObject1 = paramc.qTH.content;
      localObject2 = paramc.qTQ;
      bool1 = paramc.qUC;
      if (!paramm.bVt()) {
        break label4236;
      }
      if ((paramm.sS != null) && (parambhc != null) && (paramav != null) && (!com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject1)) && (localObject3 != null)) {
        break label4160;
      }
      GMTrace.o(8520678244352L, 63484);
      return;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qku.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qkt.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qkw.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qkv.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qkB.add(localObject2);
      break;
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qkC.add(localObject2);
      break;
      if (!com.tencent.mm.sdk.platformtools.bg.mZ(parambhc.uyv))
      {
        ((com.tencent.mm.plugin.sns.h.b)localObject1).qkz.add(localObject2);
        break;
      }
      ((com.tencent.mm.plugin.sns.h.b)localObject1).qkA.add(localObject2);
      break;
      com.tencent.mm.pluginsdk.ui.a.b.a(paramc.iiL, (String)localObject1);
      break label634;
      label2745:
      paramc.pYb = false;
      paramc.iLj = "";
      break label793;
      label2760:
      localObject1 = paramm.bjH().qmk;
      break label853;
      label2772:
      paramc.qTJ.setVisibility(8);
      break label906;
      label2784:
      paramc.qTI.setText((String)localObject1 + " ");
      h.d(paramc.qTI, 2);
      paramc.qTI.setVisibility(0);
      break label932;
      label2832:
      localObject1 = paramc.qTH;
      localObject2 = ((ay)localObject3).qQb;
      ((AsyncNormalTextView)localObject1).qxu = ((ay)localObject3).qQc;
      ((AsyncNormalTextView)localObject1).content = ((String)localObject2);
      ((AsyncNormalTextView)localObject1).qhj = paramav;
      ((AsyncNormalTextView)localObject1).qxv = ((ay)localObject3);
      if (com.tencent.mm.sdk.platformtools.bg.mZ((String)localObject2)) {
        ((AsyncNormalTextView)localObject1).setVisibility(8);
      }
      paramc.qTH.c(paramc);
      break label978;
      label2902:
      paramc.qTT.setVisibility(8);
      break label1185;
      label2914:
      if (((com.tencent.mm.plugin.sns.storage.a)localObject2).qlj != com.tencent.mm.plugin.sns.storage.a.qkW) {
        break label1185;
      }
      if (!com.tencent.mm.sdk.platformtools.bg.mZ(((ay)localObject3).qQm))
      {
        localObject1 = ((ay)localObject3).qQn;
        localObject4 = ((ay)localObject3).qQm;
        localObject5 = this.mActivity;
        paramc.qTT.getTextSize();
        localObject5 = new com.tencent.mm.pluginsdk.ui.d.i(h.d((Context)localObject5, (CharSequence)localObject4, 1));
        ((com.tencent.mm.pluginsdk.ui.d.i)localObject5).f(null, (CharSequence)localObject4);
        localObject4 = paramc.qTT.getPaint();
        float f = Layout.getDesiredWidth((CharSequence)localObject5, 0, ((com.tencent.mm.pluginsdk.ui.d.i)localObject5).length(), (TextPaint)localObject4);
        if (com.tencent.mm.bq.a.X(this.mActivity, (int)f) > paramc.qHH)
        {
          do
          {
            if (((String)localObject1).length() <= 1) {
              break;
            }
            localObject1 = ((String)localObject1).substring(0, ((String)localObject1).length() - 2);
            localObject5 = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject2).qlk, new Object[] { (String)localObject1 + "..." });
            localObject6 = this.mActivity;
            paramc.qTT.getTextSize();
            localObject6 = new com.tencent.mm.pluginsdk.ui.d.i(h.d((Context)localObject6, (CharSequence)localObject5, 1));
            ((com.tencent.mm.pluginsdk.ui.d.i)localObject6).f(null, (CharSequence)localObject5);
            f = Layout.getDesiredWidth((CharSequence)localObject6, 0, ((com.tencent.mm.pluginsdk.ui.d.i)localObject6).length(), (TextPaint)localObject4);
            paramInt1 = com.tencent.mm.bq.a.X(this.mActivity, (int)f);
            paramc.qTT.setText((CharSequence)localObject6, TextView.BufferType.SPANNABLE);
            paramc.qTT.setVisibility(0);
          } while (paramInt1 > paramc.qHH);
          break label1185;
        }
        paramc.qTT.setText((CharSequence)localObject5, TextView.BufferType.SPANNABLE);
        paramc.qTT.setVisibility(0);
        break label1185;
      }
      paramc.qTT.setVisibility(8);
      break label1185;
      label3223:
      paramc.qTU.setVisibility(8);
      break label1323;
      label3235:
      paramc.qUM.setVisibility(8);
      break label1376;
      label3247:
      paramInt1 = -9211021;
      break label1449;
      label3254:
      paramc.qMW.setVisibility(8);
      break label1455;
      label3266:
      if (((ay)localObject3).qQx)
      {
        paramc.qTV.setVisibility(0);
        parambhc = new SpannableString(((ay)localObject3).qQA);
        parambhc.setSpan(new d(), 0, parambhc.length(), 33);
        paramc.qTV.setText(parambhc, TextView.BufferType.SPANNABLE);
        paramc.qTV.setTag(new bd(((ay)localObject3).qQz, ((ay)localObject3).qQA));
        break label1673;
      }
      if (((ay)localObject3).qQB)
      {
        paramc.qTV.setVisibility(0);
        localObject1 = this.mActivity.getString(i.j.pQS);
        localObject2 = (String)localObject1 + ((ay)localObject3).iTg;
        localObject4 = new SpannableString((CharSequence)localObject2);
        ((SpannableString)localObject4).setSpan(new ForegroundColorSpan(this.mActivity.getResources().getColor(i.c.pGu)), 0, ((String)localObject1).length(), 33);
        ((SpannableString)localObject4).setSpan(new a(), ((String)localObject1).length(), ((String)localObject2).length(), 33);
        paramc.qTV.setText((CharSequence)localObject4, TextView.BufferType.SPANNABLE);
        if ((!((ay)localObject3).qQy) && (!"wx7fa037cc7dfabad5".equals(parambhc.uyt.nas)))
        {
          paramc.qTV.setTextColor(this.mActivity.getResources().getColor(i.c.pGu));
          paramc.qTV.setOnTouchListener(null);
        }
        paramc.qTV.setTag(parambhc);
        break label1673;
      }
      paramc.qTV.setVisibility(8);
      break label1673;
      label3567:
      paramc.qBB.setVisibility(8);
      break label1701;
      paramc.qrk.setText(i.j.pTs);
      paramc.qUc.setClickable(false);
      paramc.qUc.setEnabled(false);
      break label1874;
      paramc.qrk.setText(i.j.pTu);
      paramc.qUc.setClickable(false);
      paramc.qUc.setEnabled(false);
      break label1874;
      paramc.qrk.setText(i.j.pTt);
      paramc.qUc.setClickable(true);
      paramc.qUc.setEnabled(true);
      break label1874;
      label3666:
      if (!paramc.qUm) {
        break label1908;
      }
      paramc.qUi.setVisibility(8);
      break label1908;
      paramc.qTW.setVisibility(8);
      break label1936;
      label3697:
      parambhc = String.format(this.mActivity.getString(i.j.pUb), new Object[] { ((ay)localObject3).qQG });
      break label1997;
      label3727:
      if (((ay)localObject3).qQH)
      {
        paramc.qTS.setVisibility(0);
        parambhc = this.mActivity.getString(i.j.pUc);
        parambhc = h.b(this.mActivity, parambhc.toString(), paramc.qTS.getTextSize());
        paramc.qTS.setText(parambhc);
        break label2024;
      }
      label3788:
      paramc.qTS.setVisibility(8);
      break label2024;
      label3800:
      if (paramc.qUJ == null) {
        break label2195;
      }
      paramc.qUJ.setVisibility(8);
      break label2195;
      label3819:
      if (!paramc.qUh) {
        break label2249;
      }
      paramc.qUg.setVisibility(8);
      break label2249;
      label3838:
      if (!paramc.qUh)
      {
        if (paramc.qwY == null) {
          paramc.qwY = ((LinearLayout)paramc.qUg.inflate());
        }
        paramc.qTZ = ((MaskTextView)paramc.qwY.findViewById(i.f.pIR));
        paramc.qTZ.setOnTouchListener(new ab());
        paramc.qUa = ((LinearLayout)paramc.msJ.findViewById(i.f.pIs));
        paramc.qwY.setTag(((ay)localObject3).qPZ);
        paramc.qTZ.setTag(((ay)localObject3).qPZ);
        paramc.qUf = paramc.qwY.findViewById(i.f.pIV);
        paramc.qUL = paramc.qwY.findViewById(i.f.pIT);
        paramc.qUh = true;
      }
      paramc.qwY.setVisibility(0);
      if ((((ay)localObject3).qQM != null) && (((ay)localObject3).qQM.size() > 0))
      {
        paramc.qTZ.setVisibility(0);
        a(paramc.qTZ, ((ay)localObject3).qQM, paramInt2);
        label4022:
        if (((ay)localObject3).qQN == null) {
          break label4107;
        }
        a(localbdk.uvl, ((ay)localObject3).qQN, paramc);
      }
      for (;;)
      {
        if ((((ay)localObject3).qQM == null) || (((ay)localObject3).qQM.size() == 0) || (((ay)localObject3).qQN == null) || (((ay)localObject3).qQN.size() == 0)) {
          break label4119;
        }
        paramc.qUf.setVisibility(0);
        break;
        paramc.qTZ.setVisibility(8);
        break label4022;
        label4107:
        paramc.qUa.setVisibility(8);
      }
      label4119:
      paramc.qUf.setVisibility(8);
      break label2249;
      label4131:
      paramc.qTO.setVisibility(8);
      break label2289;
      label4143:
      paramInt1 = 0;
      break label2421;
      label4148:
      paramc.pYc.setVisibility(8);
    }
    label4160:
    paramc = new com.tencent.mm.ui.a.b();
    paramc.Ur(paramav.getText().toString());
    paramc.Ur((String)localObject1);
    if (localObject2 != null) {
      paramc.Ur(((TextView)localObject2).getText().toString());
    }
    if (bool1) {
      paramc.Ur(paramm.sS.getString(a.k.gYF));
    }
    paramc.db(parambhc);
    label4236:
    GMTrace.o(8520678244352L, 63484);
  }
  
  public abstract void a(c paramc, int paramInt1, ay paramay, bhc parambhc, int paramInt2, av paramav);
  
  public abstract void d(c paramc);
  
  public final void ie(boolean paramBoolean)
  {
    GMTrace.i(8520141373440L, 63480);
    this.qGP = paramBoolean;
    GMTrace.o(8520141373440L, 63480);
  }
  
  final class a
    extends com.tencent.mm.pluginsdk.ui.d.m
  {
    a()
    {
      GMTrace.i(8522423074816L, 63497);
      GMTrace.o(8522423074816L, 63497);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(8522557292544L, 63498);
      a.this.qhj.qHC.qSD.onClick(paramView);
      GMTrace.o(8522557292544L, 63498);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(8522691510272L, 63499);
      int i = a.this.mActivity.getResources().getColor(i.c.aQm);
      if (this.nSV)
      {
        paramTextPaint.bgColor = i;
        GMTrace.o(8522691510272L, 63499);
        return;
      }
      paramTextPaint.bgColor = 0;
      GMTrace.o(8522691510272L, 63499);
    }
  }
  
  final class b
    extends com.tencent.mm.pluginsdk.ui.d.m
  {
    b()
    {
      GMTrace.i(8518799196160L, 63470);
      GMTrace.o(8518799196160L, 63470);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(8518933413888L, 63471);
      a.this.qhj.qHC.qSt.onClick(paramView);
      GMTrace.o(8518933413888L, 63471);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(8519067631616L, 63472);
      int i = a.this.mActivity.getResources().getColor(i.c.aQm);
      if (this.nSV)
      {
        paramTextPaint.bgColor = i;
        GMTrace.o(8519067631616L, 63472);
        return;
      }
      paramTextPaint.bgColor = 0;
      GMTrace.o(8519067631616L, 63472);
    }
  }
  
  public static class c
  {
    public String fMT;
    public String fxL;
    public String iLj;
    public ImageView iiL;
    public TextView iin;
    public int kxh;
    public TextView lvy;
    public View msJ;
    public boolean mzq;
    public bdk pVG;
    public boolean pYb;
    public bf pYc;
    public TextView pZC;
    public int position;
    public TextView qBB;
    public int qHH;
    public TextView qMW;
    public View qNb;
    public long qTC;
    public int qTD;
    public AsyncTextView qTE;
    public ImageView qTF;
    public ViewGroup qTG;
    public AsyncNormalTextView qTH;
    public TextView qTI;
    public TextView qTJ;
    public SnsTranslateResultView qTK;
    public LinearLayout qTL;
    public ViewStub qTM;
    public boolean qTN;
    public TextView qTO;
    public TagImageView qTP;
    public TextView qTQ;
    public int qTR;
    public TextView qTS;
    public AsyncTextView qTT;
    public AsyncTextView qTU;
    public TextView qTV;
    public View qTW;
    public ImageView qTX;
    public View qTY;
    public MaskTextView qTZ;
    public boolean qUA;
    ViewStub qUB;
    boolean qUC;
    public ak qUD;
    public bhc qUE;
    public com.tencent.mm.l.a qUF;
    public View qUG;
    public a qUH;
    public ViewStub qUI;
    public View qUJ;
    public MaskTextView qUK;
    public View qUL;
    public TextView qUM;
    public String qUN;
    public View qUO;
    public Button qUP;
    public Button qUQ;
    public LinearLayout qUa;
    public LinearLayout qUb;
    public View qUc;
    public LinearLayout qUd;
    public PhotosContent qUe;
    public View qUf;
    public ViewStub qUg;
    public boolean qUh;
    public ViewStub qUi;
    public ViewStub qUj;
    public View qUk;
    public boolean qUl;
    public boolean qUm;
    public ViewStub qUn;
    public boolean qUo;
    public View qUp;
    public LinearLayout qUq;
    public TextView qUr;
    public ViewStub qUs;
    public boolean qUt;
    public View qUu;
    public LinearLayout qUv;
    public ViewStub qUw;
    public boolean qUx;
    public View qUy;
    public ImageView qUz;
    public TextView qrk;
    public amo qvb;
    public LinearLayout qwY;
    public ImageView qxB;
    
    public c()
    {
      GMTrace.i(8524167905280L, 63510);
      this.qTN = false;
      this.qTR = 0;
      this.qHH = 210;
      this.qUh = false;
      this.qUk = null;
      this.qUl = false;
      this.qUm = false;
      this.qUo = false;
      this.qUt = false;
      this.qUx = false;
      this.qUA = false;
      this.qUC = false;
      this.qUD = new ak();
      GMTrace.o(8524167905280L, 63510);
    }
  }
  
  final class d
    extends com.tencent.mm.pluginsdk.ui.d.m
  {
    d()
    {
      GMTrace.i(8517457018880L, 63460);
      GMTrace.o(8517457018880L, 63460);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(8517591236608L, 63461);
      a.this.qhj.qHC.qSu.onClick(paramView);
      GMTrace.o(8517591236608L, 63461);
    }
    
    public final void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(8517725454336L, 63462);
      int i = a.this.mActivity.getResources().getColor(i.c.aQm);
      if (this.nSV)
      {
        paramTextPaint.bgColor = i;
        GMTrace.o(8517725454336L, 63462);
        return;
      }
      paramTextPaint.bgColor = 0;
      GMTrace.o(8517725454336L, 63462);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */