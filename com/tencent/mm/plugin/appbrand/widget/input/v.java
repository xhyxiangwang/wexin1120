package com.tencent.mm.plugin.appbrand.widget.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.v4.e.a;
import android.text.Editable;
import android.text.Editable.Factory;
import android.text.Layout.Alignment;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AlignmentSpan.Standard;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.p.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.autofill.e;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@SuppressLint({"AppCompatCustomView"})
public abstract class v
  extends EditText
  implements com.tencent.mm.plugin.appbrand.widget.b.d, x
{
  private static final String jDi;
  private volatile String jBm;
  InputConnection jDf;
  private Method jDg;
  boolean jDh;
  private final com.tencent.mm.plugin.appbrand.widget.input.autofill.b jDj;
  public com.tencent.mm.plugin.appbrand.widget.input.a.b jDk;
  private final Runnable jDl;
  private final Map<x.a, Object> jDm;
  private final Map<View.OnFocusChangeListener, Object> jDn;
  private final Map<x.b, Object> jDo;
  private final a jDp;
  private final PasswordTransformationMethod jDq;
  private boolean jDr;
  private int jDs;
  boolean jDt;
  private final int[] jDu;
  private final ae jqC;
  
  static
  {
    GMTrace.i(18272804143104L, 136143);
    jDi = "-1";
    GMTrace.o(18272804143104L, 136143);
  }
  
  public v(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10055189528576L, 74917);
    this.jDh = false;
    this.jBm = jDi;
    this.jDl = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19869726670848L, 148041);
        if (v.b(v.this) != null) {
          v.b(v.this).abX();
        }
        GMTrace.o(19869726670848L, 148041);
      }
    };
    this.jqC = new ae(Looper.getMainLooper());
    this.jDq = new k();
    this.jDs = 0;
    this.jDt = false;
    this.jDu = new int[2];
    this.jDp = new a();
    this.jDm = new a();
    this.jDo = new a();
    this.jDn = new a();
    setBackgroundDrawable(null);
    setIncludeFontPadding(false);
    jX(3);
    setSingleLine(true);
    int i = p.e.isC;
    try
    {
      new com.tencent.mm.compatible.loader.c(this, "mCursorDrawableRes", TextView.class.getName()).set(Integer.valueOf(i));
      setTextIsSelectable(true);
      setFocusable(true);
      setFocusableInTouchMode(true);
      if (Build.VERSION.SDK_INT >= 16) {
        setLineSpacing(0.0F, 1.0F);
      }
      setTypeface(Typeface.SANS_SERIF);
      super.addTextChangedListener(this.jDp);
      super.setPadding(0, 0, 0, 0);
      super.setEditableFactory(new Editable.Factory()
      {
        public final Editable newEditable(CharSequence paramAnonymousCharSequence)
        {
          GMTrace.i(19881537830912L, 148129);
          paramAnonymousCharSequence = super.newEditable(paramAnonymousCharSequence);
          paramAnonymousCharSequence = v.this.c(paramAnonymousCharSequence);
          GMTrace.o(19881537830912L, 148129);
          return paramAnonymousCharSequence;
        }
      });
    }
    catch (Exception paramContext)
    {
      try
      {
        this.jDg = TextView.class.getDeclaredMethod("nullLayouts", new Class[0]);
        if (acj()) {}
        for (this.jDj = new com.tencent.mm.plugin.appbrand.widget.input.autofill.b(this);; this.jDj = null)
        {
          this.jDr = true;
          GMTrace.o(10055189528576L, 74917);
          return;
          paramContext = paramContext;
          w.d("MicroMsg.AppBrand.WebEditText", "setTextCursorDrawable, exp = %s", new Object[] { bg.f(paramContext) });
          break;
        }
      }
      catch (Exception paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  private void jX(int paramInt)
  {
    GMTrace.i(10055323746304L, 74918);
    setGravity(getGravity() & 0xFF7FFFFC & 0xFF7FFFFA | paramInt);
    paramInt = getGravity();
    Object localObject = getHint();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      Spannable localSpannable = ac.s((CharSequence)localObject);
      switch (paramInt & 0x7)
      {
      default: 
        localObject = Layout.Alignment.ALIGN_NORMAL;
        localSpannable.setSpan(new AlignmentSpan.Standard((Layout.Alignment)localObject), 0, getHint().length(), 18);
        super.setHint(localSpannable);
        if (Build.VERSION.SDK_INT >= 17) {
          switch (4.jDw[localObject.ordinal()])
          {
          default: 
            paramInt = 5;
          }
        }
        break;
      }
    }
    for (;;)
    {
      super.setTextAlignment(paramInt);
      GMTrace.o(10055323746304L, 74918);
      return;
      localObject = Layout.Alignment.ALIGN_OPPOSITE;
      break;
      localObject = Layout.Alignment.ALIGN_CENTER;
      break;
      paramInt = 4;
      continue;
      paramInt = 6;
    }
  }
  
  public final void a(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(18269851353088L, 136121);
    if (paramOnFocusChangeListener != null) {
      this.jDn.put(paramOnFocusChangeListener, this);
    }
    GMTrace.o(18269851353088L, 136121);
  }
  
  public final void a(x.a parama)
  {
    GMTrace.i(18269717135360L, 136120);
    this.jDm.put(parama, this);
    GMTrace.o(18269717135360L, 136120);
  }
  
  public final void a(x.b paramb)
  {
    GMTrace.i(18270119788544L, 136123);
    this.jDo.put(paramb, this);
    GMTrace.o(18270119788544L, 136123);
  }
  
  public final String abA()
  {
    GMTrace.i(18269046046720L, 136115);
    String str = this.jBm;
    GMTrace.o(18269046046720L, 136115);
    return str;
  }
  
  public boolean abz()
  {
    GMTrace.i(18845511188480L, 140410);
    GMTrace.o(18845511188480L, 140410);
    return false;
  }
  
  public final void acA()
  {
    GMTrace.i(18270254006272L, 136124);
    jX(3);
    GMTrace.o(18270254006272L, 136124);
  }
  
  public final void acB()
  {
    GMTrace.i(18270388224000L, 136125);
    jX(5);
    GMTrace.o(18270388224000L, 136125);
  }
  
  public final void acC()
  {
    GMTrace.i(18270522441728L, 136126);
    jX(1);
    GMTrace.o(18270522441728L, 136126);
  }
  
  final void acD()
  {
    GMTrace.i(18270790877184L, 136128);
    this.jDs += 1;
    GMTrace.o(18270790877184L, 136128);
  }
  
  final void acE()
  {
    GMTrace.i(18270925094912L, 136129);
    this.jDs = Math.max(0, this.jDs - 1);
    GMTrace.o(18270925094912L, 136129);
  }
  
  public final boolean acF()
  {
    GMTrace.i(10056129052672L, 74924);
    boolean bool = this.jDt;
    GMTrace.o(10056129052672L, 74924);
    return bool;
  }
  
  public boolean acj()
  {
    GMTrace.i(18269448699904L, 136118);
    GMTrace.o(18269448699904L, 136118);
    return true;
  }
  
  protected abstract void ack();
  
  public final com.tencent.mm.plugin.appbrand.widget.input.autofill.b acy()
  {
    GMTrace.i(18269582917632L, 136119);
    com.tencent.mm.plugin.appbrand.widget.input.autofill.b localb = this.jDj;
    GMTrace.o(18269582917632L, 136119);
    return localb;
  }
  
  public final int acz()
  {
    GMTrace.i(15422556471296L, 114907);
    int i = jY(getLineCount());
    int j = getPaddingBottom();
    GMTrace.o(15422556471296L, 114907);
    return i + j;
  }
  
  public void addTextChangedListener(TextWatcher paramTextWatcher)
  {
    GMTrace.i(10057739665408L, 74936);
    a locala = this.jDp;
    if (paramTextWatcher != null) {
      locala.jDx.put(paramTextWatcher, locala);
    }
    GMTrace.o(10057739665408L, 74936);
  }
  
  public final void b(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(18269985570816L, 136122);
    if (paramOnFocusChangeListener != null) {
      this.jDn.remove(paramOnFocusChangeListener);
    }
    GMTrace.o(18269985570816L, 136122);
  }
  
  Editable c(Editable paramEditable)
  {
    GMTrace.i(19866102792192L, 148014);
    paramEditable.setSpan(new SpanWatcher()
    {
      public final void onSpanAdded(Spannable paramAnonymousSpannable, Object paramAnonymousObject, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19865565921280L, 148010);
        if (ac.aS(paramAnonymousObject)) {
          w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] onSpanAdded %s, %s", new Object[] { paramAnonymousSpannable, paramAnonymousObject.getClass().getSimpleName() });
        }
        GMTrace.o(19865565921280L, 148010);
      }
      
      public final void onSpanChanged(Spannable paramAnonymousSpannable, Object paramAnonymousObject, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(19865834356736L, 148012);
        if (ac.aS(paramAnonymousObject)) {
          w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] onSpanChanged %s, %s", new Object[] { paramAnonymousSpannable, paramAnonymousObject.getClass().getSimpleName() });
        }
        GMTrace.o(19865834356736L, 148012);
      }
      
      public final void onSpanRemoved(Spannable paramAnonymousSpannable, Object paramAnonymousObject, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19865700139008L, 148011);
        if (ac.aS(paramAnonymousObject))
        {
          w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] onSpanRemoved %s, %s", new Object[] { paramAnonymousSpannable, paramAnonymousObject.getClass().getSimpleName() });
          v.d(v.this).removeCallbacks(v.c(v.this));
          v.d(v.this).postDelayed(v.c(v.this), 100L);
        }
        GMTrace.o(19865700139008L, 148011);
      }
    }, 0, paramEditable.length(), 18);
    GMTrace.o(19866102792192L, 148014);
    return paramEditable;
  }
  
  public void cS(boolean paramBoolean)
  {
    GMTrace.i(18271596183552L, 136134);
    acD();
    this.jDh = paramBoolean;
    if (paramBoolean) {}
    for (PasswordTransformationMethod localPasswordTransformationMethod = this.jDq;; localPasswordTransformationMethod = null)
    {
      setTransformationMethod(localPasswordTransformationMethod);
      acE();
      GMTrace.o(18271596183552L, 136134);
      return;
    }
  }
  
  public final void cV(boolean paramBoolean)
  {
    GMTrace.i(18271461965824L, 136133);
    this.jDt = true;
    GMTrace.o(18271461965824L, 136133);
  }
  
  public void clearFocus()
  {
    GMTrace.i(18271864619008L, 136136);
    if ((getParent() instanceof ViewGroup))
    {
      ((ViewGroup)getParent()).setFocusableInTouchMode(true);
      ((ViewGroup)getParent()).setDescendantFocusability(131072);
    }
    super.clearFocus();
    GMTrace.o(18271864619008L, 136136);
  }
  
  public final void destroy()
  {
    GMTrace.i(18272267272192L, 136139);
    this.jDm.clear();
    this.jDo.clear();
    this.jDn.clear();
    this.jDp.jDx.clear();
    if (this.jDj != null)
    {
      com.tencent.mm.plugin.appbrand.widget.input.autofill.b localb = this.jDj;
      com.tencent.mm.plugin.appbrand.widget.input.autofill.c localc = localb.jEu;
      i.h(localc.jEF).a(localc.jEE);
      localb.jEx = null;
      localb.jEs.dismiss();
    }
    setOnFocusChangeListener(null);
    GMTrace.o(18272267272192L, 136139);
  }
  
  public final View getView()
  {
    GMTrace.i(18269314482176L, 136117);
    GMTrace.o(18269314482176L, 136117);
    return this;
  }
  
  public final int jY(int paramInt)
  {
    GMTrace.i(15422422253568L, 114906);
    int i = getPaddingTop() + (int)(paramInt * (getLineHeight() + getLineSpacingExtra()));
    w.d("MicroMsg.AppBrand.WebEditText", "calculateLinePosition, lineNumber %d, returnHeight %d, layout %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), getLayout() });
    GMTrace.o(15422422253568L, 114906);
    return i;
  }
  
  public final void n(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(18271193530368L, 136131);
    if (this.jDj != null)
    {
      Object localObject = this.jDj.jEu;
      ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c)localObject).jEF = paramAppBrandPageView;
      paramAppBrandPageView = i.h(paramAppBrandPageView);
      localObject = ((com.tencent.mm.plugin.appbrand.widget.input.autofill.c)localObject).jEE;
      if (localObject == null)
      {
        GMTrace.o(18271193530368L, 136131);
        return;
      }
      if (!paramAppBrandPageView.jBJ.containsKey(localObject)) {
        paramAppBrandPageView.jBJ.put(localObject, paramAppBrandPageView);
      }
    }
    GMTrace.o(18271193530368L, 136131);
  }
  
  public final void o(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(18271327748096L, 136132);
    if (this.jDj != null)
    {
      com.tencent.mm.plugin.appbrand.widget.input.autofill.c localc = this.jDj.jEu;
      i.h(paramAppBrandPageView).a(localc.jEE);
    }
    GMTrace.o(18271327748096L, 136132);
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(15422824906752L, 114909);
    super.onConfigurationChanged(paramConfiguration);
    if (!this.jDm.isEmpty())
    {
      paramConfiguration = (x.a[])this.jDm.keySet().toArray(new x.a[this.jDm.size()]);
      int j = paramConfiguration.length;
      int i = 0;
      while (i < j)
      {
        paramConfiguration[i].acG();
        i += 1;
      }
    }
    GMTrace.o(15422824906752L, 114909);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    GMTrace.i(10055726399488L, 74921);
    this.jDf = super.onCreateInputConnection(paramEditorInfo);
    paramEditorInfo = this.jDf;
    GMTrace.o(10055726399488L, 74921);
    return paramEditorInfo;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(10057202794496L, 74932);
    super.onDraw(paramCanvas);
    GMTrace.o(10057202794496L, 74932);
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    GMTrace.i(15422959124480L, 114910);
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (!paramBoolean) {
      clearComposingText();
    }
    if (paramBoolean) {
      ack();
    }
    if (!this.jDn.isEmpty())
    {
      paramRect = (View.OnFocusChangeListener[])this.jDn.keySet().toArray(new View.OnFocusChangeListener[this.jDn.size()]);
      int i = paramRect.length;
      paramInt = 0;
      while (paramInt < i)
      {
        paramRect[paramInt].onFocusChange(this, paramBoolean);
        paramInt += 1;
      }
    }
    GMTrace.o(15422959124480L, 114910);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(18270656659456L, 136127);
    w.v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onLayout");
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(18270656659456L, 136127);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(15422690689024L, 114908);
    w.v("MicroMsg.AppBrand.WebEditText", "[scrollUp] input onMeasure");
    super.onMeasure(paramInt1, paramInt2);
    if (!this.jDo.isEmpty())
    {
      Object[] arrayOfObject = this.jDo.keySet().toArray();
      paramInt2 = arrayOfObject.length;
      paramInt1 = 0;
      while (paramInt1 < paramInt2)
      {
        x.b localb = (x.b)arrayOfObject[paramInt1];
        getMeasuredWidth();
        getMeasuredHeight();
        localb.acl();
        paramInt1 += 1;
      }
    }
    GMTrace.o(15422690689024L, 114908);
  }
  
  public void p(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(18845242753024L, 140408);
    throw new IllegalStateException("Should implement performClick(float, float) in this class!");
  }
  
  public final void r(CharSequence paramCharSequence)
  {
    GMTrace.i(18271059312640L, 136130);
    acD();
    Editable localEditable = getEditableText();
    if (localEditable == null) {
      setText(paramCharSequence, TextView.BufferType.EDITABLE);
    }
    for (;;)
    {
      acE();
      GMTrace.o(18271059312640L, 136130);
      return;
      clearComposingText();
      if (TextUtils.isEmpty(paramCharSequence)) {
        localEditable.clear();
      } else {
        localEditable.replace(0, localEditable.length(), paramCharSequence);
      }
    }
  }
  
  public void removeTextChangedListener(TextWatcher paramTextWatcher)
  {
    GMTrace.i(10057873883136L, 74937);
    a locala = this.jDp;
    if (paramTextWatcher != null) {
      locala.jDx.remove(paramTextWatcher);
    }
    GMTrace.o(10057873883136L, 74937);
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    GMTrace.i(18271998836736L, 136137);
    if ((130 == paramInt) && (paramRect == null) && ((getParent() instanceof ViewGroup)))
    {
      ((ViewGroup)getParent()).setDescendantFocusability(262144);
      ((ViewGroup)getParent()).setFocusableInTouchMode(false);
    }
    boolean bool = super.requestFocus(paramInt, paramRect);
    GMTrace.o(18271998836736L, 136137);
    return bool;
  }
  
  public void setInputType(int paramInt)
  {
    GMTrace.i(10056397488128L, 74926);
    if (getInputType() == paramInt)
    {
      GMTrace.o(10056397488128L, 74926);
      return;
    }
    super.setInputType(paramInt);
    GMTrace.o(10056397488128L, 74926);
  }
  
  public void setMaxHeight(int paramInt)
  {
    GMTrace.i(16001169096704L, 119218);
    if (getMaxHeight() == paramInt)
    {
      GMTrace.o(16001169096704L, 119218);
      return;
    }
    super.setMaxHeight(paramInt);
    GMTrace.o(16001169096704L, 119218);
  }
  
  public void setMinHeight(int paramInt)
  {
    GMTrace.i(16001034878976L, 119217);
    if (getMinHeight() == paramInt)
    {
      GMTrace.o(16001034878976L, 119217);
      return;
    }
    super.setMinHeight(paramInt);
    GMTrace.o(16001034878976L, 119217);
  }
  
  @Deprecated
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(18272133054464L, 136138);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    GMTrace.o(18272133054464L, 136138);
  }
  
  public void setSelection(int paramInt)
  {
    GMTrace.i(10055457964032L, 74919);
    if (getEditableText() == null)
    {
      GMTrace.o(10055457964032L, 74919);
      return;
    }
    super.setSelection(Math.min(paramInt, getEditableText().length()));
    GMTrace.o(10055457964032L, 74919);
  }
  
  public void setSelection(int paramInt1, int paramInt2)
  {
    GMTrace.i(10055592181760L, 74920);
    super.setSelection(paramInt1, paramInt2);
    GMTrace.o(10055592181760L, 74920);
  }
  
  public void setSingleLine(boolean paramBoolean)
  {
    GMTrace.i(10056531705856L, 74927);
    GMTrace.o(10056531705856L, 74927);
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    GMTrace.i(10055860617216L, 74922);
    super.setText(paramCharSequence, paramBufferType);
    GMTrace.o(10055860617216L, 74922);
  }
  
  public final void setTextSize(float paramFloat)
  {
    GMTrace.i(10056665923584L, 74928);
    super.setTextSize(0, paramFloat);
    GMTrace.o(10056665923584L, 74928);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    GMTrace.i(10056800141312L, 74929);
    super.setTextSize(paramInt, paramFloat);
    GMTrace.o(10056800141312L, 74929);
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    GMTrace.i(10056934359040L, 74930);
    super.setTypeface(paramTypeface);
    GMTrace.o(10056934359040L, 74930);
  }
  
  public void setTypeface(Typeface paramTypeface, int paramInt)
  {
    GMTrace.i(10057068576768L, 74931);
    super.setTypeface(paramTypeface, paramInt);
    GMTrace.o(10057068576768L, 74931);
  }
  
  public final void sz(String paramString)
  {
    GMTrace.i(18269180264448L, 136116);
    jDi.equals(this.jBm);
    this.jBm = paramString;
    GMTrace.o(18269180264448L, 136116);
  }
  
  public String toString()
  {
    GMTrace.i(18845108535296L, 140407);
    String str = String.format(Locale.US, "[%s|%s]", new Object[] { getClass().getSimpleName(), this.jBm });
    GMTrace.o(18845108535296L, 140407);
    return str;
  }
  
  private final class a
    implements TextWatcher
  {
    final Map<TextWatcher, Object> jDx;
    
    public a()
    {
      GMTrace.i(10092233621504L, 75193);
      this.jDx = new a();
      GMTrace.o(10092233621504L, 75193);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      GMTrace.i(10092636274688L, 75196);
      Object localObject;
      final int i;
      final int j;
      if (d.abM())
      {
        localObject = new PBool();
        PInt localPInt = new PInt();
        final String str = v.a(paramEditable, (PBool)localObject, localPInt);
        i = localPInt.value;
        if ((((PBool)localObject).value) && (!bg.mZ(str)))
        {
          j = Selection.getSelectionEnd(paramEditable);
          final boolean bool = v.e(v.this);
          v.this.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(10053444698112L, 74904);
              if (bool) {
                v.this.r(str);
              }
              for (;;)
              {
                try
                {
                  v.this.setSelection(Math.min(j + i, str.length()));
                  GMTrace.o(10053444698112L, 74904);
                  return;
                }
                catch (Exception localException)
                {
                  w.e("MicroMsg.AppBrand.WebEditText", "replace softBank to unicode, setSelection ", new Object[] { localException });
                  GMTrace.o(10053444698112L, 74904);
                }
                v.this.setText(str);
              }
            }
          });
          GMTrace.o(10092636274688L, 75196);
          return;
        }
      }
      if (!v.e(v.this))
      {
        v.f(v.this);
        if (!this.jDx.isEmpty())
        {
          localObject = (TextWatcher[])this.jDx.keySet().toArray(new TextWatcher[this.jDx.size()]);
          j = localObject.length;
          i = 0;
          while (i < j)
          {
            localObject[i].afterTextChanged(paramEditable);
            i += 1;
          }
        }
      }
      GMTrace.o(10092636274688L, 75196);
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      int i = 0;
      GMTrace.i(10092367839232L, 75194);
      w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] beforeTextChanged %s", new Object[] { paramCharSequence });
      v.d(v.this).removeCallbacks(v.c(v.this));
      if ((!v.e(v.this)) && (!this.jDx.isEmpty()))
      {
        TextWatcher[] arrayOfTextWatcher = (TextWatcher[])this.jDx.keySet().toArray(new TextWatcher[this.jDx.size()]);
        int j = arrayOfTextWatcher.length;
        while (i < j)
        {
          arrayOfTextWatcher[i].beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
          i += 1;
        }
      }
      GMTrace.o(10092367839232L, 75194);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      int i = 0;
      GMTrace.i(10092502056960L, 75195);
      w.d("MicroMsg.AppBrand.WebEditText", "[bindInput] onTextChanged %s", new Object[] { paramCharSequence });
      if ((!v.e(v.this)) && (!this.jDx.isEmpty()))
      {
        TextWatcher[] arrayOfTextWatcher = (TextWatcher[])this.jDx.keySet().toArray(new TextWatcher[this.jDx.size()]);
        int j = arrayOfTextWatcher.length;
        while (i < j)
        {
          arrayOfTextWatcher[i].onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
          i += 1;
        }
      }
      GMTrace.o(10092502056960L, 75195);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */