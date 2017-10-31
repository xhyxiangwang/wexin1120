package com.tencent.mm.plugin.card.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.kc;
import com.tencent.mm.protocal.c.kd;
import com.tencent.mm.protocal.c.xo;
import com.tencent.mm.protocal.c.xp;
import com.tencent.mm.protocal.c.xs;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class ad
  extends k
  implements com.tencent.mm.network.j
{
  private final b gMC;
  private com.tencent.mm.ac.e gMF;
  public boolean kpG;
  
  public ad(double paramDouble1, double paramDouble2, int paramInt)
  {
    GMTrace.i(4908879183872L, 36574);
    this.kpG = false;
    Object localObject = new b.a();
    ((b.a)localObject).hlX = new xo();
    ((b.a)localObject).hlY = new xp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardslayout";
    ((b.a)localObject).hlW = 984;
    ((b.a)localObject).hlZ = 0;
    ((b.a)localObject).hma = 0;
    this.gMC = ((b.a)localObject).DA();
    localObject = (xo)this.gMC.hlU.hmc;
    ((xo)localObject).latitude = paramDouble1;
    ((xo)localObject).longitude = paramDouble2;
    ((xo)localObject).scene = paramInt;
    ap.AS();
    ((xo)localObject).tUu = ((String)com.tencent.mm.x.c.xi().get(w.a.uVn, null));
    GMTrace.o(4908879183872L, 36574);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(4909281837056L, 36577);
    this.gMF = parame1;
    int i = a(parame, this.gMC, this);
    GMTrace.o(4909281837056L, 36577);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(4909013401600L, 36575);
    w.i("MicroMsg.NetSceneGetCardsLayout", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramp = (xp)this.gMC.hlV.hmc;
    w.v("MicroMsg.NetSceneGetCardsLayout", "json:" + paramp.kpq);
    long l1;
    boolean bool1;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.uVn, paramp.tUu);
      paramp = paramp.kpq;
      l1 = System.currentTimeMillis();
      ap.AS();
      paramArrayOfByte = (String)com.tencent.mm.x.c.xi().get(w.a.uVm, null);
      if (!bg.mZ(paramArrayOfByte)) {
        paramp = paramArrayOfByte;
      }
      paramArrayOfByte = com.tencent.mm.plugin.card.b.j.uj(paramp);
      al.ajC().gMB.eL("UserCardInfo", "update UserCardInfo set stickyIndex=0, stickyEndTime=0 , label_wording='' where stickyIndex>0");
      if (paramArrayOfByte == null)
      {
        w.w("MicroMsg.CardStickyHelper", "[doUpdateStickyInfoLogic] resp null");
        bool1 = false;
        this.kpG = bool1;
      }
    }
    else
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4909013401600L, 36575);
      return;
    }
    Object localObject;
    label316:
    long l2;
    boolean bool2;
    int i;
    if (paramArrayOfByte.tUx != null)
    {
      localObject = paramArrayOfByte.tUx;
      localObject = new HashMap();
      ((Map)localObject).put("expiring_list", Integer.valueOf(2));
      ((Map)localObject).put("member_card_list", Integer.valueOf(2));
      ((Map)localObject).put("nearby_list", Integer.valueOf(3));
      ((Map)localObject).put("first_list", Integer.valueOf(5));
      if (paramArrayOfByte.tUA == 100)
      {
        ((Map)localObject).put("expiring_list", Integer.valueOf(4));
        ap.AS();
        l2 = com.tencent.mm.x.c.yI().cA(Thread.currentThread().getId());
        if ((paramArrayOfByte.tUx.tGw == null) || (paramArrayOfByte.tUx.tGw.tGv == null) || (paramArrayOfByte.tUx.tGw.tGv.size() <= 0)) {
          break label1224;
        }
        paramInt1 = ((Integer)((Map)localObject).get("expiring_list")).intValue();
        com.tencent.mm.plugin.card.b.j.a(paramArrayOfByte.tUx.tGw.tGv, paramInt1 * 100000 + 3);
        paramInt1 = paramArrayOfByte.tUx.tGw.tGv.size();
        bool2 = true;
        i = paramInt1 + 0;
        label436:
        bool1 = bool2;
        paramInt1 = i;
        if (paramArrayOfByte.tUx.tGx != null)
        {
          bool1 = bool2;
          paramInt1 = i;
          if (paramArrayOfByte.tUx.tGx.tGv != null)
          {
            bool1 = bool2;
            paramInt1 = i;
            if (paramArrayOfByte.tUx.tGx.tGv.size() > 0)
            {
              paramInt1 = ((Integer)((Map)localObject).get("member_card_list")).intValue();
              com.tencent.mm.plugin.card.b.j.a(paramArrayOfByte.tUx.tGx.tGv, paramInt1 * 100000 + 2);
              paramInt1 = i + paramArrayOfByte.tUx.tGx.tGv.size();
              bool1 = true;
            }
          }
        }
        bool2 = bool1;
        i = paramInt1;
        if (paramArrayOfByte.tUx.tGy != null)
        {
          bool2 = bool1;
          i = paramInt1;
          if (paramArrayOfByte.tUx.tGy.tGv != null)
          {
            bool2 = bool1;
            i = paramInt1;
            if (paramArrayOfByte.tUx.tGy.tGv.size() > 0)
            {
              i = ((Integer)((Map)localObject).get("nearby_list")).intValue();
              com.tencent.mm.plugin.card.b.j.a(paramArrayOfByte.tUx.tGy.tGv, i * 100000 + 1);
              i = paramInt1 + paramArrayOfByte.tUx.tGy.tGv.size();
              bool2 = true;
            }
          }
        }
        bool1 = bool2;
        paramInt1 = i;
        if (paramArrayOfByte.tUx.tGz != null)
        {
          bool1 = bool2;
          paramInt1 = i;
          if (paramArrayOfByte.tUx.tGz.tGv != null)
          {
            bool1 = bool2;
            paramInt1 = i;
            if (paramArrayOfByte.tUx.tGz.tGv.size() > 0)
            {
              bool1 = true;
              paramInt1 = i + paramArrayOfByte.tUx.tGz.tGv.size();
              com.tencent.mm.plugin.card.b.j.b(paramArrayOfByte.tUx.tGz.tGv, 0);
            }
          }
        }
        bool2 = bool1;
        i = paramInt1;
        if (paramArrayOfByte.tUx.tGA != null)
        {
          bool2 = bool1;
          i = paramInt1;
          if (paramArrayOfByte.tUx.tGA.tGv != null)
          {
            bool2 = bool1;
            i = paramInt1;
            if (paramArrayOfByte.tUx.tGA.tGv.size() > 0)
            {
              i = ((Integer)((Map)localObject).get("first_list")).intValue() * 100000 + 4;
              com.tencent.mm.plugin.card.b.j.a(paramArrayOfByte.tUx.tGA.tGv, i);
              com.tencent.mm.plugin.card.b.j.b(paramArrayOfByte.tUx.tGA.tGv, i);
              i = paramInt1 + paramArrayOfByte.tUx.tGA.tGv.size();
              bool2 = true;
            }
          }
        }
        ap.AS();
        com.tencent.mm.x.c.yI().aJ(l2);
      }
    }
    for (;;)
    {
      al.ajH().putValue("key_get_card_layout_resp", paramArrayOfByte);
      ap.AS();
      com.tencent.mm.x.c.xi().a(w.a.uVv, paramp);
      bool1 = bool2;
      if (i <= 0) {
        break;
      }
      l2 = System.currentTimeMillis();
      paramp = new ArrayList();
      paramArrayOfByte = new IDKey();
      paramArrayOfByte.SetID(281);
      paramArrayOfByte.SetKey(36);
      paramArrayOfByte.SetValue(1L);
      localObject = new IDKey();
      ((IDKey)localObject).SetID(281);
      ((IDKey)localObject).SetKey(37);
      ((IDKey)localObject).SetValue((int)(l2 - l1));
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(38);
      localIDKey1.SetValue(i);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(40);
      localIDKey2.SetValue((int)(l2 - l1) / i);
      paramp.add(paramArrayOfByte);
      paramp.add(localObject);
      paramp.add(localIDKey1);
      paramp.add(localIDKey2);
      com.tencent.mm.plugin.report.service.g.paX.b(paramp, true);
      bool1 = bool2;
      break;
      if (paramArrayOfByte.tUA == 102)
      {
        ((Map)localObject).put("member_card_list", Integer.valueOf(4));
        break label316;
      }
      if (paramArrayOfByte.tUA != 101) {
        break label316;
      }
      ((Map)localObject).put("nearby_list", Integer.valueOf(4));
      break label316;
      label1224:
      bool2 = false;
      i = 0;
      break label436;
      bool2 = false;
      i = 0;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(4909147619328L, 36576);
    GMTrace.o(4909147619328L, 36576);
    return 984;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/model/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */