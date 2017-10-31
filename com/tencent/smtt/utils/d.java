package com.tencent.smtt.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public final class d
  implements Closeable
{
  private final File iBj;
  public final RandomAccessFile xzJ;
  private final byte[] xzK = new byte[8];
  public boolean xzL;
  
  private d(File paramFile)
  {
    this.iBj = paramFile;
    this.xzJ = new RandomAccessFile(this.iBj, "r");
  }
  
  public d(String paramString)
  {
    this(new File(paramString));
  }
  
  public final int a(char[] paramArrayOfChar)
  {
    byte[] arrayOfByte = new byte[paramArrayOfChar.length];
    int j = this.xzJ.read(arrayOfByte);
    int i = 0;
    while (i < paramArrayOfChar.length)
    {
      paramArrayOfChar[i] = ((char)arrayOfByte[i]);
      i += 1;
    }
    return j;
  }
  
  public final void close()
  {
    try
    {
      this.xzJ.close();
      return;
    }
    catch (IOException localIOException)
    {
      System.out.println(localIOException);
    }
  }
  
  public final int readInt()
  {
    int j = this.xzJ.readInt();
    int i = j;
    if (this.xzL) {
      i = (j & 0xFF000000) >>> 24 | (j & 0xFF) << 24 | (0xFF00 & j) << 8 | (0xFF0000 & j) >>> 8;
    }
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/utils/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */