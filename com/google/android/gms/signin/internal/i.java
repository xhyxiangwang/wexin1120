package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.api.c.d;
import com.google.android.gms.common.api.c.d.a;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.k.f;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.d;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class i
  extends k<f>
  implements d
{
  private final h aic;
  private final com.google.android.gms.signin.e akV;
  private Integer akW;
  private final boolean axT;
  private final ExecutorService axU;
  
  public i(Context paramContext, Looper paramLooper, boolean paramBoolean, h paramh, c.b paramb, c.c paramc, ExecutorService paramExecutorService)
  {
    super(paramContext, paramLooper, 44, paramh, paramb, paramc);
    this.axT = paramBoolean;
    this.aic = paramh;
    this.akV = paramh.akV;
    this.akW = paramh.akW;
    this.axU = paramExecutorService;
  }
  
  public final void a(p paramp, Set<Scope> paramSet, e parame)
  {
    w.h(parame, "Expecting a valid ISignInCallbacks");
    try
    {
      ((f)kz()).a(new AuthAccountRequest(paramp, paramSet), parame);
      return;
    }
    catch (RemoteException paramp)
    {
      try
      {
        parame.a(new ConnectionResult(8, null), new AuthAccountResult());
        return;
      }
      catch (RemoteException paramp)
      {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
      }
    }
  }
  
  public final void a(p paramp, boolean paramBoolean)
  {
    try
    {
      ((f)kz()).a(paramp, this.akW.intValue(), paramBoolean);
      return;
    }
    catch (RemoteException paramp) {}
  }
  
  public final void a(t paramt)
  {
    w.h(paramt, "Expecting a valid IResolveAccountCallbacks");
    try
    {
      Object localObject = this.aic;
      if (((h)localObject).afD != null) {}
      for (localObject = ((h)localObject).afD;; localObject = new Account("<<default account>>", "com.google"))
      {
        ((f)kz()).a(new ResolveAccountRequest((Account)localObject, this.akW.intValue()), paramt);
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        paramt.a(new ResolveAccountResponse());
        return;
      }
      catch (RemoteException paramt)
      {
        Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
      }
    }
  }
  
  public final void connect()
  {
    a(new k.f(this));
  }
  
  public final boolean jL()
  {
    return this.axT;
  }
  
  protected final String jN()
  {
    return "com.google.android.gms.signin.service.START";
  }
  
  protected final String jO()
  {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  protected final Bundle ky()
  {
    Object localObject = this.akV;
    Integer localInteger = this.aic.akW;
    ExecutorService localExecutorService = this.axU;
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((com.google.android.gms.signin.e)localObject).ayk);
    localBundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((com.google.android.gms.signin.e)localObject).ayl);
    localBundle.putString("com.google.android.gms.signin.internal.serverClientId", ((com.google.android.gms.signin.e)localObject).agB);
    if (((com.google.android.gms.signin.e)localObject).aym != null) {
      localBundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper(new a((com.google.android.gms.signin.e)localObject, localExecutorService).asBinder()));
    }
    if (localInteger != null) {
      localBundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", localInteger.intValue());
    }
    localObject = this.aic.ahb;
    if (!this.mContext.getPackageName().equals(localObject)) {
      localBundle.putString("com.google.android.gms.signin.internal.realClientPackageName", this.aic.ahb);
    }
    return localBundle;
  }
  
  public final void mj()
  {
    try
    {
      ((f)kz()).cy(this.akW.intValue());
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  private static final class a
    extends d.a
  {
    private final com.google.android.gms.signin.e akV;
    private final ExecutorService axU;
    
    public a(com.google.android.gms.signin.e parame, ExecutorService paramExecutorService)
    {
      this.akV = parame;
      this.axU = paramExecutorService;
    }
    
    public final void a(final String paramString1, final String paramString2, final f paramf)
    {
      this.axU.submit(new Runnable()
      {
        public final void run()
        {
          try
          {
            boolean bool = i.a.a(i.a.this).jU();
            paramf.ah(bool);
            return;
          }
          catch (RemoteException localRemoteException) {}
        }
      });
    }
    
    public final void a(final String paramString, final List<Scope> paramList, final f paramf)
    {
      this.axU.submit(new Runnable()
      {
        public final void run()
        {
          try
          {
            Object localObject = i.a.a(i.a.this);
            Collections.unmodifiableSet(new HashSet(paramList));
            localObject = ((c.d)localObject).jT();
            localObject = new CheckServerAuthResult(((c.d.a)localObject).ahr, ((c.d.a)localObject).ahs);
            paramf.a((CheckServerAuthResult)localObject);
            return;
          }
          catch (RemoteException localRemoteException) {}
        }
      });
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/signin/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */