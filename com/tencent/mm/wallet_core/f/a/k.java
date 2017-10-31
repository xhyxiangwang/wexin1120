package com.tencent.mm.wallet_core.f.a;

import com.tencent.gmtrace.GMTrace;
import org.json.JSONObject;

public abstract class k
  extends h
{
  private int errCode;
  private String ftU;
  public boolean rHU;
  private boolean xgW;
  public boolean xgX;
  public boolean xgY;
  
  public k()
  {
    GMTrace.i(1518136721408L, 11311);
    this.xgW = false;
    this.errCode = 0;
    this.ftU = "";
    this.xgX = false;
    this.xgY = false;
    this.rHU = false;
    GMTrace.o(1518136721408L, 11311);
  }
  
  public void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1518405156864L, 11313);
    this.errCode = paramInt;
    this.ftU = paramString;
    GMTrace.o(1518405156864L, 11313);
  }
  
  public final boolean aZF()
  {
    GMTrace.i(1518673592320L, 11315);
    if (!this.xgX)
    {
      GMTrace.o(1518673592320L, 11315);
      return true;
    }
    GMTrace.o(1518673592320L, 11315);
    return false;
  }
  
  public boolean bie()
  {
    GMTrace.i(1518539374592L, 11314);
    GMTrace.o(1518539374592L, 11314);
    return false;
  }
  
  public final void z(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1518270939136L, 11312);
    super.z(paramBoolean1, paramBoolean2);
    GMTrace.o(1518270939136L, 11312);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/f/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */