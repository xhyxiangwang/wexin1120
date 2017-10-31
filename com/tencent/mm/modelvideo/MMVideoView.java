package com.tencent.mm.modelvideo;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.pluginsdk.ui.h.a;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.o;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MMVideoView
  extends CommonVideoView
  implements b.a
{
  private boolean hSA;
  private a hSB;
  private boolean hSC;
  private aj hSD;
  public String hSk;
  public b hSl;
  private String hSm;
  private String hSn;
  public h.a hSo;
  private int hSp;
  private int hSq;
  private com.tencent.mm.plugin.a.f hSr;
  private int hSs;
  private int hSt;
  private boolean hSu;
  private boolean hSv;
  private int hSw;
  private int hSx;
  private boolean hSy;
  private boolean hSz;
  
  public MMVideoView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17448438857728L, 130001);
    this.hSp = 0;
    this.hSq = 0;
    this.hSw = 0;
    this.hSy = false;
    this.hSz = false;
    this.hSA = false;
    this.hSC = false;
    this.hSD = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(16387581935616L, 122097);
        if (MMVideoView.a(MMVideoView.this) == null)
        {
          GMTrace.o(16387581935616L, 122097);
          return false;
        }
        boolean bool2 = MMVideoView.b(MMVideoView.this).isPlaying();
        if (bool2) {
          MMVideoView.c(MMVideoView.this);
        }
        try
        {
          int i = MMVideoView.d(MMVideoView.this).getCurrentPosition() / 1000;
          MMVideoView.a(MMVideoView.this, i);
          bool1 = MMVideoView.b(MMVideoView.this, i);
          if ((bool1) && (bool2))
          {
            GMTrace.o(16387581935616L, 122097);
            return true;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e(MMVideoView.e(MMVideoView.this), "%s online video timer check error [%s] ", new Object[] { MMVideoView.f(MMVideoView.this), localException.toString() });
            boolean bool1 = false;
          }
          GMTrace.o(16387581935616L, 122097);
        }
        return false;
      }
    }, true);
    GMTrace.o(17448438857728L, 130001);
  }
  
  public MMVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(16386508193792L, 122089);
    this.hSp = 0;
    this.hSq = 0;
    this.hSw = 0;
    this.hSy = false;
    this.hSz = false;
    this.hSA = false;
    this.hSC = false;
    this.hSD = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(16387581935616L, 122097);
        if (MMVideoView.a(MMVideoView.this) == null)
        {
          GMTrace.o(16387581935616L, 122097);
          return false;
        }
        boolean bool2 = MMVideoView.b(MMVideoView.this).isPlaying();
        if (bool2) {
          MMVideoView.c(MMVideoView.this);
        }
        try
        {
          int i = MMVideoView.d(MMVideoView.this).getCurrentPosition() / 1000;
          MMVideoView.a(MMVideoView.this, i);
          bool1 = MMVideoView.b(MMVideoView.this, i);
          if ((bool1) && (bool2))
          {
            GMTrace.o(16387581935616L, 122097);
            return true;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e(MMVideoView.e(MMVideoView.this), "%s online video timer check error [%s] ", new Object[] { MMVideoView.f(MMVideoView.this), localException.toString() });
            boolean bool1 = false;
          }
          GMTrace.o(16387581935616L, 122097);
        }
        return false;
      }
    }, true);
    GMTrace.o(16386508193792L, 122089);
  }
  
  public MMVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(16386642411520L, 122090);
    this.hSp = 0;
    this.hSq = 0;
    this.hSw = 0;
    this.hSy = false;
    this.hSz = false;
    this.hSA = false;
    this.hSC = false;
    this.hSD = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(16387581935616L, 122097);
        if (MMVideoView.a(MMVideoView.this) == null)
        {
          GMTrace.o(16387581935616L, 122097);
          return false;
        }
        boolean bool2 = MMVideoView.b(MMVideoView.this).isPlaying();
        if (bool2) {
          MMVideoView.c(MMVideoView.this);
        }
        try
        {
          int i = MMVideoView.d(MMVideoView.this).getCurrentPosition() / 1000;
          MMVideoView.a(MMVideoView.this, i);
          bool1 = MMVideoView.b(MMVideoView.this, i);
          if ((bool1) && (bool2))
          {
            GMTrace.o(16387581935616L, 122097);
            return true;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e(MMVideoView.e(MMVideoView.this), "%s online video timer check error [%s] ", new Object[] { MMVideoView.f(MMVideoView.this), localException.toString() });
            boolean bool1 = false;
          }
          GMTrace.o(16387581935616L, 122097);
        }
        return false;
      }
    }, true);
    GMTrace.o(16386642411520L, 122090);
  }
  
  private void MI()
  {
    GMTrace.i(17448975728640L, 130005);
    if (this.kwz != null)
    {
      this.hSy = true;
      this.kwz.setVideoPath(this.hSn);
    }
    GMTrace.o(17448975728640L, 130005);
  }
  
  private void ML()
  {
    GMTrace.i(17450452123648L, 130016);
    w.i(this.TAG, "%s pauseByDataBlock ", new Object[] { bHG() });
    aaN();
    pause();
    GMTrace.o(17450452123648L, 130016);
  }
  
  private boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    GMTrace.i(17450317905920L, 130015);
    paramPInt1.value = Math.max(paramInt, this.hSw);
    if (this.hSq == 1)
    {
      paramPInt1.value = paramInt;
      paramPInt1.value += this.hSx;
    }
    if (this.hSq == 2)
    {
      paramPInt1.value = (paramInt - 8);
      if (paramPInt1.value < 0) {
        paramPInt1.value = 0;
      }
      paramPInt2.value = (paramPInt1.value + this.hSx + 8);
    }
    if ((this.hSq == 3) || (this.hSq == 4))
    {
      paramPInt1.value = this.hSw;
      paramPInt2.value = (this.hSx + paramInt + 1 + this.hSB.hSG);
    }
    if (paramPInt2.value >= this.hSs + 1) {
      paramPInt2.value = (this.hSs + 1);
    }
    if (paramPInt2.value < paramPInt1.value)
    {
      paramPInt1.value += this.hSB.hSG;
      GMTrace.o(17450317905920L, 130015);
      return false;
    }
    w.i(this.TAG, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s]", new Object[] { bHG(), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramInt), Integer.valueOf(this.hSq), Integer.valueOf(this.hSw), Integer.valueOf(this.hSx), this.hSm });
    GMTrace.o(17450317905920L, 130015);
    return true;
  }
  
  private boolean f(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17450586341376L, 130017);
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (this.hSr.a(paramInt1, paramInt2, localPInt1, localPInt2)) {
        bool1 = this.hSl.aZ(localPInt1.value, localPInt2.value);
      }
      if (!bool1)
      {
        String str = this.hSm + "_" + localPInt1.value + "_" + localPInt2.value;
        if ((!this.hSz) || (paramBoolean))
        {
          this.hSz = true;
          this.hSl.g(this.hSm, localPInt1.value, localPInt2.value);
          GMTrace.o(17450586341376L, 130017);
          return bool1;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e(this.TAG, "%s check video data error[%s] ", new Object[] { bHG(), localException.toString() });
        bool1 = bool2;
        continue;
        w.i(this.TAG, "%s already request video [%s] isRequestNow[%b] isSeek[%b] ", new Object[] { bHG(), localException, Boolean.valueOf(this.hSz), Boolean.valueOf(paramBoolean) });
        continue;
        w.i(this.TAG, "%s already had video data.", new Object[] { bHG() });
      }
    }
  }
  
  private boolean gY(int paramInt)
  {
    boolean bool2 = true;
    boolean bool1 = false;
    GMTrace.i(17449781035008L, 130011);
    if (this.hSt != -1) {}
    for (int i = this.hSt;; i = paramInt)
    {
      w.i(this.TAG, "%s check timer playCurrPos %d playTime %d cachePlayTime %d timeDuration %d playStatus %d downloadStatus %d cdnMediaId %s isPrepareVideo[%b]", new Object[] { bHG(), Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(this.hSw), Integer.valueOf(this.hSs), Integer.valueOf(this.hSq), Integer.valueOf(this.hSp), this.hSm, Boolean.valueOf(this.hSy) });
      switch (this.hSp)
      {
      default: 
        w.w(this.TAG, "%s check time default.", new Object[] { bHG() });
        bool1 = false;
      }
      for (;;)
      {
        GMTrace.o(17449781035008L, 130011);
        return bool1;
        if (!gZ(i))
        {
          this.hSv = true;
          if (this.hSw <= 0) {
            if (this.hSt == -1)
            {
              this.hSq = 1;
              label219:
              bool1 = false;
            }
          }
        }
        for (;;)
        {
          oL(i);
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          if (!a(i, localPInt1, localPInt2)) {
            break label620;
          }
          if (!f(localPInt1.value, localPInt2.value, false)) {
            break label641;
          }
          this.hSw = Math.max(this.hSw, localPInt2.value);
          bool1 = bool2;
          break;
          this.hSq = 2;
          break label219;
          w.i(this.TAG, "%s pause by load data cdnMediaId %s, playStatus %d", new Object[] { bHG(), this.hSm, Integer.valueOf(this.hSq) });
          bHJ();
          if ((this.hSq != 2) && (this.hSq != 4))
          {
            this.hSx += this.hSB.hSF;
            this.hSx = Math.min(this.hSx, 60);
            bHL();
            this.hSq = 4;
          }
          ML();
          break label219;
          if (this.hSy)
          {
            oL(i);
            if (this.hSv)
            {
              bHK();
              bHM();
              w.i(this.TAG, "%s resume by data gain cdnMediaId %s", new Object[] { bHG(), this.hSm });
              if (this.hSt != -1)
              {
                o(this.hSt, this.hSu);
                this.hSt = -1;
                bool1 = false;
                label490:
                this.hSv = bool1;
                paramInt = 3;
              }
            }
            for (;;)
            {
              this.hSq = paramInt;
              do
              {
                bool1 = true;
                break;
                if (play())
                {
                  bool1 = false;
                  break label490;
                }
                bool1 = true;
                break label490;
              } while (this.hSq == 3);
              w.i(this.TAG, "%s start to play video playStatus[%d]", new Object[] { bHG(), Integer.valueOf(this.hSq) });
              if (play()) {
                paramInt = 3;
              } else {
                paramInt = this.hSq;
              }
            }
          }
          w.i(this.TAG, "%s prepare cdnMediaId [%s]", new Object[] { bHG(), this.hSm });
          MI();
          bool1 = true;
        }
        label620:
        w.d(this.TAG, "%s can not calc download.", new Object[] { bHG() });
        label641:
        continue;
        if (this.hSy)
        {
          if (this.hSv)
          {
            if (this.hSt == -1) {
              break label697;
            }
            o(this.hSt, true);
            this.hSt = -1;
          }
          for (;;)
          {
            this.hSv = bool1;
            oL(i);
            bool1 = bool2;
            break;
            label697:
            if (!play()) {
              bool1 = true;
            }
          }
        }
        MI();
        bool1 = bool2;
        continue;
        w.w(this.TAG, "%s download error.", new Object[] { bHG() });
        bool1 = false;
      }
    }
  }
  
  /* Error */
  private boolean gZ(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 336
    //   3: ldc_w 338
    //   6: invokestatic 52	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 54	com/tencent/mm/modelvideo/MMVideoView:hSp	I
    //   13: iconst_3
    //   14: if_icmpne +14 -> 28
    //   17: ldc2_w 336
    //   20: ldc_w 338
    //   23: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   26: iconst_1
    //   27: ireturn
    //   28: aload_0
    //   29: getfield 58	com/tencent/mm/modelvideo/MMVideoView:hSw	I
    //   32: iload_1
    //   33: isub
    //   34: iconst_1
    //   35: if_icmpgt +25 -> 60
    //   38: aload_0
    //   39: getfield 58	com/tencent/mm/modelvideo/MMVideoView:hSw	I
    //   42: aload_0
    //   43: getfield 172	com/tencent/mm/modelvideo/MMVideoView:hSs	I
    //   46: if_icmpge +14 -> 60
    //   49: ldc2_w 336
    //   52: ldc_w 338
    //   55: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   58: iconst_0
    //   59: ireturn
    //   60: new 160	com/tencent/mm/pointers/PInt
    //   63: dup
    //   64: invokespecial 222	com/tencent/mm/pointers/PInt:<init>	()V
    //   67: astore 4
    //   69: new 160	com/tencent/mm/pointers/PInt
    //   72: dup
    //   73: invokespecial 222	com/tencent/mm/pointers/PInt:<init>	()V
    //   76: astore 5
    //   78: aload_0
    //   79: getfield 224	com/tencent/mm/modelvideo/MMVideoView:hSr	Lcom/tencent/mm/plugin/a/f;
    //   82: iload_1
    //   83: iload_1
    //   84: iconst_1
    //   85: iadd
    //   86: aload 4
    //   88: aload 5
    //   90: invokevirtual 229	com/tencent/mm/plugin/a/f:a	(IILcom/tencent/mm/pointers/PInt;Lcom/tencent/mm/pointers/PInt;)Z
    //   93: ifeq +90 -> 183
    //   96: aload_0
    //   97: getfield 231	com/tencent/mm/modelvideo/MMVideoView:hSl	Lcom/tencent/mm/modelvideo/b;
    //   100: aload 4
    //   102: getfield 163	com/tencent/mm/pointers/PInt:value	I
    //   105: aload 5
    //   107: getfield 163	com/tencent/mm/pointers/PInt:value	I
    //   110: invokeinterface 237 3 0
    //   115: istore_2
    //   116: iload_2
    //   117: istore_3
    //   118: iload_2
    //   119: ifne +10 -> 129
    //   122: aload_0
    //   123: iload_1
    //   124: putfield 58	com/tencent/mm/modelvideo/MMVideoView:hSw	I
    //   127: iload_2
    //   128: istore_3
    //   129: ldc2_w 336
    //   132: ldc_w 338
    //   135: invokestatic 79	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   138: iload_3
    //   139: ireturn
    //   140: astore 4
    //   142: iconst_0
    //   143: istore_2
    //   144: aload_0
    //   145: getfield 116	com/tencent/mm/modelvideo/MMVideoView:TAG	Ljava/lang/String;
    //   148: ldc_w 340
    //   151: iconst_2
    //   152: anewarray 120	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_0
    //   158: invokevirtual 124	com/tencent/mm/modelvideo/MMVideoView:bHG	()Ljava/lang/String;
    //   161: aastore
    //   162: dup
    //   163: iconst_1
    //   164: aload 4
    //   166: invokevirtual 259	java/lang/Exception:toString	()Ljava/lang/String;
    //   169: aastore
    //   170: invokestatic 261	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: iload_2
    //   174: istore_3
    //   175: goto -46 -> 129
    //   178: astore 4
    //   180: goto -36 -> 144
    //   183: iconst_0
    //   184: istore_3
    //   185: goto -56 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	this	MMVideoView
    //   0	188	1	paramInt	int
    //   115	59	2	bool1	boolean
    //   117	68	3	bool2	boolean
    //   67	34	4	localPInt1	PInt
    //   140	25	4	localException1	Exception
    //   178	1	4	localException2	Exception
    //   76	30	5	localPInt2	PInt
    // Exception table:
    //   from	to	target	type
    //   78	116	140	java/lang/Exception
    //   122	127	178	java/lang/Exception
  }
  
  private void reset()
  {
    GMTrace.i(17448707293184L, 130003);
    this.hSt = -1;
    this.hSw = 0;
    this.hSs = 0;
    this.hSq = 0;
    this.hSp = 0;
    this.hSv = false;
    this.hSy = false;
    this.hSz = false;
    if (this.hSB != null) {
      this.hSx = this.hSB.hSF;
    }
    GMTrace.o(17448707293184L, 130003);
  }
  
  protected final void MH()
  {
    GMTrace.i(17448573075456L, 130002);
    super.MH();
    this.TAG = "MicroMsg.MMVideoView";
    this.hSr = new com.tencent.mm.plugin.a.f();
    this.hSB = new a();
    this.hSB.hSF = 5;
    this.hSB.hSG = 2;
    reset();
    GMTrace.o(17448573075456L, 130002);
  }
  
  public final void MJ()
  {
    GMTrace.i(17449109946368L, 130006);
    super.MJ();
    if (this.hSC)
    {
      this.hSA = true;
      stop();
    }
    GMTrace.o(17449109946368L, 130006);
  }
  
  public final void MK()
  {
    GMTrace.i(17449244164096L, 130007);
    super.MK();
    w.i(this.TAG, "%s onUIResume stopDownloadByUiPause[%b] currTimeOnUiPause[%d] isPlayOnUiPause[%b]", new Object[] { bHG(), Boolean.valueOf(this.hSA), Integer.valueOf(this.sXF), Boolean.valueOf(this.sXG) });
    if (this.hSA)
    {
      o(this.sXF, this.sXG);
      GMTrace.o(17449244164096L, 130007);
      return;
    }
    if ((this.kwz != null) && (d.et(24)) && ((this.kwz instanceof VideoPlayerTextureView)))
    {
      ((VideoPlayerTextureView)this.kwz).aNI();
      GMTrace.o(17449244164096L, 130007);
      return;
    }
    GMTrace.o(17449244164096L, 130007);
  }
  
  protected final void MM()
  {
    GMTrace.i(17451391647744L, 130023);
    this.hSD.MM();
    GMTrace.o(17451391647744L, 130023);
  }
  
  public final int MN()
  {
    GMTrace.i(17451525865472L, 130024);
    if (this.hSp == 3)
    {
      i = Xs();
      GMTrace.o(17451525865472L, 130024);
      return i;
    }
    int i = this.hSw;
    GMTrace.o(17451525865472L, 130024);
    return i;
  }
  
  public final void MO()
  {
    GMTrace.i(17451660083200L, 130025);
    GMTrace.o(17451660083200L, 130025);
  }
  
  protected final int MP()
  {
    GMTrace.i(17451794300928L, 130026);
    GMTrace.o(17451794300928L, 130026);
    return 100;
  }
  
  public final void a(h.d paramd)
  {
    GMTrace.i(17449646817280L, 130010);
    if ((this.kwz instanceof VideoPlayerTextureView))
    {
      VideoPlayerTextureView localVideoPlayerTextureView = (VideoPlayerTextureView)this.kwz;
      localVideoPlayerTextureView.tmR.a(paramd);
      localVideoPlayerTextureView.requestLayout();
      es(114L);
    }
    GMTrace.o(17449646817280L, 130010);
  }
  
  public final void b(boolean paramBoolean, String paramString, int paramInt)
  {
    GMTrace.i(17448841510912L, 130004);
    super.b(paramBoolean, paramString, paramInt);
    this.hSm = ("MMVideo_" + paramString.hashCode());
    StringBuilder localStringBuilder = new StringBuilder();
    if (!bg.mZ(this.hSk)) {}
    for (String str = this.hSk;; str = com.tencent.mm.compatible.util.e.gZT + "appbrandvideo/")
    {
      this.hSn = (str + "MMVideo_" + paramString.hashCode() + ".mp4");
      com.tencent.mm.a.e.bf(this.hSn);
      w.i(this.TAG, "%s set video path [%s %s]", new Object[] { bHG(), this.hSm, this.hSn });
      GMTrace.o(17448841510912L, 130004);
      return;
    }
  }
  
  public final void bC(boolean paramBoolean)
  {
    GMTrace.i(17450049470464L, 130013);
    super.bC(paramBoolean);
    aIO();
    GMTrace.o(17450049470464L, 130013);
  }
  
  protected final void bD(boolean paramBoolean)
  {
    GMTrace.i(17451257430016L, 130022);
    this.hSD.MM();
    this.hSD.w(500L, 500L);
    GMTrace.o(17451257430016L, 130022);
  }
  
  protected final com.tencent.mm.pluginsdk.ui.tools.f bt(Context paramContext)
  {
    GMTrace.i(16386910846976L, 122092);
    this.sXH = 1;
    paramContext = new VideoPlayerTextureView(paramContext);
    paramContext.fT(true);
    GMTrace.o(16386910846976L, 122092);
    return paramContext;
  }
  
  public final void f(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17450988994560L, 130020);
    if (!bg.eI(this.hSm, paramString))
    {
      GMTrace.o(17450988994560L, 130020);
      return;
    }
    w.d(this.TAG, "%s download  onProgress [%d, %d]", new Object[] { bHG(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(17450988994560L, 130020);
  }
  
  public final void gX(int paramInt)
  {
    GMTrace.i(17450720559104L, 130018);
    w.i(this.TAG, "%s deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s", new Object[] { bHG(), Integer.valueOf(paramInt), Integer.valueOf(this.hSs), this.hSm });
    if (this.hSs != 0)
    {
      w.w(this.TAG, "moov had callback, do nothing.");
      GMTrace.o(17450720559104L, 130018);
      return;
    }
    bHI();
    try
    {
      if (this.hSr == null)
      {
        w.w(this.TAG, "%s parser is null, thread is error.", new Object[] { bHG() });
        GMTrace.o(17450720559104L, 130018);
        return;
      }
      if (!this.hSr.l(this.hSn, paramInt)) {
        break label278;
      }
      this.hSs = this.hSr.ifu;
      w.i(this.TAG, "%s mp4 parse moov success. duration %d cdnMediaId %s ", new Object[] { bHG(), Integer.valueOf(this.hSs), this.hSm });
      if (gY(0)) {
        MI();
      }
      if (this.hSt == -1)
      {
        this.hSq = 1;
        GMTrace.o(17450720559104L, 130018);
        return;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace(this.TAG, localException, "%s deal moov ready error [%s]", new Object[] { bHG(), this.hSm });
      GMTrace.o(17450720559104L, 130018);
      return;
    }
    this.hSq = 2;
    GMTrace.o(17450720559104L, 130018);
    return;
    label278:
    w.w(this.TAG, "%s mp4 parse moov error. cdnMediaId %s", new Object[] { bHG(), this.hSm });
    this.hSl.g(this.hSm, 0, -1);
    GMTrace.o(17450720559104L, 130018);
  }
  
  public final boolean o(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17449915252736L, 130012);
    switch (this.hSp)
    {
    }
    for (;;)
    {
      paramBoolean = true;
      for (;;)
      {
        w.i(this.TAG, "%s seek video time %d, download status %d playStatus %d", new Object[] { bHG(), Integer.valueOf(paramInt), Integer.valueOf(this.hSp), Integer.valueOf(this.hSq) });
        GMTrace.o(17449915252736L, 130012);
        return paramBoolean;
        this.hSq = 2;
        PInt localPInt1 = new PInt();
        PInt localPInt2 = new PInt();
        a(paramInt, localPInt1, localPInt2);
        if (f(localPInt1.value, localPInt2.value, true))
        {
          this.hSt = -1;
          this.hSv = false;
          this.hSw = localPInt2.value;
          this.hSq = 3;
          super.o(paramInt, paramBoolean);
          paramBoolean = true;
        }
        else
        {
          this.hSt = paramInt;
          this.hSu = paramBoolean;
          this.hSv = true;
          ML();
          paramBoolean = false;
          continue;
          super.o(paramInt, paramBoolean);
          paramBoolean = true;
          continue;
          paramBoolean = true;
        }
      }
      if (!isPrepared())
      {
        this.sXI = this.sXG;
        this.sXJ = this.sXF;
        start();
      }
    }
  }
  
  public final void onDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(17450854776832L, 130019);
    this.hSz = false;
    if ((paramInt1 < 0) || (paramInt2 < 0))
    {
      w.w(this.TAG, "%s deal data available error offset[%d], length[%d]", new Object[] { bHG(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(17450854776832L, 130019);
      return;
    }
    if (!bg.eI(this.hSm, paramString))
    {
      GMTrace.o(17450854776832L, 130019);
      return;
    }
    try
    {
      this.hSw = this.hSr.bh(paramInt1, paramInt2);
      w.i(this.TAG, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d]", new Object[] { bHG(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(this.hSw) });
      bD(true);
      GMTrace.o(17450854776832L, 130019);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.e(this.TAG, "%s deal data available file pos to video time error[%s] ", new Object[] { bHG(), paramString.toString() });
      }
    }
  }
  
  public final void qq()
  {
    GMTrace.i(17449378381824L, 130008);
    super.qq();
    this.hSl.lL(this.hSm);
    reset();
    if (this.kwz != null) {
      this.kwz.stop();
    }
    GMTrace.o(17449378381824L, 130008);
  }
  
  public final void start()
  {
    GMTrace.i(16386776629248L, 122091);
    w.i(this.TAG, "%s start cdnMediaId[%s] ", new Object[] { bHG(), this.hSm });
    if (this.kwz != null)
    {
      if (!bg.mZ(this.kwz.Nx())) {
        break label125;
      }
      aaN();
      this.hSC = true;
      this.hSp = 1;
      this.hSl.n(this.hSm, this.hSn, this.url);
      this.hSl.a(this);
      bmi();
    }
    for (;;)
    {
      es(101L);
      GMTrace.o(16386776629248L, 122091);
      return;
      label125:
      play();
    }
  }
  
  public final void stop()
  {
    GMTrace.i(17449512599552L, 130009);
    this.hSl.lL(this.hSm);
    reset();
    super.stop();
    GMTrace.o(17449512599552L, 130009);
  }
  
  public final void y(String paramString, int paramInt)
  {
    boolean bool = false;
    GMTrace.i(17451123212288L, 130021);
    if ((!bg.eI(this.hSm, paramString)) || (this.hSp == 3))
    {
      GMTrace.o(17451123212288L, 130021);
      return;
    }
    w.i(this.TAG, "%s download finish [%d]", new Object[] { bHG(), Integer.valueOf(paramInt) });
    if (paramInt == 0) {
      this.hSp = 3;
    }
    if (this.hSo != null)
    {
      paramString = this.hSo;
      String str = this.hSn;
      if (this.hSq > 0) {
        bool = true;
      }
      paramString.M(str, bool);
    }
    bD(true);
    GMTrace.o(17451123212288L, 130021);
  }
  
  private static final class a
  {
    int hSF;
    int hSG;
    
    public a()
    {
      GMTrace.i(17454210220032L, 130044);
      GMTrace.o(17454210220032L, 130044);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/modelvideo/MMVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */