package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class j
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTN;
  private static final int fUJ;
  private static final int fUK;
  private static final int fUL;
  private static final int fUM;
  private boolean fTL;
  private boolean fUF;
  private boolean fUG;
  private boolean fUH;
  private boolean fUI;
  public String field_brandId;
  public int field_recordId;
  public int field_scene;
  public long field_updateTime;
  public int field_versionType;
  
  static
  {
    GMTrace.i(4163433922560L, 31020);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemUpdateTimeIndex ON AppBrandLauncherLayoutItem(updateTime)", "CREATE INDEX IF NOT EXISTS AppBrandLauncherLayoutItemSceneIndex ON AppBrandLauncherLayoutItem(scene)" };
    fUJ = "recordId".hashCode();
    fUK = "brandId".hashCode();
    fUL = "versionType".hashCode();
    fUM = "updateTime".hashCode();
    fTN = "scene".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4163433922560L, 31020);
  }
  
  public j()
  {
    GMTrace.i(4163031269376L, 31017);
    this.fUF = true;
    this.fUG = true;
    this.fUH = true;
    this.fUI = true;
    this.fTL = true;
    GMTrace.o(4163031269376L, 31017);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4163165487104L, 31018);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4163165487104L, 31018);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fUJ == k)
      {
        this.field_recordId = paramCursor.getInt(i);
        this.fUF = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fUK == k) {
          this.field_brandId = paramCursor.getString(i);
        } else if (fUL == k) {
          this.field_versionType = paramCursor.getInt(i);
        } else if (fUM == k) {
          this.field_updateTime = paramCursor.getLong(i);
        } else if (fTN == k) {
          this.field_scene = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4163165487104L, 31018);
  }
  
  public ContentValues qQ()
  {
    GMTrace.i(4163299704832L, 31019);
    ContentValues localContentValues = new ContentValues();
    if (this.fUF) {
      localContentValues.put("recordId", Integer.valueOf(this.field_recordId));
    }
    if (this.fUG) {
      localContentValues.put("brandId", this.field_brandId);
    }
    if (this.fUH) {
      localContentValues.put("versionType", Integer.valueOf(this.field_versionType));
    }
    if (this.fUI) {
      localContentValues.put("updateTime", Long.valueOf(this.field_updateTime));
    }
    if (this.fTL) {
      localContentValues.put("scene", Integer.valueOf(this.field_scene));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4163299704832L, 31019);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */