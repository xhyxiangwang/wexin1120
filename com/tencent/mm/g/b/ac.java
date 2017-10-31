package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ac
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fZR;
  private static final int gan;
  private static final int gao;
  private static final int gap;
  private static final int gaq;
  private static final int gar;
  private static final int gas;
  private boolean fZy;
  public String field_card_id;
  public int field_expire_time_interval;
  public long field_fetch_time;
  public int field_lower_bound;
  public boolean field_need_insert_show_timestamp;
  public int field_show_expire_interval;
  public String field_show_timestamp_encrypt_key;
  private boolean gah;
  private boolean gai;
  private boolean gaj;
  private boolean gak;
  private boolean gal;
  private boolean gam;
  
  static
  {
    GMTrace.i(18824841658368L, 140256);
    fSf = new String[0];
    fZR = "card_id".hashCode();
    gan = "lower_bound".hashCode();
    gao = "need_insert_show_timestamp".hashCode();
    gap = "show_timestamp_encrypt_key".hashCode();
    gaq = "expire_time_interval".hashCode();
    gar = "show_expire_interval".hashCode();
    gas = "fetch_time".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(18824841658368L, 140256);
  }
  
  public ac()
  {
    GMTrace.i(18824439005184L, 140253);
    this.fZy = true;
    this.gah = true;
    this.gai = true;
    this.gaj = true;
    this.gak = true;
    this.gal = true;
    this.gam = true;
    GMTrace.o(18824439005184L, 140253);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(18824573222912L, 140254);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(18824573222912L, 140254);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fZR == k)
      {
        this.field_card_id = paramCursor.getString(i);
        this.fZy = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gan == k)
        {
          this.field_lower_bound = paramCursor.getInt(i);
        }
        else
        {
          if (gao == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_need_insert_show_timestamp = bool;
              break;
            }
          }
          if (gap == k) {
            this.field_show_timestamp_encrypt_key = paramCursor.getString(i);
          } else if (gaq == k) {
            this.field_expire_time_interval = paramCursor.getInt(i);
          } else if (gar == k) {
            this.field_show_expire_interval = paramCursor.getInt(i);
          } else if (gas == k) {
            this.field_fetch_time = paramCursor.getLong(i);
          } else if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(18824573222912L, 140254);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(18824707440640L, 140255);
    ContentValues localContentValues = new ContentValues();
    if (this.fZy) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.gah) {
      localContentValues.put("lower_bound", Integer.valueOf(this.field_lower_bound));
    }
    if (this.gai) {
      localContentValues.put("need_insert_show_timestamp", Boolean.valueOf(this.field_need_insert_show_timestamp));
    }
    if (this.gaj) {
      localContentValues.put("show_timestamp_encrypt_key", this.field_show_timestamp_encrypt_key);
    }
    if (this.gak) {
      localContentValues.put("expire_time_interval", Integer.valueOf(this.field_expire_time_interval));
    }
    if (this.gal) {
      localContentValues.put("show_expire_interval", Integer.valueOf(this.field_show_expire_interval));
    }
    if (this.gam) {
      localContentValues.put("fetch_time", Long.valueOf(this.field_fetch_time));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(18824707440640L, 140255);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */