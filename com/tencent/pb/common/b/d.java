package com.tencent.pb.common.b;

import android.os.Handler;
import android.os.Looper;
import com.google.a.a.e;
import com.tencent.pb.common.c.g;

public abstract class d
  implements c
{
  private final long hnd = 60000L;
  Runnable hni = new Runnable()
  {
    public final void run()
    {
      d.this.kek = true;
      com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "NETTASK_RECV TimeOut cmd= ", d.this.cjy() });
      g.z(20006, 3, "-1104");
      if (d.this.xnd != null) {
        d.this.xnd.a(2, -1, "time exceed, force to callback", d.this);
      }
    }
  };
  private int keB = 64537;
  public boolean kek = false;
  Handler mHandler = new Handler(Looper.getMainLooper());
  public int mwe = 2;
  public boolean xnb = false;
  public final String xnc = getClass().getSimpleName();
  public b xnd = null;
  public byte[] xne = null;
  public Object xnf = null;
  public int xng;
  public int xnh = 0;
  
  public abstract Object bv(byte[] paramArrayOfByte);
  
  public final void c(int paramInt, e parame)
  {
    this.xng = paramInt;
    Object localObject = null;
    try
    {
      parame = e.b(parame);
      this.xne = parame;
      return;
    }
    catch (Exception parame)
    {
      for (;;)
      {
        parame = (e)localObject;
      }
    }
  }
  
  public abstract String cjy();
  
  public abstract int getType();
  
  public final void n(final int paramInt, byte[] paramArrayOfByte)
  {
    final int i = 2;
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xnc, "onResp errcode", Integer.valueOf(paramInt) });
    this.mHandler.removeCallbacks(this.hni);
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "NETTASK_RECV onResp:cmd= ", cjy(), Integer.valueOf(paramInt), Boolean.valueOf(this.kek) });
    if (paramInt != 0)
    {
      com.tencent.pb.common.c.c.k("MicroMsg.Voip", new Object[] { this.xnc, "getNetworkErrType errcode:" + paramInt });
      if (paramInt == -1) {
        if (h.isNetworkConnected()) {
          i = 1;
        }
      }
    }
    for (;;)
    {
      if (this.kek)
      {
        com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { "onResp netscene already canceled, cmd:" + this.xng });
        return;
        if (paramInt == 6801) {
          i = 10;
        } else {
          i = 4;
        }
      }
      else
      {
        if (this.xnb) {
          "".length();
        }
        this.keB = paramInt;
        this.xnf = bv(paramArrayOfByte);
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            if (d.this.kek) {
              com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { d.this.xnc, "onResp netscene already canceled, cmd:" + d.this.xng });
            }
            while (d.this.xnd == null) {
              return;
            }
            d.this.xnd.a(i, paramInt, "", d.this);
          }
        });
        return;
        i = 0;
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */