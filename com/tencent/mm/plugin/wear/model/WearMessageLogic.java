package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.wear.model.e.p;
import com.tencent.mm.plugin.wear.model.e.p.1;
import com.tencent.mm.plugin.wear.model.e.q;
import com.tencent.mm.protocal.c.brd;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.qqpinyin.voicerecoapi.c;
import java.io.IOException;
import java.util.LinkedList;

public class WearMessageLogic
  extends BroadcastReceiver
{
  public WearMessageLogic()
  {
    GMTrace.i(9193109061632L, 68494);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.wear.message");
    ab.getContext().registerReceiver(this, localIntentFilter, "com.tencent.mm.wear.message", null);
    GMTrace.o(9193109061632L, 68494);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(9193243279360L, 68495);
    if (paramIntent.getAction().equals("com.tencent.mm.wear.message"))
    {
      paramContext = paramIntent.getExtras();
      int i = paramContext.getInt("key_connecttype");
      if (i == 1)
      {
        paramIntent = new a();
        paramIntent.shL = i;
        paramIntent.shM = paramContext.getInt("key_funid");
        paramIntent.pcX = paramContext.getInt("key_sessionid");
        paramIntent.shN = paramContext.getByteArray("key_data");
        paramContext = a.bzo().shf.wU(paramIntent.shM);
        if (paramContext != null) {}
        for (boolean bool = paramContext.wT(paramIntent.shM); bool; bool = false)
        {
          af.u(paramIntent);
          GMTrace.o(9193243279360L, 68495);
          return;
        }
        e.post(paramIntent, "WearHttpMessageTask_" + paramIntent.shM);
        GMTrace.o(9193243279360L, 68495);
        return;
      }
      if (i == 2)
      {
        paramIntent = new b();
        paramIntent.shL = i;
        paramIntent.shM = paramContext.getInt("key_funid");
        paramIntent.pcX = paramContext.getInt("key_sessionid");
        paramIntent.shN = paramContext.getByteArray("key_data");
        a.bzo().shn.a(paramIntent);
        GMTrace.o(9193243279360L, 68495);
        return;
      }
      if (i == 3) {
        a.bzo().shn.a(new c());
      }
    }
    GMTrace.o(9193243279360L, 68495);
  }
  
  private final class a
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    public int pcX;
    public int shL;
    public int shM;
    public byte[] shN;
    
    public a()
    {
      GMTrace.i(9195659198464L, 68513);
      GMTrace.o(9195659198464L, 68513);
    }
    
    protected final void execute()
    {
      GMTrace.i(9195793416192L, 68514);
      w.i("MicroMsg.Wear.WearMessageLogic", "handle message %s", new Object[] { toString() });
      com.tencent.mm.plugin.wear.model.e.a locala = a.bzo().shf.wU(this.shM);
      if (locala != null) {
        locala.b(this.shL, this.pcX, this.shM, this.shN);
      }
      GMTrace.o(9195793416192L, 68514);
    }
    
    public final String getName()
    {
      GMTrace.i(9195927633920L, 68515);
      GMTrace.o(9195927633920L, 68515);
      return "HttpMessageTask";
    }
    
    public final String toString()
    {
      GMTrace.i(9196061851648L, 68516);
      String str = String.format("connectType=%d funId=%d sessionId=%d", new Object[] { Integer.valueOf(this.shL), Integer.valueOf(this.shM), Integer.valueOf(this.pcX) });
      GMTrace.o(9196061851648L, 68516);
      return str;
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    public int pcX;
    public int shL;
    public int shM;
    public byte[] shN;
    
    public b()
    {
      GMTrace.i(9182640078848L, 68416);
      GMTrace.o(9182640078848L, 68416);
    }
    
    protected final void execute()
    {
      GMTrace.i(9182774296576L, 68417);
      switch (this.shM)
      {
      }
      for (;;)
      {
        GMTrace.o(9182774296576L, 68417);
        return;
        p localp = a.bzo().shh.shA;
        int i = this.pcX;
        Object localObject = this.shN;
        if (localp.siw.contains(Integer.valueOf(i))) {
          continue;
        }
        brd localbrd = new brd();
        try
        {
          localbrd.aC((byte[])localObject);
          if (localp.siu == i)
          {
            if (localbrd.uGo)
            {
              w.i("MicroMsg.Wear.VoiceToTextServer", "cancel session %d", new Object[] { Integer.valueOf(i) });
              localp.reset();
              GMTrace.o(9182774296576L, 68417);
              return;
            }
            if (localbrd.uGn)
            {
              localp.a(i, localbrd);
              if (localp.sis != null)
              {
                localp.sis.qN();
                localp.sis = null;
                w.i("MicroMsg.Wear.VoiceToTextServer", "finish speex compress");
              }
              if (localp.sir != null)
              {
                localp.sir.stop();
                localp.sir = null;
                w.i("MicroMsg.Wear.VoiceToTextServer", "finish voiceDetectAPI");
              }
              if (localp.siq != null)
              {
                localp.siq.hVr = true;
                if (!localp.fRd) {
                  ap.wT().a(localp.siq, 0);
                }
                localp.siq = null;
                w.i("MicroMsg.Wear.VoiceToTextServer", "finish netSceneVoiceToText");
              }
              GMTrace.o(9182774296576L, 68417);
              return;
            }
            localp.a(i, localbrd);
            GMTrace.o(9182774296576L, 68417);
            return;
          }
          localp.reset();
          localp.siu = i;
          w.i("MicroMsg.Wear.VoiceToTextServer", "startNewSession %s", new Object[] { Integer.valueOf(localp.siu) });
          com.tencent.mm.loader.stub.b.deleteFile(p.sip);
          if (localp.sis == null)
          {
            localp.sis = new com.tencent.mm.e.c.d();
            localp.sis.bP(p.sip);
          }
          if (localp.sir == null)
          {
            localp.sir = new c(1500000);
            if (localp.sir.start() != 0)
            {
              localp.siv = -2;
              GMTrace.o(9182774296576L, 68417);
              return;
            }
          }
          localObject = localbrd.uFL;
          if (localp.siq == null) {
            af.u(new p.1(localp, (String)localObject));
          }
          localp.a(i, localbrd);
        }
        catch (IOException localIOException)
        {
          for (;;) {}
        }
      }
    }
    
    public final String getName()
    {
      GMTrace.i(9182908514304L, 68418);
      GMTrace.o(9182908514304L, 68418);
      return "LongConnectTask";
    }
  }
  
  private final class c
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    public c()
    {
      GMTrace.i(18827928666112L, 140279);
      GMTrace.o(18827928666112L, 140279);
    }
    
    protected final void execute()
    {
      GMTrace.i(18828062883840L, 140280);
      if (a.bzo().shh.bzu() != null) {
        a.bzo().shh.bzu().bzx();
      }
      GMTrace.o(18828062883840L, 140280);
    }
    
    public final String getName()
    {
      GMTrace.i(18828197101568L, 140281);
      GMTrace.o(18828197101568L, 140281);
      return "RefreshConnectTask";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/WearMessageLogic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */