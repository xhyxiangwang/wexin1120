package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.f;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class k
  extends j
{
  RelativeLayout nnx;
  Button qpM;
  
  public k(Context paramContext, i parami, ViewGroup paramViewGroup)
  {
    super(paramContext, parami, paramViewGroup);
    GMTrace.i(8252242788352L, 61484);
    GMTrace.o(8252242788352L, 61484);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8252511223808L, 61486);
    int i = i.g.pOn;
    GMTrace.o(8252511223808L, 61486);
    return i;
  }
  
  @TargetApi(17)
  public final View biL()
  {
    GMTrace.i(8253048094720L, 61490);
    View localView = this.iiK;
    this.nnx = ((RelativeLayout)localView.findViewById(i.f.pLr));
    this.qpM = ((Button)localView.findViewById(i.f.pLq));
    GMTrace.o(8253048094720L, 61490);
    return localView;
  }
  
  @TargetApi(17)
  protected final void biR()
  {
    int j = 1;
    GMTrace.i(8252645441536L, 61487);
    this.qpv = 0;
    int k = ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay().getWidth();
    this.nnx.setBackgroundColor(this.backgroundColor);
    if (!bg.mZ(((i)this.qpH).qmZ)) {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a("adId", ((i)this.qpH).qmZ, false, 0, 0, new d.a()
      {
        @TargetApi(16)
        public final void Hp(String paramAnonymousString)
        {
          GMTrace.i(8256806191104L, 61518);
          try
          {
            k.this.qpM.setBackground(Drawable.createFromPath(paramAnonymousString));
            GMTrace.o(8256806191104L, 61518);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the backgroundCoverUrl is set error ,because " + paramAnonymousString.toString());
            GMTrace.o(8256806191104L, 61518);
          }
        }
        
        public final void biT()
        {
          GMTrace.i(8256537755648L, 61516);
          GMTrace.o(8256537755648L, 61516);
        }
        
        public final void biU()
        {
          GMTrace.i(8256671973376L, 61517);
          GMTrace.o(8256671973376L, 61517);
        }
      });
    }
    for (;;)
    {
      this.qpM.setText(((i)this.qpH).title);
      d(this.qpM);
      this.qpM.setTextSize(0, ((i)this.qpH).qmV);
      int i;
      if ((((i)this.qpH).qmU != null) && (((i)this.qpH).qmU.length() > 0))
      {
        i = Color.parseColor(((i)this.qpH).qmU);
        this.qpM.setTextColor(i);
      }
      try
      {
        this.qpM.setTextAlignment(4);
        this.qpM.setLayoutParams(new RelativeLayout.LayoutParams(k - (int)((i)this.qpH).qns - (int)((i)this.qpH).qnt, this.qpM.getLayoutParams().height));
        GMTrace.o(8252645441536L, 61487);
        return;
        GradientDrawable localGradientDrawable = new GradientDrawable();
        localGradientDrawable.setShape(0);
        if ((!bg.mZ(((i)this.qpH).qmY)) && (((i)this.qpH).qmW > 0.0F)) {
          try
          {
            i = Color.parseColor(((i)this.qpH).qmY);
            localGradientDrawable.setStroke((int)((i)this.qpH).qmW, i);
            i = 1;
            if (bg.mZ(((i)this.qpH).qmX)) {}
          }
          catch (Exception localException2)
          {
            try
            {
              i = Color.parseColor(((i)this.qpH).qmX);
              localGradientDrawable.setColor(i);
              i = j;
              if (i == 0) {
                continue;
              }
              this.qpM.setBackgroundDrawable(localGradientDrawable);
              continue;
              localException2 = localException2;
              w.e("MicroMsg.Sns.AdLandingPageBtnComponent", bg.f(localException2));
              i = 0;
            }
            catch (Exception localException3)
            {
              for (;;)
              {
                w.e("MicroMsg.Sns.AdLandingPageBtnComponent", bg.f(localException3));
                i = 0;
              }
            }
          }
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          w.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the device has no method btn.setTextAlignment");
          continue;
          continue;
          i = 0;
        }
      }
    }
  }
  
  protected final i biZ()
  {
    GMTrace.i(8252377006080L, 61485);
    i locali = (i)this.qpH;
    GMTrace.o(8252377006080L, 61485);
    return locali;
  }
  
  protected final void bja()
  {
    GMTrace.i(8252913876992L, 61489);
    i locali = (i)this.qpH;
    if (locali.fvu == 4)
    {
      localObject = (f)locali;
      w.i("MicroMsg.Sns.AdLandingPageBtnComponent", "ext is " + ((f)localObject).koZ);
      localIntent = new Intent();
      localIntent.putExtra("key_card_id", ((f)localObject).koj);
      localIntent.putExtra("key_card_ext", ((f)localObject).koZ);
      localIntent.putExtra("key_from_scene", 21);
      localIntent.putExtra("key_stastic_scene", 15);
      com.tencent.mm.bi.d.b(this.context, "card", ".ui.CardDetailUI", localIntent);
      GMTrace.o(8252913876992L, 61489);
      return;
    }
    Intent localIntent = new Intent();
    Object localObject = locali.qmS;
    if ((!TextUtils.isEmpty(locali.qlo)) && (!TextUtils.isEmpty(locali.qlp))) {
      localObject = ab.k((String)localObject, new String[] { "traceid=" + locali.qlo + "&aid=" + locali.qlp });
    }
    for (;;)
    {
      w.i("MicroMsg.Sns.AdLandingPageBtnComponent", "open url %s", new Object[] { localObject });
      localIntent.putExtra("rawUrl", (String)localObject);
      localIntent.putExtra("useJs", true);
      localIntent.putExtra("type", 65281);
      localIntent.putExtra("geta8key_scene", 2);
      com.tencent.mm.bi.d.b(this.context, "webview", ".ui.tools.WebViewUI", localIntent);
      GMTrace.o(8252913876992L, 61489);
      return;
    }
  }
  
  protected void d(Button paramButton)
  {
    GMTrace.i(8252779659264L, 61488);
    paramButton.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8259222110208L, 61536);
        k.this.biY();
        k.this.bja();
        GMTrace.o(8259222110208L, 61536);
      }
    });
    GMTrace.o(8252779659264L, 61488);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */