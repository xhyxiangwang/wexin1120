package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class db
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fTs;
  private static final int fTv;
  private static final int fXM;
  private static final int ggc;
  private static final int gjP;
  private static final int guA;
  private static final int guB;
  private static final int guC;
  private static final int guD;
  private static final int guE;
  private static final int guF;
  private static final int guG;
  private static final int guz;
  private boolean fSW;
  private boolean fSZ;
  private boolean fXy;
  public String field_clientId;
  public long field_commentSvrID;
  public int field_commentflag;
  public int field_createTime;
  public byte[] field_curActionBuf;
  public short field_isRead;
  public boolean field_isSend;
  public int field_isSilence;
  public long field_parentID;
  public byte[] field_refActionBuf;
  public long field_snsID;
  public String field_talker;
  public int field_type;
  private boolean gfM;
  private boolean gjG;
  private boolean gur;
  private boolean gus;
  private boolean gut;
  private boolean guu;
  private boolean guv;
  private boolean guw;
  private boolean gux;
  private boolean guy;
  
  static
  {
    GMTrace.i(4138335207424L, 30833);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS SnsComment_snsID_index ON SnsComment(snsID)", "CREATE INDEX IF NOT EXISTS SnsComment_parentID_index ON SnsComment(parentID)", "CREATE INDEX IF NOT EXISTS SnsComment_isRead_index ON SnsComment(isRead)", "CREATE INDEX IF NOT EXISTS SnsComment_isSend_index ON SnsComment(isSend)" };
    guz = "snsID".hashCode();
    guA = "parentID".hashCode();
    gjP = "isRead".hashCode();
    fTs = "createTime".hashCode();
    ggc = "talker".hashCode();
    fTv = "type".hashCode();
    fXM = "isSend".hashCode();
    guB = "curActionBuf".hashCode();
    guC = "refActionBuf".hashCode();
    guD = "commentSvrID".hashCode();
    guE = "clientId".hashCode();
    guF = "commentflag".hashCode();
    guG = "isSilence".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4138335207424L, 30833);
  }
  
  public db()
  {
    GMTrace.i(4137932554240L, 30830);
    this.gur = true;
    this.gus = true;
    this.gjG = true;
    this.fSW = true;
    this.gfM = true;
    this.fSZ = true;
    this.fXy = true;
    this.gut = true;
    this.guu = true;
    this.guv = true;
    this.guw = true;
    this.gux = true;
    this.guy = true;
    GMTrace.o(4137932554240L, 30830);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4138066771968L, 30831);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4138066771968L, 30831);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (guz == k) {
        this.field_snsID = paramCursor.getLong(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (guA == k)
        {
          this.field_parentID = paramCursor.getLong(i);
        }
        else if (gjP == k)
        {
          this.field_isRead = paramCursor.getShort(i);
        }
        else if (fTs == k)
        {
          this.field_createTime = paramCursor.getInt(i);
        }
        else if (ggc == k)
        {
          this.field_talker = paramCursor.getString(i);
        }
        else if (fTv == k)
        {
          this.field_type = paramCursor.getInt(i);
        }
        else
        {
          if (fXM == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isSend = bool;
              break;
            }
          }
          if (guB == k) {
            this.field_curActionBuf = paramCursor.getBlob(i);
          } else if (guC == k) {
            this.field_refActionBuf = paramCursor.getBlob(i);
          } else if (guD == k) {
            this.field_commentSvrID = paramCursor.getLong(i);
          } else if (guE == k) {
            this.field_clientId = paramCursor.getString(i);
          } else if (guF == k) {
            this.field_commentflag = paramCursor.getInt(i);
          } else if (guG == k) {
            this.field_isSilence = paramCursor.getInt(i);
          } else if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4138066771968L, 30831);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4138200989696L, 30832);
    ContentValues localContentValues = new ContentValues();
    if (this.gur) {
      localContentValues.put("snsID", Long.valueOf(this.field_snsID));
    }
    if (this.gus) {
      localContentValues.put("parentID", Long.valueOf(this.field_parentID));
    }
    if (this.gjG) {
      localContentValues.put("isRead", Short.valueOf(this.field_isRead));
    }
    if (this.fSW) {
      localContentValues.put("createTime", Integer.valueOf(this.field_createTime));
    }
    if (this.gfM) {
      localContentValues.put("talker", this.field_talker);
    }
    if (this.fSZ) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.fXy) {
      localContentValues.put("isSend", Boolean.valueOf(this.field_isSend));
    }
    if (this.gut) {
      localContentValues.put("curActionBuf", this.field_curActionBuf);
    }
    if (this.guu) {
      localContentValues.put("refActionBuf", this.field_refActionBuf);
    }
    if (this.guv) {
      localContentValues.put("commentSvrID", Long.valueOf(this.field_commentSvrID));
    }
    if (this.guw) {
      localContentValues.put("clientId", this.field_clientId);
    }
    if (this.gux) {
      localContentValues.put("commentflag", Integer.valueOf(this.field_commentflag));
    }
    if (this.guy) {
      localContentValues.put("isSilence", Integer.valueOf(this.field_isSilence));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4138200989696L, 30832);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */