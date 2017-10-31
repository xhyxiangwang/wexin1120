package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public abstract class RecordMsgBaseUI
  extends MMActivity
{
  protected long fxK;
  protected ListView kky;
  protected h oUP;
  
  public RecordMsgBaseUI()
  {
    GMTrace.i(7523306307584L, 56053);
    this.kky = null;
    this.fxK = -1L;
    GMTrace.o(7523306307584L, 56053);
  }
  
  protected final int Qb()
  {
    GMTrace.i(7523574743040L, 56055);
    GMTrace.o(7523574743040L, 56055);
    return 1;
  }
  
  protected void aZm()
  {
    GMTrace.i(7523977396224L, 56058);
    this.oUP = aZn();
    this.fxK = getIntent().getLongExtra("message_id", -1L);
    this.kky = ((ListView)findViewById(R.h.cpS));
    aZu();
    final Object localObject = aZp();
    String str = aZq();
    if ((bg.mZ((String)localObject)) || (bg.mZ(str)))
    {
      w.i("MicroMsg.RecordMsgBaseUI", "subtitle time error!");
      localObject = new View(this.vov.voR);
      ((View)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(R.f.aSl)));
      this.kky.addHeaderView((View)localObject, null, false);
      localObject = View.inflate(this.vov.voR, R.i.del, null);
      this.kky.setAdapter(this.oUP);
      this.oUP.EA = this.kky;
      this.oUP.aZs();
      this.kky.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(7557934481408L, 56311);
          GMTrace.o(7557934481408L, 56311);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(7557800263680L, 56310);
          if (paramAnonymousInt == 0)
          {
            paramAnonymousAbsListView = new rb();
            paramAnonymousAbsListView.fPb.type = 5;
            paramAnonymousAbsListView.fPb.fPc = RecordMsgBaseUI.this.kky.getFirstVisiblePosition();
            paramAnonymousAbsListView.fPb.fPd = RecordMsgBaseUI.this.kky.getLastVisiblePosition();
            paramAnonymousAbsListView.fPb.fPe = RecordMsgBaseUI.this.kky.getHeaderViewsCount();
            com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousAbsListView);
          }
          GMTrace.o(7557800263680L, 56310);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7525722226688L, 56071);
          RecordMsgBaseUI.this.finish();
          GMTrace.o(7525722226688L, 56071);
          return true;
        }
      });
      aZr();
      this.kky.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7527064403968L, 56081);
          View localView = RecordMsgBaseUI.this.kky.getChildAt(RecordMsgBaseUI.this.kky.getLastVisiblePosition());
          if (localView != null)
          {
            int i = localView.getBottom();
            int j = RecordMsgBaseUI.this.kky.getBottom();
            int k = com.tencent.mm.bq.a.fromDPToPix(RecordMsgBaseUI.this.vov.voR, 64);
            w.d("MicroMsg.RecordMsgBaseUI", "lastBotm %s, listBotm %s, listEndmargin %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
            if (i < j - k)
            {
              i = j - i - k;
              w.d("MicroMsg.RecordMsgBaseUI", "offset %d", new Object[] { Integer.valueOf(i) });
              localObject.setPadding(0, i, 0, 0);
            }
          }
          RecordMsgBaseUI.this.kky.addFooterView(localObject, null, false);
          GMTrace.o(7527064403968L, 56081);
        }
      }, 100L);
      GMTrace.o(7523977396224L, 56058);
      return;
    }
    localObject = localObject.split(" ")[0];
    str = str.split(" ")[0];
    if (((String)localObject).equals(str)) {}
    for (this.oUP.oUJ = false;; this.oUP.oUJ = true)
    {
      Uk((String)localObject);
      break;
      localObject = (String)localObject + "~" + str;
    }
  }
  
  protected abstract h aZn();
  
  protected abstract String aZo();
  
  protected abstract String aZp();
  
  protected abstract String aZq();
  
  protected abstract void aZr();
  
  protected final void aZu()
  {
    GMTrace.i(16881234739200L, 125775);
    String str2 = aZo();
    String str3 = this.vov.voR.getString(R.l.dVp);
    String str1 = str2;
    if (str2.endsWith(str3))
    {
      str1 = str2;
      if (str2.lastIndexOf(str3) > 0) {
        str1 = str2.substring(0, str2.lastIndexOf(str3) - 1);
      }
    }
    N(com.tencent.mm.pluginsdk.ui.d.h.c(this.vov.voR, str1, getResources().getDimensionPixelSize(R.f.aRb)));
    GMTrace.o(16881234739200L, 125775);
  }
  
  protected abstract void b(int paramInt1, int paramInt2, Intent paramIntent);
  
  protected final int getLayoutId()
  {
    GMTrace.i(7523440525312L, 56054);
    int i = R.i.dem;
    GMTrace.o(7523440525312L, 56054);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7524514267136L, 56062);
    b(paramInt1, paramInt2, paramIntent);
    GMTrace.o(7524514267136L, 56062);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7523708960768L, 56056);
    e.g(this);
    super.onCreate(paramBundle);
    aZm();
    e.h(this);
    GMTrace.o(7523708960768L, 56056);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7524380049408L, 56061);
    super.onDestroy();
    if (this.oUP != null) {
      this.oUP.destroy();
    }
    GMTrace.o(7524380049408L, 56061);
  }
  
  protected void onPause()
  {
    GMTrace.i(7524245831680L, 56060);
    super.onPause();
    if (this.oUP != null)
    {
      localObject = this.oUP;
      int i = 0;
      while (i < ((h)localObject).oUI.size())
      {
        h.b localb = (h.b)((h)localObject).oUI.valueAt(i);
        if (localb != null) {
          localb.pause();
        }
        i += 1;
      }
    }
    Object localObject = new rb();
    ((rb)localObject).fPb.type = 1;
    com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
    GMTrace.o(7524245831680L, 56060);
  }
  
  protected void onResume()
  {
    GMTrace.i(7524111613952L, 56059);
    super.onResume();
    rb localrb = new rb();
    if (this.kky != null)
    {
      localrb.fPb.type = 0;
      localrb.fPb.fPc = this.kky.getFirstVisiblePosition();
      localrb.fPb.fPd = this.kky.getLastVisiblePosition();
      localrb.fPb.fPe = this.kky.getHeaderViewsCount();
      com.tencent.mm.sdk.b.a.uLm.m(localrb);
    }
    GMTrace.o(7524111613952L, 56059);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordMsgBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */