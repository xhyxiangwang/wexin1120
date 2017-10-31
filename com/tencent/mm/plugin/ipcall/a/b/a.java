package com.tencent.mm.plugin.ipcall.a.b;

import android.media.AudioManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.b;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class a
{
  public boolean fGc;
  public b mXN;
  public final Object mXO;
  public int mXP;
  public boolean mXQ;
  
  public a()
  {
    GMTrace.i(11607954423808L, 86486);
    this.mXN = null;
    this.mXO = new Object();
    this.fGc = false;
    this.mXP = 0;
    this.mXQ = false;
    GMTrace.o(11607954423808L, 86486);
  }
  
  public static boolean sr()
  {
    GMTrace.i(11608222859264L, 86488);
    boolean bool = ap.AT().gFp.isSpeakerphoneOn();
    GMTrace.o(11608222859264L, 86488);
    return bool;
  }
  
  public final void fo(boolean paramBoolean)
  {
    GMTrace.i(11608088641536L, 86487);
    w.i("MicroMsg.IPCallAudioPlayer", "setSpeakerPhoneOn, old isSpeakerPhoneOn: %b, new isSpeakerPhoneOn: %b", new Object[] { Boolean.valueOf(this.mXQ), Boolean.valueOf(paramBoolean) });
    ap.AT().aL(paramBoolean);
    com.tencent.mm.plugin.ipcall.a.c.a locala = i.aHm();
    if (paramBoolean) {}
    for (int i = locala.mYp.qO(401);; i = locala.mYp.qO(402))
    {
      if (i < 0) {
        w.e("MicroMsg.IPCallEngineManager", "setSpeakerPhoneOn, failed, ret: %d", new Object[] { Integer.valueOf(i) });
      }
      if (paramBoolean != this.mXQ)
      {
        this.mXQ = paramBoolean;
        if ((this.mXN != null) && (this.mXN.rmm)) {
          this.mXN.ir(paramBoolean);
        }
      }
      GMTrace.o(11608088641536L, 86487);
      return;
    }
  }
  
  public final class a
    implements Runnable
  {
    private b mXS;
    
    public a(b paramb)
    {
      GMTrace.i(11607551770624L, 86483);
      this.mXS = null;
      this.mXS = paramb;
      GMTrace.o(11607551770624L, 86483);
    }
    
    public final void run()
    {
      GMTrace.i(11607685988352L, 86484);
      if (this.mXS != null)
      {
        this.mXS.brI();
        this.mXS.brF();
        this.mXS = null;
        a.this.mXQ = false;
      }
      ap.AT().setMode(0);
      GMTrace.o(11607685988352L, 86484);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */