package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.a;
import com.tencent.pb.common.b.a.a.v;
import com.tencent.pb.common.b.d;

public final class b
  extends d
{
  public String mHz;
  public int ndF;
  public long xMh;
  
  public b(String paramString, int paramInt, long paramLong, String[] paramArrayOfString)
  {
    com.tencent.pb.common.c.c.d("MicroMsg.Voip", new Object[] { this.xnc, "addmember", paramString });
    a.a locala = new a.a();
    try
    {
      locala.groupId = paramString;
      this.mHz = paramString;
      locala.rph = paramInt;
      this.ndF = paramInt;
      locala.rpi = paramLong;
      this.xMh = paramLong;
      locala.xnM = paramArrayOfString;
      locala.rph = paramInt;
      this.mwe = 3;
      this.xnh = com.tencent.wecall.talkroom.model.c.cnZ().XY(paramString);
      c(145, locala);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k(this.xnc, new Object[] { "NetSceneAddVoiceGroupMember constructor", paramString });
      }
    }
  }
  
  protected final Object bv(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.v)e.a(new a.v(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSAddVoiceGroupMemberReq";
  }
  
  public final int getType()
  {
    return 204;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */