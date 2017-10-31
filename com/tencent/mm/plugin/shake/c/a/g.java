package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.c.c.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.Map;

public final class g
  extends l.b
  implements com.tencent.mm.ac.e
{
  private static int pvY;
  public float gBS;
  public float gBT;
  private a.a gBY;
  private com.tencent.mm.modelgeo.c hpz;
  public int kjz;
  public int kpb;
  public boolean mBV;
  private ae mHandler;
  public String mQF;
  private long pvZ;
  private c pwt;
  public e pwu;
  public boolean pwv;
  
  static
  {
    GMTrace.i(6522713145344L, 48598);
    pvY = 0;
    GMTrace.o(6522713145344L, 48598);
  }
  
  public g(l.a parama)
  {
    super(parama);
    GMTrace.i(6519626137600L, 48575);
    this.pwu = new e();
    this.pvZ = 0L;
    this.mHandler = new ae();
    this.kjz = 0;
    this.mQF = "";
    this.mBV = false;
    this.pwv = false;
    this.gBS = -85.0F;
    this.gBT = -1000.0F;
    this.gBY = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15393833877504L, 114693);
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(15393833877504L, 114693);
          return true;
        }
        if ((g.this.gBS == -85.0F) && (g.this.gBT == -1000.0F))
        {
          g.this.gBS = paramAnonymousFloat2;
          g.this.gBT = paramAnonymousFloat1;
          m.bdC().gBS = g.this.gBS;
          m.bdC().gBT = g.this.gBT;
          if (g.this.pwv)
          {
            w.i("MicroMsg.ShakeCardService", "ShakeCardService do netscen from onGetLocation()");
            g.this.bdF();
          }
        }
        GMTrace.o(15393833877504L, 114693);
        return false;
      }
    };
    GMTrace.o(6519626137600L, 48575);
  }
  
  private void aij()
  {
    GMTrace.i(6520834097152L, 48584);
    if (this.hpz != null) {
      this.hpz.c(this.gBY);
    }
    GMTrace.o(6520834097152L, 48584);
  }
  
  private void bdG()
  {
    GMTrace.i(6521102532608L, 48586);
    long l2 = System.currentTimeMillis() / 1000L;
    if (a.ty(pvY)) {
      w.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is valid");
    }
    for (long l1 = a.tz(pvY);; l1 = a.tA(a.bdT()))
    {
      w.i("MicroMsg.ShakeCardService", "ShakeCardService updateWaitingTime wait nextInterval is " + l1);
      this.pvZ = (l1 + l2);
      GMTrace.o(6521102532608L, 48586);
      return;
      w.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is not valid");
    }
  }
  
  private void bdi()
  {
    GMTrace.i(6520699879424L, 48583);
    this.hpz = com.tencent.mm.modelgeo.c.Io();
    this.hpz.a(this.gBY, true);
    GMTrace.o(6520699879424L, 48583);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6520968314880L, 48585);
    if ((paramk instanceof c))
    {
      paramk = (c)paramk;
      paramString = this.pwu;
      paramk = paramk.pvX;
      paramString.kpb = paramk.kpb;
      paramString.knp = paramk.knp;
      paramString.fMw = paramk.fMw;
      paramString.title = paramk.title;
      paramString.kns = paramk.kns;
      paramString.knt = paramk.knt;
      paramString.koD = paramk.koD;
      paramString.knr = paramk.knr;
      paramString.hbA = paramk.hbA;
      paramString.pvY = paramk.pvY;
      paramString.pwb = paramk.pwb;
      paramString.pwc = paramk.pwc;
      paramString.pwd = paramk.pwd;
      paramString.pwe = paramk.pwe;
      paramString.pwf = paramk.pwf;
      paramString.knw = paramk.knw;
      paramString.pwg = paramk.pwg;
      paramString.pwh = paramk.pwh;
      this.kpb = this.pwu.kpb;
      w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd()  action_type:" + this.kpb + "  frequency_level:" + pvY + " control_flag:" + this.pwu.pwb);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label346;
      }
      pvY = this.pwu.pvY;
      w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd is OK ");
      if (this.pvE != null) {
        this.pvE.a(1250, this.pwu, 1L);
      }
      bdG();
    }
    for (;;)
    {
      m.bdC().pvY = pvY;
      m.bdC().pvZ = this.pvZ;
      this.mBV = false;
      GMTrace.o(6520968314880L, 48585);
      return;
      label346:
      if (((paramInt1 == 5) && (paramInt2 == -1)) || ((paramInt1 == 4) && (paramInt2 != 0)))
      {
        w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + paramInt1 + " errCode is " + paramInt2);
        if (this.pvE != null) {
          this.pvE.a(1250, this.pwu, 2L);
        }
        long l1 = System.currentTimeMillis() / 1000L;
        long l2 = a.tA(a.bdT());
        w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd wait nextInterval is " + l2);
        this.pvZ = (l1 + l2);
      }
      else
      {
        w.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + paramInt1 + " errCode is " + paramInt2);
        if (this.pvE != null) {
          this.pvE.a(1250, this.pwu, 2L);
        }
        bdG();
      }
    }
  }
  
  public final void bdF()
  {
    GMTrace.i(6520163008512L, 48579);
    if (this.mBV)
    {
      w.i("MicroMsg.ShakeCardService", "ShakeCardService is doing doNetSceneShakeCard, return");
      GMTrace.o(6520163008512L, 48579);
      return;
    }
    this.mBV = true;
    this.pwv = false;
    w.i("MicroMsg.ShakeCardService", "ShakeCardService do doNetSceneShakeCard");
    this.pwt = new c(this.gBT, this.gBS, this.kjz, this.mQF);
    ap.wT().a(this.pwt, 0);
    GMTrace.o(6520163008512L, 48579);
  }
  
  public final void bdj()
  {
    GMTrace.i(6520565661696L, 48582);
    ap.wT().b(1250, this);
    aij();
    super.bdj();
    GMTrace.o(6520565661696L, 48582);
  }
  
  public final void init()
  {
    GMTrace.i(6519760355328L, 48576);
    pvY = m.bdC().pvY;
    this.pvZ = m.bdC().pvZ;
    this.gBS = m.bdC().gBS;
    this.gBT = m.bdC().gBT;
    ap.wT().a(1250, this);
    bdi();
    GMTrace.o(6519760355328L, 48576);
  }
  
  public final void pause()
  {
    GMTrace.i(6520297226240L, 48580);
    aij();
    GMTrace.o(6520297226240L, 48580);
  }
  
  public final void reset()
  {
    GMTrace.i(6519894573056L, 48577);
    if (this.pwt != null) {
      ap.wT().c(this.pwt);
    }
    GMTrace.o(6519894573056L, 48577);
  }
  
  public final void resume()
  {
    GMTrace.i(6520431443968L, 48581);
    if (this.hpz != null) {
      this.hpz.a(this.gBY, true);
    }
    GMTrace.o(6520431443968L, 48581);
  }
  
  public final void start()
  {
    GMTrace.i(6520028790784L, 48578);
    init();
    reset();
    if (this.hpz == null) {
      bdi();
    }
    this.hpz.b(this.gBY, true);
    Object localObject = m.bdC();
    if ((!TextUtils.isEmpty("key_shake_card_item")) && (((d)localObject).kmM.containsKey("key_shake_card_item"))) {}
    long l1;
    long l2;
    for (localObject = ((d)localObject).kmM.get("key_shake_card_item");; localObject = null)
    {
      l1 = System.currentTimeMillis() / 1000L;
      l2 = this.pvZ;
      if ((localObject == null) || (!(localObject instanceof e))) {
        break;
      }
      localObject = (e)localObject;
      this.pvE.a(1250, (e)localObject, 1L);
      m.bdC().putValue("key_shake_card_item", null);
      w.i("MicroMsg.ShakeCardService", "getlbscard return data is no empty, don't do doNetSceneShakeCard, return ok");
      GMTrace.o(6520028790784L, 48578);
      return;
    }
    int i;
    if (this.pvZ == 0L) {
      i = 1;
    }
    while (i != 0) {
      if (this.mBV)
      {
        w.i("MicroMsg.ShakeCardService", "ShakeCardService is doing netscene, return");
        GMTrace.o(6520028790784L, 48578);
        return;
        if (l1 - l2 >= 0L)
        {
          i = 1;
        }
        else
        {
          com.tencent.mm.plugin.report.service.g.paX.i(11666, new Object[] { Integer.valueOf(this.kjz) });
          this.mHandler.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6524055322624L, 48608);
              g.this.pwu.kpb = 3;
              g.this.kpb = g.this.pwu.kpb;
              g.this.pwu.pwf = m.bdC().pwa;
              if (g.a(g.this) != null) {
                g.b(g.this).a(1250, g.this.pwu, 2L);
              }
              GMTrace.o(6524055322624L, 48608);
            }
          }, 3000L);
          w.i("MicroMsg.ShakeCardService", "ShakeCardService do not doNetSceneShakeCard, because time is not expire");
          i = 0;
        }
      }
      else
      {
        if ((this.gBS == -85.0F) || (this.gBT == -1000.0F))
        {
          this.pwv = true;
          w.i("MicroMsg.ShakeCardService", "ShakeCardService location is not geted, wait 4 second");
          this.mHandler.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6523652669440L, 48605);
              if (!g.this.mBV) {
                g.this.bdF();
              }
              GMTrace.o(6523652669440L, 48605);
            }
          }, 4000L);
          GMTrace.o(6520028790784L, 48578);
          return;
        }
        bdF();
      }
    }
    GMTrace.o(6520028790784L, 48578);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */