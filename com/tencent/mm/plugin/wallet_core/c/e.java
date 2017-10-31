package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.e.i;

public final class e
  extends i<r>
{
  public static final String[] gMz;
  public com.tencent.mm.sdk.e.e gMB;
  
  static
  {
    GMTrace.i(6914092040192L, 51514);
    gMz = new String[] { i.a(r.gLR, "WalletFunciontList") };
    GMTrace.o(6914092040192L, 51514);
  }
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, r.gLR, "WalletFunciontList", null);
    GMTrace.i(6913823604736L, 51512);
    this.gMB = parame;
    GMTrace.o(6913823604736L, 51512);
  }
  
  public final void b(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(6913957822464L, 51513);
    r localr = new r();
    localr.field_wallet_region = paramInt;
    localr.field_function_list = paramString1;
    localr.field_new_list = paramString2;
    localr.field_banner_list = paramString3;
    localr.field_type_name_list = paramString4;
    super.a(localr);
    GMTrace.o(6913957822464L, 51513);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */