package com.tencent.mm.plugin.sns.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.al.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class aj
{
  String lBB;
  int position;
  long qEO;
  String qEP;
  int qEQ;
  long qey;
  
  public aj()
  {
    GMTrace.i(8617046573056L, 64202);
    this.qEO = 0L;
    this.lBB = "";
    this.qEP = "";
    this.position = 0;
    this.qEQ = 0;
    this.qey = 0L;
    GMTrace.o(8617046573056L, 64202);
  }
  
  public final boolean bmm()
  {
    GMTrace.i(8616912355328L, 64201);
    long l = bg.aG(this.qEO);
    w.i("MicroMsg.ResumeSnsControl", "resume time %d", new Object[] { Long.valueOf(l) });
    w.i("MicroMsg.ResumeSnsControl", "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s", new Object[] { Long.valueOf(this.qEO), this.lBB, this.qEP, Long.valueOf(this.qey), Integer.valueOf(this.position), Integer.valueOf(this.qEQ) });
    if ((l < 180000L) && (this.position > 0))
    {
      w.i("MicroMsg.ResumeSnsControl", "timeLastId is %d ", new Object[] { Long.valueOf(this.qey) });
      if (this.qey == 0L)
      {
        GMTrace.o(8616912355328L, 64201);
        return false;
      }
      ae.bhf().w(this.qey, -1);
      GMTrace.o(8616912355328L, 64201);
      return true;
    }
    GMTrace.o(8616912355328L, 64201);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */