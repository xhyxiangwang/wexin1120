package com.tencent.mm.plugin.card.model;

import android.app.Application;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.g.a.gu;
import com.tencent.mm.g.a.gu.a;
import com.tencent.mm.g.a.ng;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.i;
import com.tencent.mm.plugin.card.sharecard.a.c.a;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.jd;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.bp;
import com.tencent.mm.x.bp.a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class al
  implements am
{
  private static HashMap<Integer, g.d> gBa;
  private com.tencent.mm.plugin.card.a.b kpR;
  private c kpS;
  private ak kpT;
  private h kpU;
  private com.tencent.mm.plugin.card.a.m kpV;
  private com.tencent.mm.plugin.card.sharecard.a.a kpW;
  private com.tencent.mm.plugin.card.sharecard.model.k kpX;
  private com.tencent.mm.plugin.card.sharecard.model.o kpY;
  private com.tencent.mm.plugin.card.sharecard.a.c kpZ;
  private com.tencent.mm.plugin.card.a.k kqa;
  private com.tencent.mm.plugin.card.a.e kqb;
  private com.tencent.mm.plugin.card.a.l kqc;
  private d kqd;
  private i kqe;
  private com.tencent.mm.plugin.card.a.c kqf;
  private com.tencent.mm.plugin.card.a.g kqg;
  private l kqh;
  private j kqi;
  private com.tencent.mm.sdk.b.c kqj;
  private com.tencent.mm.sdk.b.c kqk;
  private com.tencent.mm.sdk.b.c kql;
  private com.tencent.mm.plugin.card.ui.b kqm;
  private com.tencent.mm.sdk.b.c kqn;
  private com.tencent.mm.sdk.b.c kqo;
  private bp.a kqp;
  private bp.a kqq;
  public ae mHandler;
  
  static
  {
    GMTrace.i(4921227214848L, 36666);
    HashMap localHashMap = new HashMap();
    gBa = localHashMap;
    localHashMap.put(Integer.valueOf("USERCARDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4911429320704L, 36593);
        String[] arrayOfString = c.gMz;
        GMTrace.o(4911429320704L, 36593);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("PENDINGCARDIDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4918005989376L, 36642);
        String[] arrayOfString = ak.gMz;
        GMTrace.o(4918005989376L, 36642);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("CARDMSGINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4901899862016L, 36522);
        String[] arrayOfString = h.gMz;
        GMTrace.o(4901899862016L, 36522);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("SHARECARDINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4913174151168L, 36606);
        String[] arrayOfString = com.tencent.mm.plugin.card.sharecard.model.k.gMz;
        GMTrace.o(4913174151168L, 36606);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("SHARECARDSYNCITEMINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(4907671224320L, 36565);
        String[] arrayOfString = com.tencent.mm.plugin.card.sharecard.model.o.gMz;
        GMTrace.o(4907671224320L, 36565);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("CARDQRCODECONFI_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(18907385561088L, 140871);
        String[] arrayOfString = j.gMz;
        GMTrace.o(18907385561088L, 140871);
        return arrayOfString;
      }
    });
    gBa.put(Integer.valueOf("CARDQRCODEDATAINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rk()
      {
        GMTrace.i(18907788214272L, 140874);
        String[] arrayOfString = l.gMz;
        GMTrace.o(18907788214272L, 140874);
        return arrayOfString;
      }
    });
    GMTrace.o(4921227214848L, 36666);
  }
  
  public al()
  {
    GMTrace.i(4918140207104L, 36643);
    this.kqa = null;
    this.kqb = null;
    this.kqc = null;
    this.kqd = null;
    this.kqe = null;
    this.mHandler = new ae(Looper.getMainLooper());
    this.kqj = new com.tencent.mm.plugin.card.a.n();
    this.kqk = new com.tencent.mm.plugin.card.a.o();
    this.kql = new com.tencent.mm.plugin.card.a.a();
    this.kqm = new com.tencent.mm.plugin.card.ui.b();
    this.kqn = new com.tencent.mm.sdk.b.c() {};
    this.kqo = new com.tencent.mm.sdk.b.c() {};
    this.kqp = new bp.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(4915187417088L, 36621);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
        if ((str == null) || (str.length() == 0))
        {
          w.e("MicroMsg.SubCoreCard.CardMsgListener", "onReceiveMsg, msgContent is null");
          GMTrace.o(4915187417088L, 36621);
          return;
        }
        al.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4893444145152L, 36459);
            com.tencent.mm.plugin.card.a.k localk = al.ajG();
            Object localObject1 = str;
            String str1 = paramAnonymousa.hme.tvv;
            w.i("MicroMsg.CardMsgManager", "card onReceiveMsg msgId is " + str1);
            if (!TextUtils.isEmpty((CharSequence)localObject1))
            {
              Object localObject2 = bh.p((String)localObject1, "sysmsg");
              if (localObject2 == null) {
                localObject1 = null;
              }
              for (;;)
              {
                if (localObject1 == null)
                {
                  w.e("MicroMsg.CardMsgManager", "card msg == null");
                  GMTrace.o(4893444145152L, 36459);
                  return;
                  localObject1 = new g();
                  Object localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.card_type");
                  label164:
                  label284:
                  label378:
                  label421:
                  String str2;
                  if ((!TextUtils.isEmpty((CharSequence)localObject3)) && (com.tencent.mm.plugin.card.b.l.ul((String)localObject3)))
                  {
                    ((g)localObject1).field_card_type = Integer.valueOf((String)localObject3).intValue();
                    ((g)localObject1).field_title = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.title"));
                    ((g)localObject1).field_description = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.description"));
                    ((g)localObject1).field_logo_url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.logo_url"));
                    ((g)localObject1).field_logo_color = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.logo_color"));
                    localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.time");
                    if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.ul((String)localObject3))) {
                      break label1181;
                    }
                    if (Long.valueOf((String)localObject3).longValue() < 2147483647L) {
                      break label1165;
                    }
                    ((g)localObject1).field_time = Integer.MAX_VALUE;
                    ((g)localObject1).field_card_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.card_id"));
                    ((g)localObject1).field_card_tp_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.card_tp_id"));
                    ((g)localObject1).field_msg_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_id"));
                    localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_type");
                    if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.ul((String)localObject3))) {
                      break label1197;
                    }
                    ((g)localObject1).field_msg_type = Integer.valueOf((String)localObject3).intValue();
                    localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.jump_type");
                    if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.ul((String)localObject3))) {
                      break label1206;
                    }
                    ((g)localObject1).field_jump_type = Integer.valueOf((String)localObject3).intValue();
                    ((g)localObject1).field_url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.url"));
                    str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.button.text");
                    if (!TextUtils.isEmpty(str2))
                    {
                      localObject3 = new jd();
                      ((jd)localObject3).text = str2;
                      ((jd)localObject3).url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.button.url"));
                      str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.button.action_type");
                      if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.b.l.ul(str2))) {
                        break label1215;
                      }
                      ((jd)localObject3).kpb = Integer.valueOf(str2).intValue();
                      label536:
                      ((g)localObject1).koQ = ((jd)localObject3);
                    }
                  }
                  try
                  {
                    ((g)localObject1).field_buttonData = ((g)localObject1).koQ.toByteArray();
                    str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.text");
                    if (!TextUtils.isEmpty(str2))
                    {
                      localObject3 = new jh();
                      ((jh)localObject3).text = str2;
                      ((jh)localObject3).url = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.url"));
                      str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.type");
                      if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.b.l.ul(str2))) {
                        break label1265;
                      }
                      ((jh)localObject3).type = Integer.valueOf(str2).intValue();
                      str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.opt_region.endtime");
                      if ((TextUtils.isEmpty(str2)) || (!com.tencent.mm.plugin.card.b.l.ul(str2))) {
                        break label1290;
                      }
                      if (Long.valueOf(str2).longValue() < 2147483647L) {
                        break label1274;
                      }
                      ((jh)localObject3).pwk = Integer.MAX_VALUE;
                      ((g)localObject1).koR = ((jh)localObject3);
                    }
                  }
                  catch (Exception localException1)
                  {
                    try
                    {
                      for (;;)
                      {
                        ((g)localObject1).field_operData = ((g)localObject1).koR.toByteArray();
                        localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.report_scene");
                        if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.ul((String)localObject3))) {
                          break label1347;
                        }
                        ((g)localObject1).field_report_scene = Integer.valueOf((String)localObject3).intValue();
                        ((g)localObject1).field_read_state = 1;
                        ((g)localObject1).field_accept_buttons = com.tencent.mm.plugin.card.a.k.g((Map)localObject2, ".sysmsg.carditemmsg");
                        ((g)localObject1).field_jump_buttons = com.tencent.mm.plugin.card.a.k.f((Map)localObject2, ".sysmsg.carditemmsg");
                        localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.get_layout_scene");
                        if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.ul((String)localObject3))) {
                          break label1356;
                        }
                        ((g)localObject1).koU = Integer.valueOf((String)localObject3).intValue();
                        ((g)localObject1).field_consumed_box_id = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.consumed_box_id"));
                        ((g)localObject1).koK = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_wording"));
                        ((g)localObject1).koL = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_buff"));
                        ((g)localObject1).koM = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.reddot_icon_url"));
                        ((g)localObject1).koN = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_tips.title"));
                        ((g)localObject1).koO = ((String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_tips.icon_url"));
                        localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.msg_scene");
                        if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!com.tencent.mm.plugin.card.b.l.ul((String)localObject3))) {
                          break label1365;
                        }
                        ((g)localObject1).koV = Integer.valueOf((String)localObject3).intValue();
                        w.i("MicroMsg.CardMsgManager", "msg_scene is " + (String)localObject3);
                        localObject3 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.need_check");
                        w.i("MicroMsg.CardMsgManager", "need_check:" + (String)localObject3);
                        if (TextUtils.isEmpty((CharSequence)localObject3)) {
                          break label1374;
                        }
                        ((g)localObject1).koP = ((String)localObject3).equals("true");
                        str2 = (String)((Map)localObject2).get(".sysmsg.carditemmsg.all_unavailable");
                        w.i("MicroMsg.CardMsgManager", "all_Unavailable:" + (String)localObject3);
                        if (TextUtils.isEmpty(str2)) {
                          break label1383;
                        }
                        ((g)localObject1).koW = str2.equals("true");
                        ((g)localObject1).field_unavailable_qr_code_list = com.tencent.mm.plugin.card.a.k.h((Map)localObject2, ".sysmsg.carditemmsg");
                        break;
                        ((g)localObject1).field_card_type = 0;
                        break label164;
                        label1165:
                        ((g)localObject1).field_time = Integer.valueOf((String)localObject3).intValue();
                        break label284;
                        label1181:
                        ((g)localObject1).field_time = ((int)(System.currentTimeMillis() / 1000L));
                        break label284;
                        label1197:
                        ((g)localObject1).field_msg_type = 0;
                        break label378;
                        label1206:
                        ((g)localObject1).field_jump_type = 1;
                        break label421;
                        label1215:
                        ((jd)localObject3).kpb = 0;
                        break label536;
                        localException1 = localException1;
                        w.e("MicroMsg.CardMsgInfo", "setCardButton fail, ex = %s", new Object[] { localException1.getMessage() });
                        w.printErrStackTrace("MicroMsg.CardMsgInfo", localException1, "", new Object[0]);
                        continue;
                        label1265:
                        localException1.type = 0;
                        continue;
                        label1274:
                        localException1.pwk = Integer.valueOf(str2).intValue();
                      }
                      label1290:
                      localException1.pwk = ((int)(System.currentTimeMillis() / 1000L));
                    }
                    catch (Exception localException2)
                    {
                      for (;;)
                      {
                        w.e("MicroMsg.CardMsgInfo", "setOperationRegion fail, ex = %s", new Object[] { localException2.getMessage() });
                        w.printErrStackTrace("MicroMsg.CardMsgInfo", localException2, "", new Object[0]);
                        continue;
                        label1347:
                        ((g)localObject1).field_report_scene = 2;
                        continue;
                        label1356:
                        ((g)localObject1).koU = 0;
                        continue;
                        label1365:
                        ((g)localObject1).koV = 0;
                        continue;
                        label1374:
                        ((g)localObject1).koP = false;
                        continue;
                        label1383:
                        ((g)localObject1).koW = false;
                      }
                    }
                  }
                }
              }
              if (TextUtils.isEmpty(((g)localObject1).field_card_id)) {
                w.e("MicroMsg.CardMsgManager", "card id == null");
              }
              localObject2 = ((g)localObject1).field_msg_id;
              ((g)localObject1).field_msg_id = str1;
              if (TextUtils.isEmpty(((g)localObject1).field_msg_id)) {
                ((g)localObject1).field_msg_id = ((String)localObject2);
              }
              if (TextUtils.isEmpty(((g)localObject1).field_msg_id)) {
                ((g)localObject1).field_msg_id = System.currentTimeMillis();
              }
              w.i("MicroMsg.CardMsgManager", "msg.field_msg_id : " + ((g)localObject1).field_msg_id);
              w.i("MicroMsg.CardMsgManager", "msg for msg_type ==  " + ((g)localObject1).field_msg_type);
              if (((g)localObject1).koU != 0)
              {
                ap.AS();
                com.tencent.mm.x.c.xi().a(w.a.uVu, Integer.valueOf(((g)localObject1).koU));
              }
              w.i("MicroMsg.CardMsgManager", "reddot_buff is " + ((g)localObject1).koL);
              if (TextUtils.isEmpty(((g)localObject1).koL)) {
                break label1972;
              }
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.uVq, ((g)localObject1).koL);
              if ((((g)localObject1).field_msg_type & 0x1) != 0)
              {
                w.i("MicroMsg.CardMsgManager", "msg_tips_title is " + ((g)localObject1).koN);
                w.i("MicroMsg.CardMsgManager", "msg_tips_icon_url is " + ((g)localObject1).koO);
                ap.AS();
                com.tencent.mm.x.c.xi().a(w.a.uVs, ((g)localObject1).koN);
                ap.AS();
                com.tencent.mm.x.c.xi().a(w.a.uVt, ((g)localObject1).koO);
              }
              boolean bool2 = com.tencent.mm.s.c.vP().aC(262152, 266256);
              boolean bool1 = bool2;
              if (!bool2)
              {
                bool1 = bool2;
                if ((((g)localObject1).field_msg_type & 0x40) != 0)
                {
                  com.tencent.mm.s.c.vP().k(262152, true);
                  bool1 = true;
                }
              }
              if (!bool1) {
                break label1983;
              }
              w.i("MicroMsg.CardMsgManager", "has card new msg, return");
              label1773:
              if ((((g)localObject1).field_msg_type & 0x1) != 0)
              {
                if (localk.tx(((g)localObject1).field_msg_id)) {
                  break label2574;
                }
                localk.knh.add(localObject1);
                com.tencent.mm.plugin.card.a.k.c((g)localObject1);
                if ((((g)localObject1).field_msg_type & 0x80) != 0) {
                  localk.kni += 1;
                }
              }
            }
            for (;;)
            {
              ap.AS();
              com.tencent.mm.x.c.xi().set(139268, Integer.valueOf(localk.kni));
              localk.a((g)localObject1);
              if ((((g)localObject1).field_msg_type & 0x2) != 0)
              {
                al.ajB();
                com.tencent.mm.plugin.card.a.b.lt(((g)localObject1).koU);
              }
              if ((((g)localObject1).field_msg_type & 0x4) != 0) {
                localk.ahA();
              }
              if ((((g)localObject1).field_msg_type & 0x8) != 0) {
                al.ajI().m(((g)localObject1).field_card_id, ((g)localObject1).field_card_tp_id, ((g)localObject1).field_report_scene);
              }
              if ((((g)localObject1).field_msg_type & 0x400) != 0)
              {
                ((g)localObject1).ajw();
                al.ajS().b((g)localObject1);
              }
              com.tencent.mm.plugin.card.b.l.amj();
              GMTrace.o(4893444145152L, 36459);
              return;
              label1972:
              w.e("MicroMsg.CardMsgManager", "reddot_buff is empty");
              break;
              label1983:
              w.i("MicroMsg.CardMsgManager", "not has new!");
              int i = 0;
              label2024:
              int j;
              label2093:
              int k;
              if ((((g)localObject1).field_msg_type & 0x20) != 0)
              {
                com.tencent.mm.s.c.vP().l(262152, true);
                w.i("MicroMsg.CardMsgManager", "has reddot");
                i = 1;
                j = 0;
                if (TextUtils.isEmpty(((g)localObject1).koK)) {
                  break label2317;
                }
                w.i("MicroMsg.CardMsgManager", "reddot_wording is " + ((g)localObject1).koK);
                ap.AS();
                com.tencent.mm.x.c.xi().a(w.a.uVo, ((g)localObject1).koK);
                com.tencent.mm.s.c.vP().a(w.a.uVi, true);
                j = 1;
                k = 0;
                w.i("MicroMsg.CardMsgManager", "reddot_icon_url is " + ((g)localObject1).koM);
                if (TextUtils.isEmpty(((g)localObject1).koM)) {
                  break label2328;
                }
                ap.AS();
                com.tencent.mm.x.c.xi().a(w.a.uVr, ((g)localObject1).koM);
                com.tencent.mm.s.c.vP().a(w.a.uVj, true);
                k = 1;
                label2162:
                if ((i == 0) || (j == 0) || (k == 0))
                {
                  if ((i == 0) || (j == 0) || (k != 0)) {
                    break label2339;
                  }
                  com.tencent.mm.s.c.vP().a(w.a.uVj, false);
                  ap.AS();
                  com.tencent.mm.x.c.xi().a(w.a.uVr, "");
                }
              }
              for (;;)
              {
                if ((i == 0) && (j == 0) && (k == 0)) {
                  break label2572;
                }
                ap.AS();
                com.tencent.mm.x.c.xi().a(w.a.uVF, ((g)localObject1).field_card_id);
                ap.AS();
                com.tencent.mm.x.c.xi().a(w.a.uVG, Boolean.valueOf(((g)localObject1).koP));
                w.i("MicroMsg.CardMsgManager", "card_id:" + ((g)localObject1).field_card_id + "  need_check:" + ((g)localObject1).koP);
                break;
                w.e("MicroMsg.CardMsgManager", "not has reddot!");
                break label2024;
                label2317:
                w.e("MicroMsg.CardMsgManager", "reddot_wording is empty!");
                break label2093;
                label2328:
                w.e("MicroMsg.CardMsgManager", "reddot_icon_url is empty");
                break label2162;
                label2339:
                if ((i != 0) && (j == 0) && (k != 0))
                {
                  com.tencent.mm.s.c.vP().a(w.a.uVi, false);
                  ap.AS();
                  com.tencent.mm.x.c.xi().a(w.a.uVo, "");
                }
                else if ((i == 0) && (j != 0) && (k != 0))
                {
                  com.tencent.mm.s.c.vP().l(262152, false);
                }
                else if ((i != 0) && (j == 0) && (k == 0))
                {
                  com.tencent.mm.s.c.vP().a(w.a.uVj, false);
                  ap.AS();
                  com.tencent.mm.x.c.xi().a(w.a.uVr, "");
                  com.tencent.mm.s.c.vP().a(w.a.uVi, false);
                  ap.AS();
                  com.tencent.mm.x.c.xi().a(w.a.uVo, "");
                }
                else if ((i == 0) && (j != 0) && (k == 0))
                {
                  com.tencent.mm.s.c.vP().a(w.a.uVj, false);
                  ap.AS();
                  com.tencent.mm.x.c.xi().a(w.a.uVr, "");
                  com.tencent.mm.s.c.vP().l(262152, false);
                }
                else if ((i == 0) && (j == 0) && (k != 0))
                {
                  com.tencent.mm.s.c.vP().a(w.a.uVi, false);
                  ap.AS();
                  com.tencent.mm.x.c.xi().a(w.a.uVo, "");
                  com.tencent.mm.s.c.vP().l(262152, false);
                }
              }
              label2572:
              break label1773;
              label2574:
              w.e("MicroMsg.CardMsgManager", "msg for id " + ((g)localObject1).field_msg_id + " is exist!!");
              localk.ty(((g)localObject1).field_msg_id);
              localk.knh.add(localObject1);
              com.tencent.mm.plugin.card.a.k.c((g)localObject1);
            }
          }
        });
        GMTrace.o(4915187417088L, 36621);
      }
    };
    this.kqq = new bp.a()
    {
      public final void a(final d.a paramAnonymousa)
      {
        GMTrace.i(4893712580608L, 36461);
        final String str = com.tencent.mm.platformtools.n.a(paramAnonymousa.hme.tvq);
        if ((str == null) || (str.length() == 0))
        {
          w.e("MicroMsg.SubCoreCard.notifyShareCardListener", "onReceiveMsg, msgContent is null");
          GMTrace.o(4893712580608L, 36461);
          return;
        }
        al.this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4905121087488L, 36546);
            Object localObject1 = al.ajM();
            Object localObject2 = str;
            String str = paramAnonymousa.hme.tvv;
            w.i("MicroMsg.ShareCardMsgMgr", "sharecard onReceiveMsg msgId is " + str);
            if (!TextUtils.isEmpty((CharSequence)localObject2))
            {
              localObject2 = bh.p((String)localObject2, "sysmsg");
              if (localObject2 == null)
              {
                localObject1 = null;
                if (localObject1 == null)
                {
                  w.e("MicroMsg.ShareCardMsgMgr", "card msg == null");
                  GMTrace.o(4905121087488L, 36546);
                }
              }
              else
              {
                localObject1 = new c.a((com.tencent.mm.plugin.card.sharecard.a.c)localObject1);
                str = (String)((Map)localObject2).get(".sysmsg.notifysharecard.state_flag");
                if ((!TextUtils.isEmpty(str)) && (com.tencent.mm.plugin.card.b.l.ul(str))) {}
                for (((c.a)localObject1).kqG = Integer.valueOf(str).intValue();; ((c.a)localObject1).kqG = 0)
                {
                  ((c.a)localObject1).username = ((String)((Map)localObject2).get(".sysmsg.notifysharecard.username"));
                  ((c.a)localObject1).fMv = ((String)((Map)localObject2).get(".sysmsg.notifysharecard.card_id"));
                  break;
                }
              }
              if (TextUtils.isEmpty(((c.a)localObject1).fMv)) {
                w.e("MicroMsg.ShareCardMsgMgr", "card id == null");
              }
              w.i("MicroMsg.ShareCardMsgMgr", "sharecard doSyncNetScene card id is " + ((c.a)localObject1).fMv);
              al.ajJ().ajT();
              com.tencent.mm.plugin.card.b.l.aml();
            }
            GMTrace.o(4905121087488L, 36546);
          }
        });
        GMTrace.o(4893712580608L, 36461);
      }
    };
    File localFile = new File(m.kpg);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    localFile = new File(m.kph);
    if (!localFile.exists()) {
      localFile.mkdir();
    }
    GMTrace.o(4918140207104L, 36643);
  }
  
  private static al ajA()
  {
    GMTrace.i(4918274424832L, 36644);
    al localal2 = (al)ap.AL().gJ("plugin.card");
    al localal1 = localal2;
    if (localal2 == null)
    {
      localal1 = new al();
      ap.AL().a("plugin.card", localal1);
    }
    GMTrace.o(4918274424832L, 36644);
    return localal1;
  }
  
  public static com.tencent.mm.plugin.card.a.b ajB()
  {
    GMTrace.i(4919079731200L, 36650);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpR == null) {
      ajA().kpR = new com.tencent.mm.plugin.card.a.b();
    }
    com.tencent.mm.plugin.card.a.b localb = ajA().kpR;
    GMTrace.o(4919079731200L, 36650);
    return localb;
  }
  
  public static c ajC()
  {
    GMTrace.i(4919213948928L, 36651);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpS == null)
    {
      localObject = ajA();
      ap.AS();
      ((al)localObject).kpS = new c(com.tencent.mm.x.c.yI());
    }
    Object localObject = ajA().kpS;
    GMTrace.o(4919213948928L, 36651);
    return (c)localObject;
  }
  
  public static ak ajD()
  {
    GMTrace.i(4919348166656L, 36652);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpT == null)
    {
      localObject = ajA();
      ap.AS();
      ((al)localObject).kpT = new ak(com.tencent.mm.x.c.yI());
    }
    Object localObject = ajA().kpT;
    GMTrace.o(4919348166656L, 36652);
    return (ak)localObject;
  }
  
  public static h ajE()
  {
    GMTrace.i(4919482384384L, 36653);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpU == null)
    {
      localObject = ajA();
      ap.AS();
      ((al)localObject).kpU = new h(com.tencent.mm.x.c.yI());
    }
    Object localObject = ajA().kpU;
    GMTrace.o(4919482384384L, 36653);
    return (h)localObject;
  }
  
  public static com.tencent.mm.plugin.card.a.m ajF()
  {
    GMTrace.i(4919616602112L, 36654);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpV == null) {
      ajA().kpV = new com.tencent.mm.plugin.card.a.m();
    }
    com.tencent.mm.plugin.card.a.m localm = ajA().kpV;
    GMTrace.o(4919616602112L, 36654);
    return localm;
  }
  
  public static com.tencent.mm.plugin.card.a.k ajG()
  {
    GMTrace.i(4919750819840L, 36655);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqa == null) {
      ajA().kqa = new com.tencent.mm.plugin.card.a.k();
    }
    com.tencent.mm.plugin.card.a.k localk = ajA().kqa;
    GMTrace.o(4919750819840L, 36655);
    return localk;
  }
  
  public static com.tencent.mm.plugin.card.a.e ajH()
  {
    GMTrace.i(4919885037568L, 36656);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqb == null) {
      ajA().kqb = new com.tencent.mm.plugin.card.a.e();
    }
    com.tencent.mm.plugin.card.a.e locale = ajA().kqb;
    GMTrace.o(4919885037568L, 36656);
    return locale;
  }
  
  public static com.tencent.mm.plugin.card.a.l ajI()
  {
    GMTrace.i(4920019255296L, 36657);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqc == null) {
      ajA().kqc = new com.tencent.mm.plugin.card.a.l();
    }
    com.tencent.mm.plugin.card.a.l locall = ajA().kqc;
    GMTrace.o(4920019255296L, 36657);
    return locall;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.a.a ajJ()
  {
    GMTrace.i(4920153473024L, 36658);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpW == null) {
      ajA().kpW = new com.tencent.mm.plugin.card.sharecard.a.a();
    }
    com.tencent.mm.plugin.card.sharecard.a.a locala = ajA().kpW;
    GMTrace.o(4920153473024L, 36658);
    return locala;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.model.k ajK()
  {
    GMTrace.i(4920287690752L, 36659);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpX == null)
    {
      localObject = ajA();
      ap.AS();
      ((al)localObject).kpX = new com.tencent.mm.plugin.card.sharecard.model.k(com.tencent.mm.x.c.yI());
    }
    Object localObject = ajA().kpX;
    GMTrace.o(4920287690752L, 36659);
    return (com.tencent.mm.plugin.card.sharecard.model.k)localObject;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.model.o ajL()
  {
    GMTrace.i(4920421908480L, 36660);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpY == null)
    {
      localObject = ajA();
      ap.AS();
      ((al)localObject).kpY = new com.tencent.mm.plugin.card.sharecard.model.o(com.tencent.mm.x.c.yI());
    }
    Object localObject = ajA().kpY;
    GMTrace.o(4920421908480L, 36660);
    return (com.tencent.mm.plugin.card.sharecard.model.o)localObject;
  }
  
  public static com.tencent.mm.plugin.card.sharecard.a.c ajM()
  {
    GMTrace.i(4920556126208L, 36661);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kpZ == null) {
      ajA().kpZ = new com.tencent.mm.plugin.card.sharecard.a.c();
    }
    com.tencent.mm.plugin.card.sharecard.a.c localc = ajA().kpZ;
    GMTrace.o(4920556126208L, 36661);
    return localc;
  }
  
  public static d ajN()
  {
    GMTrace.i(4920690343936L, 36662);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqd == null) {
      ajA().kqd = new d();
    }
    d locald = ajA().kqd;
    GMTrace.o(4920690343936L, 36662);
    return locald;
  }
  
  public static i ajO()
  {
    GMTrace.i(4920824561664L, 36663);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqe == null) {
      ajA().kqe = new i();
    }
    i locali = ajA().kqe;
    GMTrace.o(4920824561664L, 36663);
    return locali;
  }
  
  public static com.tencent.mm.plugin.card.a.c ajP()
  {
    GMTrace.i(4920958779392L, 36664);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqf == null) {
      ajA().kqf = new com.tencent.mm.plugin.card.a.c();
    }
    com.tencent.mm.plugin.card.a.c localc = ajA().kqf;
    GMTrace.o(4920958779392L, 36664);
    return localc;
  }
  
  public static l ajQ()
  {
    GMTrace.i(18910472568832L, 140894);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqh == null)
    {
      localObject = ajA();
      ap.AS();
      ((al)localObject).kqh = new l(com.tencent.mm.x.c.yI());
    }
    Object localObject = ajA().kqh;
    GMTrace.o(18910472568832L, 140894);
    return (l)localObject;
  }
  
  public static j ajR()
  {
    GMTrace.i(18910606786560L, 140895);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqi == null)
    {
      localObject = ajA();
      ap.AS();
      ((al)localObject).kqi = new j(com.tencent.mm.x.c.yI());
    }
    Object localObject = ajA().kqi;
    GMTrace.o(18910606786560L, 140895);
    return (j)localObject;
  }
  
  public static com.tencent.mm.plugin.card.a.g ajS()
  {
    GMTrace.i(18910741004288L, 140896);
    com.tencent.mm.kernel.h.xx().wH();
    if (ajA().kqg == null) {
      ajA().kqg = new com.tencent.mm.plugin.card.a.g();
    }
    com.tencent.mm.plugin.card.a.g localg = ajA().kqg;
    GMTrace.o(18910741004288L, 140896);
    return localg;
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(4918677078016L, 36647);
    w.i("MicroMsg.SubCoreCard", "onAccountPostReset, updated = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.sdk.b.a.uLm.b(this.kqn);
    com.tencent.mm.sdk.b.a.uLm.b(this.kqo);
    com.tencent.mm.sdk.b.a.uLm.b(this.kqj);
    com.tencent.mm.sdk.b.a.uLm.b(this.kqk);
    com.tencent.mm.sdk.b.a.uLm.b(this.kql);
    ap.getSysCmdMsgExtension().a("carditemmsg", this.kqp, true);
    ap.getSysCmdMsgExtension().a("notifysharecard", this.kqq, true);
    this.kqa = null;
    if (this.kqb != null)
    {
      this.kqb.kmM.clear();
      this.kqb = null;
    }
    if (this.kpV != null) {
      ??? = this.kpV;
    }
    synchronized (((com.tencent.mm.plugin.card.a.m)???).knj)
    {
      ((com.tencent.mm.plugin.card.a.m)???).knj.clear();
      synchronized (((com.tencent.mm.plugin.card.a.m)???).knk)
      {
        ((com.tencent.mm.plugin.card.a.m)???).knk.clear();
        ap.wT().b(563, (com.tencent.mm.ac.e)???);
        ??? = com.tencent.mm.modelgeo.c.Io();
        if (??? != null) {
          ((com.tencent.mm.modelgeo.a)???).c((a.a)???);
        }
        if (((com.tencent.mm.plugin.card.a.m)???).knm != null) {
          ap.wT().c(((com.tencent.mm.plugin.card.a.m)???).knm);
        }
        this.kpV = null;
        if (this.kpR != null)
        {
          this.kpR.detach();
          this.kpR = null;
        }
        if (this.kpW != null) {
          ??? = this.kpW;
        }
      }
    }
    synchronized (((com.tencent.mm.plugin.card.sharecard.a.a)???).hur)
    {
      ((com.tencent.mm.plugin.card.sharecard.a.a)???).kmr.clear();
      ((com.tencent.mm.plugin.card.sharecard.a.a)???).kms.clear();
      if (((com.tencent.mm.plugin.card.sharecard.a.a)???).kqw != null) {
        ap.wT().c(((com.tencent.mm.plugin.card.sharecard.a.a)???).kqw);
      }
      ap.wT().b(903, (com.tencent.mm.ac.e)???);
      this.kpW = null;
      if (this.kqd != null)
      {
        this.kqd.release();
        ??? = this.kqd;
        ((d)???).kmu.clear();
        ((d)???).kmG.clear();
        ((d)???).kmH.clear();
        ((d)???).kmI.clear();
        ((d)???).kmK = false;
        this.kqd = null;
      }
      if (this.kqe == null) {
        break label510;
      }
      ??? = this.kqe;
      ap.wT().b(907, (com.tencent.mm.ac.e)???);
      ??? = ((i)???).kmV.iterator();
      while (((Iterator)???).hasNext())
      {
        String str = (String)((Iterator)???).next();
        Runnable localRunnable = (Runnable)((i)???).kmX.get(str);
        ((i)???).kmX.remove(str);
        ((i)???).kmW.removeCallbacks(localRunnable);
        continue;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
    }
    ((i)localObject3).kmU.clear();
    ((i)localObject3).kmV.clear();
    ((i)localObject3).kmX.clear();
    this.kqe = null;
    label510:
    if (this.kqf != null)
    {
      this.kqf.release();
      this.kqf = null;
    }
    if (this.kqg != null)
    {
      this.kqg.release();
      this.kqg = null;
    }
    this.kqc = null;
    com.tencent.mm.pluginsdk.l.a.sRm = new com.tencent.mm.plugin.card.a.j();
    com.tencent.mm.plugin.card.ui.b localb = this.kqm;
    com.tencent.mm.plugin.card.ui.b.ZW().registerActivityLifecycleCallbacks(localb);
    GMTrace.o(4918677078016L, 36647);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(4918811295744L, 36648);
    GMTrace.o(4918811295744L, 36648);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(4918542860288L, 36646);
    GMTrace.o(4918542860288L, 36646);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(4918945513472L, 36649);
    if (ajA().kpR != null) {
      ajA().kpR.detach();
    }
    com.tencent.mm.sdk.b.a.uLm.c(this.kqn);
    com.tencent.mm.sdk.b.a.uLm.c(this.kqo);
    com.tencent.mm.sdk.b.a.uLm.c(this.kqj);
    com.tencent.mm.sdk.b.a.uLm.c(this.kqk);
    com.tencent.mm.sdk.b.a.uLm.c(this.kql);
    ap.getSysCmdMsgExtension().b("carditemmsg", this.kqp, true);
    ap.getSysCmdMsgExtension().b("notifysharecard", this.kqq, true);
    com.tencent.mm.pluginsdk.l.a.sRm = null;
    com.tencent.mm.plugin.card.ui.b localb = this.kqm;
    com.tencent.mm.plugin.card.ui.b.ZW().unregisterActivityLifecycleCallbacks(localb);
    GMTrace.o(4918945513472L, 36649);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(4918408642560L, 36645);
    HashMap localHashMap = gBa;
    GMTrace.o(4918408642560L, 36645);
    return localHashMap;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */