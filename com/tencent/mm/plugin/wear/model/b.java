package com.tencent.mm.plugin.wear.model;

import android.os.Looper;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ae.f;
import com.tencent.mm.g.a.st;
import com.tencent.mm.g.a.st.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.bqb;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import java.util.LinkedList;
import java.util.List;

public final class b
  implements com.tencent.mm.ac.e
{
  m.b mlf;
  public boolean shr;
  com.tencent.mm.sdk.b.c shs;
  aj sht;
  
  public b()
  {
    GMTrace.i(9208409882624L, 68608);
    this.shs = new com.tencent.mm.sdk.b.c() {};
    this.mlf = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(9179284635648L, 68391);
        if ((paramAnonymousObject == null) || (!(paramAnonymousObject instanceof String)))
        {
          w.d("MicroMsg.Wear.WearBizLogic", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousm, paramAnonymousObject });
          GMTrace.o(9179284635648L, 68391);
          return;
        }
        paramAnonymousm = (String)paramAnonymousObject;
        if ((paramAnonymousm != null) && (paramAnonymousm.equals("gh_43f2581f6fd6")))
        {
          if ((!b.bzp()) && (b.this.shr))
          {
            b.this.shr = false;
            GMTrace.o(9179284635648L, 68391);
            return;
          }
          if ((b.bzp()) && (!b.this.shr)) {
            b.this.connect();
          }
        }
        GMTrace.o(9179284635648L, 68391);
      }
    };
    this.sht = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(9180089942016L, 68397);
        b.a(a.bzo().shh.shy.sim);
        GMTrace.o(9180089942016L, 68397);
        return true;
      }
    }, true);
    com.tencent.mm.sdk.b.a.uLm.b(this.shs);
    ap.AS();
    com.tencent.mm.x.c.yL().a(this.mlf);
    GMTrace.o(9208409882624L, 68608);
  }
  
  static boolean JZ(String paramString)
  {
    GMTrace.i(9208812535808L, 68611);
    st localst = new st();
    localst.fRw.fvy = 3;
    localst.fRw.flE = paramString;
    localst.fRw.fxj = "gh_43f2581f6fd6";
    com.tencent.mm.sdk.b.a.uLm.m(localst);
    w.i("MicroMsg.Wear.WearBizLogic", "isRegister: %b", new Object[] { Boolean.valueOf(localst.fRw.fyM) });
    boolean bool = localst.fRw.fyM;
    GMTrace.o(9208812535808L, 68611);
    return bool;
  }
  
  public static void a(bqb parambqb)
  {
    GMTrace.i(9209080971264L, 68613);
    if (parambqb != null)
    {
      st localst = new st();
      localst.fRw.fvy = 6;
      localst.fRw.flE = parambqb.uFE;
      com.tencent.mm.sdk.b.a.uLm.m(localst);
      GMTrace.o(9209080971264L, 68613);
      return;
    }
    w.i("MicroMsg.Wear.WearBizLogic", "request is null");
    GMTrace.o(9209080971264L, 68613);
  }
  
  public static boolean bzp()
  {
    GMTrace.i(9208946753536L, 68612);
    ap.AS();
    boolean bool = com.tencent.mm.l.a.eE(com.tencent.mm.x.c.yL().SL("gh_43f2581f6fd6").field_type);
    GMTrace.o(9208946753536L, 68612);
    return bool;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9208678318080L, 68610);
    Object localObject;
    if ((paramk instanceof com.tencent.mm.plugin.wear.model.d.a))
    {
      ap.wT().b(1091, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.Wear.WearBizLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        GMTrace.o(9208678318080L, 68610);
        return;
      }
      paramk = (com.tencent.mm.plugin.wear.model.d.a)paramk;
      paramString = paramk.flE;
      paramk = paramk.fxj;
      localObject = new st();
      ((st)localObject).fRw.fvy = 1;
      ((st)localObject).fRw.flE = paramString;
      ((st)localObject).fRw.fxj = paramk;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(9208678318080L, 68610);
      return;
    }
    if ((paramk instanceof com.tencent.mm.pluginsdk.model.n))
    {
      ap.wT().b(30, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.Wear.WearBizLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        if ((paramInt1 == 4) && (paramInt2 == -24) && (!bg.mZ(paramString)))
        {
          Toast.makeText(ab.getContext(), paramString, 1).show();
          GMTrace.o(9208678318080L, 68610);
        }
      }
      else
      {
        localObject = ((com.tencent.mm.pluginsdk.model.n)paramk).bGn();
        w.i("MicroMsg.Wear.WearBizLogic", "bind fitness contact %s success", new Object[] { localObject });
        ap.AS();
        paramk = com.tencent.mm.x.c.yL().SL("gh_43f2581f6fd6");
        if ((paramk != null) && (!bg.mZ((String)localObject))) {
          break label376;
        }
        w.e("MicroMsg.Wear.WearBizLogic", "respUsername == " + (String)localObject + ", contact = " + paramk);
      }
    }
    for (;;)
    {
      paramString = com.tencent.mm.ae.x.FE().in(paramk.field_username);
      com.tencent.mm.ae.x.FE().e(paramString);
      ap.AS();
      com.tencent.mm.x.c.xi().set(327825, Boolean.valueOf(true));
      connect();
      GMTrace.o(9208678318080L, 68610);
      return;
      label376:
      paramString = null;
      if (o.fl(paramk.field_username))
      {
        String str = bg.mY(paramk.field_username);
        paramString = f.iv(str);
        if (paramString != null) {
          paramString.field_username = ((String)localObject);
        }
        com.tencent.mm.ae.x.FE().io(str);
        paramk.cm(str);
      }
      paramk.setUsername((String)localObject);
      if ((int)paramk.gLS == 0)
      {
        ap.AS();
        com.tencent.mm.x.c.yL().S(paramk);
      }
      if ((int)paramk.gLS <= 0)
      {
        w.e("MicroMsg.Wear.WearBizLogic", "addContact : insert contact failed");
      }
      else
      {
        o.p(paramk);
        ap.AS();
        localObject = com.tencent.mm.x.c.yL().SL(paramk.field_username);
        if (paramString != null)
        {
          com.tencent.mm.ae.x.FE().d(paramString);
        }
        else
        {
          paramString = f.iv(((af)localObject).field_username);
          if ((paramString == null) || (paramString.Ey()))
          {
            w.d("MicroMsg.Wear.WearBizLogic", "shouldUpdate");
            ag.a.hfr.J(((af)localObject).field_username, "");
            com.tencent.mm.ab.b.hC(((af)localObject).field_username);
          }
          else if (((com.tencent.mm.storage.x)localObject).bPK())
          {
            w.d("MicroMsg.Wear.WearBizLogic", "update contact, last check time=%d", new Object[] { Integer.valueOf(((af)localObject).gcd) });
            ag.a.hfr.J(((af)localObject).field_username, "");
            com.tencent.mm.ab.b.hC(((af)localObject).field_username);
          }
        }
      }
    }
  }
  
  public final void connect()
  {
    GMTrace.i(9208544100352L, 68609);
    Object localObject = a.bzo().shh.shy.sim;
    if (localObject == null)
    {
      w.e("MicroMsg.Wear.WearBizLogic", "get connect wear data error");
      GMTrace.o(9208544100352L, 68609);
      return;
    }
    if (!bzp())
    {
      ap.AS();
      boolean bool = ((Boolean)com.tencent.mm.x.c.xi().get(327825, Boolean.valueOf(false))).booleanValue();
      w.i("MicroMsg.Wear.WearBizLogic", "auto focus biz contact %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        if (bg.Jt())
        {
          w.i("MicroMsg.Wear.WearBizLogic", "oversea user, forbid biz auto focus logic");
          GMTrace.o(9208544100352L, 68609);
          return;
        }
        a.bzo().shn.a(new a());
        a.bzo().shn.a(new b((bqb)localObject));
      }
      GMTrace.o(9208544100352L, 68609);
      return;
    }
    if (!JZ(((bqb)localObject).uFE))
    {
      w.i("MicroMsg.Wear.WearBizLogic", "start to register device %s", new Object[] { ((bqb)localObject).uFE });
      a.bzo().shn.a(new b((bqb)localObject));
      GMTrace.o(9208544100352L, 68609);
      return;
    }
    if (!this.shr)
    {
      w.i("MicroMsg.Wear.WearBizLogic", "start to auth device %s", new Object[] { ((bqb)localObject).uFE });
      localObject = ((bqb)localObject).uFE;
      if ((!this.shr) && (JZ((String)localObject)))
      {
        w.i("MicroMsg.Wear.WearBizLogic", "auth device, deviceId=%s | deviceType=%s", new Object[] { localObject, "gh_43f2581f6fd6" });
        st localst = new st();
        localst.fRw.fvy = 7;
        localst.fRw.flE = ((String)localObject);
        localst.fRw.fxj = "gh_43f2581f6fd6";
        com.tencent.mm.sdk.b.a.uLm.m(localst);
      }
      GMTrace.o(9208544100352L, 68609);
      return;
    }
    if (this.sht.bNt())
    {
      w.i("MicroMsg.Wear.WearBizLogic", "start step count timer");
      this.sht.w(3600000L, 3600000L);
    }
    for (;;)
    {
      a((bqb)localObject);
      GMTrace.o(9208544100352L, 68609);
      return;
      w.i("MicroMsg.Wear.WearBizLogic", "stop timer and restart step count timer");
      this.sht.MM();
      this.sht.w(3600000L, 3600000L);
    }
  }
  
  private final class a
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    public a()
    {
      GMTrace.i(9209617842176L, 68617);
      GMTrace.o(9209617842176L, 68617);
    }
    
    public final void execute()
    {
      GMTrace.i(9209752059904L, 68618);
      ap.wT().a(30, b.this);
      Object localObject = new LinkedList();
      ((LinkedList)localObject).add("gh_43f2581f6fd6");
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(Integer.valueOf(1));
      localObject = new com.tencent.mm.pluginsdk.model.n(1, (List)localObject, localLinkedList, "", "");
      ap.wT().a((k)localObject, 0);
      GMTrace.o(9209752059904L, 68618);
    }
    
    public final String getName()
    {
      GMTrace.i(9209886277632L, 68619);
      GMTrace.o(9209886277632L, 68619);
      return "AddContactTask";
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    private bqb shv;
    
    public b(bqb parambqb)
    {
      GMTrace.i(9178747764736L, 68387);
      this.shv = parambqb;
      GMTrace.o(9178747764736L, 68387);
    }
    
    public final void execute()
    {
      GMTrace.i(9178881982464L, 68388);
      ap.wT().a(1091, b.this);
      com.tencent.mm.plugin.wear.model.d.a locala = new com.tencent.mm.plugin.wear.model.d.a(this.shv.uFE, "gh_43f2581f6fd6");
      ap.wT().a(locala, 0);
      GMTrace.o(9178881982464L, 68388);
    }
    
    public final String getName()
    {
      GMTrace.i(9179016200192L, 68389);
      GMTrace.o(9179016200192L, 68389);
      return "RegisterDeviceTask";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */