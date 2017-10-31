package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class ax
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fSu;
  private static final int fTv;
  private static final int fUD;
  private static final int fUl;
  private static final int fUm;
  private static final int fWf;
  private static final int gfg;
  private static final int ggD;
  private static final int ggE;
  private static final int ggF;
  private static final int ggG;
  private static final int ggH;
  private boolean fSZ;
  private boolean fSr;
  private boolean fTU;
  private boolean fTV;
  private boolean fUA;
  private boolean fVJ;
  public String field_cdnKey;
  public String field_cdnUrl;
  public String field_dataId;
  public int field_dataType;
  public int field_extFlag;
  public long field_favLocalId;
  public long field_modifyTime;
  public int field_offset;
  public String field_path;
  public int field_status;
  public int field_totalLen;
  public int field_type;
  private boolean geH;
  private boolean ggA;
  private boolean ggB;
  private boolean ggC;
  private boolean ggy;
  private boolean ggz;
  
  static
  {
    GMTrace.i(4154575552512L, 30954);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS FavCdnTransferInfo_LocalId ON FavCdnInfo(favLocalId)", "CREATE INDEX IF NOT EXISTS FavCDNInfo_modifyTime_Index ON FavCdnInfo(modifyTime)" };
    ggD = "dataId".hashCode();
    ggE = "favLocalId".hashCode();
    fTv = "type".hashCode();
    gfg = "cdnUrl".hashCode();
    ggF = "cdnKey".hashCode();
    fUl = "totalLen".hashCode();
    fUm = "offset".hashCode();
    fSu = "status".hashCode();
    ggG = "path".hashCode();
    fUD = "dataType".hashCode();
    fWf = "modifyTime".hashCode();
    ggH = "extFlag".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4154575552512L, 30954);
  }
  
  public ax()
  {
    GMTrace.i(4154038681600L, 30950);
    this.ggy = true;
    this.ggz = true;
    this.fSZ = true;
    this.geH = true;
    this.ggA = true;
    this.fTU = true;
    this.fTV = true;
    this.fSr = true;
    this.ggB = true;
    this.fUA = true;
    this.fVJ = true;
    this.ggC = true;
    GMTrace.o(4154038681600L, 30950);
  }
  
  public static c.a qR()
  {
    GMTrace.i(4154172899328L, 30951);
    c.a locala = new c.a();
    locala.hRR = new Field[12];
    locala.columns = new String[13];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "dataId";
    locala.uQH.put("dataId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" dataId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "dataId";
    locala.columns[1] = "favLocalId";
    locala.uQH.put("favLocalId", "LONG");
    localStringBuilder.append(" favLocalId LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "type";
    locala.uQH.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "cdnUrl";
    locala.uQH.put("cdnUrl", "TEXT");
    localStringBuilder.append(" cdnUrl TEXT");
    localStringBuilder.append(", ");
    locala.columns[4] = "cdnKey";
    locala.uQH.put("cdnKey", "TEXT");
    localStringBuilder.append(" cdnKey TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "totalLen";
    locala.uQH.put("totalLen", "INTEGER");
    localStringBuilder.append(" totalLen INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "offset";
    locala.uQH.put("offset", "INTEGER");
    localStringBuilder.append(" offset INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "status";
    locala.uQH.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "path";
    locala.uQH.put("path", "TEXT");
    localStringBuilder.append(" path TEXT");
    localStringBuilder.append(", ");
    locala.columns[9] = "dataType";
    locala.uQH.put("dataType", "INTEGER");
    localStringBuilder.append(" dataType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[10] = "modifyTime";
    locala.uQH.put("modifyTime", "LONG default '0' ");
    localStringBuilder.append(" modifyTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "extFlag";
    locala.uQH.put("extFlag", "INTEGER default '0' ");
    localStringBuilder.append(" extFlag INTEGER default '0' ");
    locala.columns[12] = "rowid";
    locala.uQI = localStringBuilder.toString();
    GMTrace.o(4154172899328L, 30951);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4154307117056L, 30952);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4154307117056L, 30952);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ggD == k)
      {
        this.field_dataId = paramCursor.getString(i);
        this.ggy = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (ggE == k) {
          this.field_favLocalId = paramCursor.getLong(i);
        } else if (fTv == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (gfg == k) {
          this.field_cdnUrl = paramCursor.getString(i);
        } else if (ggF == k) {
          this.field_cdnKey = paramCursor.getString(i);
        } else if (fUl == k) {
          this.field_totalLen = paramCursor.getInt(i);
        } else if (fUm == k) {
          this.field_offset = paramCursor.getInt(i);
        } else if (fSu == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (ggG == k) {
          this.field_path = paramCursor.getString(i);
        } else if (fUD == k) {
          this.field_dataType = paramCursor.getInt(i);
        } else if (fWf == k) {
          this.field_modifyTime = paramCursor.getLong(i);
        } else if (ggH == k) {
          this.field_extFlag = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4154307117056L, 30952);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4154441334784L, 30953);
    ContentValues localContentValues = new ContentValues();
    if (this.ggy) {
      localContentValues.put("dataId", this.field_dataId);
    }
    if (this.ggz) {
      localContentValues.put("favLocalId", Long.valueOf(this.field_favLocalId));
    }
    if (this.fSZ) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.geH) {
      localContentValues.put("cdnUrl", this.field_cdnUrl);
    }
    if (this.ggA) {
      localContentValues.put("cdnKey", this.field_cdnKey);
    }
    if (this.fTU) {
      localContentValues.put("totalLen", Integer.valueOf(this.field_totalLen));
    }
    if (this.fTV) {
      localContentValues.put("offset", Integer.valueOf(this.field_offset));
    }
    if (this.fSr) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.ggB) {
      localContentValues.put("path", this.field_path);
    }
    if (this.fUA) {
      localContentValues.put("dataType", Integer.valueOf(this.field_dataType));
    }
    if (this.fVJ) {
      localContentValues.put("modifyTime", Long.valueOf(this.field_modifyTime));
    }
    if (this.ggC) {
      localContentValues.put("extFlag", Integer.valueOf(this.field_extFlag));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4154441334784L, 30953);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */