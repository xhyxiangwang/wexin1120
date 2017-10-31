package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class a
  extends c
{
  public static final String[] fSf;
  private static final int fSk;
  private static final int fSl;
  private static final int fSm;
  private static final int fSn;
  private static final int fSo;
  private boolean fSg;
  private boolean fSh;
  private boolean fSi;
  private boolean fSj;
  public String field_chatroom;
  public boolean field_insertmsg;
  public long field_msgId;
  public String field_payMsgId;
  
  static
  {
    GMTrace.i(4135650852864L, 30813);
    fSf = new String[0];
    fSk = "payMsgId".hashCode();
    fSl = "insertmsg".hashCode();
    fSm = "chatroom".hashCode();
    fSn = "msgId".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4135650852864L, 30813);
  }
  
  public a()
  {
    GMTrace.i(4135248199680L, 30810);
    this.fSg = true;
    this.fSh = true;
    this.fSi = true;
    this.fSj = true;
    GMTrace.o(4135248199680L, 30810);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4135382417408L, 30811);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4135382417408L, 30811);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fSk == k)
      {
        this.field_payMsgId = paramCursor.getString(i);
        this.fSg = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fSl == k)
        {
          if (paramCursor.getInt(i) != 0) {}
          for (boolean bool = true;; bool = false)
          {
            this.field_insertmsg = bool;
            break;
          }
        }
        if (fSm == k) {
          this.field_chatroom = paramCursor.getString(i);
        } else if (fSn == k) {
          this.field_msgId = paramCursor.getLong(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(4135382417408L, 30811);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4135516635136L, 30812);
    ContentValues localContentValues = new ContentValues();
    if (this.fSg) {
      localContentValues.put("payMsgId", this.field_payMsgId);
    }
    if (this.fSh) {
      localContentValues.put("insertmsg", Boolean.valueOf(this.field_insertmsg));
    }
    if (this.fSi) {
      localContentValues.put("chatroom", this.field_chatroom);
    }
    if (this.fSj) {
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4135516635136L, 30812);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */