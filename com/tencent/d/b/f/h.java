package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.tencent.d.a.a.a.b;
import com.tencent.d.a.a.a.d;
import com.tencent.d.b.e.c.a;
import com.tencent.d.b.e.c.b;
import com.tencent.d.b.e.f.a;
import com.tencent.d.b.e.f.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.security.SignatureException;
import junit.framework.Assert;

public final class h
  extends d
  implements a
{
  private int hJp = -1;
  public String sgP = null;
  private com.tencent.d.b.e.c xCM = null;
  com.tencent.d.b.e.f xCN = null;
  private WeakReference<Context> xCO = null;
  public com.tencent.d.b.c.a xCP = null;
  public com.tencent.d.b.c.b xCQ = null;
  public com.tencent.d.a.c.h xCR = null;
  private a xCS = null;
  public boolean xCT;
  public boolean xCU;
  public boolean xCV;
  private String xCe = null;
  
  public h(b paramb)
  {
    if ((Build.VERSION.SDK_INT < 23) && (Build.MANUFACTURER.equalsIgnoreCase("vivo")))
    {
      bool1 = true;
      this.xCT = bool1;
      if (Build.VERSION.SDK_INT >= 23) {
        break label121;
      }
    }
    label121:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.xCU = bool1;
      this.xCV = false;
      if (paramb != null) {
        break label126;
      }
      throw new IllegalArgumentException("param is null!");
      bool1 = false;
      break;
    }
    label126:
    this.hJp = paramb.hJp;
    this.xCM = paramb.xCr;
    this.xCN = paramb.xCs;
    this.xCO = new WeakReference(paramb.mContext);
    this.xCQ = paramb.xCt;
    this.xCP = paramb.lYV;
    this.sgP = paramb.sgP;
  }
  
  @SuppressLint({"NewApi"})
  public final void a(Signature paramSignature)
  {
    if (this.xCi)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: already finished. can not authenticate", new Object[0]);
      return;
    }
    Object localObject = (Context)this.xCO.get();
    if (localObject == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: context instance released in startAuthenticate", new Object[0]);
      b(new com.tencent.d.b.a.a(17));
      return;
    }
    for (;;)
    {
      try
      {
        com.tencent.d.a.c.c.v("Soter.TaskAuthentication", "soter: performing start", new Object[0]);
        localObject = com.tencent.d.a.a.a.hF((Context)localObject);
        a.d locald = new a.d(paramSignature);
        if (this.xCP != null)
        {
          paramSignature = this.xCP.xCa;
          ((com.tencent.d.a.a.a)localObject).a(locald, paramSignature, this.xCS);
          return;
        }
      }
      catch (Exception paramSignature)
      {
        localObject = paramSignature.getMessage();
        com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: caused exception when authenticating: %s", new Object[] { localObject });
        com.tencent.d.a.c.c.a("Soter.TaskAuthentication", paramSignature, "soter: caused exception when authenticating");
        b(new com.tencent.d.b.a.a(20, String.format("start authentication failed due to %s", new Object[] { localObject })));
        return;
      }
      paramSignature = null;
    }
  }
  
  public final void cmB()
  {
    com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: called from cancellation signal", new Object[0]);
    if (this.xCS != null) {
      this.xCS.aza();
    }
  }
  
  @SuppressLint({"DefaultLocale", "NewApi"})
  final boolean cmC()
  {
    if (!com.tencent.d.b.b.a.cmt().isInit())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.d.b.a.a(14));
      return true;
    }
    if (!com.tencent.d.b.b.a.cmt().cms())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: not support soter", new Object[0]);
      b(new com.tencent.d.b.a.a(2));
      return true;
    }
    if (Build.VERSION.SDK_INT >= 16) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.xCe = ((String)com.tencent.d.b.b.a.cmt().cmv().get(this.hJp, ""));
      if (!com.tencent.d.a.c.f.mZ(this.xCe)) {
        break;
      }
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
      b(new com.tencent.d.b.a.a(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.hJp) })));
      return true;
    }
    if (!com.tencent.d.a.a.cml())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: app secure key not exists. need re-generate", new Object[0]);
      b(new com.tencent.d.b.a.a(3));
      return true;
    }
    if (!com.tencent.d.a.a.Xx(this.xCe))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: auth key %s not exists. need re-generate", new Object[] { this.xCe });
      b(new com.tencent.d.b.a.a(12, String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", new Object[] { Integer.valueOf(this.hJp) })));
      return true;
    }
    if (!com.tencent.d.a.a.Xy(this.xCe))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: auth key %s has already expired, and we've already deleted them. need re-generate", new Object[] { this.xCe });
      b(new com.tencent.d.b.a.a(11, String.format("the auth key to scene %d has already been expired. in Android versions above 6.0, a key would be expired when user enrolls a new fingerprint. please prepare the key again", new Object[] { Integer.valueOf(this.hJp) })));
      return true;
    }
    if ((this.xCM == null) && (com.tencent.d.a.c.f.mZ(this.sgP)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: challenge wrapper is null!", new Object[0]);
      b(new com.tencent.d.b.a.a(16, "neither get challenge wrapper nor challenge str is found in request parameter"));
      return true;
    }
    Context localContext = (Context)this.xCO.get();
    if (localContext == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: context instance released in preExecute", new Object[0]);
      b(new com.tencent.d.b.a.a(17));
      return true;
    }
    if (!com.tencent.d.a.a.a.hF(localContext).hasEnrolledFingerprints())
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: user has not enrolled any fingerprint in system.", new Object[0]);
      b(new com.tencent.d.b.a.a(18));
      return true;
    }
    if (com.tencent.d.a.a.hE(localContext))
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: fingerprint sensor frozen", new Object[0]);
      b(new com.tencent.d.b.a.a(25, "Too many failed times"));
      return true;
    }
    if (this.xCP == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new Object[0]);
      this.xCP = new com.tencent.d.b.c.a();
      return false;
    }
    if (this.xCN == null) {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new Object[0]);
    }
    return false;
  }
  
  final void cmD()
  {
    if (this.xCP != null) {
      this.xCP.mO(true);
    }
  }
  
  public final void cmH()
  {
    Signature localSignature = com.tencent.d.a.a.XA(this.xCe);
    if (localSignature == null)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: error occurred when init sign", new Object[0]);
      b(new com.tencent.d.b.a.a(13));
      return;
    }
    this.xCS = new a(localSignature);
    a(localSignature);
    g.cmG().u(new Runnable()
    {
      public final void run()
      {
        if (h.this.xCQ != null) {
          h.this.xCQ.ayY();
        }
      }
    });
  }
  
  final void execute()
  {
    if (com.tencent.d.a.c.f.mZ(this.sgP))
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: not provide the challenge. we will do the job", new Object[0]);
      this.xCM.aW(new c.a());
      this.xCM.a(new com.tencent.d.b.e.b() {});
      this.xCM.execute();
      return;
    }
    com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: already provided the challenge. directly authenticate", new Object[0]);
    cmH();
  }
  
  public final boolean isCancelled()
  {
    return this.xCV;
  }
  
  private final class a
    extends a.b
  {
    public Signature xCX = null;
    
    public a(Signature paramSignature)
    {
      this.xCX = paramSignature;
    }
    
    public static String V(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {
        return "unknown error";
      }
      return paramCharSequence.toString();
    }
    
    @SuppressLint({"NewApi"})
    private void cmI()
    {
      if (h.this.xCU)
      {
        h.this.xCP.mO(false);
        h.this.xCV = true;
      }
    }
    
    public final void aza()
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: called onAuthenticationCancelled", new Object[0]);
      if (h.this.xCV)
      {
        com.tencent.d.a.c.c.v("Soter.TaskAuthentication", "soter: during ignore cancel period", new Object[0]);
        return;
      }
      super.aza();
      g.cmG().u(new Runnable()
      {
        public final void run()
        {
          if (h.this.xCQ != null) {
            h.this.xCQ.aza();
          }
        }
      });
      h.this.b(new com.tencent.d.b.a.a(24, "user cancelled authentication"));
      cmI();
    }
    
    public final void boK()
    {
      com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: authentication succeed. start sign and upload upload signature", new Object[0]);
      g.cmG().x(new Runnable()
      {
        public final void run()
        {
          if (!com.tencent.d.a.c.f.mZ(h.this.sgP))
          {
            try
            {
              h.a.this.xCX.update(h.this.sgP.getBytes());
              h localh = h.this;
              Signature localSignature = h.a.this.xCX;
              try
              {
                localh.xCR = com.tencent.d.a.a.bF(localSignature.sign());
                if (localh.xCN != null)
                {
                  if (localh.xCR == null)
                  {
                    localh.b(new com.tencent.d.b.a.a(22, "sign failed even after user authenticated the key."));
                    return;
                  }
                  localh.xCN.aW(new f.a(localh.xCR.signature, localh.xCR.xBV, localh.xCR.xBU));
                  localh.xCN.a(new h.3(localh));
                  localh.xCN.execute();
                  return;
                }
              }
              catch (SignatureException localSignatureException2)
              {
                com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: sign failed due to exception: %s", new Object[] { localSignatureException2.getMessage() });
                com.tencent.d.a.c.c.a("Soter.TaskAuthentication", localSignatureException2, "soter: sign failed due to exception");
                localh.b(new com.tencent.d.b.a.a(22, "sign failed even after user authenticated the key."));
                return;
              }
              com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: no upload wrapper, return directly", new Object[0]);
            }
            catch (SignatureException localSignatureException1)
            {
              com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: exception in update", new Object[0]);
              com.tencent.d.a.c.c.a("Soter.TaskAuthentication", localSignatureException1, "soter: exception in update");
              h.a.this.onAuthenticationError(64536, "update signature failed");
              return;
            }
            localSignatureException1.b(new com.tencent.d.b.a.a(localSignatureException1.xCR));
            return;
          }
          com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: challenge is null. should not happen here", new Object[0]);
          h.a.this.onAuthenticationError(64536, "challenge is null");
        }
      });
      g.cmG().u(new Runnable()
      {
        public final void run()
        {
          if (h.this.xCQ != null) {
            h.this.xCQ.ayZ();
          }
        }
      });
      cmI();
    }
    
    public final void onAuthenticationError(final int paramInt, final CharSequence paramCharSequence)
    {
      com.tencent.d.a.c.c.e("Soter.TaskAuthentication", "soter: on authentication fatal error: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
      if (paramInt != 10308)
      {
        g.cmG().u(new Runnable()
        {
          public final void run()
          {
            if (h.this.xCQ != null) {
              h.this.xCQ.onAuthenticationError(paramInt, paramCharSequence);
            }
          }
        });
        h.this.b(new com.tencent.d.b.a.a(21, V(paramCharSequence)));
      }
      for (;;)
      {
        cmI();
        return;
        h.this.b(new com.tencent.d.b.a.a(25, V(paramCharSequence)));
      }
    }
    
    public final void onAuthenticationFailed()
    {
      super.onAuthenticationFailed();
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: authentication failed once", new Object[0]);
      g.cmG().u(new Runnable()
      {
        public final void run()
        {
          if (h.this.xCQ != null) {
            h.this.xCQ.onAuthenticationFailed();
          }
        }
      });
      if (h.this.xCT)
      {
        com.tencent.d.a.c.c.i("Soter.TaskAuthentication", "soter: should compat lower android version logic.", new Object[0]);
        h.this.xCP.mO(false);
        g.cmG().x(new Runnable()
        {
          public final void run()
          {
            h.this.xCP.cmy();
          }
        });
        g.cmG().k(new Runnable()
        {
          public final void run()
          {
            h.this.a(h.a.this.xCX);
          }
        }, 1000L);
      }
    }
    
    public final void onAuthenticationHelp(final int paramInt, final CharSequence paramCharSequence)
    {
      com.tencent.d.a.c.c.w("Soter.TaskAuthentication", "soter: on authentication help. you do not need to cancel the authentication: %d, %s", new Object[] { Integer.valueOf(paramInt), paramCharSequence });
      g.cmG().u(new Runnable()
      {
        public final void run()
        {
          if (h.this.xCQ != null) {
            h.this.xCQ.onAuthenticationHelp(paramInt, h.a.V(paramCharSequence));
          }
        }
      });
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */