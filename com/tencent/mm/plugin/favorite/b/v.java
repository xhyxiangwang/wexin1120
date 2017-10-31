package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class v
{
  public static void a(a parama, j paramj)
  {
    GMTrace.i(6274410348544L, 46748);
    if ((paramj.field_favProto.tQC == null) || (paramj.field_favProto.tQC.isEmpty()))
    {
      GMTrace.o(6274410348544L, 46748);
      return;
    }
    Object localObject = ((sp)paramj.field_favProto.tQC.getFirst()).tPx;
    if (localObject == null)
    {
      GMTrace.o(6274410348544L, 46748);
      return;
    }
    d locald = new d();
    locald.m("20source_publishid", ((ss)localObject).hdj + ",");
    locald.m("21uxinfo", ((ss)localObject).hdi + ",");
    locald.m("22clienttime", bg.Pp() + ",");
    locald.m("23video_statu", ",");
    localObject = new StringBuilder();
    if (paramj.field_type == 16) {}
    for (int i = 1;; i = 2)
    {
      locald.m("24source_type", i + ",");
      locald.m("25scene", "5,");
      locald.m("26action_type", a.a(parama) + ",");
      locald.m("27scene_chatname", ",");
      locald.m("28scene_username", paramj.field_fromUser + ",");
      locald.m("29curr_publishid", ",");
      locald.m("30curr_msgid", "0,");
      locald.m("31curr_favid", paramj.field_id + ",");
      locald.m("32elapsed_time", "0,");
      locald.m("33load_time", "0,");
      locald.m("34is_load_complete", "0,");
      locald.m("35destination", "0,");
      locald.m("36chatroom_membercount", "0,");
      w.i("MicroMsg.FavVideoStatistic", "report snsad_video_action: " + locald.LL());
      ((c)h.h(c.class)).i(12990, new Object[] { locald });
      GMTrace.o(6274410348544L, 46748);
      return;
    }
  }
  
  public static void a(c paramc, j paramj, d paramd, int paramInt)
  {
    GMTrace.i(6274544566272L, 46749);
    if ((paramj.field_favProto.tQC == null) || (paramj.field_favProto.tQC.isEmpty()))
    {
      GMTrace.o(6274544566272L, 46749);
      return;
    }
    ss localss = ((sp)paramj.field_favProto.tQC.getFirst()).tPx;
    if (localss == null)
    {
      GMTrace.o(6274544566272L, 46749);
      return;
    }
    d locald = new d();
    locald.m("20source_publishid", localss.hdj + ",");
    locald.m("21uxinfo", localss.hdi + ",");
    locald.m("22clienttime", bg.Pp() + ",");
    locald.m("23video_statu", d.a(paramd) + ",");
    paramd = new StringBuilder();
    if (paramj.field_type == 16) {}
    for (int i = 1;; i = 2)
    {
      locald.m("24source_type", i + ",");
      locald.m("25scene", "5,");
      locald.m("26action_type", c.a(paramc) + ",");
      locald.m("27scene_chatname", ",");
      locald.m("28scene_username", paramj.field_fromUser + ",");
      locald.m("29curr_publishid", ",");
      locald.m("30curr_msgid", "0,");
      locald.m("31curr_favid", paramj.field_id + ",");
      locald.m("32chatroom_membercount", "0,");
      locald.m("33chatroom_toMemberCount", paramInt + ",");
      w.i("MicroMsg.FavVideoStatistic", "report snsad_video_spread: " + locald.LL());
      g.paX.i(12991, new Object[] { locald });
      GMTrace.o(6274544566272L, 46749);
      return;
    }
  }
  
  public static void j(j paramj)
  {
    GMTrace.i(6274276130816L, 46747);
    if ((paramj.field_favProto.tQC == null) || (paramj.field_favProto.tQC.isEmpty()))
    {
      GMTrace.o(6274276130816L, 46747);
      return;
    }
    sp localsp = (sp)paramj.field_favProto.tQC.getFirst();
    Object localObject = localsp.tPx;
    if (localObject == null)
    {
      GMTrace.o(6274276130816L, 46747);
      return;
    }
    d locald = new d();
    locald.m("20source_publishid", ((ss)localObject).hdj + ",");
    locald.m("21uxinfo", ((ss)localObject).hdi + ",");
    locald.m("22clienttime", bg.Pp() + ",");
    localObject = new StringBuilder();
    if (paramj.field_type == 16) {}
    for (int i = 1;; i = 2)
    {
      locald.m("23source_type", i + ",");
      locald.m("24scene", "5,");
      locald.m("25scene_chatname", ",");
      locald.m("26scene_username", paramj.field_fromUser + ",");
      locald.m("27curr_publishid", ",");
      locald.m("28curr_msgid", "0,");
      locald.m("29curr_favid", paramj.field_id + ",");
      locald.m("30isdownload", "0,");
      locald.m("31chatroom_membercount", "0,");
      ((i)h.h(i.class)).b(localsp.fMi, locald);
      w.i("MicroMsg.FavVideoStatistic", "report snsad_video_exposure: " + locald.LL());
      g.paX.i(12989, new Object[] { locald });
      GMTrace.o(6274276130816L, 46747);
      return;
    }
  }
  
  public static enum a
  {
    private int value;
    
    static
    {
      GMTrace.i(6281523888128L, 46801);
      lOW = new a("PlayIcon", 0, 1);
      lOX = new a("EnterFullScreen", 1, 2);
      lOY = new a("EnterCompleteVideo", 2, 3);
      lOZ = new a("DetailInVideo", 3, 4);
      lPa = new a("LeavelFullScreen", 4, 5);
      lPb = new a("LeaveCompleteVideo", 5, 6);
      lPc = new a("SightLoaded", 6, 7);
      lPd = new a[] { lOW, lOX, lOY, lOZ, lPa, lPb, lPc };
      GMTrace.o(6281523888128L, 46801);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(6281255452672L, 46799);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(6281255452672L, 46799);
    }
  }
  
  public static enum b
  {
    public int value;
    
    static
    {
      GMTrace.i(6303804030976L, 46967);
      lPe = new b("Sight", 0, 1);
      lPf = new b("AdUrl", 1, 2);
      lPg = new b("Chat", 2, 3);
      lPh = new b("TalkChat", 3, 4);
      lPi = new b("Fav", 4, 5);
      lPj = new b[] { lPe, lPf, lPg, lPh, lPi };
      GMTrace.o(6303804030976L, 46967);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(6303669813248L, 46966);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(6303669813248L, 46966);
    }
  }
  
  public static enum c
  {
    private int value;
    
    static
    {
      GMTrace.i(6271591776256L, 46727);
      lPk = new c("Chat", 0, 2);
      lPl = new c("Chatroom", 1, 3);
      lPm = new c("Sns", 2, 4);
      lPn = new c[] { lPk, lPl, lPm };
      GMTrace.o(6271591776256L, 46727);
    }
    
    private c(int paramInt)
    {
      GMTrace.i(6271323340800L, 46725);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(6271323340800L, 46725);
    }
  }
  
  public static enum d
  {
    private int value;
    
    static
    {
      GMTrace.i(6298301104128L, 46926);
      lPo = new d("Samll", 0, 1);
      lPp = new d("Full", 1, 2);
      lPq = new d("Complete", 2, 3);
      lPr = new d[] { lPo, lPp, lPq };
      GMTrace.o(6298301104128L, 46926);
    }
    
    private d(int paramInt)
    {
      GMTrace.i(6298032668672L, 46924);
      this.value = 0;
      this.value = paramInt;
      GMTrace.o(6298032668672L, 46924);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */