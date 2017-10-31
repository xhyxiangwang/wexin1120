package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class cs
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int geU;
  private static final int gmz;
  private static final int gsF;
  private static final int gsG;
  public long field_createtime;
  public String field_devicetype;
  public String field_name;
  public String field_uid;
  private boolean gev;
  private boolean gmu;
  private boolean gsD;
  private boolean gsE;
  
  static
  {
    GMTrace.i(4159675826176L, 30992);
    fSf = new String[0];
    gsF = "uid".hashCode();
    geU = "name".hashCode();
    gsG = "devicetype".hashCode();
    gmz = "createtime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4159675826176L, 30992);
  }
  
  public cs()
  {
    GMTrace.i(4159273172992L, 30989);
    this.gsD = true;
    this.gev = true;
    this.gsE = true;
    this.gmu = true;
    GMTrace.o(4159273172992L, 30989);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4159407390720L, 30990);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4159407390720L, 30990);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gsF == k)
      {
        this.field_uid = paramCursor.getString(i);
        this.gsD = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (geU == k) {
          this.field_name = paramCursor.getString(i);
        } else if (gsG == k) {
          this.field_devicetype = paramCursor.getString(i);
        } else if (gmz == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4159407390720L, 30990);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4159541608448L, 30991);
    ContentValues localContentValues = new ContentValues();
    if (this.field_uid == null) {
      this.field_uid = "";
    }
    if (this.gsD) {
      localContentValues.put("uid", this.field_uid);
    }
    if (this.field_name == null) {
      this.field_name = "";
    }
    if (this.gev) {
      localContentValues.put("name", this.field_name);
    }
    if (this.field_devicetype == null) {
      this.field_devicetype = "";
    }
    if (this.gsE) {
      localContentValues.put("devicetype", this.field_devicetype);
    }
    if (this.gmu) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4159541608448L, 30991);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */