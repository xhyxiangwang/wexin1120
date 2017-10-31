package com.tencent.mm.plugin.ipcall.ui;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.ipcall.a.g.h;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.v;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IPCallMsgUI
  extends MMActivity
{
  private View kyb;
  private boolean kyc;
  private ListView nep;
  private a neq;
  private View ner;
  private j.a nes;
  
  public IPCallMsgUI()
  {
    GMTrace.i(11669023490048L, 86941);
    this.kyc = true;
    this.nes = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(11646877564928L, 86776);
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11637348106240L, 86705);
            synchronized (IPCallMsgUI.b(IPCallMsgUI.this))
            {
              w.v("MicroMsg.IPCallMsgUI", "comment notify");
              IPCallMsgUI.b(IPCallMsgUI.this).a(null, null);
              GMTrace.o(11637348106240L, 86705);
              return;
            }
          }
        });
        GMTrace.o(11646877564928L, 86776);
      }
    };
    GMTrace.o(11669023490048L, 86941);
  }
  
  protected final void MH()
  {
    GMTrace.i(11669694578688L, 86946);
    oC(R.l.eiG);
    this.ner = findViewById(R.h.bRq);
    this.nep = ((ListView)findViewById(R.h.bRr));
    this.kyb = v.fa(this).inflate(R.i.dan, null);
    this.nep.addFooterView(this.kyb);
    this.neq = new a(this, new com.tencent.mm.plugin.ipcall.a.g.g());
    this.neq.a(new MMSlideDelView.c()
    {
      public final int ce(View paramAnonymousView)
      {
        GMTrace.i(11634395316224L, 86683);
        int i = IPCallMsgUI.a(IPCallMsgUI.this).getPositionForView(paramAnonymousView);
        GMTrace.o(11634395316224L, 86683);
        return i;
      }
    });
    this.neq.a(new MMSlideDelView.f()
    {
      public final void s(View paramAnonymousView, int paramAnonymousInt)
      {
        GMTrace.i(11671036755968L, 86956);
        IPCallMsgUI.a(IPCallMsgUI.this).performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
        GMTrace.o(11671036755968L, 86956);
      }
    });
    this.neq.voo = new o.a()
    {
      public final void Qx()
      {
        GMTrace.i(11687008665600L, 87075);
        if (IPCallMsgUI.b(IPCallMsgUI.this).getCount() == 0)
        {
          IPCallMsgUI.a(IPCallMsgUI.this).setVisibility(8);
          IPCallMsgUI.c(IPCallMsgUI.this).setVisibility(0);
          GMTrace.o(11687008665600L, 87075);
          return;
        }
        IPCallMsgUI.a(IPCallMsgUI.this).setVisibility(0);
        IPCallMsgUI.c(IPCallMsgUI.this).setVisibility(8);
        GMTrace.o(11687008665600L, 87075);
      }
      
      public final void Qy()
      {
        GMTrace.i(11686874447872L, 87074);
        GMTrace.o(11686874447872L, 87074);
      }
    };
    this.nep.setAdapter(this.neq);
    this.nep.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(11640703549440L, 86730);
        paramAnonymousAdapterView = (com.tencent.mm.plugin.ipcall.a.g.g)IPCallMsgUI.b(IPCallMsgUI.this).getItem(paramAnonymousInt);
        if (!bg.mZ(paramAnonymousAdapterView.field_descUrl))
        {
          paramAnonymousInt = paramAnonymousAdapterView.field_msgType;
          com.tencent.mm.plugin.report.service.g.paX.i(13780, new Object[] { Integer.valueOf(paramAnonymousInt) });
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("rawUrl", paramAnonymousAdapterView.field_descUrl);
          paramAnonymousView.putExtra("showShare", false);
          d.b(IPCallMsgUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
        }
        GMTrace.o(11640703549440L, 86730);
      }
    });
    this.nep.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11720160444416L, 87322);
        GMTrace.o(11720160444416L, 87322);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(11720026226688L, 87321);
        if (paramAnonymousAbsListView.getLastVisiblePosition() == paramAnonymousAbsListView.getCount() - 1)
        {
          paramAnonymousAbsListView = IPCallMsgUI.b(IPCallMsgUI.this);
          if (paramAnonymousAbsListView.alk()) {
            if (IPCallMsgUI.d(paramAnonymousAbsListView.neu).getParent() != null) {
              IPCallMsgUI.a(paramAnonymousAbsListView.neu).removeFooterView(IPCallMsgUI.d(paramAnonymousAbsListView.neu));
            }
          }
          for (;;)
          {
            IPCallMsgUI.b(IPCallMsgUI.this).a(null, null);
            GMTrace.o(11720026226688L, 87321);
            return;
            paramAnonymousAbsListView.kye += 10;
            if (paramAnonymousAbsListView.kye > paramAnonymousAbsListView.hIP) {
              paramAnonymousAbsListView.kye = paramAnonymousAbsListView.hIP;
            }
          }
        }
        GMTrace.o(11720026226688L, 87321);
      }
    });
    if (this.neq.getCount() == 0)
    {
      this.nep.setVisibility(8);
      this.ner.setVisibility(0);
      kS(false);
    }
    for (;;)
    {
      if (this.neq.alk()) {
        this.nep.removeFooterView(this.kyb);
      }
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(11700162002944L, 87173);
          IPCallMsgUI.this.finish();
          GMTrace.o(11700162002944L, 87173);
          return true;
        }
      });
      if (this.neq.alk()) {
        this.nep.removeFooterView(this.kyb);
      }
      GMTrace.o(11669694578688L, 86946);
      return;
      this.nep.setVisibility(0);
      this.ner.setVisibility(8);
      kS(true);
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(11669157707776L, 86942);
    GMTrace.o(11669157707776L, 86942);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11669291925504L, 86943);
    int i = R.i.cYb;
    GMTrace.o(11669291925504L, 86943);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11669426143232L, 86944);
    super.onCreate(paramBundle);
    i.aHu().c(this.nes);
    MH();
    GMTrace.o(11669426143232L, 86944);
  }
  
  public void onDestroy()
  {
    GMTrace.i(11669560360960L, 86945);
    w.d("MicroMsg.IPCallMsgUI", "msgui onDestroy");
    i.aHu().j(this.nes);
    this.neq.aIb();
    h localh = i.aHu();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("isRead", Short.valueOf((short)1));
    localh.gMB.update(localh.getTableName(), localContentValues, "isRead!=? ", new String[] { "1" });
    super.onDestroy();
    GMTrace.o(11669560360960L, 86945);
  }
  
  final class a
    extends o<com.tencent.mm.plugin.ipcall.a.g.g>
  {
    int hIP;
    protected MMSlideDelView.f kfL;
    protected MMSlideDelView.c kfM;
    protected MMSlideDelView.d kfO;
    int kye;
    private Set<MMSlideDelView> jdField_new;
    
    public a(Context paramContext, com.tencent.mm.plugin.ipcall.a.g.g paramg)
    {
      super(paramg);
      GMTrace.i(11728079290368L, 87381);
      this.jdField_new = new HashSet();
      this.kfO = new MMSlideDelView.d()
      {
        public final void a(MMSlideDelView paramAnonymousMMSlideDelView, boolean paramAnonymousBoolean)
        {
          GMTrace.i(11673318457344L, 86973);
          if (paramAnonymousBoolean)
          {
            new.add(paramAnonymousMMSlideDelView);
            GMTrace.o(11673318457344L, 86973);
            return;
          }
          new.remove(paramAnonymousMMSlideDelView);
          GMTrace.o(11673318457344L, 86973);
        }
        
        public final boolean aIl()
        {
          GMTrace.i(11673452675072L, 86974);
          if (new.size() > 0)
          {
            GMTrace.o(11673452675072L, 86974);
            return true;
          }
          GMTrace.o(11673452675072L, 86974);
          return false;
        }
        
        public final void aIm()
        {
          GMTrace.i(11673586892800L, 86975);
          Iterator localIterator = new.iterator();
          while (localIterator.hasNext())
          {
            MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
            if (localMMSlideDelView != null) {
              localMMSlideDelView.bXp();
            }
          }
          new.clear();
          GMTrace.o(11673586892800L, 86975);
        }
        
        public final void aIn()
        {
          GMTrace.i(11673721110528L, 86976);
          Iterator localIterator = new.iterator();
          while (localIterator.hasNext())
          {
            MMSlideDelView localMMSlideDelView = (MMSlideDelView)localIterator.next();
            if (localMMSlideDelView != null) {
              localMMSlideDelView.bXo();
            }
          }
          new.clear();
          GMTrace.o(11673721110528L, 86976);
        }
      };
      this.kye = 10;
      this.hIP = this.kye;
      GMTrace.o(11728079290368L, 87381);
    }
    
    public final void QA()
    {
      GMTrace.i(11728884596736L, 87387);
      this.hIP = i.aHu().getCount();
      h localh = i.aHu();
      int i = this.kye;
      setCursor(localh.gMB.query("IPCallMsg", h.naw, null, null, null, null, "pushTime desc limit " + i));
      notifyDataSetChanged();
      GMTrace.o(11728884596736L, 87387);
    }
    
    protected final void QB()
    {
      GMTrace.i(11728347725824L, 87383);
      aIb();
      QA();
      GMTrace.o(11728347725824L, 87383);
    }
    
    public final void a(MMSlideDelView.c paramc)
    {
      GMTrace.i(11728616161280L, 87385);
      this.kfM = paramc;
      GMTrace.o(11728616161280L, 87385);
    }
    
    public final void a(MMSlideDelView.f paramf)
    {
      GMTrace.i(11728481943552L, 87384);
      this.kfL = paramf;
      GMTrace.o(11728481943552L, 87384);
    }
    
    public final void a(String paramString, l paraml)
    {
      try
      {
        GMTrace.i(11728750379008L, 87386);
        super.a(paramString, paraml);
        GMTrace.o(11728750379008L, 87386);
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
      GMTrace.i(11729018814464L, 87388);
      if (this.kye >= this.hIP)
      {
        GMTrace.o(11729018814464L, 87388);
        return true;
      }
      GMTrace.o(11729018814464L, 87388);
      return false;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11728213508096L, 87382);
      long l = ((com.tencent.mm.plugin.ipcall.a.g.g)getItem(paramInt)).uQF;
      GMTrace.o(11728213508096L, 87382);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11729153032192L, 87389);
      com.tencent.mm.plugin.ipcall.a.g.g localg = (com.tencent.mm.plugin.ipcall.a.g.g)getItem(paramInt);
      View localView;
      long l1;
      Object localObject1;
      Object localObject2;
      if ((paramView == null) || (!(paramView.getTag() instanceof a)))
      {
        localView = v.fa(this.context).inflate(R.i.cYa, null);
        paramViewGroup = new a();
        paramViewGroup.iin = ((TextView)localView.findViewById(R.h.cBx));
        paramViewGroup.inT = ((TextView)localView.findViewById(R.h.byY));
        paramViewGroup.lvy = ((TextView)localView.findViewById(R.h.cAP));
        localView.setTag(paramViewGroup);
        paramViewGroup.iin.setText(localg.field_title);
        paramViewGroup.inT.setText(localg.field_content);
        TextView localTextView = paramViewGroup.lvy;
        paramView = IPCallMsgUI.this.vov.voR;
        l1 = localg.field_pushTime * 1000L;
        localObject1 = new GregorianCalendar();
        localObject2 = new GregorianCalendar(((GregorianCalendar)localObject1).get(1), ((GregorianCalendar)localObject1).get(2), ((GregorianCalendar)localObject1).get(5));
        localObject1 = (String)DateFormat.format(paramView.getString(R.l.dZP), l1);
        if (((String)localObject1).indexOf("-") <= 0) {
          break label390;
        }
        localObject2 = localObject1.split("-")[0];
        localObject1 = localObject1.split("-")[1];
        localObject2 = c.am(paramView, (String)localObject2);
        localObject1 = (String)localObject1 + " " + (String)localObject2 + " ";
        paramView = (String)localObject1 + " " + (String)c.g(paramView, l1);
        label324:
        localTextView.setText(paramView);
        if (localg.field_isRead != 1) {
          break label551;
        }
        paramInt = 1;
        label341:
        if (paramInt == 0) {
          break label556;
        }
        paramViewGroup.iin.setTextColor(IPCallMsgUI.this.getResources().getColor(R.e.aOK));
      }
      for (;;)
      {
        GMTrace.o(11729153032192L, 87389);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
        break;
        label390:
        long l2 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis();
        if ((l2 > 0L) && (l2 <= 86400000L))
        {
          paramView = (String)c.g(paramView, l1);
          break label324;
        }
        l2 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis() + 86400000L;
        if ((l2 > 0L) && (l2 <= 86400000L))
        {
          paramView = paramView.getString(R.l.eah) + " " + (String)c.g(paramView, l1);
          break label324;
        }
        paramView = (String)localObject1 + " " + (String)c.g(paramView, l1);
        break label324;
        label551:
        paramInt = 0;
        break label341;
        label556:
        paramViewGroup.iin.setTextColor(IPCallMsgUI.this.getResources().getColor(R.e.aOL));
      }
    }
    
    final class a
    {
      TextView iin;
      TextView inT;
      TextView lvy;
      
      a()
      {
        GMTrace.i(11635334840320L, 86690);
        GMTrace.o(11635334840320L, 86690);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */