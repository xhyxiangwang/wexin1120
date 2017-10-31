package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.ipcall.a.d.j;
import com.tencent.mm.plugin.ipcall.a.e.f;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.aef;
import com.tencent.mm.protocal.c.boj;
import com.tencent.mm.protocal.c.bol;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IPCallPackageUI
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  private ListView neJ;
  private TextView neK;
  private ProgressDialog neL;
  private ProgressDialog neM;
  private a neN;
  private com.tencent.mm.plugin.ipcall.a.d.e neO;
  private j neP;
  private f neQ;
  
  public IPCallPackageUI()
  {
    GMTrace.i(15072382418944L, 112298);
    this.neJ = null;
    this.neK = null;
    this.neL = null;
    this.neM = null;
    this.neN = null;
    this.neO = null;
    this.neP = null;
    this.neQ = new f();
    GMTrace.o(15072382418944L, 112298);
  }
  
  private void aIo()
  {
    GMTrace.i(15073053507584L, 112303);
    w.i("MicroMsg.IPCallPackageUI", "startGetPackageProductList");
    if (this.neN != null)
    {
      this.neN.mKd = null;
      this.neN.notifyDataSetChanged();
    }
    if (this.neJ != null) {
      this.neJ.setVisibility(8);
    }
    if (this.neK != null) {
      this.neK.setVisibility(8);
    }
    if (this.neL == null)
    {
      ActionBarActivity localActionBarActivity = this.vov.voR;
      getString(R.l.dxm);
      this.neL = h.a(localActionBarActivity, getString(R.l.ehQ), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(15073993031680L, 112310);
          try
          {
            if (IPCallPackageUI.a(IPCallPackageUI.this) != null) {
              ap.wT().c(IPCallPackageUI.a(IPCallPackageUI.this));
            }
            IPCallPackageUI.this.finish();
            GMTrace.o(15073993031680L, 112310);
            return;
          }
          catch (Exception paramAnonymousDialogInterface)
          {
            w.e("MicroMsg.IPCallPackageUI", "cancel getPackageProductListNetScene error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
            GMTrace.o(15073993031680L, 112310);
          }
        }
      });
    }
    for (;;)
    {
      this.neO = new com.tencent.mm.plugin.ipcall.a.d.e();
      ap.wT().a(this.neO, 0);
      GMTrace.o(15073053507584L, 112303);
      return;
      this.neL.show();
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(15072919289856L, 112302);
    GMTrace.o(15072919289856L, 112302);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(15073187725312L, 112304);
    if ((this.neL != null) && (this.neL.isShowing())) {
      this.neL.dismiss();
    }
    if ((this.neM != null) && (this.neM.isShowing())) {
      this.neM.dismiss();
    }
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.e))
    {
      w.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallGetPackageProductList errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((com.tencent.mm.plugin.ipcall.a.d.e)paramk).mZg;
        if ((paramString != null) && (paramString.tZL != null) && (paramString.tZL.size() > 0))
        {
          this.neN.mKd = paramString.tZL;
          this.neN.notifyDataSetChanged();
          this.neJ.setVisibility(0);
          GMTrace.o(15073187725312L, 112304);
          return;
        }
        this.neN.mKd = null;
        this.neN.notifyDataSetChanged();
        this.neK.setVisibility(0);
        GMTrace.o(15073187725312L, 112304);
        return;
      }
      Toast.makeText(this.vov.voR, getString(R.l.ehN), 0).show();
      finish();
      GMTrace.o(15073187725312L, 112304);
      return;
    }
    if ((paramk instanceof j))
    {
      w.i("MicroMsg.IPCallPackageUI", "onSceneEnd NetSceneIPCallPurchasePackage errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
      this.neQ.mZN = paramInt2;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.neQ.finish();
        Toast.makeText(this.vov.voR, getString(R.l.eiW), 0).show();
        aIo();
        GMTrace.o(15073187725312L, 112304);
        return;
      }
      if (paramInt2 == 101)
      {
        Object localObject = this.neN;
        paramString = (j)paramk;
        if (paramString.mZq != null)
        {
          paramString = paramString.mZq.txh;
          if ((bg.mZ(paramString)) || (((a)localObject).mKd == null)) {
            break label470;
          }
          localObject = ((a)localObject).mKd.iterator();
          do
          {
            if (!((Iterator)localObject).hasNext()) {
              break;
            }
            paramk = (boj)((Iterator)localObject).next();
          } while ((paramk == null) || (!paramk.txh.equals(paramString)));
        }
        label470:
        for (paramString = paramk;; paramString = null)
        {
          if (paramString != null) {
            break label475;
          }
          w.e("MicroMsg.IPCallPackageUI", "onSceneEnd: proToBuy is null");
          this.neQ.finish();
          Toast.makeText(this.vov.voR, getString(R.l.eiR), 0).show();
          GMTrace.o(15073187725312L, 112304);
          return;
          paramString = "";
          break;
        }
        label475:
        h.a(this.vov.voR, this.vov.voR.getString(R.l.eiS, new Object[] { paramString.uoq, paramString.fuw }), this.vov.voR.getString(R.l.eiT), this.vov.voR.getString(R.l.eia), this.vov.voR.getString(R.l.eiO), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(15075469426688L, 112321);
            paramAnonymousDialogInterface = IPCallPackageUI.b(IPCallPackageUI.this);
            paramAnonymousDialogInterface.mZP += 1;
            IPCallPackageUI.b(IPCallPackageUI.this).finish();
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.setClass(IPCallPackageUI.this.vov.voR, IPCallRechargeUI.class);
            IPCallPackageUI.this.startActivity(paramAnonymousDialogInterface);
            IPCallPackageUI.this.finish();
            GMTrace.o(15075469426688L, 112321);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(15071845548032L, 112294);
            paramAnonymousDialogInterface = IPCallPackageUI.b(IPCallPackageUI.this);
            paramAnonymousDialogInterface.mZQ += 1;
            IPCallPackageUI.b(IPCallPackageUI.this).finish();
            GMTrace.o(15071845548032L, 112294);
          }
        });
        GMTrace.o(15073187725312L, 112304);
        return;
      }
      this.neQ.finish();
      Toast.makeText(this.vov.voR, getString(R.l.eiR), 0).show();
      aIo();
      GMTrace.o(15073187725312L, 112304);
      return;
    }
    w.i("MicroMsg.IPCallPackageUI", "onSceneEnd errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
    GMTrace.o(15073187725312L, 112304);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15072785072128L, 112301);
    int i = R.i.cYf;
    GMTrace.o(15072785072128L, 112301);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15072516636672L, 112299);
    super.onCreate(paramBundle);
    ap.wT().a(831, this);
    ap.wT().a(277, this);
    this.neQ.start();
    paramBundle = this.neQ;
    paramBundle.mZJ += 1;
    this.neQ.finish();
    oC(R.l.eiU);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(15071577112576L, 112292);
        IPCallPackageUI.this.finish();
        GMTrace.o(15071577112576L, 112292);
        return true;
      }
    });
    this.neJ = ((ListView)findViewById(R.h.ciD));
    this.neN = new a(this);
    this.neJ.setAdapter(this.neN);
    this.neK = ((TextView)findViewById(R.h.cgz));
    aIo();
    GMTrace.o(15072516636672L, 112299);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(15072650854400L, 112300);
    super.onDestroy();
    ap.wT().b(831, this);
    ap.wT().b(277, this);
    GMTrace.o(15072650854400L, 112300);
  }
  
  private static final class a
    extends BaseAdapter
  {
    List<boj> mKd;
    private IPCallPackageUI neS;
    
    public a(IPCallPackageUI paramIPCallPackageUI)
    {
      GMTrace.i(15070637588480L, 112285);
      this.mKd = null;
      this.neS = null;
      this.neS = paramIPCallPackageUI;
      GMTrace.o(15070637588480L, 112285);
    }
    
    public final int getCount()
    {
      GMTrace.i(15070771806208L, 112286);
      if (this.mKd == null)
      {
        GMTrace.o(15070771806208L, 112286);
        return 0;
      }
      int i = this.mKd.size();
      GMTrace.o(15070771806208L, 112286);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(15070906023936L, 112287);
      if (this.mKd != null)
      {
        Object localObject = this.mKd.get(paramInt);
        GMTrace.o(15070906023936L, 112287);
        return localObject;
      }
      GMTrace.o(15070906023936L, 112287);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(15071040241664L, 112288);
      long l = paramInt;
      GMTrace.o(15071040241664L, 112288);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(15071174459392L, 112289);
      if (paramView == null)
      {
        paramView = ((LayoutInflater)this.neS.getSystemService("layout_inflater")).inflate(R.i.cYe, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.neW = ((CdnImageView)paramView.findViewById(R.h.ciB));
        paramViewGroup.inV = ((TextView)paramView.findViewById(R.h.ciE));
        paramViewGroup.neX = ((TextView)paramView.findViewById(R.h.ciF));
        paramViewGroup.neY = ((TextView)paramView.findViewById(R.h.ciy));
        paramViewGroup.neZ = ((TextView)paramView.findViewById(R.h.ciz));
        paramViewGroup.nfa = ((Button)paramView.findViewById(R.h.cix));
        paramView.setTag(paramViewGroup);
      }
      boj localboj;
      for (;;)
      {
        localboj = (boj)getItem(paramInt);
        if (localboj != null) {
          break;
        }
        GMTrace.o(15071174459392L, 112289);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.inV.setText(localboj.fuw);
      paramViewGroup.neX.setText(localboj.uoq);
      paramViewGroup.neZ.setText(localboj.mCK);
      paramViewGroup.neY.setText(localboj.nat);
      paramViewGroup.neW.setVisibility(0);
      paramViewGroup.neW.O(localboj.uEO, 0, 0);
      if (localboj.tve == 0) {
        paramViewGroup.nfa.setEnabled(true);
      }
      for (;;)
      {
        paramViewGroup.nfa.setTag(Integer.valueOf(paramInt));
        paramViewGroup.nfa.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(final View paramAnonymousView)
          {
            GMTrace.i(15075737862144L, 112323);
            paramAnonymousView = (boj)IPCallPackageUI.a.this.getItem(((Integer)paramAnonymousView.getTag()).intValue());
            if ((paramAnonymousView == null) || (bg.mZ(paramAnonymousView.txh)))
            {
              w.e("MicroMsg.IPCallPackageUI", "buyBtnClick: proToBuy is null");
              GMTrace.o(15075737862144L, 112323);
              return;
            }
            IPCallPackageUI.b(IPCallPackageUI.this).start();
            f localf = IPCallPackageUI.b(IPCallPackageUI.this);
            localf.mZK += 1;
            IPCallPackageUI.b(IPCallPackageUI.this).mZO = paramAnonymousView.txh;
            h.a(IPCallPackageUI.this, IPCallPackageUI.this.getString(R.l.eiP, new Object[] { paramAnonymousView.uoq, paramAnonymousView.fuw }), IPCallPackageUI.this.getString(R.l.eiQ), IPCallPackageUI.this.getString(R.l.eiN), IPCallPackageUI.this.getString(R.l.eiO), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(15069295411200L, 112275);
                paramAnonymous2DialogInterface = IPCallPackageUI.b(IPCallPackageUI.a.a(IPCallPackageUI.a.this));
                paramAnonymous2DialogInterface.mZL += 1;
                IPCallPackageUI.a(IPCallPackageUI.a.a(IPCallPackageUI.a.this), paramAnonymousView.txh);
                GMTrace.o(15069295411200L, 112275);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(15070503370752L, 112284);
                paramAnonymous2DialogInterface = IPCallPackageUI.b(IPCallPackageUI.a.a(IPCallPackageUI.a.this));
                paramAnonymous2DialogInterface.mZM += 1;
                IPCallPackageUI.b(IPCallPackageUI.a.a(IPCallPackageUI.a.this)).finish();
                GMTrace.o(15070503370752L, 112284);
              }
            });
            GMTrace.o(15075737862144L, 112323);
          }
        });
        GMTrace.o(15071174459392L, 112289);
        return paramView;
        paramViewGroup.nfa.setEnabled(false);
      }
    }
    
    private final class a
    {
      TextView inV;
      CdnImageView neW;
      TextView neX;
      TextView neY;
      TextView neZ;
      Button nfa;
      
      public a()
      {
        GMTrace.i(15071979765760L, 112295);
        GMTrace.o(15071979765760L, 112295);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallPackageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */