package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.u.a.g;
import com.tencent.mm.u.a.h;

public final class a
  extends LinearLayout
{
  private View npW;
  public FTSEditTextView wGw;
  public a wGx;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(16797214441472L, 125149);
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(a.h.gXp, this, true);
    this.npW = findViewById(a.g.bfR);
    this.npW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16797080223744L, 125148);
        if (a.a(a.this) != null) {
          a.a(a.this).bbY();
        }
        GMTrace.o(16797080223744L, 125148);
      }
    });
    this.wGw = ((FTSEditTextView)findViewById(a.g.bKI));
    GMTrace.o(16797214441472L, 125149);
  }
  
  public static abstract interface a
  {
    public abstract void bbY();
  }
  
  public static abstract interface b
    extends Comparable
  {
    public abstract String getTagName();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/fts/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */