package com.tencent.mm.plugin.wallet_core.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.g.a.ku;
import com.tencent.mm.g.a.ku.b;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.wallet.a.k;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout;
import com.tencent.mm.pluginsdk.l.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.j;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView.a;
import com.tencent.mm.x.ap;
import com.tenpay.android.wechat.MyKeyboardWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class l
  extends j
  implements c
{
  private static HashMap<String, Boolean> rWO;
  public DialogInterface.OnCancelListener Fo;
  public ImageView hvo;
  private boolean isPaused;
  public View krg;
  private Animation lZm;
  private int lZn;
  protected MyKeyboardWindow mKeyboard;
  protected View nzg;
  protected PayInfo oRb;
  public TextView oYK;
  public TextView pfj;
  protected boolean pwK;
  protected com.tencent.mm.plugin.wallet_core.d.a rEx;
  protected a rHS;
  public FavorPayInfo rHn;
  public TextView rId;
  public boolean rWA;
  protected boolean rWB;
  public Bankcard rWC;
  public TextView rWD;
  public View rWE;
  public TextView rWF;
  public ImageView rWG;
  protected int rWH;
  protected boolean rWI;
  private int rWJ;
  private Animation rWK;
  private String rWL;
  private long rWM;
  boolean rWN;
  public Button rWh;
  public ImageView rWi;
  public TextView rWj;
  public TextView rWk;
  public FavourLayout rWl;
  public ImageView rWm;
  public TextView rWn;
  public EditHintPasswdView rWo;
  public c rWp;
  public View rWq;
  public View rWr;
  public TextView rWs;
  public ImageView rWt;
  public TextView rWu;
  public TextView rWv;
  public View rWw;
  public TextView rWx;
  public a rWy;
  public DialogInterface.OnClickListener rWz;
  
  static
  {
    GMTrace.i(18039936385024L, 134408);
    rWO = new HashMap();
    GMTrace.o(18039936385024L, 134408);
  }
  
  public l(Context paramContext)
  {
    super(paramContext, R.m.fdx);
    GMTrace.i(7007104925696L, 52207);
    this.rHS = null;
    this.rHn = new FavorPayInfo();
    this.rWA = false;
    this.rWB = true;
    this.rWC = null;
    this.rEx = new com.tencent.mm.plugin.wallet_core.d.a();
    this.rWH = 0;
    this.rWI = false;
    this.rWJ = 0;
    this.lZn = 0;
    this.rWK = null;
    this.rWL = "";
    this.rWM = -1L;
    this.rWN = false;
    this.isPaused = false;
    cm(paramContext);
    GMTrace.o(7007104925696L, 52207);
  }
  
  private void JL(String paramString)
  {
    GMTrace.i(7008983973888L, 52221);
    if (!TextUtils.isEmpty(paramString))
    {
      this.rWu.setVisibility(0);
      this.rWu.setText(paramString);
      GMTrace.o(7008983973888L, 52221);
      return;
    }
    w.i("MicroMsg.WalletPwdDialog", "ChargeFee is null");
    this.rWu.setVisibility(8);
    GMTrace.o(7008983973888L, 52221);
  }
  
  public static l a(Context paramContext, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, PayInfo paramPayInfo, c paramc, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(7010460368896L, 52232);
    paramContext = a(paramContext, true, paramOrders, paramFavorPayInfo, paramBankcard, paramPayInfo, null, paramc, paramOnClickListener, paramOnCancelListener);
    GMTrace.o(7010460368896L, 52232);
    return paramContext;
  }
  
  public static l a(Context paramContext, String paramString1, double paramDouble, String paramString2, Bankcard paramBankcard, c paramc, View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(7010997239808L, 52236);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7010997239808L, 52236);
      return null;
    }
    l locall = new l(paramContext);
    locall.bxU();
    locall.a(paramOnCancelListener);
    locall.setOnCancelListener(paramOnCancelListener);
    locall.setCancelable(true);
    locall.JJ(paramString1);
    locall.JK(com.tencent.mm.wallet_core.ui.e.d(paramDouble, paramString2));
    locall.rWB = true;
    if (paramBankcard == null)
    {
      paramString1 = "";
      locall.f(paramBankcard);
      if (TextUtils.isEmpty(paramString1)) {
        break label177;
      }
    }
    label177:
    for (boolean bool = true;; bool = false)
    {
      locall.iX(bool);
      if (paramBankcard != null) {
        locall.a(paramString1, paramOnClickListener, false);
      }
      locall.rWp = paramc;
      locall.show();
      com.tencent.mm.ui.base.h.a(paramContext, locall);
      GMTrace.o(7010997239808L, 52236);
      return locall;
      paramString1 = paramBankcard.field_desc;
      break;
    }
  }
  
  public static l a(Context paramContext, String paramString1, String paramString2, c paramc, DialogInterface.OnCancelListener paramOnCancelListener, a parama)
  {
    GMTrace.i(7010728804352L, 52234);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7010728804352L, 52234);
      return null;
    }
    paramContext = a(paramContext, paramString1, paramString2, "", paramc, paramOnCancelListener, parama);
    GMTrace.o(7010728804352L, 52234);
    return paramContext;
  }
  
  public static l a(Context paramContext, String paramString1, String paramString2, String paramString3, c paramc, DialogInterface.OnCancelListener paramOnCancelListener, a parama)
  {
    GMTrace.i(7010863022080L, 52235);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7010863022080L, 52235);
      return null;
    }
    l locall = new l(paramContext);
    locall.bxU();
    locall.a(paramOnCancelListener);
    locall.setOnCancelListener(paramOnCancelListener);
    locall.setCancelable(true);
    locall.JJ(paramString1);
    locall.JK(paramString2);
    locall.iX(false);
    locall.rWB = false;
    locall.rWy = parama;
    locall.JL(paramString3);
    locall.rWp = paramc;
    locall.show();
    com.tencent.mm.ui.base.h.a(paramContext, locall);
    GMTrace.o(7010863022080L, 52235);
    return locall;
  }
  
  public static l a(Context paramContext, boolean paramBoolean, Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard, PayInfo paramPayInfo, String paramString, c paramc, final View.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(7010594586624L, 52233);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(7010594586624L, 52233);
      return null;
    }
    if ((paramOrders == null) || (paramOrders.rPj == null) || (paramOrders.rPj.size() <= 0))
    {
      GMTrace.o(7010594586624L, 52233);
      return null;
    }
    Object localObject4 = b.rSp.a(paramOrders);
    boolean bool1;
    Object localObject3;
    Object localObject5;
    Object localObject6;
    if (localObject4 != null) {
      if ((paramFavorPayInfo != null) && (paramBankcard != null))
      {
        bool1 = false;
        if (paramBankcard.field_bankcardType.equalsIgnoreCase("CFT")) {
          bool1 = true;
        }
        localObject3 = ((a)localObject4).ay(paramFavorPayInfo.rOr, bool1);
        localObject5 = new HashMap();
        if ((((a)localObject4).rSj.rFT != null) && (((a)localObject4).rSj.rFT.rGd != null))
        {
          localObject6 = ((a)localObject4).rSj.rFT.rGd;
          if (!((a)localObject4).rSl.containsKey(localObject3)) {
            break label2326;
          }
        }
      }
    }
    label544:
    label550:
    label661:
    label795:
    label817:
    label899:
    label1106:
    label1235:
    label1282:
    label1414:
    label1708:
    label2089:
    label2095:
    label2217:
    label2269:
    label2274:
    label2288:
    label2314:
    label2317:
    label2326:
    for (double d = ((com.tencent.mm.plugin.wallet.a.h)((a)localObject4).rSl.get(localObject3)).rGg;; d = 0.0D)
    {
      int i = 0;
      Object localObject7;
      String str;
      Object localObject8;
      while (i < ((List)localObject6).size())
      {
        localObject7 = (com.tencent.mm.plugin.wallet.a.h)((List)localObject6).get(i);
        localObject2 = null;
        if ((((String)localObject3).equals("0")) && (!localObject7.equals("0")))
        {
          localObject1 = ((com.tencent.mm.plugin.wallet.a.h)localObject7).rGf;
          localObject1 = a.JD((String)localObject1);
          if ((localObject1 == null) || (localObject1.length <= 0)) {
            break label550;
          }
          localObject1 = (q)((a)localObject4).rSk.get(localObject1[0]);
          if (localObject1 == null) {
            break label550;
          }
          if (((q)localObject1).rGH == 0) {
            break label544;
          }
        }
        for (int j = 1;; j = 0)
        {
          if ((j == 0) || (((q)localObject1).rGK.size() <= 0)) {
            break label550;
          }
          localObject2 = ((q)localObject1).rGK.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            str = n.a((com.tencent.mm.bl.b)((Iterator)localObject2).next());
            localObject8 = (a.a)((Map)localObject5).get(str);
            if ((localObject8 == null) || (((com.tencent.mm.plugin.wallet.a.h)localObject7).rGg > ((a.a)localObject8).rSm.rGg))
            {
              localObject8 = new a.a();
              ((a.a)localObject8).rSm = ((com.tencent.mm.plugin.wallet.a.h)localObject7);
              ((a.a)localObject8).org = ((q)localObject1).org;
              ((a.a)localObject8).rSn = (((com.tencent.mm.plugin.wallet.a.h)localObject7).rGg - d);
              ((a.a)localObject8).rSo = ((q)localObject1).rGI;
              ((Map)localObject5).put(str, localObject8);
            }
          }
          localObject1 = localObject2;
          if (!((com.tencent.mm.plugin.wallet.a.h)localObject7).rGf.startsWith((String)localObject3)) {
            break;
          }
          localObject1 = localObject2;
          if (((String)localObject3).equals(((com.tencent.mm.plugin.wallet.a.h)localObject7).rGf)) {
            break;
          }
          localObject1 = ((com.tencent.mm.plugin.wallet.a.h)localObject7).rGf.replace((String)localObject3 + "-", "");
          break;
        }
        i += 1;
        continue;
        w.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
      }
      final Object localObject1 = ((a)localObject4).ax((String)localObject3, true);
      Object localObject2 = (a.a)((Map)localObject5).get(paramBankcard.field_bindSerial);
      localObject1 = (a.a)((Map)localObject1).get(paramBankcard.field_bankcardType);
      if ((localObject2 != null) && (((a.a)localObject2).rSm != null) && (!bg.mZ(((a.a)localObject2).rSm.rGf)))
      {
        paramFavorPayInfo.rOr = ((a.a)localObject2).rSm.rGf;
        localObject1 = ((a)localObject4).bxy();
        localObject5 = paramFavorPayInfo;
        paramFavorPayInfo = "";
        if ((paramPayInfo.fIG != 32) && (paramPayInfo.fIG != 33)) {
          break label1708;
        }
        localObject2 = paramPayInfo.tnW.getString("extinfo_key_5", "");
        localObject3 = paramPayInfo.tnW.getString("extinfo_key_1", "");
        paramFavorPayInfo = paramContext.getString(R.l.eYa);
        if (bg.mZ((String)localObject2)) {
          break label2317;
        }
      }
      for (paramFavorPayInfo = (FavorPayInfo)localObject2;; paramFavorPayInfo = "")
      {
        if (!bg.mZ((String)localObject3))
        {
          ap.AS();
          localObject6 = com.tencent.mm.x.c.yL().SJ((String)localObject3);
          if (localObject6 != null)
          {
            paramFavorPayInfo = ((x)localObject6).vq();
            localObject3 = new StringBuilder().append(com.tencent.mm.wallet_core.ui.e.WJ(paramFavorPayInfo));
            if (bg.mZ(paramString))
            {
              paramFavorPayInfo = "";
              paramFavorPayInfo = bg.i((String)localObject2, new Object[] { paramFavorPayInfo });
              if ((!bg.mZ(paramFavorPayInfo)) || (paramOrders == null) || (paramOrders.rPj == null)) {
                break label2095;
              }
              localObject2 = (Orders.Commodity)paramOrders.rPj.get(0);
              if (localObject2 == null) {
                break label2314;
              }
              paramFavorPayInfo = ((Orders.Commodity)localObject2).oqX;
              if ((paramPayInfo == null) || ((paramPayInfo.fIG != 31) && (paramPayInfo.fIG != 32) && (paramPayInfo.fIG != 33))) {
                break label2089;
              }
              i = 1;
              paramString = paramFavorPayInfo;
              if (i != 0)
              {
                paramString = paramFavorPayInfo;
                if (!bg.mZ(paramFavorPayInfo)) {
                  paramString = paramFavorPayInfo + "\n";
                }
                paramString = paramString + ((Orders.Commodity)localObject2).desc;
              }
              paramFavorPayInfo = paramString;
              if (bg.mZ(paramString)) {
                paramFavorPayInfo = ((Orders.Commodity)localObject2).desc;
              }
            }
          }
        }
        for (;;)
        {
          localObject6 = paramFavorPayInfo;
          localObject7 = null;
          localObject3 = null;
          Object localObject9;
          boolean bool2;
          if ((localObject4 != null) && (localObject5 != null))
          {
            localObject7 = ((a)localObject4).JC(((FavorPayInfo)localObject5).rOr);
            if ((localObject7 != null) && (((com.tencent.mm.plugin.wallet.a.h)localObject7).rFY > 0.0D))
            {
              bool1 = true;
              localObject1 = com.tencent.mm.wallet_core.ui.e.d(paramOrders.rOR, paramOrders.ori);
              paramFavorPayInfo = com.tencent.mm.wallet_core.ui.e.d(((com.tencent.mm.plugin.wallet.a.h)localObject7).rFX, paramOrders.ori);
              paramString = ((com.tencent.mm.plugin.wallet.a.h)localObject7).rGa;
              if (rWO.containsKey(paramPayInfo.fAF)) {
                break label2288;
              }
              com.tencent.mm.plugin.report.service.g.paX.i(14530, new Object[] { Integer.valueOf(3) });
              localObject4 = null;
              localObject2 = paramFavorPayInfo;
              paramFavorPayInfo = (FavorPayInfo)localObject4;
              localObject4 = localObject3;
              if (localObject7 != null)
              {
                localObject4 = localObject3;
                if (((com.tencent.mm.plugin.wallet.a.h)localObject7).rFZ != 0)
                {
                  localObject3 = ((com.tencent.mm.plugin.wallet.a.h)localObject7).rGb;
                  localObject4 = localObject3;
                  if (!bg.mZ(paramString)) {
                    localObject4 = "," + (String)localObject3;
                  }
                }
              }
              if (bg.mZ(paramString))
              {
                localObject7 = localObject4;
                localObject3 = paramFavorPayInfo;
                str = paramString;
                localObject8 = localObject1;
                localObject9 = localObject2;
                bool2 = bool1;
                if (bg.mZ((String)localObject4)) {}
              }
              else
              {
                if (!bg.mZ(paramFavorPayInfo)) {
                  break label2217;
                }
                localObject3 = null;
                bool2 = bool1;
                localObject9 = localObject2;
                localObject8 = localObject1;
                str = paramString;
                localObject7 = localObject4;
              }
            }
          }
          for (;;)
          {
            if (paramOrders.oVZ > 0.0D) {}
            for (paramFavorPayInfo = paramContext.getResources().getString(R.l.eTK, new Object[] { com.tencent.mm.wallet_core.ui.e.d(paramOrders.oVZ, paramOrders.ori) });; paramFavorPayInfo = null)
            {
              if (paramBankcard == null)
              {
                paramString = "";
                localObject1 = new l(paramContext);
                ((l)localObject1).a(paramContext, paramOrders, (FavorPayInfo)localObject5, paramBankcard);
                ((l)localObject1).iX(paramBoolean);
                ((l)localObject1).rWB = paramBoolean;
                ((l)localObject1).bxU();
                ((l)localObject1).a(new b(paramOnCancelListener));
                ((l)localObject1).setOnCancelListener(new b(paramOnCancelListener));
                ((l)localObject1).setCancelable(true);
                ((l)localObject1).JJ((String)localObject6);
                ((l)localObject1).JK((String)localObject9);
                ((l)localObject1).JM((String)localObject8);
                ((l)localObject1).a(paramString, new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    GMTrace.i(18038191554560L, 134395);
                    l.bxY().put(this.ooJ.fAF, Boolean.valueOf(true));
                    paramOnClickListener.onClick(paramAnonymousView);
                    if (localObject1.rWN) {
                      com.tencent.mm.plugin.report.service.g.paX.i(14530, new Object[] { Integer.valueOf(2) });
                    }
                    GMTrace.o(18038191554560L, 134395);
                  }
                }, bool2);
                ((l)localObject1).f(paramBankcard);
                if (paramOrders.rPh != 1) {
                  break label2269;
                }
                paramBoolean = true;
                ((l)localObject1).oRb = paramPayInfo;
                ((l)localObject1).rWI = paramBoolean;
                if (!com.tencent.mm.x.m.zS()) {
                  ((l)localObject1).bxP();
                }
                ((l)localObject1).dR(str, (String)localObject3);
                paramString = paramOrders.ori;
                ((l)localObject1).JN((String)localObject7);
                ((l)localObject1).JL(paramFavorPayInfo);
                ((l)localObject1).rWp = paramc;
                ((l)localObject1).ao(a(paramBankcard, paramOrders));
                if (!a(paramBankcard, paramOrders, paramPayInfo.fAF)) {
                  break label2274;
                }
                ((l)localObject1).iW(true);
                com.tencent.mm.plugin.report.service.g.paX.i(14530, new Object[] { Integer.valueOf(1) });
              }
              for (;;)
              {
                ((l)localObject1).show();
                com.tencent.mm.ui.base.h.a(paramContext, (Dialog)localObject1);
                GMTrace.o(7010594586624L, 52233);
                return (l)localObject1;
                if ((localObject1 != null) && (((a.a)localObject1).rSm != null) && (!bg.mZ(((a.a)localObject1).rSm.rGf)))
                {
                  paramFavorPayInfo.rOr = ((a.a)localObject1).rSm.rGf;
                  break;
                }
                paramFavorPayInfo.rOr = ((String)localObject3);
                break;
                if (paramOrders.rPk == null) {
                  break;
                }
                paramFavorPayInfo = ((a)localObject4).JF(((a)localObject4).JG(paramOrders.rPk.rFR));
                break;
                w.d("MicroMsg.WalletPwdDialog", "getFavorLogicHelper null");
                localObject1 = null;
                localObject5 = paramFavorPayInfo;
                break label661;
                paramFavorPayInfo = "(" + paramString + ")";
                break label795;
                w.e("MicroMsg.WalletPwdDialog", "can not found contact for user::" + (String)localObject3);
                break label817;
                w.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                break label817;
                if (paramPayInfo.fIG == 31)
                {
                  localObject2 = paramPayInfo.tnW.getString("extinfo_key_1", "");
                  if (!bg.mZ((String)localObject2))
                  {
                    ap.AS();
                    localObject3 = com.tencent.mm.x.c.yL().SJ((String)localObject2);
                    if (localObject3 != null)
                    {
                      paramFavorPayInfo = ((x)localObject3).vp();
                      i = R.l.eYa;
                      localObject2 = new StringBuilder().append(paramFavorPayInfo);
                      if (bg.mZ(paramString)) {}
                      for (paramFavorPayInfo = "";; paramFavorPayInfo = "(" + paramString + ")")
                      {
                        paramFavorPayInfo = paramContext.getString(i, new Object[] { paramFavorPayInfo });
                        break;
                      }
                    }
                    w.e("MicroMsg.WalletPwdDialog", "can not found contact for user::" + (String)localObject2);
                    break label817;
                  }
                  w.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                  break label817;
                }
                if (paramPayInfo.fIG == 42)
                {
                  localObject2 = paramPayInfo.tnW.getString("extinfo_key_1", "");
                  if (!bg.mZ((String)localObject2))
                  {
                    ap.AS();
                    localObject3 = com.tencent.mm.x.c.yL().SJ((String)localObject2);
                    if (localObject3 != null)
                    {
                      paramFavorPayInfo = ((x)localObject3).vp();
                      i = R.l.eXW;
                      localObject2 = new StringBuilder().append(paramFavorPayInfo);
                      if (bg.mZ(paramString)) {}
                      for (paramFavorPayInfo = "";; paramFavorPayInfo = "(" + paramString + ")")
                      {
                        paramFavorPayInfo = paramContext.getString(i, new Object[] { paramFavorPayInfo });
                        break;
                      }
                    }
                    w.e("MicroMsg.WalletPwdDialog", "can not found contact for user::" + (String)localObject2);
                    break label817;
                  }
                  w.e("MicroMsg.WalletPwdDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                  break label817;
                }
                if (paramPayInfo.fIG != 48) {
                  break label817;
                }
                paramFavorPayInfo = paramContext.getString(R.l.evu);
                break label817;
                i = 0;
                break label899;
                paramString = new StringBuilder("orders null?:");
                if (paramOrders == null) {}
                for (bool1 = true;; bool1 = false)
                {
                  w.w("MicroMsg.WalletPwdDialog", bool1);
                  localObject6 = paramFavorPayInfo;
                  break;
                }
                if ((localObject1 != null) && (((List)localObject1).size() > 0))
                {
                  localObject2 = com.tencent.mm.wallet_core.ui.e.d(((com.tencent.mm.plugin.wallet.a.h)localObject7).rFX, paramOrders.ori);
                  bool1 = true;
                  paramFavorPayInfo = paramContext.getString(R.l.eXY);
                  paramString = null;
                  localObject1 = null;
                  break label1106;
                }
                localObject2 = com.tencent.mm.wallet_core.ui.e.d(paramOrders.rOR, paramOrders.ori);
                bool1 = false;
                localObject1 = null;
                paramFavorPayInfo = null;
                paramString = null;
                break label1106;
                localObject3 = "," + paramFavorPayInfo;
                localObject7 = localObject4;
                str = paramString;
                localObject8 = localObject1;
                localObject9 = localObject2;
                bool2 = bool1;
                break label1235;
                paramString = paramBankcard.field_desc;
                break label1282;
                paramBoolean = false;
                break label1414;
                ((l)localObject1).iW(false);
              }
            }
            localObject2 = paramFavorPayInfo;
            paramFavorPayInfo = null;
            break label1106;
            localObject3 = null;
            str = null;
            localObject8 = null;
            localObject9 = null;
            bool2 = false;
          }
        }
        localObject2 = paramFavorPayInfo;
      }
    }
  }
  
  private static LinkedList<String> a(Bankcard paramBankcard, Orders paramOrders)
  {
    GMTrace.i(18039533731840L, 134405);
    LinkedList localLinkedList = new LinkedList();
    if ((paramOrders != null) && (paramOrders.rPk != null) && (paramOrders.rPk.rGc != null))
    {
      paramOrders = paramOrders.rPk.rGc.rFG.iterator();
      while (paramOrders.hasNext())
      {
        com.tencent.mm.plugin.wallet.a.b localb = (com.tencent.mm.plugin.wallet.a.b)paramOrders.next();
        if (localb.oqm.equals(paramBankcard.field_bindSerial))
        {
          paramBankcard = localb.rFI.iterator();
          while (paramBankcard.hasNext())
          {
            paramOrders = (com.tencent.mm.plugin.wallet.a.c)paramBankcard.next();
            if (paramOrders.rFK != 0) {
              localLinkedList.add(paramOrders.rFJ);
            }
          }
          GMTrace.o(18039533731840L, 134405);
          return localLinkedList;
        }
      }
    }
    GMTrace.o(18039533731840L, 134405);
    return localLinkedList;
  }
  
  private static boolean a(Bankcard paramBankcard, Orders paramOrders, String paramString)
  {
    GMTrace.i(18039667949568L, 134406);
    if (rWO.containsKey(paramString))
    {
      GMTrace.o(18039667949568L, 134406);
      return false;
    }
    int j;
    if ((paramOrders.rPk != null) && (paramOrders.rPk.rGc != null)) {
      if (paramOrders.rPk.rGc.rFG.size() > 0)
      {
        paramString = paramOrders.rPk.rGc.rFG.iterator();
        int i = 0;
        j = i;
        if (!paramString.hasNext()) {
          break label133;
        }
        com.tencent.mm.plugin.wallet.a.b localb = (com.tencent.mm.plugin.wallet.a.b)paramString.next();
        if ((localb.oqm == null) || (!localb.oqm.equals(paramBankcard.field_bindSerial))) {
          break label230;
        }
        i = 1;
      }
    }
    label133:
    label230:
    for (;;)
    {
      break;
      j = 0;
      if (j != 0)
      {
        GMTrace.o(18039667949568L, 134406);
        return false;
      }
      if (paramOrders.rPk.rGc.rFG.size() > 0)
      {
        GMTrace.o(18039667949568L, 134406);
        return true;
      }
      if ((paramOrders.rPk.rGc.rFH != null) && (paramOrders.rPk.rGc.rFH.rGm.size() > 0))
      {
        GMTrace.o(18039667949568L, 134406);
        return true;
      }
      GMTrace.o(18039667949568L, 134406);
      return false;
    }
  }
  
  private void ao(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(18039265296384L, 134403);
    if (this.rWl != null)
    {
      if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
      {
        this.rWl.ap(paramLinkedList);
        this.rWl.setVisibility(0);
        GMTrace.o(18039265296384L, 134403);
        return;
      }
      this.rWl.setVisibility(8);
    }
    GMTrace.o(18039265296384L, 134403);
  }
  
  private void bxP()
  {
    GMTrace.i(7007641796608L, 52211);
    w.v("MicroMsg.WalletPwdDialog", "alvinluo updateFingerprintMode");
    this.rWJ = 0;
    this.rWD.setVisibility(8);
    this.rWE.setVisibility(8);
    this.rWM = bg.Pq();
    Object localObject = com.tencent.mm.plugin.wallet_core.model.m.bwE();
    l.d locald = com.tencent.mm.pluginsdk.l.a.sRt;
    if ((localObject != null) && (locald.ayu())) {}
    for (boolean bool1 = locald.ayM();; bool1 = true)
    {
      w.i("MicroMsg.WalletPwdDialog", "hy: soter key status: %b", new Object[] { Boolean.valueOf(bool1) });
      if (((this.oRb != null) && ((this.oRb.tnZ == 100000) || (this.oRb.tnZ == 100102))) || (!bool1))
      {
        if (!this.nzg.isShown()) {
          this.nzg.setVisibility(0);
        }
        if (this.oRb != null)
        {
          this.oRb.tnX = 0;
          this.oRb.fCQ = "";
          this.oRb.fCR = "";
        }
        this.rWE.setVisibility(0);
        this.rWF.setVisibility(0);
        localObject = this.rWF;
        int i;
        if ((this.oRb != null) && (this.oRb.tnZ == 100102))
        {
          i = R.l.eUI;
          ((TextView)localObject).setText(i);
          this.rWF.setTextColor(getContext().getResources().getColor(R.e.aQM));
          if (bool1) {
            break label412;
          }
          this.rWr.setVisibility(0);
          this.rWs.setVisibility(0);
        }
        for (;;)
        {
          if ((this.oRb != null) && (this.oRb.tnZ == 100102))
          {
            com.tencent.mm.kernel.h.xz().xi().a(w.a.uVS, Boolean.valueOf(true));
            locald.eE(false);
            com.tencent.mm.kernel.h.xz().xi().a(w.a.uVQ, Boolean.valueOf(false));
          }
          com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(7007641796608L, 52211);
          return;
          i = R.l.eUG;
          break;
          label412:
          this.rWr.setVisibility(8);
          this.rWs.setVisibility(8);
        }
      }
      if ((this.oRb != null) && (this.oRb.tnZ == 100001)) {
        this.oRb.tnX = 1;
      }
      if ((locald != null) && (locald.ayB()) && (!locald.ayw())) {}
      for (bool1 = true;; bool1 = false)
      {
        w.v("MicroMsg.WalletPwdDialog", "alvinluo isDeviceSupportFp: %b", new Object[] { Boolean.valueOf(bool1) });
        boolean bool2;
        if ((locald != null) && (locald.ayu()))
        {
          bool2 = true;
          if ((!bool2) || (!bool1) || (!this.rWI) || (bxW())) {
            break label781;
          }
          this.rWD.setVisibility(0);
          this.rWD.setText(getContext().getString(R.l.eYd));
          this.rWH = 1;
          this.rWE.setVisibility(0);
          this.rWG.setVisibility(0);
          this.rWo.setVisibility(8);
          this.nzg.setVisibility(8);
          this.rWj.setText(R.l.eXX);
          if (this.oRb != null) {
            this.oRb.tnX = 1;
          }
          bxR();
          com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        }
        for (;;)
        {
          w.i("MicroMsg.WalletPwdDialog", "isOpenTouch:" + bool2 + ",  isDeviceSupport:" + bool1 + ", use_pay_touch:" + this.rWI + ", isForcePwdMode:" + bxW());
          this.rWD.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6984690565120L, 52040);
              if (l.this.rWH == 0) {
                l.a(l.this);
              }
              for (;;)
              {
                if (l.this.rWH == 1)
                {
                  l.bxX();
                  if (l.c(l.this)) {
                    l.d(l.this);
                  }
                }
                GMTrace.o(6984690565120L, 52040);
                return;
                if (l.this.rWH == 1) {
                  l.b(l.this);
                }
              }
            }
          });
          GMTrace.o(7007641796608L, 52211);
          return;
          bool2 = false;
          break;
          label781:
          if ((bool2) && (bool1) && (this.rWI) && (bxW()))
          {
            this.rWD.setText(getContext().getString(R.l.eUH));
            this.rWD.setVisibility(0);
            this.rWH = 0;
            this.rWE.setVisibility(8);
            this.rWo.setVisibility(0);
            if (!this.nzg.isShown()) {
              this.nzg.setVisibility(0);
            }
            this.rWj.setText(R.l.eYb);
            if (this.oRb != null) {
              this.oRb.tnX = 0;
            }
            com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
            com.tencent.mm.wallet_core.ui.e.Eh(8);
          }
          else
          {
            if (this.oRb != null) {
              this.oRb.tnX = 0;
            }
            this.rWD.setVisibility(8);
            com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          }
        }
      }
    }
  }
  
  private void bxQ()
  {
    GMTrace.i(16594411454464L, 123638);
    this.rWD.setText(getContext().getString(R.l.eUH));
    this.rWH = 0;
    this.rWM = bg.Pq();
    this.rWE.setVisibility(8);
    this.rWo.setVisibility(0);
    if (!this.nzg.isShown()) {
      this.nzg.setVisibility(0);
    }
    this.rWj.setText(R.l.eYb);
    iY(true);
    this.oRb.tnX = 0;
    com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    com.tencent.mm.wallet_core.ui.e.Eh(29);
    bxS();
    GMTrace.o(16594411454464L, 123638);
  }
  
  private void bxR()
  {
    GMTrace.i(7007776014336L, 52212);
    com.tencent.mm.plugin.soter.c.a.boD();
    final ku localku = new ku();
    localku.fIh.fCP = this.oRb.fAF;
    localku.fIh.fIj = 1;
    localku.fIh.fIl = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6931942998016L, 51647);
        w.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback");
        Object localObject = localku.fIi;
        if (localObject == null)
        {
          l.this.oRb.tnX = 0;
          w.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, result == null");
          GMTrace.o(6931942998016L, 51647);
          return;
        }
        int i = ((ku.b)localObject).errCode;
        w.v("MicroMsg.WalletPwdDialog", "alvinluo errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), ((ku.b)localObject).ftU });
        if (i == 0)
        {
          w.i("MicroMsg.WalletPwdDialog", "hy: payInfo soterAuthReq: %s", new Object[] { ((ku.b)localObject).fIm });
          l.this.oRb.tnX = 1;
          l.this.oRb.fCQ = ((ku.b)localObject).fCQ;
          l.this.oRb.fCR = ((ku.b)localObject).fCR;
          l.this.oRb.fIm = ((ku.b)localObject).fIm;
          l.this.oRb.fCO = ((ku.b)localObject).fCO;
          localObject = l.this.oRb;
          ((PayInfo)localObject).tnY += 1;
          l.this.rWF.setText("");
          l.this.bxV();
          com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
          com.tencent.mm.plugin.soter.c.a.vt(0);
          GMTrace.o(6931942998016L, 51647);
          return;
        }
        w.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        l.this.oRb.tnX = 0;
        l.this.rWE.setVisibility(0);
        l.this.rWF.setTextColor(l.this.getContext().getResources().getColor(R.e.aPW));
        l.this.rWF.setText(R.l.eUF);
        int j = (int)(System.currentTimeMillis() / 1000L);
        int k = j - l.e(l.this);
        if (k > 1)
        {
          l.a(l.this, j);
          l.f(l.this);
          PayInfo localPayInfo = l.this.oRb;
          localPayInfo.tnY += 1;
        }
        com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2) });
        boolean bool1;
        if ((i == 2) || (i == 10308))
        {
          bool1 = true;
          if (((ku.b)localObject).fIn != 2) {
            break label699;
          }
        }
        label699:
        for (boolean bool2 = true;; bool2 = false)
        {
          w.v("MicroMsg.WalletPwdDialog", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", new Object[] { Boolean.valueOf(bool1), Integer.valueOf(l.g(l.this)), Integer.valueOf(i), Boolean.valueOf(bool2) });
          if (((!bool2) && ((l.g(l.this) >= 3) || (k <= 1))) || (bool1)) {
            break label705;
          }
          w.v("MicroMsg.WalletPwdDialog", "alvinluo fingerprint pay");
          if (l.h(l.this) == null) {
            l.a(l.this, com.tencent.mm.ui.c.a.ff(l.this.getContext()));
          }
          l.this.rWG.setVisibility(8);
          l.this.rWF.setVisibility(4);
          l.h(l.this).reset();
          l.h(l.this).setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(7003749482496L, 52182);
              w.i("MicroMsg.WalletPwdDialog", "hy: on flash end");
              af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6945633206272L, 51749);
                  l.this.rWF.setVisibility(8);
                  l.this.rWG.setVisibility(0);
                  GMTrace.o(6945633206272L, 51749);
                }
              });
              GMTrace.o(7003749482496L, 52182);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(7003883700224L, 52183);
              GMTrace.o(7003883700224L, 52183);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(7003615264768L, 52181);
              w.i("MicroMsg.WalletPwdDialog", "hy: on flash start");
              af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6919326531584L, 51553);
                  l.this.rWF.setVisibility(0);
                  GMTrace.o(6919326531584L, 51553);
                }
              });
              GMTrace.o(7003615264768L, 52181);
            }
          });
          l.this.rWF.startAnimation(l.h(l.this));
          com.tencent.mm.plugin.soter.c.a.vt(1);
          GMTrace.o(6931942998016L, 51647);
          return;
          bool1 = false;
          break;
        }
        label705:
        if ((l.g(l.this) >= 3) || (bool1))
        {
          w.v("MicroMsg.WalletPwdDialog", "alvinluo change to pwd pay");
          l.bxX();
          l.this.rWH = 0;
          l.i(l.this);
          l.this.rWD.setVisibility(8);
          l.this.rWE.setVisibility(8);
          l.this.rWF.setVisibility(0);
          l.this.rWF.setText(R.l.eUG);
          l.this.rWF.setTextColor(l.this.getContext().getResources().getColor(R.e.aQM));
          l.this.rWj.setText(R.l.eYb);
          l.this.rWo.setVisibility(0);
          if (!l.this.nzg.isShown()) {
            l.this.nzg.setVisibility(0);
          }
          com.tencent.mm.plugin.soter.c.a.vt(2);
          l.iZ(true);
        }
        GMTrace.o(6931942998016L, 51647);
      }
    };
    com.tencent.mm.sdk.b.a.uLm.a(localku, Looper.getMainLooper());
    GMTrace.o(7007776014336L, 52212);
  }
  
  private static void bxS()
  {
    GMTrace.i(7007910232064L, 52213);
    w.i("MicroMsg.WalletPwdDialog", "hy: send release FPManager");
    mm localmm = new mm();
    com.tencent.mm.sdk.b.a.uLm.m(localmm);
    GMTrace.o(7007910232064L, 52213);
  }
  
  private static boolean bxW()
  {
    GMTrace.i(7011534110720L, 52240);
    ap.AS();
    Object localObject = com.tencent.mm.x.c.xi().get(w.a.uVM, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      GMTrace.o(7011534110720L, 52240);
      return bool;
    }
  }
  
  private void f(Bankcard paramBankcard)
  {
    GMTrace.i(7009386627072L, 52224);
    if (paramBankcard == null)
    {
      w.e("MicroMsg.WalletPwdDialog", "setBankcardText bankcard == null");
      GMTrace.o(7009386627072L, 52224);
      return;
    }
    if (paramBankcard.bwm())
    {
      this.rWm.setImageResource(R.g.bfc);
      GMTrace.o(7009386627072L, 52224);
      return;
    }
    if (paramBankcard.bwn())
    {
      this.rEx.a(paramBankcard, this.rWm);
      GMTrace.o(7009386627072L, 52224);
      return;
    }
    this.rEx.a(getContext(), paramBankcard, this.rWm);
    GMTrace.o(7009386627072L, 52224);
  }
  
  private void iW(boolean paramBoolean)
  {
    GMTrace.i(18039131078656L, 134402);
    View localView = this.krg.findViewById(R.h.bkD);
    if (localView != null)
    {
      if (paramBoolean)
      {
        localView.setVisibility(0);
        this.rWN = true;
        GMTrace.o(18039131078656L, 134402);
        return;
      }
      localView.setVisibility(8);
      this.rWN = false;
    }
    GMTrace.o(18039131078656L, 134402);
  }
  
  private static void iY(boolean paramBoolean)
  {
    GMTrace.i(7011399892992L, 52239);
    ap.AS();
    com.tencent.mm.x.c.xi().a(w.a.uVM, Boolean.valueOf(paramBoolean));
    GMTrace.o(7011399892992L, 52239);
  }
  
  public final void JJ(String paramString)
  {
    GMTrace.i(7008715538432L, 52219);
    this.pfj.setText(paramString);
    GMTrace.o(7008715538432L, 52219);
  }
  
  public final void JK(String paramString)
  {
    GMTrace.i(7008849756160L, 52220);
    if (!TextUtils.isEmpty(paramString))
    {
      this.oYK.setVisibility(0);
      this.oYK.setText(paramString);
      GMTrace.o(7008849756160L, 52220);
      return;
    }
    this.oYK.setVisibility(8);
    GMTrace.o(7008849756160L, 52220);
  }
  
  public final void JM(String paramString)
  {
    GMTrace.i(7009252409344L, 52223);
    if (!TextUtils.isEmpty(paramString))
    {
      this.rId.setVisibility(0);
      this.rId.setText(paramString);
      GMTrace.o(7009252409344L, 52223);
      return;
    }
    this.rId.setVisibility(8);
    GMTrace.o(7009252409344L, 52223);
  }
  
  public final void JN(String paramString)
  {
    GMTrace.i(7010326151168L, 52231);
    if (!bg.mZ(paramString))
    {
      this.rWv.setText(paramString);
      this.rWv.setVisibility(0);
      GMTrace.o(7010326151168L, 52231);
      return;
    }
    this.rWv.setVisibility(8);
    GMTrace.o(7010326151168L, 52231);
  }
  
  public final void a(final Context paramContext, final Orders paramOrders, FavorPayInfo paramFavorPayInfo, Bankcard paramBankcard)
  {
    GMTrace.i(7009655062528L, 52226);
    this.rHS = b.rSp.a(paramOrders);
    if ((paramOrders != null) && (paramOrders.rPk != null) && (paramOrders.rPk.rFS != null) && (paramOrders.rPk.rFS.size() > 0) && (this.rHS != null))
    {
      if (paramFavorPayInfo == null) {}
      for (this.rHn = this.rHS.JF(paramOrders.rPk.rFR);; this.rHn = paramFavorPayInfo)
      {
        this.rWn.setVisibility(0);
        if (this.rWr != null) {
          this.rWr.setTag(this.rHn);
        }
        this.rWC = paramBankcard;
        this.rWw.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6951270350848L, 51791);
            l.this.rWt.setVisibility(8);
            h.a(paramContext, paramOrders, l.this.rHn.rOr, new h.b()
            {
              public final void a(FavorPayInfo paramAnonymous2FavorPayInfo)
              {
                Object localObject2 = null;
                GMTrace.i(6917447483392L, 51539);
                l.this.rHn = paramAnonymous2FavorPayInfo;
                l.this.rWA = false;
                int i = l.this.rHn.rOs;
                String str1 = l.this.rHn.rOt;
                paramAnonymous2FavorPayInfo = com.tencent.mm.plugin.wallet_core.model.m.bwE().iJ(true);
                if (i != 0) {}
                for (i = 1; i == 0; i = 0)
                {
                  l.this.rHn.rOv = "";
                  if (!a.a(l.this.rHn, l.this.rWC)) {
                    break label386;
                  }
                  l.this.rWA = true;
                  if (paramAnonymous2FavorPayInfo.size() != 0) {
                    break label357;
                  }
                  l.this.rHn.rOv = l.6.this.val$context.getString(R.l.eUC);
                  label167:
                  l.this.dismiss();
                  if (l.this.rWp == null) {
                    break label386;
                  }
                  l.this.rWp.a(l.this.rWo.getText(), l.this.rHn, l.this.rWA);
                  GMTrace.o(6917447483392L, 51539);
                  return;
                }
                Object localObject1 = new ArrayList();
                int j = 0;
                label263:
                if (j < paramAnonymous2FavorPayInfo.size()) {
                  if (bg.mZ(str1))
                  {
                    if (((Bankcard)paramAnonymous2FavorPayInfo.get(j)).field_bankcardType.equals("CFT")) {
                      break label721;
                    }
                    i = 1;
                  }
                }
                for (;;)
                {
                  if (i != 0) {
                    ((List)localObject1).add((Bankcard)paramAnonymous2FavorPayInfo.get(j));
                  }
                  j += 1;
                  break label263;
                  if (((Bankcard)paramAnonymous2FavorPayInfo.get(j)).field_bankcardType.equals(str1))
                  {
                    i = 1;
                    continue;
                    paramAnonymous2FavorPayInfo = (FavorPayInfo)localObject1;
                    break;
                    label357:
                    l.this.rHn.rOv = l.6.this.val$context.getString(R.l.eUD);
                    break label167;
                    label386:
                    if (l.this.rWr != null) {
                      l.this.rWr.setTag(l.this.rHn);
                    }
                    localObject1 = l.this.rHS.JC(l.this.rHn.rOr);
                    String str3;
                    String str2;
                    String str4;
                    if ((localObject1 != null) && (((com.tencent.mm.plugin.wallet.a.h)localObject1).rFY > 0.0D))
                    {
                      str3 = com.tencent.mm.wallet_core.ui.e.s(((com.tencent.mm.plugin.wallet.a.h)localObject1).rFX);
                      str2 = com.tencent.mm.wallet_core.ui.e.s(l.6.this.rWT.rPk.rFO);
                      str1 = ((com.tencent.mm.plugin.wallet.a.h)localObject1).rGa;
                      paramAnonymous2FavorPayInfo = null;
                      if ((localObject1 == null) || (((com.tencent.mm.plugin.wallet.a.h)localObject1).rFZ == 0)) {
                        break label715;
                      }
                      str4 = ((com.tencent.mm.plugin.wallet.a.h)localObject1).rGb;
                      localObject1 = str4;
                      if (bg.mZ(str1)) {}
                    }
                    label715:
                    for (localObject1 = "," + str4;; localObject1 = null)
                    {
                      if ((!bg.mZ(str1)) || (!bg.mZ((String)localObject1))) {
                        if (bg.mZ(paramAnonymous2FavorPayInfo)) {
                          paramAnonymous2FavorPayInfo = (FavorPayInfo)localObject2;
                        }
                      }
                      for (;;)
                      {
                        l.this.JK(str3);
                        l.this.JM(str2);
                        l.this.dR(str1, paramAnonymous2FavorPayInfo);
                        paramAnonymous2FavorPayInfo = l.this;
                        str1 = l.6.this.rWT.ori;
                        paramAnonymous2FavorPayInfo.JN((String)localObject1);
                        GMTrace.o(6917447483392L, 51539);
                        return;
                        str3 = com.tencent.mm.wallet_core.ui.e.s(l.6.this.rWT.rPk.rFO);
                        paramAnonymous2FavorPayInfo = l.6.this.val$context.getString(R.l.eXY);
                        str1 = null;
                        str2 = null;
                        break;
                        paramAnonymous2FavorPayInfo = "," + paramAnonymous2FavorPayInfo;
                      }
                    }
                  }
                  label721:
                  i = 0;
                }
              }
            });
            GMTrace.o(6951270350848L, 51791);
          }
        });
        Assert.assertNotNull(this.rHS);
        this.rWt.setVisibility(8);
        GMTrace.o(7009655062528L, 52226);
        return;
      }
    }
    this.rWn.setVisibility(8);
    GMTrace.o(7009655062528L, 52226);
  }
  
  public final void a(final DialogInterface.OnCancelListener paramOnCancelListener)
  {
    GMTrace.i(7010057715712L, 52229);
    if (this.rWi == null)
    {
      GMTrace.o(7010057715712L, 52229);
      return;
    }
    this.Fo = paramOnCancelListener;
    this.rWi.setVisibility(0);
    this.rWi.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6936774836224L, 51683);
        if (paramOnCancelListener != null) {
          paramOnCancelListener.onCancel(null);
        }
        if (l.this.rWy != null) {
          l.this.rWy.aTX();
        }
        l.this.cancel();
        if (l.this.rWD.isShown())
        {
          com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(6936774836224L, 51683);
          return;
        }
        com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        GMTrace.o(6936774836224L, 51683);
      }
    });
    GMTrace.o(7010057715712L, 52229);
  }
  
  public final void a(String paramString, View.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    GMTrace.i(7009520844800L, 52225);
    if (!TextUtils.isEmpty(paramString))
    {
      this.rWr.setOnClickListener(paramOnClickListener);
      this.rWk.setText(paramString);
      if (!this.rWB)
      {
        this.rWr.setVisibility(8);
        this.rWs.setVisibility(8);
      }
      while (!paramBoolean)
      {
        this.rWq.setVisibility(8);
        GMTrace.o(7009520844800L, 52225);
        return;
        this.rWr.setVisibility(0);
        this.rWs.setVisibility(0);
      }
      this.rWq.setVisibility(0);
      GMTrace.o(7009520844800L, 52225);
      return;
    }
    this.rWr.setVisibility(8);
    this.rWs.setVisibility(8);
    GMTrace.o(7009520844800L, 52225);
  }
  
  public final void aYY()
  {
    GMTrace.i(18039399514112L, 134404);
    if (this.rWo != null) {
      this.rWo.aYY();
    }
    GMTrace.o(18039399514112L, 134404);
  }
  
  public final void bxA()
  {
    GMTrace.i(7011265675264L, 52238);
    this.isPaused = true;
    if (com.tencent.mm.x.m.zS())
    {
      GMTrace.o(7011265675264L, 52238);
      return;
    }
    if (this.rWH == 1) {
      bxQ();
    }
    GMTrace.o(7011265675264L, 52238);
  }
  
  public int bxT()
  {
    GMTrace.i(7008044449792L, 52214);
    int i = R.i.dix;
    GMTrace.o(7008044449792L, 52214);
    return i;
  }
  
  public final void bxU()
  {
    GMTrace.i(7009789280256L, 52227);
    if (this.rWh == null)
    {
      GMTrace.o(7009789280256L, 52227);
      return;
    }
    this.rWz = null;
    this.rWh.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7019855609856L, 52302);
        l.this.bxV();
        GMTrace.o(7019855609856L, 52302);
      }
    });
    GMTrace.o(7009789280256L, 52227);
  }
  
  public void bxV()
  {
    GMTrace.i(7009923497984L, 52228);
    iY(false);
    if (this.rWz != null) {
      this.rWz.onClick(this, 0);
    }
    dismiss();
    if (this.rWp != null) {
      this.rWp.a(this.rWo.getText(), this.rHn, this.rWA);
    }
    if (this.rWM < 0L)
    {
      w.e("MicroMsg.WalletPwdDialog", "hy: not set update mode time yet. abandon");
      GMTrace.o(7009923497984L, 52228);
      return;
    }
    if (this.rWH == 0)
    {
      com.tencent.mm.plugin.report.service.g.paX.a(686L, 0L, 1L, false);
      com.tencent.mm.plugin.report.service.g.paX.a(686L, 1L, bg.aG(this.rWM), false);
      GMTrace.o(7009923497984L, 52228);
      return;
    }
    if (this.rWH == 1)
    {
      com.tencent.mm.plugin.report.service.g.paX.a(686L, 2L, 1L, false);
      com.tencent.mm.plugin.report.service.g.paX.a(686L, 3L, bg.aG(this.rWM), false);
    }
    GMTrace.o(7009923497984L, 52228);
  }
  
  public final void bxz()
  {
    GMTrace.i(7011131457536L, 52237);
    this.isPaused = false;
    if (com.tencent.mm.x.m.zS())
    {
      GMTrace.o(7011131457536L, 52237);
      return;
    }
    GMTrace.o(7011131457536L, 52237);
  }
  
  public void cm(Context paramContext)
  {
    GMTrace.i(7007239143424L, 52208);
    w.v("MicroMsg.WalletPwdDialog", "alvinluo WalletPwdDialog initView");
    dp(paramContext);
    dq(paramContext);
    bxP();
    GMTrace.o(7007239143424L, 52208);
  }
  
  public final void dR(String paramString1, String paramString2)
  {
    GMTrace.i(7009118191616L, 52222);
    if (!TextUtils.isEmpty(paramString2))
    {
      this.rWn.setVisibility(0);
      this.rWn.setText(paramString2);
    }
    while (!TextUtils.isEmpty(paramString1))
    {
      this.rWx.setText(paramString1);
      this.rWx.setVisibility(0);
      GMTrace.o(7009118191616L, 52222);
      return;
      this.rWn.setVisibility(8);
    }
    this.rWx.setVisibility(8);
    GMTrace.o(7009118191616L, 52222);
  }
  
  public void dismiss()
  {
    GMTrace.i(7008581320704L, 52218);
    try
    {
      super.dismiss();
      bxS();
      this.rEx.destory();
      if (this.lZm != null) {
        this.lZm.cancel();
      }
      GMTrace.o(7008581320704L, 52218);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.WalletPwdDialog", "dismiss exception, e = " + localException.getMessage());
      }
    }
  }
  
  public final void dp(Context paramContext)
  {
    GMTrace.i(7007373361152L, 52209);
    this.krg = View.inflate(paramContext, bxT(), null);
    this.rWh = ((Button)this.krg.findViewById(R.h.ccw));
    this.rWi = ((ImageView)this.krg.findViewById(R.h.cJY));
    this.mKeyboard = ((MyKeyboardWindow)this.krg.findViewById(R.h.cAi));
    this.nzg = this.krg.findViewById(R.h.cAh);
    this.pfj = ((TextView)this.krg.findViewById(R.h.content));
    this.rWj = ((TextView)this.krg.findViewById(R.h.cJZ));
    this.oYK = ((TextView)this.krg.findViewById(R.h.bHM));
    this.rId = ((TextView)this.krg.findViewById(R.h.ciq));
    this.rId.getPaint().setFlags(16);
    this.rWk = ((TextView)this.krg.findViewById(R.h.blb));
    this.rWl = ((FavourLayout)this.krg.findViewById(R.h.bHK));
    this.rWm = ((ImageView)this.krg.findViewById(R.h.bkU));
    this.rWq = this.krg.findViewById(R.h.bHF);
    this.rWn = ((TextView)this.krg.findViewById(R.h.cdz));
    this.hvo = ((ImageView)this.krg.findViewById(R.h.bus));
    this.rWr = this.krg.findViewById(R.h.bkS);
    this.rWs = ((TextView)this.krg.findViewById(R.h.cvu));
    a.b.a(this.hvo, com.tencent.mm.wallet_core.ui.e.getUsername());
    this.rWo = ((EditHintPasswdView)this.krg.findViewById(R.h.bQg));
    this.rWt = ((ImageView)this.krg.findViewById(R.h.bOo));
    this.rWD = ((TextView)this.krg.findViewById(R.h.cJT));
    this.rWE = this.krg.findViewById(R.h.bIr);
    this.rWF = ((TextView)this.krg.findViewById(R.h.bIt));
    this.rWG = ((ImageView)this.krg.findViewById(R.h.bIq));
    this.rWu = ((TextView)this.krg.findViewById(R.h.brK));
    this.rWv = ((TextView)this.krg.findViewById(R.h.cnC));
    this.rWw = this.krg.findViewById(R.h.bHE);
    this.rWx = ((TextView)this.krg.findViewById(R.h.bHJ));
    this.rWl.setVisibility(8);
    GMTrace.o(7007373361152L, 52209);
  }
  
  @TargetApi(14)
  public void dq(Context paramContext)
  {
    GMTrace.i(7007507578880L, 52210);
    setCanceledOnTouchOutside(true);
    getWindow().setSoftInputMode(2);
    this.rWh.setEnabled(false);
    this.rWh.setTextColor(paramContext.getResources().getColorStateList(R.e.aQC));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rWo);
    this.rWo.xhY = new EditHintPasswdView.a()
    {
      public final void gQ(boolean paramAnonymousBoolean)
      {
        GMTrace.i(6920400273408L, 51561);
        if (paramAnonymousBoolean)
        {
          l.this.bxV();
          com.tencent.mm.plugin.report.service.g.paX.i(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        }
        GMTrace.o(6920400273408L, 51561);
      }
    };
    this.rWo.requestFocus();
    Object localObject = (TextView)this.krg.findViewById(R.h.cJZ);
    if (localObject != null) {
      if (!com.tencent.mm.x.m.zS()) {
        break label212;
      }
    }
    label212:
    for (paramContext = paramContext.getString(R.l.eYc);; paramContext = paramContext.getString(R.l.eYb))
    {
      ((TextView)localObject).setText(paramContext);
      paramContext = (EditText)this.krg.findViewById(R.h.cIF);
      com.tencent.mm.wallet_core.ui.e.setNoSystemInputOnEditText(paramContext);
      this.mKeyboard.setInputEditText(paramContext);
      if (Build.VERSION.SDK_INT >= 14)
      {
        localObject = new com.tencent.mm.ui.a.c();
        this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
        paramContext.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
      }
      paramContext.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6946572730368L, 51756);
          if (!l.this.nzg.isShown()) {
            l.this.nzg.setVisibility(0);
          }
          GMTrace.o(6946572730368L, 51756);
        }
      });
      this.krg.findViewById(R.h.cAj).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6960799809536L, 51862);
          if (l.this.nzg.isShown()) {
            l.this.nzg.setVisibility(8);
          }
          GMTrace.o(6960799809536L, 51862);
        }
      });
      GMTrace.o(7007507578880L, 52210);
      return;
    }
  }
  
  public final void iX(boolean paramBoolean)
  {
    GMTrace.i(7010191933440L, 52230);
    if (paramBoolean)
    {
      this.rWr.setVisibility(0);
      GMTrace.o(7010191933440L, 52230);
      return;
    }
    this.rWr.setVisibility(8);
    GMTrace.o(7010191933440L, 52230);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7008312885248L, 52216);
    super.onCreate(paramBundle);
    setContentView(this.krg);
    com.tencent.d.b.f.f.cmE().cmF();
    GMTrace.o(7008312885248L, 52216);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7008178667520L, 52215);
    if (paramInt == 4)
    {
      if (this.Fo != null) {
        this.Fo.onCancel(this);
      }
      if (this.rWy != null) {
        this.rWy.aTX();
      }
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(7008178667520L, 52215);
    return bool;
  }
  
  public void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(7008447102976L, 52217);
    super.setCancelable(paramBoolean);
    this.pwK = paramBoolean;
    setCanceledOnTouchOutside(this.pwK);
    GMTrace.o(7008447102976L, 52217);
  }
  
  public static abstract interface a
  {
    public abstract void aTX();
  }
  
  private static final class b
    implements DialogInterface.OnCancelListener
  {
    private DialogInterface.OnCancelListener rWY;
    
    public b(DialogInterface.OnCancelListener paramOnCancelListener)
    {
      GMTrace.i(6946706948096L, 51757);
      this.rWY = null;
      this.rWY = paramOnCancelListener;
      GMTrace.o(6946706948096L, 51757);
    }
    
    public final void onCancel(DialogInterface paramDialogInterface)
    {
      GMTrace.i(6946841165824L, 51758);
      l.iZ(false);
      if (this.rWY != null) {
        this.rWY.onCancel(paramDialogInterface);
      }
      GMTrace.o(6946841165824L, 51758);
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(String paramString, FavorPayInfo paramFavorPayInfo, boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */