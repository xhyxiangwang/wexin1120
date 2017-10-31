package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.as;
import com.tencent.mm.g.a.ko;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcontrol.b;
import com.tencent.mm.modelvideo.f.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.asr;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class aq
  implements f.a
{
  public com.tencent.mm.modelvideo.f hTA;
  public boolean hTw;
  public boolean hTx;
  c qeJ;
  c qeK;
  public ax qeT;
  public LinkedList<ax> qeU;
  public Map<String, ax> qeV;
  public LinkedList<m> qeW;
  c qeX;
  
  public aq()
  {
    GMTrace.i(8123796422656L, 60527);
    this.qeU = null;
    this.qeV = null;
    this.hTA = null;
    this.qeW = null;
    this.hTw = false;
    this.hTx = false;
    this.qeX = new c() {};
    this.qeJ = new c() {};
    this.qeK = new c() {};
    this.qeT = null;
    this.qeU = new LinkedList();
    this.qeV = new HashMap();
    this.qeW = new LinkedList();
    com.tencent.mm.sdk.b.a.uLm.b(this.qeX);
    com.tencent.mm.sdk.b.a.uLm.b(this.qeJ);
    com.tencent.mm.sdk.b.a.uLm.b(this.qeK);
    GMTrace.o(8123796422656L, 60527);
  }
  
  /* Error */
  public final boolean MV()
  {
    // Byte code:
    //   0: ldc2_w 108
    //   3: ldc 110
    //   5: invokestatic 58	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 116	com/tencent/mm/sdk/platformtools/bg:Pq	()J
    //   11: lstore_2
    //   12: ldc 118
    //   14: invokestatic 124	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   17: checkcast 118	com/tencent/mm/plugin/zero/b/a
    //   20: invokeinterface 128 1 0
    //   25: ldc -126
    //   27: iconst_1
    //   28: invokevirtual 136	com/tencent/mm/k/e:getInt	(Ljava/lang/String;I)I
    //   31: istore_1
    //   32: invokestatic 139	com/tencent/mm/sdk/platformtools/bg:Po	()J
    //   35: iload_1
    //   36: i2l
    //   37: ldc2_w 140
    //   40: lmul
    //   41: lsub
    //   42: lstore 4
    //   44: ldc -113
    //   46: ldc -111
    //   48: iconst_4
    //   49: anewarray 4	java/lang/Object
    //   52: dup
    //   53: iconst_0
    //   54: aload_0
    //   55: invokevirtual 149	java/lang/Object:hashCode	()I
    //   58: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   61: aastore
    //   62: dup
    //   63: iconst_1
    //   64: iconst_1
    //   65: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   68: aastore
    //   69: dup
    //   70: iconst_2
    //   71: sipush 130
    //   74: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   77: aastore
    //   78: dup
    //   79: iconst_3
    //   80: lload 4
    //   82: invokestatic 160	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   85: aastore
    //   86: invokestatic 165	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   89: invokestatic 171	com/tencent/mm/modelvideo/o:Na	()Lcom/tencent/mm/modelvideo/s;
    //   92: sipush 130
    //   95: iconst_1
    //   96: lload 4
    //   98: invokevirtual 177	com/tencent/mm/modelvideo/s:a	(IIJ)Ljava/util/List;
    //   101: astore 6
    //   103: aload 6
    //   105: ifnull +13 -> 118
    //   108: aload 6
    //   110: invokeinterface 182 1 0
    //   115: ifeq +13 -> 128
    //   118: ldc2_w 108
    //   121: ldc 110
    //   123: invokestatic 102	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   126: iconst_0
    //   127: ireturn
    //   128: aload 6
    //   130: invokeinterface 186 1 0
    //   135: astore 7
    //   137: iconst_0
    //   138: istore_1
    //   139: aload 7
    //   141: invokeinterface 191 1 0
    //   146: ifeq +203 -> 349
    //   149: aload 7
    //   151: invokeinterface 195 1 0
    //   156: checkcast 197	com/tencent/mm/modelvideo/r
    //   159: astore 8
    //   161: aload 8
    //   163: ifnull -24 -> 139
    //   166: aload 8
    //   168: invokevirtual 201	com/tencent/mm/modelvideo/r:getFileName	()Ljava/lang/String;
    //   171: invokestatic 207	com/tencent/mm/plugin/sns/model/ap:GK	(Ljava/lang/String;)Ljava/lang/String;
    //   174: astore 9
    //   176: invokestatic 213	com/tencent/mm/plugin/sns/model/ae:bhp	()Lcom/tencent/mm/plugin/sns/storage/n;
    //   179: aload 9
    //   181: invokevirtual 219	com/tencent/mm/plugin/sns/storage/n:HA	(Ljava/lang/String;)Lcom/tencent/mm/plugin/sns/storage/m;
    //   184: invokevirtual 225	com/tencent/mm/plugin/sns/storage/m:bjL	()Lcom/tencent/mm/protocal/c/bhc;
    //   187: getfield 231	com/tencent/mm/protocal/c/bhc:uyu	Lcom/tencent/mm/protocal/c/nn;
    //   190: getfield 236	com/tencent/mm/protocal/c/nn:tKd	Ljava/util/LinkedList;
    //   193: iconst_0
    //   194: invokevirtual 240	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   197: checkcast 242	com/tencent/mm/protocal/c/amn
    //   200: invokestatic 246	com/tencent/mm/plugin/sns/model/ap:C	(Lcom/tencent/mm/protocal/c/amn;)Ljava/lang/String;
    //   203: astore 9
    //   205: aload 9
    //   207: invokestatic 250	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   210: ifne +221 -> 431
    //   213: new 252	java/io/File
    //   216: dup
    //   217: aload 9
    //   219: invokespecial 255	java/io/File:<init>	(Ljava/lang/String;)V
    //   222: astore 10
    //   224: aload 10
    //   226: invokevirtual 258	java/io/File:exists	()Z
    //   229: ifeq +202 -> 431
    //   232: aload 10
    //   234: invokevirtual 261	java/io/File:length	()J
    //   237: lstore 4
    //   239: ldc -113
    //   241: ldc_w 263
    //   244: iconst_5
    //   245: anewarray 4	java/lang/Object
    //   248: dup
    //   249: iconst_0
    //   250: aload 8
    //   252: invokevirtual 201	com/tencent/mm/modelvideo/r:getFileName	()Ljava/lang/String;
    //   255: aastore
    //   256: dup
    //   257: iconst_1
    //   258: lload 4
    //   260: invokestatic 160	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   263: aastore
    //   264: dup
    //   265: iconst_2
    //   266: aload 8
    //   268: getfield 267	com/tencent/mm/modelvideo/r:fFH	I
    //   271: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   274: aastore
    //   275: dup
    //   276: iconst_3
    //   277: aload 8
    //   279: getfield 271	com/tencent/mm/modelvideo/r:hUx	J
    //   282: invokestatic 160	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   285: aastore
    //   286: dup
    //   287: iconst_4
    //   288: aload 9
    //   290: aastore
    //   291: invokestatic 165	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   294: lload 4
    //   296: lconst_0
    //   297: lcmp
    //   298: ifle +133 -> 431
    //   301: lload 4
    //   303: aload 8
    //   305: getfield 267	com/tencent/mm/modelvideo/r:fFH	I
    //   308: i2l
    //   309: lcmp
    //   310: ifgt +121 -> 431
    //   313: aload 10
    //   315: invokevirtual 274	java/io/File:delete	()Z
    //   318: pop
    //   319: iload_1
    //   320: iconst_1
    //   321: iadd
    //   322: istore_1
    //   323: aload 8
    //   325: iconst_0
    //   326: putfield 267	com/tencent/mm/modelvideo/r:fFH	I
    //   329: aload 8
    //   331: iconst_1
    //   332: putfield 277	com/tencent/mm/modelvideo/r:fJg	I
    //   335: aload 8
    //   337: invokestatic 283	com/tencent/mm/modelvideo/t:e	(Lcom/tencent/mm/modelvideo/r;)Z
    //   340: pop
    //   341: goto -202 -> 139
    //   344: astore 8
    //   346: goto -207 -> 139
    //   349: getstatic 289	com/tencent/mm/plugin/report/service/g:paX	Lcom/tencent/mm/plugin/report/service/g;
    //   352: ldc2_w 290
    //   355: ldc2_w 292
    //   358: iload_1
    //   359: i2l
    //   360: iconst_0
    //   361: invokevirtual 296	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   364: ldc -113
    //   366: ldc_w 298
    //   369: iconst_4
    //   370: anewarray 4	java/lang/Object
    //   373: dup
    //   374: iconst_0
    //   375: aload_0
    //   376: invokevirtual 149	java/lang/Object:hashCode	()I
    //   379: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   382: aastore
    //   383: dup
    //   384: iconst_1
    //   385: aload 6
    //   387: invokeinterface 301 1 0
    //   392: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   395: aastore
    //   396: dup
    //   397: iconst_2
    //   398: iload_1
    //   399: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   402: aastore
    //   403: dup
    //   404: iconst_3
    //   405: lload_2
    //   406: invokestatic 305	com/tencent/mm/sdk/platformtools/bg:aG	(J)J
    //   409: invokestatic 160	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   412: aastore
    //   413: invokestatic 165	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   416: ldc2_w 108
    //   419: ldc 110
    //   421: invokestatic 102	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   424: iconst_0
    //   425: ireturn
    //   426: astore 8
    //   428: goto -82 -> 346
    //   431: goto -108 -> 323
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	434	0	this	aq
    //   31	368	1	i	int
    //   11	395	2	l1	long
    //   42	260	4	l2	long
    //   101	285	6	localList	java.util.List
    //   135	15	7	localIterator	Iterator
    //   159	177	8	localr	r
    //   344	1	8	localException1	Exception
    //   426	1	8	localException2	Exception
    //   174	115	9	str	String
    //   222	92	10	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   166	294	344	java/lang/Exception
    //   301	319	344	java/lang/Exception
    //   323	341	426	java/lang/Exception
  }
  
  public final void a(final com.tencent.mm.modelvideo.f paramf, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(17154904686592L, 127814);
    if (paramf == null)
    {
      w.e("MicroMsg.SnsVideoService", "%d on preload finish but scene is null?", new Object[] { Integer.valueOf(hashCode()) });
      GMTrace.o(17154904686592L, 127814);
      return;
    }
    if (this.hTA != paramf) {
      w.w("MicroMsg.SnsVideoService", "%d on preload finish, but scene callback not same object.", new Object[] { Integer.valueOf(hashCode()) });
    }
    w.i("MicroMsg.SnsVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", new Object[] { Integer.valueOf(hashCode()), paramf.MR(), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    h.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8131581050880L, 60585);
        String str = paramf.fxL;
        synchronized (aq.this.qeW)
        {
          Iterator localIterator = aq.this.qeW.iterator();
          while (localIterator.hasNext())
          {
            m localm = (m)localIterator.next();
            if ((localm != null) && (bg.eI(str, localm.bkg())))
            {
              w.i("MicroMsg.SnsVideoService", "%d find sns info[%s], remove now", new Object[] { Integer.valueOf(aq.this.hashCode()), str });
              localIterator.remove();
            }
          }
        }
        o.Nc().bE(false);
        if (aq.this.hTA != null) {
          aq.this.hTA.hTb = null;
        }
        aq.this.hTA = null;
        aq.this.MV();
        aq.this.bhS();
        GMTrace.o(8131581050880L, 60585);
      }
    });
    GMTrace.o(17154904686592L, 127814);
  }
  
  public final boolean a(ax paramax, boolean paramBoolean)
  {
    GMTrace.i(18586202537984L, 138478);
    Object localObject1 = ap.a(paramax.fxL, paramax.fNf);
    if (!bg.mZ((String)localObject1))
    {
      w.i("MicroMsg.SnsVideoService", "this video[%s] already download finish, do nothing. [%s, %s]", new Object[] { paramax.hSm, paramax.fxL, localObject1 });
      GMTrace.o(18586202537984L, 138478);
      return false;
    }
    boolean bool = e.bd(ap.GL(paramax.fNf.nas));
    localObject1 = ap.C(paramax.fNf);
    Object localObject2 = ap.GM(paramax.fxL);
    if (localObject2 == null) {
      ap.bR(paramax.fxL, paramax.htf);
    }
    for (;;)
    {
      w.i("MicroMsg.SnsVideoService", "prepare stream download sns video %s mkDir %b", new Object[] { localObject1, Boolean.valueOf(bool) });
      localObject2 = new com.tencent.mm.plugin.sns.model.a.a(paramax.fNf.nas);
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qbr = paramax.fNf;
      an localan = an.bQy();
      localan.time = paramax.hzl;
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfT = localan;
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfR = true;
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url = paramax.fNf.mDo;
      int i = paramax.fNf.jXP;
      ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfQ = false;
      com.tencent.mm.modelvideo.n.MY();
      o.Nb();
      localObject1 = com.tencent.mm.modelcdntran.f.a(((com.tencent.mm.plugin.sns.model.a.a)localObject2).qfT, ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url, (String)localObject1, ap.lW(paramax.fxL), paramax.htd);
      if (localObject1 != null) {
        break;
      }
      GMTrace.o(18586202537984L, 138478);
      return false;
      ap.c((r)localObject2, paramax.htf);
    }
    localObject2 = paramax.qfP;
    ((com.tencent.mm.modelcdntran.i)localObject1).hte = ((String)localObject2);
    ((com.tencent.mm.modelcdntran.i)localObject1).fFB = ((String)localObject2);
    try
    {
      ((com.tencent.mm.modelcdntran.i)localObject1).hti = ai.m(ae.bhp().HA(paramax.fxL)).uvx.uoh;
      this.qeT = paramax;
      this.qeT.hSm = ((com.tencent.mm.modelcdntran.i)localObject1).field_mediaId;
      w.i("MicroMsg.SnsVideoService", "start stream download sns video cdnMediaId %s delay %b", new Object[] { this.qeT.hSm, Boolean.valueOf(paramBoolean) });
      o.Nb().a((com.tencent.mm.modelcdntran.i)localObject1, paramBoolean);
      GMTrace.o(18586202537984L, 138478);
      return true;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final boolean a(amn paramamn, int paramInt1, String paramString, boolean paramBoolean1, final boolean paramBoolean2, int paramInt2)
  {
    int i = 0;
    GMTrace.i(8123930640384L, 60528);
    if (paramamn.uhz == 2)
    {
      w.w("MicroMsg.SnsVideoService", "add video task, but url is weixin, do nothing");
      GMTrace.o(8123930640384L, 60528);
      return false;
    }
    final ax localax = new ax();
    localax.hSm = ap.ar(paramInt1, paramamn.mDo);
    localax.fNf = paramamn;
    localax.hzl = paramInt1;
    localax.fxL = paramString;
    paramInt1 = i;
    if (paramBoolean1) {
      paramInt1 = 1;
    }
    localax.htd = paramInt1;
    localax.htf = paramInt2;
    h.xA();
    h.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17155038904320L, 127815);
        Object localObject = ae.bhp().HA(localax.fxL);
        ax localax = localax;
        if (localObject != null)
        {
          localObject = ((m)localObject).field_userName;
          localax.qfP = ((String)localObject);
          w.i("MicroMsg.SnsVideoService", "offer [%b] video task[%s] to queue ", new Object[] { Boolean.valueOf(paramBoolean2), localax });
          if (!paramBoolean2) {
            break label130;
          }
          aq.this.qeU.offerFirst(localax);
        }
        for (;;)
        {
          aq.this.qeV.put(localax.hSm, localax);
          GMTrace.o(17155038904320L, 127815);
          return;
          localObject = "";
          break;
          label130:
          aq.this.qeU.offerLast(localax);
        }
      }
    });
    if (paramBoolean2) {
      bhU();
    }
    GMTrace.o(8123930640384L, 60528);
    return true;
  }
  
  public final void bhS()
  {
    GMTrace.i(17154636251136L, 127812);
    h.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8079773007872L, 60199);
        if (aq.this.qeT != null)
        {
          GMTrace.o(8079773007872L, 60199);
          return;
        }
        if (!aq.this.qeU.isEmpty())
        {
          GMTrace.o(8079773007872L, 60199);
          return;
        }
        if (aq.this.hTA != null)
        {
          GMTrace.o(8079773007872L, 60199);
          return;
        }
        if ((aq.this.hTw) || (aq.this.hTx))
        {
          GMTrace.o(8079773007872L, 60199);
          return;
        }
        Object localObject1 = null;
        ??? = null;
        PBool localPBool = new PBool();
        PInt localPInt = new PInt();
        Object localObject7;
        Object localObject6;
        int i;
        for (;;)
        {
          synchronized (aq.this.qeW)
          {
            Iterator localIterator = aq.this.qeW.iterator();
            localObject7 = ???;
            if (!localIterator.hasNext()) {
              break;
            }
            localObject6 = (m)localIterator.next();
            localObject1 = aq.this;
            if (localObject6 == null)
            {
              localPBool.value = true;
              i = 0;
              if (localPBool.value) {
                localIterator.remove();
              }
              if (i == 0) {
                break label1170;
              }
              i = localPInt.value;
              if (localObject6 == null)
              {
                localObject1 = null;
                if (localObject1 != null) {
                  break label1176;
                }
                localIterator.remove();
                ??? = localObject1;
                localObject1 = localObject6;
              }
            }
            else
            {
              if (bg.aE(((m)localObject6).field_createTime) >= 86400L)
              {
                localPBool.value = true;
                i = 0;
                continue;
              }
              if (o.Nc().bF(false))
              {
                localPBool.value = true;
                i = 0;
                continue;
              }
              localObject7 = ai.m((m)localObject6);
              if ((localObject7 == null) || (((bdk)localObject7).uvx == null))
              {
                w.i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
                localPBool.value = true;
                i = 0;
                continue;
              }
              w.i("MicroMsg.SnsVideoService", "%d check sns video[%s] preload [%d %d %s]", new Object[] { Integer.valueOf(localObject1.hashCode()), ((m)localObject6).bkg(), Integer.valueOf(((bdk)localObject7).uvx.uoh), Integer.valueOf(((bdk)localObject7).uvx.uoi), ((bdk)localObject7).uvx.uoj });
              if (((bdk)localObject7).uvx.uoh <= 0)
              {
                w.i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", new Object[] { Integer.valueOf(localObject1.hashCode()) });
                localPBool.value = true;
                i = 0;
                continue;
              }
              localPInt.value = ((bdk)localObject7).uvx.uoh;
              if (!b.jr(((bdk)localObject7).uvx.uoj)) {
                if (am.isWifi(ab.getContext()))
                {
                  i = ((bdk)localObject7).uvx.uoi | 0x1;
                  if (i > 0)
                  {
                    localPBool.value = false;
                    i = 1;
                  }
                }
                else
                {
                  if (am.is4G(ab.getContext()))
                  {
                    i = ((bdk)localObject7).uvx.uoi | 0x2;
                    continue;
                  }
                  if (am.is3G(ab.getContext()))
                  {
                    i = ((bdk)localObject7).uvx.uoi | 0x4;
                    continue;
                  }
                  localPBool.value = false;
                  i = 0;
                  continue;
                }
              }
              localPBool.value = false;
              i = 0;
              continue;
            }
            ??? = (amn)((m)localObject6).bjL().uyu.tKd.get(0);
            localObject1 = ((m)localObject6).bkg();
            localObject7 = ap.a((String)localObject1, (amn)???);
            if (!bg.mZ((String)localObject7))
            {
              w.i("MicroMsg.SnsVideoService", "this video[%s] already download finish, do nothing.", new Object[] { localObject7 });
              localObject1 = ((amn)???).uhV;
              long l = e.aY((String)localObject7);
              o.Nc().a((String)localObject1, 3, l);
              g.paX.a(354L, 147L, 1L, false);
              localObject1 = null;
              continue;
            }
            boolean bool = e.bd(ap.GL(((amn)???).nas));
            localObject7 = ap.C((amn)???);
            Object localObject8 = ap.GM((String)localObject1);
            if (localObject8 == null)
            {
              ap.bR((String)localObject1, 30);
              w.i("MicroMsg.SnsVideoService", "preload stream download sns video %s mkDir %b", new Object[] { localObject7, Boolean.valueOf(bool) });
              localObject8 = new com.tencent.mm.plugin.sns.model.a.a(((amn)???).nas);
              ((com.tencent.mm.plugin.sns.model.a.a)localObject8).qbr = ((amn)???);
              an localan = an.bQy();
              localan.time = ((m)localObject6).field_createTime;
              ((com.tencent.mm.plugin.sns.model.a.a)localObject8).qfT = localan;
              ((com.tencent.mm.plugin.sns.model.a.a)localObject8).qfR = true;
              ((com.tencent.mm.plugin.sns.model.a.a)localObject8).url = ((amn)???).mDo;
              int j = ((amn)???).jXP;
              ((com.tencent.mm.plugin.sns.model.a.a)localObject8).qfQ = false;
              com.tencent.mm.modelvideo.n.MY();
              o.Nb();
              localObject1 = com.tencent.mm.modelcdntran.f.a(((com.tencent.mm.plugin.sns.model.a.a)localObject8).qfT, ((com.tencent.mm.plugin.sns.model.a.a)localObject8).url, (String)localObject7, ap.lW((String)localObject1), 2);
              if (localObject1 == null) {
                localObject1 = null;
              }
            }
            else
            {
              ap.c((r)localObject8, 30);
            }
          }
          ((com.tencent.mm.modelcdntran.i)localObject2).fkm = ((amn)???).uhV;
          ((com.tencent.mm.modelcdntran.i)localObject2).field_preloadRatio = i;
        }
        for (;;)
        {
          if ((localObject2 == null) || (localObject7 == null))
          {
            GMTrace.o(8079773007872L, 60199);
            return;
          }
          i = 0;
          if (localObject7 != null) {}
          for (;;)
          {
            try
            {
              aq.this.hTA = new com.tencent.mm.modelvideo.f((com.tencent.mm.modelcdntran.i)localObject7, ((m)localObject2).bkg());
              if (aq.this.hTA.a(aq.this) < 0)
              {
                w.w("MicroMsg.SnsVideoService", "%s curr preload task do scene error.", new Object[] { Integer.valueOf(aq.this.hashCode()) });
                i = 1;
                aq.this.hTA = null;
              }
              if (i == 0) {
                break label1161;
              }
              synchronized (aq.this.qeW)
              {
                localObject6 = aq.this.qeW.iterator();
                if (!((Iterator)localObject6).hasNext()) {
                  break;
                }
                localObject7 = (m)((Iterator)localObject6).next();
                if ((localObject7 == null) || (!bg.eI(((m)localObject7).bkg(), ((m)localObject2).bkg()))) {
                  continue;
                }
                w.i("MicroMsg.SnsVideoService", "%d find sns info[%s], remove now", new Object[] { Integer.valueOf(aq.this.hashCode()), ((m)localObject2).bkg() });
                ((Iterator)localObject6).remove();
              }
              i = 1;
            }
            catch (Exception localException)
            {
              w.printErrStackTrace("MicroMsg.SnsVideoService", localException, "", new Object[0]);
              GMTrace.o(8079773007872L, 60199);
              return;
            }
          }
          GMTrace.o(8079773007872L, 60199);
          return;
          label1161:
          GMTrace.o(8079773007872L, 60199);
          return;
          label1170:
          Object localObject4 = null;
          break;
          label1176:
          localObject7 = localObject4;
          localObject4 = localObject6;
        }
      }
    });
    GMTrace.o(17154636251136L, 127812);
  }
  
  public final void bhT()
  {
    GMTrace.i(17154770468864L, 127813);
    w.d("MicroMsg.SnsVideoService", "%d stop preload %s", new Object[] { Integer.valueOf(hashCode()), bg.bOd() });
    h.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8069169807360L, 60120);
        if (aq.this.hTA != null) {
          aq.this.hTA.stop();
        }
        aq.this.hTA = null;
        GMTrace.o(8069169807360L, 60120);
      }
    });
    GMTrace.o(17154770468864L, 127813);
  }
  
  public final void bhU()
  {
    GMTrace.i(8124064858112L, 60529);
    h.xA();
    h.xC().C(new Runnable()
    {
      public final void run()
      {
        boolean bool = true;
        GMTrace.i(17152622985216L, 127797);
        if (aq.this.qeU.isEmpty())
        {
          w.i("MicroMsg.SnsVideoService", "download queue is null, do nothing");
          GMTrace.o(17152622985216L, 127797);
          return;
        }
        ax localax = (ax)aq.this.qeU.poll();
        if (localax == null)
        {
          w.w("MicroMsg.SnsVideoService", "try start download video task is null. queue size %d", new Object[] { Integer.valueOf(aq.this.qeU.size()) });
          GMTrace.o(17152622985216L, 127797);
          return;
        }
        if ((aq.this.qeT != null) && (localax.hSm.equals(aq.this.qeT.hSm))) {}
        for (;;)
        {
          aq.this.a(localax, bool);
          GMTrace.o(17152622985216L, 127797);
          return;
          bool = false;
        }
      }
    });
    GMTrace.o(8124064858112L, 60529);
  }
  
  public final void bhV()
  {
    GMTrace.i(16041702850560L, 119520);
    h.xA();
    h.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18585128796160L, 138470);
        if (aq.this.qeT != null)
        {
          w.i("MicroMsg.SnsVideoService", "download video finish cdnmediaId %s", new Object[] { aq.this.qeT.hSm });
          aq.this.qeV.remove(aq.this.qeT.hSm);
        }
        aq.this.qeT = null;
        aq.this.bhU();
        GMTrace.o(18585128796160L, 138470);
      }
    });
    GMTrace.o(16041702850560L, 119520);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */