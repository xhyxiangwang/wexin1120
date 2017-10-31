package com.tencent.mm.plugin.sns.ui.a;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.ui.AsyncTextView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ap;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.ay;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.x.m;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends a
{
  private int qHF;
  
  public b()
  {
    GMTrace.i(8524302123008L, 63511);
    this.qHF = 103;
    GMTrace.o(8524302123008L, 63511);
  }
  
  public final void a(a.c paramc, int paramInt1, ay paramay, bhc parambhc, int paramInt2, av paramav)
  {
    GMTrace.i(8524570558464L, 63513);
    Object localObject = paramay.qAX;
    if (paramc.qUL != null)
    {
      if ((!paramay.qQq) || (paramc.pVG.uvw == null) || (paramc.pVG.uvw.uvY <= 0)) {
        break label254;
      }
      paramc.qUL.setBackgroundResource(i.e.pGO);
    }
    int i;
    boolean bool;
    for (;;)
    {
      TagImageView localTagImageView = paramc.qUe.uS(0);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localTagImageView);
      ap localap = new ap();
      localap.fAx = ((String)localObject);
      localap.index = 0;
      localap.qJz = localArrayList;
      localap.qGP = this.qGP;
      if (localTagImageView != null) {
        localTagImageView.setTag(localap);
      }
      localObject = paramay.qQQ;
      paramc.qvb = ((amo)localObject);
      if (localObject == null) {
        break label482;
      }
      if (!m.zF().equals(parambhc.jWW)) {
        break;
      }
      paramc.qUe.setVisibility(0);
      paramav = paramav.qHu;
      paramc = paramc.qUe;
      paramay = paramay.qAX;
      i = this.mActivity.hashCode();
      bool = this.qGP;
      localObject = an.bQu();
      ((an)localObject).time = parambhc.orU;
      paramav.a(paramc, parambhc, paramay, i, paramInt2, paramInt1, bool, (an)localObject, true);
      GMTrace.o(8524570558464L, 63513);
      return;
      label254:
      paramc.qUL.setBackgroundResource(i.e.pGN);
    }
    if (paramay.qQt)
    {
      paramc.qUe.setVisibility(0);
      paramav = paramav.qHu;
      paramc = paramc.qUe;
      paramay = paramay.qAX;
      i = this.mActivity.hashCode();
      bool = this.qGP;
      localObject = an.bQu();
      ((an)localObject).time = parambhc.orU;
      paramav.a(paramc, parambhc, paramay, i, paramInt2, paramInt1, bool, (an)localObject, false);
      GMTrace.o(8524570558464L, 63513);
      return;
    }
    if (((amo)localObject).fQZ == 0)
    {
      paramc.qUe.setVisibility(0);
      paramav = paramav.qHu;
      paramc = paramc.qUe;
      paramay = paramay.qAX;
      i = this.mActivity.hashCode();
      bool = this.qGP;
      localObject = an.bQu();
      ((an)localObject).time = parambhc.orU;
      paramav.a(paramc, parambhc, paramay, i, paramInt2, paramInt1, bool, (an)localObject, true);
      GMTrace.o(8524570558464L, 63513);
      return;
    }
    w.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo.hbStatus is " + ((amo)localObject).fQZ);
    GMTrace.o(8524570558464L, 63513);
    return;
    label482:
    w.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo is null " + paramay.qAX);
    GMTrace.o(8524570558464L, 63513);
  }
  
  public final void d(a.c paramc)
  {
    GMTrace.i(8524436340736L, 63512);
    paramc.qTX.setImageResource(i.e.pGX);
    paramc.qTE.setTextColor(-2730427);
    if (paramc.qTM != null)
    {
      paramc.qTM.setLayoutResource(i.g.pOR);
      if (!paramc.qTN) {
        paramc.qUe = ((PhotosContent)paramc.qTM.inflate());
      }
    }
    for (paramc.qTN = true;; paramc.qTN = true)
    {
      w.i("MiroMsg.HBRewardTimeLineItem", "viewtype " + this.kxh);
      TagImageView localTagImageView = (TagImageView)paramc.qUe.findViewById(ar.qLB[0]);
      paramc.qUe.a(localTagImageView);
      localTagImageView.setOnClickListener(this.qhj.qgD.qBP);
      GMTrace.o(8524436340736L, 63512);
      return;
      paramc.qUe = ((PhotosContent)paramc.msJ.findViewById(i.f.pJV));
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */