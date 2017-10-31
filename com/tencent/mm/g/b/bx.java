package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bx
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fSu;
  private static final int gmn;
  private static final int gmo;
  private static final int gmp;
  private static final int gmq;
  private static final int gmr;
  private boolean fSr;
  public long field_addressId;
  public long field_calltime;
  public long field_duration;
  public int field_phoneType;
  public String field_phonenumber;
  public int field_status;
  private boolean gmi;
  private boolean gmj;
  private boolean gmk;
  private boolean gml;
  private boolean gmm;
  
  static
  {
    GMTrace.i(4167326236672L, 31049);
    fSf = new String[0];
    gmn = "phonenumber".hashCode();
    gmo = "calltime".hashCode();
    gmp = "duration".hashCode();
    fSu = "status".hashCode();
    gmq = "addressId".hashCode();
    gmr = "phoneType".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4167326236672L, 31049);
  }
  
  public bx()
  {
    GMTrace.i(4166923583488L, 31046);
    this.gmi = true;
    this.gmj = true;
    this.gmk = true;
    this.fSr = true;
    this.gml = true;
    this.gmm = true;
    GMTrace.o(4166923583488L, 31046);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4167057801216L, 31047);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4167057801216L, 31047);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gmn == k) {
        this.field_phonenumber = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (gmo == k) {
          this.field_calltime = paramCursor.getLong(i);
        } else if (gmp == k) {
          this.field_duration = paramCursor.getLong(i);
        } else if (fSu == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (gmq == k) {
          this.field_addressId = paramCursor.getLong(i);
        } else if (gmr == k) {
          this.field_phoneType = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4167057801216L, 31047);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4167192018944L, 31048);
    ContentValues localContentValues = new ContentValues();
    if (this.gmi) {
      localContentValues.put("phonenumber", this.field_phonenumber);
    }
    if (this.gmj) {
      localContentValues.put("calltime", Long.valueOf(this.field_calltime));
    }
    if (this.gmk) {
      localContentValues.put("duration", Long.valueOf(this.field_duration));
    }
    if (this.fSr) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.gml) {
      localContentValues.put("addressId", Long.valueOf(this.field_addressId));
    }
    if (this.gmm) {
      localContentValues.put("phoneType", Integer.valueOf(this.field_phoneType));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4167192018944L, 31048);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */