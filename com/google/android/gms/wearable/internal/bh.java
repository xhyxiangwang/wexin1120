package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.f;

public final class bh
  implements d
{
  private f aCE;
  private int aji;
  
  public bh(d paramd)
  {
    this.aji = paramd.getType();
    this.aCE = ((f)paramd.nd().kp());
  }
  
  public final int getType()
  {
    return this.aji;
  }
  
  public final f nd()
  {
    return this.aCE;
  }
  
  public final String toString()
  {
    String str;
    if (this.aji == 1) {
      str = "changed";
    }
    for (;;)
    {
      return "DataEventEntity{ type=" + str + ", dataitem=" + this.aCE + " }";
      if (this.aji == 2) {
        str = "deleted";
      } else {
        str = "unknown";
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */