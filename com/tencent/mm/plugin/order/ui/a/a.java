package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.HelpCenter;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements a.a
{
  public com.tencent.mm.wallet_core.ui.c otq;
  
  public a()
  {
    GMTrace.i(6641764270080L, 49485);
    GMTrace.o(6641764270080L, 49485);
  }
  
  public static void a(Context paramContext, String paramString, MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(16033112915968L, 119456);
    Intent localIntent = new Intent();
    Uri localUri = Uri.parse(paramString);
    paramMallTransactionObject = paramMallTransactionObject.fKK;
    String str1 = p.getDeviceID(paramContext);
    String str2 = com.tencent.mm.protocal.d.DEVICE_TYPE;
    String str3 = Build.MODEL;
    String str4 = p.tt();
    paramString = (WifiManager)ab.getContext().getSystemService("wifi");
    if (paramString != null)
    {
      paramString = paramString.getConnectionInfo();
      if (paramString == null) {}
    }
    for (paramString = bg.ap(paramString.getBSSID(), "");; paramString = "bssid")
    {
      paramString = localUri.buildUpon().appendQueryParameter("trans_id", paramMallTransactionObject).appendQueryParameter("deviceid", str1).appendQueryParameter("bssid", paramString).appendQueryParameter("deviceType", str2).appendQueryParameter("deviceName", str3).appendQueryParameter("ostype", str4).build().toString();
      w.i("MicroMsg.DefaultOrderPrefFactory", "new url %s", new Object[] { paramString });
      localIntent.putExtra("rawUrl", paramString);
      localIntent.putExtra("geta8key_username", m.zF());
      com.tencent.mm.bi.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
      GMTrace.o(16033112915968L, 119456);
      return;
    }
  }
  
  public final List<Preference> a(final Context paramContext, final com.tencent.mm.ui.base.preference.f paramf, final MallTransactionObject paramMallTransactionObject)
  {
    GMTrace.i(6641898487808L, 49486);
    ArrayList localArrayList = new ArrayList();
    int i;
    final Object localObject1;
    final Object localObject2;
    label157:
    label361:
    label649:
    int j;
    if (paramMallTransactionObject.fpF == 2)
    {
      i = 1;
      if ((!bg.mZ(paramMallTransactionObject.ork)) && (!bg.mZ(paramMallTransactionObject.iIF)))
      {
        localObject1 = new d(paramContext);
        ((d)localObject1).lsu = paramMallTransactionObject.iIF;
        ((d)localObject1).mName = paramMallTransactionObject.ork;
        ((d)localObject1).mOnClickListener = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6649280462848L, 49541);
            if (!bg.mZ(paramMallTransactionObject.orj)) {
              e.P(paramContext, paramMallTransactionObject.orj);
            }
            GMTrace.o(6649280462848L, 49541);
          }
        };
        localArrayList.add(localObject1);
        localArrayList.add(new PreferenceSmallCategory(paramContext));
      }
      localObject2 = new i(paramContext);
      ((i)localObject2).otQ = e.d(paramMallTransactionObject.kKX, paramMallTransactionObject.ori);
      if (i == 0) {
        break label1549;
      }
      localObject1 = paramContext.getString(R.l.eVL);
      ((i)localObject2).setTitle((CharSequence)localObject1);
      if (!bg.mZ(paramMallTransactionObject.ora)) {
        ((i)localObject2).DN(paramMallTransactionObject.ora);
      }
      localArrayList.add(localObject2);
      boolean bool = false;
      if (paramMallTransactionObject.kKX != paramMallTransactionObject.oro)
      {
        localObject1 = new h(paramContext);
        ((h)localObject1).otN = false;
        ((h)localObject1).otO = true;
        localArrayList.add(localObject1);
        localObject1 = new f(paramContext);
        ((f)localObject1).setContent(e.d(paramMallTransactionObject.oro, paramMallTransactionObject.ori));
        ((f)localObject1).setTitle(R.l.eWd);
        localArrayList.add(localObject1);
        bool = true;
      }
      if ((paramMallTransactionObject.kKX != paramMallTransactionObject.oro) && (!bg.mZ(paramMallTransactionObject.orn)))
      {
        localObject1 = new g(paramContext);
        ((g)localObject1).setTitle(R.l.eVS);
        ((g)localObject1).jqf = paramf;
        localObject2 = paramMallTransactionObject.orn.split("\n");
        if (localObject2.length != 1) {
          break label1582;
        }
        ((g)localObject1).otG = localObject2[0];
        localArrayList.add(localObject1);
      }
      localObject1 = new h(paramContext);
      ((h)localObject1).otN = bool;
      ((h)localObject1).otO = true;
      localArrayList.add(localObject1);
      if ((i == 0) && (!bg.mZ(paramMallTransactionObject.orx)))
      {
        ap.AS();
        localObject1 = com.tencent.mm.x.c.yL().SL(paramMallTransactionObject.orx);
        if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).gLS > 0))
        {
          localObject1 = ((com.tencent.mm.l.a)localObject1).vq();
          localObject2 = new f(paramContext);
          ((f)localObject2).setTitle(R.l.cJG);
          ((f)localObject2).setContent((String)localObject1);
          localArrayList.add(localObject2);
        }
      }
      if ((paramMallTransactionObject.oqT == 31) && (i != 0) && (!bg.mZ(paramMallTransactionObject.orE)))
      {
        ap.AS();
        localObject1 = com.tencent.mm.x.c.yL().SL(paramMallTransactionObject.orE);
        if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).gLS > 0))
        {
          localObject1 = ((com.tencent.mm.l.a)localObject1).vq();
          localObject2 = new f(paramContext);
          ((f)localObject2).setTitle(R.l.eWb);
          ((f)localObject2).setContent((String)localObject1);
          localArrayList.add(localObject2);
        }
      }
      if (!bg.mZ(paramMallTransactionObject.desc))
      {
        if (i == 0) {
          break label1649;
        }
        paramf = new f(paramContext);
        if ((paramMallTransactionObject.oqT != 32) && (paramMallTransactionObject.oqT != 33) && (paramMallTransactionObject.oqT != 31)) {
          break label1639;
        }
        paramf.setTitle(R.l.eVP);
        paramf.setContent(paramMallTransactionObject.desc);
        localArrayList.add(paramf);
      }
      if (!bg.mZ(paramMallTransactionObject.orI))
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.cJO);
        paramf.setContent(paramMallTransactionObject.orI);
        localArrayList.add(paramf);
      }
      if (!bg.mZ(paramMallTransactionObject.orH))
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.eWw);
        paramf.setContent(paramMallTransactionObject.orH);
        localArrayList.add(paramf);
      }
      if (!TextUtils.isEmpty(paramMallTransactionObject.orz))
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.eVN);
        paramf.setContent(paramMallTransactionObject.orz);
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
        if ((paramMallTransactionObject.oqT != 31) || (m.zF().equals(paramMallTransactionObject.orx)) || (paramMallTransactionObject.ory <= 0) || (bg.mZ(paramMallTransactionObject.orx)) || (bg.mZ(paramMallTransactionObject.fKK))) {
          break label1812;
        }
        localObject1 = paramContext.getString(R.l.eAe);
        localObject2 = paramMallTransactionObject.orc + " " + (String)localObject1;
        i = paramMallTransactionObject.orc.length();
        j = paramMallTransactionObject.orc.length();
        paramf.a((String)localObject2, i + 1, ((String)localObject1).length() + j + 1, new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6649548898304L, 49543);
            com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.ezh), paramContext.getString(R.l.dwQ), paramContext.getString(R.l.eAd), paramContext.getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6644314406912L, 49504);
                paramAnonymous2DialogInterface = new Intent();
                paramAnonymous2DialogInterface.putExtra("transaction_id", a.3.this.oqP.fKK);
                paramAnonymous2DialogInterface.putExtra("receiver_name", a.3.this.oqP.orx);
                paramAnonymous2DialogInterface.putExtra("resend_msg_from_flag", 1);
                com.tencent.mm.bi.d.b(a.3.this.val$context, "remittance", ".ui.RemittanceResendMsgUI", paramAnonymous2DialogInterface);
                GMTrace.o(6644314406912L, 49504);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(6645656584192L, 49514);
                GMTrace.o(6645656584192L, 49514);
              }
            });
            GMTrace.o(6649548898304L, 49543);
          }
        });
        label1000:
        localArrayList.add(paramf);
      }
      paramf = new f(paramContext);
      paramf.setTitle(R.l.eVR);
      paramf.setContent(e.Ef(paramMallTransactionObject.hzl));
      localArrayList.add(paramf);
      if (!bg.mZ(paramMallTransactionObject.org))
      {
        localObject2 = new f(paramContext);
        ((f)localObject2).setTitle(R.l.eWe);
        localObject1 = paramMallTransactionObject.org;
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bg.mZ(paramMallTransactionObject.orh)) {
          paramf = (String)localObject1 + "(" + paramMallTransactionObject.orh + ")";
        }
        ((f)localObject2).setContent(paramf);
        localArrayList.add(localObject2);
      }
      if (!bg.mZ(paramMallTransactionObject.fKK))
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.cJM);
        paramf.setContent(paramMallTransactionObject.fKK);
        localArrayList.add(paramf);
      }
      if (!bg.mZ(paramMallTransactionObject.orf))
      {
        paramf = new f(paramContext);
        paramf.setTitle(R.l.eWm);
        if (paramMallTransactionObject.oqT != 8) {
          break label1841;
        }
        paramf.setContent(paramContext.getString(R.l.eWn));
        localObject1 = new c(paramContext);
        localObject2 = com.tencent.mm.bn.a.a.b(paramContext, paramMallTransactionObject.orf, 5, 0);
        ((c)localObject1).oty = e.WG(paramMallTransactionObject.orf);
        ((c)localObject1).hkH = ((Bitmap)localObject2);
        ((c)localObject1).mOnClickListener = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6642301140992L, 49489);
            if (a.this.otq != null)
            {
              a locala = a.this;
              Bitmap localBitmap = localObject2;
              String str = paramMallTransactionObject.orf;
              if (locala.otq != null)
              {
                locala.otq.ff(str, str);
                locala.otq.ooQ = localBitmap;
                locala.otq.ooR = localBitmap;
                locala.otq.cjf();
              }
              a.this.otq.t(paramAnonymousView, true);
            }
            GMTrace.o(6642301140992L, 49489);
          }
        };
        localArrayList.add(paramf);
        localArrayList.add(localObject1);
      }
      label1308:
      if (paramMallTransactionObject.oqI.size() != 0) {
        break label1861;
      }
      i = 0;
      label1323:
      if ((i != 0) || ((bg.mZ(paramMallTransactionObject.ors)) && (bg.mZ(paramMallTransactionObject.orj)) && (bg.mZ(paramMallTransactionObject.oqL)))) {
        break label1867;
      }
      paramf = new h(paramContext);
      paramf.otN = true;
      localArrayList.add(paramf);
      localArrayList.add(com.tencent.mm.plugin.order.model.a.a(paramContext, paramMallTransactionObject));
      label1394:
      if (i != 0)
      {
        paramf = new j(paramContext);
        if (paramMallTransactionObject.oqJ != 1) {
          break label1912;
        }
        if ((!bg.mZ(paramMallTransactionObject.ors)) || (!bg.mZ(paramMallTransactionObject.orj)) || (!bg.mZ(paramMallTransactionObject.oqL)))
        {
          if (bg.mZ(paramMallTransactionObject.ort)) {
            break label1898;
          }
          paramf.otR = paramMallTransactionObject.ort;
          label1464:
          paramf.otS = new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6647132979200L, 49525);
              paramAnonymousView = new LinkedList();
              LinkedList localLinkedList = new LinkedList();
              if (!bg.mZ(paramMallTransactionObject.orj))
              {
                localLinkedList.add(Integer.valueOf(0));
                paramAnonymousView.add(paramContext.getString(R.l.eWq));
              }
              if (!bg.mZ(paramMallTransactionObject.oqL))
              {
                localLinkedList.add(Integer.valueOf(1));
                paramAnonymousView.add(paramContext.getString(R.l.eWr));
              }
              if (!bg.mZ(paramMallTransactionObject.ors))
              {
                localLinkedList.add(Integer.valueOf(2));
                paramAnonymousView.add(paramContext.getString(R.l.eWt));
              }
              if (localLinkedList.size() == 1)
              {
                com.tencent.mm.plugin.order.model.a.a(((Integer)localLinkedList.get(0)).intValue(), paramContext, paramMallTransactionObject);
                GMTrace.o(6647132979200L, 49525);
                return;
              }
              com.tencent.mm.ui.base.h.a(paramContext, null, paramAnonymousView, localLinkedList, null, true, new h.d()
              {
                public final void bQ(int paramAnonymous2Int1, int paramAnonymous2Int2)
                {
                  GMTrace.i(6645388148736L, 49512);
                  com.tencent.mm.plugin.order.model.a.a(paramAnonymous2Int2, a.5.this.val$context, a.5.this.oqP);
                  GMTrace.o(6645388148736L, 49512);
                }
              });
              GMTrace.o(6647132979200L, 49525);
            }
          };
        }
      }
    }
    for (;;)
    {
      paramf.oqI = paramMallTransactionObject.oqI;
      paramf.mOnClickListener = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6646596108288L, 49521);
          if (paramAnonymousView.getTag() == null)
          {
            GMTrace.o(6646596108288L, 49521);
            return;
          }
          if ((paramAnonymousView.getTag() instanceof MallOrderDetailObject.HelpCenter))
          {
            paramAnonymousView = (MallOrderDetailObject.HelpCenter)paramAnonymousView.getTag();
            a.a(paramContext, paramAnonymousView.url, paramMallTransactionObject);
          }
          GMTrace.o(6646596108288L, 49521);
        }
      };
      paramContext = new h(paramContext);
      paramContext.otN = true;
      localArrayList.add(paramContext);
      localArrayList.add(paramf);
      GMTrace.o(6641898487808L, 49486);
      return localArrayList;
      i = 0;
      break;
      label1549:
      if (paramMallTransactionObject.oqT == 11)
      {
        localObject1 = paramContext.getString(R.l.eWl);
        break label157;
      }
      localObject1 = paramContext.getString(R.l.eVK);
      break label157;
      label1582:
      ((g)localObject1).otG = paramContext.getString(R.l.eVT, new Object[] { Integer.valueOf(localObject2.length), e.d(paramMallTransactionObject.oro - paramMallTransactionObject.kKX, paramMallTransactionObject.ori) });
      ((g)localObject1).a((String[])localObject2, TextUtils.TruncateAt.MIDDLE);
      break label361;
      label1639:
      paramf.setTitle(R.l.eWb);
      break label649;
      label1649:
      localObject1 = new f(paramContext);
      if (paramMallTransactionObject.oqT == 31)
      {
        ((f)localObject1).setTitle(R.l.eWh);
        label1676:
        if (bg.mZ(paramMallTransactionObject.oqY)) {
          break label1800;
        }
        localObject2 = paramContext.getString(R.l.eVO);
        String str = paramMallTransactionObject.desc + " " + (String)localObject2;
        i = paramMallTransactionObject.desc.length();
        j = paramMallTransactionObject.desc.length();
        ((f)localObject1).a(str, i + 1, ((String)localObject2).length() + (j + 1), new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6646864543744L, 49523);
            paramAnonymousView = paramMallTransactionObject.desc + "\n" + paramMallTransactionObject.oqY;
            localObject1.setContent(paramAnonymousView);
            paramf.notifyDataSetChanged();
            GMTrace.o(6646864543744L, 49523);
          }
        });
      }
      for (;;)
      {
        localArrayList.add(localObject1);
        break;
        ((f)localObject1).setTitle(R.l.cJo);
        break label1676;
        label1800:
        ((f)localObject1).setContent(paramMallTransactionObject.desc);
      }
      label1812:
      paramf.setContent(paramMallTransactionObject.orc);
      if (bg.mZ(paramMallTransactionObject.ord)) {
        break label1000;
      }
      paramf.DM(paramMallTransactionObject.ord);
      break label1000;
      label1841:
      paramf.setContent(paramMallTransactionObject.orf);
      localArrayList.add(paramf);
      break label1308;
      label1861:
      i = 1;
      break label1323;
      label1867:
      paramf = new h(paramContext);
      paramf.otN = true;
      paramf.jIy = false;
      localArrayList.add(paramf);
      break label1394;
      label1898:
      paramf.otR = paramContext.getString(R.l.eWs);
      break label1464;
      label1912:
      if (!bg.mZ(paramMallTransactionObject.ort))
      {
        paramf.otR = paramMallTransactionObject.ort;
        paramf.otS = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6649012027392L, 49539);
            a.a(paramContext, paramMallTransactionObject.ors, paramMallTransactionObject);
            GMTrace.o(6649012027392L, 49539);
          }
        };
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */