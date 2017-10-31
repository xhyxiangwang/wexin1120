package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.tencent.d.a.c.f;
import com.tencent.d.a.c.g;
import com.tencent.d.b.d.b.a;
import com.tencent.d.b.e.e;
import com.tencent.d.b.e.e.a;
import com.tencent.d.b.e.e.b;

public final class k
  extends c
{
  private int hJp = -1;
  public String xCe = null;
  private boolean xDh = false;
  public e xDk = null;
  private e xDl = null;
  private boolean xDm = false;
  
  public k(int paramInt, e parame1, e parame2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.hJp = paramInt;
    this.xDk = parame1;
    this.xDh = paramBoolean1;
    this.xDm = true;
    this.xDl = parame2;
  }
  
  @SuppressLint({"DefaultLocale"})
  final boolean cmC()
  {
    if (!com.tencent.d.b.b.a.cmt().isInit())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: not initialized yet", new Object[0]);
      b(new com.tencent.d.b.a.c(14));
      return true;
    }
    if (!com.tencent.d.b.b.a.cmt().cms())
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: not support soter", new Object[0]);
      b(new com.tencent.d.b.a.c(2));
      return true;
    }
    this.xCe = ((String)com.tencent.d.b.b.a.cmt().cmv().get(this.hJp, ""));
    if (f.mZ(this.xCe))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new Object[0]);
      b(new com.tencent.d.b.a.c(15, String.format("auth scene %d not initialized in map", new Object[] { Integer.valueOf(this.hJp) })));
      return true;
    }
    if ((!com.tencent.d.a.a.cml()) && (com.tencent.d.a.a.Xx(this.xCe)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: no ask but has auth key. delete the auth key as well", new Object[0]);
      com.tencent.d.a.a.bh(this.xCe, false);
    }
    if ((!com.tencent.d.a.a.cml()) && (!this.xDm))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: has not generate app secure key yet and not require to generate it", new Object[0]);
      b(new com.tencent.d.b.a.c(3));
      return true;
    }
    if ((com.tencent.d.a.a.Xx(this.xCe)) && (!com.tencent.d.a.a.Xy(this.xCe)))
    {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: already has auth key but not valid. delete it already and re-generate", new Object[0]);
      return false;
    }
    if ((com.tencent.d.a.a.Xx(this.xCe)) && (!this.xDh))
    {
      com.tencent.d.a.c.c.i("Soter.TaskPrepareAuthKey", "soter: already has key. do not need generate again", new Object[0]);
      b(new com.tencent.d.b.a.c(com.tencent.d.a.a.Xz(this.xCe)));
      return true;
    }
    if (this.xDk == null) {
      com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: it is strongly recommended that you provide a net wrapper to check and upload AuthKey validation from server! Please make sure you upload it later", new Object[0]);
    }
    return false;
  }
  
  final void cmD()
  {
    com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: cancelled prepare authkey: %s", new Object[] { this.xCe });
    com.tencent.d.a.a.bh(this.xCe, false);
  }
  
  public final void cmJ()
  {
    dq(this.xCe, 1);
    b.a locala = new b.a();
    String str = this.xCe;
    boolean bool = this.xDh;
    locala.xCe = str;
    locala.xCg = bool;
    locala.xCd |= 0x2;
    locala.xCh = new com.tencent.d.b.d.a()
    {
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        com.tencent.d.a.c.c.w("Soter.TaskPrepareAuthKey", "soter: auth key %s generate failed. errcode: %d, errmsg: %s", new Object[] { k.this.xCe, Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        k.dq(k.this.xCe, 0);
        k.this.b(new com.tencent.d.b.a.c(paramAnonymousInt, paramAnonymousString));
      }
      
      public final void onSuccess()
      {
        com.tencent.d.a.c.c.i("Soter.TaskPrepareAuthKey", "soter: auth key generate successfully. start upload", new Object[0]);
        if (k.this.xDk != null) {
          k.dq(k.this.xCe, 2);
        }
        k localk;
        g localg;
        for (;;)
        {
          localk = k.this;
          localg = com.tencent.d.a.a.Xz(localk.xCe);
          if (localg != null) {
            break;
          }
          com.tencent.d.a.c.c.e("Soter.TaskPrepareAuthKey", "soter: auth key model is null even after generation. fatal error", new Object[0]);
          com.tencent.d.a.a.bh(localk.xCe, false);
          localk.b(new com.tencent.d.b.a.c(12, "auth key model is null even after generation."));
          return;
          k.dq(k.this.xCe, 0);
        }
        if (localk.xDk != null)
        {
          localk.xDk.aW(new e.a(localg.signature, localg.xBM));
          localk.xDk.a(new k.3(localk, localg));
          localk.xDk.execute();
          return;
        }
        com.tencent.d.a.c.c.d("Soter.TaskPrepareAuthKey", "soter: not provide network wrapper instance. please check if it is what you want. we treat it as normal", new Object[0]);
        localk.b(new com.tencent.d.b.a.c("treat as normal because you do not provide the net wrapper", localg));
      }
    };
    locala.cmA().cmz();
  }
  
  final void execute()
  {
    if ((!com.tencent.d.a.a.cml()) && (this.xDm))
    {
      com.tencent.d.a.c.c.d("Soter.TaskPrepareAuthKey", "soter: ask not found, but required to generate it. start generate", new Object[0]);
      com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, false, this.xDl);
      return;
    }
    cmJ();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */