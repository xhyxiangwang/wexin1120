package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bf
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fZW;
  private static final int giN;
  private static final int giO;
  private static final int giP;
  private static final int giQ;
  private static final int giR;
  private static final int giS;
  private static final int giT;
  private static final int giU;
  private static final int giV;
  private static final int giW;
  private static final int giX;
  private static final int giY;
  private static final int giZ;
  private boolean fZD;
  public int field_action;
  public int field_connectState;
  public long field_expiredTime;
  public String field_mac;
  public String field_mid;
  public String field_showUrl;
  public String field_showWordCn;
  public String field_showWordEn;
  public String field_showWordTw;
  public String field_ssid;
  public String field_ssidmd5;
  public String field_url;
  public int field_verifyResult;
  public int field_wifiType;
  private boolean giA;
  private boolean giB;
  private boolean giC;
  private boolean giD;
  private boolean giE;
  private boolean giF;
  private boolean giG;
  private boolean giH;
  private boolean giI;
  private boolean giJ;
  private boolean giK;
  private boolean giL;
  private boolean giM;
  
  static
  {
    GMTrace.i(4166252494848L, 31041);
    fSf = new String[0];
    giN = "ssidmd5".hashCode();
    giO = "ssid".hashCode();
    giP = "mid".hashCode();
    fZW = "url".hashCode();
    giQ = "connectState".hashCode();
    giR = "expiredTime".hashCode();
    giS = "wifiType".hashCode();
    giT = "action".hashCode();
    giU = "showUrl".hashCode();
    giV = "showWordEn".hashCode();
    giW = "showWordCn".hashCode();
    giX = "showWordTw".hashCode();
    giY = "mac".hashCode();
    giZ = "verifyResult".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4166252494848L, 31041);
  }
  
  public bf()
  {
    GMTrace.i(4165849841664L, 31038);
    this.giA = true;
    this.giB = true;
    this.giC = true;
    this.fZD = true;
    this.giD = true;
    this.giE = true;
    this.giF = true;
    this.giG = true;
    this.giH = true;
    this.giI = true;
    this.giJ = true;
    this.giK = true;
    this.giL = true;
    this.giM = true;
    GMTrace.o(4165849841664L, 31038);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4165984059392L, 31039);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4165984059392L, 31039);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (giN == k)
      {
        this.field_ssidmd5 = paramCursor.getString(i);
        this.giA = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (giO == k) {
          this.field_ssid = paramCursor.getString(i);
        } else if (giP == k) {
          this.field_mid = paramCursor.getString(i);
        } else if (fZW == k) {
          this.field_url = paramCursor.getString(i);
        } else if (giQ == k) {
          this.field_connectState = paramCursor.getInt(i);
        } else if (giR == k) {
          this.field_expiredTime = paramCursor.getLong(i);
        } else if (giS == k) {
          this.field_wifiType = paramCursor.getInt(i);
        } else if (giT == k) {
          this.field_action = paramCursor.getInt(i);
        } else if (giU == k) {
          this.field_showUrl = paramCursor.getString(i);
        } else if (giV == k) {
          this.field_showWordEn = paramCursor.getString(i);
        } else if (giW == k) {
          this.field_showWordCn = paramCursor.getString(i);
        } else if (giX == k) {
          this.field_showWordTw = paramCursor.getString(i);
        } else if (giY == k) {
          this.field_mac = paramCursor.getString(i);
        } else if (giZ == k) {
          this.field_verifyResult = paramCursor.getInt(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4165984059392L, 31039);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4166118277120L, 31040);
    ContentValues localContentValues = new ContentValues();
    if (this.giA) {
      localContentValues.put("ssidmd5", this.field_ssidmd5);
    }
    if (this.giB) {
      localContentValues.put("ssid", this.field_ssid);
    }
    if (this.giC) {
      localContentValues.put("mid", this.field_mid);
    }
    if (this.fZD) {
      localContentValues.put("url", this.field_url);
    }
    if (this.giD) {
      localContentValues.put("connectState", Integer.valueOf(this.field_connectState));
    }
    if (this.giE) {
      localContentValues.put("expiredTime", Long.valueOf(this.field_expiredTime));
    }
    if (this.giF) {
      localContentValues.put("wifiType", Integer.valueOf(this.field_wifiType));
    }
    if (this.giG) {
      localContentValues.put("action", Integer.valueOf(this.field_action));
    }
    if (this.giH) {
      localContentValues.put("showUrl", this.field_showUrl);
    }
    if (this.giI) {
      localContentValues.put("showWordEn", this.field_showWordEn);
    }
    if (this.giJ) {
      localContentValues.put("showWordCn", this.field_showWordCn);
    }
    if (this.giK) {
      localContentValues.put("showWordTw", this.field_showWordTw);
    }
    if (this.giL) {
      localContentValues.put("mac", this.field_mac);
    }
    if (this.giM) {
      localContentValues.put("verifyResult", Integer.valueOf(this.field_verifyResult));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4166118277120L, 31040);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */