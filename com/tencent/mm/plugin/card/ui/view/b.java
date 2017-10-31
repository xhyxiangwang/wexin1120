package com.tencent.mm.plugin.card.ui.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.a.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.protocal.c.au;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class b
  extends i
{
  private MMActivity jFp;
  private com.tencent.mm.plugin.card.base.b kmJ;
  private TextView kzA;
  private g kzB;
  private View kzz;
  
  public b()
  {
    GMTrace.i(4992765263872L, 37199);
    GMTrace.o(4992765263872L, 37199);
  }
  
  public final void MH()
  {
    GMTrace.i(4992899481600L, 37200);
    this.jFp = this.kzR.akO();
    this.kzB = this.kzR.akQ();
    GMTrace.o(4992899481600L, 37200);
  }
  
  public final void amb()
  {
    GMTrace.i(4993302134784L, 37203);
    this.kzz.setVisibility(8);
    GMTrace.o(4993302134784L, 37203);
  }
  
  public final void destroy()
  {
    GMTrace.i(4993033699328L, 37201);
    super.destroy();
    this.jFp = null;
    this.kzB = null;
    GMTrace.o(4993033699328L, 37201);
  }
  
  public final void update()
  {
    GMTrace.i(4993167917056L, 37202);
    if (this.kzz == null)
    {
      this.kzz = ((ViewStub)findViewById(R.h.boG)).inflate();
      this.kzz.findViewById(R.h.bow).setOnClickListener(this.kzR.akP());
    }
    this.kmJ = this.kzR.akL();
    this.kzB = this.kzR.akQ();
    boolean bool1 = this.kzB.alA();
    boolean bool2 = this.kzB.alB();
    Object localObject2;
    final Object localObject1;
    int i;
    Object localObject3;
    StateListDrawable localStateListDrawable;
    if (bool1)
    {
      this.kzz.setVisibility(0);
      w.i("MicroMsg.CardAcceptView", "updateAcceptView() acceptViewVisible:" + bool1 + " acceptViewEnabled:" + bool2);
      localObject2 = (Button)this.kzz.findViewById(R.h.bow);
      localObject1 = this.kzz.findViewById(R.h.boF);
      ((View)localObject1).setBackgroundDrawable(null);
      ((View)localObject1).setOnClickListener(null);
      i = this.jFp.getResources().getDimensionPixelSize(R.f.aTb);
      if (!bool2) {
        break label1131;
      }
      if (!TextUtils.isEmpty(this.kmJ.aiK().tFf)) {
        ((Button)localObject2).setText(this.kmJ.aiK().tFf);
      }
      if (!this.kmJ.air()) {
        break label858;
      }
      ((Button)localObject2).setTextColor(l.uk(this.kmJ.aiK().hbA));
      localObject1 = l.d(this.jFp, l.uk(this.kmJ.aiK().hbA), i);
      localObject3 = l.bM(l.uk(this.kmJ.aiK().hbA), i);
      localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(new int[] { 16842919 }, (Drawable)localObject3);
      localStateListDrawable.addState(new int[0], (Drawable)localObject1);
      i = this.jFp.getResources().getColor(R.e.white);
      int j = l.uk(this.kmJ.aiK().hbA);
      ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
      ((Button)localObject2).setTextColor(new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { i, j }));
      localObject1 = (LinearLayout.LayoutParams)this.kzz.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject1).topMargin = this.jFp.getResources().getDimensionPixelSize(R.f.aSK);
      this.kzz.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.kzz.findViewById(R.h.bCn).setVisibility(8);
      localObject1 = this.kzR.akT();
      localObject2 = (CheckBox)this.kzz.findViewById(R.h.bpG);
      if ((((f)localObject1).ajj() == null) || (!((f)localObject1).ajj().knF)) {
        break label840;
      }
      w.i("MicroMsg.CardAcceptView", "updateFollowBox() show followbox");
      ((CheckBox)localObject2).setVisibility(0);
      localObject3 = this.kmJ.aiK().tFq;
      if ((localObject3 == null) || (TextUtils.isEmpty(((tp)localObject3).text))) {
        break label824;
      }
      ((CheckBox)localObject2).setText(((tp)localObject3).text);
      ((CheckBox)localObject2).setChecked(((f)localObject1).ajj().knG);
      ((CheckBox)localObject2).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4993570570240L, 37205);
          if (((CheckBox)paramAnonymousView).isChecked())
          {
            localObject1.ajj().knG = true;
            GMTrace.o(4993570570240L, 37205);
            return;
          }
          localObject1.ajj().knG = false;
          GMTrace.o(4993570570240L, 37205);
        }
      });
    }
    for (;;)
    {
      if ((!this.kmJ.ais()) && (!this.kmJ.aiq()))
      {
        if ((this.kmJ.aiK().tFr != null) && (!bg.mZ(this.kmJ.aiK().tFr.text)))
        {
          if (this.kzA == null) {
            this.kzA = ((TextView)this.kzz.findViewById(R.h.boD));
          }
          this.kzA.setText(this.kmJ.aiK().tFr.text);
          if (!bg.mZ(this.kmJ.aiK().tFr.url))
          {
            this.kzA.setOnClickListener(this.kzR.akP());
            this.kzA.setTextColor(l.uk(this.kmJ.aiK().hbA));
          }
          this.kzA.setVisibility(0);
          GMTrace.o(4993167917056L, 37202);
          return;
          w.i("MicroMsg.CardAcceptView", "updateAcceptView(), mAcceptCardView is Gone");
          this.kzz.setVisibility(8);
          GMTrace.o(4993167917056L, 37202);
          return;
          label824:
          ((CheckBox)localObject2).setText(((f)localObject1).ajj().title);
          break;
          label840:
          w.i("MicroMsg.CardAcceptView", "updateFollowBox() not show followbox");
          ((CheckBox)localObject2).setVisibility(8);
          continue;
          label858:
          if ((this.kmJ.ais()) || (this.kmJ.aiq()) || (this.kmJ.ait()))
          {
            localObject1 = l.bM(l.uk(this.kmJ.aiK().hbA), i);
            localObject3 = l.bM(l.aM(this.kmJ.aiK().hbA, 175), i);
            localStateListDrawable = new StateListDrawable();
            localStateListDrawable.addState(new int[] { 16842919 }, (Drawable)localObject3);
            localStateListDrawable.addState(new int[0], (Drawable)localObject1);
            ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
            ((Button)localObject2).setTextColor(this.jFp.getResources().getColor(R.e.aQU));
            localObject1 = (LinearLayout.LayoutParams)((Button)localObject2).getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).width = -1;
            ((Button)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
            continue;
          }
          localObject1 = l.bM(l.uk(this.kmJ.aiK().hbA), i);
          localObject3 = l.bM(l.aM(this.kmJ.aiK().hbA, 175), i);
          localStateListDrawable = new StateListDrawable();
          localStateListDrawable.addState(new int[] { 16842919 }, (Drawable)localObject3);
          localStateListDrawable.addState(new int[0], (Drawable)localObject1);
          ((Button)localObject2).setBackgroundDrawable(localStateListDrawable);
          ((Button)localObject2).setTextColor(this.jFp.getResources().getColor(R.e.aQU));
          continue;
          label1131:
          this.kzz.setEnabled(false);
          ((View)localObject1).setEnabled(false);
          ((Button)localObject2).setEnabled(false);
          if (this.kmJ.air()) {}
          for (localObject1 = this.kmJ.aiK().tFf;; localObject1 = this.kzB.alt())
          {
            ((Button)localObject2).setText((CharSequence)localObject1);
            if (!this.kmJ.air()) {
              break label1319;
            }
            ((Button)localObject2).setTextColor(l.aM(this.kmJ.aiK().hbA, 125));
            ((Button)localObject2).setBackgroundDrawable(l.d(this.jFp, l.aM(this.kmJ.aiK().hbA, 125), i));
            localObject1 = (LinearLayout.LayoutParams)this.kzz.getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).topMargin = this.jFp.getResources().getDimensionPixelSize(R.f.aSL);
            this.kzz.setLayoutParams((ViewGroup.LayoutParams)localObject1);
            this.kzz.findViewById(R.h.bCn).setVisibility(8);
            break;
          }
          label1319:
          if ((this.kmJ.ais()) || (this.kmJ.aiq()) || (this.kmJ.ait()))
          {
            ((Button)localObject2).setTextColor(this.jFp.getResources().getColor(R.e.aOz));
            ((Button)localObject2).setBackgroundDrawable(l.v(this.jFp, this.jFp.getResources().getColor(R.e.aNI)));
            localObject1 = (LinearLayout.LayoutParams)((Button)localObject2).getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).width = -1;
            ((Button)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
            continue;
          }
          ((Button)localObject2).setTextColor(this.jFp.getResources().getColor(R.e.aOz));
          ((Button)localObject2).setBackgroundDrawable(l.v(this.jFp, this.jFp.getResources().getColor(R.e.aNI)));
          continue;
        }
        if (this.kzA != null) {
          this.kzA.setVisibility(8);
        }
      }
    }
    GMTrace.o(4993167917056L, 37202);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */