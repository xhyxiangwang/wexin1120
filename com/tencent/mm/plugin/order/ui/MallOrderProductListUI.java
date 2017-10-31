package com.tencent.mm.plugin.order.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
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
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.order.c.b;
import com.tencent.mm.plugin.order.c.c;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import com.tencent.mm.plugin.order.model.ProductSectionItem.Skus;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MallOrderProductListUI
  extends WalletBaseUI
{
  private String hcd;
  private List<ProductSectionItem> jtf;
  private String kJW;
  private BaseAdapter ksR;
  private ListView osQ;
  
  public MallOrderProductListUI()
  {
    GMTrace.i(6655991349248L, 49591);
    this.jtf = new ArrayList();
    this.kJW = "";
    this.hcd = "";
    GMTrace.o(6655991349248L, 49591);
  }
  
  @Deprecated
  protected final void MH()
  {
    GMTrace.i(6656528220160L, 49595);
    oC(R.l.enM);
    Bundle localBundle = this.un;
    ArrayList localArrayList = localBundle.getParcelableArrayList("order_product_list");
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      this.jtf.clear();
      this.jtf.addAll(localArrayList);
    }
    this.kJW = localBundle.getString("key_trans_id");
    this.hcd = localBundle.getString("appname");
    this.osQ = ((ListView)findViewById(R.h.cim));
    this.ksR = new a((byte)0);
    this.osQ.setAdapter(this.ksR);
    this.ksR.notifyDataSetChanged();
    this.osQ.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6640556310528L, 49476);
        paramAnonymousAdapterView = (ProductSectionItem)MallOrderProductListUI.a(MallOrderProductListUI.this).get(paramAnonymousInt);
        if (paramAnonymousAdapterView != null)
        {
          MallOrderProductListUI.a(MallOrderProductListUI.this, paramAnonymousAdapterView);
          c.a(Boolean.valueOf(false), MallOrderProductListUI.b(MallOrderProductListUI.this), MallOrderProductListUI.c(MallOrderProductListUI.this), paramAnonymousAdapterView.name, paramAnonymousAdapterView.osx);
        }
        GMTrace.o(6640556310528L, 49476);
      }
    });
    GMTrace.o(6656528220160L, 49595);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6656125566976L, 49592);
    GMTrace.o(6656125566976L, 49592);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6656259784704L, 49593);
    int i = R.i.cZR;
    GMTrace.o(6656259784704L, 49593);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6656394002432L, 49594);
    super.onCreate(paramBundle);
    sh(0);
    MH();
    GMTrace.o(6656394002432L, 49594);
  }
  
  public void onDestroy()
  {
    GMTrace.i(6656662437888L, 49596);
    super.onDestroy();
    GMTrace.o(6656662437888L, 49596);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6656796655616L, 49597);
    if (paramInt == 4)
    {
      if ((com.tencent.mm.wallet_core.a.aa(this) instanceof com.tencent.mm.plugin.order.a.a)) {
        com.tencent.mm.wallet_core.a.X(this);
      }
      GMTrace.o(6656796655616L, 49597);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6656796655616L, 49597);
    return bool;
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(6660017881088L, 49621);
      GMTrace.o(6660017881088L, 49621);
    }
    
    private ProductSectionItem sc(int paramInt)
    {
      GMTrace.i(6660286316544L, 49623);
      ProductSectionItem localProductSectionItem = (ProductSectionItem)MallOrderProductListUI.a(MallOrderProductListUI.this).get(paramInt);
      GMTrace.o(6660286316544L, 49623);
      return localProductSectionItem;
    }
    
    public final int getCount()
    {
      GMTrace.i(6660152098816L, 49622);
      int i = MallOrderProductListUI.a(MallOrderProductListUI.this).size();
      GMTrace.o(6660152098816L, 49622);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6660420534272L, 49624);
      long l = paramInt;
      GMTrace.o(6660420534272L, 49624);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6660554752000L, 49625);
      ProductSectionItem localProductSectionItem;
      if (paramView == null)
      {
        paramView = View.inflate(MallOrderProductListUI.this, R.i.cZS, null);
        paramViewGroup = new MallOrderProductListUI.b(MallOrderProductListUI.this);
        paramViewGroup.kyj = ((ImageView)paramView.findViewById(R.h.bRY));
        paramViewGroup.osS = ((TextView)paramView.findViewById(R.h.bRX));
        paramViewGroup.osT = ((TextView)paramView.findViewById(R.h.bRU));
        paramViewGroup.osU = ((TextView)paramView.findViewById(R.h.bRZ));
        paramViewGroup.osV = ((TextView)paramView.findViewById(R.h.bRV));
        paramViewGroup.osW = ((TextView)paramView.findViewById(R.h.bSa));
        paramView.setTag(paramViewGroup);
        localProductSectionItem = sc(paramInt);
        paramViewGroup.knr = localProductSectionItem.iconUrl;
        if ((TextUtils.isEmpty(paramViewGroup.knr)) || (!e.WB(paramViewGroup.knr))) {
          break label287;
        }
        Bitmap localBitmap = j.a(new b(paramViewGroup.knr));
        paramViewGroup.kyj.setImageBitmap(localBitmap);
      }
      for (;;)
      {
        paramViewGroup.osS.setText(localProductSectionItem.name);
        paramViewGroup.osT.setText(ProductSectionItem.Skus.aV(localProductSectionItem.osv));
        paramViewGroup.osU.setText(localProductSectionItem.osw);
        paramViewGroup.osV.setText("+" + localProductSectionItem.count);
        j.a(paramViewGroup);
        paramViewGroup.osW.setVisibility(8);
        GMTrace.o(6660554752000L, 49625);
        return paramView;
        paramViewGroup = (MallOrderProductListUI.b)paramView.getTag();
        break;
        label287:
        paramViewGroup.kyj.setImageResource(R.k.doS);
      }
    }
  }
  
  private final class b
    implements j.a
  {
    String knr;
    ImageView kyj;
    TextView osS;
    TextView osT;
    TextView osU;
    TextView osV;
    TextView osW;
    
    public b()
    {
      GMTrace.i(6655320260608L, 49586);
      GMTrace.o(6655320260608L, 49586);
    }
    
    public final void k(String paramString, final Bitmap paramBitmap)
    {
      GMTrace.i(6655454478336L, 49587);
      if ((paramString != null) && (paramString.equals(this.knr))) {
        this.kyj.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6652635906048L, 49566);
            MallOrderProductListUI.b.this.kyj.setImageBitmap(paramBitmap);
            GMTrace.o(6652635906048L, 49566);
          }
        });
      }
      GMTrace.o(6655454478336L, 49587);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/MallOrderProductListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */