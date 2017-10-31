package com.tencent.mm.plugin.ipcall.a.c;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.bl.b;
import com.tencent.mm.plugin.ipcall.a.d.o;
import com.tencent.mm.plugin.ipcall.a.g;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.bmf;
import com.tencent.mm.protocal.c.bno;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;

public final class a
{
  public v2protocal mYp;
  private ae mYq;
  private boolean mYr;
  public boolean mYs;
  public boolean mYt;
  public a mYu;
  
  public a()
  {
    GMTrace.i(11569433935872L, 86199);
    this.mYr = false;
    this.mYs = false;
    this.mYt = false;
    this.mYu = null;
    this.mYq = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11571715637248L, 86216);
        if ((paramAnonymousMessage == null) || (paramAnonymousMessage.what != 59998))
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(11571715637248L, 86216);
          return;
        }
        w.d("MicroMsg.IPCallEngineManager", "msg.what: %d, msg.obj: %s, msg.arg1: %s, msg.arg2: %s", new Object[] { Integer.valueOf(paramAnonymousMessage.what), paramAnonymousMessage.obj, Integer.valueOf(paramAnonymousMessage.arg1), Integer.valueOf(paramAnonymousMessage.arg2) });
        switch (paramAnonymousMessage.arg1)
        {
        }
        for (;;)
        {
          GMTrace.o(11571715637248L, 86216);
          return;
          paramAnonymousMessage = a.this;
          w.d("MicroMsg.IPCallEngineManager", "channel connect!");
          if (paramAnonymousMessage.mYs)
          {
            w.d("MicroMsg.IPCallEngineManager", "channel already connect! do call not startEngine again");
            GMTrace.o(11571715637248L, 86216);
            return;
          }
          int i = paramAnonymousMessage.mYp.startEngine();
          w.d("MicroMsg.IPCallEngineManager", "startNativeEngine, ret: %d", new Object[] { Integer.valueOf(i) });
          if (i == 0) {}
          for (paramAnonymousMessage.mYp.rsk = 0;; paramAnonymousMessage.mYp.rsk = 1)
          {
            paramAnonymousMessage.mYp.setInactive();
            paramAnonymousMessage.mYs = true;
            if (paramAnonymousMessage.mYu != null) {
              paramAnonymousMessage.mYu.aGI();
            }
            GMTrace.o(11571715637248L, 86216);
            return;
          }
          w.d("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEV");
          GMTrace.o(11571715637248L, 86216);
          return;
          w.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_STARTDEVFAILED");
          paramAnonymousMessage = a.this;
          w.d("MicroMsg.IPCallEngineManager", "handleStartDevFailed");
          if (paramAnonymousMessage.mYu != null) {
            paramAnonymousMessage.mYu.aGH();
          }
          GMTrace.o(11571715637248L, 86216);
          return;
          w.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_RESET");
          if (paramAnonymousMessage.arg2 == 4)
          {
            w.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_BROKEN");
            a.this.pe(34);
            GMTrace.o(11571715637248L, 86216);
            return;
          }
          if (paramAnonymousMessage.arg2 == 1)
          {
            w.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_FAIL");
            a.this.pe(20);
            GMTrace.o(11571715637248L, 86216);
            return;
          }
          if (paramAnonymousMessage.arg2 == 5)
          {
            w.i("MicroMsg.IPCallEngineManager", "CHANNEL_EVENT_NETWORK_ERROR");
            a.this.pe(30);
            GMTrace.o(11571715637248L, 86216);
            return;
            w.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_FIRST_PKT");
            GMTrace.o(11571715637248L, 86216);
            return;
            w.i("MicroMsg.IPCallEngineManager", "NOTIFY_FROM_JNI_ANSWER_MARK");
            w.i("MicroMsg.IPCallEngineManager", "handleChannelAccept");
            paramAnonymousMessage = i.aHl();
            w.i("MicroMsg.IPCallSvrLogic", "handleChannelAccept");
            if (paramAnonymousMessage.fJI)
            {
              w.i("MicroMsg.IPCallSvrLogic", "current status has accepted, ignore channel accept");
              GMTrace.o(11571715637248L, 86216);
              return;
            }
            paramAnonymousMessage.mWA = true;
            if (paramAnonymousMessage.mWy != null)
            {
              paramAnonymousMessage.mWy.iVw = 2;
              o localo = new o(paramAnonymousMessage.mWy.mXg, paramAnonymousMessage.mWy.mXh, paramAnonymousMessage.mWy.aHC(), paramAnonymousMessage.mWy.mXi, true);
              ap.wT().a(localo, 0);
            }
            paramAnonymousMessage.pd(2);
          }
        }
      }
    };
    this.mYp = new v2protocal(this.mYq);
    GMTrace.o(11569433935872L, 86199);
  }
  
  public final void aHG()
  {
    GMTrace.i(11569568153600L, 86200);
    w.d("MicroMsg.IPCallEngineManager", "setChannelActiveAfterAccept");
    if (!this.mYs) {
      w.d("MicroMsg.IPCallEngineManager", "channel not connect now");
    }
    this.mYp.setActive();
    GMTrace.o(11569568153600L, 86200);
  }
  
  public final void aHH()
  {
    GMTrace.i(11569702371328L, 86201);
    if (this.mYr)
    {
      w.d("MicroMsg.IPCallEngineManager", "requestChannelConnect, already request channel connect");
      GMTrace.o(11569702371328L, 86201);
      return;
    }
    w.i("MicroMsg.IPCallEngineManager", "requestChannelConnect");
    com.tencent.mm.plugin.ipcall.a.a.c localc = i.aHl().mWy;
    if (localc != null)
    {
      if (localc.jOo != null)
      {
        bmf localbmf1 = com.tencent.mm.plugin.ipcall.b.c.Y(localc.jOo);
        bmf localbmf2 = com.tencent.mm.plugin.ipcall.b.c.Y(localc.mXE);
        bno localbno = new bno();
        localbno.uDY = 0;
        localbno.uDZ = 0;
        localbno.uEa = 0;
        localbno.userName = "";
        localbno.mbz = "";
        this.mYp.a(localbmf1, localbmf1, localbmf2, localbno);
      }
      w.d("MicroMsg.IPCallEngineManager", "finish set svr addr");
      this.mYp.rrO = localc.mXz;
      this.mYp.rsG = localc.mXC;
      if (localc.mXD != null) {
        this.mYp.rsH = localc.mXD.toByteArray();
      }
      if (localc.mXA != null) {
        this.mYp.rrP = localc.mXA.toByteArray();
      }
      this.mYp.mXg = localc.mXg;
      this.mYp.mXh = localc.mXh;
      this.mYp.mXo = localc.mXo;
      this.mYp.rrR = localc.mXx;
      this.mYp.rrQ = localc.mXy;
      this.mYp.rrS = localc.mXF;
      if (this.mYp.rrP != null) {
        break label450;
      }
    }
    label450:
    for (int i = 0;; i = this.mYp.rrP.length)
    {
      i = this.mYp.setConfigConnect(this.mYp.rrJ, this.mYp.mXg, this.mYp.mXo, this.mYp.mXh, this.mYp.field_peerId, 1, this.mYp.rrQ, this.mYp.rrR, this.mYp.rrO, i, this.mYp.rrP, this.mYp.rrS, 0, 0, this.mYp.rsG, this.mYp.rsH, 255, 0);
      w.d("MicroMsg.IPCallEngineManager", "setConfigConnect, ret: %d", new Object[] { Integer.valueOf(i) });
      if (i < 0)
      {
        w.e("MicroMsg.IPCallEngineManager", "setConfigConnect failed, ret: %d", new Object[] { Integer.valueOf(i) });
        if (this.mYu != null) {
          this.mYu.oZ(21);
        }
      }
      this.mYr = true;
      GMTrace.o(11569702371328L, 86201);
      return;
    }
  }
  
  public final void aHI()
  {
    GMTrace.i(11569970806784L, 86203);
    this.mYs = false;
    this.mYr = false;
    this.mYt = false;
    GMTrace.o(11569970806784L, 86203);
  }
  
  public final void pe(int paramInt)
  {
    GMTrace.i(16062372380672L, 119674);
    w.d("MicroMsg.IPCallEngineManager", "channel connect failed!");
    if (this.mYu != null) {
      this.mYu.oZ(paramInt);
    }
    GMTrace.o(16062372380672L, 119674);
  }
  
  public final void pf(int paramInt)
  {
    GMTrace.i(11569836589056L, 86202);
    if (!this.mYs)
    {
      GMTrace.o(11569836589056L, 86202);
      return;
    }
    w.d("MicroMsg.IPCallEngineManager", "setDtmfPayloadType: %d", new Object[] { Integer.valueOf(paramInt) });
    paramInt = this.mYp.SetDTMFPayload(paramInt);
    if (paramInt < 0) {
      w.i("MicroMsg.IPCallEngineManager", "setDtmfPayloadType failed, ret: %d", new Object[] { Integer.valueOf(paramInt) });
    }
    GMTrace.o(11569836589056L, 86202);
  }
  
  public static abstract interface a
  {
    public abstract void aGH();
    
    public abstract void aGI();
    
    public abstract void oZ(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */