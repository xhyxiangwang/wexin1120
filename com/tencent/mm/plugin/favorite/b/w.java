package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.g;
import com.tencent.mm.ac.g.a;
import com.tencent.mm.ac.g.b;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.j;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class w
  implements g.a, g.b, SensorController.a
{
  public static SensorController kha;
  private int fBu;
  private List<a> gBe;
  private boolean khd;
  public ax khe;
  public long khf;
  private boolean khg;
  private boolean khk;
  private g lPs;
  public boolean lPt;
  private int lPu;
  public String path;
  
  public w()
  {
    GMTrace.i(6295348314112L, 46904);
    this.khd = true;
    this.khk = false;
    this.khf = -1L;
    this.gBe = new LinkedList();
    this.lPs = ((j)h.h(j.class)).pu();
    ap.AS();
    Boolean localBoolean = (Boolean)c.xi().get(26, Boolean.valueOf(false));
    this.khg = localBoolean.booleanValue();
    boolean bool;
    if (!localBoolean.booleanValue())
    {
      bool = true;
      this.khd = bool;
      if (this.lPs == null) {
        break label193;
      }
      this.lPs.a(this);
      this.lPs.a(this);
      this.lPs.ay(this.khd);
    }
    for (;;)
    {
      if (kha == null) {
        kha = new SensorController(ab.getContext());
      }
      if (this.khe == null) {
        this.khe = new ax(ab.getContext());
      }
      GMTrace.o(6295348314112L, 46904);
      return;
      bool = false;
      break;
      label193:
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "get voice player fail, it is null");
    }
  }
  
  private void ahk()
  {
    GMTrace.i(6297227362304L, 46918);
    if (kha != null) {
      kha.bNK();
    }
    if (this.khe != null) {
      this.khe.bNL();
    }
    GMTrace.o(6297227362304L, 46918);
  }
  
  public final boolean B(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(6296019402752L, 46909);
    if (this.lPs == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt1) });
      GMTrace.o(6296019402752L, 46909);
      return false;
    }
    this.lPs.stop();
    Object localObject = this.gBe.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((a)((Iterator)localObject).next()).aX(paramString, paramInt2);
    }
    if ((kha != null) && (!kha.uPi))
    {
      kha.a(this);
      localObject = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6294811443200L, 46900);
          w.this.khf = bg.Pq();
          GMTrace.o(6294811443200L, 46900);
        }
      };
      if (!this.khe.L((Runnable)localObject)) {
        break label210;
      }
    }
    label210:
    for (this.khf = 0L;; this.khf = -1L)
    {
      this.path = paramString;
      this.fBu = paramInt1;
      if ((bg.mZ(paramString)) || (!this.lPs.a(paramString, this.khd, paramInt1, paramInt2))) {
        break;
      }
      ad.QZ("keep_app_silent");
      ap.AT().e(this.khd, false);
      GMTrace.o(6296019402752L, 46909);
      return true;
    }
    GMTrace.o(6296019402752L, 46909);
    return false;
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6295482531840L, 46905);
    Iterator localIterator = this.gBe.iterator();
    while (localIterator.hasNext()) {
      if (parama == (a)localIterator.next())
      {
        GMTrace.o(6295482531840L, 46905);
        return;
      }
    }
    this.gBe.add(parama);
    GMTrace.o(6295482531840L, 46905);
  }
  
  public final boolean aW(String paramString, int paramInt)
  {
    GMTrace.i(6295885185024L, 46908);
    if (this.lPs == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(6295885185024L, 46908);
      return false;
    }
    this.lPs.stop();
    Object localObject = this.gBe.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((a)((Iterator)localObject).next()).aX(paramString, 0);
    }
    if ((kha != null) && (!kha.uPi))
    {
      kha.a(this);
      localObject = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6265015107584L, 46678);
          w.this.khf = bg.Pq();
          GMTrace.o(6265015107584L, 46678);
        }
      };
      if (!this.khe.L((Runnable)localObject)) {
        break label193;
      }
    }
    label193:
    for (this.khf = 0L;; this.khf = -1L)
    {
      this.path = paramString;
      this.fBu = paramInt;
      if ((bg.mZ(paramString)) || (!this.lPs.a(paramString, this.khd, true, paramInt))) {
        break;
      }
      ad.QZ("keep_app_silent");
      GMTrace.o(6295885185024L, 46908);
      return true;
    }
    GMTrace.o(6295885185024L, 46908);
    return false;
  }
  
  public final void ahm()
  {
    GMTrace.i(6296824709120L, 46915);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceLogic", "stop play");
    ad.Ra("keep_app_silent");
    if (this.lPs != null) {
      this.lPs.stop();
    }
    ahk();
    GMTrace.o(6296824709120L, 46915);
  }
  
  public final boolean awW()
  {
    GMTrace.i(6296153620480L, 46910);
    if (this.lPs == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "check is play, but player is null");
      GMTrace.o(6296153620480L, 46910);
      return false;
    }
    boolean bool = this.lPs.isPlaying();
    GMTrace.o(6296153620480L, 46910);
    return bool;
  }
  
  public final boolean awX()
  {
    GMTrace.i(6296556273664L, 46913);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceLogic", "resume play");
    ad.QZ("keep_app_silent");
    if (this.lPs == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "resum play error, player is null");
      GMTrace.o(6296556273664L, 46913);
      return false;
    }
    boolean bool = this.lPs.ql();
    GMTrace.o(6296556273664L, 46913);
    return bool;
  }
  
  public final boolean awY()
  {
    GMTrace.i(6296690491392L, 46914);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FavVoiceLogic", "pause play");
    ad.Ra("keep_app_silent");
    if (this.lPs == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "pause play error, player is null");
      GMTrace.o(6296690491392L, 46914);
      return false;
    }
    boolean bool = this.lPs.pause();
    GMTrace.o(6296690491392L, 46914);
    return bool;
  }
  
  public final void destroy()
  {
    GMTrace.i(6295616749568L, 46906);
    pause();
    ahk();
    kha = null;
    this.gBe.clear();
    GMTrace.o(6295616749568L, 46906);
  }
  
  public final void dp(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(6297361580032L, 46919);
    if (bg.mZ(this.path))
    {
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if (this.khk)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.khk = paramBoolean;
        GMTrace.o(6297361580032L, 46919);
        return;
      }
    }
    if ((!paramBoolean) && (this.khf != -1L) && (bg.aG(this.khf) > 400L))
    {
      this.khk = true;
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    this.khk = false;
    if ((this.lPs != null) && (this.lPs.qm()))
    {
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if (this.khg)
    {
      if (this.lPs != null) {
        this.lPs.ay(false);
      }
      ap.AT().e(false, false);
      this.khd = false;
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if ((this.lPs != null) && (!this.lPs.isPlaying()) && (!this.lPt))
    {
      this.lPs.ay(true);
      this.khd = true;
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if (this.lPs != null) {
      this.lPs.ay(paramBoolean);
    }
    this.khd = paramBoolean;
    if ((this.lPt) && (!paramBoolean))
    {
      B(this.path, this.fBu, this.lPu);
      GMTrace.o(6297361580032L, 46919);
      return;
    }
    if (!paramBoolean) {
      aW(this.path, this.fBu);
    }
    GMTrace.o(6297361580032L, 46919);
  }
  
  public final void onError()
  {
    GMTrace.i(6296958926848L, 46916);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceLogic", "on error, do stop play");
    ahm();
    Iterator localIterator = this.gBe.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onFinish();
    }
    GMTrace.o(6296958926848L, 46916);
  }
  
  public final void pause()
  {
    GMTrace.i(6295750967296L, 46907);
    if (this.lPs == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "do pause, but player is null");
      GMTrace.o(6295750967296L, 46907);
      return;
    }
    if (this.lPs.isPlaying()) {
      awY();
    }
    Iterator localIterator = this.gBe.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onPause();
    }
    GMTrace.o(6295750967296L, 46907);
  }
  
  public final double qo()
  {
    GMTrace.i(6296422055936L, 46912);
    if (this.lPs == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "get now progress error, player is null");
      GMTrace.o(6296422055936L, 46912);
      return 0.0D;
    }
    double d = this.lPs.qo();
    GMTrace.o(6296422055936L, 46912);
    return d;
  }
  
  public final boolean qp()
  {
    GMTrace.i(6296287838208L, 46911);
    if (this.lPs == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.FavVoiceLogic", "check is pause, but player is null");
      GMTrace.o(6296287838208L, 46911);
      return false;
    }
    boolean bool = this.lPs.qp();
    GMTrace.o(6296287838208L, 46911);
    return bool;
  }
  
  public final void qq()
  {
    GMTrace.i(6297093144576L, 46917);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.FavVoiceLogic", "on completion, do stop play");
    ahm();
    Iterator localIterator = this.gBe.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onFinish();
    }
    GMTrace.o(6297093144576L, 46917);
  }
  
  public static abstract interface a
  {
    public abstract void aX(String paramString, int paramInt);
    
    public abstract void onFinish();
    
    public abstract void onPause();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */