package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.bep;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.ber;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Vector;

public final class z
  extends com.tencent.mm.ac.k
  implements j, d
{
  private static Vector<String> qcl;
  private boolean fAk;
  private final int fwj;
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  private String qbI;
  private long qbZ;
  private boolean qbg;
  private long qbh;
  long qbi;
  public int qbk;
  private boolean qca;
  private boolean qcb;
  private int qcm;
  private boolean qcn;
  private boolean qco;
  public long qcp;
  String userName;
  
  static
  {
    GMTrace.i(8100576755712L, 60354);
    qcl = new Vector();
    GMTrace.o(8100576755712L, 60354);
  }
  
  public z(String paramString, long paramLong, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(8098697707520L, 60340);
    this.qbZ = 0L;
    this.qbh = 0L;
    this.qbi = 0L;
    this.qcm = 0;
    this.qcn = false;
    this.qbI = "";
    this.qca = false;
    this.qcb = false;
    this.qco = false;
    this.qbk = 0;
    this.userName = paramString;
    this.qbh = paramLong;
    this.fAk = paramBoolean;
    int i;
    label120:
    Object localObject;
    n localn;
    if (paramLong == 0L)
    {
      w.i("MicroMsg.NetSceneSnsUserPage", "fp userName " + paramString);
      if (!paramBoolean) {
        break label460;
      }
      i = 4;
      this.fwj = i;
      localObject = new b.a();
      ((b.a)localObject).hlX = new beq();
      ((b.a)localObject).hlY = new ber();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsuserpage";
      ((b.a)localObject).hlW = 212;
      ((b.a)localObject).hlZ = 99;
      ((b.a)localObject).hma = 1000000099;
      this.gMC = ((b.a)localObject).DA();
      localObject = (beq)this.gMC.hlU.hmc;
      ((beq)localObject).twR = paramString;
      ((beq)localObject).uuS = paramLong;
      if (paramLong == 0L) {
        bool = true;
      }
      this.qbg = bool;
      i = ae.bhf().GH(paramString);
      localn = ae.bhp();
      if (!this.qbg) {
        break label467;
      }
    }
    for (;;)
    {
      this.qbi = localn.a(l, i, paramString, paramBoolean);
      ((beq)localObject).uwo = this.qbi;
      int j = c.a(this.qbi, paramLong, paramString);
      ((beq)localObject).uwp = j;
      ((beq)localObject).twh = paramInt;
      if (this.qbg)
      {
        this.qbI = ae.bhs().HE(paramString).field_md5;
        if (this.qbI == null) {
          this.qbI = "";
        }
        ((beq)localObject).uuR = this.qbI;
      }
      this.qbZ = paramLong;
      w.i("MicroMsg.NetSceneSnsUserPage", "nextCount: " + i + " maxId:" + i.jdMethod_do(paramLong) + " minId:" + i.jdMethod_do(this.qbi) + " lastReqTime:" + j + " snsSource " + paramInt);
      GMTrace.o(8098697707520L, 60340);
      return;
      w.i("MicroMsg.NetSceneSnsUserPage", "np userName " + paramString);
      break;
      label460:
      i = 8;
      break label120;
      label467:
      l = paramLong;
    }
  }
  
  /* Error */
  public static boolean Gx(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 245
    //   6: ldc -9
    //   8: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: getstatic 52	com/tencent/mm/plugin/sns/model/z:qcl	Ljava/util/Vector;
    //   14: aload_0
    //   15: invokevirtual 251	java/util/Vector:contains	(Ljava/lang/Object;)Z
    //   18: ifeq +18 -> 36
    //   21: iconst_0
    //   22: istore_1
    //   23: ldc2_w 245
    //   26: ldc -9
    //   28: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   31: ldc 2
    //   33: monitorexit
    //   34: iload_1
    //   35: ireturn
    //   36: getstatic 52	com/tencent/mm/plugin/sns/model/z:qcl	Ljava/util/Vector;
    //   39: aload_0
    //   40: invokevirtual 254	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   43: pop
    //   44: iconst_1
    //   45: istore_1
    //   46: ldc2_w 245
    //   49: ldc -9
    //   51: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
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
  
  public static boolean Gy(String paramString)
  {
    try
    {
      GMTrace.i(8098563489792L, 60339);
      qcl.remove(paramString);
      GMTrace.o(8098563489792L, 60339);
      return true;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  private void a(ber paramber, String paramString)
  {
    GMTrace.i(8098966142976L, 60342);
    ai.a(this.userName, this.fwj, paramber.tze, paramString);
    if (this.qbh == 0L) {}
    for (this.qbh = ((bdk)paramber.tze.getFirst()).tDg;; this.qbh = c.ds(this.qbh))
    {
      this.qbi = ((bdk)paramber.tze.getLast()).tDg;
      w.i("MicroMsg.NetSceneSnsUserPage", "insertListAndUpdateFaultInfo userName %s maxId %s minId %s NewRequestTime %s", new Object[] { this.userName, Long.valueOf(this.qbh), Long.valueOf(this.qbi), Integer.valueOf(paramber.uws) });
      c.c(this.userName, this.qbh, this.qbi, paramber.uws);
      GMTrace.o(8098966142976L, 60342);
      return;
    }
  }
  
  private void bgL()
  {
    GMTrace.i(8098831925248L, 60341);
    Object localObject = ae.bhp();
    String str = this.userName;
    boolean bool = this.fAk;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("select snsId from SnsInfo ").append(n.at(str, bool)).append(" AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25) and  (snsId != 0  )  limit ").append(4);
    str = localStringBuilder.toString();
    localObject = ((n)localObject).gMB.rawQuery(str, null);
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    if ((i <= 3) && (i > 0))
    {
      this.qcb = true;
      GMTrace.o(8098831925248L, 60341);
      return;
    }
    if (i == 0) {
      this.qca = true;
    }
    GMTrace.o(8098831925248L, 60341);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8099368796160L, 60345);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8099368796160L, 60345);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8099100360704L, 60343);
    w.i("MicroMsg.NetSceneSnsUserPage", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    ber localber = (ber)((b)paramp).hlV.hmc;
    if ((paramp.Ba().tpN != 207) && (paramp.Ba().tpN != 203) && (paramp.Ba().tpN != 0) && (paramp.Ba().tpN != 2001) && (paramp.Ba().tpN != 2004) && (paramp.Ba().tpN != 2003))
    {
      Gy(this.userName);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8099100360704L, 60343);
      return;
    }
    Object localObject;
    boolean bool;
    if (paramp.Ba().tpN == 2003)
    {
      paramArrayOfByte = ae.bhp();
      str1 = this.userName;
      localObject = "DELETE FROM SnsInfo" + " where SnsInfo.userName=\"" + bg.mX(str1) + "\"";
      bool = paramArrayOfByte.gMB.eL("SnsInfo", (String)localObject);
      w.d("MicroMsg.SnsInfoStorage", "del snsinfo " + str1 + " res " + bool);
    }
    this.qbk = localber.uuV;
    w.i("MicroMsg.NetSceneSnsUserPage", "for same md5 count: " + localber.uuV + " , objCount:  " + localber.ujC);
    this.qcp = localber.uwC;
    String str1 = i.dp(this.qbh);
    if (!this.qbg)
    {
      w.d("MicroMsg.NetSceneSnsUserPage", "np  " + localber.tze.size());
      if (localber.tze.isEmpty()) {
        if (paramp.Ba().tpN == 203)
        {
          bool = true;
          this.qco = bool;
          ae.bhp().a(this.userName, this.fAk, str1);
          this.qca = true;
          this.qbi = this.qbh;
        }
      }
      for (;;)
      {
        Gy(this.userName);
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8099100360704L, 60343);
        return;
        bool = false;
        break;
        a(localber, str1);
      }
    }
    if (this.qbI.equals(localber.uuR))
    {
      paramp = ae.bhp();
      if (this.qbg) {}
      for (long l = 0L;; l = this.qbZ)
      {
        this.qbi = paramp.a(l, this.qbk, this.userName, this.fAk);
        w.i("MicroMsg.NetSceneSnsUserPage", "md5 is nochange the new minid %s", new Object[] { Long.valueOf(this.qbi) });
        bgL();
        Gy(this.userName);
        paramp = ae.bhs().HE(this.userName);
        this.gMF.a(paramp.field_lastFirstPageRequestErrType, paramp.field_lastFirstPageRequestErrCode, paramString, this);
        GMTrace.o(8099100360704L, 60343);
        return;
      }
    }
    w.i("MicroMsg.NetSceneSnsUserPage", "fp  " + localber.tze.size());
    if ((!this.qbg) || (this.qbI.equals(localber.uuR)))
    {
      ae.bhs().k(this.userName, localber.uuR, paramInt2, paramInt3);
      if ((paramp.Ba().tpN != 207) && (paramp.Ba().tpN != 2001) && (paramp.Ba().tpN != 2004)) {
        break label1366;
      }
      ae.bhs().dC(this.userName, "");
      if (!localber.tze.isEmpty()) {
        break label1206;
      }
      paramp = ae.bhp();
      paramArrayOfByte = this.userName;
      bool = this.fAk;
      paramp.i(bool, n.at(paramArrayOfByte, bool) + " AND  (snsId != 0  ) ");
      this.qbi = this.qbh;
    }
    for (;;)
    {
      bgL();
      Gy(this.userName);
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8099100360704L, 60343);
      return;
      this.qcm = localber.uwB;
      paramArrayOfByte = ae.bhs().HE(this.userName);
      paramArrayOfByte.field_icount = this.qcm;
      localObject = localber.ufm;
      if (localObject != null)
      {
        str2 = i.jdMethod_do(((bep)localObject).huW);
        String str3 = ae.getAccSnsPath();
        String str4 = this.userName + "bg_";
        String str5 = this.userName + "tbg_";
        if ((paramArrayOfByte.field_bgUrl == null) || (!paramArrayOfByte.field_bgId.equals(str2)))
        {
          paramArrayOfByte.field_older_bgId = paramArrayOfByte.field_bgId;
          if (FileOp.aZ(am.dt(str3, this.userName) + str4))
          {
            FileOp.deleteFile(am.dt(str3, this.userName) + str5);
            FileOp.g(am.dt(str3, this.userName), str4, str5);
          }
          this.qcn = true;
          paramArrayOfByte.bjU();
          w.d("MicroMsg.NetSceneSnsUserPage", "get new  bgid " + ((bep)localObject).huV);
        }
        paramArrayOfByte.field_bgId = str2;
        paramArrayOfByte.field_bgUrl = ((bep)localObject).huV;
        paramArrayOfByte.field_snsBgId = ((bep)localObject).huW;
      }
      ae.bhs().a(paramArrayOfByte);
      break;
      label1206:
      localObject = ae.bhp();
      paramp = this.userName;
      bool = this.fAk;
      String str2 = i.dp(((bdk)localber.tze.getFirst()).tDg);
      paramArrayOfByte = n.at(paramp, bool) + " AND  (snsId != 0  ) ";
      paramp = paramArrayOfByte;
      if (n.HI(str2)) {
        paramp = paramArrayOfByte + " AND " + ((n)localObject).HL(str2);
      }
      ((n)localObject).i(bool, paramp);
      ae.bhp().a(this.userName, this.fAk, i.dp(((bdk)localber.tze.getLast()).tDg));
      a(localber, str1);
    }
    label1366:
    if (localber.tze.size() == 0)
    {
      w.d("MicroMsg.NetSceneSnsUserPage", "error: server give size zero");
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8099100360704L, 60343);
      return;
    }
    a(localber, str1);
    Gy(this.userName);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8099100360704L, 60343);
  }
  
  public final long bgA()
  {
    GMTrace.i(8099503013888L, 60346);
    long l = this.qbi;
    GMTrace.o(8099503013888L, 60346);
    return l;
  }
  
  public final boolean bgB()
  {
    GMTrace.i(8100039884800L, 60350);
    boolean bool = this.qcn;
    GMTrace.o(8100039884800L, 60350);
    return bool;
  }
  
  public final long bgC()
  {
    GMTrace.i(8100442537984L, 60353);
    long l = this.qcp;
    GMTrace.o(8100442537984L, 60353);
    return l;
  }
  
  public final boolean bgw()
  {
    GMTrace.i(8099771449344L, 60348);
    boolean bool = this.qbg;
    GMTrace.o(8099771449344L, 60348);
    return bool;
  }
  
  public final boolean bgx()
  {
    GMTrace.i(8099905667072L, 60349);
    boolean bool = this.qca;
    GMTrace.o(8099905667072L, 60349);
    return bool;
  }
  
  public final boolean bgy()
  {
    GMTrace.i(8100308320256L, 60352);
    boolean bool = this.qcb;
    GMTrace.o(8100308320256L, 60352);
    return bool;
  }
  
  public final boolean bgz()
  {
    GMTrace.i(8100174102528L, 60351);
    boolean bool = this.qco;
    GMTrace.o(8100174102528L, 60351);
    return bool;
  }
  
  public final int getType()
  {
    GMTrace.i(8099234578432L, 60344);
    GMTrace.o(8099234578432L, 60344);
    return 212;
  }
  
  public final String getUserName()
  {
    GMTrace.i(8099637231616L, 60347);
    String str = this.userName;
    GMTrace.o(8099637231616L, 60347);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */