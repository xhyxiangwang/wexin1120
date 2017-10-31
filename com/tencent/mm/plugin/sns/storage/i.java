package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.db;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.Map;

public final class i
  extends db
{
  protected static c.a gLR;
  public int quU;
  
  static
  {
    GMTrace.i(8304587702272L, 61874);
    c.a locala = new c.a();
    locala.hRR = new Field[13];
    locala.columns = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "snsID";
    locala.uQH.put("snsID", "LONG");
    localStringBuilder.append(" snsID LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "parentID";
    locala.uQH.put("parentID", "LONG");
    localStringBuilder.append(" parentID LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "isRead";
    locala.uQH.put("isRead", "SHORT default '0' ");
    localStringBuilder.append(" isRead SHORT default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.uQH.put("createTime", "INTEGER");
    localStringBuilder.append(" createTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "talker";
    locala.uQH.put("talker", "TEXT");
    localStringBuilder.append(" talker TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "type";
    locala.uQH.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "isSend";
    locala.uQH.put("isSend", "INTEGER default 'false' ");
    localStringBuilder.append(" isSend INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "curActionBuf";
    locala.uQH.put("curActionBuf", "BLOB");
    localStringBuilder.append(" curActionBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[8] = "refActionBuf";
    locala.uQH.put("refActionBuf", "BLOB");
    localStringBuilder.append(" refActionBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[9] = "commentSvrID";
    locala.uQH.put("commentSvrID", "LONG");
    localStringBuilder.append(" commentSvrID LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "clientId";
    locala.uQH.put("clientId", "TEXT");
    localStringBuilder.append(" clientId TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "commentflag";
    locala.uQH.put("commentflag", "INTEGER");
    localStringBuilder.append(" commentflag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "isSilence";
    locala.uQH.put("isSilence", "INTEGER default '0' ");
    localStringBuilder.append(" isSilence INTEGER default '0' ");
    locala.columns[13] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(8304587702272L, 61874);
  }
  
  public i()
  {
    GMTrace.i(8304050831360L, 61870);
    GMTrace.o(8304050831360L, 61870);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8304319266816L, 61872);
    try
    {
      super.b(paramCursor);
      this.quU = ((int)this.uQF);
      GMTrace.o(8304319266816L, 61872);
      return;
    }
    catch (Exception paramCursor)
    {
      String str = paramCursor.getMessage();
      w.e("MicroMsg.SnsComment", "error " + str);
      if ((str != null) && (str.contains("Unable to convert"))) {
        ae.bht().bjT();
      }
      try
      {
        throw paramCursor;
      }
      catch (Exception paramCursor)
      {
        w.printErrStackTrace("MicroMsg.SnsComment", paramCursor, "", new Object[0]);
        GMTrace.o(8304319266816L, 61872);
      }
    }
  }
  
  public final void bjP()
  {
    GMTrace.i(8304453484544L, 61873);
    this.field_commentflag |= 0x1;
    GMTrace.o(8304453484544L, 61873);
  }
  
  protected final c.a uC()
  {
    GMTrace.i(8304185049088L, 61871);
    c.a locala = gLR;
    GMTrace.o(8304185049088L, 61871);
    return locala;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */