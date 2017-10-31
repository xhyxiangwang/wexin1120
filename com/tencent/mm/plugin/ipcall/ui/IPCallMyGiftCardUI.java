package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.aed;
import com.tencent.mm.protocal.c.boh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class IPCallMyGiftCardUI
  extends MMActivity
  implements e
{
  private ListView EA;
  private View jJA;
  private ProgressDialog kUu;
  private a ney;
  private com.tencent.mm.plugin.ipcall.a.d.d nez;
  
  public IPCallMyGiftCardUI()
  {
    GMTrace.i(11695732817920L, 87140);
    GMTrace.o(11695732817920L, 87140);
  }
  
  protected final int Qb()
  {
    GMTrace.i(11695867035648L, 87141);
    GMTrace.o(11695867035648L, 87141);
    return 1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(11696672342016L, 87147);
    w.i("MicroMsg.IPCallMyGiftCardUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
    if ((paramk instanceof com.tencent.mm.plugin.ipcall.a.d.d))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((com.tencent.mm.plugin.ipcall.a.d.d)paramk).mZe;
        if ((this.kUu != null) && (this.kUu.isShowing())) {
          this.kUu.dismiss();
        }
        this.ney.mKd = paramString.tZN;
        this.ney.neC = paramString;
        this.ney.notifyDataSetChanged();
        if (paramString.tZN.size() == 0) {
          this.jJA.setVisibility(0);
        }
        GMTrace.o(11696672342016L, 87147);
        return;
      }
      if ((this.kUu != null) && (this.kUu.isShowing())) {
        this.kUu.dismiss();
      }
      this.jJA.setVisibility(0);
      Toast.makeText(this.vov.voR, getString(R.l.ehN), 0).show();
    }
    GMTrace.o(11696672342016L, 87147);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11696538124288L, 87146);
    int i = R.i.cYd;
    GMTrace.o(11696538124288L, 87146);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11696001253376L, 87142);
    GMTrace.o(11696001253376L, 87142);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11696135471104L, 87143);
    super.onCreate(paramBundle);
    ap.wT().a(288, this);
    oC(R.l.eiI);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11675600158720L, 86990);
        IPCallMyGiftCardUI.this.finish();
        GMTrace.o(11675600158720L, 86990);
        return true;
      }
    });
    a(0, this.vov.voR.getString(R.l.eiH), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11630503002112L, 86654);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("rawUrl", IPCallMyGiftCardUI.this.getString(R.l.ehH));
        paramAnonymousMenuItem.putExtra("showShare", false);
        com.tencent.mm.bi.d.b(IPCallMyGiftCardUI.this, "webview", ".ui.tools.WebViewUI", paramAnonymousMenuItem);
        GMTrace.o(11630503002112L, 86654);
        return true;
      }
    });
    this.jJA = findViewById(R.h.bRs);
    this.EA = ((ListView)findViewById(R.h.bRt));
    this.ney = new a(this);
    this.EA.setAdapter(this.ney);
    paramBundle = this.vov.voR;
    getString(R.l.dxm);
    this.kUu = h.a(paramBundle, getString(R.l.ehQ), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11711973163008L, 87261);
        try
        {
          if (IPCallMyGiftCardUI.a(IPCallMyGiftCardUI.this) != null) {
            ap.wT().c(IPCallMyGiftCardUI.a(IPCallMyGiftCardUI.this));
          }
          IPCallMyGiftCardUI.this.finish();
          GMTrace.o(11711973163008L, 87261);
          return;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          w.e("MicroMsg.IPCallMyGiftCardUI", "cancel getProductListScene error: %s", new Object[] { paramAnonymousDialogInterface.getMessage() });
          GMTrace.o(11711973163008L, 87261);
        }
      }
    });
    this.nez = new com.tencent.mm.plugin.ipcall.a.d.d();
    ap.wT().a(this.nez, 0);
    GMTrace.o(11696135471104L, 87143);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11696403906560L, 87145);
    super.onDestroy();
    ap.wT().b(288, this);
    GMTrace.o(11696403906560L, 87145);
  }
  
  protected void onResume()
  {
    GMTrace.i(11696269688832L, 87144);
    super.onResume();
    GMTrace.o(11696269688832L, 87144);
  }
  
  private static final class a
    extends BaseAdapter
  {
    List<boh> mKd;
    private IPCallMyGiftCardUI neB;
    aed neC;
    
    public a(IPCallMyGiftCardUI paramIPCallMyGiftCardUI)
    {
      GMTrace.i(11638019194880L, 86710);
      this.mKd = null;
      this.neB = null;
      this.neC = null;
      if (paramIPCallMyGiftCardUI != null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        this.neB = paramIPCallMyGiftCardUI;
        GMTrace.o(11638019194880L, 86710);
        return;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(11638153412608L, 86711);
      if (this.mKd == null)
      {
        GMTrace.o(11638153412608L, 86711);
        return 0;
      }
      int i = this.mKd.size();
      GMTrace.o(11638153412608L, 86711);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(11638287630336L, 86712);
      if (this.mKd != null)
      {
        Object localObject = this.mKd.get(paramInt);
        GMTrace.o(11638287630336L, 86712);
        return localObject;
      }
      GMTrace.o(11638287630336L, 86712);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(11638421848064L, 86713);
      long l = paramInt;
      GMTrace.o(11638421848064L, 86713);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(11638690283520L, 86715);
      if (paramView == null)
      {
        paramView = ((LayoutInflater)this.neB.getSystemService("layout_inflater")).inflate(R.i.cYc, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.neD = ((TextView)paramView.findViewById(R.h.bzv));
        paramViewGroup.neE = ((TextView)paramView.findViewById(R.h.bAd));
        paramViewGroup.neF = ((TextView)paramView.findViewById(R.h.bFL));
        paramViewGroup.neG = ((CdnImageView)paramView.findViewById(R.h.bOA));
        paramViewGroup.neH = ((ImageView)paramView.findViewById(R.h.bAn));
        paramView.setTag(paramViewGroup);
      }
      boh localboh;
      for (;;)
      {
        localboh = (boh)getItem(paramInt);
        if (localboh != null) {
          break;
        }
        GMTrace.o(11638690283520L, 86715);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      if (bg.mZ(localboh.uEL))
      {
        paramViewGroup.neD.setVisibility(0);
        paramViewGroup.neE.setVisibility(0);
        paramViewGroup.neF.setVisibility(8);
        paramViewGroup.neD.setText(localboh.uoq);
        paramViewGroup.neE.setText(localboh.uEK);
        a.b.a(paramViewGroup.neH, "", 0.5F, false);
        if (bg.mZ(localboh.mDH)) {
          break label317;
        }
        paramViewGroup.neG.setVisibility(0);
        paramViewGroup.neG.O(localboh.mDH, 0, 0);
        paramViewGroup.neH.setVisibility(4);
      }
      for (;;)
      {
        GMTrace.o(11638690283520L, 86715);
        return paramView;
        paramViewGroup.neD.setVisibility(8);
        paramViewGroup.neE.setVisibility(8);
        paramViewGroup.neF.setVisibility(0);
        paramViewGroup.neF.setText(localboh.uEL);
        break;
        label317:
        paramViewGroup.neH.setVisibility(0);
        paramViewGroup.neG.setVisibility(4);
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(11638556065792L, 86714);
      GMTrace.o(11638556065792L, 86714);
      return 2;
    }
    
    private final class a
    {
      TextView neD;
      TextView neE;
      TextView neF;
      CdnImageView neG;
      ImageView neH;
      
      public a()
      {
        GMTrace.i(11674660634624L, 86983);
        GMTrace.o(11674660634624L, 86983);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallMyGiftCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */