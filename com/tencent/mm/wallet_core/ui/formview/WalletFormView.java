package com.tencent.mm.wallet_core.ui.formview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.n;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.a.a;
import com.tenpay.android.wechat.TenpaySecureEditText;
import junit.framework.Assert;

public final class WalletFormView
  extends LinearLayout
  implements View.OnFocusChangeListener
{
  public TextView jpp;
  public TextView oST;
  public WalletIconImageView oSV;
  public TextView oSW;
  private View.OnFocusChangeListener oSY;
  private View.OnClickListener oSZ;
  private int oTc;
  private String oTd;
  private int oTe;
  private String oTf;
  private int oTg;
  private int oTh;
  private int oTi;
  private String oTj;
  private int oTk;
  private String oTl;
  private int oTm;
  private int oTn;
  private String oTo;
  public int oTp;
  private int oTq;
  private int oTr;
  private boolean oTs;
  private boolean oTt;
  private boolean oTu;
  private int oTv;
  private int oTw;
  private int oTx;
  public TenpaySecureEditText xic;
  public a xid;
  public a xie;
  public com.tencent.mm.wallet_core.ui.formview.a.b xif;
  private int xig;
  public int xih;
  private int xii;
  private int xij;
  
  public WalletFormView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
    GMTrace.i(1491293175808L, 11111);
    GMTrace.o(1491293175808L, 11111);
  }
  
  public WalletFormView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1491158958080L, 11110);
    this.jpp = null;
    this.oST = null;
    this.xic = null;
    this.oSV = null;
    this.oSW = null;
    this.xid = null;
    this.oSY = null;
    this.oSZ = null;
    this.xie = null;
    this.xif = null;
    this.oTc = -1;
    this.xig = this.oTc;
    this.xih = 100;
    this.oTd = "";
    this.oTe = 0;
    this.oTf = "";
    this.oTg = 8;
    this.oTh = -1;
    this.oTi = 4;
    this.oTj = "";
    this.oTk = 8;
    this.oTl = "";
    this.oTm = 19;
    this.oTn = R.e.aPH;
    this.oTo = "";
    this.xii = 0;
    this.oTp = Integer.MAX_VALUE;
    this.oTq = 1;
    this.oTr = R.g.baH;
    this.oTs = true;
    this.oTt = false;
    this.oTu = true;
    this.oTv = 1;
    this.oTw = 5;
    this.oTx = R.e.aOW;
    this.xij = 0;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.n.fgw, paramInt, 0);
    this.oTc = paramAttributeSet.getResourceId(R.n.fgN, this.oTc);
    paramInt = paramAttributeSet.getResourceId(R.n.fgT, 0);
    if (paramInt != 0) {
      this.oTd = paramContext.getString(paramInt);
    }
    this.oTh = paramAttributeSet.getResourceId(R.n.fgL, this.oTh);
    paramInt = paramAttributeSet.getResourceId(R.n.fgR, 0);
    if (paramInt != 0) {
      this.oTj = paramContext.getString(paramInt);
    }
    this.oTi = paramAttributeSet.getInteger(R.n.fgM, this.oTi);
    this.oTe = paramAttributeSet.getInteger(R.n.fgU, this.oTe);
    this.oTk = paramAttributeSet.getInteger(R.n.fgS, this.oTk);
    this.oTg = paramAttributeSet.getInteger(R.n.fgQ, this.oTg);
    paramInt = paramAttributeSet.getResourceId(R.n.fgP, 0);
    if (paramInt != 0) {
      this.oTf = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(R.n.fgE, 0);
    if (paramInt != 0) {
      this.oTl = paramContext.getString(paramInt);
    }
    this.oTm = paramAttributeSet.getInteger(R.n.fgD, this.oTm);
    this.oTn = paramAttributeSet.getColor(R.n.fgJ, this.oTn);
    paramInt = paramAttributeSet.getResourceId(R.n.fgI, 0);
    if (paramInt != 0) {
      this.oTo = paramContext.getString(paramInt);
    }
    this.xii = paramAttributeSet.getInt(R.n.fgC, this.xii);
    this.oTp = paramAttributeSet.getInteger(R.n.fgG, this.oTp);
    this.oTq = paramAttributeSet.getInteger(R.n.fgH, this.oTq);
    this.oTr = paramAttributeSet.getResourceId(R.n.fgz, this.oTr);
    this.oTs = paramAttributeSet.getBoolean(R.n.fgB, this.oTs);
    this.oTt = paramAttributeSet.getBoolean(R.n.fgA, this.oTt);
    this.oTu = paramAttributeSet.getBoolean(R.n.fgB, this.oTu);
    this.oTv = paramAttributeSet.getInteger(R.n.fgy, this.oTv);
    this.oTw = paramAttributeSet.getInteger(R.n.fgx, this.oTw);
    this.xih = paramAttributeSet.getInteger(R.n.fgK, this.xih);
    this.oTx = paramAttributeSet.getInteger(R.n.fgF, this.oTx);
    this.xig = paramAttributeSet.getResourceId(R.n.fgO, this.xig);
    this.xij = paramAttributeSet.getInteger(R.n.fgV, 0);
    paramAttributeSet.recycle();
    if (this.oTc > 0) {
      bool = true;
    }
    Assert.assertTrue(bool);
    setOrientation(1);
    if ((!bg.mZ(this.oTd)) && (this.oTd.length() > 6)) {
      inflate(paramContext, this.xig, this);
    }
    for (;;)
    {
      this.jpp = ((TextView)findViewById(R.h.cKk));
      this.oST = ((TextView)findViewById(R.h.cJX));
      this.xic = ((TenpaySecureEditText)findViewById(R.h.cIF));
      this.oSV = ((WalletIconImageView)findViewById(R.h.cJb));
      this.oSW = ((TextView)findViewById(R.h.cKj));
      GMTrace.o(1491158958080L, 11110);
      return;
      inflate(paramContext, this.oTc, this);
    }
  }
  
  private void aYW()
  {
    GMTrace.i(1492098482176L, 11117);
    if ((this.oSV != null) && (!bg.mZ(getText())) && (this.xic != null) && (this.xic.isEnabled()) && (this.xic.isClickable()) && (this.xic.isFocusable()) && (this.xic.isFocused()))
    {
      this.oSV.g(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1483240112128L, 11051);
          WalletFormView.this.aYY();
          GMTrace.o(1483240112128L, 11051);
        }
      });
      GMTrace.o(1492098482176L, 11117);
      return;
    }
    if (this.oSV != null)
    {
      this.oSV.bKE();
      GMTrace.o(1492098482176L, 11117);
      return;
    }
    w.v("MicroMsg.WalletFormView", "hy: no info iv");
    GMTrace.o(1492098482176L, 11117);
  }
  
  private void cjv()
  {
    GMTrace.i(1493440659456L, 11127);
    if (this.jpp != null)
    {
      this.jpp.setText(this.oTd);
      this.jpp.setVisibility(this.oTe);
    }
    GMTrace.o(1493440659456L, 11127);
  }
  
  private int getInputLength()
  {
    GMTrace.i(1495185489920L, 11140);
    if (this.xic != null)
    {
      int i = this.xic.getInputLength();
      GMTrace.o(1495185489920L, 11140);
      return i;
    }
    GMTrace.o(1495185489920L, 11140);
    return 0;
  }
  
  @SuppressLint({"ResourceType"})
  public final void Ej(int paramInt)
  {
    GMTrace.i(19127368417280L, 142510);
    this.oTn = paramInt;
    if (this.xic != null) {
      this.xic.setTextColor(getResources().getColor(this.oTn));
    }
    GMTrace.o(19127368417280L, 142510);
  }
  
  public final boolean QR()
  {
    GMTrace.i(1494648619008L, 11136);
    if (this.xic != null)
    {
      int i = this.xic.getInputLength();
      if ((i > this.oTp) || (i < this.oTq))
      {
        GMTrace.o(1494648619008L, 11136);
        return false;
      }
      if (this.xif != null)
      {
        boolean bool = this.xif.h(this);
        GMTrace.o(1494648619008L, 11136);
        return bool;
      }
      GMTrace.o(1494648619008L, 11136);
      return true;
    }
    w.e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
    GMTrace.o(1494648619008L, 11136);
    return true;
  }
  
  public final void WK(String paramString)
  {
    GMTrace.i(1491561611264L, 11113);
    if ((this.xic != null) && ((this.xif == null) || (!this.xif.d(this, paramString))))
    {
      this.xic.set3DesEncrptData(paramString);
      setSelection(getInputLength());
    }
    GMTrace.o(1491561611264L, 11113);
  }
  
  public final void a(TextWatcher paramTextWatcher)
  {
    GMTrace.i(1494380183552L, 11134);
    if (this.xic != null) {
      this.xic.addTextChangedListener(paramTextWatcher);
    }
    GMTrace.o(1494380183552L, 11134);
  }
  
  public final void aYY()
  {
    GMTrace.i(1494782836736L, 11137);
    if (this.xic != null) {
      this.xic.ClearInput();
    }
    GMTrace.o(1494782836736L, 11137);
  }
  
  final boolean b(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(1493306441728L, 11126);
    if ((paramView != null) && (paramView.getVisibility() == 0))
    {
      Rect localRect2;
      if (paramView != null)
      {
        localRect2 = new Rect();
        paramView.getHitRect(localRect2);
        localRect1 = localRect2;
        if (paramView == this.oSV)
        {
          localRect2.left -= 50;
          localRect2.right += 50;
          localRect2.top -= 25;
          localRect2.bottom += 25;
        }
      }
      for (Rect localRect1 = localRect2; localRect1.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()); localRect1 = null)
      {
        GMTrace.o(1493306441728L, 11126);
        return true;
      }
      GMTrace.o(1493306441728L, 11126);
      return false;
    }
    GMTrace.o(1493306441728L, 11126);
    return false;
  }
  
  public final boolean cju()
  {
    GMTrace.i(1492232699904L, 11118);
    if (this.xic != null)
    {
      boolean bool = this.xic.isFocusable();
      GMTrace.o(1492232699904L, 11118);
      return bool;
    }
    GMTrace.o(1492232699904L, 11118);
    return false;
  }
  
  public final void cjw()
  {
    GMTrace.i(1495319707648L, 11141);
    if (this.xic != null)
    {
      this.xic.setFocusable(true);
      this.xic.requestFocus();
      ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this.xic, 0);
    }
    GMTrace.o(1495319707648L, 11141);
  }
  
  public final boolean dI(View paramView)
  {
    GMTrace.i(1494917054464L, 11138);
    if (getVisibility() == 0)
    {
      if (bg.mZ(getText()))
      {
        if (paramView != null) {
          paramView.setVisibility(4);
        }
        if (this.jpp != null) {
          this.jpp.setEnabled(true);
        }
        GMTrace.o(1494917054464L, 11138);
        return false;
      }
      if (QR())
      {
        if (paramView != null) {
          paramView.setVisibility(4);
        }
        if (this.jpp != null) {
          this.jpp.setEnabled(true);
        }
        GMTrace.o(1494917054464L, 11138);
        return true;
      }
      if (paramView != null) {
        paramView.setVisibility(0);
      }
      if (this.jpp != null) {
        this.jpp.setEnabled(false);
      }
      GMTrace.o(1494917054464L, 11138);
      return false;
    }
    if (paramView != null) {
      paramView.setVisibility(8);
    }
    GMTrace.o(1494917054464L, 11138);
    return true;
  }
  
  public final KeyListener getKeyListener()
  {
    GMTrace.i(1493843312640L, 11130);
    if (this.xic != null)
    {
      KeyListener localKeyListener = this.xic.getKeyListener();
      GMTrace.o(1493843312640L, 11130);
      return localKeyListener;
    }
    w.w("MicroMsg.WalletFormView", "hy: no content et");
    GMTrace.o(1493843312640L, 11130);
    return null;
  }
  
  public final String getText()
  {
    GMTrace.i(1493709094912L, 11129);
    if (this.xic != null)
    {
      String str = c.a.a(this.xih, this.xic);
      if ((this.xif != null) && (this.xif.aYV()))
      {
        str = this.xif.e(this, str);
        GMTrace.o(1493709094912L, 11129);
        return str;
      }
      GMTrace.o(1493709094912L, 11129);
      return str;
    }
    w.e("MicroMsg.WalletFormView", "hy: no content et. return nil");
    GMTrace.o(1493709094912L, 11129);
    return "";
  }
  
  public final void j(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1494111748096L, 11132);
    this.oSZ = paramOnClickListener;
    if (this.oSV != null) {
      this.oSV.setOnClickListener(this.oSZ);
    }
    GMTrace.o(1494111748096L, 11132);
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(1492366917632L, 11119);
    super.onAttachedToWindow();
    GMTrace.o(1492366917632L, 11119);
  }
  
  protected final void onDetachedFromWindow()
  {
    GMTrace.i(1492501135360L, 11120);
    super.onDetachedFromWindow();
    GMTrace.o(1492501135360L, 11120);
  }
  
  protected final void onFinishInflate()
  {
    GMTrace.i(1492635353088L, 11121);
    super.onFinishInflate();
    cjv();
    if (this.oST != null)
    {
      this.oST.setText(this.oTf);
      this.oST.setVisibility(this.oTg);
    }
    if (this.oSV != null)
    {
      this.oSV.setImageResource(this.oTh);
      this.oSV.setVisibility(this.oTi);
    }
    if (this.oSW != null)
    {
      this.oSW.setText(this.oTj);
      this.oSW.setVisibility(this.oTk);
    }
    Context localContext = getContext();
    if (this.xic != null)
    {
      if (this.xij == 1) {
        this.xic.setTypeface(e.fL(localContext));
      }
      this.xic.setHint(this.oTl);
      this.xic.setGravity(this.oTm);
      this.xic.setTextColor(this.oTn);
      setText(this.oTo);
      b.a(this.xic, this.xii);
      this.xic.setBackgroundResource(this.oTr);
      this.xic.setEnabled(this.oTs);
      this.xic.setFocusable(this.oTu);
      this.xic.setClickable(this.oTt);
      this.xic.setHintTextColor(this.oTx);
      setImeOptions(this.oTw);
      setInputType(this.oTv);
      this.xic.addTextChangedListener(new TextWatcher()
      {
        private boolean oTz;
        
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(1502299029504L, 11193);
          if (WalletFormView.this.QR() != this.oTz)
          {
            if (WalletFormView.i(WalletFormView.this) != null) {
              WalletFormView.i(WalletFormView.this).gQ(WalletFormView.this.QR());
            }
            this.oTz = WalletFormView.this.QR();
          }
          WalletFormView.j(WalletFormView.this);
          GMTrace.o(1502299029504L, 11193);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1502164811776L, 11192);
          GMTrace.o(1502164811776L, 11192);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1502030594048L, 11191);
          GMTrace.o(1502030594048L, 11191);
        }
      });
      this.xic.setOnFocusChangeListener(this);
    }
    aYW();
    if (this.xic != null)
    {
      if (this.oTv != 2) {
        break label374;
      }
      this.xic.setKeyListener(new NumberKeyListener()
      {
        protected final char[] getAcceptedChars()
        {
          GMTrace.i(1498004062208L, 11161);
          GMTrace.o(1498004062208L, 11161);
          return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
        }
        
        public final int getInputType()
        {
          GMTrace.i(1497869844480L, 11160);
          GMTrace.o(1497869844480L, 11160);
          return 3;
        }
      });
    }
    for (;;)
    {
      if (this.oTp != -1) {
        this.xic.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.oTp) });
      }
      if (this.xie != null) {
        this.xie.buT();
      }
      GMTrace.o(1492635353088L, 11121);
      return;
      label374:
      if (this.oTv == 4)
      {
        this.xic.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1481495281664L, 11038);
            GMTrace.o(1481495281664L, 11038);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 120, 88 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1481361063936L, 11037);
            GMTrace.o(1481361063936L, 11037);
            return 1;
          }
        });
      }
      else if (this.oTv == 128)
      {
        this.xic.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.xic.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1496125014016L, 11147);
            GMTrace.o(1496125014016L, 11147);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1495990796288L, 11146);
            GMTrace.o(1495990796288L, 11146);
            return 18;
          }
        });
        this.xic.setRawInputType(18);
      }
      else if (this.oTv == 3)
      {
        this.xic.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1498406715392L, 11164);
            GMTrace.o(1498406715392L, 11164);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 45 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1498272497664L, 11163);
            GMTrace.o(1498272497664L, 11163);
            return 3;
          }
        });
      }
      else
      {
        this.xic.setInputType(this.oTv);
      }
    }
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(1495453925376L, 11142);
    if (this.oSY != null) {
      this.oSY.onFocusChange(this, paramBoolean);
    }
    if (this.xid != null) {
      this.xid.gQ(QR());
    }
    if (!QR()) {
      if (this.jpp != null) {
        this.jpp.setEnabled(false);
      }
    }
    for (;;)
    {
      aYW();
      GMTrace.o(1495453925376L, 11142);
      return;
      if (this.jpp != null) {
        this.jpp.setEnabled(true);
      }
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1493172224000L, 11125);
    if ((this.xie == null) || (!this.xie.a(this, paramMotionEvent)))
    {
      if ((this.xic != null) && (b(this.xic, paramMotionEvent)) && (!this.xic.isClickable()))
      {
        w.d("MicroMsg.WalletFormView", "hy: click on content but content is not clickable. whole view perform click");
        GMTrace.o(1493172224000L, 11125);
        return true;
      }
      if ((b(this.oSV, paramMotionEvent)) && (paramMotionEvent.getAction() == 1))
      {
        w.d("MicroMsg.WalletFormView", "hy: click on info iv");
        aYW();
        this.oSV.performClick();
        GMTrace.o(1493172224000L, 11125);
        return true;
      }
      GMTrace.o(1493172224000L, 11125);
      return false;
    }
    GMTrace.o(1493172224000L, 11125);
    return true;
  }
  
  @SuppressLint({"WrongCall"})
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1493038006272L, 11124);
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(1493038006272L, 11124);
  }
  
  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    GMTrace.i(1495051272192L, 11139);
    if (this.xic != null) {
      this.xic.setFilters(paramArrayOfInputFilter);
    }
    GMTrace.o(1495051272192L, 11139);
  }
  
  public final void setHint(CharSequence paramCharSequence)
  {
    GMTrace.i(1492769570816L, 11122);
    if (this.xic != null) {
      this.xic.setHint(paramCharSequence);
    }
    GMTrace.o(1492769570816L, 11122);
  }
  
  public final void setImeOptions(int paramInt)
  {
    GMTrace.i(1491695828992L, 11114);
    if (this.xic != null) {
      this.xic.setImeOptions(paramInt);
    }
    GMTrace.o(1491695828992L, 11114);
  }
  
  public final void setInputType(int paramInt)
  {
    GMTrace.i(1491830046720L, 11115);
    if (this.xic != null) {
      this.xic.setInputType(paramInt);
    }
    GMTrace.o(1491830046720L, 11115);
  }
  
  public final void setKeyListener(KeyListener paramKeyListener)
  {
    GMTrace.i(1494514401280L, 11135);
    if (this.xic != null) {
      this.xic.setKeyListener(paramKeyListener);
    }
    GMTrace.o(1494514401280L, 11135);
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1493977530368L, 11131);
    super.setOnClickListener(paramOnClickListener);
    GMTrace.o(1493977530368L, 11131);
  }
  
  public final void setOnEditorActionListener(TextView.OnEditorActionListener paramOnEditorActionListener)
  {
    GMTrace.i(1492903788544L, 11123);
    this.xic.setOnEditorActionListener(paramOnEditorActionListener);
    GMTrace.o(1492903788544L, 11123);
  }
  
  public final void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(1494245965824L, 11133);
    this.oSY = paramOnFocusChangeListener;
    GMTrace.o(1494245965824L, 11133);
  }
  
  public final void setSelection(int paramInt)
  {
    GMTrace.i(1493574877184L, 11128);
    if (this.xic != null) {
      this.xic.setSelection(paramInt);
    }
    GMTrace.o(1493574877184L, 11128);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(1491964264448L, 11116);
    if ((this.xic != null) && ((this.xif == null) || (!this.xif.c(this, paramString))))
    {
      this.xic.setText(paramString);
      this.xic.setSelection(getInputLength());
    }
    GMTrace.o(1491964264448L, 11116);
  }
  
  public final void uN(String paramString)
  {
    GMTrace.i(1491427393536L, 11112);
    this.oTd = paramString;
    cjv();
    GMTrace.o(1491427393536L, 11112);
  }
  
  public static abstract interface a
  {
    public abstract void gQ(boolean paramBoolean);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/formview/WalletFormView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */