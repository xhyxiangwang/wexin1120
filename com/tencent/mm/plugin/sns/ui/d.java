package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.b.b;
import com.tencent.mm.plugin.sns.storage.b.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;
import java.util.List;

public final class d
  extends BaseAdapter
{
  private final Context mContext;
  private String nkl;
  public com.tencent.mm.plugin.sns.data.b qwB;
  
  public d(Context paramContext, com.tencent.mm.plugin.sns.data.b paramb)
  {
    GMTrace.i(20059644755968L, 149456);
    this.qwB = null;
    this.nkl = null;
    this.mContext = paramContext;
    this.qwB = paramb;
    this.nkl = v.eq(ab.getContext());
    GMTrace.o(20059644755968L, 149456);
  }
  
  public final int getCount()
  {
    GMTrace.i(20059778973696L, 149457);
    int i = this.qwB.pYc.qSm.qlD.bis().size();
    GMTrace.o(20059778973696L, 149457);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(20060181626880L, 149460);
    Object localObject = this.qwB.pYc.qSm.qlD.bis().get(paramInt);
    GMTrace.o(20060181626880L, 149460);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(20060047409152L, 149459);
    long l = paramInt;
    GMTrace.o(20060047409152L, 149459);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(20059913191424L, 149458);
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = View.inflate(this.mContext, i.g.pNT, null);
    }
    paramViewGroup.setTag(this.qwB);
    paramView = (b.b.a)getItem(paramInt);
    if ("zh_CN".equals(this.nkl))
    {
      paramView = paramView.qms;
      ((TextView)paramViewGroup.findViewById(i.f.pId)).setText(paramView);
      paramView = paramViewGroup.findViewById(i.f.pIc);
      if (paramInt != getCount() - 1) {
        break label150;
      }
    }
    label150:
    for (paramInt = 8;; paramInt = 0)
    {
      paramView.setVisibility(paramInt);
      GMTrace.o(20059913191424L, 149458);
      return paramViewGroup;
      if (("zh_TW".equals(this.nkl)) || ("zh_HK".equals(this.nkl)))
      {
        paramView = paramView.qmt;
        break;
      }
      paramView = paramView.qmu;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */