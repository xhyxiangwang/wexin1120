package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.card.a.l;
import com.tencent.mm.protocal.c.aka;
import com.tencent.mm.protocal.c.jl;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.mx;
import com.tencent.mm.protocal.c.my;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.util.Iterator;
import java.util.List;

public final class w
  extends k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  private byte[] hEK;
  private int kpA;
  
  public w(int paramInt)
  {
    GMTrace.i(4922435174400L, 36675);
    this.kpA = 0;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneCardSync", "<init>, selector = %d", new Object[] { Integer.valueOf(1) });
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new jl();
    ((b.a)localObject).hlY = new jm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cardsync";
    ((b.a)localObject).hlW = 558;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = new aka();
    ap.AS();
    ((aka)localObject).kqI = ((String)com.tencent.mm.x.c.xi().get(w.a.uVn, null));
    ((aka)localObject).latitude = al.ajI().gBS;
    ((aka)localObject).longitude = al.ajI().gBT;
    jl localjl = (jl)this.gMC.hlU.hmc;
    localjl.tEN = 1;
    localjl.tEP = ((aka)localObject);
    localjl.tEQ = paramInt;
    this.kpA = paramInt;
    GMTrace.o(4922435174400L, 36675);
  }
  
  private static boolean a(mx parammx)
  {
    GMTrace.i(4922972045312L, 36679);
    if (parammx == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, null cmd");
      GMTrace.o(4922972045312L, 36679);
      return false;
    }
    ??? = n.a(parammx.tJq);
    if ((??? == null) || (???.length == 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, null buf");
      GMTrace.o(4922972045312L, 36679);
      return false;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneCardSync", "processCmdItem, buf length = %d, cmdId = %d", new Object[] { Integer.valueOf(???.length), Integer.valueOf(parammx.tJp) });
    try
    {
      switch (parammx.tJp)
      {
      case 1: 
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.NetSceneCardSync", "processCmdItem, unknown cmdId = %d", new Object[] { Integer.valueOf(parammx.tJp) });
        GMTrace.o(4922972045312L, 36679);
        return false;
      }
    }
    catch (Exception parammx)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, ex = %s", new Object[] { parammx.getMessage() });
      GMTrace.o(4922972045312L, 36679);
      return false;
    }
    ??? = (jp)new jp().aC((byte[])???);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "processCmdIem, card user item, Status = %d", new Object[] { Integer.valueOf(((jp)???).jXo) });
    switch (((jp)???).jXo)
    {
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "processCmdIem, card user item, unknown StateFlag = %d", new Object[] { Integer.valueOf(((jp)???).tFH) });
      GMTrace.o(4922972045312L, 36679);
      return false;
      parammx = al.ajB();
      if (??? == null) {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BatchGetCardMgr", "push fail, CardUserItem is null");
      }
      for (;;)
      {
        GMTrace.o(4922972045312L, 36679);
        return true;
        Object localObject2 = al.ajC().tB(((jp)???).tFF);
        String str = ((jp)???).tFF;
        if (localObject2 == null) {}
        for (long l = 0L;; l = ((CardInfo)localObject2).field_updateSeq)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, cardUserId = %s, localSeq = %d, svrSeq = %d", new Object[] { str, Long.valueOf(l), Long.valueOf(((jp)???).tFG) });
          if ((localObject2 == null) || (((CardInfo)localObject2).field_updateSeq != ((jp)???).tFG)) {
            break label427;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.BatchGetCardMgr", "push CardUserItem fail, card.field_updateSeq == item.UpdateSequence");
          break;
        }
        label427:
        localObject2 = aj.a((jp)???);
        synchronized (parammx.hur)
        {
          if (!parammx.kmr.contains(localObject2)) {}
        }
        if (parammx.kms.contains(localObject2)) {}
        parammx.kmr.add(localObject2);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, insertRet = %b", new Object[] { Boolean.valueOf(al.ajD().b((com.tencent.mm.sdk.e.c)localObject2)) });
      }
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4922703609856L, 36677);
    this.gMF = parame1;
    parame1 = (jl)this.gMC.hlU.hmc;
    ap.AS();
    this.hEK = bg.RA(bg.mY((String)com.tencent.mm.x.c.xi().get(282880, null)));
    if ((this.hEK == null) || (this.hEK.length == 0)) {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "doScene, keyBuf is null, init card sync~~~");
    }
    parame1.tEO = n.H(this.hEK);
    if (this.hEK == null) {}
    for (int i = 0;; i = this.hEK.length)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "doScene, keyBuf.length = %d", new Object[] { Integer.valueOf(i) });
      i = a(parame, this.gMC, this);
      GMTrace.o(4922703609856L, 36677);
      return i;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p arg5, byte[] paramArrayOfByte)
  {
    GMTrace.i(4922837827584L, 36678);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneCardSync", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "onGYNetEnd, card sync fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4922837827584L, 36678);
      return;
    }
    paramArrayOfByte = (jm)this.gMC.hlV.hmc;
    if (paramArrayOfByte.tES == 1) {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "need do getCardsLayoutScene");
    }
    this.hEK = n.a(paramArrayOfByte.tEO, new byte[0]);
    if (paramArrayOfByte.tER == null)
    {
      ??? = null;
      if (??? != null) {
        break label276;
      }
      paramInt1 = 0;
      label158:
      if (this.hEK != null) {
        break label287;
      }
      paramInt2 = 0;
      label167:
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "onGYNetEnd, cmd list size = %d, synckey length = %d, continueFlag = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfByte.tCI) });
      if ((??? == null) || (???.size() <= 0)) {
        break label432;
      }
      paramInt1 = 0;
      ??? = ???.iterator();
      label230:
      if (!???.hasNext()) {
        break label296;
      }
      if (a((mx)???.next())) {
        break label543;
      }
      paramInt1 += 1;
    }
    label276:
    label287:
    label296:
    label432:
    label543:
    for (;;)
    {
      break label230;
      ??? = paramArrayOfByte.tER.jWR;
      break;
      paramInt1 = ???.size();
      break label158;
      paramInt2 = this.hEK.length;
      break label167;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "onGYNetEnd, %d fail cmds", new Object[] { Integer.valueOf(paramInt1) });
      al.ajB().aiX();
      for (;;)
      {
        ap.AS();
        com.tencent.mm.x.c.xi().set(282880, bg.br(this.hEK));
        if (paramArrayOfByte.tCI > 0)
        {
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneCardSync", "onGYNetEnd, should continue, continueFlag = %d", new Object[] { Integer.valueOf(paramArrayOfByte.tCI) });
          paramInt1 = a(this.hmo, this.gMF);
          if (paramInt1 <= 0)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneCardSync", "onGYNetEnd, doScene again fail, ret = %d", new Object[] { Integer.valueOf(paramInt1) });
            this.gMF.a(3, -1, paramString, this);
          }
          GMTrace.o(4922837827584L, 36678);
          return;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneCardSync", "cmdList == null or size is 0");
          com.tencent.mm.plugin.card.a.b localb = al.ajB();
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BatchGetCardMgr", "retryAll, getNow = %b", new Object[] { Boolean.valueOf(true) });
          synchronized (localb.hur)
          {
            localb.kmr.addAll(localb.kms);
            localb.kms.clear();
            localb.aiX();
          }
        }
      }
      this.gMF.a(0, 0, paramString, this);
      GMTrace.o(4922837827584L, 36678);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4922569392128L, 36676);
    GMTrace.o(4922569392128L, 36676);
    return 558;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */