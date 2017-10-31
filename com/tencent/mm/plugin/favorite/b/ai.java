package com.tencent.mm.plugin.favorite.b;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.bbv;
import com.tencent.mm.protocal.c.bbw;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class ai
  extends k
  implements j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private List<Integer> lQe;
  private a lQf;
  private SparseArray<String> lQg;
  private int scene;
  private String toUser;
  
  public ai(String paramString, List<Integer> paramList, a parama)
  {
    GMTrace.i(6305011990528L, 46976);
    this.gMF = null;
    this.lQf = null;
    this.lQg = new SparseArray();
    b.a locala = new b.a();
    locala.hlX = new bbv();
    locala.hlY = new bbw();
    locala.uri = "/cgi-bin/micromsg-bin/sharefav";
    locala.hlW = 608;
    locala.hlZ = 246;
    locala.hma = 1000000246;
    this.gMC = locala.DA();
    this.toUser = paramString;
    this.scene = 2;
    this.lQe = paramList;
    this.lQf = parama;
    GMTrace.o(6305011990528L, 46976);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6305414643712L, 46979);
    bbv localbbv = (bbv)this.gMC.hlU.hmc;
    localbbv.uua = this.toUser;
    localbbv.ttY = this.scene;
    localbbv.tyV = new LinkedList(this.lQe);
    localbbv.jWQ = localbbv.tyV.size();
    w.d("MicroMsg.NetSceneShareFavItem", "do scene %s %d %s %d", new Object[] { localbbv.uua, Integer.valueOf(localbbv.ttY), localbbv.tyV, Integer.valueOf(localbbv.jWQ) });
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6305414643712L, 46979);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6305146208256L, 46977);
    w.d("MicroMsg.NetSceneShareFavItem", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.lQg.clear();
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (bbw)((b)paramp).hlV.hmc;
      if (paramp.tYT != this.lQe.size()) {
        w.w("MicroMsg.NetSceneShareFavItem", "get url error, request count %d, response count %d", new Object[] { Integer.valueOf(this.lQe.size()), Integer.valueOf(paramp.tYT) });
      }
      paramInt1 = 0;
      while ((paramInt1 < paramp.uub.size()) && (paramInt1 < this.lQe.size()))
      {
        w.d("MicroMsg.NetSceneShareFavItem", "id[%d] url=%s", new Object[] { this.lQe.get(paramInt1), paramp.uub.get(paramInt1) });
        this.lQg.put(((Integer)this.lQe.get(paramInt1)).intValue(), ((axt)paramp.uub.get(paramInt1)).usj);
        paramInt1 += 1;
      }
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    if (this.lQf != null) {
      this.lQf.a(this.lQg);
    }
    GMTrace.o(6305146208256L, 46977);
  }
  
  public final int getType()
  {
    GMTrace.i(6305280425984L, 46978);
    GMTrace.o(6305280425984L, 46978);
    return 608;
  }
  
  public static abstract interface a
  {
    public abstract void a(SparseArray<String> paramSparseArray);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */