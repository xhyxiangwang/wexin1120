package com.google.android.gms.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class bb
  implements Cloneable
{
  private az<?, ?> axn;
  private Object axo;
  List<bg> axp = new ArrayList();
  
  private byte[] toByteArray()
  {
    byte[] arrayOfByte = new byte[ll()];
    a(ax.b(arrayOfByte, 0, arrayOfByte.length));
    return arrayOfByte;
  }
  
  final void a(ax paramax)
  {
    if (this.axo != null) {
      this.axn.a(this.axo, paramax);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.axp.iterator();
      while (localIterator.hasNext())
      {
        bg localbg = (bg)localIterator.next();
        paramax.cr(localbg.tag);
        paramax.g(localbg.axs);
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paramObject instanceof bb));
      paramObject = (bb)paramObject;
      if ((this.axo == null) || (((bb)paramObject).axo == null)) {
        break;
      }
      bool1 = bool2;
    } while (this.axn != ((bb)paramObject).axn);
    if (!this.axn.axh.isArray()) {
      return this.axo.equals(((bb)paramObject).axo);
    }
    if ((this.axo instanceof byte[])) {
      return Arrays.equals((byte[])this.axo, (byte[])((bb)paramObject).axo);
    }
    if ((this.axo instanceof int[])) {
      return Arrays.equals((int[])this.axo, (int[])((bb)paramObject).axo);
    }
    if ((this.axo instanceof long[])) {
      return Arrays.equals((long[])this.axo, (long[])((bb)paramObject).axo);
    }
    if ((this.axo instanceof float[])) {
      return Arrays.equals((float[])this.axo, (float[])((bb)paramObject).axo);
    }
    if ((this.axo instanceof double[])) {
      return Arrays.equals((double[])this.axo, (double[])((bb)paramObject).axo);
    }
    if ((this.axo instanceof boolean[])) {
      return Arrays.equals((boolean[])this.axo, (boolean[])((bb)paramObject).axo);
    }
    return Arrays.deepEquals((Object[])this.axo, (Object[])((bb)paramObject).axo);
    if ((this.axp != null) && (((bb)paramObject).axp != null)) {
      return this.axp.equals(((bb)paramObject).axp);
    }
    try
    {
      bool1 = Arrays.equals(toByteArray(), ((bb)paramObject).toByteArray());
      return bool1;
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(toByteArray());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
  
  public final bb lZ()
  {
    int i = 0;
    bb localbb = new bb();
    try
    {
      localbb.axn = this.axn;
      if (this.axp == null) {
        localbb.axp = null;
      }
      for (;;)
      {
        if (this.axo == null) {
          return localbb;
        }
        if (!(this.axo instanceof be)) {
          break;
        }
        localbb.axo = ((be)this.axo).lX();
        return localbb;
        localbb.axp.addAll(this.axp);
      }
      if (!(this.axo instanceof byte[])) {
        break label119;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    localCloneNotSupportedException.axo = ((byte[])this.axo).clone();
    return localCloneNotSupportedException;
    label119:
    Object localObject1;
    Object localObject2;
    if ((this.axo instanceof byte[][]))
    {
      localObject1 = (byte[][])this.axo;
      localObject2 = new byte[localObject1.length][];
      localCloneNotSupportedException.axo = localObject2;
      i = 0;
      while (i < localObject1.length)
      {
        localObject2[i] = ((byte[])localObject1[i].clone());
        i += 1;
      }
    }
    if ((this.axo instanceof boolean[]))
    {
      localCloneNotSupportedException.axo = ((boolean[])this.axo).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axo instanceof int[]))
    {
      localCloneNotSupportedException.axo = ((int[])this.axo).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axo instanceof long[]))
    {
      localCloneNotSupportedException.axo = ((long[])this.axo).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axo instanceof float[]))
    {
      localCloneNotSupportedException.axo = ((float[])this.axo).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axo instanceof double[]))
    {
      localCloneNotSupportedException.axo = ((double[])this.axo).clone();
      return localCloneNotSupportedException;
    }
    if ((this.axo instanceof be[]))
    {
      localObject1 = (be[])this.axo;
      localObject2 = new be[localObject1.length];
      localCloneNotSupportedException.axo = localObject2;
      while (i < localObject1.length)
      {
        localObject2[i] = localObject1[i].lX();
        i += 1;
      }
    }
    return localCloneNotSupportedException;
  }
  
  final int ll()
  {
    int j;
    if (this.axo != null)
    {
      j = this.axn.ae(this.axo);
      return j;
    }
    Iterator localIterator = this.axp.iterator();
    bg localbg;
    for (int i = 0;; i = localbg.axs.length + (j + 0) + i)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      localbg = (bg)localIterator.next();
      j = ax.cs(localbg.tag);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */