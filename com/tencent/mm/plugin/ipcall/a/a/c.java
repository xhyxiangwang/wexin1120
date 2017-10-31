package com.tencent.mm.plugin.ipcall.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.b;
import com.tencent.mm.protocal.c.atc;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  public String fMl;
  public String fOb;
  public String fvS;
  public int iVw;
  public LinkedList<atc> jOo;
  public int lpk;
  public String lpl;
  public b mXA;
  public int mXB;
  public int mXC;
  public b mXD;
  public LinkedList<atc> mXE;
  public int mXF;
  public LinkedList<d> mXG;
  public String mXH;
  public String mXI;
  public String mXJ;
  public int mXK;
  public boolean mXL;
  public int mXg;
  public long mXh;
  public long mXi;
  public int mXj;
  public int mXk;
  public int mXl;
  public int mXm;
  public String mXn;
  public int mXo;
  public int mXp;
  public int mXq;
  public int mXr;
  public boolean mXs;
  public boolean mXt;
  public boolean mXu;
  public boolean mXv;
  public int mXw;
  public int mXx;
  public int mXy;
  public int mXz;
  
  public c()
  {
    GMTrace.i(11617349664768L, 86556);
    this.mXs = false;
    this.mXt = false;
    this.mXu = false;
    this.mXv = true;
    this.mXw = 0;
    this.jOo = new LinkedList();
    this.mXE = new LinkedList();
    this.mXF = 999;
    this.mXG = new LinkedList();
    this.mXL = false;
    GMTrace.o(11617349664768L, 86556);
  }
  
  public final int aHC()
  {
    GMTrace.i(11617483882496L, 86557);
    if ((this.mXG != null) && (this.mXG.size() > 0))
    {
      i = ((d)this.mXG.get(0)).mXp;
      GMTrace.o(11617483882496L, 86557);
      return i;
    }
    int i = this.mXp;
    GMTrace.o(11617483882496L, 86557);
    return i;
  }
  
  public final int aHD()
  {
    GMTrace.i(11617618100224L, 86558);
    if ((this.mXG != null) && (this.mXG.size() > 0))
    {
      i = ((d)this.mXG.get(0)).gQy;
      GMTrace.o(11617618100224L, 86558);
      return i;
    }
    int i = this.iVw;
    GMTrace.o(11617618100224L, 86558);
    return i;
  }
  
  public final String toString()
  {
    GMTrace.i(11617752317952L, 86559);
    Object localObject1 = new StringBuilder("");
    ((StringBuilder)localObject1).append("IPCallInfo: ");
    ((StringBuilder)localObject1).append(String.format("[roomId: %d, roomKey: %d, callSeq: %d, inviteId: %d, roomMemberId: %d, syncKey: %d, syncInterval: %d, currentStatus: %d, ErrMsg: %s, ErrCode：%d, ErrLevel：%d]\n", new Object[] { Integer.valueOf(this.mXg), Long.valueOf(this.mXh), Long.valueOf(this.mXi), Integer.valueOf(this.mXj), Integer.valueOf(this.mXo), Integer.valueOf(this.mXp), Integer.valueOf(this.mXq), Integer.valueOf(this.iVw), this.lpl, Integer.valueOf(this.lpk), Integer.valueOf(this.mXm) }));
    ((StringBuilder)localObject1).append(String.format("[toUsername: %s, toPhoneNumber: %s]\n", new Object[] { this.fMl, this.mXI }));
    ((StringBuilder)localObject1).append("[addrList: ");
    Iterator localIterator = this.jOo.iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = (atc)localIterator.next();
      ((StringBuilder)localObject1).append(String.format("{IP: %s, port: %d}", new Object[] { ((atc)localObject2).ufP, Integer.valueOf(((atc)localObject2).uoI) }));
    }
    ((StringBuilder)localObject1).append("]");
    ((StringBuilder)localObject1).append("\n");
    if ((this.mXG != null) && (this.mXG.size() > 0))
    {
      ((StringBuilder)localObject1).append("[userInfoList: ");
      localIterator = this.mXG.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (d)localIterator.next();
        ((StringBuilder)localObject1).append("{");
        ((StringBuilder)localObject1).append(((d)localObject2).toString());
        ((StringBuilder)localObject1).append("}");
      }
      ((StringBuilder)localObject1).append("]");
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject1).toString();
      GMTrace.o(11617752317952L, 86559);
      return (String)localObject1;
      ((StringBuilder)localObject1).append("userInfoList is empty");
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */