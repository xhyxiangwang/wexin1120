package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.wallet_core.d.a;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static View a(Context paramContext, View paramView, Bankcard paramBankcard, int paramInt, a parama, boolean paramBoolean)
  {
    GMTrace.i(16594008801280L, 123635);
    a locala;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = View.inflate(paramContext, paramInt, null);
      locala = new a();
      locala.rEE = ((ImageView)paramView.findViewById(R.h.bkF));
      locala.rEA = ((TextView)paramView.findViewById(R.h.bkG));
      locala.rEB = ((TextView)paramView.findViewById(R.h.blc));
      locala.rEz = ((TextView)paramView.findViewById(R.h.bkO));
      locala.rEF = ((TextView)paramView.findViewById(R.h.bkN));
      locala.rXW = ((ViewGroup)paramView.findViewById(R.h.cIg));
      locala.rED = ((ImageView)paramView.findViewById(R.h.bkW));
      locala.rEG = ((TextView)paramView.findViewById(R.h.bkJ));
      locala.rXY = ((ViewGroup)paramView.findViewById(R.h.bkL));
      locala.rXZ = ((TextView)paramView.findViewById(R.h.bkI));
      locala.rYa = ((ImageView)paramView.findViewById(R.h.bkX));
      paramView.setTag(locala);
      if (paramBankcard.field_bankcardState != 1) {
        break label403;
      }
      locala.rEF.setVisibility(0);
      label223:
      if (locala.rYa != null)
      {
        if (!paramBoolean) {
          break label416;
        }
        locala.rYa.setVisibility(0);
      }
      label245:
      locala.rEA.setText(paramBankcard.field_bankName);
      if (!com.tencent.mm.x.m.zS()) {
        break label429;
      }
      locala.rEB.setVisibility(8);
      label273:
      if (locala.rEz != null) {
        locala.rEz.setText(paramBankcard.field_bankcardTail);
      }
      if ((bg.mZ(paramBankcard.field_card_bottom_wording)) || (locala.rXZ == null)) {
        break label510;
      }
      locala.rXZ.setText(paramBankcard.field_card_bottom_wording);
      locala.rXY.setVisibility(0);
    }
    for (;;)
    {
      parama.a(paramContext, paramBankcard, locala.rEE, locala.rXW, locala.rED);
      if (locala.rEG != null)
      {
        com.tencent.mm.plugin.wallet_core.model.m.bwE();
        paramContext = paramBankcard.field_bindSerial;
        locala.rEG.setVisibility(8);
      }
      GMTrace.o(16594008801280L, 123635);
      return paramView;
      locala = (a)paramView.getTag();
      break;
      label403:
      locala.rEF.setVisibility(8);
      break label223;
      label416:
      locala.rYa.setVisibility(8);
      break label245;
      label429:
      if (!bg.mZ(paramBankcard.field_bankcardTypeName))
      {
        locala.rEB.setText(paramBankcard.field_bankcardTypeName);
        break label273;
      }
      if (paramBankcard.bwl())
      {
        locala.rEB.setText(R.l.fas);
        break label273;
      }
      if (paramBankcard.bwo())
      {
        locala.rEB.setText(R.l.eUc);
        break label273;
      }
      locala.rEB.setText(R.l.eUr);
      break label273;
      label510:
      locala.rXY.setVisibility(8);
    }
  }
  
  public static Drawable c(Context paramContext, Bitmap paramBitmap)
  {
    GMTrace.i(6970463485952L, 51934);
    if (paramBitmap == null)
    {
      GMTrace.o(6970463485952L, 51934);
      return null;
    }
    try
    {
      byte[] arrayOfByte = paramBitmap.getNinePatchChunk();
      if (NinePatch.isNinePatchChunk(arrayOfByte))
      {
        paramContext = new NinePatchDrawable(paramContext.getResources(), paramBitmap, arrayOfByte, new Rect(), null);
        paramContext.setBounds(0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
        GMTrace.o(6970463485952L, 51934);
        return paramContext;
      }
      paramContext = new BitmapDrawable(paramBitmap);
      GMTrace.o(6970463485952L, 51934);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.f("MicroMsg.BankcardListAdapter", paramContext.getMessage());
      w.printErrStackTrace("MicroMsg.BankcardListAdapter", paramContext, "", new Object[0]);
      GMTrace.o(6970463485952L, 51934);
    }
    return null;
  }
  
  static final class a
    implements j.a
  {
    public TextView rEA;
    public TextView rEB;
    public ImageView rED;
    public ImageView rEE;
    public TextView rEF;
    public TextView rEG;
    public TextView rEH;
    public TextView rEz;
    public ViewGroup rXW;
    public e rXX;
    public ViewGroup rXY;
    public TextView rXZ;
    public ImageView rYa;
    
    a()
    {
      GMTrace.i(6966436954112L, 51904);
      this.rEz = null;
      this.rEA = null;
      this.rEB = null;
      this.rXW = null;
      this.rED = null;
      this.rEE = null;
      this.rEF = null;
      this.rEG = null;
      this.rEH = null;
      this.rXY = null;
      this.rXZ = null;
      this.rYa = null;
      GMTrace.o(6966436954112L, 51904);
    }
    
    public final void k(String paramString, final Bitmap paramBitmap)
    {
      GMTrace.i(6966571171840L, 51905);
      StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(", bitmap = ");
      if (paramBitmap == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.d("MicroMsg.BankcardListAdapter", bool);
        if (this.rXX != null) {
          break;
        }
        GMTrace.o(6966571171840L, 51905);
        return;
      }
      if (paramString.equals(this.rXX.oiq)) {
        this.rEE.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6965497430016L, 51897);
            b.a.this.rEE.setImageBitmap(paramBitmap);
            b.a.this.rXW.invalidate();
            GMTrace.o(6965497430016L, 51897);
          }
        });
      }
      if ((paramString.equals(this.rXX.rNl)) && (this.rED != null)) {
        this.rED.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6965765865472L, 51899);
            b.a.this.rED.setImageBitmap(paramBitmap);
            GMTrace.o(6965765865472L, 51899);
          }
        });
      }
      GMTrace.o(6966571171840L, 51905);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */