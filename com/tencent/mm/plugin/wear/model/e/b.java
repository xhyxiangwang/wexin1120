package com.tencent.mm.plugin.wear.model.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;

public final class b
  extends a
{
  private byte[] aHb;
  private byte[] sik;
  private byte[] sil;
  
  public b()
  {
    GMTrace.i(9197135593472L, 68524);
    GMTrace.o(9197135593472L, 68524);
  }
  
  private void bzE()
  {
    GMTrace.i(9197269811200L, 68525);
    File localFile3 = new File(com.tencent.mm.compatible.util.e.gZQ, "wear/key");
    if (!localFile3.exists()) {
      localFile3.mkdirs();
    }
    File localFile1 = new File(localFile3, "private.key");
    File localFile2 = new File(localFile3, "public.key");
    localFile3 = new File(localFile3, "session.key");
    if ((!localFile1.exists()) || (!localFile2.exists()) || (!localFile3.exists()))
    {
      w.i("MicroMsg.Wear.HttpAuthServer", "recreate keys");
      localFile1.delete();
      localFile2.delete();
      localFile3.delete();
      Object localObject1 = KeyPairGenerator.getInstance("RSA");
      ((KeyPairGenerator)localObject1).initialize(1024);
      Object localObject2 = ((KeyPairGenerator)localObject1).generateKeyPair();
      localObject1 = (RSAPublicKey)((KeyPair)localObject2).getPublic();
      RSAPrivateKey localRSAPrivateKey = (RSAPrivateKey)((KeyPair)localObject2).getPrivate();
      localObject2 = new HashMap(2);
      ((HashMap)localObject2).put("RSAPublicKey", localObject1);
      ((HashMap)localObject2).put("RSAPrivateKey", localRSAPrivateKey);
      localObject1 = (RSAPrivateKey)((HashMap)localObject2).get("RSAPrivateKey");
      this.sil = ((RSAPublicKey)((HashMap)localObject2).get("RSAPublicKey")).getEncoded();
      this.sik = ((RSAPrivateKey)localObject1).getEncoded();
      this.aHb = com.tencent.mm.plugin.wear.a.a.bzG();
      com.tencent.mm.a.e.b(localFile1.getAbsolutePath(), this.sik, this.sik.length);
      com.tencent.mm.a.e.b(localFile2.getAbsolutePath(), this.sil, this.sil.length);
      com.tencent.mm.a.e.b(localFile3.getAbsolutePath(), this.aHb, this.aHb.length);
    }
    for (;;)
    {
      w.i("MicroMsg.Wear.HttpAuthServer", "publicKey=%s privateKey=%s sessionKey=%s", new Object[] { aa.bm(this.sil), aa.bm(this.sik), aa.bm(this.aHb) });
      GMTrace.o(9197269811200L, 68525);
      return;
      w.i("MicroMsg.Wear.HttpAuthServer", "use old keys");
      this.sil = com.tencent.mm.a.e.d(localFile2.getAbsolutePath(), 0, Integer.MAX_VALUE);
      this.sik = com.tencent.mm.a.e.d(localFile1.getAbsolutePath(), 0, Integer.MAX_VALUE);
      this.aHb = com.tencent.mm.a.e.d(localFile3.getAbsolutePath(), 0, Integer.MAX_VALUE);
    }
  }
  
  public final List<Integer> bzC()
  {
    GMTrace.i(9197404028928L, 68526);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(10001));
    localArrayList.add(Integer.valueOf(10002));
    GMTrace.o(9197404028928L, 68526);
    return localArrayList;
  }
  
  protected final byte[] l(int paramInt, byte[] paramArrayOfByte)
  {
    boolean bool3 = true;
    GMTrace.i(9197538246656L, 68527);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(9197538246656L, 68527);
      return null;
      w.i("MicroMsg.Wear.HttpAuthServer", "request public key");
      if ((this.sil == null) || (this.sik == null) || (this.aHb == null)) {
        w.i("MicroMsg.Wear.HttpAuthServer", "try to reload all key");
      }
      try
      {
        bzE();
        if (this.sil != null)
        {
          bool1 = true;
          if (this.sik == null) {
            break label181;
          }
          bool2 = true;
          if (this.aHb == null) {
            break label187;
          }
          w.i("MicroMsg.Wear.HttpAuthServer", "publicKey %s privateKey %s sessionKey %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
          paramArrayOfByte = this.sil;
          GMTrace.o(9197538246656L, 68527);
          return paramArrayOfByte;
        }
      }
      catch (Exception paramArrayOfByte)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", paramArrayOfByte, "loadAllKey", new Object[0]);
          continue;
          boolean bool1 = false;
          continue;
          label181:
          boolean bool2 = false;
          continue;
          label187:
          bool3 = false;
        }
      }
      try
      {
        Object localObject2 = new PKCS8EncodedKeySpec(this.sik);
        Object localObject1 = KeyFactory.getInstance("RSA");
        localObject2 = ((KeyFactory)localObject1).generatePrivate((KeySpec)localObject2);
        localObject1 = Cipher.getInstance(((KeyFactory)localObject1).getAlgorithm());
        ((Cipher)localObject1).init(2, (Key)localObject2);
        paramArrayOfByte = ((Cipher)localObject1).doFinal(paramArrayOfByte);
        localObject1 = com.tencent.mm.plugin.wear.a.a.f(this.aHb, paramArrayOfByte);
        w.i("MicroMsg.Wear.HttpAuthServer", "funid %d, randomKey=%s", new Object[] { Integer.valueOf(paramInt), aa.bm(paramArrayOfByte) });
        GMTrace.o(9197538246656L, 68527);
        return (byte[])localObject1;
      }
      catch (Exception paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", paramArrayOfByte, "sessionKey resp error", new Object[0]);
      }
    }
  }
  
  public final byte[] wS()
  {
    boolean bool3 = true;
    GMTrace.i(9197001375744L, 68523);
    if ((this.sil == null) || (this.sik == null) || (this.aHb == null)) {
      w.i("MicroMsg.Wear.HttpAuthServer", "try to reload all key");
    }
    try
    {
      bzE();
      if (this.sil != null)
      {
        bool1 = true;
        if (this.sik == null) {
          break label139;
        }
        bool2 = true;
        if (this.aHb == null) {
          break label144;
        }
        w.i("MicroMsg.Wear.HttpAuthServer", "publicKey %s privateKey %s sessionKey %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        byte[] arrayOfByte = this.aHb;
        GMTrace.o(9197001375744L, 68523);
        return arrayOfByte;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.Wear.HttpAuthServer", localException, "loadAllKey", new Object[0]);
        continue;
        boolean bool1 = false;
        continue;
        label139:
        boolean bool2 = false;
        continue;
        label144:
        bool3 = false;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */