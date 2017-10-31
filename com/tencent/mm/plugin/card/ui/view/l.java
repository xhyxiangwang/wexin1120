package com.tencent.mm.plugin.card.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.nc;
import com.tencent.mm.protocal.c.pe;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public final class l
  extends i
{
  public View kzT;
  public LinearLayout kzU;
  public boolean kzV;
  
  public l()
  {
    GMTrace.i(4998536626176L, 37242);
    this.kzV = false;
    GMTrace.o(4998536626176L, 37242);
  }
  
  public final void MH()
  {
    GMTrace.i(4998670843904L, 37243);
    GMTrace.o(4998670843904L, 37243);
  }
  
  public final void amb()
  {
    GMTrace.i(4998939279360L, 37245);
    if (this.kzT != null) {
      this.kzT.setVisibility(8);
    }
    GMTrace.o(4998939279360L, 37245);
  }
  
  public final void update()
  {
    GMTrace.i(4998805061632L, 37244);
    if (this.kzT == null) {
      this.kzT = ((ViewStub)findViewById(R.h.bpB)).inflate();
    }
    final Object localObject = this.kzR.akL().aiL().tED;
    ((TextView)this.kzT.findViewById(R.h.bBh)).setText(((pe)localObject).title);
    if ((((pe)localObject).tKY != null) && (((pe)localObject).tKY.size() > 0))
    {
      this.kzU = ((LinearLayout)this.kzT.findViewById(R.h.bBg));
      this.kzU.removeAllViews();
      final LinkedList localLinkedList = ((pe)localObject).tKY;
      final LayoutInflater localLayoutInflater = (LayoutInflater)this.kzR.akO().getSystemService("layout_inflater");
      if ((((pe)localObject).tKX >= localLinkedList.size()) || (this.kzV))
      {
        this.kzT.findViewById(R.h.bBf).setVisibility(8);
        i = 0;
        while (i < localLinkedList.size())
        {
          localObject = (TextView)localLayoutInflater.inflate(R.i.cON, null, false);
          ((TextView)localObject).setText(((nc)localLinkedList.get(i)).title);
          this.kzU.addView((View)localObject);
          i += 1;
        }
        this.kzU.invalidate();
        GMTrace.o(4998805061632L, 37244);
        return;
      }
      int i = 0;
      while (i < ((pe)localObject).tKX)
      {
        TextView localTextView = (TextView)localLayoutInflater.inflate(R.i.cON, null, false);
        localTextView.setText(((nc)localLinkedList.get(i)).title);
        this.kzU.addView(localTextView);
        i += 1;
      }
      this.kzU.invalidate();
      this.kzT.findViewById(R.h.bBf).setVisibility(0);
      this.kzT.findViewById(R.h.bBf).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4999476150272L, 37249);
          l.this.kzV = true;
          l.this.kzT.findViewById(R.h.bBf).setVisibility(8);
          int i = localObject.tKX;
          while (i < localLinkedList.size())
          {
            paramAnonymousView = (TextView)localLayoutInflater.inflate(R.i.cON, null, false);
            paramAnonymousView.setText(((nc)localLinkedList.get(i)).title);
            l.this.kzU.addView(paramAnonymousView);
            i += 1;
          }
          l.this.kzU.invalidate();
          GMTrace.o(4999476150272L, 37249);
        }
      });
    }
    GMTrace.o(4998805061632L, 37244);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */