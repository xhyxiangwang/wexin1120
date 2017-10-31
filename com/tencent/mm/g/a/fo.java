package com.tencent.mm.g.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.b.b;

public final class fo
  extends b
{
  public a fBa;
  public b fBb;
  
  public fo()
  {
    this((byte)0);
    GMTrace.i(4196854136832L, 31269);
    GMTrace.o(4196854136832L, 31269);
  }
  
  private fo(byte paramByte)
  {
    GMTrace.i(4196988354560L, 31270);
    this.fBa = new a();
    this.fBb = new b();
    this.uLs = false;
    this.fwM = null;
    GMTrace.o(4196988354560L, 31270);
  }
  
  public static final class a
  {
    public Context context;
    public sp fBc;
    public ImageView fBd;
    public int fBe;
    public boolean fBf;
    public boolean fBg;
    public boolean fBh;
    public long fwq;
    public int height;
    public int maxWidth;
    public int opType;
    public int width;
    
    public a()
    {
      GMTrace.i(4310133899264L, 32113);
      this.opType = -1;
      this.fBf = false;
      this.fBg = false;
      this.fBh = true;
      GMTrace.o(4310133899264L, 32113);
    }
  }
  
  public static final class b
  {
    public Bitmap fBi;
    public int ret;
    
    public b()
    {
      GMTrace.i(4295772602368L, 32006);
      this.ret = -1;
      GMTrace.o(4295772602368L, 32006);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/a/fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */