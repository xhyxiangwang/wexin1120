package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class k
  extends l
{
  public k(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12724377485312L, 94804);
    this.mNf = R.i.cWD;
    GMTrace.o(12724377485312L, 94804);
  }
  
  protected final void a(c paramc, l.b paramb)
  {
    GMTrace.i(12724645920768L, 94806);
    paramb.mNy.removeAllViews();
    if (!bg.mZ(paramc.mzb))
    {
      View localView = View.inflate(this.mContext, R.i.cWs, null);
      ImageView localImageView = (ImageView)localView.findViewById(R.h.bMB);
      com.tencent.mm.an.a.a locala = n.Ja();
      paramc = paramc.mzb;
      c.a locala1 = new c.a();
      locala1.hCO = true;
      locala.a(paramc, localImageView, locala1.Jk());
      paramb.mNy.addView(localView, new ViewGroup.LayoutParams(-1, com.tencent.mm.bq.a.fromDPToPix(this.mContext, 100)));
    }
    GMTrace.o(12724645920768L, 94806);
  }
  
  protected final void a(c paramc, l.b paramb, int paramInt)
  {
    GMTrace.i(12724511703040L, 94805);
    paramb.mNp.setText(paramc.position);
    Object localObject = paramb.mNp;
    int i;
    if (this.mNh)
    {
      i = 0;
      ((TextView)localObject).setVisibility(i);
      localObject = zk(paramc.field_appId);
      if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
        break label329;
      }
      paramb.mGS.setImageBitmap((Bitmap)localObject);
      label87:
      paramb.mGT.setText(paramc.field_appName);
      if (!bg.mZ(paramc.myX)) {
        break label342;
      }
      paramb.mNs.setVisibility(8);
      label117:
      if (!bg.mZ(paramc.myY)) {
        break label364;
      }
      paramb.mNt.setVisibility(8);
      label136:
      if (bg.bX(paramc.mzi)) {
        break label386;
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
      paramb.mNx.removeAllViews();
      paramc = (View)this.mNk.get(paramInt);
      if (paramc != null)
      {
        if ((paramc.getParent() instanceof ViewGroup)) {
          ((ViewGroup)paramc.getParent()).removeAllViews();
        }
        paramb.mNx.addView(paramc);
      }
      GMTrace.o(12724511703040L, 94805);
      return;
      i = 8;
      break;
      label329:
      paramb.mGS.setImageResource(R.g.aZb);
      break label87;
      label342:
      paramb.mNs.setVisibility(0);
      paramb.mNs.setText(paramc.myX);
      break label117;
      label364:
      paramb.mNt.setVisibility(0);
      paramb.mNt.setText(paramc.myY);
      break label136;
      label386:
      if (!bg.mZ(paramc.mzl))
      {
        paramb.mNr.setVisibility(0);
        paramb.mNr.setText(paramc.mzl);
      }
      try
      {
        paramb.mNr.setBackgroundDrawable(com.tencent.mm.plugin.game.model.e.bM(Color.parseColor(paramc.mzm), com.tencent.mm.bq.a.fromDPToPix(this.mContext, 10)));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        w.e("MicroMsg.GameLibraryListAdapter", localIllegalArgumentException.getMessage());
        paramb.mNr.setVisibility(8);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.GameLibraryListAdapter", localException.getMessage());
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */