package com.tencent.d.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.Build.VERSION;
import com.tencent.d.a.c.c;
import com.tencent.d.a.c.f;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@SuppressLint({"NewApi"})
final class b
{
  static int d(Context paramContext, String paramString)
  {
    if (paramContext == null)
    {
      c.e("Soter.FingerprintManagerCompatApi23", "soter: check self permission: context is null", new Object[0]);
      return -1;
    }
    if (f.mZ(paramString))
    {
      c.e("Soter.FingerprintManagerCompatApi23", "soter: requested permission is null or nil", new Object[0]);
      return -1;
    }
    if (Build.VERSION.SDK_INT < 23)
    {
      c.d("Soter.FingerprintManagerCompatApi23", "soter: below 23. directly return.", new Object[0]);
      return 0;
    }
    return paramContext.checkSelfPermission(paramString);
  }
  
  public static boolean hG(Context paramContext)
  {
    if (d(paramContext, "android.permission.USE_FINGERPRINT") != 0)
    {
      c.e("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: hasEnrolledFingerprints", new Object[0]);
      return false;
    }
    try
    {
      paramContext = hI(paramContext);
      if (paramContext != null) {
        return paramContext.hasEnrolledFingerprints();
      }
      c.e("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in hasEnrolledFingerprints! Should never happen", new Object[0]);
      return false;
    }
    catch (SecurityException paramContext)
    {
      c.e("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in hasEnrolledFingerprints! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
    }
    return false;
  }
  
  public static boolean hH(Context paramContext)
  {
    if (d(paramContext, "android.permission.USE_FINGERPRINT") != 0)
    {
      c.e("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: isHardwareDetected", new Object[0]);
      return false;
    }
    try
    {
      paramContext = hI(paramContext);
      if (paramContext != null) {
        return paramContext.isHardwareDetected();
      }
      c.e("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in isHardwareDetected! Should never happen", new Object[0]);
      return false;
    }
    catch (SecurityException paramContext)
    {
      c.e("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
    }
    return false;
  }
  
  static FingerprintManager hI(Context paramContext)
  {
    return (FingerprintManager)paramContext.getSystemService("fingerprint");
  }
  
  public static abstract class a
  {
    public void a(b.b paramb) {}
    
    public void onAuthenticationError(int paramInt, CharSequence paramCharSequence) {}
    
    public void onAuthenticationFailed() {}
    
    public void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence) {}
  }
  
  public static final class b
  {
    b.c xBm;
    
    public b(b.c paramc)
    {
      this.xBm = paramc;
    }
  }
  
  public static final class c
  {
    final Signature xBi;
    final Cipher xBj;
    final Mac xBk;
    
    public c(Signature paramSignature)
    {
      this.xBi = paramSignature;
      this.xBj = null;
      this.xBk = null;
    }
    
    public c(Cipher paramCipher)
    {
      this.xBj = paramCipher;
      this.xBi = null;
      this.xBk = null;
    }
    
    public c(Mac paramMac)
    {
      this.xBk = paramMac;
      this.xBj = null;
      this.xBi = null;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */