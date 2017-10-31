package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class ba
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTv;
  private static final int fTw;
  private static final int fUM;
  private static final int fWX;
  private static final int fXd;
  private static final int gdn;
  private static final int ggM;
  private static final int ghc;
  private static final int ghd;
  private static final int ghe;
  private static final int ghf;
  private static final int ghg;
  private static final int ghh;
  private static final int ghi;
  private static final int ghj;
  private static final int ghk;
  private static final int ghl;
  private static final int ghm;
  private static final int ghn;
  private static final int gho;
  private static final int ghp;
  private boolean fSZ;
  private boolean fTa;
  private boolean fUI;
  private boolean fWT;
  private boolean fXb;
  public long field_datatotalsize;
  public long field_edittime;
  public String field_ext;
  public sz field_favProto;
  public int field_flag;
  public String field_fromUser;
  public int field_id;
  public int field_itemStatus;
  public long field_localId;
  public int field_localSeq;
  public String field_realChatName;
  public String field_sessionId;
  public long field_sourceCreateTime;
  public String field_sourceId;
  public int field_sourceType;
  public th field_tagProto;
  public String field_toUser;
  public int field_type;
  public int field_updateSeq;
  public long field_updateTime;
  public String field_xml;
  private boolean gdk;
  private boolean ggK;
  private boolean ggO;
  private boolean ggP;
  private boolean ggQ;
  private boolean ggR;
  private boolean ggS;
  private boolean ggT;
  private boolean ggU;
  private boolean ggV;
  private boolean ggW;
  private boolean ggX;
  private boolean ggY;
  private boolean ggZ;
  private boolean gha;
  private boolean ghb;
  
  static
  {
    GMTrace.i(4158467866624L, 30983);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS FavItemInfo_id_Index ON FavItemInfo(id)", "CREATE INDEX IF NOT EXISTS FavItemInfo_type_Index ON FavItemInfo(type)", "CREATE INDEX IF NOT EXISTS FavItemInfo_updateSeq_Index ON FavItemInfo(updateSeq)", "CREATE INDEX IF NOT EXISTS FavItemInfo_flag_Index ON FavItemInfo(flag)", "CREATE INDEX IF NOT EXISTS FavItemInfo_sourceId_Index ON FavItemInfo(sourceId)", "CREATE INDEX IF NOT EXISTS FavItemInfo_datatotalsize_Index ON FavItemInfo(datatotalsize)" };
    ggM = "localId".hashCode();
    gdn = "id".hashCode();
    fTv = "type".hashCode();
    ghc = "localSeq".hashCode();
    ghd = "updateSeq".hashCode();
    fXd = "flag".hashCode();
    ghe = "sourceId".hashCode();
    ghf = "itemStatus".hashCode();
    fTw = "sourceType".hashCode();
    ghg = "sourceCreateTime".hashCode();
    fUM = "updateTime".hashCode();
    ghh = "fromUser".hashCode();
    ghi = "toUser".hashCode();
    ghj = "realChatName".hashCode();
    ghk = "favProto".hashCode();
    fWX = "xml".hashCode();
    ghl = "ext".hashCode();
    ghm = "edittime".hashCode();
    ghn = "tagProto".hashCode();
    gho = "sessionId".hashCode();
    ghp = "datatotalsize".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4158467866624L, 30983);
  }
  
  public ba()
  {
    GMTrace.i(4157930995712L, 30979);
    this.ggK = true;
    this.gdk = true;
    this.fSZ = true;
    this.ggO = true;
    this.ggP = true;
    this.fXb = true;
    this.ggQ = true;
    this.ggR = true;
    this.fTa = true;
    this.ggS = true;
    this.fUI = true;
    this.ggT = true;
    this.ggU = true;
    this.ggV = true;
    this.ggW = true;
    this.fWT = true;
    this.ggX = true;
    this.ggY = true;
    this.ggZ = true;
    this.gha = true;
    this.ghb = true;
    GMTrace.o(4157930995712L, 30979);
  }
  
  public static c.a qR()
  {
    GMTrace.i(4158065213440L, 30980);
    c.a locala = new c.a();
    locala.hRR = new Field[21];
    locala.columns = new String[22];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "localId";
    locala.uQH.put("localId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" localId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "localId";
    locala.columns[1] = "id";
    locala.uQH.put("id", "INTEGER");
    localStringBuilder.append(" id INTEGER");
    localStringBuilder.append(", ");
    locala.columns[2] = "type";
    locala.uQH.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[3] = "localSeq";
    locala.uQH.put("localSeq", "INTEGER");
    localStringBuilder.append(" localSeq INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "updateSeq";
    locala.uQH.put("updateSeq", "INTEGER");
    localStringBuilder.append(" updateSeq INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "flag";
    locala.uQH.put("flag", "INTEGER");
    localStringBuilder.append(" flag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "sourceId";
    locala.uQH.put("sourceId", "TEXT");
    localStringBuilder.append(" sourceId TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "itemStatus";
    locala.uQH.put("itemStatus", "INTEGER");
    localStringBuilder.append(" itemStatus INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "sourceType";
    locala.uQH.put("sourceType", "INTEGER");
    localStringBuilder.append(" sourceType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[9] = "sourceCreateTime";
    locala.uQH.put("sourceCreateTime", "LONG");
    localStringBuilder.append(" sourceCreateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "updateTime";
    locala.uQH.put("updateTime", "LONG");
    localStringBuilder.append(" updateTime LONG");
    localStringBuilder.append(", ");
    locala.columns[11] = "fromUser";
    locala.uQH.put("fromUser", "TEXT");
    localStringBuilder.append(" fromUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[12] = "toUser";
    locala.uQH.put("toUser", "TEXT");
    localStringBuilder.append(" toUser TEXT");
    localStringBuilder.append(", ");
    locala.columns[13] = "realChatName";
    locala.uQH.put("realChatName", "TEXT");
    localStringBuilder.append(" realChatName TEXT");
    localStringBuilder.append(", ");
    locala.columns[14] = "favProto";
    locala.uQH.put("favProto", "BLOB");
    localStringBuilder.append(" favProto BLOB");
    localStringBuilder.append(", ");
    locala.columns[15] = "xml";
    locala.uQH.put("xml", "TEXT");
    localStringBuilder.append(" xml TEXT");
    localStringBuilder.append(", ");
    locala.columns[16] = "ext";
    locala.uQH.put("ext", "TEXT");
    localStringBuilder.append(" ext TEXT");
    localStringBuilder.append(", ");
    locala.columns[17] = "edittime";
    locala.uQH.put("edittime", "LONG");
    localStringBuilder.append(" edittime LONG");
    localStringBuilder.append(", ");
    locala.columns[18] = "tagProto";
    locala.uQH.put("tagProto", "BLOB");
    localStringBuilder.append(" tagProto BLOB");
    localStringBuilder.append(", ");
    locala.columns[19] = "sessionId";
    locala.uQH.put("sessionId", "TEXT");
    localStringBuilder.append(" sessionId TEXT");
    localStringBuilder.append(", ");
    locala.columns[20] = "datatotalsize";
    locala.uQH.put("datatotalsize", "LONG");
    localStringBuilder.append(" datatotalsize LONG");
    locala.columns[21] = "rowid";
    locala.uQI = localStringBuilder.toString();
    GMTrace.o(4158065213440L, 30980);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4158199431168L, 30981);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4158199431168L, 30981);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
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
        if (gdn == k) {
          this.field_id = paramCursor.getInt(i);
        } else if (fTv == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (ghc == k) {
          this.field_localSeq = paramCursor.getInt(i);
        } else if (ghd == k) {
          this.field_updateSeq = paramCursor.getInt(i);
        } else if (fXd == k) {
          this.field_flag = paramCursor.getInt(i);
        } else if (ghe == k) {
          this.field_sourceId = paramCursor.getString(i);
        } else if (ghf == k) {
          this.field_itemStatus = paramCursor.getInt(i);
        } else if (fTw == k) {
          this.field_sourceType = paramCursor.getInt(i);
        } else if (ghg == k) {
          this.field_sourceCreateTime = paramCursor.getLong(i);
        } else if (fUM == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (ghh == k) {
          this.field_fromUser = paramCursor.getString(i);
        } else if (ghi == k) {
          this.field_toUser = paramCursor.getString(i);
        } else if (ghj == k) {
          this.field_realChatName = paramCursor.getString(i);
        } else if (ghk == k) {
          try
          {
            byte[] arrayOfByte1 = paramCursor.getBlob(i);
            if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
              continue;
            }
            this.field_favProto = ((sz)new sz().aC(arrayOfByte1));
          }
          catch (IOException localIOException1)
          {
            w.e("MicroMsg.SDK.BaseFavItemInfo", localIOException1.getMessage());
          }
        } else if (fWX == k) {
          this.field_xml = paramCursor.getString(i);
        } else if (ghl == k) {
          this.field_ext = paramCursor.getString(i);
        } else if (ghm == k) {
          this.field_edittime = paramCursor.getLong(i);
        } else if (ghn == k) {
          try
          {
            byte[] arrayOfByte2 = paramCursor.getBlob(i);
            if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
              continue;
            }
            this.field_tagProto = ((th)new th().aC(arrayOfByte2));
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.SDK.BaseFavItemInfo", localIOException2.getMessage());
          }
        } else if (gho == k) {
          this.field_sessionId = paramCursor.getString(i);
        } else if (ghp == k) {
          this.field_datatotalsize = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4158199431168L, 30981);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4158333648896L, 30982);
    ContentValues localContentValues = new ContentValues();
    if (this.ggK) {
      localContentValues.put("localId", Long.valueOf(this.field_localId));
    }
    if (this.gdk) {
      localContentValues.put("id", Integer.valueOf(this.field_id));
    }
    if (this.fSZ) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.ggO) {
      localContentValues.put("localSeq", Integer.valueOf(this.field_localSeq));
    }
    if (this.ggP) {
      localContentValues.put("updateSeq", Integer.valueOf(this.field_updateSeq));
    }
    if (this.fXb) {
      localContentValues.put("flag", Integer.valueOf(this.field_flag));
    }
    if (this.ggQ) {
      localContentValues.put("sourceId", this.field_sourceId);
    }
    if (this.ggR) {
      localContentValues.put("itemStatus", Integer.valueOf(this.field_itemStatus));
    }
    if (this.fTa) {
      localContentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
    }
    if (this.ggS) {
      localContentValues.put("sourceCreateTime", Long.valueOf(this.field_sourceCreateTime));
    }
    if (this.fUI) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.ggT) {
      localContentValues.put("fromUser", this.field_fromUser);
    }
    if (this.ggU) {
      localContentValues.put("toUser", this.field_toUser);
    }
    if (this.ggV) {
      localContentValues.put("realChatName", this.field_realChatName);
    }
    if ((this.ggW) && (this.field_favProto != null)) {}
    try
    {
      localContentValues.put("favProto", this.field_favProto.toByteArray());
      if (this.fWT) {
        localContentValues.put("xml", this.field_xml);
      }
      if (this.ggX) {
        localContentValues.put("ext", this.field_ext);
      }
      if (this.ggY) {
        localContentValues.put("edittime", Long.valueOf(this.field_edittime));
      }
      if ((!this.ggZ) || (this.field_tagProto == null)) {}
    }
    catch (IOException localIOException1)
    {
      try
      {
        localContentValues.put("tagProto", this.field_tagProto.toByteArray());
        if (this.gha) {
          localContentValues.put("sessionId", this.field_sessionId);
        }
        if (this.ghb) {
          localContentValues.put("datatotalsize", Long.valueOf(this.field_datatotalsize));
        }
        if (this.uQF > 0L) {
          localContentValues.put("rowid", Long.valueOf(this.uQF));
        }
        GMTrace.o(4158333648896L, 30982);
        return localContentValues;
        localIOException1 = localIOException1;
        w.e("MicroMsg.SDK.BaseFavItemInfo", localIOException1.getMessage());
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          w.e("MicroMsg.SDK.BaseFavItemInfo", localIOException2.getMessage());
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */