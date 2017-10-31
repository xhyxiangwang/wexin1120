package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class m
  extends c
{
  private static final int fSI;
  private static final int fSJ;
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTs;
  private static final int fUg;
  private static final int fVA;
  private static final int fVB;
  private static final int fVC;
  private static final int fVw;
  private static final int fVx;
  private static final int fVy;
  private static final int fVz;
  private boolean fSA;
  private boolean fSB;
  private boolean fSW;
  private boolean fTP;
  private boolean fVp;
  private boolean fVq;
  private boolean fVr;
  private boolean fVs;
  private boolean fVt;
  private boolean fVu;
  private boolean fVv;
  public String field_appId;
  public long field_createTime;
  public int field_debugType;
  public String field_downloadURL;
  public long field_endTime;
  public String field_pkgPath;
  public int field_resourceCount;
  public long field_startTime;
  public int field_version;
  public String field_versionMd5;
  public int field_versionState;
  
  static
  {
    GMTrace.i(4157796777984L, 30978);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS AppBrandWxaPkgManifestRecordPkgPathIndex ON AppBrandWxaPkgManifestRecord(pkgPath)" };
    fUg = "appId".hashCode();
    fVw = "version".hashCode();
    fVx = "versionMd5".hashCode();
    fVy = "versionState".hashCode();
    fVz = "pkgPath".hashCode();
    fTs = "createTime".hashCode();
    fVA = "resourceCount".hashCode();
    fVB = "debugType".hashCode();
    fVC = "downloadURL".hashCode();
    fSI = "startTime".hashCode();
    fSJ = "endTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4157796777984L, 30978);
  }
  
  public m()
  {
    GMTrace.i(4157394124800L, 30975);
    this.fTP = true;
    this.fVp = true;
    this.fVq = true;
    this.fVr = true;
    this.fVs = true;
    this.fSW = true;
    this.fVt = true;
    this.fVu = true;
    this.fVv = true;
    this.fSA = true;
    this.fSB = true;
    GMTrace.o(4157394124800L, 30975);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4157528342528L, 30976);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4157528342528L, 30976);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fUg == k) {
        this.field_appId = paramCursor.getString(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fVw == k) {
          this.field_version = paramCursor.getInt(i);
        } else if (fVx == k) {
          this.field_versionMd5 = paramCursor.getString(i);
        } else if (fVy == k) {
          this.field_versionState = paramCursor.getInt(i);
        } else if (fVz == k) {
          this.field_pkgPath = paramCursor.getString(i);
        } else if (fTs == k) {
          this.field_createTime = paramCursor.getLong(i);
        } else if (fVA == k) {
          this.field_resourceCount = paramCursor.getInt(i);
        } else if (fVB == k) {
          this.field_debugType = paramCursor.getInt(i);
        } else if (fVC == k) {
          this.field_downloadURL = paramCursor.getString(i);
        } else if (fSI == k) {
          this.field_startTime = paramCursor.getLong(i);
        } else if (fSJ == k) {
          this.field_endTime = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4157528342528L, 30976);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4157662560256L, 30977);
    ContentValues localContentValues = new ContentValues();
    if (this.fTP) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fVp) {
      localContentValues.put("version", Integer.valueOf(this.field_version));
    }
    if (this.fVq) {
      localContentValues.put("versionMd5", this.field_versionMd5);
    }
    if (this.fVr) {
      localContentValues.put("versionState", Integer.valueOf(this.field_versionState));
    }
    if (this.fVs) {
      localContentValues.put("pkgPath", this.field_pkgPath);
    }
    if (this.fSW) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.fVt) {
      localContentValues.put("resourceCount", Integer.valueOf(this.field_resourceCount));
    }
    if (this.fVu) {
      localContentValues.put("debugType", Integer.valueOf(this.field_debugType));
    }
    if (this.fVv) {
      localContentValues.put("downloadURL", this.field_downloadURL);
    }
    if (this.fSA) {
      localContentValues.put("startTime", Long.valueOf(this.field_startTime));
    }
    if (this.fSB) {
      localContentValues.put("endTime", Long.valueOf(this.field_endTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4157662560256L, 30977);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */