package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.bu;
import com.tencent.mm.g.a.ce;
import com.tencent.mm.g.a.kg;
import com.tencent.mm.g.a.kt;
import com.tencent.mm.g.a.op;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.g.a.sb.b;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.offline.a.q;
import com.tencent.mm.plugin.offline.a.r;
import com.tencent.mm.plugin.offline.a.r.a;
import com.tencent.mm.plugin.offline.a.r.b;
import com.tencent.mm.plugin.offline.a.r.c;
import com.tencent.mm.plugin.offline.a.r.d;
import com.tencent.mm.plugin.offline.a.r.e;
import com.tencent.mm.plugin.offline.a.r.f;
import com.tencent.mm.plugin.offline.a.r.g;
import com.tencent.mm.plugin.offline.i;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.l;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.at;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.au.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.x.ap;
import com.tencent.recovery.wx.util.NetUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WalletOfflineCoinPurseUI
  extends WalletBaseUI
  implements j.a, r.a, com.tencent.mm.plugin.offline.b, a, au.a
{
  private static int jzk;
  private int hys;
  private View.OnClickListener iom;
  private boolean kuB;
  private int lFH;
  private boolean las;
  private long mLastTime;
  private int mState;
  private String omV;
  private com.tencent.mm.plugin.offline.a.m omX;
  private int omZ;
  private String oms;
  private aj ona;
  private HashMap<String, View> ooO;
  private HashMap<String, Integer> ooP;
  Bitmap ooQ;
  Bitmap ooR;
  private a ooS;
  private ArrayList<String> ooT;
  private ArrayList<String> ooU;
  private ArrayList<Boolean> ooV;
  View ooW;
  private ImageView ooX;
  private ImageView ooY;
  private TextView ooZ;
  private com.tencent.mm.sdk.b.c opA;
  public boolean opB;
  private aj opC;
  private aj opD;
  private String opa;
  private View opb;
  private TextView opc;
  private ImageView opd;
  RelativeLayout ope;
  private LinearLayout opf;
  private LinearLayout opg;
  private LinearLayout oph;
  private LinearLayout opi;
  private Dialog opj;
  private String opk;
  private boolean opl;
  private com.tencent.mm.plugin.offline.g opm;
  private boolean opn;
  private ArrayList<Bitmap> opo;
  private ArrayList<Bitmap> opp;
  private com.tencent.mm.wallet_core.ui.c opq;
  private c opr;
  OfflineAlertView ops;
  private boolean opt;
  com.tencent.mm.sdk.b.c<sh> opu;
  private com.tencent.mm.sdk.b.c<ce> opv;
  private com.tencent.mm.sdk.b.c<kt> opw;
  private com.tencent.mm.sdk.b.c<kg> opx;
  private com.tencent.mm.sdk.b.c opy;
  private com.tencent.mm.sdk.b.c opz;
  
  static
  {
    GMTrace.i(6225555095552L, 46384);
    jzk = 0;
    GMTrace.o(6225555095552L, 46384);
  }
  
  public WalletOfflineCoinPurseUI()
  {
    GMTrace.i(6215622983680L, 46310);
    this.mLastTime = 0L;
    this.mState = 3;
    this.ooO = new HashMap();
    this.ooP = new HashMap();
    this.hys = -1;
    this.ooQ = null;
    this.ooR = null;
    this.ooT = new ArrayList();
    this.ooU = new ArrayList();
    this.ooV = new ArrayList();
    this.oms = "";
    this.opk = "";
    this.omV = "";
    this.kuB = true;
    this.opl = false;
    this.opn = false;
    this.opo = new ArrayList();
    this.opp = new ArrayList();
    this.opt = false;
    this.opu = new com.tencent.mm.sdk.b.c() {};
    this.opv = new com.tencent.mm.sdk.b.c() {};
    this.opw = new com.tencent.mm.sdk.b.c() {};
    this.opx = new com.tencent.mm.sdk.b.c() {};
    this.opy = new com.tencent.mm.sdk.b.c() {};
    this.opz = new com.tencent.mm.sdk.b.c() {};
    this.opA = new com.tencent.mm.sdk.b.c() {};
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19255143694336L, 143462);
        long l;
        if ((paramAnonymousView.getId() == R.h.cKa) || (paramAnonymousView.getId() == R.h.cIl) || (paramAnonymousView.getId() == R.h.cIm))
        {
          if ((paramAnonymousView.getId() == R.h.cKa) && (WalletOfflineCoinPurseUI.s(WalletOfflineCoinPurseUI.this) != null) && (WalletOfflineCoinPurseUI.s(WalletOfflineCoinPurseUI.this).isShowing()))
          {
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "offlineAlertView is showing");
            GMTrace.o(19255143694336L, 143462);
            return;
          }
          l = System.currentTimeMillis();
          if (((WalletOfflineCoinPurseUI.s(WalletOfflineCoinPurseUI.this) == null) || (!WalletOfflineCoinPurseUI.s(WalletOfflineCoinPurseUI.this).isShowing())) && (l - WalletOfflineCoinPurseUI.t(WalletOfflineCoinPurseUI.this) >= 400L) && (com.tencent.mm.plugin.offline.c.a.aUp()) && (!WalletOfflineCoinPurseUI.u(WalletOfflineCoinPurseUI.this)))
          {
            if (paramAnonymousView.getId() != R.h.cKa) {
              break label218;
            }
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, false);
          }
        }
        for (;;)
        {
          if (WalletOfflineCoinPurseUI.v(WalletOfflineCoinPurseUI.this) != null)
          {
            WalletOfflineCoinPurseUI.w(WalletOfflineCoinPurseUI.this);
            WalletOfflineCoinPurseUI.v(WalletOfflineCoinPurseUI.this).t(paramAnonymousView, WalletOfflineCoinPurseUI.x(WalletOfflineCoinPurseUI.this));
          }
          WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, l);
          GMTrace.o(19255143694336L, 143462);
          return;
          label218:
          if ((paramAnonymousView.getId() == R.h.cIl) || (paramAnonymousView.getId() == R.h.cIm))
          {
            com.tencent.mm.plugin.report.service.g.paX.i(13958, new Object[] { Integer.valueOf(4) });
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, true);
          }
        }
      }
    };
    this.opB = false;
    this.omZ = 60000;
    this.ona = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(17963029626880L, 133835);
        if (!WalletOfflineCoinPurseUI.G(WalletOfflineCoinPurseUI.this))
        {
          WalletOfflineCoinPurseUI.C(WalletOfflineCoinPurseUI.this);
          WalletOfflineCoinPurseUI.D(WalletOfflineCoinPurseUI.this);
        }
        aj localaj = WalletOfflineCoinPurseUI.I(WalletOfflineCoinPurseUI.this);
        long l = WalletOfflineCoinPurseUI.H(WalletOfflineCoinPurseUI.this);
        localaj.w(l, l);
        GMTrace.o(17963029626880L, 133835);
        return false;
      }
    }, false);
    this.opC = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(19258767572992L, 143489);
        WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this);
        if ((WalletOfflineCoinPurseUI.m(WalletOfflineCoinPurseUI.this) != null) && (WalletOfflineCoinPurseUI.m(WalletOfflineCoinPurseUI.this).isShowing())) {
          WalletOfflineCoinPurseUI.m(WalletOfflineCoinPurseUI.this).dismiss();
        }
        com.tencent.mm.plugin.offline.g.aTC();
        WalletOfflineCoinPurseUI.J(WalletOfflineCoinPurseUI.this);
        if (com.tencent.mm.plugin.offline.c.a.aUR()) {
          WalletOfflineCoinPurseUI.this.aTT();
        }
        GMTrace.o(19258767572992L, 143489);
        return false;
      }
    }, false);
    this.opD = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(19256083218432L, 143469);
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "onTimerExpired, send ConsumedCardByOfflinePay event: %s", new Object[] { Boolean.valueOf(WalletOfflineCoinPurseUI.K(WalletOfflineCoinPurseUI.this)) });
        if (WalletOfflineCoinPurseUI.K(WalletOfflineCoinPurseUI.this))
        {
          bu localbu = new bu();
          localbu.fwd.aHi = 0;
          com.tencent.mm.sdk.b.a.uLm.m(localbu);
        }
        WalletOfflineCoinPurseUI.this.finish();
        GMTrace.o(19256083218432L, 143469);
        return false;
      }
    }, false);
    GMTrace.o(6215622983680L, 46310);
  }
  
  private void aTY()
  {
    GMTrace.i(6215891419136L, 46312);
    aUj();
    aUl();
    aUk();
    aUh();
    GMTrace.o(6215891419136L, 46312);
  }
  
  private void aTZ()
  {
    GMTrace.i(6216159854592L, 46314);
    com.tencent.mm.wallet_core.ui.e.Eh(32);
    com.tencent.mm.pluginsdk.wallet.f.Q(this, this.lFH);
    GMTrace.o(6216159854592L, 46314);
  }
  
  private void aUa()
  {
    GMTrace.i(6217233596416L, 46322);
    if ((!this.opB) && (!com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext())))
    {
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.aTH();
      if (com.tencent.mm.plugin.offline.e.aTy() == 0)
      {
        this.opB = true;
        w.e("MicroMsg.OfflineErrorHelper", "offline code size is 0, show check network error dialog");
        com.tencent.mm.ui.base.h.a(this, getString(R.l.eZX), null, false, new b.4(this));
        w.e("MicroMsg.WalletOfflineCoinPurseUI", "network disconnect and code count == 0");
      }
    }
    GMTrace.o(6217233596416L, 46322);
  }
  
  private void aUb()
  {
    GMTrace.i(6217367814144L, 46323);
    int i = com.tencent.mm.plugin.offline.c.a.aUu();
    Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.aUs();
    if (c.aTV())
    {
      this.mState = 7;
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FREEZE");
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    if (!com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext()))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_DISCONNECT_NETWORK");
      this.mState = 6;
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    if (com.tencent.mm.plugin.offline.c.a.aUp())
    {
      if (i == 0)
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount == 0");
        this.mState = 1;
        GMTrace.o(6217367814144L, 46323);
        return;
      }
      if ((i != 0) && (localBankcard == null))
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount != 0 && bankcard == null");
        this.mState = 2;
        GMTrace.o(6217367814144L, 46323);
        return;
      }
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
      this.mState = 5;
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    if (i == 0)
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount == 0");
      this.mState = 1;
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    if ((i != 0) && (localBankcard == null))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount != 0 && bankcard == null");
      this.mState = 2;
      GMTrace.o(6217367814144L, 46323);
      return;
    }
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
    this.mState = 5;
    GMTrace.o(6217367814144L, 46323);
  }
  
  private boolean aUc()
  {
    GMTrace.i(6217770467328L, 46326);
    if ((this.mState == 2) || (this.mState == 1) || (this.mState == 7))
    {
      GMTrace.o(6217770467328L, 46326);
      return true;
    }
    GMTrace.o(6217770467328L, 46326);
    return false;
  }
  
  private void aUd()
  {
    GMTrace.i(6217904685056L, 46327);
    if (this.opq != null)
    {
      this.opq.ff(this.opk, this.omV);
      this.opq.ooQ = this.ooQ;
      this.opq.ooR = this.ooR;
      this.opq.cjf();
    }
    GMTrace.o(6217904685056L, 46327);
  }
  
  private void aUe()
  {
    GMTrace.i(15379069927424L, 114583);
    if ((this.opj != null) && (this.opj.isShowing())) {
      this.opj.dismiss();
    }
    GMTrace.o(15379069927424L, 114583);
  }
  
  private void aUf()
  {
    GMTrace.i(6218441555968L, 46331);
    b(new com.tencent.mm.plugin.offline.a.n(System.currentTimeMillis(), com.tencent.mm.plugin.offline.c.a.oqc), false);
    GMTrace.o(6218441555968L, 46331);
  }
  
  private void aUh()
  {
    GMTrace.i(6218978426880L, 46335);
    if (this.opn)
    {
      GMTrace.o(6218978426880L, 46335);
      return;
    }
    if (!this.ops.rS(4))
    {
      GMTrace.o(6218978426880L, 46335);
      return;
    }
    ap.AS();
    if ((!((Boolean)com.tencent.mm.x.c.xi().get(w.a.uZx, Boolean.valueOf(false))).booleanValue()) && (!this.ops.isShowing())) {
      aUi();
    }
    GMTrace.o(6218978426880L, 46335);
  }
  
  private void aUi()
  {
    GMTrace.i(6219112644608L, 46336);
    if (!this.ops.rS(4))
    {
      GMTrace.o(6219112644608L, 46336);
      return;
    }
    OfflineAlertView localOfflineAlertView = this.ops;
    View localView1 = this.ooW;
    localOfflineAlertView.setVisibility(0);
    localOfflineAlertView.oox.removeAllViews();
    View localView2 = LayoutInflater.from(localOfflineAlertView.getContext()).inflate(R.i.diN, null);
    localOfflineAlertView.oox.addView(localView2);
    com.tencent.mm.plugin.report.service.g.paX.i(13750, new Object[] { Integer.valueOf(1) });
    localView1.post(new OfflineAlertView.2(localOfflineAlertView, localView1, 4));
    GMTrace.o(6219112644608L, 46336);
  }
  
  private void aUj()
  {
    GMTrace.i(6219246862336L, 46337);
    if (!this.ops.rS(1))
    {
      GMTrace.o(6219246862336L, 46337);
      return;
    }
    if (this.ops.oow == 1) {
      this.ops.dismiss();
    }
    boolean bool1 = com.tencent.mm.plugin.wallet_core.model.m.bwE().bwV();
    boolean bool2 = com.tencent.mm.plugin.wallet_core.model.m.bwE().bwZ();
    if ((bool1) || (bool2))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "unreg: %B, simplereg: %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      this.ops.a(this.ooW, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17969606295552L, 133884);
          com.tencent.mm.plugin.offline.c.a.aUA();
          com.tencent.mm.plugin.offline.k.aTF();
          com.tencent.mm.plugin.offline.k.ag(196648, "0");
          WalletOfflineCoinPurseUI.E(WalletOfflineCoinPurseUI.this);
          GMTrace.o(17969606295552L, 133884);
        }
      }, 1);
    }
    GMTrace.o(6219246862336L, 46337);
  }
  
  private void aUk()
  {
    GMTrace.i(6219381080064L, 46338);
    if (!this.ops.rS(3))
    {
      GMTrace.o(6219381080064L, 46338);
      return;
    }
    if (this.ops.oow == 3) {
      this.ops.dismiss();
    }
    com.tencent.mm.plugin.offline.k.aTF();
    String str1 = com.tencent.mm.plugin.offline.k.rR(196617);
    com.tencent.mm.wallet_core.c.a.ciD();
    boolean bool1 = com.tencent.mm.wallet_core.c.a.isCertExist(str1);
    boolean bool2 = com.tencent.mm.plugin.offline.c.a.aUp();
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "show unopened alert, %B, %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((!bool1) || (!bool2)) {
      if (!bool1)
      {
        ap.AS();
        String str2 = (String)com.tencent.mm.x.c.xi().get(w.a.uTV, "");
        if ((str2 == null) || (!str2.equals(com.tencent.mm.compatible.d.p.te()))) {
          break label218;
        }
        w.i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is same between create and getToken");
      }
    }
    for (;;)
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineEntranceUI CertUtil.getInstance().isCertExist(cn) is false ,cn == " + str1 + " ,recreate offline");
      com.tencent.mm.plugin.offline.c.a.aUA();
      this.ops.a(this.ooW, new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17963969150976L, 133842);
          com.tencent.mm.plugin.offline.c.a.f(WalletOfflineCoinPurseUI.this, WalletOfflineCoinPurseUI.b(WalletOfflineCoinPurseUI.this));
          WalletOfflineCoinPurseUI.this.finish();
          GMTrace.o(17963969150976L, 133842);
        }
      }, 3);
      GMTrace.o(6219381080064L, 46338);
      return;
      label218:
      w.i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is diff between create and getToken");
    }
  }
  
  private boolean aUl()
  {
    GMTrace.i(6219515297792L, 46339);
    if (!this.ops.rS(2))
    {
      GMTrace.o(6219515297792L, 46339);
      return false;
    }
    if (this.ops.oow == 2) {
      this.ops.dismiss();
    }
    Object localObject1 = com.tencent.mm.plugin.offline.c.a.aUv();
    if (((List)localObject1).size() <= 0)
    {
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
      GMTrace.o(6219515297792L, 46339);
      return false;
    }
    int i = 0;
    while (i < ((List)localObject1).size())
    {
      localObject2 = (Bankcard)((List)localObject1).get(i);
      if ((localObject2 != null) && (((Bankcard)localObject2).field_support_micropay) && (bg.mZ(((Bankcard)localObject2).field_forbidWord)))
      {
        GMTrace.o(6219515297792L, 46339);
        return true;
      }
      i += 1;
    }
    this.ops.dismiss();
    localObject1 = this.ops;
    Object localObject2 = this.ooW;
    Runnable local22 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19257425395712L, 143479);
        c localc = WalletOfflineCoinPurseUI.y(WalletOfflineCoinPurseUI.this);
        com.tencent.mm.plugin.offline.c.a.e(localc.mActivity, localc.ooI);
        GMTrace.o(19257425395712L, 143479);
      }
    };
    Runnable local24 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19257559613440L, 143480);
        WalletOfflineCoinPurseUI.r(WalletOfflineCoinPurseUI.this);
        GMTrace.o(19257559613440L, 143480);
      }
    };
    ((OfflineAlertView)localObject1).setVisibility(0);
    ((OfflineAlertView)localObject1).oox.removeAllViews();
    View localView = LayoutInflater.from(((OfflineAlertView)localObject1).getContext()).inflate(R.i.diP, null);
    ((OfflineAlertView)localObject1).oox.addView(localView);
    ((View)localObject2).post(new OfflineAlertView.1((OfflineAlertView)localObject1, (View)localObject2, local22, local24, 2));
    GMTrace.o(6219515297792L, 46339);
    return false;
  }
  
  private void aUm()
  {
    GMTrace.i(6219649515520L, 46340);
    if ((this.ops != null) && (this.ops.isShowing()))
    {
      GMTrace.o(6219649515520L, 46340);
      return;
    }
    Object localObject3 = com.tencent.mm.plugin.offline.c.a.gx(false);
    if (((List)localObject3).size() <= 0)
    {
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
      this.opc.setVisibility(8);
      GMTrace.o(6219649515520L, 46340);
      return;
    }
    final ArrayList localArrayList = new ArrayList();
    int j = -1;
    int i = 0;
    int k = -1;
    final Object localObject1 = null;
    Object localObject2 = null;
    if (i < ((List)localObject3).size())
    {
      if (((Bankcard)((List)localObject3).get(i)).bwm())
      {
        localObject2 = (Bankcard)((List)localObject3).get(i);
        k = i;
      }
      if (!((Bankcard)((List)localObject3).get(i)).bwn()) {
        break label650;
      }
      localObject1 = (Bankcard)((List)localObject3).get(i);
      j = i;
    }
    label650:
    for (;;)
    {
      i += 1;
      break;
      if (localObject2 != null) {
        localArrayList.add(localObject2);
      }
      if (localObject1 != null) {
        localArrayList.add(localObject1);
      }
      i = 0;
      while (i < ((List)localObject3).size())
      {
        if ((i != j) && (i != k)) {
          localArrayList.add(((List)localObject3).get(i));
        }
        i += 1;
      }
      com.tencent.mm.plugin.offline.c.a.Dv(com.tencent.mm.plugin.offline.c.a.aUF());
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "showChangeBankcardDialog() bankcard size is " + localArrayList.size());
      localObject2 = com.tencent.mm.plugin.wallet_core.model.m.bwE().bxj();
      if ((localObject2 != null) && (((List)localObject2).size() > 0))
      {
        localObject1 = new LinkedList();
        localObject3 = localArrayList.iterator();
        while (((Iterator)localObject3).hasNext()) {
          ((List)localObject1).add((Bankcard)((Iterator)localObject3).next());
        }
        localArrayList.clear();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = f((List)localObject1, ((com.tencent.mm.plugin.wallet_core.model.c)((Iterator)localObject2).next()).oqm);
          if (localObject3 != null) {
            localArrayList.add(localObject3);
          }
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          localArrayList.add((Bankcard)((Iterator)localObject1).next());
        }
      }
      localObject1 = new com.tencent.mm.ui.widget.e(this, com.tencent.mm.ui.widget.e.wSQ, true);
      i = 0;
      for (j = 0; i < localArrayList.size(); j = k)
      {
        localObject2 = (Bankcard)localArrayList.get(i);
        k = j;
        if (!bg.mZ(((Bankcard)localObject2).field_bindSerial))
        {
          k = j;
          if (this.oms.equals(((Bankcard)localObject2).field_bindSerial)) {
            k = i;
          }
        }
        i += 1;
      }
      ((com.tencent.mm.ui.widget.e)localObject1).qQS = new o.c()
      {
        public final void a(com.tencent.mm.ui.base.m paramAnonymousm)
        {
          GMTrace.i(19256888524800L, 143475);
          int i = 0;
          Object localObject2;
          Object localObject1;
          Bitmap localBitmap;
          label157:
          Object localObject3;
          if (i < localArrayList.size())
          {
            localObject4 = (Bankcard)localArrayList.get(i);
            localObject2 = com.tencent.mm.plugin.offline.c.a.Dz(((Bankcard)localObject4).field_bankcardType);
            localObject1 = localObject2;
            if (((Bankcard)localObject4).bwn())
            {
              localObject1 = localObject2;
              if (((Bankcard)localObject4).rNi != null) {
                localObject1 = ((Bankcard)localObject4).rNi.oiq;
              }
            }
            localBitmap = com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject1));
            localObject2 = "";
            if (!bg.mZ(((Bankcard)localObject4).field_forbidWord)) {
              localObject2 = ((Bankcard)localObject4).field_forbidWord;
            }
            localObject1 = localObject2;
            if (bg.mZ((String)localObject2))
            {
              localObject1 = localObject2;
              if (!((Bankcard)localObject4).field_support_micropay)
              {
                if (!bg.mZ(((Bankcard)localObject4).field_no_micro_word)) {
                  break label369;
                }
                localObject1 = "";
              }
            }
            if (bg.mZ(((Bankcard)localObject4).field_forbid_title))
            {
              localObject3 = new SpannableString((CharSequence)localObject1);
              localObject2 = localObject1;
              localObject1 = localObject3;
              label187:
              if (((!((Bankcard)localObject4).bwm()) && (!((Bankcard)localObject4).bwn())) || (((Bankcard)localObject4).rNa < 0.0D)) {
                break label516;
              }
              localObject3 = ((Bankcard)localObject4).field_desc + WalletOfflineCoinPurseUI.this.getString(R.l.eSk, new Object[] { com.tencent.mm.wallet_core.ui.e.s(((Bankcard)localObject4).rNa) });
              label261:
              if (localBitmap == null) {
                break label555;
              }
            }
          }
          label337:
          label369:
          label516:
          label540:
          label555:
          for (final Object localObject4 = com.tencent.mm.sdk.platformtools.d.a(localBitmap, WalletOfflineCoinPurseUI.this.getResources().getDimensionPixelOffset(R.f.aVo), WalletOfflineCoinPurseUI.this.getResources().getDimensionPixelOffset(R.f.aVo), true, false);; localObject4 = null)
          {
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "i %d fee %s %s", new Object[] { Integer.valueOf(i), localObject3, localObject1 });
            if (localObject4 == null)
            {
              localObject4 = null;
              if (!bg.mZ((String)localObject2)) {
                break label540;
              }
            }
            for (boolean bool = false;; bool = true)
            {
              paramAnonymousm.a(i, (CharSequence)localObject3, (CharSequence)localObject1, (Drawable)localObject4, bool);
              i += 1;
              break;
              localObject1 = ((Bankcard)localObject4).field_no_micro_word;
              break label157;
              localObject2 = (String)localObject1 + " ";
              localObject1 = new SpannableString((String)localObject2 + ((Bankcard)localObject4).field_forbid_title);
              localObject3 = new com.tencent.mm.plugin.wallet_core.ui.f(WalletOfflineCoinPurseUI.this)
              {
                public final void onClick(View paramAnonymous2View)
                {
                  GMTrace.i(15383633330176L, 114617);
                  paramAnonymous2View = new Intent();
                  String str = localObject4.field_forbid_url;
                  w.i("MicroMsg.WalletOfflineCoinPurseUI", "go to url %s", new Object[] { str });
                  paramAnonymous2View.putExtra("rawUrl", str);
                  paramAnonymous2View.putExtra("geta8key_username", com.tencent.mm.x.m.zF());
                  paramAnonymous2View.putExtra("pay_channel", 1);
                  com.tencent.mm.bi.d.b(WalletOfflineCoinPurseUI.this.vov.voR, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramAnonymous2View);
                  GMTrace.o(15383633330176L, 114617);
                }
              };
              int j = ((String)localObject2).length();
              int k = ((String)localObject2).length() + ((Bankcard)localObject4).field_forbid_title.length();
              ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(WalletOfflineCoinPurseUI.this.getResources().getColor(R.e.aQL)), j, k, 33);
              ((SpannableString)localObject1).setSpan(localObject3, j, k, 33);
              break label187;
              localObject3 = ((Bankcard)localObject4).field_desc;
              break label261;
              localObject4 = new BitmapDrawable((Bitmap)localObject4);
              break label337;
            }
            GMTrace.o(19256888524800L, 143475);
            return;
          }
        }
      };
      ((com.tencent.mm.ui.widget.e)localObject1).qQT = new o.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(19259036008448L, 143491);
          if (localObject1 != null)
          {
            localObject1.bCW();
            paramAnonymousMenuItem = (Bankcard)localArrayList.get(paramAnonymousInt);
            com.tencent.mm.plugin.report.service.g.paX.i(14515, new Object[] { Integer.valueOf(3) });
            if ((!bg.mZ(paramAnonymousMenuItem.field_forbid_title)) || (!bg.mZ(paramAnonymousMenuItem.field_forbidWord)) || (!paramAnonymousMenuItem.field_support_micropay)) {
              com.tencent.mm.plugin.report.service.g.paX.i(14515, new Object[] { Integer.valueOf(4) });
            }
            paramAnonymousMenuItem = paramAnonymousMenuItem.field_bindSerial;
            if ((!TextUtils.isEmpty(paramAnonymousMenuItem)) && (!paramAnonymousMenuItem.equals(WalletOfflineCoinPurseUI.B(WalletOfflineCoinPurseUI.this))))
            {
              WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, paramAnonymousMenuItem);
              com.tencent.mm.plugin.offline.c.a.Dt(WalletOfflineCoinPurseUI.B(WalletOfflineCoinPurseUI.this));
              com.tencent.mm.plugin.offline.k.aTF();
              com.tencent.mm.plugin.offline.k.aTH().oms = WalletOfflineCoinPurseUI.B(WalletOfflineCoinPurseUI.this);
              WalletOfflineCoinPurseUI.this.aUg();
              WalletOfflineCoinPurseUI.C(WalletOfflineCoinPurseUI.this);
              WalletOfflineCoinPurseUI.D(WalletOfflineCoinPurseUI.this);
            }
          }
          GMTrace.o(19259036008448L, 143491);
        }
      };
      localObject2 = View.inflate(this, R.i.diK, null);
      ((com.tencent.mm.ui.widget.e)localObject1).oSN = true;
      ((com.tencent.mm.ui.widget.e)localObject1).wSZ = j;
      ((com.tencent.mm.ui.widget.e)localObject1).wSX = true;
      ((com.tencent.mm.ui.widget.e)localObject1).dG((View)localObject2);
      ((com.tencent.mm.ui.widget.e)localObject1).bCV();
      com.tencent.mm.plugin.report.service.g.paX.i(13955, new Object[] { Integer.valueOf(3) });
      GMTrace.o(6219649515520L, 46340);
      return;
    }
  }
  
  private static void aUn()
  {
    GMTrace.i(6219917950976L, 46342);
    if (!com.tencent.mm.plugin.offline.c.a.aUJ())
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineUtil.isSameMD5ForBindSerial() return false, token is invalid, do doNetSceneToken");
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.aTI().cE(3, 3);
    }
    GMTrace.o(6219917950976L, 46342);
  }
  
  private void alo()
  {
    GMTrace.i(6218038902784L, 46328);
    int i;
    if (this.opo.size() >= 2)
    {
      i = this.opo.size() - 1;
      while (i > 1)
      {
        com.tencent.mm.wallet_core.ui.e.u((Bitmap)this.opo.remove(i));
        i -= 1;
      }
    }
    if (this.opp.size() >= 2)
    {
      i = this.opp.size() - 1;
      while (i > 1)
      {
        com.tencent.mm.wallet_core.ui.e.u((Bitmap)this.opp.remove(i));
        i -= 1;
      }
    }
    GMTrace.o(6218038902784L, 46328);
  }
  
  private static Bankcard f(List<Bankcard> paramList, String paramString)
  {
    GMTrace.i(17965445545984L, 133853);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Bankcard localBankcard = (Bankcard)localIterator.next();
      if (paramString.equals(localBankcard.field_bindSerial))
      {
        paramList.remove(localBankcard);
        GMTrace.o(17965445545984L, 133853);
        return localBankcard;
      }
    }
    GMTrace.o(17965445545984L, 133853);
    return null;
  }
  
  private void gw(boolean paramBoolean)
  {
    GMTrace.i(6217636249600L, 46325);
    long l = System.currentTimeMillis();
    Object localObject1;
    label255:
    label288:
    label354:
    label387:
    int i;
    label455:
    int j;
    if ((paramBoolean) && ((bg.mZ(this.opk)) || (bg.mZ(this.omV))))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "empty code!");
      if (this.ops.rS(5))
      {
        if (this.ops.oow == 5) {
          this.ops.dismiss();
        }
        localObject1 = this.ops;
        localObject2 = this.ooW;
        View.OnClickListener local20 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(19259170226176L, 143492);
            com.tencent.mm.plugin.offline.k.aTF();
            com.tencent.mm.plugin.offline.k.aTI();
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "do get token, %s", new Object[] { Integer.valueOf(i.aTE()) });
            com.tencent.mm.plugin.offline.k.aTF();
            com.tencent.mm.plugin.offline.k.aTI();
            if (i.aTE() <= 0)
            {
              paramAnonymousView = new com.tencent.mm.plugin.offline.a.m((int)(System.currentTimeMillis() / 1000L), 10);
              WalletOfflineCoinPurseUI.this.r(paramAnonymousView);
              GMTrace.o(19259170226176L, 143492);
              return;
            }
            WalletOfflineCoinPurseUI.F(WalletOfflineCoinPurseUI.this);
            GMTrace.o(19259170226176L, 143492);
          }
        };
        ((OfflineAlertView)localObject1).oow = 5;
        ((OfflineAlertView)localObject1).setVisibility(0);
        ((OfflineAlertView)localObject1).ooy = false;
        ((OfflineAlertView)localObject1).oox.removeAllViews();
        Object localObject3 = LayoutInflater.from(((OfflineAlertView)localObject1).getContext()).inflate(R.i.diS, null);
        ((OfflineAlertView)localObject1).oox.addView((View)localObject3);
        ((TextView)((View)localObject3).findViewById(R.h.bhF)).setText(R.l.ett);
        localObject3 = (Button)((View)localObject3).findViewById(R.h.bOS);
        ((Button)localObject3).setText(R.l.ets);
        ((Button)localObject3).setOnClickListener(local20);
        ((View)localObject2).post(new OfflineAlertView.8((OfflineAlertView)localObject1, (View)localObject2));
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 73L, 1L, true);
      }
      Object localObject2 = this.ooQ;
      if (!TextUtils.isEmpty(this.opk)) {
        break label610;
      }
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "getBitmap mQRcode == null");
      localObject1 = null;
      this.ooQ = ((Bitmap)localObject1);
      this.ooX.setImageBitmap(this.ooQ);
      if (!aUc()) {
        break label625;
      }
      this.ooX.setAlpha(10);
      this.opo.add(0, localObject2);
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh qrcode is " + (System.currentTimeMillis() - l));
      localObject2 = this.ooR;
      if (!TextUtils.isEmpty(this.omV)) {
        break label638;
      }
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "getBarcodeBitmap mBarcode == null");
      localObject1 = null;
      this.ooR = ((Bitmap)localObject1);
      this.ooY.setImageBitmap(this.ooR);
      if (!aUc()) {
        break label653;
      }
      this.ooY.setAlpha(10);
      this.opp.add(0, localObject2);
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh is " + (System.currentTimeMillis() - l));
      alo();
      aUd();
      com.tencent.mm.wallet_core.c.o.eK(10, 0);
      localObject1 = com.tencent.mm.plugin.report.service.g.paX;
      if (!com.tencent.mm.plugin.offline.c.a.cQ(ab.getContext())) {
        break label666;
      }
      i = 0;
      if (!com.tencent.pb.common.b.h.isNetworkConnected()) {
        break label671;
      }
      j = 1;
      label463:
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.aTH();
      ((com.tencent.mm.plugin.report.service.g)localObject1).i(14163, new Object[] { Integer.valueOf(3), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(com.tencent.mm.plugin.offline.e.aTy()) });
      com.tencent.mm.plugin.report.service.g.paX.a(135L, 67L, 1L, true);
      if (!NetUtil.isConnected(this)) {
        break label676;
      }
      com.tencent.mm.plugin.report.service.g.paX.a(135L, 32L, 1L, true);
    }
    for (;;)
    {
      if (!com.tencent.mm.plugin.offline.c.a.cQ(this)) {
        break label693;
      }
      com.tencent.mm.plugin.report.service.g.paX.a(135L, 34L, 1L, true);
      GMTrace.o(6217636249600L, 46325);
      return;
      if ((!this.ops.isShowing()) || (this.ops.oow != 5)) {
        break;
      }
      this.ops.dismiss();
      break;
      label610:
      localObject1 = com.tencent.mm.bn.a.a.b(this, this.opk, 0, 3);
      break label255;
      label625:
      this.ooX.setAlpha(255);
      break label288;
      label638:
      localObject1 = com.tencent.mm.bn.a.a.b(this, this.omV, 5, 0);
      break label354;
      label653:
      this.ooY.setAlpha(255);
      break label387;
      label666:
      i = 1;
      break label455;
      label671:
      j = 0;
      break label463;
      label676:
      com.tencent.mm.plugin.report.service.g.paX.a(135L, 33L, 1L, true);
    }
    label693:
    com.tencent.mm.plugin.report.service.g.paX.a(135L, 35L, 1L, true);
    GMTrace.o(6217636249600L, 46325);
  }
  
  private void o(boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(6217099378688L, 46321);
    if (com.tencent.mm.plugin.offline.c.a.gx(true).size() > 0)
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList size > 0");
      aUg();
      Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.aUr();
      if (localBankcard != null)
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "initBindSerial() have bankcard");
        com.tencent.mm.plugin.offline.c.a.Dt(localBankcard.field_bindSerial);
        this.oms = localBankcard.field_bindSerial;
        com.tencent.mm.plugin.offline.k.aTF();
        com.tencent.mm.plugin.offline.k.aTH().oms = this.oms;
        this.opb.setVisibility(0);
        label88:
        if (paramBoolean1) {
          rT(0);
        }
        gw(paramBoolean2);
        if (!com.tencent.mm.plugin.offline.c.a.aUp()) {
          break label163;
        }
        this.ope.setVisibility(0);
      }
    }
    for (;;)
    {
      aUa();
      GMTrace.o(6217099378688L, 46321);
      return;
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "initBindSerial() fail,  bankcard == null");
      break;
      this.opb.setVisibility(8);
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList== null or size is 0");
      break label88;
      label163:
      this.ope.setVisibility(4);
    }
  }
  
  private void rT(int paramInt)
  {
    int i = 0;
    GMTrace.i(6218173120512L, 46329);
    if (!com.tencent.mm.plugin.offline.c.a.aUp())
    {
      w.w("MicroMsg.WalletOfflineCoinPurseUI", "offline is not create!");
      GMTrace.o(6218173120512L, 46329);
      return;
    }
    com.tencent.mm.plugin.offline.k.aTF();
    Object localObject1 = com.tencent.mm.plugin.offline.k.aTH();
    int j = this.hys;
    Object localObject2 = this.opa;
    w.i("MicroMsg.OfflineCodesMgr", "generatetKey scene %s isSnapshot %s stack: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), bg.bOd().toString() });
    localObject1 = ((com.tencent.mm.plugin.offline.e)localObject1).n(j, paramInt, (String)localObject2);
    this.omV = ((String)localObject1);
    this.opk = ((String)localObject1);
    w.v("MicroMsg.WalletOfflineCoinPurseUI", "updateCode isSnapshot:%s mBarcode:%s mQRcode:%s stack: %s", new Object[] { Integer.valueOf(paramInt), this.omV, this.opk, bg.bOd().toString() });
    localObject2 = com.tencent.mm.plugin.wallet_core.model.h.bww();
    Object localObject3 = new StringBuilder().append(this.opk);
    ap.AS();
    localObject3 = aa.QW(com.tencent.mm.a.o.getString(com.tencent.mm.x.c.wy()));
    if (localObject2 != null) {
      com.tencent.mm.plugin.report.service.g.paX.i(13444, new Object[] { ((at)localObject2).tuj, ((at)localObject2).tuk, Long.valueOf(((at)localObject2).tui), localObject3, ((at)localObject2).tul, ((at)localObject2).tum });
    }
    if (bg.mZ((String)localObject1))
    {
      localObject1 = com.tencent.mm.plugin.report.service.g.paX;
      if (com.tencent.mm.plugin.offline.c.a.cQ(ab.getContext())) {}
      for (paramInt = 0;; paramInt = 1)
      {
        if (com.tencent.pb.common.b.h.isNetworkConnected()) {
          i = 1;
        }
        ((com.tencent.mm.plugin.report.service.g)localObject1).i(14163, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(i) });
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 26L, 1L, true);
        if (!com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext())) {
          break;
        }
        com.tencent.mm.plugin.report.service.g.paX.a(135L, 28L, 1L, true);
        GMTrace.o(6218173120512L, 46329);
        return;
      }
      com.tencent.mm.plugin.report.service.g.paX.a(135L, 27L, 1L, true);
    }
    GMTrace.o(6218173120512L, 46329);
  }
  
  protected final void MH()
  {
    GMTrace.i(6216965160960L, 46320);
    this.ops = ((OfflineAlertView)findViewById(R.h.chr));
    this.ops.dismiss();
    this.ops.ooz = new OfflineAlertView.a()
    {
      public final void onClose()
      {
        GMTrace.i(19255680565248L, 143466);
        WalletOfflineCoinPurseUI.f(WalletOfflineCoinPurseUI.this);
        GMTrace.o(19255680565248L, 143466);
      }
      
      public final void onShow()
      {
        GMTrace.i(19255814782976L, 143467);
        WalletOfflineCoinPurseUI.f(WalletOfflineCoinPurseUI.this);
        GMTrace.o(19255814782976L, 143467);
      }
    };
    com.tencent.mm.wallet_core.c.a.ciD();
    com.tencent.mm.wallet_core.c.a.init(getApplicationContext());
    final Object localObject;
    if (this.hys == 3)
    {
      oC(R.l.fad);
      this.opr = new c(this, this);
      localObject = this.opr;
      ((c)localObject).kiq = ((Vibrator)((c)localObject).mActivity.getSystemService("vibrator"));
      this.opq = new com.tencent.mm.wallet_core.ui.c(this, true);
      this.opq.init();
      this.ooW = findViewById(R.h.cKb);
      this.ooX = ((ImageView)findViewById(R.h.cKa));
      this.ooY = ((ImageView)findViewById(R.h.cIl));
      this.ooZ = ((TextView)findViewById(R.h.cIm));
      this.opb = findViewById(R.h.cKm);
      this.opc = ((TextView)findViewById(R.h.cKo));
      this.opd = ((ImageView)findViewById(R.h.cKl));
      this.ope = ((RelativeLayout)findViewById(R.h.cJg));
      this.ope.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17964103368704L, 133843);
          WalletOfflineCoinPurseUI.q(WalletOfflineCoinPurseUI.this);
          GMTrace.o(17964103368704L, 133843);
        }
      });
      this.ooX.setOnClickListener(this.iom);
      this.ooY.setOnClickListener(this.iom);
      this.ooZ.setOnClickListener(this.iom);
      this.opb.setClickable(true);
      this.opb.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19257022742528L, 143476);
          com.tencent.mm.plugin.report.service.g.paX.i(14515, new Object[] { Integer.valueOf(1) });
          WalletOfflineCoinPurseUI.r(WalletOfflineCoinPurseUI.this);
          GMTrace.o(19257022742528L, 143476);
        }
      });
      this.mLastTime = System.currentTimeMillis();
      this.opf = ((LinearLayout)findViewById(R.h.cJe));
      this.opg = ((LinearLayout)findViewById(R.h.cJd));
      this.oph = ((LinearLayout)findViewById(R.h.cJf));
      this.opi = ((LinearLayout)findViewById(R.h.cJh));
      if (this.hys != 3) {
        break label704;
      }
      this.opf.setVisibility(8);
      this.opg.setVisibility(8);
      this.oph.setVisibility(8);
      this.opi.setVisibility(8);
      if ((com.tencent.mm.plugin.offline.c.a.aUp()) && (c.aTV()))
      {
        localObject = this.opr;
        com.tencent.mm.plugin.offline.k.aTF();
        ((c)localObject).a(com.tencent.mm.plugin.offline.k.aTG().ood);
      }
      aUb();
      o(true, false);
      localObject = this.ona;
      long l1 = this.omZ;
      ((aj)localObject).w(l1, l1);
      if ((com.tencent.mm.plugin.offline.c.a.oqc != 3) || (!com.tencent.mm.plugin.offline.c.a.oqf)) {
        break label1112;
      }
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, is marked!");
      int i = com.tencent.mm.plugin.offline.c.a.oqd;
      l1 = com.tencent.mm.plugin.offline.c.a.oqe;
      long l2 = System.currentTimeMillis();
      long l3 = i * 1000 + l1 - l2;
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "expire_time:" + i + " beginTime:" + l1 + " now:" + l2 + " interval:" + l3);
      if ((com.tencent.mm.plugin.offline.c.a.oqd <= 0) || (com.tencent.mm.plugin.offline.c.a.oqe <= 0L) || (l3 <= 0L)) {
        break label1100;
      }
      if (!this.opD.bNt()) {
        this.opD.MM();
      }
      this.opD.w(l3, l3);
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "start card expire timer!");
    }
    for (;;)
    {
      aUa();
      localObject = new sb();
      ((sb)localObject).fQc.fQe = "5";
      ((sb)localObject).fwM = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17961284796416L, 133822);
          if (!bg.mZ(localObject.fQd.fQf))
          {
            com.tencent.mm.wallet_core.ui.e.a((TextView)WalletOfflineCoinPurseUI.this.findViewById(R.h.ble), localObject.fQd.fQf, localObject.fQd.content, localObject.fQd.url);
            GMTrace.o(17961284796416L, 133822);
            return;
          }
          w.i("MicroMsg.WalletOfflineCoinPurseUI", "no bulletin data");
          GMTrace.o(17961284796416L, 133822);
        }
      };
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      GMTrace.o(6216965160960L, 46320);
      return;
      oC(R.l.fae);
      break;
      label704:
      localObject = com.tencent.mm.x.c.c.Cu().em("100292");
      label781:
      final boolean bool1;
      final boolean bool2;
      final boolean bool3;
      final ImageView localImageView1;
      final ImageView localImageView2;
      final TextView localTextView;
      final ImageView localImageView3;
      if (((((com.tencent.mm.storage.c)localObject).isValid()) && ("1".equals(((com.tencent.mm.storage.c)localObject).bPn().get("open")))) || (com.tencent.mm.sdk.a.b.bMv()))
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "abtest open reward, %s", new Object[] { Boolean.valueOf(com.tencent.mm.sdk.a.b.bMv()) });
        this.opi.setVisibility(0);
        bool1 = com.tencent.mm.s.c.vP().aD(262160, 266248);
        bool2 = com.tencent.mm.s.c.vP().aD(262161, 266248);
        bool3 = com.tencent.mm.s.c.vP().aD(262162, 266248);
        localObject = (ImageView)this.opg.findViewById(R.h.bfG);
        localImageView1 = (ImageView)this.opf.findViewById(R.h.bFW);
        localImageView2 = (ImageView)this.oph.findViewById(R.h.bFT);
        localTextView = (TextView)this.opf.findViewById(R.h.bFY);
        localImageView3 = (ImageView)this.opf.findViewById(R.h.bFX);
        if (bool1) {
          ((ImageView)localObject).setVisibility(0);
        }
        if (bool2)
        {
          ap.AS();
          String str = (String)com.tencent.mm.x.c.xi().get(w.a.vdl, "");
          if (bg.mZ(str)) {
            break label1091;
          }
          localTextView.setText(str);
          localTextView.setVisibility(0);
          localImageView3.setVisibility(0);
        }
      }
      for (;;)
      {
        if (bool3) {
          localImageView2.setVisibility(0);
        }
        getWindow().getDecorView().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19263062540288L, 143521);
            ScrollView localScrollView = (ScrollView)WalletOfflineCoinPurseUI.this.findViewById(R.h.chu);
            int[] arrayOfInt = new int[2];
            localScrollView.getLocationInWindow(arrayOfInt);
            int i = ad.fe(WalletOfflineCoinPurseUI.this.vov.voR).y;
            int j = i;
            if (ad.fd(WalletOfflineCoinPurseUI.this.vov.voR))
            {
              w.d("MicroMsg.WalletOfflineCoinPurseUI", "has navi");
              j = i - ad.fc(WalletOfflineCoinPurseUI.this.vov.voR);
            }
            if (bool2) {}
            for (i = arrayOfInt[1] + WalletOfflineCoinPurseUI.g(WalletOfflineCoinPurseUI.this).getBottom();; i = 0)
            {
              if (bool1) {
                i = arrayOfInt[1] + WalletOfflineCoinPurseUI.h(WalletOfflineCoinPurseUI.this).getBottom();
              }
              if (bool3) {
                i = arrayOfInt[1] + WalletOfflineCoinPurseUI.i(WalletOfflineCoinPurseUI.this).getBottom();
              }
              w.d("MicroMsg.WalletOfflineCoinPurseUI", "f2f: %s, screen: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
              i -= j;
              if (i > 0) {
                localScrollView.scrollBy(0, i);
              }
              GMTrace.o(19263062540288L, 143521);
              return;
            }
          }
        });
        this.opf.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(15048223227904L, 112118);
            if (com.tencent.mm.s.c.vP().aD(262161, 266248))
            {
              com.tencent.mm.s.c.vP().aE(262161, 266248);
              localImageView1.setVisibility(8);
              localTextView.setVisibility(8);
              localImageView3.setVisibility(8);
              ap.AS();
              com.tencent.mm.x.c.xi().a(w.a.vdl, "");
              com.tencent.mm.plugin.report.service.g.paX.i(14396, new Object[] { Integer.valueOf(3) });
            }
            if (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY())
            {
              WalletOfflineCoinPurseUI.j(WalletOfflineCoinPurseUI.this);
              GMTrace.o(15048223227904L, 112118);
              return;
            }
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, com.tencent.mm.wallet_core.ui.g.a(WalletOfflineCoinPurseUI.this.vov.voR, false, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(19257291177984L, 143478);
                WalletOfflineCoinPurseUI.k(WalletOfflineCoinPurseUI.this);
                GMTrace.o(19257291177984L, 143478);
              }
            }));
            com.tencent.mm.plugin.wallet_core.model.m.bwz();
            if (!com.tencent.mm.plugin.wallet_core.model.m.b(WalletOfflineCoinPurseUI.this, WalletOfflineCoinPurseUI.l(WalletOfflineCoinPurseUI.this), new a.a()
            {
              public final boolean a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, boolean paramAnonymous2Boolean)
              {
                GMTrace.i(19262794104832L, 143519);
                w.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + paramAnonymous2Int1 + ";errCode=" + paramAnonymous2Int2 + ";errMsg=" + paramAnonymous2String + ";hadAgree = " + paramAnonymous2Boolean);
                if (paramAnonymous2Int1 == 2)
                {
                  paramAnonymous2String = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("collect");
                  WalletOfflineCoinPurseUI.this.b(paramAnonymous2String, false);
                }
                for (;;)
                {
                  GMTrace.o(19262794104832L, 143519);
                  return true;
                  if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Boolean))
                  {
                    paramAnonymous2String = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("collect");
                    WalletOfflineCoinPurseUI.this.b(paramAnonymous2String, false);
                  }
                  else if (WalletOfflineCoinPurseUI.m(WalletOfflineCoinPurseUI.this) != null)
                  {
                    WalletOfflineCoinPurseUI.m(WalletOfflineCoinPurseUI.this).dismiss();
                  }
                }
              }
            }))
            {
              paramAnonymousView = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("collect");
              WalletOfflineCoinPurseUI.this.r(paramAnonymousView);
            }
            GMTrace.o(15048223227904L, 112118);
          }
        });
        this.opg.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(16586626826240L, 123580);
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "click aa");
            com.tencent.mm.plugin.report.service.g.paX.i(14021, new Object[] { Integer.valueOf(3), Integer.valueOf(WalletOfflineCoinPurseUI.n(WalletOfflineCoinPurseUI.this)) });
            com.tencent.mm.bi.d.y(WalletOfflineCoinPurseUI.this.vov.voR, "aa", ".ui.AAEntranceUI");
            if (com.tencent.mm.s.c.vP().aD(262160, 266248))
            {
              com.tencent.mm.s.c.vP().aE(262160, 266248);
              localObject.setVisibility(8);
              com.tencent.mm.plugin.report.service.g.paX.i(14396, new Object[] { Integer.valueOf(4) });
            }
            GMTrace.o(16586626826240L, 123580);
          }
        });
        this.oph.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17084171943936L, 127287);
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "click f2f lucky");
            com.tencent.mm.plugin.report.service.g.paX.i(14021, new Object[] { Integer.valueOf(4), Integer.valueOf(WalletOfflineCoinPurseUI.n(WalletOfflineCoinPurseUI.this)) });
            com.tencent.mm.bi.d.y(WalletOfflineCoinPurseUI.this.vov.voR, "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
            if (com.tencent.mm.s.c.vP().aD(262162, 266248))
            {
              com.tencent.mm.s.c.vP().aE(262162, 266248);
              localImageView2.setVisibility(8);
              com.tencent.mm.plugin.report.service.g.paX.i(14396, new Object[] { Integer.valueOf(5) });
            }
            GMTrace.o(17084171943936L, 127287);
          }
        });
        this.opi.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(17965311328256L, 133852);
            w.i("MicroMsg.WalletOfflineCoinPurseUI", "click qr reward");
            com.tencent.mm.plugin.report.service.g.paX.i(14021, new Object[] { Integer.valueOf(5), Integer.valueOf(WalletOfflineCoinPurseUI.n(WalletOfflineCoinPurseUI.this)) });
            if (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY())
            {
              com.tencent.mm.bi.d.y(WalletOfflineCoinPurseUI.this.vov.voR, "collect", ".reward.ui.QrRewardMainUI");
              GMTrace.o(17965311328256L, 133852);
              return;
            }
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, com.tencent.mm.wallet_core.ui.g.a(WalletOfflineCoinPurseUI.this.vov.voR, false, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(19256620089344L, 143473);
                WalletOfflineCoinPurseUI.o(WalletOfflineCoinPurseUI.this);
                GMTrace.o(19256620089344L, 143473);
              }
            }));
            com.tencent.mm.plugin.wallet_core.model.m.bwz();
            if (!com.tencent.mm.plugin.wallet_core.model.m.b(WalletOfflineCoinPurseUI.this, WalletOfflineCoinPurseUI.p(WalletOfflineCoinPurseUI.this), new a.a()
            {
              public final boolean a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, boolean paramAnonymous2Boolean)
              {
                GMTrace.i(19258230702080L, 143485);
                w.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + paramAnonymous2Int1 + ";errCode=" + paramAnonymous2Int2 + ";errMsg=" + paramAnonymous2String + ";hadAgree = " + paramAnonymous2Boolean);
                if (paramAnonymous2Int1 == 2)
                {
                  paramAnonymous2String = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("reward");
                  WalletOfflineCoinPurseUI.this.b(paramAnonymous2String, false);
                }
                for (;;)
                {
                  GMTrace.o(19258230702080L, 143485);
                  return true;
                  if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Boolean))
                  {
                    paramAnonymous2String = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("reward");
                    WalletOfflineCoinPurseUI.this.b(paramAnonymous2String, false);
                  }
                  else if (WalletOfflineCoinPurseUI.m(WalletOfflineCoinPurseUI.this) != null)
                  {
                    WalletOfflineCoinPurseUI.m(WalletOfflineCoinPurseUI.this).dismiss();
                  }
                }
              }
            }))
            {
              paramAnonymousView = new com.tencent.mm.plugin.wallet_core.id_verify.model.f("reward");
              WalletOfflineCoinPurseUI.this.r(paramAnonymousView);
            }
            GMTrace.o(17965311328256L, 133852);
          }
        });
        break;
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "close reward");
        this.opi.setVisibility(8);
        break label781;
        label1091:
        localImageView1.setVisibility(0);
      }
      label1100:
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "not to start card expire timer!");
      continue;
      label1112:
      if (com.tencent.mm.plugin.offline.c.a.oqc == 3) {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, not need to mark!");
      } else {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from %d, not need to start timer!", new Object[] { Integer.valueOf(com.tencent.mm.plugin.offline.c.a.oqc) });
      }
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(6219783733248L, 46341);
    GMTrace.o(6219783733248L, 46341);
    return 1;
  }
  
  public final boolean a(r.c paramc)
  {
    GMTrace.i(6218307338240L, 46330);
    if (paramc == null)
    {
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "onNotify msg == null");
      GMTrace.o(6218307338240L, 46330);
      return false;
    }
    aUe();
    this.opq.dismiss();
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "msgtype=" + paramc.ook);
    int i;
    if (4 == paramc.ook)
    {
      this.opl = false;
      i = 0;
    }
    for (;;)
    {
      Object localObject1 = this.opr;
      if (paramc == null) {
        w.e("MicroMsg.OfflineLogicMgr", "onNotify msg == null");
      }
      for (;;)
      {
        if (i != 0)
        {
          rT(0);
          gw(true);
        }
        GMTrace.o(6218307338240L, 46330);
        return true;
        if (5 == paramc.ook)
        {
          this.opl = false;
          if (this.opC.bNt()) {
            break label1394;
          }
          this.opC.MM();
          i = 1;
          break;
        }
        if (6 == paramc.ook)
        {
          this.opl = false;
          if (!this.opC.bNt()) {
            this.opC.MM();
          }
          if (!com.tencent.mm.plugin.offline.c.a.aUq()) {
            break label1394;
          }
          i = 0;
          break;
        }
        if (8 == paramc.ook)
        {
          if (this.opC.bNt()) {
            break label1394;
          }
          this.opC.MM();
          i = 1;
          break;
        }
        if (23 == paramc.ook)
        {
          if (this.opC.bNt()) {
            break label381;
          }
          this.opC.MM();
          i = 0;
          break;
        }
        if (20 == paramc.ook)
        {
          this.opl = false;
          if (this.opC.bNt()) {
            break label381;
          }
          this.opC.MM();
          i = 0;
          break;
        }
        if (24 != paramc.ook) {
          break label1394;
        }
        if (com.tencent.mm.plugin.offline.c.a.aUR())
        {
          this.opl = true;
          if (com.tencent.mm.plugin.offline.c.a.aUR())
          {
            if (this.opj != null) {
              break label386;
            }
            this.opj = com.tencent.mm.wallet_core.ui.g.a(this.vov.voR, false, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(19256217436160L, 143470);
                WalletOfflineCoinPurseUI.z(WalletOfflineCoinPurseUI.this);
                GMTrace.o(19256217436160L, 143470);
              }
            });
          }
        }
        for (;;)
        {
          localObject1 = this.opC;
          long l = com.tencent.mm.plugin.offline.g.aTA();
          ((aj)localObject1).w(l, l);
          label381:
          i = 0;
          break;
          label386:
          if (!this.opj.isShowing()) {
            this.opj.show();
          }
        }
        w.i("MicroMsg.OfflineLogicMgr", "onNotify OfflineMsg type :" + paramc.ook);
        if (paramc.ook == 24) {
          ((c)localObject1).kiq.vibrate(50L);
        }
        if (4 == paramc.ook)
        {
          ((c)localObject1).a((r.b)paramc);
          com.tencent.mm.plugin.offline.g.aTC();
        }
        else
        {
          if (5 == paramc.ook)
          {
            paramc = (r.e)paramc;
            if (paramc != null)
            {
              w.i("MicroMsg.OfflineLogicMgr", "showNotifyMsg msg.wxRetCode:" + paramc.oon + " msg.wxRetMsg:" + paramc.ooo + " msg.cftRetCode:" + paramc.oon + " msg.cftRetMsg:" + paramc.oom);
              if ((!TextUtils.isEmpty(paramc.oon)) || (!TextUtils.isEmpty(paramc.ooo)) || (!TextUtils.isEmpty(paramc.ool)) || (!TextUtils.isEmpty(paramc.oom)))
              {
                if ((!TextUtils.isEmpty(paramc.oon)) || (!TextUtils.isEmpty(paramc.ooo)) || (TextUtils.isEmpty(paramc.ool)) || (TextUtils.isEmpty(paramc.oom))) {
                  break label667;
                }
                b.a(((c)localObject1).mActivity, paramc.oom);
              }
            }
            for (;;)
            {
              com.tencent.mm.plugin.offline.g.aTC();
              com.tencent.mm.plugin.report.service.g.paX.a(135L, 0L, 1L, true);
              break;
              label667:
              if ((!TextUtils.isEmpty(paramc.oon)) && (com.tencent.mm.plugin.offline.c.a.ul(paramc.oon))) {
                ((c)localObject1).a(null, Integer.valueOf(paramc.oon).intValue(), paramc.ooo, paramc.oop);
              } else {
                b.a(((c)localObject1).mActivity, paramc.ooo);
              }
            }
          }
          Object localObject2;
          if (6 == paramc.ook)
          {
            paramc = (r.f)paramc;
            int j;
            if (paramc != null)
            {
              w.i("MicroMsg.OfflineLogicMgr", "showOrderSuccessUI transid : " + paramc.ooq);
              com.tencent.mm.plugin.offline.k.aTF();
              localObject2 = com.tencent.mm.plugin.offline.k.aTJ().Dq(paramc.oor.fAF);
              if (localObject2 == null) {
                break label898;
              }
              if (((q)localObject2).field_status != com.tencent.mm.plugin.offline.g.omG) {
                break label893;
              }
              j = 1;
            }
            for (;;)
            {
              if (j == 0)
              {
                com.tencent.mm.plugin.offline.g.bB(paramc.oor.fAF, com.tencent.mm.plugin.offline.g.omG);
                com.tencent.mm.plugin.offline.c.a.a(((c)localObject1).mActivity, paramc);
                ((c)localObject1).mActivity.finish();
              }
              com.tencent.mm.plugin.offline.g.aTC();
              com.tencent.mm.plugin.report.service.g.paX.a(135L, 7L, 1L, true);
              if (com.tencent.mm.plugin.offline.c.a.oqc != 4) {
                break;
              }
              w.i("MicroMsg.OfflineLogicMgr", "hy: is from ext");
              com.tencent.mm.plugin.report.service.g.paX.i(13412, new Object[0]);
              break;
              label893:
              j = 0;
              continue;
              label898:
              j = 0;
            }
          }
          Object localObject3;
          if (8 == paramc.ook)
          {
            paramc = (r.g)paramc;
            w.i("MicroMsg.OfflineLogicMgr", "showPayConfirmMsg msg id:" + paramc.id);
            if (paramc.oou == 0)
            {
              localObject2 = ((c)localObject1).mActivity.getLayoutInflater().inflate(R.i.diQ, null);
              localObject3 = (TextView)((View)localObject2).findViewById(R.h.ciL);
              TextView localTextView = (TextView)((View)localObject2).findViewById(R.h.ciN);
              ((TextView)localObject3).setText(paramc.oot);
              localTextView.setText(paramc.oos);
              com.tencent.mm.plugin.offline.g.bB(paramc.fCP, com.tencent.mm.plugin.offline.g.omI);
              com.tencent.mm.ui.base.h.a(((c)localObject1).mActivity, "", (View)localObject2, ((c)localObject1).getString(R.l.fam), ((c)localObject1).getString(R.l.duP), new c.11((c)localObject1, paramc), new c.12((c)localObject1, paramc));
            }
            else if (paramc.oou == 1)
            {
              if (((c)localObject1).ooG != null) {
                ((c)localObject1).ooG.show();
              }
              com.tencent.mm.plugin.report.service.g.paX.i(13955, new Object[] { Integer.valueOf(1) });
              w.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog msg id:" + paramc.id);
              com.tencent.mm.plugin.offline.g.bB(paramc.fCP, com.tencent.mm.plugin.offline.g.omI);
              ((c)localObject1).ooG = l.a(((c)localObject1).mActivity, paramc.oos, paramc.oot, new c.13((c)localObject1, paramc), new c.14((c)localObject1), new c.15((c)localObject1, paramc));
              ((c)localObject1).ooG.pfj.setVisibility(0);
              ((c)localObject1).ooG.oYK.setVisibility(8);
            }
          }
          else
          {
            if (23 == paramc.ook)
            {
              paramc = (r.d)paramc;
              localObject2 = new PayInfo();
              ((PayInfo)localObject2).fAF = paramc.fCP;
              ((PayInfo)localObject2).fIG = 8;
              ((PayInfo)localObject2).toe = 1;
              ((PayInfo)localObject2).tnW = new Bundle();
              ((PayInfo)localObject2).tnW.putLong("extinfo_key_9", System.currentTimeMillis());
              paramc = new c.1((c)localObject1, (PayInfo)localObject2);
              com.tencent.mm.sdk.b.a.uLm.a(paramc);
              localObject3 = ((c)localObject1).mActivity;
              if (((c)localObject1).ooF == null) {}
              for (paramc = "";; paramc = ((c)localObject1).ooF.aTS())
              {
                com.tencent.mm.pluginsdk.wallet.f.a((Context)localObject3, false, "", paramc, (PayInfo)localObject2, "", new Intent(), 1);
                break;
              }
            }
            if (20 == paramc.ook) {
              com.tencent.mm.plugin.offline.g.aTC();
            }
          }
        }
      }
      label1394:
      i = 1;
    }
  }
  
  public final boolean aMh()
  {
    GMTrace.i(6217502031872L, 46324);
    GMTrace.o(6217502031872L, 46324);
    return false;
  }
  
  public final void aTQ()
  {
    GMTrace.i(6220320604160L, 46345);
    aUm();
    GMTrace.o(6220320604160L, 46345);
  }
  
  public final void aTR()
  {
    GMTrace.i(6220454821888L, 46346);
    b(new com.tencent.mm.plugin.offline.a.j(""), false);
    GMTrace.o(6220454821888L, 46346);
  }
  
  public final String aTS()
  {
    GMTrace.i(6220589039616L, 46347);
    String str = this.oms;
    GMTrace.o(6220589039616L, 46347);
    return str;
  }
  
  public final void aTT()
  {
    GMTrace.i(16588103221248L, 123591);
    if (!this.ona.bNt()) {
      this.ona.MM();
    }
    rT(0);
    gw(true);
    aj localaj = this.ona;
    long l = this.omZ;
    localaj.w(l, l);
    GMTrace.o(16588103221248L, 123591);
  }
  
  public final void aUg()
  {
    GMTrace.i(6218844209152L, 46334);
    Object localObject3 = com.tencent.mm.plugin.offline.c.a.aUr();
    findViewById(R.h.cKn).setVisibility(0);
    this.opc.setTextSize(0, getResources().getDimensionPixelSize(R.f.aSh));
    Object localObject2;
    Object localObject1;
    if ((this.opc != null) && (localObject3 != null))
    {
      localObject2 = getString(R.l.eZT, new Object[] { ((Bankcard)localObject3).field_desc });
      localObject1 = com.tencent.mm.plugin.wallet_core.model.m.bwE().bxj();
      if ((localObject1 == null) || (bg.mZ(((Bankcard)localObject3).field_forbidWord))) {
        break label461;
      }
      Iterator localIterator = ((List)localObject1).iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject1 = (com.tencent.mm.plugin.wallet_core.model.c)localIterator.next();
      } while (!((com.tencent.mm.plugin.wallet_core.model.c)localObject1).oqm.equals(((Bankcard)localObject3).field_bindSerial));
    }
    for (;;)
    {
      if ((localObject1 != null) && (!bg.mZ(((com.tencent.mm.plugin.wallet_core.model.c)localObject1).rMN)))
      {
        localObject1 = ((Bankcard)localObject3).field_desc + ((com.tencent.mm.plugin.wallet_core.model.c)localObject1).rMN;
        findViewById(R.h.cKn).setVisibility(8);
        com.tencent.mm.plugin.report.service.g.paX.i(14515, new Object[] { Integer.valueOf(2) });
        this.opc.setTextSize(0, getResources().getDimensionPixelSize(R.f.aRQ));
      }
      for (int i = 1;; i = 0)
      {
        this.opc.setText((CharSequence)localObject1);
        if (TextUtils.isEmpty(this.oms)) {
          w.e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() mBindSerial is null");
        }
        for (;;)
        {
          if (i != 0) {
            this.opd.setImageResource(R.k.dnZ);
          }
          GMTrace.o(6218844209152L, 46334);
          return;
          if (localObject3 == null) {
            w.e("MicroMsg.WalletOfflineCoinPurseUI", "setChangeBankcardText bankcard == null");
          }
          i = 0;
          break;
          localObject2 = com.tencent.mm.plugin.offline.c.a.DA(this.oms);
          localObject1 = localObject2;
          if (((Bankcard)localObject3).bwn())
          {
            localObject1 = localObject2;
            if (((Bankcard)localObject3).rNi != null) {
              localObject1 = ((Bankcard)localObject3).rNi.oiq;
            }
          }
          if (TextUtils.isEmpty((CharSequence)localObject1))
          {
            w.e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() icon_url == null, can not find this icon_url");
          }
          else
          {
            localObject2 = this.opd;
            int j = getResources().getDimensionPixelOffset(R.f.aVo);
            if ((localObject2 != null) && (!TextUtils.isEmpty((CharSequence)localObject1)))
            {
              localObject3 = com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.wallet_core.ui.view.c((String)localObject1));
              if (localObject3 != null) {
                ((ImageView)localObject2).setImageBitmap(com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject3, j, j, true, false));
              }
              this.ooO.put(localObject1, localObject2);
              this.ooP.put(localObject1, Integer.valueOf(j));
            }
          }
        }
        localObject1 = localObject2;
      }
      label461:
      localObject1 = null;
    }
  }
  
  public final void aaU()
  {
    GMTrace.i(6218709991424L, 46333);
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "setScreenShotCallback");
    rT(1);
    gw(true);
    com.tencent.mm.wallet_core.ui.e.Eh(40);
    com.tencent.mm.plugin.report.service.g.paX.a(135L, 21L, 1L, true);
    if (this.opq.ioi.isShowing())
    {
      if (this.opq.kuB)
      {
        this.opq.cjg();
        GMTrace.o(6218709991424L, 46333);
        return;
      }
      this.opq.dismiss();
    }
    aUi();
    GMTrace.o(6218709991424L, 46333);
  }
  
  public final void ajc()
  {
    GMTrace.i(6220052168704L, 46343);
    rT(0);
    gw(true);
    GMTrace.o(6220052168704L, 46343);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(6216696725504L, 46318);
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "errType:" + paramInt1 + "  errCode" + paramInt2 + " errMsg:" + paramString + " scene: " + paramk);
    if (((paramk instanceof com.tencent.mm.plugin.offline.a.f)) && (((paramInt1 == 0) && (paramInt2 == 0)) || (paramInt1 != 0)))
    {
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "onSceneEnd NetSceneOfflineVerifyToken errType %d errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.omX.aTM();
      this.omX = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.m))
      {
        if (com.tencent.mm.plugin.offline.c.a.aUp())
        {
          if (com.tencent.mm.plugin.offline.c.a.aUs() != null) {
            aUf();
          }
          aUn();
        }
        aUl();
        if ((!(paramk instanceof com.tencent.mm.plugin.wallet_core.b.m)) && (!(paramk instanceof com.tencent.mm.plugin.offline.a.n)) && (!(paramk instanceof com.tencent.mm.plugin.offline.a.a)) && (!(paramk instanceof com.tencent.mm.plugin.offline.a.e))) {
          break label755;
        }
        aUb();
        o(false, true);
      }
    }
    for (;;)
    {
      GMTrace.o(6216696725504L, 46318);
      return true;
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.m))
      {
        this.omX = ((com.tencent.mm.plugin.offline.a.m)paramk);
        paramString = this.omX.onX;
        com.tencent.mm.plugin.offline.k.aTF();
        paramString = new com.tencent.mm.plugin.offline.a.f(paramString, com.tencent.mm.plugin.offline.k.rR(196617));
        ap.wT().a(paramString, 0);
        break;
      }
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.j))
      {
        aUb();
        aTY();
        break;
      }
      Object localObject;
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.n))
      {
        paramString = (com.tencent.mm.plugin.offline.a.n)paramk;
        if ("1".equals(paramString.oob))
        {
          w.w("MicroMsg.WalletOfflineCoinPurseUI", "hy: should pause. showFirstPostTip alert to finish");
          if (bg.mZ(paramString.ooc)) {}
          for (paramString = getString(R.l.eUe);; paramString = paramString.ooc)
          {
            com.tencent.mm.ui.base.h.a(this, paramString, "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(19258364919808L, 143486);
                WalletOfflineCoinPurseUI.this.finish();
                GMTrace.o(19258364919808L, 143486);
              }
            });
            GMTrace.o(6216696725504L, 46318);
            return true;
          }
        }
        if (paramString.onx == 0)
        {
          localObject = this.opr;
          ((c)localObject).ooH = com.tencent.mm.plugin.offline.c.a.aUw();
          ((c)localObject).ooH = ((c)localObject).ooH;
          if (!"1".equals(paramString.ooa)) {
            break;
          }
          w.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: should refresh codes. doscene");
          b(new com.tencent.mm.plugin.offline.a.m((int)(System.currentTimeMillis() / 1000L), 8), false);
          break;
        }
        if (paramString.onx == 0) {
          break;
        }
        this.opr.a(paramString, paramString.onx, paramString.ony);
        break;
      }
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.a)) {
        break;
      }
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.e))
      {
        this.opr.d(paramInt1, paramInt2, paramString, paramk);
        break;
      }
      if (!(paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.f)) {
        break;
      }
      if ((this.opj != null) && (this.opj.isShowing())) {
        this.opj.dismiss();
      }
      paramk = (com.tencent.mm.plugin.wallet_core.id_verify.model.f)paramk;
      if (("1".equals(paramk.rMa)) || (("2".equals(paramk.rMa)) && (!bg.mZ(paramk.rMb))))
      {
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".ui.WalletOfflineCoinPurseUI");
        paramString.putString("realname_verify_process_jump_plugin", "offline");
        localObject = paramk.rMb;
        localObject = paramk.rMc;
        paramk = paramk.rMd;
        com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString, 1006);
      }
      for (;;)
      {
        GMTrace.o(6216696725504L, 46318);
        return true;
        if ("collect".equals(paramk.rMe)) {
          aTZ();
        } else if ("reward".equals(paramk.rMe)) {
          com.tencent.mm.bi.d.y(this.vov.voR, "collect", ".reward.ui.QrRewardMainUI");
        } else {
          w.w("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %s", new Object[] { paramk.rMe });
        }
      }
      label755:
      if ((paramk instanceof com.tencent.mm.plugin.offline.a.f))
      {
        aUb();
        o(true, true);
        continue;
        if ((paramk instanceof com.tencent.mm.plugin.offline.a.n))
        {
          aUb();
          o(false, true);
          if (411 == paramInt2) {
            this.opr.a(paramk, paramInt2, paramString);
          }
        }
        else if ((paramk instanceof com.tencent.mm.plugin.offline.a.e))
        {
          this.opr.d(paramInt1, paramInt2, paramString, paramk);
        }
        else if (!(paramk instanceof com.tencent.mm.plugin.offline.a.j))
        {
          if ((paramk instanceof com.tencent.mm.plugin.offline.a.f)) {
            this.omX = null;
          } else if (((paramk instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.f)) && (this.opj != null) && (this.opj.isShowing())) {
            this.opj.dismiss();
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6216830943232L, 46319);
    int i = R.i.diL;
    GMTrace.o(6216830943232L, 46319);
    return i;
  }
  
  public final void k(final String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6218575773696L, 46332);
    if ((TextUtils.isEmpty(paramString)) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(6218575773696L, 46332);
      return;
    }
    final ImageView localImageView = (ImageView)this.ooO.get(paramString);
    paramString = (Integer)this.ooP.get(paramString);
    if ((localImageView == null) || (paramString == null))
    {
      GMTrace.o(6218575773696L, 46332);
      return;
    }
    new com.tencent.mm.sdk.platformtools.ae(getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19257828048896L, 143482);
        int i = paramString.intValue();
        Bitmap localBitmap = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, i, i, true, false);
        localImageView.setImageBitmap(localBitmap);
        GMTrace.o(19257828048896L, 143482);
      }
    });
    GMTrace.o(6218575773696L, 46332);
  }
  
  public final void m(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(6220186386432L, 46344);
    b(new com.tencent.mm.plugin.offline.a.e(paramInt, paramString1, paramString2), com.tencent.mm.plugin.offline.c.a.aUq());
    GMTrace.o(6220186386432L, 46344);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6215757201408L, 46311);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.offline.k.onk = true;
    com.tencent.mm.wallet_core.ui.e.Eh(41);
    paramBundle = getIntent();
    boolean bool;
    if (paramBundle == null)
    {
      bool = false;
      this.opn = bool;
      if ((paramBundle != null) && (paramBundle.hasExtra("key_entry_scene"))) {
        this.hys = paramBundle.getIntExtra("key_entry_scene", this.hys);
      }
      if (paramBundle != null) {
        break label475;
      }
      paramBundle = "";
      label75:
      this.opa = paramBundle;
      this.lFH = 1;
      if (this.hys != 2) {
        break label491;
      }
      this.lFH = 1;
      label98:
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
      sh(0);
      cO().cP().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.e.aQJ)));
      paramBundle = cO().cP().getCustomView();
      if (paramBundle != null)
      {
        View localView = paramBundle.findViewById(R.h.divider);
        if (localView != null) {
          localView.setBackgroundColor(getResources().getColor(R.e.aOF));
        }
        paramBundle = paramBundle.findViewById(16908309);
        if ((paramBundle != null) && ((paramBundle instanceof TextView))) {
          ((TextView)paramBundle).setTextColor(getResources().getColor(R.e.white));
        }
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle = getWindow();
        paramBundle.addFlags(Integer.MIN_VALUE);
        paramBundle.setStatusBarColor(getResources().getColor(R.e.aQK));
      }
      paramBundle = getWindow().getAttributes();
      if (paramBundle.screenBrightness < 0.85F)
      {
        paramBundle.screenBrightness = 0.85F;
        getWindow().setAttributes(paramBundle);
      }
      com.tencent.mm.wallet_core.ui.e.cjq();
      b(new com.tencent.mm.plugin.wallet_core.b.m(null, 8), false);
      if (!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwX()) {
        break label567;
      }
      w.e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is invalid");
    }
    for (;;)
    {
      MH();
      com.tencent.mm.platformtools.j.a(this);
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.aTG().a(this);
      hz(606);
      hz(609);
      hz(1501);
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.aTH().bl(this);
      com.tencent.mm.sdk.b.a.uLm.b(this.opA);
      com.tencent.mm.plugin.offline.c.a.aUB();
      com.tencent.mm.sdk.b.a.uLm.a(this.opy);
      com.tencent.mm.sdk.b.a.uLm.a(this.opx);
      com.tencent.mm.sdk.b.a.uLm.a(this.opu);
      this.opv.bMz();
      this.opw.bMz();
      this.opm = new com.tencent.mm.plugin.offline.g();
      GMTrace.o(6215757201408L, 46311);
      return;
      bool = paramBundle.getBooleanExtra("is_offline_create", false);
      break;
      label475:
      paramBundle = bg.ap(paramBundle.getStringExtra("key_business_attach"), "");
      break label75;
      label491:
      if (this.hys == 1)
      {
        this.lFH = 2;
        break label98;
      }
      if (this.hys == 8)
      {
        this.lFH = 4;
        break label98;
      }
      if (this.hys == 4)
      {
        this.lFH = 6;
        break label98;
      }
      w.i("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %d", new Object[] { Integer.valueOf(this.lFH) });
      break label98;
      label567:
      if (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwV())
      {
        w.e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is isUnreg");
        com.tencent.mm.plugin.offline.c.a.aUA();
        com.tencent.mm.plugin.offline.k.aTF();
        com.tencent.mm.plugin.offline.k.ag(196648, "0");
      }
      else if ((com.tencent.mm.plugin.wallet_core.model.m.bwE().bwY()) && (com.tencent.mm.plugin.offline.c.a.aUp()))
      {
        aUn();
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6216562507776L, 46317);
    com.tencent.mm.plugin.offline.k.onk = false;
    com.tencent.mm.wallet_core.ui.e.u(this.ooQ);
    com.tencent.mm.wallet_core.ui.e.u(this.ooR);
    com.tencent.mm.wallet_core.ui.e.ao(this.opo);
    com.tencent.mm.wallet_core.ui.e.ao(this.opp);
    this.opo.clear();
    this.opp.clear();
    this.ooT.clear();
    this.ooU.clear();
    this.ooV.clear();
    com.tencent.mm.platformtools.j.c(this);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.aTG().b(this);
    hA(606);
    hA(609);
    hA(1501);
    com.tencent.mm.plugin.offline.k.aTF();
    com.tencent.mm.plugin.offline.k.aTH().bm(this);
    com.tencent.mm.sdk.b.a.uLm.c(this.opA);
    com.tencent.mm.sdk.b.a.uLm.c(this.opy);
    com.tencent.mm.sdk.b.a.uLm.c(this.opu);
    if (!this.ona.bNt()) {
      this.ona.MM();
    }
    if (!this.opD.bNt()) {
      this.opD.MM();
    }
    if (this.opq != null) {
      this.opq.release();
    }
    if (this.opr != null)
    {
      localObject = this.opr;
      ((c)localObject).kiq.cancel();
      ((c)localObject).mActivity = null;
    }
    com.tencent.mm.sdk.b.a.uLm.c(this.opx);
    this.opv.dead();
    this.opw.dead();
    Object localObject = this.opm;
    ((com.tencent.mm.plugin.offline.g)localObject).stop();
    com.tencent.mm.plugin.offline.g.aTC();
    ap.wT().b(385, ((com.tencent.mm.plugin.offline.g)localObject).omK);
    ((com.tencent.mm.plugin.offline.g)localObject).omM = null;
    super.onDestroy();
    GMTrace.o(6216562507776L, 46317);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6220723257344L, 46348);
    if ((paramInt == 4) && (this.ops != null) && (this.ops.getVisibility() == 0) && (this.ops.ooy))
    {
      this.ops.dismiss();
      GMTrace.o(6220723257344L, 46348);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6220723257344L, 46348);
    return bool;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(6216294072320L, 46315);
    super.onNewIntent(paramIntent);
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on new intent");
    GMTrace.o(6216294072320L, 46315);
  }
  
  public void onPause()
  {
    GMTrace.i(6216428290048L, 46316);
    com.tencent.mm.plugin.offline.k.aTF();
    i locali = com.tencent.mm.plugin.offline.k.aTI();
    locali.mHandler.removeCallbacks(locali.omY);
    au.a(null);
    this.las = false;
    com.tencent.mm.sdk.b.a.uLm.c(this.opz);
    this.opm.stop();
    super.onPause();
    GMTrace.o(6216428290048L, 46316);
  }
  
  public void onResume()
  {
    GMTrace.i(6216025636864L, 46313);
    super.onResume();
    com.tencent.mm.sdk.b.a.uLm.b(this.opz);
    au.a(this);
    if (!this.opt)
    {
      aTY();
      this.opt = true;
    }
    w.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on resume");
    this.las = true;
    Object localObject = (com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class);
    ((com.tencent.mm.plugin.walletlock.a.b)localObject).a(this, ((com.tencent.mm.plugin.walletlock.a.b)localObject).byv(), null);
    if (com.tencent.mm.sdk.platformtools.am.isNetworkConnected(getBaseContext()))
    {
      if (com.tencent.mm.plugin.wallet_core.model.m.bwE().bwX()) {
        r(new com.tencent.mm.plugin.wallet_core.b.m(null, 8));
      }
      if (com.tencent.mm.plugin.offline.c.a.aUp())
      {
        com.tencent.mm.plugin.offline.k.aTF();
        com.tencent.mm.plugin.offline.k.aTI().gv(false);
        if (!c.aTV()) {
          aUf();
        }
      }
    }
    aUb();
    localObject = com.tencent.mm.plugin.offline.c.a.aUr();
    if ((localObject != null) && (((Bankcard)localObject).field_bindSerial != null) && (!((Bankcard)localObject).field_bindSerial.equals(this.oms)))
    {
      this.oms = ((Bankcard)localObject).field_bindSerial;
      com.tencent.mm.plugin.offline.k.aTF();
      com.tencent.mm.plugin.offline.k.aTH().oms = this.oms;
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        w.i("MicroMsg.WalletOfflineCoinPurseUI", "onresume BindSerial isChange");
        aUg();
        rT(0);
        gw(true);
      }
      localObject = this.opm;
      if (!com.tencent.mm.plugin.offline.c.a.aUR()) {
        break label398;
      }
      w.i(com.tencent.mm.plugin.offline.g.TAG, "OFFLINEGETMSGLOGIN START; IS stopped=" + ((com.tencent.mm.plugin.offline.g)localObject).omM.bNt());
      if ((((com.tencent.mm.plugin.offline.g)localObject).omM != null) && (!((com.tencent.mm.plugin.offline.g)localObject).omM.bNt())) {
        break label407;
      }
      ((com.tencent.mm.plugin.offline.g)localObject).status = 1;
      com.tencent.mm.plugin.report.service.g.paX.a(135L, 61L, 1L, true);
      if (!((com.tencent.mm.plugin.offline.g)localObject).omL) {
        break;
      }
      com.tencent.mm.plugin.offline.g.aTC();
      localObject = ((com.tencent.mm.plugin.offline.g)localObject).omM;
      l = com.tencent.mm.plugin.offline.g.omv;
      ((aj)localObject).w(l, l);
      i = com.tencent.mm.plugin.offline.g.omv;
      GMTrace.o(6216025636864L, 46313);
      return;
    }
    localObject = ((com.tencent.mm.plugin.offline.g)localObject).omM;
    long l = com.tencent.mm.plugin.offline.g.omJ;
    ((aj)localObject).w(l, l);
    i = com.tencent.mm.plugin.offline.g.omJ;
    GMTrace.o(6216025636864L, 46313);
    return;
    label398:
    w.i(com.tencent.mm.plugin.offline.g.TAG, "OfflineGetMsg is not in abtest");
    label407:
    GMTrace.o(6216025636864L, 46313);
  }
  
  final class a
    extends BaseAdapter
  {
    ArrayList<String> jvO;
    ArrayList<Boolean> opU;
    
    public a()
    {
      GMTrace.i(6209448968192L, 46264);
      this.jvO = new ArrayList();
      this.opU = new ArrayList();
      GMTrace.o(6209448968192L, 46264);
    }
    
    public final int getCount()
    {
      GMTrace.i(6209583185920L, 46265);
      int i = this.jvO.size();
      GMTrace.o(6209583185920L, 46265);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6209717403648L, 46266);
      Object localObject = this.jvO.get(paramInt);
      GMTrace.o(6209717403648L, 46266);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6209851621376L, 46267);
      long l = paramInt;
      GMTrace.o(6209851621376L, 46267);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6210120056832L, 46269);
      paramView = (CheckedTextView)View.inflate(WalletOfflineCoinPurseUI.this, R.i.diD, null);
      paramView.setText((String)this.jvO.get(paramInt));
      if (WalletOfflineCoinPurseUI.aUo() == paramInt)
      {
        paramView.setChecked(true);
        if (!isEnabled(paramInt)) {
          break label98;
        }
        paramView.setTextColor(WalletOfflineCoinPurseUI.this.getResources().getColor(R.e.aPH));
        paramView.setEnabled(true);
      }
      for (;;)
      {
        GMTrace.o(6210120056832L, 46269);
        return paramView;
        paramView.setChecked(false);
        break;
        label98:
        paramView.setTextColor(WalletOfflineCoinPurseUI.this.getResources().getColor(R.e.aOI));
        paramView.setEnabled(false);
      }
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(6209985839104L, 46268);
      boolean bool = ((Boolean)this.opU.get(paramInt)).booleanValue();
      GMTrace.o(6209985839104L, 46268);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */