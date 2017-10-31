package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;

public final class b
{
  public static final int agK = e.agK;
  private static final b agL = new b();
  
  public static Intent bQ(int paramInt)
  {
    return e.bR(paramInt);
  }
  
  public static b jH()
  {
    return agL;
  }
  
  public static boolean l(Context paramContext, int paramInt)
  {
    return e.l(paramContext, paramInt);
  }
  
  public static int x(Context paramContext)
  {
    int j = e.x(paramContext);
    int i = j;
    if (e.l(paramContext, j)) {
      i = 18;
    }
    return i;
  }
  
  public static void y(Context paramContext)
  {
    e.y(paramContext);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */