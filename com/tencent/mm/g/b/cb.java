package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ajv;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.bsj;
import com.tencent.mm.protocal.c.lq;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class cb
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUg;
  private static final int gon;
  private static final int goo;
  private static final int gop;
  private static final int goq;
  private static final int gor;
  private boolean fTP;
  public av field_actionsheetInfo;
  public String field_appId;
  public int field_appIdHash;
  public bsj field_hostInfo;
  public lq field_jsapiInfo;
  public ajv field_launchAction;
  private boolean goi;
  private boolean goj;
  private boolean gok;
  private boolean gol;
  private boolean gom;
  
  static
  {
    GMTrace.i(15354508083200L, 114400);
    fSf = new String[0];
    gon = "appIdHash".hashCode();
    fUg = "appId".hashCode();
    goo = "launchAction".hashCode();
    gop = "jsapiInfo".hashCode();
    goq = "hostInfo".hashCode();
    gor = "actionsheetInfo".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(15354508083200L, 114400);
  }
  
  public cb()
  {
    GMTrace.i(15354105430016L, 114397);
    this.goi = true;
    this.fTP = true;
    this.goj = true;
    this.gok = true;
    this.gol = true;
    this.gom = true;
    GMTrace.o(15354105430016L, 114397);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(15354239647744L, 114398);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(15354239647744L, 114398);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gon == k)
      {
        this.field_appIdHash = paramCursor.getInt(i);
        this.goi = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fUg == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (goo == k) {
          try
          {
            byte[] arrayOfByte1 = paramCursor.getBlob(i);
            if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
              continue;
            }
            this.field_launchAction = ((ajv)new ajv().aC(arrayOfByte1));
          }
          catch (IOException localIOException1)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException1.getMessage());
          }
        } else if (gop == k) {
          try
          {
            byte[] arrayOfByte2 = paramCursor.getBlob(i);
            if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
              continue;
            }
            this.field_jsapiInfo = ((lq)new lq().aC(arrayOfByte2));
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException2.getMessage());
          }
        } else if (goq == k) {
          try
          {
            byte[] arrayOfByte3 = paramCursor.getBlob(i);
            if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0)) {
              continue;
            }
            this.field_hostInfo = ((bsj)new bsj().aC(arrayOfByte3));
          }
          catch (IOException localIOException3)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException3.getMessage());
          }
        } else if (gor == k) {
          try
          {
            byte[] arrayOfByte4 = paramCursor.getBlob(i);
            if ((arrayOfByte4 == null) || (arrayOfByte4.length <= 0)) {
              continue;
            }
            this.field_actionsheetInfo = ((av)new av().aC(arrayOfByte4));
          }
          catch (IOException localIOException4)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException4.getMessage());
          }
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(15354239647744L, 114398);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(15354373865472L, 114399);
    ContentValues localContentValues = new ContentValues();
    if (this.goi) {
      localContentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
    }
    if (this.fTP) {
      localContentValues.put("appId", this.field_appId);
    }
    if ((this.goj) && (this.field_launchAction != null)) {}
    try
    {
      localContentValues.put("launchAction", this.field_launchAction.toByteArray());
      if ((!this.gok) || (this.field_jsapiInfo == null)) {}
    }
    catch (IOException localIOException3)
    {
      try
      {
        localContentValues.put("jsapiInfo", this.field_jsapiInfo.toByteArray());
        if ((!this.gol) || (this.field_hostInfo == null)) {}
      }
      catch (IOException localIOException3)
      {
        try
        {
          localContentValues.put("hostInfo", this.field_hostInfo.toByteArray());
          if ((!this.gom) || (this.field_actionsheetInfo == null)) {}
        }
        catch (IOException localIOException3)
        {
          try
          {
            for (;;)
            {
              localContentValues.put("actionsheetInfo", this.field_actionsheetInfo.toByteArray());
              if (this.uQF > 0L) {
                localContentValues.put("rowid", Long.valueOf(this.uQF));
              }
              GMTrace.o(15354373865472L, 114399);
              return localContentValues;
              localIOException1 = localIOException1;
              w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException1.getMessage());
              continue;
              localIOException2 = localIOException2;
              w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException2.getMessage());
            }
            localIOException3 = localIOException3;
            w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException3.getMessage());
          }
          catch (IOException localIOException4)
          {
            for (;;)
            {
              w.e("MicroMsg.SDK.BaseLaunchWxaAppRespTable", localIOException4.getMessage());
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */