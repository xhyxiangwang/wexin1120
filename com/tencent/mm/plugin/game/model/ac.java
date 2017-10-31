package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bl.a;
import com.tencent.mm.plugin.game.c.am;
import com.tencent.mm.plugin.game.c.av;
import com.tencent.mm.plugin.game.c.aw;
import com.tencent.mm.plugin.game.c.ax;
import com.tencent.mm.plugin.game.c.az;
import com.tencent.mm.plugin.game.c.ba;
import com.tencent.mm.plugin.game.c.bc;
import com.tencent.mm.plugin.game.c.bm;
import com.tencent.mm.plugin.game.c.bq;
import com.tencent.mm.plugin.game.c.bx;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.plugin.game.ui.GameMediaList.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ac
  extends aa
{
  public c mBA;
  public ad mBB;
  public am mBy;
  private boolean mBz;
  
  public ac(a parama)
  {
    GMTrace.i(12631767252992L, 94114);
    if (parama == null)
    {
      this.mBy = new am();
      GMTrace.o(12631767252992L, 94114);
      return;
    }
    this.mBy = ((am)parama);
    this.mBz = false;
    PU();
    GMTrace.o(12631767252992L, 94114);
  }
  
  public ac(byte[] paramArrayOfByte)
  {
    GMTrace.i(12631901470720L, 94115);
    this.mBy = new am();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(12631901470720L, 94115);
      return;
    }
    try
    {
      this.mBy.aC(paramArrayOfByte);
      this.mBz = true;
      PU();
      GMTrace.o(12631901470720L, 94115);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        w.e("MicroMsg.GamePBDataDetail", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }
  
  private void PU()
  {
    GMTrace.i(12632035688448L, 94116);
    Object localObject = a(this.mBy.mCC);
    if (localObject != null)
    {
      ((c)localObject).scene = 12;
      ((c)localObject).fKV = 1201;
    }
    this.mBA = ((c)localObject);
    if (this.mBz)
    {
      this.mBB = new ad(this.mBA.field_appId);
      if (!this.mBz)
      {
        d.a(this.mBA);
        SubCoreGameCenter.aFi().a(this.mBA.field_appId, this.mBy);
      }
      GMTrace.o(12632035688448L, 94116);
      return;
    }
    String str = this.mBA.field_appId;
    if (this.mBy.mED != null) {}
    for (localObject = this.mBy.mED.mGe;; localObject = null)
    {
      this.mBB = new ad(str, (List)localObject);
      break;
    }
  }
  
  public final String aED()
  {
    GMTrace.i(12632169906176L, 94117);
    String str;
    if (this.mBy.mEH != null)
    {
      str = this.mBy.mEH.title;
      GMTrace.o(12632169906176L, 94117);
      return str;
    }
    if (this.mBy.mEC != null)
    {
      str = this.mBy.mEC.fuw;
      GMTrace.o(12632169906176L, 94117);
      return str;
    }
    GMTrace.o(12632169906176L, 94117);
    return null;
  }
  
  public final LinkedList<b> aEE()
  {
    GMTrace.i(12632304123904L, 94118);
    LinkedList localLinkedList;
    Iterator localIterator;
    Object localObject;
    b localb;
    if ((this.mBy.mEH != null) && (this.mBy.mEH.kqU != null))
    {
      localLinkedList = new LinkedList();
      localIterator = this.mBy.mEH.kqU.iterator();
      while (localIterator.hasNext())
      {
        localObject = (bc)localIterator.next();
        localb = new b();
        localb.fJv = ((bc)localObject).fJv;
        localb.desc = ((bc)localObject).desc;
        localLinkedList.add(localb);
      }
      GMTrace.o(12632304123904L, 94118);
      return localLinkedList;
    }
    if ((this.mBy.mEC != null) && (this.mBy.mEC.mFn != null))
    {
      localLinkedList = new LinkedList();
      localIterator = this.mBy.mEC.mFn.iterator();
      while (localIterator.hasNext())
      {
        localObject = (ax)localIterator.next();
        localb = new b();
        localb.fJv = ((ax)localObject).mFq;
        localb.title = ((ax)localObject).fuw;
        localb.desc = ((ax)localObject).mDI;
        localb.url = ((ax)localObject).mCE;
        localLinkedList.add(localb);
      }
      GMTrace.o(12632304123904L, 94118);
      return localLinkedList;
    }
    GMTrace.o(12632304123904L, 94118);
    return null;
  }
  
  public final int aEF()
  {
    GMTrace.i(12632438341632L, 94119);
    if (this.mBy.mEH != null)
    {
      GMTrace.o(12632438341632L, 94119);
      return 2;
    }
    GMTrace.o(12632438341632L, 94119);
    return 1;
  }
  
  public final LinkedList<GameMediaList.a> aEG()
  {
    GMTrace.i(12632572559360L, 94120);
    LinkedList localLinkedList = new LinkedList();
    if ((this.mBy.mEA == null) || (this.mBy.mEA.mFM == null))
    {
      GMTrace.o(12632572559360L, 94120);
      return localLinkedList;
    }
    Iterator localIterator = this.mBy.mEA.mFM.iterator();
    while (localIterator.hasNext())
    {
      bq localbq = (bq)localIterator.next();
      GameMediaList.a locala = new GameMediaList.a();
      locala.type = localbq.mFT;
      locala.mNB = localbq.mFU;
      locala.url = localbq.mFV;
      localLinkedList.add(locala);
    }
    GMTrace.o(12632572559360L, 94120);
    return localLinkedList;
  }
  
  public final String aEH()
  {
    GMTrace.i(12632706777088L, 94121);
    if ((this.mBy.mEA == null) || (this.mBy.mEA.fuw == null))
    {
      GMTrace.o(12632706777088L, 94121);
      return null;
    }
    String str = this.mBy.mEA.fuw;
    GMTrace.o(12632706777088L, 94121);
    return str;
  }
  
  public final String aEI()
  {
    GMTrace.i(12632840994816L, 94122);
    if ((this.mBy.mEA == null) || (this.mBy.mEA.mDI == null))
    {
      GMTrace.o(12632840994816L, 94122);
      return null;
    }
    String str = this.mBy.mEA.mDI;
    GMTrace.o(12632840994816L, 94122);
    return str;
  }
  
  public final String aEJ()
  {
    GMTrace.i(12632975212544L, 94123);
    if (this.mBy.mEB == null)
    {
      GMTrace.o(12632975212544L, 94123);
      return null;
    }
    String str = this.mBy.mEB.fuw;
    GMTrace.o(12632975212544L, 94123);
    return str;
  }
  
  public final LinkedList<ba> aEK()
  {
    GMTrace.i(12633109430272L, 94124);
    if (this.mBy.mEB == null)
    {
      GMTrace.o(12633109430272L, 94124);
      return null;
    }
    LinkedList localLinkedList = this.mBy.mEB.mFt;
    GMTrace.o(12633109430272L, 94124);
    return localLinkedList;
  }
  
  public static final class a
  {
    public String desc;
    public String title;
    public String url;
    
    public a()
    {
      GMTrace.i(12627740721152L, 94084);
      GMTrace.o(12627740721152L, 94084);
    }
  }
  
  public static final class b
  {
    public String desc;
    public String fJv;
    public String title;
    public String url;
    
    public b()
    {
      GMTrace.i(12602642006016L, 93897);
      GMTrace.o(12602642006016L, 93897);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */