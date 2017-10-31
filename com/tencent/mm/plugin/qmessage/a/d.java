package com.tencent.mm.plugin.qmessage.a;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;

public final class d
{
  String extInfo;
  public int fJg;
  int hhe;
  int hli;
  int hlj;
  int hvE;
  long hwh;
  public int oEe;
  public long oEf;
  public long oEg;
  String oEh;
  String oEi;
  String oEj;
  String oEk;
  public String username;
  
  public d()
  {
    GMTrace.i(8937290072064L, 66588);
    this.fJg = -1;
    this.username = "";
    this.hwh = 0L;
    this.extInfo = "";
    this.oEe = 0;
    this.oEf = 0L;
    this.oEg = 0L;
    this.hhe = 0;
    this.hvE = 0;
    this.hli = 0;
    this.hlj = 0;
    this.oEh = "";
    this.oEi = "";
    this.oEj = "";
    this.oEk = "";
    GMTrace.o(8937290072064L, 66588);
  }
  
  public final String aWE()
  {
    GMTrace.i(8937692725248L, 66591);
    if (this.extInfo == null)
    {
      GMTrace.o(8937692725248L, 66591);
      return "";
    }
    String str = this.extInfo;
    GMTrace.o(8937692725248L, 66591);
    return str;
  }
  
  public final String getUsername()
  {
    GMTrace.i(8937558507520L, 66590);
    if (this.username == null)
    {
      GMTrace.o(8937558507520L, 66590);
      return "";
    }
    String str = this.username;
    GMTrace.o(8937558507520L, 66590);
    return str;
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(8937424289792L, 66589);
    ContentValues localContentValues = new ContentValues();
    if ((this.fJg & 0x1) != 0) {
      localContentValues.put("username", getUsername());
    }
    if ((this.fJg & 0x2) != 0) {
      localContentValues.put("qq", Long.valueOf(this.hwh));
    }
    if ((this.fJg & 0x4) != 0) {
      localContentValues.put("extinfo", aWE());
    }
    if ((this.fJg & 0x8) != 0) {
      localContentValues.put("needupdate", Integer.valueOf(this.oEe));
    }
    if ((this.fJg & 0x10) != 0) {
      localContentValues.put("extupdateseq", Long.valueOf(this.oEf));
    }
    if ((this.fJg & 0x20) != 0) {
      localContentValues.put("imgupdateseq", Long.valueOf(this.oEg));
    }
    if ((this.fJg & 0x40) != 0) {
      localContentValues.put("reserved1", Integer.valueOf(this.hhe));
    }
    if ((this.fJg & 0x80) != 0) {
      localContentValues.put("reserved2", Integer.valueOf(this.hvE));
    }
    if ((this.fJg & 0x100) != 0) {
      localContentValues.put("reserved3", Integer.valueOf(this.hli));
    }
    if ((this.fJg & 0x200) != 0) {
      localContentValues.put("reserved4", Integer.valueOf(this.hlj));
    }
    if ((this.fJg & 0x400) != 0)
    {
      if (this.oEh == null)
      {
        str = "";
        localContentValues.put("reserved5", str);
      }
    }
    else
    {
      if ((this.fJg & 0x800) != 0)
      {
        if (this.oEi != null) {
          break label370;
        }
        str = "";
        label289:
        localContentValues.put("reserved6", str);
      }
      if ((this.fJg & 0x1000) != 0)
      {
        if (this.oEj != null) {
          break label378;
        }
        str = "";
        label317:
        localContentValues.put("reserved7", str);
      }
      if ((this.fJg & 0x2000) != 0) {
        if (this.oEk != null) {
          break label386;
        }
      }
    }
    label370:
    label378:
    label386:
    for (String str = "";; str = this.oEk)
    {
      localContentValues.put("reserved8", str);
      GMTrace.o(8937424289792L, 66589);
      return localContentValues;
      str = this.oEh;
      break;
      str = this.oEi;
      break label289;
      str = this.oEj;
      break label317;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */