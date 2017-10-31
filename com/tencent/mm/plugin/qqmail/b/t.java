package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public final class t
{
  public ArrayList<u> oGc;
  public v oGd;
  public s oGe;
  public boolean oGf;
  public v.f oGg;
  public v.e oGh;
  
  public t()
  {
    GMTrace.i(5472190988288L, 40771);
    this.oGc = new ArrayList();
    this.oGd = w.aXb();
    this.oGe = null;
    this.oGf = false;
    this.oGg = new v.f()
    {
      public final void I(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(5474472689664L, 40788);
        if (paramAnonymousInt1 == paramAnonymousInt2)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "finished one job, queue.size = %d", new Object[] { Integer.valueOf(t.this.oGc.size()) });
          if (t.this.oGe != null) {
            t.this.oGe.Ek(paramAnonymousString);
          }
          if (t.this.oGc.size() > 0)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "continue to send next mail");
            paramAnonymousString = (u)t.this.oGc.remove(0);
            t.this.b(paramAnonymousString);
            t.this.oGd.a(this, t.this.oGh);
            GMTrace.o(5474472689664L, 40788);
            return;
          }
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "finished sent all mails");
          t.this.oGf = false;
        }
        GMTrace.o(5474472689664L, 40788);
      }
    };
    this.oGh = new v.e()
    {
      public final void Em(String paramAnonymousString)
      {
        GMTrace.i(5461453570048L, 40691);
        s locals;
        if (t.this.oGe != null)
        {
          locals = t.this.oGe;
          if (!bg.mZ(paramAnonymousString)) {
            break label110;
          }
          com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShareMailInfoMgr", "notify fail error, subject is null");
        }
        while (t.this.oGc.size() > 0)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "continue to send next mail");
          paramAnonymousString = (u)t.this.oGc.remove(0);
          t.this.b(paramAnonymousString);
          t.this.oGd.a(t.this.oGg, this);
          GMTrace.o(5461453570048L, 40691);
          return;
          label110:
          s.El(paramAnonymousString);
          locals.Ek(paramAnonymousString);
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ShareMailQueue", "final job fail");
        t.this.oGf = false;
        GMTrace.o(5461453570048L, 40691);
      }
    };
    GMTrace.o(5472190988288L, 40771);
  }
  
  public final void a(u paramu)
  {
    GMTrace.i(5472325206016L, 40772);
    if (!ap.AV())
    {
      GMTrace.o(5472325206016L, 40772);
      return;
    }
    if (this.oGe == null) {
      this.oGe = new s();
    }
    s locals = this.oGe;
    String str = paramu.oET;
    if (bg.mZ(str)) {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.ShareMailInfoMgr", "add info fail, info is null");
    }
    for (;;)
    {
      this.oGc.add(paramu);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ShareMailQueue", "add a new job, queue.size: %d", new Object[] { Integer.valueOf(this.oGc.size()) });
      if (!this.oGf)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.ShareMailQueue", "start execute");
        if (this.oGc.size() > 0)
        {
          this.oGf = true;
          b((u)this.oGc.remove(0));
          this.oGd.a(this.oGg, this.oGh);
        }
      }
      GMTrace.o(5472325206016L, 40772);
      return;
      q localq = new q();
      localq.oET = str;
      locals.oGb.nGv.add(localq);
      locals.save();
    }
  }
  
  public final void b(u paramu)
  {
    GMTrace.i(5472459423744L, 40773);
    v localv = this.oGd;
    localv.oGs.clear();
    localv.oFy = null;
    localv.oGu = 0;
    localv.oGw = null;
    localv.oGx = null;
    localv.oGy.clear();
    localv.oGv.clear();
    localv.fFB = null;
    localv.oGr.clear();
    localv.oGk.clear();
    localv.oGj = null;
    localv.oET = null;
    localv.oGB = 0;
    localv.oFw = null;
    localv.oGl.clear();
    localv.oGp.clear();
    localv.oGt.clear();
    localv.oGq = null;
    localv.oGh = null;
    this.oGd.fFB = paramu.fFB;
    this.oGd.oET = paramu.oET;
    this.oGd.oFw = paramu.oFw;
    this.oGd.oFx = paramu.oFx;
    this.oGd.oGj = paramu.oGj;
    localv = this.oGd;
    Map localMap = paramu.oGk;
    localv.oGk = new HashMap();
    localv.oGk.putAll(localMap);
    localv = this.oGd;
    localMap = paramu.oGl;
    localv.oGl = new LinkedHashMap();
    localv.oGl.putAll(localMap);
    localv = this.oGd;
    paramu = paramu.oGm;
    localv.oGm = new LinkedHashMap();
    localv.oGm.putAll(paramu);
    GMTrace.o(5472459423744L, 40773);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */