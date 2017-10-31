package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;

public final class e
{
  private ImageView fDY;
  private MMActivity jFp;
  View ksh;
  b ksi;
  protected LinearLayout ksj;
  protected LinearLayout ksk;
  private TextView ksl;
  
  public e(MMActivity paramMMActivity)
  {
    GMTrace.i(5083899101184L, 37878);
    this.jFp = paramMMActivity;
    GMTrace.o(5083899101184L, 37878);
  }
  
  private void akk()
  {
    GMTrace.i(5084435972096L, 37882);
    this.ksj.setVisibility(8);
    this.ksk.setVisibility(8);
    GMTrace.o(5084435972096L, 37882);
  }
  
  public final void akh()
  {
    GMTrace.i(5084033318912L, 37879);
    if (this.ksh == null)
    {
      this.ksh = View.inflate(this.jFp, R.i.cOz, null);
      this.fDY = ((ImageView)this.ksh.findViewById(R.h.bhx));
      this.ksl = ((TextView)this.ksh.findViewById(R.h.cxZ));
      this.ksj = ((LinearLayout)this.ksh.findViewById(R.h.bUi));
      this.ksk = ((LinearLayout)this.ksh.findViewById(R.h.bUg));
      this.ksj.setVisibility(8);
      this.ksk.setVisibility(8);
      RotateAnimation localRotateAnimation = new RotateAnimation(0.0F, 359.0F, 1, 0.5F, 1, 0.5F);
      localRotateAnimation.setDuration(1000L);
      localRotateAnimation.setRepeatCount(-1);
      localRotateAnimation.setInterpolator(new LinearInterpolator());
      this.fDY.startAnimation(localRotateAnimation);
    }
    ar();
    GMTrace.o(5084033318912L, 37879);
  }
  
  public final void aki()
  {
    GMTrace.i(5084167536640L, 37880);
    this.ksj.setVisibility(0);
    this.ksk.setVisibility(8);
    GMTrace.o(5084167536640L, 37880);
  }
  
  public final void akj()
  {
    GMTrace.i(5084301754368L, 37881);
    this.ksj.setVisibility(8);
    GMTrace.o(5084301754368L, 37881);
  }
  
  public final void akl()
  {
    GMTrace.i(5084570189824L, 37883);
    akk();
    this.ksl.setVisibility(8);
    GMTrace.o(5084570189824L, 37883);
  }
  
  public final void ar()
  {
    GMTrace.i(5084704407552L, 37884);
    Integer localInteger2 = (Integer)al.ajH().getValue("key_share_card_show_type");
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    if ((this.ksi != null) && (b.akb()) && ((localInteger1.intValue() == 1) || (localInteger1.intValue() == 4)) && (b.ajY()))
    {
      this.ksl.setVisibility(0);
      akk();
    }
    do
    {
      GMTrace.o(5084704407552L, 37884);
      return;
      this.ksl.setVisibility(8);
      if (this.ksi == null) {
        break;
      }
      w.d("MicroMsg.ShareCardFooterController", "updateView isLocalEnd %s isOtherEnd %s ", new Object[] { Boolean.valueOf(b.akb()), Boolean.valueOf(b.akc()) });
      if ((!b.akb()) || (!b.akc()))
      {
        aki();
        GMTrace.o(5084704407552L, 37884);
        return;
      }
    } while ((!b.akb()) || (!b.akc()));
    this.ksj.setVisibility(8);
    this.ksk.setVisibility(8);
    GMTrace.o(5084704407552L, 37884);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */