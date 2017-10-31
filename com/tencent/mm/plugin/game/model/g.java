package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.ak;
import com.tencent.mm.plugin.game.c.ce;
import com.tencent.mm.plugin.game.c.v;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public class g
{
  private static g mzJ;
  public ak mzK;
  
  public g()
  {
    GMTrace.i(16558575321088L, 123371);
    GMTrace.o(16558575321088L, 123371);
  }
  
  public static g aEh()
  {
    GMTrace.i(16558709538816L, 123372);
    if (mzJ == null) {}
    try
    {
      if (mzJ == null) {
        mzJ = new g();
      }
      g localg = mzJ;
      GMTrace.o(16558709538816L, 123372);
      return localg;
    }
    finally {}
  }
  
  public final void QK()
  {
    GMTrace.i(16558843756544L, 123373);
    c.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16559917498368L, 123381);
        byte[] arrayOfByte = SubCoreGameCenter.aFi().zd("pb_game_global_config");
        g.this.as(arrayOfByte);
        GMTrace.o(16559917498368L, 123381);
      }
    });
    GMTrace.o(16558843756544L, 123373);
  }
  
  public final v aEi()
  {
    GMTrace.i(16559112192000L, 123375);
    Object localObject = null;
    if (this.mzK != null)
    {
      v localv = this.mzK.mEs;
      localObject = localv;
      if (localv != null)
      {
        w.i("MicroMsg.GameConfigManager", "getGameDetailSettingControl jumpType:%d, jumpUrl:%s", new Object[] { Integer.valueOf(localv.mDO), localv.mDg });
        localObject = localv;
      }
    }
    for (;;)
    {
      GMTrace.o(16559112192000L, 123375);
      return (v)localObject;
      QK();
    }
  }
  
  public final ce aEj()
  {
    GMTrace.i(19312454664192L, 143889);
    if (this.mzK != null)
    {
      ce localce = this.mzK.mEu;
      GMTrace.o(19312454664192L, 143889);
      return localce;
    }
    QK();
    GMTrace.o(19312454664192L, 143889);
    return null;
  }
  
  public final void as(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(16558977974272L, 123374);
        if (bg.bp(paramArrayOfByte))
        {
          GMTrace.o(16558977974272L, 123374);
          return;
        }
      }
      finally
      {
        try
        {
          this.mzK = new ak();
          this.mzK.aC(paramArrayOfByte);
          GMTrace.o(16558977974272L, 123374);
        }
        catch (IOException paramArrayOfByte)
        {
          this.mzK = null;
          w.e("MicroMsg.GameConfigManager", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
          GMTrace.o(16558977974272L, 123374);
        }
        paramArrayOfByte = finally;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */