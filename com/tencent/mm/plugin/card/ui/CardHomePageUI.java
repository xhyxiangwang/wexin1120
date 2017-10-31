package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.b.q;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI;
import com.tencent.mm.protocal.c.jn;
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

public class CardHomePageUI
  extends CardBaseUI
  implements com.tencent.mm.plugin.card.base.d, j.a
{
  private int fromScene;
  private String ksA;
  private boolean ksB;
  private boolean ksC;
  private long ksG;
  boolean ksH;
  private com.tencent.mm.plugin.card.sharecard.a.b ksi;
  private boolean ksv;
  private boolean ksx;
  private boolean ksz;
  private i kwS;
  private f kwT;
  private f kwU;
  private f kwV;
  private boolean kwW;
  private boolean kwX;
  private TextView kwY;
  private long mStartTime;
  
  public CardHomePageUI()
  {
    GMTrace.i(5031956840448L, 37491);
    this.ksx = true;
    this.ksz = false;
    this.ksA = "";
    this.kwW = true;
    this.ksv = false;
    this.ksB = false;
    this.ksC = false;
    this.kwX = false;
    this.mStartTime = 0L;
    this.ksG = 0L;
    this.fromScene = 0;
    this.ksH = false;
    GMTrace.o(5031956840448L, 37491);
  }
  
  private void akm()
  {
    GMTrace.i(5033164800000L, 37500);
    w.d("MicroMsg.CardHomePageUI", "initLocation");
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18882018410496L, 140682);
        CardHomePageUI.c(CardHomePageUI.this);
        CardHomePageUI.d(CardHomePageUI.this);
        CardHomePageUI.this.ksH = true;
        w.d("MicroMsg.CardHomePageUI", "initLocation end");
        GMTrace.o(18882018410496L, 140682);
      }
    });
    GMTrace.o(5033164800000L, 37500);
  }
  
  private void akp()
  {
    GMTrace.i(5034238541824L, 37508);
    w.d("MicroMsg.CardHomePageUI", "doGetLayout() >> doNetSceneGetCardsHomePageLayout()");
    Object localObject;
    if (!this.kwW)
    {
      w.i("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, shouldGetHomePage is false");
      if (!com.tencent.mm.plugin.card.b.l.amk()) {
        break label220;
      }
      ap.AS();
      int i = ((Integer)com.tencent.mm.x.c.xi().get(w.a.uVu, Integer.valueOf(1))).intValue();
      w.i("MicroMsg.BatchGetCardMgr", "need do getCardsLayoutScene scene is " + i);
      localObject = new ad(al.ajI().gBS, al.ajI().gBT, i);
      ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
    }
    for (;;)
    {
      al.ajI().m("", "", 4);
      GMTrace.o(5034238541824L, 37508);
      return;
      if (this.ksz)
      {
        w.e("MicroMsg.CardHomePageUI", "doNetSceneGetCardsHomePageLayout, isDoingGetData is true");
        break;
      }
      if ((this.ksx) && (!bg.mZ(this.ksA))) {
        this.ksA = "";
      }
      this.ksz = true;
      this.kwW = false;
      localObject = new com.tencent.mm.plugin.card.sharecard.model.b(al.ajI().gBS, al.ajI().gBT, this.ksA);
      ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
      break;
      label220:
      w.i("MicroMsg.CardHomePageUI", "the card entrance is not open, don't do doNetSceneGetCardsLayout!");
    }
  }
  
  private void akr()
  {
    GMTrace.i(5035043848192L, 37514);
    int i = getIntent().getIntExtra("key_from_scene", 22);
    boolean bool1 = com.tencent.mm.s.c.vP().aC(262152, 266256);
    boolean bool2 = com.tencent.mm.s.c.vP().aD(262152, 266256);
    boolean bool3 = com.tencent.mm.s.c.vP().a(w.a.uVi, w.a.uVk);
    boolean bool4 = com.tencent.mm.s.c.vP().a(w.a.uVj, w.a.uVl);
    ap.AS();
    String str = bg.mY((String)com.tencent.mm.x.c.xi().get(w.a.uVo, null));
    if (bool1)
    {
      com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(2), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    if (bool2)
    {
      com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(1), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    if ((bool3) && (!bool4))
    {
      com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(3), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    if ((bool3) && (bool4))
    {
      com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(4), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    if (bool4)
    {
      com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(5), Integer.valueOf(i), "", Integer.valueOf(0), str });
      GMTrace.o(5035043848192L, 37514);
      return;
    }
    com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "CardHomePageUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(i), "", Integer.valueOf(0), str });
    GMTrace.o(5035043848192L, 37514);
  }
  
  private void ale()
  {
    GMTrace.i(5033701670912L, 37504);
    w.i("MicroMsg.CardHomePageUI", "updateMemberCardItem()");
    c localc = (c)this.kme;
    if (this.kwY == null)
    {
      this.kwY = ((TextView)findViewById(R.h.cbQ));
      this.kwY.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4936393818112L, 36779);
          paramAnonymousView = new Intent(CardHomePageUI.this, CardIndexUI.class);
          paramAnonymousView.putExtra("key_card_type", 1);
          CardHomePageUI.this.startActivity(paramAnonymousView);
          com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "GotoMemberCardUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(4936393818112L, 36779);
        }
      });
    }
    if (localc.getCount() > 0)
    {
      this.kwY.setVisibility(0);
      this.kwY.setText(getString(R.l.dGx, new Object[] { Integer.valueOf(com.tencent.mm.plugin.card.sharecard.a.b.ajU()) }));
      this.kwT.setVisibility(8);
      GMTrace.o(5033701670912L, 37504);
      return;
    }
    this.kwY.setVisibility(8);
    this.kwT.setVisibility(0);
    GMTrace.o(5033701670912L, 37504);
  }
  
  private void alf()
  {
    GMTrace.i(5035580719104L, 37518);
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    localIntent.putExtra("preferred_tab", 3);
    com.tencent.mm.bi.d.a(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    finish();
    GMTrace.o(5035580719104L, 37518);
  }
  
  private void ar()
  {
    GMTrace.i(5033567453184L, 37503);
    w.i("MicroMsg.CardHomePageUI", "updateView()");
    this.kwS.alj();
    ale();
    this.kwU.ar();
    this.kwV.ar();
    GMTrace.o(5033567453184L, 37503);
  }
  
  protected final void MH()
  {
    GMTrace.i(5032762146816L, 37497);
    boolean bool = com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
    w.i("MicroMsg.CardHomePageUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
    this.kwX = bool;
    if (this.kwX) {
      akm();
    }
    for (;;)
    {
      super.MH();
      GMTrace.o(5032762146816L, 37497);
      return;
      w.e("MicroMsg.CardHomePageUI", "location permission is denied, doGetLayout");
      akp();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(5034909630464L, 37513);
    super.a(paramInt1, paramInt2, paramString, paramk);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof ad))
      {
        ale();
        this.kmk.Bg();
        this.kwV.ar();
        GMTrace.o(5034909630464L, 37513);
        return;
      }
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.b)paramk;
        this.ksz = false;
        this.ksA = paramString.kqI;
        this.ksi.P(paramString.kpq, this.ksx);
        if ((!com.tencent.mm.plugin.card.sharecard.a.b.akb()) || (!com.tencent.mm.plugin.card.sharecard.a.b.akc())) {
          this.ksx = false;
        }
        w.i("MicroMsg.CardHomePageUI", "NetSceneGetShareCardsLayout() >> updateView()");
        ar();
        GMTrace.o(5034909630464L, 37513);
      }
    }
    else
    {
      if ((paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b)) {
        this.ksz = false;
      }
      w.i("MicroMsg.CardHomePageUI", "share card list ui, onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    GMTrace.o(5034909630464L, 37513);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(5035312283648L, 37516);
    this.ksv = true;
    GMTrace.o(5035312283648L, 37516);
  }
  
  public final void aiV()
  {
    GMTrace.i(5035178065920L, 37515);
    this.ksv = true;
    GMTrace.o(5035178065920L, 37515);
  }
  
  protected final void aib()
  {
    GMTrace.i(5032896364544L, 37498);
    oC(R.l.dFu);
    a(0, getString(R.l.dFQ), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5029675139072L, 37474);
        com.tencent.mm.plugin.card.b.b.a(CardHomePageUI.this, true);
        com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "CardListMsgMenu", Integer.valueOf(2), Integer.valueOf(0), "", "" });
        GMTrace.o(5029675139072L, 37474);
        return true;
      }
    });
    this.ksi = new com.tencent.mm.plugin.card.sharecard.a.b(this);
    this.ksi.init();
    if (this.kwS == null)
    {
      this.kwS = new i(this, this.vov.iiK);
      i locali = this.kwS;
      locali.kxT = View.inflate(locali.jFp, R.i.cOx, null);
      locali.kxT.setVisibility(8);
      locali.kxU = ((TextView)locali.kxT.findViewById(R.h.bqi));
      locali.kxV = ((ImageView)locali.kxT.findViewById(R.h.bqh));
      locali.kxT.setOnClickListener(new i.1(locali));
      locali.alj();
      if (locali.kxW == null)
      {
        locali.kxW = ((ViewStub)locali.krg.findViewById(R.h.bqx)).inflate();
        locali.kxW.setVisibility(8);
        locali.kxX = ((TextView)locali.kxW.findViewById(R.h.bqi));
        locali.kxY = ((ImageView)locali.kxW.findViewById(R.h.bqh));
        locali.kxW.setOnClickListener(new i.2(locali));
      }
      this.kwS.ksQ = true;
    }
    if (this.kwT == null) {
      this.kwT = new f(this, findViewById(R.h.bqu), 1, this.ksi);
    }
    if (this.kwU == null) {
      this.kwU = new f(this, findViewById(R.h.brd), 2, this.ksi);
    }
    if (this.kwV == null) {
      this.kwV = new f(this, findViewById(R.h.brn), 3, this.ksi);
    }
    if (this.kwT != null) {
      this.kwT.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(5007260778496L, 37307);
          paramAnonymousView = new Intent(CardHomePageUI.this, CardIndexUI.class);
          paramAnonymousView.putExtra("key_card_type", 1);
          CardHomePageUI.this.startActivity(paramAnonymousView);
          com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "GotoMemberCardUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(1), "", Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(5007260778496L, 37307);
        }
      });
    }
    if (this.kwU != null) {
      this.kwU.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4970887774208L, 37036);
          paramAnonymousView = new Intent(CardHomePageUI.this, ShareCardListUI.class);
          paramAnonymousView.putExtra("key_layout_buff", CardHomePageUI.e(CardHomePageUI.this));
          CardHomePageUI.f(CardHomePageUI.this);
          CardHomePageUI.this.startActivity(paramAnonymousView);
          paramAnonymousView = (com.tencent.mm.plugin.card.sharecard.model.l)al.ajH().getValue("key_share_card_layout_data");
          int i;
          int j;
          label86:
          int k;
          if (paramAnonymousView != null)
          {
            if (!paramAnonymousView.fME) {
              break label307;
            }
            i = 1;
            if (!paramAnonymousView.fMF) {
              break label312;
            }
            j = 1;
            if (paramAnonymousView.kqU == null) {
              break label317;
            }
            k = 1;
            label96:
            if (!TextUtils.isEmpty(paramAnonymousView.kqV)) {
              break label323;
            }
          }
          label307:
          label312:
          label317:
          label323:
          for (int m = 0;; m = 1)
          {
            com.tencent.mm.plugin.report.service.g.paX.i(13685, new Object[] { Integer.valueOf(2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
            if (paramAnonymousView.fMF == true)
            {
              CardHomePageUI.g(CardHomePageUI.this);
              paramAnonymousView.fMF = false;
            }
            if (paramAnonymousView.fME)
            {
              CardHomePageUI.g(CardHomePageUI.this);
              paramAnonymousView.fME = false;
              paramAnonymousView.kqU = null;
              paramAnonymousView.kqV = "";
            }
            ap.AS();
            com.tencent.mm.x.c.xi().a(w.a.uVq, "");
            com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "ClickShareCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
            GMTrace.o(4970887774208L, 37036);
            return;
            i = 0;
            break;
            j = 0;
            break label86;
            k = 0;
            break label96;
          }
        }
      });
    }
    if (this.kwV != null) {
      this.kwV.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18900540456960L, 140820);
          paramAnonymousView = new Intent(CardHomePageUI.this, CardIndexUI.class);
          paramAnonymousView.putExtra("key_card_type", 3);
          CardHomePageUI.this.startActivity(paramAnonymousView);
          com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "ClickTicketCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(18900540456960L, 140820);
        }
      });
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18896782360576L, 140792);
        if ((CardHomePageUI.a(CardHomePageUI.this) == 1) || (CardHomePageUI.a(CardHomePageUI.this) == 2)) {
          CardHomePageUI.b(CardHomePageUI.this);
        }
        for (;;)
        {
          GMTrace.o(18896782360576L, 140792);
          return true;
          CardHomePageUI.this.finish();
        }
      }
    });
    GMTrace.o(5032896364544L, 37498);
  }
  
  protected final int aic()
  {
    GMTrace.i(5033030582272L, 37499);
    int i = n.a.kpo;
    GMTrace.o(5033030582272L, 37499);
    return i;
  }
  
  protected final boolean aie()
  {
    GMTrace.i(5034372759552L, 37509);
    boolean bool = super.aie();
    GMTrace.o(5034372759552L, 37509);
    return bool;
  }
  
  protected final boolean aif()
  {
    GMTrace.i(5034506977280L, 37510);
    GMTrace.o(5034506977280L, 37510);
    return true;
  }
  
  protected final void aik()
  {
    GMTrace.i(5033970106368L, 37506);
    if (this.ksB)
    {
      w.e("MicroMsg.CardHomePageUI", "onLocationFinish, has do GetShareCardLayout,don't get again");
      if (this.kwX) {
        aij();
      }
      GMTrace.o(5033970106368L, 37506);
      return;
    }
    w.d("MicroMsg.CardHomePageUI", "onLocationFinish()");
    this.ksB = true;
    akp();
    aij();
    GMTrace.o(5033970106368L, 37506);
  }
  
  protected final void ail()
  {
    GMTrace.i(5034104324096L, 37507);
    if ((this.ksC) || (this.ksB))
    {
      aij();
      GMTrace.o(5034104324096L, 37507);
      return;
    }
    this.ksC = true;
    w.i("MicroMsg.CardHomePageUI", "onLocationFail()");
    akp();
    GMTrace.o(5034104324096L, 37507);
  }
  
  protected final void aim()
  {
    GMTrace.i(5033299017728L, 37501);
    w.i("MicroMsg.CardHomePageUI", "onMPermissionGranted locationPermissionGranted " + this.kwX);
    if (!this.kwX)
    {
      this.kwX = true;
      akm();
    }
    GMTrace.o(5033299017728L, 37501);
  }
  
  protected final void ain()
  {
    GMTrace.i(5033835888640L, 37505);
    ale();
    GMTrace.o(5033835888640L, 37505);
  }
  
  protected final void b(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5034641195008L, 37511);
    super.b(paramb);
    GMTrace.o(5034641195008L, 37511);
  }
  
  protected final void c(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5034775412736L, 37512);
    super.c(paramb);
    GMTrace.o(5034775412736L, 37512);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5032225275904L, 37493);
    int i = R.i.cOl;
    GMTrace.o(5032225275904L, 37493);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5032091058176L, 37492);
    super.onCreate(paramBundle);
    this.fromScene = getIntent().getIntExtra("key_home_page_from_scene", 0);
    long l = System.currentTimeMillis();
    this.mStartTime = l;
    this.ksG = l;
    MH();
    paramBundle = this.kwS;
    al.ajG().a(paramBundle);
    ap.wT().a(1164, this);
    ap.wT().a(984, this);
    al.ajJ().ajT();
    al.ajB();
    com.tencent.mm.plugin.card.a.b.lt(1);
    akr();
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        GMTrace.i(18882555281408L, 140686);
        Object localObject;
        int i;
        if (CardHomePageUI.h(CardHomePageUI.this) != null)
        {
          CardHomePageUI.h(CardHomePageUI.this);
          ap.AS();
          localObject = (Integer)com.tencent.mm.x.c.xi().get(w.a.uVE, Integer.valueOf(0));
          if ((localObject == null) || (((Integer)localObject).intValue() != 1)) {
            break label89;
          }
          i = 0;
        }
        for (;;)
        {
          if (i != 0)
          {
            w.i("MicroMsg.CardHomePageUI", "try2UpdateCardType");
            CardHomePageUI.i(CardHomePageUI.this);
          }
          GMTrace.o(18882555281408L, 140686);
          return false;
          label89:
          ap.AS();
          com.tencent.mm.x.c.xi().a(w.a.uVE, Integer.valueOf(1));
          localObject = al.ajC().lv(n.a.kpj);
          if ((localObject != null) && (((Cursor)localObject).getCount() > 0))
          {
            ((Cursor)localObject).moveToFirst();
            if (!((Cursor)localObject).isAfterLast())
            {
              CardInfo localCardInfo = new CardInfo();
              localCardInfo.b((Cursor)localObject);
              if (localCardInfo.field_card_type == -1)
              {
                if (localCardInfo.aiK() != null) {
                  break label190;
                }
                w.e("MicroMsg.ShareCardDataMgr", "updateCardType fail , info.getCardTpInfo() == null");
              }
              for (;;)
              {
                ((Cursor)localObject).moveToNext();
                break;
                label190:
                localCardInfo.field_card_type = localCardInfo.aiK().knq;
                if (!al.ajC().c(localCardInfo, new String[0])) {
                  w.e("MicroMsg.ShareCardDataMgr", "updateCardType fail , cardId = %s", new Object[] { localCardInfo.field_card_id });
                }
              }
            }
            ((Cursor)localObject).close();
            i = 1;
          }
          else
          {
            w.e("MicroMsg.ShareCardDataMgr", "updateAllCardInfoByBlockField cursor is null or size is 0");
            i = 0;
          }
        }
      }
    });
    al.ajJ().a(this);
    al.ajC().c(this);
    GMTrace.o(5032091058176L, 37492);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5032359493632L, 37494);
    if (this.kwX) {
      aij();
    }
    i locali = this.kwS;
    al.ajG().b(locali);
    this.ksi.kqA = null;
    ap.wT().b(1164, this);
    ap.wT().b(984, this);
    al.ajJ().b(this);
    al.ajC().j(this);
    com.tencent.mm.plugin.card.a.k.ajq();
    com.tencent.mm.plugin.card.sharecard.a.b.aka();
    long l1 = System.currentTimeMillis();
    long l2 = this.ksG;
    com.tencent.mm.plugin.report.service.g.paX.i(13219, new Object[] { "CardHomePageUI", Integer.valueOf(this.fromScene), "", "", Long.valueOf(l1 - l2) });
    super.onDestroy();
    GMTrace.o(5032359493632L, 37494);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5035446501376L, 37517);
    if (paramInt == 4)
    {
      if ((this.fromScene != 1) && (this.fromScene != 2)) {
        break label52;
      }
      alf();
    }
    for (;;)
    {
      boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
      GMTrace.o(5035446501376L, 37517);
      return bool;
      label52:
      finish();
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(5033433235456L, 37502);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    akr();
    this.ksv = true;
    this.kwW = true;
    GMTrace.o(5033433235456L, 37502);
  }
  
  protected void onPause()
  {
    GMTrace.i(5032627929088L, 37496);
    super.onPause();
    GMTrace.o(5032627929088L, 37496);
  }
  
  protected void onResume()
  {
    GMTrace.i(5032493711360L, 37495);
    w.i("MicroMsg.CardHomePageUI", "onResume locationPermissionGranted %s, hasInitLocation %s, shouldGetLayout %s", new Object[] { Boolean.valueOf(this.kwX), Boolean.valueOf(this.ksH), Boolean.valueOf(this.ksv) });
    if ((this.kwX) && (this.ksH) && (this.ksv))
    {
      this.ksA = "";
      this.ksB = false;
      aii();
    }
    for (;;)
    {
      this.ksv = false;
      ar();
      long l = System.currentTimeMillis();
      if (this.mStartTime != 0L)
      {
        int i = (int)(l - this.mStartTime);
        ArrayList localArrayList = new ArrayList();
        IDKey localIDKey1 = new IDKey();
        localIDKey1.SetID(281);
        localIDKey1.SetKey(0);
        localIDKey1.SetValue(1L);
        IDKey localIDKey2 = new IDKey();
        localIDKey2.SetID(281);
        localIDKey2.SetKey(1);
        localIDKey2.SetValue(i);
        localArrayList.add(localIDKey1);
        localArrayList.add(localIDKey2);
        com.tencent.mm.plugin.report.service.g.paX.b(localArrayList, true);
        this.mStartTime = 0L;
      }
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18881615757312L, 140679);
          al.ajS().a(q.kAY);
          GMTrace.o(18881615757312L, 140679);
        }
      });
      super.onResume();
      GMTrace.o(5032493711360L, 37495);
      return;
      if (this.ksv)
      {
        this.ksA = "";
        akp();
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardHomePageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */