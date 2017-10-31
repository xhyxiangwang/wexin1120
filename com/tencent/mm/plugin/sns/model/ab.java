package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pm;
import com.tencent.mm.g.a.pm.b;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.h.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.n.a;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.protocal.c.amk;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

public final class ab
{
  private String aBv;
  private String clientId;
  private String fBx;
  public String hAC;
  public int hAD;
  private h.a hAM;
  public int hUc;
  private String lbZ;
  private int pYt;
  public a qcA;
  private amq qcB;
  private long qci;
  public q qcz;
  public long startTime;
  
  /* Error */
  public ab(int paramInt, q paramq, String paramString1, String paramString2, a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 43	java/lang/Object:<init>	()V
    //   4: ldc2_w 44
    //   7: ldc 46
    //   9: invokestatic 52	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: ldc 54
    //   15: putfield 56	com/tencent/mm/plugin/sns/model/ab:clientId	Ljava/lang/String;
    //   18: aload_0
    //   19: lconst_0
    //   20: putfield 58	com/tencent/mm/plugin/sns/model/ab:qci	J
    //   23: aload_0
    //   24: lconst_0
    //   25: putfield 60	com/tencent/mm/plugin/sns/model/ab:startTime	J
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield 62	com/tencent/mm/plugin/sns/model/ab:hAD	I
    //   33: aload_0
    //   34: ldc 54
    //   36: putfield 64	com/tencent/mm/plugin/sns/model/ab:lbZ	Ljava/lang/String;
    //   39: aload_0
    //   40: new 66	com/tencent/mm/protocal/c/amq
    //   43: dup
    //   44: invokespecial 67	com/tencent/mm/protocal/c/amq:<init>	()V
    //   47: putfield 69	com/tencent/mm/plugin/sns/model/ab:qcB	Lcom/tencent/mm/protocal/c/amq;
    //   50: aload_0
    //   51: new 12	com/tencent/mm/plugin/sns/model/ab$4
    //   54: dup
    //   55: aload_0
    //   56: invokespecial 72	com/tencent/mm/plugin/sns/model/ab$4:<init>	(Lcom/tencent/mm/plugin/sns/model/ab;)V
    //   59: putfield 74	com/tencent/mm/plugin/sns/model/ab:hAM	Lcom/tencent/mm/modelcdntran/h$a;
    //   62: aload_0
    //   63: invokestatic 80	java/lang/System:currentTimeMillis	()J
    //   66: putfield 58	com/tencent/mm/plugin/sns/model/ab:qci	J
    //   69: aload_0
    //   70: aload_3
    //   71: putfield 82	com/tencent/mm/plugin/sns/model/ab:aBv	Ljava/lang/String;
    //   74: aload_0
    //   75: aload 4
    //   77: putfield 84	com/tencent/mm/plugin/sns/model/ab:fBx	Ljava/lang/String;
    //   80: aload_0
    //   81: aload 5
    //   83: putfield 86	com/tencent/mm/plugin/sns/model/ab:qcA	Lcom/tencent/mm/plugin/sns/model/ab$a;
    //   86: aload_0
    //   87: iload_1
    //   88: putfield 88	com/tencent/mm/plugin/sns/model/ab:pYt	I
    //   91: aload_0
    //   92: aload_2
    //   93: putfield 90	com/tencent/mm/plugin/sns/model/ab:qcz	Lcom/tencent/mm/plugin/sns/storage/q;
    //   96: aload_0
    //   97: new 66	com/tencent/mm/protocal/c/amq
    //   100: dup
    //   101: invokespecial 67	com/tencent/mm/protocal/c/amq:<init>	()V
    //   104: aload_2
    //   105: getfield 96	com/tencent/mm/plugin/sns/storage/q:qvA	[B
    //   108: invokevirtual 100	com/tencent/mm/protocal/c/amq:aC	([B)Lcom/tencent/mm/bl/a;
    //   111: checkcast 66	com/tencent/mm/protocal/c/amq
    //   114: putfield 69	com/tencent/mm/plugin/sns/model/ab:qcB	Lcom/tencent/mm/protocal/c/amq;
    //   117: aload_0
    //   118: aload_0
    //   119: getfield 69	com/tencent/mm/plugin/sns/model/ab:qcB	Lcom/tencent/mm/protocal/c/amq;
    //   122: getfield 103	com/tencent/mm/protocal/c/amq:uiz	Ljava/lang/String;
    //   125: putfield 56	com/tencent/mm/plugin/sns/model/ab:clientId	Ljava/lang/String;
    //   128: aload_0
    //   129: aload_0
    //   130: getfield 69	com/tencent/mm/plugin/sns/model/ab:qcB	Lcom/tencent/mm/protocal/c/amq;
    //   133: getfield 106	com/tencent/mm/protocal/c/amq:fwU	Ljava/lang/String;
    //   136: putfield 64	com/tencent/mm/plugin/sns/model/ab:lbZ	Ljava/lang/String;
    //   139: aload_0
    //   140: getfield 56	com/tencent/mm/plugin/sns/model/ab:clientId	Ljava/lang/String;
    //   143: invokestatic 112	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   146: ifeq +63 -> 209
    //   149: aload_0
    //   150: new 114	java/lang/StringBuilder
    //   153: dup
    //   154: invokespecial 115	java/lang/StringBuilder:<init>	()V
    //   157: invokestatic 118	com/tencent/mm/sdk/platformtools/bg:Pq	()J
    //   160: invokevirtual 122	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   163: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: invokevirtual 132	java/lang/String:getBytes	()[B
    //   169: invokestatic 138	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   172: putfield 56	com/tencent/mm/plugin/sns/model/ab:clientId	Ljava/lang/String;
    //   175: aload_0
    //   176: getfield 69	com/tencent/mm/plugin/sns/model/ab:qcB	Lcom/tencent/mm/protocal/c/amq;
    //   179: aload_0
    //   180: getfield 56	com/tencent/mm/plugin/sns/model/ab:clientId	Ljava/lang/String;
    //   183: putfield 103	com/tencent/mm/protocal/c/amq:uiz	Ljava/lang/String;
    //   186: aload_2
    //   187: aload_0
    //   188: getfield 69	com/tencent/mm/plugin/sns/model/ab:qcB	Lcom/tencent/mm/protocal/c/amq;
    //   191: invokevirtual 141	com/tencent/mm/protocal/c/amq:toByteArray	()[B
    //   194: putfield 96	com/tencent/mm/plugin/sns/storage/q:qvA	[B
    //   197: invokestatic 147	com/tencent/mm/plugin/sns/model/ae:bhe	()Lcom/tencent/mm/plugin/sns/storage/r;
    //   200: aload_2
    //   201: getfield 150	com/tencent/mm/plugin/sns/storage/q:quQ	I
    //   204: aload_2
    //   205: invokevirtual 155	com/tencent/mm/plugin/sns/storage/r:a	(ILcom/tencent/mm/plugin/sns/storage/q;)I
    //   208: pop
    //   209: ldc -99
    //   211: ldc -97
    //   213: iconst_4
    //   214: anewarray 4	java/lang/Object
    //   217: dup
    //   218: iconst_0
    //   219: iload_1
    //   220: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   223: aastore
    //   224: dup
    //   225: iconst_1
    //   226: aload_3
    //   227: aastore
    //   228: dup
    //   229: iconst_2
    //   230: aload_3
    //   231: invokestatic 171	com/tencent/mm/modelsfs/FileOp:kI	(Ljava/lang/String;)J
    //   234: l2i
    //   235: invokestatic 165	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   238: aastore
    //   239: dup
    //   240: iconst_3
    //   241: aload_0
    //   242: getfield 64	com/tencent/mm/plugin/sns/model/ab:lbZ	Ljava/lang/String;
    //   245: aastore
    //   246: invokestatic 176	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   249: ldc2_w 44
    //   252: ldc 46
    //   254: invokestatic 179	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   257: return
    //   258: astore_2
    //   259: ldc -99
    //   261: ldc -75
    //   263: invokestatic 185	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   266: ldc2_w 44
    //   269: ldc 46
    //   271: invokestatic 179	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   274: return
    //   275: astore_2
    //   276: ldc -99
    //   278: aload_2
    //   279: ldc 54
    //   281: iconst_0
    //   282: anewarray 4	java/lang/Object
    //   285: invokestatic 189	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: goto -79 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	291	0	this	ab
    //   0	291	1	paramInt	int
    //   0	291	2	paramq	q
    //   0	291	3	paramString1	String
    //   0	291	4	paramString2	String
    //   0	291	5	parama	a
    // Exception table:
    //   from	to	target	type
    //   96	117	258	java/lang/Exception
    //   186	209	275	java/lang/Exception
  }
  
  public final boolean R(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8143794864128L, 60676);
    q localq = ae.bhe().dQ(this.pYt);
    w.d("MicroMsg.SightCdnUpload", "upload ok " + paramString1 + "  " + paramString3 + "  1");
    localq.qvz = paramString3;
    try
    {
      paramString3 = (amq)new amq().aC(localq.qvA);
      localObject = paramString3;
      if (paramString3 == null) {
        localObject = new amq();
      }
      paramString3 = new amk();
      paramString3.jXP = 1;
      paramString3.mDo = paramString1;
      ((amq)localObject).uiv = paramString3;
      ((amq)localObject).uiy = 0;
      com.tencent.mm.modelcdntran.g.Gj();
      ((amq)localObject).uhV = b.jj(this.aBv);
      w.i("MicroMsg.SightCdnUpload", "onPostScene videomd5 %s", new Object[] { ((amq)localObject).uhV });
      if (!bg.mZ(paramString2))
      {
        paramString1 = new amk();
        paramString1.jXP = 1;
        paramString1.mDo = paramString2;
        ((amq)localObject).uix.add(paramString1);
      }
    }
    catch (Exception paramString3)
    {
      try
      {
        Object localObject;
        localq.qvA = ((amq)localObject).toByteArray();
        localq.bkD();
        ae.bhe().a(this.pYt, localq);
        ae.bho().ub(this.pYt);
        if (ae.bhl() != null) {
          ae.bhl().bgd();
        }
        GMTrace.o(8143794864128L, 60676);
        return true;
        paramString3 = paramString3;
        paramString3 = null;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SightCdnUpload", paramString1, "", new Object[0]);
        }
      }
    }
  }
  
  public final boolean a(aly paramaly)
  {
    GMTrace.i(8143660646400L, 60675);
    if (this.startTime == 0L)
    {
      this.startTime = bg.Pp();
      this.hAD = b.hrz;
    }
    String str1 = this.clientId;
    if (bg.mZ(str1))
    {
      w.w("MicroMsg.SightCdnUpload", "cdntra genClientId failed not use cdn");
      GMTrace.o(8143660646400L, 60675);
      return false;
    }
    com.tencent.mm.modelcdntran.h localh = new com.tencent.mm.modelcdntran.h();
    localh.hsO = this.hAM;
    localh.field_mediaId = str1;
    localh.field_fullpath = this.aBv;
    localh.field_thumbpath = this.fBx;
    localh.field_fileType = b.hrz;
    localh.field_talker = "";
    localh.field_priority = b.hrv;
    localh.field_needStorage = true;
    localh.field_isStreamMedia = false;
    localh.field_appType = 102;
    localh.field_bzScene = 1;
    localh.field_largesvideo = true;
    String str2 = com.tencent.mm.a.g.bg(this.aBv);
    if ((!bg.mZ(this.lbZ)) && (!this.lbZ.equals(str2)))
    {
      w.i("MicroMsg.SightCdnUpload", "isNotSafeSightVideo old srcmd5 %s newmd5 %s ", new Object[] { this.lbZ, str2 });
      tW(-2);
      this.qcA.hA(false);
      GMTrace.o(8143660646400L, 60675);
      return false;
    }
    if (!com.tencent.mm.modelcdntran.g.Gi().c(localh))
    {
      w.e("MicroMsg.SightCdnUpload", "cdntra addSendTask failed. clientid:%s", new Object[] { str1 });
      GMTrace.o(8143660646400L, 60675);
      return false;
    }
    if ((paramaly != null) && (paramaly.ugK)) {}
    for (int i = 4;; i = 5)
    {
      this.hUc = i;
      GMTrace.o(8143660646400L, 60675);
      return true;
    }
  }
  
  public final boolean bgO()
  {
    GMTrace.i(8143526428672L, 60674);
    final Object localObject = com.tencent.mm.a.g.bg(this.aBv);
    if ((!bg.mZ(this.lbZ)) && (!this.lbZ.equals(localObject)))
    {
      w.i("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo old srcmd5 %s newmd5 %s ", new Object[] { this.lbZ, localObject });
      tW(-2);
      this.qcA.hA(false);
      GMTrace.o(8143526428672L, 60674);
      return false;
    }
    if (this.qcB.uiC != null) {}
    for (localObject = this.qcB.uiC;; localObject = new aly())
    {
      w.i("MicroMsg.SightCdnUpload", "check upload %s %d %s", new Object[] { this.aBv, Integer.valueOf(((aly)localObject).ugL), Boolean.valueOf(((aly)localObject).ugK) });
      if (((aly)localObject).ugK) {
        break;
      }
      a((aly)localObject);
      GMTrace.o(8143526428672L, 60674);
      return true;
    }
    int i = com.tencent.mm.plugin.mmsight.model.h.nMk;
    if (((aly)localObject).ugL >= 3)
    {
      onError();
      GMTrace.o(8143526428672L, 60674);
      return false;
    }
    w.i("MicroMsg.SightCdnUpload", "try need remux %d %s", new Object[] { Integer.valueOf(i), this.aBv });
    final pm localpm = new pm();
    localpm.fwM = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8108092948480L, 60410);
        w.i("MicroMsg.SightCdnUpload", "event callback errcode %d", new Object[] { Integer.valueOf(localpm.fNr.result) });
        if (localpm.fNr.result >= 0)
        {
          ab.this.bgP();
          ab.this.a(localObject);
          GMTrace.o(8108092948480L, 60410);
          return;
        }
        ab.this.onError();
        GMTrace.o(8108092948480L, 60410);
      }
    };
    localpm.fNq.fNu = new com.tencent.mm.plugin.mmsight.model.d()
    {
      public final boolean aMV()
      {
        GMTrace.i(8089034031104L, 60268);
        w.i("MicroMsg.SightCdnUpload", "iUpdateVideoFile");
        ab.this.bgP();
        GMTrace.o(8089034031104L, 60268);
        return false;
      }
    };
    localpm.fNq.fNd = this.aBv;
    localpm.fNq.scene = i;
    localpm.fNq.fNs = ((aly)localObject);
    localpm.fNq.fNt = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8100845191168L, 60356);
        localObject.ugL += 1;
        try
        {
          w.i("MicroMsg.SightCdnUpload", "add try count %d", new Object[] { Integer.valueOf(localObject.ugL) });
          amq localamq = (amq)new amq().aC(ab.this.qcz.qvA);
          localamq.uiC = localObject;
          ab.this.qcz.qvA = localamq.toByteArray();
          ae.bhe().a(ab.this.qcz.quQ, ab.this.qcz);
          GMTrace.o(8100845191168L, 60356);
          return;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in checkUploadaddCount %s", new Object[] { localException.getMessage() });
          GMTrace.o(8100845191168L, 60356);
        }
      }
    };
    a.uLm.a(localpm, ae.bhc().getLooper());
    GMTrace.o(8143526428672L, 60674);
    return true;
  }
  
  public final void bgP()
  {
    GMTrace.i(16042105503744L, 119523);
    try
    {
      this.qcB = ((amq)new amq().aC(this.qcz.qvA));
      this.lbZ = com.tencent.mm.a.g.bg(this.aBv);
      this.qcB.fwU = this.lbZ;
      this.qcz.qvA = this.qcB.toByteArray();
      w.i("MicroMsg.SightCdnUpload", "new md5 is %s %s", new Object[] { this.aBv, this.lbZ });
      ae.bhe().a(this.qcz.quQ, this.qcz);
      GMTrace.o(16042105503744L, 119523);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in updateMd5Info %s", new Object[] { localException.getMessage() });
      GMTrace.o(16042105503744L, 119523);
    }
  }
  
  public final void onError()
  {
    GMTrace.i(8144063299584L, 60678);
    w.i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
    q localq = ae.bhe().dQ(this.pYt);
    localq.offset = 0;
    try
    {
      amq localamq = (amq)new amq().aC(localq.qvA);
      localamq.uiz = "";
      if (localamq.uiC != null) {
        localamq.uiC.ugL = 0;
      }
      localq.qvA = localamq.toByteArray();
      ae.bhe().a(this.pYt, localq);
      ae.bho().ub(this.pYt);
      GMTrace.o(8144063299584L, 60678);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
      GMTrace.o(8144063299584L, 60678);
    }
  }
  
  public final void tW(int paramInt)
  {
    GMTrace.i(8143929081856L, 60677);
    w.i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
    q localq = ae.bhe().dQ(this.pYt);
    try
    {
      amq localamq = (amq)new amq().aC(localq.qvA);
      localamq.uiy = 1;
      localamq.uig = paramInt;
      if (this.qcB.uiC != null) {
        this.qcB.uiC.ugL = 0;
      }
      localq.qvA = localamq.toByteArray();
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    ae.bho().ub(this.pYt);
    ae.bhe().a(this.pYt, localq);
    GMTrace.o(8143929081856L, 60677);
  }
  
  public static abstract interface a
  {
    public abstract void hA(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */