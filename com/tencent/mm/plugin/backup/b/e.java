package com.tencent.mm.plugin.backup.b;

import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.plugin.backup.a.b.d;
import com.tencent.mm.plugin.backup.g.a.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.l;
import com.tencent.mm.storage.n;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class e
{
  private static boolean jMG;
  public boolean hng;
  public final com.tencent.mm.plugin.backup.a.e jLI;
  public final int jLd;
  public final int jMA;
  private long jMB;
  public b.d jMC;
  public com.tencent.mm.plugin.zero.b.b jMD;
  private com.tencent.mm.sdk.b.c<qm> jME;
  public boolean jMF;
  private HashMap<String, Pair<Long, Long>> jMH;
  private boolean jMx;
  public final HashMap<String, String> jMy;
  public HashSet<String> jMz;
  private Object lock;
  
  static
  {
    GMTrace.i(18452119027712L, 137479);
    jMG = false;
    GMTrace.o(18452119027712L, 137479);
  }
  
  public e(com.tencent.mm.plugin.backup.a.e parame, int paramInt1, b.d paramd, int paramInt2, boolean paramBoolean, LinkedList<String> paramLinkedList, LinkedList<Long> paramLinkedList1)
  {
    GMTrace.i(18451582156800L, 137475);
    this.jMx = false;
    this.jMz = new HashSet();
    this.lock = new Object();
    this.jMB = 0L;
    this.jMD = ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class));
    this.jMF = false;
    this.jMy = ap.AS().zA().bPr();
    w.i("MicroMsg.BackupRecoverMerger", "BackupRecoverMerger, msgListDataIdHashMap size[%d], backupMode[%d], totalSession[%d], isQuickBackup[%b]", new Object[] { Integer.valueOf(this.jMy.size()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) });
    this.jLI = parame;
    this.jLd = paramInt1;
    this.jMC = paramd;
    this.jMA = paramInt2;
    jMG = paramBoolean;
    this.jMH = a(paramLinkedList, paramLinkedList1);
    this.jMz.clear();
    GMTrace.o(18451582156800L, 137475);
  }
  
  private static HashMap<String, Pair<Long, Long>> a(LinkedList<String> paramLinkedList, LinkedList<Long> paramLinkedList1)
  {
    GMTrace.i(18451716374528L, 137476);
    HashMap localHashMap = new HashMap();
    paramLinkedList1 = paramLinkedList1.iterator();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      String str = (String)paramLinkedList.next();
      if (paramLinkedList1.hasNext())
      {
        long l2 = ((Long)paramLinkedList1.next()).longValue();
        long l1 = l2;
        if (l2 == 0L) {
          l1 = Long.MIN_VALUE;
        }
        if (!paramLinkedList1.hasNext()) {
          break;
        }
        long l3 = ((Long)paramLinkedList1.next()).longValue();
        l2 = l3;
        if (l3 == 0L) {
          l2 = Long.MAX_VALUE;
        }
        localHashMap.put(str, new Pair(Long.valueOf(l1), Long.valueOf(l2)));
      }
    }
    GMTrace.o(18451716374528L, 137476);
    return localHashMap;
  }
  
  /* Error */
  public final int a(String paramString, HashMap<String, Integer> paramHashMap, d paramd)
  {
    // Byte code:
    //   0: ldc2_w 204
    //   3: ldc -50
    //   5: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 211	com/tencent/mm/sdk/platformtools/bg:Pp	()J
    //   11: lstore 5
    //   13: aload_1
    //   14: iconst_0
    //   15: iconst_m1
    //   16: invokestatic 217	com/tencent/mm/a/e:d	(Ljava/lang/String;II)[B
    //   19: astore 9
    //   21: new 219	com/tencent/mm/protocal/c/ei
    //   24: dup
    //   25: invokespecial 220	com/tencent/mm/protocal/c/ei:<init>	()V
    //   28: aload 9
    //   30: invokevirtual 224	com/tencent/mm/protocal/c/ei:aC	([B)Lcom/tencent/mm/bl/a;
    //   33: checkcast 219	com/tencent/mm/protocal/c/ei
    //   36: astore 10
    //   38: aload 10
    //   40: getfield 228	com/tencent/mm/protocal/c/ei:jWR	Ljava/util/LinkedList;
    //   43: invokevirtual 165	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   46: astore_1
    //   47: aload_1
    //   48: invokeinterface 171 1 0
    //   53: ifeq +360 -> 413
    //   56: aload_1
    //   57: invokeinterface 175 1 0
    //   62: checkcast 230	com/tencent/mm/protocal/c/eh
    //   65: astore 9
    //   67: aload_0
    //   68: getfield 76	com/tencent/mm/plugin/backup/b/e:lock	Ljava/lang/Object;
    //   71: astore 11
    //   73: aload 11
    //   75: monitorenter
    //   76: aload_0
    //   77: getfield 232	com/tencent/mm/plugin/backup/b/e:hng	Z
    //   80: ifeq +197 -> 277
    //   83: ldc 112
    //   85: ldc -22
    //   87: invokestatic 237	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: aload 11
    //   92: monitorexit
    //   93: ldc2_w 204
    //   96: ldc -50
    //   98: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   101: iconst_m1
    //   102: ireturn
    //   103: astore 10
    //   105: ldc -17
    //   107: astore_3
    //   108: aload_3
    //   109: astore_2
    //   110: new 241	java/io/File
    //   113: dup
    //   114: aload_1
    //   115: invokespecial 244	java/io/File:<init>	(Ljava/lang/String;)V
    //   118: astore 11
    //   120: aload_3
    //   121: astore_2
    //   122: new 246	java/lang/StringBuilder
    //   125: dup
    //   126: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   129: ldc -17
    //   131: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload 11
    //   136: invokevirtual 254	java/io/File:exists	()Z
    //   139: invokevirtual 257	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   142: ldc_w 259
    //   145: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: invokevirtual 263	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   151: astore_3
    //   152: aload_3
    //   153: astore_2
    //   154: new 246	java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   161: aload_3
    //   162: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload 11
    //   167: invokevirtual 266	java/io/File:canRead	()Z
    //   170: invokevirtual 257	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   173: ldc_w 259
    //   176: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 263	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: astore_3
    //   183: aload_3
    //   184: astore_2
    //   185: new 246	java/lang/StringBuilder
    //   188: dup
    //   189: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   192: aload_3
    //   193: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: aload 11
    //   198: invokevirtual 269	java/io/File:length	()J
    //   201: invokevirtual 272	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   204: ldc_w 274
    //   207: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: invokevirtual 263	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: astore_3
    //   214: aload_3
    //   215: astore_2
    //   216: aload 9
    //   218: ifnonnull +51 -> 269
    //   221: iconst_m1
    //   222: istore 4
    //   224: ldc 112
    //   226: aload 10
    //   228: ldc_w 276
    //   231: iconst_4
    //   232: anewarray 4	java/lang/Object
    //   235: dup
    //   236: iconst_0
    //   237: aload_1
    //   238: aastore
    //   239: dup
    //   240: iconst_1
    //   241: aload_2
    //   242: aastore
    //   243: dup
    //   244: iconst_2
    //   245: iload 4
    //   247: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   250: aastore
    //   251: dup
    //   252: iconst_3
    //   253: aload 10
    //   255: aastore
    //   256: invokestatic 280	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: ldc2_w 204
    //   262: ldc -50
    //   264: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   267: iconst_0
    //   268: ireturn
    //   269: aload 9
    //   271: arraylength
    //   272: istore 4
    //   274: goto -50 -> 224
    //   277: aload_0
    //   278: getfield 78	com/tencent/mm/plugin/backup/b/e:jMB	J
    //   281: invokestatic 284	com/tencent/mm/sdk/platformtools/bg:aF	(J)J
    //   284: ldc2_w 285
    //   287: lcmp
    //   288: ifle +26 -> 314
    //   291: aload_0
    //   292: getfield 88	com/tencent/mm/plugin/backup/b/e:jMD	Lcom/tencent/mm/plugin/zero/b/b;
    //   295: invokeinterface 290 1 0
    //   300: ldc2_w 291
    //   303: invokevirtual 298	com/tencent/mm/x/bo:S	(J)Z
    //   306: pop
    //   307: aload_0
    //   308: invokestatic 211	com/tencent/mm/sdk/platformtools/bg:Pp	()J
    //   311: putfield 78	com/tencent/mm/plugin/backup/b/e:jMB	J
    //   314: aload 11
    //   316: monitorexit
    //   317: getstatic 56	com/tencent/mm/plugin/backup/b/e:jMG	Z
    //   320: ifeq +12 -> 332
    //   323: aload 9
    //   325: getfield 301	com/tencent/mm/protocal/c/eh:jXP	I
    //   328: iconst_1
    //   329: if_icmpne -282 -> 47
    //   332: aload 9
    //   334: aload_2
    //   335: aconst_null
    //   336: aload_0
    //   337: getfield 150	com/tencent/mm/plugin/backup/b/e:jMH	Ljava/util/HashMap;
    //   340: invokestatic 306	com/tencent/mm/plugin/backup/e/a$b:a	(Lcom/tencent/mm/protocal/c/eh;Ljava/util/HashMap;Ljava/util/HashSet;Ljava/util/HashMap;)Lcom/tencent/mm/storage/au;
    //   343: pop
    //   344: aload 9
    //   346: getfield 301	com/tencent/mm/protocal/c/eh:jXP	I
    //   349: invokestatic 312	com/tencent/mm/plugin/backup/b/f:kn	(I)V
    //   352: invokestatic 211	com/tencent/mm/sdk/platformtools/bg:Pp	()J
    //   355: lstore 7
    //   357: lload 7
    //   359: aload_3
    //   360: getfield 317	com/tencent/mm/plugin/backup/b/d:hhu	J
    //   363: lsub
    //   364: ldc2_w 318
    //   367: lcmp
    //   368: ifle -321 -> 47
    //   371: aload_3
    //   372: invokevirtual 322	com/tencent/mm/plugin/backup/b/d:end	()V
    //   375: aload_3
    //   376: invokevirtual 325	com/tencent/mm/plugin/backup/b/d:begin	()V
    //   379: aload_3
    //   380: lload 7
    //   382: putfield 317	com/tencent/mm/plugin/backup/b/d:hhu	J
    //   385: goto -338 -> 47
    //   388: astore_1
    //   389: aload 11
    //   391: monitorexit
    //   392: aload_1
    //   393: athrow
    //   394: astore 11
    //   396: ldc 112
    //   398: aload 11
    //   400: ldc_w 327
    //   403: iconst_0
    //   404: anewarray 4	java/lang/Object
    //   407: invokestatic 280	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: goto -66 -> 344
    //   413: invokestatic 330	com/tencent/mm/plugin/backup/b/f:adX	()V
    //   416: ldc 112
    //   418: new 246	java/lang/StringBuilder
    //   421: dup
    //   422: ldc_w 332
    //   425: invokespecial 333	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   428: lload 5
    //   430: invokestatic 284	com/tencent/mm/sdk/platformtools/bg:aF	(J)J
    //   433: invokevirtual 272	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   436: invokevirtual 263	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   439: invokestatic 335	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   442: aload 10
    //   444: getfield 228	com/tencent/mm/protocal/c/ei:jWR	Ljava/util/LinkedList;
    //   447: invokevirtual 336	java/util/LinkedList:size	()I
    //   450: istore 4
    //   452: ldc2_w 204
    //   455: ldc -50
    //   457: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   460: iload 4
    //   462: ireturn
    //   463: astore_3
    //   464: goto -248 -> 216
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	467	0	this	e
    //   0	467	1	paramString	String
    //   0	467	2	paramHashMap	HashMap<String, Integer>
    //   0	467	3	paramd	d
    //   222	239	4	i	int
    //   11	418	5	l1	long
    //   355	26	7	l2	long
    //   19	326	9	localObject1	Object
    //   36	3	10	localei	com.tencent.mm.protocal.c.ei
    //   103	340	10	localException1	Exception
    //   394	5	11	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   21	38	103	java/lang/Exception
    //   76	93	388	finally
    //   277	314	388	finally
    //   314	317	388	finally
    //   389	392	388	finally
    //   332	344	394	java/lang/Exception
    //   110	120	463	java/lang/Exception
    //   122	152	463	java/lang/Exception
    //   154	183	463	java/lang/Exception
    //   185	214	463	java/lang/Exception
  }
  
  public final void a(com.tencent.mm.plugin.backup.a.f paramf)
  {
    GMTrace.i(14729456123904L, 109743);
    if (this.jMC != null) {
      this.jMC.a(paramf);
    }
    GMTrace.o(14729456123904L, 109743);
  }
  
  /* Error */
  public final void adU()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 347
    //   5: ldc_w 349
    //   8: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 69	com/tencent/mm/plugin/backup/b/e:jMx	Z
    //   15: ifeq +23 -> 38
    //   18: ldc 112
    //   20: ldc_w 351
    //   23: invokestatic 354	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: ldc2_w 347
    //   29: ldc_w 349
    //   32: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: aload_0
    //   39: iconst_1
    //   40: putfield 69	com/tencent/mm/plugin/backup/b/e:jMx	Z
    //   43: ldc 112
    //   45: ldc_w 356
    //   48: invokestatic 237	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: aload_0
    //   52: getfield 358	com/tencent/mm/plugin/backup/b/e:jME	Lcom/tencent/mm/sdk/b/c;
    //   55: ifnonnull +26 -> 81
    //   58: aload_0
    //   59: new 6	com/tencent/mm/plugin/backup/b/e$1
    //   62: dup
    //   63: aload_0
    //   64: invokespecial 361	com/tencent/mm/plugin/backup/b/e$1:<init>	(Lcom/tencent/mm/plugin/backup/b/e;)V
    //   67: putfield 358	com/tencent/mm/plugin/backup/b/e:jME	Lcom/tencent/mm/sdk/b/c;
    //   70: getstatic 367	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   73: aload_0
    //   74: getfield 358	com/tencent/mm/plugin/backup/b/e:jME	Lcom/tencent/mm/sdk/b/c;
    //   77: invokevirtual 371	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   80: pop
    //   81: aload_0
    //   82: getfield 88	com/tencent/mm/plugin/backup/b/e:jMD	Lcom/tencent/mm/plugin/zero/b/b;
    //   85: invokeinterface 290 1 0
    //   90: ldc2_w 291
    //   93: invokevirtual 298	com/tencent/mm/x/bo:S	(J)Z
    //   96: pop
    //   97: aload_0
    //   98: getfield 138	com/tencent/mm/plugin/backup/b/e:jLI	Lcom/tencent/mm/plugin/backup/a/e;
    //   101: invokevirtual 376	com/tencent/mm/plugin/backup/a/e:adH	()V
    //   104: ldc2_w 347
    //   107: ldc_w 349
    //   110: invokestatic 59	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   113: goto -78 -> 35
    //   116: astore_1
    //   117: aload_0
    //   118: monitorexit
    //   119: aload_1
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	e
    //   116	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	35	116	finally
    //   38	81	116	finally
    //   81	113	116	finally
  }
  
  public final void adV()
  {
    GMTrace.i(9471879282688L, 70571);
    synchronized (this.lock)
    {
      this.lock.notifyAll();
    }
  }
  
  public final void adW()
  {
    GMTrace.i(9472013500416L, 70572);
    if (this.jME != null)
    {
      com.tencent.mm.sdk.b.a.uLm.c(this.jME);
      this.jME = null;
    }
    GMTrace.o(9472013500416L, 70572);
  }
  
  public final void f(final boolean paramBoolean, final int paramInt)
  {
    GMTrace.i(18911009439744L, 140898);
    for (;;)
    {
      synchronized (this.lock)
      {
        w.i("MicroMsg.BackupRecoverMerger", "cancel, needClearContinueRecoverData[%b], isMerging[%b]", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.jMF) });
        this.hng = true;
        if (this.jMF)
        {
          if (this.jMC != null) {
            this.jMC.cY(true);
          }
          com.tencent.mm.plugin.backup.g.a.afe().n(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(9468389621760L, 70545);
              w.i("MicroMsg.BackupRecoverMerger", "cancel recoverFromTempDb end");
              w.bMS();
              if (e.this.jMC != null) {
                e.this.jMC.cY(false);
              }
              com.tencent.mm.sdk.a.b.kr(false);
              if (paramBoolean)
              {
                if (e.this.jLd != 1) {
                  break label204;
                }
                ap.AS();
                com.tencent.mm.x.c.xi().a(w.a.vag, Boolean.valueOf(false));
              }
              for (;;)
              {
                ap.AS().zz().bPq();
                ap.AS().zA().bPq();
                e.this.jMD.bFO().BO();
                e.this.adW();
                w.i("MicroMsg.BackupRecoverMerger", "cancel and restart sync");
                e.this.jMF = false;
                if (paramInt != 0)
                {
                  e.this.jLI.adG().jLh = paramInt;
                  e.this.a(e.this.jLI.adG());
                }
                e.this.adV();
                e.this.jLI.adI();
                GMTrace.o(9468389621760L, 70545);
                return;
                label204:
                if (e.this.jLd == 2)
                {
                  ap.AS();
                  com.tencent.mm.x.c.xi().a(w.a.vaj, Boolean.valueOf(false));
                }
              }
            }
          });
          GMTrace.o(18911009439744L, 140898);
          return;
        }
        if (paramBoolean)
        {
          if (this.jLd == 1)
          {
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.vag, Boolean.valueOf(false));
            ap.AS().zz().bPq();
            ap.AS().zA().bPq();
          }
        }
        else
        {
          this.jMD.bFO().BO();
          adW();
          w.i("MicroMsg.BackupRecoverMerger", "cancel and restart sync");
          this.jMF = false;
          if (paramInt != 0)
          {
            this.jLI.adG().jLh = paramInt;
            a(this.jLI.adG());
          }
          adV();
          this.jLI.adI();
        }
      }
      if (this.jLd == 2)
      {
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.vaj, Boolean.valueOf(false));
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */