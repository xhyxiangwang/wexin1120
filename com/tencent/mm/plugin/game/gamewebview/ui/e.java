package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.v;

public final class e
  extends LinearLayout
{
  TextView lwa;
  private Context mContext;
  b mxV;
  ImageView mxW;
  ImageView mxX;
  public i mxY;
  private a mxZ;
  public com.tencent.mm.ui.base.i mya;
  
  public e(b paramb)
  {
    super(paramb.getContext());
    GMTrace.i(17992960180224L, 134058);
    this.mya = null;
    this.mContext = paramb.getContext();
    this.mxV = paramb;
    this.mxY = new g(paramb);
    paramb = this.mContext.getResources().getDisplayMetrics();
    if (paramb.widthPixels > paramb.heightPixels) {}
    for (int i = this.mContext.getResources().getDimensionPixelSize(R.f.aRn);; i = this.mContext.getResources().getDimensionPixelSize(R.f.aRo))
    {
      setLayoutParams(new LinearLayout.LayoutParams(-1, i));
      setBackgroundResource(R.e.aNf);
      paramb = v.fa(getContext()).inflate(R.i.cXi, this, false);
      addView(paramb);
      this.mxW = ((ImageView)paramb.findViewById(R.h.bgq));
      this.mxW.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17992020656128L, 134051);
          if (!e.this.aDt()) {
            e.this.mxV.aDd();
          }
          GMTrace.o(17992020656128L, 134051);
        }
      });
      this.lwa = ((TextView)paramb.findViewById(R.h.title));
      this.mxX = ((ImageView)paramb.findViewById(R.h.bgr));
      this.mxX.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18015374540800L, 134225);
          e.a(e.this).aDE();
          GMTrace.o(18015374540800L, 134225);
        }
      });
      GMTrace.o(17992960180224L, 134058);
      return;
    }
  }
  
  public final void aDE()
  {
    GMTrace.i(17993228615680L, 134060);
    if (this.mxY != null) {
      this.mxY.aDE();
    }
    GMTrace.o(17993228615680L, 134060);
  }
  
  public final boolean aDt()
  {
    GMTrace.i(17993497051136L, 134062);
    if (this.mxZ != null)
    {
      Object localObject1 = this.mxZ;
      if ((((a)localObject1).mwn) && (!bg.mZ(((a)localObject1).aCV())) && (!bg.mZ(((a)localObject1).aCW())) && (!bg.mZ(((a)localObject1).aCX()))) {}
      for (int i = 1; i != 0; i = 0)
      {
        Object localObject2 = this.mxZ.aCV();
        localObject1 = this.mxZ.aCW();
        String str = this.mxZ.aCX();
        w.i("MicroMsg.GameWebViewActionBar", "use js api close window confirm info : %s, %s, %s", new Object[] { localObject2, localObject1, str });
        View localView = View.inflate(getContext(), R.i.dah, null);
        Object localObject3 = (CheckBox)localView.findViewById(R.h.ccn);
        ((CheckBox)localObject3).setChecked(false);
        ((CheckBox)localObject3).setVisibility(8);
        localObject3 = (TextView)localView.findViewById(R.h.ccp);
        ((TextView)localObject3).setText((CharSequence)localObject2);
        ((TextView)localObject3).setTextColor(getResources().getColor(R.e.aPH));
        localObject2 = (TextView)localView.findViewById(R.h.cco);
        ((TextView)localObject2).setTextColor(getResources().getColor(R.e.aPH));
        ((TextView)localObject2).setVisibility(8);
        this.mya = h.a(getContext(), true, "", localView, (String)localObject1, str, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17991215349760L, 134045);
            e.b(e.this);
            e.this.mxV.aDd();
            GMTrace.o(17991215349760L, 134045);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17994839228416L, 134072);
            e.b(e.this);
            GMTrace.o(17994839228416L, 134072);
          }
        });
        GMTrace.o(17993497051136L, 134062);
        return true;
      }
    }
    GMTrace.o(17993497051136L, 134062);
    return false;
  }
  
  public final void uN(String paramString)
  {
    GMTrace.i(17993094397952L, 134059);
    this.lwa.setText(paramString);
    GMTrace.o(17993094397952L, 134059);
  }
  
  public final void z(Bundle paramBundle)
  {
    GMTrace.i(17993362833408L, 134061);
    if (paramBundle == null) {}
    for (paramBundle = null;; paramBundle = new a(paramBundle))
    {
      this.mxZ = paramBundle;
      GMTrace.o(17993362833408L, 134061);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */