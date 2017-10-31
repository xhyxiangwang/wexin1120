package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class b
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUO;
  private static final int pvi;
  private static final int pvj;
  private boolean fUN;
  public boolean field_isshowed;
  public int field_lastshaketime;
  public String field_username;
  private boolean pvg;
  private boolean pvh;
  
  static
  {
    GMTrace.i(6618007732224L, 49308);
    fSf = new String[0];
    fUO = "username".hashCode();
    pvi = "lastshaketime".hashCode();
    pvj = "isshowed".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(6618007732224L, 49308);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6617739296768L, 49306);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(6617739296768L, 49306);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
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
        if (pvi == k)
        {
          this.field_lastshaketime = paramCursor.getInt(i);
        }
        else
        {
          if (pvj == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isshowed = bool;
              break;
            }
          }
          if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(6617739296768L, 49306);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(6617873514496L, 49307);
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null) {
      this.field_username = "";
    }
    if (this.fUN) {
      localContentValues.put("username", this.field_username);
    }
    if (this.pvg) {
      localContentValues.put("lastshaketime", Integer.valueOf(this.field_lastshaketime));
    }
    if (this.pvh) {
      localContentValues.put("isshowed", Boolean.valueOf(this.field_isshowed));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(6617873514496L, 49307);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */