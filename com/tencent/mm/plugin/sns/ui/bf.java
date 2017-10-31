package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.c.c;

public final class bf
{
  private String nkl;
  private LinearLayout qSh;
  public TextView qSi;
  public TextView qSj;
  private View qSk;
  private View qSl;
  public com.tencent.mm.plugin.sns.storage.b qSm;
  public com.tencent.mm.plugin.sns.storage.a qSn;
  private View view;
  
  public bf(View paramView)
  {
    GMTrace.i(8683484348416L, 64697);
    this.view = paramView;
    this.nkl = v.eq(ab.getContext());
    w.i("MicroMsg.TimeLineAdView", "adView init lan " + this.nkl);
    this.qSi = ((TextView)this.view.findViewById(i.f.pHR));
    this.qSj = ((TextView)this.view.findViewById(i.f.pHU));
    this.qSk = this.view.findViewById(i.f.pHS);
    this.qSl = this.view.findViewById(i.f.pHT);
    this.qSh = ((LinearLayout)this.view.findViewById(i.f.pHQ));
    paramView = " " + this.view.getResources().getString(i.j.pRB) + " ";
    this.qSi.setText(paramView);
    GMTrace.o(8683484348416L, 64697);
  }
  
  public final void a(View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    GMTrace.i(8683618566144L, 64698);
    this.qSj.setOnClickListener(paramOnClickListener1);
    this.qSi.setOnClickListener(paramOnClickListener2);
    if (this.qSk != null) {
      this.qSk.setOnClickListener(paramOnClickListener2);
    }
    if (this.qSh != null) {
      this.qSh.setOnClickListener(paramOnClickListener2);
    }
    GMTrace.o(8683618566144L, 64698);
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.b paramb, com.tencent.mm.plugin.sns.storage.a parama)
  {
    GMTrace.i(8683887001600L, 64700);
    this.qSn = parama;
    this.qSm = paramb;
    final Object localObject1 = "";
    if (paramb != null)
    {
      if ("zh_CN".equals(this.nkl)) {
        localObject1 = paramb.qlx;
      }
    }
    else
    {
      Object localObject2 = localObject1;
      if (paramb != null)
      {
        localObject2 = localObject1;
        if (bg.mZ((String)localObject1)) {
          localObject2 = paramb.qlv;
        }
      }
      Context localContext = this.qSj.getContext();
      localObject1 = localObject2;
      if (bg.mZ((String)localObject2)) {
        localObject1 = localContext.getString(i.j.pRF);
      }
      final int i = ((String)localObject1).length();
      localObject1 = new SpannableString((String)localObject1 + "ad_");
      localObject2 = localContext.getResources().getDrawable(i.i.pQb);
      if (!bg.mZ(paramb.qlw)) {
        d.a("adId", paramb.qlw, false, 41, 0, new d.a()
        {
          public final void Hp(String paramAnonymousString)
          {
            GMTrace.i(8764954509312L, 65304);
            if (bg.mZ(paramAnonymousString))
            {
              GMTrace.o(8764954509312L, 65304);
              return;
            }
            paramAnonymousString = Drawable.createFromPath(paramAnonymousString);
            if (paramAnonymousString != null)
            {
              paramAnonymousString.setBounds(0, 0, (int)(bf.this.qSj.getTextSize() * 1.3D), (int)(bf.this.qSj.getTextSize() * 1.3D));
              paramAnonymousString = new ImageSpan(paramAnonymousString, 0);
              localObject1.setSpan(paramAnonymousString, i, i + 3, 33);
              bf.this.qSj.setText(localObject1);
            }
            GMTrace.o(8764954509312L, 65304);
          }
          
          public final void biT()
          {
            GMTrace.i(8764686073856L, 65302);
            GMTrace.o(8764686073856L, 65302);
          }
          
          public final void biU()
          {
            GMTrace.i(8764820291584L, 65303);
            GMTrace.o(8764820291584L, 65303);
          }
        });
      }
      ((Drawable)localObject2).setBounds(0, 0, (int)(this.qSj.getTextSize() * 1.3D), (int)(this.qSj.getTextSize() * 1.3D));
      ((SpannableString)localObject1).setSpan(new ImageSpan((Drawable)localObject2, 0), i, i + 3, 33);
      this.qSj.setText((CharSequence)localObject1);
      if ((parama == null) || (bg.mZ(parama.qlh))) {
        break label356;
      }
      this.qSl.setVisibility(0);
      label268:
      if (paramb != null)
      {
        if (!"zh_CN".equals(this.nkl)) {
          break label368;
        }
        paramb = paramb.qlK;
      }
    }
    for (;;)
    {
      if (!bg.mZ(paramb)) {
        this.qSi.setText(paramb);
      }
      GMTrace.o(8683887001600L, 64700);
      return;
      if (("zh_TW".equals(this.nkl)) || ("zh_HK".equals(this.nkl)))
      {
        localObject1 = paramb.qlz;
        break;
      }
      localObject1 = paramb.qly;
      break;
      label356:
      this.qSl.setVisibility(8);
      break label268;
      label368:
      if (("zh_TW".equals(this.nkl)) || ("zh_HK".equals(this.nkl))) {
        paramb = paramb.qlM;
      } else {
        paramb = paramb.qlL;
      }
    }
  }
  
  public final String bnW()
  {
    GMTrace.i(8683215912960L, 64695);
    if (this.qSn == null)
    {
      GMTrace.o(8683215912960L, 64695);
      return "";
    }
    if (this.qSn.qhb == null)
    {
      GMTrace.o(8683215912960L, 64695);
      return "";
    }
    String str = this.qSn.qhb;
    GMTrace.o(8683215912960L, 64695);
    return str;
  }
  
  public final int[] bnX()
  {
    GMTrace.i(8683350130688L, 64696);
    int[] arrayOfInt = new int[2];
    if (this.qSh != null)
    {
      this.qSk.getLocationInWindow(arrayOfInt);
      arrayOfInt[0] += this.qSk.getMeasuredWidth();
    }
    for (;;)
    {
      GMTrace.o(8683350130688L, 64696);
      return arrayOfInt;
      if (this.qSk != null)
      {
        this.qSk.getLocationInWindow(arrayOfInt);
        arrayOfInt[0] += this.qSk.getMeasuredWidth();
      }
    }
  }
  
  public final void p(Object paramObject1, Object paramObject2)
  {
    GMTrace.i(8683752783872L, 64699);
    this.qSj.setTag(paramObject1);
    this.qSi.setTag(paramObject2);
    if (this.qSk != null) {
      this.qSk.setTag(paramObject2);
    }
    if (this.qSh != null) {
      this.qSh.setTag(paramObject2);
    }
    GMTrace.o(8683752783872L, 64699);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(8684021219328L, 64701);
    com.tencent.mm.storage.a locala;
    if ((this.qSm != null) && (this.qSm.qlu == 1))
    {
      this.qSj.setVisibility(8);
      locala = c.Cv().Sl("Sns_CanvasAd_DetailLink_JumpWay");
      if (!locala.isValid()) {
        break label211;
      }
    }
    label211:
    for (int i = bg.getInt(locala.field_value, -1);; i = -1)
    {
      if ((i != -1) && (this.qSm != null) && (this.qSm.qln) && (e.Hu(this.qSm.fId))) {
        this.qSj.setVisibility(paramInt);
      }
      this.qSi.setVisibility(paramInt);
      if (this.qSk != null) {
        this.qSk.setVisibility(paramInt);
      }
      if (this.qSh != null) {
        this.qSh.setVisibility(paramInt);
      }
      if ((this.qSn != null) && (!bg.mZ(this.qSn.qlh)))
      {
        this.qSl.setVisibility(paramInt);
        GMTrace.o(8684021219328L, 64701);
        return;
        this.qSj.setVisibility(paramInt);
        break;
      }
      this.qSl.setVisibility(8);
      GMTrace.o(8684021219328L, 64701);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */