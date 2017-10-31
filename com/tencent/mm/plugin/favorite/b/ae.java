package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.ll;
import com.tencent.mm.protocal.c.lm;
import com.tencent.mm.protocal.c.ln;
import com.tencent.mm.protocal.c.sv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ae
  extends com.tencent.mm.ac.k
  implements com.tencent.mm.network.j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private List<String> idList;
  private LinkedList<sv> lPQ;
  
  public ae(List<String> paramList)
  {
    GMTrace.i(19313528406016L, 143897);
    this.gMF = null;
    this.idList = null;
    this.lPQ = new LinkedList();
    b.a locala = new b.a();
    locala.hlX = new ll();
    locala.hlY = new lm();
    locala.uri = "/cgi-bin/micromsg-bin/checkfavitem";
    locala.hlW = 405;
    locala.hlZ = 197;
    locala.hma = 1000000197;
    this.gMC = locala.DA();
    this.idList = paramList;
    w.i("MicroMsg.NetSceneCheckFavItem", "NetSceneCheckFavItem,ids is :\n %s", new Object[] { paramList.toString() });
    GMTrace.o(19313528406016L, 143897);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(19313662623744L, 143898);
    if ((this.idList == null) || (this.idList.isEmpty()))
    {
      w.e("MicroMsg.NetSceneCheckFavItem", "NetSceneCheckFavItem, doScene, idlist null,return");
      GMTrace.o(19313662623744L, 143898);
      return -1;
    }
    Iterator localIterator = this.idList.iterator();
    while (localIterator.hasNext())
    {
      i = Integer.parseInt((String)localIterator.next());
      if (i > 0)
      {
        j localj = h.awD().cd(i);
        sv localsv = new sv();
        localsv.tvd = i;
        if ((localj != null) && (!bg.mZ(localj.field_xml))) {
          localsv.tvk = localj.field_xml;
        }
        this.lPQ.add(localsv);
      }
    }
    ((ll)this.gMC.hlU.hmc).tHR = this.lPQ;
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(19313662623744L, 143898);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(19313931059200L, 143900);
    int i = k.b.hmE;
    GMTrace.o(19313931059200L, 143900);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(19313796841472L, 143899);
    w.i("MicroMsg.NetSceneCheckFavItem", "netId %d errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramp = (lm)((b)paramp).hlV.hmc;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.i("MicroMsg.NetSceneCheckFavItem", "NetSceneCheckFavItem,cgi return error,errcode:%d,errType:%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt2) });
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(19313796841472L, 143899);
      return;
    }
    paramp = paramp.tHS.iterator();
    while (paramp.hasNext())
    {
      paramArrayOfByte = (ln)paramp.next();
      w.i("MicroMsg.NetSceneCheckFavItem", "NetSceneCheckFavItem, onGYNetEnd,favid: %d, ret: %d", new Object[] { Integer.valueOf(paramArrayOfByte.tvd), Integer.valueOf(paramArrayOfByte.tyi) });
    }
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(19313796841472L, 143899);
  }
  
  public final int getType()
  {
    GMTrace.i(19314199494656L, 143902);
    GMTrace.o(19314199494656L, 143902);
    return 405;
  }
  
  protected final int vG()
  {
    GMTrace.i(19314065276928L, 143901);
    GMTrace.o(19314065276928L, 143901);
    return 10;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */