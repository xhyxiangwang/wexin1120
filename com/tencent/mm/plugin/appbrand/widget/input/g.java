package com.tencent.mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.support.v4.view.z;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.widget.input.a.a;
import com.tencent.mm.plugin.appbrand.widget.input.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.tools.h.a;
import com.tencent.mm.ui.widget.h;
import java.lang.ref.WeakReference;

public abstract class g
  implements w<v>
{
  public WeakReference<AppBrandPageView> iWI;
  private final c.a jAN;
  public volatile b jBf;
  public volatile a jBg;
  public final View.OnFocusChangeListener jBh;
  private int jBi;
  private int jBj;
  public int jBk;
  public com.tencent.mm.plugin.appbrand.widget.input.b.e jBl;
  public String jBm;
  public v jBn;
  public u jBo;
  private t jBp;
  final Runnable jBq;
  public final a jBr;
  public boolean jBs;
  public final Runnable jBt;
  public final ae jBu;
  private final u.c jBv;
  private final u.b jBw;
  private final u.d jBx;
  
  public g()
  {
    GMTrace.i(10060424019968L, 74956);
    this.jBh = new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        int j = 0;
        GMTrace.i(18281528295424L, 136208);
        paramAnonymousView = g.this;
        if (paramAnonymousBoolean) {
          paramAnonymousView.abR();
        }
        if (paramAnonymousView.jBo == null) {
          paramAnonymousView.jBo = paramAnonymousView.abU();
        }
        if (paramAnonymousView.jBg != null) {
          paramAnonymousView.jBg.cf(paramAnonymousBoolean);
        }
        if ((paramAnonymousView.jBn != null) && (paramAnonymousBoolean) && (paramAnonymousView.jBl.jGr.booleanValue())) {
          af.i(paramAnonymousView.jBq, 100L);
        }
        if ((paramAnonymousView.jBn != null) && (!paramAnonymousBoolean) && (!paramAnonymousView.jBl.jFU))
        {
          if (paramAnonymousView.jBk == 0) {
            paramAnonymousView.cO(false);
          }
          paramAnonymousView.jBn.setFocusable(false);
          paramAnonymousView.jBn.setFocusableInTouchMode(false);
          if (paramAnonymousView.jBo.jCY == paramAnonymousView.jBn)
          {
            paramAnonymousView.jBo.hide();
            paramAnonymousView.jBo.b(paramAnonymousView.jBn);
          }
        }
        if ((paramAnonymousView.jBo != null) && (paramAnonymousView.jBn != null) && (!paramAnonymousBoolean) && (paramAnonymousView.jBl.jFU))
        {
          paramAnonymousView.cO(false);
          if (paramAnonymousView.jBl.jFU)
          {
            paramAnonymousView.a(paramAnonymousView.jBn);
            paramAnonymousView.onDestroy();
          }
        }
        int i = j;
        if (paramAnonymousBoolean) {
          if (g.this.jBl.jFU)
          {
            i = j;
            if (!com.tencent.mm.plugin.appbrand.ui.g.bI(g.this.jBn)) {}
          }
          else
          {
            i = 1;
          }
        }
        if ((i != 0) && (g.this.jBn != null) && (g.this.jBo != null))
        {
          g.this.jBn.requestFocus();
          g.this.jBo.show();
        }
        GMTrace.o(18281528295424L, 136208);
      }
    };
    this.jBi = -1;
    this.jBj = -1;
    this.jBk = 0;
    this.jAN = new n.a()
    {
      public final void abH()
      {
        GMTrace.i(18280722989056L, 136202);
        if (g.this.jBn != null) {
          try
          {
            g.this.jBr.a(g.this.jBn.getEditableText(), false);
            GMTrace.o(18280722989056L, 136202);
            return;
          }
          catch (Exception localException) {}
        }
        GMTrace.o(18280722989056L, 136202);
      }
    };
    this.jBq = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10089817702400L, 75175);
        g.this.abQ();
        GMTrace.o(10089817702400L, 75175);
      }
    };
    this.jBr = new a();
    this.jBs = false;
    this.jBt = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10080825114624L, 75108);
        g.this.jBs = false;
        GMTrace.o(10080825114624L, 75108);
      }
    };
    this.jBu = new ae(Looper.getMainLooper());
    this.jBv = new u.c()
    {
      public final boolean sv(String paramAnonymousString)
      {
        GMTrace.i(18253879443456L, 136002);
        if (g.this.jBn != null)
        {
          if (!"[DELETE_EMOTION]".equalsIgnoreCase(paramAnonymousString)) {
            break label125;
          }
          paramAnonymousString = g.this.jBn;
          if (paramAnonymousString.jDf == null) {
            break label92;
          }
          if (!bg.L(paramAnonymousString.getEditableText())) {
            paramAnonymousString.jDf.deleteSurroundingText(paramAnonymousString.getEditableText().length(), paramAnonymousString.getEditableText().length() - 1);
          }
        }
        for (;;)
        {
          GMTrace.o(18253879443456L, 136002);
          return true;
          label92:
          paramAnonymousString.dispatchKeyEvent(new KeyEvent(0, 67));
          paramAnonymousString.dispatchKeyEvent(new KeyEvent(1, 67));
        }
        label125:
        v localv = g.this.jBn;
        if (localv.getEditableText() == null) {
          localv.setText(paramAnonymousString, TextView.BufferType.EDITABLE);
        }
        for (;;)
        {
          localv.setSelection(localv.getEditableText().length());
          break;
          localv.getEditableText().append(paramAnonymousString);
        }
      }
    };
    this.jBw = new u.b()
    {
      public final void cP(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18255758491648L, 136016);
        if (paramAnonymousBoolean) {
          g.this.jBk = g.c.jBB;
        }
        g.this.abT();
        g.this.jBk = 0;
        GMTrace.o(18255758491648L, 136016);
      }
    };
    this.jBx = new u.d()
    {
      public final void jR(int paramAnonymousInt)
      {
        GMTrace.i(18248108081152L, 135959);
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandInputInvokeHandler", "[appInput], onSmileyPanelVisibilityChanged = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousInt != 2)
        {
          if ((paramAnonymousInt == 0) && (g.this.jBn != null)) {
            g.this.jBn.requestFocus();
          }
          g.this.abW();
          if ((g.this.iWI != null) && (g.this.iWI.get() != null))
          {
            m.a((AppBrandPageView)g.this.iWI.get(), g.this.jBn);
            GMTrace.o(18248108081152L, 135959);
          }
        }
        else
        {
          g.this.jBk = g.c.jBA;
          g.this.abT();
          g.this.jBk = 0;
        }
        GMTrace.o(18248108081152L, 135959);
      }
    };
    GMTrace.o(10060424019968L, 74956);
  }
  
  private boolean a(v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18254282096640L, 136005);
    if ((paramv == null) || (this.iWI == null) || (this.iWI.get() == null))
    {
      GMTrace.o(18254282096640L, 136005);
      return false;
    }
    e locale = ((AppBrandPageView)this.iWI.get()).jlb;
    if ((locale != null) && (locale.b(((AppBrandPageView)this.iWI.get()).jlc, paramv, paramInt1, paramInt2, paramInt3, paramInt4)))
    {
      GMTrace.o(18254282096640L, 136005);
      return true;
    }
    GMTrace.o(18254282096640L, 136005);
    return false;
  }
  
  private void abO()
  {
    GMTrace.i(15424435519488L, 114921);
    int k;
    int i;
    if ((this.jBn != null) && (ac.d(this.jBl.jGt)) && (ac.d(this.jBl.jGr)))
    {
      ((o)this.jBn).cR(true);
      j = this.jBn.getLineHeight();
      k = this.jBn.acz();
      if ((this.jBl.jGc != null) && (this.jBl.jGc.intValue() > 0)) {
        break label192;
      }
      i = j;
      if ((this.jBl.jGd != null) && (this.jBl.jGd.intValue() > 0)) {
        break label206;
      }
    }
    label192:
    label206:
    for (int j = Integer.MAX_VALUE;; j = Math.max(this.jBl.jGd.intValue(), j))
    {
      this.jBn.setMinHeight(i);
      this.jBn.setMaxHeight(j);
      a(this.jBn, this.jBl.jFY.intValue(), Math.max(i, Math.min(k, j)), this.jBl.jGb.intValue(), this.jBl.jGa.intValue());
      GMTrace.o(15424435519488L, 114921);
      return;
      i = this.jBl.jGc.intValue();
      break;
    }
  }
  
  private void jQ(int paramInt)
  {
    GMTrace.i(19863418437632L, 147994);
    if ((this.jBn == null) || (this.jBn.getEditableText() == null))
    {
      GMTrace.o(19863418437632L, 147994);
      return;
    }
    if (paramInt <= -2)
    {
      GMTrace.o(19863418437632L, 147994);
      return;
    }
    int i = paramInt;
    if (-1 == paramInt) {
      i = this.jBn.getEditableText().length();
    }
    this.jBn.setSelection(i);
    abQ();
    GMTrace.o(19863418437632L, 147994);
  }
  
  public abstract void WE();
  
  public abstract void WF();
  
  final void a(v paramv)
  {
    GMTrace.i(18254416314368L, 136006);
    if (paramv == null)
    {
      GMTrace.o(18254416314368L, 136006);
      return;
    }
    paramv.b(this.jBh);
    if (this.iWI == null) {}
    for (Object localObject = null;; localObject = (AppBrandPageView)this.iWI.get())
    {
      if (localObject != null)
      {
        localObject = ((AppBrandPageView)localObject).jlb;
        if (localObject != null) {
          ((e)localObject).bP(paramv);
        }
      }
      GMTrace.o(18254416314368L, 136006);
      return;
    }
  }
  
  public final boolean abD()
  {
    GMTrace.i(17638893813760L, 131420);
    int i;
    if ((this.jBn == null) || (this.iWI == null) || (this.iWI.get() == null)) {
      i = 0;
    }
    while (i != 0)
    {
      onDestroy();
      GMTrace.o(17638893813760L, 131420);
      return true;
      this.jBn.destroy();
      e locale = ((AppBrandPageView)this.iWI.get()).jlb;
      if (locale == null)
      {
        i = 0;
      }
      else
      {
        if (this.jBn.hasFocus())
        {
          if (this.jBp != null) {
            this.jBp.setVisibility(8);
          }
          abU();
          if (this.jBo != null) {
            this.jBo.setVisibility(8);
          }
        }
        locale.bP(this.jBn);
        i = 1;
      }
    }
    GMTrace.o(17638893813760L, 131420);
    return false;
  }
  
  public final View abI()
  {
    GMTrace.i(17639028031488L, 131421);
    u localu = this.jBo;
    GMTrace.o(17639028031488L, 131421);
    return localu;
  }
  
  public final int abJ()
  {
    GMTrace.i(17639296466944L, 131423);
    if ((this.jBl != null) && (this.jBl.jGv != null))
    {
      int i = this.jBl.jGv.intValue();
      GMTrace.o(17639296466944L, 131423);
      return i;
    }
    if ((this.jBn != null) && (this.jBn.aci()))
    {
      GMTrace.o(17639296466944L, 131423);
      return 5;
    }
    GMTrace.o(17639296466944L, 131423);
    return 0;
  }
  
  public final boolean abK()
  {
    GMTrace.i(17638759596032L, 131419);
    int i;
    if ((this.jBn != null) && ((this.jBn.isFocused()) || ((abU() != null) && (abU().jCY == this.jBn))))
    {
      i = 1;
      if (i != 0) {
        break label78;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandInputInvokeHandler", "doHideKeyboard, not focused, return");
    }
    for (;;)
    {
      GMTrace.o(17638759596032L, 131419);
      return true;
      i = 0;
      break;
      label78:
      u localu = abU();
      if (localu != null) {
        localu.setVisibility(8);
      }
    }
  }
  
  public final void abP()
  {
    GMTrace.i(16052977139712L, 119604);
    if (this.jBn == null)
    {
      GMTrace.o(16052977139712L, 119604);
      return;
    }
    if ((this.jBn.getLineCount() == this.jBi) && (this.jBn.acz() == this.jBj))
    {
      GMTrace.o(16052977139712L, 119604);
      return;
    }
    if (this.jBi == -1) {}
    for (int i = 1;; i = 0)
    {
      this.jBi = this.jBn.getLineCount();
      this.jBj = this.jBn.acz();
      if (this.jBf != null) {
        this.jBf.bq(this.jBi, this.jBj);
      }
      if ((this.jBl.jGr.booleanValue()) && (i == 0))
      {
        abO();
        abQ();
      }
      GMTrace.o(16052977139712L, 119604);
      return;
    }
  }
  
  public final void abQ()
  {
    GMTrace.i(15424569737216L, 114922);
    if ((this.jBl.jGr.booleanValue()) && (this.jBo != null) && (this.jBo.isShown()) && (this.jBn != null) && (this.jBn == this.jBo.jCY)) {
      i.a(this.iWI).abZ();
    }
    GMTrace.o(15424569737216L, 114922);
  }
  
  public final void abR()
  {
    GMTrace.i(10061497761792L, 74964);
    if (this.jBl.jGr.booleanValue()) {
      abU();
    }
    if ((this.jBo != null) && (this.jBn != null))
    {
      this.jBo.jCY = this.jBn;
      this.jBo.cU(ac.d(this.jBl.jGs));
      abS();
      if ((com.tencent.mm.plugin.appbrand.ui.g.bI(this.jBn)) && (this.jBn.hasFocus())) {
        this.jBo.show();
      }
      GMTrace.o(10061497761792L, 74964);
      return;
    }
    GMTrace.o(10061497761792L, 74964);
  }
  
  public final void abS()
  {
    GMTrace.i(10062034632704L, 74968);
    if (this.jBo == null)
    {
      GMTrace.o(10062034632704L, 74968);
      return;
    }
    this.jBo.jCO = this.jBv;
    this.jBo.jCP = this.jBw;
    this.jBo.jCR = this.jBx;
    GMTrace.o(10062034632704L, 74968);
  }
  
  public final void abT()
  {
    GMTrace.i(16053379792896L, 119607);
    if ((this.jBk == c.jBB) && (ac.d(this.jBl.jGx))) {}
    for (boolean bool = true;; bool = false)
    {
      if (!bool) {
        abV();
      }
      i.a(this.iWI).aca();
      if (this.jBn == null) {
        break label149;
      }
      if (this.jBn.hasFocus()) {
        cO(bool);
      }
      if (bool) {
        break label149;
      }
      if (this.jBo != null) {
        this.jBo.b(this.jBn);
      }
      if (!this.jBl.jFU) {
        break;
      }
      a(this.jBn);
      onDestroy();
      GMTrace.o(16053379792896L, 119607);
      return;
    }
    this.jBn.setFocusable(false);
    this.jBn.setFocusableInTouchMode(false);
    label149:
    GMTrace.o(16053379792896L, 119607);
  }
  
  final u abU()
  {
    GMTrace.i(18254550532096L, 136007);
    if (this.jBo != null)
    {
      localObject = this.jBo;
      GMTrace.o(18254550532096L, 136007);
      return (u)localObject;
    }
    if (this.iWI != null)
    {
      localObject = (AppBrandPageView)this.iWI.get();
      if (localObject != null) {}
    }
    else
    {
      GMTrace.o(18254550532096L, 136007);
      return null;
    }
    Object localObject = u.bW(((AppBrandPageView)localObject).jjV);
    this.jBo = ((u)localObject);
    GMTrace.o(18254550532096L, 136007);
    return (u)localObject;
  }
  
  public final void abV()
  {
    GMTrace.i(10062437285888L, 74971);
    if (abU() != null)
    {
      this.jBo.hide();
      GMTrace.o(10062437285888L, 74971);
      return;
    }
    if (this.iWI != null)
    {
      Activity localActivity = com.tencent.mm.plugin.appbrand.ui.g.bR(((AppBrandPageView)this.iWI.get()).mContext);
      if ((MMActivity.class.isInstance(localActivity)) && (((MMActivity)localActivity).vov.auJ()))
      {
        GMTrace.o(10062437285888L, 74971);
        return;
      }
    }
    GMTrace.o(10062437285888L, 74971);
  }
  
  public final void abW()
  {
    GMTrace.i(10062705721344L, 74973);
    Object localObject;
    if (this.jBp != null) {
      localObject = this.jBp;
    }
    for (;;)
    {
      if (localObject != null) {
        this.jBp.setVisibility(8);
      }
      GMTrace.o(10062705721344L, 74973);
      return;
      if (this.iWI != null)
      {
        localObject = (AppBrandPageView)this.iWI.get();
        if (localObject != null) {}
      }
      else
      {
        localObject = null;
        continue;
      }
      localObject = t.bU(((AppBrandPageView)localObject).jjV);
      this.jBp = ((t)localObject);
    }
  }
  
  public abstract void b(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public final void b(String paramString, Integer paramInteger)
  {
    GMTrace.i(19863284219904L, 147993);
    if (this.jBn == null)
    {
      GMTrace.o(19863284219904L, 147993);
      return;
    }
    this.jBn.r(paramString);
    if (paramInteger == null) {}
    for (int i = -1;; i = paramInteger.intValue())
    {
      jQ(i);
      abP();
      GMTrace.o(19863284219904L, 147993);
      return;
    }
  }
  
  public final void cN(boolean paramBoolean)
  {
    GMTrace.i(10061363544064L, 74963);
    if ((this.jBn == null) || ((!paramBoolean) && (!z.al(this.jBn))))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandInputInvokeHandler", "updateInputImpl, input is null or detached, skip");
      GMTrace.o(10061363544064L, 74963);
      return;
    }
    label201:
    Object localObject;
    if (!ac.d(this.jBl.jGt))
    {
      a(this.jBn, this.jBl.jFY.intValue(), this.jBl.jFZ.intValue(), this.jBl.jGb.intValue(), this.jBl.jGa.intValue());
      if (this.jBl.jGh != null) {
        this.jBn.setTextSize(0, this.jBl.jGh.intValue());
      }
      if (this.jBl.jGg != null) {
        this.jBn.setTextColor(this.jBl.jGg.intValue());
      }
      if (this.jBl.jGf == null) {
        break label777;
      }
      this.jBn.setBackgroundDrawable(new ColorDrawable(this.jBl.jGf.intValue()));
      if (!bg.mZ(this.jBl.jGl))
      {
        localObject = this.jBn;
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.jBl.jGl);
        int i = this.jBl.jGl.length();
        localSpannableStringBuilder.setSpan(new StyleSpan(com.tencent.mm.plugin.appbrand.widget.input.b.c.sB(this.jBl.jGm).style), 0, i, 18);
        if (this.jBl.jGo != null) {
          localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.jBl.jGo.intValue()), 0, i, 18);
        }
        if (this.jBl.jGn != null) {
          localSpannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.jBl.jGn.intValue(), false), 0, i, 18);
        }
        ((v)localObject).setHint(localSpannableStringBuilder);
      }
      if (this.jBl.jGj != null)
      {
        localObject = Typeface.create("sans-serif", com.tencent.mm.plugin.appbrand.widget.input.b.c.sB(this.jBl.jGj).style);
        if (localObject != null) {
          this.jBn.setTypeface((Typeface)localObject);
        }
      }
      if (this.jBl.jFX != null)
      {
        if (!paramBoolean) {
          break label788;
        }
        this.jBn.setText(bg.mY(this.jBl.jFX));
        label432:
        if ((ac.d(this.jBl.jGt)) && (this.jBn != null)) {
          abP();
        }
      }
      if (this.jBl.jGk != null) {
        break label808;
      }
      this.jBl.jGk = Integer.valueOf(140);
      label479:
      localObject = n.a(this.jBn).Dr(this.jBl.jGk.intValue());
      ((com.tencent.mm.ui.tools.a.c)localObject).wNo = false;
      ((com.tencent.mm.ui.tools.a.c)localObject).jCo = h.a.wKw;
      ((com.tencent.mm.ui.tools.a.c)localObject).a(this.jAN);
      this.jBn.cS(this.jBl.jFT);
      if ((this.jBl.jGp == null) || (!this.jBl.jGp.booleanValue())) {
        break label836;
      }
      this.jBn.setEnabled(false);
      this.jBn.setFocusable(false);
      this.jBn.setFocusableInTouchMode(false);
      this.jBn.setClickable(false);
      label593:
      com.tencent.mm.plugin.appbrand.widget.input.b.g.sC(this.jBl.jGe).a(this.jBn);
      if (!ac.d(this.jBl.jGq)) {
        break label855;
      }
      this.jBn.setVisibility(8);
    }
    for (;;)
    {
      if (this.jBl.jGu != null) {
        this.jBn.jDt = this.jBl.jGu.booleanValue();
      }
      if ((this.jBn != null) && ((this.jBn instanceof o)))
      {
        if (this.jBl.jGy != null)
        {
          localObject = (o)this.jBn;
          ((o)localObject).setLineSpacing(this.jBl.jGy.intValue(), ((o)localObject).jCu);
        }
        if (this.jBl.jGz != null)
        {
          localObject = (o)this.jBn;
          float f = this.jBl.jGz.intValue();
          if (f > 0.0F) {
            ((o)localObject).a(f, true);
          }
        }
      }
      GMTrace.o(10061363544064L, 74963);
      return;
      abO();
      break;
      label777:
      this.jBn.setBackgroundDrawable(null);
      break label201;
      label788:
      this.jBn.r(bg.mY(this.jBl.jFX));
      break label432;
      label808:
      if (this.jBl.jGk.intValue() > 0) {
        break label479;
      }
      this.jBl.jGk = Integer.valueOf(Integer.MAX_VALUE);
      break label479;
      label836:
      this.jBn.setEnabled(true);
      this.jBn.setClickable(true);
      break label593;
      label855:
      this.jBn.setVisibility(0);
    }
  }
  
  final void cO(boolean paramBoolean)
  {
    GMTrace.i(10062168850432L, 74969);
    if (this.jBn == null)
    {
      GMTrace.o(10062168850432L, 74969);
      return;
    }
    String str = this.jBn.getText().toString();
    int i = this.jBn.getSelectionEnd();
    if (this.jBk == c.jBB) {}
    for (boolean bool = true;; bool = false)
    {
      b(str, i, bool, paramBoolean);
      GMTrace.o(10062168850432L, 74969);
      return;
    }
  }
  
  public final boolean g(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(17638491160576L, 131417);
    if ((paramAppBrandPageView != null) && (this.iWI != null) && (paramAppBrandPageView == this.iWI.get()))
    {
      GMTrace.o(17638491160576L, 131417);
      return true;
    }
    GMTrace.o(17638491160576L, 131417);
    return false;
  }
  
  public final boolean jP(int paramInt)
  {
    GMTrace.i(18254147878912L, 136004);
    if ((this.jBn == null) || (this.iWI == null) || (this.iWI.get() == null)) {}
    for (;;)
    {
      jQ(paramInt);
      GMTrace.o(18254147878912L, 136004);
      return true;
      this.jBn.performClick();
    }
  }
  
  final void onDestroy()
  {
    GMTrace.i(10061095108608L, 74961);
    this.jBn = null;
    d.aR(this);
    GMTrace.o(10061095108608L, 74961);
  }
  
  public static abstract interface a
  {
    public abstract void cf(boolean paramBoolean);
  }
  
  public static abstract interface b
  {
    public abstract void bq(int paramInt1, int paramInt2);
  }
  
  private static enum c
  {
    static
    {
      GMTrace.i(18846987583488L, 140421);
      jBA = 1;
      jBB = 2;
      jBC = new int[] { jBA, jBB };
      GMTrace.o(18846987583488L, 140421);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */