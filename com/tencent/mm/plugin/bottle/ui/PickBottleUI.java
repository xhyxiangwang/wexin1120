package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.ae.m;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.plugin.bottle.a.h.a;
import com.tencent.mm.plugin.bottle.a.h.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.as;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.h;

public class PickBottleUI
  extends FrameLayout
  implements View.OnClickListener, View.OnTouchListener
{
  float density;
  com.tencent.mm.sdk.platformtools.ae handler;
  private boolean hasInit;
  float jIU;
  BottleBeachUI kgS;
  SprayLayout khn;
  PickedBottleImageView kho;
  ImageView khp;
  private h.b khq;
  Runnable khr;
  Runnable khs;
  float kht;
  
  public PickBottleUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7618064023552L, 56759);
    this.hasInit = false;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.khr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7634438586368L, 56881);
        PickBottleUI.a(PickBottleUI.this, new h.b());
        PickBottleUI.d(PickBottleUI.this).a(new h.a()
        {
          public final void bJ(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(7626385522688L, 56821);
            if ((PickBottleUI.a(PickBottleUI.this) == null) || (PickBottleUI.b(PickBottleUI.this) == null))
            {
              GMTrace.o(7626385522688L, 56821);
              return;
            }
            PickBottleUI.a(PickBottleUI.this).stop();
            if (paramAnonymous2Int2 == 63534)
            {
              PickBottleUI.a(PickBottleUI.this, null);
              PickBottleUI.c(PickBottleUI.this).la(0);
              PickBottleUI.c(PickBottleUI.this).kZ(R.l.dDF);
            }
            if (PickBottleUI.d(PickBottleUI.this) == null)
            {
              GMTrace.o(7626385522688L, 56821);
              return;
            }
            if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0) || (PickBottleUI.d(PickBottleUI.this).keM == 55535))
            {
              PickBottleUI.b(PickBottleUI.this).khc = null;
              PickBottleUI.b(PickBottleUI.this).show(55535);
              PickBottleUI.f(PickBottleUI.this).postDelayed(PickBottleUI.e(PickBottleUI.this), 2000L);
              GMTrace.o(7626385522688L, 56821);
              return;
            }
            if (19990 == PickBottleUI.d(PickBottleUI.this).keM) {
              m.d(PickBottleUI.d(PickBottleUI.this).keX, PickBottleUI.d(PickBottleUI.this).iconUrl, R.g.bbs);
            }
            PickBottleUI.b(PickBottleUI.this).khc = PickBottleUI.d(PickBottleUI.this).keR;
            PickBottleUI.b(PickBottleUI.this).keX = PickBottleUI.d(PickBottleUI.this).keX;
            PickBottleUI.b(PickBottleUI.this).iconUrl = PickBottleUI.d(PickBottleUI.this).iconUrl;
            PickBottleUI.b(PickBottleUI.this).density = PickBottleUI.g(PickBottleUI.this);
            PickBottleUI.b(PickBottleUI.this).show(PickBottleUI.d(PickBottleUI.this).keM);
            PickBottleUI.h(PickBottleUI.this).setVisibility(0);
            PickBottleUI.a(PickBottleUI.this, null);
            GMTrace.o(7626385522688L, 56821);
          }
        });
        GMTrace.o(7634438586368L, 56881);
      }
    };
    this.khs = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7630546272256L, 56852);
        if ((PickBottleUI.b(PickBottleUI.this) != null) && (PickBottleUI.b(PickBottleUI.this).isShown())) {
          PickBottleUI.c(PickBottleUI.this).la(0);
        }
        GMTrace.o(7630546272256L, 56852);
      }
    };
    this.kgS = ((BottleBeachUI)paramContext);
    GMTrace.o(7618064023552L, 56759);
  }
  
  public PickBottleUI(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7618198241280L, 56760);
    this.hasInit = false;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.khr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7634438586368L, 56881);
        PickBottleUI.a(PickBottleUI.this, new h.b());
        PickBottleUI.d(PickBottleUI.this).a(new h.a()
        {
          public final void bJ(int paramAnonymous2Int1, int paramAnonymous2Int2)
          {
            GMTrace.i(7626385522688L, 56821);
            if ((PickBottleUI.a(PickBottleUI.this) == null) || (PickBottleUI.b(PickBottleUI.this) == null))
            {
              GMTrace.o(7626385522688L, 56821);
              return;
            }
            PickBottleUI.a(PickBottleUI.this).stop();
            if (paramAnonymous2Int2 == 63534)
            {
              PickBottleUI.a(PickBottleUI.this, null);
              PickBottleUI.c(PickBottleUI.this).la(0);
              PickBottleUI.c(PickBottleUI.this).kZ(R.l.dDF);
            }
            if (PickBottleUI.d(PickBottleUI.this) == null)
            {
              GMTrace.o(7626385522688L, 56821);
              return;
            }
            if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0) || (PickBottleUI.d(PickBottleUI.this).keM == 55535))
            {
              PickBottleUI.b(PickBottleUI.this).khc = null;
              PickBottleUI.b(PickBottleUI.this).show(55535);
              PickBottleUI.f(PickBottleUI.this).postDelayed(PickBottleUI.e(PickBottleUI.this), 2000L);
              GMTrace.o(7626385522688L, 56821);
              return;
            }
            if (19990 == PickBottleUI.d(PickBottleUI.this).keM) {
              m.d(PickBottleUI.d(PickBottleUI.this).keX, PickBottleUI.d(PickBottleUI.this).iconUrl, R.g.bbs);
            }
            PickBottleUI.b(PickBottleUI.this).khc = PickBottleUI.d(PickBottleUI.this).keR;
            PickBottleUI.b(PickBottleUI.this).keX = PickBottleUI.d(PickBottleUI.this).keX;
            PickBottleUI.b(PickBottleUI.this).iconUrl = PickBottleUI.d(PickBottleUI.this).iconUrl;
            PickBottleUI.b(PickBottleUI.this).density = PickBottleUI.g(PickBottleUI.this);
            PickBottleUI.b(PickBottleUI.this).show(PickBottleUI.d(PickBottleUI.this).keM);
            PickBottleUI.h(PickBottleUI.this).setVisibility(0);
            PickBottleUI.a(PickBottleUI.this, null);
            GMTrace.o(7626385522688L, 56821);
          }
        });
        GMTrace.o(7634438586368L, 56881);
      }
    };
    this.khs = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7630546272256L, 56852);
        if ((PickBottleUI.b(PickBottleUI.this) != null) && (PickBottleUI.b(PickBottleUI.this).isShown())) {
          PickBottleUI.c(PickBottleUI.this).la(0);
        }
        GMTrace.o(7630546272256L, 56852);
      }
    };
    this.kgS = ((BottleBeachUI)paramContext);
    GMTrace.o(7618198241280L, 56760);
  }
  
  private boolean r(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(7619003547648L, 56766);
    int k = getHeight();
    int m = getWidth();
    int i = m * 180 / 480;
    int j = k * 75 / 800;
    m = m * 240 / 480;
    k = k * 495 / 800;
    paramFloat1 -= m;
    paramFloat2 -= k;
    paramFloat1 = paramFloat1 * paramFloat1 / (i * i);
    if (paramFloat2 * paramFloat2 / (j * j) + paramFloat1 <= 1.0F)
    {
      GMTrace.o(7619003547648L, 56766);
      return true;
    }
    GMTrace.o(7619003547648L, 56766);
    return false;
  }
  
  public final void MH()
  {
    GMTrace.i(7618466676736L, 56762);
    if (!this.hasInit)
    {
      this.kho = ((PickedBottleImageView)findViewById(R.h.bnd));
      this.khn = ((SprayLayout)this.kgS.findViewById(R.h.bng));
      this.khp = ((ImageView)this.kgS.findViewById(R.h.bmI));
      this.kho.setOnClickListener(this);
      if (!bg.bNV()) {
        setBackgroundResource(R.g.aWB);
      }
      setOnClickListener(this);
      setOnTouchListener(this);
      this.hasInit = true;
    }
    GMTrace.o(7618466676736L, 56762);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(7618735112192L, 56764);
    if (R.h.bnd == paramView.getId())
    {
      if (this.kho.khc != null)
      {
        ap.AS();
        c.yQ().SX(this.kho.khc);
        ap.AS();
        com.tencent.mm.storage.ae localae = c.yQ().SV("floatbottle");
        if ((localae != null) && (!bg.mZ(localae.field_username)))
        {
          localae.dz(h.zC());
          ap.AS();
          c.yQ().a(localae, localae.field_username);
        }
      }
      this.kgS.onClick(paramView);
    }
    GMTrace.o(7618735112192L, 56764);
  }
  
  public void onFinishInflate()
  {
    GMTrace.i(7618332459008L, 56761);
    super.onFinishInflate();
    MH();
    GMTrace.o(7618332459008L, 56761);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(7618869329920L, 56765);
    int i = paramMotionEvent.getAction();
    if (i == 0)
    {
      this.kht = paramMotionEvent.getX();
      this.jIU = paramMotionEvent.getY();
    }
    for (;;)
    {
      GMTrace.o(7618869329920L, 56765);
      return true;
      if (i == 1)
      {
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        int j = getHeight();
        i = getWidth();
        j = j * 550 / 800;
        int k = (i - i * 120 / 480) / 2;
        if (f2 > j) {
          i = 1;
        }
        for (;;)
        {
          if (i != 0)
          {
            if (!this.kho.isShown())
            {
              if (this.khq != null)
              {
                paramView = this.khq;
                ap.wT().b(155, paramView);
                ap.wT().b(156, paramView);
                ap.wT().c(paramView.keY);
                this.khq = null;
              }
              this.handler.removeCallbacks(this.khr);
              this.handler.removeCallbacks(this.khs);
              this.kgS.la(0);
              break;
              if (f1 < k - k * f2 / j)
              {
                i = 1;
                continue;
              }
              float f3 = i - k;
              if (f1 > k * f2 / j + f3)
              {
                i = 1;
                continue;
              }
              i = 0;
              continue;
            }
            if (this.kho.khc != null) {
              break;
            }
            this.kgS.la(0);
            break;
          }
        }
        if ((r(f1, f2)) && (r(this.kht, this.jIU)))
        {
          if (this.kho.khc != null)
          {
            ap.AS();
            c.yQ().SX(this.kho.khc);
            ap.AS();
            paramView = c.yQ().SV("floatbottle");
            if ((paramView != null) && (!bg.mZ(paramView.field_username)))
            {
              paramView.dz(h.zC());
              ap.AS();
              c.yQ().a(paramView, paramView.field_username);
            }
          }
          this.kgS.onClick(this.kho);
        }
      }
    }
  }
  
  public void setVisibility(int paramInt)
  {
    GMTrace.i(7618600894464L, 56763);
    this.khn.setVisibility(paramInt);
    this.kho.setVisibility(8);
    super.setVisibility(paramInt);
    GMTrace.o(7618600894464L, 56763);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/PickBottleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */