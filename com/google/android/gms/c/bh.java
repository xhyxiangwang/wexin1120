package com.google.android.gms.c;

public final class bh
{
  public static final byte[] axA = new byte[0];
  public static final int[] axt = new int[0];
  public static final long[] axu = new long[0];
  public static final float[] axv = new float[0];
  public static final double[] axw = new double[0];
  public static final boolean[] axx = new boolean[0];
  public static final String[] axy = new String[0];
  public static final byte[][] axz = new byte[0][];
  
  static int am(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int b(aw paramaw, int paramInt)
  {
    int i = 1;
    int j = paramaw.getPosition();
    paramaw.ci(paramInt);
    while (paramaw.lM() == paramInt)
    {
      paramaw.ci(paramInt);
      i += 1;
    }
    paramaw.cl(j);
    return i;
  }
  
  static int cw(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int cx(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */