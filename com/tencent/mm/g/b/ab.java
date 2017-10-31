package com.tencent.mm.g.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c;

public abstract class ab
  extends c
{
  public static final String[] fSf;
  private static final int fSo;
  private static final int fWY;
  private static final int fWZ;
  private static final int fZO;
  private static final int fZP;
  private static final int fZQ;
  private static final int fZR;
  private static final int fZS;
  private static final int fZT;
  private static final int fZU;
  private static final int fZV;
  private static final int fZW;
  private static final int fZX;
  private static final int fZY;
  private static final int fZZ;
  private static final int gaa;
  private static final int gab;
  private static final int gac;
  private static final int gad;
  private static final int gae;
  private static final int gaf;
  private static final int gag;
  private boolean fWU;
  private boolean fWV;
  private boolean fZA;
  private boolean fZB;
  private boolean fZC;
  private boolean fZD;
  private boolean fZE;
  private boolean fZF;
  private boolean fZG;
  private boolean fZH;
  private boolean fZI;
  private boolean fZJ;
  private boolean fZK;
  private boolean fZL;
  private boolean fZM;
  private boolean fZN;
  private boolean fZv;
  private boolean fZw;
  private boolean fZx;
  private boolean fZy;
  private boolean fZz;
  public String field_accept_buttons;
  public boolean field_all_unavailable;
  public byte[] field_buttonData;
  public String field_card_id;
  public String field_card_tp_id;
  public int field_card_type;
  public String field_consumed_box_id;
  public String field_description;
  public String field_jump_buttons;
  public int field_jump_type;
  public String field_logo_color;
  public String field_logo_url;
  public String field_msg_id;
  public int field_msg_type;
  public byte[] field_operData;
  public int field_read_state;
  public int field_report_scene;
  public int field_time;
  public String field_title;
  public String field_unavailable_qr_code_list;
  public String field_url;
  
  static
  {
    GMTrace.i(4135113981952L, 30809);
    fSf = new String[0];
    fZO = "card_type".hashCode();
    fWY = "title".hashCode();
    fWZ = "description".hashCode();
    fZP = "logo_url".hashCode();
    fZQ = "time".hashCode();
    fZR = "card_id".hashCode();
    fZS = "card_tp_id".hashCode();
    fZT = "msg_id".hashCode();
    fZU = "msg_type".hashCode();
    fZV = "jump_type".hashCode();
    fZW = "url".hashCode();
    fZX = "buttonData".hashCode();
    fZY = "operData".hashCode();
    fZZ = "report_scene".hashCode();
    gaa = "read_state".hashCode();
    gab = "accept_buttons".hashCode();
    gac = "consumed_box_id".hashCode();
    gad = "jump_buttons".hashCode();
    gae = "logo_color".hashCode();
    gaf = "unavailable_qr_code_list".hashCode();
    gag = "all_unavailable".hashCode();
    fSo = "rowid".hashCode();
    GMTrace.o(4135113981952L, 30809);
  }
  
  public ab()
  {
    GMTrace.i(4134711328768L, 30806);
    this.fZv = true;
    this.fWU = true;
    this.fWV = true;
    this.fZw = true;
    this.fZx = true;
    this.fZy = true;
    this.fZz = true;
    this.fZA = true;
    this.fZB = true;
    this.fZC = true;
    this.fZD = true;
    this.fZE = true;
    this.fZF = true;
    this.fZG = true;
    this.fZH = true;
    this.fZI = true;
    this.fZJ = true;
    this.fZK = true;
    this.fZL = true;
    this.fZM = true;
    this.fZN = true;
    GMTrace.o(4134711328768L, 30806);
  }
  
  public final void b(Cursor paramCursor)
  {
    GMTrace.i(4134845546496L, 30807);
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
    {
      GMTrace.o(4134845546496L, 30807);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      int k = arrayOfString[i].hashCode();
      if (fZO == k) {
        this.field_card_type = paramCursor.getInt(i);
      }
      for (;;)
      {
        i += 1;
        break;
        if (fWY == k)
        {
          this.field_title = paramCursor.getString(i);
        }
        else if (fWZ == k)
        {
          this.field_description = paramCursor.getString(i);
        }
        else if (fZP == k)
        {
          this.field_logo_url = paramCursor.getString(i);
        }
        else if (fZQ == k)
        {
          this.field_time = paramCursor.getInt(i);
        }
        else if (fZR == k)
        {
          this.field_card_id = paramCursor.getString(i);
        }
        else if (fZS == k)
        {
          this.field_card_tp_id = paramCursor.getString(i);
        }
        else if (fZT == k)
        {
          this.field_msg_id = paramCursor.getString(i);
          this.fZA = true;
        }
        else if (fZU == k)
        {
          this.field_msg_type = paramCursor.getInt(i);
        }
        else if (fZV == k)
        {
          this.field_jump_type = paramCursor.getInt(i);
        }
        else if (fZW == k)
        {
          this.field_url = paramCursor.getString(i);
        }
        else if (fZX == k)
        {
          this.field_buttonData = paramCursor.getBlob(i);
        }
        else if (fZY == k)
        {
          this.field_operData = paramCursor.getBlob(i);
        }
        else if (fZZ == k)
        {
          this.field_report_scene = paramCursor.getInt(i);
        }
        else if (gaa == k)
        {
          this.field_read_state = paramCursor.getInt(i);
        }
        else if (gab == k)
        {
          this.field_accept_buttons = paramCursor.getString(i);
        }
        else if (gac == k)
        {
          this.field_consumed_box_id = paramCursor.getString(i);
        }
        else if (gad == k)
        {
          this.field_jump_buttons = paramCursor.getString(i);
        }
        else if (gae == k)
        {
          this.field_logo_color = paramCursor.getString(i);
        }
        else if (gaf == k)
        {
          this.field_unavailable_qr_code_list = paramCursor.getString(i);
        }
        else
        {
          if (gag == k)
          {
            if (paramCursor.getInt(i) != 0) {}
            for (boolean bool = true;; bool = false)
            {
              this.field_all_unavailable = bool;
              break;
            }
          }
          if (fSo == k) {
            this.uQF = paramCursor.getLong(i);
          }
        }
      }
    }
    GMTrace.o(4134845546496L, 30807);
  }
  
  public final ContentValues qQ()
  {
    GMTrace.i(4134979764224L, 30808);
    ContentValues localContentValues = new ContentValues();
    if (this.fZv) {
      localContentValues.put("card_type", Integer.valueOf(this.field_card_type));
    }
    if (this.fWU) {
      localContentValues.put("title", this.field_title);
    }
    if (this.fWV) {
      localContentValues.put("description", this.field_description);
    }
    if (this.fZw) {
      localContentValues.put("logo_url", this.field_logo_url);
    }
    if (this.fZx) {
      localContentValues.put("time", Integer.valueOf(this.field_time));
    }
    if (this.fZy) {
      localContentValues.put("card_id", this.field_card_id);
    }
    if (this.fZz) {
      localContentValues.put("card_tp_id", this.field_card_tp_id);
    }
    if (this.fZA) {
      localContentValues.put("msg_id", this.field_msg_id);
    }
    if (this.fZB) {
      localContentValues.put("msg_type", Integer.valueOf(this.field_msg_type));
    }
    if (this.fZC) {
      localContentValues.put("jump_type", Integer.valueOf(this.field_jump_type));
    }
    if (this.fZD) {
      localContentValues.put("url", this.field_url);
    }
    if (this.fZE) {
      localContentValues.put("buttonData", this.field_buttonData);
    }
    if (this.fZF) {
      localContentValues.put("operData", this.field_operData);
    }
    if (this.fZG) {
      localContentValues.put("report_scene", Integer.valueOf(this.field_report_scene));
    }
    if (this.fZH) {
      localContentValues.put("read_state", Integer.valueOf(this.field_read_state));
    }
    if (this.fZI) {
      localContentValues.put("accept_buttons", this.field_accept_buttons);
    }
    if (this.fZJ) {
      localContentValues.put("consumed_box_id", this.field_consumed_box_id);
    }
    if (this.fZK) {
      localContentValues.put("jump_buttons", this.field_jump_buttons);
    }
    if (this.fZL) {
      localContentValues.put("logo_color", this.field_logo_color);
    }
    if (this.fZM) {
      localContentValues.put("unavailable_qr_code_list", this.field_unavailable_qr_code_list);
    }
    if (this.fZN) {
      localContentValues.put("all_unavailable", Boolean.valueOf(this.field_all_unavailable));
    }
    if (this.uQF > 0L) {
      localContentValues.put("rowid", Long.valueOf(this.uQF));
    }
    GMTrace.o(4134979764224L, 30808);
    return localContentValues;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/g/b/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */