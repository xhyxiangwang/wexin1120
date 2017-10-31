package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dm
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gxI;
  private static final int gxJ;
  private static final int gxK;
  public String field_bulletin_content;
  public String field_bulletin_scene;
  public String field_bulletin_url;
  private boolean gxF;
  private boolean gxG;
  private boolean gxH;
  
  static
  {
    GMTrace.i(4153367592960L, 30945);
    fSf = new String[0];
    gxI = "bulletin_scene".hashCode();
    gxJ = "bulletin_content".hashCode();
    gxK = "bulletin_url".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4153367592960L, 30945);
  }
  
  public dm()
  {
    GMTrace.i(4152964939776L, 30942);
    this.gxF = true;
    this.gxG = true;
    this.gxH = true;
    GMTrace.o(4152964939776L, 30942);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4153099157504L, 30943);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4153099157504L, 30943);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gxI == k)
      {
        this.field_bulletin_scene = paramCursor.getString(i);
        this.gxF = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gxJ == k) {
          this.field_bulletin_content = paramCursor.getString(i);
        } else if (gxK == k) {
          this.field_bulletin_url = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4153099157504L, 30943);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4153233375232L, 30944);
    ContentValues localContentValues = new ContentValues();
    if (this.gxF) {
      localContentValues.put("bulletin_scene", this.field_bulletin_scene);
    }
    if (this.gxG) {
      localContentValues.put("bulletin_content", this.field_bulletin_content);
    }
    if (this.gxH) {
      localContentValues.put("bulletin_url", this.field_bulletin_url);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4153233375232L, 30944);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */