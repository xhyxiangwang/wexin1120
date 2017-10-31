package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class df
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gep;
  private static final int gvs;
  private static final int gvt;
  private static final int gvu;
  public int field_count;
  public String field_memberList;
  public long field_tagId;
  public String field_tagName;
  private boolean gdP;
  private boolean gvp;
  private boolean gvq;
  private boolean gvr;
  
  static
  {
    GMTrace.i(4116323500032L, 30669);
    fSf = new String[0];
    gvs = "tagId".hashCode();
    gvt = "tagName".hashCode();
    gep = "count".hashCode();
    gvu = "memberList".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4116323500032L, 30669);
  }
  
  public df()
  {
    GMTrace.i(4115920846848L, 30666);
    this.gvp = true;
    this.gvq = true;
    this.gdP = true;
    this.gvr = true;
    GMTrace.o(4115920846848L, 30666);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4116055064576L, 30667);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4116055064576L, 30667);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gvs == k) {
        this.field_tagId = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (gvt == k) {
          this.field_tagName = paramCursor.getString(i);
        } else if (gep == k) {
          this.field_count = paramCursor.getInt(i);
        } else if (gvu == k) {
          this.field_memberList = paramCursor.getString(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4116055064576L, 30667);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4116189282304L, 30668);
    ContentValues localContentValues = new ContentValues();
    if (this.gvp) {
      localContentValues.put("tagId", Long.valueOf(this.field_tagId));
    }
    if (this.field_tagName == null) {
      this.field_tagName = "";
    }
    if (this.gvq) {
      localContentValues.put("tagName", this.field_tagName);
    }
    if (this.gdP) {
      localContentValues.put("count", Integer.valueOf(this.field_count));
    }
    if (this.field_memberList == null) {
      this.field_memberList = "";
    }
    if (this.gvr) {
      localContentValues.put("memberList", this.field_memberList);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4116189282304L, 30668);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/df.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */