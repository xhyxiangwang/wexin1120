package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.am;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.protocal.c.ua;
import com.tencent.mm.protocal.c.uc;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.protocal.c.ug;
import com.tencent.mm.protocal.c.uh;
import com.tencent.mm.protocal.c.ui;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;

public class GameSearchUI
  extends MMActivity
  implements com.tencent.mm.ac.e, p.b
{
  private static final Pattern mPT;
  private int fromScene;
  private View jJt;
  private ProgressBar jUz;
  private com.tencent.mm.ui.tools.p kGl;
  private ViewGroup mPU;
  private TextView mPV;
  private ListView mPW;
  private ListView mPX;
  private r mPY;
  private s mPZ;
  private String mQa;
  private String mQb;
  private LinkedList<String> mQc;
  private String mQd;
  private LinkedList<k> mQe;
  private boolean mQf;
  private AdapterView.OnItemClickListener mQg;
  private AdapterView.OnItemClickListener mQh;
  
  static
  {
    GMTrace.i(12705452785664L, 94663);
    mPT = Pattern.compile("\\s+");
    GMTrace.o(12705452785664L, 94663);
  }
  
  public GameSearchUI()
  {
    GMTrace.i(12702231560192L, 94639);
    this.mQe = new LinkedList();
    this.mQf = false;
    this.mQg = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(12699949858816L, 94622);
        paramAnonymousAdapterView = GameSearchUI.b(GameSearchUI.this);
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getCount())) {}
        for (paramAnonymousAdapterView = null; paramAnonymousAdapterView == null; paramAnonymousAdapterView = ((r.b)paramAnonymousAdapterView.getItem(paramAnonymousInt)).mPJ)
        {
          GMTrace.o(12699949858816L, 94622);
          return;
        }
        if ((paramAnonymousAdapterView.actionType == 1) && (!bg.mZ(paramAnonymousAdapterView.appId)))
        {
          paramAnonymousView = new Bundle();
          paramAnonymousView.putCharSequence("game_app_id", paramAnonymousAdapterView.appId);
          paramAnonymousView.putInt("game_report_from_scene", paramAnonymousAdapterView.fKV);
          paramAnonymousInt = c.a(GameSearchUI.this, paramAnonymousAdapterView.appId, null, paramAnonymousView);
          paramAnonymousView = new HashMap();
          paramAnonymousView.put("function_type", "search");
          paramAnonymousView.put("funtion_value", paramAnonymousAdapterView.mPL);
          paramAnonymousView.put("keyword", GameSearchUI.f(GameSearchUI.this));
          paramAnonymousView = ai.u(paramAnonymousView);
          ai.a(GameSearchUI.this, 14, paramAnonymousAdapterView.fKV, paramAnonymousAdapterView.position, paramAnonymousInt, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), paramAnonymousView);
          GMTrace.o(12699949858816L, 94622);
          return;
        }
        if ((paramAnonymousAdapterView.actionType == 2) && (!bg.mZ(paramAnonymousAdapterView.mPK)))
        {
          paramAnonymousInt = c.p(GameSearchUI.this, paramAnonymousAdapterView.mPK, "game_center_detail");
          paramAnonymousView = new HashMap();
          paramAnonymousView.put("function_type", "search");
          paramAnonymousView.put("funtion_value", paramAnonymousAdapterView.mPL);
          paramAnonymousView.put("keyword", GameSearchUI.f(GameSearchUI.this));
          paramAnonymousView = ai.u(paramAnonymousView);
          ai.a(GameSearchUI.this, 14, paramAnonymousAdapterView.fKV, paramAnonymousAdapterView.position, paramAnonymousInt, 0, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), paramAnonymousAdapterView.mPF, String.valueOf(paramAnonymousAdapterView.mPG), null, paramAnonymousView);
        }
        GMTrace.o(12699949858816L, 94622);
      }
    };
    this.mQh = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(17974303916032L, 133919);
        paramAnonymousAdapterView = ((s)paramAnonymousAdapterView.getAdapter()).oK(paramAnonymousInt);
        if (bg.mZ(paramAnonymousAdapterView.text))
        {
          GMTrace.o(17974303916032L, 133919);
          return;
        }
        if (bg.mZ(paramAnonymousAdapterView.appId))
        {
          paramAnonymousView = new LinkedList();
          paramAnonymousView.add(paramAnonymousAdapterView.text);
          GameSearchUI.b(GameSearchUI.this, paramAnonymousView);
          GameSearchUI.h(GameSearchUI.this);
          GMTrace.o(17974303916032L, 133919);
          return;
        }
        switch (paramAnonymousAdapterView.actionType)
        {
        default: 
          w.e("MicroMsg.GameSearchUI", "unknowed actionType : " + paramAnonymousAdapterView.actionType);
          GMTrace.o(17974303916032L, 133919);
          return;
        case 1: 
          paramAnonymousView = new Bundle();
          paramAnonymousView.putCharSequence("game_app_id", paramAnonymousAdapterView.appId);
          paramAnonymousView.putInt("game_report_from_scene", 1402);
          i = c.a(GameSearchUI.this, paramAnonymousAdapterView.appId, null, paramAnonymousView);
          ai.a(GameSearchUI.this, 14, 1402, paramAnonymousInt, i, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), null);
          GMTrace.o(17974303916032L, 133919);
          return;
        }
        int i = c.p(GameSearchUI.this.vov.voR, paramAnonymousAdapterView.mPM, "game_center_detail");
        ai.a(GameSearchUI.this, 14, 1402, paramAnonymousInt, i, paramAnonymousAdapterView.appId, GameSearchUI.g(GameSearchUI.this), null);
        GMTrace.o(17974303916032L, 133919);
      }
    };
    GMTrace.o(12702231560192L, 94639);
  }
  
  private void a(LinkedList<String> paramLinkedList, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(17974840786944L, 133923);
    while (!this.mQe.isEmpty())
    {
      h.xA();
      h.xy().gQO.c((k)this.mQe.pop());
    }
    if (paramBoolean)
    {
      localObject = this.mPY;
      ((r)localObject).mBx = 0;
      ((r)localObject).mPn = false;
    }
    this.mQc = paramLinkedList;
    Object localObject = new am(v.bMQ(), paramLinkedList, com.tencent.mm.plugin.game.model.e.aEe(), this.mPY.mBx);
    ap.wT().a((k)localObject, 0);
    this.mQe.add(localObject);
    paramLinkedList = paramLinkedList.iterator();
    for (this.mQa = ""; paramLinkedList.hasNext(); this.mQa = (this.mQa + " " + (String)paramLinkedList.next())) {}
    this.mQa = this.mQa.trim();
    if ((paramInt == 1) || (paramInt == 2))
    {
      this.mQf = true;
      this.kGl.VU(this.mQa);
    }
    GMTrace.o(17974840786944L, 133923);
  }
  
  private void d(LinkedList<String> paramLinkedList, int paramInt)
  {
    GMTrace.i(12703305302016L, 94647);
    a(paramLinkedList, 0, true);
    GMTrace.o(12703305302016L, 94647);
  }
  
  private void oL(int paramInt)
  {
    GMTrace.i(12703171084288L, 94646);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mPU.setVisibility(8);
      this.mPV.setVisibility(8);
      this.mPW.setVisibility(8);
      this.mPX.setVisibility(8);
      this.jUz.setVisibility(8);
      GMTrace.o(12703171084288L, 94646);
      return;
      aKl();
      this.mPW.smoothScrollToPosition(0);
      this.kGl.clearFocus();
      this.mPU.setVisibility(8);
      this.mPV.setVisibility(8);
      this.mPW.setVisibility(8);
      this.mPX.setVisibility(8);
      this.jUz.setVisibility(0);
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mPW.smoothScrollToPosition(0);
      this.mPU.setVisibility(8);
      this.mPV.setVisibility(8);
      this.mPW.setVisibility(8);
      this.mPX.setVisibility(8);
      this.jUz.setVisibility(0);
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mPU.setVisibility(8);
      if (this.mPY.getCount() > 0)
      {
        this.mPV.setVisibility(8);
        this.mPW.setVisibility(0);
      }
      for (;;)
      {
        this.mPX.setVisibility(8);
        this.jUz.setVisibility(8);
        GMTrace.o(12703171084288L, 94646);
        return;
        this.mPV.setVisibility(0);
        this.mPW.setVisibility(8);
      }
      this.mPU.setVisibility(0);
      this.mPV.setVisibility(8);
      this.mPW.setVisibility(8);
      this.mPX.setVisibility(8);
      this.jUz.setVisibility(8);
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mPU.setVisibility(8);
      this.mPV.setVisibility(0);
      this.mPW.setVisibility(8);
      this.mPX.setVisibility(8);
      this.jUz.setVisibility(8);
      GMTrace.o(12703171084288L, 94646);
      return;
      this.mPU.setVisibility(8);
      this.mPV.setVisibility(8);
      this.mPW.setVisibility(8);
      this.mPX.setVisibility(0);
      this.jUz.setVisibility(8);
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(12702634213376L, 94642);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(12665053249536L, 94362);
        GameSearchUI.this.onBackPressed();
        GMTrace.o(12665053249536L, 94362);
        return true;
      }
    });
    this.kGl = new com.tencent.mm.ui.tools.p();
    this.kGl.mp(true);
    this.kGl.wLV = this;
    this.mPU = ((ViewGroup)findViewById(R.h.cGk));
    this.jUz = ((ProgressBar)findViewById(R.h.ctK));
    this.mPV = ((TextView)findViewById(R.h.cgA));
    this.mPW = ((ListView)findViewById(R.h.ctN));
    this.mPY = new r(this);
    this.mPW.setAdapter(this.mPY);
    this.mPW.setOnItemClickListener(this.mQg);
    this.mPW.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(12705855438848L, 94666);
        GameSearchUI.a(GameSearchUI.this).clearFocus();
        GameSearchUI.this.aKl();
        GMTrace.o(12705855438848L, 94666);
        return false;
      }
    });
    this.mPW.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(17976854052864L, 133938);
        GMTrace.o(17976854052864L, 133938);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(17976719835136L, 133937);
        if ((paramAnonymousInt == 0) && (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1) && (GameSearchUI.b(GameSearchUI.this).mPn))
        {
          if (GameSearchUI.c(GameSearchUI.this) != null) {
            GameSearchUI.c(GameSearchUI.this).setVisibility(0);
          }
          GameSearchUI.a(GameSearchUI.this, GameSearchUI.d(GameSearchUI.this));
        }
        GMTrace.o(17976719835136L, 133937);
      }
    });
    this.jJt = getLayoutInflater().inflate(R.i.cWC, this.mPW, false);
    this.jJt.setVisibility(8);
    this.mPW.addFooterView(this.jJt);
    this.mPX = ((ListView)findViewById(R.h.ctL));
    this.mPZ = new s(this);
    this.mPX.setAdapter(this.mPZ);
    this.mPX.setOnItemClickListener(this.mQh);
    this.mPX.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(17976317181952L, 133934);
        GameSearchUI.e(GameSearchUI.this).clearFocus();
        GameSearchUI.this.aKl();
        GMTrace.o(17976317181952L, 133934);
        return false;
      }
    });
    GMTrace.o(12702634213376L, 94642);
  }
  
  public final void Qt()
  {
    GMTrace.i(12704110608384L, 94653);
    aKl();
    onBackPressed();
    GMTrace.o(12704110608384L, 94653);
  }
  
  public final void Qu()
  {
    GMTrace.i(12703976390656L, 94652);
    GMTrace.o(12703976390656L, 94652);
  }
  
  public final void Qv()
  {
    GMTrace.i(12702365777920L, 94640);
    GMTrace.o(12702365777920L, 94640);
  }
  
  public final void Qw()
  {
    GMTrace.i(17080816500736L, 127262);
    GMTrace.o(17080816500736L, 127262);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12703439519744L, 94648);
    if (paramk.hmr)
    {
      GMTrace.o(12703439519744L, 94648);
      return;
    }
    if (this.mQe.contains(paramk)) {
      this.mQe.remove(paramk);
    }
    this.jJt.setVisibility(8);
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(12703439519744L, 94648);
      return;
      paramString = (ue)((am)paramk).lnP.hlU.hmc;
      w.d("MicroMsg.GameSearchUI", "keywords = %s, offset = %d", new Object[] { paramString.tSk, Integer.valueOf(paramString.tSl) });
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (uf)((am)paramk).lnP.hlV.hmc;
        label219:
        label289:
        Object localObject3;
        Object localObject4;
        if (paramString != null)
        {
          paramString = paramString.tSm;
          if (bg.bX(paramString)) {
            break label1774;
          }
          this.mQb = this.mQa;
          if (this.mPY.mBx != 0)
          {
            paramk = this.mPY;
            localObject1 = this.mQb;
            paramString = paramString.iterator();
          }
        }
        else
        {
          for (;;)
          {
            if (!paramString.hasNext()) {
              break label1774;
            }
            localObject2 = (ug)paramString.next();
            if ((((ug)localObject2).type == 3) && (!bg.bX(((ug)localObject2).tSo)))
            {
              paramk.mBx = ((ug)localObject2).tSs;
              paramk.mPn = ((ug)localObject2).tSt;
              localObject2 = ((ug)localObject2).tSo.iterator();
              if (((Iterator)localObject2).hasNext())
              {
                localObject3 = r.b.a((ui)((Iterator)localObject2).next());
                ((r.b)localObject3).fum = ((String)localObject1);
                ((r.b)localObject3).mPJ.appId = ((r.b)localObject3).appId;
                ((r.b)localObject3).mPJ.mPF = ((r.b)localObject3).mPF;
                ((r.b)localObject3).mPJ.mPG = ((r.b)localObject3).mPG;
                ((r.b)localObject3).mPJ.mPL = "2";
                localObject4 = ((r.b)localObject3).mPJ;
                paramInt1 = paramk.mPk;
                paramk.mPk = (paramInt1 + 1);
                ((r.c)localObject4).position = (paramInt1 + 301);
                localObject4 = ((r.b)localObject3).mPJ;
                if (!paramk.fuq) {
                  break label446;
                }
              }
              label446:
              for (paramInt1 = 1403;; paramInt1 = 1405)
              {
                ((r.c)localObject4).fKV = paramInt1;
                paramk.kIh.add(localObject3);
                break label289;
                break label219;
                paramString = null;
                break;
              }
            }
            paramk.mPn = false;
          }
        }
        paramk = this.mPY;
        localObject1 = this.mQb;
        if (paramk.kIh == null) {
          paramk.kIh = new ArrayList();
        }
        paramk.mMA = 0;
        paramk.mPi = 0;
        paramk.mPj = 0;
        paramk.mPk = 0;
        paramk.mPl = 0;
        paramk.fuq = false;
        paramk.mPh = false;
        paramk.mPn = false;
        paramk.mBx = 0;
        paramk.kIh.clear();
        paramk.mPo = false;
        Object localObject2 = paramString.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramString = (ug)((Iterator)localObject2).next();
          label608:
          label627:
          int i;
          if ((paramString.tSn == null) || (paramString.tSn.size() == 0))
          {
            paramInt1 = 1;
            if ((paramString.tSo != null) && (paramString.tSo.size() != 0)) {
              break label732;
            }
            paramInt2 = 1;
            if ((paramString.tSr != null) && (paramString.tSr.size() != 0)) {
              break label737;
            }
            i = 1;
            label647:
            if ((paramInt1 == 0) || (paramInt2 == 0) || (i == 0)) {
              break label743;
            }
            paramInt1 = 1;
            label662:
            if (paramInt1 == 0) {
              break label763;
            }
            if (paramString.type != 1) {
              continue;
            }
            if (bg.mZ((String)localObject1)) {
              break label748;
            }
          }
          label732:
          label737:
          label743:
          label748:
          for (paramString = paramk.context.getString(R.l.edX, new Object[] { localObject1 });; paramString = paramk.context.getString(R.l.edW))
          {
            paramk.kIh.add(r.b.ac(6, paramString));
            paramk.mPo = true;
            break;
            paramInt1 = 0;
            break label608;
            paramInt2 = 0;
            break label627;
            i = 0;
            break label647;
            paramInt1 = 0;
            break label662;
          }
          label763:
          paramk.kIh.add(r.b.ac(0, paramString.fuw));
          if (!paramk.mPo)
          {
            ((r.b)paramk.kIh.get(paramk.kIh.size() - 1)).mPH = true;
            paramk.mPo = true;
          }
          Object localObject5;
          if ((paramString.type == 4) && (paramString.tSr != null))
          {
            localObject3 = paramString.tSr.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject5 = (uh)((Iterator)localObject3).next();
              localObject4 = new r.b();
              ((r.b)localObject4).type = 3;
              ((r.b)localObject4).appId = ((uh)localObject5).tSu.mDD;
              ((r.b)localObject4).name = ((uh)localObject5).tSu.mCJ;
              ((r.b)localObject4).iDL = ((uh)localObject5).tSu.tJO;
              ((r.b)localObject4).iconUrl = ((uh)localObject5).tSu.mFy;
              ((r.b)localObject4).mPB = ((uh)localObject5).tSu.mCL;
              ((r.b)localObject4).mPC = ((uh)localObject5).tSu.tRZ;
              ((r.b)localObject4).actionType = ((uh)localObject5).tSu.tSa;
              ((r.b)localObject4).mPD = ((uh)localObject5).tSu.tSb;
              ((r.b)localObject4).mPE = ((uh)localObject5).tSv;
              ((r.b)localObject4).mPJ = new r.c(((uh)localObject5).tSu.tSa, 4, ((uh)localObject5).tSu.mDD, ((uh)localObject5).tSu.tSb);
              ((r.b)localObject4).fum = ((String)localObject1);
              ((r.b)localObject4).mPJ.mPL = "3";
              localObject5 = ((r.b)localObject4).mPJ;
              paramInt1 = paramk.mPj;
              paramk.mPj = (paramInt1 + 1);
              ((r.c)localObject5).position = (paramInt1 + 601);
              paramk.kIh.add(localObject4);
            }
          }
          if (((paramString.type == 1) || (paramString.type == 2)) && (paramString.tSn != null))
          {
            localObject3 = paramString.tSn.iterator();
            if (((Iterator)localObject3).hasNext())
            {
              localObject5 = (ua)((Iterator)localObject3).next();
              localObject4 = new r.b();
              ((r.b)localObject4).type = 1;
              ((r.b)localObject4).appId = ((ua)localObject5).mDD;
              ((r.b)localObject4).name = ((ua)localObject5).mCJ;
              ((r.b)localObject4).iDL = ((ua)localObject5).tJO;
              ((r.b)localObject4).iconUrl = ((ua)localObject5).mFy;
              ((r.b)localObject4).mPB = ((ua)localObject5).mCL;
              ((r.b)localObject4).mPC = ((ua)localObject5).tRZ;
              ((r.b)localObject4).actionType = ((ua)localObject5).tSa;
              ((r.b)localObject4).mPD = ((ua)localObject5).tSb;
              ((r.b)localObject4).mPJ = new r.c(((ua)localObject5).tSa, 1, ((ua)localObject5).mDD, ((ua)localObject5).tSb);
              ((r.b)localObject4).fum = ((String)localObject1);
              if (paramString.type == 1)
              {
                paramk.fuq = true;
                localObject5 = ((r.b)localObject4).mPJ;
                paramInt1 = paramk.mMA;
                paramk.mMA = (paramInt1 + 1);
                ((r.c)localObject5).position = (paramInt1 + 1);
              }
              for (;;)
              {
                ((r.b)localObject4).mPJ.mPL = "1";
                paramk.kIh.add(localObject4);
                break;
                if (paramString.type == 2)
                {
                  paramk.mPh = true;
                  localObject5 = ((r.b)localObject4).mPJ;
                  paramInt1 = paramk.mPi;
                  paramk.mPi = (paramInt1 + 1);
                  ((r.c)localObject5).position = (paramInt1 + 1);
                }
              }
            }
          }
          else if ((paramString.type == 3) && (paramString.tSo != null))
          {
            paramk.mBx = paramString.tSs;
            paramk.mPn = paramString.tSt;
            localObject3 = paramString.tSo.iterator();
            while (((Iterator)localObject3).hasNext())
            {
              localObject4 = r.b.a((ui)((Iterator)localObject3).next());
              ((r.b)localObject4).fum = ((String)localObject1);
              ((r.b)localObject4).mPJ.appId = ((r.b)localObject4).appId;
              ((r.b)localObject4).mPJ.mPF = ((r.b)localObject4).mPF;
              ((r.b)localObject4).mPJ.mPG = ((r.b)localObject4).mPG;
              ((r.b)localObject4).mPJ.mPL = "2";
              localObject5 = ((r.b)localObject4).mPJ;
              paramInt1 = paramk.mPk;
              paramk.mPk = (paramInt1 + 1);
              ((r.c)localObject5).position = (paramInt1 + 301);
              paramk.kIh.add(localObject4);
            }
          }
          if ((!bg.mZ(paramString.tSp)) && (!bg.mZ(paramString.tSq)) && (paramString.type == 1))
          {
            localObject3 = paramString.tSp;
            paramString = paramString.tSq;
            localObject4 = new r.b();
            ((r.b)localObject4).type = 5;
            ((r.b)localObject4).name = ((String)localObject3);
            ((r.b)localObject4).mPJ = new r.c(paramString);
            ((r.b)localObject4).mPJ.appId = "wx62d9035fd4fd2059";
            ((r.b)localObject4).mPJ.mPL = "1";
            ((r.b)localObject4).mPJ.position = 300;
            paramk.kIh.add(localObject4);
          }
        }
        paramString = paramk.kIh.iterator();
        while (paramString.hasNext())
        {
          localObject1 = (r.b)paramString.next();
          if (paramk.fuq) {
            ((r.b)localObject1).mPJ.fKV = 1403;
          } else if (paramk.mPh) {
            ((r.b)localObject1).mPJ.fKV = 1404;
          } else {
            ((r.b)localObject1).mPJ.fKV = 1405;
          }
        }
        paramk.notifyDataSetChanged();
      }
      label1774:
      oL(2);
      GMTrace.o(12703439519744L, 94648);
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        GMTrace.o(12703439519744L, 94648);
        return;
      }
      paramString = ((an)paramk).fum;
      Object localObject1 = ((uc)((an)paramk).lnP.hlV.hmc).fuw;
      paramk = ((uc)((an)paramk).lnP.hlV.hmc).tSi;
      this.mPZ.a(paramString, (String)localObject1, paramk);
      oL(5);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12703036866560L, 94645);
    int i = R.i.cWZ;
    GMTrace.o(12703036866560L, 94645);
    return i;
  }
  
  public final boolean np(String paramString)
  {
    GMTrace.i(12704379043840L, 94655);
    if (bg.mZ(paramString))
    {
      GMTrace.o(12704379043840L, 94655);
      return true;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString = mPT.split(paramString.replace('*', ' '));
    int i = 0;
    while (i < paramString.length)
    {
      localLinkedList.add(paramString[i]);
      i += 1;
    }
    d(localLinkedList, 0);
    oL(1);
    GMTrace.o(12704379043840L, 94655);
    return true;
  }
  
  public final void nq(String paramString)
  {
    GMTrace.i(12704244826112L, 94654);
    if (this.mQf)
    {
      this.mQf = false;
      GMTrace.o(12704244826112L, 94654);
      return;
    }
    if ((this.mQd != null) && (this.mQd.equals(bg.mY(paramString))))
    {
      w.d("MicroMsg.GameSearchUI", "repeat searchChange");
      GMTrace.o(12704244826112L, 94654);
      return;
    }
    this.mQd = paramString;
    if (bg.mZ(paramString))
    {
      while (!this.mQe.isEmpty())
      {
        h.xA();
        h.xy().gQO.c((k)this.mQe.pop());
      }
      paramString = new an(v.bMQ(), paramString, com.tencent.mm.plugin.game.model.e.aEe());
      ap.wT().a(paramString, 0);
      this.mQe.add(paramString);
      GMTrace.o(12704244826112L, 94654);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramString = mPT.split(paramString.replace('*', ' '));
    int i = 0;
    while (i < paramString.length)
    {
      localLinkedList.add(paramString[i]);
      i += 1;
    }
    d(localLinkedList, 0);
    oL(6);
    GMTrace.o(12704244826112L, 94654);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(12703707955200L, 94650);
    super.onBackPressed();
    GMTrace.o(12703707955200L, 94650);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12702499995648L, 94641);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    if (!ap.AV())
    {
      w.e("MicroMsg.GameSearchUI", "account not ready");
      finish();
      GMTrace.o(12702499995648L, 94641);
      return;
    }
    ap.wT().a(1328, this);
    ap.wT().a(1329, this);
    this.fromScene = getIntent().getIntExtra("game_report_from_scene", 0);
    MH();
    ai.a(this, 14, 1401, 0, 2, this.fromScene, null);
    w.i("MicroMsg.GameSearchUI", "[onCreate] time:" + (System.currentTimeMillis() - l));
    GMTrace.o(12702499995648L, 94641);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(12702768431104L, 94643);
    this.kGl.a(this, paramMenu);
    this.kGl.setHint(SubCoreGameCenter.aFc());
    GMTrace.o(12702768431104L, 94643);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12703842172928L, 94651);
    w.i("MicroMsg.GameSearchUI", "onDestroy");
    super.onDestroy();
    ap.wT().b(1328, this);
    ap.wT().b(1329, this);
    GMTrace.o(12703842172928L, 94651);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(12703573737472L, 94649);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      GMTrace.o(12703573737472L, 94649);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(12703573737472L, 94649);
    return bool;
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(12702902648832L, 94644);
    this.kGl.a(this, paramMenu);
    GMTrace.o(12702902648832L, 94644);
    return true;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */