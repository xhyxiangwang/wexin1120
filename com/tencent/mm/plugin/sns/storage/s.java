package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.df;
import com.tencent.mm.protocal.c.axt;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class s
  extends df
{
  protected static c.a gLR;
  public int qvK;
  
  static
  {
    GMTrace.i(8310224846848L, 61916);
    c.a locala = new c.a();
    locala.hRR = new Field[4];
    locala.columns = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "tagId";
    locala.uQH.put("tagId", "LONG default '0' ");
    localStringBuilder.append(" tagId LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[1] = "tagName";
    locala.uQH.put("tagName", "TEXT default '' ");
    localStringBuilder.append(" tagName TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[2] = "count";
    locala.uQH.put("count", "INTEGER default '0' ");
    localStringBuilder.append(" count INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "memberList";
    locala.uQH.put("memberList", "TEXT default '' ");
    localStringBuilder.append(" memberList TEXT default '' ");
    locala.columns[4] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(8310224846848L, 61916);
  }
  
  public s()
  {
    GMTrace.i(8309687975936L, 61912);
    GMTrace.o(8309687975936L, 61912);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8310090629120L, 61915);
    super.b(paramCursor);
    this.qvK = ((int)this.uQF);
    GMTrace.o(8310090629120L, 61915);
  }
  
  public final void bv(List<axt> paramList)
  {
    GMTrace.i(8309956411392L, 61914);
    this.field_memberList = "";
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      axt localaxt = (axt)paramList.next();
      this.field_memberList = (this.field_memberList + localaxt.usj + ",");
    }
    GMTrace.o(8309956411392L, 61914);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(8309822193664L, 61913);
    c.a locala = gLR;
    GMTrace.o(8309822193664L, 61913);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */