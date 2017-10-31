package com.tencent.wecall.talkroom.a;

import com.tencent.pb.common.b.a.a.ai;
import com.tencent.pb.common.b.a.a.ax;
import com.tencent.pb.common.b.a.a.e;
import com.tencent.pb.common.b.a.a.y;
import com.tencent.pb.common.b.d;
import com.tencent.pb.common.c.c;

public final class e
  extends d
{
  public String mHz = null;
  public int ndF = 0;
  public long xMh = 0L;
  public int xNY = 0;
  
  public e(e parame)
  {
    this.mHz = parame.mHz;
    this.ndF = parame.ndF;
    this.xMh = parame.xMh;
    this.xNY = parame.xNY;
    this.xne = parame.xne;
    this.xng = parame.xng;
    this.xnh = parame.xnh;
    this.mwe = 1;
  }
  
  public e(String paramString, int paramInt1, long paramLong, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xnc, "enter", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong) });
    a.e locale = new a.e();
    for (;;)
    {
      try
      {
        locale.groupId = paramString;
        this.mHz = paramString;
        locale.rph = paramInt1;
        this.ndF = paramInt1;
        locale.rpi = paramLong;
        this.xMh = paramLong;
        locale.xnZ = paramInt3;
        this.xNY = paramInt3;
        paramString = new a.ai();
        if (paramArrayOfByte == null) {
          continue;
        }
        paramString.buffer = paramArrayOfByte;
        paramString.usf = paramArrayOfByte.length;
        paramArrayOfByte = new a.ax();
        paramArrayOfByte.type = 3;
        paramArrayOfByte.xqS = paramString;
        locale.xnR = paramArrayOfByte;
        this.mwe = 2;
        this.xnh = paramInt2;
        locale.xnT = 2;
      }
      catch (Exception paramString)
      {
        c.k(this.xnc, new Object[] { "NetSceneEnterVoiceRoom constructor", paramString });
        continue;
      }
      c(141, locale);
      return;
      paramString.usf = 0;
    }
  }
  
  protected final Object bv(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.y)com.google.a.a.e.a(new a.y(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSEnterVoiceRoomReq";
  }
  
  public final int getType()
  {
    return 202;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */