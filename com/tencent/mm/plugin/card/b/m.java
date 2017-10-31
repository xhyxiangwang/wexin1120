package com.tencent.mm.plugin.card.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ShapeDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.an.a.a;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.a.c.g;
import com.tencent.mm.an.n;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class m
{
  public static void a(final Context paramContext, ImageView paramImageView, String paramString, int paramInt1, final int paramInt2, final int paramInt3)
  {
    GMTrace.i(5055579160576L, 37667);
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(5055579160576L, 37667);
      return;
    }
    if (!TextUtils.isEmpty(paramString))
    {
      Object localObject = new c.a();
      ((c.a)localObject).hCS = e.gZT;
      n.Jb();
      ((c.a)localObject).hDk = null;
      ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(paramString);
      ((c.a)localObject).hCP = true;
      ((c.a)localObject).hDm = false;
      ((c.a)localObject).hCN = true;
      ((c.a)localObject).hCW = paramInt1;
      ((c.a)localObject).hCV = paramInt1;
      ((c.a)localObject).hDe = paramInt2;
      localObject = ((c.a)localObject).Jk();
      n.Ja().a(paramString, paramImageView, (c)localObject, new g()
      {
        public final void a(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.an.a.d.b paramAnonymousb)
        {
          GMTrace.i(5057726644224L, 37683);
          if (paramAnonymousb.bitmap != null)
          {
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5057323991040L, 37680);
                m.1.this.kAR.setImageBitmap(this.kAT);
                m.1.this.kAR.setColorFilter(m.1.this.irt, PorterDuff.Mode.SRC_IN);
                GMTrace.o(5057323991040L, 37680);
              }
            });
            GMTrace.o(5057726644224L, 37683);
            return;
          }
          m.a(this.kAR, paramInt2, paramInt3);
          GMTrace.o(5057726644224L, 37683);
        }
        
        public final void ki(String paramAnonymousString)
        {
          GMTrace.i(5057592426496L, 37682);
          GMTrace.o(5057592426496L, 37682);
        }
      });
      GMTrace.o(5055579160576L, 37667);
      return;
    }
    a(paramImageView, paramInt2, paramInt3);
    GMTrace.o(5055579160576L, 37667);
  }
  
  public static void a(ImageView paramImageView, final int paramInt1, final int paramInt2)
  {
    GMTrace.i(5055713378304L, 37668);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5051686846464L, 37638);
        this.kAR.setImageResource(paramInt1);
        this.kAR.setColorFilter(paramInt2, PorterDuff.Mode.SRC_IN);
        GMTrace.o(5051686846464L, 37638);
      }
    });
    GMTrace.o(5055713378304L, 37668);
  }
  
  public static void a(ImageView paramImageView, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(5055444942848L, 37666);
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString)))
    {
      GMTrace.o(5055444942848L, 37666);
      return;
    }
    if (!TextUtils.isEmpty(paramString))
    {
      Object localObject = new c.a();
      ((c.a)localObject).hCS = e.gZT;
      n.Jb();
      ((c.a)localObject).hDk = null;
      ((c.a)localObject).hCR = com.tencent.mm.plugin.card.model.m.tG(paramString);
      ((c.a)localObject).hCP = true;
      ((c.a)localObject).hDm = paramBoolean;
      ((c.a)localObject).hCN = true;
      ((c.a)localObject).hCW = paramInt1;
      ((c.a)localObject).hCV = paramInt1;
      ((c.a)localObject).hDe = paramInt2;
      localObject = ((c.a)localObject).Jk();
      n.Ja().a(paramString, paramImageView, (c)localObject);
      GMTrace.o(5055444942848L, 37666);
      return;
    }
    paramImageView.setImageResource(paramInt2);
    GMTrace.o(5055444942848L, 37666);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt)
  {
    GMTrace.i(5055981813760L, 37670);
    paramMMActivity.cO().cP().setBackgroundDrawable(null);
    ShapeDrawable localShapeDrawable = new ShapeDrawable();
    localShapeDrawable.getPaint().setColor(paramInt);
    paramMMActivity.cO().cP().setBackgroundDrawable(localShapeDrawable);
    View localView1 = paramMMActivity.cO().cP().getCustomView();
    if (localView1 != null)
    {
      View localView2 = localView1.findViewById(R.h.divider);
      if (localView2 != null) {
        localView2.setBackgroundColor(paramMMActivity.getResources().getColor(R.e.aOF));
      }
      localView2 = localView1.findViewById(R.h.bgu);
      if (localView2 != null) {
        ((ImageView)localView2).setImageResource(R.g.aVv);
      }
      localView2 = localView1.findViewById(16908308);
      if ((localView2 != null) && ((localView2 instanceof TextView))) {
        ((TextView)localView2).setTextColor(paramMMActivity.getResources().getColor(R.e.white));
      }
      localView2 = localView1.findViewById(16908309);
      if ((localView2 != null) && ((localView2 instanceof TextView))) {
        ((TextView)localView2).setTextColor(paramMMActivity.getResources().getColor(R.e.white));
      }
      localView1.setBackgroundDrawable(localShapeDrawable);
    }
    GMTrace.o(5055981813760L, 37670);
  }
  
  public static void a(MMActivity paramMMActivity, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(5055847596032L, 37669);
    a(paramMMActivity, l.uk(paramb.aiK().hbA));
    GMTrace.o(5055847596032L, 37669);
  }
  
  public static void b(TextView paramTextView, int paramInt)
  {
    GMTrace.i(5056250249216L, 37672);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5056250249216L, 37672);
      return;
      paramTextView.setText(R.l.dGE);
      GMTrace.o(5056250249216L, 37672);
      return;
      paramTextView.setText(R.l.dGz);
      GMTrace.o(5056250249216L, 37672);
      return;
      paramTextView.setText(R.l.dGC);
      GMTrace.o(5056250249216L, 37672);
      return;
      paramTextView.setText(R.l.dGB);
      GMTrace.o(5056250249216L, 37672);
      return;
      paramTextView.setText(R.l.dGF);
      GMTrace.o(5056250249216L, 37672);
      return;
      paramTextView.setText(R.l.dGG);
      GMTrace.o(5056250249216L, 37672);
      return;
      paramTextView.setText(R.l.dGA);
      GMTrace.o(5056250249216L, 37672);
      return;
      paramTextView.setText(R.l.dGD);
    }
  }
  
  public static void b(MMActivity paramMMActivity, boolean paramBoolean)
  {
    GMTrace.i(17257044377600L, 128575);
    int i = paramMMActivity.getResources().getColor(R.e.aPC);
    paramMMActivity.cO().cP().setBackgroundDrawable(null);
    ShapeDrawable localShapeDrawable = new ShapeDrawable();
    localShapeDrawable.getPaint().setColor(i);
    paramMMActivity.cO().cP().setBackgroundDrawable(localShapeDrawable);
    View localView1 = paramMMActivity.cO().cP().getCustomView();
    View localView2;
    if (localView1 != null)
    {
      localView2 = localView1.findViewById(R.h.divider);
      if (localView2 != null)
      {
        if (paramBoolean) {
          break label223;
        }
        localView2.setVisibility(8);
      }
    }
    for (;;)
    {
      localView2 = localView1.findViewById(R.h.bgu);
      if (localView2 != null) {
        ((ImageView)localView2).setImageResource(R.g.aWW);
      }
      localView2 = localView1.findViewById(16908308);
      if ((localView2 != null) && ((localView2 instanceof TextView))) {
        ((TextView)localView2).setTextColor(paramMMActivity.getResources().getColor(R.e.black));
      }
      localView2 = localView1.findViewById(16908309);
      if ((localView2 != null) && ((localView2 instanceof TextView))) {
        ((TextView)localView2).setTextColor(paramMMActivity.getResources().getColor(R.e.black));
      }
      localView1.setBackgroundDrawable(localShapeDrawable);
      GMTrace.o(17257044377600L, 128575);
      return;
      label223:
      localView2.setBackgroundColor(paramMMActivity.getResources().getColor(R.e.aOE));
    }
  }
  
  public static String us(String paramString)
  {
    GMTrace.i(5055310725120L, 37665);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.CardViewUtil", "toApply is null");
      GMTrace.o(5055310725120L, 37665);
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramString.length())
    {
      localStringBuilder.append(paramString.charAt(i));
      if ((i + 1) % 4 == 0) {
        localStringBuilder.append(" ");
      }
      i += 1;
    }
    paramString = localStringBuilder.toString();
    GMTrace.o(5055310725120L, 37665);
    return paramString;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */