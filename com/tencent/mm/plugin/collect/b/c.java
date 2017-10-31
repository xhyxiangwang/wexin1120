package com.tencent.mm.plugin.collect.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.plugin.wallet_core.c.b;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class c
  implements i
{
  private i.b kJX;
  private String url;
  
  public c(String paramString)
  {
    GMTrace.i(20345260081152L, 151584);
    this.kJX = new i.b()
    {
      public final Bitmap mR(String paramAnonymousString)
      {
        GMTrace.i(20345125863424L, 151583);
        paramAnonymousString = d.decodeFile(paramAnonymousString, null);
        GMTrace.o(20345125863424L, 151583);
        return paramAnonymousString;
      }
    };
    this.url = paramString;
    GMTrace.o(20345260081152L, 151584);
  }
  
  public final void F(String paramString, boolean paramBoolean)
  {
    GMTrace.i(20346602258432L, 151594);
    GMTrace.o(20346602258432L, 151594);
  }
  
  public final i.b Pf()
  {
    GMTrace.i(20346870693888L, 151596);
    i.b localb = this.kJX;
    GMTrace.o(20346870693888L, 151596);
    return localb;
  }
  
  public final String Pg()
  {
    GMTrace.i(20345394298880L, 151585);
    String str = b.DS(this.url);
    GMTrace.o(20345394298880L, 151585);
    return str;
  }
  
  public final String Ph()
  {
    GMTrace.i(20345528516608L, 151586);
    String str = this.url;
    GMTrace.o(20345528516608L, 151586);
    return str;
  }
  
  public final String Pi()
  {
    GMTrace.i(20345662734336L, 151587);
    String str = this.url;
    GMTrace.o(20345662734336L, 151587);
    return str;
  }
  
  public final String Pj()
  {
    GMTrace.i(20345796952064L, 151588);
    String str = this.url;
    GMTrace.o(20345796952064L, 151588);
    return str;
  }
  
  public final boolean Pk()
  {
    GMTrace.i(20345931169792L, 151589);
    GMTrace.o(20345931169792L, 151589);
    return true;
  }
  
  public final boolean Pl()
  {
    GMTrace.i(20346065387520L, 151590);
    GMTrace.o(20346065387520L, 151590);
    return false;
  }
  
  public final Bitmap Pm()
  {
    GMTrace.i(20346199605248L, 151591);
    GMTrace.o(20346199605248L, 151591);
    return null;
  }
  
  public final void Pn()
  {
    GMTrace.i(20346468040704L, 151593);
    GMTrace.o(20346468040704L, 151593);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(20346333822976L, 151592);
    if (i.a.iaZ == parama) {}
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, b.DS(this.url), false);
      GMTrace.o(20346333822976L, 151592);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.WalletGetPicStrategy", parama, "", new Object[0]);
      }
    }
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(20346736476160L, 151595);
    GMTrace.o(20346736476160L, 151595);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */