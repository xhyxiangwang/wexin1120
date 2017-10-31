package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class bk
  extends c
{
  private static final int fSS;
  public static final String[] fSf;
  private static final int fSn;
  private static final int fSo;
  private static final int fTs;
  private static final int fUg;
  private static final int fXN;
  private static final int gjL;
  private static final int gjM;
  private static final int gjN;
  private static final int gjO;
  private static final int gjP;
  private static final int gjQ;
  private static final int gjR;
  private static final int gjS;
  private static final int gjT;
  private boolean fSO;
  private boolean fSW;
  private boolean fSj;
  private boolean fTP;
  private boolean fXz;
  public String field_appId;
  public long field_createTime;
  public long field_expireTime;
  public String field_gameMsgId;
  public boolean field_isHidden;
  public boolean field_isRead;
  public String field_label;
  public String field_mergerId;
  public long field_msgId;
  public int field_msgType;
  public String field_rawXML;
  public long field_receiveTime;
  public boolean field_showInMsgList;
  public String field_weight;
  private boolean gjC;
  private boolean gjD;
  private boolean gjE;
  private boolean gjF;
  private boolean gjG;
  private boolean gjH;
  private boolean gjI;
  private boolean gjJ;
  private boolean gjK;
  
  static
  {
    GMTrace.i(4136187723776L, 30817);
    fSf = new String[0];
    fSn = "msgId".hashCode();
    gjL = "mergerId".hashCode();
    gjM = "gameMsgId".hashCode();
    fXN = "msgType".hashCode();
    fTs = "createTime".hashCode();
    gjN = "expireTime".hashCode();
    fUg = "appId".hashCode();
    gjO = "showInMsgList".hashCode();
    gjP = "isRead".hashCode();
    gjQ = "label".hashCode();
    gjR = "isHidden".hashCode();
    gjS = "weight".hashCode();
    fSS = "rawXML".hashCode();
    gjT = "receiveTime".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4136187723776L, 30817);
  }
  
  public bk()
  {
    GMTrace.i(4135785070592L, 30814);
    this.fSj = true;
    this.gjC = true;
    this.gjD = true;
    this.fXz = true;
    this.fSW = true;
    this.gjE = true;
    this.fTP = true;
    this.gjF = true;
    this.gjG = true;
    this.gjH = true;
    this.gjI = true;
    this.gjJ = true;
    this.fSO = true;
    this.gjK = true;
    GMTrace.o(4135785070592L, 30814);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4135919288320L, 30815);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4135919288320L, 30815);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fSn == k)
      {
        this.field_msgId = paramCursor.getLong(i);
        this.fSj = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gjL == k)
        {
          this.field_mergerId = paramCursor.getString(i);
        }
        else if (gjM == k)
        {
          this.field_gameMsgId = paramCursor.getString(i);
        }
        else if (fXN == k)
        {
          this.field_msgType = paramCursor.getInt(i);
        }
        else if (fTs == k)
        {
          this.field_createTime = paramCursor.getLong(i);
        }
        else if (gjN == k)
        {
          this.field_expireTime = paramCursor.getLong(i);
        }
        else if (fUg == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else
        {
          boolean bool;
          if (gjO == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_showInMsgList = bool;
              break;
            }
          }
          if (gjP == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (bool = true;; bool = false)
            {
              this.field_isRead = bool;
              break;
            }
          }
          if (gjQ == k)
          {
            this.field_label = paramCursor.getString(i);
          }
          else
          {
            if (gjR == k)
            {
              if (paramCursor.getInt(i) != 0) {}
              for (bool = true;; bool = false)
              {
                this.field_isHidden = bool;
                break;
              }
            }
            if (gjS == k) {
              this.field_weight = paramCursor.getString(i);
            } else if (fSS == k) {
              this.field_rawXML = paramCursor.getString(i);
            } else if (gjT == k) {
              this.field_receiveTime = paramCursor.getLong(i);
            } else if (fSo == k) {
              this.uQF = paramCursor.getLong(i);
            }
          }
        }
      }
    }
    GMTrace.o(4135919288320L, 30815);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4136053506048L, 30816);
    ContentValues localContentValues = new ContentValues();
    if (this.fSj) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.gjC) {
      localContentValues.put("mergerId", this.field_mergerId);
    }
    if (this.gjD) {
      localContentValues.put("gameMsgId", this.field_gameMsgId);
    }
    if (this.fXz) {
      localContentValues.put("msgType", Integer.valueOf(this.field_msgType));
    }
    if (this.fSW) {
      localContentValues.put("createTime", Long.valueOf(this.field_createTime));
    }
    if (this.gjE) {
      localContentValues.put("expireTime", Long.valueOf(this.field_expireTime));
    }
    if (this.fTP) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.gjF) {
      localContentValues.put("showInMsgList", Boolean.valueOf(this.field_showInMsgList));
    }
    if (this.gjG) {
      localContentValues.put("isRead", Boolean.valueOf(this.field_isRead));
    }
    if (this.field_label == null) {
      this.field_label = "";
    }
    if (this.gjH) {
      localContentValues.put("label", this.field_label);
    }
    if (this.gjI) {
      localContentValues.put("isHidden", Boolean.valueOf(this.field_isHidden));
    }
    if (this.field_weight == null) {
      this.field_weight = "";
    }
    if (this.gjJ) {
      localContentValues.put("weight", this.field_weight);
    }
    if (this.field_rawXML == null) {
      this.field_rawXML = "";
    }
    if (this.fSO) {
      localContentValues.put("rawXML", this.field_rawXML);
    }
    if (this.gjK) {
      localContentValues.put("receiveTime", Long.valueOf(this.field_receiveTime));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4136053506048L, 30816);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */