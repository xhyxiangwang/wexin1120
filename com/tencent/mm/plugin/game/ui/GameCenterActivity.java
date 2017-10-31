package com.tencent.mm.plugin.game.ui;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.a;
import android.support.v7.app.ActionBar;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowInsets;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.game.c.ce;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.u.a.k;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.6;
import com.tencent.mm.ui.p.a;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.LinkedList;

public abstract class GameCenterActivity
  extends GameBaseActivity
{
  protected ActionBar FR;
  protected int jsW;
  protected View mIk;
  protected View mIl;
  protected int mIm;
  protected String mIn;
  private ce mIo;
  
  public GameCenterActivity()
  {
    GMTrace.i(19277289619456L, 143627);
    this.mIm = 0;
    this.mIn = null;
    GMTrace.o(19277289619456L, 143627);
  }
  
  private boolean aFw()
  {
    GMTrace.i(19278094925824L, 143633);
    if ((!bg.mZ(this.mIn)) && (this.mIn.equals("black")))
    {
      GMTrace.o(19278094925824L, 143633);
      return true;
    }
    GMTrace.o(19278094925824L, 143633);
    return false;
  }
  
  @TargetApi(21)
  private void setStatusBarColor(int paramInt)
  {
    GMTrace.i(19277960708096L, 143632);
    if ((this.jsW <= 0) || (com.tencent.mm.compatible.util.d.eu(21)))
    {
      GMTrace.o(19277960708096L, 143632);
      return;
    }
    getWindow().setStatusBarColor(0);
    ViewGroup.LayoutParams localLayoutParams;
    if (this.mIl == null)
    {
      this.mIl = new View(this);
      this.mIl.setId(R.h.bKY);
      localLayoutParams = new ViewGroup.LayoutParams(-1, this.jsW);
      ((ViewGroup)findViewById(16908290)).addView(this.mIl, localLayoutParams);
    }
    for (;;)
    {
      this.mIl.setBackgroundColor(paramInt);
      GMTrace.o(19277960708096L, 143632);
      return;
      localLayoutParams = this.mIl.getLayoutParams();
      if (localLayoutParams.height != this.jsW)
      {
        localLayoutParams.height = this.jsW;
        this.mIl.setLayoutParams(localLayoutParams);
      }
    }
  }
  
  protected final void Vt()
  {
    GMTrace.i(19277558054912L, 143629);
    aq(5);
    aq(9);
    setProgressBarIndeterminateVisibility(false);
    GMTrace.o(19277558054912L, 143629);
  }
  
  public final void a(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(19278497579008L, 143636);
    Drawable localDrawable = a.b(this, paramInt2);
    if (localDrawable == null)
    {
      GMTrace.o(19278497579008L, 143636);
      return;
    }
    if (aFw()) {
      localDrawable.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }
    for (;;)
    {
      a(paramInt1, getString(a.k.gYD), localDrawable, paramOnMenuItemClickListener);
      GMTrace.o(19278497579008L, 143636);
      return;
      localDrawable.clearColorFilter();
    }
  }
  
  public final void a(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(19278363361280L, 143635);
    if (aFw())
    {
      p localp = this.vov;
      int i = p.b.vpA;
      p.a locala = new p.a();
      locala.vpu = paramInt;
      locala.text = paramString;
      locala.textColor = -16777216;
      locala.pbJ = paramOnMenuItemClickListener;
      locala.lVS = null;
      locala.vpz = i;
      localp.Av(locala.vpu);
      localp.voU.add(locala);
      new ae().postDelayed(new p.6(localp), 200L);
    }
    GMTrace.o(19278363361280L, 143635);
  }
  
  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    GMTrace.i(20360426684416L, 151697);
    w.i("MicroMsg.GameCenterActivity", "setBackBtn");
    super.a(paramOnMenuItemClickListener, 0);
    if (aFw())
    {
      w.i("MicroMsg.GameCenterActivity", "setBackBtn, setBackBtnColorFilter");
      bUy();
    }
    GMTrace.o(20360426684416L, 151697);
  }
  
  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    GMTrace.i(20360292466688L, 151696);
    w.i("MicroMsg.GameCenterActivity", "setBackBtn");
    super.a(paramOnMenuItemClickListener, paramInt);
    if (aFw())
    {
      w.i("MicroMsg.GameCenterActivity", "setBackBtn, setBackBtnColorFilter");
      bUy();
    }
    GMTrace.o(20360292466688L, 151696);
  }
  
  @TargetApi(21)
  protected final void a(ViewGroup paramViewGroup, WindowInsets paramWindowInsets)
  {
    GMTrace.i(19277826490368L, 143631);
    if (this.jsW == paramWindowInsets.getSystemWindowInsetTop())
    {
      GMTrace.o(19277826490368L, 143631);
      return;
    }
    this.jsW = paramWindowInsets.getSystemWindowInsetTop();
    aFv();
    Object localObject = paramViewGroup;
    if ((paramViewGroup instanceof SwipeBackLayout)) {
      localObject = paramViewGroup.getChildAt(0);
    }
    int i = R.h.action_bar_container;
    if (i > 0)
    {
      paramViewGroup = ((View)localObject).findViewById(i);
      if (paramViewGroup != null)
      {
        localObject = (ViewGroup.MarginLayoutParams)paramViewGroup.getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).topMargin = paramWindowInsets.getSystemWindowInsetTop();
        paramViewGroup.setLayoutParams((ViewGroup.LayoutParams)localObject);
        paramViewGroup.requestLayout();
      }
    }
    w.i("MicroMsg.GameCenterActivity", "setInitialStatusBarStyle");
    if (this.mIm != 0)
    {
      if (this.FR != null) {
        this.FR.setBackgroundDrawable(new ColorDrawable(this.mIm));
      }
      if (aFw())
      {
        w.i("MicroMsg.GameCenterActivity", "setBackBtnColorFilter");
        bUy();
      }
      int j = this.mIm;
      boolean bool = aFw();
      if ((Build.VERSION.SDK_INT >= 23) && (!h.tJ()))
      {
        setStatusBarColor(j);
        paramViewGroup = getWindow();
        i = paramViewGroup.getDecorView().getSystemUiVisibility();
        if (bool) {
          i |= 0x2000;
        }
        for (;;)
        {
          paramViewGroup.getDecorView().setSystemUiVisibility(i);
          GMTrace.o(19277826490368L, 143631);
          return;
          i &= 0xDFFF;
        }
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        i = j;
        if (bool) {
          i = com.tencent.mm.plugin.webview.ui.tools.d.k(j, 0.78F);
        }
        setStatusBarColor(i);
      }
      GMTrace.o(19277826490368L, 143631);
      return;
    }
    setStatusBarColor(getResources().getColor(R.e.aQq));
    GMTrace.o(19277826490368L, 143631);
  }
  
  protected final void aFv()
  {
    GMTrace.i(19277692272640L, 143630);
    if (this.mIk == null)
    {
      GMTrace.o(19277692272640L, 143630);
      return;
    }
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.mIk.getLayoutParams();
    int j = this.jsW;
    if (this.FR != null) {}
    for (int i = this.FR.getHeight();; i = 0)
    {
      i += j;
      if (i != localMarginLayoutParams.topMargin)
      {
        localMarginLayoutParams.topMargin = i;
        this.mIk.setLayoutParams(localMarginLayoutParams);
      }
      GMTrace.o(19277692272640L, 143630);
      return;
    }
  }
  
  public final void oC(int paramInt)
  {
    GMTrace.i(19278229143552L, 143634);
    super.oC(paramInt);
    if (aFw()) {
      Ao(-16777216);
    }
    GMTrace.o(19278229143552L, 143634);
  }
  
  /* Error */
  public void onCreate(final android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc2_w 383
    //   3: ldc_w 385
    //   6: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 387	com/tencent/mm/plugin/game/ui/GameBaseActivity:onCreate	(Landroid/os/Bundle;)V
    //   14: aload_0
    //   15: aload_0
    //   16: invokevirtual 393	android/support/v7/app/AppCompatActivity:cO	()Landroid/support/v7/app/d;
    //   19: invokevirtual 399	android/support/v7/app/d:cP	()Landroid/support/v7/app/ActionBar;
    //   22: putfield 306	com/tencent/mm/plugin/game/ui/GameCenterActivity:FR	Landroid/support/v7/app/ActionBar;
    //   25: aload_0
    //   26: invokestatic 405	com/tencent/mm/plugin/game/model/g:aEh	()Lcom/tencent/mm/plugin/game/model/g;
    //   29: invokevirtual 409	com/tencent/mm/plugin/game/model/g:aEj	()Lcom/tencent/mm/plugin/game/c/ce;
    //   32: putfield 411	com/tencent/mm/plugin/game/ui/GameCenterActivity:mIo	Lcom/tencent/mm/plugin/game/c/ce;
    //   35: aload_0
    //   36: getfield 411	com/tencent/mm/plugin/game/ui/GameCenterActivity:mIo	Lcom/tencent/mm/plugin/game/c/ce;
    //   39: ifnull +28 -> 67
    //   42: aload_0
    //   43: aload_0
    //   44: getfield 411	com/tencent/mm/plugin/game/ui/GameCenterActivity:mIo	Lcom/tencent/mm/plugin/game/c/ce;
    //   47: getfield 416	com/tencent/mm/plugin/game/c/ce:hbA	Ljava/lang/String;
    //   50: invokestatic 422	com/tencent/mm/plugin/game/d/c:parseColor	(Ljava/lang/String;)I
    //   53: putfield 35	com/tencent/mm/plugin/game/ui/GameCenterActivity:mIm	I
    //   56: aload_0
    //   57: aload_0
    //   58: getfield 411	com/tencent/mm/plugin/game/ui/GameCenterActivity:mIo	Lcom/tencent/mm/plugin/game/c/ce;
    //   61: getfield 425	com/tencent/mm/plugin/game/c/ce:mGx	Ljava/lang/String;
    //   64: putfield 37	com/tencent/mm/plugin/game/ui/GameCenterActivity:mIn	Ljava/lang/String;
    //   67: aload_0
    //   68: aload_0
    //   69: getfield 192	com/tencent/mm/ui/MMActivity:vov	Lcom/tencent/mm/ui/p;
    //   72: getfield 428	com/tencent/mm/ui/p:iiK	Landroid/view/View;
    //   75: putfield 366	com/tencent/mm/plugin/game/ui/GameCenterActivity:mIk	Landroid/view/View;
    //   78: aload_0
    //   79: getfield 366	com/tencent/mm/plugin/game/ui/GameCenterActivity:mIk	Landroid/view/View;
    //   82: ifnull +35 -> 117
    //   85: aload_0
    //   86: invokevirtual 285	com/tencent/mm/plugin/game/ui/GameCenterActivity:aFv	()V
    //   89: aload_0
    //   90: invokevirtual 80	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   93: invokevirtual 333	android/view/Window:getDecorView	()Landroid/view/View;
    //   96: checkcast 111	android/view/ViewGroup
    //   99: iconst_0
    //   100: invokevirtual 290	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   103: checkcast 111	android/view/ViewGroup
    //   106: new 6	com/tencent/mm/plugin/game/ui/GameCenterActivity$1
    //   109: dup
    //   110: aload_0
    //   111: invokespecial 431	com/tencent/mm/plugin/game/ui/GameCenterActivity$1:<init>	(Lcom/tencent/mm/plugin/game/ui/GameCenterActivity;)V
    //   114: invokevirtual 435	android/view/ViewGroup:addOnLayoutChangeListener	(Landroid/view/View$OnLayoutChangeListener;)V
    //   117: bipush 21
    //   119: invokestatic 438	com/tencent/mm/compatible/util/d:et	(I)Z
    //   122: ifeq +67 -> 189
    //   125: aload_0
    //   126: invokevirtual 80	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   129: invokevirtual 333	android/view/Window:getDecorView	()Landroid/view/View;
    //   132: checkcast 111	android/view/ViewGroup
    //   135: iconst_0
    //   136: invokevirtual 290	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   139: checkcast 111	android/view/ViewGroup
    //   142: astore_1
    //   143: aload_1
    //   144: new 8	com/tencent/mm/plugin/game/ui/GameCenterActivity$2
    //   147: dup
    //   148: aload_0
    //   149: aload_1
    //   150: invokespecial 441	com/tencent/mm/plugin/game/ui/GameCenterActivity$2:<init>	(Lcom/tencent/mm/plugin/game/ui/GameCenterActivity;Landroid/view/ViewGroup;)V
    //   153: invokevirtual 445	android/view/ViewGroup:setOnApplyWindowInsetsListener	(Landroid/view/View$OnApplyWindowInsetsListener;)V
    //   156: ldc2_w 383
    //   159: ldc_w 385
    //   162: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   165: return
    //   166: astore_1
    //   167: ldc -2
    //   169: ldc_w 447
    //   172: iconst_1
    //   173: anewarray 449	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload_1
    //   179: invokevirtual 453	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   182: aastore
    //   183: invokestatic 457	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: goto -69 -> 117
    //   189: aload_0
    //   190: invokevirtual 80	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   193: invokevirtual 333	android/view/Window:getDecorView	()Landroid/view/View;
    //   196: checkcast 111	android/view/ViewGroup
    //   199: iconst_1
    //   200: invokevirtual 460	android/view/ViewGroup:setFitsSystemWindows	(Z)V
    //   203: ldc2_w 383
    //   206: ldc_w 385
    //   209: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   212: return
    //   213: astore_1
    //   214: ldc -2
    //   216: ldc_w 462
    //   219: iconst_1
    //   220: anewarray 449	java/lang/Object
    //   223: dup
    //   224: iconst_0
    //   225: aload_1
    //   226: invokevirtual 453	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   229: aastore
    //   230: invokestatic 457	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: ldc2_w 383
    //   236: ldc_w 385
    //   239: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   242: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	243	0	this	GameCenterActivity
    //   0	243	1	paramBundle	android.os.Bundle
    // Exception table:
    //   from	to	target	type
    //   67	117	166	java/lang/Exception
    //   117	165	213	java/lang/Exception
    //   189	203	213	java/lang/Exception
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */