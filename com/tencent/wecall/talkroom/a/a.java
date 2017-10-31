package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ad;
import com.tencent.pb.common.b.a.a.ai;
import com.tencent.pb.common.b.a.a.ax;
import com.tencent.pb.common.b.a.a.i;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class a
  extends d
{
  public String mHz = null;
  public int ndF = 0;
  public long xMh = 0L;
  public int xNW;
  public int xnh;
  
  public a(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xnc, "NetSceneAckVoiceGroup" });
    a.i locali = new a.i();
    try
    {
      locali.groupId = paramString;
      this.mHz = paramString;
      locali.rph = paramInt1;
      this.ndF = paramInt1;
      locali.rpi = paramLong;
      this.xMh = paramLong;
      this.xNW = paramInt3;
      this.xnh = paramInt2;
      paramString = new a.ai();
      paramString.usf = 0;
      a.ax localax = new a.ax();
      localax.type = 3;
      localax.xqS = paramString;
      locali.xnR = localax;
      this.mwe = 3;
      this.xnh = paramInt2;
      c(189, locali);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        c.k(this.xnc, new Object[] { "NetSceneAckVoiceGroup constructor", paramString });
      }
    }
  }
  
  protected final Object bv(byte[] paramArrayOfByte)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xnc, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ad)e.a(new a.ad(), paramArrayOfByte, paramArrayOfByte.length);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        c.k(this.xnc, new Object[] { "data2Resp", paramArrayOfByte.getMessage() });
        return null;
      }
    }
    return null;
  }
  
  protected final String cjy()
  {
    return "CsCmd.Cmd_V_CSVoiceAckReq";
  }
  
  public final int getType()
  {
    return 206;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */