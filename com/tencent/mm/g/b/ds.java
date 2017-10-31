package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ds
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gyP;
  private static final int gyQ;
  private static final int gyR;
  private static final int gyS;
  private static final int gyT;
  private static final int gyU;
  private static final int gyV;
  private static final int gyW;
  private static final int gyX;
  private static final int gyY;
  private static final int gyZ;
  private static final int gza;
  private static final int gzb;
  private static final int gzc;
  private static final int gzd;
  private static final int gze;
  public int field_card_num;
  public String field_cre_name;
  public int field_cre_type;
  public String field_find_passwd_url;
  public String field_ftf_pay_url;
  public boolean field_isDomesticUser;
  public int field_is_open_touch;
  public int field_is_reg;
  public String field_lct_url;
  public String field_lct_wording;
  public int field_lqt_state;
  public String field_main_card_bind_serialno;
  public String field_reset_passwd_flag;
  public int field_switchConfig;
  public String field_true_name;
  public String field_uin;
  private boolean gyA;
  private boolean gyB;
  private boolean gyC;
  private boolean gyD;
  private boolean gyE;
  private boolean gyF;
  private boolean gyG;
  private boolean gyH;
  private boolean gyI;
  private boolean gyJ;
  private boolean gyK;
  private boolean gyL;
  private boolean gyM;
  private boolean gyN;
  private boolean gyO;
  private boolean gyz;
  
  static
  {
    GMTrace.i(4176050388992L, 31114);
    fSf = new String[0];
    gyP = "uin".hashCode();
    gyQ = "is_reg".hashCode();
    gyR = "true_name".hashCode();
    gyS = "card_num".hashCode();
    gyT = "isDomesticUser".hashCode();
    gyU = "cre_type".hashCode();
    gyV = "main_card_bind_serialno".hashCode();
    gyW = "ftf_pay_url".hashCode();
    gyX = "switchConfig".hashCode();
    gyY = "reset_passwd_flag".hashCode();
    gyZ = "find_passwd_url".hashCode();
    gza = "is_open_touch".hashCode();
    gzb = "lct_wording".hashCode();
    gzc = "lct_url".hashCode();
    gzd = "cre_name".hashCode();
    gze = "lqt_state".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4176050388992L, 31114);
  }
  
  public ds()
  {
    GMTrace.i(4175647735808L, 31111);
    this.gyz = true;
    this.gyA = true;
    this.gyB = true;
    this.gyC = true;
    this.gyD = true;
    this.gyE = true;
    this.gyF = true;
    this.gyG = true;
    this.gyH = true;
    this.gyI = true;
    this.gyJ = true;
    this.gyK = true;
    this.gyL = true;
    this.gyM = true;
    this.gyN = true;
    this.gyO = true;
    GMTrace.o(4175647735808L, 31111);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4175781953536L, 31112);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4175781953536L, 31112);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gyP == k)
      {
        this.field_uin = paramCursor.getString(i);
        this.gyz = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gyQ == k)
        {
          this.field_is_reg = paramCursor.getInt(i);
        }
        else if (gyR == k)
        {
          this.field_true_name = paramCursor.getString(i);
        }
        else if (gyS == k)
        {
          this.field_card_num = paramCursor.getInt(i);
        }
        else
        {
          if (gyT == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_isDomesticUser = bool;
              break;
            }
          }
          if (gyU == k) {
            this.field_cre_type = paramCursor.getInt(i);
          } else if (gyV == k) {
            this.field_main_card_bind_serialno = paramCursor.getString(i);
          } else if (gyW == k) {
            this.field_ftf_pay_url = paramCursor.getString(i);
          } else if (gyX == k) {
            this.field_switchConfig = paramCursor.getInt(i);
          } else if (gyY == k) {
            this.field_reset_passwd_flag = paramCursor.getString(i);
          } else if (gyZ == k) {
            this.field_find_passwd_url = paramCursor.getString(i);
          } else if (gza == k) {
            this.field_is_open_touch = paramCursor.getInt(i);
          } else if (gzb == k) {
            this.field_lct_wording = paramCursor.getString(i);
          } else if (gzc == k) {
            this.field_lct_url = paramCursor.getString(i);
          } else if (gzd == k) {
            this.field_cre_name = paramCursor.getString(i);
          } else if (gze == k) {
            this.field_lqt_state = paramCursor.getInt(i);
          } else if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4175781953536L, 31112);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4175916171264L, 31113);
    ContentValues localContentValues = new ContentValues();
    if (this.gyz) {
      localContentValues.put("uin", this.field_uin);
    }
    if (this.gyA) {
      localContentValues.put("is_reg", Integer.valueOf(this.field_is_reg));
    }
    if (this.gyB) {
      localContentValues.put("true_name", this.field_true_name);
    }
    if (this.gyC) {
      localContentValues.put("card_num", Integer.valueOf(this.field_card_num));
    }
    if (this.gyD) {
      localContentValues.put("isDomesticUser", Boolean.valueOf(this.field_isDomesticUser));
    }
    if (this.gyE) {
      localContentValues.put("cre_type", Integer.valueOf(this.field_cre_type));
    }
    if (this.gyF) {
      localContentValues.put("main_card_bind_serialno", this.field_main_card_bind_serialno);
    }
    if (this.gyG) {
      localContentValues.put("ftf_pay_url", this.field_ftf_pay_url);
    }
    if (this.gyH) {
      localContentValues.put("switchConfig", Integer.valueOf(this.field_switchConfig));
    }
    if (this.gyI) {
      localContentValues.put("reset_passwd_flag", this.field_reset_passwd_flag);
    }
    if (this.gyJ) {
      localContentValues.put("find_passwd_url", this.field_find_passwd_url);
    }
    if (this.gyK) {
      localContentValues.put("is_open_touch", Integer.valueOf(this.field_is_open_touch));
    }
    if (this.gyL) {
      localContentValues.put("lct_wording", this.field_lct_wording);
    }
    if (this.gyM) {
      localContentValues.put("lct_url", this.field_lct_url);
    }
    if (this.gyN) {
      localContentValues.put("cre_name", this.field_cre_name);
    }
    if (this.gyO) {
      localContentValues.put("lqt_state", Integer.valueOf(this.field_lqt_state));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4175916171264L, 31113);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */