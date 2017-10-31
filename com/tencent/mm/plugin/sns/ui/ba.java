package com.tencent.mm.plugin.sns.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import java.util.HashMap;
import java.util.List;

public final class ba
  implements AdapterView.OnItemClickListener
{
  public LayoutInflater CO;
  private Context mContext;
  private l qQR;
  o.c qQS;
  o.d qQT;
  public m qQU;
  private a qQV;
  public HashMap<Integer, CharSequence> qQW;
  public HashMap<Integer, Integer> qQX;
  
  public ba(Context paramContext)
  {
    GMTrace.i(8721602183168L, 64981);
    this.qQW = new HashMap();
    this.qQX = new HashMap();
    this.mContext = paramContext;
    this.CO = LayoutInflater.from(paramContext);
    this.qQR = new l(paramContext);
    this.qQU = new m();
    GMTrace.o(8721602183168L, 64981);
  }
  
  private void dismiss()
  {
    GMTrace.i(8722004836352L, 64984);
    if (this.qQR.isShowing()) {
      this.qQR.dismiss();
    }
    GMTrace.o(8722004836352L, 64984);
  }
  
  public final Dialog bnM()
  {
    GMTrace.i(8722139054080L, 64985);
    if (this.qQS != null)
    {
      this.qQU.clear();
      this.qQU = new m();
      this.qQS.a(this.qQU);
    }
    if (this.qQU.bXg())
    {
      w.w("MicroMsg.SnsTimelineListMenu", "show, menu empty");
      GMTrace.o(8722139054080L, 64985);
      return null;
    }
    if (this.qQV == null) {
      this.qQV = new a((byte)0);
    }
    this.qQR.ksR = this.qQV;
    this.qQR.tld = this;
    this.qQR.setTitle(this.qQU.Kv);
    this.qQR.show();
    l locall = this.qQR;
    GMTrace.o(8722139054080L, 64985);
    return locall;
  }
  
  public final void c(int paramInt, CharSequence paramCharSequence)
  {
    GMTrace.i(8721736400896L, 64982);
    this.qQW.put(Integer.valueOf(paramInt), paramCharSequence);
    GMTrace.o(8721736400896L, 64982);
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(8721870618624L, 64983);
    paramAdapterView = (n)this.qQU.vHt.get(paramInt);
    if (paramAdapterView.performClick())
    {
      w.i("MicroMsg.SnsTimelineListMenu", "onItemClick menu item has listener");
      dismiss();
      GMTrace.o(8721870618624L, 64983);
      return;
    }
    if (this.qQT != null) {
      this.qQT.c(paramAdapterView, paramInt);
    }
    dismiss();
    GMTrace.o(8721870618624L, 64983);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(8366596292608L, 62336);
      GMTrace.o(8366596292608L, 62336);
    }
    
    public final int getCount()
    {
      GMTrace.i(8366730510336L, 62337);
      int i = ba.this.qQU.size();
      GMTrace.o(8366730510336L, 62337);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(8366864728064L, 62338);
      GMTrace.o(8366864728064L, 62338);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8366998945792L, 62339);
      GMTrace.o(8366998945792L, 62339);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8367133163520L, 62340);
      MenuItem localMenuItem;
      if (paramView == null)
      {
        paramView = ba.this.CO.inflate(i.g.pPH, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.jaE = ((TextView)paramView.findViewById(i.f.title));
        paramViewGroup.qQZ = ((TextView)paramView.findViewById(i.f.pKR));
        paramView.setTag(paramViewGroup);
        localMenuItem = ba.this.qQU.getItem(paramInt);
        paramViewGroup.jaE.setText(localMenuItem.getTitle());
        if (ba.this.qQW.get(Integer.valueOf(localMenuItem.getItemId())) == null) {
          break label235;
        }
        paramViewGroup.qQZ.setText((CharSequence)ba.this.qQW.get(Integer.valueOf(localMenuItem.getItemId())));
        paramViewGroup.qQZ.setVisibility(0);
      }
      for (;;)
      {
        if (ba.this.qQX.get(Integer.valueOf(localMenuItem.getItemId())) != null) {
          paramViewGroup.qQZ.setTextColor(((Integer)ba.this.qQX.get(Integer.valueOf(localMenuItem.getItemId()))).intValue());
        }
        GMTrace.o(8367133163520L, 62340);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label235:
        paramViewGroup.qQZ.setVisibility(4);
      }
    }
    
    private final class a
    {
      TextView jaE;
      TextView qQZ;
      
      public a()
      {
        GMTrace.i(8723078578176L, 64992);
        GMTrace.o(8723078578176L, 64992);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */