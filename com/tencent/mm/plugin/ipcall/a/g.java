package com.tencent.mm.plugin.ipcall.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.network.m;
import com.tencent.mm.network.m.a;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.b.a;
import com.tencent.mm.plugin.ipcall.a.c.b;
import com.tencent.mm.plugin.ipcall.a.d.o;
import com.tencent.mm.plugin.ipcall.a.f.e;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.c.atd;
import com.tencent.mm.protocal.c.ath;
import com.tencent.mm.protocal.c.atj;
import com.tencent.mm.protocal.c.atk;
import com.tencent.mm.protocal.c.atl;
import com.tencent.mm.protocal.c.atm;
import com.tencent.mm.protocal.c.atn;
import com.tencent.mm.protocal.c.atq;
import com.tencent.mm.protocal.c.ats;
import com.tencent.mm.protocal.c.att;
import com.tencent.mm.protocal.c.atu;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.bmf;
import com.tencent.mm.protocal.c.eo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
  implements a.a, b.a
{
  public boolean fJI;
  public boolean mWA;
  m mWB;
  public int mWk;
  public int mWl;
  public int mWm;
  public boolean mWn;
  public boolean mWo;
  public a mWp;
  public com.tencent.mm.plugin.ipcall.a.f.d mWq;
  com.tencent.mm.plugin.ipcall.a.f.i mWr;
  com.tencent.mm.plugin.ipcall.a.f.a mWs;
  com.tencent.mm.plugin.ipcall.a.f.h mWt;
  com.tencent.mm.plugin.ipcall.a.f.c mWu;
  public e mWv;
  com.tencent.mm.plugin.ipcall.a.f.g mWw;
  public com.tencent.mm.plugin.ipcall.a.f.f mWx;
  public com.tencent.mm.plugin.ipcall.a.a.c mWy;
  public boolean mWz;
  
  public g()
  {
    GMTrace.i(11589298159616L, 86347);
    this.mWk = 0;
    this.mWl = 0;
    this.mWm = 0;
    this.mWn = false;
    this.mWo = false;
    this.mWz = false;
    this.fJI = false;
    this.mWA = false;
    this.mWB = new m.a()
    {
      public final void db(int paramAnonymousInt)
      {
        int i = 0;
        GMTrace.i(11589163941888L, 86346);
        w.i("MicroMsg.IPCallSvrLogic", "onNetworkChange, st: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (i.aHm().mYs)
        {
          f localf = i.aHp();
          if ((localf.mWi == 4) || (localf.mWi == 5)) {
            i = 1;
          }
          if ((i != 0) && (paramAnonymousInt == 4) && (g.this.mWx != null)) {
            g.this.mWx.a(g.this.mWy);
          }
        }
        GMTrace.o(11589163941888L, 86346);
      }
    };
    this.mWq = new com.tencent.mm.plugin.ipcall.a.f.d();
    this.mWr = new com.tencent.mm.plugin.ipcall.a.f.i();
    this.mWs = new com.tencent.mm.plugin.ipcall.a.f.a();
    this.mWt = new com.tencent.mm.plugin.ipcall.a.f.h();
    this.mWu = new com.tencent.mm.plugin.ipcall.a.f.c();
    this.mWv = new e();
    this.mWw = new com.tencent.mm.plugin.ipcall.a.f.g();
    this.mWx = new com.tencent.mm.plugin.ipcall.a.f.f();
    GMTrace.o(11589298159616L, 86347);
  }
  
  private boolean c(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    GMTrace.i(11591311425536L, 86362);
    if ((this.mWy == null) || (paramObject == null))
    {
      w.e("MicroMsg.IPCallSvrLogic", "callInfo = null or result = null");
      GMTrace.o(11591311425536L, 86362);
      return true;
    }
    Object localObject1;
    label503:
    label635:
    label693:
    label874:
    label1474:
    label1563:
    Object localObject2;
    switch (paramInt1)
    {
    case 7: 
    default: 
    case 1: 
    case 3: 
    case 4: 
    case 8: 
      do
      {
        for (;;)
        {
          GMTrace.o(11591311425536L, 86362);
          return false;
          if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.i))
          {
            w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited result error");
            GMTrace.o(11591311425536L, 86362);
            return true;
          }
          localObject1 = (com.tencent.mm.plugin.ipcall.a.d.i)paramObject;
          paramObject = ((com.tencent.mm.plugin.ipcall.a.d.i)localObject1).mZp;
          if (this.mWy.mXj != ((com.tencent.mm.plugin.ipcall.a.d.i)localObject1).mZo.uoK)
          {
            w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", new Object[] { Integer.valueOf(this.mWy.mXj), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.i)localObject1).mZo.uoK) });
            GMTrace.o(11591311425536L, 86362);
            return true;
          }
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished invite id:%d", new Object[] { Integer.valueOf(this.mWy.mXj) });
          localObject1 = i.aHn();
          paramInt1 = this.mWy.mXj;
          if (((b)localObject1).mXj == paramInt1)
          {
            w.d("MicroMsg.IPCallReportHelper", "setInviteCgiRet: %d", new Object[] { Integer.valueOf(paramInt3) });
            ((b)localObject1).mYH = paramInt3;
          }
          if ((paramInt2 == 0) && (paramInt3 == 0))
          {
            if (this.mWy != null)
            {
              this.mWy.mXg = ((atk)paramObject).tNa;
              this.mWy.mXh = ((atk)paramObject).tNb;
              this.mWy.mXi = ((atk)paramObject).uoM;
              this.mWy.mXo = ((atk)paramObject).uoV;
              this.mWy.mXq = (((atk)paramObject).uoW * 1000);
              this.mWy.mXx = ((atk)paramObject).mXx;
              this.mWy.mXy = ((atk)paramObject).mXy;
              this.mWy.jOo = ((atk)paramObject).tyd;
              this.mWy.mXE = ((atk)paramObject).uoX;
              this.mWy.mXJ = ((atk)paramObject).uoY;
              if (((atk)paramObject).mXF > 0) {
                this.mWy.mXF = ((atk)paramObject).mXF;
              }
              this.mWy.mXz = ((atk)paramObject).mXz;
              this.mWy.mXA = ((atk)paramObject).mXA;
              this.mWy.mXw = ((atk)paramObject).upa;
              if (((atk)paramObject).mXC > 0)
              {
                this.mWy.mXC = (((atk)paramObject).mXC - 1);
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got encryptStrategy[" + this.mWy.mXC + "] from Invite resp");
                this.mWy.mXD = ((atk)paramObject).uoZ;
                w.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo NextInvite:%d", new Object[] { Integer.valueOf(((atk)paramObject).mXr) });
                if (((atk)paramObject).mXr <= 0) {
                  break label635;
                }
                this.mWy.mXv = false;
              }
              for (this.mWy.mXr = ((atk)paramObject).mXr;; this.mWy.mXr = 0)
              {
                this.mWy.mXn = ((atk)paramObject).mXn;
                this.mWy.mXm = ((atk)paramObject).mXm;
                this.mWy.lpk = paramInt3;
                this.mWy.lpl = bg.mY(com.tencent.mm.platformtools.n.a(((atk)paramObject).urV.tyS));
                break;
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got no encryptStrategy from Invite resp");
                this.mWy.mXC = 2;
                break label503;
                this.mWy.mXv = true;
              }
            }
          }
          else
          {
            w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invite failed");
            if (((atk)paramObject).urV != null)
            {
              if (paramInt3 == 433)
              {
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo account overdue");
                this.mWy.mXs = true;
                if (((atk)paramObject).mXr <= 0) {
                  break label874;
                }
                this.mWy.mXv = false;
              }
              for (this.mWy.mXr = ((atk)paramObject).mXr;; this.mWy.mXr = 0)
              {
                this.mWy.mXn = ((atk)paramObject).mXn;
                this.mWy.mXm = ((atk)paramObject).mXm;
                this.mWy.lpk = paramInt3;
                if (((axk)paramObject).urV == null) {
                  break;
                }
                this.mWy.lpl = bg.mY(com.tencent.mm.platformtools.n.a(((atk)paramObject).urV.tyS));
                w.d("MicroMsg.IPCallSvrLogic", "ErrLevel:%d,ErrCode:%d,ErrMsg:%s", new Object[] { Integer.valueOf(((atk)paramObject).mXm), Integer.valueOf(paramInt3), this.mWy.lpl });
                break;
                if (paramInt3 == 434)
                {
                  w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo restrict call");
                  this.mWy.mXt = true;
                  break label693;
                }
                if (paramInt3 != 435) {
                  break label693;
                }
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo phonenumber invalid");
                this.mWy.mXu = true;
                break label693;
                this.mWy.mXv = true;
              }
            }
            this.mWy.mXn = "";
            this.mWy.mXm = 2;
            this.mWy.lpl = ab.getContext().getString(R.l.dEr);
            this.mWy.lpk = paramInt3;
            continue;
            if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.a))
            {
              w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel result error");
              GMTrace.o(11591311425536L, 86362);
              return true;
            }
            w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
            paramObject = (com.tencent.mm.plugin.ipcall.a.d.a)paramObject;
            if (this.mWy.mXj != ((com.tencent.mm.plugin.ipcall.a.d.a)paramObject).mYX.uoK)
            {
              w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", new Object[] { Integer.valueOf(this.mWy.mXj), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.a)paramObject).mYX.uoK) });
              GMTrace.o(11591311425536L, 86362);
              return true;
              if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.n))
              {
                w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown result error");
                GMTrace.o(11591311425536L, 86362);
                return true;
              }
              paramObject = (com.tencent.mm.plugin.ipcall.a.d.n)paramObject;
              if (this.mWy.mXg != ((com.tencent.mm.plugin.ipcall.a.d.n)paramObject).mZy.tNa)
              {
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.mWy.mXg), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.n)paramObject).mZy.tNa) });
                GMTrace.o(11591311425536L, 86362);
                return true;
              }
              if ((paramInt2 == 0) && (paramInt3 == 0))
              {
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown success!");
                this.mWy.iVw = 5;
              }
              else
              {
                w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown failed");
              }
            }
          }
        }
        if (!(paramObject instanceof atl))
        {
          w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify result error");
          GMTrace.o(11591311425536L, 86362);
          return true;
        }
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify finished");
        paramObject = (atl)paramObject;
        if (this.mWy.mXg != ((atl)paramObject).tNa)
        {
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.mWy.mXg), Integer.valueOf(((atl)paramObject).tNa) });
          GMTrace.o(11591311425536L, 86362);
          return true;
        }
      } while ((paramInt2 != 0) || (paramInt3 != 0));
      this.mWy.mXB = ((atl)paramObject).mXB;
      w.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo updateNotifyCallInfo, UserStatuslist.size: %d", new Object[] { Integer.valueOf(((atl)paramObject).upb.size()) });
      paramObject = ((atl)paramObject).upb.iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject1 = (atu)((Iterator)paramObject).next();
        if (this.mWy.mXo != ((atu)localObject1).upk) {
          break label1563;
        }
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update self userStatus, memberId: %d, status: %d, syncKey: %d", new Object[] { Integer.valueOf(this.mWy.mXo), Integer.valueOf(((atu)localObject1).unP), Integer.valueOf(((atu)localObject1).upl) });
        if (((atu)localObject1).upl > this.mWy.mXp)
        {
          this.mWy.mXp = ((atu)localObject1).upl;
          if (((atu)localObject1).unP != 0) {
            this.mWy.iVw = ((atu)localObject1).unP;
          }
        }
        if ((((atu)localObject1).lpk == 404) || (((atu)localObject1).lpk == 484))
        {
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify phonenumber invalid");
          this.mWy.mXu = true;
        }
        this.mWy.lpl = ((atu)localObject1).lpl;
        this.mWy.lpk = ((atu)localObject1).lpk;
        this.mWy.mXm = ((atu)localObject1).mXm;
        this.mWy.mXn = ((atu)localObject1).mXn;
      }
      w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update others userStatus, memberId: %d, status: %d, syncKey: %d", new Object[] { Integer.valueOf(((atu)localObject1).upk), Integer.valueOf(((atu)localObject1).unP), Integer.valueOf(((atu)localObject1).upl) });
      paramInt1 = 0;
      localObject2 = this.mWy.mXG.iterator();
      label1622:
      if (((Iterator)localObject2).hasNext())
      {
        com.tencent.mm.plugin.ipcall.a.a.d locald = (com.tencent.mm.plugin.ipcall.a.a.d)((Iterator)localObject2).next();
        if (locald.mXM != ((atu)localObject1).upk) {
          break label2577;
        }
        if (((atu)localObject1).upl > locald.mXp)
        {
          locald.mXp = ((atu)localObject1).upl;
          if (((atu)localObject1).unP != 0) {
            locald.gQy = ((atu)localObject1).unP;
          }
        }
        paramInt1 = 1;
      }
      break;
    }
    label2204:
    label2320:
    label2574:
    label2575:
    label2577:
    for (;;)
    {
      break label1622;
      if (paramInt1 != 0) {
        break label1474;
      }
      localObject2 = new com.tencent.mm.plugin.ipcall.a.a.d();
      ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mXM = ((atu)localObject1).upk;
      ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).gQy = ((atu)localObject1).unP;
      ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mXp = ((atu)localObject1).upl;
      this.mWy.mXG.add(localObject2);
      break label1474;
      if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.k))
      {
        w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect result error");
        GMTrace.o(11591311425536L, 86362);
        return true;
      }
      paramObject = (com.tencent.mm.plugin.ipcall.a.d.k)paramObject;
      localObject1 = ((com.tencent.mm.plugin.ipcall.a.d.k)paramObject).mZt;
      if (this.mWy.mXg != ((com.tencent.mm.plugin.ipcall.a.d.k)paramObject).mZs.tNa)
      {
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.mWy.mXg), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.k)paramObject).mZs.tNa) });
        GMTrace.o(11591311425536L, 86362);
        return true;
      }
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect success");
        this.mWy.jOo = ((atn)localObject1).tyd;
        this.mWy.mXE = ((atn)localObject1).uoX;
        break;
      }
      w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect failed");
      break;
      if (!(paramObject instanceof o))
      {
        w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync result error");
        GMTrace.o(11591311425536L, 86362);
        return true;
      }
      w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      localObject1 = (o)paramObject;
      paramObject = ((o)localObject1).mZB;
      if (this.mWy.mXg != ((o)localObject1).mZA.tNa)
      {
        w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.mWy.mXg), Integer.valueOf(((o)localObject1).mZA.tNa) });
        GMTrace.o(11591311425536L, 86362);
        return true;
      }
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        break;
      }
      w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync roomId: %d, status: %d, memberId: %d, syncKey: %d", new Object[] { Integer.valueOf(((att)paramObject).tNa), Integer.valueOf(((att)paramObject).upj), Integer.valueOf(((att)paramObject).upk), Integer.valueOf(((att)paramObject).uph) });
      if ((((att)paramObject).tNa != this.mWy.mXg) || (((att)paramObject).tNb != this.mWy.mXh)) {
        break;
      }
      if (((att)paramObject).upk == this.mWy.mXo)
      {
        w.d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync update self status");
        if (((att)paramObject).uph > this.mWy.mXp)
        {
          this.mWy.mXp = ((att)paramObject).uph;
          if (((att)paramObject).upj != 0) {
            this.mWy.iVw = ((att)paramObject).upj;
          }
        }
      }
      for (;;)
      {
        if ((((att)paramObject).lpk == 404) || (((att)paramObject).lpk == 484))
        {
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync phonenumber invalid");
          this.mWy.mXu = true;
        }
        this.mWy.lpl = ((att)paramObject).lpl;
        this.mWy.lpk = ((att)paramObject).lpk;
        this.mWy.mXm = ((att)paramObject).mXm;
        this.mWy.mXn = ((att)paramObject).mXn;
        this.mWy.mXB = ((att)paramObject).mXB;
        break;
        w.d("MicroMsg.IPCallSvrLogic", " handleServiceResultCallInfosync update others status");
        localObject1 = this.mWy.mXG.iterator();
        paramInt1 = 0;
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.tencent.mm.plugin.ipcall.a.a.d)((Iterator)localObject1).next();
          if (((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mXM != ((att)paramObject).upk) {
            break label2574;
          }
          if (((att)paramObject).uph > ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mXp)
          {
            ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).mXp = ((att)paramObject).uph;
            if (((att)paramObject).upj != 0) {
              ((com.tencent.mm.plugin.ipcall.a.a.d)localObject2).gQy = ((att)paramObject).upj;
            }
          }
          paramInt1 = 1;
        }
        for (;;)
        {
          break label2320;
          if (paramInt1 != 0) {
            break label2575;
          }
          localObject1 = new com.tencent.mm.plugin.ipcall.a.a.d();
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject1).mXM = ((att)paramObject).upk;
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject1).gQy = ((att)paramObject).upj;
          ((com.tencent.mm.plugin.ipcall.a.a.d)localObject1).mXp = ((att)paramObject).uph;
          this.mWy.mXG.add(localObject1);
          break label2204;
          if (!(paramObject instanceof com.tencent.mm.plugin.ipcall.a.d.h))
          {
            w.e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat result error");
            GMTrace.o(11591311425536L, 86362);
            return true;
          }
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished errType:%d,errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          paramObject = (com.tencent.mm.plugin.ipcall.a.d.h)paramObject;
          if (this.mWy.mXg == ((com.tencent.mm.plugin.ipcall.a.d.h)paramObject).mZm.tNa) {
            break;
          }
          w.i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished but room id not the same, now room roomId:%d, before room roomId:%d", new Object[] { Integer.valueOf(this.mWy.mXg), Integer.valueOf(((com.tencent.mm.plugin.ipcall.a.d.h)paramObject).mZm.tNa) });
          GMTrace.o(11591311425536L, 86362);
          return true;
        }
      }
    }
  }
  
  private void fj(boolean paramBoolean)
  {
    GMTrace.i(11589700812800L, 86350);
    w.i("MicroMsg.IPCallSvrLogic", "handleInvite, success: %b, isLaunchCancel: %b, isLaunchShutdown: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.mWn), Boolean.valueOf(this.mWo) });
    if ((this.mWn) || (this.mWo))
    {
      w.i("MicroMsg.IPCallSvrLogic", "handleInvite, ignore this");
      GMTrace.o(11589700812800L, 86350);
      return;
    }
    if (paramBoolean)
    {
      if (this.mWp != null)
      {
        if (this.mWy.mXv) {
          break label160;
        }
        this.mWp.y(this.mWy.mXn, this.mWy.lpl, this.mWy.mXm);
      }
      for (;;)
      {
        w.i("MicroMsg.IPCallSvrLogic", "start sync");
        this.mWr.a(this.mWy);
        GMTrace.o(11589700812800L, 86350);
        return;
        label160:
        this.mWp.aGC();
      }
    }
    if (this.mWp != null)
    {
      if (this.mWy.mXs)
      {
        this.mWp.v(this.mWy.mXn, this.mWy.lpl, this.mWy.mXm);
        GMTrace.o(11589700812800L, 86350);
        return;
      }
      if (this.mWy.mXt)
      {
        this.mWp.w(this.mWy.mXn, this.mWy.lpl, this.mWy.mXm);
        GMTrace.o(11589700812800L, 86350);
        return;
      }
      if (this.mWy.mXu)
      {
        this.mWp.x(this.mWy.mXn, this.mWy.lpl, this.mWy.mXm);
        GMTrace.o(11589700812800L, 86350);
        return;
      }
      if (!this.mWy.mXv)
      {
        this.mWp.y(this.mWy.mXn, this.mWy.lpl, this.mWy.mXm);
        GMTrace.o(11589700812800L, 86350);
        return;
      }
      this.mWp.u(this.mWy.mXn, this.mWy.lpl, this.mWy.mXm);
    }
    GMTrace.o(11589700812800L, 86350);
  }
  
  private void fk(boolean paramBoolean)
  {
    GMTrace.i(11589835030528L, 86351);
    w.i("MicroMsg.IPCallSvrLogic", "handleHeartbeat, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      this.mWk += 1;
      if (this.mWk >= 2)
      {
        w.e("MicroMsg.IPCallSvrLogic", "heartbeat failed twice!");
        this.mWu.stop();
        if ((i.aHp().aHi()) && (this.mWp != null))
        {
          this.mWp.aGG();
          GMTrace.o(11589835030528L, 86351);
        }
      }
    }
    else
    {
      this.mWk = 0;
    }
    GMTrace.o(11589835030528L, 86351);
  }
  
  private void fl(boolean paramBoolean)
  {
    int i = 1;
    GMTrace.i(11590237683712L, 86354);
    w.i("MicroMsg.IPCallSvrLogic", "handleSync, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBoolean) && (i.aHm().mYs)) {
      i.aHm().pf(this.mWy.mXB);
    }
    if (!paramBoolean)
    {
      w.e("MicroMsg.IPCallSvrLogic", "sync failed!");
      this.mWr.stop();
      if (i.aHp().mWi == 3) {}
      for (;;)
      {
        if ((i != 0) && (this.mWp != null)) {
          this.mWp.bh(this.mWy.lpl, this.mWy.mXm);
        }
        GMTrace.o(11590237683712L, 86354);
        return;
        i = 0;
      }
    }
    if ((this.mWy != null) && (paramBoolean)) {
      pd(this.mWy.aHD());
    }
    GMTrace.o(11590237683712L, 86354);
  }
  
  private void fm(boolean paramBoolean)
  {
    GMTrace.i(11590371901440L, 86355);
    w.i("MicroMsg.IPCallSvrLogic", "handleNotify, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBoolean) && (i.aHm().mYs)) {
      i.aHm().pf(this.mWy.mXB);
    }
    if ((this.mWy != null) && (paramBoolean))
    {
      int i = this.mWy.aHD();
      if ((i == 2) || (i == 1))
      {
        if (!this.mWA)
        {
          o localo = new o(this.mWy.mXg, this.mWy.mXh, this.mWy.aHC(), this.mWy.mXi, false);
          ap.wT().a(localo, 0);
        }
      }
      else {
        pd(this.mWy.aHD());
      }
    }
    else
    {
      GMTrace.o(11590371901440L, 86355);
      return;
    }
    w.i("MicroMsg.IPCallSvrLogic", "current status has jni accepted, ignore notify accept");
    GMTrace.o(11590371901440L, 86355);
  }
  
  private void fn(boolean paramBoolean)
  {
    Object localObject2 = null;
    GMTrace.i(11590640336896L, 86357);
    w.i("MicroMsg.IPCallSvrLogic", "handleRedirect, isSuccess: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.plugin.ipcall.a.c.a locala;
    com.tencent.mm.plugin.ipcall.a.a.c localc;
    if (paramBoolean)
    {
      locala = i.aHm();
      localc = this.mWy;
      w.i("MicroMsg.IPCallEngineManager", "redirectSvrAddr");
      if ((localc == null) || (localc.jOo == null) || (localc.jOo.size() <= 0)) {
        break label154;
      }
    }
    label154:
    for (bmf localbmf = com.tencent.mm.plugin.ipcall.b.c.Y(localc.jOo);; localbmf = null)
    {
      Object localObject1 = localObject2;
      if (localc != null)
      {
        localObject1 = localObject2;
        if (localc.mXE != null)
        {
          localObject1 = localObject2;
          if (localc.mXE.size() > 0) {
            localObject1 = com.tencent.mm.plugin.ipcall.b.c.Y(localc.mXE);
          }
        }
      }
      locala.mYp.a(localbmf, localbmf, (bmf)localObject1, 0, 0);
      GMTrace.o(11590640336896L, 86357);
      return;
    }
  }
  
  private void j(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(11589969248256L, 86352);
    w.i("MicroMsg.IPCallSvrLogic", "handleCancel, success: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((!paramBoolean) && (paramInt < 0) && (this.mWm <= 0))
    {
      this.mWm += 1;
      w.i("MicroMsg.IPCallSvrLogic", "cancel failed, retry count: %d", new Object[] { Integer.valueOf(this.mWm) });
      this.mWs.a(this.mWy);
      GMTrace.o(11589969248256L, 86352);
      return;
    }
    GMTrace.o(11589969248256L, 86352);
  }
  
  private void k(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(11590103465984L, 86353);
    w.i("MicroMsg.IPCallSvrLogic", "handleUserSelfShutdown, success: %b, isFromNotify: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.mWt.nak) });
    if ((!paramBoolean) && (paramInt < 0) && (this.mWl <= 0))
    {
      this.mWl += 1;
      w.i("MicroMsg.IPCallSvrLogic", "shutdown failed, retry count: %d, isFromNotify: %b", new Object[] { Integer.valueOf(this.mWl), Boolean.valueOf(this.mWt.nak) });
      this.mWt.a(this.mWy);
      GMTrace.o(11590103465984L, 86353);
      return;
    }
    GMTrace.o(11590103465984L, 86353);
  }
  
  public final void a(int paramInt1, com.tencent.mm.ac.k paramk, int paramInt2, int paramInt3)
  {
    GMTrace.i(11591042990080L, 86360);
    if (c(paramInt1, paramk, paramInt2, paramInt3))
    {
      w.i("MicroMsg.IPCallSvrLogic", "onTimerSuccess different room ignore");
      GMTrace.o(11591042990080L, 86360);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11591042990080L, 86360);
      return;
      fl(true);
      GMTrace.o(11591042990080L, 86360);
      return;
      fk(true);
    }
  }
  
  public final void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    GMTrace.i(11590774554624L, 86358);
    if (c(paramInt1, paramObject, paramInt2, paramInt3))
    {
      w.i("MicroMsg.IPCallSvrLogic", "onServiceResult different room ignore");
      GMTrace.o(11590774554624L, 86358);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11590774554624L, 86358);
      return;
      fj(true);
      GMTrace.o(11590774554624L, 86358);
      return;
      j(true, paramInt3);
      GMTrace.o(11590774554624L, 86358);
      return;
      k(true, paramInt3);
      GMTrace.o(11590774554624L, 86358);
      return;
      fm(true);
      GMTrace.o(11590774554624L, 86358);
      return;
      fn(true);
    }
  }
  
  public final void aHj()
  {
    GMTrace.i(11589432377344L, 86348);
    if (this.mWy.mXL) {
      w.e("MicroMsg.IPCallSvrLogic", "cancelIPCall, already accept");
    }
    this.mWn = true;
    w.i("MicroMsg.IPCallSvrLogic", "cancelIPCall, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(this.mWy.mXg), Integer.valueOf(this.mWy.mXj) });
    this.mWu.stop();
    this.mWr.stop();
    this.mWs.a(this.mWy);
    this.mWw.a(this.mWy);
    GMTrace.o(11589432377344L, 86348);
  }
  
  public final void b(int paramInt1, com.tencent.mm.ac.k paramk, int paramInt2, int paramInt3)
  {
    GMTrace.i(11591177207808L, 86361);
    if (c(paramInt1, paramk, paramInt2, paramInt3))
    {
      w.i("MicroMsg.IPCallSvrLogic", "onTimerFailed different room ignore");
      GMTrace.o(11591177207808L, 86361);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11591177207808L, 86361);
      return;
      fl(false);
      GMTrace.o(11591177207808L, 86361);
      return;
      fk(false);
    }
  }
  
  public final void b(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    GMTrace.i(11590908772352L, 86359);
    if (c(paramInt1, paramObject, paramInt2, paramInt3))
    {
      w.i("MicroMsg.IPCallSvrLogic", "onServiceFailed different room ignore");
      GMTrace.o(11590908772352L, 86359);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11590908772352L, 86359);
      return;
      fj(false);
      GMTrace.o(11590908772352L, 86359);
      return;
      j(false, paramInt3);
      GMTrace.o(11590908772352L, 86359);
      return;
      k(false, paramInt3);
      GMTrace.o(11590908772352L, 86359);
      return;
      fm(false);
      GMTrace.o(11590908772352L, 86359);
      return;
      fn(false);
    }
  }
  
  public final void pc(int paramInt)
  {
    GMTrace.i(11589566595072L, 86349);
    if (!this.mWy.mXL) {
      w.e("MicroMsg.IPCallSvrLogic", "shutdownIPCall, user not accept");
    }
    w.i("MicroMsg.IPCallSvrLogic", "shutdownIPCall, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(this.mWy.mXg), Integer.valueOf(this.mWy.mXj) });
    this.mWo = true;
    this.mWu.stop();
    this.mWr.stop();
    this.mWt.nak = false;
    this.mWt.naj = paramInt;
    this.mWt.a(this.mWy);
    this.mWw.a(this.mWy);
    GMTrace.o(11589566595072L, 86349);
  }
  
  public final boolean pd(int paramInt)
  {
    GMTrace.i(11590506119168L, 86356);
    switch (paramInt)
    {
    default: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, do nothing:%d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(11590506119168L, 86356);
      return false;
    case 2: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user accept, isLaunchCancel: %b, isLaunchShutdown: %b", new Object[] { Boolean.valueOf(this.mWn), Boolean.valueOf(this.mWo) });
      if ((this.mWn) || (this.mWo))
      {
        GMTrace.o(11590506119168L, 86356);
        return true;
      }
      this.mWr.stop();
      if (!this.fJI)
      {
        this.fJI = true;
        if (this.mWy != null) {
          this.mWy.mXL = true;
        }
        if (this.mWp != null) {
          this.mWp.aGE();
        }
        this.mWu.a(this.mWy);
      }
      GMTrace.o(11590506119168L, 86356);
      return true;
    case 3: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user busy");
      this.mWr.stop();
      this.mWu.stop();
      if (this.mWp != null) {
        this.mWp.bg(this.mWy.lpl, this.mWy.mXm);
      }
      GMTrace.o(11590506119168L, 86356);
      return true;
    case 1: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user ringing");
      if (!this.mWz)
      {
        this.mWz = true;
        if (this.mWp != null) {
          this.mWp.aGD();
        }
      }
      GMTrace.o(11590506119168L, 86356);
      return true;
    case 5: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, other side user shutdown");
      if (this.mWp != null) {
        this.mWp.aGF();
      }
      GMTrace.o(11590506119168L, 86356);
      return true;
    case 4: 
    case 7: 
    case 8: 
      w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user unavailable");
      if (this.mWy.mXu) {
        if (this.mWp != null) {
          this.mWp.x(this.mWy.mXn, this.mWy.lpl, this.mWy.mXm);
        }
      }
      for (;;)
      {
        GMTrace.o(11590506119168L, 86356);
        return true;
        if (this.mWp != null) {
          this.mWp.bf(this.mWy.lpl, this.mWy.mXm);
        }
      }
    }
    w.i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, shutdown overdue");
    this.mWy.mXs = true;
    if (this.mWp != null) {
      this.mWp.v(this.mWy.mXn, this.mWy.lpl, this.mWy.mXm);
    }
    GMTrace.o(11590506119168L, 86356);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void aGC();
    
    public abstract void aGD();
    
    public abstract void aGE();
    
    public abstract void aGF();
    
    public abstract void aGG();
    
    public abstract void bf(String paramString, int paramInt);
    
    public abstract void bg(String paramString, int paramInt);
    
    public abstract void bh(String paramString, int paramInt);
    
    public abstract void u(String paramString1, String paramString2, int paramInt);
    
    public abstract void v(String paramString1, String paramString2, int paramInt);
    
    public abstract void w(String paramString1, String paramString2, int paramInt);
    
    public abstract void x(String paramString1, String paramString2, int paramInt);
    
    public abstract void y(String paramString1, String paramString2, int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */