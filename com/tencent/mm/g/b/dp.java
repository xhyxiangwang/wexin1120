package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dp
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gjT;
  private static final int grC;
  private static final int gyl;
  private static final int gym;
  private static final int gyn;
  private static final int gyo;
  public int field_hbStatus;
  public int field_hbType;
  public String field_mNativeUrl;
  public long field_receiveAmount;
  public int field_receiveStatus;
  public long field_receiveTime;
  private boolean gjK;
  private boolean grA;
  private boolean gyh;
  private boolean gyi;
  private boolean gyj;
  private boolean gyk;
  
  static
  {
    GMTrace.i(4148535754752L, 30909);
    fSf = new String[0];
    gyl = "mNativeUrl".hashCode();
    gym = "hbType".hashCode();
    gyn = "receiveAmount".hashCode();
    gjT = "receiveTime".hashCode();
    grC = "receiveStatus".hashCode();
    gyo = "hbStatus".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4148535754752L, 30909);
  }
  
  public dp()
  {
    GMTrace.i(4148133101568L, 30906);
    this.gyh = true;
    this.gyi = true;
    this.gyj = true;
    this.gjK = true;
    this.grA = true;
    this.gyk = true;
    GMTrace.o(4148133101568L, 30906);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4148267319296L, 30907);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4148267319296L, 30907);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gyl == k)
      {
        this.field_mNativeUrl = paramCursor.getString(i);
        this.gyh = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gym == k) {
          this.field_hbType = paramCursor.getInt(i);
        } else if (gyn == k) {
          this.field_receiveAmount = paramCursor.getLong(i);
        } else if (gjT == k) {
          this.field_receiveTime = paramCursor.getLong(i);
        } else if (grC == k) {
          this.field_receiveStatus = paramCursor.getInt(i);
        } else if (gyo == k) {
          this.field_hbStatus = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4148267319296L, 30907);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4148401537024L, 30908);
    ContentValues localContentValues = new ContentValues();
    if (this.gyh) {
      localContentValues.put("mNativeUrl", this.field_mNativeUrl);
    }
    if (this.gyi) {
      localContentValues.put("hbType", Integer.valueOf(this.field_hbType));
    }
    if (this.gyj) {
      localContentValues.put("receiveAmount", Long.valueOf(this.field_receiveAmount));
    }
    if (this.gjK) {
      localContentValues.put("receiveTime", Long.valueOf(this.field_receiveTime));
    }
    if (this.grA) {
      localContentValues.put("receiveStatus", Integer.valueOf(this.field_receiveStatus));
    }
    if (this.gyk) {
      localContentValues.put("hbStatus", Integer.valueOf(this.field_hbStatus));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4148401537024L, 30908);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */