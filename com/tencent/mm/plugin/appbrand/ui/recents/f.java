package com.tencent.mm.plugin.appbrand.ui.recents;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.e;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.c;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;

final class f
  extends AppBrandLauncherUI.c<Object>
{
  f(ArrayList<?> paramArrayList1, ArrayList<?> paramArrayList2)
  {
    super(paramArrayList1, paramArrayList2);
    GMTrace.i(16359798865920L, 121890);
    GMTrace.o(16359798865920L, 121890);
  }
  
  public final boolean bA(int paramInt1, int paramInt2)
  {
    GMTrace.i(16360067301376L, 121892);
    if ((this.jqH.get(paramInt1) instanceof e))
    {
      e locale1 = (e)this.jqH.get(paramInt1);
      e locale2 = (e)this.jqI.get(paramInt2);
      if ((locale1.appId.equals(locale2.appId)) && (locale1.ftu.equals(locale2.ftu)) && (locale1.iCo == locale2.iCo) && (locale1.iEJ == locale2.iEJ) && (bg.mY(locale1.iEH).equals(locale2.iEH)) && (bg.mY(locale1.appName).equals(locale2.appName)))
      {
        GMTrace.o(16360067301376L, 121892);
        return true;
      }
      GMTrace.o(16360067301376L, 121892);
      return false;
    }
    GMTrace.o(16360067301376L, 121892);
    return false;
  }
  
  public final Object bB(int paramInt1, int paramInt2)
  {
    GMTrace.i(16360201519104L, 121893);
    if (paramInt1 >= this.jqH.size())
    {
      GMTrace.o(16360201519104L, 121893);
      return null;
    }
    Bundle localBundle = new Bundle();
    if ((this.jqH.get(paramInt1) instanceof e))
    {
      e locale1 = (e)this.jqH.get(paramInt1);
      e locale2 = (e)this.jqI.get(paramInt2);
      if (locale1.iEI != locale2.iEI) {
        localBundle.putLong("running_flag", locale2.iEI);
      }
      if (locale1.iEJ != locale2.iEJ) {
        localBundle.putBoolean("star", locale2.iEJ);
      }
      if (locale1.iCo != locale2.iCo) {
        localBundle.putInt("debug_type", locale2.iCo);
      }
      if (!bg.mY(locale1.iEH).equals(locale2.iEH)) {
        localBundle.putString("icon", locale2.iEH);
      }
      if (!bg.mY(locale1.appName).equals(locale2.appName)) {
        localBundle.putString("nick_name", locale2.appName);
      }
    }
    if (localBundle.size() <= 0)
    {
      GMTrace.o(16360201519104L, 121893);
      return null;
    }
    GMTrace.o(16360201519104L, 121893);
    return localBundle;
  }
  
  public final boolean bz(int paramInt1, int paramInt2)
  {
    GMTrace.i(16359933083648L, 121891);
    if (!this.jqH.get(paramInt1).getClass().equals(this.jqI.get(paramInt2).getClass()))
    {
      GMTrace.o(16359933083648L, 121891);
      return false;
    }
    if ((this.jqH.get(paramInt1) instanceof e))
    {
      e locale1 = (e)this.jqH.get(paramInt1);
      e locale2 = (e)this.jqI.get(paramInt2);
      if ((locale1.appId.equals(locale2.appId)) && (locale1.iCo == locale2.iCo) && (locale1.ftu.equals(locale2.ftu)))
      {
        GMTrace.o(16359933083648L, 121891);
        return true;
      }
      GMTrace.o(16359933083648L, 121891);
      return false;
    }
    GMTrace.o(16359933083648L, 121891);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */