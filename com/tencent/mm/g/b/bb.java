package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class bb
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTA;
  private static final int fTv;
  private static final int fZQ;
  private static final int ggM;
  private static final int ghs;
  private static final int ght;
  private boolean fSZ;
  private boolean fTe;
  private boolean fZx;
  public String field_content;
  public long field_localId;
  public int field_subtype;
  public String field_tagContent;
  public long field_time;
  public int field_type;
  private boolean ggK;
  private boolean ghq;
  private boolean ghr;
  
  static
  {
    GMTrace.i(4115786629120L, 30665);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS FavSearchInfo_Content_Index ON FavSearchInfo(content)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_TagContent_Index ON FavSearchInfo(tagContent)", "CREATE INDEX IF NOT EXISTS FavSearchInfo_SubType_Index ON FavSearchInfo(subtype)" };
    ggM = "localId".hashCode();
    fTA = "content".hashCode();
    ghs = "tagContent".hashCode();
    fZQ = "time".hashCode();
    fTv = "type".hashCode();
    ght = "subtype".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4115786629120L, 30665);
  }
  
  public bb()
  {
    GMTrace.i(4115249758208L, 30661);
    this.ggK = true;
    this.fTe = true;
    this.ghq = true;
    this.fZx = true;
    this.fSZ = true;
    this.ghr = true;
    GMTrace.o(4115249758208L, 30661);
  }
  
  public static c.a qR()
  {
    GMTrace.i(4115383975936L, 30662);
    c.a locala = new c.a();
    locala.hRR = new Field[6];
    locala.columns = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.uQH.put("localId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" localId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "localId";
    locala.columns[1] = "content";
    locala.uQH.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "tagContent";
    locala.uQH.put("tagContent", "TEXT");
    localStringBuilder.append(" tagContent TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "time";
    locala.uQH.put("time", "LONG");
    localStringBuilder.append(" time LONG");
    localStringBuilder.append(", ");
    locala.columns[4] = "type";
    locala.uQH.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "subtype";
    locala.uQH.put("subtype", "INTEGER default '0' ");
    localStringBuilder.append(" subtype INTEGER default '0' ");
    locala.columns[6] = "rowid";
    locala.uQI = localStringBuilder.toString();
    GMTrace.o(4115383975936L, 30662);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4115518193664L, 30663);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4115518193664L, 30663);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ggM == k)
      {
        this.field_localId = paramCursor.getLong(i);
        this.ggK = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fTA == k) {
          this.field_content = paramCursor.getString(i);
        } else if (ghs == k) {
          this.field_tagContent = paramCursor.getString(i);
        } else if (fZQ == k) {
          this.field_time = paramCursor.getLong(i);
        } else if (fTv == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (ght == k) {
          this.field_subtype = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4115518193664L, 30663);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4115652411392L, 30664);
    ContentValues localContentValues = new ContentValues();
    if (this.ggK) {
      localContentValues.put("localId", Long.valueOf(this.field_localId));
    }
    if (this.fTe) {
      localContentValues.put("content", this.field_content);
    }
    if (this.ghq) {
      localContentValues.put("tagContent", this.field_tagContent);
    }
    if (this.fZx) {
      localContentValues.put("time", Long.valueOf(this.field_time));
    }
    if (this.fSZ) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.ghr) {
      localContentValues.put("subtype", Integer.valueOf(this.field_subtype));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4115652411392L, 30664);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */