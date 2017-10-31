package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class b
  extends c
{
  public static final String[] fSf;
  private static final int fSl;
  private static final int fSo;
  private static final int fSs;
  private static final int fSt;
  private static final int fSu;
  private boolean fSh;
  private boolean fSp;
  private boolean fSq;
  private boolean fSr;
  public String field_billNo;
  public boolean field_insertmsg;
  public long field_localMsgId;
  public int field_status;
  
  static
  {
    GMTrace.i(4125316087808L, 30736);
    fSf = new String[0];
    fSs = "billNo".hashCode();
    fSl = "insertmsg".hashCode();
    fSt = "localMsgId".hashCode();
    fSu = "status".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4125316087808L, 30736);
  }
  
  public b()
  {
    GMTrace.i(4124913434624L, 30733);
    this.fSp = true;
    this.fSh = true;
    this.fSq = true;
    this.fSr = true;
    GMTrace.o(4124913434624L, 30733);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4125047652352L, 30734);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4125047652352L, 30734);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fSs == k)
      {
        this.field_billNo = paramCursor.getString(i);
        this.fSp = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fSl == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_insertmsg = bool;
            break;
          }
        }
        if (fSt == k) {
          this.field_localMsgId = paramCursor.getLong(i);
        } else if (fSu == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4125047652352L, 30734);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4125181870080L, 30735);
    ContentValues localContentValues = new ContentValues();
    if (this.fSp) {
      localContentValues.put("billNo", this.field_billNo);
    }
    if (this.fSh) {
      localContentValues.put("insertmsg", Boolean.valueOf(this.field_insertmsg));
    }
    if (this.fSq) {
      localContentValues.put("localMsgId", Long.valueOf(this.field_localMsgId));
    }
    if (this.fSr) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4125181870080L, 30735);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */