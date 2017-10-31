package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.brf;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class l
  extends c
{
  private String fAJ;
  private int shM;
  
  public l(int paramInt, String paramString)
  {
    GMTrace.i(9189082529792L, 68464);
    this.shM = paramInt;
    this.fAJ = paramString;
    GMTrace.o(9189082529792L, 68464);
  }
  
  public final String getName()
  {
    GMTrace.i(9189216747520L, 68465);
    GMTrace.o(9189216747520L, 68465);
    return "WearVoipControllerTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9189350965248L, 68466);
    switch (this.shM)
    {
    }
    for (;;)
    {
      GMTrace.o(9189350965248L, 68466);
      return;
      brf localbrf = new brf();
      localbrf.uFL = this.fAJ;
      localbrf.jYc = h.Kf(this.fAJ);
      try
      {
        a.bzo();
        r.a(this.shM, localbrf.toByteArray(), false);
        GMTrace.o(9189350965248L, 68466);
        return;
      }
      catch (IOException localIOException)
      {
        GMTrace.o(9189350965248L, 68466);
        return;
      }
      try
      {
        a.bzo();
        r.a(this.shM, this.fAJ.getBytes("utf8"), false);
        GMTrace.o(9189350965248L, 68466);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */