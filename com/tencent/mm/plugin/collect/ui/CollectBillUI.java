package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.collect.b.j;
import com.tencent.mm.plugin.collect.b.o;
import com.tencent.mm.plugin.collect.b.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.ci;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectBillUI
  extends WalletBaseUI
{
  private int aCW;
  private int fromScene;
  private boolean hie;
  private String ihB;
  private l jeN;
  private long kKr;
  private ListView kMW;
  private boolean kNA;
  private boolean kNB;
  private long kNC;
  private com.tencent.mm.ac.e kND;
  private o.d kNE;
  private boolean kNe;
  private a kNs;
  private LinearLayout kNt;
  private CollectBillHeaderView kNu;
  private ImageView kNv;
  private MMSwitchBtn kNw;
  private ImageView kNx;
  private MMSwitchBtn kNy;
  private TextView kNz;
  private View kyb;
  private int type;
  
  public CollectBillUI()
  {
    GMTrace.i(5433133629440L, 40480);
    this.kNA = false;
    this.kNe = false;
    this.hie = false;
    this.kNB = true;
    this.aCW = 20;
    this.kND = new com.tencent.mm.ac.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, final k paramAnonymousk)
      {
        GMTrace.i(17414615990272L, 129749);
        if ((paramAnonymousk instanceof j))
        {
          paramAnonymousString = (j)paramAnonymousk;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousString = paramAnonymousString.kKv.tGa;
            if ((paramAnonymousString == null) || (paramAnonymousString.isEmpty()))
            {
              CollectBillUI.a(CollectBillUI.this).setVisibility(8);
              GMTrace.o(17414615990272L, 129749);
              return;
            }
            paramAnonymousString = paramAnonymousString.iterator();
            while (paramAnonymousString.hasNext())
            {
              paramAnonymousk = (ci)paramAnonymousString.next();
              if ((paramAnonymousk.type == 1) && (!bg.mZ(paramAnonymousk.fEM)))
              {
                w.i("MicroMsg.CollectBillUI", "show notice");
                CollectBillUI.a(CollectBillUI.this).setText(paramAnonymousk.fEM);
                CollectBillUI.a(CollectBillUI.this).setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymous2View)
                  {
                    GMTrace.i(17425487626240L, 129830);
                    if (!bg.mZ(paramAnonymousk.url)) {
                      com.tencent.mm.wallet_core.ui.e.m(CollectBillUI.this.vov.voR, paramAnonymousk.url, true);
                    }
                    GMTrace.o(17425487626240L, 129830);
                  }
                });
                CollectBillUI.a(CollectBillUI.this).setVisibility(0);
                GMTrace.o(17414615990272L, 129749);
                return;
              }
            }
            CollectBillUI.a(CollectBillUI.this).setVisibility(8);
            GMTrace.o(17414615990272L, 129749);
            return;
          }
          w.e("MicroMsg.CollectBillUI", "net error: %s", new Object[] { paramAnonymousString });
          CollectBillUI.a(CollectBillUI.this).setVisibility(8);
        }
        GMTrace.o(17414615990272L, 129749);
      }
    };
    this.kNE = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(17423340142592L, 129814);
        if (paramAnonymousMenuItem.getItemId() == 0)
        {
          paramAnonymousMenuItem = (AdapterView.AdapterContextMenuInfo)paramAnonymousMenuItem.getMenuInfo();
          paramAnonymousMenuItem = (com.tencent.mm.plugin.collect.b.a)CollectBillUI.b(CollectBillUI.this).getItemAtPosition(paramAnonymousMenuItem.position);
          if (paramAnonymousMenuItem != null) {
            CollectBillUI.a(CollectBillUI.this, paramAnonymousMenuItem.kJV, paramAnonymousMenuItem.timestamp);
          }
        }
        GMTrace.o(17423340142592L, 129814);
      }
    };
    GMTrace.o(5433133629440L, 40480);
  }
  
  private void aoc()
  {
    GMTrace.i(5434207371264L, 40488);
    this.kMW.setVisibility(8);
    this.kNt.setVisibility(0);
    findViewById(R.h.bvQ).setVisibility(0);
    GMTrace.o(5434207371264L, 40488);
  }
  
  private void aod()
  {
    GMTrace.i(5434073153536L, 40487);
    if (!this.hie)
    {
      r(new q(this.type, this.kKr, this.ihB, this.aCW));
      this.kNe = true;
    }
    GMTrace.o(5434073153536L, 40487);
  }
  
  private void c(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(5433938935808L, 40486);
    if (this.kNB)
    {
      CollectBillHeaderView localCollectBillHeaderView = this.kNu;
      int i = this.type;
      localCollectBillHeaderView.kMT.setText(com.tencent.mm.plugin.collect.b.e.a(localCollectBillHeaderView.getContext(), paramLong, i));
      localCollectBillHeaderView.kMU.setText(com.tencent.mm.plugin.collect.b.e.mb(paramInt2));
      localCollectBillHeaderView.kLX.setText(localCollectBillHeaderView.getContext().getString(R.l.dKV, new Object[] { Integer.valueOf(paramInt1) }));
      this.kNB = false;
    }
    GMTrace.o(5433938935808L, 40486);
  }
  
  protected final void MH()
  {
    GMTrace.i(5433402064896L, 40482);
    this.kMW = ((ListView)findViewById(R.h.bwd));
    this.kNt = ((LinearLayout)findViewById(R.h.bvP));
    this.kNz = ((TextView)findViewById(R.h.bvM));
    this.kyb = v.fa(this).inflate(R.i.cQL, this.kMW, false);
    this.kNu = new CollectBillHeaderView(this);
    this.kMW.addHeaderView(this.kNu, null, false);
    this.kNs = new a(this);
    this.kMW.setAdapter(this.kNs);
    this.kMW.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5432999411712L, 40479);
        if ((CollectBillUI.b(CollectBillUI.this).getLastVisiblePosition() == CollectBillUI.c(CollectBillUI.this).getCount()) && (CollectBillUI.c(CollectBillUI.this).getCount() > 0) && (!CollectBillUI.d(CollectBillUI.this)) && (!CollectBillUI.e(CollectBillUI.this)))
        {
          CollectBillUI.f(CollectBillUI.this);
          CollectBillUI.g(CollectBillUI.this);
        }
        GMTrace.o(5432999411712L, 40479);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5432865193984L, 40478);
        GMTrace.o(5432865193984L, 40478);
      }
    });
    this.jeN = new l(this);
    this.kMW.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5423604170752L, 40409);
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getAdapter().getCount()))
        {
          w.i("MicroMsg.CollectBillUI", "illegal position: %s, count: %s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(paramAnonymousAdapterView.getAdapter().getCount()) });
          GMTrace.o(5423604170752L, 40409);
          return;
        }
        paramAnonymousAdapterView = (com.tencent.mm.plugin.collect.b.a)CollectBillUI.b(CollectBillUI.this).getItemAtPosition(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          w.w("MicroMsg.CollectBillUI", "invalid position: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          GMTrace.o(5423604170752L, 40409);
          return;
        }
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("scene", 2);
        paramAnonymousView.putExtra("trans_id", paramAnonymousAdapterView.kJW);
        paramAnonymousView.putExtra("bill_id", paramAnonymousAdapterView.kJV);
        com.tencent.mm.bi.d.b(CollectBillUI.this.vov.voR, "order", ".ui.MallOrderTransactionInfoUI", paramAnonymousView);
        GMTrace.o(5423604170752L, 40409);
      }
    });
    this.kMW.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5414745800704L, 40343);
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getAdapter().getCount()))
        {
          w.i("MicroMsg.CollectBillUI", "illegal position: %s, count: %s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(paramAnonymousAdapterView.getAdapter().getCount()) });
          GMTrace.o(5414745800704L, 40343);
          return false;
        }
        CollectBillUI.i(CollectBillUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, CollectBillUI.this, CollectBillUI.h(CollectBillUI.this));
        GMTrace.o(5414745800704L, 40343);
        return true;
      }
    });
    if (this.fromScene != 2) {
      a(0, getString(R.l.dKS), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17415287078912L, 129754);
          paramAnonymousMenuItem = new Intent(CollectBillUI.this.vov.voR, CollectBillListUI.class);
          CollectBillUI.this.startActivity(paramAnonymousMenuItem);
          GMTrace.o(17415287078912L, 129754);
          return false;
        }
      });
    }
    Object localObject;
    if (this.fromScene == 2)
    {
      localObject = this.kNu.findViewById(R.h.bwM);
      View localView = this.kNt.findViewById(R.h.bwL);
      ((View)localObject).setVisibility(8);
      localView.setVisibility(8);
      GMTrace.o(5433402064896L, 40482);
      return;
    }
    this.kNv = ((ImageView)this.kNu.findViewById(R.h.bwJ));
    this.kNw = ((MMSwitchBtn)this.kNu.findViewById(R.h.bwK));
    this.kNx = ((ImageView)this.kNt.findViewById(R.h.bwJ));
    this.kNy = ((MMSwitchBtn)this.kNt.findViewById(R.h.bwK));
    com.tencent.mm.plugin.collect.a.a.anz();
    if (com.tencent.mm.plugin.collect.a.a.anB())
    {
      this.kNw.mx(true);
      this.kNy.mx(true);
      this.kNv.setImageResource(R.k.dnq);
      this.kNx.setImageResource(R.k.dnq);
    }
    for (;;)
    {
      localObject = new MMSwitchBtn.a()
      {
        public final void cc(boolean paramAnonymousBoolean)
        {
          GMTrace.i(17423608578048L, 129816);
          w.i("MicroMsg.CollectBillUI", "update switch: %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
          CollectBillUI.j(CollectBillUI.this).mx(paramAnonymousBoolean);
          CollectBillUI.k(CollectBillUI.this).mx(paramAnonymousBoolean);
          int i;
          if (paramAnonymousBoolean)
          {
            CollectBillUI.a(CollectBillUI.this, CollectBillUI.l(CollectBillUI.this) | 0x8000);
            CollectBillUI.m(CollectBillUI.this).setImageResource(R.k.dnq);
            CollectBillUI.n(CollectBillUI.this).setImageResource(R.k.dnq);
            Toast.makeText(CollectBillUI.this.vov.voR, R.l.dLk, 1).show();
            g.paX.i(13944, new Object[] { Integer.valueOf(11) });
            i = 1;
          }
          for (;;)
          {
            ap.AS();
            c.xi().set(147457, Long.valueOf(CollectBillUI.l(CollectBillUI.this)));
            anv localanv = new anv();
            localanv.pau = i;
            ap.AS();
            c.yK().b(new e.a(209, localanv));
            if (i != 1) {
              break;
            }
            com.tencent.mm.plugin.collect.a.a.anz().anC();
            GMTrace.o(17423608578048L, 129816);
            return;
            CollectBillUI.a(CollectBillUI.this, CollectBillUI.l(CollectBillUI.this) & 0xFFFFFFFFFFFF7FFF);
            i = 2;
            CollectBillUI.m(CollectBillUI.this).setImageResource(R.k.dnp);
            CollectBillUI.n(CollectBillUI.this).setImageResource(R.k.dnp);
            Toast.makeText(CollectBillUI.this.vov.voR, R.l.dLd, 1).show();
            g.paX.i(13944, new Object[] { Integer.valueOf(12) });
          }
          com.tencent.mm.plugin.collect.a.a.anz().anD();
          GMTrace.o(17423608578048L, 129816);
        }
      };
      this.kNw.wUC = ((MMSwitchBtn.a)localObject);
      this.kNy.wUC = ((MMSwitchBtn.a)localObject);
      GMTrace.o(5433402064896L, 40482);
      return;
      this.kNw.mx(false);
      this.kNy.mx(false);
      this.kNv.setImageResource(R.k.dnp);
      this.kNx.setImageResource(R.k.dnp);
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5433670500352L, 40484);
    Object localObject;
    if ((paramk instanceof q))
    {
      paramString = (q)paramk;
      if (this.kNA)
      {
        this.kMW.removeFooterView(this.kyb);
        this.kNA = false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.hie = paramString.hie;
        this.type = paramString.type;
        this.kKr = paramString.kKr;
        c(paramString.kKs, paramString.kKt, paramString.kKr);
        if (!paramString.kKV.isEmpty())
        {
          if (bg.mZ(this.ihB))
          {
            w.d("MicroMsg.CollectBillUI", "first query, hide block view");
            this.kMW.setVisibility(0);
            this.kNt.setVisibility(8);
          }
          paramk = this.kNs;
          localObject = paramString.kKV;
          paramk.kMS.addAll((Collection)localObject);
          paramk.notifyDataSetChanged();
          this.ihB = ((com.tencent.mm.plugin.collect.b.a)paramString.kKV.get(paramString.kKV.size() - 1)).kJV;
        }
        for (;;)
        {
          this.kNe = false;
          GMTrace.o(5433670500352L, 40484);
          return true;
          this.hie = true;
          if (bg.mZ(this.ihB))
          {
            w.i("MicroMsg.CollectBillUI", "no record, show empty view");
            aoc();
          }
        }
      }
      w.i("MicroMsg.CollectBillUI", "net error!");
      this.kNe = false;
      Toast.makeText(this, R.l.dKP, 1).show();
      if (bg.mZ(this.ihB)) {
        w.i("MicroMsg.CollectBillUI", "first query failed, finish activity!");
      }
      GMTrace.o(5433670500352L, 40484);
      return true;
    }
    if ((paramk instanceof o))
    {
      paramk = (o)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.kNs;
        localObject = paramk.kJV;
        Iterator localIterator = paramString.kMS.iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.collect.b.a locala = (com.tencent.mm.plugin.collect.b.a)localIterator.next();
          if (locala.kJV.equals(localObject))
          {
            paramString.kMS.remove(locala);
            paramString.notifyDataSetChanged();
          }
        }
        if (this.kNs.getCount() <= 0)
        {
          w.i("MicroMsg.CollectBillUI", "delete all records");
          aoc();
        }
        for (;;)
        {
          GMTrace.o(5433670500352L, 40484);
          return false;
          c(paramk.kKs, paramk.kKt, this.kKr);
        }
      }
      w.i("MicroMsg.CollectBillUI", "net error, errType: %s, errCode: %s, errMsg: %s, billId: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramk.kJV });
      Toast.makeText(this, R.l.dKO, 1).show();
      GMTrace.o(5433670500352L, 40484);
      return false;
    }
    GMTrace.o(5433670500352L, 40484);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5433804718080L, 40485);
    int i = R.i.cQE;
    GMTrace.o(5433804718080L, 40485);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5433267847168L, 40481);
    super.onCreate(paramBundle);
    this.kNC = m.zK();
    this.fromScene = getIntent().getIntExtra("key_from_scene", 0);
    this.type = getIntent().getIntExtra("key_type", 0);
    this.kKr = getIntent().getLongExtra("key_timestamp", System.currentTimeMillis() / 1000L);
    aod();
    MH();
    oC(R.l.dKU);
    ap.wT().a(1256, this.kND);
    paramBundle = new j();
    ap.wT().a(paramBundle, 0);
    GMTrace.o(5433267847168L, 40481);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(5433536282624L, 40483);
    paramContextMenu.add(0, 0, 0, R.l.dKT);
    GMTrace.o(5433536282624L, 40483);
  }
  
  public void onDestroy()
  {
    GMTrace.i(17415421296640L, 129755);
    super.onDestroy();
    ap.wT().b(1256, this.kND);
    GMTrace.o(17415421296640L, 129755);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectBillUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */