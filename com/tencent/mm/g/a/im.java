package com.tencent.mm.g.a;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.sdk.b.b;

public final class im
  extends b
{
  public a fFd;
  public b fFe;
  
  public im()
  {
    this((byte)0);
    GMTrace.i(4281008652288L, 31896);
    GMTrace.o(4281008652288L, 31896);
  }
  
  private im(byte paramByte)
  {
    GMTrace.i(4281142870016L, 31897);
    this.fFd = new a();
    this.fFe = new b();
    this.uLs = false;
    this.fwM = null;
    GMTrace.o(4281142870016L, 31897);
  }
  
  public static final class a
  {
    public int fFf;
    public String fFg;
    public float fFh;
    public float fFi;
    public int fFj;
    public String filename;
    public k fxe;
    public int height;
    public View view;
    public int width;
    
    public a()
    {
      GMTrace.i(4292148723712L, 31979);
      this.fFf = 0;
      this.fFh = 0.0F;
      this.fFi = 0.0F;
      this.width = 0;
      this.height = 0;
      this.fFj = 0;
      GMTrace.o(4292148723712L, 31979);
    }
  }
  
  public static final class b
  {
    public String path;
    
    public b()
    {
      GMTrace.i(4279934910464L, 31888);
      GMTrace.o(4279934910464L, 31888);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/a/im.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */