package com.tencent.mm.plugin.sns.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public final class j
{
  public static void a(a parama, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, long paramLong, int paramInt3, int paramInt4)
  {
    GMTrace.i(8158961467392L, 60789);
    d locald = new d();
    locald.m("20source_publishid", paramString1 + ",");
    locald.m("21uxinfo", paramString2 + ",");
    locald.m("22clienttime", bg.Pp() + ",");
    locald.m("23video_statu", ",");
    locald.m("24source_type", paramInt1 + ",");
    locald.m("25scene", paramInt2 + ",");
    locald.m("26action_type", a.a(parama) + ",");
    locald.m("27scene_chatname", paramString4 + ",");
    locald.m("28scene_username", paramString3 + ",");
    locald.m("29curr_publishid", paramString5 + ",");
    locald.m("30curr_msgid", paramLong + ",");
    locald.m("31curr_favid", paramInt3 + ",");
    locald.m("32elapsed_time", "0,");
    locald.m("33load_time", "0,");
    locald.m("34is_load_complete", "0,");
    locald.m("35destination", "0,");
    locald.m("36chatroom_membercount", paramInt4 + ",");
    f.a(paramString5, locald);
    w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + locald.LL());
    g.paX.i(12990, new Object[] { locald });
    GMTrace.o(8158961467392L, 60789);
  }
  
  public static void a(b paramb, a parama, m paramm)
  {
    GMTrace.i(8158827249664L, 60788);
    bhc localbhc = paramm.bjL();
    Object localObject = localbhc.uyu.tKd;
    if ((localObject != null) && (!((List)localObject).isEmpty()) && (((localbhc.uyu.tKc == 15) && (paramm.uF(32))) || (localbhc.uyu.tKc == 18)))
    {
      ((List)localObject).get(0);
      if ((paramm.uF(32)) && (localbhc.uyu.tKc == 15))
      {
        localbhc.uyz.hdi = paramm.bjJ().qhb;
        localbhc.uyz.hdj = localbhc.nas;
      }
      paramm = new d();
      paramm.m("20source_publishid", localbhc.uyz.hdj + ",");
      paramm.m("21uxinfo", localbhc.uyz.hdi + ",");
      paramm.m("22clienttime", bg.Pp() + ",");
      paramm.m("23video_statu", ",");
      localObject = new StringBuilder();
      if (localbhc.uyu.tKc != 15) {
        break label528;
      }
    }
    label528:
    for (int i = 1;; i = 2)
    {
      paramm.m("24source_type", i + ",");
      paramm.m("25scene", paramb.value + ",");
      paramm.m("26action_type", a.a(parama) + ",");
      paramm.m("27scene_chatname", ",");
      paramm.m("28scene_username", localbhc.jWW + ",");
      paramm.m("29curr_publishid", localbhc.nas + ",");
      paramm.m("30curr_msgid", "0,");
      paramm.m("31curr_favid", "0,");
      paramm.m("32elapsed_time", "0,");
      paramm.m("33load_time", "0,");
      paramm.m("34is_load_complete", "0,");
      paramm.m("35destination", "0,");
      paramm.m("36chatroom_membercount", "0,");
      o.a(localbhc.qBT, paramm);
      w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_action: " + paramm.LL());
      ((c)h.h(c.class)).i(12990, new Object[] { paramm });
      GMTrace.o(8158827249664L, 60788);
      return;
    }
  }
  
  public static void a(c paramc, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, String paramString4, String paramString5, long paramLong, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(8159229902848L, 60791);
    d locald = new d();
    locald.m("20source_publishid", paramString1 + ",");
    locald.m("21uxinfo", paramString2 + ",");
    locald.m("22clienttime", bg.Pp() + ",");
    locald.m("23video_statu", "3,");
    locald.m("24source_type", paramInt1 + ",");
    locald.m("25scene", paramInt2 + ",");
    locald.m("26action_type", paramc.value + ",");
    locald.m("27scene_chatname", paramString4 + ",");
    locald.m("28scene_username", paramString3 + ",");
    locald.m("29curr_publishid", paramString5 + ",");
    locald.m("30curr_msgid", paramLong + ",");
    locald.m("31curr_favid", paramInt3 + ",");
    locald.m("32chatroom_membercount", paramInt4 + ",");
    locald.m("33chatroom_toMemberCount", paramInt5 + ",");
    w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + locald.LL());
    f.a(paramString5, locald);
    g.paX.i(12991, new Object[] { locald });
    GMTrace.o(8159229902848L, 60791);
  }
  
  public static void a(d paramd, c paramc, e parame, int paramInt, m paramm)
  {
    GMTrace.i(8159095685120L, 60790);
    bhc localbhc = paramm.bjL();
    LinkedList localLinkedList = localbhc.uyu.tKd;
    if ((localLinkedList != null) && (!localLinkedList.isEmpty()) && (((localbhc.uyu.tKc == 15) && (paramm.uF(32))) || (localbhc.uyu.tKc == 18)))
    {
      localLinkedList.get(0);
      if ((paramm.uF(32)) && (localbhc.uyu.tKc == 15))
      {
        localbhc.uyz.hdi = paramm.bjJ().qhb;
        localbhc.uyz.hdj = localbhc.nas;
      }
      paramm = new d();
      paramm.m("20source_publishid", localbhc.uyz.hdj + ",");
      paramm.m("21uxinfo", localbhc.uyz.hdi + ",");
      paramm.m("22clienttime", bg.Pp() + ",");
      paramm.m("23video_statu", e.a(parame) + ",");
      parame = new StringBuilder();
      if (localbhc.uyu.tKc != 15) {
        break label556;
      }
    }
    label556:
    for (int i = 1;; i = 2)
    {
      paramm.m("24source_type", i + ",");
      paramm.m("25scene", paramd.value + ",");
      paramm.m("26action_type", paramc.value + ",");
      paramm.m("27scene_chatname", ",");
      paramm.m("28scene_username", localbhc.jWW + ",");
      paramm.m("29curr_publishid", localbhc.nas + ",");
      paramm.m("30curr_msgid", "0,");
      paramm.m("31curr_favid", "0,");
      paramm.m("32chatroom_membercount", "0,");
      paramm.m("33chatroom_toMemberCount", paramInt + ",");
      o.a(localbhc.qBT, paramm);
      w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_spread: " + paramm.LL());
      g.paX.i(12991, new Object[] { paramm });
      GMTrace.o(8159095685120L, 60790);
      return;
    }
  }
  
  public static void a(m paramm, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 2;
    GMTrace.i(8158693031936L, 60787);
    bhc localbhc = paramm.bjL();
    Object localObject = localbhc.uyu.tKd;
    if ((localObject != null) && (!((List)localObject).isEmpty()) && (((localbhc.uyu.tKc == 15) && (paramm.uF(32))) || (localbhc.uyu.tKc == 18)))
    {
      ((List)localObject).get(0);
      if ((paramm.uF(32)) && (localbhc.uyu.tKc == 15))
      {
        localbhc.uyz.hdi = paramm.bjJ().qhb;
        localbhc.uyz.hdj = localbhc.nas;
      }
      paramm = new d();
      paramm.m("20source_publishid", localbhc.uyz.hdj + ",");
      paramm.m("21uxinfo", localbhc.uyz.hdi + ",");
      paramm.m("22clienttime", bg.Pp() + ",");
      localObject = new StringBuilder();
      if (localbhc.uyu.tKc != 15) {
        break label505;
      }
      i = 1;
      paramm.m("23souce_type", i + ",");
      localObject = new StringBuilder();
      if (!paramBoolean1) {
        break label510;
      }
      i = 6;
      label295:
      paramm.m("24scene", i + ",");
      paramm.m("25scene_chatname", ",");
      paramm.m("26scene_username", localbhc.jWW + ",");
      paramm.m("27curr_publishid", localbhc.nas + ",");
      paramm.m("28curr_msgid", ",");
      paramm.m("29curr_favid", "0,");
      localObject = new StringBuilder();
      if (!paramBoolean2) {
        break label531;
      }
    }
    label505:
    label510:
    label531:
    for (int i = 1;; i = 0)
    {
      paramm.m("30isdownload", i + ",");
      paramm.m("31chatroom_membercount", "0,");
      o.a(localbhc.qBT, paramm);
      w.i("MicroMsg.SnsVideoStatistic", "report snsad_video_exposure: " + paramm.LL());
      g.paX.i(12989, new Object[] { paramm });
      GMTrace.o(8158693031936L, 60787);
      return;
      i = 2;
      break;
      i = j;
      if (localbhc.uyu.tKc != 15) {
        break label295;
      }
      i = 1;
      break label295;
    }
  }
  
  public static enum a
  {
    private int value;
    
    static
    {
      GMTrace.i(8164598611968L, 60831);
      pXg = new a("PlayIcon", 0, 1);
      pXh = new a("EnterFullScreen", 1, 2);
      pXi = new a("EnterCompleteVideo", 2, 3);
      pXj = new a("DetailInVideo", 3, 4);
      pXk = new a("LeavelFullScreen", 4, 5);
      pXl = new a("LeaveCompleteVideo", 5, 6);
      pXm = new a("SightLoaded", 6, 7);
      pXn = new a("DetailTimeline", 7, 8);
      pXo = new a[] { pXg, pXh, pXi, pXj, pXk, pXl, pXm, pXn };
      GMTrace.o(8164598611968L, 60831);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(8164330176512L, 60829);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8164330176512L, 60829);
    }
  }
  
  public static enum b
  {
    public int value;
    
    static
    {
      GMTrace.i(8162585346048L, 60816);
      pXp = new b("Sight", 0, 1);
      pXq = new b("AdUrl", 1, 2);
      pXr = new b("Chat", 2, 3);
      pXs = new b("TalkChat", 3, 4);
      pXt = new b("Fav", 4, 5);
      pXu = new b[] { pXp, pXq, pXr, pXs, pXt };
      GMTrace.o(8162585346048L, 60816);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(8162451128320L, 60815);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8162451128320L, 60815);
    }
  }
  
  public static enum c
  {
    public int value;
    
    static
    {
      GMTrace.i(8160974733312L, 60804);
      pXv = new c("Fav", 0, 1);
      pXw = new c("Chat", 1, 2);
      pXx = new c("Chatroom", 2, 3);
      pXy = new c("Sns", 3, 4);
      pXz = new c[] { pXv, pXw, pXx, pXy };
      GMTrace.o(8160974733312L, 60804);
    }
    
    private c(int paramInt)
    {
      GMTrace.i(8160840515584L, 60803);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8160840515584L, 60803);
    }
  }
  
  public static enum d
  {
    public int value;
    
    static
    {
      GMTrace.i(8167819837440L, 60855);
      pXA = new d("Sight", 0, 1);
      pXB = new d("AdUrl", 1, 2);
      pXC = new d("Chat", 2, 3);
      pXD = new d("TalkChat", 3, 4);
      pXE = new d("Fav", 4, 5);
      pXF = new d[] { pXA, pXB, pXC, pXD, pXE };
      GMTrace.o(8167819837440L, 60855);
    }
    
    private d(int paramInt)
    {
      GMTrace.i(8167685619712L, 60854);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8167685619712L, 60854);
    }
  }
  
  public static enum e
  {
    private int value;
    
    static
    {
      GMTrace.i(8166611877888L, 60846);
      pXG = new e("Samll", 0, 1);
      pXH = new e("Full", 1, 2);
      pXI = new e("Complete", 2, 3);
      pXJ = new e[] { pXG, pXH, pXI };
      GMTrace.o(8166611877888L, 60846);
    }
    
    private e(int paramInt)
    {
      GMTrace.i(8166343442432L, 60844);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(8166343442432L, 60844);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */