package com.tencent.mm.plugin.order.model;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static com.tencent.mm.plugin.order.ui.a.e a(final Context paramContext, MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(6620826304512L, 49329);
    com.tencent.mm.plugin.order.ui.a.e locale = new com.tencent.mm.plugin.order.ui.a.e(paramContext);
    if (!bg.mZ(paramMallTransactionObject.ors)) {}
    for (locale.otz = paramContext.getString(R.l.eWp);; locale.otz = paramContext.getString(R.l.eWs))
    {
      locale.mOnClickListener = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6621631610880L, 49335);
          paramAnonymousView = new LinkedList();
          LinkedList localLinkedList = new LinkedList();
          if (!bg.mZ(this.oqP.orj))
          {
            localLinkedList.add(Integer.valueOf(0));
            paramAnonymousView.add(paramContext.getString(R.l.eWq));
          }
          if (!bg.mZ(this.oqP.oqL))
          {
            localLinkedList.add(Integer.valueOf(1));
            paramAnonymousView.add(paramContext.getString(R.l.eWr));
          }
          if (!bg.mZ(this.oqP.ors))
          {
            localLinkedList.add(Integer.valueOf(2));
            paramAnonymousView.add(paramContext.getString(R.l.eWt));
          }
          if (localLinkedList.size() == 1)
          {
            a.a(((Integer)localLinkedList.get(0)).intValue(), paramContext, this.oqP);
            GMTrace.o(6621631610880L, 49335);
            return;
          }
          h.a(paramContext, null, paramAnonymousView, localLinkedList, null, true, new h.d()
          {
            public final void bQ(int paramAnonymous2Int1, int paramAnonymous2Int2)
            {
              GMTrace.i(6630758416384L, 49403);
              a.a(paramAnonymous2Int2, a.1.this.val$context, a.1.this.oqP);
              GMTrace.o(6630758416384L, 49403);
            }
          });
          GMTrace.o(6621631610880L, 49335);
        }
      };
      GMTrace.o(6620826304512L, 49329);
      return locale;
    }
  }
  
  public static void a(int paramInt, Context paramContext, MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(6620960522240L, 49330);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6620960522240L, 49330);
      return;
      ap.AS();
      x localx = c.yL().SL(paramMallTransactionObject.orj);
      if ((localx != null) && (com.tencent.mm.l.a.eE(localx.field_type)))
      {
        com.tencent.mm.wallet_core.ui.e.bo(paramContext, paramMallTransactionObject.orj);
        GMTrace.o(6620960522240L, 49330);
        return;
      }
      com.tencent.mm.wallet_core.ui.e.P(paramContext, paramMallTransactionObject.orj);
      GMTrace.o(6620960522240L, 49330);
      return;
      com.tencent.mm.wallet_core.ui.e.bp(paramContext, paramMallTransactionObject.oqL);
      GMTrace.o(6620960522240L, 49330);
      return;
      com.tencent.mm.wallet_core.ui.e.m(paramContext, paramMallTransactionObject.ors, false);
    }
  }
  
  public static abstract interface a
  {
    public abstract List<Preference> a(Context paramContext, f paramf, MallTransactionObject paramMallTransactionObject);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */