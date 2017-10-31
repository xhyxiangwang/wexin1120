package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.sns.i.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.l;

public abstract class SnsBaseGalleryUI
  extends MMActivity
  implements t.a
{
  private boolean kfI;
  private LinearLayout qGG;
  s qGH;
  private LinearLayout qGI;
  t qGJ;
  private boolean qGK;
  private TextView qGL;
  protected SnsInfoFlip qGM;
  protected Button qGN;
  
  public SnsBaseGalleryUI()
  {
    GMTrace.i(8402969296896L, 62607);
    this.qGK = true;
    this.kfI = true;
    this.qGL = null;
    GMTrace.o(8402969296896L, 62607);
  }
  
  public final void addView(View paramView)
  {
    GMTrace.i(8403371950080L, 62610);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    this.qGG.addView(paramView, localLayoutParams);
    GMTrace.o(8403371950080L, 62610);
  }
  
  public void aha()
  {
    int j = 8;
    boolean bool = false;
    GMTrace.i(8404445691904L, 62618);
    if (!this.qGK)
    {
      GMTrace.o(8404445691904L, 62618);
      return;
    }
    s locals;
    if (this.kfI)
    {
      i = 8;
      An(i);
      if (this.qGH != null)
      {
        locals = this.qGH;
        if (!this.kfI) {
          break label100;
        }
      }
    }
    label100:
    for (int i = j;; i = 0)
    {
      locals.setVisibility(i);
      if (!this.kfI) {
        bool = true;
      }
      this.kfI = bool;
      GMTrace.o(8404445691904L, 62618);
      return;
      i = 0;
      break;
    }
  }
  
  public void bU(String paramString, int paramInt)
  {
    GMTrace.i(8404311474176L, 62617);
    GMTrace.o(8404311474176L, 62617);
  }
  
  public void bV(String paramString, int paramInt)
  {
    GMTrace.i(8403908820992L, 62614);
    if ((!this.qGK) || (ae.bgY()))
    {
      GMTrace.o(8403908820992L, 62614);
      return;
    }
    paramString = ae.bhp().HA(paramString);
    if ((paramString == null) || (paramString.field_snsId == 0L))
    {
      kS(false);
      GMTrace.o(8403908820992L, 62614);
      return;
    }
    kS(true);
    GMTrace.o(8403908820992L, 62614);
  }
  
  public final void blE()
  {
    GMTrace.i(8404579909632L, 62619);
    this.kfI = false;
    An(8);
    if (this.qGH != null) {
      this.qGH.setVisibility(8);
    }
    GMTrace.o(8404579909632L, 62619);
  }
  
  public final void dE(String paramString1, String paramString2)
  {
    GMTrace.i(8404177256448L, 62616);
    if (!this.qGK)
    {
      GMTrace.o(8404177256448L, 62616);
      return;
    }
    rV(paramString1);
    Uk(paramString2);
    GMTrace.o(8404177256448L, 62616);
  }
  
  protected int getLayoutId()
  {
    GMTrace.i(8403774603264L, 62613);
    int i = i.g.pOP;
    GMTrace.o(8403774603264L, 62613);
    return i;
  }
  
  @SuppressLint({"ResourceAsColor"})
  public final void o(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(8403506167808L, 62611);
    this.qGH = new s(this, paramInt, paramBoolean);
    this.qGH.setBackgroundColor(i.c.transparent);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    this.qGH.getBackground().setAlpha(50);
    this.qGI.addView(this.qGH, localLayoutParams);
    paramInt = getIntent().getIntExtra("sns_source", 0);
    this.qGH.fAl = paramInt;
    GMTrace.o(8403506167808L, 62611);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8403103514624L, 62608);
    super.onCreate(paramBundle);
    ae.bhk().E(3, true);
    this.qGG = ((LinearLayout)findViewById(i.f.pKm));
    this.qGI = ((LinearLayout)findViewById(i.f.content));
    this.qGJ = new t(this, this);
    paramBundle = this.qGJ;
    w.i("MicroMsg.GalleryTitleManager", "onAttach");
    h.xA();
    h.xy().gQO.a(218, paramBundle);
    a.uLm.b(paramBundle.lRF);
    a.uLm.b(paramBundle.qBc);
    GMTrace.o(8403103514624L, 62608);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8403640385536L, 62612);
    super.onDestroy();
    Object localObject;
    if (this.qGJ != null)
    {
      localObject = this.qGJ;
      w.i("MicroMsg.GalleryTitleManager", "onDetch");
      h.xA();
      h.xy().gQO.b(218, (e)localObject);
      a.uLm.c(((t)localObject).lRF);
      a.uLm.c(((t)localObject).qBc);
    }
    if (this.qGM != null)
    {
      localObject = this.qGM;
      if ((((SnsInfoFlip)localObject).qJB != null) && ((((SnsInfoFlip)localObject).qJB instanceof MMGestureGallery)))
      {
        localObject = (MMGestureGallery)((SnsInfoFlip)localObject).qJB;
        ((MMGestureGallery)localObject).wKF.release();
        ((MMGestureGallery)localObject).wKG.release();
        ((MMGestureGallery)localObject).wKE.release();
      }
      this.qGM.onDestroy();
    }
    GMTrace.o(8403640385536L, 62612);
  }
  
  protected void onPause()
  {
    GMTrace.i(8404043038720L, 62615);
    if (this.qGM != null) {
      this.qGM.onPause();
    }
    if (this.qGJ != null)
    {
      t localt = this.qGJ;
      if (localt.qAZ != null)
      {
        ak localak = new ak();
        localak.fuD.activity = ((Activity)localt.context);
        localak.fuD.fuE = localt.qAZ;
        a.uLm.m(localak);
        localt.qAZ = null;
        localt.fwi = 0;
        localt.fwh = 0;
      }
    }
    super.onPause();
    GMTrace.o(8404043038720L, 62615);
  }
  
  public void onResume()
  {
    GMTrace.i(8403237732352L, 62609);
    super.onResume();
    if (this.qGH != null) {
      this.qGH.refresh();
    }
    GMTrace.o(8403237732352L, 62609);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */