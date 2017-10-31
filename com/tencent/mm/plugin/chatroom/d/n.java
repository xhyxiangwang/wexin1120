package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.bhs;
import com.tencent.mm.protocal.c.bht;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public String username;
  
  public n(String paramString1, String paramString2)
  {
    GMTrace.i(9062112559104L, 67518);
    b.a locala = new b.a();
    this.username = paramString2;
    bhs localbhs = new bhs();
    localbhs.tKF = paramString1;
    localbhs.uyU = paramString2;
    locala.hlX = localbhs;
    locala.hlY = new bht();
    locala.uri = "/cgi-bin/micromsg-bin/transferchatroomowner";
    locala.hlW = 990;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    GMTrace.o(9062112559104L, 67518);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9062515212288L, 67521);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(9062515212288L, 67521);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9062246776832L, 67519);
    w.w("MicroMsg.NetSceneTransferChatRoomOwner", "errType = " + paramInt2 + " errCode " + paramInt3 + " errMsg " + paramString);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9062246776832L, 67519);
  }
  
  public final int getType()
  {
    GMTrace.i(9062380994560L, 67520);
    GMTrace.o(9062380994560L, 67520);
    return 990;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */