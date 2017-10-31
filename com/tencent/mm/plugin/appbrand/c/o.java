package com.tencent.mm.plugin.appbrand.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.k.f.a;
import com.tencent.mm.plugin.appbrand.k.f.b;
import com.tencent.mm.plugin.appbrand.k.f.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.protocal.c.ace;
import com.tencent.mm.protocal.c.bcb;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class o
  implements com.tencent.mm.plugin.appbrand.k.f
{
  public o()
  {
    GMTrace.i(19887040757760L, 148170);
    GMTrace.o(19887040757760L, 148170);
  }
  
  public final f.b TB()
  {
    GMTrace.i(19887174975488L, 148171);
    Object localObject1 = new f.b();
    ((f.b)localObject1).hip = new ArrayList(0);
    ((f.b)localObject1).jph = -1;
    ((f.b)localObject1).fEM = "";
    if (!h.xx().gQD)
    {
      GMTrace.o(19887174975488L, 148171);
      return (f.b)localObject1;
    }
    if (!a.SX())
    {
      GMTrace.o(19887174975488L, 148171);
      return (f.b)localObject1;
    }
    final Object localObject2 = k.Tz();
    f.b localb = new f.b();
    int i;
    if (localObject2 == null)
    {
      localObject1 = null;
      localb.fEM = ((String)localObject1);
      if (localObject2 != null) {
        break label310;
      }
      i = 0;
      label106:
      localb.jph = i;
      if (localObject2 != null) {
        break label319;
      }
      localObject1 = new Iterator()
      {
        boolean iFl;
        final Object[] iFm;
        
        public final boolean hasNext()
        {
          GMTrace.i(19884893274112L, 148154);
          if (this.iFl)
          {
            bool = this.iFn.moveToNext();
            if (!bool) {
              this.iFn.close();
            }
            GMTrace.o(19884893274112L, 148154);
            return bool;
          }
          this.iFl = true;
          boolean bool = this.iFn.moveToFirst();
          GMTrace.o(19884893274112L, 148154);
          return bool;
        }
        
        public final void remove()
        {
          GMTrace.i(19885027491840L, 148155);
          GMTrace.o(19885027491840L, 148155);
        }
      };
      i = 4;
    }
    for (;;)
    {
      localb.hip = new ArrayList(i);
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Object[])((Iterator)localObject1).next();
        WxaAttributes localWxaAttributes = com.tencent.mm.plugin.appbrand.app.f.Sa().d((String)localObject2[0], new String[] { "nickname", "brandIconURL" });
        if (localWxaAttributes != null)
        {
          f.c localc = new f.c();
          localc.username = ((String)localObject2[0]);
          localc.iQS = ((Integer)localObject2[1]).intValue();
          localc.fNP = ((Integer)localObject2[2]).intValue();
          localc.fvS = localWxaAttributes.field_nickname;
          localc.jpi = localWxaAttributes.field_brandIconURL;
          localb.hip.add(localc);
        }
      }
      localObject1 = ((ace)localObject2).nat;
      break;
      label310:
      i = ((ace)localObject2).tYo;
      break label106;
      label319:
      localObject1 = new Iterator()
      {
        final Object[] iFm;
        final Iterator<bcb> iFp;
        
        public final boolean hasNext()
        {
          GMTrace.i(19888382935040L, 148180);
          boolean bool = this.iFp.hasNext();
          GMTrace.o(19888382935040L, 148180);
          return bool;
        }
        
        public final void remove()
        {
          GMTrace.i(19888517152768L, 148181);
          GMTrace.o(19888517152768L, 148181);
        }
      };
      i = ((ace)localObject2).tYn.size();
      e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19887846064128L, 148176);
          if (!bg.bX(localObject2.tYn))
          {
            LinkedList localLinkedList = new LinkedList();
            Iterator localIterator = localObject2.tYn.iterator();
            while (localIterator.hasNext()) {
              localLinkedList.add(((bcb)localIterator.next()).username);
            }
            q.S(localLinkedList);
          }
          GMTrace.o(19887846064128L, 148176);
        }
      }, "BatchSyncWxaAttrBySearchShowOut");
    }
    k.hT(k.a.iFf);
    GMTrace.o(19887174975488L, 148171);
    return localb;
  }
  
  public final void a(Context paramContext, f.c paramc, String paramString)
  {
    GMTrace.i(19887443410944L, 148173);
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    localAppBrandStatObject.scene = 1054;
    localAppBrandStatObject.fty = paramString;
    ((c)h.h(c.class)).a(paramContext, paramc.username, null, paramc.iQS, paramc.fNP, null, localAppBrandStatObject);
    GMTrace.o(19887443410944L, 148173);
  }
  
  public final void a(Context paramContext, String paramString, f.a parama)
  {
    GMTrace.i(19887309193216L, 148172);
    Intent localIntent = new Intent(paramContext, AppBrandLauncherUI.class);
    localIntent.putExtra("extra_enter_scene", 10);
    localIntent.putExtra("extra_enter_scene_note", paramString + ":" + parama.tag);
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    paramContext.startActivity(localIntent);
    GMTrace.o(19887309193216L, 148172);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */