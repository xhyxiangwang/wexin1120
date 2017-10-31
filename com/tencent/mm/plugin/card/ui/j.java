package com.tencent.mm.plugin.card.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;

public final class j
{
  public Bitmap ioh;
  public p ioi;
  public ImageView ioj;
  View iok;
  View.OnClickListener iom;
  MMActivity iqJ;
  public b kmJ;
  public Bitmap krk;
  float krs;
  boolean kuB;
  MMVerticalTextView kyA;
  MMVerticalTextView kyB;
  ArrayList<Bitmap> kyC;
  String kyD;
  Bitmap kyv;
  TextView kyw;
  TextView kyx;
  View kyy;
  ImageView kyz;
  
  public j(MMActivity paramMMActivity)
  {
    GMTrace.i(5010884657152L, 37334);
    this.kuB = true;
    this.kyv = null;
    this.ioi = null;
    this.krs = 0.0F;
    this.kyC = new ArrayList();
    this.kyD = "";
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4956123824128L, 36926);
        if ((paramAnonymousView.getId() == R.h.ckf) || (paramAnonymousView.getId() == R.h.ckb))
        {
          if ((j.this.ioi != null) && (j.this.ioi.isShowing())) {
            j.this.ioi.dismiss();
          }
          if (!j.this.kmJ.ait()) {
            j.this.aln();
          }
        }
        GMTrace.o(4956123824128L, 36926);
      }
    };
    this.iqJ = paramMMActivity;
    GMTrace.o(5010884657152L, 37334);
  }
  
  private void Z(float paramFloat)
  {
    GMTrace.i(5011018874880L, 37335);
    WindowManager.LayoutParams localLayoutParams = this.iqJ.getWindow().getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    this.iqJ.getWindow().setAttributes(localLayoutParams);
    GMTrace.o(5011018874880L, 37335);
  }
  
  public final void alm()
  {
    GMTrace.i(5011153092608L, 37336);
    if (this.krs < 0.8F) {
      Z(0.8F);
    }
    GMTrace.o(5011153092608L, 37336);
  }
  
  public final void aln()
  {
    GMTrace.i(5011287310336L, 37337);
    Z(this.krs);
    GMTrace.o(5011287310336L, 37337);
  }
  
  final void alo()
  {
    GMTrace.i(5011421528064L, 37338);
    if (this.kyC.size() > 2)
    {
      int i = this.kyC.size() - 1;
      while (i > 1)
      {
        l.u((Bitmap)this.kyC.remove(i));
        i -= 1;
      }
    }
    GMTrace.o(5011421528064L, 37338);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */