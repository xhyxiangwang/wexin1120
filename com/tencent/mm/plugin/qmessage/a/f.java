package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import java.util.Map;
import junit.framework.Assert;

public final class f
  implements com.tencent.mm.ac.d
{
  public f()
  {
    GMTrace.i(8941987692544L, 66623);
    GMTrace.o(8941987692544L, 66623);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(8942121910272L, 66624);
    bu localbu = parama.hme;
    if (localbu == null)
    {
      w.e("MicroMsg.QMsgExtension", "onPreAddMessage cmdAM is null");
      GMTrace.o(8942121910272L, 66624);
      return null;
    }
    if ((localbu.mDF != 36) && (localbu.mDF != 39))
    {
      w.e("MicroMsg.QMsgExtension", "onPreAddMessage cmdAM.type:%d", new Object[] { Integer.valueOf(localbu.mDF) });
      GMTrace.o(8942121910272L, 66624);
      return null;
    }
    Object localObject2 = com.tencent.mm.platformtools.n.a(localbu.tvq);
    String str1 = com.tencent.mm.platformtools.n.a(localbu.tvo);
    Object localObject1 = com.tencent.mm.platformtools.n.a(localbu.tvp);
    w.d("MicroMsg.QMsgExtension", "parseQMsg content:" + (String)localObject2);
    ap.AS();
    String str2 = (String)com.tencent.mm.x.c.xi().get(2, null);
    au localau;
    if (str2.equals(str1))
    {
      ap.AS();
      localau = com.tencent.mm.x.c.yN().A((String)localObject1, localbu.tvv);
      w.d("MicroMsg.QMsgExtension", "dkmsgid parseQMsg svrid:%d localid:%d", new Object[] { Long.valueOf(localbu.tvv), Long.valueOf(localau.field_msgId) });
      if ((localau.field_msgId != 0L) && (localau.field_createTime + 604800000L < ay.i(str1, localbu.orU)))
      {
        w.w("MicroMsg.QMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(localbu.tvv), Long.valueOf(localau.field_msgId) });
        ay.P(localau.field_msgId);
        localau.B(0L);
      }
      if (localau.field_msgId != 0L) {
        break label1117;
      }
      localau = new au();
      localau.C(localbu.tvv);
      localau.D(ay.i(str1, localbu.orU));
    }
    label632:
    label654:
    label786:
    label806:
    label832:
    label861:
    label877:
    label990:
    label996:
    label1012:
    label1022:
    label1045:
    label1050:
    label1079:
    label1112:
    label1117:
    for (;;)
    {
      localau.setType(localbu.mDF);
      localau.cW((String)localObject1);
      Object localObject3 = g.aWG().Eb((String)localObject1);
      if ((localObject3 == null) || (bg.mY(((d)localObject3).getUsername()).length() <= 0))
      {
        localObject3 = new d();
        ((d)localObject3).username = ((String)localObject1);
        ((d)localObject3).oEe = 1;
        ((d)localObject3).fJg = 9;
        if (!g.aWG().a((d)localObject3)) {
          w.e("MicroMsg.QMsgExtension", "parseQMsg : insert QContact failed : username = " + ((d)localObject3).getUsername());
        }
      }
      long l2 = -1L;
      long l1 = l2;
      if (localbu.tvr == 2)
      {
        l1 = l2;
        if (localau.field_msgId == 0L)
        {
          localObject1 = com.tencent.mm.platformtools.n.a(localbu.tvs);
          localObject3 = new PString();
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          com.tencent.mm.an.f localf = com.tencent.mm.an.n.IW();
          i = localbu.tvr;
          l2 = localf.a((byte[])localObject1, localbu.tvv, false, "", (PString)localObject3, localPInt1, localPInt2);
          l1 = l2;
          if (l2 > 0L)
          {
            localau.cX(((PString)localObject3).value);
            localau.dN(localPInt1.value);
            localau.dO(localPInt2.value);
            l1 = l2;
          }
        }
      }
      boolean bool;
      if (localbu.mDF == 36)
      {
        Assert.assertTrue(true);
        if (bg.mY((String)localObject2).length() <= 0) {
          break label990;
        }
        bool = true;
        Assert.assertTrue(bool);
        if (bg.mY(localau.field_talker).length() <= 0) {
          break label996;
        }
        bool = true;
        Assert.assertTrue(bool);
        ap.AS();
        localObject1 = com.tencent.mm.x.c.yL().SL(localau.field_talker);
        if ((localObject1 != null) && (bg.mY(((af)localObject1).field_username).length() > 0)) {
          break label1112;
        }
        localObject1 = new x(localau.field_talker);
      }
      for (int i = 1;; i = 0)
      {
        localObject3 = new a();
        localObject2 = bh.p((String)localObject2, "msg");
        if (localObject2 != null)
        {
          ((a)localObject3).gEW = ((String)((Map)localObject2).get(".msg.from.displayname"));
          ((a)localObject3).content = ((String)((Map)localObject2).get(".msg.content.t"));
        }
        if (((a)localObject3).gEW == null)
        {
          localObject2 = "";
          ((x)localObject1).ce((String)localObject2);
          if (((a)localObject3).content != null) {
            break label1012;
          }
          localObject2 = "";
          localau.setContent((String)localObject2);
          if (i == 0) {
            break label1022;
          }
          ap.AS();
          com.tencent.mm.x.c.yL().R((x)localObject1);
          ap.AS();
          if ((!com.tencent.mm.x.c.yT().has(str1)) && (!str2.equals(str1))) {
            break label1045;
          }
          i = 1;
          if (i == 0) {
            break label1050;
          }
          localau.dC(1);
          i = localbu.jXo;
          localau.dB(i);
          localau.dc(localbu.tvt);
          ay.a(localau, parama);
          if (localau.field_msgId != 0L) {
            break label1079;
          }
          localau.B(ay.i(localau));
          if (localbu.tvr == 2)
          {
            parama = com.tencent.mm.an.n.IW().b(Long.valueOf(l1));
            parama.al((int)localau.field_msgId);
            com.tencent.mm.an.n.IW().a(Long.valueOf(l1), parama);
          }
        }
        for (parama = new d.b(localau, true);; parama = new d.b(localau, false))
        {
          GMTrace.o(8942121910272L, 66624);
          return parama;
          localObject1 = str1;
          break;
          bool = false;
          break label632;
          bool = false;
          break label654;
          localObject2 = ((a)localObject3).gEW;
          break label786;
          localObject2 = ((a)localObject3).content;
          break label806;
          ap.AS();
          com.tencent.mm.x.c.yL().a(((af)localObject1).field_username, (x)localObject1);
          break label832;
          i = 0;
          break label861;
          localau.dC(0);
          if (localbu.jXo > 3)
          {
            i = localbu.jXo;
            break label877;
          }
          i = 3;
          break label877;
          ap.AS();
          com.tencent.mm.x.c.yN().b(localbu.tvv, localau);
        }
      }
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(8942256128000L, 66625);
    com.tencent.mm.an.n.IW().o(paramau);
    GMTrace.o(8942256128000L, 66625);
  }
  
  public static final class a
  {
    String content;
    String gEW;
    
    public a()
    {
      GMTrace.i(8940779732992L, 66614);
      this.gEW = "";
      this.content = "";
      GMTrace.o(8940779732992L, 66614);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */