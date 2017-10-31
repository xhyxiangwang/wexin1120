package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.e.b.c.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class c
{
  private c.a mYj;
  public com.tencent.mm.e.b.c nZE;
  private com.tencent.mm.plugin.voip.model.a nZH;
  public com.tencent.mm.plugin.voip.model.b rod;
  
  public c()
  {
    GMTrace.i(11263283298304L, 83918);
    this.mYj = new c.a()
    {
      public final void aw(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(11263149080576L, 83917);
        w.i("MicroMsg.cs.VoipCsAudioManager", "OnPcmRecListener onRecError %d %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        GMTrace.o(11263149080576L, 83917);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(11263014862848L, 83916);
        if (paramAnonymousInt <= 0)
        {
          w.e("MicroMsg.cs.VoipCsAudioManager", "pcm data len <= 0");
          GMTrace.o(11263014862848L, 83916);
          return;
        }
        w.d("MicroMsg.cs.VoipCsAudioManager", "onRecPcmDataReady,pcm data len:" + paramAnonymousArrayOfByte.length);
        paramAnonymousInt = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.recordCallback(paramAnonymousArrayOfByte, paramAnonymousInt, 200);
        w.d("MicroMsg.cs.VoipCsAudioManager", "recordCallback,ret:" + paramAnonymousInt);
        GMTrace.o(11263014862848L, 83916);
      }
    };
    this.nZH = new com.tencent.mm.plugin.voip.model.a()
    {
      public final int x(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(11259256766464L, 83888);
        w.d("MicroMsg.cs.VoipCsAudioManager", "PlayDevDataCallBack,pcm data len:" + paramAnonymousArrayOfByte.length);
        paramAnonymousInt = com.tencent.mm.plugin.voip_cs.b.b.buw().mYp.playCallback(paramAnonymousArrayOfByte, paramAnonymousInt);
        if (paramAnonymousInt != 0) {
          w.d("MicroMsg.cs.VoipCsAudioManager", "PlayDevDataCallBack is failure! pc data:" + paramAnonymousArrayOfByte.length + ",ret:" + paramAnonymousInt);
        }
        if (paramAnonymousInt != 0)
        {
          GMTrace.o(11259256766464L, 83888);
          return 1;
        }
        GMTrace.o(11259256766464L, 83888);
        return 0;
      }
    };
    this.nZE = new com.tencent.mm.e.b.c(v2protocal.nZw, 1, 1);
    this.nZE.de(20);
    this.nZE.aB(true);
    this.nZE.qy();
    this.nZE.j(1, false);
    this.nZE.aA(true);
    this.nZE.fqQ = this.mYj;
    this.rod = new com.tencent.mm.plugin.voip.model.b();
    this.rod.P(v2protocal.nZw, 20, 0);
    this.rod.k(ab.getContext(), false);
    this.rod.rmx = this.nZH;
    GMTrace.o(11263283298304L, 83918);
  }
  
  private boolean ir(boolean paramBoolean)
  {
    GMTrace.i(11263417516032L, 83919);
    if (this.rod != null)
    {
      paramBoolean = this.rod.ir(paramBoolean);
      GMTrace.o(11263417516032L, 83919);
      return paramBoolean;
    }
    GMTrace.o(11263417516032L, 83919);
    return false;
  }
  
  public final void it(boolean paramBoolean)
  {
    GMTrace.i(11263551733760L, 83920);
    w.j("MicroMsg.cs.VoipCsAudioManager", "enableSpeaker: " + paramBoolean, new Object[0]);
    w.d("MicroMsg.cs.VoipCsAudioManager", "MMCore.getAudioManager() " + ap.AT().sq());
    if (ap.AT().sm()) {
      paramBoolean = false;
    }
    if (p.gJc.gFM)
    {
      p.gJc.dump();
      if (p.gJc.gFN > 0) {
        ir(paramBoolean);
      }
    }
    if ((p.gJc.gGo >= 0) || (p.gJc.gGp >= 0)) {
      ir(paramBoolean);
    }
    com.tencent.mm.plugin.voip_cs.b.b.a locala;
    if (this.rod != null)
    {
      i = this.rod.brK();
      ap.AT().a(paramBoolean, i);
      locala = com.tencent.mm.plugin.voip_cs.b.b.buw();
      if (!paramBoolean) {
        break label201;
      }
    }
    label201:
    for (int i = locala.mYp.qO(401);; i = locala.mYp.qO(402))
    {
      if (i < 0) {
        com.tencent.mm.plugin.voip.b.a.dJ("MicroMsg.VoipCSEngine", "voipContext trySwitchSpeakerPhone ret:" + i);
      }
      GMTrace.o(11263551733760L, 83920);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */