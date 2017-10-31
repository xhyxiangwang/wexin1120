package com.tencent.mm.plugin.record.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.g;
import com.tencent.mm.ac.g.a;
import com.tencent.mm.ac.g.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.j;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
  implements g.a, g.b, SensorController.a
{
  public static SensorController kha;
  private int fBu;
  public List<a> gBe;
  private boolean khd;
  private ax khe;
  public long khf;
  private boolean khg;
  private boolean khk;
  public g lPs;
  public String path;
  
  public r()
  {
    GMTrace.i(7501428817920L, 55890);
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
      GMTrace.o(7501428817920L, 55890);
      return;
      bool = false;
      break;
      label193:
      w.w("MicroMsg.RecordVoiceHelper", "get voice player fail, it is null");
    }
  }
  
  public final boolean aW(String paramString, int paramInt)
  {
    GMTrace.i(7501563035648L, 55891);
    if (this.lPs == null)
    {
      w.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(7501563035648L, 55891);
      return false;
    }
    this.lPs.stop();
    Object localObject = this.gBe.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((a)((Iterator)localObject).next()).EI(paramString);
    }
    if ((kha != null) && (!kha.uPi))
    {
      kha.a(this);
      localObject = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7517266509824L, 56008);
          r.this.khf = bg.Pq();
          GMTrace.o(7517266509824L, 56008);
        }
      };
      if (!this.khe.L((Runnable)localObject)) {
        break label192;
      }
    }
    label192:
    for (this.khf = 0L;; this.khf = -1L)
    {
      this.path = paramString;
      this.fBu = paramInt;
      if ((bg.mZ(paramString)) || (!this.lPs.a(paramString, this.khd, true, paramInt))) {
        break;
      }
      ad.QZ("keep_app_silent");
      GMTrace.o(7501563035648L, 55891);
      return true;
    }
    GMTrace.o(7501563035648L, 55891);
    return false;
  }
  
  public final void ahk()
  {
    GMTrace.i(7502234124288L, 55896);
    if (kha != null) {
      kha.bNK();
    }
    if (this.khe != null) {
      this.khe.bNL();
    }
    GMTrace.o(7502234124288L, 55896);
  }
  
  public final void ahm()
  {
    GMTrace.i(7501831471104L, 55893);
    w.d("MicroMsg.RecordVoiceHelper", "stop play");
    ad.Ra("keep_app_silent");
    if (this.lPs != null) {
      this.lPs.stop();
    }
    ahk();
    GMTrace.o(7501831471104L, 55893);
  }
  
  public final boolean awW()
  {
    GMTrace.i(7501697253376L, 55892);
    if (this.lPs == null)
    {
      w.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
      GMTrace.o(7501697253376L, 55892);
      return false;
    }
    boolean bool = this.lPs.isPlaying();
    GMTrace.o(7501697253376L, 55892);
    return bool;
  }
  
  public final void dp(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(7502368342016L, 55897);
    if (bg.mZ(this.path))
    {
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    if (this.khk)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.khk = paramBoolean;
        GMTrace.o(7502368342016L, 55897);
        return;
      }
    }
    if ((!paramBoolean) && (this.khf != -1L) && (bg.aG(this.khf) > 400L))
    {
      this.khk = true;
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    this.khk = false;
    if ((this.lPs != null) && (this.lPs.qm()))
    {
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    if (this.khg)
    {
      if (this.lPs != null) {
        this.lPs.ay(false);
      }
      this.khd = false;
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    if ((this.lPs != null) && (!this.lPs.isPlaying()))
    {
      this.lPs.ay(true);
      this.khd = true;
      GMTrace.o(7502368342016L, 55897);
      return;
    }
    if (this.lPs != null) {
      this.lPs.ay(paramBoolean);
    }
    this.khd = paramBoolean;
    if (!paramBoolean) {
      aW(this.path, this.fBu);
    }
    GMTrace.o(7502368342016L, 55897);
  }
  
  public final void onError()
  {
    GMTrace.i(7501965688832L, 55894);
    w.d("MicroMsg.RecordVoiceHelper", "on error, do stop play");
    ahm();
    Iterator localIterator = this.gBe.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onFinish();
    }
    GMTrace.o(7501965688832L, 55894);
  }
  
  public final void qq()
  {
    GMTrace.i(7502099906560L, 55895);
    w.d("MicroMsg.RecordVoiceHelper", "on completion, do stop play");
    ahm();
    Iterator localIterator = this.gBe.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onFinish();
    }
    GMTrace.o(7502099906560L, 55895);
  }
  
  public static abstract interface a
  {
    public abstract void EI(String paramString);
    
    public abstract void onFinish();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */