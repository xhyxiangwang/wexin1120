package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.game.c.bf;
import com.tencent.mm.plugin.game.c.x;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.widget.EllipsizingTextView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MyGameTextStyleView
  extends LinearLayout
  implements View.OnClickListener
{
  String appId;
  TextView jaE;
  int mBs;
  Context mContext;
  TextView mQO;
  TextView mQP;
  EllipsizingTextView mQR;
  LinearLayout mQS;
  ImageView mQT;
  ImageView mQU;
  ImageView mQV;
  LinearLayout mQW;
  ImageView mQX;
  RelativeLayout mQY;
  FrameLayout mQZ;
  ImageView mRa;
  ImageView mRb;
  
  public MyGameTextStyleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12730551500800L, 94850);
    this.mContext = paramContext;
    GMTrace.o(12730551500800L, 94850);
  }
  
  static void f(ImageView paramImageView, String paramString)
  {
    GMTrace.i(19281047715840L, 143655);
    if (bg.mZ(paramString))
    {
      paramImageView.setVisibility(8);
      GMTrace.o(19281047715840L, 143655);
      return;
    }
    paramImageView.setVisibility(0);
    e.aFP().g(paramImageView, paramString);
    GMTrace.o(19281047715840L, 143655);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12730819936256L, 94852);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof x)))
    {
      w.w("MicroMsg.MyGameTextStyleView", "getTag is null");
      GMTrace.o(12730819936256L, 94852);
      return;
    }
    paramView = (x)paramView.getTag();
    if (bg.mZ(paramView.mDU.mDg))
    {
      w.w("MicroMsg.MyGameTextStyleView", "jumpUrl is null");
      GMTrace.o(12730819936256L, 94852);
      return;
    }
    int i = c.p(this.mContext, paramView.mDU.mDg, "game_center_mygame_comm");
    ai.a(this.mContext, 10, 1002, paramView.mDS, i, this.appId, this.mBs, ai.ze(paramView.mDh));
    GMTrace.o(12730819936256L, 94852);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12730685718528L, 94851);
    super.onFinishInflate();
    this.mQO = ((TextView)findViewById(R.h.cdo));
    this.mQP = ((TextView)findViewById(R.h.cdn));
    this.jaE = ((TextView)findViewById(R.h.title));
    this.mQR = ((EllipsizingTextView)findViewById(R.h.bAw));
    this.mQR.setMaxLines(2);
    this.mQS = ((LinearLayout)findViewById(R.h.cyw));
    this.mQT = ((ImageView)findViewById(R.h.bzX));
    this.mQU = ((ImageView)findViewById(R.h.cyu));
    this.mQV = ((ImageView)findViewById(R.h.cys));
    this.mQW = ((LinearLayout)findViewById(R.h.cpW));
    this.mQX = ((ImageView)findViewById(R.h.cpV));
    this.mQY = ((RelativeLayout)findViewById(R.h.bls));
    this.mQZ = ((FrameLayout)findViewById(R.h.blt));
    this.mRa = ((ImageView)findViewById(R.h.blq));
    this.mRb = ((ImageView)findViewById(R.h.blp));
    w.i("MicroMsg.MyGameTextStyleView", "initView finished");
    GMTrace.o(12730685718528L, 94851);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/MyGameTextStyleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */