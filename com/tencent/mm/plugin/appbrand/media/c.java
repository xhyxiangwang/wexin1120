package com.tencent.mm.plugin.appbrand.media;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.as.b;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

public final class c
{
  public String fBG;
  public int fBH;
  public String fxq;
  private HashMap<String, com.tencent.mm.sdk.b.c> hxa;
  public String jhg;
  public String jhh;
  
  public c()
  {
    GMTrace.i(19845970132992L, 147864);
    this.hxa = new HashMap();
    GMTrace.o(19845970132992L, 147864);
  }
  
  public final void a(com.tencent.mm.sdk.b.c paramc, String paramString)
  {
    GMTrace.i(19846372786176L, 147867);
    if (this.hxa.get(paramString) != null)
    {
      w.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already add appid: %s", new Object[] { paramString });
      GMTrace.o(19846372786176L, 147867);
      return;
    }
    a.uLm.b(paramc);
    this.hxa.put(paramString, paramc);
    GMTrace.o(19846372786176L, 147867);
  }
  
  public final boolean ba(String paramString1, String paramString2)
  {
    GMTrace.i(19846104350720L, 147865);
    if (paramString2.equalsIgnoreCase("play"))
    {
      w.i("MicroMsg.AppBrandMusicPlayerManager", "play option appid %s, pre appid %s", new Object[] { paramString1, this.jhg });
      GMTrace.o(19846104350720L, 147865);
      return true;
    }
    if (paramString1.equalsIgnoreCase(this.jhg))
    {
      paramString1 = b.JP();
      if ((paramString1 != null) && (paramString1.tIh.equals(this.jhh)))
      {
        GMTrace.o(19846104350720L, 147865);
        return true;
      }
    }
    GMTrace.o(19846104350720L, 147865);
    return false;
  }
  
  public final void c(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(19846238568448L, 147866);
    this.jhg = paramString1;
    this.fBH = paramInt;
    this.fxq = paramString2;
    this.fBG = paramString3;
    GMTrace.o(19846238568448L, 147866);
  }
  
  public final void pU(String paramString)
  {
    GMTrace.i(19846507003904L, 147868);
    if (this.hxa.get(paramString) == null)
    {
      w.i("MicroMsg.AppBrandMusicPlayerManager", "listeners already remove appid: %s", new Object[] { paramString });
      GMTrace.o(19846507003904L, 147868);
      return;
    }
    a.uLm.c((com.tencent.mm.sdk.b.c)this.hxa.remove(paramString));
    this.hxa.remove(paramString);
    GMTrace.o(19846507003904L, 147868);
  }
  
  public final boolean qR(String paramString)
  {
    GMTrace.i(19846641221632L, 147869);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "appId is empty");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    if (!paramString.equalsIgnoreCase(this.jhg))
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "appId is not equals pre play id");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    if (TextUtils.isEmpty(this.jhh))
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "now app not play music");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    paramString = b.JP();
    if (paramString == null)
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "wrapper is null");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    if (!this.jhh.equalsIgnoreCase(paramString.tIh))
    {
      w.e("MicroMsg.AppBrandMusicPlayerManager", "musicId is diff");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    if (!b.JN())
    {
      w.i("MicroMsg.AppBrandMusicPlayerManager", "MusicHelper.isPlayingMusic FALSE");
      GMTrace.o(19846641221632L, 147869);
      return false;
    }
    GMTrace.o(19846641221632L, 147869);
    return true;
  }
  
  private static final class a
  {
    public static c jhi;
    
    static
    {
      GMTrace.i(19859794558976L, 147967);
      jhi = new c();
      GMTrace.o(19859794558976L, 147967);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */