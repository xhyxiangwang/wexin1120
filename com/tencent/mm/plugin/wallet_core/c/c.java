package com.tencent.mm.plugin.wallet_core.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends i<Bankcard>
{
  public static final String[] gMz;
  public e gMB;
  private List<Object> hxh;
  
  static
  {
    GMTrace.i(6912212992000L, 51500);
    gMz = new String[] { i.a(Bankcard.gLR, "WalletBankcard") };
    GMTrace.o(6912212992000L, 51500);
  }
  
  public c(e parame)
  {
    super(parame, Bankcard.gLR, "WalletBankcard", null);
    GMTrace.i(6911139250176L, 51492);
    this.hxh = new LinkedList();
    this.gMB = parame;
    GMTrace.o(6911139250176L, 51492);
  }
  
  public final boolean bI(List<Bankcard> paramList)
  {
    GMTrace.i(6911541903360L, 51495);
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      super.b((Bankcard)paramList.next());
    }
    paramList = this.hxh.iterator();
    while (paramList.hasNext()) {
      paramList.next();
    }
    GMTrace.o(6911541903360L, 51495);
    return true;
  }
  
  public final ArrayList<Bankcard> bxi()
  {
    ArrayList localArrayList = null;
    GMTrace.i(6911273467904L, 51493);
    Cursor localCursor = this.gMB.a("select * from WalletBankcard where cardType <= 7", null, 2);
    if (localCursor == null)
    {
      GMTrace.o(6911273467904L, 51493);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        Bankcard localBankcard = new Bankcard();
        localBankcard.b(localCursor);
        localArrayList.add(localBankcard);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    GMTrace.o(6911273467904L, 51493);
    return localArrayList;
  }
  
  public final ArrayList<Bankcard> bxv()
  {
    ArrayList localArrayList = null;
    GMTrace.i(6911407685632L, 51494);
    Object localObject = "select * from WalletBankcard where cardType & " + Bankcard.rMQ + " != 0 ";
    localObject = this.gMB.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(6911407685632L, 51494);
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        Bankcard localBankcard = new Bankcard();
        localBankcard.b((Cursor)localObject);
        localArrayList.add(localBankcard);
      } while (((Cursor)localObject).moveToNext());
    }
    ((Cursor)localObject).close();
    GMTrace.o(6911407685632L, 51494);
    return localArrayList;
  }
  
  public final boolean d(Bankcard paramBankcard)
  {
    GMTrace.i(6911676121088L, 51496);
    if (super.b(paramBankcard))
    {
      paramBankcard = this.hxh.iterator();
      while (paramBankcard.hasNext()) {
        paramBankcard.next();
      }
      GMTrace.o(6911676121088L, 51496);
      return true;
    }
    GMTrace.o(6911676121088L, 51496);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */