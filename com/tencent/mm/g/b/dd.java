package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dd
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTA;
  private static final int fTB;
  private static final int fTC;
  private static final int fTJ;
  private static final int fTp;
  private static final int fTq;
  private static final int fTr;
  private static final int fTs;
  private static final int fTt;
  private static final int fTu;
  private static final int fTv;
  private static final int fTw;
  private static final int fTx;
  private static final int fTy;
  private static final int fTz;
  private boolean fST;
  private boolean fSU;
  private boolean fSV;
  private boolean fSW;
  private boolean fSX;
  private boolean fSY;
  private boolean fSZ;
  private boolean fTa;
  private boolean fTb;
  private boolean fTc;
  private boolean fTd;
  private boolean fTe;
  private boolean fTf;
  private boolean fTg;
  private boolean fTn;
  public byte[] field_attrBuf;
  public byte[] field_content;
  public int field_createTime;
  public int field_head;
  public int field_likeFlag;
  public int field_localFlag;
  public int field_localPrivate;
  public byte[] field_postBuf;
  public int field_pravited;
  public long field_snsId;
  public int field_sourceType;
  public String field_stringSeq;
  public int field_subType;
  public int field_type;
  public String field_userName;
  
  static
  {
    GMTrace.i(4121155338240L, 30705);
    fSf = new String[0];
    fTp = "snsId".hashCode();
    fTq = "userName".hashCode();
    fTr = "localFlag".hashCode();
    fTs = "createTime".hashCode();
    fTt = "head".hashCode();
    fTu = "localPrivate".hashCode();
    fTv = "type".hashCode();
    fTw = "sourceType".hashCode();
    fTx = "likeFlag".hashCode();
    fTy = "pravited".hashCode();
    fTz = "stringSeq".hashCode();
    fTA = "content".hashCode();
    fTB = "attrBuf".hashCode();
    fTC = "postBuf".hashCode();
    fTJ = "subType".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4121155338240L, 30705);
  }
  
  public dd()
  {
    GMTrace.i(4120752685056L, 30702);
    this.fST = true;
    this.fSU = true;
    this.fSV = true;
    this.fSW = true;
    this.fSX = true;
    this.fSY = true;
    this.fSZ = true;
    this.fTa = true;
    this.fTb = true;
    this.fTc = true;
    this.fTd = true;
    this.fTe = true;
    this.fTf = true;
    this.fTg = true;
    this.fTn = true;
    GMTrace.o(4120752685056L, 30702);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4120886902784L, 30703);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4120886902784L, 30703);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fTp == k) {
        this.field_snsId = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fTq == k) {
          this.field_userName = paramCursor.getString(i);
        } else if (fTr == k) {
          this.field_localFlag = paramCursor.getInt(i);
        } else if (fTs == k) {
          this.field_createTime = paramCursor.getInt(i);
        } else if (fTt == k) {
          this.field_head = paramCursor.getInt(i);
        } else if (fTu == k) {
          this.field_localPrivate = paramCursor.getInt(i);
        } else if (fTv == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (fTw == k) {
          this.field_sourceType = paramCursor.getInt(i);
        } else if (fTx == k) {
          this.field_likeFlag = paramCursor.getInt(i);
        } else if (fTy == k) {
          this.field_pravited = paramCursor.getInt(i);
        } else if (fTz == k) {
          this.field_stringSeq = paramCursor.getString(i);
        } else if (fTA == k) {
          this.field_content = paramCursor.getBlob(i);
        } else if (fTB == k) {
          this.field_attrBuf = paramCursor.getBlob(i);
        } else if (fTC == k) {
          this.field_postBuf = paramCursor.getBlob(i);
        } else if (fTJ == k) {
          this.field_subType = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4120886902784L, 30703);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4121021120512L, 30704);
    ContentValues localContentValues = new ContentValues();
    if (this.fST) {
      localContentValues.put("snsId", Long.valueOf(this.field_snsId));
    }
    if (this.fSU) {
      localContentValues.put("userName", this.field_userName);
    }
    if (this.fSV) {
      localContentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
    }
    if (this.fSW) {
      localContentValues.put("createTime", Integer.valueOf(this.field_createTime));
    }
    if (this.fSX) {
      localContentValues.put("head", Integer.valueOf(this.field_head));
    }
    if (this.fSY) {
      localContentValues.put("localPrivate", Integer.valueOf(this.field_localPrivate));
    }
    if (this.fSZ) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.fTa) {
      localContentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
    }
    if (this.fTb) {
      localContentValues.put("likeFlag", Integer.valueOf(this.field_likeFlag));
    }
    if (this.fTc) {
      localContentValues.put("pravited", Integer.valueOf(this.field_pravited));
    }
    if (this.fTd) {
      localContentValues.put("stringSeq", this.field_stringSeq);
    }
    if (this.fTe) {
      localContentValues.put("content", this.field_content);
    }
    if (this.fTf) {
      localContentValues.put("attrBuf", this.field_attrBuf);
    }
    if (this.fTg) {
      localContentValues.put("postBuf", this.field_postBuf);
    }
    if (this.fTn) {
      localContentValues.put("subType", Integer.valueOf(this.field_subType));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4121021120512L, 30704);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */