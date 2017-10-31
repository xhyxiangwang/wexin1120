package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.game.c.ao;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.ar;
import com.tencent.mm.plugin.game.model.ay;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.z;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class GameCenterUI2
  extends GameCenterActivity
  implements com.tencent.mm.ac.e
{
  private Dialog lou;
  private ao mBH;
  private int mBs;
  private GameCenterListView mIC;
  private f mIE;
  private GameTopBannerView mIF;
  private GameInfoView mIG;
  private GameInfoViewForeign mIH;
  private GameMessageBubbleView mII;
  private GameCommonRecommendView mIJ;
  private MyGameInfoView mIK;
  private GameInstalledView mIL;
  private GameClassifyView mIM;
  private View mIN;
  private TextView mIO;
  private View mIP;
  private TextView mIQ;
  private ImageView mIR;
  private View mIS;
  private boolean mIT;
  private boolean mIU;
  private boolean mIV;
  private String mIW;
  private q mIX;
  private q mIY;
  private q mIZ;
  j mIc;
  private l.a mIe;
  private boolean mJa;
  private View.OnClickListener mJb;
  private View.OnClickListener mJc;
  
  public GameCenterUI2()
  {
    GMTrace.i(12734578032640L, 94880);
    this.mIT = true;
    this.mIV = false;
    this.mIW = "";
    this.mBs = 0;
    this.mJa = false;
    this.mIc = new j();
    this.mJb = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12686930739200L, 94525);
        com.tencent.mm.plugin.game.model.a.a locala = com.tencent.mm.plugin.game.model.a.aDX();
        int i;
        if (locala.fJg == 2) {
          i = com.tencent.mm.plugin.game.d.c.p(GameCenterUI2.this.vov.voR, locala.url, "game_center_library");
        }
        for (;;)
        {
          ai.a(GameCenterUI2.this.vov.voR, 10, 1005, 1, i, GameCenterUI2.f(GameCenterUI2.this), null);
          GMTrace.o(12686930739200L, 94525);
          return;
          paramAnonymousView = paramAnonymousView.getTag();
          if ((paramAnonymousView != null) && ((paramAnonymousView instanceof String)) && (!bg.mZ((String)paramAnonymousView)))
          {
            paramAnonymousView = (String)paramAnonymousView;
            i = com.tencent.mm.plugin.game.d.c.p(GameCenterUI2.this, paramAnonymousView, "game_center_library");
          }
          else
          {
            paramAnonymousView = new Intent(GameCenterUI2.this, GameLibraryUI.class);
            paramAnonymousView.putExtra("game_report_from_scene", 1005);
            GameCenterUI2.this.startActivity(paramAnonymousView);
            i = 6;
          }
        }
      }
    };
    this.mJc = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12662637330432L, 94344);
        Object localObject = paramAnonymousView.getTag();
        if ((localObject != null) && ((localObject instanceof String)) && (!bg.mZ((String)localObject)))
        {
          paramAnonymousView = (String)paramAnonymousView.getTag();
          int i = com.tencent.mm.plugin.game.d.c.p(GameCenterUI2.this.vov.voR, paramAnonymousView, "game_center_feedback");
          ai.a(GameCenterUI2.this.vov.voR, 10, 1010, 1, i, GameCenterUI2.f(GameCenterUI2.this), null);
        }
        GMTrace.o(12662637330432L, 94344);
      }
    };
    this.mIe = new l.a()
    {
      public final void oB(int paramAnonymousInt)
      {
        GMTrace.i(12733235855360L, 94870);
        int i = GameCenterUI2.g(GameCenterUI2.this).getHeaderViewsCount();
        int j = GameCenterUI2.g(GameCenterUI2.this).getFirstVisiblePosition() - i;
        int k = GameCenterUI2.g(GameCenterUI2.this).getLastVisiblePosition();
        if ((paramAnonymousInt >= j) && (paramAnonymousInt <= k - i))
        {
          View localView = GameCenterUI2.g(GameCenterUI2.this).getChildAt(paramAnonymousInt - j);
          GameCenterUI2.h(GameCenterUI2.this).w(localView, paramAnonymousInt);
        }
        GMTrace.o(12733235855360L, 94870);
      }
    };
    GMTrace.o(12734578032640L, 94880);
  }
  
  private void a(com.tencent.mm.plugin.game.model.ae paramae)
  {
    GMTrace.i(15199620825088L, 113246);
    if ((paramae != null) && (paramae.aEN() != null)) {}
    for (this.mIW = paramae.aEN().mDg; !bg.mZ(this.mIW); this.mIW = "")
    {
      if (this.mIU) {
        break label104;
      }
      a(0, R.k.dkN, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12677938151424L, 94458);
          int i = com.tencent.mm.plugin.game.d.c.aa(GameCenterUI2.this.vov.voR, GameCenterUI2.o(GameCenterUI2.this));
          ai.a(GameCenterUI2.this, 10, 1008, AuthorizedGameListUI.mGZ, i, GameCenterUI2.f(GameCenterUI2.this), null);
          GMTrace.o(12677938151424L, 94458);
          return true;
        }
      });
      this.mIU = true;
      GMTrace.o(15199620825088L, 113246);
      return;
    }
    if (this.mIU)
    {
      As(0);
      this.mIU = false;
    }
    label104:
    GMTrace.o(15199620825088L, 113246);
  }
  
  private void goBack()
  {
    GMTrace.i(12734980685824L, 94883);
    Object localObject = getIntent().getStringExtra("jump_find_more_friends");
    if ((!bg.mZ((String)localObject)) && (((String)localObject).equals("jump_find_more_friends")))
    {
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).putExtra("preferred_tab", 2);
      d.a(this, ".ui.LauncherUI", (Intent)localObject);
    }
    finish();
    GMTrace.o(12734980685824L, 94883);
  }
  
  protected final void MH()
  {
    GMTrace.i(12735517556736L, 94887);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12748134023168L, 94981);
        GameCenterUI2.e(GameCenterUI2.this);
        GMTrace.o(12748134023168L, 94981);
        return true;
      }
    });
    oC(R.l.eef);
    this.mIC = ((GameCenterListView)findViewById(R.h.bLk));
    this.mIC.setOnItemClickListener(this.mIc);
    this.mIc.oz(this.mBs);
    this.mIE = new f(this);
    this.mIE.oz(this.mBs);
    this.mIE.a(this.mIe);
    Object localObject = (LayoutInflater)this.vov.voR.getSystemService("layout_inflater");
    View localView = ((LayoutInflater)localObject).inflate(R.i.cXg, this.mIC, false);
    this.mIF = ((GameTopBannerView)localView.findViewById(R.h.cBS));
    this.mIC.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cVW, this.mIC, false);
    this.mIH = ((GameInfoViewForeign)localView.findViewById(R.h.bLi));
    this.mIC.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cVV, this.mIC, false);
    this.mIG = ((GameInfoView)localView.findViewById(R.h.bLh));
    this.mIC.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cVR, this.mIC, false);
    this.mII = ((GameMessageBubbleView)localView.findViewById(R.h.bNe));
    this.mIC.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cVZ, this.mIC, false);
    this.mIK = ((MyGameInfoView)localView.findViewById(R.h.cev));
    this.mIC.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.bLg, this.mIC, false);
    this.mIJ = ((GameCommonRecommendView)localView.findViewById(R.h.bLg));
    this.mIC.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cVX, this.mIC, false);
    this.mIL = ((GameInstalledView)localView.findViewById(R.h.bMF));
    this.mIC.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cWa, this.mIC, false);
    this.mIM = ((GameClassifyView)localView.findViewById(R.h.bLn));
    this.mIC.addHeaderView(localView);
    localView = ((LayoutInflater)localObject).inflate(R.i.cVU, this.mIC, false);
    this.mIC.addFooterView(localView);
    this.mIN = localView.findViewById(R.h.bMz);
    this.mIN.setOnClickListener(this.mJb);
    this.mIO = ((TextView)localView.findViewById(R.h.bMA));
    localView = ((LayoutInflater)localObject).inflate(R.i.cVS, null);
    this.mIC.addFooterView(localView);
    this.mIP = localView.findViewById(R.h.bHQ);
    this.mIQ = ((TextView)localView.findViewById(R.h.bHR));
    this.mIQ.setOnClickListener(this.mJc);
    localObject = ((LayoutInflater)localObject).inflate(R.i.cWt, this.mIC, false);
    this.mIC.addFooterView((View)localObject);
    this.mIR = ((ImageView)((View)localObject).findViewById(R.h.bMD));
    this.mIC.setAdapter(this.mIE);
    this.mIS = findViewById(R.h.bNT);
    GMTrace.o(12735517556736L, 94887);
  }
  
  protected final int Qb()
  {
    GMTrace.i(12735383339008L, 94886);
    GMTrace.o(12735383339008L, 94886);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(12735651774464L, 94888);
    w.i("MicroMsg.GameCenterUI2", "errType: %d errCode: %d, scene: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramk.hashCode()) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      switch (paramk.getType())
      {
      }
      for (;;)
      {
        GMTrace.o(12735651774464L, 94888);
        return;
        final long l = System.currentTimeMillis();
        paramString = ((ar)paramk).lnP.hlV.hmc;
        com.tencent.mm.plugin.game.d.c.xC().C(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12687199174656L, 94527);
            if (paramString == null) {
              GameCenterUI2.a(GameCenterUI2.this, new ao());
            }
            for (;;)
            {
              af.u(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(12771219472384L, 95153);
                  try
                  {
                    GameCenterUI2.a(GameCenterUI2.this, this.mJf, 2);
                    if (GameCenterUI2.i(GameCenterUI2.this) != null) {
                      GameCenterUI2.i(GameCenterUI2.this).dismiss();
                    }
                    w.i("MicroMsg.GameCenterUI2", "Server data parsing time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - GameCenterUI2.2.this.gBN) });
                    GMTrace.o(12771219472384L, 95153);
                    return;
                  }
                  catch (Exception localException)
                  {
                    for (;;)
                    {
                      w.e("MicroMsg.GameCenterUI2", "GameCenter crash, %s", new Object[] { localException.getMessage() });
                      GameCenterUI2.this.finish();
                    }
                  }
                }
              });
              GMTrace.o(12687199174656L, 94527);
              return;
              GameCenterUI2.a(GameCenterUI2.this, (ao)paramString);
            }
          }
        });
      }
    }
    if (!com.tencent.mm.plugin.game.a.a.ifN.a(this, paramInt1, paramInt2, paramString)) {
      Toast.makeText(this, getString(R.l.edv, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
    if (this.lou != null) {
      this.lou.cancel();
    }
    GMTrace.o(12735651774464L, 94888);
  }
  
  public final int aFr()
  {
    GMTrace.i(19279705538560L, 143645);
    GMTrace.o(19279705538560L, 143645);
    return 10;
  }
  
  public final int aFs()
  {
    GMTrace.i(19279839756288L, 143646);
    GMTrace.o(19279839756288L, 143646);
    return 1000;
  }
  
  public final int aFt()
  {
    GMTrace.i(19279973974016L, 143647);
    int i = this.mBs;
    GMTrace.o(19279973974016L, 143647);
    return i;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12735249121280L, 94885);
    int i = R.i.cVT;
    GMTrace.o(12735249121280L, 94885);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12735920209920L, 94890);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.GameCenterUI2", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(12735920209920L, 94890);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12734712250368L, 94881);
    super.onCreate(paramBundle);
    long l = System.currentTimeMillis();
    if (!ap.AV())
    {
      w.e("MicroMsg.GameCenterUI2", "account not ready");
      finish();
      GMTrace.o(12734712250368L, 94881);
      return;
    }
    this.mBs = getIntent().getIntExtra("game_report_from_scene", 0);
    this.mIV = getIntent().getBooleanExtra("from_find_more_friend", false);
    com.tencent.mm.plugin.game.d.c.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12732296331264L, 94863);
        GameCenterUI2.a(GameCenterUI2.this);
        if (GameCenterUI2.b(GameCenterUI2.this))
        {
          GameCenterUI2.c(GameCenterUI2.this);
          GameCenterUI2.d(GameCenterUI2.this);
          SubCoreGameCenter.aFf();
          t.aEs();
          SubCoreGameCenter.aFf();
          t.aEu();
        }
        GMTrace.o(12732296331264L, 94863);
      }
    });
    ap.wT().a(1238, this);
    MH();
    com.tencent.mm.plugin.game.d.c.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12723974832128L, 94801);
        Object localObject1 = SubCoreGameCenter.aFi().zd("pb_index_2");
        SharedPreferences localSharedPreferences;
        int i;
        label189:
        Object localObject3;
        String str;
        Object localObject2;
        if (localObject1 == null)
        {
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12709747752960L, 94695);
              if (GameCenterUI2.this.isFinishing())
              {
                GMTrace.o(12709747752960L, 94695);
                return;
              }
              GameCenterUI2.a(GameCenterUI2.this, com.tencent.mm.plugin.game.d.c.cD(GameCenterUI2.this));
              GameCenterUI2.i(GameCenterUI2.this).show();
              GMTrace.o(12709747752960L, 94695);
            }
          });
          SubCoreGameCenter.aFk().init(GameCenterUI2.this);
          com.tencent.mm.plugin.game.d.c.U(com.tencent.mm.plugin.game.model.e.aEe());
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12747597152256L, 94977);
              GameCenterUI2.j(GameCenterUI2.this).ee(true);
              GMTrace.o(12747597152256L, 94977);
            }
          });
          localObject1 = new ar(v.bMQ(), com.tencent.mm.plugin.game.model.e.aEe(), GameCenterUI2.k(GameCenterUI2.this), GameCenterUI2.l(GameCenterUI2.this), GameCenterUI2.m(GameCenterUI2.this), GameCenterUI2.b(GameCenterUI2.this));
          ap.wT().a((k)localObject1, 0);
          ActionBarActivity localActionBarActivity = GameCenterUI2.this.vov.voR;
          long l = System.currentTimeMillis() / 1000L;
          localSharedPreferences = localActionBarActivity.getSharedPreferences("game_center_pref", 0);
          localObject1 = localSharedPreferences.getString("download_app_id_time_map", "");
          if (bg.mZ((String)localObject1)) {
            break label510;
          }
          String[] arrayOfString1 = ((String)localObject1).split(",");
          localObject1 = new String();
          int j = arrayOfString1.length;
          i = 0;
          if (i >= j) {
            break label442;
          }
          localObject3 = arrayOfString1[i];
          String[] arrayOfString2 = ((String)localObject3).split("-");
          str = arrayOfString2[0];
          localObject2 = localObject1;
          if (!bg.mZ(str))
          {
            localObject2 = localObject1;
            if (!g.n(localActionBarActivity, str))
            {
              if (l - bg.getLong(arrayOfString2[1], 0L) >= 86400L) {
                break label319;
              }
              localObject2 = (String)localObject1 + (String)localObject3 + ",";
            }
          }
        }
        for (;;)
        {
          i += 1;
          localObject1 = localObject2;
          break label189;
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12691359924224L, 94558);
              try
              {
                GameCenterUI2.a(GameCenterUI2.this, this.mJf, 1);
                GMTrace.o(12691359924224L, 94558);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.GameCenterUI2", "GameCenter crash, %s", new Object[] { localException.getMessage() });
                GameCenterUI2.this.finish();
                GMTrace.o(12691359924224L, 94558);
              }
            }
          });
          break;
          label319:
          localObject3 = com.tencent.mm.plugin.downloader.model.f.aoQ().uX(str);
          w.i("MicroMsg.GameCenterLogic", "checkGameDownloadTime, status = %d, id = %d", new Object[] { Integer.valueOf(((FileDownloadTaskInfo)localObject3).status), Long.valueOf(((FileDownloadTaskInfo)localObject3).id) });
          if (((FileDownloadTaskInfo)localObject3).status == 2)
          {
            com.tencent.mm.plugin.downloader.model.f.aoQ().bc(((FileDownloadTaskInfo)localObject3).id);
            localObject2 = localObject1;
          }
          else if (((FileDownloadTaskInfo)localObject3).status != 0)
          {
            localObject2 = localObject1;
            if (((FileDownloadTaskInfo)localObject3).status != 4) {}
          }
          else
          {
            localObject2 = localObject1;
            if (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject3).path))
            {
              com.tencent.mm.loader.stub.b.deleteFile(((FileDownloadTaskInfo)localObject3).path);
              localObject2 = localObject1;
            }
          }
        }
        label442:
        if (!bg.mZ((String)localObject1))
        {
          localObject2 = localObject1;
          if (((String)localObject1).charAt(((String)localObject1).length() - 1) == ',') {
            localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
          }
          localSharedPreferences.edit().putString("download_app_id_time_map", ((String)localObject2).toString()).apply();
        }
        label510:
        localObject1 = v.bMQ();
        ab.getContext().getSharedPreferences("game_center_pref", 0).edit().putString("game_center_pref_lang", (String)localObject1).commit();
        com.tencent.mm.plugin.game.d.a.a.mRl.aFM();
        GMTrace.o(12723974832128L, 94801);
      }
    });
    ai.a(this, 10, 1000, 0, 1, 0, null, this.mBs, 0, null, null, null);
    w.i("MicroMsg.GameCenterUI2", "[onCreate] time:" + (System.currentTimeMillis() - l));
    w.i("MicroMsg.GameCenterUI2", "fromScene = %d", new Object[] { Integer.valueOf(this.mBs) });
    GMTrace.o(12734712250368L, 94881);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12735114903552L, 94884);
    w.i("MicroMsg.GameCenterUI2", "onDestroy");
    super.onDestroy();
    if (!ap.AV())
    {
      w.e("MicroMsg.GameCenterUI2", "account not ready");
      GMTrace.o(12735114903552L, 94884);
      return;
    }
    if (this.mIE != null) {
      this.mIE.clear();
    }
    if (this.mIL != null)
    {
      localObject = this.mIL;
      if (((GameInstalledView)localObject).mBJ != null) {
        ((GameInstalledView)localObject).mBJ.clear();
      }
      if (((GameInstalledView)localObject).mKr != null) {
        l.b(((GameInstalledView)localObject).mKr);
      }
    }
    if (this.mIK != null)
    {
      localObject = this.mIK;
      if (((MyGameInfoView)localObject).mKr != null) {
        l.b(((MyGameInfoView)localObject).mKr);
      }
      if (MyGameInfoView.mQI != null) {
        MyGameInfoView.mQI.clear();
      }
    }
    com.tencent.mm.plugin.game.d.a.a.mRl.clearCache();
    ap.wT().b(1238, this);
    Object localObject = SubCoreGameCenter.aFk();
    w.i("MicroMsg.GameAppCacheService", "clear cached apppinfos");
    if (((com.tencent.mm.plugin.game.model.b)localObject).myW != null) {
      ((com.tencent.mm.plugin.game.model.b)localObject).myW.clear();
    }
    if (((com.tencent.mm.plugin.game.model.b)localObject).myV != null) {
      ((com.tencent.mm.plugin.game.model.b)localObject).myV.clear();
    }
    ay.aFb();
    GMTrace.o(12735114903552L, 94884);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12735785992192L, 94889);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(12735785992192L, 94889);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12735785992192L, 94889);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(12734846468096L, 94882);
    super.onResume();
    if (!ap.AV())
    {
      w.e("MicroMsg.GameCenterUI2", "account not ready");
      GMTrace.o(12734846468096L, 94882);
      return;
    }
    if (!this.mIT)
    {
      if (this.mIG.getVisibility() == 0) {
        this.mIG.aFz();
      }
      for (;;)
      {
        SubCoreGameCenter.aFk().init(this);
        this.mIL.ee(false);
        this.mIE.refresh();
        if (this.mIK == null) {
          break;
        }
        localObject1 = this.mIK;
        String[] arrayOfString = new String[MyGameInfoView.mQI.keySet().size()];
        MyGameInfoView.mQI.keySet().toArray(arrayOfString);
        int i = 0;
        while (i < arrayOfString.length)
        {
          Object localObject2 = arrayOfString[i];
          Object localObject3 = (View)MyGameInfoView.mQI.get(localObject2);
          if (localObject3 != null)
          {
            localObject3 = (MyGameInfoView.a)((View)localObject3).getTag();
            localObject2 = (m)((MyGameInfoView)localObject1).mQH.get(localObject2);
            if ((localObject2 != null) && (((m)localObject2).mzY != null)) {
              ((MyGameInfoView)localObject1).mKs.a(((MyGameInfoView.a)localObject3).mNv, ((MyGameInfoView.a)localObject3).mNu, ((m)localObject2).mzY, (m)((MyGameInfoView)localObject1).mQH.get(((m)localObject2).mzY.field_appId));
            }
          }
          i += 1;
        }
        if (this.mIH.getVisibility() == 0) {
          this.mIH.aFz();
        }
      }
      Object localObject1 = this.mII;
      ((GameMessageBubbleView)localObject1).mNZ.setOnClickListener(null);
      ((GameMessageBubbleView)localObject1).setVisibility(8);
      if (this.mIV) {
        this.mII.aFE();
      }
      if (com.tencent.mm.plugin.game.d.a.a.mRl.mRk)
      {
        com.tencent.mm.plugin.game.d.a.a.mRl.mRk = false;
        com.tencent.mm.plugin.game.d.c.xC().C(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12662905765888L, 94346);
            ar localar = new ar(v.bMQ(), com.tencent.mm.plugin.game.model.e.aEe(), GameCenterUI2.k(GameCenterUI2.this), GameCenterUI2.l(GameCenterUI2.this), GameCenterUI2.m(GameCenterUI2.this), GameCenterUI2.b(GameCenterUI2.this));
            ap.wT().a(localar, 0);
            GMTrace.o(12662905765888L, 94346);
          }
        });
      }
    }
    this.mIT = false;
    GMTrace.o(12734846468096L, 94882);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterUI2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */