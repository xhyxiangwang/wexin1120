package com.tencent.mm.wallet_core.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.f.a.b;
import com.tencent.mm.wallet_core.f.a.c;
import com.tencent.mm.wallet_core.f.a.d;
import com.tencent.mm.wallet_core.f.a.f;
import com.tencent.mm.wallet_core.f.a.i;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
  implements com.tencent.mm.ac.e
{
  private i xgx;
  private int xgy;
  private com.tencent.mm.ac.e xgz;
  
  public a(com.tencent.mm.ac.e parame)
  {
    GMTrace.i(1434250641408L, 10686);
    this.xgy = 0;
    this.xgz = parame;
    GMTrace.o(1434250641408L, 10686);
  }
  
  private void a(int paramInt1, int paramInt2, String paramString, JSONObject paramJSONObject)
  {
    GMTrace.i(1434787512320L, 10690);
    w.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback errCode = " + paramInt2 + "errType = " + paramInt1);
    if ((this.xgx != null) && (paramJSONObject != null) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mScene !=null");
      this.xgx.a(paramInt2, paramString, paramJSONObject);
      this.xgz.a(paramInt1, paramInt2, paramString, this.xgx);
    }
    for (;;)
    {
      w.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback reset");
      this.xgy = 0;
      GMTrace.o(1434787512320L, 10690);
      return;
      if (this.xgz != null)
      {
        w.i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mRealCallback !=null");
        this.xgz.a(paramInt1, paramInt2, paramString, this.xgx);
      }
    }
  }
  
  private void c(i parami)
  {
    GMTrace.i(1434653294592L, 10689);
    this.xgx = parami;
    this.xgx.xgX = true;
    ap.wT().a(385, this);
    parami = m.bwE();
    int i;
    Object localObject;
    label103:
    int k;
    label127:
    int m;
    StringBuilder localStringBuilder;
    if (parami.rRz > 0)
    {
      i = parami.rRz;
      this.xgy += 1;
      parami = this.xgx.cjc();
      localObject = (String)parami.get("req_key");
      if (!bg.mZ((String)localObject)) {
        break label245;
      }
      w.i("MicroMsg.DelayQueryOrderHelper", "no reqKey");
      parami = new com.tencent.mm.wallet_core.f.a.e(parami);
      parami.xgI = true;
      k = m.bwE().aGW;
      if (this.xgy < k) {
        break label412;
      }
      j = 1;
      m = this.xgy;
      localObject = new HashMap();
      localStringBuilder = new StringBuilder();
      if (j == 0) {
        break label417;
      }
    }
    label245:
    label412:
    label417:
    for (int j = 1;; j = 0)
    {
      ((HashMap)localObject).put("is_last_query", j);
      ((HashMap)localObject).put("curr_query_count", String.valueOf(m));
      parami.ap((Map)localObject);
      w.i("MicroMsg.DelayQueryOrderHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
      ap.wT().a(parami, i);
      GMTrace.o(1434653294592L, 10689);
      return;
      i = 10000;
      break;
      w.i("MicroMsg.DelayQueryOrderHelper", "payorder reqKey: %s", new Object[] { localObject });
      w.i("MicroMsg.DelayQueryOrderHelper", "delayquery go new split cgi");
      if (((String)localObject).startsWith("sns_aa_"))
      {
        parami = new com.tencent.mm.wallet_core.f.a.a(parami);
        break label103;
      }
      if (((String)localObject).startsWith("sns_tf_"))
      {
        parami = new com.tencent.mm.wallet_core.f.a.g(parami);
        break label103;
      }
      if (((String)localObject).startsWith("sns_ff_"))
      {
        parami = new b(parami);
        break label103;
      }
      if (((String)localObject).startsWith("ts_"))
      {
        parami = new c(parami);
        break label103;
      }
      if (((String)localObject).startsWith("sns_"))
      {
        parami = new f(parami);
        break label103;
      }
      if (((String)localObject).startsWith("offline_"))
      {
        parami = new d(parami);
        break label103;
      }
      parami = new com.tencent.mm.wallet_core.f.a.e(parami);
      break label103;
      j = 0;
      break label127;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(1434921730048L, 10691);
    w.d("MicroMsg.DelayQueryOrderHelper", "errType: %d, errCode: %d, errMsg: %s scene %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk });
    if ((paramk instanceof com.tencent.mm.wallet_core.f.a.e))
    {
      ap.wT().b(385, this);
      paramk = (com.tencent.mm.wallet_core.f.a.e)paramk;
      w.d("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder errType: %d, errCode: %d, errMsg: %s scene %s  errmsgtype %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk, Integer.valueOf(paramk.xgH) });
      if (paramk.xgH == 1)
      {
        w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step A");
        a(paramInt1, paramInt2, paramString, paramk.cja());
        GMTrace.o(1434921730048L, 10691);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step B");
        if (paramk.xgH != 2)
        {
          a(paramInt1, paramInt2, paramString, paramk.cja());
          GMTrace.o(1434921730048L, 10691);
        }
      }
      else
      {
        if (paramk.xgd) {
          break label274;
        }
        w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step C");
        w.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { m.bwE().rRA });
      }
      label274:
      do
      {
        a(this.xgx.xgP, this.xgx.xgQ, this.xgx.xgR, this.xgx.xgS);
        GMTrace.o(1434921730048L, 10691);
        return;
        if (a(this.xgx))
        {
          w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D doLoopDelayScene");
          c(this.xgx);
          GMTrace.o(1434921730048L, 10691);
          return;
        }
        w.i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D fail");
      } while (paramk.xgH != 1);
      a(paramInt1, paramInt2, paramString, paramk.cja());
      GMTrace.o(1434921730048L, 10691);
      return;
    }
    if ((paramk instanceof i))
    {
      ap.wT().b(385, this);
      if (((i)paramk).xgY)
      {
        if (this.xgx.rHU)
        {
          w.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess ok");
          a(paramInt1, paramInt2, paramString, ((i)paramk).xgS);
          GMTrace.o(1434921730048L, 10691);
          return;
        }
        if (this.xgx.cjd())
        {
          w.i("MicroMsg.DelayQueryOrderHelper", "try isServerDelayQuery true");
          c(this.xgx);
          GMTrace.o(1434921730048L, 10691);
          return;
        }
        paramString = m.bwE().rRA;
        w.i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", new Object[] { paramString });
        a(paramInt1, paramInt2, paramString, ((i)paramk).xgS);
      }
    }
    GMTrace.o(1434921730048L, 10691);
  }
  
  public final boolean a(i parami)
  {
    GMTrace.i(1434384859136L, 10687);
    int i = m.bwE().aGW;
    w.i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", new Object[] { Boolean.valueOf(parami.cjd()), Integer.valueOf(this.xgy) });
    if ((parami.cjd()) && (this.xgy < i))
    {
      GMTrace.o(1434384859136L, 10687);
      return true;
    }
    GMTrace.o(1434384859136L, 10687);
    return false;
  }
  
  public final void b(i parami)
  {
    GMTrace.i(1434519076864L, 10688);
    w.i("MicroMsg.DelayQueryOrderHelper", "startDelayScene");
    this.xgy = 0;
    c(parami);
    GMTrace.o(1434519076864L, 10688);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */