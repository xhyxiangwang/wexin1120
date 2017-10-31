package com.tencent.mm.ui.fts.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public class FTSMainUIHotWordLayout
  extends LinearLayout
{
  private TextView iiM;
  protected View.OnClickListener pnn;
  protected List<LinearLayout> wGk;
  protected int wGr;
  protected boolean wGs;
  public b wGt;
  
  public FTSMainUIHotWordLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17921959002112L, 133529);
    this.wGk = null;
    this.wGr = 2;
    this.wGs = true;
    this.iiM = null;
    this.wGt = null;
    MH();
    GMTrace.o(17921959002112L, 133529);
  }
  
  public FTSMainUIHotWordLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(17922093219840L, 133530);
    this.wGk = null;
    this.wGr = 2;
    this.wGs = true;
    this.iiM = null;
    this.wGt = null;
    MH();
    GMTrace.o(17922093219840L, 133530);
  }
  
  private void MH()
  {
    GMTrace.i(17922227437568L, 133531);
    setOrientation(1);
    this.wGk = new ArrayList();
    GMTrace.o(17922227437568L, 133531);
  }
  
  public final String ceH()
  {
    GMTrace.i(17922764308480L, 133535);
    if ((this.wGt != null) && (this.wGt.iKu != null))
    {
      String str = this.wGt.iKu;
      GMTrace.o(17922764308480L, 133535);
      return str;
    }
    GMTrace.o(17922764308480L, 133535);
    return "";
  }
  
  public final void i(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(17922630090752L, 133534);
    this.pnn = paramOnClickListener;
    GMTrace.o(17922630090752L, 133534);
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(17922898526208L, 133536);
    int i;
    if (this.wGk.size() > 0)
    {
      i = 1;
      if (i == 0) {
        break label45;
      }
    }
    for (;;)
    {
      super.setVisibility(paramInt);
      GMTrace.o(17922898526208L, 133536);
      return;
      i = 0;
      break;
      label45:
      paramInt = 8;
    }
  }
  
  public static final class a
  {
    public int fKZ;
    public String jumpUrl;
    public String wGu;
    public int wGv;
  }
  
  private static final class b
  {
    public String iKu;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/ui/fts/widget/FTSMainUIHotWordLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */