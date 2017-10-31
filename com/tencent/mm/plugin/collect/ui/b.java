package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.collect.b.e;
import com.tencent.mm.plugin.collect.b.h;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.ArrayList;
import java.util.List;

public final class b
  extends BaseAdapter
{
  List<h> kMS;
  private Context mContext;
  
  public b(Context paramContext)
  {
    GMTrace.i(5427093831680L, 40435);
    this.kMS = new ArrayList();
    this.mContext = paramContext;
    GMTrace.o(5427093831680L, 40435);
  }
  
  public final void aj(List<h> paramList)
  {
    GMTrace.i(5427764920320L, 40440);
    this.kMS.clear();
    this.kMS.addAll(paramList);
    notifyDataSetChanged();
    GMTrace.o(5427764920320L, 40440);
  }
  
  public final void ak(List<h> paramList)
  {
    GMTrace.i(5427899138048L, 40441);
    this.kMS.addAll(paramList);
    notifyDataSetChanged();
    GMTrace.o(5427899138048L, 40441);
  }
  
  public final int getCount()
  {
    GMTrace.i(5427228049408L, 40436);
    int i = this.kMS.size();
    GMTrace.o(5427228049408L, 40436);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(5427496484864L, 40438);
    long l = paramInt;
    GMTrace.o(5427496484864L, 40438);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5427630702592L, 40439);
    View localView = paramView;
    if (paramView == null)
    {
      localView = v.fa(this.mContext).inflate(R.i.cQJ, paramViewGroup, false);
      localView.setTag(new a(localView));
    }
    paramView = (a)localView.getTag();
    paramViewGroup = mc(paramInt);
    paramView.kMT.setText(e.a(this.mContext, paramViewGroup.kKr, paramViewGroup.type));
    paramView.kMU.setText(e.mb(paramViewGroup.kKt));
    paramView.kLX.setText(this.mContext.getString(R.l.dKV, new Object[] { Integer.valueOf(paramViewGroup.kKs) }));
    GMTrace.o(5427630702592L, 40439);
    return localView;
  }
  
  public final h mc(int paramInt)
  {
    GMTrace.i(5427362267136L, 40437);
    h localh = (h)this.kMS.get(paramInt);
    GMTrace.o(5427362267136L, 40437);
    return localh;
  }
  
  private static final class a
  {
    TextView kLX;
    TextView kMT;
    WalletTextView kMU;
    TextView kMV;
    
    public a(View paramView)
    {
      GMTrace.i(5428167573504L, 40443);
      this.kMT = ((TextView)paramView.findViewById(R.h.bvW));
      this.kMV = ((TextView)paramView.findViewById(R.h.bvV));
      this.kMU = ((WalletTextView)paramView.findViewById(R.h.bwb));
      this.kLX = ((TextView)paramView.findViewById(R.h.bvX));
      GMTrace.o(5428167573504L, 40443);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */