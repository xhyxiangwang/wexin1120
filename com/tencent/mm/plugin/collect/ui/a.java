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
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class a
  extends BaseAdapter
{
  List<com.tencent.mm.plugin.collect.b.a> kMS;
  private Context mContext;
  
  public a(Context paramContext)
  {
    GMTrace.i(5425617436672L, 40424);
    this.kMS = new ArrayList();
    this.mContext = paramContext;
    GMTrace.o(5425617436672L, 40424);
  }
  
  public final int getCount()
  {
    GMTrace.i(5425751654400L, 40425);
    int i = this.kMS.size();
    GMTrace.o(5425751654400L, 40425);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(5425885872128L, 40426);
    Object localObject = this.kMS.get(paramInt);
    GMTrace.o(5425885872128L, 40426);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(5426020089856L, 40427);
    long l = paramInt;
    GMTrace.o(5426020089856L, 40427);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5426154307584L, 40428);
    View localView = paramView;
    if (paramView == null)
    {
      localView = v.fa(this.mContext).inflate(R.i.cQH, paramViewGroup, false);
      localView.setTag(new a(localView));
    }
    paramView = (com.tencent.mm.plugin.collect.b.a)this.kMS.get(paramInt);
    paramViewGroup = (a)localView.getTag();
    TextView localTextView = paramViewGroup.kMT;
    Context localContext = this.mContext;
    long l = paramView.timestamp;
    localTextView.setText(new SimpleDateFormat(localContext.getString(R.l.dKN)).format(new Date(l * 1000L)));
    paramViewGroup.kMU.setText(e.mb(paramView.bHM));
    if (!bg.mZ(paramView.desc))
    {
      paramViewGroup.kLX.setText(paramView.desc);
      paramViewGroup.kLX.setVisibility(0);
    }
    for (;;)
    {
      GMTrace.o(5426154307584L, 40428);
      return localView;
      paramViewGroup.kLX.setVisibility(8);
    }
  }
  
  private static final class a
  {
    TextView kLX;
    TextView kMT;
    WalletTextView kMU;
    
    public a(View paramView)
    {
      GMTrace.i(5416893284352L, 40359);
      this.kMT = ((TextView)paramView.findViewById(R.h.bvN));
      this.kMU = ((WalletTextView)paramView.findViewById(R.h.bwe));
      this.kLX = ((TextView)paramView.findViewById(R.h.bvO));
      GMTrace.o(5416893284352L, 40359);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */