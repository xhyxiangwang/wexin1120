package com.tencent.mm.plugin.shake.d.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.shake.d.b.a;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.bbk;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.io.File;
import java.io.IOException;

public final class i
{
  public static aol a(byte[] paramArrayOfByte, long paramLong)
  {
    GMTrace.i(6608344055808L, 49236);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      GMTrace.o(6608344055808L, 49236);
      return null;
    }
    try
    {
      paramArrayOfByte = (bbk)new bbk().aC(paramArrayOfByte);
      aol localaol = new aol();
      localaol.ukd = 4;
      localaol.tIh = String.valueOf(paramArrayOfByte.utH);
      localaol.uke = paramArrayOfByte.uke;
      localaol.ukh = n.b(paramArrayOfByte.tXO);
      localaol.uki = n.b(paramArrayOfByte.tXP);
      localaol.ukn = a.DS(localaol.uki);
      localaol.tyZ = paramArrayOfByte.tyZ;
      localaol.ukm = n.b(paramArrayOfByte.tXN);
      localaol.ukf = n.b(paramArrayOfByte.utI);
      localaol.ukg = n.b(paramArrayOfByte.utJ);
      localaol.ukl = n.b(paramArrayOfByte.utM);
      localaol.ukj = n.b(paramArrayOfByte.utK);
      localaol.ukk = n.b(paramArrayOfByte.utL);
      localaol.pYI = paramLong;
      GMTrace.o(6608344055808L, 49236);
      return localaol;
    }
    catch (Exception paramArrayOfByte)
    {
      w.printErrStackTrace("MicroMsg.ShakeMusicLogic", paramArrayOfByte, "", new Object[0]);
      w.w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
      GMTrace.o(6608344055808L, 49236);
    }
    return null;
  }
  
  public static String bdZ()
  {
    GMTrace.i(6608209838080L, 49235);
    if (!ap.AV())
    {
      w.w("MicroMsg.ShakeMusicLogic", "getSaveDirPath: acc stg has not set uin");
      GMTrace.o(6608209838080L, 49235);
      return null;
    }
    Object localObject = new StringBuilder();
    ap.AS();
    localObject = new File(c.zp() + "shakemusic/");
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      w.w("MicroMsg.ShakeMusicLogic", "storage dir[%s] not perpare, try to create it", new Object[] { ((File)localObject).getAbsolutePath() });
      ((File)localObject).mkdir();
    }
    File localFile = new File((File)localObject, ".nomedia");
    if (!localFile.exists()) {
      w.w("MicroMsg.ShakeMusicLogic", "no media file[%s] not exists, try to create it", new Object[] { ((File)localObject).getAbsolutePath() });
    }
    try
    {
      localFile.createNewFile();
      if (!((File)localObject).exists())
      {
        w.w("MicroMsg.ShakeMusicLogic", "create storage dir fail");
        GMTrace.o(6608209838080L, 49235);
        return null;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ShakeMusicLogic", localIOException, "", new Object[0]);
      }
      localObject = ((File)localObject).getAbsolutePath() + "/";
      GMTrace.o(6608209838080L, 49235);
    }
    return (String)localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */