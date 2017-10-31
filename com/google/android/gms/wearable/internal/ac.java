package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.n.a;
import java.util.List;

public final class ac
  implements n
{
  public final e<n.a> b(c paramc)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public static final class a
    implements n.a
  {
    private final List<m> aBZ;
    private final Status azY;
    
    public a(Status paramStatus, List<m> paramList)
    {
      this.azY = paramStatus;
      this.aBZ = paramList;
    }
    
    public final Status jW()
    {
      return this.azY;
    }
    
    public final List<m> ng()
    {
      return this.aBZ;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */