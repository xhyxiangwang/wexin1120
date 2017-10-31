package com.tencent.mm.plugin.collect.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.ac.k;
import com.tencent.mm.plugin.collect.b.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.c.s;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.m;

public class CollectHKMainUI
  extends CollectMainUI
{
  private boolean kNO;
  
  public CollectHKMainUI()
  {
    GMTrace.i(17424011231232L, 129819);
    this.kNO = false;
    GMTrace.o(17424011231232L, 129819);
  }
  
  protected final void aoi()
  {
    GMTrace.i(17424413884416L, 129822);
    ap.AS();
    this.kOl = ((String)c.xi().get(w.a.vcp, ""));
    l locall = new l(m.zM());
    if (!bg.mZ(this.kOl))
    {
      cjr().a(locall, false, 1);
      GMTrace.o(17424413884416L, 129822);
      return;
    }
    w.i("MicroMsg.CollectHKMainUI", "force load payurl");
    this.kNO = true;
    cjr().a(locall, true, 1);
    GMTrace.o(17424413884416L, 129822);
  }
  
  protected final String aoj()
  {
    GMTrace.i(17424548102144L, 129823);
    String str = this.kOm;
    GMTrace.o(17424548102144L, 129823);
    return str;
  }
  
  protected final String aok()
  {
    GMTrace.i(17424682319872L, 129824);
    if (bg.mZ(this.kOn)) {
      this.kOn = s.ciV();
    }
    String str = this.kOn;
    GMTrace.o(17424682319872L, 129824);
    return str;
  }
  
  protected final void aol()
  {
    GMTrace.i(17425084973056L, 129827);
    ImageView localImageView1 = (ImageView)this.kMb.findViewById(R.h.bwB);
    ImageView localImageView2 = (ImageView)this.kMb.findViewById(R.h.bws);
    localImageView1.setImageResource(R.k.dnr);
    localImageView2.setImageResource(R.k.dno);
    GMTrace.o(17425084973056L, 129827);
  }
  
  protected final void aom()
  {
    GMTrace.i(17809752981504L, 132693);
    super.aom();
    if (this.kOt)
    {
      findViewById(R.h.bwm).setVisibility(8);
      GMTrace.o(17809752981504L, 132693);
      return;
    }
    findViewById(R.h.bwm).setVisibility(0);
    GMTrace.o(17809752981504L, 132693);
  }
  
  public final boolean f(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(17424816537600L, 129825);
    if ((paramk instanceof l))
    {
      paramString = (l)paramk;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.kKx == 0)
        {
          this.kOl = paramString.kKz;
          this.kOm = paramString.kKL;
          this.kOn = paramString.kKI;
          amr();
          if (!bg.mZ(paramString.kKF))
          {
            this.kOG.setText(paramString.kKF);
            this.kOJ.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(19343458959360L, 144120);
                e.m(CollectHKMainUI.this.vov.voR, paramString.kKG, false);
                GMTrace.o(19343458959360L, 144120);
              }
            });
            this.kOJ.setVisibility(0);
            if (bg.mZ(paramString.kKJ)) {
              break label177;
            }
            this.kOi.setText(paramString.kKJ);
            this.kOi.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                GMTrace.i(17423877013504L, 129818);
                if (!bg.mZ(paramString.kKK)) {
                  e.m(CollectHKMainUI.this.vov.voR, paramString.kKK, true);
                }
                GMTrace.o(17423877013504L, 129818);
              }
            });
            this.kOi.setVisibility(0);
          }
          for (;;)
          {
            GMTrace.o(17424816537600L, 129825);
            return true;
            this.kOJ.setVisibility(8);
            break;
            label177:
            this.kOi.setVisibility(8);
          }
        }
      }
      else {
        w.e("MicroMsg.CollectHKMainUI", "net error: %s", new Object[] { paramk });
      }
      if (!this.kNO)
      {
        GMTrace.o(17424816537600L, 129825);
        return true;
      }
    }
    GMTrace.o(17424816537600L, 129825);
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(17424145448960L, 129820);
    super.onCreate(paramBundle);
    this.kOJ.setVisibility(8);
    findViewById(R.h.bwm).setVisibility(0);
    findViewById(R.h.bwE).setVisibility(8);
    cjr().hz(1335);
    a(0, R.g.bfr, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(17415152861184L, 129753);
        e.m(CollectHKMainUI.this.vov.voR, "https://hkwallet.moneydata.hk/hybrid/www/weixin/f2f/zh_hk/faq.shtml", true);
        GMTrace.o(17415152861184L, 129753);
        return false;
      }
    });
    GMTrace.o(17424145448960L, 129820);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(17424279666688L, 129821);
    super.onDestroy();
    cjr().hA(1335);
    GMTrace.o(17424279666688L, 129821);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectHKMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */