package com.tencent.mm.plugin.appbrand.ui;

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
import com.tencent.mm.bi.d;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.i;
import com.tencent.mm.plugin.appbrand.widget.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import java.util.LinkedList;
import java.util.List;

public class WxaBindBizInfoUI
  extends DrawStatusBarActivity
{
  private TextView jtc;
  private ListView jtd;
  
  public WxaBindBizInfoUI()
  {
    GMTrace.i(15507650510848L, 115541);
    GMTrace.o(15507650510848L, 115541);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15507918946304L, 115543);
    int i = p.g.ivJ;
    GMTrace.o(15507918946304L, 115543);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15507784728576L, 115542);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(15508187381760L, 115545);
        WxaBindBizInfoUI.this.finish();
        GMTrace.o(15508187381760L, 115545);
        return false;
      }
    });
    oC(p.i.iyu);
    paramBundle = getIntent().getParcelableArrayListExtra("wxa_entry_info_list");
    View localView = getLayoutInflater().inflate(p.g.ivI, null);
    this.jtc = ((TextView)localView.findViewById(p.f.cBx));
    this.jtc.setText(getString(p.i.iyL));
    this.jtd = ((ListView)findViewById(p.f.itW));
    this.jtd.addHeaderView(localView);
    this.jtd.setAdapter(new a(getLayoutInflater(), paramBundle));
    this.jtd.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(15511005954048L, 115566);
        paramAnonymousAdapterView = (WxaAttributes.WxaEntryInfo)paramAnonymousAdapterView.getAdapter().getItem(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          GMTrace.o(15511005954048L, 115566);
          return;
        }
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("Contact_User", paramAnonymousAdapterView.username);
        paramAnonymousView.putExtra("key_start_biz_profile_from_app_brand_profile", true);
        paramAnonymousView.putExtra("force_get_contact", true);
        d.b(WxaBindBizInfoUI.this, "profile", ".ui.ContactInfoUI", paramAnonymousView);
        GMTrace.o(15511005954048L, 115566);
      }
    });
    i.d(this.vov.iiK, getStatusBarColor(), false);
    GMTrace.o(15507784728576L, 115542);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private LayoutInflater CO;
    private final List<WxaAttributes.WxaEntryInfo> jtf;
    
    public a(LayoutInflater paramLayoutInflater, List<WxaAttributes.WxaEntryInfo> paramList)
    {
      GMTrace.i(15525635686400L, 115675);
      this.CO = paramLayoutInflater;
      this.jtf = new LinkedList();
      if (paramList != null) {
        this.jtf.addAll(paramList);
      }
      GMTrace.o(15525635686400L, 115675);
    }
    
    private WxaAttributes.WxaEntryInfo jz(int paramInt)
    {
      GMTrace.i(17303483711488L, 128921);
      WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)this.jtf.get(paramInt);
      GMTrace.o(17303483711488L, 128921);
      return localWxaEntryInfo;
    }
    
    public final int getCount()
    {
      GMTrace.i(15525769904128L, 115676);
      int i = this.jtf.size();
      GMTrace.o(15525769904128L, 115676);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(15526038339584L, 115678);
      long l = paramInt;
      GMTrace.o(15526038339584L, 115678);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(15526172557312L, 115679);
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
        paramViewGroup = paramViewGroup.ijo;
        if (this.jtf.size() - 1 != paramInt) {
          break label170;
        }
      }
      label170:
      for (paramInt = 8;; paramInt = 0)
      {
        paramViewGroup.setVisibility(paramInt);
        GMTrace.o(15526172557312L, 115679);
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
        GMTrace.i(15509529559040L, 115555);
        GMTrace.o(15509529559040L, 115555);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/WxaBindBizInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */