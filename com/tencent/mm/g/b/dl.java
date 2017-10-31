package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class dl
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int gft;
  private static final int goJ;
  private static final int gwX;
  private static final int gwY;
  private static final int gwZ;
  private static final int gxA;
  private static final int gxB;
  private static final int gxC;
  private static final int gxD;
  private static final int gxE;
  private static final int gxa;
  private static final int gxb;
  private static final int gxc;
  private static final int gxd;
  private static final int gxe;
  private static final int gxf;
  private static final int gxg;
  private static final int gxh;
  private static final int gxi;
  private static final int gxj;
  private static final int gxk;
  private static final int gxl;
  private static final int gxm;
  private static final int gxn;
  private static final int gxo;
  private static final int gxp;
  private static final int gxq;
  private static final int gxr;
  private static final int gxs;
  private static final int gxt;
  private static final int gxu;
  private static final int gxv;
  private static final int gxw;
  private static final int gxx;
  private static final int gxy;
  private static final int gxz;
  public String field_arrive_type;
  public String field_avail_save_wording;
  public String field_bankName;
  public String field_bankPhone;
  public int field_bankcardClientType;
  public int field_bankcardState;
  public int field_bankcardTag;
  public String field_bankcardTail;
  public String field_bankcardType;
  public String field_bankcardTypeName;
  public String field_bindSerial;
  public String field_bizUsername;
  public int field_cardType;
  public String field_card_bottom_wording;
  public double field_dayQuotaKind;
  public double field_dayQuotaVirtual;
  public String field_desc;
  public String field_ext_msg;
  public long field_fetchArriveTime;
  public String field_fetchArriveTimeWording;
  public String field_fetch_charge_info;
  public double field_fetch_charge_rate;
  public String field_forbidWord;
  public String field_forbid_title;
  public String field_forbid_url;
  public double field_full_fetch_charge_fee;
  public String field_mobile;
  public String field_no_micro_word;
  public double field_onceQuotaKind;
  public double field_onceQuotaVirtual;
  public String field_repay_url;
  public int field_supportTag;
  public boolean field_support_micropay;
  public String field_tips;
  public String field_trueName;
  public int field_wxcreditState;
  private boolean gfp;
  private boolean goD;
  private boolean gwA;
  private boolean gwB;
  private boolean gwC;
  private boolean gwD;
  private boolean gwE;
  private boolean gwF;
  private boolean gwG;
  private boolean gwH;
  private boolean gwI;
  private boolean gwJ;
  private boolean gwK;
  private boolean gwL;
  private boolean gwM;
  private boolean gwN;
  private boolean gwO;
  private boolean gwP;
  private boolean gwQ;
  private boolean gwR;
  private boolean gwS;
  private boolean gwT;
  private boolean gwU;
  private boolean gwV;
  private boolean gwW;
  private boolean gwp;
  private boolean gwq;
  private boolean gwr;
  private boolean gws;
  private boolean gwt;
  private boolean gwu;
  private boolean gwv;
  private boolean gww;
  private boolean gwx;
  private boolean gwy;
  private boolean gwz;
  
  static
  {
    GMTrace.i(4124779216896L, 30732);
    fSf = new String[0];
    gwX = "bindSerial".hashCode();
    gwY = "cardType".hashCode();
    gwZ = "bankcardState".hashCode();
    gxa = "forbidWord".hashCode();
    gxb = "bankName".hashCode();
    gxc = "bankcardType".hashCode();
    gxd = "bankcardTypeName".hashCode();
    gxe = "bankcardTag".hashCode();
    gxf = "bankcardTail".hashCode();
    gxg = "supportTag".hashCode();
    gxh = "mobile".hashCode();
    gxi = "trueName".hashCode();
    gft = "desc".hashCode();
    gxj = "bankPhone".hashCode();
    gxk = "bizUsername".hashCode();
    gxl = "onceQuotaKind".hashCode();
    gxm = "onceQuotaVirtual".hashCode();
    gxn = "dayQuotaKind".hashCode();
    gxo = "dayQuotaVirtual".hashCode();
    gxp = "fetchArriveTime".hashCode();
    gxq = "fetchArriveTimeWording".hashCode();
    gxr = "repay_url".hashCode();
    gxs = "wxcreditState".hashCode();
    gxt = "bankcardClientType".hashCode();
    gxu = "ext_msg".hashCode();
    gxv = "support_micropay".hashCode();
    gxw = "arrive_type".hashCode();
    gxx = "avail_save_wording".hashCode();
    gxy = "fetch_charge_rate".hashCode();
    gxz = "full_fetch_charge_fee".hashCode();
    gxA = "fetch_charge_info".hashCode();
    goJ = "tips".hashCode();
    gxB = "forbid_title".hashCode();
    gxC = "forbid_url".hashCode();
    gxD = "no_micro_word".hashCode();
    gxE = "card_bottom_wording".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4124779216896L, 30732);
  }
  
  public dl()
  {
    GMTrace.i(4124376563712L, 30729);
    this.gwp = true;
    this.gwq = true;
    this.gwr = true;
    this.gws = true;
    this.gwt = true;
    this.gwu = true;
    this.gwv = true;
    this.gww = true;
    this.gwx = true;
    this.gwy = true;
    this.gwz = true;
    this.gwA = true;
    this.gfp = true;
    this.gwB = true;
    this.gwC = true;
    this.gwD = true;
    this.gwE = true;
    this.gwF = true;
    this.gwG = true;
    this.gwH = true;
    this.gwI = true;
    this.gwJ = true;
    this.gwK = true;
    this.gwL = true;
    this.gwM = true;
    this.gwN = true;
    this.gwO = true;
    this.gwP = true;
    this.gwQ = true;
    this.gwR = true;
    this.gwS = true;
    this.goD = true;
    this.gwT = true;
    this.gwU = true;
    this.gwV = true;
    this.gwW = true;
    GMTrace.o(4124376563712L, 30729);
  }
  
  public void b(Cursor paramCursor)
  {
    GMTrace.i(4124510781440L, 30730);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4124510781440L, 30730);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (gwX == k)
      {
        this.field_bindSerial = paramCursor.getString(i);
        this.gwp = true;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gwY == k)
        {
          this.field_cardType = paramCursor.getInt(i);
        }
        else if (gwZ == k)
        {
          this.field_bankcardState = paramCursor.getInt(i);
        }
        else if (gxa == k)
        {
          this.field_forbidWord = paramCursor.getString(i);
        }
        else if (gxb == k)
        {
          this.field_bankName = paramCursor.getString(i);
        }
        else if (gxc == k)
        {
          this.field_bankcardType = paramCursor.getString(i);
        }
        else if (gxd == k)
        {
          this.field_bankcardTypeName = paramCursor.getString(i);
        }
        else if (gxe == k)
        {
          this.field_bankcardTag = paramCursor.getInt(i);
        }
        else if (gxf == k)
        {
          this.field_bankcardTail = paramCursor.getString(i);
        }
        else if (gxg == k)
        {
          this.field_supportTag = paramCursor.getInt(i);
        }
        else if (gxh == k)
        {
          this.field_mobile = paramCursor.getString(i);
        }
        else if (gxi == k)
        {
          this.field_trueName = paramCursor.getString(i);
        }
        else if (gft == k)
        {
          this.field_desc = paramCursor.getString(i);
        }
        else if (gxj == k)
        {
          this.field_bankPhone = paramCursor.getString(i);
        }
        else if (gxk == k)
        {
          this.field_bizUsername = paramCursor.getString(i);
        }
        else if (gxl == k)
        {
          this.field_onceQuotaKind = paramCursor.getDouble(i);
        }
        else if (gxm == k)
        {
          this.field_onceQuotaVirtual = paramCursor.getDouble(i);
        }
        else if (gxn == k)
        {
          this.field_dayQuotaKind = paramCursor.getDouble(i);
        }
        else if (gxo == k)
        {
          this.field_dayQuotaVirtual = paramCursor.getDouble(i);
        }
        else if (gxp == k)
        {
          this.field_fetchArriveTime = paramCursor.getLong(i);
        }
        else if (gxq == k)
        {
          this.field_fetchArriveTimeWording = paramCursor.getString(i);
        }
        else if (gxr == k)
        {
          this.field_repay_url = paramCursor.getString(i);
        }
        else if (gxs == k)
        {
          this.field_wxcreditState = paramCursor.getInt(i);
        }
        else if (gxt == k)
        {
          this.field_bankcardClientType = paramCursor.getInt(i);
        }
        else if (gxu == k)
        {
          this.field_ext_msg = paramCursor.getString(i);
        }
        else
        {
          if (gxv == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_support_micropay = bool;
              break;
            }
          }
          if (gxw == k) {
            this.field_arrive_type = paramCursor.getString(i);
          } else if (gxx == k) {
            this.field_avail_save_wording = paramCursor.getString(i);
          } else if (gxy == k) {
            this.field_fetch_charge_rate = paramCursor.getDouble(i);
          } else if (gxz == k) {
            this.field_full_fetch_charge_fee = paramCursor.getDouble(i);
          } else if (gxA == k) {
            this.field_fetch_charge_info = paramCursor.getString(i);
          } else if (goJ == k) {
            this.field_tips = paramCursor.getString(i);
          } else if (gxB == k) {
            this.field_forbid_title = paramCursor.getString(i);
          } else if (gxC == k) {
            this.field_forbid_url = paramCursor.getString(i);
          } else if (gxD == k) {
            this.field_no_micro_word = paramCursor.getString(i);
          } else if (gxE == k) {
            this.field_card_bottom_wording = paramCursor.getString(i);
          } else if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4124510781440L, 30730);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4124644999168L, 30731);
    ContentValues localContentValues = new ContentValues();
    if (this.gwp) {
      localContentValues.put("bindSerial", this.field_bindSerial);
    }
    if (this.gwq) {
      localContentValues.put("cardType", Integer.valueOf(this.field_cardType));
    }
    if (this.gwr) {
      localContentValues.put("bankcardState", Integer.valueOf(this.field_bankcardState));
    }
    if (this.gws) {
      localContentValues.put("forbidWord", this.field_forbidWord);
    }
    if (this.gwt) {
      localContentValues.put("bankName", this.field_bankName);
    }
    if (this.gwu) {
      localContentValues.put("bankcardType", this.field_bankcardType);
    }
    if (this.gwv) {
      localContentValues.put("bankcardTypeName", this.field_bankcardTypeName);
    }
    if (this.gww) {
      localContentValues.put("bankcardTag", Integer.valueOf(this.field_bankcardTag));
    }
    if (this.gwx) {
      localContentValues.put("bankcardTail", this.field_bankcardTail);
    }
    if (this.gwy) {
      localContentValues.put("supportTag", Integer.valueOf(this.field_supportTag));
    }
    if (this.gwz) {
      localContentValues.put("mobile", this.field_mobile);
    }
    if (this.gwA) {
      localContentValues.put("trueName", this.field_trueName);
    }
    if (this.gfp) {
      localContentValues.put("desc", this.field_desc);
    }
    if (this.gwB) {
      localContentValues.put("bankPhone", this.field_bankPhone);
    }
    if (this.gwC) {
      localContentValues.put("bizUsername", this.field_bizUsername);
    }
    if (this.gwD) {
      localContentValues.put("onceQuotaKind", Double.valueOf(this.field_onceQuotaKind));
    }
    if (this.gwE) {
      localContentValues.put("onceQuotaVirtual", Double.valueOf(this.field_onceQuotaVirtual));
    }
    if (this.gwF) {
      localContentValues.put("dayQuotaKind", Double.valueOf(this.field_dayQuotaKind));
    }
    if (this.gwG) {
      localContentValues.put("dayQuotaVirtual", Double.valueOf(this.field_dayQuotaVirtual));
    }
    if (this.gwH) {
      localContentValues.put("fetchArriveTime", Long.valueOf(this.field_fetchArriveTime));
    }
    if (this.gwI) {
      localContentValues.put("fetchArriveTimeWording", this.field_fetchArriveTimeWording);
    }
    if (this.gwJ) {
      localContentValues.put("repay_url", this.field_repay_url);
    }
    if (this.gwK) {
      localContentValues.put("wxcreditState", Integer.valueOf(this.field_wxcreditState));
    }
    if (this.gwL) {
      localContentValues.put("bankcardClientType", Integer.valueOf(this.field_bankcardClientType));
    }
    if (this.gwM) {
      localContentValues.put("ext_msg", this.field_ext_msg);
    }
    if (this.gwN) {
      localContentValues.put("support_micropay", Boolean.valueOf(this.field_support_micropay));
    }
    if (this.gwO) {
      localContentValues.put("arrive_type", this.field_arrive_type);
    }
    if (this.gwP) {
      localContentValues.put("avail_save_wording", this.field_avail_save_wording);
    }
    if (this.gwQ) {
      localContentValues.put("fetch_charge_rate", Double.valueOf(this.field_fetch_charge_rate));
    }
    if (this.gwR) {
      localContentValues.put("full_fetch_charge_fee", Double.valueOf(this.field_full_fetch_charge_fee));
    }
    if (this.gwS) {
      localContentValues.put("fetch_charge_info", this.field_fetch_charge_info);
    }
    if (this.goD) {
      localContentValues.put("tips", this.field_tips);
    }
    if (this.gwT) {
      localContentValues.put("forbid_title", this.field_forbid_title);
    }
    if (this.gwU) {
      localContentValues.put("forbid_url", this.field_forbid_url);
    }
    if (this.gwV) {
      localContentValues.put("no_micro_word", this.field_no_micro_word);
    }
    if (this.gwW) {
      localContentValues.put("card_bottom_wording", this.field_card_bottom_wording);
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4124644999168L, 30731);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */