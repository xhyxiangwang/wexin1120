package com.tencent.mm.plugin.appbrand.p.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.f.b;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class e
  implements c
{
  protected static byte[] jyf;
  protected boolean jyg;
  protected d.a jyh;
  private ByteBuffer jyi;
  protected boolean jyj;
  
  static
  {
    GMTrace.i(10164576976896L, 75732);
    jyf = new byte[0];
    GMTrace.o(10164576976896L, 75732);
  }
  
  public e()
  {
    GMTrace.i(10162832146432L, 75719);
    GMTrace.o(10162832146432L, 75719);
  }
  
  public e(d.a parama)
  {
    GMTrace.i(10162966364160L, 75720);
    this.jyh = parama;
    this.jyi = ByteBuffer.wrap(jyf);
    GMTrace.o(10162966364160L, 75720);
  }
  
  public e(d paramd)
  {
    GMTrace.i(10163100581888L, 75721);
    this.jyg = paramd.abm();
    this.jyh = paramd.abo();
    this.jyi = paramd.abl();
    this.jyj = paramd.abn();
    GMTrace.o(10163100581888L, 75721);
  }
  
  public final void a(d.a parama)
  {
    GMTrace.i(10163905888256L, 75727);
    this.jyh = parama;
    GMTrace.o(10163905888256L, 75727);
  }
  
  public ByteBuffer abl()
  {
    GMTrace.i(10163637452800L, 75725);
    ByteBuffer localByteBuffer = this.jyi;
    GMTrace.o(10163637452800L, 75725);
    return localByteBuffer;
  }
  
  public final boolean abm()
  {
    GMTrace.i(10163234799616L, 75722);
    boolean bool = this.jyg;
    GMTrace.o(10163234799616L, 75722);
    return bool;
  }
  
  public final boolean abn()
  {
    GMTrace.i(10163503235072L, 75724);
    boolean bool = this.jyj;
    GMTrace.o(10163503235072L, 75724);
    return bool;
  }
  
  public final d.a abo()
  {
    GMTrace.i(10163369017344L, 75723);
    d.a locala = this.jyh;
    GMTrace.o(10163369017344L, 75723);
    return locala;
  }
  
  public final void cD(boolean paramBoolean)
  {
    GMTrace.i(10163771670528L, 75726);
    this.jyg = paramBoolean;
    GMTrace.o(10163771670528L, 75726);
  }
  
  public final void cE(boolean paramBoolean)
  {
    GMTrace.i(10164174323712L, 75729);
    this.jyj = paramBoolean;
    GMTrace.o(10164174323712L, 75729);
  }
  
  public final void e(d paramd)
  {
    GMTrace.i(10164308541440L, 75730);
    ByteBuffer localByteBuffer1 = paramd.abl();
    if (this.jyi == null)
    {
      this.jyi = ByteBuffer.allocate(localByteBuffer1.remaining());
      localByteBuffer1.mark();
      this.jyi.put(localByteBuffer1);
      localByteBuffer1.reset();
      this.jyg = paramd.abm();
      GMTrace.o(10164308541440L, 75730);
      return;
    }
    localByteBuffer1.mark();
    this.jyi.position(this.jyi.limit());
    this.jyi.limit(this.jyi.capacity());
    if (localByteBuffer1.remaining() > this.jyi.remaining())
    {
      ByteBuffer localByteBuffer2 = ByteBuffer.allocate(localByteBuffer1.remaining() + this.jyi.capacity());
      this.jyi.flip();
      localByteBuffer2.put(this.jyi);
      localByteBuffer2.put(localByteBuffer1);
      this.jyi = localByteBuffer2;
    }
    for (;;)
    {
      this.jyi.rewind();
      localByteBuffer1.reset();
      break;
      this.jyi.put(localByteBuffer1);
    }
  }
  
  public void l(ByteBuffer paramByteBuffer)
  {
    GMTrace.i(10164040105984L, 75728);
    this.jyi = paramByteBuffer;
    GMTrace.o(10164040105984L, 75728);
  }
  
  public String toString()
  {
    GMTrace.i(10164442759168L, 75731);
    String str = "Framedata{ optcode:" + this.jyh + ", fin:" + this.jyg + ", payloadlength:[pos:" + this.jyi.position() + ", len:" + this.jyi.remaining() + "], payload:" + Arrays.toString(b.sm(new String(this.jyi.array()))) + "}";
    GMTrace.o(10164442759168L, 75731);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/p/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */