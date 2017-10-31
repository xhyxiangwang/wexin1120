package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.h;

public final class e
  extends h<d>
  implements g
{
  public final Status azY;
  
  public e(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.azY = new Status(paramDataHolder.agH);
  }
  
  public final Status jW()
  {
    return this.azY;
  }
  
  protected final String kq()
  {
    return "path";
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */