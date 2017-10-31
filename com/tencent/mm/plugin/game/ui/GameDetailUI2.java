package com.tencent.mm.plugin.game.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.plugin.game.c.am;
import com.tencent.mm.plugin.game.c.av;
import com.tencent.mm.plugin.game.c.aw;
import com.tencent.mm.plugin.game.c.az;
import com.tencent.mm.plugin.game.c.ba;
import com.tencent.mm.plugin.game.c.cc;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ac;
import com.tencent.mm.plugin.game.model.ac.a;
import com.tencent.mm.plugin.game.model.ac.b;
import com.tencent.mm.plugin.game.model.ad;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.l;
import com.tencent.mm.plugin.game.model.l.b;
import com.tencent.mm.plugin.game.model.z;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.d;
import com.tencent.mm.pluginsdk.ui.applet.k.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.q.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GameDetailUI2
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  private String appId;
  private Dialog lou;
  private int mBs;
  private TextView mKA;
  private LinearLayout mKB;
  private GameDetailAutoScrollView mKC;
  private LinearLayout mKD;
  private TextView mKE;
  private LinearLayout mKF;
  private TextView mKG;
  private LinearLayout mKH;
  private ImageView mKI;
  private View mKJ;
  private TextView mKK;
  private TextView mKL;
  private View mKM;
  private TextView mKN;
  private ImageView mKO;
  private TextView mKP;
  private TextView mKQ;
  private LinearLayout mKR;
  private GameMediaList mKS;
  private TextView mKT;
  private TextView mKU;
  private TextView mKV;
  private boolean mKW;
  private LinearLayout mKX;
  private TextView mKY;
  private LinearLayout mKZ;
  private String mKk;
  private String mKl;
  private int mKn;
  private boolean mKo;
  private boolean mKp;
  private String mKq;
  private l.b mKr;
  private e mKs;
  private com.tencent.mm.plugin.game.model.m mKt;
  private ViewGroup mKu;
  private ImageView mKv;
  private ImageView mKw;
  private TextView mKx;
  private Button mKy;
  private TextProgressBar mKz;
  private TextView mLa;
  private cc mLb;
  private DialogInterface.OnClickListener mLc;
  private View.OnClickListener mLd;
  private View.OnClickListener mLe;
  private View.OnClickListener mLf;
  private View.OnClickListener mLg;
  private View.OnClickListener mLh;
  private View.OnClickListener mLi;
  private com.tencent.mm.plugin.game.model.c mzY;
  
  public GameDetailUI2()
  {
    GMTrace.i(12668140257280L, 94385);
    this.appId = null;
    this.mzY = null;
    this.mKk = null;
    this.mKl = null;
    this.mKn = 18;
    this.mBs = 0;
    this.mKq = null;
    this.mKr = null;
    this.mKs = null;
    this.mKt = null;
    this.mKW = false;
    this.mLc = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12744644362240L, 94955);
        GameDetailUI2.i(GameDetailUI2.this).aEn();
        GameDetailUI2.m(GameDetailUI2.this).a(GameDetailUI2.j(GameDetailUI2.this), GameDetailUI2.k(GameDetailUI2.this), GameDetailUI2.l(GameDetailUI2.this), GameDetailUI2.i(GameDetailUI2.this));
        GMTrace.o(12744644362240L, 94955);
      }
    };
    this.mLd = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12690420400128L, 94551);
        if (GameDetailUI2.l(GameDetailUI2.this) == null)
        {
          w.e("MicroMsg.GameDetailUI2", "Null appInfo");
          GMTrace.o(12690420400128L, 94551);
          return;
        }
        if (GameDetailUI2.i(GameDetailUI2.this) == null)
        {
          w.e("MicroMsg.GameDetailUI2", "No DownloadInfo found");
          GMTrace.o(12690420400128L, 94551);
          return;
        }
        GameDetailUI2.i(GameDetailUI2.this).cA(GameDetailUI2.this.vov.voR);
        GameDetailUI2.m(GameDetailUI2.this).a(GameDetailUI2.l(GameDetailUI2.this), GameDetailUI2.i(GameDetailUI2.this));
        GMTrace.o(12690420400128L, 94551);
      }
    };
    this.mLe = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12675388014592L, 94439);
        if ((paramAnonymousView.getTag() instanceof String))
        {
          com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
          ai.a(GameDetailUI2.this.vov.voR, 12, 1203, 999, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
          GMTrace.o(12675388014592L, 94439);
          return;
        }
        Object localObject = new GameDetailRankUI.a();
        ((GameDetailRankUI.a)localObject).mKk = GameDetailUI2.n(GameDetailUI2.this);
        ((GameDetailRankUI.a)localObject).mKl = GameDetailUI2.o(GameDetailUI2.this);
        ((GameDetailRankUI.a)localObject).mKm = GameDetailUI2.l(GameDetailUI2.this);
        paramAnonymousView = com.tencent.mm.x.q.gi("rankData");
        com.tencent.mm.x.q.Aw().n(paramAnonymousView, true).k(GameDetailRankUI.mKi, localObject);
        localObject = new Intent(GameDetailUI2.this.vov.voR, GameDetailRankUI.class);
        ((Intent)localObject).putExtra(GameDetailRankUI.EXTRA_SESSION_ID, paramAnonymousView);
        GameDetailUI2.this.startActivity((Intent)localObject);
        ai.a(GameDetailUI2.this.vov.voR, 12, 1203, 999, 6, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12675388014592L, 94439);
      }
    };
    this.mLf = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12775111786496L, 95182);
        com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
        ai.a(GameDetailUI2.this.vov.voR, 12, 1204, 999, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12775111786496L, 95182);
      }
    };
    this.mLg = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12715250679808L, 94736);
        com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
        ai.a(GameDetailUI2.this.vov.voR, 12, 1205, 1, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12715250679808L, 94736);
      }
    };
    this.mLh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12740349394944L, 94923);
        com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
        ai.a(GameDetailUI2.this.vov.voR, 12, 1205, 999, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12740349394944L, 94923);
      }
    };
    this.mLi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12758603005952L, 95059);
        com.tencent.mm.plugin.game.d.c.a(paramAnonymousView, GameDetailUI2.this);
        ai.a(GameDetailUI2.this.vov.voR, 12, 1206, 1, 7, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
        GMTrace.o(12758603005952L, 95059);
      }
    };
    GMTrace.o(12668140257280L, 94385);
  }
  
  private void a(ac paramac)
  {
    GMTrace.i(12669482434560L, 94395);
    Object localObject1 = null;
    if ((paramac.mBB.mBC == null) || (paramac.mBB.mBC.size() == 0)) {
      localObject1 = paramac.mBy.mEz;
    }
    if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
    {
      this.mKB.setVisibility(8);
      GMTrace.o(12669482434560L, 94395);
      return;
    }
    this.mKB.setVisibility(0);
    this.mKB.removeAllViews();
    paramac = ((LinkedList)localObject1).iterator();
    if (paramac.hasNext())
    {
      localObject1 = (com.tencent.mm.plugin.game.c.q)paramac.next();
      View localView = LayoutInflater.from(this.vov.voR).inflate(R.i.cWn, this.mKB, false);
      ImageView localImageView = (ImageView)localView.findViewById(R.h.bMp);
      TextView localTextView1 = (TextView)localView.findViewById(R.h.bMq);
      TextView localTextView2 = (TextView)localView.findViewById(R.h.bMo);
      if (!bg.mZ(((com.tencent.mm.plugin.game.c.q)localObject1).jWW)) {
        a.b.a(localImageView, ((com.tencent.mm.plugin.game.c.q)localObject1).jWW, 0.5F, false);
      }
      for (;;)
      {
        localTextView1.setText(((com.tencent.mm.plugin.game.c.q)localObject1).fuw);
        localTextView2.setText(((com.tencent.mm.plugin.game.c.q)localObject1).mDI);
        this.mKB.addView(localView);
        break;
        Object localObject2 = new c.a();
        ((c.a)localObject2).hDm = true;
        localObject2 = ((c.a)localObject2).Jk();
        com.tencent.mm.an.n.Ja().a(((com.tencent.mm.plugin.game.c.q)localObject1).mCI, localImageView, (com.tencent.mm.an.a.a.c)localObject2);
      }
    }
    GMTrace.o(12669482434560L, 94395);
  }
  
  private void b(ac paramac)
  {
    GMTrace.i(12669616652288L, 94396);
    if ((paramac.aEE() != null) && (!paramac.aEE().isEmpty()))
    {
      this.mKF.setVisibility(0);
      int i;
      if (!bg.mZ(paramac.aED()))
      {
        this.mKG.setVisibility(0);
        this.mKG.setText(paramac.aED());
        this.mKH.removeAllViews();
        if (paramac.aEF() != 1) {
          break label277;
        }
        this.mKH.setOrientation(1);
        i = R.i.cWf;
        this.mKI.setVisibility(8);
      }
      Object localObject;
      for (;;)
      {
        localObject = paramac.aEE();
        if (localObject == null) {
          break label300;
        }
        localObject = ((LinkedList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          ac.b localb = (ac.b)((Iterator)localObject).next();
          View localView = LayoutInflater.from(this.vov.voR).inflate(i, this.mKH, false);
          ImageView localImageView = (ImageView)localView.findViewById(R.h.bLF);
          com.tencent.mm.an.n.Ja().a(localb.fJv, localImageView);
          if (paramac.aEF() == 1) {
            ((TextView)localView.findViewById(R.h.bLG)).setText(localb.title);
          }
          ((TextView)localView.findViewById(R.h.bLE)).setText(localb.desc);
          if (paramac.aEF() == 1)
          {
            localView.setTag(localb.url);
            localView.setOnClickListener(this.mLf);
          }
          this.mKH.addView(localView);
        }
        this.mKG.setVisibility(8);
        break;
        label277:
        this.mKH.setOrientation(0);
        i = R.i.cWe;
        this.mKI.setVisibility(0);
      }
      label300:
      if (paramac.mBy.mEH != null)
      {
        localObject = new ac.a();
        ((ac.a)localObject).title = paramac.mBy.mEH.mFm;
        ((ac.a)localObject).desc = paramac.mBy.mEH.desc;
        ((ac.a)localObject).url = paramac.mBy.mEH.url;
        paramac = (ac)localObject;
        if (paramac == null) {
          break label546;
        }
        this.mKJ.setVisibility(0);
        this.mKK.setText(paramac.title);
        if (bg.mZ(paramac.desc)) {
          break label534;
        }
        this.mKL.setVisibility(0);
        this.mKL.setText(paramac.desc);
      }
      for (;;)
      {
        this.mKJ.setTag(paramac.url);
        this.mKJ.setOnClickListener(this.mLf);
        GMTrace.o(12669616652288L, 94396);
        return;
        if ((paramac.mBy.mEC != null) && (!bg.mZ(paramac.mBy.mEC.mFo)) && (!bg.mZ(paramac.mBy.mEC.mFp)))
        {
          localObject = new ac.a();
          ((ac.a)localObject).title = paramac.mBy.mEC.mFo;
          ((ac.a)localObject).url = paramac.mBy.mEC.mFp;
          paramac = (ac)localObject;
          break;
        }
        paramac = null;
        break;
        label534:
        this.mKL.setVisibility(8);
      }
      label546:
      this.mKJ.setVisibility(8);
      GMTrace.o(12669616652288L, 94396);
      return;
    }
    this.mKF.setVisibility(8);
    GMTrace.o(12669616652288L, 94396);
  }
  
  private void b(ad paramad)
  {
    int i = 0;
    GMTrace.i(12669348216832L, 94394);
    List localList = paramad.mBC;
    if ((localList == null) || (localList.size() == 0))
    {
      this.mKD.setVisibility(8);
      this.mKE.setVisibility(8);
      GMTrace.o(12669348216832L, 94394);
      return;
    }
    this.mKD.setVisibility(0);
    if (localList.size() > 3) {
      this.mKE.setVisibility(0);
    }
    for (;;)
    {
      this.mKD.removeAllViews();
      h localh = new h(this.vov.voR);
      localh.CM = R.i.cWk;
      localh.a(paramad);
      localh.mBs = this.mBs;
      while ((i < localList.size()) && (i < 3))
      {
        paramad = localh.getView(i, null, this.mKB);
        this.mKD.addView(paramad);
        i += 1;
      }
      this.mKE.setVisibility(8);
    }
    GMTrace.o(12669348216832L, 94394);
  }
  
  private void c(ac paramac)
  {
    GMTrace.i(12669750870016L, 94397);
    if ((paramac.aEK() != null) && (!paramac.aEK().isEmpty()))
    {
      this.mKX.setVisibility(0);
      if (!bg.mZ(paramac.aEJ()))
      {
        this.mKY.setVisibility(0);
        this.mKY.setText(paramac.aEJ());
      }
      for (;;)
      {
        this.mKZ.removeAllViews();
        this.mKZ.setOnClickListener(null);
        Iterator localIterator = paramac.aEK().iterator();
        while (localIterator.hasNext())
        {
          ba localba = (ba)localIterator.next();
          View localView = LayoutInflater.from(this.vov.voR).inflate(R.i.cWg, this.mKZ, false);
          TextView localTextView1 = (TextView)localView.findViewById(R.h.bLS);
          TextView localTextView2 = (TextView)localView.findViewById(R.h.bLT);
          TextView localTextView3 = (TextView)localView.findViewById(R.h.bLQ);
          ImageView localImageView = (ImageView)localView.findViewById(R.h.bLR);
          localTextView1.setText(localba.mFu);
          localTextView2.setText(localba.fuw);
          localTextView3.setText(localba.mDI);
          com.tencent.mm.an.n.Ja().a(localba.mFq, localImageView);
          localView.setTag(localba.mCE);
          localView.setOnClickListener(this.mLg);
          this.mKZ.addView(localView);
        }
        this.mKY.setVisibility(8);
      }
      if (paramac.mBy.mEC == null) {
        paramac = null;
      }
      while (paramac != null)
      {
        this.mLa.setVisibility(0);
        this.mLa.setText((CharSequence)paramac.first);
        this.mLa.setTag(paramac.second);
        this.mLa.setOnClickListener(this.mLh);
        GMTrace.o(12669750870016L, 94397);
        return;
        if ((bg.mZ(paramac.mBy.mEB.fuw)) || (bg.mZ(paramac.mBy.mEB.mFp))) {
          paramac = null;
        } else {
          paramac = new Pair(paramac.mBy.mEB.mFo, paramac.mBy.mEB.mFp);
        }
      }
      this.mLa.setVisibility(8);
      GMTrace.o(12669750870016L, 94397);
      return;
    }
    this.mKX.setVisibility(8);
    GMTrace.o(12669750870016L, 94397);
  }
  
  private void goBack()
  {
    GMTrace.i(12669079781376L, 94392);
    Object localObject = getIntent().getStringExtra("jump_game_center");
    if ((!bg.mZ((String)localObject)) && (((String)localObject).equals("jump_game_center")))
    {
      localObject = new Intent(this, GameCenterUI.class);
      ((Intent)localObject).putExtra("jump_find_more_friends", "jump_find_more_friends");
      startActivity((Intent)localObject);
    }
    finish();
    GMTrace.o(12669079781376L, 94392);
  }
  
  protected final void MH()
  {
    GMTrace.i(12669213999104L, 94393);
    oC(R.l.eda);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12660758282240L, 94330);
        GameDetailUI2.a(GameDetailUI2.this);
        GMTrace.o(12660758282240L, 94330);
        return true;
      }
    });
    this.mKu = ((ViewGroup)findViewById(R.h.bLq));
    this.mKv = ((ImageView)findViewById(R.h.bLr));
    this.mKw = ((ImageView)findViewById(R.h.bMC));
    this.mKx = ((TextView)findViewById(R.h.bNj));
    this.mKA = ((TextView)findViewById(R.h.bME));
    this.mKy = ((Button)findViewById(R.h.bKY));
    this.mKz = ((TextProgressBar)findViewById(R.h.bNm));
    this.mKz.oN(this.mKn);
    this.mKB = ((LinearLayout)findViewById(R.h.bMn));
    this.mKC = ((GameDetailAutoScrollView)findViewById(R.h.bMm));
    this.mKD = ((LinearLayout)findViewById(R.h.bLW));
    this.mKE = ((TextView)findViewById(R.h.bLY));
    this.mKF = ((LinearLayout)findViewById(R.h.bLy));
    this.mKG = ((TextView)findViewById(R.h.bLH));
    this.mKH = ((LinearLayout)findViewById(R.h.bLz));
    this.mKI = ((ImageView)findViewById(R.h.bLA));
    this.mKJ = findViewById(R.h.bLB);
    this.mKK = ((TextView)findViewById(R.h.bLD));
    this.mKL = ((TextView)findViewById(R.h.bLC));
    this.mKM = findViewById(R.h.bLI);
    this.mKN = ((TextView)findViewById(R.h.bLM));
    this.mKO = ((ImageView)findViewById(R.h.bLL));
    this.mKP = ((TextView)findViewById(R.h.bLJ));
    this.mKQ = ((TextView)findViewById(R.h.bLK));
    this.mKR = ((LinearLayout)findViewById(R.h.bLu));
    this.mKS = ((GameMediaList)findViewById(R.h.bLV));
    GameMediaList localGameMediaList = this.mKS;
    String str = this.appId;
    int i = this.mBs;
    localGameMediaList.appId = str;
    localGameMediaList.lFH = 12;
    localGameMediaList.mLA = i;
    localGameMediaList.mContext = this;
    this.mKS.mNz = R.i.cWF;
    this.mKT = ((TextView)findViewById(R.h.bLw));
    this.mKU = ((TextView)findViewById(R.h.bLv));
    this.mKU.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        GMTrace.i(12717263945728L, 94751);
        if (GameDetailUI2.b(GameDetailUI2.this).getLineCount() > 3)
        {
          GameDetailUI2.c(GameDetailUI2.this).setVisibility(0);
          GMTrace.o(12717263945728L, 94751);
          return;
        }
        GameDetailUI2.c(GameDetailUI2.this).setVisibility(8);
        GMTrace.o(12717263945728L, 94751);
      }
    });
    this.mKV = ((TextView)findViewById(R.h.bLx));
    this.mKV.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12688272916480L, 94535);
        if (!GameDetailUI2.d(GameDetailUI2.this))
        {
          GameDetailUI2.b(GameDetailUI2.this).setMaxLines(100);
          GameDetailUI2.c(GameDetailUI2.this).setText(GameDetailUI2.this.getResources().getText(R.l.ecS));
          GameDetailUI2.a(GameDetailUI2.this, true);
          GMTrace.o(12688272916480L, 94535);
          return;
        }
        GameDetailUI2.b(GameDetailUI2.this).setMaxLines(3);
        GameDetailUI2.c(GameDetailUI2.this).setText(GameDetailUI2.this.getResources().getText(R.l.ecR));
        GameDetailUI2.a(GameDetailUI2.this, false);
        GMTrace.o(12688272916480L, 94535);
      }
    });
    this.mKX = ((LinearLayout)findViewById(R.h.bLN));
    this.mKY = ((TextView)findViewById(R.h.bLU));
    this.mKZ = ((LinearLayout)findViewById(R.h.bLO));
    this.mLa = ((TextView)findViewById(R.h.bLP));
    GMTrace.o(12669213999104L, 94393);
  }
  
  protected final int Qb()
  {
    GMTrace.i(12668542910464L, 94388);
    GMTrace.o(12668542910464L, 94388);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(12669885087744L, 94398);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (!com.tencent.mm.plugin.game.a.a.ifN.a(this, paramInt1, paramInt2, paramString)) {
        Toast.makeText(this, getString(R.l.edv, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      if (this.lou != null) {
        this.lou.cancel();
      }
      GMTrace.o(12669885087744L, 94398);
      return;
    }
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(12669885087744L, 94398);
      return;
      paramString = ((com.tencent.mm.plugin.game.model.ap)paramk).lnP.hlV.hmc;
      com.tencent.mm.x.ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12714713808896L, 94732);
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12746657628160L, 94970);
              GameDetailUI2.a(GameDetailUI2.this, this.mLm);
              if (GameDetailUI2.h(GameDetailUI2.this) != null) {
                GameDetailUI2.h(GameDetailUI2.this).dismiss();
              }
              GMTrace.o(12746657628160L, 94970);
            }
          });
          GMTrace.o(12714713808896L, 94732);
        }
      });
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12668408692736L, 94387);
    int i = R.i.cWc;
    GMTrace.o(12668408692736L, 94387);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(12670019305472L, 94399);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.GameDetailUI2", "requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default: 
      w.e("MicroMsg.GameDetailUI2", "error request code");
      GMTrace.o(12670019305472L, 94399);
      return;
    case 1: 
      switch (paramInt2)
      {
      case 1: 
      default: 
        GMTrace.o(12670019305472L, 94399);
        return;
      case 3: 
        if (this.mKt != null)
        {
          this.mKt.aEn();
          GMTrace.o(12670019305472L, 94399);
          return;
        }
        break;
      case 2: 
        if ((this.mzY != null) && (this.mKt != null))
        {
          this.mKt.aEo();
          this.mKs.a(this.mzY, this.mKt);
          GMTrace.o(12670019305472L, 94399);
          return;
        }
        break;
      case 0: 
        GMTrace.o(12670019305472L, 94399);
        return;
      }
      break;
    case 2: 
      if (paramInt2 == -1)
      {
        final String str2 = paramIntent.getStringExtra("Select_Conv_User");
        if (!bg.mZ(str2))
        {
          String str1 = this.mLb.mCI;
          paramIntent = str1;
          if (bg.mZ(str1)) {
            paramIntent = this.mzY.field_appIconUrl;
          }
          d.a(this.vov, this.mLb.mGs, paramIntent, this.mLb.mGt, null, getResources().getString(R.l.dwY), new k.a()
          {
            public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(12764105932800L, 95100);
              if (paramAnonymousBoolean)
              {
                GameDetailUI2.a(GameDetailUI2.this, str2, paramAnonymousString);
                com.tencent.mm.ui.base.h.bl(GameDetailUI2.this, GameDetailUI2.this.getResources().getString(R.l.dLG));
                ai.a(GameDetailUI2.this.vov.voR, 12, 1207, 2, 14, GameDetailUI2.f(GameDetailUI2.this), GameDetailUI2.g(GameDetailUI2.this), null);
                GMTrace.o(12764105932800L, 95100);
                return;
              }
              GMTrace.o(12764105932800L, 95100);
            }
          });
        }
        GMTrace.o(12670019305472L, 94399);
        return;
      }
      break;
    case 3: 
      if (paramInt2 == -1)
      {
        ai.a(this.vov.voR, 12, 1207, 2, 15, this.appId, this.mBs, null);
        GMTrace.o(12670019305472L, 94399);
        return;
      }
      break;
    }
    GMTrace.o(12670019305472L, 94399);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    int i = 1;
    GMTrace.i(12668274475008L, 94386);
    super.onCreate(paramBundle);
    if (!com.tencent.mm.x.ap.AV())
    {
      w.e("MicroMsg.GameDetailUI2", "account not ready");
      finish();
      GMTrace.o(12668274475008L, 94386);
      return;
    }
    this.mKo = true;
    this.mKp = false;
    this.appId = getIntent().getStringExtra("game_app_id");
    if (bg.mZ(this.appId))
    {
      w.e("MicroMsg.GameDetailUI2", "appid is null or nill");
      finish();
      MH();
      com.tencent.mm.x.ap.wT().a(1217, this);
      paramBundle = SubCoreGameCenter.aFi().zd(this.appId);
      if ((paramBundle != null) && (paramBundle.length != 0)) {
        break label220;
      }
      w.i("MicroMsg.GameDetailUI2", "No cache found");
      i = 0;
    }
    for (;;)
    {
      if (i == 0)
      {
        this.lou = com.tencent.mm.plugin.game.d.c.cD(this);
        this.lou.show();
      }
      paramBundle = v.bMQ();
      boolean bool = g.n(this, this.appId);
      paramBundle = new com.tencent.mm.plugin.game.model.ap(paramBundle, this.appId, bool);
      com.tencent.mm.x.ap.wT().a(paramBundle, 0);
      GMTrace.o(12668274475008L, 94386);
      return;
      this.mBs = getIntent().getIntExtra("game_report_from_scene", 0);
      break;
      label220:
      com.tencent.mm.x.ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12775380221952L, 95184);
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(12731356807168L, 94856);
              GameDetailUI2.a(GameDetailUI2.this, this.mLm);
              GMTrace.o(12731356807168L, 94856);
            }
          });
          GMTrace.o(12775380221952L, 95184);
        }
      });
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12668811345920L, 94390);
    super.onDestroy();
    com.tencent.mm.x.ap.wT().b(1217, this);
    if (this.mKr != null) {
      l.b(this.mKr);
    }
    GMTrace.o(12668811345920L, 94390);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12668945563648L, 94391);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(12668945563648L, 94391);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12668945563648L, 94391);
    return bool;
  }
  
  protected void onResume()
  {
    GMTrace.i(12668677128192L, 94389);
    super.onResume();
    if ((this.mzY != null) && (this.mKt != null))
    {
      this.mKt.aEn();
      this.mKs.a(this.mKz, this.mKy, this.mzY, this.mKt);
    }
    if (!this.mKo)
    {
      b(new ad(this.appId));
      GMTrace.o(12668677128192L, 94389);
      return;
    }
    this.mKo = false;
    GMTrace.o(12668677128192L, 94389);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailUI2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */