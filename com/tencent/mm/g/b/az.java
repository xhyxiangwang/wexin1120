package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.st;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class az
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTN;
  private static final int fTv;
  private static final int fZQ;
  private static final int ggM;
  private static final int ggN;
  private boolean fSZ;
  private boolean fTL;
  private boolean fZx;
  public long field_localId;
  public st field_modItem;
  public int field_scene;
  public long field_time;
  public int field_type;
  private boolean ggK;
  private boolean ggL;
  
  static
  {
    GMTrace.i(4111894315008L, 30636);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS FavModInfo_LocalId_Index ON FavEditInfo(localId)" };
    ggM = "localId".hashCode();
    ggN = "modItem".hashCode();
    fZQ = "time".hashCode();
    fTv = "type".hashCode();
    fTN = "scene".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4111894315008L, 30636);
  }
  
  public az()
  {
    GMTrace.i(4111357444096L, 30632);
    this.ggK = true;
    this.ggL = true;
    this.fZx = true;
    this.fSZ = true;
    this.fTL = true;
    GMTrace.o(4111357444096L, 30632);
  }
  
  public static c.a qR()
  {
    GMTrace.i(4111491661824L, 30633);
    c.a locala = new c.a();
    locala.hRR = new Field[5];
    locala.columns = new String[6];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.uQH.put("localId", "LONG");
    localStringBuilder.append(" localId LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "modItem";
    locala.uQH.put("modItem", "BLOB");
    localStringBuilder.append(" modItem BLOB");
    localStringBuilder.append(", ");
    locala.columns[2] = "time";
    locala.uQH.put("time", "LONG");
    localStringBuilder.append(" time LONG");
    localStringBuilder.append(", ");
    locala.columns[3] = "type";
    locala.uQH.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "scene";
    locala.uQH.put("scene", "INTEGER default '1' ");
    localStringBuilder.append(" scene INTEGER default '1' ");
    locala.columns[5] = "rowid";
    locala.uQI = localStringBuilder.toString();
    GMTrace.o(4111491661824L, 30633);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4111625879552L, 30634);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4111625879552L, 30634);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ggM == k) {
        this.field_localId = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (ggN == k) {
          try
          {
            byte[] arrayOfByte = paramCursor.getBlob(i);
            if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
              continue;
            }
            this.field_modItem = ((st)new st().aC(arrayOfByte));
          }
          catch (IOException localIOException)
          {
            w.e("MicroMsg.SDK.BaseFavEditInfo", localIOException.getMessage());
          }
        } else if (fZQ == k) {
          this.field_time = paramCursor.getLong(i);
        } else if (fTv == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fTN == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4111625879552L, 30634);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4111760097280L, 30635);
    ContentValues localContentValues = new ContentValues();
    if (this.ggK) {
      localContentValues.put("localId", Long.valueOf(this.field_localId));
    }
    if ((this.ggL) && (this.field_modItem != null)) {}
    try
    {
      localContentValues.put("modItem", this.field_modItem.toByteArray());
      if (this.fZx) {
        localContentValues.put("time", Long.valueOf(this.field_time));
      }
      if (this.fSZ) {
        localContentValues.put("type", Integer.valueOf(this.field_type));
      }
      if (this.fTL) {
        localContentValues.put("scene", Integer.valueOf(this.field_scene));
      }
      if (this.uQF > 0L) {
        localContentValues.put("rowid", Long.valueOf(this.uQF));
      }
      GMTrace.o(4111760097280L, 30635);
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        w.e("MicroMsg.SDK.BaseFavEditInfo", localIOException.getMessage());
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */