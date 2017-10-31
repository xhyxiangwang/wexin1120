package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.of;
import com.tencent.mm.protocal.c.og;
import com.tencent.mm.protocal.c.oo;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends k
  implements com.tencent.mm.network.j
{
  public List<String> fGw;
  private b gMC;
  private com.tencent.mm.ac.e gMF;
  
  public g(String paramString, List<String> paramList)
  {
    this(paramString, paramList, 0);
    GMTrace.i(9067212832768L, 67556);
    GMTrace.o(9067212832768L, 67556);
  }
  
  public g(String paramString, List<String> paramList, int paramInt)
  {
    GMTrace.i(9067347050496L, 67557);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new of();
    ((b.a)localObject).hlY = new og();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/delchatroommember";
    ((b.a)localObject).hlW = 179;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (of)this.gMC.hlU.hmc;
    ((of)localObject).tKF = paramString;
    paramString = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      oo localoo = new oo();
      localoo.tKK = n.mV(str);
      paramString.add(localoo);
    }
    ((of)localObject).tuW = paramString;
    ((of)localObject).kCJ = paramString.size();
    ((of)localObject).ttY = paramInt;
    this.fGw = paramList;
    GMTrace.o(9067347050496L, 67557);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9067481268224L, 67558);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(9067481268224L, 67558);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9067749703680L, 67560);
    w.d("MicroMsg.NetSceneDelChatRoomMember", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramp = (of)this.gMC.hlU.hmc;
    paramArrayOfByte = (og)this.gMC.hlV.hmc;
    if (this.gMC.hlV.tpN != 0)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9067749703680L, 67560);
      return;
    }
    com.tencent.mm.x.j.a(paramp.tKF, paramArrayOfByte);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9067749703680L, 67560);
  }
  
  public final int getType()
  {
    GMTrace.i(9067615485952L, 67559);
    GMTrace.o(9067615485952L, 67559);
    return 179;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */