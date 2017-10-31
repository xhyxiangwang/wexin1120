package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bv
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTA;
  private static final int fWY;
  private static final int fXN;
  private static final int ggw;
  private static final int gjP;
  private static final int gma;
  private static final int gmb;
  private boolean fTe;
  private boolean fWU;
  private boolean fXz;
  public String field_content;
  public String field_descUrl;
  public short field_isRead;
  public int field_msgType;
  public long field_pushTime;
  public long field_svrId;
  public String field_title;
  private boolean ggt;
  private boolean gjG;
  private boolean glY;
  private boolean glZ;
  
  static
  {
    GMTrace.i(4163970793472L, 31024);
    fSf = new String[0];
    ggw = "svrId".hashCode();
    gjP = "isRead".hashCode();
    fWY = "title".hashCode();
    fTA = "content".hashCode();
    gma = "pushTime".hashCode();
    fXN = "msgType".hashCode();
    gmb = "descUrl".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4163970793472L, 31024);
  }
  
  public bv()
  {
    GMTrace.i(4163568140288L, 31021);
    this.ggt = true;
    this.gjG = true;
    this.fWU = true;
    this.fTe = true;
    this.glY = true;
    this.fXz = true;
    this.glZ = true;
    GMTrace.o(4163568140288L, 31021);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4163702358016L, 31022);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4163702358016L, 31022);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ggw == k)
      {
        this.field_svrId = paramCursor.getLong(i);
        this.ggt = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gjP == k) {
          this.field_isRead = paramCursor.getShort(i);
        } else if (fWY == k) {
          this.field_title = paramCursor.getString(i);
        } else if (fTA == k) {
          this.field_content = paramCursor.getString(i);
        } else if (gma == k) {
          this.field_pushTime = paramCursor.getLong(i);
        } else if (fXN == k) {
          this.field_msgType = paramCursor.getInt(i);
        } else if (gmb == k) {
          this.field_descUrl = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4163702358016L, 31022);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4163836575744L, 31023);
    ContentValues localContentValues = new ContentValues();
    if (this.ggt) {
      localContentValues.put("svrId", Long.valueOf(this.field_svrId));
    }
    if (this.gjG) {
      localContentValues.put("isRead", Short.valueOf(this.field_isRead));
    }
    if (this.fWU) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fTe) {
      localContentValues.put("content", this.field_content);
    }
    if (this.glY) {
      localContentValues.put("pushTime", Long.valueOf(this.field_pushTime));
    }
    if (this.fXz) {
      localContentValues.put("msgType", Integer.valueOf(this.field_msgType));
    }
    if (this.glZ) {
      localContentValues.put("descUrl", this.field_descUrl);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4163836575744L, 31023);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */