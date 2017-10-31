package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ac;
import com.tencent.pb.common.b.a.a.h;
import com.tencent.pb.common.b.d;

public final class k
  extends d
{
  public String mHz;
  public int ndF;
  public long xMh;
  
  public k(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xnc, "NetSceneSwitchVideoGroup" });
    a.h localh = new a.h();
    try
    {
      localh.groupId = paramString;
      this.mHz = paramString;
      localh.mXg = paramInt1;
      this.ndF = paramInt1;
      localh.mXh = paramLong;
      this.xMh = paramLong;
      localh.action = paramInt2;
      this.mwe = 3;
      this.xnh = com.tencent.wecall.talkroom.model.c.cnZ().XY(paramString);
      c(243, localh);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xnc, new Object[] { "NetSceneSwitchVideoGroup constructor", paramString });
      }
    }
  }
  
  protected final Object bv(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xnc, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ac)e.a(new a.ac(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSSwitchVideoGroupReq";
  }
  
  public final int getType()
  {
    return 214;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */