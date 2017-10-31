package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.g;

public final class bj
  implements g
{
  private final String abS;
  private final String auC;
  
  public bj(g paramg)
  {
    this.abS = paramg.getId();
    this.auC = paramg.nf();
  }
  
  public final String getId()
  {
    return this.abS;
  }
  
  public final String nf()
  {
    return this.auC;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetEntity[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.abS == null) {
      localStringBuilder.append(",noid");
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(this.auC);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(this.abS);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */