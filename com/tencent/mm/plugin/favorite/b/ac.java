package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.fd;
import com.tencent.mm.protocal.c.fe;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sx;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ac
  extends com.tencent.mm.ac.k
  implements com.tencent.mm.network.j
{
  private static AtomicInteger lPK;
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  private LinkedList<Integer> lPG;
  private int lPH;
  private boolean lPI;
  private boolean lPJ;
  
  static
  {
    GMTrace.i(6310917570560L, 47020);
    lPK = new AtomicInteger(0);
    GMTrace.o(6310917570560L, 47020);
  }
  
  public ac(LinkedList<Integer> paramLinkedList)
  {
    GMTrace.i(6309575393280L, 47010);
    this.gMF = null;
    this.lPI = false;
    this.lPJ = false;
    this.lPH = 0;
    b.a locala = new b.a();
    locala.hlX = new fd();
    locala.hlY = new fe();
    locala.uri = "/cgi-bin/micromsg-bin/batchgetfavitem";
    locala.hlW = 402;
    locala.hlZ = 0;
    locala.hma = 0;
    this.gMC = locala.DA();
    this.lPG = paramLinkedList;
    lPK.incrementAndGet();
    GMTrace.o(6309575393280L, 47010);
  }
  
  private boolean axp()
  {
    GMTrace.i(6310246481920L, 47015);
    ap.AS();
    boolean bool1;
    if (bg.e((Integer)com.tencent.mm.x.c.xi().get(8217, null)) == 0)
    {
      bool1 = true;
      if ((this.lPG == null) || (this.lPH >= this.lPG.size())) {
        break label104;
      }
    }
    label104:
    for (boolean bool2 = true;; bool2 = false)
    {
      w.i("MicroMsg.NetSceneBatchgetFav", "check needContinue, notInit %B indexOK %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) || (!bool2)) {
        break label109;
      }
      GMTrace.o(6310246481920L, 47015);
      return true;
      bool1 = false;
      break;
    }
    label109:
    GMTrace.o(6310246481920L, 47015);
    return false;
  }
  
  public static void axq()
  {
    GMTrace.i(6309709611008L, 47011);
    lPK.set(0);
    GMTrace.o(6309709611008L, 47011);
  }
  
  public static void axr()
  {
    GMTrace.i(6309843828736L, 47012);
    lPK.decrementAndGet();
    GMTrace.o(6309843828736L, 47012);
  }
  
  public static int axs()
  {
    GMTrace.i(6309978046464L, 47013);
    int i = lPK.get();
    GMTrace.o(6309978046464L, 47013);
    return i;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6310112264192L, 47014);
    w.i("MicroMsg.NetSceneBatchgetFav", "ashutest::doscene count:%d", new Object[] { Integer.valueOf(lPK.get()) });
    if ((this.lPG == null) || (this.lPG.isEmpty()) || (this.lPH >= this.lPG.size()))
    {
      w.e("MicroMsg.NetSceneBatchgetFav", "klem doScene, idlist null, begIndex %d", new Object[] { Integer.valueOf(this.lPH) });
      GMTrace.o(6310112264192L, 47014);
      return -1;
    }
    w.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene size %d, begIndex %d, total %s", new Object[] { Integer.valueOf(this.lPG.size()), Integer.valueOf(this.lPH), this.lPG });
    ap.AS();
    if (bg.e((Integer)com.tencent.mm.x.c.xi().get(8217, null)) == 0)
    {
      w.w("MicroMsg.NetSceneBatchgetFav", "klem doScene, init not done, do not batchget");
      GMTrace.o(6310112264192L, 47014);
      return -1;
    }
    fd localfd = (fd)this.gMC.hlU.hmc;
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.lPG.subList(this.lPH, Math.min(this.lPH + 15, this.lPG.size())));
    localfd.tyV = localLinkedList;
    localfd.jWQ = localLinkedList.size();
    this.lPH += 15;
    w.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene checkd size %d, %s", new Object[] { Integer.valueOf(localLinkedList.size()), localLinkedList });
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6310112264192L, 47014);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(6310514917376L, 47017);
    int i = k.b.hmE;
    GMTrace.o(6310514917376L, 47017);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6310380699648L, 47016);
    w.i("MicroMsg.NetSceneBatchgetFav", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.lPH), Integer.valueOf(this.lPG.size()), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (axp())
      {
        a(this.hmo, this.gMF);
        GMTrace.o(6310380699648L, 47016);
        return;
      }
      lPK.decrementAndGet();
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6310380699648L, 47016);
      return;
    }
    paramp = (fe)((b)paramp).hlV.hmc;
    int i = paramp.jWQ;
    int j = paramp.tze.size();
    if (i != j)
    {
      if (this.lPH > this.lPG.size()) {}
      for (paramInt1 = this.lPG.size() % 15;; paramInt1 = 15)
      {
        w.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet resp list size:%d, return count %d, request count %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt1) });
        if (!axp()) {
          break;
        }
        a(this.hmo, this.gMF);
        GMTrace.o(6310380699648L, 47016);
        return;
      }
      lPK.decrementAndGet();
      this.gMF.a(paramInt2, -1, paramString, this);
      GMTrace.o(6310380699648L, 47016);
      return;
    }
    paramInt1 = 0;
    while (paramInt1 < j)
    {
      paramArrayOfByte = (sx)paramp.tze.get(paramInt1);
      w.i("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d, status:%d", new Object[] { Integer.valueOf(paramArrayOfByte.tvd), Integer.valueOf(paramArrayOfByte.jXo) });
      j localj;
      if (paramArrayOfByte.jXo == 0)
      {
        localj = h.awD().cd(paramArrayOfByte.tvd);
        if (localj == null)
        {
          w.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d not exist!", new Object[] { Integer.valueOf(paramArrayOfByte.tvd) });
          paramInt1 += 1;
          continue;
        }
        localj.field_xml = paramArrayOfByte.tvk;
        localj.xa(paramArrayOfByte.tvk);
        localj.field_flag = paramArrayOfByte.tve;
        localj.field_localSeq = paramArrayOfByte.tvg;
        localj.field_updateTime = (paramArrayOfByte.tvf * 1000L + paramInt1);
        i = localj.field_favProto.tQC.size();
        if (i != 0) {
          break label650;
        }
        w.v("MicroMsg.NetSceneBatchgetFav", "this item has no data, favId:%d", new Object[] { Integer.valueOf(localj.field_id) });
        w.i("MicroMsg.NetSceneBatchgetFav", "data dealed needUpload:%b  needDownload:%b", new Object[] { Boolean.valueOf(this.lPJ), Boolean.valueOf(this.lPI) });
        if (!this.lPJ) {
          break label1071;
        }
        localj.field_itemStatus = 15;
        h.awD().a(localj, new String[] { "localId" });
        h.awx().run();
      }
      for (;;)
      {
        x.r(localj);
        localj.xb("MicroMsg.NetSceneBatchgetFav");
        if ((paramArrayOfByte.tve & 0x1) == 0) {
          break;
        }
        w.d("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favId: %d status not exist, delete local item", new Object[] { Integer.valueOf(paramArrayOfByte.tvd) });
        x.a(h.awD().cd(paramArrayOfByte.tvd), null);
        break;
        label650:
        LinkedList localLinkedList = localj.field_favProto.tQC;
        i -= 1;
        label666:
        sp localsp;
        if (i >= 0)
        {
          localsp = (sp)localLinkedList.get(i);
          if (!bg.mZ(localsp.tOO))
          {
            File localFile = new File(x.g(localsp));
            w.i("MicroMsg.NetSceneBatchgetFav", "dataFIle: %s", new Object[] { localFile.getName() });
            if (localFile.exists()) {
              break label914;
            }
            if ((!bg.mZ(localsp.tOz)) && (!bg.mZ(localsp.tOx))) {
              break label866;
            }
            w.e("MicroMsg.NetSceneBatchgetFav", "data key or url null. favId:%d", new Object[] { Integer.valueOf(localj.field_id) });
          }
          label783:
          if (!bg.mZ(localsp.tOZ))
          {
            if (new File(x.h(localsp)).exists()) {
              break label1037;
            }
            if ((!bg.mZ(localsp.tOt)) && (!bg.mZ(localsp.haX))) {
              break label990;
            }
            w.w("MicroMsg.NetSceneBatchgetFav", "thumb key or url null. favId:%d", new Object[] { Integer.valueOf(localj.field_id) });
          }
        }
        for (;;)
        {
          i -= 1;
          break label666;
          break;
          label866:
          w.d("MicroMsg.NetSceneBatchgetFav", "local data not exist, insert cdninfo, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localj.field_id), Integer.valueOf(i) });
          x.a(localsp, localj, 1, false);
          this.lPI = true;
          break label783;
          label914:
          if (localsp.tPn != 0)
          {
            w.v("MicroMsg.NetSceneBatchgetFav", "server upload data failed, client upload, md5%s", new Object[] { localsp.tOO });
            this.lPJ = true;
            x.a(localsp, localj, 0, false);
          }
          w.d("MicroMsg.NetSceneBatchgetFav", "data exist, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localj.field_id), Integer.valueOf(i) });
          break label783;
          label990:
          w.d("MicroMsg.NetSceneBatchgetFav", "local thumb not exist, insert cdninfo, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localj.field_id), Integer.valueOf(i) });
          x.a(localsp, localj, 1);
          this.lPI = true;
          continue;
          label1037:
          w.d("MicroMsg.NetSceneBatchgetFav", "thumb exist, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localj.field_id), Integer.valueOf(i) });
        }
        label1071:
        if (this.lPI)
        {
          localj.field_itemStatus = 10;
          h.awD().a(localj, new String[] { "localId" });
        }
        else
        {
          localj.field_itemStatus = 10;
          h.awD().a(localj, new String[] { "localId" });
        }
      }
    }
    h.awx().run();
    if (axp())
    {
      a(this.hmo, this.gMF);
      GMTrace.o(6310380699648L, 47016);
      return;
    }
    lPK.decrementAndGet();
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(6310380699648L, 47016);
  }
  
  public final int getType()
  {
    GMTrace.i(6310783352832L, 47019);
    GMTrace.o(6310783352832L, 47019);
    return 402;
  }
  
  protected final int vG()
  {
    GMTrace.i(6310649135104L, 47018);
    GMTrace.o(6310649135104L, 47018);
    return 10;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */