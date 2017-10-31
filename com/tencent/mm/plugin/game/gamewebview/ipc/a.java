package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.m;
import com.tencent.mm.network.m.a;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private static HashMap<Integer, GameMMToClientEvent> iPa;
  private static m meg;
  
  static
  {
    GMTrace.i(16944048635904L, 126243);
    iPa = new HashMap();
    m.a local1 = new m.a()
    {
      private final byte[] gBF;
      
      public final void db(int paramAnonymousInt)
      {
        GMTrace.i(16961094287360L, 126370);
        synchronized (this.gBF)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("mm_to_client_notify_type", 1);
          localBundle.putString("js_event_name", "onNetWorkChange");
          localBundle.putString("netType", s.bAg());
          a.x(localBundle);
          GMTrace.o(16961094287360L, 126370);
          return;
        }
      }
    };
    meg = local1;
    ap.a(local1);
    GMTrace.o(16944048635904L, 126243);
  }
  
  public static void a(int paramInt, GameMMToClientEvent paramGameMMToClientEvent)
  {
    GMTrace.i(16943645982720L, 126240);
    iPa.put(Integer.valueOf(paramInt), paramGameMMToClientEvent);
    GMTrace.o(16943645982720L, 126240);
  }
  
  public static void op(int paramInt)
  {
    GMTrace.i(16943780200448L, 126241);
    iPa.remove(Integer.valueOf(paramInt));
    GMTrace.o(16943780200448L, 126241);
  }
  
  public static void x(Bundle paramBundle)
  {
    try
    {
      GMTrace.i(16943914418176L, 126242);
      w.d("MicroMsg.GameMMToClientEventCenter", "notifyToAllClint");
      Iterator localIterator = iPa.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        GameMMToClientEvent localGameMMToClientEvent = (GameMMToClientEvent)localEntry.getValue();
        if (localGameMMToClientEvent != null)
        {
          localGameMMToClientEvent.mtO = ((Integer)localEntry.getKey()).intValue();
          localGameMMToClientEvent.lRQ = paramBundle;
          localGameMMToClientEvent.VC();
        }
      }
      GMTrace.o(16943914418176L, 126242);
    }
    finally {}
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */