package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
  implements f
{
  private byte[] aAn;
  private Map<String, g> aBz;
  private Uri ajO;
  
  public d(f paramf)
  {
    this.ajO = paramf.getUri();
    this.aAn = paramf.getData();
    HashMap localHashMap = new HashMap();
    paramf = paramf.ne().entrySet().iterator();
    while (paramf.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramf.next();
      if (localEntry.getKey() != null) {
        localHashMap.put(localEntry.getKey(), ((g)localEntry.getValue()).kp());
      }
    }
    this.aBz = Collections.unmodifiableMap(localHashMap);
  }
  
  public final byte[] getData()
  {
    return this.aAn;
  }
  
  public final Uri getUri()
  {
    return this.ajO;
  }
  
  public final Map<String, g> ne()
  {
    return this.aBz;
  }
  
  public final String toString()
  {
    boolean bool = Log.isLoggable("DataItem", 3);
    StringBuilder localStringBuilder = new StringBuilder("DataItemEntity{ ");
    localStringBuilder.append("uri=" + this.ajO);
    Object localObject2 = new StringBuilder(", dataSz=");
    if (this.aAn == null) {}
    for (Object localObject1 = "null";; localObject1 = Integer.valueOf(this.aAn.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + this.aBz.size());
      if ((!bool) || (this.aBz.isEmpty())) {
        break label249;
      }
      localStringBuilder.append(", assets=[");
      localObject2 = this.aBz.entrySet().iterator();
      for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = ", ")
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        localStringBuilder.append((String)localObject1 + (String)localEntry.getKey() + ": " + ((g)localEntry.getValue()).getId());
      }
    }
    localStringBuilder.append("]");
    label249:
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */