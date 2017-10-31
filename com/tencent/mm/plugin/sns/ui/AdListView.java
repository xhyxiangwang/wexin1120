package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelstat.o.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.d;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.e;
import com.tencent.mm.plugin.sns.model.f;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.protocal.c.bfi;
import com.tencent.mm.protocal.c.bfj;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;

public class AdListView
  extends ListView
{
  com.tencent.mm.plugin.sns.a.b.b qwp;
  f qwq;
  e qwr;
  private boolean qws;
  private HashSet<String> qwt;
  
  public AdListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8547387572224L, 63683);
    this.qws = true;
    this.qwt = new HashSet();
    GMTrace.o(8547387572224L, 63683);
  }
  
  public AdListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8547253354496L, 63682);
    this.qws = true;
    this.qwt = new HashSet();
    GMTrace.o(8547253354496L, 63682);
  }
  
  protected void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    GMTrace.i(8548058660864L, 63688);
    super.attachViewToParent(paramView, paramInt, paramLayoutParams);
    Object localObject = "";
    paramLayoutParams = (ViewGroup.LayoutParams)localObject;
    if (paramView.getTag() != null)
    {
      paramLayoutParams = (ViewGroup.LayoutParams)localObject;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject = (a.c)paramView.getTag();
        paramLayoutParams = ((a.c)localObject).position + " " + ((a.c)localObject).fxL;
        d.qkP.Hm(((a.c)localObject).qUE.nas);
        if ((this.qwp != null) && (((a.c)localObject).pYb)) {
          this.qwp.a(((a.c)localObject).position, ((a.c)localObject).fxL, ((a.c)localObject).iLj, ((a.c)localObject).mzq, paramView, ((a.c)localObject).qTC, ((a.c)localObject).pYc, ((a.c)localObject).pVG, ((a.c)localObject).kxh, 1);
        }
        if ((!this.qwt.contains(((a.c)localObject).fMT)) && (((((a.c)localObject).pYb) && (((a.c)localObject).qUE.uyu.tKc == 15)) || (((a.c)localObject).qUE.uyu.tKc == 18)))
        {
          boolean bool2 = false;
          boolean bool1 = bool2;
          if (((a.c)localObject).qUE.uyu.tKc == 15)
          {
            bool1 = bool2;
            if ((((a.c)localObject).qUD.pDA instanceof SightPlayImageView)) {
              bool1 = ((SightPlayImageView)((a.c)localObject).qUD.pDA).pCn.beD();
            }
          }
          j.a(ae.bhp().Hz(((a.c)localObject).fMT), false, bool1);
          this.qwt.add(((a.c)localObject).fMT);
        }
        if (this.qwq != null) {
          this.qwq.a(((a.c)localObject).fxL, ((a.c)localObject).qUE);
        }
        if (this.qwr != null) {
          this.qwr.a(((a.c)localObject).position, ((a.c)localObject).fxL, ((a.c)localObject).qTC, ((a.c)localObject).iLj, ((a.c)localObject).qUE, ((a.c)localObject).pYb, ((a.c)localObject).pYc);
        }
      }
    }
    if (r.icO) {
      w.d("MicroMsg.AdListView", "3childview  onAdded " + paramLayoutParams + " count:" + getChildCount());
    }
    GMTrace.o(8548058660864L, 63688);
  }
  
  protected void detachViewFromParent(int paramInt)
  {
    GMTrace.i(8547924443136L, 63687);
    if (r.icO) {
      w.d("MicroMsg.AdListView", "2childview  onRemoved " + paramInt + " count:" + getChildCount());
    }
    super.detachViewFromParent(paramInt);
    GMTrace.o(8547924443136L, 63687);
  }
  
  protected void detachViewFromParent(View paramView)
  {
    GMTrace.i(8547790225408L, 63686);
    String str = "";
    Object localObject = str;
    if (paramView.getTag() != null)
    {
      localObject = str;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject = (a.c)paramView.getTag();
        localObject = ((a.c)localObject).position + " " + ((a.c)localObject).fxL;
      }
    }
    if (r.icO) {
      w.d("MicroMsg.AdListView", "1childview  onRemoved " + (String)localObject + " count:" + getChildCount());
    }
    super.detachViewFromParent(paramView);
    GMTrace.o(8547790225408L, 63686);
  }
  
  protected void detachViewsFromParent(int paramInt1, int paramInt2)
  {
    GMTrace.i(8548729749504L, 63693);
    int i = paramInt1;
    while (i < paramInt1 + paramInt2)
    {
      View localView = getChildAt(i);
      String str = "";
      Object localObject = str;
      if (localView.getTag() != null)
      {
        localObject = str;
        if ((localView.getTag() instanceof a.c))
        {
          localObject = (a.c)localView.getTag();
          if ((this.qwp != null) && (((a.c)localObject).pYb)) {
            this.qwp.q(((a.c)localObject).position, ((a.c)localObject).fxL, ((a.c)localObject).iLj);
          }
          if (this.qwq != null) {
            this.qwq.Gr(((a.c)localObject).fxL);
          }
          if (this.qwr != null) {
            this.qwr.a(((a.c)localObject).position, ((a.c)localObject).fxL, ((a.c)localObject).qTC, ((a.c)localObject).iLj, ((a.c)localObject).qUE, ((a.c)localObject).pYb);
          }
          localObject = ((a.c)localObject).position + " " + ((a.c)localObject).fxL;
        }
      }
      if (r.icO) {
        w.d("MicroMsg.AdListView", "8removeView  detachViewsFromParent " + (String)localObject + " count:" + getChildCount());
      }
      i += 1;
    }
    super.detachViewsFromParent(paramInt1, paramInt2);
    GMTrace.o(8548729749504L, 63693);
  }
  
  protected void layoutChildren()
  {
    GMTrace.i(8547521789952L, 63684);
    super.layoutChildren();
    GMTrace.o(8547521789952L, 63684);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8547656007680L, 63685);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8547656007680L, 63685);
  }
  
  public void onViewAdded(View paramView)
  {
    GMTrace.i(8548192878592L, 63689);
    Object localObject2 = "";
    Object localObject1 = localObject2;
    if (paramView.getTag() != null)
    {
      localObject1 = localObject2;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject2 = (a.c)paramView.getTag();
        localObject1 = ((a.c)localObject2).position + " " + ((a.c)localObject2).fxL;
        d.qkP.Hm(((a.c)localObject2).qUE.nas);
        if ((this.qwp != null) && (((a.c)localObject2).pYb)) {
          this.qwp.a(((a.c)localObject2).position, ((a.c)localObject2).fxL, ((a.c)localObject2).iLj, ((a.c)localObject2).mzq, paramView, ((a.c)localObject2).qTC, ((a.c)localObject2).pYc, ((a.c)localObject2).pVG, ((a.c)localObject2).kxh, 1);
        }
        if ((!this.qwt.contains(((a.c)localObject2).fMT)) && (((((a.c)localObject2).pYb) && (((a.c)localObject2).qUE.uyu.tKc == 15)) || (((a.c)localObject2).qUE.uyu.tKc == 18)))
        {
          boolean bool2 = false;
          boolean bool1 = bool2;
          if (((a.c)localObject2).qUE.uyu.tKc == 15)
          {
            bool1 = bool2;
            if ((((a.c)localObject2).qUD.pDA instanceof SightPlayImageView)) {
              bool1 = ((SightPlayImageView)((a.c)localObject2).qUD.pDA).pCn.beD();
            }
          }
          j.a(ae.bhp().Hz(((a.c)localObject2).fMT), false, bool1);
          this.qwt.add(((a.c)localObject2).fMT);
        }
        if (this.qwq != null) {
          this.qwq.a(((a.c)localObject2).fxL, ((a.c)localObject2).qUE);
        }
        if (this.qwr != null) {
          this.qwr.a(((a.c)localObject2).position, ((a.c)localObject2).fxL, ((a.c)localObject2).qTC, ((a.c)localObject2).iLj, ((a.c)localObject2).qUE, ((a.c)localObject2).pYb, ((a.c)localObject2).pYc);
        }
      }
    }
    if (r.icO) {
      w.d("MicroMsg.AdListView", "4childview  onViewAdded " + (String)localObject1 + " count:" + getChildCount());
    }
    GMTrace.o(8548192878592L, 63689);
  }
  
  public void onViewRemoved(View paramView)
  {
    GMTrace.i(8548327096320L, 63690);
    String str = "";
    Object localObject1 = str;
    Object localObject2;
    int i;
    Object localObject3;
    bfi localbfi;
    if (paramView.getTag() != null)
    {
      localObject1 = str;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject2 = (a.c)paramView.getTag();
        paramView = ((a.c)localObject2).position + " " + ((a.c)localObject2).fxL;
        if ((this.qwp != null) && (((a.c)localObject2).pYb)) {
          this.qwp.q(((a.c)localObject2).position, ((a.c)localObject2).fxL, ((a.c)localObject2).iLj);
        }
        if (this.qwq != null) {
          this.qwq.Gr(((a.c)localObject2).fxL);
        }
        if (this.qwr != null) {
          this.qwr.a(((a.c)localObject2).position, ((a.c)localObject2).fxL, ((a.c)localObject2).qTC, ((a.c)localObject2).iLj, ((a.c)localObject2).qUE, ((a.c)localObject2).pYb);
        }
        if (((a.c)localObject2).qUE.uyu.tKc != 3) {
          break label483;
        }
        localObject1 = ae.bhp().Hz(((a.c)localObject2).fMT);
        if (localObject1 != null) {
          break label337;
        }
        i = 0;
        localObject1 = o.a.hRF;
        str = ((a.c)localObject2).qUE.qBT;
        localObject2 = i.jdMethod_do(((a.c)localObject2).qTC);
        if (bg.mZ(str)) {
          break label483;
        }
        localObject3 = Base64.decode(str, 0);
        localbfi = new bfi();
      }
    }
    for (;;)
    {
      try
      {
        localbfi.aC((byte[])localObject3);
        localObject3 = localbfi.uxt;
        if (localObject3 != null) {
          continue;
        }
        localObject1 = paramView;
      }
      catch (Exception localException)
      {
        label337:
        w.printErrStackTrace("MicroMsg.SnsStatExtUtil", localException, "", new Object[0]);
        localView = paramView;
        continue;
        w.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235): scene(%d), statExtStr:%s(id=%s, uxinfo=%s)", new Object[] { Integer.valueOf(localView.value), str, localbfi.uxt.uxw, localbfi.uxt.uxx });
        ((c)h.h(c.class)).a(13235, i, new Object[] { localView.value, localbfi.uxt.uxw, localbfi.uxt.uxx, localObject2 });
      }
      if (r.icO) {
        w.d("MicroMsg.AdListView", "5childview  onViewRemoved " + (String)localObject1 + " count:" + getChildCount());
      }
      GMTrace.o(8548327096320L, 63690);
      return;
      i = ((m)localObject1).bkt();
      break;
      label483:
      View localView = paramView;
    }
  }
  
  public void removeView(View paramView)
  {
    GMTrace.i(8548595531776L, 63692);
    super.removeView(paramView);
    String str2 = "";
    String str1 = str2;
    if (paramView.getTag() != null)
    {
      str1 = str2;
      if ((paramView.getTag() instanceof a.c))
      {
        paramView = (a.c)paramView.getTag();
        str1 = paramView.position + " " + paramView.fxL;
      }
    }
    if (r.icO) {
      w.d("MicroMsg.AdListView", "7removeView  onViewRemoved " + str1 + " count:" + getChildCount());
    }
    GMTrace.o(8548595531776L, 63692);
  }
  
  public void removeViewInLayout(View paramView)
  {
    GMTrace.i(8548461314048L, 63691);
    String str = "";
    Object localObject = str;
    if (paramView.getTag() != null)
    {
      localObject = str;
      if ((paramView.getTag() instanceof a.c))
      {
        localObject = (a.c)paramView.getTag();
        localObject = ((a.c)localObject).position + " " + ((a.c)localObject).fxL;
      }
    }
    if (r.icO) {
      w.d("MicroMsg.AdListView", "6removeViewInLayout  onViewRemoved " + (String)localObject + " count:" + getChildCount());
    }
    super.removeViewInLayout(paramView);
    GMTrace.o(8548461314048L, 63691);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/AdListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */