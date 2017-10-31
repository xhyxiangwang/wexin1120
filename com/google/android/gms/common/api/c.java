package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.c.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.h.a;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.signin.d;
import com.google.android.gms.signin.e;
import com.google.android.gms.signin.e.a;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public abstract interface c
{
  public abstract ConnectionResult a(TimeUnit paramTimeUnit);
  
  public abstract <A extends a.b, R extends g, T extends k.a<R, A>> T a(T paramT);
  
  public abstract void a(b paramb);
  
  public abstract void a(c paramc);
  
  public abstract void a(String paramString, PrintWriter paramPrintWriter);
  
  public abstract <A extends a.b, T extends k.a<? extends g, A>> T b(T paramT);
  
  public abstract void b(b paramb);
  
  public abstract void b(c paramc);
  
  public abstract void connect();
  
  public abstract void disconnect();
  
  public abstract Looper getLooper();
  
  public abstract boolean isConnected();
  
  public abstract boolean isConnecting();
  
  public static final class a
  {
    private Account afD;
    public final Set<Scope> agY = new HashSet();
    private int agZ;
    private View aha;
    private String ahb;
    private String ahc;
    private final Map<a<?>, h.a> ahd = new m();
    public final Map<a<?>, Object> ahe = new m();
    public FragmentActivity ahf;
    public int ahg = -1;
    public int ahh = -1;
    public c.c ahi;
    public Looper ahj;
    public com.google.android.gms.common.b ahk = com.google.android.gms.common.b.jH();
    public a.a<? extends d, e> ahl = com.google.android.gms.signin.b.ayc;
    public final ArrayList<c.b> ahm = new ArrayList();
    public final ArrayList<c.c> ahn = new ArrayList();
    private e.a aho = new e.a();
    public final Context mContext;
    
    public a(Context paramContext)
    {
      this.mContext = paramContext;
      this.ahj = paramContext.getMainLooper();
      this.ahb = paramContext.getPackageName();
      this.ahc = paramContext.getClass().getName();
    }
    
    public final void a(u paramu, c paramc)
    {
      int i = this.ahg;
      Object localObject = this.ahi;
      w.h(paramc, "GoogleApiClient instance cannot be null");
      if (paramu.aiW.indexOfKey(i) < 0) {}
      for (boolean bool = true;; bool = false)
      {
        w.b(bool, "Already managing a GoogleApiClient with id " + i);
        localObject = new u.a(paramu, i, paramc, (c.c)localObject);
        paramu.aiW.put(i, localObject);
        if ((paramu.mT) && (!paramu.aiS)) {
          paramc.connect();
        }
        return;
      }
    }
    
    public final h jS()
    {
      return new h(this.afD, this.agY, this.ahd, this.agZ, this.aha, this.ahb, this.ahc, this.aho.mk());
    }
  }
  
  public static abstract interface b
  {
    public abstract void bU(int paramInt);
    
    public abstract void g(Bundle paramBundle);
  }
  
  public static abstract interface c
  {
    public abstract void a(ConnectionResult paramConnectionResult);
  }
  
  public static abstract interface d
  {
    public abstract a jT();
    
    public abstract boolean jU();
    
    public static final class a
    {
      public boolean ahr;
      public Set<Scope> ahs;
    }
  }
  
  public static abstract interface e
  {
    public abstract void b(ConnectionResult paramConnectionResult);
    
    public abstract void c(ConnectionResult paramConnectionResult);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */