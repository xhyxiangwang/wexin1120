package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class BizBindWxaInfoUI
  extends MMActivity
{
  private TextView jtc;
  private ListView jtd;
  private String oxW;
  private String oxX;
  
  public BizBindWxaInfoUI()
  {
    GMTrace.i(6804704591872L, 50699);
    GMTrace.o(6804704591872L, 50699);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6804973027328L, 50701);
    int i = p.g.ivJ;
    GMTrace.o(6804973027328L, 50701);
    return i;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6804838809600L, 50700);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      GMTrace.o(6804838809600L, 50700);
      return;
    }
    this.oxW = getIntent().getStringExtra("extra_username");
    this.oxX = getIntent().getStringExtra("extra_appid");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6773700296704L, 50468);
        BizBindWxaInfoUI.this.finish();
        GMTrace.o(6773700296704L, 50468);
        return false;
      }
    });
    oC(p.i.izb);
    paramBundle = getIntent().getParcelableArrayListExtra("extra_wxa_entry_info_list");
    View localView = getLayoutInflater().inflate(p.g.ivI, null);
    this.jtc = ((TextView)localView.findViewById(p.f.cBx));
    TextView localTextView = this.jtc;
    int j = p.i.iza;
    if (paramBundle != null) {}
    for (int i = paramBundle.size();; i = 0)
    {
      localTextView.setText(getString(j, new Object[] { Integer.valueOf(i) }));
      this.jtd = ((ListView)findViewById(p.f.itW));
      this.jtd.addHeaderView(localView);
      this.jtd.setAdapter(new a(getLayoutInflater(), paramBundle));
      this.jtd.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6791819689984L, 50603);
          paramAnonymousAdapterView = (WxaAttributes.WxaEntryInfo)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt);
          if (paramAnonymousAdapterView == null)
          {
            GMTrace.o(6791819689984L, 50603);
            return;
          }
          paramAnonymousView = new AppBrandStatObject();
          paramAnonymousView.scene = 1020;
          paramAnonymousView.fty = BizBindWxaInfoUI.a(BizBindWxaInfoUI.this);
          ((c)h.h(c.class)).a(BizBindWxaInfoUI.this, paramAnonymousAdapterView.username, null, 0, 0, null, paramAnonymousView, BizBindWxaInfoUI.b(BizBindWxaInfoUI.this));
          GMTrace.o(6791819689984L, 50603);
        }
      });
      GMTrace.o(6804838809600L, 50700);
      return;
    }
  }
  
  private static final class a
    extends BaseAdapter
  {
    private LayoutInflater CO;
    private List<WxaAttributes.WxaEntryInfo> jtf;
    
    public a(LayoutInflater paramLayoutInflater, List<WxaAttributes.WxaEntryInfo> paramList)
    {
      GMTrace.i(6729945317376L, 50142);
      this.CO = paramLayoutInflater;
      this.jtf = new LinkedList();
      if (paramList != null) {
        this.jtf.addAll(paramList);
      }
      GMTrace.o(6729945317376L, 50142);
    }
    
    private WxaAttributes.WxaEntryInfo jz(int paramInt)
    {
      GMTrace.i(19903549538304L, 148293);
      WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)this.jtf.get(paramInt);
      GMTrace.o(19903549538304L, 148293);
      return localWxaEntryInfo;
    }
    
    public final int getCount()
    {
      GMTrace.i(6730079535104L, 50143);
      int i = this.jtf.size();
      GMTrace.o(6730079535104L, 50143);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6730347970560L, 50145);
      long l = paramInt;
      GMTrace.o(6730347970560L, 50145);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6730482188288L, 50146);
      if (paramView == null)
      {
        paramView = this.CO.inflate(p.g.ivf, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.jtg = ((ImageView)paramView.findViewById(p.f.icon));
        paramViewGroup.iin = ((TextView)paramView.findViewById(p.f.iut));
        paramViewGroup.ijo = paramView.findViewById(p.f.divider);
        paramView.setTag(paramViewGroup);
        WxaAttributes.WxaEntryInfo localWxaEntryInfo = jz(paramInt);
        b.CT().a(paramViewGroup.jtg, localWxaEntryInfo.iconUrl, a.CS(), e.hkj);
        paramViewGroup.iin.setText(bg.mY(localWxaEntryInfo.title));
        if (this.jtf != null)
        {
          paramViewGroup = paramViewGroup.ijo;
          if (this.jtf.size() - 1 != paramInt) {
            break label177;
          }
        }
      }
      label177:
      for (paramInt = 8;; paramInt = 0)
      {
        paramViewGroup.setVisibility(paramInt);
        GMTrace.o(6730482188288L, 50146);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
      }
    }
    
    private static final class a
    {
      TextView iin;
      View ijo;
      ImageView jtg;
      
      public a()
      {
        GMTrace.i(6751688589312L, 50304);
        GMTrace.o(6751688589312L, 50304);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */