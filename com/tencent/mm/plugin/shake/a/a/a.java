package com.tencent.mm.plugin.shake.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class a
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fSu;
  private static final int fTv;
  private static final int fWY;
  private static final int geQ;
  private static final int geV;
  private static final int geW;
  private static final int geX;
  private static final int gft;
  private static final int ghH;
  private static final int ght;
  private static final int gmz;
  private static final int pve;
  private static final int pvf;
  private boolean fSZ;
  private boolean fSr;
  private boolean fWU;
  public long field_createtime;
  public String field_desc;
  public String field_reserved1;
  public String field_reserved2;
  public int field_reserved3;
  public byte[] field_reservedBuf;
  public int field_status;
  public int field_subtype;
  public long field_svrid;
  public String field_tag;
  public String field_thumburl;
  public String field_title;
  public int field_type;
  private boolean ger;
  private boolean gew;
  private boolean gex;
  private boolean gey;
  private boolean gfp;
  private boolean ghr;
  private boolean ghx;
  private boolean gmu;
  private boolean pvc;
  private boolean pvd;
  
  static
  {
    GMTrace.i(6617605079040L, 49305);
    fSf = new String[0];
    geQ = "svrid".hashCode();
    fTv = "type".hashCode();
    ght = "subtype".hashCode();
    gmz = "createtime".hashCode();
    ghH = "tag".hashCode();
    fSu = "status".hashCode();
    fWY = "title".hashCode();
    gft = "desc".hashCode();
    pve = "thumburl".hashCode();
    geV = "reserved1".hashCode();
    geW = "reserved2".hashCode();
    geX = "reserved3".hashCode();
    pvf = "reservedBuf".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(6617605079040L, 49305);
  }
  
  public a()
  {
    GMTrace.i(6617202425856L, 49302);
    this.ger = true;
    this.fSZ = true;
    this.ghr = true;
    this.gmu = true;
    this.ghx = true;
    this.fSr = true;
    this.fWU = true;
    this.gfp = true;
    this.pvc = true;
    this.gew = true;
    this.gex = true;
    this.gey = true;
    this.pvd = true;
    GMTrace.o(6617202425856L, 49302);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(6617336643584L, 49303);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(6617336643584L, 49303);
      return;
    }
    int i = 0;
    int j = arrayOfString.length;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (geQ == k)
      {
        this.field_svrid = paramCursor.getLong(i);
        this.ger = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fTv == k) {
          this.field_type = paramCursor.getInt(i);
        } else if (ght == k) {
          this.field_subtype = paramCursor.getInt(i);
        } else if (gmz == k) {
          this.field_createtime = paramCursor.getLong(i);
        } else if (ghH == k) {
          this.field_tag = paramCursor.getString(i);
        } else if (fSu == k) {
          this.field_status = paramCursor.getInt(i);
        } else if (fWY == k) {
          this.field_title = paramCursor.getString(i);
        } else if (gft == k) {
          this.field_desc = paramCursor.getString(i);
        } else if (pve == k) {
          this.field_thumburl = paramCursor.getString(i);
        } else if (geV == k) {
          this.field_reserved1 = paramCursor.getString(i);
        } else if (geW == k) {
          this.field_reserved2 = paramCursor.getString(i);
        } else if (geX == k) {
          this.field_reserved3 = paramCursor.getInt(i);
        } else if (pvf == k) {
          this.field_reservedBuf = paramCursor.getBlob(i);
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(6617336643584L, 49303);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(6617470861312L, 49304);
    ContentValues localContentValues = new ContentValues();
    if (this.ger) {
      localContentValues.put("svrid", Long.valueOf(this.field_svrid));
    }
    if (this.fSZ) {
      localContentValues.put("type", Integer.valueOf(this.field_type));
    }
    if (this.ghr) {
      localContentValues.put("subtype", Integer.valueOf(this.field_subtype));
    }
    if (this.gmu) {
      localContentValues.put("createtime", Long.valueOf(this.field_createtime));
    }
    if (this.ghx) {
      localContentValues.put("tag", this.field_tag);
    }
    if (this.fSr) {
      localContentValues.put("status", Integer.valueOf(this.field_status));
    }
    if (this.fWU) {
      localContentValues.put("title", this.field_title);
    }
    if (this.gfp) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.pvc) {
      localContentValues.put("thumburl", this.field_thumburl);
    }
    if (this.gew) {
      localContentValues.put("reserved1", this.field_reserved1);
    }
    if (this.gex) {
      localContentValues.put("reserved2", this.field_reserved2);
    }
    if (this.gey) {
      localContentValues.put("reserved3", Integer.valueOf(this.field_reserved3));
    }
    if (this.pvd) {
      localContentValues.put("reservedBuf", this.field_reservedBuf);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(6617470861312L, 49304);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */