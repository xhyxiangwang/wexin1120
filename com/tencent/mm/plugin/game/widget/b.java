package com.tencent.mm.plugin.game.widget;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class b<E>
  extends LinkedList<E>
{
  private a mSk;
  
  public b(a parama)
  {
    GMTrace.i(17981551673344L, 133973);
    this.mSk = parama;
    GMTrace.o(17981551673344L, 133973);
  }
  
  public final E pop()
  {
    try
    {
      GMTrace.i(17981685891072L, 133974);
      Object localObject1 = super.pop();
      if (this.mSk != null) {
        this.mSk.aDh();
      }
      GMTrace.o(17981685891072L, 133974);
      return (E)localObject1;
    }
    finally {}
  }
  
  public final void push(E paramE)
  {
    GMTrace.i(17981820108800L, 133975);
    super.push(paramE);
    if (this.mSk != null) {
      this.mSk.aDg();
    }
    GMTrace.o(17981820108800L, 133975);
  }
  
  public static abstract interface a
  {
    public abstract void aDg();
    
    public abstract void aDh();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */