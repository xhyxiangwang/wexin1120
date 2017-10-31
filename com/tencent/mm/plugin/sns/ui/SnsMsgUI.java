package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.sns.data.SnsCmdList;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.agb;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bct;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SnsMsgUI
  extends MMActivity
  implements com.tencent.mm.ac.e, b.b
{
  private com.tencent.mm.sdk.platformtools.ae handler;
  private String hlx;
  private View jrT;
  private o.d kgb;
  private View kyb;
  private boolean kyc;
  private ListView nep;
  private View ner;
  private SnsCmdList qBC;
  private ar qHw;
  private a qLc;
  private boolean qLd;
  private boolean qLe;
  private boolean qLf;
  private com.tencent.mm.ui.base.q qLg;
  private int[] qLh;
  private View.OnClickListener qLi;
  private j.a qLj;
  Runnable qLk;
  long qih;
  int quU;
  private ao qxP;
  
  public SnsMsgUI()
  {
    GMTrace.i(8442563526656L, 62902);
    this.kyb = null;
    this.handler = com.tencent.mm.plugin.sns.model.ae.aCa();
    this.qLd = false;
    this.qLe = false;
    this.qBC = new SnsCmdList();
    this.kyc = false;
    this.qLf = false;
    this.qLh = new int[2];
    this.qLi = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8339081658368L, 62131);
        if ((paramAnonymousView.getTag() instanceof ap))
        {
          SnsMsgUI.a(SnsMsgUI.this).a(paramAnonymousView, -1, null);
          GMTrace.o(8339081658368L, 62131);
          return;
        }
        if ((paramAnonymousView.getTag() instanceof com.tencent.mm.plugin.sns.storage.i))
        {
          SnsMsgUI.a(SnsMsgUI.this, (com.tencent.mm.plugin.sns.storage.i)paramAnonymousView.getTag());
          GMTrace.o(8339081658368L, 62131);
          return;
        }
        w.w("MicroMsg.SnsMsgUI", "v.getTag():" + paramAnonymousView.getTag());
        GMTrace.o(8339081658368L, 62131);
      }
    };
    this.kgb = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(17137590599680L, 127685);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(17137590599680L, 127685);
          return;
          SnsMsgUI.a(SnsMsgUI.this, SnsMsgUI.this.quU);
          GMTrace.o(17137590599680L, 127685);
          return;
          SnsMsgUI.l(SnsMsgUI.this);
          GMTrace.o(17137590599680L, 127685);
          return;
          SnsMsgUI.a(SnsMsgUI.this, false);
        }
      }
    };
    this.qLj = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(17132356108288L, 127646);
        com.tencent.mm.plugin.sns.model.ae.aCa().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17140811825152L, 127709);
            synchronized (SnsMsgUI.d(SnsMsgUI.this))
            {
              w.v("MicroMsg.SnsMsgUI", "comment notify");
              SnsMsgUI.m(SnsMsgUI.this);
              SnsMsgUI.d(SnsMsgUI.this).a(null, null);
              GMTrace.o(17140811825152L, 127709);
              return;
            }
          }
        });
        GMTrace.o(17132356108288L, 127646);
      }
    };
    this.qLk = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17140543389696L, 127707);
        if (SnsMsgUI.d(SnsMsgUI.this) == null)
        {
          GMTrace.o(17140543389696L, 127707);
          return;
        }
        synchronized (SnsMsgUI.d(SnsMsgUI.this))
        {
          SnsMsgUI.d(SnsMsgUI.this).a(null, null);
          SnsMsgUI.r(SnsMsgUI.this);
          GMTrace.o(17140543389696L, 127707);
          return;
        }
      }
    };
    GMTrace.o(8442563526656L, 62902);
  }
  
  public final void Gm(String paramString)
  {
    GMTrace.i(8443771486208L, 62911);
    this.qLc.notifyDataSetChanged();
    GMTrace.o(8443771486208L, 62911);
  }
  
  protected final void MH()
  {
    GMTrace.i(8443368833024L, 62908);
    oC(i.j.pTk);
    a(0, getString(i.j.duQ), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8367535816704L, 62343);
        com.tencent.mm.ui.base.h.a(SnsMsgUI.this.vov.voR, SnsMsgUI.this.getString(i.j.pTe), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(8571949416448L, 63866);
            SnsMsgUI.b(SnsMsgUI.this).setVisibility(8);
            SnsMsgUI.c(SnsMsgUI.this).setVisibility(0);
            com.tencent.mm.plugin.sns.model.ae.bht().hhi.eL("SnsComment", "delete from SnsComment");
            SnsMsgUI.this.kS(false);
            GMTrace.o(8571949416448L, 63866);
          }
        }, null);
        GMTrace.o(8367535816704L, 62343);
        return true;
      }
    });
    this.qxP = new ao(this);
    this.ner = findViewById(i.f.pMx);
    this.nep = ((ListView)findViewById(i.f.pMz));
    this.jrT = v.fa(this).inflate(i.g.pPc, null);
    this.kyb = v.fa(this).inflate(i.g.dan, null);
    w.d("MicroMsg.SnsMsgUI", "autoLoad " + this.kyc);
    if (this.kyc)
    {
      this.nep.addFooterView(this.kyb);
      this.qLc = new a(this, new com.tencent.mm.plugin.sns.storage.i());
      this.qLc.a(new MMSlideDelView.c()
      {
        public final int ce(View paramAnonymousView)
        {
          GMTrace.i(8624160112640L, 64255);
          int i = SnsMsgUI.b(SnsMsgUI.this).getPositionForView(paramAnonymousView);
          GMTrace.o(8624160112640L, 64255);
          return i;
        }
      });
      this.qLc.a(new MMSlideDelView.f()
      {
        public final void s(View paramAnonymousView, int paramAnonymousInt)
        {
          GMTrace.i(8365790986240L, 62330);
          SnsMsgUI.b(SnsMsgUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
          GMTrace.o(8365790986240L, 62330);
        }
      });
      this.qLc.b(new MMSlideDelView.e()
      {
        public final void aU(Object paramAnonymousObject)
        {
          GMTrace.i(8585236971520L, 63965);
          if (paramAnonymousObject == null)
          {
            w.e("MicroMsg.SnsMsgUI", "onItemDel object null");
            GMTrace.o(8585236971520L, 63965);
            return;
          }
          try
          {
            int i = bg.RF(paramAnonymousObject.toString());
            SnsMsgUI.a(SnsMsgUI.this, i);
            GMTrace.o(8585236971520L, 63965);
            return;
          }
          catch (Exception paramAnonymousObject)
          {
            w.e("MicroMsg.SnsMsgUI", "onItemDel object not int");
            w.printErrStackTrace("MicroMsg.SnsMsgUI", (Throwable)paramAnonymousObject, "", new Object[0]);
            GMTrace.o(8585236971520L, 63965);
          }
        }
      });
      this.qLc.voo = new o.a()
      {
        public final void Qx()
        {
          GMTrace.i(8750593212416L, 65197);
          w.v("MicroMsg.SnsMsgUI", "total count:" + SnsMsgUI.d(SnsMsgUI.this).hIP + " unread:" + com.tencent.mm.plugin.sns.model.ae.bht().Mw() + "  showcount:" + SnsMsgUI.d(SnsMsgUI.this).kye);
          if (SnsMsgUI.d(SnsMsgUI.this).getCount() == 0)
          {
            SnsMsgUI.b(SnsMsgUI.this).setVisibility(8);
            SnsMsgUI.c(SnsMsgUI.this).setVisibility(0);
            SnsMsgUI.this.kS(false);
          }
          for (;;)
          {
            if (((SnsMsgUI.d(SnsMsgUI.this).alk()) && (com.tencent.mm.plugin.sns.model.ae.bht().Mw() == 0)) || (com.tencent.mm.plugin.sns.model.ae.bht().Mw() == com.tencent.mm.plugin.sns.model.ae.bht().bjS())) {
              SnsMsgUI.e(SnsMsgUI.this).setVisibility(8);
            }
            GMTrace.o(8750593212416L, 65197);
            return;
            SnsMsgUI.b(SnsMsgUI.this).setVisibility(0);
            SnsMsgUI.c(SnsMsgUI.this).setVisibility(8);
            SnsMsgUI.this.kS(true);
          }
        }
        
        public final void Qy()
        {
          GMTrace.i(8750458994688L, 65196);
          GMTrace.o(8750458994688L, 65196);
        }
      };
      this.nep.setAdapter(this.qLc);
      this.nep.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8428873318400L, 62800);
          if (paramAnonymousInt == SnsMsgUI.d(SnsMsgUI.this).getCount())
          {
            paramAnonymousInt = 1;
            if (com.tencent.mm.plugin.sns.model.ae.bht().Mw() > 0) {
              com.tencent.mm.plugin.sns.model.ae.bht().ajx();
            }
            for (;;)
            {
              SnsMsgUI.d(SnsMsgUI.this).a(null, null);
              if (!SnsMsgUI.f(SnsMsgUI.this))
              {
                if (SnsMsgUI.e(SnsMsgUI.this).getParent() != null)
                {
                  w.d("MicroMsg.SnsMsgUI", "remove footer");
                  SnsMsgUI.b(SnsMsgUI.this).removeFooterView(SnsMsgUI.e(SnsMsgUI.this));
                }
                if ((SnsMsgUI.g(SnsMsgUI.this).getParent() == null) && (paramAnonymousInt > 0))
                {
                  SnsMsgUI.b(SnsMsgUI.this).addFooterView(SnsMsgUI.g(SnsMsgUI.this));
                  w.i("MicroMsg.SnsMsgUI", "add mLoadingFooterView");
                }
              }
              SnsMsgUI.h(SnsMsgUI.this);
              SnsMsgUI.e(SnsMsgUI.this).setVisibility(8);
              GMTrace.o(8428873318400L, 62800);
              return;
              paramAnonymousInt = SnsMsgUI.d(SnsMsgUI.this).all();
            }
          }
          paramAnonymousAdapterView = (com.tencent.mm.plugin.sns.storage.i)SnsMsgUI.d(SnsMsgUI.this).getItem(paramAnonymousInt);
          SnsMsgUI.a(SnsMsgUI.this, paramAnonymousAdapterView);
          GMTrace.o(8428873318400L, 62800);
        }
      });
      new com.tencent.mm.ui.tools.l(this);
      this.nep.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(17141348696064L, 127713);
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            GMTrace.o(17141348696064L, 127713);
            return false;
            SnsMsgUI.this.aKl();
            SnsMsgUI.i(SnsMsgUI.this)[0] = ((int)paramAnonymousMotionEvent.getRawX());
            SnsMsgUI.i(SnsMsgUI.this)[1] = ((int)paramAnonymousMotionEvent.getRawY());
          }
        }
      });
      this.nep.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(17146583187456L, 127752);
          if (paramAnonymousInt < SnsMsgUI.b(SnsMsgUI.this).getHeaderViewsCount())
          {
            w.w("MicroMsg.SnsMsgUI", "on header view long click, ignore");
            GMTrace.o(17146583187456L, 127752);
            return true;
          }
          new com.tencent.mm.ui.widget.g(SnsMsgUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, SnsMsgUI.this, SnsMsgUI.j(SnsMsgUI.this), SnsMsgUI.i(SnsMsgUI.this)[0], SnsMsgUI.i(SnsMsgUI.this)[1]);
          GMTrace.o(17146583187456L, 127752);
          return true;
        }
      });
      this.nep.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(17140006518784L, 127703);
          GMTrace.o(17140006518784L, 127703);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(17139872301056L, 127702);
          if (!SnsMsgUI.f(SnsMsgUI.this))
          {
            GMTrace.o(17139872301056L, 127702);
            return;
          }
          if (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1)
          {
            if (com.tencent.mm.plugin.sns.model.ae.bht().Mw() > 0) {
              com.tencent.mm.plugin.sns.model.ae.bht().ajx();
            }
            for (;;)
            {
              SnsMsgUI.d(SnsMsgUI.this).a(null, null);
              GMTrace.o(17139872301056L, 127702);
              return;
              SnsMsgUI.d(SnsMsgUI.this).all();
            }
          }
          GMTrace.o(17139872301056L, 127702);
        }
      });
      if (this.qLc.getCount() != 0) {
        break label476;
      }
      this.nep.setVisibility(8);
      this.ner.setVisibility(0);
      kS(false);
    }
    for (;;)
    {
      if (((this.qLc.alk()) && (com.tencent.mm.plugin.sns.model.ae.bht().Mw() == 0)) || (com.tencent.mm.plugin.sns.model.ae.bht().Mw() == com.tencent.mm.plugin.sns.model.ae.bht().bjS())) {
        this.jrT.setVisibility(8);
      }
      if ((this.qLc.alk()) && (this.kyc)) {
        this.nep.removeFooterView(this.kyb);
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17137456381952L, 127684);
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("sns_cmd_list", SnsMsgUI.k(SnsMsgUI.this));
          SnsMsgUI.this.setResult(-1, paramAnonymousMenuItem);
          SnsMsgUI.this.finish();
          GMTrace.o(17137456381952L, 127684);
          return true;
        }
      });
      if ((this.qLc.alk()) && (this.kyc)) {
        this.nep.removeFooterView(this.kyb);
      }
      GMTrace.o(8443368833024L, 62908);
      return;
      this.nep.addFooterView(this.jrT);
      break;
      label476:
      this.nep.setVisibility(0);
      this.ner.setVisibility(8);
      kS(true);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8444308357120L, 62915);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramk instanceof com.tencent.mm.plugin.sns.model.p)))
    {
      w.d("MicroMsg.SnsMsgUI", "onSceneEnd errtype errcode");
      if (this.qLd)
      {
        GMTrace.o(8444308357120L, 62915);
        return;
      }
      this.qLd = true;
      this.handler.postDelayed(this.qLk, 500L);
    }
    if (paramk.getType() == 218)
    {
      if (((com.tencent.mm.plugin.sns.model.q)paramk).type != 12)
      {
        GMTrace.o(8444308357120L, 62915);
        return;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label166;
      }
      this.qLc.a(null, null);
      Toast.makeText(this, getString(i.j.pRi), 0).show();
    }
    for (;;)
    {
      if (this.qLg != null)
      {
        this.qLg.dismiss();
        this.qLg = null;
      }
      GMTrace.o(8444308357120L, 62915);
      return;
      label166:
      Toast.makeText(this, getString(i.j.pRh), 0).show();
    }
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8443905703936L, 62912);
    GMTrace.o(8443905703936L, 62912);
  }
  
  public final void as(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8444442574848L, 62916);
    GMTrace.o(8444442574848L, 62916);
  }
  
  public final void bgh()
  {
    GMTrace.i(8444039921664L, 62913);
    GMTrace.o(8444039921664L, 62913);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8444174139392L, 62914);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsMsgUI", "dispatchKeyEvent");
      paramKeyEvent = new Intent();
      paramKeyEvent.putExtra("sns_cmd_list", this.qBC);
      setResult(-1, paramKeyEvent);
      finish();
      GMTrace.o(8444174139392L, 62914);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8444174139392L, 62914);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8443234615296L, 62907);
    int i = i.g.pPe;
    GMTrace.o(8443234615296L, 62907);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8443637268480L, 62910);
    w.i("MicroMsg.SnsMsgUI", "onAcvityResult requestCode:" + paramInt1);
    if (paramInt2 != -1)
    {
      GMTrace.o(8443637268480L, 62910);
      return;
    }
    if ((paramIntent != null) && (paramIntent.getBooleanExtra("result_finish", false)))
    {
      finish();
      GMTrace.o(8443637268480L, 62910);
      return;
    }
    if (paramIntent != null)
    {
      paramInt1 = paramIntent.getIntExtra("sns_gallery_op_id", 0);
      this.qBC.tP(paramInt1);
    }
    GMTrace.o(8443637268480L, 62910);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8442697744384L, 62903);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(210, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(683, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(218, this);
    this.hlx = com.tencent.mm.x.m.zF();
    this.qHw = com.tencent.mm.plugin.sns.model.ae.bhd();
    this.qLe = getIntent().getBooleanExtra("sns_msg_force_show_all", false);
    if (this.qLe) {
      this.kyc = true;
    }
    com.tencent.mm.plugin.sns.model.ae.bht().c(this.qLj);
    MH();
    GMTrace.o(8442697744384L, 62903);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(8443503050752L, 62909);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    com.tencent.mm.plugin.sns.storage.i locali = (com.tencent.mm.plugin.sns.storage.i)this.qLc.getItem(paramContextMenuInfo.position);
    if (locali == null)
    {
      GMTrace.o(8443503050752L, 62909);
      return;
    }
    this.quU = locali.quU;
    this.qih = locali.field_snsID;
    for (;;)
    {
      try
      {
        paramView = (bct)new bct().aC(locali.field_curActionBuf);
        if (paramView != null)
        {
          x localx = this.qHw.SL(paramView.upg);
          if (localx == null) {
            continue;
          }
          paramView = localx.vq();
          paramContextMenu.setHeaderTitle(bg.mY(paramView));
          if (locali.field_isSilence != 0) {
            continue;
          }
          paramContextMenu.add(paramContextMenuInfo.position, 1, 1, getString(i.j.pRf));
        }
      }
      catch (Exception paramView)
      {
        w.printErrStackTrace("MicroMsg.SnsMsgUI", paramView, "", new Object[0]);
        continue;
      }
      paramContextMenu.add(paramContextMenuInfo.position, 0, 0, getString(i.j.duY));
      GMTrace.o(8443503050752L, 62909);
      return;
      if (!bg.mZ(paramView.uuB))
      {
        paramView = paramView.uuB;
      }
      else
      {
        paramView = paramView.upg;
        continue;
        paramContextMenu.add(paramContextMenuInfo.position, 2, 1, getString(i.j.pRe));
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(8442831962112L, 62904);
    w.d("MicroMsg.SnsMsgUI", "msgui onDestroy");
    com.tencent.mm.plugin.sns.model.ae.bht().ajx();
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(210, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(683, this);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(218, this);
    com.tencent.mm.plugin.sns.model.ae.bht().j(this.qLj);
    this.qLc.aIb();
    com.tencent.mm.plugin.sns.model.ae.bhm().I(this);
    if (this.qLg != null)
    {
      this.qLg.dismiss();
      this.qLg = null;
    }
    super.onDestroy();
    GMTrace.o(8442831962112L, 62904);
  }
  
  public void onPause()
  {
    GMTrace.i(8443100397568L, 62906);
    com.tencent.mm.plugin.sns.model.ae.bhk().b(this);
    super.onPause();
    GMTrace.o(8443100397568L, 62906);
  }
  
  public void onResume()
  {
    GMTrace.i(8442966179840L, 62905);
    com.tencent.mm.plugin.sns.model.ae.bhk().a(this);
    super.onResume();
    GMTrace.o(8442966179840L, 62905);
  }
  
  final class a
    extends o<com.tencent.mm.plugin.sns.storage.i>
  {
    int hIP;
    protected MMSlideDelView.f kfL;
    protected MMSlideDelView.c kfM;
    protected MMSlideDelView.d kfO;
    int kye;
    private Set<MMSlideDelView> jdField_new;
    protected MMSlideDelView.e qLp;
    
    public a(Context paramContext, com.tencent.mm.plugin.sns.storage.i parami)
    {
      super(parami);
      GMTrace.i(8479204966400L, 63175);
      this.jdField_new = new HashSet();
      this.kfO = new MMSlideDelView.d()
      {
        public final void a(MMSlideDelView paramAnonymousMMSlideDelView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(8768444170240L, 65330);
          if (paramAnonymousBoolean)
          {
            new.add(paramAnonymousMMSlideDelView);
            GMTrace.o(8768444170240L, 65330);
            return;
          }
          new.remove(paramAnonymousMMSlideDelView);
          GMTrace.o(8768444170240L, 65330);
        }
        
        public final boolean aIl()
        {
          GMTrace.i(8768578387968L, 65331);
          if (new.size() > 0)
          {
            GMTrace.o(8768578387968L, 65331);
            return true;
          }
          GMTrace.o(8768578387968L, 65331);
          return false;
        }
        
        public final void aIm()
        {
          GMTrace.i(8768712605696L, 65332);
          Iterator localIterator = new.iterator();
          while (localIterator.hasNext())
          {
            MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
            if (localMMSlideDelView != null) {
              localMMSlideDelView.bXp();
            }
          }
          new.clear();
          GMTrace.o(8768712605696L, 65332);
        }
        
        public final void aIn()
        {
          GMTrace.i(8768846823424L, 65333);
          Iterator localIterator = new.iterator();
          while (localIterator.hasNext())
          {
            MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
            if (localMMSlideDelView != null) {
              localMMSlideDelView.bXo();
            }
          }
          new.clear();
          GMTrace.o(8768846823424L, 65333);
        }
      };
      this.kye = 10;
      this.hIP = this.kye;
      GMTrace.o(8479204966400L, 63175);
    }
    
    public final void QA()
    {
      GMTrace.i(8480144490496L, 63182);
      if ((com.tencent.mm.plugin.sns.model.ae.bht().Mw() > 0) && (!SnsMsgUI.n(SnsMsgUI.this))) {
        setCursor(com.tencent.mm.plugin.sns.model.ae.bht().bjR());
      }
      for (;;)
      {
        notifyDataSetChanged();
        GMTrace.o(8480144490496L, 63182);
        return;
        this.hIP = com.tencent.mm.plugin.sns.model.ae.bht().bjS();
        j localj = com.tencent.mm.plugin.sns.model.ae.bht();
        int i = this.kye;
        String str = j.bjQ() + " where isSend = 0 order by createTime desc LIMIT " + i;
        w.v("MicroMsg.SnsCommentStorage", "getCursor sql:" + str);
        setCursor(localj.hhi.a(str, null, 0));
      }
    }
    
    protected final void QB()
    {
      GMTrace.i(8479473401856L, 63177);
      aIb();
      QA();
      GMTrace.o(8479473401856L, 63177);
    }
    
    public final void a(MMSlideDelView.c paramc)
    {
      GMTrace.i(8479876055040L, 63180);
      this.kfM = paramc;
      GMTrace.o(8479876055040L, 63180);
    }
    
    public final void a(MMSlideDelView.f paramf)
    {
      GMTrace.i(8479607619584L, 63178);
      this.kfL = paramf;
      GMTrace.o(8479607619584L, 63178);
    }
    
    public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
    {
      try
      {
        GMTrace.i(8480010272768L, 63181);
        super.a(paramString, paraml);
        GMTrace.o(8480010272768L, 63181);
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
    
    public final boolean alk()
    {
      GMTrace.i(8480278708224L, 63183);
      if (this.kye >= this.hIP)
      {
        GMTrace.o(8480278708224L, 63183);
        return true;
      }
      GMTrace.o(8480278708224L, 63183);
      return false;
    }
    
    public final int all()
    {
      GMTrace.i(8480412925952L, 63184);
      if (alk())
      {
        if (SnsMsgUI.g(SnsMsgUI.this).getParent() != null) {
          SnsMsgUI.b(SnsMsgUI.this).removeFooterView(SnsMsgUI.g(SnsMsgUI.this));
        }
        GMTrace.o(8480412925952L, 63184);
        return 0;
      }
      this.kye += 10;
      if (this.kye <= this.hIP)
      {
        GMTrace.o(8480412925952L, 63184);
        return 10;
      }
      this.kye = this.hIP;
      int i = this.hIP;
      GMTrace.o(8480412925952L, 63184);
      return i % 10;
    }
    
    public final void b(MMSlideDelView.e parame)
    {
      GMTrace.i(8479741837312L, 63179);
      this.qLp = parame;
      GMTrace.o(8479741837312L, 63179);
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8479339184128L, 63176);
      long l = ((com.tencent.mm.plugin.sns.storage.i)getItem(paramInt)).field_snsID;
      GMTrace.o(8479339184128L, 63176);
      return l;
    }
    
    public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8480547143680L, 63185);
      com.tencent.mm.plugin.sns.storage.i locali = (com.tencent.mm.plugin.sns.storage.i)getItem(paramInt);
      Object localObject1;
      a locala;
      if ((paramView == null) || (!(paramView.getTag() instanceof a)))
      {
        localObject1 = (MMSlideDelView)v.fa(this.context).inflate(i.g.cNf, null);
        paramView = v.fa(this.context).inflate(i.g.pPd, null);
        locala = new a();
        locala.qLr = ((ImageView)paramView.findViewById(i.f.pMv));
        locala.oAJ = ((TextView)paramView.findViewById(i.f.pMC));
        locala.qLu = ((TextView)paramView.findViewById(i.f.pMw));
        locala.qLt = ((ImageView)paramView.findViewById(i.f.pMA));
        locala.lvy = ((TextView)paramView.findViewById(i.f.pMD));
        locala.qLv = ((MMImageView)paramView.findViewById(i.f.pMy));
        locala.qLs = ((TextView)paramView.findViewById(i.f.pME));
        locala.qLv.setOnClickListener(SnsMsgUI.o(SnsMsgUI.this));
        locala.kfV = ((MMSlideDelView)localObject1).findViewById(i.f.cyo);
        locala.kfW = ((TextView)((MMSlideDelView)localObject1).findViewById(i.f.cyp));
        locala.qLw = ((ImageView)paramView.findViewById(i.f.pMX));
        ((MMSlideDelView)localObject1).setView(paramView);
        ((MMSlideDelView)localObject1).kfL = this.kfL;
        ((MMSlideDelView)localObject1).kfM = this.kfM;
        ((MMSlideDelView)localObject1).kfO = this.kfO;
        ((MMSlideDelView)localObject1).mai = false;
        ((View)localObject1).setTag(locala);
        locala.qLv.setTag(null);
        locala.pYd = locali.field_snsID;
        locala.kfV.setTag(Integer.valueOf(locali.quU));
        locala.kfV.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(8480949796864L, 63188);
            w.v("MicroMsg.SnsMsgUI", "on delView clicked");
            SnsMsgUI.a.this.kfO.aIn();
            if (SnsMsgUI.a.this.qLp != null) {
              SnsMsgUI.a.this.qLp.aU(paramAnonymousView.getTag());
            }
            GMTrace.o(8480949796864L, 63188);
          }
        });
      }
      for (;;)
      {
        Object localObject2;
        label400:
        label447:
        Object localObject3;
        int j;
        int i;
        try
        {
          localObject2 = (bct)new bct().aC(locali.field_curActionBuf);
        }
        catch (Exception paramView)
        {
          long l;
          label695:
          label735:
          label806:
          label943:
          label967:
          label982:
          w.printErrStackTrace("MicroMsg.SnsMsgUI", paramView, "", new Object[0]);
          continue;
          if (bg.mZ(((bct)localObject2).uuB)) {
            continue;
          }
          paramView = ((bct)localObject2).uuB;
          continue;
          paramView = ((bct)localObject2).upg;
          continue;
          locala.oAJ.setTextColor(SnsMsgUI.this.getResources().getColor(i.c.aQn));
          continue;
        }
        try
        {
          paramViewGroup = ((bct)new bct().aC(locali.field_refActionBuf)).upg;
        }
        catch (Exception paramView)
        {
          paramView = "";
        }
        try
        {
          if ((!bg.mZ(paramViewGroup)) && (!paramViewGroup.equals(com.tencent.mm.plugin.sns.model.ae.bgV()))) {
            continue;
          }
          paramViewGroup = "";
          if (bg.mZ(((bct)localObject2).upg)) {
            continue;
          }
          a.b.a(locala.qLr, ((bct)localObject2).upg);
          paramView = ((bct)localObject2).upg;
          locala.qLr.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(8705093402624L, 64858);
              paramAnonymousView = new Intent();
              paramAnonymousView.putExtra("Contact_User", paramView);
              com.tencent.mm.plugin.sns.c.a.ifM.d(paramAnonymousView, SnsMsgUI.this);
              GMTrace.o(8705093402624L, 64858);
            }
          });
          paramView = SnsMsgUI.p(SnsMsgUI.this).SL(((bct)localObject2).upg);
          if (paramView == null) {
            continue;
          }
          paramView = paramView.vq();
          locala.oAJ.setText(com.tencent.mm.pluginsdk.ui.d.h.b(SnsMsgUI.this, paramView, locala.oAJ.getTextSize()));
          paramView = com.tencent.mm.plugin.sns.model.ae.bhp().dP(locali.field_snsID);
          if ((paramView == null) || (paramView.field_type != 21)) {
            continue;
          }
          locala.oAJ.setTextColor(SnsMsgUI.this.getResources().getColor(i.c.kPn));
          paramView = ((bct)localObject2).upg;
          localObject3 = locala.oAJ;
          j = ((bct)localObject2).twh;
          switch (locali.field_type)
          {
          }
        }
        catch (Exception paramView)
        {
          for (;;)
          {
            label2406:
            label2421:
            label2501:
            label2738:
            label2799:
            label2804:
            label2810:
            paramView = paramViewGroup;
            continue;
            i = 1;
            break;
            break label806;
            i = 1;
            break;
            i = 0;
            break;
            i = 0;
            break;
            i = 0;
            break;
            switch (j)
            {
            }
            continue;
            i = 0;
            break label695;
            break label735;
            continue;
            paramInt = 8;
          }
        }
      }
      if ((i == 0) || (SnsMsgUI.q(SnsMsgUI.this).equals(paramView)))
      {
        ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        localObject3 = locala.qLu;
        l = locali.field_snsID;
        if ((locali.field_commentflag & 0x1) <= 0) {
          break label2927;
        }
        i = 1;
        if (i != 0)
        {
          ((TextView)localObject3).setText(i.j.pTf);
          ((TextView)localObject3).setBackgroundColor(SnsMsgUI.this.getResources().getColor(i.c.pGi));
          ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          locala.lvy.setText(az.k(SnsMsgUI.this, ((bct)localObject2).orU * 1000L));
          paramView = null;
          if ((((bct)localObject2).jXP != 7) && (((bct)localObject2).jXP != 8)) {
            break label2406;
          }
          paramViewGroup = com.tencent.mm.plugin.sns.model.ae.bhr().dI(locali.field_snsID);
          if (paramViewGroup == null) {
            break label2828;
          }
          paramView = paramViewGroup.bjN();
          break label2828;
          locala.qLv.setVisibility(8);
          locala.qLs.setVisibility(8);
          locala.qLw.setVisibility(8);
          locala.qLv.setImageBitmap(null);
          com.tencent.mm.plugin.sns.model.ae.bhm().cr(locala.qLv);
          if (paramView == null) {
            break label2738;
          }
          paramViewGroup = paramView.bjL().uyu.tKd;
          if (paramView.field_type != 2) {
            break label2421;
          }
          locala.qLv.setTag(null);
          locala.qLs.setVisibility(0);
          paramView = com.tencent.mm.pluginsdk.ui.d.h.b(SnsMsgUI.this, paramView.bjL().uyr, locala.qLs.getTextSize());
          locala.qLs.setText(paramView);
          if ((locala.qLv.getVisibility() != 0) && (locala.qLw.getVisibility() != 0)) {
            break label2799;
          }
          paramInt = 1;
          paramView = ((View)localObject1).findViewById(i.f.pMB);
          if (paramInt == 0) {
            break label2804;
          }
          paramInt = 0;
          paramView.setVisibility(paramInt);
          paramView = ((View)localObject1).findViewById(i.f.pMY);
          if (locali.field_isSilence != 1) {
            break label2810;
          }
        }
        for (paramInt = 0;; paramInt = 8)
        {
          paramView.setVisibility(paramInt);
          GMTrace.o(8480547143680L, 63185);
          return (View)localObject1;
          locala = (a)paramView.getTag();
          localObject1 = paramView;
          break;
          localObject3 = SnsMsgUI.p(SnsMsgUI.this).SL(paramViewGroup);
          paramView = paramViewGroup;
          if (localObject3 != null)
          {
            paramView = paramViewGroup;
            if (!bg.mZ(((com.tencent.mm.l.a)localObject3).vq())) {
              paramView = ((com.tencent.mm.l.a)localObject3).vq();
            }
          }
          paramViewGroup = paramView;
          break label400;
          paramViewGroup = paramView;
          break label400;
          w.e("MicroMsg.SnsMsgUI", "action.getFromUsername() is null or Nil");
          break label447;
          paramView = com.tencent.mm.bq.a.b(this.context, i.e.pHp);
          for (;;)
          {
            ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(null, null, paramView, null);
            break;
            paramView = com.tencent.mm.bq.a.b(this.context, i.e.pHq);
            continue;
            paramView = com.tencent.mm.bq.a.b(this.context, i.e.pHo);
            continue;
            paramView = com.tencent.mm.bq.a.b(this.context, i.e.pHm);
            continue;
            paramView = com.tencent.mm.bq.a.b(this.context, i.e.pHn);
          }
          ((TextView)localObject3).setTextColor(SnsMsgUI.this.getResources().getColor(i.c.black));
          ((TextView)localObject3).setBackgroundDrawable(null);
          ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          ((TextView)localObject3).setText("");
          ((TextView)localObject3).setCompoundDrawablePadding(0);
          Object localObject4;
          com.tencent.mm.plugin.sns.storage.e locale;
          switch (((bct)localObject2).jXP)
          {
          case 1: 
          case 5: 
            paramViewGroup = com.tencent.mm.plugin.sns.model.ae.bhp().dP(locali.field_snsID);
            if ((paramViewGroup != null) && (paramViewGroup.field_type == 7))
            {
              ((TextView)localObject3).setText(SnsMsgUI.this.getString(i.j.pSZ));
              break;
            }
            paramView = com.tencent.mm.bq.a.b(this.context, i.i.pQm);
            if ((paramViewGroup != null) && (paramViewGroup.field_type == 21)) {
              paramView.setColorFilter(SnsMsgUI.this.getResources().getColor(i.c.pGo), PorterDuff.Mode.SRC_ATOP);
            }
            for (;;)
            {
              paramView.setBounds(0, 0, paramView.getIntrinsicWidth(), paramView.getIntrinsicHeight());
              paramViewGroup = new SpannableString(" ");
              paramViewGroup.setSpan(new ImageSpan(paramView), 0, 1, 18);
              ((TextView)localObject3).setText(paramViewGroup);
              ((TextView)localObject3).setContentDescription(SnsMsgUI.this.vov.voR.getString(i.j.pSp));
              break;
              paramView.clearColorFilter();
            }
          case 2: 
          case 3: 
            localObject4 = ((bct)localObject2).ovi;
            paramView = "";
            locale = com.tencent.mm.plugin.sns.model.ae.bhr().dI(locali.field_snsID);
            if (((bct)localObject2).uuJ == 1) {
              if (locale != null)
              {
                com.tencent.mm.kernel.h.xA();
                paramView = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SJ(locale.field_userName);
                paramView = this.context.getString(i.j.pTi, new Object[] { paramView.vq() });
              }
            }
            for (;;)
            {
              paramView = paramView + (String)localObject4 + " ";
              ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(SnsMsgUI.this, paramView, ((TextView)localObject3).getTextSize()));
              break;
              if (!bg.mZ(paramViewGroup)) {
                paramView = this.context.getString(i.j.pTj, new Object[] { paramViewGroup });
              }
            }
          case 7: 
            ((TextView)localObject3).setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.bq.a.b(this.context, i.i.pQm), null, null, null);
            ((TextView)localObject3).setContentDescription(SnsMsgUI.this.vov.voR.getString(i.j.pSp));
            break;
          case 8: 
            paramView = "";
            localObject4 = ((bct)localObject2).ovi;
            locale = com.tencent.mm.plugin.sns.model.ae.bhr().dI(locali.field_snsID);
            if (((bct)localObject2).uuJ == 1) {
              if (locale != null)
              {
                com.tencent.mm.kernel.h.xA();
                paramView = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SJ(locale.field_userName);
                paramView = this.context.getString(i.j.pTi, new Object[] { paramView.vq() });
              }
            }
            for (;;)
            {
              paramView = paramView + (String)localObject4 + " ";
              ((TextView)localObject3).setText(com.tencent.mm.pluginsdk.ui.d.h.b(SnsMsgUI.this, paramView, ((TextView)localObject3).getTextSize()));
              break;
              if (!bg.mZ(paramViewGroup)) {
                paramView = this.context.getString(i.j.pTj, new Object[] { paramViewGroup });
              }
            }
          case 4: 
            ((TextView)localObject3).setText(SnsMsgUI.this.getString(i.j.pUc));
            break;
          case 14: 
            paramView = new agb();
            w.i("MicroMsg.SnsMsgUI", "curAction.HBBuffer " + ((bct)localObject2).uuI);
            try
            {
              paramView.aC(com.tencent.mm.platformtools.n.a(((bct)localObject2).uuI));
              w.i("MicroMsg.SnsMsgUI", "hbbuffer  " + paramView.fRn);
              paramViewGroup = SnsMsgUI.p(SnsMsgUI.this).SL(((bct)localObject2).upg);
              ((TextView)localObject3).setText(SnsMsgUI.this.getString(i.j.pRa, new Object[] { paramViewGroup.vq(), bg.r(paramView.fRn / 100.0D) }));
            }
            catch (Exception paramViewGroup)
            {
              for (;;)
              {
                w.e("MicroMsg.SnsMsgUI", "parser hbbuffer " + paramViewGroup.getMessage());
              }
            }
          case 13: 
            paramView = new agb();
            w.i("MicroMsg.SnsMsgUI", "curAction.HBBuffer " + ((bct)localObject2).uuI);
            try
            {
              paramView.aC(com.tencent.mm.platformtools.n.a(((bct)localObject2).uuI));
              w.i("MicroMsg.SnsMsgUI", "hbbuffer  " + paramView.fRn);
              SnsMsgUI.p(SnsMsgUI.this).SL(((bct)localObject2).upg);
              paramViewGroup = null;
              if (paramView.fRn == 0L)
              {
                SnsMsgUI.b(SnsMsgUI.this, true);
                paramView = new SpannableString(SnsMsgUI.this.getString(i.j.pRc));
                if (paramViewGroup != null)
                {
                  paramViewGroup.setBounds(0, 0, paramViewGroup.getIntrinsicWidth(), paramViewGroup.getIntrinsicHeight());
                  localObject4 = new d(paramViewGroup);
                  ((d)localObject4).wSA = ((int)((paramViewGroup.getIntrinsicHeight() - ((TextView)localObject3).getTextSize() + com.tencent.mm.bq.a.fromDPToPix(SnsMsgUI.this, 2)) / 2.0F));
                  paramView.setSpan(localObject4, 0, 1, 33);
                }
                ((TextView)localObject3).setText(paramView);
              }
            }
            catch (Exception paramViewGroup)
            {
              for (;;)
              {
                w.e("MicroMsg.SnsMsgUI", "parser hbbuffer " + paramViewGroup.getMessage());
                continue;
                SnsMsgUI.b(SnsMsgUI.this, false);
                paramView = new SpannableString(" " + SnsMsgUI.this.getString(i.j.pRb, new Object[] { bg.r(paramView.fRn / 100.0D) }));
                paramViewGroup = SnsMsgUI.this.getResources().getDrawable(i.e.pGG);
              }
            }
            paramView = com.tencent.mm.plugin.sns.model.ae.bhp().dP(locali.field_snsID);
            break label806;
            i = 0;
            if (paramViewGroup.size() > 0)
            {
              j = paramView.field_type;
              localObject2 = locala.qLv;
              i = -1;
            }
            switch (j)
            {
            case 4: 
              i = i.i.dlk;
              com.tencent.mm.plugin.sns.model.ae.bhm().b((amn)paramViewGroup.get(0), locala.qLv, i, SnsMsgUI.this.hashCode(), an.veZ);
              if (paramView.field_type == 15)
              {
                locala.qLw.setVisibility(0);
                paramView = new com.tencent.mm.plugin.sns.storage.i();
                com.tencent.mm.plugin.sns.model.ae.bht().b(locali.uQF, paramView);
                locala.qLv.setTag(paramView);
              }
            case 5: 
            case 3: 
            case 6: 
            case 1: 
            case 7: 
            case 2: 
            case 8: 
              for (i = 1;; i = 1)
              {
                paramView = locala.qLv;
                if (i == 0) {
                  break label2939;
                }
                paramInt = 0;
                paramView.setVisibility(paramInt);
                break;
                i = i.i.dkW;
                break label2501;
                i = i.i.dlh;
                break label2501;
                i = i.i.dlk;
                break label2501;
                i = i.i.dkV;
                break label2501;
                i = i.e.aVR;
                break label2501;
                i = i.e.aVR;
                break label2501;
                ((MMImageView)localObject2).setImageDrawable(null);
                break label2501;
                ((MMImageView)localObject2).setImageDrawable(null);
                break label2501;
                paramViewGroup = new ap();
                paramViewGroup.fAx = paramView.bkg();
                paramViewGroup.index = 0;
                paramView = new ArrayList();
                paramView.add(locala.qLv);
                paramViewGroup.qJz = paramView;
                paramViewGroup.position = paramInt;
                locala.qLv.setTag(paramViewGroup);
              }
              if ((((bct)localObject2).jXP == 7) || (((bct)localObject2).jXP == 8) || (!com.tencent.mm.plugin.sns.model.p.dt(locali.field_snsID))) {
                break label943;
              }
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(new com.tencent.mm.plugin.sns.model.p(locali.field_snsID), 0);
              break label943;
              paramInt = 0;
              break label967;
              paramInt = 8;
              break label982;
            }
          }
        }
      }
    }
    
    final class a
    {
      View kfV;
      TextView kfW;
      TextView lvy;
      TextView oAJ;
      long pYd;
      ImageView qLr;
      TextView qLs;
      ImageView qLt;
      TextView qLu;
      MMImageView qLv;
      ImageView qLw;
      
      a()
      {
        GMTrace.i(8545911177216L, 63672);
        GMTrace.o(8545911177216L, 63672);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */