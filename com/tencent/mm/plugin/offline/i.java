package com.tencent.mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.offline.a.f;
import com.tencent.mm.plugin.offline.a.l;
import com.tencent.mm.plugin.offline.a.m;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.ArrayList;

public final class i
  implements e
{
  public ae mHandler;
  private boolean omR;
  private boolean omS;
  private int omT;
  private int omU;
  private String omV;
  a omW;
  private m omX;
  public b omY;
  public int omZ;
  public aj ona;
  
  public i()
  {
    GMTrace.i(6239916392448L, 46491);
    this.omR = false;
    this.omS = false;
    this.omT = 10;
    this.omU = 0;
    this.omV = "";
    this.mHandler = new ae();
    this.omY = new b();
    this.omZ = 14400000;
    this.ona = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(6253338165248L, 46591);
        if (!ap.AV())
        {
          localaj = i.this.ona;
          l = i.this.omZ;
          localaj.w(l, l);
          GMTrace.o(6253338165248L, 46591);
          return false;
        }
        i.this.cE(5, 5);
        aj localaj = i.this.ona;
        i locali = i.this;
        long l = com.tencent.mm.plugin.offline.c.a.aUL();
        if (l <= 0L) {}
        for (l = locali.omZ;; l = 1000L * l)
        {
          localaj.w(l, l);
          GMTrace.o(6253338165248L, 46591);
          return false;
          w.i("MicroMsg.OfflineTokensMgr", "OfflineTokensMgr updateInterval:" + l);
        }
      }
    }, false);
    try
    {
      com.tencent.mm.wallet_core.c.a.ciD();
      com.tencent.mm.wallet_core.c.a.init(ab.getContext());
      ap.wT().a(385, this);
      k.aTF();
      Object localObject = k.rR(196649);
      if ((TextUtils.isEmpty((CharSequence)localObject)) || (!com.tencent.mm.plugin.offline.c.a.ul((String)localObject)))
      {
        w.i("MicroMsg.OfflineTokensMgr", "genInitInterval: update_interval is empty or is not number,update token");
        w.i("MicroMsg.OfflineTokensMgr", "autoPusher startTimer interval=" + l1);
        localObject = this.ona;
        l1 *= 1000L;
        ((aj)localObject).w(l1, l1);
        GMTrace.o(6239916392448L, 46491);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.OfflineTokensMgr", "NO MPERMISSION for READ_PHONE_STATE:%s.", new Object[] { localException });
        continue;
        String str = com.tencent.mm.plugin.offline.c.a.aUx();
        w.i("MicroMsg.OfflineTokensMgr", "genInitInterval: token is not over update interval,lastUpdate is " + str);
        long l2 = Long.valueOf(localException).longValue();
        if (TextUtils.isEmpty(str))
        {
          w.i("MicroMsg.OfflineTokensMgr", "genInitInterval lastUpdate is empty, update token");
        }
        else
        {
          l1 = Long.valueOf(str).longValue();
          long l3 = System.currentTimeMillis() / 1000L;
          w.i("MicroMsg.OfflineTokensMgr", "genInitInterval token is not over update interval,curTime = " + l3 + ";");
          l1 = l2 - (l3 - l1);
        }
      }
    }
  }
  
  public static int aTE()
  {
    GMTrace.i(6240050610176L, 46492);
    k.aTF();
    String str = k.rR(196617);
    com.tencent.mm.wallet_core.c.a.ciD();
    int i = com.tencent.mm.wallet_core.c.a.getTokenCount(str, true);
    w.i("MicroMsg.OfflineTokensMgr", "offline tokens count:" + i);
    GMTrace.o(6240050610176L, 46492);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(6240721698816L, 46497);
    if ((!(paramk instanceof com.tencent.mm.plugin.offline.a.h)) && (!(paramk instanceof f)))
    {
      GMTrace.o(6240721698816L, 46497);
      return;
    }
    paramString = new ArrayList();
    if ((paramk instanceof m))
    {
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      localIDKey.SetKey(2);
      paramString.add(localIDKey);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        localIDKey = new IDKey();
        localIDKey.SetID(135);
        localIDKey.SetValue(1L);
        localIDKey.SetKey(3);
        paramString.add(localIDKey);
      }
      g.paX.b(paramString, true);
    }
    if (((paramk instanceof f)) && (((paramInt1 == 0) && (paramInt2 == 0)) || (paramInt1 != 0)))
    {
      w.i("MicroMsg.OfflineTokensMgr", "onSceneEnd NetSceneOfflineVerifyToken errType %d errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (this.omX != null)
      {
        this.omX.aTM();
        this.omX = null;
        if (this.omW != null) {
          this.omW.aTz();
        }
      }
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof m))
      {
        this.omU = 0;
        this.omR = false;
        this.mHandler.removeCallbacks(this.omY);
        this.omX = ((m)paramk);
        paramString = this.omX.onX;
        k.aTF();
        paramString = new f(paramString, k.rR(196617));
        ap.wT().a(paramString, 0);
        GMTrace.o(6240721698816L, 46497);
        return;
      }
      if ((paramk instanceof l))
      {
        this.omS = false;
        this.omV = ((l)paramk).omV;
        if (this.omW != null) {
          this.omW.aTz();
        }
        GMTrace.o(6240721698816L, 46497);
        return;
      }
      if ((paramk instanceof f)) {
        GMTrace.o(6240721698816L, 46497);
      }
    }
    else
    {
      if ((paramk instanceof m))
      {
        w.e("MicroMsg.OfflineTokensMgr", "gettoken is failed!");
        this.omU += 1;
        this.omR = false;
        if (paramInt2 == 411)
        {
          w.i("MicroMsg.OfflineTokensMgr", "errcode is  411, do clearAllOfflineData");
          com.tencent.mm.plugin.offline.c.a.aUA();
          GMTrace.o(6240721698816L, 46497);
          return;
        }
        if (this.omU < this.omT)
        {
          this.mHandler.removeCallbacks(this.omY);
          paramInt2 = this.omU - 1;
          paramInt1 = paramInt2;
          if (paramInt2 > 6) {
            paramInt1 = 6;
          }
          paramInt1 = (int)Math.pow(2.0D, paramInt1);
          this.mHandler.postDelayed(this.omY, paramInt1 * 60 * 1000);
        }
        GMTrace.o(6240721698816L, 46497);
        return;
      }
      if ((paramk instanceof l))
      {
        this.omS = false;
        GMTrace.o(6240721698816L, 46497);
        return;
      }
      if ((paramk instanceof f)) {
        this.omX = null;
      }
    }
    GMTrace.o(6240721698816L, 46497);
  }
  
  public final void cE(int paramInt1, int paramInt2)
  {
    GMTrace.i(14312038989824L, 106633);
    if ((am.isNetworkConnected(ab.getContext())) && (com.tencent.mm.plugin.offline.c.a.aUp()))
    {
      w.i("MicroMsg.OfflineTokensMgr", "onNotify return false, token is invalid, do doNetSceneToken");
      cG(paramInt1, paramInt2);
      GMTrace.o(14312038989824L, 106633);
      return;
    }
    GMTrace.o(14312038989824L, 106633);
  }
  
  public final void cF(int paramInt1, final int paramInt2)
  {
    GMTrace.i(14312307425280L, 106635);
    if (aTE() > 2)
    {
      this.mHandler.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6253069729792L, 46589);
          i.this.cG(this.onc, paramInt2);
          GMTrace.o(6253069729792L, 46589);
        }
      }, 3000L);
      GMTrace.o(14312307425280L, 106635);
      return;
    }
    cG(2, paramInt2);
    GMTrace.o(14312307425280L, 106635);
  }
  
  public final void cG(int paramInt1, int paramInt2)
  {
    int j = 0;
    GMTrace.i(14312441643008L, 106636);
    if (this.omR)
    {
      GMTrace.o(14312441643008L, 106636);
      return;
    }
    this.omR = true;
    Object localObject = new m(System.currentTimeMillis() / 1000L, paramInt1, paramInt2);
    ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
    boolean bool1 = com.tencent.mm.plugin.offline.c.a.cQ(ab.getContext());
    boolean bool2 = com.tencent.pb.common.b.h.isNetworkConnected();
    localObject = g.paX;
    int i;
    if (bool1)
    {
      paramInt2 = 0;
      if (!bool2) {
        break label482;
      }
      i = 1;
      label107:
      if (k.onk) {
        j = 1;
      }
      ((g)localObject).i(14163, new Object[] { Integer.valueOf(4), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(j) });
      localObject = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool2) {
        break label487;
      }
      paramInt2 = 36;
      label212:
      localIDKey.SetKey(paramInt2);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool1) {
        break label493;
      }
      paramInt2 = 38;
      label257:
      localIDKey.SetKey(paramInt2);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!k.onk) {
        break label499;
      }
      paramInt2 = 40;
      label303:
      localIDKey.SetKey(paramInt2);
      ((ArrayList)localObject).add(localIDKey);
      if (paramInt1 != 2) {
        break label523;
      }
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!k.onk) {
        break label505;
      }
      paramInt1 = 42;
      label354:
      localIDKey.SetKey(paramInt1);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool1) {
        break label511;
      }
      paramInt1 = 44;
      label399:
      localIDKey.SetKey(paramInt1);
      ((ArrayList)localObject).add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(135);
      localIDKey.SetValue(1L);
      if (!bool2) {
        break label517;
      }
      paramInt1 = 46;
      label444:
      localIDKey.SetKey(paramInt1);
      ((ArrayList)localObject).add(localIDKey);
    }
    label482:
    label487:
    label493:
    label499:
    label505:
    label511:
    label517:
    label523:
    label561:
    label606:
    label674:
    label680:
    do
    {
      g.paX.b((ArrayList)localObject, true);
      GMTrace.o(14312441643008L, 106636);
      return;
      paramInt2 = 1;
      break;
      i = 0;
      break label107;
      paramInt2 = 37;
      break label212;
      paramInt2 = 39;
      break label257;
      paramInt2 = 41;
      break label303;
      paramInt1 = 43;
      break label354;
      paramInt1 = 45;
      break label399;
      paramInt1 = 47;
      break label444;
      if (paramInt1 == 6)
      {
        localIDKey = new IDKey();
        localIDKey.SetID(135);
        localIDKey.SetValue(1L);
        if (k.onk)
        {
          paramInt1 = 48;
          localIDKey.SetKey(paramInt1);
          ((ArrayList)localObject).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(135);
          localIDKey.SetValue(1L);
          if (!bool1) {
            break label674;
          }
          paramInt1 = 50;
          localIDKey.SetKey(paramInt1);
          ((ArrayList)localObject).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(135);
          localIDKey.SetValue(1L);
          if (!bool2) {
            break label680;
          }
        }
        for (paramInt1 = 52;; paramInt1 = 53)
        {
          localIDKey.SetKey(paramInt1);
          ((ArrayList)localObject).add(localIDKey);
          break;
          paramInt1 = 49;
          break label561;
          paramInt1 = 51;
          break label606;
        }
      }
    } while (paramInt1 != 6);
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(135);
    localIDKey.SetValue(1L);
    if (bool1) {}
    for (paramInt1 = 54;; paramInt1 = 55)
    {
      localIDKey.SetKey(paramInt1);
      ((ArrayList)localObject).add(localIDKey);
      break;
    }
  }
  
  public final boolean gv(boolean paramBoolean)
  {
    GMTrace.i(14312173207552L, 106634);
    if (!com.tencent.mm.plugin.offline.c.a.aUp())
    {
      w.e("MicroMsg.OfflineTokensMgr", "offline is not create!");
      GMTrace.o(14312173207552L, 106634);
      return false;
    }
    if (aTE() < k.onl)
    {
      w.i("MicroMsg.OfflineTokensMgr", "getTokenCount < %s, do doNetSceneToken", new Object[] { Integer.valueOf(k.onl) });
      com.tencent.mm.wallet_core.c.a.ciD();
      int i = com.tencent.mm.wallet_core.c.a.getLastError();
      if (i != 0)
      {
        w.e("MicroMsg.OfflineTokensMgr", "getTokenCount occurs error, the error is " + i + ", don't  doNetSceneToken");
        GMTrace.o(14312173207552L, 106634);
        return false;
      }
      w.i("MicroMsg.OfflineTokensMgr", "getTokenCount is success! do doNetSceneToken");
      if (paramBoolean) {
        cF(2, 9);
      }
      for (;;)
      {
        GMTrace.o(14312173207552L, 106634);
        return true;
        cF(2, 2);
      }
    }
    if (com.tencent.mm.plugin.offline.c.a.aUM())
    {
      w.i("MicroMsg.OfflineTokensMgr", "WalletOfflineUtil.isTokenOverUpdateInterval() return false, token is over update_interval, do doNetSceneToken");
      if (paramBoolean) {
        cG(5, 9);
      }
      for (;;)
      {
        GMTrace.o(14312173207552L, 106634);
        return true;
        cG(5, 5);
      }
    }
    if (!com.tencent.mm.plugin.offline.c.a.aUJ())
    {
      w.i("MicroMsg.OfflineTokensMgr", "WalletOfflineUtil.isSameMD5ForBindSerial() return false, bindserial is change, do doNetSceneToken");
      if (paramBoolean) {
        cG(3, 9);
      }
      for (;;)
      {
        GMTrace.o(14312173207552L, 106634);
        return true;
        cG(3, 3);
      }
    }
    GMTrace.o(14312173207552L, 106634);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void aTz();
  }
  
  private final class b
    implements Runnable
  {
    public b()
    {
      GMTrace.i(6187839913984L, 46103);
      GMTrace.o(6187839913984L, 46103);
    }
    
    public final void run()
    {
      GMTrace.i(6187974131712L, 46104);
      w.i("MicroMsg.OfflineTokensMgr", "mUpdateTokenRunnable, do doNetSceneToken");
      i.this.cG(6, 6);
      GMTrace.o(6187974131712L, 46104);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */