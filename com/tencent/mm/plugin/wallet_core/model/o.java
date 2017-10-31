package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class o
{
  public List<ElementQuery> rKK;
  public SparseArray<String> rQF;
  
  public o()
  {
    GMTrace.i(6862820868096L, 51132);
    this.rQF = null;
    this.rKK = null;
    GMTrace.o(6862820868096L, 51132);
  }
  
  public final String J(Context paramContext, int paramInt)
  {
    GMTrace.i(6862955085824L, 51133);
    if (this.rQF != null)
    {
      String str = (String)this.rQF.get(paramInt);
      if (!bg.mZ(str))
      {
        GMTrace.o(6862955085824L, 51133);
        return str;
      }
    }
    paramContext = paramContext.getString(R.l.eTd);
    GMTrace.o(6862955085824L, 51133);
    return paramContext;
  }
  
  public final ElementQuery Jn(String paramString)
  {
    GMTrace.i(6863089303552L, 51134);
    if ((this.rKK != null) && (this.rKK.size() != 0))
    {
      Iterator localIterator = this.rKK.iterator();
      while (localIterator.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)localIterator.next();
        if ((localElementQuery.oql != null) && (localElementQuery.oql.equals(paramString)))
        {
          GMTrace.o(6863089303552L, 51134);
          return localElementQuery;
        }
      }
      w.w("MicroMsg.WalletBankElementManager", "hy: not found given banktype: %s", new Object[] { paramString });
      GMTrace.o(6863089303552L, 51134);
      return null;
    }
    w.w("MicroMsg.WalletBankElementManager", "hy: no element from given banktype");
    GMTrace.o(6863089303552L, 51134);
    return null;
  }
  
  public final ElementQuery Jo(String paramString)
  {
    GMTrace.i(6863223521280L, 51135);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.WalletBankElementManager", "hy: bindSerail given is null");
      GMTrace.o(6863223521280L, 51135);
      return null;
    }
    if ((this.rKK != null) && (this.rKK.size() != 0))
    {
      Iterator localIterator = this.rKK.iterator();
      while (localIterator.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)localIterator.next();
        if (paramString.equals(localElementQuery.oqm))
        {
          GMTrace.o(6863223521280L, 51135);
          return localElementQuery;
        }
      }
      w.w("MicroMsg.WalletBankElementManager", "hy: not found given element query");
      GMTrace.o(6863223521280L, 51135);
      return null;
    }
    w.w("MicroMsg.WalletBankElementManager", "hy: element list is null. get element failed");
    GMTrace.o(6863223521280L, 51135);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */