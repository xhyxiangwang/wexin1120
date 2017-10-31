package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bk;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class q
  extends bk
{
  protected static c.a gLR;
  public String iTg;
  public String lbT;
  public String mAA;
  public int mAB;
  public long mAC;
  public long mAD;
  public int mAE;
  public a mAF;
  public String mAG;
  public String mAH;
  public String mAI;
  public String mAJ;
  public String mAK;
  public String mAL;
  public String mAM;
  public String mAN;
  public String mAO;
  public String mAP;
  public String mAQ;
  public String mAR;
  public f mAS;
  public e mAT;
  public g mAU;
  public i mAV;
  public int mAW;
  public int mAX;
  public String mAY;
  public int mAZ;
  private boolean mAf;
  public String mAg;
  public String mAh;
  public String mAi;
  public String mAj;
  public String mAk;
  public int mAl;
  public String mAm;
  public String mAn;
  public LinkedList<h> mAo;
  public boolean mAp;
  public c mAq;
  public boolean mAr;
  public b mAs;
  public HashMap<String, d> mAt;
  public String mAu;
  public int mAv;
  public int mAw;
  public int mAx;
  public String mAy;
  public String mAz;
  public String mBa;
  public boolean mBb;
  
  static
  {
    GMTrace.i(12610829287424L, 93958);
    c.a locala = new c.a();
    locala.hRR = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.uQH.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.uQG = "msgId";
    locala.columns[1] = "mergerId";
    locala.uQH.put("mergerId", "TEXT");
    localStringBuilder.append(" mergerId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "gameMsgId";
    locala.uQH.put("gameMsgId", "TEXT");
    localStringBuilder.append(" gameMsgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "msgType";
    locala.uQH.put("msgType", "INTEGER");
    localStringBuilder.append(" msgType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "createTime";
    locala.uQH.put("createTime", "LONG default '0' ");
    localStringBuilder.append(" createTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "expireTime";
    locala.uQH.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "appId";
    locala.uQH.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "showInMsgList";
    locala.uQH.put("showInMsgList", "INTEGER default 'true' ");
    localStringBuilder.append(" showInMsgList INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "isRead";
    locala.uQH.put("isRead", "INTEGER default 'false' ");
    localStringBuilder.append(" isRead INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "label";
    locala.uQH.put("label", "TEXT default '' ");
    localStringBuilder.append(" label TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "isHidden";
    locala.uQH.put("isHidden", "INTEGER default 'false' ");
    localStringBuilder.append(" isHidden INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "weight";
    locala.uQH.put("weight", "TEXT default '' ");
    localStringBuilder.append(" weight TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "rawXML";
    locala.uQH.put("rawXML", "TEXT default '' ");
    localStringBuilder.append(" rawXML TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "receiveTime";
    locala.uQH.put("receiveTime", "LONG default '0' ");
    localStringBuilder.append(" receiveTime LONG default '0' ");
    locala.columns[14] = "rowid";
    locala.uQI = localStringBuilder.toString();
    gLR = locala;
    GMTrace.o(12610829287424L, 93958);
  }
  
  public q()
  {
    GMTrace.i(12610426634240L, 93955);
    this.mAf = false;
    this.lbT = "";
    this.mAg = "";
    this.mAh = "";
    this.iTg = "";
    this.mAi = "";
    this.mAj = "";
    this.mAk = "";
    this.mAl = 0;
    this.mAm = "";
    this.mAn = "";
    this.mAo = new LinkedList();
    this.mAq = new c();
    this.mAs = new b();
    this.mAt = new HashMap();
    this.mAu = "";
    this.mAv = 0;
    this.mAw = 0;
    this.mAx = 0;
    this.mAy = "";
    this.mAz = "";
    this.mAA = "";
    this.mAB = 0;
    this.mAC = 0L;
    this.mAD = 0L;
    this.mAE = 0;
    this.mAF = new a();
    this.mAG = "";
    this.mAH = "";
    this.mAI = "";
    this.mAJ = "";
    this.mAK = "";
    this.mAL = "";
    this.mAM = "";
    this.mAT = new e();
    this.mAU = new g();
    this.mAV = new i();
    this.mAZ = 0;
    this.mBa = "";
    this.mBb = false;
    GMTrace.o(12610426634240L, 93955);
  }
  
  public final void aEq()
  {
    GMTrace.i(12610560851968L, 93956);
    if (this.mAf)
    {
      GMTrace.o(12610560851968L, 93956);
      return;
    }
    if (this.field_msgType == 100)
    {
      x.aEC();
      if (this == null) {
        w.e("MicroMsg.GameNewMessageParser", "msg is null");
      }
    }
    for (;;)
    {
      label52:
      this.mAf = true;
      GMTrace.o(12610560851968L, 93956);
      return;
      if (bg.mZ(this.field_rawXML))
      {
        w.e("MicroMsg.GameNewMessageParser", "msg content is null");
      }
      else
      {
        Map localMap = bh.p(this.field_rawXML, "sysmsg");
        if ((localMap == null) || (localMap.size() == 0))
        {
          w.e("MicroMsg.GameNewMessageParser", "Parse failed");
        }
        else if (!"gamecenter".equalsIgnoreCase((String)localMap.get(".sysmsg.$type")))
        {
          w.e("MicroMsg.GameNewMessageParser", "Type not matched");
        }
        else
        {
          this.mAN = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.$jump_id"), "");
          this.mAO = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.user_action_title"), "");
          this.mAP = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.first_line_content"), "");
          this.mAT.mBh = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.second_line.second_line_content"), "");
          this.mAT.mBd = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.second_line.second_line_icon_url"), "");
          this.mAT.mBe = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.second_line.$jump_id"), "");
          this.mAQ = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.content_pic"), "");
          this.mAR = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.content_pic.$jump_id"), "");
          if (localMap.get(".sysmsg.gamecenter.msg_center.msg_sender") != null)
          {
            this.mAS = new f();
            this.mAS.mBi = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.msg_sender.sender_name"), "");
            this.mAS.mBj = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.msg_sender.sender_icon"), "");
            this.mAS.mBk = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.msg_sender.badge_icon"), "");
            this.mAS.mBe = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.msg_sender.$jump_id"), "");
          }
          this.mAo.clear();
          int i = 0;
          if (i == 0) {}
          for (Object localObject = ".sysmsg.gamecenter.msg_center.userinfo";; localObject = ".sysmsg.gamecenter.msg_center.userinfo" + i)
          {
            if (!localMap.containsKey(localObject)) {
              break label749;
            }
            h localh = new h();
            localh.userName = bg.ap((String)localMap.get((String)localObject + ".username"), "");
            localh.aDw = bg.ap((String)localMap.get((String)localObject + ".nickname"), "");
            localh.mBm = bg.ap((String)localMap.get((String)localObject + ".usericon"), "");
            localh.mBo = bg.ap((String)localMap.get((String)localObject + ".badge_icon"), "");
            localh.mBp = bg.ap((String)localMap.get((String)localObject + ".$jump_id"), "");
            this.mAo.add(localh);
            i += 1;
            break;
          }
          label749:
          this.mAU.mName = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.source_info.source_name"), "");
          localObject = this.mAU;
          if (bg.getInt((String)localMap.get(".sysmsg.gamecenter.msg_center.source_info.source_clickable"), 0) > 0) {}
          for (boolean bool = true;; bool = false)
          {
            ((g)localObject).mBl = bool;
            this.mAU.mBe = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_center.source_info.$jump_id"), "");
            x.c(localMap, this);
            x.d(localMap, this);
            this.mAs.mBd = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url"), "");
            this.mAs.gEe = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc"), "");
            this.mAs.mBe = bg.ap((String)localMap.get(".sysmsg.gamecenter.msg_bubble_info.$jump_id"), "");
            x.e(localMap, this);
            this.mAq.mBf = bg.getInt((String)localMap.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), 0);
            this.mAq.mBd = bg.ap((String)localMap.get(".sysmsg.gamecenter.entrance.entrance_icon_url"), "");
            this.mAq.jzo = bg.ap((String)localMap.get(".sysmsg.gamecenter.entrance.entrance_text"), "");
            this.mAV.mBq = bg.ap((String)localMap.get(".sysmsg.gamecenter.display_with_wepkg.$pkg_id"), "");
            this.mAV.ksf = bg.getInt((String)localMap.get(".sysmsg.gamecenter.display_with_wepkg"), 0);
            this.mAV.mBr = bg.getLong((String)localMap.get(".sysmsg.gamecenter.display_with_wepkg.$always_display_after_time"), 0L);
            this.mAB = bg.getInt((String)localMap.get(".sysmsg.gamecenter.wifi_flag"), 0);
            break;
          }
          if (this == null)
          {
            w.e("MicroMsg.GameMessageParser", "msg is null");
          }
          else if (bg.mZ(this.field_rawXML))
          {
            w.e("MicroMsg.GameMessageParser", "msg content is null");
          }
          else
          {
            localObject = bh.p(this.field_rawXML, "sysmsg");
            if ((localObject == null) || (((Map)localObject).size() == 0))
            {
              w.e("MicroMsg.GameMessageParser", "Parse failed");
            }
            else if (!"gamecenter".equalsIgnoreCase((String)((Map)localObject).get(".sysmsg.$type")))
            {
              w.e("MicroMsg.GameMessageParser", "Type not matched");
            }
            else
            {
              this.mAB = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.wifi_flag"), 0);
              this.lbT = s.s((Map)localObject);
              this.mAg = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.url"), "");
              this.mAu = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.msg_picture_url"), "");
              this.mAh = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.message_bubble_info.message_bubble_url"), "");
              if (bg.mZ(this.mAh)) {
                this.mAh = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.url"), "");
              }
              this.mAW = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.notify_type"), 0);
              this.iTg = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.appname2"), "");
              if (bg.mZ(this.iTg)) {
                this.iTg = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.appname"), "");
              }
              if (this.field_msgType == 6)
              {
                this.mAm = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.groupname"), "");
                this.mAn = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.groupurl"), "");
              }
              for (;;)
              {
                this.mAi = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.iconurl"), "");
                this.mAj = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.android_downloadurl"), "");
                this.mAk = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.android_apk_md5"), "");
                this.mAl = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.android_apk_size"), 0);
                s.a((Map)localObject, this);
                this.mAY = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.noticeid"), "");
                this.mAC = s.t((Map)localObject);
                this.mAq.mBf = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.badge_display_type"), 0);
                this.mAq.mBd = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.showiconurl"), "");
                this.mAq.jzo = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.entrancetext"), "");
                s.b((Map)localObject, this);
                this.mAv = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.message_bubble_info.message_bubble_action"), 0);
                this.mAs.mBd = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.message_bubble_info.message_bubble_icon_url"), "");
                this.mAs.gEe = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.message_bubble_info.message_bubble_desc"), "");
                this.mAZ = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.message_card.message_card_jump_type"), 0);
                this.mBa = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.message_card.message_card_jump_url"), "");
                switch (this.field_msgType)
                {
                case 4: 
                case 10: 
                case 11: 
                case 3: 
                case 7: 
                case 8: 
                case 9: 
                default: 
                  w.e("MicroMsg.GameMessageParser", "error gamecenter type: " + this.field_msgType);
                  break label52;
                  this.mAm = this.iTg;
                }
              }
              this.mAw = bg.getInt((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.share_msg_type"), 1);
              this.mAx = bg.getInt((String)((Map)localObject).get(".sysmsg.game_control_info.display_name_type"), 1);
              this.mAy = bg.ap((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.share_msg_title"), "");
              this.mAz = bg.ap((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.share_msg_content"), "");
              this.mAA = bg.ap((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.media_url"), "");
              this.mAu = bg.ap((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.thumb_url"), "");
              w.i("MicroMsg.GameMessageParser", "Received a ShareMsg: %s", new Object[] { this.field_appId });
              continue;
              this.mAK = bg.ap((String)((Map)localObject).get(".sysmsg.gamepraise.praise_message_info.praise_content"), "");
              this.mAL = bg.ap((String)((Map)localObject).get(".sysmsg.gamepraise.praise_message_info.praise_jumpurl"), "");
              this.mAM = bg.ap((String)((Map)localObject).get(".sysmsg.gamepraise.praise_message_info.praise_iconurl"), "");
              continue;
              this.mAG = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.topic.reply_content"), "");
              this.mAH = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.topic.replied_content"), "");
              this.mAJ = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.topic.topic_title"), "");
              this.mAI = bg.ap((String)((Map)localObject).get(".sysmsg.gamecenter.topic.topic_url"), "");
            }
          }
        }
      }
    }
  }
  
  protected final c.a uC()
  {
    GMTrace.i(12610695069696L, 93957);
    c.a locala = gLR;
    GMTrace.o(12610695069696L, 93957);
    return locala;
  }
  
  public static final class a
  {
    public boolean mAa;
    public boolean mBc;
    public int orientation;
    public String url;
    
    public a()
    {
      GMTrace.i(15198949736448L, 113241);
      GMTrace.o(15198949736448L, 113241);
    }
  }
  
  public static final class b
  {
    public String gEe;
    public String mBd;
    public String mBe;
    
    public b()
    {
      GMTrace.i(12592441458688L, 93821);
      GMTrace.o(12592441458688L, 93821);
    }
  }
  
  public static final class c
  {
    public String jzo;
    public String mBd;
    public int mBf;
    
    public c()
    {
      GMTrace.i(12613379424256L, 93977);
      GMTrace.o(12613379424256L, 93977);
    }
  }
  
  public static final class d
  {
    public String lve;
    public int mBg;
    
    public d()
    {
      GMTrace.i(12596333772800L, 93850);
      GMTrace.o(12596333772800L, 93850);
    }
  }
  
  public static final class e
  {
    public String mBd;
    public String mBe;
    public String mBh;
    
    public e()
    {
      GMTrace.i(12588414926848L, 93791);
      GMTrace.o(12588414926848L, 93791);
    }
  }
  
  public static final class f
  {
    public String mBe;
    public String mBi;
    public String mBj;
    public String mBk;
    
    public f()
    {
      GMTrace.i(12594857377792L, 93839);
      GMTrace.o(12594857377792L, 93839);
    }
  }
  
  public static final class g
  {
    public String mBe;
    public boolean mBl;
    public String mName;
    
    public g()
    {
      GMTrace.i(12607876497408L, 93936);
      GMTrace.o(12607876497408L, 93936);
    }
  }
  
  public static final class h
  {
    public String aDw;
    public String mBm;
    public String mBn;
    public String mBo;
    public String mBp;
    public String userName;
    
    public h()
    {
      GMTrace.i(12619419222016L, 94022);
      GMTrace.o(12619419222016L, 94022);
    }
  }
  
  public static final class i
  {
    public int ksf;
    public String mBq;
    public long mBr;
    
    public i()
    {
      GMTrace.i(15199218171904L, 113243);
      this.ksf = 0;
      this.mBr = 0L;
      GMTrace.o(15199218171904L, 113243);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */