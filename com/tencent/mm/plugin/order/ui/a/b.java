package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements a.a
{
  public b()
  {
    GMTrace.i(6646193455104L, 49518);
    GMTrace.o(6646193455104L, 49518);
  }
  
  public final List<Preference> a(final Context paramContext, final com.tencent.mm.ui.base.preference.f paramf, final MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(6646327672832L, 49519);
    ArrayList localArrayList = new ArrayList();
    if (paramMallTransactionObject.fpF == 2) {}
    final Object localObject1;
    for (int i = 1;; i = 0)
    {
      if ((!bg.mZ(paramMallTransactionObject.ork)) && (!bg.mZ(paramMallTransactionObject.iIF)))
      {
        localObject1 = new d(paramContext);
        ((d)localObject1).lsu = paramMallTransactionObject.iIF;
        ((d)localObject1).mName = paramMallTransactionObject.ork;
        ((d)localObject1).mOnClickListener = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6648743591936L, 49537);
            if (!bg.mZ(paramMallTransactionObject.orj)) {
              e.P(paramContext, paramMallTransactionObject.orj);
            }
            GMTrace.o(6648743591936L, 49537);
          }
        };
        localArrayList.add(localObject1);
        localArrayList.add(new PreferenceSmallCategory(paramContext));
      }
      w.i("MicroMsg.FetchOrderPrefFactory", "getOrderPrefList() chargeFee is " + paramMallTransactionObject.orz + " and fetchTotalFee is " + paramMallTransactionObject.orJ);
      if (TextUtils.isEmpty(paramMallTransactionObject.orz)) {
        break;
      }
      localObject1 = new i(paramContext);
      ((i)localObject1).otQ = e.d(paramMallTransactionObject.orJ, paramMallTransactionObject.ori);
      ((i)localObject1).setTitle(paramContext.getString(R.l.eVM));
      if (!bg.mZ(paramMallTransactionObject.orK)) {
        ((i)localObject1).DN(paramMallTransactionObject.orK);
      }
      localArrayList.add(localObject1);
      localObject1 = new h(paramContext);
      ((h)localObject1).otN = false;
      ((h)localObject1).otO = true;
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(R.l.eVV);
      ((f)localObject1).setContent(e.d(paramMallTransactionObject.kKX, paramMallTransactionObject.ori));
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(R.l.eVN);
      ((f)localObject1).setContent(paramMallTransactionObject.orz);
      localArrayList.add(localObject1);
      if (!bg.mZ(paramMallTransactionObject.desc))
      {
        if (i == 0) {
          break label1157;
        }
        paramf = new f(paramContext);
        paramf.setTitle(R.l.eWb);
        paramf.setContent(paramMallTransactionObject.desc);
        localArrayList.add(paramf);
      }
      if (!bg.mZ(paramMallTransactionObject.oqX))
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.eWc);
        paramf.setContent(paramMallTransactionObject.oqX);
        localArrayList.add(paramf);
      }
      if (!bg.mZ(paramMallTransactionObject.orc))
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.eWo);
        paramf.setContent(paramMallTransactionObject.orc);
        if (!bg.mZ(paramMallTransactionObject.ord)) {
          paramf.DM(paramMallTransactionObject.ord);
        }
        localArrayList.add(paramf);
      }
      paramf = new f(paramContext);
      paramf.setTitle(R.l.eVY);
      paramf.setContent(e.Ef(paramMallTransactionObject.hzl));
      localArrayList.add(paramf);
      if (paramMallTransactionObject.orv <= 0) {
        break label1300;
      }
      paramf = new f(paramContext);
      paramf.setTitle(R.l.eVW);
      paramf.setContent(e.Ef(paramMallTransactionObject.orv));
      localArrayList.add(paramf);
      label574:
      if (!bg.mZ(paramMallTransactionObject.org))
      {
        localObject2 = new f(paramContext);
        ((f)localObject2).setTitle(R.l.eVX);
        localObject1 = paramMallTransactionObject.org;
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bg.mZ(paramMallTransactionObject.orh)) {
          paramf = (String)localObject1 + "(" + paramMallTransactionObject.orh + ")";
        }
        ((f)localObject2).setContent(paramf);
        localArrayList.add(localObject2);
      }
      if (!bg.mZ(paramMallTransactionObject.orf))
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.eWa);
        paramf.setContent(paramMallTransactionObject.orf);
        localArrayList.add(paramf);
      }
      if ((bg.mZ(paramMallTransactionObject.ors)) && (bg.mZ(paramMallTransactionObject.orj)) && (bg.mZ(paramMallTransactionObject.oqL))) {
        break label1357;
      }
      paramf = new h(paramContext);
      paramf.otN = true;
      localArrayList.add(paramf);
      localArrayList.add(a.a(paramContext, paramMallTransactionObject));
      label779:
      GMTrace.o(6646327672832L, 49519);
      return localArrayList;
    }
    Object localObject2 = new i(paramContext);
    ((i)localObject2).otQ = e.d(paramMallTransactionObject.kKX, paramMallTransactionObject.ori);
    label836:
    boolean bool2;
    if (i != 0)
    {
      localObject1 = paramContext.getString(R.l.eVL);
      ((i)localObject2).setTitle((CharSequence)localObject1);
      if (!bg.mZ(paramMallTransactionObject.ora)) {
        ((i)localObject2).DN(paramMallTransactionObject.ora);
      }
      localArrayList.add(localObject2);
      if ((paramMallTransactionObject.kKX == paramMallTransactionObject.oro) || (paramMallTransactionObject.oro <= 0.0D)) {
        break label1388;
      }
      localObject1 = new h(paramContext);
      ((h)localObject1).otN = false;
      ((h)localObject1).otO = true;
      localArrayList.add(localObject1);
      localObject1 = new f(paramContext);
      ((f)localObject1).setContent(e.d(paramMallTransactionObject.oro, paramMallTransactionObject.ori));
      ((f)localObject1).setTitle(R.l.eWd);
      localArrayList.add(localObject1);
      bool2 = true;
      bool1 = bool2;
      if (!bg.mZ(paramMallTransactionObject.orn))
      {
        localObject1 = new g(paramContext);
        ((g)localObject1).setTitle(R.l.eVS);
        ((g)localObject1).jqf = paramf;
        localObject2 = paramMallTransactionObject.orn.split("\n");
        if (localObject2.length != 1) {
          break label1100;
        }
        ((g)localObject1).otG = localObject2[0];
        label1038:
        localArrayList.add(localObject1);
      }
    }
    label1100:
    label1157:
    label1300:
    label1357:
    label1388:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localObject1 = new h(paramContext);
      ((h)localObject1).otN = bool1;
      ((h)localObject1).otO = true;
      localArrayList.add(localObject1);
      break;
      localObject1 = paramContext.getString(R.l.eVV);
      break label836;
      ((g)localObject1).otG = paramContext.getString(R.l.eVT, new Object[] { Integer.valueOf(localObject2.length), e.d(paramMallTransactionObject.oro - paramMallTransactionObject.kKX, paramMallTransactionObject.ori) });
      ((g)localObject1).a((String[])localObject2, TextUtils.TruncateAt.MIDDLE);
      break label1038;
      localObject1 = new f(paramContext);
      ((f)localObject1).setTitle(R.l.cJo);
      if (!bg.mZ(paramMallTransactionObject.oqY))
      {
        localObject2 = paramContext.getString(R.l.eVO);
        String str = paramMallTransactionObject.desc + " " + (String)localObject2;
        i = paramMallTransactionObject.desc.length();
        int j = paramMallTransactionObject.desc.length();
        ((f)localObject1).a(str, i + 1, ((String)localObject2).length() + (j + 1), new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6640824745984L, 49478);
            paramAnonymousView = paramMallTransactionObject.desc + "\n" + paramMallTransactionObject.oqY;
            localObject1.setContent(paramAnonymousView);
            paramf.notifyDataSetChanged();
            GMTrace.o(6640824745984L, 49478);
          }
        });
      }
      for (;;)
      {
        localArrayList.add(localObject1);
        break;
        ((f)localObject1).setContent(paramMallTransactionObject.desc);
      }
      if (paramMallTransactionObject.oru > 0)
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.eVZ);
        paramf.setContent(e.Ef(paramMallTransactionObject.oru));
        localArrayList.add(paramf);
        break label574;
      }
      w.e("MicroMsg.FetchOrderPrefFactory", "hy: is fetch but no arrive time or fetch time");
      break label574;
      paramContext = new h(paramContext);
      paramContext.otN = true;
      paramContext.jIy = false;
      localArrayList.add(paramContext);
      break label779;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */