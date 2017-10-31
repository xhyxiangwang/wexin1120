package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class n
  implements p
{
  private final o ahL;
  
  public n(o paramo)
  {
    this.ahL = paramo;
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    this.ahL.aiv.add(paramT);
    return paramT;
  }
  
  public final void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt) {}
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public final void bU(int paramInt) {}
  
  public final void begin()
  {
    Iterator localIterator = this.ahL.aiB.values().iterator();
    while (localIterator.hasNext()) {
      ((a.b)localIterator.next()).disconnect();
    }
    this.ahL.aiD = Collections.emptySet();
  }
  
  public final void connect()
  {
    o localo = this.ahL;
    localo.ahN.lock();
    try
    {
      localo.aiE = new m(localo, localo.aic, localo.aid, localo.ahk, localo.ahl, localo.ahN, localo.mContext);
      localo.aiE.begin();
      localo.ait.signalAll();
      return;
    }
    finally
    {
      localo.ahN.unlock();
    }
  }
  
  public final void disconnect()
  {
    Iterator localIterator = this.ahL.aiv.iterator();
    while (localIterator.hasNext()) {
      ((o.e)localIterator.next()).cancel();
    }
    this.ahL.aiv.clear();
    this.ahL.aiC.clear();
    this.ahL.kj();
  }
  
  public final void g(Bundle paramBundle) {}
  
  public final String getName()
  {
    return "DISCONNECTED";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */