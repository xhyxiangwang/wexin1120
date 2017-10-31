package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.model.aq.5;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class af
{
  amn fNf;
  String fxL;
  String hSm;
  public String hSn;
  int hSp;
  int hSq;
  com.tencent.mm.plugin.a.f hSr;
  int hSs;
  int hSt;
  boolean hSv;
  int hSw;
  private int hSx;
  public boolean hSy;
  boolean hSz;
  long hta;
  int hzl;
  int ppO;
  int progress;
  HashMap<String, Integer> qDG;
  public a qDH;
  int qDI;
  private int qDJ;
  long qDK;
  private long qDL;
  private long qDM;
  private int qDN;
  private b qDO;
  
  public af(a parama)
  {
    GMTrace.i(8677981421568L, 64656);
    this.hSp = 0;
    this.hSq = 0;
    this.qDG = null;
    this.hSw = 0;
    this.hSy = false;
    this.hSz = false;
    this.qDJ = 0;
    this.qDH = parama;
    this.hSr = new com.tencent.mm.plugin.a.f();
    this.qDG = new HashMap();
    this.qDO = new b();
    this.qDO.hSF = com.tencent.mm.k.g.uz().getInt("SnsVideoPreloadSec", 5);
    this.qDO.hSG = com.tencent.mm.k.g.uz().getInt("SnsVideoDownloadSec", 1);
    this.qDO.qDQ = com.tencent.mm.k.g.uz().getInt("SnsVideoFullDownloadPercent", 101);
    w.i("MicroMsg.OnlineVideoViewHelper", "parseConfig preload[%d] downloadSec[%d], needFinish[%d]", new Object[] { Integer.valueOf(this.qDO.hSF), Integer.valueOf(this.qDO.hSG), Integer.valueOf(this.qDO.qDQ) });
    reset();
    GMTrace.o(8677981421568L, 64656);
  }
  
  private boolean db(int paramInt1, int paramInt2)
  {
    GMTrace.i(15294512758784L, 113953);
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.hSr.a(paramInt1, paramInt2, localPInt1, localPInt2))
      {
        localPInt2.value += 81920;
        bool1 = o.Nb().isVideoDataAvailable(this.hSm, localPInt1.value, localPInt2.value);
      }
      if (!bool1) {
        if (!this.qDG.containsKey(this.hSm + 0 + "_-1"))
        {
          String str = this.hSm + localPInt1.value + "_" + localPInt2.value;
          w.i("MicroMsg.OnlineVideoViewHelper", "request video data [%d, %d] isRequestNow[%b] isSeek[%b]", new Object[] { Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt2.value), Boolean.valueOf(this.hSz), Boolean.valueOf(false) });
          if ((!this.qDG.containsKey(str)) && (!this.hSz))
          {
            this.hSz = true;
            o.Nb();
            com.tencent.mm.modelcdntran.f.e(this.hSm, localPInt1.value, localPInt2.value);
            this.qDG.put(str, Integer.valueOf(paramInt2));
          }
        }
        else
        {
          GMTrace.o(15294512758784L, 113953);
          return bool1;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.OnlineVideoViewHelper", "check video data error: " + localException.toString());
        bool1 = bool2;
        continue;
        w.i("MicroMsg.OnlineVideoViewHelper", "already request video : " + localException);
        continue;
        w.i("MicroMsg.OnlineVideoViewHelper", "already had video data.");
      }
    }
  }
  
  private boolean gZ(int paramInt)
  {
    boolean bool3 = false;
    bool1 = false;
    GMTrace.i(8678652510208L, 64661);
    if (this.hSp == 3)
    {
      GMTrace.o(8678652510208L, 64661);
      return true;
    }
    if ((this.hSw - paramInt <= 1) && (this.hSw < this.hSs))
    {
      GMTrace.o(8678652510208L, 64661);
      return false;
    }
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    bool2 = bool3;
    try
    {
      if (this.hSr.a(paramInt, paramInt + 1, localPInt1, localPInt2))
      {
        bool2 = bool3;
        bool3 = o.Nb().isVideoDataAvailable(this.hSm, localPInt1.value, localPInt2.value);
        bool1 = bool3;
        if (!bool3)
        {
          bool2 = bool3;
          this.hSw = paramInt;
          bool1 = bool3;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.OnlineVideoViewHelper", "check video data error: " + localException.toString());
        bool1 = bool2;
      }
    }
    GMTrace.o(8678652510208L, 64661);
    return bool1;
  }
  
  private void reset()
  {
    GMTrace.i(8678115639296L, 64657);
    this.hSm = "";
    this.hSt = -1;
    this.hSw = 0;
    this.hSs = 0;
    this.qDJ = 0;
    this.hSq = 0;
    this.hSp = 0;
    this.hSv = false;
    this.hSy = false;
    this.hSz = false;
    this.qDG.clear();
    this.fNf = null;
    this.hzl = 0;
    this.fxL = null;
    if (this.qDO != null) {
      this.hSx = this.qDO.hSF;
    }
    this.qDK = 0L;
    this.hta = 0L;
    this.qDN = 0;
    this.qDM = 0L;
    this.qDL = 0L;
    GMTrace.o(8678115639296L, 64657);
  }
  
  public final boolean Ii(String paramString)
  {
    GMTrace.i(8678249857024L, 64658);
    boolean bool = bg.eI(this.hSm, paramString);
    GMTrace.o(8678249857024L, 64658);
    return bool;
  }
  
  public final boolean bmg()
  {
    GMTrace.i(18575599337472L, 138399);
    boolean bool;
    aq localaq;
    String str;
    Object[] arrayOfObject;
    if (!bg.mZ(this.hSm))
    {
      if (this.hSp != 3) {
        break label375;
      }
      bool = true;
      w.i("MicroMsg.OnlineVideoViewHelper", "stop online download video %s isFinish %b percent %d", new Object[] { this.hSm, Boolean.valueOf(bool), Integer.valueOf(this.qDI) });
      localaq = ae.bhn();
      str = this.hSm;
      arrayOfObject = new Object[7];
      arrayOfObject[0] = Integer.valueOf(this.qDH.bmb());
      if (this.qDL <= 0L) {
        this.qDL = bg.Pp();
      }
      int j = (int)(this.qDL - this.hta);
      int i = j;
      if (j <= 0) {
        i = 0;
      }
      arrayOfObject[1] = Integer.valueOf(i);
      if (this.qDK <= 0L) {
        this.qDK = bg.Pp();
      }
      j = (int)(this.qDK - this.hta);
      i = j;
      if (j <= 0) {
        i = 0;
      }
      arrayOfObject[2] = Integer.valueOf(i);
      arrayOfObject[3] = Integer.valueOf(this.qDJ);
      if (this.qDJ <= 0) {
        break label380;
      }
      if (this.qDN == 0) {
        this.qDN = ((int)(this.qDN + bg.aF(this.qDM)));
      }
      arrayOfObject[4] = Integer.valueOf(this.qDN / this.qDJ);
    }
    for (;;)
    {
      arrayOfObject[5] = Integer.valueOf(this.qDH.bmd());
      arrayOfObject[6] = Integer.valueOf(this.qDH.bmc());
      if (!bg.mZ(str))
      {
        h.xA();
        h.xC().C(new aq.5(localaq, str, arrayOfObject));
      }
      if ((this.qDI >= this.qDO.qDQ) && (!bool)) {
        ae.bhn().a(this.fNf, this.hzl, this.fxL, false, false, 36);
      }
      com.tencent.mm.plugin.report.service.g.paX.a(354L, 203L, 1L, false);
      GMTrace.o(18575599337472L, 138399);
      return true;
      label375:
      bool = false;
      break;
      label380:
      arrayOfObject[4] = Integer.valueOf(0);
    }
  }
  
  final void bmh()
  {
    GMTrace.i(8678920945664L, 64663);
    w.i("MicroMsg.OnlineVideoViewHelper", "play offline video %s ", new Object[] { this.hSm });
    com.tencent.mm.sdk.platformtools.af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8674089107456L, 64627);
        if (af.this.qDH != null) {
          af.this.qDH.av(af.this.hSn, false);
        }
        GMTrace.o(8674089107456L, 64627);
      }
    });
    GMTrace.o(8678920945664L, 64663);
  }
  
  public final void bmi()
  {
    GMTrace.i(8679055163392L, 64664);
    if (this.qDL == 0L) {
      this.qDL = bg.Pp();
    }
    GMTrace.o(8679055163392L, 64664);
  }
  
  public final void clear()
  {
    GMTrace.i(18575465119744L, 138398);
    w.i("MicroMsg.OnlineVideoViewHelper", "clear");
    reset();
    this.qDH = null;
    this.hSr = null;
    GMTrace.o(18575465119744L, 138398);
  }
  
  public final boolean gY(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    GMTrace.i(8678384074752L, 64659);
    if (this.hSt != -1) {}
    for (int i = this.hSt;; i = paramInt)
    {
      w.i("MicroMsg.OnlineVideoViewHelper", "check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d playStatus %d downloadStatus %d cdnMediaId %s firPlayWait{%d} isPrepareVideo[%b]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.hSw), Integer.valueOf(this.hSs), Integer.valueOf(this.hSq), Integer.valueOf(this.hSp), this.hSm, Long.valueOf(this.qDL - this.hta), Boolean.valueOf(this.hSy) });
      switch (this.hSp)
      {
      default: 
        w.w("MicroMsg.OnlineVideoViewHelper", "check time default.");
        bool1 = bool2;
      }
      for (;;)
      {
        GMTrace.o(8678384074752L, 64659);
        return bool1;
        label215:
        label217:
        PInt localPInt1;
        PInt localPInt2;
        if (!gZ(i))
        {
          this.hSv = true;
          if (this.hSw <= 0) {
            if (this.hSt == -1)
            {
              this.hSq = 1;
              bool1 = false;
              localPInt1 = new PInt();
              localPInt2 = new PInt();
              localPInt1.value = Math.max(i, this.hSw);
              if (this.hSq == 1)
              {
                localPInt1.value = i;
                localPInt1.value += this.hSx;
              }
              if (this.hSq == 2)
              {
                localPInt1.value = (i - 8);
                if (localPInt1.value < 0) {
                  localPInt1.value = 0;
                }
                localPInt2.value = (localPInt1.value + this.hSx + 8);
              }
              if ((this.hSq == 3) || (this.hSq == 4))
              {
                localPInt1.value = this.hSw;
                localPInt2.value = (this.hSx + i + 1 + this.qDO.hSG);
              }
              if (localPInt2.value >= this.hSs + 1) {
                localPInt2.value = (this.hSs + 1);
              }
              if (localPInt2.value >= localPInt1.value) {
                break label894;
              }
              localPInt1.value += this.qDO.hSG;
            }
          }
        }
        for (paramInt = 0;; paramInt = 1)
        {
          if (paramInt == 0) {
            break label971;
          }
          if (!db(localPInt1.value, localPInt2.value)) {
            break label993;
          }
          this.hSw = Math.max(this.hSw, localPInt2.value);
          bool1 = bool2;
          break;
          this.hSq = 2;
          break label215;
          w.i("MicroMsg.OnlineVideoViewHelper", "pause by load data cdnMediaId %s, pauseByLoadDataCount %d, playStatus %d", new Object[] { this.hSm, Integer.valueOf(this.qDJ), Integer.valueOf(this.hSq) });
          this.qDM = bg.Pp();
          if ((this.hSq != 2) && (this.hSq != 4))
          {
            this.hSx += this.qDO.hSF;
            this.hSx = Math.min(this.hSx, 60);
            this.qDJ += 1;
            this.hSq = 4;
          }
          this.qDH.ML();
          break label215;
          bmi();
          if (this.hSy)
          {
            if (this.hSv)
            {
              if ((this.qDJ == 0) && (this.qDL == 0L)) {
                bmi();
              }
              for (;;)
              {
                w.i("MicroMsg.OnlineVideoViewHelper", "resume by data gain.pauseByLoadDataCount %d pauseAllTime %d cdnMediaId %s", new Object[] { Integer.valueOf(this.qDJ), Integer.valueOf(this.qDN), this.hSm });
                this.hSq = 3;
                if (this.hSt == -1) {
                  break label747;
                }
                this.qDH.qp(this.hSt);
                this.hSt = -1;
                this.hSv = false;
                bool1 = true;
                break;
                if (this.qDM > 0L) {
                  this.qDN = ((int)(this.qDN + bg.aF(this.qDM)));
                }
              }
              label747:
              if (this.qDH.blY()) {}
              for (bool1 = false;; bool1 = true)
              {
                this.hSv = bool1;
                bool1 = true;
                break;
              }
            }
            if (this.hSq != 3)
            {
              w.i("MicroMsg.OnlineVideoViewHelper", "start to play video playStatus[%d]", new Object[] { Integer.valueOf(this.hSq) });
              if (!this.qDH.blY()) {
                break label830;
              }
            }
            label830:
            for (paramInt = 3;; paramInt = this.hSq)
            {
              this.hSq = paramInt;
              bool1 = true;
              break;
            }
          }
          w.i("MicroMsg.OnlineVideoViewHelper", "prepare cdnMediaId [%s]", new Object[] { this.hSm });
          if (this.hSq == 5) {
            this.hSq = 1;
          }
          this.qDH.av(this.hSn, true);
          this.hSy = true;
          bool1 = true;
          break label217;
          label894:
          w.i("MicroMsg.OnlineVideoViewHelper", "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", new Object[] { Integer.valueOf(localPInt1.value), Integer.valueOf(localPInt2.value), Integer.valueOf(i), Integer.valueOf(this.hSq), Integer.valueOf(this.hSw), Integer.valueOf(this.hSx) });
        }
        label971:
        w.d("MicroMsg.OnlineVideoViewHelper", "can not calc download.");
        o.Nb();
        com.tencent.mm.modelcdntran.f.e(this.hSm, 0, -1);
        label993:
        continue;
        if (this.hSy)
        {
          if (this.hSv)
          {
            if (this.hSt == -1) {
              break label1052;
            }
            this.qDH.qp(this.hSt);
            this.hSt = -1;
          }
          for (;;)
          {
            this.hSv = bool1;
            this.hSq = 3;
            bool1 = bool2;
            break;
            label1052:
            if (!this.qDH.blY()) {
              bool1 = true;
            }
          }
        }
        if (this.hSq == 5) {
          this.hSq = 1;
        }
        this.qDH.av(this.hSn, false);
        this.hSy = true;
        bool1 = bool2;
        continue;
        w.w("MicroMsg.OnlineVideoViewHelper", "download error.");
        bool1 = bool2;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void ML();
    
    public abstract void av(String paramString, boolean paramBoolean);
    
    public abstract boolean blY();
    
    public abstract int bmb();
    
    public abstract int bmc();
    
    public abstract int bmd();
    
    public abstract void qp(int paramInt);
  }
  
  private static final class b
  {
    int hSF;
    int hSG;
    int qDQ;
    
    public b()
    {
      GMTrace.i(8427396923392L, 62789);
      GMTrace.o(8427396923392L, 62789);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */