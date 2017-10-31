package com.tencent.mm.plugin.wear.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.iq;
import com.tencent.mm.g.a.sv;
import com.tencent.mm.plugin.wear.model.d.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicInteger;

public class WearYoUI
  extends Activity
{
  private ImageView iiL;
  private TextView kfQ;
  private Vibrator kiq;
  private ImageView siF;
  private ImageView siG;
  private ImageView siH;
  private ObjectAnimator[][] siI;
  private c siJ;
  private boolean siK;
  private AtomicInteger siL;
  private Runnable siM;
  private BroadcastReceiver siN;
  private c siO;
  private String username;
  
  public WearYoUI()
  {
    GMTrace.i(9214449680384L, 68653);
    this.siI = ((ObjectAnimator[][])Array.newInstance(ObjectAnimator.class, new int[] { 3, 3 }));
    this.siJ = new c() {};
    this.siL = new AtomicInteger();
    this.siM = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9214181244928L, 68651);
        WearYoUI.c(WearYoUI.this).vibrate(200L);
        WearYoUI.d(WearYoUI.this).animate().scaleX(1.2F);
        WearYoUI.d(WearYoUI.this).animate().scaleY(1.2F);
        WearYoUI.d(WearYoUI.this).animate().setDuration(200L);
        WearYoUI.d(WearYoUI.this).animate().start();
        WearYoUI.d(WearYoUI.this).animate().setListener(new WearYoUI.a(WearYoUI.this, 1));
        GMTrace.o(9214181244928L, 68651);
      }
    };
    this.siN = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(9212973285376L, 68642);
        if (paramAnonymousIntent.getAction() == "android.intent.action.CLOSE_SYSTEM_DIALOGS") {
          WearYoUI.this.finish();
        }
        GMTrace.o(9212973285376L, 68642);
      }
    };
    this.siO = new c() {};
    GMTrace.o(9214449680384L, 68653);
  }
  
  private void a(int paramInt, ImageView paramImageView, long paramLong)
  {
    GMTrace.i(9214718115840L, 68655);
    this.siI[paramInt][0] = ObjectAnimator.ofFloat(paramImageView, "scaleX", new float[] { 1.0F, 2.5F });
    this.siI[paramInt][0].setRepeatCount(-1);
    this.siI[paramInt][0].setStartDelay(paramLong);
    this.siI[paramInt][0].setDuration(3900L);
    this.siI[paramInt][0].start();
    this.siI[paramInt][1] = ObjectAnimator.ofFloat(paramImageView, "scaleY", new float[] { 1.0F, 2.5F });
    this.siI[paramInt][1].setRepeatCount(-1);
    this.siI[paramInt][1].setStartDelay(paramLong);
    this.siI[paramInt][1].setDuration(3900L);
    this.siI[paramInt][1].start();
    this.siI[paramInt][2] = ObjectAnimator.ofFloat(paramImageView, "alpha", new float[] { 1.0F, 0.0F });
    this.siI[paramInt][2].setRepeatCount(-1);
    this.siI[paramInt][2].setInterpolator(new AccelerateInterpolator());
    this.siI[paramInt][2].setStartDelay(paramLong);
    this.siI[paramInt][2].setDuration(3900L);
    this.siI[paramInt][2].start();
    GMTrace.o(9214718115840L, 68655);
  }
  
  public void onClickCheck(View paramView)
  {
    GMTrace.i(9214852333568L, 68656);
    w.i("MicroMsg.Wear.WearYoUI", "onClickCheck %s", new Object[] { this.username });
    paramView = new b(this.username);
    ap.wT().a(paramView, 0);
    finish();
    GMTrace.o(9214852333568L, 68656);
  }
  
  public void onClickNoCheck(View paramView)
  {
    GMTrace.i(9214986551296L, 68657);
    w.i("MicroMsg.Wear.WearYoUI", "onClickNoCheck %s", new Object[] { this.username });
    finish();
    GMTrace.o(9214986551296L, 68657);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9214583898112L, 68654);
    super.onCreate(paramBundle);
    getWindow().addFlags(4718592);
    setContentView(R.i.djF);
    this.kiq = ((Vibrator)getSystemService("vibrator"));
    this.username = getIntent().getStringExtra("key_talker");
    this.iiL = ((ImageView)findViewById(R.h.bjt));
    this.kfQ = ((TextView)findViewById(R.h.cgr));
    this.siF = ((ImageView)findViewById(R.h.bjv));
    this.siG = ((ImageView)findViewById(R.h.bjw));
    this.siH = ((ImageView)findViewById(R.h.bjx));
    a.b.n(this.iiL, this.username);
    this.kfQ.setText(com.tencent.mm.x.n.fc(this.username));
    this.iiL.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(9216462946304L, 68668);
        com.tencent.mm.plugin.wear.model.a.bzo();
        paramAnonymousView = WearYoUI.a(WearYoUI.this);
        w.i("MicroMsg.wear.WearYoLogic", "click avatarIV %s", new Object[] { paramAnonymousView });
        Intent localIntent = new Intent();
        localIntent.putExtra("Main_User", paramAnonymousView);
        localIntent.putExtra("From_fail_notify", true);
        localIntent.addFlags(536870912);
        localIntent.addFlags(67108864);
        d.a(ab.getContext(), "com.tencent.mm.ui.LauncherUI", localIntent);
        WearYoUI.this.finish();
        GMTrace.o(9216462946304L, 68668);
      }
    });
    com.tencent.mm.sdk.b.a.uLm.b(this.siJ);
    com.tencent.mm.sdk.b.a.uLm.b(this.siO);
    a(0, this.siF, 0L);
    a(1, this.siG, 1300L);
    a(2, this.siH, 2600L);
    this.kiq.vibrate(200L);
    registerReceiver(this.siN, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    overridePendingTransition(R.a.aLx, R.a.aLy);
    GMTrace.o(9214583898112L, 68654);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9215120769024L, 68658);
    int i = 0;
    while (i < this.siI.length)
    {
      int j = 0;
      while (j < this.siI[i].length)
      {
        this.siI[i][j].cancel();
        j += 1;
      }
      i += 1;
    }
    unregisterReceiver(this.siN);
    com.tencent.mm.sdk.b.a.uLm.c(this.siO);
    com.tencent.mm.sdk.b.a.uLm.c(this.siJ);
    com.tencent.mm.plugin.wear.model.a.bzo().sho.bzF();
    super.onDestroy();
    GMTrace.o(9215120769024L, 68658);
  }
  
  private final class a
    implements Animator.AnimatorListener
  {
    private int iRs;
    
    public a(int paramInt)
    {
      GMTrace.i(9213375938560L, 68645);
      this.iRs = 1;
      this.iRs = paramInt;
      GMTrace.o(9213375938560L, 68645);
    }
    
    public final void onAnimationCancel(Animator paramAnimator)
    {
      GMTrace.i(9213778591744L, 68648);
      WearYoUI.g(WearYoUI.this);
      GMTrace.o(9213778591744L, 68648);
    }
    
    public final void onAnimationEnd(Animator paramAnimator)
    {
      GMTrace.i(9213644374016L, 68647);
      if (this.iRs == 2)
      {
        w.v("MicroMsg.Wear.WearYoUI", "onAnimationEnd count: %d", new Object[] { Integer.valueOf(WearYoUI.e(WearYoUI.this).get()) });
        if (WearYoUI.e(WearYoUI.this).get() > 0)
        {
          WearYoUI.e(WearYoUI.this).decrementAndGet();
          af.i(WearYoUI.f(WearYoUI.this), 1000L);
          GMTrace.o(9213644374016L, 68647);
          return;
        }
        WearYoUI.d(WearYoUI.this).animate().setListener(null);
        WearYoUI.g(WearYoUI.this);
        GMTrace.o(9213644374016L, 68647);
        return;
      }
      if (this.iRs == 1)
      {
        WearYoUI.d(WearYoUI.this).animate().scaleX(1.0F);
        WearYoUI.d(WearYoUI.this).animate().scaleY(1.0F);
        WearYoUI.d(WearYoUI.this).animate().setDuration(100L);
        WearYoUI.d(WearYoUI.this).animate().start();
        WearYoUI.d(WearYoUI.this).animate().setListener(new a(WearYoUI.this, 2));
      }
      GMTrace.o(9213644374016L, 68647);
    }
    
    public final void onAnimationRepeat(Animator paramAnimator)
    {
      GMTrace.i(9213912809472L, 68649);
      GMTrace.o(9213912809472L, 68649);
    }
    
    public final void onAnimationStart(Animator paramAnimator)
    {
      GMTrace.i(9213510156288L, 68646);
      GMTrace.o(9213510156288L, 68646);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/ui/WearYoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */