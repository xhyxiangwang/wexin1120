package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.h;
import com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public b mvQ;
  public c mvR;
  
  public f(String paramString, c paramc)
  {
    GMTrace.i(17078669017088L, 127246);
    this.mvR = paramc;
    this.mvQ = new b(paramString);
    GMTrace.o(17078669017088L, 127246);
  }
  
  private static final class a
    implements e, g<Bundle, IPCRunCgiRespWrapper>
  {
    private h<IPCRunCgiRespWrapper> mvV;
    
    private a()
    {
      GMTrace.i(18935839719424L, 141083);
      GMTrace.o(18935839719424L, 141083);
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(18935973937152L, 141084);
      w.d("MicroMsg.GameWebViewGetA8KeyHelp", "onSceneEnd");
      ap.wT().b(233, this);
      if (this.mvV != null)
      {
        IPCRunCgiRespWrapper localIPCRunCgiRespWrapper = new IPCRunCgiRespWrapper();
        localIPCRunCgiRespWrapper.errType = paramInt1;
        localIPCRunCgiRespWrapper.errCode = paramInt2;
        localIPCRunCgiRespWrapper.ftU = paramString;
        localIPCRunCgiRespWrapper.gMC = ((b)paramk.hmv);
        this.mvV.al(localIPCRunCgiRespWrapper);
      }
      this.mvV = null;
      GMTrace.o(18935973937152L, 141084);
    }
  }
  
  public static final class b
  {
    private static final Pattern mvW;
    private String mvX;
    
    static
    {
      GMTrace.i(17078534799360L, 127245);
      mvW = Pattern.compile(".*#.*wechat_redirect");
      GMTrace.o(17078534799360L, 127245);
    }
    
    public b(String paramString)
    {
      GMTrace.i(17078266363904L, 127243);
      this.mvX = null;
      this.mvX = paramString;
      GMTrace.o(17078266363904L, 127243);
    }
    
    public final int yN(String paramString)
    {
      GMTrace.i(17078400581632L, 127244);
      if (bg.mZ(paramString))
      {
        w.e("MicroMsg.GameWebViewGetA8KeyHelp", "getReason fail, url is null");
        GMTrace.o(17078400581632L, 127244);
        return 0;
      }
      if (paramString.equals(this.mvX))
      {
        GMTrace.o(17078400581632L, 127244);
        return 0;
      }
      if (mvW.matcher(paramString).find())
      {
        GMTrace.o(17078400581632L, 127244);
        return 2;
      }
      GMTrace.o(17078400581632L, 127244);
      return 1;
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, b paramb);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */