package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.brv;
import com.tencent.mm.protocal.c.brw;
import com.tencent.mm.protocal.c.btj;
import com.tencent.mm.protocal.c.lq;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class cc
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUg;
  private static final int fVh;
  private static final int gon;
  private static final int goo;
  private static final int gow;
  private static final int gox;
  private static final int goy;
  private static final int goz;
  private boolean fTP;
  private boolean fUU;
  public String field_appId;
  public int field_appIdHash;
  public lq field_jsApiInfo;
  public brv field_launchAction;
  public int field_pkgType;
  public brw field_versionInfo;
  public btj field_widgetSetting;
  public int field_widgetType;
  private boolean goi;
  private boolean goj;
  private boolean gos;
  private boolean got;
  private boolean gou;
  private boolean gov;
  
  static
  {
    GMTrace.i(17943970709504L, 133693);
    fSf = new String[0];
    gon = "appIdHash".hashCode();
    fUg = "appId".hashCode();
    gow = "pkgType".hashCode();
    gox = "widgetType".hashCode();
    goo = "launchAction".hashCode();
    goy = "jsApiInfo".hashCode();
    fVh = "versionInfo".hashCode();
    goz = "widgetSetting".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(17943970709504L, 133693);
  }
  
  public cc()
  {
    GMTrace.i(17943568056320L, 133690);
    this.goi = true;
    this.fTP = true;
    this.gos = true;
    this.got = true;
    this.goj = true;
    this.gou = true;
    this.fUU = true;
    this.gov = true;
    GMTrace.o(17943568056320L, 133690);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(17943702274048L, 133691);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(17943702274048L, 133691);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gon == k) {
        this.field_appIdHash = paramCursor.getInt(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fUg == k) {
          this.field_appId = paramCursor.getString(i);
        } else if (gow == k) {
          this.field_pkgType = paramCursor.getInt(i);
        } else if (gox == k) {
          this.field_widgetType = paramCursor.getInt(i);
        } else if (goo == k) {
          try
          {
            byte[] arrayOfByte1 = paramCursor.getBlob(i);
            if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
              continue;
            }
            this.field_launchAction = ((brv)new brv().aC(arrayOfByte1));
          }
          catch (IOException localIOException1)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException1.getMessage());
          }
        } else if (goy == k) {
          try
          {
            byte[] arrayOfByte2 = paramCursor.getBlob(i);
            if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
              continue;
            }
            this.field_jsApiInfo = ((lq)new lq().aC(arrayOfByte2));
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException2.getMessage());
          }
        } else if (fVh == k) {
          try
          {
            byte[] arrayOfByte3 = paramCursor.getBlob(i);
            if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0)) {
              continue;
            }
            this.field_versionInfo = ((brw)new brw().aC(arrayOfByte3));
          }
          catch (IOException localIOException3)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException3.getMessage());
          }
        } else if (goz == k) {
          try
          {
            byte[] arrayOfByte4 = paramCursor.getBlob(i);
            if ((arrayOfByte4 == null) || (arrayOfByte4.length <= 0)) {
              continue;
            }
            this.field_widgetSetting = ((btj)new btj().aC(arrayOfByte4));
          }
          catch (IOException localIOException4)
          {
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException4.getMessage());
          }
        } else if (fSo == k) {
          this.uQF = paramCursor.getLong(i);
        }
      }
    }
    GMTrace.o(17943702274048L, 133691);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(17943836491776L, 133692);
    ContentValues localContentValues = new ContentValues();
    if (this.goi) {
      localContentValues.put("appIdHash", Integer.valueOf(this.field_appIdHash));
    }
    if (this.fTP) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.gos) {
      localContentValues.put("pkgType", Integer.valueOf(this.field_pkgType));
    }
    if (this.got) {
      localContentValues.put("widgetType", Integer.valueOf(this.field_widgetType));
    }
    if ((this.goj) && (this.field_launchAction != null)) {}
    try
    {
      localContentValues.put("launchAction", this.field_launchAction.toByteArray());
      if ((!this.gou) || (this.field_jsApiInfo == null)) {}
    }
    catch (IOException localIOException3)
    {
      try
      {
        localContentValues.put("jsApiInfo", this.field_jsApiInfo.toByteArray());
        if ((!this.fUU) || (this.field_versionInfo == null)) {}
      }
      catch (IOException localIOException3)
      {
        try
        {
          localContentValues.put("versionInfo", this.field_versionInfo.toByteArray());
          if ((!this.gov) || (this.field_widgetSetting == null)) {}
        }
        catch (IOException localIOException3)
        {
          try
          {
            for (;;)
            {
              localContentValues.put("widgetSetting", this.field_widgetSetting.toByteArray());
              if (this.uQF > 0L) {
                localContentValues.put("rowid", Long.valueOf(this.uQF));
              }
              GMTrace.o(17943836491776L, 133692);
              return localContentValues;
              localIOException1 = localIOException1;
              w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException1.getMessage());
              continue;
              localIOException2 = localIOException2;
              w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException2.getMessage());
            }
            localIOException3 = localIOException3;
            w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException3.getMessage());
          }
          catch (IOException localIOException4)
          {
            for (;;)
            {
              w.e("MicroMsg.SDK.BaseLaunchWxaWidgetRespData", localIOException4.getMessage());
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */