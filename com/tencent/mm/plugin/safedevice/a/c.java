package com.tencent.mm.plugin.safedevice.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.cs;
import com.tencent.mm.protocal.c.axv;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class c
  extends cs
{
  protected static c.a gLR;
  
  static
  {
    GMTrace.i(12857924124672L, 95799);
    c.a locala = new c.a();
    locala.hRR = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "uid";
    locala.uQH.put("uid", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" uid TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "uid";
    locala.columns[1] = "name";
    locala.uQH.put("name", "TEXT default '' ");
    localStringBuilder.append(" name TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "devicetype";
    locala.uQH.put("devicetype", "TEXT default '' ");
    localStringBuilder.append(" devicetype TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "createtime";
    locala.uQH.put("createtime", "LONG default '0' ");
    localStringBuilder.append(" createtime LONG default '0' ");
    locala.columns[4] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(12857924124672L, 95799);
  }
  
  public c()
  {
    GMTrace.i(12857655689216L, 95797);
    this.field_uid = "0";
    this.field_name = "";
    this.field_devicetype = "";
    this.field_createtime = 0L;
    GMTrace.o(12857655689216L, 95797);
  }
  
  public c(axv paramaxv)
  {
    GMTrace.i(12857789906944L, 95798);
    this.field_createtime = paramaxv.orU;
    this.field_devicetype = paramaxv.txO;
    this.field_name = paramaxv.mCJ;
    this.field_uid = paramaxv.tKM;
    GMTrace.o(12857789906944L, 95798);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(12857521471488L, 95796);
    c.a locala = gLR;
    GMTrace.o(12857521471488L, 95796);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/safedevice/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */