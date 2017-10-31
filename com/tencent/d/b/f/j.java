package com.tencent.d.b.f;

import com.tencent.d.a.c.d;
import com.tencent.d.a.c.g;
import com.tencent.d.b.d.b.a;
import com.tencent.d.b.e.e;
import com.tencent.d.b.e.e.a;
import com.tencent.d.b.e.e.b;

public final class j
  extends c
{
  public e xDg = null;
  private boolean xDh = false;
  
  public j(e parame, boolean paramBoolean)
  {
    this.xDg = parame;
    this.xDh = paramBoolean;
  }
  
  final boolean cmC()
  {
    if (!com.tencent.d.b.b.a.cmt().isInit())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.d.b.a.c(14));
      return true;
    }
    if (!com.tencent.d.b.b.a.cmt().cms())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: not support soter", new Object[0]);
      b(new com.tencent.d.b.a.c(2));
      return true;
    }
    if ((com.tencent.d.a.a.cml()) && (!this.xDh))
    {
      com.tencent.d.a.c.c.i("Soter.TaskPrepareAppSecureKey", "soter: already has ask. do not need generate again", new Object[0]);
      b(new com.tencent.d.b.a.c(com.tencent.d.a.a.cmm()));
      return true;
    }
    if (this.xDg == null) {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload ASK validation from server! Please make sure you upload it later", new Object[0]);
    }
    return false;
  }
  
  final void cmD()
  {
    com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: cancelled prepare ask", new Object[0]);
    com.tencent.d.a.a.cmk();
  }
  
  final void execute()
  {
    dq(d.cmr().xBJ, 1);
    b.a locala = new b.a();
    boolean bool = this.xDh;
    locala.xCd |= 0x1;
    locala.xCf = bool;
    locala.xCh = new com.tencent.d.b.d.a()
    {
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        com.tencent.d.a.c.c.w("Soter.TaskPrepareAppSecureKey", "soter: app secure key generate failed. errcode: %d, errmsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        j.dq(d.cmr().xBJ, 0);
        j.this.b(new com.tencent.d.b.a.c(paramAnonymousInt, paramAnonymousString));
      }
      
      public final void onSuccess()
      {
        com.tencent.d.a.c.c.i("Soter.TaskPrepareAppSecureKey", "soter: app secure key generate successfully. start upload ask", new Object[0]);
        if (j.this.xDg != null) {
          j.dq(d.cmr().xBJ, 2);
        }
        j localj;
        g localg;
        for (;;)
        {
          localj = j.this;
          localg = com.tencent.d.a.a.cmm();
          if (localg != null) {
            break;
          }
          com.tencent.d.a.c.c.e("Soter.TaskPrepareAppSecureKey", "soter: ask model is null even after generation. fatal error", new Object[0]);
          com.tencent.d.a.a.cmk();
          localj.b(new com.tencent.d.b.a.c(3, "ask model is null even after generation."));
          return;
          j.dq(d.cmr().xBJ, 0);
        }
        if (localj.xDg != null)
        {
          localj.xDg.aW(new e.a(localg.signature, localg.xBM));
          localj.xDg.a(new j.2(localj, localg));
          localj.xDg.execute();
          return;
        }
        com.tencent.d.a.c.c.d("Soter.TaskPrepareAppSecureKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new Object[0]);
        localj.b(new com.tencent.d.b.a.c("treat as normal because you do not provide the net wrapper", localg));
      }
    };
    locala.cmA().cmz();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */