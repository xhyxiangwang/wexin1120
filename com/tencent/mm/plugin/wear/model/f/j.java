package com.tencent.mm.plugin.wear.model.f;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.f;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.bqm;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.ap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j
  extends b
{
  private String fAJ;
  private boolean fHc;
  private int ftv;
  
  public j(String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(9188008787968L, 68456);
    this.fAJ = paramString;
    this.ftv = paramInt;
    this.fHc = paramBoolean;
    GMTrace.o(9188008787968L, 68456);
  }
  
  private static String V(ArrayList<au> paramArrayList)
  {
    GMTrace.i(9188277223424L, 68458);
    StringBuffer localStringBuffer = new StringBuffer();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      au localau = (au)paramArrayList.next();
      localStringBuffer.append(localau.field_msgId);
      localStringBuffer.append(localau.field_talker);
      localStringBuffer.append(localau.field_content);
      localStringBuffer.append(localau.field_type);
      localStringBuffer.append(localau.field_createTime);
    }
    paramArrayList = aa.QW(localStringBuffer.toString());
    GMTrace.o(9188277223424L, 68458);
    return paramArrayList;
  }
  
  private String g(String paramString, ArrayList<au> paramArrayList)
  {
    GMTrace.i(9188143005696L, 68457);
    w.d("MicroMsg.WearNotificationCreateTask", "Talker: %s, MsgSize: %d", new Object[] { paramString, Integer.valueOf(paramArrayList.size()) });
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramArrayList.size() - 1;
    while (i >= 0)
    {
      localStringBuffer.append(c(paramString, (au)paramArrayList.get(i)));
      localStringBuffer.append("​​");
      i -= 1;
    }
    paramString = localStringBuffer.toString().trim();
    GMTrace.o(9188143005696L, 68457);
    return paramString;
  }
  
  public final String getName()
  {
    GMTrace.i(9188411441152L, 68459);
    GMTrace.o(9188411441152L, 68459);
    return "WearNotificationCreateTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9188545658880L, 68460);
    w.d("MicroMsg.WearNotificationCreateTask", "start to execute notification create task");
    f localf = com.tencent.mm.plugin.wear.model.a.bzo().shj.Ka(this.fAJ);
    Object localObject1 = new ArrayList();
    int j = this.ftv - localf.shP;
    int i = j;
    if (j < 0) {
      i = 0;
    }
    w.d("MicroMsg.WearNotificationCreateTask", "limit=%d", new Object[] { Integer.valueOf(i) });
    ap.AS();
    Object localObject2 = com.tencent.mm.x.c.yN().bj(this.fAJ, i).iterator();
    label150:
    while (((Iterator)localObject2).hasNext())
    {
      au localau = (au)((Iterator)localObject2).next();
      if (localau.isSystem()) {}
      for (i = 0;; i = 1)
      {
        if (i == 0) {
          break label150;
        }
        ((ArrayList)localObject1).add(localau);
        break;
      }
    }
    w.i("MicroMsg.WearNotificationCreateTask", "receiveUnreadMsgList.size=%d", new Object[] { Integer.valueOf(((ArrayList)localObject1).size()) });
    if (((ArrayList)localObject1).size() == 0)
    {
      GMTrace.o(9188545658880L, 68460);
      return;
    }
    localObject2 = V((ArrayList)localObject1);
    if (localf.fwU.equals(localObject2))
    {
      w.i("MicroMsg.WearNotificationCreateTask", "same md5, not to update");
      GMTrace.o(9188545658880L, 68460);
      return;
    }
    localf.fwU = ((String)localObject2);
    localObject2 = new bqm();
    ((bqm)localObject2).mGz = localf.id;
    ((bqm)localObject2).uFL = localf.fAJ;
    ((bqm)localObject2).fuw = h.Kf(localf.fAJ);
    ((bqm)localObject2).ovi = g(localf.fAJ, (ArrayList)localObject1);
    ((bqm)localObject2).uFX = this.ftv;
    ((bqm)localObject2).uFZ = this.fHc;
    boolean bool;
    if (!bg.bOb()) {
      bool = true;
    }
    for (;;)
    {
      ((bqm)localObject2).uFY = bool;
      localObject1 = h.Ke(localf.fAJ);
      if (localObject1 != null) {
        ((bqm)localObject2).uFD = new com.tencent.mm.bl.b(h.L((Bitmap)localObject1));
      }
      w.d("MicroMsg.WearNotificationCreateTask", "generate notification content and ready to send");
      try
      {
        com.tencent.mm.plugin.wear.model.a.bzo();
        r.a(20003, ((bqm)localObject2).toByteArray(), true);
        w.d("MicroMsg.WearNotificationCreateTask", "start to update notification status");
        com.tencent.mm.plugin.wear.model.a.bzo().shj.a(localf);
        com.tencent.mm.plugin.wear.model.a.bzo().shj.Kd(this.fAJ);
        com.tencent.mm.plugin.wear.model.c.a.dB(6, 0);
        com.tencent.mm.plugin.wear.model.c.a.wQ(1);
        GMTrace.o(9188545658880L, 68460);
        return;
        bool = false;
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */