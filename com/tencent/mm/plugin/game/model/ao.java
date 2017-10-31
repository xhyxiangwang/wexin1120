package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.v.a.a;
import com.tencent.mm.plugin.v.a.a.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.protocal.c.dp;
import com.tencent.mm.protocal.c.vo;
import com.tencent.mm.protocal.c.vp;
import java.util.Iterator;
import java.util.LinkedList;

public final class ao
  extends com.tencent.mm.pluginsdk.model.app.w
{
  public ao(String paramString)
  {
    GMTrace.i(12590696628224L, 93808);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new vo();
    ((b.a)localObject).hlY = new vp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getauthapplist";
    ((b.a)localObject).hlW = 394;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.lnP = ((b.a)localObject).DA();
    localObject = (vo)this.lnP.hlU.hmc;
    ((vo)localObject).jXP = 1;
    ((vo)localObject).mEm = paramString;
    GMTrace.o(12590696628224L, 93808);
  }
  
  private static void a(f paramf, dp paramdp)
  {
    GMTrace.i(12590965063680L, 93810);
    paramf.field_appType = paramdp.txk;
    paramf.field_appIconUrl = paramdp.mFy;
    paramf.field_appName = paramdp.mFw;
    paramf.field_authFlag = paramdp.twE;
    paramf.bQ(paramdp.txl);
    paramf.bR(paramdp.txm);
    GMTrace.o(12590965063680L, 93810);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(12590830845952L, 93809);
    paramString = (vp)this.lnP.hlV.hmc;
    paramInt1 = paramString.tTB;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAuthAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", get authlist count = " + paramInt1);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAuthAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      GMTrace.o(12590830845952L, 93809);
      return;
    }
    paramp = paramString.tTE;
    if ((paramp != null) && (paramp.size() > 0))
    {
      paramString = a.a.aUZ().aUX();
      paramp = paramp.iterator();
      while (paramp.hasNext())
      {
        paramArrayOfByte = (dp)paramp.next();
        f localf = g.aM(paramArrayOfByte.mCH, true);
        boolean bool;
        if (localf != null)
        {
          a(localf, paramArrayOfByte);
          bool = paramString.a(localf, new String[0]);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetSceneGetAuthAppList", "onGYNetEnd, update ret = " + bool + ", appId = " + localf.field_appId);
        }
        else
        {
          localf = new f();
          localf.field_appId = paramArrayOfByte.mCH;
          a(localf, paramArrayOfByte);
          bool = paramString.l(localf);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetSceneGetAuthAppList", "insert game appinfo:" + paramArrayOfByte.mCH + ", ret = " + bool);
        }
      }
    }
    GMTrace.o(12590830845952L, 93809);
  }
  
  public final byte[] aEY()
  {
    GMTrace.i(12591099281408L, 93811);
    try
    {
      byte[] arrayOfByte = ((b.b)this.lnP.DC()).Bb();
      GMTrace.o(12591099281408L, 93811);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetAuthAppList", localException, "", new Object[0]);
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAuthAppList", "reqToBuf failed: " + localException.getMessage());
      GMTrace.o(12591099281408L, 93811);
    }
    return null;
  }
  
  public final void at(byte[] paramArrayOfByte)
  {
    GMTrace.i(12591233499136L, 93812);
    if (paramArrayOfByte == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAuthAppList", "buf is null");
      GMTrace.o(12591233499136L, 93812);
      return;
    }
    b.c localc = this.lnP.hlV;
    try
    {
      localc.y(paramArrayOfByte);
      GMTrace.o(12591233499136L, 93812);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetSceneGetAuthAppList", paramArrayOfByte.getMessage());
      com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.NetSceneGetAuthAppList", paramArrayOfByte, "", new Object[0]);
      GMTrace.o(12591233499136L, 93812);
    }
  }
  
  public final int getType()
  {
    GMTrace.i(12591367716864L, 93813);
    GMTrace.o(12591367716864L, 93813);
    return 3;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */