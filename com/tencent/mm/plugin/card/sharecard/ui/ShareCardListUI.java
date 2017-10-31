package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.ui.CardDetailUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.ArrayList;

public class ShareCardListUI
  extends CardBaseUI
  implements com.tencent.mm.plugin.card.base.d, j.a
{
  private String koj;
  private b.a kqA;
  private String ksA;
  private boolean ksB;
  private boolean ksC;
  private boolean ksD;
  private int ksE;
  private boolean ksF;
  private long ksG;
  boolean ksH;
  private long ksI;
  private final long ksJ;
  private boolean ksK;
  private boolean ksL;
  private com.tencent.mm.plugin.card.sharecard.a.b ksi;
  private f ksr;
  private e kss;
  private i kst;
  private boolean ksu;
  private boolean ksv;
  private boolean ksw;
  private boolean ksx;
  private boolean ksy;
  private boolean ksz;
  private long mStartTime;
  
  public ShareCardListUI()
  {
    GMTrace.i(5078933045248L, 37841);
    this.koj = null;
    this.ksu = false;
    this.ksv = true;
    this.ksw = false;
    this.ksx = true;
    this.ksy = true;
    this.ksz = false;
    this.ksA = "";
    this.ksB = false;
    this.ksC = false;
    this.ksD = false;
    this.ksE = 0;
    this.ksF = false;
    this.kqA = null;
    this.mStartTime = 0L;
    this.ksG = 0L;
    this.ksH = false;
    this.ksI = 0L;
    this.ksJ = 500L;
    this.ksK = false;
    this.ksL = false;
    GMTrace.o(5078933045248L, 37841);
  }
  
  private void akm()
  {
    GMTrace.i(5080006787072L, 37849);
    w.d("MicroMsg.ShareCardListUI", "initLocation");
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5085375496192L, 37889);
        ShareCardListUI.a(ShareCardListUI.this);
        ShareCardListUI.b(ShareCardListUI.this);
        ShareCardListUI.this.ksH = true;
        w.d("MicroMsg.ShareCardListUI", "initLocation end");
        GMTrace.o(5085375496192L, 37889);
      }
    });
    GMTrace.o(5080006787072L, 37849);
  }
  
  private void akn()
  {
    GMTrace.i(5080543657984L, 37853);
    long l = System.currentTimeMillis() - this.ksI;
    if ((this.ksK) && (l < 1000L))
    {
      w.d("MicroMsg.ShareCardListUI", "DoingUpdateView return");
      GMTrace.o(5080543657984L, 37853);
      return;
    }
    w.d("MicroMsg.ShareCardListUI", "try2UpdateView isDoingUpdateView %s,interval %s", new Object[] { Boolean.valueOf(this.ksK), Long.valueOf(l) });
    this.ksK = true;
    if (l < 500L)
    {
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5077725085696L, 37832);
          ShareCardListUI.i(ShareCardListUI.this);
          if (!ShareCardListUI.this.isFinishing())
          {
            ShareCardListUI.j(ShareCardListUI.this);
            GMTrace.o(5077725085696L, 37832);
            return;
          }
          w.w("MicroMsg.ShareCardListUI", "Activity is finished!!!");
          GMTrace.o(5077725085696L, 37832);
        }
      }, 500L);
      GMTrace.o(5080543657984L, 37853);
      return;
    }
    if ((this.ksE == 0) || (this.ksE == 4) || ((this.ksE == 2) && ((!com.tencent.mm.plugin.card.sharecard.a.b.ajZ()) || (!com.tencent.mm.plugin.card.sharecard.a.b.ajY()))) || ((this.ksE == 1) && ((!com.tencent.mm.plugin.card.sharecard.a.b.ajZ()) || (com.tencent.mm.plugin.card.sharecard.a.b.ajY()))) || ((this.ksE == 3) && ((!com.tencent.mm.plugin.card.sharecard.a.b.ajY()) || (com.tencent.mm.plugin.card.sharecard.a.b.ajZ())))) {
      this.ksE = com.tencent.mm.plugin.card.sharecard.a.b.ajX();
    }
    al.ajH().putValue("key_share_card_show_type", Integer.valueOf(this.ksE));
    w.i("MicroMsg.ShareCardListUI", "updateView() currentType is %s, canShowLocalCity %s, canShowOtherCity %s", new Object[] { Integer.valueOf(this.ksE), Boolean.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.ajZ()), Boolean.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.ajY()) });
    f localf = this.ksr;
    localf.ksn.setVisibility(0);
    localf.ksm.setImageDrawable(localf.jFp.getResources().getDrawable(R.g.aXb));
    localf.ksn.setText(R.l.dGd);
    localf.kso.setText(R.l.dGc);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localf.ksm.getLayoutParams();
    localLayoutParams.topMargin = localf.jFp.getResources().getDimensionPixelOffset(R.f.aTe);
    localf.ksm.setLayoutParams(localLayoutParams);
    localf.ksm.invalidate();
    if ((!com.tencent.mm.plugin.card.sharecard.a.b.ajZ()) && (!com.tencent.mm.plugin.card.sharecard.a.b.ajY()))
    {
      this.kss.akl();
      this.kst.ksN.setVisibility(8);
      if (this.kmd.getEmptyView() != this.kmf)
      {
        this.kmd.setEmptyView(this.kmf);
        this.kmd.invalidate();
      }
    }
    for (;;)
    {
      ako();
      this.ksI = System.currentTimeMillis();
      this.ksK = false;
      GMTrace.o(5080543657984L, 37853);
      return;
      this.kss.ar();
      this.kst.ar();
      if ((this.ksE == 4) && (this.kmd.getEmptyView() != null))
      {
        this.kmd.setEmptyView(null);
        this.kmd.invalidate();
      }
    }
  }
  
  private void ako()
  {
    GMTrace.i(5080677875712L, 37854);
    if ((this.kme instanceof c))
    {
      c localc = (c)this.kme;
      localc.ksf = this.ksE;
      localc.a(null, null);
    }
    GMTrace.o(5080677875712L, 37854);
  }
  
  private void akp()
  {
    GMTrace.i(5081080528896L, 37857);
    if ((com.tencent.mm.plugin.card.sharecard.a.b.akb()) && (com.tencent.mm.plugin.card.sharecard.a.b.akc()))
    {
      w.i("MicroMsg.ShareCardListUI", "doGetLayout() no data to load");
      this.ksy = true;
      GMTrace.o(5081080528896L, 37857);
      return;
    }
    if ((!com.tencent.mm.plugin.card.sharecard.a.b.akb()) || (!com.tencent.mm.plugin.card.sharecard.a.b.akc())) {
      this.ksx = false;
    }
    w.i("MicroMsg.ShareCardListUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
    akq();
    al.ajI().m("", "", 4);
    GMTrace.o(5081080528896L, 37857);
  }
  
  private void akq()
  {
    GMTrace.i(5081214746624L, 37858);
    if (this.ksz)
    {
      w.e("MicroMsg.ShareCardListUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
      GMTrace.o(5081214746624L, 37858);
      return;
    }
    if ((bg.mZ(this.ksA)) && (!com.tencent.mm.plugin.card.sharecard.a.b.ajZ()) && (!com.tencent.mm.plugin.card.sharecard.a.b.ajY()) && (!com.tencent.mm.plugin.card.sharecard.a.b.ajZ()) && (!com.tencent.mm.plugin.card.sharecard.a.b.ajY()))
    {
      this.kss.aki();
      this.kmd.setEmptyView(null);
      this.kmd.invalidate();
      this.ksL = true;
    }
    if ((this.ksx) && (!bg.mZ(this.ksA))) {
      this.ksA = "";
    }
    this.ksz = true;
    com.tencent.mm.plugin.card.sharecard.model.b localb = new com.tencent.mm.plugin.card.sharecard.model.b(al.ajI().gBS, al.ajI().gBT, this.ksA);
    ap.wT().a(localb, 0);
    GMTrace.o(5081214746624L, 37858);
  }
  
  private void akr()
  {
    GMTrace.i(5082422706176L, 37867);
    int i = getIntent().getIntExtra("key_from_scene", 22);
    boolean bool1 = com.tencent.mm.s.c.vP().aC(262152, 266256);
    boolean bool2 = com.tencent.mm.s.c.vP().aD(262152, 266256);
    boolean bool3 = com.tencent.mm.s.c.vP().a(w.a.uVi, w.a.uVk);
    boolean bool4 = com.tencent.mm.s.c.vP().a(w.a.uVj, w.a.uVl);
    ap.AS();
    String str = bg.mY((String)com.tencent.mm.x.c.xi().get(w.a.uVo, null));
    if (bool1)
    {
      g.paX.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(2), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    if (bool2)
    {
      g.paX.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    if ((bool3) && (!bool4))
    {
      g.paX.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(3), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    if ((bool3) && (bool4))
    {
      g.paX.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(4), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    if (bool4)
    {
      g.paX.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(5), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5082422706176L, 37867);
      return;
    }
    g.paX.i(11324, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(i), "", Integer.valueOf(0), str });
    GMTrace.o(5082422706176L, 37867);
  }
  
  private void dw(boolean paramBoolean)
  {
    GMTrace.i(5079469916160L, 37845);
    w.i("MicroMsg.ShareCardListUI", "doRefreshData() >> updateView() shouldGetLayout %s fromOnresume %s", new Object[] { Boolean.valueOf(this.ksv), Boolean.valueOf(paramBoolean) });
    if (this.ksv)
    {
      this.ksv = false;
      this.ksB = false;
      this.ksx = true;
      this.ksA = "";
      w.d("MicroMsg.ShareCardListUI", "doRefreshData() >> doNetSceneGetCardsHomePageLayout()");
      if (!paramBoolean) {
        break label110;
      }
      if ((this.ksF) && (this.ksH)) {
        aii();
      }
    }
    for (;;)
    {
      akn();
      GMTrace.o(5079469916160L, 37845);
      return;
      label110:
      akq();
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(5079872569344L, 37848);
    super.MH();
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    w.i("MicroMsg.ShareCardListUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    this.ksF = bool;
    if (this.ksF)
    {
      akm();
      GMTrace.o(5079872569344L, 37848);
      return;
    }
    w.e("MicroMsg.ShareCardListUI", "location permission is denied, doGetLayout");
    akp();
    GMTrace.o(5079872569344L, 37848);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    boolean bool = true;
    GMTrace.i(5082020052992L, 37864);
    super.a(paramInt1, paramInt2, paramString, paramk);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.b)paramk;
        this.ksz = false;
        this.ksA = paramString.kqI;
        this.ksi.P(paramString.kpq, this.ksx);
        if ((!com.tencent.mm.plugin.card.sharecard.a.b.akb()) || (!com.tencent.mm.plugin.card.sharecard.a.b.akc())) {
          this.ksx = false;
        }
        if ((com.tencent.mm.plugin.card.sharecard.a.b.akb()) && (com.tencent.mm.plugin.card.sharecard.a.b.akc())) {}
        for (;;)
        {
          this.ksy = bool;
          w.i("MicroMsg.ShareCardListUI", "NetSceneGetShareCardsLayout() >> updateView()");
          akn();
          GMTrace.o(5082020052992L, 37864);
          return;
          bool = false;
        }
      }
    }
    else
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        if (this.ksL)
        {
          this.ksL = false;
          this.kss.akj();
          this.kmd.setEmptyView(this.kmf);
          this.kmd.invalidate();
        }
        this.ksz = false;
        this.ksy = true;
      }
      w.i("MicroMsg.ShareCardListUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    GMTrace.o(5082020052992L, 37864);
  }
  
  protected final void a(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5081885835264L, 37863);
    Intent localIntent = new Intent(this, CardDetailUI.class);
    w.i("MicroMsg.ShareCardListUI", "card tp id:" + paramb.aiP());
    w.i("MicroMsg.ShareCardListUI", "card id:" + paramb.aiO());
    localIntent.putExtra("key_card_id", al.ajK().tP(paramb.aiP()));
    localIntent.putExtra("key_card_tp_id", paramb.aiP());
    localIntent.putExtra("key_is_share_card", true);
    localIntent.putExtra("key_from_scene", 3);
    startActivity(localIntent);
    com.tencent.mm.plugin.card.sharecard.a.b.tM(paramb.aiP());
    GMTrace.o(5081885835264L, 37863);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(5082288488448L, 37866);
    w.d("MicroMsg.ShareCardListUI", "onNotifyChange");
    this.ksv = true;
    GMTrace.o(5082288488448L, 37866);
  }
  
  public final void aiV()
  {
    GMTrace.i(5082154270720L, 37865);
    com.tencent.mm.plugin.card.sharecard.a.b.ajW();
    this.ksv = true;
    w.i("MicroMsg.ShareCardListUI", "onDBchange() shouldRefreshDataOnDbChange %s  mIsActive %s hasLocationInfo %s", new Object[] { Boolean.valueOf(this.ksw), Boolean.valueOf(this.kmj), Boolean.valueOf(this.ksD) });
    if ((this.ksw) && (this.kmj) && (this.ksD)) {
      dw(false);
    }
    for (;;)
    {
      this.ksw = false;
      GMTrace.o(5082154270720L, 37865);
      return;
      akn();
    }
  }
  
  protected final void aib()
  {
    GMTrace.i(5080275222528L, 37851);
    oC(R.l.dGi);
    this.ksi = new com.tencent.mm.plugin.card.sharecard.a.b(this);
    this.kqA = new b.a() {};
    this.ksi.kqA = this.kqA;
    this.ksi.init();
    this.ksE = com.tencent.mm.plugin.card.sharecard.a.b.ajX();
    Object localObject;
    if (this.kst == null)
    {
      this.kst = new i(this, this.vov.iiK);
      localObject = this.kst;
      ((i)localObject).ksN = View.inflate(((i)localObject).jFp, R.i.cOF, null);
      ((i)localObject).ksO = ((TextView)((i)localObject).ksN.findViewById(R.h.bqj));
      ((i)localObject).ksP = ((TextView)((i)localObject).ksN.findViewById(R.h.bqk));
      ((i)localObject).ar();
    }
    if (this.ksr == null)
    {
      this.ksr = new f(this, this.vov.iiK);
      localObject = this.ksr;
      ((f)localObject).ksm = ((ImageView)((f)localObject).krg.findViewById(R.h.cgt));
      ((f)localObject).kso = ((TextView)((f)localObject).krg.findViewById(R.h.cgv));
      ((f)localObject).ksn = ((TextView)((f)localObject).krg.findViewById(R.h.cgw));
      this.ksr.ksi = this.ksi;
    }
    if (this.kss == null)
    {
      this.kss = new e(this);
      this.kss.ksi = this.ksi;
      this.kss.akh();
      localObject = this.kss;
      View.OnClickListener local3 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5089267810304L, 37918);
          ShareCardListUI.c(ShareCardListUI.this);
          if (com.tencent.mm.plugin.card.sharecard.a.b.ajZ())
          {
            ShareCardListUI.c(ShareCardListUI.this);
            if (com.tencent.mm.plugin.card.sharecard.a.b.ajY()) {
              ShareCardListUI.a(ShareCardListUI.this, 2);
            }
          }
          for (;;)
          {
            g.paX.i(11582, new Object[] { "OperChangeOtherCity ", Integer.valueOf(0), Integer.valueOf(0), "", "", "" });
            al.ajH().putValue("key_share_card_show_type", Integer.valueOf(ShareCardListUI.d(ShareCardListUI.this)));
            ShareCardListUI.e(ShareCardListUI.this);
            ShareCardListUI.f(ShareCardListUI.this).ar();
            ShareCardListUI.c(ShareCardListUI.this);
            com.tencent.mm.plugin.card.sharecard.a.b.kqB = true;
            GMTrace.o(5089267810304L, 37918);
            return;
            ShareCardListUI.c(ShareCardListUI.this);
            if (com.tencent.mm.plugin.card.sharecard.a.b.ajY()) {
              ShareCardListUI.a(ShareCardListUI.this, 3);
            }
          }
        }
      };
      if (((e)localObject).ksh != null) {
        ((e)localObject).ksh.setOnClickListener(local3);
      }
    }
    if (this.kmg != null) {
      this.kmg.addView(this.kst.ksN);
    }
    if (this.kmh != null) {
      this.kmh.addView(this.kss.ksh);
    }
    this.kmd.setVisibility(0);
    this.kmd.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5092891688960L, 37945);
        if ((paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (!ShareCardListUI.g(ShareCardListUI.this)) && (ShareCardListUI.d(ShareCardListUI.this) != 4))
        {
          w.d("MicroMsg.ShareCardListUI", "onScroll() >> doNetSceneGetCardsHomePageLayout()");
          ShareCardListUI.h(ShareCardListUI.this);
        }
        GMTrace.o(5092891688960L, 37945);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5092757471232L, 37944);
        GMTrace.o(5092757471232L, 37944);
      }
    });
    if ((getIntent() != null) && (getIntent().getBooleanExtra("KEY_IS_SHOW_SHARE_CARD_ENTRANCE_TIPS", true)))
    {
      ap.AS();
      localObject = (Integer)com.tencent.mm.x.c.xi().get(w.a.uVA, Integer.valueOf(0));
      if ((localObject == null) || (((Integer)localObject).intValue() != 1))
      {
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uVA, Integer.valueOf(1));
        com.tencent.mm.plugin.card.b.d.c(this, R.i.cOK, R.l.dGp, "");
      }
    }
    for (;;)
    {
      this.koj = getIntent().getStringExtra("KEY_CARD_TP_ID");
      this.ksA = getIntent().getStringExtra("key_layout_buff");
      if (!bg.mZ(this.ksA)) {
        this.ksv = false;
      }
      if (!bg.mZ(this.koj))
      {
        this.ksu = true;
        this.ksw = true;
      }
      GMTrace.o(5080275222528L, 37851);
      return;
      ap.AS();
      localObject = (Integer)com.tencent.mm.x.c.xi().get(w.a.uVA, Integer.valueOf(0));
      if ((localObject != null) && (((Integer)localObject).intValue() != 1))
      {
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uVA, Integer.valueOf(1));
      }
    }
  }
  
  protected final BaseAdapter aid()
  {
    GMTrace.i(5079738351616L, 37847);
    c localc = new c(this.vov.voR);
    GMTrace.o(5079738351616L, 37847);
    return localc;
  }
  
  protected final boolean aie()
  {
    GMTrace.i(5081348964352L, 37859);
    boolean bool = super.aie();
    GMTrace.o(5081348964352L, 37859);
    return bool;
  }
  
  protected final boolean aif()
  {
    GMTrace.i(5081483182080L, 37860);
    GMTrace.o(5081483182080L, 37860);
    return false;
  }
  
  protected final void aik()
  {
    GMTrace.i(5080812093440L, 37855);
    this.ksD = true;
    if (this.ksB)
    {
      w.e("MicroMsg.ShareCardListUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
      if (this.ksF) {
        aij();
      }
      GMTrace.o(5080812093440L, 37855);
      return;
    }
    w.d("MicroMsg.ShareCardListUI", "onLocationFinish()");
    this.ksB = true;
    akp();
    aij();
    GMTrace.o(5080812093440L, 37855);
  }
  
  protected final void ail()
  {
    GMTrace.i(5080946311168L, 37856);
    if ((this.ksC) || (this.ksB))
    {
      aij();
      GMTrace.o(5080946311168L, 37856);
      return;
    }
    this.ksC = true;
    w.i("MicroMsg.ShareCardListUI", "onLocationFail()");
    akp();
    GMTrace.o(5080946311168L, 37856);
  }
  
  protected final void aim()
  {
    GMTrace.i(5080141004800L, 37850);
    w.i("MicroMsg.ShareCardListUI", "onMPermissionGranted LocationPermissionGranted " + this.ksF);
    if (!this.ksF)
    {
      this.ksF = true;
      akm();
    }
    GMTrace.o(5080141004800L, 37850);
  }
  
  protected final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5081617399808L, 37861);
    if (paramb != null) {
      com.tencent.mm.plugin.card.sharecard.a.b.tH(paramb.aiP());
    }
    super.b(paramb);
    GMTrace.o(5081617399808L, 37861);
  }
  
  protected final void c(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5081751617536L, 37862);
    super.c(paramb);
    GMTrace.o(5081751617536L, 37862);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5079067262976L, 37842);
    super.onCreate(paramBundle);
    long l = System.currentTimeMillis();
    this.mStartTime = l;
    this.ksG = l;
    MH();
    ap.wT().a(1164, this);
    al.ajJ().a(this);
    akr();
    al.ajK().c(this);
    GMTrace.o(5079067262976L, 37842);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5079201480704L, 37843);
    if (this.ksF) {
      aij();
    }
    this.ksr.ksi = null;
    this.kss.ksi = null;
    this.ksi.kqA = null;
    ap.wT().b(1164, this);
    al.ajJ().b(this);
    com.tencent.mm.plugin.card.sharecard.a.b.aka();
    al.ajK().j(this);
    long l = System.currentTimeMillis() - this.ksG;
    if (!TextUtils.isEmpty(this.koj)) {
      g.paX.i(13219, new Object[] { "ShareCardListUI", Integer.valueOf(0), "", "", Long.valueOf(l) });
    }
    for (;;)
    {
      super.onDestroy();
      GMTrace.o(5079201480704L, 37843);
      return;
      g.paX.i(13219, new Object[] { "ShareCardListUI", Integer.valueOf(1), "", "", Long.valueOf(l) });
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(5080409440256L, 37852);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    akr();
    if (paramIntent != null)
    {
      this.koj = paramIntent.getStringExtra("KEY_CARD_TP_ID");
      if (!bg.mZ(this.koj))
      {
        this.ksu = true;
        this.ksw = true;
      }
    }
    GMTrace.o(5080409440256L, 37852);
  }
  
  protected void onPause()
  {
    GMTrace.i(5079604133888L, 37846);
    super.onPause();
    this.ksv = false;
    this.ksw = true;
    GMTrace.o(5079604133888L, 37846);
  }
  
  protected void onResume()
  {
    GMTrace.i(5079335698432L, 37844);
    dw(true);
    long l = System.currentTimeMillis();
    if (this.mStartTime != 0L)
    {
      int i = (int)(l - this.mStartTime);
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey1 = new IDKey();
      localIDKey1.SetID(281);
      localIDKey1.SetKey(56);
      localIDKey1.SetValue(1L);
      IDKey localIDKey2 = new IDKey();
      localIDKey2.SetID(281);
      localIDKey2.SetKey(57);
      localIDKey2.SetValue(i);
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      g.paX.b(localArrayList, true);
      this.mStartTime = 0L;
    }
    super.onResume();
    GMTrace.o(5079335698432L, 37844);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */