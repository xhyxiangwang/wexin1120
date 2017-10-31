package com.tencent.d.b.f;

import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.b.a.e;

public class f
{
  private static volatile f xCE = null;
  public static volatile SparseArray<d> xCF = null;
  public final Object xCG = new Object();
  
  private f()
  {
    xCF = new SparseArray(5);
  }
  
  public static f cmE()
  {
    if (xCE == null) {
      try
      {
        if (xCE == null) {
          xCE = new f();
        }
        f localf = xCE;
        return localf;
      }
      finally {}
    }
    return xCE;
  }
  
  public final boolean a(final d paramd, e parame)
  {
    int j;
    Object localObject;
    int i;
    if (!paramd.cmC())
    {
      j = paramd.hashCode();
      localObject = this.xCG;
      i = 0;
    }
    for (;;)
    {
      try
      {
        if (i < xCF.size())
        {
          int k = xCF.keyAt(i);
          if (!((d)xCF.get(k)).getClass().getName().equals(paramd.getClass().getName())) {
            break label154;
          }
          c.w("Soter.SoterTaskManager", "soter: already such type of task. abandon add task", new Object[0]);
          parame.errCode = 26;
          parame.ftU = "add SOTER task to queue failed. check the logcat for further information";
          paramd.b(parame);
          return false;
        }
        xCF.put(j, paramd);
        g.cmG().x(new Runnable()
        {
          public final void run()
          {
            paramd.execute();
          }
        });
        return true;
      }
      finally {}
      c.d("Soter.SoterTaskManager", "soter: prepare eat execute.", new Object[0]);
      return false;
      label154:
      i += 1;
    }
  }
  
  public final void cmF()
  {
    int i = 0;
    synchronized (this.xCG)
    {
      c.i("Soter.SoterTaskManager", "soter: request cancel all", new Object[0]);
      if (xCF.size() != 0) {
        while (i < xCF.size())
        {
          final int j = xCF.keyAt(i);
          g.cmG().x(new Runnable()
          {
            public final void run()
            {
              d locald = (d)f.xCF.get(j);
              if (locald != null) {
                locald.cmD();
              }
            }
          });
          i += 1;
        }
      }
      xCF.clear();
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */