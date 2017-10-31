package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.ag;
import com.tencent.pb.common.b.a.a.j;
import com.tencent.pb.common.b.d;

public final class h
  extends d
{
  public String groupId;
  public int mXg;
  public long mXh;
  
  public h(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xnc, "NetSceneRejectVoiceGroup" });
    a.j localj = new a.j();
    try
    {
      localj.groupId = paramString;
      localj.rph = paramInt1;
      localj.rpi = paramLong;
      localj.mXM = paramInt2;
      localj.xnT = 2;
      this.mwe = 3;
      this.xnh = com.tencent.wecall.talkroom.model.c.cnZ().XY(paramString);
      c(211, localj);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xnc, new Object[] { "NetSceneRedirect constructor", paramString });
      }
    }
  }
  
  protected final Object bv(byte[] paramArrayOfByte)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xnc, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.ag)e.a(new a.ag(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSVoiceRedirectReq";
  }
  
  public final int getType()
  {
    return 211;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */