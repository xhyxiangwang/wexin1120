package com.tencent.mm.plugin.sns.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.tools.j;

public class SnsTranslateResultView
  extends LinearLayout
{
  private static final int qRd;
  private Drawable hDh;
  public TextView pio;
  private TextView qRb;
  public View qRc;
  private int qRe;
  private float qRf;
  private int qRg;
  
  static
  {
    GMTrace.i(8638655627264L, 64363);
    qRd = Color.parseColor("#19000000");
    GMTrace.o(8638655627264L, 64363);
  }
  
  public SnsTranslateResultView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8637984538624L, 64358);
    this.qRe = -1;
    this.qRf = -1.0F;
    this.qRg = -1;
    LayoutInflater.from(getContext()).inflate(i.g.pPR, this);
    this.qRb = ((TextView)findViewById(i.f.pNm));
    this.pio = ((TextView)findViewById(i.f.pNn));
    this.qRc = findViewById(i.f.pNy);
    this.hDh = getResources().getDrawable(i.e.pHF);
    this.hDh.setBounds(0, 0, (int)(this.pio.getTextSize() * 0.8F), (int)(this.pio.getTextSize() * 0.8F));
    this.hDh.setColorFilter(qRd, PorterDuff.Mode.SRC_IN);
    GMTrace.o(8637984538624L, 64358);
  }
  
  @TargetApi(11)
  public final void a(final ao.b paramb, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(8638521409536L, 64362);
    this.qRe = paramInt;
    if ((this.qRf == -1.0F) && (this.qRg == -1)) {
      if (this.qRe == 2)
      {
        this.pio.setTextSize(1, 14.0F * a.dZ(getContext()));
        if (this.qRe != 2) {
          break label230;
        }
        this.pio.setTextColor(getContext().getResources().getColor(i.c.pGr));
        label85:
        if (bg.mZ(paramString1)) {
          break label261;
        }
        this.pio.setText(paramString1);
        h.d(this.pio, 2);
        label109:
        this.pio.setCompoundDrawables(null, null, null, null);
        if ((paramBoolean) && (d.et(11))) {
          j.a(this.pio, new Animator.AnimatorListener()
          {
            public final void onAnimationCancel(Animator paramAnonymousAnimator)
            {
              GMTrace.i(8623220588544L, 64248);
              GMTrace.o(8623220588544L, 64248);
            }
            
            public final void onAnimationEnd(Animator paramAnonymousAnimator)
            {
              GMTrace.i(8623086370816L, 64247);
              if (paramb != null) {
                ao.a(paramb);
              }
              GMTrace.o(8623086370816L, 64247);
            }
            
            public final void onAnimationRepeat(Animator paramAnonymousAnimator)
            {
              GMTrace.i(8623354806272L, 64249);
              GMTrace.o(8623354806272L, 64249);
            }
            
            public final void onAnimationStart(Animator paramAnonymousAnimator)
            {
              GMTrace.i(8622952153088L, 64246);
              GMTrace.o(8622952153088L, 64246);
            }
          });
        }
        if (bg.mZ(paramString2)) {
          break label274;
        }
        this.qRb.setText(paramString2);
      }
    }
    for (;;)
    {
      this.qRb.setVisibility(0);
      GMTrace.o(8638521409536L, 64362);
      return;
      if (this.qRe != 1) {
        break;
      }
      this.pio.setTextSize(1, 15.0F * a.dZ(getContext()));
      break;
      this.pio.setTextSize(this.qRg, this.qRf);
      break;
      label230:
      if (this.qRe != 1) {
        break label85;
      }
      this.pio.setTextColor(getContext().getResources().getColor(i.c.pGt));
      break label85;
      label261:
      this.pio.setText(i.j.pUe);
      break label109;
      label274:
      this.qRb.setText(i.j.dKf);
    }
  }
  
  public final void ar(float paramFloat)
  {
    GMTrace.i(8638252974080L, 64360);
    this.pio.setTextSize(1, paramFloat);
    this.qRf = paramFloat;
    this.qRg = 1;
    GMTrace.o(8638252974080L, 64360);
  }
  
  public final void as(float paramFloat)
  {
    GMTrace.i(8638387191808L, 64361);
    this.pio.setTextSize(0, paramFloat);
    this.qRf = paramFloat;
    this.qRg = 0;
    GMTrace.o(8638387191808L, 64361);
  }
  
  public final void vi(int paramInt)
  {
    GMTrace.i(8638118756352L, 64359);
    this.pio.setCompoundDrawables(this.hDh, null, null, null);
    this.pio.setCompoundDrawablePadding(a.fromDPToPix(getContext(), 3));
    this.pio.setText(i.j.pUg);
    j.a(this.pio, null);
    this.qRb.setVisibility(4);
    this.qRe = paramInt;
    this.pio.setTextSize(0, this.qRb.getTextSize());
    this.pio.setTextColor(getContext().getResources().getColor(i.c.pGs));
    GMTrace.o(8638118756352L, 64359);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsTranslateResultView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */