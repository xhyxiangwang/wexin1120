package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.apf;
import com.tencent.mm.protocal.c.apg;
import java.util.LinkedList;

public final class s
  extends k
  implements j
{
  public final b gMC;
  private com.tencent.mm.ac.e gPR;
  
  public s(String paramString, int paramInt, LinkedList<String> paramLinkedList)
  {
    GMTrace.i(18180328128512L, 135454);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new apf();
    ((b.a)localObject).hlY = new apg();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
    ((b.a)localObject).hlW = 1373;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (apf)this.gMC.hlU.hmc;
    ((apf)localObject).ulC = paramString;
    ((apf)localObject).ulD = paramInt;
    ((apf)localObject).ulE = paramLinkedList;
    GMTrace.o(18180328128512L, 135454);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(18180730781696L, 135457);
    this.gPR = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(18180730781696L, 135457);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(18180462346240L, 135455);
    this.gPR.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(18180462346240L, 135455);
  }
  
  public final int getType()
  {
    GMTrace.i(18180596563968L, 135456);
    GMTrace.o(18180596563968L, 135456);
    return 1373;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/model/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */