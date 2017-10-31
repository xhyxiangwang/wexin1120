package com.tencent.d.b.d;

import com.tencent.d.a.c.e;
import com.tencent.d.a.c.f;
import com.tencent.d.b.f.g;

public final class b
{
  public int xCd = 0;
  public String xCe = "";
  public boolean xCf = false;
  public boolean xCg = false;
  private a xCh = null;
  private boolean xCi = false;
  
  public b(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, a parama)
  {
    this.xCd = paramInt;
    this.xCe = paramString;
    this.xCf = paramBoolean1;
    this.xCg = paramBoolean2;
    this.xCh = parama;
  }
  
  public final void a(e parame)
  {
    if ((this.xCh != null) && (!this.xCi))
    {
      if (parame == null) {
        break label60;
      }
      if (!parame.isSuccess()) {
        break label40;
      }
      this.xCh.onSuccess();
    }
    for (;;)
    {
      this.xCi = true;
      return;
      label40:
      this.xCh.onError(parame.errCode, parame.ftU);
      continue;
      label60:
      this.xCh.onError(-1, "unknown");
    }
  }
  
  public final void cmz()
  {
    g.cmG().x(new Runnable()
    {
      public final void run()
      {
        Object localObject = b.this;
        if ((((b)localObject).xCd & 0x1) != 1) {
          if ((((b)localObject).xCd & 0x2) == 2)
          {
            if (!f.mZ(((b)localObject).xCe)) {
              break label99;
            }
            com.tencent.d.a.c.c.e("Soter.SoterKeyGenerateEngine", "soter: not pass auth key name", new Object[0]);
            localObject = new com.tencent.d.b.a.c(1, "auth key name not specified");
            if (((com.tencent.d.b.a.c)localObject).isSuccess()) {
              break label111;
            }
            b.this.a((e)localObject);
          }
        }
        label99:
        label111:
        do
        {
          return;
          com.tencent.d.a.c.c.e("Soter.SoterKeyGenerateEngine", "soter: not specified purpose", new Object[0]);
          localObject = new com.tencent.d.b.a.c(7, "not specified purpose. did you for get to call markGenAppSecureKey or/and markGenAuthKey?");
          break;
          localObject = new com.tencent.d.b.a.c(0);
          break;
          if (!com.tencent.d.a.a.cmi())
          {
            com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: native not support soter", new Object[0]);
            b.this.a(new com.tencent.d.b.a.c(2));
            return;
          }
          if ((b.this.xCd & 0x1) == 1)
          {
            com.tencent.d.a.c.c.d("Soter.SoterKeyGenerateEngine", "soter: require generate ask. start gen", new Object[0]);
            if ((b.this.xCf) && (com.tencent.d.a.a.cml()))
            {
              com.tencent.d.a.c.c.d("Soter.SoterKeyGenerateEngine", "soter: request regen ask. remove former one", new Object[0]);
              localObject = com.tencent.d.a.a.cmk();
              if (!((e)localObject).isSuccess())
              {
                com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: remove ask failed: %s", new Object[] { ((e)localObject).ftU });
                b.this.a((e)localObject);
                return;
              }
            }
            localObject = com.tencent.d.a.a.cmj();
            if (!((e)localObject).isSuccess())
            {
              com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: generate ask failed: %s", new Object[] { ((e)localObject).ftU });
              com.tencent.d.a.a.cmk();
              b.this.a((e)localObject);
              return;
            }
            com.tencent.d.a.c.c.i("Soter.SoterKeyGenerateEngine", "soter: generate ask success!", new Object[0]);
            b.this.a((e)localObject);
          }
        } while ((b.this.xCd & 0x2) != 2);
        com.tencent.d.a.c.c.d("Soter.SoterKeyGenerateEngine", "soter: require generate auth key. start gen: %s", new Object[] { b.this.xCe });
        if (!com.tencent.d.a.a.cml())
        {
          com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: no ask.", new Object[0]);
          b.this.a(new com.tencent.d.b.a.c(3, "ASK not exists when generate auth key"));
          return;
        }
        if ((b.this.xCg) && (com.tencent.d.a.a.Xx(b.this.xCe)))
        {
          com.tencent.d.a.c.c.d("Soter.SoterKeyGenerateEngine", "soter: request regen auth key. remove former one", new Object[0]);
          localObject = com.tencent.d.a.a.bh(b.this.xCe, false);
          if (!((e)localObject).isSuccess())
          {
            com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: remove auth key %s, failed: %s", new Object[] { b.this.xCe, ((e)localObject).ftU });
            b.this.a((e)localObject);
            return;
          }
        }
        localObject = com.tencent.d.a.a.Xw(b.this.xCe);
        if (!((e)localObject).isSuccess())
        {
          com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: generate auth key %s failed: %s", new Object[] { b.this.xCe, ((e)localObject).ftU });
          com.tencent.d.a.a.bh(b.this.xCe, true);
          b.this.a((e)localObject);
          return;
        }
        com.tencent.d.a.c.c.i("Soter.SoterKeyGenerateEngine", "soter: generate auth key success!", new Object[0]);
        b.this.a((e)localObject);
      }
    });
  }
  
  public static final class a
  {
    public int xCd = 0;
    public String xCe = "";
    public boolean xCf = false;
    public boolean xCg = false;
    public a xCh = null;
    
    public final b cmA()
    {
      return new b(this.xCd, this.xCe, this.xCf, this.xCg, this.xCh);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */