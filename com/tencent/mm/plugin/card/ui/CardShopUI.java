package com.tencent.mm.plugin.card.ui;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.a.m;
import com.tencent.mm.plugin.card.a.m.a;
import com.tencent.mm.plugin.card.b.d.7;
import com.tencent.mm.plugin.card.b.d.8;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.h.a;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.ArrayList;

public class CardShopUI
  extends MMActivity
  implements m.a
{
  private ListView EA;
  BroadcastReceiver iUS;
  private View.OnClickListener iom;
  private com.tencent.mm.plugin.card.base.b kmJ;
  private ArrayList<ji> kmP;
  private String kmv;
  private boolean ksF;
  private ProgressDialog kyF;
  private String kyG;
  private a kyH;
  private LinearLayout kyI;
  private View kyJ;
  private TextView kyK;
  
  public CardShopUI()
  {
    GMTrace.i(5019608809472L, 37399);
    this.kmP = new ArrayList();
    this.kyG = "";
    this.ksF = false;
    this.iUS = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(5000549892096L, 37257);
        paramAnonymousContext = paramAnonymousIntent.getAction();
        if ((paramAnonymousContext != null) && (paramAnonymousContext.equals("android.intent.action.LOCALE_CHANGED")) && (CardShopUI.als())) {
          CardShopUI.e(CardShopUI.this);
        }
        GMTrace.o(5000549892096L, 37257);
      }
    };
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5029406703616L, 37472);
        if (paramAnonymousView.getId() == R.h.cxS)
        {
          paramAnonymousView = (ji)paramAnonymousView.getTag();
          if (paramAnonymousView != null)
          {
            com.tencent.mm.plugin.card.b.b.a(CardShopUI.this, paramAnonymousView.fFh, paramAnonymousView.fGL, paramAnonymousView.hwK);
            g.paX.i(11941, new Object[] { Integer.valueOf(5), CardShopUI.c(CardShopUI.this).aiO(), CardShopUI.c(CardShopUI.this).aiP(), "", paramAnonymousView.name });
          }
        }
        GMTrace.o(5029406703616L, 37472);
      }
    };
    GMTrace.o(5019608809472L, 37399);
  }
  
  private void alp()
  {
    GMTrace.i(5020414115840L, 37405);
    w.i("MicroMsg.CardShopUI", "openLocation");
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.LOCALE_CHANGED");
    registerReceiver(this.iUS, localIntentFilter);
    if (alq())
    {
      alr();
      GMTrace.o(5020414115840L, 37405);
      return;
    }
    h.a(this, getString(R.l.dHF, new Object[] { getString(R.l.dEK) }), getString(R.l.dxm), new d.7(this), new d.8());
    GMTrace.o(5020414115840L, 37405);
  }
  
  private static boolean alq()
  {
    GMTrace.i(5020548333568L, 37406);
    if ((!l.Ip()) && (!l.Iq())) {}
    for (int i = 1; i == 0; i = 0)
    {
      GMTrace.o(5020548333568L, 37406);
      return true;
    }
    GMTrace.o(5020548333568L, 37406);
    return false;
  }
  
  private void alr()
  {
    GMTrace.i(5020682551296L, 37407);
    if (al.ajF().a(this.kyG, this.kmv, this))
    {
      ActionBarActivity localActionBarActivity = this.vov.voR;
      getString(R.l.dxm);
      this.kyF = h.a(localActionBarActivity, getString(R.l.dFl), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(4937333342208L, 36786);
          paramAnonymousDialogInterface = al.ajF();
          paramAnonymousDialogInterface.a(CardShopUI.d(CardShopUI.this), CardShopUI.this);
          if (paramAnonymousDialogInterface.knm != null) {
            ap.wT().c(paramAnonymousDialogInterface.knm);
          }
          GMTrace.o(4937333342208L, 36786);
        }
      });
      GMTrace.o(5020682551296L, 37407);
      return;
    }
    h.bl(this, getString(R.l.dFk));
    GMTrace.o(5020682551296L, 37407);
  }
  
  protected final void MH()
  {
    GMTrace.i(5019877244928L, 37401);
    if (!TextUtils.isEmpty(this.kmJ.aiK().tFz)) {
      rV(this.kmJ.aiK().tFz);
    }
    for (;;)
    {
      this.EA = ((ListView)findViewById(R.h.bre));
      this.kyI = ((LinearLayout)View.inflate(getBaseContext(), R.i.cOs, null));
      this.EA.addHeaderView(this.kyI);
      this.kyH = new a((byte)0);
      this.EA.setAdapter(this.kyH);
      final Intent localIntent = getIntent();
      this.EA.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(4999744585728L, 37251);
          if (paramAnonymousInt == 0)
          {
            w.v("MicroMsg.CardShopUI", "onItemClick pos is 0, click headerview");
            GMTrace.o(4999744585728L, 37251);
            return;
          }
          int i = paramAnonymousInt;
          if (paramAnonymousInt > 0) {
            i = paramAnonymousInt - 1;
          }
          paramAnonymousAdapterView = (ji)CardShopUI.a(CardShopUI.this).get(i);
          if ((!TextUtils.isEmpty(paramAnonymousAdapterView.tEL)) && (!TextUtils.isEmpty(paramAnonymousAdapterView.tEM)))
          {
            paramAnonymousInt = localIntent.getIntExtra("key_from_appbrand_type", 0);
            com.tencent.mm.plugin.card.b.b.c(CardShopUI.b(CardShopUI.this), paramAnonymousAdapterView.tEL, paramAnonymousAdapterView.tEM, 1052, paramAnonymousInt);
            GMTrace.o(4999744585728L, 37251);
            return;
          }
          if (!TextUtils.isEmpty(paramAnonymousAdapterView.kpe))
          {
            com.tencent.mm.plugin.card.b.b.a(CardShopUI.this, paramAnonymousAdapterView.kpe, 1);
            g.paX.i(11941, new Object[] { Integer.valueOf(4), CardShopUI.c(CardShopUI.this).aiO(), CardShopUI.c(CardShopUI.this).aiP(), "", paramAnonymousAdapterView.name });
          }
          GMTrace.o(4999744585728L, 37251);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4957466001408L, 36936);
          CardShopUI.this.finish();
          GMTrace.o(4957466001408L, 36936);
          return true;
        }
      });
      this.kyJ = View.inflate(this, R.i.cOr, null);
      if (this.kyI != null) {
        this.kyI.addView(this.kyJ);
      }
      this.kyK = ((TextView)this.kyJ.findViewById(R.h.bqn));
      this.kyK.setText(R.l.dGw);
      this.kyJ.setVisibility(8);
      GMTrace.o(5019877244928L, 37401);
      return;
      oC(R.l.dEK);
    }
  }
  
  public final void a(boolean paramBoolean, ArrayList<ji> paramArrayList)
  {
    GMTrace.i(5020279898112L, 37404);
    if (this.kyF != null)
    {
      this.kyF.dismiss();
      this.kyF = null;
    }
    if (paramArrayList == null) {}
    for (int i = 0;; i = paramArrayList.size())
    {
      w.d("MicroMsg.CardShopUI", "onGotCardShop, isOk = %b, shop list size = %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i) });
      if (paramBoolean) {
        break;
      }
      w.e("MicroMsg.CardShopUI", "onGotCardShop fail");
      GMTrace.o(5020279898112L, 37404);
      return;
    }
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      w.e("MicroMsg.CardShopUI", "list == null || list.size() == 0");
      GMTrace.o(5020279898112L, 37404);
      return;
    }
    if (this.kmP != null)
    {
      this.kmP.clear();
      this.kmP.addAll(paramArrayList);
      this.kyJ.setVisibility(0);
    }
    for (;;)
    {
      this.kyH.notifyDataSetChanged();
      GMTrace.o(5020279898112L, 37404);
      return;
      this.kyJ.setVisibility(8);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5020145680384L, 37403);
    int i = R.i.cOH;
    GMTrace.o(5020145680384L, 37403);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5019743027200L, 37400);
    super.onCreate(paramBundle);
    this.kmJ = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    String str = getIntent().getStringExtra("KEY_CARD_TP_ID");
    paramBundle = getIntent().getStringExtra("KEY_CARD_ID");
    if (this.kmJ != null)
    {
      w.i("MicroMsg.CardShopUI", "onCreate  mCardInfo != null");
      this.kyG = this.kmJ.aiP();
      paramBundle = this.kmJ.aiO();
    }
    for (;;)
    {
      this.kmv = paramBundle;
      do
      {
        if (TextUtils.isEmpty(this.kyG))
        {
          w.e("MicroMsg.CardShopUI", "onCreate  mCardTpid == null");
          finish();
        }
        boolean bool = a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 69, null, null);
        w.i("MicroMsg.CardShopUI", "checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
        this.ksF = bool;
        if (this.ksF) {
          alp();
        }
        MH();
        GMTrace.o(5019743027200L, 37400);
        return;
      } while (TextUtils.isEmpty(str));
      this.kyG = str;
      if (TextUtils.isEmpty(paramBundle)) {
        paramBundle = "";
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5020011462656L, 37402);
    if (this.ksF) {
      unregisterReceiver(this.iUS);
    }
    al.ajF().a(this.kyG, this);
    super.onDestroy();
    GMTrace.o(5020011462656L, 37402);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(5020816769024L, 37408);
    w.i("MicroMsg.CardShopUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5020816769024L, 37408);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        w.i("MicroMsg.CardShopUI", "onMPermissionGranted LocationPermissionGranted " + this.ksF);
        if (!this.ksF)
        {
          this.ksF = true;
          alp();
        }
        GMTrace.o(5020816769024L, 37408);
        return;
      }
      h.a(this, getString(R.l.etS), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(4937870213120L, 36790);
          CardShopUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(4937870213120L, 36790);
        }
      }, null);
    }
  }
  
  final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(5005918601216L, 37297);
      GMTrace.o(5005918601216L, 37297);
    }
    
    private ji lJ(int paramInt)
    {
      GMTrace.i(5006187036672L, 37299);
      ji localji = (ji)CardShopUI.a(CardShopUI.this).get(paramInt);
      GMTrace.o(5006187036672L, 37299);
      return localji;
    }
    
    public final int getCount()
    {
      GMTrace.i(5006052818944L, 37298);
      int i = CardShopUI.a(CardShopUI.this).size();
      GMTrace.o(5006052818944L, 37298);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5006321254400L, 37300);
      long l = paramInt;
      GMTrace.o(5006321254400L, 37300);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5006455472128L, 37301);
      if (paramView == null)
      {
        paramView = View.inflate(CardShopUI.this.vov.voR, R.i.cOG, null);
        paramViewGroup = new a();
        paramViewGroup.kyM = ((TextView)paramView.findViewById(R.h.cxP));
        paramViewGroup.kyN = ((TextView)paramView.findViewById(R.h.cxO));
        paramViewGroup.kyO = ((TextView)paramView.findViewById(R.h.cxN));
        paramViewGroup.kyP = ((ImageView)paramView.findViewById(R.h.cxR));
        paramViewGroup.kyQ = paramView.findViewById(R.h.cxS);
        paramView.setTag(paramViewGroup);
      }
      ji localji;
      for (;;)
      {
        localji = lJ(paramInt);
        if (localji != null) {
          break;
        }
        paramViewGroup.kyM.setText("");
        paramViewGroup.kyN.setText("");
        paramViewGroup.kyO.setText("");
        GMTrace.o(5006455472128L, 37301);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.kyM.setText(localji.name);
      if (localji.tEK <= 0.0F) {
        paramViewGroup.kyN.setVisibility(8);
      }
      for (;;)
      {
        paramViewGroup.kyO.setText(localji.gbW + localji.gbX + localji.hwK);
        paramViewGroup.kyQ.setOnClickListener(CardShopUI.f(CardShopUI.this));
        paramViewGroup.kyQ.setTag(localji);
        GMTrace.o(5006455472128L, 37301);
        return paramView;
        paramViewGroup.kyN.setText(l.d(CardShopUI.this.getBaseContext(), localji.tEK));
        paramViewGroup.kyN.setVisibility(0);
      }
    }
    
    final class a
    {
      public TextView kyM;
      public TextView kyN;
      public TextView kyO;
      public ImageView kyP;
      public View kyQ;
      
      a()
      {
        GMTrace.i(4971021991936L, 37037);
        GMTrace.o(4971021991936L, 37037);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardShopUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */