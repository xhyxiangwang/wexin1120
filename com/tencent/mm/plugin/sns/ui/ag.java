package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.c.aq;
import com.tencent.mm.protocal.c.as;
import com.tencent.mm.protocal.c.cl;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.ct;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;

public final class ag
{
  public static int a(Context paramContext, as paramas)
  {
    GMTrace.i(15054799896576L, 112167);
    if (paramas == null)
    {
      GMTrace.o(15054799896576L, 112167);
      return 0;
    }
    if (paramas.jXP == 6)
    {
      if (paramas.tue == null)
      {
        GMTrace.o(15054799896576L, 112167);
        return 0;
      }
      if (a.ifN.n(paramContext, paramas.tuc.mDD))
      {
        i = paramas.tue.tvP;
        GMTrace.o(15054799896576L, 112167);
        return i;
      }
      i = paramas.tue.tvQ;
      GMTrace.o(15054799896576L, 112167);
      return i;
    }
    int i = paramas.ttY;
    GMTrace.o(15054799896576L, 112167);
    return i;
  }
  
  public static void a(Context paramContext, ay paramay, as paramas)
  {
    GMTrace.i(15054934114304L, 112168);
    if ((paramas != null) && (paramas.tuc != null))
    {
      Object localObject = paramas.tuc.mDD;
      boolean bool;
      if (bg.mZ((String)localObject))
      {
        bool = false;
        if (!bool) {
          break label467;
        }
        paramay.qQO = false;
        if ((paramas.tug == null) || (paramas.tuh == null)) {
          break label293;
        }
        if (!a.ifN.n(paramContext, paramas.tuc.mDD)) {
          break label249;
        }
        paramContext = paramas.tug;
        label87:
        localObject = v.bMQ();
        if (!((String)localObject).equals("zh_CN")) {
          break label257;
        }
        paramContext = paramContext.twa;
        label107:
        switch (paramas.jXP)
        {
        default: 
          paramay.qQO = false;
        }
      }
      for (;;)
      {
        if (bg.mZ(paramContext))
        {
          w.e("MicroMsg.OpenActionContent", "text can not load ?");
          paramay.qQO = false;
        }
        GMTrace.o(15054934114304L, 112168);
        return;
        localObject = g.aM((String)localObject, true);
        if ((localObject == null) || (bg.mZ(((f)localObject).field_appId)))
        {
          bool = false;
          break;
        }
        if ((((f)localObject).field_appInfoFlag & 0x20) > 0) {}
        for (bool = true;; bool = false)
        {
          w.v("MicroMsg.AppInfoLogic", "canShowSNSTail, appid = %s, ret = %b", new Object[] { ((f)localObject).field_appId, Boolean.valueOf(bool) });
          break;
        }
        label249:
        paramContext = paramas.tuh;
        break label87;
        label257:
        if ((((String)localObject).equals("zh_TW")) || (((String)localObject).equals("zh_HK")))
        {
          paramContext = paramContext.twb;
          break label107;
        }
        paramContext = paramContext.tvZ;
        break label107;
        label293:
        if (paramas == null) {
          localObject = "";
        }
        for (;;)
        {
          try
          {
            if (bg.mZ((String)localObject)) {
              continue;
            }
            int i = paramContext.getResources().getIdentifier((String)localObject, "string", paramContext.getPackageName());
            if (i <= 0) {
              continue;
            }
            paramContext = paramContext.getString(i);
          }
          catch (Exception paramContext)
          {
            paramContext = "";
          }
          if (paramas.jXP == 6)
          {
            if (paramas.tuf == null) {
              localObject = "";
            } else if (a.ifN.n(paramContext, paramas.tuc.mDD)) {
              localObject = paramas.tuf.twc;
            } else {
              localObject = paramas.tuf.twd;
            }
          }
          else {
            localObject = paramas.tud;
          }
        }
        break label107;
        paramay.qQP = paramContext;
        paramay.qQO = true;
        continue;
        if (paramas.ttY == 1)
        {
          paramay.qQP = paramContext;
          paramay.qQO = true;
          continue;
          paramay.qQP = paramContext;
          paramay.qQO = true;
        }
      }
    }
    label467:
    paramay.qQO = false;
    GMTrace.o(15054934114304L, 112168);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */