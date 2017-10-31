package com.tencent.mm.plugin.ipcall.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.b.e.a;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.ui.j;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver;
import com.tencent.mm.plugin.voip.HeadsetPlugReceiver.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.ap;

public final class b
  implements e.a, d.a, HeadsetPlugReceiver.a
{
  public MMActivity fsU;
  public com.tencent.mm.compatible.util.b hWD;
  public a mXT;
  public c mXU;
  public d mXV;
  public HeadsetPlugReceiver mXW;
  public j mXX;
  private boolean mXY;
  public a mXZ;
  public boolean mYa;
  public boolean mYb;
  public long mYc;
  
  public b()
  {
    GMTrace.i(11604330545152L, 86459);
    this.mXY = false;
    this.mYa = false;
    this.mYb = false;
    this.mYc = 0L;
    this.mXT = new a();
    this.mXU = new c();
    this.mXV = new d();
    this.hWD = new com.tencent.mm.compatible.util.b(ab.getContext());
    this.mXW = new HeadsetPlugReceiver();
    GMTrace.o(11604330545152L, 86459);
  }
  
  public final void a(j paramj)
  {
    GMTrace.i(11604464762880L, 86460);
    this.mXX = paramj;
    if (paramj != null) {
      i.aHq().aGM();
    }
    GMTrace.o(11604464762880L, 86460);
  }
  
  public final void aHE()
  {
    GMTrace.i(11604598980608L, 86461);
    c localc = this.mXU;
    if (localc.fGc)
    {
      w.d("MicroMsg.IPCallRecorder", "startRecorder, already start");
      GMTrace.o(11604598980608L, 86461);
      return;
    }
    w.i("MicroMsg.IPCallRecorder", "start record");
    localc.fGc = true;
    localc.mYf = i.aHo().mXT.mXP;
    if (localc.mYf <= 10)
    {
      if (localc.mYf <= 0)
      {
        w.e("MicroMsg.IPCallRecorder", "playDelayInMs<=0");
        i.aHn().aHM();
      }
      localc.mYf = 92;
    }
    synchronized (localc.mYe)
    {
      com.tencent.mm.sdk.f.e.post(new c.2(localc), "IPCallRecorder_startRecord");
      GMTrace.o(11604598980608L, 86461);
      return;
    }
  }
  
  public final int aHF()
  {
    GMTrace.i(11605270069248L, 86466);
    a locala = this.mXT;
    if ((locala.mXN != null) && (locala.fGc))
    {
      int i = locala.mXN.brK();
      GMTrace.o(11605270069248L, 86466);
      return i;
    }
    GMTrace.o(11605270069248L, 86466);
    return -1;
  }
  
  public final void dc(int paramInt)
  {
    GMTrace.i(11605001633792L, 86464);
    w.i("MicroMsg.IPCallDeviceManager", "onAudioStatChange, status: %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(11605001633792L, 86464);
      return;
      ap.AT().sk();
      if ((ap.AT().sm()) && (this.mXZ != null))
      {
        this.mXZ.fr(true);
        GMTrace.o(11605001633792L, 86464);
        return;
        this.mYa = true;
        if ((this.mXZ != null) && (!this.mYb))
        {
          this.mXZ.fs(true);
          GMTrace.o(11605001633792L, 86464);
          return;
          this.mYa = false;
          if ((this.mXZ != null) && (!this.mYb)) {
            this.mXZ.fs(false);
          }
        }
      }
    }
  }
  
  public final void fo(boolean paramBoolean)
  {
    GMTrace.i(11604733198336L, 86462);
    this.mXT.fo(paramBoolean);
    GMTrace.o(11604733198336L, 86462);
  }
  
  public final void fp(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(11604867416064L, 86463);
    w.i("MicroMsg.IPCallDeviceManager", "onScreenDistanceChange, isClose: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    MMActivity localMMActivity;
    if (this.fsU != null)
    {
      localMMActivity = this.fsU;
      if (paramBoolean) {
        break label86;
      }
    }
    for (;;)
    {
      localMMActivity.dq(bool);
      if (!i.aHp().aHg()) {
        break label102;
      }
      if (!paramBoolean) {
        break;
      }
      this.mXY = a.sr();
      this.mXT.fo(false);
      GMTrace.o(11604867416064L, 86463);
      return;
      label86:
      bool = false;
    }
    this.mXT.fo(this.mXY);
    label102:
    GMTrace.o(11604867416064L, 86463);
  }
  
  public final void fq(boolean paramBoolean)
  {
    GMTrace.i(11605135851520L, 86465);
    w.i("MicroMsg.IPCallDeviceManager", "onHeadsetState, on: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((this.mXZ != null) && (paramBoolean != this.mYb))
    {
      this.mYb = paramBoolean;
      if (!this.mYa) {
        this.mXZ.fr(paramBoolean);
      }
    }
    GMTrace.o(11605135851520L, 86465);
  }
  
  public static abstract interface a
  {
    public abstract void fr(boolean paramBoolean);
    
    public abstract void fs(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */