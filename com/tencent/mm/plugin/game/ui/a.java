package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.c.dp;

public final class a
  extends b<dp>
{
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12690554617856L, 94552);
    GMTrace.o(12690554617856L, 94552);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12690688835584L, 94553);
    dp localdp = (dp)getItem(paramInt);
    Bitmap localBitmap;
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, R.i.cMI, null);
      paramViewGroup = new a();
      paramViewGroup.mGS = ((ImageView)paramView.findViewById(R.h.bMC));
      paramViewGroup.mGU = ((TextView)paramView.findViewById(R.h.bgc));
      paramViewGroup.mGT = ((TextView)paramView.findViewById(R.h.bNj));
      paramView.setTag(paramViewGroup);
      localBitmap = zk(localdp.mCH);
      if (localBitmap != null) {
        break label176;
      }
      paramViewGroup.mGS.setImageResource(R.g.aVT);
      label115:
      paramViewGroup.mGT.setText(g.m(this.mContext, localdp.mCH));
      if (!g.Ny(localdp.mCH)) {
        break label188;
      }
      paramViewGroup.mGU.setText(R.l.edY);
    }
    for (;;)
    {
      GMTrace.o(12690688835584L, 94553);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label176:
      paramViewGroup.mGS.setImageBitmap(localBitmap);
      break label115;
      label188:
      paramViewGroup.mGU.setText(R.l.edZ);
    }
  }
  
  static final class a
  {
    public ImageView mGS;
    public TextView mGT;
    public TextView mGU;
    
    a()
    {
      GMTrace.i(12747060281344L, 94973);
      GMTrace.o(12747060281344L, 94973);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */