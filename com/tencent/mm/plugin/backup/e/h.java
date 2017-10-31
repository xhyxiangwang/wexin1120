package com.tencent.mm.plugin.backup.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.backup.a.a;
import java.util.HashMap;

public final class h
  extends a
{
  private static String TAG;
  private static h jPT;
  private HashMap<Integer, e> jPU;
  
  static
  {
    GMTrace.i(14819650437120L, 110415);
    TAG = "MicroMsg.MMBakItemFactory";
    GMTrace.o(14819650437120L, 110415);
  }
  
  public h()
  {
    GMTrace.i(14819113566208L, 110411);
    GMTrace.o(14819113566208L, 110411);
  }
  
  public static h aeE()
  {
    GMTrace.i(14819247783936L, 110412);
    if (jPT == null)
    {
      localh = new h();
      jPT = localh;
      a(localh);
    }
    h localh = jPT;
    GMTrace.o(14819247783936L, 110412);
    return localh;
  }
  
  public final void adA()
  {
    GMTrace.i(14819382001664L, 110413);
    jPT = null;
    GMTrace.o(14819382001664L, 110413);
  }
  
  public final e kp(int paramInt)
  {
    GMTrace.i(14819516219392L, 110414);
    if (this.jPU == null)
    {
      this.jPU = new HashMap();
      this.jPU.put(Integer.valueOf(3), new i());
      this.jPU.put(Integer.valueOf(47), new f());
      this.jPU.put(Integer.valueOf(49), new g());
      this.jPU.put(Integer.valueOf(34), new l());
      localObject = new k();
      this.jPU.put(Integer.valueOf(43), localObject);
      this.jPU.put(Integer.valueOf(44), localObject);
      this.jPU.put(Integer.valueOf(62), localObject);
      localObject = new j();
      this.jPU.put(Integer.valueOf(48), localObject);
      this.jPU.put(Integer.valueOf(42), localObject);
      this.jPU.put(Integer.valueOf(10000), localObject);
      this.jPU.put(Integer.valueOf(1), localObject);
      this.jPU.put(Integer.valueOf(37), localObject);
      this.jPU.put(Integer.valueOf(40), localObject);
      this.jPU.put(Integer.valueOf(50), localObject);
    }
    Object localObject = (e)this.jPU.get(Integer.valueOf(paramInt));
    GMTrace.o(14819516219392L, 110414);
    return (e)localObject;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/e/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */