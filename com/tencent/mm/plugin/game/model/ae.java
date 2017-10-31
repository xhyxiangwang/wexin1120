package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.game.c.ac;
import com.tencent.mm.plugin.game.c.ad;
import com.tencent.mm.plugin.game.c.ao;
import com.tencent.mm.plugin.game.c.bi;
import com.tencent.mm.plugin.game.c.bj;
import com.tencent.mm.plugin.game.c.bk;
import com.tencent.mm.plugin.game.c.bn;
import com.tencent.mm.plugin.game.c.br;
import com.tencent.mm.plugin.game.c.h;
import com.tencent.mm.plugin.game.c.s;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.x.ap;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class ae
  extends aa
{
  public ao mBH;
  private boolean mBI;
  public LinkedList<c> mBJ;
  public HashMap<String, Integer> mBK;
  public a mBL;
  
  public ae(a parama)
  {
    GMTrace.i(12608144932864L, 93938);
    this.mBK = new HashMap();
    if (parama == null)
    {
      this.mBH = new ao();
      GMTrace.o(12608144932864L, 93938);
      return;
    }
    this.mBH = ((ao)parama);
    this.mBI = true;
    PU();
    GMTrace.o(12608144932864L, 93938);
  }
  
  public ae(byte[] paramArrayOfByte)
  {
    GMTrace.i(12608279150592L, 93939);
    this.mBK = new HashMap();
    this.mBH = new ao();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(12608279150592L, 93939);
      return;
    }
    try
    {
      this.mBH.aC(paramArrayOfByte);
      this.mBI = false;
      PU();
      GMTrace.o(12608279150592L, 93939);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GamePBDataIndex", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }
  
  private void PU()
  {
    GMTrace.i(12608413368320L, 93940);
    LinkedList localLinkedList = new LinkedList();
    if ((this.mBH.mEO == null) || (this.mBH.mEO.mDk == null)) {}
    for (;;)
    {
      this.mBJ = localLinkedList;
      this.mBL = aEP();
      if (!this.mBI) {
        break label620;
      }
      d.V(this.mBJ);
      if ((this.mBL == null) || (bg.bX(this.mBL.mBM))) {
        break label607;
      }
      localLinkedList = new LinkedList();
      Iterator localIterator = this.mBL.mBM.iterator();
      while (localIterator.hasNext()) {
        localLinkedList.add(((ae.a.a)localIterator.next()).mBO);
      }
      localIterator = this.mBH.mEO.mDk.iterator();
      int i = 1;
      while (localIterator.hasNext())
      {
        Object localObject = (ac)localIterator.next();
        if (((ac)localObject).mCC != null)
        {
          c localc = a(((ac)localObject).mCC);
          if (localc != null)
          {
            ad localad;
            StringBuilder localStringBuilder;
            int j;
            if (((ac)localObject).mCC.mCW != null) {
              if ((((ac)localObject).mCC.mCW.mCJ != null) && (((ac)localObject).mCC.mCW.mFN != null))
              {
                localc.mzl = ((ac)localObject).mCC.mCW.mCJ;
                localc.mzm = ((ac)localObject).mCC.mCW.mFN;
                localc.mzp = ai.J(((ac)localObject).mDh, "label", localc.mzl);
                if (((ac)localObject).mEd == null) {
                  break label565;
                }
                localObject = ((ac)localObject).mEd.iterator();
                do
                {
                  if (!((Iterator)localObject).hasNext()) {
                    break;
                  }
                  localad = (ad)((Iterator)localObject).next();
                } while (localad == null);
                if ((localad.mEe == null) || (localad.mEe.size() == 0)) {
                  break label550;
                }
                localStringBuilder = new StringBuilder();
                j = 0;
                label365:
                if (j >= localad.mEe.size()) {
                  break label511;
                }
                ap.AS();
                com.tencent.mm.storage.x localx = com.tencent.mm.x.c.yL().SL((String)localad.mEe.get(j));
                if ((localx == null) || (localx.gLS == 0L)) {
                  break label490;
                }
                localStringBuilder.append(localx.vq());
              }
            }
            for (;;)
            {
              if (j < localad.mEe.size() - 1) {
                localStringBuilder.append("、");
              }
              j += 1;
              break label365;
              localc.mzp = ai.ze(((ac)localObject).mDh);
              break;
              localc.mzp = ai.ze(((ac)localObject).mDh);
              break;
              label490:
              localStringBuilder.append((String)localad.mEe.get(j));
            }
            label511:
            localStringBuilder.append(" ");
            localc.mzg.add(localStringBuilder.toString());
            for (;;)
            {
              localc.mzg.add(localad.mDI);
              break;
              label550:
              localc.mzg.add("");
            }
            label565:
            localc.scene = 10;
            localc.fKV = 1004;
            localc.position = i;
            localLinkedList.add(localc);
            i += 1;
          }
        }
      }
    }
    d.V(localLinkedList);
    label607:
    aER();
    SubCoreGameCenter.aFk().init(ab.getContext());
    label620:
    GMTrace.o(12608413368320L, 93940);
  }
  
  private a aEP()
  {
    GMTrace.i(12608816021504L, 93943);
    if ((this.mBH.mER == null) || (bg.bX(this.mBH.mER.mDk)))
    {
      GMTrace.o(12608816021504L, 93943);
      return null;
    }
    a locala = new a();
    Iterator localIterator = this.mBH.mER.mDk.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      s locals = (s)localIterator.next();
      c localc = a(locals.mCC);
      if (localc != null)
      {
        localc.mzn = locals.mCK;
        localc.scene = 10;
        localc.fKV = 1002;
        i += 1;
        localc.position = i;
        ae.a.a locala1 = new ae.a.a();
        locala1.mBO = localc;
        locala1.mBP = locals.mDJ;
        locala.mBM.add(locala1);
      }
    }
    locala.mBN = this.mBH.mER.mDP;
    GMTrace.o(12608816021504L, 93943);
    return locala;
  }
  
  private void aER()
  {
    GMTrace.i(12609084456960L, 93945);
    this.mBK = new HashMap();
    if ((this.mBH.mES == null) || (this.mBH.mES.mFJ == null))
    {
      GMTrace.o(12609084456960L, 93945);
      return;
    }
    Iterator localIterator = this.mBH.mES.mFJ.iterator();
    while (localIterator.hasNext())
    {
      bk localbk = (bk)localIterator.next();
      Object localObject = a(localbk.mCC);
      if (localObject != null)
      {
        this.mBK.put(((c)localObject).field_appId, Integer.valueOf(((c)localObject).versionCode));
        localObject = an.aUV().NF(((c)localObject).field_appId);
        if (localObject != null)
        {
          ((f)localObject).bU(localbk.mFL);
          if (!an.aUV().a((f)localObject, new String[0])) {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GamePBDataIndex", "Store rank info failed, AppID: %s", new Object[] { ((f)localObject).field_appId });
          }
        }
      }
    }
    GMTrace.o(12609084456960L, 93945);
  }
  
  public final com.tencent.mm.plugin.game.c.ae aEN()
  {
    GMTrace.i(12608547586048L, 93941);
    if (this.mBH != null)
    {
      com.tencent.mm.plugin.game.c.ae localae = this.mBH.mEN;
      GMTrace.o(12608547586048L, 93941);
      return localae;
    }
    GMTrace.o(12608547586048L, 93941);
    return null;
  }
  
  public final bi aEO()
  {
    GMTrace.i(12608681803776L, 93942);
    if (this.mBH != null)
    {
      bi localbi = this.mBH.mET;
      GMTrace.o(12608681803776L, 93942);
      return localbi;
    }
    GMTrace.o(12608681803776L, 93942);
    return null;
  }
  
  public final LinkedList<c> aEQ()
  {
    GMTrace.i(12608950239232L, 93944);
    LinkedList localLinkedList = new LinkedList();
    if ((this.mBH.mES == null) || (this.mBH.mES.mFJ == null))
    {
      GMTrace.o(12608950239232L, 93944);
      return localLinkedList;
    }
    Iterator localIterator = this.mBH.mES.mFJ.iterator();
    while (localIterator.hasNext())
    {
      bk localbk = (bk)localIterator.next();
      if (localbk != null)
      {
        c localc = a(localbk.mCC);
        if (localc != null)
        {
          localc.bU(localbk.mFL);
          localLinkedList.addFirst(localc);
        }
      }
    }
    GMTrace.o(12608950239232L, 93944);
    return localLinkedList;
  }
  
  public static final class a
  {
    public LinkedList<a> mBM;
    public br mBN;
    
    public a()
    {
      GMTrace.i(12614050512896L, 93982);
      this.mBM = new LinkedList();
      GMTrace.o(12614050512896L, 93982);
    }
    
    public static final class a
    {
      public c mBO;
      public LinkedList<com.tencent.mm.plugin.game.c.x> mBP;
      
      public a()
      {
        GMTrace.i(12627874938880L, 94085);
        GMTrace.o(12627874938880L, 94085);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */