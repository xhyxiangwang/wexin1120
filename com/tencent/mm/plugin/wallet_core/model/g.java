package com.tencent.mm.plugin.wallet_core.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.wallet_core.c.b;

public final class g
{
  public int rNA;
  public b rNB;
  public int rNw;
  public String rNx;
  public int rNy;
  public String rNz;
  
  public g()
  {
    GMTrace.i(6908052242432L, 51469);
    this.rNw = 0;
    this.rNx = "";
    this.rNy = 0;
    this.rNz = "";
    this.rNA = 0;
    this.rNB = new b();
    GMTrace.o(6908052242432L, 51469);
  }
  
  public g(Bundle paramBundle)
  {
    GMTrace.i(6908186460160L, 51470);
    this.rNw = 0;
    this.rNx = "";
    this.rNy = 0;
    this.rNz = "";
    this.rNA = 0;
    this.rNB = new b();
    this.rNw = paramBundle.getInt("key_is_gen_cert", 0);
    this.rNy = paramBundle.getInt("key_is_hint_crt", 0);
    this.rNA = paramBundle.getInt("key_is_ignore_cert", 0);
    this.rNx = paramBundle.getString("key_crt_token", "");
    this.rNz = paramBundle.getString("key_crt_wording", "");
    this.rNB = new b(this.rNz);
    GMTrace.o(6908186460160L, 51470);
  }
  
  public final boolean bwr()
  {
    GMTrace.i(6908320677888L, 51471);
    if ((this.rNy != 0) && (!bg.mZ(this.rNz)))
    {
      GMTrace.o(6908320677888L, 51471);
      return true;
    }
    GMTrace.o(6908320677888L, 51471);
    return false;
  }
  
  public final boolean bws()
  {
    GMTrace.i(6908454895616L, 51472);
    if (this.rNw == 1)
    {
      GMTrace.o(6908454895616L, 51472);
      return true;
    }
    GMTrace.o(6908454895616L, 51472);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */