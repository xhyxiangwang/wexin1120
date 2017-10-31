package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.widget.QFadeImageView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ar
{
  public static int[] qLA;
  public static int[] qLB;
  static double qLC;
  static double qLD;
  static double qLE;
  static double qLF;
  static double qLG;
  public static int[] qLx;
  public static int[] qLy;
  public static int[] qLz;
  private Context context;
  private LinkedList<LinearLayout> qLH;
  
  static
  {
    GMTrace.i(8482694627328L, 63201);
    qLx = new int[] { 0, 0, 1, 3, 6, 9 };
    qLy = new int[] { i.f.pIF };
    qLz = new int[] { i.f.pIF, i.f.pIG, i.f.pIH };
    qLA = new int[] { i.f.pIF, i.f.pIG, i.f.pIH, i.f.pII, i.f.pIJ, i.f.pIK };
    qLB = new int[] { i.f.pIF, i.f.pIG, i.f.pIH, i.f.pII, i.f.pIJ, i.f.pIK, i.f.pIL, i.f.pIM, i.f.pIN };
    qLC = -1.0D;
    qLD = -1.0D;
    qLE = -1.0D;
    qLF = -1.0D;
    qLG = -1.0D;
    GMTrace.o(8482694627328L, 63201);
  }
  
  public ar(Context paramContext)
  {
    GMTrace.i(8481755103232L, 63194);
    this.qLH = new LinkedList();
    this.context = paramContext;
    GMTrace.o(8481755103232L, 63194);
  }
  
  public ar(Context paramContext, byte paramByte)
  {
    GMTrace.i(8481889320960L, 63195);
    this.qLH = new LinkedList();
    this.context = paramContext;
    GMTrace.o(8481889320960L, 63195);
  }
  
  private static void a(amn paramamn, QFadeImageView paramQFadeImageView, int paramInt, an paraman)
  {
    GMTrace.i(8482291974144L, 63198);
    ae.bhm().b(paramamn, paramQFadeImageView, paramInt, paraman);
    GMTrace.o(8482291974144L, 63198);
  }
  
  private static void a(amn paramamn, QFadeImageView paramQFadeImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, an paraman, int paramInt3, boolean paramBoolean2)
  {
    GMTrace.i(8482560409600L, 63200);
    a(paramamn, paramQFadeImageView, paramString, paramInt1, paramInt2, paramBoolean1, paraman, paramInt3, paramBoolean2, new amp());
    GMTrace.o(8482560409600L, 63200);
  }
  
  private static void a(amn paramamn, QFadeImageView paramQFadeImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, an paraman, int paramInt3, boolean paramBoolean2, amp paramamp)
  {
    GMTrace.i(8482426191872L, 63199);
    if (paramQFadeImageView == null)
    {
      w.e("MicroMsg.SnsMultiLineImageLineMgr", "");
      GMTrace.o(8482426191872L, 63199);
      return;
    }
    ap localap = new ap();
    localap.fAx = paramString;
    localap.index = 0;
    paramString = new ArrayList();
    paramString.add(paramQFadeImageView);
    localap.qJz = paramString;
    localap.qGP = paramBoolean1;
    localap.position = paramInt2;
    paramQFadeImageView.setTag(localap);
    double d2 = 0.0D;
    double d1 = 0.0D;
    double d4;
    double d3;
    if ((paramInt3 == 11) && (paramBoolean2))
    {
      ae.bhm().d(paramamn, paramQFadeImageView, paramInt1, paraman);
      if (paramamn.uhD != null)
      {
        d2 = paramamn.uhD.uis;
        d1 = paramamn.uhD.uit;
      }
      if ((d2 <= 0.0D) || (d1 <= 0.0D)) {
        break label458;
      }
      d4 = Math.min(qLD / d2, qLD / d1);
      d3 = d2 * d4;
      d4 = d1 * d4;
      d1 = d4;
      d2 = d3;
      if (d3 < qLE)
      {
        d1 = 1.0D * qLE / d3;
        d2 = d3 * d1;
        d1 = d4 * d1;
      }
      d3 = d1;
      d4 = d2;
      if (d1 < qLE)
      {
        d3 = 1.0D * qLE / d1;
        d4 = d2 * d3;
        d3 = d1 * d3;
      }
      d2 = d4;
      if (d4 > qLD) {
        d2 = qLD;
      }
      d1 = d3;
      d4 = d2;
      if (d3 > qLD)
      {
        d1 = qLD;
        d4 = d2;
      }
      label318:
      d2 = d4;
      if (d4 < 1.0D) {
        d2 = 1.0D;
      }
      d3 = d1;
      if (d1 < 1.0D) {
        d3 = 1.0D;
      }
      if ((paramamp == null) || (paramamp.uis <= 0.0F) || (paramamp.uit <= 0.0F)) {
        break label497;
      }
      d1 = paramamp.uis;
      d2 = paramamp.uit;
      d3 = d1;
      d1 = d2;
    }
    for (;;)
    {
      if ((paramQFadeImageView.getLayoutParams() instanceof FrameLayout.LayoutParams))
      {
        paramamn = (FrameLayout.LayoutParams)paramQFadeImageView.getLayoutParams();
        if ((paramamn.width == d3) && (paramamn.height == d1))
        {
          GMTrace.o(8482426191872L, 63199);
          return;
          ae.bhm().a(paramamn, paramQFadeImageView, paramInt1, paraman);
          break;
          label458:
          d4 = qLC;
          d1 = qLC;
          break label318;
        }
        paramQFadeImageView.setLayoutParams(new FrameLayout.LayoutParams((int)d3, (int)d1));
      }
      GMTrace.o(8482426191872L, 63199);
      return;
      label497:
      d1 = d3;
      d3 = d2;
    }
  }
  
  public final void a(PhotosContent paramPhotosContent, bhc parambhc, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, an paraman, List<amp> paramList)
  {
    GMTrace.i(8482157756416L, 63197);
    Object localObject1 = qLB;
    if ((paramInt2 == 2) || (paramInt2 == 11)) {
      localObject1 = qLy;
    }
    int i;
    for (;;)
    {
      parambhc = parambhc.uyu.tKd;
      if (qLC < 0.0D)
      {
        qLC = BackwardSupportUtil.b.a(this.context, 160.0F);
        qLD = BackwardSupportUtil.b.a(this.context, 200.0F);
        qLE = BackwardSupportUtil.b.a(this.context, 44.0F);
        qLF = BackwardSupportUtil.b.a(this.context, 66.0F);
        qLG = BackwardSupportUtil.b.a(this.context, 300.0F);
      }
      i = parambhc.size();
      if (i != 0) {
        break label225;
      }
      paramInt1 = 0;
      while (paramInt1 < localObject1.length)
      {
        ae.bhm().cp(paramPhotosContent.uS(paramInt1));
        paramPhotosContent.uS(paramInt1).position = paramInt3;
        paramInt1 += 1;
      }
      if (paramInt2 == 3) {
        localObject1 = qLz;
      } else if (paramInt2 == 4) {
        localObject1 = qLA;
      } else if (paramInt2 == 5) {
        localObject1 = qLB;
      }
    }
    paramPhotosContent.setVisibility(8);
    GMTrace.o(8482157756416L, 63197);
    return;
    label225:
    paramPhotosContent.uR(ae.bhw());
    paramPhotosContent.setVisibility(0);
    Object localObject2;
    if (i == 1)
    {
      i = 1;
      while (i < localObject1.length)
      {
        localObject2 = paramPhotosContent.uS(i);
        ((QFadeImageView)localObject2).setVisibility(8);
        ae.bhm().cp((View)localObject2);
        paramPhotosContent.uS(i).position = paramInt3;
        i += 1;
      }
      paramPhotosContent.uS(0).setVisibility(0);
      if ((paramList != null) && (paramList.size() > 0))
      {
        a((amn)parambhc.get(0), paramPhotosContent.uS(0), paramString, paramInt1, paramInt3, paramBoolean, paraman, paramInt2, false, (amp)paramList.get(0));
        GMTrace.o(8482157756416L, 63197);
        return;
      }
      a((amn)parambhc.get(0), paramPhotosContent.uS(0), paramString, paramInt1, paramInt3, paramBoolean, paraman, paramInt2, false);
      GMTrace.o(8482157756416L, 63197);
      return;
    }
    if (i == 4)
    {
      paramList = new ArrayList();
      paramInt2 = localObject1.length - 1;
      i = 3;
      if (paramInt2 >= 0)
      {
        localObject1 = paramPhotosContent.uS(paramInt2);
        ((TagImageView)localObject1).position = paramInt3;
        if ((paramInt2 == 0) || (paramInt2 == 1) || (paramInt2 == 3) || (paramInt2 == 4))
        {
          ((TagImageView)localObject1).setVisibility(0);
          paramList.add(localObject1);
          localObject2 = new ap();
          ((ap)localObject2).fAx = paramString;
          ((ap)localObject2).index = i;
          ((ap)localObject2).qJz = paramList;
          ((ap)localObject2).qGP = paramBoolean;
          ((ap)localObject2).position = paramInt3;
          ((TagImageView)localObject1).setTag(localObject2);
          a((amn)parambhc.get(((ap)localObject2).index), (QFadeImageView)localObject1, paramInt1, paraman);
          i -= 1;
        }
        for (;;)
        {
          paramInt2 -= 1;
          break;
          ((TagImageView)localObject1).setVisibility(8);
          ae.bhm().cp((View)localObject1);
        }
      }
      GMTrace.o(8482157756416L, 63197);
      return;
    }
    paramList = new ArrayList();
    paramInt2 = localObject1.length - 1;
    if (paramInt2 >= 0)
    {
      localObject1 = paramPhotosContent.uS(paramInt2);
      ((TagImageView)localObject1).position = paramInt3;
      if (paramInt2 < parambhc.size())
      {
        ((TagImageView)localObject1).setVisibility(0);
        paramList.add(localObject1);
        localObject2 = new ap();
        ((ap)localObject2).fAx = paramString;
        ((ap)localObject2).index = paramInt2;
        ((ap)localObject2).qJz = paramList;
        ((ap)localObject2).qGP = paramBoolean;
        ((ap)localObject2).position = paramInt3;
        ((TagImageView)localObject1).setTag(localObject2);
        a((amn)parambhc.get(((ap)localObject2).index), (QFadeImageView)localObject1, paramInt1, paraman);
      }
      for (;;)
      {
        paramInt2 -= 1;
        break;
        ((TagImageView)localObject1).setVisibility(8);
        ae.bhm().cp((View)localObject1);
      }
    }
    GMTrace.o(8482157756416L, 63197);
  }
  
  public final void a(PhotosContent paramPhotosContent, bhc parambhc, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, an paraman, boolean paramBoolean2)
  {
    GMTrace.i(8482023538688L, 63196);
    int[] arrayOfInt = qLB;
    if ((paramInt2 == 2) || (paramInt2 == 11)) {
      arrayOfInt = qLy;
    }
    int i;
    for (;;)
    {
      parambhc = parambhc.uyu.tKd;
      if (qLC < 0.0D)
      {
        qLC = BackwardSupportUtil.b.a(this.context, 160.0F);
        qLD = BackwardSupportUtil.b.a(this.context, 200.0F);
        qLE = BackwardSupportUtil.b.a(this.context, 44.0F);
        qLF = BackwardSupportUtil.b.a(this.context, 66.0F);
        qLG = BackwardSupportUtil.b.a(this.context, 300.0F);
      }
      i = parambhc.size();
      if (i != 0) {
        break label227;
      }
      paramInt1 = 0;
      while (paramInt1 < arrayOfInt.length)
      {
        ae.bhm().cp(paramPhotosContent.uS(paramInt1));
        paramPhotosContent.uS(paramInt1).position = paramInt3;
        paramInt1 += 1;
      }
      if (paramInt2 == 3) {
        arrayOfInt = qLz;
      } else if (paramInt2 == 4) {
        arrayOfInt = qLA;
      } else if (paramInt2 == 5) {
        arrayOfInt = qLB;
      }
    }
    paramPhotosContent.setVisibility(8);
    GMTrace.o(8482023538688L, 63196);
    return;
    label227:
    paramPhotosContent.setVisibility(0);
    if (i == 1)
    {
      i = 1;
      while (i < arrayOfInt.length)
      {
        TagImageView localTagImageView = paramPhotosContent.uS(i);
        localTagImageView.setVisibility(8);
        ae.bhm().cp(localTagImageView);
        paramPhotosContent.uS(i).position = paramInt3;
        i += 1;
      }
      paramPhotosContent.uS(0).setVisibility(0);
      a((amn)parambhc.get(0), paramPhotosContent.uS(0), paramString, paramInt1, paramInt3, paramBoolean1, paraman, paramInt2, paramBoolean2);
      GMTrace.o(8482023538688L, 63196);
      return;
    }
    GMTrace.o(8482023538688L, 63196);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */