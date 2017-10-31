package com.google.android.gms.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class m<K, V>
  extends q<K, V>
  implements Map<K, V>
{
  p<K, V> auG;
  
  private p<K, V> lu()
  {
    if (this.auG == null) {
      this.auG = new p()
      {
        protected final void O(int paramAnonymousInt)
        {
          m.this.removeAt(paramAnonymousInt);
        }
        
        protected final V a(int paramAnonymousInt, V paramAnonymousV)
        {
          m localm = m.this;
          paramAnonymousInt = (paramAnonymousInt << 1) + 1;
          Object localObject = localm.vH[paramAnonymousInt];
          localm.vH[paramAnonymousInt] = paramAnonymousV;
          return (V)localObject;
        }
        
        protected final int bA()
        {
          return m.this.he;
        }
        
        protected final Map<K, V> bB()
        {
          return m.this;
        }
        
        protected final void bC()
        {
          m.this.clear();
        }
        
        protected final void c(K paramAnonymousK, V paramAnonymousV)
        {
          m.this.put(paramAnonymousK, paramAnonymousV);
        }
        
        protected final int g(Object paramAnonymousObject)
        {
          if (paramAnonymousObject == null) {
            return m.this.bG();
          }
          return m.this.indexOf(paramAnonymousObject, paramAnonymousObject.hashCode());
        }
        
        protected final int h(Object paramAnonymousObject)
        {
          return m.this.indexOfValue(paramAnonymousObject);
        }
        
        protected final Object j(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return m.this.vH[((paramAnonymousInt1 << 1) + paramAnonymousInt2)];
        }
      };
    }
    return this.auG;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    p localp = lu();
    if (localp.auO == null) {
      localp.auO = new p.b(localp);
    }
    return localp.auO;
  }
  
  public Set<K> keySet()
  {
    p localp = lu();
    if (localp.auP == null) {
      localp.auP = new p.c(localp);
    }
    return localp.auP;
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    int i = this.he + paramMap.size();
    Object localObject;
    if (this.vG.length < i)
    {
      localObject = this.vG;
      Object[] arrayOfObject = this.vH;
      super.cc(i);
      if (this.he > 0)
      {
        System.arraycopy(localObject, 0, this.vG, 0, this.he);
        System.arraycopy(arrayOfObject, 0, this.vH, 0, this.he << 1);
      }
      q.b((int[])localObject, arrayOfObject, this.he);
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject = (Map.Entry)paramMap.next();
      put(((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
    }
  }
  
  public Collection<V> values()
  {
    p localp = lu();
    if (localp.auQ == null) {
      localp.auQ = new p.e(localp);
    }
    return localp.auQ;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */