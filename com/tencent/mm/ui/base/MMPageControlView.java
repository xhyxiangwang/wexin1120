package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.u.a.g;
import com.tencent.mm.u.a.h;
import java.util.HashMap;
import java.util.Map;

public class MMPageControlView
  extends LinearLayout
{
  public Context context;
  public int count;
  public ImageView fBd;
  public Map<Integer, ImageView> map;
  public int vHy;
  
  public MMPageControlView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(3201763901440L, 23855);
    this.map = new HashMap();
    this.vHy = a.h.gYg;
    this.context = paramContext;
    GMTrace.o(3201763901440L, 23855);
  }
  
  public MMPageControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3201898119168L, 23856);
    this.map = new HashMap();
    this.vHy = a.h.gYg;
    this.context = paramContext;
    GMTrace.o(3201898119168L, 23856);
  }
  
  public final void ei(int paramInt1, int paramInt2)
  {
    GMTrace.i(3201629683712L, 23854);
    this.count = paramInt1;
    uv(paramInt2);
    GMTrace.o(3201629683712L, 23854);
  }
  
  public void uv(int paramInt)
  {
    GMTrace.i(3202032336896L, 23857);
    removeAllViews();
    if (paramInt >= this.count)
    {
      GMTrace.o(3202032336896L, 23857);
      return;
    }
    int j = this.count;
    int i = 0;
    if (i < j)
    {
      this.fBd = null;
      if (paramInt == i)
      {
        if (this.map.size() > i) {
          this.fBd = ((ImageView)this.map.get(Integer.valueOf(i)));
        }
        if (this.fBd == null)
        {
          this.fBd = ((ImageView)View.inflate(this.context, this.vHy, null).findViewById(a.g.gVZ));
          this.map.put(Integer.valueOf(i), this.fBd);
        }
        this.fBd.setSelected(true);
      }
      for (;;)
      {
        if (i == 0) {
          this.fBd.setPadding(0, 0, 0, 0);
        }
        addView(this.fBd);
        i += 1;
        break;
        if (this.map.size() > i) {
          this.fBd = ((ImageView)this.map.get(Integer.valueOf(i)));
        }
        if (this.fBd == null)
        {
          this.fBd = ((ImageView)View.inflate(this.context, this.vHy, null).findViewById(a.g.gVZ));
          this.map.put(Integer.valueOf(i), this.fBd);
        }
        this.fBd.setSelected(false);
      }
    }
    GMTrace.o(3202032336896L, 23857);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/base/MMPageControlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */