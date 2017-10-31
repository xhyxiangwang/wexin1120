package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bqb;
import java.util.ArrayList;
import java.util.List;

public final class i
  extends a
{
  public bqb sim;
  
  public i()
  {
    GMTrace.i(9207470358528L, 68601);
    GMTrace.o(9207470358528L, 68601);
  }
  
  public final List<Integer> bzC()
  {
    GMTrace.i(9207604576256L, 68602);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11002));
    GMTrace.o(9207604576256L, 68602);
    return localArrayList;
  }
  
  /* Error */
  protected final byte[] l(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc2_w 52
    //   3: ldc 54
    //   5: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: iload_1
    //   9: sipush 11002
    //   12: if_icmpne +291 -> 303
    //   15: iconst_1
    //   16: iconst_0
    //   17: invokestatic 60	com/tencent/mm/plugin/wear/model/c/a:dB	(II)V
    //   20: iconst_0
    //   21: invokestatic 64	com/tencent/mm/plugin/wear/model/c/a:wQ	(I)V
    //   24: new 66	com/tencent/mm/g/a/ss
    //   27: dup
    //   28: invokespecial 67	com/tencent/mm/g/a/ss:<init>	()V
    //   31: astore 4
    //   33: aload 4
    //   35: getfield 71	com/tencent/mm/g/a/ss:fRu	Lcom/tencent/mm/g/a/ss$a;
    //   38: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   41: invokevirtual 83	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   44: getstatic 89	com/tencent/mm/R$c:aMC	I
    //   47: invokevirtual 95	android/content/res/Resources:getStringArray	(I)[Ljava/lang/String;
    //   50: putfield 101	com/tencent/mm/g/a/ss$a:fRv	[Ljava/lang/String;
    //   53: aload 4
    //   55: getfield 71	com/tencent/mm/g/a/ss:fRu	Lcom/tencent/mm/g/a/ss$a;
    //   58: iconst_1
    //   59: putfield 104	com/tencent/mm/g/a/ss$a:fvy	I
    //   62: getstatic 110	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   65: aload 4
    //   67: invokevirtual 114	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   70: pop
    //   71: invokestatic 120	com/tencent/mm/plugin/wear/model/a:bzo	()Lcom/tencent/mm/plugin/wear/model/a;
    //   74: getfield 124	com/tencent/mm/plugin/wear/model/a:shh	Lcom/tencent/mm/plugin/wear/model/d;
    //   77: aload_2
    //   78: invokevirtual 130	com/tencent/mm/plugin/wear/model/d:aR	([B)[B
    //   81: astore_2
    //   82: aload_2
    //   83: ifnull +220 -> 303
    //   86: new 132	com/tencent/mm/protocal/c/bqb
    //   89: dup
    //   90: invokespecial 133	com/tencent/mm/protocal/c/bqb:<init>	()V
    //   93: astore 5
    //   95: aload 5
    //   97: aload_2
    //   98: invokevirtual 137	com/tencent/mm/protocal/c/bqb:aC	([B)Lcom/tencent/mm/bl/a;
    //   101: pop
    //   102: new 139	com/tencent/mm/protocal/c/bqc
    //   105: dup
    //   106: invokespecial 140	com/tencent/mm/protocal/c/bqc:<init>	()V
    //   109: astore 6
    //   111: bipush 20
    //   113: istore_1
    //   114: aconst_null
    //   115: astore_2
    //   116: aload_2
    //   117: astore 4
    //   119: iload_1
    //   120: ifle +32 -> 152
    //   123: invokestatic 146	com/tencent/mm/x/m:zF	()Ljava/lang/String;
    //   126: astore_2
    //   127: aload_2
    //   128: invokestatic 152	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   131: istore_3
    //   132: aload_2
    //   133: astore 4
    //   135: iload_3
    //   136: ifeq +16 -> 152
    //   139: ldc2_w 153
    //   142: invokestatic 160	java/lang/Thread:sleep	(J)V
    //   145: iload_1
    //   146: iconst_1
    //   147: isub
    //   148: istore_1
    //   149: goto -33 -> 116
    //   152: aload 4
    //   154: invokestatic 152	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
    //   157: istore_3
    //   158: iload_3
    //   159: ifeq +13 -> 172
    //   162: ldc2_w 52
    //   165: ldc 54
    //   167: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   170: aconst_null
    //   171: areturn
    //   172: aload 6
    //   174: aload 4
    //   176: putfield 164	com/tencent/mm/protocal/c/bqc:twR	Ljava/lang/String;
    //   179: invokestatic 77	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   182: invokestatic 167	com/tencent/mm/sdk/platformtools/ab:bNa	()Ljava/lang/String;
    //   185: iconst_0
    //   186: invokevirtual 171	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   189: invokestatic 177	com/tencent/mm/sdk/platformtools/v:e	(Landroid/content/SharedPreferences;)Ljava/lang/String;
    //   192: astore_2
    //   193: invokestatic 180	com/tencent/mm/sdk/platformtools/v:bMQ	()Ljava/lang/String;
    //   196: astore 4
    //   198: aload_2
    //   199: ldc -74
    //   201: invokevirtual 187	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   204: ifeq +77 -> 281
    //   207: aload 6
    //   209: aload 4
    //   211: putfield 190	com/tencent/mm/protocal/c/bqc:lph	Ljava/lang/String;
    //   214: aload 6
    //   216: invokevirtual 194	com/tencent/mm/protocal/c/bqc:toByteArray	()[B
    //   219: astore_2
    //   220: invokestatic 120	com/tencent/mm/plugin/wear/model/a:bzo	()Lcom/tencent/mm/plugin/wear/model/a;
    //   223: getfield 124	com/tencent/mm/plugin/wear/model/a:shh	Lcom/tencent/mm/plugin/wear/model/d;
    //   226: aload_2
    //   227: invokevirtual 197	com/tencent/mm/plugin/wear/model/d:aS	([B)[B
    //   230: astore_2
    //   231: aload_2
    //   232: ifnull +81 -> 313
    //   235: aload_0
    //   236: aload 5
    //   238: putfield 199	com/tencent/mm/plugin/wear/model/e/i:sim	Lcom/tencent/mm/protocal/c/bqb;
    //   241: new 201	com/tencent/mm/g/a/st
    //   244: dup
    //   245: invokespecial 202	com/tencent/mm/g/a/st:<init>	()V
    //   248: astore 4
    //   250: aload 4
    //   252: getfield 206	com/tencent/mm/g/a/st:fRw	Lcom/tencent/mm/g/a/st$a;
    //   255: bipush 9
    //   257: putfield 209	com/tencent/mm/g/a/st$a:fvy	I
    //   260: getstatic 110	com/tencent/mm/sdk/b/a:uLm	Lcom/tencent/mm/sdk/b/a;
    //   263: aload 4
    //   265: invokestatic 215	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   268: invokevirtual 219	com/tencent/mm/sdk/b/a:a	(Lcom/tencent/mm/sdk/b/b;Landroid/os/Looper;)V
    //   271: ldc2_w 52
    //   274: ldc 54
    //   276: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   279: aload_2
    //   280: areturn
    //   281: aload 6
    //   283: aload_2
    //   284: putfield 190	com/tencent/mm/protocal/c/bqc:lph	Ljava/lang/String;
    //   287: goto -73 -> 214
    //   290: astore_2
    //   291: ldc -35
    //   293: aload_2
    //   294: ldc -33
    //   296: iconst_0
    //   297: anewarray 225	java/lang/Object
    //   300: invokestatic 231	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   303: ldc2_w 52
    //   306: ldc 54
    //   308: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   311: aconst_null
    //   312: areturn
    //   313: ldc2_w 52
    //   316: ldc 54
    //   318: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   321: aconst_null
    //   322: areturn
    //   323: astore 4
    //   325: goto -180 -> 145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	328	0	this	i
    //   0	328	1	paramInt	int
    //   0	328	2	paramArrayOfByte	byte[]
    //   131	28	3	bool	boolean
    //   31	233	4	localObject	Object
    //   323	1	4	localInterruptedException	InterruptedException
    //   93	144	5	localbqb	bqb
    //   109	173	6	localbqc	com.tencent.mm.protocal.c.bqc
    // Exception table:
    //   from	to	target	type
    //   86	111	290	java/io/IOException
    //   123	132	290	java/io/IOException
    //   139	145	290	java/io/IOException
    //   152	158	290	java/io/IOException
    //   172	214	290	java/io/IOException
    //   214	231	290	java/io/IOException
    //   235	271	290	java/io/IOException
    //   281	287	290	java/io/IOException
    //   139	145	323	java/lang/InterruptedException
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */