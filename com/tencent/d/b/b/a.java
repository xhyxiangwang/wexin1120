package com.tencent.d.b.b;

import android.content.SharedPreferences;
import android.util.SparseArray;

public class a
{
  private static a xBX = null;
  private boolean fvn = false;
  private boolean isInit = false;
  private SparseArray<String> xBY = new SparseArray(10);
  public SharedPreferences xBZ = null;
  
  public static a cmt()
  {
    if (xBX == null) {
      try
      {
        if (xBX == null) {
          xBX = new a();
        }
        a locala = xBX;
        return locala;
      }
      finally {}
    }
    return xBX;
  }
  
  public final boolean cms()
  {
    try
    {
      boolean bool = this.fvn;
      return bool;
    }
    finally {}
  }
  
  public final void cmu()
  {
    try
    {
      this.isInit = true;
      return;
    }
    finally {}
  }
  
  public final SparseArray<String> cmv()
  {
    try
    {
      SparseArray localSparseArray = this.xBY;
      return localSparseArray;
    }
    finally {}
  }
  
  public final SharedPreferences cmw()
  {
    try
    {
      SharedPreferences localSharedPreferences = this.xBZ;
      return localSharedPreferences;
    }
    finally {}
  }
  
  public final boolean isInit()
  {
    try
    {
      boolean bool = this.isInit;
      return bool;
    }
    finally {}
  }
  
  public final void mN(boolean paramBoolean)
  {
    try
    {
      this.fvn = paramBoolean;
      return;
    }
    finally {}
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/d/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */