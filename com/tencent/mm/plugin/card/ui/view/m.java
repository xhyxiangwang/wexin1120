package com.tencent.mm.plugin.card.ui.view;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.b.q;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.i;
import com.tencent.mm.plugin.card.model.j;
import com.tencent.mm.plugin.card.model.k;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.pb.common.c.h;

public final class m
  extends g
{
  public m()
  {
    GMTrace.i(18885776506880L, 140710);
    GMTrace.o(18885776506880L, 140710);
  }
  
  public final aa amg()
  {
    GMTrace.i(18943892783104L, 141143);
    n localn = new n(this, this.jFp);
    GMTrace.o(18943892783104L, 141143);
    return localn;
  }
  
  public final aa amh()
  {
    GMTrace.i(18944027000832L, 141144);
    f localf = new f(this, this.jFp);
    GMTrace.o(18944027000832L, 141144);
    return localf;
  }
  
  public final aa ami()
  {
    GMTrace.i(18944161218560L, 141145);
    t localt = new t(this, this.jFp);
    GMTrace.o(18944161218560L, 141145);
    return localt;
  }
  
  public final String e(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18886044942336L, 140712);
    w.i("MicroMsg.CarDynamicCodeView", "code from dynamic offline");
    com.tencent.mm.plugin.card.a.g localg = al.ajS();
    Object localObject2 = this.kmJ;
    Object localObject1 = "";
    if (localObject2 == null)
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "get code is failure! cardInfo is null");
      paramc = (com.tencent.mm.plugin.card.b.c)localObject1;
    }
    for (;;)
    {
      GMTrace.o(18886044942336L, 140712);
      return paramc;
      localg.ajb();
      localg.kmQ = paramc;
      Object localObject3 = ((b)localObject2).aiO();
      localObject1 = al.ajQ().gMB.rawQuery("select count(1) from CardQrCodeDataInfo where card_id =? AND status=0", new String[] { localObject3 });
      int i;
      if (localObject1 != null)
      {
        ((Cursor)localObject1).moveToFirst();
        i = ((Cursor)localObject1).getInt(0);
        ((Cursor)localObject1).close();
        if (i != 0) {
          break label178;
        }
        w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！db is empty!");
        i = 0;
      }
      for (;;)
      {
        if (i != 0) {
          break label279;
        }
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！ request doNetSceneGetDynamicQrcode!");
        localg.a((b)localObject2, q.kAZ);
        GMTrace.o(18886044942336L, 140712);
        return "";
        i = 0;
        break;
        label178:
        localObject1 = al.ajR().tC((String)localObject3);
        if (localObject1 != null)
        {
          if (com.tencent.mm.plugin.card.a.g.a((i)localObject1))
          {
            localg.kmQ = com.tencent.mm.plugin.card.b.c.kAC;
            i = 0;
            continue;
          }
          if ((i < ((i)localObject1).field_lower_bound) && (com.tencent.mm.plugin.card.b.l.isNetworkAvailable(ab.getContext())))
          {
            w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "can not getFrom db！ currentCodeSize < lower_bound,currentCodeSize =%d,lower_bound=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((i)localObject1).field_lower_bound) });
            localg.kmQ = com.tencent.mm.plugin.card.b.c.kAI;
            i = 0;
            continue;
          }
        }
        i = 1;
      }
      label279:
      localObject1 = al.ajQ().tE(((b)localObject2).aiO());
      if (localObject1 == null)
      {
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get code is failure! db is  empty! doNetSceneGetDynamicQrcode! cardId= %s", new Object[] { ((b)localObject2).aiO() });
        localg.a((b)localObject2, q.kAZ);
        GMTrace.o(18886044942336L, 140712);
        return "";
      }
      k localk = al.ajQ().tF((String)localObject3);
      if ((localk != null) && (al.ajQ().bv((String)localObject3, localk.field_code_id))) {
        localg.a((String)localObject3, localk.field_code_id, paramc);
      }
      localg.kmR = 0;
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "update current code showing! newQrCodeData cardId= %s,codeId=%s，refreshReason=%d", new Object[] { localObject3, ((k)localObject1).field_code_id, Integer.valueOf(paramc.action) });
      localObject3 = ((b)localObject2).aiO();
      if (localObject1 == null) {
        paramc = "";
      }
      while (h.xJ(paramc))
      {
        localg.F(1, "");
        GMTrace.o(18886044942336L, 140712);
        return "";
        paramc = com.tencent.mm.plugin.card.b.e.bB((String)localObject3, ((k)localObject1).field_code);
        localObject3 = al.ajR().tC((String)localObject3);
        if ((localObject3 != null) && (!h.xJ(paramc)) && (((i)localObject3).field_need_insert_show_timestamp) && (!h.xJ(((i)localObject3).field_show_timestamp_encrypt_key)))
        {
          w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData is need insert show timestamp! code signTimestamp!");
          paramc = com.tencent.mm.plugin.card.b.e.bD(paramc, ((i)localObject3).field_show_timestamp_encrypt_key);
        }
        else
        {
          w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData only decrypt qrcode!");
        }
      }
      ((k)localObject1).field_status = 1;
      if (!al.ajQ().c((com.tencent.mm.sdk.e.c)localObject1, new String[] { "card_id", "code_id" })) {
        w.e("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  failure! card_id = %s, code_id = %s ,status = %d", new Object[] { ((k)localObject1).field_card_id, ((k)localObject1).field_code_id, Integer.valueOf(((k)localObject1).field_status) });
      }
      for (;;)
      {
        localObject1 = al.ajS();
        localObject2 = ((b)localObject2).aiO();
        localObject2 = al.ajR().tC((String)localObject2);
        if (localObject2 != null) {
          break label707;
        }
        w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRequestCodeTimer failure! CardQrCodeConfi is null!");
        break;
        w.i("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  success! card_id = %s, code_id = %s ,status = %d", new Object[] { ((k)localObject1).field_card_id, ((k)localObject1).field_code_id, Integer.valueOf(((k)localObject1).field_status) });
      }
      label707:
      long l = ((i)localObject2).field_show_expire_interval * 1000;
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRefreshCodeTimer refreshTime: " + l);
      ((com.tencent.mm.plugin.card.a.g)localObject1).kmS.w(l, l);
    }
  }
  
  public final boolean h(b paramb)
  {
    GMTrace.i(18885910724608L, 140711);
    if (this.kmJ == null)
    {
      w.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      GMTrace.o(18885910724608L, 140711);
      return true;
    }
    if (paramb == null)
    {
      w.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
      GMTrace.o(18885910724608L, 140711);
      return false;
    }
    if (this.kmJ.aiL().tEI != paramb.aiL().tEI)
    {
      w.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain is_commom_card is different！");
      GMTrace.o(18885910724608L, 140711);
      return true;
    }
    nc localnc1 = this.kmJ.aiL().tEH;
    nc localnc2 = paramb.aiL().tEH;
    if (((localnc1 == null) && (localnc2 != null)) || ((localnc1 != null) && (localnc2 == null)))
    {
      w.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field is different！");
      GMTrace.o(18885910724608L, 140711);
      return true;
    }
    if ((localnc1 != null) && (localnc2 != null) && (localnc1.title != null) && (localnc2.title != null) && (localnc1.title.equals(localnc2.title)))
    {
      w.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field title is different！");
      GMTrace.o(18885910724608L, 140711);
      return true;
    }
    localnc1 = this.kmJ.aiK().tFA;
    paramb = paramb.aiK().tFA;
    if (((localnc1 == null) && (paramb != null)) || ((localnc1 != null) && (paramb == null)))
    {
      w.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
      GMTrace.o(18885910724608L, 140711);
      return true;
    }
    if ((localnc1 != null) && (paramb != null) && (localnc1.title != null) && (paramb.title != null) && (!localnc1.title.equals(paramb.title)))
    {
      w.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
      GMTrace.o(18885910724608L, 140711);
      return true;
    }
    if ((localnc1 != null) && (paramb != null) && (localnc1.knt != null) && (paramb.knt != null) && (!localnc1.knt.equals(paramb.knt)))
    {
      w.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
      GMTrace.o(18885910724608L, 140711);
      return true;
    }
    GMTrace.o(18885910724608L, 140711);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */