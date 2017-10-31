package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.game.c.bz;
import com.tencent.mm.plugin.game.c.ca;
import com.tencent.mm.plugin.game.c.g;
import com.tencent.mm.plugin.game.c.p;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.widget.CircleImageView;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public class GameCommonRecommendView
  extends LinearLayout
  implements View.OnClickListener
{
  private LayoutInflater CO;
  int mBs;
  private Context mContext;
  private TextView mJA;
  private TextView mJB;
  int mJk;
  private View mJl;
  private TextView mJm;
  private TextView mJn;
  private LinearLayout mJo;
  private FrameLayout mJp;
  private TextView mJq;
  private ImageView mJr;
  private View mJs;
  private ImageView mJt;
  private ImageView mJu;
  private TextView mJv;
  private TextView mJw;
  private View mJx;
  private ImageView mJy;
  private ImageView mJz;
  
  public GameCommonRecommendView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12708539793408L, 94686);
    this.mContext = paramContext;
    this.CO = LayoutInflater.from(paramContext);
    GMTrace.o(12708539793408L, 94686);
  }
  
  final void a(ca paramca)
  {
    GMTrace.i(12708808228864L, 94688);
    this.mJm.setText(paramca.mGo.fuw);
    if (!bg.mZ(paramca.mGo.mDi)) {
      this.mJn.setText(paramca.mGo.mDi);
    }
    if (bg.bX(paramca.mGo.mDj))
    {
      this.mJq.setText(paramca.mGo.mCK);
      if (!bg.mZ(paramca.mGo.mDf)) {
        e.aFP().g(this.mJr, paramca.mGo.mDf);
      }
      this.mJl.setTag(new a(1, paramca.mGo.mDg, paramca.mGo.mDh));
      this.mJl.setOnClickListener(this);
      if (this.mJk == 2) {
        ai.a(this.mContext, 1018, 1, null, this.mBs, ai.ze(paramca.mGo.mDh));
      }
      if (!bg.mZ(paramca.mGp.mGn))
      {
        this.mJt.setVisibility(0);
        e.aFP().g(this.mJt, paramca.mGp.mGn);
      }
      if (!bg.mZ(paramca.mGp.mFy)) {
        e.aFP().g(this.mJu, paramca.mGp.mFy);
      }
      this.mJv.setText(paramca.mGp.fuw);
      this.mJw.setText(paramca.mGp.mCK);
      this.mJs.setTag(new a(2, paramca.mGp.mDg, paramca.mGp.mDh));
      this.mJs.setOnClickListener(this);
      if (this.mJk == 2) {
        ai.a(this.mContext, 1018, 2, null, this.mBs, ai.ze(paramca.mGp.mDh));
      }
      if (!bg.mZ(paramca.mGq.mGn))
      {
        this.mJy.setVisibility(0);
        e.aFP().g(this.mJy, paramca.mGq.mGn);
      }
      if (!bg.mZ(paramca.mGq.mFy)) {
        e.aFP().g(this.mJz, paramca.mGq.mFy);
      }
      this.mJA.setText(paramca.mGq.fuw);
      this.mJB.setText(paramca.mGq.mCK);
      this.mJx.setTag(new a(3, paramca.mGq.mDg, paramca.mGq.mDh));
      this.mJx.setOnClickListener(this);
      if (this.mJk == 2) {
        ai.a(this.mContext, 1018, 3, null, this.mBs, ai.ze(paramca.mGq.mDh));
      }
      GMTrace.o(12708808228864L, 94688);
      return;
    }
    Object localObject1 = new StringBuffer();
    this.mJp.removeAllViews();
    this.mJp.setVisibility(8);
    Iterator localIterator = paramca.mGo.mDj.iterator();
    do
    {
      p localp;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localp = (p)localIterator.next();
      } while (localp == null);
      if ((!bg.mZ(localp.mDH)) && (!bg.mZ(localp.jYc)))
      {
        LinearLayout localLinearLayout = (LinearLayout)this.CO.inflate(R.i.dhq, this.mJp, false);
        CircleImageView localCircleImageView = (CircleImageView)localLinearLayout.findViewById(R.h.csm);
        Object localObject2 = (FrameLayout.LayoutParams)localLinearLayout.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject2).leftMargin = (this.mJp.getChildCount() * a.fromDPToPix(this.mContext, 15));
        localLinearLayout.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject2 = new e.a.a();
        ((e.a.a)localObject2).mRG = R.g.aZb;
        e.aFP().a(localCircleImageView, localp.mDH, ((e.a.a)localObject2).aFQ());
        this.mJp.addView(localLinearLayout, 0);
        ((StringBuffer)localObject1).append(localp.jYc);
        ((StringBuffer)localObject1).append("、");
      }
    } while (this.mJp.getChildCount() < 3);
    if (this.mJp.getChildCount() > 0) {
      this.mJp.setVisibility(0);
    }
    if (((StringBuffer)localObject1).length() > 0) {}
    for (localObject1 = ((StringBuffer)localObject1).substring(0, ((StringBuffer)localObject1).length() - 1);; localObject1 = "")
    {
      this.mJq.setText(h.b(this.mContext, (CharSequence)localObject1, this.mJq.getTextSize()));
      break;
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12708942446592L, 94689);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      GMTrace.o(12708942446592L, 94689);
      return;
    }
    paramView = (a)paramView.getTag();
    int i = c.aa(this.mContext, paramView.jumpUrl);
    ai.a(this.mContext, 10, 1018, paramView.position, i, this.mBs, ai.ze(paramView.mzp));
    GMTrace.o(12708942446592L, 94689);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(12708674011136L, 94687);
    super.onFinishInflate();
    this.mJl = findViewById(R.h.cpJ);
    this.mJm = ((TextView)findViewById(R.h.cpM));
    this.mJn = ((TextView)findViewById(R.h.cpL));
    this.mJo = ((LinearLayout)findViewById(R.h.cpH));
    this.mJp = ((FrameLayout)findViewById(R.h.cpI));
    this.mJq = ((TextView)findViewById(R.h.cpG));
    this.mJr = ((ImageView)findViewById(R.h.cpK));
    this.mJs = findViewById(R.h.cpz);
    this.mJt = ((ImageView)findViewById(R.h.cpw));
    this.mJu = ((ImageView)findViewById(R.h.cpy));
    this.mJv = ((TextView)findViewById(R.h.cpA));
    this.mJw = ((TextView)findViewById(R.h.cpx));
    this.mJx = findViewById(R.h.cpE);
    this.mJy = ((ImageView)findViewById(R.h.cpB));
    this.mJz = ((ImageView)findViewById(R.h.cpD));
    this.mJA = ((TextView)findViewById(R.h.cpF));
    this.mJB = ((TextView)findViewById(R.h.cpC));
    if (c.getScreenWidth(this.mContext) < 720)
    {
      this.mJv.setTextSize(a.fromDPToPix(this.mContext, 12));
      this.mJw.setTextSize(a.fromDPToPix(this.mContext, 12));
      this.mJA.setTextSize(a.fromDPToPix(this.mContext, 12));
      this.mJB.setTextSize(a.fromDPToPix(this.mContext, 12));
    }
    w.i("MicroMsg.GameCommonRecommendView", "initView finished");
    GMTrace.o(12708674011136L, 94687);
  }
  
  private static final class a
  {
    String jumpUrl;
    String mzp;
    int position;
    
    public a(int paramInt, String paramString1, String paramString2)
    {
      GMTrace.i(12686662303744L, 94523);
      this.position = paramInt;
      this.jumpUrl = paramString1;
      this.mzp = paramString2;
      GMTrace.o(12686662303744L, 94523);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCommonRecommendView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */