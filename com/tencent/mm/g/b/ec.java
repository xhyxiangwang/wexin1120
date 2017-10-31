package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ec
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUg;
  private static final int gAY;
  private static final int gon;
  private boolean fTP;
  public String field_appId;
  public int field_appIdHash;
  public boolean field_openDebug;
  private boolean gAX;
  private boolean goi;
  
  static
  {
    GMTrace.i(17945581322240L, 133705);
    fSf = new String[0];
    gon = "appIdHash".hashCode();
    fUg = "appId".hashCode();
    gAY = "openDebug".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(17945581322240L, 133705);
  }
  
  public ec()
  {
    GMTrace.i(17945178669056L, 133702);
    this.goi = true;
    this.fTP = true;
    this.gAX = true;
    GMTrace.o(17945178669056L, 133702);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17945312886784L, 133703);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17945312886784L, 133703);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gon == k)
      {
        this.field_appIdHash = paramCursor.getInt(i);
        this.goi = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fUg == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else
        {
          if (gAY == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_openDebug = bool;
              break;
            }
          }
          if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(17945312886784L, 133703);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(17945447104512L, 133704);
    ContentValues localContentValues = new ContentValues();
    if (this.goi) {
      localContentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
    }
    if (this.fTP) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.gAX) {
      localContentValues.put("openDebug", Boolean.valueOf(this.field_openDebug));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(17945447104512L, 133704);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */