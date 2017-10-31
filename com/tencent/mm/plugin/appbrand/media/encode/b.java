package com.tencent.mm.plugin.appbrand.media.encode;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class b
  implements c
{
  String jhI;
  String jhJ;
  c.a jhK;
  int jhL;
  int jhM;
  byte[] jhN;
  int jhO;
  
  public b()
  {
    GMTrace.i(19847714963456L, 147877);
    this.jhI = "audio/mp4a-latm";
    this.jhJ = "audio/mpeg";
    this.jhK = null;
    this.jhL = 0;
    this.jhM = 0;
    this.jhO = 0;
    GMTrace.o(19847714963456L, 147877);
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(19847983398912L, 147879);
    this.jhK = parama;
    GMTrace.o(19847983398912L, 147879);
  }
  
  public boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    GMTrace.i(19848386052096L, 147882);
    GMTrace.o(19848386052096L, 147882);
    return false;
  }
  
  public final void b(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(19848788705280L, 147885);
    if (this.jhK == null)
    {
      w.e("MicroMsg.AudioEncoder", "mEncodeListener is null, return");
      GMTrace.o(19848788705280L, 147885);
      return;
    }
    if (this.jhM == 0)
    {
      w.e("MicroMsg.AudioEncoder", "no frameSize, return");
      GMTrace.o(19848788705280L, 147885);
      return;
    }
    if (paramInt > this.jhM) {
      w.w("MicroMsg.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.jhM) });
    }
    w.d("MicroMsg.AudioEncoder", "bufferedSize:%d, buffSize:%d", new Object[] { Integer.valueOf(this.jhO), Integer.valueOf(paramInt) });
    int i = this.jhO + paramInt;
    if ((i >= this.jhM) && (paramArrayOfByte != null))
    {
      w.d("MicroMsg.AudioEncoder", "flush all, currentBufferedSize:%d", new Object[] { Integer.valueOf(i) });
      if (i > this.jhN.length)
      {
        w.i("MicroMsg.AudioEncoder", "expand the end codeBuffer:%d", new Object[] { Integer.valueOf(i) });
        byte[] arrayOfByte = this.jhN;
        this.jhN = new byte[i];
        System.arraycopy(arrayOfByte, 0, this.jhN, 0, this.jhO);
      }
      System.arraycopy(paramArrayOfByte, 0, this.jhN, this.jhO, paramInt);
      this.jhK.a(this.jhN, i, false);
      this.jhO = 0;
    }
    for (;;)
    {
      if (paramBoolean)
      {
        w.i("MicroMsg.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", new Object[] { Integer.valueOf(this.jhO) });
        this.jhK.a(this.jhN, this.jhO, paramBoolean);
        this.jhO = 0;
      }
      GMTrace.o(19848788705280L, 147885);
      return;
      if (paramArrayOfByte != null)
      {
        System.arraycopy(paramArrayOfByte, 0, this.jhN, this.jhO, paramInt);
        this.jhO = i;
        w.d("MicroMsg.AudioEncoder", "append buff, currentBufferedSize:%d", new Object[] { Integer.valueOf(this.jhO) });
      }
    }
  }
  
  public void close()
  {
    GMTrace.i(19848654487552L, 147884);
    GMTrace.o(19848654487552L, 147884);
  }
  
  public boolean e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(19848251834368L, 147881);
    GMTrace.o(19848251834368L, 147881);
    return false;
  }
  
  public void flush()
  {
    GMTrace.i(19848520269824L, 147883);
    GMTrace.o(19848520269824L, 147883);
  }
  
  public final void iU(int paramInt)
  {
    GMTrace.i(19847849181184L, 147878);
    w.i("MicroMsg.AudioEncoder", "mMinBufferSize:%d", new Object[] { Integer.valueOf(this.jhL) });
    this.jhL = paramInt;
    GMTrace.o(19847849181184L, 147878);
  }
  
  public final void iV(int paramInt)
  {
    GMTrace.i(19848117616640L, 147880);
    w.i("MicroMsg.AudioEncoder", "setEncodeBuffFrameSize frameSize:%d", new Object[] { Integer.valueOf(paramInt) });
    this.jhM = (paramInt * 1024);
    this.jhN = new byte[paramInt * 1024];
    GMTrace.o(19848117616640L, 147880);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/encode/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */