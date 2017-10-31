package com.tencent.mm.plugin.appbrand.o;

import com.tencent.gmtrace.GMTrace;

public final class i
  implements k
{
  final k jwv;
  int jww;
  int jwx;
  int jwy;
  Object jwz;
  
  public i(k paramk)
  {
    GMTrace.i(10012910944256L, 74602);
    this.jww = 0;
    this.jwx = -1;
    this.jwy = -1;
    this.jwz = null;
    this.jwv = paramk;
    GMTrace.o(10012910944256L, 74602);
  }
  
  public final void aba()
  {
    GMTrace.i(10013045161984L, 74603);
    if (this.jww == 0)
    {
      GMTrace.o(10013045161984L, 74603);
      return;
    }
    switch (this.jww)
    {
    }
    for (;;)
    {
      this.jwz = null;
      this.jww = 0;
      GMTrace.o(10013045161984L, 74603);
      return;
      this.jwv.bv(this.jwx, this.jwy);
      continue;
      this.jwv.bw(this.jwx, this.jwy);
      continue;
      this.jwv.d(this.jwx, this.jwy, this.jwz);
    }
  }
  
  public final void bv(int paramInt1, int paramInt2)
  {
    GMTrace.i(10013179379712L, 74604);
    if ((this.jww == 1) && (paramInt1 >= this.jwx) && (paramInt1 <= this.jwx + this.jwy))
    {
      this.jwy += paramInt2;
      this.jwx = Math.min(paramInt1, this.jwx);
      GMTrace.o(10013179379712L, 74604);
      return;
    }
    aba();
    this.jwx = paramInt1;
    this.jwy = paramInt2;
    this.jww = 1;
    GMTrace.o(10013179379712L, 74604);
  }
  
  public final void bw(int paramInt1, int paramInt2)
  {
    GMTrace.i(10013313597440L, 74605);
    if ((this.jww == 2) && (this.jwx >= paramInt1) && (this.jwx <= paramInt1 + paramInt2))
    {
      this.jwy += paramInt2;
      this.jwx = paramInt1;
      GMTrace.o(10013313597440L, 74605);
      return;
    }
    aba();
    this.jwx = paramInt1;
    this.jwy = paramInt2;
    this.jww = 2;
    GMTrace.o(10013313597440L, 74605);
  }
  
  public final void bx(int paramInt1, int paramInt2)
  {
    GMTrace.i(10013447815168L, 74606);
    aba();
    this.jwv.bx(paramInt1, paramInt2);
    GMTrace.o(10013447815168L, 74606);
  }
  
  public final void d(int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(10013582032896L, 74607);
    if ((this.jww == 3) && (paramInt1 <= this.jwx + this.jwy) && (paramInt1 + paramInt2 >= this.jwx) && (this.jwz == paramObject))
    {
      int i = this.jwx;
      int j = this.jwy;
      this.jwx = Math.min(paramInt1, this.jwx);
      this.jwy = (Math.max(i + j, paramInt1 + paramInt2) - this.jwx);
      GMTrace.o(10013582032896L, 74607);
      return;
    }
    aba();
    this.jwx = paramInt1;
    this.jwy = paramInt2;
    this.jwz = paramObject;
    this.jww = 3;
    GMTrace.o(10013582032896L, 74607);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/o/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */