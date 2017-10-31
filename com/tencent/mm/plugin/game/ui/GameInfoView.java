package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.SubCoreGameCenter;
import com.tencent.mm.plugin.game.model.a;
import com.tencent.mm.plugin.game.model.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.u;
import com.tencent.mm.sdk.platformtools.w;

public class GameInfoView
  extends RelativeLayout
  implements View.OnClickListener
{
  private int gCX;
  int mBs;
  Context mContext;
  FrameLayout mLU;
  ImageView mLV;
  private TextView mLW;
  FrameLayout mLX;
  ImageView mLY;
  ImageView mLZ;
  ImageView mMa;
  RelativeLayout mMb;
  ImageView mMc;
  TextView mMd;
  ImageView mMe;
  String mMf;
  String mMg;
  String mMh;
  ImageView mMi;
  String mMj;
  private int mMk;
  private int mMl;
  private int mMm;
  int mMn;
  String mMo;
  
  public GameInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12771622125568L, 95156);
    this.mMf = "";
    this.mMg = "";
    this.mMh = "";
    this.mBs = 0;
    this.gCX = 0;
    this.mMj = "";
    this.mMk = 1;
    this.mMl = 2;
    this.mMm = 3;
    this.mMn = 4;
    this.mContext = paramContext;
    GMTrace.o(12771622125568L, 95156);
  }
  
  public final void aFz()
  {
    GMTrace.i(12771890561024L, 95158);
    this.gCX = SubCoreGameCenter.aFe().aEB();
    if ((this.gCX > 0) && (this.gCX <= 99))
    {
      this.mLW.setVisibility(0);
      this.mLW.setText(this.gCX);
      GMTrace.o(12771890561024L, 95158);
      return;
    }
    if (this.gCX > 99)
    {
      this.mLW.setVisibility(0);
      this.mLW.setText("99+");
      this.mLW.setTextSize(1, 9.0F);
      GMTrace.o(12771890561024L, 95158);
      return;
    }
    this.mLW.setVisibility(8);
    GMTrace.o(12771890561024L, 95158);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12772024778752L, 95159);
    int i = paramView.getId();
    if (i == R.h.bLj)
    {
      if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof String)))
      {
        GMTrace.o(12772024778752L, 95159);
        return;
      }
      paramView = (String)paramView.getTag();
      i = c.p(this.mContext, paramView, "game_center_profile");
      ai.a(this.mContext, 10, 1001, this.mMn, i, this.mBs, this.mMo);
      GMTrace.o(12772024778752L, 95159);
      return;
    }
    if (i == R.h.bNg)
    {
      if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
      {
        paramView = (String)paramView.getTag();
        i = c.p(this.mContext, paramView, "game_center_msgcenter");
      }
      for (;;)
      {
        paramView = null;
        if (this.mLW.getVisibility() == 0) {
          paramView = ai.co("resource", "5");
        }
        ai.a(this.mContext, 10, 1001, this.mMl, i, 0, null, this.mBs, 0, null, null, paramView);
        GMTrace.o(12772024778752L, 95159);
        return;
        paramView = a.aDY();
        if (paramView.fJg == 2)
        {
          i = c.p(this.mContext, paramView.url, "game_center_msgcenter");
        }
        else
        {
          paramView = new Intent(this.mContext, GameMessageUI.class);
          paramView.putExtra("game_report_from_scene", 1001);
          paramView.putExtra("game_unread_msg_count", this.gCX);
          paramView.putExtra("game_manage_url", this.mMj);
          this.mContext.startActivity(paramView);
          i = 6;
        }
      }
    }
    if (i == R.h.bMy)
    {
      if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
      {
        paramView = (String)paramView.getTag();
        i = c.p(this.mContext, paramView, "game_center_giftcenter");
        paramView = null;
        if (this.mLZ.getVisibility() == 0) {
          paramView = ai.co("resource", "5");
        }
        ai.a(this.mContext, 10, 1001, this.mMm, i, 0, null, this.mBs, 0, null, null, paramView);
      }
      GMTrace.o(12772024778752L, 95159);
      return;
    }
    if (i == R.h.cty)
    {
      if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof String))) {
        break label462;
      }
      paramView = (String)paramView.getTag();
      i = c.p(this.mContext, paramView, "game_center_msgcenter");
    }
    for (;;)
    {
      ai.a(this.mContext, 14, 1401, 1, i, 0, null, this.mBs, 0, null, null, null);
      GMTrace.o(12772024778752L, 95159);
      return;
      label462:
      paramView = a.aDY();
      if (paramView.fJg == 2)
      {
        i = c.p(this.mContext, paramView.url, "game_center_msgcenter");
      }
      else
      {
        paramView = new Intent(this.mContext, GameSearchUI.class);
        paramView.putExtra("game_report_from_scene", 1001);
        this.mContext.startActivity(paramView);
        i = 6;
      }
    }
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12771756343296L, 95157);
    super.onFinishInflate();
    this.mMb = ((RelativeLayout)findViewById(R.h.bLj));
    this.mMb.setOnClickListener(this);
    this.mMc = ((ImageView)findViewById(R.h.ckO));
    this.mMd = ((TextView)findViewById(R.h.ckY));
    this.mMe = ((ImageView)findViewById(R.h.bjU));
    this.mLU = ((FrameLayout)findViewById(R.h.bNg));
    this.mLU.setOnClickListener(this);
    this.mLV = ((ImageView)findViewById(R.h.cce));
    this.mLW = ((TextView)findViewById(R.h.bNi));
    this.mLX = ((FrameLayout)findViewById(R.h.bMy));
    this.mLX.setOnClickListener(this);
    this.mLY = ((ImageView)findViewById(R.h.bNO));
    this.mLZ = ((ImageView)findViewById(R.h.bNP));
    this.mMi = ((ImageView)findViewById(R.h.ctr));
    this.mMa = ((ImageView)findViewById(R.h.cty));
    this.mMa.setOnClickListener(this);
    w.i("MicroMsg.GameInfoView", "initView finished");
    GMTrace.o(12771756343296L, 95157);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */