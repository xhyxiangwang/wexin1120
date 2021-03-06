package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.platformtools.i.b;
import com.tencent.mm.plugin.wallet_core.c.b;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;

public final class c
  implements i
{
  private i.b kJX;
  private String url;
  
  public c(String paramString)
  {
    GMTrace.i(6968181784576L, 51917);
    this.kJX = new i.b()
    {
      public final Bitmap mR(String paramAnonymousString)
      {
        GMTrace.i(6966034300928L, 51901);
        paramAnonymousString = d.decodeFile(paramAnonymousString, null);
        GMTrace.o(6966034300928L, 51901);
        return paramAnonymousString;
      }
    };
    this.url = paramString;
    GMTrace.o(6968181784576L, 51917);
  }
  
  public final void F(String paramString, boolean paramBoolean)
  {
    GMTrace.i(6969523961856L, 51927);
    GMTrace.o(6969523961856L, 51927);
  }
  
  public final i.b Pf()
  {
    GMTrace.i(6969792397312L, 51929);
    i.b localb = this.kJX;
    GMTrace.o(6969792397312L, 51929);
    return localb;
  }
  
  public final String Pg()
  {
    GMTrace.i(6968316002304L, 51918);
    String str = b.DS(this.url);
    GMTrace.o(6968316002304L, 51918);
    return str;
  }
  
  public final String Ph()
  {
    GMTrace.i(6968450220032L, 51919);
    String str = this.url;
    GMTrace.o(6968450220032L, 51919);
    return str;
  }
  
  public final String Pi()
  {
    GMTrace.i(6968584437760L, 51920);
    String str = this.url;
    GMTrace.o(6968584437760L, 51920);
    return str;
  }
  
  public final String Pj()
  {
    GMTrace.i(6968718655488L, 51921);
    String str = this.url;
    GMTrace.o(6968718655488L, 51921);
    return str;
  }
  
  public final boolean Pk()
  {
    GMTrace.i(6968852873216L, 51922);
    GMTrace.o(6968852873216L, 51922);
    return true;
  }
  
  public final boolean Pl()
  {
    GMTrace.i(6968987090944L, 51923);
    GMTrace.o(6968987090944L, 51923);
    return false;
  }
  
  public final Bitmap Pm()
  {
    GMTrace.i(6969121308672L, 51924);
    GMTrace.o(6969121308672L, 51924);
    return null;
  }
  
  public final void Pn()
  {
    GMTrace.i(6969389744128L, 51926);
    GMTrace.o(6969389744128L, 51926);
  }
  
  public final Bitmap a(Bitmap paramBitmap, i.a parama, String paramString)
  {
    GMTrace.i(6969255526400L, 51925);
    if (i.a.iaZ == parama) {
      if ((paramBitmap != null) && (paramBitmap.getNinePatchChunk() != null))
      {
        w.v("MicroMsg.WalletGetPicStrategy", " get the ninePathchChunk");
        FileOp.o(paramString, b.DS(this.url));
        GMTrace.o(6969255526400L, 51925);
        return paramBitmap;
      }
    }
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, b.DS(this.url), false);
      w.d("MicroMsg.WalletGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      GMTrace.o(6969255526400L, 51925);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        try
        {
          paramString = new File(b.bxu());
          if (!paramString.exists()) {
            paramString.mkdir();
          }
          w.w("MicroMsg.WalletGetPicStrategy", " retry saving bitmap");
          d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, b.DS(this.url), false);
        }
        catch (IOException paramString)
        {
          w.printErrStackTrace("MicroMsg.WalletGetPicStrategy", paramString, "", new Object[0]);
          w.w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
        }
      }
    }
  }
  
  public final void a(i.a parama, String paramString)
  {
    GMTrace.i(6969658179584L, 51928);
    GMTrace.o(6969658179584L, 51928);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */