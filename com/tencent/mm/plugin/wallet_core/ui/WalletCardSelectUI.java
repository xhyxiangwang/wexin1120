package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WalletCardSelectUI
  extends WalletBaseUI
{
  private int rFo;
  private int rJp;
  private CheckedTextView rTA;
  private CheckedTextView rTB;
  private String rTC;
  private int rTD;
  private int rTE;
  private int rTF;
  private a rTG;
  private MaxListView rTH;
  private List<ElementQuery> rTy;
  private List<ElementQuery> rTz;
  
  public WalletCardSelectUI()
  {
    GMTrace.i(6942277763072L, 51724);
    this.rTy = new LinkedList();
    this.rTz = new LinkedList();
    this.rJp = 3;
    this.rTE = -1;
    this.rTF = -1;
    this.rFo = -1;
    GMTrace.o(6942277763072L, 51724);
  }
  
  private void iU(boolean paramBoolean)
  {
    GMTrace.i(6942680416256L, 51727);
    this.rTH.setVisibility(0);
    if (paramBoolean)
    {
      this.rTA.setChecked(true);
      this.rTB.setChecked(false);
      this.rTG.hip = this.rTy;
      this.rTG.notifyDataSetChanged();
      this.rTH.clearChoices();
      if (this.rTE >= 0)
      {
        this.rTH.setItemChecked(this.rTE, true);
        kS(true);
        GMTrace.o(6942680416256L, 51727);
        return;
      }
      kS(false);
      GMTrace.o(6942680416256L, 51727);
      return;
    }
    this.rTA.setChecked(false);
    this.rTB.setChecked(true);
    this.rTG.hip = this.rTz;
    this.rTG.notifyDataSetChanged();
    this.rTH.clearChoices();
    if (this.rTF >= 0)
    {
      this.rTH.setItemChecked(this.rTF, true);
      kS(true);
      GMTrace.o(6942680416256L, 51727);
      return;
    }
    kS(false);
    GMTrace.o(6942680416256L, 51727);
  }
  
  public final void MH()
  {
    GMTrace.i(6942546198528L, 51726);
    this.rTC = this.un.getString("key_bank_type");
    this.rTD = this.un.getInt("key_bankcard_type", 1);
    this.rJp = this.un.getInt("key_support_bankcard", 1);
    this.rFo = this.un.getInt("key_bind_scene", -1);
    this.rTH = ((MaxListView)findViewById(R.h.cwh));
    this.rTA = ((CheckedTextView)findViewById(R.h.buX));
    this.rTB = ((CheckedTextView)findViewById(R.h.buY));
    this.rTG = new a(this);
    this.rTH.setAdapter(this.rTG);
    this.rTH.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6983079952384L, 52028);
        paramAnonymousAdapterView = WalletCardSelectUI.a(WalletCardSelectUI.this).wD(paramAnonymousInt);
        if (!bg.mZ(paramAnonymousAdapterView.rOd))
        {
          h.a(WalletCardSelectUI.this, paramAnonymousAdapterView.rOd, null, true, null);
          GMTrace.o(6983079952384L, 52028);
          return;
        }
        if (paramAnonymousAdapterView.bwt()) {
          WalletCardSelectUI.a(WalletCardSelectUI.this, paramAnonymousInt);
        }
        for (;;)
        {
          WalletCardSelectUI.this.kS(true);
          GMTrace.o(6983079952384L, 52028);
          return;
          WalletCardSelectUI.b(WalletCardSelectUI.this, paramAnonymousInt);
        }
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6956639059968L, 51831);
        WalletCardSelectUI.this.finish();
        GMTrace.o(6956639059968L, 51831);
        return true;
      }
    });
    a(0, getString(R.l.dvM), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6998112337920L, 52140);
        Object localObject = null;
        Intent localIntent = new Intent();
        if ((WalletCardSelectUI.b(WalletCardSelectUI.this).isChecked()) && (WalletCardSelectUI.c(WalletCardSelectUI.this) >= 0))
        {
          paramAnonymousMenuItem = (ElementQuery)WalletCardSelectUI.d(WalletCardSelectUI.this).get(WalletCardSelectUI.c(WalletCardSelectUI.this));
          if (paramAnonymousMenuItem == null) {
            break label155;
          }
          localIntent.putExtra("elemt_query", paramAnonymousMenuItem);
          WalletCardSelectUI.this.setResult(-1, localIntent);
        }
        for (;;)
        {
          WalletCardSelectUI.this.finish();
          GMTrace.o(6998112337920L, 52140);
          return true;
          paramAnonymousMenuItem = (MenuItem)localObject;
          if (!WalletCardSelectUI.e(WalletCardSelectUI.this).isChecked()) {
            break;
          }
          paramAnonymousMenuItem = (MenuItem)localObject;
          if (WalletCardSelectUI.f(WalletCardSelectUI.this) < 0) {
            break;
          }
          paramAnonymousMenuItem = (ElementQuery)WalletCardSelectUI.g(WalletCardSelectUI.this).get(WalletCardSelectUI.f(WalletCardSelectUI.this));
          break;
          label155:
          WalletCardSelectUI.this.setResult(0);
        }
      }
    }, p.b.vpB);
    kS(false);
    this.rTA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6942143545344L, 51723);
        WalletCardSelectUI.a(WalletCardSelectUI.this, true);
        GMTrace.o(6942143545344L, 51723);
      }
    });
    this.rTB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6945364770816L, 51747);
        WalletCardSelectUI.a(WalletCardSelectUI.this, false);
        GMTrace.o(6945364770816L, 51747);
      }
    });
    GMTrace.o(6942546198528L, 51726);
  }
  
  protected final int Qb()
  {
    GMTrace.i(6943217287168L, 51731);
    GMTrace.o(6943217287168L, 51731);
    return 1;
  }
  
  public final boolean aMh()
  {
    GMTrace.i(6943083069440L, 51730);
    GMTrace.o(6943083069440L, 51730);
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6942948851712L, 51729);
    GMTrace.o(6942948851712L, 51729);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6942814633984L, 51728);
    int i = R.i.dij;
    GMTrace.o(6942814633984L, 51728);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6942411980800L, 51725);
    super.onCreate(paramBundle);
    oC(R.l.eTC);
    MH();
    this.rTz.clear();
    this.rTy.clear();
    if (m.bwM().rKK != null)
    {
      paramBundle = m.bwM().rKK.iterator();
      while (paramBundle.hasNext())
      {
        ElementQuery localElementQuery = (ElementQuery)paramBundle.next();
        if ((this.rFo == 5) && (!localElementQuery.rOq)) {
          localElementQuery.rOd = getString(R.l.fak);
        }
        if (2 == localElementQuery.rNX) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label147;
          }
          this.rTz.add(localElementQuery);
          break;
        }
        label147:
        if (localElementQuery.bwt()) {
          this.rTy.add(localElementQuery);
        }
      }
    }
    if ((this.rJp == 3) && (!this.rTz.isEmpty()))
    {
      if (!m.bwE().bxd()) {
        break label271;
      }
      Collections.sort(this.rTz, new Comparator() {});
    }
    while (!this.rTy.isEmpty()) {
      if (bg.mZ(this.rTC))
      {
        this.rTA.setChecked(false);
        this.rTB.setChecked(false);
        this.rTH.setVisibility(8);
        GMTrace.o(6942411980800L, 51725);
        return;
        label271:
        Collections.sort(this.rTz, new Comparator() {});
      }
      else
      {
        if (this.rTD == 2)
        {
          j = this.rTz.size();
          i = 0;
          for (;;)
          {
            if (i < j)
            {
              if (((ElementQuery)this.rTz.get(i)).oql.equals(this.rTC))
              {
                this.rTF = i;
                iU(false);
                kS(true);
              }
            }
            else
            {
              if (this.rTF < 0)
              {
                iU(false);
                kS(false);
              }
              GMTrace.o(6942411980800L, 51725);
              return;
            }
            i += 1;
          }
        }
        j = this.rTy.size();
        i = 0;
        for (;;)
        {
          if (i < j)
          {
            if (((ElementQuery)this.rTy.get(i)).oql.equals(this.rTC))
            {
              this.rTE = i;
              iU(true);
              kS(true);
            }
          }
          else
          {
            if (this.rTE < 0)
            {
              iU(false);
              kS(false);
            }
            GMTrace.o(6942411980800L, 51725);
            return;
          }
          i += 1;
        }
      }
    }
    int j = this.rTz.size();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        if (((ElementQuery)this.rTz.get(i)).oql.equals(this.rTC))
        {
          this.rTF = i;
          iU(false);
          kS(true);
        }
      }
      else
      {
        if (this.rTF < 0)
        {
          iU(false);
          kS(false);
        }
        this.rTA.setVisibility(8);
        this.rTB.setBackgroundResource(R.g.aYc);
        this.rTB.setCheckMarkDrawable(R.g.bcD);
        GMTrace.o(6942411980800L, 51725);
        return;
      }
      i += 1;
    }
  }
  
  public final class a
    extends BaseAdapter
  {
    private Context context;
    List<ElementQuery> hip;
    
    public a(Context paramContext)
    {
      GMTrace.i(6994756894720L, 52115);
      this.hip = new ArrayList();
      this.context = paramContext;
      GMTrace.o(6994756894720L, 52115);
    }
    
    public final int getCount()
    {
      GMTrace.i(6995159547904L, 52118);
      int i = this.hip.size();
      GMTrace.o(6995159547904L, 52118);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6995427983360L, 52120);
      long l = paramInt;
      GMTrace.o(6995427983360L, 52120);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6995025330176L, 52117);
      paramViewGroup = new a();
      View localView = View.inflate(this.context, R.i.dhW, null);
      paramViewGroup.rTJ = ((CheckedTextView)localView.findViewById(R.h.buW));
      ElementQuery localElementQuery = (ElementQuery)this.hip.get(paramInt);
      paramView = bg.ap(localElementQuery.mVv, "");
      if (!bg.mZ(localElementQuery.rOd))
      {
        paramView = paramView + "[" + localElementQuery.rOd + "]";
        paramViewGroup.rTJ.setEnabled(false);
      }
      for (;;)
      {
        paramViewGroup.rTJ.setText(paramView);
        GMTrace.o(6995025330176L, 52117);
        return localView;
        paramViewGroup.rTJ.setEnabled(true);
      }
    }
    
    public final boolean isEnabled(int paramInt)
    {
      GMTrace.i(6994891112448L, 52116);
      boolean bool = bg.mZ(((ElementQuery)this.hip.get(paramInt)).rOd);
      GMTrace.o(6994891112448L, 52116);
      return bool;
    }
    
    public final ElementQuery wD(int paramInt)
    {
      GMTrace.i(6995293765632L, 52119);
      ElementQuery localElementQuery = (ElementQuery)this.hip.get(paramInt);
      GMTrace.o(6995293765632L, 52119);
      return localElementQuery;
    }
    
    final class a
    {
      CheckedTextView rTJ;
      
      a()
      {
        GMTrace.i(6984824782848L, 52041);
        GMTrace.o(6984824782848L, 52041);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */