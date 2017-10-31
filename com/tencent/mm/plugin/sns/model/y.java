package com.tencent.mm.plugin.sns.model;

import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.modelcdntran.a;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.h;
import com.tencent.mm.modelcdntran.h.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.protocal.c.amk;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bcw;
import com.tencent.mm.protocal.c.ben;
import com.tencent.mm.protocal.c.beo;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.ByteArrayOutputStream;
import java.util.LinkedList;

public final class y
  extends k
  implements j
{
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  public String hAC;
  public int hAD;
  private h.a hAM;
  private int hAV;
  private int hld;
  private int offset;
  private int pYt;
  private String path;
  private String qcc;
  private ben qcd;
  private String qce;
  private boolean qcf;
  private boolean qcg;
  private boolean qch;
  public long qci;
  public int qcj;
  public long startTime;
  
  /* Error */
  public y(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 42	com/tencent/mm/ac/k:<init>	()V
    //   4: ldc2_w 43
    //   7: ldc 45
    //   9: invokestatic 51	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: sipush 8192
    //   16: putfield 53	com/tencent/mm/plugin/sns/model/y:hAV	I
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield 55	com/tencent/mm/plugin/sns/model/y:offset	I
    //   24: aload_0
    //   25: ldc 57
    //   27: putfield 59	com/tencent/mm/plugin/sns/model/y:path	Ljava/lang/String;
    //   30: aload_0
    //   31: ldc 57
    //   33: putfield 61	com/tencent/mm/plugin/sns/model/y:qcc	Ljava/lang/String;
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield 63	com/tencent/mm/plugin/sns/model/y:pYt	I
    //   41: aload_0
    //   42: ldc 57
    //   44: putfield 65	com/tencent/mm/plugin/sns/model/y:qce	Ljava/lang/String;
    //   47: aload_0
    //   48: ldc 57
    //   50: putfield 67	com/tencent/mm/plugin/sns/model/y:hAC	Ljava/lang/String;
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield 69	com/tencent/mm/plugin/sns/model/y:qcf	Z
    //   58: aload_0
    //   59: iconst_0
    //   60: putfield 71	com/tencent/mm/plugin/sns/model/y:qcg	Z
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield 73	com/tencent/mm/plugin/sns/model/y:qch	Z
    //   68: aload_0
    //   69: lconst_0
    //   70: putfield 75	com/tencent/mm/plugin/sns/model/y:qci	J
    //   73: aload_0
    //   74: lconst_0
    //   75: putfield 77	com/tencent/mm/plugin/sns/model/y:startTime	J
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield 79	com/tencent/mm/plugin/sns/model/y:hAD	I
    //   83: aload_0
    //   84: iconst_0
    //   85: putfield 81	com/tencent/mm/plugin/sns/model/y:qcj	I
    //   88: aload_0
    //   89: new 8	com/tencent/mm/plugin/sns/model/y$1
    //   92: dup
    //   93: aload_0
    //   94: invokespecial 84	com/tencent/mm/plugin/sns/model/y$1:<init>	(Lcom/tencent/mm/plugin/sns/model/y;)V
    //   97: putfield 86	com/tencent/mm/plugin/sns/model/y:hAM	Lcom/tencent/mm/modelcdntran/h$a;
    //   100: aload_0
    //   101: invokestatic 92	java/lang/System:currentTimeMillis	()J
    //   104: putfield 75	com/tencent/mm/plugin/sns/model/y:qci	J
    //   107: aload_0
    //   108: iload_1
    //   109: putfield 63	com/tencent/mm/plugin/sns/model/y:pYt	I
    //   112: aload_0
    //   113: aload_2
    //   114: putfield 65	com/tencent/mm/plugin/sns/model/y:qce	Ljava/lang/String;
    //   117: aload_0
    //   118: iload 4
    //   120: putfield 81	com/tencent/mm/plugin/sns/model/y:qcj	I
    //   123: new 94	com/tencent/mm/ac/b$a
    //   126: dup
    //   127: invokespecial 95	com/tencent/mm/ac/b$a:<init>	()V
    //   130: astore_2
    //   131: aload_2
    //   132: new 97	com/tencent/mm/protocal/c/ben
    //   135: dup
    //   136: invokespecial 98	com/tencent/mm/protocal/c/ben:<init>	()V
    //   139: putfield 102	com/tencent/mm/ac/b$a:hlX	Lcom/tencent/mm/bl/a;
    //   142: aload_2
    //   143: new 104	com/tencent/mm/protocal/c/beo
    //   146: dup
    //   147: invokespecial 105	com/tencent/mm/protocal/c/beo:<init>	()V
    //   150: putfield 108	com/tencent/mm/ac/b$a:hlY	Lcom/tencent/mm/bl/a;
    //   153: aload_2
    //   154: ldc 110
    //   156: putfield 113	com/tencent/mm/ac/b$a:uri	Ljava/lang/String;
    //   159: aload_2
    //   160: sipush 207
    //   163: putfield 116	com/tencent/mm/ac/b$a:hlW	I
    //   166: aload_2
    //   167: bipush 95
    //   169: putfield 119	com/tencent/mm/ac/b$a:hlZ	I
    //   172: aload_2
    //   173: ldc 120
    //   175: putfield 123	com/tencent/mm/ac/b$a:hma	I
    //   178: aload_0
    //   179: aload_2
    //   180: invokevirtual 127	com/tencent/mm/ac/b$a:DA	()Lcom/tencent/mm/ac/b;
    //   183: putfield 129	com/tencent/mm/plugin/sns/model/y:gMC	Lcom/tencent/mm/ac/b;
    //   186: aload_0
    //   187: aload_0
    //   188: getfield 129	com/tencent/mm/plugin/sns/model/y:gMC	Lcom/tencent/mm/ac/b;
    //   191: getfield 135	com/tencent/mm/ac/b:hlU	Lcom/tencent/mm/ac/b$b;
    //   194: getfield 140	com/tencent/mm/ac/b$b:hmc	Lcom/tencent/mm/bl/a;
    //   197: checkcast 97	com/tencent/mm/protocal/c/ben
    //   200: putfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   203: invokestatic 148	com/tencent/mm/plugin/sns/model/ae:bhe	()Lcom/tencent/mm/plugin/sns/storage/r;
    //   206: iload_1
    //   207: i2l
    //   208: invokevirtual 154	com/tencent/mm/plugin/sns/storage/r:dQ	(J)Lcom/tencent/mm/plugin/sns/storage/q;
    //   211: astore 7
    //   213: aload_0
    //   214: iload_3
    //   215: putfield 73	com/tencent/mm/plugin/sns/model/y:qch	Z
    //   218: ldc -100
    //   220: new 158	java/lang/StringBuilder
    //   223: dup
    //   224: ldc -96
    //   226: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   229: iload_1
    //   230: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   233: ldc -87
    //   235: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: aload 7
    //   240: getfield 175	com/tencent/mm/plugin/sns/storage/q:offset	I
    //   243: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   246: ldc -79
    //   248: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: aload 7
    //   253: getfield 180	com/tencent/mm/plugin/sns/storage/q:qvw	Ljava/lang/String;
    //   256: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: ldc -74
    //   261: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: aload 7
    //   266: getfield 185	com/tencent/mm/plugin/sns/storage/q:qvv	I
    //   269: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   272: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   278: iload_3
    //   279: ifne +18 -> 297
    //   282: aload_0
    //   283: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   286: iconst_1
    //   287: putfield 197	com/tencent/mm/protocal/c/ben:ujv	I
    //   290: ldc -100
    //   292: ldc -57
    //   294: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   297: new 201	com/tencent/mm/protocal/c/amq
    //   300: dup
    //   301: invokespecial 202	com/tencent/mm/protocal/c/amq:<init>	()V
    //   304: aload 7
    //   306: getfield 206	com/tencent/mm/plugin/sns/storage/q:qvA	[B
    //   309: invokevirtual 210	com/tencent/mm/protocal/c/amq:aC	([B)Lcom/tencent/mm/bl/a;
    //   312: checkcast 201	com/tencent/mm/protocal/c/amq
    //   315: astore 6
    //   317: aload_0
    //   318: aload 7
    //   320: getfield 180	com/tencent/mm/plugin/sns/storage/q:qvw	Ljava/lang/String;
    //   323: invokestatic 216	com/tencent/mm/plugin/sns/data/i:FZ	(Ljava/lang/String;)Ljava/lang/String;
    //   326: putfield 61	com/tencent/mm/plugin/sns/model/y:qcc	Ljava/lang/String;
    //   329: aload_0
    //   330: new 158	java/lang/StringBuilder
    //   333: dup
    //   334: invokespecial 217	java/lang/StringBuilder:<init>	()V
    //   337: invokestatic 220	com/tencent/mm/plugin/sns/model/ae:getAccSnsPath	()Ljava/lang/String;
    //   340: aload 7
    //   342: getfield 180	com/tencent/mm/plugin/sns/storage/q:qvw	Ljava/lang/String;
    //   345: invokestatic 226	com/tencent/mm/plugin/sns/model/am:dt	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   348: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: aload_0
    //   352: getfield 61	com/tencent/mm/plugin/sns/model/y:qcc	Ljava/lang/String;
    //   355: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   361: putfield 59	com/tencent/mm/plugin/sns/model/y:path	Ljava/lang/String;
    //   364: aload_0
    //   365: aload_0
    //   366: getfield 59	com/tencent/mm/plugin/sns/model/y:path	Ljava/lang/String;
    //   369: invokestatic 232	com/tencent/mm/modelsfs/FileOp:kI	(Ljava/lang/String;)J
    //   372: l2i
    //   373: putfield 234	com/tencent/mm/plugin/sns/model/y:hld	I
    //   376: aload_0
    //   377: aload_0
    //   378: getfield 59	com/tencent/mm/plugin/sns/model/y:path	Ljava/lang/String;
    //   381: invokestatic 238	com/tencent/mm/plugin/sns/data/i:Gi	(Ljava/lang/String;)Z
    //   384: putfield 69	com/tencent/mm/plugin/sns/model/y:qcf	Z
    //   387: ldc -100
    //   389: new 158	java/lang/StringBuilder
    //   392: dup
    //   393: ldc -16
    //   395: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   398: aload_0
    //   399: getfield 234	com/tencent/mm/plugin/sns/model/y:hld	I
    //   402: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   405: ldc -14
    //   407: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: aload_0
    //   411: getfield 69	com/tencent/mm/plugin/sns/model/y:qcf	Z
    //   414: invokevirtual 245	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   417: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   420: invokestatic 194	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   423: aload 6
    //   425: getfield 248	com/tencent/mm/protocal/c/amq:uiz	Ljava/lang/String;
    //   428: astore 5
    //   430: aload 5
    //   432: astore_2
    //   433: aload 5
    //   435: invokestatic 253	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   438: ifeq +56 -> 494
    //   441: new 158	java/lang/StringBuilder
    //   444: dup
    //   445: invokespecial 217	java/lang/StringBuilder:<init>	()V
    //   448: invokestatic 256	com/tencent/mm/sdk/platformtools/bg:Pq	()J
    //   451: invokevirtual 259	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   454: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   457: invokevirtual 265	java/lang/String:getBytes	()[B
    //   460: invokestatic 271	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   463: astore_2
    //   464: aload 6
    //   466: aload_2
    //   467: putfield 248	com/tencent/mm/protocal/c/amq:uiz	Ljava/lang/String;
    //   470: aload 7
    //   472: aload 6
    //   474: invokevirtual 274	com/tencent/mm/protocal/c/amq:toByteArray	()[B
    //   477: putfield 206	com/tencent/mm/plugin/sns/storage/q:qvA	[B
    //   480: invokestatic 148	com/tencent/mm/plugin/sns/model/ae:bhe	()Lcom/tencent/mm/plugin/sns/storage/r;
    //   483: aload 7
    //   485: getfield 277	com/tencent/mm/plugin/sns/storage/q:quQ	I
    //   488: aload 7
    //   490: invokevirtual 281	com/tencent/mm/plugin/sns/storage/r:a	(ILcom/tencent/mm/plugin/sns/storage/q;)I
    //   493: pop
    //   494: aload_0
    //   495: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   498: aload_0
    //   499: getfield 234	com/tencent/mm/plugin/sns/model/y:hld	I
    //   502: putfield 284	com/tencent/mm/protocal/c/ben:twU	I
    //   505: aload_0
    //   506: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   509: aload 7
    //   511: getfield 175	com/tencent/mm/plugin/sns/storage/q:offset	I
    //   514: putfield 287	com/tencent/mm/protocal/c/ben:twV	I
    //   517: aload_0
    //   518: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   521: aload_2
    //   522: putfield 290	com/tencent/mm/protocal/c/ben:tvh	Ljava/lang/String;
    //   525: aload_0
    //   526: aload_2
    //   527: putfield 67	com/tencent/mm/plugin/sns/model/y:hAC	Ljava/lang/String;
    //   530: ldc -100
    //   532: new 158	java/lang/StringBuilder
    //   535: dup
    //   536: ldc_w 292
    //   539: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   542: aload 6
    //   544: getfield 295	com/tencent/mm/protocal/c/amq:uhW	I
    //   547: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   550: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   553: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   556: aload_0
    //   557: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   560: aload 6
    //   562: getfield 295	com/tencent/mm/protocal/c/amq:uhW	I
    //   565: putfield 299	com/tencent/mm/protocal/c/ben:uhW	I
    //   568: ldc -100
    //   570: new 158	java/lang/StringBuilder
    //   573: dup
    //   574: ldc_w 301
    //   577: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   580: aload 6
    //   582: getfield 304	com/tencent/mm/protocal/c/amq:uhX	I
    //   585: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   588: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   591: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   594: aload_0
    //   595: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   598: new 158	java/lang/StringBuilder
    //   601: dup
    //   602: invokespecial 217	java/lang/StringBuilder:<init>	()V
    //   605: aload 6
    //   607: getfield 307	com/tencent/mm/protocal/c/amq:mCK	Ljava/lang/String;
    //   610: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   613: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   616: putfield 310	com/tencent/mm/protocal/c/ben:txe	Ljava/lang/String;
    //   619: aload_0
    //   620: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   623: aload 6
    //   625: getfield 304	com/tencent/mm/protocal/c/amq:uhX	I
    //   628: putfield 311	com/tencent/mm/protocal/c/ben:uhX	I
    //   631: ldc -100
    //   633: new 158	java/lang/StringBuilder
    //   636: dup
    //   637: ldc_w 313
    //   640: invokespecial 163	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   643: aload 7
    //   645: getfield 316	com/tencent/mm/plugin/sns/storage/q:type	I
    //   648: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   651: ldc_w 318
    //   654: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   657: aload 6
    //   659: getfield 321	com/tencent/mm/protocal/c/amq:fwU	Ljava/lang/String;
    //   662: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: ldc_w 323
    //   668: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: aload 6
    //   673: getfield 326	com/tencent/mm/protocal/c/amq:fKY	Ljava/lang/String;
    //   676: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: ldc_w 328
    //   682: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   685: aload 6
    //   687: getfield 331	com/tencent/mm/protocal/c/amq:jOR	I
    //   690: invokevirtual 167	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   693: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   696: invokestatic 298	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   699: aload_0
    //   700: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   703: aload 7
    //   705: getfield 316	com/tencent/mm/plugin/sns/storage/q:type	I
    //   708: putfield 334	com/tencent/mm/protocal/c/ben:jXP	I
    //   711: new 336	com/tencent/mm/protocal/c/bib
    //   714: dup
    //   715: invokespecial 337	com/tencent/mm/protocal/c/bib:<init>	()V
    //   718: astore_2
    //   719: aload_2
    //   720: aload 6
    //   722: getfield 340	com/tencent/mm/protocal/c/amq:token	Ljava/lang/String;
    //   725: putfield 343	com/tencent/mm/protocal/c/bib:uzi	Ljava/lang/String;
    //   728: aload_2
    //   729: aload 6
    //   731: getfield 346	com/tencent/mm/protocal/c/amq:uih	Ljava/lang/String;
    //   734: putfield 349	com/tencent/mm/protocal/c/bib:uzj	Ljava/lang/String;
    //   737: aload_0
    //   738: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   741: aload_2
    //   742: putfield 353	com/tencent/mm/protocal/c/ben:uob	Lcom/tencent/mm/protocal/c/bib;
    //   745: aload 6
    //   747: getfield 321	com/tencent/mm/protocal/c/amq:fwU	Ljava/lang/String;
    //   750: invokestatic 253	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   753: ifne +15 -> 768
    //   756: aload_0
    //   757: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   760: aload 6
    //   762: getfield 321	com/tencent/mm/protocal/c/amq:fwU	Ljava/lang/String;
    //   765: putfield 356	com/tencent/mm/protocal/c/ben:tLN	Ljava/lang/String;
    //   768: aload 6
    //   770: getfield 326	com/tencent/mm/protocal/c/amq:fKY	Ljava/lang/String;
    //   773: invokestatic 253	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   776: ifne +15 -> 791
    //   779: aload_0
    //   780: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   783: aload 6
    //   785: getfield 326	com/tencent/mm/protocal/c/amq:fKY	Ljava/lang/String;
    //   788: putfield 359	com/tencent/mm/protocal/c/ben:mDD	Ljava/lang/String;
    //   791: aload_0
    //   792: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   795: aload 6
    //   797: getfield 331	com/tencent/mm/protocal/c/amq:jOR	I
    //   800: putfield 362	com/tencent/mm/protocal/c/ben:uwy	I
    //   803: getstatic 367	com/tencent/mm/platformtools/r:ibR	Z
    //   806: ifeq +11 -> 817
    //   809: aload_0
    //   810: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   813: iconst_0
    //   814: putfield 334	com/tencent/mm/protocal/c/ben:jXP	I
    //   817: aload_0
    //   818: getfield 77	com/tencent/mm/plugin/sns/model/y:startTime	J
    //   821: lconst_0
    //   822: lcmp
    //   823: ifne +17 -> 840
    //   826: aload_0
    //   827: invokestatic 370	com/tencent/mm/sdk/platformtools/bg:Pp	()J
    //   830: putfield 77	com/tencent/mm/plugin/sns/model/y:startTime	J
    //   833: aload_0
    //   834: getstatic 375	com/tencent/mm/modelcdntran/b:MediaType_FRIENDS	I
    //   837: putfield 79	com/tencent/mm/plugin/sns/model/y:hAD	I
    //   840: aload_0
    //   841: getfield 142	com/tencent/mm/plugin/sns/model/y:qcd	Lcom/tencent/mm/protocal/c/ben;
    //   844: astore_2
    //   845: invokestatic 380	com/tencent/mm/modelcdntran/g:Gi	()Lcom/tencent/mm/modelcdntran/c;
    //   848: pop
    //   849: bipush 32
    //   851: invokestatic 386	com/tencent/mm/modelcdntran/c:fI	(I)Z
    //   854: ifne +86 -> 940
    //   857: invokestatic 380	com/tencent/mm/modelcdntran/g:Gi	()Lcom/tencent/mm/modelcdntran/c;
    //   860: pop
    //   861: ldc -100
    //   863: ldc_w 388
    //   866: iconst_1
    //   867: anewarray 390	java/lang/Object
    //   870: dup
    //   871: iconst_0
    //   872: bipush 32
    //   874: invokestatic 386	com/tencent/mm/modelcdntran/c:fI	(I)Z
    //   877: invokestatic 396	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   880: aastore
    //   881: invokestatic 400	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   884: iconst_0
    //   885: istore_1
    //   886: iload_1
    //   887: ifeq +101 -> 988
    //   890: aload_0
    //   891: iconst_1
    //   892: putfield 71	com/tencent/mm/plugin/sns/model/y:qcg	Z
    //   895: ldc2_w 43
    //   898: ldc 45
    //   900: invokestatic 403	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   903: return
    //   904: astore_2
    //   905: ldc -100
    //   907: ldc_w 405
    //   910: invokestatic 408	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   913: ldc2_w 43
    //   916: ldc 45
    //   918: invokestatic 403	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   921: return
    //   922: astore 5
    //   924: ldc -100
    //   926: aload 5
    //   928: ldc 57
    //   930: iconst_0
    //   931: anewarray 390	java/lang/Object
    //   934: invokestatic 412	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   937: goto -443 -> 494
    //   940: getstatic 415	com/tencent/mm/platformtools/r:icG	I
    //   943: iconst_2
    //   944: if_icmpne +8 -> 952
    //   947: iconst_0
    //   948: istore_1
    //   949: goto -63 -> 886
    //   952: aload_0
    //   953: aload_2
    //   954: getfield 290	com/tencent/mm/protocal/c/ben:tvh	Ljava/lang/String;
    //   957: putfield 67	com/tencent/mm/plugin/sns/model/y:hAC	Ljava/lang/String;
    //   960: aload_0
    //   961: getfield 67	com/tencent/mm/plugin/sns/model/y:hAC	Ljava/lang/String;
    //   964: invokestatic 253	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   967: ifeq +16 -> 983
    //   970: ldc -100
    //   972: ldc_w 417
    //   975: invokestatic 419	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   978: iconst_0
    //   979: istore_1
    //   980: goto -94 -> 886
    //   983: iconst_1
    //   984: istore_1
    //   985: goto -99 -> 886
    //   988: aload_0
    //   989: invokespecial 423	com/tencent/mm/plugin/sns/model/y:bgM	()Z
    //   992: ifne +7 -> 999
    //   995: aload_0
    //   996: invokespecial 426	com/tencent/mm/plugin/sns/model/y:onError	()V
    //   999: ldc2_w 43
    //   1002: ldc 45
    //   1004: invokestatic 403	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1007: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1008	0	this	y
    //   0	1008	1	paramInt1	int
    //   0	1008	2	paramString	String
    //   0	1008	3	paramBoolean	boolean
    //   0	1008	4	paramInt2	int
    //   428	6	5	str	String
    //   922	5	5	localException	Exception
    //   315	481	6	localamq	amq
    //   211	493	7	localq	q
    // Exception table:
    //   from	to	target	type
    //   297	317	904	java/lang/Exception
    //   470	494	922	java/lang/Exception
  }
  
  private boolean bgM()
  {
    GMTrace.i(8073867427840L, 60155);
    Object localObject = ae.bhe().dQ(this.pYt);
    int j = ((q)localObject).qvv - ((q)localObject).offset;
    int i = j;
    if (j > this.hAV) {
      i = this.hAV;
    }
    this.offset = ((q)localObject).offset;
    localObject = FileOp.c(this.path, this.offset, i);
    if ((localObject == null) || (localObject.length <= 0))
    {
      GMTrace.o(8073867427840L, 60155);
      return false;
    }
    axs localaxs = new axs();
    localaxs.bd((byte[])localObject);
    this.qcd.tyt = localaxs;
    this.qcd.twV = this.offset;
    GMTrace.o(8073867427840L, 60155);
    return true;
  }
  
  private void onError()
  {
    GMTrace.i(8074806951936L, 60162);
    q localq = ae.bhe().dQ(this.pYt);
    localq.offset = 0;
    try
    {
      amq localamq = (amq)new amq().aC(localq.qvA);
      localamq.uiz = "";
      localq.qvA = localamq.toByteArray();
      ae.bhe().a(this.pYt, localq);
      ae.bho().ub(this.pYt);
      GMTrace.o(8074806951936L, 60162);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.NetSceneMMSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
      GMTrace.o(8074806951936L, 60162);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    int i = 107;
    GMTrace.i(8075075387392L, 60164);
    this.gMF = parame1;
    if (this.qcg)
    {
      this.hAC = this.qcd.tvh;
      if (bg.mZ(this.hAC))
      {
        w.w("MicroMsg.NetSceneMMSnsUpload", "cdntra genClientId failed not use cdn");
        GMTrace.o(8075075387392L, 60164);
        return 0;
      }
      parame = new h();
      parame.hsO = this.hAM;
      parame.field_mediaId = this.hAC;
      parame.field_fullpath = this.path;
      parame.field_thumbpath = "";
      parame.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FRIENDS;
      parame.field_talker = "";
      parame.field_priority = com.tencent.mm.modelcdntran.b.hrv;
      parame.field_needStorage = true;
      parame.field_isStreamMedia = false;
      if (r.bkF()) {
        if (this.qch) {
          i = 108;
        }
      }
      for (parame.field_appType = i;; parame.field_appType = i)
      {
        parame.field_bzScene = 1;
        if (com.tencent.mm.modelcdntran.g.Gi().c(parame)) {
          break;
        }
        w.e("MicroMsg.NetSceneMMSnsUpload", "cdntra addSendTask failed. clientid:%s", new Object[] { this.hAC });
        this.hAC = "";
        break;
        if (!r.bkE()) {
          break label220;
        }
        if (this.qch) {
          i = 108;
        }
      }
      label220:
      com.tencent.mm.modelcdntran.g.Gi();
      if (com.tencent.mm.modelcdntran.c.fI(64))
      {
        if (this.qch) {}
        for (i = 104;; i = 103)
        {
          parame.field_appType = i;
          break;
        }
      }
      if (this.qch) {}
      for (i = 101;; i = 100)
      {
        parame.field_appType = i;
        break;
      }
    }
    i = a(parame, this.gMC, this);
    GMTrace.o(8075075387392L, 60164);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(8074001645568L, 60156);
    int i = k.b.hmE;
    GMTrace.o(8074001645568L, 60156);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8074404298752L, 60159);
    w.i("MicroMsg.NetSceneMMSnsUpload", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramp = (beo)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if (paramInt2 == 4)
    {
      tW(paramInt3);
      if (this.qcj == 21) {
        com.tencent.mm.plugin.sns.lucky.a.b.nK(12);
      }
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8074404298752L, 60159);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      onError();
      if (this.qcj == 21) {
        com.tencent.mm.plugin.sns.lucky.a.b.nK(13);
      }
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8074404298752L, 60159);
      return;
    }
    paramArrayOfByte = ae.bhe().dQ(this.pYt);
    if ((paramp.twV < 0) || ((paramp.twV > paramArrayOfByte.qvv) && (paramArrayOfByte.qvv > 0)))
    {
      onError();
      if (paramInt2 == 3) {
        com.tencent.mm.plugin.sns.lucky.a.b.nK(14);
      }
      GMTrace.o(8074404298752L, 60159);
      return;
    }
    if (paramp.twV < paramArrayOfByte.offset)
    {
      onError();
      if (paramInt2 == 3) {
        com.tencent.mm.plugin.sns.lucky.a.b.nK(14);
      }
      GMTrace.o(8074404298752L, 60159);
      return;
    }
    w.d("MicroMsg.NetSceneMMSnsUpload", " bufferUrl: " + paramp.uwz.mDo + " bufferUrlType: " + paramp.uwz.jXP + "  id:" + paramp.tDg + " thumb Count: " + paramp.uiw + "  type " + paramp.jXP + " startPos : " + paramp.twV);
    paramArrayOfByte.offset = paramp.twV;
    ae.bhe().a(this.pYt, paramArrayOfByte);
    if ((paramArrayOfByte.offset == paramArrayOfByte.qvv) && (paramArrayOfByte.qvv != 0))
    {
      paramInt1 = 1;
      if (paramInt1 == 0) {
        break label639;
      }
      w.i("MicroMsg.NetSceneMMSnsUpload", "uploadsns done pass: " + (System.currentTimeMillis() - this.qci));
      if ((paramp.uix.size() == 0) || (paramp.uix.size() <= 0)) {
        break label587;
      }
      a(paramp.uwz.mDo, paramp.uwz.jXP, ((bcw)paramp.uix.get(0)).mDo, ((bcw)paramp.uix.get(0)).jXP, paramp.tDg, this.qcd.tLN);
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8074404298752L, 60159);
      return;
      paramInt1 = 0;
      break;
      label587:
      a(paramp.uwz.mDo, paramp.uwz.jXP, "", 0, paramp.tDg, this.qcd.tLN);
    }
    label639:
    if ((bgM()) && (a(this.hmo, this.gMF) < 0)) {
      this.gMF.a(3, -1, "doScene failed", this);
    }
    GMTrace.o(8074404298752L, 60159);
  }
  
  public final boolean a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    GMTrace.i(8074538516480L, 60160);
    q localq = ae.bhe().dQ(this.pYt);
    w.i("MicroMsg.NetSceneMMSnsUpload", "upload ok " + paramString1 + "  " + paramString3 + "  " + paramInt1 + " thumbUrl: " + paramString2);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeFile(this.path, localOptions, null, 0, new int[0]);
    Object localObject;
    if (localOptions.outMimeType != null) {
      localObject = localOptions.outMimeType.toLowerCase();
    }
    for (;;)
    {
      int i = -1;
      if ((((String)localObject).endsWith("jpg")) || (((String)localObject).endsWith("jpeg")))
      {
        int j = MMNativeJpeg.queryQuality(this.path);
        i = j;
        if (j == 0) {
          i = -1;
        }
      }
      long l = FileOp.kI(this.path);
      com.tencent.mm.plugin.sns.h.c.a(paramString1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, i, l);
      localq.qvz = paramString3;
      try
      {
        paramString3 = (amq)new amq().aC(localq.qvA);
        localObject = paramString3;
        if (paramString3 == null) {
          localObject = new amq();
        }
        paramString3 = new amk();
        paramString3.jXP = paramInt1;
        paramString3.mDo = paramString1;
        ((amq)localObject).uiv = paramString3;
        ((amq)localObject).uiy = 0;
        ((amq)localObject).fwU = paramString4;
        if (!bg.mZ(paramString2))
        {
          paramString1 = new amk();
          paramString1.jXP = paramInt2;
          paramString1.mDo = paramString2;
          ((amq)localObject).uix.add(paramString1);
        }
      }
      catch (Exception paramString3)
      {
        try
        {
          localq.qvA = ((amq)localObject).toByteArray();
          localq.bkD();
          ae.bhe().a(this.pYt, localq);
          ae.bho().ub(this.pYt);
          if (ae.bhl() != null) {
            ae.bhl().bgd();
          }
          GMTrace.o(8074538516480L, 60160);
          return true;
          localObject = "";
          continue;
          paramString3 = paramString3;
          paramString3 = null;
        }
        catch (Exception paramString1)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.NetSceneMMSnsUpload", paramString1, "", new Object[0]);
          }
        }
      }
    }
  }
  
  protected final void cancel()
  {
    GMTrace.i(8074941169664L, 60163);
    super.cancel();
    if ((this.qcg) && (!bg.mZ(this.hAC)))
    {
      w.i("MicroMsg.NetSceneMMSnsUpload", "cancel by cdn " + this.hAC);
      com.tencent.mm.modelcdntran.g.Gi().jm(this.hAC);
    }
    GMTrace.o(8074941169664L, 60163);
  }
  
  public final int getType()
  {
    GMTrace.i(8074270081024L, 60158);
    GMTrace.o(8074270081024L, 60158);
    return 207;
  }
  
  public final void tV(int paramInt)
  {
    GMTrace.i(16041434415104L, 119518);
    int i = 0;
    while (i < a.hrt.length)
    {
      if (paramInt == a.hrt[i])
      {
        tW(0);
        GMTrace.o(16041434415104L, 119518);
        return;
      }
      i += 1;
    }
    onError();
    GMTrace.o(16041434415104L, 119518);
  }
  
  public final void tW(int paramInt)
  {
    GMTrace.i(8074672734208L, 60161);
    q localq = ae.bhe().dQ(this.pYt);
    try
    {
      amq localamq = (amq)new amq().aC(localq.qvA);
      localamq.uiy = 1;
      localamq.uig = paramInt;
      localq.qvA = localamq.toByteArray();
      ae.bho().ub(this.pYt);
      ae.bhe().a(this.pYt, localq);
      GMTrace.o(8074672734208L, 60161);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected final int vG()
  {
    GMTrace.i(8074135863296L, 60157);
    if (this.qcf)
    {
      GMTrace.o(8074135863296L, 60157);
      return 675;
    }
    GMTrace.o(8074135863296L, 60157);
    return 100;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */