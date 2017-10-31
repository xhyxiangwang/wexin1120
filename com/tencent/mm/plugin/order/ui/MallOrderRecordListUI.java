package com.tencent.mm.plugin.order.ui;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.g.a.sb.b;
import com.tencent.mm.plugin.order.model.c;
import com.tencent.mm.plugin.order.model.d;
import com.tencent.mm.plugin.order.model.i;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MallOrderRecordListUI
  extends WalletBaseUI
{
  public MMLoadMoreListView kGN;
  public boolean kHf;
  public Dialog lZj;
  public int mCount;
  public ae mHandler;
  public boolean nAD;
  public a osZ;
  public List<i> ota;
  protected String otb;
  public boolean otc;
  protected Map<String, String> otd;
  public int vv;
  
  public MallOrderRecordListUI()
  {
    GMTrace.i(6657467744256L, 49602);
    this.mHandler = null;
    this.lZj = null;
    this.osZ = null;
    this.ota = new ArrayList();
    this.nAD = true;
    this.mCount = 0;
    this.vv = 0;
    this.otb = null;
    this.otc = false;
    this.kHf = false;
    this.otd = new HashMap();
    GMTrace.o(6657467744256L, 49602);
  }
  
  private boolean DL(String paramString)
  {
    GMTrace.i(6658809921536L, 49612);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(6658809921536L, 49612);
      return false;
    }
    int i = 0;
    while (i < this.ota.size())
    {
      i locali = (i)this.ota.get(i);
      if ((locali != null) && (paramString.equals(locali.orR)))
      {
        GMTrace.o(6658809921536L, 49612);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6658809921536L, 49612);
    return false;
  }
  
  private static String cI(int paramInt1, int paramInt2)
  {
    GMTrace.i(6659346792448L, 49616);
    String str = paramInt1 + "-" + paramInt2;
    GMTrace.o(6659346792448L, 49616);
    return str;
  }
  
  protected final void MH()
  {
    GMTrace.i(6658541486080L, 49610);
    if ((com.tencent.mm.wallet_core.a.aa(this) instanceof com.tencent.mm.plugin.order.a.a))
    {
      this.kHf = true;
      aVp();
    }
    oC(R.l.enB);
    this.kGN = ((MMLoadMoreListView)findViewById(R.h.bZW));
    this.osZ = new a();
    this.kGN.setAdapter(this.osZ);
    this.kGN.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6634784948224L, 49433);
        paramAnonymousAdapterView = MallOrderRecordListUI.this;
        if (paramAnonymousInt < paramAnonymousAdapterView.ota.size())
        {
          paramAnonymousView = (i)paramAnonymousAdapterView.ota.get(paramAnonymousInt);
          if (paramAnonymousView != null)
          {
            Bundle localBundle = paramAnonymousAdapterView.un;
            localBundle.putString("key_trans_id", paramAnonymousView.orR);
            localBundle.putInt("key_pay_type", paramAnonymousView.orZ);
            localBundle.putString("bill_id", paramAnonymousView.osk);
            com.tencent.mm.wallet_core.a.i(paramAnonymousAdapterView, localBundle);
          }
        }
        com.tencent.mm.wallet_core.ui.e.Eh(26);
        GMTrace.o(6634784948224L, 49433);
      }
    });
    this.kGN.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6652904341504L, 49568);
        if (paramAnonymousInt >= MallOrderRecordListUI.this.ota.size())
        {
          GMTrace.o(6652904341504L, 49568);
          return true;
        }
        h.a(MallOrderRecordListUI.this, MallOrderRecordListUI.this.getResources().getString(R.l.eWv), null, MallOrderRecordListUI.this.getResources().getString(R.l.duY), new h.c()
        {
          public final void hC(int paramAnonymous2Int)
          {
            GMTrace.i(6654649171968L, 49581);
            switch (paramAnonymous2Int)
            {
            }
            for (;;)
            {
              GMTrace.o(6654649171968L, 49581);
              return;
              i locali = (i)MallOrderRecordListUI.this.ota.get(paramAnonymousInt);
              if (locali != null)
              {
                String str = locali.orR;
                MallOrderRecordListUI.this.db(str, locali.osk);
              }
            }
          }
        });
        GMTrace.o(6652904341504L, 49568);
        return true;
      }
    });
    this.kGN.vHo = new MMLoadMoreListView.a()
    {
      public final void and()
      {
        GMTrace.i(6639482568704L, 49468);
        if (!MallOrderRecordListUI.this.kHf)
        {
          MallOrderRecordListUI.this.kHf = true;
          MallOrderRecordListUI localMallOrderRecordListUI = MallOrderRecordListUI.this;
          localMallOrderRecordListUI.vv += 10;
          MallOrderRecordListUI.this.aVp();
        }
        GMTrace.o(6639482568704L, 49468);
      }
    };
    final Object localObject = new sb();
    ((sb)localObject).fQc.fQe = "6";
    ((sb)localObject).fwM = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6635053383680L, 49435);
        if (!bg.mZ(localObject.fQd.fQf))
        {
          com.tencent.mm.wallet_core.ui.e.a((TextView)MallOrderRecordListUI.this.findViewById(R.h.ble), localObject.fQd.fQf, localObject.fQd.content, localObject.fQd.url);
          GMTrace.o(6635053383680L, 49435);
          return;
        }
        w.i("MicroMsg.WalletOrderListUI", "no bulletin data");
        GMTrace.o(6635053383680L, 49435);
      }
    };
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    com.tencent.mm.plugin.order.a.b.aVa().ahA();
    this.osZ.notifyDataSetChanged();
    localObject = com.tencent.mm.plugin.report.service.g.paX;
    com.tencent.mm.plugin.order.a.b.aVa();
    ((com.tencent.mm.plugin.report.service.g)localObject).i(11036, new Object[] { Integer.valueOf(com.tencent.mm.plugin.order.a.b.aVd().aVh()) });
    GMTrace.o(6658541486080L, 49610);
  }
  
  public void aVn()
  {
    GMTrace.i(6657870397440L, 49605);
    hz(388);
    hz(389);
    GMTrace.o(6657870397440L, 49605);
  }
  
  public void aVo()
  {
    GMTrace.i(6658004615168L, 49606);
    hA(388);
    hA(389);
    GMTrace.o(6658004615168L, 49606);
  }
  
  public void aVp()
  {
    GMTrace.i(6658407268352L, 49609);
    l(new com.tencent.mm.plugin.order.model.e(this.vv, this.otb));
    GMTrace.o(6658407268352L, 49609);
  }
  
  public final void aW(List<i> paramList)
  {
    GMTrace.i(6658675703808L, 49611);
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(6658675703808L, 49611);
      return;
    }
    if (this.ota == null) {
      this.ota = new ArrayList();
    }
    int i = 0;
    while (i < paramList.size())
    {
      i locali = (i)paramList.get(i);
      if (!DL(locali.orR)) {
        this.ota.add(locali);
      }
      i += 1;
    }
    GMTrace.o(6658675703808L, 49611);
  }
  
  public final void aX(List<d> paramList)
  {
    GMTrace.i(6659212574720L, 49615);
    if (paramList == null)
    {
      GMTrace.o(6659212574720L, 49615);
      return;
    }
    int i = 0;
    while (i < paramList.size())
    {
      d locald = (d)paramList.get(i);
      if (locald != null)
      {
        String str = cI(locald.year, locald.month);
        this.otd.put(str, locald.orL);
      }
      i += 1;
    }
    GMTrace.o(6659212574720L, 49615);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6659481010176L, 49617);
    boolean bool;
    if ((paramk instanceof com.tencent.mm.plugin.order.model.e))
    {
      if (this.lZj != null)
      {
        this.lZj.dismiss();
        this.lZj = null;
      }
      paramString = (com.tencent.mm.plugin.order.model.e)paramk;
      this.otb = paramString.orO;
      aW(paramString.orM);
      aX(paramString.orN);
      this.mCount = this.ota.size();
      if (paramString.kKs > this.mCount)
      {
        bool = true;
        this.nAD = bool;
        this.osZ.notifyDataSetChanged();
        w.d("MicroMsg.WalletOrderListUI", "orders list count: " + this.mCount);
        w.d("MicroMsg.WalletOrderListUI", "orders list total record: " + paramString.kKs);
        w.d("MicroMsg.WalletOrderListUI", "orders list has more: " + this.nAD);
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6640287875072L, 49474);
            if (MallOrderRecordListUI.this.nAD)
            {
              w.v("MicroMsg.WalletOrderListUI", "has more");
              if (!MallOrderRecordListUI.this.otc)
              {
                MallOrderRecordListUI.this.kGN.bXd();
                MallOrderRecordListUI.this.kGN.setAdapter(MallOrderRecordListUI.this.osZ);
                MallOrderRecordListUI.this.otc = true;
              }
            }
            for (;;)
            {
              MallOrderRecordListUI.this.osZ.notifyDataSetChanged();
              GMTrace.o(6640287875072L, 49474);
              return;
              w.v("MicroMsg.WalletOrderListUI", "no more! dismiss footer view!");
              MallOrderRecordListUI.this.kGN.bXe();
            }
          }
        });
        this.kHf = false;
        label205:
        if ((this.mCount > 0) || (this.ota.size() != 0)) {
          break label458;
        }
        kT(false);
        findViewById(R.h.bEw).setVisibility(0);
      }
    }
    for (;;)
    {
      GMTrace.o(6659481010176L, 49617);
      return true;
      bool = false;
      break;
      if (!(paramk instanceof com.tencent.mm.plugin.order.model.g)) {
        break label205;
      }
      if (this.lZj != null)
      {
        this.lZj.dismiss();
        this.lZj = null;
      }
      paramString = (com.tencent.mm.plugin.order.model.g)paramk;
      label330:
      if (paramString.aVi() == 2)
      {
        if (this.ota != null) {
          this.ota.clear();
        }
        this.mCount = 0;
        this.nAD = false;
        this.kGN.bXe();
      }
      for (;;)
      {
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6654917607424L, 49583);
            MallOrderRecordListUI.this.osZ.notifyDataSetChanged();
            GMTrace.o(6654917607424L, 49583);
          }
        });
        break;
        paramString = paramString.aVj();
        w.d("MicroMsg.WalletOrderListUI", "delete transId:" + paramString);
        if (!bg.mZ(paramString))
        {
          paramk = this.ota.iterator();
          if (paramk.hasNext())
          {
            i locali = (i)paramk.next();
            if (!paramString.equals(locali.orR)) {
              break label330;
            }
            this.ota.remove(locali);
            this.mCount = this.ota.size();
          }
        }
      }
      label458:
      kT(true);
      findViewById(R.h.bEw).setVisibility(8);
    }
  }
  
  public void db(String paramString1, String paramString2)
  {
    GMTrace.i(6658273050624L, 49608);
    l(new com.tencent.mm.plugin.order.model.g(paramString1, paramString2, 1));
    GMTrace.o(6658273050624L, 49608);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6657601961984L, 49603);
    int i = R.i.cZO;
    GMTrace.o(6657601961984L, 49603);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6657736179712L, 49604);
    super.onCreate(paramBundle);
    this.mHandler = new ae();
    aVn();
    MH();
    this.vv = 0;
    this.otb = null;
    GMTrace.o(6657736179712L, 49604);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6658944139264L, 49613);
    aVo();
    super.onDestroy();
    GMTrace.o(6658944139264L, 49613);
  }
  
  public void onResume()
  {
    GMTrace.i(6658138832896L, 49607);
    super.onResume();
    if (this.osZ != null) {
      this.osZ.notifyDataSetChanged();
    }
    GMTrace.o(6658138832896L, 49607);
  }
  
  public String sd(int paramInt)
  {
    GMTrace.i(6659078356992L, 49614);
    String str = com.tencent.mm.wallet_core.ui.e.Eg(paramInt);
    GMTrace.o(6659078356992L, 49614);
    return str;
  }
  
  protected final class a
    extends BaseAdapter
  {
    protected a()
    {
      GMTrace.i(6649951551488L, 49546);
      GMTrace.o(6649951551488L, 49546);
    }
    
    private i se(int paramInt)
    {
      GMTrace.i(6650219986944L, 49548);
      i locali = (i)MallOrderRecordListUI.this.ota.get(paramInt);
      GMTrace.o(6650219986944L, 49548);
      return locali;
    }
    
    public final int getCount()
    {
      GMTrace.i(6650085769216L, 49547);
      int i = MallOrderRecordListUI.this.ota.size();
      GMTrace.o(6650085769216L, 49547);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6650354204672L, 49549);
      long l = paramInt;
      GMTrace.o(6650354204672L, 49549);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6650488422400L, 49550);
      View localView;
      i locali;
      Object localObject1;
      int i;
      if (paramView == null)
      {
        localView = View.inflate(MallOrderRecordListUI.this, R.i.cZP, null);
        paramViewGroup = new MallOrderRecordListUI.b(MallOrderRecordListUI.this);
        paramViewGroup.otg = ((TextView)localView.findViewById(R.h.cid));
        paramViewGroup.oti = ((TextView)localView.findViewById(R.h.cic));
        paramViewGroup.oth = ((TextView)localView.findViewById(R.h.cib));
        paramViewGroup.otj = ((TextView)localView.findViewById(R.h.chZ));
        paramViewGroup.otl = localView.findViewById(R.h.chW);
        paramViewGroup.otm = ((TextView)localView.findViewById(R.h.chY));
        paramViewGroup.otn = ((TextView)localView.findViewById(R.h.chX));
        paramViewGroup.otk = ((TextView)localView.findViewById(R.h.cia));
        localView.setTag(paramViewGroup);
        locali = se(paramInt);
        if (paramInt != 0) {
          break label612;
        }
        paramView = se(0);
        localObject1 = new GregorianCalendar();
        ((GregorianCalendar)localObject1).setTimeInMillis(paramView.orU * 1000L);
        paramView = MallOrderRecordListUI.cJ(((GregorianCalendar)localObject1).get(1), ((GregorianCalendar)localObject1).get(2) + 1);
        i = 1;
      }
      for (;;)
      {
        if (i != 0)
        {
          localObject1 = new SimpleDateFormat(MallOrderRecordListUI.this.getString(R.l.eaG, new Object[] { "" })).format(new Date(se(paramInt).orU * 1000L));
          paramViewGroup.otm.setText((CharSequence)localObject1);
          if ((!bg.mZ(paramView)) && (!bg.mZ((String)MallOrderRecordListUI.this.otd.get(paramView)))) {
            paramViewGroup.otn.setText((CharSequence)MallOrderRecordListUI.this.otd.get(paramView));
          }
          paramViewGroup.otl.setVisibility(0);
          label346:
          paramViewGroup.otg.setText(locali.orT);
          paramViewGroup.oth.setText(locali.orV);
          i = MallOrderRecordListUI.this.vov.voR.getResources().getColor(R.e.aPo);
          paramInt = i;
          if (bg.mZ(locali.osh)) {}
        }
        try
        {
          paramInt = Color.parseColor(locali.osh);
          paramViewGroup.oth.setTextColor(paramInt);
          paramViewGroup.oti.setText(MallOrderRecordListUI.this.sd(locali.orU));
          i = MallOrderRecordListUI.this.vov.voR.getResources().getColor(R.e.aPp);
          paramInt = i;
          if (bg.mZ(locali.osi)) {}
        }
        catch (Exception paramView)
        {
          try
          {
            paramInt = Color.parseColor(locali.osi);
            if (locali.orS != locali.osj)
            {
              paramView = com.tencent.mm.wallet_core.ui.e.d(locali.orS / 100.0D, locali.orX);
              localObject1 = new SpannableString(paramView);
              ((SpannableString)localObject1).setSpan(new StrikethroughSpan(), 0, paramView.length(), 33);
              paramViewGroup.otj.setText((CharSequence)localObject1);
              paramViewGroup.otk.setTextColor(paramInt);
              paramViewGroup.otk.setText(com.tencent.mm.wallet_core.ui.e.d(locali.osj / 100.0D, locali.orX));
              GMTrace.o(6650488422400L, 49550);
              return localView;
              paramViewGroup = (MallOrderRecordListUI.b)paramView.getTag();
              localView = paramView;
              break;
              label612:
              paramView = se(paramInt);
              Object localObject2 = se(paramInt - 1);
              if ((paramView.orU <= 0) || (((i)localObject2).orU <= 0)) {
                break label841;
              }
              localObject1 = new GregorianCalendar();
              ((GregorianCalendar)localObject1).setTimeInMillis(((i)localObject2).orU * 1000L);
              localObject2 = new GregorianCalendar();
              ((GregorianCalendar)localObject2).setTimeInMillis(paramView.orU * 1000L);
              if ((((GregorianCalendar)localObject1).get(1) == ((GregorianCalendar)localObject2).get(1)) && (((GregorianCalendar)localObject1).get(2) == ((GregorianCalendar)localObject2).get(2))) {
                break label841;
              }
              paramView = MallOrderRecordListUI.cJ(((GregorianCalendar)localObject2).get(1), ((GregorianCalendar)localObject2).get(2) + 1);
              i = 1;
              continue;
              paramViewGroup.otl.setVisibility(8);
              break label346;
              paramView = paramView;
              w.w("MicroMsg.WalletOrderListUI", "Parse color exp. colortext=" + bg.mY(locali.osh));
              paramInt = i;
            }
          }
          catch (Exception paramView)
          {
            for (;;)
            {
              w.w("MicroMsg.WalletOrderListUI", "Parse color exp. colortext=" + bg.mY(locali.osi));
              paramInt = i;
              continue;
              paramViewGroup.otj.setText("");
            }
            label841:
            i = 0;
            paramView = null;
          }
        }
      }
    }
  }
  
  private final class b
  {
    TextView otg;
    TextView oth;
    TextView oti;
    TextView otj;
    TextView otk;
    View otl;
    TextView otm;
    TextView otn;
    
    public b()
    {
      GMTrace.i(6654246518784L, 49578);
      GMTrace.o(6654246518784L, 49578);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/MallOrderRecordListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */