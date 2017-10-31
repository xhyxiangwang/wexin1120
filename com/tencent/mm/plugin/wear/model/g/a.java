package com.tencent.mm.plugin.wear.model.g;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.sv;
import com.tencent.mm.g.a.sv.b;
import com.tencent.mm.plugin.wear.ui.WearYoLockUI;
import com.tencent.mm.plugin.wear.ui.WearYoNoLockUI;
import com.tencent.mm.protocal.c.brg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private PowerManager shB;
  private KeyguardManager shC;
  LinkedHashMap<String, a> siC;
  
  public a()
  {
    GMTrace.i(9175123886080L, 68360);
    this.siC = new LinkedHashMap();
    this.shB = ((PowerManager)ab.getContext().getSystemService("power"));
    this.shC = ((KeyguardManager)ab.getContext().getSystemService("keyguard"));
    GMTrace.o(9175123886080L, 68360);
  }
  
  public static sv Kh(String paramString)
  {
    GMTrace.i(9175258103808L, 68361);
    sv localsv = new sv();
    localsv.fRy.fvy = 1;
    localsv.fRy.username = paramString;
    com.tencent.mm.sdk.b.a.uLm.m(localsv);
    GMTrace.o(9175258103808L, 68361);
    return localsv;
  }
  
  public final void bzF()
  {
    GMTrace.i(9175392321536L, 68362);
    if (Kh(null).fRz.fRA != 0)
    {
      w.i("MicroMsg.wear.WearYoLogic", "current show yo");
      GMTrace.o(9175392321536L, 68362);
      return;
    }
    for (;;)
    {
      Object localObject5;
      synchronized (this.siC)
      {
        Object localObject1 = this.siC.entrySet().iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label305;
        }
        localObject1 = (a)((Map.Entry)((Iterator)localObject1).next()).getValue();
        if (localObject1 != null) {
          this.siC.remove(((a)localObject1).siD);
        }
        if (localObject1 != null)
        {
          localObject5 = ((a)localObject1).content;
          ??? = new brg();
          localObject5 = bh.p((String)localObject5, "msg");
          if (localObject5 != null) {
            break label239;
          }
          ((brg)???).jXP = 0;
          localObject5 = new Intent();
          ((Intent)localObject5).putExtra("key_talker", ((a)localObject1).siD);
        }
      }
      try
      {
        ((Intent)localObject5).putExtra("key_data", ((brg)???).toByteArray());
        ((Intent)localObject5).addFlags(268435456);
        int i;
        if ((this.shC.inKeyguardRestrictedInputMode()) || (!this.shB.isScreenOn()))
        {
          i = 1;
          label202:
          if (i == 0) {
            break label287;
          }
          ((Intent)localObject5).setClass(ab.getContext(), WearYoLockUI.class);
        }
        for (;;)
        {
          ab.getContext().startActivity((Intent)localObject5);
          GMTrace.o(9175392321536L, 68362);
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
          label239:
          ((brg)???).jXP = bg.getInt((String)((Map)localObject5).get(".msg.yo.$type"), 0);
          ((brg)???).jWQ = bg.getInt((String)((Map)localObject5).get(".msg.yo.$count"), 0);
          break;
          i = 0;
          break label202;
          label287:
          ((Intent)localObject5).setClass(ab.getContext(), WearYoNoLockUI.class);
        }
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
      label305:
      Object localObject3 = null;
    }
  }
  
  private final class a
  {
    String content;
    String siD;
    
    public a(String paramString1, String paramString2)
    {
      GMTrace.i(9175526539264L, 68363);
      this.siD = paramString1;
      this.content = paramString2;
      GMTrace.o(9175526539264L, 68363);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */