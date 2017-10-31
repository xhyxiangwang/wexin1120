package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.protocal.c.bee;
import com.tencent.mm.protocal.c.bef;
import com.tencent.mm.protocal.c.beg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class u
  extends com.tencent.mm.ac.k
  implements j
{
  private int fAy;
  private String fwU;
  private b gMC;
  public com.tencent.mm.ac.e gMF;
  public LinkedList<bee> qbV;
  public int qbW;
  
  public u(int paramInt)
  {
    GMTrace.i(18585531449344L, 138473);
    this.qbV = null;
    this.fAy = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new bef();
    ((b.a)localObject).hlY = new beg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstaglist";
    ((b.a)localObject).hlW = 292;
    ((b.a)localObject).hlZ = 116;
    ((b.a)localObject).hma = 1000000116;
    this.gMC = ((b.a)localObject).DA();
    localObject = ae.bhs().HE("@__weixintsnstag").field_md5;
    if (localObject == null) {
      localObject = "";
    }
    for (;;)
    {
      this.fwU = ((String)localObject);
      bef localbef = (bef)this.gMC.hlU.hmc;
      localbef.tsp = paramInt;
      localbef.uwm = ((String)localObject);
      GMTrace.o(18585531449344L, 138473);
      return;
    }
  }
  
  public static s a(s params, bee parambee)
  {
    GMTrace.i(8071451508736L, 60137);
    params.field_tagId = parambee.uwl;
    params.field_tagName = bg.ap(parambee.mFu, "");
    params.field_count = parambee.jWQ;
    params.bv(parambee.jWR);
    w.d("MicroMsg.NetSceneSnsTagList", "tagInfo getList: " + parambee.toString());
    GMTrace.o(8071451508736L, 60137);
    return params;
  }
  
  private static boolean a(List<Long> paramList, Long paramLong)
  {
    GMTrace.i(8071585726464L, 60138);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((Long)paramList.next()).longValue() == paramLong.longValue())
      {
        GMTrace.o(8071585726464L, 60138);
        return true;
      }
    }
    GMTrace.o(8071585726464L, 60138);
    return false;
  }
  
  private static boolean b(s params, bee parambee)
  {
    boolean bool2 = false;
    GMTrace.i(8071988379648L, 60141);
    params = params.field_memberList.split(",");
    parambee = parambee.jWR.iterator();
    label89:
    label96:
    label99:
    for (;;)
    {
      boolean bool1 = bool2;
      if (parambee.hasNext())
      {
        axt localaxt = (axt)parambee.next();
        i = 0;
        if (i >= params.length) {
          break label96;
        }
        if (!params[i].equals(localaxt)) {
          break label89;
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label99;
        }
        bool1 = true;
        GMTrace.o(8071988379648L, 60141);
        return bool1;
        i += 1;
        break;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8071183073280L, 60135);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(8071183073280L, 60135);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8071854161920L, 60140);
    w.d("MicroMsg.NetSceneSnsTagList", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8071854161920L, 60140);
      return;
    }
    Object localObject1 = (beg)((b)paramp).hlV.hmc;
    w.d("MicroMsg.NetSceneSnsTagList", "[onGYNetEnd]State：%s", new Object[] { Integer.valueOf(this.qbW) });
    this.qbW = ((beg)localObject1).qbW;
    this.qbV = ((beg)localObject1).jWR;
    paramp = ((beg)localObject1).uwm;
    if (this.fwU.equals(paramp))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8071854161920L, 60140);
      return;
    }
    paramArrayOfByte = ae.bhu().bkI();
    Object localObject2;
    if (this.fAy != 3) {
      localObject2 = paramArrayOfByte.iterator();
    }
    label519:
    for (;;)
    {
      Object localObject3;
      if (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Long)((Iterator)localObject2).next();
        Iterator localIterator = ((beg)localObject1).jWR.iterator();
        bee localbee;
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localbee = (bee)localIterator.next();
        } while (((Long)localObject3).longValue() != localbee.uwl);
      }
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        if (paramInt1 != 0) {
          break label519;
        }
        ((Iterator)localObject2).remove();
        ae.bhu().dS(((Long)localObject3).longValue());
        break;
        localObject1 = ((beg)localObject1).jWR.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (bee)((Iterator)localObject1).next();
          if (!a(paramArrayOfByte, Long.valueOf(((bee)localObject2).uwl)))
          {
            localObject3 = new s();
            a((s)localObject3, (bee)localObject2);
            ae.bhu().a((s)localObject3);
          }
          else
          {
            localObject3 = ae.bhu().dR(((bee)localObject2).uwl);
            if (((((s)localObject3).field_tagName != null) && (!((s)localObject3).field_tagName.equals(((bee)localObject2).mFu))) || (((s)localObject3).field_count != ((bee)localObject2).jWQ) || (b((s)localObject3, (bee)localObject2)))
            {
              a((s)localObject3, (bee)localObject2);
              ae.bhu().a((s)localObject3);
            }
          }
        }
        paramArrayOfByte = ae.bhs().HE("@__weixintsnstag");
        paramArrayOfByte.field_md5 = paramp;
        ae.bhs().a(paramArrayOfByte);
        this.gMF.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(8071854161920L, 60140);
        return;
      }
    }
  }
  
  public final List<String> dz(long paramLong)
  {
    GMTrace.i(8071719944192L, 60139);
    LinkedList localLinkedList = new LinkedList();
    if (this.qbV == null)
    {
      GMTrace.o(8071719944192L, 60139);
      return localLinkedList;
    }
    Iterator localIterator = this.qbV.iterator();
    while (localIterator.hasNext())
    {
      bee localbee = (bee)localIterator.next();
      if (localbee.uwl == paramLong)
      {
        localIterator = localbee.jWR.iterator();
        while (localIterator.hasNext()) {
          localLinkedList.add(((axt)localIterator.next()).usj);
        }
        GMTrace.o(8071719944192L, 60139);
        return localLinkedList;
      }
    }
    GMTrace.o(8071719944192L, 60139);
    return localLinkedList;
  }
  
  public final int getType()
  {
    GMTrace.i(8071317291008L, 60136);
    GMTrace.o(8071317291008L, 60136);
    return 292;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */