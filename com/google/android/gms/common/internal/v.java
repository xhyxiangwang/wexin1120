package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class v
{
  public static a Z(Object paramObject)
  {
    return new a(paramObject);
  }
  
  public static boolean d(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static final class a
  {
    private final List<String> alQ;
    private final Object alR;
    
    public a(Object paramObject)
    {
      this.alR = w.aa(paramObject);
      this.alQ = new ArrayList();
    }
    
    public final a g(String paramString, Object paramObject)
    {
      this.alQ.add((String)w.aa(paramString) + "=" + String.valueOf(paramObject));
      return this;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(100).append(this.alR.getClass().getSimpleName()).append('{');
      int j = this.alQ.size();
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append((String)this.alQ.get(i));
        if (i < j - 1) {
          localStringBuilder.append(", ");
        }
        i += 1;
      }
      return '}';
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */