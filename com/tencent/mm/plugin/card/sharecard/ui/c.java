package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.k;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.o;

public final class c
  extends o<ShareCardInfo>
{
  private final String TAG;
  long beginTime;
  long endTime;
  private int ksd;
  com.tencent.mm.plugin.card.base.c kse;
  int ksf;
  
  public c(Context paramContext)
  {
    super(paramContext, new ShareCardInfo());
    GMTrace.i(5075711819776L, 37817);
    this.TAG = "MicroMsg.ShareCardAdatper";
    this.ksd = 0;
    this.ksf = -1;
    this.beginTime = 0L;
    this.endTime = 0L;
    kP(true);
    this.kse = new j(paramContext, this);
    GMTrace.o(5075711819776L, 37817);
  }
  
  public final void QA()
  {
    GMTrace.i(5075980255232L, 37819);
    this.beginTime = System.currentTimeMillis();
    Object localObject1;
    int i;
    Object localObject2;
    if (this.ksf == -1)
    {
      localObject1 = al.ajK();
      i = n.a.kpj;
      localObject2 = new StringBuilder();
      switch (com.tencent.mm.plugin.card.sharecard.model.k.1.koA[(i - 1)])
      {
      default: 
        localObject2 = "select * from ShareCardInfo" + ((StringBuilder)localObject2).toString() + " order by status asc , share_time" + " desc";
        localObject1 = ((k)localObject1).gMB.rawQuery((String)localObject2, null);
        if (localObject1 != null)
        {
          this.ksd = ((Cursor)localObject1).getCount();
          w.i("MicroMsg.ShareCardAdatper", "resetCursor showType %s, card count:%s", new Object[] { Integer.valueOf(this.ksf), Integer.valueOf(this.ksd) });
        }
        break;
      }
    }
    for (;;)
    {
      setCursor((Cursor)localObject1);
      this.endTime = System.currentTimeMillis();
      notifyDataSetChanged();
      GMTrace.o(5075980255232L, 37819);
      return;
      ((StringBuilder)localObject2).append(" where (status=0 OR ").append("status=5)");
      break;
      ((StringBuilder)localObject2).append(" where (status=1 OR ").append("status=2 OR status").append("=3 OR status=4").append(" OR status=6)");
      break;
      ((StringBuilder)localObject2).append(" where (status=0 OR ").append("status=5) and (block_mask").append("= '1' OR block_mask= '0' ").append(")");
      break;
      k localk = al.ajK();
      i = this.ksf;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(" where ( status=0) ");
      localObject2 = "";
      localObject1 = localObject2;
      switch (i)
      {
      default: 
        localObject1 = localObject2;
      }
      for (;;)
      {
        localObject1 = "select * from ShareCardInfo" + localStringBuilder.toString() + (String)localObject1;
        localObject1 = localk.gMB.rawQuery((String)localObject1, null);
        break;
        localStringBuilder.append(" AND (");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.lz(1));
        localStringBuilder.append(" categoryType= '10' ");
        localStringBuilder.append(") ");
        localStringBuilder.append(" OR (");
        localStringBuilder.append(k.lz(2));
        localStringBuilder.append(" categoryType= '0' ");
        localStringBuilder.append(") ");
        localStringBuilder.append(" )");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND ");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.lz(1));
        localStringBuilder.append(" categoryType= '10' ");
        localStringBuilder.append(") ");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND ");
        localStringBuilder.append(" (");
        localStringBuilder.append(k.lz(2));
        localStringBuilder.append(" categoryType= '0' ");
        localStringBuilder.append(") ");
        localObject1 = " order by categoryType desc , itemIndex asc";
        continue;
        localStringBuilder.append(" AND 1 != 1 ");
        localObject1 = localObject2;
      }
      w.e("MicroMsg.ShareCardAdatper", "resetCursor cursor is null, showType %s", new Object[] { Integer.valueOf(this.ksf) });
    }
  }
  
  protected final void QB()
  {
    GMTrace.i(5076114472960L, 37820);
    aIb();
    QA();
    GMTrace.o(5076114472960L, 37820);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5075846037504L, 37818);
    paramViewGroup = (ShareCardInfo)getItem(paramInt);
    paramView = this.kse.a(paramInt, paramView, paramViewGroup);
    GMTrace.o(5075846037504L, 37818);
    return paramView;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */