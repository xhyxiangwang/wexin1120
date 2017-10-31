package com.google.android.gms.common.data;

import java.util.ArrayList;

public abstract class h<T>
  extends a<T>
{
  private boolean ajE = false;
  private ArrayList<Integer> ajF;
  
  public h(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  private int ca(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.ajF.size())) {
      throw new IllegalArgumentException("Position " + paramInt + " is out of bounds for this buffer");
    }
    return ((Integer)this.ajF.get(paramInt)).intValue();
  }
  
  private void kr()
  {
    for (;;)
    {
      int i;
      String str2;
      try
      {
        if (this.ajE) {
          break label190;
        }
        int j = this.ajg.ajr;
        this.ajF = new ArrayList();
        if (j <= 0) {
          break label185;
        }
        this.ajF.add(Integer.valueOf(0));
        String str3 = kq();
        i = this.ajg.bY(0);
        String str1 = this.ajg.b(str3, 0, i);
        i = 1;
        if (i >= j) {
          break label185;
        }
        int k = this.ajg.bY(i);
        str2 = this.ajg.b(str3, i, k);
        if (str2 == null) {
          throw new NullPointerException("Missing value for markerColumn: " + str3 + ", at row: " + i + ", for window: " + k);
        }
      }
      finally {}
      if (!str2.equals(localObject1))
      {
        this.ajF.add(Integer.valueOf(i));
        Object localObject2 = str2;
        break label193;
        label185:
        this.ajE = true;
        label190:
        return;
      }
      label193:
      i += 1;
    }
  }
  
  public abstract T ai(int paramInt1, int paramInt2);
  
  public final T get(int paramInt)
  {
    kr();
    int k = ca(paramInt);
    int j;
    if ((paramInt < 0) || (paramInt == this.ajF.size()))
    {
      j = 0;
      return (T)ai(k, j);
    }
    if (paramInt == this.ajF.size() - 1) {}
    for (int i = this.ajg.ajr - ((Integer)this.ajF.get(paramInt)).intValue();; i = ((Integer)this.ajF.get(paramInt + 1)).intValue() - ((Integer)this.ajF.get(paramInt)).intValue())
    {
      j = i;
      if (i != 1) {
        break;
      }
      paramInt = ca(paramInt);
      this.ajg.bY(paramInt);
      j = i;
      break;
    }
  }
  
  public final int getCount()
  {
    kr();
    return this.ajF.size();
  }
  
  public abstract String kq();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/data/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */