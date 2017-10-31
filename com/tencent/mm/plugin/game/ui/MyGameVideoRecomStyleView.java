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
import com.tencent.mm.plugin.game.c.cn;
import com.tencent.mm.plugin.game.c.x;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class MyGameVideoRecomStyleView
  extends LinearLayout
  implements View.OnClickListener
{
  String iqL;
  ImageView jsH;
  TextView lwa;
  int mBs;
  Context mContext;
  TextView mRc;
  TextView mRd;
  TextView mRe;
  TextView mRf;
  TextView mRg;
  RelativeLayout mRh;
  private FrameLayout mRi;
  ImageView mRj;
  
  public MyGameVideoRecomStyleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19280108191744L, 143648);
    this.mContext = paramContext;
    GMTrace.o(19280108191744L, 143648);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(19280376627200L, 143650);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof x)))
    {
      w.w("MicroMsg.MyGameVideoRecomStyleView", "getTag is null");
      GMTrace.o(19280376627200L, 143650);
      return;
    }
    paramView = (x)paramView.getTag();
    if (bg.mZ(paramView.mDX.mDg))
    {
      w.w("MicroMsg.MyGameVideoRecomStyleView", "jumpUrl is null");
      GMTrace.o(19280376627200L, 143650);
      return;
    }
    int i = c.p(this.mContext, paramView.mDX.mDg, "game_center_mygame_comm");
    ai.a(this.mContext, 10, 1002, paramView.mDS, i, this.iqL, this.mBs, ai.ze(paramView.mDh));
    GMTrace.o(19280376627200L, 143650);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(19280242409472L, 143649);
    super.onFinishInflate();
    this.mRc = ((TextView)findViewById(R.h.cdo));
    this.mRd = ((TextView)findViewById(R.h.cdn));
    this.lwa = ((TextView)findViewById(R.h.title));
    this.mRe = ((TextView)findViewById(R.h.bhV));
    this.mRf = ((TextView)findViewById(R.h.bhU));
    this.mRg = ((TextView)findViewById(R.h.bAV));
    this.mRh = ((RelativeLayout)findViewById(R.h.bOV));
    this.mRi = ((FrameLayout)findViewById(R.h.bOW));
    this.jsH = ((ImageView)findViewById(R.h.icon));
    this.mRj = ((ImageView)findViewById(R.h.bzC));
    w.i("MicroMsg.MyGameVideoRecomStyleView", "initView finished");
    GMTrace.o(19280242409472L, 143649);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/MyGameVideoRecomStyleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */