package com.tencent.mm.plugin.card.sharecard.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.ui.MMActivity;

public final class i
{
  MMActivity jFp;
  private View krg;
  View ksN;
  TextView ksO;
  TextView ksP;
  private boolean ksQ;
  
  public i(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(5090475769856L, 37927);
    this.ksQ = false;
    this.jFp = paramMMActivity;
    this.krg = paramView;
    GMTrace.o(5090475769856L, 37927);
  }
  
  public final void ar()
  {
    GMTrace.i(5090609987584L, 37928);
    Integer localInteger = (Integer)al.ajH().getValue("key_share_card_show_type");
    Object localObject = localInteger;
    if (localInteger == null) {
      localObject = Integer.valueOf(0);
    }
    if ((((Integer)localObject).intValue() != 0) && (!b.ajZ()))
    {
      this.ksN.setVisibility(0);
      this.ksO.setVisibility(0);
      localObject = new ShareCardInfo();
      if (!TextUtils.isEmpty(((ShareCardInfo)localObject).ls(10)))
      {
        this.ksO.setVisibility(0);
        this.ksO.setText(((ShareCardInfo)localObject).ls(10));
      }
      while (!TextUtils.isEmpty(""))
      {
        this.ksP.setVisibility(0);
        this.ksP.setText("");
        GMTrace.o(5090609987584L, 37928);
        return;
        this.ksO.setVisibility(8);
      }
      this.ksP.setVisibility(8);
      GMTrace.o(5090609987584L, 37928);
      return;
    }
    this.ksN.setVisibility(8);
    GMTrace.o(5090609987584L, 37928);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */