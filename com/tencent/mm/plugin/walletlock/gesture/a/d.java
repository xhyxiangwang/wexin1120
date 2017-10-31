package com.tencent.mm.plugin.walletlock.gesture.a;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.aqq;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.IOException;

public final class d
{
  private static long seT;
  
  static
  {
    GMTrace.i(20244194131968L, 150831);
    seT = -1L;
    GMTrace.o(20244194131968L, 150831);
  }
  
  public static void a(aqq paramaqq)
  {
    GMTrace.i(20243388825600L, 150825);
    t localt = h.xz().xi();
    if (localt != null) {
      try
      {
        localt.set(339989, Base64.encodeToString(paramaqq.toByteArray(), 2));
        localt.kz(true);
        w.v("MicroMsg.GestureGuardInfoManager", "alvinluo savePatternBuffer isUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(e.byL()) });
        GMTrace.o(20243388825600L, 150825);
        return;
      }
      catch (IOException paramaqq)
      {
        w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", paramaqq, "", new Object[0]);
      }
    }
    GMTrace.o(20243388825600L, 150825);
  }
  
  public static void a(aqr paramaqr)
  {
    GMTrace.i(20243657261056L, 150827);
    if (paramaqr != null) {
      w.i("MicroMsg.GestureGuardInfoManager", "alvinluo saveSyncedPatternInfo version: %d, status: %d", new Object[] { Integer.valueOf(paramaqr.umN), Integer.valueOf(paramaqr.umP) });
    }
    t localt = h.xz().xi();
    if (localt != null) {
      try
      {
        localt.set(339990, Base64.encodeToString(paramaqr.toByteArray(), 2));
        localt.kz(true);
        GMTrace.o(20243657261056L, 150827);
        return;
      }
      catch (IOException paramaqr)
      {
        w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", paramaqr, "", new Object[0]);
      }
    }
    GMTrace.o(20243657261056L, 150827);
  }
  
  public static void byC()
  {
    GMTrace.i(20242717736960L, 150820);
    seT = -1L;
    GMTrace.o(20242717736960L, 150820);
  }
  
  public static long byD()
  {
    GMTrace.i(20242449301504L, 150818);
    long l = seT;
    GMTrace.o(20242449301504L, 150818);
    return l;
  }
  
  public static g byN()
  {
    GMTrace.i(20242046648320L, 150815);
    Object localObject = h.xz().xi();
    if (localObject == null)
    {
      localObject = new g();
      GMTrace.o(20242046648320L, 150815);
      return (g)localObject;
    }
    localObject = ((t)localObject).get(339969, null);
    if (localObject == null)
    {
      localObject = new g();
      GMTrace.o(20242046648320L, 150815);
      return (g)localObject;
    }
    localObject = new g().aP(e.JY((String)localObject));
    GMTrace.o(20242046648320L, 150815);
    return (g)localObject;
  }
  
  public static void byO()
  {
    GMTrace.i(20242315083776L, 150817);
    t localt = h.xz().xi();
    if (localt != null)
    {
      localt.set(339969, null);
      localt.kz(true);
    }
    GMTrace.o(20242315083776L, 150817);
  }
  
  public static g byP()
  {
    GMTrace.i(20242851954688L, 150821);
    Object localObject = h.xz().xi();
    if (localObject == null)
    {
      localObject = new g();
      GMTrace.o(20242851954688L, 150821);
      return (g)localObject;
    }
    localObject = ((t)localObject).get(339971, null);
    if (localObject == null)
    {
      localObject = new g();
      GMTrace.o(20242851954688L, 150821);
      return (g)localObject;
    }
    localObject = new g().aP(e.JY((String)localObject));
    GMTrace.o(20242851954688L, 150821);
    return (g)localObject;
  }
  
  public static void byQ()
  {
    GMTrace.i(20243120390144L, 150823);
    t localt = h.xz().xi();
    if (localt != null)
    {
      localt.set(339971, null);
      localt.kz(true);
    }
    GMTrace.o(20243120390144L, 150823);
  }
  
  public static aqq byR()
  {
    GMTrace.i(20243254607872L, 150824);
    Object localObject = h.xz().xi();
    if (localObject == null)
    {
      GMTrace.o(20243254607872L, 150824);
      return null;
    }
    localObject = (String)((t)localObject).get(339989, null);
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(20243254607872L, 150824);
      return null;
    }
    try
    {
      localObject = Base64.decode((String)localObject, 2);
      localObject = (aqq)new aqq().aC((byte[])localObject);
      GMTrace.o(20243254607872L, 150824);
      return (aqq)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIllegalArgumentException, "", new Object[0]);
      GMTrace.o(20243254607872L, 150824);
      return null;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIOException, "", new Object[0]);
      GMTrace.o(20243254607872L, 150824);
    }
    return null;
  }
  
  public static aqr byS()
  {
    GMTrace.i(20243523043328L, 150826);
    Object localObject = h.xz().xi();
    if (localObject == null)
    {
      w.e("MicroMsg.GestureGuardInfoManager", "alvinluo configstg is null");
      GMTrace.o(20243523043328L, 150826);
      return null;
    }
    localObject = (String)((t)localObject).get(339990, null);
    if (bg.mZ((String)localObject))
    {
      GMTrace.o(20243523043328L, 150826);
      return null;
    }
    try
    {
      localObject = Base64.decode((String)localObject, 2);
      localObject = (aqr)new aqr().aC((byte[])localObject);
      GMTrace.o(20243523043328L, 150826);
      return (aqr)localObject;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIllegalArgumentException, "", new Object[0]);
      GMTrace.o(20243523043328L, 150826);
      return null;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIOException, "", new Object[0]);
      GMTrace.o(20243523043328L, 150826);
    }
    return null;
  }
  
  public static int byT()
  {
    GMTrace.i(20243791478784L, 150828);
    Object localObject = h.xz().xi();
    if (localObject == null)
    {
      GMTrace.o(20243791478784L, 150828);
      return -1;
    }
    localObject = ((t)localObject).get(339972, null);
    if (localObject == null)
    {
      GMTrace.o(20243791478784L, 150828);
      return -1;
    }
    int i = ((Integer)localObject).intValue();
    GMTrace.o(20243791478784L, 150828);
    return i;
  }
  
  public static void byU()
  {
    GMTrace.i(20244059914240L, 150830);
    t localt = h.xz().xi();
    if (localt != null)
    {
      localt.set(339972, null);
      localt.kz(true);
    }
    GMTrace.o(20244059914240L, 150830);
  }
  
  public static void ee(long paramLong)
  {
    GMTrace.i(20242583519232L, 150819);
    seT = paramLong;
    GMTrace.o(20242583519232L, 150819);
  }
  
  public static void t(long paramLong1, long paramLong2)
  {
    GMTrace.i(20242180866048L, 150816);
    t localt = h.xz().xi();
    if (localt != null)
    {
      g localg = new g();
      localg.sfu = paramLong1;
      localg.sfv = paramLong2;
      localt.set(339969, e.aO(localg.toByteArray()));
      localt.kz(true);
    }
    GMTrace.o(20242180866048L, 150816);
  }
  
  public static void u(long paramLong1, long paramLong2)
  {
    GMTrace.i(20242986172416L, 150822);
    t localt = h.xz().xi();
    if (localt != null)
    {
      g localg = new g();
      localg.sfu = paramLong1;
      localg.sfv = paramLong2;
      localt.set(339971, e.aO(localg.toByteArray()));
      localt.kz(true);
    }
    GMTrace.o(20242986172416L, 150822);
  }
  
  public static void wM(int paramInt)
  {
    GMTrace.i(20243925696512L, 150829);
    t localt = h.xz().xi();
    if (localt != null)
    {
      localt.set(339972, Integer.valueOf(paramInt));
      localt.kz(true);
    }
    GMTrace.o(20243925696512L, 150829);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */