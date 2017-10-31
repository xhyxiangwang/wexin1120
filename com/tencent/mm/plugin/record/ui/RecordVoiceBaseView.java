package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.p.a;
import com.tencent.mm.plugin.record.a.r;
import com.tencent.mm.plugin.record.a.r.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.t;

public class RecordVoiceBaseView
  extends TextView
  implements r.a
{
  private boolean aDR;
  private Context context;
  public int duration;
  public int fBu;
  private AlphaAnimation oVl;
  private AnimationDrawable oVm;
  public r oVn;
  public String path;
  
  public RecordVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7540754612224L, 56183);
    this.aDR = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    aZy();
    GMTrace.o(7540754612224L, 56183);
  }
  
  public RecordVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(7540888829952L, 56184);
    this.aDR = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    aZy();
    GMTrace.o(7540888829952L, 56184);
  }
  
  private void aZy()
  {
    GMTrace.i(7541023047680L, 56185);
    this.oVl = new AlphaAnimation(0.1F, 1.0F);
    this.oVl.setDuration(1000L);
    this.oVl.setRepeatCount(-1);
    this.oVl.setRepeatMode(2);
    this.oVm = new AnimationDrawable();
    Drawable localDrawable = getResources().getDrawable(R.k.dmW);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oVm.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.dmX);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oVm.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.dmY);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.oVm.addFrame(localDrawable, 300);
    this.oVm.setOneShot(false);
    this.oVm.setVisible(true, true);
    GMTrace.o(7541023047680L, 56185);
  }
  
  private void aZz()
  {
    GMTrace.i(7541157265408L, 56186);
    if ((this.oVl != null) && (this.oVl.isInitialized())) {
      setAnimation(null);
    }
    this.aDR = false;
    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.k.dmV), null, null, null);
    this.oVm.stop();
    GMTrace.o(7541157265408L, 56186);
  }
  
  public final void EI(String paramString)
  {
    GMTrace.i(7541559918592L, 56189);
    w.d("MicroMsg.RecordVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bg.ap(paramString, "").equals(this.path)) {
      aZz();
    }
    GMTrace.o(7541559918592L, 56189);
  }
  
  public final void ahm()
  {
    GMTrace.i(7541425700864L, 56188);
    w.d("MicroMsg.RecordVoiceBaseView", "stop play");
    aZz();
    this.oVn.ahm();
    GMTrace.o(7541425700864L, 56188);
  }
  
  public final void onFinish()
  {
    GMTrace.i(7541694136320L, 56190);
    ahm();
    GMTrace.o(7541694136320L, 56190);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(7541291483136L, 56187);
    super.onFinishInflate();
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7558739787776L, 56317);
        w.d("MicroMsg.RecordVoiceBaseView", "clicked path %s, isPlay %s", new Object[] { RecordVoiceBaseView.a(RecordVoiceBaseView.this), Boolean.valueOf(RecordVoiceBaseView.b(RecordVoiceBaseView.this).awW()) });
        if ((a.aQ(RecordVoiceBaseView.c(RecordVoiceBaseView.this))) || (a.aO(RecordVoiceBaseView.c(RecordVoiceBaseView.this))))
        {
          GMTrace.o(7558739787776L, 56317);
          return;
        }
        if ((!f.tD()) && (!bg.mZ(RecordVoiceBaseView.a(RecordVoiceBaseView.this))))
        {
          t.fn(paramAnonymousView.getContext());
          GMTrace.o(7558739787776L, 56317);
          return;
        }
        if (!bg.ap(RecordVoiceBaseView.a(RecordVoiceBaseView.this), "").equals(RecordVoiceBaseView.b(RecordVoiceBaseView.this).path))
        {
          RecordVoiceBaseView.d(RecordVoiceBaseView.this);
          GMTrace.o(7558739787776L, 56317);
          return;
        }
        if (RecordVoiceBaseView.b(RecordVoiceBaseView.this).awW())
        {
          RecordVoiceBaseView.this.ahm();
          GMTrace.o(7558739787776L, 56317);
          return;
        }
        if (!RecordVoiceBaseView.e(RecordVoiceBaseView.this)) {
          RecordVoiceBaseView.d(RecordVoiceBaseView.this);
        }
        GMTrace.o(7558739787776L, 56317);
      }
    });
    GMTrace.o(7541291483136L, 56187);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordVoiceBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */