package com.tencent.mm.plugin.card.ui.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.m;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends i
{
  private View kzJ;
  
  public e()
  {
    GMTrace.i(4989409820672L, 37174);
    GMTrace.o(4989409820672L, 37174);
  }
  
  public final void MH()
  {
    GMTrace.i(4989544038400L, 37175);
    GMTrace.o(4989544038400L, 37175);
  }
  
  public final void amb()
  {
    GMTrace.i(4989812473856L, 37177);
    if (this.kzJ != null) {
      this.kzJ.setVisibility(8);
    }
    GMTrace.o(4989812473856L, 37177);
  }
  
  public final void update()
  {
    GMTrace.i(4989678256128L, 37176);
    b localb = this.kzR.akL();
    jh localjh = localb.aiK().tFk;
    if (localjh != null)
    {
      w.i("MicroMsg.CardAnnoucementView", "card tp annoucement  endtime: " + localjh.pwk);
      w.i("MicroMsg.CardAnnoucementView", "card tp annoucement  text: " + localjh.text);
      w.i("MicroMsg.CardAnnoucementView", "card tp annoucement  thumb_url: " + localjh.tEJ);
    }
    if ((localjh != null) && (!TextUtils.isEmpty(localjh.text)) && (localb.aiI()))
    {
      if (this.kzJ == null) {
        this.kzJ = ((ViewStub)findViewById(R.h.boL)).inflate();
      }
      ((TextView)this.kzJ.findViewById(R.h.clh)).setText(localjh.text);
      this.kzJ.setOnClickListener(this.kzR.akP());
      GMTrace.o(4989678256128L, 37176);
      return;
    }
    if (this.kzJ != null) {
      this.kzJ.setVisibility(8);
    }
    GMTrace.o(4989678256128L, 37176);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */