package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class g
  extends d
{
  public String mHz;
  
  protected final Object bv(byte[] paramArrayOfByte)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xnc, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.aa)e.a(new a.aa(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSModifyVoiceGroupInfoReq";
  }
  
  public final int getType()
  {
    return 209;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */