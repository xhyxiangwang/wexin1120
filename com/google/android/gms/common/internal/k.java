package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.api.c.e;
import com.google.android.gms.common.b;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class k<T extends IInterface>
  implements a.b, l.a
{
  public static final String[] alm = { "service_esmobile", "service_googleme" };
  private final Account afD;
  private final Looper ahj;
  private final b ahk;
  public final Set<Scope> ahs;
  private final h aic;
  private final m ala;
  private final Object alb = new Object();
  public s alc;
  public c.e ald;
  private T ale;
  public final ArrayList<k<T>.c<?>> alf = new ArrayList();
  private k<T>.e alg;
  private int alh = 1;
  public final c.b ali;
  public final c.c alj;
  private final int alk;
  protected AtomicInteger all = new AtomicInteger(0);
  public final Context mContext;
  final Handler mHandler;
  
  public k(Context paramContext, Looper paramLooper, int paramInt, h paramh, c.b paramb, c.c paramc)
  {
    this(paramContext, paramLooper, m.C(paramContext), b.jH(), paramInt, paramh, (c.b)w.aa(paramb), (c.c)w.aa(paramc));
  }
  
  private k(Context paramContext, Looper paramLooper, m paramm, b paramb, int paramInt, h paramh, c.b paramb1, c.c paramc)
  {
    this.mContext = ((Context)w.h(paramContext, "Context must not be null"));
    this.ahj = ((Looper)w.h(paramLooper, "Looper must not be null"));
    this.ala = ((m)w.h(paramm, "Supervisor must not be null"));
    this.ahk = ((b)w.h(paramb, "API availability must not be null"));
    this.mHandler = new b(paramLooper);
    this.alk = paramInt;
    this.aic = ((h)w.aa(paramh));
    this.afD = paramh.afD;
    this.ahs = a(paramh.akT);
    this.ali = paramb1;
    this.alj = paramc;
  }
  
  private static Set<Scope> a(Set<Scope> paramSet)
  {
    if (paramSet == null) {}
    Iterator localIterator;
    do
    {
      while (!localIterator.hasNext())
      {
        return paramSet;
        localIterator = paramSet.iterator();
      }
    } while (paramSet.contains((Scope)localIterator.next()));
    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
  }
  
  protected static void kv() {}
  
  protected static void kw() {}
  
  private void kx()
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(4, this.all.get(), 1));
  }
  
  public void a(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramInt2, -1, new g(paramInt1, paramIBinder, paramBundle)));
  }
  
  public final void a(int paramInt, T paramT)
  {
    boolean bool = true;
    int i;
    int j;
    if (paramInt == 3)
    {
      i = 1;
      if (paramT == null) {
        break label313;
      }
      j = 1;
      label17:
      if (i != j) {
        break label319;
      }
    }
    for (;;)
    {
      w.af(bool);
      for (;;)
      {
        synchronized (this.alb)
        {
          this.alh = paramInt;
          this.ale = paramT;
          switch (paramInt)
          {
          case 3: 
            return;
          case 2: 
            if (this.alg != null)
            {
              new StringBuilder("Calling connect() while still connected, missing disconnect() for ").append(jN()).append(" on ").append(ku());
              this.ala.b(jN(), ku(), this.alg, this.aic.ahc);
              this.all.incrementAndGet();
            }
            this.alg = new e(this.all.get());
            if (this.ala.a(jN(), ku(), this.alg, this.aic.ahc)) {
              continue;
            }
            new StringBuilder("unable to connect to service: ").append(jN()).append(" on ").append(ku());
            this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.all.get(), 9));
          }
        }
        if (this.alg != null)
        {
          this.ala.b(jN(), ku(), this.alg, this.aic.ahc);
          this.alg = null;
        }
      }
      i = 0;
      break;
      label313:
      j = 0;
      break label17;
      label319:
      bool = false;
    }
  }
  
  public void a(c.e parame)
  {
    this.ald = ((c.e)w.h(parame, "Connection progress callbacks cannot be null."));
    a(2, null);
  }
  
  public final void a(c.e parame, ConnectionResult paramConnectionResult)
  {
    this.ald = ((c.e)w.h(parame, "Connection progress callbacks cannot be null."));
    this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.all.get(), paramConnectionResult.agH, paramConnectionResult.agI));
  }
  
  public final void a(p paramp)
  {
    paramp = new ValidateAccountRequest(paramp, (Scope[])this.ahs.toArray(new Scope[this.ahs.size()]), this.mContext.getPackageName(), null);
    try
    {
      this.alc.a(new d(this, this.all.get()), paramp);
      return;
    }
    catch (DeadObjectException paramp)
    {
      kx();
      return;
    }
    catch (RemoteException paramp) {}
  }
  
  public final void a(p paramp, Set<Scope> paramSet)
  {
    try
    {
      Bundle localBundle = ky();
      GetServiceRequest localGetServiceRequest = new GetServiceRequest(this.alk);
      localGetServiceRequest.akj = this.mContext.getPackageName();
      localGetServiceRequest.akm = localBundle;
      if (paramSet != null) {
        localGetServiceRequest.akl = ((Scope[])paramSet.toArray(new Scope[paramSet.size()]));
      }
      if (jL()) {
        if (this.afD == null) {
          break label125;
        }
      }
      label125:
      for (paramSet = this.afD;; paramSet = new Account("<<default account>>", "com.google"))
      {
        localGetServiceRequest.akn = paramSet;
        if (paramp != null) {
          localGetServiceRequest.akk = paramp.asBinder();
        }
        this.alc.a(new d(this, this.all.get()), localGetServiceRequest);
        return;
      }
      return;
    }
    catch (DeadObjectException paramp)
    {
      kx();
      return;
    }
    catch (RemoteException paramp) {}
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    IInterface localIInterface;
    for (;;)
    {
      synchronized (this.alb)
      {
        int i = this.alh;
        localIInterface = this.ale;
        paramPrintWriter.append(paramString).append("mConnectState=");
        switch (i)
        {
        default: 
          paramPrintWriter.print("UNKNOWN");
          paramPrintWriter.append(" mService=");
          if (localIInterface != null) {
            break label142;
          }
          paramPrintWriter.println("null");
          return;
        }
      }
      paramPrintWriter.print("CONNECTING");
      continue;
      paramPrintWriter.print("CONNECTED");
      continue;
      paramPrintWriter.print("DISCONNECTING");
      continue;
      paramPrintWriter.print("DISCONNECTED");
    }
    label142:
    paramPrintWriter.append(jO()).append("@").println(Integer.toHexString(System.identityHashCode(localIInterface.asBinder())));
  }
  
  public final boolean a(int paramInt1, int paramInt2, T paramT)
  {
    synchronized (this.alb)
    {
      if (this.alh != paramInt1) {
        return false;
      }
      a(paramInt2, paramT);
      return true;
    }
  }
  
  public void disconnect()
  {
    this.all.incrementAndGet();
    synchronized (this.alf)
    {
      int j = this.alf.size();
      int i = 0;
      while (i < j)
      {
        ((c)this.alf.get(i)).kC();
        i += 1;
      }
      this.alf.clear();
      a(1, null);
      return;
    }
  }
  
  public abstract T f(IBinder paramIBinder);
  
  public final boolean isConnected()
  {
    for (;;)
    {
      synchronized (this.alb)
      {
        if (this.alh == 3)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final boolean isConnecting()
  {
    for (;;)
    {
      synchronized (this.alb)
      {
        if (this.alh == 2)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public boolean jL()
  {
    return false;
  }
  
  public boolean jM()
  {
    return true;
  }
  
  public abstract String jN();
  
  public abstract String jO();
  
  public String ku()
  {
    return "com.google.android.gms";
  }
  
  public Bundle ky()
  {
    return new Bundle();
  }
  
  public final T kz()
  {
    synchronized (this.alb)
    {
      if (this.alh == 4) {
        throw new DeadObjectException();
      }
    }
    if (!isConnected()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
    if (this.ale != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.b(bool, "Client is connected but service is null");
      IInterface localIInterface = this.ale;
      return localIInterface;
    }
  }
  
  private abstract class a
    extends k<T>.c<Boolean>
  {
    public final Bundle aln;
    public final int statusCode;
    
    protected a(int paramInt, Bundle paramBundle)
    {
      super(Boolean.valueOf(true));
      this.statusCode = paramInt;
      this.aln = paramBundle;
    }
    
    protected abstract void h(ConnectionResult paramConnectionResult);
    
    protected abstract boolean kA();
  }
  
  final class b
    extends Handler
  {
    public b(Looper paramLooper)
    {
      super();
    }
    
    private static void a(Message paramMessage)
    {
      ((k.c)paramMessage.obj).unregister();
    }
    
    private static boolean b(Message paramMessage)
    {
      return (paramMessage.what == 2) || (paramMessage.what == 1) || (paramMessage.what == 5) || (paramMessage.what == 6);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      PendingIntent localPendingIntent = null;
      if (k.this.all.get() != paramMessage.arg1)
      {
        if (b(paramMessage)) {
          a(paramMessage);
        }
        return;
      }
      if (((paramMessage.what == 1) || (paramMessage.what == 5) || (paramMessage.what == 6)) && (!k.this.isConnecting()))
      {
        a(paramMessage);
        return;
      }
      if (paramMessage.what == 3)
      {
        if ((paramMessage.obj instanceof PendingIntent)) {
          localPendingIntent = (PendingIntent)paramMessage.obj;
        }
        paramMessage = new ConnectionResult(paramMessage.arg2, localPendingIntent);
        k.this.ald.b(paramMessage);
        k.kw();
        return;
      }
      if (paramMessage.what == 4)
      {
        k.this.a(4, null);
        if (k.this.ali != null) {
          k.this.ali.bU(paramMessage.arg2);
        }
        int i = paramMessage.arg2;
        k.kv();
        k.this.a(4, 1, null);
        return;
      }
      if ((paramMessage.what == 2) && (!k.this.isConnected()))
      {
        a(paramMessage);
        return;
      }
      if (b(paramMessage))
      {
        ((k.c)paramMessage.obj).kB();
        return;
      }
      Log.wtf("GmsClient", "Don't know how to handle this message.");
    }
  }
  
  protected abstract class c<TListener>
  {
    private TListener aiR;
    private boolean alp;
    
    public c()
    {
      Object localObject;
      this.aiR = localObject;
      this.alp = false;
    }
    
    protected abstract void Y(TListener paramTListener);
    
    /* Error */
    public final void kB()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 24	com/google/android/gms/common/internal/k$c:aiR	Ljava/lang/Object;
      //   6: astore_1
      //   7: aload_0
      //   8: getfield 26	com/google/android/gms/common/internal/k$c:alp	Z
      //   11: ifeq +22 -> 33
      //   14: new 36	java/lang/StringBuilder
      //   17: dup
      //   18: ldc 38
      //   20: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   23: aload_0
      //   24: invokevirtual 45	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   27: ldc 47
      //   29: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   32: pop
      //   33: aload_0
      //   34: monitorexit
      //   35: aload_1
      //   36: ifnull +8 -> 44
      //   39: aload_0
      //   40: aload_1
      //   41: invokevirtual 52	com/google/android/gms/common/internal/k$c:Y	(Ljava/lang/Object;)V
      //   44: aload_0
      //   45: monitorenter
      //   46: aload_0
      //   47: iconst_1
      //   48: putfield 26	com/google/android/gms/common/internal/k$c:alp	Z
      //   51: aload_0
      //   52: monitorexit
      //   53: aload_0
      //   54: invokevirtual 55	com/google/android/gms/common/internal/k$c:unregister	()V
      //   57: return
      //   58: astore_1
      //   59: aload_0
      //   60: monitorexit
      //   61: aload_1
      //   62: athrow
      //   63: astore_1
      //   64: aload_1
      //   65: athrow
      //   66: astore_1
      //   67: aload_0
      //   68: monitorexit
      //   69: aload_1
      //   70: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	71	0	this	c
      //   6	35	1	localObject1	Object
      //   58	4	1	localObject2	Object
      //   63	2	1	localRuntimeException	RuntimeException
      //   66	4	1	localObject3	Object
      // Exception table:
      //   from	to	target	type
      //   2	33	58	finally
      //   33	35	58	finally
      //   59	61	58	finally
      //   39	44	63	java/lang/RuntimeException
      //   46	53	66	finally
      //   67	69	66	finally
    }
    
    public final void kC()
    {
      try
      {
        this.aiR = null;
        return;
      }
      finally {}
    }
    
    public final void unregister()
    {
      kC();
      synchronized (k.this.alf)
      {
        k.this.alf.remove(this);
        return;
      }
    }
  }
  
  public static final class d
    extends r.a
  {
    private k alq;
    private final int alr;
    
    public d(k paramk, int paramInt)
    {
      this.alq = paramk;
      this.alr = paramInt;
    }
    
    public final void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      w.h(this.alq, "onPostInitComplete can be called only once per call to getRemoteService");
      this.alq.a(paramInt, paramIBinder, paramBundle, this.alr);
      this.alq = null;
    }
    
    public final void b(int paramInt, Bundle paramBundle)
    {
      w.h(this.alq, "onAccountValidationComplete can be called only once per call to validateAccount");
      k localk = this.alq;
      int i = this.alr;
      localk.mHandler.sendMessage(localk.mHandler.obtainMessage(5, i, -1, new k.i(localk, paramInt, paramBundle)));
      this.alq = null;
    }
  }
  
  public final class e
    implements ServiceConnection
  {
    private final int alr;
    
    public e(int paramInt)
    {
      this.alr = paramInt;
    }
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      w.h(paramIBinder, "Expecting a valid IBinder");
      k.this.alc = s.a.i(paramIBinder);
      paramComponentName = k.this;
      int i = this.alr;
      paramComponentName.mHandler.sendMessage(paramComponentName.mHandler.obtainMessage(6, i, -1, new k.h(paramComponentName)));
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      k.this.mHandler.sendMessage(k.this.mHandler.obtainMessage(4, this.alr, 1));
    }
  }
  
  protected final class f
    implements c.e
  {
    public f() {}
    
    public final void b(ConnectionResult paramConnectionResult)
    {
      if (paramConnectionResult.isSuccess()) {
        k.this.a(null, k.this.ahs);
      }
      while (k.this.alj == null) {
        return;
      }
      k.this.alj.a(paramConnectionResult);
    }
    
    public final void c(ConnectionResult paramConnectionResult)
    {
      throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
  }
  
  protected final class g
    extends k<T>.a
  {
    public final IBinder als;
    
    public g(int paramInt, IBinder paramIBinder, Bundle paramBundle)
    {
      super(paramInt, paramBundle);
      this.als = paramIBinder;
    }
    
    protected final void h(ConnectionResult paramConnectionResult)
    {
      if (k.this.alj != null) {
        k.this.alj.a(paramConnectionResult);
      }
      k.kw();
    }
    
    protected final boolean kA()
    {
      try
      {
        Object localObject = this.als.getInterfaceDescriptor();
        if (!k.this.jO().equals(localObject)) {
          new StringBuilder("service descriptor mismatch: ").append(k.this.jO()).append(" vs. ").append((String)localObject);
        }
        do
        {
          return false;
          localObject = k.this.f(this.als);
        } while ((localObject == null) || (!k.this.a(2, 3, (IInterface)localObject)));
        if (k.this.ali != null) {
          k.this.ali.g(null);
        }
        return true;
      }
      catch (RemoteException localRemoteException) {}
      return false;
    }
  }
  
  protected final class h
    extends k<T>.a
  {
    public h()
    {
      super(0, null);
    }
    
    protected final void h(ConnectionResult paramConnectionResult)
    {
      k.this.ald.b(paramConnectionResult);
      k.kw();
    }
    
    protected final boolean kA()
    {
      k.this.ald.b(ConnectionResult.agG);
      return true;
    }
  }
  
  protected final class i
    extends k<T>.a
  {
    public i(int paramInt, Bundle paramBundle)
    {
      super(paramInt, paramBundle);
    }
    
    protected final void h(ConnectionResult paramConnectionResult)
    {
      k.this.ald.c(paramConnectionResult);
      k.kw();
    }
    
    protected final boolean kA()
    {
      k.this.ald.c(ConnectionResult.agG);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */