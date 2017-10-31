package com.tencent.mm.plugin.card.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.k;
import com.tencent.mm.plugin.card.a.k.a;
import com.tencent.mm.plugin.card.b.b;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class i
  implements k.a
{
  public MMActivity jFp;
  View krg;
  boolean ksQ;
  View kxT;
  TextView kxU;
  ImageView kxV;
  View kxW;
  TextView kxX;
  ImageView kxY;
  
  public i(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(5005381730304L, 37293);
    this.ksQ = false;
    this.jFp = paramMMActivity;
    this.krg = paramView;
    GMTrace.o(5005381730304L, 37293);
  }
  
  public final void a(com.tencent.mm.plugin.card.model.g paramg)
  {
    GMTrace.i(5005515948032L, 37294);
    alj();
    GMTrace.o(5005515948032L, 37294);
  }
  
  public final void ahA()
  {
    GMTrace.i(5005650165760L, 37295);
    GMTrace.o(5005650165760L, 37295);
  }
  
  public final void alj()
  {
    GMTrace.i(5005784383488L, 37296);
    int i = al.ajG().kni;
    if ((i > 0) && (this.ksQ))
    {
      ap.AS();
      String str1 = (String)c.xi().get(w.a.uVs, "");
      ap.AS();
      String str2 = (String)c.xi().get(w.a.uVt, "");
      int j = this.jFp.getResources().getDimensionPixelOffset(R.f.aSR);
      if (!TextUtils.isEmpty(str2))
      {
        m.a(this.kxV, str2, j, R.g.aXf, true);
        if (TextUtils.isEmpty(str1)) {
          break label198;
        }
        this.kxU.setText(str1);
        label116:
        this.kxT.setVisibility(0);
        if (this.kxW != null)
        {
          if (TextUtils.isEmpty(str2)) {
            break label229;
          }
          m.a(this.kxY, str2, j, R.g.aXf, true);
          label153:
          if (TextUtils.isEmpty(str1)) {
            break label242;
          }
          this.kxX.setText(str1);
        }
      }
      for (;;)
      {
        this.kxW.setVisibility(0);
        GMTrace.o(5005784383488L, 37296);
        return;
        this.kxV.setImageResource(R.g.aXf);
        break;
        label198:
        this.kxU.setText(this.jFp.getString(R.l.dFv, new Object[] { Integer.valueOf(i) }));
        break label116;
        label229:
        this.kxY.setImageResource(R.g.aXf);
        break label153;
        label242:
        this.kxX.setText(this.jFp.getString(R.l.dFv, new Object[] { Integer.valueOf(i) }));
      }
    }
    this.kxT.setVisibility(8);
    if (this.kxW != null) {
      this.kxW.setVisibility(8);
    }
    GMTrace.o(5005784383488L, 37296);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */