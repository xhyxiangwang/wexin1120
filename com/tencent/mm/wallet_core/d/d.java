package com.tencent.mm.wallet_core.d;

import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ui.MMActivity;

public abstract class d
{
  public MMActivity xgA;
  public f xgB;
  
  public d(MMActivity paramMMActivity, f paramf)
  {
    GMTrace.i(1438142955520L, 10715);
    this.xgA = paramMMActivity;
    this.xgB = paramf;
    GMTrace.o(1438142955520L, 10715);
  }
  
  public abstract boolean d(int paramInt1, int paramInt2, String paramString, k paramk);
  
  public abstract boolean j(Object... paramVarArgs);
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19128307941376L, 142517);
    GMTrace.o(19128307941376L, 142517);
  }
  
  public boolean p(Object... paramVarArgs)
  {
    GMTrace.i(1438411390976L, 10717);
    GMTrace.o(1438411390976L, 10717);
    return false;
  }
  
  public boolean q(Object... paramVarArgs)
  {
    GMTrace.i(1438545608704L, 10718);
    GMTrace.o(1438545608704L, 10718);
    return false;
  }
  
  public CharSequence rQ(int paramInt)
  {
    GMTrace.i(1438277173248L, 10716);
    GMTrace.o(1438277173248L, 10716);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */