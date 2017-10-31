package com.tencent.mm.plugin.appbrand.dynamic.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a
{
  private static a iML;
  public Map<String, List<IPCDynamicPageView>> iMM;
  public Map<String, a> iMN;
  
  private a()
  {
    GMTrace.i(17730698739712L, 132104);
    this.iMM = new ConcurrentHashMap();
    this.iMN = new ConcurrentHashMap();
    GMTrace.o(17730698739712L, 132104);
  }
  
  private static IPCDynamicPageView U(List<IPCDynamicPageView> paramList)
  {
    GMTrace.i(18299110817792L, 136339);
    int i = 0;
    while (i < paramList.size())
    {
      if (((IPCDynamicPageView)paramList.get(i)).isPaused())
      {
        paramList = (IPCDynamicPageView)paramList.remove(i);
        GMTrace.o(18299110817792L, 136339);
        return paramList;
      }
      i += 1;
    }
    GMTrace.o(18299110817792L, 136339);
    return null;
  }
  
  public static a Vb()
  {
    GMTrace.i(17730832957440L, 132105);
    if (iML == null) {}
    try
    {
      if (iML == null) {
        iML = new a();
      }
      a locala = iML;
      GMTrace.o(17730832957440L, 132105);
      return locala;
    }
    finally {}
  }
  
  public final boolean b(String paramString, IPCDynamicPageView paramIPCDynamicPageView)
  {
    GMTrace.i(18298842382336L, 136337);
    if ((paramString == null) || (paramString.length() == 0) || (paramIPCDynamicPageView == null))
    {
      GMTrace.o(18298842382336L, 136337);
      return false;
    }
    List localList = (List)this.iMM.get(paramString);
    if (localList == null)
    {
      GMTrace.o(18298842382336L, 136337);
      return false;
    }
    try
    {
      boolean bool = localList.remove(paramIPCDynamicPageView);
      if (localList.isEmpty()) {
        this.iMM.remove(paramString);
      }
      GMTrace.o(18298842382336L, 136337);
      return bool;
    }
    finally {}
  }
  
  public final boolean c(String paramString, IPCDynamicPageView paramIPCDynamicPageView)
  {
    GMTrace.i(18298976600064L, 136338);
    if ((paramString == null) || (paramString.length() == 0) || (paramIPCDynamicPageView == null))
    {
      GMTrace.o(18298976600064L, 136338);
      return false;
    }
    Object localObject = (List)this.iMM.get(paramString);
    if (localObject == null)
    {
      localObject = new LinkedList();
      this.iMM.put(paramString, localObject);
    }
    for (;;)
    {
      if (((List)localObject).contains(paramIPCDynamicPageView)) {
        try
        {
          ((List)localObject).remove(paramIPCDynamicPageView);
          ((List)localObject).add(paramIPCDynamicPageView);
          GMTrace.o(18298976600064L, 136338);
          return true;
        }
        finally {}
      }
      boolean bool = ((List)localObject).add(paramIPCDynamicPageView);
      if (((List)localObject).size() > 4) {}
      try
      {
        if (((List)localObject).size() > 4)
        {
          paramIPCDynamicPageView = U((List)localObject);
          if (paramIPCDynamicPageView != null)
          {
            a locala = (a)this.iMN.get(paramString);
            if (locala != null) {
              locala.a(paramString, paramIPCDynamicPageView);
            }
          }
        }
        GMTrace.o(18298976600064L, 136338);
        return bool;
      }
      finally {}
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, IPCDynamicPageView paramIPCDynamicPageView);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */