package com.google.a.a;

public final class g
{
  public static final String[] EMPTY_STRING_ARRAY = new String[0];
  public static final int[] aCZ = new int[0];
  public static final long[] aDa = new long[0];
  public static final float[] aDb = new float[0];
  public static final double[] aDc = new double[0];
  public static final boolean[] aDd = new boolean[0];
  public static final byte[][] aDe = new byte[0][];
  public static final byte[] aDf = new byte[0];
  
  public static boolean a(a parama, int paramInt)
  {
    return parama.cC(paramInt);
  }
  
  static int at(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int b(a parama, int paramInt)
  {
    int i = 1;
    int j = parama.getPosition();
    parama.cC(paramInt);
    while (parama.nl() == paramInt)
    {
      parama.cC(paramInt);
      i += 1;
    }
    parama.cF(j);
    return i;
  }
  
  static int cN(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int cO(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */