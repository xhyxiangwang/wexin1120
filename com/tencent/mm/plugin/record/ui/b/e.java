package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.fr.b;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.record.a.c;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.r;
import com.tencent.mm.plugin.record.a.r.a;
import com.tencent.mm.plugin.record.ui.RecordVoiceBaseView;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class e
  implements h.b
{
  RecordVoiceBaseView oVE;
  private r oVn;
  
  public e()
  {
    GMTrace.i(7546123321344L, 56223);
    this.oVn = new r();
    GMTrace.o(7546123321344L, 56223);
  }
  
  public final void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    GMTrace.i(7546391756800L, 56225);
    Object localObject = paramView.findViewById(R.h.bEC);
    this.oVE = ((RecordVoiceBaseView)paramView.findViewById(R.h.cFx));
    if (paramb.aHe == 0)
    {
      this.oVE.setVisibility(8);
      ((View)localObject).setVisibility(0);
      GMTrace.o(7546391756800L, 56225);
      return;
    }
    if (paramb.aHe == 1)
    {
      ((View)localObject).setVisibility(8);
      this.oVE.setVisibility(0);
      paramView = d.a(paramb);
      fr localfr = new fr();
      localfr.fBn.type = 17;
      localfr.fBn.fBp = paramb.fBc;
      a.uLm.m(localfr);
      paramInt = localfr.fBo.ret;
      if (!com.tencent.mm.a.e.aZ(paramView))
      {
        if (!bg.mZ(paramb.fBc.tOx)) {
          break label262;
        }
        ((View)localObject).setVisibility(0);
        this.oVE.setVisibility(8);
      }
    }
    for (;;)
    {
      localObject = this.oVE;
      int i = paramb.fBc.duration;
      ((RecordVoiceBaseView)localObject).path = bg.ap(paramView, "");
      ((RecordVoiceBaseView)localObject).fBu = paramInt;
      if (((RecordVoiceBaseView)localObject).duration != i)
      {
        ((RecordVoiceBaseView)localObject).duration = i;
        ((RecordVoiceBaseView)localObject).setText((int)q.aB(i) + "''");
      }
      GMTrace.o(7546391756800L, 56225);
      return;
      label262:
      w.d("MicroMsg.VoiceViewWrapper", "restart voice %s, url %s", new Object[] { Long.valueOf(paramb.oUu.field_localId), paramb.fBc.tOx });
      localObject = new fr();
      ((fr)localObject).fBn.type = 16;
      ((fr)localObject).fBn.fwq = paramb.oUu.field_localId;
      a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    }
  }
  
  public final View cY(Context paramContext)
  {
    GMTrace.i(7546257539072L, 56224);
    paramContext = View.inflate(paramContext, R.i.dek, null);
    RecordVoiceBaseView localRecordVoiceBaseView = (RecordVoiceBaseView)paramContext.findViewById(R.h.cFx);
    localRecordVoiceBaseView.oVn = this.oVn;
    r localr = localRecordVoiceBaseView.oVn;
    Iterator localIterator = localr.gBe.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (localRecordVoiceBaseView != (r.a)localIterator.next());
    for (;;)
    {
      GMTrace.o(7546257539072L, 56224);
      return paramContext;
      localr.gBe.add(localRecordVoiceBaseView);
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(7546525974528L, 56226);
    r localr = this.oVn;
    localr.ahm();
    localr.ahk();
    r.kha = null;
    localr.gBe.clear();
    GMTrace.o(7546525974528L, 56226);
  }
  
  public final void pause()
  {
    GMTrace.i(7546660192256L, 56227);
    if ((this.oVn != null) && (this.oVn.gBe.size() > 0))
    {
      Iterator localIterator = this.oVn.gBe.iterator();
      while (localIterator.hasNext()) {
        ((r.a)localIterator.next()).onFinish();
      }
    }
    GMTrace.o(7546660192256L, 56227);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */