package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bsm;
import com.tencent.mm.protocal.c.bss;
import com.tencent.mm.protocal.c.gm;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public abstract class l
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fUK;
  private static final int fUg;
  private static final int fUu;
  private static final int fVc;
  private static final int fVd;
  private static final int fVe;
  private static final int fVf;
  private static final int fVg;
  private static final int fVh;
  private static final int fVi;
  private static final int fVj;
  private static final int fVk;
  private static final int fVl;
  private static final int fVm;
  private static final int fVn;
  private static final int fVo;
  private boolean fTP;
  private boolean fUG;
  private boolean fUP;
  private boolean fUQ;
  private boolean fUR;
  private boolean fUS;
  private boolean fUT;
  private boolean fUU;
  private boolean fUV;
  private boolean fUW;
  private boolean fUX;
  private boolean fUY;
  private boolean fUZ;
  private boolean fUd;
  private boolean fVa;
  private boolean fVb;
  public int field_AppOpt;
  public String field_BigHeadImgUrl;
  public String field_appIcon;
  public String field_appId;
  public int field_appIdHashCode;
  public bsm field_appInfo;
  public String field_appName;
  public gm field_bindInfo;
  public int field_brandFlag;
  public String field_brandId;
  public boolean field_debugEnabled;
  public long field_lastSyncAttrTimeInSecond;
  public String field_roundedSquareIcon;
  public String field_signature;
  public String field_syncAttrVersion;
  public bss field_versionInfo;
  
  static
  {
    GMTrace.i(4136724594688L, 30821);
    fSf = new String[] { "CREATE INDEX IF NOT EXISTS AppBrandWxaAppInfoBrandIdIndex ON AppBrandWxaAppInfo(brandId)" };
    fVc = "appIdHashCode".hashCode();
    fUg = "appId".hashCode();
    fVd = "appIcon".hashCode();
    fVe = "appName".hashCode();
    fVf = "BigHeadImgUrl".hashCode();
    fVg = "appInfo".hashCode();
    fVh = "versionInfo".hashCode();
    fVi = "bindInfo".hashCode();
    fUK = "brandId".hashCode();
    fVj = "brandFlag".hashCode();
    fUu = "signature".hashCode();
    fVk = "AppOpt".hashCode();
    fVl = "syncAttrVersion".hashCode();
    fVm = "lastSyncAttrTimeInSecond".hashCode();
    fVn = "debugEnabled".hashCode();
    fVo = "roundedSquareIcon".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4136724594688L, 30821);
  }
  
  public l()
  {
    GMTrace.i(4136321941504L, 30818);
    this.fUP = true;
    this.fTP = true;
    this.fUQ = true;
    this.fUR = true;
    this.fUS = true;
    this.fUT = true;
    this.fUU = true;
    this.fUV = true;
    this.fUG = true;
    this.fUW = true;
    this.fUd = true;
    this.fUX = true;
    this.fUY = true;
    this.fUZ = true;
    this.fVa = true;
    this.fVb = true;
    GMTrace.o(4136321941504L, 30818);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4136456159232L, 30819);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4136456159232L, 30819);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fVc == k)
      {
        this.field_appIdHashCode = paramCursor.getInt(i);
        this.fUP = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (fUg == k)
        {
          this.field_appId = paramCursor.getString(i);
        }
        else if (fVd == k)
        {
          this.field_appIcon = paramCursor.getString(i);
        }
        else if (fVe == k)
        {
          this.field_appName = paramCursor.getString(i);
        }
        else if (fVf == k)
        {
          this.field_BigHeadImgUrl = paramCursor.getString(i);
        }
        else if (fVg == k)
        {
          try
          {
            byte[] arrayOfByte1 = paramCursor.getBlob(i);
            if ((arrayOfByte1 == null) || (arrayOfByte1.length <= 0)) {
              continue;
            }
            this.field_appInfo = ((bsm)new bsm().aC(arrayOfByte1));
          }
          catch (IOException localIOException1)
          {
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException1.getMessage());
          }
        }
        else if (fVh == k)
        {
          try
          {
            byte[] arrayOfByte2 = paramCursor.getBlob(i);
            if ((arrayOfByte2 == null) || (arrayOfByte2.length <= 0)) {
              continue;
            }
            this.field_versionInfo = ((bss)new bss().aC(arrayOfByte2));
          }
          catch (IOException localIOException2)
          {
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException2.getMessage());
          }
        }
        else if (fVi == k)
        {
          try
          {
            byte[] arrayOfByte3 = paramCursor.getBlob(i);
            if ((arrayOfByte3 == null) || (arrayOfByte3.length <= 0)) {
              continue;
            }
            this.field_bindInfo = ((gm)new gm().aC(arrayOfByte3));
          }
          catch (IOException localIOException3)
          {
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException3.getMessage());
          }
        }
        else if (fUK == k)
        {
          this.field_brandId = paramCursor.getString(i);
        }
        else if (fVj == k)
        {
          this.field_brandFlag = paramCursor.getInt(i);
        }
        else if (fUu == k)
        {
          this.field_signature = paramCursor.getString(i);
        }
        else if (fVk == k)
        {
          this.field_AppOpt = paramCursor.getInt(i);
        }
        else if (fVl == k)
        {
          this.field_syncAttrVersion = paramCursor.getString(i);
        }
        else if (fVm == k)
        {
          this.field_lastSyncAttrTimeInSecond = paramCursor.getLong(i);
        }
        else
        {
          if (fVn == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_debugEnabled = bool;
              break;
            }
          }
          if (fVo == k) {
            this.field_roundedSquareIcon = paramCursor.getString(i);
          } else if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4136456159232L, 30819);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4136590376960L, 30820);
    ContentValues localContentValues = new ContentValues();
    if (this.fUP) {
      localContentValues.put("appIdHashCode", Integer.valueOf(this.field_appIdHashCode));
    }
    if (this.fTP) {
      localContentValues.put("appId", this.field_appId);
    }
    if (this.fUQ) {
      localContentValues.put("appIcon", this.field_appIcon);
    }
    if (this.fUR) {
      localContentValues.put("appName", this.field_appName);
    }
    if (this.fUS) {
      localContentValues.put("BigHeadImgUrl", this.field_BigHeadImgUrl);
    }
    if ((this.fUT) && (this.field_appInfo != null)) {}
    try
    {
      localContentValues.put("appInfo", this.field_appInfo.toByteArray());
      if ((!this.fUU) || (this.field_versionInfo == null)) {}
    }
    catch (IOException localIOException2)
    {
      try
      {
        localContentValues.put("versionInfo", this.field_versionInfo.toByteArray());
        if ((!this.fUV) || (this.field_bindInfo == null)) {}
      }
      catch (IOException localIOException2)
      {
        try
        {
          for (;;)
          {
            localContentValues.put("bindInfo", this.field_bindInfo.toByteArray());
            if (this.fUG) {
              localContentValues.put("brandId", this.field_brandId);
            }
            if (this.fUW) {
              localContentValues.put("brandFlag", Integer.valueOf(this.field_brandFlag));
            }
            if (this.fUd) {
              localContentValues.put("signature", this.field_signature);
            }
            if (this.fUX) {
              localContentValues.put("AppOpt", Integer.valueOf(this.field_AppOpt));
            }
            if (this.fUY) {
              localContentValues.put("syncAttrVersion", this.field_syncAttrVersion);
            }
            if (this.fUZ) {
              localContentValues.put("lastSyncAttrTimeInSecond", Long.valueOf(this.field_lastSyncAttrTimeInSecond));
            }
            if (this.fVa) {
              localContentValues.put("debugEnabled", Boolean.valueOf(this.field_debugEnabled));
            }
            if (this.fVb) {
              localContentValues.put("roundedSquareIcon", this.field_roundedSquareIcon);
            }
            if (this.uQF > 0L) {
              localContentValues.put("rowid", Long.valueOf(this.uQF));
            }
            GMTrace.o(4136590376960L, 30820);
            return localContentValues;
            localIOException1 = localIOException1;
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException1.getMessage());
          }
          localIOException2 = localIOException2;
          w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException2.getMessage());
        }
        catch (IOException localIOException3)
        {
          for (;;)
          {
            w.e("MicroMsg.SDK.BaseAppBrandWxaAppInfo", localIOException3.getMessage());
          }
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */