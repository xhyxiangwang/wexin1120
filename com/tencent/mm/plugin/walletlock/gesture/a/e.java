package com.tencent.mm.plugin.walletlock.gesture.a;

import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;
import com.tencent.mm.bl.b;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.c.aqq;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.protocal.c.axs;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import java.io.ByteArrayOutputStream;
import java.util.List;

public final class e
{
  public static byte[] JY(String paramString)
  {
    GMTrace.i(20241375559680L, 150810);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (i < paramString.length())
    {
      localByteArrayOutputStream.write(Integer.parseInt(paramString.substring(i, i + 2), 16));
      i += 2;
    }
    paramString = localByteArrayOutputStream.toByteArray();
    GMTrace.o(20241375559680L, 150810);
    return paramString;
  }
  
  public static void a(g paramg)
  {
    GMTrace.i(20241241341952L, 150809);
    if (paramg.sfu == -1L)
    {
      GMTrace.o(20241241341952L, 150809);
      return;
    }
    long l = SystemClock.elapsedRealtime();
    if (l < paramg.sfu)
    {
      paramg.sfu = l;
      paramg.sfv += l;
      w.d("MicroMsg.GestureUtil", String.format("Rebooted, need to add additional %d ms, now elapsed %d ms", new Object[] { Long.valueOf(l), Long.valueOf(paramg.sfv) }));
      GMTrace.o(20241241341952L, 150809);
      return;
    }
    paramg.sfv = (l - paramg.sfu + paramg.sfv);
    paramg.sfu = l;
    GMTrace.o(20241241341952L, 150809);
  }
  
  private static byte[] aN(byte[] paramArrayOfByte)
  {
    GMTrace.i(20240838688768L, 150806);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (i < paramArrayOfByte.length - 1)
    {
      localByteArrayOutputStream.write("0123456789abcdef".indexOf(Character.toLowerCase(paramArrayOfByte[i])) << 4 | "0123456789abcdef".indexOf(Character.toLowerCase(paramArrayOfByte[(i + 1)])));
      i += 2;
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    GMTrace.o(20240838688768L, 150806);
    return paramArrayOfByte;
  }
  
  public static String aO(byte[] paramArrayOfByte)
  {
    GMTrace.i(20241509777408L, 150811);
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramArrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() < 2) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(str);
      i += 1;
    }
    paramArrayOfByte = localStringBuilder.toString();
    GMTrace.o(20241509777408L, 150811);
    return paramArrayOfByte;
  }
  
  public static boolean b(aqq paramaqq)
  {
    GMTrace.i(20240570253312L, 150804);
    if ((paramaqq == null) || (paramaqq.umM == null) || (paramaqq.umM.ush == null))
    {
      GMTrace.o(20240570253312L, 150804);
      return false;
    }
    byte[] arrayOfByte = paramaqq.umM.ush.toK;
    if ((arrayOfByte.length == 0) || ((arrayOfByte.length & 0x1) != 0))
    {
      GMTrace.o(20240570253312L, 150804);
      return false;
    }
    long l = new o(paramaqq.uin).longValue();
    arrayOfByte = aN(arrayOfByte);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramaqq.version);
    if (paramaqq.umK.usi) {
      localStringBuilder.append(new String(paramaqq.umK.ush.toK));
    }
    localStringBuilder.append(l);
    int i = UtilsJni.doEcdsaVerify(a.sfq, localStringBuilder.toString().getBytes(), arrayOfByte);
    w.d("MicroMsg.GestureUtil", String.format("verifyPatternBuffer, ret:%d", new Object[] { Integer.valueOf(i) }));
    if (i == 1)
    {
      GMTrace.o(20240570253312L, 150804);
      return true;
    }
    GMTrace.o(20240570253312L, 150804);
    return false;
  }
  
  public static boolean b(aqr paramaqr)
  {
    GMTrace.i(20240704471040L, 150805);
    if ((paramaqr == null) || (paramaqr.umO == null) || (paramaqr.umO.ush == null))
    {
      GMTrace.o(20240704471040L, 150805);
      return false;
    }
    byte[] arrayOfByte = paramaqr.umO.ush.toK;
    if ((arrayOfByte.length == 0) || ((arrayOfByte.length & 0x1) != 0))
    {
      GMTrace.o(20240704471040L, 150805);
      return false;
    }
    arrayOfByte = aN(arrayOfByte);
    h.xx();
    long l = new o(com.tencent.mm.kernel.a.wy()).longValue();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramaqr.umN);
    localStringBuilder.append(l);
    int i = UtilsJni.doEcdsaVerify(a.sfq, localStringBuilder.toString().getBytes(), arrayOfByte);
    if (((i != 1) && (paramaqr.umP == 1)) || ((i == 1) && (paramaqr.umP == 0))) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.GestureUtil", String.format("verifyPatternInfo, verifyRes:%d ret:%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) }));
      GMTrace.o(20240704471040L, 150805);
      return bool;
    }
  }
  
  public static byte[] bK(List<f> paramList)
  {
    GMTrace.i(20241107124224L, 150808);
    if (paramList == null) {
      throw new IllegalArgumentException("pattern is null");
    }
    int j = paramList.size();
    Object localObject = new byte[j];
    int i = 0;
    while (i < j)
    {
      f localf = (f)paramList.get(i);
      int k = localf.sfr;
      localObject[i] = ((byte)(localf.sfs + k * 3 + 1));
      i += 1;
    }
    paramList = new StringBuilder();
    i = 0;
    while (i < j)
    {
      paramList.append(localObject[i]);
      i += 1;
    }
    paramList = paramList.toString();
    localObject = m.zF();
    localObject = com.tencent.mm.a.g.n((com.tencent.mm.a.g.n(paramList.getBytes()) + (String)localObject).getBytes());
    paramList = com.tencent.mm.a.g.n(((String)localObject + paramList).getBytes()).getBytes();
    GMTrace.o(20241107124224L, 150808);
    return paramList;
  }
  
  public static boolean byL()
  {
    GMTrace.i(20240972906496L, 150807);
    if ((!h.xx().wM()) || (com.tencent.mm.kernel.a.wG()))
    {
      w.w("MicroMsg.GestureUtil", "not login !!");
      GMTrace.o(20240972906496L, 150807);
      return false;
    }
    aqr localaqr = d.byS();
    aqq localaqq = d.byR();
    int j;
    if (localaqr == null) {
      j = 1;
    }
    for (;;)
    {
      int i;
      label67:
      boolean bool1;
      label77:
      label84:
      boolean bool2;
      if (localaqq == null)
      {
        i = 1;
        if (j != 0) {
          break label256;
        }
        bool1 = b(localaqr);
        if (localaqr != null) {
          break label261;
        }
        j = -1;
        w.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock serverInfo:%s status:%d  svrinfoValid:%s", new Object[] { localaqr, Integer.valueOf(j), Boolean.valueOf(bool1) });
        if (i != 0) {
          break label270;
        }
        bool2 = b(localaqq);
        label125:
        if (localaqq != null) {
          break label275;
        }
        i = -1;
        label132:
        w.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock localBuff:%s status:%d  localBuffValid:%s", new Object[] { localaqq, Integer.valueOf(i), Boolean.valueOf(bool2) });
        if ((bool1) && (!bool2)) {
          break label438;
        }
      }
      try
      {
        w.i("MicroMsg.GestureUtil", "Both info & buff are valid, choose one to trust.");
        if (localaqr.umN > localaqq.version)
        {
          w.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, srvInfo wins.", new Object[] { Integer.valueOf(localaqr.umN), Integer.valueOf(localaqq.version) });
          if (localaqr.umP == 1)
          {
            GMTrace.o(20240972906496L, 150807);
            return true;
            j = 0;
            continue;
            i = 0;
            break label67;
            label256:
            bool1 = false;
            break label77;
            label261:
            j = localaqr.umP;
            break label84;
            label270:
            bool2 = false;
            break label125;
            label275:
            i = localaqq.umL;
            break label132;
          }
          else
          {
            GMTrace.o(20240972906496L, 150807);
            return false;
          }
        }
        else
        {
          if (localaqr.umN == localaqq.version)
          {
            w.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, draw.", new Object[] { Integer.valueOf(localaqr.umN), Integer.valueOf(localaqq.version) });
            if (localaqr.umP == 1)
            {
              GMTrace.o(20240972906496L, 150807);
              return true;
            }
            GMTrace.o(20240972906496L, 150807);
            return false;
          }
          w.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, localBuff wins.", new Object[] { Integer.valueOf(localaqr.umN), Integer.valueOf(localaqq.version) });
          if (localaqq.umL == 1)
          {
            GMTrace.o(20240972906496L, 150807);
            return true;
          }
          GMTrace.o(20240972906496L, 150807);
          return false;
        }
      }
      catch (Exception localException)
      {
        label438:
        w.printErrStackTrace("MicroMsg.GestureUtil", localException, "isUserSetWalletLock throw an exception.", new Object[0]);
        GMTrace.o(20240972906496L, 150807);
      }
    }
    w.i("MicroMsg.GestureUtil", "Info is valid but buf is invalid, we trust info this time.");
    if (localaqr.umP == 1)
    {
      GMTrace.o(20240972906496L, 150807);
      return true;
    }
    GMTrace.o(20240972906496L, 150807);
    return false;
    if (bool2)
    {
      w.i("MicroMsg.GestureUtil", "Info is invalid but buff is valid, we trust buff this time.");
      if (localaqq.umL == 1)
      {
        GMTrace.o(20240972906496L, 150807);
        return true;
      }
      GMTrace.o(20240972906496L, 150807);
      return false;
    }
    w.w("MicroMsg.GestureUtil", "Both buff & info are invalid, do not activate this time and wait for next sync.");
    GMTrace.o(20240972906496L, 150807);
    return false;
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */