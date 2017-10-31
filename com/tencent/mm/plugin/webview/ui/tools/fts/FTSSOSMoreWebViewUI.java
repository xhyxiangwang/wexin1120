package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bq.a;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import com.tencent.mm.ui.p;

public class FTSSOSMoreWebViewUI
  extends BaseSOSWebViewUI
{
  private int svG;
  private View swk;
  
  public FTSSOSMoreWebViewUI()
  {
    GMTrace.i(16227862839296L, 120907);
    GMTrace.o(16227862839296L, 120907);
  }
  
  protected final int aad()
  {
    GMTrace.i(16228131274752L, 120909);
    if ((com.tencent.mm.compatible.util.d.et(23)) && (!h.tJ()))
    {
      i = getResources().getColor(R.e.white);
      GMTrace.o(16228131274752L, 120909);
      return i;
    }
    int i = super.aad();
    GMTrace.o(16228131274752L, 120909);
    return i;
  }
  
  public boolean aaj()
  {
    GMTrace.i(16899488350208L, 125911);
    bCE().ceC();
    this.swk.setVisibility(0);
    boolean bool = super.aaj();
    GMTrace.o(16899488350208L, 125911);
    return bool;
  }
  
  protected final void aal()
  {
    GMTrace.i(16227997057024L, 120908);
    super.aal();
    this.swk = findViewById(R.h.cKV);
    bCE().ceI();
    bCE().ceC();
    this.suW.setVisibility(0);
    this.ogo.setVisibility(8);
    this.svG = a.fromDPToPix(this, 48);
    bCE().v(com.tencent.mm.ay.d.a(this.type, this));
    if (this.scene == 24) {
      this.swk.setVisibility(4);
    }
    findViewById(R.h.cse).setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(19406004420608L, 144586);
        FTSSOSMoreWebViewUI.this.bCE().vNy.clearFocus();
        FTSSOSMoreWebViewUI.this.aKl();
        GMTrace.o(19406004420608L, 144586);
        return false;
      }
    });
    if ((getIntent() != null) && (getIntent().getBooleanExtra("ftsneedkeyboard", false))) {
      this.vov.iiK.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19409494081536L, 144612);
          FTSSOSMoreWebViewUI.this.bCE().cez();
          FTSSOSMoreWebViewUI.this.bCE().cey();
          GMTrace.o(19409494081536L, 144612);
        }
      }, 128L);
    }
    GMTrace.o(16227997057024L, 120908);
  }
  
  protected final void bCA()
  {
    GMTrace.i(16228399710208L, 120911);
    finish();
    GMTrace.o(16228399710208L, 120911);
  }
  
  protected final void bCB()
  {
    GMTrace.i(19411775782912L, 144629);
    super.bCB();
    this.swk.setVisibility(0);
    GMTrace.o(19411775782912L, 144629);
  }
  
  protected final String getHint()
  {
    GMTrace.i(16228533927936L, 120912);
    int i = -1;
    if ((this.type == 8) && (this.svn)) {
      i = R.l.ebL;
    }
    while (i < 0)
    {
      str = ab.getContext().getResources().getString(R.l.dwX);
      GMTrace.o(16228533927936L, 120912);
      return str;
      switch (this.type)
      {
      default: 
        break;
      case 1: 
        i = R.l.eEz;
        break;
      case 8: 
        i = R.l.ebK;
        break;
      case 2: 
        i = R.l.eEy;
        break;
      case 16: 
        i = R.l.ebJ;
        break;
      case 64: 
        i = R.l.duy;
        break;
      case 256: 
      case 384: 
        i = R.l.ebF;
        break;
      case 128: 
        i = R.l.ebG;
        break;
      case 512: 
        i = R.l.ebH;
        break;
      case 1024: 
        i = R.l.ebI;
      }
    }
    String str = ab.getContext().getResources().getString(R.l.eEx, new Object[] { ab.getContext().getResources().getString(i) });
    GMTrace.o(16228533927936L, 120912);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(16228265492480L, 120910);
    int i = R.i.dgL;
    GMTrace.o(16228265492480L, 120910);
    return i;
  }
  
  public final void hc(boolean paramBoolean)
  {
    GMTrace.i(16899354132480L, 125910);
    super.hc(paramBoolean);
    if (paramBoolean)
    {
      this.suU.setPadding(0, 0, 0, 0);
      this.suW.setVisibility(8);
    }
    for (;;)
    {
      bCE().ceC();
      GMTrace.o(16899354132480L, 125910);
      return;
      this.suU.setPadding(this.svG, 0, 0, 0);
      this.suW.setVisibility(0);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSMoreWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */