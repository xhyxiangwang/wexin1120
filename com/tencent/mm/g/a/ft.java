package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.b.b;

public final class ft
  extends b
{
  public a fBI;
  public b fBJ;
  
  public ft()
  {
    this((byte)0);
    GMTrace.i(4335098396672L, 32299);
    GMTrace.o(4335098396672L, 32299);
  }
  
  private ft(byte paramByte)
  {
    GMTrace.i(4335232614400L, 32300);
    this.fBI = new a();
    this.fBJ = new b();
    this.uLs = false;
    this.fwM = null;
    GMTrace.o(4335232614400L, 32300);
  }
  
  public static final class a
  {
    public long fwq;
    
    public a()
    {
      GMTrace.i(4293759336448L, 31991);
      this.fwq = -1L;
      GMTrace.o(4293759336448L, 31991);
    }
  }
  
  public static final class b
  {
    public sz field_favProto;
    public String field_fromUser;
    public int field_id;
    public int field_itemStatus;
    public String field_realChatName;
    public String field_toUser;
    public int field_type;
    public int ret;
    
    public b()
    {
      GMTrace.i(4250809663488L, 31671);
      this.ret = -1;
      this.field_id = -1;
      this.field_itemStatus = -1;
      this.field_type = -1;
      GMTrace.o(4250809663488L, 31671);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/a/ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */