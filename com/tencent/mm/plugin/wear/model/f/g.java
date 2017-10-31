package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.o;
import java.io.IOException;

public final class g
  extends b
{
  private au fKu;
  
  public g(au paramau)
  {
    GMTrace.i(9190022053888L, 68471);
    this.fKu = paramau;
    GMTrace.o(9190022053888L, 68471);
  }
  
  public final String getName()
  {
    GMTrace.i(9190290489344L, 68473);
    GMTrace.o(9190290489344L, 68473);
    return "WearLuckyCreateTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9190156271616L, 68472);
    bqd localbqd = new bqd();
    Object localObject = this.fKu.field_content;
    String str;
    if (localObject != null)
    {
      localObject = f.a.B((String)localObject, this.fKu.field_reserved);
      if ((localObject == null) || (!((f.a)localObject).hcv.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))) {
        break label253;
      }
      localbqd.uFM = this.fKu.field_msgId;
      localbqd.uFL = this.fKu.field_talker;
      if (this.fKu.field_isSend != 1) {
        break label227;
      }
      localObject = ((f.a)localObject).hcp;
      localbqd.fuw = h.Kf(this.fKu.field_talker);
      if (!o.dW(this.fKu.field_talker)) {
        break label235;
      }
      str = d(this.fKu.field_talker, this.fKu);
    }
    for (localbqd.ovi = String.format(ab.getContext().getString(R.l.esy), new Object[] { h.Kf(str), Character.valueOf('​'), localObject });; localbqd.ovi = ((String)localObject))
    {
      try
      {
        com.tencent.mm.plugin.wear.model.a.bzo();
        r.a(20014, localbqd.toByteArray(), true);
        com.tencent.mm.plugin.wear.model.c.a.dB(10, 0);
        com.tencent.mm.plugin.wear.model.c.a.wQ(10);
        GMTrace.o(9190156271616L, 68472);
        return;
      }
      catch (IOException localIOException)
      {
        label227:
        label235:
        GMTrace.o(9190156271616L, 68472);
        return;
      }
      w.w("MicroMsg.Wear.WearLuckyCreateTask", "xml is null!");
      GMTrace.o(9190156271616L, 68472);
      return;
      localObject = ((f.a)localObject).hco;
      break;
    }
    label253:
    w.i("MicroMsg.Wear.WearLuckyCreateTask", "biz c2c message, do not send to watch!");
    GMTrace.o(9190156271616L, 68472);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */