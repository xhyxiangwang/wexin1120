package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ab;
import java.util.Locale;

public final class e
{
  public e()
  {
    GMTrace.i(16341411037184L, 121753);
    GMTrace.o(16341411037184L, 121753);
  }
  
  public final ab Um()
  {
    GMTrace.i(16341545254912L, 121754);
    ab local1 = new ab()
    {
      public final boolean ff(int paramAnonymousInt)
      {
        GMTrace.i(16341142601728L, 121751);
        if ((paramAnonymousInt >= 637863936) && (paramAnonymousInt <= 637863988))
        {
          GMTrace.o(16341142601728L, 121751);
          return true;
        }
        GMTrace.o(16341142601728L, 121751);
        return false;
      }
      
      public final String getTag()
      {
        GMTrace.i(16341276819456L, 121752);
        GMTrace.o(16341276819456L, 121752);
        return "MicroMsg.AppBrandNewContactFixVersionStateTransfer";
      }
      
      public final void transfer(int paramAnonymousInt)
      {
        GMTrace.i(16341008384000L, 121750);
        if (!ff(paramAnonymousInt))
        {
          GMTrace.o(16341008384000L, 121750);
          return;
        }
        try
        {
          w.d("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix()");
          Object localObject = f.RW();
          if (localObject != null)
          {
            localObject = ((f)localObject).RX();
            f.Sa();
            ((g)localObject).eL("WxaAttributesTable", String.format(Locale.US, "update %s set %s='' where %s is null or %s=''", new Object[] { "WxaAttributesTable", "syncVersion", "versionInfo", "versionInfo" }));
            GMTrace.o(16341008384000L, 121750);
            return;
          }
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix e = %s", new Object[] { localException });
          GMTrace.o(16341008384000L, 121750);
        }
      }
    };
    GMTrace.o(16341545254912L, 121754);
    return local1;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */