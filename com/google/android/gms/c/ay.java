package com.google.android.gms.c;

import java.util.List;

public abstract class ay<M extends ay<M>>
  extends be
{
  protected ba axg;
  
  private M lW()
  {
    ay localay = (ay)lX();
    bc.a(this, localay);
    return localay;
  }
  
  public void a(ax paramax)
  {
    if (this.axg == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.axg.size())
      {
        this.axg.cu(i).a(paramax);
        i += 1;
      }
    }
  }
  
  protected final boolean a(aw paramaw, int paramInt)
  {
    int i = paramaw.getPosition();
    if (!paramaw.ci(paramInt)) {
      return false;
    }
    int j = bh.cx(paramInt);
    int k = paramaw.getPosition() - i;
    bg localbg;
    label69:
    Object localObject;
    if (k == 0)
    {
      paramaw = bh.axA;
      localbg = new bg(paramInt, paramaw);
      if (this.axg != null) {
        break label162;
      }
      this.axg = new ba();
      paramaw = null;
      localObject = paramaw;
      if (paramaw == null)
      {
        paramaw = new bb();
        localObject = this.axg;
        paramInt = ((ba)localObject).cv(j);
        if (paramInt < 0) {
          break label205;
        }
        ((ba)localObject).axm[paramInt] = paramaw;
        localObject = paramaw;
      }
    }
    for (;;)
    {
      ((bb)localObject).axp.add(localbg);
      return true;
      localObject = new byte[k];
      int m = paramaw.awW;
      System.arraycopy(paramaw.buffer, i + m, localObject, 0, k);
      paramaw = (aw)localObject;
      break;
      label162:
      paramaw = this.axg;
      paramInt = paramaw.cv(j);
      if ((paramInt < 0) || (paramaw.axm[paramInt] == ba.axj))
      {
        paramaw = null;
        break label69;
      }
      paramaw = paramaw.axm[paramInt];
      break label69;
      label205:
      i = paramInt ^ 0xFFFFFFFF;
      if ((i < ((ba)localObject).he) && (localObject.axm[i] == ba.axj))
      {
        ((ba)localObject).axl[i] = j;
        ((ba)localObject).axm[i] = paramaw;
        localObject = paramaw;
      }
      else
      {
        paramInt = i;
        if (((ba)localObject).axk)
        {
          paramInt = i;
          if (((ba)localObject).he >= ((ba)localObject).axl.length)
          {
            ((ba)localObject).gc();
            paramInt = ((ba)localObject).cv(j) ^ 0xFFFFFFFF;
          }
        }
        if (((ba)localObject).he >= ((ba)localObject).axl.length)
        {
          i = ba.P(((ba)localObject).he + 1);
          int[] arrayOfInt = new int[i];
          bb[] arrayOfbb = new bb[i];
          System.arraycopy(((ba)localObject).axl, 0, arrayOfInt, 0, ((ba)localObject).axl.length);
          System.arraycopy(((ba)localObject).axm, 0, arrayOfbb, 0, ((ba)localObject).axm.length);
          ((ba)localObject).axl = arrayOfInt;
          ((ba)localObject).axm = arrayOfbb;
        }
        if (((ba)localObject).he - paramInt != 0)
        {
          System.arraycopy(((ba)localObject).axl, paramInt, ((ba)localObject).axl, paramInt + 1, ((ba)localObject).he - paramInt);
          System.arraycopy(((ba)localObject).axm, paramInt, ((ba)localObject).axm, paramInt + 1, ((ba)localObject).he - paramInt);
        }
        ((ba)localObject).axl[paramInt] = j;
        ((ba)localObject).axm[paramInt] = paramaw;
        ((ba)localObject).he += 1;
        localObject = paramaw;
      }
    }
  }
  
  protected final boolean a(M paramM)
  {
    if ((this.axg == null) || (this.axg.isEmpty())) {
      return (paramM.axg == null) || (paramM.axg.isEmpty());
    }
    return this.axg.equals(paramM.axg);
  }
  
  protected final int lV()
  {
    if ((this.axg == null) || (this.axg.isEmpty())) {
      return 0;
    }
    return this.axg.hashCode();
  }
  
  protected int ll()
  {
    int j = 0;
    if (this.axg != null)
    {
      int i = 0;
      for (;;)
      {
        k = i;
        if (j >= this.axg.size()) {
          break;
        }
        i += this.axg.cu(j).ll();
        j += 1;
      }
    }
    int k = 0;
    return k;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/c/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */