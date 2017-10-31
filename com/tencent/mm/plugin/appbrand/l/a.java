package com.tencent.mm.plugin.appbrand.l;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.a;
import com.tencent.mm.storage.as.b;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.o;
import java.util.Map;

public final class a
  implements as.a
{
  public a()
  {
    GMTrace.i(10642257870848L, 79291);
    GMTrace.o(10642257870848L, 79291);
  }
  
  private static void a(ae paramae1, ae paramae2)
  {
    Object localObject2 = null;
    GMTrace.i(10642526306304L, 79293);
    Object localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yQ().c(o.heV, null, "appbrandcustomerservicemsg");
    Object localObject1;
    if (localObject3 != null) {
      if ((((Cursor)localObject3).getCount() > 0) && (((Cursor)localObject3).moveToFirst()))
      {
        localObject1 = new ae();
        ((ae)localObject1).b((Cursor)localObject3);
        ((Cursor)localObject3).close();
      }
    }
    for (;;)
    {
      PInt localPInt;
      if (localObject1 != null)
      {
        w.e("MicroMsg.AppBrandConversionExtension", "The lastest app brand conversation username is %s", new Object[] { ((aj)localObject1).field_username });
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aNc().Bu(((aj)localObject1).field_username);
        if ((localObject1 == null) || (((ce)localObject1).field_msgId <= 0L)) {
          break label470;
        }
        paramae2.W((au)localObject1);
        paramae2.setContent(((ce)localObject1).field_talker + ":" + ((ce)localObject1).field_content);
        paramae2.cI(Integer.toString(((ce)localObject1).field_type));
        as.b localb = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yQ().pE();
        if (localb != null)
        {
          PString localPString = new PString();
          localObject3 = new PString();
          localPInt = new PInt();
          ((au)localObject1).cW(paramae1.field_parentRef);
          ((au)localObject1).setContent(paramae2.field_content);
          localb.a((au)localObject1, localPString, (PString)localObject3, localPInt, true);
          int i = ((ce)localObject1).field_type;
          localObject1 = ((ce)localObject1).field_content;
          paramae1 = (ae)localObject2;
          if (!bg.mZ((String)localObject1)) {}
          switch (i)
          {
          default: 
            paramae1 = (ae)localObject2;
            label315:
            localObject1 = bg.mY(localPString.value);
            if (!bg.mZ(paramae1)) {
              break;
            }
          }
        }
      }
      for (paramae1 = "";; paramae1 = " " + bg.mY(paramae1))
      {
        paramae2.cJ(((String)localObject1).concat(paramae1));
        paramae2.cK(((PString)localObject3).value);
        paramae2.dD(localPInt.value);
        GMTrace.o(10642526306304L, 79293);
        return;
        w.e("MicroMsg.AppBrandConversionExtension", "The lastest app brand conversation is null");
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aNc().Bu(paramae1.field_username);
        break;
        localObject1 = bh.p((String)localObject1, "msg");
        paramae1 = (ae)localObject2;
        if (localObject1 == null) {
          break label315;
        }
        paramae1 = (String)((Map)localObject1).get(".msg.appmsg.title");
        w.d("MicroMsg.AppBrandConversionExtension", "[oneliang][parseConversationMsgContentTitle] title:%s", new Object[] { paramae1 });
        break label315;
      }
      label470:
      w.e("MicroMsg.AppBrandConversionExtension", "the last of msg is null'");
      paramae2.bQe();
      GMTrace.o(10642526306304L, 79293);
      return;
      localObject1 = null;
      break;
      localObject1 = null;
    }
  }
  
  public final void a(ae paramae, as paramas)
  {
    GMTrace.i(10642392088576L, 79292);
    if ((paramae != null) && (!bg.mZ(paramae.field_username)))
    {
      paramas = paramae.field_username;
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(paramas);
      if ((localx == null) || ((int)localx.gLS == 0))
      {
        w.e("MicroMsg.AppBrandConversionExtension", "contact is null or contactId is 0 for %s", new Object[] { paramas });
        GMTrace.o(10642392088576L, 79292);
        return;
      }
      if ((x.eE(paramas)) && (!o.fz(paramas)))
      {
        w.i("MicroMsg.AppBrandConversionExtension", "this conversation is a app brand contact!");
        paramae.cL("appbrandcustomerservicemsg");
        paramas = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yQ().SV("appbrandcustomerservicemsg");
        if (paramas == null)
        {
          w.i("MicroMsg.AppBrandConversionExtension", "create parentConv");
          paramas = new ae("appbrandcustomerservicemsg");
          paramas.bQe();
          a(paramae, paramas);
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yQ().d(paramas);
          GMTrace.o(10642392088576L, 79292);
          return;
        }
        w.i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
        paramas.cL(null);
        a(paramae, paramas);
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yQ().a(paramas, "appbrandcustomerservicemsg");
        GMTrace.o(10642392088576L, 79292);
        return;
      }
      if (o.fV(paramas))
      {
        w.i("MicroMsg.AppBrandConversionExtension", "appBrandSuperConv is created");
        paramae.cL(null);
      }
    }
    GMTrace.o(10642392088576L, 79292);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */