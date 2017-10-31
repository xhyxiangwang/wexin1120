package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bl.b;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.e.c.d;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.j;
import com.tencent.mm.protocal.c.brd;
import com.tencent.mm.protocal.c.bre;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.x.ap;
import com.tencent.qqpinyin.voicerecoapi.c.a;
import java.util.LinkedList;

public final class p
  implements e
{
  public static final String sip;
  public boolean fRd;
  public com.tencent.mm.plugin.wear.model.d.c siq;
  public com.tencent.qqpinyin.voicerecoapi.c sir;
  public d sis;
  private int sit;
  public int siu;
  public int siv;
  public LinkedList<Integer> siw;
  
  static
  {
    GMTrace.i(9199417294848L, 68541);
    sip = com.tencent.mm.storage.w.gZP + "tmp_wearvoicetotext.spx";
    GMTrace.o(9199417294848L, 68541);
  }
  
  public p()
  {
    GMTrace.i(9198477770752L, 68534);
    this.fRd = false;
    this.sit = 0;
    this.siw = new LinkedList();
    GMTrace.o(9198477770752L, 68534);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9198746206208L, 68536);
    if ((paramk instanceof com.tencent.mm.plugin.wear.model.d.c))
    {
      paramString = (com.tencent.mm.plugin.wear.model.d.c)paramk;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ap.wT().b(349, this);
        paramk = new bre();
        paramk.uFL = paramString.fAJ;
        paramk.tXq = "";
        paramk.tsx = -1;
        paramk.uGp = false;
        a.bzo().shn.a(new a(paramString.pcX, paramk));
        GMTrace.o(9198746206208L, 68536);
        return;
      }
      if (paramString.sig)
      {
        ap.wT().b(349, this);
        paramk = new bre();
        paramk.uFL = paramString.fAJ;
        if (bg.mZ(paramString.sif)) {
          break label225;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "receive text: %s", new Object[] { paramString.sif });
        paramk.tXq = paramString.sif;
        paramk.tsx = 0;
      }
    }
    for (paramk.uGp = true;; paramk.uGp = false)
    {
      a.bzo().shn.a(new a(paramString.pcX, paramk));
      GMTrace.o(9198746206208L, 68536);
      return;
      label225:
      paramk.tXq = "";
      paramk.tsx = -1;
    }
  }
  
  public final void a(int paramInt, brd parambrd)
  {
    GMTrace.i(9198880423936L, 68537);
    if (parambrd.twT == null)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "voice data is null");
      GMTrace.o(9198880423936L, 68537);
      return;
    }
    Object localObject = parambrd.twT.toByteArray();
    this.sit += this.sis.a(new g.a((byte[])localObject, parambrd.tLr), 0, false);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "write bytes: %d", new Object[] { Integer.valueOf(this.sit) });
    short[] arrayOfShort = new short[parambrd.tLr / 2];
    int i = 0;
    while (i < parambrd.tLr / 2)
    {
      arrayOfShort[i] = ((short)(localObject[(i * 2)] & 0xFF | localObject[(i * 2 + 1)] << 8));
      i += 1;
    }
    localObject = new c.a();
    this.sir.a(arrayOfShort, parambrd.tLr / 2, (c.a)localObject);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "state.vad_flag: " + ((c.a)localObject).xrK);
    if (((c.a)localObject).xrK == 2) {
      this.siv = 1;
    }
    for (;;)
    {
      if (this.siv != 0)
      {
        if (this.siv < 0)
        {
          if (this.siw.size() > 10) {
            this.siw.removeLast();
          }
          this.siw.addFirst(Integer.valueOf(paramInt));
        }
        if (this.siv == 1)
        {
          parambrd = new bre();
          parambrd.uFL = this.siq.fAJ;
          parambrd.tXq = "";
          parambrd.tsx = this.siv;
          parambrd.uGp = true;
          a.bzo().shn.a(new a(this.siq.pcX, parambrd));
          this.siv = 0;
        }
      }
      if ((!this.fRd) && (this.sit > 3300))
      {
        this.fRd = true;
        ap.wT().a(this.siq, 0);
      }
      GMTrace.o(9198880423936L, 68537);
      return;
      if (((c.a)localObject).xrK == 3) {
        this.siv = 2;
      }
    }
  }
  
  public final void reset()
  {
    GMTrace.i(9198611988480L, 68535);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "reset: sessionId=%s", new Object[] { Integer.valueOf(this.siu) });
    if (this.sis != null)
    {
      this.sis.qN();
      this.sis = null;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "reset speexWriter");
    }
    if (this.sir != null)
    {
      this.sir.stop();
      this.sir = null;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.Wear.VoiceToTextServer", "reset voiceDetectAPI");
    }
    if (this.siq != null)
    {
      this.siq.hVr = true;
      ap.wT().b(349, this);
      ap.wT().c(this.siq);
      this.siq = null;
    }
    this.siv = 0;
    this.fRd = false;
    this.sit = 0;
    this.siu = -1;
    this.siw.clear();
    GMTrace.o(9198611988480L, 68535);
  }
  
  final class a
    extends com.tencent.mm.plugin.wear.model.f.c
  {
    public int pcX;
    public int shL;
    public int shM;
    public bre siy;
    
    public a(int paramInt, bre parambre)
    {
      GMTrace.i(9197672464384L, 68528);
      this.shL = 2;
      this.pcX = paramInt;
      this.shM = 30001;
      this.siy = parambre;
      GMTrace.o(9197672464384L, 68528);
    }
    
    public final String getName()
    {
      GMTrace.i(9197940899840L, 68530);
      GMTrace.o(9197940899840L, 68530);
      return "WearVoiceToTextTask";
    }
    
    /* Error */
    protected final void send()
    {
      // Byte code:
      //   0: ldc2_w 54
      //   3: ldc 56
      //   5: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: getfield 39	com/tencent/mm/plugin/wear/model/e/p$a:siy	Lcom/tencent/mm/protocal/c/bre;
      //   12: invokevirtual 62	com/tencent/mm/protocal/c/bre:toByteArray	()[B
      //   15: astore_1
      //   16: invokestatic 68	com/tencent/mm/plugin/wear/model/a:bzo	()Lcom/tencent/mm/plugin/wear/model/a;
      //   19: getfield 72	com/tencent/mm/plugin/wear/model/a:shh	Lcom/tencent/mm/plugin/wear/model/d;
      //   22: aload_1
      //   23: invokevirtual 78	com/tencent/mm/plugin/wear/model/d:aS	([B)[B
      //   26: astore_2
      //   27: new 80	java/io/ByteArrayOutputStream
      //   30: dup
      //   31: invokespecial 81	java/io/ByteArrayOutputStream:<init>	()V
      //   34: astore_1
      //   35: new 83	java/io/DataOutputStream
      //   38: dup
      //   39: aload_1
      //   40: invokespecial 86	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   43: astore_3
      //   44: aload_3
      //   45: aload_0
      //   46: getfield 33	com/tencent/mm/plugin/wear/model/e/p$a:shL	I
      //   49: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   52: aload_3
      //   53: aload_0
      //   54: getfield 35	com/tencent/mm/plugin/wear/model/e/p$a:pcX	I
      //   57: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   60: aload_3
      //   61: aload_0
      //   62: getfield 37	com/tencent/mm/plugin/wear/model/e/p$a:shM	I
      //   65: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   68: aload_2
      //   69: ifnull +98 -> 167
      //   72: aload_2
      //   73: arraylength
      //   74: ifle +93 -> 167
      //   77: aload_3
      //   78: aload_2
      //   79: arraylength
      //   80: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   83: aload_3
      //   84: aload_2
      //   85: invokevirtual 94	java/io/DataOutputStream:write	([B)V
      //   88: aload_1
      //   89: invokevirtual 95	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   92: astore_2
      //   93: ldc 97
      //   95: ldc 99
      //   97: iconst_2
      //   98: anewarray 101	java/lang/Object
      //   101: dup
      //   102: iconst_0
      //   103: aload_0
      //   104: getfield 37	com/tencent/mm/plugin/wear/model/e/p$a:shM	I
      //   107: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   110: aastore
      //   111: dup
      //   112: iconst_1
      //   113: aload_2
      //   114: arraylength
      //   115: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   118: aastore
      //   119: invokestatic 112	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   122: invokestatic 68	com/tencent/mm/plugin/wear/model/a:bzo	()Lcom/tencent/mm/plugin/wear/model/a;
      //   125: getfield 72	com/tencent/mm/plugin/wear/model/a:shh	Lcom/tencent/mm/plugin/wear/model/d;
      //   128: aload_1
      //   129: invokevirtual 95	java/io/ByteArrayOutputStream:toByteArray	()[B
      //   132: invokevirtual 116	com/tencent/mm/plugin/wear/model/d:aQ	([B)Z
      //   135: pop
      //   136: ldc2_w 54
      //   139: ldc 56
      //   141: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   144: return
      //   145: astore_1
      //   146: ldc 97
      //   148: aload_1
      //   149: ldc 118
      //   151: iconst_0
      //   152: anewarray 101	java/lang/Object
      //   155: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   158: ldc2_w 54
      //   161: ldc 56
      //   163: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   166: return
      //   167: aload_3
      //   168: iconst_0
      //   169: invokevirtual 90	java/io/DataOutputStream:writeInt	(I)V
      //   172: goto -84 -> 88
      //   175: astore_1
      //   176: ldc 97
      //   178: aload_1
      //   179: ldc 124
      //   181: iconst_3
      //   182: anewarray 101	java/lang/Object
      //   185: dup
      //   186: iconst_0
      //   187: aload_0
      //   188: getfield 33	com/tencent/mm/plugin/wear/model/e/p$a:shL	I
      //   191: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   194: aastore
      //   195: dup
      //   196: iconst_1
      //   197: aload_0
      //   198: getfield 35	com/tencent/mm/plugin/wear/model/e/p$a:pcX	I
      //   201: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   204: aastore
      //   205: dup
      //   206: iconst_2
      //   207: aload_0
      //   208: getfield 37	com/tencent/mm/plugin/wear/model/e/p$a:shM	I
      //   211: invokestatic 107	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   214: aastore
      //   215: invokestatic 122	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   218: ldc2_w 54
      //   221: ldc 56
      //   223: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   226: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	227	0	this	a
      //   15	114	1	localObject	Object
      //   145	4	1	localIOException1	java.io.IOException
      //   175	4	1	localIOException2	java.io.IOException
      //   26	88	2	arrayOfByte	byte[]
      //   43	125	3	localDataOutputStream	java.io.DataOutputStream
      // Exception table:
      //   from	to	target	type
      //   8	27	145	java/io/IOException
      //   44	68	175	java/io/IOException
      //   72	88	175	java/io/IOException
      //   88	136	175	java/io/IOException
      //   167	172	175	java/io/IOException
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */