package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.game.c.an;
import com.tencent.mm.plugin.game.c.ao;
import com.tencent.mm.plugin.game.c.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class ar
  extends com.tencent.mm.ac.k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  public final b lnP;
  
  public ar(String paramString, LinkedList<String> paramLinkedList, q paramq1, q paramq2, q paramq3, boolean paramBoolean)
  {
    GMTrace.i(12609889763328L, 93951);
    w.i("MicroMsg.NetSceneGetGameIndex2", "lang = " + paramString + ", installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext()) {
      w.i("MicroMsg.NetSceneGetGameIndex2", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    }
    localObject = new b.a();
    ((b.a)localObject).hlX = new an();
    ((b.a)localObject).hlY = new ao();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgameindex2";
    ((b.a)localObject).hlW = 1238;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (an)this.lnP.hlU.hmc;
    ((an)localObject).mEm = paramString;
    ((an)localObject).mEI = paramLinkedList;
    paramLinkedList = e.cz(ab.getContext());
    paramString = paramLinkedList;
    if (bg.mZ(paramLinkedList)) {
      paramString = bg.bOa();
    }
    if (!bg.mZ(k.countryCode)) {
      paramString = k.countryCode;
    }
    ((an)localObject).huS = paramString;
    if (paramq1 != null) {}
    for (;;)
    {
      ((an)localObject).mEJ = new m();
      if (paramq1 != null)
      {
        ((an)localObject).mEJ.mDC = paramq1.mAq.mBf;
        ((an)localObject).mEJ.mDD = paramq1.field_appId;
        ((an)localObject).mEJ.mCG = paramq1.mAY;
        if (paramq1.field_msgType == 100) {
          ((an)localObject).mEJ.mDF = paramq1.mAX;
        }
      }
      else
      {
        label303:
        if (paramq2 != null)
        {
          paramLinkedList = ((an)localObject).mEJ;
          paramLinkedList.mDE |= 0x1;
        }
        if (paramq3 != null)
        {
          paramLinkedList = ((an)localObject).mEJ;
          paramLinkedList.mDE |= 0x2;
        }
        ((an)localObject).mEK = SubCoreGameCenter.aFe().aEB();
        ((an)localObject).mEL = paramBoolean;
        if (!bg.bOi()) {
          break label440;
        }
      }
      label440:
      for (int i = 1;; i = 0)
      {
        ((an)localObject).mEn = i;
        w.i("MicroMsg.NetSceneGetGameIndex2", "Country Code: %s", new Object[] { paramString });
        GMTrace.o(12609889763328L, 93951);
        return;
        if (paramq2 != null)
        {
          paramq1 = paramq2;
          break;
        }
        if (paramq3 == null) {
          break label446;
        }
        paramq1 = paramq3;
        break;
        ((an)localObject).mEJ.mDF = paramq1.field_msgType;
        break label303;
      }
      label446:
      paramq1 = null;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(12610023981056L, 93952);
    this.gMF = parame1;
    int i = a(parame, this.lnP, this);
    GMTrace.o(12610023981056L, 93952);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12610158198784L, 93953);
    w.i("MicroMsg.NetSceneGetGameIndex2", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12610158198784L, 93953);
  }
  
  public final int getType()
  {
    GMTrace.i(15645492117504L, 116568);
    GMTrace.o(15645492117504L, 116568);
    return 1238;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */