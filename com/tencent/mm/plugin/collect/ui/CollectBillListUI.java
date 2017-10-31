package com.tencent.mm.plugin.collect.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.collect.b.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMSpinnerDatePicker;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CollectBillListUI
  extends WalletBaseUI
{
  private int aCW;
  private Dialog imq;
  private int kKQ;
  private ListView kMW;
  private b kMX;
  private LinearLayout kMY;
  private CollectPullDownView kMZ;
  private TextView kNa;
  private Dialog kNb;
  private boolean kNc;
  private boolean kNd;
  private boolean kNe;
  private boolean kNf;
  private boolean kNg;
  private boolean kNh;
  private boolean kNi;
  private boolean kNj;
  private boolean kNk;
  private long kNl;
  private long kNm;
  private Calendar kNn;
  private List<h> kNo;
  private View kyb;
  private int retryCount;
  private int type;
  
  public CollectBillListUI()
  {
    GMTrace.i(5429509750784L, 40453);
    this.kNc = false;
    this.kNd = false;
    this.kNe = false;
    this.kNf = false;
    this.kNg = false;
    this.kNh = false;
    this.kNi = true;
    this.kNj = false;
    this.kNk = false;
    this.type = 0;
    this.aCW = 20;
    this.kKQ = 0;
    this.retryCount = 0;
    this.kNl = 0L;
    this.kNm = 0L;
    this.kNo = new ArrayList();
    GMTrace.o(5429509750784L, 40453);
  }
  
  private void a(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    GMTrace.i(5430851928064L, 40463);
    w.i("MicroMsg.CollectBillListUI", "get retry page, type: %d, timestamp: %s, tryNum: %d, directFlag: %d, chooseFlag: %d", new Object[] { Integer.valueOf(this.type), Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    b(new com.tencent.mm.plugin.collect.b.p(this.type, paramLong, paramInt2, this.aCW, paramInt3, paramInt1), false);
    this.retryCount += 1;
    GMTrace.o(5430851928064L, 40463);
  }
  
  private void aob()
  {
    GMTrace.i(5430180839424L, 40458);
    this.kMZ.scrollTo(0, this.kMZ.vHI);
    GMTrace.o(5430180839424L, 40458);
  }
  
  private void aoc()
  {
    GMTrace.i(5430315057152L, 40459);
    this.kMW.setVisibility(8);
    this.kMY.setVisibility(0);
    this.kNa.setVisibility(0);
    GMTrace.o(5430315057152L, 40459);
  }
  
  private void aod()
  {
    GMTrace.i(5430717710336L, 40462);
    int i = this.kMX.getCount();
    if (i > 0)
    {
      long l = this.kMX.mc(i - 1).kKr;
      if (l < this.kNm)
      {
        w.i("MicroMsg.CollectBillListUI", "server lastTimestamp is error! %s, %s", new Object[] { Long.valueOf(l), Long.valueOf(this.kNm) });
        this.kNm = l;
      }
    }
    w.i("MicroMsg.CollectBillListUI", "get next page, type: %d, timestamp: %s", new Object[] { Integer.valueOf(this.type), Long.valueOf(this.kNm) });
    b(new com.tencent.mm.plugin.collect.b.p(this.type, this.kNm, this.aCW, 0), false);
    this.kNe = true;
    GMTrace.o(5430717710336L, 40462);
  }
  
  private void dJ(boolean paramBoolean)
  {
    GMTrace.i(5430583492608L, 40461);
    CollectPullDownView localCollectPullDownView = this.kMZ;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localCollectPullDownView.ls(paramBoolean);
      GMTrace.o(5430583492608L, 40461);
      return;
    }
  }
  
  private void uL(String paramString)
  {
    GMTrace.i(5430449274880L, 40460);
    if (this.kMX.getCount() == 0)
    {
      w.i("MicroMsg.CollectBillListUI", "show empty view");
      if (!bg.mZ(paramString)) {
        this.kNa.setText(paramString);
      }
      for (;;)
      {
        aoc();
        GMTrace.o(5430449274880L, 40460);
        return;
        if (this.kNh)
        {
          this.kNa.setText(getString(R.l.dKQ));
        }
        else
        {
          paramString = getString(R.l.dKQ) + getString(R.l.dKR);
          this.kNa.setText(paramString);
        }
      }
    }
    if (!bg.mZ(paramString)) {
      Toast.makeText(this.vov.voR, paramString, 1).show();
    }
    GMTrace.o(5430449274880L, 40460);
  }
  
  protected final void MH()
  {
    GMTrace.i(5429778186240L, 40455);
    this.kMW = ((ListView)findViewById(R.h.bwa));
    this.kMY = ((LinearLayout)findViewById(R.h.bvY));
    this.kNa = ((TextView)findViewById(R.h.bvZ));
    this.kyb = v.fa(this).inflate(R.i.cQK, this.kMW, false);
    View localView = new View(this);
    localView.setLayoutParams(new AbsListView.LayoutParams(-1, a.fromDPToPix(this, 5)));
    this.kMW.addHeaderView(localView, null, true);
    new View(this).setLayoutParams(new AbsListView.LayoutParams(-1, a.fromDPToPix(this, 10)));
    this.kMW.addFooterView(localView, null, true);
    this.kMW.setOverScrollMode(2);
    this.kMX = new b(this);
    this.kMW.setAdapter(this.kMX);
    this.kMW.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5416222195712L, 40354);
        w.d("MicroMsg.CollectBillListUI", "click item: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if ((paramAnonymousInt < 0) || (paramAnonymousInt >= paramAnonymousAdapterView.getAdapter().getCount()))
        {
          GMTrace.o(5416222195712L, 40354);
          return;
        }
        paramAnonymousView = new Intent(CollectBillListUI.this.vov.voR, CollectBillUI.class);
        paramAnonymousAdapterView = (h)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          w.w("MicroMsg.CollectBillListUI", "invaild record: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          GMTrace.o(5416222195712L, 40354);
          return;
        }
        paramAnonymousView.putExtra("key_type", paramAnonymousAdapterView.type);
        paramAnonymousView.putExtra("key_timestamp", paramAnonymousAdapterView.kKr);
        paramAnonymousView.putExtra("key_from_scene", 2);
        CollectBillListUI.this.startActivity(paramAnonymousView);
        com.tencent.mm.plugin.report.service.g.paX.i(13944, new Object[] { Integer.valueOf(3) });
        GMTrace.o(5416222195712L, 40354);
      }
    });
    this.kMW.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5414477365248L, 40341);
        GMTrace.o(5414477365248L, 40341);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(5414343147520L, 40340);
        GMTrace.o(5414343147520L, 40340);
      }
    });
    this.kMZ = ((CollectPullDownView)findViewById(R.h.bwc));
    this.kMZ.lt(false);
    this.kMZ.lq(false);
    this.kMZ.ls(true);
    this.kMZ.lr(false);
    this.kMZ.vIb = true;
    this.kMZ.vHT = new MMPullDownView.d()
    {
      public final boolean aof()
      {
        GMTrace.i(5424409477120L, 40415);
        int i = CollectBillListUI.e(CollectBillListUI.this).getFirstVisiblePosition();
        if (i == 0)
        {
          View localView = CollectBillListUI.e(CollectBillListUI.this).getChildAt(i);
          if ((localView != null) && (localView.getX() == 0.0F))
          {
            GMTrace.o(5424409477120L, 40415);
            return true;
          }
        }
        GMTrace.o(5424409477120L, 40415);
        return false;
      }
    };
    this.kMZ.vHS = new MMPullDownView.c()
    {
      public final boolean aog()
      {
        GMTrace.i(5420919816192L, 40389);
        if (CollectBillListUI.f(CollectBillListUI.this).getVisibility() == 0)
        {
          w.d("MicroMsg.CollectBillListUI", "empty view");
          GMTrace.o(5420919816192L, 40389);
          return true;
        }
        View localView = CollectBillListUI.e(CollectBillListUI.this).getChildAt(CollectBillListUI.e(CollectBillListUI.this).getChildCount() - 1);
        if ((localView != null) && (localView.getBottom() <= CollectBillListUI.e(CollectBillListUI.this).getHeight()) && (CollectBillListUI.e(CollectBillListUI.this).getLastVisiblePosition() == CollectBillListUI.e(CollectBillListUI.this).getAdapter().getCount() - 1))
        {
          GMTrace.o(5420919816192L, 40389);
          return true;
        }
        GMTrace.o(5420919816192L, 40389);
        return false;
      }
    };
    this.kMZ.vHG = new MMPullDownView.g()
    {
      public final boolean aoh()
      {
        GMTrace.i(5412732534784L, 40328);
        w.d("MicroMsg.CollectBillListUI", "top load");
        GMTrace.o(5412732534784L, 40328);
        return true;
      }
    };
    this.kMZ.vHH = new MMPullDownView.e()
    {
      public final boolean aoe()
      {
        GMTrace.i(5413537841152L, 40334);
        w.d("MicroMsg.CollectBillListUI", "bottomLoad, isLoading: %s, isFinish: %s", new Object[] { Boolean.valueOf(CollectBillListUI.g(CollectBillListUI.this)), Boolean.valueOf(CollectBillListUI.h(CollectBillListUI.this)) });
        if ((!CollectBillListUI.g(CollectBillListUI.this)) && (!CollectBillListUI.h(CollectBillListUI.this)))
        {
          CollectBillListUI.i(CollectBillListUI.this);
          CollectBillListUI.j(CollectBillListUI.this);
          GMTrace.o(5413537841152L, 40334);
          return false;
        }
        GMTrace.o(5413537841152L, 40334);
        return true;
      }
    };
    GMTrace.o(5429778186240L, 40455);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5430046621696L, 40457);
    if ((paramk instanceof com.tencent.mm.plugin.collect.b.p))
    {
      paramk = (com.tencent.mm.plugin.collect.b.p)paramk;
      if (this.imq.isShowing()) {
        this.imq.dismiss();
      }
      this.kMZ.vHO = true;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramk.kKQ == 0)
        {
          if (this.kNg)
          {
            w.i("MicroMsg.CollectBillListUI", "is loading filter, skip!");
            GMTrace.o(5430046621696L, 40457);
            return true;
          }
          if (paramk.kKR == 1)
          {
            this.kNi = paramk.hie;
            if (!paramk.kKV.isEmpty())
            {
              paramString = this.kMX;
              List localList = paramk.kKV;
              paramString.kMS.addAll(0, localList);
              paramString.notifyDataSetChanged();
              this.kNl = ((h)paramk.kKV.get(0)).kKr;
              this.kNf = false;
              this.kNd = false;
            }
          }
          for (;;)
          {
            GMTrace.o(5430046621696L, 40457);
            return true;
            this.kNi = true;
            break;
            this.kNh = paramk.hie;
            this.kMW.setVisibility(0);
            this.kMY.setVisibility(8);
            if (paramk.kKP)
            {
              if (!paramk.kKV.isEmpty()) {
                this.kNo.addAll(paramk.kKV);
              }
              if ((paramk.kKS == 0) && (paramk.kKT > 0) && (paramk.kKV.isEmpty()))
              {
                w.i("MicroMsg.CollectBillListUI", "continue retry: %d", new Object[] { Integer.valueOf(this.retryCount) });
                a(paramk.kKT, paramk.kKr, paramk.kKR, paramk.kKQ);
                GMTrace.o(5430046621696L, 40457);
                return true;
              }
              this.retryCount = 0;
              if (this.kNo.size() > 0) {
                this.kMX.ak(this.kNo);
              }
              for (;;)
              {
                this.kNe = false;
                this.kNm = paramk.kKr;
                aob();
                dJ(this.kNh);
                break;
                w.i("MicroMsg.CollectBillListUI", "retry data is empty");
                uL(paramk.kKU);
              }
            }
            if (!paramk.kKV.isEmpty())
            {
              this.kMX.ak(paramk.kKV);
              this.kNm = ((h)paramk.kKV.get(paramk.kKV.size() - 1)).kKr;
              if (this.kNm > paramk.kKr)
              {
                w.d("MicroMsg.CollectBillListUI", "use from_timestamp");
                this.kNm = paramk.kKr;
              }
              for (;;)
              {
                this.kNe = false;
                aob();
                dJ(this.kNh);
                break;
                w.i("MicroMsg.CollectBillListUI", "last record timestamp is less than fromtimestamp, %s, %s", new Object[] { Long.valueOf(this.kNm), Long.valueOf(paramk.kKr) });
              }
            }
            if ((paramk.kKS == 0) && (paramk.kKT > 0))
            {
              w.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", new Object[] { Integer.valueOf(paramk.kKT), Long.valueOf(paramk.kKr) });
              a(paramk.kKT, paramk.kKr, paramk.kKR, paramk.kKQ);
              this.kNo.clear();
            }
            else
            {
              this.kNe = false;
              aob();
              w.i("MicroMsg.CollectBillListUI", "next loading is empty without retry");
              uL(paramk.kKU);
              dJ(this.kNh);
            }
          }
        }
        this.kNh = paramk.hie;
        if (paramk.kKP)
        {
          if (!paramk.kKV.isEmpty()) {
            this.kNo.addAll(paramk.kKV);
          }
          if ((paramk.kKS == 0) && (paramk.kKT > 0))
          {
            w.i("MicroMsg.CollectBillListUI", "continue retry: %d", new Object[] { Integer.valueOf(this.retryCount) });
            a(paramk.kKT, paramk.kKr, paramk.kKR, paramk.kKQ);
          }
          for (;;)
          {
            GMTrace.o(5430046621696L, 40457);
            return true;
            this.retryCount = 0;
            this.kNi = true;
            this.kNm = paramk.kKr;
            if (paramk.kKS == 0) {}
            for (this.kNh = false;; this.kNh = true)
            {
              if (this.kNo.size() <= 0) {
                break label876;
              }
              this.kMX.aj(this.kNo);
              break;
            }
            label876:
            w.i("MicroMsg.CollectBillListUI", "still empty data, show empty view");
            aoc();
            if (!bg.mZ(paramk.kKU))
            {
              this.kNa.setText(paramk.kKU);
              this.kNa.setVisibility(0);
            }
            paramString = this.kMX;
            paramString.kMS.clear();
            paramString.notifyDataSetChanged();
          }
        }
        if (!paramk.kKV.isEmpty())
        {
          this.kMX.aj(paramk.kKV);
          this.kNl = ((h)paramk.kKV.get(0)).kKr;
          this.kNm = ((h)paramk.kKV.get(paramk.kKV.size() - 1)).kKr;
        }
        for (;;)
        {
          this.kNg = false;
          this.kNi = false;
          break;
          if ((paramk.kKS == 0) && (paramk.kKT > 0))
          {
            w.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", new Object[] { Integer.valueOf(paramk.kKT), Long.valueOf(paramk.kKr) });
            a(paramk.kKT, paramk.kKr, paramk.kKR, paramk.kKQ);
            this.kNo.clear();
          }
          else
          {
            aoc();
          }
        }
      }
      w.i("MicroMsg.CollectBillListUI", "net error, errType: %s, errCode: %s, errMsg: %s, chooseFlag: %d, direcFlag: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramk.kKQ), Integer.valueOf(paramk.kKR) });
      if (paramk.kKQ == 0) {
        if (paramk.kKR == 0)
        {
          this.kNe = false;
          aob();
        }
      }
      for (;;)
      {
        if (this.kMX.isEmpty()) {
          aoc();
        }
        Toast.makeText(this, R.l.dKP, 1).show();
        GMTrace.o(5430046621696L, 40457);
        return true;
        this.kNf = false;
        continue;
        this.kNg = false;
      }
    }
    GMTrace.o(5430046621696L, 40457);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5429912403968L, 40456);
    int i = R.i.cQI;
    GMTrace.o(5429912403968L, 40456);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5429643968512L, 40454);
    super.onCreate(paramBundle);
    MH();
    oC(R.l.dKS);
    if (this.kNk) {
      a(0, R.k.dnn, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(5424677912576L, 40417);
          CollectBillListUI.a(CollectBillListUI.this);
          GMTrace.o(5424677912576L, 40417);
          return false;
        }
      });
    }
    this.imq = com.tencent.mm.wallet_core.ui.g.a(this, false, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(5417832808448L, 40366);
        GMTrace.o(5417832808448L, 40366);
      }
    });
    aod();
    com.tencent.mm.plugin.report.service.g.paX.i(13944, new Object[] { Integer.valueOf(4) });
    GMTrace.o(5429643968512L, 40454);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectBillListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */