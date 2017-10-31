package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bu
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int glU;
  private static final int glV;
  private static final int glW;
  private static final int glX;
  public String field_contactId;
  public String field_sortKey;
  public String field_systemAddressBookUsername;
  public String field_wechatUsername;
  private boolean glQ;
  private boolean glR;
  private boolean glS;
  private boolean glT;
  
  static
  {
    GMTrace.i(4162360180736L, 31012);
    fSf = new String[0];
    glU = "wechatUsername".hashCode();
    glV = "systemAddressBookUsername".hashCode();
    glW = "contactId".hashCode();
    glX = "sortKey".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4162360180736L, 31012);
  }
  
  public bu()
  {
    GMTrace.i(4161957527552L, 31009);
    this.glQ = true;
    this.glR = true;
    this.glS = true;
    this.glT = true;
    GMTrace.o(4161957527552L, 31009);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4162091745280L, 31010);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4162091745280L, 31010);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (glU == k) {
        this.field_wechatUsername = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (glV == k) {
          this.field_systemAddressBookUsername = paramCursor.getString(i);
        } else if (glW == k) {
          this.field_contactId = paramCursor.getString(i);
        } else if (glX == k) {
          this.field_sortKey = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4162091745280L, 31010);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4162225963008L, 31011);
    ContentValues localContentValues = new ContentValues();
    if (this.glQ) {
      localContentValues.put("wechatUsername", this.field_wechatUsername);
    }
    if (this.glR) {
      localContentValues.put("systemAddressBookUsername", this.field_systemAddressBookUsername);
    }
    if (this.glS) {
      localContentValues.put("contactId", this.field_contactId);
    }
    if (this.glT) {
      localContentValues.put("sortKey", this.field_sortKey);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4162225963008L, 31011);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */