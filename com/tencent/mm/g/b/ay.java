package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class ay
  extends c
{
  private static final int fSE;
  public static final String[] fSf;
  private static final int fSo;
  private static final int ggJ;
  private boolean fSw;
  public int field_configId;
  public String field_value;
  private boolean ggI;
  
  static
  {
    GMTrace.i(4157259907072L, 30974);
    fSf = new String[0];
    ggJ = "configId".hashCode();
    fSE = "value".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4157259907072L, 30974);
  }
  
  public ay()
  {
    GMTrace.i(4156723036160L, 30970);
    this.ggI = true;
    this.fSw = true;
    GMTrace.o(4156723036160L, 30970);
  }
  
  public static c.a qR()
  {
    GMTrace.i(4156857253888L, 30971);
    c.a locala = new c.a();
    locala.hRR = new Field[2];
    locala.columns = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "configId";
    locala.uQH.put("configId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" configId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "configId";
    locala.columns[1] = "value";
    locala.uQH.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    locala.columns[2] = "rowid";
    locala.uQI = localStringBuilder.toString();
    GMTrace.o(4156857253888L, 30971);
    return locala;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4156991471616L, 30972);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4156991471616L, 30972);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (ggJ == k)
      {
        this.field_configId = paramCursor.getInt(i);
        this.ggI = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fSE == k) {
          this.field_value = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4156991471616L, 30972);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4157125689344L, 30973);
    ContentValues localContentValues = new ContentValues();
    if (this.ggI) {
      localContentValues.put("configId", Integer.valueOf(this.field_configId));
    }
    if (this.fSw) {
      localContentValues.put("value", this.field_value);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4157125689344L, 30973);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */