package com.tencent.pb.common.b;

import java.lang.ref.WeakReference;

public final class i
  implements c
{
  private WeakReference<c> xnJ;
  
  public i(c paramc)
  {
    this.xnJ = new WeakReference(paramc);
  }
  
  public final void n(int paramInt, byte[] paramArrayOfByte)
  {
    if ((this.xnJ != null) && (this.xnJ.get() != null))
    {
      ((c)this.xnJ.get()).n(paramInt, paramArrayOfByte);
      return;
    }
    com.tencent.pb.common.c.c.k("OnRespForLongAIDLImpl fail", new Object[] { "callback is null, errCode=" + paramInt });
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/pb/common/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */