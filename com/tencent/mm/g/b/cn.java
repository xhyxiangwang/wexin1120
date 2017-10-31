package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cn
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTN;
  private static final int fUM;
  private static final int fUy;
  private static final int fVw;
  private boolean fTL;
  private boolean fUI;
  private boolean fUx;
  private boolean fVp;
  public String field_key;
  public int field_scene;
  public long field_updateTime;
  public int field_version;
  
  static
  {
    GMTrace.i(19674574094336L, 146587);
    fSf = new String[0];
    fUy = "key".hashCode();
    fVw = "version".hashCode();
    fTN = "scene".hashCode();
    fUM = "updateTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(19674574094336L, 146587);
  }
  
  public cn()
  {
    GMTrace.i(19674171441152L, 146584);
    this.fUx = true;
    this.fVp = true;
    this.fTL = true;
    this.fUI = true;
    GMTrace.o(19674171441152L, 146584);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(19674305658880L, 146585);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(19674305658880L, 146585);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fUy == k) {
        this.field_key = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fVw == k) {
          this.field_version = paramCursor.getInt(i);
        } else if (fTN == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (fUM == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(19674305658880L, 146585);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(19674439876608L, 146586);
    ContentValues localContentValues = new ContentValues();
    if (this.fUx) {
      localContentValues.put("key", this.field_key);
    }
    if (this.fVp) {
      localContentValues.put("version", Integer.valueOf(this.field_version));
    }
    if (this.fTL) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.fUI) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(19674439876608L, 146586);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */