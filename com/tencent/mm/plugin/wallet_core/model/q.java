package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.d.a.c.h;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.security.Signature;

public enum q
{
  public String lZc;
  public boolean lZd;
  private Signature rQH;
  public h rQI;
  
  static
  {
    GMTrace.i(6904025710592L, 51439);
    rQG = new q("IML");
    rQJ = new q[] { rQG };
    GMTrace.o(6904025710592L, 51439);
  }
  
  private q()
  {
    GMTrace.i(6903757275136L, 51437);
    this.lZc = null;
    this.lZd = false;
    this.rQH = null;
    this.rQI = null;
    GMTrace.o(6903757275136L, 51437);
  }
  
  public final void reset()
  {
    GMTrace.i(6903891492864L, 51438);
    w.i("MicroMsg.WalletFingerprintVerifyManager", "hy: start reset");
    this.rQH = null;
    this.lZc = null;
    this.lZd = false;
    GMTrace.o(6903891492864L, 51438);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */