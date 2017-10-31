package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.q;
import com.tencent.mm.plugin.game.model.q.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class v
  implements View.OnClickListener
{
  private int hJp;
  private int jR;
  private int mBs;
  private Context mContext;
  private int mQG;
  
  public v(Context paramContext)
  {
    GMTrace.i(12772158996480L, 95160);
    this.mContext = paramContext;
    this.hJp = 13;
    GMTrace.o(12772158996480L, 95160);
  }
  
  public final void cj(int paramInt1, int paramInt2)
  {
    GMTrace.i(12772293214208L, 95161);
    this.mBs = paramInt1;
    this.mQG = 1301;
    this.jR = paramInt2;
    GMTrace.o(12772293214208L, 95161);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(12772427431936L, 95162);
    if (paramView.getTag() == null)
    {
      GMTrace.o(12772427431936L, 95162);
      return;
    }
    int i;
    if ((paramView.getTag() instanceof q))
    {
      paramView = (q)paramView.getTag();
      if (!bg.bX(paramView.mAo))
      {
        String str = ((q.h)paramView.mAo.get(0)).mBn;
        if (!bg.mZ(str))
        {
          i = c.aa(this.mContext, str);
          ai.a(this.mContext, this.hJp, this.mQG, this.jR, i, 0, paramView.field_appId, this.mBs, paramView.field_msgType, paramView.field_gameMsgId, paramView.mAY, null);
          GMTrace.o(12772427431936L, 95162);
          return;
        }
        w.e("MicroMsg.GameURLClickListener", "message's jumpurl is null");
      }
      GMTrace.o(12772427431936L, 95162);
      return;
    }
    if ((paramView.getTag() instanceof String))
    {
      paramView = (String)paramView.getTag();
      if (bg.mZ(paramView))
      {
        GMTrace.o(12772427431936L, 95162);
        return;
      }
      i = c.aa(this.mContext, paramView);
      ai.a(this.mContext, this.hJp, this.mQG, this.jR, i, this.mBs, null);
    }
    GMTrace.o(12772427431936L, 95162);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */