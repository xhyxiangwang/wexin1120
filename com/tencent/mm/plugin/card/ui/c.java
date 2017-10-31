package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.o;

public final class c
  extends o<CardInfo>
{
  private final String TAG;
  private int count;
  com.tencent.mm.plugin.card.base.c kse;
  private int ktL;
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext, new CardInfo());
    GMTrace.i(4936528035840L, 36780);
    this.TAG = "MicroMsg.CardAdapter";
    this.count = 0;
    this.ktL = paramInt;
    kP(true);
    this.kse = new k(paramContext, this);
    GMTrace.o(4936528035840L, 36780);
  }
  
  public final void QA()
  {
    GMTrace.i(4936662253568L, 36781);
    w.v("MicroMsg.CardAdapter", "resetCursor");
    Cursor localCursor = al.ajC().lv(this.ktL);
    if (localCursor != null)
    {
      this.count = localCursor.getCount();
      w.v("MicroMsg.CardAdapter", "card count:" + this.count);
    }
    setCursor(localCursor);
    notifyDataSetChanged();
    GMTrace.o(4936662253568L, 36781);
  }
  
  protected final void QB()
  {
    GMTrace.i(4936796471296L, 36782);
    aIb();
    QA();
    GMTrace.o(4936796471296L, 36782);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(4936930689024L, 36783);
    paramViewGroup = (CardInfo)getItem(paramInt);
    paramView = this.kse.a(paramInt, paramView, paramViewGroup);
    GMTrace.o(4936930689024L, 36783);
    return paramView;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */