package com.tencent.mm.plugin.g.a.b.a;

import android.annotation.TargetApi;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.g.a.b.h;
import com.tencent.mm.sdk.platformtools.w;

@TargetApi(18)
public class f
  extends a
{
  static final String TAG;
  public static String kdC;
  public static String kdD;
  public int kdE;
  public int kdF;
  public int kdG;
  public long kdH;
  public long kdI;
  
  static
  {
    GMTrace.i(4822979837952L, 35934);
    TAG = f.class.getName();
    kdC = h.kcf;
    kdD = h.kcg;
    GMTrace.o(4822979837952L, 35934);
  }
  
  public f()
  {
    GMTrace.i(4822711402496L, 35932);
    this.kcx = null;
    this.kcy = 8;
    this.kbQ = 1L;
    this.kdE = -1;
    this.kdF = -1;
    this.kdG = -1;
    this.kdH = 0L;
    this.kdI = 0L;
    GMTrace.o(4822711402496L, 35932);
  }
  
  public final byte[] agK()
  {
    GMTrace.i(4822845620224L, 35933);
    if (this.kdE < 0)
    {
      w.e(TAG, "stepCount is invalid");
      GMTrace.o(4822845620224L, 35933);
      return null;
    }
    int i = 4;
    if (this.kdF >= 0) {
      i = 7;
    }
    int j = i;
    if (this.kdG >= 0) {
      j = i + 3;
    }
    byte[] arrayOfByte = new byte[j];
    arrayOfByte[0] = 1;
    i = 1;
    j = 0;
    while (j < 3)
    {
      arrayOfByte[i] = ((byte)(this.kdE >> j * 8 & 0xFF));
      j += 1;
      i += 1;
    }
    j = i;
    if (this.kdF >= 0)
    {
      arrayOfByte[0] = ((byte)(arrayOfByte[0] | 0x2));
      int k = 0;
      for (;;)
      {
        j = i;
        if (k >= 3) {
          break;
        }
        arrayOfByte[i] = ((byte)(this.kdF >> k * 8 & 0xFF));
        k += 1;
        i += 1;
      }
    }
    if (this.kdG >= 0)
    {
      arrayOfByte[0] = 4;
      i = 0;
      while (i < 3)
      {
        arrayOfByte[j] = ((byte)(this.kdG >> i * 8 & 0xFF));
        j += 1;
        i += 1;
      }
    }
    GMTrace.o(4822845620224L, 35933);
    return arrayOfByte;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/g/a/b/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */