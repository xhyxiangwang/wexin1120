package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.bt.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.storage.as;
import com.tencent.mm.x.am;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.bn;
import com.tencent.mm.x.c;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

public final class w
  implements am
{
  private p oGF;
  private b oGG;
  private v oGd;
  
  public w()
  {
    GMTrace.i(5461587787776L, 40692);
    this.oGG = new b();
    GMTrace.o(5461587787776L, 40692);
  }
  
  private static w aWZ()
  {
    GMTrace.i(5461722005504L, 40693);
    w localw2 = (w)ap.AL().gJ("plugin.qqmail");
    w localw1 = localw2;
    if (localw2 == null)
    {
      localw1 = new w();
      ap.AL().a("plugin.qqmail", localw1);
    }
    GMTrace.o(5461722005504L, 40693);
    return localw1;
  }
  
  public static p aXa()
  {
    GMTrace.i(5461856223232L, 40694);
    h.xx().wH();
    if (aWZ().oGF == null) {
      aWZ().oGF = new p(d.toX, d.DEVICE_TYPE);
    }
    p localp = aWZ().oGF;
    GMTrace.o(5461856223232L, 40694);
    return localp;
  }
  
  public static v aXb()
  {
    GMTrace.i(5461990440960L, 40695);
    h.xx().wH();
    if (aWZ().oGd == null) {
      aWZ().oGd = new v();
    }
    v localv = aWZ().oGd;
    GMTrace.o(5461990440960L, 40695);
    return localv;
  }
  
  public static void aXc()
  {
    GMTrace.i(5462527311872L, 40699);
    ay.gC("qqmail");
    ap.AS();
    c.yQ().SU("qqmail");
    p localp = aXa();
    ap.AS();
    e.f(new File(c.zd()));
    localp.reset();
    GMTrace.o(5462527311872L, 40699);
  }
  
  public final void aW(boolean paramBoolean)
  {
    GMTrace.i(5462661529600L, 40700);
    com.tencent.mm.sdk.b.a.uLm.b(this.oGG);
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5477022826496L, 40807);
        if (!ap.AV())
        {
          GMTrace.o(5477022826496L, 40807);
          return;
        }
        long l = System.currentTimeMillis();
        s locals = new s();
        if (locals.oGb.nGv.size() > 0)
        {
          int i = 0;
          while (i < locals.oGb.nGv.size())
          {
            s.El(((q)locals.oGb.nGv.get(i)).oET);
            i += 1;
          }
          locals.oGb.nGv.clear();
          locals.save();
        }
        com.tencent.mm.sdk.platformtools.w.i("SubCoreQQMail", "summeranrt onAccountPostReset notifyAllFail take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(5477022826496L, 40807);
      }
    });
    GMTrace.o(5462661529600L, 40700);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5462795747328L, 40701);
    GMTrace.o(5462795747328L, 40701);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5462393094144L, 40698);
    if ((paramInt & 0x1) != 0) {
      aXc();
    }
    GMTrace.o(5462393094144L, 40698);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5462124658688L, 40696);
    p localp = aWZ().oGF;
    if (localp != null) {
      localp.reset();
    }
    com.tencent.mm.sdk.b.a.uLm.c(this.oGG);
    GMTrace.o(5462124658688L, 40696);
  }
  
  public final HashMap<Integer, g.d> vM()
  {
    GMTrace.i(5462258876416L, 40697);
    GMTrace.o(5462258876416L, 40697);
    return null;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */