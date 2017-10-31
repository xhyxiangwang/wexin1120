package com.tencent.e;

import com.tencent.e.b.d;
import java.util.HashMap;

public final class f
{
  private static f xLi;
  private HashMap<String, g> xLj = new HashMap();
  HashMap<String, Object> xLk = new HashMap();
  private Object xLl = new Object();
  Object xLm = new Object();
  private a xLn = new a();
  
  private boolean M(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      int j = paramArrayOfString.length;
      int i = 0;
      while (i < j)
      {
        Object localObject2 = paramArrayOfString[i];
        if (localObject2 != null)
        {
          synchronized (this.xLl)
          {
            localObject2 = (g)this.xLj.get(localObject2);
            if (localObject2 == null) {
              return false;
            }
          }
          a((g)localObject2);
          if (((g)localObject2).mState != 32) {
            return false;
          }
          ((g)localObject2).mReferenceCount += 1;
          com.tencent.pb.common.c.c.d("reference_count", new Object[] { "addReferenceCount|", ((g)localObject2).xLr.xLB, "|refcount=", Integer.valueOf(((g)localObject2).mReferenceCount) });
        }
        i += 1;
      }
    }
    return true;
  }
  
  public static Object XS(String paramString)
  {
    return cnK().XT(paramString);
  }
  
  private Object XT(String paramString)
  {
    if (paramString == null) {
      throw new h("TpfServiceCenter|getService|service name should not be null");
    }
    synchronized (this.xLm)
    {
      ??? = this.xLk.get(paramString);
      if (??? != null) {
        return ???;
      }
    }
    g localg;
    synchronized (this.xLl)
    {
      localg = (g)this.xLj.get(paramString);
      if (localg == null) {
        return ???;
      }
      if (localg.xLr.xLD)
      {
        return c(localg);
        paramString = finally;
        throw paramString;
      }
    }
    if (4 == localg.mState) {}
    try
    {
      a(localg);
      synchronized (this.xLm)
      {
        paramString = this.xLk.get(paramString);
        return paramString;
      }
      return ???;
    }
    catch (com.tencent.e.b.c paramString)
    {
      com.tencent.pb.common.c.c.k("service", new Object[] { paramString });
      return null;
    }
  }
  
  public static com.tencent.e.b.b a(d paramd)
  {
    return cnK().b(paramd);
  }
  
  private com.tencent.e.b.b b(d paramd)
  {
    int j = 1;
    if ((paramd == null) || (paramd.xLB == null)) {
      return null;
    }
    String str = paramd.xLB;
    this.xLn.fs("install_", str);
    for (;;)
    {
      try
      {
        synchronized (this.xLl)
        {
          g localg = (g)this.xLj.get(str);
          if (localg == null)
          {
            localg = new g(this, paramd);
            localg.mState = 2;
            com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] installed!" });
            this.xLj.put(str, localg);
            i = 1;
            if (i != 0)
            {
              if (paramd.xLA == null) {
                break label258;
              }
              i = j;
              if (i != 0)
              {
                localg.mState = 4;
                com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] resolved!" });
              }
            }
            else
            {
              return localg;
            }
          }
          else
          {
            com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] had been installed!" });
            i = 0;
          }
        }
        throw new com.tencent.e.b.c("resolve service [" + str + "] failed.");
      }
      finally
      {
        this.xLn.ft("install_", str);
      }
      label258:
      int i = 0;
    }
  }
  
  private static boolean b(g paramg)
  {
    if (!paramg.xLr.xLD) {
      try
      {
        b localb = (b)Class.forName(paramg.xLr.xLA).newInstance();
        paramg.xLs = localb;
        a locala = new a(paramg);
        paramg.xLt = locala;
        localb.a(locala);
        return true;
      }
      catch (Exception paramg)
      {
        com.tencent.pb.common.c.c.k("service", new Object[] { paramg });
      }
    }
    return false;
  }
  
  private static Object c(g paramg)
  {
    try
    {
      c localc = (c)Class.forName(paramg.xLr.xLA).newInstance();
      paramg.xLt = new a(paramg);
      paramg.mState = 32;
      paramg = localc.cnH();
      return paramg;
    }
    catch (Exception paramg)
    {
      com.tencent.pb.common.c.c.k("service", new Object[] { paramg });
    }
    return null;
  }
  
  static f cnK()
  {
    if (xLi == null) {}
    try
    {
      if (xLi == null) {
        xLi = new f();
      }
      return xLi;
    }
    finally {}
  }
  
  final boolean a(g paramg)
  {
    int j = 0;
    d locald = paramg.xLr;
    String str = locald.xLB;
    this.xLn.fs("service_", str);
    try
    {
      int i = paramg.mState;
      if (i == 32) {
        i = 1;
      }
      for (;;)
      {
        this.xLn.ft("service_", str);
        if (i != 0) {
          break;
        }
        throw new com.tencent.e.b.c("startService [" + str + "] failed");
        i = j;
        if (paramg.mState == 4)
        {
          paramg.mState = 8;
          com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] starting..." });
          if (locald.xLC != null) {
            M(locald.xLC);
          }
          i = j;
          if (b(paramg))
          {
            paramg.mState = 32;
            com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] active..." });
            i = 1;
          }
        }
      }
      return true;
    }
    finally
    {
      this.xLn.ft("service_", str);
    }
  }
  
  final class a
  {
    private final Object mLock = new Object();
    private final HashMap<String, Object> xLo = new HashMap();
    
    a() {}
    
    final void fs(String arg1, String paramString2)
    {
      String str = ??? + paramString2;
      synchronized (this.mLock)
      {
        for (;;)
        {
          Object localObject = this.xLo.get(str);
          if (localObject != null) {
            try
            {
              this.mLock.wait();
            }
            catch (InterruptedException paramString2)
            {
              throw new com.tencent.e.b.c("install fail,lock interrupted!");
            }
          }
        }
      }
      this.xLo.put(str, paramString2);
    }
    
    final void ft(String arg1, String paramString2)
    {
      paramString2 = ??? + paramString2;
      synchronized (this.mLock)
      {
        this.xLo.remove(paramString2);
        this.mLock.notifyAll();
        return;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */