package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class bi
{
  public ListView nep;
  int position;
  public int qHs;
  public int qIH;
  int qSM;
  int qSN;
  public int qSO;
  boolean qSP;
  public int qSQ;
  protected long qSR;
  Runnable qSS;
  Runnable qST;
  Runnable qSU;
  public SnsCommentFooter qxN;
  
  public bi(ListView paramListView, SnsCommentFooter paramSnsCommentFooter)
  {
    GMTrace.i(8395587321856L, 62552);
    this.position = -1;
    this.qSM = -1;
    this.qSN = -1;
    this.qHs = -1;
    this.qSO = 0;
    this.qIH = -1;
    this.qSP = false;
    this.qSS = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8430081277952L, 62809);
        if ((bi.this.nep != null) && (bi.this.nep.getCount() > bi.this.position))
        {
          int j = bi.this.qxN.getTop();
          w.d("MicroMsg.TimeLineScrollAnimation", "limitCount: " + bi.this.qSQ + " footerHeight:" + bi.this.qxN.getHeight() + " listOriginalBottom: " + bi.this.qHs);
          bi localbi = bi.this;
          int i = localbi.qSQ;
          localbi.qSQ = (i - 1);
          if ((i > 0) && ((bi.this.qIH != j) || (j > bi.this.qHs - 200) || (bi.this.nep.getBottom() > bi.this.qHs - bi.this.qxN.getHeight() - 150)))
          {
            i = 10;
            if (bi.this.qSQ == 0) {
              i = 200;
            }
            new ae().postDelayed(this, i);
          }
          bi.this.qIH = j;
          i = bi.this.qIH - bi.this.qSO - bi.this.qSM;
          w.d("MicroMsg.TimeLineScrollAnimation", "itemH:" + bi.this.qSM + " footerTop" + bi.this.qIH + " list.bottom:" + bi.this.nep.getBottom() + " position: " + bi.this.position + " topselection: " + i);
          w.d("MicroMsg.TimeLineScrollAnimation", "list.getTop(): " + bi.this.nep.getTop() + " marginTop: " + bi.this.qSO + " footerTop " + bi.this.qIH);
          bi.this.nep.setSelectionFromTop(bi.this.position + bi.this.nep.getHeaderViewsCount(), i);
        }
        GMTrace.o(8430081277952L, 62809);
      }
    };
    this.qST = new Runnable()
    {
      int offset;
      
      public final void run()
      {
        GMTrace.i(8400284942336L, 62587);
        if ((bi.this.nep != null) && (bi.this.nep.getCount() > bi.this.position))
        {
          bi.this.qIH = bi.this.qxN.getTop();
          int i = bi.this.qIH - bi.this.qSO - bi.this.qSM;
          w.d("MicroMsg.TimeLineScrollAnimation", "itemH:" + bi.this.qSM + " footerTop" + bi.this.qIH + " list.bottom:" + bi.this.nep.getBottom() + " position: " + bi.this.position + " topselection: " + i);
          w.d("MicroMsg.TimeLineScrollAnimation", "list.getTop(): " + bi.this.nep.getTop() + " marginTop: " + bi.this.qSO + " footerTop " + bi.this.qIH);
          if (i == this.offset)
          {
            bi.this.nep.setSelectionFromTop(bi.this.position + bi.this.nep.getHeaderViewsCount(), i);
            this.offset = 0;
            bi.this.qSQ = 0;
            GMTrace.o(8400284942336L, 62587);
            return;
          }
          bi localbi = bi.this;
          int j = localbi.qSQ;
          localbi.qSQ = (j - 1);
          if (j > 0)
          {
            new ae().postDelayed(this, 100L);
            this.offset = i;
            GMTrace.o(8400284942336L, 62587);
            return;
          }
          this.offset = 0;
          bi.this.qSQ = 0;
        }
        GMTrace.o(8400284942336L, 62587);
      }
    };
    this.qSU = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8621073104896L, 64232);
        w.d("MicroMsg.TimeLineScrollAnimation", "originalTop:" + bi.this.qSN + " position:" + bi.this.position + " list.bottom:" + bi.this.nep.getBottom());
        GMTrace.o(8621073104896L, 64232);
      }
    };
    this.nep = paramListView;
    this.qxN = paramSnsCommentFooter;
    GMTrace.o(8395587321856L, 62552);
  }
  
  public final void bnY()
  {
    GMTrace.i(8395721539584L, 62553);
    this.qSP = true;
    new ae().postDelayed(this.qSS, 30L);
    this.qSQ = 10;
    w.e("MicroMsg.TimeLineScrollAnimation", "footerTop when up :" + this.qxN.getTop());
    this.qSR = bg.Pq();
    GMTrace.o(8395721539584L, 62553);
  }
  
  public final void bnZ()
  {
    GMTrace.i(8395855757312L, 62554);
    this.qSP = true;
    this.qSQ = 20;
    new ae().postDelayed(this.qST, 100L);
    GMTrace.o(8395855757312L, 62554);
  }
  
  public final void boa()
  {
    GMTrace.i(8395989975040L, 62555);
    if (this.qSP)
    {
      this.qSP = false;
      new ae().postDelayed(this.qSU, 30L);
      this.qSQ = 10;
    }
    GMTrace.o(8395989975040L, 62555);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */