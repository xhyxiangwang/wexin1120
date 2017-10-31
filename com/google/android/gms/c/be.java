package com.google.android.gms.c;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class be
{
  protected volatile int axr = -1;
  
  public static final <T extends be> T a(T paramT, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new aw(paramArrayOfByte, 0, paramInt);
      paramT.a(paramArrayOfByte);
      paramArrayOfByte.ch(0);
      return paramT;
    }
    catch (bd paramT)
    {
      throw paramT;
    }
    catch (IOException paramT)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public static final byte[] c(be parambe)
  {
    byte[] arrayOfByte = new byte[parambe.mi()];
    int i = arrayOfByte.length;
    try
    {
      ax localax = ax.b(arrayOfByte, 0, i);
      parambe.a(localax);
      if (localax.axf.remaining() != 0) {
        throw new IllegalStateException("Did not write as much data as expected.");
      }
    }
    catch (IOException parambe)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", parambe);
    }
    return arrayOfByte;
  }
  
  public abstract be a(aw paramaw);
  
  public void a(ax paramax) {}
  
  public be lX()
  {
    return (be)super.clone();
  }
  
  protected int ll()
  {
    return 0;
  }
  
  public final int mh()
  {
    if (this.axr < 0) {
      mi();
    }
    return this.axr;
  }
  
  public final int mi()
  {
    int i = ll();
    this.axr = i;
    return i;
  }
  
  public String toString()
  {
    return bf.d(this);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */