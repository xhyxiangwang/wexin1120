package com.tencent.mm.plugin.wallet.balance.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Iterator;

public class WalletSelectBankcardModeUI
  extends WalletBaseUI
{
  private int kjz;
  private ArrayList<a> mData;
  private ListView osQ;
  private ArrayList<Bankcard> rCk;
  private Bankcard rCl;
  private String rCm;
  private int rCv;
  private int rCz;
  private TextView rDb;
  private b rDc;
  
  public WalletSelectBankcardModeUI()
  {
    GMTrace.i(7715103440896L, 57482);
    this.kjz = 0;
    this.rCv = 0;
    this.mData = new ArrayList();
    this.rCz = -1;
    GMTrace.o(7715103440896L, 57482);
  }
  
  protected final void MH()
  {
    GMTrace.i(7715506094080L, 57485);
    oC(R.l.eSC);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7727317254144L, 57573);
        WalletSelectBankcardModeUI.this.setResult(0);
        WalletSelectBankcardModeUI.this.finish();
        GMTrace.o(7727317254144L, 57573);
        return true;
      }
    });
    this.rDb = ((TextView)findViewById(R.h.cKf));
    Object localObject;
    label208:
    int i;
    label262:
    Bankcard localBankcard;
    a locala;
    if (this.kjz == 0)
    {
      this.rDb.setText(R.l.eZe);
      this.osQ = ((ListView)findViewById(R.h.cIf));
      this.rDc = new b();
      this.osQ.setAdapter(this.rDc);
      this.osQ.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(7718593101824L, 57508);
          WalletSelectBankcardModeUI.a(WalletSelectBankcardModeUI.this, paramAnonymousInt);
          WalletSelectBankcardModeUI.a(WalletSelectBankcardModeUI.this).notifyDataSetChanged();
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("key_select_index", paramAnonymousInt);
          WalletSelectBankcardModeUI.this.setResult(-1, paramAnonymousAdapterView);
          w.i("MicroMsg.WalletSelectBankcardModeUI", "onItemClick pos is " + paramAnonymousInt);
          WalletSelectBankcardModeUI.this.finish();
          GMTrace.o(7718593101824L, 57508);
        }
      });
      this.mData.clear();
      this.rCm = getString(R.l.eSx);
      if (this.kjz != 0) {
        break label571;
      }
      p.bvm();
      localObject = p.bvn();
      this.rCk = ((ae)localObject).bxk();
      this.rCl = ((ae)localObject).a(this.rCk, null, false, true);
      if (((ae)localObject).rRt == null) {
        break label404;
      }
      this.rCv = ((ae)localObject).rRt.rCv;
      w.e("MicroMsg.WalletSelectBankcardModeUI", "is_show_charge is " + this.rCv);
      if ((this.rCk == null) || (this.rCk.size() <= 0)) {
        break label587;
      }
      w.i("MicroMsg.WalletSelectBankcardModeUI", "mBankcardList size is " + this.rCk.size());
      localObject = this.rCk.iterator();
      i = 0;
      if (!((Iterator)localObject).hasNext()) {
        break label519;
      }
      localBankcard = (Bankcard)((Iterator)localObject).next();
      locala = new a();
      locala.title = localBankcard.field_desc;
      if ((localBankcard.field_fetch_charge_rate <= 0.0D) || (this.rCv != 1)) {
        break label465;
      }
      if (TextUtils.isEmpty(localBankcard.field_fetch_charge_info)) {
        break label420;
      }
      locala.kqV = localBankcard.field_fetch_charge_info;
    }
    for (;;)
    {
      this.mData.add(locala);
      if ((this.rCz == -1) && (this.rCl != null) && (this.rCl.equals(localBankcard))) {
        this.rCz = i;
      }
      i += 1;
      break label262;
      if (this.kjz != 1) {
        break;
      }
      this.rDb.setText(R.l.eZf);
      break;
      label404:
      this.rCv = 0;
      w.e("MicroMsg.WalletSelectBankcardModeUI", "userInfo.getBalanceFetchInfo() is null");
      break label208;
      label420:
      locala.kqV = (getString(R.l.eSb) + localBankcard.field_fetch_charge_rate * 100.0D + "%");
      continue;
      label465:
      w.i("MicroMsg.WalletSelectBankcardModeUI", "the bank " + localBankcard.field_desc + " field_fetch_charge_rate is " + localBankcard.field_fetch_charge_rate + " is_show_charge is " + this.rCv);
    }
    label519:
    if ((this.rCz == -1) && (this.rCl == null)) {
      this.rCz = i;
    }
    for (;;)
    {
      localObject = new a();
      ((a)localObject).title = this.rCm;
      ((a)localObject).kqV = "";
      this.mData.add(localObject);
      label571:
      this.rDc.notifyDataSetChanged();
      GMTrace.o(7715506094080L, 57485);
      return;
      label587:
      w.i("MicroMsg.WalletSelectBankcardModeUI", "hy: no bankcard show new only");
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(7716042964992L, 57489);
    GMTrace.o(7716042964992L, 57489);
    return 1;
  }
  
  public final boolean aMh()
  {
    GMTrace.i(7715774529536L, 57487);
    GMTrace.o(7715774529536L, 57487);
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7715237658624L, 57483);
    GMTrace.o(7715237658624L, 57483);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7715640311808L, 57486);
    int i = R.i.djk;
    GMTrace.o(7715640311808L, 57486);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7715371876352L, 57484);
    super.onCreate(paramBundle);
    setResult(0);
    this.kjz = getIntent().getIntExtra("key_scene_select_bankcard_mode_ui", 0);
    this.rCz = getIntent().getIntExtra("key_select_index", -1);
    w.i("MicroMsg.WalletSelectBankcardModeUI", "onCreate() mFromScene is " + this.kjz);
    MH();
    GMTrace.o(7715371876352L, 57484);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7715908747264L, 57488);
    if (paramInt == 4)
    {
      setResult(0);
      finish();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(7715908747264L, 57488);
    return bool;
  }
  
  private static final class a
  {
    public String kqV;
    public String title;
    
    public a()
    {
      GMTrace.i(7721814327296L, 57532);
      this.title = "";
      this.kqV = "";
      GMTrace.o(7721814327296L, 57532);
    }
  }
  
  @SuppressLint({"ViewHolder"})
  final class b
    extends BaseAdapter
  {
    b()
    {
      GMTrace.i(7725438205952L, 57559);
      GMTrace.o(7725438205952L, 57559);
    }
    
    public final int getCount()
    {
      GMTrace.i(7725572423680L, 57560);
      int i = WalletSelectBankcardModeUI.b(WalletSelectBankcardModeUI.this).size();
      GMTrace.o(7725572423680L, 57560);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7725706641408L, 57561);
      long l = paramInt;
      GMTrace.o(7725706641408L, 57561);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(7725840859136L, 57562);
      paramView = View.inflate(WalletSelectBankcardModeUI.this, R.i.djl, null);
      paramViewGroup = (WalletSelectBankcardModeUI.a)WalletSelectBankcardModeUI.b(WalletSelectBankcardModeUI.this).get(paramInt);
      TextView localTextView1 = (TextView)paramView.findViewById(R.h.bla);
      TextView localTextView2 = (TextView)paramView.findViewById(R.h.bkZ);
      ImageView localImageView = (ImageView)paramView.findViewById(R.h.cuY);
      localTextView1.setText(paramViewGroup.title);
      if (!TextUtils.isEmpty(paramViewGroup.kqV))
      {
        localTextView2.setVisibility(0);
        localTextView2.setText(paramViewGroup.kqV);
        if (WalletSelectBankcardModeUI.c(WalletSelectBankcardModeUI.this) != paramInt) {
          break label144;
        }
        localImageView.setImageResource(R.k.dqr);
      }
      for (;;)
      {
        GMTrace.o(7725840859136L, 57562);
        return paramView;
        localTextView2.setVisibility(8);
        break;
        label144:
        localImageView.setImageResource(R.k.dqq);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletSelectBankcardModeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */