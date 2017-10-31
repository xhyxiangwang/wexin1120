package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ah;
import com.tencent.pb.common.b.a.a.k;
import com.tencent.pb.common.b.d;

public final class l
  extends d
{
  public String mHz;
  public int ndF;
  public long xMh;
  
  public l(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xnc, "hello", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong) });
    a.k localk = new a.k();
    localk.xoe = paramInt3;
    localk.rph = paramInt1;
    this.ndF = paramInt1;
    localk.rpi = paramLong;
    this.xMh = paramLong;
    localk.groupId = paramString;
    this.mHz = paramString;
    localk.mXM = paramInt2;
    this.mwe = 3;
    try
    {
      this.xnh = com.tencent.wecall.talkroom.model.c.cnZ().XY(paramString);
      c(147, localk);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xnc, new Object[] { "NetSceneVoiceRoomHello constructor", paramString });
      }
    }
  }
  
  protected final Object bv(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ah)e.a(new a.ah(), paramArrayOfByte, paramArrayOfByte.length);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.pb.common.c.c.k(this.xnc, new Object[] { "data2Resp", paramArrayOfByte.getMessage() });
        return null;
      }
    }
    return null;
  }
  
  protected final String cjy()
  {
    return "CsCmd.Cmd_V_CSVoiceRoomHelloReq";
  }
  
  public final int getType()
  {
    return 205;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */