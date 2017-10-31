package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.p;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class a
{
  private final String TAG;
  Bitmap ioh;
  View.OnClickListener iom;
  public MMActivity jFp;
  public b kmJ;
  View krg;
  private View krh;
  private View kri;
  private View krj;
  Bitmap krk;
  TextView krl;
  TextView krm;
  public CheckBox krn;
  String kro;
  int krp;
  boolean krq;
  public a krr;
  float krs;
  private View.OnLongClickListener krt;
  
  public a(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(5091683729408L, 37936);
    this.TAG = "MicroMsg.CardConsumeCodeController";
    this.krp = 1;
    this.krq = false;
    this.krs = 0.0F;
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5085107060736L, 37887);
        if (paramAnonymousView.getId() == R.h.che) {
          if (a.this.krn.isChecked())
          {
            if (a.this.krr != null)
            {
              a.this.krr.lB(1);
              GMTrace.o(5085107060736L, 37887);
            }
          }
          else if (a.this.krr != null) {
            a.this.krr.lB(0);
          }
        }
        GMTrace.o(5085107060736L, 37887);
      }
    };
    this.krt = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(5090878423040L, 37930);
        if (paramAnonymousView.getId() == R.h.bvG)
        {
          p.H(a.this.jFp, a.this.kmJ.aiL().code);
          com.tencent.mm.ui.base.h.bl(a.this.jFp, a.this.jFp.getString(R.l.duV));
        }
        GMTrace.o(5090878423040L, 37930);
        return false;
      }
    };
    this.jFp = paramMMActivity;
    this.krg = paramView;
    GMTrace.o(5091683729408L, 37936);
  }
  
  private void a(ImageView paramImageView, Bitmap paramBitmap)
  {
    GMTrace.i(5092086382592L, 37939);
    if ((paramImageView == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(5092086382592L, 37939);
      return;
    }
    paramImageView.setImageBitmap(paramBitmap);
    if (this.krp != 1)
    {
      paramImageView.setAlpha(10);
      GMTrace.o(5092086382592L, 37939);
      return;
    }
    paramImageView.setAlpha(255);
    GMTrace.o(5092086382592L, 37939);
  }
  
  private void cf(View paramView)
  {
    GMTrace.i(5092220600320L, 37940);
    paramView = (Button)paramView.findViewById(R.h.bvy);
    if (this.krp == 1) {
      paramView.setVisibility(8);
    }
    for (;;)
    {
      if (this.krp == -1) {
        paramView.setText(R.l.dFF);
      }
      GMTrace.o(5092220600320L, 37940);
      return;
      paramView.setVisibility(0);
    }
  }
  
  final void Y(float paramFloat)
  {
    GMTrace.i(5091817947136L, 37937);
    WindowManager.LayoutParams localLayoutParams = this.jFp.getWindow().getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    this.jFp.getWindow().setAttributes(localLayoutParams);
    GMTrace.o(5091817947136L, 37937);
  }
  
  public final void akd()
  {
    GMTrace.i(5091952164864L, 37938);
    w.i("MicroMsg.CardConsumeCodeController", "doUpdate()");
    if (!this.krq)
    {
      w.i("MicroMsg.CardConsumeCodeController", "doUpdate() not ready show!");
      GMTrace.o(5091952164864L, 37938);
      return;
    }
    Object localObject1;
    Object localObject2;
    if (!bg.mZ(this.kmJ.aiL().tEG))
    {
      localObject1 = this.kmJ.aiL().tEG;
      w.i("MicroMsg.CardConsumeCodeController", "code:%s from sign_number", new Object[] { localObject1 });
      switch (this.kmJ.aiL().tEt)
      {
      default: 
        if (!bg.mZ(this.kmJ.aiK().kKJ)) {
          if (this.kmJ.aiK().tFA != null)
          {
            this.krm.setText(this.kmJ.aiK().kKJ);
            this.krm.setVisibility(0);
            this.krl.setVisibility(8);
            if (this.krh != null)
            {
              localObject1 = (ImageView)this.krh.findViewById(R.h.bvz);
              localObject2 = ((ImageView)localObject1).getLayoutParams();
              ((ViewGroup.LayoutParams)localObject2).height = com.tencent.mm.bq.a.fromDPToPix(this.jFp, 180);
              ((ViewGroup.LayoutParams)localObject2).width = com.tencent.mm.bq.a.fromDPToPix(this.jFp, 180);
              ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
            }
          }
        }
        break;
      }
    }
    for (;;)
    {
      if ((!this.kmJ.aiq()) || (TextUtils.isEmpty(this.kmJ.aiQ())) || (this.kmJ.aiQ().equals(com.tencent.mm.x.m.zF()))) {
        break label1215;
      }
      this.krn.setVisibility(0);
      localObject1 = " " + this.jFp.getString(R.l.dEX, new Object[] { l.un(this.kmJ.aiQ()) });
      this.krn.setText(com.tencent.mm.pluginsdk.ui.d.h.g(this.jFp, (CharSequence)localObject1, this.jFp.getResources().getDimensionPixelOffset(R.f.aSt)));
      GMTrace.o(5091952164864L, 37938);
      return;
      if (this.kmJ.aiE())
      {
        localObject1 = al.ajP().getCode();
        w.i("MicroMsg.CardConsumeCodeController", "code:%s from dynamic code", new Object[] { localObject1 });
        break;
      }
      localObject1 = this.kmJ.aiL().code;
      w.i("MicroMsg.CardConsumeCodeController", "code:%s from dataInfo", new Object[] { localObject1 });
      break;
      if (this.krh == null) {
        this.krh = ((ViewStub)this.krg.findViewById(R.h.bpl)).inflate();
      }
      Object localObject3 = this.krh;
      localObject2 = (ImageView)((View)localObject3).findViewById(R.h.bvz);
      localObject3 = (TextView)((View)localObject3).findViewById(R.h.bvG);
      if (!this.kmJ.air()) {
        ((TextView)localObject3).setTextColor(l.uk(this.kmJ.aiK().hbA));
      }
      if (((String)localObject1).length() <= 40)
      {
        ((TextView)localObject3).setText(com.tencent.mm.plugin.card.b.m.us((String)localObject1));
        if (this.kmJ.aiA())
        {
          ((TextView)localObject3).setVisibility(0);
          ((TextView)localObject3).setOnLongClickListener(this.krt);
          label585:
          if (this.krp != 1) {
            ((TextView)localObject3).setVisibility(4);
          }
        }
      }
      try
      {
        l.u(this.ioh);
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          this.ioh = com.tencent.mm.bn.a.a.b(this.jFp, (String)localObject1, 0, 3);
          a((ImageView)localObject2, this.ioh);
        }
        for (;;)
        {
          cf(this.krh);
          break;
          ((TextView)localObject3).setVisibility(8);
          break label585;
          ((TextView)localObject3).setVisibility(8);
          break label585;
          this.ioh = null;
          ((ImageView)localObject2).setImageBitmap(this.ioh);
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.CardConsumeCodeController", localException1, "", new Object[0]);
        }
      }
      if (this.kri == null) {
        this.kri = ((ViewStub)this.krg.findViewById(R.h.bph)).inflate();
      }
      localObject3 = this.kri;
      localObject2 = (ImageView)((View)localObject3).findViewById(R.h.bvq);
      localObject3 = (TextView)((View)localObject3).findViewById(R.h.bvG);
      if (!this.kmJ.air()) {
        ((TextView)localObject3).setTextColor(l.uk(this.kmJ.aiK().hbA));
      }
      if ((!TextUtils.isEmpty(localException1)) && (localException1.length() <= 40))
      {
        ((TextView)localObject3).setText(com.tencent.mm.plugin.card.b.m.us(localException1));
        if (this.kmJ.aiA())
        {
          ((TextView)localObject3).setVisibility(0);
          ((TextView)localObject3).setOnLongClickListener(this.krt);
          label831:
          if (this.krp != 1) {
            ((TextView)localObject3).setVisibility(4);
          }
        }
      }
      try
      {
        l.u(this.krk);
        if (!TextUtils.isEmpty(localException1))
        {
          this.krk = com.tencent.mm.bn.a.a.b(this.jFp, localException1, 5, 0);
          a((ImageView)localObject2, this.krk);
        }
        for (;;)
        {
          cf(this.kri);
          break;
          ((TextView)localObject3).setVisibility(8);
          break label831;
          ((TextView)localObject3).setVisibility(8);
          break label831;
          this.krk = null;
          ((ImageView)localObject2).setImageBitmap(this.krk);
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.CardConsumeCodeController", localException2, "", new Object[0]);
        }
      }
      if (this.krj == null) {
        this.krj = ((ViewStub)this.krg.findViewById(R.h.bpn)).inflate();
      }
      localObject2 = (TextView)this.krj.findViewById(R.h.bvG);
      ((TextView)localObject2).setText(com.tencent.mm.plugin.card.b.m.us(localException2));
      ((TextView)localObject2).setOnLongClickListener(this.krt);
      if (!this.kmJ.air()) {
        ((TextView)localObject2).setTextColor(l.uk(this.kmJ.aiK().hbA));
      }
      if (localException2.length() <= 12) {
        ((TextView)localObject2).setTextSize(1, 33.0F);
      }
      for (;;)
      {
        cf(this.krj);
        break;
        if ((localException2.length() > 12) && (localException2.length() <= 16)) {
          ((TextView)localObject2).setTextSize(1, 30.0F);
        } else if ((localException2.length() > 16) && (localException2.length() <= 20)) {
          ((TextView)localObject2).setTextSize(1, 24.0F);
        } else if ((localException2.length() > 20) && (localException2.length() <= 40)) {
          ((TextView)localObject2).setTextSize(1, 18.0F);
        } else if (localException2.length() > 40) {
          ((TextView)localObject2).setVisibility(8);
        }
      }
      this.krl.setText(this.kmJ.aiK().kKJ);
      this.krl.setVisibility(0);
      continue;
      this.krl.setVisibility(8);
      this.krm.setVisibility(8);
    }
    label1215:
    this.krn.setChecked(false);
    this.krn.setVisibility(8);
    GMTrace.o(5091952164864L, 37938);
  }
  
  public static abstract interface a
  {
    public abstract void lB(int paramInt);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */