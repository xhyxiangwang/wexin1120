package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.at;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ao
{
  private Activity fGo;
  private List<amn> fIU;
  
  public ao(Activity paramActivity)
  {
    GMTrace.i(8355053568000L, 62250);
    this.fIU = new ArrayList();
    this.fGo = paramActivity;
    GMTrace.o(8355053568000L, 62250);
  }
  
  private boolean bW(String paramString, int paramInt)
  {
    GMTrace.i(8355456221184L, 62253);
    paramString = com.tencent.mm.plugin.sns.storage.h.HA(paramString);
    if (paramString == null)
    {
      GMTrace.o(8355456221184L, 62253);
      return false;
    }
    paramString = paramString.bjL();
    if ((paramString.uyu == null) || (paramString.uyu.tKd.size() == 0))
    {
      GMTrace.o(8355456221184L, 62253);
      return false;
    }
    this.fIU.clear();
    paramString = paramString.uyu.tKd.iterator();
    int i = 0;
    while (paramString.hasNext())
    {
      amn localamn = (amn)paramString.next();
      this.fIU.add(localamn);
      if ((paramInt == i) && (!ae.bhm().A(localamn)))
      {
        GMTrace.o(8355456221184L, 62253);
        return false;
      }
      i += 1;
    }
    GMTrace.o(8355456221184L, 62253);
    return true;
  }
  
  public final void a(View paramView, int paramInt, at paramat)
  {
    GMTrace.i(8355322003456L, 62252);
    if (paramView == null)
    {
      GMTrace.o(8355322003456L, 62252);
      return;
    }
    Object localObject = paramView.getTag();
    ap localap;
    String str;
    int i;
    int j;
    m localm;
    Intent localIntent;
    if ((localObject instanceof ap))
    {
      localap = (ap)localObject;
      str = localap.fAx;
      i = localap.index;
      j = localap.position;
      if (!bW(str, i))
      {
        GMTrace.o(8355322003456L, 62252);
        return;
      }
      com.tencent.mm.kernel.h.xA();
      if (!com.tencent.mm.kernel.h.xz().isSDCardAvailable())
      {
        GMTrace.o(8355322003456L, 62252);
        return;
      }
      localm = com.tencent.mm.plugin.sns.storage.h.HA(str);
      if (!bW(str, i))
      {
        GMTrace.o(8355322003456L, 62252);
        return;
      }
      localIntent = new Intent();
      if (localm != null)
      {
        if (paramat != null) {
          paramat.qek.v(localm);
        }
        bhc localbhc = localm.bjL();
        if (localap.index >= localbhc.uyu.tKd.size()) {
          break label599;
        }
        paramat = (amn)localbhc.uyu.tKd.get(localap.index);
        if (paramInt != 1) {
          break label610;
        }
        localObject = com.tencent.mm.modelsns.b.gM(716);
        label218:
        ((com.tencent.mm.modelsns.b)localObject).lh(i.g(localm)).gP(localm.field_type).bA(localm.uF(32)).lh(localm.bkq()).lh(paramat.nas).gP(localap.index).gP(localbhc.uyu.tKd.size());
        ((com.tencent.mm.modelsns.b)localObject).LJ();
        if (paramInt != 1) {
          break label621;
        }
      }
    }
    label599:
    label610:
    label621:
    for (paramat = com.tencent.mm.modelsns.b.gM(744);; paramat = com.tencent.mm.modelsns.b.gN(744))
    {
      paramat.lh(i.g(localm)).gP(localm.field_type).bA(localm.uF(32)).lh(localm.bkq());
      paramat.b(localIntent, "intent_key_StatisticsOplog");
      paramat = new Bundle();
      paramat.putInt("stat_scene", 3);
      paramat.putString("stat_msg_id", "sns_" + i.jdMethod_do(localm.field_snsId));
      paramat.putString("stat_send_msg_user", localm.field_userName);
      localIntent.putExtra("_stat_obj", paramat);
      paramat = new int[2];
      paramView.getLocationInWindow(paramat);
      int k = paramView.getWidth();
      int m = paramView.getHeight();
      if (paramInt == -1) {
        localIntent.putExtra("k_is_from_sns_msg_ui", true);
      }
      localIntent.putExtra("sns_gallery_localId", str);
      localIntent.putExtra("sns_gallery_position", i);
      localIntent.putExtra("sns_position", j);
      localIntent.putExtra("sns_gallery_showtype", 1);
      localIntent.putExtra("K_ad_scene", paramInt);
      localIntent.putExtra("k_is_from_sns_main_timeline", localap.qGP);
      localIntent.putExtra("img_gallery_left", paramat[0]);
      localIntent.putExtra("img_gallery_top", paramat[1]);
      localIntent.putExtra("img_gallery_width", k);
      localIntent.putExtra("img_gallery_height", m);
      localIntent.setClass(this.fGo, SnsBrowseUI.class);
      this.fGo.startActivity(localIntent);
      this.fGo.overridePendingTransition(0, 0);
      GMTrace.o(8355322003456L, 62252);
      return;
      paramat = new amn();
      break;
      localObject = com.tencent.mm.modelsns.b.gN(716);
      break label218;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */