package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.w;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a<O>
{
  private final a<?, O> agU;
  final e<?, O> agV;
  private final c<?> agW;
  final f<?> agX;
  final String mName;
  
  public <C extends b> a(String paramString, a<C, O> parama, c<C> paramc)
  {
    w.h(parama, "Cannot construct an Api with a null ClientBuilder");
    w.h(paramc, "Cannot construct an Api with a null ClientKey");
    this.mName = paramString;
    this.agU = parama;
    this.agV = null;
    this.agW = paramc;
    this.agX = null;
  }
  
  public final a<?, O> jI()
  {
    if (this.agU != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.b(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
      return this.agU;
    }
  }
  
  public final c<?> jJ()
  {
    if (this.agW != null) {}
    for (boolean bool = true;; bool = false)
    {
      w.b(bool, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
      return this.agW;
    }
  }
  
  public static abstract class a<T extends a.b, O>
  {
    public abstract T a(Context paramContext, Looper paramLooper, h paramh, O paramO, c.b paramb, c.c paramc);
    
    public List<Scope> jK()
    {
      return Collections.emptyList();
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(c.e parame);
    
    public abstract void a(p paramp);
    
    public abstract void a(p paramp, Set<Scope> paramSet);
    
    public abstract void a(String paramString, PrintWriter paramPrintWriter);
    
    public abstract void disconnect();
    
    public abstract boolean isConnected();
    
    public abstract boolean jL();
    
    public abstract boolean jM();
  }
  
  public static final class c<C extends a.b> {}
  
  public static abstract interface d<T extends IInterface>
  {
    public abstract String jN();
    
    public abstract String jO();
    
    public abstract T jP();
  }
  
  public static abstract interface e<T extends a.d, O>
  {
    public abstract T jQ();
    
    public abstract int jR();
  }
  
  public static final class f<C extends a.d> {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */