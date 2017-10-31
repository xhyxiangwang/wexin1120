package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class f
  extends l
{
  private int mIr;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12691494141952L, 94559);
    this.mIr = 1;
    this.mNf = R.i.cVY;
    GMTrace.o(12691494141952L, 94559);
  }
  
  protected final void a(c paramc, l.b paramb)
  {
    GMTrace.i(12691762577408L, 94561);
    GMTrace.o(12691762577408L, 94561);
  }
  
  protected final void a(c paramc, l.b paramb, int paramInt)
  {
    GMTrace.i(12691628359680L, 94560);
    paramb.mNp.setText(paramc.position);
    Bitmap localBitmap = zk(paramc.field_appId);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      paramb.mGS.setImageBitmap(localBitmap);
      paramb.mGT.setText(paramc.field_appName);
      if (!bg.mZ(paramc.myY)) {
        break label242;
      }
      paramb.mNt.setVisibility(8);
      label94:
      if (bg.bX(paramc.mzi)) {
        break label264;
      }
      paramb.mNr.setVisibility(0);
      paramb.mNr.setText((CharSequence)paramc.mzi.get(0));
    }
    for (;;)
    {
      paramb.mNv.oN(this.mKn);
      paramb.mNu.setOnClickListener(this.mLd);
      paramb.mNv.setOnClickListener(this.mLd);
      paramb.mNu.setTag(paramc);
      paramb.mNv.setTag(paramc);
      this.mKs.a(paramb.mNv, paramb.mNu, paramc, (m)this.mNj.get(paramc.field_appId));
      paramb.mNw.I(paramc.mzg);
      GMTrace.o(12691628359680L, 94560);
      return;
      paramb.mGS.setImageResource(R.g.aZb);
      break;
      label242:
      paramb.mNt.setVisibility(0);
      paramb.mNt.setText(paramc.myY);
      break label94;
      label264:
      if (!bg.mZ(paramc.mzl))
      {
        paramb.mNr.setVisibility(0);
        paramb.mNr.setText(paramc.mzl);
      }
      try
      {
        paramb.mNr.setBackgroundDrawable(com.tencent.mm.plugin.game.model.e.bM(Color.parseColor(paramc.mzm), a.fromDPToPix(this.mContext, 10)));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        w.e("MicroMsg.GameCenterListAdapter", localIllegalArgumentException.getMessage());
        paramb.mNr.setVisibility(8);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.GameCenterListAdapter", localException.getMessage());
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */