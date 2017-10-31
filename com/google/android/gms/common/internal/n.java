package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class n
  extends m
  implements Handler.Callback
{
  public final Context adn;
  public final HashMap<a, b> alC = new HashMap();
  public final b alD;
  private final long alE;
  private final Handler mHandler;
  
  n(Context paramContext)
  {
    this.adn = paramContext.getApplicationContext();
    this.mHandler = new Handler(paramContext.getMainLooper(), this);
    this.alD = b.kX();
    this.alE = 5000L;
  }
  
  private void a(a parama, ServiceConnection paramServiceConnection)
  {
    w.h(paramServiceConnection, "ServiceConnection must not be null");
    b localb;
    synchronized (this.alC)
    {
      localb = (b)this.alC.get(parama);
      if (localb == null) {
        throw new IllegalStateException("Nonexistent connection status for service config: " + parama);
      }
    }
    if (!localb.a(paramServiceConnection)) {
      throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + parama);
    }
    localb.alM.alD.a(localb.alM.adn, paramServiceConnection, null, null, 4);
    localb.alJ.remove(paramServiceConnection);
    if (localb.kF())
    {
      parama = this.mHandler.obtainMessage(0, localb);
      this.mHandler.sendMessageDelayed(parama, this.alE);
    }
  }
  
  private boolean a(a parama, ServiceConnection paramServiceConnection, String paramString)
  {
    w.h(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      b localb;
      synchronized (this.alC)
      {
        localb = (b)this.alC.get(parama);
        if (localb == null)
        {
          localb = new b(parama);
          localb.a(paramServiceConnection, paramString);
          localb.ac(paramString);
          this.alC.put(parama, localb);
          parama = localb;
          boolean bool = parama.alK;
          return bool;
        }
        this.mHandler.removeMessages(0, localb);
        if (localb.a(paramServiceConnection)) {
          throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + parama);
        }
      }
      localb.a(paramServiceConnection, paramString);
      switch (localb.mState)
      {
      case 1: 
        paramServiceConnection.onServiceConnected(localb.alH, localb.akc);
        parama = localb;
        break;
      case 2: 
        localb.ac(paramString);
        parama = localb;
        break;
      default: 
        parama = localb;
      }
    }
  }
  
  public final boolean a(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    return a(new a(paramComponentName), paramServiceConnection, paramString);
  }
  
  public final boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    return a(new a(paramString1, paramString2), paramServiceConnection, paramString3);
  }
  
  public final void b(ComponentName paramComponentName, ServiceConnection paramServiceConnection, String paramString)
  {
    a(new a(paramComponentName), paramServiceConnection);
  }
  
  public final void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    a(new a(paramString1, paramString2), paramServiceConnection);
  }
  
  public final boolean handleMessage(Message arg1)
  {
    switch (???.what)
    {
    default: 
      return false;
    }
    b localb = (b)???.obj;
    synchronized (this.alC)
    {
      if (localb.kF())
      {
        if (localb.alK)
        {
          localb.alM.alD.a(localb.alM.adn, localb.alI);
          localb.alK = false;
          localb.mState = 2;
        }
        this.alC.remove(localb.alL);
      }
      return true;
    }
  }
  
  private static final class a
  {
    private final String alF;
    private final String alG;
    private final ComponentName alH;
    
    public a(ComponentName paramComponentName)
    {
      this.alF = null;
      this.alG = null;
      this.alH = ((ComponentName)w.aa(paramComponentName));
    }
    
    public a(String paramString1, String paramString2)
    {
      this.alF = w.af(paramString1);
      this.alG = w.af(paramString2);
      this.alH = null;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {}
      do
      {
        return true;
        if (!(paramObject instanceof a)) {
          return false;
        }
        paramObject = (a)paramObject;
      } while ((v.d(this.alF, ((a)paramObject).alF)) && (v.d(this.alH, ((a)paramObject).alH)));
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { this.alF, this.alH });
    }
    
    public final Intent kE()
    {
      if (this.alF != null) {
        return new Intent(this.alF).setPackage(this.alG);
      }
      return new Intent().setComponent(this.alH);
    }
    
    public final String toString()
    {
      if (this.alF == null) {
        return this.alH.flattenToString();
      }
      return this.alF;
    }
  }
  
  private final class b
  {
    public IBinder akc;
    public ComponentName alH;
    final a alI;
    public final Set<ServiceConnection> alJ;
    boolean alK;
    public final n.a alL;
    public int mState;
    
    public b(n.a parama)
    {
      this.alL = parama;
      this.alI = new a();
      this.alJ = new HashSet();
      this.mState = 2;
    }
    
    public final void a(ServiceConnection paramServiceConnection, String paramString)
    {
      n.this.alD.a(n.this.adn, paramServiceConnection, paramString, this.alL.kE(), 3);
      this.alJ.add(paramServiceConnection);
    }
    
    public final boolean a(ServiceConnection paramServiceConnection)
    {
      return this.alJ.contains(paramServiceConnection);
    }
    
    public final void ac(String paramString)
    {
      this.alK = n.this.alD.a(n.this.adn, paramString, this.alL.kE(), this.alI, 129);
      if (this.alK)
      {
        this.mState = 3;
        return;
      }
      try
      {
        n.this.alD.a(n.this.adn, this.alI);
        return;
      }
      catch (IllegalArgumentException paramString) {}
    }
    
    public final boolean kF()
    {
      return this.alJ.isEmpty();
    }
    
    public final class a
      implements ServiceConnection
    {
      public a() {}
      
      public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
      {
        synchronized (n.this.alC)
        {
          n.b.this.akc = paramIBinder;
          n.b.this.alH = paramComponentName;
          Iterator localIterator = n.b.this.alJ.iterator();
          if (localIterator.hasNext()) {
            ((ServiceConnection)localIterator.next()).onServiceConnected(paramComponentName, paramIBinder);
          }
        }
        n.b.this.mState = 1;
      }
      
      public final void onServiceDisconnected(ComponentName paramComponentName)
      {
        synchronized (n.this.alC)
        {
          n.b.this.akc = null;
          n.b.this.alH = paramComponentName;
          Iterator localIterator = n.b.this.alJ.iterator();
          if (localIterator.hasNext()) {
            ((ServiceConnection)localIterator.next()).onServiceDisconnected(paramComponentName);
          }
        }
        n.b.this.mState = 2;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */