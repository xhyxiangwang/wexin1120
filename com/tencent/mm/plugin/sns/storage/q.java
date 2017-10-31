package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.data.i;

public final class q
{
  long hUw;
  private int huF;
  public int offset;
  public int quQ;
  public byte[] qvA;
  private long qvu;
  public int qvv;
  public String qvw;
  private int qvx;
  private long qvy;
  public String qvz;
  public int type;
  private String userName;
  
  public q()
  {
    GMTrace.i(8182583787520L, 60965);
    GMTrace.o(8182583787520L, 60965);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(8182852222976L, 60967);
    this.quQ = paramCursor.getInt(0);
    long l = paramCursor.getLong(1);
    this.qvu = l;
    this.qvz = i.jdMethod_do(l);
    this.type = paramCursor.getInt(2);
    this.hUw = paramCursor.getLong(3);
    this.userName = paramCursor.getString(4);
    this.qvv = paramCursor.getInt(5);
    this.offset = paramCursor.getInt(6);
    this.huF = paramCursor.getInt(7);
    this.qvw = paramCursor.getString(8);
    this.qvx = paramCursor.getInt(9);
    this.qvy = paramCursor.getLong(10);
    this.qvz = paramCursor.getString(11);
    this.qvA = paramCursor.getBlob(12);
    GMTrace.o(8182852222976L, 60967);
  }
  
  public final ContentValues bkB()
  {
    GMTrace.i(8182718005248L, 60966);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("seqId", Long.valueOf(this.qvu));
    localContentValues.put("type", Integer.valueOf(this.type));
    localContentValues.put("createTime", Long.valueOf(this.hUw));
    localContentValues.put("userName", this.userName);
    localContentValues.put("totallen", Integer.valueOf(this.qvv));
    localContentValues.put("offset", Integer.valueOf(this.offset));
    localContentValues.put("local_flag", Integer.valueOf(this.huF));
    localContentValues.put("tmp_path", this.qvw);
    localContentValues.put("nums", Integer.valueOf(this.qvx));
    localContentValues.put("try_times", Long.valueOf(this.qvy));
    localContentValues.put("StrId", this.qvz);
    localContentValues.put("upload_buf", this.qvA);
    GMTrace.o(8182718005248L, 60966);
    return localContentValues;
  }
  
  public final void bkC()
  {
    GMTrace.i(8182986440704L, 60968);
    this.huF |= 0x4;
    GMTrace.o(8182986440704L, 60968);
  }
  
  public final void bkD()
  {
    GMTrace.i(8183120658432L, 60969);
    this.huF &= 0xFFFFFFFB;
    GMTrace.o(8183120658432L, 60969);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */