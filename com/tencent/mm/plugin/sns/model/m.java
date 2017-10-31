package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.bcx;
import com.tencent.mm.protocal.c.bcy;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class m
  extends k
  implements j
{
  private static Vector<String> qbj;
  private String desc;
  final int fwj;
  private com.tencent.mm.ac.b gMC;
  public com.tencent.mm.ac.e gMF;
  private boolean kpQ;
  private ArrayList<com.tencent.mm.plugin.sns.storage.m> kqL;
  private boolean qbg;
  private long qbh;
  private long qbi;
  public int qbk;
  public int qbl;
  
  static
  {
    GMTrace.i(8152519016448L, 60741);
    qbj = new Vector();
    GMTrace.o(8152519016448L, 60741);
  }
  
  public m(String paramString)
  {
    GMTrace.i(8151847927808L, 60736);
    this.qbh = 0L;
    this.qbi = 0L;
    this.kpQ = false;
    this.kqL = new ArrayList();
    this.qbk = 0;
    this.qbl = 0;
    this.desc = "";
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bcx();
    ((b.a)localObject).hlY = new bcy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsclassifytimeline";
    ((b.a)localObject).hlW = 601;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    this.qbh = 0L;
    if (0L == 0L) {}
    for (boolean bool = true;; bool = false)
    {
      this.qbg = bool;
      this.fwj = 2;
      localObject = (bcx)this.gMC.hlU.hmc;
      ((bcx)localObject).uuR = "";
      ((bcx)localObject).uuS = 0L;
      ((bcx)localObject).uuT = paramString;
      ((bcx)localObject).uuU = 1;
      w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "maxid %s classifyid %s classifyType %d", new Object[] { i.jdMethod_do(0L), paramString, Integer.valueOf(0) });
      GMTrace.o(8151847927808L, 60736);
      return;
    }
  }
  
  /* Error */
  public static boolean Gu(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 164
    //   6: ldc -90
    //   8: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 46	com/tencent/mm/plugin/sns/model/m:qbj	Ljava/util/Vector;
    //   14: aload_0
    //   15: invokevirtual 170	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   18: ifeq +18 -> 36
    //   21: iconst_0
    //   22: istore_1
    //   23: ldc2_w 164
    //   26: ldc -90
    //   28: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: ldc 2
    //   33: monitorexit
    //   34: iload_1
    //   35: ireturn
    //   36: getstatic 46	com/tencent/mm/plugin/sns/model/m:qbj	Ljava/util/Vector;
    //   39: aload_0
    //   40: invokevirtual 173	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   43: pop
    //   44: iconst_1
    //   45: istore_1
    //   46: ldc2_w 164
    //   49: ldc -90
    //   51: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   54: goto -23 -> 31
    //   57: astore_0
    //   58: ldc 2
    //   60: monitorexit
    //   61: aload_0
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	paramString	String
    //   22	24	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	21	57	finally
    //   23	31	57	finally
    //   36	44	57	finally
    //   46	54	57	finally
  }
  
  public static boolean Gv(String paramString)
  {
    try
    {
      GMTrace.i(8151713710080L, 60735);
      qbj.remove(paramString);
      GMTrace.o(8151713710080L, 60735);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private com.tencent.mm.plugin.sns.storage.m b(bdk parambdk)
  {
    GMTrace.i(8151982145536L, 60737);
    com.tencent.mm.plugin.sns.storage.m localm = new com.tencent.mm.plugin.sns.storage.m();
    Object localObject = new String(parambdk.uve.ush.toByteArray());
    w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "from server %d ", new Object[] { Long.valueOf(parambdk.tDg) });
    if (!localm.Hy((String)localObject))
    {
      GMTrace.o(8151982145536L, 60737);
      return null;
    }
    parambdk.uve.bd(new byte[0]);
    localm.field_userName = parambdk.twR;
    localm.fZ(parambdk.orU);
    localm.field_likeFlag = parambdk.uvf;
    localm.dL(parambdk.tDg);
    localm.dN(parambdk.tDg);
    localm.uD(this.fwj);
    try
    {
      localm.aE(parambdk.toByteArray());
      localObject = localm.bjL();
      ((bhc)localObject).jWW = parambdk.twR;
      localm.field_pravited = ((bhc)localObject).uhC;
      w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "ext flag " + parambdk.ujv);
      localm.bkd();
      localm.c((bhc)localObject);
      localm.field_type = ((bhc)localObject).uyu.tKc;
      localm.field_subType = ((bhc)localObject).uyu.tKe;
      GMTrace.o(8151982145536L, 60737);
      return localm;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.NetSceneSnsClassifyTimeLine", localException, "", new Object[0]);
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8152384798720L, 60740);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8152384798720L, 60740);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8152116363264L, 60738);
    w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (bcy)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if ((paramp.Ba().tpN != 207) && (paramp.Ba().tpN != 0) && (paramp.Ba().tpN != 212))
    {
      Gv("@__classify_timeline");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8152116363264L, 60738);
      return;
    }
    if (paramp.Ba().tpN == 212) {}
    for (boolean bool = true;; bool = false)
    {
      this.kpQ = bool;
      this.qbk = paramArrayOfByte.uuV;
      this.desc = paramArrayOfByte.txe;
      i.dp(this.qbh);
      w.d("MicroMsg.NetSceneSnsClassifyTimeLine", "resp objCount %d desc %s", new Object[] { Integer.valueOf(paramArrayOfByte.ujC), this.desc });
      paramp = paramArrayOfByte.tze.iterator();
      while (paramp.hasNext())
      {
        paramArrayOfByte = b((bdk)paramp.next());
        if (paramArrayOfByte != null) {
          this.kqL.add(paramArrayOfByte);
        }
      }
    }
    Gv("@__classify_timeline");
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8152116363264L, 60738);
  }
  
  public final int getType()
  {
    GMTrace.i(8152250580992L, 60739);
    GMTrace.o(8152250580992L, 60739);
    return 601;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */