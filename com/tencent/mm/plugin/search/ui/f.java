package com.tencent.mm.plugin.search.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.bq.a;
import com.tencent.mm.protocal.c.awm;
import com.tencent.mm.protocal.c.axm;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends LinearLayout
  implements View.OnClickListener
{
  String fIW;
  String iKu;
  private TextView iin;
  private List<View> pmD;
  b pmE;
  List<axm> pmF;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(19510828466176L, 145367);
    this.iin = null;
    this.pmD = new LinkedList();
    this.pmE = null;
    this.fIW = null;
    this.iKu = null;
    this.pmF = null;
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19515257651200L, 145400);
        f.a(f.this);
        GMTrace.o(19515257651200L, 145400);
      }
    });
    GMTrace.o(19510828466176L, 145367);
  }
  
  public final boolean a(awm paramawm, String paramString1, String paramString2)
  {
    GMTrace.i(19511096901632L, 145369);
    if ((paramawm == null) || (paramawm.twQ == null))
    {
      w.w("MicroMsg.FTS.FTSLocalPageRelevantView", "configRelevantDatas param nil!");
      GMTrace.o(19511096901632L, 145369);
      return false;
    }
    Object localObject = paramawm.twQ;
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      axm localaxm = (axm)((Iterator)localObject).next();
      if (!bg.mZ(localaxm.urW)) {
        localLinkedList.add(localaxm);
      }
    }
    if (localLinkedList.size() <= 0)
    {
      w.w("MicroMsg.FTS.FTSLocalPageRelevantView", "configRelevantDatas size 0 items!");
      GMTrace.o(19511096901632L, 145369);
      return false;
    }
    this.fIW = paramString2;
    this.iKu = paramString1;
    this.pmF = paramawm.twQ;
    int j;
    if (this.iin == null)
    {
      this.iin = new TextView(new ContextThemeWrapper(getContext(), R.m.fdk));
      this.iin.setTextSize(15.0F);
      i = a.fromDPToPix(getContext(), 10);
      j = a.fromDPToPix(getContext(), 2);
      this.iin.setPadding(0, i, 0, j);
      addView(this.iin);
    }
    if (!bg.mZ(paramawm.fuw)) {
      this.iin.setText(paramawm.fuw);
    }
    int k;
    for (;;)
    {
      j = (localLinkedList.size() + 1) / 2;
      k = this.pmD.size();
      i = 0;
      while (i < j - k)
      {
        paramawm = View.inflate(getContext(), R.i.cVB, null);
        addView(paramawm);
        this.pmD.add(paramawm);
        paramawm.findViewById(R.h.bUv).setOnClickListener(this);
        paramawm.findViewById(R.h.bUw).setOnClickListener(this);
        i += 1;
      }
      this.iin.setText(R.l.eEQ);
    }
    paramString1 = this.pmD.iterator();
    int i = 0;
    while (paramString1.hasNext())
    {
      paramString2 = (View)paramString1.next();
      if (i < localLinkedList.size())
      {
        j = 0;
        if (j < 2)
        {
          if (i < localLinkedList.size())
          {
            paramawm = new a((axm)localLinkedList.get(i), i + 1);
            label454:
            k = i % 2;
            switch (k)
            {
            default: 
              w.w("MicroMsg.FTS.FTSLocalPageRelevantView", "configItemLinearLayout wrong Index:" + k);
            }
          }
          for (;;)
          {
            i += 1;
            j += 1;
            break;
            paramawm = null;
            break label454;
            k = R.h.bUt;
            for (int m = R.h.bUv;; m = R.h.bUw)
            {
              if (paramawm != null) {
                break label568;
              }
              paramString2.findViewById(k).setVisibility(8);
              break;
              k = R.h.bUu;
            }
            label568:
            paramString2.findViewById(k).setVisibility(0);
            localObject = (TextView)paramString2.findViewById(m);
            ((TextView)localObject).setText(paramawm.pmH.urW);
            ((TextView)localObject).setTag(paramawm);
          }
        }
        paramString2.setVisibility(0);
      }
      else
      {
        paramString2.setVisibility(8);
      }
    }
    requestLayout();
    GMTrace.o(19511096901632L, 145369);
    return true;
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(19510962683904L, 145368);
    if ((this.pmE != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof a)))
    {
      paramView = (a)paramView.getTag();
      this.pmE.a(paramView.pmH, this.iKu, paramView.position);
    }
    GMTrace.o(19510962683904L, 145368);
  }
  
  private final class a
  {
    public axm pmH;
    public int position;
    
    public a(axm paramaxm, int paramInt)
    {
      GMTrace.i(19512573296640L, 145380);
      this.pmH = paramaxm;
      this.position = paramInt;
      GMTrace.o(19512573296640L, 145380);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(axm paramaxm, String paramString, int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */