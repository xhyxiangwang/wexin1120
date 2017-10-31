package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.d;

public final class bi
  extends com.google.android.gms.common.data.f
  implements d
{
  private final int aBS;
  
  public bi(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.aBS = paramInt2;
  }
  
  public final int getType()
  {
    return getInteger("event_type");
  }
  
  public final com.google.android.gms.wearable.f nd()
  {
    return new f(this.ajg, this.ajC, this.aBS);
  }
  
  public final String toString()
  {
    String str;
    if (getInteger("event_type") == 1) {
      str = "changed";
    }
    for (;;)
    {
      return "DataEventRef{ type=" + str + ", dataitem=" + nd() + " }";
      if (getInteger("event_type") == 2) {
        str = "deleted";
      } else {
        str = "unknown";
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */