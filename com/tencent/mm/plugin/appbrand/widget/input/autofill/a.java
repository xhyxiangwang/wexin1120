package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.widget.input.b.a.b;
import com.tencent.mm.plugin.appbrand.widget.input.x;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.List;

final class a
  extends ArrayAdapter<a.b>
  implements g
{
  private final LayoutInflater CO;
  private b jEj;
  h jEk;
  private boolean jEl;
  
  a(Context paramContext, List<a.b> paramList)
  {
    super(paramContext, p.g.ive, paramList);
    GMTrace.i(18262469378048L, 136066);
    this.jEl = false;
    this.CO = LayoutInflater.from(paramContext);
    GMTrace.o(18262469378048L, 136066);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(18262737813504L, 136068);
    this.jEj = paramb;
    this.jEj.setOnDismissListener(new PopupWindow.OnDismissListener()
    {
      public final void onDismiss()
      {
        GMTrace.i(18265690603520L, 136090);
        if ((a.a(a.this) != null) && (!a.b(a.this))) {
          a.a(a.this).a("", h.a.jEV);
        }
        GMTrace.o(18265690603520L, 136090);
      }
    });
    GMTrace.o(18262737813504L, 136068);
  }
  
  public final void acM()
  {
    GMTrace.i(18262872031232L, 136069);
    this.jEj.setOnDismissListener(null);
    this.jEj = null;
    GMTrace.o(18262872031232L, 136069);
  }
  
  public final Filter getFilter()
  {
    GMTrace.i(18263140466688L, 136071);
    Filter localFilter = super.getFilter();
    GMTrace.o(18263140466688L, 136071);
    return localFilter;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int j = 8;
    GMTrace.i(18263006248960L, 136070);
    View localView = paramView;
    if (paramView == null) {
      localView = this.CO.inflate(p.g.ive, paramViewGroup, false);
    }
    paramView = (a)localView.getTag();
    if (paramView == null)
    {
      paramView = new a(localView);
      localView.setTag(paramView);
    }
    for (;;)
    {
      paramViewGroup = (a.b)getItem(paramInt);
      paramView.jEq = paramViewGroup;
      paramView.jEn.setText(paramViewGroup.title);
      paramView.jEo.setText(paramViewGroup.content);
      TextView localTextView = paramView.jEo;
      int i;
      if (bg.mZ(paramViewGroup.content))
      {
        i = 8;
        localTextView.setVisibility(i);
        paramView = paramView.ijo;
        if (paramInt != getCount() - 1) {
          break label166;
        }
      }
      label166:
      for (paramInt = j;; paramInt = 0)
      {
        paramView.setVisibility(paramInt);
        GMTrace.o(18263006248960L, 136070);
        return localView;
        i = 0;
        break;
      }
    }
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(18262603595776L, 136067);
    super.notifyDataSetChanged();
    GMTrace.o(18262603595776L, 136067);
  }
  
  private final class a
    implements View.OnClickListener
  {
    View Vc;
    View ijo;
    TextView jEn;
    TextView jEo;
    View jEp;
    a.b jEq;
    
    a(View paramView)
    {
      GMTrace.i(18257637539840L, 136030);
      this.Vc = paramView;
      this.jEn = ((TextView)paramView.findViewById(p.f.title));
      this.jEo = ((TextView)paramView.findViewById(p.f.content));
      this.jEp = paramView.findViewById(p.f.itC);
      this.ijo = paramView.findViewById(p.f.divider);
      paramView.setBackgroundResource(p.e.bbW);
      paramView.setOnClickListener(this);
      this.jEp.setOnClickListener(this);
      GMTrace.o(18257637539840L, 136030);
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(18257771757568L, 136031);
      if (this.jEq != null) {
        if (paramView.getId() == p.f.itC)
        {
          a.this.remove(this.jEq);
          if (a.a(a.this) != null)
          {
            a.a(a.this).a(this.jEq.id, h.a.jEW);
            GMTrace.o(18257771757568L, 136031);
          }
        }
        else if ((paramView == this.Vc) && (a.a(a.this) != null))
        {
          if (this.jEq != null) {
            a.a(a.this).a(this.jEq.id, h.a.jEX);
          }
          a.c(a.this);
          if (a.d(a.this) != null) {
            a.d(a.this).jEr.getView().clearFocus();
          }
        }
      }
      GMTrace.o(18257771757568L, 136031);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/autofill/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */