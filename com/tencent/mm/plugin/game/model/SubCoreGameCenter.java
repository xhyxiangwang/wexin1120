package com.tencent.mm.plugin.game.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.gl;
import com.tencent.mm.g.a.gm;
import com.tencent.mm.g.a.gm.a;
import com.tencent.mm.g.a.gn;
import com.tencent.mm.g.a.go;
import com.tencent.mm.g.a.hb;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.g.a.hd;
import com.tencent.mm.g.a.kv;
import com.tencent.mm.g.a.li;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.g.a.mt;
import com.tencent.mm.g.a.pz;
import com.tencent.mm.g.a.qj;
import com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.plugin.game.c.ak;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.pluginsdk.l.k;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class SubCoreGameCenter
  implements am
{
  private static String mCj;
  @SuppressLint({"UseSparseArrays"})
  static HashMap<Integer, g.d> mCk;
  private com.tencent.mm.sdk.b.c iHr;
  private com.tencent.mm.sdk.b.c kCk;
  private bp.a loP;
  private com.tencent.mm.sdk.b.c mCA;
  private u mCd;
  private t mCe;
  private b mCf;
  private ah mCg;
  private w mCh;
  private z mCi;
  private com.tencent.mm.sdk.b.c mCl;
  private com.tencent.mm.sdk.b.c mCm;
  private com.tencent.mm.sdk.b.c mCn;
  private com.tencent.mm.sdk.b.c mCo;
  private com.tencent.mm.sdk.b.c mCp;
  private com.tencent.mm.sdk.b.c mCq;
  private com.tencent.mm.sdk.b.c mCr;
  private com.tencent.mm.sdk.b.c mCs;
  com.tencent.mm.pluginsdk.e.d mCt;
  private com.tencent.mm.sdk.b.c mCu;
  private com.tencent.mm.sdk.b.c mCv;
  private com.tencent.mm.sdk.b.c mCw;
  private com.tencent.mm.sdk.b.c mCx;
  private com.tencent.mm.sdk.b.c mCy;
  private com.tencent.mm.sdk.b.c mCz;
  
  static
  {
    GMTrace.i(12587475402752L, 93784);
    mCj = "";
    HashMap localHashMap = new HashMap();
    mCk = localHashMap;
    localHashMap.put(Integer.valueOf("GAME_CENTER_MSG_INFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(12607608061952L, 93934);
        String[] arrayOfString = u.gMz;
        GMTrace.o(12607608061952L, 93934);
        return arrayOfString;
      }
    });
    mCk.put(Integer.valueOf("GAME_CENTER_JSON_CACHE_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(12624787931136L, 94062);
        String[] arrayOfString = o.gMz;
        GMTrace.o(12624787931136L, 94062);
        return arrayOfString;
      }
    });
    mCk.put(Integer.valueOf("GAME_CENTER_PB_CACHE_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(12585059483648L, 93766);
        String[] arrayOfString = z.gMz;
        GMTrace.o(12585059483648L, 93766);
        return arrayOfString;
      }
    });
    GMTrace.o(12587475402752L, 93784);
  }
  
  public SubCoreGameCenter()
  {
    GMTrace.i(12585462136832L, 93769);
    this.loP = new bp.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(12624385277952L, 94059);
        Object localObject2 = SubCoreGameCenter.aFf();
        paramAnonymousa = paramAnonymousa.hme;
        Object localObject1 = com.tencent.mm.platformtools.n.a(paramAnonymousa.tvq);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameMessageService", "Received a message: %d", new Object[] { Long.valueOf(paramAnonymousa.tvv) });
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameMessageService", "Message content: %s" + (String)localObject1);
        new Thread(new t.1((t)localObject2, (String)localObject1)).start();
        if (bg.mZ((String)localObject1))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageParser", "msg content is null");
          paramAnonymousa = null;
        }
        for (;;)
        {
          if (paramAnonymousa != null)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameMessageService", "type = %d, appId = %s, msgId = %s", new Object[] { Integer.valueOf(paramAnonymousa.field_msgType), paramAnonymousa.field_appId, Long.valueOf(paramAnonymousa.field_msgId) });
            if (paramAnonymousa != null) {
              break label1460;
            }
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageService", "msg is null");
            i = 0;
            if (i != 0)
            {
              if (paramAnonymousa.field_msgType == 20)
              {
                localObject1 = SubCoreGameCenter.aFe().zc(paramAnonymousa.field_appId);
                if (localObject1 != null)
                {
                  SubCoreGameCenter.aFe().a((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameMessageService", "duplicated appId, type = %d, appId = %s, msgId = %s", new Object[] { Integer.valueOf(((q)localObject1).field_msgType), ((q)localObject1).field_appId, Long.valueOf(((q)localObject1).field_msgId) });
                }
              }
              t.e(paramAnonymousa);
              bool = SubCoreGameCenter.aFe().b(paramAnonymousa);
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameMessageService", "Insert raw message: %b", new Object[] { Boolean.valueOf(bool) });
              if (bool)
              {
                i = paramAnonymousa.field_msgType;
                if (paramAnonymousa.field_msgType == 100) {
                  i = paramAnonymousa.mAX;
                }
                ai.a(ab.getContext(), 0, 0, 0, 18, 0, paramAnonymousa.field_appId, 0, i, paramAnonymousa.field_gameMsgId, paramAnonymousa.mAY, ai.co("resource", String.valueOf(paramAnonymousa.mAq.mBf)));
                if (paramAnonymousa.field_msgType == 20) {
                  d.a(paramAnonymousa);
                }
              }
            }
          }
          GMTrace.o(12624385277952L, 94059);
          return;
          localObject2 = bh.p((String)localObject1, "sysmsg");
          if ((localObject2 == null) || (((Map)localObject2).size() == 0))
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageParser", "Parse failed");
            paramAnonymousa = null;
          }
          else
          {
            if ("gamecenter".equalsIgnoreCase((String)((Map)localObject2).get(".sysmsg.$type"))) {
              break;
            }
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageParser", "Type not matched");
            paramAnonymousa = null;
          }
        }
        paramAnonymousa = new q();
        paramAnonymousa.field_showInMsgList = true;
        paramAnonymousa.field_msgId = System.currentTimeMillis();
        paramAnonymousa.field_rawXML = ((String)localObject1);
        paramAnonymousa.field_msgType = bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$newmsgtype"), 0);
        if (paramAnonymousa.field_msgType == 100)
        {
          x.aEC();
          paramAnonymousa.field_gameMsgId = bg.ap((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_id"), "");
          paramAnonymousa.field_appId = ((String)((Map)localObject2).get(".sysmsg.gamecenter.appid"));
          paramAnonymousa.field_createTime = bg.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.create_time"), System.currentTimeMillis() / 1000L);
          l = bg.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.expire_time"), 0L);
          if (l == 0L)
          {
            paramAnonymousa.field_expireTime = Long.MAX_VALUE;
            label591:
            if (bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.wifi_flag"), 0) <= 0) {
              break label966;
            }
            bool = true;
            label613:
            paramAnonymousa.field_isHidden = bool;
            paramAnonymousa.field_mergerId = bg.ap((String)((Map)localObject2).get(".sysmsg.gamecenter.merge_id"), "");
            paramAnonymousa.field_weight = bg.ap((String)((Map)localObject2).get(".sysmsg.gamecenter.weight"), "");
            paramAnonymousa.field_receiveTime = (System.currentTimeMillis() / 1000L);
            x.d((Map)localObject2, paramAnonymousa);
            paramAnonymousa.mAD = bg.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.filter_flag"), 0L);
            paramAnonymousa.mAE = bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_center.not_in_msg_center"), 0);
            if (bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), 0) <= 0) {
              break label971;
            }
            bool = true;
            label745:
            paramAnonymousa.mAp = bool;
            paramAnonymousa.mAq.mBd = bg.ap((String)((Map)localObject2).get(".sysmsg.gamecenter.entrance.entrance_icon_url"), "");
            if ((bg.mZ((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url"))) && (bg.mZ((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc")))) {
              break label976;
            }
          }
          label966:
          label971:
          label976:
          for (paramAnonymousa.mAr = true;; paramAnonymousa.mAr = false)
          {
            x.e((Map)localObject2, paramAnonymousa);
            paramAnonymousa.mAV.mBq = bg.ap((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg.$pkg_id"), "");
            paramAnonymousa.mAV.ksf = bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg"), 0);
            if (!bg.mZ(paramAnonymousa.mAV.mBq)) {
              paramAnonymousa.field_isHidden = true;
            }
            paramAnonymousa.mAV.mBr = bg.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.display_with_wepkg.$always_display_after_time"), 0L);
            if (paramAnonymousa.mAE == 1) {
              paramAnonymousa.field_showInMsgList = false;
            }
            break;
            paramAnonymousa.field_expireTime = (l + bg.getLong((String)((Map)localObject2).get(".sysmsg.gamecenter.time_info.create_time"), System.currentTimeMillis() / 1000L));
            break label591;
            bool = false;
            break label613;
            bool = false;
            break label745;
          }
        }
        paramAnonymousa.field_gameMsgId = bg.ap((String)((Map)localObject2).get(".sysmsg.gamecenter.msg_id"), "");
        paramAnonymousa.field_msgType = bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$newmsgtype"), 0);
        if (paramAnonymousa.field_msgType == 0) {
          paramAnonymousa.field_msgType = bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.$msgtype"), 0);
        }
        paramAnonymousa.field_appId = ((String)((Map)localObject2).get(".sysmsg.gamecenter.appinfo.appid"));
        if (!bg.mZ(s.s((Map)localObject2)))
        {
          bool = true;
          label1086:
          paramAnonymousa.field_showInMsgList = bool;
          paramAnonymousa.field_createTime = bg.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.createtime"), System.currentTimeMillis() / 1000L);
          l = bg.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.expiredtime"), 0L);
          if (l != 0L) {
            break label1402;
          }
          paramAnonymousa.field_expireTime = Long.MAX_VALUE;
          label1151:
          if (bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.wifi_flag"), 0) <= 0) {
            break label1435;
          }
          bool = true;
          label1173:
          paramAnonymousa.field_isHidden = bool;
          paramAnonymousa.field_mergerId = bg.ap((String)((Map)localObject2).get(".sysmsg.gamecenter.merge_id"), "");
          if (paramAnonymousa.field_msgType != 10) {
            break label1440;
          }
          paramAnonymousa.field_weight = "6";
          label1217:
          paramAnonymousa.field_receiveTime = (System.currentTimeMillis() / 1000L);
          paramAnonymousa.mAD = bg.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.filter_flag"), 0L);
          paramAnonymousa.mAC = s.t((Map)localObject2);
          paramAnonymousa.mAE = bg.getInt((String)((Map)localObject2).get(".sysmsg.game_control_info.not_in_msg_center"), 0);
          if (bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.message_bubble_info.show_message_bubble"), 0) <= 0) {
            break label1450;
          }
          bool = true;
          label1301:
          paramAnonymousa.mAr = bool;
          paramAnonymousa.mAY = bg.ap((String)((Map)localObject2).get(".sysmsg.gamecenter.noticeid"), "");
          paramAnonymousa.mAq.mBf = bg.getInt((String)((Map)localObject2).get(".sysmsg.gamecenter.badge_display_type"), 0);
          if (paramAnonymousa.mAq.mBf <= 0) {
            break label1455;
          }
        }
        label1402:
        label1435:
        label1440:
        label1450:
        label1455:
        for (boolean bool = true;; bool = false)
        {
          paramAnonymousa.mAp = bool;
          if ((paramAnonymousa.mAC & 0x4) == 0L) {
            paramAnonymousa.mAp = false;
          }
          s.b((Map)localObject2, paramAnonymousa);
          break;
          bool = false;
          break label1086;
          paramAnonymousa.field_expireTime = (l + bg.getLong((String)((Map)localObject2).get(".sysmsg.game_control_info.createtime"), System.currentTimeMillis() / 1000L));
          break label1151;
          bool = false;
          break label1173;
          paramAnonymousa.field_weight = "2";
          break label1217;
          bool = false;
          break label1301;
        }
        label1460:
        localObject1 = paramAnonymousa.field_gameMsgId;
        if (!bg.mZ((String)localObject1))
        {
          localObject2 = SubCoreGameCenter.aFe();
          i = 0;
          localObject1 = ((u)localObject2).rawQuery("select count(*) from GameRawMessage where gameMsgId = \"" + (String)localObject1 + "\"", new String[0]);
          if (localObject1 != null)
          {
            if (((Cursor)localObject1).moveToFirst()) {
              i = ((Cursor)localObject1).getInt(0);
            }
            ((Cursor)localObject1).close();
            if (i <= 0) {}
          }
        }
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label1589;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageService", "duplicated msg:%s", new Object[] { Long.valueOf(paramAnonymousa.field_msgId) });
          i = 0;
          break;
        }
        label1589:
        long l = System.currentTimeMillis() / 1000L;
        if (paramAnonymousa.field_expireTime <= l) {}
        for (i = 0;; i = 1)
        {
          if (i != 0) {
            break label1646;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageService", "msg is expired Time, %s", new Object[] { Long.valueOf(paramAnonymousa.field_msgId) });
          i = 0;
          break;
        }
        label1646:
        l = paramAnonymousa.mAD;
        localObject1 = paramAnonymousa.field_appId;
        if (l == 1L)
        {
          if ((!bg.mZ((String)localObject1)) && (com.tencent.mm.pluginsdk.model.app.g.n(ab.getContext(), (String)localObject1))) {
            break label1750;
          }
          i = 0;
        }
        for (;;)
        {
          if (i != 0) {
            break label1755;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GameMessageService", "checkFilter failed,%s", new Object[] { Long.valueOf(paramAnonymousa.field_msgId) });
          i = 0;
          break;
          if ((l == 2L) && ((bg.mZ((String)localObject1)) || (com.tencent.mm.pluginsdk.model.app.g.n(ab.getContext(), (String)localObject1)))) {
            i = 0;
          } else {
            label1750:
            i = 1;
          }
        }
        label1755:
        if (paramAnonymousa.field_msgType != 20)
        {
          localObject2 = t.aEr();
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = t.aEt();
          }
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = t.aEv();
          }
          if ((localObject2 == null) || (t.a(paramAnonymousa, (q)localObject2)))
          {
            if (!paramAnonymousa.mAp) {
              break label2052;
            }
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWQ, Long.valueOf(paramAnonymousa.field_msgId));
          }
          label1838:
          localObject2 = t.aEr();
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = t.aEt();
          }
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = t.aEv();
          }
          if ((localObject2 == null) || (t.a(paramAnonymousa, (q)localObject2)))
          {
            if (bg.mZ(paramAnonymousa.mAF.url)) {
              break label2072;
            }
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWU, Long.valueOf(paramAnonymousa.field_msgId));
          }
          label1918:
          localObject2 = t.aEr();
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = t.aEt();
          }
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = t.aEv();
          }
          if ((localObject2 == null) || (t.a(paramAnonymousa, (q)localObject2)))
          {
            if (!paramAnonymousa.mAr) {
              break label2078;
            }
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWR, Long.valueOf(paramAnonymousa.field_msgId));
          }
        }
        for (;;)
        {
          if (paramAnonymousa.field_msgType == 4)
          {
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uWT, Long.valueOf(paramAnonymousa.field_msgId));
          }
          if ((paramAnonymousa != null) && (!bg.mZ(paramAnonymousa.mAq.mBd))) {
            com.tencent.mm.plugin.game.d.c.zr(paramAnonymousa.mAq.mBd);
          }
          i = 1;
          break;
          label2052:
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uWQ, Long.valueOf(0L));
          break label1838;
          label2072:
          t.aEu();
          break label1918;
          label2078:
          t.aEw();
        }
      }
    };
    this.mCl = new com.tencent.mm.sdk.b.c() {};
    this.mCm = new com.tencent.mm.sdk.b.c() {};
    this.mCn = new com.tencent.mm.sdk.b.c() {};
    this.mCo = new com.tencent.mm.sdk.b.c()
    {
      private static boolean b(gm paramAnonymousgm)
      {
        GMTrace.i(12596065337344L, 93848);
        switch (paramAnonymousgm.fCF.nN)
        {
        }
        for (;;)
        {
          GMTrace.o(12596065337344L, 93848);
          return false;
          Object localObject1 = paramAnonymousgm.fCF.fCA;
          new LinkedList();
          if (localObject1 != null)
          {
            long l;
            Object localObject2;
            try
            {
              localObject1 = new JSONObject((String)localObject1);
              int i = bg.getInt(((JSONObject)localObject1).optString("type"), 0);
              int j = bg.getInt(((JSONObject)localObject1).optString("limit"), 0);
              l = bg.getLong(((JSONObject)localObject1).optString("lastLocalId"), -1L);
              int k = bg.getInt(((JSONObject)localObject1).optString("isUnread"), -1);
              if ((j <= 0) || (j > 10000) || (l < 0L) || (k < 0)) {
                continue;
              }
              localObject2 = SubCoreGameCenter.aFe().b(i, l, k, j);
              if (bg.bX((List)localObject2)) {
                continue;
              }
              localObject1 = new JSONArray();
              localObject2 = ((LinkedList)localObject2).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                q localq = (q)((Iterator)localObject2).next();
                JSONObject localJSONObject = new JSONObject();
                localJSONObject.put("localId", localq.field_msgId);
                localJSONObject.put("content", localq.field_rawXML);
                ((JSONArray)localObject1).put(localJSONObject);
              }
            }
            catch (JSONException paramAnonymousgm)
            {
              com.tencent.mm.sdk.platformtools.w.w("MicroMsg.GameJsapiProcessor", "JSONException : %s", new Object[] { paramAnonymousgm.getMessage() });
            }
            paramAnonymousgm.fCG.fCH = ((JSONArray)localObject1).toString();
            continue;
            v.a(paramAnonymousgm);
            continue;
            SubCoreGameCenter.aFf();
            localObject1 = t.aEv();
            if (localObject1 != null)
            {
              paramAnonymousgm.fCG.fCH = ((q)localObject1).field_rawXML;
              continue;
              SubCoreGameCenter.aFf();
              t.aEw();
              continue;
              SubCoreGameCenter.aFf();
              ap.AS();
              l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWS, Long.valueOf(0L))).longValue();
              localObject2 = SubCoreGameCenter.aFe().cw(l);
              if (localObject2 != null)
              {
                localObject1 = localObject2;
                if (!((q)localObject2).field_isHidden) {}
              }
              else
              {
                localObject1 = null;
              }
              if (localObject1 != null)
              {
                paramAnonymousgm.fCG.fCH = ((q)localObject1).field_rawXML;
                continue;
                SubCoreGameCenter.aFf();
                ap.AS();
                l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWS, Long.valueOf(0L))).longValue();
                paramAnonymousgm = SubCoreGameCenter.aFe().cw(l);
                if ((paramAnonymousgm != null) && (!paramAnonymousgm.field_isHidden))
                {
                  ap.AS();
                  com.tencent.mm.x.c.xi().a(w.a.uWS, Long.valueOf(0L));
                  continue;
                  SubCoreGameCenter.aFf();
                  localObject1 = t.aEx();
                  if (localObject1 != null)
                  {
                    paramAnonymousgm.fCG.fCH = ((q)localObject1).field_rawXML;
                    continue;
                    SubCoreGameCenter.aFf();
                    ap.AS();
                    l = ((Long)com.tencent.mm.x.c.xi().get(w.a.uWT, Long.valueOf(0L))).longValue();
                    if (SubCoreGameCenter.aFe().cw(l) != null)
                    {
                      ap.AS();
                      com.tencent.mm.x.c.xi().a(w.a.uWT, Long.valueOf(0L));
                    }
                  }
                }
              }
            }
          }
        }
      }
    };
    this.mCp = new com.tencent.mm.sdk.b.c()
    {
      /* Error */
      private static boolean a(kv paramAnonymouskv)
      {
        // Byte code:
        //   0: ldc2_w 54
        //   3: ldc 56
        //   5: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: new 58	org/json/JSONObject
        //   11: dup
        //   12: aload_0
        //   13: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   16: getfield 68	com/tencent/mm/g/a/kv$a:extraInfo	Ljava/lang/String;
        //   19: invokespecial 71	org/json/JSONObject:<init>	(Ljava/lang/String;)V
        //   22: astore_3
        //   23: aload_3
        //   24: ldc 73
        //   26: invokevirtual 77	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
        //   29: astore_2
        //   30: aload_3
        //   31: ldc 79
        //   33: invokevirtual 77	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
        //   36: iconst_0
        //   37: invokestatic 85	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
        //   40: istore_1
        //   41: new 87	android/content/Intent
        //   44: dup
        //   45: invokespecial 88	android/content/Intent:<init>	()V
        //   48: astore_3
        //   49: aload_0
        //   50: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   53: getfield 91	com/tencent/mm/g/a/kv$a:fIp	I
        //   56: tableswitch	default:+32->88, 0:+96->152, 1:+169->225, 2:+242->298, 3:+330->386
        //   88: ldc2_w 54
        //   91: ldc 56
        //   93: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   96: iconst_0
        //   97: ireturn
        //   98: astore_3
        //   99: ldc 93
        //   101: astore_2
        //   102: ldc 95
        //   104: ldc 97
        //   106: iconst_1
        //   107: anewarray 99	java/lang/Object
        //   110: dup
        //   111: iconst_0
        //   112: aload_3
        //   113: invokevirtual 102	org/json/JSONException:getMessage	()Ljava/lang/String;
        //   116: aastore
        //   117: invokestatic 108	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   120: iconst_0
        //   121: istore_1
        //   122: goto -81 -> 41
        //   125: astore_3
        //   126: ldc 93
        //   128: astore_2
        //   129: ldc 95
        //   131: ldc 97
        //   133: iconst_1
        //   134: anewarray 99	java/lang/Object
        //   137: dup
        //   138: iconst_0
        //   139: aload_3
        //   140: invokevirtual 109	java/lang/Exception:getMessage	()Ljava/lang/String;
        //   143: aastore
        //   144: invokestatic 108	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   147: iconst_0
        //   148: istore_1
        //   149: goto -108 -> 41
        //   152: aload_3
        //   153: aload_0
        //   154: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   157: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   160: ldc 115
        //   162: invokevirtual 119	android/content/Intent:setClass	(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
        //   165: pop
        //   166: aload_0
        //   167: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   170: getfield 122	com/tencent/mm/g/a/kv$a:jumpType	I
        //   173: iconst_1
        //   174: if_icmpne +12 -> 186
        //   177: aload_3
        //   178: ldc 124
        //   180: ldc 124
        //   182: invokevirtual 128	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   185: pop
        //   186: aload_3
        //   187: ldc -126
        //   189: iconst_5
        //   190: invokevirtual 133	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
        //   193: pop
        //   194: aload_0
        //   195: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   198: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   201: aload_3
        //   202: invokevirtual 139	android/content/Context:startActivity	(Landroid/content/Intent;)V
        //   205: aload_0
        //   206: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   209: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   212: iconst_5
        //   213: iconst_5
        //   214: iconst_1
        //   215: bipush 6
        //   217: iload_1
        //   218: aconst_null
        //   219: invokestatic 144	com/tencent/mm/plugin/game/model/ai:a	(Landroid/content/Context;IIIIILjava/lang/String;)V
        //   222: goto -134 -> 88
        //   225: aload_3
        //   226: aload_0
        //   227: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   230: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   233: ldc -110
        //   235: invokevirtual 119	android/content/Intent:setClass	(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
        //   238: pop
        //   239: aload_0
        //   240: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   243: getfield 122	com/tencent/mm/g/a/kv$a:jumpType	I
        //   246: iconst_1
        //   247: if_icmpne +12 -> 259
        //   250: aload_3
        //   251: ldc -108
        //   253: ldc -108
        //   255: invokevirtual 128	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   258: pop
        //   259: aload_3
        //   260: ldc -126
        //   262: iconst_5
        //   263: invokevirtual 133	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
        //   266: pop
        //   267: aload_0
        //   268: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   271: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   274: aload_3
        //   275: invokevirtual 139	android/content/Context:startActivity	(Landroid/content/Intent;)V
        //   278: aload_0
        //   279: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   282: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   285: iconst_5
        //   286: iconst_5
        //   287: iconst_1
        //   288: bipush 6
        //   290: iload_1
        //   291: aconst_null
        //   292: invokestatic 144	com/tencent/mm/plugin/game/model/ai:a	(Landroid/content/Context;IIIIILjava/lang/String;)V
        //   295: goto -207 -> 88
        //   298: aload_2
        //   299: invokestatic 152	com/tencent/mm/sdk/platformtools/bg:mZ	(Ljava/lang/String;)Z
        //   302: ifne -214 -> 88
        //   305: aload_3
        //   306: aload_0
        //   307: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   310: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   313: ldc -102
        //   315: invokevirtual 119	android/content/Intent:setClass	(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
        //   318: pop
        //   319: aload_3
        //   320: ldc -100
        //   322: aload_2
        //   323: invokevirtual 128	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   326: pop
        //   327: aload_0
        //   328: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   331: getfield 122	com/tencent/mm/g/a/kv$a:jumpType	I
        //   334: iconst_1
        //   335: if_icmpne +12 -> 347
        //   338: aload_3
        //   339: ldc -108
        //   341: ldc -108
        //   343: invokevirtual 128	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   346: pop
        //   347: aload_3
        //   348: ldc -126
        //   350: iconst_5
        //   351: invokevirtual 133	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
        //   354: pop
        //   355: aload_0
        //   356: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   359: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   362: aload_3
        //   363: invokevirtual 139	android/content/Context:startActivity	(Landroid/content/Intent;)V
        //   366: aload_0
        //   367: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   370: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   373: iconst_5
        //   374: iconst_5
        //   375: iconst_1
        //   376: bipush 6
        //   378: iload_1
        //   379: aconst_null
        //   380: invokestatic 144	com/tencent/mm/plugin/game/model/ai:a	(Landroid/content/Context;IIIIILjava/lang/String;)V
        //   383: goto -295 -> 88
        //   386: aload_3
        //   387: aload_0
        //   388: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   391: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   394: ldc -98
        //   396: invokevirtual 119	android/content/Intent:setClass	(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
        //   399: pop
        //   400: aload_3
        //   401: ldc -126
        //   403: iconst_5
        //   404: invokevirtual 133	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
        //   407: pop
        //   408: aload_0
        //   409: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   412: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   415: aload_3
        //   416: invokevirtual 139	android/content/Context:startActivity	(Landroid/content/Intent;)V
        //   419: aload_0
        //   420: getfield 62	com/tencent/mm/g/a/kv:fIo	Lcom/tencent/mm/g/a/kv$a;
        //   423: getfield 113	com/tencent/mm/g/a/kv$a:context	Landroid/content/Context;
        //   426: iconst_5
        //   427: iconst_5
        //   428: iconst_1
        //   429: bipush 6
        //   431: iload_1
        //   432: aconst_null
        //   433: invokestatic 144	com/tencent/mm/plugin/game/model/ai:a	(Landroid/content/Context;IIIIILjava/lang/String;)V
        //   436: goto -348 -> 88
        //   439: astore_3
        //   440: goto -311 -> 129
        //   443: astore_3
        //   444: goto -342 -> 102
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	447	0	paramAnonymouskv	kv
        //   40	392	1	i	int
        //   29	294	2	str	String
        //   22	27	3	localObject	Object
        //   98	15	3	localJSONException1	JSONException
        //   125	291	3	localException1	Exception
        //   439	1	3	localException2	Exception
        //   443	1	3	localJSONException2	JSONException
        // Exception table:
        //   from	to	target	type
        //   8	30	98	org/json/JSONException
        //   8	30	125	java/lang/Exception
        //   30	41	439	java/lang/Exception
        //   30	41	443	org/json/JSONException
      }
    };
    this.mCq = new com.tencent.mm.sdk.b.c() {};
    this.mCr = new com.tencent.mm.sdk.b.c() {};
    this.mCs = new com.tencent.mm.sdk.b.c() {};
    this.mCt = new com.tencent.mm.pluginsdk.e.d()
    {
      public final j aFm()
      {
        GMTrace.i(12588280709120L, 93790);
        u localu = SubCoreGameCenter.aFe();
        GMTrace.o(12588280709120L, 93790);
        return localu;
      }
      
      public final com.tencent.mm.sdk.b.b zj(String paramAnonymousString)
      {
        GMTrace.i(12588146491392L, 93789);
        gn localgn = new gn();
        localgn.fCI.fut = paramAnonymousString;
        GMTrace.o(12588146491392L, 93789);
        return localgn;
      }
    };
    this.kCk = new com.tencent.mm.sdk.b.c() {};
    this.mCu = new com.tencent.mm.sdk.b.c() {};
    this.mCv = new com.tencent.mm.sdk.b.c() {};
    this.mCw = new com.tencent.mm.sdk.b.c() {};
    this.mCx = new com.tencent.mm.sdk.b.c() {};
    this.mCy = new com.tencent.mm.sdk.b.c() {};
    this.iHr = new com.tencent.mm.sdk.b.c() {};
    this.mCz = new com.tencent.mm.sdk.b.c() {};
    this.mCA = new com.tencent.mm.sdk.b.c() {};
    com.tencent.mm.pluginsdk.l.a.sRn = new l.k()
    {
      public final void D(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(12617942827008L, 94011);
        ai.g(paramAnonymousString, 1, paramAnonymousInt1, paramAnonymousInt2);
        GMTrace.o(12617942827008L, 94011);
      }
      
      public final void K(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(12618077044736L, 94012);
        ai.K(paramAnonymousString1, paramAnonymousString2, paramAnonymousString3);
        GMTrace.o(12618077044736L, 94012);
      }
      
      public final void a(Context paramAnonymousContext, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, String paramAnonymousString4, long paramAnonymousLong, String paramAnonymousString5)
      {
        GMTrace.i(12618345480192L, 94014);
        ai.a(paramAnonymousContext, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousString4, 0L, paramAnonymousString5);
        GMTrace.o(12618345480192L, 94014);
      }
      
      public final void a(Context paramAnonymousContext, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, String paramAnonymousString4, int paramAnonymousInt2)
      {
        GMTrace.i(12617674391552L, 94009);
        ai.a(paramAnonymousContext, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, paramAnonymousInt1, paramAnonymousString4, paramAnonymousInt2);
        GMTrace.o(12617674391552L, 94009);
      }
      
      public final void a(String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString3, int paramAnonymousInt3)
      {
        GMTrace.i(12617540173824L, 94008);
        ai.a(paramAnonymousString1, paramAnonymousString2, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString3, paramAnonymousInt3);
        GMTrace.o(12617540173824L, 94008);
      }
      
      public final void a(String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString3, long paramAnonymousLong)
      {
        GMTrace.i(12617808609280L, 94010);
        ai.a(paramAnonymousString1, paramAnonymousString2, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousString3, paramAnonymousLong);
        GMTrace.o(12617808609280L, 94010);
      }
      
      public final boolean aFl()
      {
        GMTrace.i(16558038450176L, 123367);
        try
        {
          Object localObject = g.aEh();
          boolean bool;
          if (((g)localObject).mzK != null)
          {
            bool = ((g)localObject).mzK.mEo;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameConfigManager", "getShowEntrance : " + bool);
            GMTrace.o(16558038450176L, 123367);
            return bool;
          }
          ((g)localObject).QK();
          localObject = com.tencent.mm.sdk.platformtools.v.d(ab.getContext().getSharedPreferences(ab.bNa(), 0));
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameConfigManager", "getShowEntrance, lang = %s", new Object[] { localObject });
          if ("zh_CN".equals(localObject)) {}
          for (localObject = "0";; localObject = "1")
          {
            localObject = bg.ap(com.tencent.mm.k.g.uz().getValue("HideGameCenter"), (String)localObject);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GameConfigManager", "hide game center:[%s]", new Object[] { localObject });
            bool = ((String)localObject).equalsIgnoreCase("0");
            break;
          }
          return true;
        }
        catch (Exception localException)
        {
          GMTrace.o(16558038450176L, 123367);
        }
      }
      
      public final void cC(Context paramAnonymousContext)
      {
        GMTrace.i(12618479697920L, 94015);
        paramAnonymousContext.getSharedPreferences("game_center_pref", 0).edit().putString("notified_game_for_yyb_download_key", "").commit();
        paramAnonymousContext.getSharedPreferences("game_center_pref", 0).edit().putInt("total_notify_times_for_yyb_download_key", 0).commit();
        paramAnonymousContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("delete_message_by_time_key", false).commit();
        GMTrace.o(12618479697920L, 94015);
      }
      
      public final void o(Context paramAnonymousContext, String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(12618211262464L, 94013);
        ai.o(paramAnonymousContext, paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(12618211262464L, 94013);
      }
    };
    GMTrace.o(12585462136832L, 93769);
  }
  
  public static String aFc()
  {
    GMTrace.i(12585596354560L, 93770);
    String str = mCj;
    GMTrace.o(12585596354560L, 93770);
    return str;
  }
  
  private static SubCoreGameCenter aFd()
  {
    GMTrace.i(12585730572288L, 93771);
    SubCoreGameCenter localSubCoreGameCenter2 = (SubCoreGameCenter)ap.AL().gJ("plugin.game");
    SubCoreGameCenter localSubCoreGameCenter1 = localSubCoreGameCenter2;
    if (localSubCoreGameCenter2 == null)
    {
      localSubCoreGameCenter1 = new SubCoreGameCenter();
      ap.AL().a("plugin.game", localSubCoreGameCenter1);
    }
    GMTrace.o(12585730572288L, 93771);
    return localSubCoreGameCenter1;
  }
  
  public static u aFe()
  {
    GMTrace.i(12585864790016L, 93772);
    com.tencent.mm.kernel.h.xx().wH();
    if (aFd().mCd == null)
    {
      localObject = aFd();
      ap.AS();
      ((SubCoreGameCenter)localObject).mCd = new u(com.tencent.mm.x.c.yI());
    }
    Object localObject = aFd().mCd;
    GMTrace.o(12585864790016L, 93772);
    return (u)localObject;
  }
  
  public static t aFf()
  {
    GMTrace.i(12585999007744L, 93773);
    com.tencent.mm.kernel.h.xx().wH();
    if (aFd().mCe == null) {
      aFd().mCe = new t();
    }
    t localt = aFd().mCe;
    GMTrace.o(12585999007744L, 93773);
    return localt;
  }
  
  public static ah aFg()
  {
    GMTrace.i(12586133225472L, 93774);
    com.tencent.mm.kernel.h.xx().wH();
    if (aFd().mCg == null) {
      aFd().mCg = new ah();
    }
    ah localah = aFd().mCg;
    GMTrace.o(12586133225472L, 93774);
    return localah;
  }
  
  public static w aFh()
  {
    GMTrace.i(12586267443200L, 93775);
    com.tencent.mm.kernel.h.xx().wH();
    if (aFd().mCh == null) {
      aFd().mCh = new w();
    }
    w localw = aFd().mCh;
    GMTrace.o(12586267443200L, 93775);
    return localw;
  }
  
  public static z aFi()
  {
    GMTrace.i(12586401660928L, 93776);
    com.tencent.mm.kernel.h.xx().wH();
    if (aFd().mCi == null)
    {
      localObject = aFd();
      ap.AS();
      ((SubCoreGameCenter)localObject).mCi = new z(com.tencent.mm.x.c.yI());
    }
    Object localObject = aFd().mCi;
    GMTrace.o(12586401660928L, 93776);
    return (z)localObject;
  }
  
  public static com.tencent.mm.pluginsdk.model.app.d aFj()
  {
    GMTrace.i(12586535878656L, 93777);
    com.tencent.mm.pluginsdk.model.app.d locald = an.aFj();
    GMTrace.o(12586535878656L, 93777);
    return locald;
  }
  
  public static b aFk()
  {
    GMTrace.i(12586670096384L, 93778);
    com.tencent.mm.kernel.h.xx().wH();
    if (aFd().mCf == null) {
      aFd().mCf = new b();
    }
    b localb = aFd().mCf;
    GMTrace.o(12586670096384L, 93778);
    return localb;
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(12587072749568L, 93781);
    ap.getSysCmdMsgExtension().a("gamecenter", this.loP, true);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCl);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCm);
    com.tencent.mm.sdk.b.a.uLm.b(this.kCk);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCn);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCo);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCp);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCq);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCr);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCu);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCv);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCs);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCw);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCx);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCy);
    com.tencent.mm.sdk.b.a.uLm.b(this.iHr);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCz);
    com.tencent.mm.sdk.b.a.uLm.b(this.mCA);
    l.aEb();
    d.aEb();
    g.aEh().QK();
    Object localObject = new com.tencent.mm.plugin.game.b.a();
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).registerIndexStorage((com.tencent.mm.plugin.fts.a.g)localObject);
    localObject = new com.tencent.mm.plugin.game.b.b();
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).registerNativeLogic(5, (i)localObject);
    GMTrace.o(12587072749568L, 93781);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(12587206967296L, 93782);
    GMTrace.o(12587206967296L, 93782);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(12586938531840L, 93780);
    GMTrace.o(12586938531840L, 93780);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(12587341185024L, 93783);
    ap.getSysCmdMsgExtension().b("gamecenter", this.loP, true);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCl);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCm);
    com.tencent.mm.sdk.b.a.uLm.c(this.kCk);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCn);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCo);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCp);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCq);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCr);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCu);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCv);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCs);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCw);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCx);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCy);
    com.tencent.mm.sdk.b.a.uLm.c(this.iHr);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCz);
    com.tencent.mm.sdk.b.a.uLm.c(this.mCA);
    com.tencent.mm.plugin.game.d.c.aaX();
    Object localObject;
    if (this.mCg != null)
    {
      localObject = this.mCg;
      if (((ah)localObject).mBU != null) {
        ((ah)localObject).mBU.clear();
      }
      ap.wT().b(427, (com.tencent.mm.ac.e)localObject);
    }
    if (this.mCh != null)
    {
      localObject = this.mCh;
      ap.wT().b(1223, (com.tencent.mm.ac.e)localObject);
    }
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).unregisterIndexStorage(16);
    ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).unregisterNativeLogic(5);
    com.tencent.mm.plugin.fts.d.h.nT(80);
    com.tencent.mm.plugin.fts.d.h.nT(4144);
    l.aEc();
    d.aEc();
    GMTrace.o(12587341185024L, 93783);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(12586804314112L, 93779);
    HashMap localHashMap = mCk;
    GMTrace.o(12586804314112L, 93779);
    return localHashMap;
  }
  
  public static class StartGameProcessTask
    extends GameProcessActivityTask
  {
    public static final Parcelable.Creator<StartGameProcessTask> CREATOR;
    public long fti;
    
    static
    {
      GMTrace.i(17081756024832L, 127269);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17081756024832L, 127269);
    }
    
    public StartGameProcessTask(Context paramContext)
    {
      super();
      GMTrace.i(17081487589376L, 127267);
      GMTrace.o(17081487589376L, 127267);
    }
    
    public StartGameProcessTask(Parcel paramParcel)
    {
      GMTrace.i(17081621807104L, 127268);
      f(paramParcel);
      GMTrace.o(17081621807104L, 127268);
    }
    
    public final void VB()
    {
      GMTrace.i(17081084936192L, 127264);
      GMTrace.o(17081084936192L, 127264);
    }
    
    public final void a(Context paramContext, GameProcessActivityTask.a parama)
    {
      GMTrace.i(17080950718464L, 127263);
      Intent localIntent = new Intent(paramContext, FileDownloadConfirmUI.class);
      localIntent.putExtra("extra_download_id", this.fti);
      paramContext.startActivity(localIntent);
      parama.WJ();
      GMTrace.o(17080950718464L, 127263);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17081219153920L, 127265);
      this.fti = paramParcel.readLong();
      GMTrace.o(17081219153920L, 127265);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17081353371648L, 127266);
      paramParcel.writeLong(this.fti);
      GMTrace.o(17081353371648L, 127266);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/SubCoreGameCenter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */