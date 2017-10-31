package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.an.a.a.c;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.card.b.a.a;
import com.tencent.mm.plugin.card.model.CardGiftInfo;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.y;

@com.tencent.mm.ui.base.a(3)
public class CardGiftVideoUI
  extends MMActivity
  implements a.a, f.a
{
  int duration;
  private String fML;
  private int kvA;
  private CardGiftInfo kvo;
  private ImageView kvp;
  private ProgressBar kvs;
  private ae kvt;
  private Bundle kvu;
  private boolean kvv;
  private g kvw;
  private int kvx;
  private int kvy;
  private int kvz;
  private RelativeLayout kwA;
  private ImageView kwB;
  TextView kwC;
  private MMPinProgressBtn kwD;
  private TextView kwE;
  private l kwF;
  private aj kwG;
  private boolean kwx;
  private RelativeLayout kwy;
  private f kwz;
  
  public CardGiftVideoUI()
  {
    GMTrace.i(4931964633088L, 36746);
    this.kvt = new ae(Looper.getMainLooper());
    this.kvv = false;
    this.kvx = 0;
    this.kvy = 0;
    this.kvz = 0;
    this.kvA = 0;
    this.kwG = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(4975585394688L, 37071);
        if (CardGiftVideoUI.e(CardGiftVideoUI.this).isPlaying())
        {
          CardGiftVideoUI localCardGiftVideoUI = CardGiftVideoUI.this;
          int i = CardGiftVideoUI.e(CardGiftVideoUI.this).getCurrentPosition() / 1000;
          if ((localCardGiftVideoUI.kwC != null) && (localCardGiftVideoUI.duration > 0))
          {
            int j = localCardGiftVideoUI.duration - i;
            i = j;
            if (j < 0) {
              i = 0;
            }
            localCardGiftVideoUI.kwC.setText(i + "\"");
          }
        }
        GMTrace.o(4975585394688L, 37071);
        return true;
      }
    }, true);
    this.duration = 0;
    GMTrace.o(4931964633088L, 36746);
  }
  
  private void ald()
  {
    GMTrace.i(4932367286272L, 36749);
    if (this.kwF == null) {
      this.kwF = new l(this.vov.voR);
    }
    if (bg.mZ(this.fML))
    {
      w.e("MicroMsg.CardGiftVideoUI", "videoPath is null");
      GMTrace.o(4932367286272L, 36749);
      return;
    }
    this.kwF.a((VideoTextureView)this.kwz, new View.OnCreateContextMenuListener()new o.d
    {
      public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(4937601777664L, 36788);
        paramAnonymousContextMenu.add(0, 0, 0, CardGiftVideoUI.this.getString(R.l.dIU));
        GMTrace.o(4937601777664L, 36788);
      }
    }, new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(4955855388672L, 36924);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(4955855388672L, 36924);
          return;
          paramAnonymousMenuItem = t.mk(CardGiftVideoUI.a(CardGiftVideoUI.this));
          if (bg.mZ(paramAnonymousMenuItem))
          {
            Toast.makeText(CardGiftVideoUI.this, CardGiftVideoUI.this.getString(R.l.eOS), 1).show();
            GMTrace.o(4955855388672L, 36924);
            return;
          }
          Toast.makeText(CardGiftVideoUI.this, CardGiftVideoUI.this.getString(R.l.eOT, new Object[] { paramAnonymousMenuItem }), 1).show();
          k.b(paramAnonymousMenuItem, CardGiftVideoUI.this);
        }
      }
    });
    GMTrace.o(4932367286272L, 36749);
  }
  
  private void tY(String paramString)
  {
    GMTrace.i(4932233068544L, 36748);
    if (bg.mZ(paramString))
    {
      w.e("MicroMsg.CardGiftVideoUI", "the videoPath is null, fail~!!!");
      setResult(0);
      finish();
      GMTrace.o(4932233068544L, 36748);
      return;
    }
    if (!com.tencent.mm.a.e.aZ(paramString))
    {
      w.e("MicroMsg.CardGiftVideoUI", "the videoPath is %s, the file isn't exist~!!!", new Object[] { paramString });
      setResult(0);
      finish();
      GMTrace.o(4932233068544L, 36748);
      return;
    }
    this.kwz.setVideoPath(paramString);
    GMTrace.o(4932233068544L, 36748);
  }
  
  protected final void MH()
  {
    GMTrace.i(4932501504000L, 36750);
    this.kwy = ((RelativeLayout)findViewById(R.h.cEL));
    this.kwA = ((RelativeLayout)findViewById(R.h.cEG));
    this.kwB = ((ImageView)findViewById(R.h.cEH));
    this.kwC = ((TextView)findViewById(R.h.cEl));
    this.kwD = ((MMPinProgressBtn)findViewById(R.h.cEw));
    this.kvs = ((ProgressBar)findViewById(R.h.cEr));
    this.kwE = ((TextView)findViewById(R.h.cEJ));
    this.kwz = new VideoTextureView(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(13);
    this.kwz.ck(this.kwx);
    this.kwz.a(this);
    this.kwA.addView((View)this.kwz, localLayoutParams);
    this.kvp = ((ImageView)findViewById(R.h.bKT));
    this.kvp.setLayerType(2, null);
    this.kwy.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5008334520320L, 37315);
        CardGiftVideoUI.this.alb();
        GMTrace.o(5008334520320L, 37315);
        return true;
      }
    });
    ((View)this.kwz).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4927401230336L, 36712);
        CardGiftVideoUI.this.alb();
        GMTrace.o(4927401230336L, 36712);
      }
    });
    this.kvw = new g(this);
    GMTrace.o(4932501504000L, 36750);
  }
  
  public final void Xd()
  {
    GMTrace.i(4933709463552L, 36759);
    setResult(-1);
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5001623633920L, 37265);
        w.i("MicroMsg.CardGiftVideoUI", "%d switch video model isVideoPlay %b", new Object[] { Integer.valueOf(CardGiftVideoUI.this.hashCode()), Boolean.valueOf(this.kwJ) });
        if (this.kwJ)
        {
          ((View)CardGiftVideoUI.e(CardGiftVideoUI.this)).setVisibility(0);
          CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(8);
          GMTrace.o(5001623633920L, 37265);
          return;
        }
        ((View)CardGiftVideoUI.e(CardGiftVideoUI.this)).setVisibility(8);
        CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(0);
        GMTrace.o(5001623633920L, 37265);
      }
    });
    this.kvt.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5010750439424L, 37333);
        w.d("MicroMsg.CardGiftVideoUI", "hide loading.");
        if ((CardGiftVideoUI.g(CardGiftVideoUI.this) != null) && (CardGiftVideoUI.g(CardGiftVideoUI.this).getVisibility() != 8)) {
          CardGiftVideoUI.g(CardGiftVideoUI.this).setVisibility(8);
        }
        if ((CardGiftVideoUI.h(CardGiftVideoUI.this) != null) && (CardGiftVideoUI.h(CardGiftVideoUI.this).getVisibility() != 8)) {
          CardGiftVideoUI.h(CardGiftVideoUI.this).setVisibility(8);
        }
        GMTrace.o(5010750439424L, 37333);
      }
    });
    this.kwz.start();
    this.duration = (this.kwz.getDuration() / 1000);
    this.kwG.w(500L, 500L);
    w.i("MicroMsg.CardGiftVideoUI", "onPrepared videoView.start duration:%d", new Object[] { Integer.valueOf(this.duration) });
    GMTrace.o(4933709463552L, 36759);
  }
  
  public final void aI(String paramString, final int paramInt)
  {
    GMTrace.i(4934246334464L, 36763);
    if (paramString.equals(this.kvo.knL)) {
      this.kvt.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4939346608128L, 36801);
          if (CardGiftVideoUI.h(CardGiftVideoUI.this) != null)
          {
            if (this.hsi == 0)
            {
              CardGiftVideoUI.h(CardGiftVideoUI.this).setVisibility(8);
              GMTrace.o(4939346608128L, 36801);
              return;
            }
            if (CardGiftVideoUI.h(CardGiftVideoUI.this).getVisibility() != 0) {
              CardGiftVideoUI.h(CardGiftVideoUI.this).setVisibility(0);
            }
            w.i("MicroMsg.CardGiftVideoUI", "update progress %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.hsi) });
            if ((CardGiftVideoUI.h(CardGiftVideoUI.this).wTs != this.hsi) && (this.hsi > 0)) {
              CardGiftVideoUI.h(CardGiftVideoUI.this).setMax(this.hsi);
            }
            CardGiftVideoUI.h(CardGiftVideoUI.this).setProgress(paramInt);
          }
          GMTrace.o(4939346608128L, 36801);
        }
      });
    }
    GMTrace.o(4934246334464L, 36763);
  }
  
  public final void alb()
  {
    GMTrace.i(4933306810368L, 36756);
    this.kvw.p(this.kvy, this.kvx, this.kvz, this.kvA);
    this.kvw.a(this.kwy, this.kvp, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(4988470296576L, 37167);
        new ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5031822622720L, 37490);
            CardGiftVideoUI.this.finish();
            CardGiftVideoUI.this.overridePendingTransition(0, 0);
            GMTrace.o(5031822622720L, 37490);
          }
        });
        GMTrace.o(4988470296576L, 37167);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(4988336078848L, 37166);
        GMTrace.o(4988336078848L, 37166);
      }
    }, null);
    GMTrace.o(4933306810368L, 36756);
  }
  
  public final void bA(String paramString1, final String paramString2)
  {
    GMTrace.i(4934380552192L, 36764);
    if (paramString1.equals(this.kvo.knL))
    {
      this.kvt.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4956392259584L, 36928);
          CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(8);
          CardGiftVideoUI.a(CardGiftVideoUI.this, paramString2);
          CardGiftVideoUI.b(CardGiftVideoUI.this, CardGiftVideoUI.a(CardGiftVideoUI.this));
          CardGiftVideoUI.i(CardGiftVideoUI.this);
          GMTrace.o(4956392259584L, 36928);
        }
      });
      GMTrace.o(4934380552192L, 36764);
      return;
    }
    if (paramString1.equals(this.kvo.knM))
    {
      this.kvt.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4936125382656L, 36777);
          if (bg.mZ(CardGiftVideoUI.a(CardGiftVideoUI.this)))
          {
            CardGiftVideoUI.f(CardGiftVideoUI.this).setVisibility(0);
            Object localObject = new c.a();
            ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
            n.Jb();
            ((c.a)localObject).hDk = null;
            ((c.a)localObject).hCR = m.tG(paramString2);
            ((c.a)localObject).hCU = 1;
            ((c.a)localObject).hCP = true;
            ((c.a)localObject).hCN = true;
            localObject = ((c.a)localObject).Jk();
            n.Ja().a(paramString2, CardGiftVideoUI.f(CardGiftVideoUI.this), (c)localObject);
          }
          GMTrace.o(4936125382656L, 36777);
        }
      });
      GMTrace.o(4934380552192L, 36764);
      return;
    }
    w.i("MicroMsg.CardGiftVideoUI", "fieldId:%s is unsuitable", new Object[] { paramString1 });
    GMTrace.o(4934380552192L, 36764);
  }
  
  public final int bL(int paramInt1, int paramInt2)
  {
    GMTrace.i(4933977899008L, 36761);
    GMTrace.o(4933977899008L, 36761);
    return 0;
  }
  
  public final void br(int paramInt1, int paramInt2)
  {
    GMTrace.i(4934112116736L, 36762);
    GMTrace.o(4934112116736L, 36762);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(4933172592640L, 36755);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.CardGiftVideoUI", "dispatchKeyEvent");
      alb();
      GMTrace.o(4933172592640L, 36755);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(4933172592640L, 36755);
    return bool;
  }
  
  public final void fail(String paramString)
  {
    GMTrace.i(17260936691712L, 128604);
    GMTrace.o(17260936691712L, 128604);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4933441028096L, 36757);
    int i = R.i.cOk;
    GMTrace.o(4933441028096L, 36757);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4932098850816L, 36747);
    if (getIntent().getExtras() != null) {
      getIntent().getExtras().setClassLoader(getClass().getClassLoader());
    }
    super.onCreate(paramBundle);
    this.vov.bUK();
    this.kvu = paramBundle;
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    if (ap.pF() != null) {
      ap.pF().rn();
    }
    this.kvo = ((CardGiftInfo)getIntent().getParcelableExtra("key_gift_into"));
    this.fML = getIntent().getStringExtra("key_video_path");
    this.kwx = getIntent().getBooleanExtra("key_is_mute", false);
    if (this.kvo == null) {}
    for (paramBundle = "null";; paramBundle = this.kvo.toString())
    {
      w.d("MicroMsg.CardGiftVideoUI", "cardGiftInfo %s", new Object[] { paramBundle });
      w.d("MicroMsg.CardGiftVideoUI", "videoPath:%s, isMute:%b", new Object[] { this.fML, Boolean.valueOf(this.kwx) });
      MH();
      com.tencent.mm.plugin.card.b.a.a(this);
      ald();
      if (this.kvo != null) {
        break;
      }
      w.e("MicroMsg.CardGiftVideoUI", "cardGiftInfo is null");
      GMTrace.o(4932098850816L, 36747);
      return;
    }
    if (!bg.mZ(this.kvo.knL))
    {
      com.tencent.mm.plugin.card.b.a.f(this.kvo.knM, this.kvo.knP, this.kvo.knY, 2);
      com.tencent.mm.plugin.card.b.a.f(this.kvo.knL, this.kvo.knO, this.kvo.knX, 1);
      GMTrace.o(4932098850816L, 36747);
      return;
    }
    w.e("MicroMsg.CardGiftVideoUI", "fromUserContentVideoUrl is null");
    GMTrace.o(4932098850816L, 36747);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4933038374912L, 36754);
    this.kwz.stop();
    this.kwG.MM();
    com.tencent.mm.plugin.card.b.a.b(this);
    super.onDestroy();
    GMTrace.o(4933038374912L, 36754);
  }
  
  public final void onError(int paramInt1, int paramInt2)
  {
    GMTrace.i(4933575245824L, 36758);
    setResult(0);
    this.kwz.stop();
    w.e("MicroMsg.CardGiftVideoUI", "%d on play video error what %d extra %d.", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(4933575245824L, 36758);
  }
  
  protected void onPause()
  {
    GMTrace.i(4932904157184L, 36753);
    this.kwz.pause();
    super.onPause();
    GMTrace.o(4932904157184L, 36753);
  }
  
  protected void onResume()
  {
    GMTrace.i(4932769939456L, 36752);
    if (!bg.mZ(this.fML)) {
      tY(this.fML);
    }
    super.onResume();
    GMTrace.o(4932769939456L, 36752);
  }
  
  public void onStart()
  {
    GMTrace.i(4932635721728L, 36751);
    Bundle localBundle = this.kvu;
    if (!this.kvv)
    {
      this.kvv = true;
      if (Build.VERSION.SDK_INT >= 12) {
        break label69;
      }
      w.e("MicroMsg.CardGiftVideoUI", "version is %d, no animation", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
    }
    for (;;)
    {
      super.onStart();
      GMTrace.o(4932635721728L, 36751);
      return;
      label69:
      this.kvx = getIntent().getIntExtra("img_top", 0);
      this.kvy = getIntent().getIntExtra("img_left", 0);
      this.kvz = getIntent().getIntExtra("img_width", 0);
      this.kvA = getIntent().getIntExtra("img_height", 0);
      this.kvw.p(this.kvy, this.kvx, this.kvz, this.kvA);
      if (localBundle == null) {
        this.kwy.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            GMTrace.i(4989275602944L, 37173);
            CardGiftVideoUI.b(CardGiftVideoUI.this).getViewTreeObserver().removeOnPreDrawListener(this);
            CardGiftVideoUI.d(CardGiftVideoUI.this).a(CardGiftVideoUI.b(CardGiftVideoUI.this), CardGiftVideoUI.c(CardGiftVideoUI.this), null);
            GMTrace.o(4989275602944L, 37173);
            return true;
          }
        });
      }
    }
  }
  
  public final void qq()
  {
    GMTrace.i(4933843681280L, 36760);
    w.i("MicroMsg.CardGiftVideoUI", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    this.kwz.o(0.0D);
    GMTrace.o(4933843681280L, 36760);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardGiftVideoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */