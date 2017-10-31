package com.tencent.mm.plugin.game.gamewebview.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public class b
{
  private String iPg;
  private Integer mua;
  private Integer mub;
  
  public b()
  {
    GMTrace.i(17072360783872L, 127199);
    Assert.assertTrue("Must declare NAME and CTRL_BYTE in subclasses", true);
    GMTrace.o(17072360783872L, 127199);
  }
  
  private Integer aCN()
  {
    GMTrace.i(17072763437056L, 127202);
    Object localObject;
    if (this.mua == null) {
      localObject = new c(this, "CTRL_BYTE", null);
    }
    try
    {
      this.mua = ((Integer)((c)localObject).get());
      localObject = this.mua;
      GMTrace.o(17072763437056L, 127202);
      return (Integer)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.GameBaseJsApii", "getCtrlByte exp = %s", new Object[] { bg.f(localException) });
      }
    }
  }
  
  private Integer aCP()
  {
    GMTrace.i(17073031872512L, 127204);
    Object localObject;
    if (this.mub == null) {
      localObject = new c(this, "DO_IN_ENV", null);
    }
    try
    {
      this.mub = ((Integer)((c)localObject).get());
      localObject = this.mub;
      GMTrace.o(17073031872512L, 127204);
      return (Integer)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.mub = null;
      }
    }
  }
  
  public final int aCM()
  {
    GMTrace.i(17072629219328L, 127201);
    int i = bg.a(aCN(), -1);
    GMTrace.o(17072629219328L, 127201);
    return i;
  }
  
  public final int aCO()
  {
    GMTrace.i(17072897654784L, 127203);
    int i = bg.a(aCP(), 0);
    GMTrace.o(17072897654784L, 127203);
    return i;
  }
  
  public final String getName()
  {
    GMTrace.i(17072495001600L, 127200);
    Object localObject;
    if (bg.mZ(this.iPg)) {
      localObject = new c(this, "NAME", null);
    }
    try
    {
      this.iPg = ((String)((c)localObject).get());
      localObject = this.iPg;
      GMTrace.o(17072495001600L, 127200);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.GameBaseJsApii", "getName exp = %s", new Object[] { bg.f(localException) });
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */