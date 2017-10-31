package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.protocal.c.aah;
import com.tencent.mm.protocal.c.aai;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;

public final class b
  extends k
  implements j
{
  private final com.tencent.mm.ac.b gMC;
  private com.tencent.mm.ac.e gMF;
  public e pvX;
  
  public b(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(6517612871680L, 48560);
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new aah();
    ((b.a)localObject).hlY = new aai();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getlbscard";
    ((b.a)localObject).hlW = 1251;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (aah)this.gMC.hlU.hmc;
    ((aah)localObject).fFh = paramFloat2;
    ((aah)localObject).fGL = paramFloat1;
    GMTrace.o(6517612871680L, 48560);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(6517881307136L, 48562);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(6517881307136L, 48562);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(6518015524864L, 48563);
    w.i("MicroMsg.NetSceneGetLbsCard", "onGYNetEnd, getType = 1251" + " errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramp = (aai)this.gMC.hlV.hmc;
      if (paramp == null) {
        break label856;
      }
      paramInt1 = (int)(System.currentTimeMillis() / 1000L);
      if (paramp.tWC) {
        break label121;
      }
      w.e("MicroMsg.NetSceneGetLbsCard", "getlbscard have_card is false, no card , don't handle");
    }
    for (;;)
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6518015524864L, 48563);
      return;
      label121:
      if (paramp.tWG <= paramInt1)
      {
        w.e("MicroMsg.NetSceneGetLbsCard", "getlbscard entrance_endtime: " + paramp.tWG + " is <= currentTime:" + paramInt1 + " , don't handle");
      }
      else if (TextUtils.isEmpty(paramp.knp))
      {
        w.e("MicroMsg.NetSceneGetLbsCard", "getlbscard card_tp_id is empty , don't handle");
      }
      else
      {
        w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_card is true");
        if (paramp.tWD)
        {
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_red_dot is true");
          label215:
          this.pvX = new e();
          this.pvX.kpb = 1;
          this.pvX.knp = paramp.knp;
          this.pvX.fMw = paramp.fMw;
          this.pvX.title = paramp.title;
          this.pvX.kns = paramp.kns;
          this.pvX.knt = paramp.knt;
          this.pvX.koD = paramp.koD;
          this.pvX.knr = paramp.knr;
          this.pvX.hbA = paramp.hbA;
          this.pvX.pvY = 0;
          this.pvX.pwb = paramp.pwb;
          this.pvX.pwc = paramp.pwc;
          this.pvX.pwd = paramp.pwd;
          this.pvX.pwe = paramp.pwe;
          this.pvX.pwf = "";
          this.pvX.knw = paramp.knw;
          this.pvX.pwg = paramp.pwg;
          this.pvX.pwh = paramp.pwh;
          m.bdC().pwa = this.pvX.pwf;
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard entrance_endtime: " + paramp.tWG + " is <= currentTime:" + paramInt1);
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard activity_type: " + paramp.tWI);
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uTY, Integer.valueOf(paramInt1));
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uTZ, Integer.valueOf(paramp.tWG));
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uUa, paramp.tWJ);
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uUd, paramp.tWH);
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uUe, Integer.valueOf(paramp.tWI));
          paramArrayOfByte = com.tencent.mm.plugin.shake.c.c.a.bdS();
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard msg reddotid is " + paramp.tWE);
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard pre reddotid is " + paramArrayOfByte);
          if (TextUtils.isEmpty(paramp.tWE)) {
            w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard resp.red_dot_id is empty");
          }
          if (!TextUtils.isEmpty(paramArrayOfByte)) {
            break label762;
          }
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard pre_red_dot_id is empty, resp.red_dot_id is not empty");
          com.tencent.mm.s.c.vP().l(262155, true);
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uUi, paramp.tWE);
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uUj, paramp.tWF);
        }
        for (;;)
        {
          g.paX.z(11721, paramp.knp);
          break;
          w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard have_red_dot is false");
          break label215;
          label762:
          if (!paramArrayOfByte.equals(paramp.tWE))
          {
            w.i("MicroMsg.NetSceneGetLbsCard", "getlbscard redDotId and msg.reddotid is not empty, but no equals");
            com.tencent.mm.s.c.vP().l(262155, true);
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uUi, paramp.tWE);
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uUj, paramp.tWF);
          }
          else if (paramArrayOfByte.equals(paramp.tWE))
          {
            w.i("MicroMsg.NetSceneGetLbsCard", "redDotId equals msg.reddotid");
          }
        }
        label856:
        w.e("MicroMsg.NetSceneGetLbsCard", "getlbscard resp is null");
      }
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6517747089408L, 48561);
    GMTrace.o(6517747089408L, 48561);
    return 1251;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */