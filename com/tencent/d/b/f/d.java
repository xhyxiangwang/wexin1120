package com.tencent.d.b.f;

import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.b.a.b;
import com.tencent.d.b.a.e;

public abstract class d
{
  boolean xCi = false;
  public b xCv;
  
  final void b(final e parame)
  {
    f localf;
    for (;;)
    {
      try
      {
        if (this.xCi)
        {
          c.w("Soter.BaseSoterTask", "soter: warning: already removed the task!", new Object[0]);
          return;
        }
        localf = f.cmE();
        if (this != null)
        {
          ??? = Integer.valueOf(hashCode());
          c.i("Soter.SoterTaskManager", "soter: removing task: %d", new Object[] { ??? });
          if (this != null) {
            break;
          }
          c.e("Soter.SoterTaskManager", "soter: task is null", new Object[0]);
          g.cmG().u(new Runnable()
          {
            public final void run()
            {
              d locald = d.this;
              e locale = parame;
              if ((locald.xCv != null) && (!locald.xCi))
              {
                locald.xCv.a(locale);
                locald.xCi = true;
              }
            }
          });
        }
        else
        {
          ??? = "null";
        }
      }
      finally {}
    }
    for (;;)
    {
      synchronized (localf.xCG)
      {
        if (f.xCF.get(hashCode()) == null) {
          c.i("Soter.SoterTaskManager", "soter: no such task: %d. maybe this task did not pass preExecute", new Object[] { Integer.valueOf(hashCode()) });
        }
      }
      f.xCF.remove(hashCode());
    }
  }
  
  abstract boolean cmC();
  
  abstract void cmD();
  
  abstract void execute();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */