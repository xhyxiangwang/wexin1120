package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public abstract class c
  extends com.tencent.mm.sdk.e.c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUO;
  private static final int fWY;
  private static final int gmz;
  private static final int pvm;
  private static final int pvn;
  private boolean fUN;
  private boolean fWU;
  public long field_createtime;
  public String field_deeplink;
  public String field_iconurl;
  public String field_title;
  public String field_username;
  private boolean gmu;
  private boolean pvk;
  private boolean pvl;
  
  static
  {
    GMTrace.i(6617068208128L, 49301);
    fSf = new String[0];
    fUO = "username".hashCode();
    pvm = "deeplink".hashCode();
    fWY = "title".hashCode();
    pvn = "iconurl".hashCode();
    gmz = "createtime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(6617068208128L, 49301);
  }
  
  public c()
  {
    GMTrace.i(6616665554944L, 49298);
    this.fUN = true;
    this.pvk = true;
    this.fWU = true;
    this.pvl = true;
    this.gmu = true;
    GMTrace.o(6616665554944L, 49298);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6616799772672L, 49299);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(6616799772672L, 49299);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fUO == k)
      {
        this.field_username = paramCursor.getString(i);
        this.fUN = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (pvm == k) {
          this.field_deeplink = paramCursor.getString(i);
        } else if (fWY == k) {
          this.field_title = paramCursor.getString(i);
        } else if (pvn == k) {
          this.field_iconurl = paramCursor.getString(i);
        } else if (gmz == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(6616799772672L, 49299);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(6616933990400L, 49300);
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null) {
      this.field_username = "";
    }
    if (this.fUN) {
      localContentValues.put("username", this.field_username);
    }
    if (this.field_deeplink == null) {
      this.field_deeplink = "";
    }
    if (this.pvk) {
      localContentValues.put("deeplink", this.field_deeplink);
    }
    if (this.field_title == null) {
      this.field_title = "";
    }
    if (this.fWU) {
      localContentValues.put("title", this.field_title);
    }
    if (this.field_iconurl == null) {
      this.field_iconurl = "";
    }
    if (this.pvl) {
      localContentValues.put("iconurl", this.field_iconurl);
    }
    if (this.gmu) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(6616933990400L, 49300);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */