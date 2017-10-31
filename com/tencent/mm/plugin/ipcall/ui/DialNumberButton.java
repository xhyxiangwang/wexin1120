package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.util.d;

public class DialNumberButton
  extends RelativeLayout
{
  TextView naC;
  TextView naD;
  private boolean naE;
  
  public DialNumberButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11700296220672L, 87174);
    this.naE = false;
    LayoutInflater.from(getContext()).inflate(R.i.cRN, this);
    this.naC = ((TextView)findViewById(R.h.bBv));
    this.naD = ((TextView)findViewById(R.h.bBw));
    if (d.et(16))
    {
      this.naC.setTypeface(Typeface.create("sans-serif-light", 0));
      this.naD.setTypeface(Typeface.create("sans-serif-normal", 0));
    }
    setClipChildren(false);
    setClipToPadding(false);
    GMTrace.o(11700296220672L, 87174);
  }
  
  public final String aHX()
  {
    GMTrace.i(11700430438400L, 87175);
    String str = this.naC.getText().toString();
    GMTrace.o(11700430438400L, 87175);
    return str;
  }
  
  public final String aHY()
  {
    GMTrace.i(11700564656128L, 87176);
    String str = this.naD.getText().toString();
    GMTrace.o(11700564656128L, 87176);
    return str;
  }
  
  public final void fu(boolean paramBoolean)
  {
    GMTrace.i(11700698873856L, 87177);
    this.naE = paramBoolean;
    if (this.naE)
    {
      if (("#".equals(this.naC.getText())) || ("*".equals(this.naC.getText()))) {
        this.naC.setTextColor(getContext().getResources().getColor(R.e.aNZ));
      }
      for (;;)
      {
        this.naD.setTextColor(getContext().getResources().getColor(R.e.aNZ));
        setBackgroundDrawable(getResources().getDrawable(R.g.aYk));
        GMTrace.o(11700698873856L, 87177);
        return;
        this.naC.setTextColor(getContext().getResources().getColor(R.e.aOb));
      }
    }
    if (("#".equals(this.naC.getText())) || ("*".equals(this.naC.getText()))) {
      this.naC.setTextColor(getContext().getResources().getColor(R.e.aNZ));
    }
    for (;;)
    {
      this.naD.setTextColor(getContext().getResources().getColor(R.e.aNZ));
      setBackgroundDrawable(getResources().getDrawable(R.g.aYl));
      GMTrace.o(11700698873856L, 87177);
      return;
      this.naC.setTextColor(getContext().getResources().getColor(R.e.aOa));
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/DialNumberButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */