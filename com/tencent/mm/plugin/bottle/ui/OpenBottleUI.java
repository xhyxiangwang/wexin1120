package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.g.a;
import com.tencent.mm.ac.g.b;
import com.tencent.mm.au.f;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.ay.a;
import java.util.ArrayList;
import junit.framework.Assert;

public class OpenBottleUI
  extends FrameLayout
  implements View.OnClickListener, g.a, g.b, m.b, SensorController.a
{
  static SensorController kha;
  private com.tencent.mm.e.a.a fnO;
  au ftK;
  BottleBeachUI kgS;
  TextView kgT;
  LinearLayout kgU;
  FrameLayout kgV;
  ImageView kgW;
  TextView kgX;
  TextView kgY;
  TextView kgZ;
  private boolean kgc;
  ThrowBottleAnimUI khb;
  String khc;
  private boolean khd;
  private ax khe;
  private long khf;
  private boolean khg;
  TextView khh;
  MMActivity khi;
  long khj;
  private boolean khk;
  
  public OpenBottleUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7614842798080L, 56735);
    this.khd = true;
    this.khf = -1L;
    this.khj = 0L;
    this.kgc = false;
    this.khk = false;
    this.kgS = ((BottleBeachUI)paramContext);
    ap.AS();
    com.tencent.mm.x.c.yL().a(this);
    if (kha == null) {
      kha = new SensorController(paramContext.getApplicationContext());
    }
    if (this.khe == null) {
      this.khe = new ax(paramContext.getApplicationContext());
    }
    ap.AS();
    paramContext = (Boolean)com.tencent.mm.x.c.xi().get(26, Boolean.valueOf(false));
    this.khg = paramContext.booleanValue();
    if (!paramContext.booleanValue()) {}
    for (boolean bool = true;; bool = false)
    {
      this.khd = bool;
      if (this.fnO != null) {
        this.fnO.ay(this.khd);
      }
      GMTrace.o(7614842798080L, 56735);
      return;
    }
  }
  
  private void F(au paramau)
  {
    GMTrace.i(7615648104448L, 56741);
    if ((com.tencent.mm.p.a.aQ(getContext())) || (com.tencent.mm.p.a.aO(this.kgS)))
    {
      w.d("MM.Bottle_OpenBottleUI", "voip is running, can't use the feature");
      GMTrace.o(7615648104448L, 56741);
      return;
    }
    boolean bool;
    if ((paramau != null) && (paramau.bQC()))
    {
      bool = true;
      Assert.assertTrue(bool);
      if ((paramau != null) && (paramau.bQC()) && (!kha.uPi))
      {
        kha.a(this);
        Runnable local5 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7649470971904L, 56993);
            OpenBottleUI.a(OpenBottleUI.this, bg.Pq());
            GMTrace.o(7649470971904L, 56993);
          }
        };
        if (!this.khe.L(local5)) {
          break label154;
        }
      }
    }
    label154:
    for (this.khf = 0L;; this.khf = -1L)
    {
      ap.AS();
      if ((com.tencent.mm.x.c.isSDCardAvailable()) || (bg.mZ(paramau.field_imgPath))) {
        break label164;
      }
      com.tencent.mm.ui.base.t.fn(this.kgS);
      GMTrace.o(7615648104448L, 56741);
      return;
      bool = false;
      break;
    }
    label164:
    if (this.fnO == null) {
      this.fnO = new com.tencent.mm.e.a.a(this.kgS);
    }
    ad.QZ("keep_app_silent");
    com.tencent.mm.modelvoice.q.D(paramau);
    this.fnO.ax(false);
    if ((paramau != null) && (this.fnO.h(paramau.field_imgPath, this.khd)))
    {
      ap.AT().e(this.khd, false);
      this.fnO.fpN = this;
      this.fnO.fpM = this;
      this.kgW.setBackgroundResource(R.a.aLw);
      ((AnimationDrawable)this.kgW.getBackground()).start();
      GMTrace.o(7615648104448L, 56741);
      return;
    }
    Toast.makeText(this.kgS, this.kgS.getString(R.l.dJz), 0).show();
    GMTrace.o(7615648104448L, 56741);
  }
  
  private void ahm()
  {
    GMTrace.i(7615782322176L, 56742);
    ad.Ra("keep_app_silent");
    ahk();
    if ((this.kgW.getBackground() instanceof AnimationDrawable))
    {
      ((AnimationDrawable)this.kgW.getBackground()).stop();
      this.kgW.setBackgroundResource(R.g.aWF);
    }
    if (this.fnO != null) {
      this.fnO.ax(false);
    }
    dq(true);
    GMTrace.o(7615782322176L, 56742);
  }
  
  static int lf(int paramInt)
  {
    GMTrace.i(7615513886720L, 56740);
    if (paramInt <= 2)
    {
      GMTrace.o(7615513886720L, 56740);
      return 100;
    }
    if (paramInt < 10)
    {
      GMTrace.o(7615513886720L, 56740);
      return (paramInt - 2) * 8 + 100;
    }
    if (paramInt < 60)
    {
      paramInt /= 10;
      GMTrace.o(7615513886720L, 56740);
      return (paramInt + 7) * 8 + 100;
    }
    GMTrace.o(7615513886720L, 56740);
    return 204;
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(7616184975360L, 56745);
    w.d("MM.Bottle_OpenBottleUI", "onNotifyChange event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.e("MM.Bottle_OpenBottleUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(7616184975360L, 56745);
      return;
    }
    paramm = (String)paramObject;
    if ((!bg.mZ(this.khc)) && (x.SA(this.khc).equals(x.SA(paramm)))) {
      ahl();
    }
    GMTrace.o(7616184975360L, 56745);
  }
  
  public final void ahk()
  {
    GMTrace.i(7615111233536L, 56737);
    if (kha != null) {
      kha.bNK();
    }
    this.khe.bNL();
    GMTrace.o(7615111233536L, 56737);
  }
  
  final void ahl()
  {
    GMTrace.i(7615379668992L, 56739);
    ap.AS();
    Object localObject = com.tencent.mm.x.c.yL().SL(this.khc);
    int i;
    if ((localObject != null) && (this.kgS != null))
    {
      this.kgY.setText(this.kgS.getString(R.l.dDP, new Object[] { com.tencent.mm.plugin.bottle.a.c.b(this.kgS, (x)localObject) }));
      TextView localTextView = this.kgY;
      if (((af)localObject).gbM == 1)
      {
        i = R.k.doH;
        localTextView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.kgY.setCompoundDrawablePadding(8);
        this.kgZ.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.kgS, ((af)localObject).signature, this.kgZ.getTextSize()));
      }
    }
    else
    {
      localObject = x.SA(this.khc);
      if (!bg.mZ((String)localObject)) {
        break label179;
      }
      localObject = this.khc;
    }
    label179:
    for (;;)
    {
      a.b.a((ImageView)findViewById(R.h.bmP), (String)localObject);
      GMTrace.o(7615379668992L, 56739);
      return;
      i = R.k.doG;
      break;
    }
  }
  
  public final boolean ahn()
  {
    GMTrace.i(7616319193088L, 56746);
    if ((this.fnO != null) && (this.fnO.isPlaying()) && (!this.khd))
    {
      GMTrace.o(7616319193088L, 56746);
      return true;
    }
    GMTrace.o(7616319193088L, 56746);
    return false;
  }
  
  public final void dp(boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(7616453410816L, 56747);
    if ((!this.ftK.bQC()) || (this.fnO == null))
    {
      GMTrace.o(7616453410816L, 56747);
      return;
    }
    if (this.khk)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.khk = paramBoolean;
        GMTrace.o(7616453410816L, 56747);
        return;
      }
    }
    if ((!paramBoolean) && (this.khf != -1L) && (bg.aG(this.khf) > 400L))
    {
      this.khk = true;
      GMTrace.o(7616453410816L, 56747);
      return;
    }
    this.khk = false;
    if ((bg.Pq() - this.khj > 500L) && ((paramBoolean) || ((!paramBoolean) && (this.fnO.isPlaying())))) {
      dq(paramBoolean);
    }
    if (this.khg)
    {
      this.fnO.ay(false);
      ap.AT().e(false, false);
      this.khd = false;
      GMTrace.o(7616453410816L, 56747);
      return;
    }
    if (!this.fnO.isPlaying())
    {
      this.fnO.ay(true);
      ap.AT().e(true, false);
      this.khd = true;
      GMTrace.o(7616453410816L, 56747);
      return;
    }
    this.fnO.ay(paramBoolean);
    ap.AT().e(paramBoolean, false);
    this.khd = paramBoolean;
    if (!paramBoolean) {
      F(this.ftK);
    }
    GMTrace.o(7616453410816L, 56747);
  }
  
  final void dq(boolean paramBoolean)
  {
    GMTrace.i(7616587628544L, 56748);
    this.khi.dq(paramBoolean);
    GMTrace.o(7616587628544L, 56748);
  }
  
  public void onClick(final View paramView)
  {
    GMTrace.i(7615245451264L, 56738);
    if (R.h.bmU == paramView.getId())
    {
      paramView = this.khb;
      paramView.kig = this.ftK.bQC();
      paramView.setVisibility(0);
      paramView.kgS.kfB = false;
      paramView.kgS.la(-1);
      paramView.aht();
      paramView.ahr();
      paramView.ahs();
      ap.AS();
      com.tencent.mm.x.c.yK().b(new f(this.khc, 1));
      this.kgc = false;
      paramView = this.kgS;
      this.kgS.getString(R.l.dxm);
      paramView = com.tencent.mm.ui.base.h.a(paramView, this.kgS.getString(R.l.dxB), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(7627727699968L, 56831);
          OpenBottleUI.c(OpenBottleUI.this);
          GMTrace.o(7627727699968L, 56831);
        }
      });
      ay.a(this.khc, new ay.a()
      {
        public final void Bl()
        {
          GMTrace.i(7603836944384L, 56653);
          if (paramView != null) {
            paramView.dismiss();
          }
          GMTrace.o(7603836944384L, 56653);
        }
        
        public final boolean Bm()
        {
          GMTrace.i(7603702726656L, 56652);
          boolean bool = OpenBottleUI.d(OpenBottleUI.this);
          GMTrace.o(7603702726656L, 56652);
          return bool;
        }
      });
      ap.AS();
      com.tencent.mm.x.c.yQ().SU(this.khc);
      ahk();
    }
    do
    {
      ahm();
      do
      {
        GMTrace.o(7615245451264L, 56738);
        return;
        if (R.h.bmS == paramView.getId())
        {
          this.kgS.la(0);
          paramView = new Intent();
          paramView.putExtra("Chat_User", this.khc);
          com.tencent.mm.plugin.bottle.a.ifM.e(paramView, this.kgS);
          ahk();
          break;
        }
      } while (R.h.bmY != paramView.getId());
    } while ((this.fnO != null) && (this.fnO.isPlaying()));
    F(this.ftK);
    GMTrace.o(7615245451264L, 56738);
  }
  
  public final void onError()
  {
    GMTrace.i(7616050757632L, 56744);
    w.v("MM.Bottle_OpenBottleUI", "voice play error");
    ahm();
    GMTrace.o(7616050757632L, 56744);
  }
  
  public final void onPause()
  {
    GMTrace.i(7614977015808L, 56736);
    ap.AT().sw();
    if ((this.ftK != null) && (this.ftK.bQC())) {
      ahk();
    }
    if (this.fnO != null)
    {
      if (this.fnO.isPlaying()) {
        ahm();
      }
      this.fnO.ay(true);
    }
    GMTrace.o(7614977015808L, 56736);
  }
  
  public final void qq()
  {
    GMTrace.i(7615916539904L, 56743);
    w.v("MM.Bottle_OpenBottleUI", "voice play completion");
    ahm();
    GMTrace.o(7615916539904L, 56743);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/OpenBottleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */