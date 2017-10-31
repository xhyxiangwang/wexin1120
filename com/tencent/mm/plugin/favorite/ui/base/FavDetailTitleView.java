package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import com.tencent.mm.x.n;

public class FavDetailTitleView
  extends LinearLayout
{
  private ImageView iiL;
  private TextView iiM;
  
  public FavDetailTitleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6445403734016L, 48022);
    GMTrace.o(6445403734016L, 48022);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(6445537951744L, 48023);
    super.onFinishInflate();
    this.iiL = ((ImageView)findViewById(R.h.bjt));
    this.iiM = ((TextView)findViewById(R.h.cBJ));
    GMTrace.o(6445537951744L, 48023);
  }
  
  public final void z(j paramj)
  {
    GMTrace.i(6445672169472L, 48024);
    if ((paramj == null) || (paramj.field_favProto == null))
    {
      GMTrace.o(6445672169472L, 48024);
      return;
    }
    if ((14 == paramj.field_type) && (!bg.mZ(paramj.field_favProto.title)))
    {
      paramj = paramj.field_favProto.title;
      this.iiL.setVisibility(8);
    }
    for (;;)
    {
      paramj = h.b(getContext(), paramj, this.iiM.getTextSize());
      this.iiM.setText(paramj);
      GMTrace.o(6445672169472L, 48024);
      return;
      this.iiL.setVisibility(0);
      ta localta = paramj.field_favProto.tQA;
      if ((localta != null) && (!bg.mZ(localta.tQf)))
      {
        str1 = n.fc(localta.tQf);
        String str2;
        if (m.zF().equals(localta.fFB))
        {
          str2 = x.fd(localta.toUser);
          paramj = str1;
          if (!bg.ap(str2, "").equals(localta.toUser)) {
            paramj = str1 + " - " + str2;
          }
        }
        for (;;)
        {
          w.v("MicroMsg.FavDetailTitleView", "display name, source from[%s] to[%s]", new Object[] { localta.fFB, localta.toUser });
          a.b.a(this.iiL, localta.tQf);
          break;
          str2 = x.fd(localta.fFB);
          paramj = str1;
          if (!bg.ap(str2, "").equals(localta.fFB)) {
            paramj = str1 + " - " + str2;
          }
        }
      }
      w.v("MicroMsg.FavDetailTitleView", "display name, from item info user[%s]", new Object[] { paramj.field_fromUser });
      String str1 = x.fd(paramj.field_fromUser);
      a.b.a(this.iiL, paramj.field_fromUser);
      paramj = str1;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/FavDetailTitleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */