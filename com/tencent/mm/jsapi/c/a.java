package com.tencent.mm.jsapi.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  private static final int gQn;
  private byte[] gQo;
  private String id;
  
  static
  {
    GMTrace.i(20015755558912L, 149129);
    gQn = -bg.getInt(r.icj, 0);
    GMTrace.o(20015755558912L, 149129);
  }
  
  public a(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(20015487123456L, 149127);
    this.id = paramString;
    this.gQo = paramArrayOfByte;
    GMTrace.o(20015487123456L, 149127);
  }
  
  public final boolean eS(int paramInt)
  {
    GMTrace.i(20015621341184L, 149128);
    int i = gQn;
    if (i == -1)
    {
      w.d("MicroMsg.PermissionFilter", "getCtrlByte, id = %s, ctrlIndex = %d, hard code perm on", new Object[] { this.id, Integer.valueOf(paramInt) });
      paramInt = 1;
    }
    while (paramInt == 1)
    {
      GMTrace.o(20015621341184L, 149128);
      return true;
      if (i == -2)
      {
        w.d("MicroMsg.PermissionFilter", "getCtrlByte, id = %s, ctrlIndex = %d, hard code perm off", new Object[] { this.id, Integer.valueOf(paramInt) });
        paramInt = 0;
      }
      else if (paramInt == -2)
      {
        paramInt = 1;
      }
      else if (paramInt == -1)
      {
        paramInt = 0;
      }
      else if ((this.gQo == null) || (paramInt < 0) || (paramInt >= this.gQo.length))
      {
        paramInt = 0;
      }
      else
      {
        paramInt = this.gQo[paramInt];
      }
    }
    GMTrace.o(20015621341184L, 149128);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/jsapi/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */