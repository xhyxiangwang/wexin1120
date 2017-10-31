package com.google.android.gms.common.api;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class l
  implements p
{
  private final o ahL;
  
  public l(o paramo)
  {
    this.ahL = paramo;
  }
  
  private <A extends a.b> void a(o.e<A> parame)
  {
    this.ahL.b(parame);
    Object localObject = this.ahL;
    a.c localc = parame.jJ();
    localObject = (a.b)((o)localObject).aiB.get(localc);
    w.h(localObject, "Appropriate Api was not requested.");
    if ((!((a.b)localObject).isConnected()) && (this.ahL.aiC.containsKey(parame.jJ())))
    {
      parame.c(new Status(17));
      return;
    }
    parame.a((a.b)localObject);
  }
  
  public final <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT)
  {
    return b(paramT);
  }
  
  public final void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt) {}
  
  public final <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT)
  {
    try
    {
      a(paramT);
      return paramT;
    }
    catch (DeadObjectException localDeadObjectException)
    {
      this.ahL.a(new o.b(this)
      {
        public final void ka()
        {
          l.this.bU(1);
        }
      });
    }
    return paramT;
  }
  
  public final void bU(int paramInt)
  {
    if (paramInt == 1)
    {
      localObject = this.ahL;
      if (!((o)localObject).aiw)
      {
        ((o)localObject).aiw = true;
        if (((o)localObject).aiA == null)
        {
          ((o)localObject).aiA = new o.c((o)localObject);
          IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
          localIntentFilter.addDataScheme("package");
          ((o)localObject).mContext.getApplicationContext().registerReceiver(((o)localObject).aiA, localIntentFilter);
        }
        ((o)localObject).aiz.sendMessageDelayed(((o)localObject).aiz.obtainMessage(1), ((o)localObject).aix);
        ((o)localObject).aiz.sendMessageDelayed(((o)localObject).aiz.obtainMessage(2), ((o)localObject).aiy);
      }
    }
    Object localObject = this.ahL.aiH.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((o.e)((Iterator)localObject).next()).a(new Status(8, "The connection to Google Play services was lost"));
    }
    this.ahL.f(null);
    this.ahL.aiu.cb(paramInt);
    this.ahL.aiu.kD();
    if (paramInt == 2) {
      this.ahL.connect();
    }
  }
  
  public final void begin()
  {
    while (!this.ahL.aiv.isEmpty()) {
      try
      {
        a((o.e)this.ahL.aiv.remove());
      }
      catch (DeadObjectException localDeadObjectException) {}
    }
  }
  
  public final void connect() {}
  
  public final void disconnect()
  {
    this.ahL.aiC.clear();
    this.ahL.kj();
    this.ahL.f(null);
    this.ahL.aiu.kD();
  }
  
  public final void g(Bundle paramBundle) {}
  
  public final String getName()
  {
    return "CONNECTED";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */