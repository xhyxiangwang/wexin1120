package com.tencent.pb.common.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.tencent.pb.common.c.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import junit.framework.Assert;

public final class e
  implements b
{
  private static e xnl = null;
  private final Handler handler = new Handler(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      e.this.a((d)paramAnonymousMessage.obj);
    }
  };
  public Vector<d> hmM = new Vector();
  public Vector<d> hmN = new Vector();
  public final SparseArray<Set<b>> xnm = new SparseArray();
  private d xnn = null;
  
  private void DR()
  {
    if (this.hmN.size() > 0)
    {
      d locald = (d)this.hmN.get(0);
      int i = 1;
      while (i < this.hmN.size())
      {
        this.hmN.get(i);
        i += 1;
      }
      if (cjA())
      {
        this.hmN.remove(locald);
        a(locald, 0);
      }
    }
  }
  
  private void a(final d paramd, int paramInt)
  {
    if (cjA())
    {
      this.hmM.add(paramd);
      if (paramd.xne == null)
      {
        c.k("MicroMsg.Voip", new Object[] { paramd.xnc, "dosene reqData is null cmd=" + paramd.xng });
        paramInt = -1;
        if (paramInt < 0)
        {
          c.k("MicroMsg.Voip", new Object[] { "doSceneImp do scene failed, ret %d,", Integer.valueOf(paramInt) });
          this.handler.post(new Runnable()
          {
            public final void run()
            {
              e.this.hmM.remove(paramd);
              e.this.a(2, -1, "doScene failed", paramd);
            }
          });
        }
      }
    }
    for (;;)
    {
      DR();
      return;
      paramd.xnd = this;
      i locali = new i(paramd);
      paramInt = f.cjC().a(null, locali, paramd.xng, paramd.cjy(), paramd.xne, paramd.xnh);
      if (paramInt >= 0) {
        paramd.mHandler.postDelayed(paramd.hni, 60000L);
      }
      c.d("MicroMsg.Voip", new Object[] { "NETTASK_SEND dosene:cmd ", paramd.cjy(), Integer.valueOf(paramInt) });
      break;
      this.hmN.add(paramd);
    }
  }
  
  private boolean cjA()
  {
    return this.hmM.size() < 20;
  }
  
  public static e cjz()
  {
    if (xnl == null) {}
    try
    {
      if (xnl == null) {
        xnl = new e();
      }
      return xnl;
    }
    finally {}
  }
  
  public final void a(final int paramInt1, final int paramInt2, final String paramString, final d paramd)
  {
    this.hmM.remove(paramd);
    DR();
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        Set localSet = (Set)e.this.xnm.get(paramd.getType());
        if ((localSet != null) && (localSet.size() > 0))
        {
          Object localObject = new HashSet();
          ((Set)localObject).addAll(localSet);
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            b localb = (b)((Iterator)localObject).next();
            if ((localb != null) && (localSet.contains(localb))) {
              localb.a(paramInt1, paramInt2, paramString, paramd);
            }
          }
        }
      }
    });
  }
  
  public final void a(int paramInt, b paramb)
  {
    if (this.xnm.get(paramInt) == null) {
      this.xnm.put(paramInt, new HashSet());
    }
    if (!((Set)this.xnm.get(paramInt)).contains(paramb)) {
      ((Set)this.xnm.get(paramInt)).add(paramb);
    }
  }
  
  public final boolean a(d paramd)
  {
    if (!h.isNetworkConnected())
    {
      int i = paramd.getType();
      if ((i == 102) || (i == 104) || (i == 103))
      {
        c.k("MicroMsg.Voip", new Object[] { "doScene do retain mReissueNetScene" });
        this.xnn = paramd;
      }
    }
    Assert.assertTrue(true);
    if (paramd == null) {
      return false;
    }
    a(paramd, 0);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */