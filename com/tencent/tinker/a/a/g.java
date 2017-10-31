package com.tencent.tinker.a.a;

public final class g
  extends t.a.a<g>
{
  public int xDV;
  public int xDW;
  public int xDX;
  public int xDY;
  public short[] xDZ;
  public b[] xEa;
  public a[] xEb;
  
  public g(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, short[] paramArrayOfShort, b[] paramArrayOfb, a[] paramArrayOfa)
  {
    super(paramInt1);
    this.xDV = paramInt2;
    this.xDW = paramInt3;
    this.xDX = paramInt4;
    this.xDY = paramInt5;
    this.xDZ = paramArrayOfShort;
    this.xEa = paramArrayOfb;
    this.xEb = paramArrayOfa;
  }
  
  public static final class a
    implements Comparable<a>
  {
    public int offset;
    public int[] xEc;
    public int[] xEd;
    public int xEe;
    
    public a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2)
    {
      this.xEc = paramArrayOfInt1;
      this.xEd = paramArrayOfInt2;
      this.xEe = paramInt1;
      this.offset = paramInt2;
    }
  }
  
  public static final class b
    implements Comparable<b>
  {
    public int xEf;
    public int xEg;
    public int xEh;
    
    public b(int paramInt1, int paramInt2, int paramInt3)
    {
      this.xEf = paramInt1;
      this.xEg = paramInt2;
      this.xEh = paramInt3;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/tinker/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */