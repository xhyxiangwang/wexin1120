package com.tencent.mm.plugin.bottle.a;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bt.g;
import com.tencent.mm.sdk.e.j;

public final class b
  extends j
{
  public static final String[] gMz;
  public g hhi;
  
  static
  {
    GMTrace.i(7598602452992L, 56614);
    gMz = new String[] { "CREATE TABLE IF NOT EXISTS bottleinfo1 ( parentclientid text  , childcount int  , bottleid text  PRIMARY KEY , bottletype int  , msgtype int  , voicelen int  , content text  , createtime long  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) " };
    GMTrace.o(7598602452992L, 56614);
  }
  
  public b(g paramg)
  {
    GMTrace.i(7598334017536L, 56612);
    this.hhi = paramg;
    GMTrace.o(7598334017536L, 56612);
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(7598468235264L, 56613);
    parama.fJg = -1;
    ContentValues localContentValues = new ContentValues();
    String str;
    if ((parama.fJg & 0x1) != 0)
    {
      if (parama.keJ == null)
      {
        str = "";
        localContentValues.put("parentclientid", str);
      }
    }
    else
    {
      if ((parama.fJg & 0x2) != 0) {
        localContentValues.put("childcount", Integer.valueOf(parama.keK));
      }
      if ((parama.fJg & 0x4) != 0) {
        localContentValues.put("bottleid", parama.agO());
      }
      if ((parama.fJg & 0x8) != 0) {
        localContentValues.put("bottletype", Integer.valueOf(parama.keM));
      }
      if ((parama.fJg & 0x10) != 0) {
        localContentValues.put("msgtype", Integer.valueOf(parama.msgType));
      }
      if ((parama.fJg & 0x20) != 0) {
        localContentValues.put("voicelen", Integer.valueOf(parama.keN));
      }
      if ((parama.fJg & 0x40) != 0) {
        localContentValues.put("content", parama.rh());
      }
      if ((parama.fJg & 0x80) != 0) {
        localContentValues.put("createtime", Long.valueOf(parama.keO));
      }
      if ((parama.fJg & 0x100) != 0) {
        localContentValues.put("reserved1", Integer.valueOf(parama.hhe));
      }
      if ((parama.fJg & 0x200) != 0) {
        localContentValues.put("reserved2", Integer.valueOf(parama.hvE));
      }
      if ((parama.fJg & 0x400) != 0)
      {
        if (parama.hhg != null) {
          break label340;
        }
        str = "";
        label270:
        localContentValues.put("reserved3", str);
      }
      if ((parama.fJg & 0x800) != 0) {
        if (parama.hhh != null) {
          break label348;
        }
      }
    }
    label340:
    label348:
    for (parama = "";; parama = parama.hhh)
    {
      localContentValues.put("reserved4", parama);
      if ((int)this.hhi.insert("bottleinfo1", "bottleid", localContentValues) == -1) {
        break label356;
      }
      GMTrace.o(7598468235264L, 56613);
      return true;
      str = parama.keJ;
      break;
      str = parama.hhg;
      break label270;
    }
    label356:
    GMTrace.o(7598468235264L, 56613);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */