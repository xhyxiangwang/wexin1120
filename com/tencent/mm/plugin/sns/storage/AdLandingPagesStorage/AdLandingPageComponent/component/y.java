package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class y
  extends a
{
  private Runnable hWd;
  public TextView imU;
  
  public y(Context paramContext, r paramr, ViewGroup paramViewGroup)
  {
    super(paramContext, paramr, paramViewGroup);
    GMTrace.i(8247142514688L, 61446);
    GMTrace.o(8247142514688L, 61446);
  }
  
  protected final int aWs()
  {
    GMTrace.i(8247276732416L, 61447);
    int i = i.g.pOv;
    GMTrace.o(8247276732416L, 61447);
    return i;
  }
  
  @TargetApi(17)
  public final View biL()
  {
    GMTrace.i(8247679385600L, 61450);
    View localView = this.iiK;
    localView.setBackgroundColor(this.backgroundColor);
    localView.findViewById(i.f.pLk).setBackgroundColor(this.backgroundColor);
    localView.findViewById(i.f.pLl).setBackgroundColor(this.backgroundColor);
    this.imU = ((TextView)localView.findViewById(i.f.pLl));
    GMTrace.o(8247679385600L, 61450);
    return localView;
  }
  
  protected final void biR()
  {
    GMTrace.i(8247545167872L, 61449);
    final Object localObject;
    if (((r)this.qpH).fvu == 1)
    {
      if (!bg.mZ(((r)this.qpH).qnH))
      {
        localObject = ((r)this.qpH).qnH.replace("<icon", "<img");
        e.remove(this.hWd);
        this.hWd = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8279891640320L, 61690);
            af.u(new Runnable()
            {
              public final Drawable getDrawable(String paramAnonymous2String)
              {
                GMTrace.i(8236136660992L, 61364);
                String str = d.dz("adId", paramAnonymous2String);
                int i;
                int j;
                if ((!bg.mZ(str)) && (FileOp.aZ(str)))
                {
                  paramAnonymous2String = Drawable.createFromPath(str);
                  if (paramAnonymous2String == null) {
                    break label152;
                  }
                  if (paramAnonymous2String.getIntrinsicHeight() != 0)
                  {
                    i = paramAnonymous2String.getIntrinsicWidth() * (int)y.this.bjm().gUs / paramAnonymous2String.getIntrinsicHeight();
                    if (paramAnonymous2String.getIntrinsicHeight() == 0) {
                      break label122;
                    }
                    j = (int)y.this.bjm().gUs;
                    label96:
                    paramAnonymous2String.setBounds(0, 0, i, j);
                  }
                }
                label122:
                label152:
                for (;;)
                {
                  GMTrace.o(8236136660992L, 61364);
                  return paramAnonymous2String;
                  i = paramAnonymous2String.getIntrinsicWidth();
                  break;
                  j = paramAnonymous2String.getIntrinsicHeight();
                  break label96;
                  d.a("adId", paramAnonymous2String, false, 0, 0, new d.a()
                  {
                    public final void Hp(String paramAnonymous3String)
                    {
                      GMTrace.i(8255329796096L, 61507);
                      try
                      {
                        af.u(new Runnable()
                        {
                          public final Drawable getDrawable(String paramAnonymous4String)
                          {
                            GMTrace.i(8256269320192L, 61514);
                            Object localObject = null;
                            String str = d.dz("adId", paramAnonymous4String);
                            paramAnonymous4String = (String)localObject;
                            int i;
                            if (!bg.mZ(str))
                            {
                              paramAnonymous4String = (String)localObject;
                              if (FileOp.aZ(str))
                              {
                                paramAnonymous4String = Drawable.createFromPath(str);
                                if (paramAnonymous4String.getIntrinsicHeight() == 0) {
                                  break label131;
                                }
                                i = paramAnonymous4String.getIntrinsicWidth() * (int)y.this.bjm().gUs / paramAnonymous4String.getIntrinsicHeight();
                                if (paramAnonymous4String.getIntrinsicHeight() == 0) {
                                  break label139;
                                }
                              }
                            }
                            label131:
                            label139:
                            for (int j = (int)y.this.bjm().gUs;; j = paramAnonymous4String.getIntrinsicHeight())
                            {
                              paramAnonymous4String.setBounds(0, 0, i, j);
                              GMTrace.o(8256269320192L, 61514);
                              return paramAnonymous4String;
                              i = paramAnonymous4String.getIntrinsicWidth();
                              break;
                            }
                          }
                        }
                        {
                          public final void run()
                          {
                            GMTrace.i(8267140956160L, 61595);
                            y.this.imU.setText(this.qrS);
                            GMTrace.o(8267140956160L, 61595);
                          }
                        });
                        GMTrace.o(8255329796096L, 61507);
                        return;
                      }
                      catch (Exception paramAnonymous3String)
                      {
                        w.e("MicroMsg.Sns.AdLandingPageTextComponent", "the backgroundCoverUrl is set error ,because " + paramAnonymous3String.toString());
                        GMTrace.o(8255329796096L, 61507);
                      }
                    }
                    
                    public final void biT()
                    {
                      GMTrace.i(8255061360640L, 61505);
                      GMTrace.o(8255061360640L, 61505);
                    }
                    
                    public final void biU()
                    {
                      GMTrace.i(8255195578368L, 61506);
                      GMTrace.o(8255195578368L, 61506);
                    }
                  });
                  paramAnonymous2String = null;
                }
              }
            }
            {
              public final void run()
              {
                GMTrace.i(8245531901952L, 61434);
                y.this.imU.setText(this.qrS);
                GMTrace.o(8245531901952L, 61434);
              }
            });
            GMTrace.o(8279891640320L, 61690);
          }
        };
        e.post(this.hWd, "");
      }
      if (((r)this.qpH).textAlignment != 0) {
        break label313;
      }
      this.imU.setGravity(3);
      label107:
      if ((((r)this.qpH).qnI == null) || (((r)this.qpH).qnI.length() <= 0)) {
        break label398;
      }
    }
    for (;;)
    {
      try
      {
        i = Color.parseColor(((r)this.qpH).qnI);
        this.imU.setTextColor(i);
        if (((r)this.qpH).gUs > 0.0F) {
          this.imU.setTextSize(0, ((r)this.qpH).gUs);
        }
        localObject = this.imU.getPaint();
        if (((r)this.qpH).qnJ) {
          ((TextPaint)localObject).setFakeBoldText(true);
        }
        if (((r)this.qpH).qnK) {
          ((TextPaint)localObject).setTextSkewX(-0.25F);
        }
        if (((r)this.qpH).qnL) {
          ((TextPaint)localObject).setUnderlineText(true);
        }
        if (((r)this.qpH).maxLines > 0) {
          this.imU.setMaxLines(((r)this.qpH).maxLines);
        }
        GMTrace.o(8247545167872L, 61449);
        return;
        this.imU.setText(((r)this.qpH).qnH);
        break;
        label313:
        if (((r)this.qpH).textAlignment == 1)
        {
          this.imU.setGravity(17);
          break label107;
        }
        if (((r)this.qpH).textAlignment != 2) {
          break label107;
        }
        this.imU.setGravity(5);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.Sns.AdLandingPageTextComponent", "parse the color is error : " + ((r)this.qpH).qnI);
        continue;
      }
      label398:
      int i = Color.parseColor("#FFFFFF");
      this.imU.setTextColor(i);
    }
  }
  
  public final void biu()
  {
    GMTrace.i(8247410950144L, 61448);
    super.biu();
    if (!e.remove(this.hWd)) {
      e.N(this.hWd);
    }
    GMTrace.o(8247410950144L, 61448);
  }
  
  public final void biv()
  {
    GMTrace.i(8247813603328L, 61451);
    super.biv();
    GMTrace.o(8247813603328L, 61451);
  }
  
  public final void biw()
  {
    GMTrace.i(8247947821056L, 61452);
    super.biw();
    GMTrace.o(8247947821056L, 61452);
  }
  
  public final r bjm()
  {
    GMTrace.i(16043045027840L, 119530);
    r localr = (r)this.qpH;
    GMTrace.o(16043045027840L, 119530);
    return localr;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */