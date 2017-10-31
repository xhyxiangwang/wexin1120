package com.tencent.mm.wallet_core.c;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.e;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;

public abstract class k
  extends com.tencent.mm.ac.k
  implements j
{
  public String gPI;
  public int hJp;
  public long lGA;
  private int lkN;
  private long rZX;
  public Bundle un;
  
  public k()
  {
    GMTrace.i(1455322824704L, 10843);
    this.lkN = 0;
    this.gPI = "";
    this.lGA = 0L;
    this.hJp = 0;
    GMTrace.o(1455322824704L, 10843);
  }
  
  public final int a(e parame, p paramp, j paramj)
  {
    GMTrace.i(1455859695616L, 10847);
    this.rZX = System.currentTimeMillis();
    int i = super.a(parame, paramp, paramj);
    GMTrace.o(1455859695616L, 10847);
    return i;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(1455725477888L, 10846);
    long l1 = System.currentTimeMillis() - this.rZX;
    Object localObject = "";
    paramArrayOfByte = "";
    this.lkN = aLe();
    long l2 = System.currentTimeMillis();
    if (this.un != null)
    {
      String str1 = this.un.getString("key_TransId");
      String str2 = this.un.getString("key_reqKey");
      if (this.lGA == 0L) {
        this.lGA = this.un.getLong("key_SessionId", 0L);
      }
      paramArrayOfByte = str2;
      localObject = str1;
      if (this.hJp == 0)
      {
        this.hJp = this.un.getInt("key_scene");
        localObject = str1;
        paramArrayOfByte = str2;
      }
    }
    g.paX.i(11170, new Object[] { Integer.valueOf(getType()), Integer.valueOf(this.lkN), Long.valueOf(l1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(am.getNetType(ab.getContext())), this.gPI, localObject, paramArrayOfByte, Long.valueOf(this.lGA), Long.valueOf(l2) });
    o.a(getType(), aLe(), paramInt2, paramInt3, l1, this.hJp, this.gPI);
    e(paramInt2, paramInt3, paramString, paramp);
    GMTrace.o(1455725477888L, 10846);
  }
  
  public int aLe()
  {
    GMTrace.i(1455457042432L, 10844);
    GMTrace.o(1455457042432L, 10844);
    return -1;
  }
  
  public abstract void e(int paramInt1, int paramInt2, String paramString, p paramp);
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */