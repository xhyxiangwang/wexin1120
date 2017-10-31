package com.tencent.mm.plugin.qqmail.b;

import android.content.Context;
import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import java.io.IOException;
import java.util.LinkedList;

public final class s
{
  r oGb;
  
  public s()
  {
    GMTrace.i(5453668941824L, 40633);
    ap.AS();
    String str = (String)com.tencent.mm.x.c.xi().get(282625, "");
    try
    {
      this.oGb = new r();
      this.oGb.aC(Base64.decode(str, 0));
      GMTrace.o(5453668941824L, 40633);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.ShareMailInfoMgr", localException, "", new Object[0]);
      w.w("MicroMsg.ShareMailInfoMgr", "parse from config fail");
      this.oGb = new r();
      GMTrace.o(5453668941824L, 40633);
    }
  }
  
  static void El(String paramString)
  {
    GMTrace.i(5453937377280L, 40635);
    au localau = new au();
    localau.cW("qqmail");
    localau.D(ay.gB("qqmail"));
    localau.dC(0);
    localau.setContent(String.format(ab.getContext().getString(R.l.eFH), new Object[] { paramString }));
    localau.setType(1);
    localau.dB(3);
    ap.AS();
    w.d("MicroMsg.ShareMailInfoMgr", "send mail fail, publish fail message, id: %d", new Object[] { Long.valueOf(com.tencent.mm.x.c.yN().K(localau)) });
    GMTrace.o(5453937377280L, 40635);
  }
  
  public final void Ek(String paramString)
  {
    GMTrace.i(5453803159552L, 40634);
    if (bg.mZ(paramString))
    {
      w.w("MicroMsg.ShareMailInfoMgr", "remove info fail, info is null");
      GMTrace.o(5453803159552L, 40634);
      return;
    }
    int i = 0;
    for (;;)
    {
      if (i < this.oGb.nGv.size())
      {
        if (((q)this.oGb.nGv.get(i)).oET.equals(paramString)) {
          this.oGb.nGv.remove(i);
        }
      }
      else
      {
        save();
        GMTrace.o(5453803159552L, 40634);
        return;
      }
      i += 1;
    }
  }
  
  final void save()
  {
    GMTrace.i(5454071595008L, 40636);
    try
    {
      String str = Base64.encodeToString(this.oGb.toByteArray(), 0);
      w.d("MicroMsg.ShareMailInfoMgr", "save %s", new Object[] { str });
      ap.AS();
      com.tencent.mm.x.c.xi().set(282625, str);
      GMTrace.o(5454071595008L, 40636);
      return;
    }
    catch (IOException localIOException)
    {
      w.printErrStackTrace("MicroMsg.ShareMailInfoMgr", localIOException, "", new Object[0]);
      w.w("MicroMsg.ShareMailInfoMgr", "save to config fail");
      GMTrace.o(5454071595008L, 40636);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */