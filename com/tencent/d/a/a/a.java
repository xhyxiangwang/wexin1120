package com.tencent.d.a.a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class a
{
  static final e xBe = new f();
  private Context mContext;
  
  static
  {
    if (com.tencent.d.a.a.cmi())
    {
      xBe = new a();
      return;
    }
  }
  
  private a(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public static a hF(Context paramContext)
  {
    return new a(paramContext);
  }
  
  public final void a(d paramd, CancellationSignal paramCancellationSignal, b paramb)
  {
    xBe.a(this.mContext, paramd, 0, paramCancellationSignal, paramb, null);
  }
  
  public final boolean hasEnrolledFingerprints()
  {
    return xBe.hG(this.mContext);
  }
  
  public final boolean isHardwareDetected()
  {
    return xBe.hH(this.mContext);
  }
  
  private static final class a
    implements a.e
  {
    public static void a(b.a parama)
    {
      com.tencent.d.a.c.c.w("Soter.FingerprintManagerCompat", "soter: too many fail fingerprint callback. inform it.", new Object[0]);
      parama.onAuthenticationError(10308, "Too many failed times");
    }
    
    public static boolean a(b.a parama, Context paramContext)
    {
      if (c.cmo()) {
        com.tencent.d.a.c.c.v("Soter.FingerprintManagerCompat", "soter: using system anti brute force strategy", new Object[0]);
      }
      do
      {
        return false;
        if (!c.hM(paramContext)) {
          break;
        }
      } while (c.hN(paramContext));
      com.tencent.d.a.c.c.v("Soter.FingerprintManagerCompat", "soter: unfreeze former frozen status", new Object[0]);
      c.hL(paramContext);
      return false;
      if (c.hN(paramContext))
      {
        com.tencent.d.a.c.c.v("Soter.FingerprintManagerCompat", "soter: failure time available", new Object[0]);
        return false;
      }
      a(parama);
      return true;
    }
    
    public final void a(final Context paramContext, a.d paramd, int paramInt, CancellationSignal paramCancellationSignal, a.b paramb, Handler paramHandler)
    {
      if (paramd != null) {
        if (paramd.xBj != null) {
          paramd = new b.c(paramd.xBj);
        }
      }
      for (;;)
      {
        paramb = new b.a()
        {
          private boolean xBf = false;
          
          public final void a(b.b paramAnonymousb)
          {
            com.tencent.d.a.c.c.d("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationSucceeded", new Object[0]);
            if (this.xBf) {}
            while (a.a.a(this, paramContext)) {
              return;
            }
            if (!c.cmo()) {
              c.hL(paramContext);
            }
            this.xBf = true;
            a.b localb = this.xBg;
            paramAnonymousb = paramAnonymousb.xBm;
            if (paramAnonymousb != null) {
              if (paramAnonymousb.xBj != null) {
                paramAnonymousb = new a.d(paramAnonymousb.xBj);
              }
            }
            for (;;)
            {
              new a.c(paramAnonymousb);
              localb.boK();
              return;
              if (paramAnonymousb.xBi != null) {
                paramAnonymousb = new a.d(paramAnonymousb.xBi);
              } else if (paramAnonymousb.xBk != null) {
                paramAnonymousb = new a.d(paramAnonymousb.xBk);
              } else {
                paramAnonymousb = null;
              }
            }
          }
          
          public final void onAuthenticationError(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
          {
            for (;;)
            {
              com.tencent.d.a.c.c.d("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationError", new Object[0]);
              if (this.xBf) {
                return;
              }
              this.xBf = true;
              if (paramAnonymousInt == 5)
              {
                com.tencent.d.a.c.c.i("Soter.FingerprintManagerCompat", "soter: user cancelled fingerprint authen", new Object[0]);
                this.xBg.aza();
                return;
              }
              if (paramAnonymousInt != 7) {
                break;
              }
              com.tencent.d.a.c.c.i("Soter.FingerprintManagerCompat", "soter: system call too many trial.", new Object[0]);
              if ((!c.hN(paramContext)) && (!c.hM(paramContext)) && (!c.cmo())) {
                c.hK(paramContext);
              }
              this.xBf = false;
              paramAnonymousInt = 10308;
              paramAnonymousCharSequence = "Too many failed times";
            }
            this.xBg.onAuthenticationError(paramAnonymousInt, paramAnonymousCharSequence);
          }
          
          public final void onAuthenticationFailed()
          {
            com.tencent.d.a.c.c.d("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationFailed", new Object[0]);
            if (this.xBf) {}
            while (a.a.a(this, paramContext)) {
              return;
            }
            if (!c.cmo())
            {
              Context localContext = paramContext;
              c.an(localContext, Integer.valueOf(Integer.valueOf(c.hJ(localContext)).intValue() + 1).intValue());
              if (!c.hN(paramContext))
              {
                com.tencent.d.a.c.c.w("Soter.FingerprintManagerCompat", "soter: too many fail trials", new Object[0]);
                c.hK(paramContext);
                a.a.a(this);
                return;
              }
            }
            this.xBg.onAuthenticationFailed();
          }
          
          public final void onAuthenticationHelp(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
          {
            com.tencent.d.a.c.c.d("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationHelp", new Object[0]);
            if (this.xBf) {}
            while (a.a.a(this, paramContext)) {
              return;
            }
            this.xBg.onAuthenticationHelp(paramAnonymousInt, paramAnonymousCharSequence);
          }
        };
        if (b.d(paramContext, "android.permission.USE_FINGERPRINT") == 0) {
          break;
        }
        com.tencent.d.a.c.c.e("Soter.FingerprintManagerCompatApi23", "soter: permission check failed: authenticate", new Object[0]);
        return;
        if (paramd.xBi != null) {
          paramd = new b.c(paramd.xBi);
        } else if (paramd.xBk != null) {
          paramd = new b.c(paramd.xBk);
        } else {
          paramd = null;
        }
      }
      for (;;)
      {
        try
        {
          paramHandler = b.hI(paramContext);
          if (paramHandler == null) {
            break label219;
          }
          if (paramd == null) {
            break label231;
          }
          if (paramd.xBj != null)
          {
            paramContext = new FingerprintManager.CryptoObject(paramd.xBj);
            paramHandler.authenticate(paramContext, (CancellationSignal)paramCancellationSignal, 0, new b.1(paramb), null);
            return;
          }
        }
        catch (SecurityException paramContext)
        {
          com.tencent.d.a.c.c.e("Soter.FingerprintManagerCompatApi23", "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
          return;
        }
        if (paramd.xBi != null)
        {
          paramContext = new FingerprintManager.CryptoObject(paramd.xBi);
        }
        else if (paramd.xBk != null)
        {
          paramContext = new FingerprintManager.CryptoObject(paramd.xBk);
          continue;
          label219:
          com.tencent.d.a.c.c.e("Soter.FingerprintManagerCompatApi23", "soter: fingerprint manager is null in authenticate! Should never happen", new Object[0]);
        }
        else
        {
          label231:
          paramContext = null;
        }
      }
    }
    
    public final boolean hG(Context paramContext)
    {
      return b.hG(paramContext);
    }
    
    public final boolean hH(Context paramContext)
    {
      return b.hH(paramContext);
    }
  }
  
  public static abstract class b
  {
    public void aza() {}
    
    public void boK() {}
    
    public void onAuthenticationError(int paramInt, CharSequence paramCharSequence) {}
    
    public void onAuthenticationFailed() {}
    
    public void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence) {}
  }
  
  public static final class c
  {
    private a.d xBh;
    
    public c(a.d paramd)
    {
      this.xBh = paramd;
    }
  }
  
  public static final class d
  {
    final Signature xBi;
    final Cipher xBj;
    final Mac xBk;
    
    public d(Signature paramSignature)
    {
      this.xBi = paramSignature;
      this.xBj = null;
      this.xBk = null;
    }
    
    public d(Cipher paramCipher)
    {
      this.xBj = paramCipher;
      this.xBi = null;
      this.xBk = null;
    }
    
    public d(Mac paramMac)
    {
      this.xBk = paramMac;
      this.xBj = null;
      this.xBi = null;
    }
  }
  
  private static abstract interface e
  {
    public abstract void a(Context paramContext, a.d paramd, int paramInt, CancellationSignal paramCancellationSignal, a.b paramb, Handler paramHandler);
    
    public abstract boolean hG(Context paramContext);
    
    public abstract boolean hH(Context paramContext);
  }
  
  private static final class f
    implements a.e
  {
    public final void a(Context paramContext, a.d paramd, int paramInt, CancellationSignal paramCancellationSignal, a.b paramb, Handler paramHandler) {}
    
    public final boolean hG(Context paramContext)
    {
      return false;
    }
    
    public final boolean hH(Context paramContext)
    {
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */