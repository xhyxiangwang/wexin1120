package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.a.c.f;
import com.tencent.d.b.e.d.a;
import com.tencent.d.b.e.d.b;

public class i
  extends d
{
  public int[] xCA;
  private com.tencent.d.b.e.d xCy;
  public String xCz = "";
  private boolean xDd = false;
  private String xDe = "";
  
  public i(Context paramContext, e parame)
  {
    com.tencent.d.a.c.b localb = parame.xCB;
    if (localb != null) {
      c.a(localb);
    }
    com.tencent.d.a.a.setUp();
    if ((com.tencent.d.a.a.cmi()) && (com.tencent.d.a.a.hC(paramContext))) {}
    for (boolean bool = true;; bool = false)
    {
      this.xDd = bool;
      this.xCy = parame.xCy;
      this.xCA = parame.xCA;
      this.xCz = parame.xCz;
      this.xDe = parame.xCC;
      parame = com.tencent.d.b.b.a.cmt();
      paramContext = paramContext.getSharedPreferences("soter_status", 0);
      try
      {
        parame.xBZ = paramContext;
        return;
      }
      finally {}
    }
  }
  
  static boolean EC(int paramInt)
  {
    return (paramInt == 2) || (paramInt == 1);
  }
  
  @SuppressLint({"DefaultLocale"})
  public void a(String paramString, int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = paramArrayOfInt[i];
      String str = String.format("%suid%d_%s_scene%d", new Object[] { "Wechat", Integer.valueOf(Process.myUid()), f.mY(paramString), Integer.valueOf(k) });
      com.tencent.d.b.b.a.cmt().cmv().put(k, str);
      i += 1;
    }
  }
  
  final boolean cmC()
  {
    int[] arrayOfInt = this.xCA;
    if ((arrayOfInt == null) || (arrayOfInt.length <= 0)) {}
    for (int i = 1; i != 0; i = 0)
    {
      c.e("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24", new Object[0]);
      b(new com.tencent.d.b.a.d(27, "no business scene provided"));
      return true;
    }
    if (f.mY(this.xCz).length() > 24)
    {
      c.e("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24", new Object[0]);
      b(new com.tencent.d.b.a.d(28, "the account salt length is too long"));
      return true;
    }
    if ((!f.mZ(this.xDe)) && (this.xDe.length() > 24))
    {
      c.e("Soter.TaskInit", "soter: the passed ask name is too long (larger than 24).", new Object[0]);
      b(new com.tencent.d.b.a.d(29, "the passed ask name is too long (larger than 24)"));
      return true;
    }
    if (this.xCy == null) {
      c.w("Soter.TaskInit", "soter: it is strongly recommended to check device support from server, so you'd better provider a net wrapper to check it", new Object[0]);
    }
    if (!f.mZ(this.xDe))
    {
      c.i("Soter.TaskInit", "soter: provided valid ASK name", new Object[0]);
      com.tencent.d.a.c.d.cmr().xBJ = this.xDe;
    }
    g.cmG().x(new Runnable()
    {
      public final void run()
      {
        i.this.a(i.this.xCz, i.this.xCA);
        Object localObject = i.this;
        SharedPreferences localSharedPreferences = com.tencent.d.b.b.a.cmt().cmw();
        int i = localSharedPreferences.getInt(com.tencent.d.a.c.d.cmr().xBJ, 0);
        c.d("Soter.TaskInit", "soter: ask status: %d", new Object[] { Integer.valueOf(i) });
        if ((i.EC(i)) && (com.tencent.d.a.a.cml())) {
          com.tencent.d.a.a.cmk();
        }
        localObject = ((i)localObject).xCA;
        int j = localObject.length;
        i = 0;
        while (i < j)
        {
          int k = localObject[i];
          String str = (String)com.tencent.d.b.b.a.cmt().cmv().get(k, "");
          if (!f.mZ(str))
          {
            k = localSharedPreferences.getInt(str, 0);
            c.d("Soter.TaskInit", "soter: %s status: %d", new Object[] { str, Integer.valueOf(k) });
            if ((i.EC(k)) && (com.tencent.d.a.a.Xx(str))) {
              com.tencent.d.a.a.bh(str, false);
            }
          }
          i += 1;
        }
      }
    });
    return false;
  }
  
  final void cmD() {}
  
  final void execute()
  {
    if (this.xDd)
    {
      if (this.xCy == null)
      {
        com.tencent.d.b.b.a.cmt().mN(true);
        com.tencent.d.b.b.a.cmt().cmu();
        b(new com.tencent.d.b.a.d(0));
        return;
      }
      String str = com.tencent.d.a.a.cmn();
      this.xCy.aW(new d.a(str));
      this.xCy.a(new com.tencent.d.b.e.b() {});
      this.xCy.execute();
      return;
    }
    b(new com.tencent.d.b.a.d(2));
    try
    {
      com.tencent.d.b.b.a.cmt().mN(false);
      com.tencent.d.b.b.a.cmt().cmu();
      return;
    }
    finally {}
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */