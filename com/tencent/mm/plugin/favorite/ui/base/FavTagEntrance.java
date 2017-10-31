package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public class FavTagEntrance
  extends LinearLayout
  implements j.a
{
  private long fHL;
  private TextView lUs;
  private String lUt;
  
  public FavTagEntrance(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6457483329536L, 48112);
    this.fHL = -1L;
    this.lUt = String.valueOf(this.fHL);
    GMTrace.o(6457483329536L, 48112);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(6458020200448L, 48116);
    w.d("MicroMsg.FavTagEntrence", "on notify change event %s, favIDStr %s", new Object[] { paramString, this.lUt });
    if (this.lUt.equals(paramString))
    {
      paramString = com.tencent.mm.plugin.favorite.h.awD().cc(this.fHL);
      if (paramString == null)
      {
        w.w("MicroMsg.FavTagEntrence", "id[%d] info is null, return", new Object[] { Long.valueOf(this.fHL) });
        GMTrace.o(6458020200448L, 48116);
        return;
      }
      ay(paramString.field_tagProto.tQM);
    }
    GMTrace.o(6458020200448L, 48116);
  }
  
  public final void ay(List<String> paramList)
  {
    GMTrace.i(6457885982720L, 48115);
    if (this.lUs == null)
    {
      GMTrace.o(6457885982720L, 48115);
      return;
    }
    paramList = x.a(getContext(), paramList);
    if (bg.mZ(paramList))
    {
      this.lUs.setText("");
      this.lUs.setHint(R.l.dWw);
      GMTrace.o(6457885982720L, 48115);
      return;
    }
    this.lUs.setText(com.tencent.mm.pluginsdk.ui.d.h.b(getContext(), paramList, this.lUs.getTextSize()));
    GMTrace.o(6457885982720L, 48115);
  }
  
  public final void ct(long paramLong)
  {
    GMTrace.i(6457751764992L, 48114);
    this.fHL = paramLong;
    this.lUt = String.valueOf(paramLong);
    GMTrace.o(6457751764992L, 48114);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(6457617547264L, 48113);
    super.onFinishInflate();
    this.lUs = ((TextView)findViewById(R.h.czL));
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6456812240896L, 48107);
        paramAnonymousView = new Intent(FavTagEntrance.this.getContext(), FavTagEditUI.class);
        paramAnonymousView.putExtra("key_fav_scene", 1);
        paramAnonymousView.putExtra("key_fav_item_id", FavTagEntrance.a(FavTagEntrance.this));
        FavTagEntrance.this.getContext().startActivity(paramAnonymousView);
        GMTrace.o(6456812240896L, 48107);
      }
    });
    GMTrace.o(6457617547264L, 48113);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/base/FavTagEntrance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */