package com.tencent.mm.plugin.sns.abtest;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oy;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.a.e;
import com.tencent.mm.x.a.f;
import com.tencent.mm.x.a.g;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static boolean pUQ;
  private static com.tencent.mm.sdk.b.c pUZ;
  private static String pVB;
  public static Set<Long> pVC;
  private static View.OnClickListener pVD;
  
  static
  {
    GMTrace.i(8870181208064L, 66088);
    pVB = "0";
    pVC = new HashSet();
    pUZ = new com.tencent.mm.sdk.b.c() {};
    pUQ = false;
    GMTrace.o(8870181208064L, 66088);
  }
  
  public static void av(Context paramContext, String paramString)
  {
    GMTrace.i(16047071559680L, 119560);
    paramString = ae.bhp().Hz(paramString);
    if (paramString != null)
    {
      String str = paramString.field_userName;
      Intent localIntent = new Intent();
      localIntent.putExtra("sns_permission_userName", str);
      localIntent.putExtra("sns_permission_snsinfo_svr_id", paramString.field_snsId);
      localIntent.putExtra("sns_permission_block_scene", 7);
      localIntent.setClass(paramContext, SnsPermissionUI.class);
      paramContext.startActivity(localIntent);
    }
    GMTrace.o(16047071559680L, 119560);
  }
  
  public static void b(View paramView, a.c paramc)
  {
    GMTrace.i(8869644337152L, 66084);
    if (pUQ)
    {
      paramc.qUl = false;
      paramc.qUj = ((ViewStub)paramView.findViewById(i.f.pMS));
      paramc.qUj.setVisibility(8);
    }
    GMTrace.o(8869644337152L, 66084);
  }
  
  public static void bfO()
  {
    GMTrace.i(8869375901696L, 66082);
    if (g.BZ().gL("6") != null)
    {
      pVB = g.BZ().gL("6").value;
      w.d("MicroMsg.SellerABTestManager", "startABTest, value:%s", new Object[] { pVB });
      pUQ = true;
      a.uLm.b(pUZ);
      pVD = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8871254949888L, 66096);
          if ((paramAnonymousView.getTag() instanceof m))
          {
            m localm = (m)paramAnonymousView.getTag();
            if ((localm != null) && (!bg.mZ(localm.bjM()))) {
              c.av(paramAnonymousView.getContext(), localm.bjM());
            }
          }
          GMTrace.o(8871254949888L, 66096);
        }
      };
    }
    GMTrace.o(8869375901696L, 66082);
  }
  
  public static void bfP()
  {
    GMTrace.i(8869510119424L, 66083);
    pVD = null;
    a.uLm.c(pUZ);
    if (pUQ)
    {
      g.BZ().gL("6").hif = 2L;
      g.BZ().gL("6").result = pVC.size();
      f.a(g.BZ().gL("6"));
      w.d("MicroMsg.SellerABTestManager", "endABTestWhenExitTimeline, scene:%d, result:%s", new Object[] { Integer.valueOf(2), pVC.size() });
    }
    pVB = "0";
    pUQ = false;
    pVC.clear();
    GMTrace.o(8869510119424L, 66083);
  }
  
  public static void j(long paramLong, boolean paramBoolean)
  {
    GMTrace.i(16046937341952L, 119559);
    Object localObject;
    if (pUQ)
    {
      g.BZ().gL("6").hif = 3L;
      localObject = new StringBuilder();
      if (!paramBoolean) {
        break label133;
      }
    }
    label133:
    for (int i = 2;; i = 1)
    {
      localObject = i + "|" + paramLong;
      g.BZ().gL("6").result = ((String)localObject);
      f.a(g.BZ().gL("6"));
      w.d("MicroMsg.SellerABTestManager", "endABTestWhenFinishBlock, snsSvrId:%d, isBlock:%b, scene:%d, actionResult:%s", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(paramBoolean), Integer.valueOf(3), localObject });
      GMTrace.o(16046937341952L, 119559);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/abtest/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */