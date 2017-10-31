package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.k.b;
import com.tencent.mm.g.a.qn;
import com.tencent.mm.g.b.af;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.protocal.c.fb;
import com.tencent.mm.protocal.c.fc;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class b
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  private Set<String> oEc;
  
  public b(Set<String> paramSet)
  {
    GMTrace.i(8941048168448L, 66616);
    Assert.assertTrue(true);
    this.oEc = paramSet;
    GMTrace.o(8941048168448L, 66616);
  }
  
  private boolean g(p paramp)
  {
    GMTrace.i(8941853474816L, 66622);
    Object localObject1 = (fc)((com.tencent.mm.ac.b)paramp).hlV.hmc;
    if (localObject1 == null)
    {
      w.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp: resp is null");
      GMTrace.o(8941853474816L, 66622);
      return false;
    }
    if (paramp.Ba().tpN == 1)
    {
      w.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp : endless loop, should stop");
      GMTrace.o(8941853474816L, 66622);
      return false;
    }
    if (paramp.Ba().tpN == -1)
    {
      w.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp : server err, can try again");
      GMTrace.o(8941853474816L, 66622);
      return true;
    }
    localObject1 = ((fc)localObject1).tzd;
    if (localObject1 == null)
    {
      GMTrace.o(8941853474816L, 66622);
      return false;
    }
    int j = 0;
    while (j < ((List)localObject1).size()) {
      try
      {
        paramp = (nk)new nk().aC(n.a((axs)((List)localObject1).get(j)));
        if ((paramp == null) || (paramp.jWW == null))
        {
          w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: profile name is null");
          i = 0;
          if (i != 0) {
            break label657;
          }
          GMTrace.o(8941853474816L, 66622);
          return false;
        }
      }
      catch (IOException paramp)
      {
        for (;;)
        {
          int i;
          w.printErrStackTrace("MicroMsg.NetSceneBatchGetContactProfile", paramp, "", new Object[0]);
          w.e("MicroMsg.NetSceneBatchGetContactProfile", "ContactProfile.parseFrom fail");
          paramp = null;
          continue;
          if (!this.oEc.contains(paramp.jWW))
          {
            w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: resp data not in req");
            i = 0;
          }
          else
          {
            this.oEc.remove(paramp.jWW);
            ap.AS();
            Object localObject2 = c.yL().SL(paramp.jWW);
            if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).gLS == 0))
            {
              w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: did not find this contact");
              i = 0;
            }
            else
            {
              ((x)localObject2).setUsername(paramp.jWW);
              ((x)localObject2).cd(paramp.huO);
              ((x)localObject2).setType(paramp.tJM & paramp.tJN);
              ((x)localObject2).cg(paramp.jYc);
              ((x)localObject2).ch(paramp.tJK);
              ((x)localObject2).ci(paramp.tJL);
              ((x)localObject2).jdMethod_do(paramp.huJ);
              ((x)localObject2).ce(paramp.tJO);
              ((x)localObject2).ck(paramp.tJR);
              ((x)localObject2).cl(paramp.tJQ);
              ((x)localObject2).dr(paramp.tJS);
              ((x)localObject2).cf(paramp.tJV);
              ((x)localObject2).ds(paramp.tJW);
              ap.AS();
              if (c.yL().a(((af)localObject2).field_username, (x)localObject2) == -1) {
                w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile:update contact failed");
              }
              if (x.Sx(paramp.jWW))
              {
                localObject2 = g.aWG().Eb(paramp.jWW);
                if ((localObject2 == null) || (bg.mY(((d)localObject2).getUsername()).length() <= 0))
                {
                  w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: did not find qcontact");
                  i = 0;
                  continue;
                }
                ((d)localObject2).extInfo = paramp.mGM;
                ((d)localObject2).oEf = paramp.tJY;
                ((d)localObject2).oEg = paramp.tJZ;
                ((d)localObject2).fJg = 52;
                if (!g.aWG().a(paramp.jWW, (d)localObject2)) {
                  w.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile:update qcontact failed");
                }
              }
              if (x.Sv(paramp.jWW))
              {
                localObject2 = new qn();
                ((qn)localObject2).fOy.opType = 0;
                ((qn)localObject2).fOy.fJp = paramp.jWW;
                ((qn)localObject2).fOy.fJq = paramp.tJY;
                ((qn)localObject2).fOy.fJr = paramp.tJP;
                com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
              }
              i = 1;
            }
          }
        }
        label657:
        j += 1;
      }
    }
    GMTrace.o(8941853474816L, 66622);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(8941182386176L, 66617);
    this.gMF = parame1;
    parame1 = new LinkedList();
    Object localObject = this.oEc.iterator();
    while (((Iterator)localObject).hasNext()) {
      parame1.add((String)((Iterator)localObject).next());
    }
    if (parame1.size() == 0)
    {
      w.e("MicroMsg.NetSceneBatchGetContactProfile", com.tencent.mm.compatible.util.g.tH() + "doScene reqSize ==0");
      GMTrace.o(8941182386176L, 66617);
      return -1;
    }
    localObject = new b.a();
    ((b.a)localObject).hlX = new fb();
    ((b.a)localObject).hlY = new fc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchgetcontactprofile";
    ((b.a)localObject).hlW = 140;
    ((b.a)localObject).hlZ = 28;
    ((b.a)localObject).hma = 1000000028;
    localObject = ((b.a)localObject).DA();
    LinkedList localLinkedList = new LinkedList();
    parame1 = parame1.iterator();
    while (parame1.hasNext()) {
      localLinkedList.add(n.mV((String)parame1.next()));
    }
    ((fb)((com.tencent.mm.ac.b)localObject).hlU.hmc).tzc = localLinkedList;
    ((fb)((com.tencent.mm.ac.b)localObject).hlU.hmc).tzb = 1;
    ((fb)((com.tencent.mm.ac.b)localObject).hlU.hmc).jWQ = localLinkedList.size();
    int i = a(parame, (p)localObject, this);
    GMTrace.o(8941182386176L, 66617);
    return i;
  }
  
  protected final int a(p paramp)
  {
    GMTrace.i(8941316603904L, 66618);
    int i = k.b.hmE;
    GMTrace.o(8941316603904L, 66618);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(8941719257088L, 66621);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(8941719257088L, 66621);
      return;
    }
    if ((g(paramp)) && (this.oEc.size() > 0)) {
      a(this.hmo, this.gMF);
    }
    w.d("MicroMsg.NetSceneBatchGetContactProfile", "left cnt = " + this.oEc.size());
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(8941719257088L, 66621);
  }
  
  public final int getType()
  {
    GMTrace.i(8941450821632L, 66619);
    GMTrace.o(8941450821632L, 66619);
    return 140;
  }
  
  protected final int vG()
  {
    GMTrace.i(8941585039360L, 66620);
    GMTrace.o(8941585039360L, 66620);
    return 50;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */