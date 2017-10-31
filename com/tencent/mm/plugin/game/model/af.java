package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.aq;
import com.tencent.mm.plugin.game.c.b;
import com.tencent.mm.plugin.game.c.bo;
import com.tencent.mm.plugin.game.c.bv;
import com.tencent.mm.plugin.game.c.bw;
import com.tencent.mm.plugin.game.c.cd;
import com.tencent.mm.plugin.game.c.j;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class af
  extends aa
{
  public aq mBQ;
  public LinkedList<c> mBR;
  public LinkedList<c> mBS;
  private int mBx;
  
  public af(com.tencent.mm.bl.a parama, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(12612305682432L, 93969);
    this.mBx = 0;
    if (parama == null)
    {
      this.mBQ = new aq();
      GMTrace.o(12612305682432L, 93969);
      return;
    }
    this.mBQ = ((aq)parama);
    this.mBx = paramInt;
    this.mBR = aES();
    this.mBS = aET();
    if (paramBoolean) {
      SubCoreGameCenter.aFi().a("pb_library", parama);
    }
    d.V(this.mBR);
    d.V(this.mBS);
    GMTrace.o(12612305682432L, 93969);
  }
  
  public af(byte[] paramArrayOfByte)
  {
    GMTrace.i(12612439900160L, 93970);
    this.mBx = 0;
    this.mBQ = new aq();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(12612439900160L, 93970);
      return;
    }
    try
    {
      this.mBQ.aC(paramArrayOfByte);
      this.mBR = aES();
      this.mBS = aET();
      d.V(this.mBR);
      d.V(this.mBS);
      GMTrace.o(12612439900160L, 93970);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        w.e("MicroMsg.GamePBDataLibrary", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }
  
  private LinkedList<c> aES()
  {
    GMTrace.i(12612574117888L, 93971);
    LinkedList localLinkedList = new LinkedList();
    if ((this.mBQ.mFe == null) || (this.mBQ.mFe.mFP == null) || (this.mBQ.mFe.mFP.mGc == null))
    {
      GMTrace.o(12612574117888L, 93971);
      return localLinkedList;
    }
    Iterator localIterator = this.mBQ.mFe.mFP.mGc.iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      bw localbw = (bw)localIterator.next();
      c localc = a(localbw.mCC);
      if (localc != null)
      {
        localc.mzi = localbw.mCC.mCR;
        localc.scene = 11;
        localc.fKV = 1110;
        localc.position = i;
        localLinkedList.add(localc);
        i += 1;
      }
    }
    GMTrace.o(12612574117888L, 93971);
    return localLinkedList;
  }
  
  private LinkedList<c> aET()
  {
    GMTrace.i(12612708335616L, 93972);
    LinkedList localLinkedList = new LinkedList();
    if (this.mBQ.mFf == null)
    {
      GMTrace.o(12612708335616L, 93972);
      return localLinkedList;
    }
    int i = this.mBx;
    int j = this.mBx / 15;
    Iterator localIterator = this.mBQ.mFf.iterator();
    i += 1;
    j += 901;
    b localb;
    label124:
    int k;
    Object localObject;
    if (localIterator.hasNext())
    {
      localb = (b)localIterator.next();
      switch (localb.jXP)
      {
      default: 
        k = j;
        localObject = null;
        j = i;
        i = k;
      }
    }
    for (;;)
    {
      if (localObject != null)
      {
        ((c)localObject).scene = 11;
        ((c)localObject).fKV = 1111;
        localLinkedList.add(localObject);
        k = j;
        j = i;
        i = k;
        break;
        localObject = a(localb.mCC);
        if (localObject == null) {
          break label306;
        }
        ((c)localObject).position = i;
        k = i + 1;
        i = j;
        j = k;
        continue;
        if (localb.mCF == null) {
          break label124;
        }
        localObject = a(localb.mCF.mCC);
        if (localObject == null) {
          break label297;
        }
        ((c)localObject).type = 1;
        ((c)localObject).mza = localb.mCF.mCE;
        ((c)localObject).mzb = localb.mCF.mCD;
        k = j + 1;
        ((c)localObject).position = j;
        j = i;
        i = k;
        continue;
        GMTrace.o(12612708335616L, 93972);
        return localLinkedList;
      }
      k = j;
      j = i;
      i = k;
      break;
      label297:
      k = i;
      i = j;
      j = k;
      continue;
      label306:
      k = i;
      i = j;
      j = k;
    }
  }
  
  public final HashMap<Integer, String> aEU()
  {
    GMTrace.i(12612842553344L, 93973);
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if ((this.mBQ.mFe == null) || (this.mBQ.mFe.mFS == null))
    {
      GMTrace.o(12612842553344L, 93973);
      return localLinkedHashMap;
    }
    Iterator localIterator = this.mBQ.mFe.mFS.iterator();
    while (localIterator.hasNext())
    {
      cd localcd = (cd)localIterator.next();
      localLinkedHashMap.put(Integer.valueOf(localcd.mFc), localcd.mCJ);
    }
    GMTrace.o(12612842553344L, 93973);
    return localLinkedHashMap;
  }
  
  public final LinkedList<GameLibraryCategoriesView.a> aEV()
  {
    GMTrace.i(12612976771072L, 93974);
    if ((this.mBQ.mFe == null) || (this.mBQ.mFe.mFQ == null))
    {
      GMTrace.o(12612976771072L, 93974);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.mBQ.mFe.mFQ.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      GameLibraryCategoriesView.a locala = new GameLibraryCategoriesView.a();
      locala.mMJ = localj.mDp;
      locala.mMK = localj.mCJ;
      locala.mML = localj.mCE;
      locala.jpi = localj.mCI;
      i += 1;
      locala.position = i;
      localLinkedList.add(locala);
    }
    GMTrace.o(12612976771072L, 93974);
    return localLinkedList;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */