package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.amr;
import com.tencent.mm.protocal.c.ams;
import com.tencent.mm.protocal.c.bj;
import com.tencent.mm.protocal.c.bk;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  extends k
  implements com.tencent.mm.network.j
{
  public String chatroomName;
  public int fFD;
  public final List<String> fGB;
  public final List<String> fGC;
  public final List<String> fGw;
  public final List<String> fGz;
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public final List<String> kCA;
  public final List<String> kCy;
  public final List<String> kCz;
  
  public d(String paramString1, List<String> paramList, String paramString2)
  {
    GMTrace.i(9066675961856L, 67552);
    this.gMF = null;
    this.fFD = 0;
    this.chatroomName = null;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bj();
    ((b.a)localObject).hlY = new bk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addchatroommember";
    ((b.a)localObject).hlW = 120;
    ((b.a)localObject).hlZ = 36;
    ((b.a)localObject).hma = 1000000036;
    this.gMC = ((b.a)localObject).DA();
    localObject = (bj)this.gMC.hlU.hmc;
    ((bj)localObject).tuX = n.mV(paramString1);
    this.chatroomName = paramString1;
    paramString1 = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      amr localamr = new amr();
      localamr.tKK = n.mV(str);
      paramString1.add(localamr);
    }
    ((bj)localObject).tuW = paramString1;
    ((bj)localObject).kCJ = paramString1.size();
    this.kCy = new ArrayList();
    this.fGz = new LinkedList();
    this.kCz = new LinkedList();
    this.fGB = new LinkedList();
    this.fGC = new LinkedList();
    this.kCA = new ArrayList();
    this.fGw = paramList;
    ((bj)localObject).tuZ = paramString2;
    GMTrace.o(9066675961856L, 67552);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9066810179584L, 67553);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(9066810179584L, 67553);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9067078615040L, 67555);
    paramp = (bj)this.gMC.hlU.hmc;
    paramArrayOfByte = (bk)this.gMC.hlV.hmc;
    this.fFD = paramArrayOfByte.kCJ;
    LinkedList localLinkedList = paramArrayOfByte.tuW;
    paramInt1 = 0;
    if (paramInt1 < localLinkedList.size())
    {
      int i = ((ams)localLinkedList.get(paramInt1)).uiE;
      if (i == 0) {
        this.kCy.add(n.a(((ams)localLinkedList.get(paramInt1)).tKK));
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        if (i == 3)
        {
          w.d("MicroMsg.NetSceneAddChatRoomMember", " blacklist : " + ((ams)localLinkedList.get(paramInt1)).tKK);
          this.kCz.add(n.a(((ams)localLinkedList.get(paramInt1)).tKK));
        }
        else if (i == 1)
        {
          w.d("MicroMsg.NetSceneAddChatRoomMember", " not user : " + ((ams)localLinkedList.get(paramInt1)).tKK);
          this.fGB.add(n.a(((ams)localLinkedList.get(paramInt1)).tKK));
        }
        else if (i == 2)
        {
          w.d("MicroMsg.NetSceneAddChatRoomMember", " invalid username : " + ((ams)localLinkedList.get(paramInt1)).tKK);
          this.fGz.add(n.a(((ams)localLinkedList.get(paramInt1)).tKK));
        }
        else if (i == 4)
        {
          w.d("MicroMsg.NetSceneAddChatRoomMember", " verify user : " + ((ams)localLinkedList.get(paramInt1)).tKK);
          this.fGC.add(n.a(((ams)localLinkedList.get(paramInt1)).tKK));
        }
        else if (i != 5)
        {
          if (i == 6) {
            this.kCA.add(n.a(((ams)localLinkedList.get(paramInt1)).tKK));
          } else {
            w.w("MicroMsg.NetSceneAddChatRoomMember", "unknown member status : status = " + i);
          }
        }
      }
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      com.tencent.mm.x.j.a(n.a(paramp.tuX), paramArrayOfByte);
    }
    GMTrace.o(9067078615040L, 67555);
  }
  
  public final int getType()
  {
    GMTrace.i(9066944397312L, 67554);
    GMTrace.o(9066944397312L, 67554);
    return 120;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */