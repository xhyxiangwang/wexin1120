package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.p.h;
import com.tencent.mm.plugin.appbrand.ui.g;
import com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase;
import com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyPanelBase.a;
import com.tencent.mm.plugin.appbrand.widget.input.panel.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public final class u
  extends LinearLayout
  implements s.a
{
  private static final int jBU;
  private static final a jDa;
  private MMActivity fsU;
  private final Runnable jCN;
  c jCO;
  b jCP;
  private boolean jCQ;
  d jCR;
  private AppBrandSmileyPanel jCS;
  private f jCT;
  private ImageButton jCU;
  private boolean jCV;
  private View jCW;
  private boolean jCX;
  public EditText jCY;
  private int jCZ;
  private int state;
  
  static
  {
    GMTrace.i(18280186118144L, 136198);
    jBU = p.f.itf;
    jDa = new e();
    GMTrace.o(18280186118144L, 136198);
  }
  
  private u(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(18275891150848L, 136166);
    this.jCN = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18253745225728L, 136001);
        if ((u.a(u.this) == null) || (!z.al(u.a(u.this))))
        {
          GMTrace.o(18253745225728L, 136001);
          return;
        }
        if (u.a(u.this).acp())
        {
          w.d("MicroMsg.AppBrandSmileyPanelWrapper", "postMeasure inLayout, skip");
          u.this.post(this);
          GMTrace.o(18253745225728L, 136001);
          return;
        }
        u.b(u.this);
        GMTrace.o(18253745225728L, 136001);
      }
    };
    this.jCQ = false;
    this.state = 2;
    this.jCZ = 0;
    this.fsU = ((MMActivity)paramContext);
    super.setId(jBU);
    setOrientation(1);
    this.jCT = new f(getContext());
    paramContext = this.jCT;
    StateListDrawable localStateListDrawable = new StateListDrawable();
    Drawable localDrawable = ab.getResources().getDrawable(p.h.drc);
    localStateListDrawable.addState(new int[] { 16842913 }, localDrawable);
    localDrawable = ab.getResources().getDrawable(p.h.drb);
    localStateListDrawable.addState(new int[0], localDrawable);
    this.jCU = ((ImageButton)paramContext.findViewById(p.f.iuJ));
    this.jCU.setSelected(false);
    this.jCU.setImageDrawable(localStateListDrawable);
    this.jCU.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18288507617280L, 136260);
        if (paramAnonymousView.isSelected())
        {
          u.acw().n(u.this);
          paramAnonymousView.setSelected(false);
          GMTrace.o(18288507617280L, 136260);
          return;
        }
        u.acw().o(u.this);
        paramAnonymousView.setSelected(true);
        GMTrace.o(18288507617280L, 136260);
      }
    });
    this.jCW = paramContext.findViewById(p.f.iuI);
    this.jCW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18287299657728L, 136251);
        u.c(u.this);
        GMTrace.o(18287299657728L, 136251);
      }
    });
    addView(this.jCT);
    this.jCS = new AppBrandSmileyPanel(getContext());
    this.jCS.setVisibility(8);
    this.jCS.setBackgroundColor(0);
    paramContext = this.jCS;
    paramContext.jFo = new AppBrandSmileyPanelBase.a()
    {
      public final void acx()
      {
        GMTrace.i(18248913387520L, 135965);
        if (u.d(u.this) != null) {
          u.d(u.this).sv("[DELETE_EMOTION]");
        }
        GMTrace.o(18248913387520L, 135965);
      }
      
      public final void append(String paramAnonymousString)
      {
        GMTrace.i(18248779169792L, 135964);
        if (u.d(u.this) != null) {
          u.d(u.this).sv(paramAnonymousString);
        }
        GMTrace.o(18248779169792L, 135964);
      }
    };
    paramContext.jFc.jFv = paramContext.jFo;
    addView(this.jCS);
    acu();
    GMTrace.o(18275891150848L, 136166);
  }
  
  private void abV()
  {
    GMTrace.i(18276830674944L, 136173);
    jDa.l(this);
    this.jCU.setSelected(false);
    jV(0);
    GMTrace.o(18276830674944L, 136173);
  }
  
  private void acq()
  {
    GMTrace.i(18276159586304L, 136168);
    ((s)l.bQ(this).jBZ).jCG = this;
    GMTrace.o(18276159586304L, 136168);
  }
  
  private void acr()
  {
    GMTrace.i(18276293804032L, 136169);
    ((s)l.bQ(this).jBZ).jCG = null;
    GMTrace.o(18276293804032L, 136169);
  }
  
  private void acs()
  {
    GMTrace.i(18276562239488L, 136171);
    abV();
    if (this.jCY != null)
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)this.jCY.getContext().getSystemService("input_method");
      if (!localInputMethodManager.showSoftInput(this.jCY, 1)) {
        localInputMethodManager.showSoftInput(this.jCY, 2);
      }
      GMTrace.o(18276562239488L, 136171);
      return;
    }
    this.fsU.aKp();
    GMTrace.o(18276562239488L, 136171);
  }
  
  private void act()
  {
    GMTrace.i(18276696457216L, 136172);
    jDa.m(this);
    this.jCU.setSelected(true);
    jV(1);
    GMTrace.o(18276696457216L, 136172);
  }
  
  private void acu()
  {
    int k = 1;
    GMTrace.i(18276964892672L, 136174);
    if (this.jCT == null)
    {
      GMTrace.o(18276964892672L, 136174);
      return;
    }
    f localf = this.jCT;
    int j;
    label52:
    boolean bool;
    if (!this.jCV)
    {
      i = 1;
      if (this.jCX) {
        break label127;
      }
      j = 1;
      if (((i & j) == 0) && (!g.bI(this))) {
        break label132;
      }
      bool = true;
      label68:
      if (bool == localf.jDe) {
        break label138;
      }
    }
    label127:
    label132:
    label138:
    for (int i = k;; i = 0)
    {
      localf.jDe = bool;
      if ((i != 0) && ((Build.VERSION.SDK_INT < 18) || (!localf.isInLayout()))) {
        localf.requestLayout();
      }
      GMTrace.o(18276964892672L, 136174);
      return;
      i = 0;
      break;
      j = 0;
      break label52;
      bool = false;
      break label68;
    }
  }
  
  public static u bW(View paramView)
  {
    GMTrace.i(18274817409024L, 136158);
    paramView = (u)paramView.getRootView().findViewById(jBU);
    GMTrace.o(18274817409024L, 136158);
    return paramView;
  }
  
  public static u bX(View paramView)
  {
    GMTrace.i(18274951626752L, 136159);
    l locall = l.bQ(paramView);
    if ((locall.jBZ == null) || (!(locall.jBZ instanceof s))) {
      locall.jBZ = new s();
    }
    u localu2 = bW(paramView);
    u localu1 = localu2;
    if (localu2 == null)
    {
      localu1 = new u(paramView.getContext());
      locall.bR(localu1);
    }
    GMTrace.o(18274951626752L, 136159);
    return localu1;
  }
  
  private void cP(boolean paramBoolean)
  {
    GMTrace.i(18275756933120L, 136165);
    if ((!this.jCQ) && (this.jCP != null))
    {
      this.jCQ = true;
      this.jCP.cP(paramBoolean);
      this.jCQ = false;
    }
    GMTrace.o(18275756933120L, 136165);
  }
  
  private void jU(int paramInt)
  {
    GMTrace.i(18275488497664L, 136163);
    AppBrandSmileyPanel localAppBrandSmileyPanel = this.jCS;
    if ((paramInt > 0) && (localAppBrandSmileyPanel.jCM != paramInt)) {
      localAppBrandSmileyPanel.jCM = paramInt;
    }
    for (paramInt = 1;; paramInt = 0)
    {
      if (paramInt != 0) {
        this.jCN.run();
      }
      GMTrace.o(18275488497664L, 136163);
      return;
    }
  }
  
  private void jV(final int paramInt)
  {
    GMTrace.i(18276428021760L, 136170);
    post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18247973863424L, 135958);
        int i = u.e(u.this);
        if (!u.this.isShown()) {
          u.a(u.this, 2);
        }
        while (u.f(u.this) == null)
        {
          GMTrace.o(18247973863424L, 135958);
          return;
          u.a(u.this, paramInt);
        }
        if ((i != u.e(u.this)) && (!this.jDd)) {
          u.f(u.this).jR(u.e(u.this));
        }
        GMTrace.o(18247973863424L, 135958);
      }
    });
    GMTrace.o(18276428021760L, 136170);
  }
  
  public final void acv()
  {
    int i = 0;
    GMTrace.i(18277770199040L, 136180);
    this.jCV = false;
    ImageButton localImageButton;
    if (this.jCU != null)
    {
      localImageButton = this.jCU;
      if (!this.jCV) {
        break label54;
      }
    }
    for (;;)
    {
      localImageButton.setVisibility(i);
      acu();
      GMTrace.o(18277770199040L, 136180);
      return;
      label54:
      i = 4;
    }
  }
  
  public final void b(EditText paramEditText)
  {
    GMTrace.i(18845645406208L, 140411);
    if (paramEditText == this.jCY) {
      this.jCY = null;
    }
    GMTrace.o(18845645406208L, 140411);
  }
  
  public final void cT(boolean paramBoolean)
  {
    GMTrace.i(18275354279936L, 136162);
    w.d("MicroMsg.AppBrandSmileyPanelWrapper", "onKeyboardStateChanged, kbShown = %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      jW(0);
      abV();
      GMTrace.o(18275354279936L, 136162);
      return;
    }
    if (isShown())
    {
      if ((this.jCV) && (1 == this.state))
      {
        act();
        GMTrace.o(18275354279936L, 136162);
        return;
      }
      hide();
    }
    GMTrace.o(18275354279936L, 136162);
  }
  
  public final void cU(boolean paramBoolean)
  {
    GMTrace.i(18277904416768L, 136181);
    this.jCX = paramBoolean;
    View localView;
    if (this.jCW != null)
    {
      localView = this.jCW;
      if (!this.jCX) {
        break label54;
      }
    }
    label54:
    for (int i = 0;; i = 4)
    {
      localView.setVisibility(i);
      acu();
      GMTrace.o(18277904416768L, 136181);
      return;
    }
  }
  
  public final int getMinimumHeight()
  {
    GMTrace.i(18275622715392L, 136164);
    if (getVisibility() == 0)
    {
      int i = a.fromDPToPix(getContext(), 48);
      GMTrace.o(18275622715392L, 136164);
      return i;
    }
    GMTrace.o(18275622715392L, 136164);
    return 0;
  }
  
  public final void hide()
  {
    GMTrace.i(18278172852224L, 136183);
    if (!isShown())
    {
      GMTrace.o(18278172852224L, 136183);
      return;
    }
    jW(8);
    if ((this.fsU != null) && (!this.fsU.vov.auJ())) {
      ac.cb(this).hideSoftInputFromWindow(getWindowToken(), 0);
    }
    abV();
    GMTrace.o(18278172852224L, 136183);
  }
  
  public final void jT(int paramInt)
  {
    GMTrace.i(18275085844480L, 136160);
    jDa.c(this, paramInt);
    GMTrace.o(18275085844480L, 136160);
  }
  
  final void jW(int paramInt)
  {
    GMTrace.i(18277635981312L, 136179);
    int i = paramInt;
    if (paramInt == 0)
    {
      i = paramInt;
      if (g.bI(this)) {
        i = 8;
      }
    }
    if (getVisibility() == i)
    {
      GMTrace.o(18277635981312L, 136179);
      return;
    }
    super.setVisibility(i);
    if (i == 0)
    {
      acq();
      GMTrace.o(18277635981312L, 136179);
      return;
    }
    acr();
    GMTrace.o(18277635981312L, 136179);
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(18277233328128L, 136176);
    super.onAttachedToWindow();
    acq();
    GMTrace.o(18277233328128L, 136176);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(18277367545856L, 136177);
    super.onDetachedFromWindow();
    jW(8);
    if (this.fsU != null)
    {
      if (this.jCY == null) {
        break label144;
      }
      this.fsU.da(this.jCY);
    }
    for (;;)
    {
      AppBrandSmileyPanel localAppBrandSmileyPanel = this.jCS;
      c localc = localAppBrandSmileyPanel.jFc;
      localc.jFu = null;
      localc.jFb = null;
      if (localAppBrandSmileyPanel.HB != null)
      {
        ((ViewGroup)localAppBrandSmileyPanel.HB.getParent()).removeView(localAppBrandSmileyPanel.HB);
        ((ViewGroup)localAppBrandSmileyPanel.HB).removeAllViews();
        localAppBrandSmileyPanel.HB = null;
      }
      localAppBrandSmileyPanel.jFp = null;
      this.jCU.setOnClickListener(null);
      this.jCO = null;
      removeAllViews();
      this.fsU = null;
      acr();
      GMTrace.o(18277367545856L, 136177);
      return;
      label144:
      this.fsU.aKl();
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18275220062208L, 136161);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    w.v("MicroMsg.AppBrandSmileyPanelWrapper", "[scrollUp] SoftKeyboardPanel onLayout measuredHeight = %d", new Object[] { Integer.valueOf(getMeasuredHeight()) });
    GMTrace.o(18275220062208L, 136161);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(18277099110400L, 136175);
    super.onMeasure(paramInt1, paramInt2);
    w.d("MicroMsg.AppBrandSmileyPanelWrapper", "smileyPanelWrapper, onMeasure");
    GMTrace.o(18277099110400L, 136175);
  }
  
  public final void setId(int paramInt)
  {
    GMTrace.i(18276025368576L, 136167);
    GMTrace.o(18276025368576L, 136167);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(18277501763584L, 136178);
    if (paramInt == 8)
    {
      if (getVisibility() != paramInt) {
        cP(false);
      }
      hide();
      GMTrace.o(18277501763584L, 136178);
      return;
    }
    if (paramInt == 0)
    {
      show();
      GMTrace.o(18277501763584L, 136178);
      return;
    }
    jW(paramInt);
    GMTrace.o(18277501763584L, 136178);
  }
  
  public final void show()
  {
    GMTrace.i(18278038634496L, 136182);
    acs();
    acv();
    cU(this.jCX);
    acu();
    if (!isShown()) {
      jW(0);
    }
    jU(j.aK(getContext()));
    GMTrace.o(18278038634496L, 136182);
  }
  
  static abstract interface a
  {
    public abstract void c(u paramu, int paramInt);
    
    public abstract void l(u paramu);
    
    public abstract void m(u paramu);
    
    public abstract void n(u paramu);
    
    public abstract void o(u paramu);
  }
  
  public static abstract interface b
  {
    public abstract void cP(boolean paramBoolean);
  }
  
  public static abstract interface c
  {
    public abstract boolean sv(String paramString);
  }
  
  public static abstract interface d
  {
    public abstract void jR(int paramInt);
  }
  
  private static final class e
    implements u.a
  {
    public e()
    {
      GMTrace.i(18288641835008L, 136261);
      GMTrace.o(18288641835008L, 136261);
    }
    
    public final void c(u paramu, int paramInt)
    {
      GMTrace.i(18289044488192L, 136264);
      if (g.bI(paramu))
      {
        paramu.jW(8);
        GMTrace.o(18289044488192L, 136264);
        return;
      }
      if ((u.a(paramu) == null) || (paramInt <= 0))
      {
        GMTrace.o(18289044488192L, 136264);
        return;
      }
      u.b(paramu, paramInt);
      GMTrace.o(18289044488192L, 136264);
    }
    
    public final void l(u paramu)
    {
      GMTrace.i(18288776052736L, 136262);
      if (paramu.isShown()) {
        u.a(paramu).setVisibility(0);
      }
      u.a(paramu).acW();
      GMTrace.o(18288776052736L, 136262);
    }
    
    public final void m(u paramu)
    {
      GMTrace.i(18288910270464L, 136263);
      if (g.bI(paramu))
      {
        paramu.jW(8);
        u.g(paramu);
        GMTrace.o(18288910270464L, 136263);
        return;
      }
      if (paramu.isShown()) {
        u.a(paramu).setVisibility(0);
      }
      if (!u.h(paramu))
      {
        u.a(paramu).acW();
        GMTrace.o(18288910270464L, 136263);
        return;
      }
      paramu = u.a(paramu);
      if (paramu.HB != null) {
        paramu.HB.setVisibility(0);
      }
      GMTrace.o(18288910270464L, 136263);
    }
    
    public final void n(u paramu)
    {
      GMTrace.i(18289178705920L, 136265);
      u.i(paramu).aKp();
      u.j(paramu);
      GMTrace.o(18289178705920L, 136265);
    }
    
    public final void o(u paramu)
    {
      GMTrace.i(18289312923648L, 136266);
      u.i(paramu).aKl();
      u.k(paramu);
      paramu.jT(j.aK(u.i(paramu)));
      GMTrace.o(18289312923648L, 136266);
    }
  }
  
  private static final class f
    extends FrameLayout
  {
    boolean jDe;
    
    public f(Context paramContext)
    {
      super();
      GMTrace.i(18247571210240L, 135955);
      this.jDe = false;
      LayoutInflater.from(paramContext).inflate(p.g.ivH, this);
      GMTrace.o(18247571210240L, 135955);
    }
    
    protected final void onMeasure(int paramInt1, int paramInt2)
    {
      GMTrace.i(18247705427968L, 135956);
      if ((this.jDe) || (!isShown()))
      {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
      }
      super.onMeasure(paramInt1, paramInt2);
      GMTrace.o(18247705427968L, 135956);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */