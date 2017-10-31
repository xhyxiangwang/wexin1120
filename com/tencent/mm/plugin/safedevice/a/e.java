package com.tencent.mm.plugin.safedevice.a;

import android.content.Context;
import android.os.Build;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.protocal.c.axv;
import com.tencent.mm.protocal.c.axw;
import com.tencent.mm.protocal.c.ty;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import java.util.Iterator;
import java.util.List;

public final class e
{
  static void a(axw paramaxw)
  {
    GMTrace.i(12858192560128L, 95801);
    if ((paramaxw != null) && (paramaxw.jWR != null))
    {
      paramaxw = paramaxw.jWR;
      if ((paramaxw != null) && (paramaxw.size() >= 0))
      {
        f.bar().eL("SafeDeviceInfo", "delete from SafeDeviceInfo");
        paramaxw = paramaxw.iterator();
        while (paramaxw.hasNext())
        {
          axv localaxv = (axv)paramaxw.next();
          f.bar().a(new c(localaxv));
        }
      }
    }
    GMTrace.o(12858192560128L, 95801);
  }
  
  public static String bap()
  {
    GMTrace.i(12858460995584L, 95803);
    String str = Build.MANUFACTURER + "-" + Build.MODEL;
    GMTrace.o(12858460995584L, 95803);
    return str;
  }
  
  public static String cZ(Context paramContext)
  {
    GMTrace.i(12858326777856L, 95802);
    if (paramContext == null)
    {
      if (com.tencent.mm.sdk.platformtools.f.uLK)
      {
        paramContext = ab.getContext().getString(R.l.eCu);
        GMTrace.o(12858326777856L, 95802);
        return paramContext;
      }
      paramContext = ab.getContext().getString(R.l.eCt);
      GMTrace.o(12858326777856L, 95802);
      return paramContext;
    }
    if (com.tencent.mm.sdk.platformtools.f.uLK)
    {
      paramContext = paramContext.getString(R.l.eCu);
      GMTrace.o(12858326777856L, 95802);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.eCt);
    GMTrace.o(12858326777856L, 95802);
    return paramContext;
  }
  
  public static void r(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(12858058342400L, 95800);
    if (!ap.AV())
    {
      GMTrace.o(12858058342400L, 95800);
      return;
    }
    int i = m.zL();
    ty localty;
    if (paramBoolean1)
    {
      i |= 0x4000;
      ap.AS();
      com.tencent.mm.x.c.xi().set(40, Integer.valueOf(i));
      if (paramBoolean2)
      {
        localty = new ty();
        localty.tRV = 28;
        if (!paramBoolean1) {
          break label130;
        }
      }
    }
    label130:
    for (i = 1;; i = 2)
    {
      localty.tRW = i;
      ap.AS();
      com.tencent.mm.x.c.yK().b(new e.a(23, localty));
      a.ifN.pt();
      GMTrace.o(12858058342400L, 95800);
      return;
      i &= 0xBFFF;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/safedevice/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */