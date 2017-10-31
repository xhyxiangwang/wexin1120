package com.tencent.mm.plugin.g.a.b;

import android.bluetooth.BluetoothGattCharacteristic;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  private int kaJ;
  private byte[] kaK;
  private int kaL;
  private int kaM;
  BluetoothGattCharacteristic kaN;
  
  public a()
  {
    GMTrace.i(4818282217472L, 35899);
    this.kaJ = 20;
    this.kaK = null;
    this.kaL = 0;
    this.kaM = 0;
    this.kaN = null;
    GMTrace.o(4818282217472L, 35899);
  }
  
  public final byte[] agw()
  {
    GMTrace.i(4818550652928L, 35901);
    int i = this.kaM - this.kaL;
    if (i == 0)
    {
      GMTrace.o(4818550652928L, 35901);
      return null;
    }
    if (i < this.kaJ) {}
    for (;;)
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.kaK, this.kaL, arrayOfByte, 0, i);
      this.kaL = (i + this.kaL);
      GMTrace.o(4818550652928L, 35901);
      return arrayOfByte;
      i = this.kaJ;
    }
  }
  
  public final void setData(byte[] paramArrayOfByte)
  {
    GMTrace.i(4818416435200L, 35900);
    if (paramArrayOfByte == null)
    {
      this.kaK = null;
      this.kaM = 0;
      this.kaL = 0;
      GMTrace.o(4818416435200L, 35900);
      return;
    }
    this.kaK = new byte[paramArrayOfByte.length];
    System.arraycopy(paramArrayOfByte, 0, this.kaK, 0, paramArrayOfByte.length);
    this.kaM = paramArrayOfByte.length;
    this.kaL = 0;
    GMTrace.o(4818416435200L, 35900);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/g/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */