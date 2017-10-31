package com.tencent.wecall.talkroom.a;

import com.google.a.a.e;
import com.tencent.pb.b.a.a;
import com.tencent.pb.common.b.a.a.ai;
import com.tencent.pb.common.b.a.a.aq;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.ax;
import com.tencent.pb.common.b.a.a.d;
import com.tencent.pb.common.b.a.a.x;
import com.tencent.pb.common.c.c;

public final class d
  extends com.tencent.pb.common.b.d
{
  public int mType;
  public String xMg;
  public boolean xNX = true;
  
  public d(String paramString1, String[] paramArrayOfString, byte[] paramArrayOfByte, String paramString2, a.av paramav, int paramInt1, int paramInt2, long paramLong, String paramString3, boolean paramBoolean, String paramString4)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xnc, "create" });
    a.d locald = new a.d();
    for (;;)
    {
      try
      {
        locald.xnN = paramString1;
        this.xMg = paramString1;
        locald.xnS = paramInt1;
        this.xnh = paramInt1;
        if (paramav != null) {
          locald.xnU = paramav;
        }
        paramString1 = new a.aq();
        paramString1.name = paramString2;
        paramString1.xpX = paramString4;
        paramString1.xpW = a.cjV();
        paramString1.fBu = paramInt2;
        this.mType = paramInt2;
        this.xNX = paramBoolean;
        paramString1.xpP = paramLong;
        locald.xnP = paramString1;
        locald.xnW = paramArrayOfString;
        paramString1 = paramString3;
        if (paramString3 == null) {
          paramString1 = "";
        }
        locald.xnV = paramString1;
        paramString1 = new a.ai();
        if (paramArrayOfByte == null) {
          continue;
        }
        paramString1.buffer = paramArrayOfByte;
        paramString1.usf = paramArrayOfByte.length;
        paramArrayOfString = new a.ax();
        paramArrayOfString.type = 3;
        paramArrayOfString.xqS = paramString1;
        locald.xnR = paramArrayOfString;
        this.mwe = 3;
        locald.xnT = 2;
      }
      catch (Exception paramString1)
      {
        c.k(this.xnc, new Object[] { "NetSceneCreateVoiceGroup constructor", paramString1 });
        continue;
      }
      c(139, locald);
      return;
      paramString1.usf = 0;
    }
  }
  
  protected final Object bv(byte[] paramArrayOfByte)
  {
    c.d("MicroMsg.Voip", new Object[] { this.xnc, "data2Resp" });
    if (paramArrayOfByte != null) {
      try
      {
        paramArrayOfByte = (a.x)e.a(new a.x(), paramArrayOfByte, paramArrayOfByte.length);
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
    return "CsCmd.Cmd_V_CSCreateVoiceGroupReq";
  }
  
  public final int getType()
  {
    return 201;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */