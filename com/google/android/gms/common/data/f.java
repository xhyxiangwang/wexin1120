package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;

public abstract class f
{
  public int ajC;
  private int ajD;
  public final DataHolder ajg;
  
  public f(DataHolder paramDataHolder, int paramInt)
  {
    this.ajg = ((DataHolder)w.aa(paramDataHolder));
    if ((paramInt >= 0) && (paramInt < this.ajg.ajr)) {}
    for (boolean bool = true;; bool = false)
    {
      w.ae(bool);
      this.ajC = paramInt;
      this.ajD = this.ajg.bY(this.ajC);
      return;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      bool1 = bool2;
      if (v.d(Integer.valueOf(((f)paramObject).ajC), Integer.valueOf(this.ajC)))
      {
        bool1 = bool2;
        if (v.d(Integer.valueOf(((f)paramObject).ajD), Integer.valueOf(this.ajD)))
        {
          bool1 = bool2;
          if (((f)paramObject).ajg == this.ajg) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final byte[] getByteArray(String paramString)
  {
    DataHolder localDataHolder = this.ajg;
    int i = this.ajC;
    int j = this.ajD;
    localDataHolder.g(paramString, i);
    return localDataHolder.ajo[j].getBlob(i, localDataHolder.ajn.getInt(paramString));
  }
  
  public final int getInteger(String paramString)
  {
    DataHolder localDataHolder = this.ajg;
    int i = this.ajC;
    int j = this.ajD;
    localDataHolder.g(paramString, i);
    return localDataHolder.ajo[j].getInt(i, localDataHolder.ajn.getInt(paramString));
  }
  
  public final String getString(String paramString)
  {
    return this.ajg.b(paramString, this.ajC, this.ajD);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.ajC), Integer.valueOf(this.ajD), this.ajg });
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/data/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */