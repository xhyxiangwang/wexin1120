package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.plugin.game.c.ck;
import com.tencent.mm.plugin.game.c.cl;
import com.tencent.mm.plugin.game.model.ad;
import com.tencent.mm.plugin.game.model.ad.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;

public class GameDetailRankLikeView
  extends LinearLayout
  implements View.OnClickListener
{
  String iqL;
  int mBs;
  ad mJS;
  ad.a mJT;
  private Drawable mJU;
  private Drawable mJV;
  private Animation mJW;
  private ImageView mJX;
  private TextView mJY;
  
  public GameDetailRankLikeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12657939709952L, 94309);
    GMTrace.o(12657939709952L, 94309);
  }
  
  final void aFy()
  {
    GMTrace.i(12658208145408L, 94311);
    if (this.mJT != null)
    {
      if (this.mJT.mBF) {
        this.mJX.setImageDrawable(this.mJU);
      }
      int i;
      for (;;)
      {
        i = this.mJT.mBE;
        if (i <= 99) {
          break;
        }
        this.mJY.setText("99+");
        GMTrace.o(12658208145408L, 94311);
        return;
        this.mJX.setImageDrawable(this.mJV);
      }
      if (i == 0)
      {
        this.mJY.setText("");
        GMTrace.o(12658208145408L, 94311);
        return;
      }
      this.mJY.setText(String.valueOf(i));
      GMTrace.o(12658208145408L, 94311);
      return;
    }
    setVisibility(8);
    GMTrace.o(12658208145408L, 94311);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12658342363136L, 94312);
    if (m.zF().equals(this.mJT.fJp))
    {
      if (this.mJT.mBE > 0)
      {
        paramView = new Intent(getContext(), GameDetailRankLikedUI.class);
        paramView.putExtra("extra_appdi", this.iqL);
        getContext().startActivity(paramView);
        GMTrace.o(12658342363136L, 94312);
      }
    }
    else if (!this.mJT.mBF)
    {
      this.mJT.mBF = true;
      paramView = this.mJT;
      paramView.mBE += 1;
      this.mJS.aEM();
      paramView = this.iqL;
      String str = this.mJT.fJp;
      Object localObject = new b.a();
      ((b.a)localObject).hlX = new ck();
      ((b.a)localObject).hlY = new cl();
      ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/upfriend";
      ((b.a)localObject).hlW = 1330;
      localObject = ((b.a)localObject).DA();
      ck localck = (ck)((b)localObject).hlU.hmc;
      localck.mCH = paramView;
      localck.mGA = str;
      u.a((b)localObject, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(12663442636800L, 94350);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.GameDetailRankLikeView", "CGI return is not OK. (%d, %d)(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            GMTrace.o(12663442636800L, 94350);
            return 0;
          }
          GMTrace.o(12663442636800L, 94350);
          return 0;
        }
      });
      ai.a(getContext(), 12, 1203, 1, 2, this.iqL, this.mBs, null);
      aFy();
      this.mJX.startAnimation(this.mJW);
    }
    GMTrace.o(12658342363136L, 94312);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12658073927680L, 94310);
    super.onFinishInflate();
    this.mJU = getContext().getResources().getDrawable(R.g.aZg);
    this.mJV = getContext().getResources().getDrawable(R.g.aZf);
    this.mJW = AnimationUtils.loadAnimation(getContext(), R.a.aMf);
    inflate(getContext(), R.i.cWj, this);
    setOnClickListener(this);
    this.mJX = ((ImageView)findViewById(R.h.bTG));
    this.mJY = ((TextView)findViewById(R.h.bTH));
    GMTrace.o(12658073927680L, 94310);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailRankLikeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */