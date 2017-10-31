package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.game.model.l.b;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.w;

public class GameRankHeadView
  extends LinearLayout
  implements View.OnClickListener
{
  TextView jaE;
  com.tencent.mm.plugin.game.model.c mBO;
  TextView mJP;
  l.b mKr;
  m mKt;
  TextView mOO;
  private ImageView mOP;
  
  public GameRankHeadView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12666395426816L, 94372);
    GMTrace.o(12666395426816L, 94372);
  }
  
  final void aFI()
  {
    GMTrace.i(12666663862272L, 94374);
    if (g.a(getContext(), this.mBO))
    {
      int i = com.tencent.mm.plugin.game.d.c.zp(this.mBO.field_packageName);
      if (this.mBO.versionCode > i)
      {
        this.mJP.setText(R.l.ecZ);
        GMTrace.o(12666663862272L, 94374);
        return;
      }
      this.mJP.setText(R.l.ecX);
      GMTrace.o(12666663862272L, 94374);
      return;
    }
    switch (this.mBO.status)
    {
    default: 
      this.mJP.setText(R.l.ecU);
      GMTrace.o(12666663862272L, 94374);
      return;
    }
    if (this.mKt == null)
    {
      this.mJP.setVisibility(8);
      this.mOP.setVisibility(8);
      GMTrace.o(12666663862272L, 94374);
      return;
    }
    this.mJP.setVisibility(0);
    this.mOP.setVisibility(0);
    switch (this.mKt.status)
    {
    }
    for (;;)
    {
      GMTrace.o(12666663862272L, 94374);
      return;
      this.mJP.setText(R.l.ecU);
      GMTrace.o(12666663862272L, 94374);
      return;
      this.mJP.setText(R.l.ecV);
      GMTrace.o(12666663862272L, 94374);
      return;
      this.mJP.setText(R.l.ecT);
      GMTrace.o(12666663862272L, 94374);
      return;
      this.mJP.setText(R.l.ecW);
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12666798080000L, 94375);
    paramView = new e(getContext());
    m localm = new m(this.mBO);
    paramView.a(this.mBO, localm);
    GMTrace.o(12666798080000L, 94375);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12666529644544L, 94373);
    super.onFinishInflate();
    this.jaE = ((TextView)findViewById(R.h.bMl));
    this.mOO = ((TextView)findViewById(R.h.bLX));
    this.mJP = ((TextView)findViewById(R.h.bMk));
    this.mOP = ((ImageView)findViewById(R.h.bNa));
    w.i("MicroMsg.GameRankHeadView", "initView finished");
    GMTrace.o(12666529644544L, 94373);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameRankHeadView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */