package com.tencent.mm.plugin.masssend.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;

public final class a
{
  int fJg;
  public String filename;
  public int fjT;
  String hNT;
  int hUu;
  public long hUw;
  long hUx;
  String hhg;
  String hhh;
  public int msgType;
  String nGn;
  public String nGo;
  public int nGp;
  public int nGq;
  int nGr;
  int nGs;
  public int nGt;
  public int nGu;
  int status;
  
  public a()
  {
    GMTrace.i(11212951650304L, 83543);
    this.fJg = -1;
    this.hNT = "";
    this.status = 0;
    this.hUw = 0L;
    this.hUx = 0L;
    this.filename = "";
    this.nGn = "";
    this.nGo = "";
    this.nGp = 0;
    this.msgType = 0;
    this.nGq = 0;
    this.nGr = 0;
    this.fjT = 0;
    this.hUu = 0;
    this.nGs = 0;
    this.nGt = 0;
    this.nGu = 0;
    this.hhg = "";
    this.hhh = "";
    GMTrace.o(11212951650304L, 83543);
  }
  
  public final String aMq()
  {
    GMTrace.i(11213220085760L, 83545);
    if (this.hNT == null)
    {
      GMTrace.o(11213220085760L, 83545);
      return "";
    }
    String str = this.hNT;
    GMTrace.o(11213220085760L, 83545);
    return str;
  }
  
  public final String aMr()
  {
    GMTrace.i(11213354303488L, 83546);
    if (this.filename == null)
    {
      GMTrace.o(11213354303488L, 83546);
      return "";
    }
    String str = this.filename;
    GMTrace.o(11213354303488L, 83546);
    return str;
  }
  
  public final String aMs()
  {
    GMTrace.i(11213488521216L, 83547);
    if (this.nGn == null)
    {
      GMTrace.o(11213488521216L, 83547);
      return "";
    }
    String str = this.nGn;
    GMTrace.o(11213488521216L, 83547);
    return str;
  }
  
  public final String aMt()
  {
    GMTrace.i(11213622738944L, 83548);
    if (this.nGo == null)
    {
      GMTrace.o(11213622738944L, 83548);
      return "";
    }
    String str = this.nGo;
    GMTrace.o(11213622738944L, 83548);
    return str;
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(11213085868032L, 83544);
    this.hNT = paramCursor.getString(0);
    this.status = paramCursor.getInt(1);
    this.hUw = paramCursor.getLong(2);
    this.hUx = paramCursor.getLong(3);
    this.filename = paramCursor.getString(4);
    this.nGn = paramCursor.getString(5);
    this.nGo = paramCursor.getString(6);
    this.nGp = paramCursor.getInt(7);
    this.msgType = paramCursor.getInt(8);
    this.nGq = paramCursor.getInt(9);
    this.nGr = paramCursor.getInt(10);
    this.fjT = paramCursor.getInt(11);
    this.hUu = paramCursor.getInt(12);
    this.nGs = paramCursor.getInt(13);
    this.nGt = paramCursor.getInt(14);
    this.nGu = paramCursor.getInt(15);
    this.hhg = paramCursor.getString(16);
    this.hhh = paramCursor.getString(17);
    GMTrace.o(11213085868032L, 83544);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */